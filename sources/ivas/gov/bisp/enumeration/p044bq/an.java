package ivas.gov.bisp.enumeration.p044bq;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.aE;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: loaded from: classes.dex */
public class an implements aE {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ f d;

    public an(f fVar, int i) {
        this.d = fVar;
        this.c = i;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = (i2 & 21) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            ax.b(this.d.i);
            int i6 = 92 / 0;
        } else {
            ax.b(this.d.i);
        }
        int i7 = a;
        int i8 = i7 & 7;
        int i9 = i8 + ((i7 ^ 7) | i8);
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            View view = this.d.f75o;
            obj.hashCode();
            throw null;
        }
        View view2 = this.d.f75o;
        if (view2 != null) {
            view2.setEnabled(true);
            AppCompatActivity appCompatActivity = this.d.j;
            String errorMessage = responseMessage.getErrorMessage();
            int i10 = b;
            int i11 = i10 & 45;
            int i12 = ((((i10 ^ 45) | i11) << 1) - (~(-((i10 | 45) & (~i11))))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            af.b(appCompatActivity, errorMessage, responseMessage.isLogout());
            if (i13 != 0) {
                int i14 = 77 / 0;
            }
            int i15 = b;
            int i16 = (i15 & 57) + (i15 | 57);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a;
        int i19 = (i18 & 55) + (i18 | 55);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r15.getString("message").equals("Record Submitted") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p044bq.an.b + 59;
        ivas.gov.bisp.enumeration.p044bq.an.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if ((r15 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        ivas.gov.bisp.enumeration.p024ax.ax.b(r14.d.i);
        r15 = r14.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r15.f75o == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p044bq.an.a;
        r4 = r3 ^ 45;
        r3 = (r3 & 45) << 1;
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p044bq.an.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p024ax.ax.g(r15.j, "Alert", "Record Uploaded Successfully");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p044bq.an.a;
        r4 = r3 & 87;
        r3 = -(-((r3 ^ 87) | r4));
        r6 = ((r4 | r3) << 1) - (r3 ^ r4);
        r3 = r6 % 128;
        ivas.gov.bisp.enumeration.p044bq.an.b = r3;
        r6 = r6 % 2;
        r4 = r3 & 43;
        r3 = (r3 ^ 43) | r4;
        r6 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.p044bq.an.a = r6 % 128;
        r6 = r6 % 2;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r3 = r14.d;
        r15 = new ivas.gov.bisp.enumeration.p044bq.ar(r3.j, r3.f75o, r3.d, r14.c, r3.c, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p044bq.an.a;
        r6 = r3 & 125;
        r4 = ((r3 ^ 125) | r6) << 1;
        r3 = -((r3 | 125) & (~r6));
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p044bq.an.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        r15.execute(new java.lang.Void[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p044bq.an.b;
        r1 = (r15 ^ 91) + ((r15 & 91) << 1);
        ivas.gov.bisp.enumeration.p044bq.an.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        ivas.gov.bisp.enumeration.p024ax.ax.b(r14.d.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r15 = ivas.gov.bisp.enumeration.p044bq.an.b;
        r1 = ((r15 | 29) << 1) - (r15 ^ 29);
        ivas.gov.bisp.enumeration.p044bq.an.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((!r15.getString("message").equals("Record Submitted")) != true) goto L14;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p044bq.an.onSuccess(org.json.JSONObject):void");
    }
}
