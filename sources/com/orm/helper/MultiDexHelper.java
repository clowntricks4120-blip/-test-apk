package com.orm.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.orm.util.ContextUtil;
import dalvik.system.DexFile;
import ivas.gov.bisp.enumeration.de.c;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiDexHelper {
    private static final String EXTRACTED_NAME_EXT = ".classes";
    private static final String EXTRACTED_SUFFIX = ".zip";
    private static final String INSTANT_RUN_DEX_DIR_PATH = "files/instant-run/dex/";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String PREFS_FILE = "multidex.version";
    private static final String SECONDARY_FOLDER_NAME = j.u(j.w("code_cache"), File.separator, "secondary-dexes");

    private MultiDexHelper() {
    }

    public static List<String> getAllClasses() throws IOException {
        DexFile dexFile;
        ArrayList arrayList = new ArrayList();
        for (String str : getSourcePaths()) {
            try {
                if (str.endsWith(EXTRACTED_SUFFIX)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".tmp");
                    dexFile = DexFile.loadDex(str, sb.toString(), 0);
                } else {
                    dexFile = new DexFile(str);
                }
                Enumeration<String> enumerationEntries = dexFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    arrayList.add(enumerationEntries.nextElement());
                }
            } catch (IOException unused) {
                throw new IOException(j.t("Error at loading dex file '", str, "'"));
            }
        }
        return arrayList;
    }

    public static SharedPreferences getEncryptedSharedPreferences(Context context) {
        try {
            return ivas.gov.bisp.enumeration.de.j.c(PREFS_FILE, c.b(c.c), context, ivas.gov.bisp.enumeration.de.j.bJJ.c, ivas.gov.bisp.enumeration.de.j.bJK.c);
        } catch (IOException | GeneralSecurityException unused) {
            return null;
        }
    }

    private static SharedPreferences getMultiDexPreferences() {
        return getEncryptedSharedPreferences(ContextUtil.getContext());
    }

    public static List<String> getSourcePaths() throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = ContextUtil.getPackageManager().getApplicationInfo(ContextUtil.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
        File file3 = new File(applicationInfo.dataDir, INSTANT_RUN_DEX_DIR_PATH);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        if (file3.exists()) {
            for (File file4 : file3.listFiles()) {
                arrayList.add(file4.getAbsolutePath());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(EXTRACTED_NAME_EXT);
        String string = sb.toString();
        int i = getMultiDexPreferences().getInt(KEY_DEX_NUMBER, 1);
        for (int i2 = 2; i2 <= i; i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(i2);
            sb2.append(EXTRACTED_SUFFIX);
            File file5 = new File(file2, sb2.toString());
            if (file5.isFile()) {
                arrayList.add(file5.getAbsolutePath());
            }
        }
        return arrayList;
    }
}
