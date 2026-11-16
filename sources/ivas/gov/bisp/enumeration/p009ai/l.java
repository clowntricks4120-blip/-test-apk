package ivas.gov.bisp.enumeration.p009ai;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Callable<x.aVW> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ u e;
    public final /* synthetic */ int f;

    public l(String str, Context context, u uVar, int i) {
        this.c = str;
        this.d = context;
        int i2 = b + 119;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.e = uVar;
            this.f = i;
        } else {
            this.e = uVar;
            this.f = i;
            throw null;
        }
    }

    @Override // java.util.concurrent.Callable
    public x.aVW call() throws Throwable {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = (i2 ^ 89) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.c;
        Context context = this.d;
        u uVar = this.e;
        int i7 = (i6 & 5) + (i6 | 5);
        a = i7 % 128;
        int i8 = i7 % 2;
        x.aVW avwB = x.b(str, context, uVar, this.f);
        if (i8 != 0) {
            int i9 = 36 / 0;
        }
        return avwB;
    }
}
