package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController a;
    public final /* synthetic */ AlertController.OooO0O0 b;

    public a(AlertController.OooO0O0 oooO0O0, AlertController alertController) {
        this.b = oooO0O0;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.m.onClick(this.a.c, i);
        if (this.b.p) {
            return;
        }
        this.a.c.dismiss();
    }
}
