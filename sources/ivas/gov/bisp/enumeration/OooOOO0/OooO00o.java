package ivas.gov.bisp.enumeration.OooOOO0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends ViewGroup {
    private static int a = 1;
    private static int b;
    public boolean c;
    public final aRA d;
    public final Context e;
    public ActionMenuView f;
    public int g;
    public a h;
    public R i;
    public boolean j;

    public class aRA implements v {
        private static int a = 0;
        private static int b = 1;
        public boolean c = false;
        public int d;

        public aRA() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void a(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            this.c = true;
            int i6 = i4 & 113;
            int i7 = (i4 | 113) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if ((r3 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            r0 = r5.e;
            r0.i = null;
            r1 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.a;
            r3 = (r1 ^ 85) + ((r1 & 85) << 1);
            ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r3 % 128;
            r3 = r3 % 2;
            ivas.gov.bisp.enumeration.OooOOO0.OooO00o.e(r0, r5.d);
            r0 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.a + 125;
            ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if ((r0 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            if (r5.c != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        
            if (r5.c != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        
            r1 = (r0 & (-100)) | ((~r0) & 99);
            r0 = -(-((r0 & 99) << 1));
            r3 = ((r1 | r0) << 1) - (r0 ^ r1);
            ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r3 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.p081d.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(android.view.View r6) {
            /*
                r5 = this;
                r6 = 2
                int r0 = r6 % r6
                int r0 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.a
                int r1 = r0 + 81
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r2
                int r1 = r1 % r6
                r2 = 0
                if (r1 != 0) goto L18
                boolean r1 = r5.c
                r3 = 21
                int r3 = r3 / 0
                if (r1 == 0) goto L3a
                goto L1c
            L18:
                boolean r1 = r5.c
                if (r1 == 0) goto L3a
            L1c:
                r1 = r0 & (-100)
                int r3 = ~r0
                r4 = 99
                r3 = r3 & r4
                r1 = r1 | r3
                r0 = r0 & r4
                int r0 = r0 << 1
                int r0 = -r0
                int r0 = -r0
                r3 = r1 | r0
                int r3 = r3 << 1
                r0 = r0 ^ r1
                int r3 = r3 - r0
                int r0 = r3 % 128
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r0
                int r3 = r3 % r6
                if (r3 == 0) goto L36
                return
            L36:
                r2.hashCode()
                throw r2
            L3a:
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o r0 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.this
                r0.i = r2
                int r1 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.a
                r3 = r1 ^ 85
                r1 = r1 & 85
                int r1 = r1 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r1
                int r3 = r3 % r6
                int r1 = r5.d
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o.e(r0, r1)
                int r0 = ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.a
                int r0 = r0 + 125
                int r1 = r0 % 128
                ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.b = r1
                int r0 = r0 % r6
                if (r0 == 0) goto L5d
                return
            L5d:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.OooO00o.aRA.e(android.view.View):void");
        }

        @Override // ivas.gov.bisp.enumeration.p081d.v
        public void c(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
            int i4 = -(((~i2) & 47) | (i2 & (-48)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                OooO00o.d(OooO00o.this, 1);
            } else {
                OooO00o.d(OooO00o.this, 0);
            }
            this.c = false;
            int i6 = a;
            int i7 = i6 & 63;
            int i8 = ((i6 ^ 63) | i7) << 1;
            int i9 = -((i6 | 63) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public OooO00o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void d(OooO00o oooO00o, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 87) - (~(i3 | 87))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        super.setVisibility(i);
        if (i5 != 0) {
            int i6 = 25 / 0;
        }
    }

    public static /* synthetic */ void e(OooO00o oooO00o, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 29) | (i3 & 29)) << 1;
        int i5 = -(((~i3) & 29) | (i3 & (-30)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            super.setVisibility(i);
        } else {
            super.setVisibility(i);
            throw null;
        }
    }

    public int getContentHeight() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.g;
        int i6 = i2 & 71;
        int i7 = (i2 ^ 71) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 102) + (i2 | 102);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            motionEvent.getActionMasked();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
            int i5 = a;
            int i6 = (i5 & 113) + (i5 | 113);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!this.j) {
            int i8 = b;
            int i9 = (-2) - (((i8 ^ 122) + ((i8 & 122) << 1)) ^ (-1));
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                int i11 = a;
                int i12 = ((i11 ^ 66) + ((i11 & 66) << 1)) - 1;
                int i13 = i12 % 128;
                b = i13;
                if (i12 % 2 != 0) {
                    int i14 = 39 / 0;
                    if (!zOnTouchEvent) {
                        this.j = true;
                        int i15 = i13 | 77;
                        int i16 = (i15 << 1) - (i15 & (~(i13 & 77)));
                        a = i16 % 128;
                        int i17 = i16 % 2;
                    }
                } else if (!zOnTouchEvent) {
                    this.j = true;
                    int i18 = i13 | 77;
                    int i19 = (i18 << 1) - (i18 & (~(i13 & 77)));
                    a = i19 % 128;
                    int i110 = i19 % 2;
                }
            }
        }
        if (actionMasked != 1) {
            int i20 = b;
            int i21 = i20 & 67;
            int i22 = i20 | 67;
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            if (actionMasked == 3) {
                this.j = false;
                int i25 = a;
                int i26 = (((i25 | 55) << 1) - (~(-(((~i25) & 55) | (i25 & (-56)))))) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        } else {
            this.j = false;
            int i28 = a;
            int i29 = (((i28 | 55) << 1) - (~(-(((~i28) & 55) | (i28 & (-56)))))) - 1;
            b = i29 % 128;
            int i210 = i29 % 2;
        }
        int i30 = a;
        int i31 = (i30 ^ 41) + ((i30 & 41) << 1);
        b = i31 % 128;
        int i32 = i31 % 2;
        return true;
    }

    public OooO00o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new aRA();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.e = context;
            int i2 = b;
            int i3 = i2 ^ 83;
            int i4 = -(-((i2 & 83) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.e = new ContextThemeWrapper(context, typedValue.resourceId);
        int i6 = a;
        int i7 = i6 & 71;
        int i8 = -(-((i6 ^ 71) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 23 / 0;
        }
    }

    public int getAnimatedVisibility() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = (i3 - (~(-(-((i2 ^ 121) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.i == null) {
            int visibility = getVisibility();
            int i7 = b;
            int i8 = i7 & 51;
            int i9 = i7 | 51;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return visibility;
        }
        int i12 = (i5 & (-28)) | ((~i5) & 27);
        int i13 = -(-((i5 & 27) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = this.d.d;
        int i17 = a;
        int i18 = (i17 & 103) + (i17 | 103);
        b = i18 % 128;
        int i19 = i18 % 2;
        return i16;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        TypedArray typedArrayObtainStyledAttributes;
        int i;
        Configuration configuration2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = (i8 ^ 55) + ((i8 & 55) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        int[] iArr = h.d;
        int i11 = a;
        int i12 = i11 & 19;
        int i13 = (i11 | 19) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, ivas.gov.bisp.enumeration.R.attr.actionBarStyle, 1);
            i = 78;
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, ivas.gov.bisp.enumeration.R.attr.actionBarStyle, 0);
            i = 13;
        }
        int i16 = a;
        int i17 = (i16 & 29) + (i16 | 29);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i, 0));
        } else {
            setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar = this.h;
        if (aVar != null) {
            int i18 = a;
            int i19 = i18 & 39;
            int i20 = ((i18 ^ 39) | i19) << 1;
            int i21 = -((i18 | 39) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                configuration2 = aVar.c.getResources().getConfiguration();
                int i23 = 61 / 0;
            } else {
                configuration2 = aVar.c.getResources().getConfiguration();
            }
            int i24 = b;
            int i25 = ((i24 | 35) << 1) - (i24 ^ 35);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = configuration2.screenWidthDp;
                int i27 = configuration2.screenHeightDp;
                obj.hashCode();
                throw null;
            }
            int i28 = configuration2.screenWidthDp;
            int i29 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600) {
                int i30 = a;
                int i31 = ((i30 & 27) - (~(-(-(i30 | 27))))) - 1;
                int i32 = i31 % 128;
                b = i32;
                if (i31 % 2 == 0 ? i28 > 600 : i28 > 1813) {
                    int i33 = a;
                    int i34 = i33 & 9;
                    int i35 = i34 + ((i33 ^ 9) | i34);
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    i2 = 5;
                } else {
                    int i37 = ((i32 | 6) << 1) - (i32 ^ 6);
                    int i38 = (i37 ^ (-1)) + (i37 << 1);
                    int i39 = i38 % 128;
                    a = i39;
                    if (i38 % 2 != 0 ? i28 <= 960 : i28 <= 32759) {
                        if (i28 > 720) {
                            int i40 = i39 | 49;
                            int i41 = i40 << 1;
                            int i42 = -(i40 & (~(i39 & 49)));
                            i6 = (i41 & i42) + (i42 | i41);
                            b = i6 % 128;
                            if (i6 % 2 != 0 ? i29 > 960 : i29 > 15328) {
                                int i310 = a;
                                int i311 = i310 & 9;
                                int i312 = i311 + ((i310 ^ 9) | i311);
                                b = i312 % 128;
                                int i313 = i312 % 2;
                                i2 = 5;
                            }
                        }
                        if (i28 < 500) {
                            int i43 = b;
                            i2 = 3;
                            i3 = (i43 & 3) + (i43 | 3);
                            i4 = i3 % 128;
                            a = i4;
                            if (i3 % 2 == 0 ? i28 <= 640 : i28 <= 25480) {
                                if (i28 > 480) {
                                    int i44 = i4 & 65;
                                    i5 = i44 + ((i4 ^ 65) | i44);
                                    b = i5 % 128;
                                    if (i5 % 2 != 0 ? i29 > 640 : i29 > 19434) {
                                        int i45 = b;
                                        int i46 = i45 & 71;
                                        int i47 = (i46 - (~(-(-((i45 ^ 71) | i46))))) - 1;
                                        a = i47 % 128;
                                        int i48 = i47 % 2;
                                        i2 = 4;
                                    }
                                }
                                if (i28 >= 360) {
                                    int i49 = ((i4 & 106) + (i4 | 106)) - 1;
                                    b = i49 % 128;
                                    int i50 = i49 % 2;
                                    int i51 = i4 & 99;
                                    int i52 = ((i4 ^ 99) | i51) << 1;
                                    int i53 = -((i4 | 99) & (~i51));
                                    int i54 = (i52 & i53) + (i53 | i52);
                                    b = i54 % 128;
                                    int i55 = i54 % 2;
                                } else {
                                    int i56 = i4 & 119;
                                    int i57 = i56 + ((i4 ^ 119) | i56);
                                    b = i57 % 128;
                                    int i58 = i57 % 2;
                                    i2 = 2;
                                }
                            } else {
                                int i59 = (-2) - (((i4 ^ 36) + ((i4 & 36) << 1)) ^ (-1));
                                b = i59 % 128;
                                if (i59 % 2 == 0 ? i29 > 480 : i29 > 19272) {
                                    int i410 = b;
                                    int i411 = i410 & 71;
                                    int i412 = (i411 - (~(-(-((i410 ^ 71) | i411))))) - 1;
                                    a = i412 % 128;
                                    int i413 = i412 % 2;
                                    i2 = 4;
                                } else {
                                    if (i28 > 480) {
                                        int i414 = i4 & 65;
                                        i5 = i414 + ((i4 ^ 65) | i414);
                                        b = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            int i415 = b;
                                            int i416 = i415 & 71;
                                            int i417 = (i416 - (~(-(-((i415 ^ 71) | i416))))) - 1;
                                            a = i417 % 128;
                                            int i418 = i417 % 2;
                                            i2 = 4;
                                        } else {
                                            int i419 = b;
                                            int i4110 = i419 & 71;
                                            int i4111 = (i4110 - (~(-(-((i419 ^ 71) | i4110))))) - 1;
                                            a = i4111 % 128;
                                            int i4112 = i4111 % 2;
                                            i2 = 4;
                                        }
                                    }
                                    if (i28 >= 360) {
                                        int i420 = ((i4 & 106) + (i4 | 106)) - 1;
                                        b = i420 % 128;
                                        int i510 = i420 % 2;
                                        int i511 = i4 & 99;
                                        int i512 = ((i4 ^ 99) | i511) << 1;
                                        int i513 = -((i4 | 99) & (~i511));
                                        int i514 = (i512 & i513) + (i513 | i512);
                                        b = i514 % 128;
                                        int i515 = i514 % 2;
                                    } else {
                                        int i516 = i4 & 119;
                                        int i517 = i516 + ((i4 ^ 119) | i516);
                                        b = i517 % 128;
                                        int i518 = i517 % 2;
                                        i2 = 2;
                                    }
                                }
                            }
                        } else {
                            int i4113 = b;
                            int i4114 = i4113 & 71;
                            int i4115 = (i4114 - (~(-(-((i4113 ^ 71) | i4114))))) - 1;
                            a = i4115 % 128;
                            int i4116 = i4115 % 2;
                            i2 = 4;
                        }
                    } else {
                        int i60 = ((i39 | 53) << 1) - (i39 ^ 53);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        if (i29 <= 720) {
                            if (i28 > 720) {
                                int i421 = i39 | 49;
                                int i422 = i421 << 1;
                                int i423 = -(i421 & (~(i39 & 49)));
                                i6 = (i422 & i423) + (i423 | i422);
                                b = i6 % 128;
                                if (i6 % 2 != 0) {
                                    int i314 = a;
                                    int i315 = i314 & 9;
                                    int i316 = i315 + ((i314 ^ 9) | i315);
                                    b = i316 % 128;
                                    int i317 = i316 % 2;
                                    i2 = 5;
                                } else {
                                    int i318 = a;
                                    int i319 = i318 & 9;
                                    int i3110 = i319 + ((i318 ^ 9) | i319);
                                    b = i3110 % 128;
                                    int i3111 = i3110 % 2;
                                    i2 = 5;
                                }
                            }
                            if (i28 < 500) {
                                int i424 = b;
                                i2 = 3;
                                i3 = (i424 & 3) + (i424 | 3);
                                i4 = i3 % 128;
                                a = i4;
                                if (i3 % 2 == 0) {
                                }
                                if (i28 > 480) {
                                    int i4117 = i4 & 65;
                                    i5 = i4117 + ((i4 ^ 65) | i4117);
                                    b = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        int i4118 = b;
                                        int i4119 = i4118 & 71;
                                        int i41110 = (i4119 - (~(-(-((i4118 ^ 71) | i4119))))) - 1;
                                        a = i41110 % 128;
                                        int i41111 = i41110 % 2;
                                        i2 = 4;
                                    } else {
                                        int i41112 = b;
                                        int i41113 = i41112 & 71;
                                        int i41114 = (i41113 - (~(-(-((i41112 ^ 71) | i41113))))) - 1;
                                        a = i41114 % 128;
                                        int i41115 = i41114 % 2;
                                        i2 = 4;
                                    }
                                }
                                if (i28 >= 360) {
                                    int i425 = ((i4 & 106) + (i4 | 106)) - 1;
                                    b = i425 % 128;
                                    int i519 = i425 % 2;
                                    int i5110 = i4 & 99;
                                    int i5111 = ((i4 ^ 99) | i5110) << 1;
                                    int i5112 = -((i4 | 99) & (~i5110));
                                    int i5113 = (i5111 & i5112) + (i5112 | i5111);
                                    b = i5113 % 128;
                                    int i5114 = i5113 % 2;
                                } else {
                                    int i5115 = i4 & 119;
                                    int i5116 = i5115 + ((i4 ^ 119) | i5115);
                                    b = i5116 % 128;
                                    int i5117 = i5116 % 2;
                                    i2 = 2;
                                }
                            } else {
                                int i41116 = b;
                                int i41117 = i41116 & 71;
                                int i41118 = (i41117 - (~(-(-((i41116 ^ 71) | i41117))))) - 1;
                                a = i41118 % 128;
                                int i41119 = i41118 % 2;
                                i2 = 4;
                            }
                        } else {
                            int i3112 = a;
                            int i3113 = i3112 & 9;
                            int i3114 = i3113 + ((i3112 ^ 9) | i3113);
                            b = i3114 % 128;
                            int i3115 = i3114 % 2;
                            i2 = 5;
                        }
                    }
                }
            } else {
                int i3116 = a;
                int i3117 = i3116 & 9;
                int i3118 = i3117 + ((i3116 ^ 9) | i3117);
                b = i3118 % 128;
                int i3119 = i3118 % 2;
                i2 = 5;
            }
            aVar.p = i2;
            n nVar = aVar.d;
            if (nVar != null) {
                int i62 = b;
                int i63 = ((i62 ^ 61) | (i62 & 61)) << 1;
                int i64 = -((61 & (~i62)) | (i62 & (-62)));
                int i65 = (i63 & i64) + (i64 | i63);
                a = i65 % 128;
                int i66 = i65 % 2;
                nVar.r(true);
                int i67 = a;
                int i68 = i67 ^ 19;
                int i69 = ((i67 & 19) | i68) << 1;
                int i70 = -i68;
                int i71 = (i69 & i70) + (i69 | i70);
                b = i71 % 128;
                if (i71 % 2 != 0) {
                    int i72 = 5 % 2;
                }
            }
        }
        int i73 = b;
        int i74 = (i73 & 87) + (i73 | 87);
        a = i74 % 128;
        int i75 = i74 % 2;
    }

    public void setContentHeight(int i) {
        int i2 = 2 % 2;
        int i3 = a + 83;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.g = i;
            requestLayout();
            throw null;
        }
        this.g = i;
        requestLayout();
        int i4 = a;
        int i5 = i4 & 61;
        int i6 = (i4 ^ 61) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 93;
        int i5 = (i4 - (~(-(-((i3 ^ 93) | i4))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        if (i != getVisibility()) {
            int i7 = b;
            int i8 = i7 + 85;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            R r = this.i;
            if (r != null) {
                int i9 = i7 + 19;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    r.d();
                    int i10 = 98 / 0;
                } else {
                    r.d();
                }
            }
            super.setVisibility(i);
            int i11 = a;
            int i12 = i11 ^ 31;
            int i13 = (i11 & 31) << 1;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 & 95;
        int i18 = -(-(i16 | 95));
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 89 / 0;
        }
    }

    public int f(View view, int i, int i2, int i3) {
        int measuredWidth;
        int i4 = 2 % 2;
        int i5 = b + 87;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
            measuredWidth = view.getMeasuredWidth();
            int i6 = 38 / 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
            measuredWidth = view.getMeasuredWidth();
        }
        int i7 = -measuredWidth;
        int i8 = i & i7;
        int i9 = (i7 ^ i) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        int i11 = -i3;
        int i12 = i10 & i11;
        int iMax = Math.max(0, ((((i10 ^ i11) | i12) << 1) - (~(-((i11 | i10) & (~i12))))) - 1);
        int i13 = a;
        int i14 = i13 ^ 37;
        int i15 = ((i13 & 37) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        b = i17 % 128;
        int i18 = i17 % 2;
        return iMax;
    }

    public int g(View view, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 15;
        int i8 = i6 | 15;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = b;
        int i12 = ((i11 & 13) - (~(-(-(i11 | 13))))) - 1;
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = -measuredHeight;
        int i16 = i3 & i15;
        int i17 = (i16 + ((i3 ^ i15) | i16)) / 2;
        int i18 = -(-i2);
        int i19 = i17 ^ i18;
        int i20 = (((i18 & i17) | i19) << 1) - i19;
        if (!z) {
            int i21 = -(-measuredWidth);
            view.layout(i, i20, ((i | i21) << 1) - (i21 ^ i), ((((~i20) & measuredHeight) | ((~measuredHeight) & i20)) - (~(-(-((measuredHeight & i20) << 1))))) - 1);
            int i22 = b;
            int i23 = i22 & 91;
            int i24 = i23 + ((i22 ^ 91) | i23);
            a = i24 % 128;
            int i25 = i24 % 2;
        } else {
            int i26 = ((i13 & (-72)) | ((~i13) & 71)) + ((i13 & 71) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            int i28 = -measuredWidth;
            int i29 = ((i ^ i28) - (~(-(-((i28 & i) << 1))))) - 1;
            int i30 = measuredHeight & i20;
            int i31 = (measuredHeight ^ i20) | i30;
            int i32 = (i30 & i31) + (i30 | i31);
            int i33 = (((i13 & (-86)) | ((~i13) & 85)) - (~((i13 & 85) << 1))) - 1;
            b = i33 % 128;
            if (i33 % 2 != 0) {
                view.layout(i29, i20, i, i32);
                int i34 = 21 / 0;
            } else {
                view.layout(i29, i20, i, i32);
            }
            int i35 = b + 93;
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        if (z) {
            int i37 = (-2) - ((a + 116) ^ (-1));
            b = i37 % 128;
            if (i37 % 2 != 0) {
                i4 = -measuredWidth;
                int i38 = 48 / 0;
            } else {
                i4 = -measuredWidth;
            }
            measuredWidth = i4;
        }
        int i39 = b;
        int i40 = i39 & 67;
        int i41 = -(-(i39 | 67));
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        a = i42 % 128;
        if (i42 % 2 != 0) {
            return measuredWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[PHI: r9
  0x005f: PHI (r9v15 boolean) = (r9v14 boolean), (r9v22 boolean) binds: [B:18:0x005d, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked;
        boolean zOnHoverEvent;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
        a = i4 % 128;
        if (i4 % 2 != 0 ? (actionMasked = motionEvent.getActionMasked()) == 9 : (actionMasked = motionEvent.getActionMasked()) == 123) {
            this.c = false;
            int i5 = b;
            int i6 = i5 ^ 33;
            int i7 = ((((i5 & 33) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!this.c) {
            int i9 = b;
            int i10 = i9 & 61;
            int i11 = -(-((i9 ^ 61) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                zOnHoverEvent = super.onHoverEvent(motionEvent);
                if (actionMasked == 122) {
                    int i13 = b;
                    int i14 = i13 & 101;
                    int i15 = (i14 - (~(-(-((i13 ^ 101) | i14))))) - 1;
                    i = i15 % 128;
                    a = i;
                    int i16 = i15 % 2;
                    if (!zOnHoverEvent) {
                        int i17 = i & 93;
                        int i18 = ((i | 93) & (~i17)) + (i17 << 1);
                        int i19 = i18 % 128;
                        b = i19;
                        int i20 = i18 % 2;
                        this.c = true;
                        int i21 = i19 + 102;
                        int i22 = (i21 ^ (-1)) + (i21 << 1);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                }
            } else {
                zOnHoverEvent = super.onHoverEvent(motionEvent);
                if (actionMasked == 9) {
                    int i110 = b;
                    int i111 = i110 & 101;
                    int i112 = (i111 - (~(-(-((i110 ^ 101) | i111))))) - 1;
                    i = i112 % 128;
                    a = i;
                    int i113 = i112 % 2;
                    if (!zOnHoverEvent) {
                        int i114 = i & 93;
                        int i115 = ((i | 93) & (~i114)) + (i114 << 1);
                        int i116 = i115 % 128;
                        b = i116;
                        int i24 = i115 % 2;
                        this.c = true;
                        int i25 = i116 + 102;
                        int i26 = (i25 ^ (-1)) + (i25 << 1);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            }
        }
        if (actionMasked != 10) {
            int i28 = b;
            int i29 = ((i28 & 30) + (i28 | 30)) - 1;
            a = i29 % 128;
            if (i29 % 2 != 0 ? actionMasked == 3 : actionMasked == 5) {
                this.c = false;
                int i30 = b;
                int i31 = ((i30 ^ 12) + ((i30 & 12) << 1)) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
            }
        } else {
            this.c = false;
            int i33 = b;
            int i34 = ((i33 ^ 12) + ((i33 & 12) << 1)) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = a + 57;
        b = i36 % 128;
        int i37 = i36 % 2;
        return true;
    }

    public R h(int i, long j) {
        View view;
        int i2 = 2 % 2;
        int i3 = b + 101;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        R r = this.i;
        if (r != null) {
            int i6 = i4 & 109;
            int i7 = (i4 ^ 109) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            r.d();
            int i10 = b;
            int i11 = (i10 ^ 31) + ((i10 & 31) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        if (i != 0) {
            R rD = T.d(this);
            rD.c(0.0f);
            int i13 = b + 17;
            a = i13 % 128;
            int i14 = i13 % 2;
            rD.e(j);
            aRA ara = this.d;
            OooO00o oooO00o = OooO00o.this;
            int i15 = a;
            int i16 = ((i15 | 69) << 1) - (i15 ^ 69);
            b = i16 % 128;
            int i17 = i16 % 2;
            oooO00o.i = rD;
            ara.d = i;
            WeakReference<View> weakReference = rD.c;
            int i18 = b;
            int i19 = ((i18 ^ 85) | (i18 & 85)) << 1;
            int i20 = -(((~i18) & 85) | (i18 & (-86)));
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                weakReference.get();
                throw null;
            }
            View view2 = weakReference.get();
            if (view2 != null) {
                rD.h(view2, ara);
                int i22 = b;
                int i23 = (i22 | 41) << 1;
                int i24 = -(i22 ^ 41);
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                a = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = a;
            int i28 = ((i27 ^ 124) + ((i27 & 124) << 1)) - 1;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 54 / 0;
            }
            return rD;
        }
        int i30 = a;
        int i31 = (i30 & 96) + (i30 | 96);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        b = i32 % 128;
        int i33 = i32 % 2;
        if (getVisibility() != 0) {
            int i34 = a + 79;
            b = i34 % 128;
            int i35 = i34 % 2;
            setAlpha(0.0f);
            int i36 = b;
            int i37 = (-2) - (((i36 ^ 84) + ((i36 & 84) << 1)) ^ (-1));
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        R rD2 = T.d(this);
        rD2.c(1.0f);
        int i39 = b;
        int i40 = (i39 & 21) + (i39 | 21);
        a = i40 % 128;
        int i41 = i40 % 2;
        rD2.e(j);
        aRA ara2 = this.d;
        OooO00o oooO00o2 = OooO00o.this;
        int i42 = b;
        int i43 = i42 ^ 45;
        int i44 = (((i42 & 45) | i43) << 1) - i43;
        a = i44 % 128;
        if (i44 % 2 == 0) {
            oooO00o2.i = rD2;
            ara2.d = i;
            view = rD2.c.get();
            int i45 = 84 / 0;
        } else {
            oooO00o2.i = rD2;
            ara2.d = i;
            view = rD2.c.get();
        }
        int i46 = a;
        int i47 = (i46 ^ 29) + ((i46 & 29) << 1);
        b = i47 % 128;
        if (i47 % 2 != 0) {
            throw null;
        }
        View view3 = view;
        if (view3 != null) {
            rD2.h(view3, ara2);
            int i48 = b;
            int i49 = i48 & 89;
            int i50 = (((i48 ^ 89) | i49) << 1) - ((i48 | 89) & (~i49));
            a = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = b;
        int i53 = i52 & 17;
        int i54 = ((i52 | 17) & (~i53)) + (i53 << 1);
        a = i54 % 128;
        if (i54 % 2 != 0) {
            return rD2;
        }
        throw null;
    }
}
