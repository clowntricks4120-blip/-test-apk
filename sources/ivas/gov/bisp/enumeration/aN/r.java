package ivas.gov.bisp.enumeration.aN;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static r a;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper(), new bfd());

    public class bfd implements Handler.Callback {
        public bfd() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            r rVar = r.this;
            bfe bfeVar = (bfe) message.obj;
            synchronized (rVar.b) {
                if (bfeVar == null) {
                    Objects.requireNonNull(bfeVar);
                    throw null;
                }
            }
            return true;
        }
    }

    public static class bfe {
    }
}
