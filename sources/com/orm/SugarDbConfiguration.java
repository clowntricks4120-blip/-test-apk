package com.orm;

import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SugarDbConfiguration {
    private Locale databaseLocale;
    private Long maxSize;
    private Long pageSize;

    public Locale getDatabaseLocale() {
        return this.databaseLocale;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public SugarDbConfiguration setDatabaseLocale(Locale locale) {
        this.databaseLocale = locale;
        return this;
    }

    public SugarDbConfiguration setMaxSize(Long l) {
        this.maxSize = l;
        return this;
    }

    public SugarDbConfiguration setPageSize(Long l) {
        this.pageSize = l;
        return this;
    }

    public String toString() {
        StringBuilder sbW = j.w("SugarDbConfiguration{, databaseLocale=");
        sbW.append(this.databaseLocale);
        sbW.append(", maxSize=");
        sbW.append(this.maxSize);
        sbW.append(", pageSize=");
        sbW.append(this.pageSize);
        sbW.append('}');
        return sbW.toString();
    }
}
