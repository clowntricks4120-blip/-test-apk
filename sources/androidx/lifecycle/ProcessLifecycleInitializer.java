package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import ivas.gov.bisp.enumeration.o00Oo0.OooOO0O;
import ivas.gov.bisp.enumeration.p027b.af;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements OooOO0O<ivas.gov.bisp.enumeration.p027b.d> {
    public final List<Class<? extends OooOO0O<?>>> b() {
        return Collections.emptyList();
    }

    public final Object create(Context context) {
        if (!af.c.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new af.aZi());
        }
        g gVar = g.a;
        Objects.requireNonNull(gVar);
        gVar.f = new Handler();
        gVar.h.j(d.aLZ.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new h(gVar));
        return gVar;
    }
}
