package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public Object d;
    public String k;
    public int c = -1;
    public byte[] e = null;
    public Parcelable f = null;
    public int h = 0;
    public int g = 0;
    public ColorStateList i = null;
    public PorterDuff.Mode j = a;
    public String b = null;

    public String toString() {
        String str;
        int iIntValue;
        if (this.c == -1) {
            return String.valueOf(this.d);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.c) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.c) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.d).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.d).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i = this.c;
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Icon icon = (Icon) this.d;
                    if (i2 >= 28) {
                        iIntValue = icon.getResId();
                    } else {
                        try {
                            iIntValue = ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i != 2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("called getResId() on ");
                        sb2.append(this);
                        throw new IllegalStateException(sb2.toString());
                    }
                    iIntValue = this.h;
                }
                objArr[0] = Integer.valueOf(iIntValue);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.h);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.d);
                break;
        }
        if (this.i != null) {
            sb.append(" tint=");
            sb.append(this.i);
        }
        if (this.j != a) {
            sb.append(" mode=");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }
}
