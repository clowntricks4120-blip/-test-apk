package ivas.gov.bisp.enumeration.adapters;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.p051bx.l;

/* JADX INFO: loaded from: classes.dex */
public class AdapterMainMenu extends RecyclerView.OooO<ViewHolder> {
    private static int d = 0;
    private static int e = 1;
    public ivas.gov.bisp.enumeration.X.i f;
    public TypedArray g;
    public TypedArray h;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public ImageView imageView;

        @BindView
        public LinearLayout linearLayout;

        @BindView
        public TextView textView;

        public ViewHolder(AdapterMainMenu adapterMainMenu, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.linearLayout = (LinearLayout) u.b(u.c(view, R.id.ll_grid_item, "field 'linearLayout'"), R.id.ll_grid_item, "field 'linearLayout'", LinearLayout.class);
            viewHolder.imageView = (ImageView) u.b(u.c(view, R.id.iv_logo, "field 'imageView'"), R.id.iv_logo, "field 'imageView'", ImageView.class);
            viewHolder.textView = (TextView) u.b(u.c(view, R.id.tv_label, "field 'textView'"), R.id.tv_label, "field 'textView'", TextView.class);
        }
    }

    public AdapterMainMenu(ivas.gov.bisp.enumeration.X.i iVar, TypedArray typedArray, TypedArray typedArray2) {
        this.f = iVar;
        this.h = typedArray;
        this.g = typedArray2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (-2) - (((i2 ^ 68) + ((i2 & 68) << 1)) ^ (-1));
        e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.h.length();
            obj.hashCode();
            throw null;
        }
        int length = this.h.length();
        int i4 = d + 88;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return length;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.super_main_menu_adapter_layout, viewGroup, false));
        int i3 = d;
        int i4 = ((i3 & (-28)) | ((~i3) & 27)) + ((i3 & 27) << 1);
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 & 1;
        int i5 = i3 | 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        e = i6 % 128;
        int i7 = i6 % 2;
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        ImageView imageView = viewHolder.imageView;
        TypedArray typedArray = this.h;
        int i8 = d + 45;
        e = i8 % 128;
        if (i8 % 2 == 0) {
            imageView.setImageResource(typedArray.getResourceId(i, R.mipmap.ic_launcher));
            TextView textView = viewHolder.textView;
            throw null;
        }
        imageView.setImageResource(typedArray.getResourceId(i, R.mipmap.ic_launcher));
        viewHolder.textView.setText(this.g.getString(i));
        LinearLayout linearLayout = viewHolder.linearLayout;
        l lVar = new l(this, i, 1);
        int i9 = e;
        int i10 = (-2) - (((i9 & 56) + (i9 | 56)) ^ (-1));
        d = i10 % 128;
        int i11 = i10 % 2;
        linearLayout.setOnClickListener(lVar);
        int i12 = e;
        int i13 = (i12 & 15) + (i12 | 15);
        d = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
