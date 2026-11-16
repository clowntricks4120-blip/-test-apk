package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public class R {
    public static R a;
    public final Context b;
    public final LocationManager c;
    public final aQI d = new aQI();

    public static class aQI {
        public boolean a;
        public long b;
    }

    public R(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }
}
