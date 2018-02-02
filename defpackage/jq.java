package defpackage;

public class jq {
    int aa = iv.aq(8);
    int ac = iv.aq(24);
    int aj = iv.aq(16);
    int[] ak;
    int an = iv.aq(24);
    int ao = (iv.aq(6) + 1);
    int aq = (iv.aq(24) + 1);

    jq() {
        int i = 0;
        int[] iArr = new int[this.ao];
        for (int i2 = 0; i2 < this.ao; i2++) {
            int i3;
            int aq = iv.aq(3);
            if (iv.an() != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                i3 = iv.aq(5);
            } else {
                i3 = 0;
            }
            iArr[i2] = (i3 << 3) | aq;
        }
        this.ak = new int[(this.ao * 8)];
        while (i < this.ao * 8) {
            this.ak[i] = (iArr[i >> 3] & (1 << (i & 7))) != 0 ? iv.aq(8) : -1;
            i++;
        }
    }

    void ac(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = iv.aw[this.aa].aj;
            int i4 = (this.an - this.ac) / this.aq;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = iv.aw[this.aa].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ao;
                            }
                            an /= this.ao;
                        }
                    }
                    i2 = i6;
                    for (int i7 = 0; i7 < i3; i7++) {
                        i6 = this.ak[(iArr[i2] * 8) + i5];
                        if (i6 >= 0) {
                            int i8 = this.ac + (this.aq * i2);
                            io ioVar = iv.aw[i6];
                            int i9;
                            float[] aq;
                            if (this.aj == 0) {
                                i9 = this.aq / ioVar.aj;
                                for (an = 0; an < i9; an++) {
                                    aq = ioVar.aq();
                                    for (i6 = 0; i6 < ioVar.aj; i6++) {
                                        int i10 = (i8 + an) + (i6 * i9);
                                        fArr[i10] = fArr[i10] + aq[i6];
                                    }
                                }
                            } else {
                                i6 = 0;
                                while (i6 < this.aq) {
                                    aq = ioVar.aq();
                                    an = 0;
                                    while (an < ioVar.aj) {
                                        i9 = i8 + i6;
                                        fArr[i9] = fArr[i9] + aq[an];
                                        an++;
                                        i6++;
                                    }
                                }
                            }
                        }
                        i2++;
                        if (i2 >= i4) {
                            break;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }

    void aj(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = iv.aw[this.aa].aj;
            int i4 = (this.an - this.ac) / this.aq;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = iv.aw[this.aa].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ao;
                            }
                            an /= this.ao;
                        }
                    }
                    int i7 = 0;
                    while (i7 < i3) {
                        i2 = this.ak[(iArr[i6] * 8) + i5];
                        if (i2 >= 0) {
                            int i8 = this.ac + (this.aq * i6);
                            io ioVar = iv.aw[i2];
                            int i9;
                            float[] aq;
                            if (this.aj == 0) {
                                i9 = this.aq / ioVar.aj;
                                for (an = 0; an < i9; an++) {
                                    aq = ioVar.aq();
                                    for (i2 = 0; i2 < ioVar.aj; i2++) {
                                        int i10 = (i8 + an) + (i2 * i9);
                                        fArr[i10] = fArr[i10] + aq[i2];
                                    }
                                }
                            } else {
                                i2 = 0;
                                while (i2 < this.aq) {
                                    aq = ioVar.aq();
                                    an = 0;
                                    while (an < ioVar.aj) {
                                        i9 = i8 + i2;
                                        fArr[i9] = fArr[i9] + aq[an];
                                        an++;
                                        i2++;
                                    }
                                }
                            }
                        }
                        i2 = i6 + 1;
                        if (i2 >= i4) {
                            break;
                        }
                        i7++;
                        i6 = i2;
                    }
                    i2 = i6;
                    i6 = i2;
                }
            }
        }
    }

    void an(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = iv.aw[this.aa].aj;
            int i4 = (this.an - this.ac) / this.aq;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                while (i6 < i4) {
                    int an;
                    if (i5 == 0) {
                        an = iv.aw[this.aa].an();
                        for (i2 = i3 - 1; i2 >= 0; i2--) {
                            if (i6 + i2 < i4) {
                                iArr[i6 + i2] = an % this.ao;
                            }
                            an /= this.ao;
                        }
                    }
                    int i7 = 0;
                    while (i7 < i3) {
                        i2 = this.ak[(iArr[i6] * 8) + i5];
                        if (i2 >= 0) {
                            int i8 = this.ac + (this.aq * i6);
                            io ioVar = iv.aw[i2];
                            int i9;
                            float[] aq;
                            if (this.aj == 0) {
                                i9 = this.aq / ioVar.aj;
                                for (an = 0; an < i9; an++) {
                                    aq = ioVar.aq();
                                    for (i2 = 0; i2 < ioVar.aj; i2++) {
                                        int i10 = (i8 + an) + (i2 * i9);
                                        fArr[i10] = fArr[i10] + aq[i2];
                                    }
                                }
                            } else {
                                i2 = 0;
                                while (i2 < this.aq) {
                                    aq = ioVar.aq();
                                    an = 0;
                                    while (an < ioVar.aj) {
                                        i9 = i8 + i2;
                                        fArr[i9] = fArr[i9] + aq[an];
                                        an++;
                                        i2++;
                                    }
                                }
                            }
                        }
                        i2 = i6 + 1;
                        if (i2 >= i4) {
                            break;
                        }
                        i7++;
                        i6 = i2;
                    }
                    i2 = i6;
                    i6 = i2;
                }
            }
        }
    }
}
