package defpackage;

public final class fg extends jt {
    static jm aj = new jm();
    static final int he = 2048;
    int aa;
    int ac;
    ia ae;
    int ah;
    int ai;
    int ak;
    int am;
    int an;
    int ao;
    int ap;
    int aq;
    ah as;
    ia at;
    int[] aw;

    fg() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "fg.<init>(" + ')');
        }
    }

    static void aa() {
        for (fg fgVar = (fg) aj.ak(); fgVar != null; fgVar = (fg) aj.at()) {
            if (fgVar.at != null) {
                dx.mh.ac(fgVar.at);
                fgVar.at = null;
            }
            if (fgVar.ae != null) {
                dx.mh.ac(fgVar.ae);
                fgVar.ae = null;
            }
        }
        aj.aj();
    }

    static void ao() {
        for (fg fgVar = (fg) aj.ak(); fgVar != null; fgVar = (fg) aj.at()) {
            if (fgVar.at != null) {
                dx.mh.ac(fgVar.at);
                fgVar.at = null;
            }
            if (fgVar.ae != null) {
                dx.mh.ac(fgVar.ae);
                fgVar.ae = null;
            }
        }
        aj.aj();
    }

    static void ak() {
        for (fg fgVar = (fg) aj.ak(); fgVar != null; fgVar = (fg) aj.at()) {
            if (fgVar.as != null) {
                fgVar.an((byte) -120);
            }
        }
    }

    static void ap() {
        for (fg fgVar = (fg) aj.ak(); fgVar != null; fgVar = (fg) aj.at()) {
            if (fgVar.as != null) {
                fgVar.an((byte) -25);
            }
        }
    }

    void ah() {
        int i = this.ap * 261044907;
        ah aw = this.as.aw(1118826042);
        if (aw != null) {
            this.ap = -1906356185 * aw.bw;
            this.ak = -334756480 * aw.bn;
            this.ah = aw.bg * -2040866612;
            this.ai = aw.bc * 1196077317;
            this.aw = aw.bk;
        } else {
            this.ap = -795610500;
            this.ak = 0;
            this.ah = 0;
            this.ai = 0;
            this.aw = null;
        }
        if (this.ap * 261044907 != i && this.at != null) {
            dx.mh.ac(this.at);
            this.at = null;
        }
    }

    void an(byte b) {
        try {
            int i = this.ap * 261044907;
            ah aw = this.as.aw(55369408);
            if (aw != null) {
                this.ap = 1251564591 * aw.bw;
                this.ak = -334756480 * aw.bn;
                this.ah = aw.bg * -620300713;
                this.ai = aw.bc * 1196077317;
                this.aw = aw.bk;
            } else {
                this.ap = -2130112515;
                this.ak = 0;
                this.ah = 0;
                this.ai = 0;
                this.aw = null;
            }
            if (this.ap * 261044907 != i && this.at != null) {
                dx.mh.ac(this.at);
                this.at = null;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fg.an(" + ')');
        }
    }

    void at() {
        int i = -495380396 * this.ap;
        ah aw = this.as.aw(-448158723);
        if (aw != null) {
            this.ap = 1251564591 * aw.bw;
            this.ak = -334756480 * aw.bn;
            this.ah = aw.bg * -620300713;
            this.ai = aw.bc * 1196077317;
            this.aw = aw.bk;
        } else {
            this.ap = -2130112515;
            this.ak = 0;
            this.ah = 0;
            this.ai = 0;
            this.aw = null;
        }
        if (this.ap * -2117026519 != i && this.at != null) {
            dx.mh.ac(this.at);
            this.at = null;
        }
    }

    static void ai(int i, int i2, int i3, int i4) {
        fg fgVar = (fg) aj.ak();
        while (fgVar != null) {
            if (fgVar.ap * 1309555086 != -1 || fgVar.aw != null) {
                int i5;
                if (i2 > -917333125 * fgVar.ao) {
                    i5 = (i2 - (-2054468209 * fgVar.ao)) + 0;
                } else if (i2 < fgVar.an * -1655448401) {
                    i5 = ((fgVar.an * -1655448401) - i2) + 0;
                } else {
                    i5 = 0;
                }
                if (i3 > fgVar.aa * -674418639) {
                    i5 += i3 - (fgVar.aa * -674418639);
                } else if (i3 < 1387745745 * fgVar.aq) {
                    i5 += (fgVar.aq * 992538497) - i3;
                }
                if (i5 - 50392455 > fgVar.ak * 2071251053 || client.mp * -4007522 == 0 || fgVar.ac * 1415674861 != i) {
                    if (fgVar.at != null) {
                        dx.mh.ac(fgVar.at);
                        fgVar.at = null;
                    }
                    if (fgVar.ae != null) {
                        dx.mh.ac(fgVar.ae);
                        fgVar.ae = null;
                    }
                } else {
                    ii aj;
                    i5 -= 64;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i5 = (((fgVar.ak * -650975889) - i5) * (client.mp * 617007039)) / (-1540164945 * fgVar.ak);
                    if (fgVar.at != null) {
                        fgVar.at.aw(i5);
                    } else if (fgVar.ap * 261044907 >= 0) {
                        aj = ii.aj(client.bk, -1177727308 * fgVar.ap, 0);
                        if (aj != null) {
                            iu an = ia.an(aj.ac().aj(av.ma), 100, i5);
                            an.ah(-1);
                            dx.mh.aj(an);
                            fgVar.at = an;
                        }
                    }
                    if (fgVar.ae != null) {
                        fgVar.ae.aw(i5);
                        if (!fgVar.ae.ks()) {
                            fgVar.ae = null;
                        }
                    } else if (fgVar.aw != null) {
                        int i6 = fgVar.am - (-565054648 * i4);
                        fgVar.am = i6;
                        if (i6 * -507267267 <= 0) {
                            aj = ii.aj(client.bk, fgVar.aw[(int) (Math.random() * ((double) fgVar.aw.length))], 0);
                            if (aj != null) {
                                iu an2 = ia.an(aj.ac().aj(av.ma), 100, i5);
                                an2.ah(0);
                                dx.mh.aj(an2);
                                fgVar.ae = an2;
                                fgVar.am = ((fgVar.ah * -1216017805) + ((int) (Math.random() * ((double) ((fgVar.ai * 1938559033) - (fgVar.ah * -1734050801)))))) * 2065258517;
                            }
                        }
                    }
                }
            }
            fgVar = (fg) aj.at();
        }
    }
}
