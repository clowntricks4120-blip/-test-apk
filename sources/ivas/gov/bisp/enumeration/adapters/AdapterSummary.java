package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.ActivitySummary;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.p026az.z;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class AdapterSummary extends RecyclerView.OooO<ViewHolder> {
    private static int d = 1;
    private static int e;
    public List<ActivitySummary.OooO00o> f;

    public class ViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public TextView textViewDate;

        @BindView
        public TextView textViewDeclinedCount;

        @BindView
        public TextView textViewLocality;

        @BindView
        public TextView textViewNotAtHomeCount;

        @BindView
        public TextView textViewSupervisorTime;

        @BindView
        public TextView textViewTotalCount;

        public ViewHolder(AdapterSummary adapterSummary, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            viewHolder.textViewDate = (TextView) u.b(u.c(view, R.id.tv_date, "field 'textViewDate'"), R.id.tv_date, "field 'textViewDate'", TextView.class);
            viewHolder.textViewLocality = (TextView) u.b(u.c(view, R.id.tv_locality, "field 'textViewLocality'"), R.id.tv_locality, "field 'textViewLocality'", TextView.class);
            viewHolder.textViewSupervisorTime = (TextView) u.b(u.c(view, R.id.tv_supervisor_time, "field 'textViewSupervisorTime'"), R.id.tv_supervisor_time, "field 'textViewSupervisorTime'", TextView.class);
            viewHolder.textViewTotalCount = (TextView) u.b(u.c(view, R.id.tv_total_count, "field 'textViewTotalCount'"), R.id.tv_total_count, "field 'textViewTotalCount'", TextView.class);
            viewHolder.textViewNotAtHomeCount = (TextView) u.b(u.c(view, R.id.tv_not_at_home_count, "field 'textViewNotAtHomeCount'"), R.id.tv_not_at_home_count, "field 'textViewNotAtHomeCount'", TextView.class);
            viewHolder.textViewDeclinedCount = (TextView) u.b(u.c(view, R.id.tv_declined_count, "field 'textViewDeclinedCount'"), R.id.tv_declined_count, "field 'textViewDeclinedCount'", TextView.class);
        }
    }

    public AdapterSummary(Context context, List<ActivitySummary.OooO00o> list, ivas.gov.bisp.enumeration.X.i iVar) {
        this.f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 3;
        int i4 = -(-(i2 | 3));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        List<ActivitySummary.OooO00o> list = this.f;
        if (i6 != 0) {
            return list.size();
        }
        list.size();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        ViewHolder viewHolder = new ViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.row_summary, viewGroup, false));
        int i3 = e + 97;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return viewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x011c  */
    /* JADX WARN: Code duplicated, block: B:30:0x012b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0149  */
    /* JADX WARN: Code duplicated, block: B:34:0x0156  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        ActivitySummary.OooO00o oooO00o;
        TextView textView;
        String str;
        String str2;
        TextView textView2;
        int i2;
        int i3;
        TextView textView3;
        int i4;
        int i5;
        TextView textView4;
        int i6 = 2 % 2;
        int i7 = d;
        int i8 = (((i7 ^ 63) | (i7 & 63)) << 1) - (((~i7) & 63) | (i7 & (-64)));
        e = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            this.f.get(i);
            obj.hashCode();
            throw null;
        }
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        ActivitySummary.OooO00o oooO00o2 = this.f.get(i);
        int i9 = d + 19;
        e = i9 % 128;
        if (i9 % 2 != 0) {
            oooO00o = oooO00o2;
            textView = viewHolder.textViewDate;
            str = oooO00o.a;
            int i10 = 97 / 0;
        } else {
            oooO00o = oooO00o2;
            textView = viewHolder.textViewDate;
            str = oooO00o.a;
        }
        int i11 = e;
        int i12 = i11 & 1;
        int i13 = (i12 - (~(-(-((i11 ^ 1) | i12))))) - 1;
        d = i13 % 128;
        if (i13 % 2 == 0) {
            textView.setText(z.c("yyyy-MM-dd", "dd-MM-yyyy", str));
            obj.hashCode();
            throw null;
        }
        textView.setText(z.c("yyyy-MM-dd", "dd-MM-yyyy", str));
        TextView textView5 = viewHolder.textViewLocality;
        String str3 = oooO00o.b;
        int i14 = e;
        int i15 = (i14 & (-26)) | ((~i14) & 25);
        int i16 = -(-((i14 & 25) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        d = i17 % 128;
        if (i17 % 2 == 0) {
            textView5.setText(String.valueOf(str3));
            str2 = oooO00o.e;
            int i18 = 49 / 0;
        } else {
            textView5.setText(String.valueOf(str3));
            str2 = oooO00o.e;
        }
        int i19 = e;
        int i20 = (i19 ^ 51) + ((i19 & 51) << 1);
        d = i20 % 128;
        if (i20 % 2 != 0) {
            if (str2 != null) {
                if (!(!str2.equals(BuildConfig.FLAVOR))) {
                    int i21 = d;
                    int i22 = (((i21 | 117) << 1) - (~(-(i21 ^ 117)))) - 1;
                    e = i22 % 128;
                    int i23 = i22 % 2;
                    String str4 = oooO00o.e.split(" ")[0];
                    TextView textView6 = viewHolder.textViewSupervisorTime;
                    int i24 = e + 51;
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    textView6.setText(z.c("yyyy-MM-dd", "dd-MM-yyyy", str4));
                    int i26 = d;
                    int i27 = (((i26 ^ 53) | (i26 & 53)) << 1) - (((~i26) & 53) | (i26 & (-54)));
                    e = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            textView2 = viewHolder.textViewTotalCount;
            i2 = oooO00o.c;
            int i29 = d;
            int i30 = i29 & 43;
            i3 = (i30 - (~(-(-((i29 ^ 43) | i30))))) - 1;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                textView2.setText(String.valueOf(i2));
                textView3 = viewHolder.textViewNotAtHomeCount;
                i4 = oooO00o.f;
                int i31 = 21 / 0;
            } else {
                textView2.setText(String.valueOf(i2));
                textView3 = viewHolder.textViewNotAtHomeCount;
                i4 = oooO00o.f;
            }
            int i32 = d;
            int i33 = i32 & 93;
            i5 = (i33 - (~(-(-((i32 ^ 93) | i33))))) - 1;
            e = i5 % 128;
            if (i5 % 2 != 0) {
                textView3.setText(String.valueOf(i4));
                textView4 = viewHolder.textViewDeclinedCount;
                int i34 = 27 / 0;
            } else {
                textView3.setText(String.valueOf(i4));
                textView4 = viewHolder.textViewDeclinedCount;
            }
            textView4.setText(String.valueOf(oooO00o.d));
            int i35 = d;
            int i36 = i35 & 49;
            int i37 = ((i35 | 49) & (~i36)) + (i36 << 1);
            e = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = 21 / 0;
        if (str2 != null) {
            if (!(!str2.equals(BuildConfig.FLAVOR))) {
                int i210 = d;
                int i211 = (((i210 | 117) << 1) - (~(-(i210 ^ 117)))) - 1;
                e = i211 % 128;
                int i212 = i211 % 2;
                String str5 = oooO00o.e.split(" ")[0];
                TextView textView7 = viewHolder.textViewSupervisorTime;
                int i213 = e + 51;
                d = i213 % 128;
                int i214 = i213 % 2;
                textView7.setText(z.c("yyyy-MM-dd", "dd-MM-yyyy", str5));
                int i215 = d;
                int i216 = (((i215 ^ 53) | (i215 & 53)) << 1) - (((~i215) & 53) | (i215 & (-54)));
                e = i216 % 128;
                int i217 = i216 % 2;
            }
        }
        textView2 = viewHolder.textViewTotalCount;
        i2 = oooO00o.c;
        int i218 = d;
        int i310 = i218 & 43;
        i3 = (i310 - (~(-(-((i218 ^ 43) | i310))))) - 1;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            textView2.setText(String.valueOf(i2));
            textView3 = viewHolder.textViewNotAtHomeCount;
            i4 = oooO00o.f;
            int i311 = 21 / 0;
        } else {
            textView2.setText(String.valueOf(i2));
            textView3 = viewHolder.textViewNotAtHomeCount;
            i4 = oooO00o.f;
        }
        int i312 = d;
        int i313 = i312 & 93;
        i5 = (i313 - (~(-(-((i312 ^ 93) | i313))))) - 1;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            textView3.setText(String.valueOf(i4));
            textView4 = viewHolder.textViewDeclinedCount;
            int i314 = 27 / 0;
        } else {
            textView3.setText(String.valueOf(i4));
            textView4 = viewHolder.textViewDeclinedCount;
        }
        textView4.setText(String.valueOf(oooO00o.d));
        int i315 = d;
        int i316 = i315 & 49;
        int i317 = ((i315 | 49) & (~i316)) + (i316 << 1);
        e = i317 % 128;
        int i318 = i317 % 2;
        viewHolder.textViewSupervisorTime.setText("-");
        int i40 = d + 63;
        e = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 3 / 3;
        }
        textView2 = viewHolder.textViewTotalCount;
        i2 = oooO00o.c;
        int i219 = d;
        int i319 = i219 & 43;
        i3 = (i319 - (~(-(-((i219 ^ 43) | i319))))) - 1;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            textView2.setText(String.valueOf(i2));
            textView3 = viewHolder.textViewNotAtHomeCount;
            i4 = oooO00o.f;
            int i3110 = 21 / 0;
        } else {
            textView2.setText(String.valueOf(i2));
            textView3 = viewHolder.textViewNotAtHomeCount;
            i4 = oooO00o.f;
        }
        int i3111 = d;
        int i3112 = i3111 & 93;
        i5 = (i3112 - (~(-(-((i3111 ^ 93) | i3112))))) - 1;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            textView3.setText(String.valueOf(i4));
            textView4 = viewHolder.textViewDeclinedCount;
            int i3113 = 27 / 0;
        } else {
            textView3.setText(String.valueOf(i4));
            textView4 = viewHolder.textViewDeclinedCount;
        }
        textView4.setText(String.valueOf(oooO00o.d));
        int i3114 = d;
        int i3115 = i3114 & 49;
        int i3116 = ((i3114 | 49) & (~i3115)) + (i3115 << 1);
        e = i3116 % 128;
        int i3117 = i3116 % 2;
    }
}
