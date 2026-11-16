package ivas.gov.bisp.enumeration.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;
import ivas.gov.bisp.enumeration.models.Tokens;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdapterTokens extends RecyclerView.OooO<TokensViewHolder> {
    private static int d = 0;
    private static int e = 1;
    public ArrayList<Tokens> f;
    public final OooO00o g;

    public interface OooO00o {
    }

    public class TokensViewHolder extends RecyclerView.o0O0O00 {

        @BindView
        public TextView beneficiaryCNIC;

        @BindView
        public TextView beneficiaryName;

        @BindView
        public TextView nameIconTextView;

        @BindView
        public RelativeLayout relativeLayout;

        public TokensViewHolder(AdapterTokens adapterTokens, View view) {
            super(view);
            ButterKnife.c(this, view);
        }
    }

    public class TokensViewHolder_ViewBinding implements Unbinder {
        public TokensViewHolder_ViewBinding(TokensViewHolder tokensViewHolder, View view) {
            tokensViewHolder.relativeLayout = (RelativeLayout) u.b(u.c(view, R.id.name_icon_relativeLayout, "field 'relativeLayout'"), R.id.name_icon_relativeLayout, "field 'relativeLayout'", RelativeLayout.class);
            tokensViewHolder.nameIconTextView = (TextView) u.b(u.c(view, R.id.name_letter_list_item_textView, "field 'nameIconTextView'"), R.id.name_letter_list_item_textView, "field 'nameIconTextView'", TextView.class);
            tokensViewHolder.beneficiaryName = (TextView) u.b(u.c(view, R.id.beneficiary_name_list_item_textView, "field 'beneficiaryName'"), R.id.beneficiary_name_list_item_textView, "field 'beneficiaryName'", TextView.class);
            tokensViewHolder.beneficiaryCNIC = (TextView) u.b(u.c(view, R.id.beneficiary_cnic_list_item_textView, "field 'beneficiaryCNIC'"), R.id.beneficiary_cnic_list_item_textView, "field 'beneficiaryCNIC'", TextView.class);
        }
    }

    public AdapterTokens(Context context, String str, ArrayList<Tokens> arrayList, OooO00o oooO00o) {
        this.f = arrayList;
        this.g = oooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int size;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 67;
        int i4 = (i2 & 67) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        e = i5 % 128;
        int i6 = i5 % 2;
        ArrayList<Tokens> arrayList = this.f;
        if (arrayList != null) {
            int i7 = i2 ^ 57;
            int i8 = (i2 & 57) << 1;
            int i9 = (i7 & i8) + (i8 | i7);
            e = i9 % 128;
            if (i9 % 2 == 0) {
                arrayList.size();
                throw null;
            }
            size = arrayList.size();
        } else {
            int i10 = ((i2 ^ 69) | (i2 & 69)) << 1;
            int i11 = -(((~i2) & 69) | (i2 & (-70)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            e = i12 % 128;
            int i13 = i12 % 2;
            size = 0;
        }
        int i14 = d;
        int i15 = ((i14 & (-8)) | ((~i14) & 7)) + ((i14 & 7) << 1);
        e = i15 % 128;
        int i16 = i15 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        TokensViewHolder tokensViewHolder = new TokensViewHolder(this, ivas.gov.bisp.enumeration.p091n.j.d(viewGroup, R.layout.list_item_token, viewGroup, false));
        int i3 = e;
        int i4 = (i3 | 83) << 1;
        int i5 = -(i3 ^ 83);
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        int i7 = i6 % 2;
        return tokensViewHolder;
    }

    public void h(ArrayList<Tokens> arrayList) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.f = arrayList;
            this.a.c();
        } else {
            this.f = arrayList;
            this.a.c();
            int i4 = 44 / 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        int i2 = 2 % 2;
        int i3 = e;
        int i4 = i3 ^ 65;
        int i5 = -(-((i3 & 65) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        d = i6 % 128;
        int i7 = i6 % 2;
        TokensViewHolder tokensViewHolder = (TokensViewHolder) o0o0o00;
        try {
            Tokens tokens = this.f.get(i);
            TextView textView = tokensViewHolder.nameIconTextView;
            StringBuilder sb = new StringBuilder();
            int i8 = e;
            int i9 = i8 & 115;
            int i10 = i9 + ((i8 ^ 115) | i9);
            d = i10 % 128;
            if (i10 % 2 != 0) {
                sb.append(tokens.getTokenSequence());
                throw null;
            }
            sb.append(tokens.getTokenSequence());
            textView.setText(sb.toString());
            if (tokens.getName() != null) {
                TextView textView2 = tokensViewHolder.beneficiaryName;
                StringBuilder sb2 = new StringBuilder();
                int i11 = e;
                int i12 = i11 & 45;
                int i13 = i11 | 45;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                d = i14 % 128;
                if (i14 % 2 != 0) {
                    sb2.append(tokens.getName());
                    textView2.setText(sb2.toString());
                    throw null;
                }
                sb2.append(tokens.getName());
                textView2.setText(sb2.toString());
            }
            if (tokens.getCnic() != null) {
                TextView textView3 = tokensViewHolder.beneficiaryCNIC;
                StringBuilder sb3 = new StringBuilder();
                int i15 = e;
                int i16 = (-2) - (((i15 & 16) + (i15 | 16)) ^ (-1));
                d = i16 % 128;
                if (i16 % 2 != 0) {
                    sb3.append(tokens.getCnic());
                    textView3.setText(sb3.toString());
                    throw null;
                }
                sb3.append(tokens.getCnic());
                textView3.setText(sb3.toString());
                int i17 = e;
                int i18 = ((i17 ^ 54) + ((i17 & 54) << 1)) - 1;
                d = i18 % 128;
                int i19 = i18 % 2;
            }
            View view = tokensViewHolder.c;
            i iVar = new i(this, tokens);
            int i20 = d;
            int i21 = i20 & 125;
            int i22 = (i20 ^ 125) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            e = i23 % 128;
            int i24 = i23 % 2;
            view.setOnClickListener(iVar);
            int i25 = e + 51;
            d = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
