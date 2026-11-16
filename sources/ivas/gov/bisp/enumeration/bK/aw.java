package ivas.gov.bisp.enumeration.bK;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.InterfaceC0028m;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.uc;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aw implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ax c;

    public class bxt implements Comparator<uc> {
        private static int a = 0;
        private static int b = 1;

        public bxt(aw awVar) {
        }

        @Override // java.util.Comparator
        public int compare(uc ucVar, uc ucVar2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 67;
            int i4 = (i2 ^ 67) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                String str = ucVar.uc;
                throw null;
            }
            int iCompareToIgnoreCase = ucVar.uc.compareToIgnoreCase(ucVar2.uc);
            int i6 = a;
            int i7 = i6 ^ 39;
            int i8 = (((i6 & 39) | i7) << 1) - i7;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 96 / 0;
            }
            return iCompareToIgnoreCase;
        }
    }

    public aw(ax axVar) {
        this.c = axVar;
    }

    public class bxu implements Runnable {
        private static int a = 1;
        private static int b;

        public class bxv implements AdapterView.OnItemSelectedListener {
            private static int a = 0;
            private static int b = 1;

            public bxv() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
            
                r2 = r0.c.c.c.e;
                r3 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a + 64;
                r4 = (r3 ^ (-1)) + (r3 << 1);
                ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b = r4 % 128;
                r4 = r4 % 2;
                r2.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg_selected);
                r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b;
                r3 = r2 & 25;
                r2 = r2 | 25;
                r4 = (r3 ^ r2) + ((r2 & r3) << 1);
                ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
            
                if ((r4 % 2) != 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
            
                if (r3 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
            
                if (r3 == 0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
            
                r2 = r0.c.c.c.e;
                r3 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b;
                r4 = (r3 ^ 83) + ((r3 & 83) << 1);
                ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r4 % 128;
                r4 = r4 % 2;
                r2.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.spinner_bg);
                r2 = (-2) - ((ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b + 30) ^ (-1));
                ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
            
                return;
             */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    r1 = 2
                    int r2 = r1 % r1
                    int r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b
                    r4 = r2 ^ 101(0x65, float:1.42E-43)
                    r5 = r2 & 101(0x65, float:1.42E-43)
                    r4 = r4 | r5
                    int r4 = r4 << 1
                    r5 = r2 & (-102(0xffffffffffffff9a, float:NaN))
                    int r2 = ~r2
                    r2 = r2 & 101(0x65, float:1.42E-43)
                    r2 = r2 | r5
                    int r2 = -r2
                    int r2 = ~r2
                    int r4 = r4 - r2
                    int r4 = r4 + (-1)
                    int r2 = r4 % 128
                    ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r2
                    int r4 = r4 % r1
                    if (r4 == 0) goto L25
                    r2 = 46
                    int r2 = r2 / 0
                    if (r3 != 0) goto L51
                    goto L27
                L25:
                    if (r3 != 0) goto L51
                L27:
                    ivas.gov.bisp.enumeration.bK.aw$bxu r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.this
                    ivas.gov.bisp.enumeration.bK.aw r2 = ivas.gov.bisp.enumeration.bK.aw.this
                    ivas.gov.bisp.enumeration.bK.ax r2 = r2.c
                    android.widget.Spinner r2 = r2.e
                    int r3 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b
                    r4 = r3 ^ 83
                    r3 = r3 & 83
                    int r3 = r3 << 1
                    int r4 = r4 + r3
                    int r3 = r4 % 128
                    ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r3
                    int r4 = r4 % r1
                    r3 = 2131230998(0x7f080116, float:1.8078065E38)
                    r2.setBackgroundResource(r3)
                    int r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b
                    int r2 = r2 + 30
                    r2 = r2 ^ (-1)
                    int r2 = (-2) - r2
                    int r3 = r2 % 128
                    ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r3
                    int r2 = r2 % r1
                    return
                L51:
                    ivas.gov.bisp.enumeration.bK.aw$bxu r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.this
                    ivas.gov.bisp.enumeration.bK.aw r2 = ivas.gov.bisp.enumeration.bK.aw.this
                    ivas.gov.bisp.enumeration.bK.ax r2 = r2.c
                    android.widget.Spinner r2 = r2.e
                    int r3 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a
                    int r3 = r3 + 64
                    r4 = r3 ^ (-1)
                    int r3 = r3 << 1
                    int r4 = r4 + r3
                    int r3 = r4 % 128
                    ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b = r3
                    int r4 = r4 % r1
                    r3 = 2131231000(0x7f080118, float:1.8078069E38)
                    r2.setBackgroundResource(r3)
                    int r2 = ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.b
                    r3 = r2 & 25
                    r2 = r2 | 25
                    r4 = r3 ^ r2
                    r2 = r2 & r3
                    int r2 = r2 << 1
                    int r4 = r4 + r2
                    int r2 = r4 % 128
                    ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.a = r2
                    int r4 = r4 % r1
                    if (r4 != 0) goto L81
                    return
                L81:
                    r1 = 0
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bK.aw.bxu.bxv.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i = 2 % 2;
                int i2 = a;
                int i3 = i2 | 79;
                int i4 = ((i3 << 1) - (~(-((~(i2 & 79)) & i3)))) - 1;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public bxu() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Spinner spinner;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 91) + (i2 | 91);
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Spinner spinner2 = aw.this.c.e;
                obj.hashCode();
                throw null;
            }
            if (aw.this.c.e != null) {
                ax axVar = aw.this.c;
                ArrayAdapter arrayAdapter = new ArrayAdapter(axVar.b, R.layout.spinner_item, axVar.f);
                int i4 = a;
                int i5 = ((i4 & 49) - (~(-(-(i4 | 49))))) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    Spinner spinner3 = aw.this.c.e;
                    obj.hashCode();
                    throw null;
                }
                Spinner spinner4 = aw.this.c.e;
                int i6 = b;
                int i7 = (-2) - (((i6 & 110) + (i6 | 110)) ^ (-1));
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    spinner4.setAdapter((SpinnerAdapter) arrayAdapter);
                    spinner = aw.this.c.e;
                    int i8 = 46 / 0;
                } else {
                    spinner4.setAdapter((SpinnerAdapter) arrayAdapter);
                    spinner = aw.this.c.e;
                }
                spinner.setOnItemSelectedListener(new bxv());
                int i9 = a;
                int i10 = i9 ^ 105;
                int i11 = (i9 & 105) << 1;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            ax axVar2 = aw.this.c;
            InterfaceC0028m interfaceC0028m = axVar2.h;
            ArrayList<uc> arrayList = axVar2.g;
            int i14 = (-2) - ((a + 122) ^ (-1));
            b = i14 % 128;
            int i15 = i14 % 2;
            interfaceC0028m.fillucList(arrayList, axVar2.f);
            int i16 = a;
            int i17 = (i16 & 85) + (i16 | 85);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarM;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            hVarM = AppDatabase.l(this.c.b.getApplicationContext()).m();
            int i4 = 86 / 0;
        } else {
            hVarM = AppDatabase.l(this.c.b.getApplicationContext()).m();
        }
        List listAj = hVarM.aj(this.c.c);
        bxt bxtVar = new bxt(this);
        int i5 = a;
        int i6 = i5 & 95;
        int i7 = -(-((i5 ^ 95) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            Collections.sort(listAj, bxtVar);
            listAj.size();
            listAj.size();
            throw null;
        }
        Collections.sort(listAj, bxtVar);
        listAj.size();
        if (listAj.size() > 0) {
            int i9 = a;
            int i10 = i9 & 25;
            int i11 = (i9 ^ 25) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                String str = this.c.d;
                throw null;
            }
            String str2 = this.c.d;
            if (str2 != null && str2.length() > 0) {
                ax axVar = this.c;
                ArrayList<uc> arrayList3 = axVar.g;
                uc ucVar = new uc(BuildConfig.FLAVOR, 0, axVar.c, 0);
                int i13 = a;
                int i14 = i13 & 61;
                int i15 = (((i13 ^ 61) | i14) << 1) - ((i13 | 61) & (~i14));
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    arrayList3.add(ucVar);
                    ArrayList<String> arrayList4 = this.c.f;
                    obj.hashCode();
                    throw null;
                }
                arrayList3.add(ucVar);
                ax axVar2 = this.c;
                ArrayList<String> arrayList5 = axVar2.f;
                int i16 = b;
                int i17 = i16 & 15;
                int i18 = -(-((i16 ^ 15) | i17));
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i20 = i19 % 2;
                arrayList5.add(axVar2.d);
                int i21 = a;
                int i22 = (i21 & 69) + (i21 | 69);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = b;
            int i25 = (((i24 ^ 73) | (i24 & 73)) << 1) - (((~i24) & 73) | (i24 & (-74)));
            a = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 2 / 3;
            }
            int i27 = 0;
            while (i27 < listAj.size()) {
                int i28 = a + 99;
                b = i28 % 128;
                int i29 = i28 % 2;
                ArrayList<uc> arrayList6 = this.c.g;
                Object obj2 = listAj.get(i27);
                int i30 = a;
                int i31 = ((i30 & 106) + (i30 | 106)) - 1;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    String str3 = ((uc) obj2).uc;
                    throw null;
                }
                String str4 = ((uc) obj2).uc;
                uc ucVar2 = (uc) listAj.get(i27);
                int i32 = b + 75;
                a = i32 % 128;
                int i33 = i32 % 2;
                uc ucVar3 = new uc(str4, ucVar2.tehsilcode, ((uc) listAj.get(i27)).uccode, ((uc) listAj.get(i27)).ucno);
                int i34 = a;
                int i35 = ((i34 ^ 75) | (i34 & 75)) << 1;
                int i36 = -(((~i34) & 75) | (i34 & (-76)));
                int i37 = (i35 & i36) + (i36 | i35);
                b = i37 % 128;
                int i38 = i37 % 2;
                arrayList6.add(ucVar3);
                ArrayList<String> arrayList7 = this.c.f;
                int i39 = b + 9;
                a = i39 % 128;
                if (i39 % 2 != 0) {
                    String.valueOf(((uc) listAj.get(i27)).uc);
                    obj.hashCode();
                    throw null;
                }
                arrayList7.add(String.valueOf(((uc) listAj.get(i27)).uc));
                int size = listAj.size();
                if (i27 == ((size << 1) - size) - 1) {
                    ax axVar3 = this.c;
                    ArrayList<uc> arrayList8 = axVar3.g;
                    uc ucVar4 = new uc("Other", 0, axVar3.c, 0);
                    int i40 = a;
                    int i41 = (-2) - (((i40 ^ 112) + ((i40 & 112) << 1)) ^ (-1));
                    b = i41 % 128;
                    if (i41 % 2 == 0) {
                        arrayList8.add(ucVar4);
                        arrayList2 = this.c.f;
                        int i42 = 84 / 0;
                    } else {
                        arrayList8.add(ucVar4);
                        arrayList2 = this.c.f;
                    }
                    arrayList2.add("Other");
                    int i43 = a;
                    int i44 = (i43 ^ 120) + ((i43 & 120) << 1);
                    int i45 = (i44 ^ (-1)) + (i44 << 1);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                }
                i27 = ((i27 & 116) + (i27 | 116)) - 115;
                int i47 = b;
                int i48 = i47 ^ 119;
                int i49 = -(-((i47 & 119) << 1));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                a = i50 % 128;
                int i51 = i50 % 2;
            }
        } else {
            ax axVar4 = this.c;
            ArrayList<uc> arrayList9 = axVar4.g;
            uc ucVar5 = new uc(BuildConfig.FLAVOR, 0, axVar4.c, 0);
            int i52 = a;
            int i53 = (i52 & (-72)) | ((~i52) & 71);
            int i54 = -(-((i52 & 71) << 1));
            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
            b = i55 % 128;
            int i56 = i55 % 2;
            arrayList9.add(ucVar5);
            ax axVar5 = this.c;
            ArrayList<String> arrayList10 = axVar5.f;
            int i57 = b;
            int i58 = ((i57 ^ 98) + ((i57 & 98) << 1)) - 1;
            a = i58 % 128;
            int i59 = i58 % 2;
            arrayList10.add(axVar5.d);
            ax axVar6 = this.c;
            ArrayList<uc> arrayList11 = axVar6.g;
            uc ucVar6 = new uc("Other", 0, axVar6.c, 0);
            int i60 = b;
            int i61 = ((i60 ^ 63) | (i60 & 63)) << 1;
            int i62 = -(((~i60) & 63) | (i60 & (-64)));
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            a = i63 % 128;
            if (i63 % 2 != 0) {
                arrayList11.add(ucVar6);
                arrayList = this.c.f;
                int i64 = 57 / 0;
            } else {
                arrayList11.add(ucVar6);
                arrayList = this.c.f;
            }
            int i65 = a;
            int i66 = i65 & 23;
            int i67 = ((i65 ^ 23) | i66) << 1;
            int i68 = -((i65 | 23) & (~i66));
            int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
            b = i69 % 128;
            if (i69 % 2 == 0) {
                arrayList.add("Other");
                throw null;
            }
            arrayList.add("Other");
            int i70 = b + 25;
            a = i70 % 128;
            int i71 = i70 % 2;
        }
        this.c.a.post(new bxu());
        int i72 = a;
        int i73 = i72 & 95;
        int i74 = (~i73) & (i72 | 95);
        int i75 = i73 << 1;
        int i76 = (i74 & i75) + (i75 | i74);
        b = i76 % 128;
        if (i76 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i77 = (i72 & 29) + (i72 | 29);
        b = i77 % 128;
        int i78 = i77 % 2;
    }
}
