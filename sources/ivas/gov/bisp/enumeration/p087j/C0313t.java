package ivas.gov.bisp.enumeration.p087j;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.savedstate.b;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.j.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0313t implements b.aIh {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AppCompatActivity c;

    public C0313t(AppCompatActivity appCompatActivity) {
        this.c = appCompatActivity;
    }

    @Override // androidx.savedstate.b.aIh
    public Bundle b() {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        a aVarM = this.c.m();
        int i2 = a + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        aVarM.q(bundle);
        int i4 = a;
        int i5 = (((i4 & (-86)) | ((~i4) & 85)) - (~((i4 & 85) << 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return bundle;
    }
}
