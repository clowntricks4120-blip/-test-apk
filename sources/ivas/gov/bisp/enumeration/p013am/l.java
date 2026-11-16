package ivas.gov.bisp.enumeration.p013am;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import ivas.gov.bisp.enumeration.O.r;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class l extends SpannableStringBuilder {
    private static int a = 1;
    private static int b;
    public final Class<?> c;
    public final List<aXZ> d;

    public static class aXZ implements TextWatcher, SpanWatcher {
        private static int a = 0;
        private static int b = 1;
        public final Object c;
        public final AtomicInteger d = new AtomicInteger(0);

        public aXZ(Object obj) {
            this.c = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 52) + (i2 | 52)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            ((TextWatcher) this.c).afterTextChanged(editable);
            int i5 = b;
            int i6 = i5 & 73;
            int i7 = (i6 - (~(-(-((i5 ^ 73) | i6))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 + 73;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            TextWatcher textWatcher = (TextWatcher) this.c;
            int i7 = (i5 ^ 13) + ((i5 & 13) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            int i9 = b;
            int i10 = ((i9 ^ 33) - (~((i9 & 33) << 1))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = a + 5;
            b = i6 % 128;
            int i7 = i6 % 2;
            if (this.d.get() > 0) {
                int i8 = a;
                int i9 = i8 + 79;
                b = i9 % 128;
                int i10 = i9 % 2;
                if (obj instanceof t) {
                    int i11 = ((i8 & 108) + (i8 | 108)) - 1;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
            }
            SpanWatcher spanWatcher = (SpanWatcher) this.c;
            int i13 = a + 9;
            b = i13 % 128;
            int i14 = i13 % 2;
            spanWatcher.onSpanChanged(spannable, obj, i, i2, i3, i4);
            int i15 = b + 19;
            a = i15 % 128;
            if (i15 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 75;
            int i6 = ((i4 ^ 75) | i5) << 1;
            int i7 = -((i4 | 75) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                this.d.get();
                throw null;
            }
            if (this.d.get() <= 0 || !(obj instanceof t)) {
                ((SpanWatcher) this.c).onSpanRemoved(spannable, obj, i, i2);
                int i9 = b;
                int i10 = i9 & 31;
                int i11 = (i9 ^ 31) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i13 = a;
            int i14 = i13 ^ 37;
            int i15 = ((i13 & 37) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 11;
            int i7 = (i5 ^ 11) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            ((TextWatcher) this.c).onTextChanged(charSequence, i, i2, i3);
            int i10 = a;
            int i11 = (i10 ^ 81) + ((i10 & 81) << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 & 70) + (i4 | 70)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.d.get();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.d.get() > 0) {
                int i6 = a;
                int i7 = i6 & 67;
                int i8 = i7 + ((i6 ^ 67) | i7);
                int i9 = i8 % 128;
                b = i9;
                int i10 = i8 % 2;
                if (obj instanceof t) {
                    int i11 = ((i9 ^ 85) | (i9 & 85)) << 1;
                    int i12 = -((i9 & (-86)) | ((~i9) & 85));
                    int i13 = (i11 & i12) + (i11 | i12);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    return;
                }
            }
            SpanWatcher spanWatcher = (SpanWatcher) this.c;
            int i15 = a;
            int i16 = ((i15 & (-16)) | ((~i15) & 15)) + ((i15 & 15) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            spanWatcher.onSpanAdded(spannable, obj, i, i2);
            int i18 = b;
            int i19 = i18 & 93;
            int i20 = -(-(i18 | 93));
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 28 / 0;
            }
        }
    }

    public l(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.d = new ArrayList();
        r.k(cls, "watcherClass cannot be null");
        this.c = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 95;
        int i4 = (i2 & 95) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.append(charSequence);
        int i7 = a;
        int i8 = (-2) - (((i7 & 100) + (i7 | 100)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 | 57;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 57)) & i5);
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        super.delete(i, i2);
        if (i9 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final aXZ f(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 12) + (i2 | 12)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 3;
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < this.d.size()) {
            int i9 = b;
            int i10 = i9 & 5;
            int i11 = ((i9 ^ 5) | i10) << 1;
            int i12 = -((i9 | 5) & (~i10));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            aXZ axz = this.d.get(i8);
            int i15 = a;
            int i16 = i15 & 105;
            int i17 = -(-((i15 ^ 105) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            if (axz.c == obj) {
                int i20 = b;
                int i21 = ((i20 | 111) << 1) - (i20 ^ 111);
                int i22 = i21 % 128;
                a = i22;
                if (i21 % 2 == 0) {
                    throw null;
                }
                int i23 = i22 ^ 75;
                int i24 = (i22 & 75) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                b = i25 % 128;
                int i26 = i25 % 2;
                return axz;
            }
            int i27 = i8 & 1;
            i8 = ((i8 ^ 1) | i27) + i27;
            int i28 = a + 28;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = (((i31 & (-92)) | ((~i31) & 91)) - (~(-(-((i31 & 91) << 1))))) - 1;
        a = i32 % 128;
        int i33 = i32 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    public final boolean g(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 37;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = false;
        if (obj != null) {
            int i5 = i2 + 81;
            b = i5 % 128;
            int i6 = i5 % 2;
            if (this.c == obj.getClass()) {
                int i7 = b + 118;
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                int i11 = i9 & 3;
                int i12 = -(-((i9 ^ 3) | i11));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                int i15 = b + 73;
                a = i15 % 128;
                int i16 = i15 % 2;
                z = false;
            }
            if (z) {
                z2 = true;
            } else {
                int i17 = a;
                int i18 = ((i17 & 103) - (~(i17 | 103))) - 1;
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            int i110 = a;
            int i111 = ((i110 & 103) - (~(i110 | 103))) - 1;
            b = i111 % 128;
            int i112 = i111 % 2;
        }
        int i20 = b;
        int i21 = (((i20 | 63) << 1) - (~(-(((~i20) & 63) | (i20 & (-64)))))) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        return z2;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        aXZ axzF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            g(obj);
            throw null;
        }
        if (g(obj) && (axzF = f(obj)) != null) {
            int i4 = a;
            int i5 = i4 + 63;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 ^ 13;
            int i8 = ((i4 & 13) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            obj = axzF;
        }
        int spanStart = super.getSpanStart(obj);
        int i12 = a;
        int i13 = i12 ^ 83;
        int i14 = ((i12 & 83) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return spanStart;
        }
        throw null;
    }

    public final void h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = -(-(i2 | 71));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 | 33) << 1) - (i6 ^ 33);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < this.d.size()) {
            int i11 = a;
            int i12 = (i11 | 67) << 1;
            int i13 = -(((~i11) & 67) | (i11 & (-68)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                this.d.get(i10);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aXZ axz = this.d.get(i10);
            int i15 = b;
            int i16 = ((i15 | 67) << 1) - (i15 ^ 67);
            a = i16 % 128;
            int i17 = i16 % 2;
            axz.d.decrementAndGet();
            int i18 = i10 & 67;
            int i19 = (((i10 ^ 67) | i18) << 1) - ((i10 | 67) & (~i18));
            i10 = (((i19 | (-66)) << 1) - (~(-(((~i19) & (-66)) | (i19 & 65))))) - 1;
            int i20 = b;
            int i21 = i20 & 103;
            int i22 = i21 + ((i20 ^ 103) | i21);
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a;
        int i25 = i24 & 113;
        int i26 = -(-((i24 ^ 113) | i25));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = a + 71;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.insert(i, charSequence);
        if (i4 != 0) {
            throw null;
        }
        int i5 = a;
        int i6 = (i5 | 101) << 1;
        int i7 = -(((~i5) & 101) | (i5 & (-102)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 47) << 1) - (i5 ^ 47);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            g(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (g(obj)) {
            aXZ axz = new aXZ(obj);
            List<aXZ> list = this.d;
            int i7 = a;
            int i8 = i7 ^ 111;
            int i9 = (i7 & 111) << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            list.add(axz);
            int i12 = a;
            int i13 = (((i12 | 88) << 1) - (i12 ^ 88)) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 5;
            }
            obj = axz;
        }
        super.setSpan(obj, i, i2, i3);
        int i15 = b;
        int i16 = ((i15 & (-36)) | ((~i15) & 35)) + ((i15 & 35) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i2) {
        int i3 = 2 % 2;
        l lVar = new l(this.c, this, i, i2);
        int i4 = b;
        int i5 = i4 & 47;
        int i6 = (((i4 | 47) & (~i5)) - (~(i5 << 1))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return lVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.append(charSequence);
        int i5 = a;
        int i6 = i5 & 77;
        int i7 = i6 + ((i5 ^ 77) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 29;
        int i6 = (i4 | 29) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        super.delete(i, i2);
        int i10 = a;
        int i11 = (((i10 | 26) << 1) - (i10 ^ 26)) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 21;
        int i4 = -(-((i2 ^ 21) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (g(obj)) {
            int i7 = a;
            int i8 = (i7 | 27) << 1;
            int i9 = -(((~i7) & 27) | (i7 & (-28)));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            aXZ axzF = f(obj);
            if (axzF != null) {
                int i12 = a;
                int i13 = i12 & 53;
                int i14 = i13 + ((i12 ^ 53) | i13);
                int i15 = i14 % 128;
                b = i15;
                int i16 = i14 % 2;
                int i17 = (-2) - ((i15 + 66) ^ (-1));
                a = i17 % 128;
                int i18 = i17 % 2;
                obj = axzF;
            }
        }
        int spanEnd = super.getSpanEnd(obj);
        int i19 = b;
        int i20 = (-2) - (((i19 ^ 2) + ((i19 & 2) << 1)) ^ (-1));
        a = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 97 / 0;
        }
        return spanEnd;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        int i = 2 % 2;
        int i2 = b + 7;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (!(!g(obj))) {
            int i4 = a;
            int i5 = i4 & 45;
            int i6 = ((i4 ^ 45) | i5) << 1;
            int i7 = -((i4 | 45) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            Object obj2 = null;
            if (i8 % 2 != 0) {
                f(obj);
                obj2.hashCode();
                throw null;
            }
            aXZ axzF = f(obj);
            if (axzF != null) {
                int i9 = a + 13;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                obj = axzF;
            }
        }
        int spanFlags = super.getSpanFlags(obj);
        int i10 = a;
        int i11 = ((i10 ^ 62) + ((i10 & 62) << 1)) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        return spanFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 ^ 37) + ((i6 & 37) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (this.c != cls) {
            int i9 = (i6 ^ 83) + ((i6 & 83) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            T[] tArr = (T[]) super.getSpans(i, i2, cls);
            int i11 = b;
            int i12 = i11 & 71;
            int i13 = (i11 | 71) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return tArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i16 = i6 + 93;
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        int i19 = i17 + 13;
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = (i17 & (-106)) | ((~i17) & 105);
        int i22 = (i17 & 105) << 1;
        int i23 = (i21 & i22) + (i21 | i22);
        b = i23 % 128;
        int i24 = i23 % 2;
        aXZ[] axzArr = (aXZ[]) super.getSpans(i, i2, aXZ.class);
        int i25 = a;
        int i26 = ((i25 ^ 21) | (i25 & 21)) << 1;
        int i27 = -(((~i25) & 21) | (i25 & (-22)));
        int i28 = (i26 & i27) + (i27 | i26);
        b = i28 % 128;
        int i29 = i28 % 2;
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, axzArr.length));
        int i30 = a + 23;
        b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = 0;
        while (i32 < axzArr.length) {
            int i33 = a + 83;
            b = i33 % 128;
            if (i33 % 2 != 0) {
                tArr2[i32] = axzArr[i32].c;
                int i34 = i32 ^ 38;
                int i35 = -(-((i32 & 38) << 1));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = i36 & 57;
                int i38 = -(-(i36 | 57));
                i3 = i37 ^ i38;
                i4 = (i37 & i38) << 1;
            } else {
                tArr2[i32] = axzArr[i32].c;
                int i39 = i32 & 1;
                int i40 = -(-((i32 ^ 1) | i39));
                i3 = i39 & i40;
                i4 = i40 | i39;
            }
            i32 = i3 + i4;
        }
        int i41 = b;
        int i42 = (i41 & 91) + (i41 | 91);
        a = i42 % 128;
        if (i42 % 2 == 0) {
            int i43 = 74 / 0;
        }
        return tArr2;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 125;
        int i5 = (i3 ^ 125) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        super.insert(i, charSequence);
        int i8 = b;
        int i9 = (i8 & (-62)) | ((~i8) & 61);
        int i10 = (i8 & 61) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        Object objF;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 39;
        int i4 = ((i2 & 39) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        Object obj2 = null;
        if (i6 % 2 != 0) {
            g(obj);
            obj2.hashCode();
            throw null;
        }
        if (!g(obj)) {
            int i7 = b;
            int i8 = (i7 | 13) << 1;
            int i9 = -(((~i7) & 13) | (i7 & (-14)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            objF = null;
        } else {
            int i12 = b;
            int i13 = i12 & 71;
            int i14 = (i12 | 71) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            objF = f(obj);
            if (i17 == 0) {
                int i18 = 66 / 0;
                if (objF != null) {
                    obj = objF;
                    int i19 = b + 67;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    objF = obj;
                }
            } else if (objF != null) {
                obj = objF;
                int i110 = b + 67;
                a = i110 % 128;
                int i21 = i110 % 2;
                objF = obj;
            }
        }
        super.removeSpan(obj);
        if (objF != null) {
            int i22 = b + 59;
            a = i22 % 128;
            int i23 = i22 % 2;
            this.d.remove(objF);
            int i24 = a;
            int i25 = (((i24 ^ 93) | (i24 & 93)) << 1) - (((~i24) & 93) | (i24 & (-94)));
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = ((i27 ^ 83) | (i27 & 83)) << 1;
        int i29 = -(((~i27) & 83) | (i27 & (-84)));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = a + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.append(charSequence);
        int i4 = a + 95;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final void d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 30) << 1) - (i2 ^ 30);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 115;
        int i7 = (i6 - (~((i2 ^ 115) | i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 5 % 3;
        }
        int i9 = 0;
        while (i9 < this.d.size()) {
            int i10 = b;
            int i11 = ((((i10 ^ 87) | (i10 & 87)) << 1) - (~(-(((~i10) & 87) | (i10 & (-88)))))) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                AtomicInteger atomicInteger = this.d.get(i9).d;
                throw null;
            }
            this.d.get(i9).d.incrementAndGet();
            int i12 = ((i9 ^ 14) | (i9 & 14)) << 1;
            int i13 = -(((~i9) & 14) | (i9 & (-15)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            int i15 = i14 & (-13);
            i9 = i15 + ((i14 ^ (-13)) | i15);
            int i16 = a;
            int i17 = i16 & 29;
            int i18 = (i17 - (~(-(-((i16 ^ 29) | i17))))) - 1;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = a;
        int i21 = (i20 & 102) + (i20 | 102);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        b = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    public final void e() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 125;
        int i5 = (i3 & 125) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        h();
        int i8 = a;
        int i9 = (i8 & (-104)) | ((~i8) & 103);
        int i10 = -(-((i8 & 103) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            Object obj = null;
            if (i13 >= this.d.size()) {
                int i14 = b;
                int i15 = i14 & 33;
                int i16 = (i15 - (~(-(-((i14 ^ 33) | i15))))) - 1;
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i17 = b;
            int i18 = i17 & 111;
            int i19 = (i17 | 111) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                this.d.get(i13);
                obj.hashCode();
                throw null;
            }
            aXZ axz = this.d.get(i13);
            int i22 = b;
            int i23 = i22 | 43;
            int i24 = (i23 << 1) - ((~(i22 & 43)) & i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            int length = length();
            int length2 = length();
            TextWatcher textWatcher = (TextWatcher) axz.c;
            int i26 = b;
            int i27 = i26 & 17;
            int i28 = (((i26 ^ 17) | i27) << 1) - ((i26 | 17) & (~i27));
            a = i28 % 128;
            if (i28 % 2 == 0) {
                textWatcher.onTextChanged(this, 1, length, length2);
                i = (i13 & 106) + (i13 | 106);
            } else {
                textWatcher.onTextChanged(this, 0, length, length2);
                i = ((((i13 ^ 1) | (i13 & 1)) << 1) - (~(-(((~i13) & 1) | (i13 & (-2)))))) - 1;
            }
            i13 = i;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 57) - (~((i5 & 57) << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        super.insert(i, charSequence, i2, i3);
        if (i7 != 0) {
            throw null;
        }
        int i8 = b;
        int i9 = (i8 & (-118)) | ((~i8) & 117);
        int i10 = (i8 & 117) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-30)) | ((~i4) & 29);
        int i6 = (i4 & 29) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (cls != null) {
            int i9 = i4 & 15;
            int i10 = ((~i9) & (i4 | 15)) + (i9 << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            if (this.c == cls) {
                int i13 = (i4 & (-2)) | ((~i4) & 1);
                int i14 = -(-((i4 & 1) << 1));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                z = true;
            } else {
                int i17 = i11 & 75;
                int i18 = (i11 | 75) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            }
            if (!(!z)) {
                cls = aXZ.class;
                int i22 = b;
                int i23 = (((i22 | 38) << 1) - (i22 ^ 38)) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
            }
        } else {
            cls = aXZ.class;
            int i25 = b;
            int i26 = (((i25 | 38) << 1) - (i25 ^ 38)) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        int iNextSpanTransition = super.nextSpanTransition(i, i2, cls);
        int i28 = a + 11;
        b = i28 % 128;
        int i29 = i28 % 2;
        return iNextSpanTransition;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable replace(int i, int i2, CharSequence charSequence) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 & (-120)) | ((~i4) & 119)) - (~(-(-((i4 & 119) << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        d();
        super.replace(i, i2, charSequence);
        h();
        int i7 = b;
        int i8 = ((((i7 ^ 115) | (i7 & 115)) << 1) - (~(-((i7 & (-116)) | ((~i7) & 115))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 25;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.append(c);
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 21;
        int i7 = ((i5 | 21) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        super.insert(i, charSequence, i2, i3);
        int i9 = a + 121;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public l(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.d = new ArrayList();
        r.k(cls, "watcherClass cannot be null");
        this.c = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 62) << 1) - (i2 ^ 62);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        super.append(c);
        int i6 = b;
        int i7 = i6 & 121;
        int i8 = -(-((i6 ^ 121) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 67 / 0;
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 79) + (i2 | 79);
        a = i3 % 128;
        int i4 = i3 % 2;
        super.append(c);
        int i5 = a;
        int i6 = ((i5 ^ 21) | (i5 & 21)) << 1;
        int i7 = -(((~i5) & 21) | (i5 & (-22)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 28) + ((i4 & 28) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        d();
        super.replace(i, i2, charSequence);
        h();
        int i7 = b + 1;
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 == 0) {
            throw null;
        }
        int i9 = i8 + 105;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 73) + (i4 | 73);
        b = i5 % 128;
        int i6 = i5 % 2;
        super.append(charSequence, i, i2);
        if (i6 != 0) {
            int i7 = 53 / 0;
        }
        int i8 = a;
        int i9 = i8 ^ 111;
        int i10 = (i8 & 111) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 48 / 0;
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 73) + (i4 | 73);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            super.append(charSequence, i, i2);
            return this;
        }
        super.append(charSequence, i, i2);
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 19;
        int i6 = (i4 | 19) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        super.append(charSequence, i, i2);
        int i10 = a;
        int i11 = ((i10 | 23) << 1) - (i10 ^ 23);
        b = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 & 81) + (i6 | 81);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            d();
            super.replace(i, i2, charSequence, i3, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d();
        super.replace(i, i2, charSequence, i3, i4);
        h();
        int i8 = a;
        int i9 = (i8 & 83) + (i8 | 83);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 85 / 0;
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 93;
        int i5 = i4 + ((i3 ^ 93) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.append(charSequence, obj, i);
        int i7 = b;
        int i8 = (i7 & (-74)) | ((~i7) & 73);
        int i9 = (i7 & 73) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return this;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 ^ 105) + ((i6 & 105) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            d();
            super.replace(i, i2, charSequence, i3, i4);
            int i8 = 60 / 0;
        } else {
            d();
            super.replace(i, i2, charSequence, i3, i4);
        }
        int i9 = (-2) - ((a + 18) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        h();
        int i11 = b;
        int i12 = ((((i11 ^ 33) | (i11 & 33)) << 1) - (~(-(((~i11) & 33) | (i11 & (-34)))))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return this;
        }
        throw null;
    }
}
