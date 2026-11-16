package ivas.gov.bisp.enumeration.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.hardware.Camera;
import android.os.Bundle;
import ivas.gov.bisp.enumeration.F.L;
import ivas.gov.bisp.enumeration.R;

/* JADX INFO: loaded from: classes.dex */
public class CameraSelectorDialogFragment extends L {
    private static int a = 1;
    private static int b;
    private int mCameraId;
    private CameraSelectorDialogListener mListener;

    public interface CameraSelectorDialogListener {
        void onCameraSelected(int i);
    }

    public static /* synthetic */ CameraSelectorDialogListener access$000(CameraSelectorDialogFragment cameraSelectorDialogFragment) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = i2 | 53;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return cameraSelectorDialogFragment.mListener;
        }
        CameraSelectorDialogListener cameraSelectorDialogListener = cameraSelectorDialogFragment.mListener;
        throw null;
    }

    public static /* synthetic */ int access$100(CameraSelectorDialogFragment cameraSelectorDialogFragment) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = ((i2 | 23) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = cameraSelectorDialogFragment.mCameraId;
        int i8 = (((i5 | 78) << 1) - (i5 ^ 78)) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    public static /* synthetic */ int access$102(CameraSelectorDialogFragment cameraSelectorDialogFragment, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 93) << 1) - (i3 ^ 93);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            cameraSelectorDialogFragment.mCameraId = i;
            return i;
        }
        cameraSelectorDialogFragment.mCameraId = i;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.L, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 41;
        int i4 = ((i2 & 41) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        super.onCreate(bundle);
        setRetainInstance(true);
        int i8 = b;
        int i9 = i8 & 119;
        int i10 = (i8 | 119) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 44 / 0;
        }
    }

    public static CameraSelectorDialogFragment newInstance(CameraSelectorDialogListener cameraSelectorDialogListener, int i) {
        int i2 = 2 % 2;
        CameraSelectorDialogFragment cameraSelectorDialogFragment = new CameraSelectorDialogFragment();
        cameraSelectorDialogFragment.mCameraId = i;
        cameraSelectorDialogFragment.mListener = cameraSelectorDialogListener;
        int i3 = b;
        int i4 = i3 & 69;
        int i5 = (i3 ^ 69) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return cameraSelectorDialogFragment;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.F.L
    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 27;
        int i5 = ((~i4) & (i3 | 27)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.mListener == null) {
            int i7 = i3 & 123;
            int i8 = ((i3 ^ 123) | i7) << 1;
            int i9 = -((i3 | 123) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            Object obj = null;
            if (i10 % 2 == 0) {
                dismiss();
                return null;
            }
            dismiss();
            obj.hashCode();
            throw null;
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        String[] strArr = new String[numberOfCameras];
        int i11 = a;
        int i12 = (i11 & 17) + (i11 | 17);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 ^ 89;
        int i15 = ((i11 & 89) | i14) << 1;
        int i16 = -i14;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        int i20 = 0;
        while (i19 < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i19, cameraInfo);
            int i21 = a;
            int i22 = (i21 & (-56)) | ((~i21) & 55);
            int i23 = (55 & i21) << 1;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            if (i24 % 2 == 0 ? (i = cameraInfo.facing) == 1 : (i = cameraInfo.facing) == 1) {
                int i25 = b;
                int i26 = i25 & 53;
                int i27 = (i25 ^ 53) | i26;
                int i28 = (i26 & i27) + (i27 | i26);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    strArr[i19] = "Front Facing";
                    int i29 = 35 / 0;
                } else {
                    strArr[i19] = "Front Facing";
                }
            } else if (i == 0) {
                int i30 = b;
                int i31 = ((i30 | 9) << 1) - (i30 ^ 9);
                int i32 = i31 % 128;
                a = i32;
                int i33 = i31 % 2;
                strArr[i19] = "Rear Facing";
                int i34 = i32 & 123;
                int i35 = (i32 ^ 123) | i34;
                int i36 = (i34 & i35) + (i35 | i34);
                b = i36 % 128;
                int i37 = i36 % 2;
            } else {
                strArr[i19] = ivas.gov.bisp.enumeration.p091n.j.o("Camera ID: ", i19);
                int i38 = a + 83;
                b = i38 % 128;
                int i39 = i38 % 2;
            }
            if (i19 == this.mCameraId) {
                int i40 = b;
                int i41 = i40 ^ 85;
                int i42 = -(-((i40 & 85) << 1));
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                a = i43 % 128;
                int i44 = i43 % 2;
                int i45 = i40 + 87;
                a = i45 % 128;
                int i46 = i45 % 2;
                i20 = i19;
            }
            i19 = (((i19 | 2) << 1) - (i19 ^ 2)) - 1;
            int i47 = b;
            int i48 = (i47 & (-8)) | ((~i47) & 7);
            int i49 = -(-((i47 & 7) << 1));
            int i50 = (i48 & i49) + (i49 | i48);
            a = i50 % 128;
            if (i50 % 2 == 0) {
                int i51 = 2 % 5;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        AlertDialog.Builder positiveButton = builder.setTitle(R.string.select_camera).setSingleChoiceItems(strArr, i20, new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.CameraSelectorDialogFragment.3
            private static int a = 0;
            private static int b = 1;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i52) {
                int i53 = 2 % 2;
                int i54 = b + 117;
                a = i54 % 128;
                int i55 = i54 % 2;
                CameraSelectorDialogFragment.access$102(CameraSelectorDialogFragment.this, i52);
                int i56 = b + 47;
                a = i56 % 128;
                if (i56 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).setPositiveButton(R.string.ok_button, new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.CameraSelectorDialogFragment.2
            private static int a = 1;
            private static int b;

            /* JADX WARN: Code duplicated, block: B:8:0x0024  */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i52) {
                int i53 = 2 % 2;
                int i54 = a;
                int i55 = ((i54 ^ 60) + ((i54 & 60) << 1)) - 1;
                b = i55 % 128;
                int i56 = i55 % 2;
                CameraSelectorDialogListener cameraSelectorDialogListenerAccess$000 = CameraSelectorDialogFragment.access$000(CameraSelectorDialogFragment.this);
                if (i56 != 0) {
                    int i57 = 30 / 0;
                    if (cameraSelectorDialogListenerAccess$000 != null) {
                        CameraSelectorDialogFragment.access$000(CameraSelectorDialogFragment.this).onCameraSelected(CameraSelectorDialogFragment.access$100(CameraSelectorDialogFragment.this));
                        int i58 = b;
                        int i59 = i58 & 13;
                        int i60 = (i58 | 13) & (~i59);
                        int i61 = -(-(i59 << 1));
                        int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                        a = i62 % 128;
                        int i63 = i62 % 2;
                    }
                } else if (cameraSelectorDialogListenerAccess$000 != null) {
                    CameraSelectorDialogFragment.access$000(CameraSelectorDialogFragment.this).onCameraSelected(CameraSelectorDialogFragment.access$100(CameraSelectorDialogFragment.this));
                    int i510 = b;
                    int i511 = i510 & 13;
                    int i64 = (i510 | 13) & (~i511);
                    int i65 = -(-(i511 << 1));
                    int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                }
                int i68 = a;
                int i69 = (-2) - (((i68 & 22) + (i68 | 22)) ^ (-1));
                b = i69 % 128;
                int i70 = i69 % 2;
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.fragments.CameraSelectorDialogFragment.1
            private static int a = 1;
            private static int b;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i52) {
                int i53 = 2 % 2;
                int i54 = a;
                int i55 = i54 & 35;
                int i56 = (i54 | 35) & (~i55);
                int i57 = i55 << 1;
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                b = i58 % 128;
                if (i58 % 2 != 0) {
                    throw null;
                }
            }
        };
        int i52 = b;
        int i53 = (i52 ^ 93) + ((i52 & 93) << 1);
        a = i53 % 128;
        int i54 = i53 % 2;
        positiveButton.setNegativeButton(R.string.cancel_button, onClickListener);
        AlertDialog alertDialogCreate = builder.create();
        int i55 = a;
        int i56 = ((((i55 ^ 63) | (i55 & 63)) << 1) - (~(-(((~i55) & 63) | (i55 & (-64)))))) - 1;
        b = i56 % 128;
        if (i56 % 2 != 0) {
            int i57 = 55 / 0;
        }
        return alertDialogCreate;
    }
}
