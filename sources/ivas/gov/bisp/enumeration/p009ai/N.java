package ivas.gov.bisp.enumeration.p009ai;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class N {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    @Deprecated
    public N(Uri uri, int i, int i2, boolean z, int i3) {
        Objects.requireNonNull(uri);
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }
}
