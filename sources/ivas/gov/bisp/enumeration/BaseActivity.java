package ivas.gov.bisp.enumeration;

import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.orm.SugarContext;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import java.lang.reflect.Constructor;
import java.util.Map;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseActivity extends BaseTouch {
    private static int p = 1;
    private static int q;
    public int ac;
    public boolean ad;
    public AppCompatActivity ae;

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 & 85) + (i2 | 85);
        p = i3 % 128;
        int i4 = i3 % 2;
        getMenuInflater().inflate(R.menu.common_menu, menu);
        int i5 = p;
        int i6 = i5 & 107;
        int i7 = -(-((i5 ^ 107) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        q = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = p + 117;
        q = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = p;
        int i5 = i4 & 27;
        int i6 = ((i4 | 27) & (~i5)) + (i5 << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 59) | (i2 & 59)) << 1;
        int i4 = -(((~i2) & 59) | (i2 & (-60)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        q = i5 % 128;
        int i6 = i5 % 2;
        if (menuItem.getItemId() == R.id.action_info) {
            int i7 = q;
            int i8 = (-2) - ((((i7 | 108) << 1) - (i7 ^ 108)) ^ (-1));
            p = i8 % 128;
            int i9 = i8 % 2;
            ah.c.d.getInt("app_version", 0);
            int i10 = p;
            int i11 = ((i10 & 58) + (i10 | 58)) - 1;
            q = i11 % 128;
            Object obj = null;
            if (i11 % 2 != 0) {
                ah.c.d.getString("imei_mac", BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            ah.c.d.getString("imei_mac", BuildConfig.FLAVOR);
            int i12 = p;
            int i13 = ((i12 & (-100)) | ((~i12) & 99)) + ((i12 & 99) << 1);
            q = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ah.c.d.getInt("user_id", 0);
            ah.c.d.getInt("supervisorID", 0);
            int i16 = q;
            int i17 = i16 & 67;
            int i18 = -(-((i16 ^ 67) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            p = i19 % 128;
            if (i19 % 2 == 0) {
                ah.c.d.getString("full_name", BuildConfig.FLAVOR);
                throw null;
            }
            ah.c.d.getString("full_name", BuildConfig.FLAVOR);
            ah.c.d.getString("user_cnic", BuildConfig.FLAVOR);
            int i20 = q;
            int i21 = i20 & 25;
            int i22 = (i21 - (~(-(-((i20 ^ 25) | i21))))) - 1;
            p = i22 % 128;
            int i23 = i22 % 2;
            ag.q(this, i15);
            int i24 = p;
            int i25 = ((i24 ^ 52) + ((i24 & 52) << 1)) - 1;
            q = i25 % 128;
            int i26 = i25 % 2;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        int i27 = p;
        int i28 = (i27 & 77) + (i27 | 77);
        q = i28 % 128;
        int i29 = i28 % 2;
        return zOnOptionsItemSelected;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 85;
        int i4 = (i2 & 85) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        p = i5 % 128;
        int i6 = i5 % 2;
        super.t();
        this.ae = this;
        Map<Class<?>, Constructor<? extends Unbinder>> map = ButterKnife.a;
        Window window = getWindow();
        int i7 = p;
        int i8 = i7 & 107;
        int i9 = i8 + ((i7 ^ 107) | i8);
        q = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            ButterKnife.c(this, window.getDecorView());
            SugarContext.init(this);
            ah ahVar = ah.c;
            obj.hashCode();
            throw null;
        }
        ButterKnife.c(this, window.getDecorView());
        SugarContext.init(this);
        this.ad = ah.c.d.getBoolean("firstTimeUser", true);
        int i10 = q;
        int i11 = i10 & 101;
        int i12 = (i10 ^ 101) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        p = i13 % 128;
        this.ac = i13 % 2 == 0 ? ah.c.d.getInt("userType", 0) : ah.c.d.getInt("userType", 1);
        int i14 = q;
        int i15 = i14 & 15;
        int i16 = ((i14 | 15) & (~i15)) + (i15 << 1);
        p = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }
}
