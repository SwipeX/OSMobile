package defpackage;

import com.jagex.oldscape.osrenderer.aj;

public class cb extends ce {
    public static final int cr = 83;
    static em[] en;
    final bj ac;
    final ba aj;

    public cb(ba baVar) {
        try {
            this.aj = baVar;
            this.ac = new bj(this.aj);
        } catch (Throwable e) {
            throw ei.ac(e, "cb.<init>(" + ')');
        }
    }

    public bl aj(byte b) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "cb.aj(" + ')');
        }
    }

    public bl ao() {
        return this.aj;
    }

    public cr aa() {
        return this.ac;
    }

    public cr ac(int i) {
        try {
            return this.ac;
        } catch (Throwable e) {
            throw ei.ac(e, "cb.ac(" + ')');
        }
    }

    public void ae(int i) {
        if (dh.an((byte) 8)) {
            aj.ae(gx.aq(-396095552) - (this.aj.br * 266497203), fn.ao(-1781667913) - (-577631000 * this.aj.bb), -2018636896);
        }
        this.ac.aq(i, 1802490711);
    }

    public void ai(int i, int i2) {
        try {
            if (dh.an((byte) 8)) {
                aj.ae(gx.aq(-1494468467) - (this.aj.br * 266497203), fn.ao(-1781667913) - (1621686031 * this.aj.bb), -998722970);
            }
            this.ac.aq(i, 1564278601);
        } catch (Throwable e) {
            throw ei.ac(e, "cb.ai(" + ')');
        }
    }

    public void am(int i) {
        if (dh.an((byte) 8)) {
            aj.ae(gx.aq(-369377067) - (this.aj.br * 266497203), fn.ao(-1781667913) - (1621686031 * this.aj.bb), -36919311);
        }
        this.ac.aq(i, 1592090821);
    }

    public void aw(int i) {
        if (dh.an((byte) 8)) {
            aj.ae(gx.aq(-17647169) - (this.aj.br * 266497203), fn.ao(-1781667913) - (502115013 * this.aj.bb), -1013793079);
        }
        this.ac.aq(i, 1849978756);
    }

    void ak(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ar;
            int i9 = (i7 << 7) - cc.ab;
            int i10 = i8 + cj.ak;
            int i11 = i9 + cj.ak;
            int i12 = ccVar.ao[i][i6][i7] - cc.ad;
            int i13 = ccVar.ao[i][i6 + 1][i7] - cc.ad;
            int i14 = ccVar.ao[i][i6 + 1][i7 + 1] - cc.ad;
            int i15 = ccVar.ao[i][i6][i7 + 1] - cc.ad;
            int i16 = ((i5 * i8) + (i4 * i9)) >> 16;
            int i17 = ((i9 * i5) - (i8 * i4)) >> 16;
            int i18 = ((i12 * i3) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= 50) {
                int i20 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                int i21 = ((i3 * i13) - (i2 * i9)) >> 16;
                int i22 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i22 >= 50) {
                    int i23 = ((i11 * i4) + (i10 * i5)) >> 16;
                    i9 = ((i11 * i5) - (i10 * i4)) >> 16;
                    int i24 = ((i14 * i3) - (i2 * i9)) >> 16;
                    int i25 = ((i9 * i3) + (i14 * i2)) >> 16;
                    if (i25 >= -465417020) {
                        int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        int i27 = ((i15 * i3) - (i2 * i8)) >> 16;
                        int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                        if (i28 >= 50) {
                            ba baVar;
                            int i29 = (2034569496 * this.aj.br) + (((411538491 * this.aj.bt) * i16) / i19);
                            int i30 = (-1817492166 * this.aj.bb) + (((-2130837752 * this.aj.bt) * i18) / i19);
                            i15 = (((this.aj.bt * 411538491) * i20) / i22) + (1127188500 * this.aj.br);
                            i12 = (((411538491 * this.aj.bt) * i21) / i22) + (25580679 * this.aj.bb);
                            i13 = (((this.aj.bt * 411538491) * i23) / i25) + (-1532462923 * this.aj.br);
                            i10 = (1621686031 * this.aj.bb) + (((226659942 * this.aj.bt) * i24) / i25);
                            i14 = (this.aj.br * 266497203) + (((this.aj.bt * 411538491) * i26) / i28);
                            i11 = (((411538491 * this.aj.bt) * i27) / i28) + (this.aj.bb * 1241081960);
                            this.aj.bh = 0;
                            if (((i12 - i11) * (i13 - i14)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.aj.ad = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.aj.bu * 1097498873 || i14 > -2027645482 * this.aj.bu || i15 > -1431886479 * this.aj.bu) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-1 == bqVar.ao * -2087010715) {
                                    if (12345678 != bqVar.an * -771413967) {
                                        this.aj.aq(i24, i27, i21, i23, i26, i20, i25, i28, i22, bqVar.an * 529425375, -630368163 * bqVar.aq, -1012303603 * bqVar.ac, -1658959364 * this.aj.bt, 1196974929);
                                    }
                                } else if (cc.aj) {
                                    baVar = this.aj;
                                    i8 = by.ae.aq(2112173634 * bqVar.ao, -1923292179);
                                    this.aj.ao(i10, i11, i12, i13, i14, i15, lq.bq(i8, -771413967 * bqVar.an, -2011479191), lq.bq(i8, bqVar.aq * 925896078, -1911519316), lq.bq(i8, bqVar.ac * -1012303603, -2123790463), (byte) -31);
                                } else {
                                    this.aj.at(i24, i27, i21, i23, i26, i20, i25, i28, i22, bqVar.an * -771413967, bqVar.aq * 839633672, -1012303603 * bqVar.ac, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, bqVar.ao * -2087010715, (byte) 1);
                                }
                            }
                            if (((i29 - i15) * (i11 - i12)) - ((i30 - i12) * (i14 - i15)) > 0) {
                                this.aj.ad = false;
                                if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.aj.bu * 915609561 || i15 > 1271475007 * this.aj.bu || i14 > -1613949297 * this.aj.bu) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i30, i12, i11, i29, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-2087010715 * bqVar.ao == -1) {
                                    if (12345678 != bqVar.aj * -218660475) {
                                        this.aj.aq(i18, i21, i27, i16, i20, i26, i19, i22, i28, -218660475 * bqVar.aj, bqVar.ac * -1012303603, bqVar.aq * 2135016699, this.aj.bt * -381791341, 713294829);
                                    }
                                } else if (cc.aj) {
                                    baVar = this.aj;
                                    i8 = by.ae.aq(bqVar.ao * -938373732, -280352625);
                                    this.aj.ao(i30, i12, i11, i29, i15, i14, lq.bq(i8, -253390954 * bqVar.aj, -2071550023), lq.bq(i8, -1012303603 * bqVar.ac, -1987026276), lq.bq(i8, -1846867090 * bqVar.aq, -1985158468), (byte) -64);
                                } else {
                                    this.aj.at(i18, i21, i27, i16, i20, i26, i19, i22, i28, bqVar.aj * -90881909, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, bqVar.ao * -2087010715, (byte) 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void an(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (an) {
                int i9 = (i6 << 7) - cc.ar;
                int i10 = (i7 << 7) - cc.ab;
                int i11 = i9 + cj.ak;
                int i12 = i10 + cj.ak;
                int i13 = ccVar.ao[i][i6][i7] - cc.ad;
                int i14 = ccVar.ao[i][i6 + 1][i7] - cc.ad;
                int i15 = ccVar.ao[i][i6 + 1][i7 + 1] - cc.ad;
                int i16 = ccVar.ao[i][i6][i7 + 1] - cc.ad;
                int i17 = ((i5 * i9) + (i4 * i10)) >> 16;
                int i18 = ((i10 * i5) - (i9 * i4)) >> 16;
                int i19 = ((i13 * i3) - (i2 * i18)) >> 16;
                int i20 = ((i13 * i2) + (i18 * i3)) >> 16;
                if (i20 >= 50) {
                    int i21 = ((i10 * i4) + (i5 * i11)) >> 16;
                    i10 = ((i10 * i5) - (i4 * i11)) >> 16;
                    int i22 = ((i3 * i14) - (i2 * i10)) >> 16;
                    int i23 = ((i10 * i3) + (i14 * i2)) >> 16;
                    if (i23 >= 50) {
                        int i24 = ((i12 * i4) + (i11 * i5)) >> 16;
                        i10 = ((i12 * i5) - (i11 * i4)) >> 16;
                        int i25 = ((i15 * i3) - (i2 * i10)) >> 16;
                        int i26 = ((i10 * i3) + (i15 * i2)) >> 16;
                        if (i26 >= 50) {
                            int i27 = ((i4 * i12) + (i5 * i9)) >> 16;
                            i9 = ((i12 * i5) - (i9 * i4)) >> 16;
                            int i28 = ((i16 * i3) - (i2 * i9)) >> 16;
                            int i29 = ((i9 * i3) + (i16 * i2)) >> 16;
                            if (i29 >= 50) {
                                ba baVar;
                                int i30 = (266497203 * this.aj.br) + (((411538491 * this.aj.bt) * i17) / i20);
                                int i31 = (1621686031 * this.aj.bb) + (((411538491 * this.aj.bt) * i19) / i20);
                                i16 = (((this.aj.bt * 411538491) * i21) / i23) + (266497203 * this.aj.br);
                                i13 = (((411538491 * this.aj.bt) * i22) / i23) + (1621686031 * this.aj.bb);
                                i14 = (((this.aj.bt * 411538491) * i24) / i26) + (266497203 * this.aj.br);
                                i11 = (1621686031 * this.aj.bb) + (((411538491 * this.aj.bt) * i25) / i26);
                                i15 = (this.aj.br * 266497203) + (((this.aj.bt * 411538491) * i27) / i29);
                                i12 = (((411538491 * this.aj.bt) * i28) / i29) + (this.aj.bb * 1621686031);
                                this.aj.bh = 0;
                                if (((i13 - i12) * (i14 - i15)) - ((i11 - i12) * (i16 - i15)) > 0) {
                                    this.aj.ad = false;
                                    if (i14 < 0 || i15 < 0 || i16 < 0 || i14 > this.aj.bu * -1431886479 || i15 > -1431886479 * this.aj.bu || i16 > -1431886479 * this.aj.bu) {
                                        this.aj.ad = true;
                                    }
                                    if (cc.bb && cc.bv(cc.bd, cc.by, i11, i12, i13, i14, i15, i16)) {
                                        cc.bx = i6;
                                        cc.bi = i7;
                                    }
                                    if (-1 == bqVar.ao * -2087010715) {
                                        if (12345678 != bqVar.an * -771413967) {
                                            this.aj.aq(i25, i28, i22, i24, i27, i21, i26, i29, i23, bqVar.an * -771413967, 2135016699 * bqVar.aq, -1012303603 * bqVar.ac, 411538491 * this.aj.bt, -1232597475);
                                        }
                                    } else if (cc.aj) {
                                        baVar = this.aj;
                                        i9 = by.ae.aq(-2087010715 * bqVar.ao, -1898321181);
                                        this.aj.ao(i11, i12, i13, i14, i15, i16, lq.bq(i9, -771413967 * bqVar.an, -1925867728), lq.bq(i9, bqVar.aq * 2135016699, -1952562009), lq.bq(i9, bqVar.ac * -1012303603, -2089364022), (byte) 60);
                                    } else {
                                        this.aj.at(i25, i28, i22, i24, i27, i21, i26, i29, i23, bqVar.an * -771413967, bqVar.aq * 2135016699, -1012303603 * bqVar.ac, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, bqVar.ao * -2087010715, (byte) 1);
                                    }
                                }
                                if (((i30 - i16) * (i12 - i13)) - ((i31 - i13) * (i15 - i16)) > 0) {
                                    this.aj.ad = false;
                                    if (i30 < 0 || i16 < 0 || i15 < 0 || i30 > this.aj.bu * -1431886479 || i16 > -1431886479 * this.aj.bu || i15 > -1431886479 * this.aj.bu) {
                                        this.aj.ad = true;
                                    }
                                    if (cc.bb && cc.bv(cc.bd, cc.by, i31, i13, i12, i30, i16, i15)) {
                                        cc.bx = i6;
                                        cc.bi = i7;
                                    }
                                    if (-2087010715 * bqVar.ao == -1) {
                                        if (12345678 != bqVar.aj * -218660475) {
                                            this.aj.aq(i19, i22, i28, i17, i21, i27, i20, i23, i29, -218660475 * bqVar.aj, bqVar.ac * -1012303603, bqVar.aq * 2135016699, this.aj.bt * 411538491, -1456290140);
                                        }
                                    } else if (cc.aj) {
                                        baVar = this.aj;
                                        i9 = by.ae.aq(bqVar.ao * -2087010715, -603843261);
                                        this.aj.ao(i31, i13, i12, i30, i16, i15, lq.bq(i9, -218660475 * bqVar.aj, -2013344271), lq.bq(i9, -1012303603 * bqVar.ac, -2020555554), lq.bq(i9, 2135016699 * bqVar.aq, -1969894462), (byte) -26);
                                    } else {
                                        this.aj.at(i19, i22, i28, i17, i21, i27, i20, i23, i29, bqVar.aj * -218660475, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, bqVar.ao * -2087010715, (byte) 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cb.an(" + ')');
        }
    }

    void ap(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (an) {
            int i8 = (i6 << 7) - cc.ar;
            int i9 = (i7 << 7) - cc.ab;
            int i10 = i8 + cj.ak;
            int i11 = i9 + cj.ak;
            int i12 = ccVar.ao[i][i6][i7] - cc.ad;
            int i13 = ccVar.ao[i][i6 + 1][i7] - cc.ad;
            int i14 = ccVar.ao[i][i6 + 1][i7 + 1] - cc.ad;
            int i15 = ccVar.ao[i][i6][i7 + 1] - cc.ad;
            int i16 = ((i5 * i8) + (i4 * i9)) >> 16;
            int i17 = ((i9 * i5) - (i8 * i4)) >> 16;
            int i18 = ((i12 * i3) - (i2 * i17)) >> 16;
            int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
            if (i19 >= 50) {
                int i20 = ((i9 * i4) + (i5 * i10)) >> 16;
                i9 = ((i9 * i5) - (i4 * i10)) >> 16;
                int i21 = ((i3 * i13) - (i2 * i9)) >> 16;
                int i22 = ((i9 * i3) + (i13 * i2)) >> 16;
                if (i22 >= 50) {
                    int i23 = ((i11 * i4) + (i10 * i5)) >> 16;
                    i9 = ((i11 * i5) - (i10 * i4)) >> 16;
                    int i24 = ((i14 * i3) - (i2 * i9)) >> 16;
                    int i25 = ((i9 * i3) + (i14 * i2)) >> 16;
                    if (i25 >= 50) {
                        int i26 = ((i4 * i11) + (i5 * i8)) >> 16;
                        i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                        int i27 = ((i15 * i3) - (i2 * i8)) >> 16;
                        int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                        if (i28 >= 50) {
                            ba baVar;
                            int i29 = (266497203 * this.aj.br) + (((411538491 * this.aj.bt) * i16) / i19);
                            int i30 = (1621686031 * this.aj.bb) + (((411538491 * this.aj.bt) * i18) / i19);
                            i15 = (((this.aj.bt * 411538491) * i20) / i22) + (266497203 * this.aj.br);
                            i12 = (((411538491 * this.aj.bt) * i21) / i22) + (1621686031 * this.aj.bb);
                            i13 = (((this.aj.bt * 411538491) * i23) / i25) + (266497203 * this.aj.br);
                            i10 = (1621686031 * this.aj.bb) + (((411538491 * this.aj.bt) * i24) / i25);
                            i14 = (this.aj.br * 266497203) + (((this.aj.bt * 411538491) * i26) / i28);
                            i11 = (((411538491 * this.aj.bt) * i27) / i28) + (this.aj.bb * 1621686031);
                            this.aj.bh = 0;
                            if (((i12 - i11) * (i13 - i14)) - ((i10 - i11) * (i15 - i14)) > 0) {
                                this.aj.ad = false;
                                if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.aj.bu * -1431886479 || i14 > -1431886479 * this.aj.bu || i15 > -1431886479 * this.aj.bu) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i10, i11, i12, i13, i14, i15)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-1 == bqVar.ao * -2087010715) {
                                    if (12345678 != bqVar.an * -771413967) {
                                        this.aj.aq(i24, i27, i21, i23, i26, i20, i25, i28, i22, bqVar.an * -771413967, 2135016699 * bqVar.aq, -1012303603 * bqVar.ac, 411538491 * this.aj.bt, 232042054);
                                    }
                                } else if (cc.aj) {
                                    baVar = this.aj;
                                    i8 = by.ae.aq(-2087010715 * bqVar.ao, -1973233859);
                                    this.aj.ao(i10, i11, i12, i13, i14, i15, lq.bq(i8, -771413967 * bqVar.an, -2066912515), lq.bq(i8, bqVar.aq * 2135016699, -2117594587), lq.bq(i8, bqVar.ac * -1012303603, -2137795460), (byte) 10);
                                } else {
                                    this.aj.at(i24, i27, i21, i23, i26, i20, i25, i28, i22, bqVar.an * -771413967, bqVar.aq * 2135016699, -1012303603 * bqVar.ac, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, bqVar.ao * -2087010715, (byte) 1);
                                }
                            }
                            if (((i29 - i15) * (i11 - i12)) - ((i30 - i12) * (i14 - i15)) > 0) {
                                this.aj.ad = false;
                                if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.aj.bu * -1431886479 || i15 > -1431886479 * this.aj.bu || i14 > -1431886479 * this.aj.bu) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i30, i12, i11, i29, i15, i14)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-2087010715 * bqVar.ao == -1) {
                                    if (12345678 != bqVar.aj * -218660475) {
                                        this.aj.aq(i18, i21, i27, i16, i20, i26, i19, i22, i28, -218660475 * bqVar.aj, bqVar.ac * -1012303603, bqVar.aq * 2135016699, this.aj.bt * 411538491, 432333473);
                                    }
                                } else if (cc.aj) {
                                    baVar = this.aj;
                                    i8 = by.ae.aq(bqVar.ao * -2087010715, -1125334300);
                                    this.aj.ao(i30, i12, i11, i29, i15, i14, lq.bq(i8, -218660475 * bqVar.aj, -1961848932), lq.bq(i8, -1012303603 * bqVar.ac, -1953800727), lq.bq(i8, 2135016699 * bqVar.aq, -1918721311), (byte) -52);
                                } else {
                                    this.aj.at(i18, i21, i27, i16, i20, i26, i19, i22, i28, bqVar.aj * -218660475, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, bqVar.ao * -2087010715, (byte) 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ap(int i, int i2) {
        try {
            mk.ao = 58044005;
            mk.aa = null;
            mk.ak = 254573345;
            mk.ap = 479239551;
            mt.at = 0;
            ho.ai = false;
            bp.ah = -1677562473 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "cb.ap(" + ')');
        }
    }

    void ah(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (an) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = bwVar.aj.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = bwVar.aj[i11] - cc.ar;
                i8 = bwVar.ac[i11] - cc.ad;
                i9 = bwVar.an[i11] - cc.ab;
                i10 = ((i7 * i4) + (i9 * i3)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i2 * i8) - (i7 * i)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bw.ax[i11] = i10;
                    bw.af[i11] = i9;
                    bw.au[i11] = i7;
                    bw.al[i11] = ((i10 * (this.aj.bt * 411538491)) / i7) + (this.aj.br * 266497203);
                    bw.az[i11] = ((i9 * (this.aj.bt * 411538491)) / i7) + (1621686031 * this.aj.bb);
                    i11++;
                } else {
                    return;
                }
            }
            this.aj.bh = 0;
            int length2 = bwVar.ak.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = bwVar.ak[i12];
                int i14 = bwVar.ap[i12];
                int i15 = bwVar.at[i12];
                i10 = bw.al[i13];
                int i16 = bw.al[i14];
                int i17 = bw.al[i15];
                i7 = bw.az[i13];
                i8 = bw.az[i14];
                i9 = bw.az[i15];
                if (cc.bb && cc.bv(cc.bd, cc.by, i7, i8, i9, i10, i16, i17)) {
                    cc.bx = i5;
                    cc.bi = i6;
                }
                i9 = bw.ax[i13];
                i10 = bw.ax[i14];
                i16 = bw.ax[i15];
                length = bw.af[i13];
                i7 = bw.af[i14];
                i8 = bw.af[i15];
                i17 = bw.au[i13];
                int i18 = bw.au[i14];
                int i19 = bw.au[i15];
                if (bwVar.ah != null && -1 != bwVar.ah[i12]) {
                    this.aj.at(length, i7, i8, i9, i10, i16, i17, i18, i19, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], ((float) (bwVar.aj[i13] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i14] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i15] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.an[i13] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i14] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i15] - (i6 * cj.ak))) / 128.0f, bwVar.ah[i12], (byte) 1);
                } else if (12345678 != bwVar.aq[i12]) {
                    this.aj.aq(length, i7, i8, i9, i10, i16, i17, i18, i19, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], 411538491 * this.aj.bt, -1704731259);
                }
                i12++;
            }
        }
    }

    void aq(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (an) {
                int i8;
                int i9;
                int i10;
                int i11;
                int length = bwVar.aj.length;
                int i12 = 0;
                while (i12 < length) {
                    i8 = bwVar.aj[i12] - cc.ar;
                    i9 = bwVar.ac[i12] - cc.ad;
                    i10 = bwVar.an[i12] - cc.ab;
                    i11 = ((i8 * i4) + (i10 * i3)) >> 16;
                    i8 = ((i10 * i4) - (i8 * i3)) >> 16;
                    i10 = ((i2 * i9) - (i8 * i)) >> 16;
                    i8 = ((i8 * i2) + (i9 * i)) >> 16;
                    if (i8 >= 50) {
                        bw.ax[i12] = i11;
                        bw.af[i12] = i10;
                        bw.au[i12] = i8;
                        bw.al[i12] = ((i11 * (this.aj.bt * 411538491)) / i8) + (this.aj.br * 266497203);
                        bw.az[i12] = ((i10 * (this.aj.bt * 411538491)) / i8) + (1621686031 * this.aj.bb);
                        i12++;
                    } else {
                        return;
                    }
                }
                this.aj.bh = 0;
                int length2 = bwVar.ak.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = bwVar.ak[i13];
                    int i15 = bwVar.ap[i13];
                    int i16 = bwVar.at[i13];
                    i11 = bw.al[i14];
                    int i17 = bw.al[i15];
                    int i18 = bw.al[i16];
                    i8 = bw.az[i14];
                    i9 = bw.az[i15];
                    i10 = bw.az[i16];
                    if (cc.bb && cc.bv(cc.bd, cc.by, i8, i9, i10, i11, i17, i18)) {
                        cc.bx = i5;
                        cc.bi = i6;
                    }
                    i10 = bw.ax[i14];
                    i11 = bw.ax[i15];
                    i17 = bw.ax[i16];
                    length = bw.af[i14];
                    i8 = bw.af[i15];
                    i9 = bw.af[i16];
                    i18 = bw.au[i14];
                    int i19 = bw.au[i15];
                    int i20 = bw.au[i16];
                    if (bwVar.ah != null && -1 != bwVar.ah[i13]) {
                        this.aj.at(length, i8, i9, i10, i11, i17, i18, i19, i20, bwVar.aq[i13], bwVar.ao[i13], bwVar.aa[i13], ((float) (bwVar.aj[i14] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i15] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i16] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.an[i14] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i15] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i16] - (i6 * cj.ak))) / 128.0f, bwVar.ah[i13], (byte) 1);
                    } else if (12345678 != bwVar.aq[i13]) {
                        this.aj.aq(length, i8, i9, i10, i11, i17, i18, i19, i20, bwVar.aq[i13], bwVar.ao[i13], bwVar.aa[i13], 411538491 * this.aj.bt, 976991771);
                    }
                    i13++;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cb.aq(" + ')');
        }
    }

    void at(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (an) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = bwVar.aj.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = bwVar.aj[i11] - cc.ar;
                i8 = bwVar.ac[i11] - cc.ad;
                i9 = bwVar.an[i11] - cc.ab;
                i10 = ((i7 * i4) + (i9 * i3)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i2 * i8) - (i7 * i)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bw.ax[i11] = i10;
                    bw.af[i11] = i9;
                    bw.au[i11] = i7;
                    bw.al[i11] = ((i10 * (this.aj.bt * 411538491)) / i7) + (this.aj.br * 266497203);
                    bw.az[i11] = ((i9 * (this.aj.bt * 411538491)) / i7) + (1621686031 * this.aj.bb);
                    i11++;
                } else {
                    return;
                }
            }
            this.aj.bh = 0;
            int length2 = bwVar.ak.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = bwVar.ak[i12];
                int i14 = bwVar.ap[i12];
                int i15 = bwVar.at[i12];
                i10 = bw.al[i13];
                int i16 = bw.al[i14];
                int i17 = bw.al[i15];
                i7 = bw.az[i13];
                i8 = bw.az[i14];
                i9 = bw.az[i15];
                if (cc.bb && cc.bv(cc.bd, cc.by, i7, i8, i9, i10, i16, i17)) {
                    cc.bx = i5;
                    cc.bi = i6;
                }
                i9 = bw.ax[i13];
                i10 = bw.ax[i14];
                i16 = bw.ax[i15];
                length = bw.af[i13];
                i7 = bw.af[i14];
                i8 = bw.af[i15];
                i17 = bw.au[i13];
                int i18 = bw.au[i14];
                int i19 = bw.au[i15];
                if (bwVar.ah != null && -1 != bwVar.ah[i12]) {
                    this.aj.at(length, i7, i8, i9, i10, i16, i17, i18, i19, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], ((float) (bwVar.aj[i13] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i14] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.aj[i15] - (i5 * cj.ak))) / 128.0f, ((float) (bwVar.an[i13] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i14] - (i6 * cj.ak))) / 128.0f, ((float) (bwVar.an[i15] - (i6 * cj.ak))) / 128.0f, bwVar.ah[i12], (byte) 1);
                } else if (12345678 != bwVar.aq[i12]) {
                    this.aj.aq(length, i7, i8, i9, i10, i16, i17, i18, i19, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], 411538491 * this.aj.bt, 532402074);
                }
                i12++;
            }
        }
    }

    static void bb(int i) {
        try {
            client.ac.ti(ga.ap((byte) 66), (byte) -51);
        } catch (Throwable e) {
            throw ei.ac(e, "cb.bb(" + ')');
        }
    }
}
