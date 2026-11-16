package ivas.gov.bisp.enumeration.dialogs;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class DialogMapListing_ViewBinding implements Unbinder {
    public DialogMapListing_ViewBinding(DialogMapListing dialogMapListing, View view) {
        dialogMapListing.mRvMapListing = (RecyclerView) u.b(u.c(view, R.id.rv_map_listing, "field 'mRvMapListing'"), R.id.rv_map_listing, "field 'mRvMapListing'", RecyclerView.class);
        dialogMapListing.mBtnOk = (Button) u.b(u.c(view, R.id.btn_ok, "field 'mBtnOk'"), R.id.btn_ok, "field 'mBtnOk'", Button.class);
        dialogMapListing.mBtnCancel = (Button) u.b(u.c(view, R.id.btn_cancel, "field 'mBtnCancel'"), R.id.btn_cancel, "field 'mBtnCancel'", Button.class);
    }
}
