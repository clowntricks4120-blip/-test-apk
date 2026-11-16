package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.ActivityQRCodeInfo;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.p026az.z;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AdapterQrCodeDetail extends RecyclerView.OooO<ViewHolder> {
    private static int d = 1;
    private static int e;
    public List<ActivityQRCodeInfo.OooO00o> f;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public TextView textViewDate;

        @BindView
        public TextView textViewLocality;

        @BindView
        public TextView textViewQRCode;

        public ViewHolder(AdapterQrCodeDetail adapterQrCodeDetail, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.textViewDate = (TextView) u.b(u.c(view, R.id.tv_date, "field 'textViewDate'"), R.id.tv_date, "field 'textViewDate'", TextView.class);
            viewHolder.textViewLocality = (TextView) u.b(u.c(view, R.id.tv_locality, "field 'textViewLocality'"), R.id.tv_locality, "field 'textViewLocality'", TextView.class);
            viewHolder.textViewQRCode = (TextView) u.b(u.c(view, R.id.tv_qr_code, "field 'textViewQRCode'"), R.id.tv_qr_code, "field 'textViewQRCode'", TextView.class);
        }
    }

    public AdapterQrCodeDetail(Context context, List<ActivityQRCodeInfo.OooO00o> list, ivas.gov.bisp.enumeration.X.i iVar) {
        this.f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 | 5;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 5)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        e = i6 % 128;
        int i7 = i6 % 2;
        int size = this.f.size();
        int i8 = e + 27;
        d = i8 % 128;
        int i9 = i8 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_qr_code_detail, viewGroup, false));
        int i3 = e;
        int i4 = i3 & 119;
        int i5 = -(-((i3 ^ 119) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return viewHolder;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 & 19) + (i3 | 19);
        e = i4 % 128;
        int i5 = i4 % 2;
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        ActivityQRCodeInfo.OooO00o oooO00o = this.f.get(i);
        TextView textView = viewHolder.textViewDate;
        StringBuilder sb = new StringBuilder();
        int i6 = d;
        int i7 = (i6 ^ 47) + ((i6 & 47) << 1);
        e = i7 % 128;
        if (i7 % 2 != 0) {
            sb.append(oooO00o.a);
            int i8 = 25 / 0;
        } else {
            sb.append(oooO00o.a);
        }
        sb.append(" ");
        sb.append(oooO00o.d);
        int i9 = d;
        int i10 = (i9 & 77) + (i9 | 77);
        e = i10 % 128;
        if (i10 % 2 != 0) {
            textView.setText(z.c("yyyy-MM-dd HH:mm:ss", "dd-MM-yyyy HH:mm:ss", sb.toString()));
            int i11 = 41 / 0;
        } else {
            textView.setText(z.c("yyyy-MM-dd HH:mm:ss", "dd-MM-yyyy HH:mm:ss", sb.toString()));
        }
        TextView textView2 = viewHolder.textViewLocality;
        String strValueOf = String.valueOf(oooO00o.b);
        int i12 = d;
        int i13 = ((i12 | 59) << 1) - (i12 ^ 59);
        e = i13 % 128;
        int i14 = i13 % 2;
        textView2.setText(strValueOf);
        TextView textView3 = viewHolder.textViewQRCode;
        String strValueOf2 = String.valueOf(oooO00o.c);
        int i15 = d;
        int i16 = ((i15 | 109) << 1) - (i15 ^ 109);
        e = i16 % 128;
        int i17 = i16 % 2;
        textView3.setText(strValueOf2);
        int i18 = e + 65;
        d = i18 % 128;
        int i19 = i18 % 2;
    }
}
