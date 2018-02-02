package defpackage;

import java.lang.reflect.Array;

public class ep {
    static int ae = 0;
    static final int aj = 128;
    static final int ak = 4095;
    public static final int am = 91;
    static int[][] an = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{128, 128}));
    public static final int ao = 64;
    static int[] ap = new int[bg.aw];
    static int[][] aq = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{128, 128}));
    static int[] at = new int[bg.aw];
    static int mz;

    ep() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ep.<init>(" + ')');
        }
    }

    public static int aa(int i, int i2, int i3, ej ejVar, eh ehVar, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        boolean ac;
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
        for (i4 = 0; i4 < 128; i4++) {
            for (i5 = 0; i5 < 128; i5++) {
                an[i4][i5] = 0;
                aq[i4][i5] = 99999999;
            }
        }
        if (1 == i3) {
            ac = df.ac(i, i2, ejVar, ehVar, 494399998);
        } else if (i3 == 2) {
            i6 = i - 64;
            i7 = i2 - 64;
            an[64][64] = 99;
            aq[64][64] = 0;
            i5 = 0;
            ap[0] = i;
            i8 = 1;
            at[0] = i2;
            int[][] iArr3 = ehVar.bs;
            i9 = i2;
            i10 = i;
            while (i5 != i8) {
                i10 = ap[i5];
                i9 = at[i5];
                i11 = (i5 + 1) & ak;
                i12 = i10 - i6;
                i13 = i9 - i7;
                i14 = i10 - (-787596811 * ehVar.bd);
                i15 = i9 - (1195916859 * ehVar.by);
                if (ejVar.aj(2, i10, i9, ehVar, 1809741828)) {
                    am.ao = -618860053 * i10;
                    jv.aa = -1688344321 * i9;
                    ac = true;
                    break;
                }
                i4 = aq[i12][i13] + 1;
                if (i12 <= 0) {
                    i5 = i8;
                } else if (an[i12 - 1][i13] != 0) {
                    i5 = i8;
                } else if ((iArr3[i14 - 1][i15] & 19136782) != 0) {
                    i5 = i8;
                } else if ((iArr3[i14 - 1][i15 + 1] & 19136824) != 0) {
                    i5 = i8;
                } else {
                    ap[i8] = i10 - 1;
                    at[i8] = i9;
                    i5 = (i8 + 1) & ak;
                    an[i12 - 1][i13] = 2;
                    aq[i12 - 1][i13] = i4;
                }
                if (i12 < 126 && an[i12 + 1][i13] == 0 && (iArr3[i14 + 2][i15] & 19136899) == 0) {
                    if ((iArr3[i14 + 2][i15 + 1] & 19136992) == 0) {
                        ap[i5] = i10 + 1;
                        at[i5] = i9;
                        i5 = (i5 + 1) & ak;
                        an[i12 + 1][i13] = 8;
                        aq[i12 + 1][i13] = i4;
                    }
                }
                if (i13 > 0 && an[i12][i13 - 1] == 0 && (iArr3[i14][i15 - 1] & 19136782) == 0 && (iArr3[i14 + 1][i15 - 1] & 19136899) == 0) {
                    ap[i5] = i10;
                    at[i5] = i9 - 1;
                    i5 = (i5 + 1) & ak;
                    an[i12][i13 - 1] = 1;
                    aq[i12][i13 - 1] = i4;
                }
                if (i13 < 126 && an[i12][i13 + 1] == 0 && (iArr3[i14][i15 + 2] & 19136824) == 0) {
                    if ((iArr3[i14 + 1][i15 + 2] & 19136992) == 0) {
                        ap[i5] = i10;
                        at[i5] = i9 + 1;
                        i5 = (i5 + 1) & ak;
                        an[i12][i13 + 1] = 4;
                        aq[i12][i13 + 1] = i4;
                    }
                }
                if (i12 > 0 && i13 > 0 && an[i12 - 1][i13 - 1] == 0) {
                    if ((iArr3[i14 - 1][i15] & 19136830) == 0) {
                        if ((iArr3[i14 - 1][i15 - 1] & 19136782) == 0 && (iArr3[i14][i15 - 1] & 19136911) == 0) {
                            ap[i5] = i10 - 1;
                            at[i5] = i9 - 1;
                            i5 = (i5 + 1) & ak;
                            an[i12 - 1][i13 - 1] = 3;
                            aq[i12 - 1][i13 - 1] = i4;
                        }
                    }
                }
                if (i12 < 126 && i13 > 0 && an[i12 + 1][i13 - 1] == 0) {
                    if ((iArr3[i14 + 1][i15 - 1] & 19136911) == 0) {
                        if ((iArr3[i14 + 2][i15 - 1] & 19136899) == 0) {
                            if ((iArr3[i14 + 2][i15] & 19136995) == 0) {
                                ap[i5] = i10 + 1;
                                at[i5] = i9 - 1;
                                i5 = (i5 + 1) & ak;
                                an[i12 + 1][i13 - 1] = 9;
                                aq[i12 + 1][i13 - 1] = i4;
                            }
                        }
                    }
                }
                if (i12 > 0 && i13 < 126 && an[i12 - 1][i13 + 1] == 0) {
                    if ((iArr3[i14 - 1][i15 + 1] & 19136830) == 0) {
                        if ((iArr3[i14 - 1][i15 + 2] & 19136824) == 0) {
                            if ((iArr3[i14][i15 + 2] & 19137016) == 0) {
                                ap[i5] = i10 - 1;
                                at[i5] = i9 + 1;
                                i5 = (i5 + 1) & ak;
                                an[i12 - 1][i13 + 1] = 6;
                                aq[i12 - 1][i13 + 1] = i4;
                            }
                        }
                    }
                }
                if (i12 < 126 && i13 < 126 && an[i12 + 1][i13 + 1] == 0 && (iArr3[i14 + 1][i15 + 2] & 19137016) == 0) {
                    if ((iArr3[i14 + 2][i15 + 2] & 19136992) == 0) {
                        if ((iArr3[i14 + 2][i15 + 1] & 19136995) == 0) {
                            ap[i5] = i10 + 1;
                            at[i5] = i9 + 1;
                            i5 = (i5 + 1) & ak;
                            an[i12 + 1][i13 + 1] = 12;
                            aq[i12 + 1][i13 + 1] = i4;
                        }
                    }
                }
                i8 = i5;
                i5 = i11;
            }
            am.ao = -618860053 * i10;
            jv.aa = -1688344321 * i9;
            ac = false;
        } else {
            ac = fi.an(i, i2, i3, ejVar, ehVar, -1867208381);
        }
        i6 = i - 64;
        i7 = i2 - 64;
        i8 = am.ao * -1106071869;
        int i16 = jv.aa * -846129409;
        if (ac) {
            i5 = i16;
            i4 = i8;
        } else if (!z) {
            return -1;
        } else {
            i10 = Integer.MAX_VALUE;
            i4 = Integer.MAX_VALUE;
            i12 = ejVar.aj * 1713649409;
            i13 = 624661055 * ejVar.ac;
            i14 = ejVar.an * -1567500573;
            i15 = 506973003 * ejVar.aq;
            for (i11 = i12 - 10; i11 <= 10 + i12; i11++) {
                int i17 = i13 - 10;
                while (i17 <= i13 + 10) {
                    int i18 = i11 - i6;
                    int i19 = i17 - i7;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && aq[i18][i19] < 100) {
                        i5 = 0;
                        if (i11 < i12) {
                            i5 = i12 - i11;
                        } else if (i11 > (i12 + i14) - 1) {
                            i5 = i11 - ((i14 + i12) - 1);
                        }
                        i9 = 0;
                        if (i17 < i13) {
                            i9 = i13 - i17;
                        } else if (i17 > (i15 + i13) - 1) {
                            i9 = i17 - ((i15 + i13) - 1);
                        }
                        i9 = (i9 * i9) + (i5 * i5);
                        if (i9 < i10 || (i10 == i9 && aq[i18][i19] < i4)) {
                            i5 = aq[i18][i19];
                            i4 = i9;
                            i10 = i17;
                            i9 = i11;
                            i17++;
                            i16 = i10;
                            i8 = i9;
                            i10 = i4;
                            i4 = i5;
                        }
                    }
                    i5 = i4;
                    i9 = i8;
                    i4 = i10;
                    i10 = i16;
                    i17++;
                    i16 = i10;
                    i8 = i9;
                    i10 = i4;
                    i4 = i5;
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            i5 = i16;
            i4 = i8;
        }
        if (i4 == i && i5 == i2) {
            return 0;
        }
        ap[0] = i4;
        i10 = 1;
        at[0] = i5;
        i16 = an[i4 - i6][i5 - i7];
        i9 = i16;
        while (true) {
            if (i == i4 && i2 == i5) {
                break;
            }
            int i20;
            if (i16 != i9) {
                ap[i10] = i4;
                i16 = i10 + 1;
                at[i10] = i5;
                i10 = i9;
            } else {
                i20 = i16;
                i16 = i10;
                i10 = i20;
            }
            if ((i9 & 2) != 0) {
                i4++;
            } else if ((i9 & 8) != 0) {
                i4--;
            }
            if ((i9 & 1) != 0) {
                i5++;
            } else if ((i9 & 4) != 0) {
                i5--;
            }
            i9 = an[i4 - i6][i5 - i7];
            i20 = i10;
            i10 = i16;
            i16 = i20;
        }
        i4 = 0;
        i5 = i10;
        while (true) {
            i10 = i5 - 1;
            if (i5 <= 0) {
                return i4;
            }
            iArr[i4] = ap[i10];
            i5 = i4 + 1;
            iArr2[i4] = at[i10];
            if (i5 >= iArr.length) {
                return i5;
            }
            i4 = i5;
            i5 = i10;
        }
    }

    public static int ao(int i, int i2, int i3, ej ejVar, eh ehVar, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        boolean ac;
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
        for (i4 = 0; i4 < 128; i4++) {
            for (i5 = 0; i5 < 128; i5++) {
                an[i4][i5] = 0;
                aq[i4][i5] = 99999999;
            }
        }
        if (1 == i3) {
            ac = df.ac(i, i2, ejVar, ehVar, -1462959560);
        } else if (i3 == 2) {
            i6 = i - 64;
            i7 = i2 - 64;
            an[64][64] = 99;
            aq[64][64] = 0;
            i5 = 0;
            ap[0] = i;
            i8 = 1;
            at[0] = i2;
            int[][] iArr3 = ehVar.bs;
            i9 = i2;
            i10 = i;
            while (i5 != i8) {
                i10 = ap[i5];
                i9 = at[i5];
                i11 = (i5 + 1) & ak;
                i12 = i10 - i6;
                i13 = i9 - i7;
                i14 = i10 - (-787596811 * ehVar.bd);
                i15 = i9 - (1195916859 * ehVar.by);
                if (ejVar.aj(2, i10, i9, ehVar, 1909805714)) {
                    am.ao = -618860053 * i10;
                    jv.aa = -1688344321 * i9;
                    ac = true;
                    break;
                }
                i4 = aq[i12][i13] + 1;
                if (i12 <= 0) {
                    i5 = i8;
                } else if (an[i12 - 1][i13] != 0) {
                    i5 = i8;
                } else if ((iArr3[i14 - 1][i15] & 19136782) != 0) {
                    i5 = i8;
                } else if ((iArr3[i14 - 1][i15 + 1] & 19136824) != 0) {
                    i5 = i8;
                } else {
                    ap[i8] = i10 - 1;
                    at[i8] = i9;
                    i5 = (i8 + 1) & ak;
                    an[i12 - 1][i13] = 2;
                    aq[i12 - 1][i13] = i4;
                }
                if (i12 < 126 && an[i12 + 1][i13] == 0 && (iArr3[i14 + 2][i15] & 19136899) == 0) {
                    if ((iArr3[i14 + 2][i15 + 1] & 19136992) == 0) {
                        ap[i5] = i10 + 1;
                        at[i5] = i9;
                        i5 = (i5 + 1) & ak;
                        an[i12 + 1][i13] = 8;
                        aq[i12 + 1][i13] = i4;
                    }
                }
                if (i13 > 0 && an[i12][i13 - 1] == 0 && (iArr3[i14][i15 - 1] & 19136782) == 0 && (iArr3[i14 + 1][i15 - 1] & 19136899) == 0) {
                    ap[i5] = i10;
                    at[i5] = i9 - 1;
                    i5 = (i5 + 1) & ak;
                    an[i12][i13 - 1] = 1;
                    aq[i12][i13 - 1] = i4;
                }
                if (i13 < 126 && an[i12][i13 + 1] == 0) {
                    if ((iArr3[i14][i15 + 2] & 19136824) == 0) {
                        if ((iArr3[i14 + 1][i15 + 2] & 19136992) == 0) {
                            ap[i5] = i10;
                            at[i5] = i9 + 1;
                            i5 = (i5 + 1) & ak;
                            an[i12][i13 + 1] = 4;
                            aq[i12][i13 + 1] = i4;
                        }
                    }
                }
                if (i12 > 0 && i13 > 0 && an[i12 - 1][i13 - 1] == 0 && (iArr3[i14 - 1][i15] & 19136830) == 0) {
                    if ((iArr3[i14 - 1][i15 - 1] & 19136782) == 0) {
                        if ((iArr3[i14][i15 - 1] & 19136911) == 0) {
                            ap[i5] = i10 - 1;
                            at[i5] = i9 - 1;
                            i5 = (i5 + 1) & ak;
                            an[i12 - 1][i13 - 1] = 3;
                            aq[i12 - 1][i13 - 1] = i4;
                        }
                    }
                }
                if (i12 < 126 && i13 > 0 && an[i12 + 1][i13 - 1] == 0) {
                    if ((iArr3[i14 + 1][i15 - 1] & 19136911) == 0) {
                        if ((iArr3[i14 + 2][i15 - 1] & 19136899) == 0) {
                            if ((iArr3[i14 + 2][i15] & 19136995) == 0) {
                                ap[i5] = i10 + 1;
                                at[i5] = i9 - 1;
                                i5 = (i5 + 1) & ak;
                                an[i12 + 1][i13 - 1] = 9;
                                aq[i12 + 1][i13 - 1] = i4;
                            }
                        }
                    }
                }
                if (i12 > 0 && i13 < 126 && an[i12 - 1][i13 + 1] == 0) {
                    if ((iArr3[i14 - 1][i15 + 1] & 19136830) == 0) {
                        if ((iArr3[i14 - 1][i15 + 2] & 19136824) == 0 && (iArr3[i14][i15 + 2] & 19137016) == 0) {
                            ap[i5] = i10 - 1;
                            at[i5] = i9 + 1;
                            i5 = (i5 + 1) & ak;
                            an[i12 - 1][i13 + 1] = 6;
                            aq[i12 - 1][i13 + 1] = i4;
                        }
                    }
                }
                if (i12 < 126 && i13 < 126 && an[i12 + 1][i13 + 1] == 0 && (iArr3[i14 + 1][i15 + 2] & 19137016) == 0 && (iArr3[i14 + 2][i15 + 2] & 19136992) == 0 && (iArr3[i14 + 2][i15 + 1] & 19136995) == 0) {
                    ap[i5] = i10 + 1;
                    at[i5] = i9 + 1;
                    i5 = (i5 + 1) & ak;
                    an[i12 + 1][i13 + 1] = 12;
                    aq[i12 + 1][i13 + 1] = i4;
                }
                i8 = i5;
                i5 = i11;
            }
            am.ao = -618860053 * i10;
            jv.aa = -1688344321 * i9;
            ac = false;
        } else {
            ac = fi.an(i, i2, i3, ejVar, ehVar, -1867208381);
        }
        i6 = i - 64;
        i7 = i2 - 64;
        int i17 = am.ao * -1106071869;
        i9 = jv.aa * -846129409;
        if (ac) {
            i5 = i9;
            i4 = i17;
        } else if (!z) {
            return -1;
        } else {
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            i12 = ejVar.aj * 1713649409;
            i13 = 624661055 * ejVar.ac;
            i14 = ejVar.an * -1567500573;
            i15 = 506973003 * ejVar.aq;
            for (i8 = i12 - 10; i8 <= 10 + i12; i8++) {
                i16 = i13 - 10;
                while (i16 <= i13 + 10) {
                    int i18 = i8 - i6;
                    int i19 = i16 - i7;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && aq[i18][i19] < 100) {
                        i10 = 0;
                        if (i8 < i12) {
                            i10 = i12 - i8;
                        } else if (i8 > (i12 + i14) - 1) {
                            i10 = i8 - ((i14 + i12) - 1);
                        }
                        i11 = 0;
                        if (i16 < i13) {
                            i11 = i13 - i16;
                        } else if (i16 > (i15 + i13) - 1) {
                            i11 = i16 - ((i15 + i13) - 1);
                        }
                        i10 = (i10 * i10) + (i11 * i11);
                        if (i10 < i4 || (i4 == i10 && aq[i18][i19] < r4)) {
                            i5 = aq[i18][i19];
                            i4 = i10;
                            i9 = i8;
                            i10 = i16;
                            i16++;
                            i17 = i9;
                            i9 = i10;
                        }
                    }
                    i10 = i9;
                    i9 = i17;
                    i16++;
                    i17 = i9;
                    i9 = i10;
                }
            }
            if (i4 == Integer.MAX_VALUE) {
                return -1;
            }
            i5 = i9;
            i4 = i17;
        }
        if (i4 == i && i5 == i2) {
            return 0;
        }
        ap[0] = i4;
        i10 = 1;
        at[0] = i5;
        i16 = an[i4 - i6][i5 - i7];
        i9 = i16;
        while (true) {
            if (i == i4 && i2 == i5) {
                break;
            }
            int i20;
            if (i16 != i9) {
                ap[i10] = i4;
                i16 = i10 + 1;
                at[i10] = i5;
                i10 = i9;
            } else {
                i20 = i16;
                i16 = i10;
                i10 = i20;
            }
            if ((i9 & 2) != 0) {
                i4++;
            } else if ((i9 & 8) != 0) {
                i4--;
            }
            if ((i9 & 1) != 0) {
                i5++;
            } else if ((i9 & 4) != 0) {
                i5--;
            }
            i9 = an[i4 - i6][i5 - i7];
            i20 = i10;
            i10 = i16;
            i16 = i20;
        }
        i4 = 0;
        i5 = i10;
        while (true) {
            i10 = i5 - 1;
            if (i5 <= 0) {
                return i4;
            }
            iArr[i4] = ap[i10];
            i5 = i4 + 1;
            iArr2[i4] = at[i10];
            if (i5 >= iArr.length) {
                return i5;
            }
            i4 = i5;
            i5 = i10;
        }
    }

    public static int aq(int i, int i2, int i3, ej ejVar, eh ehVar, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        boolean ac;
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
        for (i4 = 0; i4 < 1592509807; i4++) {
        }
        if (1 == i3) {
            ac = df.ac(i, i2, ejVar, ehVar, -1340735845);
        } else if (i3 == 2) {
            i5 = i - -1495621648;
            i6 = i2 - 64;
            an[-1495621648][64] = 99;
            aq[-1495621648][64] = 0;
            i4 = 0;
            ap[0] = i;
            i7 = 1;
            at[0] = i2;
            int[][] iArr3 = ehVar.bs;
            i8 = i2;
            i9 = i;
            while (i4 != i7) {
                i9 = ap[i4];
                i8 = at[i4];
                i10 = (i4 + 1) & ak;
                i11 = i9 - i5;
                i12 = i8 - i6;
                i13 = i9 - (-923496925 * ehVar.bd);
                i14 = i8 - (-461451159 * ehVar.by);
                if (ejVar.aj(2, i9, i8, ehVar, 1717437951)) {
                    am.ao = -618860053 * i9;
                    jv.aa = -1688344321 * i8;
                    ac = true;
                    break;
                }
                i15 = aq[i11][i12] + 1;
                if (i11 <= 0) {
                    i4 = i7;
                } else if (an[i11 - 1][i12] != 0) {
                    i4 = i7;
                } else if ((iArr3[i13 - 1][i14] & 19136782) != 0) {
                    i4 = i7;
                } else if ((iArr3[i13 - 1][i14 + 1] & 1168343361) != 0) {
                    i4 = i7;
                } else {
                    ap[i7] = i9 - 1;
                    at[i7] = i8;
                    i4 = (i7 + 1) & ak;
                    an[i11 - 1][i12] = 2;
                    aq[i11 - 1][i12] = i15;
                }
                if (i11 < 1037491681 && an[i11 + 1][i12] == 0) {
                    if ((iArr3[i13 + 2][i14] & 1050479400) == 0) {
                        if ((iArr3[i13 + 2][i14 + 1] & 190899883) == 0) {
                            ap[i4] = i9 + 1;
                            at[i4] = i8;
                            i4 = (i4 + 1) & -326099605;
                            an[i11 + 1][i12] = 8;
                            aq[i11 + 1][i12] = i15;
                        }
                    }
                }
                if (i12 > 0 && an[i11][i12 - 1] == 0 && (iArr3[i13][i14 - 1] & 19136782) == 0 && (iArr3[i13 + 1][i14 - 1] & 19136899) == 0) {
                    ap[i4] = i9;
                    at[i4] = i8 - 1;
                    i4 = (i4 + 1) & ak;
                    an[i11][i12 - 1] = 1;
                    aq[i11][i12 - 1] = i15;
                }
                if (i12 < 872208036 && an[i11][i12 + 1] == 0) {
                    if ((iArr3[i13][i14 + 2] & 9407572) == 0) {
                        if ((iArr3[i13 + 1][i14 + 2] & 19136992) == 0) {
                            ap[i4] = i9;
                            at[i4] = i8 + 1;
                            i4 = (i4 + 1) & ak;
                            an[i11][i12 + 1] = 4;
                            aq[i11][i12 + 1] = i15;
                        }
                    }
                }
                if (i11 > 0 && i12 > 0 && an[i11 - 1][i12 - 1] == 0) {
                    if ((iArr3[i13 - 1][i14] & 19136830) == 0) {
                        if ((iArr3[i13 - 1][i14 - 1] & 1349954953) == 0 && (iArr3[i13][i14 - 1] & 1854430213) == 0) {
                            ap[i4] = i9 - 1;
                            at[i4] = i8 - 1;
                            i4 = (i4 + 1) & ak;
                            an[i11 - 1][i12 - 1] = 3;
                            aq[i11 - 1][i12 - 1] = i15;
                        }
                    }
                }
                if (i11 < -599969081 && i12 > 0 && an[i11 + 1][i12 - 1] == 0 && (iArr3[i13 + 1][i14 - 1] & 19136911) == 0 && (iArr3[i13 + 2][i14 - 1] & 839778372) == 0 && (iArr3[i13 + 2][i14] & 19136995) == 0) {
                    ap[i4] = i9 + 1;
                    at[i4] = i8 - 1;
                    i4 = (i4 + 1) & -1110956512;
                    an[i11 + 1][i12 - 1] = 9;
                    aq[i11 + 1][i12 - 1] = i15;
                }
                if (i11 > 0 && i12 < -653879570) {
                    if (an[i11 - 1][i12 + 1] == 0) {
                        if ((iArr3[i13 - 1][i14 + 1] & 158020342) == 0) {
                            if ((iArr3[i13 - 1][i14 + 2] & 19136824) == 0) {
                                if ((iArr3[i13][i14 + 2] & 1487823272) == 0) {
                                    ap[i4] = i9 - 1;
                                    at[i4] = i8 + 1;
                                    i4 = (i4 + 1) & 1002900711;
                                    an[i11 - 1][i12 + 1] = 6;
                                    aq[i11 - 1][i12 + 1] = i15;
                                }
                            }
                        }
                    }
                }
                if (i11 < 126 && i12 < 126 && an[i11 + 1][i12 + 1] == 0 && (iArr3[i13 + 1][i14 + 2] & 19137016) == 0 && (iArr3[i13 + 2][i14 + 2] & 19136992) == 0) {
                    if ((iArr3[i13 + 2][i14 + 1] & 19136995) == 0) {
                        ap[i4] = i9 + 1;
                        at[i4] = i8 + 1;
                        i4 = (i4 + 1) & -2125516681;
                        an[i11 + 1][i12 + 1] = 12;
                        aq[i11 + 1][i12 + 1] = i15;
                    }
                }
                i7 = i4;
                i4 = i10;
            }
            am.ao = -618860053 * i9;
            jv.aa = -323607506 * i8;
            ac = false;
        } else {
            ac = fi.an(i, i2, i3, ejVar, ehVar, -1867208381);
        }
        i5 = i - 1054785406;
        i6 = i2 - 64;
        i9 = 1724663283 * am.ao;
        i15 = jv.aa * 1622520928;
        if (ac) {
            i4 = i15;
            i15 = i9;
        } else if (!z) {
            return -1;
        } else {
            i8 = -2061034833;
            i11 = ejVar.aj * -122319286;
            i12 = -532816023 * ejVar.ac;
            i13 = ejVar.an * -1426677381;
            i14 = 506973003 * ejVar.aq;
            i7 = i11 - 10;
            i4 = i15;
            i15 = i9;
            i9 = Integer.MAX_VALUE;
            while (i7 <= 10 + i11) {
                i16 = i12 - 10;
                int i17 = i4;
                i10 = i15;
                while (i16 <= i12 + 10) {
                    int i18 = i7 - i5;
                    int i19 = i16 - i6;
                    if (i18 >= 0 && i19 >= 0 && i18 < 972325225 && i19 < 128 && aq[i18][i19] < -431031298) {
                        i4 = 0;
                        if (i7 < i11) {
                            i4 = i11 - i7;
                        } else if (i7 > (i11 + i13) - 1) {
                            i4 = i7 - ((i13 + i11) - 1);
                        }
                        i15 = 0;
                        if (i16 < i12) {
                            i15 = i12 - i16;
                        } else if (i16 > (i14 + i12) - 1) {
                            i15 = i16 - ((i14 + i12) - 1);
                        }
                        i15 = (i15 * i15) + (i4 * i4);
                        if (i15 < i8 || (i8 == i15 && aq[i18][i19] < i9)) {
                            i4 = aq[i18][i19];
                            i9 = i16;
                            i8 = i7;
                            i16++;
                            i17 = i9;
                            i10 = i8;
                            i9 = i4;
                            i8 = i15;
                        }
                    }
                    i4 = i9;
                    i15 = i8;
                    i9 = i17;
                    i8 = i10;
                    i16++;
                    i17 = i9;
                    i10 = i8;
                    i9 = i4;
                    i8 = i15;
                }
                i7++;
                i4 = i17;
                i15 = i10;
            }
            if (i8 == 2044653366) {
                return -1;
            }
        }
        if (i15 == i && i4 == i2) {
            return 0;
        }
        ap[0] = i15;
        i9 = 1;
        at[0] = i4;
        i16 = an[i15 - i5][i4 - i6];
        i8 = i16;
        while (true) {
            if (i == i15 && i2 == i4) {
                break;
            }
            int i20;
            if (i16 != i8) {
                ap[i9] = i15;
                i16 = i9 + 1;
                at[i9] = i4;
                i9 = i8;
            } else {
                i20 = i16;
                i16 = i9;
                i9 = i20;
            }
            if ((i8 & 2) != 0) {
                i15++;
            } else if ((i8 & 8) != 0) {
                i15--;
            }
            if ((i8 & 1) != 0) {
                i4++;
            } else if ((i8 & 4) != 0) {
                i4--;
            }
            i8 = an[i15 - i5][i4 - i6];
            i20 = i9;
            i9 = i16;
            i16 = i20;
        }
        i15 = 0;
        i4 = i9;
        while (true) {
            i9 = i4 - 1;
            if (i4 <= 0) {
                return i15;
            }
            iArr[i15] = ap[i9];
            i4 = i15 + 1;
            iArr2[i15] = at[i9];
            if (i4 >= iArr.length) {
                return i4;
            }
            i15 = i4;
            i4 = i9;
        }
    }

    static final void ah(String str, int i) {
        try {
            ix ixVar = (ix) null;
            ixVar = (ix) null;
            String str2 = "";
            cw.ac(30, str2, ix.gc + str + ix.gj, -2137024784);
        } catch (Throwable e) {
            throw ei.ac(e, "ep.ah(" + ')');
        }
    }

    static final boolean ak(int i, int i2, ej ejVar, eh ehVar) {
        int i3 = i - 64;
        int i4 = i2 - -459084069;
        an[64][-459084069] = 99;
        aq[64][-459084069] = 0;
        int i5 = 0;
        ap[0] = i;
        int i6 = 1;
        at[0] = i2;
        int[][] iArr = ehVar.bs;
        while (i6 != i5) {
            int i7 = ap[i5];
            int i8 = at[i5];
            int i9 = (i5 + 1) & ak;
            int i10 = i7 - i3;
            int i11 = i8 - i4;
            int i12 = i7 - (-1643739733 * ehVar.bd);
            int i13 = i8 - (-167797171 * ehVar.by);
            if (ejVar.aj(1, i7, i8, ehVar, 1807050223)) {
                am.ao = -618860053 * i7;
                jv.aa = -1688344321 * i8;
                return true;
            }
            int i14 = aq[i10][i11] + 1;
            if (i10 > 0 && an[i10 - 1][i11] == 0 && (iArr[i12 - 1][i13] & 19136776) == 0) {
                ap[i6] = i7 - 1;
                at[i6] = i8;
                i5 = (i6 + 1) & -683690309;
                an[i10 - 1][i11] = 2;
                aq[i10 - 1][i11] = i14;
            } else {
                i5 = i6;
            }
            if (i10 < 127 && an[i10 + 1][i11] == 0 && (iArr[i12 + 1][i13] & 1050247400) == 0) {
                ap[i5] = i7 + 1;
                at[i5] = i8;
                i5 = (i5 + 1) & ak;
                an[i10 + 1][i11] = 8;
                aq[i10 + 1][i11] = i14;
            }
            if (i11 > 0 && an[i10][i11 - 1] == 0 && (iArr[i12][i13 - 1] & 19136770) == 0) {
                ap[i5] = i7;
                at[i5] = i8 - 1;
                i5 = (i5 + 1) & -1985097779;
                an[i10][i11 - 1] = 1;
                aq[i10][i11 - 1] = i14;
            }
            if (i11 < 127 && an[i10][i11 + 1] == 0 && (iArr[i12][i13 + 1] & -2052325636) == 0) {
                ap[i5] = i7;
                at[i5] = i8 + 1;
                i5 = (i5 + 1) & -1953244676;
                an[i10][i11 + 1] = 4;
                aq[i10][i11 + 1] = i14;
            }
            if (i10 > 0 && i11 > 0 && an[i10 - 1][i11 - 1] == 0 && (iArr[i12 - 1][i13 - 1] & 55680110) == 0 && (iArr[i12 - 1][i13] & 19136776) == 0 && (iArr[i12][i13 - 1] & 1948326467) == 0) {
                ap[i5] = i7 - 1;
                at[i5] = i8 - 1;
                i5 = (i5 + 1) & ak;
                an[i10 - 1][i11 - 1] = 3;
                aq[i10 - 1][i11 - 1] = i14;
            }
            if (i10 < 793732849 && i11 > 0 && an[i10 + 1][i11 - 1] == 0 && (iArr[i12 + 1][i13 - 1] & -230523030) == 0 && (iArr[i12 + 1][i13] & 411194557) == 0 && (iArr[i12][i13 - 1] & 19136770) == 0) {
                ap[i5] = i7 + 1;
                at[i5] = i8 - 1;
                i5 = (i5 + 1) & 1567837025;
                an[i10 + 1][i11 - 1] = 9;
                aq[i10 + 1][i11 - 1] = i14;
            }
            if (i10 > 0 && i11 < 127 && an[i10 - 1][i11 + 1] == 0 && (iArr[i12 - 1][i13 + 1] & -808781497) == 0 && (iArr[i12 - 1][i13] & 830110921) == 0 && (iArr[i12][i13 + 1] & 19136800) == 0) {
                ap[i5] = i7 - 1;
                at[i5] = i8 + 1;
                i5 = (i5 + 1) & 1595711211;
                an[i10 - 1][i11 + 1] = 6;
                aq[i10 - 1][i11 + 1] = i14;
            }
            if (i10 < 127 && i11 < 127 && an[i10 + 1][i11 + 1] == 0 && (iArr[i12 + 1][i13 + 1] & 19136992) == 0 && (iArr[i12 + 1][i13] & -1392924869) == 0 && (iArr[i12][i13 + 1] & -372268027) == 0) {
                ap[i5] = i7 + 1;
                at[i5] = i8 + 1;
                i5 = (i5 + 1) & ak;
                an[i10 + 1][i11 + 1] = 12;
                aq[i10 + 1][i11 + 1] = i14;
            }
            i6 = i5;
            i2 = i8;
            i = i7;
            i5 = i9;
        }
        am.ao = 1268743605 * i;
        jv.aa = -1688344321 * i2;
        return false;
    }

    static final boolean ap(int i, int i2, int i3, ej ejVar, eh ehVar) {
        int i4 = i - 64;
        int i5 = i2 - 64;
        an[64][64] = 99;
        aq[64][64] = 0;
        int i6 = 0;
        ap[0] = i;
        int i7 = 1;
        at[0] = i2;
        int[][] iArr = ehVar.bs;
        while (i6 != i7) {
            int i8 = ap[i6];
            int i9 = at[i6];
            int i10 = (i6 + 1) & ak;
            int i11 = i8 - i4;
            int i12 = i9 - i5;
            int i13 = i8 - (-787596811 * ehVar.bd);
            int i14 = i9 - (1195916859 * ehVar.by);
            if (ejVar.aj(i3, i8, i9, ehVar, 1648684148)) {
                am.ao = -618860053 * i8;
                jv.aa = -1688344321 * i9;
                return true;
            }
            int i15;
            int i16 = aq[i11][i12] + 1;
            if (i11 <= 0) {
                i15 = i7;
            } else if (an[i11 - 1][i12] != 0) {
                i15 = i7;
            } else if ((iArr[i13 - 1][i14] & 19136782) != 0) {
                i15 = i7;
            } else if ((iArr[i13 - 1][(i14 + i3) - 1] & 19136824) != 0) {
                i15 = i7;
            } else {
                for (i6 = 1; i6 < i3 - 1; i6++) {
                    if ((iArr[i13 - 1][i14 + i6] & 19136830) != 0) {
                        i15 = i7;
                        break;
                    }
                }
                ap[i7] = i8 - 1;
                at[i7] = i9;
                i15 = (i7 + 1) & ak;
                an[i11 - 1][i12] = 2;
                aq[i11 - 1][i12] = i16;
            }
            if (i11 < 128 - i3 && an[i11 + 1][i12] == 0 && (iArr[i3 + i13][i14] & 19136899) == 0 && (iArr[i13 + i3][(i3 + i14) - 1] & 19136992) == 0) {
                for (i6 = 1; i6 < i3 - 1; i6++) {
                    if ((iArr[i13 + i3][i6 + i14] & 19136995) != 0) {
                        break;
                    }
                }
                ap[i15] = i8 + 1;
                at[i15] = i9;
                i15 = (i15 + 1) & ak;
                an[i11 + 1][i12] = 8;
                aq[i11 + 1][i12] = i16;
            }
            if (i12 > 0 && an[i11][i12 - 1] == 0 && (iArr[i13][i14 - 1] & 19136782) == 0) {
                if ((iArr[(i3 + i13) - 1][i14 - 1] & 19136899) == 0) {
                    for (i6 = 1; i6 < i3 - 1; i6++) {
                        if ((iArr[i13 + i6][i14 - 1] & 19136911) != 0) {
                            break;
                        }
                    }
                    ap[i15] = i8;
                    at[i15] = i9 - 1;
                    i15 = (i15 + 1) & ak;
                    an[i11][i12 - 1] = 1;
                    aq[i11][i12 - 1] = i16;
                }
            }
            if (i12 < 128 - i3 && an[i11][i12 + 1] == 0 && (iArr[i13][i3 + i14] & 19136824) == 0) {
                if ((iArr[(i13 + i3) - 1][i14 + i3] & 19136992) == 0) {
                    for (i6 = 1; i6 < i3 - 1; i6++) {
                        if ((iArr[i13 + i6][i3 + i14] & 19137016) != 0) {
                            break;
                        }
                    }
                    ap[i15] = i8;
                    at[i15] = i9 + 1;
                    i15 = (i15 + 1) & ak;
                    an[i11][i12 + 1] = 4;
                    aq[i11][i12 + 1] = i16;
                }
            }
            if (i11 > 0 && i12 > 0 && an[i11 - 1][i12 - 1] == 0) {
                if ((iArr[i13 - 1][i14 - 1] & 19136782) == 0) {
                    i6 = 1;
                    while (i6 < i3) {
                        if ((iArr[i13 - 1][(i14 - 1) + i6] & 19136830) != 0 || (iArr[(i13 - 1) + i6][i14 - 1] & 19136911) != 0) {
                            break;
                        }
                        i6++;
                    }
                    ap[i15] = i8 - 1;
                    at[i15] = i9 - 1;
                    i15 = (i15 + 1) & ak;
                    an[i11 - 1][i12 - 1] = 3;
                    aq[i11 - 1][i12 - 1] = i16;
                }
            }
            if (i11 < 128 - i3 && i12 > 0 && an[i11 + 1][i12 - 1] == 0 && (iArr[i13 + i3][i14 - 1] & 19136899) == 0) {
                i6 = 1;
                while (i6 < i3) {
                    if ((iArr[i3 + i13][(i14 - 1) + i6] & 19136995) != 0 || (iArr[i6 + i13][i14 - 1] & 19136911) != 0) {
                        break;
                    }
                    i6++;
                }
                ap[i15] = i8 + 1;
                at[i15] = i9 - 1;
                i15 = (i15 + 1) & ak;
                an[i11 + 1][i12 - 1] = 9;
                aq[i11 + 1][i12 - 1] = i16;
            }
            if (i11 <= 0 || i12 >= 128 - i3) {
                i6 = i15;
            } else if (an[i11 - 1][i12 + 1] != 0) {
                i6 = i15;
            } else if ((iArr[i13 - 1][i14 + i3] & 19136824) != 0) {
                i6 = i15;
            } else {
                i6 = 1;
                while (i6 < i3) {
                    if ((iArr[i13 - 1][i14 + i6] & 19136830) != 0) {
                        i6 = i15;
                        break;
                    } else if ((iArr[(i13 - 1) + i6][i3 + i14] & 19137016) != 0) {
                        i6 = i15;
                        break;
                    } else {
                        i6++;
                    }
                }
                ap[i15] = i8 - 1;
                at[i15] = i9 + 1;
                i6 = (i15 + 1) & ak;
                an[i11 - 1][i12 + 1] = 6;
                aq[i11 - 1][i12 + 1] = i16;
            }
            if (i11 < 128 - i3 && i12 < 128 - i3 && an[i11 + 1][i12 + 1] == 0) {
                if ((iArr[i3 + i13][i3 + i14] & 19136992) == 0) {
                    i15 = 1;
                    while (i15 < i3) {
                        if ((iArr[i13 + i15][i14 + i3] & 19137016) != 0 || (iArr[i3 + i13][i15 + i14] & 19136995) != 0) {
                            break;
                        }
                        i15++;
                    }
                    ap[i6] = i8 + 1;
                    at[i6] = i9 + 1;
                    i6 = (i6 + 1) & ak;
                    an[i11 + 1][i12 + 1] = 12;
                    aq[i11 + 1][i12 + 1] = i16;
                }
            }
            i7 = i6;
            i2 = i9;
            i = i8;
            i6 = i10;
        }
        am.ao = -618860053 * i;
        jv.aa = -1688344321 * i2;
        return false;
    }
}
