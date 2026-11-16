package androidx.fragment.app;

import ivas.gov.bisp.enumeration.F.ad;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements h.aKG {
    public final h p;
    public int q;
    public boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(h hVar) {
        r rVarN = hVar.N();
        o000000O<?> o000000o = hVar.r;
        super(rVarN, o000000o != null ? o000000o.b.getClassLoader() : null);
        this.q = -1;
        this.p = hVar;
    }

    @Override // androidx.fragment.app.h.aKG
    public final boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        h.b(2);
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.h) {
            return true;
        }
        h hVar = this.p;
        if (hVar.e == null) {
            hVar.e = new ArrayList<>();
        }
        hVar.e.add(this);
        return true;
    }

    @Override // androidx.fragment.app.g
    public final int c() {
        return i(false);
    }

    @Override // androidx.fragment.app.g
    public final void d(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Fragment ");
            sbW.append(cls.getCanonicalName());
            sbW.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbW.toString());
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                sb.append(fragment.mTag);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't add fragment ");
                sb2.append(fragment);
                sb2.append(" with tag ");
                sb2.append(str);
                sb2.append(" to container view with no id");
                throw new IllegalArgumentException(sb2.toString());
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can't change container ID of fragment ");
                sb3.append(fragment);
                sb3.append(": was ");
                sb3.append(fragment.mFragmentId);
                sb3.append(" now ");
                sb3.append(i);
                throw new IllegalStateException(sb3.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new g.aLk(i2, fragment));
        fragment.mFragmentManager = this.p;
    }

    public final void e(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            g.aLk alk = this.b.get(size);
            Fragment fragment = alk.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                int i = this.f;
                int i2 = 4097;
                if (i == 4097) {
                    i2 = 8194;
                } else if (i == 4099) {
                    i2 = 4099;
                } else if (i != 8194) {
                    i2 = 0;
                }
                fragment.setNextTransition(i2);
                fragment.setSharedElementNames(this.m, this.n);
            }
            switch (alk.a) {
                case 1:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, true);
                    this.p.Y(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Unknown cmd: ");
                    sbW.append(alk.a);
                    throw new IllegalArgumentException(sbW.toString());
                case 3:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.d(fragment);
                    break;
                case 4:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ag(fragment);
                    break;
                case 5:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, true);
                    this.p.O(fragment);
                    break;
                case 6:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.f(fragment);
                    break;
                case 7:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, true);
                    this.p.l(fragment);
                    break;
                case 8:
                    this.p.af(null);
                    break;
                case 9:
                    this.p.af(fragment);
                    break;
                case 10:
                    this.p.ae(fragment, alk.g);
                    break;
            }
            if (!this.f23o) {
                int i3 = alk.a;
            }
        }
    }

    public final int i(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (h.b(2)) {
            PrintWriter printWriter = new PrintWriter(new ad("FragmentManager"));
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        if (this.h) {
            this.q = this.p.a.getAndIncrement();
        } else {
            this.q = -1;
        }
        this.p.C(this, z);
        return this.q;
    }

    public final void j(int i) {
        if (this.h) {
            h.b(2);
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                g.aLk alk = this.b.get(i2);
                Fragment fragment = alk.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (h.b(2)) {
                        Objects.toString(alk.b);
                        int i3 = alk.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void k(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.q);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.c != 0 || this.d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (this.e != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.a != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.a));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (this.b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            g.aLk alk = this.b.get(i);
            switch (alk.a) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("cmd=");
                    sbW.append(alk.a);
                    string = sbW.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(alk.b);
            if (z) {
                if (alk.c != 0 || alk.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(alk.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(alk.d));
                }
                if (alk.f != 0 || alk.e != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(alk.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(alk.e));
                }
            }
        }
    }

    public final void l() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            g.aLk alk = this.b.get(i);
            Fragment fragment = alk.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f);
                fragment.setSharedElementNames(this.n, this.m);
            }
            switch (alk.a) {
                case 1:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, false);
                    this.p.d(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Unknown cmd: ");
                    sbW.append(alk.a);
                    throw new IllegalArgumentException(sbW.toString());
                case 3:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.Y(fragment);
                    break;
                case 4:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.O(fragment);
                    break;
                case 5:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, false);
                    this.p.ag(fragment);
                    break;
                case 6:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(alk.c, alk.d, alk.f, alk.e);
                    this.p.ad(fragment, false);
                    this.p.f(fragment);
                    break;
                case 8:
                    this.p.af(fragment);
                    break;
                case 9:
                    this.p.af(null);
                    break;
                case 10:
                    this.p.ae(fragment, alk.h);
                    break;
            }
            if (!this.f23o) {
                int i2 = alk.a;
            }
        }
    }

    public final boolean m(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.b.get(i2).b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.b.get(i4).b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.b.get(i7).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.q >= 0) {
            sb.append(" #");
            sb.append(this.q);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
