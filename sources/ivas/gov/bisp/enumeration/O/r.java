package ivas.gov.bisp.enumeration.O;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.p014an.as;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.ak;
import ivas.gov.bisp.enumeration.p102y.x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r implements ivas.gov.bisp.enumeration.A.e, x, ivas.gov.bisp.enumeration.p101x.r {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final int[] L;
    public static final int[] M;
    public static final int[] N;
    public static final int[] O;
    public static final int[] P;
    public static final int[] Q;
    private static int a = 0;
    private static int b = 1;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f48o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public static String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public static final int[] e = {R.attr.color, R.attr.alpha, R.attr.lStar, ivas.gov.bisp.enumeration.R.attr.alpha, ivas.gov.bisp.enumeration.R.attr.lStar};
    public static final int[] f = {ivas.gov.bisp.enumeration.R.attr.fontProviderAuthority, ivas.gov.bisp.enumeration.R.attr.fontProviderCerts, ivas.gov.bisp.enumeration.R.attr.fontProviderFetchStrategy, ivas.gov.bisp.enumeration.R.attr.fontProviderFetchTimeout, ivas.gov.bisp.enumeration.R.attr.fontProviderPackage, ivas.gov.bisp.enumeration.R.attr.fontProviderQuery, ivas.gov.bisp.enumeration.R.attr.fontProviderSystemFontFamily};
    public static final int[] h = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, ivas.gov.bisp.enumeration.R.attr.font, ivas.gov.bisp.enumeration.R.attr.fontStyle, ivas.gov.bisp.enumeration.R.attr.fontVariationSettings, ivas.gov.bisp.enumeration.R.attr.fontWeight, ivas.gov.bisp.enumeration.R.attr.ttcIndex};
    public static final int[] g = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};
    public static final int[] i = {R.attr.color, R.attr.offset};
    public static final Object[] j = new Object[0];
    public static final int[] c = {R.attr.background, R.attr.touchscreenBlocksFocus, R.attr.keyboardNavigationCluster, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.expanded, ivas.gov.bisp.enumeration.R.attr.liftOnScroll, ivas.gov.bisp.enumeration.R.attr.liftOnScrollTargetViewId, ivas.gov.bisp.enumeration.R.attr.statusBarForeground};
    public static final int[] k = {ivas.gov.bisp.enumeration.R.attr.layout_scrollEffect, ivas.gov.bisp.enumeration.R.attr.layout_scrollFlags, ivas.gov.bisp.enumeration.R.attr.layout_scrollInterpolator};

    static {
        int[] iArr;
        int i2 = (11 << 1) - 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr2 = {R.attr.minHeight, ivas.gov.bisp.enumeration.R.attr.itemHorizontalTranslationEnabled};
        int i4 = 3 & (~0);
        b = i4 % 128;
        int i5 = i4 % 2;
        l = iArr2;
        if (i5 == 0) {
            m = new int[]{R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.behavior_draggable, ivas.gov.bisp.enumeration.R.attr.behavior_expandedOffset, ivas.gov.bisp.enumeration.R.attr.behavior_fitToContents, ivas.gov.bisp.enumeration.R.attr.behavior_halfExpandedRatio, ivas.gov.bisp.enumeration.R.attr.behavior_hideable, ivas.gov.bisp.enumeration.R.attr.behavior_peekHeight, ivas.gov.bisp.enumeration.R.attr.behavior_saveFlags, ivas.gov.bisp.enumeration.R.attr.behavior_skipCollapsed, ivas.gov.bisp.enumeration.R.attr.gestureInsetBottomIgnored, ivas.gov.bisp.enumeration.R.attr.paddingBottomSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingLeftSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingRightSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingTopSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay};
            f48o = new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, ivas.gov.bisp.enumeration.R.attr.checkedIcon, ivas.gov.bisp.enumeration.R.attr.checkedIconEnabled, ivas.gov.bisp.enumeration.R.attr.checkedIconTint, ivas.gov.bisp.enumeration.R.attr.checkedIconVisible, ivas.gov.bisp.enumeration.R.attr.chipBackgroundColor, ivas.gov.bisp.enumeration.R.attr.chipCornerRadius, ivas.gov.bisp.enumeration.R.attr.chipEndPadding, ivas.gov.bisp.enumeration.R.attr.chipIcon, ivas.gov.bisp.enumeration.R.attr.chipIconEnabled, ivas.gov.bisp.enumeration.R.attr.chipIconSize, ivas.gov.bisp.enumeration.R.attr.chipIconTint, ivas.gov.bisp.enumeration.R.attr.chipIconVisible, ivas.gov.bisp.enumeration.R.attr.chipMinHeight, ivas.gov.bisp.enumeration.R.attr.chipMinTouchTargetSize, ivas.gov.bisp.enumeration.R.attr.chipStartPadding, ivas.gov.bisp.enumeration.R.attr.chipStrokeColor, ivas.gov.bisp.enumeration.R.attr.chipStrokeWidth, ivas.gov.bisp.enumeration.R.attr.chipSurfaceColor, ivas.gov.bisp.enumeration.R.attr.closeIcon, ivas.gov.bisp.enumeration.R.attr.closeIconEnabled, ivas.gov.bisp.enumeration.R.attr.closeIconEndPadding, ivas.gov.bisp.enumeration.R.attr.closeIconSize, ivas.gov.bisp.enumeration.R.attr.closeIconStartPadding, ivas.gov.bisp.enumeration.R.attr.closeIconTint, ivas.gov.bisp.enumeration.R.attr.closeIconVisible, ivas.gov.bisp.enumeration.R.attr.ensureMinTouchTargetSize, ivas.gov.bisp.enumeration.R.attr.hideMotionSpec, ivas.gov.bisp.enumeration.R.attr.iconEndPadding, ivas.gov.bisp.enumeration.R.attr.iconStartPadding, ivas.gov.bisp.enumeration.R.attr.rippleColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.showMotionSpec, ivas.gov.bisp.enumeration.R.attr.textEndPadding, ivas.gov.bisp.enumeration.R.attr.textStartPadding};
            n = new int[]{ivas.gov.bisp.enumeration.R.attr.checkedChip, ivas.gov.bisp.enumeration.R.attr.chipSpacing, ivas.gov.bisp.enumeration.R.attr.chipSpacingHorizontal, ivas.gov.bisp.enumeration.R.attr.chipSpacingVertical, ivas.gov.bisp.enumeration.R.attr.selectionRequired, ivas.gov.bisp.enumeration.R.attr.singleLine, ivas.gov.bisp.enumeration.R.attr.singleSelection};
            p = new int[]{ivas.gov.bisp.enumeration.R.attr.clockFaceBackgroundColor, ivas.gov.bisp.enumeration.R.attr.clockNumberTextColor};
            q = new int[]{ivas.gov.bisp.enumeration.R.attr.clockHandColor, ivas.gov.bisp.enumeration.R.attr.materialCircleRadius, ivas.gov.bisp.enumeration.R.attr.selectorSize};
            s = new int[]{ivas.gov.bisp.enumeration.R.attr.behavior_autoHide, ivas.gov.bisp.enumeration.R.attr.behavior_autoShrink};
            int i6 = 31 / 0;
        } else {
            m = new int[]{R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.behavior_draggable, ivas.gov.bisp.enumeration.R.attr.behavior_expandedOffset, ivas.gov.bisp.enumeration.R.attr.behavior_fitToContents, ivas.gov.bisp.enumeration.R.attr.behavior_halfExpandedRatio, ivas.gov.bisp.enumeration.R.attr.behavior_hideable, ivas.gov.bisp.enumeration.R.attr.behavior_peekHeight, ivas.gov.bisp.enumeration.R.attr.behavior_saveFlags, ivas.gov.bisp.enumeration.R.attr.behavior_skipCollapsed, ivas.gov.bisp.enumeration.R.attr.gestureInsetBottomIgnored, ivas.gov.bisp.enumeration.R.attr.paddingBottomSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingLeftSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingRightSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.paddingTopSystemWindowInsets, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay};
            f48o = new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, ivas.gov.bisp.enumeration.R.attr.checkedIcon, ivas.gov.bisp.enumeration.R.attr.checkedIconEnabled, ivas.gov.bisp.enumeration.R.attr.checkedIconTint, ivas.gov.bisp.enumeration.R.attr.checkedIconVisible, ivas.gov.bisp.enumeration.R.attr.chipBackgroundColor, ivas.gov.bisp.enumeration.R.attr.chipCornerRadius, ivas.gov.bisp.enumeration.R.attr.chipEndPadding, ivas.gov.bisp.enumeration.R.attr.chipIcon, ivas.gov.bisp.enumeration.R.attr.chipIconEnabled, ivas.gov.bisp.enumeration.R.attr.chipIconSize, ivas.gov.bisp.enumeration.R.attr.chipIconTint, ivas.gov.bisp.enumeration.R.attr.chipIconVisible, ivas.gov.bisp.enumeration.R.attr.chipMinHeight, ivas.gov.bisp.enumeration.R.attr.chipMinTouchTargetSize, ivas.gov.bisp.enumeration.R.attr.chipStartPadding, ivas.gov.bisp.enumeration.R.attr.chipStrokeColor, ivas.gov.bisp.enumeration.R.attr.chipStrokeWidth, ivas.gov.bisp.enumeration.R.attr.chipSurfaceColor, ivas.gov.bisp.enumeration.R.attr.closeIcon, ivas.gov.bisp.enumeration.R.attr.closeIconEnabled, ivas.gov.bisp.enumeration.R.attr.closeIconEndPadding, ivas.gov.bisp.enumeration.R.attr.closeIconSize, ivas.gov.bisp.enumeration.R.attr.closeIconStartPadding, ivas.gov.bisp.enumeration.R.attr.closeIconTint, ivas.gov.bisp.enumeration.R.attr.closeIconVisible, ivas.gov.bisp.enumeration.R.attr.ensureMinTouchTargetSize, ivas.gov.bisp.enumeration.R.attr.hideMotionSpec, ivas.gov.bisp.enumeration.R.attr.iconEndPadding, ivas.gov.bisp.enumeration.R.attr.iconStartPadding, ivas.gov.bisp.enumeration.R.attr.rippleColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.showMotionSpec, ivas.gov.bisp.enumeration.R.attr.textEndPadding, ivas.gov.bisp.enumeration.R.attr.textStartPadding};
            n = new int[]{ivas.gov.bisp.enumeration.R.attr.checkedChip, ivas.gov.bisp.enumeration.R.attr.chipSpacing, ivas.gov.bisp.enumeration.R.attr.chipSpacingHorizontal, ivas.gov.bisp.enumeration.R.attr.chipSpacingVertical, ivas.gov.bisp.enumeration.R.attr.selectionRequired, ivas.gov.bisp.enumeration.R.attr.singleLine, ivas.gov.bisp.enumeration.R.attr.singleSelection};
            p = new int[]{ivas.gov.bisp.enumeration.R.attr.clockFaceBackgroundColor, ivas.gov.bisp.enumeration.R.attr.clockNumberTextColor};
            q = new int[]{ivas.gov.bisp.enumeration.R.attr.clockHandColor, ivas.gov.bisp.enumeration.R.attr.materialCircleRadius, ivas.gov.bisp.enumeration.R.attr.selectorSize};
            s = new int[]{ivas.gov.bisp.enumeration.R.attr.behavior_autoHide, ivas.gov.bisp.enumeration.R.attr.behavior_autoShrink};
        }
        int i7 = 26 - 1;
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        r = new int[]{R.attr.enabled, ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.backgroundTintMode, ivas.gov.bisp.enumeration.R.attr.borderWidth, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.ensureMinTouchTargetSize, ivas.gov.bisp.enumeration.R.attr.fabCustomSize, ivas.gov.bisp.enumeration.R.attr.fabSize, ivas.gov.bisp.enumeration.R.attr.hideMotionSpec, ivas.gov.bisp.enumeration.R.attr.hoveredFocusedTranslationZ, ivas.gov.bisp.enumeration.R.attr.maxImageSize, ivas.gov.bisp.enumeration.R.attr.pressedTranslationZ, ivas.gov.bisp.enumeration.R.attr.rippleColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.showMotionSpec, ivas.gov.bisp.enumeration.R.attr.useCompatPadding};
        t = new int[]{ivas.gov.bisp.enumeration.R.attr.behavior_autoHide};
        w = new int[]{ivas.gov.bisp.enumeration.R.attr.itemSpacing, ivas.gov.bisp.enumeration.R.attr.lineSpacing};
        v = new int[]{R.attr.foreground, R.attr.foregroundGravity, ivas.gov.bisp.enumeration.R.attr.foregroundInsidePadding};
        int i10 = (i8 & (-10)) | ((~i8) & 9);
        int i11 = (i8 & 9) << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        x = new int[]{R.attr.inputType};
        y = new int[]{R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.backgroundTintMode, ivas.gov.bisp.enumeration.R.attr.cornerRadius, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.icon, ivas.gov.bisp.enumeration.R.attr.iconGravity, ivas.gov.bisp.enumeration.R.attr.iconPadding, ivas.gov.bisp.enumeration.R.attr.iconSize, ivas.gov.bisp.enumeration.R.attr.iconTint, ivas.gov.bisp.enumeration.R.attr.iconTintMode, ivas.gov.bisp.enumeration.R.attr.rippleColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.strokeColor, ivas.gov.bisp.enumeration.R.attr.strokeWidth};
        u = new int[]{ivas.gov.bisp.enumeration.R.attr.checkedButton, ivas.gov.bisp.enumeration.R.attr.selectionRequired, ivas.gov.bisp.enumeration.R.attr.singleSelection};
        A = new int[]{R.attr.windowFullscreen, ivas.gov.bisp.enumeration.R.attr.dayInvalidStyle, ivas.gov.bisp.enumeration.R.attr.daySelectedStyle, ivas.gov.bisp.enumeration.R.attr.dayStyle, ivas.gov.bisp.enumeration.R.attr.dayTodayStyle, ivas.gov.bisp.enumeration.R.attr.nestedScrollable, ivas.gov.bisp.enumeration.R.attr.rangeFillColor, ivas.gov.bisp.enumeration.R.attr.yearSelectedStyle, ivas.gov.bisp.enumeration.R.attr.yearStyle, ivas.gov.bisp.enumeration.R.attr.yearTodayStyle};
        z = new int[]{R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, ivas.gov.bisp.enumeration.R.attr.itemFillColor, ivas.gov.bisp.enumeration.R.attr.itemShapeAppearance, ivas.gov.bisp.enumeration.R.attr.itemShapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.itemStrokeColor, ivas.gov.bisp.enumeration.R.attr.itemStrokeWidth, ivas.gov.bisp.enumeration.R.attr.itemTextColor};
        B = new int[]{ivas.gov.bisp.enumeration.R.attr.buttonTint, ivas.gov.bisp.enumeration.R.attr.useMaterialThemeColors};
        D = new int[]{ivas.gov.bisp.enumeration.R.attr.buttonTint, ivas.gov.bisp.enumeration.R.attr.useMaterialThemeColors};
        int i14 = (i8 & 116) + (i8 | 116);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        int i16 = i15 % 128;
        a = i16;
        if (i15 % 2 != 0) {
            C = new int[]{ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay};
            E = new int[]{R.attr.letterSpacing, R.attr.lineHeight, ivas.gov.bisp.enumeration.R.attr.lineHeight};
            F = new int[]{R.attr.textAppearance, R.attr.lineHeight, ivas.gov.bisp.enumeration.R.attr.lineHeight};
            I = new int[]{ivas.gov.bisp.enumeration.R.attr.navigationIconTint, ivas.gov.bisp.enumeration.R.attr.subtitleCentered, ivas.gov.bisp.enumeration.R.attr.titleCentered};
            J = new int[]{R.attr.height, R.attr.width, R.attr.color, ivas.gov.bisp.enumeration.R.attr.marginHorizontal, ivas.gov.bisp.enumeration.R.attr.shapeAppearance};
            K = new int[]{ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.itemActiveIndicatorStyle, ivas.gov.bisp.enumeration.R.attr.itemBackground, ivas.gov.bisp.enumeration.R.attr.itemIconSize, ivas.gov.bisp.enumeration.R.attr.itemIconTint, ivas.gov.bisp.enumeration.R.attr.itemPaddingBottom, ivas.gov.bisp.enumeration.R.attr.itemPaddingTop, ivas.gov.bisp.enumeration.R.attr.itemRippleColor, ivas.gov.bisp.enumeration.R.attr.itemTextAppearanceActive, ivas.gov.bisp.enumeration.R.attr.itemTextAppearanceInactive, ivas.gov.bisp.enumeration.R.attr.itemTextColor, ivas.gov.bisp.enumeration.R.attr.labelVisibilityMode, ivas.gov.bisp.enumeration.R.attr.menu};
            iArr = new int[0];
        } else {
            C = new int[]{ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay};
            E = new int[]{R.attr.letterSpacing, R.attr.lineHeight, ivas.gov.bisp.enumeration.R.attr.lineHeight};
            F = new int[]{R.attr.textAppearance, R.attr.lineHeight, ivas.gov.bisp.enumeration.R.attr.lineHeight};
            I = new int[]{ivas.gov.bisp.enumeration.R.attr.navigationIconTint, ivas.gov.bisp.enumeration.R.attr.subtitleCentered, ivas.gov.bisp.enumeration.R.attr.titleCentered};
            J = new int[]{R.attr.height, R.attr.width, R.attr.color, ivas.gov.bisp.enumeration.R.attr.marginHorizontal, ivas.gov.bisp.enumeration.R.attr.shapeAppearance};
            K = new int[]{ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.itemActiveIndicatorStyle, ivas.gov.bisp.enumeration.R.attr.itemBackground, ivas.gov.bisp.enumeration.R.attr.itemIconSize, ivas.gov.bisp.enumeration.R.attr.itemIconTint, ivas.gov.bisp.enumeration.R.attr.itemPaddingBottom, ivas.gov.bisp.enumeration.R.attr.itemPaddingTop, ivas.gov.bisp.enumeration.R.attr.itemRippleColor, ivas.gov.bisp.enumeration.R.attr.itemTextAppearanceActive, ivas.gov.bisp.enumeration.R.attr.itemTextAppearanceInactive, ivas.gov.bisp.enumeration.R.attr.itemTextColor, ivas.gov.bisp.enumeration.R.attr.labelVisibilityMode, ivas.gov.bisp.enumeration.R.attr.menu};
            iArr = new int[1];
        }
        iArr[0] = ivas.gov.bisp.enumeration.R.attr.materialCircleRadius;
        H = iArr;
        L = new int[]{ivas.gov.bisp.enumeration.R.attr.behavior_overlapTop};
        M = new int[]{ivas.gov.bisp.enumeration.R.attr.cornerFamily, ivas.gov.bisp.enumeration.R.attr.cornerFamilyBottomLeft, ivas.gov.bisp.enumeration.R.attr.cornerFamilyBottomRight, ivas.gov.bisp.enumeration.R.attr.cornerFamilyTopLeft, ivas.gov.bisp.enumeration.R.attr.cornerFamilyTopRight, ivas.gov.bisp.enumeration.R.attr.cornerSize, ivas.gov.bisp.enumeration.R.attr.cornerSizeBottomLeft, ivas.gov.bisp.enumeration.R.attr.cornerSizeBottomRight, ivas.gov.bisp.enumeration.R.attr.cornerSizeTopLeft, ivas.gov.bisp.enumeration.R.attr.cornerSizeTopRight};
        O = new int[]{R.attr.maxWidth, ivas.gov.bisp.enumeration.R.attr.actionTextColorAlpha, ivas.gov.bisp.enumeration.R.attr.animationMode, ivas.gov.bisp.enumeration.R.attr.backgroundOverlayColorAlpha, ivas.gov.bisp.enumeration.R.attr.backgroundTint, ivas.gov.bisp.enumeration.R.attr.backgroundTintMode, ivas.gov.bisp.enumeration.R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.maxActionInlineWidth};
        N = new int[]{R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, ivas.gov.bisp.enumeration.R.attr.fontFamily, ivas.gov.bisp.enumeration.R.attr.fontVariationSettings, ivas.gov.bisp.enumeration.R.attr.textAllCaps, ivas.gov.bisp.enumeration.R.attr.textLocale};
        int i17 = i16 + 63;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            P = new int[]{ivas.gov.bisp.enumeration.R.attr.textInputLayoutFocusedRectEnabled};
            Q = new int[]{R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, ivas.gov.bisp.enumeration.R.attr.boxBackgroundColor, ivas.gov.bisp.enumeration.R.attr.boxBackgroundMode, ivas.gov.bisp.enumeration.R.attr.boxCollapsedPaddingTop, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusBottomEnd, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusBottomStart, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusTopEnd, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusTopStart, ivas.gov.bisp.enumeration.R.attr.boxStrokeColor, ivas.gov.bisp.enumeration.R.attr.boxStrokeErrorColor, ivas.gov.bisp.enumeration.R.attr.boxStrokeWidth, ivas.gov.bisp.enumeration.R.attr.boxStrokeWidthFocused, ivas.gov.bisp.enumeration.R.attr.counterEnabled, ivas.gov.bisp.enumeration.R.attr.counterMaxLength, ivas.gov.bisp.enumeration.R.attr.counterOverflowTextAppearance, ivas.gov.bisp.enumeration.R.attr.counterOverflowTextColor, ivas.gov.bisp.enumeration.R.attr.counterTextAppearance, ivas.gov.bisp.enumeration.R.attr.counterTextColor, ivas.gov.bisp.enumeration.R.attr.endIconCheckable, ivas.gov.bisp.enumeration.R.attr.endIconContentDescription, ivas.gov.bisp.enumeration.R.attr.endIconDrawable, ivas.gov.bisp.enumeration.R.attr.endIconMode, ivas.gov.bisp.enumeration.R.attr.endIconTint, ivas.gov.bisp.enumeration.R.attr.endIconTintMode, ivas.gov.bisp.enumeration.R.attr.errorContentDescription, ivas.gov.bisp.enumeration.R.attr.errorEnabled, ivas.gov.bisp.enumeration.R.attr.errorIconDrawable, ivas.gov.bisp.enumeration.R.attr.errorIconTint, ivas.gov.bisp.enumeration.R.attr.errorIconTintMode, ivas.gov.bisp.enumeration.R.attr.errorTextAppearance, ivas.gov.bisp.enumeration.R.attr.errorTextColor, ivas.gov.bisp.enumeration.R.attr.expandedHintEnabled, ivas.gov.bisp.enumeration.R.attr.helperText, ivas.gov.bisp.enumeration.R.attr.helperTextEnabled, ivas.gov.bisp.enumeration.R.attr.helperTextTextAppearance, ivas.gov.bisp.enumeration.R.attr.helperTextTextColor, ivas.gov.bisp.enumeration.R.attr.hintAnimationEnabled, ivas.gov.bisp.enumeration.R.attr.hintEnabled, ivas.gov.bisp.enumeration.R.attr.hintTextAppearance, ivas.gov.bisp.enumeration.R.attr.hintTextColor, ivas.gov.bisp.enumeration.R.attr.passwordToggleContentDescription, ivas.gov.bisp.enumeration.R.attr.passwordToggleDrawable, ivas.gov.bisp.enumeration.R.attr.passwordToggleEnabled, ivas.gov.bisp.enumeration.R.attr.passwordToggleTint, ivas.gov.bisp.enumeration.R.attr.passwordToggleTintMode, ivas.gov.bisp.enumeration.R.attr.placeholderText, ivas.gov.bisp.enumeration.R.attr.placeholderTextAppearance, ivas.gov.bisp.enumeration.R.attr.placeholderTextColor, ivas.gov.bisp.enumeration.R.attr.prefixText, ivas.gov.bisp.enumeration.R.attr.prefixTextAppearance, ivas.gov.bisp.enumeration.R.attr.prefixTextColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.startIconCheckable, ivas.gov.bisp.enumeration.R.attr.startIconContentDescription, ivas.gov.bisp.enumeration.R.attr.startIconDrawable, ivas.gov.bisp.enumeration.R.attr.startIconTint, ivas.gov.bisp.enumeration.R.attr.startIconTintMode, ivas.gov.bisp.enumeration.R.attr.suffixText, ivas.gov.bisp.enumeration.R.attr.suffixTextAppearance, ivas.gov.bisp.enumeration.R.attr.suffixTextColor};
            G = new int[]{R.attr.textAppearance, ivas.gov.bisp.enumeration.R.attr.enforceMaterialTheme, ivas.gov.bisp.enumeration.R.attr.enforceTextAppearance};
        } else {
            int[] iArr3 = new int[0];
            iArr3[1] = ivas.gov.bisp.enumeration.R.attr.textInputLayoutFocusedRectEnabled;
            P = iArr3;
            Q = new int[]{R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, ivas.gov.bisp.enumeration.R.attr.boxBackgroundColor, ivas.gov.bisp.enumeration.R.attr.boxBackgroundMode, ivas.gov.bisp.enumeration.R.attr.boxCollapsedPaddingTop, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusBottomEnd, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusBottomStart, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusTopEnd, ivas.gov.bisp.enumeration.R.attr.boxCornerRadiusTopStart, ivas.gov.bisp.enumeration.R.attr.boxStrokeColor, ivas.gov.bisp.enumeration.R.attr.boxStrokeErrorColor, ivas.gov.bisp.enumeration.R.attr.boxStrokeWidth, ivas.gov.bisp.enumeration.R.attr.boxStrokeWidthFocused, ivas.gov.bisp.enumeration.R.attr.counterEnabled, ivas.gov.bisp.enumeration.R.attr.counterMaxLength, ivas.gov.bisp.enumeration.R.attr.counterOverflowTextAppearance, ivas.gov.bisp.enumeration.R.attr.counterOverflowTextColor, ivas.gov.bisp.enumeration.R.attr.counterTextAppearance, ivas.gov.bisp.enumeration.R.attr.counterTextColor, ivas.gov.bisp.enumeration.R.attr.endIconCheckable, ivas.gov.bisp.enumeration.R.attr.endIconContentDescription, ivas.gov.bisp.enumeration.R.attr.endIconDrawable, ivas.gov.bisp.enumeration.R.attr.endIconMode, ivas.gov.bisp.enumeration.R.attr.endIconTint, ivas.gov.bisp.enumeration.R.attr.endIconTintMode, ivas.gov.bisp.enumeration.R.attr.errorContentDescription, ivas.gov.bisp.enumeration.R.attr.errorEnabled, ivas.gov.bisp.enumeration.R.attr.errorIconDrawable, ivas.gov.bisp.enumeration.R.attr.errorIconTint, ivas.gov.bisp.enumeration.R.attr.errorIconTintMode, ivas.gov.bisp.enumeration.R.attr.errorTextAppearance, ivas.gov.bisp.enumeration.R.attr.errorTextColor, ivas.gov.bisp.enumeration.R.attr.expandedHintEnabled, ivas.gov.bisp.enumeration.R.attr.helperText, ivas.gov.bisp.enumeration.R.attr.helperTextEnabled, ivas.gov.bisp.enumeration.R.attr.helperTextTextAppearance, ivas.gov.bisp.enumeration.R.attr.helperTextTextColor, ivas.gov.bisp.enumeration.R.attr.hintAnimationEnabled, ivas.gov.bisp.enumeration.R.attr.hintEnabled, ivas.gov.bisp.enumeration.R.attr.hintTextAppearance, ivas.gov.bisp.enumeration.R.attr.hintTextColor, ivas.gov.bisp.enumeration.R.attr.passwordToggleContentDescription, ivas.gov.bisp.enumeration.R.attr.passwordToggleDrawable, ivas.gov.bisp.enumeration.R.attr.passwordToggleEnabled, ivas.gov.bisp.enumeration.R.attr.passwordToggleTint, ivas.gov.bisp.enumeration.R.attr.passwordToggleTintMode, ivas.gov.bisp.enumeration.R.attr.placeholderText, ivas.gov.bisp.enumeration.R.attr.placeholderTextAppearance, ivas.gov.bisp.enumeration.R.attr.placeholderTextColor, ivas.gov.bisp.enumeration.R.attr.prefixText, ivas.gov.bisp.enumeration.R.attr.prefixTextAppearance, ivas.gov.bisp.enumeration.R.attr.prefixTextColor, ivas.gov.bisp.enumeration.R.attr.shapeAppearance, ivas.gov.bisp.enumeration.R.attr.shapeAppearanceOverlay, ivas.gov.bisp.enumeration.R.attr.startIconCheckable, ivas.gov.bisp.enumeration.R.attr.startIconContentDescription, ivas.gov.bisp.enumeration.R.attr.startIconDrawable, ivas.gov.bisp.enumeration.R.attr.startIconTint, ivas.gov.bisp.enumeration.R.attr.startIconTintMode, ivas.gov.bisp.enumeration.R.attr.suffixText, ivas.gov.bisp.enumeration.R.attr.suffixTextAppearance, ivas.gov.bisp.enumeration.R.attr.suffixTextColor};
            G = new int[]{R.attr.textAppearance, ivas.gov.bisp.enumeration.R.attr.enforceMaterialTheme, ivas.gov.bisp.enumeration.R.attr.enforceTextAppearance};
        }
    }

    public /* synthetic */ r() {
    }

    public /* synthetic */ r(boolean z2) {
    }

    public static void e(Object obj, String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 14) + ((i3 & 14) << 1)) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if (obj != null) {
            int i7 = i5 & 95;
            int i8 = i7 + ((i5 ^ 95) | i7);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        B(nullPointerException);
        int i9 = b;
        int i10 = i9 ^ 31;
        int i11 = -(-((i9 & 31) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            throw nullPointerException;
        }
        throw null;
    }

    public static boolean f(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b;
        boolean z2 = true;
        int i4 = ((i3 | 111) << 1) - (i3 ^ 111);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            boolean zEquals = obj.equals(obj2);
            int i6 = b;
            int i7 = (i6 ^ 63) + ((i6 & 63) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            z2 = zEquals;
        } else if (obj2 == null) {
            int i9 = (i5 & 93) + (i5 | 93);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i5 & 51;
            int i12 = (i5 ^ 51) | i11;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = (i5 | 25) << 1;
            int i16 = -((i5 & (-26)) | ((~i5) & 25));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 / 3;
            }
            z2 = false;
        }
        int i19 = b;
        int i20 = i19 & 27;
        int i21 = i20 + ((i19 ^ 27) | i20);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public static void h(boolean z2, Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 35;
        int i5 = -(-((i3 ^ 35) | i4));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        int i8 = i3 & 53;
        int i9 = -(-((i3 ^ 53) | i8));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static int i(int i2, String str) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 & (-126)) | ((~i4) & 125)) - (~((i4 & 125) << 1))) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (i2 < 0) {
            throw new IllegalArgumentException(str);
        }
        int i8 = ((i6 | 1) << 1) - (i6 ^ 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = i6 & 77;
        int i10 = -(-((i6 ^ 77) | i9));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        return i2;
    }

    public static int j(int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 ^ 74) + ((i4 & 74) << 1)) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int i8 = (((i6 ^ 105) | (i6 & 105)) << 1) - (((~i6) & 105) | (i6 & (-106)));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public static Object k(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 57;
        int i5 = -(-((i3 ^ 57) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        int i9 = ((i7 ^ 105) - (~((i7 & 105) << 1))) - 1;
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        int i12 = (i10 & 19) + (i10 | 19);
        a = i12 % 128;
        int i13 = i12 % 2;
        return obj;
    }

    public static void l(Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 45;
        int i5 = ((((i3 ^ 45) | i4) << 1) - (~(-((i3 | 45) & (~i4))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            B(nullPointerException);
            int i8 = b;
            int i9 = ((((i8 ^ 95) | (i8 & 95)) << 1) - (~(-(((~i8) & 95) | (i8 & (-96)))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            throw nullPointerException;
        }
        int i11 = ((i6 ^ 3) | (i6 & 3)) << 1;
        int i12 = -(((~i6) & 3) | (i6 & (-4)));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r5 = new java.lang.NullPointerException(ivas.gov.bisp.enumeration.p091n.j.r(r6, " must not be null"));
        r6 = ivas.gov.bisp.enumeration.O.r.a + 51;
        ivas.gov.bisp.enumeration.O.r.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        B(r5);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        B(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r5 = ((r1 ^ 91) | (r1 & 91)) << 1;
        r6 = -((r1 & (-92)) | ((~r1) & 91));
        r1 = (r5 ^ r6) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.O.r.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(java.lang.Object r5, java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.O.r.a
            r2 = r1 ^ 79
            r3 = r1 & 79
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-80)
            int r4 = ~r1
            r4 = r4 & 79
            r3 = r3 | r4
            int r3 = -r3
            r4 = r2 & r3
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.O.r.b = r2
            int r4 = r4 % r0
            r2 = 0
            if (r4 != 0) goto L24
            r3 = 0
            int r3 = r3 / r3
            if (r5 == 0) goto L47
            goto L26
        L24:
            if (r5 == 0) goto L47
        L26:
            r5 = r1 ^ 91
            r6 = r1 & 91
            r5 = r5 | r6
            int r5 = r5 << 1
            r6 = r1 & (-92)
            int r1 = ~r1
            r3 = 91
            r1 = r1 & r3
            r6 = r6 | r1
            int r6 = -r6
            r1 = r5 ^ r6
            r5 = r5 & r6
            int r5 = r5 << 1
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.O.r.b = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L43
            return
        L43:
            r2.hashCode()
            throw r2
        L47:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r1 = " must not be null"
            java.lang.String r6 = ivas.gov.bisp.enumeration.p091n.j.r(r6, r1)
            r5.<init>(r6)
            int r6 = ivas.gov.bisp.enumeration.O.r.a
            int r6 = r6 + 51
            int r1 = r6 % 128
            ivas.gov.bisp.enumeration.O.r.b = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L64
            B(r5)
            r2.hashCode()
            throw r2
        L64:
            B(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.r.m(java.lang.Object, java.lang.String):void");
    }

    public static void o(boolean z2, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 107;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 107)) & i4);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z2) {
            throw new IllegalStateException(str);
        }
        int i9 = i8 + 43;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 94 / 0;
        }
    }

    public static r p(int i2) {
        int i3 = 2 % 2;
        int i4 = b + 7;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (i2 == 0) {
            P p2 = new P();
            int i7 = b;
            int i8 = i7 & 51;
            int i9 = -(-((i7 ^ 51) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return p2;
            }
            throw null;
        }
        int i11 = (i5 ^ 91) + ((i5 & 91) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        if (i2 != 1) {
            P p3 = new P();
            int i13 = a;
            int i14 = (i13 ^ 93) + ((i13 & 93) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                return p3;
            }
            throw null;
        }
        e eVar = new e();
        int i15 = b;
        int i16 = i15 & 87;
        int i17 = (i15 | 87) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        return eVar;
    }

    public static int q(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 37) + (i6 | 37);
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        if (i2 < i3) {
            int i9 = i6 + 27;
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 35;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                return i3;
            }
            throw null;
        }
        if (i2 <= i4) {
            int i13 = ((i6 & (-76)) | ((~i6) & 75)) + ((i6 & 75) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 97 / 0;
            }
            return i2;
        }
        int i15 = i6 + 77;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public static float r(float f2, float f3, float f4, float f5) {
        double d2;
        float f6;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 23) + (i3 | 23);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            d2 = f4 + f2;
            f6 = f5 / f3;
        } else {
            d2 = f4 - f2;
            f6 = f5 - f3;
        }
        double d3 = f6;
        int i6 = (((i5 | 54) << 1) - (i5 ^ 54)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        float fHypot = (float) Math.hypot(d2, d3);
        if (i7 != 0) {
            int i8 = 57 / 0;
        }
        return fHypot;
    }

    public static int t(Context context, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 ^ 1;
        int i7 = (i5 & 1) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        TypedValue typedValueB = ivas.gov.bisp.enumeration.aL.c.b(context, i2);
        if (typedValueB == null) {
            int i10 = b;
            int i11 = (i10 & (-86)) | ((~i10) & 85);
            int i12 = -(-((i10 & 85) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 46 / 0;
            }
            return i3;
        }
        int i15 = a + 93;
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = typedValueB.data;
        int i18 = a;
        int i19 = i18 & 57;
        int i20 = ((i18 | 57) & (~i19)) + (i19 << 1);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return i17;
        }
        throw null;
    }

    public static int u(View view, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 35;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            view.getContext();
            view.getClass().getCanonicalName();
            throw null;
        }
        Context context = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        int i5 = b;
        int i6 = i5 ^ 79;
        int i7 = ((i5 & 79) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        int iD = ivas.gov.bisp.enumeration.aL.c.d(context, i2, canonicalName);
        int i11 = b;
        int i12 = ((i11 ^ 64) + ((i11 & 64) << 1)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        return iD;
    }

    public static int v(int i2, int i3, float f2) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 101;
        int i7 = (i5 ^ 101) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        float fAlpha = Color.alpha(i3);
        int iRound = Math.round(i9 != 0 ? fAlpha / f2 : fAlpha * f2);
        int i10 = b;
        int i11 = (i10 & (-44)) | ((~i10) & 43);
        int i12 = -(-((i10 & 43) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        int iC = ivas.gov.bisp.enumeration.p007ag.j.c(ivas.gov.bisp.enumeration.p007ag.j.f(i3, iRound), i2);
        int i15 = b;
        int i16 = (((i15 ^ 119) | (i15 & 119)) << 1) - (((~i15) & 119) | (i15 & (-120)));
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return iC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append("`");
        r3 = ivas.gov.bisp.enumeration.O.r.a + 53;
        ivas.gov.bisp.enumeration.O.r.b = r3 % 128;
        r3 = r3 % 2;
        r2.append(r6);
        r2.append("`");
        r6 = ivas.gov.bisp.enumeration.O.r.a;
        r0 = r6 & 73;
        r0 = (r0 - (~((r6 ^ 73) | r0))) - 1;
        ivas.gov.bisp.enumeration.O.r.b = r0 % 128;
        r0 = r0 % 2;
        r5 = r5.getColumnIndexOrThrow(r2.toString());
        r6 = ivas.gov.bisp.enumeration.O.r.a;
        r0 = r6 & 125;
        r6 = -(-((r6 ^ 125) | r0));
        r2 = (r0 ^ r6) + ((r6 & r0) << 1);
        ivas.gov.bisp.enumeration.O.r.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r2 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r2 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r5 = ivas.gov.bisp.enumeration.O.r.b;
        r6 = ((((r5 ^ 3) | (r5 & 3)) << 1) - (~(-(((~r5) & 3) | (r5 & (-4)))))) - 1;
        ivas.gov.bisp.enumeration.O.r.a = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(android.database.Cursor r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "`"
            r1 = 2
            int r2 = r1 % r1
            int r2 = ivas.gov.bisp.enumeration.O.r.a
            r3 = r2 & 87
            int r4 = ~r3
            r2 = r2 | 87
            r2 = r2 & r4
            int r3 = r3 << 1
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.O.r.b = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L27
            int r2 = r5.getColumnIndex(r6)
            r3 = 41
            int r3 = r3 / 0
            if (r2 < 0) goto L47
            goto L2d
        L27:
            int r2 = r5.getColumnIndex(r6)
            if (r2 < 0) goto L47
        L2d:
            int r5 = ivas.gov.bisp.enumeration.O.r.b
            r6 = r5 ^ 3
            r0 = r5 & 3
            r6 = r6 | r0
            int r6 = r6 << 1
            r0 = r5 & (-4)
            int r5 = ~r5
            r5 = r5 & 3
            r5 = r5 | r0
            int r5 = -r5
            int r5 = ~r5
            int r6 = r6 - r5
            int r6 = r6 + (-1)
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.O.r.a = r5
            int r6 = r6 % r1
            return r2
        L47:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            int r3 = ivas.gov.bisp.enumeration.O.r.a
            int r3 = r3 + 53
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.O.r.b = r4
            int r3 = r3 % r1
            r2.append(r6)
            r2.append(r0)
            int r6 = ivas.gov.bisp.enumeration.O.r.a
            r0 = r6 & 73
            r6 = r6 ^ 73
            r6 = r6 | r0
            int r6 = ~r6
            int r0 = r0 - r6
            int r0 = r0 + (-1)
            int r6 = r0 % 128
            ivas.gov.bisp.enumeration.O.r.b = r6
            int r0 = r0 % r1
            java.lang.String r6 = r2.toString()
            int r5 = r5.getColumnIndexOrThrow(r6)
            int r6 = ivas.gov.bisp.enumeration.O.r.a
            r0 = r6 & 125(0x7d, float:1.75E-43)
            r6 = r6 ^ 125(0x7d, float:1.75E-43)
            r6 = r6 | r0
            int r6 = -r6
            int r6 = -r6
            r2 = r0 ^ r6
            r6 = r6 & r0
            int r6 = r6 << 1
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.O.r.b = r6
            int r2 = r2 % r1
            if (r2 == 0) goto L8d
            return r5
        L8d:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.O.r.w(android.database.Cursor, java.lang.String):int");
    }

    public static float y(float f2, float f3, float f4) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-116)) | ((~i3) & 115);
        int i5 = (i3 & 115) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        return i6 % 2 == 0 ? (f4 - f3) / ((f4 * 2.0f) / f2) : (f3 * f4) + ((1.0f - f4) * f2);
    }

    public void H(a aVar, float f2, float f3, float f4) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 123;
        int i5 = ((i3 & 123) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p102y.x
    public Object d() {
        int i2 = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = b;
        int i4 = i3 & 103;
        int i5 = -(-((i3 ^ 103) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r(ivas.gov.bisp.enumeration.p102y.r rVar) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void C(View view, C0019p c0019p) {
        boolean z2;
        float fB;
        ViewParent parent;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 92) + (i3 | 92)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        S s2 = c0019p.e.e;
        if (s2 != null) {
            int i6 = a;
            int i7 = i6 | 37;
            int i8 = ((i7 << 1) - (~(-((~(i6 & 37)) & i7)))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (s2.d) {
                int i10 = a;
                int i11 = i10 & 71;
                int i12 = (i11 - (~(-(-((i10 ^ 71) | i11))))) - 1;
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                int i15 = (i13 & 32) + (i13 | 32);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                int i18 = b;
                int i19 = (i18 ^ 3) + ((i18 & 3) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                z2 = false;
            }
        } else {
            int i110 = b;
            int i111 = (i110 ^ 3) + ((i110 & 3) << 1);
            a = i111 % 128;
            int i21 = i111 % 2;
            z2 = false;
        }
        if (!(!z2)) {
            int i22 = b;
            int i23 = (i22 & 72) + (i22 | 72);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            a = i24 % 128;
            if (i24 % 2 != 0) {
                fB = 1.0f;
                parent = view.getParent();
            } else {
                fB = 0.0f;
                parent = view.getParent();
            }
            while (parent instanceof View) {
                int i25 = b;
                int i26 = ((i25 ^ 1) | (i25 & 1)) << 1;
                int i27 = -(((~i25) & 1) | (i25 & (-2)));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                a = i28 % 128;
                if (i28 % 2 != 0) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    T.aXb.b((View) parent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                fB += T.aXb.b((View) parent);
                parent = parent.getParent();
                int i29 = a;
                int i30 = i29 & 107;
                int i31 = (((i29 | 107) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            C0019p.bfp bfpVar = c0019p.e;
            if (bfpVar.f47o != fB) {
                int i33 = a;
                int i34 = (((i33 | 61) << 1) - (~(-(i33 ^ 61)))) - 1;
                b = i34 % 128;
                int i35 = i34 % 2;
                bfpVar.f47o = fB;
                c0019p.w();
                int i36 = b;
                int i37 = ((i36 ^ 72) + ((i36 & 72) << 1)) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
            }
        }
        int i39 = b;
        int i40 = (((i39 | 34) << 1) - (i39 ^ 34)) - 1;
        a = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 23 / 0;
        }
    }

    public static final Object[] E(Collection collection, Object[] objArr) {
        int size;
        Object[] objArrCopyOf;
        int i2 = 2 % 2;
        int i3 = b + 3;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0 ? (size = collection.size()) != 0 : (size = collection.size()) != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    int i4 = a;
                    int i5 = ((i4 & 97) - (~(-(-(i4 | 97))))) - 1;
                    int i6 = i5 % 128;
                    b = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 55;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    int i10 = a;
                    int i11 = i10 ^ 105;
                    int i12 = ((((i10 & 105) | i11) << 1) - (~(-i11))) - 1;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                    int i14 = a;
                    int i15 = ((i14 | 63) << 1) - (i14 ^ 63);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                }
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    Object next = it.next();
                    int i19 = b;
                    int i20 = i19 & 91;
                    int i21 = (i19 ^ 91) | i20;
                    int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    objArrCopyOf[i17] = next;
                    if (i18 >= objArrCopyOf.length) {
                        int i24 = (i19 & 107) + (i19 | 107);
                        a = i24 % 128;
                        if (i24 % 2 != 0) {
                            it.hasNext();
                            obj.hashCode();
                            throw null;
                        }
                        if (!it.hasNext()) {
                            objArr = objArrCopyOf;
                            break;
                        }
                        int i25 = b;
                        int i26 = (i25 & (-70)) | ((~i25) & 69);
                        int i27 = -(-((i25 & 69) << 1));
                        int i28 = (i26 & i27) + (i26 | i27);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = i18 * 3;
                        int i31 = ((i30 & 1) + (i30 | 1)) >>> 1;
                        if (i31 <= i18) {
                            int i32 = i25 + 99;
                            int i33 = i32 % 128;
                            a = i33;
                            int i34 = i32 % 2;
                            if (i18 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            int i35 = i33 | 51;
                            int i36 = (i35 << 1) - (i35 & (~(i33 & 51)));
                            b = i36 % 128;
                            if (i36 % 2 == 0) {
                                int i37 = 35 / 0;
                            }
                            int i38 = i33 & 57;
                            int i39 = (i38 - (~(-(-((i33 ^ 57) | i38))))) - 1;
                            b = i39 % 128;
                            int i40 = i39 % 2;
                            i31 = 2147483645;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i31);
                        m(objArrCopyOf, "copyOf(result, newSize)");
                        int i41 = b;
                        int i42 = i41 & 71;
                        int i43 = (((i41 ^ 71) | i42) << 1) - ((i41 | 71) & (~i42));
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = b;
                        int i46 = i45 ^ 15;
                        int i47 = ((((i45 & 15) | i46) << 1) - (~(-i46))) - 1;
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        i17 = i18;
                    } else {
                        if (!it.hasNext()) {
                            int i49 = b;
                            int i50 = ((i49 ^ 99) | (i49 & 99)) << 1;
                            int i51 = -(((~i49) & 99) | (i49 & (-100)));
                            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                            int i53 = i52 % 128;
                            a = i53;
                            int i54 = i52 % 2;
                            if (objArrCopyOf != objArr) {
                                objArr = Arrays.copyOf(objArrCopyOf, i18);
                                m(objArr, "copyOf(result, size)");
                                int i55 = b + 99;
                                a = i55 % 128;
                                int i56 = i55 % 2;
                                break;
                            }
                            int i57 = i53 & 29;
                            int i58 = (i57 - (~((i53 ^ 29) | i57))) - 1;
                            b = i58 % 128;
                            if (i58 % 2 == 0) {
                                objArr[i18] = null;
                                int i59 = 35 / 0;
                            } else {
                                objArr[i18] = null;
                            }
                            int i60 = ((i53 ^ 29) | (i53 & 29)) << 1;
                            int i61 = -(((~i53) & 29) | (i53 & (-30)));
                            int i62 = (i60 & i61) + (i61 | i60);
                            b = i62 % 128;
                            int i63 = i62 % 2;
                            break;
                        }
                        int i410 = b;
                        int i411 = i410 ^ 15;
                        int i412 = ((((i410 & 15) | i411) << 1) - (~(-i411))) - 1;
                        a = i412 % 128;
                        int i413 = i412 % 2;
                        i17 = i18;
                    }
                }
            } else {
                int i64 = b;
                int i65 = i64 ^ 15;
                int i66 = ((i64 & 15) | i65) << 1;
                int i67 = -i65;
                int i68 = (i66 & i67) + (i66 | i67);
                int i69 = i68 % 128;
                a = i69;
                int i70 = i68 % 2;
                if (objArr.length > 0) {
                    int i71 = i69 & 85;
                    int i72 = i71 + ((i69 ^ 85) | i71);
                    b = i72 % 128;
                    if (i72 % 2 == 0) {
                        objArr[0] = null;
                    } else {
                        objArr[0] = null;
                    }
                    int i73 = i69 + 49;
                    b = i73 % 128;
                    int i74 = i73 % 2;
                }
            }
        } else if (objArr.length > 0) {
            int i75 = b + 96;
            int i76 = (i75 ^ (-1)) + (i75 << 1);
            int i77 = i76 % 128;
            a = i77;
            int i78 = i76 % 2;
            objArr[0] = null;
            int i79 = i77 ^ 41;
            int i80 = (i77 & 41) << 1;
            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
            b = i81 % 128;
            int i82 = i81 % 2;
        }
        int i83 = a;
        int i84 = i83 & 11;
        int i85 = -(-((i83 ^ 11) | i84));
        int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
        b = i86 % 128;
        if (i86 % 2 != 0) {
            return objArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    public static boolean g(Bundle bundle, Bundle bundle2) {
        boolean z2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 87;
        int i6 = (i4 ^ 87) | i5;
        int i7 = i5 ^ i6;
        int i8 = i5 & i6;
        boolean z3 = true;
        int i9 = i7 + (i8 << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        if (bundle == bundle2) {
            int i11 = (((i4 | 52) << 1) - (i4 ^ 52)) - 1;
            int i12 = i11 % 128;
            a = i12;
            int i13 = i11 % 2;
            int i14 = i12 & 107;
            int i15 = ((i12 | 107) & (~i14)) + (i14 << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return true;
        }
        if (bundle == null) {
            int i17 = i4 & 61;
            int i18 = ((((i4 ^ 61) | i17) << 1) - (~(-((i4 | 61) & (~i17))))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1) {
                int i20 = b;
                int i21 = (-2) - ((((i20 | 46) << 1) - (i20 ^ 46)) ^ (-1));
                a = i21 % 128;
                int i22 = i21 % 2;
                if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) != -1) {
                    int i23 = b;
                    int i24 = i23 & 17;
                    int i25 = (i23 ^ 17) | i24;
                    i2 = (i24 & i25) + (i25 | i24);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i26 = 3 % 4;
                    }
                    z3 = false;
                }
            } else {
                int i27 = b;
                int i28 = i27 & 17;
                int i29 = (i27 ^ 17) | i28;
                i2 = (i28 & i29) + (i29 | i28);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i210 = 3 % 4;
                }
                z3 = false;
            }
            int i30 = a;
            int i31 = i30 & 89;
            int i32 = (i30 ^ 89) | i31;
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            int i34 = i33 % 2;
            return z3;
        }
        if (bundle2 != null) {
            if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1)) {
                int i35 = a;
                int i36 = i35 & 25;
                int i37 = (i36 - (~(-(-((i35 ^ 25) | i36))))) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
                if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                    int i39 = a;
                    int i40 = ((i39 & 65) - (~(-(-(i39 | 65))))) - 1;
                    b = i40 % 128;
                    z2 = i40 % 2 != 0;
                    int i41 = (((i39 & (-50)) | ((~i39) & 49)) - (~((i39 & 49) << 1))) - 1;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                } else {
                    int i43 = b;
                    int i44 = (i43 ^ 79) + ((i43 & 79) << 1);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    z2 = false;
                }
            } else {
                int i46 = b;
                int i47 = (i46 ^ 79) + ((i46 & 79) << 1);
                a = i47 % 128;
                int i48 = i47 % 2;
                z2 = false;
            }
            int i49 = a;
            int i50 = i49 & 105;
            int i51 = -(-((i49 ^ 105) | i50));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            b = i52 % 128;
            if (i52 % 2 == 0) {
                int i53 = 33 / 0;
            }
            return z2;
        }
        int i54 = (-2) - ((((i4 | 62) << 1) - (i4 ^ 62)) ^ (-1));
        a = i54 % 128;
        int i55 = i54 % 2;
        if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1) {
            int i56 = a;
            int i57 = i56 ^ 97;
            int i58 = (i56 & 97) << 1;
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            b = i59 % 128;
            int i60 = i59 % 2;
            if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                int i61 = b;
                int i62 = i61 & 125;
                int i63 = ((~i62) & (i61 | 125)) + (i62 << 1);
                a = i63 % 128;
                int i64 = i63 % 2;
                int i65 = i61 & 113;
                int i66 = (i65 - (~((i61 ^ 113) | i65))) - 1;
                a = i66 % 128;
                int i67 = i66 % 2;
            } else {
                int i68 = b + 19;
                a = i68 % 128;
                int i69 = i68 % 2;
                z3 = false;
            }
        } else {
            int i610 = b + 19;
            a = i610 % 128;
            int i611 = i610 % 2;
            z3 = false;
        }
        int i70 = b;
        int i71 = i70 & 33;
        int i72 = (i70 ^ 33) | i71;
        int i73 = (i71 & i72) + (i72 | i71);
        a = i73 % 128;
        if (i73 % 2 == 0) {
            return z3;
        }
        throw null;
    }

    public static InputConnection x(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 49;
        int i5 = (i3 & 49) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (inputConnection != null) {
            int i9 = i7 + 51;
            b = i9 % 128;
            int i10 = i9 % 2;
            if (editorInfo.hintText == null) {
                int i11 = b;
                int i12 = (i11 & (-122)) | ((~i11) & 121);
                int i13 = (i11 & 121) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                ViewParent parent = view.getParent();
                if (i15 != 0) {
                    int i16 = 17 / 0;
                }
                int i17 = b + 79;
                a = i17 % 128;
                int i18 = i17 % 2;
                while (parent instanceof View) {
                    int i19 = b;
                    int i20 = ((((i19 ^ 21) | (i19 & 21)) << 1) - (~(-(((~i19) & 21) | (i19 & (-22)))))) - 1;
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    if (parent instanceof ak) {
                        int i23 = i21 + 83;
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        editorInfo.hintText = ((ak) parent).b();
                        int i25 = b;
                        int i26 = i25 & 67;
                        int i27 = -(-((i25 ^ 67) | i26));
                        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        break;
                    }
                    parent = parent.getParent();
                    int i30 = a;
                    int i31 = (i30 | 79) << 1;
                    int i32 = -(((~i30) & 79) | (i30 & (-80)));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
        }
        int i35 = a;
        int i36 = i35 & 39;
        int i37 = (i36 - (~((i35 ^ 39) | i36))) - 1;
        b = i37 % 128;
        if (i37 % 2 != 0) {
            return inputConnection;
        }
        throw null;
    }

    public float I(ivas.gov.bisp.enumeration.A.r rVar) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 15) | (i3 & 15)) << 1;
        int i5 = -(((~i3) & 15) | (i3 & (-16)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            float f2 = G(rVar).i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f3 = G(rVar).i;
        int i7 = b;
        int i8 = (i7 & (-40)) | ((~i7) & 39);
        int i9 = -(-((i7 & 39) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return f3;
    }

    public float J(ivas.gov.bisp.enumeration.A.r rVar) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 29) | (i3 & 29)) << 1) - (((~i3) & 29) | (i3 & (-30)));
        a = i4 % 128;
        int i5 = i4 % 2;
        float f2 = G(rVar).d;
        int i6 = a;
        int i7 = (-2) - (((i6 & 48) + (i6 | 48)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return f2;
        }
        throw null;
    }

    public ivas.gov.bisp.enumeration.A.i G(ivas.gov.bisp.enumeration.A.r rVar) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return (ivas.gov.bisp.enumeration.A.i) ((CardView.OooO00o) rVar).a;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048 A[PHI: r1 r4
  0x0048: PHI (r1v13 ivas.gov.bisp.enumeration.O.p$bfp) = (r1v12 ivas.gov.bisp.enumeration.O.p$bfp), (r1v14 ivas.gov.bisp.enumeration.O.p$bfp) binds: [B:10:0x0046, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r4v8 ivas.gov.bisp.enumeration.O.p) = (r4v7 ivas.gov.bisp.enumeration.O.p), (r4v10 ivas.gov.bisp.enumeration.O.p) binds: [B:10:0x0046, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    public static void A(View view, float f2) {
        C0019p c0019p;
        C0019p.bfp bfpVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 9;
        int i6 = -(-((i4 ^ 9) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        Drawable background = view.getBackground();
        if (background instanceof C0019p) {
            int i9 = a;
            int i10 = ((i9 & 4) + (i9 | 4)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                c0019p = (C0019p) background;
                bfpVar = c0019p.e;
                int i11 = 37 / 0;
                if (bfpVar.q != f2) {
                    int i12 = b;
                    i2 = ((i12 & 124) + (i12 | 124)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        bfpVar.q = f2;
                        c0019p.w();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    bfpVar.q = f2;
                    c0019p.w();
                }
            } else {
                c0019p = (C0019p) background;
                bfpVar = c0019p.e;
                if (bfpVar.q != f2) {
                    int i13 = b;
                    i2 = ((i13 & 124) + (i13 | 124)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        bfpVar.q = f2;
                        c0019p.w();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    bfpVar.q = f2;
                    c0019p.w();
                }
            }
        }
        int i14 = b + 113;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 35 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x012f  */
    public static final Object[] D(Collection collection) {
        Object[] objArrCopyOf;
        int i2 = 2 % 2;
        int i3 = a + 39;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            collection.size();
            throw null;
        }
        int size = collection.size();
        if (size != 0) {
            int i4 = a;
            int i5 = ((i4 | 121) << 1) - (((~i4) & 121) | (i4 & (-122)));
            b = i5 % 128;
            int i6 = i5 % 2;
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                objArrCopyOf = new Object[size];
                int i7 = a;
                int i8 = i7 & 71;
                int i9 = (i7 ^ 71) | i8;
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 0;
                while (true) {
                    int i13 = i12 & 1;
                    int i14 = (i12 ^ 1) | i13;
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    objArrCopyOf[i12] = it.next();
                    int i16 = a;
                    int i17 = ((i16 ^ 28) + ((i16 & 28) << 1)) - 1;
                    int i18 = i17 % 128;
                    b = i18;
                    int i19 = i17 % 2;
                    if (i15 >= objArrCopyOf.length) {
                        int i20 = i18 & 49;
                        int i21 = (i18 | 49) & (~i20);
                        int i22 = -(-(i20 << 1));
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        if (!it.hasNext()) {
                            break;
                        }
                        int i25 = a + 9;
                        int i26 = i25 % 128;
                        b = i26;
                        int i27 = i25 % 2;
                        int i28 = i15 * 3;
                        int i29 = ((i28 & 1) + (i28 | 1)) >>> 1;
                        if (i29 <= i15) {
                            int i30 = (i26 & (-54)) | ((~i26) & 53);
                            int i31 = (i26 & 53) << 1;
                            int i32 = (i30 & i31) + (i30 | i31);
                            int i33 = i32 % 128;
                            a = i33;
                            if (i32 % 2 != 0) {
                                int i34 = 76 / 0;
                                if (i15 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                                int i35 = i33 & 17;
                                int i36 = i35 + ((i33 ^ 17) | i35);
                                b = i36 % 128;
                                int i37 = i36 % 2;
                                i29 = 2147483645;
                            } else {
                                if (i15 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                                int i38 = i33 & 17;
                                int i39 = i38 + ((i33 ^ 17) | i38);
                                b = i39 % 128;
                                int i310 = i39 % 2;
                                i29 = 2147483645;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i29);
                        m(objArrCopyOf, "copyOf(result, newSize)");
                        int i40 = b + 67;
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        int i42 = a;
                        int i43 = (i42 & 70) + (i42 | 70);
                        int i44 = (i43 ^ (-1)) + (i43 << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        i12 = i15;
                    } else {
                        if (!it.hasNext()) {
                            int i46 = a;
                            int i47 = i46 & 21;
                            int i48 = ((((i46 ^ 21) | i47) << 1) - (~(-((i46 | 21) & (~i47))))) - 1;
                            b = i48 % 128;
                            if (i48 % 2 == 0) {
                                m(Arrays.copyOf(objArrCopyOf, i15), "copyOf(result, size)");
                                obj.hashCode();
                                throw null;
                            }
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                            m(objArrCopyOf, "copyOf(result, size)");
                            int i49 = b;
                            int i50 = (i49 ^ 81) + ((i49 & 81) << 1);
                            a = i50 % 128;
                            int i51 = i50 % 2;
                            break;
                        }
                        int i410 = a;
                        int i411 = (i410 & 70) + (i410 | 70);
                        int i412 = (i411 ^ (-1)) + (i411 << 1);
                        b = i412 % 128;
                        int i413 = i412 % 2;
                        i12 = i15;
                    }
                }
            } else {
                objArrCopyOf = j;
                int i52 = a;
                int i53 = (i52 ^ 55) + ((i52 & 55) << 1);
                b = i53 % 128;
                int i54 = i53 % 2;
            }
        } else {
            objArrCopyOf = j;
            int i55 = a;
            int i56 = (i55 ^ 55) + ((i55 & 55) << 1);
            b = i56 % 128;
            int i57 = i56 % 2;
        }
        int i58 = b;
        int i59 = i58 ^ 75;
        int i60 = -(-((i58 & 75) << 1));
        int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
        a = i61 % 128;
        int i62 = i61 % 2;
        return objArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    public static Throwable B(Throwable th) {
        String name;
        StackTraceElement[] stackTrace;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 63;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 63)) & i4);
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            name = r.class.getName();
            stackTrace = th.getStackTrace();
            int i8 = 51 / 0;
        } else {
            name = r.class.getName();
            stackTrace = th.getStackTrace();
        }
        int i9 = a;
        int i10 = i9 + 77;
        b = i10 % 128;
        int i11 = i10 % 2;
        int length = stackTrace.length;
        int i12 = i9 + 5;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 5 / 4;
        }
        int i14 = -1;
        int i15 = 0;
        while (i15 < length) {
            int i16 = b;
            int i17 = (i16 & (-74)) | ((~i16) & 73);
            int i18 = (i16 & 73) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 62 / 0;
                if (name.equals(stackTrace[i15].getClassName())) {
                    int i21 = b;
                    int i22 = i21 & 29;
                    int i23 = ((((i21 ^ 29) | i22) << 1) - (~(-((i21 | 29) & (~i22))))) - 1;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    i14 = i15;
                }
            } else if (name.equals(stackTrace[i15].getClassName())) {
                int i25 = b;
                int i26 = i25 & 29;
                int i27 = ((((i25 ^ 29) | i26) << 1) - (~(-((i25 | 29) & (~i26))))) - 1;
                a = i27 % 128;
                int i28 = i27 % 2;
                i14 = i15;
            }
            int i29 = (i15 & 2) + (i15 | 2);
            i15 = (i29 ^ (-1)) + (i29 << 1);
            int i30 = a;
            int i31 = i30 & 13;
            int i32 = (i30 | 13) & (~i31);
            int i33 = -(-(i31 << 1));
            int i34 = (i32 & i33) + (i32 | i33);
            b = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = i14 & 1;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, i36 + ((i14 ^ 1) | i36), length);
        int i37 = a + 87;
        b = i37 % 128;
        if (i37 % 2 != 0) {
            th.setStackTrace(stackTraceElementArr);
            return th;
        }
        th.setStackTrace(stackTraceElementArr);
        throw null;
    }

    public static void n(Object obj, String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 84) << 1) - (i3 ^ 84)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            int i5 = i3 & 71;
            int i6 = -(-((i3 ^ 71) | i5));
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        int i9 = b;
        int i10 = ((i9 ^ 12) + ((i9 & 12) << 1)) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        int i12 = a;
        int i13 = (i12 & (-88)) | ((~i12) & 87);
        int i14 = -(-((i12 & 87) << 1));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            sb.append(", parameter ");
            sb.append(str);
            sb.toString();
            throw null;
        }
        sb.append(", parameter ");
        sb.append(str);
        NullPointerException nullPointerException = new NullPointerException(sb.toString());
        B(nullPointerException);
        throw nullPointerException;
    }

    public static String s(AbstractC0069z abstractC0069z) {
        byte bF;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        StringBuilder sb = new StringBuilder(abstractC0069z.size());
        int i9 = b;
        int i10 = (i9 | 69) << 1;
        int i11 = -((i9 & (-70)) | ((~i9) & 69));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i9 + 65;
        a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < abstractC0069z.size()) {
            int i17 = a;
            int i18 = (i17 & 39) + (i17 | 39);
            b = i18 % 128;
            if (i18 % 2 != 0 ? (bF = abstractC0069z.f(i16)) == 34 : (bF = abstractC0069z.f(i16)) == 10) {
                sb.append("\\\"");
                int i19 = a;
                int i20 = (i19 | 55) << 1;
                int i21 = -(((~i19) & 55) | (i19 & (-56)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                b = i22 % 128;
                int i23 = i22 % 2;
            } else {
                int i24 = b;
                int i25 = i24 & 91;
                int i26 = (i24 ^ 91) | i25;
                int i27 = (i25 & i26) + (i25 | i26);
                a = i27 % 128;
                if (i27 % 2 == 0 ? bF != 39 : bF != 7) {
                    int i28 = i24 + 71;
                    a = i28 % 128;
                    if (i28 % 2 == 0 ? bF != 92 : bF != 47) {
                        switch (bF) {
                            case 7:
                                sb.append("\\a");
                                int i29 = b;
                                int i30 = i29 & 93;
                                int i31 = i30 + ((i29 ^ 93) | i30);
                                a = i31 % 128;
                                int i32 = i31 % 2;
                                break;
                            case 8:
                                sb.append("\\b");
                                int i33 = b;
                                int i34 = i33 ^ 3;
                                int i35 = ((i33 & 3) | i34) << 1;
                                int i36 = -i34;
                                int i37 = (i35 & i36) + (i35 | i36);
                                a = i37 % 128;
                                if (i37 % 2 != 0) {
                                    int i38 = 4 / 4;
                                }
                                break;
                            case 9:
                                sb.append("\\t");
                                int i39 = b;
                                i2 = ((i39 | 93) << 1) - (i39 ^ 93);
                                a = i2 % 128;
                                int i40 = i2 % 2;
                                break;
                            case 10:
                                sb.append("\\n");
                                int i41 = b;
                                int i42 = ((i41 ^ 45) | (i41 & 45)) << 1;
                                int i43 = -(((~i41) & 45) | (i41 & (-46)));
                                i3 = i42 & i43;
                                i4 = i43 | i42;
                                i6 = i3 + i4;
                                a = i6 % 128;
                                break;
                            case 11:
                                sb.append("\\v");
                                i5 = b + 39;
                                a = i5 % 128;
                                int i44 = i5 % 2;
                                break;
                            case 12:
                                sb.append("\\f");
                                int i45 = b;
                                int i46 = i45 & 73;
                                int i47 = (i45 | 73) & (~i46);
                                int i48 = -(-(i46 << 1));
                                i3 = i47 ^ i48;
                                i4 = (i47 & i48) << 1;
                                i6 = i3 + i4;
                                a = i6 % 128;
                                break;
                            case 13:
                                sb.append("\\r");
                                i5 = (-2) - ((a + 16) ^ (-1));
                                b = i5 % 128;
                                int i49 = i5 % 2;
                                break;
                            default:
                                if (bF >= 32) {
                                    int i50 = (i24 & (-14)) | ((~i24) & 13);
                                    int i51 = (i24 & 13) << 1;
                                    int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                                    a = i52 % 128;
                                    if (i52 % 2 == 0 ? bF <= 126 : bF <= 118) {
                                        int i53 = i24 & 87;
                                        int i54 = (i24 ^ 87) | i53;
                                        int i55 = (i53 & i54) + (i54 | i53);
                                        a = i55 % 128;
                                        if (i55 % 2 != 0) {
                                            sb.append((char) bF);
                                            throw null;
                                        }
                                        sb.append((char) bF);
                                        break;
                                    }
                                }
                                sb.append('\\');
                                int i56 = (bF >>> 6) & 3;
                                int i57 = a;
                                int i58 = (i57 ^ 3) + ((i57 & 3) << 1);
                                b = i58 % 128;
                                if (i58 % 2 == 0) {
                                    sb.append((char) (i56 * 48));
                                    int i59 = bF * 3;
                                    int i60 = i59 ^ 83;
                                    int i61 = i59 & 83;
                                    i7 = (i61 & i60) | (i60 ^ i61);
                                } else {
                                    sb.append((char) (i56 ^ 48));
                                    i7 = (bF >>> 3) & 7;
                                }
                                sb.append((char) ((i7 & 48) + (i7 | 48)));
                                int i62 = a;
                                int i63 = (i62 & 71) + (i62 | 71);
                                b = i63 % 128;
                                int i64 = i63 % 2;
                                sb.append((char) ((bF & 7) | 48));
                                int i65 = a;
                                i2 = (i65 & 87) + (i65 | 87);
                                b = i2 % 128;
                                int i410 = i2 % 2;
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                        int i66 = b;
                        int i67 = i66 & 11;
                        int i68 = i67 + ((i66 ^ 11) | i67);
                        a = i68 % 128;
                        int i69 = i68 % 2;
                    }
                } else {
                    sb.append("\\'");
                    int i70 = a;
                    int i71 = i70 & 21;
                    int i72 = -(-((i70 ^ 21) | i71));
                    i6 = (i71 ^ i72) + ((i72 & i71) << 1);
                    b = i6 % 128;
                }
                int i73 = i6 % 2;
            }
            i16 = (((i16 | 2) << 1) - (i16 ^ 2)) - 1;
            int i74 = b;
            int i75 = i74 & 109;
            int i76 = -(-((i74 ^ 109) | i75));
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            a = i77 % 128;
            int i78 = i77 % 2;
        }
        String string = sb.toString();
        int i79 = a;
        int i80 = i79 & 15;
        int i81 = i80 + ((i79 ^ 15) | i80);
        b = i81 % 128;
        if (i81 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static as z(ByteBuffer byteBuffer) throws IOException {
        int i2;
        long j2;
        int iPosition;
        long j3;
        int i3;
        int iPosition2;
        int i4;
        int iPosition3;
        int i5;
        int i6 = 2 % 2;
        int i7 = b + 41;
        a = i7 % 128;
        int i8 = i7 % 2;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        int iPosition4 = byteBufferDuplicate.position();
        int i9 = a;
        int i10 = i9 & 105;
        int i11 = (i9 ^ 105) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        int i13 = 5;
        int i14 = 4;
        if (i12 % 2 == 0) {
            byteBufferDuplicate.position(iPosition4 >>> 5);
            short s2 = byteBufferDuplicate.getShort();
            int i15 = ((-65536) & s2) | ((~s2) & 65535);
            int i16 = s2 & 65535;
            i2 = (i16 & i15) | (i15 ^ i16);
        } else {
            byteBufferDuplicate.position((iPosition4 ^ 4) + ((iPosition4 & 4) << 1));
            i2 = byteBufferDuplicate.getShort() & 65535;
        }
        int i17 = a;
        int i18 = ((i17 ^ 93) - (~(-(-((i17 & 93) << 1))))) - 1;
        b = i18 % 128;
        if (i18 % 2 != 0 ? i2 > 100 : i2 > 65) {
            throw new IOException("Cannot read metadata.");
        }
        int iPosition5 = byteBufferDuplicate.position();
        byteBufferDuplicate.position((((iPosition5 & (-7)) | ((~iPosition5) & 6)) - (~(-(-((iPosition5 & 6) << 1))))) - 1);
        int i19 = a;
        int i20 = i19 & 89;
        int i21 = ((i19 ^ 89) | i20) << 1;
        int i22 = -((i19 | 89) & (~i20));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        int i25 = 0;
        while (true) {
            if (i25 >= i2) {
                int i26 = b;
                int i27 = i26 & 113;
                int i28 = i27 + ((i26 ^ 113) | i27);
                a = i28 % 128;
                int i29 = i28 % 2;
                j2 = -1;
                break;
            }
            int i30 = b;
            int i31 = (i30 ^ 37) + ((i30 & 37) << 1);
            a = i31 % 128;
            if (i31 % 2 != 0) {
                i4 = byteBufferDuplicate.getInt();
                iPosition3 = byteBufferDuplicate.position();
                i5 = i13;
            } else {
                i4 = byteBufferDuplicate.getInt();
                iPosition3 = byteBufferDuplicate.position();
                i5 = i14;
            }
            int i32 = a;
            int i33 = ((i32 & 56) + (i32 | 56)) - 1;
            b = i33 % 128;
            if (i33 % 2 == 0) {
                byteBufferDuplicate.position(iPosition3 << i5);
            } else {
                int i34 = -(-i5);
                byteBufferDuplicate.position((iPosition3 & i34) + (i34 | iPosition3));
            }
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            int iPosition6 = byteBufferDuplicate.position();
            byteBufferDuplicate.position(((((iPosition6 ^ 4) | (iPosition6 & 4)) << 1) - (~(-((iPosition6 & (-5)) | ((~iPosition6) & i14))))) - 1);
            int i35 = b;
            int i36 = i35 & 69;
            int i37 = (~i36) & (i35 | 69);
            int i38 = i36 << 1;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            a = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
            if (1835365473 == i4) {
                break;
            }
            int i40 = ((i35 ^ 110) + ((i35 & 110) << 1)) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
            i25++;
            int i42 = (i35 & (-92)) | ((~i35) & 91);
            int i43 = -(-((i35 & 91) << 1));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            a = i44 % 128;
            int i45 = i44 % 2;
            i13 = 5;
            i14 = 4;
        }
        if (j2 != -1) {
            int i46 = a + 121;
            b = i46 % 128;
            int i47 = i46 % 2;
            int iPosition7 = (int) (j2 - ((long) byteBufferDuplicate.position()));
            int iPosition8 = byteBufferDuplicate.position();
            int i48 = b;
            int i49 = ((((i48 ^ 9) | (i48 & 9)) << 1) - (~(-(((~i48) & 9) | (i48 & (-10)))))) - 1;
            a = i49 % 128;
            if (i49 % 2 != 0) {
                int i50 = -iPosition7;
                int i51 = iPosition8 & i50;
                int i52 = (i50 | iPosition8) & (~i51);
                int i53 = i51 << 1;
                byteBufferDuplicate.position(((i52 | i53) << 1) - (i52 ^ i53));
                iPosition = byteBufferDuplicate.position() % 124;
            } else {
                byteBufferDuplicate.position((iPosition8 & iPosition7) + (iPosition7 | iPosition8));
                iPosition = byteBufferDuplicate.position() + 12;
            }
            byteBufferDuplicate.position(iPosition);
            long j4 = byteBufferDuplicate.getInt();
            int i54 = a;
            int i55 = i54 ^ 87;
            int i56 = (i54 & 87) << 1;
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            b = i57 % 128;
            int i58 = i57 % 2;
            int i59 = 0;
            while (true) {
                if (i59 < (j4 & 4294967295L)) {
                    int i60 = b;
                    int i61 = i60 & 33;
                    int i62 = i61 + ((i60 ^ 33) | i61);
                    a = i62 % 128;
                    int i63 = i62 % 2;
                    int i64 = byteBufferDuplicate.getInt();
                    j3 = byteBufferDuplicate.getInt();
                    int i65 = a;
                    int i66 = ((i65 | 69) << 1) - (i65 ^ 69);
                    b = i66 % 128;
                    int i67 = i66 % 2;
                    byteBufferDuplicate.getInt();
                    if (1164798569 == i64) {
                        break;
                    }
                    int i68 = b;
                    int i69 = ((i68 | 79) << 1) - (i68 ^ 79);
                    int i70 = i69 % 128;
                    a = i70;
                    if (i69 % 2 != 0) {
                        throw null;
                    }
                    if (1701669481 == i64) {
                        break;
                    }
                    int i71 = i59 & 114;
                    int i72 = (i59 ^ 114) | i71;
                    int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                    int i74 = i73 & (-113);
                    int i75 = ((i73 ^ (-113)) | i74) << 1;
                    int i76 = -((~i74) & (i73 | (-113)));
                    i59 = ((i75 | i76) << 1) - (i75 ^ i76);
                    int i77 = i70 & 29;
                    int i78 = ((~i77) & (i70 | 29)) + (i77 << 1);
                    b = i78 % 128;
                    int i79 = i78 % 2;
                }
            }
            byteBufferDuplicate.position((int) ((j3 & 4294967295L) + j2));
            as asVar = new as();
            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
            int i80 = b;
            int i81 = i80 | 101;
            int i82 = i81 << 1;
            int i83 = -((~(i80 & 101)) & i81);
            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
            a = i84 % 128;
            if (i84 % 2 != 0) {
                i3 = byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                iPosition2 = byteBufferDuplicate.position();
                int i85 = 90 / 0;
            } else {
                i3 = byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                iPosition2 = byteBufferDuplicate.position();
            }
            asVar.d(iPosition2 + i3, byteBufferDuplicate);
            int i86 = a + 121;
            b = i86 % 128;
            if (i86 % 2 != 0) {
                return asVar;
            }
            throw null;
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0181  */
    public void K(ivas.gov.bisp.enumeration.A.r rVar, float f2) {
        ivas.gov.bisp.enumeration.A.i iVarG;
        CardView.OooO00o oooO00o;
        CardView cardView;
        boolean useCompatPadding;
        boolean zB;
        float f3;
        int i2;
        float f4;
        float fB;
        int i3 = 2 % 2;
        int i4 = a + 20;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            iVarG = G(rVar);
            oooO00o = (CardView.OooO00o) rVar;
            cardView = CardView.this;
            int i6 = 40 / 0;
        } else {
            iVarG = G(rVar);
            oooO00o = (CardView.OooO00o) rVar;
            cardView = CardView.this;
        }
        int i7 = b + 67;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            useCompatPadding = cardView.getUseCompatPadding();
            zB = oooO00o.b();
            f3 = iVarG.i;
            int i8 = 16 / 0;
        } else {
            useCompatPadding = cardView.getUseCompatPadding();
            zB = oooO00o.b();
            f3 = iVarG.i;
        }
        Object obj = null;
        if (f2 == f3) {
            int i9 = a;
            int i10 = i9 & 11;
            int i11 = -(-((i9 ^ 11) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            if (iVarG.h == useCompatPadding) {
                int i14 = b + 73;
                a = i14 % 128;
                int i15 = i14 % 2;
                if (iVarG.j != zB) {
                    iVarG.i = f2;
                    iVarG.h = useCompatPadding;
                    int i16 = a;
                    int i17 = i16 & 11;
                    int i18 = i17 + ((i16 ^ 11) | i17);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    iVarG.j = zB;
                    iVarG.e(null);
                    int i20 = b;
                    int i21 = i20 & 5;
                    i2 = i21 + ((i20 ^ 5) | i21);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        iVarG.invalidateSelf();
                        throw null;
                    }
                    iVarG.invalidateSelf();
                    int i22 = a;
                    int i23 = ((i22 | 17) << 1) - (((~i22) & 17) | (i22 & (-18)));
                    b = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else {
                iVarG.i = f2;
                iVarG.h = useCompatPadding;
                int i110 = a;
                int i111 = i110 & 11;
                int i112 = i111 + ((i110 ^ 11) | i111);
                b = i112 % 128;
                int i113 = i112 % 2;
                iVarG.j = zB;
                iVarG.e(null);
                int i25 = b;
                int i26 = i25 & 5;
                i2 = i26 + ((i25 ^ 5) | i26);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    iVarG.invalidateSelf();
                    throw null;
                }
                iVarG.invalidateSelf();
                int i27 = a;
                int i28 = ((i27 | 17) << 1) - (((~i27) & 17) | (i27 & (-18)));
                b = i28 % 128;
                int i29 = i28 % 2;
            }
        } else {
            iVarG.i = f2;
            iVarG.h = useCompatPadding;
            int i114 = a;
            int i115 = i114 & 11;
            int i116 = i115 + ((i114 ^ 11) | i115);
            b = i116 % 128;
            int i117 = i116 % 2;
            iVarG.j = zB;
            iVarG.e(null);
            int i210 = b;
            int i211 = i210 & 5;
            i2 = i211 + ((i210 ^ 5) | i211);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                iVarG.invalidateSelf();
                throw null;
            }
            iVarG.invalidateSelf();
            int i212 = a;
            int i213 = ((i212 | 17) << 1) - (((~i212) & 17) | (i212 & (-18)));
            b = i213 % 128;
            int i214 = i213 % 2;
        }
        if (!CardView.this.getUseCompatPadding()) {
            int i30 = a;
            int i31 = i30 ^ 37;
            int i32 = -(-((i30 & 37) << 1));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            if (i33 % 2 == 0) {
                oooO00o.c(0, 1, 1, 0);
            } else {
                oooO00o.c(0, 0, 0, 0);
            }
            int i34 = b;
            int i35 = i34 ^ 25;
            int i36 = -(-((i34 & 25) << 1));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            a = i37 % 128;
            if (i37 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        float f5 = G(rVar).i;
        ivas.gov.bisp.enumeration.A.i iVarG2 = G(rVar);
        int i38 = a;
        int i39 = ((i38 ^ 66) + ((i38 & 66) << 1)) - 1;
        b = i39 % 128;
        if (i39 % 2 == 0) {
            f4 = iVarG2.d;
            fB = ivas.gov.bisp.enumeration.A.p.b(f5, f4, oooO00o.b());
            int i40 = 52 / 0;
        } else {
            f4 = iVarG2.d;
            fB = ivas.gov.bisp.enumeration.A.p.b(f5, f4, oooO00o.b());
        }
        int iCeil = (int) Math.ceil(fB);
        boolean zB2 = oooO00o.b();
        int i41 = b;
        int i42 = i41 & 63;
        int i43 = ((i41 ^ 63) | i42) << 1;
        int i44 = -((i41 | 63) & (~i42));
        int i45 = (i43 & i44) + (i44 | i43);
        a = i45 % 128;
        if (i45 % 2 != 0) {
            Math.ceil(ivas.gov.bisp.enumeration.A.p.c(f5, f4, zB2));
            obj.hashCode();
            throw null;
        }
        int iCeil2 = (int) Math.ceil(ivas.gov.bisp.enumeration.A.p.c(f5, f4, zB2));
        int i46 = a;
        int i47 = i46 & 95;
        int i48 = (i46 | 95) & (~i47);
        int i49 = -(-(i47 << 1));
        int i50 = (i48 & i49) + (i48 | i49);
        b = i50 % 128;
        if (i50 % 2 == 0) {
            oooO00o.c(iCeil, iCeil2, iCeil, iCeil2);
            obj.hashCode();
            throw null;
        }
        oooO00o.c(iCeil, iCeil2, iCeil, iCeil2);
        int i51 = b + 79;
        a = i51 % 128;
        int i52 = i51 % 2;
    }
}
