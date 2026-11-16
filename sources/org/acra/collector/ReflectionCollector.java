package org.acra.collector;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.orm.helper.ManifestHelper;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bN.X;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.acra.ReportField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ReflectionCollector extends BaseReportFieldCollector {
    public static final OooO00o Companion = new OooO00o(null);

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }

        public final void b(Class<?> cls, JSONObject jSONObject, Collection<String> collection) {
            Field[] fields = cls.getFields();
            r.m(fields, "fields");
            for (Field field : fields) {
                if (!collection.contains(field.getName())) {
                    try {
                        Object obj = field.get(null);
                        if (obj != null) {
                            if (field.getType().isArray()) {
                                Object[] objArr = (Object[]) obj;
                                jSONObject.put(field.getName(), new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Arrays.copyOf(objArr, objArr.length))));
                            } else {
                                jSONObject.put(field.getName(), obj);
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                    }
                }
            }
        }
    }

    public final /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.BUILD.ordinal()] = 1;
            iArr[ReportField.BUILD_CONFIG.ordinal()] = 2;
            iArr[ReportField.ENVIRONMENT.ordinal()] = 3;
            a = iArr;
        }
    }

    public ReflectionCollector() {
        super(ReportField.BUILD, ReportField.BUILD_CONFIG, ReportField.ENVIRONMENT);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[SYNTHETIC] */
    private void collectStaticGettersResults(Class<?> cls, JSONObject jSONObject) {
        Method[] methods = cls.getMethods();
        r.m(methods, "methods");
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            r.m(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                String name = method.getName();
                r.m(name, "method.name");
                if (!ae.aq(name, "get", false, 2)) {
                    String name2 = method.getName();
                    r.m(name2, "method.name");
                    if (ae.aq(name2, "is", false, 2)) {
                        if (!r.f("getClass", method.getName())) {
                            try {
                                jSONObject.put(method.getName(), method.invoke(null, new Object[0]));
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                } else if (!r.f("getClass", method.getName())) {
                    jSONObject.put(method.getName(), method.invoke(null, new Object[0]));
                }
            }
        }
    }

    private Class<?> getBuildConfigClass(Context context, ivas.gov.bisp.enumeration.aB.r rVar) {
        Class<?> cls = rVar.p;
        if (cls != null) {
            return cls;
        }
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".BuildConfig");
        return Class.forName(sb.toString());
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) throws JSONException {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        JSONObject jSONObject = new JSONObject();
        int i = OooO0O0.a[reportField.ordinal()];
        if (i == 1) {
            OooO00o oooO00o = Companion;
            oooO00o.b(Build.class, jSONObject, ivas.gov.bisp.enumeration.p100w.r.T("SERIAL"));
            JSONObject jSONObject2 = new JSONObject();
            oooO00o.b(Build.VERSION.class, jSONObject2, X.c);
            jSONObject.put(ManifestHelper.METADATA_VERSION, jSONObject2);
        } else if (i == 2) {
            Companion.b(getBuildConfigClass(context, rVar), jSONObject, X.c);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            collectStaticGettersResults(Environment.class, jSONObject);
        }
        jVar.i(reportField, jSONObject);
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }
}
