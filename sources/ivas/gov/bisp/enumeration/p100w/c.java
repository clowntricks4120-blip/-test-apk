package ivas.gov.bisp.enumeration.p100w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public SparseArray<aTD> c = new SparseArray<>();
    public SparseArray<b> d = new SparseArray<>();

    public static class aTD {
        private static int a = 1;
        private static int b;
        public int c;
        public ArrayList<aTE> d = new ArrayList<>();
        public int e;

        public aTD(Context context, XmlPullParser xmlPullParser) {
            Resources resources;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 2 % 2;
            int i2 = 0;
            while (i2 < indexCount) {
                int i3 = b;
                int i4 = i3 & 9;
                int i5 = -(-((i3 ^ 9) | i4));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                a = i6 % 128;
                int i7 = i6 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    int i8 = a;
                    int i9 = (i8 & 53) + (i8 | 53);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    int i11 = b;
                    int i12 = i11 & 23;
                    int i13 = i11 | 23;
                    int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                } else if (index == 1) {
                    int i16 = b;
                    int i17 = (i16 & (-76)) | ((~i16) & 75);
                    int i18 = (i16 & 75) << 1;
                    int i19 = (i17 & i18) + (i18 | i17);
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        resources = context.getResources();
                        int i20 = 53 / 0;
                    } else {
                        this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        resources = context.getResources();
                    }
                    int i21 = a;
                    int i22 = ((i21 ^ 71) | (i21 & 71)) << 1;
                    int i23 = -(((~i21) & 71) | (i21 & (-72)));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    String resourceTypeName = resources.getResourceTypeName(this.e);
                    Resources resources2 = context.getResources();
                    int i26 = this.e;
                    int i27 = a + 121;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    resources2.getResourceName(i26);
                    if ("layout".equals(resourceTypeName)) {
                        b bVar = new b();
                        int i29 = this.e;
                        int i30 = b;
                        int i31 = i30 & 93;
                        int i32 = -(-((i30 ^ 93) | i31));
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        View viewInflate = LayoutInflater.from(context).inflate(i29, (ViewGroup) null);
                        int i35 = b;
                        int i36 = ((i35 | 68) << 1) - (i35 ^ 68);
                        int i37 = (i36 ^ (-1)) + (i36 << 1);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        bVar.d((ConstraintLayout) viewInflate);
                        int i39 = b;
                        int i40 = ((i39 | 29) << 1) - (i39 ^ 29);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                    }
                }
                int i42 = (-2) - (((i2 ^ 79) + ((i2 & 79) << 1)) ^ (-1));
                i2 = (((i42 & 76) | ((~i42) & (-77))) - (~(-(-((i42 & (-77)) << 1))))) - 1;
                int i43 = a;
                int i44 = i43 | 91;
                int i45 = i44 << 1;
                int i46 = -((~(i43 & 91)) & i44);
                int i47 = (i45 & i46) + (i46 | i45);
                b = i47 % 128;
                int i48 = i47 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i49 = a;
            int i50 = (-2) - ((((i49 | 24) << 1) - (i49 ^ 24)) ^ (-1));
            b = i50 % 128;
            int i51 = i50 % 2;
        }
    }

    public static class aTE {
        private static int a = 1;
        private static int b;
        public float c;
        public float d;
        public float e;
        public float f;
        public int g;

        public aTE(Context context, XmlPullParser xmlPullParser) {
            int resourceId;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = Float.NaN;
            this.g = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 2 % 2;
            int i2 = 0;
            while (i2 < indexCount) {
                int i3 = b;
                int i4 = i3 & 15;
                int i5 = (i3 ^ 15) | i4;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                Object obj = null;
                if (index == 0) {
                    int i8 = b;
                    int i9 = (i8 | 79) << 1;
                    int i10 = -(i8 ^ 79);
                    int i11 = (i9 & i10) + (i10 | i9);
                    a = i11 % 128;
                    if (i11 % 2 == 0) {
                        resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        int i12 = 46 / 0;
                    } else {
                        resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    }
                    this.g = resourceId;
                    Resources resources = context.getResources();
                    int i13 = this.g;
                    int i14 = b + 87;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    String resourceTypeName = resources.getResourceTypeName(i13);
                    Resources resources2 = context.getResources();
                    int i16 = this.g;
                    int i17 = a;
                    int i18 = (((i17 | 122) << 1) - (i17 ^ 122)) - 1;
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        resources2.getResourceName(i16);
                        "layout".equals(resourceTypeName);
                        throw null;
                    }
                    resources2.getResourceName(i16);
                    if ("layout".equals(resourceTypeName)) {
                        b bVar = new b();
                        int i19 = this.g;
                        int i20 = b + 89;
                        a = i20 % 128;
                        if (i20 % 2 == 0) {
                            LayoutInflater.from(context).inflate(i19, (ViewGroup) null);
                            obj.hashCode();
                            throw null;
                        }
                        View viewInflate = LayoutInflater.from(context).inflate(i19, (ViewGroup) null);
                        int i21 = b;
                        int i22 = i21 & 53;
                        int i23 = ((i21 ^ 53) | i22) << 1;
                        int i24 = -((i21 | 53) & (~i22));
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        bVar.d((ConstraintLayout) viewInflate);
                        int i27 = b + 37;
                        a = i27 % 128;
                        if (i27 % 2 == 0) {
                            int i28 = 3 / 3;
                        }
                    } else {
                        continue;
                    }
                } else if (index == 1) {
                    int i29 = b;
                    int i30 = i29 | 83;
                    int i31 = i30 << 1;
                    int i32 = -((~(i29 & 83)) & i30);
                    int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    int i35 = b;
                    int i36 = ((i35 | 17) << 1) - (i35 ^ 17);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                } else if (index == 2) {
                    int i38 = b;
                    int i39 = (i38 ^ 35) + ((i38 & 35) << 1);
                    a = i39 % 128;
                    if (i39 % 2 == 0) {
                        this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                        obj.hashCode();
                        throw null;
                    }
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                    int i40 = b;
                    int i41 = i40 & 79;
                    int i42 = (i40 ^ 79) | i41;
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    a = i43 % 128;
                    if (i43 % 2 == 0) {
                        int i44 = 4 % 3;
                    }
                } else if (index == 3) {
                    int i45 = a + 89;
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    this.e = typedArrayObtainStyledAttributes.getDimension(index, this.e);
                    int i47 = a;
                    int i48 = ((i47 ^ 19) | (i47 & 19)) << 1;
                    int i49 = -(((~i47) & 19) | (i47 & (-20)));
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    b = i50 % 128;
                    if (i50 % 2 != 0) {
                        int i51 = 3 % 3;
                    }
                } else if (index == 4) {
                    int i52 = b;
                    int i53 = ((i52 & 53) - (~(i52 | 53))) - 1;
                    a = i53 % 128;
                    if (i53 % 2 == 0) {
                        this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                        throw null;
                    }
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else {
                    continue;
                }
                i2 = (i2 | 1) + (i2 & 1);
                int i54 = b;
                int i55 = (((i54 & (-40)) | ((~i54) & 39)) - (~((i54 & 39) << 1))) - 1;
                a = i55 % 128;
                int i56 = i55 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i57 = a;
            int i58 = i57 & 111;
            int i59 = ((i57 ^ 111) | i58) << 1;
            int i60 = -((i57 | 111) & (~i58));
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            b = i61 % 128;
            int i62 = i61 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b1 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0200 A[Catch: IOException -> 0x0239, XmlPullParserException -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0239, XmlPullParserException -> 0x023a, blocks: (B:3:0x001b, B:73:0x0200, B:75:0x021b, B:15:0x0059, B:62:0x019d, B:64:0x01b1, B:67:0x01ca, B:69:0x01dd, B:71:0x01f1, B:19:0x0072, B:23:0x008d, B:26:0x00c1, B:29:0x00e3, B:35:0x00fa), top: B:84:0x001b }] */
    public c(Context context, ConstraintLayout constraintLayout, int i) {
        String name;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        aTE ate;
        int i8;
        XmlResourceParser xml = context.getResources().getXml(i);
        Object obj = null;
        try {
            int eventType = xml.getEventType();
            int i9 = 2 % 2;
            aTD atd = null;
            while (eventType != 1) {
                int i10 = b + 9;
                int i11 = i10 % 128;
                a = i11;
                byte b2 = 0;
                if (i10 % 2 == 0) {
                    int i12 = 92 / 0;
                    if (eventType == 0) {
                        xml.getName();
                        int i13 = a;
                        int i14 = ((i13 ^ 11) | (i13 & 11)) << 1;
                        int i15 = -(((~i13) & 11) | (i13 & (-12)));
                        int i16 = (i14 & i15) + (i15 | i14);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                    } else if (eventType != 2) {
                        int i18 = (i11 & (-92)) | ((~i11) & 91);
                        int i19 = -(-((i11 & 91) << 1));
                        int i20 = (i18 & i19) + (i18 | i19);
                        int i21 = i20 % 128;
                        b = i21;
                        int i22 = i20 % 2;
                        int i23 = i21 + 89;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!(!name.equals("ConstraintSet"))) {
                                    b2 = -1;
                                } else {
                                    int i25 = b;
                                    i2 = (-2) - ((((i25 | 114) << 1) - (i25 ^ 114)) ^ (-1));
                                    int i26 = i2 % 128;
                                    a = i26;
                                    if (i2 % 2 == 0) {
                                        b2 = 3;
                                    } else {
                                        b2 = 4;
                                    }
                                    i3 = (i26 ^ 79) + ((i26 & 79) << 1);
                                    b = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        int i27 = 2 % 4;
                                    }
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    b2 = -1;
                                } else {
                                    i4 = b + 29;
                                    a = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        b2 = 2;
                                    } else {
                                        b2 = 4;
                                    }
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    b2 = -1;
                                } else {
                                    int i28 = a;
                                    int i29 = (i28 ^ 93) + ((i28 & 93) << 1);
                                    b = i29 % 128;
                                    int i30 = i29 % 2;
                                    int i31 = i28 + 120;
                                    int i32 = (i31 ^ (-1)) + (i31 << 1);
                                    b = i32 % 128;
                                    int i33 = i32 % 2;
                                    b2 = 1;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    b2 = -1;
                                } else {
                                    int i34 = b;
                                    int i35 = ((i34 ^ 103) | (i34 & 103)) << 1;
                                    int i36 = -((i34 & (-104)) | ((~i34) & 103));
                                    int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                                    a = i37 % 128;
                                    int i38 = i37 % 2;
                                    int i39 = i34 & 65;
                                    int i40 = (((i34 | 65) & (~i39)) - (~(i39 << 1))) - 1;
                                    a = i40 % 128;
                                    int i41 = i40 % 2;
                                }
                                break;
                            case 1901439077:
                                if (!(!name.equals("Variant"))) {
                                    b2 = -1;
                                } else {
                                    int i42 = a;
                                    int i43 = i42 & 107;
                                    int i44 = ((i42 | 107) & (~i43)) + (i43 << 1);
                                    b = i44 % 128;
                                    int i45 = i44 % 2;
                                    b2 = 3;
                                }
                                break;
                            default:
                                int i46 = a + 73;
                                b = i46 % 128;
                                int i47 = i46 % 2;
                                b2 = -1;
                                break;
                        }
                        if (b2 != 0) {
                            int i48 = b;
                            int i49 = i48 & 121;
                            int i50 = (i48 | 121) & (~i49);
                            int i51 = i49 << 1;
                            i5 = (i50 & i51) + (i50 | i51);
                            i6 = i5 % 128;
                            a = i6;
                            if (i5 % 2 == 0 ? b2 != 1 : b2 != 0) {
                                int i52 = ((i6 ^ 111) - (~((i6 & 111) << 1))) - 1;
                                i7 = i52 % 128;
                                b = i7;
                                int i53 = i52 % 2;
                                if (b2 != 2) {
                                    int i54 = i7 & 105;
                                    int i55 = ((i7 ^ 105) | i54) << 1;
                                    int i56 = -((~i54) & (i7 | 105));
                                    int i57 = (i55 & i56) + (i55 | i56);
                                    a = i57 % 128;
                                    int i58 = i57 % 2;
                                    if (b2 != 3) {
                                        i8 = (i7 & 17) + (i7 | 17);
                                        int i59 = i8 % 128;
                                        a = i59;
                                        if (i8 % 2 == 0 ? b2 == 4 : b2 == 3) {
                                            c(context, xml);
                                            int i60 = b;
                                            int i61 = i60 & 75;
                                            int i62 = (i60 ^ 75) | i61;
                                            int i63 = (i61 & i62) + (i62 | i61);
                                            a = i63 % 128;
                                            int i64 = i63 % 2;
                                        } else {
                                            int i65 = i59 + 94;
                                            int i66 = (i65 ^ (-1)) + (i65 << 1);
                                            b = i66 % 128;
                                            int i67 = i66 % 2;
                                            int i68 = i59 & 67;
                                            int i69 = (i59 | 67) & (~i68);
                                            int i70 = -(-(i68 << 1));
                                            int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
                                            b = i71 % 128;
                                            int i72 = i71 % 2;
                                        }
                                    } else {
                                        ate = new aTE(context, xml);
                                        if (atd != null) {
                                            int i73 = b;
                                            int i74 = i73 & 71;
                                            int i75 = -(-((i73 ^ 71) | i74));
                                            int i76 = (i74 & i75) + (i75 | i74);
                                            a = i76 % 128;
                                            int i77 = i76 % 2;
                                            atd.d.add(ate);
                                            int i78 = a;
                                            int i79 = i78 & 49;
                                            int i80 = i79 + ((i78 ^ 49) | i79);
                                            b = i80 % 128;
                                            int i81 = i80 % 2;
                                        }
                                    }
                                } else {
                                    atd = new aTD(context, xml);
                                    SparseArray<aTD> sparseArray = this.c;
                                    int i82 = b + 62;
                                    int i83 = (i82 ^ (-1)) + (i82 << 1);
                                    a = i83 % 128;
                                    int i84 = i83 % 2;
                                    sparseArray.put(atd.c, atd);
                                    int i85 = b + 37;
                                    a = i85 % 128;
                                    int i86 = i85 % 2;
                                }
                            }
                        }
                    }
                } else if (eventType == 0) {
                    xml.getName();
                    int i110 = a;
                    int i111 = ((i110 ^ 11) | (i110 & 11)) << 1;
                    int i112 = -(((~i110) & 11) | (i110 & (-12)));
                    int i113 = (i111 & i112) + (i112 | i111);
                    b = i113 % 128;
                    int i114 = i113 % 2;
                } else if (eventType != 2) {
                    int i115 = (i11 & (-92)) | ((~i11) & 91);
                    int i116 = -(-((i11 & 91) << 1));
                    int i210 = (i115 & i116) + (i115 | i116);
                    int i211 = i210 % 128;
                    b = i211;
                    int i212 = i210 % 2;
                    int i213 = i211 + 89;
                    a = i213 % 128;
                    int i214 = i213 % 2;
                } else {
                    name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!(!name.equals("ConstraintSet"))) {
                                b2 = -1;
                            } else {
                                int i215 = b;
                                i2 = (-2) - ((((i215 | 114) << 1) - (i215 ^ 114)) ^ (-1));
                                int i216 = i2 % 128;
                                a = i216;
                                if (i2 % 2 == 0) {
                                    b2 = 3;
                                } else {
                                    b2 = 4;
                                }
                                i3 = (i216 ^ 79) + ((i216 & 79) << 1);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    int i217 = 2 % 4;
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = -1;
                            } else {
                                i4 = b + 29;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    b2 = 2;
                                } else {
                                    b2 = 4;
                                }
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = -1;
                            } else {
                                int i218 = a;
                                int i219 = (i218 ^ 93) + ((i218 & 93) << 1);
                                b = i219 % 128;
                                int i310 = i219 % 2;
                                int i311 = i218 + 120;
                                int i312 = (i311 ^ (-1)) + (i311 << 1);
                                b = i312 % 128;
                                int i313 = i312 % 2;
                                b2 = 1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = -1;
                            } else {
                                int i314 = b;
                                int i315 = ((i314 ^ 103) | (i314 & 103)) << 1;
                                int i316 = -((i314 & (-104)) | ((~i314) & 103));
                                int i317 = (i315 ^ i316) + ((i315 & i316) << 1);
                                a = i317 % 128;
                                int i318 = i317 % 2;
                                int i319 = i314 & 65;
                                int i410 = (((i314 | 65) & (~i319)) - (~(i319 << 1))) - 1;
                                a = i410 % 128;
                                int i411 = i410 % 2;
                            }
                            break;
                        case 1901439077:
                            if (!(!name.equals("Variant"))) {
                                b2 = -1;
                            } else {
                                int i412 = a;
                                int i413 = i412 & 107;
                                int i414 = ((i412 | 107) & (~i413)) + (i413 << 1);
                                b = i414 % 128;
                                int i415 = i414 % 2;
                                b2 = 3;
                            }
                            break;
                        default:
                            int i416 = a + 73;
                            b = i416 % 128;
                            int i417 = i416 % 2;
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0) {
                        int i418 = b;
                        int i419 = i418 & 121;
                        int i510 = (i418 | 121) & (~i419);
                        int i511 = i419 << 1;
                        i5 = (i510 & i511) + (i510 | i511);
                        i6 = i5 % 128;
                        a = i6;
                        if (i5 % 2 == 0) {
                            int i512 = ((i6 ^ 111) - (~((i6 & 111) << 1))) - 1;
                            i7 = i512 % 128;
                            b = i7;
                            int i513 = i512 % 2;
                            if (b2 != 2) {
                                int i514 = i7 & 105;
                                int i515 = ((i7 ^ 105) | i514) << 1;
                                int i516 = -((~i514) & (i7 | 105));
                                int i517 = (i515 & i516) + (i515 | i516);
                                a = i517 % 128;
                                int i518 = i517 % 2;
                                if (b2 != 3) {
                                    i8 = (i7 & 17) + (i7 | 17);
                                    int i519 = i8 % 128;
                                    a = i519;
                                    if (i8 % 2 == 0) {
                                        c(context, xml);
                                        int i610 = b;
                                        int i611 = i610 & 75;
                                        int i612 = (i610 ^ 75) | i611;
                                        int i613 = (i611 & i612) + (i612 | i611);
                                        a = i613 % 128;
                                        int i614 = i613 % 2;
                                    } else {
                                        c(context, xml);
                                        int i615 = b;
                                        int i616 = i615 & 75;
                                        int i617 = (i615 ^ 75) | i616;
                                        int i618 = (i616 & i617) + (i617 | i616);
                                        a = i618 % 128;
                                        int i619 = i618 % 2;
                                    }
                                } else {
                                    ate = new aTE(context, xml);
                                    if (atd != null) {
                                        int i710 = b;
                                        int i711 = i710 & 71;
                                        int i712 = -(-((i710 ^ 71) | i711));
                                        int i713 = (i711 & i712) + (i712 | i711);
                                        a = i713 % 128;
                                        int i714 = i713 % 2;
                                        atd.d.add(ate);
                                        int i715 = a;
                                        int i716 = i715 & 49;
                                        int i87 = i716 + ((i715 ^ 49) | i716);
                                        b = i87 % 128;
                                        int i88 = i87 % 2;
                                    }
                                }
                            } else {
                                atd = new aTD(context, xml);
                                SparseArray<aTD> sparseArray2 = this.c;
                                int i89 = b + 62;
                                int i810 = (i89 ^ (-1)) + (i89 << 1);
                                a = i810 % 128;
                                int i811 = i810 % 2;
                                sparseArray2.put(atd.c, atd);
                                int i812 = b + 37;
                                a = i812 % 128;
                                int i813 = i812 % 2;
                            }
                        } else {
                            int i5110 = ((i6 ^ 111) - (~((i6 & 111) << 1))) - 1;
                            i7 = i5110 % 128;
                            b = i7;
                            int i5111 = i5110 % 2;
                            if (b2 != 2) {
                                int i5112 = i7 & 105;
                                int i5113 = ((i7 ^ 105) | i5112) << 1;
                                int i5114 = -((~i5112) & (i7 | 105));
                                int i5115 = (i5113 & i5114) + (i5113 | i5114);
                                a = i5115 % 128;
                                int i5116 = i5115 % 2;
                                if (b2 != 3) {
                                    i8 = (i7 & 17) + (i7 | 17);
                                    int i5117 = i8 % 128;
                                    a = i5117;
                                    if (i8 % 2 == 0) {
                                        c(context, xml);
                                        int i6110 = b;
                                        int i6111 = i6110 & 75;
                                        int i6112 = (i6110 ^ 75) | i6111;
                                        int i6113 = (i6111 & i6112) + (i6112 | i6111);
                                        a = i6113 % 128;
                                        int i6114 = i6113 % 2;
                                    } else {
                                        c(context, xml);
                                        int i6115 = b;
                                        int i6116 = i6115 & 75;
                                        int i6117 = (i6115 ^ 75) | i6116;
                                        int i6118 = (i6116 & i6117) + (i6117 | i6116);
                                        a = i6118 % 128;
                                        int i6119 = i6118 % 2;
                                    }
                                } else {
                                    ate = new aTE(context, xml);
                                    if (atd != null) {
                                        int i717 = b;
                                        int i718 = i717 & 71;
                                        int i719 = -(-((i717 ^ 71) | i718));
                                        int i7110 = (i718 & i719) + (i719 | i718);
                                        a = i7110 % 128;
                                        int i7111 = i7110 % 2;
                                        atd.d.add(ate);
                                        int i7112 = a;
                                        int i7113 = i7112 & 49;
                                        int i814 = i7113 + ((i7112 ^ 49) | i7113);
                                        b = i814 % 128;
                                        int i815 = i814 % 2;
                                    }
                                }
                            } else {
                                atd = new aTD(context, xml);
                                SparseArray<aTD> sparseArray3 = this.c;
                                int i816 = b + 62;
                                int i817 = (i816 ^ (-1)) + (i816 << 1);
                                a = i817 % 128;
                                int i818 = i817 % 2;
                                sparseArray3.put(atd.c, atd);
                                int i819 = b + 37;
                                a = i819 % 128;
                                int i8110 = i819 % 2;
                            }
                        }
                    }
                }
                eventType = xml.next();
                int i90 = a;
                int i91 = (i90 & (-62)) | ((~i90) & 61);
                int i92 = -(-((i90 & 61) << 1));
                int i93 = (i91 & i92) + (i92 | i91);
                b = i93 % 128;
                int i94 = i93 % 2;
            }
        } catch (IOException unused) {
            return;
        } catch (XmlPullParserException unused2) {
        }
        int i95 = a;
        int i96 = i95 | 7;
        int i97 = i96 << 1;
        int i98 = -((~(i95 & 7)) & i96);
        int i99 = (i97 & i98) + (i98 | i97);
        b = i99 % 128;
        if (i99 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:181:0x057e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:182:0x057f  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    /* JADX WARN: Code duplicated, block: B:97:0x0299  */
    public final void c(Context context, XmlPullParser xmlPullParser) {
        String strSubstring;
        int i;
        Resources resources;
        String packageName;
        int i2;
        int identifier;
        int i3;
        int i4;
        HashMap<Integer, b.aJN> map;
        Integer numValueOf;
        int i5 = 2 % 2;
        b bVar = new b();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i6 = b;
        int i7 = i6 & 7;
        int i8 = i7 + ((i6 ^ 7) | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < attributeCount) {
            int i11 = a;
            int i12 = i11 & 65;
            int i13 = i12 + ((i11 ^ 65) | i12);
            b = i13 % 128;
            Object obj = null;
            if (i13 % 2 != 0) {
                "id".equals(xmlPullParser.getAttributeName(i10));
                obj.hashCode();
                throw null;
            }
            if ("id".equals(xmlPullParser.getAttributeName(i10))) {
                int i14 = b;
                int i15 = i14 & 73;
                int i16 = -(-((i14 ^ 73) | i15));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int i19 = a;
                int i20 = i19 ^ 51;
                int i21 = (((i19 & 51) | i20) << 1) - i20;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 1 / 0;
                    if (attributeValue.contains("/")) {
                        strSubstring = attributeValue.substring((-2) - ((attributeValue.indexOf(47) + 2) ^ (-1)));
                        int i23 = a;
                        int i24 = i23 & 121;
                        int i25 = -(-(i23 | 121));
                        i = (i24 ^ i25) + ((i25 & i24) << 1);
                        b = i % 128;
                        if (i % 2 != 0) {
                            resources = context.getResources();
                            packageName = context.getPackageName();
                            int i26 = 70 / 0;
                        } else {
                            resources = context.getResources();
                            packageName = context.getPackageName();
                        }
                        i2 = b + 15;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            identifier = resources.getIdentifier(strSubstring, "id", packageName);
                            int i27 = 53 / 0;
                        } else {
                            identifier = resources.getIdentifier(strSubstring, "id", packageName);
                        }
                    } else {
                        int i28 = b + 35;
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        identifier = -1;
                    }
                } else if (attributeValue.contains("/")) {
                    strSubstring = attributeValue.substring((-2) - ((attributeValue.indexOf(47) + 2) ^ (-1)));
                    int i210 = a;
                    int i211 = i210 & 121;
                    int i212 = -(-(i210 | 121));
                    i = (i211 ^ i212) + ((i212 & i211) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        resources = context.getResources();
                        packageName = context.getPackageName();
                        int i213 = 70 / 0;
                    } else {
                        resources = context.getResources();
                        packageName = context.getPackageName();
                    }
                    i2 = b + 15;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        identifier = resources.getIdentifier(strSubstring, "id", packageName);
                        int i214 = 53 / 0;
                    } else {
                        identifier = resources.getIdentifier(strSubstring, "id", packageName);
                    }
                } else {
                    int i215 = b + 35;
                    a = i215 % 128;
                    int i216 = i215 % 2;
                    identifier = -1;
                }
                if (identifier == -1) {
                    int i30 = b;
                    int i31 = i30 & 105;
                    int i32 = (((i30 ^ 105) | i31) << 1) - ((i30 | 105) & (~i31));
                    a = i32 % 128;
                    if (i32 % 2 != 0 ? attributeValue.length() <= 1 : attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                        int i33 = a;
                        int i34 = (i33 & (-76)) | ((~i33) & 75);
                        int i35 = (i33 & 75) << 1;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        b = i36 % 128;
                        int i37 = i36 % 2;
                    } else {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                try {
                    int eventType = xmlPullParser.getEventType();
                    b.aJN ajnF = null;
                    while (eventType != 1) {
                        int i38 = a;
                        byte b2 = 5;
                        int i39 = (((i38 ^ 5) | (i38 & 5)) << 1) - (((~i38) & 5) | (i38 & (-6)));
                        int i40 = i39 % 128;
                        b = i40;
                        int i41 = i39 % 2;
                        if (eventType != 0) {
                            int i42 = i40 & 119;
                            int i43 = ((i40 ^ 119) | i42) << 1;
                            int i44 = -((~i42) & (i40 | 119));
                            int i45 = (i43 & i44) + (i43 | i44);
                            a = i45 % 128;
                            if (i45 % 2 != 0 ? eventType == 2 : eventType == 3) {
                                String name = xmlPullParser.getName();
                                switch (name.hashCode()) {
                                    case -2025855158:
                                        if (!name.equals("Layout")) {
                                            b2 = -1;
                                        } else {
                                            int i46 = b;
                                            int i47 = (((i46 | 78) << 1) - (i46 ^ 78)) - 1;
                                            a = i47 % 128;
                                            int i48 = i47 % 2;
                                            int i49 = i46 & 35;
                                            int i50 = -(-((i46 ^ 35) | i49));
                                            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                                            a = i51 % 128;
                                            if (i51 % 2 == 0) {
                                                int i52 = 4 % 5;
                                            }
                                        }
                                        break;
                                    case -1984451626:
                                        if (!name.equals("Motion")) {
                                            b2 = -1;
                                        } else {
                                            int i53 = b;
                                            int i54 = i53 & 109;
                                            int i55 = ((((i53 ^ 109) | i54) << 1) - (~(-((~i54) & (i53 | 109))))) - 1;
                                            a = i55 % 128;
                                            int i56 = i55 % 2;
                                            int i57 = (-2) - (((i53 ^ 60) + ((i53 & 60) << 1)) ^ (-1));
                                            a = i57 % 128;
                                            int i58 = i57 % 2;
                                            b2 = 6;
                                        }
                                        break;
                                    case -1269513683:
                                        if (!name.equals("PropertySet")) {
                                            b2 = -1;
                                        } else {
                                            int i59 = b + 105;
                                            a = i59 % 128;
                                            if (i59 % 2 != 0) {
                                                b2 = 3;
                                            } else {
                                                b2 = 2;
                                            }
                                        }
                                        break;
                                    case -1238332596:
                                        if (name.equals("Transform")) {
                                            int i60 = a + 23;
                                            b = i60 % 128;
                                            int i61 = i60 % 2;
                                            b2 = 4;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case -71750448:
                                        if (name.equals("Guideline")) {
                                            int i62 = a + 53;
                                            b = i62 % 128;
                                            int i63 = i62 % 2;
                                            b2 = 1;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 1331510167:
                                        if (!name.equals("Barrier")) {
                                            b2 = -1;
                                        } else {
                                            int i64 = b;
                                            int i65 = ((i64 | 43) << 1) - (i64 ^ 43);
                                            a = i65 % 128;
                                            if (i65 % 2 != 0) {
                                                b2 = 2;
                                            } else {
                                                b2 = 3;
                                            }
                                        }
                                        break;
                                    case 1791837707:
                                        if (!name.equals("CustomAttribute")) {
                                            b2 = -1;
                                        } else {
                                            int i66 = b;
                                            int i67 = (((i66 & (-122)) | ((~i66) & 121)) - (~((i66 & 121) << 1))) - 1;
                                            a = i67 % 128;
                                            int i68 = i67 % 2;
                                            int i69 = ((i66 ^ 103) | (i66 & 103)) << 1;
                                            int i70 = -(((~i66) & 103) | (i66 & (-104)));
                                            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                                            a = i71 % 128;
                                            if (i71 % 2 == 0) {
                                                int i72 = 4 % 2;
                                            }
                                            b2 = 7;
                                        }
                                        break;
                                    case 1803088381:
                                        if (!name.equals("Constraint")) {
                                            b2 = -1;
                                        } else {
                                            int i73 = (-2) - ((a + 56) ^ (-1));
                                            int i74 = i73 % 128;
                                            b = i74;
                                            b2 = i73 % 2 != 0 ? (byte) 1 : (byte) 0;
                                            int i75 = (i74 & (-42)) | ((~i74) & 41);
                                            int i76 = -(-((i74 & 41) << 1));
                                            int i77 = (i75 & i76) + (i75 | i76);
                                            a = i77 % 128;
                                            int i78 = i77 % 2;
                                        }
                                        break;
                                    default:
                                        int i79 = b + 123;
                                        a = i79 % 128;
                                        int i80 = i79 % 2;
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        ajnF = bVar.f(context, Xml.asAttributeSet(xmlPullParser));
                                        break;
                                    case 1:
                                        ajnF = bVar.f(context, Xml.asAttributeSet(xmlPullParser));
                                        b.aJO ajo = ajnF.d;
                                        int i81 = a;
                                        int i82 = i81 & 49;
                                        int i83 = (i81 | 49) & (~i82);
                                        int i84 = -(-(i82 << 1));
                                        int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                                        b = i85 % 128;
                                        if (i85 % 2 == 0) {
                                            ajo.c = true;
                                            ajo.d = true;
                                        } else {
                                            ajo.c = false;
                                            ajo.d = false;
                                        }
                                        break;
                                    case 2:
                                        ajnF = bVar.f(context, Xml.asAttributeSet(xmlPullParser));
                                        b.aJO ajo2 = ajnF.d;
                                        int i86 = a + 49;
                                        b = i86 % 128;
                                        if (i86 % 2 == 0) {
                                            ajo2.ad = 1;
                                        } else {
                                            ajo2.ad = 1;
                                        }
                                        break;
                                    case 3:
                                        if (ajnF == null) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("XML parser error must be within a Constraint ");
                                            sb.append(xmlPullParser.getLineNumber());
                                            RuntimeException runtimeException = new RuntimeException(sb.toString());
                                            int i87 = b;
                                            int i88 = (i87 ^ 27) + ((i87 & 27) << 1);
                                            a = i88 % 128;
                                            int i89 = i88 % 2;
                                            throw runtimeException;
                                        }
                                        int i90 = b + 51;
                                        a = i90 % 128;
                                        if (i90 % 2 == 0) {
                                            ajnF.b.b(context, Xml.asAttributeSet(xmlPullParser));
                                            int i91 = 11 / 0;
                                        } else {
                                            ajnF.b.b(context, Xml.asAttributeSet(xmlPullParser));
                                        }
                                        int i92 = b;
                                        int i93 = i92 + 115;
                                        a = i93 % 128;
                                        int i94 = i93 % 2;
                                        int i95 = (i92 | 49) << 1;
                                        int i96 = -(i92 ^ 49);
                                        int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                        a = i97 % 128;
                                        int i98 = i97 % 2;
                                        break;
                                        break;
                                    case 4:
                                        if (ajnF == null) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("XML parser error must be within a Constraint ");
                                            sb2.append(xmlPullParser.getLineNumber());
                                            RuntimeException runtimeException2 = new RuntimeException(sb2.toString());
                                            int i99 = b;
                                            int i100 = i99 & 69;
                                            int i101 = (i99 ^ 69) | i100;
                                            int i102 = (i100 & i101) + (i101 | i100);
                                            a = i102 % 128;
                                            int i103 = i102 % 2;
                                            throw runtimeException2;
                                        }
                                        int i104 = b;
                                        int i105 = (i104 | 95) << 1;
                                        int i106 = -(i104 ^ 95);
                                        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                                        a = i107 % 128;
                                        if (i107 % 2 == 0) {
                                            ajnF.f.c(context, Xml.asAttributeSet(xmlPullParser));
                                            obj.hashCode();
                                            throw null;
                                        }
                                        ajnF.f.c(context, Xml.asAttributeSet(xmlPullParser));
                                        int i108 = b;
                                        i4 = ((i108 | 103) << 1) - (((~i108) & 103) | (i108 & (-104)));
                                        break;
                                        break;
                                    case 5:
                                        if (ajnF == null) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("XML parser error must be within a Constraint ");
                                            sb3.append(xmlPullParser.getLineNumber());
                                            RuntimeException runtimeException3 = new RuntimeException(sb3.toString());
                                            int i109 = a;
                                            int i110 = i109 & 97;
                                            int i111 = (i109 | 97) & (~i110);
                                            int i112 = -(-(i110 << 1));
                                            int i113 = (i111 & i112) + (i111 | i112);
                                            b = i113 % 128;
                                            int i114 = i113 % 2;
                                            throw runtimeException3;
                                        }
                                        int i115 = b;
                                        int i116 = i115 & 43;
                                        int i117 = i116 + ((i115 ^ 43) | i116);
                                        a = i117 % 128;
                                        if (i117 % 2 != 0) {
                                            ajnF.d.c(context, Xml.asAttributeSet(xmlPullParser));
                                        } else {
                                            ajnF.d.c(context, Xml.asAttributeSet(xmlPullParser));
                                            int i118 = 42 / 0;
                                        }
                                        break;
                                        break;
                                    case 6:
                                        if (ajnF == null) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("XML parser error must be within a Constraint ");
                                            sb4.append(xmlPullParser.getLineNumber());
                                            RuntimeException runtimeException4 = new RuntimeException(sb4.toString());
                                            int i119 = a;
                                            int i120 = i119 & 53;
                                            int i121 = i119 | 53;
                                            int i122 = (i120 & i121) + (i121 | i120);
                                            b = i122 % 128;
                                            int i123 = i122 % 2;
                                            throw runtimeException4;
                                        }
                                        int i124 = a - (-1);
                                        b = i124 % 128;
                                        int i125 = i124 % 2;
                                        ajnF.c.c(context, Xml.asAttributeSet(xmlPullParser));
                                        int i126 = b;
                                        int i127 = i126 & 57;
                                        int i128 = (i127 - (~(-(-((i126 ^ 57) | i127))))) - 1;
                                        int i129 = i128 % 128;
                                        a = i129;
                                        int i130 = i128 % 2;
                                        int i131 = i129 & 63;
                                        i4 = ((((i129 ^ 63) | i131) << 1) - (~(-((i129 | 63) & (~i131))))) - 1;
                                        b = i4 % 128;
                                        int i132 = i4 % 2;
                                        break;
                                        break;
                                    case 7:
                                        if (ajnF == null) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("XML parser error must be within a Constraint ");
                                            sb5.append(xmlPullParser.getLineNumber());
                                            RuntimeException runtimeException5 = new RuntimeException(sb5.toString());
                                            int i133 = a;
                                            int i134 = i133 & 89;
                                            int i135 = i134 + ((i133 ^ 89) | i134);
                                            b = i135 % 128;
                                            int i136 = i135 % 2;
                                            throw runtimeException5;
                                        }
                                        int i137 = b;
                                        int i138 = i137 & 85;
                                        int i139 = (((i137 | 85) & (~i138)) - (~(-(-(i138 << 1))))) - 1;
                                        a = i139 % 128;
                                        int i140 = i139 % 2;
                                        j.d(context, xmlPullParser, ajnF.e);
                                        int i141 = b;
                                        int i142 = (((i141 ^ 95) | (i141 & 95)) << 1) - ((i141 & (-96)) | ((~i141) & 95));
                                        a = i142 % 128;
                                        int i143 = i142 % 2;
                                        int i144 = i141 & 41;
                                        int i145 = -(-((i141 ^ 41) | i144));
                                        int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                                        a = i146 % 128;
                                        int i147 = i146 % 2;
                                        break;
                                        break;
                                }
                            } else if (eventType != 3) {
                                int i148 = i40 & 9;
                                int i149 = (i148 - (~((i40 ^ 9) | i148))) - 1;
                                a = i149 % 128;
                                int i150 = i149 % 2;
                            } else {
                                String name2 = xmlPullParser.getName();
                                if ("ConstraintSet".equals(name2)) {
                                    int i151 = b;
                                    int i152 = i151 & 65;
                                    int i153 = -(-((i151 ^ 65) | i152));
                                    int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
                                    a = i154 % 128;
                                    int i155 = i154 % 2;
                                    this.d.put(identifier, bVar);
                                    i3 = b + 85;
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                if (name2.equalsIgnoreCase("Constraint")) {
                                    int i156 = b;
                                    int i157 = i156 | 79;
                                    int i158 = ((i157 << 1) - (~(-((~(i156 & 79)) & i157)))) - 1;
                                    a = i158 % 128;
                                    if (i158 % 2 == 0) {
                                        map = bVar.e;
                                        numValueOf = Integer.valueOf(ajnF.a);
                                        int i159 = 48 / 0;
                                    } else {
                                        map = bVar.e;
                                        numValueOf = Integer.valueOf(ajnF.a);
                                    }
                                    map.put(numValueOf, ajnF);
                                    ajnF = null;
                                }
                            }
                            eventType = xmlPullParser.next();
                            int i160 = a;
                            int i161 = ((i160 | 97) << 1) - (((~i160) & 97) | (i160 & (-98)));
                            b = i161 % 128;
                            int i162 = i161 % 2;
                        } else {
                            xmlPullParser.getName();
                            int i163 = b;
                            i4 = ((((i163 ^ 23) | (i163 & 23)) << 1) - (~(-(((~i163) & 23) | (i163 & (-24)))))) - 1;
                        }
                        a = i4 % 128;
                        int i1310 = i4 % 2;
                        eventType = xmlPullParser.next();
                        int i164 = a;
                        int i165 = ((i164 | 97) << 1) - (((~i164) & 97) | (i164 & (-98)));
                        b = i165 % 128;
                        int i166 = i165 % 2;
                    }
                } catch (IOException | XmlPullParserException unused) {
                }
                this.d.put(identifier, bVar);
                i3 = b + 85;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i167 = i10 & 1;
            int i168 = (i10 ^ 1) | i167;
            i10 = ((i167 | i168) << 1) - (i168 ^ i167);
        }
        int i169 = a;
        int i170 = (i169 ^ 73) + ((i169 & 73) << 1);
        b = i170 % 128;
        int i171 = i170 % 2;
    }
}
