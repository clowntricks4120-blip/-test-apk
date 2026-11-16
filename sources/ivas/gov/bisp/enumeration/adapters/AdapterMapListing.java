package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.databaseModels.Villagemaps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdapterMapListing extends RecyclerView.OooO<ViewHolder> {
    private static int d = 1;
    private static int e;
    public ArrayList<Villagemaps> f;
    public ivas.gov.bisp.enumeration.X.i g;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public LinearLayout mLlRoot;

        @BindView
        public TextView mTvName;

        public ViewHolder(AdapterMapListing adapterMapListing, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.mTvName = (TextView) u.b(u.c(view, R.id.tv_name, "field 'mTvName'"), R.id.tv_name, "field 'mTvName'", TextView.class);
            viewHolder.mLlRoot = (LinearLayout) u.b(u.c(view, R.id.ll_root, "field 'mLlRoot'"), R.id.ll_root, "field 'mLlRoot'", LinearLayout.class);
        }
    }

    public AdapterMapListing(Context context, ArrayList<Villagemaps> arrayList, ivas.gov.bisp.enumeration.X.i iVar) {
        this.f = arrayList;
        this.g = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (((i2 & (-114)) | ((~i2) & 113)) - (~(-(-((i2 & 113) << 1))))) - 1;
        e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f.size();
            obj.hashCode();
            throw null;
        }
        int size = this.f.size();
        int i4 = d;
        int i5 = i4 & 117;
        int i6 = ((i4 | 117) & (~i5)) + (i5 << 1);
        e = i6 % 128;
        if (i6 % 2 == 0) {
            return size;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_map_listing, viewGroup, false));
        int i3 = e;
        int i4 = (i3 & 1) + (i3 | 1);
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return viewHolder;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        LinearLayout linearLayout;
        int i2 = 2 % 2;
        int i3 = (-2) - ((e + 22) ^ (-1));
        d = i3 % 128;
        int i4 = i3 % 2;
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        TextView textView = viewHolder.mTvName;
        ArrayList<Villagemaps> arrayList = this.f;
        int i5 = d;
        int i6 = ((i5 | 5) << 1) - (i5 ^ 5);
        e = i6 % 128;
        if (i6 % 2 != 0) {
            textView.setText(arrayList.get(i).getFileName());
            linearLayout = viewHolder.mLlRoot;
            int i7 = 66 / 0;
        } else {
            textView.setText(arrayList.get(i).getFileName());
            linearLayout = viewHolder.mLlRoot;
        }
        linearLayout.setOnClickListener(new ivas.gov.bisp.enumeration.p051bx.u(this, i, 1));
        int i8 = d;
        int i9 = i8 & 99;
        int i10 = (i8 ^ 99) | i9;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        e = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
    }
}
