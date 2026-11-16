package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ivas.gov.bisp.enumeration.D.u;
import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public u a = new OooO00o();

    public class OooO00o extends u {
        public OooO00o() {
        }
    }

    public abstract void b(a aVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
