package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import ivas.gov.bisp.enumeration.J.I;
import ivas.gov.bisp.enumeration.J.aE;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int a = 0;
    public final HashMap<Integer, String> b = new HashMap<>();
    public final RemoteCallbackList<aE> c = new OooO00o();
    public final I d = new OooO0O0();

    public class OooO00o extends RemoteCallbackList<aE> {
        public OooO00o() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class OooO0O0 extends I {
        public OooO0O0() {
        }

        public void b(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                try {
                    String str = MultiInstanceInvalidationService.this.b.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.c.beginBroadcast();
                    for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                        try {
                            int iIntValue = ((Integer) MultiInstanceInvalidationService.this.c.getBroadcastCookie(i2)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.b.get(Integer.valueOf(iIntValue));
                            if (i != iIntValue && str.equals(str2)) {
                                try {
                                    ((aE) MultiInstanceInvalidationService.this.c.getBroadcastItem(i2)).b(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.c.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.c.finishBroadcast();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public int c(aE aEVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i;
                if (multiInstanceInvalidationService.c.register(aEVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.b.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.a--;
                return 0;
            }
        }

        public void d(aE aEVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService.this.c.unregister(aEVar);
                MultiInstanceInvalidationService.this.b.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }
}
