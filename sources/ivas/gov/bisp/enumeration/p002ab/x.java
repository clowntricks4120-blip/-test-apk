package ivas.gov.bisp.enumeration.p002ab;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import ivas.gov.bisp.enumeration.O.r;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static int a = 0;
    private static int b = 1;
    public final Shader c;
    public final ColorStateList d;
    public int e;

    public x(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.d = colorStateList;
        this.e = i;
    }

    public final boolean d() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 107;
        int i4 = ((((i2 & 107) | i3) << 1) - (~(-i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.c != null) {
            int i6 = i5 + 5;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i5 & (-52)) | ((~i5) & 51)) + ((i5 & 51) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = i2 + 91;
            b = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        int i12 = a;
        int i13 = i12 & 33;
        int i14 = (i12 ^ 33) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    public final boolean e() {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 41;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (this.c == null) {
            int i5 = i3 & 117;
            int i6 = ((i3 ^ 117) | i5) << 1;
            int i7 = -((i3 | 117) & (~i5));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            ColorStateList colorStateList = this.d;
            if (colorStateList == null || !colorStateList.isStateful()) {
                int i9 = a;
                int i10 = (i9 & 47) + (i9 | 47);
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            } else {
                int i12 = a;
                int i13 = i12 & 43;
                int i14 = (((~i13) & (i12 | 43)) - (~(-(-(i13 << 1))))) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i12 & 41;
                int i17 = i12 | 41;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                z = true;
            }
        } else {
            int i20 = a;
            int i110 = (i20 & 47) + (i20 | 47);
            b = i110 % 128;
            int i111 = i110 % 2;
            z = false;
        }
        int i21 = a;
        int i22 = i21 & 39;
        int i23 = (i21 | 39) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 77 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006c  */
    public final boolean f(int[] iArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!e()) {
            int i7 = a;
            int i8 = ((i7 & 108) + (i7 | 108)) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        } else {
            int i10 = b;
            int i11 = (i10 & 117) + (i10 | 117);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                ColorStateList colorStateList = this.d;
                colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ColorStateList colorStateList2 = this.d;
            int colorForState = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            int i12 = a;
            int i13 = ((i12 | 99) << 1) - (i12 ^ 99);
            int i14 = i13 % 128;
            b = i14;
            int i15 = i13 % 2;
            if (colorForState != this.e) {
                int i16 = i14 + 77;
                a = i16 % 128;
                int i17 = i16 % 2;
                this.e = colorForState;
                int i18 = i14 & 93;
                int i19 = (i14 | 93) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                z = true;
            } else {
                int i23 = a;
                int i24 = ((i23 & 108) + (i23 | 108)) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
                z = false;
            }
        }
        int i26 = b;
        int i27 = (i26 ^ 29) + ((i26 & 29) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 77 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0348  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:117:0x0424  */
    /* JADX WARN: Code duplicated, block: B:124:0x044b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0451  */
    /* JADX WARN: Code duplicated, block: B:127:0x045e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0470 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0472  */
    /* JADX WARN: Code duplicated, block: B:131:0x0488  */
    /* JADX WARN: Code duplicated, block: B:132:0x049d  */
    /* JADX WARN: Code duplicated, block: B:134:0x049f A[PHI: r0
  0x049f: PHI (r0v11 ivas.gov.bisp.enumeration.ab.N) = (r0v10 ivas.gov.bisp.enumeration.ab.N), (r0v46 ivas.gov.bisp.enumeration.ab.N) binds: [B:126:0x045c, B:130:0x0472] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:144:0x0502  */
    /* JADX WARN: Code duplicated, block: B:147:0x0532  */
    /* JADX WARN: Code duplicated, block: B:148:0x0536  */
    /* JADX WARN: Code duplicated, block: B:151:0x0557  */
    /* JADX WARN: Code duplicated, block: B:153:0x0559  */
    /* JADX WARN: Code duplicated, block: B:155:0x0563  */
    /* JADX WARN: Code duplicated, block: B:157:0x0575  */
    /* JADX WARN: Code duplicated, block: B:160:0x057c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0582 A[PHI: r0 r1
  0x0582: PHI (r0v15 float[]) = (r0v14 float[]), (r0v18 float[]) binds: [B:161:0x0580, B:158:0x0579] A[DONT_GENERATE, DONT_INLINE]
  0x0582: PHI (r1v15 int[]) = (r1v14 int[]), (r1v19 int[]) binds: [B:161:0x0580, B:158:0x0579] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x0595  */
    /* JADX WARN: Code duplicated, block: B:167:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x05a1 A[PHI: r0 r1
  0x05a1: PHI (r0v17 float[]) = (r0v14 float[]), (r0v18 float[]) binds: [B:161:0x0580, B:158:0x0579] A[DONT_GENERATE, DONT_INLINE]
  0x05a1: PHI (r1v18 int[]) = (r1v14 int[]), (r1v19 int[]) binds: [B:161:0x0580, B:158:0x0579] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x05af  */
    /* JADX WARN: Code duplicated, block: B:176:0x05da  */
    /* JADX WARN: Code duplicated, block: B:178:0x05de  */
    /* JADX WARN: Code duplicated, block: B:192:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0445 A[EDGE_INSN: B:194:0x0445->B:122:0x0445 BREAK  A[LOOP:1: B:82:0x02ea->B:118:0x0438], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0445 A[EDGE_INSN: B:195:0x0445->B:122:0x0445 BREAK  A[LOOP:1: B:82:0x02ea->B:118:0x0438], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x014a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:39:0x0171  */
    /* JADX WARN: Code duplicated, block: B:40:0x0185  */
    /* JADX WARN: Code duplicated, block: B:43:0x0194  */
    /* JADX WARN: Code duplicated, block: B:44:0x0196  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0201  */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    /* JADX WARN: Code duplicated, block: B:62:0x0239  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0254  */
    /* JADX WARN: Code duplicated, block: B:68:0x025e  */
    /* JADX WARN: Code duplicated, block: B:69:0x026d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0279  */
    /* JADX WARN: Code duplicated, block: B:74:0x0292  */
    /* JADX WARN: Code duplicated, block: B:75:0x0294  */
    /* JADX WARN: Code duplicated, block: B:76:0x0296  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0309  */
    /* JADX WARN: Code duplicated, block: B:88:0x030f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0326  */
    /* JADX WARN: Code duplicated, block: B:95:0x032a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0330  */
    public static x c(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        int color;
        boolean zD;
        int color2;
        int i3;
        int color3;
        int i4;
        float f8;
        int i5;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f9;
        float f10;
        int next2;
        float f11;
        N n;
        int i6;
        float f12;
        int i7;
        int i8;
        int[] iArr;
        float[] fArr;
        Shader.TileMode tileMode;
        Shader radialGradient;
        int i9;
        int i10;
        int i11;
        int i12;
        Shader.TileMode tileMode2;
        int i13;
        int i14;
        int i15;
        int i16;
        int depth;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Resources resources2 = resources;
        int i22 = 2 % 2;
        int i23 = b + 3;
        a = i23 % 128;
        int i24 = i23 % 2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            next = xml.next();
            if (next == 2) {
                break;
            }
            int i25 = a;
            int i26 = ((i25 ^ 97) | (i25 & 97)) << 1;
            int i27 = -(((~i25) & 97) | (i25 & (-98)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                if (next == 1) {
                    break;
                }
            } else if (next == 1) {
                break;
            }
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        int i29 = a;
        int i30 = i29 & 87;
        int i31 = (i29 | 87) & (~i30);
        int i32 = -(-(i30 << 1));
        int i33 = (i31 & i32) + (i31 | i32);
        b = i33 % 128;
        int i34 = i33 % 2;
        String name = xml.getName();
        Objects.requireNonNull(name);
        int i35 = a + 95;
        b = i35 % 128;
        int i36 = i35 % 2;
        if (!name.equals("gradient")) {
            int i37 = a;
            int i38 = (i37 ^ 11) + ((i37 & 11) << 1);
            b = i38 % 128;
            int i39 = i38 % 2;
            if (name.equals("selector")) {
                ColorStateList colorStateListC = J.c(resources2, xml, attributeSetAsAttributeSet, theme);
                return new x(null, colorStateListC, colorStateListC.getDefaultColor());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            int i40 = b;
            int i41 = i40 & 11;
            int i42 = ((i40 ^ 11) | i41) << 1;
            int i43 = -((i40 | 11) & (~i41));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xml.getPositionDescription());
            sb2.append(": invalid gradient color tag ");
            sb2.append(name2);
            throw new XmlPullParserException(sb2.toString());
        }
        TypedArray typedArrayE = Q.e(resources2, theme, attributeSetAsAttributeSet, r.g);
        int i46 = b + 1;
        a = i46 % 128;
        int i47 = i46 % 2;
        if (Q.d(xml, "startX")) {
            float f13 = typedArrayE.getFloat(8, 0.0f);
            int i48 = b;
            int i49 = i48 & 69;
            int i50 = i49 + ((i48 ^ 69) | i49);
            a = i50 % 128;
            int i51 = i50 % 2;
            f = f13;
        } else {
            int i52 = b;
            int i53 = (-2) - ((((i52 | 4) << 1) - (i52 ^ 4)) ^ (-1));
            int i54 = i53 % 128;
            a = i54;
            int i55 = i53 % 2;
            int i56 = i54 ^ 125;
            int i57 = (i54 & 125) << 1;
            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
            b = i58 % 128;
            int i59 = i58 % 2;
            f = 0.0f;
        }
        if (!Q.d(xml, "startY")) {
            int i60 = b + 19;
            a = i60 % 128;
            if (i60 % 2 != 0) {
                f3 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (!Q.d(xml, "endX")) {
                int i61 = a;
                int i62 = i61 & 63;
                int i63 = (i61 | 63) & (~i62);
                int i64 = -(-(i62 << 1));
                int i65 = (i63 & i64) + (i63 | i64);
                b = i65 % 128;
                int i66 = i65 % 2;
                f4 = 0.0f;
            } else {
                f4 = typedArrayE.getFloat(10, 0.0f);
            }
            if (!Q.d(xml, "endY")) {
                int i67 = a;
                int i68 = i67 ^ 35;
                int i69 = (i67 & 35) << 1;
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                b = i70 % 128;
                int i71 = i70 % 2;
                f5 = 0.0f;
            } else {
                f5 = typedArrayE.getFloat(11, 0.0f);
            }
            if (Q.d(xml, "centerX")) {
                f6 = typedArrayE.getFloat(3, 0.0f);
                int i72 = b;
                int i73 = i72 & 11;
                int i74 = (11 ^ i72) | i73;
                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                a = i75 % 128;
                int i76 = i75 % 2;
            } else {
                f6 = 0.0f;
            }
            if (!Q.d(xml, "centerY")) {
                int i77 = a;
                int i78 = i77 & 93;
                int i79 = -(-((i77 ^ 93) | i78));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                b = i80 % 128;
                int i81 = i80 % 2;
                f7 = 0.0f;
            } else {
                f7 = typedArrayE.getFloat(4, 0.0f);
            }
            if (Q.d(xml, "type")) {
                i2 = typedArrayE.getInt(2, 0);
            } else {
                int i82 = b;
                int i83 = (i82 & 41) + (i82 | 41);
                a = i83 % 128;
                int i84 = i83 % 2;
                i2 = 0;
            }
            if (Q.d(xml, "startColor")) {
                color = typedArrayE.getColor(0, 0);
            } else {
                int i85 = b;
                int i86 = ((i85 | 57) << 1) - (i85 ^ 57);
                a = i86 % 128;
                int i87 = i86 % 2;
                color = 0;
            }
            zD = Q.d(xml, "centerColor");
            int i88 = b;
            int i89 = (((i88 ^ 119) | (i88 & 119)) << 1) - ((i88 & (-120)) | ((~i88) & 119));
            a = i89 % 128;
            int i90 = i89 % 2;
            if (Q.d(xml, "centerColor")) {
                color2 = typedArrayE.getColor(7, 0);
                int i91 = a;
                int i92 = i91 & 105;
                i3 = (((~i92) & (i91 | 105)) - (~(i92 << 1))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i93 = 5 / 2;
                }
            } else {
                int i94 = a;
                i21 = (i94 & 115) + (i94 | 115);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    color2 = 1;
                } else {
                    color2 = 0;
                }
            }
            if (Q.d(xml, "endColor")) {
                color3 = typedArrayE.getColor(1, 0);
            } else {
                int i95 = b;
                int i96 = i95 & 53;
                int i97 = i96 + ((i95 ^ 53) | i96);
                a = i97 % 128;
                int i98 = i97 % 2;
                color3 = 0;
            }
            if (Q.d(xml, "tileMode")) {
                i4 = typedArrayE.getInt(6, 0);
            } else {
                int i99 = b;
                int i100 = (i99 & (-88)) | ((~i99) & 87);
                int i101 = -(-((i99 & 87) << 1));
                i20 = ((i100 | i101) << 1) - (i101 ^ i100);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
            }
            if (Q.d(xml, "gradientRadius")) {
                f8 = typedArrayE.getFloat(5, 0.0f);
            } else {
                int i102 = b + 29;
                a = i102 % 128;
                int i103 = i102 % 2;
                f8 = 0.0f;
            }
            typedArrayE.recycle();
            int depth2 = xml.getDepth();
            int i104 = depth2 & 1;
            i5 = (i104 - (~((depth2 ^ 1) | i104))) - 1;
            arrayList = new ArrayList(20);
            arrayList2 = new ArrayList(20);
            int i105 = b;
            f9 = f8;
            int i106 = i105 & 87;
            f10 = f6;
            int i107 = (i105 | 87) & (~i106);
            int i108 = -(-(i106 << 1));
            int i109 = (i107 & i108) + (i107 | i108);
            a = i109 % 128;
            int i110 = i109 % 2;
            while (true) {
                next2 = xml.next();
                if (next2 != 1) {
                    f11 = f7;
                    break;
                }
                int i111 = b;
                int i112 = i111 & 123;
                int i113 = (i111 ^ 123) | i112;
                i16 = ((i112 | i113) << 1) - (i112 ^ i113);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    xml.getDepth();
                    throw null;
                }
                depth = xml.getDepth();
                if (depth < i5) {
                    int i114 = b;
                    int i115 = i114 & 69;
                    i19 = i115 + ((i114 ^ 69) | i115);
                    f11 = f7;
                    a = i19 % 128;
                    i17 = 2;
                    if (i19 % 2 != 0) {
                        if (next2 == 3) {
                            break;
                        }
                        if (next2 == i17) {
                            int i116 = a;
                            int i117 = i116 & 63;
                            int i118 = -(-((i116 ^ 63) | i117));
                            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                            b = i119 % 128;
                            int i120 = i119 % 2;
                            if (depth > i5 && xml.getName().equals("item")) {
                                int i121 = b;
                                int i122 = i121 & 49;
                                int i123 = ((i121 ^ 49) | i122) << 1;
                                int i124 = -((i121 | 49) & (~i122));
                                int i125 = (i123 & i124) + (i124 | i123);
                                a = i125 % 128;
                                int i126 = i125 % 2;
                                TypedArray typedArrayE2 = Q.e(resources2, theme, attributeSetAsAttributeSet, r.i);
                                int i127 = b;
                                int i128 = (((i127 | 8) << 1) - (i127 ^ 8)) - 1;
                                a = i128 % 128;
                                int i129 = i128 % 2;
                                boolean zHasValue = typedArrayE2.hasValue(0);
                                boolean zHasValue2 = typedArrayE2.hasValue(1);
                                int i130 = b;
                                int i131 = i130 + 115;
                                a = i131 % 128;
                                if (i131 % 2 != 0) {
                                    int i132 = 83 / 0;
                                    if (zHasValue) {
                                        i18 = (((i130 & (-30)) | ((~i130) & 29)) - (~(-(-((i130 & 29) << 1))))) - 1;
                                        a = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            Object obj = null;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (!(!zHasValue2)) {
                                            int color4 = typedArrayE2.getColor(0, 0);
                                            float f14 = typedArrayE2.getFloat(1, 0.0f);
                                            int i133 = a;
                                            int i134 = i133 & 115;
                                            int i135 = (i133 | 115) & (~i134);
                                            int i136 = i134 << 1;
                                            int i137 = (i135 & i136) + (i136 | i135);
                                            b = i137 % 128;
                                            int i138 = i137 % 2;
                                            typedArrayE2.recycle();
                                            arrayList2.add(Integer.valueOf(color4));
                                            int i139 = b;
                                            int i140 = i139 & 73;
                                            int i141 = (i139 | 73) & (~i140);
                                            int i142 = i140 << 1;
                                            int i143 = (i141 ^ i142) + ((i141 & i142) << 1);
                                            a = i143 % 128;
                                            int i144 = i143 % 2;
                                            arrayList.add(Float.valueOf(f14));
                                        }
                                    }
                                } else if (zHasValue) {
                                    i18 = (((i130 & (-30)) | ((~i130) & 29)) - (~(-(-((i130 & 29) << 1))))) - 1;
                                    a = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (!(!zHasValue2)) {
                                        int color5 = typedArrayE2.getColor(0, 0);
                                        float f15 = typedArrayE2.getFloat(1, 0.0f);
                                        int i1310 = a;
                                        int i1311 = i1310 & 115;
                                        int i1312 = (i1310 | 115) & (~i1311);
                                        int i1313 = i1311 << 1;
                                        int i1314 = (i1312 & i1313) + (i1313 | i1312);
                                        b = i1314 % 128;
                                        int i1315 = i1314 % 2;
                                        typedArrayE2.recycle();
                                        arrayList2.add(Integer.valueOf(color5));
                                        int i1316 = b;
                                        int i145 = i1316 & 73;
                                        int i146 = (i1316 | 73) & (~i145);
                                        int i147 = i145 << 1;
                                        int i148 = (i146 ^ i147) + ((i146 & i147) << 1);
                                        a = i148 % 128;
                                        int i149 = i148 % 2;
                                        arrayList.add(Float.valueOf(f15));
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(xml.getPositionDescription());
                                sb3.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                                throw new XmlPullParserException(sb3.toString());
                            }
                            int i150 = a;
                            int i151 = i150 & 35;
                            int i152 = i150 | 35;
                            int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
                            b = i153 % 128;
                            int i154 = i153 % 2;
                        } else {
                            int i155 = a;
                            int i156 = i155 & 35;
                            int i157 = i155 | 35;
                            int i158 = (i156 ^ i157) + ((i157 & i156) << 1);
                            b = i158 % 128;
                            int i159 = i158 % 2;
                        }
                        resources2 = resources;
                        f7 = f11;
                    } else if (next2 == 2) {
                        break;
                    }
                } else {
                    f11 = f7;
                    i17 = 2;
                }
                if (next2 == i17) {
                    int i1110 = a;
                    int i1111 = i1110 & 63;
                    int i1112 = -(-((i1110 ^ 63) | i1111));
                    int i1113 = (i1111 ^ i1112) + ((i1112 & i1111) << 1);
                    b = i1113 % 128;
                    int i1210 = i1113 % 2;
                    if (depth > i5) {
                        int i1510 = a;
                        int i1511 = i1510 & 35;
                        int i1512 = i1510 | 35;
                        int i1513 = (i1511 ^ i1512) + ((i1512 & i1511) << 1);
                        b = i1513 % 128;
                        int i1514 = i1513 % 2;
                    } else {
                        int i1515 = a;
                        int i1516 = i1515 & 35;
                        int i1517 = i1515 | 35;
                        int i1518 = (i1516 ^ i1517) + ((i1517 & i1516) << 1);
                        b = i1518 % 128;
                        int i1519 = i1518 % 2;
                    }
                } else {
                    int i15110 = a;
                    int i15111 = i15110 & 35;
                    int i15112 = i15110 | 35;
                    int i15113 = (i15111 ^ i15112) + ((i15112 & i15111) << 1);
                    b = i15113 % 128;
                    int i15114 = i15113 % 2;
                }
                resources2 = resources;
                f7 = f11;
            }
            if (arrayList2.size() > 0) {
                n = new N(arrayList2, arrayList);
            } else {
                int i160 = b + 41;
                a = i160 % 128;
                int i161 = i160 % 2;
                n = null;
            }
            if (n == null) {
                int i162 = a;
                int i163 = i162 ^ 59;
                i15 = (((i162 & 59) | i163) << 1) - i163;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                if (zD) {
                    n = new N(color, color2, color3);
                    int i164 = b;
                    int i165 = ((i164 ^ 14) + ((i164 & 14) << 1)) - 1;
                    a = i165 % 128;
                    int i166 = i165 % 2;
                    i6 = 1;
                } else {
                    n = new N(color, color3);
                    int i167 = b;
                    i6 = 1;
                    int i168 = (i167 ^ 75) + ((i167 & 75) << 1);
                    a = i168 % 128;
                    int i169 = i168 % 2;
                }
            } else {
                i6 = 1;
            }
            if (i2 != i6) {
                int i170 = b;
                int i171 = (i170 & 19) + (i170 | 19);
                i11 = i171 % 128;
                a = i11;
                int i172 = i171 % 2;
                if (i2 != 2) {
                    int i173 = ((i11 & 73) - (~(i11 | 73))) - 1;
                    b = i173 % 128;
                    int i174 = i173 % 2;
                    int[] iArr2 = n.c;
                    float[] fArr2 = n.d;
                    if (i4 != 1) {
                        i14 = b;
                        int i175 = i14 & 79;
                        int i176 = (((~i175) & (i14 | 79)) - (~(i175 << 1))) - 1;
                        a = i176 % 128;
                        int i177 = i176 % 2;
                        if (i4 != 2) {
                            int i178 = i14 & 47;
                            int i179 = i14 | 47;
                            int i180 = (i178 ^ i179) + ((i178 & i179) << 1);
                            a = i180 % 128;
                            int i181 = i180 % 2;
                            tileMode2 = Shader.TileMode.CLAMP;
                            int i182 = b;
                            int i183 = i182 & 53;
                            int i184 = -(-(i182 | 53));
                            int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                            a = i185 % 128;
                            int i186 = i185 % 2;
                        } else {
                            tileMode2 = Shader.TileMode.MIRROR;
                        }
                    } else {
                        tileMode2 = Shader.TileMode.REPEAT;
                    }
                    i7 = 0;
                    radialGradient = new LinearGradient(f, f2, f4, f5, iArr2, fArr2, tileMode2);
                    int i187 = b;
                    int i188 = (i187 ^ 85) + ((i187 & 85) << 1);
                    int i189 = i188 % 128;
                    a = i189;
                    int i190 = i188 % 2;
                    int i191 = ((i189 | 74) << 1) - (i189 ^ 74);
                    i13 = (i191 ^ (-1)) + (i191 << 1);
                    b = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i192 = 3 / 2;
                    }
                } else {
                    i7 = 0;
                    radialGradient = new SweepGradient(f10, f11, n.c, n.d);
                    int i193 = b;
                    i12 = (i193 ^ 121) + ((i193 & 121) << 1);
                    a = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                f12 = f11;
                i7 = 0;
                if (f9 > 0.0f) {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                int i194 = a;
                i8 = (((i194 | 54) << 1) - (i194 ^ 54)) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    iArr = n.c;
                    fArr = n.d;
                    if (i4 != 1) {
                        int i195 = a;
                        int i196 = (-2) - (((i195 & 70) + (i195 | 70)) ^ (-1));
                        b = i196 % 128;
                        tileMode = (i196 % 2 == 0 ? i4 == 2 : i4 == 4) ? Shader.TileMode.MIRROR : Shader.TileMode.CLAMP;
                    } else {
                        tileMode = Shader.TileMode.REPEAT;
                        i9 = b + 113;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i197 = 3 / 2;
                        }
                    }
                } else {
                    iArr = n.c;
                    fArr = n.d;
                    if (i4 != 1) {
                        int i198 = a;
                        int i199 = (-2) - (((i198 & 70) + (i198 | 70)) ^ (-1));
                        b = i199 % 128;
                        if (i199 % 2 == 0) {
                        }
                    } else {
                        tileMode = Shader.TileMode.REPEAT;
                        i9 = b + 113;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i1910 = 3 / 2;
                        }
                    }
                }
                radialGradient = new RadialGradient(f10, f12, f9, iArr, fArr, tileMode);
            }
            x xVar = new x(radialGradient, null, i7);
            int i200 = b;
            int i201 = i200 & 69;
            i10 = i201 + ((i200 ^ 69) | i201);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i202 = 23 / i7;
            }
            return xVar;
        }
        f3 = typedArrayE.getFloat(9, 0.0f);
        f2 = f3;
        if (!Q.d(xml, "endX")) {
            int i610 = a;
            int i611 = i610 & 63;
            int i612 = (i610 | 63) & (~i611);
            int i613 = -(-(i611 << 1));
            int i614 = (i612 & i613) + (i612 | i613);
            b = i614 % 128;
            int i615 = i614 % 2;
            f4 = 0.0f;
        } else {
            f4 = typedArrayE.getFloat(10, 0.0f);
        }
        if (!Q.d(xml, "endY")) {
            int i616 = a;
            int i617 = i616 ^ 35;
            int i618 = (i616 & 35) << 1;
            int i710 = (i617 ^ i618) + ((i618 & i617) << 1);
            b = i710 % 128;
            int i711 = i710 % 2;
            f5 = 0.0f;
        } else {
            f5 = typedArrayE.getFloat(11, 0.0f);
        }
        if (Q.d(xml, "centerX")) {
            f6 = 0.0f;
        } else {
            f6 = typedArrayE.getFloat(3, 0.0f);
            int i712 = b;
            int i713 = i712 & 11;
            int i714 = (11 ^ i712) | i713;
            int i715 = ((i713 | i714) << 1) - (i714 ^ i713);
            a = i715 % 128;
            int i716 = i715 % 2;
        }
        if (!Q.d(xml, "centerY")) {
            int i717 = a;
            int i718 = i717 & 93;
            int i719 = -(-((i717 ^ 93) | i718));
            int i810 = (i718 ^ i719) + ((i719 & i718) << 1);
            b = i810 % 128;
            int i811 = i810 % 2;
            f7 = 0.0f;
        } else {
            f7 = typedArrayE.getFloat(4, 0.0f);
        }
        if (Q.d(xml, "type")) {
            int i812 = b;
            int i813 = (i812 & 41) + (i812 | 41);
            a = i813 % 128;
            int i814 = i813 % 2;
            i2 = 0;
        } else {
            i2 = typedArrayE.getInt(2, 0);
        }
        if (Q.d(xml, "startColor")) {
            int i815 = b;
            int i816 = ((i815 | 57) << 1) - (i815 ^ 57);
            a = i816 % 128;
            int i817 = i816 % 2;
            color = 0;
        } else {
            color = typedArrayE.getColor(0, 0);
        }
        zD = Q.d(xml, "centerColor");
        int i818 = b;
        int i819 = (((i818 ^ 119) | (i818 & 119)) << 1) - ((i818 & (-120)) | ((~i818) & 119));
        a = i819 % 128;
        int i910 = i819 % 2;
        if (Q.d(xml, "centerColor")) {
            int i911 = a;
            i21 = (i911 & 115) + (i911 | 115);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                color2 = 1;
            } else {
                color2 = 0;
            }
        } else {
            color2 = typedArrayE.getColor(7, 0);
            int i912 = a;
            int i913 = i912 & 105;
            i3 = (((~i913) & (i912 | 105)) - (~(i913 << 1))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i914 = 5 / 2;
            }
        }
        if (Q.d(xml, "endColor")) {
            int i915 = b;
            int i916 = i915 & 53;
            int i917 = i916 + ((i915 ^ 53) | i916);
            a = i917 % 128;
            int i918 = i917 % 2;
            color3 = 0;
        } else {
            color3 = typedArrayE.getColor(1, 0);
        }
        if (Q.d(xml, "tileMode")) {
            int i919 = b;
            int i1010 = (i919 & (-88)) | ((~i919) & 87);
            int i1011 = -(-((i919 & 87) << 1));
            i20 = ((i1010 | i1011) << 1) - (i1011 ^ i1010);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
        } else {
            i4 = typedArrayE.getInt(6, 0);
        }
        if (Q.d(xml, "gradientRadius")) {
            int i1012 = b + 29;
            a = i1012 % 128;
            int i1013 = i1012 % 2;
            f8 = 0.0f;
        } else {
            f8 = typedArrayE.getFloat(5, 0.0f);
        }
        typedArrayE.recycle();
        int depth3 = xml.getDepth();
        int i1014 = depth3 & 1;
        i5 = (i1014 - (~((depth3 ^ 1) | i1014))) - 1;
        arrayList = new ArrayList(20);
        arrayList2 = new ArrayList(20);
        int i1015 = b;
        f9 = f8;
        int i1016 = i1015 & 87;
        f10 = f6;
        int i1017 = (i1015 | 87) & (~i1016);
        int i1018 = -(-(i1016 << 1));
        int i1019 = (i1017 & i1018) + (i1017 | i1018);
        a = i1019 % 128;
        int i1114 = i1019 % 2;
        while (true) {
            next2 = xml.next();
            if (next2 != 1) {
                f11 = f7;
                break;
            }
            int i1115 = b;
            int i1116 = i1115 & 123;
            int i1117 = (i1115 ^ 123) | i1116;
            i16 = ((i1116 | i1117) << 1) - (i1116 ^ i1117);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                xml.getDepth();
                throw null;
            }
            depth = xml.getDepth();
            if (depth < i5) {
                int i1118 = b;
                int i1119 = i1118 & 69;
                i19 = i1119 + ((i1118 ^ 69) | i1119);
                f11 = f7;
                a = i19 % 128;
                i17 = 2;
                if (i19 % 2 != 0) {
                    if (next2 == 3) {
                        break;
                        break;
                    }
                    if (next2 == i17) {
                        int i11110 = a;
                        int i11111 = i11110 & 63;
                        int i11112 = -(-((i11110 ^ 63) | i11111));
                        int i11113 = (i11111 ^ i11112) + ((i11112 & i11111) << 1);
                        b = i11113 % 128;
                        int i1211 = i11113 % 2;
                        if (depth > i5) {
                            int i15115 = a;
                            int i15116 = i15115 & 35;
                            int i15117 = i15115 | 35;
                            int i15118 = (i15116 ^ i15117) + ((i15117 & i15116) << 1);
                            b = i15118 % 128;
                            int i15119 = i15118 % 2;
                        } else {
                            int i151110 = a;
                            int i151111 = i151110 & 35;
                            int i151112 = i151110 | 35;
                            int i151113 = (i151111 ^ i151112) + ((i151112 & i151111) << 1);
                            b = i151113 % 128;
                            int i151114 = i151113 % 2;
                        }
                    } else {
                        int i151115 = a;
                        int i151116 = i151115 & 35;
                        int i151117 = i151115 | 35;
                        int i151118 = (i151116 ^ i151117) + ((i151117 & i151116) << 1);
                        b = i151118 % 128;
                        int i151119 = i151118 % 2;
                    }
                    resources2 = resources;
                    f7 = f11;
                } else if (next2 == 2) {
                    break;
                    break;
                }
            } else {
                f11 = f7;
                i17 = 2;
            }
            if (next2 == i17) {
                int i11114 = a;
                int i11115 = i11114 & 63;
                int i11116 = -(-((i11114 ^ 63) | i11115));
                int i11117 = (i11115 ^ i11116) + ((i11116 & i11115) << 1);
                b = i11117 % 128;
                int i1212 = i11117 % 2;
                if (depth > i5) {
                    int i1511110 = a;
                    int i1511111 = i1511110 & 35;
                    int i1511112 = i1511110 | 35;
                    int i1511113 = (i1511111 ^ i1511112) + ((i1511112 & i1511111) << 1);
                    b = i1511113 % 128;
                    int i1511114 = i1511113 % 2;
                } else {
                    int i1511115 = a;
                    int i1511116 = i1511115 & 35;
                    int i1511117 = i1511115 | 35;
                    int i1511118 = (i1511116 ^ i1511117) + ((i1511117 & i1511116) << 1);
                    b = i1511118 % 128;
                    int i1511119 = i1511118 % 2;
                }
            } else {
                int i15111110 = a;
                int i15111111 = i15111110 & 35;
                int i15111112 = i15111110 | 35;
                int i15111113 = (i15111111 ^ i15111112) + ((i15111112 & i15111111) << 1);
                b = i15111113 % 128;
                int i15111114 = i15111113 % 2;
            }
            resources2 = resources;
            f7 = f11;
        }
        if (arrayList2.size() > 0) {
            n = new N(arrayList2, arrayList);
        } else {
            int i1610 = b + 41;
            a = i1610 % 128;
            int i1611 = i1610 % 2;
            n = null;
        }
        if (n == null) {
            int i1612 = a;
            int i1613 = i1612 ^ 59;
            i15 = (((i1612 & 59) | i1613) << 1) - i1613;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            if (zD) {
                n = new N(color, color2, color3);
                int i1614 = b;
                int i1615 = ((i1614 ^ 14) + ((i1614 & 14) << 1)) - 1;
                a = i1615 % 128;
                int i1616 = i1615 % 2;
                i6 = 1;
            } else {
                n = new N(color, color3);
                int i1617 = b;
                i6 = 1;
                int i1618 = (i1617 ^ 75) + ((i1617 & 75) << 1);
                a = i1618 % 128;
                int i1619 = i1618 % 2;
            }
        } else {
            i6 = 1;
        }
        if (i2 != i6) {
            int i1710 = b;
            int i1711 = (i1710 & 19) + (i1710 | 19);
            i11 = i1711 % 128;
            a = i11;
            int i1712 = i1711 % 2;
            if (i2 != 2) {
                int i1713 = ((i11 & 73) - (~(i11 | 73))) - 1;
                b = i1713 % 128;
                int i1714 = i1713 % 2;
                int[] iArr3 = n.c;
                float[] fArr3 = n.d;
                if (i4 != 1) {
                    i14 = b;
                    int i1715 = i14 & 79;
                    int i1716 = (((~i1715) & (i14 | 79)) - (~(i1715 << 1))) - 1;
                    a = i1716 % 128;
                    int i1717 = i1716 % 2;
                    if (i4 != 2) {
                        int i1718 = i14 & 47;
                        int i1719 = i14 | 47;
                        int i1810 = (i1718 ^ i1719) + ((i1718 & i1719) << 1);
                        a = i1810 % 128;
                        int i1811 = i1810 % 2;
                        tileMode2 = Shader.TileMode.CLAMP;
                        int i1812 = b;
                        int i1813 = i1812 & 53;
                        int i1814 = -(-(i1812 | 53));
                        int i1815 = (i1813 ^ i1814) + ((i1814 & i1813) << 1);
                        a = i1815 % 128;
                        int i1816 = i1815 % 2;
                    } else {
                        tileMode2 = Shader.TileMode.MIRROR;
                    }
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                i7 = 0;
                radialGradient = new LinearGradient(f, f2, f4, f5, iArr3, fArr3, tileMode2);
                int i1817 = b;
                int i1818 = (i1817 ^ 85) + ((i1817 & 85) << 1);
                int i1819 = i1818 % 128;
                a = i1819;
                int i1911 = i1818 % 2;
                int i1912 = ((i1819 | 74) << 1) - (i1819 ^ 74);
                i13 = (i1912 ^ (-1)) + (i1912 << 1);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    int i1913 = 3 / 2;
                }
            } else {
                i7 = 0;
                radialGradient = new SweepGradient(f10, f11, n.c, n.d);
                int i1914 = b;
                i12 = (i1914 ^ 121) + ((i1914 & 121) << 1);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }
        } else {
            f12 = f11;
            i7 = 0;
            if (f9 > 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int i1915 = a;
            i8 = (((i1915 | 54) << 1) - (i1915 ^ 54)) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                iArr = n.c;
                fArr = n.d;
                if (i4 != 1) {
                    int i1916 = a;
                    int i1917 = (-2) - (((i1916 & 70) + (i1916 | 70)) ^ (-1));
                    b = i1917 % 128;
                    if (i1917 % 2 == 0) {
                    }
                } else {
                    tileMode = Shader.TileMode.REPEAT;
                    i9 = b + 113;
                    a = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i1918 = 3 / 2;
                    }
                }
            } else {
                iArr = n.c;
                fArr = n.d;
                if (i4 != 1) {
                    int i1919 = a;
                    int i19110 = (-2) - (((i1919 & 70) + (i1919 | 70)) ^ (-1));
                    b = i19110 % 128;
                    if (i19110 % 2 == 0) {
                    }
                } else {
                    tileMode = Shader.TileMode.REPEAT;
                    i9 = b + 113;
                    a = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i19111 = 3 / 2;
                    }
                }
            }
            radialGradient = new RadialGradient(f10, f12, f9, iArr, fArr, tileMode);
        }
        x xVar2 = new x(radialGradient, null, i7);
        int i203 = b;
        int i204 = i203 & 69;
        i10 = i204 + ((i203 ^ 69) | i204);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i205 = 23 / i7;
        }
        return xVar2;
    }
}
