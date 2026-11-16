package org.acra.collector;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import org.acra.ReportField;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesCollector extends BaseReportFieldCollector {

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.USER_EMAIL.ordinal()] = 1;
            iArr[ReportField.SHARED_PREFERENCES.ordinal()] = 2;
            a = iArr;
        }
    }

    public SharedPreferencesCollector() {
        super(ReportField.USER_EMAIL, ReportField.SHARED_PREFERENCES);
    }

    private boolean filteredKey(r rVar, String str) {
        for (String str2 : rVar.f54o) {
            ivas.gov.bisp.enumeration.O.r.n(str2, "pattern");
            Pattern patternCompile = Pattern.compile(str2);
            ivas.gov.bisp.enumeration.O.r.m(patternCompile, "compile(pattern)");
            ivas.gov.bisp.enumeration.O.r.n(str, "input");
            if (patternCompile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, r rVar, b bVar, j jVar) {
        SharedPreferences defaultSharedPreferences;
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        int i = OooO00o.a[reportField.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            jVar.i(ReportField.SHARED_PREFERENCES, collect(context, rVar));
            return;
        }
        ReportField reportField2 = ReportField.USER_EMAIL;
        if (ivas.gov.bisp.enumeration.O.r.f(BuildConfig.FLAVOR, rVar.d)) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            ivas.gov.bisp.enumeration.O.r.m(defaultSharedPreferences, "{\n            @Suppress(…rences(context)\n        }");
        } else {
            defaultSharedPreferences = context.getSharedPreferences(rVar.d, 0);
            ivas.gov.bisp.enumeration.O.r.m(defaultSharedPreferences, "{\n            context.ge…t.MODE_PRIVATE)\n        }");
        }
        jVar.g(reportField2, defaultSharedPreferences.getString("acra.user.email", null));
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }

    private JSONObject collect(Context context, r rVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        TreeMap treeMap = new TreeMap();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        ivas.gov.bisp.enumeration.O.r.m(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        treeMap.put("default", defaultSharedPreferences);
        for (String str : rVar.c) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            ivas.gov.bisp.enumeration.O.r.m(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
            treeMap.put(str, sharedPreferences);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Map<String, ?> all = ((SharedPreferences) entry.getValue()).getAll();
            if (all.isEmpty()) {
                jSONObject.put(str2, "empty");
            } else {
                Iterator<String> it = all.keySet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    ivas.gov.bisp.enumeration.O.r.m(next, "iterator.next()");
                    if (filteredKey(rVar, next)) {
                        it.remove();
                    }
                }
                jSONObject.put(str2, new JSONObject(all));
            }
        }
        return jSONObject;
    }
}
