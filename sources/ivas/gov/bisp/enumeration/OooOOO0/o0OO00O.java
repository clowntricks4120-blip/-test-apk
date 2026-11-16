package ivas.gov.bisp.enumeration.OooOOO0;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.AbstractViewOnTouchListenerC0317n;
import ivas.gov.bisp.enumeration.p088k.E;
import ivas.gov.bisp.enumeration.p088k.Y;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p088k.r;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class o0OO00O extends Spinner {
    private static int b;
    public final Rect d;
    public final r e;
    public final Context f;
    public AbstractViewOnTouchListenerC0317n g;
    public final boolean h;
    public SpinnerAdapter i;
    public aSQ j;
    public int k;
    public static final int[] c = {R.attr.spinnerMode};
    private static int a = 55 % 128;

    public static class aSN extends View.BaseSavedState {
        public static final Parcelable.Creator<aSN> CREATOR = new aSO();
        private static int b = 0;
        private static int c = 1;
        public boolean d;

        public class aSO implements Parcelable.Creator<aSN> {
            private static int a = 1;
            private static int b;

            @Override // android.os.Parcelable.Creator
            public aSN createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                aSN asn = new aSN(parcel);
                int i2 = b;
                int i3 = i2 & 3;
                int i4 = (i2 ^ 3) | i3;
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                a = i5 % 128;
                int i6 = i5 % 2;
                return asn;
            }

            @Override // android.os.Parcelable.Creator
            public aSN[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 ^ 27) | (i3 & 27)) << 1;
                int i5 = -((i3 & (-28)) | ((~i3) & 27));
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                aSN[] asnArr = new aSN[i];
                int i8 = ((i3 & (-108)) | ((~i3) & 107)) + ((i3 & 107) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                return asnArr;
            }
        }

        static {
            int i = c;
            int i2 = i & 89;
            int i3 = -(-((i ^ 89) | i2));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public aSN(Parcelable parcelable) {
            super(parcelable);
        }

        public aSN(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readByte() != 0) {
                int i = b;
                int i2 = i & 45;
                int i3 = -(-((i ^ 45) | i2));
                int i4 = i2 ^ i3;
                int i5 = i3 & i2;
                z = true;
                int i6 = i4 + (i5 << 1);
                c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                } else {
                    int i8 = 2 % 2;
                }
            } else {
                int i9 = c;
                int i10 = i9 & 65;
                int i11 = i10 + ((i9 ^ 65) | i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                z = false;
            }
            this.d = z;
            int i14 = c + 119;
            b = i14 % 128;
            int i15 = i14 % 2;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 59;
            int i5 = i3 | 59;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            c = i6 % 128;
            if (i6 % 2 == 0) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                throw null;
            }
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int i7 = b;
            int i8 = i7 & 85;
            int i9 = (i7 ^ 85) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            c = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public class aSP implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int a = 0;
        private static int b = 1;

        public aSP() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-60)) | ((~i2) & 59);
            int i4 = -(-((i2 & 59) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            if (!o0OO00O.this.getInternalPopup().e()) {
                int i7 = b;
                int i8 = (((i7 & (-110)) | ((~i7) & 109)) - (~(-(-((i7 & 109) << 1))))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    o0OO00O.this.d();
                    obj.hashCode();
                    throw null;
                }
                o0OO00O.this.d();
            }
            ViewTreeObserver viewTreeObserver = o0OO00O.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                int i9 = (-2) - ((b + 82) ^ (-1));
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    obj.hashCode();
                    throw null;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int i10 = b;
            int i11 = i10 & 45;
            int i12 = (i11 - (~((i10 ^ 45) | i11))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    public interface aSQ {
        void b(int i);

        int c();

        void d(int i, int i2);

        void dismiss();

        boolean e();

        int g();

        Drawable h();

        void j(ListAdapter listAdapter);

        CharSequence o();

        void p(CharSequence charSequence);

        void q(int i);

        void r(Drawable drawable);

        void s(int i);
    }

    public class aSR implements aSQ, DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;
        public b c;
        public ListAdapter d;
        public CharSequence e;

        public aSR() {
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void b(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 9) + (i3 | 9);
            b = i4 % 128;
            int i5 = i4 % 2;
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
            if (i5 == 0) {
                int i6 = 73 / 0;
            }
            int i7 = a;
            int i8 = i7 & 115;
            int i9 = (i7 ^ 115) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 20 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public int c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 17;
            int i4 = ((i2 & 17) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & 71;
            int i9 = (i8 - (~((i2 ^ 71) | i8))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return 0;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void dismiss() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 43;
            int i4 = -(-((i2 & 43) << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            b bVar = this.c;
            if (bVar != null) {
                int i7 = i2 & 3;
                int i8 = (((i2 ^ 3) | i7) << 1) - ((i2 | 3) & (~i7));
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    bVar.dismiss();
                    this.c = null;
                    int i9 = 69 / 0;
                } else {
                    bVar.dismiss();
                    this.c = null;
                }
            }
            int i10 = a + 53;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 9 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public boolean e() {
            boolean zIsShowing;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            b bVar = this.c;
            if (bVar != null) {
                int i6 = (((i4 | 102) << 1) - (i4 ^ 102)) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                zIsShowing = bVar.isShowing();
                int i8 = a;
                int i9 = ((i8 | 59) << 1) - (i8 ^ 59);
                b = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = i4 | 79;
                int i12 = i11 << 1;
                int i13 = -((~(i4 & 79)) & i11);
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                zIsShowing = false;
            }
            int i16 = b + 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            return zIsShowing;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public int g() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 123) | (i2 & 123)) << 1) - (((~i2) & 123) | (i2 & (-124)));
            a = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public Drawable h() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 97;
            int i4 = -(-((i2 & 97) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 ^ 109;
            int i9 = ((i6 & 109) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            return null;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void j(ListAdapter listAdapter) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 7) - (~(i2 | 7))) - 1;
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            this.d = listAdapter;
            if (i5 != 0) {
                int i6 = 43 / 0;
            }
            int i7 = i4 + 13;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 15 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public CharSequence o() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 91) + ((i2 & 91) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = this.e;
            int i5 = ((i2 | 27) << 1) - (i2 ^ 27);
            b = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void p(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.e = charSequence;
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void q(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 21) | (i3 & 21)) << 1;
            int i5 = -(((~i3) & 21) | (i3 & (-22)));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
            if (i7 != 0) {
                int i8 = 87 / 0;
            }
            int i9 = a;
            int i10 = ((i9 | 39) << 1) - (i9 ^ 39);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void r(Drawable drawable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 126) << 1) - (i2 ^ 126);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = b + 99;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void s(int i) {
            int i2 = 2 % 2;
            int i3 = b + 83;
            a = i3 % 128;
            int i4 = i3 % 2;
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
            int i5 = b;
            int i6 = i5 & 87;
            int i7 = i6 + ((i5 ^ 87) | i6);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0054 A[PHI: r5
  0x0054: PHI (r5v4 java.lang.CharSequence) = (r5v3 java.lang.CharSequence), (r5v20 java.lang.CharSequence) binds: [B:14:0x0052, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0069  */
        /* JADX WARN: Code duplicated, block: B:18:0x0077  */
        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void d(int i, int i2) {
            CharSequence charSequence;
            int i3;
            AlertController.OooO0O0 oooO0O0;
            b bVarB;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = ((i5 & 32) + (i5 | 32)) - 1;
            int i7 = i6 % 128;
            b = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.d == null) {
                int i8 = i7 & 65;
                int i9 = ((i7 ^ 65) | i8) << 1;
                int i10 = -((~i8) & (i7 | 65));
                int i11 = (i9 & i10) + (i9 | i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            b.aIz aiz = new b.aIz(o0OO00O.this.getPopupContext());
            int i13 = a + 124;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            int i15 = i14 % 128;
            b = i15;
            if (i14 % 2 == 0) {
                charSequence = this.e;
                int i16 = 13 / 0;
                if (charSequence != null) {
                    int i17 = (i15 & (-22)) | ((~i15) & 21);
                    int i18 = (i15 & 21) << 1;
                    i3 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        aiz.a.e = charSequence;
                        throw null;
                    }
                    aiz.a.e = charSequence;
                    int i19 = b + 51;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
            } else {
                charSequence = this.e;
                if (charSequence != null) {
                    int i110 = (i15 & (-22)) | ((~i15) & 21);
                    int i111 = (i15 & 21) << 1;
                    i3 = (i110 ^ i111) + ((i111 & i110) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        aiz.a.e = charSequence;
                        throw null;
                    }
                    aiz.a.e = charSequence;
                    int i112 = b + 51;
                    a = i112 % 128;
                    int i21 = i112 % 2;
                }
            }
            ListAdapter listAdapter = this.d;
            int selectedItemPosition = o0OO00O.this.getSelectedItemPosition();
            int i22 = b;
            int i23 = (i22 ^ 21) + ((i22 & 21) << 1);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                oooO0O0 = aiz.a;
                int i24 = 74 / 0;
            } else {
                oooO0O0 = aiz.a;
            }
            int i25 = a;
            int i26 = i25 & 73;
            int i27 = -(-((i25 ^ 73) | i26));
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
            oooO0O0.n = listAdapter;
            oooO0O0.m = this;
            int i30 = b;
            int i31 = i30 ^ 21;
            int i32 = -(-((i30 & 21) << 1));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            int i34 = i33 % 2;
            oooO0O0.q = selectedItemPosition;
            oooO0O0.p = true;
            int i35 = a;
            int i36 = ((i35 ^ 25) - (~((i35 & 25) << 1))) - 1;
            b = i36 % 128;
            if (i36 % 2 == 0) {
                bVarB = aiz.b();
                this.c = bVarB;
                int i37 = 30 / 0;
            } else {
                bVarB = aiz.b();
                this.c = bVarB;
            }
            int i38 = a;
            int i39 = ((i38 | 41) << 1) - (i38 ^ 41);
            b = i39 % 128;
            int i40 = i39 % 2;
            ListView listView = bVarB.a.h;
            int i41 = a;
            int i42 = ((i41 & 36) + (i41 | 36)) - 1;
            b = i42 % 128;
            if (i42 % 2 == 0) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                throw null;
            }
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.c.show();
            int i43 = a;
            int i44 = (((i43 | 80) << 1) - (i43 ^ 80)) - 1;
            b = i44 % 128;
            int i45 = i44 % 2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & 30) + (i3 | 30);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            o0OO00O.this.setSelection(i);
            Object obj = null;
            if (o0OO00O.this.getOnItemClickListener() != null) {
                int i7 = b;
                int i8 = (((i7 | 50) << 1) - (i7 ^ 50)) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    this.d.getItemId(i);
                    obj.hashCode();
                    throw null;
                }
                o0OO00O.this.performItemClick(null, i, this.d.getItemId(i));
                int i9 = b;
                int i10 = i9 ^ 15;
                int i11 = (i9 & 15) << 1;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
            b bVar = this.c;
            if (bVar != null) {
                int i14 = a;
                int i15 = i14 & 35;
                int i16 = i15 + ((i14 ^ 35) | i15);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    bVar.dismiss();
                    this.c = null;
                    int i17 = 78 / 0;
                } else {
                    bVar.dismiss();
                    this.c = null;
                }
                int i18 = b;
                int i19 = i18 ^ 83;
                int i20 = ((i18 & 83) | i19) << 1;
                int i21 = -i19;
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = a;
            int i25 = ((i24 ^ 86) + ((i24 & 86) << 1)) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 3 / 0;
            }
        }
    }

    public static class aSS implements ListAdapter, SpinnerAdapter {
        private static int a = 1;
        private static int b;
        public SpinnerAdapter c;
        public ListAdapter d;

        public aSS(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.d = (ListAdapter) spinnerAdapter;
                int i = a;
                int i2 = ((i | 43) << 1) - (i ^ 43);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            Object obj = null;
            if (theme != null) {
                int i4 = a;
                int i5 = i4 & 67;
                int i6 = (~i5) & (i4 | 67);
                int i7 = i5 << 1;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                int i9 = i8 % 128;
                b = i9;
                int i10 = i8 % 2;
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    int i11 = i9 | 43;
                    int i12 = ((i11 << 1) - (~(-(i11 & (~(i9 & 43)))))) - 1;
                    a = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((ThemedSpinnerAdapter) spinnerAdapter).getDropDownViewTheme();
                        obj.hashCode();
                        throw null;
                    }
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        int i13 = a;
                        int i14 = i13 ^ 21;
                        int i15 = -(-((i13 & 21) << 1));
                        int i16 = (i14 & i15) + (i15 | i14);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        int i18 = a + 89;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        return;
                    }
                } else if (spinnerAdapter instanceof E) {
                    int i20 = (-2) - ((i4 + 40) ^ (-1));
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        ((E) spinnerAdapter).getDropDownViewTheme();
                        throw null;
                    }
                    E e = (E) spinnerAdapter;
                    if (e.getDropDownViewTheme() == null) {
                        int i21 = b;
                        int i22 = i21 & 79;
                        int i23 = i21 | 79;
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                        e.setDropDownViewTheme(theme);
                        int i26 = b;
                        int i27 = i26 & 3;
                        int i28 = -(-(i26 | 3));
                        int i29 = (i27 & i28) + (i28 | i27);
                        a = i29 % 128;
                        if (i29 % 2 == 0) {
                            int i30 = 3 % 3;
                        } else {
                            int i31 = 2 % 2;
                        }
                    }
                }
            }
            int i32 = b;
            int i33 = i32 ^ 19;
            int i34 = (((i32 & 19) | i33) << 1) - i33;
            a = i34 % 128;
            if (i34 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 124) + ((i2 & 124) << 1)) ^ (-1));
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            ListAdapter listAdapter = this.d;
            if (listAdapter == null) {
                int i6 = i4 & 47;
                int i7 = (i6 - (~((i4 ^ 47) | i6))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = i4 & 67;
            int i10 = i9 + ((i4 ^ 67) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
            int i12 = b;
            int i13 = ((i12 | 108) << 1) - (i12 ^ 108);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return zAreAllItemsEnabled;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int count;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 57;
            int i4 = (i2 | 57) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                int i8 = i7 & 17;
                int i9 = -(-(i7 | 17));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = ((i7 & (-26)) | ((~i7) & 25)) + ((i7 & 25) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
                count = 0;
            } else {
                count = spinnerAdapter.getCount();
                int i14 = a;
                int i15 = i14 ^ 29;
                int i16 = ((i14 & 29) | i15) << 1;
                int i17 = -i15;
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = b + 97;
            a = i20 % 128;
            int i21 = i20 % 2;
            return count;
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            View dropDownView;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 49) - (~((i3 & 49) << 1))) - 1;
            int i5 = i4 % 128;
            b = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                int i6 = (((i5 & (-70)) | ((~i5) & 69)) - (~(-(-((i5 & 69) << 1))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                dropDownView = null;
            } else {
                dropDownView = spinnerAdapter.getDropDownView(i, view, viewGroup);
                int i8 = b;
                int i9 = ((i8 ^ 55) | (i8 & 55)) << 1;
                int i10 = -(((~i8) & 55) | (i8 & (-56)));
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = a + 81;
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return dropDownView;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object item;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 7;
            int i5 = (i4 - (~(-(-((i3 ^ 7) | i4))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                int i7 = i3 + 41;
                int i8 = i7 % 128;
                a = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                item = null;
            } else {
                item = spinnerAdapter.getItem(i);
                int i12 = b;
                int i13 = (i12 & 63) + (i12 | 63);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = b;
            int i16 = i15 & 105;
            int i17 = i15 | 105;
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                return item;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            long itemId;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 73;
            int i5 = (i4 - (~(-(-((i3 ^ 73) | i4))))) - 1;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                int i8 = i6 & 93;
                int i9 = (((i6 ^ 93) | i8) << 1) - ((i6 | 93) & (~i8));
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                int i12 = i10 | 17;
                int i13 = i12 << 1;
                int i14 = -(i12 & (~(i10 & 17)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                itemId = -1;
            } else {
                itemId = spinnerAdapter.getItemId(i);
                int i17 = a;
                int i18 = i17 & 11;
                int i19 = -(-(i17 | 11));
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                int i21 = i20 % 2;
            }
            int i22 = b;
            int i23 = (i22 ^ 4) + ((i22 & 4) << 1);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            a = i24 % 128;
            if (i24 % 2 != 0) {
                return itemId;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 ^ 6) + ((i3 & 6) << 1);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 57;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 43 / 0;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 91;
            int i5 = i3 | 91;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            View dropDownView = null;
            if (i6 % 2 != 0) {
                dropDownView.hashCode();
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter == null) {
                int i7 = (i3 & 88) + (i3 | 88);
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                dropDownView = spinnerAdapter.getDropDownView(i, view, viewGroup);
                int i10 = b;
                int i11 = i10 & 25;
                int i12 = (i10 | 25) & (~i11);
                int i13 = -(-(i11 << 1));
                int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = b;
            int i17 = i16 | 99;
            int i18 = (i17 << 1) - ((~(i16 & 99)) & i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            return dropDownView;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 115;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 115)) & i3);
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int i9 = i7 & 53;
            int i10 = (((i7 | 53) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return 1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0039  */
        /* JADX WARN: Code duplicated, block: B:16:0x0044  */
        /* JADX WARN: Code duplicated, block: B:18:0x0048  */
        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 | 21;
            int i5 = i4 << 1;
            int i6 = -((~(i3 & 21)) & i4);
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            boolean z = false;
            if (spinnerAdapter != null) {
                int i9 = i8 + 97;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean zHasStableIds = spinnerAdapter.hasStableIds();
                    int i10 = 20 / 0;
                    if (!zHasStableIds) {
                        int i11 = b;
                        int i12 = (i11 & (-20)) | ((~i11) & 19);
                        int i13 = (i11 & 19) << 1;
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        i = a + 83;
                        b = i % 128;
                        if (i % 2 != 0) {
                            int i16 = 2 / 5;
                        }
                        z = true;
                    }
                } else if (!spinnerAdapter.hasStableIds()) {
                    int i17 = b;
                    int i18 = (i17 & (-20)) | ((~i17) & 19);
                    int i19 = (i17 & 19) << 1;
                    int i110 = (i18 ^ i19) + ((i19 & i18) << 1);
                    a = i110 % 128;
                    int i111 = i110 % 2;
                } else {
                    i = a + 83;
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i112 = 2 / 5;
                    }
                    z = true;
                }
            } else {
                int i113 = b;
                int i114 = (i113 & (-20)) | ((~i113) & 19);
                int i115 = (i113 & 19) << 1;
                int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                a = i116 % 128;
                int i117 = i116 % 2;
            }
            int i20 = a;
            int i21 = ((i20 | 68) << 1) - (i20 ^ 68);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            return z;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            int i = 2 % 2;
            int i2 = a;
            boolean z = true;
            int i3 = (((i2 | 26) << 1) - (i2 ^ 26)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (getCount() == 0) {
                int i5 = a;
                int i6 = ((i5 ^ 71) - (~(-(-((i5 & 71) << 1))))) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                int i8 = (i5 ^ 13) + ((i5 & 13) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = b;
                int i11 = (i10 & (-82)) | ((~i10) & 81);
                int i12 = -(-((i10 & 81) << 1));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
            int i15 = a;
            int i16 = (i15 & 31) + (i15 | 31);
            b = i16 % 128;
            int i17 = i16 % 2;
            return z;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 115;
            int i5 = ((i3 ^ 115) | i4) << 1;
            int i6 = -((~i4) & (i3 | 115));
            int i7 = (i5 & i6) + (i5 | i6);
            int i8 = i7 % 128;
            a = i8;
            Object obj = null;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            ListAdapter listAdapter = this.d;
            if (listAdapter == null) {
                int i9 = (((i3 | 37) << 1) - (~(-(i3 ^ 37)))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
            int i11 = i8 + 83;
            b = i11 % 128;
            int i12 = i11 % 2;
            boolean zIsEnabled = listAdapter.isEnabled(i);
            int i13 = a;
            int i14 = (i13 ^ 83) + ((i13 & 83) << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return zIsEnabled;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 107) | (i2 & 107)) << 1;
            int i4 = -(((~i2) & 107) | (i2 & (-108)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
                int i6 = b;
                int i7 = ((i6 ^ 95) - (~((i6 & 95) << 1))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = a;
            int i10 = (i9 | 111) << 1;
            int i11 = -(((~i9) & 111) | (i9 & (-112)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 79;
            int i4 = -(-((i2 ^ 79) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            b = i6;
            Object obj = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            SpinnerAdapter spinnerAdapter = this.c;
            if (spinnerAdapter != null) {
                int i7 = i6 + 119;
                a = i7 % 128;
                int i8 = i7 % 2;
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
                if (i8 == 0) {
                    throw null;
                }
                int i9 = a + 67;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = b;
            int i12 = ((i11 & 38) + (i11 | 38)) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class aST extends Y implements aSQ {
        private static int a = 0;
        private static int b = 1;
        public CharSequence E;
        public ListAdapter F;
        public final Rect G;
        public int H;

        public class aSU implements AdapterView.OnItemClickListener {
            private static int a = 0;
            private static int b = 1;

            public aSU(o0OO00O o0oo00o) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                aST ast;
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 69;
                int i5 = ((i3 ^ 69) | i4) << 1;
                int i6 = -((i3 | 69) & (~i4));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    o0OO00O.this.setSelection(i);
                    ast = aST.this;
                    int i8 = 3 / 0;
                } else {
                    o0OO00O.this.setSelection(i);
                    ast = aST.this;
                }
                Object obj = null;
                if (o0OO00O.this.getOnItemClickListener() != null) {
                    int i9 = a + 13;
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        aST ast2 = aST.this;
                        o0OO00O o0oo00o = o0OO00O.this;
                        ListAdapter listAdapter = ast2.F;
                        throw null;
                    }
                    aST ast3 = aST.this;
                    o0OO00O o0oo00o2 = o0OO00O.this;
                    ListAdapter listAdapter2 = ast3.F;
                    int i10 = a;
                    int i11 = i10 & 65;
                    int i12 = ((i10 ^ 65) | i11) << 1;
                    int i13 = -((i10 | 65) & (~i11));
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        o0oo00o2.performItemClick(view, i, listAdapter2.getItemId(i));
                        obj.hashCode();
                        throw null;
                    }
                    o0oo00o2.performItemClick(view, i, listAdapter2.getItemId(i));
                    int i15 = b;
                    int i16 = ((i15 & (-26)) | ((~i15) & 25)) + ((i15 & 25) << 1);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                }
                aST.this.dismiss();
                int i18 = b;
                int i19 = ((i18 | 121) << 1) - (i18 ^ 121);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
            }
        }

        public class aSW implements PopupWindow.OnDismissListener {
            private static int a = 1;
            private static int b;
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener c;

            public aSW(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = ((i2 ^ 67) | (i2 & 67)) << 1;
                int i4 = -(((~i2) & 67) | (i2 & (-68)));
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                b = i5 % 128;
                int i6 = i5 % 2;
                ViewTreeObserver viewTreeObserver = o0OO00O.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    int i7 = b;
                    int i8 = (-2) - (((i7 ^ 114) + ((i7 & 114) << 1)) ^ (-1));
                    a = i8 % 128;
                    if (i8 % 2 == 0) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this.c);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    viewTreeObserver.removeGlobalOnLayoutListener(this.c);
                }
                int i9 = b;
                int i10 = (i9 & (-50)) | ((~i9) & 49);
                int i11 = (i9 & 49) << 1;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        public aST(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.G = new Rect();
            this.t = o0OO00O.this;
            q(true);
            this.v = new aSU(o0OO00O.this);
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public CharSequence o() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 9;
            int i4 = ((((i2 ^ 9) | i3) << 1) - (~(-((~i3) & (i2 | 9))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            CharSequence charSequence = this.E;
            int i6 = i2 & 115;
            int i7 = (((i2 ^ 115) | i6) << 1) - ((i2 | 115) & (~i6));
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 39 / 0;
            }
            return charSequence;
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void p(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-82)) | ((~i2) & 81);
            int i4 = -(-((i2 & 81) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            this.E = charSequence;
            if (i7 == 0) {
                throw null;
            }
            int i8 = (i6 ^ 37) + ((i6 & 37) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 89 / 0;
            }
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void s(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-98)) | ((~i3) & 97);
            int i5 = (i3 & 97) << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            this.H = i;
            int i8 = i3 & 121;
            int i9 = -(-(i3 | 121));
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 60 / 0;
            }
        }

        public class aSV implements ViewTreeObserver.OnGlobalLayoutListener {
            private static int a = 0;
            private static int b = 1;

            public aSV() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws Throwable {
                int i = 2 % 2;
                int i2 = a + 39;
                b = i2 % 128;
                int i3 = i2 % 2;
                aST ast = aST.this;
                o0OO00O o0oo00o = o0OO00O.this;
                Objects.requireNonNull(ast);
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                int i4 = b;
                int i5 = i4 & 123;
                int i6 = (((i4 | 123) & (~i5)) - (~(i5 << 1))) - 1;
                a = i6 % 128;
                Object obj = null;
                if (i6 % 2 != 0) {
                    T.aXa.c(o0oo00o);
                    obj.hashCode();
                    throw null;
                }
                if ((!T.aXa.c(o0oo00o)) || !o0oo00o.getGlobalVisibleRect(ast.G)) {
                    int i7 = b;
                    int i8 = (i7 ^ 31) + ((i7 & 31) << 1);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 & 15;
                    int i11 = ((((i7 ^ 15) | i10) << 1) - (~(-((i7 | 15) & (~i10))))) - 1;
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    aST.this.dismiss();
                    int i13 = b + 21;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    return;
                }
                int i15 = a;
                int i16 = i15 + 13;
                b = i16 % 128;
                int i17 = i16 % 2;
                int i18 = i15 ^ 73;
                int i19 = (((i15 & 73) | i18) << 1) - i18;
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 2 % 4;
                }
                aST.this.h();
                aST.this.f();
                int i21 = a;
                int i22 = ((i21 & (-30)) | ((~i21) & 29)) + ((i21 & 29) << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.p088k.Y
        public void n(ListAdapter listAdapter) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 15) << 1) - (~(-(((~i2) & 15) | (i2 & (-16)))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            super.n(listAdapter);
            this.F = listAdapter;
            int i5 = a;
            int i6 = (i5 & 27) + (i5 | 27);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 22 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0057  */
        /* JADX WARN: Code duplicated, block: B:17:0x007f  */
        /* JADX WARN: Code duplicated, block: B:19:0x009b  */
        public void h() {
            Drawable drawableC;
            int i;
            int i2;
            SpinnerAdapter spinnerAdapter;
            Drawable drawableC2;
            int i3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = a;
            int i8 = i7 & 77;
            int i9 = (i7 ^ 77) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0 ? (drawableC = c()) == null : (drawableC = c()) == null) {
                Rect rect = o0OO00O.this.d;
                rect.right = 0;
                int i11 = a;
                int i12 = ((i11 ^ 7) | (i11 & 7)) << 1;
                int i13 = -(((~i11) & 7) | (i11 & (-8)));
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                rect.left = 0;
                int i16 = b;
                int i17 = i16 ^ 11;
                int i18 = -(-((i16 & 11) << 1));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                i = 0;
            } else {
                drawableC.getPadding(o0OO00O.this.d);
                int i21 = b;
                int i22 = (-2) - (((i21 ^ 126) + ((i21 & 126) << 1)) ^ (-1));
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 4 / 0;
                    if (!aj.b(o0OO00O.this)) {
                        i = -o0OO00O.this.d.left;
                        int i24 = a;
                        int i25 = i24 ^ 51;
                        int i26 = -(-((i24 & 51) << 1));
                        i2 = ((i25 | i26) << 1) - (i26 ^ i25);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i27 = 3 / 5;
                        }
                    } else {
                        int i28 = b;
                        int i29 = i28 & 17;
                        int i30 = (i29 - (~(-(-((i28 ^ 17) | i29))))) - 1;
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        i = o0OO00O.this.d.right;
                        int i32 = a;
                        int i33 = ((i32 & 51) - (~(-(-(i32 | 51))))) - 1;
                        b = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else if (aj.b(o0OO00O.this)) {
                    int i210 = b;
                    int i211 = i210 & 17;
                    int i35 = (i211 - (~(-(-((i210 ^ 17) | i211))))) - 1;
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    i = o0OO00O.this.d.right;
                    int i37 = a;
                    int i38 = ((i37 & 51) - (~(-(-(i37 | 51))))) - 1;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    i = -o0OO00O.this.d.left;
                    int i212 = a;
                    int i213 = i212 ^ 51;
                    int i214 = -(-((i212 & 51) << 1));
                    i2 = ((i213 | i214) << 1) - (i214 ^ i213);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i215 = 3 / 5;
                    }
                }
            }
            int paddingLeft = o0OO00O.this.getPaddingLeft();
            o0OO00O o0oo00o = o0OO00O.this;
            int i40 = b;
            int i41 = (i40 ^ 104) + ((i40 & 104) << 1);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            a = i42 % 128;
            int i43 = i42 % 2;
            int paddingRight = o0oo00o.getPaddingRight();
            int width = o0OO00O.this.getWidth();
            int i44 = a;
            int i45 = i44 & 111;
            int i46 = ((i44 ^ 111) | i45) << 1;
            int i47 = -((i44 | 111) & (~i45));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            b = i48 % 128;
            int i49 = i48 % 2;
            o0OO00O o0oo00o2 = o0OO00O.this;
            int i50 = o0oo00o2.k;
            int i51 = b;
            int i52 = i51 & 3;
            int i53 = (~i52) & (i51 | 3);
            int i54 = i52 << 1;
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            int i56 = i55 % 128;
            a = i56;
            Object obj = null;
            if (i55 % 2 == 0 ? i50 == -2 : i50 == 28) {
                int i57 = i51 & 121;
                int i58 = (((i51 ^ 121) | i57) << 1) - ((~i57) & (i51 | 121));
                a = i58 % 128;
                if (i58 % 2 != 0) {
                    spinnerAdapter = (SpinnerAdapter) this.F;
                    drawableC2 = c();
                    int i59 = 17 / 0;
                } else {
                    spinnerAdapter = (SpinnerAdapter) this.F;
                    drawableC2 = c();
                }
                int iC = o0oo00o2.c(spinnerAdapter, drawableC2);
                o0OO00O o0oo00o3 = o0OO00O.this;
                int i60 = a + 45;
                b = i60 % 128;
                int i61 = i60 % 2;
                int i62 = o0oo00o3.getContext().getResources().getDisplayMetrics().widthPixels;
                int i63 = b;
                int i64 = (-2) - ((((i63 | 24) << 1) - (i63 ^ 24)) ^ (-1));
                a = i64 % 128;
                if (i64 % 2 != 0) {
                    Rect rect2 = o0OO00O.this.d;
                    obj.hashCode();
                    throw null;
                }
                Rect rect3 = o0OO00O.this.d;
                int i65 = -rect3.left;
                int i66 = i62 & i65;
                int i67 = ((i62 | i65) & (~i66)) + (i66 << 1);
                int i68 = -rect3.right;
                int i69 = i67 & i68;
                int i70 = (((i67 ^ i68) | i69) << 1) - ((i67 | i68) & (~i69));
                int i71 = a;
                int i72 = (i71 & (-28)) | ((~i71) & 27);
                int i73 = (i71 & 27) << 1;
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                int i75 = i74 % 128;
                b = i75;
                int i76 = i74 % 2;
                if (iC > i70) {
                    int i77 = i75 + 41;
                    int i78 = i77 % 128;
                    a = i78;
                    if (i77 % 2 != 0) {
                        int i79 = 93 / 0;
                    }
                    int i80 = (i78 | 31) << 1;
                    int i81 = -(i78 ^ 31);
                    int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                    b = i82 % 128;
                    int i83 = i82 % 2;
                    iC = i70;
                }
                int i84 = -paddingLeft;
                int i85 = ((width | i84) << 1) - (i84 ^ width);
                int i86 = -paddingRight;
                int i87 = i85 & i86;
                int i88 = -(-((i86 ^ i85) | i87));
                int iMax = Math.max(iC, (i87 & i88) + (i88 | i87));
                int i89 = b;
                int i90 = i89 & 93;
                int i91 = (i89 | 93) & (~i90);
                int i92 = -(-(i90 << 1));
                int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                a = i93 % 128;
                int i94 = i93 % 2;
                o(iMax);
                int i95 = a;
                int i96 = i95 ^ 27;
                int i97 = ((i95 & 27) | i96) << 1;
                int i98 = -i96;
                int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                b = i99 % 128;
                int i100 = i99 % 2;
            } else if (i50 == -1) {
                int i101 = i56 & 95;
                int i102 = i56 | 95;
                int i103 = (i101 & i102) + (i101 | i102);
                b = i103 % 128;
                int i104 = i103 % 2;
                int i105 = -paddingLeft;
                int i106 = width & i105;
                int i107 = i105 | width;
                int i108 = (((i106 & i107) + (i107 | i106)) - (~(-(~(-paddingRight))))) - 1;
                o((i108 ^ (-1)) + (i108 << 1));
                int i109 = b;
                int i110 = i109 & 121;
                int i111 = i109 | 121;
                int i112 = (i110 & i111) + (i111 | i110);
                a = i112 % 128;
                int i113 = i112 % 2;
            } else {
                o(i50);
                int i114 = a;
                int i115 = i114 & 17;
                int i116 = i114 | 17;
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                b = i117 % 128;
                if (i117 % 2 == 0) {
                    int i118 = 3 / 4;
                }
            }
            if (aj.b(o0OO00O.this)) {
                int i119 = b;
                int i120 = ((i119 & (-40)) | ((~i119) & 39)) + ((i119 & 39) << 1);
                a = i120 % 128;
                if (i120 % 2 != 0) {
                    i4 = this.j;
                    i5 = width % paddingRight;
                } else {
                    i4 = this.j;
                    int i121 = -paddingRight;
                    int i122 = width ^ i121;
                    i5 = (((i121 & width) | i122) << 1) - i122;
                }
                int i123 = b;
                int i124 = ((i123 | 53) << 1) - (i123 ^ 53);
                a = i124 % 128;
                if (i124 % 2 != 0) {
                    int i125 = (i5 / i4) % this.H;
                    int i126 = -(-i);
                    i3 = (i125 & i126) + (i126 | i125);
                } else {
                    int i127 = -i4;
                    int i128 = i5 & i127;
                    int i129 = (i128 + ((i127 ^ i5) | i128)) - this.H;
                    int i130 = i129 & i;
                    int i131 = ((i129 ^ i) | i130) << 1;
                    int i132 = -((i | i129) & (~i130));
                    i3 = (i131 & i132) + (i131 | i132);
                }
            } else {
                int i133 = -(-this.H);
                int i134 = ((~i133) & paddingLeft) | ((~paddingLeft) & i133);
                int i135 = -(-((i133 & paddingLeft) << 1));
                int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                int i137 = -(-i);
                int i138 = i136 ^ i137;
                int i139 = (i137 & i136) << 1;
                i3 = (i138 & i139) + (i139 | i138);
                int i140 = b;
                int i141 = (i140 & 119) + (i140 | 119);
                a = i141 % 128;
                int i142 = i141 % 2;
            }
            this.l = i3;
            int i143 = a;
            int i144 = (-2) - (((i143 & 60) + (i143 | 60)) ^ (-1));
            b = i144 % 128;
            if (i144 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00ac A[DONT_INVERT, PHI: r11
  0x00ac: PHI (r11v5 ivas.gov.bisp.enumeration.OooOOO0.o00000OO) = (r11v4 ivas.gov.bisp.enumeration.OooOOO0.o00000OO), (r11v27 ivas.gov.bisp.enumeration.OooOOO0.o00000OO) binds: [B:16:0x00aa, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:20:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:23:0x00df  */
        /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
        @Override // ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.aSQ
        public void d(int i, int i2) throws Throwable {
            boolean zE;
            PopupWindow popupWindow;
            int selectedItemPosition;
            o00000OO o00000oo;
            int i3;
            int i4;
            int i5 = 2 % 2;
            int i6 = b;
            int i7 = ((i6 & (-14)) | ((~i6) & 13)) + ((i6 & 13) << 1);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                zE = e();
                h();
                popupWindow = this.C;
                int i8 = 92 / 0;
            } else {
                zE = e();
                h();
                popupWindow = this.C;
            }
            int i9 = a;
            int i10 = i9 & 65;
            int i11 = (i9 | 65) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            popupWindow.setInputMethodMode(2);
            f();
            o00000OO o00000oo2 = this.i;
            int i15 = a;
            int i16 = (i15 | 117) << 1;
            int i17 = -(((~i15) & 117) | (i15 & (-118)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            o00000oo2.setChoiceMode(1);
            o00000oo2.setTextDirection(i);
            int i20 = a + 53;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                o00000oo2.setTextAlignment(i2);
                selectedItemPosition = o0OO00O.this.getSelectedItemPosition();
                int i21 = 73 / 0;
            } else {
                o00000oo2.setTextAlignment(i2);
                selectedItemPosition = o0OO00O.this.getSelectedItemPosition();
            }
            int i22 = a;
            int i23 = ((i22 | 55) << 1) - (i22 ^ 55);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                o00000oo = this.i;
                int i24 = 93 / 0;
                if (e()) {
                    if (o00000oo != null) {
                        int i25 = b + 82;
                        int i26 = (i25 ^ (-1)) + (i25 << 1);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        o00000oo.setListSelectionHidden(false);
                        o00000oo.setSelection(selectedItemPosition);
                        int i28 = b;
                        int i29 = i28 ^ 101;
                        int i30 = ((i28 & 101) | i29) << 1;
                        int i31 = -i29;
                        i3 = (i30 ^ i31) + ((i30 & i31) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i32 = 2 / 0;
                            if (o00000oo.getChoiceMode() != 0) {
                                int i33 = b;
                                int i34 = i33 & 27;
                                int i35 = i33 | 27;
                                i4 = ((i34 | i35) << 1) - (i35 ^ i34);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    o00000oo.setItemChecked(selectedItemPosition, false);
                                } else {
                                    o00000oo.setItemChecked(selectedItemPosition, true);
                                }
                                int i36 = b;
                                int i37 = (i36 & 99) + (i36 | 99);
                                a = i37 % 128;
                                int i38 = i37 % 2;
                            }
                        } else if (o00000oo.getChoiceMode() != 0) {
                            int i39 = b;
                            int i310 = i39 & 27;
                            int i311 = i39 | 27;
                            i4 = ((i310 | i311) << 1) - (i311 ^ i310);
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                o00000oo.setItemChecked(selectedItemPosition, false);
                            } else {
                                o00000oo.setItemChecked(selectedItemPosition, true);
                            }
                            int i312 = b;
                            int i313 = (i312 & 99) + (i312 | 99);
                            a = i313 % 128;
                            int i314 = i313 % 2;
                        }
                    }
                }
            } else {
                o00000oo = this.i;
                if (e()) {
                    if (o00000oo != null) {
                        int i210 = b + 82;
                        int i211 = (i210 ^ (-1)) + (i210 << 1);
                        a = i211 % 128;
                        int i212 = i211 % 2;
                        o00000oo.setListSelectionHidden(false);
                        o00000oo.setSelection(selectedItemPosition);
                        int i213 = b;
                        int i214 = i213 ^ 101;
                        int i315 = ((i213 & 101) | i214) << 1;
                        int i316 = -i214;
                        i3 = (i315 ^ i316) + ((i315 & i316) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i317 = 2 / 0;
                            if (o00000oo.getChoiceMode() != 0) {
                                int i318 = b;
                                int i319 = i318 & 27;
                                int i3110 = i318 | 27;
                                i4 = ((i319 | i3110) << 1) - (i3110 ^ i319);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    o00000oo.setItemChecked(selectedItemPosition, false);
                                } else {
                                    o00000oo.setItemChecked(selectedItemPosition, true);
                                }
                                int i3111 = b;
                                int i3112 = (i3111 & 99) + (i3111 | 99);
                                a = i3112 % 128;
                                int i3113 = i3112 % 2;
                            }
                        } else if (o00000oo.getChoiceMode() != 0) {
                            int i3114 = b;
                            int i3115 = i3114 & 27;
                            int i3116 = i3114 | 27;
                            i4 = ((i3115 | i3116) << 1) - (i3116 ^ i3115);
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                o00000oo.setItemChecked(selectedItemPosition, false);
                            } else {
                                o00000oo.setItemChecked(selectedItemPosition, true);
                            }
                            int i3117 = b;
                            int i3118 = (i3117 & 99) + (i3117 | 99);
                            a = i3118 % 128;
                            int i3119 = i3118 % 2;
                        }
                    }
                }
            }
            if (zE) {
                int i40 = b;
                int i41 = i40 & 125;
                int i42 = (i41 - (~((i40 ^ 125) | i41))) - 1;
                a = i42 % 128;
                int i43 = i42 % 2;
                return;
            }
            ViewTreeObserver viewTreeObserver = o0OO00O.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                aSV asv = new aSV();
                viewTreeObserver.addOnGlobalLayoutListener(asv);
                aSW asw = new aSW(asv);
                int i44 = a;
                int i45 = i44 ^ 57;
                int i46 = ((i44 & 57) | i45) << 1;
                int i47 = -i45;
                int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                b = i48 % 128;
                if (i48 % 2 == 0) {
                    this.C.setOnDismissListener(asw);
                    throw null;
                }
                this.C.setOnDismissListener(asw);
            }
            int i49 = a;
            int i50 = i49 | 73;
            int i51 = i50 << 1;
            int i52 = -((~(i49 & 73)) & i50);
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            b = i53 % 128;
            if (i53 % 2 == 0) {
                int i54 = 31 / 0;
            }
        }
    }

    static {
        int i = 55 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0214  */
    /* JADX WARN: Code duplicated, block: B:71:0x0217  */
    /* JADX WARN: Code duplicated, block: B:74:0x022f  */
    /* JADX WARN: Code duplicated, block: B:77:0x025a  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r6.hasValue(0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0OO00O(android.content.Context r11, android.util.AttributeSet r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 25) | (i2 & 25)) << 1) - (~(-(((~i2) & 25) | (i2 & (-26)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.j.d(getTextDirection(), getTextAlignment());
            int i4 = 65 / 0;
        } else {
            this.j.d(getTextDirection(), getTextAlignment());
        }
        int i5 = a;
        int i6 = i5 ^ 99;
        int i7 = (i5 & 99) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 89) << 1) - (((~i2) & 89) | (i2 & (-90)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        aSQ asq = this.j;
        if (asq != null) {
            int iG = asq.g();
            int i4 = a + 57;
            b = i4 % 128;
            int i5 = i4 % 2;
            return iG;
        }
        int dropDownVerticalOffset = super.getDropDownVerticalOffset();
        int i6 = b;
        int i7 = (((i6 ^ 37) | (i6 & 37)) << 1) - (((~i6) & 37) | (i6 & (-38)));
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 97 / 0;
        }
        return dropDownVerticalOffset;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 9;
        int i4 = ((i2 & 9) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.j == null) {
            int dropDownWidth = super.getDropDownWidth();
            int i8 = a;
            int i9 = ((i8 & 45) - (~(-(-(i8 | 45))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return dropDownWidth;
        }
        int i11 = (i2 ^ 99) + ((i2 & 99) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        int i14 = this.k;
        int i15 = i12 & 17;
        int i16 = -(-((i12 ^ 17) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        int i18 = i17 % 2;
        return i14;
    }

    public final aSQ getInternalPopup() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 37) | (i2 & 37)) << 1;
        int i4 = -(((~i2) & 37) | (i2 & (-38)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (i3 - (~((i2 ^ 105) | i3))) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Context context = this.f;
        int i5 = (i2 & (-104)) | ((~i2) & 103);
        int i6 = (i2 & 103) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return context;
        }
        throw null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        CharSequence prompt;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-4)) | ((~i2) & 3);
        int i4 = (i2 & 3) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        aSQ asq = this.j;
        if (asq != null) {
            prompt = asq.o();
            int i6 = a;
            int i7 = (i6 ^ 123) + ((i6 & 123) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            prompt = super.getPrompt();
            int i9 = a;
            int i10 = (((i9 | 6) << 1) - (i9 ^ 6)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = (i12 & 67) + (i12 | 67);
        b = i13 % 128;
        int i14 = i13 % 2;
        return prompt;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList colorStateListE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 17) | (i2 & 17)) << 1;
        int i4 = -((i2 & (-18)) | ((~i2) & 17));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.e;
        if (rVar != null) {
            int i7 = i2 & 61;
            int i8 = -(-(i2 | 61));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            colorStateListE = rVar.e();
            int i11 = a;
            int i12 = ((i11 ^ 53) | (i11 & 53)) << 1;
            int i13 = -(((~i11) & 53) | (i11 & (-54)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 2 % 4;
            }
        } else {
            int i16 = (i2 & (-78)) | ((~i2) & 77);
            int i17 = (i2 & 77) << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            a = i18 % 128;
            int i19 = i18 % 2;
            colorStateListE = null;
        }
        int i20 = a + 65;
        b = i20 % 128;
        int i21 = i20 % 2;
        return colorStateListE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r2.onTouch(r5, r6) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r6 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b;
        r2 = r6 & 53;
        r1 = ((r6 ^ 53) | r2) << 1;
        r6 = -((r6 | 53) & (~r2));
        r2 = (r1 ^ r6) + ((r6 & r1) << 1);
        ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r1 != false) goto L13;
     */
    @Override // android.widget.Spinner, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a
            r2 = r1 & (-84)
            int r3 = ~r1
            r3 = r3 & 83
            r2 = r2 | r3
            r1 = r1 & 83
            r3 = 1
            int r1 = r1 << r3
            int r1 = -r1
            int r1 = -r1
            r4 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L69
            ivas.gov.bisp.enumeration.k.n r2 = r5.g
            if (r2 == 0) goto L57
            r4 = r1 ^ 73
            r1 = r1 & 73
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L39
            boolean r1 = r2.onTouch(r5, r6)
            r2 = 65
            int r2 = r2 / 0
            if (r1 == 0) goto L57
            goto L3f
        L39:
            boolean r1 = r2.onTouch(r5, r6)
            if (r1 == 0) goto L57
        L3f:
            int r6 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b
            r1 = r6 ^ 53
            r2 = r6 & 53
            r1 = r1 | r2
            int r1 = r1 << r3
            int r2 = ~r2
            r6 = r6 | 53
            r6 = r6 & r2
            int r6 = -r6
            r2 = r1 ^ r6
            r6 = r6 & r1
            int r6 = r6 << r3
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r6
            int r2 = r2 % r0
            return r3
        L57:
            boolean r6 = super.onTouchEvent(r6)
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b
            int r1 = r1 + 98
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r2
            int r1 = r1 % r0
            return r6
        L69:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 69;
        int i4 = ((i2 & 69) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        setAdapter((SpinnerAdapter) adapter);
        int i8 = a + 7;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 98 / 0;
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        aSQ asq = this.j;
        if (asq != null) {
            int i6 = i4 ^ 7;
            int i7 = (((i4 & 7) | i6) << 1) - i6;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                asq.r(drawable);
                return;
            } else {
                asq.r(drawable);
                int i8 = 95 / 0;
                return;
            }
        }
        super.setPopupBackgroundDrawable(drawable);
        int i9 = a;
        int i10 = i9 ^ 5;
        int i11 = ((i9 & 5) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 & i12) + (i11 | i12);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b + 101;
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableC = A.c(getPopupContext(), i);
        if (i4 != 0) {
            setPopupBackgroundDrawable(drawableC);
        } else {
            setPopupBackgroundDrawable(drawableC);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 15;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r rVar = this.e;
        if (rVar != null) {
            int i4 = (i2 ^ 55) + ((i2 & 55) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            rVar.k(colorStateList);
            int i6 = a;
            int i7 = (i6 & 105) + (i6 | 105);
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = a + 79;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 86) + (i2 | 86)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        r rVar = this.e;
        if (rVar != null) {
            int i6 = ((i4 | 64) << 1) - (i4 ^ 64);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            rVar.c(mode);
            int i9 = b + 81;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b + 123;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 78) << 1) - (i2 ^ 78)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        aSQ asq = this.j;
        if (asq == null) {
            int dropDownHorizontalOffset = super.getDropDownHorizontalOffset();
            int i5 = a;
            int i6 = i5 & 41;
            int i7 = (i5 | 41) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return dropDownHorizontalOffset;
        }
        int i11 = ((i2 & 84) + (i2 | 84)) - 1;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            asq.c();
            throw null;
        }
        int iC = asq.c();
        int i12 = b;
        int i13 = (((i12 ^ 85) | (i12 & 85)) << 1) - (((~i12) & 85) | (i12 & (-86)));
        a = i13 % 128;
        int i14 = i13 % 2;
        return iC;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        int i = 2 % 2;
        int i2 = a + 4;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        aSQ asq = this.j;
        if (asq != null) {
            int i5 = i4 + 117;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return asq.h();
            }
            asq.h();
            obj.hashCode();
            throw null;
        }
        Drawable popupBackground = super.getPopupBackground();
        int i6 = a;
        int i7 = ((i6 ^ 104) + ((i6 & 104) << 1)) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 86 / 0;
        }
        return popupBackground;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        PorterDuff.Mode modeF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = -(-((i2 & 71) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        r rVar = this.e;
        if (rVar != null) {
            int i7 = i2 | 105;
            int i8 = i7 << 1;
            int i9 = -((~(i2 & 105)) & i7);
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            modeF = rVar.f();
            int i12 = b;
            int i13 = i12 & 41;
            int i14 = (i12 | 41) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 & i15) + (i14 | i15);
            a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = ((i2 ^ 110) + ((i2 & 110) << 1)) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            modeF = null;
        }
        int i20 = a;
        int i21 = ((i20 | 21) << 1) - (i20 ^ 21);
        b = i21 % 128;
        int i22 = i21 % 2;
        return modeF;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = i3 + ((i2 ^ 9) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            super.onDetachedFromWindow();
            throw null;
        }
        super.onDetachedFromWindow();
        aSQ asq = this.j;
        if (asq != null) {
            int i5 = b;
            int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (!(!asq.e())) {
                int i8 = b;
                int i9 = i8 & 93;
                int i10 = -(-((i8 ^ 93) | i9));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                this.j.dismiss();
                int i13 = b;
                int i14 = i13 | 43;
                int i15 = i14 << 1;
                int i16 = -((~(i13 & 43)) & i14);
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 3 % 4;
                }
            }
        }
        int i19 = b;
        int i20 = (i19 & 45) + (i19 | 45);
        a = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int size;
        int iMin;
        int measuredHeight;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 5) + (i4 | 5);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            super.onMeasure(i, i2);
            throw null;
        }
        super.onMeasure(i, i2);
        if (this.j != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int i6 = b;
            int i7 = ((((i6 ^ 5) | (i6 & 5)) << 1) - (~(-(((~i6) & 5) | (i6 & (-6)))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                getMeasuredWidth();
                getAdapter();
                getBackground();
                obj.hashCode();
                throw null;
            }
            int measuredWidth = getMeasuredWidth();
            SpinnerAdapter adapter = getAdapter();
            Drawable background = getBackground();
            int i8 = b;
            int i9 = i8 | 33;
            int i10 = (i9 << 1) - ((~(i8 & 33)) & i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                iMax = Math.max(measuredWidth, c(adapter, background));
                size = View.MeasureSpec.getSize(i);
                int i11 = 64 / 0;
            } else {
                iMax = Math.max(measuredWidth, c(adapter, background));
                size = View.MeasureSpec.getSize(i);
            }
            int i12 = a;
            int i13 = i12 | 13;
            int i14 = ((i13 << 1) - (~(-((~(i12 & 13)) & i13)))) - 1;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                iMin = Math.min(iMax, size);
                measuredHeight = getMeasuredHeight();
                int i15 = 72 / 0;
            } else {
                iMin = Math.min(iMax, size);
                measuredHeight = getMeasuredHeight();
            }
            int i16 = a;
            int i17 = i16 ^ 83;
            int i18 = (((i16 & 83) | i17) << 1) - i17;
            b = i18 % 128;
            int i19 = i18 % 2;
            setMeasuredDimension(iMin, measuredHeight);
            int i20 = (-2) - ((b + 114) ^ (-1));
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = (i22 & 85) + (i22 | 85);
        a = i23 % 128;
        int i24 = i23 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x007a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0032  */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        int i;
        int i2 = 2 % 2;
        aSN asn = new aSN(super.onSaveInstanceState());
        aSQ asq = this.j;
        int i3 = a;
        int i4 = ((i3 ^ 9) | (i3 & 9)) << 1;
        int i5 = -(((~i3) & 9) | (i3 & (-10)));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            if (asq != null) {
                if (asq.e()) {
                    int i7 = b;
                    int i8 = ((i7 & 80) + (i7 | 80)) - 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 ^ 7;
                    int i11 = (i7 & 7) << 1;
                    int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                }
            }
            asn.d = z;
            int i14 = a;
            i = (i14 ^ 19) + ((i14 & 19) << 1);
            b = i % 128;
            if (i % 2 != 0) {
                int i15 = 62 / 0;
            }
            return asn;
        }
        int i16 = 7 / 0;
        if (asq != null) {
            if (asq.e()) {
                int i17 = b;
                int i18 = ((i17 & 80) + (i17 | 80)) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
                int i110 = i17 ^ 7;
                int i111 = (i17 & 7) << 1;
                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                a = i112 % 128;
                int i113 = i112 % 2;
                z = true;
            }
        }
        asn.d = z;
        int i114 = a;
        i = (i114 ^ 19) + ((i114 & 19) << 1);
        b = i % 128;
        if (i % 2 != 0) {
            int i115 = 62 / 0;
        }
        return asn;
        int i20 = b;
        int i21 = i20 & 45;
        int i22 = (((i20 ^ 45) | i21) << 1) - ((i20 | 45) & (~i21));
        a = i22 % 128;
        int i23 = i22 % 2;
        z = false;
        asn.d = z;
        int i116 = a;
        i = (i116 ^ 19) + ((i116 & 19) << 1);
        b = i % 128;
        if (i % 2 != 0) {
            int i117 = 62 / 0;
        }
        return asn;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 123) | (i2 & 123)) << 1;
        int i4 = -((i2 & (-124)) | ((~i2) & 123));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        aSQ asq = this.j;
        if (asq == null) {
            boolean zPerformClick = super.performClick();
            int i7 = a;
            int i8 = i7 & 5;
            int i9 = -(-((i7 ^ 5) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return zPerformClick;
        }
        int i12 = (((i2 & (-32)) | ((~i2) & 31)) - (~((i2 & 31) << 1))) - 1;
        b = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            asq.e();
            obj.hashCode();
            throw null;
        }
        if (!asq.e()) {
            int i13 = b;
            int i14 = (i13 | 71) << 1;
            int i15 = -(((~i13) & 71) | (i13 & (-72)));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                d();
                int i17 = 61 / 0;
            } else {
                d();
            }
        }
        int i18 = (-2) - ((a + 82) ^ (-1));
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 71;
        int i5 = (((i3 | 71) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        super.setBackgroundResource(i);
        r rVar = this.e;
        if (rVar != null) {
            int i7 = b;
            int i8 = i7 | 47;
            int i9 = (i8 << 1) - ((~(i7 & 47)) & i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            rVar.h(i);
            int i11 = b;
            int i12 = (i11 & (-102)) | ((~i11) & 101);
            int i13 = (i11 & 101) << 1;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 & 105;
        int i18 = i16 | 105;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.k = r5;
        r5 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r4.k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        super.setDropDownWidth(r5);
        r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b;
        r1 = r5 ^ 33;
        r5 = (((r5 & 33) | r1) << 1) - r1;
        ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r4.j != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4.j != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r1 + 89;
        ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r1 % 128;
     */
    @Override // android.widget.Spinner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDropDownWidth(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a
            r2 = r1 ^ 25
            r1 = r1 & 25
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            r3 = r1 | r2
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L23
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O$aSQ r2 = r4.j
            r3 = 89
            int r3 = r3 / 0
            if (r2 == 0) goto L3a
            goto L27
        L23:
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O$aSQ r2 = r4.j
            if (r2 == 0) goto L3a
        L27:
            int r1 = r1 + 89
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L37
            r4.k = r5
            r5 = 14
            int r5 = r5 / 0
            goto L39
        L37:
            r4.k = r5
        L39:
            return
        L3a:
            super.setDropDownWidth(r5)
            int r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b
            r1 = r5 ^ 33
            r5 = r5 & 33
            r5 = r5 | r1
            int r5 = r5 << 1
            int r5 = r5 - r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.setDropDownWidth(int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v9 ivas.gov.bisp.enumeration.k.r) = (r1v8 ivas.gov.bisp.enumeration.k.r), (r1v22 ivas.gov.bisp.enumeration.k.r) binds: [B:8:0x002d, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        r rVar;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-72)) | ((~i3) & 71);
        int i5 = -(-((i3 & 71) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            super.drawableStateChanged();
            rVar = this.e;
            int i7 = 20 / 0;
            if (rVar != null) {
                rVar.d();
                int i8 = b;
                i = ((i8 & 76) + (i8 | 76)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i9 = 3 % 5;
                }
            }
        } else {
            super.drawableStateChanged();
            rVar = this.e;
            if (rVar != null) {
                rVar.d();
                int i10 = b;
                i = ((i10 & 76) + (i10 | 76)) - 1;
                a = i % 128;
                if (i % 2 == 0) {
                    int i11 = 3 % 5;
                }
            }
        }
        int i12 = b;
        int i13 = ((((i12 ^ 23) | (i12 & 23)) << 1) - (~(-(((~i12) & 23) | (i12 & (-24)))))) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = (i2 & 107) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.setBackgroundDrawable(drawable);
        r rVar = this.e;
        Object obj = null;
        if (rVar != null) {
            int i7 = b + 3;
            a = i7 % 128;
            int i8 = i7 % 2;
            rVar.i();
            if (i8 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i9 = a;
        int i10 = (i9 ^ 35) + ((i9 & 35) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        super.setDropDownHorizontalOffset(r5);
        r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a;
        r1 = ((r5 | 75) << 1) - (r5 ^ 75);
        ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r1.s(r5);
        r4.j.b(r5);
        r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b;
        r1 = (r5 & 17) + (r5 | 17);
        ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override // android.widget.Spinner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDropDownHorizontalOffset(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a
            r2 = r1 & 103(0x67, float:1.44E-43)
            r1 = r1 | 103(0x67, float:1.44E-43)
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b = r1
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O$aSQ r1 = r4.j
            if (r3 == 0) goto L1f
            r2 = 28
            int r2 = r2 / 0
            if (r1 == 0) goto L3d
            goto L21
        L1f:
            if (r1 == 0) goto L3d
        L21:
            r1.s(r5)
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O$aSQ r1 = r4.j
            r1.b(r5)
            int r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b
            r1 = r5 & 17
            r5 = r5 | 17
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L38
            return
        L38:
            r5 = 0
            r5.hashCode()
            throw r5
        L3d:
            super.setDropDownHorizontalOffset(r5)
            int r5 = ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.a
            r1 = r5 | 75
            int r1 = r1 << 1
            r5 = r5 ^ 75
            int r1 = r1 - r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.b = r5
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o0OO00O.setDropDownHorizontalOffset(int):void");
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 95;
        int i5 = ((i3 ^ 95) | i4) << 1;
        int i6 = -((i3 | 95) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            throw null;
        }
        aSQ asq = this.j;
        if (asq != null) {
            asq.q(i);
            int i8 = b + 21;
            a = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        super.setDropDownVerticalOffset(i);
        int i10 = b;
        int i11 = i10 & 25;
        int i12 = i10 | 25;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 28) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        aSQ asq = this.j;
        if (asq == null) {
            super.setPrompt(charSequence);
            int i5 = a;
            int i6 = i5 | 91;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 91)) & i6);
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int i11 = i2 & 113;
        int i12 = (i2 ^ 113) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        asq.p(charSequence);
        int i15 = a;
        int i16 = i15 ^ 107;
        int i17 = ((i15 & 107) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 27 / 0;
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 57;
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        aSN asn = (aSN) parcelable;
        super.onRestoreInstanceState(asn.getSuperState());
        if (!(!asn.d)) {
            int i7 = a;
            int i8 = ((i7 & 40) + (i7 | 40)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                getViewTreeObserver();
                throw null;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new aSP());
                int i9 = a;
                int i10 = i9 ^ 55;
                int i11 = (i9 & 55) << 1;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        int i14 = b;
        int i15 = i14 & 7;
        int i16 = (i14 | 7) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        int i = 2 % 2;
        int i2 = b + 33;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (!this.h) {
            int i5 = i3 + 89;
            b = i5 % 128;
            int i6 = i5 % 2;
            this.i = spinnerAdapter;
            int i7 = (i3 ^ 65) + ((i3 & 65) << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 83 / 0;
                return;
            }
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.j != null) {
            int i9 = b;
            int i10 = i9 + 125;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Context context = this.f;
            if (context == null) {
                int i11 = i9 & 39;
                int i12 = i11 + ((i9 ^ 39) | i11);
                a = i12 % 128;
                int i13 = i12 % 2;
                context = getContext();
                int i14 = b + 39;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            aSQ asq = this.j;
            aSS ass = new aSS(spinnerAdapter, context.getTheme());
            int i16 = a;
            int i17 = i16 & 105;
            int i18 = i17 + ((i16 ^ 105) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            asq.j(ass);
            if (i19 != 0) {
                int i20 = 87 / 0;
            }
            int i21 = b + 55;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = a;
        int i24 = i23 & 53;
        int i25 = (i23 | 53) & (~i24);
        int i26 = i24 << 1;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0146  */
    /* JADX WARN: Code duplicated, block: B:35:0x0158  */
    /* JADX WARN: Code duplicated, block: B:40:0x0182  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c A[SYNTHETIC] */
    public int c(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i;
        int i2;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i3;
        int count;
        int i4;
        int iMin;
        int i5;
        int iMax2;
        View view;
        int i6;
        int i7;
        int itemViewType;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = ((i10 ^ 59) - (~((i10 & 59) << 1))) - 1;
        a = i11 % 128;
        int iMax3 = 0;
        if (i11 % 2 == 0) {
            if (spinnerAdapter != null) {
                i = 1;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int measuredHeight = getMeasuredHeight();
                int i12 = b + 37;
                a = i12 % 128;
                int i13 = i12 % 2;
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 0);
                iMax = Math.max(0, getSelectedItemPosition());
                i3 = a + 105;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    count = spinnerAdapter.getCount();
                    i4 = iMax << 99;
                } else {
                    count = spinnerAdapter.getCount();
                    i4 = iMax + 15;
                }
                iMin = Math.min(count, i4);
                int i14 = a;
                i5 = (i14 ^ 53) + ((i14 & 53) << 1);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    iMax2 = Math.max(1, iMax * (68 >> (iMin >>> iMax)));
                } else {
                    int i15 = -iMax;
                    int i16 = iMin & i15;
                    int i17 = -(-((i15 ^ iMin) | i16));
                    int i18 = -(15 - (((i16 | i17) << 1) - (i17 ^ i16)));
                    int i19 = iMax & i18;
                    int i20 = iMax | i18;
                    iMax2 = Math.max(0, (i19 ^ i20) + ((i20 & i19) << 1));
                }
                int i21 = b;
                int i22 = ((i21 | 5) << 1) - (i21 ^ 5);
                a = i22 % 128;
                int i23 = i22 % 2;
                view = null;
                while (iMax2 < iMin) {
                    int i24 = b;
                    int i25 = i24 & 35;
                    i7 = (i25 - (~(-(-((i24 ^ 35) | i25))))) - 1;
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        spinnerAdapter.getItemViewType(iMax2);
                        throw null;
                    }
                    itemViewType = spinnerAdapter.getItemViewType(iMax2);
                    if (itemViewType != i) {
                        int i26 = a;
                        int i27 = ((i26 & (-62)) | ((~i26) & 61)) + ((i26 & 61) << 1);
                        b = i27 % 128;
                        int i28 = i27 % 2;
                        int i29 = i26 ^ 125;
                        int i30 = ((i26 & 125) | i29) << 1;
                        int i31 = -i29;
                        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        view = null;
                        i = itemViewType;
                    }
                    view = spinnerAdapter.getView(iMax2, view, this);
                    if (view.getLayoutParams() == null) {
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        int i34 = b;
                        int i35 = (i34 & 45) + (i34 | 45);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                        view.setLayoutParams(layoutParams);
                        int i37 = b;
                        int i38 = i37 & 33;
                        int i39 = -(-((i37 ^ 33) | i38));
                        int i40 = (i38 & i39) + (i39 | i38);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int i42 = a;
                    int i43 = i42 & 117;
                    i8 = i43 + ((i42 ^ 117) | i43);
                    b = i8 % 128;
                    if (i8 % 2 != 0) {
                        iMax3 = Math.max(iMax3, view.getMeasuredWidth());
                        iMax2 = ((iMax2 ^ 93) + ((iMax2 & 93) << 1)) - 1;
                    } else {
                        iMax3 = Math.max(iMax3, view.getMeasuredWidth());
                        int i44 = iMax2 & 1;
                        int i45 = (iMax2 | 1) & (~i44);
                        int i46 = i44 << 1;
                        iMax2 = (i45 & i46) + (i45 | i46);
                    }
                    int i47 = b;
                    int i48 = (((i47 | 28) << 1) - (i47 ^ 28)) - 1;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                }
                if (drawable != null) {
                    int i50 = b;
                    int i51 = ((i50 & (-88)) | ((~i50) & 87)) + ((i50 & 87) << 1);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    drawable.getPadding(this.d);
                    Rect rect = this.d;
                    int i53 = a;
                    int i54 = i53 & 79;
                    int i55 = ((i53 ^ 79) | i54) << 1;
                    int i56 = -((i53 | 79) & (~i54));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    int i59 = -(~(-(-((rect.left - (~rect.right)) - 1))));
                    iMax3 = ((iMax3 & i59) + (i59 | iMax3)) - 1;
                    int i60 = b;
                    int i61 = i60 & 27;
                    int i62 = -(-((i60 ^ 27) | i61));
                    int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
                int i65 = b;
                i6 = ((i65 & 121) - (~(i65 | 121))) - 1;
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    return iMax3;
                }
                throw null;
            }
            int i66 = (i10 | 109) << 1;
            int i67 = -((i10 & (-110)) | ((~i10) & 109));
            int i68 = (i66 & i67) + (i66 | i67);
            int i69 = i68 % 128;
            a = i69;
            int i70 = i68 % 2;
            i2 = ((i69 | 47) << 1) - (i69 ^ 47);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        if (spinnerAdapter != null) {
            i = 0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int measuredHeight2 = getMeasuredHeight();
            int i110 = b + 37;
            a = i110 % 128;
            int i111 = i110 % 2;
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 0);
            iMax = Math.max(0, getSelectedItemPosition());
            i3 = a + 105;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                count = spinnerAdapter.getCount();
                i4 = iMax << 99;
            } else {
                count = spinnerAdapter.getCount();
                i4 = iMax + 15;
            }
            iMin = Math.min(count, i4);
            int i112 = a;
            i5 = (i112 ^ 53) + ((i112 & 53) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                iMax2 = Math.max(1, iMax * (68 >> (iMin >>> iMax)));
            } else {
                int i113 = -iMax;
                int i114 = iMin & i113;
                int i115 = -(-((i113 ^ iMin) | i114));
                int i116 = -(15 - (((i114 | i115) << 1) - (i115 ^ i114)));
                int i117 = iMax & i116;
                int i210 = iMax | i116;
                iMax2 = Math.max(0, (i117 ^ i210) + ((i210 & i117) << 1));
            }
            int i211 = b;
            int i212 = ((i211 | 5) << 1) - (i211 ^ 5);
            a = i212 % 128;
            int i213 = i212 % 2;
            view = null;
            while (iMax2 < iMin) {
                int i214 = b;
                int i215 = i214 & 35;
                i7 = (i215 - (~(-(-((i214 ^ 35) | i215))))) - 1;
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    spinnerAdapter.getItemViewType(iMax2);
                    throw null;
                }
                itemViewType = spinnerAdapter.getItemViewType(iMax2);
                if (itemViewType != i) {
                    int i216 = a;
                    int i217 = ((i216 & (-62)) | ((~i216) & 61)) + ((i216 & 61) << 1);
                    b = i217 % 128;
                    int i218 = i217 % 2;
                    int i219 = i216 ^ 125;
                    int i310 = ((i216 & 125) | i219) << 1;
                    int i311 = -i219;
                    int i312 = (i310 ^ i311) + ((i310 & i311) << 1);
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    view = null;
                    i = itemViewType;
                }
                view = spinnerAdapter.getView(iMax2, view, this);
                if (view.getLayoutParams() == null) {
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                    int i314 = b;
                    int i315 = (i314 & 45) + (i314 | 45);
                    a = i315 % 128;
                    int i316 = i315 % 2;
                    view.setLayoutParams(layoutParams2);
                    int i317 = b;
                    int i318 = i317 & 33;
                    int i319 = -(-((i317 ^ 33) | i318));
                    int i410 = (i318 & i319) + (i319 | i318);
                    a = i410 % 128;
                    int i411 = i410 % 2;
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int i412 = a;
                int i413 = i412 & 117;
                i8 = i413 + ((i412 ^ 117) | i413);
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    iMax3 = Math.max(iMax3, view.getMeasuredWidth());
                    iMax2 = ((iMax2 ^ 93) + ((iMax2 & 93) << 1)) - 1;
                } else {
                    iMax3 = Math.max(iMax3, view.getMeasuredWidth());
                    int i414 = iMax2 & 1;
                    int i415 = (iMax2 | 1) & (~i414);
                    int i416 = i414 << 1;
                    iMax2 = (i415 & i416) + (i415 | i416);
                }
                int i417 = b;
                int i418 = (((i417 | 28) << 1) - (i417 ^ 28)) - 1;
                a = i418 % 128;
                int i419 = i418 % 2;
            }
            if (drawable != null) {
                int i510 = b;
                int i511 = ((i510 & (-88)) | ((~i510) & 87)) + ((i510 & 87) << 1);
                a = i511 % 128;
                int i512 = i511 % 2;
                drawable.getPadding(this.d);
                Rect rect2 = this.d;
                int i513 = a;
                int i514 = i513 & 79;
                int i515 = ((i513 ^ 79) | i514) << 1;
                int i516 = -((i513 | 79) & (~i514));
                int i517 = ((i515 | i516) << 1) - (i516 ^ i515);
                b = i517 % 128;
                int i518 = i517 % 2;
                int i519 = -(~(-(-((rect2.left - (~rect2.right)) - 1))));
                iMax3 = ((iMax3 & i519) + (i519 | iMax3)) - 1;
                int i610 = b;
                int i611 = i610 & 27;
                int i612 = -(-((i610 ^ 27) | i611));
                int i613 = ((i611 | i612) << 1) - (i612 ^ i611);
                a = i613 % 128;
                int i614 = i613 % 2;
            }
            int i615 = b;
            i6 = ((i615 & 121) - (~(i615 | 121))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return iMax3;
            }
            throw null;
        }
        int i616 = (i10 | 109) << 1;
        int i617 = -((i10 & (-110)) | ((~i10) & 109));
        int i618 = (i616 & i617) + (i616 | i617);
        int i619 = i618 % 128;
        a = i619;
        int i71 = i618 % 2;
        i2 = ((i619 | 47) << 1) - (i619 ^ 47);
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return 0;
        }
        throw null;
    }
}
