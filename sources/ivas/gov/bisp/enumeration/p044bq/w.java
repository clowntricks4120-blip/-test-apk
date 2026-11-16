package ivas.gov.bisp.enumeration.p044bq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class w extends AsyncTask<Void, Void, Void> {
    private static int a = 0;
    private static int b = 1;
    public Activity c;
    public SessionManager d;

    public w(Activity activity, SessionManager sessionManager) {
        this.c = activity;
        if (sessionManager == null) {
            this.d = new SessionManager(activity);
            int i = b;
            int i2 = ((i | 9) << 1) - (i ^ 9);
            a = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.d = sessionManager;
        int i4 = b;
        int i5 = i4 & 97;
        int i6 = ((i4 ^ 97) | i5) << 1;
        int i7 = -((i4 | 97) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r7) {
        Activity activity;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i3 - (~(-(-((i2 ^ 47) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            super.onPostExecute(r7);
            activity = this.c;
            int i5 = 53 / 0;
        } else {
            super.onPostExecute(r7);
            activity = this.c;
        }
        Intent intent = new Intent(this.c, (Class<?>) Authentication.class);
        int i6 = a;
        int i7 = (i6 & (-90)) | ((~i6) & 89);
        int i8 = -(-((i6 & 89) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            activity.startActivity(intent);
            this.c.finishAffinity();
        } else {
            activity.startActivity(intent);
            this.c.finishAffinity();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = a + 41;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.d.S(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        this.d.S(BuildConfig.FLAVOR);
        int i3 = a;
        int i4 = ((i3 | 67) << 1) - (i3 ^ 67);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.d.Q(BuildConfig.FLAVOR);
            this.d.R(BuildConfig.FLAVOR);
            throw null;
        }
        this.d.Q(BuildConfig.FLAVOR);
        this.d.R(BuildConfig.FLAVOR);
        this.d.H(false);
        SessionManager sessionManager = this.d;
        SharedPreferences.Editor editor = sessionManager.d;
        int i5 = b + 79;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            editor.remove("user_login_mode");
            sessionManager.d.apply();
            obj.hashCode();
            throw null;
        }
        editor.remove("user_login_mode");
        sessionManager.d.apply();
        int i6 = a;
        int i7 = i6 ^ 125;
        int i8 = -(-((i6 & 125) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
