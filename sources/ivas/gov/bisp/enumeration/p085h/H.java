package ivas.gov.bisp.enumeration.p085h;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    private static int a = 0;
    private static int b = 1;
    public static final Class<?> c;
    public static final Field d;
    public static final Field e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Handler i = new Handler(Looper.getMainLooper());

    public class aUx implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ aUz c;
        public final /* synthetic */ Object d;

        public aUx(aUz auz, Object obj) {
            this.c = auz;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 9) + (i2 | 9);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.c.c = this.d;
            int i5 = a;
            int i6 = i5 & 97;
            int i7 = (i5 | 97) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }
    }

    public class aUy implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Application c;
        public final /* synthetic */ aUz d;

        public aUy(Application application, aUz auz) {
            this.c = application;
            this.d = auz;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a + 3;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.c.unregisterActivityLifecycleCallbacks(this.d);
            int i4 = a;
            int i5 = i4 ^ 41;
            int i6 = ((i4 & 41) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Class<?> cls2;
        Method declaredMethod3;
        int i2;
        int i3;
        int i4 = b;
        int i5 = ((((i4 ^ 123) | (i4 & 123)) << 1) - (~(-(((~i4) & 123) | (i4 & (-124)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
            int i7 = a;
            int i8 = i7 & 113;
            int i9 = -(-(i7 | 113));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } catch (Throwable unused) {
            cls = null;
        }
        c = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            int i12 = b;
            int i13 = (((i12 & (-112)) | ((~i12) & 111)) - (~((i12 & 111) << 1))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            declaredField.setAccessible(true);
            int i15 = a;
            int i16 = ((i15 ^ 56) + ((i15 & 56) << 1)) - 1;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 2 % 2;
            }
        } catch (Throwable unused2) {
            declaredField = null;
        }
        d = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
            int i18 = a;
            int i19 = (i18 & 77) + (i18 | 77);
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        e = declaredField2;
        Class<?> cls3 = c;
        if (cls3 == null) {
            i3 = (-2) - ((b + 58) ^ (-1));
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i22 = 2 % 5;
            } else {
                int i23 = 2 % 2;
            }
            declaredMethod = null;
        } else {
            try {
                Class<?>[] clsArr = new Class[3];
                clsArr[0] = IBinder.class;
                Class<?> cls4 = Boolean.TYPE;
                int i24 = b;
                int i25 = i24 & 81;
                int i26 = i25 + ((i24 ^ 81) | i25);
                a = i26 % 128;
                if (i26 % 2 != 0) {
                    clsArr[1] = cls4;
                    clsArr[4] = String.class;
                    declaredMethod = cls3.getDeclaredMethod("performStopActivity", clsArr);
                } else {
                    clsArr[1] = cls4;
                    clsArr[2] = String.class;
                    declaredMethod = cls3.getDeclaredMethod("performStopActivity", clsArr);
                }
                declaredMethod.setAccessible(true);
                int i27 = b;
                int i28 = i27 & 83;
                int i29 = ((i27 ^ 83) | i28) << 1;
                int i30 = -((i27 | 83) & (~i28));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 2 % 2;
                }
            } catch (Throwable unused4) {
                i3 = (-2) - ((b + 58) ^ (-1));
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i210 = 2 % 5;
                } else {
                    int i211 = 2 % 2;
                }
                declaredMethod = null;
            }
        }
        f = declaredMethod;
        Class<?> cls5 = c;
        if (cls5 == null) {
            int i33 = b;
            i2 = ((i33 | 75) << 1) - (i33 ^ 75);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i34 = 4 / 5;
            } else {
                int i35 = 2 % 2;
            }
            declaredMethod2 = null;
        } else {
            try {
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = IBinder.class;
                int i36 = a;
                int i37 = i36 & 87;
                int i38 = (i36 | 87) & (~i37);
                int i39 = i37 << 1;
                int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                b = i40 % 128;
                if (i40 % 2 == 0) {
                    clsArr2[1] = Boolean.TYPE;
                    cls5.getDeclaredMethod("performStopActivity", clsArr2);
                    obj.hashCode();
                    throw null;
                }
                clsArr2[1] = Boolean.TYPE;
                declaredMethod2 = cls5.getDeclaredMethod("performStopActivity", clsArr2);
                declaredMethod2.setAccessible(true);
                int i41 = a;
                int i42 = (i41 ^ 105) + ((i41 & 105) << 1);
                b = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 2 % 2;
                }
            } catch (Throwable unused5) {
                int i310 = b;
                i2 = ((i310 | 75) << 1) - (i310 ^ 75);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i311 = 4 / 5;
                } else {
                    int i312 = 2 % 2;
                }
                declaredMethod2 = null;
            }
        }
        h = declaredMethod2;
        Class<?> cls6 = c;
        if (!b()) {
            declaredMethod3 = null;
        } else {
            int i44 = b;
            int i45 = (i44 ^ 121) + ((i44 & 121) << 1);
            int i46 = i45 % 128;
            a = i46;
            int i47 = i45 % 2;
            if (cls6 == null) {
                int i48 = i46 & 125;
                int i49 = -(-((i46 ^ 125) | i48));
                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                b = i50 % 128;
                if (i50 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i51 = 2 % 2;
            } else {
                try {
                    Class<?>[] clsArr3 = new Class[9];
                    clsArr3[0] = IBinder.class;
                    int i52 = ((i44 & 64) + (i44 | 64)) - 1;
                    a = i52 % 128;
                    if (i52 % 2 != 0) {
                        clsArr3[1] = List.class;
                        clsArr3[3] = List.class;
                        clsArr3[5] = Integer.TYPE;
                        cls2 = Boolean.TYPE;
                    } else {
                        clsArr3[1] = List.class;
                        clsArr3[2] = List.class;
                        clsArr3[3] = Integer.TYPE;
                        cls2 = Boolean.TYPE;
                    }
                    int i53 = a + 101;
                    int i54 = i53 % 128;
                    b = i54;
                    int i55 = i53 % 2;
                    clsArr3[4] = cls2;
                    clsArr3[5] = Configuration.class;
                    int i56 = i54 | 99;
                    int i57 = i56 << 1;
                    int i58 = -(i56 & (~(i54 & 99)));
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    a = i59 % 128;
                    if (i59 % 2 != 0) {
                        clsArr3[6] = Configuration.class;
                        clsArr3[43] = cls2;
                        clsArr3[80] = cls2;
                    } else {
                        clsArr3[6] = Configuration.class;
                        clsArr3[7] = cls2;
                        clsArr3[8] = cls2;
                    }
                    declaredMethod3 = cls6.getDeclaredMethod("requestRelaunchActivity", clsArr3);
                    declaredMethod3.setAccessible(true);
                    int i60 = a;
                    int i61 = (((i60 ^ 91) | (i60 & 91)) << 1) - (((~i60) & 91) | (i60 & (-92)));
                    b = i61 % 128;
                    if (i61 % 2 != 0) {
                        int i62 = 2 % 2;
                    }
                } catch (Throwable unused6) {
                    declaredMethod3 = null;
                }
            }
            declaredMethod3 = null;
        }
        g = declaredMethod3;
        int i63 = a;
        int i64 = (i63 ^ 75) + ((i63 & 75) << 1);
        b = i64 % 128;
        if (i64 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public static boolean b() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 25) + (i3 | 25);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i6 != 26) {
            int i7 = b;
            int i8 = i7 & 55;
            int i9 = -(-((i7 ^ 55) | i8));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (i6 != 27) {
                int i12 = ((i7 & (-34)) | ((~i7) & 33)) + ((i7 & 33) << 1);
                int i13 = i12 % 128;
                a = i13;
                z = i12 % 2 != 0;
                int i14 = i13 + 63;
                b = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = b;
                int i17 = i16 & 53;
                int i18 = -(-((i16 ^ 53) | i17));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
        } else {
            int i110 = b;
            int i111 = i110 & 53;
            int i112 = -(-((i110 ^ 53) | i111));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            a = i113 % 128;
            int i21 = i113 % 2;
        }
        int i22 = (-2) - ((a + 98) ^ (-1));
        b = i22 % 128;
        int i23 = i22 % 2;
        return z;
    }

    public static final class aUz implements Application.ActivityLifecycleCallbacks {
        private static int a = 0;
        private static int b = 1;
        public Object c;
        public Activity d;
        public final int e;
        public boolean f = false;
        public boolean h = false;
        public boolean g = false;

        public aUz(Activity activity) {
            this.d = activity;
            this.e = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 79;
            int i4 = i3 + ((i2 ^ 79) | i3);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 115;
            int i4 = i3 + ((i2 ^ 115) | i3);
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.d == activity) {
                this.d = null;
                this.h = true;
                int i6 = i5 + 87;
                b = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = (i5 & (-34)) | ((~i5) & 33);
            int i9 = -(-((i5 & 33) << 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 80 / 0;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-36)) | ((~i2) & 35)) - (~((i2 & 35) << 1))) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 72 / 0;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 61;
            int i4 = (i3 << 1) - ((~(i2 & 61)) & i3);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = (i2 | 121) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (this.d == activity) {
                int i9 = ((i7 ^ 33) | (i7 & 33)) << 1;
                int i10 = -(((~i7) & 33) | (i7 & (-34)));
                int i11 = (i9 & i10) + (i9 | i10);
                int i12 = i11 % 128;
                b = i12;
                if (i11 % 2 == 0) {
                    this.f = false;
                } else {
                    this.f = true;
                }
                int i13 = (i12 & (-20)) | ((~i12) & 19);
                int i14 = (i12 & 19) << 1;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = i17 & 15;
            int i19 = ((i17 ^ 15) | i18) << 1;
            int i20 = -((i17 | 15) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 37;
            int i4 = (((i2 ^ 37) | i3) << 1) - ((i2 | 37) & (~i3));
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:15:0x003a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0060  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c A[Catch: all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:16:0x004f, B:18:0x005a, B:22:0x006c, B:25:0x0084, B:27:0x009e, B:29:0x00d6, B:30:0x00dc), top: B:35:0x004f }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0072  */
        /* JADX WARN: Code duplicated, block: B:25:0x0084 A[Catch: all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:16:0x004f, B:18:0x005a, B:22:0x006c, B:25:0x0084, B:27:0x009e, B:29:0x00d6, B:30:0x00dc), top: B:35:0x004f }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:16:0x004f, B:18:0x005a, B:22:0x006c, B:25:0x0084, B:27:0x009e, B:29:0x00d6, B:30:0x00dc), top: B:35:0x004f }] */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object obj;
            int i;
            Object obj2;
            int i2;
            Object obj3;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 1;
            int i6 = (i4 ^ 1) | i5;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (this.h) {
                int i9 = i4 & 59;
                int i10 = i9 + ((i4 ^ 59) | i9);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 19 / 0;
                    if (!this.g) {
                        if (!this.f) {
                            int i12 = i4 | 47;
                            int i13 = ((i12 << 1) - (~(-((~(i4 & 47)) & i12)))) - 1;
                            a = i13 % 128;
                            int i14 = i13 % 2;
                            obj = this.c;
                            i = this.e;
                            try {
                                Field field = H.e;
                                int i15 = b + 51;
                                a = i15 % 128;
                                int i16 = i15 % 2;
                                obj2 = field.get(activity);
                                if (obj2 == obj) {
                                    i2 = b + 79;
                                    a = i2 % 128;
                                    obj3 = null;
                                    if (i2 % 2 == 0) {
                                        activity.hashCode();
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    if (activity.hashCode() != i) {
                                        int i17 = a;
                                        int i18 = ((i17 & (-118)) | ((~i17) & 117)) + ((i17 & 117) << 1);
                                        b = i18 % 128;
                                        int i19 = i18 % 2;
                                    } else {
                                        Object obj4 = H.d.get(activity);
                                        Handler handler = H.i;
                                        G g = new G(obj4, obj2);
                                        int i20 = a;
                                        int i21 = i20 & 85;
                                        int i22 = i21 + ((i20 ^ 85) | i21);
                                        b = i22 % 128;
                                        int i23 = i22 % 2;
                                        handler.postAtFrontOfQueue(g);
                                        int i24 = a;
                                        int i25 = i24 & 41;
                                        int i26 = -(-((i24 ^ 41) | i25));
                                        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                                        b = i27 % 128;
                                        int i28 = i27 % 2;
                                        int i29 = (-2) - ((i24 + 54) ^ (-1));
                                        b = i29 % 128;
                                        int i30 = i29 % 2;
                                        this.g = true;
                                        this.c = null;
                                        int i31 = i24 & 97;
                                        int i32 = (i24 | 97) & (~i31);
                                        int i33 = -(-(i31 << 1));
                                        int i34 = (i32 & i33) + (i32 | i33);
                                        b = i34 % 128;
                                        int i35 = i34 % 2;
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("ActivityRecreator", "Exception while fetching field values", th);
                            }
                        }
                    }
                } else if (!this.g) {
                    if (!this.f) {
                        int i110 = i4 | 47;
                        int i111 = ((i110 << 1) - (~(-((~(i4 & 47)) & i110)))) - 1;
                        a = i111 % 128;
                        int i112 = i111 % 2;
                        obj = this.c;
                        i = this.e;
                        Field field2 = H.e;
                        int i113 = b + 51;
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        obj2 = field2.get(activity);
                        if (obj2 == obj) {
                            i2 = b + 79;
                            a = i2 % 128;
                            obj3 = null;
                            if (i2 % 2 == 0) {
                                activity.hashCode();
                                obj3.hashCode();
                                throw null;
                            }
                            if (activity.hashCode() != i) {
                                int i115 = a;
                                int i116 = ((i115 & (-118)) | ((~i115) & 117)) + ((i115 & 117) << 1);
                                b = i116 % 128;
                                int i117 = i116 % 2;
                            } else {
                                Object obj5 = H.d.get(activity);
                                Handler handler2 = H.i;
                                G g2 = new G(obj5, obj2);
                                int i210 = a;
                                int i211 = i210 & 85;
                                int i212 = i211 + ((i210 ^ 85) | i211);
                                b = i212 % 128;
                                int i213 = i212 % 2;
                                handler2.postAtFrontOfQueue(g2);
                                int i214 = a;
                                int i215 = i214 & 41;
                                int i216 = -(-((i214 ^ 41) | i215));
                                int i217 = ((i215 | i216) << 1) - (i215 ^ i216);
                                b = i217 % 128;
                                int i218 = i217 % 2;
                                int i219 = (-2) - ((i214 + 54) ^ (-1));
                                b = i219 % 128;
                                int i36 = i219 % 2;
                                this.g = true;
                                this.c = null;
                                int i37 = i214 & 97;
                                int i38 = (i214 | 97) & (~i37);
                                int i39 = -(-(i37 << 1));
                                int i310 = (i38 & i39) + (i38 | i39);
                                b = i310 % 128;
                                int i311 = i310 % 2;
                            }
                        }
                    }
                }
            }
            int i40 = (-2) - ((a + 98) ^ (-1));
            b = i40 % 128;
            int i41 = i40 % 2;
        }
    }

    public static boolean c(Activity activity) {
        char c2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 4) << 1) - (i3 ^ 4);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0 ? Build.VERSION.SDK_INT >= 28 : Build.VERSION.SDK_INT >= 15) {
            activity.recreate();
            int i6 = a;
            int i7 = (i6 ^ 41) + ((i6 & 41) << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 90 / 0;
            }
            return true;
        }
        if (b()) {
            int i9 = b;
            int i10 = ((i9 | 1) << 1) - (i9 ^ 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            if (g == null) {
                int i13 = i11 & 71;
                int i14 = (i11 | 71) & (~i13);
                int i15 = i13 << 1;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
        }
        if (h == null) {
            int i18 = a + 43;
            int i19 = i18 % 128;
            b = i19;
            int i20 = i18 % 2;
            if (f == null) {
                int i21 = i19 & 103;
                int i22 = (~i21) & (i19 | 103);
                int i23 = i21 << 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                a = i24 % 128;
                boolean z = i24 % 2 != 0;
                int i25 = i19 & 5;
                int i26 = -(-((i19 ^ 5) | i25));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
                return z;
            }
        }
        try {
            Object obj = e.get(activity);
            if (obj == null) {
                int i29 = a;
                int i30 = (((i29 & (-110)) | ((~i29) & 109)) - (~((i29 & 109) << 1))) - 1;
                b = i30 % 128;
                int i31 = i30 % 2;
                int i32 = (i29 ^ 33) + ((i29 & 33) << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
                return false;
            }
            Object obj2 = d.get(activity);
            if (obj2 == null) {
                int i34 = a;
                int i35 = (((i34 | 94) << 1) - (i34 ^ 94)) - 1;
                b = i35 % 128;
                int i36 = i35 % 2;
                int i37 = (i34 ^ 87) + ((i34 & 87) << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
                return false;
            }
            Application application = activity.getApplication();
            aUz auz = new aUz(activity);
            application.registerActivityLifecycleCallbacks(auz);
            Handler handler = i;
            aUx aux = new aUx(auz, obj);
            int i39 = a;
            int i40 = i39 & 79;
            int i41 = i40 + ((i39 ^ 79) | i40);
            b = i41 % 128;
            int i42 = i41 % 2;
            try {
                handler.post(aux);
                try {
                    if (!b()) {
                        activity.recreate();
                        int i43 = a;
                        int i44 = ((i43 | 85) << 1) - (i43 ^ 85);
                        b = i44 % 128;
                        if (i44 % 2 == 0) {
                            int i45 = 5 % 5;
                        }
                    } else {
                        int i46 = a;
                        int i47 = (i46 & 83) + (i46 | 83);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                        Method method = g;
                        Object[] objArr = new Object[9];
                        int i49 = ((i46 & 47) - (~(i46 | 47))) - 1;
                        b = i49 % 128;
                        if (i49 % 2 == 0) {
                            objArr[0] = obj;
                            objArr[1] = null;
                            objArr[5] = null;
                            c2 = 2;
                        } else {
                            objArr[0] = obj;
                            objArr[1] = null;
                            objArr[2] = null;
                            c2 = 3;
                        }
                        objArr[c2] = 0;
                        Boolean bool = Boolean.FALSE;
                        int i50 = a;
                        int i51 = i50 & 101;
                        int i52 = ((i50 ^ 101) | i51) << 1;
                        int i53 = -((~i51) & (i50 | 101));
                        int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                        int i55 = i54 % 128;
                        b = i55;
                        if (i54 % 2 == 0) {
                            objArr[4] = bool;
                            objArr[3] = null;
                            objArr[78] = null;
                        } else {
                            objArr[4] = bool;
                            objArr[5] = null;
                            objArr[6] = null;
                        }
                        int i56 = ((i55 | 73) << 1) - (i55 ^ 73);
                        a = i56 % 128;
                        if (i56 % 2 != 0) {
                            objArr[87] = bool;
                            objArr[18] = bool;
                        } else {
                            objArr[7] = bool;
                            objArr[8] = bool;
                        }
                        method.invoke(obj2, objArr);
                        int i57 = b;
                        int i58 = (i57 & 89) + (i57 | 89);
                        a = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    int i60 = a;
                    int i61 = i60 + 75;
                    b = i61 % 128;
                    int i62 = i61 % 2;
                    int i63 = i60 + 103;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    return true;
                } finally {
                    i.post(new aUy(application, auz));
                }
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }
}
