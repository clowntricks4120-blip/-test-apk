package org.acra.file;

import android.content.Context;
import android.os.Environment;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bV.B;
import ivas.gov.bisp.enumeration.bV.ae;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public enum Directory {
    FILES_LEGACY { // from class: org.acra.file.Directory.OooOO0
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return (ae.aq(str, "/", false, 2) ? Directory.ROOT : Directory.FILES).getFile(context, str);
        }
    },
    FILES { // from class: org.acra.file.Directory.OooO
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return new File(context.getFilesDir(), str);
        }
    },
    EXTERNAL_FILES { // from class: org.acra.file.Directory.OooO0OO
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return new File(context.getExternalFilesDir(null), str);
        }
    },
    CACHE { // from class: org.acra.file.Directory.OooO00o
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return new File(context.getCacheDir(), str);
        }
    },
    EXTERNAL_CACHE { // from class: org.acra.file.Directory.OooO0O0
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return new File(context.getExternalCacheDir(), str);
        }
    },
    NO_BACKUP_FILES { // from class: org.acra.file.Directory.OooOO0O
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            r.m(noBackupFilesDir, "{\n                contex…kupFilesDir\n            }");
            return new File(noBackupFilesDir, str);
        }
    },
    EXTERNAL_STORAGE { // from class: org.acra.file.Directory.OooO0o
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            r.n(context, "context");
            r.n(str, "fileName");
            return new File(Environment.getExternalStorageDirectory(), str);
        }
    },
    ROOT { // from class: org.acra.file.Directory.OooOOO0
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3, types: [int] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.StringBuilder] */
        @Override // org.acra.file.Directory
        public final File getFile(Context context, String str) {
            int i;
            r.n(context, "context");
            r.n(str, "fileName");
            String str2 = File.separator;
            r.m(str2, "separator");
            ?? r4 = 0;
            ?? Au = B.au(str, new String[]{str2}, false, 2, 2);
            int i2 = 1;
            if (Au.size() == 1) {
                return new File(str);
            }
            File[] fileArrListRoots = File.listRoots();
            r.m(fileArrListRoots, "roots");
            int length = fileArrListRoots.length;
            int i3 = 0;
            while (i3 < length) {
                File file = fileArrListRoots[i3];
                Object obj = Au.get(r4);
                String path = file.getPath();
                r.m(path, "root.path");
                String str3 = File.separator;
                r.m(str3, "separator");
                int iAz = B.az(path, str3, r4, r4);
                if (iAz >= 0) {
                    int length2 = str3.length();
                    int i4 = length2 <= 0 ? i2 : length2;
                    int length3 = path.length() - length2;
                    if (length3 < 0) {
                        throw new OutOfMemoryError();
                    }
                    ?? sb = new StringBuilder(length3);
                    ?? r15 = r4;
                    while (true) {
                        sb.append(path, r15, iAz);
                        i = iAz + length2;
                        if (iAz >= path.length() || (iAz = B.az(path, str3, iAz + i4, false)) <= 0) {
                            break;
                        }
                        r15 = i;
                    }
                    sb.append(path, i, path.length());
                    path = sb.toString();
                    r.m(path, "stringBuilder.append(this, i, length).toString()");
                }
                if (r.f(obj, path)) {
                    return new File(file, (String) Au.get(1));
                }
                i3++;
                i2 = 1;
                r4 = 0;
            }
            return new File(fileArrListRoots[0], str);
        }
    };

    /* synthetic */ Directory(u uVar) {
        this();
    }

    public abstract File getFile(Context context, String str);
}
