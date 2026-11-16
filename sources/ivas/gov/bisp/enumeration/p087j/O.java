package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.OooOOO0.OooO;
import ivas.gov.bisp.enumeration.OooOOO0.OooO0OO;
import ivas.gov.bisp.enumeration.OooOOO0.o000OOo;
import ivas.gov.bisp.enumeration.OooOOO0.o00Ooo;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class O {
    private static int a = 0;
    private static int b = 1;
    public static final Class<?>[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final String[] h;
    public static final OooOOOO<String, Constructor<? extends View>> i;
    public final Object[] j = new Object[2];

    public OooO0OO c(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        OooO0OO oooO0OO = new OooO0OO(context, attributeSet);
        int i3 = a;
        int i4 = i3 & 49;
        int i5 = (i3 ^ 49) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return oooO0OO;
    }

    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        AppCompatButton appCompatButton = new AppCompatButton(context, attributeSet);
        int i3 = b;
        int i4 = ((i3 | 73) << 1) - (i3 ^ 73);
        a = i4 % 128;
        int i5 = i4 % 2;
        return appCompatButton;
    }

    public OooO e(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        OooO oooO = new OooO(context, attributeSet);
        int i3 = b + 111;
        a = i3 % 128;
        int i4 = i3 % 2;
        return oooO;
    }

    public o000OOo h(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        o000OOo o000ooo = new o000OOo(context, attributeSet);
        int i3 = b;
        int i4 = (i3 ^ 69) + ((i3 & 69) << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return o000ooo;
    }

    public final void i(View view, String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 123) + (i3 | 123);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (view != null) {
            int i5 = ((i3 ^ 125) | (i3 & 125)) << 1;
            int i6 = -((i3 & (-126)) | ((~i3) & 125));
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 53 / 0;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        Class<?> cls = getClass();
        int i9 = a;
        int i10 = (((i9 | 43) << 1) - (~(-(((~i9) & 43) | (i9 & (-44)))))) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            sb.append(cls.getName());
            sb.append(" asked to inflate view for <");
            obj.hashCode();
            throw null;
        }
        sb.append(cls.getName());
        sb.append(" asked to inflate view for <");
        int i11 = b + 125;
        a = i11 % 128;
        int i12 = i11 % 2;
        sb.append(str);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }

    public o00Ooo f(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        o00Ooo o00ooo = new o00Ooo(context, attributeSet, R.attr.radioButtonStyle);
        int i3 = a;
        int i4 = ((i3 | 117) << 1) - (i3 ^ 117);
        b = i4 % 128;
        int i5 = i4 % 2;
        return o00ooo;
    }

    static {
        int[] iArr;
        String[] strArr;
        int i2 = 1 & 113;
        int i3 = ((1 ^ 113) | i2) << 1;
        int i4 = -((~i2) & (1 | 113));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        c = new Class[]{Context.class, AttributeSet.class};
        int[] iArr2 = {android.R.attr.onClick};
        int i8 = i6 | 51;
        int i9 = i8 << 1;
        int i10 = -(i8 & (~(i6 & 51)));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            d = iArr2;
            iArr = new int[0];
            iArr[1] = 16844160;
        } else {
            d = iArr2;
            iArr = new int[]{android.R.attr.accessibilityHeading};
        }
        e = iArr;
        g = new int[]{android.R.attr.accessibilityPaneTitle};
        int i12 = i6 & 69;
        int i13 = (((i6 ^ 69) | i12) << 1) - ((~i12) & (i6 | 69));
        int i14 = i13 % 128;
        b = i14;
        int i15 = i13 % 2;
        f = new int[]{android.R.attr.screenReaderFocusable};
        int i16 = i14 + 21;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            strArr = new String[3];
            strArr[0] = "android.widget.";
            strArr[1] = "android.view.";
        } else {
            strArr = new String[3];
            strArr[0] = "android.widget.";
            strArr[1] = "android.view.";
        }
        strArr[2] = "android.webkit.";
        h = strArr;
        t tVar = new t();
        int i17 = b;
        int i18 = i17 & 103;
        int i19 = (~i18) & (i17 | 103);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            i = tVar;
            throw null;
        }
        i = tVar;
        int i22 = ((i17 ^ 94) + ((i17 & 94) << 1)) - 1;
        a = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    public static class aQS implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;
        public final View c;
        public final String d;
        public Method e;
        public Context f;

        public aQS(View view, String str) {
            this.c = view;
            this.d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            View view2;
            Class<?> cls;
            String str;
            Class<?>[] clsArr;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 73) | (i2 & 73)) << 1;
            int i4 = -(((~i2) & 73) | (i2 & (-74)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.e == null) {
                Context context = this.c.getContext();
                int i6 = a + 107;
                b = i6 % 128;
                int i7 = i6 % 2;
                while (true) {
                    if (context == null) {
                        int id = this.c.getId();
                        if (id == -1) {
                            int i8 = a;
                            int i9 = ((i8 ^ 83) | (i8 & 83)) << 1;
                            int i10 = -(((~i8) & 83) | (i8 & (-84)));
                            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                            int i12 = i11 % 128;
                            b = i12;
                            int i13 = i11 % 2;
                            int i14 = (i12 & 73) + (i12 | 73);
                            a = i14 % 128;
                            int i15 = i14 % 2;
                            string = BuildConfig.FLAVOR;
                        } else {
                            StringBuilder sbW = j.w(" with id '");
                            Context context2 = this.c.getContext();
                            int i16 = b + 121;
                            a = i16 % 128;
                            int i17 = i16 % 2;
                            sbW.append(context2.getResources().getResourceEntryName(id));
                            int i18 = b;
                            int i19 = (i18 & 99) + (i18 | 99);
                            a = i19 % 128;
                            if (i19 % 2 != 0) {
                                sbW.append("'");
                                sbW.toString();
                                throw null;
                            }
                            sbW.append("'");
                            string = sbW.toString();
                            int i20 = b;
                            int i21 = i20 ^ 47;
                            int i22 = ((i20 & 47) | i21) << 1;
                            int i23 = -i21;
                            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                            a = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i25 = 3 % 4;
                            }
                        }
                        StringBuilder sbW2 = j.w("Could not find method ");
                        sbW2.append(this.d);
                        int i26 = a + 81;
                        b = i26 % 128;
                        if (i26 % 2 == 0) {
                            sbW2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            view2 = this.c;
                            int i27 = 12 / 0;
                        } else {
                            sbW2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            view2 = this.c;
                        }
                        sbW2.append(view2.getClass());
                        sbW2.append(string);
                        throw new IllegalStateException(sbW2.toString());
                    }
                    int i28 = a;
                    int i29 = i28 ^ 81;
                    int i30 = (i28 & 81) << 1;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    b = i31 % 128;
                    if (i31 % 2 == 0) {
                        context.isRestricted();
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        if (!context.isRestricted()) {
                            int i32 = a;
                            int i33 = i32 & 119;
                            int i34 = (((i32 | 119) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
                            b = i34 % 128;
                            if (i34 % 2 == 0) {
                                cls = context.getClass();
                                str = this.d;
                                clsArr = new Class[0];
                            } else {
                                cls = context.getClass();
                                str = this.d;
                                clsArr = new Class[1];
                            }
                            int i35 = a;
                            int i36 = (i35 ^ 117) + ((i35 & 117) << 1);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            clsArr[0] = View.class;
                            Method method = cls.getMethod(str, clsArr);
                            if (method != null) {
                                int i38 = b;
                                int i39 = ((i38 | 105) << 1) - (i38 ^ 105);
                                a = i39 % 128;
                                int i40 = i39 % 2;
                                this.e = method;
                                this.f = context;
                                int i41 = (i38 & (-66)) | ((~i38) & 65);
                                int i42 = (i38 & 65) << 1;
                                int i43 = (i41 & i42) + (i41 | i42);
                                a = i43 % 128;
                                int i44 = i43 % 2;
                                break;
                            }
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (!(!(context instanceof ContextWrapper))) {
                        int i45 = b;
                        int i46 = ((i45 & 40) + (i45 | 40)) - 1;
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        context = ((ContextWrapper) context).getBaseContext();
                        int i48 = b;
                        int i49 = i48 & 41;
                        int i50 = (i49 - (~((i48 ^ 41) | i49))) - 1;
                        a = i50 % 128;
                        int i51 = i50 % 2;
                    } else {
                        int i52 = a;
                        int i53 = i52 & 5;
                        int i54 = i53 + ((i52 ^ 5) | i53);
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        context = null;
                    }
                }
            }
            try {
                Method method2 = this.e;
                Context context3 = this.f;
                int i56 = a + 113;
                int i57 = i56 % 128;
                b = i57;
                int i58 = i56 % 2;
                Object[] objArr = {view};
                int i59 = ((i57 ^ 35) | (i57 & 35)) << 1;
                int i60 = -((i57 & (-36)) | ((~i57) & 35));
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                a = i61 % 128;
                if (i61 % 2 == 0) {
                    method2.invoke(context3, objArr);
                } else {
                    method2.invoke(context3, objArr);
                    obj.hashCode();
                    throw null;
                }
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public final View g(Context context, String str, String str2) {
        String string;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 39) << 1) - (i3 ^ 39);
        a = i4 % 128;
        int i5 = i4 % 2;
        OooOOOO<String, Constructor<? extends View>> oooOOOO = i;
        Object obj = null;
        Constructor constructor = (Constructor) oooOOOO.getOrDefault(str, null);
        int i6 = b;
        int i7 = ((i6 | 77) << 1) - (i6 ^ 77);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (constructor == null) {
            int i9 = (i6 ^ 3) + ((i6 & 3) << 1);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i12 = b;
                    int i13 = i12 | 23;
                    int i14 = i13 << 1;
                    int i15 = -((~(i12 & 23)) & i13);
                    int i16 = (i14 & i15) + (i15 | i14);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    sb.append(str2);
                    sb.append(str);
                    int i18 = b;
                    int i19 = (i18 ^ 75) + ((i18 & 75) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    string = sb.toString();
                    int i21 = b;
                    int i22 = ((i21 | 95) << 1) - (((~i21) & 95) | (i21 & (-96)));
                    a = i22 % 128;
                    int i23 = i22 % 2;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                int i24 = i10 & 59;
                int i25 = ((i10 ^ 59) | i24) << 1;
                int i26 = -((~i24) & (i10 | 59));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                b = i27 % 128;
                int i28 = i27 % 2;
                string = str;
            }
            Class<?> cls = Class.forName(string, false, context.getClassLoader());
            int i29 = a;
            int i30 = i29 ^ 93;
            int i31 = ((((i29 & 93) | i30) << 1) - (~(-i30))) - 1;
            b = i31 % 128;
            int i32 = i31 % 2;
            constructor = cls.asSubclass(View.class).getConstructor(c);
            int i33 = a;
            int i34 = (i33 & 117) + (i33 | 117);
            b = i34 % 128;
            int i35 = i34 % 2;
            oooOOOO.put(str, constructor);
            int i36 = b + 3;
            a = i36 % 128;
            int i37 = i36 % 2;
        }
        constructor.setAccessible(true);
        Object objNewInstance = constructor.newInstance(this.j);
        int i38 = a;
        int i39 = i38 & 31;
        int i40 = (i38 | 31) & (~i39);
        int i41 = i39 << 1;
        int i42 = (i40 & i41) + (i40 | i41);
        b = i42 % 128;
        if (i42 % 2 != 0) {
            return (View) objNewInstance;
        }
        obj.hashCode();
        throw null;
    }
}
