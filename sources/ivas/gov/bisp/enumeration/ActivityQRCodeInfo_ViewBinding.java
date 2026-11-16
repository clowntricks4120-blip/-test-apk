package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ActivityQRCodeInfo_ViewBinding implements Unbinder {

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityQRCodeInfo c;

        public OooO00o(ActivityQRCodeInfo_ViewBinding activityQRCodeInfo_ViewBinding, ActivityQRCodeInfo activityQRCodeInfo) {
            this.c = activityQRCodeInfo;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 101;
            int i4 = (i2 ^ 101) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            this.c.fromDate(view);
            if (i6 == 0) {
                int i7 = 69 / 0;
            }
            int i8 = a;
            int i9 = ((i8 & (-44)) | ((~i8) & 43)) + ((i8 & 43) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooO0O0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityQRCodeInfo c;

        public OooO0O0(ActivityQRCodeInfo_ViewBinding activityQRCodeInfo_ViewBinding, ActivityQRCodeInfo activityQRCodeInfo) {
            this.c = activityQRCodeInfo;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 & 84) + (i2 | 84)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.toDate(view);
            int i5 = b;
            int i6 = (i5 & 105) + (i5 | 105);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
        }
    }

    public class OooO0OO extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ActivityQRCodeInfo c;

        public OooO0OO(ActivityQRCodeInfo_ViewBinding activityQRCodeInfo_ViewBinding, ActivityQRCodeInfo activityQRCodeInfo) {
            this.c = activityQRCodeInfo;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 67) << 1) - (~(-(((~i2) & 67) | (i2 & (-68)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c.onSearchClick(view);
            int i5 = b;
            int i6 = i5 & 123;
            int i7 = i6 + ((i5 ^ 123) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public ActivityQRCodeInfo_ViewBinding(ActivityQRCodeInfo activityQRCodeInfo, View view) {
        View viewC = u.c(view, R.id.tv_from_date, "field 'textViewFromDate' and method 'fromDate'");
        activityQRCodeInfo.textViewFromDate = (TextView) u.b(viewC, R.id.tv_from_date, "field 'textViewFromDate'", TextView.class);
        viewC.setOnClickListener(new OooO00o(this, activityQRCodeInfo));
        View viewC2 = u.c(view, R.id.tv_to_date, "field 'textViewToDate' and method 'toDate'");
        activityQRCodeInfo.textViewToDate = (TextView) u.b(viewC2, R.id.tv_to_date, "field 'textViewToDate'", TextView.class);
        viewC2.setOnClickListener(new OooO0O0(this, activityQRCodeInfo));
        activityQRCodeInfo.recyclerViewQR = (RecyclerView) u.b(u.c(view, R.id.rv_qr_detail, "field 'recyclerViewQR'"), R.id.rv_qr_detail, "field 'recyclerViewQR'", RecyclerView.class);
        activityQRCodeInfo.textViewNoQR = (TextView) u.b(u.c(view, R.id.tv_no_qr, "field 'textViewNoQR'"), R.id.tv_no_qr, "field 'textViewNoQR'", TextView.class);
        activityQRCodeInfo.linearLayoutQR = (LinearLayout) u.b(u.c(view, R.id.ll_qr_detail, "field 'linearLayoutQR'"), R.id.ll_qr_detail, "field 'linearLayoutQR'", LinearLayout.class);
        activityQRCodeInfo.textViewDate = (TextView) u.b(u.c(view, R.id.tv_date, "field 'textViewDate'"), R.id.tv_date, "field 'textViewDate'", TextView.class);
        activityQRCodeInfo.textViewLocality = (TextView) u.b(u.c(view, R.id.tv_locality, "field 'textViewLocality'"), R.id.tv_locality, "field 'textViewLocality'", TextView.class);
        activityQRCodeInfo.textViewQRCode = (TextView) u.b(u.c(view, R.id.tv_qr_code, "field 'textViewQRCode'"), R.id.tv_qr_code, "field 'textViewQRCode'", TextView.class);
        u.c(view, R.id.btn_search, "method 'onSearchClick'").setOnClickListener(new OooO0OO(this, activityQRCodeInfo));
    }
}
