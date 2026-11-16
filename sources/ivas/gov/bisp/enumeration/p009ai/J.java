package ivas.gov.bisp.enumeration.p009ai;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.Oooo0o0.o00oO0o;
import ivas.gov.bisp.enumeration.p010aj.Q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class J implements o00oO0o<x.aVW> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;

    public J(String str) {
        this.c = str;
    }

    public /* synthetic */ void b(Object obj) {
        int i = 2 % 2;
        int i2 = b + 71;
        a = i2 % 128;
        int i3 = i2 % 2;
        d((x.aVW) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public void d(x.aVW avw) {
        synchronized (x.e) {
            OooOOOO<String, ArrayList<o00oO0o<x.aVW>>> oooOOOO = x.f;
            ArrayList arrayList = (ArrayList) oooOOOO.get(this.c);
            if (arrayList == null) {
                return;
            }
            oooOOOO.remove(this.c);
            int i = 0;
            while (i < arrayList.size()) {
                ((Q) arrayList.get(i)).b(avw);
                int i2 = i & (-79);
                int i3 = (i | (-79)) & (~i2);
                int i4 = -(-(i2 << 1));
                i = (i3 & i4) + (i3 | i4) + 80;
            }
        }
    }
}
