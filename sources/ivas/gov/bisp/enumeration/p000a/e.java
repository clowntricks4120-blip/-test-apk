package ivas.gov.bisp.enumeration.p000a;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e<T> {
    private static int a = 1;
    private static int b;
    public MediaBrowserService.Result c;

    public e(MediaBrowserService.Result result) {
        this.c = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T t) {
        ArrayList arrayList;
        Parcel parcel;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = (i2 ^ 101) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        Object obj = null;
        if (!(t instanceof List)) {
            if (!(t instanceof Parcel)) {
                this.c.sendResult(null);
                int i8 = b;
                int i9 = (i8 ^ 7) + ((i8 & 7) << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i10 = (i2 ^ 33) + ((i2 & 33) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                parcel = (Parcel) t;
                parcel.setDataPosition(1);
            } else {
                parcel = (Parcel) t;
                parcel.setDataPosition(0);
            }
            MediaBrowserService.Result result = this.c;
            Parcelable.Creator creator = MediaBrowser.MediaItem.CREATOR;
            int i11 = a + 97;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                result.sendResult(creator.createFromParcel(parcel));
                parcel.recycle();
                return;
            } else {
                result.sendResult(creator.createFromParcel(parcel));
                parcel.recycle();
                obj.hashCode();
                throw null;
            }
        }
        int i12 = i6 ^ 47;
        int i13 = ((i6 & 47) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        a = i16;
        int i17 = i15 % 2;
        MediaBrowserService.Result result2 = this.c;
        List list = (List) t;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i18 = a;
            int i19 = i18 + 33;
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i18 | 105) << 1) - (i18 ^ 105);
            b = i21 % 128;
            while (true) {
                int i22 = i21 % 2;
                if (!it.hasNext()) {
                    break;
                }
                int i23 = b;
                int i24 = i23 & 33;
                int i25 = i24 + ((i23 ^ 33) | i24);
                a = i25 % 128;
                int i26 = i25 % 2;
                Parcel parcel2 = (Parcel) it.next();
                parcel2.setDataPosition(0);
                int i27 = (-2) - ((b + 112) ^ (-1));
                a = i27 % 128;
                int i28 = i27 % 2;
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
                int i29 = b;
                i21 = (i29 ^ 17) + ((i29 & 17) << 1);
                a = i21 % 128;
            }
        } else {
            int i30 = ((((i16 ^ 45) | (i16 & 45)) << 1) - (~(-((i16 & (-46)) | ((~i16) & 45))))) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (-2) - (((i16 & 106) + (i16 | 106)) ^ (-1));
            b = i32 % 128;
            int i33 = i32 % 2;
            arrayList = null;
        }
        result2.sendResult(arrayList);
        int i34 = a;
        int i35 = ((i34 ^ 14) + ((i34 & 14) << 1)) - 1;
        b = i35 % 128;
        if (i35 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
