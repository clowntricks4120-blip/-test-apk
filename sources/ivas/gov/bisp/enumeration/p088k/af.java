package ivas.gov.bisp.enumeration.p088k;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.b;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;
import ivas.gov.bisp.enumeration.H.h;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p007ag.e;
import ivas.gov.bisp.enumeration.p007ag.l;
import ivas.gov.bisp.enumeration.p009ai.N;
import ivas.gov.bisp.enumeration.p044bq.ag;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ af(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ((Toolbar) this.b).s();
            return;
        }
        if (i != 1) {
            ag agVar = (ag) this.b;
            int i2 = ag.e;
            Objects.requireNonNull(agVar);
            new AlertDialog.Builder(agVar.m).setTitle("Name Mismatch").setMessage(agVar.z).setCancelable(false).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
            return;
        }
        d.aKf akf = (d.aKf) this.b;
        synchronized (akf.e) {
            if (akf.i == null) {
                return;
            }
            try {
                N nE = akf.e();
                int i3 = nE.e;
                if (i3 == 2) {
                    synchronized (akf.e) {
                    }
                }
                if (i3 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("fetchFonts result is not OK. (");
                    sb.append(i3);
                    sb.append(")");
                    throw new RuntimeException(sb.toString());
                }
                try {
                    int i4 = h.c;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    d.aKe ake = akf.d;
                    Context context = akf.b;
                    Objects.requireNonNull(ake);
                    Typeface typefaceD = e.c.d(context, null, new N[]{nE}, 0);
                    ByteBuffer byteBufferE = l.e(akf.b, null, nE.a);
                    if (byteBufferE == null || typefaceD == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                        f fVar = new f(typefaceD, r.z(byteBufferE));
                        Trace.endSection();
                        Trace.endSection();
                        synchronized (akf.e) {
                            b.aKk akk = akf.i;
                            if (akk != null) {
                                akk.c(fVar);
                            }
                        }
                        akf.c();
                    } catch (Throwable th) {
                        int i5 = h.c;
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    int i6 = h.c;
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                synchronized (akf.e) {
                    b.aKk akk2 = akf.i;
                    if (akk2 != null) {
                        akk2.b(th3);
                    }
                    akf.c();
                }
            }
        }
    }
}
