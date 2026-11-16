package ivas.gov.bisp.enumeration.p025ay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.models.RosterItem;

/* JADX INFO: loaded from: classes.dex */
public class az implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ aI.brx c;
    public final /* synthetic */ RosterItem d;
    public final /* synthetic */ int e;
    public final /* synthetic */ aI f;

    public az(aI aIVar, aI.brx brxVar, RosterItem rosterItem, int i) {
        this.f = aIVar;
        this.c = brxVar;
        this.d = rosterItem;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        b bVarB;
        View viewFindViewById;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 7) + (i2 | 7);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.C.getVisibility();
            throw null;
        }
        aI aIVar = this.f;
        if (this.c.C.getVisibility() == 0) {
            int i4 = a;
            int i5 = i4 & 91;
            int i6 = (i4 | 91) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = b;
            int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        long j = this.d.getrId();
        int i13 = this.e;
        b.aIz aiz = new b.aIz(aIVar.f);
        int i14 = b;
        int i15 = (i14 & 86) + (i14 | 86);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        View viewInflate = aIVar.f.getLayoutInflater().inflate(R.layout.delete_custom_dialog, (ViewGroup) null);
        int i18 = b;
        int i19 = (i18 & 53) + (i18 | 53);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            aiz.c(viewInflate);
            bVarB = aiz.b();
            bVarB.show();
            viewFindViewById = viewInflate.findViewById(R.id.tv_heading);
            int i20 = 27 / 0;
        } else {
            aiz.c(viewInflate);
            bVarB = aiz.b();
            bVarB.show();
            viewFindViewById = viewInflate.findViewById(R.id.tv_heading);
        }
        View view2 = viewFindViewById;
        b bVar = bVarB;
        ((TextView) viewInflate.findViewById(R.id.tv_message)).setText("Do You want to delete roster");
        int i21 = a;
        int i22 = (i21 & 123) + (i21 | 123);
        b = i22 % 128;
        int i23 = i22 % 2;
        ((TextView) view2).setText("Alert");
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView.setOnClickListener(new aA(aIVar, z, i13, j, bVar));
        textView2.setOnClickListener(new aD(aIVar, bVar));
        int i24 = a;
        int i25 = i24 & 103;
        int i26 = (i24 | 103) & (~i25);
        int i27 = i25 << 1;
        int i28 = (i26 & i27) + (i26 | i27);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
    }
}
