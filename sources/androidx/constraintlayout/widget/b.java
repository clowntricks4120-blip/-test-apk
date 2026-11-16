package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p100w.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final int[] a = {0, 4, 8};
    public static SparseIntArray b;
    public HashMap<String, j> c = new HashMap<>();
    public boolean d = true;
    public HashMap<Integer, aJN> e = new HashMap<>();

    public static class aJN {
        public int a;
        public final aJQ b = new aJQ();
        public final aJP c = new aJP();
        public final aJO d = new aJO();
        public final aJR f = new aJR();
        public HashMap<String, j> e = new HashMap<>();

        public void b(ConstraintLayout.OooO00o oooO00o) {
            aJO ajo = this.d;
            oooO00o.e = ajo.j;
            oooO00o.g = ajo.b;
            oooO00o.f = ajo.k;
            oooO00o.h = ajo.l;
            oooO00o.i = ajo.m;
            oooO00o.a = ajo.f17o;
            oooO00o.j = ajo.n;
            oooO00o.k = ajo.p;
            oooO00o.l = ajo.q;
            oooO00o.p = ajo.s;
            oooO00o.r = ajo.r;
            oooO00o.q = ajo.t;
            oooO00o.s = ajo.w;
            ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin = ajo.E;
            ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin = ajo.F;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = ajo.I;
            ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin = ajo.J;
            oooO00o.t = ajo.Q;
            oooO00o.z = ajo.P;
            oooO00o.u = ajo.M;
            oooO00o.x = ajo.N;
            oooO00o.y = ajo.v;
            oooO00o.A = ajo.x;
            oooO00o.n = ajo.u;
            oooO00o.m = ajo.A;
            oooO00o.f16o = ajo.z;
            oooO00o.C = ajo.y;
            oooO00o.F = ajo.B;
            oooO00o.S = ajo.D;
            oooO00o.E = ajo.G;
            oooO00o.D = ajo.T;
            oooO00o.I = ajo.U;
            oooO00o.H = ajo.S;
            oooO00o.T = ajo.ag;
            oooO00o.Q = ajo.ai;
            oooO00o.J = ajo.R;
            oooO00o.G = ajo.V;
            oooO00o.N = ajo.ak;
            oooO00o.M = ajo.W;
            oooO00o.K = ajo.X;
            oooO00o.L = ajo.Y;
            oooO00o.O = ajo.Z;
            oooO00o.P = ajo.aa;
            oooO00o.R = ajo.C;
            oooO00o.d = ajo.i;
            oooO00o.b = ajo.h;
            oooO00o.c = ajo.g;
            ((ViewGroup.MarginLayoutParams) oooO00o).width = ajo.e;
            ((ViewGroup.MarginLayoutParams) oooO00o).height = ajo.f;
            String str = ajo.ah;
            if (str != null) {
                oooO00o.U = str;
            }
            oooO00o.setMarginStart(ajo.H);
            oooO00o.setMarginEnd(this.d.K);
            oooO00o.d();
        }

        public final void c(int i, ConstraintLayout.OooO00o oooO00o) {
            this.a = i;
            aJO ajo = this.d;
            ajo.j = oooO00o.e;
            ajo.b = oooO00o.g;
            ajo.k = oooO00o.f;
            ajo.l = oooO00o.h;
            ajo.m = oooO00o.i;
            ajo.f17o = oooO00o.a;
            ajo.n = oooO00o.j;
            ajo.p = oooO00o.k;
            ajo.q = oooO00o.l;
            ajo.s = oooO00o.p;
            ajo.r = oooO00o.r;
            ajo.t = oooO00o.q;
            ajo.w = oooO00o.s;
            ajo.v = oooO00o.y;
            ajo.x = oooO00o.A;
            ajo.y = oooO00o.C;
            ajo.u = oooO00o.n;
            ajo.A = oooO00o.m;
            ajo.z = oooO00o.f16o;
            ajo.B = oooO00o.F;
            ajo.D = oooO00o.S;
            ajo.C = oooO00o.R;
            ajo.i = oooO00o.d;
            ajo.h = oooO00o.b;
            ajo.g = oooO00o.c;
            ajo.e = ((ViewGroup.MarginLayoutParams) oooO00o).width;
            ajo.f = ((ViewGroup.MarginLayoutParams) oooO00o).height;
            ajo.E = ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin;
            ajo.F = ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin;
            ajo.I = ((ViewGroup.MarginLayoutParams) oooO00o).topMargin;
            ajo.J = ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin;
            ajo.G = oooO00o.E;
            ajo.T = oooO00o.D;
            ajo.U = oooO00o.I;
            ajo.S = oooO00o.H;
            ajo.ag = oooO00o.T;
            ajo.ai = oooO00o.Q;
            ajo.R = oooO00o.J;
            ajo.V = oooO00o.G;
            ajo.ak = oooO00o.N;
            ajo.W = oooO00o.M;
            ajo.X = oooO00o.K;
            ajo.Y = oooO00o.L;
            ajo.Z = oooO00o.O;
            ajo.aa = oooO00o.P;
            ajo.ah = oooO00o.U;
            ajo.M = oooO00o.u;
            ajo.N = oooO00o.x;
            ajo.L = oooO00o.v;
            ajo.O = oooO00o.w;
            ajo.Q = oooO00o.t;
            ajo.P = oooO00o.z;
            ajo.K = oooO00o.getMarginEnd();
            this.d.H = oooO00o.getMarginStart();
        }

        public Object clone() {
            aJN ajn = new aJN();
            aJO ajo = ajn.d;
            aJO ajo2 = this.d;
            Objects.requireNonNull(ajo);
            ajo.c = ajo2.c;
            ajo.e = ajo2.e;
            ajo.d = ajo2.d;
            ajo.f = ajo2.f;
            ajo.h = ajo2.h;
            ajo.g = ajo2.g;
            ajo.i = ajo2.i;
            ajo.j = ajo2.j;
            ajo.b = ajo2.b;
            ajo.k = ajo2.k;
            ajo.l = ajo2.l;
            ajo.m = ajo2.m;
            ajo.f17o = ajo2.f17o;
            ajo.n = ajo2.n;
            ajo.p = ajo2.p;
            ajo.q = ajo2.q;
            ajo.s = ajo2.s;
            ajo.r = ajo2.r;
            ajo.t = ajo2.t;
            ajo.w = ajo2.w;
            ajo.v = ajo2.v;
            ajo.x = ajo2.x;
            ajo.y = ajo2.y;
            ajo.u = ajo2.u;
            ajo.A = ajo2.A;
            ajo.z = ajo2.z;
            ajo.B = ajo2.B;
            ajo.D = ajo2.D;
            ajo.C = ajo2.C;
            ajo.E = ajo2.E;
            ajo.F = ajo2.F;
            ajo.I = ajo2.I;
            ajo.J = ajo2.J;
            ajo.K = ajo2.K;
            ajo.H = ajo2.H;
            ajo.L = ajo2.L;
            ajo.M = ajo2.M;
            ajo.O = ajo2.O;
            ajo.N = ajo2.N;
            ajo.P = ajo2.P;
            ajo.Q = ajo2.Q;
            ajo.G = ajo2.G;
            ajo.T = ajo2.T;
            ajo.S = ajo2.S;
            ajo.U = ajo2.U;
            ajo.R = ajo2.R;
            ajo.V = ajo2.V;
            ajo.ak = ajo2.ak;
            ajo.W = ajo2.W;
            ajo.X = ajo2.X;
            ajo.Y = ajo2.Y;
            ajo.Z = ajo2.Z;
            ajo.aa = ajo2.aa;
            ajo.ab = ajo2.ab;
            ajo.ac = ajo2.ac;
            ajo.ad = ajo2.ad;
            ajo.ah = ajo2.ah;
            int[] iArr = ajo2.ae;
            if (iArr != null) {
                ajo.ae = Arrays.copyOf(iArr, iArr.length);
            } else {
                ajo.ae = null;
            }
            ajo.af = ajo2.af;
            ajo.ag = ajo2.ag;
            ajo.ai = ajo2.ai;
            ajo.aj = ajo2.aj;
            aJP ajp = ajn.c;
            aJP ajp2 = this.c;
            Objects.requireNonNull(ajp);
            ajp.b = ajp2.b;
            ajp.c = ajp2.c;
            ajp.d = ajp2.d;
            ajp.e = ajp2.e;
            ajp.g = ajp2.g;
            ajp.h = ajp2.h;
            ajp.f = ajp2.f;
            aJQ ajq = ajn.b;
            aJQ ajq2 = this.b;
            Objects.requireNonNull(ajq);
            ajq.a = ajq2.a;
            ajq.b = ajq2.b;
            ajq.d = ajq2.d;
            ajq.e = ajq2.e;
            ajq.c = ajq2.c;
            aJR ajr = ajn.f;
            aJR ajr2 = this.f;
            Objects.requireNonNull(ajr);
            ajr.c = ajr2.c;
            ajr.d = ajr2.d;
            ajr.e = ajr2.e;
            ajr.f = ajr2.f;
            ajr.h = ajr2.h;
            ajr.g = ajr2.g;
            ajr.i = ajr2.i;
            ajr.j = ajr2.j;
            ajr.b = ajr2.b;
            ajr.k = ajr2.k;
            ajr.l = ajr2.l;
            ajr.m = ajr2.m;
            ajr.n = ajr2.n;
            ajn.a = this.a;
            return ajn;
        }

        public final void d(int i, OooO0OO.aJS ajs) {
            c(i, ajs);
            this.b.d = ajs.am;
            aJR ajr = this.f;
            ajr.d = ajs.ap;
            ajr.e = ajs.as;
            ajr.f = ajs.ay;
            ajr.h = ajs.ar;
            ajr.g = ajs.aq;
            ajr.i = ajs.av;
            ajr.j = ajs.aw;
            ajr.b = ajs.ax;
            ajr.k = ajs.at;
            ajr.l = ajs.au;
            ajr.n = ajs.ao;
            ajr.m = ajs.an;
        }
    }

    public static class aJO {
        public static SparseIntArray a;
        public int[] ae;
        public String af;
        public String ah;
        public int e;
        public int f;
        public boolean c = false;
        public boolean d = false;
        public int h = -1;
        public int g = -1;
        public float i = -1.0f;
        public int j = -1;
        public int b = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f17o = -1;
        public int n = -1;
        public int p = -1;
        public int q = -1;
        public int s = -1;
        public int r = -1;
        public int t = -1;
        public int w = -1;
        public float v = 0.5f;
        public float x = 0.5f;
        public String y = null;
        public int u = -1;
        public int A = 0;
        public float z = 0.0f;
        public int B = -1;
        public int D = -1;
        public int C = -1;
        public int E = -1;
        public int F = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int H = -1;
        public int L = -1;
        public int M = -1;
        public int O = -1;
        public int N = -1;
        public int P = -1;
        public int Q = -1;
        public float G = -1.0f;
        public float T = -1.0f;
        public int S = 0;
        public int U = 0;
        public int R = 0;
        public int V = 0;
        public int ak = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float aa = 1.0f;
        public int ab = -1;
        public int ac = 0;
        public int ad = -1;
        public boolean ag = false;
        public boolean ai = false;
        public boolean aj = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(38, 24);
            a.append(39, 25);
            a.append(41, 28);
            a.append(42, 29);
            a.append(47, 35);
            a.append(46, 34);
            a.append(20, 4);
            a.append(19, 3);
            a.append(17, 1);
            a.append(55, 6);
            a.append(56, 7);
            a.append(27, 17);
            a.append(28, 18);
            a.append(29, 19);
            a.append(0, 26);
            a.append(43, 31);
            a.append(44, 32);
            a.append(26, 10);
            a.append(25, 9);
            a.append(59, 13);
            a.append(62, 16);
            a.append(60, 14);
            a.append(57, 11);
            a.append(61, 15);
            a.append(58, 12);
            a.append(50, 38);
            a.append(36, 37);
            a.append(35, 39);
            a.append(49, 40);
            a.append(34, 20);
            a.append(48, 36);
            a.append(24, 5);
            a.append(37, 76);
            a.append(45, 76);
            a.append(40, 76);
            a.append(18, 76);
            a.append(16, 76);
            a.append(3, 23);
            a.append(5, 27);
            a.append(7, 30);
            a.append(8, 8);
            a.append(4, 33);
            a.append(6, 2);
            a.append(1, 22);
            a.append(2, 21);
            a.append(21, 61);
            a.append(23, 62);
            a.append(22, 63);
            a.append(54, 69);
            a.append(33, 70);
            a.append(12, 71);
            a.append(10, 72);
            a.append(11, 73);
            a.append(13, 74);
            a.append(9, 75);
        }

        public void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.c);
            this.d = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.get(index);
                if (i2 == 80) {
                    this.ag = typedArrayObtainStyledAttributes.getBoolean(index, this.ag);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            int i3 = this.q;
                            int[] iArr = b.a;
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i3);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.q = resourceId;
                            break;
                        case 2:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 3:
                            int i4 = this.p;
                            int[] iArr2 = b.a;
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId2 == -1) {
                                resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.p = resourceId2;
                            break;
                        case 4:
                            int i5 = this.n;
                            int[] iArr3 = b.a;
                            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId3 == -1) {
                                resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.n = resourceId3;
                            break;
                        case 5:
                            this.y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            break;
                        case 8:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 9:
                            int i6 = this.w;
                            int[] iArr4 = b.a;
                            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId4 == -1) {
                                resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.w = resourceId4;
                            break;
                        case 10:
                            int i7 = this.t;
                            int[] iArr5 = b.a;
                            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId5 == -1) {
                                resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.t = resourceId5;
                            break;
                        case 11:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 12:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 13:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 16:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                            this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                            break;
                        case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                            this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                            break;
                        case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                            this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                            break;
                        case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                            this.f = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f);
                            break;
                        case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                            this.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.e);
                            break;
                        case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                            int i8 = this.j;
                            int[] iArr6 = b.a;
                            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId6 == -1) {
                                resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.j = resourceId6;
                            break;
                        case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                            int i9 = this.b;
                            int[] iArr7 = b.a;
                            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId7 == -1) {
                                resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.b = resourceId7;
                            break;
                        case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                            int i10 = this.k;
                            int[] iArr8 = b.a;
                            int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId8 == -1) {
                                resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.k = resourceId8;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                            int i11 = this.l;
                            int[] iArr9 = b.a;
                            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId9 == -1) {
                                resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.l = resourceId9;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                            int i12 = this.s;
                            int[] iArr10 = b.a;
                            int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId10 == -1) {
                                resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.s = resourceId10;
                            break;
                        case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                            int i13 = this.r;
                            int[] iArr11 = b.a;
                            int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId11 == -1) {
                                resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.r = resourceId11;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                            int i14 = this.f17o;
                            int[] iArr12 = b.a;
                            int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId12 == -1) {
                                resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f17o = resourceId12;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                            int i15 = this.m;
                            int[] iArr13 = b.a;
                            int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId13 == -1) {
                                resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.m = resourceId13;
                            break;
                        case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                            this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                            break;
                        case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                            this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                            break;
                        case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                            this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                            break;
                        case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                            this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                                    break;
                                case 55:
                                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                                    break;
                                case 56:
                                    this.ak = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ak);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            int i16 = this.u;
                                            int[] iArr14 = b.a;
                                            int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, i16);
                                            if (resourceId14 == -1) {
                                                resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.u = resourceId14;
                                            break;
                                        case 62:
                                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                            break;
                                        case 63:
                                            this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.aa = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.ab = typedArrayObtainStyledAttributes.getInt(index, this.ab);
                                                    break;
                                                case 73:
                                                    this.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ac);
                                                    break;
                                                case 74:
                                                    this.af = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.aj = typedArrayObtainStyledAttributes.getBoolean(index, this.aj);
                                                    break;
                                                case 76:
                                                    a.get(index);
                                                    break;
                                                case 77:
                                                    this.ah = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    a.get(index);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.ai = typedArrayObtainStyledAttributes.getBoolean(index, this.ai);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class aJP {
        public static SparseIntArray a;
        public boolean b = false;
        public int c = -1;
        public String d = null;
        public int e = -1;
        public int g = 0;
        public float f = Float.NaN;
        public float h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(2, 1);
            a.append(4, 2);
            a.append(5, 3);
            a.append(1, 4);
            a.append(0, 5);
            a.append(3, 6);
        }

        public void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.k);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = ivas.gov.bisp.enumeration.O.r.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.c;
                        int[] iArr = b.a;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.c = resourceId;
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class aJQ {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.l);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    int[] iArr = b.a;
                    this.b = b.a[i2];
                } else if (index == 4) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class aJR {
        public static SparseIntArray a;
        public boolean c = false;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 0.0f;
        public float h = 1.0f;
        public float g = 1.0f;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public float b = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(6, 1);
            a.append(7, 2);
            a.append(8, 3);
            a.append(4, 4);
            a.append(5, 5);
            a.append(0, 6);
            a.append(1, 7);
            a.append(2, 8);
            a.append(3, 9);
            a.append(9, 10);
            a.append(10, 11);
        }

        public void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f111o);
            this.c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 3:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 4:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 5:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 6:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 7:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 8:
                        this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.append(76, 25);
        b.append(77, 26);
        b.append(79, 29);
        b.append(80, 30);
        b.append(86, 36);
        b.append(85, 35);
        b.append(58, 4);
        b.append(57, 3);
        b.append(55, 1);
        b.append(94, 6);
        b.append(95, 7);
        b.append(65, 17);
        b.append(66, 18);
        b.append(67, 19);
        b.append(0, 27);
        b.append(81, 32);
        b.append(82, 33);
        b.append(64, 10);
        b.append(63, 9);
        b.append(98, 13);
        b.append(101, 16);
        b.append(99, 14);
        b.append(96, 11);
        b.append(100, 15);
        b.append(97, 12);
        b.append(89, 40);
        b.append(74, 39);
        b.append(73, 41);
        b.append(88, 42);
        b.append(72, 20);
        b.append(87, 37);
        b.append(62, 5);
        b.append(75, 82);
        b.append(84, 82);
        b.append(78, 82);
        b.append(56, 82);
        b.append(54, 82);
        b.append(5, 24);
        b.append(7, 28);
        b.append(23, 31);
        b.append(24, 8);
        b.append(6, 34);
        b.append(8, 2);
        b.append(3, 23);
        b.append(4, 21);
        b.append(2, 22);
        b.append(13, 43);
        b.append(26, 44);
        b.append(21, 45);
        b.append(22, 46);
        b.append(20, 60);
        b.append(18, 47);
        b.append(19, 48);
        b.append(14, 49);
        b.append(15, 50);
        b.append(16, 51);
        b.append(17, 52);
        b.append(25, 53);
        b.append(90, 54);
        b.append(68, 55);
        b.append(91, 56);
        b.append(69, 57);
        b.append(92, 58);
        b.append(70, 59);
        b.append(59, 61);
        b.append(61, 62);
        b.append(60, 63);
        b.append(27, 64);
        b.append(106, 65);
        b.append(33, 66);
        b.append(107, 67);
        b.append(103, 79);
        b.append(1, 38);
        b.append(102, 68);
        b.append(93, 69);
        b.append(71, 70);
        b.append(31, 71);
        b.append(29, 72);
        b.append(30, 73);
        b.append(32, 74);
        b.append(28, 75);
        b.append(104, 76);
        b.append(83, 77);
        b.append(108, 78);
        b.append(53, 80);
        b.append(52, 81);
    }

    public void c(ConstraintLayout constraintLayout, boolean z) {
        ViewGroup viewGroup;
        int i;
        HashMap<String, j> map;
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.e.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.e.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    aJN ajn = this.e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        ajn.d.ad = 1;
                    }
                    int i3 = ajn.d.ad;
                    if (i3 != -1 && i3 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(ajn.d.ab);
                        barrier.setMargin(ajn.d.ac);
                        barrier.setAllowsGoneWidget(ajn.d.aj);
                        aJO ajo = ajn.d;
                        int[] iArr = ajo.ae;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = ajo.af;
                            if (str != null) {
                                ajo.ae = e(barrier, str);
                                barrier.setReferencedIds(ajn.d.ae);
                            }
                        }
                    }
                    ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) childAt.getLayoutParams();
                    oooO00o.d();
                    ajn.b(oooO00o);
                    if (z) {
                        HashMap<String, j> map2 = ajn.e;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            j jVar = map2.get(str2);
                            String strR = ivas.gov.bisp.enumeration.p091n.j.r("set", str2);
                            childCount = childCount;
                            try {
                                switch (P.c(jVar.d)) {
                                    case 0:
                                        map = map2;
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(strR, clsArr).invoke(childAt, Integer.valueOf(jVar.e));
                                        } catch (IllegalAccessException unused2) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(" Custom Attribute \"");
                                            sb.append(str2);
                                            sb.append("\" not found on ");
                                            sb.append(cls.getName());
                                            Log.e("TransitionLayout", sb.toString());
                                        } catch (NoSuchMethodException e) {
                                            e = e;
                                            Log.e("TransitionLayout", e.getMessage());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(" Custom Attribute \"");
                                            sb2.append(str2);
                                            sb2.append("\" not found on ");
                                            sb2.append(cls.getName());
                                            Log.e("TransitionLayout", sb2.toString());
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(cls.getName());
                                            sb3.append(" must have a method ");
                                            sb3.append(strR);
                                            Log.e("TransitionLayout", sb3.toString());
                                        } catch (InvocationTargetException unused3) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(" Custom Attribute \"");
                                            sb4.append(str2);
                                            sb4.append("\" not found on ");
                                            sb4.append(cls.getName());
                                            Log.e("TransitionLayout", sb4.toString());
                                        }
                                        map2 = map;
                                        break;
                                    case 1:
                                        map = map2;
                                        cls.getMethod(strR, Float.TYPE).invoke(childAt, Float.valueOf(jVar.f));
                                        map2 = map;
                                        break;
                                    case 2:
                                        map = map2;
                                        cls.getMethod(strR, Integer.TYPE).invoke(childAt, Integer.valueOf(jVar.i));
                                        map2 = map;
                                        break;
                                    case 3:
                                        map = map2;
                                        Class<?>[] clsArr2 = new Class[1];
                                        try {
                                            clsArr2[0] = Drawable.class;
                                            Method method = cls.getMethod(strR, clsArr2);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(jVar.i);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException unused4) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append(" Custom Attribute \"");
                                            sb5.append(str2);
                                            sb5.append("\" not found on ");
                                            sb5.append(cls.getName());
                                            Log.e("TransitionLayout", sb5.toString());
                                        } catch (InvocationTargetException unused5) {
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(" Custom Attribute \"");
                                            sb6.append(str2);
                                            sb6.append("\" not found on ");
                                            sb6.append(cls.getName());
                                            Log.e("TransitionLayout", sb6.toString());
                                        }
                                        map2 = map;
                                        break;
                                    case 4:
                                        map = map2;
                                        cls.getMethod(strR, CharSequence.class).invoke(childAt, jVar.h);
                                        map2 = map;
                                        break;
                                    case 5:
                                        map = map2;
                                        cls.getMethod(strR, Boolean.TYPE).invoke(childAt, Boolean.valueOf(jVar.g));
                                        map2 = map;
                                        break;
                                    case 6:
                                        map = map2;
                                        try {
                                            try {
                                                cls.getMethod(strR, Float.TYPE).invoke(childAt, Float.valueOf(jVar.f));
                                            } catch (IllegalAccessException unused6) {
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append(" Custom Attribute \"");
                                                sb7.append(str2);
                                                sb7.append("\" not found on ");
                                                sb7.append(cls.getName());
                                                Log.e("TransitionLayout", sb7.toString());
                                            } catch (InvocationTargetException unused7) {
                                                StringBuilder sb8 = new StringBuilder();
                                                sb8.append(" Custom Attribute \"");
                                                sb8.append(str2);
                                                sb8.append("\" not found on ");
                                                sb8.append(cls.getName());
                                                Log.e("TransitionLayout", sb8.toString());
                                            }
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append(" Custom Attribute \"");
                                            sb9.append(str2);
                                            sb9.append("\" not found on ");
                                            sb9.append(cls.getName());
                                            Log.e("TransitionLayout", sb9.toString());
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(cls.getName());
                                            sb10.append(" must have a method ");
                                            sb10.append(strR);
                                            Log.e("TransitionLayout", sb10.toString());
                                        }
                                        map2 = map;
                                        break;
                                }
                            } catch (IllegalAccessException unused8) {
                                map = map2;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                map = map2;
                            } catch (InvocationTargetException unused9) {
                                map = map2;
                            }
                        }
                    }
                    i = childCount;
                    childAt.setLayoutParams(oooO00o);
                    aJQ ajq = ajn.b;
                    if (ajq.c == 0) {
                        childAt.setVisibility(ajq.b);
                    }
                    childAt.setAlpha(ajn.b.d);
                    childAt.setRotation(ajn.f.d);
                    childAt.setRotationX(ajn.f.e);
                    childAt.setRotationY(ajn.f.f);
                    childAt.setScaleX(ajn.f.h);
                    childAt.setScaleY(ajn.f.g);
                    if (!Float.isNaN(ajn.f.i)) {
                        childAt.setPivotX(ajn.f.i);
                    }
                    if (!Float.isNaN(ajn.f.j)) {
                        childAt.setPivotY(ajn.f.j);
                    }
                    childAt.setTranslationX(ajn.f.b);
                    childAt.setTranslationY(ajn.f.k);
                    childAt.setTranslationZ(ajn.f.l);
                    aJR ajr = ajn.f;
                    if (ajr.m) {
                        childAt.setElevation(ajr.n);
                    }
                }
                i2++;
                childCount = i;
            }
            i = childCount;
            i2++;
            childCount = i;
        }
        for (Integer num : hashSet) {
            aJN ajn2 = this.e.get(num);
            int i4 = ajn2.d.ad;
            if (i4 == -1 || i4 != 1) {
                viewGroup = constraintLayout;
            } else {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                aJO ajo2 = ajn2.d;
                int[] iArr2 = ajo2.ae;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = ajo2.af;
                    if (str3 != null) {
                        ajo2.ae = e(barrier2, str3);
                        barrier2.setReferencedIds(ajn2.d.ae);
                    }
                }
                barrier2.setType(ajn2.d.ab);
                barrier2.setMargin(ajn2.d.ac);
                ConstraintLayout.OooO00o oooO00oGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.i();
                ajn2.b(oooO00oGenerateDefaultLayoutParams);
                viewGroup = constraintLayout;
                viewGroup.addView(barrier2, oooO00oGenerateDefaultLayoutParams);
            }
            if (ajn2.d.c) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.OooO00o oooO00oGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                ajn2.b(oooO00oGenerateDefaultLayoutParams2);
                viewGroup.addView(guideline, oooO00oGenerateDefaultLayoutParams2);
            }
        }
    }

    public void d(ConstraintLayout constraintLayout) {
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!bVar.e.containsKey(Integer.valueOf(id))) {
                bVar.e.put(Integer.valueOf(id), new aJN());
            }
            aJN ajn = bVar.e.get(Integer.valueOf(id));
            HashMap<String, j> map = bVar.c;
            HashMap<String, j> map2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map.keySet()) {
                j jVar = map.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new j(jVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("getMap");
                        sb.append(str);
                        try {
                            map2.put(str, new j(jVar, cls.getMethod(sb.toString(), new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
            ajn.e = map2;
            ajn.c(id, oooO00o);
            ajn.b.b = childAt.getVisibility();
            ajn.b.d = childAt.getAlpha();
            ajn.f.d = childAt.getRotation();
            ajn.f.e = childAt.getRotationX();
            ajn.f.f = childAt.getRotationY();
            ajn.f.h = childAt.getScaleX();
            ajn.f.g = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                aJR ajr = ajn.f;
                ajr.i = pivotX;
                ajr.j = pivotY;
            }
            ajn.f.b = childAt.getTranslationX();
            ajn.f.k = childAt.getTranslationY();
            ajn.f.l = childAt.getTranslationZ();
            aJR ajr2 = ajn.f;
            if (ajr2.m) {
                ajr2.n = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aJO ajo = ajn.d;
                ajo.aj = barrier.i.ai;
                ajo.ae = barrier.getReferencedIds();
                ajn.d.ab = barrier.getType();
                ajn.d.ac = barrier.getMargin();
            }
            i++;
            bVar = this;
        }
    }

    public final int[] e(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final aJN f(Context context, AttributeSet attributeSet) {
        aJN ajn = new aJN();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                ajn.c.b = true;
                ajn.d.d = true;
                ajn.b.a = true;
                ajn.f.c = true;
            }
            switch (b.get(index)) {
                case 1:
                    aJO ajo = ajn.d;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ajo.q);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo.q = resourceId;
                    break;
                case 2:
                    aJO ajo2 = ajn.d;
                    ajo2.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo2.J);
                    break;
                case 3:
                    aJO ajo3 = ajn.d;
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, ajo3.p);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo3.p = resourceId2;
                    break;
                case 4:
                    aJO ajo4 = ajn.d;
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, ajo4.n);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo4.n = resourceId3;
                    break;
                case 5:
                    ajn.d.y = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aJO ajo5 = ajn.d;
                    ajo5.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ajo5.B);
                    break;
                case 7:
                    aJO ajo6 = ajn.d;
                    ajo6.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ajo6.D);
                    break;
                case 8:
                    aJO ajo7 = ajn.d;
                    ajo7.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo7.K);
                    break;
                case 9:
                    aJO ajo8 = ajn.d;
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, ajo8.w);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo8.w = resourceId4;
                    break;
                case 10:
                    aJO ajo9 = ajn.d;
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, ajo9.t);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo9.t = resourceId5;
                    break;
                case 11:
                    aJO ajo10 = ajn.d;
                    ajo10.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo10.N);
                    break;
                case 12:
                    aJO ajo11 = ajn.d;
                    ajo11.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo11.P);
                    break;
                case 13:
                    aJO ajo12 = ajn.d;
                    ajo12.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo12.L);
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromMediaId /* 14 */:
                    aJO ajo13 = ajn.d;
                    ajo13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo13.O);
                    break;
                case IMediaSession.Stub.TRANSACTION_playFromSearch /* 15 */:
                    aJO ajo14 = ajn.d;
                    ajo14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo14.Q);
                    break;
                case 16:
                    aJO ajo15 = ajn.d;
                    ajo15.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo15.M);
                    break;
                case IMediaSession.Stub.TRANSACTION_skipToQueueItem /* 17 */:
                    aJO ajo16 = ajn.d;
                    ajo16.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ajo16.h);
                    break;
                case IMediaSession.Stub.TRANSACTION_pause /* 18 */:
                    aJO ajo17 = ajn.d;
                    ajo17.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ajo17.g);
                    break;
                case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                    aJO ajo18 = ajn.d;
                    ajo18.i = typedArrayObtainStyledAttributes.getFloat(index, ajo18.i);
                    break;
                case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                    aJO ajo19 = ajn.d;
                    ajo19.v = typedArrayObtainStyledAttributes.getFloat(index, ajo19.v);
                    break;
                case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                    aJO ajo20 = ajn.d;
                    ajo20.f = typedArrayObtainStyledAttributes.getLayoutDimension(index, ajo20.f);
                    break;
                case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                    aJQ ajq = ajn.b;
                    ajq.b = typedArrayObtainStyledAttributes.getInt(index, ajq.b);
                    aJQ ajq2 = ajn.b;
                    ajq2.b = a[ajq2.b];
                    break;
                case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                    aJO ajo21 = ajn.d;
                    ajo21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, ajo21.e);
                    break;
                case IMediaSession.Stub.TRANSACTION_seekTo /* 24 */:
                    aJO ajo22 = ajn.d;
                    ajo22.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo22.E);
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    aJO ajo23 = ajn.d;
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, ajo23.j);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo23.j = resourceId6;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    aJO ajo24 = ajn.d;
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, ajo24.b);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo24.b = resourceId7;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    aJO ajo25 = ajn.d;
                    ajo25.C = typedArrayObtainStyledAttributes.getInt(index, ajo25.C);
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    aJO ajo26 = ajn.d;
                    ajo26.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo26.F);
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    aJO ajo27 = ajn.d;
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, ajo27.k);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo27.k = resourceId8;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    aJO ajo28 = ajn.d;
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, ajo28.l);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo28.l = resourceId9;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    aJO ajo29 = ajn.d;
                    ajo29.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo29.H);
                    break;
                case IMediaSession.Stub.TRANSACTION_getRatingType /* 32 */:
                    aJO ajo30 = ajn.d;
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, ajo30.s);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo30.s = resourceId10;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    aJO ajo31 = ajn.d;
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, ajo31.r);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo31.r = resourceId11;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    aJO ajo32 = ajn.d;
                    ajo32.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo32.I);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    aJO ajo33 = ajn.d;
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, ajo33.f17o);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo33.f17o = resourceId12;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    aJO ajo34 = ajn.d;
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, ajo34.m);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo34.m = resourceId13;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    aJO ajo35 = ajn.d;
                    ajo35.x = typedArrayObtainStyledAttributes.getFloat(index, ajo35.x);
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    ajn.a = typedArrayObtainStyledAttributes.getResourceId(index, ajn.a);
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    aJO ajo36 = ajn.d;
                    ajo36.T = typedArrayObtainStyledAttributes.getFloat(index, ajo36.T);
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    aJO ajo37 = ajn.d;
                    ajo37.G = typedArrayObtainStyledAttributes.getFloat(index, ajo37.G);
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    aJO ajo38 = ajn.d;
                    ajo38.S = typedArrayObtainStyledAttributes.getInt(index, ajo38.S);
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    aJO ajo39 = ajn.d;
                    ajo39.U = typedArrayObtainStyledAttributes.getInt(index, ajo39.U);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    aJQ ajq3 = ajn.b;
                    ajq3.d = typedArrayObtainStyledAttributes.getFloat(index, ajq3.d);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    aJR ajr = ajn.f;
                    ajr.m = true;
                    ajr.n = typedArrayObtainStyledAttributes.getDimension(index, ajr.n);
                    break;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    aJR ajr2 = ajn.f;
                    ajr2.e = typedArrayObtainStyledAttributes.getFloat(index, ajr2.e);
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    aJR ajr3 = ajn.f;
                    ajr3.f = typedArrayObtainStyledAttributes.getFloat(index, ajr3.f);
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    aJR ajr4 = ajn.f;
                    ajr4.h = typedArrayObtainStyledAttributes.getFloat(index, ajr4.h);
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    aJR ajr5 = ajn.f;
                    ajr5.g = typedArrayObtainStyledAttributes.getFloat(index, ajr5.g);
                    break;
                case 49:
                    aJR ajr6 = ajn.f;
                    ajr6.i = typedArrayObtainStyledAttributes.getDimension(index, ajr6.i);
                    break;
                case 50:
                    aJR ajr7 = ajn.f;
                    ajr7.j = typedArrayObtainStyledAttributes.getDimension(index, ajr7.j);
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    aJR ajr8 = ajn.f;
                    ajr8.b = typedArrayObtainStyledAttributes.getDimension(index, ajr8.b);
                    break;
                case 52:
                    aJR ajr9 = ajn.f;
                    ajr9.k = typedArrayObtainStyledAttributes.getDimension(index, ajr9.k);
                    break;
                case 53:
                    aJR ajr10 = ajn.f;
                    ajr10.l = typedArrayObtainStyledAttributes.getDimension(index, ajr10.l);
                    break;
                case 54:
                    aJO ajo40 = ajn.d;
                    ajo40.R = typedArrayObtainStyledAttributes.getInt(index, ajo40.R);
                    break;
                case 55:
                    aJO ajo41 = ajn.d;
                    ajo41.V = typedArrayObtainStyledAttributes.getInt(index, ajo41.V);
                    break;
                case 56:
                    aJO ajo42 = ajn.d;
                    ajo42.ak = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo42.ak);
                    break;
                case 57:
                    aJO ajo43 = ajn.d;
                    ajo43.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo43.W);
                    break;
                case 58:
                    aJO ajo44 = ajn.d;
                    ajo44.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo44.X);
                    break;
                case 59:
                    aJO ajo45 = ajn.d;
                    ajo45.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo45.Y);
                    break;
                case 60:
                    aJR ajr11 = ajn.f;
                    ajr11.d = typedArrayObtainStyledAttributes.getFloat(index, ajr11.d);
                    break;
                case 61:
                    aJO ajo46 = ajn.d;
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, ajo46.u);
                    if (resourceId14 == -1) {
                        resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajo46.u = resourceId14;
                    break;
                case 62:
                    aJO ajo47 = ajn.d;
                    ajo47.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo47.A);
                    break;
                case 63:
                    aJO ajo48 = ajn.d;
                    ajo48.z = typedArrayObtainStyledAttributes.getFloat(index, ajo48.z);
                    break;
                case 64:
                    aJP ajp = ajn.c;
                    int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, ajp.c);
                    if (resourceId15 == -1) {
                        resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    ajp.c = resourceId15;
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        ajn.c.d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        ajn.c.d = ivas.gov.bisp.enumeration.O.r.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    ajn.c.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    aJP ajp2 = ajn.c;
                    ajp2.h = typedArrayObtainStyledAttributes.getFloat(index, ajp2.h);
                    break;
                case 68:
                    aJQ ajq4 = ajn.b;
                    ajq4.e = typedArrayObtainStyledAttributes.getFloat(index, ajq4.e);
                    break;
                case 69:
                    ajn.d.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    ajn.d.aa = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aJO ajo49 = ajn.d;
                    ajo49.ab = typedArrayObtainStyledAttributes.getInt(index, ajo49.ab);
                    break;
                case 73:
                    aJO ajo50 = ajn.d;
                    ajo50.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ajo50.ac);
                    break;
                case 74:
                    ajn.d.af = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    aJO ajo51 = ajn.d;
                    ajo51.aj = typedArrayObtainStyledAttributes.getBoolean(index, ajo51.aj);
                    break;
                case 76:
                    aJP ajp3 = ajn.c;
                    ajp3.e = typedArrayObtainStyledAttributes.getInt(index, ajp3.e);
                    break;
                case 77:
                    ajn.d.ah = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    aJQ ajq5 = ajn.b;
                    ajq5.c = typedArrayObtainStyledAttributes.getInt(index, ajq5.c);
                    break;
                case 79:
                    aJP ajp4 = ajn.c;
                    ajp4.f = typedArrayObtainStyledAttributes.getFloat(index, ajp4.f);
                    break;
                case 80:
                    aJO ajo52 = ajn.d;
                    ajo52.ag = typedArrayObtainStyledAttributes.getBoolean(index, ajo52.ag);
                    break;
                case 81:
                    aJO ajo53 = ajn.d;
                    ajo53.ai = typedArrayObtainStyledAttributes.getBoolean(index, ajo53.ai);
                    break;
                case 82:
                    b.get(index);
                    break;
                default:
                    b.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return ajn;
    }

    public void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    aJN ajnF = f(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        ajnF.d.c = true;
                    }
                    this.e.put(Integer.valueOf(ajnF.a), ajnF);
                } else {
                    continue;
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
