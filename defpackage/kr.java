package defpackage;

public class kr {
    static final int ac = 400;
    static String ae = "Automatically retrying in %s...";
    static String ah = "Unable to download content";
    static String ai = "Application crashed";
    static final int aj = 503;
    static final int ak = -1;
    static String am = "Failed to download config. Please check your Internet connection.";
    static final int an = 60;
    static final int ao = 460;
    static String ap = "Old School RuneScape has encountered a problem";
    static String at = "Your client needs updating. Opening store page...";
    static String aw = "Error loading application";
    int al;
    String as;

    kr() {
        try {
            this.al = 862177161;
        } catch (Throwable e) {
            throw ei.ac(e, "kr.<init>(" + ')');
        }
    }

    void aa(int i, String str, em emVar, kh khVar, float f, ew ewVar) {
        es aj = ewVar.aj((byte) -12);
        aj.ac((byte) 14);
        int i2 = (int) (503.0f * f);
        if (emVar != null) {
            int i3 = this.al * 685890119;
            if (i3 > 255) {
                i3 = 510 - i3;
            }
            this.al = (((685890119 * this.al) + 5) % 510) * 407613303;
            int i4 = (i2 - emVar.ac) / 2;
            aj.br(emVar, i4, 25, i3 + ((i3 << 16) + (i3 << 8)), -1760789705);
        }
        aj.fd((i2 - 400) / 2, 425, ac, an, -7597807, (short) -19502);
        aj.aq(((i2 - 400) - 4) / 2, 427, (i * 396) / 100, 56, -7597807, (byte) 72);
        if (khVar != null) {
            khVar.aw(str, i2 / 2, ao, -1, 0, aj);
        }
        ewVar.ak(0, 0, (byte) 1);
    }

    void aj(int i, String str, em emVar, kh khVar, float f, ew ewVar, int i2) {
        try {
            es aj = ewVar.aj((byte) -32);
            aj.ac((byte) 14);
            int i3 = (int) (503.0f * f);
            if (emVar != null) {
                int i4 = this.al * 685890119;
                if (i4 > 255) {
                    i4 = 510 - i4;
                }
                this.al = (((this.al * 685890119) + 5) % 510) * 407613303;
                int i5 = (i3 - emVar.ac) / 2;
                aj.br(emVar, i5, 25, i4 + ((i4 << 16) + (i4 << 8)), -1760789705);
            }
            aj.fd((i3 - 400) / 2, 425, ac, an, -7597807, (short) -28253);
            aj.aq(((i3 - 400) - 4) / 2, 427, (i * 396) / 100, 56, -7597807, (byte) 90);
            if (khVar != null) {
                khVar.aw(str, i3 / 2, ao, -1, 0, aj);
            }
            ewVar.ak(0, 0, (byte) 1);
        } catch (Throwable e) {
            throw ei.ac(e, "kr.aj(" + ')');
        }
    }

    void ak(int i, String str, em emVar, kh khVar, float f, ew ewVar) {
        es aj = ewVar.aj((byte) -81);
        aj.ac((byte) 14);
        int i2 = (int) (503.0f * f);
        if (emVar != null) {
            int i3 = this.al * 685890119;
            if (i3 > 255) {
                i3 = 510 - i3;
            }
            this.al = (((685890119 * this.al) + 5) % 510) * 407613303;
            int i4 = (i2 - emVar.ac) / 2;
            aj.br(emVar, i4, 25, i3 + ((i3 << 16) + (i3 << 8)), -1760789705);
        }
        aj.fd((i2 - 400) / 2, 425, ac, an, -7597807, (short) -1664);
        aj.aq(((i2 - 400) - 4) / 2, 427, (i * 396) / 100, 56, -7597807, (byte) 124);
        if (khVar != null) {
            khVar.aw(str, i2 / 2, ao, -1, 0, aj);
        }
        ewVar.ak(0, 0, (byte) 1);
    }

    void ao(int i, String str, em emVar, kh khVar, float f, ew ewVar) {
        es aj = ewVar.aj((byte) -2);
        aj.ac((byte) 14);
        int i2 = (int) (503.0f * f);
        if (emVar != null) {
            int i3 = this.al * 685890119;
            if (i3 > 255) {
                i3 = 510 - i3;
            }
            this.al = (((685890119 * this.al) + 5) % 510) * 407613303;
            int i4 = (i2 - emVar.ac) / 2;
            aj.br(emVar, i4, 25, i3 + ((i3 << 16) + (i3 << 8)), -1760789705);
        }
        aj.fd((i2 - 400) / 2, 425, ac, an, -7597807, (short) -11443);
        aj.aq(((i2 - 400) - 4) / 2, 427, (i * 396) / 100, 56, -7597807, (byte) 99);
        if (khVar != null) {
            khVar.aw(str, i2 / 2, ao, -1, 0, aj);
        }
        ewVar.ak(0, 0, (byte) 1);
    }

    void ac(lg lgVar, kh khVar, ew ewVar, float f, int i) {
        if (lgVar != null) {
            try {
                if (this.as == null) {
                    switch (lgVar.ah * 2050197721) {
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                            this.as = ah;
                            break;
                        case 5:
                            this.as = at;
                            break;
                        case 7:
                            this.as = ai;
                            break;
                        default:
                            this.as = aw;
                            break;
                    }
                }
                int i2 = (int) (503.0f * f);
                ewVar.aj((byte) -6).ac((byte) 14);
                khVar.aw(ap, i2 / 2, 201, -1, 0, ewVar.aj((byte) -29));
                khVar.aw(this.as, i2 / 2, 301, -1, 0, ewVar.aj((byte) -11));
                ewVar.ak(0, 0, (byte) 1);
            } catch (Throwable e) {
                throw ei.ac(e, "kr.ac(" + ')');
            }
        }
    }

    void an(int i, kh khVar, ew ewVar, float f, byte b) {
        int i2 = (int) (503.0f * f);
        try {
            khVar.aw(am, i2 / 2, 201, -1, 0, ewVar.aj((byte) -96));
            kh khVar2 = khVar;
            khVar2.aw(String.format(ae, new Object[]{Integer.valueOf(i)}), i2 / 2, 301, -1, 0, ewVar.aj((byte) -89));
            ewVar.ak(0, 0, (byte) 1);
        } catch (Throwable e) {
            throw ei.ac(e, "kr.an(" + ')');
        }
    }

    void ah(kh khVar, ew ewVar, float f) {
        kh khVar2 = khVar;
        khVar2.aw(at, ((int) (503.0f * f)) / 2, 251, -1, 0, ewVar.aj((byte) -20));
        ewVar.ak(0, 0, (byte) 1);
    }

    void ap(kh khVar, ew ewVar, float f) {
        kh khVar2 = khVar;
        khVar2.aw(at, ((int) (503.0f * f)) / 2, 251, -1, 0, ewVar.aj((byte) -123));
        ewVar.ak(0, 0, (byte) 1);
    }

    void aq(kh khVar, ew ewVar, float f, int i) {
        try {
            khVar.aw(at, ((int) (503.0f * f)) / 2, 251, -1, 0, ewVar.aj((byte) -7));
            ewVar.ak(0, 0, (byte) 1);
        } catch (Throwable e) {
            throw ei.ac(e, "kr.aq(" + ')');
        }
    }

    void at(kh khVar, ew ewVar, float f) {
        kh khVar2 = khVar;
        khVar2.aw(at, ((int) (503.0f * f)) / 2, 251, -1, 0, ewVar.aj((byte) -3));
        ewVar.ak(0, 0, (byte) 1);
    }

    static final void bn(fx fxVar, int i) {
        try {
            fxVar.cp = 148848597 * fxVar.by;
            if (fxVar.dr * -2019433429 == 0) {
                fxVar.di = 0;
                return;
            }
            if (-1 != fxVar.ck * 1976380739 && fxVar.ci * -517274049 == 0) {
                ax aj = bn.aj(fxVar.ck * 1976380739, (byte) 0);
                if (fxVar.dw * -1650834013 > 0 && aj.az * 918310743 == 0) {
                    fxVar.di += 1796972017;
                    return;
                } else if (fxVar.dw * -1650834013 <= 0 && aj.ax * 472938459 == 0) {
                    fxVar.di += 1796972017;
                    return;
                }
            }
            int i2 = 1948391561 * fxVar.br;
            int i3 = fxVar.bb * -1461980333;
            int i4 = (fxVar.dd[(fxVar.dr * -2019433429) - 1] * cj.ak) + (fxVar.bd * 688518592);
            int i5 = (fxVar.ds[(fxVar.dr * -2019433429) - 1] * cj.ak) + (688518592 * fxVar.bd);
            if (i2 < i4) {
                if (i3 < i5) {
                    fxVar.de = -1251526400;
                } else if (i3 > i5) {
                    fxVar.de = -1752136960;
                } else {
                    fxVar.de = -1501831680;
                }
            } else if (i2 > i4) {
                if (i3 < i5) {
                    fxVar.de = -750915840;
                } else if (i3 > i5) {
                    fxVar.de = -250305280;
                } else {
                    fxVar.de = -500610560;
                }
            } else if (i3 < i5) {
                fxVar.de = -1001221120;
            } else if (i3 > i5) {
                fxVar.de = 0;
            }
            byte b = fxVar.da[(fxVar.dr * -2019433429) - 1];
            if (i4 - i2 > bq.ah || i4 - i2 < -256 || i5 - i3 > bq.ah || i5 - i3 < -256) {
                fxVar.br = 1530846649 * i4;
                fxVar.bb = -376780581 * i5;
                fxVar.dr -= -1817986429;
                if (fxVar.dw * -1650834013 > 0) {
                    fxVar.dw -= 776017419;
                    return;
                }
                return;
            }
            int i6;
            int i7 = ((-797920467 * fxVar.de) - (-603732529 * fxVar.bu)) & 2047;
            if (i7 > 1024) {
                i6 = i7 - 2048;
            } else {
                i6 = i7;
            }
            i7 = 1220738753 * fxVar.bo;
            if (i6 >= -256 && i6 <= 256) {
                i7 = -2072218753 * fxVar.bs;
            } else if (i6 >= 256 && i6 < 768) {
                i7 = fxVar.bq * 899337913;
            } else if (i6 >= -768 && i6 <= -256) {
                i7 = fxVar.bz * -1864830547;
            }
            if (i7 == -1) {
                i7 = -2072218753 * fxVar.bs;
            }
            fxVar.cp = i7 * 432905233;
            boolean z = true;
            if (fxVar instanceof ft) {
                z = ((ft) fxVar).aj.by;
            }
            if (z) {
                if (fxVar.de * -797920467 == fxVar.bu * -603732529 || fxVar.cf * -1329884919 != -1 || fxVar.dp * 1497962279 == 0) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                if (fxVar.dr * -2019433429 > 2) {
                    i7 = 6;
                }
                if (fxVar.dr * -2019433429 > 3) {
                    i7 = 8;
                }
                if (fxVar.di * -1871989999 > 0 && fxVar.dr * -2019433429 > 1) {
                    fxVar.di -= 1796972017;
                    i7 = 8;
                }
            } else {
                if (fxVar.dr * -2019433429 > 1) {
                    i7 = 6;
                } else {
                    i7 = 4;
                }
                if (fxVar.dr * -2019433429 > 2) {
                    i7 = 8;
                }
                if (-1871989999 * fxVar.di > 0 && fxVar.dr * -2019433429 > 1) {
                    fxVar.di -= 1796972017;
                    i7 = 8;
                }
            }
            if ((byte) 2 == b) {
                i7 <<= 1;
            }
            if (i7 >= 8 && fxVar.cp * 118674673 == fxVar.bs * -2072218753 && fxVar.bj * 423832603 != -1) {
                fxVar.cp = -1862966837 * fxVar.bj;
            }
            if (!(i2 == i4 && i5 == i3)) {
                if (i2 < i4) {
                    fxVar.br += 1530846649 * i7;
                    if (fxVar.br * 1948391561 > i4) {
                        fxVar.br = 1530846649 * i4;
                    }
                } else if (i2 > i4) {
                    fxVar.br -= 1530846649 * i7;
                    if (fxVar.br * 1948391561 < i4) {
                        fxVar.br = 1530846649 * i4;
                    }
                }
                if (i3 < i5) {
                    fxVar.bb = (i7 * -376780581) + fxVar.bb;
                    if (-1461980333 * fxVar.bb > i5) {
                        fxVar.bb = i5 * -376780581;
                    }
                } else if (i3 > i5) {
                    fxVar.bb -= i7 * -376780581;
                    if (fxVar.bb * -1461980333 < i5) {
                        fxVar.bb = i5 * -376780581;
                    }
                }
            }
            if (i4 == 1948391561 * fxVar.br && fxVar.bb * -1461980333 == i5) {
                fxVar.dr -= -1817986429;
                if (fxVar.dw * -1650834013 > 0) {
                    fxVar.dw -= 776017419;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "kr.bn(" + ')');
        }
    }
}
