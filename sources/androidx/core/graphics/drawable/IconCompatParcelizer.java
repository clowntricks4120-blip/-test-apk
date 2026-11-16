package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import ivas.gov.bisp.enumeration.C.j;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(j jVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.c = jVar.m(iconCompat.c, 1);
        byte[] bArrJ = iconCompat.e;
        if (jVar.c(2)) {
            bArrJ = jVar.j();
        }
        iconCompat.e = bArrJ;
        iconCompat.f = jVar.p(iconCompat.f, 3);
        iconCompat.h = jVar.m(iconCompat.h, 4);
        iconCompat.g = jVar.m(iconCompat.g, 5);
        iconCompat.i = (ColorStateList) jVar.p(iconCompat.i, 6);
        String strO = iconCompat.b;
        if (jVar.c(7)) {
            strO = jVar.o();
        }
        iconCompat.b = strO;
        String strO2 = iconCompat.k;
        if (jVar.c(8)) {
            strO2 = jVar.o();
        }
        iconCompat.k = strO2;
        iconCompat.j = PorterDuff.Mode.valueOf(iconCompat.b);
        switch (iconCompat.c) {
            case -1:
                Parcelable parcelable = iconCompat.f;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.d = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f;
                if (parcelable2 != null) {
                    iconCompat.d = parcelable2;
                } else {
                    byte[] bArr = iconCompat.e;
                    iconCompat.d = bArr;
                    iconCompat.c = 3;
                    iconCompat.h = 0;
                    iconCompat.g = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.e, Charset.forName("UTF-16"));
                iconCompat.d = str;
                if (iconCompat.c == 2 && iconCompat.k == null) {
                    iconCompat.k = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.d = iconCompat.e;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, j jVar) {
        Objects.requireNonNull(jVar);
        iconCompat.b = iconCompat.j.name();
        switch (iconCompat.c) {
            case -1:
                iconCompat.f = (Parcelable) iconCompat.d;
                break;
            case 1:
            case 5:
                iconCompat.f = (Parcelable) iconCompat.d;
                break;
            case 2:
                iconCompat.e = ((String) iconCompat.d).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.e = (byte[]) iconCompat.d;
                break;
            case 4:
            case 6:
                iconCompat.e = iconCompat.d.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.c;
        if (-1 != i) {
            jVar.r(1);
            jVar.w(i);
        }
        byte[] bArr = iconCompat.e;
        if (bArr != null) {
            jVar.r(2);
            jVar.s(bArr);
        }
        Parcelable parcelable = iconCompat.f;
        if (parcelable != null) {
            jVar.r(3);
            jVar.v(parcelable);
        }
        int i2 = iconCompat.h;
        if (i2 != 0) {
            jVar.r(4);
            jVar.w(i2);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            jVar.r(5);
            jVar.w(i3);
        }
        ColorStateList colorStateList = iconCompat.i;
        if (colorStateList != null) {
            jVar.r(6);
            jVar.v(colorStateList);
        }
        String str = iconCompat.b;
        if (str != null) {
            jVar.r(7);
            jVar.x(str);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            jVar.r(8);
            jVar.x(str2);
        }
    }
}
