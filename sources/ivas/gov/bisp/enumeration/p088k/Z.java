package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.u;
import ivas.gov.bisp.enumeration.OooOOO0.o00000OO;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0319q;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Z extends Y implements InterfaceC0319q {
    public static Method E = null;
    private static int a = 1;
    private static int b;
    public InterfaceC0319q F;

    static {
        try {
            Object obj = null;
            if (Build.VERSION.SDK_INT <= 28) {
                int i = a;
                int i2 = (i ^ 53) + ((i & 53) << 1);
                b = i2 % 128;
                int i3 = i2 % 2;
                Class[] clsArr = {Boolean.TYPE};
                int i4 = a;
                int i5 = (i4 & 75) + (i4 | 75);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    E = PopupWindow.class.getDeclaredMethod("setTouchModal", clsArr);
                    obj.hashCode();
                    throw null;
                }
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", clsArr);
                int i6 = a + 80;
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            int i10 = a + 37;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (NoSuchMethodException unused) {
        }
    }

    public Z(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0319q
    public void a(n nVar, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 42) << 1) - (i2 ^ 42)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC0319q interfaceC0319q = this.F;
        if (interfaceC0319q != null) {
            int i5 = (i2 | 5) << 1;
            int i6 = -(i2 ^ 5);
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                interfaceC0319q.a(nVar, menuItem);
                int i8 = 73 / 0;
            } else {
                interfaceC0319q.a(nVar, menuItem);
            }
        }
        int i9 = a + 35;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ivas.gov.bisp.enumeration.OooOOO0.o00000OO, ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o] */
    @Override // ivas.gov.bisp.enumeration.p088k.Y
    public o00000OO p(final Context context, final boolean z) {
        int i = 2 % 2;
        ?? r1 = new o00000OO(context, z) { // from class: ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o
            private static int a = 1;
            private static int b;
            public final int p;
            public final int q;
            public MenuItem r;
            public InterfaceC0319q s;

            {
                super(context, z);
                if (1 != context.getResources().getConfiguration().getLayoutDirection()) {
                    this.p = 22;
                    this.q = 21;
                    int i2 = a;
                    int i3 = i2 & 53;
                    int i4 = (((i2 ^ 53) | i3) << 1) - ((i2 | 53) & (~i3));
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                this.p = 21;
                this.q = 22;
                int i6 = b;
                int i7 = i6 & 87;
                int i8 = (i7 - (~(-(-((i6 ^ 87) | i7))))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void setHoverListener(InterfaceC0319q interfaceC0319q) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 + 71;
                b = i4 % 128;
                int i5 = i4 % 2;
                this.s = interfaceC0319q;
                int i6 = (i3 ^ 114) + ((i3 & 114) << 1);
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }

            @Override // ivas.gov.bisp.enumeration.OooOOO0.o00000OO, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = ((i3 & (-56)) | ((~i3) & 55)) + ((i3 & 55) << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                super.setSelector(drawable);
                if (i5 != 0) {
                    int i6 = 62 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
            
                if (r9 == r8.p) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            
                if (r1.isEnabled() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                r9 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a;
                r10 = (((r9 & (-92)) | ((~r9) & 91)) - (~(-(-((r9 & 91) << 1))))) - 1;
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
            
                if (r1.getItemData().hasSubMenu() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
            
                r9 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b;
                r10 = (((r9 ^ 35) | (r9 & 35)) << 1) - (((~r9) & 35) | (r9 & (-36)));
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
            
                if ((r10 % 2) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
            
                r9 = getSelectedItemPosition();
                r4 = getSelectedItemId();
                r10 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b;
                r6 = ((r10 | 111) << 1) - (((~r10) & 111) | (r10 & (-112)));
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
            
                if ((r6 % 2) != 0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
            
                performItemClick(r1, r9, r4);
                r9 = 47 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
            
                performItemClick(r1, r9, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
            
                r9 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b;
                r10 = r9 & 97;
                r9 = -(-((r9 ^ 97) | r10));
                r1 = (r10 & r9) + (r9 | r10);
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
            
                getSelectedItemPosition();
                getSelectedItemId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
            
                r9 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a;
                r10 = r9 & 73;
                r10 = (r10 - (~(-(-((r9 ^ 73) | r10))))) - 1;
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
            
                if (r9 == r8.q) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
            
                if (r9 == r8.q) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
            
                setSelection(-1);
                r9 = getAdapter();
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
            
                if ((r9 instanceof android.widget.HeaderViewListAdapter) == false) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
            
                r10 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b + 105;
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a = r10 % 128;
                r10 = r10 % 2;
                r9 = (androidx.appcompat.view.menu.s) ((android.widget.HeaderViewListAdapter) r9).getWrappedAdapter();
                r10 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b;
                r1 = r10 & 79;
                r10 = (((r10 | 79) & (~r1)) - (~(r1 << 1))) - 1;
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
            
                r9 = (androidx.appcompat.view.menu.s) r9;
                r10 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a;
                r1 = r10 & 109;
                r10 = ((r10 | 109) & (~r1)) + (r1 << 1);
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
            
                r9.a.f(false);
                r9 = ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.a;
                r10 = r9 | 69;
                r1 = r10 << 1;
                r9 = -((~(r9 & 69)) & r10);
                r10 = (r1 ^ r9) + ((r9 & r1) << 1);
                ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.b = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0148, code lost:
            
                if ((r10 % 2) == 0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
            
                r9 = 26 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
            
                if (r9 == r8.p) goto L11;
             */
            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onKeyDown(int r9, android.view.KeyEvent r10) {
                /*
                    Method dump skipped, instruction units count: 348
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.OooOOO0.o0000O0O$OooO00o.onKeyDown(int, android.view.KeyEvent):boolean");
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0045 A[PHI: r2
  0x0045: PHI (r2v7 android.widget.ListAdapter) = (r2v6 android.widget.ListAdapter), (r2v21 android.widget.ListAdapter) binds: [B:10:0x0043, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:12:0x005c A[PHI: r2
  0x005c: PHI (r2v17 android.widget.ListAdapter) = (r2v6 android.widget.ListAdapter), (r2v21 android.widget.ListAdapter) binds: [B:10:0x0043, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:21:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
            /* JADX WARN: Code duplicated, block: B:25:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:35:0x012c A[PHI: r2
  0x012c: PHI (r2v11 androidx.appcompat.view.menu.n) = (r2v10 androidx.appcompat.view.menu.n), (r2v16 androidx.appcompat.view.menu.n) binds: [B:34:0x012a, B:31:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:37:0x0137  */
            /* JADX WARN: Code duplicated, block: B:38:0x0140  */
            @Override // ivas.gov.bisp.enumeration.OooOOO0.o00000OO, android.view.View
            public boolean onHoverEvent(MotionEvent motionEvent) {
                ListAdapter adapter;
                s sVar;
                int headersCount;
                n nVar;
                int i2;
                int i3;
                int i4 = 2 % 2;
                int i5 = b;
                int i6 = i5 & 117;
                int i7 = -(-((i5 ^ 117) | i6));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                int i9 = i8 % 128;
                a = i9;
                int i10 = i8 % 2;
                if (this.s != null) {
                    int i11 = i9 & 77;
                    int i12 = (i9 ^ 77) | i11;
                    int i13 = (i11 & i12) + (i12 | i11);
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        adapter = getAdapter();
                        int i14 = 18 / 0;
                        if (!(adapter instanceof HeaderViewListAdapter)) {
                            sVar = (s) adapter;
                            int i15 = a;
                            int i16 = i15 ^ 31;
                            int i17 = (i15 & 31) << 1;
                            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            headersCount = 0;
                        } else {
                            int i20 = b;
                            int i21 = ((i20 & (-118)) | ((~i20) & 117)) + ((117 & i20) << 1);
                            a = i21 % 128;
                            int i22 = i21 % 2;
                            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                            headersCount = headerViewListAdapter.getHeadersCount();
                            int i23 = a + 55;
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            sVar = (s) headerViewListAdapter.getWrappedAdapter();
                            int i25 = a + 61;
                            b = i25 % 128;
                            int i26 = i25 % 2;
                        }
                    } else {
                        adapter = getAdapter();
                        if (!(adapter instanceof HeaderViewListAdapter)) {
                            sVar = (s) adapter;
                            int i110 = a;
                            int i111 = i110 ^ 31;
                            int i112 = (i110 & 31) << 1;
                            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                            b = i113 % 128;
                            int i114 = i113 % 2;
                            headersCount = 0;
                        } else {
                            int i27 = b;
                            int i28 = ((i27 & (-118)) | ((~i27) & 117)) + ((117 & i27) << 1);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                            HeaderViewListAdapter headerViewListAdapter2 = (HeaderViewListAdapter) adapter;
                            headersCount = headerViewListAdapter2.getHeadersCount();
                            int i210 = a + 55;
                            b = i210 % 128;
                            int i211 = i210 % 2;
                            sVar = (s) headerViewListAdapter2.getWrappedAdapter();
                            int i212 = a + 61;
                            b = i212 % 128;
                            int i213 = i212 % 2;
                        }
                    }
                    u uVarC = null;
                    if (motionEvent.getAction() != 10) {
                        int i30 = b;
                        int i31 = ((((i30 ^ 27) | (i30 & 27)) << 1) - (~(-(((~i30) & 27) | (i30 & (-28)))))) - 1;
                        a = i31 % 128;
                        int i32 = i31 % 2;
                        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                        int i33 = a;
                        int i34 = ((i33 | 9) << 1) - (i33 ^ 9);
                        int i35 = i34 % 128;
                        b = i35;
                        if (i34 % 2 != 0) {
                            int i36 = 69 / 0;
                            if (iPointToPosition != -1) {
                                int i37 = -headersCount;
                                i3 = ((iPointToPosition | i37) << 1) - (i37 ^ iPointToPosition);
                                if (i3 >= 0) {
                                    int i38 = i35 & 13;
                                    int i39 = ((~i38) & (i35 | 13)) + (i38 << 1);
                                    a = i39 % 128;
                                    int i40 = i39 % 2;
                                    if (i3 < sVar.getCount()) {
                                        int i41 = a;
                                        int i42 = (i41 & 15) + (i41 | 15);
                                        b = i42 % 128;
                                        int i43 = i42 % 2;
                                        uVarC = sVar.c(i3);
                                        int i44 = a;
                                        int i45 = i44 & 59;
                                        int i46 = i45 + ((i44 ^ 59) | i45);
                                        b = i46 % 128;
                                        int i47 = i46 % 2;
                                    }
                                }
                            }
                        } else if (iPointToPosition != -1) {
                            int i310 = -headersCount;
                            i3 = ((iPointToPosition | i310) << 1) - (i310 ^ iPointToPosition);
                            if (i3 >= 0) {
                                int i311 = i35 & 13;
                                int i312 = ((~i311) & (i35 | 13)) + (i311 << 1);
                                a = i312 % 128;
                                int i48 = i312 % 2;
                                if (i3 < sVar.getCount()) {
                                    int i49 = a;
                                    int i410 = (i49 & 15) + (i49 | 15);
                                    b = i410 % 128;
                                    int i411 = i410 % 2;
                                    uVarC = sVar.c(i3);
                                    int i412 = a;
                                    int i413 = i412 & 59;
                                    int i414 = i413 + ((i412 ^ 59) | i413);
                                    b = i414 % 128;
                                    int i415 = i414 % 2;
                                }
                            }
                        }
                    }
                    MenuItem menuItem = this.r;
                    if (menuItem != uVarC) {
                        int i50 = b;
                        int i51 = (i50 & 31) + (i50 | 31);
                        a = i51 % 128;
                        if (i51 % 2 == 0) {
                            nVar = sVar.a;
                            int i52 = 28 / 0;
                            if (menuItem != null) {
                                i2 = a + 117;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    this.s.n(nVar, menuItem);
                                    int i53 = 86 / 0;
                                } else {
                                    this.s.n(nVar, menuItem);
                                }
                            }
                        } else {
                            nVar = sVar.a;
                            if (menuItem != null) {
                                i2 = a + 117;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    this.s.n(nVar, menuItem);
                                    int i54 = 86 / 0;
                                } else {
                                    this.s.n(nVar, menuItem);
                                }
                            }
                        }
                        this.r = uVarC;
                        if (uVarC != null) {
                            int i55 = a + 110;
                            int i56 = (i55 ^ (-1)) + (i55 << 1);
                            b = i56 % 128;
                            if (i56 % 2 != 0) {
                                this.s.a(nVar, uVarC);
                                int i57 = 38 / 0;
                            } else {
                                this.s.a(nVar, uVarC);
                            }
                            int i58 = b;
                            int i59 = i58 & 39;
                            int i60 = (i58 ^ 39) | i59;
                            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                            a = i61 % 128;
                            if (i61 % 2 == 0) {
                                int i62 = 3 % 5;
                            }
                        }
                    }
                }
                boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
                int i63 = a;
                int i64 = (i63 & 11) + (i63 | 11);
                b = i64 % 128;
                int i65 = i64 % 2;
                return zOnHoverEvent;
            }
        };
        r1.setHoverListener(this);
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = (~i3) & (i2 | 117);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = ((i2 & (-30)) | ((~i2) & 29)) + ((i2 & 29) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return r1;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0319q
    public void n(n nVar, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (((~i3) & (i2 | 67)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        InterfaceC0319q interfaceC0319q = this.F;
        if (interfaceC0319q != null) {
            int i5 = (-2) - (((i2 & 108) + (i2 | 108)) ^ (-1));
            a = i5 % 128;
            int i6 = i5 % 2;
            interfaceC0319q.n(nVar, menuItem);
            if (i6 == 0) {
                int i7 = 59 / 0;
            }
        }
        int i8 = b;
        int i9 = ((i8 | 47) << 1) - (i8 ^ 47);
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
