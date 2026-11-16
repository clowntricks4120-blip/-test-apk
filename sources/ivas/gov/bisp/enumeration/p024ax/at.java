package ivas.gov.bisp.enumeration.p024ax;

import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class at implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ aE c;

    public at(aE aEVar) {
        this.c = aEVar;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-98)) | ((~i2) & 97)) + ((i2 & 97) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.onSuccess((JSONObject) obj);
        int i5 = b;
        int i6 = i5 | 75;
        int i7 = (i6 << 1) - ((~(i5 & 75)) & i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
    }
}
