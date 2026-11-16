package ivas.gov.bisp.enumeration.V;

import android.util.TypedValue;
import android.view.View;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static int a = 1;
    private static int b;

    static {
        new TypedValue();
        int i = a;
        int i2 = (i & (-6)) | ((~i) & 5);
        int i3 = (i & 5) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T b(View view, int i, String str, Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 53) + (i3 | 53);
        b = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                i = 12 / 0;
                view = cls.cast(view);
            } else {
                view = cls.cast(view);
            }
            return (T) view;
        } catch (ClassCastException e) {
            String strD = d(view, i);
            StringBuilder sb = new StringBuilder();
            sb.append("View '");
            sb.append(strD);
            sb.append("' with ID ");
            sb.append(i);
            sb.append(" for ");
            throw new IllegalStateException(j.u(sb, str, " was of the wrong type. See cause for more info."), e);
        }
    }

    public static View c(View view, int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 115) | (i3 & 115)) << 1) - (((~i3) & 115) | (i3 & (-116)));
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            view.findViewById(i);
            throw null;
        }
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            int i5 = a;
            int i6 = i5 & 19;
            int i7 = i5 | 19;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return viewFindViewById;
            }
            throw null;
        }
        String strD = d(view, i);
        StringBuilder sb = new StringBuilder();
        int i9 = b;
        int i10 = ((i9 | 5) << 1) - (i9 ^ 5);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            sb.append("Required view '");
            sb.append(strD);
            obj.hashCode();
            throw null;
        }
        sb.append("Required view '");
        sb.append(strD);
        int i11 = b;
        int i12 = i11 & 123;
        int i13 = -(-((i11 ^ 123) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        sb.append("' with ID ");
        sb.append(i);
        sb.append(" for ");
        throw new IllegalStateException(j.u(sb, str, " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation."));
    }

    public static String d(View view, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 1;
        int i5 = (i3 & 1) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (!view.isInEditMode()) {
            String resourceEntryName = view.getContext().getResources().getResourceEntryName(i);
            int i8 = a;
            int i9 = i8 & 61;
            int i10 = i8 | 61;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return resourceEntryName;
        }
        int i13 = a;
        int i14 = (-2) - ((i13 + 114) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 & 107;
        int i17 = (i16 - (~(-(-((i13 ^ 107) | i16))))) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
        return "<unavailable while editing>";
    }
}
