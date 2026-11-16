package org.acra.attachment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import net.sqlcipher.database.SQLiteDatabase;
import org.acra.file.Directory;

/* JADX INFO: loaded from: classes.dex */
public final class AcraContentProvider extends ContentProvider {
    public static final OooO00o a = new OooO00o(null);
    public static final String[] b = {"_display_name", "_size"};
    public String c;

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }

        public final String b(Uri uri) {
            String mimeTypeFromExtension;
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            if (fileExtensionFromUrl != null) {
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                r.m(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                if (mimeTypeFromExtension == null && r.f("json", fileExtensionFromUrl)) {
                    mimeTypeFromExtension = "application/json";
                }
            } else {
                mimeTypeFromExtension = null;
            }
            return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
        }
    }

    public final File c(Uri uri) {
        if (!r.f("content", uri.getScheme()) || !r.f(this.c, uri.getAuthority())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        r.m(pathSegments, "uri.pathSegments");
        ArrayList arrayList = new ArrayList(pathSegments);
        if (arrayList.size() < 2) {
            return null;
        }
        Object objRemove = arrayList.remove(0);
        r.m(objRemove, "segments.removeAt(0)");
        String upperCase = ((String) objRemove).toUpperCase(Locale.ROOT);
        r.m(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        try {
            Directory directoryValueOf = Directory.valueOf(upperCase);
            Context context = getContext();
            r.l(context);
            String strJoin = TextUtils.join(File.separator, arrayList);
            r.m(strJoin, "join(File.separator, segments)");
            return directoryValueOf.getFile(context, strJoin);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        r.n(uri, "uri");
        throw new UnsupportedOperationException("No delete supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        r.n(uri, "uri");
        return a.b(uri);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        r.n(uri, "uri");
        throw new UnsupportedOperationException("No insert supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        r.l(context);
        this.c = j.r(context.getPackageName(), ".acra");
        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        r.n(uri, "uri");
        r.n(str, "mode");
        File fileC = c(uri);
        if (fileC != null) {
            if (!fileC.exists()) {
                fileC = null;
            }
            if (fileC != null) {
                ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileC, SQLiteDatabase.CREATE_IF_NECESSARY);
                r.m(parcelFileDescriptorOpen, "open(file, ParcelFileDescriptor.MODE_READ_ONLY)");
                return parcelFileDescriptorOpen;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File represented by uri ");
        sb.append(uri);
        sb.append(" could not be found");
        throw new FileNotFoundException(sb.toString());
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        r.n(uri, "uri");
        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
        File fileC = c(uri);
        if (fileC == null) {
            return null;
        }
        if (strArr == null) {
            strArr = b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : strArr) {
            try {
                if (r.f(str3, "_display_name")) {
                    linkedHashMap.put("_display_name", fileC.getName());
                } else if (r.f(str3, "_size")) {
                    linkedHashMap.put("_size", Long.valueOf(fileC.length()));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        Object[] array = linkedHashMap.keySet().toArray(new String[0]);
        r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        MatrixCursor matrixCursor = new MatrixCursor((String[]) array, 1);
        matrixCursor.addRow(linkedHashMap.values());
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        r.n(uri, "uri");
        throw new UnsupportedOperationException("No update supported");
    }
}
