package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final HashMap<ComponentName, OooOO0O> a = new HashMap<>();
    public OooO0O0 b;
    public OooOO0O c;
    public OooO00o d;
    public final ArrayList<OooO0o> e;
    public boolean f = false;

    public interface OooO {
        void b();

        Intent getIntent();
    }

    public final class OooO00o extends AsyncTask<Void, Void, Void> {
        public OooO00o() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            OooO0o oooO0oRemove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                OooO0O0 oooO0O0 = jobIntentService.b;
                if (oooO0O0 != null) {
                    OooOO0 oooOO0 = (OooOO0) oooO0O0;
                    synchronized (oooOO0.b) {
                        JobParameters jobParameters = oooOO0.c;
                        if (jobParameters != null) {
                            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                            if (jobWorkItemDequeueWork != null) {
                                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(oooOO0.a.getClassLoader());
                                oooO0oRemove = oooOO0.new OooO00o(jobWorkItemDequeueWork);
                            }
                        }
                    }
                } else {
                    synchronized (jobIntentService.e) {
                        oooO0oRemove = jobIntentService.e.size() > 0 ? jobIntentService.e.remove(0) : null;
                    }
                }
                if (oooO0oRemove == null) {
                    return null;
                }
                JobIntentService.this.d(oooO0oRemove.getIntent());
                oooO0oRemove.b();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.e();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.e();
        }
    }

    public interface OooO0O0 {
    }

    public static final class OooO0OO extends OooOO0O {
        public final PowerManager.WakeLock a;
        public final PowerManager.WakeLock b;
        public boolean c;

        public OooO0OO(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, sb.toString());
            this.a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, sb2.toString());
            this.b = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.OooOO0O
        public final void b() {
            synchronized (this) {
                if (this.c) {
                    this.c = false;
                    this.b.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.OooOO0O
        public final void c() {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    this.b.acquire(600000L);
                    this.a.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.OooOO0O
        public final void d() {
            synchronized (this) {
            }
        }
    }

    public final class OooO0o implements OooO {
        public final Intent a;
        public final int b;

        public OooO0o(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // androidx.core.app.JobIntentService.OooO
        public final void b() {
            JobIntentService.this.stopSelf(this.b);
        }

        @Override // androidx.core.app.JobIntentService.OooO
        public final Intent getIntent() {
            return this.a;
        }
    }

    public static final class OooOO0 extends JobServiceEngine implements OooO0O0 {
        public final JobIntentService a;
        public final Object b;
        public JobParameters c;

        public final class OooO00o implements OooO {
            public final JobWorkItem a;

            public OooO00o(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.OooO
            public final void b() {
                synchronized (OooOO0.this.b) {
                    JobParameters jobParameters = OooOO0.this.c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.OooO
            public final Intent getIntent() {
                return this.a.getIntent();
            }
        }

        public OooOO0(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.b = new Object();
            this.a = jobIntentService;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            OooO00o oooO00o = this.a.d;
            if (oooO00o != null) {
                oooO00o.cancel(false);
            }
            synchronized (this.b) {
                this.c = null;
            }
            return true;
        }
    }

    public static abstract class OooOO0O {
        public OooOO0O(ComponentName componentName) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        } else {
            this.e = new ArrayList<>();
        }
    }

    public void c(boolean z) {
        if (this.d == null) {
            this.d = new OooO00o();
            OooOO0O oooOO0O = this.c;
            if (oooOO0O != null && z) {
                oooOO0O.c();
            }
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void d(Intent intent);

    public void e() {
        ArrayList<OooO0o> arrayList = this.e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.d = null;
                ArrayList<OooO0o> arrayList2 = this.e;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    c(false);
                } else if (!this.f) {
                    this.c.b();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        OooO0O0 oooO0O0 = this.b;
        if (oooO0O0 != null) {
            return ((OooOO0) oooO0O0).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.b = new OooOO0(this);
            this.c = null;
            return;
        }
        this.b = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, OooOO0O> map = a;
        OooOO0O oooO0OO = map.get(componentName);
        if (oooO0OO == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            oooO0OO = new OooO0OO(this, componentName);
            map.put(componentName, oooO0OO);
        }
        this.c = oooO0OO;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<OooO0o> arrayList = this.e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.c.b();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.e == null) {
            return 2;
        }
        this.c.d();
        synchronized (this.e) {
            ArrayList<OooO0o> arrayList = this.e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new OooO0o(intent, i2));
            c(true);
        }
        return 3;
    }
}
