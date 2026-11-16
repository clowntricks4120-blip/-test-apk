package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p087j.DialogC0311m;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable B;
    public ImageView D;
    public TextView E;
    public boolean F;
    public TextView H;
    public View I;
    public ListAdapter J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Handler R;
    public int a;
    public final Context b;
    public final DialogC0311m c;
    public final Window d;
    public final int e;
    public CharSequence f;
    public CharSequence g;
    public ListView h;
    public View i;
    public int j;
    public int k;
    public int l;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f0o;
    public CharSequence p;
    public Drawable q;
    public Message r;
    public Button s;
    public CharSequence t;
    public Message u;
    public CharSequence v;
    public Drawable w;
    public Button x;
    public Drawable y;
    public Message z;
    public boolean m = false;
    public int C = 0;
    public int G = -1;
    public final View.OnClickListener Q = new OooO00o();

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f0o && (message3 = alertController.r) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.s || (message2 = alertController.u) == null) {
                messageObtain = (view != alertController.x || (message = alertController.z) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.c).sendToTarget();
        }
    }

    public static class OooO0O0 {
        public CharSequence a;
        public final Context b;
        public final LayoutInflater c;
        public Drawable d;
        public CharSequence e;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public DialogInterface.OnClickListener i;
        public DialogInterface.OnClickListener j;
        public DialogInterface.OnKeyListener l;
        public DialogInterface.OnClickListener m;
        public ListAdapter n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public View f1o;
        public boolean p;
        public int q = -1;
        public boolean k = true;

        public OooO0O0(Context context) {
            this.b = context;
            this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class OooO0OO extends Handler {
        public WeakReference<DialogInterface> a;

        public OooO0OO(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class OooO0o extends ArrayAdapter<CharSequence> {
        public OooO0o(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.x);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, DialogC0311m dialogC0311m, Window window) {
        this.b = context;
        this.c = dialogC0311m;
        this.d = window;
        this.R = new OooO0OO(dialogC0311m);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.i, R.attr.alertDialogStyle, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.P = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.F = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0311m.d().v(1);
    }

    public static boolean b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void d(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void f(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.R.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.t = charSequence;
            this.z = messageObtainMessage;
            this.y = null;
        } else if (i == -2) {
            this.v = charSequence;
            this.u = messageObtainMessage;
            this.w = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.p = charSequence;
            this.r = messageObtainMessage;
            this.q = null;
        }
    }
}
