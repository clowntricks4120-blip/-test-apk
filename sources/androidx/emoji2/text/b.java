package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p001aa.i;
import ivas.gov.bisp.enumeration.p014an.as;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final Object a = new Object();
    public static volatile b b;
    public final aKo c;
    public final ReadWriteLock d;
    public final Set<aKp> e;
    public volatile int f;
    public final Handler g;
    public final aKb h;
    public final aKm i;
    public final int j;
    public final int k;

    public static abstract class aKa {
        public final aKb a;
        public int b = 0;
        public aKo c = new c.aKu();

        public aKa(aKb akb) {
            this.a = akb;
        }
    }

    public interface aKb {
        void b(aKk akk);
    }

    public static abstract class aKk {
        public abstract void b(Throwable th);

        public abstract void c(f fVar);
    }

    public static final class aKl extends aKm {
        public volatile c b;
        public volatile f c;

        public class aKn extends aKk {
            public aKn() {
            }

            @Override // androidx.emoji2.text.b.aKk
            public void b(Throwable th) {
                aKl.this.a.h(th);
            }

            @Override // androidx.emoji2.text.b.aKk
            public void c(f fVar) {
                aKl akl = aKl.this;
                if (fVar == null) {
                    akl.a.h(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                akl.c = fVar;
                f fVar2 = akl.c;
                aKr akr = new aKr();
                b bVar = akl.a;
                aKo ako = bVar.c;
                Objects.requireNonNull(bVar);
                akl.b = new c(fVar2, akr, ako, false, null);
                akl.a.j();
            }
        }

        public aKl(b bVar) {
            super(bVar);
        }

        @Override // androidx.emoji2.text.b.aKm
        public final void b() {
            try {
                this.a.h.b(new aKn());
            } catch (Throwable th) {
                this.a.h(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r8v10, types: [android.text.SpannableString] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v22 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7, types: [android.text.Spannable] */
        /* JADX WARN: Type inference failed for: r8v8, types: [android.text.SpannableString] */
        /* JADX WARN: Type inference failed for: r8v9, types: [android.text.Spannable] */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x009e
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // androidx.emoji2.text.b.aKm
        public final java.lang.CharSequence c(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.b.aKl.c(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        @Override // androidx.emoji2.text.b.aKm
        public final void d(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            as asVar = this.c.a;
            int iC = asVar.c(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iC != 0 ? asVar.d.getInt(iC + asVar.c) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public static class aKm {
        public final b a;

        public aKm(b bVar) {
            this.a = bVar;
        }

        public void b() {
            throw null;
        }

        public CharSequence c(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        public void d(EditorInfo editorInfo) {
            throw null;
        }
    }

    public interface aKo {
    }

    public static abstract class aKp {
        public void b() {
        }
    }

    public static class aKq implements Runnable {
        public final List<aKp> a;
        public final int b;

        public aKq(Collection<aKp> collection, int i, Throwable th) {
            r.k(collection, "initCallbacks cannot be null");
            this.a = new ArrayList(collection);
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.a.size();
            int i = 0;
            if (this.b != 1) {
                while (i < size) {
                    Objects.requireNonNull(this.a.get(i));
                    i++;
                }
            } else {
                while (i < size) {
                    this.a.get(i).b();
                    i++;
                }
            }
        }
    }

    public static class aKr {
    }

    public b(aKa aka) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock;
        this.f = 3;
        Objects.requireNonNull(aka);
        this.j = -16711936;
        this.h = aka.a;
        int i = aka.b;
        this.k = i;
        this.c = aka.c;
        this.g = new Handler(Looper.getMainLooper());
        this.e = new i();
        aKl akl = new aKl(this);
        this.i = akl;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f = 0;
            } catch (Throwable th) {
                this.d.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (f() == 0) {
            akl.b();
        }
    }

    public static b c() {
        b bVar;
        synchronized (a) {
            bVar = b;
            r.o(bVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return bVar;
    }

    public static boolean d() {
        return b != null;
    }

    public CharSequence e(CharSequence charSequence, int i, int i2, int i3, int i4) {
        r.o(g(), "Not initialized yet");
        r.i(i, "start cannot be negative");
        r.i(i2, "end cannot be negative");
        r.i(i3, "maxEmojiCount cannot be negative");
        r.h(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        r.h(i <= charSequence.length(), "start should be < than charSequence length");
        r.h(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.i.c(charSequence, i, i2, i3, i4 == 1);
    }

    public int f() {
        this.d.readLock().lock();
        try {
            return this.f;
        } finally {
            this.d.readLock().unlock();
        }
    }

    public final boolean g() {
        return f() == 1;
    }

    public void h(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.d.writeLock().lock();
        try {
            this.f = 2;
            arrayList.addAll(this.e);
            this.e.clear();
            this.d.writeLock().unlock();
            this.g.post(new aKq(arrayList, this.f, th));
        } catch (Throwable th2) {
            this.d.writeLock().unlock();
            throw th2;
        }
    }

    public void i() {
        r.o(this.k == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (g()) {
            return;
        }
        this.d.writeLock().lock();
        try {
            if (this.f == 0) {
                this.d.writeLock().unlock();
                return;
            }
            this.f = 0;
            this.d.writeLock().unlock();
            this.i.b();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public void j() {
        ArrayList arrayList = new ArrayList();
        this.d.writeLock().lock();
        try {
            this.f = 1;
            arrayList.addAll(this.e);
            this.e.clear();
            this.d.writeLock().unlock();
            this.g.post(new aKq(arrayList, this.f, null));
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence k(CharSequence charSequence) {
        return e(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public void l(aKp akp) {
        r.k(akp, "initCallback cannot be null");
        this.d.writeLock().lock();
        try {
            if (this.f == 1 || this.f == 2) {
                this.g.post(new aKq(Arrays.asList(akp), this.f, null));
            } else {
                this.e.add(akp);
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }
}
