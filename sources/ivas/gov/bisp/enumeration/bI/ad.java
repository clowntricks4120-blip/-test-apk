package ivas.gov.bisp.enumeration.bI;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ad implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity c;

    public ad(OfflineRosterActivity offlineRosterActivity) {
        this.c = offlineRosterActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strU;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = ((i2 | 9) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.bl.hide();
        OfflineRosterActivity offlineRosterActivity = this.c;
        int i6 = b;
        int i7 = ((i6 & (-46)) | ((~i6) & 45)) + ((i6 & 45) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        String strTrim = offlineRosterActivity.et_RosterCNICRepeat.getText().toString().trim();
        int i9 = b;
        int i10 = ((i9 & 88) + (i9 | 88)) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        if (strTrim.replaceAll("-", BuildConfig.FLAVOR).length() <= 0) {
            Toast.makeText(this.c.getApplicationContext(), "Please search", 0).show();
            int i12 = b;
            int i13 = (((i12 & (-44)) | ((~i12) & 43)) - (~((i12 & 43) << 1))) - 1;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        new Date().getTime();
        String externalStorageState = Environment.getExternalStorageState();
        int i14 = a + 5;
        b = i14 % 128;
        int i15 = i14 % 2;
        if (externalStorageState.equals("mounted")) {
            StringBuilder sb = new StringBuilder();
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            int i16 = b;
            int i17 = i16 & 45;
            int i18 = ((i16 ^ 45) | i17) << 1;
            int i19 = -((i16 | 45) & (~i17));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                sb.append(absolutePath);
                strU = j.u(sb, File.separator, "OXiUart1");
                int i21 = 84 / 0;
            } else {
                sb.append(absolutePath);
                strU = j.u(sb, File.separator, "OXiUart1");
            }
            int i22 = b;
            int i23 = ((i22 & (-106)) | ((~i22) & 105)) + ((i22 & 105) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            Context applicationContext = this.c.getApplicationContext();
            int i25 = b + 73;
            a = i25 % 128;
            if (i25 % 2 != 0) {
                sb2.append(applicationContext.getFilesDir().getAbsolutePath());
                String str = File.separator;
                throw null;
            }
            sb2.append(applicationContext.getFilesDir().getAbsolutePath());
            String str2 = File.separator;
            int i26 = b;
            int i27 = i26 ^ 111;
            int i28 = ((i26 & 111) | i27) << 1;
            int i29 = -i27;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            a = i30 % 128;
            int i31 = i30 % 2;
            strU = j.u(sb2, str2, "OXiUart1");
            int i32 = a + 37;
            b = i32 % 128;
            int i33 = i32 % 2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(new Date().getTime());
        sb3.append(".png");
        File file = new File(strU, sb3.toString());
        OfflineRosterActivity offlineRosterActivity2 = this.c;
        Bitmap bitmap = offlineRosterActivity2.bB;
        try {
            File file2 = new File(strU);
            int i34 = b;
            int i35 = ((i34 | 70) << 1) - (i34 ^ 70);
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                file2.exists();
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!file2.exists()) {
                file2.mkdirs();
                int i37 = (-2) - ((a + 82) ^ (-1));
                b = i37 % 128;
                int i38 = i37 % 2;
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            int i39 = b;
            int i40 = i39 & 57;
            int i41 = -(-((i39 ^ 57) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            if (i42 % 2 != 0) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 56, fileOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            Context applicationContext2 = offlineRosterActivity2.getApplicationContext();
            int i43 = b;
            int i44 = (((i43 & (-124)) | ((~i43) & 123)) - (~(-(-((i43 & 123) << 1))))) - 1;
            a = i44 % 128;
            if (i44 % 2 != 0) {
                applicationContext2.getContentResolver();
                file.getAbsolutePath();
                file.getName();
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ContentResolver contentResolver = applicationContext2.getContentResolver();
            String absolutePath2 = file.getAbsolutePath();
            String name = file.getName();
            int i45 = a;
            int i46 = i45 & 113;
            int i47 = -(-((i45 ^ 113) | i46));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            b = i48 % 128;
            int i49 = i48 % 2;
            MediaStore.Images.Media.insertImage(contentResolver, absolutePath2, name, file.getName());
            int i50 = b + 51;
            a = i50 % 128;
            int i51 = i50 % 2;
            Objects.requireNonNull(this.c);
            Context applicationContext3 = this.c.getApplicationContext();
            int i52 = b;
            int i53 = (((i52 | 114) << 1) - (i52 ^ 114)) - 1;
            a = i53 % 128;
            int i54 = i53 % 2;
            Toast.makeText(applicationContext3, "Fingerprint Captured", 1).show();
            OfflineRosterActivity offlineRosterActivity3 = this.c;
            int i55 = a;
            int i56 = (((i55 ^ 31) | (i55 & 31)) << 1) - (((~i55) & 31) | (i55 & (-32)));
            b = i56 % 128;
            if (i56 % 2 == 0) {
                offlineRosterActivity3.vald_txt_view.setText(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            offlineRosterActivity3.vald_txt_view.setText(BuildConfig.FLAVOR);
            int i57 = a;
            int i58 = i57 ^ 51;
            int i59 = -(-((i57 & 51) << 1));
            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
            b = i60 % 128;
            if (i60 % 2 == 0) {
                int i61 = 43 / 0;
            }
        } catch (Exception e) {
            Log.e("saveToExternalStorage()", e.getMessage());
        }
    }
}
