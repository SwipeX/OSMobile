package defpackage;

public class af extends je {
    public static af[] ac;
    public static ju aj;
    public static af an = new af();
    static kh as;
    static String cv;
    static in mk;
    public boolean aa = true;
    public int ah;
    public int ai;
    public int ak = 1359298115;
    public int am;
    public int ao = -503336659;
    public int ap;
    public int aq = 0;
    public int at;
    public int aw;

    public void aa() {
        if (-1 != this.ak * -395214443) {
            aq(this.ak * -395214443, -1380775874);
            this.ai = this.ap * -2016485185;
            this.aw = this.at * 830765835;
            this.am = this.ah * -1978011419;
        }
        aq(this.aq * -441171245, -766632770);
    }

    public void aj(int i) {
        try {
            if (-1 != this.ak * -395214443) {
                aq(this.ak * -395214443, -1046222559);
                this.ai = this.ap * -2016485185;
                this.aw = this.at * 830765835;
                this.am = this.ah * -1978011419;
            }
            aq(this.aq * -441171245, -1733637862);
        } catch (Throwable e) {
            throw ei.ac(e, "af.aj(" + ')');
        }
    }

    public void ak() {
        if (-1 != this.ak * -395214443) {
            aq(this.ak * -395214443, -324448593);
            this.ai = this.ap * -2016485185;
            this.aw = this.at * 830765835;
            this.am = this.ah * -1978011419;
        }
        aq(this.aq * -441171245, -349046193);
    }

    public void ao() {
        if (-1 != this.ak * -395214443) {
            aq(this.ak * -395214443, -1288176871);
            this.ai = this.ap * -2016485185;
            this.aw = this.at * 830765835;
            this.am = this.ah * -1978011419;
        }
        aq(this.aq * -441171245, -1506756945);
    }

    public void ac(he heVar, int i, int i2) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    an(heVar, au, i, -561040041);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "af.ac(" + ')');
            }
        }
    }

    public void ap(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, i, -2053876798);
            } else {
                return;
            }
        }
    }

    void ah(he heVar, int i, int i2) {
        if (i == 1) {
            this.aq = heVar.ar(597353088) * 848136390;
        } else if (2 == i) {
            this.ao = heVar.au(-310118664) * 503336659;
        } else if (i == 5) {
            this.aa = false;
        } else if (7 == i) {
            this.ak = heVar.ar(597353088) * -1359298115;
        } else if (8 != i) {
        }
    }

    void ai(he heVar, int i, int i2) {
        if (i == 1) {
            this.aq = heVar.ar(597353088) * -668719783;
        } else if (2 == i) {
            this.ao = heVar.au(-310118664) * -95167579;
        } else if (i == 5) {
            this.aa = false;
        } else if (7 == i) {
            this.ak = heVar.ar(597353088) * 1974059015;
        } else if (8 != i) {
        }
    }

    void an(he heVar, int i, int i2, int i3) {
        if (i == 1) {
            try {
                this.aq = heVar.ar(597353088) * 1003840859;
            } catch (Throwable e) {
                throw ei.ac(e, "af.an(" + ')');
            }
        } else if (2 == i) {
            this.ao = heVar.au(-310118664) * 503336659;
        } else if (i == 5) {
            this.aa = false;
        } else if (7 == i) {
            this.ak = heVar.ar(597353088) * -1359298115;
        } else if (8 != i) {
        }
    }

    void at(he heVar, int i, int i2) {
        if (i == 1) {
            this.aq = heVar.ar(597353088) * 1003840859;
        } else if (2 == i) {
            this.ao = heVar.au(-310118664) * 503336659;
        } else if (i == 5) {
            this.aa = false;
        } else if (7 == i) {
            this.ak = heVar.ar(597353088) * -1359298115;
        } else if (8 != i) {
        }
    }

    void aw(he heVar, int i, int i2) {
        if (i == 1) {
            this.aq = heVar.ar(597353088) * 963838526;
        } else if (2 == i) {
            this.ao = heVar.au(-310118664) * 74161573;
        } else if (i == 5) {
            this.aa = false;
        } else if (7 == i) {
            this.ak = heVar.ar(597353088) * 1781090134;
        } else if (8 != i) {
        }
    }

    void am(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d3 == d2) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d2 == d4) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d2 == d5) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            this.ap = ((int) ((d5 / 6.0d) * 256.0d)) * -989044841;
            this.at = ((int) (d * 256.0d)) * 2078247807;
            this.ah = -474761711 * ((int) (256.0d * d7));
            if (this.at * -1908657025 < 0) {
                this.at = 0;
            } else if (this.at * -1908657025 > 255) {
                this.at = 1672213377;
            }
            if (this.ah * -894043407 < 0) {
                this.ah = 0;
            } else if (this.ah * -894043407 > 255) {
                this.ah = -805152017;
            }
        }
        d = d6;
        d5 = 0.0d;
        this.ap = ((int) ((d5 / 6.0d) * 256.0d)) * -989044841;
        this.at = ((int) (d * 256.0d)) * 2078247807;
        this.ah = -474761711 * ((int) (256.0d * d7));
        if (this.at * -1908657025 < 0) {
            this.at = 0;
        } else if (this.at * -1908657025 > 255) {
            this.at = 1672213377;
        }
        if (this.ah * -894043407 < 0) {
            this.ah = 0;
        } else if (this.ah * -894043407 > 255) {
            this.ah = -805152017;
        }
    }

    void aq(int i, int i2) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d != d2) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d3 == d) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d == d4) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d == d5) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            this.ap = ((int) ((d5 / 6.0d) * 256.0d)) * -989044841;
            this.at = ((int) (d * 256.0d)) * 2078247807;
            this.ah = -474761711 * ((int) (256.0d * d7));
            if (this.at * -1908657025 < 0) {
                this.at = 0;
            } else if (this.at * -1908657025 > 255) {
                this.at = 1672213377;
            }
            if (this.ah * -894043407 < 0) {
                this.ah = 0;
            } else if (this.ah * -894043407 > 255) {
                this.ah = -805152017;
            }
        }
        d = d6;
        d5 = 0.0d;
        try {
            this.ap = ((int) ((d5 / 6.0d) * 256.0d)) * -989044841;
            this.at = ((int) (d * 256.0d)) * 2078247807;
            this.ah = -474761711 * ((int) (256.0d * d7));
            if (this.at * -1908657025 < 0) {
                this.at = 0;
            } else if (this.at * -1908657025 > 255) {
                this.at = 1672213377;
            }
            if (this.ah * -894043407 < 0) {
                this.ah = 0;
            } else if (this.ah * -894043407 > 255) {
                this.ah = -805152017;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "af.aq(" + ')');
        }
    }

    static void eb(ab abVar, int i, int i2, boolean z, int i3) {
        try {
            int i4 = abVar.bu * 1120250035;
            int i5 = abVar.bd * -1781667913;
            if (abVar.ad * 98595523 == 0) {
                abVar.bu = 351882271 * abVar.bh;
            } else if (1 == abVar.ad * 98595523) {
                abVar.bu = 1123894907 * (i - (abVar.bh * -702574163));
            } else if (2 == abVar.ad * 98595523) {
                abVar.bu = (((-702574163 * abVar.bh) * i) >> 14) * 1123894907;
            }
            if (abVar.ab * 645153357 == 0) {
                abVar.bd = abVar.bt * -1667413965;
            } else if (1 == abVar.ab * 645153357) {
                abVar.bd = (i2 - (1617666421 * abVar.bt)) * 701670919;
            } else if (2 == abVar.ab * 645153357) {
                abVar.bd = (((1617666421 * abVar.bt) * i2) >> 14) * 701670919;
            }
            if (abVar.ad * 98595523 == 4) {
                abVar.bu = (((-856280651 * abVar.by) * (abVar.bd * -1781667913)) / (abVar.bx * 1708740645)) * 1123894907;
            }
            if (abVar.ab * 645153357 == 4) {
                abVar.bd = (((abVar.bx * 1708740645) * (abVar.bu * 1120250035)) / (-856280651 * abVar.by)) * 701670919;
            }
            if (client.iv && -1999477681 * abVar.au == 0) {
                if (abVar.bd * -1781667913 >= 5 || abVar.bu * 1120250035 >= 5) {
                    if (abVar.bd * -1781667913 <= 0) {
                        abVar.bd = -786612701;
                    }
                    if (abVar.bu * 1120250035 <= 0) {
                        abVar.bu = 1324507239;
                    }
                } else {
                    abVar.bd = -786612701;
                    abVar.bu = 1324507239;
                }
            }
            if (263736151 * abVar.ay == bh.aj) {
                client.is = abVar;
            }
            if (z && abVar.en != null) {
                if (i4 != abVar.bu * 1120250035 || i5 != abVar.bd * -1781667913) {
                    jt gdVar = new gd();
                    gdVar.an = abVar;
                    gdVar.aj = abVar.en;
                    client.kl.ac(gdVar);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "af.eb(" + ')');
        }
    }
}
