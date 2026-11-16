package com.orm.helper;

import android.content.pm.PackageManager;
import com.orm.util.ContextUtil;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ManifestHelper {
    public static final String DATABASE_DEFAULT_NAME = "Sugar.db";
    private static final String LOG_TAG = "Sugar";
    public static final String METADATA_DATABASE = "DATABASE";
    public static final String METADATA_DOMAIN_PACKAGE_NAME = "DOMAIN_PACKAGE_NAME";
    public static final String METADATA_QUERY_LOG = "QUERY_LOG";
    public static final String METADATA_VERSION = "VERSION";
    private static Boolean debugEnabled;

    private ManifestHelper() {
    }

    public static String getDatabaseName() {
        String metaDataString = getMetaDataString(METADATA_DATABASE);
        return metaDataString == null ? DATABASE_DEFAULT_NAME : metaDataString;
    }

    public static int getDatabaseVersion() {
        Integer metaDataInteger = getMetaDataInteger(METADATA_VERSION);
        if (metaDataInteger == null || metaDataInteger.intValue() == 0) {
            metaDataInteger = 1;
        }
        return metaDataInteger.intValue();
    }

    public static String getDbName() {
        return getDatabaseName();
    }

    public static String getDomainPackageName() {
        String metaDataString = getMetaDataString(METADATA_DOMAIN_PACKAGE_NAME);
        return metaDataString == null ? BuildConfig.FLAVOR : metaDataString;
    }

    private static Boolean getMetaDataBoolean(String str) {
        PackageManager packageManager = ContextUtil.getPackageManager();
        Boolean bool = Boolean.FALSE;
        try {
            return Boolean.valueOf(packageManager.getApplicationInfo(ContextUtil.getPackageName(), 128).metaData.getBoolean(str));
        } catch (Exception unused) {
            return bool;
        }
    }

    private static Integer getMetaDataInteger(String str) {
        try {
            return Integer.valueOf(ContextUtil.getPackageManager().getApplicationInfo(ContextUtil.getPackageName(), 128).metaData.getInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getMetaDataString(String str) {
        try {
            return ContextUtil.getPackageManager().getApplicationInfo(ContextUtil.getPackageName(), 128).metaData.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isDebugEnabled() {
        Boolean metaDataBoolean = debugEnabled;
        if (metaDataBoolean == null) {
            metaDataBoolean = getMetaDataBoolean(METADATA_QUERY_LOG);
            debugEnabled = metaDataBoolean;
        }
        return metaDataBoolean.booleanValue();
    }
}
