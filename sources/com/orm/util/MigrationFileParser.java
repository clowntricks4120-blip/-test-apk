package com.orm.util;

import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class MigrationFileParser {
    private String content;

    public MigrationFileParser(String str) {
        this.content = str.replaceAll("(\\/\\*([\\s\\S]*?)\\*\\/)|(--(.)*)|(\n)", BuildConfig.FLAVOR);
    }

    public String[] getStatements() {
        return this.content.split(";");
    }
}
