package org.acra.collector;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bV.ae;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p059ce.j;
import java.lang.reflect.Field;
import java.util.Collection;
import org.acra.ReportField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DisplayManagerCollector extends BaseReportFieldCollector {
    public DisplayManagerCollector() {
        super(ReportField.DISPLAY);
    }

    private String activeFlags(SparseArray<String> sparseArray, int i) {
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2) & i;
            if (iKeyAt > 0) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(sparseArray.get(iKeyAt));
            }
        }
        String string = sb.toString();
        r.m(string, "result.toString()");
        return string;
    }

    private void collectCurrentSizeRange(Display display, JSONObject jSONObject) throws JSONException {
        Point point = new Point();
        Point point2 = new Point();
        display.getCurrentSizeRange(point, point2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("smallest", new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Integer.valueOf(point.x), Integer.valueOf(point.y))));
        jSONObject2.put("largest", new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Integer.valueOf(point2.x), Integer.valueOf(point2.y))));
        jSONObject.put("currentSizeRange", jSONObject2);
    }

    private JSONObject collectDisplayData(Display display) throws JSONException {
        display.getMetrics(new DisplayMetrics());
        JSONObject jSONObject = new JSONObject();
        collectCurrentSizeRange(display, jSONObject);
        collectFlags(display, jSONObject);
        collectMetrics(display, jSONObject);
        collectRealMetrics(display, jSONObject);
        collectName(display, jSONObject);
        collectRealSize(display, jSONObject);
        collectRectSize(display, jSONObject);
        collectSize(display, jSONObject);
        collectRotation(display, jSONObject);
        collectIsValid(display, jSONObject);
        jSONObject.put("orientation", display.getRotation()).put("refreshRate", display.getRefreshRate()).put("height", display.getHeight()).put("width", display.getWidth()).put("pixelFormat", display.getPixelFormat());
        return jSONObject;
    }

    private void collectFlags(Display display, JSONObject jSONObject) throws JSONException {
        SparseArray<String> sparseArray = new SparseArray<>();
        int flags = display.getFlags();
        Field[] fields = display.getClass().getFields();
        r.m(fields, "display.javaClass.fields");
        for (Field field : fields) {
            String name = field.getName();
            r.m(name, "field.name");
            if (ae.aq(name, "FLAG_", false, 2)) {
                try {
                    sparseArray.put(field.getInt(null), field.getName());
                } catch (IllegalAccessException unused) {
                }
            }
        }
        jSONObject.put("flags", activeFlags(sparseArray, flags));
    }

    private void collectIsValid(Display display, JSONObject jSONObject) throws JSONException {
        jSONObject.put("isValid", display.isValid());
    }

    private void collectMetrics(Display display, JSONObject jSONObject) throws JSONException {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        JSONObject jSONObject2 = new JSONObject();
        collectMetrics(displayMetrics, jSONObject2);
        jSONObject.put("metrics", jSONObject2);
    }

    private void collectName(Display display, JSONObject jSONObject) throws JSONException {
        jSONObject.put("name", display.getName());
    }

    private void collectRealMetrics(Display display, JSONObject jSONObject) throws JSONException {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        JSONObject jSONObject2 = new JSONObject();
        collectMetrics(displayMetrics, jSONObject2);
        jSONObject.put("realMetrics", jSONObject2);
    }

    private void collectRealSize(Display display, JSONObject jSONObject) throws JSONException {
        Point point = new Point();
        display.getRealSize(point);
        jSONObject.put("realSize", new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Integer.valueOf(point.x), Integer.valueOf(point.y))));
    }

    private void collectRectSize(Display display, JSONObject jSONObject) throws JSONException {
        Rect rect = new Rect();
        display.getRectSize(rect);
        jSONObject.put("rectSize", new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()))));
    }

    private void collectRotation(Display display, JSONObject jSONObject) throws JSONException {
        jSONObject.put("rotation", rotationToString(display.getRotation()));
    }

    private void collectSize(Display display, JSONObject jSONObject) throws JSONException {
        Point point = new Point();
        display.getSize(point);
        jSONObject.put("size", new JSONArray((Collection) ivas.gov.bisp.enumeration.p100w.r.Q(Integer.valueOf(point.x), Integer.valueOf(point.y))));
    }

    private Display[] getDisplays(Context context) {
        Object systemService = context.getSystemService("display");
        r.e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display[] displays = ((DisplayManager) systemService).getDisplays();
        r.m(displays, "{\n            (context.g…nager).displays\n        }");
        return displays;
    }

    private String rotationToString(int i) {
        if (i == 0) {
            return "ROTATION_0";
        }
        if (i == 1) {
            return "ROTATION_90";
        }
        if (i != 2) {
            return i != 3 ? String.valueOf(i) : "ROTATION_270";
        }
        return "ROTATION_180";
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, j jVar) {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        JSONObject jSONObject = new JSONObject();
        for (Display display : getDisplays(context)) {
            try {
                jSONObject.put(String.valueOf(display.getDisplayId()), collectDisplayData(display));
            } catch (JSONException e) {
                ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                ivas.gov.bisp.enumeration.aO.j jVar3 = P.c;
                ((i) jVar2).y("OooOOO", ivas.gov.bisp.enumeration.p091n.j.o("Failed to collect data for display ", display.getDisplayId()), e);
            }
        }
        jVar.i(ReportField.DISPLAY, jSONObject);
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    private void collectMetrics(DisplayMetrics displayMetrics, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPut = jSONObject.put("density", displayMetrics.density).put("densityDpi", displayMetrics.densityDpi);
        float f = displayMetrics.scaledDensity;
        StringBuilder sb = new StringBuilder();
        sb.append("x");
        sb.append(f);
        jSONObjectPut.put("scaledDensity", sb.toString()).put("widthPixels", displayMetrics.widthPixels).put("heightPixels", displayMetrics.heightPixels).put("xdpi", displayMetrics.xdpi).put("ydpi", displayMetrics.ydpi);
    }
}
