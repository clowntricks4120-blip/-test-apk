package ivas.gov.bisp.enumeration.Z;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends j {
    public int a;
    public int b;
    public LayoutInflater k;

    @Deprecated
    public h(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, z);
        this.b = i;
        this.a = i;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
