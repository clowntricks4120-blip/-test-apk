package org.acra.collector;

import android.content.Context;
import android.content.res.Configuration;
import android.util.SparseArray;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bO.l;
import ivas.gov.bisp.enumeration.bO.u;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationCollector extends BaseReportFieldCollector implements ApplicationStartupCollector {
    public static final OooO00o Companion = new OooO00o(null);
    private static final String FIELD_MCC = "mcc";
    private static final String FIELD_MNC = "mnc";
    private static final String FIELD_SCREENLAYOUT = "screenLayout";
    private static final String FIELD_UIMODE = "uiMode";
    private static final String SUFFIX_MASK = "_MASK";
    private JSONObject initialConfiguration;

    public static final class OooO00o {
        public OooO00o(u uVar) {
        }
    }

    public final /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.INITIAL_CONFIGURATION.ordinal()] = 1;
            iArr[ReportField.CRASH_CONFIGURATION.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final class OooO0OO extends l implements o0OoOoOo<Prefix, SparseArray<String>> {
        public static final OooO0OO a = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        public final Object e(Object obj) {
            return new SparseArray();
        }
    }

    public enum Prefix {
        UI_MODE("UI_MODE_"),
        TOUCHSCREEN("TOUCHSCREEN_"),
        SCREENLAYOUT("SCREENLAYOUT_"),
        ORIENTATION("ORIENTATION_"),
        NAVIGATIONHIDDEN("NAVIGATIONHIDDEN_"),
        NAVIGATION("NAVIGATION_"),
        KEYBOARDHIDDEN("KEYBOARDHIDDEN_"),
        KEYBOARD("KEYBOARD_"),
        HARDKEYBOARDHIDDEN("HARDKEYBOARDHIDDEN_");

        private final String text;

        Prefix(String str) {
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }

    public ConfigurationCollector() {
        super(ReportField.INITIAL_CONFIGURATION, ReportField.CRASH_CONFIGURATION);
    }

    private String activeFlags(SparseArray<String> sparseArray, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            String str = sparseArray.get(iKeyAt);
            r.m(str, "valueNames[maskValue]");
            if (ae.ar(str, SUFFIX_MASK, false, 2) && (i2 = iKeyAt & i) > 0) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(sparseArray.get(i2));
            }
        }
        String string = sb.toString();
        r.m(string, "result.toString()");
        return string;
    }

    private JSONObject collectConfiguration(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            r.m(configuration, "context.resources.configuration");
            return configToJson(configuration);
        } catch (RuntimeException e) {
            j jVar = P.c;
            j jVar2 = P.c;
            ((i) jVar).y("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Couldn't retrieve CrashConfiguration for : ", context.getPackageName()), e);
            return null;
        }
    }

    private JSONObject configToJson(Configuration configuration) {
        JSONObject jSONObject = new JSONObject();
        Map<Prefix, SparseArray<String>> valueArrays = getValueArrays();
        Field[] fields = configuration.getClass().getFields();
        r.m(fields, "conf.javaClass.fields");
        for (Field field : fields) {
            try {
                if (!Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    try {
                        if (r.f(field.getType(), Integer.TYPE)) {
                            jSONObject.put(name, getFieldValueName(valueArrays, configuration, field));
                        } else if (field.get(configuration) != null) {
                            jSONObject.put(name, field.get(configuration));
                        }
                    } catch (JSONException e) {
                        j jVar = P.c;
                        j jVar2 = P.c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not collect configuration field ");
                        sb.append(name);
                        ((i) jVar).y("OooOOO", sb.toString(), e);
                    }
                }
            } catch (IllegalAccessException e2) {
                j jVar3 = P.c;
                j jVar4 = P.c;
                ((i) jVar3).w("OooOOO", "Error while inspecting device configuration: ", e2);
            } catch (IllegalArgumentException e3) {
                j jVar5 = P.c;
                j jVar6 = P.c;
                ((i) jVar5).w("OooOOO", "Error while inspecting device configuration: ", e3);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0.equals(org.acra.collector.ConfigurationCollector.FIELD_MCC) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return java.lang.Integer.valueOf(r11.getInt(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0.equals(org.acra.collector.ConfigurationCollector.FIELD_MNC) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object getFieldValueName(java.util.Map<org.acra.collector.ConfigurationCollector.Prefix, ? extends android.util.SparseArray<java.lang.String>> r9, android.content.res.Configuration r10, java.lang.reflect.Field r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.collector.ConfigurationCollector.getFieldValueName(java.util.Map, android.content.res.Configuration, java.lang.reflect.Field):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<Prefix, SparseArray<String>> getValueArrays() {
        aE aEVar;
        Field[] fields = Configuration.class.getFields();
        r.m(fields, "Configuration::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (true) {
            Prefix prefix = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Field field2 = (Field) next;
            for (Prefix prefix2 : Prefix.values()) {
                String name = field2.getName();
                r.m(name, "field.name");
                if (ae.aq(name, prefix2.getText(), false, 2)) {
                    prefix = prefix2;
                    break;
                }
            }
            Object arrayList2 = linkedHashMap.get(prefix);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(prefix, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Prefix) entry.getKey()) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList<aE> arrayList3 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Prefix prefix3 = (Prefix) entry2.getKey();
            List<Field> list = (List) entry2.getValue();
            r.l(prefix3);
            SparseArray sparseArray = new SparseArray();
            for (Field field3 : list) {
                try {
                    aEVar = new aE(Integer.valueOf(field3.getInt(null)), field3.getName());
                } catch (IllegalAccessException e) {
                    j jVar = P.c;
                    j jVar2 = P.c;
                    ((i) jVar).y("OooOOO", "Error while inspecting device configuration: ", e);
                    aEVar = null;
                } catch (IllegalArgumentException e2) {
                    j jVar3 = P.c;
                    j jVar4 = P.c;
                    ((i) jVar3).y("OooOOO", "Error while inspecting device configuration: ", e2);
                    aEVar = null;
                }
                if (aEVar != null) {
                    sparseArray.put(((Number) aEVar.c).intValue(), aEVar.d);
                }
            }
            arrayList3.add(new aE(prefix3, sparseArray));
        }
        EnumMap enumMap = new EnumMap(Prefix.class);
        for (aE aEVar2 : arrayList3) {
            enumMap.put(aEVar2.c, aEVar2.d);
        }
        return ivas.gov.bisp.enumeration.p100w.r.ah(enumMap, OooO0OO.a);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        int i = OooO0O0.a[reportField.ordinal()];
        if (i == 1) {
            jVar.i(ReportField.INITIAL_CONFIGURATION, this.initialConfiguration);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            jVar.i(ReportField.CRASH_CONFIGURATION, collectConfiguration(context));
        }
    }

    @Override // org.acra.collector.ApplicationStartupCollector
    public void collectApplicationStartUp(Context context, ivas.gov.bisp.enumeration.aB.r rVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        if (rVar.i.contains(ReportField.INITIAL_CONFIGURATION)) {
            this.initialConfiguration = collectConfiguration(context);
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }
}
