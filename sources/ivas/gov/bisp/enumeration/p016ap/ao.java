package ivas.gov.bisp.enumeration.p016ap;

import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class ao {
    private static int a = 0;
    private static int b = 1;

    public static <T extends d & InterfaceC0106f> ao c(T t) {
        int i = 2 % 2;
        ar arVar = new ar(t, t.getViewModelStore());
        int i2 = b;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = -(-((i2 & 71) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return arVar;
    }

    @Deprecated
    public abstract void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
