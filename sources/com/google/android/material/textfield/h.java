package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.U.l;

/* JADX INFO: loaded from: classes.dex */
public class h extends l {
    public final TextInputLayout.OooOO0 a;
    public final TextWatcher b;
    public final TextInputLayout.OooOO0O g;

    public class aPg extends ivas.gov.bisp.enumeration.P.l {
        public aPg() {
        }

        @Override // ivas.gov.bisp.enumeration.P.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar = h.this;
            hVar.e.setChecked(!h.b(hVar));
        }
    }

    public class aPh implements TextInputLayout.OooOO0 {
        public aPh() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public void b(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            h hVar = h.this;
            hVar.e.setChecked(!h.b(hVar));
            editText.removeTextChangedListener(h.this.b);
            editText.addTextChangedListener(h.this.b);
        }
    }

    public class aPi implements TextInputLayout.OooOO0O {

        public class aPj implements Runnable {
            public final /* synthetic */ EditText a;

            public aPj(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(h.this.b);
            }
        }

        public aPi() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public void b(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new aPj(editText));
        }
    }

    public class aPk implements View.OnClickListener {
        public aPk() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = h.this.c.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (h.b(h.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            h.this.c.z();
        }
    }

    public h(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.b = new aPg();
        this.a = new aPh();
        this.g = new aPi();
    }

    public static boolean b(h hVar) {
        EditText editText = hVar.c.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void c() {
        TextInputLayout textInputLayout = this.c;
        int i = this.f;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.c;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.c.setEndIconOnClickListener(new aPk());
        this.c.k(this.a);
        TextInputLayout textInputLayout3 = this.c;
        textInputLayout3.ah.add(this.g);
        EditText editText = this.c.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
