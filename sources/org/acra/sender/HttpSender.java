package org.acra.sender;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.aB.i;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bW.W;
import ivas.gov.bisp.enumeration.bW.y;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.p059ce.j;
import ivas.gov.bisp.enumeration.p061cg.e;
import ivas.gov.bisp.enumeration.p061cg.r;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.acra.data.StringFormat;

/* JADX INFO: loaded from: classes.dex */
public class HttpSender implements r {
    public final ivas.gov.bisp.enumeration.aB.r a;
    public final i b;
    public final Uri c;
    public final Method d;
    public final StringFormat e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final abstract class Method {
        public static final Method POST = new OooO00o("POST", 0);
        public static final Method PUT = new OooO0O0("PUT", 1);
        private static final /* synthetic */ Method[] $VALUES = $values();

        public static final class OooO00o extends Method {
            public OooO00o(String str, int i) {
                super(str, i, null);
            }

            @Override // org.acra.sender.HttpSender.Method
            public final URL createURL(String str, j jVar) {
                ivas.gov.bisp.enumeration.O.r.n(str, "baseUrl");
                ivas.gov.bisp.enumeration.O.r.n(jVar, "report");
                return new URL(str);
            }
        }

        public static final class OooO0O0 extends Method {
            public OooO0O0(String str, int i) {
                super(str, i, null);
            }

            @Override // org.acra.sender.HttpSender.Method
            public final URL createURL(String str, j jVar) {
                ivas.gov.bisp.enumeration.O.r.n(str, "baseUrl");
                ivas.gov.bisp.enumeration.O.r.n(jVar, "report");
                ReportField reportField = ReportField.REPORT_ID;
                ivas.gov.bisp.enumeration.O.r.n(reportField, "key");
                return new URL(ivas.gov.bisp.enumeration.p091n.j.t(str, "/", jVar.c.optString(reportField.toString())));
            }
        }

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{POST, PUT};
        }

        private Method(String str, int i) {
            super(str, i);
        }

        public /* synthetic */ Method(String str, int i, u uVar) {
            this(str, i);
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }

        public abstract URL createURL(String str, j jVar);
    }

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Method.values().length];
            iArr[Method.POST.ordinal()] = 1;
            iArr[Method.PUT.ordinal()] = 2;
            a = iArr;
        }
    }

    public HttpSender(ivas.gov.bisp.enumeration.aB.r rVar, Method method, StringFormat stringFormat, String str, int i) {
        this.a = rVar;
        i iVar = (i) ivas.gov.bisp.enumeration.p100w.r.F(rVar, i.class);
        this.b = iVar;
        Uri uri = Uri.parse(iVar.e);
        ivas.gov.bisp.enumeration.O.r.m(uri, "parse(formUri ?: httpConfig.uri)");
        this.c = uri;
        this.d = iVar.g;
        this.e = rVar.u;
    }

    @Override // ivas.gov.bisp.enumeration.p061cg.r
    public void b(Context context, j jVar, Bundle bundle) throws e {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "errorContent");
        ivas.gov.bisp.enumeration.O.r.n(bundle, "extras");
        f(context, jVar);
    }

    public final boolean d(String str) {
        return (str == null || str.length() <= 0 || ivas.gov.bisp.enumeration.O.r.f("ACRA-NULL-STRING", str)) ? false : true;
    }

    @Override // ivas.gov.bisp.enumeration.p061cg.r
    public /* synthetic */ boolean e() {
        return false;
    }

    public void f(Context context, j jVar) throws e {
        try {
            String string = this.c.toString();
            ivas.gov.bisp.enumeration.O.r.m(string, "mFormUri.toString()");
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            y w = null;
            String str = d(this.b.f) ? this.b.f : null;
            String str2 = d(this.b.h) ? this.b.h : null;
            Class<? extends y> cls = this.a.v;
            ivas.gov.bisp.enumeration.O.r.n(cls, "clazz");
            try {
                w = cls.newInstance();
            } catch (IllegalAccessException e) {
                ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar4 = P.c;
                String name = cls.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create instance of class ");
                sb.append(name);
                ((ivas.gov.bisp.enumeration.O.i) jVar3).w("OooOOO", sb.toString(), e);
            } catch (InstantiationException e2) {
                ivas.gov.bisp.enumeration.aO.j jVar5 = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar6 = P.c;
                String name2 = cls.getName();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create instance of class ");
                sb2.append(name2);
                ((ivas.gov.bisp.enumeration.O.i) jVar5).w("OooOOO", sb2.toString(), e2);
            }
            if (w == null) {
                w = new W();
            }
            List<Uri> listB = w.b(context, this.a);
            StringFormat stringFormat = this.e;
            ivas.gov.bisp.enumeration.O.r.n(stringFormat, "format");
            String formattedString = stringFormat.toFormattedString(jVar, this.a.i, "&", "\n", true);
            URL urlCreateURL = this.d.createURL(string, jVar);
            ivas.gov.bisp.enumeration.aB.r rVar = this.a;
            Method method = this.d;
            String matchingHttpContentType = this.e.getMatchingHttpContentType();
            i iVar = this.b;
            h(rVar, context, method, matchingHttpContentType, str, str2, iVar.i, iVar.j, iVar.q, formattedString, urlCreateURL, listB);
        } catch (Exception e3) {
            StringFormat stringFormat2 = this.a.u;
            String strName = this.d.name();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error while sending ");
            sb3.append(stringFormat2);
            sb3.append(" report via Http ");
            sb3.append(strName);
            throw new e(sb3.toString(), e3);
        }
    }

    public void g(ivas.gov.bisp.enumeration.aB.r rVar, Context context, Method method, String str, String str2, String str3, int i, int i2, Map<String, String> map, String str4, URL url) {
        new ivas.gov.bisp.enumeration.cY.e(rVar, context, method, str, str2, str3, i, i2, map).f(url, str4);
    }

    public void h(ivas.gov.bisp.enumeration.aB.r rVar, Context context, Method method, String str, String str2, String str3, int i, int i2, Map<String, String> map, String str4, URL url, List<? extends Uri> list) {
        ivas.gov.bisp.enumeration.O.r.n(rVar, "configuration");
        ivas.gov.bisp.enumeration.O.r.n(method, "method");
        ivas.gov.bisp.enumeration.O.r.n(str, "contentType");
        ivas.gov.bisp.enumeration.O.r.n(str4, "content");
        ivas.gov.bisp.enumeration.O.r.n(url, "url");
        ivas.gov.bisp.enumeration.O.r.n(list, "attachments");
        int i3 = OooO00o.a[method.ordinal()];
        if (i3 == 1) {
            if (list.isEmpty()) {
                g(rVar, context, method, str, str2, str3, i, i2, map, str4, url);
                return;
            } else {
                new ivas.gov.bisp.enumeration.cY.i(rVar, context, str, str2, str3, i, i2, map).f(url, new aE(str4, list));
                return;
            }
        }
        if (i3 == 2) {
            g(rVar, context, method, str, str2, str3, i, i2, map, str4, url);
            for (Uri uri : list) {
                ivas.gov.bisp.enumeration.O.r.n(uri, "attachment");
                try {
                    String string = url.toString();
                    Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                ivas.gov.bisp.enumeration.O.r.m(string2, "cursor.getString(cursor.…bleColumns.DISPLAY_NAME))");
                                ivas.gov.bisp.enumeration.p100w.r.k(cursorQuery, null);
                                StringBuilder sb = new StringBuilder();
                                sb.append(string);
                                sb.append("-");
                                sb.append(string2);
                                new ivas.gov.bisp.enumeration.cY.r(rVar, context, str2, str3, i, i2, map).f(new URL(sb.toString()), uri);
                            } else {
                                ivas.gov.bisp.enumeration.p100w.r.k(cursorQuery, null);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ivas.gov.bisp.enumeration.p100w.r.k(cursorQuery, th);
                                throw th2;
                            }
                        }
                        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not resolve filename of ");
                    sb2.append(uri);
                    throw new FileNotFoundException(sb2.toString());
                } catch (FileNotFoundException unused) {
                    ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                }
            }
        }
    }
}
