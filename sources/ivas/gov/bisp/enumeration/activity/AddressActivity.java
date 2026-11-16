package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.InterfaceC0028m;
import ivas.gov.bisp.enumeration.W.N;
import ivas.gov.bisp.enumeration.W.O;
import ivas.gov.bisp.enumeration.W.x;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.aA;
import ivas.gov.bisp.enumeration.bK.aD;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.av;
import ivas.gov.bisp.enumeration.bK.aw;
import ivas.gov.bisp.enumeration.bK.ax;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.vilages;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p036bi.C0174c;
import ivas.gov.bisp.enumeration.p036bi.C0176e;
import ivas.gov.bisp.enumeration.p036bi.C0179h;
import ivas.gov.bisp.enumeration.p036bi.C0180i;
import ivas.gov.bisp.enumeration.p036bi.C0181j;
import ivas.gov.bisp.enumeration.p036bi.C0189r;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import net.sqlcipher.BuildConfig;
import o.d;
import o.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AddressActivity extends BaseTouch {
    private static int p = 1;
    private static int q;
    public String aB;
    public ArrayList<String> aD;
    public String aE;
    public String aF;
    public String aG;
    public Spinner aH;
    public ArrayList<String> aJ;
    public ImageView ac;
    public TextView ad;
    public SessionManager ae;
    public ProgressDialog af;
    public ArrayList<province> ag;
    public ArrayList<tehsil> ah;
    public ArrayList<district> ai;
    public ArrayList<uc> aj;
    public ArrayList<vilages> ak;
    public EditText al;
    public EditText am;
    public EditText an;
    public EditText ao;
    public EditText ap;
    public EditText aq;
    public long ar;
    public Spinner as;
    public Spinner at;
    public Spinner au;
    public Spinner av;
    public String aw;
    public String ax;
    public Spinner ay;
    public int az;
    public int aC = 0;
    public int aA = 0;
    public int aI = 0;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0(AddressActivity addressActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a + 67;
            b = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.cancel();
            int i5 = a;
            int i6 = (i5 & (-106)) | ((~i5) & 105);
            int i7 = (i5 & 105) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooOO0O implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0O() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 19;
            int i4 = ((i2 | 19) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 ^ 45) + ((i3 & 45) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i == 0) {
                AddressActivity.this.ay.setBackgroundResource(R.drawable.spinner_bg);
                int i5 = a;
                int i6 = i5 ^ 101;
                int i7 = ((((i5 & 101) | i6) << 1) - (~(-i6))) - 1;
                b = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 2;
                }
            } else {
                AddressActivity.this.ay.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i9 = b;
                int i10 = i9 & 109;
                int i11 = -(-(i9 | 109));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
            Object selectedItem = AddressActivity.this.ay.getSelectedItem();
            int i14 = b;
            int i15 = i14 & 29;
            int i16 = (i14 ^ 29) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            if (!selectedItem.equals("Other")) {
                AddressActivity.this.ap.setVisibility(8);
                int i19 = a;
                int i20 = (i19 & 81) + (i19 | 81);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i21 = b;
            int i22 = i21 & 5;
            int i23 = ((i21 | 5) & (~i22)) + (i22 << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            AddressActivity.this.ap.setVisibility(0);
            int i25 = b;
            int i26 = i25 | 73;
            int i27 = (i26 << 1) - ((~(i25 & 73)) & i26);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DashboardActivity.class);
        int i2 = p;
        int i3 = i2 & 15;
        int i4 = -(-((i2 ^ 15) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        startActivity(intent);
        finish();
        int i7 = q;
        int i8 = i7 & 25;
        int i9 = ((i7 | 25) & (~i8)) + (i8 << 1);
        p = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        StringBuilder sbW;
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            view.getId();
            throw null;
        }
        int id = view.getId();
        if (id != R.id.btn_update) {
            int i4 = q;
            int i5 = ((i4 & (-52)) | ((~i4) & 51)) + ((i4 & 51) << 1);
            p = i5 % 128;
            int i6 = i5 % 2;
            if (id == R.id.iv_back) {
                int i7 = (-2) - (((i4 & 16) + (i4 | 16)) ^ (-1));
                p = i7 % 128;
                if (i7 % 2 != 0) {
                    onBackPressed();
                    return;
                } else {
                    onBackPressed();
                    throw null;
                }
            }
        } else {
            this.ae.p();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            int i8 = p;
            int i9 = ((i8 ^ 103) | (i8 & 103)) << 1;
            int i10 = -(((~i8) & 103) | (i8 & (-104)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            q = i11 % 128;
            if (i11 % 2 != 0) {
                builder.setTitle("Phone Number.!");
                sbW = ivas.gov.bisp.enumeration.p091n.j.w("Please Comfirm your Phone # ");
                int i12 = 85 / 0;
            } else {
                builder.setTitle("Phone Number.!");
                sbW = ivas.gov.bisp.enumeration.p091n.j.w("Please Comfirm your Phone # ");
            }
            int i13 = q;
            int i14 = i13 & 37;
            int i15 = -(-((i13 ^ 37) | i14));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            p = i16 % 128;
            int i17 = i16 % 2;
            sbW.append(this.ao.getText().toString());
            int i18 = p + 119;
            q = i18 % 128;
            int i19 = i18 % 2;
            builder.setMessage(sbW.toString());
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooO00o());
            OooO0O0 oooO0O0 = new OooO0O0(this);
            int i20 = p + 101;
            q = i20 % 128;
            int i21 = i20 % 2;
            builder.setNegativeButton("No", oooO0O0);
            builder.create().show();
            int i22 = p;
            int i23 = (((i22 | 4) << 1) - (i22 ^ 4)) - 1;
            q = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 5 / 5;
            }
        }
        int i25 = p;
        int i26 = (-2) - (((i25 ^ 6) + ((i25 & 6) << 1)) ^ (-1));
        q = i26 % 128;
        int i27 = i26 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 89;
        int i4 = (i2 ^ 89) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        p = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 53;
        int i8 = (i2 ^ 53) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        p = i9 % 128;
        int i10 = i9 % 2;
        return R.layout.activity_address;
    }

    public void u() {
        int i = 2 % 2;
        this.as.setOnItemSelectedListener(new OooO0OO());
        this.at.setOnItemSelectedListener(new OooO0o());
        this.au.setOnItemSelectedListener(new OooO());
        this.av.setOnItemSelectedListener(new OooOO0());
        this.ay.setOnItemSelectedListener(new OooOO0O());
        int i2 = p;
        int i3 = i2 & 99;
        int i4 = i2 | 99;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0OO implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public class OooO00o implements x {
            private static int a = 0;
            private static int b = 1;

            public OooO00o() {
            }

            @Override // ivas.gov.bisp.enumeration.W.x
            public void fillDistList(ArrayList<district> arrayList, ArrayList<String> arrayList2) {
                int i = 2 % 2;
                int i2 = b + 83;
                a = i2 % 128;
                int i3 = i2 % 2;
                AddressActivity addressActivity = AddressActivity.this;
                addressActivity.ai = arrayList;
                int i4 = b;
                int i5 = i4 & 3;
                int i6 = (i5 - (~((i4 ^ 3) | i5))) - 1;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    addressActivity.u();
                } else {
                    addressActivity.u();
                    int i7 = 25 / 0;
                }
            }
        }

        public OooO0OO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = i3 + ((i2 ^ 51) | i3);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
        
            r8.c.ay.setVisibility(55);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
        
            r8.c.ay.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
        
            r10 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a;
            r11 = r10 & 33;
            r10 = -(-((r10 ^ 33) | r11));
            r12 = (r11 ^ r10) + ((r10 & r11) << 1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
        
            if ((r12 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        
            r8.c.as.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
        
            r8.c.as.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
        
            r12 = r8.c;
            r2 = r12.ag.get(r11).province_id;
            r3 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a;
            r4 = (r3 ^ 55) + ((55 & r3) << 1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c1, code lost:
        
            if ((r4 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
        
            r12.aC = r2;
            r10 = r8.c;
            r10.ax = r10.ag.get(r11).province_name;
            r8.c.as.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            r8.c.at.setVisibility(0);
            r3 = r8.c;
            r10 = new ivas.gov.bisp.enumeration.bK.as(r3, r3.ag.get(r11).province_id, r8.c.getResources().getString(ivas.gov.bisp.enumeration.R.string.selectdistrict), r8.c.at, new ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.OooO00o(r8));
            r11 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b;
            r0 = r11 & 91;
            r12 = ((r11 ^ 91) | r0) << 1;
            r11 = -((r11 | 91) & (~r0));
            r0 = (r12 & r11) + (r11 | r12);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0122, code lost:
        
            if ((r0 % 2) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0124, code lost:
        
            r10.execute(new java.lang.Void[1]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x012a, code lost:
        
            r10.execute(new java.lang.Void[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x012f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
        
            r12.aC = r2;
            r9 = r8.c.ag.get(r11);
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x013f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r11 == 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r11 == 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            r8.c.at.setVisibility(8);
            r11 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b;
            r1 = r11 & 27;
            r11 = -(-((r11 ^ 27) | r1));
            r2 = (r1 ^ r11) + ((r11 & r1) << 1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a = r2 % 128;
            r2 = r2 % 2;
            r8.c.au.setVisibility(8);
            r11 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b;
            r1 = r11 ^ 89;
            r11 = ((r11 & 89) | r1) << 1;
            r1 = -r1;
            r2 = ((r11 | r1) << 1) - (r11 ^ r1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a = r2 % 128;
            r2 = r2 % 2;
            r8.c.av.setVisibility(8);
            r11 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.b;
            r1 = r11 & 25;
            r11 = -(-((r11 ^ 25) | r1));
            r2 = (r1 ^ r11) + ((r11 & r1) << 1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
        
            if ((r2 % 2) != 0) goto L11;
         */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemSelected(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0OO.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class OooO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public class OooO00o implements InterfaceC0028m {
            private static int a = 0;
            private static int b = 1;

            public OooO00o() {
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0046  */
            /* JADX WARN: Code duplicated, block: B:12:0x0050  */
            /* JADX WARN: Code duplicated, block: B:9:0x0034  */
            @Override // ivas.gov.bisp.enumeration.W.InterfaceC0028m
            public void fillucList(ArrayList<uc> arrayList, ArrayList<String> arrayList2) {
                int i;
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 ^ 41) - (~(-(-((i3 & 41) << 1))))) - 1;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    AddressActivity.this.aj = arrayList;
                    int i5 = 52 / 0;
                    if (arrayList.size() > 0) {
                        int i6 = a;
                        int i7 = i6 & 1;
                        i = (((i6 | 1) & (~i7)) - (~(i7 << 1))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            AddressActivity.this.av.setVisibility(1);
                        } else {
                            AddressActivity.this.av.setVisibility(0);
                        }
                        AddressActivity.this.u();
                        int i8 = a;
                        int i9 = ((i8 | 65) << 1) - (i8 ^ 65);
                        b = i9 % 128;
                        int i10 = i9 % 2;
                    }
                } else {
                    AddressActivity.this.aj = arrayList;
                    if (arrayList.size() > 0) {
                        int i11 = a;
                        int i12 = i11 & 1;
                        i = (((i11 | 1) & (~i12)) - (~(i12 << 1))) - 1;
                        b = i % 128;
                        if (i % 2 == 0) {
                            AddressActivity.this.av.setVisibility(1);
                        } else {
                            AddressActivity.this.av.setVisibility(0);
                        }
                        AddressActivity.this.u();
                        int i13 = a;
                        int i14 = ((i13 | 65) << 1) - (i13 ^ 65);
                        b = i14 % 128;
                        int i15 = i14 % 2;
                    }
                }
                int i16 = b;
                int i17 = ((i16 | 109) << 1) - (i16 ^ 109);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }

        public OooO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 59;
            int i4 = (i3 - (~(-(-((i2 ^ 59) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 95;
            int i5 = -(-((i3 ^ 95) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (i != 0) {
                AddressActivity.this.au.setBackgroundResource(R.drawable.spinner_bg_selected);
                AddressActivity addressActivity = AddressActivity.this;
                int i9 = b;
                int i10 = ((((i9 ^ 69) | (i9 & 69)) << 1) - (~(-(((~i9) & 69) | (i9 & (-70)))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                addressActivity.aI = addressActivity.ah.get(i).tehsilcode;
                int i12 = b;
                int i13 = (i12 ^ 87) + ((i12 & 87) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                AddressActivity addressActivity2 = AddressActivity.this;
                addressActivity2.aE = addressActivity2.ah.get(i).tehsil;
                AddressActivity addressActivity3 = AddressActivity.this;
                ax axVar = new ax(addressActivity3, addressActivity3.ah.get(i).tehsilcode, AddressActivity.this.getResources().getString(R.string.selectuc), AddressActivity.this.av, new OooO00o());
                axVar.i.execute(new aw(axVar));
                int i15 = b;
                int i16 = i15 & 65;
                int i17 = ((i15 | 65) & (~i16)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
            int i19 = i7 & 119;
            int i20 = (i7 | 119) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 & i21) + (i20 | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            AddressActivity.this.av.setVisibility(8);
            AddressActivity addressActivity4 = AddressActivity.this;
            int i24 = b;
            int i25 = i24 & 103;
            int i26 = (i24 ^ 103) | i25;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            addressActivity4.ay.setVisibility(8);
            Spinner spinner = AddressActivity.this.au;
            int i29 = a;
            int i30 = (i29 & 117) + (i29 | 117);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                spinner.setBackgroundResource(R.drawable.spinner_bg);
                int i31 = 51 / 0;
            } else {
                spinner.setBackgroundResource(R.drawable.spinner_bg);
            }
            int i32 = b;
            int i33 = (i32 ^ 84) + ((i32 & 84) << 1);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            a = i34 % 128;
            int i35 = i34 % 2;
        }
    }

    public class OooOO0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public class OooO00o implements O {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int c = 0;
            private static int[] c$s11$33 = {-1124023427, 1821713687, -1334607842, -422449657, -644527666, 171010031, -1057055028, 607390642, 814234871, 1853400851, -1385756151, -199978911, -944433219, -931569443, -2104901670, 1643065283, -1315896798, 578690938};
            private static int d = 1;
            public final /* synthetic */ int f;

            public OooO00o(int i) {
                this.f = i;
            }

            @Override // ivas.gov.bisp.enumeration.W.O
            public void fillVilagesList(ArrayList<vilages> arrayList, ArrayList<String> arrayList2) {
                int i = 2 % 2;
                int i2 = c + 35;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    AddressActivity.this.ak = arrayList;
                    arrayList.size();
                    throw null;
                }
                AddressActivity.this.ak = arrayList;
                if (arrayList.size() > 0) {
                    int i3 = d + 107;
                    c = i3 % 128;
                    int i4 = i3 % 2;
                    AddressActivity.this.u();
                    return;
                }
                AddressActivity addressActivity = AddressActivity.this;
                int i5 = addressActivity.aj.get(this.f).uccode;
                Spinner spinner = AddressActivity.this.ay;
                addressActivity.af.setTitle("Syncing Data");
                addressActivity.af.setMessage("Please Wait...");
                addressActivity.af.setCancelable(false);
                addressActivity.af.setProgressStyle(0);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("UcID", i5);
                    jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(addressActivity.ae.k()), b.b(addressActivity.ae.m())));
                    byte[] bArrB = b.b(addressActivity.ae.k());
                    byte[] bArrB2 = b.b(addressActivity.ae.m());
                    Object[] objArr = new Object[1];
                    a(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new int[]{1368471910, 453380040, 899959105, -124202176, 1062367986, 1845923821, 1482839524, -386898159, 1506613469, 952322282, 995533834, 231631066}, objArr);
                    jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                    ivas.gov.bisp.enumeration.p024ax.ax.h(addressActivity.af, "Fetching Tokens!");
                    ivas.gov.bisp.enumeration.p024ax.ax.e(jSONObject2, addressActivity, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0174c(addressActivity, spinner));
                    int i6 = d + 45;
                    c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 22 / 0;
                    }
                } catch (JSONException unused) {
                }
            }

            private static void a(int i, int[] iArr, Object[] objArr) {
                d dVar;
                int length;
                int[] iArr2;
                int i2;
                int i3 = 2 % 2;
                d dVar2 = new d();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = c$s11$33;
                if (iArr3 != null) {
                    int i4 = $11 + 15;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        iArr2[i2] = (int) (((long) iArr3[i2]) ^ (-2705551458099060901L));
                        i2++;
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = c$s11$33;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        iArr6[i5] = (int) (((long) iArr5[i5]) ^ (-2705551458099060901L));
                        i5++;
                        dVar2 = dVar2;
                    }
                    dVar = dVar2;
                    iArr5 = iArr6;
                } else {
                    dVar = dVar2;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                d dVar3 = dVar;
                dVar3.a = 0;
                while (dVar3.a < iArr.length) {
                    cArr[0] = (char) (iArr[dVar3.a] >> 16);
                    cArr[1] = (char) iArr[dVar3.a];
                    cArr[2] = (char) (iArr[dVar3.a + 1] >> 16);
                    cArr[3] = (char) iArr[dVar3.a + 1];
                    dVar3.e = (cArr[0] << 16) + cArr[1];
                    dVar3.d = (cArr[2] << 16) + cArr[3];
                    d.b(iArr4);
                    int i6 = $10 + 113;
                    $11 = i6 % 128;
                    int i7 = 2;
                    int i8 = i6 % 2;
                    int i9 = 0;
                    while (i9 < 16) {
                        int i10 = $10 + 41;
                        $11 = i10 % 128;
                        int i11 = i10 % i7;
                        dVar3.e ^= iArr4[i9];
                        dVar3.d = d.c(dVar3.e) ^ dVar3.d;
                        int i12 = dVar3.e;
                        dVar3.e = dVar3.d;
                        dVar3.d = i12;
                        i9++;
                        i7 = 2;
                    }
                    int i13 = dVar3.e;
                    dVar3.e = dVar3.d;
                    dVar3.d = i13;
                    dVar3.d ^= iArr4[16];
                    dVar3.e ^= iArr4[17];
                    int i14 = dVar3.e;
                    int i15 = dVar3.d;
                    cArr[0] = (char) (dVar3.e >>> 16);
                    cArr[1] = (char) dVar3.e;
                    cArr[2] = (char) (dVar3.d >>> 16);
                    cArr[3] = (char) dVar3.d;
                    d.b(iArr4);
                    cArr2[dVar3.a * 2] = cArr[0];
                    cArr2[(dVar3.a * 2) + 1] = cArr[1];
                    cArr2[(dVar3.a * 2) + 2] = cArr[2];
                    cArr2[(dVar3.a * 2) + 3] = cArr[3];
                    dVar3.a += 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        }

        public OooOO0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 66) ^ (-1));
            a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 19) | (i3 & 19)) << 1;
            int i5 = -(((~i3) & 19) | (i3 & (-20)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            a = i7;
            Object obj = null;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i == 0) {
                int i8 = i7 + 83;
                b = i8 % 128;
                int i9 = i8 % 2;
                AddressActivity.this.ay.setVisibility(8);
                int i10 = a;
                int i11 = i10 ^ 55;
                int i12 = -(-((i10 & 55) << 1));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
                AddressActivity.this.av.setBackgroundResource(R.drawable.spinner_bg);
                int i15 = b + 97;
                a = i15 % 128;
                int i16 = i15 % 2;
            } else {
                AddressActivity.this.av.setBackgroundResource(R.drawable.spinner_bg_selected);
                AddressActivity addressActivity = AddressActivity.this;
                int i17 = b;
                int i18 = (-2) - (((i17 & 38) + (i17 | 38)) ^ (-1));
                a = i18 % 128;
                int i19 = i18 % 2;
                if (addressActivity.av.getSelectedItem().equals("Other")) {
                    int i20 = b + 103;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    AddressActivity.this.aq.setVisibility(0);
                    int i22 = b + 2;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    AddressActivity.this.aq.setVisibility(8);
                    int i25 = b;
                    int i26 = ((i25 | 61) << 1) - (i25 ^ 61);
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 2 / 4;
                    }
                }
            }
            if (i > 0) {
                int i28 = a;
                int i29 = i28 & 115;
                int i30 = (i28 | 115) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = (i30 & i31) + (i30 | i31);
                b = i32 % 128;
                int i33 = i32 % 2;
                AddressActivity.this.ay.setVisibility(0);
                int i34 = a;
                int i35 = i34 & 89;
                int i36 = (((i34 ^ 89) | i35) << 1) - ((i34 | 89) & (~i35));
                b = i36 % 128;
                int i37 = i36 % 2;
                if (AddressActivity.this.aj.size() > 0) {
                    int i38 = b;
                    int i39 = i38 & 71;
                    int i40 = -(-(i38 | 71));
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    a = i41 % 128;
                    if (i41 % 2 != 0) {
                        AddressActivity.this.av.setBackgroundResource(R.drawable.spinner_bg_selected);
                        obj.hashCode();
                        throw null;
                    }
                    AddressActivity.this.av.setBackgroundResource(R.drawable.spinner_bg_selected);
                    AddressActivity addressActivity2 = AddressActivity.this;
                    aD aDVar = new aD(addressActivity2, addressActivity2.aj.get(i).uccode, AddressActivity.this.getResources().getString(R.string.selectvilage), AddressActivity.this.ay, new OooO00o(i));
                    ExecutorService executorService = aDVar.i;
                    aA aAVar = new aA(aDVar);
                    int i42 = a;
                    int i43 = i42 & 121;
                    int i44 = -(-((i42 ^ 121) | i43));
                    int i45 = (i43 & i44) + (i44 | i43);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    executorService.execute(aAVar);
                    int i47 = b;
                    int i48 = i47 & 51;
                    int i49 = i48 + ((i47 ^ 51) | i48);
                    a = i49 % 128;
                    int i50 = i49 % 2;
                }
            }
            int i51 = a;
            int i52 = ((i51 | 83) << 1) - (i51 ^ 83);
            b = i52 % 128;
            if (i52 % 2 == 0) {
                int i53 = 93 / 0;
            }
        }
    }

    public class OooO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public class OooO00o implements N {
            private static int a = 0;
            private static int b = 1;

            public OooO00o() {
            }

            @Override // ivas.gov.bisp.enumeration.W.N
            public void fillTehsilList(ArrayList<tehsil> arrayList, ArrayList<String> arrayList2) {
                int i = 2 % 2;
                int i2 = b;
                int i3 = i2 ^ 55;
                int i4 = ((i2 & 55) | i3) << 1;
                int i5 = -i3;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                a = i6 % 128;
                int i7 = i6 % 2;
                AddressActivity addressActivity = AddressActivity.this;
                addressActivity.ah = arrayList;
                int i8 = b;
                int i9 = i8 ^ 15;
                int i10 = ((i8 & 15) | i9) << 1;
                int i11 = -i9;
                int i12 = (i10 & i11) + (i10 | i11);
                a = i12 % 128;
                int i13 = i12 % 2;
                addressActivity.u();
                int i14 = a;
                int i15 = ((i14 ^ 113) | (i14 & 113)) << 1;
                int i16 = -(((~i14) & 113) | (i14 & (-114)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
            }
        }

        public OooO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 9;
            int i4 = i2 | 9;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        
            r7.c.au.setVisibility(74);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            r7.c.au.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            r7.c.av.setVisibility(8);
            r10 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b;
            r12 = r10 & 95;
            r12 = r12 + ((r10 ^ 95) | r12);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            if ((r12 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            r7.c.ay.setVisibility(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            r7.c.ay.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            r9 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b + 3;
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            if ((r9 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            r7.c.at.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
            r8 = 46 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        
            r7.c.at.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            r9 = r7.c;
            r12 = r9.ai.get(r10).distcode;
            r0 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a;
            r1 = ((r0 & (-90)) | ((~r0) & 89)) + ((r0 & 89) << 1);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b = r1 % 128;
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            if ((r1 % 2) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            r9.aA = r12;
            r9 = r7.c;
            r12 = r9.ai.get(r10);
            r1 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a;
            r2 = r1 & 15;
            r2 = r2 + ((r1 ^ 15) | r2);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b = r2 % 128;
            r2 = r2 % 2;
            r9.aw = r12.district;
            r7.c.at.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
            r7.c.au.setVisibility(0);
            r2 = r7.c;
            r9 = new ivas.gov.bisp.enumeration.bK.ay(r2, r2.ai.get(r10).distcode, r7.c.getResources().getString(ivas.gov.bisp.enumeration.R.string.selecttehsil), r7.c.au, new ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.OooO00o(r7));
            r10 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b;
            r10 = (-2) - (((r10 & 2) + (r10 | 2)) ^ (-1));
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a = r10 % 128;
            r10 = r10 % 2;
            r9.execute(new java.lang.Void[0]);
            r9 = ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.a;
            r10 = ((r9 ^ 9) - (~((r9 & 9) << 1))) - 1;
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0120, code lost:
        
            if ((r10 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0122, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0123, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
        
            r9.aA = r12;
            r8 = r7.c.ai.get(r10);
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0133, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r10 == 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r10 == 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            r10 = (r9 & 91) + (r9 | 91);
            ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        
            if ((r10 % 2) == 0) goto L11;
         */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemSelected(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.AddressActivity.OooO0o.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ae = new SessionManager(this);
        this.af = new ProgressDialog(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        ImageView imageView = (ImageView) findViewById(R.id.iv_back);
        int i2 = p;
        int i3 = i2 | 123;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 123)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        q = i6 % 128;
        int i7 = i6 % 2;
        this.ac = imageView;
        this.ad = (TextView) findViewById(R.id.btn_update);
        this.as = (Spinner) findViewById(R.id.sp_province);
        this.at = (Spinner) findViewById(R.id.sp_district);
        Spinner spinner = (Spinner) findViewById(R.id.sp_tehsil);
        int i8 = q;
        int i9 = i8 & 61;
        int i10 = i9 + ((i8 ^ 61) | i9);
        p = i10 % 128;
        int i11 = i10 % 2;
        this.au = spinner;
        this.av = (Spinner) findViewById(R.id.sp_uc);
        this.ay = (Spinner) findViewById(R.id.sp_village);
        this.aH = (Spinner) findViewById(R.id.sp_networks);
        EditText editText = (EditText) findViewById(R.id.et_village_st);
        int i12 = q;
        int i13 = (((i12 ^ 9) | (i12 & 9)) << 1) - (((~i12) & 9) | (i12 & (-10)));
        p = i13 % 128;
        int i14 = i13 % 2;
        this.am = editText;
        this.an = (EditText) findViewById(R.id.et_temp_address);
        this.ao = (EditText) findViewById(R.id.et_phone);
        this.al = (EditText) findViewById(R.id.et_conf_phone);
        EditText editText2 = (EditText) findViewById(R.id.et_uc);
        int i15 = p;
        int i16 = ((i15 | 59) << 1) - (i15 ^ 59);
        q = i16 % 128;
        int i17 = i16 % 2;
        this.aq = editText2;
        this.ap = (EditText) findViewById(R.id.et_village);
        this.ac.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.af.setCancelable(false);
        this.af.setMessage("Please Wait...");
        this.af.setProgressStyle(0);
        this.ao.setText(this.ae.p());
        ac.n(this.ao);
        ac.n(this.al);
        this.aJ = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, this.aJ);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.aH.setAdapter((SpinnerAdapter) arrayAdapter);
        this.aH.setOnItemSelectedListener(new C0179h(this));
        av avVar = new av(this, getResources().getString(R.string.selectprovince), this.as, new C0189r(this));
        int i18 = q;
        int i19 = i18 & 107;
        int i20 = -(-((i18 ^ 107) | i19));
        int i21 = (i19 & i20) + (i20 | i19);
        p = i21 % 128;
        if (i21 % 2 == 0) {
            avVar.execute(new Void[0]);
        } else {
            avVar.execute(new Void[0]);
        }
        int i22 = q;
        int i23 = (-2) - (((i22 & 52) + (i22 | 52)) ^ (-1));
        p = i23 % 128;
        int i24 = i23 % 2;
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] a$s17$32 = {48775, 48850, 48872, 48869, 48851, 48854, 48876, 48876, 48858, 48853, 48853, 48850, 48845, 48858, 48860, 48852, 48860, 48852, 48850, 48872, 48869, 48844};
        private static int c = 1;
        private static int d;

        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:101:0x043f  */
        /* JADX WARN: Code duplicated, block: B:11:0x0033  */
        /* JADX WARN: Code duplicated, block: B:12:0x0037 A[PHI: r0
  0x0037: PHI (r0v10 ivas.gov.bisp.enumeration.activity.AddressActivity) = (r0v4 ivas.gov.bisp.enumeration.activity.AddressActivity), (r0v16 ivas.gov.bisp.enumeration.activity.AddressActivity) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:18:0x005b  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f  */
        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00db  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:56:0x0164  */
        /* JADX WARN: Code duplicated, block: B:58:0x016c  */
        /* JADX WARN: Code duplicated, block: B:59:0x0177  */
        /* JADX WARN: Code duplicated, block: B:61:0x018c  */
        /* JADX WARN: Code duplicated, block: B:62:0x0197  */
        /* JADX WARN: Code duplicated, block: B:64:0x019f  */
        /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:67:0x01be  */
        /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:76:0x0212  */
        /* JADX WARN: Code duplicated, block: B:77:0x0225  */
        /* JADX WARN: Code duplicated, block: B:85:0x0287  */
        /* JADX WARN: Code duplicated, block: B:98:0x0302  */
        /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r0
  0x001f: PHI (r0v5 ivas.gov.bisp.enumeration.activity.AddressActivity) = (r0v4 ivas.gov.bisp.enumeration.activity.AddressActivity), (r0v16 ivas.gov.bisp.enumeration.activity.AddressActivity) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AddressActivity addressActivity;
            int i2;
            ArrayList<uc> arrayList;
            ArrayList<vilages> arrayList2;
            ArrayList<uc> arrayList3;
            ArrayList<vilages> arrayList4;
            int i3;
            int i4 = 2 % 2;
            int i5 = d + 45;
            c = i5 % 128;
            if (i5 % 2 == 0) {
                addressActivity = AddressActivity.this;
                int i6 = 92 / 0;
                if (addressActivity.aC == 0) {
                    Toast.makeText(addressActivity, "Please Select Province", 0).show();
                    i2 = d + 75;
                    c = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i7 = 2 % 4;
                    }
                } else if (addressActivity.aA == 0) {
                    Toast.makeText(addressActivity, "Please Select District", 0).show();
                } else if (addressActivity.aB.equals(BuildConfig.FLAVOR)) {
                    Toast.makeText(addressActivity, "Please Select mobile network", 0).show();
                } else if (addressActivity.aI == 0) {
                    Toast.makeText(addressActivity, "Please Select Tehsil", 0).show();
                } else {
                    arrayList = addressActivity.aj;
                    if (arrayList != null || arrayList.size() <= 0) {
                        z.o(addressActivity, addressActivity.av, "UC");
                    } else {
                        int i8 = d + 27;
                        c = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 94 / 0;
                            if (!(!addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uc.equalsIgnoreCase("Other"))) {
                                i3 = d + 85;
                                c = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i10 = 92 / 0;
                                    if (!ivas.gov.bisp.enumeration.p091n.j.E(addressActivity.aq, BuildConfig.FLAVOR)) {
                                        z.k(addressActivity, addressActivity.aq, "UC");
                                    }
                                } else if (ivas.gov.bisp.enumeration.p091n.j.E(addressActivity.aq, BuildConfig.FLAVOR)) {
                                    z.k(addressActivity, addressActivity.aq, "UC");
                                }
                            } else if (addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uccode == 0) {
                                z.o(addressActivity, addressActivity.ay, "UC");
                            }
                        } else if (addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uc.equalsIgnoreCase("Other")) {
                            i3 = d + 85;
                            c = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i11 = 92 / 0;
                                if (!ivas.gov.bisp.enumeration.p091n.j.E(addressActivity.aq, BuildConfig.FLAVOR)) {
                                    z.k(addressActivity, addressActivity.aq, "UC");
                                }
                            } else if (ivas.gov.bisp.enumeration.p091n.j.E(addressActivity.aq, BuildConfig.FLAVOR)) {
                                z.k(addressActivity, addressActivity.aq, "UC");
                            }
                        } else if (addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uccode == 0) {
                            z.o(addressActivity, addressActivity.ay, "UC");
                        }
                    }
                    arrayList2 = addressActivity.ak;
                    if (arrayList2 != null || arrayList2.size() <= 0) {
                        z.o(addressActivity, addressActivity.ay, "village");
                    } else {
                        int i12 = d + 105;
                        c = i12 % 128;
                        int i13 = i12 % 2;
                        if (addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).locality.equalsIgnoreCase("Other")) {
                            int i14 = c + 25;
                            d = i14 % 128;
                            int i15 = i14 % 2;
                            if (ivas.gov.bisp.enumeration.p091n.j.E(addressActivity.ap, BuildConfig.FLAVOR)) {
                                z.k(addressActivity, addressActivity.ap, "village");
                            } else if (ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.am, BuildConfig.FLAVOR)) {
                                Toast.makeText(addressActivity, "Please enter village name", 0).show();
                            } else if (addressActivity.am.getText().toString().trim().length() < 3) {
                                Toast.makeText(addressActivity, "Village/Street minimum length should be 3 alphabetic", 0).show();
                            } else if (ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.an, BuildConfig.FLAVOR)) {
                                Toast.makeText(addressActivity, "Please enter address", 0).show();
                            } else if (addressActivity.an.getText().toString().trim().length() < 2) {
                                Toast.makeText(addressActivity, "Temporary address minimum length should be 2 alphabetic", 0).show();
                                int i16 = c + 123;
                                d = i16 % 128;
                                int i17 = i16 % 2;
                            } else if (!ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.ao, BuildConfig.FLAVOR) || ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.al, BuildConfig.FLAVOR)) {
                                Toast.makeText(addressActivity, "Please enter phone number", 0).show();
                            } else if (addressActivity.ao.getText().toString().equals(addressActivity.al.getText().toString())) {
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                arrayList3 = addressActivity.aj;
                                if (arrayList3 != null || arrayList3.size() <= 0) {
                                    addressActivity.az = 0;
                                    addressActivity.aF = BuildConfig.FLAVOR;
                                } else if (addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uc.equalsIgnoreCase("Other")) {
                                    addressActivity.az = 0;
                                    addressActivity.aF = addressActivity.aq.getText().toString();
                                } else {
                                    addressActivity.az = addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uccode;
                                    addressActivity.aF = String.valueOf(addressActivity.aj.get(addressActivity.av.getSelectedItemPosition()).uc);
                                }
                                arrayList4 = addressActivity.ak;
                                if (arrayList4 != null || arrayList4.size() <= 0) {
                                    addressActivity.ar = 0L;
                                    addressActivity.aG = BuildConfig.FLAVOR;
                                } else {
                                    int i18 = d + 93;
                                    c = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).locality.equalsIgnoreCase("Other");
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).locality.equalsIgnoreCase("Other")) {
                                        addressActivity.ar = 0L;
                                        addressActivity.aG = addressActivity.ap.getText().toString();
                                    } else {
                                        addressActivity.ar = addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).localitycode;
                                        addressActivity.aG = addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).locality;
                                    }
                                }
                                try {
                                    String string = addressActivity.ao.getText().toString();
                                    jSONObject.put("hH_ID", addressActivity.ae.c());
                                    jSONObject.put("provice_code", addressActivity.aC);
                                    jSONObject.put("provice_name", addressActivity.ax);
                                    jSONObject.put("district_code", addressActivity.aA);
                                    jSONObject.put("district_name", addressActivity.aw);
                                    jSONObject.put("tehsil_code", addressActivity.aI);
                                    jSONObject.put("tehsil_name", addressActivity.aE);
                                    jSONObject.put("street", addressActivity.am.getText().toString());
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(addressActivity.an.getText().toString());
                                    sb.append(" , ");
                                    sb.append(addressActivity.am.getText().toString());
                                    jSONObject.put("address", sb.toString());
                                    jSONObject.put("phone_number", string);
                                    jSONObject.put("uc_id", addressActivity.az);
                                    jSONObject.put("uc_name", addressActivity.aF);
                                    jSONObject.put("village_id", addressActivity.ar);
                                    jSONObject.put("vilage_name", addressActivity.aG);
                                    jSONObject.put("mobile_network", addressActivity.aB);
                                    addressActivity.af.setCancelable(false);
                                    addressActivity.af.setMessage("Please Wait...");
                                    addressActivity.af.setProgressStyle(0);
                                    addressActivity.af.show();
                                    jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(addressActivity.ae.k()), b.b(addressActivity.ae.m())));
                                    byte[] bArrB = b.b(addressActivity.ae.k());
                                    byte[] bArrB2 = b.b(addressActivity.ae.m());
                                    Object[] objArr = new Object[1];
                                    a(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0}, new int[]{0, 22, 0, 13}, objArr);
                                    jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                                    C0181j c0181j = new C0181j(addressActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0176e(addressActivity), new C0180i(addressActivity));
                                    c0181j.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                                    c0181j.k = false;
                                    a.b(addressActivity).c(c0181j);
                                } catch (JSONException unused) {
                                }
                            } else {
                                int i19 = c + 13;
                                d = i19 % 128;
                                int i20 = i19 % 2;
                                Toast.makeText(addressActivity, "Please enter valid phone number", 0).show();
                            }
                        } else if (addressActivity.ak.get(addressActivity.ay.getSelectedItemPosition()).localitycode == 0) {
                            int i21 = c + 27;
                            d = i21 % 128;
                            int i22 = i21 % 2;
                            z.o(addressActivity, addressActivity.ay, "Village");
                        } else if (ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.am, BuildConfig.FLAVOR)) {
                            Toast.makeText(addressActivity, "Please enter village name", 0).show();
                        } else if (addressActivity.am.getText().toString().trim().length() < 3) {
                            Toast.makeText(addressActivity, "Village/Street minimum length should be 3 alphabetic", 0).show();
                        } else if (ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.an, BuildConfig.FLAVOR)) {
                            Toast.makeText(addressActivity, "Please enter address", 0).show();
                        } else if (addressActivity.an.getText().toString().trim().length() < 2) {
                            Toast.makeText(addressActivity, "Temporary address minimum length should be 2 alphabetic", 0).show();
                            int i110 = c + 123;
                            d = i110 % 128;
                            int i111 = i110 % 2;
                        } else if (!ivas.gov.bisp.enumeration.p091n.j.A(addressActivity.ao, BuildConfig.FLAVOR)) {
                            Toast.makeText(addressActivity, "Please enter phone number", 0).show();
                        } else if (addressActivity.ao.getText().toString().equals(addressActivity.al.getText().toString())) {
                            int i112 = c + 13;
                            d = i112 % 128;
                            int i23 = i112 % 2;
                            Toast.makeText(addressActivity, "Please enter valid phone number", 0).show();
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            arrayList3 = addressActivity.aj;
                            if (arrayList3 != null) {
                                addressActivity.az = 0;
                                addressActivity.aF = BuildConfig.FLAVOR;
                            } else {
                                addressActivity.az = 0;
                                addressActivity.aF = BuildConfig.FLAVOR;
                            }
                            arrayList4 = addressActivity.ak;
                            if (arrayList4 != null) {
                                addressActivity.ar = 0L;
                                addressActivity.aG = BuildConfig.FLAVOR;
                            } else {
                                addressActivity.ar = 0L;
                                addressActivity.aG = BuildConfig.FLAVOR;
                            }
                            String string2 = addressActivity.ao.getText().toString();
                            jSONObject3.put("hH_ID", addressActivity.ae.c());
                            jSONObject3.put("provice_code", addressActivity.aC);
                            jSONObject3.put("provice_name", addressActivity.ax);
                            jSONObject3.put("district_code", addressActivity.aA);
                            jSONObject3.put("district_name", addressActivity.aw);
                            jSONObject3.put("tehsil_code", addressActivity.aI);
                            jSONObject3.put("tehsil_name", addressActivity.aE);
                            jSONObject3.put("street", addressActivity.am.getText().toString());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(addressActivity.an.getText().toString());
                            sb2.append(" , ");
                            sb2.append(addressActivity.am.getText().toString());
                            jSONObject3.put("address", sb2.toString());
                            jSONObject3.put("phone_number", string2);
                            jSONObject3.put("uc_id", addressActivity.az);
                            jSONObject3.put("uc_name", addressActivity.aF);
                            jSONObject3.put("village_id", addressActivity.ar);
                            jSONObject3.put("vilage_name", addressActivity.aG);
                            jSONObject3.put("mobile_network", addressActivity.aB);
                            addressActivity.af.setCancelable(false);
                            addressActivity.af.setMessage("Please Wait...");
                            addressActivity.af.setProgressStyle(0);
                            addressActivity.af.show();
                            jSONObject4.put("string1", b.d(jSONObject3.toString(), b.b(addressActivity.ae.k()), b.b(addressActivity.ae.m())));
                            byte[] bArrB3 = b.b(addressActivity.ae.k());
                            byte[] bArrB4 = b.b(addressActivity.ae.m());
                            Object[] objArr2 = new Object[1];
                            a(false, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0}, new int[]{0, 22, 0, 13}, objArr2);
                            jSONObject4.put("string2", b.d(((String) objArr2[0]).intern(), bArrB3, bArrB4));
                            C0181j c0181j2 = new C0181j(addressActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject4, new C0176e(addressActivity), new C0180i(addressActivity));
                            c0181j2.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                            c0181j2.k = false;
                            a.b(addressActivity).c(c0181j2);
                        }
                    }
                }
            } else {
                addressActivity = AddressActivity.this;
                if (addressActivity.aC == 0) {
                    Toast.makeText(addressActivity, "Please Select Province", 0).show();
                    i2 = d + 75;
                    c = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i24 = 2 % 4;
                    }
                } else if (addressActivity.aA == 0) {
                    Toast.makeText(addressActivity, "Please Select District", 0).show();
                } else if (addressActivity.aB.equals(BuildConfig.FLAVOR)) {
                    Toast.makeText(addressActivity, "Please Select mobile network", 0).show();
                } else if (addressActivity.aI == 0) {
                    Toast.makeText(addressActivity, "Please Select Tehsil", 0).show();
                } else {
                    arrayList = addressActivity.aj;
                    if (arrayList != null) {
                        z.o(addressActivity, addressActivity.av, "UC");
                        arrayList2 = addressActivity.ak;
                        if (arrayList2 != null) {
                            z.o(addressActivity, addressActivity.ay, "village");
                        } else {
                            z.o(addressActivity, addressActivity.ay, "village");
                        }
                    } else {
                        z.o(addressActivity, addressActivity.av, "UC");
                        arrayList2 = addressActivity.ak;
                        if (arrayList2 != null) {
                            z.o(addressActivity, addressActivity.ay, "village");
                        } else {
                            z.o(addressActivity, addressActivity.ay, "village");
                        }
                    }
                }
            }
            dialogInterface.cancel();
        }

        private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
            int i;
            int i2 = 2 % 2;
            i iVar = new i();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = a$s17$32;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    cArr2[i7] = (char) (((long) cArr[i7]) ^ 2843778254771240638L);
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                iVar.b = 0;
                char c2 = 0;
                while (iVar.b < i4) {
                    if (bArr[iVar.b] == 1) {
                        cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c2);
                    } else {
                        cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c2);
                    }
                    c2 = cArr4[iVar.b];
                    iVar.b++;
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i8 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i8, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i8);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                iVar.b = 0;
                while (iVar.b < i4) {
                    int i9 = $11 + 19;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr6[iVar.b] = cArr3[(i4 << iVar.b) >> 1];
                        i = iVar.b << 1;
                    } else {
                        cArr6[iVar.b] = cArr3[(i4 - iVar.b) - 1];
                        i = iVar.b + 1;
                    }
                    iVar.b = i;
                    int i10 = $11 + 45;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i12 = $10 + 61;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    iVar.b = 1;
                } else {
                    iVar.b = 0;
                }
                while (iVar.b < i4) {
                    int i13 = $10 + 73;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] - iArr[2]);
                    iVar.b++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }
}
