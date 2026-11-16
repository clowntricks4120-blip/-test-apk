package ivas.gov.bisp.enumeration.p098t;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;

    public static Drawable b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        int i5 = b;
        int i6 = i5 | 21;
        int i7 = (i6 << 1) - ((~(i5 & 21)) & i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return drawableCreateFromXmlInner;
        }
        throw null;
    }

    public static int c(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 41) + (i2 | 41);
        b = i3 % 128;
        int i4 = i3 % 2;
        int changingConfigurations = typedArray.getChangingConfigurations();
        int i5 = b + 117;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return changingConfigurations;
    }

    public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = -(-((i2 & 75) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        if (i6 != 0) {
            throw null;
        }
    }
}
