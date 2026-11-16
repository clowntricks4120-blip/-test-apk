package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import ivas.gov.bisp.enumeration.F.A;
import ivas.gov.bisp.enumeration.F.C0018y;
import ivas.gov.bisp.enumeration.F.D;
import ivas.gov.bisp.enumeration.F.E;
import ivas.gov.bisp.enumeration.F.LayoutInflaterFactory2C0016s;
import ivas.gov.bisp.enumeration.F.X;
import ivas.gov.bisp.enumeration.F.ad;
import ivas.gov.bisp.enumeration.F.al;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO0o;
import ivas.gov.bisp.enumeration.OoooOOo.o000000O;
import ivas.gov.bisp.enumeration.OoooOOo.o000OOo;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p027b.G;
import ivas.gov.bisp.enumeration.p027b.H;
import ivas.gov.bisp.enumeration.p027b.InterfaceC0106f;
import ivas.gov.bisp.enumeration.p027b.an;
import ivas.gov.bisp.enumeration.p027b.ap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<aLO> F;
    public ArrayList<a> G;
    public ArrayList<Boolean> H;
    public ArrayList<Fragment> I;
    public al J;
    public boolean c;
    public ArrayList<a> e;
    public ArrayList<Fragment> g;
    public OnBackPressedDispatcher h;
    public A q;
    public o000000O<?> r;
    public Fragment s;
    public OooO<ivas.gov.bisp.enumeration.p084g.p> t;
    public Fragment v;
    public OooO<Intent> x;
    public OooO<String[]> z;
    public final ArrayList<aKG> b = new ArrayList<>();
    public final X d = new X();
    public final LayoutInflaterFactory2C0016s f = new LayoutInflaterFactory2C0016s(this);
    public final ivas.gov.bisp.enumeration.p083f.c i = new aLB(false);
    public final AtomicInteger a = new AtomicInteger();
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> k = Collections.synchronizedMap(new HashMap());
    public Map<Fragment, HashSet<ivas.gov.bisp.enumeration.H.c>> l = Collections.synchronizedMap(new HashMap());
    public final w.aLv n = new aLC();
    public final C0018y m = new C0018y(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList<D> f24o = new CopyOnWriteArrayList<>();
    public int p = -1;
    public r u = new aLD();
    public E w = new aLF(this);
    public ArrayDeque<aLL> y = new ArrayDeque<>();
    public Runnable K = new aLG();

    public interface aKG {
        boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class aLB extends ivas.gov.bisp.enumeration.p083f.c {
        public aLB(boolean z) {
            super(z);
        }

        @Override // ivas.gov.bisp.enumeration.p083f.c
        public void c() {
            h hVar = h.this;
            hVar.D(true);
            if (hVar.i.a) {
                hVar.W();
            } else {
                hVar.h.c();
            }
        }
    }

    public class aLC implements w.aLv {
        public aLC() {
        }

        public void b(Fragment fragment, ivas.gov.bisp.enumeration.H.c cVar) {
            boolean z;
            synchronized (cVar) {
                z = cVar.a;
            }
            if (z) {
                return;
            }
            h hVar = h.this;
            HashSet<ivas.gov.bisp.enumeration.H.c> hashSet = hVar.l.get(fragment);
            if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
                hVar.l.remove(fragment);
                if (fragment.mState < 5) {
                    hVar.c(fragment);
                    hVar.R(fragment, hVar.p);
                }
            }
        }

        public void c(Fragment fragment, ivas.gov.bisp.enumeration.H.c cVar) {
            h hVar = h.this;
            if (hVar.l.get(fragment) == null) {
                hVar.l.put(fragment, new HashSet<>());
            }
            hVar.l.get(fragment).add(cVar);
        }
    }

    public class aLD extends r {
        public aLD() {
        }

        @Override // androidx.fragment.app.r
        public Fragment e(ClassLoader classLoader, String str) {
            o000000O<?> o000000o = h.this.r;
            Context context = o000000o.b;
            Objects.requireNonNull(o000000o);
            return Fragment.instantiate(context, str, null);
        }
    }

    public class aLF implements E {
        public aLF(h hVar) {
        }
    }

    public class aLG implements Runnable {
        public aLG() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.D(true);
        }
    }

    public class aLH implements D {
        public final /* synthetic */ Fragment a;

        public aLH(h hVar, Fragment fragment) {
            this.a = fragment;
        }

        @Override // ivas.gov.bisp.enumeration.F.D
        public void b(h hVar, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    public class aLI implements OooO0o<ivas.gov.bisp.enumeration.p084g.h> {
        public aLI() {
        }

        public void b(Object obj) {
            ivas.gov.bisp.enumeration.p084g.h hVar = (ivas.gov.bisp.enumeration.p084g.h) obj;
            aLL allPollFirst = h.this.y.pollFirst();
            if (allPollFirst != null) {
                String str = allPollFirst.b;
                int i = allPollFirst.c;
                Fragment fragmentI = h.this.d.i(str);
                if (fragmentI != null) {
                    fragmentI.onActivityResult(i, hVar.d, hVar.e);
                }
            }
        }
    }

    public static class aLK extends ivas.gov.bisp.enumeration.OooO0o0.OooO0o<ivas.gov.bisp.enumeration.p084g.p, ivas.gov.bisp.enumeration.p084g.h> {
        public Intent c(Context context, Object obj) {
            Bundle bundleExtra;
            ivas.gov.bisp.enumeration.p084g.p pVar = (ivas.gov.bisp.enumeration.p084g.p) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = pVar.e;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    pVar = new ivas.gov.bisp.enumeration.p084g.p(pVar.d, null, pVar.f, pVar.g);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", pVar);
            h.b(2);
            return intent;
        }

        public Object e(int i, Intent intent) {
            return new ivas.gov.bisp.enumeration.p084g.h(i, intent);
        }
    }

    public class aLN implements aKG {
        public final int a;
        public final int b;

        public aLN(String str, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // androidx.fragment.app.h.aKG
        public boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = h.this.v;
            if (fragment == null || this.a >= 0 || !fragment.getChildFragmentManager().W()) {
                return h.this.X(arrayList, arrayList2, null, this.a, this.b);
            }
            return false;
        }
    }

    public static class aLO implements Fragment.OooOo {
        public final boolean a;
        public final a b;
        public int c;

        public void a() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.p.d.c()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            a aVar = this.b;
            aVar.p.j(aVar, this.a, !z, true);
        }
    }

    public class aLy implements OooO0o<ivas.gov.bisp.enumeration.p084g.h> {
        public aLy() {
        }

        public void b(Object obj) {
            ivas.gov.bisp.enumeration.p084g.h hVar = (ivas.gov.bisp.enumeration.p084g.h) obj;
            aLL allPollFirst = h.this.y.pollFirst();
            if (allPollFirst != null) {
                String str = allPollFirst.b;
                int i = allPollFirst.c;
                Fragment fragmentI = h.this.d.i(str);
                if (fragmentI != null) {
                    fragmentI.onActivityResult(i, hVar.d, hVar.e);
                }
            }
        }
    }

    public class aLz implements OooO0o<Map<String, Boolean>> {
        public aLz() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void b(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            aLL allPollFirst = h.this.y.pollFirst();
            if (allPollFirst != null) {
                String str = allPollFirst.b;
                int i2 = allPollFirst.c;
                Fragment fragmentI = h.this.d.i(str);
                if (fragmentI != null) {
                    fragmentI.onRequestPermissionsResult(i2, strArr, iArr);
                }
            }
        }
    }

    public static boolean b(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void A() {
        Iterator it = ((HashSet) h()).iterator();
        while (it.hasNext()) {
            ((i) it.next()).i();
        }
    }

    public void B(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(str, "    ");
        X x = this.d;
        Objects.requireNonNull(x);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String string = sb.toString();
        if (!x.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : x.d.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragment = tVar.c;
                    printWriter.println(fragment);
                    fragment.dump(string, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = x.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = x.c.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.g;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<a> arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(strR, printWriter, true);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Back Stack Index: ");
        sb2.append(this.a.get());
        printWriter.println(sb2.toString());
        synchronized (this.b) {
            int size4 = this.b.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (aKG) this.b.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public void C(aKG akg, boolean z) {
        if (!z) {
            if (this.r == null) {
                if (!this.D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.b) {
            if (this.r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.b.add(akg);
                ac();
            }
        }
    }

    public boolean D(boolean z) {
        E(z);
        boolean z2 = false;
        while (true) {
            ArrayList<a> arrayList = this.G;
            ArrayList<Boolean> arrayList2 = this.H;
            synchronized (this.b) {
                if (this.b.isEmpty()) {
                    break;
                }
                int size = this.b.size();
                boolean zB = false;
                for (int i = 0; i < size; i++) {
                    zB |= this.b.get(i).b(arrayList, arrayList2);
                }
                this.b.clear();
                this.r.c.removeCallbacks(this.K);
                if (!zB) {
                    break;
                }
                z2 = true;
                this.c = true;
                try {
                    Z(this.G, this.H);
                    i();
                } catch (Throwable th) {
                    i();
                    throw th;
                }
            }
        }
        aj();
        v();
        this.d.e();
        return z2;
    }

    public final void E(boolean z) {
        if (this.c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r == null) {
            if (!this.D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.r.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.G == null) {
            this.G = new ArrayList<>();
            this.H = new ArrayList<>();
        }
        this.c = true;
        try {
            J(null, null);
        } finally {
            this.c = false;
        }
    }

    public void F(aKG akg, boolean z) {
        if (z && (this.r == null || this.D)) {
            return;
        }
        E(z);
        ((a) akg).b(this.G, this.H);
        this.c = true;
        try {
            Z(this.G, this.H);
            i();
            aj();
            v();
            this.d.e();
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    public final void G(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        boolean z = arrayList.get(i).f23o;
        ArrayList<Fragment> arrayList3 = this.I;
        if (arrayList3 == null) {
            this.I = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.I.addAll(this.d.c());
        Fragment fragment = this.v;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i2) {
                this.I.clear();
                if (!z && this.p > 0) {
                    for (int i6 = i; i6 < i2; i6++) {
                        Iterator<g.aLk> it = arrayList.get(i6).b.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                this.d.l(k(fragment2));
                            }
                        }
                    }
                }
                int i7 = i;
                while (i7 < i2) {
                    a aVar = arrayList.get(i7);
                    if (arrayList2.get(i7).booleanValue()) {
                        aVar.j(-1);
                        aVar.e(i7 == i2 + (-1));
                    } else {
                        aVar.j(1);
                        aVar.l();
                    }
                    i7++;
                }
                boolean zBooleanValue = arrayList2.get(i2 - 1).booleanValue();
                for (int i8 = i; i8 < i2; i8++) {
                    a aVar2 = arrayList.get(i8);
                    if (zBooleanValue) {
                        for (int size = aVar2.b.size() - 1; size >= 0; size--) {
                            Fragment fragment3 = aVar2.b.get(size).b;
                            if (fragment3 != null) {
                                k(fragment3).n();
                            }
                        }
                    } else {
                        Iterator<g.aLk> it2 = aVar2.b.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment4 = it2.next().b;
                            if (fragment4 != null) {
                                k(fragment4).n();
                            }
                        }
                    }
                }
                U(this.p, true);
                HashSet<i> hashSet = new HashSet();
                for (int i9 = i; i9 < i2; i9++) {
                    Iterator<g.aLk> it3 = arrayList.get(i9).b.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment5 = it3.next().b;
                        if (fragment5 != null && (viewGroup = fragment5.mContainer) != null) {
                            hashSet.add(i.c(viewGroup, P()));
                        }
                    }
                }
                for (i iVar : hashSet) {
                    iVar.d = zBooleanValue;
                    iVar.j();
                    iVar.g();
                }
                for (int i10 = i; i10 < i2; i10++) {
                    a aVar3 = arrayList.get(i10);
                    if (arrayList2.get(i10).booleanValue() && aVar3.q >= 0) {
                        aVar3.q = -1;
                    }
                    Objects.requireNonNull(aVar3);
                }
                return;
            }
            a aVar4 = arrayList.get(i4);
            int i11 = 3;
            if (arrayList2.get(i4).booleanValue()) {
                int i12 = 1;
                ArrayList<Fragment> arrayList4 = this.I;
                int size2 = aVar4.b.size() - 1;
                while (size2 >= 0) {
                    g.aLk alk = aVar4.b.get(size2);
                    int i13 = alk.a;
                    if (i13 != i12) {
                        if (i13 != 3) {
                            switch (i13) {
                                case 6:
                                    arrayList4.add(alk.b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = alk.b;
                                    break;
                                case 10:
                                    alk.h = alk.g;
                                    break;
                            }
                        } else {
                            arrayList4.add(alk.b);
                        }
                        size2--;
                        i12 = 1;
                    }
                    arrayList4.remove(alk.b);
                    size2--;
                    i12 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList5 = this.I;
                int i14 = 0;
                while (i14 < aVar4.b.size()) {
                    g.aLk alk2 = aVar4.b.get(i14);
                    int i15 = alk2.a;
                    if (i15 != i5) {
                        if (i15 != 2) {
                            if (i15 == i11 || i15 == 6) {
                                arrayList5.remove(alk2.b);
                                Fragment fragment6 = alk2.b;
                                if (fragment6 == fragment) {
                                    aVar4.b.add(i14, new g.aLk(9, fragment6));
                                    i14++;
                                    i3 = 1;
                                    fragment = null;
                                }
                            } else if (i15 == 7) {
                                i3 = 1;
                            } else if (i15 == 8) {
                                aVar4.b.add(i14, new g.aLk(9, fragment));
                                i14++;
                                fragment = alk2.b;
                            }
                            i3 = 1;
                        } else {
                            Fragment fragment7 = alk2.b;
                            int i16 = fragment7.mContainerId;
                            int size3 = arrayList5.size() - 1;
                            boolean z3 = false;
                            while (size3 >= 0) {
                                Fragment fragment8 = arrayList5.get(size3);
                                if (fragment8.mContainerId != i16) {
                                    i16 = i16;
                                } else if (fragment8 == fragment7) {
                                    i16 = i16;
                                    z3 = true;
                                } else {
                                    if (fragment8 == fragment) {
                                        aVar4.b.add(i14, new g.aLk(9, fragment8));
                                        i14++;
                                        fragment = null;
                                    }
                                    g.aLk alk3 = new g.aLk(3, fragment8);
                                    alk3.c = alk2.c;
                                    alk3.f = alk2.f;
                                    alk3.d = alk2.d;
                                    alk3.e = alk2.e;
                                    aVar4.b.add(i14, alk3);
                                    arrayList5.remove(fragment8);
                                    i14++;
                                }
                                size3--;
                                i16 = i16;
                            }
                            if (z3) {
                                aVar4.b.remove(i14);
                                i14--;
                                i3 = 1;
                            } else {
                                i3 = 1;
                                alk2.a = 1;
                                arrayList5.add(fragment7);
                            }
                        }
                        i14 += i3;
                        i5 = i3;
                        i11 = 3;
                    } else {
                        i3 = i5;
                    }
                    arrayList5.add(alk2.b);
                    i14 += i3;
                    i5 = i3;
                    i11 = 3;
                }
            }
            z2 = z2 || aVar4.h;
            i4++;
        }
    }

    public boolean H(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public Fragment I(String str) {
        X x = this.d;
        Objects.requireNonNull(x);
        if (str != null) {
            int size = x.c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = x.c.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (t tVar : x.d.values()) {
                if (tVar != null) {
                    Fragment fragment2 = tVar.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final void J(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<aLO> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            aLO alo = this.F.get(i);
            if (arrayList != null && !alo.a && (iIndexOf2 = arrayList.indexOf(alo.b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.F.remove(i);
                i--;
                size--;
                a aVar = alo.b;
                aVar.p.j(aVar, alo.a, false, false);
            } else if (alo.c == 0 || (arrayList != null && alo.b.n(arrayList, 0, arrayList.size()))) {
                this.F.remove(i);
                i--;
                size--;
                if (arrayList == null || alo.a || (iIndexOf = arrayList.indexOf(alo.b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    alo.a();
                } else {
                    a aVar2 = alo.b;
                    aVar2.p.j(aVar2, alo.a, false, false);
                }
            }
            i++;
        }
    }

    public Fragment K(String str) {
        return this.d.g(str);
    }

    public Fragment L(int i) {
        X x = this.d;
        int size = x.c.size();
        while (true) {
            size--;
            if (size < 0) {
                for (t tVar : x.d.values()) {
                    if (tVar != null) {
                        Fragment fragment = tVar.c;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = x.c.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    public final ViewGroup M(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.q.d()) {
            View viewC = this.q.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public r N() {
        Fragment fragment = this.s;
        return fragment != null ? fragment.mFragmentManager.N() : this.u;
    }

    public void O(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        ah(fragment);
    }

    public E P() {
        Fragment fragment = this.s;
        return fragment != null ? fragment.mFragmentManager.P() : this.w;
    }

    public final boolean Q(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        h hVar = fragment.mChildFragmentManager;
        boolean zQ = false;
        for (Fragment fragment2 : (ArrayList) hVar.d.j()) {
            if (fragment2 != null) {
                zQ = hVar.Q(fragment2);
            }
            if (zQ) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0175  */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    public void R(Fragment fragment, int i) {
        int i2;
        ViewGroup viewGroup;
        t tVarK = this.d.k(fragment.mWho);
        if (tVarK == null) {
            tVarK = new t(this.m, this.d, fragment);
            tVarK.e = 1;
        }
        t tVar = tVarK;
        int iMin = Math.min((fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) ? Math.max(i, 2) : i, tVar.h());
        int i3 = fragment.mState;
        if (i3 <= iMin) {
            if (i3 < iMin && !this.l.isEmpty()) {
                g(fragment);
            }
            int i4 = fragment.mState;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                tVar.p();
                            }
                        }
                        if (iMin > 4) {
                            tVar.s();
                        }
                        if (iMin > 5) {
                            tVar.p();
                        }
                    }
                    if (iMin > 2) {
                        tVar.e();
                    }
                    if (iMin > 4) {
                        tVar.s();
                    }
                    if (iMin > 5) {
                        tVar.p();
                    }
                }
                if (iMin >= 0) {
                    tVar.m();
                }
                if (iMin > 1) {
                    tVar.i();
                }
                if (iMin > 2) {
                    tVar.e();
                }
                if (iMin > 4) {
                    tVar.s();
                }
                if (iMin > 5) {
                    tVar.p();
                }
            } else if (iMin >= 0) {
                tVar.g();
            }
            if (iMin > 0) {
                tVar.j();
            }
            if (iMin >= 0) {
                tVar.m();
            }
            if (iMin > 1) {
                tVar.i();
            }
            if (iMin > 2) {
                tVar.e();
            }
            if (iMin > 4) {
                tVar.s();
            }
            if (iMin > 5) {
                tVar.p();
            }
        } else if (i3 > iMin) {
            if (i3 == 0) {
                i2 = iMin;
                if (i2 < 0) {
                    tVar.d();
                }
                iMin = i2;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (iMin < 7) {
                                        tVar.o();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                tVar.t();
                            }
                        }
                        if (iMin < 4) {
                            b(3);
                            if (fragment.mView != null && this.r.h(fragment) && fragment.mSavedViewState == null) {
                                tVar.r();
                            }
                        }
                    }
                    if (iMin < 2) {
                        View view = fragment.mView;
                        if (view != null && (viewGroup = fragment.mContainer) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                p.aLc alcA = null;
                                if (this.p >= 0 && !this.D && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0f) {
                                    alcA = p.a(this.r.b, fragment, false, fragment.getPopDirection());
                                }
                                fragment.mPostponedAlpha = 0.0f;
                                ViewGroup viewGroup2 = fragment.mContainer;
                                View view2 = fragment.mView;
                                if (alcA != null) {
                                    w.aLv alv = this.n;
                                    viewGroup2.startViewTransition(view2);
                                    ivas.gov.bisp.enumeration.H.c cVar = new ivas.gov.bisp.enumeration.H.c();
                                    cVar.d(new o(fragment));
                                    aLC alc = (aLC) alv;
                                    alc.c(fragment, cVar);
                                    if (alcA.a != null) {
                                        p.aLd ald = new p.aLd(alcA.a, viewGroup2, view2);
                                        fragment.setAnimatingAway(fragment.mView);
                                        ald.setAnimationListener(new n(viewGroup2, fragment, alc, cVar));
                                        fragment.mView.startAnimation(ald);
                                    } else {
                                        Animator animator = alcA.b;
                                        fragment.setAnimator(animator);
                                        animator.addListener(new q(viewGroup2, view2, fragment, alc, cVar));
                                        animator.setTarget(fragment.mView);
                                        animator.start();
                                    }
                                }
                                viewGroup2.removeView(view2);
                                if (b(2)) {
                                    Objects.toString(view2);
                                }
                                if (viewGroup2 != fragment.mContainer) {
                                    return;
                                }
                            }
                        }
                        if (this.l.get(fragment) == null) {
                            tVar.l();
                        }
                    }
                }
                if (iMin > 0) {
                    i2 = iMin;
                } else if (this.l.get(fragment) != null) {
                    i2 = 1;
                } else {
                    tVar.k();
                    i2 = iMin;
                }
                if (i2 < 0) {
                    tVar.d();
                }
                iMin = i2;
            }
        }
        if (fragment.mState != iMin) {
            b(3);
            fragment.mState = iMin;
        }
    }

    public boolean S() {
        return this.C || this.B;
    }

    public boolean T(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        h hVar = fragment.mFragmentManager;
        return fragment.equals(hVar.v) && T(hVar.s);
    }

    public void U(int i, boolean z) {
        o000000O<?> o000000o;
        if (this.r == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.p) {
            this.p = i;
            X x = this.d;
            Iterator<Fragment> it = x.c.iterator();
            while (it.hasNext()) {
                t tVar = x.d.get(it.next().mWho);
                if (tVar != null) {
                    tVar.n();
                }
            }
            for (t tVar2 : x.d.values()) {
                if (tVar2 != null) {
                    tVar2.n();
                    Fragment fragment = tVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        x.m(tVar2);
                    }
                }
            }
            ai();
            if (this.A && (o000000o = this.r) != null && this.p == 7) {
                o000000o.i();
                this.A = false;
            }
        }
    }

    public void V() {
        if (this.r == null) {
            return;
        }
        this.C = false;
        this.B = false;
        this.J.k = false;
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public boolean W() {
        D(false);
        E(true);
        Fragment fragment = this.v;
        if (fragment != null && fragment.getChildFragmentManager().W()) {
            return true;
        }
        boolean zX = X(this.G, this.H, null, -1, 0);
        if (zX) {
            this.c = true;
            try {
                Z(this.G, this.H);
                i();
            } catch (Throwable th) {
                i();
                throw th;
            }
        }
        aj();
        v();
        this.d.e();
        return zX;
    }

    public boolean X(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<a> arrayList3 = this.e;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.e.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.e.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i >= 0 && i == aVar.q)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.e.get(size2);
                        if (str == null || !str.equals(aVar2.i)) {
                            if (i < 0 || i != aVar2.q) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.e.size() - 1) {
                return false;
            }
            for (int size3 = this.e.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.e.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void Y(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || (!zIsInBackStack)) {
            this.d.n(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            fragment.mRemoving = true;
            ah(fragment);
        }
    }

    public final void Z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        J(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f23o) {
                if (i2 != i) {
                    G(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f23o) {
                        i2++;
                    }
                }
                G(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            G(arrayList, arrayList2, i2, size);
        }
    }

    public void aa(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        s sVar = (s) parcelable;
        if (sVar.c == null) {
            return;
        }
        this.d.d.clear();
        for (ivas.gov.bisp.enumeration.F.n nVar : sVar.c) {
            if (nVar != null) {
                Fragment fragment = this.J.f.get(nVar.f);
                if (fragment != null) {
                    b(2);
                    tVar = new t(this.m, this.d, fragment, nVar);
                } else {
                    tVar = new t(this.m, this.d, this.r.b.getClassLoader(), N(), nVar);
                }
                tVar.c.mFragmentManager = this;
                b(2);
                tVar.q(this.r.b.getClassLoader());
                this.d.l(tVar);
                tVar.e = this.p;
            }
        }
        al alVar = this.J;
        Objects.requireNonNull(alVar);
        for (Fragment fragment2 : new ArrayList(alVar.f.values())) {
            if (!this.d.f(fragment2.mWho)) {
                if (b(2)) {
                    Objects.toString(sVar.c);
                }
                this.J.f(fragment2);
                fragment2.mFragmentManager = this;
                t tVar2 = new t(this.m, this.d, fragment2);
                tVar2.e = 1;
                tVar2.n();
                fragment2.mRemoving = true;
                tVar2.n();
            }
        }
        X x = this.d;
        ArrayList<String> arrayList = sVar.d;
        x.c.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragmentG = x.g(str);
                if (fragmentG == null) {
                    throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.t("No instantiated fragment for (", str, ")"));
                }
                b(2);
                x.d(fragmentG);
            }
        }
        if (sVar.e != null) {
            this.e = new ArrayList<>(sVar.e.length);
            int i = 0;
            while (true) {
                b[] bVarArr = sVar.e;
                if (i >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i];
                Objects.requireNonNull(bVar);
                a aVar = new a(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = bVar.c;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    g.aLk alk = new g.aLk();
                    int i4 = i2 + 1;
                    alk.a = iArr[i2];
                    if (b(2)) {
                        int i5 = bVar.c[i4];
                    }
                    String str2 = bVar.d.get(i3);
                    if (str2 != null) {
                        alk.b = this.d.g(str2);
                    } else {
                        alk.b = null;
                    }
                    alk.g = androidx.lifecycle.d.aMa.values()[bVar.e[i3]];
                    alk.h = androidx.lifecycle.d.aMa.values()[bVar.g[i3]];
                    int[] iArr2 = bVar.c;
                    int i6 = iArr2[i4];
                    alk.c = i6;
                    int i7 = iArr2[i2 + 2];
                    alk.d = i7;
                    int i8 = iArr2[i2 + 3];
                    alk.f = i8;
                    int i9 = iArr2[i2 + 4];
                    alk.e = i9;
                    aVar.c = i6;
                    aVar.d = i7;
                    aVar.e = i8;
                    aVar.g = i9;
                    aVar.b(alk);
                    i3++;
                    i2 += 5;
                }
                aVar.f = bVar.f;
                aVar.i = bVar.h;
                aVar.q = bVar.i;
                aVar.h = true;
                aVar.a = bVar.b;
                aVar.j = bVar.j;
                aVar.k = bVar.k;
                aVar.l = bVar.l;
                aVar.n = bVar.n;
                aVar.m = bVar.m;
                aVar.f23o = bVar.f22o;
                aVar.j(1);
                if (b(2)) {
                    PrintWriter printWriter = new PrintWriter(new ad("FragmentManager"));
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.e.add(aVar);
                i++;
            }
        } else {
            this.e = null;
        }
        this.a.set(sVar.g);
        String str3 = sVar.f;
        if (str3 != null) {
            Fragment fragmentK = K(str3);
            this.v = fragmentK;
            x(fragmentK);
        }
        ArrayList<String> arrayList2 = sVar.h;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Bundle bundle = sVar.i.get(i10);
                bundle.setClassLoader(this.r.b.getClassLoader());
                this.j.put(arrayList2.get(i10), bundle);
            }
        }
        this.y = new ArrayDeque<>(sVar.b);
    }

    public Parcelable ab() {
        int i;
        b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) h()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i iVar = (i) it.next();
            if (iVar.e) {
                iVar.e = false;
                iVar.g();
            }
        }
        A();
        D(true);
        this.C = true;
        this.J.k = true;
        X x = this.d;
        Objects.requireNonNull(x);
        ArrayList<ivas.gov.bisp.enumeration.F.n> arrayList2 = new ArrayList<>(x.d.size());
        Iterator<t> it2 = x.d.values().iterator();
        while (true) {
            bVarArr = null;
            bVarArr = null;
            if (!it2.hasNext()) {
                break;
            }
            t next = it2.next();
            if (next != null) {
                Fragment fragment = next.c;
                ivas.gov.bisp.enumeration.F.n nVar = new ivas.gov.bisp.enumeration.F.n(fragment);
                Fragment fragment2 = next.c;
                if (fragment2.mState < 0 || nVar.f43o != null) {
                    nVar.f43o = fragment2.mSavedFragmentState;
                } else {
                    Bundle bundle = new Bundle();
                    next.c.performSaveInstanceState(bundle);
                    next.a.l(next.c, bundle, false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (next.c.mView != null) {
                        next.r();
                    }
                    if (next.c.mSavedViewState != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", next.c.mSavedViewState);
                    }
                    if (next.c.mSavedViewRegistryState != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", next.c.mSavedViewRegistryState);
                    }
                    if (!next.c.mUserVisibleHint) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", next.c.mUserVisibleHint);
                    }
                    nVar.f43o = bundle2;
                    if (next.c.mTargetWho != null) {
                        if (bundle2 == null) {
                            nVar.f43o = new Bundle();
                        }
                        nVar.f43o.putString("android:target_state", next.c.mTargetWho);
                        int i2 = next.c.mTargetRequestCode;
                        if (i2 != 0) {
                            nVar.f43o.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(nVar);
                if (b(2)) {
                    Objects.toString(fragment);
                    Objects.toString(nVar.f43o);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        X x2 = this.d;
        synchronized (x2.c) {
            if (x2.c.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(x2.c.size());
                Iterator<Fragment> it3 = x2.c.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().mWho);
                    b(2);
                }
            }
        }
        ArrayList<a> arrayList3 = this.e;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (i = 0; i < size; i++) {
                bVarArr[i] = new b(this.e.get(i));
                if (b(2)) {
                    Objects.toString(this.e.get(i));
                }
            }
        }
        s sVar = new s();
        sVar.c = arrayList2;
        sVar.d = arrayList;
        sVar.e = bVarArr;
        sVar.g = this.a.get();
        Fragment fragment3 = this.v;
        if (fragment3 != null) {
            sVar.f = fragment3.mWho;
        }
        sVar.h.addAll(this.j.keySet());
        sVar.i.addAll(this.j.values());
        sVar.b = new ArrayList<>(this.y);
        return sVar;
    }

    public void ac() {
        synchronized (this.b) {
            ArrayList<aLO> arrayList = this.F;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.b.size() == 1;
            if (z || z2) {
                this.r.c.removeCallbacks(this.K);
                this.r.c.post(this.K);
                aj();
            }
        }
    }

    public void ad(Fragment fragment, boolean z) {
        ViewGroup viewGroupM = M(fragment);
        if (viewGroupM == null || !(viewGroupM instanceof o000OOo)) {
            return;
        }
        ((o000OOo) viewGroupM).setDrawDisappearingViewsLast(!z);
    }

    public void ae(Fragment fragment, androidx.lifecycle.d.aMa ama) {
        if (fragment.equals(K(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = ama;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void af(Fragment fragment) {
        if (fragment == null || (fragment.equals(K(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.v;
            this.v = fragment;
            x(fragment2);
            x(this.v);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void ag(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void ah(Fragment fragment) {
        ViewGroup viewGroupM = M(fragment);
        if (viewGroupM != null) {
            int enterAnim = fragment.getEnterAnim();
            int exitAnim = fragment.getExitAnim();
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + exitAnim + enterAnim > 0) {
                if (viewGroupM.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupM.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void ai() {
        Iterator it = ((ArrayList) this.d.h()).iterator();
        while (it.hasNext()) {
            ak((t) it.next());
        }
    }

    public final void aj() {
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                this.i.a = true;
                return;
            }
            ivas.gov.bisp.enumeration.p083f.c cVar = this.i;
            ArrayList<a> arrayList = this.e;
            cVar.a = arrayList != null && arrayList.size() > 0 && T(this.s);
        }
    }

    public void ak(t tVar) {
        Fragment fragment = tVar.c;
        if (fragment.mDeferStart) {
            if (this.c) {
                this.E = true;
            } else {
                fragment.mDeferStart = false;
                tVar.n();
            }
        }
    }

    public final void c(Fragment fragment) {
        fragment.performDestroyView();
        this.m.o(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public t d(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        t tVarK = k(fragment);
        fragment.mFragmentManager = this;
        this.d.l(tVarK);
        if (!fragment.mDetached) {
            this.d.d(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Q(fragment)) {
                this.A = true;
            }
        }
        return tVarK;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void e(o000000O<?> o000000o, A a, Fragment fragment) {
        ivas.gov.bisp.enumeration.p027b.d dVar;
        if (this.r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.r = o000000o;
        this.q = a;
        this.s = fragment;
        if (fragment != null) {
            this.f24o.add(new aLH(this, fragment));
        } else if (o000000o instanceof D) {
            this.f24o.add((D) o000000o);
        }
        if (this.s != null) {
            aj();
        }
        if (o000000o instanceof ivas.gov.bisp.enumeration.p083f.h) {
            ivas.gov.bisp.enumeration.p083f.h hVar = (ivas.gov.bisp.enumeration.p083f.h) o000000o;
            OnBackPressedDispatcher onBackPressedDispatcherC = hVar.c();
            this.h = onBackPressedDispatcherC;
            if (fragment != null) {
                dVar = hVar;
                dVar = fragment;
            }
            dVar = hVar;
            onBackPressedDispatcherC.b(dVar, this.i);
        }
        if (fragment != null) {
            al alVar = fragment.mFragmentManager.J;
            al alVar2 = alVar.g.get(fragment.mWho);
            if (alVar2 == null) {
                alVar2 = new al(alVar.h);
                alVar.g.put(fragment.mWho, alVar2);
            }
            this.J = alVar2;
        } else if (o000000o instanceof InterfaceC0106f) {
            an viewModelStore = ((InterfaceC0106f) o000000o).getViewModelStore();
            Object obj = al.e;
            String canonicalName = al.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String strR = ivas.gov.bisp.enumeration.p091n.j.r("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            ap apVarD = viewModelStore.a.get(strR);
            if (!al.class.isInstance(apVarD)) {
                apVarD = obj instanceof H ? ((H) obj).d(strR, al.class) : ((al.aYC) obj).b(al.class);
                ap apVarPut = viewModelStore.a.put(strR, apVarD);
                if (apVarPut != null) {
                    apVarPut.c();
                }
            } else if (obj instanceof G) {
                ((G) obj).c(apVarD);
            }
            this.J = (al) apVarD;
        } else {
            this.J = new al(false);
        }
        this.J.k = S();
        this.d.e = this.J;
        ivas.gov.bisp.enumeration.p084g.i iVar = this.r;
        if (iVar instanceof ivas.gov.bisp.enumeration.p084g.i) {
            ActivityResultRegistry activityResultRegistryD = iVar.d();
            String strR2 = ivas.gov.bisp.enumeration.p091n.j.r("FragmentManager:", fragment != null ? ivas.gov.bisp.enumeration.p091n.j.u(new StringBuilder(), fragment.mWho, ":") : BuildConfig.FLAVOR);
            this.x = activityResultRegistryD.d(ivas.gov.bisp.enumeration.p091n.j.r(strR2, "StartActivityForResult"), new ivas.gov.bisp.enumeration.I.i(), new aLI());
            this.t = activityResultRegistryD.d(ivas.gov.bisp.enumeration.p091n.j.r(strR2, "StartIntentSenderForResult"), new aLK(), new aLy());
            this.z = activityResultRegistryD.d(ivas.gov.bisp.enumeration.p091n.j.r(strR2, "RequestPermissions"), new ivas.gov.bisp.enumeration.I.e(), new aLz());
        }
    }

    public void f(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.d.d(fragment);
            b(2);
            if (Q(fragment)) {
                this.A = true;
            }
        }
    }

    public final void g(Fragment fragment) {
        HashSet<ivas.gov.bisp.enumeration.H.c> hashSet = this.l.get(fragment);
        if (hashSet != null) {
            Iterator<ivas.gov.bisp.enumeration.H.c> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            hashSet.clear();
            c(fragment);
            this.l.remove(fragment);
        }
    }

    public final Set<i> h() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.d.h()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(i.c(viewGroup, P()));
            }
        }
        return hashSet;
    }

    public final void i() {
        this.c = false;
        this.H.clear();
        this.G.clear();
    }

    public void j(a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.e(z3);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.p > 0) {
            w.r(this.r.b, this.q, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z3) {
            U(this.p, true);
        }
        for (Fragment fragment : (ArrayList) this.d.j()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.m(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public t k(Fragment fragment) {
        t tVarK = this.d.k(fragment.mWho);
        if (tVarK != null) {
            return tVarK;
        }
        t tVar = new t(this.m, this.d, fragment);
        tVar.q(this.r.b.getClassLoader());
        tVar.e = this.p;
        return tVar;
    }

    public void l(Fragment fragment) {
        if (b(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            b(2);
            this.d.n(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            ah(fragment);
        }
    }

    public void m(Configuration configuration) {
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean n(MenuItem menuItem) {
        if (this.p <= 0) {
            return false;
        }
        for (Fragment fragment : this.d.c()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean o(Menu menu, MenuInflater menuInflater) {
        if (this.p <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.d.c()) {
            if (fragment != null && H(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                Fragment fragment2 = this.g.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.g = arrayList;
        return z;
    }

    public void p() {
        this.C = false;
        this.B = false;
        this.J.k = false;
        z(1);
    }

    public void q() {
        this.D = true;
        D(true);
        A();
        z(-1);
        this.r = null;
        this.q = null;
        this.s = null;
        if (this.h != null) {
            Iterator<ivas.gov.bisp.enumeration.p083f.j> it = this.i.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.h = null;
        }
        OooO<Intent> oooO = this.x;
        if (oooO != null) {
            oooO.d();
            this.t.d();
            this.z.d();
        }
    }

    public void r() {
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public boolean s(MenuItem menuItem) {
        if (this.p <= 0) {
            return false;
        }
        for (Fragment fragment : this.d.c()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void t(boolean z) {
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.s)));
            sb.append("}");
        } else {
            o000000O<?> o000000o = this.r;
            if (o000000o != null) {
                sb.append(o000000o.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u(Menu menu) {
        if (this.p <= 0) {
            return;
        }
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void v() {
        if (this.E) {
            this.E = false;
            ai();
        }
    }

    public void w(boolean z) {
        for (Fragment fragment : this.d.c()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final void x(Fragment fragment) {
        if (fragment == null || !fragment.equals(K(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public boolean y(Menu menu) {
        boolean z = false;
        if (this.p <= 0) {
            return false;
        }
        for (Fragment fragment : this.d.c()) {
            if (fragment != null && H(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void z(int i) {
        try {
            this.c = true;
            for (t tVar : this.d.d.values()) {
                if (tVar != null) {
                    tVar.e = i;
                }
            }
            U(i, false);
            Iterator it = ((HashSet) h()).iterator();
            while (it.hasNext()) {
                ((i) it.next()).i();
            }
            this.c = false;
            D(true);
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class aLL implements Parcelable {
        public static final Parcelable.Creator<aLL> CREATOR = new aLM();
        public String b;
        public int c;

        public class aLM implements Parcelable.Creator<aLL> {
            @Override // android.os.Parcelable.Creator
            public aLL createFromParcel(Parcel parcel) {
                return new aLL(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public aLL[] newArray(int i) {
                return new aLL[i];
            }
        }

        public aLL(String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }

        public aLL(Parcel parcel) {
            this.b = parcel.readString();
            this.c = parcel.readInt();
        }
    }
}
