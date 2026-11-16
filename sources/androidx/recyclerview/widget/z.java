package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends RecyclerView.OooOOOO {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean c(RecyclerView.o0O0O00 o0o0o00, RecyclerView.o0O0O00 o0o0o01, RecyclerView.OooOOOO.OooO0OO oooO0OO, RecyclerView.OooOOOO.OooO0OO oooO0OO2) {
        int i;
        int i2;
        int i3 = oooO0OO.a;
        int i4 = oooO0OO.b;
        if (o0o0o01.v()) {
            int i5 = oooO0OO.a;
            i2 = oooO0OO.b;
            i = i5;
        } else {
            i = oooO0OO2.a;
            i2 = oooO0OO2.b;
        }
        o oVar = (o) this;
        if (o0o0o00 == o0o0o01) {
            return oVar.j(o0o0o00, i3, i4, i, i2);
        }
        float translationX = o0o0o00.c.getTranslationX();
        float translationY = o0o0o00.c.getTranslationY();
        float alpha = o0o0o00.c.getAlpha();
        oVar.n(o0o0o00);
        o0o0o00.c.setTranslationX(translationX);
        o0o0o00.c.setTranslationY(translationY);
        o0o0o00.c.setAlpha(alpha);
        oVar.n(o0o0o01);
        o0o0o01.c.setTranslationX(-((int) ((i - i3) - translationX)));
        o0o0o01.c.setTranslationY(-((int) ((i2 - i4) - translationY)));
        o0o0o01.c.setAlpha(0.0f);
        oVar.l.add(new o.aNb(o0o0o00, o0o0o01, i3, i4, i, i2));
        return true;
    }

    public abstract boolean j(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4);
}
