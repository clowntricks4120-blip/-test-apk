package com.orm;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public class SugarApp extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}
