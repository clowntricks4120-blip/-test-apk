package androidx.multidex;

import android.app.Application;
import android.content.Context;
import ivas.gov.bisp.enumeration.p018ar.ay;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ay.g(this);
    }
}
