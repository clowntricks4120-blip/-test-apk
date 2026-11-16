package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class e extends b.aKk {
    public final /* synthetic */ b.aKk a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public e(EmojiCompatInitializer.OooO0O0 oooO0O0, b.aKk akk, ThreadPoolExecutor threadPoolExecutor) {
        this.a = akk;
        this.b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.b.aKk
    public void b(Throwable th) {
        try {
            this.a.b(th);
        } finally {
            this.b.shutdown();
        }
    }

    @Override // androidx.emoji2.text.b.aKk
    public void c(f fVar) {
        try {
            this.a.c(fVar);
        } finally {
            this.b.shutdown();
        }
    }
}
