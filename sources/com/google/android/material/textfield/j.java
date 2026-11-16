package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.U.e;
import ivas.gov.bisp.enumeration.U.l;
import ivas.gov.bisp.enumeration.U.r;

/* JADX INFO: loaded from: classes.dex */
public class j extends l {
    public AnimatorSet a;
    public final View.OnFocusChangeListener b;
    public final TextWatcher g;
    public final TextInputLayout.OooOO0 h;
    public final TextInputLayout.OooOO0O i;
    public ValueAnimator j;

    public class aOP implements TextWatcher {
        public aOP() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (j.this.c.getSuffixText() != null) {
                return;
            }
            j jVar = j.this;
            jVar.f(j.b(jVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class aOQ implements View.OnFocusChangeListener {
        public aOQ() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            j jVar = j.this;
            jVar.f(j.b(jVar));
        }
    }

    public class aOR implements TextInputLayout.OooOO0 {
        public aOR() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public void b(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(j.b(j.this));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(j.this.b);
            j jVar = j.this;
            jVar.e.setOnFocusChangeListener(jVar.b);
            editText.removeTextChangedListener(j.this.g);
            editText.addTextChangedListener(j.this.g);
        }
    }

    public class aOS implements TextInputLayout.OooOO0O {

        public class aOT implements Runnable {
            public final /* synthetic */ EditText a;

            public aOT(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(j.this.g);
            }
        }

        public aOS() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public void b(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new aOT(editText));
            if (editText.getOnFocusChangeListener() == j.this.b) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = j.this.e.getOnFocusChangeListener();
            j jVar = j.this;
            if (onFocusChangeListener == jVar.b) {
                jVar.e.setOnFocusChangeListener(null);
            }
        }
    }

    public class aOU implements View.OnClickListener {
        public aOU() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = j.this.c.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            j.this.c.z();
        }
    }

    public j(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.g = new aOP();
        this.b = new aOQ();
        this.h = new aOR();
        this.i = new aOS();
    }

    public static boolean b(j jVar) {
        EditText editText = jVar.c.getEditText();
        return editText != null && (editText.hasFocus() || jVar.e.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void c() {
        TextInputLayout textInputLayout = this.c;
        int i = this.f;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.c;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.c.setEndIconOnClickListener(new aOU());
        this.c.k(this.h);
        this.c.ah.add(this.i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(ivas.gov.bisp.enumeration.T.j.f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new e(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = ivas.gov.bisp.enumeration.T.j.c;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new r(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.a.addListener(new ivas.gov.bisp.enumeration.U.c(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new r(this));
        this.j = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new ivas.gov.bisp.enumeration.U.h(this));
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void e(boolean z) {
        if (this.c.getSuffixText() == null) {
            return;
        }
        f(z);
    }

    public final void f(boolean z) {
        boolean z2 = this.c.w() == z;
        if (z && !this.a.isRunning()) {
            this.j.cancel();
            this.a.start();
            if (z2) {
                this.a.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.a.cancel();
        this.j.start();
        if (z2) {
            this.j.end();
        }
    }
}
