package ivas.gov.bisp.enumeration.p088k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.h;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static int a = 0;
    private static int b = 1;

    public static boolean c(DragEvent dragEvent, View view, Activity activity) {
        h.aWm awo;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 17) + (i2 | 17);
        a = i3 % 128;
        int i4 = i3 % 2;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            awo = new h.aWn(clipData, 3);
            int i5 = a;
            int i6 = (((i5 | 78) << 1) - (i5 ^ 78)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            awo = new h.aWo(clipData, 3);
            int i8 = a;
            int i9 = i8 | 29;
            int i10 = ((i9 << 1) - (~(-((~(i8 & 29)) & i9)))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        T.m(view, awo.b());
        int i12 = (-2) - ((b + 84) ^ (-1));
        a = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0097 A[Catch: all -> 0x00d0, PHI: r5
  0x0097: PHI (r5v3 android.content.ClipData) = (r5v2 android.content.ClipData), (r5v21 android.content.ClipData) binds: [B:14:0x0083, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:7:0x0052, B:10:0x0070, B:15:0x0085, B:21:0x00b1, B:17:0x0097, B:13:0x007b), top: B:27:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    public static boolean b(DragEvent dragEvent, TextView textView, Activity activity) {
        int offsetForPosition;
        ClipData clipData;
        h.aWm awo;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-110)) | ((~i3) & 109);
        int i5 = -(-((i3 & 109) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            activity.requestDragAndDropPermissions(dragEvent);
            offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            int i7 = 42 / 0;
        } else {
            activity.requestDragAndDropPermissions(dragEvent);
            offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        }
        int i8 = a;
        int i9 = i8 & 13;
        int i10 = ((i8 | 13) & (~i9)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            int i12 = b;
            int i13 = i12 & 59;
            int i14 = (((i12 ^ 59) | i13) << 1) - ((i12 | 59) & (~i13));
            a = i14 % 128;
            if (i14 % 2 != 0) {
                clipData = dragEvent.getClipData();
                if (Build.VERSION.SDK_INT >= 118) {
                    awo = new h.aWn(clipData, 3);
                    int i15 = b;
                    int i16 = (i15 & 113) + (i15 | 113);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    awo = new h.aWo(clipData, 3);
                    int i18 = a;
                    int i19 = i18 & 59;
                    int i20 = (i18 ^ 59) | i19;
                    i = ((i19 | i20) << 1) - (i20 ^ i19);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i21 = 5 % 3;
                    }
                }
            } else {
                clipData = dragEvent.getClipData();
                if (Build.VERSION.SDK_INT >= 31) {
                    awo = new h.aWn(clipData, 3);
                    int i110 = b;
                    int i111 = (i110 & 113) + (i110 | 113);
                    a = i111 % 128;
                    int i112 = i111 % 2;
                } else {
                    awo = new h.aWo(clipData, 3);
                    int i113 = a;
                    int i114 = i113 & 59;
                    int i22 = (i113 ^ 59) | i114;
                    i = ((i114 | i22) << 1) - (i22 ^ i114);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i23 = 5 % 3;
                    }
                }
            }
            T.m(textView, awo.b());
            textView.endBatchEdit();
            int i24 = a;
            int i25 = i24 & 27;
            int i26 = (i24 | 27) & (~i25);
            int i27 = -(-(i25 << 1));
            int i28 = (i26 & i27) + (i26 | i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
