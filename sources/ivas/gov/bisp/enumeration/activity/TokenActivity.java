package ivas.gov.bisp.enumeration.activity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.adapters.AdapterTokens;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.Tokens;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p044bq.G;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import net.sqlcipher.BuildConfig;
import o.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TokenActivity extends BaseTouch implements AdapterTokens.OooO00o {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] a$s17$812 = null;
    public static final /* synthetic */ int ac = 0;
    private static int p = 1;
    private static int q;
    public ProgressDialog ad;
    public AdapterTokens ae;
    public RecyclerView af;
    public TextView ag;
    public ArrayList<Tokens> ah;
    public Button ai;
    public SessionManager aj;
    public Button ak;
    public LinearLayout al;
    public EditText am;

    public class OooOO0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0(TokenActivity tokenActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 23;
            int i5 = (i3 ^ 23) | i4;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            dialogInterface.cancel();
            int i8 = b;
            int i9 = i8 | 65;
            int i10 = i9 << 1;
            int i11 = -((~(i8 & 65)) & i9);
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        u();
        int i = q + 41;
        p = i % 128;
        int i2 = i % 2;
    }

    static void u() {
        a$s17$812 = new char[]{48781, 48840, 48690, 48836, 48840, 48690, 48702, 48703, 48691, 48694, 48695, 48686, 48698, 48858};
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.e = "Alert!";
        oooO0O0.f = "Do you wants to exit";
        oooO0O0.k = false;
        OooO oooO = new OooO();
        oooO0O0.h = "yes";
        oooO0O0.i = oooO;
        OooOO0 oooOO0 = new OooOO0(this);
        oooO0O0.a = "no";
        oooO0O0.j = oooOO0;
        aiz.b().show();
        int i2 = p + 17;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 49;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = i3 + 25;
        p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return R.layout.activity_token;
    }

    public final void x(Tokens tokens) {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.token_process_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        b bVarB = aiz.b();
        bVarB.show();
        bVarB.setCancelable(true);
        ((TextView) viewInflate.findViewById(R.id.tv_token_cnic)).setText(tokens.getCnic());
        ((Button) viewInflate.findViewById(R.id.process_token_button)).setOnClickListener(new OooO0o((EditText) viewInflate.findViewById(R.id.token_number_editText), tokens, bVarB));
        int i2 = q + 79;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            TokenActivity tokenActivity = TokenActivity.this;
            Intent intent = new Intent(TokenActivity.this, (Class<?>) ActivityEnumeratorMain.class);
            int i3 = a;
            int i4 = i3 & 1;
            int i5 = ((i3 | 1) & (~i4)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            tokenActivity.startActivity(intent);
            TokenActivity.this.finishAffinity();
            dialogInterface.cancel();
            int i7 = b;
            int i8 = i7 & 113;
            int i9 = ((i7 ^ 113) | i8) << 1;
            int i10 = -((i7 | 113) & (~i8));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 61) - (~(-(-(i2 | 61))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<Tokens> arrayList = TokenActivity.this.ah;
            Object obj = null;
            if (arrayList != null) {
                int i5 = a;
                int i6 = (i5 | 121) << 1;
                int i7 = -(((~i5) & 121) | (i5 & (-122)));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList.size();
                    obj.hashCode();
                    throw null;
                }
                if (arrayList.size() > 0) {
                    TokenActivity tokenActivity = TokenActivity.this;
                    Tokens tokens = tokenActivity.ah.get(0);
                    int i9 = a + 105;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    tokenActivity.x(tokens);
                    int i11 = b;
                    int i12 = (i11 & 22) + (i11 | 22);
                    int i13 = (i12 ^ (-1)) + (i12 << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            int i15 = a;
            int i16 = i15 & 5;
            int i17 = i16 + ((i15 ^ 5) | i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0O implements P {
        private static int a = 1;
        private static int b;

        public OooOO0O() {
        }

        @Override // ivas.gov.bisp.enumeration.W.P
        public void n(ArrayList<not_at_home> arrayList, ArrayList<survey_count> arrayList2, ArrayList<offline_survey_count> arrayList3) throws Throwable {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            int i2 = BISPApplication.e;
            int i3 = a;
            int i4 = i3 | 103;
            int i5 = ((i4 << 1) - (~(-((~(i3 & 103)) & i4)))) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                sb.append(i2);
                sb.append("::RandomNumber");
                int i6 = 82 / 0;
            } else {
                sb.append(i2);
                sb.append("::RandomNumber");
            }
            int i7 = a;
            int i8 = i7 | 63;
            int i9 = (i8 << 1) - ((~(i7 & 63)) & i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            Log.e("Counter", sb.toString());
            if (!arrayList2.isEmpty()) {
                int i11 = a + 79;
                b = i11 % 128;
                int i12 = i11 % 2;
                int i13 = arrayList2.get(0).sync_count % 10;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i13);
                int i14 = a;
                int i15 = i14 & 11;
                int i16 = (i14 | 11) & (~i15);
                int i17 = i15 << 1;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                b = i18 % 128;
                int i19 = i18 % 2;
                sb2.append("::SyncCount\n");
                sb2.append(BISPApplication.e);
                int i20 = b;
                int i21 = (i20 | 35) << 1;
                int i22 = -(i20 ^ 35);
                int i23 = (i21 & i22) + (i22 | i21);
                a = i23 % 128;
                if (i23 % 2 == 0) {
                    sb2.append("::RandomNumber");
                    sb2.toString();
                    throw null;
                }
                sb2.append("::RandomNumber");
                Log.e("Counter", sb2.toString());
                if (BISPApplication.e <= i13) {
                    TokenActivity tokenActivity = TokenActivity.this;
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    int i24 = TokenActivity.ac;
                    int i25 = b + 1;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    tokenActivity.q("0", arrayList4);
                    Objects.requireNonNull(TokenActivity.this.R);
                    int i27 = b;
                    int i28 = i27 ^ 27;
                    int i29 = ((((i27 & 27) | i28) << 1) - (~(-i28))) - 1;
                    a = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 54 / 0;
                    }
                    int i31 = i27 + 23;
                    a = i31 % 128;
                    try {
                        if (i31 % 2 == 0) {
                            throw null;
                        }
                        Random random = (Random) Random.class.getDeclaredConstructor(null).newInstance(null);
                        int i32 = a;
                        int i33 = i32 & 123;
                        int i34 = i33 + ((i32 ^ 123) | i33);
                        b = i34 % 128;
                        if (i34 % 2 != 0) {
                            BISPApplication.e = random.nextInt(121) << 4;
                        } else {
                            int iNextInt = random.nextInt(6);
                            int i35 = iNextInt & 5;
                            int i36 = (iNextInt | 5) & (~i35);
                            int i37 = -(-(i35 << 1));
                            BISPApplication.e = (i36 ^ i37) + ((i36 & i37) << 1);
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            int i38 = b;
            int i39 = ((i38 ^ 109) | (i38 & 109)) << 1;
            int i40 = -(((~i38) & 109) | (i38 & (-110)));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            a = i41 % 128;
            int i42 = i41 % 2;
        }
    }

    public class OooO0o implements View.OnClickListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ Tokens d;
        public final /* synthetic */ b e;

        public OooO0o(EditText editText, Tokens tokens, b bVar) {
            this.c = editText;
            this.d = tokens;
            this.e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 113;
            int i4 = ((i2 & 113) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                this.c.getText().toString();
                throw null;
            }
            String string = this.c.getText().toString();
            int i7 = b;
            int i8 = i7 & 23;
            int i9 = i8 + ((i7 ^ 23) | i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                TextUtils.isEmpty(string);
                throw null;
            }
            if (TextUtils.isEmpty(string)) {
                this.c.setError("Please enter valid Token Number");
                int i10 = a;
                int i11 = i10 | 39;
                int i12 = (i11 << 1) - ((~(i10 & 39)) & i11);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (!string.equals(this.d.getTokenNumber())) {
                this.c.setError("Token Number not matched");
                int i13 = b;
                int i14 = i13 & 93;
                int i15 = (i13 ^ 93) | i14;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                return;
            }
            Intent intent = new Intent(TokenActivity.this, (Class<?>) CnicValidationActivity.class);
            int i18 = b + 103;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                intent.putExtra("cnic", this.d.getCnic());
                obj.hashCode();
                throw null;
            }
            intent.putExtra("cnic", this.d.getCnic());
            TokenActivity.this.startActivity(intent);
            this.e.dismiss();
            int i19 = b;
            int i20 = i19 & 41;
            int i21 = i19 | 41;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooO0OO implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public class OooO00o implements Comparator<Tokens> {
            private static int a = 1;
            private static int b;

            public OooO00o(OooO0OO oooO0OO) {
            }

            @Override // java.util.Comparator
            public int compare(Tokens tokens, Tokens tokens2) {
                int id;
                int i = 2 % 2;
                int i2 = a;
                int i3 = i2 ^ 73;
                int i4 = -(-((i2 & 73) << 1));
                int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
                b = i5 % 128;
                int i6 = i5 % 2;
                Tokens tokens3 = tokens;
                Tokens tokens4 = tokens2;
                int i7 = i2 ^ 13;
                int i8 = ((i2 & 13) | i7) << 1;
                int i9 = -i7;
                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    id = tokens3.getId() >>> tokens4.getId();
                } else {
                    int id2 = tokens3.getId();
                    int i11 = -tokens4.getId();
                    int i12 = id2 | i11;
                    int i13 = i12 << 1;
                    int i14 = -((~(id2 & i11)) & i12);
                    id = (i14 | i13) + (i13 & i14);
                }
                int i15 = a;
                int i16 = i15 & 19;
                int i17 = (i15 ^ 19) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    return id;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int size;
            int i = 2 % 2;
            int i2 = a + 62;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            Tokens tokens = i3 % 2 != 0 ? TokenActivity.this.ah.get(1) : TokenActivity.this.ah.get(0);
            int i4 = a;
            int i5 = i4 ^ 69;
            int i6 = -(-((i4 & 69) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 1;
            while (i9 < TokenActivity.this.ah.size()) {
                int i10 = a;
                int i11 = i10 & 97;
                int i12 = i11 + ((i10 ^ 97) | i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                Tokens tokens2 = TokenActivity.this.ah.get(i9);
                int i14 = b;
                int i15 = i14 & 119;
                int i16 = (((i14 | 119) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                if (!tokens2.isSkip()) {
                    int id = tokens.getId();
                    tokens.setId(tokens2.getId());
                    int i18 = a + 57;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    tokens.setSkip(true);
                    tokens2.setId(id);
                    Collections.sort(TokenActivity.this.ah, new OooO00o(this));
                    TokenActivity tokenActivity = TokenActivity.this;
                    int i20 = b;
                    int i21 = i20 & 59;
                    int i22 = ((i20 | 59) & (~i21)) + (i21 << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    tokenActivity.ae.h(tokenActivity.ah);
                    int i24 = a;
                    int i25 = (i24 & (-24)) | ((~i24) & 23);
                    int i26 = -(-((i24 & 23) << 1));
                    int i27 = (i25 & i26) + (i26 | i25);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    break;
                }
                int i29 = a;
                int i30 = ((i29 ^ 93) | (i29 & 93)) << 1;
                int i31 = -(((~i29) & 93) | (i29 & (-94)));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                b = i32 % 128;
                if (i32 % 2 != 0) {
                    size = TokenActivity.this.ah.size();
                    int i33 = 97 / 0;
                } else {
                    size = TokenActivity.this.ah.size();
                }
                int i34 = ~size;
                int i35 = -(-(size << 1));
                if (i9 == ((i34 | i35) << 1) - (i35 ^ i34)) {
                    int i36 = a;
                    int i37 = ((i36 ^ 7) - (~((i36 & 7) << 1))) - 1;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    Iterator<Tokens> it = TokenActivity.this.ah.iterator();
                    int i39 = a;
                    int i40 = (((i39 ^ 43) | (i39 & 43)) << 1) - (((~i39) & 43) | (i39 & (-44)));
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    while (it.hasNext()) {
                        int i42 = a;
                        int i43 = (i42 & 77) + (i42 | 77);
                        b = i43 % 128;
                        (i43 % 2 != 0 ? it.next() : it.next()).setSkip(false);
                    }
                    int i44 = b;
                    int i45 = i44 & 45;
                    int i46 = -(-((i44 ^ 45) | i45));
                    int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    i9 = 0;
                }
                int i49 = i9 & 1;
                int i50 = ((i9 ^ 1) | i49) << 1;
                int i51 = -((i9 | 1) & (~i49));
                i9 = (i51 | i50) + (i50 & i51);
                int i52 = a;
                int i53 = i52 & 39;
                int i54 = (i53 - (~((i52 ^ 39) | i53))) - 1;
                b = i54 % 128;
                int i55 = i54 % 2;
            }
            int i56 = b;
            int i57 = ((i56 & (-36)) | ((~i56) & 35)) + ((i56 & 35) << 1);
            a = i57 % 128;
            int i58 = i57 % 2;
        }
    }

    public class OooO00o implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 109;
            int i4 = (i2 | 109) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (-2) - ((((i5 | 28) << 1) - (i5 ^ 28)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = i5 & 103;
            int i7 = (i5 ^ 103) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            Object obj = null;
            if (i8 % 2 != 0) {
                ArrayList<Tokens> arrayList = TokenActivity.this.ah;
                throw null;
            }
            ArrayList<Tokens> arrayList2 = TokenActivity.this.ah;
            if (arrayList2 != null) {
                int i9 = a;
                int i10 = (((i9 & (-92)) | ((~i9) & 91)) - (~((i9 & 91) << 1))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                if (arrayList2.size() > 0) {
                    int i12 = a;
                    int i13 = i12 & 29;
                    int i14 = (i12 | 29) & (~i13);
                    int i15 = -(-(i13 << 1));
                    int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    if (!(!TextUtils.isEmpty(charSequence.toString()))) {
                        int i18 = a;
                        int i19 = i18 ^ 55;
                        int i20 = -(-((i18 & 55) << 1));
                        int i21 = (i19 & i20) + (i20 | i19);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        TokenActivity tokenActivity = TokenActivity.this;
                        AdapterTokens adapterTokens = tokenActivity.ae;
                        ArrayList<Tokens> arrayList3 = tokenActivity.ah;
                        int i23 = a + 117;
                        b = i23 % 128;
                        if (i23 % 2 == 0) {
                            adapterTokens.h(arrayList3);
                            throw null;
                        }
                        adapterTokens.h(arrayList3);
                        int i24 = a + 87;
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    TokenActivity tokenActivity2 = TokenActivity.this;
                    String string = charSequence.toString();
                    Objects.requireNonNull(tokenActivity2);
                    ArrayList<Tokens> arrayList4 = new ArrayList<>();
                    int i25 = a;
                    int i26 = i25 & 15;
                    int i27 = (i25 ^ 15) | i26;
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    b = i28 % 128;
                    if (i28 % 2 == 0) {
                        tokenActivity2.ah.iterator();
                        obj.hashCode();
                        throw null;
                    }
                    Iterator<Tokens> it = tokenActivity2.ah.iterator();
                    while (!(!it.hasNext())) {
                        int i29 = b;
                        int i30 = i29 & 111;
                        int i31 = -(-((i29 ^ 111) | i30));
                        int i32 = (i30 & i31) + (i31 | i30);
                        a = i32 % 128;
                        if (i32 % 2 != 0) {
                            it.next();
                            throw null;
                        }
                        Tokens next = it.next();
                        if (!next.getName().toLowerCase().contains(string.toLowerCase())) {
                            int i33 = a;
                            int i34 = ((i33 ^ 61) | (i33 & 61)) << 1;
                            int i35 = -(((~i33) & 61) | (i33 & (-62)));
                            int i36 = (i34 & i35) + (i35 | i34);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            String lowerCase = next.getCnic().toLowerCase();
                            String lowerCase2 = string.toLowerCase();
                            int i38 = a;
                            int i39 = (-2) - (((i38 & 44) + (i38 | 44)) ^ (-1));
                            b = i39 % 128;
                            int i40 = i39 % 2;
                            if (!lowerCase.contains(lowerCase2)) {
                                int i41 = a;
                                int i42 = i41 | 103;
                                int i43 = (i42 << 1) - ((~(i41 & 103)) & i42);
                                b = i43 % 128;
                                if (i43 % 2 == 0) {
                                    next.getTokenNumber().toLowerCase().contains(string.toLowerCase());
                                    throw null;
                                }
                                if (!(!next.getTokenNumber().toLowerCase().contains(string.toLowerCase()))) {
                                }
                            }
                        }
                        arrayList4.add(next);
                        int i44 = b + 90;
                        int i45 = (i44 ^ (-1)) + (i44 << 1);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                    }
                    AdapterTokens adapterTokens2 = tokenActivity2.ae;
                    adapterTokens2.f = arrayList4;
                    int i47 = a;
                    int i48 = i47 ^ 71;
                    int i49 = (i47 & 71) << 1;
                    int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                    b = i50 % 128;
                    if (i50 % 2 == 0) {
                        adapterTokens2.a.c();
                        throw null;
                    }
                    adapterTokens2.a.c();
                    int i51 = a;
                    int i52 = i51 ^ 107;
                    int i53 = -(-((i51 & 107) << 1));
                    int i54 = (i52 & i53) + (i53 | i52);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                }
            }
            int i56 = b + 99;
            a = i56 % 128;
            int i57 = i56 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        super.onResume();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Log.e("TokenActivity", "createJSON: ");
        try {
            jSONObject.put("CenterCode", this.aj.e());
            jSONObject.put("Cnic", BuildConfig.FLAVOR);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.aj.k()), ivas.gov.bisp.enumeration.bK.b.b(this.aj.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.aj.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.aj.m());
            Object[] objArr = new Object[1];
            a(false, new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{0, 14, 32, 0}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            StringBuilder sb = new StringBuilder();
            sb.append("createJSON: ");
            sb.append(jSONObject2);
            Log.e("TokenActivity", sb.toString());
            ax.h(this.ad, "Fetching Tokens!");
            Log.e("TokenActivity", "createJSON: Call Handler show progress dialog");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new I() { // from class: ivas.gov.bisp.enumeration.activity.TokenActivity.4
                private static int a = 1;
                private static int b;

                /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.activity.TokenActivity$4$OooO00o */
                public class OooO00o implements Comparator<Tokens> {
                    private static int a = 0;
                    private static int b = 1;

                    public OooO00o(AnonymousClass4 anonymousClass4) {
                    }

                    @Override // java.util.Comparator
                    public int compare(Tokens tokens, Tokens tokens2) {
                        int i = 2 % 2;
                        int i2 = b;
                        int i3 = ((i2 & (-16)) | ((~i2) & 15)) + ((i2 & 15) << 1);
                        int i4 = i3 % 128;
                        a = i4;
                        int i5 = i3 % 2;
                        int i6 = (-2) - (((i4 & 34) + (i4 | 34)) ^ (-1));
                        b = i6 % 128;
                        int i7 = i6 % 2;
                        int tokenSequence = tokens.getTokenSequence();
                        int i8 = -tokens2.getTokenSequence();
                        int i9 = (((~i8) & tokenSequence) | ((~tokenSequence) & i8)) + ((tokenSequence & i8) << 1);
                        int i10 = b;
                        int i11 = i10 & 31;
                        int i12 = (((i10 ^ 31) | i11) << 1) - ((i10 | 31) & (~i11));
                        a = i12 % 128;
                        if (i12 % 2 == 0) {
                            return i9;
                        }
                        throw null;
                    }
                }

                @Override // ivas.gov.bisp.enumeration.p024ax.I
                public void onError(ResponseMessage responseMessage) {
                    TokenActivity tokenActivity;
                    StringBuilder sbW;
                    String errorMessage;
                    int i2 = 2 % 2;
                    int i3 = a;
                    int i4 = ((i3 & 32) + (i3 | 32)) - 1;
                    b = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 != 0) {
                        int i5 = TokenActivity.ac;
                        Log.e("TokenActivity", "requestTokens onError: before progress dialog");
                        obj.hashCode();
                        throw null;
                    }
                    int i6 = TokenActivity.ac;
                    Log.e("TokenActivity", "requestTokens onError: before progress dialog");
                    int i7 = a;
                    int i8 = (i7 | 43) << 1;
                    int i9 = -(i7 ^ 43);
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        tokenActivity = TokenActivity.this;
                        sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
                        errorMessage = responseMessage.getErrorMessage();
                        int i11 = 73 / 0;
                    } else {
                        tokenActivity = TokenActivity.this;
                        sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
                        errorMessage = responseMessage.getErrorMessage();
                    }
                    sbW.append(errorMessage);
                    ax.f(tokenActivity, "Alert", sbW.toString());
                    int i12 = a;
                    int i13 = (i12 & (-16)) | ((~i12) & 15);
                    int i14 = -(-((i12 & 15) << 1));
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    ax.b(TokenActivity.this.ad);
                    TokenActivity tokenActivity2 = TokenActivity.this;
                    int i17 = a;
                    int i18 = ((i17 & (-100)) | ((~i17) & 99)) + ((i17 & 99) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    tokenActivity2.af.setVisibility(8);
                    LinearLayout linearLayout = TokenActivity.this.al;
                    int i20 = b;
                    int i21 = ((i20 ^ 12) + ((i20 & 12) << 1)) - 1;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    linearLayout.setVisibility(8);
                    EditText editText = TokenActivity.this.am;
                    int i23 = a;
                    int i24 = ((i23 & (-2)) | ((~i23) & 1)) + ((i23 & 1) << 1);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    editText.setVisibility(8);
                    TokenActivity.this.ag.setVisibility(0);
                    int i26 = b;
                    int i27 = ((i26 | 69) << 1) - (((~i26) & 69) | (i26 & (-70)));
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
                
                    if (r8.size() > 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
                
                    if (r8.size() > 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
                
                    r3 = ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.b;
                    r5 = r3 & 9;
                    r5 = r5 + ((r3 ^ 9) | r5);
                    ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.a = r5 % 128;
                    r5 = r5 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
                
                    r7.c.af.setVisibility(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
                
                    r3 = ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.b;
                    r5 = (r3 | 109) << 1;
                    r3 = -(((~r3) & 109) | (r3 & (-110)));
                    r6 = (r5 & r3) + (r3 | r5);
                    ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.a = r6 % 128;
                    r6 = r6 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
                
                    r7.c.al.setVisibility(0);
                    r7.c.ag.setVisibility(8);
                    r2 = new ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.OooO00o(r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
                
                    r3 = ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.b;
                    r5 = r3 & 25;
                    r3 = (r3 | 25) & (~r5);
                    r5 = r5 << 1;
                    r6 = (r3 & r5) + (r3 | r5);
                    ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.a = r6 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
                
                    if ((r6 % 2) == 0) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
                
                    java.util.Collections.sort(r8, r2);
                    r7.c.am.setVisibility(0);
                    r2 = r7.c;
                    r2.ah = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
                
                    r3 = ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.a + 35;
                    ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.b = r3 % 128;
                    r3 = r3 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
                
                    r2.ae.h(r8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
                
                    r8 = ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.b;
                    r2 = r8 & 91;
                    r8 = (r8 ^ 91) | r2;
                    r3 = (r2 ^ r8) + ((r8 & r2) << 1);
                    ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.a = r3 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
                
                    if ((r3 % 2) == 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0130, code lost:
                
                    java.util.Collections.sort(r8, r2);
                    r8 = r7.c.am;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
                
                    r1.hashCode();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x013a, code lost:
                
                    throw null;
                 */
                @Override // ivas.gov.bisp.enumeration.p024ax.I
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onSuccess(org.json.JSONObject r8) {
                    /*
                        Method dump skipped, instruction units count: 469
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.TokenActivity.AnonymousClass4.onSuccess(org.json.JSONObject):void");
                }
            });
            int i2 = p + 31;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 3;
            }
        } catch (JSONException unused) {
        }
        Object obj = null;
        if (!this.aa.booleanValue()) {
            int i4 = q + 79;
            p = i4 % 128;
            int i5 = i4 % 2;
            if (BISPApplication.e == -1) {
                int i6 = p + 1;
                q = i6 % 128;
                int i7 = i6 % 2;
                Objects.requireNonNull(this.R);
                int i8 = q + 53;
                p = i8 % 128;
                try {
                    BISPApplication.e = i8 % 2 == 0 ? ((Random) Random.class.getDeclaredConstructor(null).newInstance(null)).nextInt(30) * 2 : ((Random) Random.class.getDeclaredConstructor(null).newInstance(null)).nextInt(6) + 5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            new G(this, new OooOO0O()).execute(new Void[0]);
            int i9 = p + 27;
            q = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = q + 5;
        p = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i;
        Button button;
        int i2 = 2 % 2;
        super.t();
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ad = new ProgressDialog(this);
        Log.e("TokenActivity", "onCreate:Progress Dialog");
        this.aj = new SessionManager(this);
        this.af = (RecyclerView) findViewById(R.id.token_recyclerView);
        this.ag = (TextView) findViewById(R.id.no_token_textView);
        this.ai = (Button) findViewById(R.id.processed_button);
        this.ak = (Button) findViewById(R.id.denied_button);
        this.al = (LinearLayout) findViewById(R.id.token_button_linearlayout);
        this.ah = new ArrayList<>();
        this.af.setLayoutManager(new LinearLayoutManager(1, false));
        AdapterTokens adapterTokens = new AdapterTokens(this, this.aj.y(), this.ah, this);
        this.ae = adapterTokens;
        this.af.setAdapter(adapterTokens);
        SessionManager sessionManager = this.aj;
        sessionManager.d.putString("token_cnic", BuildConfig.FLAVOR);
        sessionManager.d.apply();
        sessionManager.d.commit();
        EditText editText = (EditText) findViewById(R.id.search_token_editText);
        this.am = editText;
        editText.addTextChangedListener(new OooO00o());
        if (this.aj.c.getInt("tokenSkip", 0) == 1) {
            int i3 = p + 99;
            q = i3 % 128;
            if (i3 % 2 != 0) {
                this.ai.setVisibility(10);
                button = this.ak;
                i = 79;
            } else {
                i = 8;
                this.ai.setVisibility(8);
                button = this.ak;
            }
            button.setVisibility(i);
        } else {
            this.ai.setVisibility(0);
            this.ak.setVisibility(0);
        }
        this.ai.setOnClickListener(new OooO0O0());
        this.ak.setOnClickListener(new OooO0OO());
        int i4 = q + 115;
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        i iVar = new i();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = a$s17$812;
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
            int i8 = $11 + 107;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char c = 0;
            while (iVar.b < i4) {
                if (bArr[iVar.b] == 1) {
                    int i10 = $10 + 113;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[iVar.b] = (char) (((cArr3[iVar.b] * 2) + 1) - c);
                } else {
                    cArr4[iVar.b] = (char) ((cArr3[iVar.b] * 2) - c);
                }
                c = cArr4[iVar.b];
                iVar.b++;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (!(!z)) {
            int i13 = $11 + 51;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            iVar.b = 0;
            while (iVar.b < i4) {
                cArr6[iVar.b] = cArr3[(i4 - iVar.b) - 1];
                iVar.b++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $10 + 37;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                iVar.b = 1;
            } else {
                iVar.b = 0;
            }
            while (iVar.b < i4) {
                int i16 = $11 + 11;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] / iArr[4]);
                    i = iVar.b - 1;
                } else {
                    cArr3[iVar.b] = (char) (cArr3[iVar.b] - iArr[2]);
                    i = iVar.b + 1;
                }
                iVar.b = i;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
