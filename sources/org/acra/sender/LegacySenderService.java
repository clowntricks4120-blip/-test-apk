package org.acra.sender;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Base64;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.p013am.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySenderService extends Service {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        r.n(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        r.n(intent, "intent");
        if (!intent.hasExtra("acraConfig")) {
            j jVar = P.c;
            return 3;
        }
        String stringExtra = intent.getStringExtra("acraConfig");
        Serializable serializable = null;
        if (stringExtra != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(stringExtra, 0)));
                try {
                    Object object = objectInputStream.readObject();
                    if (ivas.gov.bisp.enumeration.aB.r.class.isInstance(object)) {
                        Serializable serializable2 = (Serializable) ivas.gov.bisp.enumeration.aB.r.class.cast(object);
                        ivas.gov.bisp.enumeration.p100w.r.k(objectInputStream, null);
                        serializable = serializable2;
                    } else {
                        ivas.gov.bisp.enumeration.p100w.r.k(objectInputStream, null);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ivas.gov.bisp.enumeration.p100w.r.k(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException | ClassNotFoundException unused) {
            }
        }
        ivas.gov.bisp.enumeration.aB.r rVar = (ivas.gov.bisp.enumeration.aB.r) serializable;
        if (rVar == null) {
            return 3;
        }
        new Thread(new z(this, rVar, intent, 1)).start();
        return 3;
    }
}
