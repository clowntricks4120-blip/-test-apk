package ivas.gov.bisp.enumeration.p088k;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import ivas.gov.bisp.enumeration.Z.h;
import ivas.gov.bisp.enumeration.p086i.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class U extends h implements View.OnClickListener {
    private static int l = 0;
    private static int m = 1;
    public static final /* synthetic */ int n = 0;
    public int A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchableInfo f100o;
    public final SearchView p;
    public final Context q;
    public final WeakHashMap<String, Drawable.ConstantState> r;
    public int s;
    public final int t;
    public ColorStateList u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static final class aRR {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public aRR(View view) {
            this.a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.e = (ImageView) view.findViewById(ivas.gov.bisp.enumeration.R.id.edit_query);
        }
    }

    public U(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.s = 1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.z = -1;
        this.v = -1;
        this.A = -1;
        this.p = searchView;
        this.f100o = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.q = context;
        this.r = weakHashMap;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 121;
        int i7 = (i2 | 121) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        m = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public Cursor n(SearchableInfo searchableInfo, String str, int i) {
        Cursor cursorQuery;
        int i2 = 2 % 2;
        int i3 = l;
        int i4 = i3 & 19;
        int i5 = ((((i3 ^ 19) | i4) << 1) - (~(-((~i4) & (i3 | 19))))) - 1;
        m = i5 % 128;
        int i6 = i5 % 2;
        String[] strArr = null;
        if (searchableInfo == null) {
            int i7 = (i3 & (-98)) | ((~i3) & 97);
            int i8 = (i3 & 97) << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = i9 % 128;
            m = i10;
            int i11 = i9 % 2;
            int i12 = (i10 ^ 33) + ((i10 & 33) << 1);
            l = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            int i13 = m;
            int i14 = ((i13 ^ 27) | (i13 & 27)) << 1;
            int i15 = -(((~i13) & 27) | (i13 & (-28)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = i16 % 128;
            l = i17;
            if (i16 % 2 != 0) {
                strArr.hashCode();
                throw null;
            }
            int i18 = i17 ^ 115;
            int i19 = (i17 & 115) << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            m = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme("content");
        int i22 = m;
        int i23 = ((i22 & 100) + (i22 | 100)) - 1;
        l = i23 % 128;
        int i24 = i23 % 2;
        Uri.Builder builderQuery = builderScheme.authority(suggestAuthority).query(BuildConfig.FLAVOR);
        int i25 = l;
        int i26 = (i25 ^ 95) + ((i25 & 95) << 1);
        m = i26 % 128;
        int i27 = i26 % 2;
        Uri.Builder builderFragment = builderQuery.fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            int i28 = l;
            int i29 = ((i28 ^ 54) + ((i28 & 54) << 1)) - 1;
            m = i29 % 128;
            int i30 = i29 % 2;
            builderFragment.appendEncodedPath(suggestPath);
            int i31 = l;
            int i32 = (((i31 | 29) << 1) - (~(-(i31 ^ 29)))) - 1;
            m = i32 % 128;
            int i33 = i32 % 2;
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            int i34 = l;
            int i35 = ((i34 | 109) << 1) - (i34 ^ 109);
            int i36 = i35 % 128;
            m = i36;
            int i37 = i35 % 2;
            strArr = new String[]{str};
            int i38 = i36 ^ 25;
            int i39 = ((i36 & 25) | i38) << 1;
            int i40 = -i38;
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            l = i41 % 128;
            if (i41 % 2 != 0) {
                int i42 = 4 / 3;
            }
        } else {
            builderFragment.appendPath(str);
            int i43 = m;
            int i44 = i43 ^ 97;
            int i45 = (i43 & 97) << 1;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            l = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 4 / 2;
            }
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            int i48 = l + 19;
            m = i48 % 128;
            int i49 = i48 % 2;
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
            int i50 = m;
            int i51 = ((i50 ^ 106) + ((i50 & 106) << 1)) - 1;
            l = i51 % 128;
            int i52 = i51 % 2;
        }
        Uri uriBuild = builderFragment.build();
        ContentResolver contentResolver = this.q.getContentResolver();
        int i53 = l;
        int i54 = i53 & 71;
        int i55 = -(-(i53 | 71));
        int i56 = (i54 & i55) + (i55 | i54);
        m = i56 % 128;
        if (i56 % 2 == 0) {
            cursorQuery = contentResolver.query(uriBuild, null, suggestSelection, strArr2, null);
            int i57 = 69 / 0;
        } else {
            cursorQuery = contentResolver.query(uriBuild, null, suggestSelection, strArr2, null);
        }
        int i58 = l;
        int i59 = (i58 | 23) << 1;
        int i60 = -(i58 ^ 23);
        int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
        m = i61 % 128;
        int i62 = i61 % 2;
        return cursorQuery;
    }

    public static String g(Cursor cursor, int i) {
        int i2 = 2 % 2;
        int i3 = m;
        int i4 = ((i3 ^ 59) - (~(-(-((i3 & 59) << 1))))) - 1;
        l = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i == -1) {
            int i5 = i3 & 37;
            int i6 = (i3 ^ 37) | i5;
            int i7 = (i5 & i6) + (i5 | i6);
            l = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            String string = cursor.getString(i);
            int i8 = l + 3;
            m = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 55 / 0;
            }
            return string;
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.Z.j
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        ImageView imageView;
        int i;
        int i2 = 2 % 2;
        View viewInflate = this.k.inflate(this.a, viewGroup, false);
        aRR arr = new aRR(viewInflate);
        int i3 = l;
        int i4 = (i3 & (-34)) | ((~i3) & 33);
        int i5 = (i3 & 33) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        m = i6 % 128;
        if (i6 % 2 == 0) {
            viewInflate.setTag(arr);
            imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.edit_query);
            i = this.t;
            int i7 = 48 / 0;
        } else {
            viewInflate.setTag(arr);
            imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.edit_query);
            i = this.t;
        }
        int i8 = m;
        int i9 = (i8 & (-48)) | ((~i8) & 47);
        int i10 = (i8 & 47) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        l = i11 % 128;
        if (i11 % 2 == 0) {
            imageView.setImageResource(i);
            return viewInflate;
        }
        imageView.setImageResource(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = m;
        int i3 = i2 | 47;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 47)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        l = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            boolean z = view.getTag() instanceof CharSequence;
            obj.hashCode();
            throw null;
        }
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            int i7 = m;
            int i8 = (i7 & (-120)) | ((~i7) & 119);
            int i9 = -(-((i7 & 119) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            l = i10 % 128;
            int i11 = i10 % 2;
            this.p.q((CharSequence) tag);
            int i12 = m + 107;
            l = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = l + 27;
        m = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        int i = 2 % 2;
        int i2 = m;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        l = i3 % 128;
        int i4 = i3 % 2;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f;
        Bundle extras = null;
        if (cursor != null) {
            int i5 = l + 121;
            m = i5 % 128;
            if (i5 % 2 == 0) {
                cursor.getExtras();
                throw null;
            }
            extras = cursor.getExtras();
        } else {
            int i6 = m;
            int i7 = ((i6 ^ 63) | (i6 & 63)) << 1;
            int i8 = -(((~i6) & 63) | (i6 & (-64)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            l = i9 % 128;
            int i10 = i9 % 2;
        }
        if (extras != null) {
            int i11 = m;
            int i12 = i11 & 119;
            int i13 = -(-(i11 | 119));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            l = i14 % 128;
            int i15 = i14 % 2;
            extras.getBoolean("in_progress");
            int i16 = m + 1;
            l = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = l;
        int i19 = (i18 & 42) + (i18 | 42);
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        m = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.Z.j
    public void d(Cursor cursor) {
        int i = 2 % 2;
        int i2 = m;
        int i3 = i2 & 111;
        int i4 = (i2 ^ 111) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        l = i5 % 128;
        int i6 = i5 % 2;
        try {
            super.d(cursor);
            if (cursor != null) {
                int i7 = l;
                int i8 = (i7 ^ 102) + ((i7 & 102) << 1);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                m = i9 % 128;
                Object obj = null;
                if (i9 % 2 == 0) {
                    this.x = cursor.getColumnIndex("suggest_text_1");
                    throw null;
                }
                this.x = cursor.getColumnIndex("suggest_text_1");
                int i10 = m;
                int i11 = i10 ^ 75;
                int i12 = -(-((i10 & 75) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                l = i13 % 128;
                if (i13 % 2 != 0) {
                    this.w = cursor.getColumnIndex("suggest_text_2");
                    obj.hashCode();
                    throw null;
                }
                this.w = cursor.getColumnIndex("suggest_text_2");
                this.y = cursor.getColumnIndex("suggest_text_2_url");
                int columnIndex = cursor.getColumnIndex("suggest_icon_1");
                int i14 = l + 37;
                m = i14 % 128;
                if (i14 % 2 == 0) {
                    this.z = columnIndex;
                    this.v = cursor.getColumnIndex("suggest_icon_2");
                    int i15 = 67 / 0;
                } else {
                    this.z = columnIndex;
                    this.v = cursor.getColumnIndex("suggest_icon_2");
                }
                this.A = cursor.getColumnIndex("suggest_flags");
                int i16 = l;
                int i17 = ((i16 & (-22)) | ((~i16) & 21)) + ((i16 & 21) << 1);
                m = i17 % 128;
                if (i17 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
        int i18 = l;
        int i19 = ((i18 & (-78)) | ((~i18) & 77)) + ((i18 & 77) << 1);
        m = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        Bundle extras;
        int i = 2 % 2;
        int i2 = m;
        int i3 = i2 & 13;
        int i4 = ((i2 ^ 13) | i3) << 1;
        int i5 = -((i2 | 13) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        l = i6 % 128;
        int i7 = i6 % 2;
        super.notifyDataSetChanged();
        Cursor cursor = this.f;
        Object obj = null;
        if (cursor != null) {
            int i8 = l + 55;
            m = i8 % 128;
            int i9 = i8 % 2;
            extras = cursor.getExtras();
            int i10 = m;
            int i11 = i10 & 57;
            int i12 = i11 + ((i10 ^ 57) | i11);
            l = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = l;
            int i15 = ((((i14 ^ 9) | (i14 & 9)) << 1) - (~(-(((~i14) & 9) | (i14 & (-10)))))) - 1;
            m = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 / 3;
            }
            extras = null;
        }
        if (extras != null) {
            int i17 = l;
            int i18 = (i17 ^ 103) + ((i17 & 103) << 1);
            m = i18 % 128;
            if (i18 % 2 == 0) {
                extras.getBoolean("in_progress");
                throw null;
            }
            extras.getBoolean("in_progress");
            int i19 = l;
            int i20 = ((i19 ^ 19) | (i19 & 19)) << 1;
            int i21 = -(((~i19) & 19) | (i19 & (-20)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            m = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = m;
        int i25 = (i24 | 3) << 1;
        int i26 = -(((~i24) & 3) | (i24 & (-4)));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        l = i27 % 128;
        if (i27 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.Z.j, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = m;
        int i4 = i3 & 125;
        int i5 = (i3 ^ 125) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        l = i6 % 128;
        int i7 = i6 % 2;
        try {
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            int i8 = m;
            int i9 = i8 & 59;
            int i10 = ((((i8 ^ 59) | i9) << 1) - (~(-((i8 | 59) & (~i9))))) - 1;
            l = i10 % 128;
            int i11 = i10 % 2;
            return dropDownView;
        } catch (RuntimeException e) {
            View viewInflate = this.k.inflate(this.b, viewGroup, false);
            if (viewInflate != null) {
                TextView textView = ((aRR) viewInflate.getTag()).a;
                int i12 = l;
                int i13 = (i12 ^ 51) + ((i12 & 51) << 1);
                m = i13 % 128;
                if (i13 % 2 == 0) {
                    textView.setText(e.toString());
                    int i14 = 53 / 0;
                } else {
                    textView.setText(e.toString());
                }
                int i15 = m;
                int i16 = ((i15 & (-8)) | ((~i15) & 7)) + ((i15 & 7) << 1);
                l = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 5 % 4;
                }
            }
            int i18 = l;
            int i19 = i18 ^ 81;
            int i20 = (i18 & 81) << 1;
            int i21 = (i19 & i20) + (i20 | i19);
            m = i21 % 128;
            if (i21 % 2 != 0) {
                return viewInflate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.Z.j, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = l;
        int i4 = i3 & 93;
        int i5 = -(-((i3 ^ 93) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        m = i6 % 128;
        int i7 = i6 % 2;
        try {
            View view2 = super.getView(i, view, viewGroup);
            int i8 = (-2) - ((m + 44) ^ (-1));
            l = i8 % 128;
            int i9 = i8 % 2;
            return view2;
        } catch (RuntimeException e) {
            View viewF = f(this.q, this.f, viewGroup);
            ((aRR) viewF.getTag()).a.setText(e.toString());
            return viewF;
        }
    }

    @Override // ivas.gov.bisp.enumeration.Z.j
    public CharSequence e(Cursor cursor) {
        int i = 2 % 2;
        int i2 = l;
        int i3 = ((i2 ^ 29) | (i2 & 29)) << 1;
        int i4 = -((i2 & (-30)) | ((~i2) & 29));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        m = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (cursor == null) {
            int i6 = (i2 | 117) << 1;
            int i7 = -(i2 ^ 117);
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            m = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strG = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
        int i9 = m;
        int i10 = i9 ^ 31;
        int i11 = -(-((i9 & 31) << 1));
        int i12 = (i10 & i11) + (i10 | i11);
        l = i12 % 128;
        int i13 = i12 % 2;
        if (strG != null) {
            int i14 = (i9 | 67) << 1;
            int i15 = -((i9 & (-68)) | ((~i9) & 67));
            int i16 = (i14 & i15) + (i14 | i15);
            l = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i9 & 75;
            int i19 = (i9 | 75) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            l = i21 % 128;
            if (i21 % 2 == 0) {
                return strG;
            }
            throw null;
        }
        if (this.f100o.shouldRewriteQueryFromData()) {
            int i22 = l;
            int i23 = ((i22 | 17) << 1) - (i22 ^ 17);
            m = i23 % 128;
            int i24 = i23 % 2;
            int columnIndex = cursor.getColumnIndex("suggest_intent_data");
            int i25 = l;
            int i26 = i25 & 99;
            int i27 = -(-((i25 ^ 99) | i26));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            m = i28 % 128;
            if (i28 % 2 == 0) {
                g(cursor, columnIndex);
                throw null;
            }
            String strG2 = g(cursor, columnIndex);
            if (strG2 != null) {
                int i29 = m;
                int i30 = (i29 & 35) + (i29 | 35);
                l = i30 % 128;
                if (i30 % 2 == 0) {
                    return strG2;
                }
                throw null;
            }
        }
        if (this.f100o.shouldRewriteQueryFromText()) {
            int i31 = m;
            int i32 = i31 & 93;
            int i33 = (i32 - (~((i31 ^ 93) | i32))) - 1;
            l = i33 % 128;
            int i34 = i33 % 2;
            String strG3 = g(cursor, cursor.getColumnIndex("suggest_text_1"));
            int i35 = m;
            int i36 = i35 + 85;
            l = i36 % 128;
            int i37 = i36 % 2;
            if (strG3 != null) {
                int i38 = i35 + 27;
                l = i38 % 128;
                if (i38 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i39 = (i35 & (-60)) | ((~i35) & 59);
                int i40 = (i35 & 59) << 1;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                l = i41 % 128;
                int i42 = i41 % 2;
                return strG3;
            }
        }
        int i43 = m;
        int i44 = ((i43 ^ 91) | (i43 & 91)) << 1;
        int i45 = -(((~i43) & 91) | (i43 & (-92)));
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        l = i46 % 128;
        int i47 = i46 % 2;
        return null;
    }

    public Drawable m(Uri uri) throws FileNotFoundException {
        int identifier;
        int i = 2 % 2;
        int i2 = l;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = -(-((i2 & 105) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        m = i5 % 128;
        int i6 = i5 % 2;
        String authority = uri.getAuthority();
        if (!(!TextUtils.isEmpty(authority))) {
            StringBuilder sb = new StringBuilder();
            sb.append("No authority: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        int i7 = m + 49;
        l = i7 % 128;
        int i8 = i7 % 2;
        try {
            Resources resourcesForApplication = this.q.getPackageManager().getResourcesForApplication(authority);
            int i9 = l;
            int i10 = ((i9 | 64) << 1) - (i9 ^ 64);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            m = i11 % 128;
            int i12 = i11 % 2;
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No path: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            int i13 = l + 75;
            m = i13 % 128;
            int i14 = i13 % 2;
            int size = pathSegments.size();
            if (size == 1) {
                int i15 = m;
                int i16 = (i15 ^ 117) + ((i15 & 117) << 1);
                l = i16 % 128;
                int i17 = i16 % 2;
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                    int i18 = l;
                    int i19 = ((i18 | 19) << 1) - (i18 ^ 19);
                    m = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = i18 | 33;
                    int i22 = (i21 << 1) - ((~(i18 & 33)) & i21);
                    m = i22 % 128;
                    int i23 = i22 % 2;
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Single path segment is not a resource ID: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
            } else {
                if (size != 2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("More than two path segments: ");
                    sb4.append(uri);
                    throw new FileNotFoundException(sb4.toString());
                }
                int i24 = l;
                int i25 = i24 & 11;
                int i26 = ((i24 ^ 11) | i25) << 1;
                int i27 = -((i24 | 11) & (~i25));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                m = i28 % 128;
                identifier = resourcesForApplication.getIdentifier(i28 % 2 == 0 ? pathSegments.get(0) : pathSegments.get(1), pathSegments.get(0), authority);
                int i29 = l;
                int i30 = i29 & 107;
                int i31 = (i29 | 107) & (~i30);
                int i32 = i30 << 1;
                int i33 = (i31 & i32) + (i31 | i32);
                m = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = 2 / 3;
                }
            }
            if (identifier == 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No resource found for: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
            int i35 = m;
            int i36 = ((i35 | 123) << 1) - (i35 ^ 123);
            l = i36 % 128;
            int i37 = i36 % 2;
            Drawable drawable = resourcesForApplication.getDrawable(identifier);
            int i38 = l + 1;
            m = i38 % 128;
            int i39 = i38 % 2;
            return drawable;
        } catch (PackageManager.NameNotFoundException unused2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No package found for authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0307  */
    /* JADX WARN: Code duplicated, block: B:144:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4 A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170 A[Catch: NotFoundException -> 0x017c, NumberFormatException -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {NotFoundException -> 0x017c, NumberFormatException -> 0x017d, blocks: (B:17:0x0063, B:20:0x0081, B:22:0x008c, B:27:0x009a, B:30:0x00b4, B:40:0x010a, B:44:0x012b, B:48:0x014d, B:33:0x00da, B:57:0x0170, B:58:0x0179, B:26:0x0091), top: B:144:0x0063 }] */
    public final Drawable l(String str) {
        int i;
        Drawable drawableNewDrawable;
        Drawable drawableM;
        int i2;
        StringBuilder sb;
        int i3;
        String packageName;
        int i4;
        String string;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable2;
        Drawable drawableC;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = l;
        int i11 = i10 & 111;
        int i12 = -(-((i10 ^ 111) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        m = i14;
        Drawable drawable = null;
        if (i13 % 2 == 0) {
            drawable.hashCode();
            throw null;
        }
        if (str != null) {
            int i15 = i14 + 83;
            l = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 20 / 0;
                if (!str.isEmpty()) {
                    if (!"0".equals(str)) {
                        int i17 = m;
                        int i18 = i17 & 113;
                        int i19 = -(-((i17 ^ 113) | i18));
                        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                        l = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = i17 + 87;
                        l = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        try {
                            i2 = Integer.parseInt(str);
                            sb = new StringBuilder();
                            int i24 = m;
                            int i25 = i24 & 23;
                            int i26 = (i24 ^ 23) | i25;
                            i3 = (i25 ^ i26) + ((i26 & i25) << 1);
                            l = i3 % 128;
                            if (i3 % 2 != 0) {
                                sb.append("android.resource://");
                                packageName = this.q.getPackageName();
                                int i27 = 80 / 0;
                            } else {
                                sb.append("android.resource://");
                                packageName = this.q.getPackageName();
                            }
                            sb.append(packageName);
                            sb.append("/");
                            sb.append(i2);
                            int i28 = l;
                            i4 = ((i28 | 119) << 1) - (i28 ^ 119);
                            m = i4 % 128;
                            if (i4 % 2 != 0) {
                                this.r.get(sb.toString());
                                throw null;
                            }
                            string = sb.toString();
                            constantState = this.r.get(string);
                            if (constantState == null) {
                                int i29 = l;
                                int i30 = i29 & 53;
                                int i31 = ((~i30) & (i29 | 53)) + (i30 << 1);
                                m = i31 % 128;
                                int i32 = i31 % 2;
                                int i33 = i29 + 105;
                                m = i33 % 128;
                                int i34 = i33 % 2;
                                drawableNewDrawable2 = null;
                            } else {
                                drawableNewDrawable2 = constantState.newDrawable();
                                int i35 = m;
                                int i36 = (-2) - ((((i35 | 88) << 1) - (i35 ^ 88)) ^ (-1));
                                l = i36 % 128;
                                int i37 = i36 % 2;
                            }
                            if (drawableNewDrawable2 != null) {
                                int i38 = m;
                                int i39 = i38 & 101;
                                int i40 = (i38 | 101) & (~i39);
                                int i41 = -(-(i39 << 1));
                                i8 = ((i40 | i41) << 1) - (i40 ^ i41);
                                l = i8 % 128;
                                if (i8 % 2 == 0) {
                                    return drawableNewDrawable2;
                                }
                                throw null;
                            }
                            Context context = this.q;
                            Object obj = l.c;
                            drawableC = l.aUH.c(context, i2);
                            int i42 = l + 113;
                            i5 = i42 % 128;
                            m = i5;
                            int i43 = i42 % 2;
                            if (drawableC != null) {
                                int i44 = i5 & 113;
                                int i45 = (i5 ^ 113) | i44;
                                int i46 = (i44 & i45) + (i44 | i45);
                                l = i46 % 128;
                                int i47 = i46 % 2;
                                this.r.put(string, drawableC.getConstantState());
                                int i48 = l;
                                i7 = (((i48 & (-126)) | ((~i48) & 125)) - (~(-(-((i48 & 125) << 1))))) - 1;
                                int i49 = i7 % 128;
                                m = i49;
                                if (i7 % 2 == 0) {
                                    int i50 = 20 / 0;
                                }
                                int i51 = ((i49 & 62) + (i49 | 62)) - 1;
                                l = i51 % 128;
                                int i52 = i51 % 2;
                            }
                            int i53 = l;
                            i6 = (((i53 | 60) << 1) - (i53 ^ 60)) - 1;
                            m = i6 % 128;
                            if (i6 % 2 != 0) {
                                return drawableC;
                            }
                            throw null;
                        } catch (Resources.NotFoundException unused) {
                            return null;
                        } catch (NumberFormatException unused2) {
                            Drawable.ConstantState constantState2 = this.r.get(str);
                            if (constantState2 == null) {
                                int i54 = m;
                                int i55 = ((i54 | 123) << 1) - (i54 ^ 123);
                                l = i55 % 128;
                                int i56 = i55 % 2;
                                drawableNewDrawable = null;
                            } else {
                                drawableNewDrawable = constantState2.newDrawable();
                                int i57 = m;
                                int i58 = i57 ^ 13;
                                int i59 = ((i57 & 13) | i58) << 1;
                                int i60 = -i58;
                                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                                l = i61 % 128;
                                int i62 = i61 % 2;
                            }
                            if (drawableNewDrawable != null) {
                                int i63 = m;
                                int i64 = i63 ^ 103;
                                int i65 = ((((i63 & 103) | i64) << 1) - (~(-i64))) - 1;
                                int i66 = i65 % 128;
                                l = i66;
                                if (i65 % 2 != 0) {
                                    throw null;
                                }
                                int i67 = i66 + 7;
                                m = i67 % 128;
                                if (i67 % 2 != 0) {
                                    return drawableNewDrawable;
                                }
                                throw null;
                            }
                            Uri uri = Uri.parse(str);
                            try {
                                String scheme = uri.getScheme();
                                int i68 = l;
                                int i69 = ((i68 ^ 116) + ((i68 & 116) << 1)) - 1;
                                m = i69 % 128;
                                int i70 = i69 % 2;
                                if ("android.resource".equals(scheme)) {
                                    int i71 = l;
                                    int i72 = i71 & 93;
                                    int i73 = (((i71 | 93) & (~i72)) - (~(-(-(i72 << 1))))) - 1;
                                    m = i73 % 128;
                                    try {
                                        if (i73 % 2 == 0) {
                                            drawableM = m(uri);
                                            int i74 = 96 / 0;
                                        } else {
                                            drawableM = m(uri);
                                        }
                                        drawable = drawableM;
                                    } catch (Resources.NotFoundException unused3) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Resource does not exist: ");
                                        sb2.append(uri);
                                        throw new FileNotFoundException(sb2.toString());
                                    }
                                } else {
                                    InputStream inputStreamOpenInputStream = this.q.getContentResolver().openInputStream(uri);
                                    if (inputStreamOpenInputStream == null) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Failed to open ");
                                        sb3.append(uri);
                                        FileNotFoundException fileNotFoundException = new FileNotFoundException(sb3.toString());
                                        int i75 = m;
                                        int i76 = ((i75 | 73) << 1) - (i75 ^ 73);
                                        l = i76 % 128;
                                        if (i76 % 2 == 0) {
                                            throw fileNotFoundException;
                                        }
                                        int i77 = 83 / 0;
                                        throw fileNotFoundException;
                                    }
                                    int i78 = m;
                                    int i79 = i78 & 55;
                                    int i80 = (i78 ^ 55) | i79;
                                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                                    l = i81 % 128;
                                    int i82 = i81 % 2;
                                    try {
                                        Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                                        try {
                                            inputStreamOpenInputStream.close();
                                            int i83 = m;
                                            int i84 = ((i83 ^ 49) | (i83 & 49)) << 1;
                                            int i85 = -(((~i83) & 49) | (i83 & (-50)));
                                            int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                                            l = i86 % 128;
                                            int i87 = i86 % 2;
                                        } catch (IOException e) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Error closing icon stream for ");
                                            sb4.append(uri);
                                            Log.e("SuggestionsAdapter", sb4.toString(), e);
                                        }
                                        drawable = drawableCreateFromStream;
                                    } catch (Throwable th) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                        } catch (IOException e2) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("Error closing icon stream for ");
                                            sb5.append(uri);
                                            Log.e("SuggestionsAdapter", sb5.toString(), e2);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (FileNotFoundException e3) {
                                Objects.toString(uri);
                                e3.getMessage();
                                if (drawable != null) {
                                    int i88 = l;
                                    int i89 = (i88 & 25) + (i88 | 25);
                                    m = i89 % 128;
                                    int i90 = i89 % 2;
                                    this.r.put(str, drawable.getConstantState());
                                    int i91 = m;
                                    int i92 = (i91 ^ 123) + ((i91 & 123) << 1);
                                    int i93 = i92 % 128;
                                    l = i93;
                                    int i94 = i92 % 2;
                                    int i95 = i93 + 111;
                                    m = i95 % 128;
                                    int i96 = i95 % 2;
                                }
                                int i97 = m;
                                int i98 = i97 & 61;
                                int i99 = i97 | 61;
                                i = (i98 ^ i99) + ((i99 & i98) << 1);
                                l = i % 128;
                                if (i % 2 != 0) {
                                    int i100 = 73 / 0;
                                }
                                return drawable;
                            }
                            if (drawable != null) {
                                int i810 = l;
                                int i811 = (i810 & 25) + (i810 | 25);
                                m = i811 % 128;
                                int i910 = i811 % 2;
                                this.r.put(str, drawable.getConstantState());
                                int i911 = m;
                                int i912 = (i911 ^ 123) + ((i911 & 123) << 1);
                                int i913 = i912 % 128;
                                l = i913;
                                int i914 = i912 % 2;
                                int i915 = i913 + 111;
                                m = i915 % 128;
                                int i916 = i915 % 2;
                            }
                        }
                    }
                }
            } else if (!str.isEmpty()) {
                if (!"0".equals(str)) {
                    i2 = Integer.parseInt(str);
                    sb = new StringBuilder();
                    int i210 = m;
                    int i211 = i210 & 23;
                    int i212 = (i210 ^ 23) | i211;
                    i3 = (i211 ^ i212) + ((i212 & i211) << 1);
                    l = i3 % 128;
                    if (i3 % 2 != 0) {
                        sb.append("android.resource://");
                        packageName = this.q.getPackageName();
                        int i213 = 80 / 0;
                    } else {
                        sb.append("android.resource://");
                        packageName = this.q.getPackageName();
                    }
                    sb.append(packageName);
                    sb.append("/");
                    sb.append(i2);
                    int i214 = l;
                    i4 = ((i214 | 119) << 1) - (i214 ^ 119);
                    m = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.r.get(sb.toString());
                        throw null;
                    }
                    string = sb.toString();
                    constantState = this.r.get(string);
                    if (constantState == null) {
                        int i215 = l;
                        int i310 = i215 & 53;
                        int i311 = ((~i310) & (i215 | 53)) + (i310 << 1);
                        m = i311 % 128;
                        int i312 = i311 % 2;
                        int i313 = i215 + 105;
                        m = i313 % 128;
                        int i314 = i313 % 2;
                        drawableNewDrawable2 = null;
                    } else {
                        drawableNewDrawable2 = constantState.newDrawable();
                        int i315 = m;
                        int i316 = (-2) - ((((i315 | 88) << 1) - (i315 ^ 88)) ^ (-1));
                        l = i316 % 128;
                        int i317 = i316 % 2;
                    }
                    if (drawableNewDrawable2 != null) {
                        int i318 = m;
                        int i319 = i318 & 101;
                        int i410 = (i318 | 101) & (~i319);
                        int i411 = -(-(i319 << 1));
                        i8 = ((i410 | i411) << 1) - (i410 ^ i411);
                        l = i8 % 128;
                        if (i8 % 2 == 0) {
                            return drawableNewDrawable2;
                        }
                        throw null;
                    }
                    Context context2 = this.q;
                    Object obj2 = l.c;
                    drawableC = l.aUH.c(context2, i2);
                    int i412 = l + 113;
                    i5 = i412 % 128;
                    m = i5;
                    int i413 = i412 % 2;
                    if (drawableC != null) {
                        int i414 = i5 & 113;
                        int i415 = (i5 ^ 113) | i414;
                        int i416 = (i414 & i415) + (i414 | i415);
                        l = i416 % 128;
                        int i417 = i416 % 2;
                        this.r.put(string, drawableC.getConstantState());
                        int i418 = l;
                        i7 = (((i418 & (-126)) | ((~i418) & 125)) - (~(-(-((i418 & 125) << 1))))) - 1;
                        int i419 = i7 % 128;
                        m = i419;
                        if (i7 % 2 == 0) {
                            int i510 = 20 / 0;
                        }
                        int i511 = ((i419 & 62) + (i419 | 62)) - 1;
                        l = i511 % 128;
                        int i512 = i511 % 2;
                    }
                    int i513 = l;
                    i6 = (((i513 | 60) << 1) - (i513 ^ 60)) - 1;
                    m = i6 % 128;
                    if (i6 % 2 != 0) {
                        return drawableC;
                    }
                    throw null;
                }
                int i110 = m;
                int i111 = i110 & 113;
                int i112 = -(-((i110 ^ 113) | i111));
                int i216 = ((i111 | i112) << 1) - (i111 ^ i112);
                l = i216 % 128;
                int i217 = i216 % 2;
                int i218 = i110 + 87;
                l = i218 % 128;
                int i219 = i218 % 2;
            }
        }
        int i917 = m;
        int i918 = i917 & 61;
        int i919 = i917 | 61;
        i = (i918 ^ i919) + ((i919 & i918) << 1);
        l = i % 128;
        if (i % 2 != 0) {
            int i101 = 73 / 0;
        }
        return drawable;
    }

    @Override // ivas.gov.bisp.enumeration.Z.j
    public void c(View view, Context context, Cursor cursor) {
        int i;
        Drawable drawableL;
        Drawable drawableL2;
        Drawable drawable;
        Drawable.ConstantState constantState;
        CharSequence charSequenceG;
        int length;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = l;
        int i6 = (i5 | 75) << 1;
        int i7 = -(((~i5) & 75) | (i5 & (-76)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        m = i8 % 128;
        int i9 = i8 % 2;
        aRR arr = (aRR) view.getTag();
        int i10 = this.A;
        int i11 = l;
        int i12 = i11 + 91;
        m = i12 % 128;
        int i13 = i12 % 2;
        if (i10 != -1) {
            int i14 = i11 + 53;
            m = i14 % 128;
            int i15 = i14 % 2;
            i = cursor.getInt(i10);
            int i16 = l;
            int i17 = (((i16 | 42) << 1) - (i16 ^ 42)) - 1;
            m = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = i11 + 71;
            m = i19 % 128;
            int i20 = i19 % 2;
            i = 0;
        }
        Object obj = null;
        if (arr.a != null) {
            String strG = g(cursor, this.x);
            int i21 = m;
            int i22 = i21 | 65;
            int i23 = i22 << 1;
            int i24 = -((~(i21 & 65)) & i22);
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            l = i25 % 128;
            if (i25 % 2 != 0) {
                arr.a.setText(strG);
                TextUtils.isEmpty(strG);
                obj.hashCode();
                throw null;
            }
            TextView textView = arr.a;
            textView.setText(strG);
            if (TextUtils.isEmpty(strG)) {
                int i26 = l;
                int i27 = i26 & 19;
                int i28 = -(-(i26 | 19));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                m = i29 % 128;
                int i30 = i29 % 2;
                textView.setVisibility(8);
                int i31 = l;
                int i32 = i31 & 51;
                int i33 = ((((i31 ^ 51) | i32) << 1) - (~(-((i31 | 51) & (~i32))))) - 1;
                m = i33 % 128;
                int i34 = i33 % 2;
            } else {
                textView.setVisibility(0);
                int i35 = l;
                int i36 = i35 & 55;
                int i37 = ((i35 ^ 55) | i36) << 1;
                int i38 = -((i35 | 55) & (~i36));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                m = i39 % 128;
                int i40 = i39 % 2;
            }
        }
        if (arr.b != null) {
            int i41 = l + 5;
            m = i41 % 128;
            int i42 = i41 % 2;
            String strG2 = g(cursor, this.y);
            if (strG2 != null) {
                int i43 = l;
                int i44 = (i43 & (-90)) | ((~i43) & 89);
                int i45 = -(-((i43 & 89) << 1));
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                m = i46 % 128;
                int i47 = i46 % 2;
                if (this.u == null) {
                    TypedValue typedValue = new TypedValue();
                    this.q.getTheme().resolveAttribute(ivas.gov.bisp.enumeration.R.attr.textColorSearchUrl, typedValue, true);
                    Resources resources = this.q.getResources();
                    int i48 = m;
                    int i49 = i48 ^ 69;
                    int i50 = (i48 & 69) << 1;
                    int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                    l = i51 % 128;
                    if (i51 % 2 != 0) {
                        this.u = resources.getColorStateList(typedValue.resourceId);
                        throw null;
                    }
                    this.u = resources.getColorStateList(typedValue.resourceId);
                    int i52 = m;
                    int i53 = (i52 & (-102)) | ((~i52) & 101);
                    int i54 = -(-((i52 & 101) << 1));
                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                    l = i55 % 128;
                    int i56 = i55 % 2;
                }
                SpannableString spannableString = new SpannableString(strG2);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.u, null);
                int i57 = l;
                int i58 = i57 ^ 101;
                int i59 = ((i57 & 101) | i58) << 1;
                int i60 = -i58;
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                m = i61 % 128;
                if (i61 % 2 == 0) {
                    length = strG2.length();
                    i2 = 46;
                    i3 = 1;
                } else {
                    length = strG2.length();
                    i2 = 33;
                    i3 = 0;
                }
                int i62 = l;
                int i63 = ((i62 ^ 85) | (i62 & 85)) << 1;
                int i64 = -((i62 & (-86)) | ((~i62) & 85));
                int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                m = i65 % 128;
                if (i65 % 2 == 0) {
                    spannableString.setSpan(textAppearanceSpan, i3, length, i2);
                    throw null;
                }
                spannableString.setSpan(textAppearanceSpan, i3, length, i2);
                charSequenceG = spannableString;
            } else {
                charSequenceG = g(cursor, this.w);
            }
            if (TextUtils.isEmpty(charSequenceG)) {
                int i66 = m;
                int i67 = i66 ^ 61;
                int i68 = ((((i66 & 61) | i67) << 1) - (~(-i67))) - 1;
                l = i68 % 128;
                int i69 = i68 % 2;
                TextView textView2 = arr.a;
                if (textView2 != null) {
                    int i70 = m;
                    int i71 = (i70 ^ 109) + ((i70 & 109) << 1);
                    l = i71 % 128;
                    if (i71 % 2 != 0) {
                        textView2.setSingleLine(true);
                        arr.a.setMaxLines(4);
                    } else {
                        textView2.setSingleLine(false);
                        arr.a.setMaxLines(2);
                    }
                }
            } else {
                TextView textView3 = arr.a;
                if (textView3 != null) {
                    int i72 = m;
                    int i73 = i72 & 41;
                    int i74 = i73 + ((i72 ^ 41) | i73);
                    l = i74 % 128;
                    int i75 = i74 % 2;
                    textView3.setSingleLine(true);
                    arr.a.setMaxLines(1);
                }
            }
            TextView textView4 = arr.b;
            textView4.setText(charSequenceG);
            if (TextUtils.isEmpty(charSequenceG)) {
                int i76 = l;
                int i77 = i76 & 97;
                int i78 = i76 | 97;
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                m = i79 % 128;
                int i80 = i79 % 2;
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                int i81 = m;
                int i82 = (i81 & 11) + (i81 | 11);
                l = i82 % 128;
                int i83 = i82 % 2;
            }
        }
        ImageView imageView = arr.c;
        if (imageView != null) {
            int i84 = l + 125;
            int i85 = i84 % 128;
            m = i85;
            int i86 = i84 % 2;
            int i87 = this.z;
            if (i87 == -1) {
                int i88 = (((i85 | 126) << 1) - (i85 ^ 126)) - 1;
                l = i88 % 128;
                if (i88 % 2 != 0) {
                    throw null;
                }
                drawableL2 = null;
            } else {
                drawableL2 = l(cursor.getString(i87));
                if (drawableL2 == null) {
                    int i89 = l;
                    int i90 = (i89 & 9) + (i89 | 9);
                    m = i90 % 128;
                    int i91 = i90 % 2;
                    ComponentName searchActivity = this.f100o.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    int i92 = l;
                    int i93 = i92 & 69;
                    int i94 = (i93 - (~(-(-((i92 ^ 69) | i93))))) - 1;
                    m = i94 % 128;
                    int i95 = i94 % 2;
                    if (this.r.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState2 = this.r.get(strFlattenToShortString);
                        int i96 = m;
                        int i97 = ((i96 | 41) << 1) - (i96 ^ 41);
                        l = i97 % 128;
                        int i98 = i97 % 2;
                        if (constantState2 == null) {
                            int i99 = (i96 | 19) << 1;
                            int i100 = -(i96 ^ 19);
                            int i101 = (i99 & i100) + (i99 | i100);
                            l = i101 % 128;
                            int i102 = i101 % 2;
                            drawableL2 = null;
                        } else {
                            drawableL2 = constantState2.newDrawable(this.q.getResources());
                            int i103 = (-2) - ((m + 122) ^ (-1));
                            l = i103 % 128;
                            int i104 = i103 % 2;
                        }
                    } else {
                        PackageManager packageManager = this.q.getPackageManager();
                        int i105 = m;
                        int i106 = ((i105 ^ 97) | (i105 & 97)) << 1;
                        int i107 = -(((~i105) & 97) | (i105 & (-98)));
                        int i108 = (i106 & i107) + (i107 | i106);
                        l = i108 % 128;
                        try {
                            if (i108 % 2 != 0) {
                                packageManager.getActivityInfo(searchActivity, 128).getIconResource();
                                obj.hashCode();
                                throw null;
                            }
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                String packageName = searchActivity.getPackageName();
                                int i109 = l;
                                int i110 = (i109 & (-14)) | ((~i109) & 13);
                                int i111 = -(-((i109 & 13) << 1));
                                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                                m = i112 % 128;
                                if (i112 % 2 == 0) {
                                    packageManager.getDrawable(packageName, iconResource, activityInfo.applicationInfo);
                                    throw null;
                                }
                                drawable = packageManager.getDrawable(packageName, iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                            if (drawable == null) {
                                int i113 = l;
                                int i114 = i113 & 75;
                                int i115 = (i114 - (~(-(-((i113 ^ 75) | i114))))) - 1;
                                int i116 = i115 % 128;
                                m = i116;
                                int i117 = i115 % 2;
                                int i118 = (((i116 ^ 3) | (i116 & 3)) << 1) - (((~i116) & 3) | (i116 & (-4)));
                                l = i118 % 128;
                                int i119 = i118 % 2;
                                constantState = null;
                            } else {
                                constantState = drawable.getConstantState();
                                int i120 = l;
                                int i121 = ((i120 & (-98)) | ((~i120) & 97)) + ((i120 & 97) << 1);
                                m = i121 % 128;
                                int i122 = i121 % 2;
                            }
                            this.r.put(strFlattenToShortString, constantState);
                            drawableL2 = drawable;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    if (drawableL2 == null) {
                        int i123 = m;
                        int i124 = (((i123 | 22) << 1) - (i123 ^ 22)) - 1;
                        l = i124 % 128;
                        if (i124 % 2 != 0) {
                            this.q.getPackageManager().getDefaultActivityIcon();
                            throw null;
                        }
                        drawableL2 = this.q.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableL2);
            if (drawableL2 == null) {
                int i125 = m;
                int i126 = (((i125 | 116) << 1) - (i125 ^ 116)) - 1;
                l = i126 % 128;
                int i127 = i126 % 2;
                imageView.setVisibility(4);
                int i128 = l + 65;
                m = i128 % 128;
                int i129 = i128 % 2;
            } else {
                imageView.setVisibility(0);
                drawableL2.setVisible(false, false);
                int i130 = l + 7;
                m = i130 % 128;
                if (i130 % 2 == 0) {
                    drawableL2.setVisible(true, true);
                } else {
                    drawableL2.setVisible(true, false);
                }
                int i131 = l;
                int i132 = (((i131 & (-48)) | ((~i131) & 47)) - (~((i131 & 47) << 1))) - 1;
                m = i132 % 128;
                int i133 = i132 % 2;
            }
        }
        ImageView imageView2 = arr.d;
        if (imageView2 != null) {
            int i134 = l;
            int i135 = i134 + 43;
            m = i135 % 128;
            int i136 = i135 % 2;
            int i137 = this.v;
            if (i137 == -1) {
                int i138 = ((i134 & 113) - (~(i134 | 113))) - 1;
                m = i138 % 128;
                if (i138 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                drawableL = null;
            } else {
                drawableL = l(cursor.getString(i137));
                int i139 = m + 55;
                int i140 = i139 % 128;
                l = i140;
                if (i139 % 2 != 0) {
                    throw null;
                }
                int i141 = i140 & 65;
                int i142 = (i141 - (~((i140 ^ 65) | i141))) - 1;
                m = i142 % 128;
                int i143 = i142 % 2;
            }
            imageView2.setImageDrawable(drawableL);
            if (drawableL == null) {
                int i144 = l;
                int i145 = (i144 ^ 109) + ((i144 & 109) << 1);
                m = i145 % 128;
                int i146 = i145 % 2;
                imageView2.setVisibility(8);
                int i147 = l;
                int i148 = (i147 ^ 1) + ((i147 & 1) << 1);
                m = i148 % 128;
                if (i148 % 2 == 0) {
                    int i149 = 5 % 4;
                }
            } else {
                imageView2.setVisibility(0);
                drawableL.setVisible(false, false);
                int i150 = m + 99;
                l = i150 % 128;
                int i151 = i150 % 2;
                drawableL.setVisible(true, false);
                int i152 = m;
                int i153 = ((i152 ^ 1) - (~(-(-((i152 & 1) << 1))))) - 1;
                l = i153 % 128;
                int i154 = i153 % 2;
            }
        }
        int i155 = this.s;
        if (i155 != 2) {
            int i156 = l;
            int i157 = ((i156 | 103) << 1) - (i156 ^ 103);
            int i158 = i157 % 128;
            m = i158;
            if (i157 % 2 != 0 ? i155 == 1 : i155 == 1) {
                int i159 = ((i158 & (-48)) | ((~i158) & 47)) + ((i158 & 47) << 1);
                l = i159 % 128;
                if (i159 % 2 == 0) {
                }
            }
            arr.e.setVisibility(8);
            return;
        }
        arr.e.setVisibility(0);
        ImageView imageView3 = arr.e;
        int i160 = m;
        int i161 = (i160 & 99) + (i160 | 99);
        l = i161 % 128;
        int i162 = i161 % 2;
        imageView3.setTag(arr.a.getText());
        int i163 = l;
        int i164 = (i163 & (-22)) | ((~i163) & 21);
        int i165 = (i163 & 21) << 1;
        int i166 = (i164 ^ i165) + ((i165 & i164) << 1);
        m = i166 % 128;
        int i167 = i166 % 2;
        arr.e.setOnClickListener(this);
        int i168 = m;
        int i169 = i168 & 15;
        int i170 = (i168 ^ 15) | i169;
        int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
        l = i171 % 128;
        if (i171 % 2 != 0) {
            throw null;
        }
    }
}
