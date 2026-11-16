package ivas.gov.bisp.enumeration.F;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import ivas.gov.bisp.enumeration.OoooOoO.o00;
import ivas.gov.bisp.enumeration.p027b.d;

/* JADX INFO: loaded from: classes.dex */
public class L extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private static int a = 0;
    private static int b = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private o00<d> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public class aYV implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public aYV() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterface.OnDismissListener onDismissListenerAccess$100;
            Dialog dialogAccess$000;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 55;
            int i4 = ((i2 | 55) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                onDismissListenerAccess$100 = L.access$100(L.this);
                dialogAccess$000 = L.access$000(L.this);
                int i5 = 46 / 0;
            } else {
                onDismissListenerAccess$100 = L.access$100(L.this);
                dialogAccess$000 = L.access$000(L.this);
            }
            onDismissListenerAccess$100.onDismiss(dialogAccess$000);
            int i6 = a;
            int i7 = i6 ^ 105;
            int i8 = (((i6 & 105) | i7) << 1) - i7;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class aYW implements DialogInterface.OnCancelListener {
        private static int a = 0;
        private static int b = 1;

        public aYW() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = a + 33;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (L.access$000(L.this) != null) {
                int i4 = b;
                int i5 = (((i4 | 122) << 1) - (i4 ^ 122)) - 1;
                a = i5 % 128;
                int i6 = i5 % 2;
                L l = L.this;
                l.onCancel(L.access$000(l));
                int i7 = b;
                int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = a;
            int i11 = i10 & 27;
            int i12 = -(-((i10 ^ 27) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public class aYX implements DialogInterface.OnDismissListener {
        private static int a = 0;
        private static int b = 1;

        public aYX() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0042  */
        /* JADX WARN: Code duplicated, block: B:11:0x005f  */
        /* JADX WARN: Code duplicated, block: B:8:0x002d  */
        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((((i3 ^ 13) | (i3 & 13)) << 1) - (~(-(((~i3) & 13) | (i3 & (-14)))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            Dialog dialogAccess$000 = L.access$000(L.this);
            if (i5 != 0) {
                int i6 = 30 / 0;
                if (dialogAccess$000 != null) {
                    int i7 = a;
                    int i8 = i7 ^ 17;
                    int i9 = ((i7 & 17) | i8) << 1;
                    int i10 = -i8;
                    i = (i9 & i10) + (i9 | i10);
                    b = i % 128;
                    if (i % 2 != 0) {
                        L l = L.this;
                        l.onDismiss(L.access$000(l));
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    L l2 = L.this;
                    l2.onDismiss(L.access$000(l2));
                    int i11 = b;
                    int i12 = (i11 ^ 110) + ((i11 & 110) << 1);
                    int i13 = (i12 ^ (-1)) + (i12 << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else if (dialogAccess$000 != null) {
                int i15 = a;
                int i16 = i15 ^ 17;
                int i17 = ((i15 & 17) | i16) << 1;
                int i18 = -i16;
                i = (i17 & i18) + (i17 | i18);
                b = i % 128;
                if (i % 2 != 0) {
                    L l3 = L.this;
                    l3.onDismiss(L.access$000(l3));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                L l4 = L.this;
                l4.onDismiss(L.access$000(l4));
                int i19 = b;
                int i110 = (i19 ^ 110) + ((i19 & 110) << 1);
                int i111 = (i110 ^ (-1)) + (i110 << 1);
                a = i111 % 128;
                int i112 = i111 % 2;
            }
            int i20 = a;
            int i21 = ((i20 & 73) - (~(-(-(i20 | 73))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
        }
    }

    public class aYZ implements o00<d> {
        public aYZ() {
        }
    }

    public class aZa extends A {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ A c;

        public aZa(A a2) {
            this.c = a2;
        }

        @Override // ivas.gov.bisp.enumeration.F.A
        public View c(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 ^ 109) | (i3 & 109)) << 1) - (((~i3) & 109) | (i3 & (-110)));
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                this.c.d();
                obj.hashCode();
                throw null;
            }
            if (!this.c.d()) {
                View viewOnFindViewById = L.this.onFindViewById(i);
                int i5 = a;
                int i6 = (i5 ^ 67) + ((i5 & 67) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                return viewOnFindViewById;
            }
            int i8 = b;
            int i9 = i8 ^ 115;
            int i10 = (i8 & 115) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            A a2 = this.c;
            if (i12 != 0) {
                return a2.c(i);
            }
            a2.c(i);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x004e  */
        @Override // ivas.gov.bisp.enumeration.F.A
        public boolean d() {
            int i = 2 % 2;
            int i2 = a;
            boolean z = true;
            int i3 = ((i2 ^ 109) | (i2 & 109)) << 1;
            int i4 = -(((~i2) & 109) | (i2 & (-110)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                this.c.d();
                throw null;
            }
            if (this.c.d()) {
                int i6 = b + 119;
                a = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = a + 104;
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                if (!L.this.onHasView()) {
                    int i11 = b;
                    int i12 = i11 ^ 21;
                    int i13 = (((i11 & 21) | i12) << 1) - i12;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                } else {
                    int i15 = b + 119;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            int i17 = a;
            int i18 = (i17 & 13) + (i17 | 13);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }
    }

    public L() {
        this.mDismissRunnable = new aYV();
        this.mOnCancelListener = new aYW();
        this.mOnDismissListener = new aYX();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new aYZ();
        this.mDialogCreated = false;
    }

    public static /* synthetic */ Dialog access$000(L l) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 35;
        int i4 = ((i2 & 35) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Dialog dialog = l.mDialog;
        if (i8 == 0) {
            int i9 = 21 / 0;
        }
        int i10 = ((i7 & 106) + (i7 | 106)) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return dialog;
        }
        throw null;
    }

    public static /* synthetic */ DialogInterface.OnDismissListener access$100(L l) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 71) << 1) - (~(-(i2 ^ 71)))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        DialogInterface.OnDismissListener onDismissListener = l.mOnDismissListener;
        int i6 = i4 & 13;
        int i7 = ((i4 ^ 13) | i6) << 1;
        int i8 = -((i4 | 13) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return onDismissListener;
        }
        throw null;
    }

    public static /* synthetic */ boolean access$200(L l) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = -(-((i2 ^ 1) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        boolean z = l.mShowsDialog;
        int i8 = ((i6 | 55) << 1) - (i6 ^ 55);
        b = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    public void dismiss() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = (i3 - (~(-(-((i2 ^ 37) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            dismissInternal(false, true);
        } else {
            dismissInternal(false, false);
        }
        int i5 = a;
        int i6 = i5 & 105;
        int i7 = (i5 | 105) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void dismissAllowingStateLoss() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 13) + (i2 | 13);
        b = i3 % 128;
        int i4 = i3 % 2;
        dismissInternal(true, false);
        int i5 = a;
        int i6 = i5 & 37;
        int i7 = ((((i5 ^ 37) | i6) << 1) - (~(-((i5 | 37) & (~i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public Dialog getDialog() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 87) << 1;
        int i4 = -(((~i2) & 87) | (i2 & (-88)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.mDialog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean getShowsDialog() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 37) - (~(-(-((i2 & 37) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.mShowsDialog;
        int i5 = ((i2 & 41) - (~(-(-(i2 | 41))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public int getTheme() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = (i2 | 89) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.mTheme;
        int i10 = (i7 & (-58)) | ((~i7) & 57);
        int i11 = -(-((i7 & 57) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        int i13 = i12 % 2;
        return i9;
    }

    public boolean isCancelable() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        boolean z = this.mCancelable;
        int i6 = (-2) - (((i4 & 54) + (i4 | 54)) ^ (-1));
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = a + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.mObserver);
        int i4 = a;
        int i5 = i4 | 13;
        int i6 = (i5 << 1) - ((~(i4 & 13)) & i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (!this.mShownByMe) {
            int i9 = (i7 & 91) + (i7 | 91);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.mDismissed = false;
            int i11 = i7 & 107;
            int i12 = i11 + ((i7 ^ 107) | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = i14 & 21;
        int i16 = (i14 ^ 21) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    public void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 24) << 1) - (i2 ^ 24);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = b + 52;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.mViewDestroyed) {
            h.b(3);
            dismissInternal(true, true);
            int i4 = b;
            int i5 = i4 & 1;
            int i6 = i5 + ((i4 ^ 1) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b + 81;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 10 / 0;
        }
    }

    public View onFindViewById(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 99;
        int i5 = -(-(i3 | 99));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            View viewFindViewById = dialog.findViewById(i);
            int i7 = b;
            int i8 = ((i7 | 53) << 1) - (i7 ^ 53);
            a = i8 % 128;
            int i9 = i8 % 2;
            return viewFindViewById;
        }
        int i10 = ((((i3 ^ 23) | (i3 & 23)) << 1) - (~(-(((~i3) & 23) | (i3 & (-24)))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    public boolean onHasView() {
        int i = 2 % 2;
        int i2 = a + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.mDialogCreated;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return z;
    }

    public final Dialog requireDialog() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 85) | (i2 & 85)) << 1;
        int i4 = -(((~i2) & 85) | (i2 & (-86)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        Dialog dialog = getDialog();
        if (dialog == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DialogFragment ");
            int i7 = b;
            int i8 = i7 ^ 59;
            int i9 = ((i7 & 59) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            sb.append(this);
            sb.append(" does not have a Dialog.");
            throw new IllegalStateException(sb.toString());
        }
        int i13 = b;
        int i14 = i13 & 67;
        int i15 = ((i13 ^ 67) | i14) << 1;
        int i16 = -((i13 | 67) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = (i18 & 39) + (i18 | 39);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return dialog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setShowsDialog(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 17) << 1) - (((~i2) & 17) | (i2 & (-18)));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.mShowsDialog = z;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 9;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
    }

    public void show(h hVar, String str) {
        int i = 2 % 2;
        this.mDismissed = false;
        this.mShownByMe = true;
        a aVar = new a(hVar);
        int i2 = b;
        int i3 = ((i2 & (-4)) | ((~i2) & 3)) + ((i2 & 3) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        aVar.d(0, this, str, 1);
        aVar.c();
        int i5 = b;
        int i6 = ((i5 & 54) + (i5 | 54)) - 1;
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        int i8 = i7 & 55;
        int i9 = (i7 | 55) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public A createFragmentContainer() {
        int i = 2 % 2;
        aZa aza = new aZa(super.createFragmentContainer());
        int i2 = b;
        int i3 = ((i2 & (-102)) | ((~i2) & 101)) + ((i2 & 101) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return aza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            super.onDetach();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            int i6 = a;
            int i7 = i6 & 59;
            int i8 = i7 + ((i6 ^ 59) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            this.mDismissed = true;
            int i10 = i6 & 107;
            int i11 = (i10 - (~(-(-((i6 ^ 107) | i10))))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        getViewLifecycleOwnerLiveData().i(this.mObserver);
        int i13 = a;
        int i14 = i13 ^ 47;
        int i15 = (((i13 & 47) | i14) << 1) - i14;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 51 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 72) ^ (-1));
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onGetLayoutInflater(bundle);
            obj.hashCode();
            throw null;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog) {
            int i3 = a;
            int i4 = i3 | 57;
            int i5 = ((i4 << 1) - (~(-(i4 & (~(i3 & 57)))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.mCreatingDialog) {
                int i6 = i3 + 63;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    prepareDialog(bundle);
                } else {
                    prepareDialog(bundle);
                }
                h.b(2);
                Dialog dialog = this.mDialog;
                if (dialog != null) {
                    int i7 = a;
                    int i8 = ((i7 | 44) << 1) - (i7 ^ 44);
                    int i9 = (i8 ^ (-1)) + (i8 << 1);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    layoutInflaterOnGetLayoutInflater = layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
                    int i11 = b;
                    int i12 = (-2) - (((i11 ^ 60) + ((i11 & 60) << 1)) ^ (-1));
                    a = i12 % 128;
                    int i13 = i12 % 2;
                }
                int i14 = a;
                int i15 = (i14 & (-40)) | ((~i14) & 39);
                int i16 = (i14 & 39) << 1;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    return layoutInflaterOnGetLayoutInflater;
                }
                throw null;
            }
        }
        h.b(2);
        int i18 = a;
        int i19 = (i18 & 17) + (i18 | 17);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 23 / 0;
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = ((i2 ^ 67) | i3) << 1;
        int i5 = -((i2 | 67) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            super.onStop();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            int i7 = a;
            int i8 = (i7 & (-102)) | ((~i7) & 101);
            int i9 = (i7 & 101) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            dialog.hide();
            int i12 = a;
            int i13 = (i12 | 59) << 1;
            int i14 = -(i12 ^ 59);
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = i17 & 77;
        int i19 = (i17 | 77) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
    }

    public void setCancelable(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 119) + (i2 | 119);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.mCancelable = z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            int i4 = ((i2 | 123) << 1) - (i2 ^ 123);
            b = i4 % 128;
            int i5 = i4 % 2;
            dialog.setCancelable(z);
            int i6 = b + 45;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = a;
        int i9 = ((i8 | 97) << 1) - (i8 ^ 97);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public void setupDialog(Dialog dialog, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 94) + (i3 | 94)) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0 ? i == 1 : i == 0) {
            dialog.requestWindowFeature(1);
            int i6 = a + 91;
            b = i6 % 128;
            int i7 = i6 % 2;
        } else if (i != 2) {
            int i8 = ((i5 | 71) << 1) - (i5 ^ 71);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            if (i == 3) {
                int i11 = i9 ^ 119;
                int i12 = (((i9 & 119) | i11) << 1) - i11;
                b = i12 % 128;
                int i13 = i12 % 2;
                Window window = dialog.getWindow();
                if (i13 == 0) {
                    int i14 = 68 / 0;
                    if (window != null) {
                        window.addFlags(24);
                        int i15 = b + 15;
                        a = i15 % 128;
                        int i16 = i15 % 2;
                    }
                } else if (window != null) {
                    window.addFlags(24);
                    int i17 = b + 15;
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
                dialog.requestWindowFeature(1);
                int i19 = a + 91;
                b = i19 % 128;
                int i20 = i19 % 2;
            }
        } else {
            dialog.requestWindowFeature(1);
            int i110 = a + 91;
            b = i110 % 128;
            int i21 = i110 % 2;
        }
        int i22 = a + 37;
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int i = 2 % 2;
        h.b(3);
        Dialog dialog = new Dialog(requireContext(), getTheme());
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = (i3 - (~((i2 ^ 23) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return dialog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = -(-((i2 & 25) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            super.onViewStateRestored(bundle);
            obj.hashCode();
            throw null;
        }
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null) {
            int i6 = a;
            int i7 = (i6 ^ 113) + ((i6 & 113) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            Bundle bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG);
            if (bundle2 != null) {
                int i9 = a + 73;
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    this.mDialog.onRestoreInstanceState(bundle2);
                    obj.hashCode();
                    throw null;
                }
                this.mDialog.onRestoreInstanceState(bundle2);
                int i10 = a;
                int i11 = ((((i10 ^ 53) | (i10 & 53)) << 1) - (~(-(((~i10) & 53) | (i10 & (-54)))))) - 1;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = a;
        int i14 = i13 & 97;
        int i15 = (i13 ^ 97) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-80)) | ((~i2) & 79);
        int i4 = (i2 & 79) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            int i7 = b;
            int i8 = i7 & 33;
            int i9 = (i7 ^ 33) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.mViewDestroyed = false;
                dialog.setOnDismissListener(null);
            } else {
                this.mViewDestroyed = true;
                dialog.setOnDismissListener(null);
            }
            this.mDialog.dismiss();
            int i11 = b;
            int i12 = (i11 & 59) + (i11 | 59);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (!this.mDismissed) {
                int i14 = ((i11 & 22) + (i11 | 22)) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                onDismiss(this.mDialog);
                int i16 = b;
                int i17 = (i16 ^ 47) + ((i16 & 47) << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            this.mDialog = null;
            this.mDialogCreated = false;
            int i19 = a + 15;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 4 / 5;
            }
        }
        int i21 = b + 93;
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[PHI: r5
  0x0061: PHI (r5v16 android.os.Bundle) = (r5v15 android.os.Bundle), (r5v22 android.os.Bundle) binds: [B:20:0x005f, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle bundle2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 75) + ((i3 & 75) << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super.performCreateView(layoutInflater, viewGroup, bundle);
            View view = this.mView;
            throw null;
        }
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null) {
            int i5 = b;
            int i6 = ((i5 & (-88)) | ((~i5) & 87)) + ((i5 & 87) << 1);
            int i7 = i6 % 128;
            a = i7;
            if (i6 % 2 != 0) {
                int i8 = 26 / 0;
                if (bundle != null) {
                    i = ((i7 & (-18)) | ((~i7) & 17)) + ((i7 & 17) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG);
                        int i9 = 42 / 0;
                        if (bundle2 != null) {
                            this.mDialog.onRestoreInstanceState(bundle2);
                            int i10 = a;
                            int i11 = i10 & 97;
                            int i12 = ((i10 | 97) & (~i11)) + (i11 << 1);
                            b = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    } else {
                        bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG);
                        if (bundle2 != null) {
                            this.mDialog.onRestoreInstanceState(bundle2);
                            int i14 = a;
                            int i15 = i14 & 97;
                            int i16 = ((i14 | 97) & (~i15)) + (i15 << 1);
                            b = i16 % 128;
                            int i17 = i16 % 2;
                        }
                    }
                }
            } else if (bundle != null) {
                i = ((i7 & (-18)) | ((~i7) & 17)) + ((i7 & 17) << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG);
                    int i18 = 42 / 0;
                    if (bundle2 != null) {
                        this.mDialog.onRestoreInstanceState(bundle2);
                        int i19 = a;
                        int i110 = i19 & 97;
                        int i111 = ((i19 | 97) & (~i110)) + (i110 << 1);
                        b = i111 % 128;
                        int i112 = i111 % 2;
                    }
                } else {
                    bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG);
                    if (bundle2 != null) {
                        this.mDialog.onRestoreInstanceState(bundle2);
                        int i113 = a;
                        int i114 = i113 & 97;
                        int i115 = ((i113 | 97) & (~i114)) + (i114 << 1);
                        b = i115 % 128;
                        int i116 = i115 % 2;
                    }
                }
            }
        }
        int i20 = a + 125;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public void setStyle(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 65;
        int i7 = (i5 ^ 65) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            h.b(4);
            this.mStyle = i;
            if (i != 4) {
                int i9 = b;
                int i10 = (i9 & 73) + (i9 | 73);
                a = i10 % 128;
                int i11 = i10 % 2;
                if (i == 3) {
                }
            }
            if (i2 != 0) {
                int i12 = b;
                i3 = (-2) - (((i12 & 86) + (i12 | 86)) ^ (-1));
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    this.mTheme = i2;
                    int i13 = 55 / 0;
                } else {
                    this.mTheme = i2;
                }
            }
            int i14 = b;
            int i15 = i14 & 7;
            int i16 = (i14 | 7) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        h.b(2);
        this.mStyle = i;
        if (i != 2) {
            int i20 = b;
            int i110 = (i20 & 73) + (i20 | 73);
            a = i110 % 128;
            int i111 = i110 % 2;
            if (i == 3) {
            }
        }
        if (i2 != 0) {
            int i112 = b;
            i3 = (-2) - (((i112 & 86) + (i112 | 86)) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.mTheme = i2;
                int i113 = 55 / 0;
            } else {
                this.mTheme = i2;
            }
        }
        int i114 = b;
        int i115 = i114 & 7;
        int i116 = (i114 | 7) & (~i115);
        int i117 = i115 << 1;
        int i118 = (i116 ^ i117) + ((i116 & i117) << 1);
        a = i118 % 128;
        int i119 = i118 % 2;
        this.mTheme = android.R.style.Theme.Panel;
        int i21 = b + 42;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
        if (i2 != 0) {
            int i1110 = b;
            i3 = (-2) - (((i1110 & 86) + (i1110 | 86)) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.mTheme = i2;
                int i1111 = 55 / 0;
            } else {
                this.mTheme = i2;
            }
        }
        int i1112 = b;
        int i1113 = i1112 & 7;
        int i1114 = (i1112 | 7) & (~i1113);
        int i1115 = i1113 << 1;
        int i1116 = (i1114 ^ i1115) + ((i1114 & i1115) << 1);
        a = i1116 % 128;
        int i1117 = i1116 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r3.h == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if ((!r3.h) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r3.p.F(r3, false);
        r7 = ivas.gov.bisp.enumeration.F.L.a;
        r8 = (r7 | 63) << 1;
        r7 = -(r7 ^ 63);
        r1 = (r8 & r7) + (r7 | r8);
        ivas.gov.bisp.enumeration.F.L.b = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showNow(androidx.fragment.app.h r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            r6.mDismissed = r1
            r2 = 1
            r6.mShownByMe = r2
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r7)
            int r7 = ivas.gov.bisp.enumeration.F.L.a
            r4 = r7 & 101(0x65, float:1.42E-43)
            int r5 = ~r4
            r7 = r7 | 101(0x65, float:1.42E-43)
            r7 = r7 & r5
            int r4 = r4 << r2
            int r4 = -r4
            int r4 = -r4
            r5 = r7 | r4
            int r5 = r5 << r2
            r7 = r7 ^ r4
            int r5 = r5 - r7
            int r7 = r5 % 128
            ivas.gov.bisp.enumeration.F.L.b = r7
            int r5 = r5 % r0
            if (r5 != 0) goto L2d
            r3.d(r2, r6, r8, r2)
            boolean r7 = r3.h
            if (r7 != 0) goto L53
            goto L35
        L2d:
            r3.d(r1, r6, r8, r2)
            boolean r7 = r3.h
            r7 = r7 ^ r2
            if (r7 == 0) goto L53
        L35:
            androidx.fragment.app.h r7 = r3.p
            r7.F(r3, r1)
            int r7 = ivas.gov.bisp.enumeration.F.L.a
            r8 = r7 | 63
            int r8 = r8 << r2
            r7 = r7 ^ 63
            int r7 = -r7
            r1 = r8 & r7
            r7 = r7 | r8
            int r1 = r1 + r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.F.L.b = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L4e
            return
        L4e:
            r7 = 0
            r7.hashCode()
            throw r7
        L53:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This transaction is already being added to the back stack"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.F.L.showNow(androidx.fragment.app.h, java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        super.onCreate(bundle);
        Handler handler = new Handler();
        int i2 = b;
        int i3 = i2 ^ 53;
        int i4 = ((((i2 & 53) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.mHandler = handler;
        if (this.mContainerId == 0) {
            int i6 = b;
            int i7 = (i6 ^ 123) + ((i6 & 123) << 1);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 47;
            int i11 = -(-((i8 ^ 47) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = a;
            int i15 = i14 & 73;
            int i16 = (((i14 | 73) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        }
        this.mShowsDialog = z;
        Object obj = null;
        if (bundle != null) {
            int i18 = a;
            int i19 = (i18 & 23) + (i18 | 23);
            b = i19 % 128;
            int i20 = i19 % 2;
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            int i21 = b;
            int i22 = i21 & 45;
            int i23 = ((((i21 ^ 45) | i22) << 1) - (~(-((i21 | 45) & (~i22))))) - 1;
            a = i23 % 128;
            if (i23 % 2 != 0) {
                this.mTheme = bundle.getInt(SAVED_THEME, 0);
                z2 = bundle.getBoolean(SAVED_CANCELABLE, false);
            } else {
                this.mTheme = bundle.getInt(SAVED_THEME, 0);
                z2 = bundle.getBoolean(SAVED_CANCELABLE, true);
            }
            this.mCancelable = z2;
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            int i24 = a;
            int i25 = ((i24 ^ 121) - (~((i24 & 121) << 1))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
            if (i26 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i27 = a;
        int i28 = i27 & 79;
        int i29 = (i28 - (~((i27 ^ 79) | i28))) - 1;
        b = i29 % 128;
        if (i29 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-18)) | ((~i2) & 17);
        int i4 = -(-((i2 & 17) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.onStart();
        Dialog dialog = this.mDialog;
        Object obj = null;
        if (dialog != null) {
            int i7 = b;
            int i8 = i7 & 27;
            int i9 = -(-(i7 | 27));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                this.mViewDestroyed = true;
            } else {
                this.mViewDestroyed = false;
            }
            dialog.show();
            Dialog dialog2 = this.mDialog;
            int i11 = a + 31;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                dialog2.getWindow().getDecorView();
                obj.hashCode();
                throw null;
            }
            View decorView = dialog2.getWindow().getDecorView();
            decorView.setTag(ivas.gov.bisp.enumeration.R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(ivas.gov.bisp.enumeration.R.id.view_tree_view_model_store_owner, this);
            int i12 = a;
            int i13 = i12 | 81;
            int i14 = i13 << 1;
            int i15 = -((~(i12 & 81)) & i13);
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                decorView.setTag(ivas.gov.bisp.enumeration.R.id.view_tree_saved_state_registry_owner, this);
                int i17 = 99 / 0;
            } else {
                decorView.setTag(ivas.gov.bisp.enumeration.R.id.view_tree_saved_state_registry_owner, this);
            }
        }
        int i18 = a;
        int i19 = ((i18 | 55) << 1) - (i18 ^ 55);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 android.app.Dialog) = (r1v6 android.app.Dialog), (r1v43 android.app.Dialog) binds: [B:8:0x0026, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 75;
        int i4 = ((i2 | 75) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            super.onSaveInstanceState(bundle);
            dialog = this.mDialog;
            int i5 = 80 / 0;
            if (dialog != null) {
                int i6 = a;
                int i7 = i6 & 77;
                int i8 = -(-((i6 ^ 77) | i7));
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
                bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
                int i11 = b;
                int i12 = i11 ^ 85;
                int i13 = (((i11 & 85) | i12) << 1) - i12;
                a = i13 % 128;
                int i14 = i13 % 2;
                bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
                int i15 = b;
                int i16 = i15 & 65;
                int i17 = (((i15 ^ 65) | i16) << 1) - ((i15 | 65) & (~i16));
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            super.onSaveInstanceState(bundle);
            dialog = this.mDialog;
            if (dialog != null) {
                int i19 = a;
                int i20 = i19 & 77;
                int i21 = -(-((i19 ^ 77) | i20));
                int i22 = (i20 & i21) + (i21 | i20);
                b = i22 % 128;
                int i110 = i22 % 2;
                Bundle bundleOnSaveInstanceState2 = dialog.onSaveInstanceState();
                bundleOnSaveInstanceState2.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
                int i111 = b;
                int i112 = i111 ^ 85;
                int i113 = (((i111 & 85) | i112) << 1) - i112;
                a = i113 % 128;
                int i114 = i113 % 2;
                bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState2);
                int i115 = b;
                int i116 = i115 & 65;
                int i117 = (((i115 ^ 65) | i116) << 1) - ((i115 | 65) & (~i116));
                a = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        int i23 = this.mStyle;
        if (i23 != 0) {
            int i24 = b;
            int i25 = (i24 & 61) + (i24 | 61);
            a = i25 % 128;
            int i26 = i25 % 2;
            bundle.putInt(SAVED_STYLE, i23);
            int i27 = a;
            int i28 = (((i27 ^ 37) | (i27 & 37)) << 1) - (((~i27) & 37) | (i27 & (-38)));
            b = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = this.mTheme;
        if (i30 != 0) {
            int i31 = b;
            int i32 = i31 ^ 17;
            int i33 = (((i31 & 17) | i32) << 1) - i32;
            a = i33 % 128;
            int i34 = i33 % 2;
            bundle.putInt(SAVED_THEME, i30);
            int i35 = b;
            int i36 = i35 ^ 119;
            int i37 = ((i35 & 119) | i36) << 1;
            int i38 = -i36;
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            a = i39 % 128;
            int i40 = i39 % 2;
        }
        boolean z = this.mCancelable;
        if (!z) {
            int i41 = b;
            int i42 = (i41 ^ 23) + ((i41 & 23) << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            bundle.putBoolean(SAVED_CANCELABLE, z);
            int i44 = a;
            int i45 = i44 ^ 75;
            int i46 = -(-((i44 & 75) << 1));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            b = i47 % 128;
            int i48 = i47 % 2;
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            int i49 = b;
            int i50 = ((i49 ^ 34) + ((i49 & 34) << 1)) - 1;
            a = i50 % 128;
            if (i50 % 2 != 0) {
                bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
                int i51 = 52 / 0;
            } else {
                bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
            }
        }
        int i52 = this.mBackStackId;
        if (i52 != -1) {
            int i53 = a;
            int i54 = (i53 & 3) + (i53 | 3);
            b = i54 % 128;
            if (i54 % 2 == 0) {
                bundle.putInt(SAVED_BACK_STACK_ID, i52);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bundle.putInt(SAVED_BACK_STACK_ID, i52);
        }
        int i55 = b;
        int i56 = ((i55 & (-120)) | ((~i55) & 119)) + ((i55 & 119) << 1);
        a = i56 % 128;
        int i57 = i56 % 2;
    }

    public int show(g gVar, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = i3 + ((i2 ^ 91) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.mDismissed = false;
        this.mShownByMe = true;
        int i7 = i5 & 63;
        int i8 = (i5 | 63) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            gVar.d(1, this, str, 0);
        } else {
            gVar.d(0, this, str, 1);
        }
        this.mViewDestroyed = false;
        int iC = gVar.c();
        this.mBackStackId = iC;
        int i11 = a;
        int i12 = (i11 ^ 93) + ((i11 & 93) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        return iC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0182, code lost:
    
        if (r11 != r5.p) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0187, code lost:
    
        if (r11 != r5.p) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
    
        r10 = ivas.gov.bisp.enumeration.F.L.a;
        r11 = (((r10 & (-70)) | ((~r10) & 69)) - (~(-(-((r10 & 69) << 1))))) - 1;
        ivas.gov.bisp.enumeration.F.L.b = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a0, code lost:
    
        if ((r11 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a2, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p091n.j.w("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        r10.append(toString());
        r11 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b1, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p091n.j.w("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        r10.append(toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bc, code lost:
    
        r10.append(" is already attached to a FragmentManager.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ca, code lost:
    
        throw new java.lang.IllegalStateException(r10.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dismissInternal(boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.F.L.dismissInternal(boolean, boolean):void");
    }

    public L(int i) {
        super(i);
        this.mDismissRunnable = new aYV();
        this.mOnCancelListener = new aYW();
        this.mOnDismissListener = new aYX();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new aYZ();
        this.mDialogCreated = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.mDialogCreated != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r2 = r1 & 71;
        r1 = (r1 ^ 71) | r2;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.F.L.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r7.mCreatingDialog = true;
        r8 = onCreateDialog(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r1 = ivas.gov.bisp.enumeration.F.L.a;
        r2 = (r1 | 99) << 1;
        r1 = -(((~r1) & 99) | (r1 & (-100)));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        r1 = r3 % 128;
        ivas.gov.bisp.enumeration.F.L.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r7.mDialog = r8;
        r3 = 76 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if ((!r7.mShowsDialog) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        r7.mDialog = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if ((!r7.mShowsDialog) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r7.mDialog = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r8 = ((r1 | 78) << 1) - (r1 ^ 78);
        r1 = (r8 ^ (-1)) + (r8 << 1);
        ivas.gov.bisp.enumeration.F.L.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        r2 = r1 & 63;
        r2 = (r2 - (~((r1 ^ 63) | r2))) - 1;
        ivas.gov.bisp.enumeration.F.L.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        setupDialog(r8, r7.mStyle);
        r8 = getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if ((!(r8 instanceof android.app.Activity)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        r1 = ivas.gov.bisp.enumeration.F.L.b;
        r2 = (r1 & 43) + (r1 | 43);
        ivas.gov.bisp.enumeration.F.L.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if ((r2 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r7.mDialog.setOwnerActivity((android.app.Activity) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r8 = ivas.gov.bisp.enumeration.F.L.b;
        r1 = ((r8 | 123) << 1) - (r8 ^ 123);
        ivas.gov.bisp.enumeration.F.L.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        r7.mDialog.setCancelable(r7.mCancelable);
        r8 = r7.mDialog;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        r1 = ivas.gov.bisp.enumeration.F.L.b;
        r2 = ((r1 | 87) << 1) - (r1 ^ 87);
        ivas.gov.bisp.enumeration.F.L.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if ((r2 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        r8.setOnCancelListener(r7.mOnCancelListener);
        r7.mDialog.setOnDismissListener(r7.mOnDismissListener);
        r7.mDialogCreated = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r8 = ivas.gov.bisp.enumeration.F.L.a + 2;
        r1 = (r8 ^ (-1)) + (r8 << 1);
        ivas.gov.bisp.enumeration.F.L.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r7.mCreatingDialog = false;
        r8 = ivas.gov.bisp.enumeration.F.L.a;
        r1 = (r8 ^ 41) + ((r8 & 41) << 1);
        ivas.gov.bisp.enumeration.F.L.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if ((r1 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        r8.setOnCancelListener(r7.mOnCancelListener);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        r7.mDialog.setOwnerActivity((android.app.Activity) r8);
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r7.mCreatingDialog = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r1 = r2 & 27;
        r8 = ((r2 ^ 27) | r1) << 1;
        r1 = -((~r1) & (r2 | 27));
        r2 = (r8 ^ r1) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.F.L.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        if ((r2 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r7.mShowsDialog == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r7.mShowsDialog == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r8 = (r2 ^ 43) + ((r2 & 43) << 1);
        ivas.gov.bisp.enumeration.F.L.a = r8 % 128;
        r8 = r8 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void prepareDialog(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.F.L.prepareDialog(android.os.Bundle):void");
    }
}
