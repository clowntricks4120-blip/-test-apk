package ivas.gov.bisp.enumeration.bH;

import ivas.gov.bisp.enumeration.bG.B;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class z implements Comparator<t> {
    private static int a = 0;
    private static int b = 1;

    public z(P p) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    @Override // java.util.Comparator
    public int compare(t tVar, t tVar2) {
        t tVar3;
        t tVar4;
        B b2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 2 % 2;
        int i19 = a;
        int i20 = 1;
        int i21 = ((i19 ^ 34) + ((i19 & 34) << 1)) - 1;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            tVar3 = tVar;
            tVar4 = tVar2;
            b2 = tVar3.b;
            int i22 = 10 / 0;
        } else {
            tVar3 = tVar;
            tVar4 = tVar2;
            b2 = tVar3.b;
        }
        int i23 = a;
        int i24 = (((i23 | 20) << 1) - (i23 ^ 20)) - 1;
        b = i24 % 128;
        int i25 = -2;
        Object obj = null;
        if (i24 % 2 != 0) {
            i = b2.d;
            if (i < 0) {
                i2 = -2;
            } else if (i >= 0) {
                int i26 = a + 59;
                b = i26 % 128;
                int i27 = i26 % 2;
                i13 = tVar3.a.d;
                if (i13 >= 0) {
                    int i28 = a;
                    int i29 = i28 ^ 73;
                    i14 = ((((i28 & 73) | i29) << 1) - (~(-i29))) - 1;
                    i15 = i14 % 128;
                    b = i15;
                    if (i14 % 2 == 0) {
                        int i30 = 91 / 0;
                        if (i > i13) {
                            int i31 = i15 & 125;
                            i16 = i31 + ((i15 ^ 125) | i31);
                            i17 = i16 % 128;
                            a = i17;
                            if (i16 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i32 = i17 + 17;
                            b = i32 % 128;
                            int i33 = i32 % 2;
                            i2 = i25;
                            i25 = i13;
                        } else {
                            i2 = i25;
                            i25 = i;
                        }
                    } else if (i > i13) {
                        int i34 = i15 & 125;
                        i16 = i34 + ((i15 ^ 125) | i34);
                        i17 = i16 % 128;
                        a = i17;
                        if (i16 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i35 = i17 + 17;
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        i2 = i25;
                        i25 = i13;
                    } else {
                        i2 = i25;
                        i25 = i;
                    }
                } else {
                    int i37 = a;
                    int i38 = i37 ^ 9;
                    int i39 = ((i37 & 9) | i38) << 1;
                    int i40 = -i38;
                    int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    i2 = i25;
                    i25 = -1;
                }
            } else {
                int i310 = a;
                int i311 = i310 ^ 9;
                int i312 = ((i310 & 9) | i311) << 1;
                int i43 = -i311;
                int i44 = ((i312 | i43) << 1) - (i312 ^ i43);
                b = i44 % 128;
                int i45 = i44 % 2;
                i2 = i25;
                i25 = -1;
            }
            i3 = tVar4.b.d;
            if (i3 < 0) {
                i12 = b + 29;
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i46 = tVar4.a.d;
                    throw null;
                }
                if (tVar4.a.d >= 0) {
                    if (i3 >= 0) {
                        int i47 = b;
                        int i48 = (i47 & (-92)) | ((~i47) & 91);
                        int i49 = -(-((i47 & 91) << 1));
                        i4 = ((i48 | i49) << 1) - (i49 ^ i48);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i50 = tVar4.a.d;
                            obj.hashCode();
                            throw null;
                        }
                        i2 = tVar4.a.d;
                        if (i2 >= 0) {
                            i5 = b;
                            int i51 = i5 & 89;
                            int i52 = (i5 ^ 89) | i51;
                            i6 = ((i51 | i52) << 1) - (i51 ^ i52);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (i3 <= i2) {
                                int i53 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                                a = i53 % 128;
                                int i54 = i53 % 2;
                                i2 = i3;
                            }
                        } else {
                            int i55 = a + 59;
                            b = i55 % 128;
                            int i56 = i55 % 2;
                            i2 = -1;
                        }
                    } else {
                        int i57 = a + 59;
                        b = i57 % 128;
                        int i58 = i57 % 2;
                        i2 = -1;
                    }
                }
            } else if (i3 >= 0) {
                int i410 = b;
                int i411 = (i410 & (-92)) | ((~i410) & 91);
                int i412 = -(-((i410 & 91) << 1));
                i4 = ((i411 | i412) << 1) - (i412 ^ i411);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i59 = tVar4.a.d;
                    obj.hashCode();
                    throw null;
                }
                i2 = tVar4.a.d;
                if (i2 >= 0) {
                    i5 = b;
                    int i510 = i5 & 89;
                    int i511 = (i5 ^ 89) | i510;
                    i6 = ((i510 | i511) << 1) - (i510 ^ i511);
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i3 <= i2) {
                        int i512 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                        a = i512 % 128;
                        int i513 = i512 % 2;
                        i2 = i3;
                    }
                } else {
                    int i514 = a + 59;
                    b = i514 % 128;
                    int i515 = i514 % 2;
                    i2 = -1;
                }
            } else {
                int i516 = a + 59;
                b = i516 % 128;
                int i517 = i516 % 2;
                i2 = -1;
            }
            if (i25 > i2) {
                int i60 = a;
                int i61 = i60 & 35;
                int i62 = ((((i60 ^ 35) | i61) << 1) - (~(-((~i61) & (i60 | 35))))) - 1;
                b = i62 % 128;
                int i63 = i62 % 2;
                int i64 = i60 & 103;
                int i65 = (i60 | 103) & (~i64);
                int i66 = i64 << 1;
                i11 = ((i65 | i66) << 1) - (i65 ^ i66);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    int i67 = 2 % 5;
                }
            } else if (i25 < i2) {
                int i68 = b;
                int i69 = i68 & 7;
                i7 = ((((i68 ^ 7) | i69) << 1) - (~(-((i68 | 7) & (~i69))))) - 1;
                i8 = i7 % 128;
                a = i8;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i70 = i8 & 21;
                i9 = i70 + ((i8 ^ 21) | i70);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i71 = 4 / 2;
                }
                i20 = -1;
            } else {
                int i72 = b;
                int i73 = i72 & 115;
                int i74 = -(-((i72 ^ 115) | i73));
                int i75 = (i73 & i74) + (i74 | i73);
                a = i75 % 128;
                int i76 = i75 % 2;
                i20 = 0;
            }
            i10 = b + 85;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return i20;
            }
            throw null;
        }
        i = b2.d;
        i2 = 18;
        if (i < 0) {
        }
        i25 = i2;
        if (i >= 0) {
            int i210 = a + 59;
            b = i210 % 128;
            int i211 = i210 % 2;
            i13 = tVar3.a.d;
            if (i13 >= 0) {
                int i212 = a;
                int i213 = i212 ^ 73;
                i14 = ((((i212 & 73) | i213) << 1) - (~(-i213))) - 1;
                i15 = i14 % 128;
                b = i15;
                if (i14 % 2 == 0) {
                    int i313 = 91 / 0;
                    if (i > i13) {
                        int i314 = i15 & 125;
                        i16 = i314 + ((i15 ^ 125) | i314);
                        i17 = i16 % 128;
                        a = i17;
                        if (i16 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i315 = i17 + 17;
                        b = i315 % 128;
                        int i316 = i315 % 2;
                        i2 = i25;
                        i25 = i13;
                    } else {
                        i2 = i25;
                        i25 = i;
                    }
                } else if (i > i13) {
                    int i317 = i15 & 125;
                    i16 = i317 + ((i15 ^ 125) | i317);
                    i17 = i16 % 128;
                    a = i17;
                    if (i16 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i318 = i17 + 17;
                    b = i318 % 128;
                    int i319 = i318 % 2;
                    i2 = i25;
                    i25 = i13;
                } else {
                    i2 = i25;
                    i25 = i;
                }
            } else {
                int i3110 = a;
                int i3111 = i3110 ^ 9;
                int i3112 = ((i3110 & 9) | i3111) << 1;
                int i413 = -i3111;
                int i414 = ((i3112 | i413) << 1) - (i3112 ^ i413);
                b = i414 % 128;
                int i415 = i414 % 2;
                i2 = i25;
                i25 = -1;
            }
        } else {
            int i3113 = a;
            int i3114 = i3113 ^ 9;
            int i3115 = ((i3113 & 9) | i3114) << 1;
            int i416 = -i3114;
            int i417 = ((i3115 | i416) << 1) - (i3115 ^ i416);
            b = i417 % 128;
            int i418 = i417 % 2;
            i2 = i25;
            i25 = -1;
        }
        i3 = tVar4.b.d;
        if (i3 < 0) {
            i12 = b + 29;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i419 = tVar4.a.d;
                throw null;
            }
            if (tVar4.a.d >= 0) {
                if (i3 >= 0) {
                    int i4110 = b;
                    int i4111 = (i4110 & (-92)) | ((~i4110) & 91);
                    int i4112 = -(-((i4110 & 91) << 1));
                    i4 = ((i4111 | i4112) << 1) - (i4112 ^ i4111);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i518 = tVar4.a.d;
                        obj.hashCode();
                        throw null;
                    }
                    i2 = tVar4.a.d;
                    if (i2 >= 0) {
                        i5 = b;
                        int i519 = i5 & 89;
                        int i5110 = (i5 ^ 89) | i519;
                        i6 = ((i519 | i5110) << 1) - (i519 ^ i5110);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i3 <= i2) {
                            int i5111 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                            a = i5111 % 128;
                            int i5112 = i5111 % 2;
                            i2 = i3;
                        }
                    } else {
                        int i5113 = a + 59;
                        b = i5113 % 128;
                        int i5114 = i5113 % 2;
                        i2 = -1;
                    }
                } else {
                    int i5115 = a + 59;
                    b = i5115 % 128;
                    int i5116 = i5115 % 2;
                    i2 = -1;
                }
            }
        } else if (i3 >= 0) {
            int i4113 = b;
            int i4114 = (i4113 & (-92)) | ((~i4113) & 91);
            int i4115 = -(-((i4113 & 91) << 1));
            i4 = ((i4114 | i4115) << 1) - (i4115 ^ i4114);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5117 = tVar4.a.d;
                obj.hashCode();
                throw null;
            }
            i2 = tVar4.a.d;
            if (i2 >= 0) {
                i5 = b;
                int i5118 = i5 & 89;
                int i5119 = (i5 ^ 89) | i5118;
                i6 = ((i5118 | i5119) << 1) - (i5118 ^ i5119);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i3 <= i2) {
                    int i51110 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                    a = i51110 % 128;
                    int i51111 = i51110 % 2;
                    i2 = i3;
                }
            } else {
                int i51112 = a + 59;
                b = i51112 % 128;
                int i51113 = i51112 % 2;
                i2 = -1;
            }
        } else {
            int i51114 = a + 59;
            b = i51114 % 128;
            int i51115 = i51114 % 2;
            i2 = -1;
        }
        if (i25 > i2) {
            int i610 = a;
            int i611 = i610 & 35;
            int i612 = ((((i610 ^ 35) | i611) << 1) - (~(-((~i611) & (i610 | 35))))) - 1;
            b = i612 % 128;
            int i613 = i612 % 2;
            int i614 = i610 & 103;
            int i615 = (i610 | 103) & (~i614);
            int i616 = i614 << 1;
            i11 = ((i615 | i616) << 1) - (i615 ^ i616);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i617 = 2 % 5;
            }
        } else if (i25 < i2) {
            int i618 = b;
            int i619 = i618 & 7;
            i7 = ((((i618 ^ 7) | i619) << 1) - (~(-((i618 | 7) & (~i619))))) - 1;
            i8 = i7 % 128;
            a = i8;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i77 = i8 & 21;
            i9 = i77 + ((i8 ^ 21) | i77);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i78 = 4 / 2;
            }
            i20 = -1;
        } else {
            int i79 = b;
            int i710 = i79 & 115;
            int i711 = -(-((i79 ^ 115) | i710));
            int i712 = (i710 & i711) + (i711 | i710);
            a = i712 % 128;
            int i713 = i712 % 2;
            i20 = 0;
        }
        i10 = b + 85;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return i20;
        }
        throw null;
        if (tVar3.a.d < 0) {
            int i80 = a;
            int i81 = (i80 ^ 19) + ((i80 & 19) << 1);
            int i82 = i81 % 128;
            b = i82;
            i25 = i81 % 2 == 0 ? 45 : -2;
            int i83 = (i82 ^ 76) + ((i82 & 76) << 1);
            int i84 = (i83 ^ (-1)) + (i83 << 1);
            a = i84 % 128;
            int i85 = i84 % 2;
        } else {
            i25 = i2;
            if (i >= 0) {
                int i214 = a + 59;
                b = i214 % 128;
                int i215 = i214 % 2;
                i13 = tVar3.a.d;
                if (i13 >= 0) {
                    int i216 = a;
                    int i217 = i216 ^ 73;
                    i14 = ((((i216 & 73) | i217) << 1) - (~(-i217))) - 1;
                    i15 = i14 % 128;
                    b = i15;
                    if (i14 % 2 == 0) {
                        int i3116 = 91 / 0;
                        if (i > i13) {
                            int i3117 = i15 & 125;
                            i16 = i3117 + ((i15 ^ 125) | i3117);
                            i17 = i16 % 128;
                            a = i17;
                            if (i16 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            int i3118 = i17 + 17;
                            b = i3118 % 128;
                            int i3119 = i3118 % 2;
                            i2 = i25;
                            i25 = i13;
                        } else {
                            i2 = i25;
                            i25 = i;
                        }
                    } else if (i > i13) {
                        int i31110 = i15 & 125;
                        i16 = i31110 + ((i15 ^ 125) | i31110);
                        i17 = i16 % 128;
                        a = i17;
                        if (i16 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i31111 = i17 + 17;
                        b = i31111 % 128;
                        int i31112 = i31111 % 2;
                        i2 = i25;
                        i25 = i13;
                    } else {
                        i2 = i25;
                        i25 = i;
                    }
                } else {
                    int i31113 = a;
                    int i31114 = i31113 ^ 9;
                    int i31115 = ((i31113 & 9) | i31114) << 1;
                    int i4116 = -i31114;
                    int i4117 = ((i31115 | i4116) << 1) - (i31115 ^ i4116);
                    b = i4117 % 128;
                    int i4118 = i4117 % 2;
                    i2 = i25;
                    i25 = -1;
                }
            } else {
                int i31116 = a;
                int i31117 = i31116 ^ 9;
                int i31118 = ((i31116 & 9) | i31117) << 1;
                int i4119 = -i31117;
                int i41110 = ((i31118 | i4119) << 1) - (i31118 ^ i4119);
                b = i41110 % 128;
                int i41111 = i41110 % 2;
                i2 = i25;
                i25 = -1;
            }
        }
        i3 = tVar4.b.d;
        if (i3 < 0) {
            i12 = b + 29;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i4120 = tVar4.a.d;
                throw null;
            }
            if (tVar4.a.d >= 0) {
                if (i3 >= 0) {
                    int i41112 = b;
                    int i41113 = (i41112 & (-92)) | ((~i41112) & 91);
                    int i41114 = -(-((i41112 & 91) << 1));
                    i4 = ((i41113 | i41114) << 1) - (i41114 ^ i41113);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i51116 = tVar4.a.d;
                        obj.hashCode();
                        throw null;
                    }
                    i2 = tVar4.a.d;
                    if (i2 >= 0) {
                        i5 = b;
                        int i51117 = i5 & 89;
                        int i51118 = (i5 ^ 89) | i51117;
                        i6 = ((i51117 | i51118) << 1) - (i51117 ^ i51118);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i3 <= i2) {
                            int i51119 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                            a = i51119 % 128;
                            int i511110 = i51119 % 2;
                            i2 = i3;
                        }
                    } else {
                        int i511111 = a + 59;
                        b = i511111 % 128;
                        int i511112 = i511111 % 2;
                        i2 = -1;
                    }
                } else {
                    int i511113 = a + 59;
                    b = i511113 % 128;
                    int i511114 = i511113 % 2;
                    i2 = -1;
                }
            }
        } else if (i3 >= 0) {
            int i41115 = b;
            int i41116 = (i41115 & (-92)) | ((~i41115) & 91);
            int i41117 = -(-((i41115 & 91) << 1));
            i4 = ((i41116 | i41117) << 1) - (i41117 ^ i41116);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                int i511115 = tVar4.a.d;
                obj.hashCode();
                throw null;
            }
            i2 = tVar4.a.d;
            if (i2 >= 0) {
                i5 = b;
                int i511116 = i5 & 89;
                int i511117 = (i5 ^ 89) | i511116;
                i6 = ((i511116 | i511117) << 1) - (i511116 ^ i511117);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i3 <= i2) {
                    int i511118 = ((i5 ^ 32) + ((i5 & 32) << 1)) - 1;
                    a = i511118 % 128;
                    int i511119 = i511118 % 2;
                    i2 = i3;
                }
            } else {
                int i5111110 = a + 59;
                b = i5111110 % 128;
                int i5111111 = i5111110 % 2;
                i2 = -1;
            }
        } else {
            int i5111112 = a + 59;
            b = i5111112 % 128;
            int i5111113 = i5111112 % 2;
            i2 = -1;
        }
        if (i25 > i2) {
            int i6110 = a;
            int i6111 = i6110 & 35;
            int i6112 = ((((i6110 ^ 35) | i6111) << 1) - (~(-((~i6111) & (i6110 | 35))))) - 1;
            b = i6112 % 128;
            int i6113 = i6112 % 2;
            int i6114 = i6110 & 103;
            int i6115 = (i6110 | 103) & (~i6114);
            int i6116 = i6114 << 1;
            i11 = ((i6115 | i6116) << 1) - (i6115 ^ i6116);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i6117 = 2 % 5;
            }
        } else if (i25 < i2) {
            int i6118 = b;
            int i6119 = i6118 & 7;
            i7 = ((((i6118 ^ 7) | i6119) << 1) - (~(-((i6118 | 7) & (~i6119))))) - 1;
            i8 = i7 % 128;
            a = i8;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i714 = i8 & 21;
            i9 = i714 + ((i8 ^ 21) | i714);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i715 = 4 / 2;
            }
            i20 = -1;
        } else {
            int i716 = b;
            int i717 = i716 & 115;
            int i718 = -(-((i716 ^ 115) | i717));
            int i719 = (i717 & i718) + (i718 | i717);
            a = i719 % 128;
            int i7110 = i719 % 2;
            i20 = 0;
        }
        i10 = b + 85;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return i20;
        }
        throw null;
    }
}
