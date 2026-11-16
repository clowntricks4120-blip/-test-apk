package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public int a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList<String> m;
    public ArrayList<String> n;
    public ArrayList<aLk> b = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23o = false;

    public static final class aLk {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public androidx.lifecycle.d.aMa g;
        public androidx.lifecycle.d.aMa h;

        public aLk() {
        }

        public aLk(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            androidx.lifecycle.d.aMa ama = androidx.lifecycle.d.aMa.RESUMED;
            this.g = ama;
            this.h = ama;
        }
    }

    public g(r rVar, ClassLoader classLoader) {
    }

    public void b(aLk alk) {
        this.b.add(alk);
        alk.c = this.c;
        alk.d = this.d;
        alk.f = this.e;
        alk.e = this.g;
    }

    public abstract int c();

    public abstract void d(int i, Fragment fragment, String str, int i2);
}
