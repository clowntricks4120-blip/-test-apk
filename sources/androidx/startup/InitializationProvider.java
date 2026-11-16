package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import ivas.gov.bisp.enumeration.E.i;
import ivas.gov.bisp.enumeration.E.p;
import ivas.gov.bisp.enumeration.E.z;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.o00Oo0.OooOO0O;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new z("Context cannot be null");
        }
        i iVarC = i.c(context);
        Objects.requireNonNull(iVarC);
        try {
            try {
                Trace.beginSection("Startup");
                Bundle bundle = iVarC.g.getPackageManager().getProviderInfo(new ComponentName(iVarC.g.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = iVarC.g.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (p.class.isAssignableFrom(cls)) {
                                iVarC.f.add((Class<? extends OooOO0O<?>>) cls);
                                iVarC.d(cls, hashSet);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new z(e);
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
