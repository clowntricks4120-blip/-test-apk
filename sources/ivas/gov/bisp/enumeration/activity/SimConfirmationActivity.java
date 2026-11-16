package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.bK.ao;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.lib_mobile;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0191t;
import ivas.gov.bisp.enumeration.p036bi.aE;
import ivas.gov.bisp.enumeration.p036bi.aL;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.NoPasteEditText;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SimConfirmationActivity extends AppCompatActivity {
    private static int p = 1;
    private static int q;
    public static final /* synthetic */ int r = 0;
    public ProgressBar D;
    public LinearLayout F;
    public ImageView G;
    public SessionManager H;
    public TextView I;
    public AppDatabase J;
    public ArrayList<lib_mobile> L;
    public NoPasteEditText s;
    public EditText t;
    public NoPasteEditText u;
    public Button w;
    public Button x;
    public Spinner y;
    public LinearLayout z;
    public boolean v = false;
    public boolean B = false;
    public String A = BuildConfig.FLAVOR;
    public String C = BuildConfig.FLAVOR;
    public String E = BuildConfig.FLAVOR;
    public String K = BuildConfig.FLAVOR;
    public boolean M = true;
    public AlertDialog N = null;

    public class OooO implements ActionMode.Callback {
        private static int a = 1;
        private static int b;

        public OooO(SimConfirmationActivity simConfirmationActivity) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 65;
            int i4 = (i2 ^ 65) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            return i5 % 2 != 0;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 & 92) + (i2 | 92)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 121;
            int i6 = (((i2 ^ 121) | i5) << 1) - ((i2 | 121) & (~i5));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 31 / 0;
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-114)) | ((~i2) & 113)) - (~(-(-((i2 & 113) << 1))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 73;
            int i4 = -(-((i2 & 73) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            SimConfirmationActivity simConfirmationActivity = SimConfirmationActivity.this;
            w wVar = new w(simConfirmationActivity, simConfirmationActivity.H);
            int i3 = a + 17;
            b = i3 % 128;
            int i4 = i3 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i5 = a;
            int i6 = i5 & 21;
            int i7 = (i5 | 21) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 60 / 0;
            }
        }
    }

    public class OooOO0 implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOO0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = (i2 ^ 107) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            SimConfirmationActivity.p(SimConfirmationActivity.this);
            if (i6 == 0) {
                int i7 = 28 / 0;
            }
            int i8 = b;
            int i9 = (i8 ^ 87) + ((i8 & 87) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0O implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOO0O() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b + 34;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            SimConfirmationActivity.p(SimConfirmationActivity.this);
            if (i4 == 0) {
                throw null;
            }
        }
    }

    public class OooOOO implements ActionMode.Callback {
        private static int a = 1;
        private static int b;

        public OooOOO(SimConfirmationActivity simConfirmationActivity) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 & 49;
            int i6 = i5 + ((i2 ^ 49) | i5);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 0 / 0;
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 46) << 1) - (i2 ^ 46);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 17;
            int i4 = ((i2 ^ 17) | i3) << 1;
            int i5 = -((i2 | 17) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            return i6 % 2 != 0;
        }
    }

    public class OooOOO0 implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooOOO0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b + 99;
            a = i2 % 128;
            int i3 = i2 % 2;
            SimConfirmationActivity.p(SimConfirmationActivity.this);
            int i4 = b + 79;
            a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public class OooOOOO implements ActionMode.Callback {
        private static int a = 0;
        private static int b = 1;

        public OooOOOO(SimConfirmationActivity simConfirmationActivity) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 7;
            int i4 = ((i2 | 7) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            int i7 = i5 & 83;
            int i8 = -(-(i5 | 83));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 63) + (i2 | 63);
            b = i3 % 128;
            return i3 % 2 == 0;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - (((i2 ^ 80) + ((i2 & 80) << 1)) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 21;
            int i4 = i3 + ((i2 ^ 21) | i3);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = i5 ^ 43;
            int i8 = -(-((i5 & 43) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
    }

    public class OooOo00 implements TextWatcher {
        private static int a = 0;
        private static int b = 1;
        public boolean c;

        public OooOo00() {
        }

        /* JADX WARN: Code duplicated, block: B:48:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:68:0x0293  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z;
            String str;
            SimConfirmationActivity simConfirmationActivity;
            NoPasteEditText noPasteEditText;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 31;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.c) {
                int i4 = i2 ^ 105;
                int i5 = ((i2 & 105) | i4) << 1;
                int i6 = -i4;
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                b = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            this.c = true;
            String strReplaceAll = editable.toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
            int i9 = b;
            int i10 = (i9 & 5) + (i9 | 5);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                strReplaceAll.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (strReplaceAll.isEmpty()) {
                int i11 = a;
                int i12 = i11 & 39;
                int i13 = ((i11 ^ 39) | i12) << 1;
                int i14 = -((i11 | 39) & (~i12));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                SimConfirmationActivity.this.t.removeTextChangedListener(this);
                int i17 = b;
                int i18 = i17 & 87;
                int i19 = (i18 - (~((i17 ^ 87) | i18))) - 1;
                a = i19 % 128;
                int i20 = i19 % 2;
                SimConfirmationActivity.this.t.setText(BuildConfig.FLAVOR);
                int i21 = b + 1;
                a = i21 % 128;
                int i22 = i21 % 2;
                SimConfirmationActivity.this.t.addTextChangedListener(this);
                int i23 = a;
                int i24 = (i23 | 109) << 1;
                int i25 = -(i23 ^ 109);
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    this.c = false;
                    return;
                } else {
                    this.c = false;
                    obj.hashCode();
                    throw null;
                }
            }
            if (strReplaceAll.length() < 13) {
                int i27 = b;
                int i28 = (((i27 & (-70)) | ((~i27) & 69)) - (~(-(-((i27 & 69) << 1))))) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
                SimConfirmationActivity.this.z.setVisibility(8);
                int i30 = b;
                int i31 = i30 ^ 57;
                int i32 = -(-((i30 & 57) << 1));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                a = i33 % 128;
                if (i33 % 2 != 0) {
                    simConfirmationActivity = SimConfirmationActivity.this;
                    simConfirmationActivity.s.setTransformationMethod(null);
                    int i34 = 47 / 0;
                } else {
                    simConfirmationActivity = SimConfirmationActivity.this;
                    simConfirmationActivity.s.setTransformationMethod(null);
                }
                int i35 = a;
                int i36 = i35 & 25;
                int i37 = (i35 | 25) & (~i36);
                int i38 = i36 << 1;
                int i39 = (i37 & i38) + (i37 | i38);
                b = i39 % 128;
                if (i39 % 2 == 0) {
                    simConfirmationActivity.u.setTransformationMethod(null);
                    noPasteEditText = simConfirmationActivity.s;
                    int i40 = 61 / 0;
                } else {
                    simConfirmationActivity.u.setTransformationMethod(null);
                    noPasteEditText = simConfirmationActivity.s;
                }
                int i41 = b + 25;
                a = i41 % 128;
                int i42 = i41 % 2;
                noPasteEditText.setText(BuildConfig.FLAVOR);
                simConfirmationActivity.u.setText(BuildConfig.FLAVOR);
                int i43 = b;
                int i44 = ((((i43 ^ 1) | (i43 & 1)) << 1) - (~(-(((~i43) & 1) | (i43 & (-2)))))) - 1;
                a = i44 % 128;
                if (i44 % 2 != 0) {
                    simConfirmationActivity.t.requestFocus();
                    int i45 = 16 / 0;
                } else {
                    simConfirmationActivity.t.requestFocus();
                }
                int i46 = a + 43;
                b = i46 % 128;
                int i47 = i46 % 2;
            }
            if (strReplaceAll.length() > 13) {
                int i48 = a;
                int i49 = ((i48 | 126) << 1) - (i48 ^ 126);
                int i50 = (i49 ^ (-1)) + (i49 << 1);
                b = i50 % 128;
                int i51 = i50 % 2;
                strReplaceAll = strReplaceAll.substring(0, 13);
                int i52 = b;
                int i53 = (((i52 & (-62)) | ((~i52) & 61)) - (~(-(-((i52 & 61) << 1))))) - 1;
                a = i53 % 128;
                int i54 = i53 % 2;
            }
            StringBuilder sb = new StringBuilder();
            String string = editable.toString();
            int i55 = b;
            int i56 = i55 & 41;
            int i57 = i56 + ((i55 ^ 41) | i56);
            a = i57 % 128;
            int i58 = i57 % 2;
            if (string.length() != 5) {
                int i59 = a;
                int i60 = ((~i59) & 107) | (i59 & (-108));
                int i61 = (i59 & 107) << 1;
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                b = i62 % 128;
                if (i62 % 2 != 0 ? editable.toString().length() == 13 : editable.toString().length() == 57) {
                    SimConfirmationActivity.this.A = editable.toString();
                    int i63 = a;
                    int i64 = i63 & 103;
                    int i65 = (i63 | 103) & (~i64);
                    int i66 = -(-(i64 << 1));
                    int i67 = (i65 & i66) + (i65 | i66);
                    b = i67 % 128;
                    int i68 = i67 % 2;
                } else {
                    int i69 = b + 12;
                    int i70 = (i69 ^ (-1)) + (i69 << 1);
                    a = i70 % 128;
                    int i71 = i70 % 2;
                    SimConfirmationActivity.this.A = BuildConfig.FLAVOR;
                    int i72 = b;
                    int i73 = ((i72 | 11) << 1) - (i72 ^ 11);
                    a = i73 % 128;
                    if (i73 % 2 != 0) {
                        int i74 = 3 % 3;
                    }
                }
            } else {
                SimConfirmationActivity.this.A = editable.toString();
                int i610 = a;
                int i611 = i610 & 103;
                int i612 = (i610 | 103) & (~i611);
                int i613 = -(-(i611 << 1));
                int i614 = (i612 & i613) + (i612 | i613);
                b = i614 % 128;
                int i615 = i614 % 2;
            }
            if (SimConfirmationActivity.this.A.length() != 5) {
                int i75 = a;
                int i76 = i75 & 115;
                int i77 = ((i75 | 115) & (~i76)) + (i76 << 1);
                b = i77 % 128;
                if (i77 % 2 != 0 ? SimConfirmationActivity.this.A.length() != 13 : SimConfirmationActivity.this.A.length() != 66) {
                    int i78 = b;
                    int i79 = i78 & 17;
                    int i80 = i79 + ((i78 ^ 17) | i79);
                    a = i80 % 128;
                    int i81 = i80 % 2;
                    int i82 = 0;
                    while (i82 < strReplaceAll.length()) {
                        int i83 = a + 107;
                        b = i83 % 128;
                        int i84 = i83 % 2;
                        sb.append(strReplaceAll.charAt(i82));
                        if (i82 != 4) {
                            int i85 = b;
                            int i86 = (i85 & (-28)) | (27 & (~i85));
                            int i87 = -(-((i85 & 27) << 1));
                            int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                            a = i88 % 128;
                            if (i88 % 2 != 0) {
                                if (i82 == 66) {
                                    sb.append("-");
                                    int i89 = b;
                                    int i90 = i89 & 89;
                                    int i91 = i90 + ((i89 ^ 89) | i90);
                                    a = i91 % 128;
                                    int i92 = i91 % 2;
                                }
                            } else if (i82 == 11) {
                                sb.append("-");
                                int i810 = b;
                                int i93 = i810 & 89;
                                int i94 = i93 + ((i810 ^ 89) | i93);
                                a = i94 % 128;
                                int i95 = i94 % 2;
                            }
                        } else {
                            sb.append("-");
                            int i811 = b;
                            int i96 = i811 & 89;
                            int i97 = i96 + ((i811 ^ 89) | i96);
                            a = i97 % 128;
                            int i98 = i97 % 2;
                        }
                        i82 = (i82 | 1) + (i82 & 1);
                        int i99 = b;
                        int i100 = i99 & 45;
                        int i101 = (i100 - (~((i99 ^ 45) | i100))) - 1;
                        a = i101 % 128;
                        int i102 = i101 % 2;
                    }
                    SimConfirmationActivity.this.t.removeTextChangedListener(this);
                    EditText editText = SimConfirmationActivity.this.t;
                    int i103 = a;
                    int i104 = (((i103 & (-56)) | ((~i103) & 55)) - (~((i103 & 55) << 1))) - 1;
                    b = i104 % 128;
                    int i105 = i104 % 2;
                    editText.setText(sb);
                    EditText editText2 = SimConfirmationActivity.this.t;
                    int length = sb.length();
                    int i106 = b;
                    int i107 = (i106 ^ 75) + ((i106 & 75) << 1);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    editText2.setSelection(length);
                    SimConfirmationActivity.this.t.addTextChangedListener(this);
                    int i109 = b;
                    int i110 = ((i109 | 109) << 1) - (i109 ^ 109);
                    a = i110 % 128;
                    if (i110 % 2 != 0) {
                        int i111 = 5 % 4;
                    }
                }
            }
            Button button = SimConfirmationActivity.this.x;
            if (strReplaceAll.length() != 13) {
                int i112 = b;
                int i113 = i112 & 79;
                int i114 = ((i112 | 79) & (~i113)) + (i113 << 1);
                int i115 = i114 % 128;
                a = i115;
                int i116 = i114 % 2;
                int i117 = i115 & 75;
                int i118 = (i115 | 75) & (~i117);
                int i119 = -(-(i117 << 1));
                int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                b = i120 % 128;
                int i121 = i120 % 2;
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
            Button button2 = SimConfirmationActivity.this.x;
            int i122 = a;
            int i123 = i122 & 71;
            int i124 = i122 | 71;
            int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
            b = i125 % 128;
            if (i125 % 2 != 0 ? strReplaceAll.length() != 13 : strReplaceAll.length() != 94) {
                int i126 = a;
                int i127 = i126 ^ 107;
                int i128 = (((i126 & 107) | i127) << 1) - i127;
                b = i128 % 128;
                if (i128 % 2 == 0) {
                    int i129 = 4 % 3;
                }
                str = "#9E9E9E";
            } else {
                int i130 = b;
                int i131 = i130 & 49;
                int i132 = i131 + ((i130 ^ 49) | i131);
                a = i132 % 128;
                int i133 = i132 % 2;
                str = "#4CAF50";
            }
            button2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
            int i134 = a;
            int i135 = (i134 ^ 69) + ((i134 & 69) << 1);
            b = i135 % 128;
            int i136 = i135 % 2;
            this.c = false;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 & 72) + (i5 | 72)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 37;
            int i7 = (((i5 ^ 37) | i6) << 1) - ((i5 | 37) & (~i6));
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 16) << 1) - (i2 ^ 16)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 79;
            int i5 = -(-((i3 ^ 79) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (i != 0) {
                SimConfirmationActivity simConfirmationActivity = SimConfirmationActivity.this;
                simConfirmationActivity.M = true;
                SimConfirmationActivity.o(simConfirmationActivity);
                int i9 = a;
                int i10 = ((i9 ^ 74) + ((i9 & 74) << 1)) - 1;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i11 = ((i7 ^ 108) + ((i7 & 108) << 1)) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            SimConfirmationActivity.this.M = true;
            int i13 = a;
            int i14 = (((i13 ^ 15) | (i13 & 15)) << 1) - (((~i13) & 15) | (i13 & (-16)));
            b = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:33:0x011c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0123  */
    /* JADX WARN: Code duplicated, block: B:39:0x0138  */
    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0169  */
    /* JADX WARN: Code duplicated, block: B:45:0x0182  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0206  */
    /* JADX WARN: Code duplicated, block: B:63:0x020f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0214  */
    /* JADX WARN: Code duplicated, block: B:67:0x0216  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0249  */
    /* JADX WARN: Code duplicated, block: B:74:0x0289 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x028a  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static void o(SimConfirmationActivity simConfirmationActivity) {
        String strP;
        boolean z;
        boolean z2;
        boolean zEquals;
        int i;
        Object obj;
        int color;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String strTrim;
        StringBuilder sb;
        int i7;
        String string;
        StringBuilder sbB;
        String strQ;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        int i12 = q;
        int i13 = i12 ^ 33;
        int i14 = -(-((i12 & 33) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        p = i15 % 128;
        boolean z3 = false;
        if (i15 % 2 == 0) {
            strP = ivas.gov.bisp.enumeration.p091n.j.p(simConfirmationActivity.s, "[^\\d]", BuildConfig.FLAVOR);
            int i16 = 49 / 0;
        } else {
            strP = ivas.gov.bisp.enumeration.p091n.j.p(simConfirmationActivity.s, "[^\\d]", BuildConfig.FLAVOR);
        }
        int i17 = p;
        int i18 = i17 & 113;
        int i19 = (i17 | 113) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        q = i21 % 128;
        int i22 = i21 % 2;
        String strP2 = ivas.gov.bisp.enumeration.p091n.j.p(simConfirmationActivity.u, "[^\\d]", BuildConfig.FLAVOR);
        int i23 = p;
        int i24 = (i23 & (-112)) | ((~i23) & 111);
        int i25 = -(-((i23 & 111) << 1));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        q = i26 % 128;
        if (i26 % 2 != 0) {
            if (strP.length() == 5) {
                z = false;
                if (strP2.length() == 11) {
                    int i27 = p;
                    int i28 = i27 & 39;
                    int i29 = (~i28) & (i27 | 39);
                    int i30 = -(-(i28 << 1));
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    q = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = (i27 & (-110)) | ((~i27) & 109);
                    int i34 = (i27 & 109) << 1;
                    int i35 = (i33 & i34) + (i34 | i33);
                    q = i35 % 128;
                    int i36 = i35 % 2;
                    z2 = true;
                }
                zEquals = strP.equals(strP2);
                simConfirmationActivity.y.getSelectedItemPosition();
                i = p;
                int i37 = i | 77;
                int i38 = ((i37 << 1) - (~(-(i37 & (~(i & 77)))))) - 1;
                q = i38 % 128;
                int i39 = i38 % 2;
                if (z2) {
                    int i40 = ((i | 101) << 1) - (i ^ 101);
                    q = i40 % 128;
                    int i41 = i40 % 2;
                    if (!zEquals) {
                        int i42 = i | 67;
                        int i43 = i42 << 1;
                        int i44 = -((~(i & 67)) & i42);
                        i9 = (i43 ^ i44) + ((i44 & i43) << 1);
                        q = i9 % 128;
                        if (i9 % 2 != 0 ? strP2.length() == 11 : strP2.length() == 88) {
                            simConfirmationActivity.s();
                            simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
                            i10 = q + 27;
                            p = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i45 = 75 / 0;
                                return;
                            }
                            return;
                        }
                    }
                }
                obj = null;
                if (z2) {
                    int i46 = p;
                    i5 = (((i46 ^ 11) | (i46 & 11)) << 1) - ((11 & (~i46)) | (i46 & (-12)));
                    i6 = i5 % 128;
                    q = i6;
                    if (i5 % 2 != 0) {
                        boolean z4 = simConfirmationActivity.M;
                        obj.hashCode();
                        throw null;
                    }
                    if (simConfirmationActivity.M) {
                        int i47 = (i6 ^ 71) + ((i6 & 71) << 1);
                        p = i47 % 128;
                        int i48 = i47 % 2;
                        strTrim = simConfirmationActivity.y.getSelectedItem().toString().trim();
                        int i49 = q;
                        int i50 = ((i49 ^ 6) + ((i49 & 6) << 1)) - 1;
                        p = i50 % 128;
                        int i51 = i50 % 2;
                        if (!simConfirmationActivity.u(strP, strTrim)) {
                            simConfirmationActivity.s();
                            sb = new StringBuilder();
                            int i52 = q;
                            i7 = (i52 ^ 81) + ((i52 & 81) << 1);
                            p = i7 % 128;
                            if (i7 % 2 == 0) {
                                sb.append("Invalid Number for ");
                                sb.append(strTrim);
                                sb.toString();
                                obj.hashCode();
                                throw null;
                            }
                            sb.append("Invalid Number for ");
                            sb.append(strTrim);
                            string = sb.toString();
                            sbB = P.b(strTrim, " codes are only ");
                            strQ = simConfirmationActivity.q(strTrim);
                            int i53 = p;
                            i8 = ((i53 | 23) << 1) - (i53 ^ 23);
                            q = i8 % 128;
                            if (i8 % 2 != 0) {
                                sbB.append(strQ);
                                sbB.append(".");
                                sbB.toString();
                                obj.hashCode();
                                throw null;
                            }
                            sbB.append(strQ);
                            sbB.append(".");
                            String string2 = sbB.toString();
                            int i54 = q + 59;
                            p = i54 % 128;
                            int i55 = i54 % 2;
                            simConfirmationActivity.t(string, string2);
                            int i56 = q + 61;
                            p = i56 % 128;
                            int i57 = i56 % 2;
                            return;
                        }
                    }
                }
                if (z2) {
                    int i58 = p + 109;
                    i3 = i58 % 128;
                    q = i3;
                    int i59 = i58 % 2;
                    if (!(!zEquals)) {
                        i4 = (((i3 | 36) << 1) - (i3 ^ 36)) - 1;
                        p = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i60 = 53 / 0;
                            if (!(!simConfirmationActivity.M)) {
                                z3 = z;
                            } else {
                                int i61 = p;
                                int i62 = ((i61 | 67) << 1) - (i61 ^ 67);
                                q = i62 % 128;
                                int i63 = i62 % 2;
                            }
                        } else if (simConfirmationActivity.M) {
                            z3 = z;
                        } else {
                            int i64 = p;
                            int i65 = ((i64 | 67) << 1) - (i64 ^ 67);
                            q = i65 % 128;
                            int i66 = i65 % 2;
                        }
                    } else {
                        int i67 = p;
                        int i68 = ((i67 | 67) << 1) - (i67 ^ 67);
                        q = i68 % 128;
                        int i69 = i68 % 2;
                    }
                } else {
                    int i610 = p;
                    int i611 = ((i610 | 67) << 1) - (i610 ^ 67);
                    q = i611 % 128;
                    int i612 = i611 % 2;
                }
                simConfirmationActivity.w.setEnabled(z3);
                Button button = simConfirmationActivity.w;
                if (!z3) {
                    color = Color.parseColor("#9E9E9E");
                    int i70 = p;
                    int i71 = i70 ^ 57;
                    int i72 = ((i70 & 57) | i71) << 1;
                    int i73 = -i71;
                    int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                    q = i74 % 128;
                    int i75 = i74 % 2;
                } else {
                    int i76 = p;
                    int i77 = i76 & 39;
                    int i78 = -(-((i76 ^ 39) | i77));
                    int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                    q = i79 % 128;
                    int i80 = i79 % 2;
                    color = Color.parseColor("#4CAF50");
                    int i81 = q;
                    int i82 = i81 & 101;
                    int i83 = (i81 | 101) & (~i82);
                    int i84 = -(-(i82 << 1));
                    int i85 = (i83 & i84) + (i84 | i83);
                    p = i85 % 128;
                    int i86 = i85 % 2;
                }
                button.setBackgroundTintList(ColorStateList.valueOf(color));
                i2 = p + 83;
                q = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
            z = false;
        } else {
            if (strP.length() == 11) {
                z = true;
                if (strP2.length() == 11) {
                    int i210 = p;
                    int i211 = i210 & 39;
                    int i212 = (~i211) & (i210 | 39);
                    int i310 = -(-(i211 << 1));
                    int i311 = (i212 ^ i310) + ((i310 & i212) << 1);
                    q = i311 % 128;
                    int i312 = i311 % 2;
                    int i313 = (i210 & (-110)) | ((~i210) & 109);
                    int i314 = (i210 & 109) << 1;
                    int i315 = (i313 & i314) + (i314 | i313);
                    q = i315 % 128;
                    int i316 = i315 % 2;
                    z2 = true;
                }
                zEquals = strP.equals(strP2);
                simConfirmationActivity.y.getSelectedItemPosition();
                i = p;
                int i317 = i | 77;
                int i318 = ((i317 << 1) - (~(-(i317 & (~(i & 77)))))) - 1;
                q = i318 % 128;
                int i319 = i318 % 2;
                if (z2) {
                    int i410 = ((i | 101) << 1) - (i ^ 101);
                    q = i410 % 128;
                    int i411 = i410 % 2;
                    if (!zEquals) {
                        int i412 = i | 67;
                        int i413 = i412 << 1;
                        int i414 = -((~(i & 67)) & i412);
                        i9 = (i413 ^ i414) + ((i414 & i413) << 1);
                        q = i9 % 128;
                        if (i9 % 2 != 0) {
                            simConfirmationActivity.s();
                            simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
                            i10 = q + 27;
                            p = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i415 = 75 / 0;
                                return;
                            }
                            return;
                        }
                        simConfirmationActivity.s();
                        simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
                        i10 = q + 27;
                        p = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i416 = 75 / 0;
                            return;
                        }
                        return;
                    }
                }
                obj = null;
                if (z2) {
                    int i417 = p;
                    i5 = (((i417 ^ 11) | (i417 & 11)) << 1) - ((11 & (~i417)) | (i417 & (-12)));
                    i6 = i5 % 128;
                    q = i6;
                    if (i5 % 2 != 0) {
                        boolean z5 = simConfirmationActivity.M;
                        obj.hashCode();
                        throw null;
                    }
                    if (simConfirmationActivity.M) {
                        int i418 = (i6 ^ 71) + ((i6 & 71) << 1);
                        p = i418 % 128;
                        int i419 = i418 % 2;
                        strTrim = simConfirmationActivity.y.getSelectedItem().toString().trim();
                        int i420 = q;
                        int i510 = ((i420 ^ 6) + ((i420 & 6) << 1)) - 1;
                        p = i510 % 128;
                        int i511 = i510 % 2;
                        if (!simConfirmationActivity.u(strP, strTrim)) {
                            simConfirmationActivity.s();
                            sb = new StringBuilder();
                            int i512 = q;
                            i7 = (i512 ^ 81) + ((i512 & 81) << 1);
                            p = i7 % 128;
                            if (i7 % 2 == 0) {
                                sb.append("Invalid Number for ");
                                sb.append(strTrim);
                                sb.toString();
                                obj.hashCode();
                                throw null;
                            }
                            sb.append("Invalid Number for ");
                            sb.append(strTrim);
                            string = sb.toString();
                            sbB = P.b(strTrim, " codes are only ");
                            strQ = simConfirmationActivity.q(strTrim);
                            int i513 = p;
                            i8 = ((i513 | 23) << 1) - (i513 ^ 23);
                            q = i8 % 128;
                            if (i8 % 2 != 0) {
                                sbB.append(strQ);
                                sbB.append(".");
                                sbB.toString();
                                obj.hashCode();
                                throw null;
                            }
                            sbB.append(strQ);
                            sbB.append(".");
                            String string3 = sbB.toString();
                            int i514 = q + 59;
                            p = i514 % 128;
                            int i515 = i514 % 2;
                            simConfirmationActivity.t(string, string3);
                            int i516 = q + 61;
                            p = i516 % 128;
                            int i517 = i516 % 2;
                            return;
                        }
                    }
                }
                if (z2) {
                    int i518 = p + 109;
                    i3 = i518 % 128;
                    q = i3;
                    int i519 = i518 % 2;
                    if (!(!zEquals)) {
                        i4 = (((i3 | 36) << 1) - (i3 ^ 36)) - 1;
                        p = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i613 = 53 / 0;
                            if (!(!simConfirmationActivity.M)) {
                                z3 = z;
                            } else {
                                int i614 = p;
                                int i615 = ((i614 | 67) << 1) - (i614 ^ 67);
                                q = i615 % 128;
                                int i616 = i615 % 2;
                            }
                        } else if (simConfirmationActivity.M) {
                            int i617 = p;
                            int i618 = ((i617 | 67) << 1) - (i617 ^ 67);
                            q = i618 % 128;
                            int i619 = i618 % 2;
                        } else {
                            z3 = z;
                        }
                    } else {
                        int i6110 = p;
                        int i6111 = ((i6110 | 67) << 1) - (i6110 ^ 67);
                        q = i6111 % 128;
                        int i6112 = i6111 % 2;
                    }
                } else {
                    int i6113 = p;
                    int i6114 = ((i6113 | 67) << 1) - (i6113 ^ 67);
                    q = i6114 % 128;
                    int i6115 = i6114 % 2;
                }
                simConfirmationActivity.w.setEnabled(z3);
                Button button2 = simConfirmationActivity.w;
                if (!z3) {
                    color = Color.parseColor("#9E9E9E");
                    int i710 = p;
                    int i711 = i710 ^ 57;
                    int i712 = ((i710 & 57) | i711) << 1;
                    int i713 = -i711;
                    int i714 = ((i712 | i713) << 1) - (i712 ^ i713);
                    q = i714 % 128;
                    int i715 = i714 % 2;
                } else {
                    int i716 = p;
                    int i717 = i716 & 39;
                    int i718 = -(-((i716 ^ 39) | i717));
                    int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                    q = i719 % 128;
                    int i87 = i719 % 2;
                    color = Color.parseColor("#4CAF50");
                    int i88 = q;
                    int i89 = i88 & 101;
                    int i810 = (i88 | 101) & (~i89);
                    int i811 = -(-(i89 << 1));
                    int i812 = (i810 & i811) + (i811 | i810);
                    p = i812 % 128;
                    int i813 = i812 % 2;
                }
                button2.setBackgroundTintList(ColorStateList.valueOf(color));
                i2 = p + 83;
                q = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
            z = true;
        }
        int i90 = q;
        int i91 = (i90 | 39) << 1;
        int i92 = -(i90 ^ 39);
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        p = i93 % 128;
        int i94 = i93 % 2;
        z2 = false;
        zEquals = strP.equals(strP2);
        simConfirmationActivity.y.getSelectedItemPosition();
        i = p;
        int i3110 = i | 77;
        int i3111 = ((i3110 << 1) - (~(-(i3110 & (~(i & 77)))))) - 1;
        q = i3111 % 128;
        int i3112 = i3111 % 2;
        if (z2) {
            int i4110 = ((i | 101) << 1) - (i ^ 101);
            q = i4110 % 128;
            int i4111 = i4110 % 2;
            if (!zEquals) {
                int i4112 = i | 67;
                int i4113 = i4112 << 1;
                int i4114 = -((~(i & 67)) & i4112);
                i9 = (i4113 ^ i4114) + ((i4114 & i4113) << 1);
                q = i9 % 128;
                if (i9 % 2 != 0) {
                    simConfirmationActivity.s();
                    simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
                    i10 = q + 27;
                    p = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i4115 = 75 / 0;
                        return;
                    }
                    return;
                }
                simConfirmationActivity.s();
                simConfirmationActivity.t("Phone Numbers Mismatch", "The entered phone numbers do not match. Please verify both fields.");
                i10 = q + 27;
                p = i10 % 128;
                if (i10 % 2 == 0) {
                    int i4116 = 75 / 0;
                    return;
                }
                return;
            }
        }
        obj = null;
        if (z2) {
            int i4117 = p;
            i5 = (((i4117 ^ 11) | (i4117 & 11)) << 1) - ((11 & (~i4117)) | (i4117 & (-12)));
            i6 = i5 % 128;
            q = i6;
            if (i5 % 2 != 0) {
                boolean z6 = simConfirmationActivity.M;
                obj.hashCode();
                throw null;
            }
            if (simConfirmationActivity.M) {
                int i4118 = (i6 ^ 71) + ((i6 & 71) << 1);
                p = i4118 % 128;
                int i4119 = i4118 % 2;
                strTrim = simConfirmationActivity.y.getSelectedItem().toString().trim();
                int i421 = q;
                int i5110 = ((i421 ^ 6) + ((i421 & 6) << 1)) - 1;
                p = i5110 % 128;
                int i5111 = i5110 % 2;
                if (!simConfirmationActivity.u(strP, strTrim)) {
                    simConfirmationActivity.s();
                    sb = new StringBuilder();
                    int i5112 = q;
                    i7 = (i5112 ^ 81) + ((i5112 & 81) << 1);
                    p = i7 % 128;
                    if (i7 % 2 == 0) {
                        sb.append("Invalid Number for ");
                        sb.append(strTrim);
                        sb.toString();
                        obj.hashCode();
                        throw null;
                    }
                    sb.append("Invalid Number for ");
                    sb.append(strTrim);
                    string = sb.toString();
                    sbB = P.b(strTrim, " codes are only ");
                    strQ = simConfirmationActivity.q(strTrim);
                    int i5113 = p;
                    i8 = ((i5113 | 23) << 1) - (i5113 ^ 23);
                    q = i8 % 128;
                    if (i8 % 2 != 0) {
                        sbB.append(strQ);
                        sbB.append(".");
                        sbB.toString();
                        obj.hashCode();
                        throw null;
                    }
                    sbB.append(strQ);
                    sbB.append(".");
                    String string4 = sbB.toString();
                    int i5114 = q + 59;
                    p = i5114 % 128;
                    int i5115 = i5114 % 2;
                    simConfirmationActivity.t(string, string4);
                    int i5116 = q + 61;
                    p = i5116 % 128;
                    int i5117 = i5116 % 2;
                    return;
                }
            }
        }
        if (z2) {
            int i5118 = p + 109;
            i3 = i5118 % 128;
            q = i3;
            int i5119 = i5118 % 2;
            if (!(!zEquals)) {
                i4 = (((i3 | 36) << 1) - (i3 ^ 36)) - 1;
                p = i4 % 128;
                if (i4 % 2 == 0) {
                    int i6116 = 53 / 0;
                    if (!(!simConfirmationActivity.M)) {
                        z3 = z;
                    } else {
                        int i6117 = p;
                        int i6118 = ((i6117 | 67) << 1) - (i6117 ^ 67);
                        q = i6118 % 128;
                        int i6119 = i6118 % 2;
                    }
                } else if (simConfirmationActivity.M) {
                    int i61110 = p;
                    int i61111 = ((i61110 | 67) << 1) - (i61110 ^ 67);
                    q = i61111 % 128;
                    int i61112 = i61111 % 2;
                } else {
                    z3 = z;
                }
            } else {
                int i61113 = p;
                int i61114 = ((i61113 | 67) << 1) - (i61113 ^ 67);
                q = i61114 % 128;
                int i61115 = i61114 % 2;
            }
        } else {
            int i61116 = p;
            int i61117 = ((i61116 | 67) << 1) - (i61116 ^ 67);
            q = i61117 % 128;
            int i61118 = i61117 % 2;
        }
        simConfirmationActivity.w.setEnabled(z3);
        Button button3 = simConfirmationActivity.w;
        if (!z3) {
            color = Color.parseColor("#9E9E9E");
            int i7110 = p;
            int i7111 = i7110 ^ 57;
            int i7112 = ((i7110 & 57) | i7111) << 1;
            int i7113 = -i7111;
            int i7114 = ((i7112 | i7113) << 1) - (i7112 ^ i7113);
            q = i7114 % 128;
            int i7115 = i7114 % 2;
        } else {
            int i7116 = p;
            int i7117 = i7116 & 39;
            int i7118 = -(-((i7116 ^ 39) | i7117));
            int i7119 = (i7117 ^ i7118) + ((i7118 & i7117) << 1);
            q = i7119 % 128;
            int i814 = i7119 % 2;
            color = Color.parseColor("#4CAF50");
            int i815 = q;
            int i816 = i815 & 101;
            int i817 = (i815 | 101) & (~i816);
            int i818 = -(-(i816 << 1));
            int i819 = (i817 & i818) + (i818 | i817);
            p = i819 % 128;
            int i8110 = i819 % 2;
        }
        button3.setBackgroundTintList(ColorStateList.valueOf(color));
        i2 = p + 83;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x027b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ab A[SYNTHETIC] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Spinner spinner;
        lib_mobile next;
        String str;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = q;
        int i5 = ((i4 ^ 49) | (i4 & 49)) << 1;
        int i6 = -(((~i4) & 49) | (i4 & (-50)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        p = i7 % 128;
        int i8 = i7 % 2;
        super.onCreate(bundle);
        Object obj = null;
        if (!ao.b(this)) {
            int i9 = p;
            int i10 = i9 & 13;
            int i11 = ((((i9 ^ 13) | i10) << 1) - (~(-((i9 | 13) & (~i10))))) - 1;
            q = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        setContentView(R.layout.activity_sim_confirmation);
        this.D = (ProgressBar) findViewById(R.id.progress_loading);
        this.F = (LinearLayout) findViewById(R.id.checkCount);
        this.G = (ImageView) findViewById(R.id.checkCountImg);
        int i12 = p;
        int i13 = i12 & 79;
        int i14 = -(-(i12 | 79));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        q = i15 % 128;
        int i16 = i15 % 2;
        this.I = (TextView) findViewById(R.id.checkCountText);
        this.t = (EditText) findViewById(R.id.et_cnic);
        this.s = (NoPasteEditText) findViewById(R.id.et_phone);
        int i17 = p;
        int i18 = (((i17 & (-68)) | ((~i17) & 67)) - (~((i17 & 67) << 1))) - 1;
        q = i18 % 128;
        int i19 = 0;
        if (i18 % 2 != 0) {
            this.u = (NoPasteEditText) findViewById(R.id.et_confirm_phone);
            this.x = (Button) findViewById(R.id.btn_verify_cnic);
            this.w = (Button) findViewById(R.id.btn_submit);
            spinner = (Spinner) findViewById(R.id.sp_operator);
            int i20 = 20 / 0;
        } else {
            this.u = (NoPasteEditText) findViewById(R.id.et_confirm_phone);
            this.x = (Button) findViewById(R.id.btn_verify_cnic);
            this.w = (Button) findViewById(R.id.btn_submit);
            spinner = (Spinner) findViewById(R.id.sp_operator);
        }
        this.y = spinner;
        this.z = (LinearLayout) findViewById(R.id.layout_phone_section);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        r(this.u);
        r(this.s);
        this.s.setLongClickable(false);
        this.s.setTextIsSelectable(false);
        this.F.setOnClickListener(new OooOO0());
        this.G.setOnClickListener(new OooOO0O());
        this.I.setOnClickListener(new OooOOO0());
        this.s.setCustomSelectionActionModeCallback(new OooOOO(this));
        this.u.setLongClickable(false);
        this.u.setTextIsSelectable(false);
        this.u.setCustomSelectionActionModeCallback(new OooOOOO(this));
        this.t.addTextChangedListener(new OooOo00());
        this.x.setOnClickListener(new aE(this, i19));
        this.J = AppDatabase.l(this);
        ArrayList<lib_mobile> arrayList = new ArrayList<>(this.J.m().ao());
        this.L = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<lib_mobile> it = arrayList.iterator();
        int i21 = p;
        int i22 = (i21 & 17) + (i21 | 17);
        q = i22 % 128;
        int i23 = i22 % 2;
        while (it.hasNext()) {
            int i24 = p;
            int i25 = i24 ^ 77;
            int i26 = (i24 & 77) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            q = i27 % 128;
            if (i27 % 2 != 0) {
                next = it.next();
                int i28 = 78 / 0;
                if (next != null) {
                    str = next.provider;
                    if (str != null) {
                        int i29 = p;
                        int i30 = i29 & 41;
                        int i31 = (i29 ^ 41) | i30;
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        q = i32 % 128;
                        int i33 = i32 % 2;
                        if (!str.trim().isEmpty()) {
                            i = q + 47;
                            p = i % 128;
                            if (i % 2 != 0) {
                                arrayList2.add(next.provider.trim());
                                obj.hashCode();
                                throw null;
                            }
                            arrayList2.add(next.provider.trim());
                            int i34 = q;
                            int i35 = (i34 & 85) + (i34 | 85);
                            p = i35 % 128;
                            int i36 = i35 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                next = it.next();
                if (next != null) {
                    str = next.provider;
                    if (str != null) {
                        int i210 = p;
                        int i37 = i210 & 41;
                        int i38 = (i210 ^ 41) | i37;
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        q = i39 % 128;
                        int i310 = i39 % 2;
                        if (!str.trim().isEmpty()) {
                            i = q + 47;
                            p = i % 128;
                            if (i % 2 != 0) {
                                arrayList2.add(next.provider.trim());
                                obj.hashCode();
                                throw null;
                            }
                            arrayList2.add(next.provider.trim());
                            int i311 = q;
                            int i312 = (i311 & 85) + (i311 | 85);
                            p = i312 % 128;
                            int i313 = i312 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList2.size() == 1) {
            int i40 = p;
            int i41 = (i40 & 5) + (i40 | 5);
            q = i41 % 128;
            int i42 = i41 % 2;
            arrayList2.add("No options available");
            if (i42 != 0) {
                int i43 = 35 / 0;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item_custom, arrayList2);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.y.setAdapter((SpinnerAdapter) arrayAdapter);
        this.y.setOnItemSelectedListener(new OooO00o());
        this.s.addTextChangedListener(new OooO0O0());
        this.u.addTextChangedListener(new OooO0OO());
        final NoPasteEditText noPasteEditText = this.s;
        noPasteEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ivas.gov.bisp.enumeration.bi.aI
            private static int a = 1;
            private static int b;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i44 = 2 % 2;
                int i45 = b;
                int i46 = ((((i45 ^ 107) | (i45 & 107)) << 1) - (~(-(((~i45) & 107) | (i45 & (-108)))))) - 1;
                a = i46 % 128;
                Object obj2 = null;
                if (i46 % 2 == 0) {
                    int i47 = SimConfirmationActivity.r;
                    obj2.hashCode();
                    throw null;
                }
                EditText editText = noPasteEditText;
                int i48 = SimConfirmationActivity.r;
                if (!z) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    int i49 = a;
                    int i50 = ((i49 ^ 104) + ((i49 & 104) << 1)) - 1;
                    b = i50 % 128;
                    if (i50 % 2 != 0) {
                        int i51 = 21 / 0;
                        return;
                    }
                    return;
                }
                editText.setTransformationMethod(null);
                int length = editText.getText().length();
                int i52 = a;
                int i53 = ((i52 | 77) << 1) - (((~i52) & 77) | (i52 & (-78)));
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    editText.setSelection(length);
                    int i54 = 52 / 0;
                } else {
                    editText.setSelection(length);
                }
                int i55 = b;
                int i56 = i55 & 123;
                int i57 = -(-(i55 | 123));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                a = i58 % 128;
                int i59 = i58 % 2;
            }
        });
        final NoPasteEditText noPasteEditText2 = this.u;
        noPasteEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ivas.gov.bisp.enumeration.bi.aI
            private static int a = 1;
            private static int b;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i44 = 2 % 2;
                int i45 = b;
                int i46 = ((((i45 ^ 107) | (i45 & 107)) << 1) - (~(-(((~i45) & 107) | (i45 & (-108)))))) - 1;
                a = i46 % 128;
                Object obj2 = null;
                if (i46 % 2 == 0) {
                    int i47 = SimConfirmationActivity.r;
                    obj2.hashCode();
                    throw null;
                }
                EditText editText = noPasteEditText2;
                int i48 = SimConfirmationActivity.r;
                if (!z) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    int i49 = a;
                    int i50 = ((i49 ^ 104) + ((i49 & 104) << 1)) - 1;
                    b = i50 % 128;
                    if (i50 % 2 != 0) {
                        int i51 = 21 / 0;
                        return;
                    }
                    return;
                }
                editText.setTransformationMethod(null);
                int length = editText.getText().length();
                int i52 = a;
                int i53 = ((i52 | 77) << 1) - (((~i52) & 77) | (i52 & (-78)));
                b = i53 % 128;
                if (i53 % 2 != 0) {
                    editText.setSelection(length);
                    int i54 = 52 / 0;
                } else {
                    editText.setSelection(length);
                }
                int i55 = b;
                int i56 = i55 & 123;
                int i57 = -(-(i55 | 123));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                a = i58 % 128;
                int i59 = i58 % 2;
            }
        });
        this.w.setOnClickListener(new ViewOnClickListenerC0191t(this, i2));
        int i44 = p;
        int i45 = (i44 ^ 119) + ((i44 & 119) << 1);
        q = i45 % 128;
        int i46 = i45 % 2;
    }

    public final String q(String str) {
        int size;
        String strSubstring;
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        q = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.J.m().am(str).isEmpty();
            obj.hashCode();
            throw null;
        }
        List listAm = this.J.m().am(str);
        if (listAm.isEmpty()) {
            int i4 = (-2) - ((p + 100) ^ (-1));
            q = i4 % 128;
            int i5 = i4 % 2;
            return BuildConfig.FLAVOR;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listAm.iterator();
        int i6 = q;
        int i7 = (((i6 | 57) << 1) - (~(-(i6 ^ 57)))) - 1;
        int i8 = i7 % 128;
        p = i8;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i9 = i8 + 15;
        q = i9 % 128;
        int i10 = i9 % 2;
        while (it.hasNext()) {
            int i11 = q;
            int i12 = (i11 & (-44)) | ((~i11) & 43);
            int i13 = -(-((i11 & 43) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            p = i14 % 128;
            if (i14 % 2 == 0) {
                strSubstring = (String) it.next();
                int i15 = 99 / 0;
            } else {
                strSubstring = (String) it.next();
            }
            if (strSubstring.contains(".")) {
                int i16 = q;
                int i17 = (i16 & 3) + (i16 | 3);
                p = i17 % 128;
                int i18 = i17 % 2;
                strSubstring = strSubstring.substring(0, strSubstring.indexOf("."));
                int i19 = p;
                int i20 = (i19 & (-18)) | ((~i19) & 17);
                int i21 = -(-((i19 & 17) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                q = i22 % 128;
                int i23 = i22 % 2;
            }
            if (strSubstring.length() == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                int i24 = q;
                int i25 = (((i24 | 53) << 1) - (~(-(i24 ^ 53)))) - 1;
                p = i25 % 128;
                int i26 = i25 % 2;
                sb.append(strSubstring);
                arrayList.add(sb.toString());
                int i27 = p;
                int i28 = ((i27 | 25) << 1) - (i27 ^ 25);
                int i29 = i28 % 128;
                q = i29;
                int i30 = i28 % 2;
                int i31 = i29 + 21;
                p = i31 % 128;
                int i32 = i31 % 2;
            } else {
                arrayList.add(strSubstring);
                int i33 = p;
                int i34 = (((i33 | 67) << 1) - (~(-(((~i33) & 67) | (i33 & (-68)))))) - 1;
                q = i34 % 128;
                int i35 = i34 % 2;
            }
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 1) {
            int i36 = p;
            int i37 = i36 | 75;
            int i38 = i37 << 1;
            int i39 = -((~(i36 & 75)) & i37);
            int i40 = (i38 & i39) + (i39 | i38);
            q = i40 % 128;
            int i41 = i40 % 2;
            String str2 = (String) arrayList.get(0);
            int i42 = p + 53;
            q = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 40 / 0;
            }
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        int i44 = q;
        int i45 = (((i44 | 56) << 1) - (i44 ^ 56)) - 1;
        p = i45 % 128;
        int i46 = i45 % 2;
        sb2.append((String) arrayList.get(0));
        int i47 = q;
        int i48 = i47 & 81;
        int i49 = (i47 ^ 81) | i48;
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        p = i50 % 128;
        if (i50 % 2 == 0) {
            sb2.append(" to ");
            size = arrayList.size();
            int i51 = 91 / 0;
        } else {
            sb2.append(" to ");
            size = arrayList.size();
        }
        sb2.append((String) arrayList.get(size - 1));
        int i52 = q;
        int i53 = (i52 & 13) + (i52 | 13);
        p = i53 % 128;
        int i54 = i53 % 2;
        String string = sb2.toString();
        int i55 = q;
        int i56 = ((i55 ^ 57) | (i55 & 57)) << 1;
        int i57 = -(((~i55) & 57) | (i55 & (-58)));
        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
        p = i58 % 128;
        if (i58 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static void p(SimConfirmationActivity simConfirmationActivity) {
        int i = 2 % 2;
        Objects.requireNonNull(simConfirmationActivity);
        JSONObject jSONObject = new JSONObject();
        simConfirmationActivity.D.setVisibility(0);
        aL aLVar = new aL(simConfirmationActivity);
        int i2 = p;
        int i3 = ((i2 ^ 32) + ((i2 & 32) << 1)) - 1;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            ax.e(jSONObject, simConfirmationActivity, "https://meladeskapp.bisp.gov.pk/api/Roster/GetTodayEwalletCountByUser", aLVar);
            int i4 = 89 / 0;
        } else {
            ax.e(jSONObject, simConfirmationActivity, "https://meladeskapp.bisp.gov.pk/api/Roster/GetTodayEwalletCountByUser", aLVar);
        }
        int i5 = q;
        int i6 = i5 & 93;
        int i7 = -(-(i5 | 93));
        int i8 = (i6 & i7) + (i7 | i6);
        p = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void s() {
        int i = 2 % 2;
        int i2 = p + 11;
        q = i2 % 128;
        int i3 = i2 % 2;
        this.s.performHapticFeedback(0);
        NoPasteEditText noPasteEditText = this.u;
        int i4 = q;
        int i5 = i4 & 55;
        int i6 = ((((i4 ^ 55) | i5) << 1) - (~(-((i4 | 55) & (~i5))))) - 1;
        p = i6 % 128;
        if (i6 % 2 == 0) {
            noPasteEditText.performHapticFeedback(0);
            this.s.setTransformationMethod(null);
            throw null;
        }
        noPasteEditText.performHapticFeedback(0);
        this.s.setTransformationMethod(null);
        NoPasteEditText noPasteEditText2 = this.u;
        int i7 = p;
        int i8 = i7 & 27;
        int i9 = (i7 | 27) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i9 | i10);
        q = i11 % 128;
        int i12 = i11 % 2;
        noPasteEditText2.setTransformationMethod(null);
        this.s.setText(BuildConfig.FLAVOR);
        this.u.setText(BuildConfig.FLAVOR);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 12.0f, 0.0f, 0.0f);
        int i13 = p;
        int i14 = ((i13 & 24) + (i13 | 24)) - 1;
        q = i14 % 128;
        int i15 = i14 % 2;
        translateAnimation.setDuration(80L);
        translateAnimation.setRepeatCount(3);
        int i16 = p + 85;
        q = i16 % 128;
        int i17 = i16 % 2;
        translateAnimation.setRepeatMode(2);
        this.s.startAnimation(translateAnimation);
        NoPasteEditText noPasteEditText3 = this.u;
        int i18 = p;
        int i19 = i18 & 69;
        int i20 = (i18 ^ 69) | i19;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        q = i21 % 128;
        int i22 = i21 % 2;
        noPasteEditText3.startAnimation(translateAnimation);
        this.s.requestFocus();
        int i23 = p;
        int i24 = (i23 | 55) << 1;
        int i25 = -(i23 ^ 55);
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        q = i26 % 128;
        int i27 = i26 % 2;
    }

    public void v() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = q;
        int i3 = ((i2 & (-12)) | ((~i2) & 11)) + ((i2 & 11) << 1);
        p = i3 % 128;
        int i4 = i3 % 2;
        oooO0O0.e = "Session Expire";
        oooO0O0.f = "Session Expire Please Login Again.!";
        oooO0O0.k = false;
        OooO0o oooO0o = new OooO0o();
        int i5 = p;
        int i6 = (i5 ^ 39) + ((i5 & 39) << 1);
        q = i6 % 128;
        if (i6 % 2 == 0) {
            oooO0O0.h = "Confirm";
            oooO0O0.i = oooO0o;
            aiz.b().show();
        } else {
            oooO0O0.h = "Confirm";
            oooO0O0.i = oooO0o;
            aiz.b().show();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void r(final EditText editText) {
        int i = 2 % 2;
        editText.setLongClickable(false);
        editText.setTextIsSelectable(false);
        editText.setCustomSelectionActionModeCallback(new OooO(this));
        editText.setOnLongClickListener(new View.OnLongClickListener() { // from class: ivas.gov.bisp.enumeration.bi.aB
            private static int a = 1;
            private static int b;

            static {
                int i2 = b;
                int i3 = i2 & 49;
                int i4 = i3 + ((i2 ^ 49) | i3);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 84 / 0;
                }
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = (i3 ^ 84) + ((i3 & 84) << 1);
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = SimConfirmationActivity.r;
                int i8 = b;
                int i9 = i8 & 7;
                int i10 = ((i8 | 7) & (~i9)) + (i9 << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: ivas.gov.bisp.enumeration.bi.aG
            private static int a = 1;
            private static int b;

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                EditText editText2;
                Class<TextView> cls;
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 97;
                int i5 = ((((i3 ^ 97) | i4) << 1) - (~(-((i3 | 97) & (~i4))))) - 1;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    editText2 = editText;
                    int i6 = SimConfirmationActivity.r;
                    editText2.setShowSoftInputOnFocus(false);
                    cls = TextView.class;
                } else {
                    editText2 = editText;
                    int i7 = SimConfirmationActivity.r;
                    editText2.setShowSoftInputOnFocus(true);
                    cls = TextView.class;
                }
                int i8 = b;
                int i9 = (i8 ^ 23) + ((i8 & 23) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Field declaredField = cls.getDeclaredField("mEditor");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(editText2);
                    int i11 = b;
                    int i12 = (((i11 | 83) << 1) - (~(-(((~i11) & 83) | (i11 & (-84)))))) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    Class<?> cls2 = Class.forName("android.widget.Editor");
                    Field declaredField2 = cls2.getDeclaredField("mInsertionControllerEnabled");
                    int i14 = b;
                    int i15 = (i14 & 87) + (i14 | 87);
                    a = i15 % 128;
                    if (i15 % 2 == 0) {
                        declaredField2.setAccessible(false);
                    } else {
                        declaredField2.setAccessible(true);
                    }
                    declaredField2.setBoolean(obj, false);
                    Field declaredField3 = cls2.getDeclaredField("mSelectionControllerEnabled");
                    declaredField3.setAccessible(true);
                    declaredField3.setBoolean(obj, false);
                    int i16 = (-2) - ((a + 10) ^ (-1));
                    b = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 2 % 5;
                    }
                } catch (Exception unused) {
                }
                int i18 = a;
                int i19 = i18 & 63;
                int i20 = i19 + ((i18 ^ 63) | i19);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        };
        int i2 = p;
        int i3 = i2 ^ 105;
        int i4 = (i2 & 105) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        editText.setOnTouchListener(onTouchListener);
        editText.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() { // from class: ivas.gov.bisp.enumeration.bi.aF
            private static int a = 1;
            private static int b;

            static {
                int i7 = b;
                int i8 = i7 & 91;
                int i9 = (i8 - (~((i7 ^ 91) | i8))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // android.view.View.OnCreateContextMenuListener
            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                int i7 = 2 % 2;
                int i8 = a;
                int i9 = i8 & 67;
                int i10 = -(-((i8 ^ 67) | i9));
                int i11 = (i9 & i10) + (i10 | i9);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = SimConfirmationActivity.r;
                    contextMenu.clear();
                    throw null;
                }
                int i13 = SimConfirmationActivity.r;
                contextMenu.clear();
                int i14 = a;
                int i15 = i14 | 13;
                int i16 = i15 << 1;
                int i17 = -((~(i14 & 13)) & i15);
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i7 = q;
        int i8 = i7 & 57;
        int i9 = i8 + ((i7 ^ 57) | i8);
        p = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean u(String str, String str2) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 89;
        int i4 = ((((i2 ^ 89) | i3) << 1) - (~(-((i2 | 89) & (~i3))))) - 1;
        p = i4 % 128;
        int i5 = i4 % 2;
        if (str.length() < 4) {
            int i6 = p;
            int i7 = (i6 & 111) + (i6 | 111);
            q = i7 % 128;
            boolean z = i7 % 2 != 0;
            int i8 = ((i6 & 120) + (i6 | 120)) - 1;
            q = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 34 / 0;
            }
            return z;
        }
        String strSubstring = str.substring(0, 4);
        h hVarM = this.J.m();
        int i10 = (-2) - ((p + 58) ^ (-1));
        q = i10 % 128;
        int i11 = i10 % 2;
        int i12 = q;
        int i13 = i12 & 79;
        int i14 = (i12 | 79) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        p = i16 % 128;
        int i17 = i16 % 2;
        for (String strR : hVarM.am(str2)) {
            int i18 = p;
            int i19 = i18 & 125;
            int i20 = -(-((i18 ^ 125) | i19));
            int i21 = (i19 & i20) + (i20 | i19);
            q = i21 % 128;
            int i22 = i21 % 2;
            int i23 = q + 111;
            p = i23 % 128;
            int i24 = i23 % 2;
            if (strR.contains(".")) {
                int i25 = p;
                int i26 = i25 & 1;
                int i27 = (i26 - (~((i25 ^ 1) | i26))) - 1;
                q = i27 % 128;
                int i28 = i27 % 2;
                strR = strR.substring(0, strR.indexOf("."));
                int i29 = q;
                int i30 = i29 & 119;
                int i31 = ((i29 ^ 119) | i30) << 1;
                int i32 = -((~i30) & (i29 | 119));
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                p = i33 % 128;
                int i34 = i33 % 2;
                int i35 = (i29 & (-28)) | ((~i29) & 27);
                int i36 = -(-((i29 & 27) << 1));
                int i37 = (i35 & i36) + (i36 | i35);
                p = i37 % 128;
                int i38 = i37 % 2;
            }
            if (strR.length() == 3) {
                int i39 = p;
                int i40 = i39 & 35;
                int i41 = (i39 ^ 35) | i40;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                q = i42 % 128;
                if (i42 % 2 != 0) {
                    ivas.gov.bisp.enumeration.p091n.j.r("0", strR);
                    throw null;
                }
                strR = ivas.gov.bisp.enumeration.p091n.j.r("0", strR);
                int i43 = p;
                int i44 = i43 ^ 63;
                int i45 = -(-((i43 & 63) << 1));
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                q = i46 % 128;
                int i47 = i46 % 2;
            }
            if (strR.equals(strSubstring)) {
                int i48 = p;
                int i49 = i48 + 115;
                q = i49 % 128;
                int i50 = i49 % 2;
                int i51 = i48 + 41;
                q = i51 % 128;
                int i52 = i51 % 2;
                return true;
            }
        }
        int i53 = p;
        int i54 = ((i53 ^ 36) + ((i53 & 36) << 1)) - 1;
        q = i54 % 128;
        if (i54 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final void t(String str, String str2) {
        TextView textView;
        TextView textView2;
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = 1;
        int i5 = ((i3 | 31) << 1) - (i3 ^ 31);
        q = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AlertDialog alertDialog = this.N;
        if (alertDialog != null && alertDialog.isShowing()) {
            int i6 = q;
            int i7 = i6 & 87;
            int i8 = -(-(i6 | 87));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            p = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 0;
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        int i11 = p;
        int i12 = i11 & 47;
        int i13 = (i11 ^ 47) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        q = i14 % 128;
        int i15 = i14 % 2;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.custom_dialog_new, viewGroup, false);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        int i16 = p + 98;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        q = i17 % 128;
        if (i17 % 2 != 0) {
            this.N = alertDialogCreate;
            alertDialogCreate.setCancelable(true);
        } else {
            this.N = alertDialogCreate;
            alertDialogCreate.setCancelable(false);
        }
        this.N.setCanceledOnTouchOutside(false);
        this.N.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ivas.gov.bisp.enumeration.bi.aD
            private static int a = 1;
            private static int b;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i18 = 2 % 2;
                int i19 = a;
                int i20 = ((i19 ^ 29) | (i19 & 29)) << 1;
                int i21 = -(((~i19) & 29) | (i19 & (-30)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    this.c.N = null;
                    throw null;
                }
                this.c.N = null;
                int i23 = a;
                int i24 = ((i23 ^ 12) + ((i23 & 12) << 1)) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
        });
        this.N.show();
        int i18 = p + 30;
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        q = i19 % 128;
        int i20 = i19 % 2;
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_message);
        int i21 = p;
        int i22 = i21 & 69;
        int i23 = ((i21 ^ 69) | i22) << 1;
        int i24 = -((i21 | 69) & (~i22));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        q = i25 % 128;
        if (i25 % 2 != 0) {
            textView3.setText(str);
            textView4.setText(str2);
            textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
            int i26 = 24 / 0;
        } else {
            textView3.setText(str);
            textView4.setText(str2);
            textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        }
        int i27 = q;
        int i28 = i27 | 49;
        int i29 = (i28 << 1) - ((~(i27 & 49)) & i28);
        p = i29 % 128;
        if (i29 % 2 == 0) {
            textView2 = (TextView) viewInflate.findViewById(R.id.btn_no);
            i = 66;
        } else {
            textView2 = (TextView) viewInflate.findViewById(R.id.btn_no);
            i = 8;
        }
        textView2.setVisibility(i);
        textView.setText("OK");
        textView.setOnClickListener(new aE(this, i4));
        int i30 = q;
        int i31 = (i30 ^ 58) + ((i30 & 58) << 1);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        p = i32 % 128;
        if (i32 % 2 == 0) {
            throw null;
        }
    }

    public class OooO0O0 implements TextWatcher {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 & 118) + (i5 | 118)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 & (-64)) | ((~i5) & 63);
            int i7 = (i5 & 63) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0162  */
        /* JADX WARN: Code duplicated, block: B:49:0x0179  */
        /* JADX WARN: Code duplicated, block: B:75:0x0290  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SimConfirmationActivity simConfirmationActivity;
            String string;
            int i;
            SimConfirmationActivity simConfirmationActivity2;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 97;
            int i5 = (i3 ^ 97) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                boolean z = SimConfirmationActivity.this.v;
                throw null;
            }
            SimConfirmationActivity simConfirmationActivity3 = SimConfirmationActivity.this;
            if (simConfirmationActivity3.v) {
                int i7 = b;
                int i8 = ((i7 | 59) << 1) - (i7 ^ 59);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 32 / 0;
                    return;
                }
                return;
            }
            simConfirmationActivity3.v = true;
            String strReplaceAll = editable.toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
            int i10 = a;
            int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (strReplaceAll.isEmpty()) {
                int i13 = a + 1;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    SimConfirmationActivity.this.s.removeTextChangedListener(this);
                    obj.hashCode();
                    throw null;
                }
                SimConfirmationActivity.this.s.removeTextChangedListener(this);
                int i14 = a + 125;
                b = i14 % 128;
                if (i14 % 2 != 0) {
                    SimConfirmationActivity.this.s.setText(BuildConfig.FLAVOR);
                    int i15 = 12 / 0;
                } else {
                    SimConfirmationActivity.this.s.setText(BuildConfig.FLAVOR);
                }
                SimConfirmationActivity.this.s.addTextChangedListener(this);
                int i16 = a + 51;
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    simConfirmationActivity2 = SimConfirmationActivity.this;
                    simConfirmationActivity2.v = true;
                } else {
                    simConfirmationActivity2 = SimConfirmationActivity.this;
                    simConfirmationActivity2.v = false;
                }
                int i17 = a;
                int i18 = i17 & 81;
                int i19 = i18 + ((i17 ^ 81) | i18);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    SimConfirmationActivity.o(simConfirmationActivity2);
                    return;
                } else {
                    SimConfirmationActivity.o(simConfirmationActivity2);
                    obj.hashCode();
                    throw null;
                }
            }
            if (strReplaceAll.length() > 11) {
                int i20 = a;
                int i21 = ((((i20 ^ 99) | (i20 & 99)) << 1) - (~(-(((~i20) & 99) | (i20 & (-100)))))) - 1;
                b = i21 % 128;
                strReplaceAll = i21 % 2 != 0 ? strReplaceAll.substring(1, 5) : strReplaceAll.substring(0, 11);
                int i22 = a;
                int i23 = i22 & 109;
                int i24 = -(-((i22 ^ 109) | i23));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 3 % 4;
                }
            }
            StringBuilder sb = new StringBuilder();
            int length = editable.toString().length();
            int i27 = a;
            int i28 = ((i27 & (-16)) | ((~i27) & 15)) + ((i27 & 15) << 1);
            b = i28 % 128;
            int i29 = i28 % 2;
            if (length != 4) {
                int i30 = (i27 & 64) + (i27 | 64);
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                if (editable.toString().length() != 8) {
                    int i33 = b;
                    int i34 = i33 ^ 65;
                    int i35 = (i33 & 65) << 1;
                    int i36 = (i34 & i35) + (i35 | i34);
                    a = i36 % 128;
                    if (i36 % 2 == 0) {
                        SimConfirmationActivity.this.C = BuildConfig.FLAVOR;
                        int i37 = 90 / 0;
                    } else {
                        SimConfirmationActivity.this.C = BuildConfig.FLAVOR;
                    }
                } else {
                    simConfirmationActivity = SimConfirmationActivity.this;
                    string = editable.toString();
                    int i38 = a;
                    i = (((i38 | 80) << 1) - (i38 ^ 80)) - 1;
                    b = i % 128;
                    if (i % 2 == 0) {
                        simConfirmationActivity.C = string;
                        obj.hashCode();
                        throw null;
                    }
                    simConfirmationActivity.C = string;
                    int i39 = a;
                    int i40 = (i39 & 75) + (i39 | 75);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                }
            } else {
                simConfirmationActivity = SimConfirmationActivity.this;
                string = editable.toString();
                int i310 = a;
                i = (((i310 | 80) << 1) - (i310 ^ 80)) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    simConfirmationActivity.C = string;
                    obj.hashCode();
                    throw null;
                }
                simConfirmationActivity.C = string;
                int i311 = a;
                int i42 = (i311 & 75) + (i311 | 75);
                b = i42 % 128;
                int i43 = i42 % 2;
            }
            if (SimConfirmationActivity.this.C.length() != 4) {
                int i44 = a;
                int i45 = i44 & 97;
                int i46 = (((i44 ^ 97) | i45) << 1) - ((i44 | 97) & (~i45));
                b = i46 % 128;
                if (i46 % 2 == 0 ? SimConfirmationActivity.this.C.length() != 8 : SimConfirmationActivity.this.C.length() != 60) {
                    int i47 = b + 67;
                    int i48 = i47 % 128;
                    a = i48;
                    int i49 = i47 % 2;
                    int i50 = (i48 ^ 105) + ((i48 & 105) << 1);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = 0;
                    while (i52 < strReplaceAll.length()) {
                        int i53 = a + 95;
                        b = i53 % 128;
                        int i54 = i53 % 2;
                        sb.append(strReplaceAll.charAt(i52));
                        if (i52 == 3) {
                            int i55 = b;
                            int i56 = ((i55 ^ 114) + ((i55 & 114) << 1)) - 1;
                            a = i56 % 128;
                            if (i56 % 2 == 0) {
                                sb.append("-");
                                int i57 = 46 / 0;
                            } else {
                                sb.append("-");
                            }
                        }
                        i52 = ((i52 & 1) << 1) + (i52 ^ 1);
                        int i58 = a;
                        int i59 = ((i58 ^ 11) | (i58 & 11)) << 1;
                        int i60 = -(((~i58) & 11) | (i58 & (-12)));
                        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                        b = i61 % 128;
                        int i62 = i61 % 2;
                    }
                    SimConfirmationActivity.this.s.removeTextChangedListener(this);
                    SimConfirmationActivity simConfirmationActivity4 = SimConfirmationActivity.this;
                    int i63 = a;
                    int i64 = (i63 & (-84)) | ((~i63) & 83);
                    int i65 = (i63 & 83) << 1;
                    int i66 = (i64 & i65) + (i65 | i64);
                    b = i66 % 128;
                    int i67 = i66 % 2;
                    simConfirmationActivity4.s.setText(sb);
                    NoPasteEditText noPasteEditText = SimConfirmationActivity.this.s;
                    int i68 = b + 67;
                    a = i68 % 128;
                    int i69 = i68 % 2;
                    noPasteEditText.setSelection(sb.length());
                    NoPasteEditText noPasteEditText2 = SimConfirmationActivity.this.s;
                    int i70 = b + 3;
                    a = i70 % 128;
                    int i71 = i70 % 2;
                    noPasteEditText2.addTextChangedListener(this);
                    int i72 = b;
                    int i73 = ((i72 & 88) + (i72 | 88)) - 1;
                    a = i73 % 128;
                    int i74 = i73 % 2;
                }
            }
            SimConfirmationActivity simConfirmationActivity5 = SimConfirmationActivity.this;
            simConfirmationActivity5.v = false;
            SimConfirmationActivity.o(simConfirmationActivity5);
            int i75 = b;
            int i76 = (i75 & 5) + (i75 | 5);
            a = i76 % 128;
            if (i76 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 ^ 33) + ((i5 & 33) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 ^ 112) + ((i5 & 112) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
        
            if (r1.isEmpty() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r1 = r14 ^ 23;
            r14 = ((((r14 & 23) | r1) << 1) - (~(-r1))) - 1;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r14 % 128;
            r14 = r14 % 2;
            r13.c.u.removeTextChangedListener(r13);
            r14 = r13.c;
            r1 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r2 = r1 & 67;
            r1 = (r1 | 67) & (~r2);
            r2 = r2 << 1;
            r7 = (r1 ^ r2) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r7 % 128;
            r7 = r7 % 2;
            r14.u.setText(net.sqlcipher.BuildConfig.FLAVOR);
            r14 = r13.c.u;
            r1 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r2 = (((r1 & (-16)) | ((~r1) & 15)) - (~((r1 & 15) << 1))) - 1;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r2 % 128;
            r2 = r2 % 2;
            r14.addTextChangedListener(r13);
            r14 = r13.c;
            r14.B = false;
            r1 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r2 = r1 & 15;
            r1 = (r1 | 15) & (~r2);
            r2 = r2 << 1;
            r4 = (r1 ^ r2) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00bc, code lost:
        
            if ((r4 % 2) == 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
        
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.o(r14);
            r14 = 29 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
        
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.o(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
        
            if (r1.length() <= 11) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
        
            r2 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r8 = (r2 & 123) + (r2 | 123);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
        
            if ((r8 % 2) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
        
            r1 = r1.substring(0, 27);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
        
            r1 = r1.substring(0, 11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ea, code lost:
        
            r2 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a + 91;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
        
            r2 = new java.lang.StringBuilder();
            r7 = r14.toString().length();
            r8 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r9 = (r8 ^ 39) + ((r8 & 39) << 1);
            r8 = r9 % 128;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r8;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
        
            if (r7 == 4) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0112, code lost:
        
            r7 = (r8 & (-26)) | ((~r8) & 25);
            r8 = -(-((r8 & 25) << 1));
            r11 = ((r7 | r8) << 1) - (r7 ^ r8);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0127, code lost:
        
            if ((r11 % 2) == 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
        
            if (r14.toString().length() == 8) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
        
            if (r14.toString().length() == 8) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
        
            r13.c.E = net.sqlcipher.BuildConfig.FLAVOR;
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r4 = r14 & 31;
            r14 = r14 | 31;
            r7 = (r4 ^ r14) + ((r14 & r4) << 1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0153, code lost:
        
            r13.c.E = r14.toString();
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r4 = (((r14 & (-16)) | ((~r14) & 15)) - (~((r14 & 15) << 1))) - 1;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x016c, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0175, code lost:
        
            if (r13.c.E.length() == 4) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0177, code lost:
        
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r14 = (-2) - (((r14 & 42) + (r14 | 42)) ^ (-1));
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r14 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0187, code lost:
        
            if ((r14 % 2) != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0193, code lost:
        
            if (r13.c.E.length() == 70) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x019e, code lost:
        
            if (r13.c.E.length() == 8) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01a0, code lost:
        
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r7 = (r14 & 3) + (r14 | 3);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01ac, code lost:
        
            if ((r7 % 2) == 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01ae, code lost:
        
            r14 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01b0, code lost:
        
            r14 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01b5, code lost:
        
            if (r14 >= r1.length()) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01b7, code lost:
        
            r7 = (-2) - ((ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b + 28) ^ (-1));
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01c4, code lost:
        
            if ((r7 % 2) == 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01c6, code lost:
        
            r2.append(r1.charAt(r14));
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01ce, code lost:
        
            if (r14 != 5) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01d1, code lost:
        
            r2.append(r1.charAt(r14));
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01d8, code lost:
        
            if (r14 != 3) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01da, code lost:
        
            r7 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r9 = (r7 & 43) + (r7 | 43);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01e8, code lost:
        
            if ((r9 % 2) == 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01ea, code lost:
        
            r2.append("-");
            r7 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r10 = r7 & 17;
            r9 = (((r7 ^ 17) | r10) << 1) - ((r7 | 17) & (~r10));
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0200, code lost:
        
            r2.append("-");
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0203, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
        
            r7 = ((r14 | (-14)) << 1) - (((~r14) & (-14)) | (r14 & 13));
            r14 = (r7 & 16) + (r7 | 16);
            r14 = (r14 << 1) + (r14 ^ (-1));
            r7 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r9 = r7 & 15;
            r7 = (r7 | 15) & (~r9);
            r9 = r9 << 1;
            r10 = (r7 & r9) + (r7 | r9);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0229, code lost:
        
            r13.c.u.removeTextChangedListener(r13);
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r1 = (r14 | 71) << 1;
            r14 = -(((~r14) & 71) | (r14 & (-72)));
            r5 = ((r1 | r14) << 1) - (r14 ^ r1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r5 % 128;
            r5 = r5 % 2;
            r13.c.u.setText(r2);
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a;
            r1 = r14 & 23;
            r1 = (r1 - (~((r14 ^ 23) | r1))) - 1;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b = r1 % 128;
            r1 = r1 % 2;
            r14 = r13.c.u;
            r1 = r2.length();
            r2 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r5 = r2 & 19;
            r2 = -(-(r2 | 19));
            r7 = (r5 ^ r2) + ((r2 & r5) << 1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r7 % 128;
            r7 = r7 % 2;
            r14.setSelection(r1);
            r14 = r13.c.u;
            r1 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r2 = r1 & 59;
            r1 = (r1 ^ 59) | r2;
            r5 = (r2 & r1) + (r1 | r2);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x028e, code lost:
        
            if ((r5 % 2) != 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0290, code lost:
        
            r14.addTextChangedListener(r13);
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r1 = (((r14 | 36) << 1) - (r14 ^ 36)) - 1;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x02a3, code lost:
        
            r14.addTextChangedListener(r13);
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x02a9, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x02aa, code lost:
        
            r14 = r13.c;
            r14.B = false;
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.o(r14);
            r14 = ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.b;
            r2 = r14 & 57;
            r1 = ((r14 ^ 57) | r2) << 1;
            r14 = -((r14 | 57) & (~r2));
            r2 = (r1 ^ r14) + ((r14 & r1) << 1);
            ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x02c8, code lost:
        
            if ((r2 % 2) != 0) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x02ca, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x02cb, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x02ce, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
        
            if (r1.isEmpty() != false) goto L13;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void afterTextChanged(android.text.Editable r14) {
            /*
                Method dump skipped, instruction units count: 719
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.SimConfirmationActivity.OooO0OO.afterTextChanged(android.text.Editable):void");
        }
    }
}
