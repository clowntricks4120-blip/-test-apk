package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p009ai.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    public static class aKh {
        public ProviderInfo b(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] c(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> d(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    public static class aKi extends aKh {
        @Override // androidx.emoji2.text.a.aKh
        public ProviderInfo b(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.aKh
        public List<ResolveInfo> d(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    public static class aKj extends aKi {
        @Override // androidx.emoji2.text.a.aKh
        public Signature[] c(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static d a(Context context) {
        ProviderInfo providerInfoB;
        u uVar;
        ApplicationInfo applicationInfo;
        aKh akj = Build.VERSION.SDK_INT >= 28 ? new aKj() : new aKi();
        PackageManager packageManager = context.getPackageManager();
        r.k(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = akj.d(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoB = null;
                break;
            }
            providerInfoB = akj.b(it.next());
            if (providerInfoB != null && (applicationInfo = providerInfoB.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoB != null) {
            try {
                String str = providerInfoB.authority;
                String str2 = providerInfoB.packageName;
                Signature[] signatureArrC = akj.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrC) {
                    arrayList.add(signature.toByteArray());
                }
                uVar = new u(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                uVar = null;
            }
        } else {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        return new d(context, uVar);
    }
}
