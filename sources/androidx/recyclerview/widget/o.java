package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o extends z {
    public static TimeInterpolator h;
    public ArrayList<RecyclerView.o0O0O00> j = new ArrayList<>();
    public ArrayList<RecyclerView.o0O0O00> i = new ArrayList<>();
    public ArrayList<aNc> k = new ArrayList<>();
    public ArrayList<aNb> l = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.o0O0O00>> m = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<ArrayList<aNc>> f29o = new ArrayList<>();
    public ArrayList<ArrayList<aNb>> n = new ArrayList<>();
    public ArrayList<RecyclerView.o0O0O00> p = new ArrayList<>();
    public ArrayList<RecyclerView.o0O0O00> q = new ArrayList<>();
    public ArrayList<RecyclerView.o0O0O00> s = new ArrayList<>();
    public ArrayList<RecyclerView.o0O0O00> r = new ArrayList<>();

    public static class aNb {
        public RecyclerView.o0O0O00 a;
        public RecyclerView.o0O0O00 b;
        public int c;
        public int d;
        public int e;
        public int f;

        public aNb(RecyclerView.o0O0O00 o0o0o00, RecyclerView.o0O0O00 o0o0o01, int i, int i2, int i3, int i4) {
            this.a = o0o0o00;
            this.b = o0o0o01;
            this.c = i;
            this.d = i2;
            this.f = i3;
            this.e = i4;
        }

        public String toString() {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("ChangeInfo{oldHolder=");
            sbW.append(this.a);
            sbW.append(", newHolder=");
            sbW.append(this.b);
            sbW.append(", fromX=");
            sbW.append(this.c);
            sbW.append(", fromY=");
            sbW.append(this.d);
            sbW.append(", toX=");
            sbW.append(this.f);
            sbW.append(", toY=");
            sbW.append(this.e);
            sbW.append('}');
            return sbW.toString();
        }
    }

    public static class aNc {
        public RecyclerView.o0O0O00 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public aNc(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4) {
            this.a = o0o0o00;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void f() {
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aNc anc = this.k.get(size);
            View view = anc.a.c;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(anc.a);
            this.k.remove(size);
        }
        int size2 = this.j.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            d(this.j.get(size2));
            this.j.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.o0O0O00 o0o0o00 = this.i.get(size3);
            o0o0o00.c.setAlpha(1.0f);
            d(o0o0o00);
            this.i.remove(size3);
        }
        int size4 = this.l.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            aNb anb = this.l.get(size4);
            RecyclerView.o0O0O00 o0o0o01 = anb.a;
            if (o0o0o01 != null) {
                o(anb, o0o0o01);
            }
            RecyclerView.o0O0O00 o0o0o02 = anb.b;
            if (o0o0o02 != null) {
                o(anb, o0o0o02);
            }
        }
        this.l.clear();
        if (!h()) {
            return;
        }
        int size5 = this.f29o.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<aNc> arrayList = this.f29o.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    aNc anc2 = arrayList.get(size6);
                    View view2 = anc2.a.c;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d(anc2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f29o.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.m.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.o0O0O00> arrayList2 = this.m.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.o0O0O00 o0o0o03 = arrayList2.get(size8);
                    o0o0o03.c.setAlpha(1.0f);
                    d(o0o0o03);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.s);
                k(this.q);
                k(this.p);
                k(this.r);
                e();
                return;
            }
            ArrayList<aNb> arrayList3 = this.n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    aNb anb2 = arrayList3.get(size10);
                    RecyclerView.o0O0O00 o0o0o04 = anb2.a;
                    if (o0o0o04 != null) {
                        o(anb2, o0o0o04);
                    }
                    RecyclerView.o0O0O00 o0o0o05 = anb2.b;
                    if (o0o0o05 != null) {
                        o(anb2, o0o0o05);
                    }
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void g(RecyclerView.o0O0O00 o0o0o00) {
        View view = o0o0o00.c;
        view.animate().cancel();
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.k.get(size).a == o0o0o00) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d(o0o0o00);
                this.k.remove(size);
            }
        }
        m(this.l, o0o0o00);
        if (this.j.remove(o0o0o00)) {
            view.setAlpha(1.0f);
            d(o0o0o00);
        }
        if (this.i.remove(o0o0o00)) {
            view.setAlpha(1.0f);
            d(o0o0o00);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<aNb> arrayList = this.n.get(size2);
            m(arrayList, o0o0o00);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.f29o.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<aNc> arrayList2 = this.f29o.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).a == o0o0o00) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(o0o0o00);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f29o.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.s.remove(o0o0o00);
                this.p.remove(o0o0o00);
                this.r.remove(o0o0o00);
                this.q.remove(o0o0o00);
                l();
                return;
            }
            ArrayList<RecyclerView.o0O0O00> arrayList3 = this.m.get(size5);
            if (arrayList3.remove(o0o0o00)) {
                view.setAlpha(1.0f);
                d(o0o0o00);
                if (arrayList3.isEmpty()) {
                    this.m.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean h() {
        return (this.i.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.q.isEmpty() && this.s.isEmpty() && this.p.isEmpty() && this.r.isEmpty() && this.f29o.isEmpty() && this.m.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.z
    public boolean j(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4) {
        View view = o0o0o00.c;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) o0o0o00.c.getTranslationY());
        n(o0o0o00);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            d(o0o0o00);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.k.add(new aNc(o0o0o00, translationX, translationY, i3, i4));
        return true;
    }

    public void k(List<RecyclerView.o0O0O00> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).c.animate().cancel();
            }
        }
    }

    public void l() {
        if (h()) {
            return;
        }
        e();
    }

    public final void m(List<aNb> list, RecyclerView.o0O0O00 o0o0o00) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            aNb anb = list.get(size);
            if (o(anb, o0o0o00) && anb.a == null && anb.b == null) {
                list.remove(anb);
            }
        }
    }

    public final void n(RecyclerView.o0O0O00 o0o0o00) {
        if (h == null) {
            h = new ValueAnimator().getInterpolator();
        }
        o0o0o00.c.animate().setInterpolator(h);
        g(o0o0o00);
    }

    public final boolean o(aNb anb, RecyclerView.o0O0O00 o0o0o00) {
        if (anb.b == o0o0o00) {
            anb.b = null;
        } else {
            if (anb.a != o0o0o00) {
                return false;
            }
            anb.a = null;
        }
        o0o0o00.c.setAlpha(1.0f);
        o0o0o00.c.setTranslationX(0.0f);
        o0o0o00.c.setTranslationY(0.0f);
        d(o0o0o00);
        return true;
    }
}
