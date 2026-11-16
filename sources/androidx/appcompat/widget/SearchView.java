package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.Z.j;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.B;
import ivas.gov.bisp.enumeration.p088k.C0315d;
import ivas.gov.bisp.enumeration.p088k.U;
import ivas.gov.bisp.enumeration.p088k.aj;
import ivas.gov.bisp.enumeration.p103z.l;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.OooO0O0 implements ivas.gov.bisp.enumeration.p099u.c {
    public static final Oooo0 p;
    public Rect A;
    public int[] B;
    public Rect C;
    public int[] D;
    public final ImageView E;
    public View.OnClickListener F;
    public final Intent G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final Intent K;
    public final CharSequence L;
    public OooOo00 M;
    public OooOo N;
    public View.OnFocusChangeListener O;
    public Oooo000 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public j T;
    public CharSequence U;
    public boolean V;
    public int W;
    public boolean aa;
    public CharSequence ab;
    public CharSequence ac;
    public boolean ad;
    public int ae;
    public SearchableInfo af;
    public Bundle ag;
    public final Runnable ah;
    public final WeakHashMap<String, Drawable.ConstantState> ai;
    public Runnable aj;
    public View.OnKeyListener ak;
    public TextWatcher al;
    public boolean am;
    public final View q;
    public final SearchAutoComplete r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final View v;
    public final ImageView w;
    public final ImageView x;
    public o0OoOo0 y;
    public final View z;

    public class OooO implements View.OnLayoutChangeListener {
        public OooO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            if (searchView.z.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.s.getPaddingLeft();
                Rect rect = new Rect();
                boolean zB = aj.b(searchView);
                if (searchView.S) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                searchView.r.getDropDownBackground().getPadding(rect);
                searchView.r.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.r.setDropDownWidth((((searchView.z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.r.getText();
            searchView.ac = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.w(!zIsEmpty);
            searchView.z(zIsEmpty);
            searchView.u();
            searchView.x();
            if (searchView.N != null && !TextUtils.equals(charSequence, searchView.ab)) {
                searchView.N.b(charSequence.toString());
            }
            searchView.ab = charSequence.toString();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.v();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = SearchView.this.T;
            if (jVar instanceof U) {
                jVar.d(null);
            }
        }
    }

    public class OooO0o implements View.OnFocusChangeListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class OooOO0 implements View.OnClickListener {
        public OooOO0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.t();
                return;
            }
            if (view == searchView.x) {
                searchView.n();
                return;
            }
            if (view == searchView.w) {
                searchView.s();
                return;
            }
            if (view != searchView.t) {
                if (view == searchView.r) {
                    searchView.k();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.af;
            if (searchableInfo != null) {
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.l(searchView.K, searchableInfo));
                        }
                    } else {
                        Intent intent = new Intent(searchView.G);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    }

    public class OooOO0O implements View.OnKeyListener {
        public OooOO0O() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.af == null) {
                return false;
            }
            if (!searchView.r.isPopupShowing() || SearchView.this.r.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(SearchView.this.r.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.m(0, null, searchView2.r.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.af == null || searchView3.T == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.p(searchView3.r.getListSelection());
            }
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchView3.r.getListSelection();
                return false;
            }
            searchView3.r.setSelection(i == 21 ? 0 : searchView3.r.length());
            searchView3.r.setListSelection(0);
            searchView3.r.clearListSelection();
            searchView3.r.c();
            return true;
        }
    }

    public class OooOOO implements AdapterView.OnItemClickListener {
        public OooOOO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.p(i);
        }
    }

    public class OooOOO0 implements TextView.OnEditorActionListener {
        public OooOOO0() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.s();
            return true;
        }
    }

    public class OooOOOO implements AdapterView.OnItemSelectedListener {
        public OooOOOO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.o(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface OooOo {
        boolean b(String str);

        boolean e(String str);
    }

    public interface OooOo00 {
        boolean b();
    }

    public static class Oooo0 {
        public Method a;
        public Method b;
        public Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public Oooo0() {
            this.a = null;
            this.b = null;
            this.c = null;
            b();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public interface Oooo000 {
        boolean b(int i);

        boolean e(int i);
    }

    public static class SearchAutoComplete extends ivas.gov.bisp.enumeration.OooOOO0.OooO0OO {
        public final Runnable a;
        public int b;
        public SearchView g;
        public boolean h;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.a = new OooO00o();
            this.b = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void c() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            Oooo0 oooo0 = SearchView.p;
            Objects.requireNonNull(oooo0);
            Oooo0.b();
            Method method = oooo0.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.b <= 0 || super.enoughToFilter();
        }

        @Override // ivas.gov.bisp.enumeration.OooOOO0.OooO0OO, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.h) {
                removeCallbacks(this.a);
                post(this.a);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.g;
            searchView.y(searchView.R);
            searchView.post(searchView.ah);
            if (searchView.r.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.g.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                Oooo0 oooo0 = SearchView.p;
                if (context.getResources().getConfiguration().orientation != 2) {
                    return;
                }
                c();
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.h = false;
                removeCallbacks(this.a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.h = true;
                    return;
                }
                this.h = false;
                removeCallbacks(this.a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.b = i;
        }
    }

    public static class o000oOoO extends l {
        public static final Parcelable.Creator<o000oOoO> CREATOR = new OooO00o();
        public boolean b;

        public class OooO00o implements Parcelable.ClassLoaderCreator<o000oOoO> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public o000oOoO createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o000oOoO(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new o000oOoO[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o000oOoO(parcel, null);
            }
        }

        public o000oOoO(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("SearchView.SavedState{");
            sbW.append(Integer.toHexString(System.identityHashCode(this)));
            sbW.append(" isIconified=");
            sbW.append(this.b);
            sbW.append("}");
            return sbW.toString();
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeValue(Boolean.valueOf(this.b));
        }

        public o000oOoO(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class o0OoOo0 extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public boolean e;
        public final int f;

        public o0OoOo0(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            b(rect, rect2);
            this.a = view;
        }

        public void b(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = -this.f;
            rect3.inset(i, i);
            this.c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z = this.e;
                    if (z && !this.d.contains(x, y)) {
                        z2 = z;
                        action = 0;
                    }
                } else if (action == 3) {
                    z = this.e;
                    this.e = false;
                } else {
                    z2 = false;
                }
                z2 = z;
                action = 1;
            } else if (this.b.contains(x, y)) {
                this.e = true;
                action = 1;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            if (action == 0 || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        p = Build.VERSION.SDK_INT < 29 ? new Oooo0() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.r.setText(charSequence);
        this.r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // ivas.gov.bisp.enumeration.p099u.c
    public void a() {
        this.r.setText(BuildConfig.FLAVOR);
        SearchAutoComplete searchAutoComplete = this.r;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.ac = BuildConfig.FLAVOR;
        clearFocus();
        y(true);
        this.r.setImeOptions(this.ae);
        this.ad = false;
    }

    @Override // ivas.gov.bisp.enumeration.p099u.c
    public void c() {
        if (this.ad) {
            return;
        }
        this.ad = true;
        int imeOptions = this.r.getImeOptions();
        this.ae = imeOptions;
        this.r.setImeOptions(imeOptions | 33554432);
        this.r.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.V = true;
        super.clearFocus();
        this.r.clearFocus();
        this.r.setImeVisibility(false);
        this.V = false;
    }

    public int getImeOptions() {
        return this.r.getImeOptions();
    }

    public int getInputType() {
        return this.r.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.af;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.L : getContext().getText(this.af.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J;
    }

    public int getSuggestionRowLayout() {
        return this.I;
    }

    public j getSuggestionsAdapter() {
        return this.T;
    }

    public final Intent j(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.ac);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.ag;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.af.getSearchActivity());
        return intent;
    }

    public void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.r.refreshAutoCompleteResults();
            return;
        }
        Oooo0 oooo0 = p;
        SearchAutoComplete searchAutoComplete = this.r;
        Objects.requireNonNull(oooo0);
        Oooo0.b();
        Method method = oooo0.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        Oooo0 oooo1 = p;
        SearchAutoComplete searchAutoComplete2 = this.r;
        Objects.requireNonNull(oooo1);
        Oooo0.b();
        Method method2 = oooo1.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final Intent l(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.ag;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void m(int i, String str, String str2) {
        getContext().startActivity(j("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    public void n() {
        if (!TextUtils.isEmpty(this.r.getText())) {
            this.r.setText(BuildConfig.FLAVOR);
            this.r.requestFocus();
            this.r.setImeVisibility(true);
        } else if (this.S) {
            OooOo00 oooOo00 = this.M;
            if (oooOo00 == null || !oooOo00.b()) {
                clearFocus();
                y(true);
            }
        }
    }

    public boolean o(int i) {
        Oooo000 oooo000 = this.P;
        if (oooo000 != null && oooo000.b(i)) {
            return false;
        }
        Editable text = this.r.getText();
        Cursor cursor = this.T.f;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        CharSequence charSequenceE = this.T.e(cursor);
        if (charSequenceE != null) {
            setQuery(charSequenceE);
            return true;
        }
        setQuery(text);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.ah);
        post(this.aj);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.r;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.B);
            getLocationInWindow(this.D);
            int[] iArr = this.B;
            int i5 = iArr[1];
            int[] iArr2 = this.D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.C;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            o0OoOo0 o0oooo0 = this.y;
            if (o0oooo0 != null) {
                o0oooo0.b(this.C, this.A);
                return;
            }
            o0OoOo0 o0oooo1 = new o0OoOo0(this.C, this.A, this.r);
            this.y = o0oooo1;
            setTouchDelegate(o0oooo1);
        }
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.R) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.W;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.W) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o000oOoO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o000oOoO o000oooo = (o000oOoO) parcelable;
        super.onRestoreInstanceState(o000oooo.e);
        y(o000oooo.b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o000oOoO o000oooo = new o000oOoO(super.onSaveInstanceState());
        o000oooo.b = this.R;
        return o000oooo;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.ah);
    }

    public boolean p(int i) {
        String strG;
        Oooo000 oooo000 = this.P;
        if (oooo000 != null && oooo000.e(i)) {
            return false;
        }
        Cursor cursor = this.T.f;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                try {
                    int i2 = U.n;
                    String strG2 = U.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strG2 == null) {
                        strG2 = this.af.getSuggestIntentAction();
                    }
                    if (strG2 == null) {
                        strG2 = "android.intent.action.SEARCH";
                    }
                    String str = strG2;
                    String strG3 = U.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strG3 == null) {
                        strG3 = this.af.getSuggestIntentData();
                    }
                    if (strG3 != null && (strG = U.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strG3);
                        sb.append("/");
                        sb.append(Uri.encode(strG));
                        strG3 = sb.toString();
                    }
                    intentJ = j(str, strG3 == null ? null : Uri.parse(strG3), U.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), U.g(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed launch activity: ");
                    sb2.append(intentJ);
                    Log.e("SearchView", sb2.toString(), e);
                }
            }
        }
        this.r.setImeVisibility(false);
        this.r.dismissDropDown();
        return true;
    }

    public void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.r;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        CharSequence charSequence2 = charSequence;
        if (this.S && this.H != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.H.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.H), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.V || !isFocusable()) {
            return false;
        }
        if (this.R) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.r.requestFocus(i, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public void s() {
        Editable text = this.r.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OooOo oooOo = this.N;
        if (oooOo == null || !oooOo.e(text.toString())) {
            if (this.af != null) {
                m(0, null, text.toString());
            }
            this.r.setImeVisibility(false);
            this.r.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.ag = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            n();
        } else {
            t();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.S == z) {
            return;
        }
        this.S = z;
        y(z);
        r();
    }

    public void setImeOptions(int i) {
        this.r.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.r.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.W = i;
        requestLayout();
    }

    public void setOnCloseListener(OooOo00 oooOo00) {
        this.M = oooOo00;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OooOo oooOo) {
        this.N = oooOo;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
    }

    public void setOnSuggestionListener(Oooo000 oooo000) {
        this.P = oooo000;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.am = z;
        j jVar = this.T;
        if (jVar instanceof U) {
            ((U) jVar).s = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.af = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.r.setThreshold(searchableInfo.getSuggestThreshold());
            this.r.setImeOptions(this.af.getImeOptions());
            int inputType = this.af.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.af.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.r.setInputType(inputType);
            j jVar = this.T;
            if (jVar != null) {
                jVar.d(null);
            }
            if (this.af.getSuggestAuthority() != null) {
                U u = new U(getContext(), this, this.af, this.ai);
                this.T = u;
                this.r.setAdapter(u);
                ((U) this.T).s = this.am ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.af;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.af.getVoiceSearchLaunchWebSearch()) {
                intent = this.G;
            } else if (this.af.getVoiceSearchLaunchRecognizer()) {
                intent = this.K;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.aa = z;
        if (z) {
            this.r.setPrivateImeOptions("nm");
        }
        y(this.R);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.Q = z;
        y(this.R);
    }

    public void setSuggestionsAdapter(j jVar) {
        this.T = jVar;
        this.r.setAdapter(jVar);
    }

    public void t() {
        y(false);
        this.r.requestFocus();
        this.r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.F;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void u() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.r.getText());
        if (!z2 && (!this.S || this.ad)) {
            z = false;
        }
        this.x.setVisibility(z ? 0 : 8);
        Drawable drawable = this.x.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void v() {
        int[] iArr = this.r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void w(boolean z) {
        int i;
        boolean z2 = this.Q;
        if (z2 && ((z2 || this.aa) && !this.R && hasFocus())) {
            i = 0;
            if (!z && this.aa) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.w.setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public final void x() {
        int i;
        if ((this.Q || this.aa) && !this.R) {
            i = 0;
            if (this.w.getVisibility() != 0 && this.t.getVisibility() != 0) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.v.setVisibility(i);
    }

    public final void y(boolean z) {
        this.R = z;
        int i = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.r.getText());
        this.u.setVisibility(i);
        w(!zIsEmpty);
        this.q.setVisibility(z ? 8 : 0);
        this.E.setVisibility((this.E.getDrawable() == null || this.S) ? 8 : 0);
        u();
        z(zIsEmpty);
        x();
    }

    public final void z(boolean z) {
        int i = 8;
        if (this.aa && !this.R && z) {
            this.w.setVisibility(8);
            i = 0;
        }
        this.t.setVisibility(i);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new Rect();
        this.C = new Rect();
        this.B = new int[2];
        this.D = new int[2];
        this.ah = new OooO0O0();
        this.aj = new OooO0OO();
        this.ai = new WeakHashMap<>();
        OooOO0 oooOO0 = new OooOO0();
        this.ak = new OooOO0O();
        OooOOO0 oooOOO0 = new OooOOO0();
        OooOOO oooOOO = new OooOOO();
        OooOOOO oooOOOO = new OooOOOO();
        this.al = new OooO00o();
        int[] iArr = h.w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        B b = new B(context, typedArrayObtainStyledAttributes);
        T.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(b.r(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.v = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.t = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        T.aWX.s(viewFindViewById, b.l(10));
        T.aWX.s(viewFindViewById2, b.l(14));
        imageView.setImageDrawable(b.l(13));
        imageView2.setImageDrawable(b.l(7));
        imageView3.setImageDrawable(b.l(4));
        imageView4.setImageDrawable(b.l(16));
        imageView5.setImageDrawable(b.l(13));
        this.H = b.l(12);
        C0315d.b(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.I = b.r(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.J = b.r(5, 0);
        imageView.setOnClickListener(oooOO0);
        imageView3.setOnClickListener(oooOO0);
        imageView2.setOnClickListener(oooOO0);
        imageView4.setOnClickListener(oooOO0);
        searchAutoComplete.setOnClickListener(oooOO0);
        searchAutoComplete.addTextChangedListener(this.al);
        searchAutoComplete.setOnEditorActionListener(oooOOO0);
        searchAutoComplete.setOnItemClickListener(oooOOO);
        searchAutoComplete.setOnItemSelectedListener(oooOOOO);
        searchAutoComplete.setOnKeyListener(this.ak);
        searchAutoComplete.setOnFocusChangeListener(new OooO0o());
        setIconifiedByDefault(b.f(8, true));
        int iJ = b.j(1, -1);
        if (iJ != -1) {
            setMaxWidth(iJ);
        }
        this.L = b.s(6);
        this.U = b.s(11);
        int iN = b.n(3, -1);
        if (iN != -1) {
            setImeOptions(iN);
        }
        int iN2 = b.n(2, -1);
        if (iN2 != -1) {
            setInputType(iN2);
        }
        setFocusable(b.f(0, true));
        typedArrayObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.G = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.K = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.z = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new OooO());
        }
        y(this.S);
        r();
    }
}
