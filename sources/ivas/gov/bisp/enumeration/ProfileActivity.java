package ivas.gov.bisp.enumeration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.PersonInfo;
import ivas.gov.bisp.enumeration.p026az.P;
import ivas.gov.bisp.enumeration.p026az.l;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ProfileActivity extends BaseActivity {
    private static int p = 1;
    private static int q;
    public byte[] af;
    public String ag = BuildConfig.FLAVOR;
    public ProgressDialog ah;

    @BindView
    public EditText et_cnic;

    @BindView
    public EditText et_contact;

    @BindView
    public EditText et_name;

    @BindView
    public ImageView imageButtonSurveyor;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 119;
        int i4 = ((i2 ^ 119) | i3) << 1;
        int i5 = -((i2 | 119) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        p = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 37;
        q = i9 % 128;
        if (i9 % 2 == 0) {
            return R.layout.activity_profile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @OnClick
    public void onImageClick(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        q = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.af == null) {
            startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 1);
            int i5 = p;
            int i6 = i5 ^ 43;
            int i7 = ((((i5 & 43) | i6) << 1) - (~(-i6))) - 1;
            q = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        try {
            P pE = P.e();
            AppCompatActivity appCompatActivity = this.ae;
            Bitmap bitmapG = P.e().g(this.af);
            int i8 = q;
            int i9 = ((((i8 ^ 45) | (i8 & 45)) << 1) - (~(-(((~i8) & 45) | (i8 & (-46)))))) - 1;
            p = i9 % 128;
            int i10 = i9 % 2;
            pE.h(appCompatActivity, bitmapG, "Picture");
            int i11 = p + 87;
            q = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap.CompressFormat compressFormat;
        int i3 = 2 % 2;
        int i4 = p;
        int i5 = i4 & 105;
        int i6 = (((i4 | 105) & (~i5)) - (~(i5 << 1))) - 1;
        q = i6 % 128;
        if (i6 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            int i7 = q;
            int i8 = i7 & 57;
            int i9 = (i7 ^ 57) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            p = i10 % 128;
            int i11 = i10 % 2;
            Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
            Objects.requireNonNull(P.e());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
            int i12 = q + 23;
            p = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 100;
            bitmap.compress(compressFormat2, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ImageView imageView = this.imageButtonSurveyor;
            int i15 = p + 57;
            q = i15 % 128;
            int i16 = i15 % 2;
            imageView.setImageBitmap(bitmap);
            P.e();
            P.e();
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            Objects.requireNonNull(P.e());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i17 = q + 71;
            p = i17 % 128;
            if (i17 % 2 == 0) {
                compressFormat = Bitmap.CompressFormat.JPEG;
                i14 = 32;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            bitmapDecodeByteArray.compress(compressFormat, i14, byteArrayOutputStream2);
            this.af = byteArrayOutputStream2.toByteArray();
            StringBuilder sbW = j.w("surveyer_");
            String strE = z.e();
            int i18 = p;
            int i19 = (i18 ^ 109) + ((i18 & 109) << 1);
            q = i19 % 128;
            int i20 = i19 % 2;
            sbW.append(strE);
            this.ag = sbW.toString();
            int i21 = p;
            int i22 = (((i21 ^ 107) | (i21 & 107)) << 1) - (((~i21) & 107) | (i21 & (-108)));
            q = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = p;
        int i25 = i24 & 119;
        int i26 = ((i24 | 119) & (~i25)) + (i25 << 1);
        q = i26 % 128;
        int i27 = i26 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0288  */
    @OnClick
    public void onSaveClick(View view) {
        String string;
        EditText editText;
        String str;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 69;
        int i4 = ((i2 & 69) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        p = i6 % 128;
        if (i6 % 2 == 0) {
            string = this.et_name.getText().toString();
            editText = this.et_cnic;
            int i7 = 58 / 0;
        } else {
            string = this.et_name.getText().toString();
            editText = this.et_cnic;
        }
        int i8 = p;
        int i9 = i8 & 69;
        int i10 = -(-((i8 ^ 69) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        q = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            editText.getText().toString();
            this.et_contact.getText().toString();
            obj.hashCode();
            throw null;
        }
        String string2 = editText.getText().toString();
        String string3 = this.et_contact.getText().toString();
        int i12 = p;
        int i13 = i12 & 119;
        int i14 = (i12 | 119) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        q = i16 % 128;
        if (i16 % 2 != 0) {
            string.equals(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        if (!string.equals(BuildConfig.FLAVOR)) {
            if (!string3.equals(BuildConfig.FLAVOR)) {
                int i17 = q;
                int i18 = i17 & 123;
                int i19 = (i18 - (~((i17 ^ 123) | i18))) - 1;
                p = i19 % 128;
                int i20 = i19 % 2;
                if (string3.length() >= 11) {
                    int i21 = q;
                    int i22 = i21 & 47;
                    int i23 = -(-((i21 ^ 47) | i22));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    p = i24 % 128;
                    if (i24 % 2 == 0) {
                        string2.equals(BuildConfig.FLAVOR);
                        throw null;
                    }
                    if (string2.equals(BuildConfig.FLAVOR) || string2.length() < 15) {
                        z.k(this.ae, this.et_name, "CNIC");
                        int i25 = q + 85;
                        p = i25 % 128;
                        if (i25 % 2 == 0) {
                            int i26 = 5 % 2;
                        }
                    } else {
                        int i27 = q;
                        int i28 = i27 & 87;
                        int i29 = (i28 - (~(-(-((i27 ^ 87) | i28))))) - 1;
                        p = i29 % 128;
                        if (i29 % 2 != 0 ? this.ac == 1 : this.ac == 1) {
                            if (this.af != null) {
                                int i30 = p;
                                int i31 = (i30 & (-106)) | ((~i30) & 105);
                                int i32 = -(-((i30 & 105) << 1));
                                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                                q = i33 % 128;
                                int i34 = i33 % 2;
                                if (this.ag.equals(BuildConfig.FLAVOR)) {
                                }
                            }
                            Toast.makeText(this.ae, "Please Take Surveyor Picture", 0).show();
                            int i35 = q;
                            int i36 = i35 & 35;
                            int i37 = ((((i35 ^ 35) | i36) << 1) - (~(-((i35 | 35) & (~i36))))) - 1;
                            p = i37 % 128;
                            int i38 = i37 % 2;
                        }
                        PersonInfo personInfo = (PersonInfo) SugarRecord.findById(PersonInfo.class, (Integer) 1);
                        if (this.ad) {
                            personInfo = new PersonInfo();
                            int i39 = p;
                            int i40 = (i39 & 21) + (i39 | 21);
                            q = i40 % 128;
                            int i41 = i40 % 2;
                        }
                        personInfo.name = string;
                        personInfo.contact = string3;
                        personInfo.cnic = string2;
                        int i42 = p;
                        int i43 = (i42 & (-40)) | ((~i42) & 39);
                        int i44 = (i42 & 39) << 1;
                        int i45 = (i43 & i44) + (i44 | i43);
                        q = i45 % 128;
                        int i46 = i45 % 2;
                        if (this.ac == 1) {
                            int i47 = q;
                            int i48 = i47 & 111;
                            int i49 = i48 + ((i47 ^ 111) | i48);
                            p = i49 % 128;
                            if (i49 % 2 == 0) {
                                personInfo.pic = this.af;
                                str = this.ag;
                                int i50 = 72 / 0;
                            } else {
                                personInfo.pic = this.af;
                                str = this.ag;
                            }
                            int i51 = p;
                            int i52 = i51 & 93;
                            int i53 = (((i51 ^ 93) | i52) << 1) - ((i51 | 93) & (~i52));
                            q = i53 % 128;
                            int i54 = i53 % 2;
                            personInfo.picName = str;
                            int i55 = (-2) - ((p + 126) ^ (-1));
                            q = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        personInfo.save();
                        int i57 = q;
                        int i58 = ((i57 ^ 23) | (i57 & 23)) << 1;
                        int i59 = -((i57 & (-24)) | ((~i57) & 23));
                        int i60 = (i58 & i59) + (i58 | i59);
                        p = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = (-2) - (((i57 ^ 96) + ((i57 & 96) << 1)) ^ (-1));
                        p = i62 % 128;
                        int i63 = i62 % 2;
                        if (this.ad) {
                            int i64 = q;
                            int i65 = (i64 & 13) + (i64 | 13);
                            p = i65 % 128;
                            if (i65 % 2 == 0) {
                                SharedPreferences.Editor editor = ah.c.e;
                                throw null;
                            }
                            ah ahVar = ah.c;
                            SharedPreferences.Editor editor2 = ahVar.e;
                            int i66 = q;
                            int i67 = ((i66 & 49) - (~(i66 | 49))) - 1;
                            p = i67 % 128;
                            int i68 = i67 % 2;
                            editor2.putBoolean("firstTimeUser", false);
                            SharedPreferences.Editor editor3 = ahVar.e;
                            int i69 = q;
                            int i70 = ((i69 | 29) << 1) - (i69 ^ 29);
                            p = i70 % 128;
                            int i71 = i70 % 2;
                            editor3.commit();
                            if (this.ac == 1) {
                                Intent intent = new Intent(this.ae, (Class<?>) ActivityEnumeratorMain.class);
                                int i72 = q;
                                int i73 = i72 & 55;
                                int i74 = (i72 | 55) & (~i73);
                                int i75 = i73 << 1;
                                int i76 = (i74 & i75) + (i74 | i75);
                                p = i76 % 128;
                                if (i76 % 2 == 0) {
                                    startActivity(intent);
                                    int i77 = 15 / 0;
                                } else {
                                    startActivity(intent);
                                }
                            }
                        }
                        finish();
                        int i78 = q + 88;
                        int i79 = (i78 ^ (-1)) + (i78 << 1);
                        p = i79 % 128;
                        int i80 = i79 % 2;
                    }
                } else {
                    z.k(this.ae, this.et_name, "Contact Number");
                    int i81 = q;
                    int i82 = (i81 & 45) + (i81 | 45);
                    p = i82 % 128;
                    int i83 = i82 % 2;
                }
            } else {
                z.k(this.ae, this.et_name, "Contact Number");
                int i84 = q;
                int i85 = (i84 & 45) + (i84 | 45);
                p = i85 % 128;
                int i86 = i85 % 2;
            }
            int i87 = p;
            int i88 = (i87 | 105) << 1;
            int i89 = -(((~i87) & 105) | (i87 & (-106)));
            int i90 = (i88 & i89) + (i89 | i88);
            q = i90 % 128;
            int i91 = i90 % 2;
        }
        int i92 = p;
        int i93 = (i92 & 83) + (i92 | 83);
        q = i93 % 128;
        int i94 = i93 % 2;
        z.k(this.ae, this.et_name, "Name");
        int i95 = q;
        int i96 = ((i95 ^ 105) - (~(-(-((i95 & 105) << 1))))) - 1;
        p = i96 % 128;
        if (i96 % 2 == 0) {
            int i97 = 2 / 5;
        }
        int i98 = q + 117;
        p = i98 % 128;
        int i99 = i98 % 2;
        int i810 = p;
        int i811 = (i810 | 105) << 1;
        int i812 = -(((~i810) & 105) | (i810 & (-106)));
        int i910 = (i811 & i812) + (i812 | i811);
        q = i910 % 128;
        int i911 = i910 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        ImageView imageView;
        int i;
        PersonInfo personInfo;
        int i2 = 2 % 2;
        super.t();
        ProgressDialog progressDialog = new ProgressDialog(this);
        int i3 = q + 81;
        p = i3 % 128;
        int i4 = i3 % 2;
        this.ah = progressDialog;
        progressDialog.setMessage("Saving...");
        this.ah.setCancelable(false);
        EditText editText = this.et_cnic;
        l lVar = new l(editText);
        int i5 = q;
        int i6 = (((i5 | 33) << 1) - (~(-(((~i5) & 33) | (i5 & (-34)))))) - 1;
        p = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            editText.addTextChangedListener(lVar);
            boolean z = this.ad;
            obj.hashCode();
            throw null;
        }
        editText.addTextChangedListener(lVar);
        if (!this.ad && (personInfo = (PersonInfo) SugarRecord.first(PersonInfo.class)) != null) {
            int i7 = p;
            int i8 = i7 & 1;
            int i9 = -(-(i7 | 1));
            int i10 = (i8 & i9) + (i9 | i8);
            q = i10 % 128;
            if (i10 % 2 != 0) {
                this.et_name.setText(personInfo.name);
                throw null;
            }
            this.et_name.setText(personInfo.name);
            this.et_cnic.setText(personInfo.cnic);
            int i11 = q;
            int i12 = ((i11 ^ 97) | (i11 & 97)) << 1;
            int i13 = -(((~i11) & 97) | (i11 & (-98)));
            int i14 = (i12 & i13) + (i13 | i12);
            p = i14 % 128;
            if (i14 % 2 == 0) {
                this.et_contact.setText(personInfo.contact);
                obj.hashCode();
                throw null;
            }
            this.et_contact.setText(personInfo.contact);
            int i15 = q;
            int i16 = ((i15 | 59) << 1) - (i15 ^ 59);
            p = i16 % 128;
            int i17 = i16 % 2;
            if (this.ac == 1) {
                int i18 = q;
                int i19 = i18 & 95;
                int i20 = -(-((i18 ^ 95) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                p = i21 % 128;
                int i22 = i21 % 2;
                this.af = personInfo.pic;
                String str = personInfo.picName;
                int i23 = q;
                int i24 = i23 & 123;
                int i25 = ((i23 | 123) & (~i24)) + (i24 << 1);
                p = i25 % 128;
                int i26 = i25 % 2;
                this.ag = str;
                try {
                    try {
                        ImageView imageView2 = this.imageButtonSurveyor;
                        P pE = P.e();
                        int i27 = q;
                        int i28 = i27 & 43;
                        int i29 = ((((i27 ^ 43) | i28) << 1) - (~(-((i27 | 43) & (~i28))))) - 1;
                        p = i29 % 128;
                        if (i29 % 2 == 0) {
                            imageView2.setImageBitmap(pE.g(this.af));
                            obj.hashCode();
                            throw null;
                        }
                        imageView2.setImageBitmap(pE.g(this.af));
                        int i30 = q;
                        int i31 = i30 & 59;
                        int i32 = (((i30 | 59) & (~i31)) - (~(i31 << 1))) - 1;
                        p = i32 % 128;
                        int i33 = i32 % 2;
                    } catch (Exception unused) {
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
        }
        if (this.ac != 1) {
            int i34 = p;
            int i35 = (i34 & 18) + (i34 | 18);
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            q = i36 % 128;
            if (i36 % 2 != 0) {
                imageView = this.imageButtonSurveyor;
                i = 15;
            } else {
                imageView = this.imageButtonSurveyor;
                i = 8;
            }
            imageView.setVisibility(i);
        }
        int i37 = p;
        int i38 = i37 & 101;
        int i39 = ((i37 ^ 101) | i38) << 1;
        int i40 = -((i37 | 101) & (~i38));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        q = i41 % 128;
        if (i41 % 2 != 0) {
            throw null;
        }
    }
}
