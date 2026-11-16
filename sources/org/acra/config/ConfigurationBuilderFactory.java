package org.acra.config;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.c;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.p057cc.j;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigurationBuilderFactory extends j {
    c create(Context context);

    @Override // ivas.gov.bisp.enumeration.p057cc.j
    /* bridge */ /* synthetic */ boolean enabled(r rVar);
}
