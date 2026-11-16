package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bG.B;
import ivas.gov.bisp.enumeration.bG.F;
import ivas.gov.bisp.enumeration.bG.ae;
import ivas.gov.bisp.enumeration.bG.ai;
import ivas.gov.bisp.enumeration.bH.P;
import ivas.gov.bisp.enumeration.bH.l;
import ivas.gov.bisp.enumeration.bH.t;
import ivas.gov.bisp.enumeration.bH.u;
import ivas.gov.bisp.enumeration.bH.z;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.p081d.C0284l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.BuildConfig;
import o.i;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentTree extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] a$s17$2713 = {48780, 48854, 48856, 48857, 48866, 48649, 48645, 48647, 48646, 48644, 48773, 48837, 48837, 48838, 48833, 48700, 48839, 48837, 48699, 48699, 48835};
    private static int c = 0;
    private static int d = 1;
    private float cX;
    private float cY;

    @BindView
    public LinearLayout linearLayoutTreeView;
    private float mLastTouchX;
    private float mLastTouchY;
    private float mPosX;
    private float mPosY;
    private ScaleGestureDetector mScaleDetector;
    private float mScaleFactor = 0.7f;
    private View parentView;
    private float scalePointX;
    private float scalePointY;

    public class MyView extends View {
        private static int a = 1;
        private static int b;
        private P familyTree;

        public MyView(Context context, P p) {
            super(context);
            this.familyTree = p;
            FragmentTree.access$002(FragmentTree.this, new ScaleGestureDetector(context, new ScaleListener()));
        }

        private void createText(Canvas canvas, String str, int i, int i2) {
            int i3 = 2 % 2;
            Paint paint = new Paint();
            paint.setColor(-1);
            int i4 = a + 27;
            b = i4 % 128;
            paint.setTypeface(i4 % 2 != 0 ? Typeface.create(Typeface.DEFAULT, 0) : Typeface.create(Typeface.DEFAULT, 1));
            paint.setTextSize(getResources().getDimension(R.dimen.text_relationship));
            float f = i;
            int i5 = b;
            int i6 = ((i5 & (-28)) | ((~i5) & 27)) + ((i5 & 27) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                canvas.drawText(str, f, i2, paint);
            } else {
                canvas.drawText(str, f, i2, paint);
                int i7 = 29 / 0;
            }
        }

        private void createImage(Drawable drawable, Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = b + 15;
            a = i6 % 128;
            int i7 = i6 % 2;
            drawable.setBounds(i, i2, i3, i4);
            drawable.draw(canvas);
            int i8 = a;
            int i9 = i8 & 61;
            int i10 = i8 | 61;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        private void createRectangle(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            Paint paint = new Paint();
            int i6 = a + 123;
            b = i6 % 128;
            int i7 = i6 % 2;
            paint.setColor(-16711936);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2.0f);
            Rect rect = new Rect(i, i2, i3, i4);
            int i8 = b;
            int i9 = (i8 & 5) + (i8 | 5);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                canvas.drawRect(rect, paint);
                int i10 = 15 / 0;
            } else {
                canvas.drawRect(rect, paint);
            }
            int i11 = a;
            int i12 = i11 | 65;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 65)) & i12);
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
        }

        public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
            private static int a = 1;
            private static int b;

            private ScaleListener() {
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                int i = 2 % 2;
                int i2 = b + 71;
                a = i2 % 128;
                int i3 = i2 % 2;
                FragmentTree.access$332(FragmentTree.this, scaleGestureDetector.getScaleFactor());
                int i4 = b;
                int i5 = ((i4 & 68) + (i4 | 68)) - 1;
                a = i5 % 128;
                int i6 = i5 % 2;
                FragmentTree.access$202(FragmentTree.this, scaleGestureDetector.getFocusX());
                int i7 = b + 61;
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    FragmentTree.access$402(FragmentTree.this, scaleGestureDetector.getFocusY());
                    int i8 = 9 / 0;
                } else {
                    FragmentTree.access$402(FragmentTree.this, scaleGestureDetector.getFocusY());
                }
                int i9 = b;
                int i10 = (i9 ^ 15) + ((i9 & 15) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                FragmentTree fragmentTree = FragmentTree.this;
                float fAccess$300 = FragmentTree.access$300(fragmentTree);
                int i12 = b;
                int i13 = (i12 & 119) + (i12 | 119);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    FragmentTree.access$302(fragmentTree, Math.max(0.5f, Math.min(fAccess$300, 1.0f)));
                } else {
                    FragmentTree.access$302(fragmentTree, Math.max(0.5f, Math.min(fAccess$300, 1.0f)));
                }
                MyView myView = MyView.this;
                int i14 = a + 119;
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    myView.invalidate();
                    return false;
                }
                myView.invalidate();
                return true;
            }
        }

        private void createLine(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            Paint paint = new Paint();
            paint.setColor(-65536);
            int i6 = a;
            int i7 = (((i6 | 20) << 1) - (i6 ^ 20)) - 1;
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            int i8 = (((i6 | 74) << 1) - (i6 ^ 74)) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                canvas.drawLine(f, f2, f3, f4, paint);
            } else {
                canvas.drawLine(f, f2, f3, f4, paint);
                obj.hashCode();
                throw null;
            }
        }

        private void createShadow(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            RectF rectF = new RectF();
            Paint paint = new Paint();
            int i6 = a;
            int i7 = ((i6 & 70) + (i6 | 70)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            paint.setARGB(150, 0, 0, 0);
            int i9 = b;
            int i10 = (((i9 | 4) << 1) - (i9 ^ 4)) - 1;
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = i11 | 57;
            int i14 = i13 << 1;
            int i15 = -((~(i11 & 57)) & i13);
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            rectF.set(i, i2, i3, i4);
            canvas.drawRect(rectF, paint);
            int i18 = b;
            int i19 = (i18 & 34) + (i18 | 34);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 13 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0241  */
        /* JADX WARN: Code duplicated, block: B:55:0x0254  */
        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int i;
            int i2;
            int i3;
            int i4;
            String str;
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = i6 & 45;
            int i8 = i7 + ((i6 ^ 45) | i7);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                super.onDraw(canvas);
                canvas.save();
                throw null;
            }
            super.onDraw(canvas);
            canvas.save();
            float fAccess$300 = FragmentTree.access$300(FragmentTree.this);
            float fAccess$301 = FragmentTree.access$300(FragmentTree.this);
            FragmentTree fragmentTree = FragmentTree.this;
            int i9 = a;
            int i10 = (i9 & (-120)) | ((~i9) & 119);
            int i11 = -(-((i9 & 119) << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            canvas.scale(fAccess$300, fAccess$301, FragmentTree.access$200(fragmentTree), FragmentTree.access$400(FragmentTree.this));
            int i14 = b;
            int i15 = (i14 ^ 71) + ((i14 & 71) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                FragmentTree.access$600(FragmentTree.this);
                FragmentTree.access$800(FragmentTree.this);
                throw null;
            }
            canvas.translate(FragmentTree.access$600(FragmentTree.this), FragmentTree.access$800(FragmentTree.this));
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.FILL;
            int i16 = b;
            int i17 = ((i16 | 51) << 1) - (i16 ^ 51);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                paint.setStyle(style);
                paint.setColor(-1);
                canvas.drawPaint(paint);
                int i18 = 56 / 0;
            } else {
                paint.setStyle(style);
                paint.setColor(-1);
                canvas.drawPaint(paint);
            }
            int i19 = a;
            int i20 = 107;
            int i21 = (i19 & 107) + (i19 | 107);
            b = i21 % 128;
            int i22 = i21 % 2;
            List<l> list = this.familyTree.d;
            int i23 = a;
            int i24 = ((i23 | 49) << 1) - (i23 ^ 49);
            b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (i26 < list.size()) {
                int i27 = b;
                int i28 = i27 & 115;
                int i29 = (i27 ^ 115) | i28;
                int i30 = (i28 & i29) + (i29 | i28);
                a = i30 % 128;
                if (i30 % 2 == 0) {
                    list.get(i26);
                    throw null;
                }
                l lVar = list.get(i26);
                int i31 = b + 35;
                a = i31 % 128;
                int i32 = i31 % 2;
                B b2 = lVar.d;
                if (b2 != null) {
                    int i33 = b;
                    int i34 = ((i33 & (-108)) | ((~i33) & i20)) + ((i33 & i20) << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    C0284l c0284l = lVar.a;
                    int i36 = c0284l.c;
                    int i37 = a;
                    int i38 = (i37 ^ 71) + ((i37 & 71) << 1);
                    b = i38 % 128;
                    if (i38 % 2 != 0) {
                        i2 = c0284l.d;
                        i3 = lVar.b;
                        int i39 = 83 / 0;
                    } else {
                        i2 = c0284l.d;
                        i3 = lVar.b;
                    }
                    int i40 = i2;
                    int i41 = a + 123;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = lVar.c;
                    int i44 = a;
                    int i45 = (i44 & 13) + (i44 | 13);
                    b = i45 % 128;
                    if (i45 % 2 != 0) {
                        createRectangle(canvas, i36, i40, i36 >>> i3, i40 >>> i43);
                    } else {
                        int i46 = -(-i3);
                        createRectangle(canvas, i36, i40, (i36 & i46) + (i46 | i36), i40 + i43);
                    }
                    try {
                        Drawable drawableAccess$1100 = FragmentTree.access$1100(FragmentTree.this, b2);
                        int i47 = c0284l.c;
                        int i48 = b;
                        int i49 = i48 & 27;
                        int i50 = ((i48 ^ 27) | i49) << 1;
                        int i51 = -((i48 | 27) & (~i49));
                        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                        int i54 = c0284l.d;
                        int i55 = lVar.b;
                        int i56 = b;
                        int i57 = (i56 ^ 19) + ((i56 & 19) << 1);
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        int i59 = lVar.c;
                        int i60 = b + 75;
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = -(~(-(-i55)));
                        i = i26;
                        try {
                            createImage(drawableAccess$1100, canvas, i47, i54, (((i47 | i62) << 1) - (i62 ^ i47)) - 1, ((i54 | i59) << 1) - (i59 ^ i54));
                            int i63 = a;
                            int i64 = (i63 & 57) + (i63 | 57);
                            b = i64 % 128;
                            if (i64 % 2 != 0) {
                                int i65 = 5 % 3;
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        i = i26;
                    }
                    int i66 = c0284l.c;
                    int i67 = c0284l.d;
                    int i68 = (-2) - ((b + 10) ^ (-1));
                    a = i68 % 128;
                    if (i68 % 2 == 0) {
                        int i69 = lVar.b;
                        int i70 = lVar.c;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i71 = lVar.b;
                    int i72 = lVar.c;
                    int i73 = b;
                    int i74 = (((i73 & (-106)) | ((~i73) & 105)) - (~((i73 & 105) << 1))) - 1;
                    a = i74 % 128;
                    if (i74 % 2 == 0) {
                        createShadow(canvas, i66, i67, i66 >> i71, i67 >> i72);
                    } else {
                        int i75 = i66 & i71;
                        createShadow(canvas, i66, i67, i75 + ((i71 ^ i66) | i75), i67 + i72);
                    }
                    String str2 = b2.e;
                    if (str2 != null) {
                        int i76 = a;
                        int i77 = ((i76 & 34) + (i76 | 34)) - 1;
                        b = i77 % 128;
                        if (i77 % 2 != 0) {
                            str2.equals(BuildConfig.FLAVOR);
                            throw null;
                        }
                        if (str2.equals(BuildConfig.FLAVOR)) {
                            int i78 = a;
                            int i79 = i78 & 15;
                            int i80 = (i78 ^ 15) | i79;
                            i4 = ((i79 | i80) << 1) - (i80 ^ i79);
                            b = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i81 = 5 / 5;
                            }
                            str = "No Spouse";
                        } else {
                            str = b2.e;
                            int i82 = a;
                            int i83 = i82 & 43;
                            int i84 = -(-((i82 ^ 43) | i83));
                            int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                            b = i85 % 128;
                            int i86 = i85 % 2;
                        }
                    } else {
                        int i710 = a;
                        int i711 = i710 & 15;
                        int i87 = (i710 ^ 15) | i711;
                        i4 = ((i711 | i87) << 1) - (i87 ^ i711);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i88 = 5 / 5;
                        }
                        str = "No Spouse";
                    }
                    int i89 = c0284l.c;
                    int i90 = c0284l.d;
                    int i91 = a;
                    int i92 = (i91 & (-10)) | ((~i91) & 9);
                    int i93 = -(-((i91 & 9) << 1));
                    int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                    b = i94 % 128;
                    if (i94 % 2 != 0) {
                        createText(canvas, str, i89 << 5, i90 + 61);
                    } else {
                        int i95 = (i89 | 5) << 1;
                        int i96 = -((5 & (~i89)) | (i89 & (-6)));
                        createText(canvas, str, ((i95 | i96) << 1) - (i96 ^ i95), (-2) - (((i90 & 14) + (i90 | 14)) ^ (-1)));
                    }
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Age ");
                    int i97 = b2.f;
                    int i98 = (-2) - ((a + 80) ^ (-1));
                    b = i98 % 128;
                    int i99 = i98 % 2;
                    sbW.append(String.valueOf(i97));
                    String string = sbW.toString();
                    int i100 = a;
                    int i101 = i100 & 41;
                    int i102 = (i101 - (~((i100 ^ 41) | i101))) - 1;
                    b = i102 % 128;
                    int i103 = i102 % 2;
                    int i104 = c0284l.c;
                    int i105 = c0284l.d;
                    int i106 = a;
                    int i107 = i106 ^ 77;
                    int i108 = -(-((i106 & 77) << 1));
                    int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                    b = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = ((i104 | 5) << 1) - (i104 ^ 5);
                    int i112 = i105 & 43;
                    createText(canvas, string, i111, i112 + ((i105 ^ 43) | i112));
                    int i113 = b;
                    int i114 = i113 ^ 85;
                    int i115 = (((i113 & 85) | i114) << 1) - i114;
                    a = i115 % 128;
                    int i116 = i115 % 2;
                } else {
                    i = i26;
                }
                int i117 = i;
                int i118 = i117 & 1;
                int i119 = (~i118) & (i117 | 1);
                int i120 = -(-(i118 << 1));
                i26 = ((i119 | i120) << 1) - (i120 ^ i119);
                int i121 = a;
                int i122 = ((i121 & (-6)) | (5 & (~i121))) + ((i121 & 5) << 1);
                b = i122 % 128;
                int i123 = i122 % 2;
                i20 = 107;
            }
            List<u> list2 = this.familyTree.e;
            int i124 = a;
            int i125 = (-2) - ((-1) ^ ((i124 ^ 8) + ((i124 & 8) << 1)));
            b = i125 % 128;
            int i126 = i125 % 2;
            int i127 = 0;
            while (i127 < list2.size()) {
                int i128 = a;
                int i129 = (i128 & (-32)) | ((~i128) & 31);
                int i130 = (i128 & 31) << 1;
                int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                b = i131 % 128;
                if (i131 % 2 != 0) {
                    list2.get(i127);
                    throw null;
                }
                u uVar = list2.get(i127);
                int i132 = b;
                int i133 = (i132 ^ 64) + ((i132 & 64) << 1);
                int i134 = (i133 ^ (-1)) + (i133 << 1);
                a = i134 % 128;
                int i135 = i134 % 2;
                C0284l c0284l2 = uVar.a;
                int i136 = c0284l2.c;
                int i137 = c0284l2.d;
                int i138 = b;
                int i139 = ((i138 ^ 65) | (i138 & 65)) << 1;
                int i140 = -(((~i138) & 65) | (i138 & (-66)));
                int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                a = i141 % 128;
                int i142 = i141 % 2;
                C0284l c0284l3 = uVar.b;
                int i143 = c0284l3.c;
                int i144 = a;
                int i145 = (i144 & (-2)) | ((~i144) & 1);
                int i146 = (i144 & 1) << 1;
                int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                b = i147 % 128;
                if (i147 % 2 != 0) {
                    int i148 = c0284l3.d;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i149 = c0284l3.d;
                int i150 = b;
                int i151 = (((i150 | 66) << 1) - (i150 ^ 66)) - 1;
                a = i151 % 128;
                if (i151 % 2 == 0) {
                    createLine(canvas, i136, i137, i143, i149);
                    int i152 = i127 & 143;
                    int i153 = (i127 ^ 143) | i152;
                    int i154 = (i152 & i153) + (i152 | i153);
                    int i155 = (i154 ^ (-53)) + ((i154 & (-53)) << 1);
                    i127 = (i155 ^ (-1)) + (i155 << 1);
                } else {
                    createLine(canvas, i136, i137, i143, i149);
                    int i156 = i127 & 53;
                    int i157 = ((~i156) & (i127 | 53)) + (i156 << 1);
                    int i158 = i157 & (-52);
                    i127 = i158 + ((i157 ^ (-52)) | i158);
                }
                int i159 = b;
                int i160 = i159 | 121;
                int i161 = i160 << 1;
                int i162 = -((~(i159 & 121)) & i160);
                int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
                a = i163 % 128;
                int i164 = i163 % 2;
            }
            canvas.restore();
            int i165 = a;
            int i166 = i165 & 55;
            int i167 = i166 + ((i165 ^ 55) | i166);
            b = i167 % 128;
            int i168 = i167 % 2;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float f;
            FragmentTree fragmentTree;
            float fAccess$300;
            float y;
            float fAccess$600;
            float fAccess$200;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 29;
            int i4 = ((i2 ^ 29) | i3) << 1;
            int i5 = -((i2 | 29) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                FragmentTree.access$000(FragmentTree.this).onTouchEvent(motionEvent);
                int i7 = 16 / 0;
            } else {
                FragmentTree.access$000(FragmentTree.this).onTouchEvent(motionEvent);
            }
            int i8 = a + 123;
            b = i8 % 128;
            int i9 = i8 % 2;
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                int i10 = a;
                int i11 = i10 ^ 41;
                int i12 = ((i10 & 41) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 & i13) + (i12 | i13);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                if (action != 1) {
                    int i17 = (i15 ^ 121) + ((i15 & 121) << 1);
                    int i18 = i17 % 128;
                    a = i18;
                    if (i17 % 2 != 0 ? action == 2 : action == 5) {
                        int i19 = (i18 ^ 95) + ((i18 & 95) << 1);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        float x = motionEvent.getX() - FragmentTree.access$200(FragmentTree.this);
                        FragmentTree fragmentTree2 = FragmentTree.this;
                        int i21 = b;
                        int i22 = (i21 ^ 102) + ((i21 & 102) << 1);
                        int i23 = (i22 ^ (-1)) + (i22 << 1);
                        a = i23 % 128;
                        if (i23 % 2 == 0) {
                            fAccess$300 = x / FragmentTree.access$300(fragmentTree2);
                            y = motionEvent.getY();
                        } else {
                            fAccess$300 = x / FragmentTree.access$300(fragmentTree2);
                            y = motionEvent.getY();
                        }
                        float fAccess$400 = (y - FragmentTree.access$400(FragmentTree.this)) / FragmentTree.access$300(FragmentTree.this);
                        FragmentTree fragmentTree3 = FragmentTree.this;
                        int i24 = a;
                        int i25 = (i24 ^ 35) + ((i24 & 35) << 1);
                        b = i25 % 128;
                        if (i25 % 2 != 0) {
                            fAccess$600 = FragmentTree.access$600(fragmentTree3);
                            fAccess$200 = FragmentTree.access$200(FragmentTree.this);
                            int i26 = 65 / 0;
                        } else {
                            fAccess$600 = FragmentTree.access$600(fragmentTree3);
                            fAccess$200 = FragmentTree.access$200(FragmentTree.this);
                        }
                        int i27 = a;
                        int i28 = (i27 & 11) + (i27 | 11);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        FragmentTree.access$502(fragmentTree3, fAccess$200 + (fAccess$300 - fAccess$600));
                        FragmentTree fragmentTree4 = FragmentTree.this;
                        int i30 = a;
                        int i31 = i30 & 125;
                        int i32 = (((i30 | 125) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        float fAccess$800 = FragmentTree.access$800(fragmentTree4);
                        float fAccess$401 = FragmentTree.access$400(FragmentTree.this);
                        int i34 = b + 37;
                        a = i34 % 128;
                        if (i34 % 2 == 0) {
                            FragmentTree.access$702(fragmentTree4, fAccess$401 - (fAccess$400 - fAccess$800));
                        } else {
                            FragmentTree.access$702(fragmentTree4, fAccess$401 + (fAccess$400 - fAccess$800));
                        }
                        ScaleGestureDetector scaleGestureDetectorAccess$000 = FragmentTree.access$000(FragmentTree.this);
                        int i35 = b;
                        int i36 = (i35 ^ 121) + ((i35 & 121) << 1);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        if (!scaleGestureDetectorAccess$000.isInProgress()) {
                            int i38 = a;
                            int i39 = i38 & 75;
                            int i40 = (i38 ^ 75) | i39;
                            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                            b = i41 % 128;
                            int i42 = i41 % 2;
                            float fAccess$900 = FragmentTree.access$900(FragmentTree.this);
                            float fAccess$1000 = FragmentTree.access$1000(FragmentTree.this);
                            int i43 = b;
                            int i44 = i43 & 73;
                            int i45 = -(-((i43 ^ 73) | i44));
                            int i46 = (i44 & i45) + (i45 | i44);
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            FragmentTree.access$616(FragmentTree.this, fAccess$300 - fAccess$900);
                            FragmentTree fragmentTree5 = FragmentTree.this;
                            int i48 = a + 43;
                            b = i48 % 128;
                            if (i48 % 2 != 0) {
                                FragmentTree.access$816(fragmentTree5, fAccess$400 / fAccess$1000);
                            } else {
                                FragmentTree.access$816(fragmentTree5, fAccess$400 - fAccess$1000);
                            }
                            invalidate();
                        }
                        FragmentTree.access$902(FragmentTree.this, fAccess$300);
                        FragmentTree fragmentTree6 = FragmentTree.this;
                        int i49 = a;
                        int i50 = i49 & 97;
                        int i51 = (i49 ^ 97) | i50;
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        b = i52 % 128;
                        int i53 = i52 % 2;
                        FragmentTree.access$1002(fragmentTree6, fAccess$400);
                        int i54 = b;
                        int i55 = (((i54 ^ 25) | (i54 & 25)) << 1) - (((~i54) & 25) | (i54 & (-26)));
                        a = i55 % 128;
                        int i56 = i55 % 2;
                    }
                } else {
                    float x2 = motionEvent.getX() - FragmentTree.access$200(FragmentTree.this);
                    FragmentTree fragmentTree7 = FragmentTree.this;
                    int i57 = a;
                    int i58 = i57 ^ 35;
                    int i59 = (((i57 & 35) | i58) << 1) - i58;
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    float fAccess$301 = x2 / FragmentTree.access$300(fragmentTree7);
                    float y2 = motionEvent.getY();
                    float fAccess$402 = FragmentTree.access$400(FragmentTree.this);
                    int i61 = a;
                    int i62 = ((i61 & (-8)) | ((~i61) & 7)) + ((i61 & 7) << 1);
                    b = i62 % 128;
                    float fAccess$302 = i62 % 2 != 0 ? (y2 % fAccess$402) - FragmentTree.access$300(FragmentTree.this) : (y2 - fAccess$402) / FragmentTree.access$300(FragmentTree.this);
                    FragmentTree fragmentTree8 = FragmentTree.this;
                    int i63 = (-2) - ((b + 4) ^ (-1));
                    a = i63 % 128;
                    int i64 = i63 % 2;
                    float fAccess$601 = FragmentTree.access$600(fragmentTree8);
                    float fAccess$201 = FragmentTree.access$200(FragmentTree.this);
                    int i65 = b;
                    int i66 = ((i65 ^ 11) | (i65 & 11)) << 1;
                    int i67 = -(((~i65) & 11) | (i65 & (-12)));
                    int i68 = (i66 & i67) + (i67 | i66);
                    a = i68 % 128;
                    if (i68 % 2 == 0) {
                        FragmentTree.access$502(fragmentTree8, fAccess$201 % (fAccess$301 + fAccess$601));
                    } else {
                        FragmentTree.access$502(fragmentTree8, fAccess$201 + (fAccess$301 - fAccess$601));
                    }
                    FragmentTree fragmentTree9 = FragmentTree.this;
                    float fAccess$801 = FragmentTree.access$800(fragmentTree9);
                    int i69 = a;
                    int i70 = ((i69 & 5) - (~(-(-(5 | i69))))) - 1;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    FragmentTree.access$702(fragmentTree9, FragmentTree.access$400(FragmentTree.this) + (fAccess$302 - fAccess$801));
                    int i72 = a;
                    int i73 = i72 & 57;
                    int i74 = ((i72 ^ 57) | i73) << 1;
                    int i75 = -((i72 | 57) & (~i73));
                    int i76 = (i74 & i75) + (i75 | i74);
                    b = i76 % 128;
                    if (i76 % 2 != 0) {
                        FragmentTree.access$902(FragmentTree.this, 0.0f);
                        fragmentTree = FragmentTree.this;
                        f = 2.0f;
                    } else {
                        FragmentTree.access$902(FragmentTree.this, 0.0f);
                        f = 0.0f;
                        fragmentTree = FragmentTree.this;
                    }
                    FragmentTree.access$1002(fragmentTree, f);
                    invalidate();
                    int i77 = a;
                    int i78 = ((i77 ^ 113) | (i77 & 113)) << 1;
                    int i79 = -(((~i77) & 113) | (i77 & (-114)));
                    int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                }
            } else {
                float x3 = motionEvent.getX() - FragmentTree.access$200(FragmentTree.this);
                FragmentTree fragmentTree10 = FragmentTree.this;
                int i82 = b + 41;
                a = i82 % 128;
                int i83 = i82 % 2;
                float fAccess$303 = x3 / FragmentTree.access$300(fragmentTree10);
                float y3 = motionEvent.getY();
                float fAccess$403 = FragmentTree.access$400(FragmentTree.this);
                int i84 = b;
                int i85 = ((i84 | 23) << 1) - (i84 ^ 23);
                a = i85 % 128;
                int i86 = i85 % 2;
                float fAccess$304 = (y3 - fAccess$403) / FragmentTree.access$300(FragmentTree.this);
                FragmentTree fragmentTree11 = FragmentTree.this;
                int i87 = a + 41;
                b = i87 % 128;
                int i88 = i87 % 2;
                float fAccess$602 = FragmentTree.access$600(fragmentTree11);
                float fAccess$202 = FragmentTree.access$200(FragmentTree.this);
                int i89 = a;
                int i90 = ((i89 | 87) << 1) - (i89 ^ 87);
                b = i90 % 128;
                if (i90 % 2 != 0) {
                    FragmentTree.access$502(fragmentTree11, fAccess$202 / (fAccess$303 % fAccess$602));
                } else {
                    FragmentTree.access$502(fragmentTree11, fAccess$202 + (fAccess$303 - fAccess$602));
                }
                FragmentTree fragmentTree12 = FragmentTree.this;
                float fAccess$802 = FragmentTree.access$800(fragmentTree12);
                int i91 = b;
                int i92 = ((i91 ^ 63) | (i91 & 63)) << 1;
                int i93 = -(((~i91) & 63) | (i91 & (-64)));
                int i94 = (i92 & i93) + (i93 | i92);
                a = i94 % 128;
                int i95 = i94 % 2;
                float fAccess$404 = FragmentTree.access$400(FragmentTree.this) + (fAccess$304 - fAccess$802);
                int i96 = b;
                int i97 = (i96 ^ 53) + ((i96 & 53) << 1);
                a = i97 % 128;
                int i98 = i97 % 2;
                FragmentTree.access$702(fragmentTree12, fAccess$404);
                FragmentTree.access$902(FragmentTree.this, fAccess$303);
                FragmentTree fragmentTree13 = FragmentTree.this;
                int i99 = a;
                int i100 = (i99 & 85) + (i99 | 85);
                b = i100 % 128;
                if (i100 % 2 != 0) {
                    FragmentTree.access$1002(fragmentTree13, fAccess$304);
                    int i101 = 91 / 0;
                } else {
                    FragmentTree.access$1002(fragmentTree13, fAccess$304);
                }
            }
            int i102 = a + 86;
            int i103 = (i102 ^ (-1)) + (i102 << 1);
            b = i103 % 128;
            int i104 = i103 % 2;
            return true;
        }
    }

    public static /* synthetic */ ScaleGestureDetector access$000(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = d + 27;
        c = i2 % 128;
        int i3 = i2 % 2;
        ScaleGestureDetector scaleGestureDetector = fragmentTree.mScaleDetector;
        if (i3 == 0) {
            return scaleGestureDetector;
        }
        throw null;
    }

    public static /* synthetic */ ScaleGestureDetector access$002(FragmentTree fragmentTree, ScaleGestureDetector scaleGestureDetector) {
        int i = 2 % 2;
        int i2 = d + 77;
        c = i2 % 128;
        int i3 = i2 % 2;
        fragmentTree.mScaleDetector = scaleGestureDetector;
        if (i3 == 0) {
            return scaleGestureDetector;
        }
        throw null;
    }

    public static /* synthetic */ float access$1000(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 111;
        c = i3 % 128;
        int i4 = i3 % 2;
        float f = fragmentTree.mLastTouchY;
        int i5 = i2 + 109;
        c = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$1002(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 13;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        fragmentTree.mLastTouchY = f;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 31;
        c = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ Drawable access$1100(FragmentTree fragmentTree, B b) {
        int i = 2 % 2;
        int i2 = d + 119;
        c = i2 % 128;
        int i3 = i2 % 2;
        Drawable imageForRoster = fragmentTree.getImageForRoster(b);
        int i4 = d + 71;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return imageForRoster;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float access$200(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = d + 9;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return fragmentTree.scalePointX;
        }
        float f = fragmentTree.scalePointX;
        throw null;
    }

    public static /* synthetic */ float access$202(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 5;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentTree.scalePointX = f;
            return f;
        }
        fragmentTree.scalePointX = f;
        throw null;
    }

    public static /* synthetic */ float access$300(FragmentTree fragmentTree) {
        float f;
        int i = 2 % 2;
        int i2 = d + 85;
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 != 0) {
            f = fragmentTree.mScaleFactor;
            int i4 = 39 / 0;
        } else {
            f = fragmentTree.mScaleFactor;
        }
        int i5 = i3 + 17;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$302(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = d + 119;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        fragmentTree.mScaleFactor = f;
        int i5 = i3 + 3;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static /* synthetic */ float access$332(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 111;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f2 = fragmentTree.mScaleFactor * f;
        fragmentTree.mScaleFactor = f2;
        int i5 = i2 + 45;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public static /* synthetic */ float access$400(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = d + 1;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        float f = fragmentTree.scalePointY;
        int i5 = i3 + 123;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float access$402(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        fragmentTree.scalePointY = f;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return f;
    }

    public static /* synthetic */ float access$502(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 59;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        fragmentTree.cX = f;
        int i5 = i3 + 11;
        c = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$600(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = d + 23;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        float f = fragmentTree.mPosX;
        int i5 = i3 + 107;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$616(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 99;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        float f2 = fragmentTree.mPosX + f;
        fragmentTree.mPosX = f2;
        int i5 = i3 + 105;
        c = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public static /* synthetic */ float access$702(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c + 19;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        fragmentTree.cY = f;
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 41;
        c = i6 % 128;
        if (i6 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float access$800(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = c + 25;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        float f = fragmentTree.mPosY;
        int i5 = i3 + 101;
        c = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$816(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = d + 1;
        int i3 = i2 % 128;
        c = i3;
        float f2 = (i2 % 2 != 0 ? fragmentTree.mPosY : fragmentTree.mPosY) + f;
        fragmentTree.mPosY = f2;
        int i4 = i3 + 71;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return f2;
        }
        throw null;
    }

    public static /* synthetic */ float access$900(FragmentTree fragmentTree) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 115;
        d = i3 % 128;
        int i4 = i3 % 2;
        float f = fragmentTree.mLastTouchX;
        int i5 = i2 + 109;
        d = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static /* synthetic */ float access$902(FragmentTree fragmentTree, float f) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 79;
        d = i3 % 128;
        int i4 = i3 % 2;
        fragmentTree.mLastTouchX = f;
        int i5 = i2 + 105;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return f;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        int i2 = d + 37;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        d = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        int i2 = d + 11;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = c + 27;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        c = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private Drawable getImageForRoster(B b) {
        int i = 2 % 2;
        String str = b.h;
        Object[] objArr = new Object[1];
        a(true, new byte[]{1, 1, 1, 0}, new int[]{0, 4, 0, 0}, objArr);
        Object obj = null;
        if (str.equals(((String) objArr[0]).intern())) {
            int i2 = d + 111;
            c = i2 % 128;
            int i3 = i2 % 2;
            int i4 = b.f;
            if (i4 > 60) {
                return getResources().getDrawable(R.drawable.male_senior);
            }
            if (i4 <= 60 && i4 >= 18) {
                return getResources().getDrawable(R.drawable.male_adult);
            }
            if (i4 < 18) {
                return getResources().getDrawable(R.drawable.male_junior);
            }
        } else {
            String str2 = b.h;
            Object[] objArr2 = new Object[1];
            a(false, new byte[]{0, 1, 0, 0, 1, 1}, new int[]{4, 6, 82, 0}, objArr2);
            if (str2.equals(((String) objArr2[0]).intern())) {
                int i5 = b.f;
                if (i5 > 60) {
                    return getResources().getDrawable(R.drawable.female_senior);
                }
                if (i5 <= 60 && i5 >= 18) {
                    return getResources().getDrawable(R.drawable.female_adult);
                }
                if (i5 < 18) {
                    return getResources().getDrawable(R.drawable.female_junior);
                }
            } else {
                String str3 = b.h;
                Object[] objArr3 = new Object[1];
                a(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}, new int[]{10, 11, 18, 9}, objArr3);
                if (str3.equals(((String) objArr3[0]).intern())) {
                    int i6 = b.f;
                    if (i6 > 60) {
                        Drawable drawable = getResources().getDrawable(R.drawable.trans_senior);
                        int i7 = d + 103;
                        c = i7 % 128;
                        if (i7 % 2 == 0) {
                            return drawable;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    if (i6 <= 60 && i6 >= 18) {
                        int i8 = c + 63;
                        d = i8 % 128;
                        int i9 = i8 % 2;
                        return getResources().getDrawable(R.drawable.trans_adult);
                    }
                    if (i6 < 18) {
                        return getResources().getDrawable(R.drawable.trans_junior);
                    }
                }
            }
        }
        int i10 = d + 27;
        c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 18 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:130:0x0408  */
    /* JADX WARN: Code duplicated, block: B:149:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:157:0x0562  */
    /* JADX WARN: Code duplicated, block: B:158:0x0581  */
    /* JADX WARN: Code duplicated, block: B:161:0x05a9 A[LOOP:9: B:159:0x05a1->B:161:0x05a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0235  */
    /* JADX WARN: Code duplicated, block: B:97:0x0362  */
    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        P p;
        ArrayList<B> arrayList;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2;
        t tVar;
        int i13;
        int i14;
        B b;
        FragmentTree fragmentTree = this;
        int i15 = 2;
        int i16 = 2 % 2;
        int i17 = 0;
        try {
            if (fragmentTree.parentView == null) {
                View viewInflate = layoutInflater.inflate(R.layout.fragment_tree, viewGroup, false);
                fragmentTree.parentView = viewInflate;
                ButterKnife.c(fragmentTree, viewInflate);
            }
            while (true) {
                int size = arrayList.size();
                boolean z = true;
                Object[] objArr = new Object[1];
                a(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}, new int[]{10, 11, 18, 9}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(false, new byte[]{0, 1, 0, 0, 1, 1}, new int[]{4, 6, 82, 0}, objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a(true, new byte[]{1, 1, 1, 0}, new int[]{0, 4, 0, 0}, objArr3);
                String strIntern3 = ((String) objArr3[0]).intern();
                if (i >= size) {
                    for (int i18 = 0; i18 < p.c.size(); i18++) {
                        p.c.get(i18).clear();
                    }
                    p.c.clear();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Map.Entry<String, t>> it = p.g.entrySet().iterator();
                    while (it.hasNext() == z) {
                        fragmentTree = fragmentTree;
                        strIntern3 = strIntern3;
                        strIntern = strIntern;
                        int i19 = c + 75;
                        d = i19 % 128;
                        if (i19 % 2 == 0) {
                            t value = it.next().getValue();
                            value.d = true;
                            arrayList2.add(value);
                            z = true;
                            i17 = 0;
                        } else {
                            t value2 = it.next().getValue();
                            value2.d = false;
                            arrayList2.add(value2);
                            z = true;
                            i17 = 0;
                        }
                    }
                    Collections.sort(arrayList2, new z(p));
                    for (int i20 = i17; i20 < arrayList2.size(); i20++) {
                        int i21 = d + 75;
                        c = i21 % 128;
                        if (i21 % 2 != 0) {
                            boolean z2 = ((t) arrayList2.get(i20)).d;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        t tVar2 = (t) arrayList2.get(i20);
                        if (!tVar2.d) {
                            p.c(tVar2, i17);
                        }
                    }
                    p.d.clear();
                    p.e.clear();
                    int i22 = i17;
                    int i23 = i22;
                    while (i22 < p.c.size()) {
                        int i24 = i23 * 490;
                        int i25 = i24 + 80;
                        ArrayList<t> arrayList3 = p.c.get(i22);
                        int i26 = i17;
                        int i27 = i26;
                        int i28 = 100;
                        while (i26 < arrayList3.size()) {
                            t tVar3 = arrayList3.get(i26);
                            int size2 = tVar3.c.size();
                            B b2 = tVar3.a;
                            ArrayList<t> arrayList4 = arrayList3;
                            int i29 = b2.d;
                            if (i29 >= 0 || tVar3.b.d >= 0) {
                                i2 = i22;
                                i3 = i23;
                                str = strIntern;
                                i4 = 430;
                                if (size2 == 0 && i29 > 0) {
                                    int i30 = c + 11;
                                    d = i30 % 128;
                                    if (i30 % 2 == 0) {
                                        int i31 = tVar3.b.d;
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (tVar3.b.d > 0) {
                                        i27++;
                                        int i32 = i24 + 80;
                                        p.d.add(new l(new C0284l(i28, i32), 200, 200, b2));
                                        int i33 = i28 + 230;
                                        p.d.add(new l(new C0284l(i33, i32), 200, 200, tVar3.b));
                                        int i34 = i24 + 180;
                                        p.e.add(new u(new C0284l(i28 + 200, i34), new C0284l(i33, i34)));
                                    } else if (size2 > 0) {
                                        i5 = ((size2 - 1) * 30) + (size2 * 200);
                                        if (i5 > 430) {
                                            i6 = i5;
                                        } else {
                                            i6 = 430;
                                        }
                                        i7 = (i6 / 2) + i28;
                                        int i35 = i24 + 280;
                                        int i36 = i24 + 80;
                                        int i37 = i6;
                                        p.d.add(new l(new C0284l(i7 - 215, i36), 200, 200, b2));
                                        p.d.add(new l(new C0284l(i7 + 15, i36), 200, 200, tVar3.b));
                                        int i38 = i7 - 115;
                                        int i39 = i24 + 290;
                                        p.e.add(new u(new C0284l(i38, i35), new C0284l(i38, i39)));
                                        int i40 = i7 + 115;
                                        p.e.add(new u(new C0284l(i40, i35), new C0284l(i40, i39)));
                                        p.e.add(new u(new C0284l(i38, i39), new C0284l(i40, i39)));
                                        i8 = i24 + 300;
                                        p.e.add(new u(new C0284l(i7, i39), new C0284l(i7, i8)));
                                        if (size2 == 1) {
                                            p.d.add(new l(new C0284l(i7 - 100, i8), 200, 200, tVar3.c.get(0)));
                                        } else {
                                            i9 = i24 + 310;
                                            i10 = i7 - (i5 / 2);
                                            p.e.add(new u(new C0284l(i10 + 100, i8), new C0284l((i5 + i10) - 100, i8)));
                                            for (i11 = 0; i11 < tVar3.c.size(); i11++) {
                                                int i41 = i10 + 100;
                                                p.e.add(new u(new C0284l(i41, i8), new C0284l(i41, i9)));
                                                p.d.add(new l(new C0284l(i10, i9), 200, 200, tVar3.c.get(i11)));
                                                i10 += 230;
                                            }
                                        }
                                        i27++;
                                        i4 = i37;
                                    } else {
                                        i4 = 0;
                                    }
                                } else if (size2 > 0) {
                                    i5 = ((size2 - 1) * 30) + (size2 * 200);
                                    if (i5 > 430) {
                                        i6 = i5;
                                    } else {
                                        i6 = 430;
                                    }
                                    i7 = (i6 / 2) + i28;
                                    int i310 = i24 + 280;
                                    int i311 = i24 + 80;
                                    int i312 = i6;
                                    p.d.add(new l(new C0284l(i7 - 215, i311), 200, 200, b2));
                                    p.d.add(new l(new C0284l(i7 + 15, i311), 200, 200, tVar3.b));
                                    int i313 = i7 - 115;
                                    int i314 = i24 + 290;
                                    p.e.add(new u(new C0284l(i313, i310), new C0284l(i313, i314)));
                                    int i42 = i7 + 115;
                                    p.e.add(new u(new C0284l(i42, i310), new C0284l(i42, i314)));
                                    p.e.add(new u(new C0284l(i313, i314), new C0284l(i42, i314)));
                                    i8 = i24 + 300;
                                    p.e.add(new u(new C0284l(i7, i314), new C0284l(i7, i8)));
                                    if (size2 == 1) {
                                        p.d.add(new l(new C0284l(i7 - 100, i8), 200, 200, tVar3.c.get(0)));
                                    } else {
                                        i9 = i24 + 310;
                                        i10 = i7 - (i5 / 2);
                                        p.e.add(new u(new C0284l(i10 + 100, i8), new C0284l((i5 + i10) - 100, i8)));
                                        while (i11 < tVar3.c.size()) {
                                            int i43 = i10 + 100;
                                            p.e.add(new u(new C0284l(i43, i8), new C0284l(i43, i9)));
                                            p.d.add(new l(new C0284l(i10, i9), 200, 200, tVar3.c.get(i11)));
                                            i10 += 230;
                                        }
                                    }
                                    i27++;
                                    i4 = i312;
                                } else {
                                    i4 = 0;
                                }
                            } else {
                                int i44 = 0;
                                int i45 = 0;
                                while (i44 < size2) {
                                    int i46 = c + 117;
                                    int i47 = i45;
                                    d = i46 % 128;
                                    if (i46 % 2 == 0) {
                                        B b3 = tVar3.c.get(i44);
                                        int i48 = b3.d;
                                        b3.h.equals(strIntern3);
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    B b4 = tVar3.c.get(i44);
                                    int i49 = b4.d;
                                    int i50 = i22;
                                    String str3 = b4.h;
                                    int i51 = i23;
                                    if (str3.equals(strIntern3)) {
                                        if (((F) b4).a.size() == 0) {
                                            t tVar4 = p.g.get(p.d(i49, -50));
                                            if (tVar4 == null) {
                                                p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                            } else if (tVar4.c.size() == 0) {
                                                p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                            }
                                            str2 = strIntern;
                                            i14 = i27 + 1;
                                            i45 = 200;
                                        }
                                        str2 = strIntern;
                                        i14 = i27;
                                        i45 = i47;
                                    } else {
                                        if (str3.equals(strIntern2)) {
                                            int i52 = c + 65;
                                            d = i52 % 128;
                                            if (i52 % 2 == 0) {
                                                F f = ((ae) b4).a;
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                            F f2 = ((ae) b4).a;
                                            if (f2 == null || (i13 = f2.d) < 0 || p.f.get(Integer.valueOf(i13)) == null) {
                                                str2 = strIntern;
                                                int i53 = d + 119;
                                                c = i53 % 128;
                                                int i54 = i53 % 2;
                                                tVar = p.g.get(p.d(i49, -50));
                                                if (tVar == null) {
                                                    p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                                } else if (tVar.c.size() == 0) {
                                                    p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                                }
                                                i14 = i27 + 1;
                                                i45 = 200;
                                            } else {
                                                str2 = strIntern;
                                            }
                                        } else if (str3.equals(strIntern)) {
                                            B b5 = ((ai) b4).a;
                                            if (b5 == null || (i12 = b5.d) < 0) {
                                                str2 = strIntern;
                                            } else {
                                                int i55 = c + 73;
                                                str2 = strIntern;
                                                d = i55 % 128;
                                                if (i55 % 2 == 0) {
                                                    p.f.get(Integer.valueOf(i12));
                                                    throw null;
                                                }
                                                if (p.f.get(Integer.valueOf(i12)) == null) {
                                                }
                                            }
                                            int i56 = d + 119;
                                            c = i56 % 128;
                                            int i57 = i56 % 2;
                                            tVar = p.g.get(p.d(i49, -50));
                                            if (tVar == null) {
                                                p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                            } else if (tVar.c.size() == 0) {
                                                p.d.add(new l(new C0284l(i28, i25), 200, 200, b4));
                                            }
                                            i14 = i27 + 1;
                                            i45 = 200;
                                        } else {
                                            str2 = strIntern;
                                        }
                                        i14 = i27;
                                        i45 = i47;
                                    }
                                    if (i27 != i14) {
                                        i28 = i28 + i45 + 40;
                                    }
                                    i44++;
                                    i27 = i14;
                                    i22 = i50;
                                    i23 = i51;
                                    strIntern = str2;
                                }
                                i2 = i22;
                                i3 = i23;
                                str = strIntern;
                                i4 = i45;
                            }
                            i28 = i28 + i4 + 40;
                            i26++;
                            arrayList3 = arrayList4;
                            i25 = i25;
                            i22 = i2;
                            strIntern3 = strIntern3;
                            i23 = i3;
                            strIntern = str;
                        }
                        int i58 = i22;
                        int i59 = i23;
                        String str4 = strIntern3;
                        String str5 = strIntern;
                        if (i27 > 0) {
                            int i60 = c + 23;
                            d = i60 % 128;
                            int i61 = i60 % 2;
                            i23 = i59 + 1;
                        } else {
                            i23 = i59;
                        }
                        i22 = i58 + 1;
                        strIntern3 = str4;
                        strIntern = str5;
                        i17 = 0;
                    }
                    MyView myView = new MyView(getActivity(), p);
                    this.linearLayoutTreeView.removeAllViews();
                    this.linearLayoutTreeView.addView(myView);
                    return this.parentView;
                }
                B b6 = arrayList.get(i);
                int i62 = b6.d;
                String str6 = b6.h;
                B b7 = b6.k;
                B b8 = b6.c;
                String strD = p.d(b7.d, b8.d);
                t tVar5 = p.g.get(strD);
                if (tVar5 == null) {
                    t tVar6 = new t();
                    tVar6.a = b7;
                    tVar6.b = b8;
                    tVar6.c.add(b6);
                    p.g.put(strD, tVar6);
                } else if (!tVar5.c.contains(b6)) {
                    tVar5.c.add(b6);
                }
                Object[] objArr4 = new Object[1];
                a(true, new byte[]{1, 1, 1, 0}, new int[]{0, 4, 0, 0}, objArr4);
                if (str6.equals(((String) objArr4[0]).intern())) {
                    List<ae> list = ((F) b6).a;
                    for (int i63 = 0; i63 < list.size(); i63++) {
                        int i64 = d + 125;
                        c = i64 % 128;
                        if (i64 % i15 != 0) {
                            p.g.get(p.d(i62, list.get(i63).d));
                            throw null;
                        }
                        ae aeVar = list.get(i63);
                        String strD2 = p.d(i62, aeVar.d);
                        if (p.g.get(strD2) == null) {
                            t tVar7 = new t();
                            tVar7.a = b6;
                            tVar7.b = aeVar;
                            p.g.put(strD2, tVar7);
                        }
                    }
                } else {
                    Object[] objArr5 = new Object[1];
                    a(false, new byte[]{0, 1, 0, 0, 1, 1}, new int[]{4, 6, 82, 0}, objArr5);
                    if (str6.equals(((String) objArr5[0]).intern())) {
                        int i65 = c + 23;
                        d = i65 % 128;
                        int i66 = i65 % i15;
                        b = ((ae) b6).a;
                    } else {
                        Object[] objArr6 = new Object[1];
                        a(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}, new int[]{10, 11, 18, 9}, objArr6);
                        b = !(str6.equals(((String) objArr6[0]).intern()) ^ true) ? ((ai) b6).a : null;
                    }
                    if (b != null && p.f.get(Integer.valueOf(b.d)) != null) {
                        String strD3 = p.d(i62, b.d);
                        if (p.g.get(strD3) == null) {
                            t tVar8 = new t();
                            Object[] objArr7 = new Object[1];
                            a(false, new byte[]{0, 1, 0, 0, 1, 1}, new int[]{4, 6, 82, 0}, objArr7);
                            if (str6.equals(((String) objArr7[0]).intern())) {
                                tVar8.b = b6;
                                tVar8.a = b;
                            } else {
                                Object[] objArr8 = new Object[1];
                                a(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}, new int[]{10, 11, 18, 9}, objArr8);
                                if (str6.equals(((String) objArr8[0]).intern())) {
                                    Object[] objArr9 = new Object[1];
                                    a(false, new byte[]{0, 1, 0, 0, 1, 1}, new int[]{4, 6, 82, 0}, objArr9);
                                    if (b.equals(((String) objArr9[0]).intern())) {
                                        tVar8.b = b;
                                        tVar8.a = b6;
                                    } else {
                                        tVar8.b = b6;
                                        tVar8.a = b;
                                    }
                                }
                            }
                            p.g.put(strD3, tVar8);
                        }
                    }
                }
                i++;
                i15 = 2;
            }
        } catch (Exception unused) {
        }
        p = new P();
        arrayList = ((ActivityBeginSurvey) getActivity()).ar;
        p.f.clear();
        for (int i67 = 0; i67 < arrayList.size(); i67++) {
            B b9 = arrayList.get(i67);
            p.f.put(Integer.valueOf(b9.d), b9);
        }
        i = 0;
    }

    private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        i iVar = new i();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = a$s17$2713;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = $10 + 107;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 4;
            }
            for (int i9 = 0; i9 < length; i9++) {
                cArr2[i9] = (char) (((long) cArr[i9]) ^ 2843778254771240638L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iVar.b = 0;
            char c2 = 0;
            while (iVar.b < i4) {
                if (bArr[iVar.b] == 1) {
                    cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c2);
                } else {
                    cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c2);
                }
                c2 = cArr4[iVar.b];
                iVar.b++;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iVar.b = 0;
            while (iVar.b < i4) {
                int i11 = $11 + 115;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr6[iVar.b] = cArr3[(i4 - iVar.b) - 1];
                iVar.b++;
                int i13 = $11 + 65;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $11 + 49;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                iVar.b = 1;
            } else {
                iVar.b = 0;
            }
            while (iVar.b < i4) {
                int i16 = $11 + 63;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] * iArr[5]);
                    i = iVar.b;
                } else {
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] - iArr[2]);
                    i = iVar.b + 1;
                }
                iVar.b = i;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
