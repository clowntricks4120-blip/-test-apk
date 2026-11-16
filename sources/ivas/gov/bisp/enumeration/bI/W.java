package ivas.gov.bisp.enumeration.bI;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class W implements AdapterView.OnItemSelectedListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ ActivityRoster d;

    public W(ActivityRoster activityRoster, Spinner spinner) {
        this.d = activityRoster;
        this.c = spinner;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        a = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00eb  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        question_options question_optionsVar;
        int i2;
        question_options question_optionsVar2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 39) << 1) - (i5 ^ 39);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            ArrayList<question_options> arrayList = this.d.bp;
            throw null;
        }
        ArrayList<question_options> arrayList2 = this.d.bp;
        if (arrayList2 != null && i < arrayList2.size()) {
            int i7 = a;
            int i8 = ((i7 & (-116)) | ((~i7) & 115)) + ((i7 & 115) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 46 / 0;
                if (this.d.bp.get(i) != null) {
                    int i10 = a + 107;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    question_optionsVar = this.d.bp.get(i);
                    int i12 = a;
                    int i13 = (i12 & (-110)) | ((~i12) & 109);
                    int i14 = -(-((i12 & 109) << 1));
                    i2 = (i13 ^ i14) + ((i14 & i13) << 1);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        String str = question_optionsVar.option;
                        throw null;
                    }
                    if (question_optionsVar.option != null) {
                        int i15 = a;
                        int i16 = ((i15 ^ 15) - (~((i15 & 15) << 1))) - 1;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        question_optionsVar2 = this.d.bp.get(i);
                        int i18 = b;
                        int i19 = i18 & 119;
                        int i20 = i19 + ((i18 ^ 119) | i19);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        if (question_optionsVar2.option.trim().equalsIgnoreCase("No")) {
                            int i22 = b;
                            int i23 = ((i22 & 36) + (i22 | 36)) - 1;
                            a = i23 % 128;
                            int i24 = i23 % 2;
                            this.c.setVisibility(0);
                            i3 = b + 77;
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        this.c.setVisibility(8);
                        int i25 = a;
                        int i26 = ((i25 | 115) << 1) - (i25 ^ 115);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            } else if (this.d.bp.get(i) != null) {
                int i110 = a + 107;
                b = i110 % 128;
                int i111 = i110 % 2;
                question_optionsVar = this.d.bp.get(i);
                int i112 = a;
                int i113 = (i112 & (-110)) | ((~i112) & 109);
                int i114 = -(-((i112 & 109) << 1));
                i2 = (i113 ^ i114) + ((i114 & i113) << 1);
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    String str2 = question_optionsVar.option;
                    throw null;
                }
                if (question_optionsVar.option != null) {
                    int i115 = a;
                    int i116 = ((i115 ^ 15) - (~((i115 & 15) << 1))) - 1;
                    b = i116 % 128;
                    int i117 = i116 % 2;
                    question_optionsVar2 = this.d.bp.get(i);
                    int i118 = b;
                    int i119 = i118 & 119;
                    int i28 = i119 + ((i118 ^ 119) | i119);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    if (question_optionsVar2.option.trim().equalsIgnoreCase("No")) {
                        int i210 = b;
                        int i211 = ((i210 & 36) + (i210 | 36)) - 1;
                        a = i211 % 128;
                        int i212 = i211 % 2;
                        this.c.setVisibility(0);
                        i3 = b + 77;
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    this.c.setVisibility(8);
                    int i213 = a;
                    int i214 = ((i213 | 115) << 1) - (i213 ^ 115);
                    b = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
        }
        int i30 = (-2) - ((a + 124) ^ (-1));
        b = i30 % 128;
        if (i30 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
