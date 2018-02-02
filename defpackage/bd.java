package defpackage;

import java.io.File;
import java.io.RandomAccessFile;

public class bd extends ce {
    static final int aq = 425;
    final bx ac;
    final cq aj;

    public bd(cq cqVar) {
        try {
            this.aj = cqVar;
            this.ac = new bx(this.aj);
        } catch (Throwable e) {
            throw ei.ac(e, "bd.<init>(" + ')');
        }
    }

    public bl aj(byte b) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "bd.aj(" + ')');
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
            throw ei.ac(e, "bd.ac(" + ')');
        }
    }

    static File ac(String str, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            if (lu.aj) {
                File file = (File) lu.an.get(str);
                if (file == null) {
                    file = new File(lu.ac, str);
                    try {
                        if (new File(file.getParent()).exists()) {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                            try {
                                int read = randomAccessFile2.read();
                                randomAccessFile2.seek(0);
                                randomAccessFile2.write(read);
                                randomAccessFile2.seek(0);
                                randomAccessFile2.close();
                                lu.an.put(str, file);
                            } catch (Exception e) {
                                randomAccessFile = randomAccessFile2;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Exception e2) {
                                    }
                                }
                                throw new RuntimeException();
                            }
                        }
                        throw new RuntimeException("");
                    } catch (Exception e3) {
                        randomAccessFile = null;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw new RuntimeException();
                    }
                }
                return file;
            }
            throw new RuntimeException("");
        } catch (Throwable e4) {
            throw ei.ac(e4, "bd.ac(" + ')');
        }
    }

    void ak(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - cc.ar;
        int i9 = (i7 << 7) - cc.ab;
        int i10 = i8 + cj.ak;
        int i11 = -285134139 + i9;
        int i12 = ccVar.ao[i][i6][i7] - cc.ad;
        int i13 = ccVar.ao[i][i6 + 1][i7] - cc.ad;
        int i14 = ccVar.ao[i][i6 + 1][i7 + 1] - cc.ad;
        int i15 = ccVar.ao[i][i6][i7 + 1] - cc.ad;
        int i16 = ((i5 * i8) + (i4 * i9)) >> 16;
        int i17 = ((i9 * i5) - (i8 * i4)) >> 16;
        int i18 = ((i12 * i3) - (i2 * i17)) >> 16;
        int i19 = ((i12 * i2) + (i17 * i3)) >> 16;
        if (i19 >= 50) {
            int i20 = ((i5 * i10) + (i9 * i4)) >> 16;
            i9 = ((i9 * i5) - (i4 * i10)) >> 16;
            int i21 = ((i13 * i3) - (i9 * i2)) >> 16;
            int i22 = ((i9 * i3) + (i13 * i2)) >> 16;
            if (i22 >= 50) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i14 * i2)) >> 16;
                if (i25 >= 50) {
                    int i26 = ((i4 * i11) + (i8 * i5)) >> 16;
                    i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i2 * i8)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= 50) {
                        cq cqVar;
                        int i29 = (((411538491 * this.aj.bt) * i16) / i19) + (-802278892 * this.aj.br);
                        int i30 = (((this.aj.bt * -39072643) * i18) / i19) + (this.aj.bb * 1621686031);
                        i15 = (((-1471825093 * this.aj.bt) * i20) / i22) + (266497203 * this.aj.br);
                        i12 = (((420472367 * this.aj.bt) * i21) / i22) + (1876394942 * this.aj.bb);
                        i13 = (((-309305906 * this.aj.bt) * i23) / i25) + (266497203 * this.aj.br);
                        i10 = (((926043986 * this.aj.bt) * i24) / i25) + (1341069912 * this.aj.bb);
                        i14 = (((411538491 * this.aj.bt) * i26) / i28) + (this.aj.br * 2093431759);
                        i11 = (((-889839772 * this.aj.bt) * i27) / i28) + (this.aj.bb * 1054107653);
                        this.aj.bh = 0;
                        if (((i13 - i14) * (i12 - i11)) - ((i15 - i14) * (i10 - i11)) > 0) {
                            this.aj.ad = false;
                            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > -1431886479 * this.aj.bu || i14 > this.aj.bu * -171128733 || i15 > this.aj.bu * -1116107809) {
                                this.aj.ad = true;
                            }
                            if (cc.bb && cc.bv(cc.bd, cc.by, i10, i11, i12, i13, i14, i15)) {
                                cc.bx = i6;
                                cc.bi = i7;
                            }
                            if (-1 == 1575894414 * bqVar.ao) {
                                if (-771413967 * bqVar.an != 1047308291) {
                                    this.aj.ao(i10, i11, i12, i13, i14, i15, -430195224 * bqVar.an, 2135016699 * bqVar.aq, bqVar.ac * -1012303603, -1863880076);
                                }
                            } else if (cc.aj) {
                                cqVar = this.aj;
                                i8 = by.ae.aq(-2087010715 * bqVar.ao, -429485798);
                                this.aj.ao(i10, i11, i12, i13, i14, i15, lq.bq(i8, bqVar.an * -771413967, -2031517944), lq.bq(i8, -1432727587 * bqVar.aq, -2131013543), lq.bq(i8, -1012303603 * bqVar.ac, -2133716713), -1566610928);
                            } else if (bqVar.aa) {
                                this.aj.af(i10, i11, i12, i13, i14, i15, 1682510037 * bqVar.an, bqVar.aq * 2135016699, bqVar.ac * 1362434345, i16, i20, i26, i18, i21, i27, i19, i22, i28, -2087010715 * bqVar.ao, -2032055605);
                            } else {
                                this.aj.af(i10, i11, i12, i13, i14, i15, -742905933 * bqVar.an, 1075101172 * bqVar.aq, bqVar.ac * -1012303603, i23, i26, i20, i24, i27, i21, i25, i28, i22, bqVar.ao * -2087010715, -1814077977);
                            }
                        }
                        if (((i11 - i12) * (i29 - i15)) - ((i14 - i15) * (i30 - i12)) > 0) {
                            this.aj.ad = false;
                            if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.aj.bu * -1431886479 || i15 > this.aj.bu * 236397107 || i14 > this.aj.bu * 176151275) {
                                this.aj.ad = true;
                            }
                            if (cc.bb && cc.bv(cc.bd, cc.by, i30, i12, i11, i29, i15, i14)) {
                                cc.bx = i6;
                                cc.bi = i7;
                            }
                            if (1650462054 * bqVar.ao == -1) {
                                if (12345678 != -218660475 * bqVar.aj) {
                                    this.aj.ao(i30, i12, i11, i29, i15, i14, -218660475 * bqVar.aj, bqVar.ac * 1841356656, bqVar.aq * 2135016699, -214913687);
                                }
                            } else if (cc.aj) {
                                cqVar = this.aj;
                                i8 = by.ae.aq(-2087010715 * bqVar.ao, -440949797);
                                this.aj.ao(i30, i12, i11, i29, i15, i14, lq.bq(i8, -2107898043 * bqVar.aj, -1913567262), lq.bq(i8, -1012303603 * bqVar.ac, -1945188499), lq.bq(i8, -1595944785 * bqVar.aq, -2033034782), 461027233);
                            } else {
                                this.aj.af(i30, i12, i11, i29, i15, i14, 1057618666 * bqVar.aj, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, i16, i20, i26, i18, i21, i27, i19, i22, i28, bqVar.ao * -2087010715, -907151697);
                            }
                        }
                    }
                }
            }
        }
    }

    void an(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
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
                int i21 = ((i5 * i11) + (i10 * i4)) >> 16;
                i10 = ((i10 * i5) - (i4 * i11)) >> 16;
                int i22 = ((i14 * i3) - (i10 * i2)) >> 16;
                int i23 = ((i10 * i3) + (i14 * i2)) >> 16;
                if (i23 >= 50) {
                    int i24 = ((i11 * i5) + (i4 * i12)) >> 16;
                    i10 = ((i5 * i12) - (i11 * i4)) >> 16;
                    int i25 = ((i15 * i3) - (i10 * i2)) >> 16;
                    int i26 = ((i10 * i3) + (i15 * i2)) >> 16;
                    if (i26 >= 50) {
                        int i27 = ((i4 * i12) + (i9 * i5)) >> 16;
                        i9 = ((i12 * i5) - (i9 * i4)) >> 16;
                        int i28 = ((i3 * i16) - (i2 * i9)) >> 16;
                        int i29 = ((i9 * i3) + (i16 * i2)) >> 16;
                        if (i29 >= 50) {
                            cq cqVar;
                            int i30 = (((411538491 * this.aj.bt) * i17) / i20) + (266497203 * this.aj.br);
                            int i31 = (((this.aj.bt * 411538491) * i19) / i20) + (this.aj.bb * 1621686031);
                            i16 = (((411538491 * this.aj.bt) * i21) / i23) + (266497203 * this.aj.br);
                            i13 = (((411538491 * this.aj.bt) * i22) / i23) + (1621686031 * this.aj.bb);
                            i14 = (((411538491 * this.aj.bt) * i24) / i26) + (266497203 * this.aj.br);
                            i11 = (((411538491 * this.aj.bt) * i25) / i26) + (1621686031 * this.aj.bb);
                            i15 = (((411538491 * this.aj.bt) * i27) / i29) + (this.aj.br * 266497203);
                            i12 = (((411538491 * this.aj.bt) * i28) / i29) + (this.aj.bb * 1621686031);
                            this.aj.bh = 0;
                            if (((i14 - i15) * (i13 - i12)) - ((i16 - i15) * (i11 - i12)) > 0) {
                                this.aj.ad = false;
                                if (i14 < 0 || i15 < 0 || i16 < 0 || i14 > -1431886479 * this.aj.bu || i15 > this.aj.bu * -1431886479 || i16 > this.aj.bu * -1431886479) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i11, i12, i13, i14, i15, i16)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-1 == -2087010715 * bqVar.ao) {
                                    if (-771413967 * bqVar.an != 12345678) {
                                        this.aj.ao(i11, i12, i13, i14, i15, i16, -771413967 * bqVar.an, 2135016699 * bqVar.aq, bqVar.ac * -1012303603, -1004988806);
                                    }
                                } else if (cc.aj) {
                                    cqVar = this.aj;
                                    i9 = by.ae.aq(-2087010715 * bqVar.ao, -1001600269);
                                    this.aj.ao(i11, i12, i13, i14, i15, i16, lq.bq(i9, bqVar.an * -771413967, -2014920015), lq.bq(i9, 2135016699 * bqVar.aq, -2069488067), lq.bq(i9, -1012303603 * bqVar.ac, -2054153736), -523723532);
                                } else if (bqVar.aa) {
                                    this.aj.af(i11, i12, i13, i14, i15, i16, -771413967 * bqVar.an, bqVar.aq * 2135016699, bqVar.ac * -1012303603, i17, i21, i27, i19, i22, i28, i20, i23, i29, -2087010715 * bqVar.ao, -890296418);
                                } else {
                                    this.aj.af(i11, i12, i13, i14, i15, i16, -771413967 * bqVar.an, 2135016699 * bqVar.aq, bqVar.ac * -1012303603, i24, i27, i21, i25, i28, i22, i26, i29, i23, bqVar.ao * -2087010715, -1319249427);
                                }
                            }
                            if (((i12 - i13) * (i30 - i16)) - ((i15 - i16) * (i31 - i13)) > 0) {
                                this.aj.ad = false;
                                if (i30 < 0 || i16 < 0 || i15 < 0 || i30 > this.aj.bu * -1431886479 || i16 > this.aj.bu * -1431886479 || i15 > this.aj.bu * -1431886479) {
                                    this.aj.ad = true;
                                }
                                if (cc.bb && cc.bv(cc.bd, cc.by, i31, i13, i12, i30, i16, i15)) {
                                    cc.bx = i6;
                                    cc.bi = i7;
                                }
                                if (-2087010715 * bqVar.ao == -1) {
                                    if (12345678 != -218660475 * bqVar.aj) {
                                        this.aj.ao(i31, i13, i12, i30, i16, i15, -218660475 * bqVar.aj, bqVar.ac * -1012303603, bqVar.aq * 2135016699, 1680529861);
                                    }
                                } else if (cc.aj) {
                                    cqVar = this.aj;
                                    i9 = by.ae.aq(-2087010715 * bqVar.ao, -545503443);
                                    this.aj.ao(i31, i13, i12, i30, i16, i15, lq.bq(i9, -218660475 * bqVar.aj, -2027445290), lq.bq(i9, -1012303603 * bqVar.ac, -2121979280), lq.bq(i9, 2135016699 * bqVar.aq, -1946989068), -1324084986);
                                } else {
                                    this.aj.af(i31, i13, i12, i30, i16, i15, -218660475 * bqVar.aj, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, i17, i21, i27, i19, i22, i28, i20, i23, i29, bqVar.ao * -2087010715, -1055752731);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bd.an(" + ')');
        }
    }

    void ap(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
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
            int i20 = ((i5 * i10) + (i9 * i4)) >> 16;
            i9 = ((i9 * i5) - (i4 * i10)) >> 16;
            int i21 = ((i13 * i3) - (i9 * i2)) >> 16;
            int i22 = ((i9 * i3) + (i13 * i2)) >> 16;
            if (i22 >= 50) {
                int i23 = ((i10 * i5) + (i4 * i11)) >> 16;
                i9 = ((i5 * i11) - (i10 * i4)) >> 16;
                int i24 = ((i14 * i3) - (i9 * i2)) >> 16;
                int i25 = ((i9 * i3) + (i14 * i2)) >> 16;
                if (i25 >= 50) {
                    int i26 = ((i4 * i11) + (i8 * i5)) >> 16;
                    i8 = ((i11 * i5) - (i8 * i4)) >> 16;
                    int i27 = ((i3 * i15) - (i2 * i8)) >> 16;
                    int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i28 >= 50) {
                        cq cqVar;
                        int i29 = (((411538491 * this.aj.bt) * i16) / i19) + (266497203 * this.aj.br);
                        int i30 = (((this.aj.bt * 411538491) * i18) / i19) + (this.aj.bb * 1621686031);
                        i15 = (((411538491 * this.aj.bt) * i20) / i22) + (266497203 * this.aj.br);
                        i12 = (((411538491 * this.aj.bt) * i21) / i22) + (1621686031 * this.aj.bb);
                        i13 = (((411538491 * this.aj.bt) * i23) / i25) + (266497203 * this.aj.br);
                        i10 = (((411538491 * this.aj.bt) * i24) / i25) + (1621686031 * this.aj.bb);
                        i14 = (((411538491 * this.aj.bt) * i26) / i28) + (this.aj.br * 266497203);
                        i11 = (((411538491 * this.aj.bt) * i27) / i28) + (this.aj.bb * 1621686031);
                        this.aj.bh = 0;
                        if (((i13 - i14) * (i12 - i11)) - ((i15 - i14) * (i10 - i11)) > 0) {
                            this.aj.ad = false;
                            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > -1431886479 * this.aj.bu || i14 > this.aj.bu * -1431886479 || i15 > this.aj.bu * -1431886479) {
                                this.aj.ad = true;
                            }
                            if (cc.bb && cc.bv(cc.bd, cc.by, i10, i11, i12, i13, i14, i15)) {
                                cc.bx = i6;
                                cc.bi = i7;
                            }
                            if (-1 == -2087010715 * bqVar.ao) {
                                if (-771413967 * bqVar.an != 12345678) {
                                    this.aj.ao(i10, i11, i12, i13, i14, i15, bqVar.an * -771413967, bqVar.aq * 2135016699, -1012303603 * bqVar.ac, -440263151);
                                }
                            } else if (cc.aj) {
                                cqVar = this.aj;
                                i8 = by.ae.aq(-2087010715 * bqVar.ao, -540287057);
                                this.aj.ao(i10, i11, i12, i13, i14, i15, lq.bq(i8, bqVar.an * -771413967, -2088726265), lq.bq(i8, 2135016699 * bqVar.aq, -2049442340), lq.bq(i8, -1012303603 * bqVar.ac, -1940558469), -1844484173);
                            } else if (bqVar.aa) {
                                this.aj.af(i10, i11, i12, i13, i14, i15, -771413967 * bqVar.an, bqVar.aq * 2135016699, bqVar.ac * -1012303603, i16, i20, i26, i18, i21, i27, i19, i22, i28, bqVar.ao * -2087010715, -1443774375);
                            } else {
                                this.aj.af(i10, i11, i12, i13, i14, i15, -771413967 * bqVar.an, 2135016699 * bqVar.aq, bqVar.ac * -1012303603, i23, i26, i20, i24, i27, i21, i25, i28, i22, bqVar.ao * -2087010715, -966362128);
                            }
                        }
                        if (((i11 - i12) * (i29 - i15)) - ((i14 - i15) * (i30 - i12)) > 0) {
                            this.aj.ad = false;
                            if (i29 < 0 || i15 < 0 || i14 < 0 || i29 > this.aj.bu * -1431886479 || i15 > this.aj.bu * -1431886479 || i14 > this.aj.bu * -1431886479) {
                                this.aj.ad = true;
                            }
                            if (cc.bb && cc.bv(cc.bd, cc.by, i30, i12, i11, i29, i15, i14)) {
                                cc.bx = i6;
                                cc.bi = i7;
                            }
                            if (-2087010715 * bqVar.ao == -1) {
                                if (12345678 != -218660475 * bqVar.aj) {
                                    this.aj.ao(i30, i12, i11, i29, i15, i14, -218660475 * bqVar.aj, bqVar.ac * -1012303603, bqVar.aq * 2135016699, 1844406056);
                                }
                            } else if (cc.aj) {
                                cqVar = this.aj;
                                i8 = by.ae.aq(-2087010715 * bqVar.ao, -292228578);
                                this.aj.ao(i30, i12, i11, i29, i15, i14, lq.bq(i8, -218660475 * bqVar.aj, -1956616029), lq.bq(i8, -1012303603 * bqVar.ac, -2065397904), lq.bq(i8, 2135016699 * bqVar.aq, -2043989789), -1144221173);
                            } else {
                                this.aj.af(i30, i12, i11, i29, i15, i14, -218660475 * bqVar.aj, -1012303603 * bqVar.ac, 2135016699 * bqVar.aq, i16, i20, i26, i18, i21, i27, i19, i22, i28, bqVar.ao * -2087010715, -881497216);
                            }
                        }
                    }
                }
            }
        }
    }

    void ah(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int length = bwVar.aj.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = bwVar.aj[i7] - cc.ar;
            int i9 = bwVar.ac[i7] - cc.ad;
            int i10 = bwVar.an[i7] - cc.ab;
            int i11 = ((i4 * i8) + (i3 * i10)) >> 16;
            i8 = ((i10 * i4) - (i8 * i3)) >> 16;
            i10 = ((i2 * i9) - (i * i8)) >> 16;
            i8 = ((i8 * i2) + (i9 * i)) >> 16;
            if (i8 >= 50) {
                if (bwVar.ah != null) {
                    bw.ax[i7] = i11;
                    bw.af[i7] = i10;
                    bw.au[i7] = i8;
                }
                bw.al[i7] = ((i11 * (this.aj.bt * 411538491)) / i8) + (266497203 * this.aj.br);
                bw.az[i7] = ((i10 * (this.aj.bt * 411538491)) / i8) + (this.aj.bb * 1621686031);
                i7++;
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
            i11 = bw.al[i13];
            int i16 = bw.al[i14];
            int i17 = bw.al[i15];
            i8 = bw.az[i13];
            i9 = bw.az[i14];
            i10 = bw.az[i15];
            if (((i11 - i16) * (i10 - i9)) - ((i8 - i9) * (i17 - i16)) > 0) {
                this.aj.ad = false;
                if (i11 < 0 || i16 < 0 || i17 < 0 || i11 > this.aj.bu * -1431886479 || i16 > this.aj.bu * -1431886479 || i17 > -1431886479 * this.aj.bu) {
                    this.aj.ad = true;
                }
                if (cc.bb && cc.bv(cc.bd, cc.by, i8, i9, i10, i11, i16, i17)) {
                    cc.bx = i5;
                    cc.bi = i6;
                }
                if (bwVar.ah == null || -1 == bwVar.ah[i12]) {
                    if (12345678 != bwVar.aq[i12]) {
                        this.aj.ao(i8, i9, i10, i11, i16, i17, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], 456369178);
                    }
                } else if (cc.aj) {
                    cq cqVar = this.aj;
                    i7 = by.ae.aq(bwVar.ah[i12], 241123890);
                    this.aj.ao(i8, i9, i10, i11, i16, i17, lq.bq(i7, bwVar.aq[i12], -2141757821), lq.bq(i7, bwVar.ao[i12], -1938348984), lq.bq(i7, bwVar.aa[i12], -2084803154), 1209705244);
                } else if (bwVar.ai) {
                    this.aj.af(i8, i9, i10, i11, i16, i17, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], bw.ax[0], bw.ax[1], bw.ax[3], bw.af[0], bw.af[1], bw.af[3], bw.au[0], bw.au[1], bw.au[3], bwVar.ah[i12], -792096937);
                } else {
                    this.aj.af(i8, i9, i10, i11, i16, i17, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], bw.ax[i13], bw.ax[i14], bw.ax[i15], bw.af[i13], bw.af[i14], bw.af[i15], bw.au[i13], bw.au[i14], bw.au[i15], bwVar.ah[i12], -1734983259);
                }
            }
            i12++;
        }
    }

    void aq(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
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
                i11 = ((i4 * i8) + (i3 * i10)) >> 16;
                i8 = ((i10 * i4) - (i8 * i3)) >> 16;
                i10 = ((i2 * i9) - (i * i8)) >> 16;
                i8 = ((i8 * i2) + (i9 * i)) >> 16;
                if (i8 >= 50) {
                    if (bwVar.ah != null) {
                        bw.ax[i12] = i11;
                        bw.af[i12] = i10;
                        bw.au[i12] = i8;
                    }
                    bw.al[i12] = ((i11 * (this.aj.bt * 411538491)) / i8) + (266497203 * this.aj.br);
                    bw.az[i12] = ((i10 * (this.aj.bt * 411538491)) / i8) + (this.aj.bb * 1621686031);
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
                if (((i11 - i17) * (i10 - i9)) - ((i8 - i9) * (i18 - i17)) > 0) {
                    this.aj.ad = false;
                    if (i11 < 0 || i17 < 0 || i18 < 0 || i11 > this.aj.bu * -1431886479 || i17 > this.aj.bu * -1431886479 || i18 > -1431886479 * this.aj.bu) {
                        this.aj.ad = true;
                    }
                    if (cc.bb && cc.bv(cc.bd, cc.by, i8, i9, i10, i11, i17, i18)) {
                        cc.bx = i5;
                        cc.bi = i6;
                    }
                    if (bwVar.ah == null || -1 == bwVar.ah[i13]) {
                        if (12345678 != bwVar.aq[i13]) {
                            this.aj.ao(i8, i9, i10, i11, i17, i18, bwVar.aq[i13], bwVar.ao[i13], bwVar.aa[i13], -896207083);
                        }
                    } else if (cc.aj) {
                        cq cqVar = this.aj;
                        i12 = by.ae.aq(bwVar.ah[i13], -337111305);
                        this.aj.ao(i8, i9, i10, i11, i17, i18, lq.bq(i12, bwVar.aq[i13], -1974457676), lq.bq(i12, bwVar.ao[i13], -2026708392), lq.bq(i12, bwVar.aa[i13], -2090108872), 1913716551);
                    } else if (bwVar.ai) {
                        this.aj.af(i8, i9, i10, i11, i17, i18, bwVar.aq[i13], bwVar.ao[i13], bwVar.aa[i13], bw.ax[0], bw.ax[1], bw.ax[3], bw.af[0], bw.af[1], bw.af[3], bw.au[0], bw.au[1], bw.au[3], bwVar.ah[i13], -878295027);
                    } else {
                        this.aj.af(i8, i9, i10, i11, i17, i18, bwVar.aq[i13], bwVar.ao[i13], bwVar.aa[i13], bw.ax[i14], bw.ax[i15], bw.ax[i16], bw.af[i14], bw.af[i15], bw.af[i16], bw.au[i14], bw.au[i15], bw.au[i16], bwVar.ah[i13], -1035262147);
                    }
                }
                i13++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bd.aq(" + ')');
        }
    }

    void at(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int length = bwVar.aj.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = bwVar.aj[i7] - cc.ar;
            int i9 = bwVar.ac[i7] - cc.ad;
            int i10 = bwVar.an[i7] - cc.ab;
            int i11 = ((i4 * i8) + (i3 * i10)) >> 16;
            i8 = ((i10 * i4) - (i8 * i3)) >> 16;
            i10 = ((i2 * i9) - (i * i8)) >> 16;
            i8 = ((i8 * i2) + (i9 * i)) >> 16;
            if (i8 >= 50) {
                if (bwVar.ah != null) {
                    bw.ax[i7] = i11;
                    bw.af[i7] = i10;
                    bw.au[i7] = i8;
                }
                bw.al[i7] = ((i11 * (this.aj.bt * 411538491)) / i8) + (266497203 * this.aj.br);
                bw.az[i7] = ((i10 * (this.aj.bt * 411538491)) / i8) + (this.aj.bb * 1621686031);
                i7++;
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
            i11 = bw.al[i14];
            int i16 = bw.al[i15];
            length = bw.az[i13];
            i8 = bw.az[i14];
            i9 = bw.az[i15];
            if (((i10 - i11) * (i9 - i8)) - ((length - i8) * (i16 - i11)) > 0) {
                this.aj.ad = false;
                if (i10 < 0 || i11 < 0 || i16 < 0 || i10 > this.aj.bu * -1431886479 || i11 > this.aj.bu * -1431886479 || i16 > -1431886479 * this.aj.bu) {
                    this.aj.ad = true;
                }
                if (cc.bb && cc.bv(cc.bd, cc.by, length, i8, i9, i10, i11, i16)) {
                    cc.bx = i5;
                    cc.bi = i6;
                }
                if (bwVar.ah == null || -1 == bwVar.ah[i12]) {
                    if (12345678 != bwVar.aq[i12]) {
                        this.aj.ao(length, i8, i9, i10, i11, i16, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], 57467164);
                    }
                } else if (cc.aj) {
                    cq cqVar = this.aj;
                    int aq = by.ae.aq(bwVar.ah[i12], -182217274);
                    this.aj.ao(length, i8, i9, i10, i11, i16, lq.bq(aq, bwVar.aq[i12], -2029793179), lq.bq(aq, bwVar.ao[i12], -2123482711), lq.bq(aq, bwVar.aa[i12], -2023782870), -1790657022);
                } else if (bwVar.ai) {
                    this.aj.af(length, i8, i9, i10, i11, i16, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], bw.ax[0], bw.ax[1], bw.ax[3], bw.af[0], bw.af[1], bw.af[3], bw.au[0], bw.au[1], bw.au[3], bwVar.ah[i12], -1485104531);
                } else {
                    this.aj.af(length, i8, i9, i10, i11, i16, bwVar.aq[i12], bwVar.ao[i12], bwVar.aa[i12], bw.ax[i13], bw.ax[i14], bw.ax[i15], bw.af[i13], bw.af[i14], bw.af[i15], bw.au[i13], bw.au[i14], bw.au[i15], bwVar.ah[i12], -1398282706);
                }
            }
            i12++;
        }
    }

    protected static final void ua(int i) {
        int i2 = 0;
        try {
            aw.pf.aj((byte) 2);
            for (int i3 = 0; i3 < 32; i3++) {
                ks.pk[i3] = 0;
            }
            while (i2 < 32) {
                ks.pt[i2] = 0;
                i2++;
            }
            fe.pq = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "bd.ua(" + ')');
        }
    }

    static boolean be(int i, int i2) {
        return 57 == i || 58 == i || 1007 == i || i == 25 || i == 30;
    }

    static int ag(int i, fs fsVar, boolean z, int i2) {
        if (i == 6200) {
            try {
                dy.ap -= -803849934;
                client.nk = (short) gr.ak[dy.ap * -38307927];
                if (client.nk <= (short) 0) {
                    client.nk = (short) 256;
                }
                client.nb = (short) gr.ak[(dy.ap * -38307927) + 1];
                if (client.nb <= (short) 0) {
                    client.nb = (short) 205;
                }
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "bd.ag(" + ')');
            }
        } else if (6201 == i) {
            dy.ap -= -803849934;
            client.np = (short) gr.ak[dy.ap * -38307927];
            if (client.np <= (short) 0) {
                client.np = (short) 256;
            }
            client.nr = (short) gr.ak[(dy.ap * -38307927) + 1];
            if (client.nr <= (short) 0) {
                client.nr = (short) 320;
            }
            return 1;
        } else if (6202 == i) {
            dy.ap -= -1607699868;
            client.nh = (short) gr.ak[dy.ap * -38307927];
            if (client.nh <= (short) 0) {
                client.nh = (short) 1;
            }
            client.nf = (short) gr.ak[(dy.ap * -38307927) + 1];
            if (client.nf <= (short) 0) {
                client.nf = Short.MAX_VALUE;
            } else if (client.nf < client.nh) {
                client.nf = client.nh;
            }
            client.ni = (short) gr.ak[(dy.ap * -38307927) + 2];
            if (client.ni <= (short) 0) {
                client.ni = (short) 1;
            }
            client.ny = (short) gr.ak[(dy.ap * -38307927) + 3];
            if (client.ny <= (short) 0) {
                client.ny = Short.MAX_VALUE;
            } else if (client.ny < client.ni) {
                client.ny = client.ni;
            }
            return 1;
        } else if (6203 == i) {
            if (client.is != null) {
                fs.ca(0, 0, client.is.bu * 1120250035, -1781667913 * client.is.bd, false, 1820688373);
                r0 = gr.ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = client.ne * 1889242427;
                r0 = gr.ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = 1949695293 * client.nn;
            } else {
                r0 = gr.ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = gr.ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
            }
            return 1;
        } else if (i == 6204) {
            r0 = gr.ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.np;
            r0 = gr.ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nr;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            r0 = gr.ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nk;
            r0 = gr.ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nb;
            return 1;
        }
    }
}
