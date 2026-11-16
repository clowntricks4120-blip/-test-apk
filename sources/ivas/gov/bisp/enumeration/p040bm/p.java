package ivas.gov.bisp.enumeration.p040bm;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class p extends Dialog {
    private static int a = 0;
    private static int b = 1;
    public TextView c;
    public Activity d;
    public Dialog e;
    public String f;
    public String g;
    public String h;
    public String i;
    public TextView j;
    public TextView k;

    public class bph implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public bph() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            p pVar = p.this;
            Dialog dialog = new Dialog(p.this.d.getApplicationContext());
            int i2 = a;
            int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)));
            b = i3 % 128;
            if (i3 % 2 != 0) {
                pVar.e = dialog;
                p.this.e.dismiss();
                int i4 = 32 / 0;
            } else {
                pVar.e = dialog;
                p.this.e.dismiss();
            }
            int i5 = a;
            int i6 = i5 ^ 17;
            int i7 = (((i5 & 17) | i6) << 1) - i6;
            b = i7 % 128;
            int i8 = i7 % 2;
            p.this.e.hide();
            p.this.dismiss();
            int i9 = b;
            int i10 = i9 & 23;
            int i11 = -(-((i9 ^ 23) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public p(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        super(activity);
        this.d = activity;
        this.f = str2;
        this.g = str3;
        this.i = str5;
        this.h = str;
        new SessionManager(activity);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        TextView textView;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
        int i4 = -(((~i2) & 97) | (i2 & (-98)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.custom_hh_secttion_dialog_box);
        int i7 = b;
        int i8 = (i7 & (-84)) | ((~i7) & 83);
        int i9 = (i7 & 83) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.j = (TextView) findViewById(R.id.txtbtnok);
        int i12 = b + 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        this.c = (TextView) findViewById(R.id.txtbtnno);
        int i14 = a;
        int i15 = i14 & 63;
        int i16 = (((i14 | 63) & (~i15)) - (~(i15 << 1))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        this.k = (TextView) findViewById(R.id.message);
        View viewFindViewById = findViewById(R.id.alert_message);
        int i18 = a;
        int i19 = i18 & 97;
        int i20 = -(-((i18 ^ 97) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            ((TextView) viewFindViewById).setText(this.h);
            textView = this.k;
            int i22 = 34 / 0;
        } else {
            ((TextView) viewFindViewById).setText(this.h);
            textView = this.k;
        }
        textView.setText(this.f);
        this.j.setOnClickListener(new bpg());
        TextView textView2 = this.c;
        bph bphVar = new bph();
        int i23 = b;
        int i24 = (i23 ^ 7) + ((i23 & 7) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        textView2.setOnClickListener(bphVar);
        int i26 = b;
        int i27 = i26 & 121;
        int i28 = (i26 ^ 121) | i27;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
    }

    public class bpg implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public bpg() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0081  */
        /* JADX WARN: Code duplicated, block: B:13:0x009c  */
        /* JADX WARN: Code duplicated, block: B:28:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:30:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:31:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:34:0x020b  */
        /* JADX WARN: Code duplicated, block: B:35:0x020e  */
        /* JADX WARN: Code duplicated, block: B:38:0x0272  */
        /* JADX WARN: Code duplicated, block: B:39:0x0282  */
        /* JADX WARN: Code duplicated, block: B:42:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:44:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:46:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0079  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int size;
            int i;
            int i2;
            Intent intent;
            int i3;
            p pVar;
            int i4;
            int i5;
            Object obj;
            int i6;
            int i7;
            int i8 = 2 % 2;
            p pVar2 = p.this;
            Objects.requireNonNull(pVar2);
            ArrayList arrayList = new ArrayList();
            Roster roster = new Roster();
            String str = pVar2.g;
            int i9 = a + 92;
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            roster.cnic_valid_name = str;
            roster.cnic_valid = Boolean.TRUE;
            int i12 = a;
            int i13 = (i12 ^ 65) + ((i12 & 65) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            String string = BuildConfig.FLAVOR;
            roster.name_of_member = BuildConfig.FLAVOR;
            roster.relation_to_household_id = 186;
            int i15 = b;
            int i16 = i15 & 45;
            int i17 = ((i15 ^ 45) | i16) << 1;
            int i18 = -((i15 | 45) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            Object obj2 = null;
            if (i19 % 2 == 0) {
                roster.cnicOption = 5;
                if (pVar2.i.length() == 112) {
                    if (!pVar2.i.endsWith("-")) {
                        int i20 = b;
                        int i21 = (((i20 & (-12)) | ((~i20) & 11)) - (~((i20 & 11) << 1))) - 1;
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        if (!pVar2.i.contains("-")) {
                            StringBuilder sb = new StringBuilder();
                            String str2 = pVar2.i;
                            int i23 = b;
                            int i24 = i23 & 91;
                            int i25 = i24 + ((i23 ^ 91) | i24);
                            a = i25 % 128;
                            int i26 = i25 % 2;
                            sb.append(str2.substring(0, 5));
                            sb.append("-");
                            int i27 = a;
                            int i28 = (((i27 ^ 19) | (i27 & 19)) << 1) - ((19 & (~i27)) | (i27 & (-20)));
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            sb.append(pVar2.i.substring(5, 12));
                            int i30 = b;
                            int i31 = (i30 ^ 49) + ((i30 & 49) << 1);
                            a = i31 % 128;
                            int i32 = i31 % 2;
                            sb.append("-");
                            String strSubstring = pVar2.i.substring(12);
                            int i33 = a;
                            int i34 = (i33 & 126) + (i33 | 126);
                            int i35 = (i34 ^ (-1)) + (i34 << 1);
                            b = i35 % 128;
                            int i36 = i35 % 2;
                            sb.append(strSubstring);
                            string = sb.toString();
                            int i37 = a;
                            int i38 = ((i37 & (-64)) | ((~i37) & 63)) + ((i37 & 63) << 1);
                            b = i38 % 128;
                            int i39 = i38 % 2;
                        }
                    }
                }
                roster.cnic = string;
                roster.cnicRepeat = string;
                size = arrayList.size();
                i = b;
                int i40 = (-2) - ((((i | 104) << 1) - (i ^ 104)) ^ (-1));
                a = i40 % 128;
                int i41 = i40 % 2;
                if (size != 0) {
                    int i42 = i ^ 109;
                    int i43 = (i & 109) << 1;
                    int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    int size2 = arrayList.size();
                    int i46 = size2 ^ (-1);
                    obj = arrayList.get(((size2 | i46) << 1) - i46);
                    int i47 = a;
                    int i48 = i47 & 121;
                    int i49 = ((i47 ^ 121) | i48) << 1;
                    int i50 = -((i47 | 121) & (~i48));
                    i6 = ((i49 | i50) << 1) - (i50 ^ i49);
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        i2 = 1 >> ((Roster) obj).roster_relational_id;
                    } else {
                        int i51 = -(-((Roster) obj).roster_relational_id);
                        int i52 = i51 ^ 1;
                        int i53 = (i51 & 1) << 1;
                        i2 = ((i53 & i52) << 1) + (i52 ^ i53);
                    }
                    int i54 = a;
                    i7 = ((i54 & 118) + (i54 | 118)) - 1;
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i55 = 3 % 3;
                    }
                } else {
                    i2 = 1;
                }
                roster.roster_relational_id = i2;
                roster.rosterUniqueId = UUID.randomUUID().toString();
                String strE = z.e();
                int i56 = b;
                int i57 = i56 & 43;
                int i58 = ((i56 | 43) & (~i57)) + (i57 << 1);
                a = i58 % 128;
                int i59 = i58 % 2;
                roster.start = strE;
                String strE2 = z.e();
                roster.end = strE2;
                int i60 = a;
                int i61 = ((i60 ^ 41) | (i60 & 41)) << 1;
                int i62 = -(((~i60) & 41) | (i60 & (-42)));
                int i63 = (i61 & i62) + (i62 | i61);
                b = i63 % 128;
                int i64 = i63 % 2;
                roster.diff = ac.f(roster.start, strE2);
                arrayList.add(roster);
                intent = new Intent();
                intent.putExtra("roster", arrayList);
                int i65 = a;
                int i66 = i65 & 51;
                i3 = i66 + ((i65 ^ 51) | i66);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    pVar2.d.setResult(-1, intent);
                    pVar2.d.finish();
                    pVar = p.this;
                    int i67 = 17 / 0;
                } else {
                    pVar2.d.setResult(-1, intent);
                    pVar2.d.finish();
                    pVar = p.this;
                }
                pVar.e = new Dialog(p.this.d.getApplicationContext());
                i4 = a + 59;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    p.this.e.dismiss();
                    p.this.e.hide();
                    throw null;
                }
                p.this.e.dismiss();
                p.this.e.hide();
                p.this.dismiss();
                int i68 = b;
                int i69 = (i68 | 97) << 1;
                int i70 = -(((~i68) & 97) | (i68 & (-98)));
                i5 = (i69 ^ i70) + ((i70 & i69) << 1);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i71 = 37 / 0;
                }
            }
            roster.cnicOption = 2;
            if (pVar2.i.length() == 13) {
                if (!pVar2.i.endsWith("-")) {
                    int i210 = b;
                    int i211 = (((i210 & (-12)) | ((~i210) & 11)) - (~((i210 & 11) << 1))) - 1;
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    if (!pVar2.i.contains("-")) {
                        StringBuilder sb2 = new StringBuilder();
                        String str3 = pVar2.i;
                        int i213 = b;
                        int i214 = i213 & 91;
                        int i215 = i214 + ((i213 ^ 91) | i214);
                        a = i215 % 128;
                        int i216 = i215 % 2;
                        sb2.append(str3.substring(0, 5));
                        sb2.append("-");
                        int i217 = a;
                        int i218 = (((i217 ^ 19) | (i217 & 19)) << 1) - ((19 & (~i217)) | (i217 & (-20)));
                        b = i218 % 128;
                        int i219 = i218 % 2;
                        sb2.append(pVar2.i.substring(5, 12));
                        int i310 = b;
                        int i311 = (i310 ^ 49) + ((i310 & 49) << 1);
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        sb2.append("-");
                        String strSubstring2 = pVar2.i.substring(12);
                        int i313 = a;
                        int i314 = (i313 & 126) + (i313 | 126);
                        int i315 = (i314 ^ (-1)) + (i314 << 1);
                        b = i315 % 128;
                        int i316 = i315 % 2;
                        sb2.append(strSubstring2);
                        string = sb2.toString();
                        int i317 = a;
                        int i318 = ((i317 & (-64)) | ((~i317) & 63)) + ((i317 & 63) << 1);
                        b = i318 % 128;
                        int i319 = i318 % 2;
                    }
                }
            }
            roster.cnic = string;
            roster.cnicRepeat = string;
            size = arrayList.size();
            i = b;
            int i410 = (-2) - ((((i | 104) << 1) - (i ^ 104)) ^ (-1));
            a = i410 % 128;
            int i411 = i410 % 2;
            if (size != 0) {
                int i412 = i ^ 109;
                int i413 = (i & 109) << 1;
                int i414 = (i412 ^ i413) + ((i412 & i413) << 1);
                a = i414 % 128;
                int i415 = i414 % 2;
                int size3 = arrayList.size();
                int i416 = size3 ^ (-1);
                obj = arrayList.get(((size3 | i416) << 1) - i416);
                int i417 = a;
                int i418 = i417 & 121;
                int i419 = ((i417 ^ 121) | i418) << 1;
                int i510 = -((i417 | 121) & (~i418));
                i6 = ((i419 | i510) << 1) - (i510 ^ i419);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = 1 >> ((Roster) obj).roster_relational_id;
                } else {
                    int i511 = -(-((Roster) obj).roster_relational_id);
                    int i512 = i511 ^ 1;
                    int i513 = (i511 & 1) << 1;
                    i2 = ((i513 & i512) << 1) + (i512 ^ i513);
                }
                int i514 = a;
                i7 = ((i514 & 118) + (i514 | 118)) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i515 = 3 % 3;
                }
            } else {
                i2 = 1;
            }
            roster.roster_relational_id = i2;
            roster.rosterUniqueId = UUID.randomUUID().toString();
            String strE3 = z.e();
            int i516 = b;
            int i517 = i516 & 43;
            int i518 = ((i516 | 43) & (~i517)) + (i517 << 1);
            a = i518 % 128;
            int i519 = i518 % 2;
            roster.start = strE3;
            String strE4 = z.e();
            roster.end = strE4;
            int i610 = a;
            int i611 = ((i610 ^ 41) | (i610 & 41)) << 1;
            int i612 = -(((~i610) & 41) | (i610 & (-42)));
            int i613 = (i611 & i612) + (i612 | i611);
            b = i613 % 128;
            int i614 = i613 % 2;
            roster.diff = ac.f(roster.start, strE4);
            arrayList.add(roster);
            intent = new Intent();
            intent.putExtra("roster", arrayList);
            int i615 = a;
            int i616 = i615 & 51;
            i3 = i616 + ((i615 ^ 51) | i616);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                pVar2.d.setResult(-1, intent);
                pVar2.d.finish();
                pVar = p.this;
                int i617 = 17 / 0;
            } else {
                pVar2.d.setResult(-1, intent);
                pVar2.d.finish();
                pVar = p.this;
            }
            pVar.e = new Dialog(p.this.d.getApplicationContext());
            i4 = a + 59;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                p.this.e.dismiss();
                p.this.e.hide();
                throw null;
            }
            p.this.e.dismiss();
            p.this.e.hide();
            p.this.dismiss();
            int i618 = b;
            int i619 = (i618 | 97) << 1;
            int i72 = -(((~i618) & 97) | (i618 & (-98)));
            i5 = (i619 ^ i72) + ((i72 & i619) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i73 = 37 / 0;
            }
            if (pVar2.i.length() == 6) {
                int i74 = a;
                int i75 = (i74 ^ 122) + ((i74 & 122) << 1);
                int i76 = (i75 ^ (-1)) + (i75 << 1);
                b = i76 % 128;
                if (i76 % 2 != 0) {
                    pVar2.i.endsWith("-");
                    obj2.hashCode();
                    throw null;
                }
                if (!pVar2.i.endsWith("-")) {
                    StringBuilder sb3 = new StringBuilder();
                    String str4 = pVar2.i;
                    int i77 = a;
                    int i78 = i77 & 65;
                    int i79 = i77 | 65;
                    int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    sb3.append(str4.substring(0, 5));
                    sb3.append("-");
                    int i82 = a + 87;
                    b = i82 % 128;
                    int i83 = i82 % 2;
                    sb3.append(pVar2.i.substring(5));
                    int i84 = a;
                    int i85 = ((i84 ^ 12) + ((12 & i84) << 1)) - 1;
                    b = i85 % 128;
                    if (i85 % 2 != 0) {
                        string = sb3.toString();
                        int i86 = 12 / 0;
                    } else {
                        string = sb3.toString();
                    }
                }
            }
            roster.cnic = string;
            roster.cnicRepeat = string;
            size = arrayList.size();
            i = b;
            int i4110 = (-2) - ((((i | 104) << 1) - (i ^ 104)) ^ (-1));
            a = i4110 % 128;
            int i4111 = i4110 % 2;
            if (size != 0) {
                int i4112 = i ^ 109;
                int i4113 = (i & 109) << 1;
                int i4114 = (i4112 ^ i4113) + ((i4112 & i4113) << 1);
                a = i4114 % 128;
                int i4115 = i4114 % 2;
                int size4 = arrayList.size();
                int i4116 = size4 ^ (-1);
                obj = arrayList.get(((size4 | i4116) << 1) - i4116);
                int i4117 = a;
                int i4118 = i4117 & 121;
                int i4119 = ((i4117 ^ 121) | i4118) << 1;
                int i5110 = -((i4117 | 121) & (~i4118));
                i6 = ((i4119 | i5110) << 1) - (i5110 ^ i4119);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = 1 >> ((Roster) obj).roster_relational_id;
                } else {
                    int i5111 = -(-((Roster) obj).roster_relational_id);
                    int i5112 = i5111 ^ 1;
                    int i5113 = (i5111 & 1) << 1;
                    i2 = ((i5113 & i5112) << 1) + (i5112 ^ i5113);
                }
                int i5114 = a;
                i7 = ((i5114 & 118) + (i5114 | 118)) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i5115 = 3 % 3;
                }
            } else {
                i2 = 1;
            }
            roster.roster_relational_id = i2;
            roster.rosterUniqueId = UUID.randomUUID().toString();
            String strE5 = z.e();
            int i5116 = b;
            int i5117 = i5116 & 43;
            int i5118 = ((i5116 | 43) & (~i5117)) + (i5117 << 1);
            a = i5118 % 128;
            int i5119 = i5118 % 2;
            roster.start = strE5;
            String strE6 = z.e();
            roster.end = strE6;
            int i6110 = a;
            int i6111 = ((i6110 ^ 41) | (i6110 & 41)) << 1;
            int i6112 = -(((~i6110) & 41) | (i6110 & (-42)));
            int i6113 = (i6111 & i6112) + (i6112 | i6111);
            b = i6113 % 128;
            int i6114 = i6113 % 2;
            roster.diff = ac.f(roster.start, strE6);
            arrayList.add(roster);
            intent = new Intent();
            intent.putExtra("roster", arrayList);
            int i6115 = a;
            int i6116 = i6115 & 51;
            i3 = i6116 + ((i6115 ^ 51) | i6116);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                pVar2.d.setResult(-1, intent);
                pVar2.d.finish();
                pVar = p.this;
                int i6117 = 17 / 0;
            } else {
                pVar2.d.setResult(-1, intent);
                pVar2.d.finish();
                pVar = p.this;
            }
            pVar.e = new Dialog(p.this.d.getApplicationContext());
            i4 = a + 59;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                p.this.e.dismiss();
                p.this.e.hide();
                throw null;
            }
            p.this.e.dismiss();
            p.this.e.hide();
            p.this.dismiss();
            int i6118 = b;
            int i6119 = (i6118 | 97) << 1;
            int i710 = -(((~i6118) & 97) | (i6118 & (-98)));
            i5 = (i6119 ^ i710) + ((i710 & i6119) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i711 = 37 / 0;
            }
        }
    }
}
