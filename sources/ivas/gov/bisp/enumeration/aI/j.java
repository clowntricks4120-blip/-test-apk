package ivas.gov.bisp.enumeration.aI;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.support.v4.media.session.IMediaSession;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public class j extends ViewOutlineProvider {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Chip c;

    public j(Chip chip) {
        this.c = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(IMediaSession.Stub.TRANSACTION_previous)
    public void getOutline(View view, Outline outline) {
        int i = 2 % 2;
        int i2 = b + 1;
        a = i2 % 128;
        int i3 = i2 % 2;
        com.google.android.material.chip.j jVar = this.c.i;
        if (jVar == null) {
            outline.setAlpha(0.0f);
            int i4 = b;
            int i5 = (i4 ^ 25) + ((i4 & 25) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = b;
        int i8 = (i7 ^ 33) + ((i7 & 33) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        jVar.getOutline(outline);
        if (i9 != 0) {
            int i10 = 70 / 0;
        }
        int i11 = a;
        int i12 = i11 ^ 93;
        int i13 = (((i11 & 93) | i12) << 1) - i12;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
