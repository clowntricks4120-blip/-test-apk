package ivas.gov.bisp.enumeration.p018ar;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public class aw implements FileFilter {
    private static int a = 0;
    private static int b = 1;

    public aw(ax axVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 107) + (i2 | 107);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            boolean zEquals = file.getName().equals("MultiDex.lock");
            int i4 = (zEquals ? 1 : 0) & 1;
            int i5 = ((zEquals ? 1 : 0) | 1) & (~i4);
            z = (i5 & i4) | (i5 ^ i4);
        } else {
            boolean zEquals2 = file.getName().equals("MultiDex.lock");
            z = ((zEquals2 ? 1 : 0) | 1) & (~((zEquals2 ? 1 : 0) & 1));
        }
        int i6 = a;
        int i7 = ((i6 & (-98)) | ((~i6) & 97)) + ((i6 & 97) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 43 / 0;
        }
        return z;
    }
}
