package ivas.gov.bisp.enumeration.Z;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends BaseAdapter implements Filterable, c.aRQ {
    private static int a = 1;
    private static int b;
    public c c;
    public boolean d;
    public boolean e;
    public Cursor f;
    public int g;
    public Context h;
    public aYe i;
    public DataSetObserver j;

    public class aYe extends ContentObserver {
        private static int a = 1;
        private static int b;

        public aYe() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 111;
            int i4 = ((((i2 ^ 111) | i3) << 1) - (~(-((i2 | 111) & (~i3))))) - 1;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            int i7 = i5 & 111;
            int i8 = ((i5 ^ 111) | i7) << 1;
            int i9 = -((i5 | 111) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 26 / 0;
            }
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 3;
            int i4 = (i2 | 3) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                boolean z2 = j.this.e;
                obj.hashCode();
                throw null;
            }
            j jVar = j.this;
            if (jVar.e && (cursor = jVar.f) != null) {
                int i7 = a;
                int i8 = i7 ^ 91;
                int i9 = (((i7 & 91) | i8) << 1) - i8;
                b = i9 % 128;
                int i10 = i9 % 2;
                if (!cursor.isClosed()) {
                    int i11 = a;
                    int i12 = i11 & 109;
                    int i13 = (i11 ^ 109) | i12;
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    jVar.d = jVar.f.requery();
                    int i16 = b;
                    int i17 = (i16 & (-88)) | ((~i16) & 87);
                    int i18 = -(-((i16 & 87) << 1));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            int i21 = a;
            int i22 = i21 & 115;
            int i23 = (((i21 | 115) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
            b = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
        }
    }

    public class aYf extends DataSetObserver {
        private static int a = 1;
        private static int b;

        public aYf() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 89;
            int i4 = i3 + ((i2 ^ 89) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            j jVar = j.this;
            jVar.d = true;
            int i6 = b;
            int i7 = ((i6 | 31) << 1) - (i6 ^ 31);
            a = i7 % 128;
            int i8 = i7 % 2;
            jVar.notifyDataSetChanged();
            if (i8 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i9 = a;
            int i10 = i9 & 25;
            int i11 = ((i9 ^ 25) | i10) << 1;
            int i12 = -((i9 | 25) & (~i10));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 48 / 0;
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 31) + (i2 | 31);
            a = i3 % 128;
            int i4 = i3 % 2;
            j jVar = j.this;
            jVar.d = false;
            jVar.notifyDataSetInvalidated();
            int i5 = a;
            int i6 = ((i5 ^ 59) | (i5 & 59)) << 1;
            int i7 = -(((~i5) & 59) | (i5 & (-60)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public j(Context context, Cursor cursor, boolean z) {
        char c;
        boolean z2;
        int columnIndexOrThrow;
        if (z) {
            int i = b;
            int i2 = (i & (-108)) | ((~i) & 107);
            int i3 = (i & 107) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            } else {
                int i6 = 2 % 2;
            }
            c = 1;
        } else {
            int i7 = b;
            int i8 = i7 & 95;
            int i9 = (i7 ^ 95) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
            c = 2;
        }
        if ((c & 1) == 1) {
            int i12 = a;
            int i13 = i12 & 11;
            int i14 = -(-((i12 ^ 11) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            this.e = true;
            int i18 = i16 & 91;
            int i19 = (i16 ^ 91) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 2 % 2;
        } else {
            this.e = false;
            int i23 = a;
            int i24 = i23 & 17;
            int i25 = (((i23 | 17) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            b = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 5 % 2;
            } else {
                int i27 = 2 % 2;
            }
        }
        int i28 = -1;
        if (cursor != null) {
            int i29 = a;
            int i30 = (((i29 ^ 101) | (i29 & 101)) << 1) - ((i29 & (-102)) | ((~i29) & 101));
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (-2) - (((i29 & 74) + (i29 | 74)) ^ (-1));
            b = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 2 % 2;
            }
            z2 = true;
        } else {
            int i34 = b + 23;
            a = i34 % 128;
            int i35 = i34 % 2;
            int i36 = 2 % 2;
            z2 = false;
        }
        this.f = cursor;
        this.d = z2;
        this.h = context;
        int i37 = a;
        int i38 = i37 & 69;
        int i39 = -(-((i37 ^ 69) | i38));
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        int i41 = i40 % 128;
        b = i41;
        int i42 = i40 % 2;
        if (z2) {
            int i43 = (i41 & (-52)) | ((~i41) & 51);
            int i44 = (i41 & 51) << 1;
            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
            a = i45 % 128;
            if (i45 % 2 == 0) {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int i46 = 31 / 0;
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            }
            i28 = columnIndexOrThrow;
            int i47 = b;
            int i48 = i47 & 65;
            int i49 = -(-((i47 ^ 65) | i48));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            a = i50 % 128;
            if (i50 % 2 != 0) {
                int i51 = 2 % 2;
            }
        } else {
            int i52 = ((i41 ^ 15) | (i41 & 15)) << 1;
            int i53 = -(((~i41) & 15) | (i41 & (-16)));
            int i54 = (i52 & i53) + (i53 | i52);
            a = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 2 % 2;
            }
        }
        this.g = i28;
        this.i = new aYe();
        aYf ayf = new aYf();
        int i56 = a;
        int i57 = ((i56 & (-82)) | ((~i56) & 81)) + ((i56 & 81) << 1);
        b = i57 % 128;
        Object obj = null;
        if (i57 % 2 != 0) {
            this.j = ayf;
            obj.hashCode();
            throw null;
        }
        this.j = ayf;
        if (z2) {
            int i58 = i56 | 119;
            int i59 = ((i58 << 1) - (~(-(i58 & (~(i56 & 119)))))) - 1;
            b = i59 % 128;
            int i60 = i59 % 2;
            aYe aye = this.i;
            if (aye != null) {
                int i61 = i56 & 117;
                int i62 = (((i56 ^ 117) | i61) << 1) - ((i56 | 117) & (~i61));
                b = i62 % 128;
                if (i62 % 2 != 0) {
                    cursor.registerContentObserver(aye);
                    throw null;
                }
                cursor.registerContentObserver(aye);
                int i63 = 2 % 2;
            }
            DataSetObserver dataSetObserver = this.j;
            if (dataSetObserver != null) {
                int i64 = b;
                int i65 = i64 ^ 119;
                int i66 = (i64 & 119) << 1;
                int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                a = i67 % 128;
                if (i67 % 2 == 0) {
                    cursor.registerDataSetObserver(dataSetObserver);
                    int i68 = 84 / 0;
                } else {
                    cursor.registerDataSetObserver(dataSetObserver);
                }
                int i69 = 2 % 2;
            }
        }
        int i70 = b;
        int i71 = (i70 & (-28)) | ((~i70) & 27);
        int i72 = (i70 & 27) << 1;
        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
        a = i73 % 128;
        int i74 = i73 % 2;
    }

    public abstract void c(View view, Context context, Cursor cursor);

    public abstract CharSequence e(Cursor cursor);

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = 2 % 2;
        int i3 = a + 114;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (this.d) {
            int i7 = ((i5 | 119) << 1) - (i5 ^ 119);
            a = i7 % 128;
            int i8 = i7 % 2;
            Cursor cursor = this.f;
            if (cursor != null) {
                int i9 = (i5 & 107) + (i5 | 107);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    cursor.moveToPosition(i);
                    return this.f;
                }
                cursor.moveToPosition(i);
                throw null;
            }
        }
        int i10 = a;
        int i11 = i10 & 103;
        int i12 = (i11 - (~(-(-((i10 ^ 103) | i11))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 99) << 1) - (i3 ^ 99);
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!(!this.d)) {
            int i6 = i3 & 45;
            int i7 = (i3 | 45) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            Cursor cursor = this.f;
            if (cursor != null && !(!cursor.moveToPosition(i))) {
                int i10 = b;
                int i11 = i10 & 43;
                int i12 = -(-((i10 ^ 43) | i11));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    this.f.getLong(this.g);
                    obj.hashCode();
                    throw null;
                }
                long j = this.f.getLong(this.g);
                int i14 = a;
                int i15 = (i14 & (-92)) | ((~i14) & 91);
                int i16 = (i14 & 91) << 1;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    return j;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i18 = b;
        int i19 = (i18 & (-56)) | ((~i18) & 55);
        int i20 = -(-((i18 & 55) << 1));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return 0L;
        }
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 83) + (i2 | 83);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this.d) {
            int i6 = (i4 & 65) + (i4 | 65);
            int i7 = i6 % 128;
            a = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Cursor cursor = this.f;
            if (cursor != null) {
                int i8 = i7 + 21;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    cursor.getCount();
                    obj.hashCode();
                    throw null;
                }
                int count = cursor.getCount();
                int i9 = a;
                int i10 = (((i9 & (-2)) | ((~i9) & 1)) - (~((i9 & 1) << 1))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                return count;
            }
        }
        int i12 = a;
        int i13 = i12 & 87;
        int i14 = (i13 - (~(-(-((i12 ^ 87) | i13))))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-100)) | ((~i2) & 99)) - (~((i2 & 99) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.c == null) {
            this.c = new c(this);
            int i5 = b;
            int i6 = (i5 & (-122)) | ((~i5) & 121);
            int i7 = -(-((i5 & 121) << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        c cVar = this.c;
        int i10 = a;
        int i11 = i10 & 65;
        int i12 = -(-((i10 ^ 65) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[PHI: r8
  0x009a: PHI (r8v4 ivas.gov.bisp.enumeration.Z.j$aYe) = (r8v3 ivas.gov.bisp.enumeration.Z.j$aYe), (r8v5 ivas.gov.bisp.enumeration.Z.j$aYe) binds: [B:33:0x0098, B:30:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public void d(Cursor cursor) {
        aYe aye;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 51) + ((i3 & 51) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Cursor cursor2 = this.f;
        Object obj = null;
        if (cursor == cursor2) {
            int i7 = ((i3 | 59) << 1) - (i3 ^ 59);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                int i8 = i5 + 52;
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                aYe aye2 = this.i;
                if (aye2 != null) {
                    int i10 = i5 & 31;
                    int i11 = ((i5 | 31) & (~i10)) + (i10 << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    cursor2.unregisterContentObserver(aye2);
                    int i13 = a + 17;
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 / 5;
                    }
                }
                DataSetObserver dataSetObserver = this.j;
                if (dataSetObserver != null) {
                    int i15 = a;
                    int i16 = i15 & 31;
                    int i17 = ((i15 | 31) & (~i16)) + (i16 << 1);
                    b = i17 % 128;
                    if (i17 % 2 != 0) {
                        cursor2.unregisterDataSetObserver(dataSetObserver);
                        obj.hashCode();
                        throw null;
                    }
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f = cursor;
            if (cursor != null) {
                int i18 = b;
                int i19 = i18 & 119;
                int i20 = i19 + ((i18 ^ 119) | i19);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    aye = this.i;
                    int i21 = 86 / 0;
                    if (aye != null) {
                        int i22 = i18 ^ 5;
                        int i23 = -(-((5 & i18) << 1));
                        i = ((i22 | i23) << 1) - (i23 ^ i22);
                        a = i % 128;
                        if (i % 2 == 0) {
                            cursor.registerContentObserver(aye);
                            int i24 = 40 / 0;
                        } else {
                            cursor.registerContentObserver(aye);
                        }
                    }
                } else {
                    aye = this.i;
                    if (aye != null) {
                        int i25 = i18 ^ 5;
                        int i26 = -(-((5 & i18) << 1));
                        i = ((i25 | i26) << 1) - (i26 ^ i25);
                        a = i % 128;
                        if (i % 2 == 0) {
                            cursor.registerContentObserver(aye);
                            int i27 = 40 / 0;
                        } else {
                            cursor.registerContentObserver(aye);
                        }
                    }
                }
                DataSetObserver dataSetObserver2 = this.j;
                if (dataSetObserver2 != null) {
                    int i28 = a;
                    int i29 = ((i28 ^ 98) + ((i28 & 98) << 1)) - 1;
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        cursor.registerDataSetObserver(dataSetObserver2);
                        obj.hashCode();
                        throw null;
                    }
                    cursor.registerDataSetObserver(dataSetObserver2);
                    int i30 = b;
                    int i31 = ((i30 & 28) + (i30 | 28)) - 1;
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
                this.g = cursor.getColumnIndexOrThrow("_id");
                int i33 = b + 119;
                a = i33 % 128;
                int i34 = i33 % 2;
                this.d = true;
                notifyDataSetChanged();
            } else {
                this.g = -1;
                this.d = false;
                notifyDataSetInvalidated();
                int i35 = (-2) - ((b + 74) ^ (-1));
                a = i35 % 128;
                int i36 = i35 % 2;
            }
        }
        if (cursor2 != null) {
            int i37 = b + 96;
            int i38 = (i37 ^ (-1)) + (i37 << 1);
            a = i38 % 128;
            int i39 = i38 % 2;
            cursor2.close();
            int i40 = b;
            int i41 = ((i40 & 74) + (i40 | 74)) - 1;
            a = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = a;
        int i44 = (((i43 & (-30)) | ((~i43) & 29)) - (~((i43 & 29) << 1))) - 1;
        b = i44 % 128;
        if (i44 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    /* JADX WARN: Code duplicated, block: B:14:0x007a  */
    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-70)) | ((~i4) & 69);
        int i6 = (i4 & 69) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        if (!this.d) {
            int i9 = (i4 ^ 95) + ((i4 & 95) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
        int i11 = i4 & 61;
        int i12 = (i11 - (~(-(-((i4 ^ 61) | i11))))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            this.f.moveToPosition(i);
            int i13 = 89 / 0;
            if (view == null) {
                int i14 = a;
                int i15 = (i14 & (-40)) | ((~i14) & 39);
                int i16 = (i14 & 39) << 1;
                i2 = (i15 & i16) + (i16 | i15);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    h hVar = (h) this;
                    LayoutInflater layoutInflater = hVar.k;
                    int i17 = hVar.b;
                    throw null;
                }
                h hVar2 = (h) this;
                view = hVar2.k.inflate(hVar2.b, viewGroup, false);
                int i18 = a;
                int i19 = i18 & 9;
                int i20 = (i18 | 9) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
        } else {
            this.f.moveToPosition(i);
            if (view == null) {
                int i110 = a;
                int i111 = (i110 & (-40)) | ((~i110) & 39);
                int i112 = (i110 & 39) << 1;
                i2 = (i111 & i112) + (i112 | i111);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    h hVar3 = (h) this;
                    LayoutInflater layoutInflater2 = hVar3.k;
                    int i113 = hVar3.b;
                    throw null;
                }
                h hVar4 = (h) this;
                view = hVar4.k.inflate(hVar4.b, viewGroup, false);
                int i114 = a;
                int i115 = i114 & 9;
                int i24 = (i114 | 9) & (~i115);
                int i25 = i115 << 1;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        }
        c(view, this.h, this.f);
        int i28 = a;
        int i29 = i28 + 45;
        b = i29 % 128;
        if (i29 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i30 = i28 & 99;
        int i31 = ((i28 ^ 99) | i30) << 1;
        int i32 = -((i28 | 99) & (~i30));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 27 / 0;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        View viewF;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 85;
        int i7 = (((~i6) & (i5 | 85)) - (~(-(-(i6 << 1))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (!this.d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        int i9 = ((i5 & 124) + (i5 | 124)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        if (!this.f.moveToPosition(i)) {
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.o("couldn't move cursor to position ", i));
        }
        int i11 = a;
        int i12 = i11 + 19;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 57 / 0;
            if (view == null) {
                i2 = i11 + 115;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    viewF = f(this.h, this.f, viewGroup);
                    int i14 = 5 / 0;
                } else {
                    viewF = f(this.h, this.f, viewGroup);
                }
                view = viewF;
                int i15 = b;
                int i16 = i15 & 55;
                int i17 = (i15 | 55) & (~i16);
                int i18 = i16 << 1;
                i3 = ((i17 | i18) << 1) - (i17 ^ i18);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i19 = 2 / 2;
                }
            }
        } else if (view == null) {
            i2 = i11 + 115;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                viewF = f(this.h, this.f, viewGroup);
                int i110 = 5 / 0;
            } else {
                viewF = f(this.h, this.f, viewGroup);
            }
            view = viewF;
            int i111 = b;
            int i112 = i111 & 55;
            int i113 = (i111 | 55) & (~i112);
            int i114 = i112 << 1;
            i3 = ((i113 | i114) << 1) - (i113 ^ i114);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i115 = 2 / 2;
            }
        }
        c(view, this.h, this.f);
        int i20 = b;
        int i21 = i20 & 85;
        int i22 = (i21 - (~(-(-((i20 ^ 85) | i21))))) - 1;
        a = i22 % 128;
        if (i22 % 2 != 0) {
            return view;
        }
        throw null;
    }
}
