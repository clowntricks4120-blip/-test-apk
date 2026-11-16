package ivas.gov.bisp.enumeration.p012al;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class Y extends InputConnectionWrapper {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ K c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InputConnection inputConnection, boolean z, K k) {
        super(inputConnection, z);
        this.c = k;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0063  */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        aa aaVar;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 89;
        int i5 = (i3 | 89) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        K k = this.c;
        if (inputContentInfo != null) {
            int i10 = i8 & 15;
            int i11 = (i8 ^ 15) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            if (Build.VERSION.SDK_INT >= 25) {
                aaVar = new aa(new aa.aXL(inputContentInfo));
                int i14 = b;
                int i15 = ((i14 | 45) << 1) - (((~i14) & 45) | (i14 & (-46)));
                int i16 = i15 % 128;
                a = i16;
                if (i15 % 2 != 0) {
                    int i17 = 57 / 0;
                }
                int i18 = i16 & 83;
                int i19 = ((i16 | 83) & (~i18)) + (i18 << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
            } else {
                aaVar = null;
            }
        } else {
            aaVar = null;
        }
        if (!((Z) k).c(aaVar, i, bundle)) {
            boolean zCommitContent = super.commitContent(inputContentInfo, i, bundle);
            int i21 = a;
            int i22 = (i21 | 95) << 1;
            int i23 = -(((~i21) & 95) | (i21 & (-96)));
            int i24 = (i22 & i23) + (i23 | i22);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 65 / 0;
            }
            return zCommitContent;
        }
        int i26 = b + 59;
        int i27 = i26 % 128;
        a = i27;
        int i28 = i26 % 2;
        int i29 = i27 & 57;
        int i30 = (i27 | 57) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i31 | i30);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
