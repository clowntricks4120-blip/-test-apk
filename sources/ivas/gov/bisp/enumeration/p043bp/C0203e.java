package ivas.gov.bisp.enumeration.p043bp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.X.i;
import ivas.gov.bisp.enumeration.X.r;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.models.Crop;
import ivas.gov.bisp.enumeration.p044bq.d;
import ivas.gov.bisp.enumeration.p084g.h;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUser;
import ivas.gov.bisp.enumeration.spotCheckUser.ActivitySpotCheckUserNew;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0203e implements i, d.bpy, r, ivas.gov.bisp.enumeration.p084g.r {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0203e(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r1 = 5 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r1 = (ivas.gov.bisp.enumeration.ActivitySummary) r6.d;
        r1.textViewFromDate.setText(r8);
        r8 = ivas.gov.bisp.enumeration.p043bp.C0203e.b + 85;
        ivas.gov.bisp.enumeration.p043bp.C0203e.a = r8 % 128;
        r8 = r8 % 2;
        r1.textViewFromDate.setTag(r7);
        r7 = ivas.gov.bisp.enumeration.p043bp.C0203e.a;
        r8 = (r7 & (-72)) | ((~r7) & 71);
        r7 = (r7 & 71) << 1;
        r1 = ((r8 | r7) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.p043bp.C0203e.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r1 = (ivas.gov.bisp.enumeration.ActivityQRCodeInfo) r6.d;
        r2 = r1.textViewFromDate;
        r4 = ivas.gov.bisp.enumeration.p043bp.C0203e.b;
        r5 = (r4 & 57) + (r4 | 57);
        ivas.gov.bisp.enumeration.p043bp.C0203e.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if ((r5 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r2.setText(r8);
        r1.textViewFromDate.setTag(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r2.setText(r8);
        r1.textViewFromDate.setTag(r7);
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r6.c != 3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r6.c != 3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r2 = r1 & 33;
        r1 = r1 | 33;
        r4 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p043bp.C0203e.b = r4 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.X.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p043bp.C0203e.b
            r2 = r1 ^ 3
            r3 = r1 & 3
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-4)
            int r1 = ~r1
            r4 = 3
            r1 = r1 & r4
            r1 = r1 | r3
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p043bp.C0203e.a = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L28
            int r2 = r6.c
            r5 = 61
            int r5 = r5 / 0
            if (r2 == r4) goto L6f
            goto L2c
        L28:
            int r2 = r6.c
            if (r2 == r4) goto L6f
        L2c:
            r2 = r1 & 33
            r1 = r1 | 33
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.p043bp.C0203e.b = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L3d
            r1 = 5
            int r1 = r1 / r0
        L3d:
            java.lang.Object r1 = r6.d
            ivas.gov.bisp.enumeration.ActivitySummary r1 = (ivas.gov.bisp.enumeration.ActivitySummary) r1
            android.widget.TextView r2 = r1.textViewFromDate
            r2.setText(r8)
            int r8 = ivas.gov.bisp.enumeration.p043bp.C0203e.b
            int r8 = r8 + 85
            int r2 = r8 % 128
            ivas.gov.bisp.enumeration.p043bp.C0203e.a = r2
            int r8 = r8 % r0
            android.widget.TextView r8 = r1.textViewFromDate
            r8.setTag(r7)
            int r7 = ivas.gov.bisp.enumeration.p043bp.C0203e.a
            r8 = r7 & (-72)
            int r1 = ~r7
            r1 = r1 & 71
            r8 = r8 | r1
            r7 = r7 & 71
            int r7 = r7 << 1
            r1 = r8 | r7
            int r1 = r1 << 1
            r7 = r7 ^ r8
            int r1 = r1 - r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.p043bp.C0203e.b = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L6e
            return
        L6e:
            throw r3
        L6f:
            java.lang.Object r1 = r6.d
            ivas.gov.bisp.enumeration.ActivityQRCodeInfo r1 = (ivas.gov.bisp.enumeration.ActivityQRCodeInfo) r1
            android.widget.TextView r2 = r1.textViewFromDate
            int r4 = ivas.gov.bisp.enumeration.p043bp.C0203e.b
            r5 = r4 & 57
            r4 = r4 | 57
            int r5 = r5 + r4
            int r4 = r5 % 128
            ivas.gov.bisp.enumeration.p043bp.C0203e.a = r4
            int r5 = r5 % r0
            if (r5 != 0) goto L8c
            r2.setText(r8)
            android.widget.TextView r8 = r1.textViewFromDate
            r8.setTag(r7)
            return
        L8c:
            r2.setText(r8)
            android.widget.TextView r8 = r1.textViewFromDate
            r8.setTag(r7)
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.C0203e.e(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // ivas.gov.bisp.enumeration.p084g.r
    public final void b(Object obj) {
        Intent intent;
        int i;
        Bitmap bitmap;
        Button button;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 19) + ((i4 & 19) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        BikeRegistryActivity bikeRegistryActivity = (BikeRegistryActivity) this.d;
        h hVar = (h) obj;
        int i7 = BikeRegistryActivity.r;
        int i8 = b;
        int i9 = (i8 & 21) + (i8 | 21);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            Objects.requireNonNull(bikeRegistryActivity);
            int i10 = 44 / 0;
            if (hVar.d == -1) {
                intent = hVar.e;
                if (intent != null) {
                    int i11 = a + 106;
                    i = (i11 ^ (-1)) + (i11 << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    bitmap = (Bitmap) intent.getExtras().get("data");
                    if (bitmap != null) {
                        bikeRegistryActivity.N = bitmap;
                        bikeRegistryActivity.G.setVisibility(0);
                        int i12 = b;
                        int i13 = i12 & 15;
                        int i14 = i13 + ((i12 ^ 15) | i13);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        bikeRegistryActivity.G.setImageBitmap(bitmap);
                        button = bikeRegistryActivity.O;
                        int i16 = a;
                        int i17 = i16 & 47;
                        i2 = i17 + ((i16 ^ 47) | i17);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            button.setText("Retake Photo");
                            int i18 = 27 / 0;
                        } else {
                            button.setText("Retake Photo");
                        }
                        int i19 = b;
                        int i20 = (-2) - (((i19 ^ 40) + ((i19 & 40) << 1)) ^ (-1));
                        a = i20 % 128;
                        int i21 = i20 % 2;
                    }
                }
            }
        } else {
            Objects.requireNonNull(bikeRegistryActivity);
            if (hVar.d == -1) {
                intent = hVar.e;
                if (intent != null) {
                    int i110 = a + 106;
                    i = (i110 ^ (-1)) + (i110 << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    bitmap = (Bitmap) intent.getExtras().get("data");
                    if (bitmap != null) {
                        bikeRegistryActivity.N = bitmap;
                        bikeRegistryActivity.G.setVisibility(0);
                        int i111 = b;
                        int i112 = i111 & 15;
                        int i113 = i112 + ((i111 ^ 15) | i112);
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        bikeRegistryActivity.G.setImageBitmap(bitmap);
                        button = bikeRegistryActivity.O;
                        int i115 = a;
                        int i116 = i115 & 47;
                        i2 = i116 + ((i115 ^ 47) | i116);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            button.setText("Retake Photo");
                            int i117 = 27 / 0;
                        } else {
                            button.setText("Retake Photo");
                        }
                        int i118 = b;
                        int i22 = (-2) - (((i118 ^ 40) + ((i118 & 40) << 1)) ^ (-1));
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                }
            }
        }
        int i24 = a;
        int i25 = i24 & 91;
        int i26 = -(-((i24 ^ 91) | i25));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.i
    public final void c(int i) {
        Crop crop;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 69) - (~((i3 & 69) << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c;
        int i7 = 0;
        if (i6 == 0) {
            ActivityAgriculture activityAgriculture = (ActivityAgriculture) this.d;
            List<Crop> list = activityAgriculture.aD;
            int i8 = b;
            int i9 = (i8 & (-124)) | ((~i8) & 123);
            int i10 = (i8 & 123) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (list.get(i).getIsSelected() == 0) {
                int i13 = b;
                int i14 = ((i13 ^ 49) | (i13 & 49)) << 1;
                int i15 = -(((~i13) & 49) | (i13 & (-50)));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    crop = activityAgriculture.aD.get(i);
                } else {
                    crop = activityAgriculture.aD.get(i);
                    i7 = 1;
                }
                crop.setIsSelected(i7);
                int i17 = a;
                int i18 = (i17 & (-12)) | ((~i17) & 11);
                int i19 = (i17 & 11) << 1;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 4 % 2;
                }
            } else {
                Crop crop2 = activityAgriculture.aD.get(i);
                int i22 = a;
                int i23 = i22 & 63;
                int i24 = (i22 ^ 63) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                b = i25 % 128;
                int i26 = i25 % 2;
                crop2.setIsSelected(0);
                int i27 = b;
                int i28 = ((i27 | 65) << 1) - (i27 ^ 65);
                a = i28 % 128;
                int i29 = i28 % 2;
            }
            activityAgriculture.aH.a.d(i, 1);
            int i30 = a;
            int i31 = ((i30 ^ 56) + ((i30 & 56) << 1)) - 1;
            b = i31 % 128;
            int i32 = i31 % 2;
            return;
        }
        Object obj = null;
        if (i6 != 1) {
            if (i6 == 6) {
                ActivitySpotCheckUser activitySpotCheckUser = (ActivitySpotCheckUser) this.d;
                int i33 = ActivitySpotCheckUser.af;
                activitySpotCheckUser.startActivity(null);
                int i34 = a;
                int i35 = (((i34 | 66) << 1) - (i34 ^ 66)) - 1;
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    int i36 = 0 / 0;
                    return;
                }
                return;
            }
            int i37 = i3 & 21;
            int i38 = i37 + ((i3 ^ 21) | i37);
            a = i38 % 128;
            int i39 = i38 % 2;
            ActivitySpotCheckUserNew activitySpotCheckUserNew = (ActivitySpotCheckUserNew) this.d;
            int i40 = ActivitySpotCheckUserNew.af;
            int i41 = b + 53;
            a = i41 % 128;
            int i42 = i41 % 2;
            activitySpotCheckUserNew.startActivity(null);
            int i43 = b;
            int i44 = (-2) - (((i43 ^ 98) + ((i43 & 98) << 1)) ^ (-1));
            a = i44 % 128;
            if (i44 % 2 != 0) {
                throw null;
            }
            return;
        }
        P.bpF bpf = (P.bpF) this.d;
        List<Crop> list2 = P.this.c.aD;
        int i45 = a;
        int i46 = (i45 & 103) + (i45 | 103);
        b = i46 % 128;
        if (i46 % 2 == 0) {
            list2.get(i).getIsSelected();
            obj.hashCode();
            throw null;
        }
        if (list2.get(i).getIsSelected() == 0) {
            int i47 = b;
            int i48 = i47 & 43;
            int i49 = i48 + ((i47 ^ 43) | i48);
            a = i49 % 128;
            if (i49 % 2 != 0) {
                P.this.c.aD.get(i);
                obj.hashCode();
                throw null;
            }
            Crop crop3 = P.this.c.aD.get(i);
            int i50 = a;
            int i51 = i50 & 35;
            int i52 = (((i50 | 35) & (~i51)) - (~(i51 << 1))) - 1;
            b = i52 % 128;
            if (i52 % 2 == 0) {
                crop3.setIsSelected(0);
            } else {
                crop3.setIsSelected(1);
            }
        } else {
            Crop crop4 = P.this.c.aD.get(i);
            int i53 = b;
            int i54 = (i53 ^ 97) + ((i53 & 97) << 1);
            a = i54 % 128;
            int i55 = i54 % 2;
            crop4.setIsSelected(0);
            int i56 = a;
            int i57 = i56 & 19;
            int i58 = (i56 ^ 19) | i57;
            int i59 = (i57 & i58) + (i58 | i57);
            b = i59 % 128;
            int i60 = i59 % 2;
        }
        RecyclerView.OooOO0 oooOO0 = P.this.c.aH.a;
        int i61 = a;
        int i62 = i61 & 19;
        int i63 = (((i61 ^ 19) | i62) << 1) - ((i61 | 19) & (~i62));
        b = i63 % 128;
        if (i63 % 2 == 0) {
            oooOO0.d(i, 0);
        } else {
            oooOO0.d(i, 1);
        }
    }
}
