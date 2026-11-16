package org.acra.plugins;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p057cc.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class HasConfigPlugin implements j {
    private final Class<? extends ivas.gov.bisp.enumeration.aB.j> configClass;

    public HasConfigPlugin(Class<? extends ivas.gov.bisp.enumeration.aB.j> cls) {
        r.n(cls, "configClass");
        this.configClass = cls;
    }

    @Override // ivas.gov.bisp.enumeration.p057cc.j
    public boolean enabled(ivas.gov.bisp.enumeration.aB.r rVar) {
        r.n(rVar, "config");
        ivas.gov.bisp.enumeration.aB.j jVarK = ivas.gov.bisp.enumeration.p100w.r.K(rVar, this.configClass);
        if (jVarK != null) {
            return jVarK.a();
        }
        return false;
    }
}
