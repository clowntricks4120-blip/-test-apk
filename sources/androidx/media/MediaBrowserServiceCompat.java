package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import ivas.gov.bisp.enumeration.p000a.C0030p;
import ivas.gov.bisp.enumeration.p000a.u;
import ivas.gov.bisp.enumeration.p000a.z;
import ivas.gov.bisp.enumeration.p001aa.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean a = Log.isLoggable("MBServiceCompat", 3);
    public OooO0O0 b;
    public final ivas.gov.bisp.enumeration.OooOOoo.OooO0o<IBinder, OooO00o> c = new r();
    public final OooOo00 d = new OooOo00(this);

    public class OooO extends OooO0o implements j.aMp {

        public class OooO00o extends OooOO0O<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ j.aMD e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO oooO, Object obj, j.aMD amd) {
                super(obj);
                this.e = amd;
            }
        }

        public OooO() {
            super();
        }

        @Override // androidx.media.j.aMp
        public void a(String str, j.aMD amd, Bundle bundle) {
            OooO00o oooO00o = new OooO00o(this, str, amd);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            Objects.requireNonNull(mediaBrowserServiceCompat);
            oooO00o.d = 1;
            mediaBrowserServiceCompat.d(str, oooO00o);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO0o, androidx.media.MediaBrowserServiceCompat.OooO0O0
        public void b() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            Field field = j.a;
            j.aMC amc = new j.aMC(mediaBrowserServiceCompat, this);
            this.b = amc;
            amc.onCreate();
        }
    }

    public class OooO00o implements IBinder.DeathRecipient {
        public final String a;
        public final OooOOO b;
        public final HashMap<String, List<o0ooOOo<IBinder, Bundle>>> c = new HashMap<>();

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0002OooO00o implements Runnable {
            public RunnableC0002OooO00o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OooO00o oooO00o = OooO00o.this;
                MediaBrowserServiceCompat.this.c.remove(((OooOOOO) oooO00o.b).b());
            }
        }

        public OooO00o(String str, int i, int i2, Bundle bundle, OooOOO oooOOO) {
            this.a = str;
            if (Build.VERSION.SDK_INT >= 28) {
                new u(str, i, i2);
            }
            this.b = oooOOO;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.d.post(new RunnableC0002OooO00o());
        }
    }

    public interface OooO0O0 {
        void b();
    }

    public class OooO0OO implements OooO0O0, ivas.gov.bisp.enumeration.p000a.i {
        public final List<Bundle> a = new ArrayList();
        public Object b;
        public Messenger c;

        public class OooO00o extends OooOO0O<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ ivas.gov.bisp.enumeration.p000a.e e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0OO oooO0OO, Object obj, ivas.gov.bisp.enumeration.p000a.e eVar) {
                super(obj);
                this.e = eVar;
            }
        }

        public OooO0OO() {
        }

        @Override // ivas.gov.bisp.enumeration.p000a.i
        public void c(String str, ivas.gov.bisp.enumeration.Ooooo00.OooO<List<Parcel>> oooO) {
            MediaBrowserServiceCompat.this.d(str, new OooO00o(this, str, oooO));
        }

        @Override // ivas.gov.bisp.enumeration.p000a.i
        public ivas.gov.bisp.enumeration.O.r d(String str, int i, Bundle bundle) {
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.c = new Messenger(MediaBrowserServiceCompat.this.d);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", this.c.getBinder());
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                this.a.add(bundle2);
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            new HashMap();
            if (Build.VERSION.SDK_INT >= 28) {
                new u(str, -1, i);
            }
            Objects.requireNonNull(mediaBrowserServiceCompat);
            MediaBrowserServiceCompat.this.c(str, i, bundle);
            Objects.requireNonNull(MediaBrowserServiceCompat.this);
            return null;
        }
    }

    public class OooO0o extends OooO0OO implements z {
        public OooO0o() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO0O0
        public void b() {
            C0030p c0030p = new C0030p(MediaBrowserServiceCompat.this, this);
            this.b = c0030p;
            c0030p.onCreate();
        }

        @Override // ivas.gov.bisp.enumeration.p000a.z
        public void e(String str, ivas.gov.bisp.enumeration.Ooooo00.OooO<Parcel> oooO) {
            Objects.requireNonNull(MediaBrowserServiceCompat.this);
            oooO.c(null);
        }
    }

    public class OooOO0 extends OooO {
        public OooOO0(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    public static class OooOO0O<T> {
        public final Object a;
        public boolean b;
        public boolean c;
        public int d;

        public OooOO0O(Object obj) {
            this.a = obj;
        }

        public boolean b() {
            return this.b || this.c;
        }
    }

    public interface OooOOO {
    }

    public class OooOOO0 {
        public OooOOO0() {
        }
    }

    public static class OooOOOO implements OooOOO {
        public final Messenger a;

        public OooOOOO(Messenger messenger) {
            this.a = messenger;
        }

        public IBinder b() {
            return this.a.getBinder();
        }

        public final void c(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.a.send(messageObtain);
        }
    }

    public final class OooOo00 extends Handler {
        public final OooOOO0 a;

        public OooOo00(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.a = mediaBrowserServiceCompat.new OooOOO0();
        }

        public final void b(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    OooOOO0 oooOOO0 = this.a;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    OooOOOO oooOOOO = new OooOOOO(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    Objects.requireNonNull(mediaBrowserServiceCompat);
                    if (string != null) {
                        for (String str : mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2)) {
                            if (str.equals(string)) {
                                MediaBrowserServiceCompat.this.d.b(new e(oooOOO0, oooOOOO, string, i, i2, bundle));
                                return;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Package/uid mismatch: uid=");
                    sb.append(i2);
                    sb.append(" package=");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                case 2:
                    OooOOO0 oooOOO1 = this.a;
                    MediaBrowserServiceCompat.this.d.b(new d(oooOOO1, new OooOOOO(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    OooOOO0 oooOOO2 = this.a;
                    MediaBrowserServiceCompat.this.d.b(new a(oooOOO2, new OooOOOO(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                    return;
                case 4:
                    OooOOO0 oooOOO3 = this.a;
                    MediaBrowserServiceCompat.this.d.b(new c(oooOOO3, new OooOOOO(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                    return;
                case 5:
                    OooOOO0 oooOOO4 = this.a;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO2 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO4);
                    if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.d.b(new f(oooOOO4, oooOOOO2, string2, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    OooOOO0 oooOOO5 = this.a;
                    MediaBrowserServiceCompat.this.d.b(new g(oooOOO5, new OooOOOO(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                    return;
                case 7:
                    OooOOO0 oooOOO6 = this.a;
                    MediaBrowserServiceCompat.this.d.b(new h(oooOOO6, new OooOOOO(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    OooOOO0 oooOOO7 = this.a;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO3 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO7);
                    if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.d.b(new i(oooOOO7, oooOOOO3, string3, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    OooOOO0 oooOOO8 = this.a;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO4 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO8);
                    if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.d.b(new k(oooOOO8, oooOOOO4, string4, bundle5, resultReceiver3));
                    return;
                default:
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    public abstract void c(String str, int i, Bundle bundle);

    public abstract void d(String str, OooOO0O<List<MediaBrowserCompat.MediaItem>> oooOO0O);

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return ((MediaBrowserService) ((OooO0OO) this.b).b).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.b = new OooOO0(this);
        } else if (i >= 26) {
            this.b = new OooO();
        } else {
            this.b = new OooO0o();
        }
        this.b.b();
    }
}
