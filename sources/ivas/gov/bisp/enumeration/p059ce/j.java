package ivas.gov.bisp.enumeration.p059ce;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bN.Y;
import ivas.gov.bisp.enumeration.bO.l;
import ivas.gov.bisp.enumeration.bT.V;
import ivas.gov.bisp.enumeration.bT.s;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.o000o0oo.o00OO00O;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.acra.ReportField;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 1;
    private static int b;
    public final JSONObject c;

    public static final class bze extends l implements o0OoOoOo<String, o00OO00O<? extends String, ? extends Object>> {
        private static int a = 1;
        private static int b;

        public bze() {
            super(1);
        }

        public final Object e(Object obj) {
            int i = 2 % 2;
            int i2 = a + 115;
            b = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                r.m((String) obj, "it");
                obj2.hashCode();
                throw null;
            }
            String str = (String) obj;
            j jVar = j.this;
            r.m(str, "it");
            Objects.requireNonNull(jVar);
            aE aEVar = new aE(str, jVar.c.opt(str));
            int i3 = a;
            int i4 = i3 & 23;
            int i5 = (i3 ^ 23) | i4;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return aEVar;
            }
            throw null;
        }
    }

    public j(String str) {
        r.n(str, "json");
        this.c = new JSONObject(str);
    }

    public final void c(String str, int i) {
        synchronized (this) {
            r.n(str, "key");
            try {
                this.c.put(str, i);
            } catch (JSONException unused) {
                ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to put value into CrashReportData: ");
                sb.append(i);
                ((i) jVar).x("OooOOO", sb.toString());
            }
        }
    }

    public final void d(String str, long j) {
        synchronized (this) {
            r.n(str, "key");
            try {
                this.c.put(str, j);
            } catch (JSONException unused) {
                ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to put value into CrashReportData: ");
                sb.append(j);
                ((i) jVar).x("OooOOO", sb.toString());
            }
        }
    }

    public final void e(String str, String str2) {
        synchronized (this) {
            r.n(str, "key");
            if (str2 == null) {
                try {
                    this.c.put(str, "N/A");
                } catch (JSONException unused) {
                }
                return;
            }
            try {
                this.c.put(str, str2);
            } catch (JSONException unused2) {
                ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to put value into CrashReportData: ");
                sb.append(str2);
                ((i) jVar).x("OooOOO", sb.toString());
            }
        }
    }

    public final void f(String str, JSONObject jSONObject) {
        synchronized (this) {
            r.n(str, "key");
            if (jSONObject == null) {
                try {
                    this.c.put(str, "N/A");
                } catch (JSONException unused) {
                }
                return;
            }
            try {
                this.c.put(str, jSONObject);
            } catch (JSONException unused2) {
                ivas.gov.bisp.enumeration.aO.j jVar = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to put value into CrashReportData: ");
                sb.append(jSONObject);
                ((i) jVar).x("OooOOO", sb.toString());
            }
        }
    }

    public final void g(ReportField reportField, String str) {
        synchronized (this) {
            r.n(reportField, "key");
            e(reportField.toString(), str);
        }
    }

    public final void h(ReportField reportField, long j) {
        synchronized (this) {
            r.n(reportField, "key");
            d(reportField.toString(), j);
        }
    }

    public final void i(ReportField reportField, JSONObject jSONObject) {
        synchronized (this) {
            r.n(reportField, "key");
            f(reportField.toString(), jSONObject);
        }
    }

    public final Map<String, Object> j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        a = i3 % 128;
        int i4 = i3 % 2;
        Iterator<String> itKeys = this.c.keys();
        r.m(itKeys, "content.keys()");
        s sVar = new s(V.b(itKeys), new bze());
        Map linkedHashMap = new LinkedHashMap();
        int i5 = b;
        int i6 = (i5 & (-40)) | ((~i5) & 39);
        int i7 = (i5 & 39) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            sVar.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator it = sVar.iterator();
        while (true) {
            s.byx byxVar = (s.byx) it;
            if (!byxVar.hasNext()) {
                break;
            }
            int i9 = a;
            int i10 = i9 & 85;
            int i11 = -(-((i9 ^ 85) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            aE aEVar = (aE) byxVar.next();
            A a2 = aEVar.c;
            int i14 = a;
            int i15 = i14 & 41;
            int i16 = -(-((i14 ^ 41) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            linkedHashMap.put(a2, aEVar.d);
            int i19 = a;
            int i20 = (i19 & 55) + (i19 | 55);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 4 / 5;
            }
        }
        int size = linkedHashMap.size();
        if (size != 0) {
            int i22 = a + 108;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            int i24 = i23 % 128;
            b = i24;
            if (i23 % 2 == 0 ? size == 1 : size == 0) {
                int i25 = i24 + 45;
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    ivas.gov.bisp.enumeration.p100w.r.ad(linkedHashMap);
                    obj.hashCode();
                    throw null;
                }
                linkedHashMap = ivas.gov.bisp.enumeration.p100w.r.ad(linkedHashMap);
            }
        } else {
            linkedHashMap = Y.c;
            int i26 = a + 25;
            b = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 3 / 4;
            }
        }
        int i28 = b;
        int i29 = ((i28 ^ 17) | (i28 & 17)) << 1;
        int i30 = -(((~i28) & 17) | (i28 & (-18)));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        a = i31 % 128;
        int i32 = i31 % 2;
        return linkedHashMap;
    }
}
