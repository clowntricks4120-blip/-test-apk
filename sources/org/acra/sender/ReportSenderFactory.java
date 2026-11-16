package org.acra.sender;

import android.content.Context;
import ivas.gov.bisp.enumeration.p057cc.j;
import ivas.gov.bisp.enumeration.p061cg.r;

/* JADX INFO: loaded from: classes.dex */
public interface ReportSenderFactory extends j {
    r create(Context context, ivas.gov.bisp.enumeration.aB.r rVar);

    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar);
}
