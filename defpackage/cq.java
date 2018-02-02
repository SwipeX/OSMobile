package defpackage;

public class cq extends bl {
    public static final int dk = 106;
    int[] aj;

    public cq(int[] iArr, int i, int i2) {
        try {
            aq(iArr, i, i2, -1662449847);
        } catch (Throwable e) {
            throw ei.ac(e, "cq.<init>(" + ')');
        }
    }

    public void ah() {
    }

    public void ai() {
    }

    public void aj(byte b) {
    }

    public final void aq(int[] iArr, int i, int i2, int i3) {
        try {
            this.aj = iArr;
            this.af = 1179423413 * i;
            this.au = 903407081 * i2;
            bx(0, 0, i, i2, -1447697969);
            bi(-1402135883);
        } catch (Throwable e) {
            throw ei.ac(e, "cq.aq(" + ')');
        }
    }

    public final void av(int[] iArr, int i, int i2) {
        this.aj = iArr;
        this.af = 1179423413 * i;
        this.au = 917123613 * i2;
        bx(0, 0, i, i2, -2077934452);
        bi(-484265518);
    }

    public final void ay(int[] iArr, int i, int i2) {
        this.aj = iArr;
        this.af = 1179423413 * i;
        this.au = 903407081 * i2;
        bx(0, 0, i, i2, -244338217);
        bi(-1802435674);
    }

    final void ad(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            i10 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i10 = 0;
        }
        if (i2 != i) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i3 != i) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i19 = (i13 * i16) - (i14 * i15);
        if (i19 != 0) {
            int i20 = (((i16 * i17) - (i14 * i18)) << 8) / i19;
            int i21 = (((i13 * i18) - (i15 * i17)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > 286513717 * this.bd) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > 286513717 * this.bd) {
                            i = this.bd * 286513717;
                        }
                        i19 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i) {
                            i13 = i5 << 14;
                            if (i2 < 0) {
                                i22 = i13 - (i11 * i2);
                                i13 -= i2 * i10;
                                i23 = i19 - (i21 * i2);
                                i2 = 0;
                                i19 = i13;
                            } else {
                                i23 = i19;
                                i22 = i13;
                                i19 = i13;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i12 * i3;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i11 >= i10) && (i3 != i2 || i11 <= i12)) {
                                i25 = i - i3;
                                i13 = i3 - i2;
                                i14 = this.bo[i2];
                                i26 = i19;
                                i19 = i13;
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i23, i20, (byte) 37);
                                    i22 += i11;
                                    i23 += i21;
                                    i14 += -1842132067 * this.af;
                                    i26 += i10;
                                    i19 = i27;
                                }
                                i19 = i25;
                                while (true) {
                                    i25 = i19 - 1;
                                    if (i25 >= 0) {
                                        aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) -119);
                                        i23 += i21;
                                        i14 += this.af * -1842132067;
                                        i24 += i12;
                                        i22 += i11;
                                        i19 = i25;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i - i3;
                            i13 = i3 - i2;
                            i14 = this.bo[i2];
                            i26 = i19;
                            i19 = i13;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i23, i20, (byte) -2);
                                i22 += i11;
                                i23 += i21;
                                i14 += -1842132067 * this.af;
                                i26 += i10;
                                i19 = i27;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) -28);
                                    i24 += i12;
                                    i23 += i21;
                                    i14 += this.af * -1842132067;
                                    i22 += i11;
                                    i19 = i25;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i14 - (i2 * i11);
                            i14 -= i10 * i2;
                            i19 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i13 = i14;
                        }
                        i22 = i4 << 14;
                        if (i < 0) {
                            i22 -= i * i12;
                            i = 0;
                        }
                        if (i11 < i10) {
                            i25 = i3 - i;
                            i16 = i - i2;
                            i23 = i19;
                            i26 = i13;
                            i24 = i14;
                            i14 = this.bo[i2];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i23, i20, (byte) -70);
                                i24 += i10;
                                i23 += i21;
                                i14 += this.af * -1842132067;
                                i26 += i11;
                                i19 = i27;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) 63);
                                    i22 += i12;
                                    i23 += i21;
                                    i14 += this.af * -1842132067;
                                    i24 += i10;
                                    i19 = i25;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i;
                        i16 = i - i2;
                        i23 = i19;
                        i26 = i13;
                        i24 = i14;
                        i14 = this.bo[i2];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i23, i20, (byte) 29);
                            i24 += i10;
                            i23 += i21;
                            i14 += -1842132067 * this.af;
                            i26 += i11;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) -99);
                                i23 += i21;
                                i14 += -1842132067 * this.af;
                                i24 += i10;
                                i22 += i12;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < 286513717 * this.bd) {
                    if (i > this.bd * 286513717) {
                        i = 286513717 * this.bd;
                    }
                    if (i2 > this.bd * 286513717) {
                        i2 = this.bd * 286513717;
                    }
                    i19 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i3 * i10);
                            i13 -= i12 * i3;
                            i19 -= i3 * i21;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i22 = i4 << 14;
                        if (i < 0) {
                            i22 -= i11 * i;
                            i = 0;
                        }
                        if (i10 < i12) {
                            i25 = i2 - i;
                            i16 = i - i3;
                            i23 = i19;
                            i26 = i13;
                            i24 = i14;
                            i14 = this.bo[i3];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i23, i20, (byte) 16);
                                i24 += i10;
                                i23 += i21;
                                i14 += this.af * -1842132067;
                                i26 += i12;
                                i19 = i27;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) 32);
                                    i22 += i11;
                                    i23 += i21;
                                    i14 += this.af * -1842132067;
                                    i24 += i10;
                                    i19 = i25;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i2 - i;
                        i16 = i - i3;
                        i23 = i19;
                        i26 = i13;
                        i24 = i14;
                        i14 = this.bo[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i23, i20, (byte) -2);
                            i24 += i10;
                            i23 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i12;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) 20);
                                i23 += i21;
                                i14 += this.af * -1842132067;
                                i24 += i10;
                                i22 += i11;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i13 - (i3 * i10);
                        i13 -= i12 * i3;
                        i19 -= i3 * i21;
                        i3 = 0;
                    } else {
                        i14 = i13;
                    }
                    i22 = i5 << 14;
                    if (i2 < 0) {
                        i22 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i10 < i12) {
                        i25 = i - i2;
                        i16 = i2 - i3;
                        i23 = i19;
                        i24 = i13;
                        i26 = i14;
                        i14 = this.bo[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i23, i20, (byte) -76);
                            i24 += i12;
                            i23 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i10;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) 25);
                                i22 += i11;
                                i23 += i21;
                                i14 += -1842132067 * this.af;
                                i24 += i12;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i2;
                    i16 = i2 - i3;
                    i23 = i19;
                    i24 = i13;
                    i26 = i14;
                    i14 = this.bo[i3];
                    i19 = i16;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i23, i20, (byte) -60);
                        i24 += i12;
                        i23 += i21;
                        i14 += this.af * -1842132067;
                        i26 += i10;
                        i19 = i27;
                    }
                    i19 = i25;
                    while (true) {
                        i25 = i19 - 1;
                        if (i25 >= 0) {
                            aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) -34);
                            i23 += i21;
                            i14 += -1842132067 * this.af;
                            i24 += i12;
                            i22 += i11;
                            i19 = i25;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bd * 286513717) {
                if (i2 > this.bd * 286513717) {
                    i2 = this.bd * 286513717;
                }
                if (i3 > 286513717 * this.bd) {
                    i3 = this.bd * 286513717;
                }
                i19 = ((i7 << 8) - (i20 * i4)) + i20;
                if (i2 < i3) {
                    i14 = i4 << 14;
                    if (i < 0) {
                        i13 = i14 - (i * i12);
                        i14 -= i * i11;
                        i19 -= i * i21;
                        i = 0;
                    } else {
                        i13 = i14;
                    }
                    i22 = i5 << 14;
                    if (i2 < 0) {
                        i22 -= i10 * i2;
                        i2 = 0;
                    }
                    if ((i2 == i || i12 >= i11) && (i != i2 || i12 <= i10)) {
                        i25 = i3 - i2;
                        i23 = i19;
                        i24 = i13;
                        i26 = i14;
                        i19 = i2 - i;
                        i14 = this.bo[i];
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i23, i20, (byte) 23);
                            i24 += i12;
                            i23 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i11;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) 16);
                                i23 += i21;
                                i14 += this.af * -1842132067;
                                i24 += i12;
                                i22 += i10;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i3 - i2;
                    i23 = i19;
                    i24 = i13;
                    i26 = i14;
                    i19 = i2 - i;
                    i14 = this.bo[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i23, i20, (byte) 1);
                        i24 += i12;
                        i23 += i21;
                        i14 += -1842132067 * this.af;
                        i26 += i11;
                        i19 = i27;
                    }
                    i19 = i25;
                    while (true) {
                        i25 = i19 - 1;
                        if (i25 >= 0) {
                            aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) -39);
                            i22 += i10;
                            i23 += i21;
                            i14 += -1842132067 * this.af;
                            i24 += i12;
                            i19 = i25;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i12 * i);
                    i14 -= i * i11;
                    i19 -= i * i21;
                    i = 0;
                } else {
                    i13 = i14;
                }
                i24 = i6 << 14;
                if (i3 < 0) {
                    i24 -= i3 * i10;
                    i3 = 0;
                }
                if ((i3 == i || i12 >= i11) && (i3 != i || i10 <= i11)) {
                    i25 = i2 - i3;
                    i23 = i19;
                    i26 = i13;
                    i22 = i14;
                    i19 = i3 - i;
                    i14 = this.bo[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i23, i20, (byte) 30);
                        i22 += i11;
                        i23 += i21;
                        i14 += -1842132067 * this.af;
                        i26 += i12;
                        i19 = i27;
                    }
                    i19 = i25;
                    while (true) {
                        i25 = i19 - 1;
                        if (i25 >= 0) {
                            aa(this.aj, i14, 0, 0, i22 >> 14, i24 >> 14, i23, i20, (byte) -38);
                            i24 += i10;
                            i23 += i21;
                            i14 += this.af * -1842132067;
                            i22 += i11;
                            i19 = i25;
                        } else {
                            return;
                        }
                    }
                }
                i25 = i2 - i3;
                i23 = i19;
                i26 = i13;
                i22 = i14;
                i19 = i3 - i;
                i14 = this.bo[i];
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i23, i20, (byte) -20);
                    i22 += i11;
                    i23 += i21;
                    i14 += this.af * -1842132067;
                    i26 += i12;
                    i19 = i27;
                }
                i19 = i25;
                while (true) {
                    i25 = i19 - 1;
                    if (i25 >= 0) {
                        aa(this.aj, i14, 0, 0, i24 >> 14, i22 >> 14, i23, i20, (byte) -125);
                        i23 += i21;
                        i14 += this.af * -1842132067;
                        i24 += i10;
                        i22 += i11;
                        i19 = i25;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void ag(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            i10 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i10 = 0;
        }
        if (i2 != i) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i3 != i) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i19 = (i13 * i16) - (i14 * i15);
        if (i19 != 0) {
            int i20 = (((i16 * i17) - (i14 * i18)) << 8) / i19;
            int i21 = (((i13 * i18) - (i15 * i17)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 1095222704) {
                        if (i3 > -2058751228 * this.bd) {
                            i3 = this.bd * 605938035;
                        }
                        if (i > -228416199 * this.bd) {
                            i = this.bd * 1700541598;
                        }
                        i22 = i20 + ((i8 << 8) - (i5 * i20));
                        if (i3 < i) {
                            i19 = i5 << 14;
                            if (i2 < 0) {
                                i23 = i19 - (i11 * i2);
                                i19 -= i2 * i10;
                                i22 -= i21 * i2;
                                i2 = 0;
                            } else {
                                i23 = i19;
                            }
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i24 -= i12 * i3;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i11 >= i10) && (i3 != i2 || i11 <= i12)) {
                                i25 = i - i3;
                                i13 = i3 - i2;
                                i14 = this.bo[i2];
                                i26 = i19;
                                i19 = i13;
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i22, i20, (byte) -77);
                                    i23 += i11;
                                    i22 += i21;
                                    i14 += 537224435 * this.af;
                                    i26 += i10;
                                    i19 = i27;
                                }
                                i19 = i25;
                                while (true) {
                                    i25 = i19 - 1;
                                    if (i25 >= 0) {
                                        aa(this.aj, i14, 0, 0, i24 >> 14, i23 >> 14, i22, i20, (byte) -9);
                                        i22 += i21;
                                        i14 += this.af * -1842132067;
                                        i24 += i12;
                                        i23 += i11;
                                        i19 = i25;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i - i3;
                            i13 = i3 - i2;
                            i14 = this.bo[i2];
                            i26 = i19;
                            i19 = i13;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i22, i20, (byte) 32);
                                i23 += i11;
                                i22 += i21;
                                i14 += -1842132067 * this.af;
                                i26 += i10;
                                i19 = i27;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    aa(this.aj, i14, 0, 0, i23 >> 14, i24 >> 14, i22, i20, (byte) -46);
                                    i24 += i12;
                                    i22 += i21;
                                    i14 += this.af * -620180917;
                                    i23 += i11;
                                    i19 = i25;
                                } else {
                                    return;
                                }
                            }
                        }
                        i13 = i5 << 14;
                        if (i2 < 0) {
                            i19 = i13 - (i2 * i11);
                            i24 = i13 - (i10 * i2);
                            i22 -= i2 * i21;
                            i2 = 0;
                        } else {
                            i19 = i13;
                            i24 = i13;
                        }
                        i23 = i4 << 14;
                        if (i < 0) {
                            i23 -= i * i12;
                            i = 0;
                        }
                        if (i11 < i10) {
                            i25 = i3 - i;
                            i13 = i - i2;
                            i14 = this.bo[i2];
                            i26 = i19;
                            i19 = i13;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i22, i20, (byte) 68);
                                i24 += i10;
                                i22 += i21;
                                i14 += this.af * -1842132067;
                                i26 += i11;
                                i19 = i27;
                            }
                            i19 = i25;
                            while (true) {
                                i25 = i19 - 1;
                                if (i25 >= 0) {
                                    aa(this.aj, i14, 0, 0, i23 >> 14, i24 >> 14, i22, i20, (byte) 25);
                                    i23 += i12;
                                    i22 += i21;
                                    i14 += this.af * 400445518;
                                    i24 += i10;
                                    i19 = i25;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i3 - i;
                        i13 = i - i2;
                        i14 = this.bo[i2];
                        i26 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i22, i20, (byte) 64);
                            i24 += i10;
                            i22 += i21;
                            i14 += -1842132067 * this.af;
                            i26 += i11;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i24 >> 14, i23 >> 14, i22, i20, (byte) -87);
                                i22 += i21;
                                i14 += -1842132067 * this.af;
                                i24 += i10;
                                i23 += i12;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < 1070825395 * this.bd) {
                    if (i > this.bd * -1278723742) {
                        i = -1031638514 * this.bd;
                    }
                    if (i2 > this.bd * -1310834572) {
                        i15 = this.bd * -1590872571;
                    } else {
                        i15 = i2;
                    }
                    i19 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i15) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i3 * i10);
                            i13 -= i12 * i3;
                            i19 -= i3 * i21;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i23 = i4 << 14;
                        if (i < 0) {
                            i23 -= i11 * i;
                            i = 0;
                        }
                        if (i10 < i12) {
                            i25 = i15 - i;
                            i16 = i - i3;
                            i22 = i19;
                            i26 = i13;
                            i24 = i14;
                            i14 = this.bo[i3];
                            i19 = i16;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i22, i20, (byte) -12);
                                i24 += i10;
                                i22 += i21;
                                i14 += this.af * -1842132067;
                                i26 += i12;
                                i19 = i27;
                            }
                            i12 = i24;
                            i19 = i25;
                            while (true) {
                                i24 = i19 - 1;
                                if (i24 >= 0) {
                                    aa(this.aj, i14, 0, 0, i12 >> 14, i23 >> 14, i22, i20, (byte) 24);
                                    i23 += i11;
                                    i22 += i21;
                                    i14 += this.af * 1248952549;
                                    i12 += i10;
                                    i19 = i24;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i15 - i;
                        i16 = i - i3;
                        i22 = i19;
                        i26 = i13;
                        i24 = i14;
                        i14 = this.bo[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i22, i20, (byte) 59);
                            i24 += i10;
                            i22 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i12;
                            i19 = i27;
                        }
                        i12 = i24;
                        i19 = i25;
                        i24 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                aa(this.aj, i14, 0, 0, i24 >> 14, i12 >> 14, i22, i20, (byte) -25);
                                i22 += i21;
                                i14 += this.af * -1842132067;
                                i12 += i10;
                                i24 += i11;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i13 - (i3 * i10);
                        i13 -= i12 * i3;
                        i19 -= i3 * i21;
                        i3 = 0;
                    } else {
                        i14 = i13;
                    }
                    i23 = i5 << 14;
                    if (i15 < 0) {
                        i23 -= i15 * i11;
                        i15 = 0;
                    }
                    if (i10 < i12) {
                        i25 = i - i15;
                        i16 = i15 - i3;
                        i22 = i19;
                        i24 = i13;
                        i26 = i14;
                        i14 = this.bo[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i22, i20, (byte) -101);
                            i24 += i12;
                            i22 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i10;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i23 >> 14, i24 >> 14, i22, i20, (byte) 51);
                                i23 += i11;
                                i22 += i21;
                                i14 += -1842132067 * this.af;
                                i24 += i12;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i - i15;
                    i16 = i15 - i3;
                    i22 = i19;
                    i24 = i13;
                    i26 = i14;
                    i14 = this.bo[i3];
                    i19 = i16;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i22, i20, (byte) 63);
                        i24 += i12;
                        i22 += i21;
                        i14 += this.af * -1842132067;
                        i26 += i10;
                        i19 = i27;
                    }
                    i19 = i25;
                    while (true) {
                        i25 = i19 - 1;
                        if (i25 >= 0) {
                            aa(this.aj, i14, 0, 0, i24 >> 14, i23 >> 14, i22, i20, (byte) -2);
                            i22 += i21;
                            i14 += 470969350 * this.af;
                            i24 += i12;
                            i23 += i11;
                            i19 = i25;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bd * 1616006620) {
                if (i2 > this.bd * 286513717) {
                    i2 = this.bd * 327539808;
                }
                if (i3 > 286513717 * this.bd) {
                    i3 = this.bd * 286513717;
                }
                i22 = i20 + ((i7 << 8) - (i20 * i4));
                if (i2 < i3) {
                    i19 = i4 << 14;
                    if (i < 0) {
                        i24 = i19 - (i * i12);
                        i19 -= i * i11;
                        i22 -= i * i21;
                        i = 0;
                    } else {
                        i24 = i19;
                    }
                    i23 = i5 << 14;
                    if (i2 < 0) {
                        i23 -= i10 * i2;
                        i2 = 0;
                    }
                    if ((i2 == i || i12 >= i11) && (i != i2 || i12 <= i10)) {
                        i25 = i3 - i2;
                        i13 = i2 - i;
                        i14 = this.bo[i];
                        i26 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i24 >> 14, i22, i20, (byte) -104);
                            i24 += i12;
                            i22 += i21;
                            i14 += this.af * -1842132067;
                            i26 += i11;
                            i19 = i27;
                        }
                        i19 = i25;
                        while (true) {
                            i25 = i19 - 1;
                            if (i25 >= 0) {
                                aa(this.aj, i14, 0, 0, i23 >> 14, i24 >> 14, i22, i20, (byte) 4);
                                i23 += i10;
                                i22 += i21;
                                i14 += this.af * -1842132067;
                                i24 += i12;
                                i19 = i25;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i3 - i2;
                    i13 = i2 - i;
                    i14 = this.bo[i];
                    i26 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i24 >> 14, i26 >> 14, i22, i20, (byte) -127);
                        i24 += i12;
                        i22 += i21;
                        i14 += -1842132067 * this.af;
                        i26 += i11;
                        i19 = i27;
                    }
                    i19 = i25;
                    while (true) {
                        i25 = i19 - 1;
                        if (i25 >= 0) {
                            aa(this.aj, i14, 0, 0, i24 >> 14, i23 >> 14, i22, i20, (byte) 53);
                            i22 += i21;
                            i14 += 1243262083 * this.af;
                            i24 += i12;
                            i23 += i10;
                            i19 = i25;
                        } else {
                            return;
                        }
                    }
                }
                i13 = i4 << 14;
                if (i < 0) {
                    i19 = i13 - (i12 * i);
                    i23 = i13 - (i * i11);
                    i22 -= i * i21;
                    i = 0;
                } else {
                    i19 = i13;
                    i23 = i13;
                }
                i24 = i6 << 14;
                if (i3 < 0) {
                    i24 -= i3 * i10;
                    i3 = 0;
                }
                if ((i3 == i || i12 >= i11) && (i3 != i || i10 <= i11)) {
                    i25 = i2 - i3;
                    i13 = i3 - i;
                    i14 = this.bo[i];
                    i26 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i22, i20, (byte) -24);
                        i23 += i11;
                        i22 += i21;
                        i14 += -1842132067 * this.af;
                        i26 += i12;
                        i19 = i27;
                    }
                    i12 = i24;
                    i19 = i25;
                    i24 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            aa(this.aj, i14, 0, 0, i24 >> 14, i12 >> 14, i22, i20, (byte) 7);
                            i22 += i21;
                            i14 += this.af * -2026942660;
                            i12 += i10;
                            i24 += i11;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i25 = i2 - i3;
                i13 = i3 - i;
                i14 = this.bo[i];
                i26 = i19;
                i19 = i13;
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i22, i20, (byte) -52);
                    i23 += i11;
                    i22 += i21;
                    i14 += this.af * -1842132067;
                    i26 += i12;
                    i19 = i27;
                }
                i12 = i23;
                i19 = i25;
                while (true) {
                    i23 = i19 - 1;
                    if (i23 >= 0) {
                        aa(this.aj, i14, 0, 0, i24 >> 14, i12 >> 14, i22, i20, (byte) 22);
                        i24 += i10;
                        i22 += i21;
                        i14 += this.af * -1842132067;
                        i12 += i11;
                        i19 = i23;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            try {
                int i19 = ((i6 - i5) << 14) / (i3 - i2);
            } catch (Throwable e) {
                throw ei.ac(e, "cq.ao(" + ')');
            }
        }
        i19 = 0;
        if (i2 != i) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i3 != i) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i20 = (i13 * i16) - (i14 * i15);
        if (i20 != 0) {
            int i21 = (((i16 * i17) - (i14 * i18)) << 8) / i20;
            int i22 = (((i13 * i18) - (i15 * i17)) << 8) / i20;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > 286513717 * this.bd) {
                            i15 = this.bd * 286513717;
                        } else {
                            i15 = i3;
                        }
                        if (i > 286513717 * this.bd) {
                            i = this.bd * 286513717;
                        }
                        i20 = ((i8 << 8) - (i5 * i21)) + i21;
                        if (i15 < i) {
                            i13 = i5 << 14;
                            if (i2 < 0) {
                                i14 = i13 - (i11 * i2);
                                i13 -= i2 * i19;
                                i20 -= i22 * i2;
                                i2 = 0;
                            } else {
                                i14 = i13;
                            }
                            i23 = i6 << 14;
                            if (i15 < 0) {
                                i23 -= i15 * i12;
                                i15 = 0;
                            }
                            if ((i2 == i15 || i11 >= i19) && (i15 != i2 || i11 <= i12)) {
                                i24 = i - i15;
                                i25 = i20;
                                i26 = i13;
                                i27 = i14;
                                i20 = i15 - i2;
                                i14 = this.bo[i2];
                                while (true) {
                                    i28 = i20 - 1;
                                    if (i28 < 0) {
                                        break;
                                    }
                                    aa(this.aj, i14, 0, 0, i26 >> 14, i27 >> 14, i25, i21, (byte) 11);
                                    i27 += i11;
                                    i25 += i22;
                                    i14 += -1842132067 * this.af;
                                    i26 += i19;
                                    i20 = i28;
                                }
                                i20 = i24;
                                while (true) {
                                    i24 = i20 - 1;
                                    if (i24 >= 0) {
                                        aa(this.aj, i14, 0, 0, i23 >> 14, i27 >> 14, i25, i21, (byte) -38);
                                        i25 += i22;
                                        i14 += this.af * -1842132067;
                                        i23 += i12;
                                        i27 += i11;
                                        i20 = i24;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i24 = i - i15;
                            i25 = i20;
                            i26 = i13;
                            i27 = i14;
                            i20 = i15 - i2;
                            i14 = this.bo[i2];
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i27 >> 14, i26 >> 14, i25, i21, (byte) -104);
                                i27 += i11;
                                i25 += i22;
                                i14 += -1842132067 * this.af;
                                i26 += i19;
                                i20 = i28;
                            }
                            i20 = i24;
                            while (true) {
                                i24 = i20 - 1;
                                if (i24 >= 0) {
                                    aa(this.aj, i14, 0, 0, i27 >> 14, i23 >> 14, i25, i21, (byte) -121);
                                    i23 += i12;
                                    i25 += i22;
                                    i14 += this.af * -1842132067;
                                    i27 += i11;
                                    i20 = i24;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i14 - (i2 * i11);
                            i14 -= i19 * i2;
                            i20 -= i2 * i22;
                            i2 = 0;
                        } else {
                            i13 = i14;
                        }
                        i27 = i4 << 14;
                        if (i < 0) {
                            i27 -= i * i12;
                            i = 0;
                        }
                        if (i11 < i19) {
                            i24 = i15 - i;
                            i16 = i - i2;
                            i25 = i20;
                            i26 = i13;
                            i23 = i14;
                            i14 = this.bo[i2];
                            i20 = i16;
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i25, i21, (byte) -38);
                                i23 += i19;
                                i25 += i22;
                                i14 += this.af * -1842132067;
                                i26 += i11;
                                i20 = i28;
                            }
                            i20 = i24;
                            while (true) {
                                i24 = i20 - 1;
                                if (i24 >= 0) {
                                    aa(this.aj, i14, 0, 0, i27 >> 14, i23 >> 14, i25, i21, (byte) 13);
                                    i27 += i12;
                                    i25 += i22;
                                    i14 += this.af * -1842132067;
                                    i23 += i19;
                                    i20 = i24;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i15 - i;
                        i16 = i - i2;
                        i25 = i20;
                        i26 = i13;
                        i23 = i14;
                        i14 = this.bo[i2];
                        i20 = i16;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i25, i21, (byte) -114);
                            i23 += i19;
                            i25 += i22;
                            i14 += -1842132067 * this.af;
                            i26 += i11;
                            i20 = i28;
                        }
                        i20 = i24;
                        while (true) {
                            i24 = i20 - 1;
                            if (i24 >= 0) {
                                aa(this.aj, i14, 0, 0, i23 >> 14, i27 >> 14, i25, i21, (byte) 14);
                                i25 += i22;
                                i14 += -1842132067 * this.af;
                                i23 += i19;
                                i27 += i12;
                                i20 = i24;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < 286513717 * this.bd) {
                    if (i > this.bd * 286513717) {
                        i15 = 286513717 * this.bd;
                    } else {
                        i15 = i;
                    }
                    if (i2 > this.bd * 286513717) {
                        i2 = this.bd * 286513717;
                    }
                    i20 = ((i9 << 8) - (i21 * i6)) + i21;
                    if (i15 < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i14 = i13 - (i3 * i19);
                            i13 -= i12 * i3;
                            i20 -= i3 * i22;
                            i3 = 0;
                        } else {
                            i14 = i13;
                        }
                        i27 = i4 << 14;
                        if (i15 < 0) {
                            i27 -= i15 * i11;
                            i15 = 0;
                        }
                        if (i19 < i12) {
                            i24 = i2 - i15;
                            i16 = i15 - i3;
                            i25 = i20;
                            i26 = i13;
                            i23 = i14;
                            i14 = this.bo[i3];
                            i20 = i16;
                            while (true) {
                                i28 = i20 - 1;
                                if (i28 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i25, i21, (byte) 66);
                                i23 += i19;
                                i25 += i22;
                                i14 += this.af * -1842132067;
                                i26 += i12;
                                i20 = i28;
                            }
                            i12 = i23;
                            i20 = i24;
                            while (true) {
                                i23 = i20 - 1;
                                if (i23 >= 0) {
                                    aa(this.aj, i14, 0, 0, i12 >> 14, i27 >> 14, i25, i21, (byte) 47);
                                    i27 += i11;
                                    i25 += i22;
                                    i14 += this.af * -1842132067;
                                    i12 += i19;
                                    i20 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i2 - i15;
                        i16 = i15 - i3;
                        i25 = i20;
                        i26 = i13;
                        i23 = i14;
                        i14 = this.bo[i3];
                        i20 = i16;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i25, i21, (byte) 40);
                            i23 += i19;
                            i25 += i22;
                            i14 += this.af * -1842132067;
                            i26 += i12;
                            i20 = i28;
                        }
                        i12 = i23;
                        i20 = i24;
                        i23 = i27;
                        while (true) {
                            i27 = i20 - 1;
                            if (i27 >= 0) {
                                aa(this.aj, i14, 0, 0, i23 >> 14, i12 >> 14, i25, i21, (byte) -55);
                                i25 += i22;
                                i14 += this.af * -1842132067;
                                i12 += i19;
                                i23 += i11;
                                i20 = i27;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i13 = i23 - (i3 * i19);
                        i23 -= i12 * i3;
                        i25 = i20 - (i3 * i22);
                        i3 = 0;
                        i20 = i13;
                    } else {
                        i25 = i20;
                        i20 = i23;
                    }
                    i27 = i5 << 14;
                    if (i2 < 0) {
                        i27 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i19 < i12) {
                        i24 = i15 - i2;
                        i13 = i2 - i3;
                        i14 = this.bo[i3];
                        i26 = i20;
                        i20 = i13;
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i25, i21, (byte) -9);
                            i23 += i12;
                            i25 += i22;
                            i14 += this.af * -1842132067;
                            i26 += i19;
                            i20 = i28;
                        }
                        i20 = i24;
                        while (true) {
                            i24 = i20 - 1;
                            if (i24 >= 0) {
                                aa(this.aj, i14, 0, 0, i27 >> 14, i23 >> 14, i25, i21, (byte) -106);
                                i27 += i11;
                                i25 += i22;
                                i14 += -1842132067 * this.af;
                                i23 += i12;
                                i20 = i24;
                            } else {
                                return;
                            }
                        }
                    }
                    i24 = i15 - i2;
                    i13 = i2 - i3;
                    i14 = this.bo[i3];
                    i26 = i20;
                    i20 = i13;
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i25, i21, (byte) -112);
                        i23 += i12;
                        i25 += i22;
                        i14 += this.af * -1842132067;
                        i26 += i19;
                        i20 = i28;
                    }
                    i20 = i24;
                    while (true) {
                        i24 = i20 - 1;
                        if (i24 >= 0) {
                            aa(this.aj, i14, 0, 0, i23 >> 14, i27 >> 14, i25, i21, (byte) -55);
                            i25 += i22;
                            i14 += -1842132067 * this.af;
                            i23 += i12;
                            i27 += i11;
                            i20 = i24;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bd * 286513717) {
                if (i2 > this.bd * 286513717) {
                    i15 = this.bd * 286513717;
                } else {
                    i15 = i2;
                }
                if (i3 > 286513717 * this.bd) {
                    i3 = this.bd * 286513717;
                }
                i20 = ((i7 << 8) - (i21 * i4)) + i21;
                if (i15 < i3) {
                    i14 = i4 << 14;
                    if (i < 0) {
                        i13 = i14 - (i * i12);
                        i14 -= i * i11;
                        i20 -= i * i22;
                        i = 0;
                    } else {
                        i13 = i14;
                    }
                    i27 = i5 << 14;
                    if (i15 < 0) {
                        i27 -= i15 * i19;
                        i15 = 0;
                    }
                    if ((i15 == i || i12 >= i11) && (i != i15 || i12 <= i19)) {
                        i24 = i3 - i15;
                        i25 = i20;
                        i23 = i13;
                        i26 = i14;
                        i20 = i15 - i;
                        i14 = this.bo[i];
                        while (true) {
                            i28 = i20 - 1;
                            if (i28 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i26 >> 14, i23 >> 14, i25, i21, (byte) -35);
                            i23 += i12;
                            i25 += i22;
                            i14 += this.af * -1842132067;
                            i26 += i11;
                            i20 = i28;
                        }
                        i20 = i24;
                        while (true) {
                            i24 = i20 - 1;
                            if (i24 >= 0) {
                                aa(this.aj, i14, 0, 0, i27 >> 14, i23 >> 14, i25, i21, (byte) 22);
                                i27 += i19;
                                i25 += i22;
                                i14 += this.af * -1842132067;
                                i23 += i12;
                                i20 = i24;
                            } else {
                                return;
                            }
                        }
                    }
                    i24 = i3 - i15;
                    i25 = i20;
                    i23 = i13;
                    i26 = i14;
                    i20 = i15 - i;
                    i14 = this.bo[i];
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i23 >> 14, i26 >> 14, i25, i21, (byte) -65);
                        i23 += i12;
                        i25 += i22;
                        i14 += -1842132067 * this.af;
                        i26 += i11;
                        i20 = i28;
                    }
                    i20 = i24;
                    while (true) {
                        i24 = i20 - 1;
                        if (i24 >= 0) {
                            aa(this.aj, i14, 0, 0, i23 >> 14, i27 >> 14, i25, i21, (byte) -109);
                            i25 += i22;
                            i14 += -1842132067 * this.af;
                            i23 += i12;
                            i27 += i19;
                            i20 = i24;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i12 * i);
                    i14 -= i * i11;
                    i20 -= i * i22;
                    i = 0;
                } else {
                    i13 = i14;
                }
                i23 = i6 << 14;
                if (i3 < 0) {
                    i23 -= i3 * i19;
                    i3 = 0;
                }
                if ((i3 == i || i12 >= i11) && (i3 != i || i19 <= i11)) {
                    i24 = i15 - i3;
                    i25 = i20;
                    i26 = i13;
                    i27 = i14;
                    i20 = i3 - i;
                    i14 = this.bo[i];
                    while (true) {
                        i28 = i20 - 1;
                        if (i28 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i27 >> 14, i26 >> 14, i25, i21, (byte) 27);
                        i27 += i11;
                        i25 += i22;
                        i14 += -1842132067 * this.af;
                        i26 += i12;
                        i20 = i28;
                    }
                    i12 = i23;
                    i20 = i24;
                    i23 = i27;
                    while (true) {
                        i27 = i20 - 1;
                        if (i27 >= 0) {
                            aa(this.aj, i14, 0, 0, i23 >> 14, i12 >> 14, i25, i21, (byte) -58);
                            i25 += i22;
                            i14 += this.af * -1842132067;
                            i12 += i19;
                            i23 += i11;
                            i20 = i27;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i15 - i3;
                i25 = i20;
                i26 = i13;
                i27 = i14;
                i20 = i3 - i;
                i14 = this.bo[i];
                while (true) {
                    i28 = i20 - 1;
                    if (i28 < 0) {
                        break;
                    }
                    aa(this.aj, i14, 0, 0, i26 >> 14, i27 >> 14, i25, i21, (byte) 4);
                    i27 += i11;
                    i25 += i22;
                    i14 += this.af * -1842132067;
                    i26 += i12;
                    i20 = i28;
                }
                i12 = i27;
                i20 = i24;
                while (true) {
                    i27 = i20 - 1;
                    if (i27 >= 0) {
                        aa(this.aj, i14, 0, 0, i23 >> 14, i12 >> 14, i25, i21, (byte) -75);
                        i23 += i19;
                        i25 += i22;
                        i14 += this.af * -1842132067;
                        i12 += i11;
                        i20 = i27;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void ar(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = i5 - i4;
        int i14 = i2 - i;
        int i15 = i6 - i4;
        int i16 = i3 - i;
        int i17 = i8 - i7;
        int i18 = i9 - i7;
        if (i3 != i2) {
            i10 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i10 = 0;
        }
        if (i2 != i) {
            i11 = (i13 << 14) / i14;
        } else {
            i11 = 0;
        }
        if (i3 != i) {
            i12 = (i15 << 14) / i16;
        } else {
            i12 = 0;
        }
        int i19 = (i13 * i16) - (i14 * i15);
        if (i19 != 0) {
            int i20 = (((i16 * i17) - (i14 * i18)) << 8) / i19;
            int i21 = (((i13 * i18) - (i15 * i17)) << 8) / i19;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > 222307817 * this.bd) {
                            i3 = this.bd * -1128842329;
                        }
                        if (i > 286513717 * this.bd) {
                            i = this.bd * 286513717;
                        }
                        i19 = ((i8 << 8) - (i5 * i20)) + i20;
                        if (i3 < i) {
                            i13 = i5 << 14;
                            if (i2 < 0) {
                                i14 = i13 - (i11 * i2);
                                i13 -= i2 * i10;
                                i19 -= i21 * i2;
                                i2 = 0;
                            } else {
                                i14 = i13;
                            }
                            i22 = i6 << 14;
                            if (i3 < 0) {
                                i22 -= i12 * i3;
                                i3 = 0;
                            }
                            if ((i2 == i3 || i11 >= i10) && (i3 != i2 || i11 <= i12)) {
                                i23 = i - i3;
                                i24 = i19;
                                i25 = i13;
                                i26 = i14;
                                i19 = i3 - i2;
                                i14 = this.bo[i2];
                                while (true) {
                                    i27 = i19 - 1;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    aa(this.aj, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, (byte) 41);
                                    i26 += i11;
                                    i24 += i21;
                                    i14 += -1842132067 * this.af;
                                    i25 += i10;
                                    i19 = i27;
                                }
                                i19 = i23;
                                while (true) {
                                    i23 = i19 - 1;
                                    if (i23 >= 0) {
                                        aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, (byte) 64);
                                        i24 += i21;
                                        i14 += this.af * -1842132067;
                                        i22 += i12;
                                        i26 += i11;
                                        i19 = i23;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i23 = i - i3;
                            i24 = i19;
                            i25 = i13;
                            i26 = i14;
                            i19 = i3 - i2;
                            i14 = this.bo[i2];
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, (byte) -5);
                                i26 += i11;
                                i24 += i21;
                                i14 += -1842132067 * this.af;
                                i25 += i10;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, (byte) -83);
                                    i22 += i12;
                                    i24 += i21;
                                    i14 += this.af * 945614956;
                                    i26 += i11;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i14 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i14 - (i2 * i11);
                            i22 = i14 - (i10 * i2);
                            i24 = i19 - (i2 * i21);
                            i2 = 0;
                            i19 = i13;
                        } else {
                            i24 = i19;
                            i22 = i14;
                            i19 = i14;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i26 -= i * i12;
                            i = 0;
                        }
                        if (i11 < i10) {
                            i23 = i3 - i;
                            i13 = i - i2;
                            i14 = this.bo[i2];
                            i25 = i19;
                            i19 = i13;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, (byte) -73);
                                i22 += i10;
                                i24 += i21;
                                i14 += this.af * 402158872;
                                i25 += i11;
                                i19 = i27;
                            }
                            i19 = i23;
                            while (true) {
                                i23 = i19 - 1;
                                if (i23 >= 0) {
                                    aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, (byte) -59);
                                    i26 += i12;
                                    i24 += i21;
                                    i14 += this.af * -1842132067;
                                    i22 += i10;
                                    i19 = i23;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i3 - i;
                        i13 = i - i2;
                        i14 = this.bo[i2];
                        i25 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, (byte) 0);
                            i22 += i10;
                            i24 += i21;
                            i14 += -1842132067 * this.af;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, (byte) -22);
                                i24 += i21;
                                i14 += -1842132067 * this.af;
                                i22 += i10;
                                i26 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < 707976451 * this.bd) {
                    if (i > this.bd * 286513717) {
                        i = 286513717 * this.bd;
                    }
                    if (i2 > this.bd * -1516965481) {
                        i2 = this.bd * 286513717;
                    }
                    i19 = ((i9 << 8) - (i20 * i6)) + i20;
                    if (i < i2) {
                        i13 = i6 << 14;
                        if (i3 < 0) {
                            i22 = i13 - (i3 * i10);
                            i13 -= i12 * i3;
                            i24 = i19 - (i3 * i21);
                            i3 = 0;
                            i19 = i13;
                        } else {
                            i24 = i19;
                            i22 = i13;
                            i19 = i13;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i26 -= i11 * i;
                            i = 0;
                        }
                        if (i10 < i12) {
                            i23 = i2 - i;
                            i13 = i - i3;
                            i14 = this.bo[i3];
                            i25 = i19;
                            i19 = i13;
                            while (true) {
                                i27 = i19 - 1;
                                if (i27 < 0) {
                                    break;
                                }
                                aa(this.aj, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, (byte) -58);
                                i22 += i10;
                                i24 += i21;
                                i14 += this.af * -1442820907;
                                i25 += i12;
                                i19 = i27;
                            }
                            i12 = i22;
                            i19 = i23;
                            while (true) {
                                i22 = i19 - 1;
                                if (i22 >= 0) {
                                    aa(this.aj, i14, 0, 0, i12 >> 14, i26 >> 14, i24, i20, (byte) 43);
                                    i26 += i11;
                                    i24 += i21;
                                    i14 += this.af * 1742936755;
                                    i12 += i10;
                                    i19 = i22;
                                } else {
                                    return;
                                }
                            }
                        }
                        i23 = i2 - i;
                        i13 = i - i3;
                        i14 = this.bo[i3];
                        i25 = i19;
                        i19 = i13;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, (byte) -26);
                            i22 += i10;
                            i24 += i21;
                            i14 += this.af * 771869160;
                            i25 += i12;
                            i19 = i27;
                        }
                        i12 = i22;
                        i19 = i23;
                        i22 = i26;
                        while (true) {
                            i26 = i19 - 1;
                            if (i26 >= 0) {
                                aa(this.aj, i14, 0, 0, i22 >> 14, i12 >> 14, i24, i20, (byte) 68);
                                i24 += i21;
                                i14 += this.af * -1842132067;
                                i12 += i10;
                                i22 += i11;
                                i19 = i26;
                            } else {
                                return;
                            }
                        }
                    }
                    i13 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i13 - (i3 * i10);
                        i13 -= i12 * i3;
                        i19 -= i3 * i21;
                        i3 = 0;
                    } else {
                        i14 = i13;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i2 * i11;
                        i2 = 0;
                    }
                    if (i10 < i12) {
                        i23 = i - i2;
                        i16 = i2 - i3;
                        i24 = i19;
                        i22 = i13;
                        i25 = i14;
                        i14 = this.bo[i3];
                        i19 = i16;
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, (byte) -26);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.af * -1448555511;
                            i25 += i10;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, (byte) -53);
                                i26 += i11;
                                i24 += i21;
                                i14 += -1842132067 * this.af;
                                i22 += i12;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i - i2;
                    i16 = i2 - i3;
                    i24 = i19;
                    i22 = i13;
                    i25 = i14;
                    i14 = this.bo[i3];
                    i19 = i16;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, (byte) -95);
                        i22 += i12;
                        i24 += i21;
                        i14 += this.af * -38845258;
                        i25 += i10;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, (byte) 41);
                            i24 += i21;
                            i14 += -1842132067 * this.af;
                            i22 += i12;
                            i26 += i11;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < this.bd * -159348094) {
                if (i2 > this.bd * 286513717) {
                    i2 = this.bd * -1386674416;
                }
                if (i3 > 286513717 * this.bd) {
                    i3 = this.bd * -506803939;
                }
                i19 = ((i7 << 8) - (i20 * i4)) + i20;
                if (i2 < i3) {
                    i14 = i4 << 14;
                    if (i < 0) {
                        i13 = i14 - (i * i12);
                        i14 -= i * i11;
                        i19 -= i * i21;
                        i = 0;
                    } else {
                        i13 = i14;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i26 -= i10 * i2;
                        i2 = 0;
                    }
                    if ((i2 == i || i12 >= i11) && (i != i2 || i12 <= i10)) {
                        i23 = i3 - i2;
                        i24 = i19;
                        i22 = i13;
                        i25 = i14;
                        i19 = i2 - i;
                        i14 = this.bo[i];
                        while (true) {
                            i27 = i19 - 1;
                            if (i27 < 0) {
                                break;
                            }
                            aa(this.aj, i14, 0, 0, i25 >> 14, i22 >> 14, i24, i20, (byte) 18);
                            i22 += i12;
                            i24 += i21;
                            i14 += this.af * -1842132067;
                            i25 += i11;
                            i19 = i27;
                        }
                        i19 = i23;
                        while (true) {
                            i23 = i19 - 1;
                            if (i23 >= 0) {
                                aa(this.aj, i14, 0, 0, i26 >> 14, i22 >> 14, i24, i20, (byte) 33);
                                i24 += i21;
                                i14 += this.af * -1842132067;
                                i22 += i12;
                                i26 += i10;
                                i19 = i23;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i3 - i2;
                    i24 = i19;
                    i22 = i13;
                    i25 = i14;
                    i19 = i2 - i;
                    i14 = this.bo[i];
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i22 >> 14, i25 >> 14, i24, i20, (byte) 38);
                        i22 += i12;
                        i24 += i21;
                        i14 += 1772087893 * this.af;
                        i25 += i11;
                        i19 = i27;
                    }
                    i19 = i23;
                    while (true) {
                        i23 = i19 - 1;
                        if (i23 >= 0) {
                            aa(this.aj, i14, 0, 0, i22 >> 14, i26 >> 14, i24, i20, (byte) -1);
                            i26 += i10;
                            i24 += i21;
                            i14 += -693942709 * this.af;
                            i22 += i12;
                            i19 = i23;
                        } else {
                            return;
                        }
                    }
                }
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i12 * i);
                    i26 = i14 - (i * i11);
                    i24 = i19 - (i * i21);
                    i = 0;
                    i19 = i13;
                } else {
                    i24 = i19;
                    i26 = i14;
                    i19 = i14;
                }
                i22 = i6 << 14;
                if (i3 < 0) {
                    i22 -= i3 * i10;
                    i3 = 0;
                }
                if ((i3 == i || i12 >= i11) && (i3 != i || i10 <= i11)) {
                    i23 = i2 - i3;
                    i13 = i3 - i;
                    i14 = this.bo[i];
                    i25 = i19;
                    i19 = i13;
                    while (true) {
                        i27 = i19 - 1;
                        if (i27 < 0) {
                            break;
                        }
                        aa(this.aj, i14, 0, 0, i26 >> 14, i25 >> 14, i24, i20, (byte) 36);
                        i26 += i11;
                        i24 += i21;
                        i14 += -1842132067 * this.af;
                        i25 += i12;
                        i19 = i27;
                    }
                    i12 = i26;
                    i19 = i23;
                    while (true) {
                        i26 = i19 - 1;
                        if (i26 >= 0) {
                            aa(this.aj, i14, 0, 0, i12 >> 14, i22 >> 14, i24, i20, (byte) -121);
                            i22 += i10;
                            i24 += i21;
                            i14 += this.af * -1842132067;
                            i12 += i11;
                            i19 = i26;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i2 - i3;
                i13 = i3 - i;
                i14 = this.bo[i];
                i25 = i19;
                i19 = i13;
                while (true) {
                    i27 = i19 - 1;
                    if (i27 < 0) {
                        break;
                    }
                    aa(this.aj, i14, 0, 0, i25 >> 14, i26 >> 14, i24, i20, (byte) 45);
                    i26 += i11;
                    i24 += i21;
                    i14 += this.af * -1842132067;
                    i25 += i12;
                    i19 = i27;
                }
                i12 = i22;
                i19 = i23;
                i22 = i26;
                while (true) {
                    i26 = i19 - 1;
                    if (i26 >= 0) {
                        aa(this.aj, i14, 0, 0, i12 >> 14, i22 >> 14, i24, i20, (byte) -17);
                        i24 += i21;
                        i14 += this.af * -1842132067;
                        i12 += i10;
                        i22 += i11;
                        i19 = i26;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void aa(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            if (this.ad) {
                if (i5 > -1431886479 * this.bu) {
                    i5 = -1431886479 * this.bu;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i8 = i + i4;
                int i9 = (i7 * i4) + i6;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                if (this.bm) {
                    i10 = (i5 - i4) >> 2;
                    i11 = i7 << 2;
                    if (-1029352189 * this.bh == 0) {
                        if (i10 > 0) {
                            do {
                                i12 = am[i9 >> 8];
                                i9 += i11;
                                i13 = i8 + 1;
                                iArr[i8] = i12;
                                i8 = i13 + 1;
                                iArr[i13] = i12;
                                i13 = i8 + 1;
                                iArr[i8] = i12;
                                i8 = i13 + 1;
                                iArr[i13] = i12;
                                i10--;
                            } while (i10 > 0);
                            i10 = i9;
                        } else {
                            i10 = i9;
                        }
                        i9 = (i5 - i4) & 3;
                        if (i9 > 0) {
                            i11 = am[i10 >> 8];
                            while (true) {
                                i10 = i8 + 1;
                                iArr[i8] = i11;
                                i9--;
                                if (i9 > 0) {
                                    i8 = i10;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    i12 = -1029352189 * this.bh;
                    i13 = 256 - (-1029352189 * this.bh);
                    if (i10 > 0) {
                        do {
                            i14 = am[i9 >> 8];
                            i9 += i11;
                            i14 = ((((i14 & 65280) * i13) >> 8) & 65280) + ((((16711935 & i14) * i13) >> 8) & 16711935);
                            i15 = iArr[i8];
                            int i16 = i8 + 1;
                            iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                            i8 = iArr[i16];
                            i15 = i16 + 1;
                            iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                            i8 = iArr[i15];
                            i16 = i15 + 1;
                            iArr[i15] = ((((i8 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i8) * i12) >> 8) & 16711935) + i14);
                            i15 = iArr[i16];
                            i8 = i16 + 1;
                            iArr[i16] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i9 = am[i9 >> 8];
                        i11 = ((((65280 & i9) * i13) >> 8) & 65280) + ((((i9 & 16711935) * i13) >> 8) & 16711935);
                        i9 = i10;
                        while (true) {
                            i13 = iArr[i8];
                            i10 = i8 + 1;
                            iArr[i8] = ((((i13 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i13) * i12) >> 8) & 16711935) + i11);
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i10 = i5 - i4;
                if (-1029352189 * this.bh == 0) {
                    while (true) {
                        i11 = i8 + 1;
                        iArr[i8] = am[i9 >> 8];
                        i9 += i7;
                        i10--;
                        if (i10 > 0) {
                            i8 = i11;
                        } else {
                            return;
                        }
                    }
                }
                i12 = this.bh * -1029352189;
                i13 = 256 - (-1029352189 * this.bh);
                int i17 = i10;
                i10 = i8;
                i8 = i17;
                while (true) {
                    i11 = am[i9 >> 8];
                    i9 += i7;
                    i14 = ((((16711935 & i11) * i13) >> 8) & 16711935) + ((((i11 & 65280) * i13) >> 8) & 65280);
                    i15 = iArr[i10];
                    i11 = i10 + 1;
                    iArr[i10] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                    i8--;
                    if (i8 > 0) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.aa(" + ')');
        }
    }

    final void ab(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.ad) {
            if (i5 > 266571734 * this.bu) {
                i5 = -1967101846 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bm) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (177107918 * this.bh == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = am[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i11 = am[i9 >> 8];
                        i9 = i10;
                        while (true) {
                            i10 = i8 + 1;
                            iArr[i8] = i11;
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = -1029352189 * this.bh;
                i13 = 256 - (-1029352189 * this.bh);
                if (i10 > 0) {
                    do {
                        i14 = am[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 1926706848) * i13) >> 8) & 1297981482) + ((((1730411356 & i14) * i13) >> 8) & 2139810211);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & -1677265185) + (((((16711935 & i15) * i12) >> 8) & 1683256440) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 997878966) * i12) >> 8) & 1930321518) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = ((((i8 & 65280) * i12) >> 8) & 120305676) + (((((16711935 & i8) * i12) >> 8) & 16711935) + i14);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((2122663484 & i15) * i12) >> 8) & -1914451645);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = (i5 - i4) & 3;
                if (i10 > 0) {
                    i9 = am[i9 >> 8];
                    i11 = ((((65280 & i9) * i13) >> 8) & -1626176003) + ((((i9 & 16711935) * i13) >> 8) & 119784922);
                    i9 = i10;
                    while (true) {
                        i13 = iArr[i8];
                        i10 = i8 + 1;
                        iArr[i8] = ((((i13 & 1688279176) * i12) >> 8) & -542139817) + (((((16711935 & i13) * i12) >> 8) & 2020537972) + i11);
                        i9--;
                        if (i9 > 0) {
                            i8 = i10;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (-1029352189 * this.bh == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = am[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bh * -1029352189;
            i13 = 256 - (-1029352189 * this.bh);
            while (true) {
                i11 = am[i9 >> 8];
                i9 += i7;
                i14 = ((((715136840 & i11) * i13) >> 8) & -1163908104) + ((((i11 & 65280) * i13) >> 8) & -1299409230);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((i15 & 1291589076) * i12) >> 8) & 16711935)) + ((((-162905237 & i15) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void bh(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.ad) {
            if (i5 > -1431886479 * this.bu) {
                i5 = -1431886479 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bm) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (-1029352189 * this.bh == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = am[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i11 = am[i9 >> 8];
                        i9 = i10;
                        while (true) {
                            i10 = i8 + 1;
                            iArr[i8] = i11;
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = -1029352189 * this.bh;
                i13 = 256 - (-1029352189 * this.bh);
                if (i10 > 0) {
                    do {
                        i14 = am[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 65280) * i13) >> 8) & 65280) + ((((16711935 & i14) * i13) >> 8) & 16711935);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = ((((i8 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i8) * i12) >> 8) & 16711935) + i14);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = i8;
                i8 = i9;
                i9 = (i5 - i4) & 3;
                if (i9 > 0) {
                    i8 = am[i8 >> 8];
                    i11 = ((((65280 & i8) * i13) >> 8) & 65280) + ((((i8 & 16711935) * i13) >> 8) & 16711935);
                    while (true) {
                        i13 = iArr[i10];
                        i8 = i10 + 1;
                        iArr[i10] = ((((i13 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i13) * i12) >> 8) & 16711935) + i11);
                        i9--;
                        if (i9 > 0) {
                            i10 = i8;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (-1029352189 * this.bh == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = am[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bh * -1029352189;
            i13 = 256 - (-1029352189 * this.bh);
            while (true) {
                i11 = am[i9 >> 8];
                i9 += i7;
                i14 = ((((16711935 & i11) * i13) >> 8) & 16711935) + ((((i11 & 65280) * i13) >> 8) & 65280);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void bm(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.ad) {
            if (i5 > -1431886479 * this.bu) {
                i5 = -1431886479 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bm) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (-1029352189 * this.bh == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = am[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                    }
                    i10 = (i5 - i4) & 3;
                    if (i10 > 0) {
                        i11 = am[i9 >> 8];
                        i9 = i10;
                        while (true) {
                            i10 = i8 + 1;
                            iArr[i8] = i11;
                            i9--;
                            if (i9 > 0) {
                                i8 = i10;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = -1029352189 * this.bh;
                i13 = 1113411529 - (-1029352189 * this.bh);
                if (i10 > 0) {
                    do {
                        i14 = am[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 1257628429) * i13) >> 8) & 65280) + ((((-869415417 & i14) * i13) >> 8) & 267237092);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & -1799839748) * i12) >> 8) & -918830145) + (((((1386600520 & i15) * i12) >> 8) & -443555061) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 426110546) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 176573479);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = ((((i8 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i8) * i12) >> 8) & -1525024627) + i14);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((i15 & 1649163210) * i12) >> 8) & 727550772)) + ((((65280 & i15) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                }
                i10 = (i5 - i4) & 3;
                if (i10 > 0) {
                    i9 = am[i9 >> 8];
                    i11 = ((((65280 & i9) * i13) >> 8) & 81245104) + ((((i9 & -1831167290) * i13) >> 8) & 780765300);
                    i9 = i10;
                    while (true) {
                        i13 = iArr[i8];
                        i10 = i8 + 1;
                        iArr[i8] = ((((i13 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i13) * i12) >> 8) & 16711935) + i11);
                        i9--;
                        if (i9 > 0) {
                            i8 = i10;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (941021407 * this.bh == 0) {
                int i17 = i10;
                i10 = i8;
                i8 = i17;
                while (true) {
                    i11 = i10 + 1;
                    iArr[i10] = am[i9 >> 8];
                    i9 += i7;
                    i8--;
                    if (i8 > 0) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bh * 1817776802;
            i13 = 256 - (-419572481 * this.bh);
            while (true) {
                i11 = am[i9 >> 8];
                i9 += i7;
                i14 = ((((16711935 & i11) * i13) >> 8) & 762396723) + ((((i11 & 65280) * i13) >> 8) & 65280);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 1279383641)) + ((((65280 & i15) * i12) >> 8) & -141048215);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    final void bp(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.ad) {
            if (i5 > -1431886479 * this.bu) {
                i5 = -1431886479 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i8 = i + i4;
            int i9 = (i7 * i4) + i6;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (this.bm) {
                i10 = (i5 - i4) >> 2;
                i11 = i7 << 2;
                if (-1029352189 * this.bh == 0) {
                    if (i10 > 0) {
                        do {
                            i12 = am[i9 >> 8];
                            i9 += i11;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i13 = i8 + 1;
                            iArr[i8] = i12;
                            i8 = i13 + 1;
                            iArr[i13] = i12;
                            i10--;
                        } while (i10 > 0);
                        i10 = i8;
                        i8 = i9;
                    } else {
                        i10 = i8;
                        i8 = i9;
                    }
                    i9 = (i5 - i4) & 3;
                    if (i9 > 0) {
                        i11 = am[i8 >> 8];
                        while (true) {
                            i8 = i10 + 1;
                            iArr[i10] = i11;
                            i9--;
                            if (i9 > 0) {
                                i10 = i8;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                i12 = -1029352189 * this.bh;
                i13 = 256 - (-1029352189 * this.bh);
                if (i10 > 0) {
                    do {
                        i14 = am[i9 >> 8];
                        i9 += i11;
                        i14 = ((((i14 & 65280) * i13) >> 8) & 65280) + ((((16711935 & i14) * i13) >> 8) & 16711935);
                        i15 = iArr[i8];
                        int i16 = i8 + 1;
                        iArr[i8] = ((((i15 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i15) * i12) >> 8) & 16711935) + i14);
                        i8 = iArr[i16];
                        i15 = i16 + 1;
                        iArr[i16] = (((((i8 & 16711935) * i12) >> 8) & 16711935) + i14) + ((((65280 & i8) * i12) >> 8) & 65280);
                        i8 = iArr[i15];
                        i16 = i15 + 1;
                        iArr[i15] = ((((i8 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i8) * i12) >> 8) & 16711935) + i14);
                        i15 = iArr[i16];
                        i8 = i16 + 1;
                        iArr[i16] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                        i10--;
                    } while (i10 > 0);
                    i10 = i8;
                    i8 = i9;
                } else {
                    i10 = i8;
                    i8 = i9;
                }
                i9 = (i5 - i4) & 3;
                if (i9 > 0) {
                    i8 = am[i8 >> 8];
                    i11 = ((((65280 & i8) * i13) >> 8) & 65280) + ((((i8 & 16711935) * i13) >> 8) & 16711935);
                    while (true) {
                        i13 = iArr[i10];
                        i8 = i10 + 1;
                        iArr[i10] = ((((i13 & 65280) * i12) >> 8) & 65280) + (((((16711935 & i13) * i12) >> 8) & 16711935) + i11);
                        i9--;
                        if (i9 > 0) {
                            i10 = i8;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            i10 = i5 - i4;
            if (-1029352189 * this.bh == 0) {
                while (true) {
                    i11 = i8 + 1;
                    iArr[i8] = am[i9 >> 8];
                    i9 += i7;
                    i10--;
                    if (i10 > 0) {
                        i8 = i11;
                    } else {
                        return;
                    }
                }
            }
            i12 = this.bh * -1029352189;
            i13 = 256 - (-1029352189 * this.bh);
            while (true) {
                i11 = am[i9 >> 8];
                i9 += i7;
                i14 = ((((16711935 & i11) * i13) >> 8) & 16711935) + ((((i11 & 65280) * i13) >> 8) & 65280);
                i15 = iArr[i8];
                i11 = i8 + 1;
                iArr[i8] = (i14 + ((((i15 & 16711935) * i12) >> 8) & 16711935)) + ((((65280 & i15) * i12) >> 8) & 65280);
                i10--;
                if (i10 > 0) {
                    i8 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public final void ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        int i8;
        int i9;
        if (i2 != i) {
            try {
                int i10 = ((i5 - i4) << 14) / (i2 - i);
            } catch (Throwable e) {
                throw ei.ac(e, "cq.ak(" + ')');
            }
        }
        i10 = 0;
        if (i3 != i2) {
            i8 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i8 = 0;
        }
        if (i != i3) {
            i9 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i9 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < this.bd * 286513717) {
                    if (i3 > this.bd * 286513717) {
                        i11 = 286513717 * this.bd;
                    } else {
                        i11 = i3;
                    }
                    if (i > 286513717 * this.bd) {
                        i12 = 286513717 * this.bd;
                    } else {
                        i12 = i;
                    }
                    if (i11 < i12) {
                        i13 = i5 << 14;
                        if (i2 < 0) {
                            i14 = i13 - (i2 * i10);
                            i13 -= i2 * i8;
                            i2 = 0;
                        } else {
                            i14 = i13;
                        }
                        i15 = i6 << 14;
                        if (i11 < 0) {
                            i15 -= i11 * i9;
                            i11 = 0;
                        }
                        if ((i11 == i2 || i10 >= i8) && (i11 != i2 || i10 <= i9)) {
                            i16 = i12 - i11;
                            i17 = i13;
                            i18 = i14;
                            i13 = i11 - i2;
                            i11 = this.bo[i2];
                            while (true) {
                                i19 = i13 - 1;
                                if (i19 < 0) {
                                    break;
                                }
                                ap(this.aj, i11, i7, 0, i17 >> 14, i18 >> 14, 261718259);
                                i18 += i10;
                                i11 += this.af * -1842132067;
                                i17 += i8;
                                i13 = i19;
                            }
                            i8 = i15;
                            i13 = i16;
                            i15 = i18;
                            while (true) {
                                i18 = i13 - 1;
                                if (i18 >= 0) {
                                    ap(this.aj, i11, i7, 0, i8 >> 14, i15 >> 14, -2138690343);
                                    i11 += this.af * -1842132067;
                                    i8 += i9;
                                    i15 += i10;
                                    i13 = i18;
                                } else {
                                    return;
                                }
                            }
                        }
                        i16 = i12 - i11;
                        i17 = i13;
                        i18 = i14;
                        i13 = i11 - i2;
                        i11 = this.bo[i2];
                        while (true) {
                            i19 = i13 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            ap(this.aj, i11, i7, 0, i18 >> 14, i17 >> 14, 1751978529);
                            i18 += i10;
                            i11 += this.af * -1842132067;
                            i17 += i8;
                            i13 = i19;
                        }
                        i8 = i18;
                        i13 = i16;
                        while (true) {
                            i18 = i13 - 1;
                            if (i18 >= 0) {
                                ap(this.aj, i11, i7, 0, i8 >> 14, i15 >> 14, 2019746617);
                                i15 += i9;
                                i11 += -1842132067 * this.af;
                                i8 += i10;
                                i13 = i18;
                            } else {
                                return;
                            }
                        }
                    }
                    i14 = i5 << 14;
                    if (i2 < 0) {
                        i13 = i14 - (i10 * i2);
                        i15 = i14 - (i2 * i8);
                        i2 = 0;
                    } else {
                        i13 = i14;
                        i15 = i14;
                    }
                    i18 = i4 << 14;
                    if (i12 < 0) {
                        i18 -= i12 * i9;
                        i14 = 0;
                    } else {
                        i14 = i12;
                    }
                    if (i10 < i8) {
                        i16 = i11 - i14;
                        i14 -= i2;
                        i11 = this.bo[i2];
                        i17 = i13;
                        i13 = i14;
                        while (true) {
                            i19 = i13 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            ap(this.aj, i11, i7, 0, i17 >> 14, i15 >> 14, 1724907634);
                            i15 += i8;
                            i11 += -1842132067 * this.af;
                            i17 += i10;
                            i13 = i19;
                        }
                        i10 = i15;
                        i13 = i16;
                        while (true) {
                            i15 = i13 - 1;
                            if (i15 >= 0) {
                                ap(this.aj, i11, i7, 0, i18 >> 14, i10 >> 14, -614106656);
                                i18 += i9;
                                i11 += this.af * -1842132067;
                                i10 += i8;
                                i13 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i11 - i14;
                    i14 -= i2;
                    i11 = this.bo[i2];
                    i17 = i13;
                    i13 = i14;
                    while (true) {
                        i19 = i13 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        ap(this.aj, i11, i7, 0, i15 >> 14, i17 >> 14, -700360225);
                        i15 += i8;
                        i11 += -1842132067 * this.af;
                        i17 += i10;
                        i13 = i19;
                    }
                    i10 = i15;
                    i13 = i16;
                    i15 = i18;
                    while (true) {
                        i18 = i13 - 1;
                        if (i18 >= 0) {
                            ap(this.aj, i11, i7, 0, i10 >> 14, i15 >> 14, -70923315);
                            i11 += this.af * -1842132067;
                            i10 += i8;
                            i15 += i9;
                            i13 = i18;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < 286513717 * this.bd) {
                if (i > this.bd * 286513717) {
                    i12 = 286513717 * this.bd;
                } else {
                    i12 = i;
                }
                if (i2 > this.bd * 286513717) {
                    i11 = 286513717 * this.bd;
                } else {
                    i11 = i2;
                }
                if (i12 < i11) {
                    i13 = i6 << 14;
                    if (i3 < 0) {
                        i14 = i13 - (i3 * i8);
                        i13 -= i3 * i9;
                        i3 = 0;
                    } else {
                        i14 = i13;
                    }
                    i18 = i4 << 14;
                    if (i12 < 0) {
                        i18 -= i12 * i10;
                        i12 = 0;
                    }
                    if (i8 < i9) {
                        i16 = i11 - i12;
                        i12 -= i3;
                        i11 = this.bo[i3];
                        i17 = i13;
                        i15 = i14;
                        i13 = i12;
                        while (true) {
                            i19 = i13 - 1;
                            if (i19 < 0) {
                                break;
                            }
                            ap(this.aj, i11, i7, 0, i15 >> 14, i17 >> 14, -81784487);
                            i15 += i8;
                            i11 += this.af * -1842132067;
                            i17 += i9;
                            i13 = i19;
                        }
                        i13 = i16;
                        while (true) {
                            i16 = i13 - 1;
                            if (i16 >= 0) {
                                ap(this.aj, i11, i7, 0, i15 >> 14, i18 >> 14, 1808700520);
                                i18 += i10;
                                i11 += -1842132067 * this.af;
                                i15 += i8;
                                i13 = i16;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i11 - i12;
                    i12 -= i3;
                    i11 = this.bo[i3];
                    i17 = i13;
                    i15 = i14;
                    i13 = i12;
                    while (true) {
                        i19 = i13 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        ap(this.aj, i11, i7, 0, i17 >> 14, i15 >> 14, 1371640560);
                        i15 += i8;
                        i11 += this.af * -1842132067;
                        i17 += i9;
                        i13 = i19;
                    }
                    i13 = i16;
                    while (true) {
                        i16 = i13 - 1;
                        if (i16 >= 0) {
                            ap(this.aj, i11, i7, 0, i18 >> 14, i15 >> 14, 107467086);
                            i11 += this.af * -1842132067;
                            i15 += i8;
                            i18 += i10;
                            i13 = i16;
                        } else {
                            return;
                        }
                    }
                }
                i13 = i6 << 14;
                if (i3 < 0) {
                    i14 = i13 - (i3 * i8);
                    i13 -= i9 * i3;
                    i3 = 0;
                } else {
                    i14 = i13;
                }
                i18 = i5 << 14;
                if (i11 < 0) {
                    i18 -= i11 * i10;
                    i11 = 0;
                }
                if (i8 < i9) {
                    i16 = i12 - i11;
                    i12 = i11 - i3;
                    i11 = this.bo[i3];
                    i15 = i13;
                    i17 = i14;
                    i13 = i12;
                    while (true) {
                        i19 = i13 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        ap(this.aj, i11, i7, 0, i17 >> 14, i15 >> 14, 4923577);
                        i15 += i9;
                        i11 += -1842132067 * this.af;
                        i17 += i8;
                        i13 = i19;
                    }
                    i8 = i15;
                    i13 = i16;
                    while (true) {
                        i15 = i13 - 1;
                        if (i15 >= 0) {
                            ap(this.aj, i11, i7, 0, i18 >> 14, i8 >> 14, 1601458312);
                            i18 += i10;
                            i11 += -1842132067 * this.af;
                            i8 += i9;
                            i13 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i16 = i12 - i11;
                i12 = i11 - i3;
                i11 = this.bo[i3];
                i15 = i13;
                i17 = i14;
                i13 = i12;
                while (true) {
                    i19 = i13 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    ap(this.aj, i11, i7, 0, i15 >> 14, i17 >> 14, -750415404);
                    i15 += i9;
                    i11 += this.af * -1842132067;
                    i17 += i8;
                    i13 = i19;
                }
                i8 = i15;
                i13 = i16;
                i15 = i18;
                while (true) {
                    i18 = i13 - 1;
                    if (i18 >= 0) {
                        ap(this.aj, i11, i7, 0, i8 >> 14, i15 >> 14, 132230681);
                        i11 += -1842132067 * this.af;
                        i8 += i9;
                        i15 += i10;
                        i13 = i18;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bd * 286513717) {
            if (i2 > 286513717 * this.bd) {
                i12 = this.bd * 286513717;
            } else {
                i12 = i2;
            }
            if (i3 > 286513717 * this.bd) {
                i11 = 286513717 * this.bd;
            } else {
                i11 = i3;
            }
            if (i12 < i11) {
                i14 = i4 << 14;
                if (i < 0) {
                    i13 = i14 - (i9 * i);
                    i14 -= i * i10;
                    i = 0;
                } else {
                    i13 = i14;
                }
                i18 = i5 << 14;
                if (i12 < 0) {
                    i18 -= i12 * i8;
                    i12 = 0;
                }
                if ((i12 == i || i9 >= i10) && (i12 != i || i9 <= i8)) {
                    i16 = i11 - i12;
                    i15 = i13;
                    i17 = i14;
                    i13 = i12 - i;
                    i11 = this.bo[i];
                    while (true) {
                        i19 = i13 - 1;
                        if (i19 < 0) {
                            break;
                        }
                        ap(this.aj, i11, i7, 0, i17 >> 14, i15 >> 14, 838167080);
                        i15 += i9;
                        i11 += this.af * -1842132067;
                        i17 += i10;
                        i13 = i19;
                    }
                    i10 = i15;
                    i13 = i16;
                    while (true) {
                        i15 = i13 - 1;
                        if (i15 >= 0) {
                            ap(this.aj, i11, i7, 0, i18 >> 14, i10 >> 14, 727488862);
                            i18 += i8;
                            i11 += this.af * -1842132067;
                            i10 += i9;
                            i13 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i16 = i11 - i12;
                i15 = i13;
                i17 = i14;
                i13 = i12 - i;
                i11 = this.bo[i];
                while (true) {
                    i19 = i13 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    ap(this.aj, i11, i7, 0, i15 >> 14, i17 >> 14, 930859516);
                    i15 += i9;
                    i11 += this.af * -1842132067;
                    i17 += i10;
                    i13 = i19;
                }
                i10 = i15;
                i13 = i16;
                i15 = i18;
                while (true) {
                    i18 = i13 - 1;
                    if (i18 >= 0) {
                        ap(this.aj, i11, i7, 0, i10 >> 14, i15 >> 14, 1022887805);
                        i11 += this.af * -1842132067;
                        i10 += i9;
                        i15 += i8;
                        i13 = i18;
                    } else {
                        return;
                    }
                }
            }
            i14 = i4 << 14;
            if (i < 0) {
                i13 = i14 - (i9 * i);
                i18 = i14 - (i10 * i);
                i = 0;
            } else {
                i13 = i14;
                i18 = i14;
            }
            i15 = i6 << 14;
            if (i11 < 0) {
                i15 -= i8 * i11;
                i14 = 0;
            } else {
                i14 = i11;
            }
            if ((i == i14 || i9 >= i10) && (i14 != i || i8 <= i10)) {
                i16 = i12 - i14;
                i14 -= i;
                i11 = this.bo[i];
                i17 = i13;
                i13 = i14;
                while (true) {
                    i19 = i13 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    ap(this.aj, i11, i7, 0, i18 >> 14, i17 >> 14, -339990129);
                    i18 += i10;
                    i11 += -1842132067 * this.af;
                    i17 += i9;
                    i13 = i19;
                }
                i13 = i16;
                while (true) {
                    i16 = i13 - 1;
                    if (i16 >= 0) {
                        ap(this.aj, i11, i7, 0, i18 >> 14, i15 >> 14, 496404798);
                        i15 += i8;
                        i11 += -1842132067 * this.af;
                        i18 += i10;
                        i13 = i16;
                    } else {
                        return;
                    }
                }
            }
            i16 = i12 - i14;
            i14 -= i;
            i11 = this.bo[i];
            i17 = i13;
            i13 = i14;
            while (true) {
                i19 = i13 - 1;
                if (i19 < 0) {
                    break;
                }
                ap(this.aj, i11, i7, 0, i17 >> 14, i18 >> 14, -2068602735);
                i18 += i10;
                i11 += -1842132067 * this.af;
                i17 += i9;
                i13 = i19;
            }
            i13 = i16;
            while (true) {
                i16 = i13 - 1;
                if (i16 >= 0) {
                    ap(this.aj, i11, i7, 0, i15 >> 14, i18 >> 14, 1977450315);
                    i11 += this.af * -1842132067;
                    i15 += i8;
                    i18 += i10;
                    i13 = i16;
                } else {
                    return;
                }
            }
        }
    }

    public final void bt(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (i2 != i) {
            i8 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i8 = 0;
        }
        if (i3 != i2) {
            i9 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i9 = 0;
        }
        if (i != i3) {
            i10 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i10 = 0;
        }
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i > i2 || i > i3) {
            if (i2 <= i3) {
                if (i2 < this.bd * 286513717) {
                    if (i3 > this.bd * 286513717) {
                        i3 = 286513717 * this.bd;
                    }
                    if (i > 286513717 * this.bd) {
                        i11 = this.bd * 286513717;
                    } else {
                        i11 = i;
                    }
                    if (i3 < i11) {
                        i12 = i5 << 14;
                        if (i2 < 0) {
                            i13 = i12 - (i2 * i8);
                            i12 -= i2 * i9;
                            i2 = 0;
                        } else {
                            i13 = i12;
                        }
                        i14 = i6 << 14;
                        if (i3 < 0) {
                            i14 -= i3 * i10;
                            i3 = 0;
                        }
                        if ((i3 == i2 || i8 >= i9) && (i3 != i2 || i8 <= i10)) {
                            i15 = i11 - i3;
                            i11 = i3 - i2;
                            i16 = this.bo[i2];
                            i17 = i12;
                            i12 = i11;
                            while (true) {
                                i18 = i12 - 1;
                                if (i18 < 0) {
                                    break;
                                }
                                ap(this.aj, i16, i7, 0, i17 >> 14, i13 >> 14, -567865832);
                                i13 += i8;
                                i16 += this.af * -1842132067;
                                i17 += i9;
                                i12 = i18;
                            }
                            i9 = i13;
                            i12 = i15;
                            while (true) {
                                i13 = i12 - 1;
                                if (i13 >= 0) {
                                    ap(this.aj, i16, i7, 0, i14 >> 14, i9 >> 14, -89811656);
                                    i14 += i10;
                                    i16 += this.af * -1842132067;
                                    i9 += i8;
                                    i12 = i13;
                                } else {
                                    return;
                                }
                            }
                        }
                        i15 = i11 - i3;
                        i11 = i3 - i2;
                        i16 = this.bo[i2];
                        i17 = i12;
                        i12 = i11;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ap(this.aj, i16, i7, 0, i13 >> 14, i17 >> 14, -1925684848);
                            i13 += i8;
                            i16 += this.af * -1842132067;
                            i17 += i9;
                            i12 = i18;
                        }
                        i9 = i14;
                        i12 = i15;
                        i14 = i13;
                        while (true) {
                            i13 = i12 - 1;
                            if (i13 >= 0) {
                                ap(this.aj, i16, i7, 0, i14 >> 14, i9 >> 14, 2973225);
                                i16 += -1842132067 * this.af;
                                i9 += i10;
                                i14 += i8;
                                i12 = i13;
                            } else {
                                return;
                            }
                        }
                    }
                    i16 = i5 << 14;
                    if (i2 < 0) {
                        i12 = i16 - (i8 * i2);
                        i14 = i16 - (i2 * i9);
                        i2 = 0;
                    } else {
                        i12 = i16;
                        i14 = i16;
                    }
                    i13 = i4 << 14;
                    if (i11 < 0) {
                        i13 -= i11 * i10;
                        i11 = 0;
                    }
                    if (i8 < i9) {
                        i15 = i3 - i11;
                        i11 -= i2;
                        i16 = this.bo[i2];
                        i17 = i12;
                        i12 = i11;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ap(this.aj, i16, i7, 0, i17 >> 14, i14 >> 14, 1038995717);
                            i14 += i9;
                            i16 += -1842132067 * this.af;
                            i17 += i8;
                            i12 = i18;
                        }
                        i8 = i14;
                        i12 = i15;
                        while (true) {
                            i14 = i12 - 1;
                            if (i14 >= 0) {
                                ap(this.aj, i16, i7, 0, i13 >> 14, i8 >> 14, -635745500);
                                i13 += i10;
                                i16 += this.af * -1842132067;
                                i8 += i9;
                                i12 = i14;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i3 - i11;
                    i11 -= i2;
                    i16 = this.bo[i2];
                    i17 = i12;
                    i12 = i11;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ap(this.aj, i16, i7, 0, i14 >> 14, i17 >> 14, -1536843711);
                        i14 += i9;
                        i16 += -1842132067 * this.af;
                        i17 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    i14 = i13;
                    while (true) {
                        i13 = i12 - 1;
                        if (i13 >= 0) {
                            ap(this.aj, i16, i7, 0, i8 >> 14, i14 >> 14, 1066175480);
                            i16 += this.af * -1842132067;
                            i8 += i9;
                            i14 += i10;
                            i12 = i13;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i3 < 286513717 * this.bd) {
                if (i > this.bd * 286513717) {
                    i = 286513717 * this.bd;
                }
                if (i2 > this.bd * 286513717) {
                    i16 = 286513717 * this.bd;
                } else {
                    i16 = i2;
                }
                int i19;
                if (i < i16) {
                    i12 = i6 << 14;
                    if (i3 < 0) {
                        i11 = i12 - (i3 * i9);
                        i12 -= i3 * i10;
                        i3 = 0;
                    } else {
                        i11 = i12;
                    }
                    i13 = i4 << 14;
                    if (i < 0) {
                        i13 -= i * i8;
                        i = 0;
                    }
                    if (i9 < i10) {
                        i15 = i16 - i;
                        i19 = i - i3;
                        i16 = this.bo[i3];
                        i17 = i12;
                        i14 = i11;
                        i12 = i19;
                        while (true) {
                            i18 = i12 - 1;
                            if (i18 < 0) {
                                break;
                            }
                            ap(this.aj, i16, i7, 0, i14 >> 14, i17 >> 14, 1125108570);
                            i14 += i9;
                            i16 += this.af * -1842132067;
                            i17 += i10;
                            i12 = i18;
                        }
                        i12 = i15;
                        while (true) {
                            i15 = i12 - 1;
                            if (i15 >= 0) {
                                ap(this.aj, i16, i7, 0, i14 >> 14, i13 >> 14, -706449212);
                                i13 += i8;
                                i16 += -1842132067 * this.af;
                                i14 += i9;
                                i12 = i15;
                            } else {
                                return;
                            }
                        }
                    }
                    i15 = i16 - i;
                    i19 = i - i3;
                    i16 = this.bo[i3];
                    i17 = i12;
                    i14 = i11;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ap(this.aj, i16, i7, 0, i17 >> 14, i14 >> 14, -678800245);
                        i14 += i9;
                        i16 += this.af * -1842132067;
                        i17 += i10;
                        i12 = i18;
                    }
                    i12 = i15;
                    while (true) {
                        i15 = i12 - 1;
                        if (i15 >= 0) {
                            ap(this.aj, i16, i7, 0, i13 >> 14, i14 >> 14, 1429096244);
                            i16 += this.af * -1842132067;
                            i14 += i9;
                            i13 += i8;
                            i12 = i15;
                        } else {
                            return;
                        }
                    }
                }
                i12 = i6 << 14;
                if (i3 < 0) {
                    i11 = i12 - (i3 * i9);
                    i12 -= i10 * i3;
                    i3 = 0;
                } else {
                    i11 = i12;
                }
                i13 = i5 << 14;
                if (i16 < 0) {
                    i13 -= i16 * i8;
                    i16 = 0;
                }
                if (i9 < i10) {
                    i15 = i - i16;
                    i19 = i16 - i3;
                    i16 = this.bo[i3];
                    i14 = i12;
                    i17 = i11;
                    i12 = i19;
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ap(this.aj, i16, i7, 0, i17 >> 14, i14 >> 14, 286706387);
                        i14 += i10;
                        i16 += -1842132067 * this.af;
                        i17 += i9;
                        i12 = i18;
                    }
                    i9 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ap(this.aj, i16, i7, 0, i13 >> 14, i9 >> 14, 1902748191);
                            i13 += i8;
                            i16 += -1842132067 * this.af;
                            i9 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i - i16;
                i19 = i16 - i3;
                i16 = this.bo[i3];
                i14 = i12;
                i17 = i11;
                i12 = i19;
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ap(this.aj, i16, i7, 0, i14 >> 14, i17 >> 14, 1144698113);
                    i14 += i10;
                    i16 += this.af * -1842132067;
                    i17 += i9;
                    i12 = i18;
                }
                i9 = i14;
                i12 = i15;
                i14 = i13;
                while (true) {
                    i13 = i12 - 1;
                    if (i13 >= 0) {
                        ap(this.aj, i16, i7, 0, i9 >> 14, i14 >> 14, 830792465);
                        i16 += -1842132067 * this.af;
                        i9 += i10;
                        i14 += i8;
                        i12 = i13;
                    } else {
                        return;
                    }
                }
            }
        } else if (i < this.bd * 286513717) {
            if (i2 > 286513717 * this.bd) {
                i2 = this.bd * 286513717;
            }
            if (i3 > 286513717 * this.bd) {
                i16 = 286513717 * this.bd;
            } else {
                i16 = i3;
            }
            if (i2 < i16) {
                i11 = i4 << 14;
                if (i < 0) {
                    i12 = i11 - (i10 * i);
                    i11 -= i * i8;
                    i = 0;
                } else {
                    i12 = i11;
                }
                i13 = i5 << 14;
                if (i2 < 0) {
                    i13 -= i2 * i9;
                    i2 = 0;
                }
                if ((i2 == i || i10 >= i8) && (i2 != i || i10 <= i9)) {
                    i15 = i16 - i2;
                    i14 = i12;
                    i17 = i11;
                    i12 = i2 - i;
                    i16 = this.bo[i];
                    while (true) {
                        i18 = i12 - 1;
                        if (i18 < 0) {
                            break;
                        }
                        ap(this.aj, i16, i7, 0, i17 >> 14, i14 >> 14, -1694886585);
                        i14 += i10;
                        i16 += this.af * -1842132067;
                        i17 += i8;
                        i12 = i18;
                    }
                    i8 = i14;
                    i12 = i15;
                    while (true) {
                        i14 = i12 - 1;
                        if (i14 >= 0) {
                            ap(this.aj, i16, i7, 0, i13 >> 14, i8 >> 14, 582023809);
                            i13 += i9;
                            i16 += this.af * -1842132067;
                            i8 += i10;
                            i12 = i14;
                        } else {
                            return;
                        }
                    }
                }
                i15 = i16 - i2;
                i14 = i12;
                i17 = i11;
                i12 = i2 - i;
                i16 = this.bo[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ap(this.aj, i16, i7, 0, i14 >> 14, i17 >> 14, 504623751);
                    i14 += i10;
                    i16 += this.af * -1842132067;
                    i17 += i8;
                    i12 = i18;
                }
                i8 = i14;
                i12 = i15;
                i14 = i13;
                while (true) {
                    i13 = i12 - 1;
                    if (i13 >= 0) {
                        ap(this.aj, i16, i7, 0, i8 >> 14, i14 >> 14, -2037343605);
                        i16 += this.af * -1842132067;
                        i8 += i10;
                        i14 += i9;
                        i12 = i13;
                    } else {
                        return;
                    }
                }
            }
            i11 = i4 << 14;
            if (i < 0) {
                i12 = i11 - (i10 * i);
                i11 -= i8 * i;
                i = 0;
            } else {
                i12 = i11;
            }
            i14 = i6 << 14;
            if (i16 < 0) {
                i14 -= i16 * i9;
                i16 = 0;
            }
            if ((i == i16 || i10 >= i8) && (i16 != i || i9 <= i8)) {
                i15 = i2 - i16;
                i17 = i12;
                i13 = i11;
                i12 = i16 - i;
                i16 = this.bo[i];
                while (true) {
                    i18 = i12 - 1;
                    if (i18 < 0) {
                        break;
                    }
                    ap(this.aj, i16, i7, 0, i13 >> 14, i17 >> 14, 1574520596);
                    i13 += i8;
                    i16 += -1842132067 * this.af;
                    i17 += i10;
                    i12 = i18;
                }
                i12 = i15;
                while (true) {
                    i15 = i12 - 1;
                    if (i15 >= 0) {
                        ap(this.aj, i16, i7, 0, i13 >> 14, i14 >> 14, -842868634);
                        i14 += i9;
                        i16 += -1842132067 * this.af;
                        i13 += i8;
                        i12 = i15;
                    } else {
                        return;
                    }
                }
            }
            i15 = i2 - i16;
            i17 = i12;
            i13 = i11;
            i12 = i16 - i;
            i16 = this.bo[i];
            while (true) {
                i18 = i12 - 1;
                if (i18 < 0) {
                    break;
                }
                ap(this.aj, i16, i7, 0, i17 >> 14, i13 >> 14, 438379721);
                i13 += i8;
                i16 += -1842132067 * this.af;
                i17 += i10;
                i12 = i18;
            }
            i12 = i15;
            while (true) {
                i15 = i12 - 1;
                if (i15 >= 0) {
                    ap(this.aj, i16, i7, 0, i14 >> 14, i13 >> 14, -531206328);
                    i16 += this.af * -1842132067;
                    i14 += i9;
                    i13 += i8;
                    i12 = i15;
                } else {
                    return;
                }
            }
        }
    }

    final void ap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (this.ad) {
                if (i5 > this.bu * -1431886479) {
                    i5 = -1431886479 * this.bu;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i7 = i + i4;
                int i8 = (i5 - i4) >> 2;
                int i9;
                if (-1029352189 * this.bh == 0) {
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        i9 = i7 + 1;
                        iArr[i7] = i2;
                        i7 = i9 + 1;
                        iArr[i9] = i2;
                        i9 = i7 + 1;
                        iArr[i7] = i2;
                        i7 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    i8 = (i5 - i4) & 3;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            i9 = i7 + 1;
                            iArr[i7] = i2;
                            i7 = i9;
                        } else {
                            return;
                        }
                    }
                } else if (this.bh * -1029352189 == 254) {
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        i9 = i7 + 1;
                        iArr[i7] = iArr[i9];
                        i7 = i9 + 1;
                        iArr[i9] = iArr[i7];
                        i9 = i7 + 1;
                        iArr[i7] = iArr[i9];
                        i7 = i9 + 1;
                        iArr[i9] = iArr[i7];
                    }
                    i8 = (i5 - i4) & 3;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            i9 = i7 + 1;
                            iArr[i7] = iArr[i9];
                            i7 = i9;
                        } else {
                            return;
                        }
                    }
                } else {
                    int i10;
                    int i11 = this.bh * -1029352189;
                    i9 = 256 - (this.bh * -1029352189);
                    int i12 = ((((16711935 & i2) * i9) >> 8) & 16711935) + (((i9 * (65280 & i2)) >> 8) & 65280);
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        i9 = iArr[i7];
                        i10 = i7 + 1;
                        iArr[i7] = (((((i9 & 16711935) * i11) >> 8) & 16711935) + i12) + ((((65280 & i9) * i11) >> 8) & 65280);
                        i7 = iArr[i10];
                        i9 = i10 + 1;
                        iArr[i10] = ((((i7 & 65280) * i11) >> 8) & 65280) + (((((16711935 & i7) * i11) >> 8) & 16711935) + i12);
                        i7 = iArr[i9];
                        i10 = i9 + 1;
                        iArr[i9] = (((((i7 & 16711935) * i11) >> 8) & 16711935) + i12) + ((((65280 & i7) * i11) >> 8) & 65280);
                        i9 = iArr[i10];
                        i7 = i10 + 1;
                        iArr[i10] = (((((i9 & 16711935) * i11) >> 8) & 16711935) + i12) + ((((65280 & i9) * i11) >> 8) & 65280);
                    }
                    i8 = (i5 - i4) & 3;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            i10 = iArr[i7];
                            i9 = i7 + 1;
                            iArr[i7] = ((((i10 & 65280) * i11) >> 8) & 65280) + (((((16711935 & i10) * i11) >> 8) & 16711935) + i12);
                            i7 = i9;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.ap(" + ')');
        }
    }

    final void br(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (this.ad) {
            if (i5 > this.bu * -1431886479) {
                i5 = -1431886479 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i6 = i + i4;
            int i7 = (i5 - i4) >> 2;
            int i8;
            if (this.bh * -1029352189 == 0) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else if (this.bh * -1029352189 == 254) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else {
                int i9;
                int i10 = -1029352189 * this.bh;
                i8 = 256 - (this.bh * -1029352189);
                int i11 = ((((i2 & 16711935) * i8) >> 8) & 16711935) + (((i8 * (i2 & 65280)) >> 8) & 65280);
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = iArr[i6];
                    i9 = i6 + 1;
                    iArr[i6] = (((((i8 & 16711935) * i10) >> 8) & 16711935) + i11) + ((((i8 & 65280) * i10) >> 8) & 65280);
                    i6 = iArr[i9];
                    i8 = i9 + 1;
                    iArr[i9] = ((((i6 & 65280) * i10) >> 8) & 65280) + (((((i6 & 16711935) * i10) >> 8) & 16711935) + i11);
                    i6 = iArr[i8];
                    i9 = i8 + 1;
                    iArr[i8] = (((((i6 & 16711935) * i10) >> 8) & 16711935) + i11) + ((((i6 & 65280) * i10) >> 8) & 65280);
                    i8 = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = (((((i8 & 16711935) * i10) >> 8) & 16711935) + i11) + ((((i8 & 65280) * i10) >> 8) & 65280);
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i9 = iArr[i6];
                        i8 = i6 + 1;
                        iArr[i6] = ((((i9 & 65280) * i10) >> 8) & 65280) + (((((i9 & 16711935) * i10) >> 8) & 16711935) + i11);
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dq(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (this.ad) {
            if (i5 > this.bu * -1431886479) {
                i5 = -1431886479 * this.bu;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i6 = i + i4;
            int i7 = (i5 - i4) >> 2;
            int i8;
            if (-1029352189 * this.bh == 0) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                    i8 = i6 + 1;
                    iArr[i6] = i2;
                    i6 = i8 + 1;
                    iArr[i8] = i2;
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = i2;
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else if (this.bh * -1029352189 == 1162387404) {
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                    i8 = i6 + 1;
                    iArr[i6] = iArr[i8];
                    i6 = i8 + 1;
                    iArr[i8] = iArr[i6];
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i8 = i6 + 1;
                        iArr[i6] = iArr[i8];
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            } else {
                int i9;
                int i10 = this.bh * -1029352189;
                i8 = 256 - (this.bh * 192644606);
                int i11 = ((((16711935 & i2) * i8) >> 8) & 16711935) + (((i8 * (65280 & i2)) >> 8) & 61791423);
                while (true) {
                    i7--;
                    if (i7 < 0) {
                        break;
                    }
                    i8 = iArr[i6];
                    i9 = i6 + 1;
                    iArr[i6] = (((((i8 & -1364662582) * i10) >> 8) & 1079470459) + i11) + ((((1423614844 & i8) * i10) >> 8) & -1742892816);
                    i6 = iArr[i9];
                    i8 = i9 + 1;
                    iArr[i9] = ((((i6 & 65280) * i10) >> 8) & 857459410) + (((((16711935 & i6) * i10) >> 8) & -999805338) + i11);
                    i6 = iArr[i8];
                    i9 = i8 + 1;
                    iArr[i8] = (((((i6 & -1293574781) * i10) >> 8) & 16711935) + i11) + ((((-1352822897 & i6) * i10) >> 8) & -1496329765);
                    i8 = iArr[i9];
                    i6 = i9 + 1;
                    iArr[i9] = (((((i8 & 16711935) * i10) >> 8) & -806656072) + i11) + ((((65280 & i8) * i10) >> 8) & 65280);
                }
                i7 = (i5 - i4) & 3;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        i9 = iArr[i6];
                        i8 = i6 + 1;
                        iArr[i6] = ((((i9 & 1232270580) * i10) >> 8) & 65280) + (((((16711935 & i9) * i10) >> 8) & 16711935) + i11);
                        i6 = i8;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void at(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] an = by.ae.an(i19, (byte) 16);
            int aq;
            if (an == null) {
                aq = by.ae.aq(i19, -1248922666);
                ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -2069427530), lq.bq(aq, i8, -2052440445), lq.bq(aq, i9, -1930154684), 1771927011);
                return;
            }
            int i21;
            int i22;
            int i23;
            this.bp = by.ae.aa(i19, 1922121399);
            this.ab = by.ae.ao(i19, -2135490889);
            int i24 = i5 - i4;
            int i25 = i2 - i;
            int i26 = i6 - i4;
            int i27 = i3 - i;
            int i28 = i8 - i7;
            int i29 = i9 - i7;
            if (i != i2) {
                i21 = ((i5 - i4) << 14) / (i2 - i);
            } else {
                i21 = 0;
            }
            if (i3 != i2) {
                i22 = ((i6 - i5) << 14) / (i3 - i2);
            } else {
                i22 = 0;
            }
            if (i3 != i) {
                i23 = ((i4 - i6) << 14) / (i - i3);
            } else {
                i23 = 0;
            }
            aq = (i27 * i24) - (i25 * i26);
            if (aq != 0) {
                int i30 = (((i27 * i28) - (i25 * i29)) << 9) / aq;
                int i31 = (((i24 * i29) - (i26 * i28)) << 9) / aq;
                aq = i10 - i11;
                i24 = i13 - i14;
                i25 = i16 - i17;
                i26 = i12 - i10;
                i27 = i15 - i13;
                i28 = i18 - i16;
                i29 = ((i26 * i13) - (i27 * i10)) << 14;
                int i32 = (int) (((((long) ((i16 * i27) - (i13 * i28))) << 3) << 14) / ((long) (411538491 * this.bt)));
                int i33 = (int) ((((long) ((i10 * i28) - (i26 * i16))) << 14) / ((long) (this.bt * 411538491)));
                int i34 = ((i13 * aq) - (i24 * i10)) << 14;
                int i35 = (int) (((((long) ((i16 * i24) - (i13 * i25))) << 3) << 14) / ((long) (this.bt * 411538491)));
                int i36 = (int) ((((long) ((i10 * i25) - (i16 * aq))) << 14) / ((long) (411538491 * this.bt)));
                int i37 = ((i26 * i24) - (aq * i27)) << 14;
                int i38 = (int) (((((long) ((i27 * i25) - (i24 * i28))) << 3) << 14) / ((long) (411538491 * this.bt)));
                int i39 = (int) ((((long) ((aq * i28) - (i26 * i25))) << 14) / ((long) (this.bt * 411538491)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < 286513717 * this.bd) {
                            if (i3 > this.bd * 286513717) {
                                i26 = this.bd * 286513717;
                            } else {
                                i26 = i3;
                            }
                            if (i > this.bd * 286513717) {
                                i = 286513717 * this.bd;
                            }
                            aq = ((i8 << 9) - (i30 * i5)) + i30;
                            if (i26 < i) {
                                i24 = i5 << 14;
                                if (i2 < 0) {
                                    i25 = i24 - (i2 * i21);
                                    i24 -= i2 * i22;
                                    aq -= i31 * i2;
                                    i2 = 0;
                                } else {
                                    i25 = i24;
                                }
                                i40 = i6 << 14;
                                if (i26 < 0) {
                                    i40 -= i26 * i23;
                                    i26 = 0;
                                }
                                i27 = i2 - (1621686031 * this.bb);
                                i41 = i29 + (i27 * i33);
                                i34 += i36 * i27;
                                i37 += i27 * i39;
                                if ((i26 == i2 || i21 >= i22) && (i2 != i26 || i21 <= i23)) {
                                    i42 = i - i26;
                                    i26 -= i2;
                                    i27 = this.bo[i2];
                                    i43 = aq;
                                    i44 = i24;
                                    i45 = i25;
                                    aq = i26;
                                    while (true) {
                                        i46 = aq - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        ax(this.aj, an, 0, 0, i27, i44 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 115);
                                        i45 += i21;
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i44 += i22;
                                        aq = i46;
                                    }
                                    i22 = i45;
                                    aq = i42;
                                    while (true) {
                                        i45 = aq - 1;
                                        if (i45 >= 0) {
                                            ax(this.aj, an, 0, 0, i27, i40 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 58);
                                            i40 += i23;
                                            i43 += i31;
                                            i27 += -1842132067 * this.af;
                                            i41 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            i22 += i21;
                                            aq = i45;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i42 = i - i26;
                                i26 -= i2;
                                i27 = this.bo[i2];
                                i43 = aq;
                                i44 = i24;
                                i45 = i25;
                                aq = i26;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ax(this.aj, an, 0, 0, i27, i45 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 21);
                                    i45 += i21;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i22;
                                    aq = i46;
                                }
                                i22 = i40;
                                aq = i42;
                                i40 = i45;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 >= 0) {
                                        ax(this.aj, an, 0, 0, i27, i40 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 33);
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i22 += i23;
                                        i40 += i21;
                                        aq = i45;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i25 - (i2 * i21);
                                i40 = i25 - (i22 * i2);
                                i43 = aq - (i2 * i31);
                                i2 = 0;
                                aq = i24;
                            } else {
                                i43 = aq;
                                i40 = i25;
                                aq = i25;
                            }
                            i45 = i4 << 14;
                            if (i < 0) {
                                i45 -= i23 * i;
                                i = 0;
                            }
                            i24 = i2 - (this.bb * 1621686031);
                            i41 = i29 + (i24 * i33);
                            i34 += i24 * i36;
                            i37 += i24 * i39;
                            if (i21 < i22) {
                                i42 = i26 - i;
                                i24 = i - i2;
                                i27 = this.bo[i2];
                                i44 = aq;
                                aq = i24;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ax(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 123);
                                    i40 += i22;
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i21;
                                    aq = i46;
                                }
                                aq = i42;
                                while (true) {
                                    i42 = aq - 1;
                                    if (i42 >= 0) {
                                        ax(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 42);
                                        i43 += i31;
                                        i27 += this.af * -1842132067;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i40 += i22;
                                        i45 += i23;
                                        aq = i42;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i42 = i26 - i;
                            i24 = i - i2;
                            i27 = this.bo[i2];
                            i44 = aq;
                            aq = i24;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 88);
                                i40 += i22;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i21;
                                aq = i46;
                            }
                            aq = i42;
                            while (true) {
                                i42 = aq - 1;
                                if (i42 >= 0) {
                                    ax(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 61);
                                    i45 += i23;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i40 += i22;
                                    aq = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < 286513717 * this.bd) {
                        if (i > 286513717 * this.bd) {
                            i26 = 286513717 * this.bd;
                        } else {
                            i26 = i;
                        }
                        if (i2 > this.bd * 286513717) {
                            i2 = this.bd * 286513717;
                        }
                        aq = ((i9 << 9) - (i30 * i6)) + i30;
                        if (i26 < i2) {
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i25 = i24 - (i3 * i22);
                                i24 -= i23 * i3;
                                aq -= i31 * i3;
                                i3 = 0;
                            } else {
                                i25 = i24;
                            }
                            i45 = i4 << 14;
                            if (i26 < 0) {
                                i45 -= i26 * i21;
                                i26 = 0;
                            }
                            i27 = i3 - (this.bb * 1621686031);
                            i41 = i29 + (i27 * i33);
                            i34 += i27 * i36;
                            i37 += i27 * i39;
                            if (i22 < i23) {
                                i42 = i2 - i26;
                                i26 -= i3;
                                i27 = this.bo[i3];
                                i43 = aq;
                                i44 = i24;
                                i40 = i25;
                                aq = i26;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    ax(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 62);
                                    i40 += i22;
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i23;
                                    aq = i46;
                                }
                                aq = i42;
                                while (true) {
                                    i42 = aq - 1;
                                    if (i42 >= 0) {
                                        ax(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 78);
                                        i45 += i21;
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i40 += i22;
                                        aq = i42;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i42 = i2 - i26;
                            i26 -= i3;
                            i27 = this.bo[i3];
                            i43 = aq;
                            i44 = i24;
                            i40 = i25;
                            aq = i26;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 115);
                                i40 += i22;
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i23;
                                aq = i46;
                            }
                            aq = i42;
                            while (true) {
                                i42 = aq - 1;
                                if (i42 >= 0) {
                                    ax(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 65);
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i40 += i22;
                                    i45 += i21;
                                    aq = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i6 << 14;
                        if (i3 < 0) {
                            i25 = i24 - (i22 * i3);
                            i24 -= i23 * i3;
                            aq -= i3 * i31;
                            i3 = 0;
                        } else {
                            i25 = i24;
                        }
                        i45 = i5 << 14;
                        if (i2 < 0) {
                            i45 -= i21 * i2;
                            i2 = 0;
                        }
                        i27 = i3 - (1621686031 * this.bb);
                        i41 = i29 + (i27 * i33);
                        i34 += i27 * i36;
                        i37 += i27 * i39;
                        if (i22 < i23) {
                            i42 = i26 - i2;
                            i26 = i2 - i3;
                            i27 = this.bo[i3];
                            i43 = aq;
                            i40 = i24;
                            i44 = i25;
                            aq = i26;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 68);
                                i40 += i23;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i22;
                                aq = i46;
                            }
                            i22 = i40;
                            aq = i42;
                            while (true) {
                                i40 = aq - 1;
                                if (i40 >= 0) {
                                    ax(this.aj, an, 0, 0, i27, i45 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 65);
                                    i45 += i21;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i22 += i23;
                                    aq = i40;
                                } else {
                                    return;
                                }
                            }
                        }
                        i42 = i26 - i2;
                        i26 = i2 - i3;
                        i27 = this.bo[i3];
                        i43 = aq;
                        i40 = i24;
                        i44 = i25;
                        aq = i26;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 81);
                            i40 += i23;
                            i43 += i31;
                            i27 += -1842132067 * this.af;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i22;
                            aq = i46;
                        }
                        i22 = i40;
                        aq = i42;
                        i40 = i45;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 >= 0) {
                                ax(this.aj, an, 0, 0, i27, i22 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 24);
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i22 += i23;
                                i40 += i21;
                                aq = i45;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < 286513717 * this.bd) {
                    if (i2 > this.bd * 286513717) {
                        i26 = 286513717 * this.bd;
                    } else {
                        i26 = i2;
                    }
                    if (i3 > this.bd * 286513717) {
                        i3 = this.bd * 286513717;
                    }
                    aq = ((i7 << 9) - (i4 * i30)) + i30;
                    if (i26 < i3) {
                        i25 = i4 << 14;
                        if (i < 0) {
                            i24 = i25 - (i23 * i);
                            i25 -= i * i21;
                            aq -= i * i31;
                            i = 0;
                        } else {
                            i24 = i25;
                        }
                        i45 = i5 << 14;
                        if (i26 < 0) {
                            i45 -= i26 * i22;
                            i26 = 0;
                        }
                        i27 = i - (this.bb * 1621686031);
                        i41 = i29 + (i27 * i33);
                        i34 += i36 * i27;
                        i37 += i27 * i39;
                        if ((i26 == i || i23 >= i21) && (i26 != i || i23 <= i22)) {
                            i42 = i3 - i26;
                            i26 -= i;
                            i27 = this.bo[i];
                            i43 = aq;
                            i40 = i24;
                            i44 = i25;
                            aq = i26;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 31);
                                i40 += i23;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i21;
                                aq = i46;
                            }
                            aq = i42;
                            while (true) {
                                i42 = aq - 1;
                                if (i42 >= 0) {
                                    ax(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 113);
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i40 += i23;
                                    i45 += i22;
                                    aq = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i42 = i3 - i26;
                        i26 -= i;
                        i27 = this.bo[i];
                        i43 = aq;
                        i40 = i24;
                        i44 = i25;
                        aq = i26;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 110);
                            i40 += i23;
                            i43 += i31;
                            i27 += -1842132067 * this.af;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i21;
                            aq = i46;
                        }
                        aq = i42;
                        while (true) {
                            i42 = aq - 1;
                            if (i42 >= 0) {
                                ax(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 33);
                                i45 += i22;
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i40 += i23;
                                aq = i42;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i4 << 14;
                    if (i < 0) {
                        i24 = i25 - (i * i23);
                        i25 -= i * i21;
                        aq -= i * i31;
                        i = 0;
                    } else {
                        i24 = i25;
                    }
                    i40 = i6 << 14;
                    if (i3 < 0) {
                        i40 -= i22 * i3;
                        i3 = 0;
                    }
                    i27 = i - (this.bb * 1621686031);
                    i41 = i29 + (i33 * i27);
                    i34 += i36 * i27;
                    i37 += i27 * i39;
                    if ((i == i3 || i23 >= i21) && (i3 != i || i22 <= i21)) {
                        i42 = i26 - i3;
                        i26 = i3 - i;
                        i27 = this.bo[i];
                        i43 = aq;
                        i44 = i24;
                        i45 = i25;
                        aq = i26;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i27, i45 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 32);
                            i45 += i21;
                            i43 += i31;
                            i27 += this.af * -1842132067;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i23;
                            aq = i46;
                        }
                        aq = i42;
                        while (true) {
                            i42 = aq - 1;
                            if (i42 >= 0) {
                                ax(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 88);
                                i40 += i22;
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i45 += i21;
                                aq = i42;
                            } else {
                                return;
                            }
                        }
                    }
                    i42 = i26 - i3;
                    i26 = i3 - i;
                    i27 = this.bo[i];
                    i43 = aq;
                    i44 = i24;
                    i45 = i25;
                    aq = i26;
                    while (true) {
                        i46 = aq - 1;
                        if (i46 < 0) {
                            break;
                        }
                        ax(this.aj, an, 0, 0, i27, i44 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 55);
                        i45 += i21;
                        i43 += i31;
                        i27 += this.af * -1842132067;
                        i41 += i33;
                        i34 += i36;
                        i37 += i39;
                        i44 += i23;
                        aq = i46;
                    }
                    aq = i42;
                    while (true) {
                        i42 = aq - 1;
                        if (i42 >= 0) {
                            ax(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, (byte) 121);
                            i43 += i31;
                            i27 += this.af * -1842132067;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i40 += i22;
                            i45 += i21;
                            aq = i42;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.at(" + ')');
        }
    }

    final void dt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = by.ae.an(i19, (byte) 16);
        if (an == null) {
            int aq = by.ae.aq(i19, -309005094);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -1961427583), lq.bq(aq, i8, -2021556021), lq.bq(aq, i9, -2071769185), -221027624);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bp = by.ae.aa(i19, 1328486085);
        this.ab = by.ae.ao(i19, -2135490889);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i != i2) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i3 != i) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aq = (i26 * i23) - (i24 * i25);
        if (aq != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aq;
            int i30 = (((i23 * i28) - (i25 * i27)) << 9) / aq;
            aq = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i26 * i10)) << 14;
            int i31 = (int) (((((long) ((i16 * i26) - (i13 * i27))) << 3) << 14) / ((long) (411538491 * this.bt)));
            int i32 = (int) ((((long) ((i10 * i27) - (i25 * i16))) << 14) / ((long) (this.bt * 411538491)));
            int i33 = ((i13 * aq) - (i23 * i10)) << 14;
            int i34 = (int) (((((long) ((i16 * i23) - (i13 * i24))) << 3) << 14) / ((long) (this.bt * 411538491)));
            int i35 = (int) ((((long) ((i10 * i24) - (i16 * aq))) << 14) / ((long) (411538491 * this.bt)));
            int i36 = ((i25 * i23) - (aq * i26)) << 14;
            int i37 = (int) (((((long) ((i26 * i24) - (i23 * i27))) << 3) << 14) / ((long) (411538491 * this.bt)));
            int i38 = (int) ((((long) ((aq * i27) - (i25 * i24))) << 14) / ((long) (this.bt * 411538491)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < 286513717 * this.bd) {
                        if (i3 > this.bd * 286513717) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > this.bd * 286513717) {
                            i = 286513717 * this.bd;
                        }
                        aq = ((i8 << 9) - (i29 * i5)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i39 = i23 - (i2 * i20);
                                i23 -= i2 * i21;
                                i40 = aq - (i30 * i2);
                                i2 = 0;
                            } else {
                                i40 = aq;
                                i39 = i23;
                            }
                            aq = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = aq - (i3 * i22);
                            } else {
                                i41 = aq;
                            }
                            aq = i2 - (1621686031 * this.bb);
                            i42 = i28 + (aq * i32);
                            i33 += i35 * aq;
                            i36 += aq * i38;
                            if ((i3 == i2 || i20 >= i21) && (i2 != i3 || i20 <= i22)) {
                                i43 = i - i3;
                                aq = i3 - i2;
                                i26 = this.bo[i2];
                                i44 = i23;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 45);
                                    i39 += i20;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i21;
                                    aq = i45;
                                }
                                i21 = i39;
                                aq = i43;
                                while (true) {
                                    i39 = aq - 1;
                                    if (i39 >= 0) {
                                        ax(this.aj, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 22);
                                        i41 += i22;
                                        i40 += i30;
                                        i26 += -1842132067 * this.af;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aq = i39;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i - i3;
                            aq = i3 - i2;
                            i26 = this.bo[i2];
                            i44 = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 6);
                                i39 += i20;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i21;
                                aq = i45;
                            }
                            i21 = i39;
                            aq = i43;
                            while (true) {
                                i39 = aq - 1;
                                if (i39 >= 0) {
                                    ax(this.aj, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 15);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aq = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i2 * i20);
                            i24 -= i21 * i2;
                            aq -= i2 * i30;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = i25 - (i22 * i);
                        } else {
                            i41 = i25;
                        }
                        i25 = i2 - (this.bb * 1621686031);
                        i42 = i28 + (i25 * i32);
                        i33 += i25 * i35;
                        i36 += i25 * i38;
                        if (i20 < i21) {
                            i43 = i3 - i;
                            i25 = i - i2;
                            i26 = this.bo[i2];
                            i40 = aq;
                            i44 = i23;
                            i39 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 105);
                                i39 += i21;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                aq = i45;
                            }
                            i20 = i39;
                            aq = i43;
                            while (true) {
                                i39 = aq - 1;
                                if (i39 >= 0) {
                                    ax(this.aj, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 63);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += this.af * -1842132067;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aq = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i3 - i;
                        i25 = i - i2;
                        i26 = this.bo[i2];
                        i40 = aq;
                        i44 = i23;
                        i39 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 81);
                            i39 += i21;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aq = i45;
                        }
                        i20 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                ax(this.aj, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 96);
                                i41 += i22;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < 286513717 * this.bd) {
                    if (i > 286513717 * this.bd) {
                        i = 286513717 * this.bd;
                    }
                    if (i2 > this.bd * 286513717) {
                        i23 = 286513717 * this.bd;
                    } else {
                        i23 = i2;
                    }
                    aq = ((i9 << 9) - (i29 * i6)) + i29;
                    if (i < i23) {
                        i24 = i6 << 14;
                        if (i3 < 0) {
                            i25 = i24 - (i3 * i21);
                            i24 -= i22 * i3;
                            aq -= i30 * i3;
                            i3 = 0;
                        } else {
                            i25 = i24;
                        }
                        i26 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = i26 - (i * i20);
                        } else {
                            i41 = i26;
                        }
                        i26 = i3 - (this.bb * 1621686031);
                        i42 = i28 + (i26 * i32);
                        i33 += i26 * i35;
                        i36 += i26 * i38;
                        int i46;
                        if (i21 < i22) {
                            i43 = i23 - i;
                            i23 = i - i3;
                            i26 = this.bo[i3];
                            i40 = aq;
                            i44 = i24;
                            i39 = i25;
                            aq = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 30);
                                i39 += i21;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i22;
                                aq = i45;
                            }
                            aq = i43;
                            i46 = i41;
                            i41 = i39;
                            i39 = i46;
                            while (true) {
                                i43 = aq - 1;
                                if (i43 >= 0) {
                                    ax(this.aj, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 36);
                                    aq = i41 + i21;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i39 += i20;
                                    i41 = aq;
                                    aq = i43;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i23 - i;
                        i23 = i - i3;
                        i26 = this.bo[i3];
                        i40 = aq;
                        i44 = i24;
                        i39 = i25;
                        aq = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 99);
                            i39 += i21;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i22;
                            aq = i45;
                        }
                        aq = i43;
                        i46 = i41;
                        i41 = i39;
                        i39 = i46;
                        while (true) {
                            i43 = aq - 1;
                            if (i43 >= 0) {
                                ax(this.aj, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 116);
                                aq = i41 + i21;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i39 += i20;
                                i41 = aq;
                                aq = i43;
                            } else {
                                return;
                            }
                        }
                    }
                    i39 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i39 - (i21 * i3);
                        i39 -= i22 * i3;
                        i40 = aq - (i3 * i30);
                        i3 = 0;
                    } else {
                        i40 = aq;
                        i24 = i39;
                    }
                    aq = i5 << 14;
                    if (i23 < 0) {
                        i41 = aq - (i23 * i20);
                        aq = 0;
                    } else {
                        i41 = aq;
                        aq = i23;
                    }
                    i23 = i3 - (1621686031 * this.bb);
                    i42 = i28 + (i23 * i32);
                    i33 += i23 * i35;
                    i36 += i23 * i38;
                    if (i21 < i22) {
                        i43 = i - aq;
                        aq -= i3;
                        i26 = this.bo[i3];
                        i44 = i24;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 122);
                            i39 += i22;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i21;
                            aq = i45;
                        }
                        i21 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                ax(this.aj, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 105);
                                i41 += i20;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i - aq;
                    aq -= i3;
                    i26 = this.bo[i3];
                    i44 = i24;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 117);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1842132067 * this.af;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i21;
                        aq = i45;
                    }
                    i21 = i39;
                    aq = i43;
                    while (true) {
                        i39 = aq - 1;
                        if (i39 >= 0) {
                            ax(this.aj, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 114);
                            i41 += i20;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aq = i39;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < 286513717 * this.bd) {
                if (i2 > this.bd * 286513717) {
                    i2 = 286513717 * this.bd;
                }
                if (i3 > this.bd * 286513717) {
                    i3 = this.bd * 286513717;
                }
                aq = ((i7 << 9) - (i4 * i29)) + i29;
                if (i2 < i3) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i22 * i);
                        i24 -= i * i20;
                        aq -= i * i30;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i25 - (i2 * i21);
                    } else {
                        i41 = i25;
                    }
                    i25 = i - (this.bb * 1621686031);
                    i42 = i28 + (i25 * i32);
                    i33 += i35 * i25;
                    i36 += i25 * i38;
                    if ((i2 == i || i22 >= i20) && (i2 != i || i22 <= i21)) {
                        i43 = i3 - i2;
                        i25 = i2 - i;
                        i26 = this.bo[i];
                        i40 = aq;
                        i39 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 70);
                            i39 += i22;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aq = i45;
                        }
                        i20 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                ax(this.aj, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 26);
                                i41 += i21;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i3 - i2;
                    i25 = i2 - i;
                    i26 = this.bo[i];
                    i40 = aq;
                    i39 = i23;
                    i44 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 108);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1842132067 * this.af;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aq = i45;
                    }
                    i20 = i39;
                    aq = i43;
                    while (true) {
                        i39 = aq - 1;
                        if (i39 >= 0) {
                            ax(this.aj, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 34);
                            i41 += i21;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aq = i39;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i4 << 14;
                if (i < 0) {
                    i23 = i24 - (i * i22);
                    i24 -= i * i20;
                    aq -= i * i30;
                    i = 0;
                } else {
                    i23 = i24;
                }
                i25 = i6 << 14;
                if (i3 < 0) {
                    i3 = 0;
                    i41 = i25 - (i21 * i3);
                } else {
                    i41 = i25;
                }
                i25 = i - (this.bb * 1621686031);
                i42 = i28 + (i32 * i25);
                i33 += i35 * i25;
                i36 += i25 * i38;
                if ((i == i3 || i22 >= i20) && (i3 != i || i21 <= i20)) {
                    i43 = i2 - i3;
                    i25 = i3 - i;
                    i26 = this.bo[i];
                    i40 = aq;
                    i44 = i23;
                    i39 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        ax(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 56);
                        i39 += i20;
                        i40 += i30;
                        i26 += this.af * -1842132067;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i22;
                        aq = i45;
                    }
                    aq = i43;
                    while (true) {
                        i43 = aq - 1;
                        if (i43 >= 0) {
                            ax(this.aj, an, 0, 0, i26, i39 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 69);
                            i41 += i21;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i39 += i20;
                            aq = i43;
                        } else {
                            return;
                        }
                    }
                }
                i43 = i2 - i3;
                i25 = i3 - i;
                i26 = this.bo[i];
                i40 = aq;
                i44 = i23;
                i39 = i24;
                aq = i25;
                while (true) {
                    i45 = aq - 1;
                    if (i45 < 0) {
                        break;
                    }
                    ax(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 71);
                    i39 += i20;
                    i40 += i30;
                    i26 += this.af * -1842132067;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    i44 += i22;
                    aq = i45;
                }
                aq = i43;
                while (true) {
                    i43 = aq - 1;
                    if (i43 >= 0) {
                        ax(this.aj, an, 0, 0, i26, i41 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, (byte) 53);
                        i41 += i21;
                        i40 += i30;
                        i26 += this.af * -1842132067;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i39 += i20;
                        aq = i43;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static void ab(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = i12;
            i12 = i11;
            i11 = -i4;
            while (i11 < 0) {
                int i15 = i14 + 1;
                try {
                    int i16 = iArr2[i14];
                    if (i16 != 0) {
                        int i17 = iArr[i12];
                        if (i17 == 0) {
                            i14 = i12 + 1;
                            iArr[i12] = i16 | ((i10 - 48) << 24);
                        } else {
                            i14 = i12 + 1;
                            iArr[i12] = (((((i16 & 16711935) * i8) + ((i17 & 16711935) * i10)) & -16711936) + ((((65280 & i16) * i8) + ((65280 & i17) * i10)) & 16711680)) >> 8;
                        }
                    } else {
                        i14 = i12 + 1;
                    }
                    i11++;
                    i12 = i14;
                    i14 = i15;
                } catch (Throwable e) {
                    throw ei.ac(e, "cq.ab(" + ')');
                }
            }
            i11 = i12 + i6;
            i12 = i14 + i7;
        }
    }

    final void ax(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte b) {
        try {
            if (this.ad) {
                if (i5 > this.bu * -1431886479) {
                    i5 = this.bu * -1431886479;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i14 = i3 + i4;
                int i15 = i6 + (i7 * i4);
                int i16 = i5 - i4;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                if (this.bp) {
                    i17 = i4 - (this.br * 266497203);
                    i18 = i8 + ((i11 >> 3) * i17);
                    i19 = i9 + ((i12 >> 3) * i17);
                    i20 = i10 + (i17 * (i13 >> 3));
                    i17 = i20 >> 12;
                    if (i17 != 0) {
                        i21 = i18 / i17;
                        i17 = i19 / i17;
                        if (i21 < 0) {
                            i21 = 0;
                        } else if (i21 > 4032) {
                            i21 = 4032;
                        }
                    } else {
                        i21 = 0;
                        i17 = 0;
                    }
                    i22 = i18 + i11;
                    i23 = i19 + i12;
                    i24 = i20 + i13;
                    i18 = i24 >> 12;
                    if (i18 != 0) {
                        i19 = i22 / i18;
                        i18 = i23 / i18;
                        if (i19 < 0) {
                            i19 = 0;
                        } else if (i19 > 4032) {
                            i19 = 4032;
                        }
                    } else {
                        i19 = 0;
                        i18 = 0;
                    }
                    i20 = (i21 << 20) + i17;
                    i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 20);
                    i16 >>= 3;
                    i25 = i7 << 3;
                    i21 = i15 >> 8;
                    if (this.ab) {
                        if (i16 > 0) {
                            i26 = i15;
                            i27 = i19;
                            i19 = i23;
                            i23 = i16;
                            i16 = i18;
                            i18 = i24;
                            i24 = i27;
                            while (true) {
                                i15 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                                i28 = i14 + 1;
                                iArr[i14] = ((((i15 & 16711935) * i21) & -16711936) + (((65280 & i15) * i21) & 16711680)) >> 8;
                                i14 = i20 + i17;
                                i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                i15 = i28 + 1;
                                iArr[i28] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                                i14 += i17;
                                i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                i28 = i15 + 1;
                                iArr[i15] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                                i14 += i17;
                                i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                i15 = i28 + 1;
                                iArr[i28] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                                i14 += i17;
                                i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                                i28 = i15 + 1;
                                iArr[i15] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                                i14 += i17;
                                i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                i15 = i28 + 1;
                                iArr[i28] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                                i14 += i17;
                                i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                                i28 = i15 + 1;
                                iArr[i15] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                                i20 = i14 + i17;
                                i15 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                                i14 = i28 + 1;
                                iArr[i28] = (((i21 * (i15 & 65280)) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                                i17 += i20;
                                i28 = i22 + i11;
                                i15 = i19 + i12;
                                i22 = i18 + i13;
                                i17 = i22 >> 12;
                                if (i17 != 0) {
                                    i21 = i28 / i17;
                                    i17 = i15 / i17;
                                    if (i21 < 0) {
                                        i18 = i17;
                                        i19 = 0;
                                    } else if (i21 > 4032) {
                                        i18 = i17;
                                        i19 = 4032;
                                    } else {
                                        i18 = i17;
                                        i19 = i21;
                                    }
                                } else {
                                    i18 = 0;
                                    i19 = 0;
                                }
                                i20 = (i24 << 20) + i16;
                                i17 = ((i18 - i16) >> 3) + (((i19 - i24) >> 3) << 20);
                                i24 = i26 + i25;
                                i21 = i24 >> 8;
                                i16 = i23 - 1;
                                if (i16 <= 0) {
                                    break;
                                }
                                i23 = i16;
                                i26 = i24;
                                i16 = i18;
                                i24 = i19;
                                i19 = i15;
                                i18 = i22;
                                i22 = i28;
                            }
                        }
                        i18 = (i5 - i4) & 7;
                        if (i18 > 0) {
                            while (true) {
                                i16 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                                i19 = i14 + 1;
                                iArr[i14] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                                i20 += i17;
                                i18--;
                                if (i18 > 0) {
                                    i14 = i19;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (i16 > 0) {
                        i26 = i15;
                        i27 = i19;
                        i19 = i24;
                        i24 = i27;
                        i29 = i16;
                        i16 = i18;
                        i18 = i14;
                        i14 = i23;
                        i23 = i29;
                        i30 = i22;
                        i22 = i20;
                        i20 = i30;
                        while (true) {
                            i15 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                            if (i15 != 0) {
                                iArr[i18] = ((((i15 & 16711935) * i21) & -16711936) + (((65280 & i15) * i21) & 16711680)) >> 8;
                            }
                            i18++;
                            i22 += i17;
                            i15 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                            if (i15 != 0) {
                                iArr[i18] = (((i21 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i21) & 16711680)) >> 8;
                            }
                            i18++;
                            i17 += i22;
                            i28 = i20 + i11;
                            i15 = i14 + i12;
                            i22 = i19 + i13;
                            i17 = i22 >> 12;
                            if (i17 != 0) {
                                i21 = i28 / i17;
                                i17 = i15 / i17;
                                if (i21 < 0) {
                                    i14 = i17;
                                    i20 = 0;
                                } else if (i21 > 4032) {
                                    i14 = i17;
                                    i20 = 4032;
                                } else {
                                    i14 = i17;
                                    i20 = i21;
                                }
                            } else {
                                i14 = 0;
                                i20 = 0;
                            }
                            i19 = (i24 << 20) + i16;
                            i17 = ((i14 - i16) >> 3) + (((i20 - i24) >> 3) << 20);
                            i24 = i26 + i25;
                            i21 = i24 >> 8;
                            i16 = i23 - 1;
                            if (i16 <= 0) {
                                break;
                            }
                            i23 = i16;
                            i26 = i24;
                            i16 = i14;
                            i24 = i20;
                            i14 = i15;
                            i20 = i28;
                            i27 = i22;
                            i22 = i19;
                            i19 = i27;
                        }
                    } else {
                        i18 = i14;
                        i19 = i20;
                    }
                    i14 = (i5 - i4) & 7;
                    if (i14 > 0) {
                        i27 = i14;
                        i14 = i19;
                        i19 = i18;
                        i18 = i27;
                        do {
                            i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                            if (i20 != 0) {
                                iArr[i19] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                            }
                            i19++;
                            i14 += i17;
                            i18--;
                        } while (i18 > 0);
                        return;
                    }
                    return;
                }
                i17 = i4 - (this.br * 266497203);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 14;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 16256) {
                        i21 = 16256;
                    }
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i22 = i18 + i11;
                i23 = i19 + i12;
                i24 = i20 + i13;
                i18 = i24 >> 14;
                if (i18 != 0) {
                    i19 = i22 / i18;
                    i18 = i23 / i18;
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 16256) {
                        i19 = 16256;
                    }
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 18) + i17;
                i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 18);
                i16 >>= 3;
                i25 = i7 << 3;
                i21 = i15 >> 8;
                if (this.ab) {
                    if (i16 > 0) {
                        i26 = i15;
                        i27 = i19;
                        i19 = i23;
                        i23 = i16;
                        i16 = i18;
                        i18 = i24;
                        i24 = i27;
                        while (true) {
                            i15 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i28 = i14 + 1;
                            iArr[i14] = ((((i15 & 65280) * i21) & 16711680) + (((16711935 & i15) * i21) & -16711936)) >> 8;
                            i14 = i20 + i17;
                            i20 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                            i15 = i28 + 1;
                            iArr[i28] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                            i14 += i17;
                            i20 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                            i28 = i15 + 1;
                            iArr[i15] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                            i14 += i17;
                            i20 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                            i15 = i28 + 1;
                            iArr[i28] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                            i14 += i17;
                            i20 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                            i28 = i15 + 1;
                            iArr[i15] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & 16711680)) >> 8;
                            i14 += i17;
                            i20 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                            i15 = i28 + 1;
                            iArr[i28] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                            i14 += i17;
                            i20 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                            i28 = i15 + 1;
                            iArr[i15] = ((((i20 & 65280) * i21) & 16711680) + (((16711935 & i20) * i21) & -16711936)) >> 8;
                            i20 = i14 + i17;
                            i15 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i14 = i28 + 1;
                            iArr[i28] = (((i21 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i21) & 16711680)) >> 8;
                            i17 += i20;
                            i28 = i22 + i11;
                            i15 = i19 + i12;
                            i22 = i18 + i13;
                            i17 = i22 >> 14;
                            if (i17 != 0) {
                                i21 = i28 / i17;
                                i17 = i15 / i17;
                                if (i21 < 0) {
                                    i19 = i17;
                                    i20 = 0;
                                } else if (i21 > 16256) {
                                    i19 = i17;
                                    i20 = 16256;
                                } else {
                                    i19 = i17;
                                    i20 = i21;
                                }
                            } else {
                                i19 = 0;
                                i20 = 0;
                            }
                            i18 = (i24 << 18) + i16;
                            i17 = ((i19 - i16) >> 3) + (((i20 - i24) >> 3) << 18);
                            i24 = i26 + i25;
                            i21 = i24 >> 8;
                            i16 = i23 - 1;
                            if (i16 <= 0) {
                                break;
                            }
                            i23 = i16;
                            i26 = i24;
                            i16 = i19;
                            i24 = i20;
                            i19 = i15;
                            i20 = i18;
                            i18 = i22;
                            i22 = i28;
                        }
                    } else {
                        i18 = i20;
                    }
                    i19 = (i5 - i4) & 7;
                    if (i19 > 0) {
                        i20 = i18;
                        i18 = i19;
                        while (true) {
                            i16 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i19 = i14 + 1;
                            iArr[i14] = ((((i16 & 16711935) * i21) & -16711936) + (((65280 & i16) * i21) & 16711680)) >> 8;
                            i14 = i20 + i17;
                            i18--;
                            if (i18 > 0) {
                                i20 = i14;
                                i14 = i19;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i16 > 0) {
                    i27 = i24;
                    i24 = i23;
                    i23 = i22;
                    i22 = i20;
                    i20 = i27;
                    while (true) {
                        i28 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 65280) * i21) & 16711680) + (((16711935 & i28) * i21) & -16711936)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                        if (i28 != 0) {
                            iArr[i14] = ((((i28 & 16711935) * i21) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i22 += i17;
                        i28 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                        if (i28 != 0) {
                            iArr[i14] = (((i21 * (i28 & 16711935)) & -16711936) + (((65280 & i28) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i17 += i22;
                        i22 = i23 + i11;
                        i23 = i24 + i12;
                        i24 = i20 + i13;
                        i17 = i24 >> 14;
                        if (i17 != 0) {
                            i21 = i22 / i17;
                            i17 = i23 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 16256) {
                                i21 = 16256;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i20 = (i19 << 18) + i18;
                        i18 = ((i17 - i18) >> 3) + (((i21 - i19) >> 3) << 18);
                        i15 += i25;
                        i19 = i15 >> 8;
                        i16--;
                        if (i16 <= 0) {
                            break;
                        }
                        i27 = i17;
                        i17 = i18;
                        i18 = i27;
                        i29 = i21;
                        i21 = i19;
                        i19 = i29;
                        i30 = i24;
                        i24 = i23;
                        i23 = i22;
                        i22 = i20;
                        i20 = i30;
                    }
                    i21 = i14;
                    i14 = i19;
                    i19 = i18;
                    i18 = i20;
                } else {
                    i19 = i17;
                    i18 = i20;
                    i27 = i14;
                    i14 = i21;
                    i21 = i27;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i20 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i14) & -16711936) + (((65280 & i20) * i14) & 16711680)) >> 8;
                        }
                        i21++;
                        i18 += i19;
                        i17--;
                    } while (i17 > 0);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.ax(" + ')');
        }
    }

    final void dj(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.ad) {
            if (i5 > this.bu * -1431886479) {
                i5 = this.bu * -1431886479;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i7 * i4);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            if (this.bp) {
                i17 = i4 - (this.br * -765391218);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 4032) {
                        i21 = -1558879206;
                    }
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i22 = i18 + i11;
                i23 = i19 + i12;
                i24 = i20 + i13;
                i18 = i24 >> 12;
                if (i18 != 0) {
                    i19 = i22 / i18;
                    i18 = i23 / i18;
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 4032) {
                        i19 = 4032;
                    }
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 20);
                i16 >>= 3;
                i25 = i7 << 3;
                i21 = i15 >> 8;
                if (this.ab) {
                    if (i16 > 0) {
                        i26 = i18;
                        i18 = i14;
                        i14 = i21;
                        i21 = i19;
                        i19 = i17;
                        i17 = i26;
                        i27 = i23;
                        i23 = i22;
                        i22 = i20;
                        i20 = i24;
                        i24 = i27;
                        while (true) {
                            i28 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            i29 = i18 + 1;
                            iArr[i18] = ((((i28 & 16711935) * i14) & -1358790410) + (((65280 & i28) * i14) & 16711680)) >> 8;
                            i18 = i22 + i19;
                            i22 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i22 & 65280) * i14) & 1679527961) + (((16711935 & i22) * i14) & -16711936)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i22 & 654525396) * i14) & 168239961) + (((65280 & i22) * i14) & 16711680)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i22 & -425225373) * i14) & 1985096857) + (((-1682203169 & i22) * i14) & 1126146561)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(1035729055 & i18) + (i18 >>> 26)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i22 & 16711935) * i14) & -16711936) + (((65280 & i22) * i14) & 2144458679)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (911761652 & i18)];
                            i28 = i29 + 1;
                            iArr[i29] = ((((i22 & 65280) * i14) & 16711680) + (((-1559649726 & i22) * i14) & -16711936)) >> 8;
                            i18 += i19;
                            i22 = iArr2[(i18 >>> 26) + (-365851425 & i18)];
                            i29 = i28 + 1;
                            iArr[i28] = ((((i22 & 16711935) * i14) & -934425867) + (((65280 & i22) * i14) & 16711680)) >> 8;
                            i22 = i18 + i19;
                            i28 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                            i18 = i29 + 1;
                            iArr[i29] = (((i14 * (i28 & -772935044)) & -452290386) + (((1399443848 & i28) * i14) & -1496305683)) >> 8;
                            i19 += i22;
                            i22 = i23 + i11;
                            i23 = i24 + i12;
                            i24 = i20 + i13;
                            i19 = i24 >> 12;
                            if (i19 != 0) {
                                i20 = i22 / i19;
                                i14 = i23 / i19;
                                if (i20 < 0) {
                                    i20 = 0;
                                } else if (i20 > 4032) {
                                    i20 = -1986817996;
                                }
                            } else {
                                i20 = 0;
                                i14 = 0;
                            }
                            i19 = (i21 << 20) + i17;
                            i17 = ((i14 - i17) >> 3) + (((i20 - i21) >> 3) << 20);
                            i15 += i25;
                            i21 = i15 >> 8;
                            i16--;
                            if (i16 <= 0) {
                                break;
                            }
                            i26 = i14;
                            i14 = i21;
                            i21 = i20;
                            i20 = i24;
                            i24 = i23;
                            i23 = i22;
                            i22 = i19;
                            i19 = i17;
                            i17 = i26;
                        }
                    } else {
                        i18 = i14;
                        i19 = i20;
                    }
                    i14 = (i5 - i4) & 7;
                    if (i14 > 0) {
                        i20 = i19;
                        i19 = i18;
                        i18 = i14;
                        while (true) {
                            i16 = iArr2[(i20 >>> 26) + (528010172 & i20)];
                            i14 = i19 + 1;
                            iArr[i19] = ((((i16 & -1089919116) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                            i19 = i20 + i17;
                            i18--;
                            if (i18 > 0) {
                                i20 = i19;
                                i19 = i14;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i16 > 0) {
                    i28 = i15;
                    i26 = i16;
                    i16 = i20;
                    i20 = i24;
                    i24 = i26;
                    i27 = i17;
                    i17 = i19;
                    i19 = i21;
                    i21 = i27;
                    while (true) {
                        i15 = iArr2[(i16 >>> 26) + (i16 & 4032)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & -276654168) * i19) & 16711680) + (((620351967 & i15) * i19) & 180046738)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(-419351451 & i16) + (i16 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & -1664133421) * i19) & -720070442) + (((16711935 & i15) * i19) & 658997820)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(i16 & 4032) + (i16 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & 65280) * i19) & -791636871) + (((-1956631826 & i15) * i19) & -16711936)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(i16 & 4032) + (i16 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & -1659097698) * i19) & 16711680) + (((-1195559585 & i15) * i19) & -16711936)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(i16 >>> 26) + (i16 & 4032)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & 65280) * i19) & -476432255) + (((1988466534 & i15) * i19) & -16711936)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(i16 >>> 26) + (1373180950 & i16)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & -2129994644) * i19) & 16711680) + (((-769231844 & i15) * i19) & -16711936)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(i16 & 4032) + (i16 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & 2061641646) * i19) & -16711936) + (((65280 & i15) * i19) & 16711680)) >> 8;
                        }
                        i14++;
                        i16 += i21;
                        i15 = iArr2[(-1241203417 & i16) + (i16 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = (((i19 * (i15 & -184397628)) & -16711936) + (((65280 & i15) * i19) & -737425198)) >> 8;
                        }
                        i14++;
                        i21 += i16;
                        i15 = i22 + i11;
                        i22 = i23 + i12;
                        i23 = i20 + i13;
                        i21 = i23 >> 12;
                        if (i21 != 0) {
                            i16 = i15 / i21;
                            i19 = i22 / i21;
                            if (i16 < 0) {
                                i16 = 0;
                            } else if (i16 > 1799590250) {
                                i16 = 624174908;
                            }
                        } else {
                            i16 = 0;
                            i19 = 0;
                        }
                        i20 = (i17 << 20) + i18;
                        i17 = (((i16 - i17) >> 3) << 20) + ((i19 - i18) >> 3);
                        i28 += i25;
                        i21 = i28 >> 8;
                        i18 = i24 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i24 = i18;
                        i18 = i19;
                        i19 = i21;
                        i21 = i17;
                        i17 = i16;
                        i16 = i20;
                        i20 = i23;
                        i23 = i22;
                        i22 = i15;
                    }
                }
                i18 = (i5 - i4) & 7;
                if (i18 > 0) {
                    do {
                        i19 = iArr2[(477366623 & i20) + (i20 >>> 26)];
                        if (i19 != 0) {
                            iArr[i14] = ((((i19 & 16711935) * i21) & -16711936) + (((65280 & i19) * i21) & 16711680)) >> 8;
                        }
                        i14++;
                        i20 += i17;
                        i18--;
                    } while (i18 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (this.br * 979252631);
            i18 = i8 + ((i11 >> 3) * i17);
            i19 = i9 + ((i12 >> 3) * i17);
            i20 = i10 + (i17 * (i13 >> 3));
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
                if (i21 < 0) {
                    i21 = 0;
                } else if (i21 > 16256) {
                    i21 = 16256;
                }
            } else {
                i21 = 0;
                i17 = 0;
            }
            i22 = i18 + i11;
            i23 = i19 + i12;
            i24 = i20 + i13;
            i18 = i24 >> 14;
            if (i18 != 0) {
                i19 = i22 / i18;
                i18 = i23 / i18;
                if (i19 < 0) {
                    i19 = 0;
                } else if (i19 > 412060659) {
                    i19 = -24000200;
                }
            } else {
                i19 = 0;
                i18 = 0;
            }
            i20 = (i21 << 18) + i17;
            i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 18);
            i16 >>= 3;
            i25 = i7 << 3;
            i21 = i15 >> 8;
            if (this.ab) {
                if (i16 > 0) {
                    i28 = i15;
                    i26 = i16;
                    i16 = i20;
                    i20 = i24;
                    i24 = i26;
                    i27 = i17;
                    i17 = i19;
                    i19 = i21;
                    i21 = i27;
                    while (true) {
                        i15 = iArr2[(2116026936 & i16) + (i16 >>> 25)];
                        i29 = i14 + 1;
                        iArr[i14] = ((((i15 & -1078462494) * i19) & 215013628) + (((520427994 & i15) * i19) & -16711936)) >> 8;
                        i14 = i16 + i21;
                        i16 = iArr2[(i14 >>> 25) + (1462473015 & i14)];
                        i15 = i29 + 1;
                        iArr[i29] = ((((i16 & 16711935) * i19) & 132094850) + (((-146804180 & i16) * i19) & 1608350389)) >> 8;
                        i14 += i21;
                        i16 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                        i29 = i15 + 1;
                        iArr[i15] = ((((i16 & 65280) * i19) & 16711680) + (((16711935 & i16) * i19) & 883018514)) >> 8;
                        i14 += i21;
                        i16 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                        i15 = i29 + 1;
                        iArr[i29] = ((((i16 & -2028883896) * i19) & -757124196) + (((65280 & i16) * i19) & 16711680)) >> 8;
                        i14 += i21;
                        i16 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                        i29 = i15 + 1;
                        iArr[i15] = ((((i16 & 1886955150) * i19) & -16711936) + (((65280 & i16) * i19) & -285045229)) >> 8;
                        i14 += i21;
                        i16 = iArr2[(i14 >>> 25) + (848275450 & i14)];
                        i15 = i29 + 1;
                        iArr[i29] = ((((i16 & -935665729) * i19) & 16711680) + (((-181189136 & i16) * i19) & -16711936)) >> 8;
                        i14 += i21;
                        i16 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                        i29 = i15 + 1;
                        iArr[i15] = ((((i16 & 65280) * i19) & -1759277993) + (((16711935 & i16) * i19) & 1920992852)) >> 8;
                        i16 = i14 + i21;
                        i15 = iArr2[(i16 & 16256) + (i16 >>> 25)];
                        i14 = i29 + 1;
                        iArr[i29] = (((i19 * (i15 & -1175914172)) & -1908034677) + (((-333995110 & i15) * i19) & 1130976838)) >> 8;
                        i21 += i16;
                        i15 = i22 + i11;
                        i22 = i23 + i12;
                        i23 = i20 + i13;
                        i21 = i23 >> 14;
                        if (i21 != 0) {
                            i16 = i15 / i21;
                            i19 = i22 / i21;
                            if (i16 < 0) {
                                i16 = 0;
                            } else if (i16 > 16256) {
                                i16 = 16256;
                            }
                        } else {
                            i16 = 0;
                            i19 = 0;
                        }
                        i20 = (i17 << 18) + i18;
                        i17 = (((i16 - i17) >> 3) << 18) + ((i19 - i18) >> 3);
                        i28 += i25;
                        i21 = i28 >> 8;
                        i18 = i24 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i24 = i18;
                        i18 = i19;
                        i19 = i21;
                        i21 = i17;
                        i17 = i16;
                        i16 = i20;
                        i20 = i23;
                        i23 = i22;
                        i22 = i15;
                    }
                }
                i18 = (i5 - i4) & 7;
                if (i18 > 0) {
                    while (true) {
                        i16 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                        i19 = i14 + 1;
                        iArr[i14] = ((((i16 & 16711935) * i21) & -16711936) + (((520161745 & i16) * i21) & 2107098958)) >> 8;
                        i20 += i17;
                        i18--;
                        if (i18 > 0) {
                            i14 = i19;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i16 > 0) {
                i26 = i18;
                i18 = i17;
                i17 = i26;
                i27 = i19;
                i19 = i21;
                i21 = i27;
                int i30 = i24;
                i24 = i23;
                i23 = i22;
                i22 = i20;
                i20 = i30;
                while (true) {
                    i28 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 65280) * i19) & 16711680) + (((-1160621450 & i28) * i19) & 2047464310)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (217618117 & i22)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 1790703083) * i19) & -16711936) + (((263837891 & i28) * i19) & 35357240)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (-1016433605 & i22)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 16711935) * i19) & 1708795734) + (((65280 & i28) * i19) & 16711680)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (1695654296 & i22)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 1510535326) * i19) & 16711680) + (((-232376256 & i28) * i19) & -16711936)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (667121173 & i22)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & -1325687236) * i19) & 1194373455) + (((16711935 & i28) * i19) & 830974464)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (1719953702 & i22)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 65280) * i19) & 1498751469) + (((16711935 & i28) * i19) & -16711936)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                    if (i28 != 0) {
                        iArr[i14] = ((((i28 & 16711935) * i19) & -16711936) + (((472800432 & i28) * i19) & 16711680)) >> 8;
                    }
                    i14++;
                    i22 += i18;
                    i28 = iArr2[(803038202 & i22) + (i22 >>> 25)];
                    if (i28 != 0) {
                        iArr[i14] = (((i19 * (i28 & 739477631)) & -16711936) + (((1426007497 & i28) * i19) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i22;
                    i22 = i23 + i11;
                    i23 = i24 + i12;
                    i24 = i20 + i13;
                    i18 = i24 >> 14;
                    if (i18 != 0) {
                        i20 = i22 / i18;
                        i19 = i23 / i18;
                        if (i20 < 0) {
                            i20 = 0;
                        } else if (i20 > 16256) {
                            i20 = 1808980432;
                        }
                    } else {
                        i20 = 0;
                        i19 = 0;
                    }
                    i18 = (i21 << 18) + i17;
                    i17 = ((i19 - i17) >> 3) + (((i20 - i21) >> 3) << 18);
                    i15 += i25;
                    i21 = i15 >> 8;
                    i16--;
                    if (i16 <= 0) {
                        break;
                    }
                    i26 = i19;
                    i19 = i21;
                    i21 = i20;
                    i20 = i24;
                    i24 = i23;
                    i23 = i22;
                    i22 = i18;
                    i18 = i17;
                    i17 = i26;
                }
            } else {
                i18 = i20;
            }
            i19 = (i5 - i4) & 7;
            if (i19 > 0) {
                i26 = i19;
                i19 = i18;
                i18 = i26;
                do {
                    i20 = iArr2[(i19 >>> 25) + (-918150777 & i19)];
                    if (i20 != 0) {
                        iArr[i14] = ((((i20 & 16711935) * i21) & 1454124534) + (((-1818484845 & i20) * i21) & 1234540605)) >> 8;
                    }
                    i14++;
                    i19 += i17;
                    i18--;
                } while (i18 > 0);
            }
        }
    }

    final void do(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.ad) {
            if (i5 > this.bu * -1431886479) {
                i5 = this.bu * -1431886479;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i7 * i4);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            if (this.bp) {
                i17 = i4 - (this.br * 266497203);
                i18 = i8 + ((i11 >> 3) * i17);
                i19 = i9 + ((i12 >> 3) * i17);
                i20 = i10 + (i17 * (i13 >> 3));
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                    if (i21 < 0) {
                        i21 = 0;
                    } else if (i21 > 4032) {
                        i21 = 4032;
                    }
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i22 = i18 + i11;
                i23 = i19 + i12;
                i24 = i20 + i13;
                i18 = i24 >> 12;
                if (i18 != 0) {
                    i19 = i22 / i18;
                    i18 = i23 / i18;
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 4032) {
                        i19 = 4032;
                    }
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i17 = ((i18 - i17) >> 3) + (((i19 - i21) >> 3) << 20);
                i25 = i16 >> 3;
                i26 = i7 << 3;
                i21 = i15 >> 8;
                if (this.ab) {
                    if (i25 > 0) {
                        i27 = i18;
                        i18 = i17;
                        i17 = i27;
                        i28 = i19;
                        i19 = i21;
                        i21 = i28;
                        while (true) {
                            i16 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i29 = i14 + 1;
                            iArr[i14] = ((((i16 & 16711935) * i19) & -16711936) + (((65280 & i16) * i19) & 16711680)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                            i16 = i29 + 1;
                            iArr[i29] = ((((i14 & 65280) * i19) & 16711680) + (((16711935 & i14) * i19) & -16711936)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i29 = i16 + 1;
                            iArr[i16] = ((((i14 & 16711935) * i19) & -16711936) + (((65280 & i14) * i19) & 16711680)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i16 = i29 + 1;
                            iArr[i29] = ((((i14 & 16711935) * i19) & -16711936) + (((65280 & i14) * i19) & 16711680)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                            i29 = i16 + 1;
                            iArr[i16] = ((((i14 & 16711935) * i19) & -16711936) + (((65280 & i14) * i19) & 16711680)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i16 = i29 + 1;
                            iArr[i29] = ((((i14 & 65280) * i19) & 16711680) + (((16711935 & i14) * i19) & -16711936)) >> 8;
                            i20 += i18;
                            i14 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i29 = i16 + 1;
                            iArr[i16] = ((((i14 & 16711935) * i19) & -16711936) + (((65280 & i14) * i19) & 16711680)) >> 8;
                            i20 += i18;
                            i16 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i14 = i29 + 1;
                            iArr[i29] = (((i19 * (i16 & 65280)) & 16711680) + (((16711935 & i16) * i19) & -16711936)) >> 8;
                            i18 += i20;
                            i22 += i11;
                            i23 += i12;
                            i24 += i13;
                            i18 = i24 >> 12;
                            if (i18 != 0) {
                                i20 = i22 / i18;
                                i19 = i23 / i18;
                                if (i20 < 0) {
                                    i20 = 0;
                                } else if (i20 > 4032) {
                                    i20 = 4032;
                                }
                            } else {
                                i20 = 0;
                                i19 = 0;
                            }
                            i18 = (i21 << 20) + i17;
                            i17 = ((i19 - i17) >> 3) + (((i20 - i21) >> 3) << 20);
                            i15 += i26;
                            i21 = i15 >> 8;
                            i25--;
                            if (i25 <= 0) {
                                break;
                            }
                            i27 = i19;
                            i19 = i21;
                            i21 = i20;
                            i20 = i18;
                            i18 = i17;
                            i17 = i27;
                        }
                    } else {
                        i18 = i20;
                    }
                    i19 = (i5 - i4) & 7;
                    if (i19 > 0) {
                        i20 = i18;
                        i18 = i19;
                        while (true) {
                            i25 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i19 = i14 + 1;
                            iArr[i14] = ((((i25 & 65280) * i21) & 16711680) + (((16711935 & i25) * i21) & -16711936)) >> 8;
                            i20 += i17;
                            i18--;
                            if (i18 > 0) {
                                i14 = i19;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i25 > 0) {
                    i27 = i25;
                    i25 = i24;
                    i24 = i23;
                    i23 = i22;
                    i22 = i20;
                    i20 = i27;
                    i28 = i14;
                    i14 = i15;
                    i15 = i28;
                    while (true) {
                        i16 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 >>> 26) + (i22 & 4032)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        }
                        i15++;
                        i22 += i17;
                        i16 = iArr2[(i22 & 4032) + (i22 >>> 26)];
                        if (i16 != 0) {
                            iArr[i15] = ((((i16 & 16711935) * i21) & -16711936) + (((65280 & i16) * i21) & 16711680)) >> 8;
                        }
                        i15++;
                        i16 = i22 + i17;
                        i22 = iArr2[(i16 & 4032) + (i16 >>> 26)];
                        if (i22 != 0) {
                            iArr[i15] = (((i21 * (i22 & 16711935)) & -16711936) + (((65280 & i22) * i21) & 16711680)) >> 8;
                        }
                        i22 = i15 + 1;
                        i17 += i16;
                        i15 = i23 + i11;
                        i23 = i24 + i12;
                        i24 = i25 + i13;
                        i17 = i24 >> 12;
                        if (i17 != 0) {
                            i21 = i15 / i17;
                            i17 = i23 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 4032) {
                                i21 = 4032;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i16 = (i19 << 20) + i18;
                        i19 = (((i21 - i19) >> 3) << 20) + ((i17 - i18) >> 3);
                        i14 += i26;
                        i25 = i14 >> 8;
                        i18 = i20 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i20 = i18;
                        i18 = i17;
                        i17 = i19;
                        i19 = i21;
                        i21 = i25;
                        i25 = i24;
                        i24 = i23;
                        i23 = i15;
                        i15 = i22;
                        i22 = i16;
                    }
                    i21 = i22;
                    i18 = i16;
                } else {
                    i19 = i17;
                    i25 = i21;
                    i18 = i20;
                    i21 = i14;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i20 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i25) & -16711936) + (((65280 & i20) * i25) & 16711680)) >> 8;
                        }
                        i21++;
                        i18 += i19;
                        i17--;
                    } while (i17 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (this.br * 266497203);
            i18 = i8 + ((i11 >> 3) * i17);
            i19 = i9 + ((i12 >> 3) * i17);
            i20 = i10 + (i17 * (i13 >> 3));
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
                if (i21 < 0) {
                    i21 = 0;
                } else if (i21 > 16256) {
                    i21 = 16256;
                }
            } else {
                i21 = 0;
                i17 = 0;
            }
            i23 = i18 + i11;
            i24 = i19 + i12;
            i25 = i20 + i13;
            i18 = i25 >> 14;
            if (i18 != 0) {
                i19 = i23 / i18;
                i18 = i24 / i18;
                if (i19 < 0) {
                    i19 = 0;
                } else if (i19 > 16256) {
                    i19 = 16256;
                }
            } else {
                i19 = 0;
                i18 = 0;
            }
            i22 = (i21 << 18) + i17;
            i21 = (((i19 - i21) >> 3) << 18) + ((i18 - i17) >> 3);
            i17 = i16 >> 3;
            i29 = i7 << 3;
            i20 = i15 >> 8;
            if (this.ab) {
                if (i17 > 0) {
                    i27 = i17;
                    i17 = i21;
                    i21 = i20;
                    i20 = i27;
                    i28 = i15;
                    i15 = i14;
                    i14 = i28;
                    while (true) {
                        i16 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                        i26 = i15 + 1;
                        iArr[i15] = ((((i16 & 65280) * i21) & 16711680) + (((16711935 & i16) * i21) & -16711936)) >> 8;
                        i15 = i22 + i17;
                        i22 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i16 = i26 + 1;
                        iArr[i26] = ((((i22 & 16711935) * i21) & -16711936) + (((65280 & i22) * i21) & 16711680)) >> 8;
                        i15 += i17;
                        i22 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i26 = i16 + 1;
                        iArr[i16] = ((((i22 & 65280) * i21) & 16711680) + (((16711935 & i22) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i22 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i16 = i26 + 1;
                        iArr[i26] = ((((i22 & 16711935) * i21) & -16711936) + (((65280 & i22) * i21) & 16711680)) >> 8;
                        i15 += i17;
                        i22 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i26 = i16 + 1;
                        iArr[i16] = ((((i22 & 16711935) * i21) & -16711936) + (((65280 & i22) * i21) & 16711680)) >> 8;
                        i15 += i17;
                        i22 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i16 = i26 + 1;
                        iArr[i26] = ((((i22 & 65280) * i21) & 16711680) + (((16711935 & i22) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i22 = iArr2[(i15 >>> 25) + (i15 & 16256)];
                        i26 = i16 + 1;
                        iArr[i16] = ((((i22 & 65280) * i21) & 16711680) + (((16711935 & i22) * i21) & -16711936)) >> 8;
                        i15 += i17;
                        i16 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i22 = i26 + 1;
                        iArr[i26] = (((i21 * (i16 & 16711935)) & -16711936) + (((65280 & i16) * i21) & 16711680)) >> 8;
                        i17 += i15;
                        i15 = i23 + i11;
                        i23 = i24 + i12;
                        i24 = i25 + i13;
                        i17 = i24 >> 14;
                        if (i17 != 0) {
                            i21 = i15 / i17;
                            i17 = i23 / i17;
                            if (i21 < 0) {
                                i21 = 0;
                            } else if (i21 > 16256) {
                                i21 = 16256;
                            }
                        } else {
                            i21 = 0;
                            i17 = 0;
                        }
                        i16 = (i19 << 18) + i18;
                        i19 = (((i21 - i19) >> 3) << 18) + ((i17 - i18) >> 3);
                        i14 += i29;
                        i25 = i14 >> 8;
                        i18 = i20 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        i20 = i18;
                        i18 = i17;
                        i17 = i19;
                        i19 = i21;
                        i21 = i25;
                        i25 = i24;
                        i24 = i23;
                        i23 = i15;
                        i15 = i22;
                        i22 = i16;
                    }
                } else {
                    i19 = i21;
                    i25 = i20;
                    i16 = i22;
                    i22 = i14;
                }
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    while (true) {
                        i18 = iArr2[(i16 & 16256) + (i16 >>> 25)];
                        i21 = i22 + 1;
                        iArr[i22] = ((((i18 & 16711935) * i25) & -16711936) + (((65280 & i18) * i25) & 16711680)) >> 8;
                        i16 += i19;
                        i17--;
                        if (i17 > 0) {
                            i22 = i21;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i17 > 0) {
                i26 = i15;
                i27 = i24;
                i24 = i17;
                i17 = i27;
                while (true) {
                    i15 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                    if (i15 != 0) {
                        iArr[i14] = ((((i15 & 65280) * i20) & 16711680) + (((16711935 & i15) * i20) & -16711936)) >> 8;
                    }
                    i15 = i14 + 1;
                    i14 = i22 + i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 16711935) * i20) & -16711936) + (((65280 & i22) * i20) & 16711680)) >> 8;
                    }
                    i15++;
                    i14 += i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 16711935) * i20) & -16711936) + (((65280 & i22) * i20) & 16711680)) >> 8;
                    }
                    i15++;
                    i14 += i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 65280) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                    }
                    i15++;
                    i14 += i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 65280) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                    }
                    i15++;
                    i14 += i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 65280) * i20) & 16711680) + (((16711935 & i22) * i20) & -16711936)) >> 8;
                    }
                    i15++;
                    i14 += i21;
                    i22 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                    if (i22 != 0) {
                        iArr[i15] = ((((i22 & 16711935) * i20) & -16711936) + (((65280 & i22) * i20) & 16711680)) >> 8;
                    }
                    i15++;
                    i22 = i14 + i21;
                    i14 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                    if (i14 != 0) {
                        iArr[i15] = (((i20 * (i14 & 16711935)) & -16711936) + (((65280 & i14) * i20) & 16711680)) >> 8;
                    }
                    i14 = i15 + 1;
                    i21 += i22;
                    i16 = i23 + i11;
                    i15 = i17 + i12;
                    i23 = i25 + i13;
                    i17 = i23 >> 14;
                    if (i17 != 0) {
                        i25 = i16 / i17;
                        i17 = i15 / i17;
                        if (i25 < 0) {
                            i25 = 0;
                        } else if (i25 > 16256) {
                            i25 = 16256;
                        }
                    } else {
                        i25 = 0;
                        i17 = 0;
                    }
                    i22 = (i19 << 18) + i18;
                    i21 = ((i17 - i18) >> 3) + (((i25 - i19) >> 3) << 18);
                    i19 = i26 + i29;
                    i20 = i19 >> 8;
                    i18 = i24 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    i24 = i18;
                    i26 = i19;
                    i18 = i17;
                    i19 = i25;
                    i17 = i15;
                    i25 = i23;
                    i23 = i16;
                }
            }
            i17 = (i5 - i4) & 7;
            if (i17 > 0) {
                do {
                    i18 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                    if (i18 != 0) {
                        iArr[i14] = ((((i18 & 16711935) * i20) & -16711936) + (((65280 & i18) * i20) & 16711680)) >> 8;
                    }
                    i14++;
                    i22 += i21;
                    i17--;
                } while (i17 > 0);
            }
        }
    }

    final void af(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        try {
            int[] an = by.ae.an(i19, (byte) 16);
            int aq;
            if (an == null) {
                aq = by.ae.aq(i19, -1700184018);
                ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -1910609814), lq.bq(aq, i8, -2069418781), lq.bq(aq, i9, -1932397916), -1565093820);
                return;
            }
            int i21;
            int i22;
            int i23;
            this.bp = by.ae.aa(i19, 1150346671);
            this.ab = by.ae.ao(i19, -2135490889);
            int i24 = i5 - i4;
            int i25 = i2 - i;
            int i26 = i6 - i4;
            int i27 = i3 - i;
            int i28 = i8 - i7;
            int i29 = i9 - i7;
            if (i2 != i) {
                i21 = ((i5 - i4) << 14) / (i2 - i);
            } else {
                i21 = 0;
            }
            if (i3 != i2) {
                i22 = ((i6 - i5) << 14) / (i3 - i2);
            } else {
                i22 = 0;
            }
            if (i3 != i) {
                i23 = ((i4 - i6) << 14) / (i - i3);
            } else {
                i23 = 0;
            }
            aq = (i27 * i24) - (i25 * i26);
            if (aq != 0) {
                int i30 = (((i27 * i28) - (i25 * i29)) << 9) / aq;
                int i31 = (((i24 * i29) - (i28 * i26)) << 9) / aq;
                aq = i10 - i11;
                i24 = i13 - i14;
                i25 = i16 - i17;
                i26 = i12 - i10;
                i27 = i15 - i13;
                i28 = i18 - i16;
                i29 = ((i26 * i13) - (i27 * i10)) << 14;
                int i32 = (int) ((((long) ((i16 * i27) - (i28 * i13))) << 14) / ((long) (411538491 * this.bt)));
                int i33 = (int) ((((long) ((i28 * i10) - (i16 * i26))) << 14) / ((long) (this.bt * 411538491)));
                int i34 = ((aq * i13) - (i10 * i24)) << 14;
                int i35 = (int) ((((long) ((i16 * i24) - (i25 * i13))) << 14) / ((long) (411538491 * this.bt)));
                int i36 = (int) ((((long) ((i10 * i25) - (aq * i16))) << 14) / ((long) (411538491 * this.bt)));
                int i37 = ((i26 * i24) - (i27 * aq)) << 14;
                int i38 = (int) ((((long) ((i27 * i25) - (i24 * i28))) << 14) / ((long) (411538491 * this.bt)));
                int i39 = (int) ((((long) ((aq * i28) - (i26 * i25))) << 14) / ((long) (this.bt * 411538491)));
                int i40;
                int i41;
                int i42;
                int i43;
                int i44;
                int i45;
                int i46;
                if (i > i2 || i > i3) {
                    if (i2 <= i3) {
                        if (i2 < this.bd * 286513717) {
                            if (i3 > this.bd * 286513717) {
                                i26 = this.bd * 286513717;
                            } else {
                                i26 = i3;
                            }
                            if (i > 286513717 * this.bd) {
                                i = 286513717 * this.bd;
                            }
                            aq = ((i8 << 9) - (i5 * i30)) + i30;
                            if (i26 < i) {
                                i24 = i5 << 14;
                                if (i2 < 0) {
                                    i25 = i24 - (i21 * i2);
                                    i24 -= i2 * i22;
                                    aq -= i31 * i2;
                                    i2 = 0;
                                } else {
                                    i25 = i24;
                                }
                                i40 = i6 << 14;
                                if (i26 < 0) {
                                    i40 -= i26 * i23;
                                    i26 = 0;
                                }
                                i27 = i2 - (1621686031 * this.bb);
                                i41 = i29 + (i33 * i27);
                                i34 += i27 * i36;
                                i37 += i27 * i39;
                                if ((i2 == i26 || i21 >= i22) && (i26 != i2 || i21 <= i23)) {
                                    i42 = i - i26;
                                    i26 -= i2;
                                    i27 = this.bo[i2];
                                    i43 = aq;
                                    i44 = i24;
                                    i45 = i25;
                                    aq = i26;
                                    while (true) {
                                        i46 = aq - 1;
                                        if (i46 < 0) {
                                            break;
                                        }
                                        au(this.aj, an, 0, 0, i27, i44 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                        i45 += i21;
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i44 += i22;
                                        aq = i46;
                                    }
                                    i22 = i45;
                                    aq = i42;
                                    while (true) {
                                        i45 = aq - 1;
                                        if (i45 >= 0) {
                                            au(this.aj, an, 0, 0, i27, i40 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                            i40 += i23;
                                            i43 += i31;
                                            i27 += -1842132067 * this.af;
                                            i41 += i33;
                                            i34 += i36;
                                            i37 += i39;
                                            i22 += i21;
                                            aq = i45;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i42 = i - i26;
                                i26 -= i2;
                                i27 = this.bo[i2];
                                i43 = aq;
                                i44 = i24;
                                i45 = i25;
                                aq = i26;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i27, i45 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i45 += i21;
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i22;
                                    aq = i46;
                                }
                                i22 = i40;
                                aq = i42;
                                i40 = i45;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 >= 0) {
                                        au(this.aj, an, 0, 0, i27, i40 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i22 += i23;
                                        i40 += i21;
                                        aq = i45;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i25 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i25 - (i21 * i2);
                                i40 = i25 - (i2 * i22);
                                i43 = aq - (i2 * i31);
                                i2 = 0;
                                aq = i24;
                            } else {
                                i43 = aq;
                                i40 = i25;
                                aq = i25;
                            }
                            i45 = i4 << 14;
                            if (i < 0) {
                                i45 -= i23 * i;
                                i = 0;
                            }
                            i24 = i2 - (this.bb * 1621686031);
                            i41 = i29 + (i33 * i24);
                            i34 += i24 * i36;
                            i37 += i24 * i39;
                            if (i21 < i22) {
                                i42 = i26 - i;
                                i24 = i - i2;
                                i27 = this.bo[i2];
                                i44 = aq;
                                aq = i24;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i40 += i22;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i21;
                                    aq = i46;
                                }
                                i21 = i40;
                                aq = i42;
                                while (true) {
                                    i40 = aq - 1;
                                    if (i40 >= 0) {
                                        au(this.aj, an, 0, 0, i27, i45 >> 14, i21 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                        i45 += i23;
                                        i43 += i31;
                                        i27 += this.af * -1842132067;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i21 += i22;
                                        aq = i40;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i42 = i26 - i;
                            i24 = i - i2;
                            i27 = this.bo[i2];
                            i44 = aq;
                            aq = i24;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i40 += i22;
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i21;
                                aq = i46;
                            }
                            i21 = i40;
                            aq = i42;
                            i40 = i45;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 >= 0) {
                                    au(this.aj, an, 0, 0, i27, i21 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i21 += i22;
                                    i40 += i23;
                                    aq = i45;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else if (i3 < this.bd * 286513717) {
                        if (i > this.bd * 286513717) {
                            i27 = this.bd * 286513717;
                        } else {
                            i27 = i;
                        }
                        if (i2 > 286513717 * this.bd) {
                            i26 = 286513717 * this.bd;
                        } else {
                            i26 = i2;
                        }
                        aq = ((i9 << 9) - (i6 * i30)) + i30;
                        if (i27 < i26) {
                            i24 = i6 << 14;
                            if (i3 < 0) {
                                i40 = i24 - (i3 * i22);
                                i24 -= i23 * i3;
                                i43 = aq - (i3 * i31);
                                i3 = 0;
                                aq = i24;
                            } else {
                                i43 = aq;
                                i40 = i24;
                                aq = i24;
                            }
                            i45 = i4 << 14;
                            if (i27 < 0) {
                                i45 -= i21 * i27;
                                i24 = 0;
                            } else {
                                i24 = i27;
                            }
                            i25 = i3 - (this.bb * 1621686031);
                            i41 = i29 + (i25 * i33);
                            i34 += i25 * i36;
                            i37 += i25 * i39;
                            if (i22 < i23) {
                                i42 = i26 - i24;
                                i24 -= i3;
                                i27 = this.bo[i3];
                                i44 = aq;
                                aq = i24;
                                while (true) {
                                    i46 = aq - 1;
                                    if (i46 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i40 += i22;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i44 += i23;
                                    aq = i46;
                                }
                                aq = i42;
                                while (true) {
                                    i42 = aq - 1;
                                    if (i42 >= 0) {
                                        au(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                        i43 += i31;
                                        i27 += -1842132067 * this.af;
                                        i41 += i33;
                                        i34 += i36;
                                        i37 += i39;
                                        i40 += i22;
                                        i45 += i21;
                                        aq = i42;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i42 = i26 - i24;
                            i24 -= i3;
                            i27 = this.bo[i3];
                            i44 = aq;
                            aq = i24;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i40 += i22;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i23;
                                aq = i46;
                            }
                            aq = i42;
                            while (true) {
                                i42 = aq - 1;
                                if (i42 >= 0) {
                                    au(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i45 += i21;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i40 += i22;
                                    aq = i42;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i6 << 14;
                        if (i3 < 0) {
                            i25 = i24 - (i22 * i3);
                            i24 -= i3 * i23;
                            aq -= i3 * i31;
                            i3 = 0;
                        } else {
                            i25 = i24;
                        }
                        i45 = i5 << 14;
                        if (i26 < 0) {
                            i45 -= i26 * i21;
                            i26 = 0;
                        }
                        i28 = i3 - (1621686031 * this.bb);
                        i41 = i29 + (i33 * i28);
                        i34 += i28 * i36;
                        i37 += i28 * i39;
                        if (i22 < i23) {
                            i42 = i27 - i26;
                            i26 -= i3;
                            i27 = this.bo[i3];
                            i43 = aq;
                            i40 = i24;
                            i44 = i25;
                            aq = i26;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i40 += i23;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i22;
                                aq = i46;
                            }
                            i22 = i40;
                            aq = i42;
                            while (true) {
                                i40 = aq - 1;
                                if (i40 >= 0) {
                                    au(this.aj, an, 0, 0, i27, i45 >> 14, i22 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i45 += i21;
                                    i43 += i31;
                                    i27 += this.af * -1842132067;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i22 += i23;
                                    aq = i40;
                                } else {
                                    return;
                                }
                            }
                        }
                        i42 = i27 - i26;
                        i26 -= i3;
                        i27 = this.bo[i3];
                        i43 = aq;
                        i40 = i24;
                        i44 = i25;
                        aq = i26;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                            i40 += i23;
                            i43 += i31;
                            i27 += -1842132067 * this.af;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i22;
                            aq = i46;
                        }
                        i22 = i40;
                        aq = i42;
                        i40 = i45;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 >= 0) {
                                au(this.aj, an, 0, 0, i27, i22 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i22 += i23;
                                i40 += i21;
                                aq = i45;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i < 286513717 * this.bd) {
                    if (i2 > this.bd * 286513717) {
                        i26 = this.bd * 286513717;
                    } else {
                        i26 = i2;
                    }
                    if (i3 > 286513717 * this.bd) {
                        i3 = 286513717 * this.bd;
                    }
                    aq = ((i7 << 9) - (i30 * i4)) + i30;
                    if (i26 < i3) {
                        i24 = i4 << 14;
                        if (i < 0) {
                            i40 = i24 - (i * i23);
                            i24 -= i21 * i;
                            i43 = aq - (i * i31);
                            i = 0;
                            aq = i24;
                        } else {
                            i43 = aq;
                            i40 = i24;
                            aq = i24;
                        }
                        i45 = i5 << 14;
                        if (i26 < 0) {
                            i45 -= i22 * i26;
                            i24 = 0;
                        } else {
                            i24 = i26;
                        }
                        i25 = i - (1621686031 * this.bb);
                        i41 = i29 + (i33 * i25);
                        i34 += i25 * i36;
                        i37 += i25 * i39;
                        if ((i24 == i || i23 >= i21) && (i != i24 || i23 <= i22)) {
                            i42 = i3 - i24;
                            i24 -= i;
                            i27 = this.bo[i];
                            i44 = aq;
                            aq = i24;
                            while (true) {
                                i46 = aq - 1;
                                if (i46 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i27, i44 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i40 += i23;
                                i43 += i31;
                                i27 += this.af * -1842132067;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i44 += i21;
                                aq = i46;
                            }
                            i21 = i40;
                            aq = i42;
                            i40 = i45;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 >= 0) {
                                    au(this.aj, an, 0, 0, i27, i40 >> 14, i21 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                    i43 += i31;
                                    i27 += -1842132067 * this.af;
                                    i41 += i33;
                                    i34 += i36;
                                    i37 += i39;
                                    i21 += i23;
                                    i40 += i22;
                                    aq = i45;
                                } else {
                                    return;
                                }
                            }
                        }
                        i42 = i3 - i24;
                        i24 -= i;
                        i27 = this.bo[i];
                        i44 = aq;
                        aq = i24;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i27, i40 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                            i40 += i23;
                            i43 += i31;
                            i27 += -1842132067 * this.af;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i21;
                            aq = i46;
                        }
                        i21 = i40;
                        aq = i42;
                        while (true) {
                            i40 = aq - 1;
                            if (i40 >= 0) {
                                au(this.aj, an, 0, 0, i27, i21 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i45 += i22;
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i21 += i23;
                                aq = i40;
                            } else {
                                return;
                            }
                        }
                    }
                    i25 = i4 << 14;
                    if (i < 0) {
                        i24 = i25 - (i23 * i);
                        i25 -= i21 * i;
                        aq -= i * i31;
                        i = 0;
                    } else {
                        i24 = i25;
                    }
                    i40 = i6 << 14;
                    if (i3 < 0) {
                        i40 -= i22 * i3;
                        i3 = 0;
                    }
                    i27 = i - (1621686031 * this.bb);
                    i41 = i29 + (i27 * i33);
                    i34 += i36 * i27;
                    i37 += i27 * i39;
                    if ((i3 == i || i23 >= i21) && (i != i3 || i22 <= i21)) {
                        i42 = i26 - i3;
                        i26 = i3 - i;
                        i27 = this.bo[i];
                        i43 = aq;
                        i44 = i24;
                        i45 = i25;
                        aq = i26;
                        while (true) {
                            i46 = aq - 1;
                            if (i46 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i27, i45 >> 14, i44 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                            i45 += i21;
                            i43 += i31;
                            i27 += this.af * -1842132067;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i44 += i23;
                            aq = i46;
                        }
                        aq = i42;
                        while (true) {
                            i42 = aq - 1;
                            if (i42 >= 0) {
                                au(this.aj, an, 0, 0, i27, i45 >> 14, i40 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                                i43 += i31;
                                i27 += -1842132067 * this.af;
                                i41 += i33;
                                i34 += i36;
                                i37 += i39;
                                i40 += i22;
                                i45 += i21;
                                aq = i42;
                            } else {
                                return;
                            }
                        }
                    }
                    i42 = i26 - i3;
                    i26 = i3 - i;
                    i27 = this.bo[i];
                    i43 = aq;
                    i44 = i24;
                    i45 = i25;
                    aq = i26;
                    while (true) {
                        i46 = aq - 1;
                        if (i46 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i27, i44 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                        i45 += i21;
                        i43 += i31;
                        i27 += -1842132067 * this.af;
                        i41 += i33;
                        i34 += i36;
                        i37 += i39;
                        i44 += i23;
                        aq = i46;
                    }
                    aq = i42;
                    while (true) {
                        i42 = aq - 1;
                        if (i42 >= 0) {
                            au(this.aj, an, 0, 0, i27, i40 >> 14, i45 >> 14, i43, i30, i41, i34, i37, i32, i35, i38, 527303298);
                            i40 += i22;
                            i43 += i31;
                            i27 += -1842132067 * this.af;
                            i41 += i33;
                            i34 += i36;
                            i37 += i39;
                            i45 += i21;
                            aq = i42;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.af(" + ')');
        }
    }

    final void dm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = by.ae.an(i19, (byte) 16);
        if (an == null) {
            int aq = by.ae.aq(i19, -2041025283);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -1996914815), lq.bq(aq, i8, -1909556337), lq.bq(aq, i9, -1998615774), -728471442);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bp = by.ae.aa(i19, 2057330048);
        this.ab = by.ae.ao(i19, -2135490889);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i3 != i) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aq = (i26 * i23) - (i24 * i25);
        if (aq != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aq;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aq;
            aq = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i26 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i26) - (i27 * i13))) << 14) / ((long) (-735642856 * this.bt)));
            int i32 = (int) ((((long) ((i27 * i10) - (i16 * i25))) << 14) / ((long) (this.bt * 411538491)));
            int i33 = ((aq * i13) - (i10 * i23)) << 14;
            int i34 = (int) ((((long) ((i16 * i23) - (i24 * i13))) << 14) / ((long) (411538491 * this.bt)));
            int i35 = (int) ((((long) ((i10 * i24) - (aq * i16))) << 14) / ((long) (411538491 * this.bt)));
            int i36 = ((i25 * i23) - (i26 * aq)) << 14;
            int i37 = (int) ((((long) ((i26 * i24) - (i23 * i27))) << 14) / ((long) (411538491 * this.bt)));
            int i38 = (int) ((((long) ((aq * i27) - (i25 * i24))) << 14) / ((long) (this.bt * 411538491)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > this.bd * -708097435) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > 286513717 * this.bd) {
                            i = -817057228 * this.bd;
                        }
                        aq = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i23 - (i20 * i2);
                                i23 -= i2 * i21;
                                aq -= i30 * i2;
                                i2 = 0;
                            } else {
                                i24 = i23;
                            }
                            i25 = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i39 = i25 - (i3 * i22);
                            } else {
                                i39 = i25;
                            }
                            i25 = i2 - (-1104470326 * this.bb);
                            i40 = i28 + (i32 * i25);
                            i33 += i25 * i35;
                            i36 += i25 * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i41 = i - i3;
                                i25 = i3 - i2;
                                i26 = this.bo[i2];
                                i42 = aq;
                                i43 = i23;
                                i44 = i24;
                                aq = i25;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i44 += i20;
                                    i42 += i30;
                                    i26 += 120515116 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i21;
                                    aq = i45;
                                }
                                i21 = i44;
                                aq = i41;
                                while (true) {
                                    i44 = aq - 1;
                                    if (i44 >= 0) {
                                        au(this.aj, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                        i39 += i22;
                                        i42 += i30;
                                        i26 += 1804325263 * this.af;
                                        i40 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aq = i44;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i41 = i - i3;
                            i25 = i3 - i2;
                            i26 = this.bo[i2];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i20;
                                i42 += i30;
                                i26 += 706822130 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i21;
                                aq = i45;
                            }
                            i21 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += 179022753 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i24 -= i2 * i21;
                            aq -= i2 * i30;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = i25 - (i22 * i);
                        } else {
                            i39 = i25;
                        }
                        i25 = i2 - (this.bb * 1621686031);
                        i40 = i28 + (i32 * i25);
                        i33 += i25 * i35;
                        i36 += i25 * i38;
                        if (i20 < i21) {
                            i41 = i3 - i;
                            i25 = i - i2;
                            i26 = this.bo[i2];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * 1157025199;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i20;
                                aq = i45;
                            }
                            i20 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += this.af * 587732192;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i3 - i;
                        i25 = i - i2;
                        i26 = this.bo[i2];
                        i42 = aq;
                        i43 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i22;
                                i42 += i30;
                                i26 += -99471266 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bd * 286513717) {
                    if (i > this.bd * 286513717) {
                        i = this.bd * 1950736478;
                    }
                    if (i2 > 390852958 * this.bd) {
                        i26 = 963220865 * this.bd;
                    } else {
                        i26 = i2;
                    }
                    aq = ((i9 << 9) - (i6 * i29)) + i29;
                    if (i < i26) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i24 = i23 - (i3 * i21);
                            i23 -= i22 * i3;
                            aq -= i3 * i30;
                            i3 = 0;
                        } else {
                            i24 = i23;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = i25 - (i20 * i);
                        } else {
                            i39 = i25;
                        }
                        i25 = i3 - (this.bb * 1810963990);
                        i40 = i28 + (i25 * i32);
                        i33 += i25 * i35;
                        i36 += i25 * i38;
                        if (i21 < i22) {
                            i41 = i26 - i;
                            i25 = i - i3;
                            i26 = this.bo[i3];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i22;
                                aq = i45;
                            }
                            i22 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i20;
                                    i42 += i30;
                                    i26 += -1682935652 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i22 += i21;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i26 - i;
                        i25 = i - i3;
                        i26 = this.bo[i3];
                        i42 = aq;
                        i43 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += 229644537 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i22;
                            aq = i45;
                        }
                        i22 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i20;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i22 += i21;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i3 * i22;
                        aq -= i3 * i30;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i26 < 0) {
                        i39 = i25 - (i26 * i20);
                        i25 = 0;
                    } else {
                        i39 = i25;
                        i25 = i26;
                    }
                    i26 = i3 - (1621686031 * this.bb);
                    i40 = i28 + (i32 * i26);
                    i33 += i26 * i35;
                    i36 += i26 * i38;
                    if (i21 < i22) {
                        i41 = i - i25;
                        i25 -= i3;
                        i26 = this.bo[i3];
                        i42 = aq;
                        i44 = i23;
                        i43 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += 378466540 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i21;
                            aq = i45;
                        }
                        i21 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i20;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i - i25;
                    i25 -= i3;
                    i26 = this.bo[i3];
                    i42 = aq;
                    i44 = i23;
                    i43 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1228055813 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i21;
                        aq = i45;
                    }
                    i21 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i20;
                            i42 += i30;
                            i26 += this.af * -1496975085;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < 286513717 * this.bd) {
                if (i2 > this.bd * -591704767) {
                    i2 = this.bd * 286513717;
                }
                if (i3 > -1401059547 * this.bd) {
                    i26 = 286513717 * this.bd;
                } else {
                    i26 = i3;
                }
                aq = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i26) {
                    i23 = i4 << 14;
                    if (i < 0) {
                        i44 = i23 - (i * i22);
                        i23 -= i20 * i;
                        i42 = aq - (i * i30);
                        i = 0;
                    } else {
                        i42 = aq;
                        i44 = i23;
                    }
                    aq = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = aq - (i21 * i2);
                    } else {
                        i39 = aq;
                    }
                    aq = i - (1621686031 * this.bb);
                    i40 = i28 + (i32 * aq);
                    i33 += aq * i35;
                    i36 += aq * i38;
                    if ((i2 == i || i22 >= i20) && (i != i2 || i22 <= i21)) {
                        i41 = i26 - i2;
                        aq = i2 - i;
                        i26 = this.bo[i];
                        i43 = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i21;
                                i42 += i30;
                                i26 += -1404981145 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i26 - i2;
                    aq = i2 - i;
                    i26 = this.bo[i];
                    i43 = i23;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i20;
                        aq = i45;
                    }
                    i20 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += 1966781245 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i4 << 14;
                if (i < 0) {
                    i23 = i24 - (i22 * i);
                    i24 -= i20 * i;
                    aq -= i * i30;
                    i = 0;
                } else {
                    i23 = i24;
                }
                i25 = i6 << 14;
                if (i26 < 0) {
                    i39 = i25 - (i26 * i21);
                    i25 = 0;
                } else {
                    i39 = i25;
                    i25 = i26;
                }
                i26 = i - (1621686031 * this.bb);
                i40 = i28 + (i26 * i32);
                i33 += i35 * i26;
                i36 += i26 * i38;
                if ((i25 == i || i22 >= i20) && (i != i25 || i21 <= i20)) {
                    i41 = i2 - i25;
                    i25 -= i;
                    i26 = this.bo[i];
                    i42 = aq;
                    i43 = i23;
                    i44 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i20;
                        i42 += i30;
                        i26 += this.af * 992727878;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i22;
                        aq = i45;
                    }
                    i22 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += 1796658697 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i22 += i20;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
                i41 = i2 - i25;
                i25 -= i;
                i26 = this.bo[i];
                i42 = aq;
                i43 = i23;
                i44 = i24;
                aq = i25;
                while (true) {
                    i45 = aq - 1;
                    if (i45 < 0) {
                        break;
                    }
                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                    i44 += i20;
                    i42 += i30;
                    i26 += -211336312 * this.af;
                    i40 += i32;
                    i33 += i35;
                    i36 += i38;
                    i43 += i22;
                    aq = i45;
                }
                i22 = i44;
                aq = i41;
                while (true) {
                    i44 = aq - 1;
                    if (i44 >= 0) {
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i39 += i21;
                        i42 += i30;
                        i26 += 772229237 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i22 += i20;
                        aq = i44;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = by.ae.an(i19, (byte) 16);
        if (an == null) {
            int aq = by.ae.aq(i19, 71647345);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -1989533823), lq.bq(aq, i8, -2057192530), lq.bq(aq, i9, -2041249145), 1513180648);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bp = by.ae.aa(i19, 1284637434);
        this.ab = by.ae.ao(i19, -2135490889);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i3 != i) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aq = (i26 * i23) - (i24 * i25);
        if (aq != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aq;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aq;
            aq = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i26 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i26) - (i27 * i13))) << 14) / ((long) (411538491 * this.bt)));
            int i32 = (int) ((((long) ((i27 * i10) - (i16 * i25))) << 14) / ((long) (this.bt * 411538491)));
            int i33 = ((aq * i13) - (i10 * i23)) << 14;
            int i34 = (int) ((((long) ((i16 * i23) - (i24 * i13))) << 14) / ((long) (411538491 * this.bt)));
            int i35 = (int) ((((long) ((i10 * i24) - (aq * i16))) << 14) / ((long) (411538491 * this.bt)));
            int i36 = ((i25 * i23) - (i26 * aq)) << 14;
            int i37 = (int) ((((long) ((i26 * i24) - (i23 * i27))) << 14) / ((long) (411538491 * this.bt)));
            int i38 = (int) ((((long) ((aq * i27) - (i25 * i24))) << 14) / ((long) (this.bt * 411538491)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > this.bd * 286513717) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > 286513717 * this.bd) {
                            i = 286513717 * this.bd;
                        }
                        aq = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i39 = i23 - (i20 * i2);
                                i23 -= i2 * i21;
                                i40 = aq - (i30 * i2);
                                i2 = 0;
                            } else {
                                i40 = aq;
                                i39 = i23;
                            }
                            aq = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i41 = aq - (i3 * i22);
                            } else {
                                i41 = aq;
                            }
                            aq = i2 - (1621686031 * this.bb);
                            i42 = i28 + (i32 * aq);
                            i33 += aq * i35;
                            i36 += aq * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i43 = i - i3;
                                aq = i3 - i2;
                                i26 = this.bo[i2];
                                i44 = i23;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i20;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i21;
                                    aq = i45;
                                }
                                i21 = i39;
                                aq = i43;
                                while (true) {
                                    i39 = aq - 1;
                                    if (i39 >= 0) {
                                        au(this.aj, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                        i41 += i22;
                                        i40 += i30;
                                        i26 += -1842132067 * this.af;
                                        i42 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aq = i39;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i43 = i - i3;
                            aq = i3 - i2;
                            i26 = this.bo[i2];
                            i44 = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i39 += i20;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i21;
                                aq = i45;
                            }
                            i21 = i39;
                            aq = i43;
                            while (true) {
                                i39 = aq - 1;
                                if (i39 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aq = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i24 -= i2 * i21;
                            aq -= i2 * i30;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = i25 - (i22 * i);
                        } else {
                            i41 = i25;
                        }
                        i25 = i2 - (this.bb * 1621686031);
                        i42 = i28 + (i32 * i25);
                        i33 += i25 * i35;
                        i36 += i25 * i38;
                        if (i20 < i21) {
                            i43 = i3 - i;
                            i25 = i - i2;
                            i26 = this.bo[i2];
                            i40 = aq;
                            i44 = i23;
                            i39 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i39 += i21;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                aq = i45;
                            }
                            i20 = i39;
                            aq = i43;
                            while (true) {
                                i39 = aq - 1;
                                if (i39 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                    i41 += i22;
                                    i40 += i30;
                                    i26 += this.af * -1842132067;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aq = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i3 - i;
                        i25 = i - i2;
                        i26 = this.bo[i2];
                        i40 = aq;
                        i44 = i23;
                        i39 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aq = i45;
                        }
                        i20 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                au(this.aj, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i41 += i22;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bd * 286513717) {
                    if (i > this.bd * 286513717) {
                        i = this.bd * 286513717;
                    }
                    if (i2 > 286513717 * this.bd) {
                        i26 = 286513717 * this.bd;
                    } else {
                        i26 = i2;
                    }
                    aq = ((i9 << 9) - (i6 * i29)) + i29;
                    if (i < i26) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i39 = i23 - (i3 * i21);
                            i23 -= i22 * i3;
                            i40 = aq - (i3 * i30);
                            i3 = 0;
                        } else {
                            i40 = aq;
                            i39 = i23;
                        }
                        aq = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i41 = aq - (i20 * i);
                        } else {
                            i41 = aq;
                        }
                        aq = i3 - (this.bb * 1621686031);
                        i42 = i28 + (aq * i32);
                        i33 += aq * i35;
                        i36 += aq * i38;
                        if (i21 < i22) {
                            i43 = i26 - i;
                            aq = i - i3;
                            i26 = this.bo[i3];
                            i44 = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i39 += i21;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i22;
                                aq = i45;
                            }
                            i22 = i39;
                            aq = i43;
                            while (true) {
                                i39 = aq - 1;
                                if (i39 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i22 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                    i41 += i20;
                                    i40 += i30;
                                    i26 += -1842132067 * this.af;
                                    i42 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i22 += i21;
                                    aq = i39;
                                } else {
                                    return;
                                }
                            }
                        }
                        i43 = i26 - i;
                        aq = i - i3;
                        i26 = this.bo[i3];
                        i44 = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i22;
                            aq = i45;
                        }
                        i22 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                au(this.aj, an, 0, 0, i26, i41 >> 14, i22 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i41 += i20;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i22 += i21;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i3 * i22;
                        aq -= i3 * i30;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i26 < 0) {
                        i41 = i25 - (i26 * i20);
                        i25 = 0;
                    } else {
                        i41 = i25;
                        i25 = i26;
                    }
                    i26 = i3 - (1621686031 * this.bb);
                    i42 = i28 + (i32 * i26);
                    i33 += i26 * i35;
                    i36 += i26 * i38;
                    if (i21 < i22) {
                        i43 = i - i25;
                        i25 -= i3;
                        i26 = this.bo[i3];
                        i40 = aq;
                        i39 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i39 += i22;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i21;
                            aq = i45;
                        }
                        i21 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                au(this.aj, an, 0, 0, i26, i41 >> 14, i21 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i41 += i20;
                                i40 += i30;
                                i26 += this.af * -1842132067;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i - i25;
                    i25 -= i3;
                    i26 = this.bo[i3];
                    i40 = aq;
                    i39 = i23;
                    i44 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1842132067 * this.af;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i21;
                        aq = i45;
                    }
                    i21 = i39;
                    aq = i43;
                    while (true) {
                        i39 = aq - 1;
                        if (i39 >= 0) {
                            au(this.aj, an, 0, 0, i26, i21 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i41 += i20;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aq = i39;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < 286513717 * this.bd) {
                if (i2 > this.bd * 286513717) {
                    i2 = this.bd * 286513717;
                }
                if (i3 > 286513717 * this.bd) {
                    i25 = 286513717 * this.bd;
                } else {
                    i25 = i3;
                }
                aq = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i25) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i * i22);
                        i24 -= i20 * i;
                        aq -= i * i30;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i26 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i41 = i26 - (i21 * i2);
                    } else {
                        i41 = i26;
                    }
                    i26 = i - (1621686031 * this.bb);
                    i42 = i28 + (i32 * i26);
                    i33 += i26 * i35;
                    i36 += i26 * i38;
                    if ((i2 == i || i22 >= i20) && (i != i2 || i22 <= i21)) {
                        i43 = i25 - i2;
                        i25 = i2 - i;
                        i26 = this.bo[i];
                        i40 = aq;
                        i39 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i39 += i22;
                            i40 += i30;
                            i26 += this.af * -1842132067;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aq = i45;
                        }
                        i20 = i39;
                        aq = i43;
                        while (true) {
                            i39 = aq - 1;
                            if (i39 >= 0) {
                                au(this.aj, an, 0, 0, i26, i41 >> 14, i20 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                                i41 += i21;
                                i40 += i30;
                                i26 += -1842132067 * this.af;
                                i42 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aq = i39;
                            } else {
                                return;
                            }
                        }
                    }
                    i43 = i25 - i2;
                    i25 = i2 - i;
                    i26 = this.bo[i];
                    i40 = aq;
                    i39 = i23;
                    i44 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                        i39 += i22;
                        i40 += i30;
                        i26 += -1842132067 * this.af;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aq = i45;
                    }
                    i20 = i39;
                    aq = i43;
                    while (true) {
                        i39 = aq - 1;
                        if (i39 >= 0) {
                            au(this.aj, an, 0, 0, i26, i20 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i41 += i21;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aq = i39;
                        } else {
                            return;
                        }
                    }
                }
                i23 = i4 << 14;
                if (i < 0) {
                    i24 = i23 - (i22 * i);
                    i39 = i23 - (i20 * i);
                    i40 = aq - (i * i30);
                    i = 0;
                } else {
                    i40 = aq;
                    i24 = i23;
                    i39 = i23;
                }
                aq = i6 << 14;
                if (i25 < 0) {
                    i41 = aq - (i21 * i25);
                    aq = 0;
                } else {
                    i41 = aq;
                    aq = i25;
                }
                i23 = i - (1621686031 * this.bb);
                i42 = i28 + (i23 * i32);
                i33 += i35 * i23;
                i36 += i23 * i38;
                if ((aq == i || i22 >= i20) && (i != aq || i21 <= i20)) {
                    i43 = i2 - aq;
                    aq -= i;
                    i26 = this.bo[i];
                    i44 = i24;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                        i39 += i20;
                        i40 += i30;
                        i26 += this.af * -1842132067;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i22;
                        aq = i45;
                    }
                    i22 = i39;
                    aq = i43;
                    while (true) {
                        i39 = aq - 1;
                        if (i39 >= 0) {
                            au(this.aj, an, 0, 0, i26, i22 >> 14, i41 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                            i41 += i21;
                            i40 += i30;
                            i26 += -1842132067 * this.af;
                            i42 += i32;
                            i33 += i35;
                            i36 += i38;
                            i22 += i20;
                            aq = i39;
                        } else {
                            return;
                        }
                    }
                }
                i43 = i2 - aq;
                aq -= i;
                i26 = this.bo[i];
                i44 = i24;
                while (true) {
                    i45 = aq - 1;
                    if (i45 < 0) {
                        break;
                    }
                    au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                    i39 += i20;
                    i40 += i30;
                    i26 += -1842132067 * this.af;
                    i42 += i32;
                    i33 += i35;
                    i36 += i38;
                    i44 += i22;
                    aq = i45;
                }
                i22 = i39;
                aq = i43;
                while (true) {
                    i39 = aq - 1;
                    if (i39 >= 0) {
                        au(this.aj, an, 0, 0, i26, i41 >> 14, i22 >> 14, i40, i29, i42, i33, i36, i31, i34, i37, 527303298);
                        i41 += i21;
                        i40 += i30;
                        i26 += -1842132067 * this.af;
                        i42 += i32;
                        i33 += i35;
                        i36 += i38;
                        i22 += i20;
                        aq = i39;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void du(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = by.ae.an(i19, (byte) 16);
        if (an == null) {
            int aq = by.ae.aq(i19, 455289270);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -2051895160), lq.bq(aq, i8, -1986992868), lq.bq(aq, i9, -2069725688), 1833789005);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bp = by.ae.aa(i19, 1123700150);
        this.ab = by.ae.ao(i19, -2135490889);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i3 != i) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aq = (i26 * i23) - (i24 * i25);
        if (aq != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aq;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aq;
            aq = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i26 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i26) - (i27 * i13))) << 14) / ((long) (411538491 * this.bt)));
            int i32 = (int) ((((long) ((i27 * i10) - (i16 * i25))) << 14) / ((long) (this.bt * 411538491)));
            int i33 = ((aq * i13) - (i10 * i23)) << 14;
            int i34 = (int) ((((long) ((i16 * i23) - (i24 * i13))) << 14) / ((long) (411538491 * this.bt)));
            int i35 = (int) ((((long) ((i10 * i24) - (aq * i16))) << 14) / ((long) (411538491 * this.bt)));
            int i36 = ((i25 * i23) - (i26 * aq)) << 14;
            int i37 = (int) ((((long) ((i26 * i24) - (i23 * i27))) << 14) / ((long) (411538491 * this.bt)));
            int i38 = (int) ((((long) ((aq * i27) - (i25 * i24))) << 14) / ((long) (this.bt * 411538491)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 286513717) {
                        if (i3 > this.bd * 286513717) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > 286513717 * this.bd) {
                            i26 = 286513717 * this.bd;
                        } else {
                            i26 = i;
                        }
                        aq = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i26) {
                            i23 = i5 << 14;
                            if (i2 < 0) {
                                i24 = i23 - (i20 * i2);
                                i23 -= i2 * i21;
                                aq -= i30 * i2;
                                i2 = 0;
                            } else {
                                i24 = i23;
                            }
                            i25 = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i39 = i25 - (i3 * i22);
                            } else {
                                i39 = i25;
                            }
                            i25 = i2 - (1621686031 * this.bb);
                            i40 = i28 + (i32 * i25);
                            i33 += i25 * i35;
                            i36 += i25 * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i41 = i26 - i3;
                                i25 = i3 - i2;
                                i26 = this.bo[i2];
                                i42 = aq;
                                i43 = i23;
                                i44 = i24;
                                aq = i25;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i44 += i20;
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i21;
                                    aq = i45;
                                }
                                aq = i41;
                                while (true) {
                                    i41 = aq - 1;
                                    if (i41 >= 0) {
                                        au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                        i39 += i22;
                                        i42 += i30;
                                        i26 += -1842132067 * this.af;
                                        i40 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i44 += i20;
                                        aq = i41;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i41 = i26 - i3;
                            i25 = i3 - i2;
                            i26 = this.bo[i2];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i20;
                                i42 += i30;
                                i26 += -1842132067 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i21;
                                aq = i45;
                            }
                            aq = i41;
                            while (true) {
                                i41 = aq - 1;
                                if (i41 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i20;
                                    aq = i41;
                                } else {
                                    return;
                                }
                            }
                        }
                        i24 = i5 << 14;
                        if (i2 < 0) {
                            i23 = i24 - (i20 * i2);
                            i24 -= i2 * i21;
                            aq -= i2 * i30;
                            i2 = 0;
                        } else {
                            i23 = i24;
                        }
                        i25 = i4 << 14;
                        if (i26 < 0) {
                            i39 = i25 - (i26 * i22);
                            i25 = 0;
                        } else {
                            i39 = i25;
                            i25 = i26;
                        }
                        i26 = i2 - (this.bb * 1621686031);
                        i40 = i28 + (i32 * i26);
                        i33 += i26 * i35;
                        i36 += i26 * i38;
                        if (i20 < i21) {
                            i41 = i3 - i25;
                            i25 -= i2;
                            i26 = this.bo[i2];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i20;
                                aq = i45;
                            }
                            i20 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += this.af * -1842132067;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i3 - i25;
                        i25 -= i2;
                        i26 = this.bo[i2];
                        i42 = aq;
                        i43 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i22;
                                i42 += i30;
                                i26 += -1842132067 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bd * 286513717) {
                    if (i > this.bd * 286513717) {
                        i = this.bd * 286513717;
                    }
                    if (i2 > 286513717 * this.bd) {
                        i26 = 286513717 * this.bd;
                    } else {
                        i26 = i2;
                    }
                    aq = ((i9 << 9) - (i6 * i29)) + i29;
                    int i46;
                    if (i < i26) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i44 = i23 - (i3 * i21);
                            i23 -= i22 * i3;
                            i42 = aq - (i3 * i30);
                            i3 = 0;
                        } else {
                            i42 = aq;
                            i44 = i23;
                        }
                        aq = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = aq - (i20 * i);
                        } else {
                            i39 = aq;
                        }
                        aq = i3 - (this.bb * 1621686031);
                        i40 = i28 + (aq * i32);
                        i33 += aq * i35;
                        i36 += aq * i38;
                        if (i21 < i22) {
                            i41 = i26 - i;
                            aq = i - i3;
                            i26 = this.bo[i3];
                            i43 = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i22;
                                aq = i45;
                            }
                            aq = i41;
                            i46 = i39;
                            i39 = i44;
                            i44 = i46;
                            while (true) {
                                i41 = aq - 1;
                                if (i41 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i44 += i20;
                                    i39 += i21;
                                    aq = i41;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i26 - i;
                        aq = i - i3;
                        i26 = this.bo[i3];
                        i43 = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += -1842132067 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i22;
                            aq = i45;
                        }
                        aq = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aq - 1;
                            if (i41 >= 0) {
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                aq = i39 + i21;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i44 += i20;
                                i39 = aq;
                                aq = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i23 = i6 << 14;
                    if (i3 < 0) {
                        i24 = i23 - (i21 * i3);
                        i23 -= i3 * i22;
                        aq -= i3 * i30;
                        i3 = 0;
                    } else {
                        i24 = i23;
                    }
                    i25 = i5 << 14;
                    if (i26 < 0) {
                        i39 = i25 - (i26 * i20);
                        i25 = 0;
                    } else {
                        i39 = i25;
                        i25 = i26;
                    }
                    i26 = i3 - (1621686031 * this.bb);
                    i40 = i28 + (i32 * i26);
                    i33 += i26 * i35;
                    i36 += i26 * i38;
                    if (i21 < i22) {
                        i41 = i - i25;
                        i25 -= i3;
                        i26 = this.bo[i3];
                        i42 = aq;
                        i44 = i23;
                        i43 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += -1842132067 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i21;
                            aq = i45;
                        }
                        aq = i41;
                        i46 = i39;
                        i39 = i44;
                        i44 = i46;
                        while (true) {
                            i41 = aq - 1;
                            if (i41 >= 0) {
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i39 += i22;
                                i44 += i20;
                                aq = i41;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i - i25;
                    i25 -= i3;
                    i26 = this.bo[i3];
                    i42 = aq;
                    i44 = i23;
                    i43 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i21;
                        aq = i45;
                    }
                    aq = i41;
                    i46 = i39;
                    i39 = i44;
                    i44 = i46;
                    while (true) {
                        i41 = aq - 1;
                        if (i41 >= 0) {
                            au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i39 += i22;
                            i44 += i20;
                            aq = i41;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < 286513717 * this.bd) {
                if (i2 > this.bd * 286513717) {
                    i2 = this.bd * 286513717;
                }
                if (i3 > 286513717 * this.bd) {
                    i3 = 286513717 * this.bd;
                }
                aq = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i3) {
                    i24 = i4 << 14;
                    if (i < 0) {
                        i23 = i24 - (i * i22);
                        i24 -= i20 * i;
                        aq -= i * i30;
                        i = 0;
                    } else {
                        i23 = i24;
                    }
                    i25 = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = i25 - (i21 * i2);
                    } else {
                        i39 = i25;
                    }
                    i25 = i - (1621686031 * this.bb);
                    i40 = i28 + (i32 * i25);
                    i33 += i25 * i35;
                    i36 += i25 * i38;
                    if ((i2 == i || i22 >= i20) && (i != i2 || i22 <= i21)) {
                        i41 = i3 - i2;
                        i25 = i2 - i;
                        i26 = this.bo[i];
                        i42 = aq;
                        i44 = i23;
                        i43 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i21;
                                i42 += i30;
                                i26 += -1842132067 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i3 - i2;
                    i25 = i2 - i;
                    i26 = this.bo[i];
                    i42 = aq;
                    i44 = i23;
                    i43 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i20;
                        aq = i45;
                    }
                    i20 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += -1842132067 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i4 << 14;
                if (i < 0) {
                    i23 = i24 - (i22 * i);
                    i44 = i24 - (i20 * i);
                    i42 = aq - (i * i30);
                    i = 0;
                } else {
                    i42 = aq;
                    i23 = i24;
                    i44 = i24;
                }
                aq = i6 << 14;
                if (i3 < 0) {
                    i3 = 0;
                    i39 = aq - (i21 * i3);
                } else {
                    i39 = aq;
                }
                aq = i - (1621686031 * this.bb);
                i40 = i28 + (aq * i32);
                i33 += i35 * aq;
                i36 += aq * i38;
                if ((i3 == i || i22 >= i20) && (i != i3 || i21 <= i20)) {
                    i41 = i2 - i3;
                    aq = i3 - i;
                    i26 = this.bo[i];
                    i43 = i23;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i20;
                        i42 += i30;
                        i26 += this.af * -1842132067;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i22;
                        aq = i45;
                    }
                    aq = i41;
                    while (true) {
                        i41 = aq - 1;
                        if (i41 >= 0) {
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += -1842132067 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i44 += i20;
                            aq = i41;
                        } else {
                            return;
                        }
                    }
                }
                i41 = i2 - i3;
                aq = i3 - i;
                i26 = this.bo[i];
                i43 = i23;
                while (true) {
                    i45 = aq - 1;
                    if (i45 < 0) {
                        break;
                    }
                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                    i44 += i20;
                    i42 += i30;
                    i26 += -1842132067 * this.af;
                    i40 += i32;
                    i33 += i35;
                    i36 += i38;
                    i43 += i22;
                    aq = i45;
                }
                aq = i41;
                while (true) {
                    i41 = aq - 1;
                    if (i41 >= 0) {
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i39 += i21;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i44 += i20;
                        aq = i41;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void dz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int[] an = by.ae.an(i19, (byte) 16);
        if (an == null) {
            int aq = by.ae.aq(i19, -1916860814);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i7, -1950193646), lq.bq(aq, i8, -1995204255), lq.bq(aq, i9, -2066609203), 1317869637);
            return;
        }
        int i20;
        int i21;
        int i22;
        this.bp = by.ae.aa(i19, 967212447);
        this.ab = by.ae.ao(i19, -2135490889);
        int i23 = i5 - i4;
        int i24 = i2 - i;
        int i25 = i6 - i4;
        int i26 = i3 - i;
        int i27 = i8 - i7;
        int i28 = i9 - i7;
        if (i2 != i) {
            i20 = ((i5 - i4) << 14) / (i2 - i);
        } else {
            i20 = 0;
        }
        if (i3 != i2) {
            i21 = ((i6 - i5) << 14) / (i3 - i2);
        } else {
            i21 = 0;
        }
        if (i3 != i) {
            i22 = ((i4 - i6) << 14) / (i - i3);
        } else {
            i22 = 0;
        }
        aq = (i26 * i23) - (i24 * i25);
        if (aq != 0) {
            int i29 = (((i26 * i27) - (i24 * i28)) << 9) / aq;
            int i30 = (((i23 * i28) - (i27 * i25)) << 9) / aq;
            aq = i10 - i11;
            i23 = i13 - i14;
            i24 = i16 - i17;
            i25 = i12 - i10;
            i26 = i15 - i13;
            i27 = i18 - i16;
            i28 = ((i25 * i13) - (i26 * i10)) << 14;
            int i31 = (int) ((((long) ((i16 * i26) - (i27 * i13))) << 14) / ((long) (803239405 * this.bt)));
            int i32 = (int) ((((long) ((i27 * i10) - (i16 * i25))) << 14) / ((long) (this.bt * 411538491)));
            int i33 = ((aq * i13) - (i10 * i23)) << 14;
            int i34 = (int) ((((long) ((i16 * i23) - (i24 * i13))) << 14) / ((long) (-637997493 * this.bt)));
            int i35 = (int) ((((long) ((i10 * i24) - (aq * i16))) << 14) / ((long) (1663644596 * this.bt)));
            int i36 = ((i25 * i23) - (i26 * aq)) << 14;
            int i37 = (int) ((((long) ((i26 * i24) - (i23 * i27))) << 14) / ((long) (1430624248 * this.bt)));
            int i38 = (int) ((((long) ((aq * i27) - (i25 * i24))) << 14) / ((long) (this.bt * 411538491)));
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            if (i > i2 || i > i3) {
                if (i2 <= i3) {
                    if (i2 < this.bd * 596287189) {
                        if (i3 > this.bd * 286513717) {
                            i3 = this.bd * 286513717;
                        }
                        if (i > -2122573619 * this.bd) {
                            i23 = this.bd * 1417539873;
                        } else {
                            i23 = i;
                        }
                        aq = ((i8 << 9) - (i5 * i29)) + i29;
                        if (i3 < i23) {
                            i24 = i5 << 14;
                            if (i2 < 0) {
                                i25 = i24 - (i20 * i2);
                                i24 -= i2 * i21;
                                aq -= i30 * i2;
                                i2 = 0;
                            } else {
                                i25 = i24;
                            }
                            i26 = i6 << 14;
                            if (i3 < 0) {
                                i3 = 0;
                                i39 = i26 - (i3 * i22);
                            } else {
                                i39 = i26;
                            }
                            i26 = i2 - (1621686031 * this.bb);
                            i40 = i28 + (i32 * i26);
                            i33 += i26 * i35;
                            i36 += i26 * i38;
                            if ((i2 == i3 || i20 >= i21) && (i3 != i2 || i20 <= i22)) {
                                i41 = i23 - i3;
                                i23 = i3 - i2;
                                i26 = this.bo[i2];
                                i42 = aq;
                                i43 = i24;
                                i44 = i25;
                                aq = i23;
                                while (true) {
                                    i45 = aq - 1;
                                    if (i45 < 0) {
                                        break;
                                    }
                                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i44 += i20;
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i43 += i21;
                                    aq = i45;
                                }
                                i21 = i44;
                                aq = i41;
                                while (true) {
                                    i44 = aq - 1;
                                    if (i44 >= 0) {
                                        au(this.aj, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                        i39 += i22;
                                        i42 += i30;
                                        i26 += -1842132067 * this.af;
                                        i40 += i32;
                                        i33 += i35;
                                        i36 += i38;
                                        i21 += i20;
                                        aq = i44;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i41 = i23 - i3;
                            i23 = i3 - i2;
                            i26 = this.bo[i2];
                            i42 = aq;
                            i43 = i24;
                            i44 = i25;
                            aq = i23;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i20;
                                i42 += i30;
                                i26 += -1848587766 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i21;
                                aq = i45;
                            }
                            i21 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i21 += i20;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i25 = i5 << 14;
                        if (i2 < 0) {
                            i24 = i25 - (i20 * i2);
                            i44 = i25 - (i2 * i21);
                            i42 = aq - (i2 * i30);
                            i2 = 0;
                        } else {
                            i42 = aq;
                            i24 = i25;
                            i44 = i25;
                        }
                        aq = i4 << 14;
                        if (i23 < 0) {
                            i39 = aq - (i23 * i22);
                            aq = 0;
                        } else {
                            i39 = aq;
                            aq = i23;
                        }
                        i23 = i2 - (this.bb * 392342579);
                        i40 = i28 + (i32 * i23);
                        i33 += i23 * i35;
                        i36 += i23 * i38;
                        if (i20 < i21) {
                            i41 = i3 - aq;
                            aq -= i2;
                            i26 = this.bo[i2];
                            i43 = i24;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * 429460102;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i20;
                                aq = i45;
                            }
                            i20 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i22;
                                    i42 += i30;
                                    i26 += this.af * 864638583;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i20 += i21;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i3 - aq;
                        aq -= i2;
                        i26 = this.bo[i2];
                        i43 = i24;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i22;
                                i42 += i30;
                                i26 += -1842132067 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i21;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (i3 < this.bd * 286513717) {
                    if (i > this.bd * -2479255) {
                        i = this.bd * 286513717;
                    }
                    if (i2 > -889337306 * this.bd) {
                        i2 = 253599222 * this.bd;
                    }
                    aq = ((i9 << 9) - (i6 * i29)) + i29;
                    if (i < i2) {
                        i23 = i6 << 14;
                        if (i3 < 0) {
                            i24 = i23 - (i3 * i21);
                            i23 -= i22 * i3;
                            aq -= i3 * i30;
                            i3 = 0;
                        } else {
                            i24 = i23;
                        }
                        i25 = i4 << 14;
                        if (i < 0) {
                            i = 0;
                            i39 = i25 - (i20 * i);
                        } else {
                            i39 = i25;
                        }
                        i25 = i3 - (this.bb * 1621686031);
                        i40 = i28 + (i25 * i32);
                        i33 += i25 * i35;
                        i36 += i25 * i38;
                        if (i21 < i22) {
                            i41 = i2 - i;
                            i25 = i - i3;
                            i26 = this.bo[i3];
                            i42 = aq;
                            i43 = i23;
                            i44 = i24;
                            aq = i25;
                            while (true) {
                                i45 = aq - 1;
                                if (i45 < 0) {
                                    break;
                                }
                                au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i44 += i21;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i43 += i22;
                                aq = i45;
                            }
                            i22 = i44;
                            aq = i41;
                            while (true) {
                                i44 = aq - 1;
                                if (i44 >= 0) {
                                    au(this.aj, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                    i39 += i20;
                                    i42 += i30;
                                    i26 += -1842132067 * this.af;
                                    i40 += i32;
                                    i33 += i35;
                                    i36 += i38;
                                    i22 += i21;
                                    aq = i44;
                                } else {
                                    return;
                                }
                            }
                        }
                        i41 = i2 - i;
                        i25 = i - i3;
                        i26 = this.bo[i3];
                        i42 = aq;
                        i43 = i23;
                        i44 = i24;
                        aq = i25;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i21;
                            i42 += i30;
                            i26 += 1583600424 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i22;
                            aq = i45;
                        }
                        i22 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i20;
                                i42 += i30;
                                i26 += this.af * -1531287981;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i22 += i21;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i44 = i6 << 14;
                    if (i3 < 0) {
                        i23 = i44 - (i21 * i3);
                        i44 -= i3 * i22;
                        i42 = aq - (i3 * i30);
                        i3 = 0;
                    } else {
                        i42 = aq;
                        i23 = i44;
                    }
                    aq = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = aq - (i2 * i20);
                    } else {
                        i39 = aq;
                    }
                    aq = i3 - (120364026 * this.bb);
                    i40 = i28 + (i32 * aq);
                    i33 += aq * i35;
                    i36 += aq * i38;
                    if (i21 < i22) {
                        i41 = i - i2;
                        aq = i2 - i3;
                        i26 = this.bo[i3];
                        i43 = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += -629745173 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i21;
                            aq = i45;
                        }
                        i21 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i21 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i20;
                                i42 += i30;
                                i26 += this.af * -1842132067;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i21 += i22;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i - i2;
                    aq = i2 - i3;
                    i26 = this.bo[i3];
                    i43 = i23;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += 911598246 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i21;
                        aq = i45;
                    }
                    i21 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i21 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i20;
                            i42 += i30;
                            i26 += this.af * 1400973472;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i21 += i22;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i < 286513717 * this.bd) {
                if (i2 > this.bd * -2017825452) {
                    i2 = this.bd * -1663767658;
                }
                if (i3 > -795438045 * this.bd) {
                    i3 = 286513717 * this.bd;
                }
                aq = ((i7 << 9) - (i29 * i4)) + i29;
                if (i2 < i3) {
                    i23 = i4 << 14;
                    if (i < 0) {
                        i44 = i23 - (i * i22);
                        i23 -= i20 * i;
                        i42 = aq - (i * i30);
                        i = 0;
                    } else {
                        i42 = aq;
                        i44 = i23;
                    }
                    aq = i5 << 14;
                    if (i2 < 0) {
                        i2 = 0;
                        i39 = aq - (i21 * i2);
                    } else {
                        i39 = aq;
                    }
                    aq = i - (418166506 * this.bb);
                    i40 = i28 + (i32 * aq);
                    i33 += aq * i35;
                    i36 += aq * i38;
                    if ((i2 == i || i22 >= i20) && (i != i2 || i22 <= i21)) {
                        i41 = i3 - i2;
                        aq = i2 - i;
                        i26 = this.bo[i];
                        i43 = i23;
                        while (true) {
                            i45 = aq - 1;
                            if (i45 < 0) {
                                break;
                            }
                            au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i44 += i22;
                            i42 += i30;
                            i26 += this.af * -1842132067;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i43 += i20;
                            aq = i45;
                        }
                        i20 = i44;
                        aq = i41;
                        while (true) {
                            i44 = aq - 1;
                            if (i44 >= 0) {
                                au(this.aj, an, 0, 0, i26, i39 >> 14, i20 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                                i39 += i21;
                                i42 += i30;
                                i26 += -1842132067 * this.af;
                                i40 += i32;
                                i33 += i35;
                                i36 += i38;
                                i20 += i22;
                                aq = i44;
                            } else {
                                return;
                            }
                        }
                    }
                    i41 = i3 - i2;
                    aq = i2 - i;
                    i26 = this.bo[i];
                    i43 = i23;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i22;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i20;
                        aq = i45;
                    }
                    i20 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i20 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += -1842132067 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i20 += i22;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
                i24 = i4 << 14;
                if (i < 0) {
                    i23 = i24 - (i22 * i);
                    i24 -= i20 * i;
                    aq -= i * i30;
                    i = 0;
                } else {
                    i23 = i24;
                }
                i25 = i6 << 14;
                if (i3 < 0) {
                    i3 = 0;
                    i39 = i25 - (i21 * i3);
                } else {
                    i39 = i25;
                }
                i25 = i - (1621686031 * this.bb);
                i40 = i28 + (i25 * i32);
                i33 += i35 * i25;
                i36 += i25 * i38;
                if ((i3 == i || i22 >= i20) && (i != i3 || i21 <= i20)) {
                    i41 = i2 - i3;
                    i25 = i3 - i;
                    i26 = this.bo[i];
                    i42 = aq;
                    i43 = i23;
                    i44 = i24;
                    aq = i25;
                    while (true) {
                        i45 = aq - 1;
                        if (i45 < 0) {
                            break;
                        }
                        au(this.aj, an, 0, 0, i26, i44 >> 14, i43 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i44 += i20;
                        i42 += i30;
                        i26 += this.af * -1842132067;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i43 += i22;
                        aq = i45;
                    }
                    i22 = i44;
                    aq = i41;
                    while (true) {
                        i44 = aq - 1;
                        if (i44 >= 0) {
                            au(this.aj, an, 0, 0, i26, i22 >> 14, i39 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                            i39 += i21;
                            i42 += i30;
                            i26 += -944219808 * this.af;
                            i40 += i32;
                            i33 += i35;
                            i36 += i38;
                            i22 += i20;
                            aq = i44;
                        } else {
                            return;
                        }
                    }
                }
                i41 = i2 - i3;
                i25 = i3 - i;
                i26 = this.bo[i];
                i42 = aq;
                i43 = i23;
                i44 = i24;
                aq = i25;
                while (true) {
                    i45 = aq - 1;
                    if (i45 < 0) {
                        break;
                    }
                    au(this.aj, an, 0, 0, i26, i43 >> 14, i44 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                    i44 += i20;
                    i42 += i30;
                    i26 += -1842132067 * this.af;
                    i40 += i32;
                    i33 += i35;
                    i36 += i38;
                    i43 += i22;
                    aq = i45;
                }
                i22 = i44;
                aq = i41;
                while (true) {
                    i44 = aq - 1;
                    if (i44 >= 0) {
                        au(this.aj, an, 0, 0, i26, i39 >> 14, i22 >> 14, i42, i29, i40, i33, i36, i31, i34, i37, 527303298);
                        i39 += i21;
                        i42 += i30;
                        i26 += -1842132067 * this.af;
                        i40 += i32;
                        i33 += i35;
                        i36 += i38;
                        i22 += i20;
                        aq = i44;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    final void au(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            if (this.ad) {
                if (i5 > this.bu * -1431886479) {
                    i5 = this.bu * -1431886479;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
            }
            if (i4 < i5) {
                int i15 = i3 + i4;
                int i16 = i6 + (i7 * i4);
                int i17 = i5 - i4;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                if (this.bp) {
                    i18 = i4 - (266497203 * this.br);
                    i19 = i8 + (i18 * i11);
                    i20 = i9 + (i18 * i12);
                    i21 = i10 + (i18 * i13);
                    i18 = i21 >> 12;
                    if (i18 != 0) {
                        i22 = i19 / i18;
                        i18 = i20 / i18;
                    } else {
                        i22 = 0;
                        i18 = 0;
                    }
                    i19 += i11 * i17;
                    i23 = (i17 * i12) + i20;
                    i21 = ((i13 * i17) + i21) >> 12;
                    if (i21 != 0) {
                        i20 = i19 / i21;
                        i19 = i23 / i21;
                        i21 = i20;
                        i20 = i19;
                    } else {
                        i21 = 0;
                        i20 = 0;
                    }
                    i19 = (i22 << 20) + i18;
                    i21 = (((i21 - i22) / i17) << 20) + ((i20 - i18) / i17);
                    i22 = i17 >> 3;
                    i17 = i7 << 3;
                    i18 = i16 >> 8;
                    if (this.ab) {
                        if (i22 > 0) {
                            do {
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i23 = i15 + 1;
                                iArr[i15] = ((((i20 & 65280) * i18) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                                i15 = i23 + 1;
                                iArr[i23] = ((((i20 & 65280) * i18) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i23 = i15 + 1;
                                iArr[i15] = ((((i20 & 16711935) * i18) & -16711936) + (((65280 & i20) * i18) & 16711680)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i15 = i23 + 1;
                                iArr[i23] = ((((i20 & 65280) * i18) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i23 = i15 + 1;
                                iArr[i15] = ((((i20 & 16711935) * i18) & -16711936) + (((65280 & i20) * i18) & 16711680)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i15 = i23 + 1;
                                iArr[i23] = ((((i20 & 16711935) * i18) & -16711936) + (((65280 & i20) * i18) & 16711680)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i23 = i15 + 1;
                                iArr[i15] = ((((i20 & 65280) * i18) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                                i19 += i21;
                                i20 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                                i15 = i23 + 1;
                                iArr[i23] = (((i18 * (i20 & 65280)) & 16711680) + (((16711935 & i20) * i18) & -16711936)) >> 8;
                                i19 += i21;
                                i16 += i17;
                                i18 = i16 >> 8;
                                i22--;
                            } while (i22 > 0);
                        }
                        i22 = (i5 - i4) & 7;
                        if (i22 > 0) {
                            i20 = i19;
                            while (true) {
                                i16 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                                i19 = i15 + 1;
                                iArr[i15] = ((((i16 & 65280) * i18) & 16711680) + (((16711935 & i16) * i18) & -16711936)) >> 8;
                                i20 += i21;
                                i22--;
                                if (i22 > 0) {
                                    i15 = i19;
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    if (i22 > 0) {
                        i20 = i22;
                        while (true) {
                            i22 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i22 != 0) {
                                iArr[i15] = ((((i22 & 16711935) * i18) & -16711936) + (((65280 & i22) * i18) & 16711680)) >> 8;
                            }
                            i22 = i15 + 1;
                            i19 += i21;
                            i15 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 >>> 26) + (i19 & 4032)];
                            if (i15 != 0) {
                                iArr[i22] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i15 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                            if (i15 != 0) {
                                iArr[i22] = (((i18 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i22++;
                            i19 += i21;
                            i16 += i17;
                            i18 = i16 >> 8;
                            i20--;
                            if (i20 <= 0) {
                                break;
                            }
                            i15 = i22;
                        }
                    } else {
                        i22 = i15;
                    }
                    i20 = (i5 - i4) & 7;
                    if (i20 > 0) {
                        int i24 = i20;
                        i20 = i19;
                        i19 = i22;
                        i22 = i24;
                        do {
                            i15 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                            if (i15 != 0) {
                                iArr[i19] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            }
                            i19++;
                            i20 += i21;
                            i22--;
                        } while (i22 > 0);
                        return;
                    }
                    return;
                }
                i18 = i4 - (266497203 * this.br);
                i19 = i8 + (i18 * i11);
                i20 = i9 + (i12 * i18);
                i21 = i10 + (i18 * i13);
                i18 = i21 >> 14;
                if (i18 != 0) {
                    i22 = i19 / i18;
                    i18 = i20 / i18;
                } else {
                    i22 = 0;
                    i18 = 0;
                }
                i19 += i11 * i17;
                i23 = (i17 * i12) + i20;
                i21 = ((i13 * i17) + i21) >> 14;
                if (i21 != 0) {
                    i20 = i19 / i21;
                    i19 = i23 / i21;
                } else {
                    i20 = 0;
                    i19 = 0;
                }
                i21 = (i22 << 18) + i18;
                i23 = (((i20 - i22) / i17) << 18) + ((i19 - i18) / i17);
                i22 = i17 >> 3;
                i17 = i7 << 3;
                i18 = i16 >> 8;
                if (this.ab) {
                    if (i22 > 0) {
                        i19 = i22;
                        i20 = i16;
                        while (true) {
                            i22 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                            i16 = i15 + 1;
                            iArr[i15] = ((((i22 & 65280) * i18) & 16711680) + (((16711935 & i22) * i18) & -16711936)) >> 8;
                            i22 = i21 + i23;
                            i15 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i21 = i16 + 1;
                            iArr[i16] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                            i22 += i23;
                            i15 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i16 = i21 + 1;
                            iArr[i21] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i15 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i21 = i16 + 1;
                            iArr[i16] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i15 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i16 = i21 + 1;
                            iArr[i21] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i15 = iArr2[(i22 & 16256) + (i22 >>> 25)];
                            i21 = i16 + 1;
                            iArr[i16] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                            i22 += i23;
                            i15 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i16 = i21 + 1;
                            iArr[i21] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i21 = iArr2[(i22 >>> 25) + (i22 & 16256)];
                            i15 = i16 + 1;
                            iArr[i16] = (((i18 * (i21 & 16711935)) & -16711936) + (((65280 & i21) * i18) & 16711680)) >> 8;
                            i22 += i23;
                            i20 += i17;
                            i18 = i20 >> 8;
                            i19--;
                            if (i19 <= 0) {
                                break;
                            }
                            i21 = i22;
                        }
                    } else {
                        i22 = i21;
                    }
                    i19 = (i5 - i4) & 7;
                    if (i19 > 0) {
                        i20 = i22;
                        i22 = i19;
                        while (true) {
                            i21 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                            i19 = i15 + 1;
                            iArr[i15] = ((((i21 & 65280) * i18) & 16711680) + (((16711935 & i21) * i18) & -16711936)) >> 8;
                            i20 += i23;
                            i22--;
                            if (i22 > 0) {
                                i15 = i19;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i22 > 0) {
                    do {
                        i19 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        if (i19 != 0) {
                            iArr[i15] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                        }
                        i19 = i15 + 1;
                        i20 = i21 + i23;
                        i15 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 65280) * i18) & 16711680) + (((16711935 & i15) * i18) & -16711936)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 & 16256) + (i20 >>> 25)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        if (i15 != 0) {
                            iArr[i19] = ((((i15 & 16711935) * i18) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i19++;
                        i20 += i23;
                        i15 = iArr2[(i20 >>> 25) + (i20 & 16256)];
                        if (i15 != 0) {
                            iArr[i19] = (((i18 * (i15 & 16711935)) & -16711936) + (((65280 & i15) * i18) & 16711680)) >> 8;
                        }
                        i15 = i19 + 1;
                        i21 = i20 + i23;
                        i16 += i17;
                        i18 = i16 >> 8;
                        i22--;
                    } while (i22 > 0);
                }
                i22 = (i5 - i4) & 7;
                if (i22 > 0) {
                    do {
                        i19 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        if (i19 != 0) {
                            iArr[i15] = ((((i19 & 16711935) * i18) & -16711936) + (((65280 & i19) * i18) & 16711680)) >> 8;
                        }
                        i15++;
                        i21 += i23;
                        i22--;
                    } while (i22 > 0);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.au(" + ')');
        }
    }

    final void df(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.ad) {
            if (i5 > this.bu * -1431886479) {
                i5 = this.bu * -1431886479;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i7 * i4);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            if (this.bp) {
                i17 = i4 - (266497203 * this.br);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i17 * i12);
                i20 = i10 + (i17 * i13);
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 += i11 * i16;
                i22 = (i16 * i12) + i19;
                i20 = ((i13 * i16) + i20) >> 12;
                if (i20 != 0) {
                    i19 = i18 / i20;
                    i18 = i22 / i20;
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i19 = (((i19 - i21) / i16) << 20) + ((i18 - i17) / i16);
                i21 = i16 >> 3;
                i16 = i7 << 3;
                i17 = i15 >> 8;
                if (this.ab) {
                    if (i21 > 0) {
                        do {
                            i18 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                            i22 = i14 + 1;
                            iArr[i14] = ((((i18 & 65280) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                            i14 = i20 + i19;
                            i18 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                            i20 = i22 + 1;
                            iArr[i22] = ((((i18 & 65280) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                            i14 += i19;
                            i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                            i22 = i20 + 1;
                            iArr[i20] = ((((i18 & 16711935) * i17) & -16711936) + (((65280 & i18) * i17) & 16711680)) >> 8;
                            i14 += i19;
                            i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                            i20 = i22 + 1;
                            iArr[i22] = ((((i18 & 65280) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                            i14 += i19;
                            i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                            i22 = i20 + 1;
                            iArr[i20] = ((((i18 & 16711935) * i17) & -16711936) + (((65280 & i18) * i17) & 16711680)) >> 8;
                            i14 += i19;
                            i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                            i20 = i22 + 1;
                            iArr[i22] = ((((i18 & 16711935) * i17) & -16711936) + (((65280 & i18) * i17) & 16711680)) >> 8;
                            i14 += i19;
                            i18 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                            i22 = i20 + 1;
                            iArr[i20] = ((((i18 & 65280) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                            i18 = i14 + i19;
                            i20 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i14 = i22 + 1;
                            iArr[i22] = (((i17 * (i20 & 65280)) & 16711680) + (((16711935 & i20) * i17) & -16711936)) >> 8;
                            i20 = i18 + i19;
                            i15 += i16;
                            i17 = i15 >> 8;
                            i21--;
                        } while (i21 > 0);
                    }
                    i21 = (i5 - i4) & 7;
                    if (i21 > 0) {
                        while (true) {
                            i15 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                            i18 = i14 + 1;
                            iArr[i14] = ((((i15 & 65280) * i17) & 16711680) + (((16711935 & i15) * i17) & -16711936)) >> 8;
                            i20 += i19;
                            i21--;
                            if (i21 > 0) {
                                i14 = i18;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i21 > 0) {
                    i18 = i21;
                    while (true) {
                        i21 = iArr2[(i20 >>> 26) + (i20 & 4032)];
                        if (i21 != 0) {
                            iArr[i14] = ((((i21 & 16711935) * i17) & -16711936) + (((65280 & i21) * i17) & 16711680)) >> 8;
                        }
                        i21 = i14 + 1;
                        i14 = i20 + i19;
                        i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i17) & -16711936) + (((65280 & i20) * i17) & 16711680)) >> 8;
                        }
                        i21++;
                        i14 += i19;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 65280) * i17) & 16711680) + (((16711935 & i20) * i17) & -16711936)) >> 8;
                        }
                        i21++;
                        i14 += i19;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i17) & -16711936) + (((65280 & i20) * i17) & 16711680)) >> 8;
                        }
                        i21++;
                        i14 += i19;
                        i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i17) & -16711936) + (((65280 & i20) * i17) & 16711680)) >> 8;
                        }
                        i21++;
                        i14 += i19;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 16711935) * i17) & -16711936) + (((65280 & i20) * i17) & 16711680)) >> 8;
                        }
                        i21++;
                        i14 += i19;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i21] = ((((i20 & 65280) * i17) & 16711680) + (((16711935 & i20) * i17) & -16711936)) >> 8;
                        }
                        i21++;
                        i20 = i14 + i19;
                        i14 = iArr2[(i20 & 4032) + (i20 >>> 26)];
                        if (i14 != 0) {
                            iArr[i21] = (((i17 * (i14 & 16711935)) & -16711936) + (((65280 & i14) * i17) & 16711680)) >> 8;
                        }
                        i14 = i21 + 1;
                        i21 = i20 + i19;
                        i15 += i16;
                        i17 = i15 >> 8;
                        i18--;
                        if (i18 <= 0) {
                            break;
                        }
                        i20 = i21;
                    }
                } else {
                    i21 = i20;
                }
                i18 = (i5 - i4) & 7;
                if (i18 > 0) {
                    i23 = i18;
                    i18 = i21;
                    i21 = i23;
                    do {
                        i15 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                        if (i15 != 0) {
                            iArr[i14] = ((((i15 & 16711935) * i17) & -16711936) + (((65280 & i15) * i17) & 16711680)) >> 8;
                        }
                        i14++;
                        i18 += i19;
                        i21--;
                    } while (i21 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (266497203 * this.br);
            i18 = i8 + (i17 * i11);
            i22 = i9 + (i12 * i17);
            int i24 = i10 + (i17 * i13);
            i17 = i24 >> 14;
            if (i17 != 0) {
                i19 = i22 / i17;
                i20 = i18 / i17;
            } else {
                i19 = 0;
                i20 = 0;
            }
            i17 = (i11 * i16) + i18;
            i18 = i22 + (i16 * i12);
            i22 = ((i13 * i16) + i24) >> 14;
            if (i22 != 0) {
                i21 = i17 / i22;
                i17 = i18 / i22;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 = (i20 << 18) + i19;
            i19 = (((i21 - i20) / i16) << 18) + ((i17 - i19) / i16);
            i21 = i16 >> 3;
            i20 = i7 << 3;
            i17 = i15 >> 8;
            if (this.ab) {
                if (i21 > 0) {
                    i23 = i21;
                    i21 = i18;
                    i18 = i23;
                    while (true) {
                        i16 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i22 = i14 + 1;
                        iArr[i14] = ((((i16 & 65280) * i17) & 16711680) + (((16711935 & i16) * i17) & -16711936)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i16 = i22 + 1;
                        iArr[i22] = ((((i14 & 65280) * i17) & 16711680) + (((16711935 & i14) * i17) & -16711936)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i22 = i16 + 1;
                        iArr[i16] = ((((i14 & 16711935) * i17) & -16711936) + (((65280 & i14) * i17) & 16711680)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i16 = i22 + 1;
                        iArr[i22] = ((((i14 & 16711935) * i17) & -16711936) + (((65280 & i14) * i17) & 16711680)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i22 = i16 + 1;
                        iArr[i16] = ((((i14 & 16711935) * i17) & -16711936) + (((65280 & i14) * i17) & 16711680)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i16 = i22 + 1;
                        iArr[i22] = ((((i14 & 65280) * i17) & 16711680) + (((16711935 & i14) * i17) & -16711936)) >> 8;
                        i21 += i19;
                        i14 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i22 = i16 + 1;
                        iArr[i16] = ((((i14 & 16711935) * i17) & -16711936) + (((65280 & i14) * i17) & 16711680)) >> 8;
                        i14 = i21 + i19;
                        i16 = iArr2[(i14 >>> 25) + (i14 & 16256)];
                        i21 = i22 + 1;
                        iArr[i22] = (((i17 * (i16 & 16711935)) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                        i14 += i19;
                        i15 += i20;
                        i17 = i15 >> 8;
                        i18--;
                        if (i18 <= 0) {
                            break;
                        }
                        i23 = i21;
                        i21 = i14;
                        i14 = i23;
                    }
                } else {
                    i21 = i14;
                    i14 = i18;
                }
                i18 = (i5 - i4) & 7;
                if (i18 > 0) {
                    i15 = i14;
                    i14 = i21;
                    i21 = i18;
                    while (true) {
                        i20 = iArr2[(i15 & 16256) + (i15 >>> 25)];
                        i18 = i14 + 1;
                        iArr[i14] = ((((i20 & 65280) * i17) & 16711680) + (((16711935 & i20) * i17) & -16711936)) >> 8;
                        i14 = i15 + i19;
                        i21--;
                        if (i21 > 0) {
                            i15 = i14;
                            i14 = i18;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i21 > 0) {
                do {
                    i16 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 16711935) * i17) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 65280) * i17) & 16711680) + (((16711935 & i16) * i17) & -16711936)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 16711935) * i17) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 65280) * i17) & 16711680) + (((16711935 & i16) * i17) & -16711936)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 65280) * i17) & 16711680) + (((16711935 & i16) * i17) & -16711936)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 16711935) * i17) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i16 != 0) {
                        iArr[i14] = ((((i16 & 16711935) * i17) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i16 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                    if (i16 != 0) {
                        iArr[i14] = (((i17 * (i16 & 16711935)) & -16711936) + (((65280 & i16) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i15 += i20;
                    i17 = i15 >> 8;
                    i21--;
                } while (i21 > 0);
            }
            i21 = (i5 - i4) & 7;
            if (i21 > 0) {
                do {
                    i15 = iArr2[(i18 & 16256) + (i18 >>> 25)];
                    if (i15 != 0) {
                        iArr[i14] = ((((i15 & 16711935) * i17) & -16711936) + (((65280 & i15) * i17) & 16711680)) >> 8;
                    }
                    i14++;
                    i18 += i19;
                    i21--;
                } while (i21 > 0);
            }
        }
    }

    final void dg(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        if (this.ad) {
            if (i5 > this.bu * 227694021) {
                i5 = this.bu * -1431886479;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int i14 = i3 + i4;
            int i15 = i6 + (i7 * i4);
            int i16 = i5 - i4;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            if (this.bp) {
                i17 = i4 - (-1295937464 * this.br);
                i18 = i8 + (i17 * i11);
                i19 = i9 + (i17 * i12);
                i20 = i10 + (i17 * i13);
                i17 = i20 >> 12;
                if (i17 != 0) {
                    i21 = i18 / i17;
                    i17 = i19 / i17;
                } else {
                    i21 = 0;
                    i17 = 0;
                }
                i18 += i11 * i16;
                i22 = (i16 * i12) + i19;
                i20 = ((i13 * i16) + i20) >> 12;
                if (i20 != 0) {
                    i19 = i18 / i20;
                    i18 = i22 / i20;
                } else {
                    i19 = 0;
                    i18 = 0;
                }
                i20 = (i21 << 20) + i17;
                i22 = (((i19 - i21) / i16) << 20) + ((i18 - i17) / i16);
                i17 = i16 >> 3;
                i19 = i7 << 3;
                i21 = i15 >> 8;
                if (this.ab) {
                    int i23;
                    if (i17 > 0) {
                        i18 = i20;
                        do {
                            i20 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i16 = i14 + 1;
                            iArr[i14] = ((((i20 & 65280) * i21) & 16711680) + (((557416484 & i20) * i21) & 740091973)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 & 4032) + (i18 >>> 26)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 65280) * i21) & 228290090) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 284384533) * i21) & -16711936) + (((65280 & i14) * i21) & 16711680)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (534349895 & i18)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 65280) * i21) & 16711680) + (((-1746071274 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 2087926048) * i21) & -523688515) + (((-826680570 & i14) * i21) & -2144188760)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i20 = i16 + 1;
                            iArr[i16] = ((((i14 & 16711935) * i21) & -16711936) + (((2099311386 & i14) * i21) & 16711680)) >> 8;
                            i18 += i22;
                            i14 = iArr2[(i18 >>> 26) + (i18 & 4032)];
                            i16 = i20 + 1;
                            iArr[i20] = ((((i14 & 65280) * i21) & -675562198) + (((16711935 & i14) * i21) & -16711936)) >> 8;
                            i18 += i22;
                            i20 = iArr2[(i18 >>> 26) + (435553712 & i18)];
                            i14 = i16 + 1;
                            iArr[i16] = (((i21 * (i20 & -1400440143)) & 16711680) + (((16711935 & i20) * i21) & -1131755872)) >> 8;
                            i18 += i22;
                            i15 += i19;
                            i21 = i15 >> 8;
                            i17--;
                        } while (i17 > 0);
                        i23 = i21;
                        i21 = i14;
                        i14 = i23;
                    } else {
                        i18 = i20;
                        i23 = i14;
                        i14 = i21;
                        i21 = i23;
                    }
                    i17 = (i5 - i4) & 7;
                    if (i17 > 0) {
                        i19 = i18;
                        while (true) {
                            i20 = iArr2[(i19 & 4032) + (i19 >>> 26)];
                            i18 = i21 + 1;
                            iArr[i21] = ((((i20 & 65280) * i14) & 1142059810) + (((16711935 & i20) * i14) & 1203921774)) >> 8;
                            i21 = i19 + i22;
                            i17--;
                            if (i17 > 0) {
                                i19 = i21;
                                i21 = i18;
                            } else {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i17 > 0) {
                    do {
                        i18 = iArr2[(i20 >>> 26) + (-798647596 & i20)];
                        if (i18 != 0) {
                            iArr[i14] = ((((i18 & 16711935) * i21) & -16711936) + (((-419985838 & i18) * i21) & 16711680)) >> 8;
                        }
                        i18 = i14 + 1;
                        i14 = i20 + i22;
                        i20 = iArr2[(i14 & 4032) + (i14 >>> 26)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & 16711935) * i21) & -16711936) + (((-1348653932 & i20) * i21) & 1445933029)) >> 8;
                        }
                        i18++;
                        i14 += i22;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & 65280) * i21) & 1475414428) + (((16711935 & i20) * i21) & 740841565)) >> 8;
                        }
                        i18++;
                        i14 += i22;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & -796172771) * i21) & -16711936) + (((65280 & i20) * i21) & 1299371693)) >> 8;
                        }
                        i18++;
                        i14 += i22;
                        i20 = iArr2[(-1061851127 & i14) + (i14 >>> 26)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & 16711935) * i21) & -16711936) + (((1692993986 & i20) * i21) & 16711680)) >> 8;
                        }
                        i18++;
                        i14 += i22;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & 16711935) * i21) & -16711936) + (((65280 & i20) * i21) & -1107262707)) >> 8;
                        }
                        i18++;
                        i14 += i22;
                        i20 = iArr2[(i14 >>> 26) + (i14 & 4032)];
                        if (i20 != 0) {
                            iArr[i18] = ((((i20 & 1800995617) * i21) & 1309017302) + (((-611141744 & i20) * i21) & -16711936)) >> 8;
                        }
                        i18++;
                        i20 = i14 + i22;
                        i14 = iArr2[(-215045740 & i20) + (i20 >>> 26)];
                        if (i14 != 0) {
                            iArr[i18] = (((i21 * (i14 & 16711935)) & -16711936) + (((65280 & i14) * i21) & -1692155275)) >> 8;
                        }
                        i14 = i18 + 1;
                        i20 += i22;
                        i15 += i19;
                        i21 = i15 >> 8;
                        i17--;
                    } while (i17 > 0);
                }
                i19 = i21;
                i18 = i20;
                i21 = i14;
                i17 = (i5 - i4) & 7;
                if (i17 > 0) {
                    do {
                        i14 = iArr2[(-1215749288 & i18) + (i18 >>> 26)];
                        if (i14 != 0) {
                            iArr[i21] = ((((i14 & -669096527) * i19) & -16711936) + (((65280 & i14) * i19) & 1642476462)) >> 8;
                        }
                        i21++;
                        i18 += i22;
                        i17--;
                    } while (i17 > 0);
                    return;
                }
                return;
            }
            i17 = i4 - (266497203 * this.br);
            i18 = i8 + (i17 * i11);
            i19 = i9 + (i12 * i17);
            i20 = i10 + (i17 * i13);
            i17 = i20 >> 14;
            if (i17 != 0) {
                i21 = i18 / i17;
                i17 = i19 / i17;
            } else {
                i21 = 0;
                i17 = 0;
            }
            i18 += i11 * i16;
            i22 = (i16 * i12) + i19;
            i20 = ((i13 * i16) + i20) >> 14;
            if (i20 != 0) {
                i19 = i18 / i20;
                i18 = i22 / i20;
            } else {
                i19 = 0;
                i18 = 0;
            }
            i20 = (i21 << 18) + i17;
            i22 = (((i19 - i21) / i16) << 18) + ((i18 - i17) / i16);
            i21 = i16 >> 3;
            i16 = i7 << 3;
            i17 = i15 >> 8;
            if (this.ab) {
                if (i21 > 0) {
                    i19 = i21;
                    i21 = i14;
                    i14 = i15;
                    while (true) {
                        i18 = iArr2[(i20 >>> 25) + (-873660767 & i20)];
                        i15 = i21 + 1;
                        iArr[i21] = ((((i18 & 1999660493) * i17) & 1069830752) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                        i21 = i20 + i22;
                        i18 = iArr2[(-22592993 & i21) + (i21 >>> 25)];
                        i20 = i15 + 1;
                        iArr[i15] = ((((i18 & -635010658) * i17) & 16711680) + (((882972043 & i18) * i17) & -1571421640)) >> 8;
                        i21 += i22;
                        i18 = iArr2[(i21 >>> 25) + (833379100 & i21)];
                        i15 = i20 + 1;
                        iArr[i20] = ((((i18 & 16711935) * i17) & 595801333) + (((65280 & i18) * i17) & -839988478)) >> 8;
                        i21 += i22;
                        i18 = iArr2[(i21 & 16256) + (i21 >>> 25)];
                        i20 = i15 + 1;
                        iArr[i15] = ((((i18 & 16711935) * i17) & -16711936) + (((1006120439 & i18) * i17) & 16711680)) >> 8;
                        i21 += i22;
                        i18 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i15 = i20 + 1;
                        iArr[i20] = ((((i18 & 16711935) * i17) & 425514654) + (((65280 & i18) * i17) & -1912811606)) >> 8;
                        i21 += i22;
                        i18 = iArr2[(1189517878 & i21) + (i21 >>> 25)];
                        i20 = i15 + 1;
                        iArr[i15] = ((((i18 & -111394466) * i17) & 16711680) + (((16711935 & i18) * i17) & -16711936)) >> 8;
                        i21 += i22;
                        i18 = iArr2[(i21 >>> 25) + (i21 & 16256)];
                        i15 = i20 + 1;
                        iArr[i20] = ((((i18 & 16711935) * i17) & -16711936) + (((65280 & i18) * i17) & 1713753535)) >> 8;
                        i18 = i21 + i22;
                        i20 = iArr2[(i18 >>> 25) + (i18 & 16256)];
                        i21 = i15 + 1;
                        iArr[i15] = (((i17 * (i20 & 1580755642)) & 404702583) + (((65280 & i20) * i17) & 16711680)) >> 8;
                        i18 += i22;
                        i14 += i16;
                        i17 = i14 >> 8;
                        i19--;
                        if (i19 <= 0) {
                            break;
                        }
                        i20 = i18;
                    }
                } else {
                    i21 = i14;
                    i18 = i20;
                }
                i19 = (i5 - i4) & 7;
                if (i19 > 0) {
                    i14 = i18;
                    i18 = i21;
                    i21 = i19;
                    while (true) {
                        i20 = iArr2[(i14 & 16256) + (i14 >>> 25)];
                        i19 = i18 + 1;
                        iArr[i18] = ((((i20 & 65280) * i17) & 16711680) + (((-1776474617 & i20) * i17) & -1790335666)) >> 8;
                        i18 = i14 + i22;
                        i21--;
                        if (i21 > 0) {
                            i14 = i18;
                            i18 = i19;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            if (i21 > 0) {
                do {
                    i18 = iArr2[(1691280903 & i20) + (i20 >>> 25)];
                    if (i18 != 0) {
                        iArr[i14] = ((((i18 & 1507929092) * i17) & -16711936) + (((65280 & i18) * i17) & 16711680)) >> 8;
                    }
                    i18 = i14 + 1;
                    i19 = i20 + i22;
                    i14 = iArr2[(-1703121484 & i19) + (i19 >>> 25)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & 65280) * i17) & 1880561976) + (((16711935 & i14) * i17) & -16711936)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(i19 >>> 25) + (-493822416 & i19)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & 310157947) * i17) & -16711936) + (((1060545019 & i14) * i17) & 1063788826)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & -216490316) * i17) & 16711680) + (((-1476302599 & i14) * i17) & 2141448005)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & -1331829060) * i17) & 16711680) + (((16711935 & i14) * i17) & 337142891)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(-1954581484 & i19) + (i19 >>> 25)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & 16711935) * i17) & -16711936) + (((65280 & i14) * i17) & 3537937)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                    if (i14 != 0) {
                        iArr[i18] = ((((i14 & 16711935) * i17) & -16711936) + (((2142906811 & i14) * i17) & -1015400750)) >> 8;
                    }
                    i18++;
                    i19 += i22;
                    i14 = iArr2[(i19 >>> 25) + (i19 & 16256)];
                    if (i14 != 0) {
                        iArr[i18] = (((i17 * (i14 & 1297008744)) & -550998169) + (((65280 & i14) * i17) & -958205198)) >> 8;
                    }
                    i14 = i18 + 1;
                    i20 = i19 + i22;
                    i15 += i16;
                    i17 = i15 >> 8;
                    i21--;
                } while (i21 > 0);
                i19 = i17;
                i21 = i14;
                i18 = i20;
            } else {
                i19 = i17;
                i21 = i14;
                i18 = i20;
            }
            i17 = (i5 - i4) & 7;
            if (i17 > 0) {
                do {
                    i14 = iArr2[(-624382121 & i18) + (i18 >>> 25)];
                    if (i14 != 0) {
                        iArr[i21] = ((((i14 & 1749473331) * i19) & -16711936) + (((588206093 & i14) * i19) & 16711680)) >> 8;
                    }
                    i21++;
                    i18 += i22;
                    i17--;
                } while (i17 > 0);
            }
        }
    }

    static final void ch(byte b) {
        try {
            dj.hs.bp(client.ac.qc.aj((byte) -108), 1532694047);
            client.ha = 0;
            int i = (fz.du * -357869149) + ((1948391561 * cx.hb.br) >> 7);
            int i2 = (fm.dn * 1195683827) + ((cx.hb.bb * -1461980333) >> 7);
            if (i >= 3053 && i <= 3156 && i2 >= 3056 && i2 <= 3136) {
                client.ha = 1299849915;
            }
            if (i >= 3072 && i <= 3118 && i2 >= 9492 && i2 <= 9535) {
                client.ha = 1299849915;
            }
            if (387961459 * client.ha == 1 && i >= 3139 && i <= 3199 && i2 >= 3008 && i2 <= 3062) {
                client.ha = 0;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cq.ch(" + ')');
        }
    }
}
