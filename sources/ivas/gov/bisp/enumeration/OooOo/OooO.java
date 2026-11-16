package ivas.gov.bisp.enumeration.OooOo;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO00o;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO extends OooO00o {
    private static int g = 0;
    private static int h = 1;
    public boolean i;
    public boolean j;

    @Override // androidx.constraintlayout.widget.OooO00o
    public void h(AttributeSet attributeSet) {
        int index;
        int i = 2 % 2;
        int i2 = h;
        int i3 = i2 & 119;
        int i4 = (i3 - (~(-(-((i2 ^ 119) | i3))))) - 1;
        g = i4 % 128;
        int i5 = i4 % 2;
        super.h(attributeSet);
        if (attributeSet != null) {
            int i6 = g;
            int i7 = i6 & 121;
            int i8 = ((((i6 ^ 121) | i7) << 1) - (~(-((i6 | 121) & (~i7))))) - 1;
            h = i8 % 128;
            if (i8 % 2 == 0) {
                getContext().obtainStyledAttributes(attributeSet, r.g).getIndexCount();
                throw null;
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = g + 47;
            h = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 % 5;
            }
            int i11 = 0;
            while (i11 < indexCount) {
                int i12 = g;
                int i13 = (i12 | 47) << 1;
                int i14 = -(i12 ^ 47);
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                h = i15 % 128;
                if (i15 % 2 != 0 ? (index = typedArrayObtainStyledAttributes.getIndex(i11)) == 6 : (index = typedArrayObtainStyledAttributes.getIndex(i11)) == 62) {
                    this.j = true;
                    int i16 = g;
                    int i17 = i16 & 55;
                    int i18 = (((i16 ^ 55) | i17) << 1) - ((i16 | 55) & (~i17));
                    h = i18 % 128;
                    int i19 = i18 % 2;
                } else if (index == 13) {
                    int i20 = h;
                    int i21 = i20 & 17;
                    int i22 = (((i20 ^ 17) | i21) << 1) - ((~i21) & (i20 | 17));
                    g = i22 % 128;
                    int i23 = i22 % 2;
                    this.i = true;
                    int i24 = i20 + 24;
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    g = i25 % 128;
                    int i26 = i25 % 2;
                }
                int i27 = (i11 & (-2)) | ((~i11) & 1);
                int i28 = -(-((i11 & 1) << 1));
                i11 = ((i27 | i28) << 1) - (i28 ^ i27);
                int i29 = h + 2;
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                g = i30 % 128;
                int i31 = i30 % 2;
            }
        }
        int i32 = h + 9;
        g = i32 % 128;
        int i33 = i32 % 2;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = (i2 & 3) + (i2 | 3);
        h = i3 % 128;
        if (i3 % 2 == 0) {
            super.setElevation(f);
            e();
            int i4 = 4 / 0;
        } else {
            super.setElevation(f);
            e();
        }
        int i5 = g;
        int i6 = ((i5 | 67) << 1) - (((~i5) & 67) | (i5 & (-68)));
        h = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = h;
        int i4 = i3 ^ 17;
        int i5 = -(-((i3 & 17) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        g = i6 % 128;
        if (i6 % 2 == 0) {
            super.setVisibility(i);
            e();
        } else {
            super.setVisibility(i);
            e();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // androidx.constraintlayout.widget.OooO00o, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        int i;
        int i2;
        Object obj;
        ConstraintLayout constraintLayout;
        int visibility;
        float elevation;
        int i3;
        int i4;
        int i5;
        View viewG;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = h;
        int i12 = ((i11 | 85) << 1) - (i11 ^ 85);
        g = i12 % 128;
        int i13 = i12 % 2;
        super.onAttachedToWindow();
        if (!(!this.j)) {
            parent = getParent();
            if (parent != null) {
                i = h;
                i2 = i + 121;
                g = i2 % 128;
                obj = null;
                if (i2 % 2 == 0) {
                    boolean z = parent instanceof ConstraintLayout;
                    throw null;
                }
                if (parent instanceof ConstraintLayout) {
                    int i14 = i & 103;
                    int i15 = (i14 - (~((i ^ 103) | i14))) - 1;
                    g = i15 % 128;
                    int i16 = i15 % 2;
                    constraintLayout = (ConstraintLayout) parent;
                    visibility = getVisibility();
                    elevation = getElevation();
                    i3 = g + 67;
                    h = i3 % 128;
                    if (i3 % 2 == 0) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    while (i4 < this.b) {
                        int i17 = g;
                        int i18 = i17 & 39;
                        int i19 = -(-((i17 ^ 39) | i18));
                        i5 = (i18 & i19) + (i19 | i18);
                        h = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i20 = this.a[i4];
                            throw null;
                        }
                        int i21 = this.a[i4];
                        int i22 = h;
                        int i23 = (i22 ^ 41) + ((i22 & 41) << 1);
                        g = i23 % 128;
                        int i24 = i23 % 2;
                        viewG = constraintLayout.g(i21);
                        if (viewG != null) {
                            int i25 = h;
                            int i26 = (i25 & 110) + (i25 | 110);
                            i6 = (i26 ^ (-1)) + (i26 << 1);
                            i7 = i6 % 128;
                            g = i7;
                            if (i6 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (this.j) {
                                int i27 = i7 & 23;
                                int i28 = -(-((i7 ^ 23) | i27));
                                int i29 = (i27 & i28) + (i27 | i28);
                                h = i29 % 128;
                                int i30 = i29 % 2;
                                viewG.setVisibility(visibility);
                                int i31 = h;
                                int i32 = ((i31 & (-20)) | ((~i31) & 19)) + ((i31 & 19) << 1);
                                g = i32 % 128;
                                int i33 = i32 % 2;
                            }
                            if (!(!this.i)) {
                                int i34 = h;
                                int i35 = (i34 & (-24)) | ((~i34) & 23);
                                int i36 = -(-((i34 & 23) << 1));
                                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                                i8 = i37 % 128;
                                g = i8;
                                int i38 = i37 % 2;
                                if (elevation > 0.0f) {
                                    int i39 = i8 & 15;
                                    int i40 = (i39 - (~(-(-((i8 ^ 15) | i39))))) - 1;
                                    h = i40 % 128;
                                    int i41 = i40 % 2;
                                    viewG.setTranslationZ(viewG.getTranslationZ() + elevation);
                                    int i42 = g;
                                    i9 = ((i42 ^ 100) + ((i42 & 100) << 1)) - 1;
                                    h = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        int i43 = 5 % 5;
                                    }
                                }
                            }
                        }
                        i4 = (((i4 | 2) << 1) - (i4 ^ 2)) - 1;
                        int i44 = h;
                        int i45 = ((i44 & 88) + (i44 | 88)) - 1;
                        g = i45 % 128;
                        int i46 = i45 % 2;
                    }
                }
            }
        } else {
            int i47 = h + 99;
            g = i47 % 128;
            int i48 = i47 % 2;
            if (this.i) {
                parent = getParent();
                if (parent != null) {
                    i = h;
                    i2 = i + 121;
                    g = i2 % 128;
                    obj = null;
                    if (i2 % 2 == 0) {
                        boolean z2 = parent instanceof ConstraintLayout;
                        throw null;
                    }
                    if (parent instanceof ConstraintLayout) {
                        int i110 = i & 103;
                        int i111 = (i110 - (~((i ^ 103) | i110))) - 1;
                        g = i111 % 128;
                        int i112 = i111 % 2;
                        constraintLayout = (ConstraintLayout) parent;
                        visibility = getVisibility();
                        elevation = getElevation();
                        i3 = g + 67;
                        h = i3 % 128;
                        if (i3 % 2 == 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        while (i4 < this.b) {
                            int i113 = g;
                            int i114 = i113 & 39;
                            int i115 = -(-((i113 ^ 39) | i114));
                            i5 = (i114 & i115) + (i115 | i114);
                            h = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i210 = this.a[i4];
                                throw null;
                            }
                            int i211 = this.a[i4];
                            int i212 = h;
                            int i213 = (i212 ^ 41) + ((i212 & 41) << 1);
                            g = i213 % 128;
                            int i214 = i213 % 2;
                            viewG = constraintLayout.g(i211);
                            if (viewG != null) {
                                int i215 = h;
                                int i216 = (i215 & 110) + (i215 | 110);
                                i6 = (i216 ^ (-1)) + (i216 << 1);
                                i7 = i6 % 128;
                                g = i7;
                                if (i6 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (this.j) {
                                    int i217 = i7 & 23;
                                    int i218 = -(-((i7 ^ 23) | i217));
                                    int i219 = (i217 & i218) + (i217 | i218);
                                    h = i219 % 128;
                                    int i310 = i219 % 2;
                                    viewG.setVisibility(visibility);
                                    int i311 = h;
                                    int i312 = ((i311 & (-20)) | ((~i311) & 19)) + ((i311 & 19) << 1);
                                    g = i312 % 128;
                                    int i313 = i312 % 2;
                                }
                                if (!(!this.i)) {
                                    int i314 = h;
                                    int i315 = (i314 & (-24)) | ((~i314) & 23);
                                    int i316 = -(-((i314 & 23) << 1));
                                    int i317 = (i315 ^ i316) + ((i316 & i315) << 1);
                                    i8 = i317 % 128;
                                    g = i8;
                                    int i318 = i317 % 2;
                                    if (elevation > 0.0f) {
                                        int i319 = i8 & 15;
                                        int i49 = (i319 - (~(-(-((i8 ^ 15) | i319))))) - 1;
                                        h = i49 % 128;
                                        int i410 = i49 % 2;
                                        viewG.setTranslationZ(viewG.getTranslationZ() + elevation);
                                        int i411 = g;
                                        i9 = ((i411 ^ 100) + ((i411 & 100) << 1)) - 1;
                                        h = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            int i412 = 5 % 5;
                                        }
                                    }
                                }
                            }
                            i4 = (((i4 | 2) << 1) - (i4 ^ 2)) - 1;
                            int i413 = h;
                            int i414 = ((i413 & 88) + (i413 | 88)) - 1;
                            g = i414 % 128;
                            int i415 = i414 % 2;
                        }
                    }
                }
            }
        }
        int i50 = h;
        int i51 = i50 | 15;
        int i52 = i51 << 1;
        int i53 = -((~(i50 & 15)) & i51);
        int i54 = (i52 & i53) + (i53 | i52);
        g = i54 % 128;
        int i55 = i54 % 2;
    }
}
