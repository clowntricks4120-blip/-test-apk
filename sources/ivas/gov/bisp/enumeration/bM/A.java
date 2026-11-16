package ivas.gov.bisp.enumeration.bM;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InputFilter {
    private static int a = 0;
    private static int b = 1;
    public final TextView c;
    public b.aKp d;

    public A(TextView textView) {
        this.c = textView;
    }

    public static class bxQ extends b.aKp {
        private static int a = 1;
        private static int b;
        public final Reference<TextView> c;
        public final Reference<A> d;

        public bxQ(TextView textView, A a2) {
            this.c = new WeakReference(textView);
            this.d = new WeakReference(a2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
        
            if (r3 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        
            if (r1 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        
            r1 = r6 | 21;
            r3 = r1 << 1;
            r1 = -(r1 & (~(r6 & 21)));
            r5 = (r3 & r1) + (r1 | r3);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r5 % 128;
            r5 = r5 % 2;
            r1 = r6 & 33;
            r3 = (~r1) & (r6 | 33);
            r1 = -(-(r1 << 1));
            r4 = ((r3 | r1) << 1) - (r1 ^ r3);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        
            r5 = r1.getFilters();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
        
            if (r5 != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.b;
            r3 = r1 & 69;
            r1 = -(-((r1 ^ 69) | r3));
            r4 = (r3 & r1) + (r1 | r3);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
        
            r6 = ivas.gov.bisp.enumeration.bM.A.bxQ.b;
            r7 = (r6 & 121) + (r6 | 121);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r7 % 128;
            r7 = r7 % 2;
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
        
            if (r6 >= r5.length) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
        
            r7 = ivas.gov.bisp.enumeration.bM.A.bxQ.b;
            r9 = r7 & 3;
            r8 = ((r7 ^ 3) | r9) << 1;
            r7 = -((r7 | 3) & (~r9));
            r9 = ((r8 | r7) << 1) - (r7 ^ r8);
            r7 = r9 % 128;
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r7;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
        
            if (r5[r6] != r3) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
        
            r3 = r7 & 45;
            r3 = r3 + ((r7 ^ 45) | r3);
            r5 = r3 % 128;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r5;
            r3 = r3 % 2;
            r3 = r5 & 11;
            r5 = r5 | 11;
            r6 = (r3 & r5) + (r3 | r5);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
        
            r8 = r6 & 1;
            r6 = (r6 ^ 1) | r8;
            r6 = ((r6 & r8) << 1) + (r8 ^ r6);
            r8 = r7 & 69;
            r8 = r8 + ((r7 ^ 69) | r8);
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
        
            if (r5 != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f7, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a + 41;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0100, code lost:
        
            if ((r1 % 2) == 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
        
            r0 = 87 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0105, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
        
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
        
            if (r1.isAttachedToWindow() == false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x010d, code lost:
        
            r3 = ivas.gov.bisp.enumeration.bM.A.bxQ.b;
            r6 = ((r3 ^ 58) + ((r3 & 58) << 1)) - 1;
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r6 % 128;
            r6 = r6 % 2;
            r3 = androidx.emoji2.text.b.c().k(r1.getText());
            r6 = android.text.Selection.getSelectionStart(r3);
            r7 = ivas.gov.bisp.enumeration.bM.A.bxQ.a;
            r8 = (r7 & 11) + (r7 | 11);
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r8 % 128;
            r8 = r8 % 2;
            r7 = android.text.Selection.getSelectionEnd(r3);
            r1.setText(r3);
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a;
            r8 = ((r1 ^ 52) + ((r1 & 52) << 1)) - 1;
            r1 = r8 % 128;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
        
            if ((r8 % 2) == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x014e, code lost:
        
            r9 = 22 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0153, code lost:
        
            if ((r3 instanceof android.text.Spannable) == false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0158, code lost:
        
            if ((r3 instanceof android.text.Spannable) == false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x015a, code lost:
        
            r3 = (android.text.Spannable) r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
        
            if (r6 < 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x015e, code lost:
        
            r2 = (r1 & 67) + (r1 | 67);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
        
            if ((r2 % 2) == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
        
            if (r7 < 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x016c, code lost:
        
            android.text.Selection.setSelection(r3, r6, r7);
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a;
            r2 = r1 & 37;
            r1 = r1 | 37;
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0180, code lost:
        
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0183, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
        
            if (r6 < 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a + 115;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r1 % 128;
            r1 = r1 % 2;
            android.text.Selection.setSelection(r3, r6);
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a;
            r2 = (((r1 | 42) << 1) - (r1 ^ 42)) - 1;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01a1, code lost:
        
            if ((r2 % 2) != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01a3, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a4, code lost:
        
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01a7, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01a8, code lost:
        
            if (r7 < 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01aa, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a + 97;
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r1 % 128;
            r1 = r1 % 2;
            android.text.Selection.setSelection(r3, r7);
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.b;
            r2 = (r1 | 101) << 1;
            r1 = -(r1 ^ 101);
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.bM.A.bxQ.a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01c8, code lost:
        
            r1 = ivas.gov.bisp.enumeration.bM.A.bxQ.a;
            r2 = (r1 & 15) + (r1 | 15);
            ivas.gov.bisp.enumeration.bM.A.bxQ.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:
        
            if ((r2 % 2) != 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01d6, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01d7, code lost:
        
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        
            if (r3 != null) goto L12;
         */
        @Override // androidx.emoji2.text.b.aKp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b() {
            /*
                Method dump skipped, instruction units count: 475
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.A.bxQ.b():void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r2 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r3 = androidx.emoji2.text.b.c().f();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r3 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r7 = ivas.gov.bisp.enumeration.bM.A.b;
        r8 = r7 + 117;
        ivas.gov.bisp.enumeration.bM.A.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r3 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r8 = r7 & 119;
        r9 = -(-((r7 ^ 119) | r8));
        r10 = (r8 & r9) + (r8 | r9);
        ivas.gov.bisp.enumeration.bM.A.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if ((r10 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3 == 5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r3 == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r3 = ((r7 | 115) << 1) - (r7 ^ 115);
        ivas.gov.bisp.enumeration.bM.A.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if ((r3 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r2 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r17 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        r3 = r7 & 9;
        r5 = (r7 ^ 9) | r3;
        r7 = ((r3 | r5) << 1) - (r3 ^ r5);
        r3 = r7 % 128;
        ivas.gov.bisp.enumeration.bM.A.a = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if ((r7 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r16 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r16 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        r5 = (r3 & 121) + (r3 | 121);
        ivas.gov.bisp.enumeration.bM.A.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r15.length() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r3 = ivas.gov.bisp.enumeration.bM.A.a;
        r5 = r3 ^ 47;
        r3 = ((r3 & 47) | r5) << 1;
        r5 = -r5;
        r7 = (r3 ^ r5) + ((r3 & r5) << 1);
        ivas.gov.bisp.enumeration.bM.A.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if ((r7 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (r1 != r11.c.getText()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r1 != r11.c.getText()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r3 = ivas.gov.bisp.enumeration.bM.A.b;
        r5 = (r3 ^ 15) + ((r3 & 15) << 1);
        r3 = r5 % 128;
        ivas.gov.bisp.enumeration.bM.A.a = r3;
        r5 = r5 % 2;
        r7 = r3 & 53;
        r4 = ((r3 ^ 53) | r7) << 1;
        r3 = -((r3 | 53) & (~r7));
        r5 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.bM.A.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        r3 = ivas.gov.bisp.enumeration.bM.A.a;
        r5 = r3 + 75;
        ivas.gov.bisp.enumeration.bM.A.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        if (r1 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        r5 = (-2) - ((r3 + 8) ^ (-1));
        ivas.gov.bisp.enumeration.bM.A.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r13 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        r7 = r3 & 101;
        r5 = (((r3 ^ 101) | r7) << 1) - ((r3 | 101) & (~r7));
        ivas.gov.bisp.enumeration.bM.A.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        if (r14 == r12.length()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
    
        r1 = r12.subSequence(r13, r14);
        r3 = ivas.gov.bisp.enumeration.bM.A.b;
        r5 = r3 | 79;
        r7 = r5 << 1;
        r3 = -((~(r3 & 79)) & r5);
        r5 = (r7 ^ r3) + ((r3 & r7) << 1);
        ivas.gov.bisp.enumeration.bM.A.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r3 = androidx.emoji2.text.b.c();
        r5 = r1.length();
        r7 = ivas.gov.bisp.enumeration.bM.A.b;
        r8 = (((r7 & (-42)) | ((~r7) & 41)) - (~(-(-((r7 & 41) << 1))))) - 1;
        ivas.gov.bisp.enumeration.bM.A.a = r8 % 128;
        r8 = r8 % 2;
        r1 = r3.e(r1, 0, r5, Integer.MAX_VALUE, 0);
        r3 = ivas.gov.bisp.enumeration.bM.A.a;
        r5 = (r3 & 87) + (r3 | 87);
        r3 = r5 % 128;
        ivas.gov.bisp.enumeration.bM.A.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0172, code lost:
    
        if ((r5 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0174, code lost:
    
        r4 = (r3 | 93) << 1;
        r3 = -(r3 ^ 93);
        r5 = (r4 & r3) + (r3 | r4);
        ivas.gov.bisp.enumeration.bM.A.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0188, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0189, code lost:
    
        r3 = ivas.gov.bisp.enumeration.bM.A.b + 115;
        ivas.gov.bisp.enumeration.bM.A.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0192, code lost:
    
        if ((r3 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((!r11.c.isInEditMode()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0196, code lost:
    
        r3 = androidx.emoji2.text.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019c, code lost:
    
        if (r11.d != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        r11.d = new ivas.gov.bisp.enumeration.bM.A.bxQ(r11.c, r11);
        r7 = ivas.gov.bisp.enumeration.bM.A.b;
        r8 = r7 & 5;
        r5 = (((5 | r7) & (~r8)) - (~(r8 << 1))) - 1;
        ivas.gov.bisp.enumeration.bM.A.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        r3.l(r11.d);
        r3 = ivas.gov.bisp.enumeration.bM.A.b;
        r5 = r3 & 19;
        r3 = -(-(r3 | 19));
        r4 = ((r5 | r3) << 1) - (r3 ^ r5);
        ivas.gov.bisp.enumeration.bM.A.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        if ((r4 % 2) != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r11.c.isInEditMode() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r3 = ivas.gov.bisp.enumeration.bM.A.b;
        r5 = (r3 ^ 31) + ((r3 & 31) << 1);
        ivas.gov.bisp.enumeration.bM.A.a = r5 % 128;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r12, int r13, int r14, android.text.Spanned r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bM.A.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
