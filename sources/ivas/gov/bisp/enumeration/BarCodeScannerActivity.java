package ivas.gov.bisp.enumeration;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import ivas.gov.bisp.enumeration.F.L;
import ivas.gov.bisp.enumeration.fragments.CameraSelectorDialogFragment;
import ivas.gov.bisp.enumeration.fragments.FormatSelectorDialogFragment;
import ivas.gov.bisp.enumeration.fragments.MessageDialogFragment;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class BarCodeScannerActivity extends AppCompatActivity implements MessageDialogFragment.MessageDialogListener, FormatSelectorDialogFragment.FormatSelectorDialogListener, CameraSelectorDialogFragment.CameraSelectorDialogListener {
    private static int p = 1;
    private static int q;
    public boolean r;
    public boolean s;
    public ArrayList<Integer> t;
    public int u = -1;

    public class OooO00o implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 28) + ((i2 & 28) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            BarCodeScannerActivity.this.finish();
            int i6 = a;
            int i7 = (i6 & 5) + (i6 | 5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 95 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.fragments.CameraSelectorDialogFragment.CameraSelectorDialogListener
    public void onCameraSelected(int i) {
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = i3 | 49;
        int i5 = ((i4 << 1) - (~(-((~(i3 & 49)) & i4)))) - 1;
        int i6 = i5 % 128;
        q = i6;
        int i7 = i5 % 2;
        this.u = i;
        int i8 = (((i6 & (-80)) | ((~i6) & 79)) - (~((i6 & 79) << 1))) - 1;
        p = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 22 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.fragments.MessageDialogFragment.MessageDialogListener
    public void onDialogPositiveClick(L l) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 & (-84)) | ((~i2) & 83)) - (~((i2 & 83) << 1))) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.fragments.FormatSelectorDialogFragment.FormatSelectorDialogListener
    public void onFormatsSaved(ArrayList<Integer> arrayList) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        q = i6;
        int i7 = i5 % 2;
        this.t = arrayList;
        int i8 = ((i6 ^ 105) | (i6 & 105)) << 1;
        int i9 = -(((~i6) & 105) | (i6 & (-106)));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        p = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 21;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
        int i4 = p + 31;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        q = i6 % 128;
        int i7 = i6 % 2;
        super.onPause();
        Fragment fragmentI = k().I("scan_results");
        int i8 = q;
        int i9 = i8 & 17;
        int i10 = (i9 - (~(-(-((i8 ^ 17) | i9))))) - 1;
        int i11 = i10 % 128;
        p = i11;
        int i12 = i10 % 2;
        L l = (L) fragmentI;
        if (l != null) {
            int i13 = ((i11 & 76) + (i11 | 76)) - 1;
            q = i13 % 128;
            int i14 = i13 % 2;
            l.dismiss();
            int i15 = q + 91;
            p = i15 % 128;
            int i16 = i15 % 2;
        }
        L l2 = (L) k().I("format_selector");
        if (l2 != null) {
            int i17 = q;
            int i18 = (i17 | 19) << 1;
            int i19 = -(i17 ^ 19);
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            p = i20 % 128;
            int i21 = i20 % 2;
            l2.dismiss();
            if (i21 == 0) {
                int i22 = 4 / 0;
            }
            int i23 = q;
            int i24 = i23 ^ 19;
            int i25 = ((((i23 & 19) | i24) << 1) - (~(-i24))) - 1;
            p = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = q;
        int i28 = i27 & 9;
        int i29 = (i27 | 9) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        p = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 41 / 0;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 107;
        int i4 = (((i2 ^ 107) | i3) << 1) - ((i2 | 107) & (~i3));
        q = i4 % 128;
        int i5 = i4 % 2;
        super.onSaveInstanceState(bundle);
        boolean z = this.s;
        int i6 = q;
        int i7 = i6 ^ 101;
        int i8 = (i6 & 101) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        p = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            bundle.putBoolean("FLASH_STATE", z);
            bundle.putBoolean("AUTO_FOCUS_STATE", this.r);
            throw null;
        }
        bundle.putBoolean("FLASH_STATE", z);
        bundle.putBoolean("AUTO_FOCUS_STATE", this.r);
        int i10 = p;
        int i11 = i10 & 99;
        int i12 = -(-((i10 ^ 99) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        q = i13 % 128;
        int i14 = i13 % 2;
        bundle.putIntegerArrayList("SELECTED_FORMATS", this.t);
        int i15 = p;
        int i16 = (i15 & 27) + (i15 | 27);
        q = i16 % 128;
        int i17 = i16 % 2;
        bundle.putInt("CAMERA_ID", this.u);
        int i18 = p;
        int i19 = (i18 ^ 2) + ((i18 & 2) << 1);
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        q = i20 % 128;
        if (i20 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd;
        int i;
        int i2;
        MenuItem menuItemAdd2;
        int i3 = 2 % 2;
        int i4 = q + 69;
        int i5 = i4 % 128;
        p = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.s) {
            menuItemAdd = menu.add(0, R.id.menu_flash, 0, R.string.flash_off);
            int i6 = q;
            i = ((i6 ^ 3) | (i6 & 3)) << 1;
            i2 = ((~i6) & 3) | (i6 & (-4));
        } else {
            int i7 = i5 ^ 71;
            int i8 = ((((i5 & 71) | i7) << 1) - (~(-i7))) - 1;
            q = i8 % 128;
            int i9 = i8 % 2;
            menuItemAdd = menu.add(0, R.id.menu_flash, 0, R.string.flash_on);
            int i10 = q;
            i = (i10 & (-100)) | ((~i10) & 99);
            i2 = -((i10 & 99) << 1);
        }
        int i11 = -i2;
        int i12 = ((i | i11) << 1) - (i11 ^ i);
        p = i12 % 128;
        int i13 = i12 % 2;
        menuItemAdd.setShowAsAction(0);
        if (this.r) {
            int i14 = p;
            int i15 = (((i14 | 11) << 1) - (~(-(i14 ^ 11)))) - 1;
            q = i15 % 128;
            menuItemAdd2 = i15 % 2 != 0 ? menu.add(0, R.id.menu_auto_focus, 1, R.string.auto_focus_on) : menu.add(0, R.id.menu_auto_focus, 0, R.string.auto_focus_on);
            int i16 = p;
            int i17 = i16 & 71;
            int i18 = (i16 | 71) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            q = i20 % 128;
            int i21 = i20 % 2;
        } else {
            menuItemAdd2 = menu.add(0, R.id.menu_auto_focus, 0, R.string.auto_focus_off);
            int i22 = p;
            int i23 = i22 | 93;
            int i24 = i23 << 1;
            int i25 = -((~(i22 & 93)) & i23);
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            q = i26 % 128;
            int i27 = i26 % 2;
        }
        menuItemAdd2.setShowAsAction(0);
        int i28 = p;
        int i29 = ((i28 ^ 75) - (~(-(-((i28 & 75) << 1))))) - 1;
        q = i29 % 128;
        int i30 = i29 % 2;
        menu.add(0, R.id.menu_formats, 0, R.string.formats).setShowAsAction(0);
        int i31 = q;
        int i32 = i31 ^ 87;
        int i33 = (((i31 & 87) | i32) << 1) - i32;
        p = i33 % 128;
        int i34 = i33 % 2;
        menu.add(0, R.id.menu_camera_selector, 0, R.string.select_camera).setShowAsAction(0);
        int i35 = p;
        int i36 = i35 & 125;
        int i37 = (i36 - (~(-(-((i35 ^ 125) | i36))))) - 1;
        q = i37 % 128;
        int i38 = i37 % 2;
        boolean zOnCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        int i39 = p;
        int i40 = ((i39 | 29) << 1) - (i39 ^ 29);
        q = i40 % 128;
        int i41 = i40 % 2;
        return zOnCreateOptionsMenu;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        q = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        switch (menuItem.getItemId()) {
            case R.id.menu_auto_focus /* 2131362529 */:
                boolean z = !this.r;
                this.r = z;
                int i5 = p;
                int i6 = i5 ^ 83;
                int i7 = ((((i5 & 83) | i6) << 1) - (~(-i6))) - 1;
                int i8 = i7 % 128;
                q = i8;
                int i9 = i7 % 2;
                if (z) {
                    int i10 = i8 & 39;
                    int i11 = (~i10) & (i8 | 39);
                    int i12 = i10 << 1;
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    p = i13 % 128;
                    int i14 = i13 % 2;
                    menuItem.setTitle(R.string.auto_focus_on);
                    int i15 = q;
                    int i16 = ((i15 | 21) << 1) - (((~i15) & 21) | (i15 & (-22)));
                    p = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    menuItem.setTitle(R.string.auto_focus_off);
                    int i18 = p;
                    int i19 = (i18 ^ 79) + ((i18 & 79) << 1);
                    q = i19 % 128;
                    int i20 = i19 % 2;
                }
                int i21 = p;
                int i22 = i21 & 73;
                int i23 = (i21 | 73) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = (i23 & i24) + (i23 | i24);
                q = i25 % 128;
                if (i25 % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            case R.id.menu_camera_selector /* 2131362530 */:
                CameraSelectorDialogFragment cameraSelectorDialogFragmentNewInstance = CameraSelectorDialogFragment.newInstance(this, this.u);
                h hVarK = k();
                int i26 = q;
                int i27 = ((i26 ^ 55) | (i26 & 55)) << 1;
                int i28 = -(((~i26) & 55) | (i26 & (-56)));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                p = i29 % 128;
                if (i29 % 2 == 0) {
                    cameraSelectorDialogFragmentNewInstance.show(hVarK, "camera_selector");
                    return false;
                }
                cameraSelectorDialogFragmentNewInstance.show(hVarK, "camera_selector");
                return true;
            case R.id.menu_flash /* 2131362531 */:
                boolean z2 = this.s;
                boolean z3 = ((~(z2 ? 1 : 0)) & 1) ^ ((z2 ? 1 : 0) & (-2));
                this.s = z3;
                int i30 = q;
                int i31 = (i30 & 33) + (i30 | 33);
                p = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 73 / 0;
                    if (z3 != 0) {
                        menuItem.setTitle(R.string.flash_on);
                        int i33 = p;
                        int i34 = i33 & 71;
                        int i35 = (i33 ^ 71) | i34;
                        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                        q = i36 % 128;
                        int i37 = i36 % 2;
                    } else {
                        menuItem.setTitle(R.string.flash_off);
                        int i38 = p;
                        int i39 = i38 & 77;
                        int i40 = i39 + ((i38 ^ 77) | i39);
                        q = i40 % 128;
                        int i41 = i40 % 2;
                    }
                } else if (z3 != 0) {
                    menuItem.setTitle(R.string.flash_on);
                    int i310 = p;
                    int i311 = i310 & 71;
                    int i312 = (i310 ^ 71) | i311;
                    int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                    q = i313 % 128;
                    int i314 = i313 % 2;
                } else {
                    menuItem.setTitle(R.string.flash_off);
                    int i315 = p;
                    int i316 = i315 & 77;
                    int i42 = i316 + ((i315 ^ 77) | i316);
                    q = i42 % 128;
                    int i43 = i42 % 2;
                }
                int i44 = q;
                int i45 = ((i44 & 52) + (i44 | 52)) - 1;
                p = i45 % 128;
                if (i45 % 2 != 0) {
                    return true;
                }
                throw null;
            case R.id.menu_formats /* 2131362532 */:
                FormatSelectorDialogFragment formatSelectorDialogFragmentNewInstance = FormatSelectorDialogFragment.newInstance(this, this.t);
                h hVarK2 = k();
                int i46 = p;
                int i47 = (i46 & (-56)) | ((~i46) & 55);
                int i48 = -(-((i46 & 55) << 1));
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                q = i49 % 128;
                int i50 = i49 % 2;
                formatSelectorDialogFragmentNewInstance.show(hVarK2, "format_selector");
                int i51 = p + 71;
                q = i51 % 128;
                if (i51 % 2 == 0) {
                    return true;
                }
                throw null;
            default:
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                int i52 = q;
                int i53 = ((i52 ^ 119) | (i52 & 119)) << 1;
                int i54 = -(((~i52) & 119) | (i52 & (-120)));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                p = i55 % 128;
                int i56 = i55 % 2;
                return zOnOptionsItemSelected;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:12:0x0073  */
    /* JADX WARN: Code duplicated, block: B:14:0x008f  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x0153  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = p + 51;
        q = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            super.onCreate(bundle);
            int i7 = 55 / 0;
            if (bundle != null) {
                int i8 = q + 87;
                p = i8 % 128;
                int i9 = i8 % 2;
                this.s = bundle.getBoolean("FLASH_STATE", false);
                int i10 = p;
                int i11 = i10 | 63;
                int i12 = i11 << 1;
                int i13 = -((~(i10 & 63)) & i11);
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                q = i14 % 128;
                int i15 = i14 % 2;
                this.r = bundle.getBoolean("AUTO_FOCUS_STATE", true);
                this.t = bundle.getIntegerArrayList("SELECTED_FORMATS");
                int i16 = q;
                i = ((i16 ^ 99) - (~((i16 & 99) << 1))) - 1;
                p = i % 128;
                if (i % 2 == 0) {
                    this.u = bundle.getInt("CAMERA_ID", -1);
                    int i17 = 39 / 0;
                } else {
                    this.u = bundle.getInt("CAMERA_ID", -1);
                }
                int i18 = q;
                int i19 = i18 & 125;
                int i20 = ((((i18 ^ 125) | i19) << 1) - (~(-((i18 | 125) & (~i19))))) - 1;
                p = i20 % 128;
                int i21 = i20 % 2;
            } else {
                this.s = false;
                this.r = true;
                int i22 = q;
                int i23 = i22 ^ 119;
                int i24 = -(-((i22 & 119) << 1));
                i2 = ((i23 | i24) << 1) - (i24 ^ i23);
                i3 = i2 % 128;
                p = i3;
                if (i2 % 2 != 0) {
                    this.t = null;
                    this.u = -1;
                    throw null;
                }
                this.t = null;
                this.u = -1;
                i4 = ((i3 & 85) - (~(i3 | 85))) - 1;
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    int i25 = 5 / 5;
                }
            }
        } else {
            super.onCreate(bundle);
            if (bundle != null) {
                int i26 = q + 87;
                p = i26 % 128;
                int i27 = i26 % 2;
                this.s = bundle.getBoolean("FLASH_STATE", false);
                int i110 = p;
                int i111 = i110 | 63;
                int i112 = i111 << 1;
                int i113 = -((~(i110 & 63)) & i111);
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                q = i114 % 128;
                int i115 = i114 % 2;
                this.r = bundle.getBoolean("AUTO_FOCUS_STATE", true);
                this.t = bundle.getIntegerArrayList("SELECTED_FORMATS");
                int i116 = q;
                i = ((i116 ^ 99) - (~((i116 & 99) << 1))) - 1;
                p = i % 128;
                if (i % 2 == 0) {
                    this.u = bundle.getInt("CAMERA_ID", -1);
                    int i117 = 39 / 0;
                } else {
                    this.u = bundle.getInt("CAMERA_ID", -1);
                }
                int i118 = q;
                int i119 = i118 & 125;
                int i28 = ((((i118 ^ 125) | i119) << 1) - (~(-((i118 | 125) & (~i119))))) - 1;
                p = i28 % 128;
                int i29 = i28 % 2;
            } else {
                this.s = false;
                this.r = true;
                int i210 = q;
                int i211 = i210 ^ 119;
                int i212 = -(-((i210 & 119) << 1));
                i2 = ((i211 | i212) << 1) - (i212 ^ i211);
                i3 = i2 % 128;
                p = i3;
                if (i2 % 2 != 0) {
                    this.t = null;
                    this.u = -1;
                    throw null;
                }
                this.t = null;
                this.u = -1;
                i4 = ((i3 & 85) - (~(i3 | 85))) - 1;
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    int i213 = 5 / 5;
                }
            }
        }
        setContentView(R.layout.activity_barcode_scanner);
        View viewFindViewById = findViewById(R.id.toolbar);
        int i30 = p;
        int i31 = i30 & 9;
        int i32 = ((i30 | 9) & (~i31)) + (i31 << 1);
        q = i32 % 128;
        int i33 = i32 % 2;
        m().t((Toolbar) viewFindViewById);
        int i34 = q;
        int i35 = i34 & 9;
        int i36 = (i34 | 9) & (~i35);
        int i37 = -(-(i35 << 1));
        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
        p = i38 % 128;
        if (i38 % 2 == 0) {
            j().q(BuildConfig.FLAVOR);
            j();
            obj.hashCode();
            throw null;
        }
        j().q(BuildConfig.FLAVOR);
        j().p(false);
        ImageView imageView = (ImageView) findViewById(R.id.ivBack);
        OooO00o oooO00o = new OooO00o();
        int i39 = p;
        int i40 = i39 ^ 25;
        int i41 = -(-((i39 & 25) << 1));
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        q = i42 % 128;
        int i43 = i42 % 2;
        imageView.setOnClickListener(oooO00o);
        if (i43 != 0) {
            throw null;
        }
        int i44 = q;
        int i45 = (i44 & 89) + (i44 | 89);
        p = i45 % 128;
        int i46 = i45 % 2;
    }
}
