package ivas.gov.bisp.enumeration.Q;

import androidx.fragment.app.Fragment;
import ivas.gov.bisp.enumeration.o00000Oo.o0OoOo0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class M<S> extends Fragment {
    private static int a = 0;
    private static int b = 1;
    public final LinkedHashSet<o0OoOo0<S>> c = new LinkedHashSet<>();

    public boolean c(o0OoOo0<S> o0oooo0) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = (i2 & 87) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        LinkedHashSet<o0OoOo0<S>> linkedHashSet = this.c;
        if (i6 != 0) {
            return linkedHashSet.add(o0oooo0);
        }
        linkedHashSet.add(o0oooo0);
        throw null;
    }
}
