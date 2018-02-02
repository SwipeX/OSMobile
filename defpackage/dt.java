package defpackage;

public class dt {
    static int[] ae = null;
    static final int ax = 11;
    static lo bj;
    static int dk;
    bt ac;
    int aj;

    dt(int i, bt btVar) {
        try {
            this.aj = -81046709 * i;
            this.ac = btVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dt.<init>(" + ')');
        }
    }

    static final int bj(int i, int i2, int i3, int i4, int i5) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final void bg(fx fxVar, int i) {
        Object obj = null;
        try {
            if (fxVar.dp * 1497962279 != 0) {
                int i2;
                if (fxVar.cf * -1329884919 != -1) {
                    fx fxVar2 = null;
                    if (fxVar.cf * -1329884919 < 32768) {
                        fxVar2 = client.cj[fxVar.cf * -1329884919];
                    } else if (fxVar.cf * -1329884919 >= 32768) {
                        fxVar2 = client.hx[(fxVar.cf * -1329884919) - 32768];
                    }
                    if (fxVar2 != null) {
                        i2 = (1948391561 * fxVar.br) - (1948391561 * fxVar2.br);
                        int i3 = (-1461980333 * fxVar.bb) - (fxVar2.bb * -1461980333);
                        if (!(i2 == 0 && i3 == 0)) {
                            fxVar.de = (((int) (Math.atan2((double) i2, (double) i3) * 325.949d)) & 2047) * 1559303333;
                        }
                    } else if (fxVar.ca) {
                        fxVar.cf = -2130005305;
                        fxVar.ca = false;
                    }
                }
                if (13981869 * fxVar.cr != -1 && (-2019433429 * fxVar.dr == 0 || -1871989999 * fxVar.di > 0)) {
                    fxVar.de = -615732351 * fxVar.cr;
                    fxVar.cr = -291359525;
                }
                i2 = ((fxVar.de * -797920467) - (-603732529 * fxVar.bu)) & 2047;
                if (i2 == 0 && fxVar.ca) {
                    fxVar.cf = -2130005305;
                    fxVar.ca = false;
                }
                if (i2 != 0) {
                    fxVar.dx += 237689479;
                    if (i2 > 1024) {
                        fxVar.bu -= 680412969 * fxVar.dp;
                        if (i2 < fxVar.dp * 1497962279 || i2 > 2048 - (fxVar.dp * 1497962279)) {
                            fxVar.bu = fxVar.de * -906579389;
                        } else {
                            int i4 = 1;
                        }
                        if (118674673 * fxVar.cp == fxVar.by * -1962837115 && (fxVar.dx * -1326527689 > 25 || r1 != null)) {
                            if (fxVar.bx * -361363851 != -1) {
                                fxVar.cp = 376879557 * fxVar.bx;
                            } else {
                                fxVar.cp = -2041049233 * fxVar.bs;
                            }
                        }
                    } else {
                        fxVar.bu += 680412969 * fxVar.dp;
                        Object obj2 = 1;
                        if (i2 < fxVar.dp * 1497962279 || i2 > 2048 - (fxVar.dp * 1497962279)) {
                            fxVar.bu = -906579389 * fxVar.de;
                            obj2 = null;
                        }
                        if (fxVar.by * -1962837115 == 118674673 * fxVar.cp && (fxVar.dx * -1326527689 > 25 || r0 != null)) {
                            if (-1324736311 * fxVar.bi != -1) {
                                fxVar.cp = fxVar.bi * -811882151;
                            } else {
                                fxVar.cp = -2041049233 * fxVar.bs;
                            }
                        }
                    }
                    fxVar.bu = 1459691823 * ((-603732529 * fxVar.bu) & 2047);
                    return;
                }
                fxVar.dx = 0;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dt.bg(" + ')');
        }
    }

    public static boolean fw(int i) {
        try {
            return client.ia * 240624837 >= 2;
        } catch (Throwable e) {
            throw ei.ac(e, "dt.fw(" + ')');
        }
    }
}
