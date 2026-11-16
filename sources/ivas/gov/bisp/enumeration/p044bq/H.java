package ivas.gov.bisp.enumeration.p044bq;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.de.j;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offlinesurvey;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class H extends AsyncTask<Void, Void, Void> {
    private static int a = 1;
    private static int b;
    public String c;
    public Context d;
    public h e;
    public SessionManager f;

    public H(String str, Context context, h hVar) {
        this.c = str;
        this.d = context;
        this.e = hVar;
        this.f = new SessionManager(context);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r9) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i3 - (~(-(-((i2 ^ 25) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        super.onPostExecute(r9);
        int i6 = b;
        int i7 = (((i6 & (-124)) | ((~i6) & 123)) - (~(-(-((i6 & 123) << 1))))) - 1;
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        j jVar = (j) this.f.h(this.d);
        int i8 = b + 73;
        a = i8 % 128;
        int i9 = i8 % 2;
        int i10 = jVar.getInt("survey_count", 0);
        SessionManager sessionManager = this.f;
        int i11 = a;
        int i12 = (i11 & 76) + (i11 | 76);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            ((j) sessionManager.h(this.d)).edit();
            obj.hashCode();
            throw null;
        }
        j.bJI bji = (j.bJI) ((j) sessionManager.h(this.d)).edit();
        int i14 = i10 & 1;
        bji.putInt("survey_count", i14 + ((i10 ^ 1) | i14));
        int i15 = a + 117;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            bji.apply();
            throw null;
        }
        bji.apply();
        h hVar = this.e;
        int i16 = a;
        int i17 = (i16 | 31) << 1;
        int i18 = -(((~i16) & 31) | (i16 & (-32)));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            hVar.aJ(false, "Survey locally saved successfully");
        } else {
            hVar.aJ(true, "Survey locally saved successfully");
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0181 A[Catch: Exception -> 0x01b3, TRY_LEAVE, TryCatch #7 {Exception -> 0x01b3, blocks: (B:15:0x00e6, B:17:0x0112, B:20:0x0126, B:23:0x0137, B:25:0x013a, B:28:0x016f, B:30:0x0175, B:37:0x0181, B:35:0x017b), top: B:119:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0239 A[Catch: Exception -> 0x026f, TRY_LEAVE, TryCatch #1 {Exception -> 0x026f, blocks: (B:44:0x01bd, B:47:0x01d8, B:49:0x01de, B:52:0x01f5, B:54:0x01f8, B:57:0x0227, B:59:0x022d, B:66:0x0239, B:64:0x0233, B:69:0x0266, B:70:0x0269, B:71:0x026c), top: B:109:0x01bd }] */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        AppDatabase appDatabaseL;
        long j;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 84) << 1) - (i4 ^ 84);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            appDatabaseL = AppDatabase.l(this.d);
            int i7 = 36 / 0;
        } else {
            appDatabaseL = AppDatabase.l(this.d);
        }
        appDatabaseL.m().br(new offlinesurvey(new Date().getTime(), this.c));
        ArrayList arrayList = new ArrayList(appDatabaseL.m().W());
        int i8 = a;
        int i9 = ((i8 | 59) << 1) - (i8 ^ 59);
        b = i9 % 128;
        int i10 = i9 % 2;
        if (arrayList.size() > 0) {
            int i11 = a + 53;
            b = i11 % 128;
            int i12 = i11 % 2;
            offline_survey_count offline_survey_countVar = (offline_survey_count) arrayList.get(0);
            h hVarM = appDatabaseL.m();
            int i13 = a;
            int i14 = ((i13 & 54) + (i13 | 54)) - 1;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                j = offline_survey_countVar.id;
                i = offline_survey_countVar.sync_count;
                i2 = offline_survey_countVar.not_sync_count;
                int i15 = 90 / 0;
            } else {
                j = offline_survey_countVar.id;
                i = offline_survey_countVar.sync_count;
                i2 = offline_survey_countVar.not_sync_count;
            }
            int i16 = i2 & 1;
            hVarM.aQ(j, i, ((((i2 ^ 1) | i16) << 1) - (~(-((i2 | 1) & (~i16))))) - 1);
            int i17 = a + 89;
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            h hVarM2 = appDatabaseL.m();
            offline_survey_count offline_survey_countVar2 = new offline_survey_count(new Date().getTime(), 0, 1);
            int i19 = a;
            int i20 = i19 & 103;
            int i21 = (i20 - (~((i19 ^ 103) | i20))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
            hVarM2.bs(offline_survey_countVar2);
            int i23 = b;
            int i24 = i23 & 19;
            int i25 = i24 + ((i23 ^ 19) | i24);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append("/Pictures");
            File file = new File(sb.toString());
            int i27 = b;
            int i28 = ((i27 & 36) + (i27 | 36)) - 1;
            a = i28 % 128;
            int i29 = i28 % 2;
            if (file.isDirectory()) {
                int i30 = a;
                int i31 = (((i30 | 30) << 1) - (i30 ^ 30)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                String[] list = file.list();
                if (list.length > 0) {
                    int i33 = a + 27;
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 0;
                    while (i35 < list.length) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file.toString());
                        sb2.append("/");
                        sb2.append(list[i35]);
                        File file2 = new File(sb2.toString());
                        int i36 = a;
                        int i37 = (i36 & (-8)) | ((~i36) & 7);
                        int i38 = -(-((i36 & 7) << 1));
                        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                        b = i39 % 128;
                        if (i39 % 2 != 0) {
                            int i40 = 39 / 0;
                            if (file2.exists()) {
                                file2.delete();
                                int i41 = b;
                                int i42 = i41 & 7;
                                int i43 = i42 + ((i41 ^ 7) | i42);
                                a = i43 % 128;
                                int i44 = i43 % 2;
                            }
                        } else if (file2.exists()) {
                            file2.delete();
                            int i45 = b;
                            int i46 = i45 & 7;
                            int i47 = i46 + ((i45 ^ 7) | i46);
                            a = i47 % 128;
                            int i48 = i47 % 2;
                        }
                        int i49 = i35 & 1;
                        int i50 = -(-((i35 ^ 1) | i49));
                        i35 = ((i49 | i50) << 1) - (i50 ^ i49);
                        int i51 = b;
                        int i52 = i51 & 57;
                        int i53 = i51 | 57;
                        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                        a = i54 % 128;
                        if (i54 % 2 == 0) {
                            int i55 = 3 / 4;
                        }
                    }
                }
            }
        } catch (Exception unused) {
            Toast.makeText(this.d, "Error Has Been occurs..!", 0).show();
        }
        Object obj = null;
        try {
            File externalFilesDir = this.d.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            int i56 = a;
            int i57 = i56 & 41;
            int i58 = (i57 - (~(-(-((i56 ^ 41) | i57))))) - 1;
            b = i58 % 128;
            if (i58 % 2 != 0) {
                externalFilesDir.isDirectory();
                obj.hashCode();
                throw null;
            }
            if (externalFilesDir.isDirectory()) {
                String[] list2 = externalFilesDir.list();
                if (list2.length > 0) {
                    int i59 = a;
                    int i60 = ((i59 ^ 10) + ((i59 & 10) << 1)) - 1;
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = 0;
                    while (i62 < list2.length) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(externalFilesDir.toString());
                        sb3.append("/");
                        sb3.append(list2[i62]);
                        File file3 = new File(sb3.toString());
                        int i63 = a;
                        int i64 = i63 & 1;
                        int i65 = (i63 ^ 1) | i64;
                        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                        b = i66 % 128;
                        if (i66 % 2 != 0) {
                            int i67 = 65 / 0;
                            if (file3.exists()) {
                                file3.delete();
                                int i68 = a;
                                int i69 = (((i68 | 52) << 1) - (i68 ^ 52)) - 1;
                                b = i69 % 128;
                                int i70 = i69 % 2;
                            }
                        } else if (file3.exists()) {
                            file3.delete();
                            int i610 = a;
                            int i611 = (((i610 | 52) << 1) - (i610 ^ 52)) - 1;
                            b = i611 % 128;
                            int i71 = i611 % 2;
                        }
                        int i72 = ((i62 | 68) << 1) - (i62 ^ 68);
                        i62 = ((i72 ^ (-67)) - (~((i72 & (-67)) << 1))) - 1;
                        int i73 = (-2) - ((b + 62) ^ (-1));
                        a = i73 % 128;
                        int i74 = i73 % 2;
                    }
                }
            }
            try {
                File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                int i75 = a;
                int i76 = (i75 & 117) + (i75 | 117);
                b = i76 % 128;
                if (i76 % 2 != 0) {
                    file4.isDirectory();
                    throw null;
                }
                if (file4.isDirectory()) {
                    String[] list3 = file4.list();
                    if (list3.length > 0) {
                        int i77 = a;
                        int i78 = i77 & 29;
                        int i79 = (i77 | 29) & (~i78);
                        int i80 = i78 << 1;
                        int i81 = (i79 & i80) + (i79 | i80);
                        int i82 = i81 % 128;
                        b = i82;
                        int i83 = i81 % 2;
                        int i84 = i82 + 115;
                        a = i84 % 128;
                        int i85 = i84 % 2;
                        int i86 = 0;
                        while (i86 < list3.length) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(file4.toString());
                            sb4.append("/");
                            sb4.append(list3[i86]);
                            File file5 = new File(sb4.toString());
                            int i87 = a + 46;
                            int i88 = (i87 ^ (-1)) + (i87 << 1);
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            if (file5.exists()) {
                                int i90 = a;
                                int i91 = (-2) - ((((i90 | 48) << 1) - (i90 ^ 48)) ^ (-1));
                                b = i91 % 128;
                                if (i91 % 2 != 0) {
                                    file5.delete();
                                    int i92 = 59 / 0;
                                } else {
                                    file5.delete();
                                }
                                int i93 = b;
                                int i94 = i93 ^ 33;
                                int i95 = (i93 & 33) << 1;
                                int i96 = (i94 & i95) + (i95 | i94);
                                a = i96 % 128;
                                int i97 = i96 % 2;
                            }
                            i86++;
                            int i98 = b;
                            int i99 = (((i98 & (-4)) | ((~i98) & 3)) - (~((i98 & 3) << 1))) - 1;
                            a = i99 % 128;
                            int i100 = i99 % 2;
                        }
                    }
                }
                int i101 = b + 69;
                a = i101 % 128;
                int i102 = i101 % 2;
                return null;
            } catch (Exception unused2) {
                Toast.makeText(this.d, "Error Has Been occurs..!", 0).show();
            }
        } catch (Exception unused3) {
            Toast.makeText(this.d, "Error Has Been occurs..!", 0).show();
        }
    }
}
