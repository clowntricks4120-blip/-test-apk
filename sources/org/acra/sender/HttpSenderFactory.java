package org.acra.sender;

import android.content.Context;
import ivas.gov.bisp.enumeration.aB.i;
import ivas.gov.bisp.enumeration.p061cg.r;
import org.acra.plugins.HasConfigPlugin;

/* JADX INFO: loaded from: classes.dex */
public class HttpSenderFactory extends HasConfigPlugin implements ReportSenderFactory {
    public HttpSenderFactory() {
        super(i.class);
    }

    @Override // org.acra.sender.ReportSenderFactory
    public r create(Context context, ivas.gov.bisp.enumeration.aB.r rVar) {
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        return new HttpSender(rVar, null, null, null, 8);
    }
}
