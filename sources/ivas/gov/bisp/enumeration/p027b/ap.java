package ivas.gov.bisp.enumeration.p027b;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ap {
    private static int a = 1;
    private static int b;
    public final Map<String, Object> c = new HashMap();
    public volatile boolean d = false;

    public void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
    }

    public <T> T d(String str, T t) {
        Object obj;
        synchronized (this.c) {
            obj = this.c.get(str);
            if (obj == null) {
                this.c.put(str, t);
            }
        }
        if (obj != null) {
            t = (T) obj;
        }
        if (this.d && (t instanceof Closeable)) {
            try {
                t.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }
}
