package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.DuplicateCnic;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0182k implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public ViewOnClickListenerC0182k(DuplicateCnic duplicateCnic, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 75;
        int i4 = -(-((i2 & 75) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.dismiss();
        int i7 = a;
        int i8 = (-2) - (((i7 & 26) + (i7 | 26)) ^ (-1));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }
}
