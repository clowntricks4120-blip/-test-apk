package ivas.gov.bisp.enumeration.p027b;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class an {
    public final HashMap<String, ap> a = new HashMap<>();

    public final void c() {
        for (ap apVar : this.a.values()) {
            apVar.d = true;
            Map<String, Object> map = apVar.c;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : apVar.c.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            apVar.c();
        }
        this.a.clear();
    }
}
