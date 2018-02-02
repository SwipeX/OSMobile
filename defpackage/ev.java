package defpackage;

public class ev extends es {
    static final int aw = 7;
    static em[] cx;

    public ev(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "ev.<init>(" + ')');
        }
    }

    ev(int i, int i2) {
        try {
            super(i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "ev.<init>(" + ')');
        }
    }

    void aj(int i) {
        try {
            ac((byte) 14);
        } catch (Throwable e) {
            throw ei.ac(e, "ev.aj(" + ')');
        }
    }

    void bx() {
        ac((byte) 14);
    }

    void by() {
        ac((byte) 14);
    }

    public void ac(byte b) {
        int i = 0;
        try {
            int i2;
            int i3 = ((this.ac * 1075116703) * (this.an * -1283456967)) - 7;
            while (i < i3) {
                int i4 = i + 1;
                this.aj[i] = 0;
                i2 = i4 + 1;
                this.aj[i4] = 0;
                i4 = i2 + 1;
                this.aj[i2] = 0;
                i2 = i4 + 1;
                this.aj[i4] = 0;
                i4 = i2 + 1;
                this.aj[i2] = 0;
                i2 = i4 + 1;
                this.aj[i4] = 0;
                i4 = i2 + 1;
                this.aj[i2] = 0;
                i = i4 + 1;
                this.aj[i4] = 0;
            }
            i2 = i3 + 7;
            while (i < i2) {
                i3 = i + 1;
                this.aj[i] = 0;
                i = i3;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ac(" + ')');
        }
    }

    public void bi() {
        int i;
        int i2 = ((this.ac * -68183086) * (this.an * 1387650598)) - 7;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            this.aj[i3] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i3 = i4 + 1;
            this.aj[i4] = 0;
        }
        i = i2 + 7;
        while (i3 < i) {
            i2 = i3 + 1;
            this.aj[i3] = 0;
            i3 = i2;
        }
    }

    public void bs() {
        int i;
        int i2 = ((this.ac * 1182715143) * (this.an * -1283456967)) - 7;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            this.aj[i3] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i = i4 + 1;
            this.aj[i4] = 0;
            i4 = i + 1;
            this.aj[i] = 0;
            i3 = i4 + 1;
            this.aj[i4] = 0;
        }
        i = i2 + 7;
        while (i3 < i) {
            i2 = i3 + 1;
            this.aj[i3] = 0;
            i3 = i2;
        }
    }

    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            int i8;
            int i9;
            int i10;
            if (i < 889727047 * this.aa) {
                i8 = i3 - ((889727047 * this.aa) - i);
                i = 889727047 * this.aa;
            } else {
                i8 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i9 = i4 - ((this.aq * -1857728003) - i2);
                i2 = this.aq * -1857728003;
            } else {
                i9 = i4;
            }
            if (i8 + i > this.ak * 579810681) {
                i10 = (579810681 * this.ak) - i;
            } else {
                i10 = i8;
            }
            if (i9 + i2 > -90244733 * this.ao) {
                i9 = (this.ao * -90244733) - i2;
            }
            int i11 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((16711935 & i5) * i6) >> 8) & 16711935);
            int i12 = 256 - i6;
            int i13 = (this.ac * 1075116703) - i10;
            int i14 = ((1075116703 * this.ac) * i2) + i;
            for (int i15 = 0; i15 < i9; i15++) {
                i8 = -i10;
                while (i8 < 0) {
                    int i16 = this.aj[i14];
                    int i17 = ((((16711935 & i16) * i12) >> 8) & 16711935) + ((((i16 & 65280) * i12) >> 8) & 65280);
                    i16 = i14 + 1;
                    this.aj[i14] = i17 + i11;
                    i8++;
                    i14 = i16;
                }
                i14 += i13;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.an(" + ')');
        }
    }

    public final void bo(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 889727047 * this.aa) {
            i3 -= (889727047 * this.aa) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i4 -= (this.aq * -1857728003) - i2;
            i2 = this.aq * -1857728003;
        }
        if (i3 + i > this.ak * 579810681) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i4 + i2 > -90244733 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i7 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((16711935 & i5) * i6) >> 8) & 16711935);
        int i8 = 256 - i6;
        int i9 = (this.ac * 1075116703) - i3;
        int i10 = ((1075116703 * this.ac) * i2) + i;
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = -i3;
            while (i12 < 0) {
                int i13 = this.aj[i10];
                int i14 = ((((16711935 & i13) * i8) >> 8) & 16711935) + ((((i13 & 65280) * i8) >> 8) & 65280);
                i13 = i10 + 1;
                this.aj[i10] = i14 + i7;
                i12++;
                i10 = i13;
            }
            i10 += i9;
        }
    }

    public final void aq(int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            int i6;
            int i7;
            int i8;
            if (i < this.aa * 889727047) {
                i6 = i3 - ((this.aa * 889727047) - i);
                i = 889727047 * this.aa;
            } else {
                i6 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i7 = i4 - ((this.aq * -1857728003) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i7 = i4;
            }
            if (i6 + i > this.ak * 579810681) {
                i8 = (this.ak * 579810681) - i;
            } else {
                i8 = i6;
            }
            if (i2 + i7 > this.ao * -90244733) {
                i7 = (this.ao * -90244733) - i2;
            }
            int i9 = (this.ac * 1075116703) - i8;
            i6 = ((this.ac * 1075116703) * i2) + i;
            for (int i10 = -i7; i10 < 0; i10++) {
                i7 = -i8;
                while (i7 < 0) {
                    int i11 = i6 + 1;
                    this.aj[i6] = i5;
                    i7++;
                    i6 = i11;
                }
                i6 += i9;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.aq(" + ')');
        }
    }

    public final void bj(int i, int i2, int i3, int i4, int i5) {
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * 889727047) - i;
            i = -1941949784 * this.aa;
        }
        if (i2 < this.aq * -1701738801) {
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = 1517825908 * this.aq;
        }
        if (i3 + i > this.ak * -1486115932) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * 1981833339) - i2;
        }
        int i6 = (1075116703 * this.ac) - i3;
        int i7 = ((641286463 * this.ac) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.aj[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    public final void bq(int i, int i2, int i3, int i4, int i5) {
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * 889727047) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > this.ak * 579810681) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i6 = (this.ac * 1075116703) - i3;
        int i7 = ((this.ac * 1075116703) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.aj[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    public final void bz(int i, int i2, int i3, int i4, int i5) {
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * -2117821312) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i4 -= (878696502 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > this.ak * -346724768) {
            i3 = (-2007904461 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i6 = (-173971632 * this.ac) - i3;
        int i7 = ((-1066153084 * this.ac) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                int i10 = i7 + 1;
                this.aj[i7] = i5;
                i9++;
                i7 = i10;
            }
            i7 += i6;
        }
    }

    public final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (i5 == i6 && i7 == i8) {
            i10 = -1;
        } else {
            try {
                i10 = 65536 / i4;
            } catch (Throwable e) {
                throw ei.ac(e, "ev.ao(" + ')');
            }
        }
        int i15 = 256 - i7;
        if (i < this.aa * 889727047) {
            i11 = i3 - ((889727047 * this.aa) - i);
            i = this.aa * 889727047;
        } else {
            i11 = i3;
        }
        if (i2 < -1857728003 * this.aq) {
            i14 = 0 + (((-1857728003 * this.aq) - i2) * i10);
            i12 = i4 - ((this.aq * -1857728003) - i2);
            i2 = -1857728003 * this.aq;
        } else {
            i12 = i4;
        }
        if (i + i11 > 579810681 * this.ak) {
            i13 = (579810681 * this.ak) - i;
        } else {
            i13 = i11;
        }
        if (i2 + i12 > this.ao * -90244733) {
            i12 = (this.ao * -90244733) - i2;
        }
        int i16 = (this.ac * 1075116703) - i13;
        int i17 = i + ((this.ac * 1075116703) * i2);
        int i18 = -i12;
        i11 = i5;
        int i19 = i7;
        while (i18 < 0) {
            int i20 = i17;
            i17 = -i13;
            while (i17 < 0) {
                int i21 = this.aj[i20];
                int i22 = i11 + i21;
                i12 = (16711935 & i11) + (16711935 & i21);
                int i23 = (16777472 & i12) + ((i22 - i12) & 65536);
                if (i15 == 0) {
                    i12 = i20 + 1;
                    this.aj[i20] = (i22 - i23) | (i23 - (i23 >>> 8));
                } else {
                    i22 = (i23 - (i23 >>> 8)) | (i22 - i23);
                    i12 = i20 + 1;
                    i21 = (((i21 & 65280) * i15) >> 8) & 65280;
                    this.aj[i20] = i21 + ((((((i22 & 16711935) * i19) >> 8) & 16711935) + ((((65280 & i22) * i19) >> 8) & 65280)) + ((((16711935 & i21) * i15) >> 8) & 16711935));
                }
                i17++;
                i20 = i12;
            }
            if (i10 > 0) {
                i14 += i10;
                i12 = (65536 - i14) >> 8;
                i17 = i14 >> 8;
                if (i7 != i8) {
                    i19 = (((65536 - i14) * i7) + (i8 * i14)) >> 16;
                    i15 = 256 - i19;
                }
                if (i6 != i5) {
                    i12 = ((((i12 * (65280 & i5)) + (i17 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i12) + ((16711935 & i6) * i17)) & -16711936)) >>> 8;
                    i11 = i15;
                    i15 = i19;
                    i19 = i14;
                    i17 = i20 + i16;
                    i18++;
                    i14 = i19;
                    i19 = i15;
                    i15 = i11;
                    i11 = i12;
                }
            }
            i12 = i11;
            i11 = i15;
            i15 = i19;
            i19 = i14;
            i17 = i20 + i16;
            i18++;
            i14 = i19;
            i19 = i15;
            i15 = i11;
            i11 = i12;
        }
    }

    public final void ba(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        if (i5 == i6 && i7 == i8) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i10 = 0 + (((-1857728003 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > 579810681 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = (this.ac * 1075116703) - i3;
        int i13 = i + ((this.ac * 1075116703) * i2);
        int i14 = -i4;
        int i15 = i7;
        int i16 = i10;
        int i17 = i5;
        while (i14 < 0) {
            int i18 = i13;
            i13 = -i3;
            while (i13 < 0) {
                int i19 = this.aj[i18];
                int i20 = i17 + i19;
                i10 = (16711935 & i17) + (16711935 & i19);
                int i21 = (16777472 & i10) + ((i20 - i10) & 65536);
                if (i11 == 0) {
                    i10 = i18 + 1;
                    this.aj[i18] = (i20 - i21) | (i21 - (i21 >>> 8));
                } else {
                    i20 = (i21 - (i21 >>> 8)) | (i20 - i21);
                    i10 = i18 + 1;
                    i19 = (((i19 & 65280) * i11) >> 8) & 65280;
                    this.aj[i18] = i19 + ((((((i20 & 16711935) * i15) >> 8) & 16711935) + ((((65280 & i20) * i15) >> 8) & 65280)) + ((((16711935 & i19) * i11) >> 8) & 16711935));
                }
                i13++;
                i18 = i10;
            }
            if (i9 > 0) {
                i16 += i9;
                i10 = (65536 - i16) >> 8;
                i13 = i16 >> 8;
                if (i7 != i8) {
                    i15 = (((65536 - i16) * i7) + (i8 * i16)) >> 16;
                    i11 = 256 - i15;
                }
                if (i6 != i5) {
                    i10 = ((((i10 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((16711935 & i6) * i13)) & -16711936)) >>> 8;
                    i17 = i11;
                    i11 = i15;
                    i15 = i16;
                    i13 = i18 + i12;
                    i14++;
                    i16 = i15;
                    i15 = i11;
                    i11 = i17;
                    i17 = i10;
                }
            }
            i10 = i17;
            i17 = i11;
            i11 = i15;
            i15 = i16;
            i13 = i18 + i12;
            i14++;
            i16 = i15;
            i15 = i11;
            i11 = i17;
            i17 = i10;
        }
    }

    public final void be(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        if (i5 == i6 && i7 == i8) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i10 = 0 + (((-1857728003 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > 579810681 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = (this.ac * 1075116703) - i3;
        int i13 = i + ((this.ac * 1075116703) * i2);
        int i14 = i10;
        int i15 = i11;
        i10 = i5;
        i11 = i7;
        for (int i16 = -i4; i16 < 0; i16++) {
            int i17 = i13;
            i13 = -i3;
            while (i13 < 0) {
                int i18 = this.aj[i17];
                int i19 = i10 + i18;
                int i20 = (16711935 & i10) + (16711935 & i18);
                int i21 = (16777472 & i20) + ((i19 - i20) & 65536);
                if (i15 == 0) {
                    i20 = i17 + 1;
                    this.aj[i17] = (i19 - i21) | (i21 - (i21 >>> 8));
                } else {
                    i19 = (i21 - (i21 >>> 8)) | (i19 - i21);
                    i20 = i17 + 1;
                    i18 = (((i18 & 65280) * i15) >> 8) & 65280;
                    this.aj[i17] = i18 + ((((((i19 & 16711935) * i11) >> 8) & 16711935) + ((((65280 & i19) * i11) >> 8) & 65280)) + ((((16711935 & i18) * i15) >> 8) & 16711935));
                }
                i13++;
                i17 = i20;
            }
            if (i9 > 0) {
                i14 += i9;
                i20 = (65536 - i14) >> 8;
                i13 = i14 >> 8;
                if (i7 != i8) {
                    i11 = (((65536 - i14) * i7) + (i8 * i14)) >> 16;
                    i15 = 256 - i11;
                }
                if (i6 != i5) {
                    i10 = (((((16711935 & i5) * i20) + ((16711935 & i6) * i13)) & -16711936) + (((i20 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680)) >>> 8;
                }
            }
            i13 = i17 + i12;
        }
    }

    public final void bv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        if (i5 == i6 && i7 == i8) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i10 = 0 + (((-1857728003 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > 579810681 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = (this.ac * 1075116703) - i3;
        int i13 = i + ((this.ac * 1075116703) * i2);
        int i14 = i10;
        int i15 = i11;
        i10 = i5;
        i11 = i7;
        for (int i16 = -i4; i16 < 0; i16++) {
            int i17 = i13;
            i13 = -i3;
            while (i13 < 0) {
                int i18 = this.aj[i17];
                int i19 = i10 + i18;
                int i20 = (16711935 & i10) + (16711935 & i18);
                int i21 = (16777472 & i20) + ((i19 - i20) & 65536);
                if (i15 == 0) {
                    i20 = i17 + 1;
                    this.aj[i17] = (i19 - i21) | (i21 - (i21 >>> 8));
                } else {
                    i19 = (i21 - (i21 >>> 8)) | (i19 - i21);
                    i20 = i17 + 1;
                    i18 = (((i18 & 65280) * i15) >> 8) & 65280;
                    this.aj[i17] = i18 + ((((((i19 & 16711935) * i11) >> 8) & 16711935) + ((((65280 & i19) * i11) >> 8) & 65280)) + ((((16711935 & i18) * i15) >> 8) & 16711935));
                }
                i13++;
                i17 = i20;
            }
            if (i9 > 0) {
                i14 += i9;
                i20 = (65536 - i14) >> 8;
                i13 = i14 >> 8;
                if (i7 != i8) {
                    i11 = (((65536 - i14) * i7) + (i8 * i14)) >> 16;
                    i15 = 256 - i11;
                }
                if (i6 != i5) {
                    i10 = (((((16711935 & i5) * i20) + ((16711935 & i6) * i13)) & -16711936) + (((i20 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680)) >>> 8;
                }
            }
            i13 = i17 + i12;
        }
    }

    public final void aa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (i6 == i5 && i7 == i8) {
            i10 = -1;
        } else {
            try {
                i10 = 65536 / i4;
            } catch (Throwable e) {
                throw ei.ac(e, "ev.aa(" + ')');
            }
        }
        int i15 = 256 - i7;
        if (i < this.aa * 889727047) {
            i11 = i3 - ((this.aa * 889727047) - i);
            i = this.aa * 889727047;
        } else {
            i11 = i3;
        }
        if (i2 < this.aq * -1857728003) {
            i14 = 0 + (((-1857728003 * this.aq) - i2) * i10);
            i12 = i4 - ((this.aq * -1857728003) - i2);
            i2 = -1857728003 * this.aq;
        } else {
            i12 = i4;
        }
        if (i + i11 > this.ak * 579810681) {
            i13 = (579810681 * this.ak) - i;
        } else {
            i13 = i11;
        }
        if (i2 + i12 > -90244733 * this.ao) {
            i12 = (-90244733 * this.ao) - i2;
        }
        int i16 = i5 >> 16;
        int i17 = (65280 & i5) >> 8;
        int i18 = i5 & 255;
        int i19 = (1075116703 * this.ac) - i13;
        int i20 = ((this.ac * 1075116703) * i2) + i;
        int i21 = 0;
        int i22 = i7;
        while (i21 < i12) {
            int i23;
            int i24 = -i13;
            int i25 = i20;
            while (i24 < 0) {
                int i26;
                i11 = this.aj[i25];
                i20 = i11 >> 16;
                int i27 = (65280 & i11) >> 8;
                int i28 = i11 & 255;
                if (i15 == 0) {
                    if (i20 < 127) {
                        i11 = (i16 * i20) >> 7;
                    } else {
                        i11 = 255 - (((255 - i20) * (255 - i16)) >> 7);
                    }
                    if (i27 < 127) {
                        i26 = (i27 * i17) >> 7;
                    } else {
                        i26 = 255 - (((255 - i27) * (255 - i17)) >> 7);
                    }
                    i20 = i28 < 127 ? (i18 * i28) >> 7 : 255 - (((255 - i18) * (255 - i28)) >> 7);
                    i23 = i26;
                    i26 = i11;
                    i11 = i23;
                } else {
                    i26 = i20 < 127 ? ((i20 * i15) + (((i20 * i16) * i22) >> 7)) >> 8 : (((255 - (((255 - i20) * (255 - i16)) >> 7)) * i22) + (i20 * i15)) >> 8;
                    i11 = i27 < 127 ? ((i15 * i27) + (((i27 * i17) * i22) >> 7)) >> 8 : ((i27 * i15) + ((255 - (((255 - i27) * (255 - i17)) >> 7)) * i22)) >> 8;
                    if (i28 < 127) {
                        i20 = ((i28 * i15) + (((i18 * i28) * i22) >> 7)) >> 8;
                    } else {
                        i20 = (((255 - (((255 - i28) * (255 - i18)) >> 7)) * i22) + (i15 * i28)) >> 8;
                    }
                }
                i27 = i25 + 1;
                this.aj[i25] = ((i11 << 8) + (i26 << 16)) + i20;
                i24++;
                i25 = i27;
            }
            if (i10 > 0) {
                i14 += i10;
                i11 = (65536 - i14) >> 8;
                i20 = i14 >> 8;
                if (i7 != i8) {
                    i22 = ((i8 * i14) + ((65536 - i14) * i7)) >> 16;
                    i15 = 256 - i22;
                }
                if (i6 != i5) {
                    i11 = ((((i11 * (65280 & i5)) + (i20 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i11) + ((16711935 & i6) * i20)) & -16711936)) >>> 8;
                    i18 = i11 >> 16;
                    i20 = (65280 & i11) >> 8;
                    i11 &= 255;
                    i17 = i15;
                    i16 = i22;
                    i15 = i14;
                    i21++;
                    i22 = i16;
                    i16 = i18;
                    i18 = i11;
                    i23 = i20;
                    i20 = i25 + i19;
                    i14 = i15;
                    i15 = i17;
                    i17 = i23;
                }
            }
            i11 = i18;
            i20 = i17;
            i18 = i16;
            i17 = i15;
            i16 = i22;
            i15 = i14;
            i21++;
            i22 = i16;
            i16 = i18;
            i18 = i11;
            i23 = i20;
            i20 = i25 + i19;
            i14 = i15;
            i15 = i17;
            i17 = i23;
        }
    }

    public final void bg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = (i6 == i5 && i7 == i8) ? -1 : 65536 / i4;
        int i11 = 256 - i7;
        if (i < this.aa * -2117747489) {
            i3 -= (this.aa * 889727047) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i9 = 0 + (((-267940096 * this.aq) - i2) * i10);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1479819025 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > 252563418 * this.ao) {
            i4 = (278679754 * this.ao) - i2;
        }
        int i12 = i5 >> 16;
        int i13 = (65280 & i5) >> 8;
        int i14 = i5 & 1192839087;
        int i15 = (1075116703 * this.ac) - i3;
        int i16 = 0;
        int i17 = i7;
        int i18 = i9;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        while (i16 < i4) {
            int i20;
            int i21;
            int i22 = -i3;
            int i23 = i19;
            while (i22 < 0) {
                i9 = this.aj[i23];
                i19 = i9 >> 16;
                int i24 = (2075285167 & i9) >> 8;
                int i25 = i9 & -466963596;
                if (i11 == 0) {
                    if (i19 < 1806775923) {
                        i9 = (i12 * i19) >> 7;
                    } else {
                        i9 = 1689736854 - (((2014787904 - i19) * (255 - i12)) >> 7);
                    }
                    if (i24 < 127) {
                        i20 = (i24 * i13) >> 7;
                    } else {
                        i20 = -1978396744 - (((255 - i24) * (1177993597 - i13)) >> 7);
                    }
                    if (i25 < 1833745611) {
                        i19 = (i14 * i25) >> 7;
                    } else {
                        i19 = 255 - (((255 - i14) * (-1281848020 - i25)) >> 7);
                    }
                    i21 = i20;
                    i20 = i9;
                    i9 = i21;
                } else {
                    if (i19 < 127) {
                        i20 = ((i19 * i11) + (((i19 * i12) * i17) >> 7)) >> 8;
                    } else {
                        i20 = (((1607160403 - (((255 - i19) * (-200101881 - i12)) >> 7)) * i17) + (i19 * i11)) >> 8;
                    }
                    if (i24 < -1125940808) {
                        i9 = ((i11 * i24) + (((i24 * i13) * i17) >> 7)) >> 8;
                    } else {
                        i9 = ((i24 * i11) + ((-515986317 - (((255 - i24) * (416267301 - i13)) >> 7)) * i17)) >> 8;
                    }
                    if (i25 < -1142650846) {
                        i19 = ((i25 * i11) + (((i14 * i25) * i17) >> 7)) >> 8;
                    } else {
                        i19 = (((255 - (((2006382422 - i25) * (-2003824159 - i14)) >> 7)) * i17) + (i11 * i25)) >> 8;
                    }
                }
                i24 = i23 + 1;
                this.aj[i23] = ((i9 << 8) + (i20 << 16)) + i19;
                i22++;
                i23 = i24;
            }
            if (i10 > 0) {
                i18 += i10;
                i9 = (65536 - i18) >> 8;
                i19 = i18 >> 8;
                if (i7 != i8) {
                    i17 = ((i8 * i18) + ((1197358285 - i18) * i7)) >> 16;
                    i11 = 256 - i17;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (65280 & i5)) + (i19 * (-2144738257 & i6))) & -1320172830) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i19)) & -1148667546)) >>> 8;
                    i20 = i9 >> 16;
                    i19 = (65280 & i9) >> 8;
                    i9 &= 255;
                    i14 = i11;
                    i13 = i17;
                    i12 = i18;
                    i16++;
                    i18 = i12;
                    i12 = i20;
                    i11 = i14;
                    i14 = i9;
                    i21 = i19;
                    i19 = i23 + i15;
                    i17 = i13;
                    i13 = i21;
                }
            }
            i9 = i14;
            i19 = i13;
            i20 = i12;
            i14 = i11;
            i13 = i17;
            i12 = i18;
            i16++;
            i18 = i12;
            i12 = i20;
            i11 = i14;
            i14 = i9;
            i21 = i19;
            i19 = i23 + i15;
            i17 = i13;
            i13 = i21;
        }
    }

    public final void bn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        if (i6 == i5 && i7 == i8) {
            i9 = -1;
        } else {
            i9 = -165009697 / i4;
        }
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * -33062575) - i;
            i = this.aa * -90896904;
        }
        if (i2 < this.aq * 1838529261) {
            i10 = 0 + (((683034593 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 1658201003) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > 377008804 * this.ao) {
            i4 = (-1322441228 * this.ao) - i2;
        }
        int i12 = i5 >> 16;
        int i13 = (65280 & i5) >> 8;
        int i14 = i5 & 255;
        int i15 = (-1074704680 * this.ac) - i3;
        int i16 = 0;
        int i17 = i7;
        int i18 = i10;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        while (i16 < i4) {
            int i20;
            int i21;
            int i22 = -i3;
            int i23 = i19;
            while (i22 < 0) {
                i10 = this.aj[i23];
                i19 = i10 >> 16;
                int i24 = (1309095051 & i10) >> 8;
                int i25 = i10 & 649352427;
                if (i11 == 0) {
                    i20 = i19 < -498719111 ? (i12 * i19) >> 7 : 1456442108 - (((255 - i19) * (-1617543592 - i12)) >> 7);
                    if (i24 < -1572826242) {
                        i10 = (i24 * i13) >> 7;
                    } else {
                        i10 = 255 - (((1992580137 - i24) * (448351269 - i13)) >> 7);
                    }
                    if (i25 < -208566398) {
                        i19 = (i14 * i25) >> 7;
                    } else {
                        i19 = 255 - (((-1689782713 - i14) * (-167180589 - i25)) >> 7);
                    }
                } else {
                    if (i19 < 127) {
                        i20 = ((i19 * i11) + (((i19 * i12) * i17) >> 7)) >> 8;
                    } else {
                        i20 = (((2030020220 - (((255 - i19) * (255 - i12)) >> 7)) * i17) + (i19 * i11)) >> 8;
                    }
                    i10 = i24 < -650037696 ? ((i11 * i24) + (((i24 * i13) * i17) >> 7)) >> 8 : ((i24 * i11) + ((255 - (((255 - i24) * (-685520601 - i13)) >> 7)) * i17)) >> 8;
                    if (i25 < 1025014898) {
                        i19 = ((i25 * i11) + (((i14 * i25) * i17) >> 7)) >> 8;
                    } else {
                        i19 = (((-282715482 - (((-1530746676 - i25) * (1168692301 - i14)) >> 7)) * i17) + (i11 * i25)) >> 8;
                    }
                }
                i24 = i23 + 1;
                this.aj[i23] = ((i10 << 8) + (i20 << 16)) + i19;
                i22++;
                i23 = i24;
            }
            if (i9 > 0) {
                i18 += i9;
                i10 = (65536 - i18) >> 8;
                i19 = i18 >> 8;
                if (i7 != i8) {
                    i17 = ((i8 * i18) + ((65536 - i18) * i7)) >> 16;
                    i11 = 256 - i17;
                }
                if (i6 != i5) {
                    i10 = ((((i10 * (1680877736 & i5)) + (i19 * (65280 & i6))) & 16711680) + ((((2098581725 & i5) * i10) + ((-933047312 & i6) * i19)) & -16711936)) >>> 8;
                    i20 = i10 >> 16;
                    i19 = (65280 & i10) >> 8;
                    i10 &= -745876516;
                    i14 = i11;
                    i13 = i17;
                    i12 = i18;
                    i16++;
                    i18 = i12;
                    i12 = i20;
                    i11 = i14;
                    i14 = i10;
                    i21 = i19;
                    i19 = i23 + i15;
                    i17 = i13;
                    i13 = i21;
                }
            }
            i10 = i14;
            i19 = i13;
            i20 = i12;
            i14 = i11;
            i13 = i17;
            i12 = i18;
            i16++;
            i18 = i12;
            i12 = i20;
            i11 = i14;
            i14 = i10;
            i21 = i19;
            i19 = i23 + i15;
            i17 = i13;
            i13 = i21;
        }
    }

    public final void bw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10 = 0;
        if (i6 == i5 && i7 == i8) {
            i9 = -1;
        } else {
            i9 = 1591157584 / i4;
        }
        int i11 = 306520610 - i7;
        if (i < this.aa * 982823796) {
            i3 -= (this.aa * 889727047) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i10 = 0 + (((-21638482 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -268285565 * this.aq;
        }
        if (i + i3 > this.ak * -270697168) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > 1356922122 * this.ao) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i12 = i5 >> 16;
        int i13 = (65280 & i5) >> 8;
        int i14 = i5 & 255;
        int i15 = (1075116703 * this.ac) - i3;
        int i16 = 0;
        int i17 = i7;
        int i18 = i10;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        while (i16 < i4) {
            int i20;
            int i21;
            int i22 = -i3;
            int i23 = i19;
            while (i22 < 0) {
                i10 = this.aj[i23];
                i19 = i10 >> 16;
                int i24 = (-919087386 & i10) >> 8;
                int i25 = i10 & 77789251;
                if (i11 == 0) {
                    if (i19 < -1355527490) {
                        i10 = (i12 * i19) >> 7;
                    } else {
                        i10 = -1084894413 - (((-634327526 - i19) * (529834451 - i12)) >> 7);
                    }
                    if (i24 < -2005887967) {
                        i20 = (i24 * i13) >> 7;
                    } else {
                        i20 = 255 - (((255 - i24) * (835712398 - i13)) >> 7);
                    }
                    i19 = i25 < -1204881178 ? (i14 * i25) >> 7 : -1280126040 - (((2084724244 - i14) * (255 - i25)) >> 7);
                    i21 = i20;
                    i20 = i10;
                    i10 = i21;
                } else {
                    if (i19 < 127) {
                        i20 = ((i19 * i11) + (((i19 * i12) * i17) >> 7)) >> 8;
                    } else {
                        i20 = (((255 - (((255 - i19) * (1490712100 - i12)) >> 7)) * i17) + (i19 * i11)) >> 8;
                    }
                    if (i24 < 127) {
                        i10 = ((i11 * i24) + (((i24 * i13) * i17) >> 7)) >> 8;
                    } else {
                        i10 = ((i24 * i11) + ((255 - (((-273339980 - i24) * (255 - i13)) >> 7)) * i17)) >> 8;
                    }
                    if (i25 < 718813323) {
                        i19 = ((i25 * i11) + (((i14 * i25) * i17) >> 7)) >> 8;
                    } else {
                        i19 = (((-1586169164 - (((2106221486 - i25) * (-1245199383 - i14)) >> 7)) * i17) + (i11 * i25)) >> 8;
                    }
                }
                i24 = i23 + 1;
                this.aj[i23] = ((i10 << 8) + (i20 << 16)) + i19;
                i22++;
                i23 = i24;
            }
            if (i9 > 0) {
                i18 += i9;
                i10 = (65536 - i18) >> 8;
                i19 = i18 >> 8;
                if (i7 != i8) {
                    i17 = ((i8 * i18) + ((1041344991 - i18) * i7)) >> 16;
                    i11 = 256 - i17;
                }
                if (i6 != i5) {
                    i10 = ((((i10 * (65280 & i5)) + (i19 * (-1332168317 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((1621241241 & i6) * i19)) & -16711936)) >>> 8;
                    i20 = i10 >> 16;
                    i19 = (65280 & i10) >> 8;
                    i10 &= -1739582734;
                    i14 = i11;
                    i13 = i17;
                    i12 = i18;
                    i16++;
                    i18 = i12;
                    i12 = i20;
                    i11 = i14;
                    i14 = i10;
                    i21 = i19;
                    i19 = i23 + i15;
                    i17 = i13;
                    i13 = i21;
                }
            }
            i10 = i14;
            i19 = i13;
            i20 = i12;
            i14 = i11;
            i13 = i17;
            i12 = i18;
            i16++;
            i18 = i12;
            i12 = i20;
            i11 = i14;
            i14 = i10;
            i21 = i19;
            i19 = i23 + i15;
            i17 = i13;
            i13 = i21;
        }
    }

    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 0;
        try {
            int i11;
            int i12;
            int i13;
            int i14 = 65536 / i4;
            int i15 = 256 - i7;
            if (i < this.aa * 889727047) {
                i11 = i3 - ((this.aa * 889727047) - i);
                i = 889727047 * this.aa;
            } else {
                i11 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i10 = 0 + (((-1857728003 * this.aq) - i2) * i14);
                i12 = i4 - ((this.aq * -1857728003) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i12 = i4;
            }
            if (i11 + i > 579810681 * this.ak) {
                i13 = (this.ak * 579810681) - i;
            } else {
                i13 = i11;
            }
            if (i12 + i2 > this.ao * -90244733) {
                i12 = (this.ao * -90244733) - i2;
            }
            int i16 = i5 & 16711680;
            int i17 = i5 & 65280;
            int i18 = i5 & 255;
            int i19 = (i16 * i7) >> 8;
            int i20 = (i7 * i17) >> 8;
            int i21 = (i7 * i18) >> 8;
            int i22 = (1075116703 * this.ac) - i13;
            int i23 = ((this.ac * 1075116703) * i2) + i;
            int i24 = 0;
            int i25 = i7;
            while (i24 < i12) {
                int i26;
                int i27;
                int i28 = -i13;
                int i29 = i23;
                while (i28 < 0) {
                    int i30 = this.aj[i29];
                    i11 = 16711680 & i30;
                    if (i11 > i16) {
                        if (i15 == 0) {
                            i11 = i16;
                        } else {
                            i11 = (((i11 * i15) >> 8) + i19) & 16711680;
                        }
                    }
                    i23 = 65280 & i30;
                    if (i23 > i17) {
                        if (i15 == 0) {
                            i23 = i17;
                        } else {
                            i23 = (((i23 * i15) >> 8) + i20) & 65280;
                        }
                    }
                    i30 &= 255;
                    if (i30 > i18) {
                        if (i15 == 0) {
                            i30 = i18;
                        } else {
                            i30 = ((i30 * i15) >> 8) + i21;
                        }
                    }
                    int i31 = i29 + 1;
                    this.aj[i29] = (i11 + i23) + i30;
                    i28++;
                    i29 = i31;
                }
                if (i14 > 0) {
                    i10 += i14;
                    i11 = (65536 - i10) >> 8;
                    i23 = i10 >> 8;
                    if (i7 != i8) {
                        i25 = ((i10 * i8) + ((65536 - i10) * i7)) >> 16;
                        i15 = 256 - i25;
                    }
                    if (i5 != i6) {
                        i11 = ((((i11 * (65280 & i5)) + (i23 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i11) + ((16711935 & i6) * i23)) & -16711936)) >>> 8;
                        i20 = i11 & 16711680;
                        i21 = i11 & 65280;
                        i17 = i11 & 255;
                        i23 = (i20 * i25) >> 8;
                        i16 = (i21 * i25) >> 8;
                        i11 = (i17 * i25) >> 8;
                        i19 = i15;
                        i18 = i25;
                        i15 = i10;
                        i24++;
                        i25 = i18;
                        i18 = i17;
                        i17 = i21;
                        i21 = i11;
                        i26 = i23;
                        i23 = i29 + i22;
                        i10 = i15;
                        i15 = i19;
                        i19 = i26;
                        i27 = i20;
                        i20 = i16;
                        i16 = i27;
                    }
                }
                i11 = i21;
                i23 = i19;
                i21 = i17;
                i19 = i15;
                i17 = i18;
                i15 = i10;
                i18 = i25;
                i26 = i20;
                i20 = i16;
                i16 = i26;
                i24++;
                i25 = i18;
                i18 = i17;
                i17 = i21;
                i21 = i11;
                i26 = i23;
                i23 = i29 + i22;
                i10 = i15;
                i15 = i19;
                i19 = i26;
                i27 = i20;
                i20 = i16;
                i16 = i27;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ak(" + ')');
        }
    }

    public final void bc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = -1314681848 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * -229309697) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -496008240) {
            i9 = 0 + (((-1857728003 * this.aq) - i2) * i10);
            i4 -= (this.aq * 808883458) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > -1104150106 * this.ak) {
            i3 = (this.ak * 1993795324) - i;
        }
        if (i4 + i2 > this.ao * 2068371347) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = i5 & 16711680;
        int i13 = i5 & 1935129281;
        int i14 = i5 & 255;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i7 * i13) >> 8;
        int i17 = (i7 * i14) >> 8;
        int i18 = (1757535657 * this.ac) - i3;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        int i20 = 0;
        int i21 = i7;
        int i22 = i9;
        int i23 = i12;
        while (i20 < i4) {
            int i24 = -i3;
            int i25 = i19;
            while (i24 < 0) {
                i12 = this.aj[i25];
                i9 = 16711680 & i12;
                if (i9 > i23) {
                    i9 = i11 == 0 ? i23 : (((i9 * i11) >> 8) + i15) & 16711680;
                }
                i19 = -425510421 & i12;
                if (i19 > i13) {
                    i19 = i11 == 0 ? i13 : (((i19 * i11) >> 8) + i16) & 65280;
                }
                i12 &= -1078598267;
                if (i12 > i14) {
                    if (i11 == 0) {
                        i12 = i14;
                    } else {
                        i12 = ((i12 * i11) >> 8) + i17;
                    }
                }
                int i26 = i25 + 1;
                this.aj[i25] = (i9 + i19) + i12;
                i24++;
                i25 = i26;
            }
            if (i10 > 0) {
                i22 += i10;
                i9 = (65536 - i22) >> 8;
                i19 = i22 >> 8;
                if (i7 != i8) {
                    i21 = ((i22 * i8) + ((65536 - i22) * i7)) >> 16;
                    i11 = 256 - i21;
                }
                if (i5 != i6) {
                    i9 = ((((i9 * (65280 & i5)) + (i19 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i19)) & -16711936)) >>> 8;
                    i12 = i9 & 489363577;
                    i13 = i9 & 65280;
                    i14 = i9 & 741816008;
                    i19 = (i12 * i21) >> 8;
                    i23 = (i13 * i21) >> 8;
                    i9 = (i14 * i21) >> 8;
                    i17 = i11;
                    i16 = i21;
                    i15 = i22;
                    i20++;
                    i22 = i15;
                    i15 = i19;
                    i11 = i17;
                    i17 = i9;
                    i19 = i25 + i18;
                    i21 = i16;
                    i16 = i23;
                    i23 = i12;
                }
            }
            i9 = i17;
            i19 = i15;
            i12 = i23;
            i23 = i16;
            i17 = i11;
            i15 = i22;
            i16 = i21;
            i20++;
            i22 = i15;
            i15 = i19;
            i11 = i17;
            i17 = i9;
            i19 = i25 + i18;
            i21 = i16;
            i16 = i23;
            i23 = i12;
        }
    }

    public final void bf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 256 - i7;
        if (i < this.aa * -1911399937) {
            i3 -= (this.aa * 889727047) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1122510153) {
            i9 = 0 + (((915450555 * this.aq) - i2) * i10);
            i4 -= (this.aq * -798928603) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > 790960178 * this.ak) {
            i3 = (this.ak * 380071742) - i;
        }
        if (i4 + i2 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = i5 & 16711680;
        int i13 = i5 & 65280;
        int i14 = i5 & 255;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i7 * i13) >> 8;
        int i17 = (i7 * i14) >> 8;
        int i18 = (-846576442 * this.ac) - i3;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        int i20 = 0;
        int i21 = i9;
        int i22 = i13;
        i13 = i12;
        i12 = i11;
        i11 = i7;
        while (i20 < i4) {
            int i23;
            int i24 = -i3;
            int i25 = i19;
            while (i24 < 0) {
                i19 = this.aj[i25];
                i9 = 885324691 & i19;
                int i26 = i9 <= i13 ? i9 : i12 == 0 ? i13 : (((i9 * i12) >> 8) + i15) & -4719799;
                i9 = 65280 & i19;
                if (i9 > i22) {
                    if (i12 == 0) {
                        i9 = i22;
                    } else {
                        i9 = (((i9 * i12) >> 8) + i16) & 65280;
                    }
                }
                i19 &= 255;
                if (i19 > i14) {
                    if (i12 == 0) {
                        i19 = i14;
                    } else {
                        i19 = ((i19 * i12) >> 8) + i17;
                    }
                }
                int i27 = i25 + 1;
                this.aj[i25] = (i9 + i26) + i19;
                i24++;
                i25 = i27;
            }
            if (i10 > 0) {
                i21 += i10;
                i9 = (65536 - i21) >> 8;
                i19 = i21 >> 8;
                if (i7 != i8) {
                    i11 = ((i21 * i8) + ((65536 - i21) * i7)) >> 16;
                    i12 = 1641549001 - i11;
                }
                if (i5 != i6) {
                    i9 = ((((i9 * (65280 & i5)) + (i19 * (708677904 & i6))) & 634896057) + ((((1498598013 & i5) * i9) + ((2036805825 & i6) * i19)) & -16711936)) >>> 8;
                    i16 = i9 & 384445680;
                    i17 = i9 & 584807308;
                    i14 = i9 & 255;
                    i19 = (i16 * i11) >> 8;
                    i22 = (i17 * i11) >> 8;
                    i9 = (i14 * i11) >> 8;
                    i15 = i12;
                    i13 = i11;
                    i12 = i21;
                    i20++;
                    i11 = i13;
                    i13 = i16;
                    i16 = i22;
                    i22 = i17;
                    i17 = i9;
                    i23 = i19;
                    i19 = i25 + i18;
                    i21 = i12;
                    i12 = i15;
                    i15 = i23;
                }
            }
            i9 = i17;
            i19 = i15;
            i17 = i22;
            i15 = i12;
            i22 = i16;
            i12 = i21;
            i16 = i13;
            i13 = i11;
            i20++;
            i11 = i13;
            i13 = i16;
            i16 = i22;
            i22 = i17;
            i17 = i9;
            i23 = i19;
            i19 = i25 + i18;
            i21 = i12;
            i12 = i15;
            i15 = i23;
        }
    }

    public final void bk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 1786642630 - i7;
        if (i < this.aa * 268097018) {
            i3 -= (this.aa * 1244639477) - i;
            i = 1319019636 * this.aa;
        }
        if (i2 < this.aq * -1538082866) {
            i9 = 0 + (((-1857728003 * this.aq) - i2) * i10);
            i4 -= (this.aq * -2084763208) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > -335208436 * this.ak) {
            i3 = (this.ak * 1124656119) - i;
        }
        if (i4 + i2 > this.ao * -90244733) {
            i4 = (this.ao * -280230444) - i2;
        }
        int i12 = i5 & 16711680;
        int i13 = i5 & 65280;
        int i14 = i5 & 255;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i7 * i13) >> 8;
        int i17 = (i7 * i14) >> 8;
        int i18 = (1075116703 * this.ac) - i3;
        int i19 = ((this.ac * 1075116703) * i2) + i;
        int i20 = 0;
        int i21 = i7;
        int i22 = i9;
        int i23 = i12;
        while (i20 < i4) {
            int i24 = -i3;
            int i25 = i19;
            while (i24 < 0) {
                i12 = this.aj[i25];
                i9 = 1533010327 & i12;
                if (i9 > i23) {
                    if (i11 == 0) {
                        i9 = i23;
                    } else {
                        i9 = (((i9 * i11) >> 8) + i15) & -912302850;
                    }
                }
                i19 = 137877388 & i12;
                if (i19 > i13) {
                    if (i11 == 0) {
                        i19 = i13;
                    } else {
                        i19 = (((i19 * i11) >> 8) + i16) & -55839971;
                    }
                }
                i12 &= -464938571;
                if (i12 > i14) {
                    i12 = i11 == 0 ? i14 : ((i12 * i11) >> 8) + i17;
                }
                int i26 = i25 + 1;
                this.aj[i25] = (i9 + i19) + i12;
                i24++;
                i25 = i26;
            }
            if (i10 > 0) {
                i22 += i10;
                i9 = (65536 - i22) >> 8;
                i19 = i22 >> 8;
                if (i7 != i8) {
                    i21 = ((i22 * i8) + ((-944052482 - i22) * i7)) >> 16;
                    i11 = -1920323247 - i21;
                }
                if (i5 != i6) {
                    i9 = ((((i9 * (65280 & i5)) + (i19 * (65280 & i6))) & 299203876) + ((((16711935 & i5) * i9) + ((-1079230083 & i6) * i19)) & -256036357)) >>> 8;
                    i12 = i9 & 16711680;
                    i13 = i9 & 409654656;
                    i14 = i9 & 255;
                    i19 = (i12 * i21) >> 8;
                    i23 = (i13 * i21) >> 8;
                    i9 = (i14 * i21) >> 8;
                    i17 = i11;
                    i16 = i21;
                    i15 = i22;
                    i20++;
                    i22 = i15;
                    i15 = i19;
                    i11 = i17;
                    i17 = i9;
                    i19 = i25 + i18;
                    i21 = i16;
                    i16 = i23;
                    i23 = i12;
                }
            }
            i9 = i17;
            i19 = i15;
            i12 = i23;
            i23 = i16;
            i17 = i11;
            i15 = i22;
            i16 = i21;
            i20++;
            i22 = i15;
            i15 = i19;
            i11 = i17;
            i17 = i9;
            i19 = i25 + i18;
            i21 = i16;
            i16 = i23;
            i23 = i12;
        }
    }

    public final void bl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = -1362447615 / i4;
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * -1751929416) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i9 = 0 + (((1224427268 * this.aq) - i2) * i10);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = 1976287796 * this.aq;
        }
        if (i3 + i > 579810681 * this.ak) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i4 + i2 > this.ao * -882160233) {
            i4 = (this.ao * 582416335) - i2;
        }
        int i12 = i5 & -1546307105;
        int i13 = i5 & 127032294;
        int i14 = i5 & 788847734;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i7 * i14) >> 8;
        int i17 = (78180034 * this.ac) - i3;
        int i18 = ((this.ac * 1075116703) * i2) + i;
        int i19 = (i7 * i13) >> 8;
        int i20 = i14;
        i14 = i12;
        i12 = i7;
        int i21 = i13;
        i13 = i11;
        i11 = i9;
        i9 = i16;
        i16 = i15;
        i15 = i21;
        for (int i22 = 0; i22 < i4; i22++) {
            int i23 = -i3;
            int i24 = i18;
            while (i23 < 0) {
                int i25 = this.aj[i24];
                int i26 = 16711680 & i25;
                if (i26 > i14) {
                    if (i13 == 0) {
                        i26 = i14;
                    } else {
                        i26 = (((i26 * i13) >> 8) + i16) & 16711680;
                    }
                }
                i18 = 65280 & i25;
                if (i18 > i15) {
                    if (i13 == 0) {
                        i18 = i15;
                    } else {
                        i18 = (((i18 * i13) >> 8) + i19) & 65280;
                    }
                }
                i25 &= -1954453193;
                if (i25 > i20) {
                    if (i13 == 0) {
                        i25 = i20;
                    } else {
                        i25 = ((i25 * i13) >> 8) + i9;
                    }
                }
                int i27 = i24 + 1;
                this.aj[i24] = (i26 + i18) + i25;
                i23++;
                i24 = i27;
            }
            if (i10 > 0) {
                i11 += i10;
                i26 = (65536 - i11) >> 8;
                i18 = i11 >> 8;
                if (i7 != i8) {
                    i12 = ((i11 * i8) + ((65536 - i11) * i7)) >> 16;
                    i13 = -1354544121 - i12;
                }
                if (i5 != i6) {
                    i9 = (((((562249563 & i5) * i26) + ((-1548349617 & i6) * i18)) & 136936525) + ((((65280 & i6) * i18) + ((-851338560 & i5) * i26)) & 2079676548)) >>> 8;
                    i14 = i9 & 16711680;
                    i15 = i9 & 65280;
                    i20 = i9 & 1900575834;
                    i16 = (i14 * i12) >> 8;
                    i19 = (i15 * i12) >> 8;
                    i9 = (i20 * i12) >> 8;
                }
            }
            i18 = i24 + i17;
        }
    }

    static gh ak(int i) {
        try {
            gh.ak = 0;
            if (gh.ak * 1963634435 >= gh.aa * 518175009) {
                return null;
            }
            gh[] ghVarArr = gh.ao;
            int i2 = gh.ak - 517295189;
            gh.ak = i2;
            return ghVarArr[(i2 * 1963634435) - 1];
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ak(" + ')');
        }
    }

    public final void ap(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        int i9 = 0;
        try {
            int i10;
            int i11;
            int i12;
            int i13 = 65536 / i4;
            int i14 = 256 - i7;
            if (i < this.aa * 889727047) {
                i10 = i3 - ((this.aa * 889727047) - i);
                i = 889727047 * this.aa;
            } else {
                i10 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i9 = 0 + (((this.aq * -1857728003) - i2) * i13);
                i11 = i4 - ((-1857728003 * this.aq) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i11 = i4;
            }
            if (i10 + i > this.ak * 579810681) {
                i12 = (this.ak * 579810681) - i;
            } else {
                i12 = i10;
            }
            if (i2 + i11 > this.ao * -90244733) {
                i11 = (this.ao * -90244733) - i2;
            }
            int i15 = i5 & 16711680;
            int i16 = i5 & 65280;
            int i17 = i5 & 255;
            int i18 = (i15 * i7) >> 8;
            int i19 = (i7 * i16) >> 8;
            int i20 = (i17 * i7) >> 8;
            int i21 = (this.ac * 1075116703) - i12;
            int i22 = ((this.ac * 1075116703) * i2) + i;
            int i23 = 0;
            int i24 = i7;
            while (i23 < i11) {
                int i25;
                int i26 = -i12;
                int i27 = i22;
                while (i26 < 0) {
                    int i28;
                    i22 = this.aj[i27];
                    i10 = 16711680 & i22;
                    if (i10 >= i15) {
                        i28 = i10;
                    } else if (i14 == 0) {
                        i28 = i15;
                    } else {
                        i28 = (((i10 * i14) >> 8) + i18) & 16711680;
                    }
                    i10 = 65280 & i22;
                    if (i10 < i16) {
                        i10 = i14 == 0 ? i16 : (((i10 * i14) >> 8) + i19) & 65280;
                    }
                    i22 &= 255;
                    if (i22 < i17) {
                        i22 = i14 == 0 ? i17 : ((i22 * i14) >> 8) + i20;
                    }
                    int i29 = i27 + 1;
                    this.aj[i27] = (i10 + i28) + i22;
                    i26++;
                    i27 = i29;
                }
                if (i13 > 0) {
                    i9 += i13;
                    i10 = (65536 - i9) >> 8;
                    i22 = i9 >> 8;
                    if (i7 != i8) {
                        i24 = ((i9 * i8) + ((65536 - i9) * i7)) >> 16;
                        i14 = 256 - i24;
                    }
                    if (i6 != i5) {
                        i10 = ((((i10 * (65280 & i5)) + (i22 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((16711935 & i6) * i22)) & -16711936)) >>> 8;
                        i19 = i10 & 16711680;
                        i20 = i10 & 65280;
                        i17 = i10 & 255;
                        i22 = (i24 * i19) >> 8;
                        i16 = (i24 * i20) >> 8;
                        i10 = (i17 * i24) >> 8;
                        i18 = i14;
                        i15 = i24;
                        i14 = i9;
                        i23++;
                        i24 = i15;
                        i15 = i19;
                        i19 = i16;
                        i16 = i20;
                        i20 = i10;
                        i25 = i22;
                        i22 = i27 + i21;
                        i9 = i14;
                        i14 = i18;
                        i18 = i25;
                    }
                }
                i10 = i20;
                i22 = i18;
                i20 = i16;
                i18 = i14;
                i16 = i19;
                i14 = i9;
                i19 = i15;
                i15 = i24;
                i23++;
                i24 = i15;
                i15 = i19;
                i19 = i16;
                i16 = i20;
                i20 = i10;
                i25 = i22;
                i22 = i27 + i21;
                i9 = i14;
                i14 = i18;
                i18 = i25;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ap(" + ')');
        }
    }

    public final void cb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 256 - i7;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * 889727047) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > this.ak * 579810681) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i12 = i5 & 16711680;
        int i13 = i5 & 65280;
        int i14 = i5 & 255;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i14 * i7) >> 8;
        int i17 = (this.ac * 1075116703) - i3;
        int i18 = ((this.ac * 1075116703) * i2) + i;
        int i19 = (i7 * i13) >> 8;
        int i20 = i14;
        i14 = i12;
        i12 = i7;
        int i21 = i13;
        i13 = i11;
        i11 = i9;
        i9 = i16;
        i16 = i15;
        i15 = i21;
        for (int i22 = 0; i22 < i4; i22++) {
            int i23 = -i3;
            int i24 = i18;
            while (i23 < 0) {
                int i25 = this.aj[i24];
                int i26 = 16711680 & i25;
                int i27 = i26 >= i14 ? i26 : i13 == 0 ? i14 : (((i26 * i13) >> 8) + i16) & 16711680;
                i26 = 65280 & i25;
                if (i26 >= i15) {
                    i18 = i26;
                } else if (i13 == 0) {
                    i18 = i15;
                } else {
                    i18 = (((i26 * i13) >> 8) + i19) & 65280;
                }
                i26 = i25 & 255;
                if (i26 < i20) {
                    i26 = i13 == 0 ? i20 : ((i26 * i13) >> 8) + i9;
                }
                i25 = i24 + 1;
                this.aj[i24] = i26 + (i18 + i27);
                i23++;
                i24 = i25;
            }
            if (i10 > 0) {
                i11 += i10;
                i26 = (65536 - i11) >> 8;
                i18 = i11 >> 8;
                if (i7 != i8) {
                    i12 = ((i11 * i8) + ((65536 - i11) * i7)) >> 16;
                    i13 = 256 - i12;
                }
                if (i6 != i5) {
                    i9 = (((((16711935 & i5) * i26) + ((16711935 & i6) * i18)) & -16711936) + ((((65280 & i5) * i26) + ((65280 & i6) * i18)) & 16711680)) >>> 8;
                    i14 = i9 & 16711680;
                    i15 = i9 & 65280;
                    i20 = i9 & 255;
                    i16 = (i12 * i14) >> 8;
                    i19 = (i12 * i15) >> 8;
                    i9 = (i20 * i12) >> 8;
                }
            }
            i18 = i24 + i17;
        }
    }

    public final void cy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 256 - i7;
        if (i < this.aa * 1025597177) {
            i3 -= (this.aa * 889727047) - i;
            i = -1634595080 * this.aa;
        }
        if (i2 < this.aq * -1362257088) {
            i9 = 0 + (((this.aq * -470553867) - i2) * i10);
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > this.ak * -1652032984) {
            i3 = (this.ak * -902819034) - i;
        }
        if (i2 + i4 > this.ao * -1395399441) {
            i4 = (this.ao * 1876485779) - i2;
        }
        int i12 = i5 & 16711680;
        int i13 = i5 & 65280;
        int i14 = i5 & 659909894;
        int i15 = (i12 * i7) >> 8;
        int i16 = (i7 * i13) >> 8;
        int i17 = (i14 * i7) >> 8;
        int i18 = (this.ac * 1026299070) - i3;
        int i19 = ((this.ac * -397536922) * i2) + i;
        int i20 = 0;
        int i21 = i7;
        int i22 = i9;
        int i23 = i12;
        while (i20 < i4) {
            int i24 = -i3;
            int i25 = i19;
            while (i24 < 0) {
                i12 = this.aj[i25];
                i9 = -1020341660 & i12;
                if (i9 < i23) {
                    if (i11 == 0) {
                        i9 = i23;
                    } else {
                        i9 = (((i9 * i11) >> 8) + i15) & 1261395351;
                    }
                }
                i19 = 65280 & i12;
                if (i19 < i13) {
                    if (i11 == 0) {
                        i19 = i13;
                    } else {
                        i19 = (((i19 * i11) >> 8) + i16) & 65280;
                    }
                }
                i12 &= 255;
                if (i12 < i14) {
                    if (i11 == 0) {
                        i12 = i14;
                    } else {
                        i12 = ((i12 * i11) >> 8) + i17;
                    }
                }
                int i26 = i25 + 1;
                this.aj[i25] = (i9 + i19) + i12;
                i24++;
                i25 = i26;
            }
            if (i10 > 0) {
                i22 += i10;
                i9 = (65536 - i22) >> 8;
                i19 = i22 >> 8;
                if (i7 != i8) {
                    i21 = ((i22 * i8) + ((1368138385 - i22) * i7)) >> 16;
                    i11 = 529995193 - i21;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (-909407874 & i5)) + (i19 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i19)) & -16711936)) >>> 8;
                    i12 = i9 & 16711680;
                    i13 = i9 & 65280;
                    i14 = i9 & 1332212310;
                    i19 = (i21 * i12) >> 8;
                    i23 = (i21 * i13) >> 8;
                    i9 = (i14 * i21) >> 8;
                    i17 = i11;
                    i16 = i21;
                    i15 = i22;
                    i20++;
                    i22 = i15;
                    i15 = i19;
                    i11 = i17;
                    i17 = i9;
                    i19 = i25 + i18;
                    i21 = i16;
                    i16 = i23;
                    i23 = i12;
                }
            }
            i9 = i17;
            i19 = i15;
            i12 = i23;
            i23 = i16;
            i17 = i11;
            i15 = i22;
            i16 = i21;
            i20++;
            i22 = i15;
            i15 = i19;
            i11 = i17;
            i17 = i9;
            i19 = i25 + i18;
            i21 = i16;
            i16 = i23;
            i23 = i12;
        }
    }

    public final void at(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        try {
            int i9;
            int i10;
            int i11;
            int i12 = 65536 / i4;
            if (i < this.aa * 889727047) {
                i9 = i3 - ((this.aa * 889727047) - i);
                i = this.aa * 889727047;
            } else {
                i9 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i8 = 0 + (((this.aq * -1857728003) - i2) * i12);
                i10 = i4 - ((-1857728003 * this.aq) - i2);
                i2 = this.aq * -1857728003;
            } else {
                i10 = i4;
            }
            if (i9 + i > this.ak * 579810681) {
                i11 = (this.ak * 579810681) - i;
            } else {
                i11 = i9;
            }
            if (i2 + i10 > -90244733 * this.ao) {
                i10 = (this.ao * -90244733) - i2;
            }
            int i13 = (1075116703 * this.ac) - i11;
            i9 = ((this.ac * 1075116703) * i2) + i;
            int i14 = -i10;
            int i15 = i8;
            while (i14 < 0) {
                i10 = (65536 - i15) >> 8;
                i8 = i15 >> 8;
                int i16 = ((((i10 * (65280 & i5)) + (i8 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((16711935 & i6) * i8)) & -16711936)) >>> 8;
                i10 = -i11;
                while (i10 < 0) {
                    i8 = i9 + 1;
                    this.aj[i9] = i16;
                    i10++;
                    i9 = i8;
                }
                i9 += i13;
                i14++;
                i15 += i12;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.at(" + ')');
        }
    }

    public final void cc(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 65536 / i4;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * 889727047) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i7 = 0 + (((this.aq * -1857728003) - i2) * i8);
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = this.aq * -1857728003;
        }
        if (i3 + i > this.ak * 579810681) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i2 + i4 > -90244733 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i9 = (1075116703 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((this.ac * 1075116703) * i2) + i;
        while (i10 < 0) {
            i7 = (65536 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = ((((i7 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i7) + ((16711935 & i6) * i13)) & -16711936)) >>> 8;
            i7 = -i3;
            while (i7 < 0) {
                i13 = i12 + 1;
                this.aj[i12] = i14;
                i7++;
                i12 = i13;
            }
            i12 += i9;
            i10++;
            i11 += i8;
        }
    }

    public final void cl(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 65536 / i4;
        if (i < this.aa * 889727047) {
            i3 -= (this.aa * 889727047) - i;
            i = this.aa * -266759031;
        }
        if (i2 < this.aq * 728902099) {
            i7 = 0 + (((this.aq * 1277761487) - i2) * i8);
            i4 -= (-728630155 * this.aq) - i2;
            i2 = this.aq * -1857728003;
        }
        if (i3 + i > this.ak * -467169161) {
            i3 = (this.ak * -654070799) - i;
        }
        if (i2 + i4 > 600504247 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i9 = (1075116703 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((this.ac * 1855881974) * i2) + i;
        while (i10 < 0) {
            i7 = (65536 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = ((((i7 * (65280 & i5)) + (i13 * (65280 & i6))) & -1430762412) + ((((531202923 & i5) * i7) + ((-1763517746 & i6) * i13)) & -16711936)) >>> 8;
            i7 = -i3;
            while (i7 < 0) {
                i13 = i12 + 1;
                this.aj[i12] = i14;
                i7++;
                i12 = i13;
            }
            i12 += i9;
            i10++;
            i11 += i8;
        }
    }

    public final void co(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 1763536805 / i4;
        if (i < this.aa * 1358579044) {
            i3 -= (this.aa * -767315538) - i;
            i = this.aa * -887185796;
        }
        if (i2 < this.aq * -1457995903) {
            i7 = 0 + (((this.aq * 907736169) - i2) * i8);
            i4 -= (1126131109 * this.aq) - i2;
            i2 = this.aq * -1857728003;
        }
        if (i3 + i > this.ak * 223304872) {
            i3 = (this.ak * 225978446) - i;
        }
        if (i2 + i4 > -90244733 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i9 = (1110402443 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((this.ac * 1075116703) * i2) + i;
        while (i10 < 0) {
            i7 = (65536 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = ((((i7 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((-340425587 & i5) * i7) + ((16711935 & i6) * i13)) & -16711936)) >>> 8;
            i7 = -i3;
            while (i7 < 0) {
                i13 = i12 + 1;
                this.aj[i12] = i14;
                i7++;
                i12 = i13;
            }
            i12 += i9;
            i10++;
            i11 += i8;
        }
    }

    public final void ah(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z, int i8) {
        if (i + i3 >= 0 && i2 + i4 >= 0 && i < 1075116703 * this.ac && i2 < -1283456967 * this.an) {
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            if (i < 0) {
                i9 = 0 - i;
                i10 = i3 + i;
            } else {
                i9 = 0;
                i10 = i3;
            }
            if (i2 < 0) {
                i11 = 0 - i2;
                i12 = i4 + i2;
            } else {
                i11 = 0;
                i12 = i4;
            }
            if (i + i10 > 1075116703 * this.ac) {
                i13 = (this.ac * 1075116703) - i;
            } else {
                i13 = i10;
            }
            if (i12 + i2 > this.an * -1283456967) {
                i14 = (-1283456967 * this.an) - i2;
            } else {
                i14 = i12;
            }
            int length = bArr.length / i7;
            int i15 = (this.ac * 1075116703) - i13;
            i12 = i5 >>> 24;
            i10 = i6 >>> 24;
            int i16;
            int i17;
            if (!z || (255 == i12 && 255 == i10)) {
                i10 = i9 + (((i2 + i11) * (this.ac * 1075116703)) + i);
                for (i16 = i11 + i2; i16 < (i2 + i11) + i14; i16++) {
                    i17 = i10;
                    i10 = i9 + i;
                    while (i10 < (i9 + i) + i13) {
                        if (bArr[(((i16 - i2) % length) * i7) + ((i10 - i) % i7)] != (byte) 0) {
                            i12 = i17 + 1;
                            this.aj[i17] = i6;
                        } else {
                            i12 = i17 + 1;
                            this.aj[i17] = i5;
                        }
                        i10++;
                        i17 = i12;
                    }
                    i10 = i17 + i15;
                }
                return;
            }
            try {
                i10 = i9 + (((this.ac * 1075116703) * (i11 + i2)) + i);
                for (int i18 = i2 + i11; i18 < (i11 + i2) + i14; i18++) {
                    i17 = i10;
                    i10 = i + i9;
                    while (i10 < (i9 + i) + i13) {
                        if (bArr[(((i18 - i2) % length) * i7) + ((i10 - i) % i7)] != (byte) 0) {
                            i12 = i6;
                        } else {
                            i12 = i5;
                        }
                        i16 = i12 >>> 24;
                        int i19 = 255 - i16;
                        int i20 = this.aj[i17];
                        i12 = (((((i12 & 65280) * i16) + ((65280 & i20) * i19)) & 16711680) + ((((16711935 & i20) * i19) + ((16711935 & i12) * i16)) & -16711936)) >> 8;
                        i16 = i17 + 1;
                        this.aj[i17] = i12;
                        i10++;
                        i17 = i16;
                    }
                    i10 = i17 + i15;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ev.ah(" + ')');
            }
        }
    }

    public final void ca(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i2 + i4 >= 0 && i < 1075116703 * this.ac && i2 < -1283456967 * this.an) {
            int i8;
            int i9;
            int i10 = 0;
            if (i < 0) {
                i8 = 0 - i;
                i9 = i3 + i;
            } else {
                i8 = 0;
                i9 = i3;
            }
            if (i2 < 0) {
                i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i9 > 1075116703 * this.ac) {
                i9 = (this.ac * 1075116703) - i;
            }
            if (i4 + i2 > this.an * -1283456967) {
                i4 = (-1283456967 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ac * 1075116703) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (255 == i12 && 255 == i13)) {
                i13 = i8 + (((i2 + i10) * (this.ac * 1075116703)) + i);
                for (i14 = i10 + i2; i14 < (i2 + i10) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i8 + i) + i9) {
                        if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i15 + 1;
                            this.aj[i15] = i6;
                        } else {
                            i12 = i15 + 1;
                            this.aj[i15] = i5;
                        }
                        i13++;
                        i15 = i12;
                    }
                    i13 = i15 + i11;
                }
                return;
            }
            i13 = i8 + (((this.ac * 1075116703) * (i10 + i2)) + i);
            for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                i15 = i13;
                i13 = i + i8;
                while (i13 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i14 = i12 >>> 24;
                    int i17 = 255 - i14;
                    int i18 = this.aj[i15];
                    i12 = (((((i12 & 65280) * i14) + ((65280 & i18) * i17)) & 16711680) + ((((16711935 & i18) * i17) + ((16711935 & i12) * i14)) & -16711936)) >> 8;
                    i14 = i15 + 1;
                    this.aj[i15] = i12;
                    i13++;
                    i15 = i14;
                }
                i13 = i15 + i11;
            }
        }
    }

    public final void cf(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i2 + i4 >= 0 && i < 1075116703 * this.ac && i2 < -1283456967 * this.an) {
            int i8;
            int i9;
            int i10 = 0;
            if (i < 0) {
                i8 = 0 - i;
                i9 = i3 + i;
            } else {
                i8 = 0;
                i9 = i3;
            }
            if (i2 < 0) {
                i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i9 > 1075116703 * this.ac) {
                i9 = (this.ac * 1075116703) - i;
            }
            if (i4 + i2 > this.an * -1283456967) {
                i4 = (-1283456967 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ac * 1075116703) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (255 == i12 && 255 == i13)) {
                i13 = i8 + (((i2 + i10) * (this.ac * 1075116703)) + i);
                for (i14 = i10 + i2; i14 < (i2 + i10) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i8 + i) + i9) {
                        if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i15 + 1;
                            this.aj[i15] = i6;
                        } else {
                            i12 = i15 + 1;
                            this.aj[i15] = i5;
                        }
                        i13++;
                        i15 = i12;
                    }
                    i13 = i15 + i11;
                }
                return;
            }
            i13 = i8 + (((this.ac * 1075116703) * (i10 + i2)) + i);
            for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                i15 = i13;
                i13 = i + i8;
                while (i13 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i14 = i12 >>> 24;
                    int i17 = 255 - i14;
                    int i18 = this.aj[i15];
                    i12 = (((((i12 & 65280) * i14) + ((65280 & i18) * i17)) & 16711680) + ((((16711935 & i18) * i17) + ((16711935 & i12) * i14)) & -16711936)) >> 8;
                    i14 = i15 + 1;
                    this.aj[i15] = i12;
                    i13++;
                    i15 = i14;
                }
                i13 = i15 + i11;
            }
        }
    }

    public final void cr(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i2 + i4 >= 0 && i < 1075116703 * this.ac) {
            if (i2 < 35203666 * this.an) {
                int i8;
                int i9;
                int i10 = 0;
                if (i < 0) {
                    i8 = 0 - i;
                    i9 = i3 + i;
                } else {
                    i8 = 0;
                    i9 = i3;
                }
                if (i2 < 0) {
                    i10 = 0 - i2;
                    i4 += i2;
                }
                if (i + i9 > 1075116703 * this.ac) {
                    i9 = (this.ac * -844497626) - i;
                }
                if (i4 + i2 > this.an * -1258519912) {
                    i4 = (580923772 * this.an) - i2;
                }
                int length = bArr.length / i7;
                int i11 = (this.ac * 1075116703) - i9;
                int i12 = i5 >>> 24;
                int i13 = i6 >>> 24;
                int i14;
                int i15;
                if (!z || (255 == i12 && 1536571971 == i13)) {
                    i13 = i8 + (((i2 + i10) * (this.ac * 1075116703)) + i);
                    for (i14 = i10 + i2; i14 < (i2 + i10) + i4; i14++) {
                        i15 = i13;
                        i13 = i8 + i;
                        while (i13 < (i8 + i) + i9) {
                            if (bArr[(((i14 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                                i12 = i15 + 1;
                                this.aj[i15] = i6;
                            } else {
                                i12 = i15 + 1;
                                this.aj[i15] = i5;
                            }
                            i13++;
                            i15 = i12;
                        }
                        i13 = i15 + i11;
                    }
                    return;
                }
                i13 = i8 + (((this.ac * 1075116703) * (i10 + i2)) + i);
                for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                    i15 = i13;
                    i13 = i + i8;
                    while (i13 < (i8 + i) + i9) {
                        if (bArr[(((i16 - i2) % length) * i7) + ((i13 - i) % i7)] != (byte) 0) {
                            i12 = i6;
                        } else {
                            i12 = i5;
                        }
                        i14 = i12 >>> 24;
                        int i17 = 255 - i14;
                        int i18 = this.aj[i15];
                        i12 = (((((i12 & -698264338) * i14) + ((1858328177 & i18) * i17)) & 16711680) + ((((16711935 & i18) * i17) + ((-1296886214 & i12) * i14)) & -16711936)) >> 8;
                        i14 = i15 + 1;
                        this.aj[i15] = i12;
                        i13++;
                        i15 = i14;
                    }
                    i13 = i15 + i11;
                }
            }
        }
    }

    public final void ai(int i, int i2, int i3, int i4, int i5) {
        try {
            if (i2 >= this.aq * -1857728003 && i2 < -90244733 * this.ao) {
                int i6;
                int i7;
                if (i < this.aa * 889727047) {
                    i6 = i3 - ((this.aa * 889727047) - i);
                    i = this.aa * 889727047;
                } else {
                    i6 = i3;
                }
                if (i + i6 > this.ak * 579810681) {
                    i7 = (this.ak * 579810681) - i;
                } else {
                    i7 = i6;
                }
                int i8 = ((this.ac * 1075116703) * i2) + i;
                for (i6 = 0; i6 < i7; i6++) {
                    this.aj[i8 + i6] = i4;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ai(" + ')');
        }
    }

    public final void en(int i, int i2, int i3, int i4) {
        if (i2 >= this.aq * -477300514 && i2 < 2066537526 * this.ao) {
            if (i < 453618602 * this.aa) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * -1122259757;
            }
            if (i + i3 > this.ak * 1585113406) {
                i3 = (1170290406 * this.ak) - i;
            }
            int i5 = ((this.ac * 1781547125) * i2) + i;
            for (int i6 = 0; i6 < i3; i6++) {
                this.aj[i5 + i6] = i4;
            }
        }
    }

    public final void ev(int i, int i2, int i3, int i4) {
        if (i2 >= this.aq * -1857728003 && i2 < -90244733 * this.ao) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 889727047;
            }
            if (i + i3 > this.ak * 579810681) {
                i3 = (this.ak * 579810681) - i;
            }
            int i5 = ((this.ac * 1075116703) * i2) + i;
            for (int i6 = 0; i6 < i3; i6++) {
                this.aj[i5 + i6] = i4;
            }
        }
    }

    final void aw(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (i2 >= this.aq * -1857728003 && i2 < -90244733 * this.ao) {
                int i7;
                if (i < 889727047 * this.aa) {
                    i7 = i3 - ((889727047 * this.aa) - i);
                    i = this.aa * 889727047;
                } else {
                    i7 = i3;
                }
                if (i + i7 > 579810681 * this.ak) {
                    i7 = (579810681 * this.ak) - i;
                }
                int i8 = 256 - i5;
                int i9 = ((i4 >> 16) & 255) * i5;
                int i10 = ((i4 >> 8) & 255) * i5;
                int i11 = i5 * (i4 & 255);
                int i12 = i + ((1075116703 * this.ac) * i2);
                int i13 = 0;
                while (i13 < i7) {
                    int i14 = (((((this.aj[i12] >> 16) & 255) * i8) + i9) >> 8) << 16;
                    int i15 = ((i11 + ((this.aj[i12] & 255) * i8)) >> 8) + (i14 + ((((((this.aj[i12] >> 8) & 255) * i8) + i10) >> 8) << 8));
                    i14 = i12 + 1;
                    this.aj[i12] = i15;
                    i13++;
                    i12 = i14;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.aw(" + ')');
        }
    }

    final void ck(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.aq * -1857728003 && i2 < 1037154604 * this.ao) {
            if (i < -1248687268 * this.aa) {
                i3 -= (-806321684 * this.aa) - i;
                i = this.aa * 889727047;
            }
            if (i + i3 > 579810681 * this.ak) {
                i3 = (1942580801 * this.ak) - i;
            }
            int i6 = 256 - i5;
            int i7 = ((i4 >> 16) & 255) * i5;
            int i8 = ((i4 >> 8) & -2120192447) * i5;
            int i9 = i5 * (-1616783159 & i4);
            int i10 = i + ((1075116703 * this.ac) * i2);
            int i11 = 0;
            while (i11 < i3) {
                int i12 = (((((this.aj[i10] >> 16) & -1968855194) * i6) + i7) >> 8) << 16;
                int i13 = ((i9 + ((this.aj[i10] & -871669050) * i6)) >> 8) + (i12 + ((((((this.aj[i10] >> 8) & 1907892481) * i6) + i8) >> 8) << 8));
                i12 = i10 + 1;
                this.aj[i10] = i13;
                i11++;
                i10 = i12;
            }
        }
    }

    final void cm(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.aq * -323469956 && i2 < -1664780281 * this.ao) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 616253400;
            }
            if (i + i3 > -1703529728 * this.ak) {
                i3 = (579810681 * this.ak) - i;
            }
            int i6 = -1552780517 - i5;
            int i7 = ((i4 >> 16) & -454969304) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = i5 * (1021189178 & i4);
            int i10 = i + ((1075116703 * this.ac) * i2);
            int i11 = 0;
            while (i11 < i3) {
                int i12 = (((((this.aj[i10] >> 16) & 255) * i6) + i7) >> 8) << 16;
                int i13 = ((i9 + ((this.aj[i10] & 710804147) * i6)) >> 8) + (i12 + ((((((this.aj[i10] >> 8) & 1986033598) * i6) + i8) >> 8) << 8));
                i12 = i10 + 1;
                this.aj[i10] = i13;
                i11++;
                i10 = i12;
            }
        }
    }

    final void cp(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.aq * -1857728003 && i2 < -90244733 * this.ao) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 889727047;
            }
            if (i + i3 > this.ak * 579810681) {
                i3 = (this.ak * 579810681) - i;
            }
            int i6 = 256 - i5;
            int i7 = ((i4 >> 16) & 255) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = i5 * (i4 & 255);
            int i10 = i + ((1075116703 * this.ac) * i2);
            int i11 = 0;
            while (i11 < i3) {
                int i12 = (((((this.aj[i10] >> 16) & 255) * i6) + i7) >> 8) << 16;
                int i13 = ((i9 + ((this.aj[i10] & 255) * i6)) >> 8) + (i12 + ((((((this.aj[i10] >> 8) & 255) * i6) + i8) >> 8) << 8));
                i12 = i10 + 1;
                this.aj[i10] = i13;
                i11++;
                i10 = i12;
            }
        }
    }

    final void ct(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.aq * -1426991261 && i2 < 461915798 * this.ao) {
            if (i < this.aa * 889727047) {
                i3 -= (-1449047166 * this.aa) - i;
                i = this.aa * 889727047;
            }
            if (i + i3 > this.ak * 579810681) {
                i3 = (this.ak * 579810681) - i;
            }
            int i6 = -1895370316 - i5;
            int i7 = ((i4 >> 16) & 2046599870) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = i5 * (-1101824144 & i4);
            int i10 = i + ((1075116703 * this.ac) * i2);
            int i11 = 0;
            while (i11 < i3) {
                int i12 = (((((this.aj[i10] >> 16) & -1004757333) * i6) + i7) >> 8) << 16;
                int i13 = ((i9 + ((this.aj[i10] & -1030629307) * i6)) >> 8) + (i12 + ((((((this.aj[i10] >> 8) & -552947870) * i6) + i8) >> 8) << 8));
                i12 = i10 + 1;
                this.aj[i10] = i13;
                i11++;
                i10 = i12;
            }
        }
    }

    public final void am(int i, int i2, int i3, int i4, byte b) {
        try {
            if (i >= 889727047 * this.aa && i < 579810681 * this.ak) {
                int i5;
                int i6;
                if (i2 < this.aq * -1857728003) {
                    i5 = i3 - ((this.aq * -1857728003) - i2);
                    i2 = -1857728003 * this.aq;
                } else {
                    i5 = i3;
                }
                if (i5 + i2 > this.ao * -90244733) {
                    i6 = (this.ao * -90244733) - i2;
                } else {
                    i6 = i5;
                }
                int i7 = ((this.ac * 1075116703) * i2) + i;
                for (i5 = 0; i5 < i6; i5++) {
                    this.aj[((this.ac * 1075116703) * i5) + i7] = i4;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.am(" + ')');
        }
    }

    public final void ce(int i, int i2, int i3, int i4) {
        if (i >= 889727047 * this.aa && i < 579810681 * this.ak) {
            if (i2 < this.aq * -1857728003) {
                i3 -= (this.aq * -1857728003) - i2;
                i2 = -1857728003 * this.aq;
            }
            if (i3 + i2 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i5 = ((this.ac * 1075116703) * i2) + i;
            for (int i6 = 0; i6 < i3; i6++) {
                this.aj[((this.ac * 1075116703) * i6) + i5] = i4;
            }
        }
    }

    public final void ch(int i, int i2, int i3, int i4) {
        if (i >= 889727047 * this.aa && i < 579810681 * this.ak) {
            if (i2 < this.aq * -1857728003) {
                i3 -= (this.aq * -1857728003) - i2;
                i2 = -1857728003 * this.aq;
            }
            if (i3 + i2 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i5 = ((this.ac * 1075116703) * i2) + i;
            for (int i6 = 0; i6 < i3; i6++) {
                this.aj[((this.ac * 1075116703) * i6) + i5] = i4;
            }
        }
    }

    final void ae(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (i >= this.aa * 889727047 && i < this.ak * 579810681) {
                int i7;
                if (i2 < this.aq * -1857728003) {
                    i7 = i3 - ((-1857728003 * this.aq) - i2);
                    i2 = -1857728003 * this.aq;
                } else {
                    i7 = i3;
                }
                if (i2 + i7 > -90244733 * this.ao) {
                    i7 = (-90244733 * this.ao) - i2;
                }
                int i8 = 256 - i5;
                int i9 = ((i4 >> 16) & 255) * i5;
                int i10 = ((i4 >> 8) & 255) * i5;
                int i11 = i5 * (i4 & 255);
                int i12 = i + ((1075116703 * this.ac) * i2);
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (((((this.aj[i12] >> 16) & 255) * i8) + i9) >> 8) << 16;
                    this.aj[i12] = (i14 + ((((((this.aj[i12] >> 8) & 255) * i8) + i10) >> 8) << 8)) + ((i11 + ((this.aj[i12] & 255) * i8)) >> 8);
                    i12 += 1075116703 * this.ac;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ae(" + ')');
        }
    }

    final void ci(int i, int i2, int i3, int i4, int i5) {
        if (i >= this.aa * 889727047 && i < this.ak * 579810681) {
            if (i2 < this.aq * -1857728003) {
                i3 -= (this.aq * -1857728003) - i2;
                i2 = -1857728003 * this.aq;
            }
            if (i2 + i3 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i6 = 256 - i5;
            int i7 = ((i4 >> 16) & 255) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = i5 * (i4 & 255);
            int i10 = i + ((this.ac * 1075116703) * i2);
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = (((((this.aj[i10] >> 16) & 255) * i6) + i7) >> 8) << 16;
                this.aj[i10] = (i12 + ((((((this.aj[i10] >> 8) & 255) * i6) + i8) >> 8) << 8)) + ((i9 + ((this.aj[i10] & 255) * i6)) >> 8);
                i10 += this.ac * 1075116703;
            }
        }
    }

    final void cq(int i, int i2, int i3, int i4, int i5) {
        if (i >= this.aa * 889727047 && i < this.ak * 579810681) {
            if (i2 < this.aq * -1857728003) {
                i3 -= (this.aq * -1857728003) - i2;
                i2 = -1857728003 * this.aq;
            }
            if (i2 + i3 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i6 = 256 - i5;
            int i7 = ((i4 >> 16) & 255) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = i5 * (i4 & 255);
            int i10 = i + ((this.ac * 1075116703) * i2);
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = (((((this.aj[i10] >> 16) & 255) * i6) + i7) >> 8) << 16;
                this.aj[i10] = (i12 + ((((((this.aj[i10] >> 8) & 255) * i6) + i8) >> 8) << 8)) + ((i9 + ((this.aj[i10] & 255) * i6)) >> 8);
                i10 += this.ac * 1075116703;
            }
        }
    }

    public final void as(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                try {
                    ai(i, i2, i6 + 1, i5, -1258761922);
                    return;
                } catch (Throwable e) {
                    throw ei.ac(e, "ev.as(" + ')');
                }
            }
            ai(i + i6, i2, (-i6) + 1, i5, -1984877146);
        } else if (i6 != 0) {
            int i8;
            int i9;
            if (i6 + i7 < 0) {
                i2 += i7;
                i7 = -i7;
                i8 = -i6;
                i6 = i + i6;
                i9 = i2;
            } else {
                i8 = i6;
                i9 = i2;
                i6 = i;
            }
            int floor;
            if (i8 > i7) {
                i9 = (i9 << 16) + 32768;
                floor = (int) Math.floor((((double) (i7 << 16)) / ((double) i8)) + 0.5d);
                i7 = i8 + i6;
                if (i6 < 889727047 * this.aa) {
                    i9 += ((this.aa * 889727047) - i6) * floor;
                    i6 = 889727047 * this.aa;
                }
                if (i7 >= this.ak * 579810681) {
                    i7 = (this.ak * 579810681) - 1;
                }
                while (i6 <= i7) {
                    i8 = i9 >> 16;
                    if (i8 >= this.aq * -1857728003 && i8 < -90244733 * this.ao) {
                        this.aj[(i8 * (1075116703 * this.ac)) + i6] = i5;
                    }
                    i9 += floor;
                    i6++;
                }
                return;
            }
            i6 = (i6 << 16) + 32768;
            i8 = (int) Math.floor(0.5d + (((double) (i8 << 16)) / ((double) i7)));
            i7 += i9;
            if (i9 < -1857728003 * this.aq) {
                i6 += ((this.aq * -1857728003) - i9) * i8;
                i9 = -1857728003 * this.aq;
            }
            if (i7 >= this.ao * -90244733) {
                i7 = (-90244733 * this.ao) - 1;
            }
            while (i9 <= i7) {
                floor = i6 >> 16;
                if (floor >= 889727047 * this.aa && floor < this.ak * 579810681) {
                    this.aj[floor + ((this.ac * 1075116703) * i9)] = i5;
                }
                i6 += i8;
                i9++;
            }
        } else if (i7 >= 0) {
            am(i, i2, i7 + 1, i5, (byte) -84);
        } else {
            am(i, i7 + i2, (-i7) + 1, i5, (byte) -98);
        }
    }

    public final void cg(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ai(i, i2, i6 + 1, i5, -1381475350);
                return;
            }
            ai(i + i6, i2, (-i6) + 1, i5, -1885786444);
        } else if (i6 != 0) {
            int i8;
            int i9;
            if (i6 + i7 < 0) {
                i += i6;
                i8 = -i6;
                i6 = -i7;
                i9 = i8;
                i7 = i2 + i7;
                i8 = i;
            } else {
                i9 = i6;
                i8 = i;
                i6 = i7;
                i7 = i2;
            }
            int floor;
            int i10;
            if (i9 > i6) {
                i7 = (i7 << 16) + 32768;
                floor = (int) Math.floor((((double) (i6 << 16)) / ((double) i9)) + 0.5d);
                i6 = i9 + i8;
                if (i8 < -1226809726 * this.aa) {
                    i7 += ((this.aa * 33229798) - i8) * floor;
                    i8 = 889727047 * this.aa;
                }
                if (i6 >= this.ak * -1846055298) {
                    i6 = i8;
                    i8 = i7;
                    i7 = (this.ak * 579810681) - 1;
                } else {
                    i10 = i6;
                    i6 = i8;
                    i8 = i7;
                    i7 = i10;
                }
                while (i6 <= i7) {
                    i9 = i8 >> 16;
                    if (i9 >= this.aq * 1175460868 && i9 < -90244733 * this.ao) {
                        this.aj[(i9 * (-1044456363 * this.ac)) + i6] = i5;
                    }
                    i8 += floor;
                    i6++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i9 = (int) Math.floor(0.5d + (((double) (i9 << 16)) / ((double) i6)));
            i6 += i7;
            if (i7 < -753823107 * this.aq) {
                i8 += ((this.aq * 1109932332) - i7) * i9;
                i7 = 1569970279 * this.aq;
            }
            if (i6 >= this.ao * -90244733) {
                i6 = i8;
                i8 = i7;
                i7 = (120059362 * this.ao) - 1;
            } else {
                i10 = i6;
                i6 = i8;
                i8 = i7;
                i7 = i10;
            }
            while (i8 <= i7) {
                floor = i6 >> 16;
                if (floor >= 889727047 * this.aa && floor < this.ak * -1406448596) {
                    this.aj[floor + ((this.ac * 1075116703) * i8)] = i5;
                }
                i6 += i9;
                i8++;
            }
        } else if (i7 >= 0) {
            am(i, i2, i7 + 1, i5, (byte) -36);
        } else {
            am(i, i7 + i2, (-i7) + 1, i5, (byte) -29);
        }
    }

    public final void cu(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ai(i, i2, i6 + 1, i5, -1841016135);
                return;
            }
            ai(i + i6, i2, (-i6) + 1, i5, -1277337473);
        } else if (i6 != 0) {
            int i8;
            int i9;
            if (i6 + i7 < 0) {
                i += i6;
                i8 = -i6;
                i6 = -i7;
                i9 = i8;
                i7 = i2 + i7;
                i8 = i;
            } else {
                i9 = i6;
                i8 = i;
                i6 = i7;
                i7 = i2;
            }
            int floor;
            int i10;
            if (i9 > i6) {
                i7 = (i7 << 16) + 32768;
                floor = (int) Math.floor((((double) (i6 << 16)) / ((double) i9)) + 0.5d);
                i6 = i9 + i8;
                if (i8 < 889727047 * this.aa) {
                    i7 += ((this.aa * 889727047) - i8) * floor;
                    i8 = 889727047 * this.aa;
                }
                if (i6 >= this.ak * 579810681) {
                    i6 = i8;
                    i8 = i7;
                    i7 = (this.ak * 579810681) - 1;
                } else {
                    i10 = i6;
                    i6 = i8;
                    i8 = i7;
                    i7 = i10;
                }
                while (i6 <= i7) {
                    i9 = i8 >> 16;
                    if (i9 >= this.aq * -1857728003 && i9 < -90244733 * this.ao) {
                        this.aj[(i9 * (1075116703 * this.ac)) + i6] = i5;
                    }
                    i8 += floor;
                    i6++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i9 = (int) Math.floor(0.5d + (((double) (i9 << 16)) / ((double) i6)));
            i6 += i7;
            if (i7 < -1857728003 * this.aq) {
                i8 += ((this.aq * -1857728003) - i7) * i9;
                i7 = -1857728003 * this.aq;
            }
            if (i6 >= this.ao * -90244733) {
                i6 = i8;
                i8 = i7;
                i7 = (-90244733 * this.ao) - 1;
            } else {
                i10 = i6;
                i6 = i8;
                i8 = i7;
                i7 = i10;
            }
            while (i8 <= i7) {
                floor = i6 >> 16;
                if (floor >= 889727047 * this.aa && floor < this.ak * 579810681) {
                    this.aj[floor + ((this.ac * 1075116703) * i8)] = i5;
                }
                i6 += i9;
                i8++;
            }
        } else if (i7 >= 0) {
            am(i, i2, i7 + 1, i5, (byte) -6);
        } else {
            am(i, i7 + i2, (-i7) + 1, i5, (byte) -16);
        }
    }

    public final void cv(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ai(i, i2, i6 + 1, i5, -2138685813);
                return;
            }
            ai(i + i6, i2, (-i6) + 1, i5, -1195453475);
        } else if (i6 != 0) {
            int i8;
            int i9;
            if (i6 + i7 < 0) {
                i += i6;
                i8 = -i6;
                i6 = -i7;
                i9 = i8;
                i7 = i2 + i7;
                i8 = i;
            } else {
                i9 = i6;
                i8 = i;
                i6 = i7;
                i7 = i2;
            }
            int floor;
            int i10;
            if (i9 > i6) {
                i7 = (i7 << 16) + 32768;
                floor = (int) Math.floor((((double) (i6 << 16)) / ((double) i9)) + 0.5d);
                i6 = i9 + i8;
                if (i8 < -398357109 * this.aa) {
                    i7 += ((this.aa * 889727047) - i8) * floor;
                    i8 = 699339466 * this.aa;
                }
                if (i6 >= this.ak * 579810681) {
                    i6 = i8;
                    i8 = i7;
                    i7 = (this.ak * 579810681) - 1;
                } else {
                    i10 = i6;
                    i6 = i8;
                    i8 = i7;
                    i7 = i10;
                }
                while (i6 <= i7) {
                    i9 = i8 >> 16;
                    if (i9 >= this.aq * -1857728003 && i9 < -90244733 * this.ao) {
                        this.aj[(i9 * (1075116703 * this.ac)) + i6] = i5;
                    }
                    i8 += floor;
                    i6++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i9 = (int) Math.floor(0.5d + (((double) (i9 << 16)) / ((double) i6)));
            i6 += i7;
            if (i7 < -1857728003 * this.aq) {
                i8 += ((this.aq * -1857728003) - i7) * i9;
                i7 = -1348635105 * this.aq;
            }
            if (i6 >= this.ao * 1918107584) {
                i6 = i8;
                i8 = i7;
                i7 = (-90244733 * this.ao) - 1;
            } else {
                i10 = i6;
                i6 = i8;
                i8 = i7;
                i7 = i10;
            }
            while (i8 <= i7) {
                floor = i6 >> 16;
                if (floor >= 1897032465 * this.aa && floor < this.ak * 104963361) {
                    this.aj[floor + ((this.ac * 1075116703) * i8)] = i5;
                }
                i6 += i9;
                i8++;
            }
        } else if (i7 >= 0) {
            am(i, i2, i7 + 1, i5, (byte) -66);
        } else {
            am(i, i7 + i2, (-i7) + 1, i5, (byte) -52);
        }
    }

    public final void al(em emVar, int i, int i2, int i3) {
        try {
            int i4 = emVar.aq + i;
            int i5 = emVar.ao + i2;
            int i6 = i4 + ((this.ac * 1075116703) * i5);
            int i7 = 0;
            int i8 = emVar.an;
            int i9 = emVar.ac;
            int i10 = (1075116703 * this.ac) - i9;
            int i11 = 0;
            if (i5 < -1857728003 * this.aq) {
                int i12 = (-1857728003 * this.aq) - i5;
                i8 -= i12;
                i5 = -1857728003 * this.aq;
                i7 = 0 + (i12 * i9);
                i6 += i12 * (1075116703 * this.ac);
            }
            if (i8 + i5 > -90244733 * this.ao) {
                i8 -= (i5 + i8) - (-90244733 * this.ao);
            }
            if (i4 < 889727047 * this.aa) {
                i5 = (this.aa * 889727047) - i4;
                i9 -= i5;
                i4 = this.aa * 889727047;
                i7 += i5;
                i6 += i5;
                i11 = 0 + i5;
                i10 += i5;
            }
            if (i9 + i4 > 579810681 * this.ak) {
                i4 = (i4 + i9) - (579810681 * this.ak);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                ds.az(this.aj, emVar.aj, i7, i6, i9, i8, i10, i11, 1738560561);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.al(" + ')');
        }
    }

    public final void cs(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = i4 + ((this.ac * 1075116703) * i5);
        int i7 = 0;
        int i8 = emVar.an;
        int i9 = emVar.ac;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (-1857728003 * this.aq) - i5;
            i8 -= i11;
            i5 = -1857728003 * this.aq;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (1075116703 * this.ac);
        }
        if (i8 + i5 > -90244733 * this.ao) {
            i11 = i8 - ((i5 + i8) - (-90244733 * this.ao));
        } else {
            i11 = i8;
        }
        if (i4 < 889727047 * this.aa) {
            int i12 = (this.aa * 889727047) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i5;
            i10 = this.aa * 889727047;
            i5 = i6 + i12;
            i6 = i9;
        } else {
            i8 = 0;
            i5 = i6;
            i3 = i9;
            i6 = i7;
            i7 = i10;
            i10 = i4;
        }
        if (i3 + i10 > 579810681 * this.ak) {
            i10 = (i10 + i3) - (579810681 * this.ak);
            i3 -= i10;
            i9 = i8 + i10;
            i10 += i7;
        } else {
            i9 = i8;
            i10 = i7;
        }
        if (i3 > 0 && i11 > 0) {
            ds.az(this.aj, emVar.aj, i6, i5, i3, i11, i10, i9, -1177065987);
        }
    }

    public final void cx(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = i4 + ((this.ac * 1075116703) * i5);
        int i7 = 0;
        int i8 = emVar.an;
        int i9 = emVar.ac;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < -939841124 * this.aq) {
            int i11 = (-1857728003 * this.aq) - i5;
            i8 -= i11;
            i5 = -1857728003 * this.aq;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (935764750 * this.ac);
        }
        if (i8 + i5 > -1447971478 * this.ao) {
            i11 = i8 - ((i5 + i8) - (-90244733 * this.ao));
        } else {
            i11 = i8;
        }
        if (i4 < -737814481 * this.aa) {
            int i12 = (this.aa * -1473830062) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i5;
            i10 = this.aa * -276458062;
            i5 = i6 + i12;
            i6 = i9;
        } else {
            i8 = 0;
            i5 = i6;
            i3 = i9;
            i6 = i7;
            i7 = i10;
            i10 = i4;
        }
        if (i3 + i10 > 579810681 * this.ak) {
            i10 = (i10 + i3) - (579810681 * this.ak);
            i3 -= i10;
            i9 = i8 + i10;
            i10 += i7;
        } else {
            i9 = i8;
            i10 = i7;
        }
        if (i3 > 0 && i11 > 0) {
            ds.az(this.aj, emVar.aj, i6, i5, i3, i11, i10, i9, -989207288);
        }
    }

    static void cd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i9 + i3) - 3;
            while (i9 < i11) {
                int i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
                i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
            }
            i10 = i11 + 3;
            i11 = i8;
            while (i9 < i10) {
                i8 = i9 + 1;
                i12 = i11 + 1;
                iArr[i9] = iArr2[i11];
                i9 = i8;
                i11 = i12;
            }
            i8 = i11 + i6;
            i7++;
            i9 += i5;
        }
    }

    static void cn(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i9 + i3) - 3;
            while (i9 < i11) {
                int i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
                i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
            }
            i10 = i11 + 3;
            i11 = i8;
            while (i9 < i10) {
                i8 = i9 + 1;
                i12 = i11 + 1;
                iArr[i9] = iArr2[i11];
                i9 = i8;
                i11 = i12;
            }
            i8 = i11 + i6;
            i7++;
            i9 += i5;
        }
    }

    static void cw(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i9 + i3) - 3;
            while (i9 < i11) {
                int i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
                i12 = i9 + 1;
                i10 = i8 + 1;
                iArr[i9] = iArr2[i8];
                i9 = i12 + 1;
                i8 = i10 + 1;
                iArr[i12] = iArr2[i10];
            }
            i10 = i11 + 3;
            i11 = i8;
            while (i9 < i10) {
                i8 = i9 + 1;
                i12 = i11 + 1;
                iArr[i9] = iArr2[i11];
                i9 = i8;
                i11 = i12;
            }
            i8 = i11 + i6;
            i7++;
            i9 += i5;
        }
    }

    public final void ax(em emVar, int i, int i2, int i3) {
        try {
            int i4 = emVar.aq + i;
            int i5 = emVar.ao + i2;
            int i6 = ((this.ac * 1075116703) * i5) + i4;
            int i7 = 0;
            int i8 = emVar.an;
            int i9 = emVar.ac;
            int i10 = (1075116703 * this.ac) - i9;
            int i11 = 0;
            if (i5 < -1857728003 * this.aq) {
                int i12 = (-1857728003 * this.aq) - i5;
                i8 -= i12;
                i5 = this.aq * -1857728003;
                i7 = 0 + (i12 * i9);
                i6 += i12 * (1075116703 * this.ac);
            }
            if (i8 + i5 > -90244733 * this.ao) {
                i8 -= (i5 + i8) - (this.ao * -90244733);
            }
            if (i4 < 889727047 * this.aa) {
                i5 = (889727047 * this.aa) - i4;
                i9 -= i5;
                i4 = 889727047 * this.aa;
                i7 += i5;
                i6 += i5;
                i11 = 0 + i5;
                i10 += i5;
            }
            if (i9 + i4 > this.ak * 579810681) {
                i4 = (i4 + i9) - (579810681 * this.ak);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                ea.af(this.aj, emVar.aj, 0, i7, i6, i9, i8, i10, i11, -115256566);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ax(" + ')');
        }
    }

    public final void cj(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = ((this.ac * 1075116703) * i5) + i4;
        int i7 = emVar.an;
        int i8 = emVar.ac;
        int i9 = (1389602277 * this.ac) - i8;
        if (i5 < -455790286 * this.aq) {
            int i10 = (106277679 * this.aq) - i5;
            i7 -= i10;
            i3 = -1857728003 * this.aq;
            i5 = (i10 * i8) + 0;
            i6 += i10 * (this.ac * 1075116703);
        } else {
            i3 = i5;
            i5 = 0;
        }
        if (i7 + i3 > -90244733 * this.ao) {
            i10 = i7 - ((i3 + i7) - (this.ao * -1908171573));
        } else {
            i10 = i7;
        }
        if (i4 < 889727047 * this.aa) {
            int i11 = (-539605695 * this.aa) - i4;
            i3 = i8 - i11;
            i8 = i5 + i11;
            i7 = 0 + i11;
            i5 = i9 + i11;
            i9 = i3;
            i3 = i6 + i11;
            i6 = i8;
            i8 = 950063860 * this.aa;
        } else {
            i7 = 0;
            i3 = i6;
            i6 = i5;
            i5 = i9;
            i9 = i8;
            i8 = i4;
        }
        if (i9 + i8 > this.ak * 579810681) {
            i8 = (i8 + i9) - (1364732022 * this.ak);
            i9 -= i8;
            i4 = i7 + i8;
            i8 += i5;
        } else {
            i4 = i7;
            i8 = i5;
        }
        if (i9 > 0 && i10 > 0) {
            ea.af(this.aj, emVar.aj, 0, i6, i3, i9, i10, i8, i4, -115256566);
        }
    }

    public final void cz(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = ((this.ac * 1075116703) * i5) + i4;
        int i7 = 0;
        int i8 = emVar.an;
        int i9 = emVar.ac;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (-1968613730 * this.aq) - i5;
            i8 -= i11;
            i5 = this.aq * -1857728003;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (938027862 * this.ac);
        }
        if (i8 + i5 > -90244733 * this.ao) {
            i11 = i8 - ((i5 + i8) - (this.ao * -90244733));
        } else {
            i11 = i8;
        }
        if (i4 < 889727047 * this.aa) {
            int i12 = (-1691925254 * this.aa) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = 889727047 * this.aa;
            i6 = i5;
            i5 = i9;
        } else {
            i8 = 0;
            i5 = i7;
            i7 = i10;
            i3 = i6;
            i6 = i9;
            i10 = i4;
        }
        if (i6 + i10 > this.ak * 948378570) {
            i9 = (i10 + i6) - (579810681 * this.ak);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            ea.af(this.aj, emVar.aj, 0, i5, i3, i10, i11, i9, i4, -115256566);
        }
    }

    static void da(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = -i5;
        int i11 = i3;
        int i12 = i2;
        while (i10 < 0) {
            int i13 = i8;
            while (i13 < 0) {
                int i14 = i12 + 1;
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    i12 = i11 + 1;
                    iArr[i11] = i15;
                } else {
                    i12 = i11 + 1;
                }
                i15 = i14 + 1;
                i14 = iArr2[i14];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                int i16 = i15 + 1;
                i14 = iArr2[i15];
                if (i14 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i14;
                    i12 = i11;
                } else {
                    i12++;
                }
                i14 = i16 + 1;
                i15 = iArr2[i16];
                if (i15 != 0) {
                    i11 = i12 + 1;
                    iArr[i12] = i15;
                    i12 = i11;
                } else {
                    i12++;
                }
                i13++;
                i11 = i12;
                i12 = i14;
            }
            i13 = i11;
            i11 = i9;
            while (i11 < 0) {
                i14 = i12 + 1;
                i15 = iArr2[i12];
                if (i15 == 0) {
                    i12 = i13 + 1;
                } else {
                    i12 = i13 + 1;
                    iArr[i13] = i15;
                }
                i11++;
                i13 = i12;
                i12 = i14;
            }
            i11 = i13 + i6;
            i10++;
            i12 += i7;
        }
    }

    public void au(fl flVar, int i, int i2, int i3) {
        try {
            int i4;
            int i5 = i + flVar.ao;
            int i6 = i2 + flVar.aa;
            int i7 = i5 + ((this.ac * 1075116703) * i6);
            int i8 = 0;
            int i9 = flVar.aq;
            int i10 = flVar.an;
            int i11 = (this.ac * 1075116703) - i10;
            int i12 = 0;
            if (i6 < -1857728003 * this.aq) {
                i4 = (this.aq * -1857728003) - i6;
                i9 -= i4;
                i6 = -1857728003 * this.aq;
                i8 = 0 + (i10 * i4);
                i7 += i4 * (this.ac * 1075116703);
            }
            if (i9 + i6 > -90244733 * this.ao) {
                i9 -= (i6 + i9) - (this.ao * -90244733);
            }
            if (i5 < 889727047 * this.aa) {
                i6 = (889727047 * this.aa) - i5;
                i10 -= i6;
                i5 = this.aa * 889727047;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i5 + i10 > 579810681 * this.ak) {
                i5 = (i5 + i10) - (579810681 * this.ak);
                i6 = i12 + i5;
                i4 = i11 + i5;
                i12 = i10 - i5;
            } else {
                i6 = i12;
                i4 = i11;
                i12 = i10;
            }
            if (i12 > 0 && i9 > 0) {
                int[] iArr = this.aj;
                byte[] bArr = flVar.aj;
                int[] iArr2 = flVar.ac;
                i5 = -(i12 >> 2);
                i11 = -(i12 & 3);
                i9 = -i9;
                i12 = i7;
                i7 = i8;
                while (i9 < 0) {
                    byte b;
                    i8 = i5;
                    while (i8 < 0) {
                        i10 = i7 + 1;
                        b = bArr[i7];
                        if (b != (byte) 0) {
                            i7 = i12 + 1;
                            iArr[i12] = iArr2[b & 255];
                        } else {
                            i7 = i12 + 1;
                        }
                        int i13 = i10 + 1;
                        byte b2 = bArr[i10];
                        if (b2 != (byte) 0) {
                            i12 = i7 + 1;
                            iArr[i7] = iArr2[b2 & 255];
                            i7 = i12;
                        } else {
                            i7++;
                        }
                        int i14 = i13 + 1;
                        b2 = bArr[i13];
                        if (b2 != (byte) 0) {
                            i12 = i7 + 1;
                            iArr[i7] = iArr2[b2 & 255];
                            i7 = i12;
                        } else {
                            i7++;
                        }
                        i10 = i14 + 1;
                        b = bArr[i14];
                        if (b != (byte) 0) {
                            i12 = i7 + 1;
                            iArr[i7] = iArr2[b & 255];
                        } else {
                            i12 = i7 + 1;
                        }
                        i8++;
                        i7 = i10;
                    }
                    i8 = i12;
                    i12 = i7;
                    i7 = i11;
                    while (i7 < 0) {
                        i10 = i12 + 1;
                        b = bArr[i12];
                        if (b != (byte) 0) {
                            i12 = i8 + 1;
                            iArr[i8] = iArr2[b & 255];
                        } else {
                            i12 = i8 + 1;
                        }
                        i7++;
                        i8 = i12;
                        i12 = i10;
                    }
                    i7 = i8 + i4;
                    i8 = i12 + i6;
                    i9++;
                    i12 = i7;
                    i7 = i8;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.au(" + ')');
        }
    }

    public void di(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((this.ac * 1075116703) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (this.ac * 1075116703) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (this.aq * -1857728003) - i5;
            i8 -= i11;
            i5 = -1857728003 * this.aq;
            i7 = 0 + (i9 * i11);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i8 + i5 > -90244733 * this.ao) {
            i8 -= (i5 + i8) - (this.ao * -90244733);
        }
        if (i4 < 889727047 * this.aa) {
            int i12 = (889727047 * this.aa) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i4 = i6 + i12;
            i7 = 0 + i12;
            i6 = i10 + i12;
            i3 = i9;
            i10 = i4;
            i9 = this.aa * 889727047;
        } else {
            i5 = i9;
            i9 = i4;
            i3 = i7;
            i7 = 0;
            int i13 = i6;
            i6 = i10;
            i10 = i13;
        }
        if (i9 + i5 > 579810681 * this.ak) {
            i9 = (i9 + i5) - (579810681 * this.ak);
            i5 -= i9;
            i4 = i7 + i9;
            i11 = i6 + i9;
        } else {
            i4 = i7;
            i11 = i6;
        }
        if (i5 > 0 && i8 > 0) {
            int[] iArr = this.aj;
            byte[] bArr = flVar.aj;
            int[] iArr2 = flVar.ac;
            i9 = -(i5 >> 2);
            i6 = -(i5 & 3);
            i7 = i10;
            i10 = -i8;
            i8 = i3;
            while (i10 < 0) {
                byte b;
                i5 = i9;
                while (i5 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i7 + 1;
                        iArr[i7] = iArr2[b & 255];
                    } else {
                        i8 = i7 + 1;
                    }
                    int i14 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    int i15 = i14 + 1;
                    b2 = bArr[i14];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i3 = i15 + 1;
                    b = bArr[i15];
                    if (b != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i5++;
                    i7 = i8;
                    i8 = i3;
                }
                i5 = i7;
                i7 = i6;
                while (i7 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i5 + 1;
                        iArr[i5] = iArr2[b & 255];
                    } else {
                        i8 = i5 + 1;
                    }
                    i7++;
                    i5 = i8;
                    i8 = i3;
                }
                i7 = i5 + i11;
                i10++;
                i8 += i4;
            }
        }
    }

    public void dv(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((this.ac * 1075116703) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (this.ac * 1075116703) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (this.aq * -1857728003) - i5;
            i8 -= i11;
            i5 = -1857728003 * this.aq;
            i7 = 0 + (i9 * i11);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i8 + i5 > -90244733 * this.ao) {
            i8 -= (i5 + i8) - (this.ao * -90244733);
        }
        if (i4 < 889727047 * this.aa) {
            int i12 = (889727047 * this.aa) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i4 = i6 + i12;
            i7 = 0 + i12;
            i6 = i10 + i12;
            i3 = i9;
            i10 = i4;
            i9 = this.aa * 889727047;
        } else {
            i5 = i9;
            i9 = i4;
            i3 = i7;
            i7 = 0;
            int i13 = i6;
            i6 = i10;
            i10 = i13;
        }
        if (i9 + i5 > 579810681 * this.ak) {
            i9 = (i9 + i5) - (579810681 * this.ak);
            i5 -= i9;
            i4 = i7 + i9;
            i11 = i6 + i9;
        } else {
            i4 = i7;
            i11 = i6;
        }
        if (i5 > 0 && i8 > 0) {
            int[] iArr = this.aj;
            byte[] bArr = flVar.aj;
            int[] iArr2 = flVar.ac;
            i9 = -(i5 >> 2);
            i6 = -(i5 & 3);
            i7 = i10;
            i10 = -i8;
            i8 = i3;
            while (i10 < 0) {
                byte b;
                i5 = i9;
                while (i5 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i7 + 1;
                        iArr[i7] = iArr2[b & 255];
                    } else {
                        i8 = i7 + 1;
                    }
                    int i14 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    int i15 = i14 + 1;
                    b2 = bArr[i14];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i3 = i15 + 1;
                    b = bArr[i15];
                    if (b != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i5++;
                    i7 = i8;
                    i8 = i3;
                }
                i5 = i7;
                i7 = i6;
                while (i7 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i5 + 1;
                        iArr[i5] = iArr2[b & 255];
                    } else {
                        i8 = i5 + 1;
                    }
                    i7++;
                    i5 = i8;
                    i8 = i3;
                }
                i7 = i5 + i11;
                i10++;
                i8 += i4;
            }
        }
    }

    public void dw(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((this.ac * 1075116703) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (this.ac * 1075116703) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (this.aq * -1857728003) - i5;
            i8 -= i11;
            i5 = -1857728003 * this.aq;
            i7 = 0 + (i9 * i11);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i8 + i5 > -90244733 * this.ao) {
            i8 -= (i5 + i8) - (this.ao * -90244733);
        }
        if (i4 < 889727047 * this.aa) {
            int i12 = (889727047 * this.aa) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i4 = i6 + i12;
            i7 = 0 + i12;
            i6 = i10 + i12;
            i3 = i9;
            i10 = i4;
            i9 = this.aa * 889727047;
        } else {
            i5 = i9;
            i9 = i4;
            i3 = i7;
            i7 = 0;
            int i13 = i6;
            i6 = i10;
            i10 = i13;
        }
        if (i9 + i5 > 579810681 * this.ak) {
            i9 = (i9 + i5) - (579810681 * this.ak);
            i5 -= i9;
            i4 = i7 + i9;
            i11 = i6 + i9;
        } else {
            i4 = i7;
            i11 = i6;
        }
        if (i5 > 0 && i8 > 0) {
            int[] iArr = this.aj;
            byte[] bArr = flVar.aj;
            int[] iArr2 = flVar.ac;
            i9 = -(i5 >> 2);
            i6 = -(i5 & 3);
            i7 = i10;
            i10 = -i8;
            i8 = i3;
            while (i10 < 0) {
                byte b;
                i5 = i9;
                while (i5 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i7 + 1;
                        iArr[i7] = iArr2[b & 255];
                    } else {
                        i8 = i7 + 1;
                    }
                    int i14 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    int i15 = i14 + 1;
                    b2 = bArr[i14];
                    if (b2 != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b2 & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i3 = i15 + 1;
                    b = bArr[i15];
                    if (b != (byte) 0) {
                        i7 = i8 + 1;
                        iArr[i8] = iArr2[b & 255];
                        i8 = i7;
                    } else {
                        i8++;
                    }
                    i5++;
                    i7 = i8;
                    i8 = i3;
                }
                i5 = i7;
                i7 = i6;
                while (i7 < 0) {
                    i3 = i8 + 1;
                    b = bArr[i8];
                    if (b != (byte) 0) {
                        i8 = i5 + 1;
                        iArr[i5] = iArr2[b & 255];
                    } else {
                        i8 = i5 + 1;
                    }
                    i7++;
                    i5 = i8;
                    i8 = i3;
                }
                i7 = i5 + i11;
                i10++;
                i8 += i4;
            }
        }
    }

    public void av(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10 = emVar.ac;
                int i11 = emVar.an;
                int i12 = 0;
                int i13 = 0;
                int i14 = emVar.aa;
                int i15 = emVar.ak;
                int i16 = (i14 << 16) / i3;
                int i17 = (i15 << 16) / i4;
                if (emVar.aq > 0) {
                    i6 = (((emVar.aq << 16) + i16) - 1) / i16;
                    i += i6;
                    i12 = 0 + ((i6 * i16) - (emVar.aq << 16));
                }
                if (emVar.ao > 0) {
                    i6 = (((emVar.ao << 16) + i17) - 1) / i17;
                    i2 += i6;
                    i13 = 0 + ((i6 * i17) - (emVar.ao << 16));
                }
                if (i10 < i14) {
                    i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
                } else {
                    i6 = i3;
                }
                if (i11 < i15) {
                    i15 = ((((i11 << 16) - i13) + i17) - 1) / i17;
                } else {
                    i15 = i4;
                }
                i14 = ((this.ac * 1075116703) * i2) + i;
                i11 = (this.ac * 1075116703) - i6;
                if (i15 + i2 > this.ao * -90244733) {
                    i15 -= (i2 + i15) - (this.ao * -90244733);
                }
                if (i2 < -1857728003 * this.aq) {
                    i7 = (-1857728003 * this.aq) - i2;
                    i15 -= i7;
                    i14 += (1075116703 * this.ac) * i7;
                    i13 += i7 * i17;
                }
                if (i6 + i > 579810681 * this.ak) {
                    i7 = (i6 + i) - (this.ak * 579810681);
                    i6 -= i7;
                    i11 += i7;
                }
                if (i < 889727047 * this.aa) {
                    i7 = (889727047 * this.aa) - i;
                    i14 += i7;
                    i12 += i16 * i7;
                    i8 = i11 + i7;
                    i9 = i6 - i7;
                } else {
                    i8 = i11;
                    i9 = i6;
                }
                int[] iArr = this.aj;
                int[] iArr2 = emVar.aj;
                i15 = -i15;
                i7 = i13;
                i13 = i12;
                while (i15 < 0) {
                    int i18 = i10 * (i7 >> 16);
                    i6 = i13;
                    i13 = i14;
                    i14 = -i9;
                    while (i14 < 0) {
                        int i19 = iArr2[(i6 >> 16) + i18];
                        if (i19 != 0) {
                            i11 = i13 + 1;
                            iArr[i13] = i19;
                        } else {
                            i11 = i13 + 1;
                        }
                        i14++;
                        i6 += i16;
                        i13 = i11;
                    }
                    i14 = i13 + i8;
                    i15++;
                    i7 += i17;
                    i13 = i12;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ev.av(" + ')');
            }
        }
    }

    public void dq(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6 = emVar.ac;
            int i7 = emVar.an;
            int i8 = 0;
            int i9 = 0;
            int i10 = emVar.aa;
            int i11 = emVar.ak;
            int i12 = (i10 << 16) / i3;
            int i13 = (i11 << 16) / i4;
            if (emVar.aq > 0) {
                i5 = (((emVar.aq << 16) + i12) - 1) / i12;
                i += i5;
                i8 = 0 + ((i5 * i12) - (emVar.aq << 16));
            }
            if (emVar.ao > 0) {
                i5 = (((emVar.ao << 16) + i13) - 1) / i13;
                i2 += i5;
                i9 = 0 + ((i5 * i13) - (emVar.ao << 16));
            }
            if (i6 < i10) {
                i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
            } else {
                i5 = i3;
            }
            if (i7 < i11) {
                i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
            }
            i7 = ((this.ac * 1075116703) * i2) + i;
            i10 = (this.ac * 1075116703) - i5;
            if (i4 + i2 > this.ao * -90244733) {
                i4 -= (i2 + i4) - (this.ao * -90244733);
            }
            if (i2 < -1857728003 * this.aq) {
                i11 = (-1857728003 * this.aq) - i2;
                i4 -= i11;
                i7 += (1075116703 * this.ac) * i11;
                i9 += i11 * i13;
            }
            if (i5 + i > 579810681 * this.ak) {
                i11 = (i5 + i) - (this.ak * 579810681);
                i5 -= i11;
                i10 += i11;
            }
            if (i < 889727047 * this.aa) {
                i11 = (889727047 * this.aa) - i;
                i5 -= i11;
                i7 += i11;
                i8 += i12 * i11;
                i10 += i11;
            }
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            int i14 = -i4;
            int i15 = i9;
            i9 = i7;
            i11 = i8;
            while (i14 < 0) {
                int i16 = i6 * (i15 >> 16);
                int i17 = i11;
                i11 = i9;
                i9 = -i5;
                while (i9 < 0) {
                    int i18 = iArr2[(i17 >> 16) + i16];
                    if (i18 != 0) {
                        i7 = i11 + 1;
                        iArr[i11] = i18;
                    } else {
                        i7 = i11 + 1;
                    }
                    i9++;
                    i17 += i12;
                    i11 = i7;
                }
                i9 = i11 + i10;
                i14++;
                i15 += i13;
                i11 = i8;
            }
        }
    }

    public void ay(fl flVar, int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = flVar.an;
            int i11 = flVar.aq;
            int i12 = 0;
            int i13 = 0;
            int i14 = flVar.ak;
            int i15 = flVar.ap;
            int i16 = (i14 << 16) / i3;
            int i17 = (i15 << 16) / i4;
            if (flVar.ao > 0) {
                i6 = (((flVar.ao << 16) + i16) - 1) / i16;
                i += i6;
                i12 = 0 + ((i6 * i16) - (flVar.ao << 16));
            }
            if (flVar.aa > 0) {
                i6 = (((flVar.aa << 16) + i17) - 1) / i17;
                i2 += i6;
                i13 = 0 + ((i6 * i17) - (flVar.aa << 16));
            }
            if (i10 < i14) {
                i6 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i6 = i3;
            }
            if (i11 < i15) {
                i15 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            } else {
                i15 = i4;
            }
            i14 = i + ((1075116703 * this.ac) * i2);
            i11 = (this.ac * 1075116703) - i6;
            if (i2 + i15 > this.ao * -90244733) {
                i15 -= (i15 + i2) - (this.ao * -90244733);
            }
            if (i2 < -1857728003 * this.aq) {
                i7 = (-1857728003 * this.aq) - i2;
                i15 -= i7;
                i14 += (this.ac * 1075116703) * i7;
                i13 += i7 * i17;
            }
            if (i + i6 > this.ak * 579810681) {
                i7 = (i6 + i) - (this.ak * 579810681);
                i6 -= i7;
                i11 += i7;
            }
            if (i < 889727047 * this.aa) {
                i7 = (889727047 * this.aa) - i;
                i14 += i7;
                i12 += i7 * i16;
                i8 = i11 + i7;
                i9 = i6 - i7;
            } else {
                i8 = i11;
                i9 = i6;
            }
            int[] iArr = this.aj;
            byte[] bArr = flVar.aj;
            int[] iArr2 = flVar.ac;
            i15 = -i15;
            i7 = i13;
            i13 = i12;
            while (i15 < 0) {
                int i18 = i10 * (i7 >> 16);
                i6 = i13;
                i13 = i14;
                i14 = -i9;
                while (i14 < 0) {
                    byte b = bArr[(i6 >> 16) + i18];
                    if (b != (byte) 0) {
                        i11 = i13 + 1;
                        iArr[i13] = iArr2[b & 255];
                    } else {
                        i11 = i13 + 1;
                    }
                    i14++;
                    i6 += i16;
                    i13 = i11;
                }
                i14 = i13 + i8;
                i15++;
                i7 += i17;
                i13 = i12;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ay(" + ')');
        }
    }

    public void ee(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = flVar.an;
        int i7 = flVar.aq;
        int i8 = 0;
        int i9 = 0;
        int i10 = flVar.ak;
        int i11 = flVar.ap;
        int i12 = (i10 << 16) / i3;
        int i13 = (i11 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i12) - 1) / i12;
            i += i5;
            i8 = 0 + ((i5 * i12) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i13) - 1) / i13;
            i2 += i5;
            i9 = 0 + ((i5 * i13) - (flVar.aa << 16));
        }
        if (i6 < i10) {
            i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
        } else {
            i5 = i3;
        }
        if (i7 < i11) {
            i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
        }
        i7 = ((1075116703 * this.ac) * i2) + i;
        i10 = (this.ac * 1075116703) - i5;
        if (i2 + i4 > this.ao * -90244733) {
            i4 -= (i4 + i2) - (this.ao * -90244733);
        }
        if (i2 < -1857728003 * this.aq) {
            i11 = (-1857728003 * this.aq) - i2;
            i4 -= i11;
            i7 += (this.ac * 1075116703) * i11;
            i9 += i11 * i13;
        }
        if (i + i5 > this.ak * 579810681) {
            i11 = (i5 + i) - (this.ak * 579810681);
            i5 -= i11;
            i10 += i11;
        }
        if (i < 889727047 * this.aa) {
            i11 = (889727047 * this.aa) - i;
            i5 -= i11;
            i7 += i11;
            i8 += i11 * i12;
            i10 += i11;
        }
        int[] iArr = this.aj;
        byte[] bArr = flVar.aj;
        int[] iArr2 = flVar.ac;
        int i14 = -i4;
        int i15 = i9;
        i9 = i7;
        i11 = i8;
        while (i14 < 0) {
            int i16 = i6 * (i15 >> 16);
            int i17 = i11;
            i11 = i9;
            i9 = -i5;
            while (i9 < 0) {
                byte b = bArr[(i17 >> 16) + i16];
                if (b != (byte) 0) {
                    i7 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                } else {
                    i7 = i11 + 1;
                }
                i9++;
                i17 += i12;
                i11 = i7;
            }
            i9 = i11 + i10;
            i14++;
            i15 += i13;
            i11 = i8;
        }
    }

    public void em(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = flVar.an;
        int i7 = flVar.aq;
        int i8 = 0;
        int i9 = 0;
        int i10 = flVar.ak;
        int i11 = flVar.ap;
        int i12 = (i10 << 16) / i3;
        int i13 = (i11 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i12) - 1) / i12;
            i += i5;
            i8 = 0 + ((i5 * i12) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i13) - 1) / i13;
            i2 += i5;
            i9 = 0 + ((i5 * i13) - (flVar.aa << 16));
        }
        if (i6 < i10) {
            i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
        } else {
            i5 = i3;
        }
        if (i7 < i11) {
            i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
        }
        i7 = ((1075116703 * this.ac) * i2) + i;
        i10 = (this.ac * 1075116703) - i5;
        if (i2 + i4 > this.ao * -90244733) {
            i4 -= (i4 + i2) - (this.ao * -90244733);
        }
        if (i2 < -1857728003 * this.aq) {
            i11 = (-1857728003 * this.aq) - i2;
            i4 -= i11;
            i7 += (this.ac * 1075116703) * i11;
            i9 += i11 * i13;
        }
        if (i + i5 > this.ak * 579810681) {
            i11 = (i5 + i) - (this.ak * 579810681);
            i5 -= i11;
            i10 += i11;
        }
        if (i < 889727047 * this.aa) {
            i11 = (889727047 * this.aa) - i;
            i5 -= i11;
            i7 += i11;
            i8 += i11 * i12;
            i10 += i11;
        }
        int[] iArr = this.aj;
        byte[] bArr = flVar.aj;
        int[] iArr2 = flVar.ac;
        int i14 = -i4;
        int i15 = i9;
        i9 = i7;
        i11 = i8;
        while (i14 < 0) {
            int i16 = i6 * (i15 >> 16);
            int i17 = i11;
            i11 = i9;
            i9 = -i5;
            while (i9 < 0) {
                byte b = bArr[(i17 >> 16) + i16];
                if (b != (byte) 0) {
                    i7 = i11 + 1;
                    iArr[i11] = iArr2[b & 255];
                } else {
                    i7 = i11 + 1;
                }
                i9++;
                i17 += i12;
                i11 = i7;
            }
            i9 = i11 + i10;
            i14++;
            i15 += i13;
            i11 = i8;
        }
    }

    public void ew(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = flVar.an;
        int i7 = flVar.aq;
        int i8 = 0;
        int i9 = 0;
        int i10 = flVar.ak;
        int i11 = flVar.ap;
        int i12 = (i10 << 16) / i3;
        int i13 = (i11 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i12) - 1) / i12;
            i += i5;
            i8 = 0 + ((i5 * i12) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i13) - 1) / i13;
            i2 += i5;
            i9 = 0 + ((i5 * i13) - (flVar.aa << 16));
        }
        if (i6 < i10) {
            i5 = ((((i6 << 16) - i8) + i12) - 1) / i12;
        } else {
            i5 = i3;
        }
        if (i7 < i11) {
            i4 = ((((i7 << 16) - i9) + i13) - 1) / i13;
        }
        i7 = ((-1074807131 * this.ac) * i2) + i;
        i10 = (this.ac * -922836929) - i5;
        if (i2 + i4 > this.ao * -90244733) {
            i4 -= (i4 + i2) - (this.ao * 1494351659);
        }
        if (i2 < 1530866768 * this.aq) {
            i11 = (-1857728003 * this.aq) - i2;
            i4 -= i11;
            i7 += (this.ac * 1075116703) * i11;
            i9 += i11 * i13;
        }
        if (i + i5 > this.ak * 579810681) {
            i11 = (i5 + i) - (this.ak * 579810681);
            i5 -= i11;
            i10 += i11;
        }
        if (i < 889727047 * this.aa) {
            i11 = (889727047 * this.aa) - i;
            i5 -= i11;
            i7 += i11;
            i8 += i11 * i12;
            i10 += i11;
        }
        int[] iArr = this.aj;
        byte[] bArr = flVar.aj;
        int[] iArr2 = flVar.ac;
        int i14 = -i4;
        int i15 = i9;
        i9 = i7;
        i11 = i8;
        while (i14 < 0) {
            int i16 = i6 * (i15 >> 16);
            int i17 = i11;
            i11 = i9;
            i9 = -i5;
            while (i9 < 0) {
                byte b = bArr[(i17 >> 16) + i16];
                if (b != (byte) 0) {
                    i7 = i11 + 1;
                    iArr[i11] = iArr2[b & 869503137];
                } else {
                    i7 = i11 + 1;
                }
                i9++;
                i17 += i12;
                i11 = i7;
            }
            i9 = i11 + i10;
            i14++;
            i15 += i13;
            i11 = i8;
        }
    }

    public void ag(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (256 == i3) {
            try {
                ax(emVar, i, i2, 1231133277);
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "ev.ag(" + ')');
            }
        }
        int i6 = emVar.aq + i;
        int i7 = emVar.ao + i2;
        int i8 = ((1075116703 * this.ac) * i7) + i6;
        int i9 = 0;
        int i10 = emVar.an;
        int i11 = emVar.ac;
        int i12 = (this.ac * 1075116703) - i11;
        int i13 = 0;
        if (i7 < -1857728003 * this.aq) {
            int i14 = (-1857728003 * this.aq) - i7;
            i10 -= i14;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i14);
            i8 += i14 * (1075116703 * this.ac);
        }
        if (i10 + i7 > this.ao * -90244733) {
            i10 -= (i7 + i10) - (-90244733 * this.ao);
        }
        if (i6 < 889727047 * this.aa) {
            i7 = (this.aa * 889727047) - i6;
            i11 -= i7;
            i6 = 889727047 * this.aa;
            i9 += i7;
            i8 += i7;
            i13 = 0 + i7;
            i12 += i7;
        }
        if (i11 + i6 > this.ak * 579810681) {
            i6 = (i6 + i11) - (this.ak * 579810681);
            i11 -= i6;
            i13 += i6;
            i12 += i6;
        }
        if (i11 > 0 && i10 > 0) {
            ho.ar(this.aj, emVar.aj, 0, i9, i8, i11, i10, i12, i13, i3, i4, (short) 7643);
        }
    }

    public void eg(em emVar, int i, int i2, int i3, int i4) {
        if (35713544 == i3) {
            ax(emVar, i, i2, 1231133277);
            return;
        }
        int i5;
        int i6 = i + emVar.aq;
        int i7 = i2 + emVar.ao;
        int i8 = ((-75922240 * this.ac) * i7) + i6;
        int i9 = 0;
        int i10 = emVar.an;
        int i11 = emVar.ac;
        int i12 = (this.ac * 1075116703) - i11;
        if (i7 < -2078823133 * this.aq) {
            int i13 = (-1857728003 * this.aq) - i7;
            i10 -= i13;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (1075116703 * this.ac);
        }
        if (i10 + i7 > this.ao * 1856321605) {
            i13 = i10 - ((i7 + i10) - (-90244733 * this.ao));
        } else {
            i13 = i10;
        }
        if (i6 < 83589499 * this.aa) {
            int i14 = (this.aa * 801891745) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i10 = 0 + i14;
            i9 = i12 + i14;
            i5 = i8 + i14;
            i12 = 889727047 * this.aa;
            i8 = i7;
            i7 = i11;
        } else {
            i10 = 0;
            i7 = i9;
            i9 = i12;
            i5 = i8;
            i8 = i11;
            i12 = i6;
        }
        if (i8 + i12 > this.ak * 579810681) {
            i11 = (i12 + i8) - (this.ak * 579810681);
            i12 = i8 - i11;
            i6 = i10 + i11;
            i11 += i9;
        } else {
            i6 = i10;
            i11 = i9;
            i12 = i8;
        }
        if (i12 > 0 && i13 > 0) {
            ho.ar(this.aj, emVar.aj, 0, i7, i5, i12, i13, i11, i6, i3, i4, (short) 2440);
        }
    }

    public void eo(em emVar, int i, int i2, int i3, int i4) {
        if (256 == i3) {
            ax(emVar, i, i2, 1231133277);
            return;
        }
        int i5;
        int i6 = i + emVar.aq;
        int i7 = i2 + emVar.ao;
        int i8 = ((1075116703 * this.ac) * i7) + i6;
        int i9 = 0;
        int i10 = emVar.an;
        int i11 = emVar.ac;
        int i12 = (this.ac * 1075116703) - i11;
        if (i7 < -1857728003 * this.aq) {
            int i13 = (-1857728003 * this.aq) - i7;
            i10 -= i13;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (1075116703 * this.ac);
        }
        if (i10 + i7 > this.ao * -90244733) {
            i13 = i10 - ((i7 + i10) - (-90244733 * this.ao));
        } else {
            i13 = i10;
        }
        if (i6 < 889727047 * this.aa) {
            int i14 = (this.aa * 889727047) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i10 = 0 + i14;
            i9 = i12 + i14;
            i5 = i8 + i14;
            i12 = 889727047 * this.aa;
            i8 = i7;
            i7 = i11;
        } else {
            i10 = 0;
            i7 = i9;
            i9 = i12;
            i5 = i8;
            i8 = i11;
            i12 = i6;
        }
        if (i8 + i12 > this.ak * 579810681) {
            i11 = (i12 + i8) - (this.ak * 579810681);
            i12 = i8 - i11;
            i6 = i10 + i11;
            i11 += i9;
        } else {
            i6 = i10;
            i11 = i9;
            i12 = i8;
        }
        if (i12 > 0 && i13 > 0) {
            ho.ar(this.aj, emVar.aj, 0, i7, i5, i12, i13, i11, i6, i3, i4, (short) 18043);
        }
    }

    static void do(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = (((i10 * (65280 & i9)) & 16711680) | (((16711935 & i9) * i10) & -16711936)) >>> 8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            i10 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i15 = i10 + 1;
                i10 = iArr2[i10];
                if (i10 != 0) {
                    int i16 = 16711680 & ((i10 & 65280) * i8);
                    i10 = i13 + 1;
                    iArr[i13] = (((((16711935 & i10) * i8) & -16711936) | i16) >>> 8) + i11;
                } else {
                    i10 = i13 + 1;
                }
                i12++;
                i13 = i10;
                i10 = i15;
            }
            i12 = i13 + i6;
            i13 = i10 + i7;
        }
    }

    static void dt(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = (((i10 * (65280 & i9)) & 16711680) | (((16711935 & i9) * i10) & -16711936)) >>> 8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            i10 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i15 = i10 + 1;
                i10 = iArr2[i10];
                if (i10 != 0) {
                    int i16 = 16711680 & ((i10 & 65280) * i8);
                    i10 = i13 + 1;
                    iArr[i13] = (((((16711935 & i10) * i8) & -16711936) | i16) >>> 8) + i11;
                } else {
                    i10 = i13 + 1;
                }
                i12++;
                i13 = i10;
                i10 = i15;
            }
            i12 = i13 + i6;
            i13 = i10 + i7;
        }
    }

    public void ad(em emVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = emVar.aq + i;
            int i6 = emVar.ao + i2;
            int i7 = i5 + ((this.ac * 1075116703) * i6);
            int i8 = 0;
            int i9 = emVar.an;
            int i10 = emVar.ac;
            int i11 = (this.ac * 1075116703) - i10;
            int i12 = 0;
            if (i6 < this.aq * -1857728003) {
                int i13 = (-1857728003 * this.aq) - i6;
                i9 -= i13;
                i6 = -1857728003 * this.aq;
                i8 = 0 + (i10 * i13);
                i7 += i13 * (1075116703 * this.ac);
            }
            if (i6 + i9 > -90244733 * this.ao) {
                i9 -= (i6 + i9) - (-90244733 * this.ao);
            }
            if (i5 < 889727047 * this.aa) {
                i6 = (889727047 * this.aa) - i5;
                i10 -= i6;
                i5 = this.aa * 889727047;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i10 + i5 > this.ak * 579810681) {
                i5 = (i5 + i10) - (579810681 * this.ak);
                i10 -= i5;
                i12 += i5;
                i11 += i5;
            }
            if (i10 > 0 && i9 > 0) {
                cq.ab(this.aj, emVar.aj, 0, i8, i7, i10, i9, i11, i12, i3, -675616920);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.ad(" + ')');
        }
    }

    public void dj(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((this.ac * 1075116703) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 1075116703) - i10;
        if (i6 < this.aq * -1857728003) {
            int i12 = (-1857728003 * this.aq) - i6;
            i9 -= i12;
            i6 = -1857728003 * this.aq;
            i8 = 0 + (i10 * i12);
            i7 += i12 * (1075116703 * this.ac);
        }
        if (i6 + i9 > -90244733 * this.ao) {
            i12 = i9 - ((i6 + i9) - (-90244733 * this.ao));
        } else {
            i12 = i9;
        }
        if (i5 < 889727047 * this.aa) {
            int i13 = (889727047 * this.aa) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = this.aa * 889727047;
            i7 = i6;
            i6 = i10;
        } else {
            i9 = 0;
            i6 = i8;
            i8 = i11;
            i4 = i7;
            i7 = i10;
            i11 = i5;
        }
        if (i7 + i11 > this.ak * 579810681) {
            i10 = (i11 + i7) - (579810681 * this.ak);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            cq.ab(this.aj, emVar.aj, 0, i6, i4, i11, i12, i10, i5, i3, -675616920);
        }
    }

    public void dm(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((this.ac * 1075116703) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 1075116703) - i10;
        if (i6 < this.aq * -1857728003) {
            int i12 = (-1857728003 * this.aq) - i6;
            i9 -= i12;
            i6 = -1857728003 * this.aq;
            i8 = 0 + (i10 * i12);
            i7 += i12 * (1075116703 * this.ac);
        }
        if (i6 + i9 > -90244733 * this.ao) {
            i12 = i9 - ((i6 + i9) - (-90244733 * this.ao));
        } else {
            i12 = i9;
        }
        if (i5 < 889727047 * this.aa) {
            int i13 = (889727047 * this.aa) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = this.aa * 889727047;
            i7 = i6;
            i6 = i10;
        } else {
            i9 = 0;
            i6 = i8;
            i8 = i11;
            i4 = i7;
            i7 = i10;
            i11 = i5;
        }
        if (i7 + i11 > this.ak * 579810681) {
            i10 = (i11 + i7) - (579810681 * this.ak);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            cq.ab(this.aj, emVar.aj, 0, i6, i4, i11, i12, i10, i5, i3, -675616920);
        }
    }

    public void dz(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((this.ac * 1541657507) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 2124173491) - i10;
        if (i6 < this.aq * -1857728003) {
            int i12 = (-1946431382 * this.aq) - i6;
            i9 -= i12;
            i6 = -1528864980 * this.aq;
            i8 = 0 + (i10 * i12);
            i7 += i12 * (-524807503 * this.ac);
        }
        if (i6 + i9 > -1230558733 * this.ao) {
            i12 = i9 - ((i6 + i9) - (-90244733 * this.ao));
        } else {
            i12 = i9;
        }
        if (i5 < 889727047 * this.aa) {
            int i13 = (889727047 * this.aa) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = this.aa * 889727047;
            i7 = i6;
            i6 = i10;
        } else {
            i9 = 0;
            i6 = i8;
            i8 = i11;
            i4 = i7;
            i7 = i10;
            i11 = i5;
        }
        if (i7 + i11 > this.ak * 818279072) {
            i10 = (i11 + i7) - (579810681 * this.ak);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            cq.ab(this.aj, emVar.aj, 0, i6, i4, i11, i12, i10, i5, i3, -675616920);
        }
    }

    static void du(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -262823258 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = i11;
            i11 = i10;
            i10 = -i4;
            while (i10 < 0) {
                int i14 = i13 + 1;
                int i15 = iArr2[i13];
                if (i15 != 0) {
                    int i16 = iArr[i11];
                    if (i16 == 0) {
                        i13 = i11 + 1;
                        iArr[i11] = i15 | ((i9 - 562434136) << 24);
                    } else {
                        i13 = i11 + 1;
                        iArr[i11] = (((((i15 & 16711935) * i8) + ((i16 & 24094077) * i9)) & -1639581479) + ((((65280 & i15) * i8) + ((65280 & i16) * i9)) & 16711680)) >> 8;
                    }
                } else {
                    i13 = i11 + 1;
                }
                i10++;
                i11 = i13;
                i13 = i14;
            }
            i10 = i11 + i6;
            i11 = i13 + i7;
        }
    }

    public void bp(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = emVar.ac;
            int i12 = emVar.an;
            int i13 = 0;
            int i14 = 0;
            int i15 = emVar.aa;
            int i16 = emVar.ak;
            int i17 = (i15 << 16) / i3;
            int i18 = (i16 << 16) / i4;
            if (emVar.aq > 0) {
                i7 = (((emVar.aq << 16) + i17) - 1) / i17;
                i += i7;
                i13 = 0 + ((i7 * i17) - (emVar.aq << 16));
            }
            if (emVar.ao > 0) {
                i7 = (((emVar.ao << 16) + i18) - 1) / i18;
                i2 += i7;
                i14 = 0 + ((i7 * i18) - (emVar.ao << 16));
            }
            if (i11 < i15) {
                i7 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            } else {
                i7 = i3;
            }
            if (i12 < i16) {
                i16 = ((((i12 << 16) - i14) + i18) - 1) / i18;
            } else {
                i16 = i4;
            }
            i15 = ((1075116703 * this.ac) * i2) + i;
            i12 = (1075116703 * this.ac) - i7;
            if (i16 + i2 > this.ao * -90244733) {
                i16 -= (i2 + i16) - (-90244733 * this.ao);
            }
            if (i2 < -1857728003 * this.aq) {
                i8 = (-1857728003 * this.aq) - i2;
                i16 -= i8;
                i15 += (1075116703 * this.ac) * i8;
                i14 += i8 * i18;
            }
            if (i7 + i > 579810681 * this.ak) {
                i8 = (i7 + i) - (this.ak * 579810681);
                i7 -= i8;
                i12 += i8;
            }
            if (i < 889727047 * this.aa) {
                i8 = (this.aa * 889727047) - i;
                i15 += i8;
                i13 += i17 * i8;
                i9 = i12 + i8;
                i10 = i7 - i8;
            } else {
                i9 = i12;
                i10 = i7;
            }
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            int i19 = 256 - i5;
            i16 = -i16;
            i8 = i14;
            i14 = i13;
            while (i16 < 0) {
                int i20 = (i8 >> 16) * i11;
                i7 = i14;
                i14 = i15;
                i15 = -i10;
                while (i15 < 0) {
                    try {
                        int i21 = iArr2[(i7 >> 16) + i20];
                        if (i21 != 0) {
                            int i22 = iArr[i14];
                            i12 = i14 + 1;
                            iArr[i14] = (((((i21 & 65280) * i5) + ((i22 & 65280) * i19)) & 16711680) + ((((16711935 & i21) * i5) + ((16711935 & i22) * i19)) & -16711936)) >> 8;
                        } else {
                            i12 = i14 + 1;
                        }
                        i15++;
                        i7 += i17;
                        i14 = i12;
                    } catch (Throwable e) {
                        throw ei.ac(e, "ev.bp(" + ')');
                    }
                }
                i15 = i14 + i9;
                i16++;
                i8 += i18;
                i14 = i13;
            }
        }
    }

    public void dg(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7 = emVar.ac;
            int i8 = emVar.an;
            int i9 = 0;
            int i10 = 0;
            int i11 = emVar.aa;
            int i12 = emVar.ak;
            int i13 = (i11 << 16) / i3;
            int i14 = (i12 << 16) / i4;
            if (emVar.aq > 0) {
                i6 = (((emVar.aq << 16) + i13) - 1) / i13;
                i += i6;
                i9 = 0 + ((i6 * i13) - (emVar.aq << 16));
            }
            if (emVar.ao > 0) {
                i6 = (((emVar.ao << 16) + i14) - 1) / i14;
                i2 += i6;
                i10 = 0 + ((i6 * i14) - (emVar.ao << 16));
            }
            if (i7 < i11) {
                i6 = ((((i7 << 16) - i9) + i13) - 1) / i13;
            } else {
                i6 = i3;
            }
            if (i8 < i12) {
                i4 = ((((i8 << 16) - i10) + i14) - 1) / i14;
            }
            i8 = ((1075116703 * this.ac) * i2) + i;
            i11 = (1007162960 * this.ac) - i6;
            if (i4 + i2 > this.ao * 376034943) {
                i4 -= (i2 + i4) - (1606224532 * this.ao);
            }
            if (i2 < -1857728003 * this.aq) {
                i12 = (1824480483 * this.aq) - i2;
                i4 -= i12;
                i8 += (1075116703 * this.ac) * i12;
                i10 += i12 * i14;
            }
            if (i6 + i > 409200465 * this.ak) {
                i12 = (i6 + i) - (this.ak * 579810681);
                i6 -= i12;
                i11 += i12;
            }
            if (i < 889727047 * this.aa) {
                i12 = (this.aa * -1816284034) - i;
                i6 -= i12;
                i8 += i12;
                i9 += i13 * i12;
                i11 += i12;
            }
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            int i15 = 256 - i5;
            int i16 = -i4;
            int i17 = i10;
            i10 = i8;
            i12 = i9;
            while (i16 < 0) {
                int i18 = (i17 >> 16) * i7;
                int i19 = i12;
                i12 = i10;
                i10 = -i6;
                while (i10 < 0) {
                    int i20 = iArr2[(i19 >> 16) + i18];
                    if (i20 != 0) {
                        int i21 = iArr[i12];
                        i8 = i12 + 1;
                        iArr[i12] = (((((i20 & 65280) * i5) + ((i21 & 65280) * i15)) & 16711680) + ((((16711935 & i20) * i5) + ((16711935 & i21) * i15)) & -16711936)) >> 8;
                    } else {
                        i8 = i12 + 1;
                    }
                    i10++;
                    i19 += i13;
                    i12 = i8;
                }
                i10 = i12 + i11;
                i16++;
                i17 += i14;
                i12 = i9;
            }
        }
    }

    public void dn(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7 = emVar.ac;
            int i8 = emVar.an;
            int i9 = 0;
            int i10 = 0;
            int i11 = emVar.aa;
            int i12 = emVar.ak;
            int i13 = (i11 << 16) / i3;
            int i14 = (i12 << 16) / i4;
            if (emVar.aq > 0) {
                i6 = (((emVar.aq << 16) + i13) - 1) / i13;
                i += i6;
                i9 = 0 + ((i6 * i13) - (emVar.aq << 16));
            }
            if (emVar.ao > 0) {
                i6 = (((emVar.ao << 16) + i14) - 1) / i14;
                i2 += i6;
                i10 = 0 + ((i6 * i14) - (emVar.ao << 16));
            }
            if (i7 < i11) {
                i6 = ((((i7 << 16) - i9) + i13) - 1) / i13;
            } else {
                i6 = i3;
            }
            if (i8 < i12) {
                i4 = ((((i8 << 16) - i10) + i14) - 1) / i14;
            }
            i8 = ((-1450523403 * this.ac) * i2) + i;
            i11 = (-1394281986 * this.ac) - i6;
            if (i4 + i2 > this.ao * 29331788) {
                i4 -= (i2 + i4) - (-90244733 * this.ao);
            }
            if (i2 < -1857728003 * this.aq) {
                i12 = (-1954713529 * this.aq) - i2;
                i4 -= i12;
                i8 += (1075116703 * this.ac) * i12;
                i10 += i12 * i14;
            }
            if (i6 + i > -153470703 * this.ak) {
                i12 = (i6 + i) - (this.ak * 435802949);
                i6 -= i12;
                i11 += i12;
            }
            if (i < 889727047 * this.aa) {
                i12 = (this.aa * 889727047) - i;
                i6 -= i12;
                i8 += i12;
                i9 += i13 * i12;
                i11 += i12;
            }
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            int i15 = 256 - i5;
            int i16 = -i4;
            int i17 = i10;
            i10 = i8;
            i12 = i9;
            while (i16 < 0) {
                int i18 = (i17 >> 16) * i7;
                int i19 = i12;
                i12 = i10;
                i10 = -i6;
                while (i10 < 0) {
                    int i20 = iArr2[(i19 >> 16) + i18];
                    if (i20 != 0) {
                        int i21 = iArr[i12];
                        i8 = i12 + 1;
                        iArr[i12] = (((((i20 & 65280) * i5) + ((i21 & 65280) * i15)) & 1473488177) + ((((-1021261368 & i20) * i5) + ((16711935 & i21) * i15)) & -16711936)) >> 8;
                    } else {
                        i8 = i12 + 1;
                    }
                    i10++;
                    i19 += i13;
                    i12 = i8;
                }
                i10 = i12 + i11;
                i16++;
                i17 += i14;
                i12 = i9;
            }
        }
    }

    public void bm(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, byte b) {
        int i7;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        try {
            int i8;
            int i9 = emVar.an + i2 <= i6 ? emVar.an : i6 - i2;
            int i10 = i < 0 ? -i : 0;
            if (emVar.ac + i <= i5) {
                i8 = emVar.ac;
            } else {
                i8 = i5 - i;
            }
            int i11 = ((i + i3) + i10) + ((1075116703 * this.ac) * ((i4 + i2) + i7));
            int i12 = i7;
            i7 = i2 + i7;
            while (i12 < i9) {
                int i13;
                int i14 = iArr[i7];
                int i15 = i7 + 1;
                i7 = iArr2[i7];
                if (i < i14) {
                    i8 = i14 - i;
                    i13 = (i8 - i10) + i11;
                } else {
                    i8 = i10;
                    i13 = i11;
                }
                if (emVar.ac + i <= i7 + i14) {
                    i7 = emVar.ac;
                } else {
                    i7 = (i7 + i14) - i;
                }
                i14 = i13;
                i13 = i8;
                while (i13 < i7) {
                    int i16 = emVar.aj[(emVar.ac * i12) + i13];
                    if (i16 != 0) {
                        i8 = i14 + 1;
                        this.aj[i14] = i16;
                    } else {
                        i8 = i14 + 1;
                    }
                    i13++;
                    i14 = i8;
                }
                i11 += 1075116703 * this.ac;
                i12++;
                i7 = i15;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.bm(" + ')');
        }
    }

    public void dc(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        if (emVar.an + i2 <= i6) {
            i8 = emVar.an;
        } else {
            i8 = i6 - i2;
        }
        if (i < 0) {
            i9 = -i;
        } else {
            i9 = 0;
        }
        if (emVar.ac + i <= i5) {
            i10 = emVar.ac;
        } else {
            i10 = i5 - i;
        }
        int i11 = ((-767748885 * this.ac) * ((i4 + i2) + i7)) + ((i + i3) + i9);
        int i12 = i7;
        i7 = i2 + i7;
        while (i12 < i8) {
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i10 = (i7 - i9) + i11;
            } else {
                i7 = i9;
                i10 = i11;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i10;
            i10 = i7;
            while (i10 < i13) {
                int i16 = emVar.aj[(emVar.ac * i12) + i10];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i10++;
                i15 = i7;
            }
            i11 += 1075116703 * this.ac;
            i12++;
            i7 = i14;
        }
    }

    public void df(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        int i9 = emVar.an + i2 <= i6 ? emVar.an : i6 - i2;
        int i10 = i < 0 ? -i : 0;
        if (emVar.ac + i <= i5) {
            i8 = emVar.ac;
        } else {
            i8 = i5 - i;
        }
        int i11 = ((-1747396794 * this.ac) * ((i4 + i2) + i7)) + ((i + i3) + i10);
        int i12 = i7;
        i7 = i2 + i7;
        while (i12 < i9) {
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i8 = (i7 - i10) + i11;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i8;
            i8 = i7;
            while (i8 < i13) {
                int i16 = emVar.aj[(emVar.ac * i12) + i8];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i8++;
                i15 = i7;
            }
            i11 += -2057639027 * this.ac;
            i12++;
            i7 = i14;
        }
    }

    public void dy(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        int i9 = emVar.an + i2 <= i6 ? emVar.an : i6 - i2;
        int i10 = i < 0 ? -i : 0;
        if (emVar.ac + i <= i5) {
            i8 = emVar.ac;
        } else {
            i8 = i5 - i;
        }
        int i11 = ((73503663 * this.ac) * ((i4 + i2) + i7)) + ((i + i3) + i10);
        int i12 = i7;
        i7 = i2 + i7;
        while (i12 < i9) {
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i8 = (i7 - i10) + i11;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i8;
            i8 = i7;
            while (i8 < i13) {
                int i16 = emVar.aj[(emVar.ac * i12) + i8];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i8++;
                i15 = i7;
            }
            i11 += 1075116703 * this.ac;
            i12++;
            i7 = i14;
        }
    }

    public void ei(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        if (emVar.an + i2 <= i6) {
            i8 = emVar.an;
        } else {
            i8 = i6 - i2;
        }
        if (i < 0) {
            i9 = -i;
        } else {
            i9 = 0;
        }
        if (emVar.ac + i <= i5) {
            i10 = emVar.ac;
        } else {
            i10 = i5 - i;
        }
        int i11 = ((1075116703 * this.ac) * ((i4 + i2) + i7)) + ((i + i3) + i9);
        int i12 = i7;
        i7 = i2 + i7;
        while (i12 < i8) {
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i10 = (i7 - i9) + i11;
            } else {
                i7 = i9;
                i10 = i11;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i10;
            i10 = i7;
            while (i10 < i13) {
                int i16 = emVar.aj[(emVar.ac * i12) + i10];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i10++;
                i15 = i7;
            }
            i11 += 1075116703 * this.ac;
            i12++;
            i7 = i14;
        }
    }

    public void bh(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        try {
            int i10 = (-i3) / 2;
            int i11 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i12 = (i5 << 16) + ((i11 * sin) + (i10 * cos));
            int i13 = ((1075116703 * this.ac) * i2) + i;
            int i14 = (i6 << 16) + ((i11 * cos) - (i10 * sin));
            int i15 = i12;
            for (int i16 = 0; i16 < i4; i16++) {
                i10 = iArr[i16];
                i12 = i13 + i10;
                i11 = (cos * i10) + i15;
                i10 = i14 - (i10 * sin);
                int i17 = -iArr2[i16];
                while (i17 < 0) {
                    int i18 = i12 + 1;
                    this.aj[i12] = emVar.aj[(i11 >> 16) + (emVar.ac * (i10 >> 16))];
                    i11 += cos;
                    i10 -= sin;
                    i17++;
                    i12 = i18;
                }
                i13 = (this.ac * 1075116703) + i13;
                i14 += cos;
                i15 += sin;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "ev.bh(" + ')');
        }
    }

    public void ep(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((i10 * sin) + (i9 * cos));
            int i12 = ((1075116703 * this.ac) * i2) + i;
            int i13 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i14 = i11;
            for (int i15 = 0; i15 < i4; i15++) {
                i9 = iArr[i15];
                i11 = i12 + i9;
                i10 = (cos * i9) + i14;
                i9 = i13 - (i9 * sin);
                int i16 = -iArr2[i15];
                while (i16 < 0) {
                    int i17 = i11 + 1;
                    this.aj[i11] = emVar.aj[(i10 >> 16) + (emVar.ac * (i9 >> 16))];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (this.ac * 1075116703) + i12;
                i13 += cos;
                i14 += sin;
            }
        } catch (Exception e) {
        }
    }

    public void eq(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((i10 * sin) + (i9 * cos));
            int i12 = ((1075116703 * this.ac) * i2) + i;
            int i13 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i14 = i11;
            for (int i15 = 0; i15 < i4; i15++) {
                i9 = iArr[i15];
                i11 = i12 + i9;
                i10 = (cos * i9) + i14;
                i9 = i13 - (i9 * sin);
                int i16 = -iArr2[i15];
                while (i16 < 0) {
                    int i17 = i11 + 1;
                    this.aj[i11] = emVar.aj[(i10 >> 16) + (emVar.ac * (i9 >> 16))];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (this.ac * 1075116703) + i12;
                i13 += cos;
                i14 += sin;
            }
        } catch (Exception e) {
        }
    }

    public void eu(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((i10 * sin) + (i9 * cos));
            int i12 = ((-933208913 * this.ac) * i2) + i;
            int i13 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i14 = i11;
            for (int i15 = 0; i15 < i4; i15++) {
                i9 = iArr[i15];
                i11 = i12 + i9;
                i10 = (cos * i9) + i14;
                i9 = i13 - (i9 * sin);
                int i16 = -iArr2[i15];
                while (i16 < 0) {
                    int i17 = i11 + 1;
                    this.aj[i11] = emVar.aj[(i10 >> 16) + (emVar.ac * (i9 >> 16))];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (this.ac * 483760501) + i12;
                i13 += cos;
                i14 += sin;
            }
        } catch (Exception e) {
        }
    }

    public void bt(em emVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((sin * i10) + (i9 * cos));
            int i12 = ((i10 * cos) - (i9 * sin)) + (i6 << 16);
            int i13 = ((this.ac * 1075116703) * i2) + i;
            for (int i14 = 0; i14 < i4; i14++) {
                i10 = i12;
                int i15 = i11;
                int i16 = i13;
                int i17 = -i3;
                while (i17 < 0) {
                    int i18 = emVar.aj[(i15 >> 16) + ((i10 >> 16) * emVar.ac)];
                    if (i18 != 0) {
                        i9 = i16 + 1;
                        this.aj[i16] = i18;
                    } else {
                        i9 = i16 + 1;
                    }
                    i15 += cos;
                    i10 -= sin;
                    i17++;
                    i16 = i9;
                }
                i11 += sin;
                i12 += cos;
                i13 += this.ac * 1075116703;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "ev.bt(" + ')');
        }
    }

    public void eh(em emVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i10 = (i5 << 16) + ((sin * i9) + (i8 * cos));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = ((this.ac * 1075116703) * i2) + i;
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = emVar.aj[(i14 >> 16) + ((i9 >> 16) * emVar.ac)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.aj[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += this.ac * 1075116703;
            }
        } catch (Exception e) {
        }
    }

    public void ej(em emVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i10 = (i5 << 16) + ((sin * i9) + (i8 * cos));
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = ((this.ac * -228023259) * i2) + i;
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = emVar.aj[(i14 >> 16) + ((i9 >> 16) * emVar.ac)];
                    if (i17 != 0) {
                        i8 = i15 + 1;
                        this.aj[i15] = i17;
                    } else {
                        i8 = i15 + 1;
                    }
                    i14 += cos;
                    i9 -= sin;
                    i16++;
                    i15 = i8;
                }
                i10 += sin;
                i11 += cos;
                i12 += this.ac * 880795148;
            }
        } catch (Exception e) {
        }
    }

    public void br(em emVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = emVar.aq + i;
            int i6 = emVar.ao + i2;
            int i7 = i5 + ((1075116703 * this.ac) * i6);
            int i8 = 0;
            int i9 = emVar.an;
            int i10 = emVar.ac;
            int i11 = (1075116703 * this.ac) - i10;
            int i12 = 0;
            if (i6 < this.aq * -1857728003) {
                int i13 = (-1857728003 * this.aq) - i6;
                i9 -= i13;
                i6 = -1857728003 * this.aq;
                i8 = 0 + (i13 * i10);
                i7 += i13 * (1075116703 * this.ac);
            }
            if (i6 + i9 > this.ao * -90244733) {
                i9 -= (i6 + i9) - (this.ao * -90244733);
            }
            if (i5 < 889727047 * this.aa) {
                i6 = (889727047 * this.aa) - i5;
                i10 -= i6;
                i5 = 889727047 * this.aa;
                i8 += i6;
                i7 += i6;
                i12 = 0 + i6;
                i11 += i6;
            }
            if (i5 + i10 > this.ak * 579810681) {
                i5 = (i5 + i10) - (this.ak * 579810681);
                i10 -= i5;
                i12 += i5;
                i11 += i5;
            }
            if (i10 > 0 && i9 > 0) {
                bb(this.aj, emVar.aj, 0, i8, i7, 0, 0, i10, i9, i11, i12, i3, 1342409143);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.br(" + ')');
        }
    }

    public void eb(em emVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + emVar.aq;
        int i9 = i2 + emVar.ao;
        int i10 = i8 + ((855232894 * this.ac) * i9);
        int i11 = 0;
        int i12 = emVar.an;
        int i13 = emVar.ac;
        int i14 = (-1154597860 * this.ac) - i13;
        if (i9 < this.aq * 395289511) {
            int i15 = (1721563599 * this.aq) - i9;
            i12 -= i15;
            i9 = -1857728003 * this.aq;
            i11 = 0 + (i15 * i13);
            i10 += i15 * (-1651368024 * this.ac);
        }
        if (i9 + i12 > this.ao * -882731470) {
            i4 = i12 - ((i9 + i12) - (this.ao * -1776447050));
        } else {
            i4 = i12;
        }
        if (i8 < 2030962804 * this.aa) {
            i15 = (-1667422452 * this.aa) - i8;
            i9 = i13 - i15;
            i13 = i11 + i15;
            i12 = 0 + i15;
            i11 = i14 + i15;
            i5 = i13;
            i14 = i10 + i15;
            i10 = i9;
            i9 = 889727047 * this.aa;
        } else {
            i12 = 0;
            i9 = i8;
            i5 = i11;
            i11 = i14;
            i14 = i10;
            i10 = i13;
        }
        if (i9 + i10 > this.ak * 2005207230) {
            i9 = (i9 + i10) - (this.ak * 579810681);
            i15 = i10 - i9;
            i6 = i12 + i9;
            i7 = i11 + i9;
        } else {
            i6 = i12;
            i7 = i11;
            i15 = i10;
        }
        if (i15 > 0 && i4 > 0) {
            bb(this.aj, emVar.aj, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, 93039154);
        }
    }

    public void ek(em emVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + emVar.aq;
        int i9 = i2 + emVar.ao;
        int i10 = i8 + ((1075116703 * this.ac) * i9);
        int i11 = 0;
        int i12 = emVar.an;
        int i13 = emVar.ac;
        int i14 = (1075116703 * this.ac) - i13;
        if (i9 < this.aq * -1857728003) {
            int i15 = (-1857728003 * this.aq) - i9;
            i12 -= i15;
            i9 = -1857728003 * this.aq;
            i11 = 0 + (i15 * i13);
            i10 += i15 * (1075116703 * this.ac);
        }
        if (i9 + i12 > this.ao * -90244733) {
            i4 = i12 - ((i9 + i12) - (this.ao * -90244733));
        } else {
            i4 = i12;
        }
        if (i8 < 889727047 * this.aa) {
            i15 = (889727047 * this.aa) - i8;
            i9 = i13 - i15;
            i13 = i11 + i15;
            i12 = 0 + i15;
            i11 = i14 + i15;
            i5 = i13;
            i14 = i10 + i15;
            i10 = i9;
            i9 = 889727047 * this.aa;
        } else {
            i12 = 0;
            i9 = i8;
            i5 = i11;
            i11 = i14;
            i14 = i10;
            i10 = i13;
        }
        if (i9 + i10 > this.ak * 579810681) {
            i9 = (i9 + i10) - (this.ak * 579810681);
            i15 = i10 - i9;
            i6 = i12 + i9;
            i7 = i11 + i9;
        } else {
            i6 = i12;
            i7 = i11;
            i15 = i10;
        }
        if (i15 > 0 && i4 > 0) {
            bb(this.aj, emVar.aj, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, 72386608);
        }
    }

    void bb(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i10 & 16711935;
        int i13 = (i10 >> 8) & 255;
        int i14 = i3;
        int i15 = i2;
        for (int i16 = -i7; i16 < 0; i16++) {
            int i17 = i15;
            i15 = i14;
            i14 = -i6;
            while (i14 < 0) {
                int i18 = i17 + 1;
                try {
                    int i19 = iArr2[i17];
                    if (i19 == 0) {
                        i17 = i15 + 1;
                    } else if ((65535 & i19) == ((16776960 & i19) >> 8)) {
                        int i20 = i19 & -16777216;
                        i19 &= 255;
                        i17 = i15 + 1;
                        iArr[i15] = ((((i19 * i12) >> 8) & 16711935) + ((i19 * i13) & 65280)) + i20;
                    } else {
                        i17 = i15 + 1;
                        iArr[i15] = i19;
                    }
                    i14++;
                    i15 = i17;
                    i17 = i18;
                } catch (Throwable e) {
                    throw ei.ac(e, "ev.bb(" + ')');
                }
            }
            i14 = i15 + i8;
            i15 = i17 + i9;
        }
    }

    void el(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & 1412969665;
        int i12 = (i10 >> 8) & 255;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                int i17 = i16 + 1;
                int i18 = iArr2[i16];
                if (i18 == 0) {
                    i16 = i14 + 1;
                } else if ((-1686637618 & i18) == ((16776960 & i18) >> 8)) {
                    int i19 = i18 & -198766505;
                    i18 &= -1320191620;
                    i16 = i14 + 1;
                    iArr[i14] = ((((i18 * i11) >> 8) & 16711935) + ((i18 * i12) & -1921000488)) + i19;
                } else {
                    i16 = i14 + 1;
                    iArr[i14] = i18;
                }
                i13++;
                i14 = i16;
                i16 = i17;
            }
            i13 = i14 + i8;
            i14 = i16 + i9;
        }
    }

    void ez(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & -1282737558;
        int i12 = (i10 >> 8) & 255;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                int i17 = i16 + 1;
                int i18 = iArr2[i16];
                if (i18 == 0) {
                    i16 = i14 + 1;
                } else if ((-2006660900 & i18) == ((-71935332 & i18) >> 8)) {
                    int i19 = i18 & -1836287661;
                    i18 &= 255;
                    i16 = i14 + 1;
                    iArr[i14] = ((((i18 * i11) >> 8) & -875480457) + ((i18 * i12) & 65280)) + i19;
                } else {
                    i16 = i14 + 1;
                    iArr[i14] = i18;
                }
                i13++;
                i14 = i16;
                i16 = i17;
            }
            i13 = i14 + i8;
            i14 = i16 + i9;
        }
    }

    void bu(em emVar, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((emVar.an << 4) - i9) * floor);
            int i15 = (((emVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((emVar.an << 4) - i9) * floor) + (((emVar.ac << 4) - i8) * floor2);
            floor = (floor * (-((emVar.ac << 4) - i8))) + (floor2 * ((emVar.an << 4) - i9));
            if (i10 < i12) {
                i7 = i12;
                i12 = i10;
                i10 = i7;
            }
            if (i14 < i12) {
                i12 = i14;
            }
            if (i16 < i12) {
                i12 = i16;
            }
            if (i14 <= i10) {
                i14 = i10;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 >= i13) {
                i7 = i11;
                i11 = i13;
                i13 = i7;
            }
            if (i15 < i11) {
                i11 = i15;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i15 <= i13) {
                i15 = i13;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = (i11 >> 12) + i4;
            i11 = ((i12 >> 12) + i3) >> 4;
            i13 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i15 = i16 >> 4;
            floor = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
            if (i11 < this.aa * 889727047) {
                i11 = 889727047 * this.aa;
            }
            if (i13 > this.ak * 579810681) {
                i13 = this.ak * 579810681;
            }
            if (i15 < this.aq * -1857728003) {
                i15 = -1857728003 * this.aq;
            }
            if (floor > this.ao * -90244733) {
                floor = -90244733 * this.ao;
            }
            i13 = i11 - i13;
            if (i13 < 0) {
                floor = i15 - floor;
                if (floor < 0) {
                    i16 = ((1075116703 * this.ac) * i15) + i11;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((i11 << 4) + 8) - i3;
                    i15 = ((i15 << 4) + 8) - i4;
                    i10 = (i8 << 8) - ((i15 * floor2) >> 4);
                    i8 = ((i15 * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i14 = floor; i14 < 0; i14++) {
                                if (i10 >= 0) {
                                    if (i8 >= 0) {
                                        if (i10 - (emVar.ac << 12) < 0 && i8 - (emVar.an << 12) < 0) {
                                            i15 = i13;
                                            i11 = i16;
                                            while (i15 < 0) {
                                                i12 = emVar.aj[(i10 >> 12) + (emVar.ac * (i8 >> 12))];
                                                if (i12 != 0) {
                                                    floor = i11 + 1;
                                                    this.aj[i11] = i12;
                                                } else {
                                                    floor = i11 + 1;
                                                }
                                                i15++;
                                                i11 = floor;
                                            }
                                        }
                                    }
                                }
                                i16 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i12 = i10;
                            i14 = i16;
                            i10 = floor;
                            while (i10 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i8;
                                if (i12 >= 0) {
                                    if (i12 - (emVar.ac << 12) < 0) {
                                        floor = i11 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            floor = (floor2 - floor) / floor2;
                                            i15 = i13 + floor;
                                            i11 += floor2 * floor;
                                            i16 = i14 + floor;
                                        } else {
                                            i15 = i13;
                                            i16 = i14;
                                        }
                                        floor = (i11 - floor2) / floor2;
                                        if (floor > i15) {
                                            i15 = floor;
                                        }
                                        while (i15 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i12 >> 12)];
                                            if (i9 != 0) {
                                                floor = i16 + 1;
                                                this.aj[i16] = i9;
                                            } else {
                                                floor = i16 + 1;
                                            }
                                            i11 += floor2;
                                            i15++;
                                            i16 = floor;
                                        }
                                    }
                                }
                                i14 += 1075116703 * this.ac;
                                i10++;
                                i12 -= floor2;
                            }
                        } else {
                            i12 = i10;
                            i14 = i16;
                            i10 = floor;
                            while (i10 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i8;
                                if (i12 >= 0) {
                                    if (i12 - (emVar.ac << 12) < 0) {
                                        if (i11 < 0) {
                                            floor = ((floor2 - 1) - i11) / floor2;
                                            i15 = i13 + floor;
                                            i11 += floor2 * floor;
                                            i16 = i14 + floor;
                                        } else {
                                            i15 = i13;
                                            i16 = i14;
                                        }
                                        floor = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                        if (floor > i15) {
                                            i15 = floor;
                                        }
                                        while (i15 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i12 >> 12)];
                                            if (i9 != 0) {
                                                floor = i16 + 1;
                                                this.aj[i16] = i9;
                                            } else {
                                                floor = i16 + 1;
                                            }
                                            i11 += floor2;
                                            i15++;
                                            i16 = floor;
                                        }
                                    }
                                }
                                floor = i10 + 1;
                                i14 += 1075116703 * this.ac;
                                i12 -= floor2;
                                i10 = floor;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i14 = i16;
                            for (i12 = floor; i12 < 0; i12++) {
                                i11 = i10 + ((i17 * floor3) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        floor = i11 - (emVar.ac << 12);
                                        if (floor >= 0) {
                                            floor = (floor3 - floor) / floor3;
                                            i15 = i13 + floor;
                                            i11 += floor3 * floor;
                                            i16 = i14 + floor;
                                        } else {
                                            i15 = i13;
                                            i16 = i14;
                                        }
                                        floor = (i11 - floor3) / floor3;
                                        if (floor > i15) {
                                            i15 = floor;
                                        }
                                        while (i15 < 0) {
                                            i9 = emVar.aj[(i11 >> 12) + (emVar.ac * (i8 >> 12))];
                                            if (i9 != 0) {
                                                floor = i16 + 1;
                                                this.aj[i16] = i9;
                                            } else {
                                                floor = i16 + 1;
                                            }
                                            i11 += floor3;
                                            i15++;
                                            i16 = floor;
                                        }
                                    }
                                }
                                i8 += floor3;
                                i14 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i12 = floor;
                            i9 = i10;
                            i10 = i16;
                            while (i12 < 0) {
                                i16 = i9 + ((i17 * floor3) >> 4);
                                i11 = i8 + ((i17 * floor2) >> 4);
                                try {
                                    floor = i16 - (emVar.ac << 12);
                                    if (floor >= 0) {
                                        i15 = (floor3 - floor) / floor3;
                                        floor = i13 + i15;
                                        i16 += floor3 * i15;
                                        i11 += i15 * floor2;
                                        i14 = i10 + i15;
                                    } else {
                                        floor = i13;
                                        i14 = i10;
                                    }
                                    i15 = (i16 - floor3) / floor3;
                                    if (i15 <= floor) {
                                        i15 = floor;
                                    }
                                    floor = i11 - (emVar.an << 12);
                                    if (floor >= 0) {
                                        floor = (floor2 - floor) / floor2;
                                        i15 += floor;
                                        i16 += floor * floor3;
                                        i11 += floor * floor2;
                                        i14 += floor;
                                    }
                                    floor = (i11 - floor2) / floor2;
                                    if (floor > i15) {
                                        i15 = floor;
                                    }
                                    while (i15 < 0) {
                                        r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                        if (r15 != 0) {
                                            floor = i14 + 1;
                                            this.aj[i14] = r15;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i16 += floor3;
                                        i11 += floor2;
                                        i15++;
                                        i14 = floor;
                                    }
                                    i8 += floor3;
                                    i10 += this.ac * 1075116703;
                                    i12++;
                                    i9 -= floor2;
                                } catch (Throwable e) {
                                    throw ei.ac(e, "ev.bu(" + ')');
                                }
                            }
                        } else {
                            i12 = floor;
                            i9 = i10;
                            i10 = i16;
                            while (i12 < 0) {
                                i16 = ((floor3 * i17) >> 4) + i9;
                                i11 = i8 + ((i17 * floor2) >> 4);
                                floor = i16 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i15 = (floor3 - floor) / floor3;
                                    floor = i13 + i15;
                                    i16 += floor3 * i15;
                                    i11 += floor2 * i15;
                                    i14 = i10 + i15;
                                } else {
                                    floor = i13;
                                    i14 = i10;
                                }
                                i15 = (i16 - floor3) / floor3;
                                if (i15 <= floor) {
                                    i15 = floor;
                                }
                                if (i11 < 0) {
                                    floor = ((floor2 - 1) - i11) / floor2;
                                    i15 += floor;
                                    i16 += floor3 * floor;
                                    i11 += floor * floor2;
                                    i14 += floor;
                                }
                                floor = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (floor > i15) {
                                    i15 = floor;
                                }
                                while (i15 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i14 + 1;
                                        this.aj[i14] = r15;
                                    } else {
                                        floor = i14 + 1;
                                    }
                                    i16 += floor3;
                                    i11 += floor2;
                                    i15++;
                                    i14 = floor;
                                }
                                i8 += floor3;
                                i10 += this.ac * 1075116703;
                                i12++;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i14 = i16;
                        for (i12 = floor; i12 < 0; i12++) {
                            i11 = i10 + ((i17 * floor3) >> 4);
                            if (i8 >= 0) {
                                if (i8 - (emVar.an << 12) < 0) {
                                    if (i11 < 0) {
                                        floor = ((floor3 - 1) - i11) / floor3;
                                        i15 = i13 + floor;
                                        i11 += floor3 * floor;
                                        i16 = i14 + floor;
                                    } else {
                                        i15 = i13;
                                        i16 = i14;
                                    }
                                    floor = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                    if (floor > i15) {
                                        i15 = floor;
                                    }
                                    while (i15 < 0) {
                                        i9 = emVar.aj[(emVar.ac * (i8 >> 12)) + (i11 >> 12)];
                                        if (i9 != 0) {
                                            floor = i16 + 1;
                                            this.aj[i16] = i9;
                                        } else {
                                            floor = i16 + 1;
                                        }
                                        i11 += floor3;
                                        i15++;
                                        i16 = floor;
                                    }
                                }
                            }
                            i8 += floor3;
                            i14 += this.ac * 1075116703;
                        }
                    } else if (floor2 < 0) {
                        i12 = floor;
                        i9 = i10;
                        i10 = i16;
                        while (i12 < 0) {
                            i16 = i9 + ((i17 * floor3) >> 4);
                            i11 = ((floor2 * i17) >> 4) + i8;
                            if (i16 < 0) {
                                i15 = ((floor3 - 1) - i16) / floor3;
                                floor = i13 + i15;
                                i16 += floor3 * i15;
                                i11 += floor2 * i15;
                                i14 = i10 + i15;
                            } else {
                                floor = i13;
                                i14 = i10;
                            }
                            i15 = (((i16 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i15 <= floor) {
                                i15 = floor;
                            }
                            floor = i11 - (emVar.an << 12);
                            if (floor >= 0) {
                                floor = (floor2 - floor) / floor2;
                                i15 += floor;
                                i16 += floor * floor3;
                                i11 += floor * floor2;
                                i14 += floor;
                            }
                            floor = (i11 - floor2) / floor2;
                            if (floor > i15) {
                                i15 = floor;
                            }
                            while (i15 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i14 + 1;
                                    this.aj[i14] = r15;
                                } else {
                                    floor = i14 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i15++;
                                i14 = floor;
                            }
                            i8 += floor3;
                            i10 += 1075116703 * this.ac;
                            i12++;
                            i9 -= floor2;
                        }
                    } else {
                        i12 = floor;
                        i9 = i10;
                        i10 = i16;
                        while (i12 < 0) {
                            i16 = ((i17 * floor3) >> 4) + i9;
                            i11 = ((i17 * floor2) >> 4) + i8;
                            if (i16 < 0) {
                                i15 = ((floor3 - 1) - i16) / floor3;
                                floor = i13 + i15;
                                i16 += i15 * floor3;
                                i11 += floor2 * i15;
                                i14 = i10 + i15;
                            } else {
                                floor = i13;
                                i14 = i10;
                            }
                            i15 = (((i16 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i15 <= floor) {
                                i15 = floor;
                            }
                            if (i11 < 0) {
                                floor = ((floor2 - 1) - i11) / floor2;
                                i15 += floor;
                                i16 += floor3 * floor;
                                i11 += floor2 * floor;
                                i14 += floor;
                            }
                            floor = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                            if (floor > i15) {
                                i15 = floor;
                            }
                            while (i15 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i14 + 1;
                                    this.aj[i14] = r15;
                                } else {
                                    floor = i14 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i15++;
                                i14 = floor;
                            }
                            i10 += 1075116703 * this.ac;
                            i12++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    void ed(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (769475327 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-i9) * floor2) + ((-(-i8)) * floor);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((emVar.an << 4) - i9) * floor);
            int i15 = (((emVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((emVar.an << 4) - i9) * floor) + (((emVar.ac << 4) - i8) * floor2);
            floor = (floor * (-((emVar.ac << 4) - i8))) + (floor2 * ((emVar.an << 4) - i9));
            if (i10 < i12) {
                i7 = i12;
                i12 = i10;
                i10 = i7;
            }
            if (i14 < i12) {
                i12 = i14;
            }
            if (i16 < i12) {
                i12 = i16;
            }
            if (i14 <= i10) {
                i14 = i10;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 < i13) {
                i7 = i13;
                i13 = i11;
                i11 = i7;
            }
            if (i15 < i13) {
                i13 = i15;
            }
            if (floor < i13) {
                i13 = floor;
            }
            if (i15 <= i11) {
                i15 = i11;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = ((floor + 4095) >> 12) + i4;
            floor = ((i12 >> 12) + i3) >> 4;
            i15 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i11 = ((i13 >> 12) + i4) >> 4;
            i13 = (i16 + 15) >> 4;
            if (floor < this.aa * -97412925) {
                floor = 889727047 * this.aa;
            }
            if (i15 > this.ak * 579810681) {
                i15 = this.ak * 420001307;
            }
            if (i11 < this.aq * -1857728003) {
                i11 = 1162639756 * this.aq;
            }
            if (i13 > this.ao * -90244733) {
                i13 = -90244733 * this.ao;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i13 = i11 - i13;
                if (i13 < 0) {
                    i16 = ((948670416 * this.ac) * i11) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i11 << 4) + 8) - i4;
                    i14 = (i8 << 8) - ((floor * floor2) >> 4);
                    i10 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i12 = i13; i12 < 0; i12++) {
                                if (i14 >= 0) {
                                    if (i10 >= 0) {
                                        if (i14 - (emVar.ac << 12) < 0) {
                                            if (i10 - (emVar.an << 12) < 0) {
                                                i11 = i15;
                                                i13 = i16;
                                                while (i11 < 0) {
                                                    i8 = emVar.aj[(i14 >> 12) + (emVar.ac * (i10 >> 12))];
                                                    if (i8 != 0) {
                                                        floor = i13 + 1;
                                                        this.aj[i13] = i8;
                                                    } else {
                                                        floor = i13 + 1;
                                                    }
                                                    i11++;
                                                    i13 = floor;
                                                }
                                            }
                                        }
                                    }
                                }
                                i16 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i12 = i13;
                            i8 = i14;
                            while (i12 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i10;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        floor = i11 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            i13 = (floor2 - floor) / floor2;
                                            floor = i15 + i13;
                                            i11 += floor2 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i14 = (i11 - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i13 += floor2;
                                            i11++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += -1813007553 * this.ac;
                                i12++;
                                i8 -= floor2;
                            }
                        } else {
                            i12 = i13;
                            i8 = i14;
                            while (i12 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i10;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        if (i11 < 0) {
                                            i13 = ((floor2 - 1) - i11) / floor2;
                                            floor = i15 + i13;
                                            i11 += floor2 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i14 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i13 += floor2;
                                            i11++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += -1345848631 * this.ac;
                                i12++;
                                i8 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i12 = i13;
                            i8 = i10;
                            while (i12 < 0) {
                                i11 = i14 + ((i17 * floor3) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        floor = i11 - (emVar.ac << 12);
                                        if (floor >= 0) {
                                            i13 = (floor3 - floor) / floor3;
                                            floor = i15 + i13;
                                            i11 += floor3 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i10 = (i11 - floor3) / floor3;
                                        if (i10 > floor) {
                                            i7 = i10;
                                            i10 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i10 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(i13 >> 12) + (emVar.ac * (i8 >> 12))];
                                            if (i9 != 0) {
                                                floor = i10 + 1;
                                                this.aj[i10] = i9;
                                            } else {
                                                floor = i10 + 1;
                                            }
                                            i13 += floor3;
                                            i11++;
                                            i10 = floor;
                                        }
                                    }
                                }
                                i16 += this.ac * 1075116703;
                                i12++;
                                i8 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i12 = i13;
                            i8 = i10;
                            i9 = i14;
                            i14 = i16;
                            while (i12 < 0) {
                                i13 = i9 + ((i17 * floor3) >> 4);
                                i11 = i8 + ((i17 * floor2) >> 4);
                                floor = i13 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += i16 * floor2;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i10 = (i13 - floor3) / floor3;
                                if (i10 > floor) {
                                    floor = i10;
                                }
                                i10 = i11 - (emVar.an << 12);
                                if (i10 >= 0) {
                                    i10 = (floor2 - i10) / floor2;
                                    floor += i10;
                                    i13 += i10 * floor3;
                                    i11 += i10 * floor2;
                                    i16 += i10;
                                }
                                i10 = (i11 - floor2) / floor2;
                                if (i10 > floor) {
                                    i7 = i10;
                                    i10 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i10 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i10 + 1;
                                        this.aj[i10] = r15;
                                    } else {
                                        floor = i10 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i10 = floor;
                                }
                                i14 += this.ac * 1075116703;
                                i12++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        } else {
                            i12 = i13;
                            i8 = i10;
                            i9 = i14;
                            i14 = i16;
                            while (i12 < 0) {
                                i13 = ((floor3 * i17) >> 4) + i9;
                                i11 = i8 + ((i17 * floor2) >> 4);
                                floor = i13 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i10 = (i13 - floor3) / floor3;
                                if (i10 > floor) {
                                    floor = i10;
                                }
                                if (i11 < 0) {
                                    i10 = ((floor2 - 1) - i11) / floor2;
                                    floor += i10;
                                    i13 += floor3 * i10;
                                    i11 += i10 * floor2;
                                    i16 += i10;
                                }
                                i10 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (i10 > floor) {
                                    i7 = i10;
                                    i10 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i10 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i10 + 1;
                                        this.aj[i10] = r15;
                                    } else {
                                        floor = i10 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i10 = floor;
                                }
                                i14 += this.ac * -2007957064;
                                i12++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i12 = i13;
                        i8 = i10;
                        while (i12 < 0) {
                            i11 = i14 + ((i17 * floor3) >> 4);
                            if (i8 >= 0) {
                                if (i8 - (emVar.an << 12) < 0) {
                                    if (i11 < 0) {
                                        i13 = ((floor3 - 1) - i11) / floor3;
                                        floor = i15 + i13;
                                        i11 += floor3 * i13;
                                        i13 += i16;
                                    } else {
                                        floor = i15;
                                        i13 = i16;
                                    }
                                    i10 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                    if (i10 > floor) {
                                        i7 = i10;
                                        i10 = i13;
                                        i13 = i11;
                                        i11 = i7;
                                    } else {
                                        i10 = i13;
                                        i13 = i11;
                                        i11 = floor;
                                    }
                                    while (i11 < 0) {
                                        i9 = emVar.aj[(emVar.ac * (i8 >> 12)) + (i13 >> 12)];
                                        if (i9 != 0) {
                                            floor = i10 + 1;
                                            this.aj[i10] = i9;
                                        } else {
                                            floor = i10 + 1;
                                        }
                                        i13 += floor3;
                                        i11++;
                                        i10 = floor;
                                    }
                                }
                            }
                            i16 += this.ac * 1075116703;
                            i12++;
                            i8 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i12 = i13;
                        i8 = i10;
                        i9 = i14;
                        i14 = i16;
                        while (i12 < 0) {
                            i13 = i9 + ((i17 * floor3) >> 4);
                            i11 = ((floor2 * i17) >> 4) + i8;
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += floor3 * i16;
                                i11 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i10 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i10 > floor) {
                                floor = i10;
                            }
                            i10 = i11 - (emVar.an << 12);
                            if (i10 >= 0) {
                                i10 = (floor2 - i10) / floor2;
                                floor += i10;
                                i13 += i10 * floor3;
                                i11 += i10 * floor2;
                                i16 += i10;
                            }
                            i10 = (i11 - floor2) / floor2;
                            if (i10 > floor) {
                                i7 = i10;
                                i10 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i10 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i10 + 1;
                                    this.aj[i10] = r15;
                                } else {
                                    floor = i10 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i10 = floor;
                            }
                            i14 += 949409534 * this.ac;
                            i12++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    } else {
                        i12 = i13;
                        i8 = i10;
                        i9 = i14;
                        i14 = i16;
                        while (i12 < 0) {
                            i13 = ((i17 * floor3) >> 4) + i9;
                            i11 = ((i17 * floor2) >> 4) + i8;
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += i16 * floor3;
                                i11 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i10 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i10 > floor) {
                                floor = i10;
                            }
                            if (i11 < 0) {
                                i10 = ((floor2 - 1) - i11) / floor2;
                                floor += i10;
                                i13 += floor3 * i10;
                                i11 += floor2 * i10;
                                i16 += i10;
                            }
                            i10 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                            if (i10 > floor) {
                                i7 = i10;
                                i10 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i10 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i10 + 1;
                                    this.aj[i10] = r15;
                                } else {
                                    floor = i10 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i10 = floor;
                            }
                            i14 += 1075116703 * this.ac;
                            i12++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    void et(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (-1221508509 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((emVar.an << 4) - i9) * floor);
            int i15 = (((emVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((emVar.an << 4) - i9) * floor) + (((emVar.ac << 4) - i8) * floor2);
            floor = (floor * (-((emVar.ac << 4) - i8))) + (floor2 * ((emVar.an << 4) - i9));
            if (i10 >= i12) {
                i7 = i10;
                i10 = i12;
                i12 = i7;
            }
            if (i14 < i10) {
                i10 = i14;
            }
            if (i16 < i10) {
                i10 = i16;
            }
            if (i14 <= i12) {
                i14 = i12;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 >= i13) {
                i7 = i11;
                i11 = i13;
                i13 = i7;
            }
            if (i15 < i11) {
                i11 = i15;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i15 <= i13) {
                i15 = i13;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = ((floor + 4095) >> 12) + i4;
            floor = ((i10 >> 12) + i3) >> 4;
            i15 = ((((853668051 + i16) >> 12) + i3) + 15) >> 4;
            i13 = ((i11 >> 12) + i4) >> 4;
            i11 = (i16 + 15) >> 4;
            if (floor < this.aa * 889727047) {
                floor = 889727047 * this.aa;
            }
            if (i15 > this.ak * -1274876301) {
                i15 = this.ak * 8242743;
            }
            if (i13 < this.aq * 1527505625) {
                i13 = -1453396738 * this.aq;
            }
            if (i11 > this.ao * -90244733) {
                i11 = -164372342 * this.ao;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i14 = floor + ((1075116703 * this.ac) * i13);
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i13 << 4) + 8) - i4;
                    i10 = (i8 << 8) - ((floor * floor2) >> 4);
                    i12 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            i16 = i14;
                            for (i14 = i11; i14 < 0; i14++) {
                                if (i10 >= 0) {
                                    if (i12 >= 0) {
                                        if (i10 - (emVar.ac << 12) < 0 && i12 - (emVar.an << 12) < 0) {
                                            i13 = i15;
                                            i11 = i16;
                                            while (i13 < 0) {
                                                i8 = emVar.aj[(i10 >> 12) + (emVar.ac * (i12 >> 12))];
                                                if (i8 != 0) {
                                                    floor = i11 + 1;
                                                    this.aj[i11] = i8;
                                                } else {
                                                    floor = i11 + 1;
                                                }
                                                i13++;
                                                i11 = floor;
                                            }
                                        }
                                    }
                                }
                                i16 += this.ac * -1874114059;
                            }
                        } else if (floor2 < 0) {
                            i8 = i10;
                            i16 = i14;
                            i10 = i11;
                            while (i10 < 0) {
                                i13 = ((i17 * floor2) >> 4) + i12;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        floor = i13 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            i11 = (floor2 - floor) / floor2;
                                            floor = i15 + i11;
                                            i13 += floor2 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i14 = (i13 - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i11 = i10 + 1;
                                i16 += -568441350 * this.ac;
                                i8 -= floor2;
                                i10 = i11;
                            }
                        } else {
                            i8 = i10;
                            i16 = i14;
                            i10 = i11;
                            while (i10 < 0) {
                                i13 = ((i17 * floor2) >> 4) + i12;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        if (i13 < 0) {
                                            i11 = ((floor2 - 1) - i13) / floor2;
                                            floor = i15 + i11;
                                            i13 += floor2 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i14 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i11 = i10 + 1;
                                i16 += 1137402427 * this.ac;
                                i8 -= floor2;
                                i10 = i11;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i8 = i12;
                            i16 = i14;
                            i12 = i11;
                            while (i12 < 0) {
                                i13 = i10 + ((i17 * floor3) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        floor = i13 - (emVar.ac << 12);
                                        if (floor >= 0) {
                                            i11 = (floor3 - floor) / floor3;
                                            floor = i15 + i11;
                                            i13 += floor3 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i14 = (i13 - floor3) / floor3;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(i11 >> 12) + (emVar.ac * (i8 >> 12))];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i11 += floor3;
                                            i13++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i11 = i12 + 1;
                                i16 += this.ac * -1069108800;
                                i8 += floor3;
                                i12 = i11;
                            }
                        } else if (floor2 < 0) {
                            i8 = i12;
                            i9 = i10;
                            i10 = i11;
                            while (i10 < 0) {
                                i11 = i9 + ((i17 * floor3) >> 4);
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += floor3 * i16;
                                    i13 += i16 * floor2;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i11 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += i12 * floor3;
                                    i13 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (i13 - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = floor;
                                }
                                while (i13 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i11 += floor2;
                                    i13++;
                                    i12 = floor;
                                }
                                i11 = i10 + 1;
                                i14 += this.ac * -1950710583;
                                i8 += floor3;
                                i9 -= floor2;
                                i10 = i11;
                            }
                        } else {
                            i8 = i12;
                            i9 = i10;
                            i10 = i11;
                            while (i10 < 0) {
                                i11 = ((floor3 * i17) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += floor3 * i16;
                                    i13 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i11 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                if (i13 < 0) {
                                    i12 = ((floor2 - 1) - i13) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
                                    i13 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = floor;
                                }
                                while (i13 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i11 += floor2;
                                    i13++;
                                    i12 = floor;
                                }
                                i11 = i10 + 1;
                                i14 += this.ac * -1312495400;
                                i8 += floor3;
                                i9 -= floor2;
                                i10 = i11;
                            }
                        }
                    } else if (floor2 == 0) {
                        i8 = i12;
                        i16 = i14;
                        i12 = i11;
                        while (i12 < 0) {
                            i13 = i10 + ((i17 * floor3) >> 4);
                            if (i8 >= 0) {
                                if (i8 - (emVar.an << 12) < 0) {
                                    if (i13 < 0) {
                                        i11 = ((floor3 - 1) - i13) / floor3;
                                        floor = i15 + i11;
                                        i13 += floor3 * i11;
                                        i11 += i16;
                                    } else {
                                        floor = i15;
                                        i11 = i16;
                                    }
                                    i14 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                    if (i14 > floor) {
                                        i7 = i14;
                                        i14 = i11;
                                        i11 = i13;
                                        i13 = i7;
                                    } else {
                                        i14 = i11;
                                        i11 = i13;
                                        i13 = floor;
                                    }
                                    while (i13 < 0) {
                                        i9 = emVar.aj[(emVar.ac * (i8 >> 12)) + (i11 >> 12)];
                                        if (i9 != 0) {
                                            floor = i14 + 1;
                                            this.aj[i14] = i9;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i11 += floor3;
                                        i13++;
                                        i14 = floor;
                                    }
                                }
                            }
                            i11 = i12 + 1;
                            i16 += this.ac * -1883535191;
                            i8 += floor3;
                            i12 = i11;
                        }
                    } else if (floor2 < 0) {
                        i8 = i12;
                        i9 = i10;
                        i10 = i11;
                        while (i10 < 0) {
                            i11 = i9 + ((i17 * floor3) >> 4);
                            i13 = ((floor2 * i17) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += floor3 * i16;
                                i13 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            i12 = i13 - (emVar.an << 12);
                            if (i12 >= 0) {
                                i12 = (floor2 - i12) / floor2;
                                floor += i12;
                                i11 += i12 * floor3;
                                i13 += i12 * floor2;
                                i16 += i12;
                            }
                            i12 = (i13 - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = i7;
                            } else {
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = floor;
                            }
                            while (i13 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i13++;
                                i12 = floor;
                            }
                            i11 = i10 + 1;
                            i14 += -2143968782 * this.ac;
                            i8 += floor3;
                            i9 -= floor2;
                            i10 = i11;
                        }
                    } else {
                        i8 = i12;
                        i9 = i10;
                        i10 = i11;
                        while (i10 < 0) {
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            if (i13 < 0) {
                                i12 = ((floor2 - 1) - i13) / floor2;
                                floor += i12;
                                i11 += floor3 * i12;
                                i13 += floor2 * i12;
                                i16 += i12;
                            }
                            i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = i7;
                            } else {
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = floor;
                            }
                            while (i13 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i13++;
                                i12 = floor;
                            }
                            i14 += 1005555844 * this.ac;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    void ex(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((emVar.an << 4) - i9) * floor);
            int i15 = (((emVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((emVar.an << 4) - i9) * floor) + (((emVar.ac << 4) - i8) * floor2);
            floor = (floor * (-((emVar.ac << 4) - i8))) + (floor2 * ((emVar.an << 4) - i9));
            if (i10 >= i12) {
                i7 = i10;
                i10 = i12;
                i12 = i7;
            }
            if (i14 < i10) {
                i10 = i14;
            }
            if (i16 < i10) {
                i10 = i16;
            }
            if (i14 <= i12) {
                i14 = i12;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 >= i13) {
                i7 = i11;
                i11 = i13;
                i13 = i7;
            }
            if (i15 < i11) {
                i11 = i15;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i15 <= i13) {
                i15 = i13;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = ((floor + 4095) >> 12) + i4;
            floor = ((i10 >> 12) + i3) >> 4;
            i15 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i13 = ((i11 >> 12) + i4) >> 4;
            i11 = (i16 + 15) >> 4;
            if (floor < this.aa * 889727047) {
                floor = 889727047 * this.aa;
            }
            if (i15 > this.ak * 579810681) {
                i15 = this.ak * 579810681;
            }
            if (i13 < this.aq * -1857728003) {
                i13 = -1857728003 * this.aq;
            }
            if (i11 > this.ao * -90244733) {
                i11 = -90244733 * this.ao;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i16 = ((1075116703 * this.ac) * i13) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i13 << 4) + 8) - i4;
                    i14 = (i8 << 8) - ((floor * floor2) >> 4);
                    i12 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i10 = i11; i10 < 0; i10++) {
                                if (i14 >= 0 && i12 >= 0 && i14 - (emVar.ac << 12) < 0 && i12 - (emVar.an << 12) < 0) {
                                    i13 = i15;
                                    i11 = i16;
                                    while (i13 < 0) {
                                        i8 = emVar.aj[(i14 >> 12) + (emVar.ac * (i12 >> 12))];
                                        if (i8 != 0) {
                                            floor = i11 + 1;
                                            this.aj[i11] = i8;
                                        } else {
                                            floor = i11 + 1;
                                        }
                                        i13++;
                                        i11 = floor;
                                    }
                                }
                                i16 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i8 = i14;
                            while (i10 < 0) {
                                i13 = ((i17 * floor2) >> 4) + i12;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        floor = i13 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            i11 = (floor2 - floor) / floor2;
                                            floor = i15 + i11;
                                            i13 += floor2 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i14 = (i13 - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += 1075116703 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        } else {
                            i10 = i11;
                            i8 = i14;
                            while (i10 < 0) {
                                i13 = ((i17 * floor2) >> 4) + i12;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        if (i13 < 0) {
                                            i11 = ((floor2 - 1) - i13) / floor2;
                                            floor = i15 + i11;
                                            i13 += floor2 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i14 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i14 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += 1075116703 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i10 = i11;
                            i8 = i12;
                            while (i10 < 0) {
                                i13 = i14 + ((i17 * floor3) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        floor = i13 - (emVar.ac << 12);
                                        if (floor >= 0) {
                                            i11 = (floor3 - floor) / floor3;
                                            floor = i15 + i11;
                                            i13 += floor3 * i11;
                                            i11 += i16;
                                        } else {
                                            floor = i15;
                                            i11 = i16;
                                        }
                                        i12 = (i13 - floor3) / floor3;
                                        if (i12 > floor) {
                                            i7 = i12;
                                            i12 = i11;
                                            i11 = i13;
                                            i13 = i7;
                                        } else {
                                            i12 = i11;
                                            i11 = i13;
                                            i13 = floor;
                                        }
                                        while (i13 < 0) {
                                            i9 = emVar.aj[(i11 >> 12) + (emVar.ac * (i8 >> 12))];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i11 += floor3;
                                            i13++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i16 += this.ac * 1075116703;
                                i10++;
                                i8 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i8 = i12;
                            i9 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = i9 + ((i17 * floor3) >> 4);
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += floor3 * i16;
                                    i13 += i16 * floor2;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i11 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += i12 * floor3;
                                    i13 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (i13 - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = floor;
                                }
                                while (i13 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i11 += floor2;
                                    i13++;
                                    i12 = floor;
                                }
                                i14 += this.ac * 1075116703;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = i11;
                            i8 = i12;
                            i9 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((floor3 * i17) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += floor3 * i16;
                                    i13 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i11 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                if (i13 < 0) {
                                    i12 = ((floor2 - 1) - i13) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
                                    i13 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i11;
                                    i11 = i13;
                                    i13 = floor;
                                }
                                while (i13 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i11 += floor2;
                                    i13++;
                                    i12 = floor;
                                }
                                i14 += this.ac * 1075116703;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i10 = i11;
                        i8 = i12;
                        while (i10 < 0) {
                            i13 = i14 + ((i17 * floor3) >> 4);
                            if (i8 >= 0) {
                                if (i8 - (emVar.an << 12) < 0) {
                                    if (i13 < 0) {
                                        i11 = ((floor3 - 1) - i13) / floor3;
                                        floor = i15 + i11;
                                        i13 += floor3 * i11;
                                        i11 += i16;
                                    } else {
                                        floor = i15;
                                        i11 = i16;
                                    }
                                    i12 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                    if (i12 > floor) {
                                        i7 = i12;
                                        i12 = i11;
                                        i11 = i13;
                                        i13 = i7;
                                    } else {
                                        i12 = i11;
                                        i11 = i13;
                                        i13 = floor;
                                    }
                                    while (i13 < 0) {
                                        i9 = emVar.aj[(emVar.ac * (i8 >> 12)) + (i11 >> 12)];
                                        if (i9 != 0) {
                                            floor = i12 + 1;
                                            this.aj[i12] = i9;
                                        } else {
                                            floor = i12 + 1;
                                        }
                                        i11 += floor3;
                                        i13++;
                                        i12 = floor;
                                    }
                                }
                            }
                            i16 += this.ac * 1075116703;
                            i10++;
                            i8 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i10 = i11;
                        i8 = i12;
                        i9 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = i9 + ((i17 * floor3) >> 4);
                            i13 = ((floor2 * i17) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += floor3 * i16;
                                i13 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            i12 = i13 - (emVar.an << 12);
                            if (i12 >= 0) {
                                i12 = (floor2 - i12) / floor2;
                                floor += i12;
                                i11 += i12 * floor3;
                                i13 += i12 * floor2;
                                i16 += i12;
                            }
                            i12 = (i13 - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = i7;
                            } else {
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = floor;
                            }
                            while (i13 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i13++;
                                i12 = floor;
                            }
                            i14 += 1075116703 * this.ac;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    } else {
                        i10 = i11;
                        i8 = i12;
                        i9 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            if (i13 < 0) {
                                i12 = ((floor2 - 1) - i13) / floor2;
                                floor += i12;
                                i11 += floor3 * i12;
                                i13 += floor2 * i12;
                                i16 += i12;
                            }
                            i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = i7;
                            } else {
                                i12 = i16;
                                i16 = i11;
                                i11 = i13;
                                i13 = floor;
                            }
                            while (i13 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i11 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i11 += floor2;
                                i13++;
                                i12 = floor;
                            }
                            i14 += 1075116703 * this.ac;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    void ey(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i8) * floor2) + ((-i9) * floor);
            int i11 = ((-i9) * floor2) + ((-(-i8)) * floor);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = ((-i8) * floor2) + (((emVar.an << 4) - i9) * floor);
            int i15 = (((emVar.an << 4) - i9) * floor2) + ((-(-i8)) * floor);
            int i16 = (((emVar.an << 4) - i9) * floor) + (((emVar.ac << 4) - i8) * floor2);
            floor = (floor * (-((emVar.ac << 4) - i8))) + (floor2 * ((emVar.an << 4) - i9));
            if (i10 >= i12) {
                i7 = i10;
                i10 = i12;
                i12 = i7;
            }
            if (i14 < i10) {
                i10 = i14;
            }
            if (i16 < i10) {
                i10 = i16;
            }
            if (i14 <= i12) {
                i14 = i12;
            }
            if (i16 <= i14) {
                i16 = i14;
            }
            if (i11 < i13) {
                i7 = i13;
                i13 = i11;
                i11 = i7;
            }
            if (i15 < i13) {
                i13 = i15;
            }
            if (floor < i13) {
                i13 = floor;
            }
            if (i15 <= i11) {
                i15 = i11;
            }
            if (floor <= i15) {
                floor = i15;
            }
            i16 = ((floor + 1577628844) >> 12) + i4;
            floor = ((i10 >> 12) + i3) >> 4;
            i15 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i11 = ((i13 >> 12) + i4) >> 4;
            i13 = (i16 + 15) >> 4;
            if (floor < this.aa * 1375347487) {
                floor = -1912149634 * this.aa;
            }
            if (i15 > this.ak * 579810681) {
                i15 = this.ak * -315700624;
            }
            if (i11 < this.aq * 1617339810) {
                i11 = -1857728003 * this.aq;
            }
            if (i13 > this.ao * -90244733) {
                i13 = 961867920 * this.ao;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i13 = i11 - i13;
                if (i13 < 0) {
                    i16 = ((951817795 * this.ac) * i11) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i11 << 4) + 8) - i4;
                    i12 = (i8 << 8) - ((floor * floor2) >> 4);
                    i14 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i10 = i13; i10 < 0; i10++) {
                                if (i12 >= 0 && i14 >= 0 && i12 - (emVar.ac << 12) < 0 && i14 - (emVar.an << 12) < 0) {
                                    i11 = i15;
                                    i13 = i16;
                                    while (i11 < 0) {
                                        i8 = emVar.aj[(i12 >> 12) + (emVar.ac * (i14 >> 12))];
                                        if (i8 != 0) {
                                            floor = i13 + 1;
                                            this.aj[i13] = i8;
                                        } else {
                                            floor = i13 + 1;
                                        }
                                        i11++;
                                        i13 = floor;
                                    }
                                }
                                i16 += this.ac * -1436885891;
                            }
                        } else if (floor2 < 0) {
                            i10 = i13;
                            i8 = i12;
                            while (i10 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i14;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        floor = i11 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            i13 = (floor2 - floor) / floor2;
                                            floor = i15 + i13;
                                            i11 += floor2 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i12 = (i11 - floor2) / floor2;
                                        if (i12 > floor) {
                                            i7 = i12;
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i13 += floor2;
                                            i11++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i16 += 1075116703 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        } else {
                            i10 = i13;
                            i8 = i12;
                            while (i10 < 0) {
                                i11 = ((i17 * floor2) >> 4) + i14;
                                if (i8 >= 0) {
                                    if (i8 - (emVar.ac << 12) < 0) {
                                        if (i11 < 0) {
                                            i13 = ((floor2 - 1) - i11) / floor2;
                                            floor = i15 + i13;
                                            i11 += floor2 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i12 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                        if (i12 > floor) {
                                            i7 = i12;
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i12 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i8 >> 12)];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i13 += floor2;
                                            i11++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i16 += 1075116703 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i10 = i13;
                            i8 = i14;
                            while (i10 < 0) {
                                i11 = i12 + ((i17 * floor3) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        floor = i11 - (emVar.ac << 12);
                                        if (floor >= 0) {
                                            i13 = (floor3 - floor) / floor3;
                                            floor = i15 + i13;
                                            i11 += floor3 * i13;
                                            i13 += i16;
                                        } else {
                                            floor = i15;
                                            i13 = i16;
                                        }
                                        i14 = (i11 - floor3) / floor3;
                                        if (i14 > floor) {
                                            i7 = i14;
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = i7;
                                        } else {
                                            i14 = i13;
                                            i13 = i11;
                                            i11 = floor;
                                        }
                                        while (i11 < 0) {
                                            i9 = emVar.aj[(i13 >> 12) + (emVar.ac * (i8 >> 12))];
                                            if (i9 != 0) {
                                                floor = i14 + 1;
                                                this.aj[i14] = i9;
                                            } else {
                                                floor = i14 + 1;
                                            }
                                            i13 += floor3;
                                            i11++;
                                            i14 = floor;
                                        }
                                    }
                                }
                                i16 += this.ac * 274251423;
                                i10++;
                                i8 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i10 = i13;
                            i8 = i14;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i13 = i9 + ((i17 * floor3) >> 4);
                                i11 = i8 + ((i17 * floor2) >> 4);
                                floor = i13 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += i16 * floor2;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i13 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                i12 = i11 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i13 += i12 * floor3;
                                    i11 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (i11 - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i12 = floor;
                                }
                                i14 += this.ac * -1418366953;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = i13;
                            i8 = i14;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i13 = ((floor3 * i17) >> 4) + i9;
                                i11 = i8 + ((i17 * floor2) >> 4);
                                floor = i13 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i13 += floor3 * i16;
                                    i11 += floor2 * i16;
                                    i16 += i14;
                                } else {
                                    floor = i15;
                                    i16 = i14;
                                }
                                i12 = (i13 - floor3) / floor3;
                                if (i12 > floor) {
                                    floor = i12;
                                }
                                if (i11 < 0) {
                                    i12 = ((floor2 - 1) - i11) / floor2;
                                    floor += i12;
                                    i13 += floor3 * i12;
                                    i11 += i12 * floor2;
                                    i16 += i12;
                                }
                                i12 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (i12 > floor) {
                                    i7 = i12;
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = i7;
                                } else {
                                    i12 = i16;
                                    i16 = i13;
                                    i13 = i11;
                                    i11 = floor;
                                }
                                while (i11 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i12 + 1;
                                        this.aj[i12] = r15;
                                    } else {
                                        floor = i12 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i11++;
                                    i12 = floor;
                                }
                                i14 += this.ac * 1075116703;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i10 = i13;
                        i8 = i14;
                        while (i10 < 0) {
                            i11 = i12 + ((i17 * floor3) >> 4);
                            if (i8 >= 0) {
                                if (i8 - (emVar.an << 12) < 0) {
                                    if (i11 < 0) {
                                        i13 = ((floor3 - 1) - i11) / floor3;
                                        floor = i15 + i13;
                                        i11 += floor3 * i13;
                                        i13 += i16;
                                    } else {
                                        floor = i15;
                                        i13 = i16;
                                    }
                                    i14 = (((i11 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                    if (i14 > floor) {
                                        i7 = i14;
                                        i14 = i13;
                                        i13 = i11;
                                        i11 = i7;
                                    } else {
                                        i14 = i13;
                                        i13 = i11;
                                        i11 = floor;
                                    }
                                    while (i11 < 0) {
                                        i9 = emVar.aj[(emVar.ac * (i8 >> 12)) + (i13 >> 12)];
                                        if (i9 != 0) {
                                            floor = i14 + 1;
                                            this.aj[i14] = i9;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i13 += floor3;
                                        i11++;
                                        i14 = floor;
                                    }
                                }
                            }
                            i16 += this.ac * -940681133;
                            i10++;
                            i8 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i10 = i13;
                        i8 = i14;
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i13 = i9 + ((i17 * floor3) >> 4);
                            i11 = ((floor2 * i17) >> 4) + i8;
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += floor3 * i16;
                                i11 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            i12 = i11 - (emVar.an << 12);
                            if (i12 >= 0) {
                                i12 = (floor2 - i12) / floor2;
                                floor += i12;
                                i13 += i12 * floor3;
                                i11 += i12 * floor2;
                                i16 += i12;
                            }
                            i12 = (i11 - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i12 = floor;
                            }
                            i14 += -1154142741 * this.ac;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    } else {
                        i10 = i13;
                        i8 = i14;
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i13 = ((i17 * floor3) >> 4) + i9;
                            i11 = ((i17 * floor2) >> 4) + i8;
                            if (i13 < 0) {
                                i16 = ((floor3 - 1) - i13) / floor3;
                                floor = i15 + i16;
                                i13 += i16 * floor3;
                                i11 += floor2 * i16;
                                i16 += i14;
                            } else {
                                floor = i15;
                                i16 = i14;
                            }
                            i12 = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                            if (i12 > floor) {
                                floor = i12;
                            }
                            if (i11 < 0) {
                                i12 = ((floor2 - 1) - i11) / floor2;
                                floor += i12;
                                i13 += floor3 * i12;
                                i11 += floor2 * i12;
                                i16 += i12;
                            }
                            i12 = (((i11 + 1) - (emVar.an << 12)) - floor2) / floor2;
                            if (i12 > floor) {
                                i7 = i12;
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = i7;
                            } else {
                                i12 = i16;
                                i16 = i13;
                                i13 = i11;
                                i11 = floor;
                            }
                            while (i11 < 0) {
                                r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                if (r15 != 0) {
                                    floor = i12 + 1;
                                    this.aj[i12] = r15;
                                } else {
                                    floor = i12 + 1;
                                }
                                i16 += floor3;
                                i13 += floor2;
                                i11++;
                                i12 = floor;
                            }
                            i14 += 1075116703 * this.ac;
                            i10++;
                            i8 += floor3;
                            i9 -= floor2;
                        }
                    }
                }
            }
        }
    }

    public void bd(em emVar, int i, int i2, int i3, int i4, int i5) {
        try {
            if (i3 > emVar.aa || i4 > emVar.ak) {
                throw new IllegalArgumentException();
            }
            int i6;
            int i7;
            int i8 = i + ((emVar.aq * i3) / emVar.aa);
            int i9 = (((emVar.aa + ((emVar.ac + emVar.aq) * i3)) - 1) / emVar.aa) + i;
            int i10 = ((emVar.ao * i4) / emVar.ak) + i2;
            int i11 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
            if (i8 < this.aa * 889727047) {
                i8 = this.aa * 889727047;
            }
            if (i9 > this.ak * 579810681) {
                i6 = 579810681 * this.ak;
            } else {
                i6 = i9;
            }
            if (i10 < this.aq * -1857728003) {
                i10 = this.aq * -1857728003;
            }
            if (i11 > -90244733 * this.ao) {
                i7 = -90244733 * this.ao;
            } else {
                i7 = i11;
            }
            if (i8 < i6 && i10 < i7) {
                i11 = ((this.ac * 1075116703) * i10) + i8;
                int i12 = (this.ac * 1075116703) - (i6 - i8);
                if (i11 < this.aj.length) {
                    for (int i13 = i10; i13 < i7; i13++) {
                        int i14 = i8;
                        while (i14 < i6) {
                            i10 = (i14 - i) << 4;
                            int i15 = (i13 - i2) << 4;
                            int i16 = ((emVar.aa * i10) / i3) - (emVar.aq << 4);
                            int i17 = (((i10 + 16) * emVar.aa) / i3) - (emVar.aq << 4);
                            i9 = ((emVar.ak * i15) / i4) - (emVar.ao << 4);
                            i10 = ((emVar.ak * (i15 + 16)) / i4) - (emVar.ao << 4);
                            int i18 = ((i17 - i16) * (i10 - i9)) >> 1;
                            if (i18 == 0) {
                                i10 = i11;
                            } else {
                                if (i16 < 0) {
                                    i15 = 0;
                                } else {
                                    i15 = i16;
                                }
                                if (i17 >= (emVar.ac << 4)) {
                                    i16 = emVar.ac << 4;
                                } else {
                                    i16 = i17;
                                }
                                if (i9 < 0) {
                                    i17 = 0;
                                } else {
                                    i17 = i9;
                                }
                                if (i10 >= (emVar.an << 4)) {
                                    i10 = emVar.an << 4;
                                }
                                i16--;
                                i10--;
                                int i19 = 16 - (i15 & 15);
                                int i20 = (i16 & 15) + 1;
                                int i21 = 16 - (i17 & 15);
                                i9 = (i10 & 15) + 1;
                                int i22 = i15 >> 4;
                                int i23 = i16 >> 4;
                                int i24 = i17 >> 4;
                                int i25 = i10 >> 4;
                                int i26 = 0;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                for (int i27 = i24; i27 <= i25; i27++) {
                                    i10 = 16;
                                    if (i27 == i24) {
                                        i10 = i21;
                                    }
                                    if (i27 == i25) {
                                        i10 = i9;
                                    }
                                    for (int i28 = i22; i28 <= i23; i28++) {
                                        int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                        if (i29 != 0) {
                                            int i30;
                                            if (i28 == i22) {
                                                i30 = i10 * i19;
                                            } else if (i23 == i28) {
                                                i30 = i10 * i20;
                                            } else {
                                                i30 = i10 << 4;
                                            }
                                            i17 += i30;
                                            i26 += ((i29 >> 16) & 255) * i30;
                                            i15 += ((i29 >> 8) & 255) * i30;
                                            i16 += i30 * (i29 & 255);
                                        }
                                    }
                                }
                                if (i17 >= i18) {
                                    i10 = (((i26 / i17) << 16) + ((i15 / i17) << 8)) + (i16 / i17);
                                    if (i10 == 0) {
                                        i10 = 1;
                                    }
                                    this.aj[i11] = i10;
                                }
                                i10 = i11 + 1;
                            }
                            i14++;
                            i11 = i10;
                        }
                        i11 += i12;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ev.bd(" + ')');
        }
    }

    public void ea(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > emVar.aa || i4 > emVar.ak) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((emVar.aq * i3) / emVar.aa) + i;
        int i7 = (((emVar.aa + ((emVar.ac + emVar.aq) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < this.aa * 946383189) {
            i6 = this.aa * 889727047;
        }
        if (i7 > this.ak * 579810681) {
            i7 = -1789661428 * this.ak;
        }
        if (i8 < this.aq * 1856772461) {
            i8 = this.aq * -1857728003;
        }
        if (i9 > -344249306 * this.ao) {
            i5 = -577243330 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((this.ac * 1075116703) * i8) + i6;
            int i11 = (this.ac * -923761111) - (i7 - i6);
            if (i10 < this.aj.length) {
                for (int i12 = i8; i12 < i5; i12++) {
                    int i13 = i6;
                    while (i13 < i7) {
                        i9 = (i13 - i) << 4;
                        int i14 = (i12 - i2) << 4;
                        i8 = ((emVar.aa * i9) / i3) - (emVar.aq << 4);
                        int i15 = (((i9 + 16) * emVar.aa) / i3) - (emVar.aq << 4);
                        i9 = ((emVar.ak * i14) / i4) - (emVar.ao << 4);
                        i14 = (((i14 + 16) * emVar.ak) / i4) - (emVar.ao << 4);
                        int i16 = ((i15 - i8) * (i14 - i9)) >> 1;
                        if (i16 == 0) {
                            i8 = i10;
                        } else {
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            if (i15 >= (emVar.ac << 4)) {
                                i15 = emVar.ac << 4;
                            }
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i14 >= (emVar.an << 4)) {
                                i14 = emVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i8 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i9 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i8 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i9 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i8 = 16;
                                if (i27 == i23) {
                                    i8 = i20;
                                }
                                if (i27 == i24) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                    if (i29 != 0) {
                                        if (i28 == i21) {
                                            i9 = i8 * i18;
                                        } else if (i22 == i28) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & 1719223370) * i9;
                                        i9 = (i9 * (i29 & -1608159754)) + i17;
                                        i17 = i26 + (((i29 >> 8) & 255) * i9);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i9;
                                        i9 = i30;
                                    } else {
                                        i9 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i9;
                                }
                            }
                            if (i15 >= i16) {
                                i8 = (((i25 / i15) << 16) + ((i26 / i15) << 8)) + (i17 / i15);
                                if (i8 == 0) {
                                    i8 = 1;
                                }
                                this.aj[i10] = i8;
                            }
                            i8 = i10 + 1;
                        }
                        i13++;
                        i10 = i8;
                    }
                    i10 += i11;
                }
            }
        }
    }

    public void ec(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > emVar.aa || i4 > emVar.ak) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((emVar.aq * i3) / emVar.aa) + i;
        int i7 = (((emVar.aa + ((emVar.ac + emVar.aq) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < this.aa * 889727047) {
            i6 = this.aa * 889727047;
        }
        if (i7 > this.ak * 579810681) {
            i7 = -1322212103 * this.ak;
        }
        if (i8 < this.aq * -236205964) {
            i8 = this.aq * -2075646016;
        }
        if (i9 > -587807547 * this.ao) {
            i5 = 1214237730 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            i9 = ((this.ac * -918995279) * i8) + i6;
            int i10 = (this.ac * 914939243) - (i7 - i6);
            if (i9 < this.aj.length) {
                int i11 = i8;
                i8 = i9;
                while (i11 < i5) {
                    for (int i12 = i6; i12 < i7; i12++) {
                        int i13 = (i12 - i) << 4;
                        int i14 = (i11 - i2) << 4;
                        i9 = ((emVar.aa * i13) / i3) - (emVar.aq << 4);
                        int i15 = (((i13 + 16) * emVar.aa) / i3) - (emVar.aq << 4);
                        i13 = ((emVar.ak * i14) / i4) - (emVar.ao << 4);
                        i14 = (((i14 + 16) * emVar.ak) / i4) - (emVar.ao << 4);
                        int i16 = ((i15 - i9) * (i14 - i13)) >> 1;
                        if (i16 != 0) {
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i15 >= (emVar.ac << 4)) {
                                i15 = emVar.ac << 4;
                            }
                            if (i13 < 0) {
                                i13 = 0;
                            }
                            if (i14 >= (emVar.an << 4)) {
                                i14 = emVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i9 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i13 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i9 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i13 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            i17 = 0;
                            i15 = 0;
                            i13 = 0;
                            for (int i26 = i23; i26 <= i24; i26++) {
                                i9 = 16;
                                if (i26 == i23) {
                                    i9 = i20;
                                }
                                if (i26 == i24) {
                                    i9 = i14;
                                }
                                for (int i27 = i21; i27 <= i22; i27++) {
                                    int i28 = emVar.aj[(emVar.ac * i26) + i27];
                                    if (i28 != 0) {
                                        int i29;
                                        if (i27 == i21) {
                                            i29 = i9 * i18;
                                        } else if (i22 == i27) {
                                            i29 = i9 * i19;
                                        } else {
                                            i29 = i9 << 4;
                                        }
                                        i13 += i29;
                                        i25 += ((i28 >> 16) & 255) * i29;
                                        i17 += ((i28 >> 8) & 870815281) * i29;
                                        i15 += i29 * (i28 & 485957809);
                                    }
                                }
                            }
                            if (i13 >= i16) {
                                i9 = (((i25 / i13) << 16) + ((i17 / i13) << 8)) + (i15 / i13);
                                if (i9 == 0) {
                                    i9 = 1;
                                }
                                this.aj[i8] = i9;
                            }
                            i8++;
                        }
                    }
                    i11++;
                    i8 += i10;
                }
            }
        }
    }

    public void er(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > emVar.aa || i4 > emVar.ak) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((emVar.aq * i3) / emVar.aa) + i;
        int i7 = (((emVar.aa + ((emVar.ac + emVar.aq) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < this.aa * 889727047) {
            i6 = this.aa * 147063238;
        }
        if (i7 > this.ak * 1867886973) {
            i7 = 579810681 * this.ak;
        }
        if (i8 < this.aq * -1857728003) {
            i8 = this.aq * -1857728003;
        }
        if (i9 > 1643965704 * this.ao) {
            i5 = -90244733 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((this.ac * 1313981811) * i8) + i6;
            int i11 = (this.ac * 1075116703) - (i7 - i6);
            if (i10 < this.aj.length) {
                for (int i12 = i8; i12 < i5; i12++) {
                    int i13 = i6;
                    while (i13 < i7) {
                        i9 = (i13 - i) << 4;
                        int i14 = (i12 - i2) << 4;
                        i8 = ((emVar.aa * i9) / i3) - (emVar.aq << 4);
                        int i15 = (((i9 + 16) * emVar.aa) / i3) - (emVar.aq << 4);
                        i9 = ((emVar.ak * i14) / i4) - (emVar.ao << 4);
                        i14 = (((i14 + 16) * emVar.ak) / i4) - (emVar.ao << 4);
                        int i16 = ((i15 - i8) * (i14 - i9)) >> 1;
                        if (i16 == 0) {
                            i8 = i10;
                        } else {
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            if (i15 >= (emVar.ac << 4)) {
                                i15 = emVar.ac << 4;
                            }
                            if (i9 < 0) {
                                i9 = 0;
                            }
                            if (i14 >= (emVar.an << 4)) {
                                i14 = emVar.an << 4;
                            }
                            i15--;
                            int i17 = i14 - 1;
                            int i18 = 16 - (i8 & 15);
                            int i19 = (i15 & 15) + 1;
                            int i20 = 16 - (i9 & 15);
                            i14 = (i17 & 15) + 1;
                            int i21 = i8 >> 4;
                            int i22 = i15 >> 4;
                            int i23 = i9 >> 4;
                            int i24 = i17 >> 4;
                            int i25 = 0;
                            int i26 = 0;
                            i17 = 0;
                            i15 = 0;
                            for (int i27 = i23; i27 <= i24; i27++) {
                                i8 = 16;
                                if (i27 == i23) {
                                    i8 = i20;
                                }
                                if (i27 == i24) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                    if (i29 != 0) {
                                        if (i28 == i21) {
                                            i9 = i8 * i18;
                                        } else if (i22 == i28) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & 255) * i9;
                                        i9 = (i9 * (i29 & -1231947185)) + i17;
                                        i17 = i26 + (((i29 >> 8) & -355481068) * i9);
                                        i26 = i25;
                                        int i30 = i15;
                                        i15 = i9;
                                        i9 = i30;
                                    } else {
                                        i9 = i15;
                                        i15 = i17;
                                        i17 = i26;
                                        i26 = i25;
                                    }
                                    i28++;
                                    i25 = i26;
                                    i26 = i17;
                                    i17 = i15;
                                    i15 = i9;
                                }
                            }
                            if (i15 >= i16) {
                                i8 = (((i25 / i15) << 16) + ((i26 / i15) << 8)) + (i17 / i15);
                                if (i8 == 0) {
                                    i8 = 1;
                                }
                                this.aj[i10] = i8;
                            }
                            i8 = i10 + 1;
                        }
                        i13++;
                        i10 = i8;
                    }
                    i10 += i11;
                }
            }
        }
    }
}
