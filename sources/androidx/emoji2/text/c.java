package androidx.emoji2.text;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import ivas.gov.bisp.enumeration.p007ag.h;
import ivas.gov.bisp.enumeration.p013am.P;
import ivas.gov.bisp.enumeration.p013am.t;
import ivas.gov.bisp.enumeration.p014an.ar;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final b.aKr a;
    public final f b;
    public b.aKo c;

    public static class aKu implements b.aKo {
        public static final ThreadLocal<StringBuilder> a = new ThreadLocal<>();
        public final TextPaint b;

        public aKu() {
            TextPaint textPaint = new TextPaint();
            this.b = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    public static final class aKv {
        public int a = 1;
        public final f.aKx b;
        public f.aKx c;
        public f.aKx d;
        public int e;
        public int f;

        public aKv(f.aKx akx, boolean z, int[] iArr) {
            this.b = akx;
            this.c = akx;
        }

        public final int b(int i) {
            SparseArray<f.aKx> sparseArray = this.c.a;
            f.aKx akx = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 2;
            if (this.a != 2) {
                if (akx == null) {
                    c();
                    i2 = 1;
                } else {
                    this.a = 2;
                    this.c = akx;
                    this.e = 1;
                }
            } else if (akx != null) {
                this.c = akx;
                this.e++;
            } else {
                if (i == 65038) {
                    c();
                } else if (i != 65039) {
                    f.aKx akx2 = this.c;
                    if (akx2.b != null) {
                        i2 = 3;
                        if (this.e != 1) {
                            this.d = akx2;
                            c();
                        } else if (d()) {
                            this.d = this.c;
                            c();
                        } else {
                            c();
                        }
                    } else {
                        c();
                    }
                }
                i2 = 1;
            }
            this.f = i;
            return i2;
        }

        public final int c() {
            this.a = 1;
            this.c = this.b;
            this.e = 0;
            return 1;
        }

        public final boolean d() {
            ar arVarG = this.c.b.g();
            int iC = arVarG.c(6);
            return !(iC == 0 || arVarG.d.get(iC + arVarG.c) == 0) || this.f == 65039;
        }
    }

    public c(f fVar, b.aKr akr, b.aKo ako, boolean z, int[] iArr) {
        this.a = akr;
        this.b = fVar;
        this.c = ako;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        t[] tVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (tVarArr = (t[]) editable.getSpans(selectionStart, selectionEnd, t.class)) != null && tVarArr.length > 0) {
            for (t tVar : tVarArr) {
                int spanStart = editable.getSpanStart(tVar);
                int spanEnd = editable.getSpanEnd(tVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(CharSequence charSequence, int i, int i2, P p) {
        if (p.f == 0) {
            b.aKo ako = this.c;
            ar arVarG = p.g();
            int iC = arVarG.c(8);
            if (iC != 0) {
                arVarG.d.getShort(iC + arVarG.c);
            }
            aKu aku = (aKu) ako;
            Objects.requireNonNull(aku);
            ThreadLocal<StringBuilder> threadLocal = aKu.a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = aku.b;
            String string = sb.toString();
            ThreadLocal<o0ooOOo<Rect, Rect>> threadLocal2 = h.c;
            p.f = textPaint.hasGlyph(string) ? 2 : 1;
        }
        return p.f == 2;
    }
}
