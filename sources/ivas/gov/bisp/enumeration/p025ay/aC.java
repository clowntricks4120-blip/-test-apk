package ivas.gov.bisp.enumeration.p025ay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class aC implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ RosterItem c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aT e;

    public aC(aT aTVar, RosterItem rosterItem, int i) {
        this.e = aTVar;
        this.c = rosterItem;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        aT aTVar = this.e;
        long j = this.c.getrId();
        int i2 = this.d;
        b.aIz aiz = new b.aIz(aTVar.f);
        int i3 = b;
        int i4 = (i3 ^ 50) + ((i3 & 50) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        View viewInflate = aTVar.f.getLayoutInflater().inflate(R.layout.delete_custom_dialog, (ViewGroup) null);
        int i7 = b;
        int i8 = i7 & 3;
        int i9 = -(-((i7 ^ 3) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            aiz.c(viewInflate);
            aiz.b().show();
            viewInflate.findViewById(R.id.tv_heading);
            obj.hashCode();
            throw null;
        }
        aiz.c(viewInflate);
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        ((TextView) viewInflate.findViewById(R.id.tv_message)).setText("Do You want to delete roster");
        int i11 = a;
        int i12 = (i11 & 77) + (i11 | 77);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            textView.setText("Alert");
            throw null;
        }
        textView.setText("Alert");
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView2.setOnClickListener(new aV(aTVar, j, i2, bVarB));
        textView3.setOnClickListener(new aL(aTVar, bVarB));
        int i13 = a;
        int i14 = ((i13 | 111) << 1) - (i13 ^ 111);
        b = i14 % 128;
        int i15 = i14 % 2;
    }
}
