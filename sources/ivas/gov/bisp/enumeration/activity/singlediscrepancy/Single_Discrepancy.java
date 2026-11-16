package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.utils.SessionManager;

/* JADX INFO: loaded from: classes.dex */
public class Single_Discrepancy extends BaseTouch {
    private static int p = 1;
    private static int q;
    public ImageView ac;
    public CardView ad;
    public CardView ae;
    public CardView af;
    public CardView ag;
    public CardView ah;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((((i2 ^ 67) | (i2 & 67)) << 1) - (~(-((i2 & (-68)) | ((~i2) & 67))))) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 & 108) + (i2 | 108);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        q = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 35 / 0;
        }
        return R.layout.activity_single_discrepancy;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        this.h.c();
        Intent intent = new Intent(this, (Class<?>) DashboardActivity.class);
        int i2 = q;
        int i3 = (i2 | 43) << 1;
        int i4 = -(i2 ^ 43);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        p = i5 % 128;
        int i6 = i5 % 2;
        startActivity(intent);
        finishAffinity();
        int i7 = p;
        int i8 = ((i7 | 9) << 1) - (i7 ^ 9);
        q = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 81;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i4 = q;
            int i5 = (i4 & (-120)) | ((~i4) & 119);
            int i6 = -(-((i4 & 119) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            p = i7 % 128;
            int i8 = i7 % 2;
            onBackPressed();
            if (i8 == 0) {
                int i9 = 70 / 0;
            }
        }
        int i10 = q;
        int i11 = i10 & 61;
        int i12 = i10 | 61;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        p = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        new ProgressDialog(this);
        new SessionManager(this);
        int i2 = p;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        if (i5 % 2 != 0) {
            this.ac = (ImageView) findViewById(R.id.iv_back);
            throw null;
        }
        this.ac = (ImageView) findViewById(R.id.iv_back);
        this.ad = (CardView) findViewById(R.id.cv_disability_info);
        this.ae = (CardView) findViewById(R.id.cv_gender_update);
        View viewFindViewById = findViewById(R.id.cv_marital_info);
        int i6 = q + 1;
        p = i6 % 128;
        int i7 = i6 % 2;
        this.af = (CardView) viewFindViewById;
        this.ag = (CardView) findViewById(R.id.cv_dob_info);
        int i8 = q + 89;
        p = i8 % 128;
        int i9 = i8 % 2;
        this.ah = (CardView) findViewById(R.id.cv_roster_family_update);
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        int i10 = q;
        int i11 = i10 & 55;
        int i12 = i11 + ((i10 ^ 55) | i11);
        p = i12 % 128;
        if (i12 % 2 == 0) {
            textView.setText("v7.6 (LIVE)");
            this.ac.setOnClickListener(this);
            this.ad.setOnClickListener(this);
            throw null;
        }
        textView.setText("v7.6 (LIVE)");
        this.ac.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.ae.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        int i13 = p;
        int i14 = i13 & 119;
        int i15 = (((i13 ^ 119) | i14) << 1) - ((i13 | 119) & (~i14));
        q = i15 % 128;
        if (i15 % 2 != 0) {
            this.ah.setOnClickListener(this);
            throw null;
        }
        this.ah.setOnClickListener(this);
        int i16 = p + 77;
        q = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
