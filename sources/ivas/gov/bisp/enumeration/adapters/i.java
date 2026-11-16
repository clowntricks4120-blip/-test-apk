package ivas.gov.bisp.enumeration.adapters;

import android.content.SharedPreferences;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.models.Tokens;

/* JADX INFO: loaded from: classes.dex */
public class i implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Tokens c;
    public final /* synthetic */ AdapterTokens d;

    public i(AdapterTokens adapterTokens, Tokens tokens) {
        this.d = adapterTokens;
        this.c = tokens;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AdapterTokens.OooO00o oooO00o;
        Tokens tokens;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            oooO00o = this.d.g;
            tokens = this.c;
            int i4 = 4 / 0;
        } else {
            oooO00o = this.d.g;
            tokens = this.c;
        }
        TokenActivity tokenActivity = (TokenActivity) oooO00o;
        SharedPreferences sharedPreferences = tokenActivity.aj.c;
        int i5 = a;
        int i6 = i5 & 63;
        int i7 = (i6 - (~(-(-((i5 ^ 63) | i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (sharedPreferences.getInt("tokenSkip", 0) == 1) {
            int i9 = a;
            int i10 = ((i9 & (-102)) | ((~i9) & 101)) + ((i9 & 101) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                tokenActivity.x(tokens);
                int i11 = 29 / 0;
            } else {
                tokenActivity.x(tokens);
            }
            int i12 = a;
            int i13 = (i12 & (-88)) | ((~i12) & 87);
            int i14 = -(-((i12 & 87) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = b;
        int i18 = (i17 & 31) + (i17 | 31);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }
}
