package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.OooO0O0;
import androidx.core.widget.NestedScrollView;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p087j.DialogC0311m;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogC0311m {
    public final AlertController a;

    public static class aIz {
        public final AlertController.OooO0O0 a;
        public final int b;

        public aIz(Context context) {
            int iC = b.c(context, 0);
            this.a = new AlertController.OooO0O0(new ContextThemeWrapper(context, b.c(context, iC)));
            this.b = iC;
        }

        public b b() {
            b bVar = new b(this.a.b, this.b);
            AlertController.OooO0O0 oooO0O0 = this.a;
            AlertController alertController = bVar.a;
            View view = oooO0O0.g;
            if (view != null) {
                alertController.I = view;
            } else {
                CharSequence charSequence = oooO0O0.e;
                if (charSequence != null) {
                    alertController.g = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = oooO0O0.d;
                if (drawable != null) {
                    alertController.B = drawable;
                    alertController.C = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = oooO0O0.f;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.H;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = oooO0O0.h;
            if (charSequence3 != null) {
                alertController.f(-1, charSequence3, oooO0O0.i, null, null);
            }
            CharSequence charSequence4 = oooO0O0.a;
            if (charSequence4 != null) {
                alertController.f(-2, charSequence4, oooO0O0.j, null, null);
            }
            if (oooO0O0.n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) oooO0O0.c.inflate(alertController.N, (ViewGroup) null);
                int i = oooO0O0.p ? alertController.O : alertController.P;
                ListAdapter oooO0o = oooO0O0.n;
                if (oooO0o == null) {
                    oooO0o = new AlertController.OooO0o(oooO0O0.b, i, R.id.text1, null);
                }
                alertController.J = oooO0o;
                alertController.G = oooO0O0.q;
                if (oooO0O0.m != null) {
                    recycleListView.setOnItemClickListener(new a(oooO0O0, alertController));
                }
                if (oooO0O0.p) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.h = recycleListView;
            }
            View view2 = oooO0O0.f1o;
            if (view2 != null) {
                alertController.i = view2;
                alertController.a = 0;
                alertController.m = false;
            }
            bVar.setCancelable(this.a.k);
            if (this.a.k) {
                bVar.setCanceledOnTouchOutside(true);
            }
            Objects.requireNonNull(this.a);
            bVar.setOnCancelListener(null);
            Objects.requireNonNull(this.a);
            bVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.l;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public aIz c(View view) {
            this.a.f1o = view;
            return this;
        }

        public b d() {
            b bVarB = b();
            bVarB.show();
            return bVarB;
        }
    }

    public b(Context context, int i) {
        super(context, c(context, i));
        this.a = new AlertController(getContext(), this, getWindow());
    }

    public static int c(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button h(int i) {
        AlertController alertController = this.a;
        Objects.requireNonNull(alertController);
        if (i == -3) {
            return alertController.x;
        }
        if (i == -2) {
            return alertController.s;
        }
        if (i != -1) {
            return null;
        }
        return alertController.f0o;
    }

    public void i(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.a.f(i, charSequence, onClickListener, null, null);
    }

    @Override // ivas.gov.bisp.enumeration.p087j.DialogC0311m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.a;
        int i2 = alertController.L;
        alertController.c.setContentView(alertController.K);
        View viewFindViewById2 = alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(ivas.gov.bisp.enumeration.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(ivas.gov.bisp.enumeration.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(ivas.gov.bisp.enumeration.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(ivas.gov.bisp.enumeration.R.id.customPanel);
        View viewInflate = alertController.i;
        if (viewInflate == null) {
            viewInflate = alertController.a != 0 ? LayoutInflater.from(alertController.b).inflate(alertController.a, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.b(viewInflate)) {
            alertController.d.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.m) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.n);
            }
            if (alertController.h != null) {
                ((LinearLayout.LayoutParams) ((OooO0O0.aJn) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(ivas.gov.bisp.enumeration.R.id.buttonPanel);
        ViewGroup viewGroupE = alertController.e(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupE2 = alertController.e(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupE3 = alertController.e(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupE2.findViewById(R.id.message);
        alertController.H = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.H);
                if (alertController.h != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.h, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupE2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupE3.findViewById(R.id.button1);
        alertController.f0o = button;
        button.setOnClickListener(alertController.Q);
        if (TextUtils.isEmpty(alertController.p) && alertController.q == null) {
            alertController.f0o.setVisibility(8);
            i = 0;
        } else {
            alertController.f0o.setText(alertController.p);
            Drawable drawable = alertController.q;
            if (drawable != null) {
                int i3 = alertController.e;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f0o.setCompoundDrawables(alertController.q, null, null, null);
            }
            alertController.f0o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupE3.findViewById(R.id.button2);
        alertController.s = button2;
        button2.setOnClickListener(alertController.Q);
        if (TextUtils.isEmpty(alertController.v) && alertController.w == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.v);
            Drawable drawable2 = alertController.w;
            if (drawable2 != null) {
                int i4 = alertController.e;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.s.setCompoundDrawables(alertController.w, null, null, null);
            }
            alertController.s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupE3.findViewById(R.id.button3);
        alertController.x = button3;
        button3.setOnClickListener(alertController.Q);
        if (TextUtils.isEmpty(alertController.t) && alertController.y == null) {
            alertController.x.setVisibility(8);
            view = null;
        } else {
            alertController.x.setText(alertController.t);
            Drawable drawable3 = alertController.y;
            if (drawable3 != null) {
                int i5 = alertController.e;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.x.setCompoundDrawables(alertController.y, null, null, null);
            } else {
                view = null;
            }
            alertController.x.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.b;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                alertController.d(alertController.f0o);
            } else if (i == 2) {
                alertController.d(alertController.s);
            } else if (i == 4) {
                alertController.d(alertController.x);
            }
        }
        if (i == 0) {
            viewGroupE3.setVisibility(8);
        }
        if (alertController.I != null) {
            viewGroupE.addView(alertController.I, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.d.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.g)) && alertController.F) {
                TextView textView2 = (TextView) alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.g);
                int i6 = alertController.C;
                if (i6 != 0) {
                    alertController.D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.B;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupE.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupE == null || viewGroupE.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupE3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupE2.findViewById(ivas.gov.bisp.enumeration.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f == null && alertController.h == null) ? view : viewGroupE.findViewById(ivas.gov.bisp.enumeration.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupE2.findViewById(ivas.gov.bisp.enumeration.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.h;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z2) {
            View view2 = alertController.h;
            if (view2 == null) {
                view2 = alertController.A;
            }
            if (view2 != null) {
                int i8 = z3 ? 2 : 0;
                View viewFindViewById11 = alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.scrollIndicatorUp);
                View viewFindViewById12 = alertController.d.findViewById(ivas.gov.bisp.enumeration.R.id.scrollIndicatorDown);
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXe.e(view2, i7 | i8, 3);
                if (viewFindViewById11 != null) {
                    viewGroupE2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupE2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = alertController.h;
        if (listView2 == null || (listAdapter = alertController.J) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i9 = alertController.G;
        if (i9 >= 0) {
            listView2.setItemChecked(i9, true);
            listView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.A;
        if (nestedScrollView == null || !nestedScrollView.p(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.A;
        if (nestedScrollView == null || !nestedScrollView.p(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.p087j.DialogC0311m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.a;
        alertController.g = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
