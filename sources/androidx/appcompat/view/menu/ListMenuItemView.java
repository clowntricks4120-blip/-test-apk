package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements m.aIE, AbsListView.SelectionBoundsAdjuster {
    public ImageView a;
    public u b;
    public ImageView c;
    public RadioButton d;
    public CheckBox e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public LinearLayout i;
    public Drawable j;
    public int k;
    public boolean l;
    public Context m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4o;
    public boolean p;
    public LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        B bC = B.c(getContext(), attributeSet, h.s, R.attr.listMenuViewStyle, 0);
        this.j = bC.l(5);
        this.k = bC.r(1, -1);
        this.l = bC.f(7, false);
        this.m = context;
        this.n = bC.l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4o = typedArrayObtainStyledAttributes.hasValue(0);
        bC.d.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.a;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        rect.top = this.a.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public void d(u uVar, int i) {
        String string;
        this.b = uVar;
        setVisibility(uVar.isVisible() ? 0 : 8);
        setTitle(uVar.g);
        setCheckable(uVar.isCheckable());
        boolean zO = uVar.o();
        uVar.i();
        int i2 = (zO && this.b.o()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.g;
            u uVar2 = this.b;
            char cI = uVar2.i();
            if (cI == 0) {
                string = BuildConfig.FLAVOR;
            } else {
                Resources resources = uVar2.m.c.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(uVar2.m.c).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = uVar2.m.o() ? uVar2.k : uVar2.a;
                u.c(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                u.c(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                u.c(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                u.c(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                u.c(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                u.c(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (cI == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (cI == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (cI != ' ') {
                    sb.append(cI);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.g.getVisibility() != i2) {
            this.g.setVisibility(i2);
        }
        setIcon(uVar.getIcon());
        setEnabled(uVar.isEnabled());
        setSubMenuArrowVisible(uVar.hasSubMenu());
        setContentDescription(uVar.r);
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.e = checkBox;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void f() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.d = radioButton;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // androidx.appcompat.view.menu.m.aIE
    public u getItemData() {
        return this.b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.j;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.s(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.a = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.c != null && this.l) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.d == null && this.e == null) {
            return;
        }
        if (this.b.k()) {
            if (this.d == null) {
                f();
            }
            compoundButton = this.d;
            view = this.e;
        } else {
            if (this.e == null) {
                e();
            }
            compoundButton = this.e;
            view = this.d;
        }
        if (z) {
            compoundButton.setChecked(this.b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.b.k()) {
            if (this.d == null) {
                f();
            }
            compoundButton = this.d;
        } else {
            if (this.e == null) {
                e();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.p = z;
        this.l = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setVisibility((this.f4o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.b.m);
        boolean z = this.p;
        if (z || this.l) {
            ImageView imageView = this.c;
            if (imageView == null && drawable == null && !this.l) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.c = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.l) {
                this.c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f.getVisibility() != 8) {
                this.f.setVisibility(8);
            }
        } else {
            this.f.setText(charSequence);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        }
    }
}
