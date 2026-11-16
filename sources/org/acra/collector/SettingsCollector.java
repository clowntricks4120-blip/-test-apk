package org.acra.collector;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import org.acra.ReportField;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SettingsCollector extends BaseReportFieldCollector {
    public static final OooO00o Companion = new OooO00o(null);
    private static final String ERROR = "Error: ";

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    public final /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.SETTINGS_SYSTEM.ordinal()] = 1;
            iArr[ReportField.SETTINGS_SECURE.ordinal()] = 2;
            iArr[ReportField.SETTINGS_GLOBAL.ordinal()] = 3;
            a = iArr;
        }
    }

    public SettingsCollector() {
        super(ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, ReportField.SETTINGS_GLOBAL);
    }

    private JSONObject collectSettings(Context context, r rVar, Class<?> cls) throws NoSuchMethodException {
        JSONObject jSONObject = new JSONObject();
        Field[] fields = cls.getFields();
        Method method = cls.getMethod("getString", ContentResolver.class, String.class);
        ivas.gov.bisp.enumeration.O.r.m(fields, "keys");
        for (Field field : fields) {
            if (!field.isAnnotationPresent(Deprecated.class) && ivas.gov.bisp.enumeration.O.r.f(field.getType(), String.class) && isAuthorized(rVar, field)) {
                try {
                    Object objInvoke = method.invoke(null, context.getContentResolver(), field.get(null));
                    if (objInvoke != null) {
                        jSONObject.put(field.getName(), objInvoke);
                    }
                } catch (Exception e) {
                    j jVar = P.c;
                    j jVar2 = P.c;
                    ((i) jVar).y("OooOOO", ERROR, e);
                }
            }
        }
        return jSONObject;
    }

    private boolean isAuthorized(r rVar, Field field) {
        if (field != null) {
            String name = field.getName();
            ivas.gov.bisp.enumeration.O.r.m(name, "key.name");
            if (!ae.aq(name, "WIFI_AP", false, 2)) {
                for (String str : rVar.n) {
                    String name2 = field.getName();
                    ivas.gov.bisp.enumeration.O.r.m(name2, "key.name");
                    ivas.gov.bisp.enumeration.O.r.n(str, "pattern");
                    Pattern patternCompile = Pattern.compile(str);
                    ivas.gov.bisp.enumeration.O.r.m(patternCompile, "compile(pattern)");
                    if (patternCompile.matcher(name2).matches()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        ivas.gov.bisp.enumeration.O.r.n(reportField, "reportField");
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        ivas.gov.bisp.enumeration.O.r.n(bVar, "reportBuilder");
        ivas.gov.bisp.enumeration.O.r.n(jVar, "target");
        int i = OooO0O0.a[reportField.ordinal()];
        if (i == 1) {
            jVar.i(ReportField.SETTINGS_SYSTEM, collectSettings(context, rVar, Settings.System.class));
        } else if (i == 2) {
            jVar.i(ReportField.SETTINGS_SECURE, collectSettings(context, rVar, Settings.Secure.class));
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            jVar.i(ReportField.SETTINGS_GLOBAL, collectSettings(context, rVar, Settings.Global.class));
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(r rVar) {
        T.b(rVar);
        return true;
    }
}
