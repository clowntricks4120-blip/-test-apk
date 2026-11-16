package org.acra.startup;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.p062ch.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class UnapprovedStartupProcessor implements StartupProcessor {

    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Objects.requireNonNull((p) t);
            throw null;
        }
    }

    @Override // org.acra.startup.StartupProcessor, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.startup.StartupProcessor
    public void processReports(Context context, r rVar, List<p> list) {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(list, "reports");
        if (rVar.j) {
            ArrayList arrayList = new ArrayList();
            for (p pVar : list) {
                Objects.requireNonNull(pVar);
                arrayList.add(pVar);
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    OooO00o oooO00o = new OooO00o();
                    if (arrayList.size() > 1) {
                        Collections.sort(arrayList, oooO00o);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size - 1; i++) {
                    Objects.requireNonNull((p) arrayList.get(i));
                }
                Objects.requireNonNull((p) arrayList.get(arrayList.size() - 1));
            }
        }
    }
}
