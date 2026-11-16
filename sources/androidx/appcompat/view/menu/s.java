package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class s extends BaseAdapter {
    public n a;
    public int b = -1;
    public boolean c;
    public final LayoutInflater d;
    public final boolean e;
    public final int f;

    public s(n nVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.d = layoutInflater;
        this.a = nVar;
        this.f = i;
        b();
    }

    public void b() {
        n nVar = this.a;
        u uVar = nVar.x;
        if (uVar != null) {
            nVar.c();
            ArrayList<u> arrayList = nVar.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == uVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u getItem(int i) {
        ArrayList<u> arrayListN;
        if (this.e) {
            n nVar = this.a;
            nVar.c();
            arrayListN = nVar.k;
        } else {
            arrayListN = this.a.n();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListN.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<u> arrayListN;
        if (this.e) {
            n nVar = this.a;
            nVar.c();
            arrayListN = nVar.k;
        } else {
            arrayListN = this.a.n();
        }
        return this.b < 0 ? arrayListN.size() : arrayListN.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.d.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).c;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.a.p() && i2 != (i3 >= 0 ? getItem(i3).c : i2));
        m.aIE aie = (m.aIE) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aie.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
