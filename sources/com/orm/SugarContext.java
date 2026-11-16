package com.orm;

import android.content.Context;
import com.orm.util.ContextUtil;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SugarContext {
    private static SugarDbConfiguration dbConfiguration;
    private static SugarContext instance;
    private SugarDb sugarDb = SugarDb.getInstance();
    private Map<Object, Long> entitiesMap = Collections.synchronizedMap(new WeakHashMap());

    private SugarContext() {
    }

    private void doTerminate() {
        SugarDb sugarDb = this.sugarDb;
        if (sugarDb != null) {
            sugarDb.getDB().close();
        }
    }

    public static SugarDbConfiguration getDbConfiguration() {
        return dbConfiguration;
    }

    public static SugarContext getSugarContext() {
        SugarContext sugarContext = instance;
        Objects.requireNonNull(sugarContext, "SugarContext has not been initialized properly. Call SugarContext.init(Context) in your Application.onCreate() method and SugarContext.terminate() in your Application.onTerminate() method.");
        return sugarContext;
    }

    public static void init(Context context) {
        ContextUtil.init(context);
        instance = new SugarContext();
        dbConfiguration = null;
    }

    public static void terminate() {
        SugarContext sugarContext = instance;
        if (sugarContext == null) {
            return;
        }
        sugarContext.doTerminate();
        ContextUtil.terminate();
    }

    public Map<Object, Long> getEntitiesMap() {
        return this.entitiesMap;
    }

    public SugarDb getSugarDb() {
        return this.sugarDb;
    }

    public static void init(Context context, SugarDbConfiguration sugarDbConfiguration) {
        init(context);
        dbConfiguration = sugarDbConfiguration;
    }
}
