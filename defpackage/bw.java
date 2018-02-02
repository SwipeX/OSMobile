package defpackage;

public final class bw {
    static int[] af = new int[6];
    static int[] al = new int[6];
    static int[] au = new int[6];
    static final int[][] av = new int[][]{new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 2, 6}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 13, 14}};
    static int[] ax = new int[6];
    static final int[][] ay = new int[][]{new int[]{0, 1, 2, 3, 0, 0, 1, 3}, new int[]{1, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, new int[]{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, new int[]{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, new int[]{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, new int[]{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    static int[] az = new int[6];
    int[] aa;
    int[] ac;
    int ae;
    int[] ah;
    boolean ai = true;
    int[] aj;
    int[] ak;
    int am;
    int[] an;
    int[] ao;
    int[] ap;
    int[] aq;
    int as;
    int[] at;
    int aw;

    bw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        if (!(i6 == i7 && i6 == i8 && i6 == i9)) {
            this.ai = false;
        }
        this.aw = i;
        this.am = i2;
        this.ae = i18;
        this.as = i19;
        int[] iArr = av[i];
        int length = iArr.length;
        this.aj = new int[length];
        this.ac = new int[length];
        this.an = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i25 = i4 * cj.ak;
        int i26 = i5 * cj.ak;
        for (i20 = 0; i20 < length; i20++) {
            int i27;
            i21 = iArr[i20];
            if ((i21 & 1) == 0 && i21 <= 8) {
                i21 = ((((i21 - i2) - i2) - 1) & 7) + 1;
            }
            if (i21 > 8 && i21 <= 12) {
                i21 = (((i21 - 9) - i2) & 3) + 9;
            }
            if (i21 > 12 && i21 <= 16) {
                i21 = (((i21 - 13) - i2) & 3) + 13;
            }
            if (i21 == 1) {
                i21 = i14;
                i22 = i10;
                i23 = i6;
                i24 = i26;
                i27 = i25;
            } else if (i21 == 2) {
                i23 = (i6 + i7) >> 1;
                i22 = (i10 + i11) >> 1;
                i21 = (i14 + i15) >> 1;
                i27 = i25 + 64;
                i24 = i26;
            } else if (i21 == 3) {
                i22 = i11;
                i23 = i7;
                i24 = i26;
                i27 = i25 + cj.ak;
                i21 = i15;
            } else if (i21 == 4) {
                i27 = i25 + cj.ak;
                i24 = i26 + 64;
                i23 = (i7 + i8) >> 1;
                i22 = (i11 + i12) >> 1;
                i21 = (i15 + i16) >> 1;
            } else if (i21 == 5) {
                i23 = i8;
                i24 = i26 + cj.ak;
                i27 = i25 + cj.ak;
                i22 = i12;
                i21 = i16;
            } else if (i21 == 6) {
                i27 = i25 + 64;
                i24 = i26 + cj.ak;
                i23 = (i8 + i9) >> 1;
                i22 = (i12 + i13) >> 1;
                i21 = (i16 + i17) >> 1;
            } else if (i21 == 7) {
                i22 = i13;
                i23 = i9;
                i24 = i26 + cj.ak;
                i27 = i25;
                i21 = i17;
            } else if (i21 == 8) {
                i24 = i26 + 64;
                i23 = (i9 + i6) >> 1;
                i22 = (i13 + i10) >> 1;
                i21 = (i17 + i14) >> 1;
                i27 = i25;
            } else if (i21 == 9) {
                i27 = i25 + 64;
                i24 = i26 + 32;
                i23 = (i6 + i7) >> 1;
                i22 = (i10 + i11) >> 1;
                i21 = (i14 + i15) >> 1;
            } else if (i21 == 10) {
                i27 = i25 + 96;
                i24 = i26 + 64;
                i23 = (i7 + i8) >> 1;
                i22 = (i11 + i12) >> 1;
                i21 = (i15 + i16) >> 1;
            } else if (i21 == 11) {
                i27 = i25 + 64;
                i24 = i26 + 96;
                i23 = (i8 + i9) >> 1;
                i22 = (i12 + i13) >> 1;
                i21 = (i16 + i17) >> 1;
            } else if (i21 == 12) {
                i27 = i25 + 32;
                i24 = i26 + 64;
                i23 = (i9 + i6) >> 1;
                i22 = (i13 + i10) >> 1;
                i21 = (i17 + i14) >> 1;
            } else if (i21 == 13) {
                i23 = i6;
                i24 = i26 + 32;
                i27 = i25 + 32;
                i22 = i10;
                i21 = i14;
            } else if (i21 == 14) {
                i23 = i7;
                i24 = i26 + 32;
                i27 = i25 + 96;
                i22 = i11;
                i21 = i15;
            } else if (i21 == 15) {
                i23 = i8;
                i24 = i26 + 96;
                i27 = i25 + 96;
                i22 = i12;
                i21 = i16;
            } else {
                i23 = i9;
                i24 = i26 + 96;
                i27 = i25 + 32;
                i22 = i13;
                i21 = i17;
            }
            this.aj[i20] = i27;
            this.ac[i20] = i23;
            this.an[i20] = i24;
            iArr2[i20] = i22;
            iArr3[i20] = i21;
        }
        int[] iArr4 = ay[i];
        i25 = iArr4.length / 4;
        this.ak = new int[i25];
        this.ap = new int[i25];
        this.at = new int[i25];
        this.aq = new int[i25];
        this.ao = new int[i25];
        this.aa = new int[i25];
        if (i3 != -1) {
            this.ah = new int[i25];
        }
        i26 = 0;
        for (i24 = 0; i24 < i25; i24++) {
            i20 = iArr4[i26];
            i23 = iArr4[i26 + 1];
            i22 = iArr4[i26 + 2];
            i21 = iArr4[i26 + 3];
            i26 += 4;
            if (i23 < 4) {
                i23 = (i23 - i2) & 3;
            }
            if (i22 < 4) {
                i22 = (i22 - i2) & 3;
            }
            if (i21 < 4) {
                i21 = (i21 - i2) & 3;
            }
            this.ak[i24] = i23;
            this.ap[i24] = i22;
            this.at[i24] = i21;
            if (i20 == 0) {
                this.aq[i24] = iArr2[i23];
                this.ao[i24] = iArr2[i22];
                this.aa[i24] = iArr2[i21];
                if (this.ah != null) {
                    this.ah[i24] = -1;
                }
            } else {
                this.aq[i24] = iArr3[i23];
                this.ao[i24] = iArr3[i22];
                this.aa[i24] = iArr3[i21];
                if (this.ah != null) {
                    this.ah[i24] = i3;
                }
            }
        }
        if (i7 < i6) {
            i22 = i7;
        } else {
            i22 = i6;
        }
        if (i7 > i7) {
            i21 = i7;
        } else {
            i21 = i7;
        }
        if (i8 < i22) {
            i22 = i8;
        }
        if (i8 > i21) {
            i21 = i8;
        }
        if (i9 < i22) {
            i22 = i9;
        }
        if (i9 <= i21) {
            i9 = i21;
        }
        i21 = i22 / 14;
        i21 = i9 / 14;
    }
}
