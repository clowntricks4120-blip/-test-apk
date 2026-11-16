package ivas.gov.bisp.enumeration.p036bi;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0159al implements J {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityActivity c;

    public C0159al(DisabilityActivity disabilityActivity) {
        this.c = disabilityActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0062  */
    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x009d A[EDGE_INSN: B:16:0x009d->B:23:0x00da BREAK  A[LOOP:0: B:3:0x0036->B:19:0x00b0]] */
    /* JADX WARN: Code duplicated, block: B:17:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b0 A[LOOP:0: B:3:0x0036->B:19:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0089 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.W.J
    public void fillList(ArrayList<Item> arrayList) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 111) << 1) - (i5 ^ 111);
        b = i6 % 128;
        int i7 = i6 % 2;
        DisabilityActivity disabilityActivity = this.c;
        disabilityActivity.ac = arrayList;
        Spinner spinner = disabilityActivity.ad;
        int i8 = a + 126;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        spinner.setEnabled(true);
        int i11 = a + 92;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            ArrayList<Item> arrayList2 = this.c.ac;
            int i15 = b;
            int i16 = i15 & 15;
            int i17 = (i15 | 15) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            Object obj = null;
            if (i19 % 2 != 0) {
                if (i14 >= arrayList2.size()) {
                    i14 = 0;
                    break;
                }
                int i20 = a;
                int i21 = i20 ^ 9;
                i = ((((i20 & 9) | i21) << 1) - (~(-i21))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    this.c.ac.get(i14);
                    obj.hashCode();
                    throw null;
                }
                if (this.c.ac.get(i14).getOptionId() == this.c.aK) {
                    i2 = a;
                    int i22 = i2 & 119;
                    i3 = (((i2 ^ 119) | i22) << 1) - ((~i22) & (i2 | 119));
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i23 = (-2) - (((i2 & 116) + (i2 | 116)) ^ (-1));
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    break;
                }
                int i25 = (i14 & 76) + (i14 | 76);
                i14 = (i25 ^ (-75)) + ((i25 & (-75)) << 1);
                int i26 = b;
                int i27 = i26 ^ 123;
                int i28 = (((i26 & 123) | i27) << 1) - i27;
                a = i28 % 128;
                int i29 = i28 % 2;
            } else {
                int i30 = 10 / 0;
                if (i14 >= arrayList2.size()) {
                    i14 = 0;
                    break;
                }
                int i210 = a;
                int i211 = i210 ^ 9;
                i = ((((i210 & 9) | i211) << 1) - (~(-i211))) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    this.c.ac.get(i14);
                    obj.hashCode();
                    throw null;
                }
                if (this.c.ac.get(i14).getOptionId() == this.c.aK) {
                    i2 = a;
                    int i212 = i2 & 119;
                    i3 = (((i2 ^ 119) | i212) << 1) - ((~i212) & (i2 | 119));
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i213 = (-2) - (((i2 & 116) + (i2 | 116)) ^ (-1));
                    b = i213 % 128;
                    int i214 = i213 % 2;
                    break;
                }
                int i215 = (i14 & 76) + (i14 | 76);
                i14 = (i215 ^ (-75)) + ((i215 & (-75)) << 1);
                int i216 = b;
                int i217 = i216 ^ 123;
                int i218 = (((i216 & 123) | i217) << 1) - i217;
                a = i218 % 128;
                int i219 = i218 % 2;
            }
        }
        DisabilityActivity disabilityActivity2 = this.c;
        ArrayList<Item> arrayList3 = disabilityActivity2.ac;
        Spinner spinner2 = disabilityActivity2.ad;
        Objects.requireNonNull(disabilityActivity2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(disabilityActivity2, R.layout.spinner_item, arrayList3);
        int i31 = a;
        int i32 = i31 & 67;
        int i33 = (i31 ^ 67) | i32;
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        b = i34 % 128;
        if (i34 % 2 != 0) {
            arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
            int i35 = 41 / 0;
        } else {
            arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        spinner2.setOnItemSelectedListener(new C0196y(disabilityActivity2, spinner2, arrayList3));
        DisabilityActivity disabilityActivity3 = this.c;
        int i36 = b;
        int i37 = i36 & 123;
        int i38 = (i36 ^ 123) | i37;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        a = i39 % 128;
        if (i39 % 2 == 0) {
            disabilityActivity3.ad.setSelection(i14);
            throw null;
        }
        disabilityActivity3.ad.setSelection(i14);
        int i40 = b;
        int i41 = i40 & 95;
        int i42 = ((i40 | 95) & (~i41)) + (i41 << 1);
        a = i42 % 128;
        if (i42 % 2 == 0) {
            throw null;
        }
    }
}
