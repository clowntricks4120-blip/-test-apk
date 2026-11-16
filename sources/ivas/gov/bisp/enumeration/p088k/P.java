package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p007ag.j;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static int a = 1;
    private static int b;
    public static final PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
    public static P d;
    public K e;

    public class aRH implements K.aRF {
        private static int a = 1;
        private static int b;
        public final int[] c = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] d = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] e = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] f = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] h = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] g = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean c(int[] iArr, int i) {
            int length;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 | 74) << 1) - (i4 ^ 74);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                length = iArr.length;
                i2 = 1;
            } else {
                length = iArr.length;
                i2 = 0;
            }
            int i8 = (i7 & 53) + (i7 | 53);
            a = i8 % 128;
            int i9 = i8 % 2;
            while (i2 < length) {
                int i10 = a;
                int i11 = (((i10 & (-80)) | ((~i10) & 79)) - (~((i10 & 79) << 1))) - 1;
                int i12 = i11 % 128;
                b = i12;
                if (i11 % 2 != 0) {
                    int i13 = iArr[i2];
                    throw null;
                }
                if (iArr[i2] == i) {
                    int i14 = ((i12 | 5) << 1) - (i12 ^ 5);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    return true;
                }
                i2 = (i2 | 1) + (i2 & 1);
                int i16 = (((i12 | 18) << 1) - (i12 ^ 18)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = a;
            int i19 = i18 | 39;
            int i20 = ((i19 << 1) - (~(-((~(i18 & 39)) & i19)))) - 1;
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 73 / 0;
            }
            return false;
        }

        public final ColorStateList d(Context context, int i) {
            int[][] iArr;
            int[] iArr2;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 65;
            int i5 = ((((i3 ^ 65) | i4) << 1) - (~(-((i3 | 65) & (~i4))))) - 1;
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0) {
                iArr = new int[4][];
                iArr2 = new int[3];
            } else {
                iArr = new int[4][];
                iArr2 = new int[4];
            }
            int i7 = i6 & 39;
            int i8 = ((i6 ^ 39) | i7) << 1;
            int i9 = -((i6 | 39) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            int iD = ad.d(context, R.attr.colorControlHighlight);
            int iC = ad.c(context, R.attr.colorButtonNormal);
            int i12 = b;
            int i13 = ((i12 & (-76)) | ((~i12) & 75)) + ((i12 & 75) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            iArr[0] = ad.d;
            int i15 = a;
            int i16 = ((i15 ^ 13) | (i15 & 13)) << 1;
            int i17 = -(((~i15) & 13) | (i15 & (-14)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            iArr2[0] = iC;
            iArr[1] = ad.f;
            int i20 = a;
            int i21 = i20 & 47;
            int i22 = (i20 ^ 47) | i21;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            iArr2[1] = j.c(iD, i);
            iArr[2] = ad.e;
            int i25 = b;
            int i26 = i25 & 103;
            int i27 = (i25 ^ 103) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            iArr2[2] = j.c(iD, i);
            iArr[3] = ad.g;
            iArr2[3] = i;
            ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
            int i30 = b;
            int i31 = i30 & 91;
            int i32 = -(-(i30 | 91));
            int i33 = (i31 & i32) + (i32 | i31);
            a = i33 % 128;
            int i34 = i33 % 2;
            return colorStateList;
        }

        public final void g(Drawable drawable, int i, PorterDuff.Mode mode) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (-2) - (((i3 & 6) + (i3 | 6)) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                W.b(drawable);
                throw null;
            }
            if (W.b(drawable)) {
                drawable = drawable.mutate();
                int i5 = b + 35;
                a = i5 % 128;
                int i6 = i5 % 2;
            }
            if (mode == null) {
                int i7 = a;
                int i8 = (i7 & (-40)) | ((~i7) & 39);
                int i9 = (i7 & 39) << 1;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                mode = P.c;
                int i12 = b;
                int i13 = i12 & 31;
                int i14 = (i12 | 31) & (~i13);
                int i15 = i13 << 1;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            drawable.setColorFilter(P.d(i, mode));
            int i18 = a + 9;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 21 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0088  */
        /* JADX WARN: Code duplicated, block: B:13:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:14:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:27:0x012e  */
        public final LayerDrawable e(K k, Context context, int i) {
            int i2;
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int i3 = 2 % 2;
            int i4 = a + 103;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                context.getResources().getDimensionPixelSize(i);
                k.j(context, R.drawable.abc_star_black_48dp);
                throw null;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableJ = k.j(context, R.drawable.abc_star_black_48dp);
            Drawable drawableJ2 = k.j(context, R.drawable.abc_star_half_black_48dp);
            if (drawableJ instanceof BitmapDrawable) {
                int i5 = a;
                int i6 = i5 & 59;
                int i7 = -(-((i5 ^ 59) | i6));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (drawableJ.getIntrinsicWidth() == dimensionPixelSize) {
                    int i10 = b;
                    int i11 = i10 ^ 93;
                    int i12 = (i10 & 93) << 1;
                    int i13 = (i11 & i12) + (i12 | i11);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    if (drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable = (BitmapDrawable) drawableJ;
                        bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        int i15 = b;
                        int i16 = i15 & 35;
                        int i17 = ((i15 | 35) & (~i16)) + (i16 << 1);
                        int i18 = i17 % 128;
                        a = i18;
                        int i19 = i17 % 2;
                        int i20 = i18 & 105;
                        int i21 = (i18 | 105) & (~i20);
                        int i22 = -(-(i20 << 1));
                        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        int i25 = a;
                        int i26 = i25 ^ 51;
                        int i27 = (i25 & 51) << 1;
                        i2 = ((i26 | i27) << 1) - (i27 ^ i26);
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            drawableJ.setBounds(0, 1, dimensionPixelSize, dimensionPixelSize);
                        } else {
                            drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        }
                        drawableJ.draw(canvas);
                        bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        BitmapDrawable bitmapDrawable4 = new BitmapDrawable(bitmapCreateBitmap);
                        int i28 = b;
                        int i29 = (i28 & 125) + (i28 | 125);
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        bitmapDrawable2 = bitmapDrawable4;
                    }
                } else {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    int i210 = a;
                    int i211 = i210 ^ 51;
                    int i212 = (i210 & 51) << 1;
                    i2 = ((i211 | i212) << 1) - (i212 ^ i211);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        drawableJ.setBounds(0, 1, dimensionPixelSize, dimensionPixelSize);
                    } else {
                        drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    }
                    drawableJ.draw(canvas2);
                    bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap2);
                    BitmapDrawable bitmapDrawable5 = new BitmapDrawable(bitmapCreateBitmap2);
                    int i213 = b;
                    int i214 = (i213 & 125) + (i213 | 125);
                    a = i214 % 128;
                    int i31 = i214 % 2;
                    bitmapDrawable2 = bitmapDrawable5;
                }
            } else {
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                int i215 = a;
                int i216 = i215 ^ 51;
                int i217 = (i215 & 51) << 1;
                i2 = ((i216 | i217) << 1) - (i217 ^ i216);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    drawableJ.setBounds(0, 1, dimensionPixelSize, dimensionPixelSize);
                } else {
                    drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                }
                drawableJ.draw(canvas3);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap3);
                BitmapDrawable bitmapDrawable6 = new BitmapDrawable(bitmapCreateBitmap3);
                int i218 = b;
                int i219 = (i218 & 125) + (i218 | 125);
                a = i219 % 128;
                int i32 = i219 % 2;
                bitmapDrawable2 = bitmapDrawable6;
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if (drawableJ2 instanceof BitmapDrawable) {
                int i33 = a;
                int i34 = i33 & 37;
                int i35 = i34 + ((i33 ^ 37) | i34);
                b = i35 % 128;
                int i36 = i35 % 2;
                if (drawableJ2.getIntrinsicWidth() == dimensionPixelSize) {
                    int i37 = a;
                    int i38 = i37 & 91;
                    int i39 = (i37 | 91) & (~i38);
                    int i40 = -(-(i38 << 1));
                    int i41 = (i39 & i40) + (i39 | i40);
                    b = i41 % 128;
                    if (i41 % 2 != 0) {
                        drawableJ2.getIntrinsicHeight();
                        throw null;
                    }
                    if (drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                        int i42 = a;
                        int i43 = (i42 & (-10)) | ((~i42) & 9);
                        int i44 = (i42 & 9) << 1;
                        int i45 = (i43 & i44) + (i43 | i44);
                        b = i45 % 128;
                        int i46 = i45 % 2;
                        bitmapDrawable3 = (BitmapDrawable) drawableJ2;
                        int i47 = (i42 & (-82)) | ((~i42) & 81);
                        int i48 = (i42 & 81) << 1;
                        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                        b = i49 % 128;
                        int i50 = i49 % 2;
                    } else {
                        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas4 = new Canvas(bitmapCreateBitmap4);
                        int i51 = a + 117;
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawableJ2.draw(canvas4);
                        bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap4);
                        int i53 = a;
                        int i54 = i53 + 83;
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        int i56 = i53 + 21;
                        b = i56 % 128;
                        int i57 = i56 % 2;
                    }
                } else {
                    Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas5 = new Canvas(bitmapCreateBitmap5);
                    int i58 = a + 117;
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    drawableJ2.draw(canvas5);
                    bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap5);
                    int i510 = a;
                    int i511 = i510 + 83;
                    b = i511 % 128;
                    int i512 = i511 % 2;
                    int i513 = i510 + 21;
                    b = i513 % 128;
                    int i514 = i513 % 2;
                }
            } else {
                Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas6 = new Canvas(bitmapCreateBitmap6);
                int i515 = a + 117;
                b = i515 % 128;
                int i516 = i515 % 2;
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas6);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap6);
                int i517 = a;
                int i518 = i517 + 83;
                b = i518 % 128;
                int i519 = i518 % 2;
                int i5110 = i517 + 21;
                b = i5110 % 128;
                int i5111 = i5110 % 2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            int i60 = b;
            int i61 = i60 & 79;
            int i62 = (i60 ^ 79) | i61;
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            a = i63 % 128;
            int i64 = i63 % 2;
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            int i65 = b;
            int i66 = (i65 & 89) + (i65 | 89);
            a = i66 % 128;
            int i67 = i66 % 2;
            layerDrawable.setId(2, android.R.id.progress);
            int i68 = a;
            int i69 = (i68 ^ 35) + ((i68 & 35) << 1);
            b = i69 % 128;
            int i70 = i69 % 2;
            return layerDrawable;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00af  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:31:0x0107  */
        /* JADX WARN: Code duplicated, block: B:32:0x0111  */
        /* JADX WARN: Code duplicated, block: B:33:0x011a  */
        /* JADX WARN: Code duplicated, block: B:35:0x012d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0138  */
        /* JADX WARN: Code duplicated, block: B:39:0x015d  */
        /* JADX WARN: Code duplicated, block: B:40:0x0166  */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x02f3, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x02f4, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x02f5, code lost:
        
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.a;
            r1 = (r14 & 89) + (r14 | 89);
            ivas.gov.bisp.enumeration.k.P.aRH.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0304, code lost:
        
            if ((r1 % 2) != 0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x030a, code lost:
        
            return ivas.gov.bisp.enumeration.p088k.ad.e(r13, ivas.gov.bisp.enumeration.R.attr.colorControlNormal);
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x030b, code lost:
        
            ivas.gov.bisp.enumeration.p088k.ad.e(r13, ivas.gov.bisp.enumeration.R.attr.colorControlNormal);
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0311, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
        
            return ivas.gov.bisp.enumeration.Y.A.b(r13, ivas.gov.bisp.enumeration.R.color.abc_tint_btn_checkable);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0241, code lost:
        
            if (r14 != ivas.gov.bisp.enumeration.R.drawable.abc_spinner_textfield_background_material) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0244, code lost:
        
            if (r14 != ivas.gov.bisp.enumeration.R.drawable.abc_spinner_textfield_background_material) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0246, code lost:
        
            r1 = r1 + 85;
            ivas.gov.bisp.enumeration.k.P.aRH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x024d, code lost:
        
            if ((r1 % 2) != 0) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x024f, code lost:
        
            r2 = 95 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0258, code lost:
        
            if (c(r12.d, r14) == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0263, code lost:
        
            if ((!c(r12.d, r14)) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x026b, code lost:
        
            if (c(r12.h, r14) == true) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0274, code lost:
        
            if ((!c(r12.g, r14)) == false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0279, code lost:
        
            if (r14 != ivas.gov.bisp.enumeration.R.drawable.abc_seekbar_thumb_material) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x027b, code lost:
        
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.b;
            r1 = (r14 | 13) << 1;
            r14 = -(r14 ^ 13);
            r2 = ((r1 | r14) << 1) - (r14 ^ r1);
            ivas.gov.bisp.enumeration.k.P.aRH.a = r2 % 128;
            r2 = r2 % 2;
            r13 = ivas.gov.bisp.enumeration.Y.A.b(r13, ivas.gov.bisp.enumeration.R.color.abc_tint_seek_thumb);
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.b + 69;
            ivas.gov.bisp.enumeration.k.P.aRH.a = r14 % 128;
            r14 = r14 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x029d, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x029e, code lost:
        
            r13 = ivas.gov.bisp.enumeration.k.P.aRH.b;
            r14 = ((r13 | 101) << 1) - (r13 ^ 101);
            ivas.gov.bisp.enumeration.k.P.aRH.a = r14 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02ab, code lost:
        
            if ((r14 % 2) == 0) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x02ad, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x02ae, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x02af, code lost:
        
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.b;
            r1 = (r14 ^ 7) + ((r14 & 7) << 1);
            ivas.gov.bisp.enumeration.k.P.aRH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x02bf, code lost:
        
            if ((r1 % 2) != 0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x02c1, code lost:
        
            r14 = 68 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x02cd, code lost:
        
            return ivas.gov.bisp.enumeration.Y.A.b(r13, ivas.gov.bisp.enumeration.R.color.abc_tint_btn_checkable);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x02ce, code lost:
        
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.b;
            r1 = ((r14 ^ 96) + ((r14 & 96) << 1)) - 1;
            ivas.gov.bisp.enumeration.k.P.aRH.a = r1 % 128;
            r1 = r1 % 2;
            r13 = ivas.gov.bisp.enumeration.Y.A.b(r13, ivas.gov.bisp.enumeration.R.color.abc_tint_default);
            r14 = ivas.gov.bisp.enumeration.k.P.aRH.a;
            r1 = ((r14 | 105) << 1) - (r14 ^ 105);
            ivas.gov.bisp.enumeration.k.P.aRH.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x02f1, code lost:
        
            if ((r1 % 2) != 0) goto L101;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.content.res.ColorStateList f(android.content.Context r13, int r14) {
            /*
                Method dump skipped, instruction units count: 816
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.k.P.aRH.f(android.content.Context, int):android.content.res.ColorStateList");
        }
    }

    static {
        int i = a + 61;
        b = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    public static P c() {
        P p;
        synchronized (P.class) {
            if (d == null) {
                f();
            }
            p = d;
        }
        return p;
    }

    public static PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterD;
        synchronized (P.class) {
            porterDuffColorFilterD = K.d(i, mode);
        }
        return porterDuffColorFilterD;
    }

    public static void f() {
        synchronized (P.class) {
            if (d == null) {
                P p = new P();
                d = p;
                p.e = K.c();
                K k = d.e;
                aRH arh = new aRH();
                synchronized (k) {
                    k.l = arh;
                }
            }
        }
    }

    public final Drawable g(Context context, int i) {
        Drawable drawableJ;
        synchronized (this) {
            drawableJ = this.e.j(context, i);
        }
        return drawableJ;
    }

    public final ColorStateList h(Context context, int i) {
        ColorStateList colorStateListF;
        synchronized (this) {
            colorStateListF = this.e.f(context, i);
        }
        return colorStateListF;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0139  */
    /* JADX WARN: Code duplicated, block: B:41:0x0153  */
    /* JADX WARN: Code duplicated, block: B:43:0x0166  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    public static void e(Drawable drawable, ae aeVar, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuffColorFilter porterDuffColorFilterD;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (-2) - (((i7 & 26) + (i7 | 26)) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        PorterDuff.Mode mode2 = K.d;
        if (W.b(drawable)) {
            int i10 = a;
            int i11 = i10 & 71;
            int i12 = -(-((i10 ^ 71) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                drawable.mutate();
                throw null;
            }
            if (drawable.mutate() == drawable) {
                z = aeVar.d;
                if (!z) {
                    i5 = a + 13;
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        boolean z2 = aeVar.c;
                        throw null;
                    }
                    if (!(!aeVar.c)) {
                        if (z) {
                            int i14 = b;
                            int i15 = (i14 & 21) + (i14 | 21);
                            a = i15 % 128;
                            int i16 = i15 % 2;
                            colorStateList = aeVar.a;
                            int i17 = a;
                            int i18 = ((i17 ^ 124) + ((i17 & 124) << 1)) - 1;
                            b = i18 % 128;
                            int i19 = i18 % 2;
                        } else {
                            int i20 = a + 71;
                            b = i20 % 128;
                            int i21 = i20 % 2;
                            colorStateList = null;
                        }
                        if (aeVar.c) {
                            int i22 = a;
                            i2 = ((((i22 ^ 75) | (i22 & 75)) << 1) - (~(-(((~i22) & 75) | (i22 & (-76)))))) - 1;
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                PorterDuff.Mode mode3 = aeVar.b;
                                throw null;
                            }
                            mode = aeVar.b;
                            int i23 = b;
                            int i24 = (i23 & (-24)) | ((~i23) & 23);
                            int i25 = (i23 & 23) << 1;
                            int i26 = (i24 & i25) + (i25 | i24);
                            a = i26 % 128;
                            int i27 = i26 % 2;
                        } else {
                            mode = K.d;
                            int i28 = b + 29;
                            a = i28 % 128;
                            int i29 = i28 % 2;
                        }
                        if (colorStateList != null) {
                            i = b;
                            int i30 = ((i | 73) << 1) - (i ^ 73);
                            a = i30 % 128;
                            int i31 = i30 % 2;
                            if (mode == null) {
                                int i32 = i & 93;
                                int i33 = ((~i32) & (i | 93)) + (i32 << 1);
                                a = i33 % 128;
                                int i34 = i33 % 2;
                                int i35 = i & 125;
                                int i36 = ((i ^ 125) | i35) << 1;
                                int i37 = -((~i35) & (i | 125));
                                int i38 = (i36 & i37) + (i36 | i37);
                                a = i38 % 128;
                                int i39 = i38 % 2;
                                porterDuffColorFilterD = null;
                            } else {
                                porterDuffColorFilterD = K.d(colorStateList.getColorForState(iArr, 0), mode);
                                int i40 = a;
                                int i41 = i40 & 29;
                                int i42 = -(-((i40 ^ 29) | i41));
                                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                                b = i43 % 128;
                                int i44 = i43 % 2;
                            }
                        } else {
                            porterDuffColorFilterD = null;
                        }
                        drawable.setColorFilter(porterDuffColorFilterD);
                        int i45 = b;
                        int i46 = i45 ^ 89;
                        int i47 = ((i45 & 89) | i46) << 1;
                        int i48 = -i46;
                        int i49 = (i47 & i48) + (i47 | i48);
                        a = i49 % 128;
                        int i50 = i49 % 2;
                    } else {
                        int i51 = a;
                        int i52 = i51 & 87;
                        int i53 = -(-((i51 ^ 87) | i52));
                        int i54 = (i52 & i53) + (i53 | i52);
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        drawable.clearColorFilter();
                        int i56 = a;
                        int i57 = ((i56 & (-122)) | ((~i56) & 121)) + ((i56 & 121) << 1);
                        b = i57 % 128;
                        int i58 = i57 % 2;
                    }
                } else {
                    if (z) {
                        int i110 = b;
                        int i111 = (i110 & 21) + (i110 | 21);
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        colorStateList = aeVar.a;
                        int i113 = a;
                        int i114 = ((i113 ^ 124) + ((i113 & 124) << 1)) - 1;
                        b = i114 % 128;
                        int i115 = i114 % 2;
                    } else {
                        int i210 = a + 71;
                        b = i210 % 128;
                        int i211 = i210 % 2;
                        colorStateList = null;
                    }
                    if (aeVar.c) {
                        int i212 = a;
                        i2 = ((((i212 ^ 75) | (i212 & 75)) << 1) - (~(-(((~i212) & 75) | (i212 & (-76)))))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            PorterDuff.Mode mode4 = aeVar.b;
                            throw null;
                        }
                        mode = aeVar.b;
                        int i213 = b;
                        int i214 = (i213 & (-24)) | ((~i213) & 23);
                        int i215 = (i213 & 23) << 1;
                        int i216 = (i214 & i215) + (i215 | i214);
                        a = i216 % 128;
                        int i217 = i216 % 2;
                    } else {
                        mode = K.d;
                        int i218 = b + 29;
                        a = i218 % 128;
                        int i219 = i218 % 2;
                    }
                    if (colorStateList != null) {
                        i = b;
                        int i310 = ((i | 73) << 1) - (i ^ 73);
                        a = i310 % 128;
                        int i311 = i310 % 2;
                        if (mode == null) {
                            int i312 = i & 93;
                            int i313 = ((~i312) & (i | 93)) + (i312 << 1);
                            a = i313 % 128;
                            int i314 = i313 % 2;
                            int i315 = i & 125;
                            int i316 = ((i ^ 125) | i315) << 1;
                            int i317 = -((~i315) & (i | 125));
                            int i318 = (i316 & i317) + (i316 | i317);
                            a = i318 % 128;
                            int i319 = i318 % 2;
                            porterDuffColorFilterD = null;
                        } else {
                            porterDuffColorFilterD = K.d(colorStateList.getColorForState(iArr, 0), mode);
                            int i410 = a;
                            int i411 = i410 & 29;
                            int i412 = -(-((i410 ^ 29) | i411));
                            int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                            b = i413 % 128;
                            int i414 = i413 % 2;
                        }
                    } else {
                        porterDuffColorFilterD = null;
                    }
                    drawable.setColorFilter(porterDuffColorFilterD);
                    int i415 = b;
                    int i416 = i415 ^ 89;
                    int i417 = ((i415 & 89) | i416) << 1;
                    int i418 = -i416;
                    int i419 = (i417 & i418) + (i417 | i418);
                    a = i419 % 128;
                    int i59 = i419 % 2;
                }
                if (Build.VERSION.SDK_INT <= 23) {
                    int i60 = b;
                    int i61 = ((i60 ^ 84) + ((i60 & 84) << 1)) - 1;
                    a = i61 % 128;
                    i3 = i61 % 2;
                    drawable.invalidateSelf();
                    if (i3 == 0) {
                        int i62 = 75 / 0;
                    }
                    int i63 = a;
                    int i64 = i63 & 115;
                    int i65 = -(-((i63 ^ 115) | i64));
                    i4 = (i64 ^ i65) + ((i65 & i64) << 1);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i66 = 4 / 4;
                    }
                }
            }
        } else {
            z = aeVar.d;
            if (!z) {
                i5 = a + 13;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z3 = aeVar.c;
                    throw null;
                }
                if (!(!aeVar.c)) {
                    if (z) {
                        int i116 = b;
                        int i117 = (i116 & 21) + (i116 | 21);
                        a = i117 % 128;
                        int i118 = i117 % 2;
                        colorStateList = aeVar.a;
                        int i119 = a;
                        int i1110 = ((i119 ^ 124) + ((i119 & 124) << 1)) - 1;
                        b = i1110 % 128;
                        int i1111 = i1110 % 2;
                    } else {
                        int i2110 = a + 71;
                        b = i2110 % 128;
                        int i2111 = i2110 % 2;
                        colorStateList = null;
                    }
                    if (aeVar.c) {
                        int i2112 = a;
                        i2 = ((((i2112 ^ 75) | (i2112 & 75)) << 1) - (~(-(((~i2112) & 75) | (i2112 & (-76)))))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            PorterDuff.Mode mode5 = aeVar.b;
                            throw null;
                        }
                        mode = aeVar.b;
                        int i2113 = b;
                        int i2114 = (i2113 & (-24)) | ((~i2113) & 23);
                        int i2115 = (i2113 & 23) << 1;
                        int i2116 = (i2114 & i2115) + (i2115 | i2114);
                        a = i2116 % 128;
                        int i2117 = i2116 % 2;
                    } else {
                        mode = K.d;
                        int i2118 = b + 29;
                        a = i2118 % 128;
                        int i2119 = i2118 % 2;
                    }
                    if (colorStateList != null) {
                        i = b;
                        int i3110 = ((i | 73) << 1) - (i ^ 73);
                        a = i3110 % 128;
                        int i3111 = i3110 % 2;
                        if (mode == null) {
                            int i3112 = i & 93;
                            int i3113 = ((~i3112) & (i | 93)) + (i3112 << 1);
                            a = i3113 % 128;
                            int i3114 = i3113 % 2;
                            int i3115 = i & 125;
                            int i3116 = ((i ^ 125) | i3115) << 1;
                            int i3117 = -((~i3115) & (i | 125));
                            int i3118 = (i3116 & i3117) + (i3116 | i3117);
                            a = i3118 % 128;
                            int i3119 = i3118 % 2;
                            porterDuffColorFilterD = null;
                        } else {
                            porterDuffColorFilterD = K.d(colorStateList.getColorForState(iArr, 0), mode);
                            int i4110 = a;
                            int i4111 = i4110 & 29;
                            int i4112 = -(-((i4110 ^ 29) | i4111));
                            int i4113 = (i4111 ^ i4112) + ((i4112 & i4111) << 1);
                            b = i4113 % 128;
                            int i4114 = i4113 % 2;
                        }
                    } else {
                        porterDuffColorFilterD = null;
                    }
                    drawable.setColorFilter(porterDuffColorFilterD);
                    int i4115 = b;
                    int i4116 = i4115 ^ 89;
                    int i4117 = ((i4115 & 89) | i4116) << 1;
                    int i4118 = -i4116;
                    int i4119 = (i4117 & i4118) + (i4117 | i4118);
                    a = i4119 % 128;
                    int i510 = i4119 % 2;
                } else {
                    int i511 = a;
                    int i512 = i511 & 87;
                    int i513 = -(-((i511 ^ 87) | i512));
                    int i514 = (i512 & i513) + (i513 | i512);
                    b = i514 % 128;
                    int i515 = i514 % 2;
                    drawable.clearColorFilter();
                    int i516 = a;
                    int i517 = ((i516 & (-122)) | ((~i516) & 121)) + ((i516 & 121) << 1);
                    b = i517 % 128;
                    int i518 = i517 % 2;
                }
            } else {
                if (z) {
                    int i1112 = b;
                    int i1113 = (i1112 & 21) + (i1112 | 21);
                    a = i1113 % 128;
                    int i1114 = i1113 % 2;
                    colorStateList = aeVar.a;
                    int i1115 = a;
                    int i1116 = ((i1115 ^ 124) + ((i1115 & 124) << 1)) - 1;
                    b = i1116 % 128;
                    int i1117 = i1116 % 2;
                } else {
                    int i21110 = a + 71;
                    b = i21110 % 128;
                    int i21111 = i21110 % 2;
                    colorStateList = null;
                }
                if (aeVar.c) {
                    int i21112 = a;
                    i2 = ((((i21112 ^ 75) | (i21112 & 75)) << 1) - (~(-(((~i21112) & 75) | (i21112 & (-76)))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        PorterDuff.Mode mode6 = aeVar.b;
                        throw null;
                    }
                    mode = aeVar.b;
                    int i21113 = b;
                    int i21114 = (i21113 & (-24)) | ((~i21113) & 23);
                    int i21115 = (i21113 & 23) << 1;
                    int i21116 = (i21114 & i21115) + (i21115 | i21114);
                    a = i21116 % 128;
                    int i21117 = i21116 % 2;
                } else {
                    mode = K.d;
                    int i21118 = b + 29;
                    a = i21118 % 128;
                    int i21119 = i21118 % 2;
                }
                if (colorStateList != null) {
                    i = b;
                    int i31110 = ((i | 73) << 1) - (i ^ 73);
                    a = i31110 % 128;
                    int i31111 = i31110 % 2;
                    if (mode == null) {
                        int i31112 = i & 93;
                        int i31113 = ((~i31112) & (i | 93)) + (i31112 << 1);
                        a = i31113 % 128;
                        int i31114 = i31113 % 2;
                        int i31115 = i & 125;
                        int i31116 = ((i ^ 125) | i31115) << 1;
                        int i31117 = -((~i31115) & (i | 125));
                        int i31118 = (i31116 & i31117) + (i31116 | i31117);
                        a = i31118 % 128;
                        int i31119 = i31118 % 2;
                        porterDuffColorFilterD = null;
                    } else {
                        porterDuffColorFilterD = K.d(colorStateList.getColorForState(iArr, 0), mode);
                        int i41110 = a;
                        int i41111 = i41110 & 29;
                        int i41112 = -(-((i41110 ^ 29) | i41111));
                        int i41113 = (i41111 ^ i41112) + ((i41112 & i41111) << 1);
                        b = i41113 % 128;
                        int i41114 = i41113 % 2;
                    }
                } else {
                    porterDuffColorFilterD = null;
                }
                drawable.setColorFilter(porterDuffColorFilterD);
                int i41115 = b;
                int i41116 = i41115 ^ 89;
                int i41117 = ((i41115 & 89) | i41116) << 1;
                int i41118 = -i41116;
                int i41119 = (i41117 & i41118) + (i41117 | i41118);
                a = i41119 % 128;
                int i519 = i41119 % 2;
            }
            if (Build.VERSION.SDK_INT <= 23) {
                int i67 = b;
                int i68 = ((i67 ^ 84) + ((i67 & 84) << 1)) - 1;
                a = i68 % 128;
                i3 = i68 % 2;
                drawable.invalidateSelf();
                if (i3 == 0) {
                    int i69 = 75 / 0;
                }
                int i610 = a;
                int i611 = i610 & 115;
                int i612 = -(-((i610 ^ 115) | i611));
                i4 = (i611 ^ i612) + ((i612 & i611) << 1);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    int i613 = 4 / 4;
                }
            }
        }
        int i70 = b;
        int i71 = i70 & 59;
        int i72 = i70 | 59;
        int i73 = (i71 & i72) + (i72 | i71);
        a = i73 % 128;
        if (i73 % 2 == 0) {
            throw null;
        }
    }
}
