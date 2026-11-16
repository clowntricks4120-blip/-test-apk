package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import ivas.gov.bisp.enumeration.C.h;
import ivas.gov.bisp.enumeration.C.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(j jVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        h hVarQ = remoteActionCompat.a;
        if (jVar.c(1)) {
            hVarQ = jVar.q();
        }
        remoteActionCompat.a = (IconCompat) hVarQ;
        CharSequence charSequenceK = remoteActionCompat.b;
        if (jVar.c(2)) {
            charSequenceK = jVar.k();
        }
        remoteActionCompat.b = charSequenceK;
        CharSequence charSequenceK2 = remoteActionCompat.c;
        if (jVar.c(3)) {
            charSequenceK2 = jVar.k();
        }
        remoteActionCompat.c = charSequenceK2;
        remoteActionCompat.d = (PendingIntent) jVar.p(remoteActionCompat.d, 4);
        boolean zH = remoteActionCompat.f;
        if (jVar.c(5)) {
            zH = jVar.h();
        }
        remoteActionCompat.f = zH;
        boolean zH2 = remoteActionCompat.e;
        if (jVar.c(6)) {
            zH2 = jVar.h();
        }
        remoteActionCompat.e = zH2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, j jVar) {
        Objects.requireNonNull(jVar);
        IconCompat iconCompat = remoteActionCompat.a;
        jVar.r(1);
        jVar.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        jVar.r(2);
        jVar.u(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        jVar.r(3);
        jVar.u(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        jVar.r(4);
        jVar.v(pendingIntent);
        boolean z = remoteActionCompat.f;
        jVar.r(5);
        jVar.t(z);
        boolean z2 = remoteActionCompat.e;
        jVar.r(6);
        jVar.t(z2);
    }
}
