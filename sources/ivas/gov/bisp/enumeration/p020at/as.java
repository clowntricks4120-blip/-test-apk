package ivas.gov.bisp.enumeration.p020at;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class as {
    private static int a = 0;
    private static int b = 1;
    public static final Map<String, Lock> c = new HashMap();
    public final File d;
    public final Lock e;
    public final boolean f;
    public FileChannel g;

    static {
        int i = b + 11;
        a = i % 128;
        int i2 = i % 2;
    }

    public as(String str, File file, boolean z) {
        Lock reentrantLock;
        File file2 = new File(file, j.r(str, ".lck"));
        this.d = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = c;
        synchronized (map) {
            reentrantLock = (Lock) ((HashMap) map).get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                ((HashMap) map).put(absolutePath, reentrantLock);
            }
        }
        this.e = reentrantLock;
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b A[EXC_TOP_SPLITTER, PHI: r1
  0x001b: PHI (r1v5 java.nio.channels.FileChannel) = (r1v4 java.nio.channels.FileChannel), (r1v14 java.nio.channels.FileChannel) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void c() {
        FileChannel fileChannel;
        int i = 2 % 2;
        int i2 = a + 35;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            fileChannel = this.g;
            int i3 = 55 / 0;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                    int i4 = a;
                    int i5 = (((i4 | 20) << 1) - (i4 ^ 20)) - 1;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                } catch (IOException unused) {
                }
            }
        } else {
            fileChannel = this.g;
            if (fileChannel != null) {
                fileChannel.close();
                int i7 = a;
                int i8 = (((i7 | 20) << 1) - (i7 ^ 20)) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        this.e.unlock();
        int i10 = b;
        int i11 = i10 & 39;
        int i12 = i11 + ((i10 ^ 39) | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
    }
}
