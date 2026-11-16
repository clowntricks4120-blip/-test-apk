package ivas.gov.bisp.enumeration.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import ivas.gov.bisp.enumeration.F.L;
import net.sqlcipher.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes.dex */
public class MessageDialogFragment extends L {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int c$s65$67 = 937766486;
    private static int d = 1;
    private static boolean e$s68$67 = true;
    private MessageDialogListener mListener;
    private String mMessage;
    private String mTitle;
    private static char[] b$s64$67 = {12005, 11929};
    private static boolean a$s67$67 = true;

    public interface MessageDialogListener {
        void onDialogPositiveClick(L l);
    }

    public static /* synthetic */ MessageDialogListener access$000(MessageDialogFragment messageDialogFragment) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 75;
        c = i3 % 128;
        int i4 = i3 % 2;
        MessageDialogListener messageDialogListener = messageDialogFragment.mListener;
        int i5 = i2 + 111;
        c = i5 % 128;
        int i6 = i5 % 2;
        return messageDialogListener;
    }

    public static MessageDialogFragment newInstance(String str, String str2, MessageDialogListener messageDialogListener) {
        int i = 2 % 2;
        MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
        messageDialogFragment.mTitle = str;
        messageDialogFragment.mMessage = str2;
        messageDialogFragment.mListener = messageDialogListener;
        int i2 = c + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        return messageDialogFragment;
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = c + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setRetainInstance(true);
        int i4 = c + 75;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.L
    public Dialog onCreateDialog(Bundle bundle) {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(this.mMessage).setTitle(this.mTitle);
        Object[] objArr = new Object[1];
        a(126 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), null, new byte[]{-126, -127}, null, objArr);
        builder.setPositiveButton(((String) objArr[0]).intern(), new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.MessageDialogFragment.1
            private static int a = 1;
            private static int b;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 2 % 2;
                int i4 = a + 12;
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    MessageDialogFragment.access$000(MessageDialogFragment.this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (MessageDialogFragment.access$000(MessageDialogFragment.this) != null) {
                    int i6 = a + 81;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    MessageDialogFragment.access$000(MessageDialogFragment.this).onDialogPositiveClick(MessageDialogFragment.this);
                    int i8 = b + 9;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                }
                int i10 = a;
                int i11 = i10 ^ 13;
                int i12 = (((i10 & 13) | i11) << 1) - i11;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        int i2 = c + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        return alertDialogCreate;
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$67;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $10 + 91;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr3[i6] = (char) (((long) cArr2[i6]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i9 = (int) (1962356595541487140L ^ ((long) c$s65$67));
        if (!(!e$s68$67)) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[lVar.a] = (char) (cArr2[bArr[lVar.d / lVar.a] >> i] << i9);
                    i4 = lVar.a;
                } else {
                    cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i9);
                    i4 = lVar.a + 1;
                }
                lVar.a = i4;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (a$s67$67) {
            lVar.d = cArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                int i11 = $10 + 103;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[lVar.a] = (char) (cArr2[cArr[lVar.d - lVar.a] / i] * i9);
                    i3 = lVar.a / 0;
                } else {
                    cArr5[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i9);
                    i3 = lVar.a + 1;
                }
                lVar.a = i3;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = iArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            int i12 = $10 + 81;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = lVar.a;
                int i14 = lVar.d;
                cArr6[i13] = (char) (cArr2[iArr[0 % lVar.a] * i] >> i9);
                i2 = lVar.a % 1;
            } else {
                cArr6[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i9);
                i2 = lVar.a + 1;
            }
            lVar.a = i2;
        }
        objArr[0] = new String(cArr6);
    }
}
