package ivas.gov.bisp.enumeration.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.F.L;
import ivas.gov.bisp.enumeration.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FormatSelectorDialogFragment extends L {
    private static int a = 1;
    private static int b;
    private FormatSelectorDialogListener mListener;
    private ArrayList<Integer> mSelectedIndices;

    public interface FormatSelectorDialogListener {
        void onFormatsSaved(ArrayList<Integer> arrayList);
    }

    public static /* synthetic */ FormatSelectorDialogListener access$000(FormatSelectorDialogFragment formatSelectorDialogFragment) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 81;
        a = i3 % 128;
        int i4 = i3 % 2;
        FormatSelectorDialogListener formatSelectorDialogListener = formatSelectorDialogFragment.mListener;
        int i5 = i2 + 67;
        a = i5 % 128;
        int i6 = i5 % 2;
        return formatSelectorDialogListener;
    }

    public static /* synthetic */ ArrayList access$100(FormatSelectorDialogFragment formatSelectorDialogFragment) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 64) + (i2 | 64)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<Integer> arrayList = formatSelectorDialogFragment.mSelectedIndices;
        int i5 = i2 & 107;
        int i6 = i5 + ((i2 ^ 107) | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public static FormatSelectorDialogFragment newInstance(FormatSelectorDialogListener formatSelectorDialogListener, ArrayList<Integer> arrayList) {
        int i = 2 % 2;
        FormatSelectorDialogFragment formatSelectorDialogFragment = new FormatSelectorDialogFragment();
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            int i2 = b;
            int i3 = i2 & 45;
            int i4 = i3 + ((i2 ^ 45) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
        }
        formatSelectorDialogFragment.mSelectedIndices = new ArrayList<>(arrayList);
        int i6 = b;
        int i7 = (i6 | 37) << 1;
        int i8 = -((i6 & (-38)) | ((~i6) & 37));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        formatSelectorDialogFragment.mListener = formatSelectorDialogListener;
        if (i10 == 0) {
            int i11 = 19 / 0;
        }
        int i12 = (i6 & 126) + (i6 | 126);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 48 / 0;
        }
        return formatSelectorDialogFragment;
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // ivas.gov.bisp.enumeration.F.L
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialogCreate;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = ((~i3) & (i2 | 51)) + (i3 << 1);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.mSelectedIndices != null) {
            int i5 = ((i2 & 20) + (i2 | 20)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (this.mListener != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                AlertDialog.Builder positiveButton = builder.setTitle(R.string.choose_formats).setMultiChoiceItems(new String[2], new boolean[2], new DialogInterface.OnMultiChoiceClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FormatSelectorDialogFragment.3
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public void onClick(DialogInterface dialogInterface, int i6, boolean z) {
                        int i7 = 2 % 2;
                        int i8 = b;
                        int i9 = (((i8 | 114) << 1) - (i8 ^ 114)) - 1;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (z) {
                            FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this).add(Integer.valueOf(i6));
                            int i10 = b;
                            int i11 = i10 + 57;
                            a = i11 % 128;
                            int i12 = i11 % 2;
                            int i13 = i10 | 1;
                            int i14 = (i13 << 1) - ((~(i10 & 1)) & i13);
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i15 = 87 / 0;
                                return;
                            }
                            return;
                        }
                        if (FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this).contains(Integer.valueOf(i6))) {
                            int i16 = a;
                            int i17 = i16 & 37;
                            int i18 = (i16 | 37) & (~i17);
                            int i19 = -(-(i17 << 1));
                            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                            b = i20 % 128;
                            int i21 = i20 % 2;
                            ArrayList arrayListAccess$100 = FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this);
                            ArrayList arrayListAccess$101 = FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this);
                            Integer numValueOf = Integer.valueOf(i6);
                            int i22 = b;
                            int i23 = i22 & 111;
                            int i24 = i23 + ((i22 ^ 111) | i23);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                            arrayListAccess$100.remove(arrayListAccess$101.indexOf(numValueOf));
                            int i26 = b;
                            int i27 = (i26 ^ 5) + ((i26 & 5) << 1);
                            a = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i28 = 4 % 5;
                            }
                        }
                        int i29 = a;
                        int i30 = ((i29 & (-114)) | ((~i29) & 113)) + ((i29 & 113) << 1);
                        b = i30 % 128;
                        if (i30 % 2 == 0) {
                            int i31 = 73 / 0;
                        }
                    }
                }).setPositiveButton(R.string.ok_button, new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FormatSelectorDialogFragment.2
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i6) {
                        int i7 = 2 % 2;
                        int i8 = b + 117;
                        a = i8 % 128;
                        int i9 = i8 % 2;
                        if (FormatSelectorDialogFragment.access$000(FormatSelectorDialogFragment.this) != null) {
                            int i10 = a;
                            int i11 = ((i10 | 65) << 1) - (i10 ^ 65);
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                FormatSelectorDialogFragment.access$000(FormatSelectorDialogFragment.this);
                                FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            FormatSelectorDialogFragment.access$000(FormatSelectorDialogFragment.this).onFormatsSaved(FormatSelectorDialogFragment.access$100(FormatSelectorDialogFragment.this));
                            int i12 = b;
                            int i13 = ((i12 & 114) + (i12 | 114)) - 1;
                            a = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        int i15 = a;
                        int i16 = i15 & 115;
                        int i17 = (i15 | 115) & (~i16);
                        int i18 = -(-(i16 << 1));
                        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                    }
                });
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.FormatSelectorDialogFragment.1
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i6) {
                        int i7 = 2 % 2;
                        int i8 = a;
                        int i9 = i8 & 33;
                        int i10 = (i8 ^ 33) | i9;
                        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 84 / 0;
                        }
                    }
                };
                int i6 = b;
                int i7 = i6 ^ 95;
                int i8 = (((i6 & 95) | i7) << 1) - i7;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    positiveButton.setNegativeButton(R.string.cancel_button, onClickListener);
                    alertDialogCreate = builder.create();
                    int i9 = 58 / 0;
                } else {
                    positiveButton.setNegativeButton(R.string.cancel_button, onClickListener);
                    alertDialogCreate = builder.create();
                }
                int i10 = b;
                int i11 = (i10 ^ 33) + ((i10 & 33) << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                return alertDialogCreate;
            }
        }
        dismiss();
        int i13 = a;
        int i14 = i13 & 53;
        int i15 = i13 | 53;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }
}
