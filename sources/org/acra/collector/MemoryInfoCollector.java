package org.acra.collector;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.bD.T;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bY.b;
import ivas.gov.bisp.enumeration.p006af.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.acra.ReportField;

/* JADX INFO: loaded from: classes.dex */
public class MemoryInfoCollector extends BaseReportFieldCollector {

    public final /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            iArr[ReportField.DUMPSYS_MEMINFO.ordinal()] = 1;
            iArr[ReportField.TOTAL_MEM_SIZE.ordinal()] = 2;
            iArr[ReportField.AVAILABLE_MEM_SIZE.ordinal()] = 3;
            a = iArr;
        }
    }

    public MemoryInfoCollector() {
        super(ReportField.DUMPSYS_MEMINFO, ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE);
    }

    private String collectMemInfo() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("dumpsys");
            arrayList.add("meminfo");
            arrayList.add(String.valueOf(Process.myPid()));
            Runtime runtime = Runtime.getRuntime();
            Object[] array = arrayList.toArray(new String[0]);
            r.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            InputStream inputStream = runtime.exec((String[]) array).getInputStream();
            r.m(inputStream, "process.inputStream");
            return new j(inputStream, 0, 0, null, 14).d();
        } catch (IOException e) {
            ivas.gov.bisp.enumeration.aO.j jVar = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            ((i) jVar).w("OooOOO", "MemoryInfoCollector.meminfo could not retrieve data", e);
            return null;
        }
    }

    private long getAvailableInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private long getTotalInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(ReportField reportField, Context context, ivas.gov.bisp.enumeration.aB.r rVar, b bVar, ivas.gov.bisp.enumeration.p059ce.j jVar) {
        r.n(reportField, "reportField");
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(bVar, "reportBuilder");
        r.n(jVar, "target");
        int i = OooO00o.a[reportField.ordinal()];
        if (i == 1) {
            jVar.g(ReportField.DUMPSYS_MEMINFO, collectMemInfo());
        } else if (i == 2) {
            jVar.h(ReportField.TOTAL_MEM_SIZE, getTotalInternalMemorySize());
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            jVar.h(ReportField.AVAILABLE_MEM_SIZE, getAvailableInternalMemorySize());
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector, ivas.gov.bisp.enumeration.p057cc.j
    public /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        T.b(rVar);
        return true;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(Context context, ivas.gov.bisp.enumeration.aB.r rVar, ReportField reportField, b bVar) {
        r.n(context, "context");
        r.n(rVar, "config");
        r.n(reportField, "collect");
        r.n(bVar, "reportBuilder");
        throw null;
    }
}
