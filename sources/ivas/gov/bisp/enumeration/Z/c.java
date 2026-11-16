package ivas.gov.bisp.enumeration.Z;

import android.database.Cursor;
import android.widget.Filter;
import ivas.gov.bisp.enumeration.p088k.U;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c extends Filter {
    private static int a = 1;
    private static int b;
    public aRQ c;

    public interface aRQ {
    }

    public c(aRQ arq) {
        this.c = arq;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 34) + (i2 | 34)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        U u = (U) this.c;
        int i6 = (i4 & (-18)) | ((~i4) & 17);
        int i7 = (i4 & 17) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        CharSequence charSequenceE = u.e((Cursor) obj);
        int i10 = b;
        int i11 = ((((i10 ^ 11) | (i10 & 11)) << 1) - (~(-(((~i10) & 11) | (i10 & (-12)))))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return charSequenceE;
        }
        throw null;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Cursor cursor = ((j) this.c).f;
            throw null;
        }
        aRQ arq = this.c;
        Cursor cursor2 = ((j) arq).f;
        Object obj2 = filterResults.values;
        if (obj2 != null) {
            int i4 = a;
            int i5 = i4 & 25;
            int i6 = ((i4 ^ 25) | i5) << 1;
            int i7 = -((i4 | 25) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (obj2 != cursor2) {
                ((U) arq).d((Cursor) obj2);
                int i9 = b;
                int i10 = (i9 & 1) + (i9 | 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = a;
        int i13 = ((i12 ^ 3) | (i12 & 3)) << 1;
        int i14 = -(((~i12) & 3) | (i12 & (-4)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorN;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        U u = (U) this.c;
        Objects.requireNonNull(u);
        Object obj = null;
        if (charSequence == null) {
            int i5 = b;
            int i6 = i5 ^ 49;
            int i7 = ((i5 & 49) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            int i10 = i5 & 89;
            int i11 = (i10 - (~(-(-((i5 ^ 89) | i10))))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            string = BuildConfig.FLAVOR;
        } else {
            string = charSequence.toString();
            int i13 = a + 126;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        if (u.p.getVisibility() == 0) {
            int i16 = b;
            int i17 = i16 & 77;
            int i18 = (i17 - (~((i16 ^ 77) | i17))) - 1;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                u.p.getWindowVisibility();
                obj.hashCode();
                throw null;
            }
            if (u.p.getWindowVisibility() == 0) {
                try {
                    cursorN = u.n(u.f100o, string, 50);
                    int i19 = b;
                    int i20 = (i19 & (-6)) | ((~i19) & 5);
                    int i21 = -(-((i19 & 5) << 1));
                    int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    if (cursorN != null) {
                        int i24 = i19 & 53;
                        int i25 = (i19 | 53) & (~i24);
                        int i26 = i24 << 1;
                        int i27 = (i25 & i26) + (i25 | i26);
                        a = i27 % 128;
                        if (i27 % 2 == 0) {
                            cursorN.getCount();
                            int i28 = 48 / 0;
                        } else {
                            cursorN.getCount();
                        }
                        int i29 = b + 77;
                        a = i29 % 128;
                        int i30 = i29 % 2;
                    } else {
                        int i31 = a;
                        int i32 = ((i31 ^ 99) | (i31 & 99)) << 1;
                        int i33 = -(((~i31) & 99) | (i31 & (-100)));
                        int i34 = (i32 & i33) + (i33 | i32);
                        b = i34 % 128;
                        int i35 = i34 % 2;
                        cursorN = null;
                    }
                } catch (RuntimeException unused) {
                }
            } else {
                int i36 = a;
                int i37 = ((i36 ^ 99) | (i36 & 99)) << 1;
                int i38 = -(((~i36) & 99) | (i36 & (-100)));
                int i39 = (i37 & i38) + (i38 | i37);
                b = i39 % 128;
                int i310 = i39 % 2;
                cursorN = null;
            }
        } else {
            int i311 = a;
            int i312 = ((i311 ^ 99) | (i311 & 99)) << 1;
            int i313 = -(((~i311) & 99) | (i311 & (-100)));
            int i314 = (i312 & i313) + (i313 | i312);
            b = i314 % 128;
            int i315 = i314 % 2;
            cursorN = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorN != null) {
            int i40 = b;
            int i41 = ((i40 | 81) << 1) - (i40 ^ 81);
            a = i41 % 128;
            if (i41 % 2 == 0) {
                filterResults.count = cursorN.getCount();
                obj.hashCode();
                throw null;
            }
            filterResults.count = cursorN.getCount();
            int i42 = b;
            int i43 = (i42 ^ 75) + ((i42 & 75) << 1);
            a = i43 % 128;
            if (i43 % 2 == 0) {
                filterResults.values = cursorN;
                obj.hashCode();
                throw null;
            }
            filterResults.values = cursorN;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
            int i44 = b;
            int i45 = ((i44 | 8) << 1) - (i44 ^ 8);
            int i46 = (i45 ^ (-1)) + (i45 << 1);
            a = i46 % 128;
            int i47 = i46 % 2;
        }
        int i48 = b;
        int i49 = ((i48 | 35) << 1) - (i48 ^ 35);
        a = i49 % 128;
        int i50 = i49 % 2;
        return filterResults;
    }
}
