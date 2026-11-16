package org.acra.data;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.bN.D;
import ivas.gov.bisp.enumeration.bN.Y;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bT.A;
import ivas.gov.bisp.enumeration.bT.V;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: classes.dex */
public enum StringFormat {
    JSON { // from class: org.acra.data.StringFormat.OooO00o
        @Override // org.acra.data.StringFormat
        public final String toFormattedString(j jVar, List<? extends ReportField> list, String str, String str2, boolean z) throws JSONException {
            r.n(jVar, "data");
            r.n(list, "order");
            r.n(str, "mainJoiner");
            r.n(str2, "subJoiner");
            Map mapAp = C0130y.ap(jVar.j());
            JSONStringer jSONStringerObject = new JSONStringer().object();
            for (ReportField reportField : list) {
                jSONStringerObject.key(reportField.toString()).value(mapAp.remove(reportField.toString()));
            }
            for (Map.Entry entry : ((LinkedHashMap) mapAp).entrySet()) {
                String str3 = (String) entry.getKey();
                jSONStringerObject.key(str3).value(entry.getValue());
            }
            String string = jSONStringerObject.endObject().toString();
            r.m(string, "stringer.endObject().toString()");
            return string;
        }
    },
    KEY_VALUE_LIST { // from class: org.acra.data.StringFormat.OooO0O0
        public final void b(StringBuilder sb, String str, String str2, String str3, boolean z) {
            if (sb.length() > 0) {
                sb.append(str3);
            }
            if (z) {
                str = str != null ? URLEncoder.encode(str, "UTF-8") : null;
                str2 = str2 != null ? URLEncoder.encode(str2, "UTF-8") : null;
            }
            ivas.gov.bisp.enumeration.p091n.j.v(sb, str, '=', str2);
        }

        public final List<String> c(JSONObject jSONObject) {
            Object obj;
            Collection collectionT;
            Iterator<String> itKeys = jSONObject.keys();
            r.m(itKeys, "json.keys()");
            A aB = V.b(itKeys);
            ArrayList arrayList = new ArrayList();
            Iterator it = aB.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            List<String> listV = ivas.gov.bisp.enumeration.p100w.r.V(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (String str : listV) {
                try {
                    obj = jSONObject.get(str);
                } catch (JSONException unused) {
                    obj = null;
                }
                if (obj instanceof JSONObject) {
                    List<String> listC = c((JSONObject) obj);
                    collectionT = new ArrayList(C0130y.an(listC, 10));
                    for (String str2 : listC) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".");
                        sb.append(str2);
                        collectionT.add(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("=");
                    sb2.append(obj);
                    collectionT = ivas.gov.bisp.enumeration.p100w.r.T(sb2.toString());
                }
                arrayList2.addAll(collectionT);
            }
            return arrayList2;
        }

        @Override // org.acra.data.StringFormat
        public final String toFormattedString(j jVar, List<? extends ReportField> list, String str, String str2, boolean z) {
            r.n(jVar, "data");
            r.n(list, "order");
            r.n(str, "mainJoiner");
            r.n(str2, "subJoiner");
            Map<String, Object> mapJ = jVar.j();
            int size = mapJ.size();
            if (size >= 0) {
                size = size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size);
            Iterator<T> it = mapJ.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.put(key, value instanceof JSONObject ? D.ar(c((JSONObject) value), str2, null, null, 0, null, null, 62) : String.valueOf(value));
            }
            int size2 = linkedHashMap.size();
            Map mapAp = C0130y.ap(size2 != 0 ? size2 != 1 ? C0130y.ap(linkedHashMap) : ivas.gov.bisp.enumeration.p100w.r.ad(linkedHashMap) : Y.c);
            StringBuilder sb = new StringBuilder();
            for (ReportField reportField : list) {
                b(sb, reportField.toString(), (String) mapAp.remove(reportField.toString()), str, z);
            }
            for (Map.Entry entry2 : ((LinkedHashMap) mapAp).entrySet()) {
                b(sb, (String) entry2.getKey(), (String) entry2.getValue(), str, z);
            }
            String string = sb.toString();
            r.m(string, "builder.toString()");
            return string;
        }
    };

    private final String matchingHttpContentType;

    StringFormat(String str) {
        this.matchingHttpContentType = str;
    }

    /* synthetic */ StringFormat(String str, u uVar) {
        this(str);
    }

    public final String getMatchingHttpContentType() {
        return this.matchingHttpContentType;
    }

    public abstract String toFormattedString(j jVar, List<? extends ReportField> list, String str, String str2, boolean z);
}
