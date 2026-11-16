package ivas.gov.bisp.enumeration.bM;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class s implements TransformationMethod {
    private static int a = 1;
    private static int b;
    public final TransformationMethod c;

    public s(TransformationMethod transformationMethod) {
        this.c = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 8) + ((i3 & 8) << 1)) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        TransformationMethod transformationMethod = this.c;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
            int i5 = b;
            int i6 = (((i5 | 121) << 1) - (~(-(i5 ^ 121)))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            }
        }
        int i8 = b;
        int i9 = ((i8 | 123) << 1) - (i8 ^ 123);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r1 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r2 = ivas.gov.bisp.enumeration.bM.s.b;
        r4 = r2 & 37;
        r2 = (r2 | 37) & (~r4);
        r4 = r4 << 1;
        r5 = ((r2 | r4) << 1) - (r2 ^ r4);
        ivas.gov.bisp.enumeration.bM.s.a = r5 % 128;
        r5 = r5 % 2;
        r7 = r1.getTransformation(r7, r8);
        r8 = ivas.gov.bisp.enumeration.bM.s.b;
        r1 = r8 & 119;
        r8 = (r8 | 119) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = ((r8 | r1) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.bM.s.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bM.s.b + 13;
        ivas.gov.bisp.enumeration.bM.s.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (androidx.emoji2.text.b.c().f() == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bM.s.b;
        r1 = r8 & 119;
        r8 = (r8 | 119) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r8 ^ r1) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.bM.s.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if ((r2 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r8 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        r7 = androidx.emoji2.text.b.c().k(r7);
        r8 = ivas.gov.bisp.enumeration.bM.s.a;
        r1 = r8 & 31;
        r1 = r1 + ((r8 ^ 31) | r1);
        ivas.gov.bisp.enumeration.bM.s.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bM.s.b;
        r1 = r8 ^ 41;
        r8 = ((r8 & 41) | r1) << 1;
        r1 = -r1;
        r2 = ((r8 | r1) << 1) - (r8 ^ r1);
        ivas.gov.bisp.enumeration.bM.s.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r8 = ivas.gov.bisp.enumeration.bM.s.a;
        r1 = r8 & 59;
        r8 = (r8 | 59) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r8 ^ r1) + ((r8 & r1) << 1);
        ivas.gov.bisp.enumeration.bM.s.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    @Override // android.text.method.TransformationMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence getTransformation(java.lang.CharSequence r7, android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.s.getTransformation(java.lang.CharSequence, android.view.View):java.lang.CharSequence");
    }
}
