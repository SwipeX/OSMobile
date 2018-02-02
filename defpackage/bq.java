package defpackage;

public final class bq {
    public static final int ah = 256;
    public static final int ai = 2048;
    static final int ap = 2;
    static final int az = 10;
    static final int bg = 49;
    static ag ns;
    boolean aa;
    int ac;
    int aj;
    int ak;
    int an;
    int ao;
    int aq;

    bq(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        try {
            this.aa = true;
            this.aj = -115454131 * i;
            this.ac = 1422196165 * i2;
            this.an = -1760481071 * i3;
            this.aq = -359553485 * i4;
            this.ao = 56542061 * i5;
            this.ak = -1379924957 * i6;
            this.aa = z;
        } catch (Throwable e) {
            throw ei.ac(e, "bq.<init>(" + ')');
        }
    }

    public static int aj(int i, int i2, int i3, ej ejVar, eh ehVar, boolean z, int[] iArr, int[] iArr2, byte b) {
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
        for (i4 = 0; i4 < cj.ak; i4++) {
            int i16 = 0;
            while (i16 < cj.ak) {
                try {
                    ep.an[i4][i16] = 0;
                    ep.aq[i4][i16] = 99999999;
                    i16++;
                } catch (Throwable e) {
                    throw ei.ac(e, "bq.aj(" + ')');
                }
            }
        }
        if (1 == i3) {
            ac = df.ac(i, i2, ejVar, ehVar, 1704476015);
        } else if (i3 == 2) {
            i5 = i - 64;
            i6 = i2 - 64;
            ep.an[64][64] = 99;
            ep.aq[64][64] = 0;
            i16 = 0;
            ep.ap[0] = i;
            i7 = 1;
            ep.at[0] = i2;
            int[][] iArr3 = ehVar.bs;
            i8 = i2;
            i9 = i;
            while (i16 != i7) {
                i9 = ep.ap[i16];
                i8 = ep.at[i16];
                i10 = (i16 + 1) & 4095;
                i11 = i9 - i5;
                i12 = i8 - i6;
                i13 = i9 - (-787596811 * ehVar.bd);
                i14 = i8 - (1195916859 * ehVar.by);
                if (ejVar.aj(2, i9, i8, ehVar, 1700670023)) {
                    am.ao = -618860053 * i9;
                    jv.aa = -1688344321 * i8;
                    ac = true;
                    break;
                }
                i4 = ep.aq[i11][i12] + 1;
                if (i11 <= 0) {
                    i16 = i7;
                } else if (ep.an[i11 - 1][i12] != 0) {
                    i16 = i7;
                } else if ((iArr3[i13 - 1][i14] & 19136782) != 0) {
                    i16 = i7;
                } else if ((iArr3[i13 - 1][i14 + 1] & 19136824) != 0) {
                    i16 = i7;
                } else {
                    ep.ap[i7] = i9 - 1;
                    ep.at[i7] = i8;
                    i16 = (i7 + 1) & 4095;
                    ep.an[i11 - 1][i12] = 2;
                    ep.aq[i11 - 1][i12] = i4;
                }
                if (i11 < 126 && ep.an[i11 + 1][i12] == 0 && (iArr3[i13 + 2][i14] & 19136899) == 0) {
                    if ((iArr3[i13 + 2][i14 + 1] & 19136992) == 0) {
                        ep.ap[i16] = i9 + 1;
                        ep.at[i16] = i8;
                        i16 = (i16 + 1) & 4095;
                        ep.an[i11 + 1][i12] = 8;
                        ep.aq[i11 + 1][i12] = i4;
                    }
                }
                if (i12 > 0 && ep.an[i11][i12 - 1] == 0 && (iArr3[i13][i14 - 1] & 19136782) == 0) {
                    if ((iArr3[i13 + 1][i14 - 1] & 19136899) == 0) {
                        ep.ap[i16] = i9;
                        ep.at[i16] = i8 - 1;
                        i16 = (i16 + 1) & 4095;
                        ep.an[i11][i12 - 1] = 1;
                        ep.aq[i11][i12 - 1] = i4;
                    }
                }
                if (i12 < 126 && ep.an[i11][i12 + 1] == 0 && (iArr3[i13][i14 + 2] & 19136824) == 0 && (iArr3[i13 + 1][i14 + 2] & 19136992) == 0) {
                    ep.ap[i16] = i9;
                    ep.at[i16] = i8 + 1;
                    i16 = (i16 + 1) & 4095;
                    ep.an[i11][i12 + 1] = 4;
                    ep.aq[i11][i12 + 1] = i4;
                }
                if (i11 > 0 && i12 > 0 && ep.an[i11 - 1][i12 - 1] == 0) {
                    if ((iArr3[i13 - 1][i14] & 19136830) == 0) {
                        if ((iArr3[i13 - 1][i14 - 1] & 19136782) == 0) {
                            if ((iArr3[i13][i14 - 1] & 19136911) == 0) {
                                ep.ap[i16] = i9 - 1;
                                ep.at[i16] = i8 - 1;
                                i16 = (i16 + 1) & 4095;
                                ep.an[i11 - 1][i12 - 1] = 3;
                                ep.aq[i11 - 1][i12 - 1] = i4;
                            }
                        }
                    }
                }
                if (i11 < 126 && i12 > 0 && ep.an[i11 + 1][i12 - 1] == 0) {
                    if ((iArr3[i13 + 1][i14 - 1] & 19136911) == 0) {
                        if ((iArr3[i13 + 2][i14 - 1] & 19136899) == 0 && (iArr3[i13 + 2][i14] & 19136995) == 0) {
                            ep.ap[i16] = i9 + 1;
                            ep.at[i16] = i8 - 1;
                            i16 = (i16 + 1) & 4095;
                            ep.an[i11 + 1][i12 - 1] = 9;
                            ep.aq[i11 + 1][i12 - 1] = i4;
                        }
                    }
                }
                if (i11 > 0 && i12 < 126 && ep.an[i11 - 1][i12 + 1] == 0 && (iArr3[i13 - 1][i14 + 1] & 19136830) == 0 && (iArr3[i13 - 1][i14 + 2] & 19136824) == 0) {
                    if ((iArr3[i13][i14 + 2] & 19137016) == 0) {
                        ep.ap[i16] = i9 - 1;
                        ep.at[i16] = i8 + 1;
                        i16 = (i16 + 1) & 4095;
                        ep.an[i11 - 1][i12 + 1] = 6;
                        ep.aq[i11 - 1][i12 + 1] = i4;
                    }
                }
                if (i11 < 126 && i12 < 126 && ep.an[i11 + 1][i12 + 1] == 0 && (iArr3[i13 + 1][i14 + 2] & 19137016) == 0 && (iArr3[i13 + 2][i14 + 2] & 19136992) == 0) {
                    if ((iArr3[i13 + 2][i14 + 1] & 19136995) == 0) {
                        ep.ap[i16] = i9 + 1;
                        ep.at[i16] = i8 + 1;
                        i16 = (i16 + 1) & 4095;
                        ep.an[i11 + 1][i12 + 1] = 12;
                        ep.aq[i11 + 1][i12 + 1] = i4;
                    }
                }
                i7 = i16;
                i16 = i10;
            }
            am.ao = -618860053 * i9;
            jv.aa = -1688344321 * i8;
            ac = false;
        } else {
            ac = fi.an(i, i2, i3, ejVar, ehVar, -1867208381);
        }
        i5 = i - 64;
        i6 = i2 - 64;
        i7 = am.ao * -1106071869;
        int i17 = jv.aa * -846129409;
        if (ac) {
            i4 = i17;
            i9 = i7;
        } else if (!z) {
            return -1;
        } else {
            i9 = Integer.MAX_VALUE;
            i16 = Integer.MAX_VALUE;
            i11 = ejVar.aj * 1713649409;
            i12 = 624661055 * ejVar.ac;
            i13 = ejVar.an * -1567500573;
            i14 = 506973003 * ejVar.aq;
            for (i15 = i11 - 10; i15 <= 10 + i11; i15++) {
                i8 = i12 - 10;
                while (i8 <= i12 + 10) {
                    int i18 = i15 - i5;
                    int i19 = i8 - i6;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && ep.aq[i18][i19] < 100) {
                        i4 = 0;
                        if (i15 < i11) {
                            i4 = i11 - i15;
                        } else if (i15 > (i11 + i13) - 1) {
                            i4 = i15 - ((i13 + i11) - 1);
                        }
                        i10 = 0;
                        if (i8 < i12) {
                            i10 = i12 - i8;
                        } else if (i8 > (i14 + i12) - 1) {
                            i10 = i8 - ((i14 + i12) - 1);
                        }
                        i4 = (i4 * i4) + (i10 * i10);
                        if (i4 < i9 || (i9 == i4 && ep.aq[i18][i19] < r4)) {
                            i16 = ep.aq[i18][i19];
                            i9 = i8;
                            i17 = i15;
                            i8++;
                            i7 = i17;
                            i17 = i9;
                            i9 = i4;
                        }
                    }
                    i4 = i9;
                    i9 = i17;
                    i17 = i7;
                    i8++;
                    i7 = i17;
                    i17 = i9;
                    i9 = i4;
                }
            }
            if (i9 == Integer.MAX_VALUE) {
                return -1;
            }
            i4 = i17;
            i9 = i7;
        }
        if (i9 == i && i4 == i2) {
            return 0;
        }
        ep.ap[0] = i9;
        i16 = 1;
        ep.at[0] = i4;
        i8 = ep.an[i9 - i5][i4 - i6];
        i17 = i8;
        while (true) {
            if (i == i9 && i2 == i4) {
                break;
            }
            if (i8 != i17) {
                ep.ap[i16] = i9;
                i8 = i16 + 1;
                ep.at[i16] = i4;
                i15 = i8;
                i8 = i17;
            } else {
                i15 = i16;
            }
            if ((i17 & 2) != 0) {
                i9++;
            } else if ((i17 & 8) != 0) {
                i9--;
            }
            if ((i17 & 1) != 0) {
                i16 = i4 + 1;
            } else if ((i17 & 4) != 0) {
                i16 = i4 - 1;
            } else {
                i16 = i4;
            }
            i17 = ep.an[i9 - i5][i16 - i6];
            i4 = i16;
            i16 = i15;
        }
        i4 = 0;
        while (true) {
            i9 = i16 - 1;
            if (i16 <= 0) {
                return i4;
            }
            iArr[i4] = ep.ap[i9];
            i16 = i4 + 1;
            iArr2[i4] = ep.at[i9];
            if (i16 >= iArr.length) {
                return i16;
            }
            i4 = i16;
            i16 = i9;
        }
    }

    public static boolean ao(int i, int i2) {
        return ((i >> 30) & 1) != 0;
    }

    public static char ac(char c, int i) {
        if (c == 'Æ') {
            return 'E';
        }
        if (c == 'æ') {
            return 'e';
        }
        if ('ß' == c) {
            return 's';
        }
        if ('Œ' == c) {
            return 'E';
        }
        if (c == 'œ') {
            return 'e';
        }
        return '\u0000';
    }
}
