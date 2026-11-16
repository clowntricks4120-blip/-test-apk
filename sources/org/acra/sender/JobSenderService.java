package org.acra.sender;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Base64;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p053bz.N;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.acra.sender.JobSenderService;

/* JADX INFO: loaded from: classes.dex */
public final class JobSenderService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        r.n(jobParameters, "params");
        final PersistableBundle extras = jobParameters.getExtras();
        r.m(extras, "params.extras");
        String string = extras.getString("acraConfig");
        Serializable serializable = null;
        if (string != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0)));
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
        final ivas.gov.bisp.enumeration.aB.r rVar = (ivas.gov.bisp.enumeration.aB.r) serializable;
        if (rVar == null) {
            return true;
        }
        new Thread(new Runnable() { // from class: ivas.gov.bisp.enumeration.cg.j
            private static int a = 1;
            private static int b;

            @Override // java.lang.Runnable
            public final void run() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = ((i2 | 65) << 1) - (((~i2) & 65) | (i2 & (-66)));
                int i4 = i3 % 128;
                b = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                JobSenderService jobSenderService = this.c;
                ivas.gov.bisp.enumeration.aB.r rVar2 = rVar;
                PersistableBundle persistableBundle = extras;
                int i5 = i4 & 83;
                int i6 = (((i4 ^ 83) | i5) << 1) - ((i4 | 83) & (~i5));
                a = i6 % 128;
                int i7 = i6 % 2;
                JobParameters jobParameters2 = jobParameters;
                int i8 = JobSenderService.a;
                int i9 = b;
                int i10 = ((i9 & (-84)) | ((~i9) & 83)) + ((i9 & 83) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                r.n(jobSenderService, "this$0");
                r.n(persistableBundle, "$extras");
                if (i11 == 0) {
                    int i12 = 28 / 0;
                }
                r.n(jobParameters2, "$params");
                new N(jobSenderService, rVar2).f(false, new Bundle(persistableBundle));
                int i13 = a;
                int i14 = i13 & 115;
                int i15 = ((i13 ^ 115) | i14) << 1;
                int i16 = -((i13 | 115) & (~i14));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                b = i17 % 128;
                int i18 = i17 % 2;
                jobSenderService.jobFinished(jobParameters2, false);
            }
        }).start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        r.n(jobParameters, "params");
        return true;
    }
}
