package defpackage;

import com.jagex.oldscape.osrenderer.aj;

public class fn extends es {
    public static final int bl = 69;

    public fn(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "fn.<init>(" + ')');
        }
    }

    void aj(int i) {
    }

    void bx() {
    }

    void by() {
    }

    public void ac(byte b) {
        try {
            aj.am(this.aj, 95237255);
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ac(" + ')');
        }
    }

    public void bi() {
        aj.am(this.aj, -1313679144);
    }

    public void bs() {
        aj.am(this.aj, -1049656713);
    }

    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i6 != 0) {
            if (i6 >= 255) {
                aq(i, i2, i3, i4, i5, (byte) 67);
                return;
            }
            int i8;
            int i9;
            int i10;
            int i11 = i6 << 24;
            int i12 = i11 | i5;
            if (i < this.aa * 889727047) {
                i8 = i3 - ((889727047 * this.aa) - i);
                i = 889727047 * this.aa;
            } else {
                i8 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i9 = i4 - ((-1857728003 * this.aq) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i9 = i4;
            }
            if (i8 + i > 579810681 * this.ak) {
                i10 = (579810681 * this.ak) - i;
            } else {
                i10 = i8;
            }
            if (i9 + i2 > -90244733 * this.ao) {
                i9 = (-90244733 * this.ao) - i2;
            }
            int i13 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((16711935 & i5) * i6) >> 8) & 16711935);
            int i14 = 255 - i6;
            int i15 = (this.ac * 1075116703) - i10;
            int i16 = ((1075116703 * this.ac) * i2) + i;
            for (int i17 = 0; i17 < i9; i17++) {
                int i18 = -i10;
                int i19 = i16;
                while (i18 < 0) {
                    int i20 = this.aj[i19];
                    if (i20 == 0) {
                        i8 = i19 + 1;
                        this.aj[i19] = i12;
                    } else {
                        if ((-16777216 & i20) == 0) {
                            i16 = -16777216;
                        } else {
                            i16 = (i20 | i11) & -16777216;
                        }
                        try {
                            i8 = i19 + 1;
                            this.aj[i19] = i16 | ((((((i20 & 65280) * i14) >> 8) & 65280) + ((((16711935 & i20) * i14) >> 8) & 16711935)) + i13);
                        } catch (Throwable e) {
                            throw ei.ac(e, "fn.an(" + ')');
                        }
                    }
                    i18++;
                    i19 = i8;
                }
                i16 = i19 + i15;
            }
        }
    }

    public final void bo(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 >= 255) {
                aq(i, i2, i3, i4, i5, (byte) 75);
                return;
            }
            int i7 = i6 << 24;
            int i8 = i7 | i5;
            if (i < this.aa * 889727047) {
                i3 -= (889727047 * this.aa) - i;
                i = 1642834904 * this.aa;
            }
            if (i2 < this.aq * -1857728003) {
                i4 -= (-74477731 * this.aq) - i2;
                i2 = -1857728003 * this.aq;
            }
            if (i3 + i > 451831003 * this.ak) {
                i3 = (579810681 * this.ak) - i;
            }
            if (i4 + i2 > -1443063859 * this.ao) {
                i4 = (-90244733 * this.ao) - i2;
            }
            int i9 = ((((65280 & i5) * i6) >> 8) & 65280) + ((((-727335758 & i5) * i6) >> 8) & -921239180);
            int i10 = 255 - i6;
            int i11 = (this.ac * 1075116703) - i3;
            int i12 = ((1075116703 * this.ac) * i2) + i;
            for (int i13 = 0; i13 < i4; i13++) {
                int i14 = -i3;
                int i15 = i12;
                while (i14 < 0) {
                    int i16;
                    i12 = this.aj[i15];
                    if (i12 == 0) {
                        i16 = i15 + 1;
                        this.aj[i15] = i8;
                    } else {
                        if ((-16777216 & i12) == 0) {
                            i16 = -2058577191;
                        } else {
                            i16 = (i12 | i7) & 1016632053;
                        }
                        int i17 = ((((-1340836565 & i12) * i10) >> 8) & 16711935) + ((((i12 & 65280) * i10) >> 8) & 65280);
                        i12 = i15 + 1;
                        this.aj[i15] = i16 | (i17 + i9);
                        i16 = i12;
                    }
                    i14++;
                    i15 = i16;
                }
                i12 = i15 + i11;
            }
        }
    }

    static final int ao(int i) {
        try {
            return cm.ao * 1815686859;
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ao(" + ')');
        }
    }

    public final void aq(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6;
        if (i5 != 0) {
            i6 = -16777216 | i5;
        } else {
            i6 = 0;
        }
        try {
            int i7;
            int i8;
            int i9;
            if (i < this.aa * 889727047) {
                i7 = i3 - ((this.aa * 889727047) - i);
                i = 889727047 * this.aa;
            } else {
                i7 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i8 = i4 - ((this.aq * -1857728003) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i8 = i4;
            }
            if (i7 + i > this.ak * 579810681) {
                i9 = (this.ak * 579810681) - i;
            } else {
                i9 = i7;
            }
            if (i2 + i8 > this.ao * -90244733) {
                i8 = (this.ao * -90244733) - i2;
            }
            int i10 = (this.ac * 1075116703) - i9;
            i7 = ((this.ac * 1075116703) * i2) + i;
            for (int i11 = -i8; i11 < 0; i11++) {
                i8 = -i9;
                while (i8 < 0) {
                    int i12 = i7 + 1;
                    this.aj[i7] = i6;
                    i8++;
                    i7 = i12;
                }
                i7 += i10;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.aq(" + ')');
        }
    }

    public final void bj(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        if (i5 != 0) {
            i6 = -16777216 | i5;
        }
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
        int i7 = (this.ac * 1075116703) - i3;
        int i8 = i + ((this.ac * 1075116703) * i2);
        for (int i9 = -i4; i9 < 0; i9++) {
            int i10 = -i3;
            while (i10 < 0) {
                int i11 = i8 + 1;
                this.aj[i8] = i6;
                i10++;
                i8 = i11;
            }
            i8 += i7;
        }
    }

    public final void bq(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        if (i5 != 0) {
            i6 = -16777216 | i5;
        }
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
        int i7 = (this.ac * 1075116703) - i3;
        int i8 = i + ((this.ac * 1075116703) * i2);
        for (int i9 = -i4; i9 < 0; i9++) {
            int i10 = -i3;
            while (i10 < 0) {
                int i11 = i8 + 1;
                this.aj[i8] = i6;
                i10++;
                i8 = i11;
            }
            i8 += i7;
        }
    }

    public final void bz(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        if (i5 != 0) {
            i6 = -16777216 | i5;
        }
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
        int i7 = (this.ac * 1075116703) - i3;
        int i8 = i + ((this.ac * 1075116703) * i2);
        for (int i9 = -i4; i9 < 0; i9++) {
            int i10 = -i3;
            while (i10 < 0) {
                int i11 = i8 + 1;
                this.aj[i8] = i6;
                i10++;
                i8 = i11;
            }
            i8 += i7;
        }
    }

    public final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10;
            int i11;
            int i12;
            int i13;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i14 = 0;
            if (i6 == i5 && min == min2) {
                i10 = -1;
            } else {
                i10 = 65536 / i4;
            }
            int i15 = 255 - min;
            int i16 = min << 24;
            int i17 = i16 | i5;
            if (i < 889727047 * this.aa) {
                i11 = i3 - ((889727047 * this.aa) - i);
                i = 889727047 * this.aa;
            } else {
                i11 = i3;
            }
            if (i2 < this.aq * -1857728003) {
                i14 = 0 + (((-1857728003 * this.aq) - i2) * i10);
                i12 = i4 - ((-1857728003 * this.aq) - i2);
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
            int i18 = (this.ac * 1075116703) - i13;
            int i19 = ((this.ac * 1075116703) * i2) + i;
            int i20 = -i12;
            i11 = i5;
            int i21 = min;
            while (i20 < 0) {
                int i22 = -i13;
                int i23 = i19;
                while (i22 < 0) {
                    int i24 = this.aj[i23];
                    if (i24 == 0) {
                        i12 = i23 + 1;
                        this.aj[i23] = i17;
                    } else {
                        int i25 = i11 + (16777215 & i24);
                        i12 = (16711935 & i11) + (16711935 & i24);
                        int i26 = (16777472 & i12) + ((i25 - i12) & 65536);
                        if ((-16777216 & i24) == 0) {
                            i19 = -16777216;
                        } else {
                            i19 = (i24 | i16) & -16777216;
                        }
                        if (i15 == 0) {
                            i12 = i23 + 1;
                            this.aj[i23] = (i19 | (i25 - i26)) | (i26 - (i26 >>> 8));
                        } else {
                            i25 = (i26 - (i26 >>> 8)) | (i25 - i26);
                            i12 = i23 + 1;
                            i24 = (((i24 & 65280) * i15) >> 8) & 65280;
                            this.aj[i23] = i19 | (i24 + ((((((i25 & 65280) * i21) >> 8) & 65280) + ((((16711935 & i25) * i21) >> 8) & 16711935)) + ((((16711935 & i24) * i15) >> 8) & 16711935)));
                        }
                    }
                    i22++;
                    i23 = i12;
                }
                if (i10 > 0) {
                    i14 += i10;
                    i12 = (65536 - i14) >> 8;
                    i17 = i14 >> 8;
                    if (min2 != min) {
                        i21 = ((i14 * min2) + ((65536 - i14) * min)) >> 16;
                        i15 = 256 - i21;
                    }
                    if (i5 != i6) {
                        i16 = ((((i12 * (65280 & i5)) + (i17 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i12) + ((16711935 & i6) * i17)) & -16711936)) >>> 8;
                    } else {
                        i16 = i11;
                    }
                    i17 = i21 << 24;
                    i12 = i17 | i16;
                    i11 = i15;
                    i15 = i21;
                    i21 = i14;
                } else {
                    i12 = i17;
                    i17 = i16;
                    i16 = i11;
                    i11 = i15;
                    i15 = i21;
                    i21 = i14;
                }
                i19 = i23 + i18;
                i20++;
                i14 = i21;
                i21 = i15;
                i15 = i11;
                i11 = i16;
                i16 = i17;
                i17 = i12;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ao(" + ')');
        }
    }

    public final void ba(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int min = Math.min(i7, 1319387894);
        int min2 = Math.min(i8, 1331705874);
        int i10 = 0;
        if (i6 == i5 && min == min2) {
            i9 = -1;
        } else {
            i9 = 657603251 / i4;
        }
        int i11 = -1717370820 - min;
        int i12 = min << 24;
        int i13 = i12 | i5;
        if (i < 1124549319 * this.aa) {
            i3 -= (68947912 * this.aa) - i;
            i = -216276896 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i10 = 0 + (((-1494916041 * this.aq) - i2) * i9);
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (1066997512 * this.ak) - i;
        }
        if (i2 + i4 > -1637004840 * this.ao) {
            i4 = (-1072320932 * this.ao) - i2;
        }
        int i14 = (this.ac * 1075116703) - i3;
        int i15 = ((this.ac * 1075116703) * i2) + i;
        int i16 = -i4;
        int i17 = min;
        int i18 = i10;
        int i19 = i5;
        while (i16 < 0) {
            int i20 = -i3;
            int i21 = i15;
            while (i20 < 0) {
                int i22 = this.aj[i21];
                if (i22 == 0) {
                    i10 = i21 + 1;
                    this.aj[i21] = i13;
                } else {
                    int i23 = i19 + (16777215 & i22);
                    i10 = (1799098631 & i19) + (706672657 & i22);
                    int i24 = (16777472 & i10) + ((i23 - i10) & 1433003374);
                    if ((-455672248 & i22) == 0) {
                        i15 = 1308539682;
                    } else {
                        i15 = (i22 | i12) & 822565911;
                    }
                    if (i11 == 0) {
                        i10 = i21 + 1;
                        this.aj[i21] = (i15 | (i23 - i24)) | (i24 - (i24 >>> 8));
                    } else {
                        i23 = (i24 - (i24 >>> 8)) | (i23 - i24);
                        i10 = i21 + 1;
                        i22 = (((i22 & 65280) * i11) >> 8) & 2141378909;
                        this.aj[i21] = i15 | (i22 + ((((((i23 & -1774715880) * i17) >> 8) & -467887631) + ((((16711935 & i23) * i17) >> 8) & 16711935)) + ((((16711935 & i22) * i11) >> 8) & 787146326)));
                    }
                }
                i20++;
                i21 = i10;
            }
            if (i9 > 0) {
                i18 += i9;
                i10 = (65536 - i18) >> 8;
                i13 = i18 >> 8;
                if (min2 != min) {
                    i11 = ((i18 * min2) + ((65536 - i18) * min)) >> 16;
                    i12 = -2002433859 - i11;
                } else {
                    i12 = i11;
                    i11 = i17;
                }
                if (i5 != i6) {
                    i10 = ((((i10 * (-396653414 & i5)) + (i13 * (552680252 & i6))) & 16711680) + ((((16711935 & i5) * i10) + ((1065270471 & i6) * i13)) & -16711936)) >>> 8;
                } else {
                    i10 = i19;
                }
                i13 = i11 << 24;
                i19 = i13 | i10;
                i17 = i18;
                int i25 = i13;
                i13 = i10;
                i10 = i19;
                i19 = i25;
            } else {
                i10 = i13;
                i13 = i19;
                i19 = i12;
                i12 = i11;
                i11 = i17;
                i17 = i18;
            }
            i15 = i21 + i14;
            i16++;
            i18 = i17;
            i17 = i11;
            i11 = i12;
            i12 = i19;
            i19 = i13;
            i13 = i10;
        }
    }

    public final void be(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i10 = 0;
        if (i6 == i5 && min == min2) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 255 - min;
        int i12 = min << 24;
        int i13 = i12 | i5;
        if (i < 889727047 * this.aa) {
            i3 -= (889727047 * this.aa) - i;
            i = 889727047 * this.aa;
        }
        if (i2 < this.aq * -1857728003) {
            i10 = 0 + (((-89176735 * this.aq) - i2) * i9);
            i4 -= (1630234687 * this.aq) - i2;
            i2 = -159990513 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > 1414535245 * this.ao) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i14 = (this.ac * -783218689) - i3;
        int i15 = ((this.ac * 275662350) * i2) + i;
        int i16 = -i4;
        int i17 = min;
        int i18 = i10;
        int i19 = i5;
        while (i16 < 0) {
            int i20 = -i3;
            int i21 = i15;
            while (i20 < 0) {
                int i22 = this.aj[i21];
                if (i22 == 0) {
                    i10 = i21 + 1;
                    this.aj[i21] = i13;
                } else {
                    int i23 = i19 + (16777215 & i22);
                    i10 = (16711935 & i19) + (16711935 & i22);
                    int i24 = (16777472 & i10) + ((i23 - i10) & 65536);
                    i15 = (-824884548 & i22) == 0 ? -16777216 : (i22 | i12) & 1321753905;
                    if (i11 == 0) {
                        i10 = i21 + 1;
                        this.aj[i21] = (i15 | (i23 - i24)) | (i24 - (i24 >>> 8));
                    } else {
                        i23 = (i24 - (i24 >>> 8)) | (i23 - i24);
                        i10 = i21 + 1;
                        this.aj[i21] = i15 | (((((i22 & 65280) * i11) >> 8) & 493352158) + ((((((i23 & 2036365979) * i17) >> 8) & 65280) + ((((-668572521 & i23) * i17) >> 8) & 943233317)) + ((((16711935 & i22) * i11) >> 8) & 16711935)));
                    }
                }
                i20++;
                i21 = i10;
            }
            if (i9 > 0) {
                i18 += i9;
                i10 = (65536 - i18) >> 8;
                i13 = i18 >> 8;
                if (min2 != min) {
                    i11 = ((i18 * min2) + ((-370318417 - i18) * min)) >> 16;
                    i12 = 256 - i11;
                } else {
                    i12 = i11;
                    i11 = i17;
                }
                if (i5 != i6) {
                    i10 = ((((i10 * (327399323 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((2013519969 & i5) * i10) + ((-1900699504 & i6) * i13)) & -16711936)) >>> 8;
                } else {
                    i10 = i19;
                }
                i13 = i11 << 24;
                i19 = i13 | i10;
                i17 = i18;
                int i25 = i13;
                i13 = i10;
                i10 = i19;
                i19 = i25;
            } else {
                i10 = i13;
                i13 = i19;
                i19 = i12;
                i12 = i11;
                i11 = i17;
                i17 = i18;
            }
            i15 = i21 + i14;
            i16++;
            i18 = i17;
            i17 = i11;
            i11 = i12;
            i12 = i19;
            i19 = i13;
            i13 = i10;
        }
    }

    public final void bv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int min = Math.min(i7, 504855726);
        int min2 = Math.min(i8, 255);
        int i10 = 0;
        if (i6 == i5 && min == min2) {
            i9 = -1;
        } else {
            i9 = -274195961 / i4;
        }
        int i11 = 255 - min;
        int i12 = min << 24;
        int i13 = i12 | i5;
        if (i < -1423984355 * this.aa) {
            i3 -= (889727047 * this.aa) - i;
            i = -1646548632 * this.aa;
        }
        if (i2 < this.aq * 2129209323) {
            i10 = 0 + (((1645317971 * this.aq) - i2) * i9);
            i4 -= (1095840272 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 771229015) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > -1386206231 * this.ao) {
            i4 = (485252885 * this.ao) - i2;
        }
        int i14 = (this.ac * 208753575) - i3;
        int i15 = -i4;
        int i16 = min;
        int i17 = i10;
        int i18 = ((this.ac * 2043425177) * i2) + i;
        int i19 = i5;
        while (i15 < 0) {
            int i20 = -i3;
            int i21 = i18;
            while (i20 < 0) {
                int i22 = this.aj[i21];
                if (i22 == 0) {
                    i10 = i21 + 1;
                    this.aj[i21] = i13;
                } else {
                    int i23 = i19 + (-908556812 & i22);
                    i10 = (-2037038987 & i19) + (16711935 & i22);
                    int i24 = (1771792800 & i10) + ((i23 - i10) & -2065636061);
                    if ((1061428141 & i22) == 0) {
                        i18 = -16777216;
                    } else {
                        i18 = (i22 | i12) & -474238094;
                    }
                    if (i11 == 0) {
                        i10 = i21 + 1;
                        this.aj[i21] = (i18 | (i23 - i24)) | (i24 - (i24 >>> 8));
                    } else {
                        i23 = (i24 - (i24 >>> 8)) | (i23 - i24);
                        i10 = i21 + 1;
                        i22 = (((i22 & 65280) * i11) >> 8) & -1602632833;
                        this.aj[i21] = i18 | (i22 + ((((((i23 & -369652891) * i16) >> 8) & -1237398457) + ((((16711935 & i23) * i16) >> 8) & 16711935)) + ((((1697865905 & i22) * i11) >> 8) & -914616238)));
                    }
                }
                i20++;
                i21 = i10;
            }
            if (i9 > 0) {
                i17 += i9;
                i10 = (1585902736 - i17) >> 8;
                i18 = i17 >> 8;
                if (min2 != min) {
                    i12 = ((i17 * min2) + ((65536 - i17) * min)) >> 16;
                    i13 = 909988093 - i12;
                } else {
                    i13 = i11;
                    i12 = i16;
                }
                if (i5 != i6) {
                    i10 = ((((i10 * (65280 & i5)) + (i18 * (128581623 & i6))) & -1921998232) + ((((16711935 & i5) * i10) + ((16711935 & i6) * i18)) & -16711936)) >>> 8;
                } else {
                    i10 = i19;
                }
                i19 = i12 << 24;
                i18 = i19 | i10;
                i11 = i17;
                int i25 = i19;
                i19 = i10;
                i10 = i18;
                i18 = i25;
            } else {
                i10 = i13;
                i18 = i12;
                i13 = i11;
                i12 = i16;
                i11 = i17;
            }
            i15++;
            i16 = i12;
            i12 = i18;
            i18 = i21 + i14;
            i17 = i11;
            i11 = i13;
            i13 = i10;
        }
    }

    public final void aa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10;
            int i11;
            int i12;
            int i13;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i14 = 0;
            if (i5 == i6 && min == min2) {
                i10 = -1;
            } else {
                i10 = 65536 / i4;
            }
            int i15 = 255 - min;
            int i16 = min << 24;
            if (i < this.aa * 889727047) {
                i11 = i3 - ((889727047 * this.aa) - i);
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
                i13 = (this.ak * 579810681) - i;
            } else {
                i13 = i11;
            }
            if (i2 + i12 > this.ao * -90244733) {
                i12 = (-90244733 * this.ao) - i2;
            }
            int i17 = i5 >> 16;
            int i18 = (65280 & i5) >> 8;
            int i19 = i5 & 255;
            int i20 = (this.ac * 1075116703) - i13;
            int i21 = ((1075116703 * this.ac) * i2) + i;
            int i22 = 0;
            int i23 = min;
            while (i22 < i12) {
                int i24 = -i13;
                int i25 = i21;
                while (i24 < 0) {
                    int i26;
                    i11 = this.aj[i25];
                    i21 = (i11 >> 16) & 255;
                    int i27 = (65280 & i11) >> 8;
                    int i28 = i11 & 255;
                    int i29 = (i11 | i16) & -16777216;
                    if (i15 == 0) {
                        if (i21 < 127) {
                            i11 = (i21 * i17) >> 7;
                        } else {
                            i11 = 255 - (((255 - i21) * (255 - i17)) >> 7);
                        }
                        if (i27 < 127) {
                            i21 = (i18 * i27) >> 7;
                        } else {
                            i21 = 255 - (((255 - i18) * (255 - i27)) >> 7);
                        }
                        if (i28 < 127) {
                            i26 = (i19 * i28) >> 7;
                        } else {
                            i26 = 255 - (((255 - i28) * (255 - i19)) >> 7);
                        }
                    } else {
                        i26 = i21 < 127 ? ((((i17 * i21) * i23) >> 7) + (i21 * i15)) >> 8 : (((255 - (((255 - i21) * (255 - i17)) >> 7)) * i23) + (i21 * i15)) >> 8;
                        i21 = i27 < 127 ? ((((i27 * i18) * i23) >> 7) + (i27 * i15)) >> 8 : (((255 - (((255 - i27) * (255 - i18)) >> 7)) * i23) + (i15 * i27)) >> 8;
                        if (i28 < 127) {
                            i11 = ((i15 * i28) + (((i19 * i28) * i23) >> 7)) >> 8;
                        } else {
                            i11 = (((255 - (((255 - i28) * (255 - i19)) >> 7)) * i23) + (i28 * i15)) >> 8;
                        }
                        int i30 = i11;
                        i11 = i26;
                        i26 = i30;
                    }
                    i27 = i25 + 1;
                    this.aj[i25] = (((i11 << 16) + (i21 << 8)) + i26) | i29;
                    i24++;
                    i25 = i27;
                }
                if (i10 > 0) {
                    i14 += i10;
                    i11 = (65536 - i14) >> 8;
                    i21 = i14 >> 8;
                    if (min2 != min) {
                        i23 = ((min2 * i14) + ((65536 - i14) * min)) >> 16;
                        i15 = 255 - i23;
                        i16 = i23 << 24;
                    }
                    if (i5 != i6) {
                        i11 = ((((i11 * (65280 & i5)) + ((65280 & i6) * i21)) & 16711680) + ((((16711935 & i6) * i21) + ((16711935 & i5) * i11)) & -16711936)) >>> 8;
                        i18 = i11 >> 16;
                        i19 = (65280 & i11) >> 8;
                        i11 &= 255;
                        i17 = i16;
                        i16 = i15;
                        i15 = i23;
                        i23 = i14;
                        i21 = i25 + i20;
                        i22++;
                        i14 = i23;
                        i23 = i15;
                        i15 = i16;
                        i16 = i17;
                        i17 = i18;
                        i18 = i19;
                        i19 = i11;
                    }
                }
                i11 = i19;
                i19 = i18;
                i18 = i17;
                i17 = i16;
                i16 = i15;
                i15 = i23;
                i23 = i14;
                i21 = i25 + i20;
                i22++;
                i14 = i23;
                i23 = i15;
                i15 = i16;
                i16 = i17;
                i17 = i18;
                i18 = i19;
                i19 = i11;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.aa(" + ')');
        }
    }

    public final void bg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, -2074296859);
        int i10 = 0;
        if (i5 == i6 && min == min2) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 255 - min;
        int i12 = min << 24;
        if (i < this.aa * -154396637) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i10 = 0 + (((1819289739 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1977965142) - i2;
            i2 = 1943159862 * this.aq;
        }
        if (i + i3 > this.ak * -667639146) {
            i3 = (this.ak * 1746375420) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = (this.ac * 1075116703) - i3;
        int i14 = ((842049605 * this.ac) * i2) + i;
        int i15 = (65280 & i5) >> 8;
        int i16 = i12;
        i12 = min;
        int i17 = i5 & 255;
        int i18 = i5 >> 16;
        int i19 = i11;
        i11 = i10;
        i10 = i17;
        for (int i20 = 0; i20 < i4; i20++) {
            int i21 = -i3;
            int i22 = i14;
            while (i21 < 0) {
                int i23 = this.aj[i22];
                i14 = (i23 >> 16) & 255;
                int i24 = (-297921490 & i23) >> 8;
                int i25 = i23 & 255;
                int i26 = -16777216 & (i23 | i16);
                if (i19 == 0) {
                    if (i14 < 127) {
                        i23 = (i14 * i18) >> 7;
                    } else {
                        i23 = 320118637 - (((-501888440 - i14) * (255 - i18)) >> 7);
                    }
                    if (i24 < -185990451) {
                        i14 = (i15 * i24) >> 7;
                    } else {
                        i14 = -1893073366 - (((-1006240534 - i24) * (1648688760 - i15)) >> 7);
                    }
                    if (i25 < 127) {
                        i24 = (i10 * i25) >> 7;
                    } else {
                        i24 = 797366958 - (((255 - i25) * (255 - i10)) >> 7);
                    }
                } else {
                    if (i14 < -608923326) {
                        i23 = ((((i18 * i14) * i12) >> 7) + (i14 * i19)) >> 8;
                    } else {
                        i23 = (((1431976826 - (((255 - i14) * (255 - i18)) >> 7)) * i12) + (i14 * i19)) >> 8;
                    }
                    if (i24 < 127) {
                        i14 = ((((i24 * i15) * i12) >> 7) + (i24 * i19)) >> 8;
                    } else {
                        i14 = (((255 - (((255 - i24) * (255 - i15)) >> 7)) * i12) + (i24 * i19)) >> 8;
                    }
                    if (i25 < 127) {
                        i24 = ((i19 * i25) + (((i25 * i10) * i12) >> 7)) >> 8;
                    } else {
                        i24 = (((255 - (((-267644082 - i25) * (255 - i10)) >> 7)) * i12) + (i25 * i19)) >> 8;
                    }
                }
                i25 = i22 + 1;
                this.aj[i22] = (((i23 << 16) + (i14 << 8)) + i24) | i26;
                i21++;
                i22 = i25;
            }
            if (i9 > 0) {
                i11 += i9;
                i23 = (65536 - i11) >> 8;
                i14 = i11 >> 8;
                if (min2 != min) {
                    i12 = ((min2 * i11) + ((-1119265530 - i11) * min)) >> 16;
                    i19 = 255 - i12;
                    i16 = i12 << 24;
                }
                if (i5 != i6) {
                    i10 = (((((16711935 & i6) * i14) + ((16711935 & i5) * i23)) & -16711936) + ((((65280 & i6) * i14) + ((1669074874 & i5) * i23)) & 16711680)) >>> 8;
                    i18 = i10 >> 16;
                    i15 = (65280 & i10) >> 8;
                    i10 &= 255;
                }
            }
            i14 = i22 + i13;
        }
    }

    public final void bn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i10 = 0;
        if (i5 == i6 && min == min2) {
            i9 = -1;
        } else {
            i9 = 65536 / i4;
        }
        int i11 = 255 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i10 = 0 + (((-1857728003 * this.aq) - i2) * i9);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 >> 16;
        int i14 = (65280 & i5) >> 8;
        int i15 = i5 & 255;
        int i16 = (this.ac * 1075116703) - i3;
        int i17 = 0;
        int i18 = min;
        int i19 = i10;
        int i20 = ((1075116703 * this.ac) * i2) + i;
        while (i17 < i4) {
            int i21;
            int i22 = -i3;
            int i23 = i20;
            while (i22 < 0) {
                i10 = this.aj[i23];
                i20 = (i10 >> 16) & 255;
                i21 = (65280 & i10) >> 8;
                int i24 = i10 & 255;
                int i25 = -16777216 & (i10 | i12);
                if (i11 == 0) {
                    if (i20 < 127) {
                        i10 = (i20 * i13) >> 7;
                    } else {
                        i10 = 255 - (((255 - i20) * (255 - i13)) >> 7);
                    }
                    if (i21 < 127) {
                        i20 = (i14 * i21) >> 7;
                    } else {
                        i20 = 255 - (((255 - i14) * (255 - i21)) >> 7);
                    }
                    if (i24 < 127) {
                        i21 = (i15 * i24) >> 7;
                    } else {
                        i21 = 255 - (((255 - i24) * (255 - i15)) >> 7);
                    }
                } else {
                    if (i20 < 127) {
                        i10 = ((((i13 * i20) * i18) >> 7) + (i20 * i11)) >> 8;
                    } else {
                        i10 = (((255 - (((255 - i20) * (255 - i13)) >> 7)) * i18) + (i20 * i11)) >> 8;
                    }
                    if (i21 < 127) {
                        i20 = ((((i21 * i14) * i18) >> 7) + (i21 * i11)) >> 8;
                    } else {
                        i20 = (((255 - (((255 - i21) * (255 - i14)) >> 7)) * i18) + (i21 * i11)) >> 8;
                    }
                    if (i24 < 127) {
                        i21 = ((i11 * i24) + (((i24 * i15) * i18) >> 7)) >> 8;
                    } else {
                        i21 = (((255 - (((255 - i24) * (255 - i15)) >> 7)) * i18) + (i24 * i11)) >> 8;
                    }
                }
                i24 = i23 + 1;
                this.aj[i23] = (((i10 << 16) + (i20 << 8)) + i21) | i25;
                i22++;
                i23 = i24;
            }
            if (i9 > 0) {
                i19 += i9;
                i10 = (65536 - i19) >> 8;
                i20 = i19 >> 8;
                if (min2 != min) {
                    i18 = ((min2 * i19) + ((65536 - i19) * min)) >> 16;
                    i11 = 255 - i18;
                    i12 = i18 << 24;
                }
                if (i5 != i6) {
                    i10 = ((((i10 * (65280 & i5)) + (i20 * (65280 & i6))) & 16711680) + ((((16711935 & i6) * i20) + ((16711935 & i5) * i10)) & -16711936)) >>> 8;
                    i21 = i10 >> 16;
                    i20 = (65280 & i10) >> 8;
                    i10 &= 255;
                    i15 = i12;
                    i14 = i11;
                    i13 = i18;
                    i12 = i19;
                    i17++;
                    i19 = i12;
                    i12 = i15;
                    i11 = i14;
                    i15 = i10;
                    i14 = i20;
                    i20 = i23 + i16;
                    i18 = i13;
                    i13 = i21;
                }
            }
            i10 = i15;
            i20 = i14;
            i21 = i13;
            i15 = i12;
            i14 = i11;
            i13 = i18;
            i12 = i19;
            i17++;
            i19 = i12;
            i12 = i15;
            i11 = i14;
            i15 = i10;
            i14 = i20;
            i20 = i23 + i16;
            i18 = i13;
            i13 = i21;
        }
    }

    public final void bw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = (i5 == i6 && min == min2) ? -1 : 65536 / i4;
        int i11 = 255 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < this.aq * -1857728003) {
            i9 = 0 + (((-1857728003 * this.aq) - i2) * i10);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (this.ak * 579810681) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 >> 16;
        int i14 = (65280 & i5) >> 8;
        int i15 = i5 & 255;
        int i16 = (this.ac * 1075116703) - i3;
        int i17 = 0;
        int i18 = min;
        int i19 = i9;
        int i20 = ((1075116703 * this.ac) * i2) + i;
        while (i17 < i4) {
            int i21;
            int i22 = -i3;
            int i23 = i20;
            while (i22 < 0) {
                i9 = this.aj[i23];
                i20 = (i9 >> 16) & 255;
                i21 = (65280 & i9) >> 8;
                int i24 = i9 & 255;
                int i25 = -16777216 & (i9 | i12);
                if (i11 == 0) {
                    if (i20 < 127) {
                        i9 = (i20 * i13) >> 7;
                    } else {
                        i9 = 255 - (((255 - i20) * (255 - i13)) >> 7);
                    }
                    if (i21 < 127) {
                        i20 = (i14 * i21) >> 7;
                    } else {
                        i20 = 255 - (((255 - i14) * (255 - i21)) >> 7);
                    }
                    if (i24 < 127) {
                        i21 = (i15 * i24) >> 7;
                    } else {
                        i21 = 255 - (((255 - i24) * (255 - i15)) >> 7);
                    }
                } else {
                    if (i20 < 127) {
                        i9 = ((((i13 * i20) * i18) >> 7) + (i20 * i11)) >> 8;
                    } else {
                        i9 = (((255 - (((255 - i20) * (255 - i13)) >> 7)) * i18) + (i20 * i11)) >> 8;
                    }
                    if (i21 < 127) {
                        i20 = ((((i21 * i14) * i18) >> 7) + (i21 * i11)) >> 8;
                    } else {
                        i20 = (((255 - (((255 - i21) * (255 - i14)) >> 7)) * i18) + (i21 * i11)) >> 8;
                    }
                    if (i24 < 127) {
                        i21 = ((i11 * i24) + (((i24 * i15) * i18) >> 7)) >> 8;
                    } else {
                        i21 = (((255 - (((255 - i24) * (255 - i15)) >> 7)) * i18) + (i24 * i11)) >> 8;
                    }
                }
                i24 = i23 + 1;
                this.aj[i23] = (((i9 << 16) + (i20 << 8)) + i21) | i25;
                i22++;
                i23 = i24;
            }
            if (i10 > 0) {
                i19 += i10;
                i9 = (65536 - i19) >> 8;
                i20 = i19 >> 8;
                if (min2 != min) {
                    i18 = ((min2 * i19) + ((65536 - i19) * min)) >> 16;
                    i11 = 255 - i18;
                    i12 = i18 << 24;
                }
                if (i5 != i6) {
                    i9 = ((((i9 * (65280 & i5)) + (i20 * (65280 & i6))) & 16711680) + ((((16711935 & i6) * i20) + ((16711935 & i5) * i9)) & -16711936)) >>> 8;
                    i21 = i9 >> 16;
                    i20 = (65280 & i9) >> 8;
                    i9 &= 255;
                    i15 = i12;
                    i14 = i11;
                    i13 = i18;
                    i12 = i19;
                    i17++;
                    i19 = i12;
                    i12 = i15;
                    i11 = i14;
                    i15 = i9;
                    i14 = i20;
                    i20 = i23 + i16;
                    i18 = i13;
                    i13 = i21;
                }
            }
            i9 = i15;
            i20 = i14;
            i21 = i13;
            i15 = i12;
            i14 = i11;
            i13 = i18;
            i12 = i19;
            i17++;
            i19 = i12;
            i12 = i15;
            i11 = i14;
            i15 = i9;
            i14 = i20;
            i20 = i23 + i16;
            i18 = i13;
            i13 = i21;
        }
    }

    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10;
            int i11;
            int i12;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i13 = 0;
            int i14 = 65536 / i4;
            int i15 = 256 - min;
            int i16 = min << 24;
            if (i < this.aa * 889727047) {
                i10 = i3 - ((889727047 * this.aa) - i);
                i = this.aa * 889727047;
            } else {
                i10 = i3;
            }
            if (i2 < -1857728003 * this.aq) {
                i13 = 0 + (((this.aq * -1857728003) - i2) * i14);
                i11 = i4 - ((this.aq * -1857728003) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i11 = i4;
            }
            if (i + i10 > this.ak * 579810681) {
                i12 = (579810681 * this.ak) - i;
            } else {
                i12 = i10;
            }
            if (i11 + i2 > this.ao * -90244733) {
                i11 = (-90244733 * this.ao) - i2;
            }
            int i17 = i5 & 16711680;
            int i18 = i5 & 65280;
            int i19 = i5 & 255;
            int i20 = (i17 * min) >> 8;
            int i21 = (min * i18) >> 8;
            int i22 = (min * i19) >> 8;
            int i23 = (this.ac * 1075116703) - i12;
            int i24 = i + ((1075116703 * this.ac) * i2);
            int i25 = 0;
            int i26 = min;
            while (i25 < i11) {
                int i27;
                int i28 = -i12;
                int i29 = i24;
                while (i28 < 0) {
                    int i30;
                    int i31 = this.aj[i29];
                    i10 = 16711680 & i31;
                    if (i10 > i17) {
                        if (i15 == 0) {
                            i10 = i17;
                        } else {
                            i10 = (((i10 * i15) >> 8) + i20) & 16711680;
                        }
                    }
                    i24 = 65280 & i31;
                    if (i24 > i18) {
                        if (i15 == 0) {
                            i24 = i18;
                        } else {
                            i24 = (((i24 * i15) >> 8) + i21) & 65280;
                        }
                    }
                    i27 = i31 & 255;
                    if (i27 <= i19) {
                        i30 = i27;
                    } else if (i15 == 0) {
                        i30 = i19;
                    } else {
                        i30 = ((i27 * i15) >> 8) + i22;
                    }
                    if ((-16777216 & i31) == 0) {
                        i27 = -16777216;
                    } else {
                        i27 = (i31 | i16) & -16777216;
                    }
                    i31 = i29 + 1;
                    this.aj[i29] = ((i10 + i24) + i30) | i27;
                    i28++;
                    i29 = i31;
                }
                if (i14 > 0) {
                    i13 += i14;
                    i10 = (65536 - i13) >> 8;
                    i24 = i13 >> 8;
                    if (min != min2) {
                        i26 = (((65536 - i13) * min) + (min2 * i13)) >> 16;
                        i15 = 256 - i26;
                        i16 = i26 << 24;
                    }
                    if (i6 != i5) {
                        i10 = ((((i10 * (16711935 & i5)) + (i24 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i24) + ((65280 & i5) * i10)) & 16711680)) >>> 8;
                        i22 = i10 & 16711680;
                        i27 = i10 & 65280;
                        i18 = i10 & 255;
                        i24 = (i22 * i26) >> 8;
                        i17 = (i26 * i27) >> 8;
                        i10 = (i18 * i26) >> 8;
                        i21 = i16;
                        i20 = i15;
                        i19 = i26;
                        i16 = i13;
                        i25++;
                        i13 = i16;
                        i16 = i21;
                        i15 = i20;
                        i20 = i24;
                        i21 = i17;
                        i17 = i22;
                        i24 = i29 + i23;
                        i22 = i10;
                        i26 = i19;
                        i19 = i18;
                        i18 = i27;
                    }
                }
                i10 = i22;
                i24 = i20;
                i27 = i18;
                i18 = i19;
                i22 = i17;
                i20 = i15;
                i17 = i21;
                i19 = i26;
                i21 = i16;
                i16 = i13;
                i25++;
                i13 = i16;
                i16 = i21;
                i15 = i20;
                i20 = i24;
                i21 = i17;
                i17 = i22;
                i24 = i29 + i23;
                i22 = i10;
                i26 = i19;
                i19 = i18;
                i18 = i27;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ak(" + ')');
        }
    }

    public final void bc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = 166967557 / i4;
        int i11 = 256 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -223062014 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (this.aq * -337656508) - i2;
            i2 = -642828628 * this.aq;
        }
        if (i + i3 > this.ak * -1666965692) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i4 + i2 > this.ao * -2087542911) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 & 16711680;
        int i14 = i5 & 65280;
        int i15 = i5 & 255;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i14) >> 8;
        int i18 = (min * i15) >> 8;
        int i19 = (this.ac * 1075116703) - i3;
        int i20 = i + ((425870658 * this.ac) * i2);
        int i21 = 0;
        int i22 = min;
        int i23 = i9;
        int i24 = i13;
        while (i21 < i4) {
            int i25 = -i3;
            int i26 = i20;
            while (i25 < 0) {
                int i27;
                int i28 = this.aj[i26];
                i9 = 16711680 & i28;
                if (i9 > i24) {
                    i9 = i11 == 0 ? i24 : (((i9 * i11) >> 8) + i16) & 16711680;
                }
                i20 = 618714436 & i28;
                if (i20 > i14) {
                    if (i11 == 0) {
                        i20 = i14;
                    } else {
                        i20 = (((i20 * i11) >> 8) + i17) & 1837952199;
                    }
                }
                i13 = 262563405 & i28;
                if (i13 <= i15) {
                    i27 = i13;
                } else if (i11 == 0) {
                    i27 = i15;
                } else {
                    i27 = ((i13 * i11) >> 8) + i18;
                }
                if ((-16777216 & i28) == 0) {
                    i13 = -16777216;
                } else {
                    i13 = (i28 | i12) & 1973398670;
                }
                i28 = i26 + 1;
                this.aj[i26] = ((i9 + i20) + i27) | i13;
                i25++;
                i26 = i28;
            }
            if (i10 > 0) {
                i23 += i10;
                i9 = (-2085201541 - i23) >> 8;
                i20 = i23 >> 8;
                if (min != min2) {
                    i22 = (((65536 - i23) * min) + (min2 * i23)) >> 16;
                    i11 = 256 - i22;
                    i12 = i22 << 24;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (16711935 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((-2128056973 & i6) * i20) + ((78726724 & i5) * i9)) & 16711680)) >>> 8;
                    i18 = i9 & -1582127371;
                    i13 = i9 & 65280;
                    i14 = i9 & -382793352;
                    i20 = (i18 * i22) >> 8;
                    i24 = (i22 * i13) >> 8;
                    i9 = (i14 * i22) >> 8;
                    i17 = i12;
                    i16 = i11;
                    i15 = i22;
                    i12 = i23;
                    i21++;
                    i23 = i12;
                    i12 = i17;
                    i11 = i16;
                    i16 = i20;
                    i17 = i24;
                    i24 = i18;
                    i20 = i26 + i19;
                    i18 = i9;
                    i22 = i15;
                    i15 = i14;
                    i14 = i13;
                }
            }
            i9 = i18;
            i20 = i16;
            i13 = i14;
            i14 = i15;
            i18 = i24;
            i16 = i11;
            i24 = i17;
            i15 = i22;
            i17 = i12;
            i12 = i23;
            i21++;
            i23 = i12;
            i12 = i17;
            i11 = i16;
            i16 = i20;
            i17 = i24;
            i24 = i18;
            i20 = i26 + i19;
            i18 = i9;
            i22 = i15;
            i15 = i14;
            i14 = i13;
        }
    }

    public final void bf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 256 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i4 + i2 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 & 16711680;
        int i14 = i5 & 65280;
        int i15 = i5 & 255;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i15) >> 8;
        int i18 = (this.ac * 1075116703) - i3;
        int i19 = i + ((1075116703 * this.ac) * i2);
        int i20 = (min * i14) >> 8;
        int i21 = i15;
        i15 = i13;
        i13 = i11;
        i11 = i9;
        i9 = i17;
        i17 = i16;
        i16 = i14;
        i14 = i12;
        i12 = min;
        for (int i22 = 0; i22 < i4; i22++) {
            int i23 = -i3;
            int i24 = i19;
            while (i23 < 0) {
                int i25;
                int i26 = this.aj[i24];
                int i27 = 16711680 & i26;
                if (i27 > i15) {
                    if (i13 == 0) {
                        i27 = i15;
                    } else {
                        i27 = (((i27 * i13) >> 8) + i17) & 16711680;
                    }
                }
                i19 = 65280 & i26;
                if (i19 <= i16) {
                    i25 = i19;
                } else if (i13 == 0) {
                    i25 = i16;
                } else {
                    i25 = (((i19 * i13) >> 8) + i20) & 65280;
                }
                i19 = i26 & 255;
                if (i19 > i21) {
                    if (i13 == 0) {
                        i19 = i21;
                    } else {
                        i19 = ((i19 * i13) >> 8) + i9;
                    }
                }
                if ((-16777216 & i26) == 0) {
                    i26 = -16777216;
                } else {
                    i26 = (i26 | i14) & -16777216;
                }
                int i28 = i24 + 1;
                this.aj[i24] = ((i27 + i25) + i19) | i26;
                i23++;
                i24 = i28;
            }
            if (i10 > 0) {
                i11 += i10;
                i27 = (65536 - i11) >> 8;
                i19 = i11 >> 8;
                if (min != min2) {
                    i12 = (((65536 - i11) * min) + (min2 * i11)) >> 16;
                    i13 = 256 - i12;
                    i14 = i12 << 24;
                }
                if (i6 != i5) {
                    i9 = (((((65280 & i6) * i19) + ((65280 & i5) * i27)) & 16711680) + ((((16711935 & i6) * i19) + ((16711935 & i5) * i27)) & -16711936)) >>> 8;
                    i15 = i9 & 16711680;
                    i16 = i9 & 65280;
                    i21 = i9 & 255;
                    i17 = (i15 * i12) >> 8;
                    i20 = (i12 * i16) >> 8;
                    i9 = (i21 * i12) >> 8;
                }
            }
            i19 = i24 + i18;
        }
    }

    public final void bk(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 256 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * 579810681) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i4 + i2 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 & 16711680;
        int i14 = i5 & 65280;
        int i15 = i5 & 255;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i14) >> 8;
        int i18 = (min * i15) >> 8;
        int i19 = (this.ac * 1075116703) - i3;
        int i20 = i + ((1075116703 * this.ac) * i2);
        int i21 = 0;
        int i22 = min;
        int i23 = i9;
        int i24 = i13;
        while (i21 < i4) {
            int i25 = -i3;
            int i26 = i20;
            while (i25 < 0) {
                int i27;
                int i28 = this.aj[i26];
                i9 = 16711680 & i28;
                if (i9 > i24) {
                    i9 = i11 == 0 ? i24 : (((i9 * i11) >> 8) + i16) & 16711680;
                }
                i20 = 65280 & i28;
                if (i20 > i14) {
                    if (i11 == 0) {
                        i20 = i14;
                    } else {
                        i20 = (((i20 * i11) >> 8) + i17) & 65280;
                    }
                }
                i13 = i28 & 255;
                if (i13 <= i15) {
                    i27 = i13;
                } else if (i11 == 0) {
                    i27 = i15;
                } else {
                    i27 = ((i13 * i11) >> 8) + i18;
                }
                if ((-16777216 & i28) == 0) {
                    i13 = -16777216;
                } else {
                    i13 = (i28 | i12) & -16777216;
                }
                i28 = i26 + 1;
                this.aj[i26] = ((i9 + i20) + i27) | i13;
                i25++;
                i26 = i28;
            }
            if (i10 > 0) {
                i23 += i10;
                i9 = (65536 - i23) >> 8;
                i20 = i23 >> 8;
                if (min != min2) {
                    i22 = (((65536 - i23) * min) + (min2 * i23)) >> 16;
                    i11 = 256 - i22;
                    i12 = i22 << 24;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (16711935 & i5)) + (i20 * (16711935 & i6))) & -16711936) + ((((65280 & i6) * i20) + ((65280 & i5) * i9)) & 16711680)) >>> 8;
                    i18 = i9 & 16711680;
                    i13 = i9 & 65280;
                    i14 = i9 & 255;
                    i20 = (i18 * i22) >> 8;
                    i24 = (i22 * i13) >> 8;
                    i9 = (i14 * i22) >> 8;
                    i17 = i12;
                    i16 = i11;
                    i15 = i22;
                    i12 = i23;
                    i21++;
                    i23 = i12;
                    i12 = i17;
                    i11 = i16;
                    i16 = i20;
                    i17 = i24;
                    i24 = i18;
                    i20 = i26 + i19;
                    i18 = i9;
                    i22 = i15;
                    i15 = i14;
                    i14 = i13;
                }
            }
            i9 = i18;
            i20 = i16;
            i13 = i14;
            i14 = i15;
            i18 = i24;
            i16 = i11;
            i24 = i17;
            i15 = i22;
            i17 = i12;
            i12 = i23;
            i21++;
            i23 = i12;
            i12 = i17;
            i11 = i16;
            i16 = i20;
            i17 = i24;
            i24 = i18;
            i20 = i26 + i19;
            i18 = i9;
            i22 = i15;
            i15 = i14;
            i14 = i13;
        }
    }

    public final void bl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 861997044 - min;
        int i12 = min << 24;
        if (i < this.aa * 1641014553) {
            i3 -= (-2072208375 * this.aa) - i;
            i = this.aa * 2063526017;
        }
        if (i2 < -1857728003 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (this.aq * 403941715) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > this.ak * -236451379) {
            i3 = (632847632 * this.ak) - i;
        }
        if (i4 + i2 > this.ao * -90244733) {
            i4 = (-90244733 * this.ao) - i2;
        }
        int i13 = i5 & -203751665;
        int i14 = i5 & 65280;
        int i15 = i5 & -239711066;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i14) >> 8;
        int i18 = (min * i15) >> 8;
        int i19 = (this.ac * 1075116703) - i3;
        int i20 = i + ((-930586098 * this.ac) * i2);
        int i21 = 0;
        int i22 = i9;
        int i23 = i13;
        i13 = i12;
        i12 = i11;
        i11 = min;
        while (i21 < i4) {
            int i24;
            int i25 = -i3;
            int i26 = i20;
            while (i25 < 0) {
                int i27 = this.aj[i26];
                i9 = -667833138 & i27;
                if (i9 > i23) {
                    i9 = i12 == 0 ? i23 : (((i9 * i12) >> 8) + i16) & -1329408850;
                }
                i20 = 1155656494 & i27;
                if (i20 > i14) {
                    if (i12 == 0) {
                        i20 = i14;
                    } else {
                        i20 = (((i20 * i12) >> 8) + i17) & 65280;
                    }
                }
                int i28 = i27 & 255;
                if (i28 > i15) {
                    if (i12 == 0) {
                        i28 = i15;
                    } else {
                        i28 = ((i28 * i12) >> 8) + i18;
                    }
                }
                if ((-16777216 & i27) == 0) {
                    i27 = 1448541067;
                } else {
                    i27 = (i27 | i13) & -16777216;
                }
                int i29 = i26 + 1;
                this.aj[i26] = ((i9 + i20) + i28) | i27;
                i25++;
                i26 = i29;
            }
            if (i10 > 0) {
                i22 += i10;
                i9 = (65536 - i22) >> 8;
                i20 = i22 >> 8;
                if (min != min2) {
                    i11 = (((502054596 - i22) * min) + (min2 * i22)) >> 16;
                    i12 = 276770082 - i11;
                    i13 = i11 << 24;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (-565480698 & i5)) + ((723187488 & i6) * i20)) & -16711936) + ((((65280 & i6) * i20) + ((65280 & i5) * i9)) & -1145069759)) >>> 8;
                    i15 = i9 & 16711680;
                    i16 = i9 & 65280;
                    i17 = i9 & 255;
                    i18 = (i15 * i11) >> 8;
                    i23 = (i11 * i16) >> 8;
                    i9 = (i17 * i11) >> 8;
                    i14 = i13;
                    i13 = i12;
                    i12 = i11;
                    i11 = i22;
                    i20 = i26 + i19;
                    i21++;
                    i22 = i11;
                    i11 = i12;
                    i12 = i13;
                    i13 = i14;
                    i14 = i16;
                    i16 = i18;
                    i18 = i9;
                    i24 = i15;
                    i15 = i17;
                    i17 = i23;
                    i23 = i24;
                }
            }
            i9 = i18;
            i18 = i16;
            i16 = i14;
            i14 = i13;
            i13 = i12;
            i12 = i11;
            i11 = i22;
            i24 = i17;
            i17 = i15;
            i15 = i23;
            i23 = i24;
            i20 = i26 + i19;
            i21++;
            i22 = i11;
            i11 = i12;
            i12 = i13;
            i13 = i14;
            i14 = i16;
            i16 = i18;
            i18 = i9;
            i24 = i15;
            i15 = i17;
            i17 = i23;
            i23 = i24;
        }
    }

    public final void ap(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        try {
            int i9;
            int i10;
            int i11;
            int min = Math.min(i7, 255);
            int min2 = Math.min(i8, 255);
            int i12 = 0;
            int i13 = 65536 / i4;
            int i14 = 255 - min;
            int i15 = min << 24;
            if (i < this.aa * 889727047) {
                i9 = i3 - ((889727047 * this.aa) - i);
                i = this.aa * 889727047;
            } else {
                i9 = i3;
            }
            if (i2 < -1857728003 * this.aq) {
                i12 = 0 + (((this.aq * -1857728003) - i2) * i13);
                i10 = i4 - ((-1857728003 * this.aq) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i10 = i4;
            }
            if (i + i9 > 579810681 * this.ak) {
                i11 = (579810681 * this.ak) - i;
            } else {
                i11 = i9;
            }
            if (i2 + i10 > -90244733 * this.ao) {
                i10 = (this.ao * -90244733) - i2;
            }
            int i16 = i5 & 16711680;
            int i17 = i5 & 65280;
            int i18 = i5 & 255;
            int i19 = (i16 * min) >> 8;
            int i20 = (min * i17) >> 8;
            int i21 = (min * i18) >> 8;
            int i22 = (1075116703 * this.ac) - i11;
            int i23 = i + ((1075116703 * this.ac) * i2);
            int i24 = 0;
            int i25 = min;
            while (i24 < i10) {
                int i26;
                int i27 = -i11;
                int i28 = i23;
                while (i27 < 0) {
                    int i29;
                    int i30 = this.aj[i28];
                    i9 = 16711680 & i30;
                    if (i9 < i16) {
                        i9 = i14 == 0 ? i16 : (((i9 * i14) >> 8) + i19) & 16711680;
                    }
                    i23 = 65280 & i30;
                    if (i23 < i17) {
                        if (i14 == 0) {
                            i23 = i17;
                        } else {
                            i23 = (((i23 * i14) >> 8) + i20) & 65280;
                        }
                    }
                    i26 = i30 & 255;
                    if (i26 >= i18) {
                        i29 = i26;
                    } else if (i14 == 0) {
                        i29 = i18;
                    } else {
                        i29 = ((i26 * i14) >> 8) + i21;
                    }
                    if ((-16777216 & i30) == 0) {
                        i26 = -16777216;
                    } else {
                        i26 = (i30 | i15) & -16777216;
                    }
                    i30 = i28 + 1;
                    this.aj[i28] = ((i9 + i23) + i29) | i26;
                    i27++;
                    i28 = i30;
                }
                if (i13 > 0) {
                    i12 += i13;
                    i9 = (65536 - i12) >> 8;
                    i23 = i12 >> 8;
                    if (min2 != min) {
                        i25 = (((65536 - i12) * min) + (i12 * min2)) >> 16;
                        i14 = 256 - i25;
                        i15 = i25 << 24;
                    }
                    if (i6 != i5) {
                        i9 = ((((i9 * (65280 & i5)) + (i23 * (65280 & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i23)) & -16711936)) >>> 8;
                        i21 = i9 & 16711680;
                        i26 = i9 & 65280;
                        i17 = i9 & 255;
                        i23 = (i21 * i25) >> 8;
                        i16 = (i25 * i26) >> 8;
                        i9 = (i17 * i25) >> 8;
                        i20 = i15;
                        i19 = i14;
                        i18 = i25;
                        i15 = i12;
                        i24++;
                        i12 = i15;
                        i15 = i20;
                        i14 = i19;
                        i19 = i23;
                        i20 = i16;
                        i16 = i21;
                        i23 = i28 + i22;
                        i21 = i9;
                        i25 = i18;
                        i18 = i17;
                        i17 = i26;
                    }
                }
                i9 = i21;
                i23 = i19;
                i26 = i17;
                i17 = i18;
                i21 = i16;
                i19 = i14;
                i16 = i20;
                i18 = i25;
                i20 = i15;
                i15 = i12;
                i24++;
                i12 = i15;
                i15 = i20;
                i14 = i19;
                i19 = i23;
                i20 = i16;
                i16 = i21;
                i23 = i28 + i22;
                i21 = i9;
                i25 = i18;
                i18 = i17;
                i17 = i26;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ap(" + ')');
        }
    }

    public final void cb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, -1897636543);
        int min2 = Math.min(i8, -1786483513);
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 255 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 1997605948;
        }
        if (i2 < -1857728003 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (-1129968605 * this.aq) - i2;
            i2 = -736721059 * this.aq;
        }
        if (i + i3 > 579810681 * this.ak) {
            i3 = (-1918550090 * this.ak) - i;
        }
        if (i2 + i4 > 372878201 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i13 = i5 & 16711680;
        int i14 = i5 & 65280;
        int i15 = i5 & 1290194107;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i14) >> 8;
        int i18 = (min * i15) >> 8;
        int i19 = (1496653269 * this.ac) - i3;
        int i20 = i + ((-1472860550 * this.ac) * i2);
        int i21 = 0;
        int i22 = min;
        int i23 = i9;
        int i24 = i13;
        while (i21 < i4) {
            int i25;
            int i26 = -i3;
            int i27 = i20;
            while (i26 < 0) {
                i25 = this.aj[i27];
                i9 = 16711680 & i25;
                if (i9 < i24) {
                    if (i11 == 0) {
                        i9 = i24;
                    } else {
                        i9 = (((i9 * i11) >> 8) + i16) & 16711680;
                    }
                }
                i20 = -1750385810 & i25;
                if (i20 < i14) {
                    i20 = i11 == 0 ? i14 : (((i20 * i11) >> 8) + i17) & 65280;
                }
                i13 = i25 & 255;
                if (i13 < i15) {
                    if (i11 == 0) {
                        i13 = i15;
                    } else {
                        i13 = ((i13 * i11) >> 8) + i18;
                    }
                }
                if ((848593065 & i25) == 0) {
                    i25 = -16777216;
                } else {
                    i25 = (i25 | i12) & -16777216;
                }
                int i28 = i27 + 1;
                this.aj[i27] = ((i9 + i20) + i13) | i25;
                i26++;
                i27 = i28;
            }
            if (i10 > 0) {
                i23 += i10;
                i9 = (-1076568237 - i23) >> 8;
                i20 = i23 >> 8;
                if (min2 != min) {
                    i11 = (((1354878079 - i23) * min) + (i23 * min2)) >> 16;
                    i12 = -1407691378 - i11;
                    i25 = i11 << 24;
                } else {
                    i25 = i12;
                    i12 = i11;
                    i11 = i22;
                }
                if (i6 != i5) {
                    i9 = ((((i9 * (65280 & i5)) + (i20 * (-1986811719 & i6))) & 713172735) + ((((-1416175262 & i5) * i9) + ((631636579 & i6) * i20)) & -16711936)) >>> 8;
                    i13 = i9 & 16711680;
                    i14 = i9 & -726449462;
                    i15 = i9 & 1633710171;
                    i20 = (i13 * i11) >> 8;
                    i24 = (i11 * i14) >> 8;
                    i9 = (i15 * i11) >> 8;
                    i18 = i12;
                    i17 = i11;
                    i16 = i23;
                } else {
                    i9 = i18;
                    i20 = i16;
                    i13 = i24;
                    i24 = i17;
                    i18 = i12;
                    i16 = i23;
                    i17 = i11;
                }
            } else {
                i9 = i18;
                i20 = i16;
                i13 = i24;
                i25 = i12;
                i24 = i17;
                i18 = i11;
                i16 = i23;
                i17 = i22;
            }
            i21++;
            i22 = i17;
            i23 = i16;
            i17 = i24;
            i16 = i20;
            i12 = i25;
            i24 = i13;
            i20 = i27 + i19;
            i11 = i18;
            i18 = i9;
        }
    }

    public final void cy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int min = Math.min(i7, 255);
        int min2 = Math.min(i8, 255);
        int i9 = 0;
        int i10 = 65536 / i4;
        int i11 = 255 - min;
        int i12 = min << 24;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i9 = 0 + (((this.aq * -1857728003) - i2) * i10);
            i4 -= (-1857728003 * this.aq) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i + i3 > 579810681 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > -90244733 * this.ao) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i13 = i5 & 16711680;
        int i14 = i5 & 65280;
        int i15 = i5 & 255;
        int i16 = (i13 * min) >> 8;
        int i17 = (min * i15) >> 8;
        int i18 = (1075116703 * this.ac) - i3;
        int i19 = i + ((1075116703 * this.ac) * i2);
        int i20 = (min * i14) >> 8;
        int i21 = i15;
        i15 = i13;
        i13 = i11;
        i11 = i9;
        i9 = i17;
        i17 = i16;
        i16 = i14;
        i14 = i12;
        i12 = min;
        for (int i22 = 0; i22 < i4; i22++) {
            int i23 = -i3;
            int i24 = i19;
            while (i23 < 0) {
                int i25;
                int i26 = this.aj[i24];
                int i27 = 16711680 & i26;
                if (i27 < i15) {
                    if (i13 == 0) {
                        i27 = i15;
                    } else {
                        i27 = (((i27 * i13) >> 8) + i17) & 16711680;
                    }
                }
                i19 = 65280 & i26;
                if (i19 >= i16) {
                    i25 = i19;
                } else if (i13 == 0) {
                    i25 = i16;
                } else {
                    i25 = (((i19 * i13) >> 8) + i20) & 65280;
                }
                i19 = i26 & 255;
                if (i19 < i21) {
                    if (i13 == 0) {
                        i19 = i21;
                    } else {
                        i19 = ((i19 * i13) >> 8) + i9;
                    }
                }
                if ((-16777216 & i26) == 0) {
                    i26 = -16777216;
                } else {
                    i26 = (i26 | i14) & -16777216;
                }
                int i28 = i24 + 1;
                this.aj[i24] = ((i27 + i25) + i19) | i26;
                i23++;
                i24 = i28;
            }
            if (i10 > 0) {
                i11 += i10;
                i27 = (65536 - i11) >> 8;
                i19 = i11 >> 8;
                if (min2 != min) {
                    i12 = (((65536 - i11) * min) + (i11 * min2)) >> 16;
                    i13 = 256 - i12;
                    i14 = i12 << 24;
                }
                if (i6 != i5) {
                    i9 = (((((16711935 & i5) * i27) + ((16711935 & i6) * i19)) & -16711936) + ((((65280 & i5) * i27) + ((65280 & i6) * i19)) & 16711680)) >>> 8;
                    i15 = i9 & 16711680;
                    i16 = i9 & 65280;
                    i21 = i9 & 255;
                    i17 = (i15 * i12) >> 8;
                    i20 = (i12 * i16) >> 8;
                    i9 = (i21 * i12) >> 8;
                }
            }
            i19 = i24 + i18;
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
                i9 = i3 - ((889727047 * this.aa) - i);
                i = this.aa * 889727047;
            } else {
                i9 = i3;
            }
            if (i2 < -1857728003 * this.aq) {
                i8 = 0 + (((this.aq * -1857728003) - i2) * i12);
                i10 = i4 - ((this.aq * -1857728003) - i2);
                i2 = -1857728003 * this.aq;
            } else {
                i10 = i4;
            }
            if (i9 + i > 579810681 * this.ak) {
                i11 = (579810681 * this.ak) - i;
            } else {
                i11 = i9;
            }
            if (i2 + i10 > this.ao * -90244733) {
                i10 = (this.ao * -90244733) - i2;
            }
            int i13 = (1075116703 * this.ac) - i11;
            i9 = ((1075116703 * this.ac) * i2) + i;
            int i14 = -i10;
            int i15 = i8;
            while (i14 < 0) {
                i10 = (65536 - i15) >> 8;
                i8 = i15 >> 8;
                int i16 = -16777216 | (((((i10 * (65280 & i5)) + (i8 * (65280 & i6))) & 16711680) + ((((16711935 & i6) * i8) + ((16711935 & i5) * i10)) & -16711936)) >>> 8);
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
            throw ei.ac(e, "fn.at(" + ')');
        }
    }

    public final void cc(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 1947223557 / i4;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1451214322 * this.aq) {
            i7 = 0 + (((this.aq * 2122466286) - i2) * i8);
            i4 -= (this.aq * -1186120085) - i2;
            i2 = 1176472836 * this.aq;
        }
        if (i3 + i > -1429471185 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * 1494898947) - i2;
        }
        int i9 = (-338691271 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((2066415137 * this.ac) * i2) + i;
        while (i10 < 0) {
            i7 = (1129143628 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = -16777216 | (((((i7 * (1278110612 & i5)) + (i13 * (935862107 & i6))) & 16711680) + ((((-1055819323 & i6) * i13) + ((-1524188068 & i5) * i7)) & -281409295)) >>> 8);
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
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1042416950 * this.aq) {
            i7 = 0 + (((this.aq * -1563399141) - i2) * i8);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > 579810681 * this.ak) {
            i3 = (1180721477 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * 2024900139) - i2;
        }
        int i9 = (1075116703 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((1075116703 * this.ac) * i2) + i;
        while (i10 < 0) {
            i7 = (65536 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = -16777216 | (((((i7 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((16711935 & i6) * i13) + ((16711935 & i5) * i7)) & -1646477331)) >>> 8);
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
        int i8 = 65536 / i4;
        if (i < this.aa * 889727047) {
            i3 -= (889727047 * this.aa) - i;
            i = this.aa * 889727047;
        }
        if (i2 < -1857728003 * this.aq) {
            i7 = 0 + (((this.aq * -1857728003) - i2) * i8);
            i4 -= (this.aq * -1857728003) - i2;
            i2 = -1857728003 * this.aq;
        }
        if (i3 + i > 579810681 * this.ak) {
            i3 = (579810681 * this.ak) - i;
        }
        if (i2 + i4 > this.ao * -90244733) {
            i4 = (this.ao * -90244733) - i2;
        }
        int i9 = (1075116703 * this.ac) - i3;
        int i10 = -i4;
        int i11 = i7;
        int i12 = ((1075116703 * this.ac) * i2) + i;
        while (i10 < 0) {
            i7 = (65536 - i11) >> 8;
            int i13 = i11 >> 8;
            int i14 = -16777216 | (((((i7 * (65280 & i5)) + (i13 * (65280 & i6))) & 16711680) + ((((16711935 & i6) * i13) + ((16711935 & i5) * i7)) & -16711936)) >>> 8);
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
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ac * 1075116703) {
            if (i2 < this.an * -1283456967) {
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
                if (i + i10 > this.ac * 1075116703) {
                    i13 = (this.ac * 1075116703) - i;
                } else {
                    i13 = i10;
                }
                if (i2 + i12 > this.an * -1283456967) {
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
                if (!z || (i12 == 255 && 255 == i10)) {
                    i10 = (((i2 + i11) * (this.ac * 1075116703)) + i) + i9;
                    for (i16 = i2 + i11; i16 < (i2 + i11) + i14; i16++) {
                        i17 = i10;
                        i10 = i9 + i;
                        while (i10 < (i + i9) + i13) {
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
                i10 = i9 + (((1075116703 * this.ac) * (i11 + i2)) + i);
                for (int i18 = i2 + i11; i18 < (i11 + i2) + i14; i18++) {
                    i17 = i9 + i;
                    i16 = i10;
                    while (i17 < (i9 + i) + i13) {
                        if (bArr[(((i18 - i2) % length) * i7) + ((i17 - i) % i7)] != (byte) 0) {
                            i10 = i6;
                        } else {
                            i10 = i5;
                        }
                        i12 = this.aj[i16];
                        if (i12 == 0) {
                            i12 = i16 + 1;
                            this.aj[i16] = i10;
                        } else {
                            int i19 = i10 >>> 24;
                            int i20 = 255 - i19;
                            int i21 = (i10 | i12) & -16777216;
                            i10 = (((((i12 & 65280) * i20) + ((i10 & 65280) * i19)) & 16711680) + ((((16711935 & i12) * i20) + ((16711935 & i10) * i19)) & -16711936)) >>> 8;
                            try {
                                i12 = i16 + 1;
                                this.aj[i16] = i10 | i21;
                            } catch (Throwable e) {
                                throw ei.ac(e, "fn.ah(" + ')');
                            }
                        }
                        i17++;
                        i16 = i12;
                    }
                    i10 = i16 + i15;
                }
            }
        }
    }

    public final void ca(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ac * 1075116703) {
            if (i2 < this.an * -1283456967) {
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
                if (i + i9 > this.ac * 1075116703) {
                    i9 = (this.ac * 1075116703) - i;
                }
                if (i2 + i4 > this.an * -1283456967) {
                    i4 = (-1283456967 * this.an) - i2;
                }
                int length = bArr.length / i7;
                int i11 = (this.ac * 1075116703) - i9;
                int i12 = i5 >>> 24;
                int i13 = i6 >>> 24;
                int i14;
                int i15;
                if (!z || (i12 == 255 && 255 == i13)) {
                    i13 = (((i2 + i10) * (this.ac * 1075116703)) + i) + i8;
                    for (i14 = i2 + i10; i14 < (i2 + i10) + i4; i14++) {
                        i15 = i13;
                        i13 = i8 + i;
                        while (i13 < (i + i8) + i9) {
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
                i13 = i8 + (((1075116703 * this.ac) * (i10 + i2)) + i);
                for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                    i15 = i8 + i;
                    i14 = i13;
                    while (i15 < (i8 + i) + i9) {
                        if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                            i12 = i6;
                        } else {
                            i12 = i5;
                        }
                        i13 = this.aj[i14];
                        if (i13 == 0) {
                            i13 = i14 + 1;
                            this.aj[i14] = i12;
                            i12 = i13;
                        } else {
                            int i17 = i12 >>> 24;
                            int i18 = 255 - i17;
                            int i19 = (i12 | i13) & -16777216;
                            i13 = (((((i12 & 65280) * i17) + ((i13 & 65280) * i18)) & 16711680) + ((((16711935 & i13) * i18) + ((16711935 & i12) * i17)) & -16711936)) >>> 8;
                            i12 = i14 + 1;
                            this.aj[i14] = i13 | i19;
                        }
                        i15++;
                        i14 = i12;
                    }
                    i13 = i14 + i11;
                }
            }
        }
    }

    public final void cf(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ac * 1075116703) {
            if (i2 < this.an * -1283456967) {
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
                if (i + i9 > this.ac * 1075116703) {
                    i9 = (this.ac * 1075116703) - i;
                }
                if (i2 + i4 > this.an * -1283456967) {
                    i4 = (-1283456967 * this.an) - i2;
                }
                int length = bArr.length / i7;
                int i11 = (this.ac * 1075116703) - i9;
                int i12 = i5 >>> 24;
                int i13 = i6 >>> 24;
                int i14;
                int i15;
                if (!z || (i12 == 255 && 255 == i13)) {
                    i13 = (((i2 + i10) * (this.ac * 1075116703)) + i) + i8;
                    for (i14 = i2 + i10; i14 < (i2 + i10) + i4; i14++) {
                        i15 = i13;
                        i13 = i8 + i;
                        while (i13 < (i + i8) + i9) {
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
                i13 = i8 + (((1075116703 * this.ac) * (i10 + i2)) + i);
                for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                    i15 = i8 + i;
                    i14 = i13;
                    while (i15 < (i8 + i) + i9) {
                        if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                            i12 = i6;
                        } else {
                            i12 = i5;
                        }
                        i13 = this.aj[i14];
                        if (i13 == 0) {
                            i13 = i14 + 1;
                            this.aj[i14] = i12;
                            i12 = i13;
                        } else {
                            int i17 = i12 >>> 24;
                            int i18 = 255 - i17;
                            int i19 = (i12 | i13) & -16777216;
                            i13 = (((((i12 & 65280) * i17) + ((i13 & 65280) * i18)) & 16711680) + ((((16711935 & i13) * i18) + ((16711935 & i12) * i17)) & -16711936)) >>> 8;
                            i12 = i14 + 1;
                            this.aj[i14] = i13 | i19;
                        }
                        i15++;
                        i14 = i12;
                    }
                    i13 = i14 + i11;
                }
            }
        }
    }

    public final void cr(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.ac * 1075116703 && i2 < this.an * -1283456967) {
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
            if (i + i9 > this.ac * 1075116703) {
                i9 = (this.ac * 1075116703) - i;
            }
            if (i2 + i4 > this.an * -1283456967) {
                i4 = (-1283456967 * this.an) - i2;
            }
            int length = bArr.length / i7;
            int i11 = (this.ac * 1075116703) - i9;
            int i12 = i5 >>> 24;
            int i13 = i6 >>> 24;
            int i14;
            int i15;
            if (!z || (i12 == 255 && 255 == i13)) {
                i13 = (((i2 + i10) * (this.ac * 1075116703)) + i) + i8;
                for (i14 = i2 + i10; i14 < (i2 + i10) + i4; i14++) {
                    i15 = i13;
                    i13 = i8 + i;
                    while (i13 < (i + i8) + i9) {
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
            i13 = i8 + (((1075116703 * this.ac) * (i10 + i2)) + i);
            for (int i16 = i2 + i10; i16 < (i10 + i2) + i4; i16++) {
                i15 = i8 + i;
                i14 = i13;
                while (i15 < (i8 + i) + i9) {
                    if (bArr[(((i16 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0) {
                        i12 = i6;
                    } else {
                        i12 = i5;
                    }
                    i13 = this.aj[i14];
                    if (i13 == 0) {
                        i13 = i14 + 1;
                        this.aj[i14] = i12;
                        i12 = i13;
                    } else {
                        int i17 = i12 >>> 24;
                        int i18 = 255 - i17;
                        int i19 = (i12 | i13) & -16777216;
                        i13 = (((((i12 & 65280) * i17) + ((i13 & 65280) * i18)) & 16711680) + ((((16711935 & i13) * i18) + ((16711935 & i12) * i17)) & -16711936)) >>> 8;
                        i12 = i14 + 1;
                        this.aj[i14] = i13 | i19;
                    }
                    i15++;
                    i14 = i12;
                }
                i13 = i14 + i11;
            }
        }
    }

    public final void ai(int i, int i2, int i3, int i4, int i5) {
        int i6 = -16777216 | i4;
        try {
            if (i2 >= -1857728003 * this.aq && i2 < -90244733 * this.ao) {
                int i7;
                int i8;
                if (i < this.aa * 889727047) {
                    i7 = i3 - ((this.aa * 889727047) - i);
                    i = this.aa * 889727047;
                } else {
                    i7 = i3;
                }
                if (i7 + i > this.ak * 579810681) {
                    i8 = (this.ak * 579810681) - i;
                } else {
                    i8 = i7;
                }
                int i9 = i + ((this.ac * 1075116703) * i2);
                for (i7 = 0; i7 < i8; i7++) {
                    this.aj[i9 + i7] = i6;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ai(" + ')');
        }
    }

    public final void en(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i2 >= -1857728003 * this.aq && i2 < -90244733 * this.ao) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 889727047;
            }
            if (i3 + i > this.ak * 579810681) {
                i3 = (this.ak * 579810681) - i;
            }
            int i6 = i + ((this.ac * 1075116703) * i2);
            for (int i7 = 0; i7 < i3; i7++) {
                this.aj[i6 + i7] = i5;
            }
        }
    }

    public final void ev(int i, int i2, int i3, int i4) {
        int i5 = -16777216 | i4;
        if (i2 >= -1857728003 * this.aq && i2 < 2088668799 * this.ao) {
            if (i < this.aa * -2014946501) {
                i3 -= (492895351 * this.aa) - i;
                i = this.aa * 889727047;
            }
            if (i3 + i > this.ak * 579810681) {
                i3 = (this.ak * 698584287) - i;
            }
            int i6 = i + ((this.ac * 1075116703) * i2);
            for (int i7 = 0; i7 < i3; i7++) {
                this.aj[i6 + i7] = i5;
            }
        }
    }

    final void aw(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 >= 255) {
            try {
                ai(i, i2, i3, i4, -1428062859);
            } catch (Throwable e) {
                throw ei.ac(e, "fn.aw(" + ')');
            }
        } else if (i2 < this.aq * -1857728003) {
        } else {
            if (i2 < this.ao * -90244733) {
                int i7;
                if (i < this.aa * 889727047) {
                    i7 = i3 - ((this.aa * 889727047) - i);
                    i = this.aa * 889727047;
                } else {
                    i7 = i3;
                }
                if (i7 + i > 579810681 * this.ak) {
                    i7 = (this.ak * 579810681) - i;
                }
                int i8 = 255 - i5;
                int i9 = i5 << 24;
                int i10 = ((i4 >> 16) & 255) * i5;
                int i11 = ((i4 >> 8) & 255) * i5;
                int i12 = (i4 & 255) * i5;
                int i13 = (i5 << 24) | i4;
                int i14 = ((this.ac * 1075116703) * i2) + i;
                int i15 = 0;
                while (i15 < i7) {
                    int i16;
                    if (this.aj[i14] == 0) {
                        i16 = i14 + 1;
                        this.aj[i14] = i13;
                    } else {
                        i16 = (((((this.aj[i14] >> 16) & 255) * i8) + i10) >> 8) << 16;
                        i16 = i14 + 1;
                        this.aj[i14] = (((((this.aj[i14] & 255) * i8) + i12) >> 8) + (i16 + ((((((this.aj[i14] >> 8) & 255) * i8) + i11) >> 8) << 8))) | (-16777216 & (this.aj[i14] | i9));
                    }
                    i15++;
                    i14 = i16;
                }
            }
        }
    }

    final void ck(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= 255) {
            ai(i, i2, i3, i4, -949989124);
        } else if (i2 >= this.aq * 1498476005 && i2 < this.ao * -90244733) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 1081839360;
            }
            if (i3 + i > 944361243 * this.ak) {
                i3 = (this.ak * 1045576751) - i;
            }
            int i6 = 255 - i5;
            int i7 = i5 << 24;
            int i8 = ((i4 >> 16) & 255) * i5;
            int i9 = ((i4 >> 8) & 255) * i5;
            int i10 = (-1042428056 & i4) * i5;
            int i11 = (i5 << 24) | i4;
            int i12 = ((this.ac * 1075116703) * i2) + i;
            int i13 = 0;
            while (i13 < i3) {
                int i14;
                if (this.aj[i12] == 0) {
                    i14 = i12 + 1;
                    this.aj[i12] = i11;
                } else {
                    i14 = (((((this.aj[i12] >> 16) & 255) * i6) + i8) >> 8) << 16;
                    i14 = i12 + 1;
                    this.aj[i12] = (((((this.aj[i12] & 255) * i6) + i10) >> 8) + (i14 + ((((((this.aj[i12] >> 8) & -651060365) * i6) + i9) >> 8) << 8))) | (1382915498 & (this.aj[i12] | i7));
                }
                i13++;
                i12 = i14;
            }
        }
    }

    final void cm(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= 255) {
            ai(i, i2, i3, i4, -1117327508);
        } else if (i2 >= this.aq * -1857728003 && i2 < this.ao * -90244733) {
            if (i < this.aa * -1619280908) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 453796368;
            }
            if (i3 + i > 193529077 * this.ak) {
                i3 = (this.ak * 579810681) - i;
            }
            int i6 = 98234599 - i5;
            int i7 = i5 << 24;
            int i8 = ((i4 >> 16) & -310011508) * i5;
            int i9 = ((i4 >> 8) & -1201654665) * i5;
            int i10 = (i4 & 255) * i5;
            int i11 = (i5 << 24) | i4;
            int i12 = ((this.ac * 1075116703) * i2) + i;
            int i13 = 0;
            while (i13 < i3) {
                int i14;
                if (this.aj[i12] == 0) {
                    i14 = i12 + 1;
                    this.aj[i12] = i11;
                } else {
                    i14 = (((((this.aj[i12] >> 16) & -2052133658) * i6) + i8) >> 8) << 16;
                    i14 = i12 + 1;
                    this.aj[i12] = (((((this.aj[i12] & 255) * i6) + i10) >> 8) + (i14 + ((((((this.aj[i12] >> 8) & -1022436095) * i6) + i9) >> 8) << 8))) | (-339881193 & (this.aj[i12] | i7));
                }
                i13++;
                i12 = i14;
            }
        }
    }

    final void cp(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= 255) {
            ai(i, i2, i3, i4, -1428885076);
        } else if (i2 < this.aq * -1857728003) {
        } else {
            if (i2 < this.ao * -90244733) {
                if (i < this.aa * 889727047) {
                    i3 -= (this.aa * 889727047) - i;
                    i = this.aa * 889727047;
                }
                if (i3 + i > 579810681 * this.ak) {
                    i3 = (this.ak * 579810681) - i;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((i4 >> 16) & 255) * i5;
                int i9 = ((i4 >> 8) & 255) * i5;
                int i10 = (i4 & 255) * i5;
                int i11 = (i5 << 24) | i4;
                int i12 = ((this.ac * 1075116703) * i2) + i;
                int i13 = 0;
                while (i13 < i3) {
                    int i14;
                    if (this.aj[i12] == 0) {
                        i14 = i12 + 1;
                        this.aj[i12] = i11;
                    } else {
                        i14 = (((((this.aj[i12] >> 16) & 255) * i6) + i8) >> 8) << 16;
                        i14 = i12 + 1;
                        this.aj[i12] = (((((this.aj[i12] & 255) * i6) + i10) >> 8) + (i14 + ((((((this.aj[i12] >> 8) & 255) * i6) + i9) >> 8) << 8))) | (-16777216 & (this.aj[i12] | i7));
                    }
                    i13++;
                    i12 = i14;
                }
            }
        }
    }

    final void ct(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= -1800051747) {
            ai(i, i2, i3, i4, -1204085466);
        } else if (i2 >= this.aq * -1857728003 && i2 < this.ao * -90244733) {
            if (i < this.aa * 889727047) {
                i3 -= (this.aa * 889727047) - i;
                i = this.aa * 889727047;
            }
            if (i3 + i > 1231769328 * this.ak) {
                i3 = (this.ak * 579810681) - i;
            }
            int i6 = 255 - i5;
            int i7 = i5 << 24;
            int i8 = ((i4 >> 16) & 2126633460) * i5;
            int i9 = ((i4 >> 8) & -1284702234) * i5;
            int i10 = (i4 & 255) * i5;
            int i11 = (i5 << 24) | i4;
            int i12 = ((this.ac * 1075116703) * i2) + i;
            int i13 = 0;
            while (i13 < i3) {
                int i14;
                if (this.aj[i12] == 0) {
                    i14 = i12 + 1;
                    this.aj[i12] = i11;
                } else {
                    i14 = (((((this.aj[i12] >> 16) & 1751568103) * i6) + i8) >> 8) << 16;
                    i14 = i12 + 1;
                    this.aj[i12] = (((((this.aj[i12] & -1482784085) * i6) + i10) >> 8) + (i14 + ((((((this.aj[i12] >> 8) & 255) * i6) + i9) >> 8) << 8))) | (-16777216 & (this.aj[i12] | i7));
                }
                i13++;
                i12 = i14;
            }
        }
    }

    public final void am(int i, int i2, int i3, int i4, byte b) {
        int i5 = -16777216 | i4;
        try {
            if (i >= this.aa * 889727047 && i < 579810681 * this.ak) {
                int i6;
                int i7;
                if (i2 < this.aq * -1857728003) {
                    i6 = i3 - ((this.aq * -1857728003) - i2);
                    i2 = this.aq * -1857728003;
                } else {
                    i6 = i3;
                }
                if (i6 + i2 > this.ao * -90244733) {
                    i7 = (this.ao * -90244733) - i2;
                } else {
                    i7 = i6;
                }
                int i8 = ((this.ac * 1075116703) * i2) + i;
                for (i6 = 0; i6 < i7; i6++) {
                    this.aj[((this.ac * 1075116703) * i6) + i8] = i5;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.am(" + ')');
        }
    }

    public final void ce(int i, int i2, int i3, int i4) {
        int i5 = -427246115 | i4;
        if (i >= this.aa * 1143211200 && i < -781514469 * this.ak) {
            if (i2 < this.aq * -1857728003) {
                i3 -= (this.aq * -1689862397) - i2;
                i2 = this.aq * -1857728003;
            }
            if (i3 + i2 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i6 = ((this.ac * 1075116703) * i2) + i;
            for (int i7 = 0; i7 < i3; i7++) {
                this.aj[((818557596 * this.ac) * i7) + i6] = i5;
            }
        }
    }

    public final void ch(int i, int i2, int i3, int i4) {
        int i5 = -1859330540 | i4;
        if (i >= this.aa * -1285294809 && i < 1989251160 * this.ak) {
            if (i2 < this.aq * 2068013151) {
                i3 -= (this.aq * -1857728003) - i2;
                i2 = this.aq * -1857728003;
            }
            if (i3 + i2 > this.ao * -90244733) {
                i3 = (this.ao * -90244733) - i2;
            }
            int i6 = ((this.ac * -1937172750) * i2) + i;
            for (int i7 = 0; i7 < i3; i7++) {
                this.aj[((-162634216 * this.ac) * i7) + i6] = i5;
            }
        }
    }

    final void ae(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 >= 255) {
            try {
                am(i, i2, i3, i4, (byte) -8);
            } catch (Throwable e) {
                throw ei.ac(e, "fn.ae(" + ')');
            }
        } else if (i < this.aa * 889727047) {
        } else {
            if (i < this.ak * 579810681) {
                int i7;
                if (i2 < -1857728003 * this.aq) {
                    i7 = i3 - ((this.aq * -1857728003) - i2);
                    i2 = this.aq * -1857728003;
                } else {
                    i7 = i3;
                }
                if (i2 + i7 > -90244733 * this.ao) {
                    i7 = (-90244733 * this.ao) - i2;
                }
                int i8 = 255 - i5;
                int i9 = i5 << 24;
                int i10 = ((i4 >> 16) & 255) * i5;
                int i11 = i5 * ((i4 >> 8) & 255);
                int i12 = i5 * (i4 & 255);
                int i13 = (i5 << 24) | i4;
                int i14 = i + ((this.ac * 1075116703) * i2);
                int i15 = 0;
                while (i15 < i7) {
                    int i16;
                    if (this.aj[i14] == 0) {
                        i16 = i14 + 1;
                        this.aj[i14] = i13;
                    } else {
                        i16 = (((((this.aj[i14] >> 16) & 255) * i8) + i10) >> 8) << 16;
                        this.aj[i14] = ((i16 + ((((((this.aj[i14] >> 8) & 255) * i8) + i11) >> 8) << 8)) + ((((this.aj[i14] & 255) * i8) + i12) >> 8)) | ((this.aj[i14] | i9) & -16777216);
                        i16 = (this.ac * 1075116703) + i14;
                    }
                    i15++;
                    i14 = i16;
                }
            }
        }
    }

    final void ci(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= 255) {
            am(i, i2, i3, i4, (byte) -98);
        } else if (i < this.aa * 889727047) {
        } else {
            if (i < this.ak * 579810681) {
                if (i2 < -1857728003 * this.aq) {
                    i3 -= (this.aq * -1857728003) - i2;
                    i2 = this.aq * -1857728003;
                }
                if (i2 + i3 > -90244733 * this.ao) {
                    i3 = (-90244733 * this.ao) - i2;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((i4 >> 16) & 255) * i5;
                int i9 = i5 * ((i4 >> 8) & 255);
                int i10 = i5 * (i4 & 255);
                int i11 = (i5 << 24) | i4;
                int i12 = i + ((this.ac * 1075116703) * i2);
                int i13 = 0;
                while (i13 < i3) {
                    int i14;
                    if (this.aj[i12] == 0) {
                        i14 = i12 + 1;
                        this.aj[i12] = i11;
                    } else {
                        i14 = (((((this.aj[i12] >> 16) & 255) * i6) + i8) >> 8) << 16;
                        this.aj[i12] = ((i14 + ((((((this.aj[i12] >> 8) & 255) * i6) + i9) >> 8) << 8)) + ((((this.aj[i12] & 255) * i6) + i10) >> 8)) | ((this.aj[i12] | i7) & -16777216);
                        i14 = (this.ac * 1075116703) + i12;
                    }
                    i13++;
                    i12 = i14;
                }
            }
        }
    }

    final void cq(int i, int i2, int i3, int i4, int i5) {
        if (i5 >= 255) {
            am(i, i2, i3, i4, (byte) -11);
        } else if (i < this.aa * 889727047) {
        } else {
            if (i < this.ak * 579810681) {
                if (i2 < -1857728003 * this.aq) {
                    i3 -= (this.aq * -1857728003) - i2;
                    i2 = this.aq * -1857728003;
                }
                if (i2 + i3 > -90244733 * this.ao) {
                    i3 = (-90244733 * this.ao) - i2;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((i4 >> 16) & 255) * i5;
                int i9 = i5 * ((i4 >> 8) & 255);
                int i10 = i5 * (i4 & 255);
                int i11 = (i5 << 24) | i4;
                int i12 = i + ((this.ac * 1075116703) * i2);
                int i13 = 0;
                while (i13 < i3) {
                    int i14;
                    if (this.aj[i12] == 0) {
                        i14 = i12 + 1;
                        this.aj[i12] = i11;
                    } else {
                        i14 = (((((this.aj[i12] >> 16) & 255) * i6) + i8) >> 8) << 16;
                        this.aj[i12] = ((i14 + ((((((this.aj[i12] >> 8) & 255) * i6) + i9) >> 8) << 8)) + ((((this.aj[i12] & 255) * i6) + i10) >> 8)) | ((this.aj[i12] | i7) & -16777216);
                        i14 = (this.ac * 1075116703) + i12;
                    }
                    i13++;
                    i12 = i14;
                }
            }
        }
    }

    public final void as(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                try {
                    ai(i, i2, i7 + 1, i6, -1320819068);
                    return;
                } catch (Throwable e) {
                    throw ei.ac(e, "fn.as(" + ')');
                }
            }
            ai(i7 + i, i2, (-i7) + 1, i6, -972459851);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i2 += i8;
                i8 = -i8;
                i9 = -i7;
                i7 = i + i7;
                i10 = i2;
            } else {
                i9 = i7;
                i10 = i2;
                i7 = i;
            }
            int floor;
            if (i9 > i8) {
                i10 = (i10 << 16) + 32768;
                floor = (int) Math.floor((((double) (i8 << 16)) / ((double) i9)) + 0.5d);
                i8 = i9 + i7;
                if (i7 < this.aa * 889727047) {
                    i10 += ((this.aa * 889727047) - i7) * floor;
                    i7 = this.aa * 889727047;
                }
                if (i8 >= this.ak * 579810681) {
                    i8 = (this.ak * 579810681) - 1;
                }
                while (i7 <= i8) {
                    i9 = i10 >> 16;
                    if (i9 >= -1857728003 * this.aq && i9 < this.ao * -90244733) {
                        this.aj[(i9 * (this.ac * 1075116703)) + i7] = i6;
                    }
                    i10 += floor;
                    i7++;
                }
                return;
            }
            i7 = (i7 << 16) + 32768;
            i9 = (int) Math.floor(0.5d + (((double) (i9 << 16)) / ((double) i8)));
            i8 += i10;
            if (i10 < this.aq * -1857728003) {
                i7 += ((-1857728003 * this.aq) - i10) * i9;
                i10 = this.aq * -1857728003;
            }
            if (i8 >= this.ao * -90244733) {
                i8 = (this.ao * -90244733) - 1;
            }
            while (i10 <= i8) {
                floor = i7 >> 16;
                if (floor >= this.aa * 889727047 && floor < 579810681 * this.ak) {
                    this.aj[floor + ((1075116703 * this.ac) * i10)] = i6;
                }
                i7 += i9;
                i10++;
            }
        } else if (i8 >= 0) {
            am(i, i2, i8 + 1, i6, (byte) -42);
        } else {
            am(i, i8 + i2, (-i8) + 1, i6, (byte) -100);
        }
    }

    public final void cg(int i, int i2, int i3, int i4, int i5) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ai(i, i2, i7 + 1, i6, -2124955981);
                return;
            }
            ai(i7 + i, i2, (-i7) + 1, i6, -1897023047);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor((((double) (i7 << 16)) / ((double) i10)) + 0.5d);
                i7 = i10 + i9;
                if (i9 < this.aa * 889727047) {
                    i8 += ((this.aa * 889727047) - i9) * floor;
                    i9 = this.aa * 889727047;
                }
                if (i7 >= this.ak * 579810681) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (this.ak * 579810681) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= -1857728003 * this.aq && i10 < this.ao * -90244733) {
                        this.aj[(i10 * (this.ac * 1075116703)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor(0.5d + (((double) (i10 << 16)) / ((double) i7)));
            i7 += i8;
            if (i8 < this.aq * -1857728003) {
                i9 += ((-1857728003 * this.aq) - i8) * i10;
                i8 = this.aq * -1857728003;
            }
            if (i7 >= this.ao * -90244733) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ao * -90244733) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= this.aa * 889727047 && floor < 579810681 * this.ak) {
                    this.aj[floor + ((1075116703 * this.ac) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            am(i, i2, i8 + 1, i6, (byte) -121);
        } else {
            am(i, i8 + i2, (-i8) + 1, i6, (byte) -115);
        }
    }

    public final void cu(int i, int i2, int i3, int i4, int i5) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ai(i, i2, i7 + 1, i6, -1990117753);
                return;
            }
            ai(i7 + i, i2, (-i7) + 1, i6, -1035889027);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor((((double) (i7 << 16)) / ((double) i10)) + 0.5d);
                i7 = i10 + i9;
                if (i9 < this.aa * 889727047) {
                    i8 += ((this.aa * 889727047) - i9) * floor;
                    i9 = this.aa * 889727047;
                }
                if (i7 >= this.ak * 579810681) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (this.ak * 579810681) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= -1857728003 * this.aq && i10 < this.ao * -90244733) {
                        this.aj[(i10 * (this.ac * 1075116703)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor(0.5d + (((double) (i10 << 16)) / ((double) i7)));
            i7 += i8;
            if (i8 < this.aq * -1857728003) {
                i9 += ((-1857728003 * this.aq) - i8) * i10;
                i8 = this.aq * -1857728003;
            }
            if (i7 >= this.ao * -90244733) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ao * -90244733) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= this.aa * 889727047 && floor < 579810681 * this.ak) {
                    this.aj[floor + ((1075116703 * this.ac) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            am(i, i2, i8 + 1, i6, (byte) -102);
        } else {
            am(i, i8 + i2, (-i8) + 1, i6, (byte) -51);
        }
    }

    public final void cv(int i, int i2, int i3, int i4, int i5) {
        int i6 = (-16777216 + i5) & 16777215;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ai(i, i2, i7 + 1, i6, -2111818825);
                return;
            }
            ai(i7 + i, i2, (-i7) + 1, i6, -2037763382);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i += i7;
                i9 = -i7;
                i7 = -i8;
                i10 = i9;
                i8 = i2 + i8;
                i9 = i;
            } else {
                i10 = i7;
                i9 = i;
                i7 = i8;
                i8 = i2;
            }
            int floor;
            int i11;
            if (i10 > i7) {
                i8 = (i8 << 16) + 32768;
                floor = (int) Math.floor((((double) (i7 << 16)) / ((double) i10)) + 0.5d);
                i7 = i10 + i9;
                if (i9 < this.aa * 889727047) {
                    i8 += ((this.aa * 889727047) - i9) * floor;
                    i9 = this.aa * 889727047;
                }
                if (i7 >= this.ak * 579810681) {
                    i7 = i9;
                    i9 = i8;
                    i8 = (this.ak * 579810681) - 1;
                } else {
                    i11 = i7;
                    i7 = i9;
                    i9 = i8;
                    i8 = i11;
                }
                while (i7 <= i8) {
                    i10 = i9 >> 16;
                    if (i10 >= -1857728003 * this.aq && i10 < this.ao * -90244733) {
                        this.aj[(i10 * (this.ac * 1075116703)) + i7] = i6;
                    }
                    i9 += floor;
                    i7++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i10 = (int) Math.floor(0.5d + (((double) (i10 << 16)) / ((double) i7)));
            i7 += i8;
            if (i8 < this.aq * -1857728003) {
                i9 += ((-1857728003 * this.aq) - i8) * i10;
                i8 = this.aq * -1857728003;
            }
            if (i7 >= this.ao * -90244733) {
                i7 = i9;
                i9 = i8;
                i8 = (this.ao * -90244733) - 1;
            } else {
                i11 = i7;
                i7 = i9;
                i9 = i8;
                i8 = i11;
            }
            while (i9 <= i8) {
                floor = i7 >> 16;
                if (floor >= this.aa * 889727047 && floor < 579810681 * this.ak) {
                    this.aj[floor + ((1075116703 * this.ac) * i9)] = i6;
                }
                i7 += i10;
                i9++;
            }
        } else if (i8 >= 0) {
            am(i, i2, i8 + 1, i6, (byte) -46);
        } else {
            am(i, i8 + i2, (-i8) + 1, i6, (byte) -16);
        }
    }

    public final void al(em emVar, int i, int i2, int i3) {
        try {
            int i4 = emVar.aq + i;
            int i5 = emVar.ao + i2;
            int i6 = i4 + ((1075116703 * this.ac) * i5);
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
                i5 = (889727047 * this.aa) - i4;
                i9 -= i5;
                i4 = 889727047 * this.aa;
                i7 += i5;
                i6 += i5;
                i11 = 0 + i5;
                i10 += i5;
            }
            if (i4 + i9 > this.ak * 579810681) {
                i4 = (i4 + i9) - (this.ak * 579810681);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                df.az(this.aj, emVar.aj, i7, i6, i9, i8, i10, i11, (byte) -34);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.al(" + ')');
        }
    }

    public final void cs(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = i4 + ((1075116703 * this.ac) * i5);
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
            int i12 = (889727047 * this.aa) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i5;
            i10 = 889727047 * this.aa;
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
        if (i10 + i3 > this.ak * 579810681) {
            i10 = (i10 + i3) - (this.ak * 579810681);
            i3 -= i10;
            i9 = i8 + i10;
            i10 += i7;
        } else {
            i9 = i8;
            i10 = i7;
        }
        if (i3 > 0 && i11 > 0) {
            df.az(this.aj, emVar.aj, i6, i5, i3, i11, i10, i9, (byte) -63);
        }
    }

    public final void cx(em emVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((this.ac * 1075116703) * i6);
        int i8 = emVar.an;
        int i9 = emVar.ac;
        int i10 = (this.ac * 1075116703) - i9;
        if (i6 < 838264478 * this.aq) {
            int i11 = (-1445907980 * this.aq) - i6;
            i8 -= i11;
            i3 = this.aq * -1336997074;
            i6 = (i11 * i9) + 0;
            i7 += i11 * (this.ac * 1075116703);
        } else {
            i3 = i6;
            i6 = 0;
        }
        if (i8 + i3 > 2053620080 * this.ao) {
            i11 = i8 - ((i3 + i8) - (-1426838532 * this.ao));
        } else {
            i11 = i8;
        }
        if (i5 < -2067944986 * this.aa) {
            i8 = (-2013899346 * this.aa) - i5;
            i3 = i9 - i8;
            i6 += i8;
            i7 += i8;
            i4 = 0 + i8;
            i8 += i10;
            i10 = 889727047 * this.aa;
            int i12 = i8;
            i8 = i4;
            i4 = i6;
            i6 = i12;
        } else {
            i8 = 0;
            i3 = i9;
            i4 = i6;
            i6 = i10;
            i10 = i5;
        }
        if (i10 + i3 > this.ak * 1650346723) {
            i10 = (i10 + i3) - (this.ak * 579810681);
            i3 -= i10;
            i9 = i8 + i10;
            i10 += i6;
        } else {
            i9 = i8;
            i10 = i6;
        }
        if (i3 > 0 && i11 > 0) {
            df.az(this.aj, emVar.aj, i4, i7, i3, i11, i10, i9, (byte) -3);
        }
    }

    static void cn(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i3 + i9) - 3;
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

    static void da(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i3 + i9) - 3;
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

    static void dt(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i3 + i9) - 3;
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
            int i6 = i4 + ((1075116703 * this.ac) * i5);
            int i7 = 0;
            int i8 = emVar.an;
            int i9 = emVar.ac;
            int i10 = (1075116703 * this.ac) - i9;
            int i11 = 0;
            if (i5 < this.aq * -1857728003) {
                int i12 = (this.aq * -1857728003) - i5;
                i8 -= i12;
                i5 = this.aq * -1857728003;
                i7 = 0 + (i12 * i9);
                i6 += i12 * (this.ac * 1075116703);
            }
            if (i8 + i5 > this.ao * -90244733) {
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
            if (i4 + i9 > this.ak * 579810681) {
                i4 = (i4 + i9) - (this.ak * 579810681);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                hq.af(this.aj, emVar.aj, 0, i7, i6, i9, i8, i10, i11, -1346936496);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ax(" + ')');
        }
    }

    public final void cj(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = i4 + ((1075116703 * this.ac) * i5);
        int i7 = 0;
        int i8 = emVar.an;
        int i9 = emVar.ac;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < this.aq * -1857728003) {
            int i11 = (this.aq * -1857728003) - i5;
            i8 -= i11;
            i5 = this.aq * -1857728003;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i8 + i5 > this.ao * -90244733) {
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
            i3 = i6 + i12;
            i10 = this.aa * 889727047;
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
        if (i10 + i6 > this.ak * 579810681) {
            i9 = (i10 + i6) - (this.ak * 579810681);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            hq.af(this.aj, emVar.aj, 0, i5, i3, i10, i11, i9, i4, -590769804);
        }
    }

    public final void cz(em emVar, int i, int i2) {
        int i3;
        int i4 = i + emVar.aq;
        int i5 = i2 + emVar.ao;
        int i6 = i4 + ((-102611026 * this.ac) * i5);
        int i7 = emVar.an;
        int i8 = emVar.ac;
        int i9 = (461741635 * this.ac) - i8;
        if (i5 < this.aq * -1857728003) {
            int i10 = (this.aq * -1857728003) - i5;
            i7 -= i10;
            i3 = this.aq * -1857728003;
            i5 = (i10 * i8) + 0;
            i6 += i10 * (this.ac * -2085970832);
        } else {
            i3 = i5;
            i5 = 0;
        }
        if (i7 + i3 > this.ao * -90244733) {
            i10 = i7 - ((i3 + i7) - (1397230230 * this.ao));
        } else {
            i10 = i7;
        }
        if (i4 < -1886212750 * this.aa) {
            int i11 = (this.aa * 555192867) - i4;
            i3 = i8 - i11;
            i8 = i5 + i11;
            i7 = 0 + i11;
            i5 = i9 + i11;
            i9 = i3;
            i3 = i6 + i11;
            i6 = i8;
            i8 = this.aa * 889727047;
        } else {
            i7 = 0;
            i3 = i6;
            i6 = i5;
            i5 = i9;
            i9 = i8;
            i8 = i4;
        }
        if (i8 + i9 > this.ak * 579810681) {
            i8 = (i8 + i9) - (this.ak * -235416566);
            i9 -= i8;
            i4 = i7 + i8;
            i8 += i5;
        } else {
            i4 = i7;
            i8 = i5;
        }
        if (i9 > 0 && i10 > 0) {
            hq.af(this.aj, emVar.aj, 0, i6, i3, i9, i10, i8, i4, 73469551);
        }
    }

    static void ah(boolean z, int i) {
        try {
            client.ac.tt(787294587);
            fw.bf = ix.ih;
            fw.bl = ix.if;
            fw.cb = ix.im;
            fw.bc = -374658518;
            if (z) {
                fw.cl = "";
            }
            dz.ao(-367735574);
            ab.aa((byte) 54);
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ah(" + ')');
        }
    }

    static void do(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
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
                if (i15 != 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i15;
                } else {
                    i12 = i13 + 1;
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
            int i4 = flVar.ao + i;
            int i5 = flVar.aa + i2;
            int i6 = i4 + ((1075116703 * this.ac) * i5);
            int i7 = 0;
            int i8 = flVar.aq;
            int i9 = flVar.an;
            int i10 = (1075116703 * this.ac) - i9;
            int i11 = 0;
            if (i5 < -1857728003 * this.aq) {
                int i12 = (-1857728003 * this.aq) - i5;
                i8 -= i12;
                i5 = this.aq * -1857728003;
                i7 = 0 + (i12 * i9);
                i6 += i12 * (this.ac * 1075116703);
            }
            if (i5 + i8 > this.ao * -90244733) {
                i8 -= (i5 + i8) - (-90244733 * this.ao);
            }
            if (i4 < this.aa * 889727047) {
                i5 = (this.aa * 889727047) - i4;
                i9 -= i5;
                i4 = this.aa * 889727047;
                i7 += i5;
                i6 += i5;
                i11 = 0 + i5;
                i10 += i5;
            }
            if (i9 + i4 > this.ak * 579810681) {
                i4 = (i4 + i9) - (this.ak * 579810681);
                i9 -= i4;
                i11 += i4;
                i10 += i4;
            }
            if (i9 > 0 && i8 > 0) {
                df.ar(this.aj, flVar.aj, flVar.ac, i7, i6, i9, i8, i10, i11, (byte) -47);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.au(" + ')');
        }
    }

    public void di(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((1075116703 * this.ac) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (-1857728003 * this.aq) - i5;
            i8 -= i11;
            i5 = this.aq * -1857728003;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i5 + i8 > this.ao * -90244733) {
            i11 = i8 - ((i5 + i8) - (-90244733 * this.ao));
        } else {
            i11 = i8;
        }
        if (i4 < this.aa * 889727047) {
            int i12 = (this.aa * 889727047) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = this.aa * 889727047;
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
        if (i6 + i10 > this.ak * 579810681) {
            i9 = (i10 + i6) - (this.ak * 579810681);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            df.ar(this.aj, flVar.aj, flVar.ac, i5, i3, i10, i11, i9, i4, (byte) -1);
        }
    }

    public void dv(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((454014741 * this.ac) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (473372443 * this.ac) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (-1857728003 * this.aq) - i5;
            i8 -= i11;
            i5 = this.aq * 1218459260;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ac * -1810596660);
        }
        if (i5 + i8 > this.ao * -948407571) {
            i11 = i8 - ((i5 + i8) - (-1769561169 * this.ao));
        } else {
            i11 = i8;
        }
        if (i4 < this.aa * 889727047) {
            int i12 = (this.aa * 889727047) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = this.aa * 413534361;
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
        if (i6 + i10 > this.ak * 800398653) {
            i9 = (i10 + i6) - (this.ak * 579810681);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            df.ar(this.aj, flVar.aj, flVar.ac, i5, i3, i10, i11, i9, i4, (byte) -12);
        }
    }

    public void dw(fl flVar, int i, int i2) {
        int i3;
        int i4 = i + flVar.ao;
        int i5 = i2 + flVar.aa;
        int i6 = i4 + ((1075116703 * this.ac) * i5);
        int i7 = 0;
        int i8 = flVar.aq;
        int i9 = flVar.an;
        int i10 = (1075116703 * this.ac) - i9;
        if (i5 < -1857728003 * this.aq) {
            int i11 = (-1857728003 * this.aq) - i5;
            i8 -= i11;
            i5 = this.aq * -1857728003;
            i7 = 0 + (i11 * i9);
            i6 += i11 * (this.ac * 1075116703);
        }
        if (i5 + i8 > this.ao * -90244733) {
            i11 = i8 - ((i5 + i8) - (-90244733 * this.ao));
        } else {
            i11 = i8;
        }
        if (i4 < this.aa * 889727047) {
            int i12 = (this.aa * 889727047) - i4;
            i5 = i9 - i12;
            i9 = i7 + i12;
            i8 = 0 + i12;
            i7 = i10 + i12;
            i3 = i6 + i12;
            i10 = this.aa * 889727047;
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
        if (i6 + i10 > this.ak * 579810681) {
            i9 = (i10 + i6) - (this.ak * 579810681);
            i10 = i6 - i9;
            i4 = i8 + i9;
            i9 += i7;
        } else {
            i4 = i8;
            i9 = i7;
            i10 = i6;
        }
        if (i10 > 0 && i11 > 0) {
            df.ar(this.aj, flVar.aj, flVar.ac, i5, i3, i10, i11, i9, i4, (byte) 75);
        }
    }

    static void du(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = -i4;
        int i10 = i2;
        int i11 = i;
        while (i9 < 0) {
            int i12 = i7;
            while (i12 < 0) {
                int i13 = i11 + 1;
                byte b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i10 + 1;
                    iArr[i10] = iArr2[b & 1557814369];
                } else {
                    i11 = i10 + 1;
                }
                int i14 = i13 + 1;
                byte b2 = bArr[i13];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & -789317378];
                    i11 = i10;
                } else {
                    i11++;
                }
                int i15 = i14 + 1;
                b2 = bArr[i14];
                if (b2 != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b2 & 1322910012];
                    i11 = i10;
                } else {
                    i11++;
                }
                i13 = i15 + 1;
                b = bArr[i15];
                if (b != (byte) 0) {
                    i10 = i11 + 1;
                    iArr[i11] = iArr2[b & 1885951086];
                    i11 = i10;
                } else {
                    i11++;
                }
                i12++;
                i10 = i11;
                i11 = i13;
            }
            i12 = i10;
            i10 = i8;
            while (i10 < 0) {
                i13 = i11 + 1;
                b = bArr[i11];
                if (b != (byte) 0) {
                    i11 = i12 + 1;
                    iArr[i12] = iArr2[b & 255];
                } else {
                    i11 = i12 + 1;
                }
                i10++;
                i12 = i11;
                i11 = i13;
            }
            i10 = i12 + i5;
            i9++;
            i11 += i6;
        }
    }

    public void av(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i6;
                int i7;
                int i8;
                int i9 = emVar.ac;
                int i10 = emVar.an;
                int i11 = 0;
                int i12 = 0;
                int i13 = emVar.aa;
                int i14 = emVar.ak;
                int i15 = (i13 << 16) / i3;
                int i16 = (i14 << 16) / i4;
                if (emVar.aq > 0) {
                    i6 = (((emVar.aq << 16) + i15) - 1) / i15;
                    i += i6;
                    i11 = 0 + ((i6 * i15) - (emVar.aq << 16));
                }
                if (emVar.ao > 0) {
                    i6 = (((emVar.ao << 16) + i16) - 1) / i16;
                    i2 += i6;
                    i12 = 0 + ((i6 * i16) - (emVar.ao << 16));
                }
                if (i9 < i13) {
                    i7 = ((((i9 << 16) - i11) + i15) - 1) / i15;
                } else {
                    i7 = i3;
                }
                if (i10 < i14) {
                    i8 = ((((i10 << 16) - i12) + i16) - 1) / i16;
                } else {
                    i8 = i4;
                }
                i6 = ((this.ac * 1075116703) * i2) + i;
                int i17 = (this.ac * 1075116703) - i7;
                if (i8 + i2 > -90244733 * this.ao) {
                    i8 -= (i2 + i8) - (this.ao * -90244733);
                }
                if (i2 < -1857728003 * this.aq) {
                    i10 = (-1857728003 * this.aq) - i2;
                    i8 -= i10;
                    i6 += (1075116703 * this.ac) * i10;
                    i12 += i10 * i16;
                }
                if (i7 + i > this.ak * 579810681) {
                    i10 = (i + i7) - (579810681 * this.ak);
                    i7 -= i10;
                    i17 += i10;
                }
                if (i < this.aa * 889727047) {
                    i10 = (889727047 * this.aa) - i;
                    i7 -= i10;
                    i6 += i10;
                    i11 += i10 * i15;
                    i17 += i10;
                }
                eg.ab(this.aj, emVar.aj, 0, i11, i12, i6, i17, i7, i8, i15, i16, i9, (byte) 2);
            } catch (Throwable e) {
                throw ei.ac(e, "fn.av(" + ')');
            }
        }
    }

    public void dq(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = emVar.ac;
            int i10 = emVar.an;
            int i11 = 0;
            int i12 = 0;
            int i13 = emVar.aa;
            int i14 = emVar.ak;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            if (emVar.aq > 0) {
                i5 = (((emVar.aq << 16) + i15) - 1) / i15;
                i += i5;
                i11 = 0 + ((i5 * i15) - (emVar.aq << 16));
            }
            if (emVar.ao > 0) {
                i5 = (((emVar.ao << 16) + i16) - 1) / i16;
                i2 += i5;
                i12 = 0 + ((i5 * i16) - (emVar.ao << 16));
            }
            if (i9 < i13) {
                i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
            } else {
                i5 = i3;
            }
            if (i10 < i14) {
                i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            }
            i10 = ((this.ac * 1075116703) * i2) + i;
            i13 = (this.ac * 1075116703) - i5;
            if (i4 + i2 > -90244733 * this.ao) {
                i4 -= (i2 + i4) - (this.ao * -90244733);
            }
            if (i2 < -1857728003 * this.aq) {
                i14 = (-1857728003 * this.aq) - i2;
                i6 = i4 - i14;
                i10 += (1075116703 * this.ac) * i14;
                i12 += i14 * i16;
            } else {
                i6 = i4;
            }
            if (i5 + i > this.ak * 579810681) {
                i14 = (i + i5) - (579810681 * this.ak);
                i5 -= i14;
                i13 += i14;
            }
            if (i < this.aa * 889727047) {
                i7 = (889727047 * this.aa) - i;
                i8 = i5 - i7;
                i14 = i10 + i7;
                i5 = i11 + (i7 * i15);
                i7 += i13;
            } else {
                i7 = i13;
                i14 = i10;
                i8 = i5;
                i5 = i11;
            }
            eg.ab(this.aj, emVar.aj, 0, i5, i12, i14, i7, i8, i6, i15, i16, i9, (byte) 2);
        }
    }

    static void el(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                int i16;
                int i17 = iArr2[(i15 >> 16) + i14];
                if (i17 != 0) {
                    i16 = i13 + 1;
                    iArr[i13] = i17;
                } else {
                    i16 = i13 + 1;
                }
                i12++;
                i15 += i8;
                i13 = i16;
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    static void ez(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                int i16;
                int i17 = iArr2[(i15 >> 16) + i14];
                if (i17 != 0) {
                    i16 = i13 + 1;
                    iArr[i13] = i17;
                } else {
                    i16 = i13 + 1;
                }
                i12++;
                i15 += i8;
                i13 = i16;
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    static void gr(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                int i16;
                int i17 = iArr2[(i15 >> 16) + i14];
                if (i17 != 0) {
                    i16 = i13 + 1;
                    iArr[i13] = i17;
                } else {
                    i16 = i13 + 1;
                }
                i12++;
                i15 += i8;
                i13 = i16;
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    public void ay(fl flVar, int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9 = flVar.an;
            int i10 = flVar.aq;
            int i11 = 0;
            int i12 = 0;
            int i13 = flVar.ak;
            int i14 = flVar.ap;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            if (flVar.ao > 0) {
                i6 = (((flVar.ao << 16) + i15) - 1) / i15;
                i += i6;
                i11 = 0 + ((i6 * i15) - (flVar.ao << 16));
            }
            if (flVar.aa > 0) {
                i6 = (((flVar.aa << 16) + i16) - 1) / i16;
                i2 += i6;
                i12 = 0 + ((i6 * i16) - (flVar.aa << 16));
            }
            if (i9 < i13) {
                i7 = ((((i9 << 16) - i11) + i15) - 1) / i15;
            } else {
                i7 = i3;
            }
            if (i10 < i14) {
                i8 = ((((i10 << 16) - i12) + i16) - 1) / i16;
            } else {
                i8 = i4;
            }
            i6 = ((this.ac * 1075116703) * i2) + i;
            int i17 = (1075116703 * this.ac) - i7;
            if (i8 + i2 > -90244733 * this.ao) {
                i8 -= (i8 + i2) - (-90244733 * this.ao);
            }
            if (i2 < -1857728003 * this.aq) {
                i10 = (-1857728003 * this.aq) - i2;
                i8 -= i10;
                i6 += (this.ac * 1075116703) * i10;
                i12 += i10 * i16;
            }
            if (i7 + i > this.ak * 579810681) {
                i10 = (i7 + i) - (this.ak * 579810681);
                i7 -= i10;
                i17 += i10;
            }
            if (i < this.aa * 889727047) {
                i10 = (889727047 * this.aa) - i;
                i7 -= i10;
                i6 += i10;
                i11 += i10 * i15;
                i17 += i10;
            }
            cr.bb(this.aj, flVar.aj, flVar.ac, i11, i12, i6, i17, i7, i8, i15, i16, i9, 2108566871);
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ay(" + ')');
        }
    }

    public void ee(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = flVar.an;
        int i10 = flVar.aq;
        int i11 = 0;
        int i12 = 0;
        int i13 = flVar.ak;
        int i14 = flVar.ap;
        int i15 = (i13 << 16) / i3;
        int i16 = (i14 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i15) - 1) / i15;
            i += i5;
            i11 = 0 + ((i5 * i15) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i16) - 1) / i16;
            i2 += i5;
            i12 = 0 + ((i5 * i16) - (flVar.aa << 16));
        }
        if (i9 < i13) {
            i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
        } else {
            i5 = i3;
        }
        if (i10 < i14) {
            i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
        }
        i10 = ((this.ac * -888296675) * i2) + i;
        i13 = (1946154543 * this.ac) - i5;
        if (i4 + i2 > -533118972 * this.ao) {
            i4 -= (i4 + i2) - (-90244733 * this.ao);
        }
        if (i2 < -2085929291 * this.aq) {
            i14 = (-2138087965 * this.aq) - i2;
            i6 = i4 - i14;
            i10 += (this.ac * -621681609) * i14;
            i12 += i14 * i16;
        } else {
            i6 = i4;
        }
        if (i5 + i > this.ak * 586657037) {
            i14 = (i5 + i) - (this.ak * -223177827);
            i5 -= i14;
            i13 += i14;
        }
        if (i < this.aa * -533997370) {
            i7 = (889727047 * this.aa) - i;
            i8 = i5 - i7;
            i14 = i10 + i7;
            i5 = i11 + (i7 * i15);
            i7 += i13;
        } else {
            i7 = i13;
            i14 = i10;
            i8 = i5;
            i5 = i11;
        }
        cr.bb(this.aj, flVar.aj, flVar.ac, i5, i12, i14, i7, i8, i6, i15, i16, i9, 2122537640);
    }

    public void em(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = flVar.an;
        int i10 = flVar.aq;
        int i11 = 0;
        int i12 = 0;
        int i13 = flVar.ak;
        int i14 = flVar.ap;
        int i15 = (i13 << 16) / i3;
        int i16 = (i14 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i15) - 1) / i15;
            i += i5;
            i11 = 0 + ((i5 * i15) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i16) - 1) / i16;
            i2 += i5;
            i12 = 0 + ((i5 * i16) - (flVar.aa << 16));
        }
        if (i9 < i13) {
            i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
        } else {
            i5 = i3;
        }
        if (i10 < i14) {
            i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
        }
        i10 = ((this.ac * 1075116703) * i2) + i;
        i13 = (1075116703 * this.ac) - i5;
        if (i4 + i2 > -90244733 * this.ao) {
            i4 -= (i4 + i2) - (-90244733 * this.ao);
        }
        if (i2 < -1857728003 * this.aq) {
            i14 = (-1857728003 * this.aq) - i2;
            i6 = i4 - i14;
            i10 += (this.ac * 1075116703) * i14;
            i12 += i14 * i16;
        } else {
            i6 = i4;
        }
        if (i5 + i > this.ak * 579810681) {
            i14 = (i5 + i) - (this.ak * 579810681);
            i5 -= i14;
            i13 += i14;
        }
        if (i < this.aa * 889727047) {
            i7 = (889727047 * this.aa) - i;
            i8 = i5 - i7;
            i14 = i10 + i7;
            i5 = i11 + (i7 * i15);
            i7 += i13;
        } else {
            i7 = i13;
            i14 = i10;
            i8 = i5;
            i5 = i11;
        }
        cr.bb(this.aj, flVar.aj, flVar.ac, i5, i12, i14, i7, i8, i6, i15, i16, i9, 2057494829);
    }

    public void ew(fl flVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = flVar.an;
        int i10 = flVar.aq;
        int i11 = 0;
        int i12 = 0;
        int i13 = flVar.ak;
        int i14 = flVar.ap;
        int i15 = (i13 << 16) / i3;
        int i16 = (i14 << 16) / i4;
        if (flVar.ao > 0) {
            i5 = (((flVar.ao << 16) + i15) - 1) / i15;
            i += i5;
            i11 = 0 + ((i5 * i15) - (flVar.ao << 16));
        }
        if (flVar.aa > 0) {
            i5 = (((flVar.aa << 16) + i16) - 1) / i16;
            i2 += i5;
            i12 = 0 + ((i5 * i16) - (flVar.aa << 16));
        }
        if (i9 < i13) {
            i5 = ((((i9 << 16) - i11) + i15) - 1) / i15;
        } else {
            i5 = i3;
        }
        if (i10 < i14) {
            i4 = ((((i10 << 16) - i12) + i16) - 1) / i16;
        }
        i10 = ((this.ac * 1075116703) * i2) + i;
        i13 = (1075116703 * this.ac) - i5;
        if (i4 + i2 > -90244733 * this.ao) {
            i4 -= (i4 + i2) - (-90244733 * this.ao);
        }
        if (i2 < -1857728003 * this.aq) {
            i14 = (-1857728003 * this.aq) - i2;
            i6 = i4 - i14;
            i10 += (this.ac * 1075116703) * i14;
            i12 += i14 * i16;
        } else {
            i6 = i4;
        }
        if (i5 + i > this.ak * 579810681) {
            i14 = (i5 + i) - (this.ak * 579810681);
            i5 -= i14;
            i13 += i14;
        }
        if (i < this.aa * 889727047) {
            i7 = (889727047 * this.aa) - i;
            i8 = i5 - i7;
            i14 = i10 + i7;
            i5 = i11 + (i7 * i15);
            i7 += i13;
        } else {
            i7 = i13;
            i14 = i10;
            i8 = i5;
            i5 = i11;
        }
        cr.bb(this.aj, flVar.aj, flVar.ac, i5, i12, i14, i7, i8, i6, i15, i16, i9, 2086658220);
    }

    static void ga(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -i6;
        int i11 = i3;
        int i12 = i;
        while (i10 < 0) {
            int i13 = i9 * (i2 >> 16);
            int i14 = i12;
            i12 = i11;
            i11 = -i5;
            while (i11 < 0) {
                int i15;
                byte b = bArr[(i14 >> 16) + i13];
                if (b != (byte) 0) {
                    i15 = i12 + 1;
                    iArr[i12] = iArr2[b & 255];
                } else {
                    i15 = i12 + 1;
                }
                i11++;
                i14 += i7;
                i12 = i15;
            }
            i2 += i8;
            i11 = i12 + i4;
            i10++;
            i12 = i;
        }
    }

    static void gb(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -i6;
        int i11 = i3;
        int i12 = i;
        while (i10 < 0) {
            int i13 = i9 * (i2 >> 16);
            int i14 = i12;
            i12 = i11;
            i11 = -i5;
            while (i11 < 0) {
                int i15;
                byte b = bArr[(i14 >> 16) + i13];
                if (b != (byte) 0) {
                    i15 = i12 + 1;
                    iArr[i12] = iArr2[b & 255];
                } else {
                    i15 = i12 + 1;
                }
                i11++;
                i14 += i7;
                i12 = i15;
            }
            i2 += i8;
            i11 = i12 + i4;
            i10++;
            i12 = i;
        }
    }

    static void gu(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -i6;
        int i11 = i3;
        int i12 = i;
        while (i10 < 0) {
            int i13 = i9 * (i2 >> 16);
            int i14 = i12;
            i12 = i11;
            i11 = -i5;
            while (i11 < 0) {
                int i15;
                byte b = bArr[(i14 >> 16) + i13];
                if (b != (byte) 0) {
                    i15 = i12 + 1;
                    iArr[i12] = iArr2[b & 255];
                } else {
                    i15 = i12 + 1;
                }
                i11++;
                i14 += i7;
                i12 = i15;
            }
            i2 += i8;
            i11 = i12 + i4;
            i10++;
            i12 = i;
        }
    }

    public void ag(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 >= 255) {
            try {
                ax(emVar, i, i2, 1231133277);
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "fn.ag(" + ')');
            }
        }
        int i6 = i + emVar.aq;
        int i7 = i2 + emVar.ao;
        int i8 = ((1075116703 * this.ac) * i7) + i6;
        int i9 = 0;
        int i10 = emVar.an;
        int i11 = emVar.ac;
        int i12 = (this.ac * 1075116703) - i11;
        int i13 = 0;
        if (i7 < this.aq * -1857728003) {
            int i14 = (-1857728003 * this.aq) - i7;
            i10 -= i14;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i14);
            i8 += i14 * (this.ac * 1075116703);
        }
        if (i7 + i10 > -90244733 * this.ao) {
            i14 = i10 - ((i7 + i10) - (this.ao * -90244733));
        } else {
            i14 = i10;
        }
        if (i6 < this.aa * 889727047) {
            i10 = (this.aa * 889727047) - i6;
            i11 -= i10;
            i6 = 889727047 * this.aa;
            i9 += i10;
            i8 += i10;
            i13 = 0 + i10;
            i12 += i10;
        }
        if (i11 + i6 > this.ak * 579810681) {
            i6 = (i6 + i11) - (this.ak * 579810681);
            i11 -= i6;
            i12 += i6;
            i6 = i13 + i6;
            i10 = i12;
            i7 = i11;
        } else {
            i6 = i13;
            i10 = i12;
            i7 = i11;
        }
        if (i7 <= 0) {
            return;
        }
        if (i14 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            i13 = 255 - i3;
            int i15 = (((i13 * (65280 & i4)) & 16711680) | (((16711935 & i4) * i13) & -16711936)) >>> 8;
            for (i11 = -i14; i11 < 0; i11++) {
                i13 = i9;
                i9 = i8;
                i8 = -i7;
                while (i8 < 0) {
                    i12 = i13 + 1;
                    i13 = iArr2[i13];
                    if (i13 != 0) {
                        int i16 = 16711680 & ((i13 & 65280) * i3);
                        i13 = i9 + 1;
                        iArr[i9] = ((((((16711935 & i13) * i3) & -16711936) | i16) >>> 8) + i15) | -16777216;
                    } else {
                        i13 = i9 + 1;
                    }
                    i8++;
                    i9 = i13;
                    i13 = i12;
                }
                i8 = i9 + i10;
                i9 = i13 + i6;
            }
        }
    }

    public void eg(em emVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
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
        if (i7 < this.aq * -1857728003) {
            int i13 = (-1857728003 * this.aq) - i7;
            i10 -= i13;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (this.ac * 1075116703);
        }
        if (i7 + i10 > -90244733 * this.ao) {
            i10 -= (i7 + i10) - (this.ao * -90244733);
        }
        if (i6 < this.aa * 889727047) {
            int i14 = (this.aa * 889727047) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i6 = i8 + i14;
            i9 = 0 + i14;
            i8 = i12 + i14;
            i5 = i11;
            i12 = i6;
            i11 = 889727047 * this.aa;
        } else {
            i7 = i11;
            i11 = i6;
            i5 = i9;
            i9 = 0;
            int i15 = i8;
            i8 = i12;
            i12 = i15;
        }
        if (i7 + i11 > this.ak * 579810681) {
            i11 = (i11 + i7) - (this.ak * 579810681);
            i7 -= i11;
            i8 += i11;
            i11 = i9 + i11;
            i6 = i8;
            i13 = i7;
        } else {
            i11 = i9;
            i6 = i8;
            i13 = i7;
        }
        if (i13 <= 0) {
            return;
        }
        if (i10 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            i9 = 255 - i3;
            int i16 = (((i9 * (65280 & i4)) & 16711680) | (((16711935 & i4) * i9) & -16711936)) >>> 8;
            i9 = i12;
            i8 = i5;
            for (i5 = -i10; i5 < 0; i5++) {
                i10 = i8;
                i8 = i9;
                i9 = -i13;
                while (i9 < 0) {
                    i7 = i10 + 1;
                    i10 = iArr2[i10];
                    if (i10 != 0) {
                        int i17 = 16711680 & ((i10 & 65280) * i3);
                        i10 = i8 + 1;
                        iArr[i8] = ((((((16711935 & i10) * i3) & -16711936) | i17) >>> 8) + i16) | -16777216;
                    } else {
                        i10 = i8 + 1;
                    }
                    i9++;
                    i8 = i10;
                    i10 = i7;
                }
                i9 = i8 + i6;
                i8 = i10 + i11;
            }
        }
    }

    public void eo(em emVar, int i, int i2, int i3, int i4) {
        if (i3 >= 1275555178) {
            ax(emVar, i, i2, 1231133277);
            return;
        }
        int i5;
        int i6 = i + emVar.aq;
        int i7 = i2 + emVar.ao;
        int i8 = ((179384661 * this.ac) * i7) + i6;
        int i9 = 0;
        int i10 = emVar.an;
        int i11 = emVar.ac;
        int i12 = (this.ac * 1075116703) - i11;
        if (i7 < this.aq * -1544019932) {
            int i13 = (-1857728003 * this.aq) - i7;
            i10 -= i13;
            i7 = -1857728003 * this.aq;
            i9 = 0 + (i11 * i13);
            i8 += i13 * (this.ac * -244939598);
        }
        if (i7 + i10 > -90244733 * this.ao) {
            i10 -= (i7 + i10) - (this.ao * 135978528);
        }
        if (i6 < this.aa * 889727047) {
            int i14 = (this.aa * -2006454168) - i6;
            i7 = i11 - i14;
            i11 = i9 + i14;
            i6 = i8 + i14;
            i9 = 0 + i14;
            i8 = i12 + i14;
            i5 = i11;
            i12 = i6;
            i11 = 113591464 * this.aa;
        } else {
            i7 = i11;
            i11 = i6;
            i5 = i9;
            i9 = 0;
            int i15 = i8;
            i8 = i12;
            i12 = i15;
        }
        if (i7 + i11 > this.ak * -806334333) {
            i11 = (i11 + i7) - (this.ak * 579810681);
            i7 -= i11;
            i8 += i11;
            i11 = i9 + i11;
            i6 = i8;
            i13 = i7;
        } else {
            i11 = i9;
            i6 = i8;
            i13 = i7;
        }
        if (i13 <= 0) {
            return;
        }
        if (i10 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            i9 = 255 - i3;
            int i16 = (((i9 * (65280 & i4)) & -189378888) | (((1068024498 & i4) * i9) & -16711936)) >>> 8;
            i9 = i12;
            i8 = i5;
            for (i5 = -i10; i5 < 0; i5++) {
                i10 = i8;
                i8 = i9;
                i9 = -i13;
                while (i9 < 0) {
                    i7 = i10 + 1;
                    i10 = iArr2[i10];
                    if (i10 != 0) {
                        int i17 = 2038756538 & ((i10 & -1016067098) * i3);
                        i10 = i8 + 1;
                        iArr[i8] = ((((((-1443305539 & i10) * i3) & -16711936) | i17) >>> 8) + i16) | -548434880;
                    } else {
                        i10 = i8 + 1;
                    }
                    i9++;
                    i8 = i10;
                    i10 = i7;
                }
                i9 = i8 + i6;
                i8 = i10 + i11;
            }
        }
    }

    public void ad(em emVar, int i, int i2, int i3, int i4) {
        try {
            int i5;
            int i6 = emVar.aq + i;
            int i7 = emVar.ao + i2;
            int i8 = i6 + ((1075116703 * this.ac) * i7);
            int i9 = 0;
            int i10 = emVar.an;
            int i11 = emVar.ac;
            int i12 = (this.ac * 1075116703) - i11;
            int i13 = 0;
            if (i7 < -1857728003 * this.aq) {
                i5 = (this.aq * -1857728003) - i7;
                i10 -= i5;
                i7 = this.aq * -1857728003;
                i9 = 0 + (i5 * i11);
                i8 += i5 * (this.ac * 1075116703);
            }
            if (i7 + i10 > -90244733 * this.ao) {
                i10 -= (i7 + i10) - (this.ao * -90244733);
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
            if (i6 + i11 > this.ak * 579810681) {
                i6 = (i6 + i11) - (this.ak * 579810681);
                i11 -= i6;
                i13 += i6;
                i12 += i6;
            }
            if (i11 > 0 && i10 > 0) {
                int[] iArr = this.aj;
                int[] iArr2 = emVar.aj;
                if (i3 >= 255) {
                    hq.af(iArr, iArr2, 0, i9, i8, i11, i10, i12, i13, -653138024);
                    return;
                }
                int i14 = i3 << 24;
                int i15 = 255 - i3;
                int i16 = i8;
                i8 = i9;
                i9 = i16;
                for (int i17 = -i10; i17 < 0; i17++) {
                    i5 = i8;
                    i8 = i9;
                    i9 = -i11;
                    while (i9 < 0) {
                        i10 = i5 + 1;
                        int i18 = iArr2[i5];
                        if (i18 != 0) {
                            int i19 = iArr[i8];
                            if (i19 == 0) {
                                i5 = i8 + 1;
                                iArr[i8] = (i18 & 16777215) | i14;
                            } else {
                                i5 = i8 + 1;
                                iArr[i8] = ((((((i18 & 16711935) * i3) + ((i19 & 16711935) * i15)) & -16711936) + ((((65280 & i18) * i3) + ((65280 & i19) * i15)) & 16711680)) >>> 8) | (-16777216 & (i19 | i14));
                            }
                        } else {
                            i5 = i8 + 1;
                        }
                        i9++;
                        i8 = i5;
                        i5 = i10;
                    }
                    i9 = i8 + i12;
                    i8 = i5 + i13;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.ad(" + ')');
        }
    }

    public void dj(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((1075116703 * this.ac) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 1774629277) - i10;
        if (i6 < -1857728003 * this.aq) {
            int i12 = (this.aq * -1857728003) - i6;
            i9 -= i12;
            i6 = this.aq * -1857728003;
            i8 = 0 + (i12 * i10);
            i7 += i12 * (this.ac * 1075116703);
        }
        if (i6 + i9 > 2128703896 * this.ao) {
            i12 = i9 - ((i6 + i9) - (this.ao * -90244733));
        } else {
            i12 = i9;
        }
        if (i5 < -340254645 * this.aa) {
            int i13 = (this.aa * 889727047) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = 889727047 * this.aa;
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
        if (i11 + i7 > this.ak * 579810681) {
            i10 = (i11 + i7) - (this.ak * -1211348788);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            if (i3 >= 255) {
                hq.af(iArr, iArr2, 0, i6, i4, i11, i12, i10, i5, 177038349);
                return;
            }
            int i14 = i3 << 24;
            int i15 = 255 - i3;
            int i16 = i4;
            i4 = i6;
            i6 = i16;
            for (i13 = -i12; i13 < 0; i13++) {
                i7 = i4;
                i4 = i6;
                i6 = -i11;
                while (i6 < 0) {
                    i12 = i7 + 1;
                    int i17 = iArr2[i7];
                    if (i17 != 0) {
                        int i18 = iArr[i4];
                        if (i18 == 0) {
                            i7 = i4 + 1;
                            iArr[i4] = (i17 & -1341209148) | i14;
                        } else {
                            i7 = i4 + 1;
                            iArr[i4] = ((((((i17 & -1571818337) * i3) + ((i18 & -1087838615) * i15)) & -16711936) + ((((1644641119 & i17) * i3) + ((65280 & i18) * i15)) & 1970217669)) >>> 8) | (-16777216 & (i18 | i14));
                        }
                    } else {
                        i7 = i4 + 1;
                    }
                    i6++;
                    i4 = i7;
                    i7 = i12;
                }
                i6 = i4 + i10;
                i4 = i7 + i5;
            }
        }
    }

    public void dm(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((1075116703 * this.ac) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 1075116703) - i10;
        if (i6 < -1857728003 * this.aq) {
            int i12 = (this.aq * -1857728003) - i6;
            i9 -= i12;
            i6 = this.aq * -1857728003;
            i8 = 0 + (i12 * i10);
            i7 += i12 * (this.ac * 1075116703);
        }
        if (i6 + i9 > -90244733 * this.ao) {
            i12 = i9 - ((i6 + i9) - (this.ao * -90244733));
        } else {
            i12 = i9;
        }
        if (i5 < 889727047 * this.aa) {
            int i13 = (this.aa * 889727047) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = 889727047 * this.aa;
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
        if (i11 + i7 > this.ak * 579810681) {
            i10 = (i11 + i7) - (this.ak * 579810681);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            if (i3 >= 255) {
                hq.af(iArr, iArr2, 0, i6, i4, i11, i12, i10, i5, -1892082587);
                return;
            }
            int i14 = i3 << 24;
            int i15 = 255 - i3;
            int i16 = i4;
            i4 = i6;
            i6 = i16;
            for (i13 = -i12; i13 < 0; i13++) {
                i7 = i4;
                i4 = i6;
                i6 = -i11;
                while (i6 < 0) {
                    i12 = i7 + 1;
                    int i17 = iArr2[i7];
                    if (i17 != 0) {
                        int i18 = iArr[i4];
                        if (i18 == 0) {
                            i7 = i4 + 1;
                            iArr[i4] = (i17 & 16777215) | i14;
                        } else {
                            i7 = i4 + 1;
                            iArr[i4] = ((((((i17 & 16711935) * i3) + ((i18 & 16711935) * i15)) & -16711936) + ((((65280 & i17) * i3) + ((65280 & i18) * i15)) & 16711680)) >>> 8) | (-16777216 & (i18 | i14));
                        }
                    } else {
                        i7 = i4 + 1;
                    }
                    i6++;
                    i4 = i7;
                    i7 = i12;
                }
                i6 = i4 + i10;
                i4 = i7 + i5;
            }
        }
    }

    public void dz(em emVar, int i, int i2, int i3) {
        int i4;
        int i5 = i + emVar.aq;
        int i6 = i2 + emVar.ao;
        int i7 = i5 + ((1075116703 * this.ac) * i6);
        int i8 = 0;
        int i9 = emVar.an;
        int i10 = emVar.ac;
        int i11 = (this.ac * 403333089) - i10;
        if (i6 < -1857728003 * this.aq) {
            int i12 = (this.aq * -1857728003) - i6;
            i9 -= i12;
            i6 = this.aq * 2114743201;
            i8 = 0 + (i12 * i10);
            i7 += i12 * (this.ac * 1075116703);
        }
        if (i6 + i9 > -90244733 * this.ao) {
            i12 = i9 - ((i6 + i9) - (this.ao * -90244733));
        } else {
            i12 = i9;
        }
        if (i5 < -1267359601 * this.aa) {
            int i13 = (this.aa * 317526450) - i5;
            i6 = i10 - i13;
            i10 = i8 + i13;
            i9 = 0 + i13;
            i8 = i11 + i13;
            i4 = i7 + i13;
            i11 = -1923058768 * this.aa;
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
        if (i11 + i7 > this.ak * -2058069235) {
            i10 = (i11 + i7) - (this.ak * 1904464874);
            i11 = i7 - i10;
            i5 = i9 + i10;
            i10 += i8;
        } else {
            i5 = i9;
            i10 = i8;
            i11 = i7;
        }
        if (i11 > 0 && i12 > 0) {
            int[] iArr = this.aj;
            int[] iArr2 = emVar.aj;
            if (i3 >= 255) {
                hq.af(iArr, iArr2, 0, i6, i4, i11, i12, i10, i5, -1807341384);
                return;
            }
            int i14 = i3 << 24;
            int i15 = -1900721465 - i3;
            int i16 = i4;
            i4 = i6;
            i6 = i16;
            for (i13 = -i12; i13 < 0; i13++) {
                i7 = i4;
                i4 = i6;
                i6 = -i11;
                while (i6 < 0) {
                    i12 = i7 + 1;
                    int i17 = iArr2[i7];
                    if (i17 != 0) {
                        int i18 = iArr[i4];
                        if (i18 == 0) {
                            i7 = i4 + 1;
                            iArr[i4] = (i17 & 1650336971) | i14;
                        } else {
                            i7 = i4 + 1;
                            iArr[i4] = ((((((i17 & 603080086) * i3) + ((i18 & -2035607426) * i15)) & -1848026621) + ((((65280 & i17) * i3) + ((-2090248992 & i18) * i15)) & 493919076)) >>> 8) | (-16777216 & (i18 | i14));
                        }
                    } else {
                        i7 = i4 + 1;
                    }
                    i6++;
                    i4 = i7;
                    i7 = i12;
                }
                i6 = i4 + i10;
                i4 = i7 + i5;
            }
        }
    }

    public void bp(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > 0 && i4 > 0) {
            try {
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
                    i7 = (((emVar.aq << 16) + i16) - 1) / i16;
                    i += i7;
                    i12 = 0 + ((i7 * i16) - (emVar.aq << 16));
                }
                if (emVar.ao > 0) {
                    i7 = (((emVar.ao << 16) + i17) - 1) / i17;
                    i2 += i7;
                    i13 = 0 + ((i7 * i17) - (emVar.ao << 16));
                }
                if (i10 < i14) {
                    i8 = ((((i10 << 16) - i12) + i16) - 1) / i16;
                } else {
                    i8 = i3;
                }
                if (i11 < i15) {
                    i9 = ((((i11 << 16) - i13) + i17) - 1) / i17;
                } else {
                    i9 = i4;
                }
                i7 = ((1075116703 * this.ac) * i2) + i;
                int i18 = (1075116703 * this.ac) - i8;
                if (i9 + i2 > this.ao * -90244733) {
                    i9 -= (i2 + i9) - (-90244733 * this.ao);
                }
                if (i2 < this.aq * -1857728003) {
                    i11 = (-1857728003 * this.aq) - i2;
                    i9 -= i11;
                    i7 += (this.ac * 1075116703) * i11;
                    i13 += i11 * i17;
                }
                if (i8 + i > 579810681 * this.ak) {
                    i11 = (i + i8) - (579810681 * this.ak);
                    i8 -= i11;
                    i18 += i11;
                }
                if (i < 889727047 * this.aa) {
                    i11 = (889727047 * this.aa) - i;
                    i8 -= i11;
                    i7 += i11;
                    i12 += i11 * i16;
                    i18 += i11;
                }
                cd.cd(this.aj, emVar.aj, 0, i12, i13, i7, i18, i8, i9, i16, i17, i10, i5, -1800508010);
            } catch (Throwable e) {
                throw ei.ac(e, "fn.bp(" + ')');
            }
        }
    }

    public void dg(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
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
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((1075116703 * this.ac) * i2) + i;
            i14 = (1075116703 * this.ac) - i6;
            if (i4 + i2 > this.ao * -90244733) {
                i4 -= (i2 + i4) - (-1662266455 * this.ao);
            }
            if (i2 < this.aq * -1857728003) {
                i15 = (1429862863 * this.aq) - i2;
                i7 = i4 - i15;
                i11 += (this.ac * 1075116703) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i6 + i > 579810681 * this.ak) {
                i15 = (i + i6) - (-596388923 * this.ak);
                i6 -= i15;
                i14 += i15;
            }
            if (i < 889727047 * this.aa) {
                i8 = (889727047 * this.aa) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            cd.cd(this.aj, emVar.aj, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, i5, -1747549245);
        }
    }

    public void dn(em emVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
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
                i4 = ((((i11 << 16) - i13) + i17) - 1) / i17;
            }
            i11 = ((1075116703 * this.ac) * i2) + i;
            i14 = (1075116703 * this.ac) - i6;
            if (i4 + i2 > this.ao * -90244733) {
                i4 -= (i2 + i4) - (-90244733 * this.ao);
            }
            if (i2 < this.aq * -1857728003) {
                i15 = (-1857728003 * this.aq) - i2;
                i7 = i4 - i15;
                i11 += (this.ac * 1075116703) * i15;
                i13 += i15 * i17;
            } else {
                i7 = i4;
            }
            if (i6 + i > 579810681 * this.ak) {
                i15 = (i + i6) - (579810681 * this.ak);
                i6 -= i15;
                i14 += i15;
            }
            if (i < 889727047 * this.aa) {
                i8 = (889727047 * this.aa) - i;
                i9 = i6 - i8;
                i15 = i11 + i8;
                i6 = i12 + (i8 * i16);
                i8 += i14;
            } else {
                i8 = i14;
                i15 = i11;
                i9 = i6;
                i6 = i12;
            }
            cd.cd(this.aj, emVar.aj, 0, i6, i13, i15, i8, i9, i7, i16, i17, i10, i5, -2132748283);
        }
    }

    static void gd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i11 >= 1999507964) {
            eg.ab(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) 2);
            return;
        }
        int i12 = 255 - i11;
        int i13 = i11 << 24;
        int i14 = -i7;
        int i15 = i4;
        int i16 = i2;
        while (i14 < 0) {
            int i17 = (i3 >> 16) * i10;
            int i18 = i16;
            i16 = i15;
            i15 = -i6;
            while (i15 < 0) {
                int i19;
                int i20 = iArr2[(i18 >> 16) + i17];
                if (i20 != 0) {
                    int i21 = iArr[i16];
                    if (i21 == 0) {
                        i19 = i16 + 1;
                        iArr[i16] = (i20 & 16777215) | i13;
                    } else {
                        i19 = i16 + 1;
                        iArr[i16] = ((((((i20 & 1388666914) * i11) + ((i21 & -1707176816) * i12)) & -16711936) + ((((-1580459688 & i21) * i12) + ((2017668533 & i20) * i11)) & 1959787051)) >>> 8) | (374705282 & (i21 | i13));
                    }
                } else {
                    i19 = i16 + 1;
                }
                i15++;
                i18 += i8;
                i16 = i19;
            }
            i3 += i9;
            i15 = i16 + i5;
            i14++;
            i16 = i2;
        }
    }

    static void gk(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i11 >= 255) {
            eg.ab(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) 2);
            return;
        }
        int i12 = -384722918 - i11;
        int i13 = i11 << 24;
        int i14 = -i7;
        int i15 = i4;
        int i16 = i2;
        while (i14 < 0) {
            int i17 = (i3 >> 16) * i10;
            int i18 = i16;
            i16 = i15;
            i15 = -i6;
            while (i15 < 0) {
                int i19;
                int i20 = iArr2[(i18 >> 16) + i17];
                if (i20 != 0) {
                    int i21 = iArr[i16];
                    if (i21 == 0) {
                        i19 = i16 + 1;
                        iArr[i16] = (i20 & 16777215) | i13;
                    } else {
                        i19 = i16 + 1;
                        iArr[i16] = ((((((i20 & 16711935) * i11) + ((i21 & 1064194112) * i12)) & -16711936) + ((((1191162493 & i21) * i12) + ((65280 & i20) * i11)) & 644371306)) >>> 8) | (-924674738 & (i21 | i13));
                    }
                } else {
                    i19 = i16 + 1;
                }
                i15++;
                i18 += i8;
                i16 = i19;
            }
            i3 += i9;
            i15 = i16 + i5;
            i14++;
            i16 = i2;
        }
    }

    public void bm(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, byte b) {
        int i7 = i2 < 0 ? -i2 : 0;
        try {
            int i8;
            int i9;
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
            int i10 = ((i + i3) + i9) + (((i2 + i4) + i7) * (this.ac * 1075116703));
            int i11 = i7;
            i7 = i2 + i7;
            while (i11 < i8) {
                int i12;
                int i13;
                int i14 = iArr[i7];
                int i15 = i7 + 1;
                i7 = iArr2[i7];
                if (i < i14) {
                    i12 = i14 - i;
                    i13 = (i12 - i9) + i10;
                } else {
                    i12 = i9;
                    i13 = i10;
                }
                if (emVar.ac + i <= i7 + i14) {
                    i7 = emVar.ac;
                } else {
                    i7 = (i7 + i14) - i;
                }
                i14 = i13;
                i13 = i12;
                while (i13 < i7) {
                    int i16 = emVar.aj[(emVar.ac * i11) + i13];
                    if (i16 != 0) {
                        i12 = i14 + 1;
                        this.aj[i14] = i16;
                    } else {
                        i12 = i14 + 1;
                    }
                    i13++;
                    i14 = i12;
                }
                i10 += 1075116703 * this.ac;
                i11++;
                i7 = i15;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.bm(" + ')');
        }
    }

    public void dc(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        int i8 = emVar.an + i2 <= i6 ? emVar.an : i6 - i2;
        int i9 = i < 0 ? -i : 0;
        int i10 = (((i2 + i4) + i7) * (this.ac * 1075116703)) + ((i + i3) + i9);
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i8) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i9) + i10;
            } else {
                i7 = i9;
                i12 = i10;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = emVar.aj[(emVar.ac * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += 1075116703 * this.ac;
            i11++;
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
        if (emVar.an + i2 <= i6) {
            i8 = emVar.an;
        } else {
            i8 = i6 - i2;
        }
        int i9 = i < 0 ? -i : 0;
        int i10 = (((i2 + i4) + i7) * (this.ac * 1075116703)) + ((i + i3) + i9);
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i8) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i9) + i10;
            } else {
                i7 = i9;
                i12 = i10;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = emVar.aj[(emVar.ac * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += 1075116703 * this.ac;
            i11++;
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
        if (i < 0) {
            i8 = -i;
        } else {
            i8 = 0;
        }
        int i10 = (((i2 + i4) + i7) * (this.ac * 1075116703)) + ((i + i3) + i8);
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i9) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i8) + i10;
            } else {
                i7 = i8;
                i12 = i10;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = emVar.aj[(emVar.ac * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += 1075116703 * this.ac;
            i11++;
            i7 = i14;
        }
    }

    public void ei(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8;
        if (i2 < 0) {
            i7 = -i2;
        } else {
            i7 = 0;
        }
        int i9 = emVar.an + i2 <= i6 ? emVar.an : i6 - i2;
        if (i < 0) {
            i8 = -i;
        } else {
            i8 = 0;
        }
        int i10 = (((i2 + i4) + i7) * (this.ac * 1075116703)) + ((i + i3) + i8);
        int i11 = i7;
        i7 = i2 + i7;
        while (i11 < i9) {
            int i12;
            int i13 = iArr[i7];
            int i14 = i7 + 1;
            int i15 = iArr2[i7];
            if (i < i13) {
                i7 = i13 - i;
                i12 = (i7 - i8) + i10;
            } else {
                i7 = i8;
                i12 = i10;
            }
            if (emVar.ac + i <= i15 + i13) {
                i13 = emVar.ac;
            } else {
                i13 = (i13 + i15) - i;
            }
            i15 = i12;
            i12 = i7;
            while (i12 < i13) {
                int i16 = emVar.aj[(emVar.ac * i11) + i12];
                if (i16 != 0) {
                    i7 = i15 + 1;
                    this.aj[i15] = i16;
                } else {
                    i7 = i15 + 1;
                }
                i12++;
                i15 = i7;
            }
            i10 += 1075116703 * this.ac;
            i11++;
            i7 = i14;
        }
    }

    public void bh(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        try {
            int i10 = (-i3) / 2;
            int i11 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i12 = ((cos * i10) + (sin * i11)) + (i5 << 16);
            int i13 = ((this.ac * 1075116703) * i2) + i;
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
                    this.aj[i12] = emVar.aj[(emVar.ac * (i10 >> 16)) + (i11 >> 16)];
                    i11 += cos;
                    i10 -= sin;
                    i17++;
                    i12 = i18;
                }
                i13 = (1075116703 * this.ac) + i13;
                i14 += cos;
                i15 += sin;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "fn.bh(" + ')');
        }
    }

    public void ep(em emVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(((double) i7) / 326.11d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(((double) i7) / 326.11d) * 65536.0d))) >> 8;
            int i11 = ((cos * i9) + (sin * i10)) + (i5 << 16);
            int i12 = ((this.ac * 863060175) * i2) + i;
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
                    this.aj[i11] = emVar.aj[(emVar.ac * (i9 >> 16)) + (i10 >> 16)];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (-913592694 * this.ac) + i12;
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
            int i11 = ((cos * i9) + (sin * i10)) + (i5 << 16);
            int i12 = ((this.ac * 876320566) * i2) + i;
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
                    this.aj[i11] = emVar.aj[(emVar.ac * (i9 >> 16)) + (i10 >> 16)];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (1075116703 * this.ac) + i12;
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
            int i11 = ((cos * i9) + (sin * i10)) + (i5 << 16);
            int i12 = ((this.ac * -88426710) * i2) + i;
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
                    this.aj[i11] = emVar.aj[(emVar.ac * (i9 >> 16)) + (i10 >> 16)];
                    i10 += cos;
                    i9 -= sin;
                    i16++;
                    i11 = i17;
                }
                i12 = (-853623206 * this.ac) + i12;
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
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i11 = ((sin * i10) + (i9 * cos)) + (i5 << 16);
            int i12 = ((i10 * cos) - (i9 * sin)) + (i6 << 16);
            int i13 = i + ((this.ac * 1075116703) * i2);
            for (int i14 = 0; i14 < i4; i14++) {
                i10 = i12;
                int i15 = i11;
                int i16 = i13;
                int i17 = -i3;
                while (i17 < 0) {
                    int i18 = emVar.aj[((i10 >> 16) * emVar.ac) + (i15 >> 16)];
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
                i13 += 1075116703 * this.ac;
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "fn.bt(" + ')');
        }
    }

    public void eh(em emVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = ((sin * i9) + (i8 * cos)) + (i5 << 16);
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((this.ac * -969489251) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = emVar.aj[((i9 >> 16) * emVar.ac) + (i14 >> 16)];
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
                i12 += 1075116703 * this.ac;
            }
        } catch (Exception e) {
        }
    }

    public void ej(em emVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        try {
            int i8 = (-i3) / 2;
            int i9 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i10 = ((sin * i9) + (i8 * cos)) + (i5 << 16);
            int i11 = ((i9 * cos) - (i8 * sin)) + (i6 << 16);
            int i12 = i + ((this.ac * 1075116703) * i2);
            for (int i13 = 0; i13 < i4; i13++) {
                i9 = i11;
                int i14 = i10;
                int i15 = i12;
                int i16 = -i3;
                while (i16 < 0) {
                    int i17 = emVar.aj[((i9 >> 16) * emVar.ac) + (i14 >> 16)];
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
                i12 += 1075116703 * this.ac;
            }
        } catch (Exception e) {
        }
    }

    public void br(em emVar, int i, int i2, int i3, int i4) {
        try {
            int i5 = emVar.aq + i;
            int i6 = emVar.ao + i2;
            int i7 = i5 + ((this.ac * 1075116703) * i6);
            int i8 = 0;
            int i9 = emVar.an;
            int i10 = emVar.ac;
            int i11 = (1075116703 * this.ac) - i10;
            int i12 = 0;
            if (i6 < this.aq * -1857728003) {
                int i13 = (-1857728003 * this.aq) - i6;
                i9 -= i13;
                i6 = this.aq * -1857728003;
                i8 = 0 + (i13 * i10);
                i7 += i13 * (this.ac * 1075116703);
            }
            if (i9 + i6 > this.ao * -90244733) {
                i9 -= (i6 + i9) - (this.ao * -90244733);
            }
            if (i5 < 889727047 * this.aa) {
                i6 = (this.aa * 889727047) - i5;
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
                cw(this.aj, emVar.aj, 0, i8, i7, 0, 0, i10, i9, i11, i12, i3, (byte) 1);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.br(" + ')');
        }
    }

    public void eb(em emVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + emVar.aq;
        int i9 = i2 + emVar.ao;
        int i10 = i8 + ((this.ac * 1075116703) * i9);
        int i11 = 0;
        int i12 = emVar.an;
        int i13 = emVar.ac;
        int i14 = (1075116703 * this.ac) - i13;
        if (i9 < this.aq * -1857728003) {
            int i15 = (-1857728003 * this.aq) - i9;
            i12 -= i15;
            i9 = this.aq * -1857728003;
            i11 = 0 + (i15 * i13);
            i10 += i15 * (this.ac * 1075116703);
        }
        if (i12 + i9 > this.ao * -90244733) {
            i4 = i12 - ((i9 + i12) - (this.ao * -90244733));
        } else {
            i4 = i12;
        }
        if (i8 < 889727047 * this.aa) {
            i15 = (this.aa * 889727047) - i8;
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
            cw(this.aj, emVar.aj, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, (byte) 1);
        }
    }

    public void ek(em emVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i + emVar.aq;
        int i9 = i2 + emVar.ao;
        int i10 = i8 + ((this.ac * 1075116703) * i9);
        int i11 = 0;
        int i12 = emVar.an;
        int i13 = emVar.ac;
        int i14 = (1075116703 * this.ac) - i13;
        if (i9 < this.aq * -1857728003) {
            int i15 = (-1857728003 * this.aq) - i9;
            i12 -= i15;
            i9 = this.aq * -1857728003;
            i11 = 0 + (i15 * i13);
            i10 += i15 * (this.ac * 1075116703);
        }
        if (i12 + i9 > this.ao * -90244733) {
            i4 = i12 - ((i9 + i12) - (this.ao * -90244733));
        } else {
            i4 = i12;
        }
        if (i8 < 889727047 * this.aa) {
            i15 = (this.aa * 889727047) - i8;
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
            cw(this.aj, emVar.aj, 0, i5, i14, 0, 0, i15, i4, i7, i6, i3, (byte) 1);
        }
    }

    void cw(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte b) {
        int i11 = i10 & 16711935;
        int i12 = (i10 >> 8) & 255;
        int i13 = i3;
        int i14 = i2;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                int i17 = i16 + 1;
                try {
                    int i18 = iArr2[i16];
                    if (i18 == 0) {
                        i16 = i14 + 1;
                    } else if ((65535 & i18) == ((16776960 & i18) >> 8)) {
                        int i19 = i18 & -16777216;
                        i18 &= 255;
                        i16 = i14 + 1;
                        iArr[i14] = (((i18 * i12) & 65280) + (((i11 * i18) >> 8) & 16711935)) | i19;
                    } else {
                        i16 = i14 + 1;
                        iArr[i14] = i18;
                    }
                    i13++;
                    i14 = i16;
                    i16 = i17;
                } catch (Throwable e) {
                    throw ei.ac(e, "fn.cw(" + ')');
                }
            }
            i13 = i14 + i8;
            i14 = i16 + i9;
        }
    }

    void ge(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & -227585993;
        int i12 = (i10 >> 8) & -1826732145;
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
                } else if ((261832892 & i18) == ((16776960 & i18) >> 8)) {
                    int i19 = i18 & -16777216;
                    i18 &= 255;
                    i16 = i14 + 1;
                    iArr[i14] = (((i18 * i12) & 65280) + (((i11 * i18) >> 8) & -2131690309)) | i19;
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

    void gt(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i10 & 16711935;
        int i12 = (i10 >> 8) & 969287516;
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
                } else if ((65535 & i18) == ((-783296405 & i18) >> 8)) {
                    int i19 = i18 & -16777216;
                    i18 &= 324895604;
                    i16 = i14 + 1;
                    iArr[i14] = (((i18 * i12) & 65280) + (((i11 * i18) >> 8) & 16711935)) | i19;
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
            try {
                int i7;
                int i8 = i - (emVar.aq << 4);
                int i9 = i2 - (emVar.ao << 4);
                double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
                int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
                int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
                int i10 = ((-i9) * floor) + ((-i8) * floor2);
                int i11 = ((-i9) * floor2) + ((-(-i8)) * floor);
                int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
                int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
                int i14 = (((emVar.an << 4) - i9) * floor) + ((-i8) * floor2);
                int i15 = ((-(-i8)) * floor) + (((emVar.an << 4) - i9) * floor2);
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
                i16 = (i13 >> 12) + i4;
                i13 = ((i10 >> 12) + i3) >> 4;
                i11 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
                i15 = i16 >> 4;
                floor = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
                if (i13 < 889727047 * this.aa) {
                    i13 = 889727047 * this.aa;
                }
                if (i11 > this.ak * 579810681) {
                    i11 = 579810681 * this.ak;
                }
                if (i15 < this.aq * -1857728003) {
                    i15 = -1857728003 * this.aq;
                }
                if (floor > this.ao * -90244733) {
                    floor = this.ao * -90244733;
                }
                i11 = i13 - i11;
                if (i11 < 0) {
                    floor = i15 - floor;
                    if (floor < 0) {
                        i16 = ((this.ac * 1075116703) * i15) + i13;
                        double d2 = 1.6777216E7d / ((double) i6);
                        floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                        int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                        int i17 = ((i13 << 4) + 8) - i3;
                        i15 = ((i15 << 4) + 8) - i4;
                        i12 = (i8 << 8) - ((i15 * floor2) >> 4);
                        i8 = ((i15 * floor3) >> 4) + (i9 << 8);
                        if (floor3 == 0) {
                            if (floor2 == 0) {
                                for (i14 = floor; i14 < 0; i14++) {
                                    if (i12 >= 0 && i8 >= 0 && i12 - (emVar.ac << 12) < 0 && i8 - (emVar.an << 12) < 0) {
                                        i15 = i11;
                                        i13 = i16;
                                        while (i15 < 0) {
                                            i10 = emVar.aj[((i8 >> 12) * emVar.ac) + (i12 >> 12)];
                                            if (i10 != 0) {
                                                floor = i13 + 1;
                                                this.aj[i13] = i10;
                                            } else {
                                                floor = i13 + 1;
                                            }
                                            i15++;
                                            i13 = floor;
                                        }
                                    }
                                    i16 += 1075116703 * this.ac;
                                }
                            } else if (floor2 < 0) {
                                i10 = i12;
                                i14 = i16;
                                i12 = floor;
                                while (i12 < 0) {
                                    i13 = i8 + ((i17 * floor2) >> 4);
                                    if (i10 >= 0 && i10 - (emVar.ac << 12) < 0) {
                                        floor = i13 - (emVar.an << 12);
                                        if (floor >= 0) {
                                            floor = (floor2 - floor) / floor2;
                                            i15 = i11 + floor;
                                            i13 += floor2 * floor;
                                            i16 = i14 + floor;
                                        } else {
                                            i15 = i11;
                                            i16 = i14;
                                        }
                                        floor = (i13 - floor2) / floor2;
                                        if (floor > i15) {
                                            i15 = floor;
                                        }
                                        while (i15 < 0) {
                                            i9 = emVar.aj[(i10 >> 12) + (emVar.ac * (i13 >> 12))];
                                            if (i9 != 0) {
                                                floor = i16 + 1;
                                                this.aj[i16] = i9;
                                            } else {
                                                floor = i16 + 1;
                                            }
                                            i13 += floor2;
                                            i15++;
                                            i16 = floor;
                                        }
                                    }
                                    floor = i12 + 1;
                                    i14 += 1075116703 * this.ac;
                                    i10 -= floor2;
                                    i12 = floor;
                                }
                            } else {
                                i10 = i12;
                                i14 = i16;
                                i12 = floor;
                                while (i12 < 0) {
                                    i13 = i8 + ((i17 * floor2) >> 4);
                                    if (i10 >= 0) {
                                        if (i10 - (emVar.ac << 12) < 0) {
                                            if (i13 < 0) {
                                                floor = ((floor2 - 1) - i13) / floor2;
                                                i15 = i11 + floor;
                                                i13 += floor2 * floor;
                                                i16 = i14 + floor;
                                            } else {
                                                i15 = i11;
                                                i16 = i14;
                                            }
                                            floor = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                            if (floor > i15) {
                                                i15 = floor;
                                            }
                                            while (i15 < 0) {
                                                i9 = emVar.aj[(i10 >> 12) + ((i13 >> 12) * emVar.ac)];
                                                if (i9 != 0) {
                                                    floor = i16 + 1;
                                                    this.aj[i16] = i9;
                                                } else {
                                                    floor = i16 + 1;
                                                }
                                                i13 += floor2;
                                                i15++;
                                                i16 = floor;
                                            }
                                        }
                                    }
                                    i14 += 1075116703 * this.ac;
                                    i12++;
                                    i10 -= floor2;
                                }
                            }
                        } else if (floor3 < 0) {
                            if (floor2 == 0) {
                                i14 = i16;
                                for (i10 = floor; i10 < 0; i10++) {
                                    i13 = ((i17 * floor3) >> 4) + i12;
                                    if (i8 >= 0) {
                                        if (i8 - (emVar.an << 12) < 0) {
                                            floor = i13 - (emVar.ac << 12);
                                            if (floor >= 0) {
                                                floor = (floor3 - floor) / floor3;
                                                i15 = i11 + floor;
                                                i13 += floor3 * floor;
                                                i16 = i14 + floor;
                                            } else {
                                                i15 = i11;
                                                i16 = i14;
                                            }
                                            floor = (i13 - floor3) / floor3;
                                            if (floor > i15) {
                                                i15 = floor;
                                            }
                                            while (i15 < 0) {
                                                i9 = emVar.aj[(i13 >> 12) + ((i8 >> 12) * emVar.ac)];
                                                if (i9 != 0) {
                                                    floor = i16 + 1;
                                                    this.aj[i16] = i9;
                                                } else {
                                                    floor = i16 + 1;
                                                }
                                                i13 += floor3;
                                                i15++;
                                                i16 = floor;
                                            }
                                        }
                                    }
                                    i8 += floor3;
                                    i14 += this.ac * 1075116703;
                                }
                            } else if (floor2 < 0) {
                                i10 = floor;
                                i9 = i12;
                                i12 = i16;
                                while (i10 < 0) {
                                    i16 = ((i17 * floor3) >> 4) + i9;
                                    i13 = i8 + ((i17 * floor2) >> 4);
                                    floor = i16 - (emVar.ac << 12);
                                    if (floor >= 0) {
                                        i15 = (floor3 - floor) / floor3;
                                        floor = i11 + i15;
                                        i16 += floor3 * i15;
                                        i13 += floor2 * i15;
                                        i14 = i12 + i15;
                                    } else {
                                        floor = i11;
                                        i14 = i12;
                                    }
                                    i15 = (i16 - floor3) / floor3;
                                    if (i15 <= floor) {
                                        i15 = floor;
                                    }
                                    floor = i13 - (emVar.an << 12);
                                    if (floor >= 0) {
                                        floor = (floor2 - floor) / floor2;
                                        i15 += floor;
                                        i16 += floor3 * floor;
                                        i13 += floor * floor2;
                                        i14 += floor;
                                    }
                                    floor = (i13 - floor2) / floor2;
                                    if (floor > i15) {
                                        i15 = floor;
                                    }
                                    while (i15 < 0) {
                                        r15 = emVar.aj[(i16 >> 12) + ((i13 >> 12) * emVar.ac)];
                                        if (r15 != 0) {
                                            floor = i14 + 1;
                                            this.aj[i14] = r15;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i16 += floor3;
                                        i13 += floor2;
                                        i15++;
                                        i14 = floor;
                                    }
                                    i8 += floor3;
                                    i12 += this.ac * 1075116703;
                                    i10++;
                                    i9 -= floor2;
                                }
                            } else {
                                i10 = floor;
                                i9 = i12;
                                i12 = i16;
                                while (i10 < 0) {
                                    i16 = ((i17 * floor3) >> 4) + i9;
                                    i13 = i8 + ((i17 * floor2) >> 4);
                                    floor = i16 - (emVar.ac << 12);
                                    if (floor >= 0) {
                                        i15 = (floor3 - floor) / floor3;
                                        floor = i11 + i15;
                                        i16 += i15 * floor3;
                                        i13 += floor2 * i15;
                                        i14 = i12 + i15;
                                    } else {
                                        floor = i11;
                                        i14 = i12;
                                    }
                                    i15 = (i16 - floor3) / floor3;
                                    if (i15 <= floor) {
                                        i15 = floor;
                                    }
                                    if (i13 < 0) {
                                        floor = ((floor2 - 1) - i13) / floor2;
                                        i15 += floor;
                                        i16 += floor * floor3;
                                        i13 += floor2 * floor;
                                        i14 += floor;
                                    }
                                    floor = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                    if (floor > i15) {
                                        i15 = floor;
                                    }
                                    while (i15 < 0) {
                                        r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                        if (r15 != 0) {
                                            floor = i14 + 1;
                                            this.aj[i14] = r15;
                                        } else {
                                            floor = i14 + 1;
                                        }
                                        i16 += floor3;
                                        i13 += floor2;
                                        i15++;
                                        i14 = floor;
                                    }
                                    i8 += floor3;
                                    i12 += this.ac * 1075116703;
                                    i10++;
                                    i9 -= floor2;
                                }
                            }
                        } else if (floor2 == 0) {
                            i14 = i16;
                            for (i10 = floor; i10 < 0; i10++) {
                                i13 = i12 + ((floor3 * i17) >> 4);
                                if (i8 >= 0) {
                                    if (i8 - (emVar.an << 12) < 0) {
                                        if (i13 < 0) {
                                            floor = ((floor3 - 1) - i13) / floor3;
                                            i15 = i11 + floor;
                                            i13 += floor3 * floor;
                                            i16 = i14 + floor;
                                        } else {
                                            i15 = i11;
                                            i16 = i14;
                                        }
                                        floor = (((i13 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                        if (floor > i15) {
                                            i15 = floor;
                                        }
                                        while (i15 < 0) {
                                            i9 = emVar.aj[(i13 >> 12) + ((i8 >> 12) * emVar.ac)];
                                            if (i9 != 0) {
                                                floor = i16 + 1;
                                                this.aj[i16] = i9;
                                            } else {
                                                floor = i16 + 1;
                                            }
                                            i13 += floor3;
                                            i15++;
                                            i16 = floor;
                                        }
                                    }
                                }
                                i8 += floor3;
                                i14 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i10 = floor;
                            i9 = i12;
                            i12 = i16;
                            while (i10 < 0) {
                                i16 = i9 + ((i17 * floor3) >> 4);
                                i13 = ((i17 * floor2) >> 4) + i8;
                                if (i16 < 0) {
                                    i15 = ((floor3 - 1) - i16) / floor3;
                                    floor = i11 + i15;
                                    i16 += i15 * floor3;
                                    i13 += floor2 * i15;
                                    i14 = i12 + i15;
                                } else {
                                    floor = i11;
                                    i14 = i12;
                                }
                                i15 = (((i16 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                if (i15 <= floor) {
                                    i15 = floor;
                                }
                                floor = i13 - (emVar.an << 12);
                                if (floor >= 0) {
                                    floor = (floor2 - floor) / floor2;
                                    i15 += floor;
                                    i16 += floor * floor3;
                                    i13 += floor * floor2;
                                    i14 += floor;
                                }
                                floor = (i13 - floor2) / floor2;
                                if (floor > i15) {
                                    i15 = floor;
                                }
                                while (i15 < 0) {
                                    r15 = emVar.aj[(i16 >> 12) + (emVar.ac * (i13 >> 12))];
                                    if (r15 != 0) {
                                        floor = i14 + 1;
                                        this.aj[i14] = r15;
                                    } else {
                                        floor = i14 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i15++;
                                    i14 = floor;
                                }
                                i8 += floor3;
                                i12 += this.ac * 1075116703;
                                i10++;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = floor;
                            i9 = i12;
                            i12 = i16;
                            while (i10 < 0) {
                                i16 = ((i17 * floor3) >> 4) + i9;
                                i13 = ((i17 * floor2) >> 4) + i8;
                                if (i16 < 0) {
                                    i15 = ((floor3 - 1) - i16) / floor3;
                                    floor = i11 + i15;
                                    i16 += i15 * floor3;
                                    i13 += i15 * floor2;
                                    i14 = i12 + i15;
                                } else {
                                    floor = i11;
                                    i14 = i12;
                                }
                                i15 = (((i16 + 1) - (emVar.ac << 12)) - floor3) / floor3;
                                if (i15 <= floor) {
                                    i15 = floor;
                                }
                                if (i13 < 0) {
                                    floor = ((floor2 - 1) - i13) / floor2;
                                    i15 += floor;
                                    i16 += floor * floor3;
                                    i13 += floor * floor2;
                                    i14 += floor;
                                }
                                floor = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
                                if (floor > i15) {
                                    i15 = floor;
                                }
                                while (i15 < 0) {
                                    r15 = emVar.aj[(emVar.ac * (i13 >> 12)) + (i16 >> 12)];
                                    if (r15 != 0) {
                                        floor = i14 + 1;
                                        this.aj[i14] = r15;
                                    } else {
                                        floor = i14 + 1;
                                    }
                                    i16 += floor3;
                                    i13 += floor2;
                                    i15++;
                                    i14 = floor;
                                }
                                i12 += 1075116703 * this.ac;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "fn.bu(" + ')');
            }
        }
    }

    void ed(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i9) * floor) + ((-i8) * floor2);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = (((emVar.an << 4) - i9) * floor) + ((-i8) * floor2);
            int i15 = ((-(-i8)) * floor) + (((emVar.an << 4) - i9) * floor2);
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
            if (floor < 889727047 * this.aa) {
                floor = 889727047 * this.aa;
            }
            if (i15 > this.ak * 579810681) {
                i15 = 579810681 * this.ak;
            }
            if (i13 < this.aq * -1857728003) {
                i13 = -1857728003 * this.aq;
            }
            if (i11 > this.ao * -90244733) {
                i11 = this.ao * -90244733;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i16 = ((this.ac * 1075116703) * i13) + floor;
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
                                        i8 = emVar.aj[((i12 >> 12) * emVar.ac) + (i14 >> 12)];
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
                                i16 += 1075116703 * this.ac;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i8 = i14;
                            while (i10 < 0) {
                                i13 = i12 + ((i17 * floor2) >> 4);
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
                                            i9 = emVar.aj[(i8 >> 12) + (emVar.ac * (i11 >> 12))];
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
                                i13 = i12 + ((i17 * floor2) >> 4);
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
                                            i9 = emVar.aj[(i8 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                                i13 = ((i17 * floor3) >> 4) + i14;
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
                                            i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                                i11 = ((i17 * floor3) >> 4) + i9;
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
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
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
                                    r15 = emVar.aj[(i16 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                                i11 = ((i17 * floor3) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += i16 * floor3;
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
                                    i11 += i12 * floor3;
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
                            i13 = i14 + ((floor3 * i17) >> 4);
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
                                        i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                                r15 = emVar.aj[(i16 >> 12) + (emVar.ac * (i11 >> 12))];
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
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += i16 * floor2;
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
                                i11 += i12 * floor3;
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

    void et(em emVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7;
            int i8 = i - (emVar.aq << 4);
            int i9 = i2 - (emVar.ao << 4);
            double d = ((double) (65535 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i9) * floor) + ((-i8) * floor2);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = (((emVar.an << 4) - i9) * floor) + ((-i8) * floor2);
            int i15 = ((-(-i8)) * floor) + (((emVar.an << 4) - i9) * floor2);
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
            if (floor < 889727047 * this.aa) {
                floor = 760031569 * this.aa;
            }
            if (i15 > this.ak * 579810681) {
                i15 = 579810681 * this.ak;
            }
            if (i13 < this.aq * -1857728003) {
                i13 = 1500896009 * this.aq;
            }
            if (i11 > this.ao * -90244733) {
                i11 = this.ao * -90244733;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i16 = ((this.ac * -993082842) * i13) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i13 << 4) + 8) - i4;
                    i8 = (i8 << 8) - ((floor * floor2) >> 4);
                    i14 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i12 = i11; i12 < 0; i12++) {
                                if (i8 >= 0) {
                                    if (i14 >= 0) {
                                        if (i8 - (emVar.ac << 12) < 0 && i14 - (emVar.an << 12) < 0) {
                                            i13 = i15;
                                            i11 = i16;
                                            while (i13 < 0) {
                                                i10 = emVar.aj[((i14 >> 12) * emVar.ac) + (i8 >> 12)];
                                                if (i10 != 0) {
                                                    floor = i11 + 1;
                                                    this.aj[i11] = i10;
                                                } else {
                                                    floor = i11 + 1;
                                                }
                                                i13++;
                                                i11 = floor;
                                            }
                                        }
                                    }
                                }
                                i16 += 1075116703 * this.ac;
                            }
                        } else if (floor2 < 0) {
                            for (i10 = i11; i10 < 0; i10++) {
                                i13 = i14 + ((i17 * floor2) >> 4);
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
                                        i12 = (i13 - floor2) / floor2;
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
                                            i9 = emVar.aj[(i8 >> 12) + (emVar.ac * (i11 >> 12))];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i8 -= floor2;
                                i16 += -924039024 * this.ac;
                            }
                        } else {
                            for (i10 = i11; i10 < 0; i10++) {
                                i13 = i14 + ((i17 * floor2) >> 4);
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
                                        i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
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
                                            i9 = emVar.aj[(i8 >> 12) + ((i11 >> 12) * emVar.ac)];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i8 -= floor2;
                                i16 += 1075116703 * this.ac;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i12 = i11;
                            i10 = i14;
                            while (i12 < 0) {
                                i13 = ((i17 * floor3) >> 4) + i8;
                                if (i10 >= 0) {
                                    if (i10 - (emVar.an << 12) < 0) {
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
                                            i9 = emVar.aj[(i11 >> 12) + ((i10 >> 12) * emVar.ac)];
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
                                i16 += this.ac * 1075116703;
                                i12++;
                                i10 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i9 = i8;
                            i8 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
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
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
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
                                    r15 = emVar.aj[(i16 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                            i9 = i8;
                            i8 = i14;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += i16 * floor3;
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
                                    i11 += i12 * floor3;
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
                                i14 += this.ac * -1127446867;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i12 = i11;
                        i10 = i14;
                        while (i12 < 0) {
                            i13 = i8 + ((floor3 * i17) >> 4);
                            if (i10 >= 0) {
                                if (i10 - (emVar.an << 12) < 0) {
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
                                        i9 = emVar.aj[(i11 >> 12) + ((i10 >> 12) * emVar.ac)];
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
                            i16 += this.ac * -965124420;
                            i12++;
                            i10 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i10 = i11;
                        i9 = i8;
                        i8 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = i9 + ((i17 * floor3) >> 4);
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
                                r15 = emVar.aj[(i16 >> 12) + (emVar.ac * (i11 >> 12))];
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
                        i9 = i8;
                        i8 = i14;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += i16 * floor2;
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
                                i11 += i12 * floor3;
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
                            i14 += 65258781 * this.ac;
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
            int i10 = ((-i9) * floor) + ((-i8) * floor2);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = (((emVar.an << 4) - i9) * floor) + ((-i8) * floor2);
            int i15 = ((-(-i8)) * floor) + (((emVar.an << 4) - i9) * floor2);
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
            i16 = ((floor - 1966088546) >> 12) + i4;
            floor = ((i10 >> 12) + i3) >> 4;
            i15 = ((((i16 + 4095) >> 12) + i3) + 15) >> 4;
            i13 = ((i11 >> 12) + i4) >> 4;
            i11 = (i16 + 15) >> 4;
            if (floor < -656570992 * this.aa) {
                floor = -1234696521 * this.aa;
            }
            if (i15 > this.ak * 2073359650) {
                i15 = -1500359024 * this.ak;
            }
            if (i13 < this.aq * -1857728003) {
                i13 = 640255892 * this.aq;
            }
            if (i11 > this.ao * 282724010) {
                i11 = this.ao * -1782697985;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i16 = ((this.ac * 1075116703) * i13) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i13 << 4) + 8) - i4;
                    i12 = (i8 << 8) - ((floor * floor2) >> 4);
                    i14 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i10 = i11; i10 < 0; i10++) {
                                if (i12 >= 0 && i14 >= 0) {
                                    if (i12 - (emVar.ac << 12) < 0) {
                                        if (i14 - (emVar.an << 12) < 0) {
                                            i13 = i15;
                                            i11 = i16;
                                            while (i13 < 0) {
                                                i8 = emVar.aj[((i14 >> 12) * emVar.ac) + (i12 >> 12)];
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
                                i16 += 157001269 * this.ac;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i8 = i12;
                            while (i10 < 0) {
                                i13 = i14 + ((i17 * floor2) >> 4);
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
                                        i12 = (i13 - floor2) / floor2;
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
                                            i9 = emVar.aj[(i8 >> 12) + (emVar.ac * (i11 >> 12))];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i16 += -1934277354 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        } else {
                            i10 = i11;
                            i8 = i12;
                            while (i10 < 0) {
                                i13 = i14 + ((i17 * floor2) >> 4);
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
                                        i12 = (((i13 + 1) - (emVar.an << 12)) - floor2) / floor2;
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
                                            i9 = emVar.aj[(i8 >> 12) + ((i11 >> 12) * emVar.ac)];
                                            if (i9 != 0) {
                                                floor = i12 + 1;
                                                this.aj[i12] = i9;
                                            } else {
                                                floor = i12 + 1;
                                            }
                                            i11 += floor2;
                                            i13++;
                                            i12 = floor;
                                        }
                                    }
                                }
                                i16 += -1754598962 * this.ac;
                                i10++;
                                i8 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            i10 = i11;
                            i8 = i14;
                            while (i10 < 0) {
                                i13 = ((i17 * floor3) >> 4) + i12;
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
                                            i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                                i16 += this.ac * 1075116703;
                                i10++;
                                i8 += floor3;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i8 = i14;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
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
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
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
                                    r15 = emVar.aj[(i16 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                                i14 += this.ac * -1171656865;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = i11;
                            i8 = i14;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += i16 * floor3;
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
                                    i11 += i12 * floor3;
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
                                i14 += this.ac * -1638489122;
                                i10++;
                                i8 += floor3;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        i10 = i11;
                        i8 = i14;
                        while (i10 < 0) {
                            i13 = i12 + ((floor3 * i17) >> 4);
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
                                        i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                            i16 += this.ac * -146234633;
                            i10++;
                            i8 += floor3;
                        }
                    } else if (floor2 < 0) {
                        i10 = i11;
                        i8 = i14;
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = i9 + ((i17 * floor3) >> 4);
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
                                r15 = emVar.aj[(i16 >> 12) + (emVar.ac * (i11 >> 12))];
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
                        i8 = i14;
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += i16 * floor2;
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
                                i11 += i12 * floor3;
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
            double d = ((double) (255678297 & i5)) * 9.587379924285257E-5d;
            int floor = (int) Math.floor((Math.sin(d) * ((double) i6)) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * ((double) i6)) + 0.5d);
            int i10 = ((-i9) * floor) + ((-i8) * floor2);
            int i11 = ((-(-i8)) * floor) + ((-i9) * floor2);
            int i12 = (((emVar.ac << 4) - i8) * floor2) + ((-i9) * floor);
            int i13 = ((-((emVar.ac << 4) - i8)) * floor) + ((-i9) * floor2);
            int i14 = (((emVar.an << 4) - i9) * floor) + ((-i8) * floor2);
            int i15 = ((-(-i8)) * floor) + (((emVar.an << 4) - i9) * floor2);
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
            i15 = ((((-1907882987 + i16) >> 12) + i3) + 15) >> 4;
            i13 = ((i11 >> 12) + i4) >> 4;
            i11 = (i16 + 15) >> 4;
            if (floor < -315704857 * this.aa) {
                floor = -1391615650 * this.aa;
            }
            if (i15 > this.ak * -156725551) {
                i15 = 579810681 * this.ak;
            }
            if (i13 < this.aq * -1546870781) {
                i13 = -1857728003 * this.aq;
            }
            if (i11 > this.ao * -660085323) {
                i11 = this.ao * -1548580666;
            }
            i15 = floor - i15;
            if (i15 < 0) {
                i11 = i13 - i11;
                if (i11 < 0) {
                    i16 = ((this.ac * 1075116703) * i13) + floor;
                    double d2 = 1.6777216E7d / ((double) i6);
                    floor2 = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                    int floor3 = (int) Math.floor((d2 * Math.cos(d)) + 0.5d);
                    int i17 = ((floor << 4) + 8) - i3;
                    floor = ((i13 << 4) + 8) - i4;
                    i12 = (i8 << 8) - ((floor * floor2) >> 4);
                    i8 = ((floor * floor3) >> 4) + (i9 << 8);
                    if (floor3 == 0) {
                        if (floor2 == 0) {
                            for (i14 = i11; i14 < 0; i14++) {
                                if (i12 >= 0) {
                                    if (i8 >= 0) {
                                        if (i12 - (emVar.ac << 12) < 0 && i8 - (emVar.an << 12) < 0) {
                                            i13 = i15;
                                            i11 = i16;
                                            while (i13 < 0) {
                                                i10 = emVar.aj[((i8 >> 12) * emVar.ac) + (i12 >> 12)];
                                                if (i10 != 0) {
                                                    floor = i11 + 1;
                                                    this.aj[i11] = i10;
                                                } else {
                                                    floor = i11 + 1;
                                                }
                                                i13++;
                                                i11 = floor;
                                            }
                                        }
                                    }
                                }
                                i16 += 1913274268 * this.ac;
                            }
                        } else if (floor2 < 0) {
                            i10 = i12;
                            i12 = i11;
                            while (i12 < 0) {
                                i13 = i8 + ((i17 * floor2) >> 4);
                                if (i10 >= 0) {
                                    if (i10 - (emVar.ac << 12) < 0) {
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
                                            i9 = emVar.aj[(i10 >> 12) + (emVar.ac * (i11 >> 12))];
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
                                i11 = i12 + 1;
                                i16 += 1075116703 * this.ac;
                                i10 -= floor2;
                                i12 = i11;
                            }
                        } else {
                            i10 = i12;
                            i12 = i11;
                            while (i12 < 0) {
                                i13 = i8 + ((i17 * floor2) >> 4);
                                if (i10 >= 0) {
                                    if (i10 - (emVar.ac << 12) < 0) {
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
                                            i9 = emVar.aj[(i10 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                                i12++;
                                i10 -= floor2;
                            }
                        }
                    } else if (floor3 < 0) {
                        if (floor2 == 0) {
                            for (i10 = i11; i10 < 0; i10++) {
                                i13 = ((i17 * floor3) >> 4) + i12;
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
                                            i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                                i8 += floor3;
                                i16 += this.ac * 1075116703;
                            }
                        } else if (floor2 < 0) {
                            i10 = i11;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
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
                                i12 = i13 - (emVar.an << 12);
                                if (i12 >= 0) {
                                    i12 = (floor2 - i12) / floor2;
                                    floor += i12;
                                    i11 += floor3 * i12;
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
                                    r15 = emVar.aj[(i16 >> 12) + ((i11 >> 12) * emVar.ac)];
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
                                i8 += floor3;
                                i14 += this.ac * -1864152949;
                                i10++;
                                i9 -= floor2;
                            }
                        } else {
                            i10 = i11;
                            i9 = i12;
                            i14 = i16;
                            while (i10 < 0) {
                                i11 = ((i17 * floor3) >> 4) + i9;
                                i13 = i8 + ((i17 * floor2) >> 4);
                                floor = i11 - (emVar.ac << 12);
                                if (floor >= 0) {
                                    i16 = (floor3 - floor) / floor3;
                                    floor = i15 + i16;
                                    i11 += i16 * floor3;
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
                                    i11 += i12 * floor3;
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
                                i8 += floor3;
                                i14 += this.ac * -1996668645;
                                i10++;
                                i9 -= floor2;
                            }
                        }
                    } else if (floor2 == 0) {
                        for (i10 = i11; i10 < 0; i10++) {
                            i13 = i12 + ((floor3 * i17) >> 4);
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
                                        i9 = emVar.aj[(i11 >> 12) + ((i8 >> 12) * emVar.ac)];
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
                            i8 += floor3;
                            i16 += this.ac * 1903196232;
                        }
                    } else if (floor2 < 0) {
                        i10 = i11;
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = i9 + ((i17 * floor3) >> 4);
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
                                r15 = emVar.aj[(i16 >> 12) + (emVar.ac * (i11 >> 12))];
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
                        i9 = i12;
                        i14 = i16;
                        while (i10 < 0) {
                            i11 = ((i17 * floor3) >> 4) + i9;
                            i13 = ((i17 * floor2) >> 4) + i8;
                            if (i11 < 0) {
                                i16 = ((floor3 - 1) - i11) / floor3;
                                floor = i15 + i16;
                                i11 += i16 * floor3;
                                i13 += i16 * floor2;
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
                                i11 += i12 * floor3;
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
                            i8 += floor3;
                            i14 += 683319331 * this.ac;
                            i10++;
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
            int i8 = ((emVar.aq * i3) / emVar.aa) + i;
            int i9 = (((emVar.aa + ((emVar.aq + emVar.ac) * i3)) - 1) / emVar.aa) + i;
            int i10 = ((emVar.ao * i4) / emVar.ak) + i2;
            int i11 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
            if (i8 < 889727047 * this.aa) {
                i8 = 889727047 * this.aa;
            }
            if (i9 > this.ak * 579810681) {
                i6 = 579810681 * this.ak;
            } else {
                i6 = i9;
            }
            if (i10 < -1857728003 * this.aq) {
                i10 = -1857728003 * this.aq;
            }
            if (i11 > -90244733 * this.ao) {
                i7 = -90244733 * this.ao;
            } else {
                i7 = i11;
            }
            if (i8 < i6 && i10 < i7) {
                int i12 = ((1075116703 * this.ac) * i10) + i8;
                int i13 = (this.ac * 1075116703) - (i6 - i8);
                if (i12 < this.aj.length) {
                    for (int i14 = i10; i14 < i7; i14++) {
                        int i15 = i8;
                        while (i15 < i6) {
                            i10 = (i15 - i) << 4;
                            int i16 = (i14 - i2) << 4;
                            int i17 = ((emVar.aa * i10) / i3) - (emVar.aq << 4);
                            i9 = (((i10 + 16) * emVar.aa) / i3) - (emVar.aq << 4);
                            i11 = ((emVar.ak * i16) / i4) - (emVar.ao << 4);
                            i10 = (((i16 + 16) * emVar.ak) / i4) - (emVar.ao << 4);
                            int i18 = ((i9 - i17) * (i10 - i11)) >> 1;
                            if (i18 == 0) {
                                i10 = i12;
                            } else {
                                if (i17 < 0) {
                                    i16 = 0;
                                } else {
                                    i16 = i17;
                                }
                                if (i9 >= (emVar.ac << 4)) {
                                    i17 = emVar.ac << 4;
                                } else {
                                    i17 = i9;
                                }
                                if (i11 < 0) {
                                    i9 = 0;
                                } else {
                                    i9 = i11;
                                }
                                if (i10 >= (emVar.an << 4)) {
                                    i10 = emVar.an << 4;
                                }
                                i17--;
                                i10--;
                                int i19 = 16 - (i16 & 15);
                                int i20 = (i17 & 15) + 1;
                                int i21 = 16 - (i9 & 15);
                                i11 = (i10 & 15) + 1;
                                int i22 = i16 >> 4;
                                int i23 = i17 >> 4;
                                int i24 = i9 >> 4;
                                int i25 = i10 >> 4;
                                int i26 = 0;
                                i16 = 0;
                                i17 = 0;
                                i9 = 0;
                                for (int i27 = i24; i27 <= i25; i27++) {
                                    i10 = 16;
                                    if (i24 == i27) {
                                        i10 = i21;
                                    }
                                    if (i25 == i27) {
                                        i10 = i11;
                                    }
                                    for (int i28 = i22; i28 <= i23; i28++) {
                                        int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                        if (i29 != 0) {
                                            int i30;
                                            if (i22 == i28) {
                                                i30 = i10 * i19;
                                            } else if (i28 == i23) {
                                                i30 = i10 * i20;
                                            } else {
                                                i30 = i10 << 4;
                                            }
                                            i9 += i30;
                                            i26 += ((i29 >> 16) & 255) * i30;
                                            i16 += ((i29 >> 8) & 255) * i30;
                                            i17 += i30 * (i29 & 255);
                                        }
                                    }
                                }
                                if (i9 >= i18) {
                                    this.aj[i12] = -16777216 | ((((i16 / i9) << 8) + ((i26 / i9) << 16)) + (i17 / i9));
                                }
                                i10 = i12 + 1;
                            }
                            i15++;
                            i12 = i10;
                        }
                        i12 += i13;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fn.bd(" + ')');
        }
    }

    public void ea(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > emVar.aa || i4 > emVar.ak) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((emVar.aq * i3) / emVar.aa) + i;
        int i7 = (((emVar.aa + ((emVar.aq + emVar.ac) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < 889727047 * this.aa) {
            i6 = 889727047 * this.aa;
        }
        if (i7 > this.ak * 579810681) {
            i7 = 579810681 * this.ak;
        }
        if (i8 < -1857728003 * this.aq) {
            i8 = -1857728003 * this.aq;
        }
        if (i9 > -90244733 * this.ao) {
            i5 = -90244733 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((1075116703 * this.ac) * i8) + i6;
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
                                if (i23 == i27) {
                                    i8 = i20;
                                }
                                if (i24 == i27) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i9 = i8 * i18;
                                        } else if (i28 == i22) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & 255) * i9;
                                        i9 = (i9 * (i29 & 255)) + i17;
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
                                this.aj[i10] = -16777216 | ((((i26 / i15) << 8) + ((i25 / i15) << 16)) + (i17 / i15));
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
        int i7 = (((emVar.aa + ((emVar.aq + emVar.ac) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < -1563613579 * this.aa) {
            i6 = 889727047 * this.aa;
        }
        if (i7 > this.ak * 1729704107) {
            i7 = -1730018066 * this.ak;
        }
        if (i8 < 1932685459 * this.aq) {
            i8 = -1857728003 * this.aq;
        }
        if (i9 > -90244733 * this.ao) {
            i5 = 166374503 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((-411892813 * this.ac) * i8) + i6;
            int i11 = (this.ac * -2066768842) - (i7 - i6);
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
                                if (i23 == i27) {
                                    i8 = i20;
                                }
                                if (i24 == i27) {
                                    i8 = i14;
                                }
                                int i28 = i21;
                                while (i28 <= i22) {
                                    int i29 = emVar.aj[(emVar.ac * i27) + i28];
                                    if (i29 != 0) {
                                        if (i21 == i28) {
                                            i9 = i8 * i18;
                                        } else if (i28 == i22) {
                                            i9 = i8 * i19;
                                        } else {
                                            i9 = i8 << 4;
                                        }
                                        i15 += i9;
                                        i25 += ((i29 >> 16) & -1876387900) * i9;
                                        i9 = (i9 * (i29 & 255)) + i17;
                                        i17 = i26 + (((i29 >> 8) & 1483970241) * i9);
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
                                this.aj[i10] = -16777216 | ((((i26 / i15) << 8) + ((i25 / i15) << 16)) + (i17 / i15));
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

    public void er(em emVar, int i, int i2, int i3, int i4) {
        if (i3 > emVar.aa || i4 > emVar.ak) {
            throw new IllegalArgumentException();
        }
        int i5;
        int i6 = ((emVar.aq * i3) / emVar.aa) + i;
        int i7 = (((emVar.aa + ((emVar.aq + emVar.ac) * i3)) - 1) / emVar.aa) + i;
        int i8 = ((emVar.ao * i4) / emVar.ak) + i2;
        int i9 = (((((emVar.an + emVar.ao) * i4) + emVar.ak) - 1) / emVar.ak) + i2;
        if (i6 < 889727047 * this.aa) {
            i6 = 889727047 * this.aa;
        }
        if (i7 > this.ak * 579810681) {
            i7 = 579810681 * this.ak;
        }
        if (i8 < -1857728003 * this.aq) {
            i8 = -1857728003 * this.aq;
        }
        if (i9 > -90244733 * this.ao) {
            i5 = -90244733 * this.ao;
        } else {
            i5 = i9;
        }
        if (i6 < i7 && i8 < i5) {
            int i10 = ((1075116703 * this.ac) * i8) + i6;
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
                            i17 = 0;
                            i15 = 0;
                            i9 = 0;
                            for (int i26 = i23; i26 <= i24; i26++) {
                                i8 = 16;
                                if (i23 == i26) {
                                    i8 = i20;
                                }
                                if (i24 == i26) {
                                    i8 = i14;
                                }
                                for (int i27 = i21; i27 <= i22; i27++) {
                                    int i28 = emVar.aj[(emVar.ac * i26) + i27];
                                    if (i28 != 0) {
                                        int i29;
                                        if (i21 == i27) {
                                            i29 = i8 * i18;
                                        } else if (i27 == i22) {
                                            i29 = i8 * i19;
                                        } else {
                                            i29 = i8 << 4;
                                        }
                                        i9 += i29;
                                        i25 += ((i28 >> 16) & 255) * i29;
                                        i17 += ((i28 >> 8) & 255) * i29;
                                        i15 += i29 * (i28 & 255);
                                    }
                                }
                            }
                            if (i9 >= i16) {
                                this.aj[i10] = -16777216 | ((i15 / i9) + (((i17 / i9) << 8) + ((i25 / i9) << 16)));
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

    static final void be(fx fxVar, int i, byte b) {
        try {
            if (fxVar.cj * -873959361 > client.af * 901275591) {
                int i2 = (fxVar.cj * -873959361) - (client.af * 901275591);
                int i3 = (fxVar.bd * 688518592) + (-1486504832 * fxVar.cd);
                int i4 = (688518592 * fxVar.bd) + (-1240347264 * fxVar.cn);
                fxVar.br = (((i3 - (fxVar.br * 1948391561)) / i2) * 1530846649) + fxVar.br;
                fxVar.bb = (((i4 - (fxVar.bb * -1461980333)) / i2) * -376780581) + fxVar.bb;
                fxVar.di = 0;
                fxVar.de = 1457340519 * fxVar.dh;
            } else if (fxVar.dk * -1643784769 >= client.af * 901275591) {
                cs.bw(fxVar, (byte) 3);
            } else {
                kr.bn(fxVar, 2120443003);
            }
            if (fxVar.br * 1948391561 < cj.ak || fxVar.bb * -1461980333 < cj.ak || fxVar.br * 1948391561 >= 13184 || fxVar.bb * -1461980333 >= 13184) {
                fxVar.ck = 2042247317;
                fxVar.cv = -566382975;
                fxVar.cj = 0;
                fxVar.dk = 0;
                fxVar.br = (fxVar.dd[0] * -1620124544) + (98129856 * fxVar.bd);
                fxVar.bb = (486751040 * fxVar.bd) + (fxVar.ds[0] * -983274112);
                fxVar.bv(-1404328635);
            }
            if (cx.hb == fxVar && (fxVar.br * 1948391561 < 1536 || fxVar.bb * -1461980333 < 1536 || fxVar.br * 1948391561 >= 11776 || fxVar.bb * -1461980333 >= 11776)) {
                fxVar.ck = 2042247317;
                fxVar.cv = -566382975;
                fxVar.cj = 0;
                fxVar.dk = 0;
                fxVar.br = (fxVar.dd[0] * -1620124544) + (fxVar.bd * 98129856);
                fxVar.bb = (fxVar.bd * 486751040) + (fxVar.ds[0] * -983274112);
                fxVar.bv(-700547828);
            }
            dt.bg(fxVar, 1947371354);
            dh.bc(fxVar, 818798463);
        } catch (Throwable e) {
            throw ei.ac(e, "fn.be(" + ')');
        }
    }

    static final int cm(int i) {
        try {
            if (ae.nv.an) {
                return lw.hn * -2005147175;
            }
            if (fb.cv(cz.fz * 1130591639, ac.fk * -749631659, lw.hn * -2005147175, 636474889) - (le.fo * 1712599549) >= 800 || (fb.ac[lw.hn * -2005147175][(cz.fz * 1130591639) >> 7][(ac.fk * -749631659) >> 7] & 4) == 0) {
                return 3;
            }
            return lw.hn * -2005147175;
        } catch (Throwable e) {
            throw ei.ac(e, "fn.cm(" + ')');
        }
    }
}
