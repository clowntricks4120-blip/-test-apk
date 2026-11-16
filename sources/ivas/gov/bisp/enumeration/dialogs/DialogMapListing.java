package ivas.gov.bisp.enumeration.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.X.i;
import ivas.gov.bisp.enumeration.adapters.AdapterMapListing;
import ivas.gov.bisp.enumeration.databaseModels.Villagemaps;
import ivas.gov.bisp.enumeration.dialogs.DialogMapListing;
import ivas.gov.bisp.enumeration.p036bi.I;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0192u;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class DialogMapListing {
    public Context a;
    public Dialog b;
    public AdapterMapListing c;
    public OooO00o d;

    @BindView
    public Button mBtnCancel;

    @BindView
    public Button mBtnOk;

    @BindView
    public RecyclerView mRvMapListing;

    public interface OooO00o {
        void onCancel();

        void onSubmit();
    }

    public DialogMapListing(Context context, final ArrayList<Villagemaps> arrayList, OooO00o oooO00o) {
        this.d = oooO00o;
        this.a = context;
        View viewInflate = ((Activity) context).getLayoutInflater().inflate(R.layout.dialog_map_listing, (ViewGroup) null);
        ButterKnife.c(this, viewInflate);
        b.aIz aiz = new b.aIz(context);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.k = false;
        oooO0O0.f1o = viewInflate;
        this.b = aiz.b();
        this.c = new AdapterMapListing(context, arrayList, new i() { // from class: ivas.gov.bisp.enumeration.aA.aP
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.X.i
            public final void c(int i) {
                int i2 = 2 % 2;
                int i3 = b + 123;
                a = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Objects.requireNonNull(this.c);
                    throw null;
                }
                DialogMapListing dialogMapListing = this.c;
                ArrayList arrayList2 = arrayList;
                Objects.requireNonNull(dialogMapListing);
                if (arrayList2 != null) {
                    int i4 = a;
                    int i5 = (i4 & 106) + (i4 | 106);
                    int i6 = (i5 ^ (-1)) + (i5 << 1);
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList2.size();
                        obj.hashCode();
                        throw null;
                    }
                    if (arrayList2.size() > i) {
                        String mapLink = ((Villagemaps) arrayList2.get(i)).getMapLink();
                        try {
                            StringBuilder sb = new StringBuilder();
                            int i7 = a;
                            int i8 = i7 & 111;
                            int i9 = (i7 | 111) & (~i8);
                            int i10 = -(-(i8 << 1));
                            int i11 = (i9 & i10) + (i9 | i10);
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            sb.append("http://");
                            sb.append(mapLink);
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                            int i13 = a;
                            int i14 = ((((i13 ^ 121) | (i13 & 121)) << 1) - (~(-(((~i13) & 121) | (i13 & (-122)))))) - 1;
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                            dialogMapListing.a.startActivity(intent);
                            int i16 = a;
                            int i17 = (-2) - ((((i16 | 62) << 1) - (i16 ^ 62)) ^ (-1));
                            b = i17 % 128;
                            int i18 = i17 % 2;
                            return;
                        } catch (Exception unused) {
                            Toast.makeText(dialogMapListing.a, "Invalid Url", 0).show();
                        }
                    }
                }
                int i19 = a + 87;
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.mRvMapListing.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRvMapListing.setAdapter(this.c);
        this.b.getWindow().setSoftInputMode(3);
        this.b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ivas.gov.bisp.enumeration.aA.aO
            private static int a = 0;
            private static int b = 1;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = 2 % 2;
                DialogMapListing dialogMapListing = this.c;
                int i2 = 1;
                dialogMapListing.mBtnOk.setOnClickListener(new I(dialogMapListing, dialogInterface, i2));
                Button button = dialogMapListing.mBtnCancel;
                ViewOnClickListenerC0192u viewOnClickListenerC0192u = new ViewOnClickListenerC0192u(dialogMapListing, dialogInterface, i2);
                int i3 = a;
                int i4 = (i3 & 85) + (i3 | 85);
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    button.setOnClickListener(viewOnClickListenerC0192u);
                    return;
                }
                button.setOnClickListener(viewOnClickListenerC0192u);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }
}
