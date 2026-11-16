package ivas.gov.bisp.enumeration.p038bk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ba extends RecyclerView.OooO<boD> {
    private static int d = 0;
    private static int e = 1;
    public List<aZ> f;
    public Context g;

    public static class boD extends RecyclerView.o0O0O00 {
        public TextView u;
        public TextView v;
        public TextView w;
        public TextView x;
        public ImageView y;
        public TextView z;

        public boD(View view) {
            super(view);
            this.y = (ImageView) view.findViewById(R.id.imgBike);
            this.u = (TextView) view.findViewById(R.id.tvBikeOwner);
            this.z = (TextView) view.findViewById(R.id.tvBikeNic);
            this.v = (TextView) view.findViewById(R.id.tvBikeNumber);
            this.w = (TextView) view.findViewById(R.id.tvBikeType);
            this.x = (TextView) view.findViewById(R.id.tvProvince);
        }
    }

    public ba(Context context, List<aZ> list) {
        this.g = context;
        this.f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public int b() {
        int i = 2 % 2;
        int i2 = e + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        int size = this.f.size();
        int i4 = e + 81;
        d = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public RecyclerView.o0O0O00 f(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = ((i3 | 93) << 1) - (((~i3) & 93) | (i3 & (-94)));
        e = i4 % 128;
        int i5 = i4 % 2;
        boD bod = new boD(LayoutInflater.from(this.g).inflate(R.layout.item_bike, viewGroup, false));
        int i6 = e;
        int i7 = ((i6 & 60) + (i6 | 60)) - 1;
        d = i7 % 128;
        int i8 = i7 % 2;
        return bod;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooO
    public void g(RecyclerView.o0O0O00 o0o0o00, int i) {
        String strSubstring;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = ((i3 ^ 98) + ((i3 & 98) << 1)) - 1;
        e = i4 % 128;
        int i5 = i4 % 2;
        boD bod = (boD) o0o0o00;
        aZ aZVar = this.f.get(i);
        int i6 = d + 99;
        e = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            TextView textView = bod.u;
            String str = aZVar.e;
            obj.hashCode();
            throw null;
        }
        aZ aZVar2 = aZVar;
        TextView textView2 = bod.u;
        String str2 = aZVar2.e;
        int i7 = d;
        int i8 = ((i7 & 41) - (~(i7 | 41))) - 1;
        e = i8 % 128;
        if (i8 % 2 == 0) {
            textView2.setText(str2);
            TextView textView3 = bod.z;
            String str3 = aZVar2.g;
            obj.hashCode();
            throw null;
        }
        textView2.setText(str2);
        TextView textView4 = bod.z;
        String strT = aZVar2.g;
        if (strT != null) {
            int i9 = d;
            int i10 = i9 & 7;
            int i11 = i10 + ((i9 ^ 7) | i10);
            e = i11 % 128;
            int i12 = i11 % 2;
            if (strT.length() < 13) {
                int i13 = e;
                int i14 = (i13 & 7) + (i13 | 7);
                d = i14 % 128;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                String strReplace = strT.replace("-", BuildConfig.FLAVOR);
                int i15 = d;
                int i16 = (i15 ^ 71) + ((i15 & 71) << 1);
                e = i16 % 128;
                int i17 = i16 % 2;
                String strSubstring2 = strReplace.substring(0, 4);
                int length = strReplace.length();
                int i18 = d;
                int i19 = i18 & 13;
                int i20 = ((i18 ^ 13) | i19) << 1;
                int i21 = -((13 | i18) & (~i19));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                e = i22 % 128;
                if (i22 % 2 == 0) {
                    strSubstring = strReplace.substring(((((length ^ (-1)) | length) << 1) - (~(-(~length)))) - 1);
                } else {
                    int i23 = -(-((length ^ (-1)) | length));
                    strSubstring = strReplace.substring((length ^ i23) + ((length & i23) << 1));
                }
                strT = j.t(strSubstring2, "*******", strSubstring);
                int i24 = e;
                int i25 = i24 & 85;
                int i26 = (i24 ^ 85) | i25;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                int i28 = i27 % 128;
                d = i28;
                int i29 = i27 % 2;
                int i30 = i28 & 57;
                int i31 = -(-((i28 ^ 57) | i30));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                e = i32 % 128;
                int i33 = i32 % 2;
            }
        }
        textView4.setText(strT);
        TextView textView5 = bod.v;
        int i34 = d + 65;
        e = i34 % 128;
        int i35 = i34 % 2;
        textView5.setText(aZVar2.a);
        TextView textView6 = bod.w;
        int i36 = d;
        int i37 = i36 ^ 73;
        int i38 = ((i36 & 73) | i37) << 1;
        int i39 = -i37;
        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
        e = i40 % 128;
        if (i40 % 2 == 0) {
            textView6.setText(aZVar2.c);
            TextView textView7 = bod.x;
            obj.hashCode();
            throw null;
        }
        textView6.setText(aZVar2.c);
        TextView textView8 = bod.x;
        int i41 = e;
        int i42 = i41 & 19;
        int i43 = i41 | 19;
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        d = i44 % 128;
        if (i44 % 2 != 0) {
            textView8.setText(aZVar2.d);
            Bitmap bitmap = aZVar2.f;
            obj.hashCode();
            throw null;
        }
        textView8.setText(aZVar2.d);
        Bitmap bitmap2 = aZVar2.f;
        if (bitmap2 != null) {
            int i45 = d;
            int i46 = (i45 | 49) << 1;
            int i47 = -(((~i45) & 49) | (i45 & (-50)));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            e = i48 % 128;
            int i49 = i48 % 2;
            if (!bitmap2.equals(BuildConfig.FLAVOR)) {
                int i50 = d;
                int i51 = i50 & 11;
                int i52 = (((i50 ^ 11) | i51) << 1) - ((i50 | 11) & (~i51));
                e = i52 % 128;
                if (i52 % 2 == 0) {
                    bod.y.setImageBitmap(aZVar2.f);
                    int i53 = 60 / 0;
                } else {
                    bod.y.setImageBitmap(aZVar2.f);
                }
                int i54 = e;
                int i55 = (i54 | 125) << 1;
                int i56 = -(i54 ^ 125);
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                d = i57 % 128;
                int i58 = i57 % 2;
            }
        }
        int i59 = d + 119;
        e = i59 % 128;
        if (i59 % 2 == 0) {
            throw null;
        }
    }
}
