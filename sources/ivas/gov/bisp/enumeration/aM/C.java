package ivas.gov.bisp.enumeration.aM;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class C extends N {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ AbstractC0075s f;

    public C(AbstractC0075s abstractC0075s, ViewGroup viewGroup, View view, View view2) {
        this.f = abstractC0075s;
        this.c = viewGroup;
        int i = a;
        int i2 = ((i ^ 12) + ((i & 12) << 1)) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d = view;
        this.e = view2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void b(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 59) << 1) - (~(-(((~i2) & 59) | (i2 & (-60)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.e.setTag(ivas.gov.bisp.enumeration.R.id.save_overlay_view, null);
        ViewGroupOverlay overlay = this.c.getOverlay();
        int i5 = b + 48;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            overlay.remove(this.d);
            j.y(this);
            int i7 = 78 / 0;
        } else {
            overlay.remove(this.d);
            j.y(this);
        }
        int i8 = a;
        int i9 = (i8 & (-44)) | ((~i8) & 43);
        int i10 = -(-((i8 & 43) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void d(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        b = i3 % 128;
        int i4 = i3 % 2;
        ViewGroupOverlay overlay = this.c.getOverlay();
        View view = this.d;
        int i5 = a;
        int i6 = ((i5 ^ 54) + ((i5 & 54) << 1)) - 1;
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            overlay.remove(view);
            obj.hashCode();
            throw null;
        }
        overlay.remove(view);
        int i7 = a;
        int i8 = ((i7 ^ 15) | (i7 & 15)) << 1;
        int i9 = -(((~i7) & 15) | (i7 & (-16)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.N, ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void e(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 35;
        int i4 = -(-((i2 & 35) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (this.d.getParent() == null) {
            int i7 = a + 107;
            b = i7 % 128;
            int i8 = i7 % 2;
            ViewGroupOverlay overlay = this.c.getOverlay();
            View view = this.d;
            int i9 = b;
            int i10 = (i9 ^ 71) + ((i9 & 71) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                overlay.add(view);
                return;
            } else {
                overlay.add(view);
                obj.hashCode();
                throw null;
            }
        }
        AbstractC0075s abstractC0075s = this.f;
        int size = abstractC0075s.q.size();
        int i11 = b;
        int i12 = i11 & 33;
        int i13 = (i11 ^ 33) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        int i17 = (-2) - ((i15 + 20) ^ (-1));
        b = i17 % 128;
        int i18 = i17 % 2;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int i19 = a;
            int i20 = (-2) - (((i19 ^ 62) + ((i19 & 62) << 1)) ^ (-1));
            b = i20 % 128;
            int i21 = i20 % 2;
            abstractC0075s.q.get(size).cancel();
            int i22 = a;
            int i23 = (i22 ^ 1) + ((i22 & 1) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        ArrayList<J.InterfaceC0070bHc> arrayList = abstractC0075s.u;
        if (arrayList != null) {
            int i25 = a + 93;
            b = i25 % 128;
            int i26 = i25 % 2;
            if (arrayList.size() > 0) {
                int i27 = a;
                int i28 = i27 ^ 23;
                int i29 = ((i27 & 23) | i28) << 1;
                int i30 = -i28;
                int i31 = (i29 & i30) + (i29 | i30);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    ((ArrayList) abstractC0075s.u.clone()).size();
                    obj.hashCode();
                    throw null;
                }
                ArrayList arrayList2 = (ArrayList) abstractC0075s.u.clone();
                int size2 = arrayList2.size();
                int i32 = b;
                int i33 = i32 | 79;
                int i34 = i33 << 1;
                int i35 = -(i33 & (~(i32 & 79)));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
                int i38 = (i32 | 69) << 1;
                int i39 = -(((~i32) & 69) | (i32 & (-70)));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                a = i40 % 128;
                int i41 = i40 % 2;
                int i42 = 0;
                while (i42 < size2) {
                    int i43 = b;
                    int i44 = (i43 | 63) << 1;
                    int i45 = -(((~i43) & 63) | (i43 & (-64)));
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    a = i46 % 128;
                    if (i46 % 2 == 0) {
                        ((J.InterfaceC0070bHc) arrayList2.get(i42)).c(abstractC0075s);
                        i42 += 47;
                    } else {
                        ((J.InterfaceC0070bHc) arrayList2.get(i42)).c(abstractC0075s);
                        int i47 = i42 & 14;
                        int i48 = -(-(i42 | 14));
                        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                        int i50 = ((i49 | (-12)) << 1) - (i49 ^ (-12));
                        i42 = (i50 ^ (-1)) + (i50 << 1);
                    }
                }
            }
        }
        int i51 = a;
        int i52 = (i51 & 69) + (i51 | 69);
        b = i52 % 128;
        int i53 = i52 % 2;
    }
}
