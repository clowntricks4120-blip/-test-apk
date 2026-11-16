package ivas.gov.bisp.enumeration.p089l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p011ak.V;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static int a = 1;
    private static int b;

    public static ActionMode.Callback h(TextView textView, ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (i3 - (~((i2 ^ 93) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            int i7 = a;
            int i8 = i7 + 97;
            b = i8 % 128;
            if (i8 % 2 == 0 ? i6 <= 27 : i6 <= 24) {
                int i9 = (i7 & 25) + (i7 | 25);
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                if (!(callback instanceof aVi)) {
                    int i12 = i10 & 39;
                    int i13 = i12 + ((i10 ^ 39) | i12);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    if (callback != null) {
                        aVi avi = new aVi(callback, textView);
                        int i15 = a;
                        int i16 = (i15 & (-104)) | ((~i15) & 103);
                        int i17 = (i15 & 103) << 1;
                        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return avi;
                    }
                }
            }
        }
        int i20 = a + 81;
        b = i20 % 128;
        int i21 = i20 % 2;
        return callback;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f A[PHI: r1
  0x004f: PHI (r1v22 android.graphics.Paint$FontMetricsInt) = (r1v9 android.graphics.Paint$FontMetricsInt), (r1v25 android.graphics.Paint$FontMetricsInt) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0043 A[PHI: r1
  0x0043: PHI (r1v10 android.graphics.Paint$FontMetricsInt) = (r1v9 android.graphics.Paint$FontMetricsInt), (r1v25 android.graphics.Paint$FontMetricsInt) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static void d(TextView textView, int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-52)) | ((~i4) & 51);
        int i6 = -(-((i4 & 51) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            r.j(i);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i8 = 52 / 0;
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
                int i9 = b + 61;
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i2 = fontMetricsInt.descent;
                int i11 = a;
                int i12 = i11 & 93;
                int i13 = (i12 - (~((i11 ^ 93) | i12))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            r.j(i);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
                int i15 = b + 61;
                a = i15 % 128;
                int i16 = i15 % 2;
            } else {
                i2 = fontMetricsInt.descent;
                int i17 = a;
                int i18 = i17 & 93;
                int i19 = (i18 - (~((i17 ^ 93) | i18))) - 1;
                b = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        if (i > Math.abs(i2)) {
            int i20 = a + 27;
            b = i20 % 128;
            int i21 = i20 % 2;
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = textView.getPaddingTop();
            int paddingRight = textView.getPaddingRight();
            int i22 = b;
            int i23 = i22 & 25;
            int i24 = ((i22 ^ 25) | i23) << 1;
            int i25 = -((i22 | 25) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
            int i28 = -(~(-i2));
            textView.setPadding(paddingLeft, paddingTop, paddingRight, (((i | i28) << 1) - (i ^ i28)) - 1);
            int i29 = b + 41;
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = a;
        int i32 = (i31 & (-54)) | ((~i31) & 53);
        int i33 = (i31 & 53) << 1;
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        b = i34 % 128;
        if (i34 % 2 != 0) {
            throw null;
        }
    }

    public static void e(TextView textView, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 73;
        int i5 = ((i3 ^ 73) | i4) << 1;
        int i6 = -((i3 | 73) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            r.j(i);
            textView.getPaint().getFontMetricsInt(null);
            obj.hashCode();
            throw null;
        }
        r.j(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            int i8 = b;
            int i9 = i8 & 101;
            int i10 = i8 | 101;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            textView.setLineSpacing((i - (~(-(~(-fontMetricsInt))))) - 2, 1.0f);
            int i13 = b;
            int i14 = ((i13 | 13) << 1) - (i13 ^ 13);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = ((i16 & (-40)) | ((~i16) & 39)) + ((i16 & 39) << 1);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i2 ^ 17) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (callback instanceof aVi) {
            int i7 = (i2 & 1) + (i2 | 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            if (Build.VERSION.SDK_INT >= 26) {
                int i9 = b;
                int i10 = ((((i9 ^ 123) | (i9 & 123)) << 1) - (~(-(((~i9) & 123) | (i9 & (-124)))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                callback = ((aVi) callback).c;
                int i12 = b;
                int i13 = ((i12 | 111) << 1) - (i12 ^ 111);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 4;
                }
            }
        }
        int i15 = a;
        int i16 = i15 & 49;
        int i17 = ((i15 ^ 49) | i16) << 1;
        int i18 = -((i15 | 49) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        return callback;
    }

    public static void g(TextView textView, V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = (i2 | 41) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            V.aWg awgB = b(textView);
            Objects.requireNonNull(v);
            awgB.d(null);
            int i8 = b;
            int i9 = i8 & 33;
            int i10 = (i8 | 33) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 & i11) + (i10 | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            throw null;
        }
        int i14 = a;
        int i15 = i14 ^ 59;
        int i16 = -(-((i14 & 59) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            Objects.requireNonNull(v);
            textView.setText((CharSequence) null);
            int i18 = 65 / 0;
        } else {
            Objects.requireNonNull(v);
            textView.setText((CharSequence) null);
        }
        int i19 = b;
        int i20 = i19 & 61;
        int i21 = -(-((i19 ^ 61) | i20));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = r8.getPaint().getFontMetricsInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r8.getIncludeFontPadding() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p089l.l.a;
        r3 = r2 & 87;
        r2 = (r2 ^ 87) | r3;
        r4 = (r3 ^ r2) + ((r2 & r3) << 1);
        ivas.gov.bisp.enumeration.p089l.l.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r1 = r1.top;
        r2 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r1 = r1.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r1 = r1.ascent;
        r2 = ivas.gov.bisp.enumeration.p089l.l.a;
        r3 = (r2 ^ 125) + ((r2 & 125) << 1);
        ivas.gov.bisp.enumeration.p089l.l.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r9 <= java.lang.Math.abs(r1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p089l.l.a + 59;
        ivas.gov.bisp.enumeration.p089l.l.b = r2 % 128;
        r2 = r2 % 2;
        r2 = r8.getPaddingLeft();
        r3 = r8.getPaddingRight();
        r4 = r8.getPaddingBottom();
        r5 = ivas.gov.bisp.enumeration.p089l.l.a;
        r7 = r5 & 83;
        r6 = ((r5 ^ 83) | r7) << 1;
        r5 = -((r5 | 83) & (~r7));
        r7 = (r6 ^ r5) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.p089l.l.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if ((r7 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        r8.setPadding(r2, r9 >> r1, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r1 = -(-r1);
        r5 = r9 & r1;
        r9 = (r9 ^ r1) | r5;
        r8.setPadding(r2, (r5 & r9) + (r9 | r5), r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p089l.l.b;
        r9 = r8 & 9;
        r8 = -(-((r8 ^ 9) | r9));
        r1 = ((r9 | r8) << 1) - (r8 ^ r9);
        ivas.gov.bisp.enumeration.p089l.l.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p089l.l.a;
        r9 = ((r8 | 49) << 1) - (r8 ^ 49);
        ivas.gov.bisp.enumeration.p089l.l.b = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if ((r9 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
    
        r8 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 39) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r8.setFirstBaselineToTopHeight(r9);
        r8 = ivas.gov.bisp.enumeration.p089l.l.a;
        r9 = ((r8 ^ 67) - (~((r8 & 67) << 1))) - 1;
        ivas.gov.bisp.enumeration.p089l.l.b = r9 % 128;
        r9 = r9 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.widget.TextView r8, int r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p089l.l.c(android.widget.TextView, int):void");
    }

    public static class aVi implements ActionMode.Callback {
        private static int a = 1;
        private static int b;
        public final ActionMode.Callback c;
        public final TextView d;
        public Class<?> e;
        public Method f;
        public boolean g = false;
        public boolean h;

        public aVi(ActionMode.Callback callback, TextView textView) {
            this.c = callback;
            this.d = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 106) + ((i2 & 106) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            boolean zOnActionItemClicked = this.c.onActionItemClicked(actionMode, menuItem);
            int i6 = b;
            int i7 = (i6 & (-126)) | ((~i6) & 125);
            int i8 = -(-((i6 & 125) << 1));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return zOnActionItemClicked;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-34)) | ((~i2) & 33);
            int i4 = -(-((i2 & 33) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean zOnCreateActionMode = this.c.onCreateActionMode(actionMode, menu);
            int i7 = a;
            int i8 = i7 & 121;
            int i9 = -(-((i7 ^ 121) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return zOnCreateActionMode;
            }
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-24)) | ((~i2) & 23)) - (~(-(-((i2 & 23) << 1))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                this.c.onDestroyActionMode(actionMode);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.c.onDestroyActionMode(actionMode);
            int i4 = b;
            int i5 = i4 & 43;
            int i6 = -(-(i4 | 43));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:126:0x03af  */
        /* JADX WARN: Code duplicated, block: B:157:0x02ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00dd A[Catch: IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x043c, IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x043c, IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x043c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x043c, blocks: (B:15:0x0080, B:21:0x009a, B:21:0x009a, B:21:0x009a, B:23:0x00a2, B:23:0x00a2, B:23:0x00a2, B:32:0x00c9, B:32:0x00c9, B:32:0x00c9, B:38:0x0107, B:38:0x0107, B:38:0x0107, B:44:0x013b, B:44:0x013b, B:44:0x013b, B:47:0x0155, B:47:0x0155, B:47:0x0155, B:50:0x016d, B:50:0x016d, B:50:0x016d, B:53:0x0188, B:53:0x0188, B:53:0x0188, B:55:0x018d, B:55:0x018d, B:55:0x018d, B:60:0x0192, B:60:0x0192, B:60:0x0192, B:64:0x01af, B:64:0x01af, B:64:0x01af, B:65:0x01b6, B:65:0x01b6, B:65:0x01b6, B:29:0x00a9, B:29:0x00a9, B:29:0x00a9, B:34:0x00dd, B:34:0x00dd, B:34:0x00dd, B:36:0x00f4, B:36:0x00f4, B:36:0x00f4), top: B:142:0x0080 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x02c6  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws Throwable {
            Method declaredMethod;
            CharSequence charSequenceLoadLabel;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            Class<?>[] clsArr;
            int i6 = 2 % 2;
            int i7 = b;
            int i8 = (i7 & 59) + (i7 | 59);
            a = i8 % 128;
            Throwable th = null;
            if (i8 % 2 == 0) {
                this.d.getContext().getPackageManager();
                th.hashCode();
                throw null;
            }
            Context context = this.d.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.g) {
                int i9 = b;
                int i10 = ((i9 | 71) << 1) - (i9 ^ 71);
                a = i10 % 128;
                int i11 = i10 % 2;
                this.g = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.e = cls;
                    int i12 = b;
                    int i13 = ((i12 ^ 45) | (i12 & 45)) << 1;
                    int i14 = -(((~i12) & 45) | (i12 & (-46)));
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        clsArr = new Class[1];
                        clsArr[1] = Integer.TYPE;
                    } else {
                        clsArr = new Class[]{Integer.TYPE};
                    }
                    this.f = cls.getDeclaredMethod("removeItemAt", clsArr);
                    this.h = true;
                    int i16 = b + 87;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.e = null;
                    this.f = null;
                    this.h = false;
                }
            }
            try {
                if (!this.h) {
                    Class<?> cls2 = menu.getClass();
                    Class<?>[] clsArr2 = new Class[1];
                    Class<?> cls3 = Integer.TYPE;
                    int i18 = a;
                    int i19 = (((i18 | 126) << 1) - (i18 ^ 126)) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    clsArr2[0] = cls3;
                    declaredMethod = cls2.getDeclaredMethod("removeItemAt", clsArr2);
                    int i21 = b + 124;
                    int i22 = (i21 ^ (-1)) + (i21 << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    int i24 = a;
                    int i25 = i24 ^ 101;
                    int i26 = ((i24 & 101) | i25) << 1;
                    int i27 = -i25;
                    int i28 = (i26 & i27) + (i26 | i27);
                    b = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 34 / 0;
                        if (this.e.isInstance(menu)) {
                            int i30 = b;
                            int i31 = ((i30 ^ 109) | (i30 & 109)) << 1;
                            int i32 = -(((~i30) & 109) | (i30 & (-110)));
                            int i33 = (i31 & i32) + (i32 | i31);
                            int i34 = i33 % 128;
                            a = i34;
                            int i35 = i33 % 2;
                            declaredMethod = this.f;
                            int i36 = i34 ^ 73;
                            int i37 = ((i34 & 73) | i36) << 1;
                            int i38 = -i36;
                            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                            b = i39 % 128;
                            int i40 = i39 % 2;
                        } else {
                            Class<?> cls4 = menu.getClass();
                            Class<?>[] clsArr3 = new Class[1];
                            Class<?> cls5 = Integer.TYPE;
                            int i110 = a;
                            int i111 = (((i110 | 126) << 1) - (i110 ^ 126)) - 1;
                            b = i111 % 128;
                            int i210 = i111 % 2;
                            clsArr3[0] = cls5;
                            declaredMethod = cls4.getDeclaredMethod("removeItemAt", clsArr3);
                            int i211 = b + 124;
                            int i212 = (i211 ^ (-1)) + (i211 << 1);
                            a = i212 % 128;
                            int i213 = i212 % 2;
                        }
                    } else if (this.e.isInstance(menu)) {
                        int i310 = b;
                        int i311 = ((i310 ^ 109) | (i310 & 109)) << 1;
                        int i312 = -(((~i310) & 109) | (i310 & (-110)));
                        int i313 = (i311 & i312) + (i312 | i311);
                        int i314 = i313 % 128;
                        a = i314;
                        int i315 = i313 % 2;
                        declaredMethod = this.f;
                        int i316 = i314 ^ 73;
                        int i317 = ((i314 & 73) | i316) << 1;
                        int i318 = -i316;
                        int i319 = ((i317 | i318) << 1) - (i317 ^ i318);
                        b = i319 % 128;
                        int i41 = i319 % 2;
                    } else {
                        Class<?> cls6 = menu.getClass();
                        Class<?>[] clsArr4 = new Class[1];
                        Class<?> cls7 = Integer.TYPE;
                        int i112 = a;
                        int i113 = (((i112 | 126) << 1) - (i112 ^ 126)) - 1;
                        b = i113 % 128;
                        int i214 = i113 % 2;
                        clsArr4[0] = cls7;
                        declaredMethod = cls6.getDeclaredMethod("removeItemAt", clsArr4);
                        int i215 = b + 124;
                        int i216 = (i215 ^ (-1)) + (i215 << 1);
                        a = i216 % 128;
                        int i217 = i216 % 2;
                    }
                }
                int size = menu.size();
                int i42 = ((~size) | size) << 1;
                int i43 = -(~size);
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                int i45 = b + 45;
                a = i45 % 128;
                int i46 = i45 % 2;
                while (i44 >= 0) {
                    int i47 = a;
                    int i48 = (((i47 | 43) << 1) - (~(-((43 & (~i47)) | (i47 & (-44)))))) - 1;
                    b = i48 % 128;
                    if (i48 % 2 != 0) {
                        menu.getItem(i44).getIntent();
                        throw null;
                    }
                    MenuItem item = menu.getItem(i44);
                    if (item.getIntent() != null) {
                        int i49 = a;
                        int i50 = ((i49 & 121) - (~(-(-(i49 | 121))))) - 1;
                        b = i50 % 128;
                        int i51 = i50 % 2;
                        if ("android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                            int i52 = a + 11;
                            b = i52 % 128;
                            int i53 = i52 % 2;
                            Object[] objArr = {Integer.valueOf(i44)};
                            int i54 = b;
                            int i55 = i54 & 47;
                            int i56 = -(-(i54 | 47));
                            int i57 = (i55 & i56) + (i56 | i55);
                            a = i57 % 128;
                            if (i57 % 2 == 0) {
                                declaredMethod.invoke(menu, objArr);
                                int i58 = 61 / 0;
                            } else {
                                declaredMethod.invoke(menu, objArr);
                            }
                        }
                    }
                    i44--;
                    int i59 = a;
                    int i60 = i59 & 123;
                    int i61 = -(-((i59 ^ 123) | i60));
                    int i62 = (i60 & i61) + (i61 | i60);
                    b = i62 % 128;
                    if (i62 % 2 != 0) {
                        int i63 = 2 % 3;
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                    int i64 = a;
                    int i65 = i64 & 93;
                    int i66 = i64 | 93;
                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                    b = i67 % 128;
                    int i68 = i67 % 2;
                    Iterator<ResolveInfo> it = packageManager.queryIntentActivities(type, 0).iterator();
                    int i69 = a;
                    int i70 = i69 & 107;
                    int i71 = (i69 ^ 107) | i70;
                    int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                    while (!(!it.hasNext())) {
                        int i74 = a;
                        int i75 = i74 & 1;
                        int i76 = (((i74 ^ 1) | i75) << 1) - ((~i75) & (i74 | 1));
                        b = i76 % 128;
                        int i77 = i76 % 2;
                        ResolveInfo next = it.next();
                        int i78 = a;
                        int i79 = i78 ^ 117;
                        int i80 = ((i78 & 117) | i79) << 1;
                        int i81 = -i79;
                        int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                        b = i82 % 128;
                        int i83 = i82 % 2;
                        if (!context.getPackageName().equals(next.activityInfo.packageName)) {
                            int i84 = b;
                            int i85 = i84 & 55;
                            int i86 = ((((i84 ^ 55) | i85) << 1) - (~(-((~i85) & (i84 | 55))))) - 1;
                            a = i86 % 128;
                            if (i86 % 2 == 0) {
                                boolean z = next.activityInfo.exported;
                                th.hashCode();
                                throw null;
                            }
                            ActivityInfo activityInfo = next.activityInfo;
                            if (activityInfo.exported) {
                                int i87 = b;
                                int i88 = i87 & 107;
                                int i89 = -(-((i87 ^ 107) | i88));
                                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                                a = i90 % 128;
                                if (i90 % 2 == 0) {
                                    String str = activityInfo.permission;
                                    throw null;
                                }
                                String str2 = activityInfo.permission;
                                if (str2 != null) {
                                    int i91 = b + 5;
                                    a = i91 % 128;
                                    if (i91 % 2 == 0) {
                                        context.checkSelfPermission(str2);
                                        throw null;
                                    }
                                    if (context.checkSelfPermission(str2) != 0) {
                                    }
                                }
                                int i92 = a;
                                int i93 = i92 & 73;
                                int i94 = (i92 ^ 73) | i93;
                                int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                                b = i95 % 128;
                                int i96 = i95 % 2;
                                i5 = i92 + 43;
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    arrayList.add(next);
                                    throw null;
                                }
                                arrayList.add(next);
                            }
                            int i97 = a;
                            int i98 = i97 & 49;
                            int i99 = i98 + ((i97 ^ 49) | i98);
                            b = i99 % 128;
                            int i100 = i99 % 2;
                        } else {
                            int i910 = a;
                            int i911 = i910 & 73;
                            int i912 = (i910 ^ 73) | i911;
                            int i913 = ((i911 | i912) << 1) - (i911 ^ i912);
                            b = i913 % 128;
                            int i914 = i913 % 2;
                            i5 = i910 + 43;
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                arrayList.add(next);
                                throw null;
                            }
                            arrayList.add(next);
                        }
                    }
                }
                int i101 = a + 109;
                b = i101 % 128;
                if (i101 % 2 != 0) {
                    int i102 = 3 % 5;
                }
                int i103 = 0;
                while (i103 < arrayList.size()) {
                    int i104 = a;
                    int i105 = i104 & 35;
                    int i106 = (i104 | 35) & (~i105);
                    int i107 = i105 << 1;
                    int i108 = (i106 & i107) + (i106 | i107);
                    b = i108 % 128;
                    if (i108 % 2 != 0) {
                        Throwable th2 = th;
                        th2.hashCode();
                        throw th2;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i103);
                    int i109 = a;
                    int i114 = i109 & 117;
                    int i115 = i109 | 117;
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    b = i116 % 128;
                    if (i116 % 2 != 0) {
                        charSequenceLoadLabel = resolveInfo.loadLabel(packageManager);
                        i = 14;
                        i2 = 1;
                        i3 = 1;
                    } else {
                        charSequenceLoadLabel = resolveInfo.loadLabel(packageManager);
                        i = 100;
                        i2 = 0;
                        i3 = 0;
                    }
                    int i117 = a;
                    int i118 = (i117 & 95) + (i117 | 95);
                    b = i118 % 128;
                    int i119 = i118 % 2;
                    int i120 = -(-i);
                    MenuItem menuItemAdd = menu.add(i2, i3, (i103 & i120) + (i120 | i103), charSequenceLoadLabel);
                    TextView textView = this.d;
                    Intent action = new Intent().setAction("android.intent.action.PROCESS_TEXT");
                    int i121 = b;
                    int i122 = ((i121 | 82) << 1) - (i121 ^ 82);
                    int i123 = (i122 ^ (-1)) + (i122 << 1);
                    a = i123 % 128;
                    int i124 = i123 % 2;
                    Intent type2 = action.setType("text/plain");
                    if (textView instanceof Editable) {
                        int i125 = a;
                        int i126 = ((i125 | 33) << 1) - (i125 ^ 33);
                        b = i126 % 128;
                        if (i126 % 2 != 0) {
                            textView.onCheckIsTextEditor();
                            throw null;
                        }
                        if (!textView.onCheckIsTextEditor()) {
                            int i127 = a;
                            int i128 = i127 ^ 111;
                            int i129 = ((i127 & 111) | i128) << 1;
                            int i130 = -i128;
                            int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
                            b = i131 % 128;
                            int i132 = i131 % 2;
                            i4 = 0;
                        } else {
                            int i133 = a;
                            int i134 = i133 & 87;
                            int i135 = ((i133 ^ 87) | i134) << 1;
                            int i136 = -((i133 | 87) & (~i134));
                            int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                            b = i137 % 128;
                            int i138 = i137 % 2;
                            if (!(!textView.isEnabled())) {
                                int i139 = b;
                                int i140 = (i139 ^ 45) + ((i139 & 45) << 1);
                                a = i140 % 128;
                                int i141 = i140 % 2;
                                int i142 = ((i139 | 17) << 1) - (i139 ^ 17);
                                a = i142 % 128;
                                int i143 = i142 % 2;
                                i4 = 1;
                            } else {
                                int i1210 = a;
                                int i1211 = i1210 ^ 111;
                                int i1212 = ((i1210 & 111) | i1211) << 1;
                                int i1310 = -i1211;
                                int i1311 = (i1212 ^ i1310) + ((i1212 & i1310) << 1);
                                b = i1311 % 128;
                                int i1312 = i1311 % 2;
                                i4 = 0;
                            }
                        }
                    } else {
                        int i1213 = a;
                        int i1214 = i1213 ^ 111;
                        int i1215 = ((i1213 & 111) | i1214) << 1;
                        int i1313 = -i1214;
                        int i1314 = (i1215 ^ i1313) + ((i1215 & i1313) << 1);
                        b = i1314 % 128;
                        int i1315 = i1314 % 2;
                        i4 = 0;
                    }
                    int i144 = i4 & 1;
                    Intent intentPutExtra = type2.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", ((i4 ^ 1) | i144) & (~i144));
                    int i145 = b + 80;
                    int i146 = (i145 ^ (-1)) + (i145 << 1);
                    a = i146 % 128;
                    if (i146 % 2 == 0) {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        String str3 = activityInfo2.packageName;
                        String str4 = activityInfo2.name;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                    Intent className = intentPutExtra.setClassName(activityInfo3.packageName, activityInfo3.name);
                    int i147 = a;
                    int i148 = ((i147 & (-102)) | ((~i147) & 101)) + ((i147 & 101) << 1);
                    b = i148 % 128;
                    int i149 = i148 % 2;
                    menuItemAdd.setIntent(className).setShowAsAction(1);
                    int i150 = i103 & (-91);
                    int i151 = i103 | (-91);
                    int i152 = (i150 & i151) + (i150 | i151);
                    int i153 = i152 & 92;
                    i103 = ((~i153) & (i152 | 92)) + (i153 << 1);
                    int i154 = b;
                    int i155 = i154 & 95;
                    int i156 = (((i154 | 95) & (~i155)) - (~(-(-(i155 << 1))))) - 1;
                    a = i156 % 128;
                    int i157 = i156 % 2;
                    th = null;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            boolean zOnPrepareActionMode = this.c.onPrepareActionMode(actionMode, menu);
            int i158 = b;
            int i159 = (i158 & 109) + (i158 | 109);
            a = i159 % 128;
            if (i159 % 2 != 0) {
                return zOnPrepareActionMode;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007e A[PHI: r6 r7
  0x007e: PHI (r6v9 int) = (r6v8 int), (r6v12 int) binds: [B:14:0x007c, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r7v5 int) = (r7v4 int), (r7v8 int) binds: [B:14:0x007c, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x008b A[DONT_INVERT, PHI: r6 r7
  0x008b: PHI (r6v11 int) = (r6v8 int), (r6v12 int) binds: [B:14:0x007c, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r7v7 int) = (r7v4 int), (r7v8 int) binds: [B:14:0x007c, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0130  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:46:0x0173  */
    /* JADX WARN: Code duplicated, block: B:47:0x018f  */
    /* JADX WARN: Code duplicated, block: B:49:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f2  */
    public static V.aWg b(TextView textView) {
        int breakStrategy;
        int hyphenationFrequency;
        TextDirectionHeuristic textDirectionHeuristic;
        int i;
        int i2;
        int i3;
        int i4;
        byte directionality;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = (i10 ^ 95) + ((i10 & 95) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i13 >= 28) {
            V.aWg awg = new V.aWg(textView.getTextMetricsParams());
            int i14 = b;
            int i15 = i14 & 97;
            int i16 = ((i14 ^ 97) | i15) << 1;
            int i17 = -((i14 | 97) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 74 / 0;
            }
            return awg;
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        int i20 = a;
        int i21 = i20 & 17;
        int i22 = (i21 - (~(-(-((i20 ^ 17) | i21))))) - 1;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            breakStrategy = textView.getBreakStrategy();
            hyphenationFrequency = textView.getHyphenationFrequency();
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                int i23 = b + 121;
                a = i23 % 128;
                int i24 = i23 % 2;
            } else if (i13 >= 28) {
                if (textView.getLayoutDirection() == 1) {
                    int i25 = a;
                    int i26 = ((i25 ^ 19) | (i25 & 19)) << 1;
                    int i27 = -((i25 & (-20)) | ((~i25) & 19));
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = ((i25 | 84) << 1) - (i25 ^ 84);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        int i33 = b;
                        int i34 = i33 ^ 23;
                        int i35 = (i33 & 23) << 1;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        int i38 = a;
                        int i39 = i38 ^ 67;
                        int i40 = ((i38 & 67) | i39) << 1;
                        int i41 = -i39;
                        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        int i44 = a + 75;
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        int i46 = b + 11;
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        int i48 = b;
                        i = (i48 & 31) + (i48 | 31);
                        i2 = i % 128;
                        a = i2;
                        int i49 = i % 2;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        int i50 = b;
                        int i51 = (i50 | 69) << 1;
                        int i52 = -(((~i50) & 69) | (i50 & (-70)));
                        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            int i55 = b;
                            int i56 = ((i55 & 47) - (~(-(-(i55 | 47))))) - 1;
                            a = i56 % 128;
                            int i57 = i56 % 2;
                        } else {
                            int i58 = a + 3;
                            b = i58 % 128;
                            int i59 = i58 % 2;
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            int i60 = b;
                            int i61 = i60 & 53;
                            int i62 = i60 | 53;
                            int i63 = (i61 & i62) + (i62 | i61);
                            a = i63 % 128;
                            int i64 = i63 % 2;
                        }
                        break;
                }
            } else {
                int i65 = b;
                int i66 = (i65 & (-86)) | ((~i65) & 85);
                int i67 = -(-((i65 & 85) << 1));
                i3 = (i66 & i67) + (i67 | i66);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int inputType = textView.getInputType();
                    i7 = inputType & 9;
                    i8 = (inputType | 9) & (~i7);
                    if (((i8 & i7) | (i8 ^ i7)) == 4) {
                        if (textView.getLayoutDirection() == 1) {
                            int i210 = a;
                            int i211 = ((i210 ^ 19) | (i210 & 19)) << 1;
                            int i212 = -((i210 & (-20)) | ((~i210) & 19));
                            int i213 = (i211 ^ i212) + ((i211 & i212) << 1);
                            b = i213 % 128;
                            int i214 = i213 % 2;
                            int i310 = ((i210 | 84) << 1) - (i210 ^ 84);
                            int i311 = (i310 ^ (-1)) + (i310 << 1);
                            b = i311 % 128;
                            int i312 = i311 % 2;
                            z = true;
                        }
                        switch (textView.getTextDirection()) {
                            case 2:
                                textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                                int i313 = b;
                                int i314 = i313 ^ 23;
                                int i315 = (i313 & 23) << 1;
                                int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                                a = i316 % 128;
                                int i317 = i316 % 2;
                                break;
                            case 3:
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i318 = a;
                                int i319 = i318 ^ 67;
                                int i410 = ((i318 & 67) | i319) << 1;
                                int i411 = -i319;
                                int i412 = (i410 ^ i411) + ((i410 & i411) << 1);
                                b = i412 % 128;
                                int i413 = i412 % 2;
                                break;
                            case 4:
                                textDirectionHeuristic = TextDirectionHeuristics.RTL;
                                int i414 = a + 75;
                                b = i414 % 128;
                                int i415 = i414 % 2;
                                break;
                            case 5:
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                                int i416 = b + 11;
                                a = i416 % 128;
                                int i417 = i416 % 2;
                                break;
                            case 6:
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                int i418 = b;
                                i = (i418 & 31) + (i418 | 31);
                                i2 = i % 128;
                                a = i2;
                                int i419 = i % 2;
                                break;
                            case 7:
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                int i510 = b;
                                int i511 = (i510 | 69) << 1;
                                int i512 = -(((~i510) & 69) | (i510 & (-70)));
                                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                                a = i513 % 128;
                                int i514 = i513 % 2;
                                break;
                            default:
                                if (z) {
                                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                    int i515 = b;
                                    int i516 = ((i515 & 47) - (~(-(-(i515 | 47))))) - 1;
                                    a = i516 % 128;
                                    int i517 = i516 % 2;
                                } else {
                                    int i518 = a + 3;
                                    b = i518 % 128;
                                    int i519 = i518 % 2;
                                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                    int i68 = b;
                                    int i69 = i68 & 53;
                                    int i610 = i68 | 53;
                                    int i611 = (i69 & i610) + (i610 | i69);
                                    a = i611 % 128;
                                    int i612 = i611 % 2;
                                }
                                break;
                        }
                    } else {
                        String[] digitStrings = DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings();
                        int i70 = a;
                        i4 = (i70 & 89) + (i70 | 89);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i71 = a;
                            int i72 = i71 & 3;
                            int i73 = (i72 - (~((3 ^ i71) | i72))) - 1;
                            i5 = i73 % 128;
                            b = i5;
                            int i74 = i73 % 2;
                            if (directionality != 2) {
                                int i75 = i5 & 79;
                                int i76 = -(-((i5 ^ 79) | i75));
                                i6 = ((i75 | i76) << 1) - (i75 ^ i76);
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                    int i77 = 91 / 0;
                                } else {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                }
                            }
                        } else {
                            int i78 = a;
                            int i79 = i78 & 3;
                            int i710 = (i79 - (~((3 ^ i78) | i79))) - 1;
                            i5 = i710 % 128;
                            b = i5;
                            int i711 = i710 % 2;
                            if (directionality != 2) {
                                int i712 = i5 & 79;
                                int i713 = -(-((i5 ^ 79) | i712));
                                i6 = ((i712 | i713) << 1) - (i712 ^ i713);
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                    int i714 = 91 / 0;
                                } else {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                }
                            }
                        }
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        int i80 = b;
                        i = (i80 & 71) + (i80 | 71);
                        i2 = i % 128;
                        a = i2;
                        int i4110 = i % 2;
                    }
                } else if ((textView.getInputType() & 15) == 3) {
                    if (textView.getLayoutDirection() == 1) {
                        int i215 = a;
                        int i216 = ((i215 ^ 19) | (i215 & 19)) << 1;
                        int i217 = -((i215 & (-20)) | ((~i215) & 19));
                        int i218 = (i216 ^ i217) + ((i216 & i217) << 1);
                        b = i218 % 128;
                        int i219 = i218 % 2;
                        int i3110 = ((i215 | 84) << 1) - (i215 ^ 84);
                        int i3111 = (i3110 ^ (-1)) + (i3110 << 1);
                        b = i3111 % 128;
                        int i3112 = i3111 % 2;
                        z = true;
                    }
                    switch (textView.getTextDirection()) {
                        case 2:
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            int i3113 = b;
                            int i3114 = i3113 ^ 23;
                            int i3115 = (i3113 & 23) << 1;
                            int i3116 = ((i3114 | i3115) << 1) - (i3115 ^ i3114);
                            a = i3116 % 128;
                            int i3117 = i3116 % 2;
                            break;
                        case 3:
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            int i3118 = a;
                            int i3119 = i3118 ^ 67;
                            int i4111 = ((i3118 & 67) | i3119) << 1;
                            int i4112 = -i3119;
                            int i4113 = (i4111 ^ i4112) + ((i4111 & i4112) << 1);
                            b = i4113 % 128;
                            int i4114 = i4113 % 2;
                            break;
                        case 4:
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            int i4115 = a + 75;
                            b = i4115 % 128;
                            int i4116 = i4115 % 2;
                            break;
                        case 5:
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            int i4117 = b + 11;
                            a = i4117 % 128;
                            int i4118 = i4117 % 2;
                            break;
                        case 6:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            int i4119 = b;
                            i = (i4119 & 31) + (i4119 | 31);
                            i2 = i % 128;
                            a = i2;
                            int i41110 = i % 2;
                            break;
                        case 7:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            int i5110 = b;
                            int i5111 = (i5110 | 69) << 1;
                            int i5112 = -(((~i5110) & 69) | (i5110 & (-70)));
                            int i5113 = ((i5111 | i5112) << 1) - (i5112 ^ i5111);
                            a = i5113 % 128;
                            int i5114 = i5113 % 2;
                            break;
                        default:
                            if (z) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                int i5115 = b;
                                int i5116 = ((i5115 & 47) - (~(-(-(i5115 | 47))))) - 1;
                                a = i5116 % 128;
                                int i5117 = i5116 % 2;
                            } else {
                                int i5118 = a + 3;
                                b = i5118 % 128;
                                int i5119 = i5118 % 2;
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                int i613 = b;
                                int i614 = i613 & 53;
                                int i615 = i613 | 53;
                                int i616 = (i614 & i615) + (i615 | i614);
                                a = i616 % 128;
                                int i617 = i616 % 2;
                            }
                            break;
                    }
                } else {
                    String[] digitStrings2 = DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings();
                    int i715 = a;
                    i4 = (i715 & 89) + (i715 | 89);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i716 = a;
                        int i717 = i716 & 3;
                        int i718 = (i717 - (~((3 ^ i716) | i717))) - 1;
                        i5 = i718 % 128;
                        b = i5;
                        int i719 = i718 % 2;
                        if (directionality != 2) {
                            int i7110 = i5 & 79;
                            int i7111 = -(-((i5 ^ 79) | i7110));
                            i6 = ((i7110 | i7111) << 1) - (i7110 ^ i7111);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i7112 = 91 / 0;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            }
                        }
                    } else {
                        int i7113 = a;
                        int i7114 = i7113 & 3;
                        int i7115 = (i7114 - (~((3 ^ i7113) | i7114))) - 1;
                        i5 = i7115 % 128;
                        b = i5;
                        int i7116 = i7115 % 2;
                        if (directionality != 2) {
                            int i7117 = i5 & 79;
                            int i7118 = -(-((i5 ^ 79) | i7117));
                            i6 = ((i7117 | i7118) << 1) - (i7117 ^ i7118);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i7119 = 91 / 0;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            }
                        }
                    }
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    int i81 = b;
                    i = (i81 & 71) + (i81 | 71);
                    i2 = i % 128;
                    a = i2;
                    int i41111 = i % 2;
                }
            }
        } else {
            breakStrategy = textView.getBreakStrategy();
            hyphenationFrequency = textView.getHyphenationFrequency();
            int i82 = 79 / 0;
            if (!(!(textView.getTransformationMethod() instanceof PasswordTransformationMethod))) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                int i220 = b + 121;
                a = i220 % 128;
                int i221 = i220 % 2;
            } else if (i13 >= 28) {
                if (textView.getLayoutDirection() == 1) {
                    int i2110 = a;
                    int i2111 = ((i2110 ^ 19) | (i2110 & 19)) << 1;
                    int i2112 = -((i2110 & (-20)) | ((~i2110) & 19));
                    int i2113 = (i2111 ^ i2112) + ((i2111 & i2112) << 1);
                    b = i2113 % 128;
                    int i2114 = i2113 % 2;
                    int i31110 = ((i2110 | 84) << 1) - (i2110 ^ 84);
                    int i31111 = (i31110 ^ (-1)) + (i31110 << 1);
                    b = i31111 % 128;
                    int i31112 = i31111 % 2;
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        int i31113 = b;
                        int i31114 = i31113 ^ 23;
                        int i31115 = (i31113 & 23) << 1;
                        int i31116 = ((i31114 | i31115) << 1) - (i31115 ^ i31114);
                        a = i31116 % 128;
                        int i31117 = i31116 % 2;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        int i31118 = a;
                        int i31119 = i31118 ^ 67;
                        int i41112 = ((i31118 & 67) | i31119) << 1;
                        int i41113 = -i31119;
                        int i41114 = (i41112 ^ i41113) + ((i41112 & i41113) << 1);
                        b = i41114 % 128;
                        int i41115 = i41114 % 2;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        int i41116 = a + 75;
                        b = i41116 % 128;
                        int i41117 = i41116 % 2;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        int i41118 = b + 11;
                        a = i41118 % 128;
                        int i41119 = i41118 % 2;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        int i41120 = b;
                        i = (i41120 & 31) + (i41120 | 31);
                        i2 = i % 128;
                        a = i2;
                        int i411110 = i % 2;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        int i51110 = b;
                        int i51111 = (i51110 | 69) << 1;
                        int i51112 = -(((~i51110) & 69) | (i51110 & (-70)));
                        int i51113 = ((i51111 | i51112) << 1) - (i51112 ^ i51111);
                        a = i51113 % 128;
                        int i51114 = i51113 % 2;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            int i51115 = b;
                            int i51116 = ((i51115 & 47) - (~(-(-(i51115 | 47))))) - 1;
                            a = i51116 % 128;
                            int i51117 = i51116 % 2;
                        } else {
                            int i51118 = a + 3;
                            b = i51118 % 128;
                            int i51119 = i51118 % 2;
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            int i618 = b;
                            int i619 = i618 & 53;
                            int i6110 = i618 | 53;
                            int i6111 = (i619 & i6110) + (i6110 | i619);
                            a = i6111 % 128;
                            int i6112 = i6111 % 2;
                        }
                        break;
                }
            } else {
                int i620 = b;
                int i621 = (i620 & (-86)) | ((~i620) & 85);
                int i622 = -(-((i620 & 85) << 1));
                i3 = (i621 & i622) + (i622 | i621);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int inputType2 = textView.getInputType();
                    i7 = inputType2 & 9;
                    i8 = (inputType2 | 9) & (~i7);
                    if (((i8 & i7) | (i8 ^ i7)) == 4) {
                        if (textView.getLayoutDirection() == 1) {
                            int i2115 = a;
                            int i2116 = ((i2115 ^ 19) | (i2115 & 19)) << 1;
                            int i2117 = -((i2115 & (-20)) | ((~i2115) & 19));
                            int i2118 = (i2116 ^ i2117) + ((i2116 & i2117) << 1);
                            b = i2118 % 128;
                            int i2119 = i2118 % 2;
                            int i311110 = ((i2115 | 84) << 1) - (i2115 ^ 84);
                            int i311111 = (i311110 ^ (-1)) + (i311110 << 1);
                            b = i311111 % 128;
                            int i311112 = i311111 % 2;
                            z = true;
                        }
                        switch (textView.getTextDirection()) {
                            case 2:
                                textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                                int i311113 = b;
                                int i311114 = i311113 ^ 23;
                                int i311115 = (i311113 & 23) << 1;
                                int i311116 = ((i311114 | i311115) << 1) - (i311115 ^ i311114);
                                a = i311116 % 128;
                                int i311117 = i311116 % 2;
                                break;
                            case 3:
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i311118 = a;
                                int i311119 = i311118 ^ 67;
                                int i411111 = ((i311118 & 67) | i311119) << 1;
                                int i411112 = -i311119;
                                int i411113 = (i411111 ^ i411112) + ((i411111 & i411112) << 1);
                                b = i411113 % 128;
                                int i411114 = i411113 % 2;
                                break;
                            case 4:
                                textDirectionHeuristic = TextDirectionHeuristics.RTL;
                                int i411115 = a + 75;
                                b = i411115 % 128;
                                int i411116 = i411115 % 2;
                                break;
                            case 5:
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                                int i411117 = b + 11;
                                a = i411117 % 128;
                                int i411118 = i411117 % 2;
                                break;
                            case 6:
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                int i41121 = b;
                                i = (i41121 & 31) + (i41121 | 31);
                                i2 = i % 128;
                                a = i2;
                                int i411119 = i % 2;
                                break;
                            case 7:
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                int i511110 = b;
                                int i511111 = (i511110 | 69) << 1;
                                int i511112 = -(((~i511110) & 69) | (i511110 & (-70)));
                                int i511113 = ((i511111 | i511112) << 1) - (i511112 ^ i511111);
                                a = i511113 % 128;
                                int i511114 = i511113 % 2;
                                break;
                            default:
                                if (z) {
                                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                    int i511115 = b;
                                    int i511116 = ((i511115 & 47) - (~(-(-(i511115 | 47))))) - 1;
                                    a = i511116 % 128;
                                    int i511117 = i511116 % 2;
                                } else {
                                    int i511118 = a + 3;
                                    b = i511118 % 128;
                                    int i511119 = i511118 % 2;
                                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                    int i6113 = b;
                                    int i6114 = i6113 & 53;
                                    int i6115 = i6113 | 53;
                                    int i6116 = (i6114 & i6115) + (i6115 | i6114);
                                    a = i6116 % 128;
                                    int i6117 = i6116 % 2;
                                }
                                break;
                        }
                    } else {
                        String[] digitStrings3 = DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings();
                        int i7120 = a;
                        i4 = (i7120 & 89) + (i7120 | 89);
                        b = i4 % 128;
                        if (i4 % 2 != 0 ? (directionality = Character.getDirectionality(digitStrings3[0].codePointAt(0))) != 1 : (directionality = Character.getDirectionality(digitStrings3[0].codePointAt(0))) != 1) {
                            int i71110 = a;
                            int i71111 = i71110 & 3;
                            int i71112 = (i71111 - (~((3 ^ i71110) | i71111))) - 1;
                            i5 = i71112 % 128;
                            b = i5;
                            int i71113 = i71112 % 2;
                            if (directionality != 2) {
                                int i71114 = i5 & 79;
                                int i71115 = -(-((i5 ^ 79) | i71114));
                                i6 = ((i71114 | i71115) << 1) - (i71114 ^ i71115);
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                    int i71116 = 91 / 0;
                                } else {
                                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                }
                            }
                        }
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        int i83 = b;
                        i = (i83 & 71) + (i83 | 71);
                        i2 = i % 128;
                        a = i2;
                        int i4111110 = i % 2;
                    }
                } else if ((textView.getInputType() & 15) == 3) {
                    if (textView.getLayoutDirection() == 1) {
                        int i21110 = a;
                        int i21111 = ((i21110 ^ 19) | (i21110 & 19)) << 1;
                        int i21112 = -((i21110 & (-20)) | ((~i21110) & 19));
                        int i21113 = (i21111 ^ i21112) + ((i21111 & i21112) << 1);
                        b = i21113 % 128;
                        int i21114 = i21113 % 2;
                        int i3111110 = ((i21110 | 84) << 1) - (i21110 ^ 84);
                        int i3111111 = (i3111110 ^ (-1)) + (i3111110 << 1);
                        b = i3111111 % 128;
                        int i3111112 = i3111111 % 2;
                        z = true;
                    }
                    switch (textView.getTextDirection()) {
                        case 2:
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            int i3111113 = b;
                            int i3111114 = i3111113 ^ 23;
                            int i3111115 = (i3111113 & 23) << 1;
                            int i3111116 = ((i3111114 | i3111115) << 1) - (i3111115 ^ i3111114);
                            a = i3111116 % 128;
                            int i3111117 = i3111116 % 2;
                            break;
                        case 3:
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            int i3111118 = a;
                            int i3111119 = i3111118 ^ 67;
                            int i4111111 = ((i3111118 & 67) | i3111119) << 1;
                            int i4111112 = -i3111119;
                            int i4111113 = (i4111111 ^ i4111112) + ((i4111111 & i4111112) << 1);
                            b = i4111113 % 128;
                            int i4111114 = i4111113 % 2;
                            break;
                        case 4:
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            int i4111115 = a + 75;
                            b = i4111115 % 128;
                            int i4111116 = i4111115 % 2;
                            break;
                        case 5:
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            int i4111117 = b + 11;
                            a = i4111117 % 128;
                            int i4111118 = i4111117 % 2;
                            break;
                        case 6:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            int i41122 = b;
                            i = (i41122 & 31) + (i41122 | 31);
                            i2 = i % 128;
                            a = i2;
                            int i4111119 = i % 2;
                            break;
                        case 7:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            int i5111110 = b;
                            int i5111111 = (i5111110 | 69) << 1;
                            int i5111112 = -(((~i5111110) & 69) | (i5111110 & (-70)));
                            int i5111113 = ((i5111111 | i5111112) << 1) - (i5111112 ^ i5111111);
                            a = i5111113 % 128;
                            int i5111114 = i5111113 % 2;
                            break;
                        default:
                            if (z) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                int i5111115 = b;
                                int i5111116 = ((i5111115 & 47) - (~(-(-(i5111115 | 47))))) - 1;
                                a = i5111116 % 128;
                                int i5111117 = i5111116 % 2;
                            } else {
                                int i5111118 = a + 3;
                                b = i5111118 % 128;
                                int i5111119 = i5111118 % 2;
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                int i6118 = b;
                                int i6119 = i6118 & 53;
                                int i61110 = i6118 | 53;
                                int i61111 = (i6119 & i61110) + (i61110 | i6119);
                                a = i61111 % 128;
                                int i61112 = i61111 % 2;
                            }
                            break;
                    }
                } else {
                    String[] digitStrings4 = DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings();
                    int i7121 = a;
                    i4 = (i7121 & 89) + (i7121 | 89);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i71117 = a;
                        int i71118 = i71117 & 3;
                        int i71119 = (i71118 - (~((3 ^ i71117) | i71118))) - 1;
                        i5 = i71119 % 128;
                        b = i5;
                        int i711110 = i71119 % 2;
                        if (directionality != 2) {
                            int i711111 = i5 & 79;
                            int i711112 = -(-((i5 ^ 79) | i711111));
                            i6 = ((i711111 | i711112) << 1) - (i711111 ^ i711112);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i711113 = 91 / 0;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            }
                        }
                    } else {
                        int i711114 = a;
                        int i711115 = i711114 & 3;
                        int i711116 = (i711115 - (~((3 ^ i711114) | i711115))) - 1;
                        i5 = i711116 % 128;
                        b = i5;
                        int i711117 = i711116 % 2;
                        if (directionality != 2) {
                            int i711118 = i5 & 79;
                            int i711119 = -(-((i5 ^ 79) | i711118));
                            i6 = ((i711118 | i711119) << 1) - (i711118 ^ i711119);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                                int i7111110 = 91 / 0;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            }
                        }
                    }
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    int i84 = b;
                    i = (i84 & 71) + (i84 | 71);
                    i2 = i % 128;
                    a = i2;
                    int i41111110 = i % 2;
                }
            }
        }
        V.aWg awg2 = new V.aWg(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
        int i85 = a;
        int i86 = i85 & 89;
        int i87 = -(-((i85 ^ 89) | i86));
        int i88 = (i86 & i87) + (i87 | i86);
        b = i88 % 128;
        int i89 = i88 % 2;
        return awg2;
    }
}
