package ivas.gov.bisp.enumeration.Q;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.j;
import ivas.gov.bisp.enumeration.o00000Oo.OooO0o;
import ivas.gov.bisp.enumeration.o00000Oo.o00O0O;
import ivas.gov.bisp.enumeration.o00000Oo.o0OoOo0;
import java.util.Iterator;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.Q.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023o<S> extends o00O0O<S> {
    private static int a = 1;
    private static int b;
    public int d;
    public OooO0o<S> e;
    public j f;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.Q.o$bel */
    public class bel extends o0OoOo0<S> {
        private static int a = 0;
        private static int b = 1;

        public bel() {
        }

        public void c(S s) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                C0023o.this.c.iterator();
                throw null;
            }
            Iterator<o0OoOo0<S>> it = C0023o.this.c.iterator();
            int i4 = a;
            int i5 = (i4 ^ 45) + ((i4 & 45) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            while (!(!it.hasNext())) {
                int i7 = a;
                int i8 = i7 & 33;
                int i9 = (((i7 | 33) & (~i8)) - (~(i8 << 1))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                it.next().c(s);
                int i11 = a;
                int i12 = (i11 & (-6)) | ((~i11) & 5);
                int i13 = (i11 & 5) << 1;
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = b;
            int i17 = i16 ^ 123;
            int i18 = (i16 & 123) << 1;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.d);
        int i2 = b;
        int i3 = ((i2 | 89) << 1) - (((~i2) & 89) | (i2 & (-90)));
        a = i3 % 128;
        int i4 = i3 % 2;
        View viewX = this.e.x(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, bundle, this.f, new bel());
        int i5 = b;
        int i6 = ((i5 & (-104)) | ((~i5) & 103)) + ((i5 & 103) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return viewX;
        }
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 75) + ((i2 & 75) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        Object obj = null;
        if (bundle == null) {
            int i5 = a;
            int i6 = i5 & 41;
            int i7 = ((i5 ^ 41) | i6) << 1;
            int i8 = -((i5 | 41) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                getArguments();
                obj.hashCode();
                throw null;
            }
            bundle = getArguments();
            int i10 = a;
            int i11 = ((i10 ^ 8) + ((i10 & 8) << 1)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        this.d = bundle.getInt("THEME_RES_ID_KEY");
        int i13 = b + 110;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            this.e = (r) bundle.getParcelable("DATE_SELECTOR_KEY");
            throw null;
        }
        this.e = (r) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f = (j) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        int i15 = a;
        int i16 = (i15 | 71) << 1;
        int i17 = -(i15 ^ 71);
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 111;
        a = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.d);
        int i4 = b + 37;
        a = i4 % 128;
        int i5 = i4 % 2;
        bundle.putParcelable("DATE_SELECTOR_KEY", this.e);
        int i6 = a;
        int i7 = ((i6 | 57) << 1) - (i6 ^ 57);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f);
        } else {
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f);
            throw null;
        }
    }
}
