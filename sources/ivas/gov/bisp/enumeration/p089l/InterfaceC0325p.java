package ivas.gov.bisp.enumeration.p089l;

import android.os.Build;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.l.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0325p {
    public static final boolean a;

    static {
        int i = 2 % 2;
        a = Build.VERSION.SDK_INT >= 27;
    }
}
