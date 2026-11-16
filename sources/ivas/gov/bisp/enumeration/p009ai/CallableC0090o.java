package ivas.gov.bisp.enumeration.p009ai;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ai.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class CallableC0090o implements Callable<x.aVW> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ u e;
    public final /* synthetic */ int f;

    public CallableC0090o(String str, Context context, u uVar, int i) {
        this.c = str;
        this.d = context;
        this.e = uVar;
        this.f = i;
    }

    @Override // java.util.concurrent.Callable
    public x.aVW call() {
        x.aVW avw;
        int i = 2 % 2;
        int i2 = b + 57;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        try {
            String str = this.c;
            Context context = this.d;
            u uVar = this.e;
            int i5 = i3 & 53;
            int i6 = i5 + ((i3 ^ 53) | i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                avw = x.b(str, context, uVar, this.f);
                int i7 = 22 / 0;
            } else {
                avw = x.b(str, context, uVar, this.f);
            }
            int i8 = b;
            int i9 = (i8 ^ 105) + ((i8 & 105) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
        } catch (Throwable unused) {
            avw = new x.aVW(-3);
        }
        int i11 = (-2) - ((a + 42) ^ (-1));
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return avw;
        }
        throw null;
    }
}
