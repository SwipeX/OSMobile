package defpackage;

public class ai extends je {
    static js ac = new js(64, null);
    static int ae = 0;
    public static ju aj = null;
    static final int dd = 300;
    public boolean an;

    ai() {
        try {
            this.an = false;
        } catch (Throwable e) {
            throw ei.ac(e, "ai.<init>(" + ')');
        }
    }

    public static ai aa(int i) {
        ai aiVar = (ai) ac.aj((long) i);
        if (aiVar == null) {
            byte[] an = aj.an(19, i, -605965463);
            aiVar = new ai();
            if (an != null) {
                aiVar.ac(new he(an), (byte) -6);
            }
            ac.an(aiVar, (long) i);
        }
        return aiVar;
    }

    public static ai ao(int i) {
        ai aiVar = (ai) ac.aj((long) i);
        if (aiVar == null) {
            byte[] an = aj.an(19, i, -494235996);
            aiVar = new ai();
            if (an != null) {
                aiVar.ac(new he(an), (byte) -5);
            }
            ac.an(aiVar, (long) i);
        }
        return aiVar;
    }

    public static ai aq(int i) {
        ai aiVar = (ai) ac.aj((long) i);
        if (aiVar == null) {
            byte[] an = aj.an(19, i, -1964327298);
            aiVar = new ai();
            if (an != null) {
                aiVar.ac(new he(an), (byte) -37);
            }
            ac.an(aiVar, (long) i);
        }
        return aiVar;
    }

    public static ao ac(int i, int i2) {
        try {
            ao aoVar = (ao) ao.ac.aj((long) i);
            if (aoVar == null) {
                byte[] an = ao.aj.an(14, i, -1529789236);
                aoVar = new ao();
                if (an != null) {
                    aoVar.an(new he(an), -1368660918);
                }
                ao.ac.an(aoVar, (long) i);
            }
            return aoVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ai.ac(" + ')');
        }
    }

    void ac(he heVar, byte b) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    an(heVar, au, -2057836625);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ai.ac(" + ')');
            }
        }
    }

    void ak(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, -1769602318);
            } else {
                return;
            }
        }
    }

    void ap(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, -1718594969);
            } else {
                return;
            }
        }
    }

    void at(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, -1645134525);
            } else {
                return;
            }
        }
    }

    void an(he heVar, int i, int i2) {
        if (2 == i) {
            try {
                this.an = true;
            } catch (Throwable e) {
                throw ei.ac(e, "ai.an(" + ')');
            }
        }
    }

    static int af(int i, fs fsVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        if (3600 == i) {
            try {
                if (-608375691 * dx.na.ak == 0) {
                    iArr = gr.ak;
                    i3 = dy.ap - 401924967;
                    dy.ap = i3;
                    iArr[(i3 * -38307927) - 1] = -2;
                } else if (dx.na.ak * -608375691 == 1) {
                    iArr = gr.ak;
                    i3 = dy.ap - 401924967;
                    dy.ap = i3;
                    iArr[(i3 * -38307927) - 1] = -1;
                } else {
                    iArr = gr.ak;
                    i3 = dy.ap - 401924967;
                    dy.ap = i3;
                    iArr[(i3 * -38307927) - 1] = dx.na.ao.ac((byte) -1);
                }
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "ai.af(" + ')');
            }
        } else if (i == 3601) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (!dx.na.aj((byte) 98) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
            } else {
                ee eeVar = (ee) dx.na.ao.aw(r0, 1447464422);
                r2 = gr.at;
                r3 = di.ah + 436804489;
                di.ah = r3;
                r2[(r3 * 1894369977) - 1] = eeVar.ac((byte) -23);
                r2 = gr.at;
                r3 = di.ah + 436804489;
                di.ah = r3;
                r2[(r3 * 1894369977) - 1] = eeVar.an(30776324);
            }
            return 1;
        } else if (i == 3602) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (!dx.na.aj((byte) 59) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                r2 = gr.ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                r2[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 2123054160)).an * 614420611;
            }
            return 1;
        } else if (i == 3603) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (!dx.na.aj((byte) 41) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                r2 = gr.ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                r2[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 1547725464)).aq * -1774542961;
            }
            return 1;
        } else if (i == 3604) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = r0[i3 * 1894369977];
            r2 = gr.ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i3 = r2[r3 * -38307927];
            mg ac = hd.ac(mr.au, client.dp.ao, (byte) 84);
            ac.an.an(cx.ah(r0, 279081602) + 1, (byte) -89);
            ac.an.be(i3, (byte) 124);
            ac.an.ai(r0, -1573055554);
            client.dp.an(ac, 1743666317);
            return 1;
        } else if (3605 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            dx.na.ap(r0[i3 * 1894369977], (byte) 16);
            return 1;
        } else if (3606 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            dx.na.af(r0[i3 * 1894369977], (byte) 0);
            return 1;
        } else if (3607 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            dx.na.ae(r0[i3 * 1894369977], 1649475457);
            return 1;
        } else if (3608 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            dx.na.au(r0[i3 * 1894369977], (byte) -98);
            return 1;
        } else if (i == 3609) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = dk.fx(r0[i3 * 1894369977], -2068438083);
            r2 = gr.ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r2[(r3 * -38307927) - 1] = dx.na.aa(new ez(r0, ce.ap), false, (byte) 0) ? 1 : 0;
            return 1;
        } else if (3611 == i) {
            if (bt.lw != null) {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = bt.lw.at;
            } else {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
            }
            return 1;
        } else if (3612 == i) {
            if (bt.lw != null) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = bt.lw.ac((byte) -1);
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (i == 3613) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
            } else {
                r2 = gr.at;
                r3 = di.ah + 436804489;
                di.ah = r3;
                r2[(r3 * 1894369977) - 1] = bt.lw.aw(r0, 1980562114).aj(-889862953).aj(-399684789);
            }
            return 1;
        } else if (i == 3614) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                r2 = gr.ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                r2[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 1835157662)).an * 1184115479;
            }
            return 1;
        } else if (3615 == i) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                r2 = gr.ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                r2[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 1623333686)).aq;
            }
            return 1;
        } else if (3616 == i) {
            r2 = gr.ak;
            r0 = dy.ap - 401924967;
            dy.ap = r0;
            r2[(r0 * -38307927) - 1] = bt.lw != null ? bt.lw.ai : (byte) 0;
            return 1;
        } else if (i == 3617) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            ef.fz(r0[i3 * 1894369977], -1630071350);
            return 1;
        } else if (i == 3618) {
            r2 = gr.ak;
            r0 = dy.ap - 401924967;
            dy.ap = r0;
            r2[(r0 * -38307927) - 1] = bt.lw != null ? bt.lw.aw : (byte) 0;
            return 1;
        } else if (3619 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = r0[i3 * 1894369977];
            if (!r0.equals("")) {
                mg ac2 = hd.ac(mr.az, client.dp.ao, (byte) 35);
                ac2.an.an(cx.ah(r0, -804164370), (byte) -56);
                ac2.an.ai(r0, -599373134);
                client.dp.an(ac2, 1718964708);
            }
            return 1;
        } else if (i == 3620) {
            kf.fo((byte) -4);
            return 1;
        } else if (i == 3621) {
            if (dx.na.aj((byte) 57)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = dx.na.aa.ac((byte) -1);
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = -1;
            }
            return 1;
        } else if (i == 3622) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (!dx.na.aj((byte) 116) || r0 < 0 || r0 >= dx.na.aa.ac((byte) -1)) {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
            } else {
                el elVar = (el) dx.na.aa.aw(r0, 1451833984);
                r2 = gr.at;
                r3 = di.ah + 436804489;
                di.ah = r3;
                r2[(r3 * 1894369977) - 1] = elVar.ac((byte) -73);
                r2 = gr.at;
                r3 = di.ah + 436804489;
                di.ah = r3;
                r2[(r3 * 1894369977) - 1] = elVar.an(30776324);
            }
            return 1;
        } else if (3623 == i) {
            r0 = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = dk.fx(r0[i3 * 1894369977], -67754719);
            r2 = gr.ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (dx.na.ak(new ez(r0, ce.ap), 1228934358)) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            r2[r3] = r0;
            return 1;
        } else if (3624 == i) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !bt.lw.aw(r0, 1715011006).aj(-1279773356).equals(cx.hb.aj)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 1;
            }
            return 1;
        } else if (i == 3625) {
            if (bt.lw == null || bt.lw.ah == null) {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
            } else {
                r0 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = bt.lw.ah;
            }
            return 1;
        } else if (i == 3626) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 1598744719)).ar((short) 21204)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 1;
            }
            return 1;
        } else if (i != 3627) {
            return 2;
        } else {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = iArr[i3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 2016513714)).bp((byte) 30)) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 1;
            }
            return 1;
        }
    }

    static final void do(int i) {
        try {
            int i2;
            hn hnVar = client.dp.aa;
            hnVar.jl(-842886906);
            int jc = hnVar.jc(8, 2029389454);
            if (jc < client.dk * 1886016257) {
                for (i2 = jc; i2 < client.dk * 1886016257; i2++) {
                    int[] iArr = client.hr;
                    int i3 = client.hy - 1952034691;
                    client.hy = i3;
                    iArr[(i3 * -812537643) - 1] = client.dh[i2];
                }
            }
            if (jc > client.dk * 1886016257) {
                throw new RuntimeException("");
            }
            client.dk = 0;
            for (i2 = 0; i2 < jc; i2++) {
                int i4 = client.dh[i2];
                ft ftVar = client.cj[i4];
                int[] iArr2;
                int i5;
                if (hnVar.jc(1, 1556297942) == 0) {
                    iArr2 = client.dh;
                    i5 = client.dk - 612455167;
                    client.dk = i5;
                    iArr2[(i5 * 1886016257) - 1] = i4;
                    ftVar.db = client.af * -1904053401;
                } else {
                    int jc2 = hnVar.jc(2, 1731601766);
                    int[] iArr3;
                    if (jc2 == 0) {
                        iArr2 = client.dh;
                        i5 = client.dk - 612455167;
                        client.dk = i5;
                        iArr2[(i5 * 1886016257) - 1] = i4;
                        ftVar.db = client.af * -1904053401;
                        iArr3 = client.dl;
                        jc2 = client.db - 872650929;
                        client.db = jc2;
                        iArr3[(jc2 * 1194086319) - 1] = i4;
                    } else if (jc2 == 1) {
                        iArr2 = client.dh;
                        i5 = client.dk - 612455167;
                        client.dk = i5;
                        iArr2[(i5 * 1886016257) - 1] = i4;
                        ftVar.db = client.af * -1904053401;
                        ftVar.aj(hnVar.jc(3, 2025322110), (byte) 1, (byte) -1);
                        if (1 == hnVar.jc(1, 1970504195)) {
                            iArr3 = client.dl;
                            jc2 = client.db - 872650929;
                            client.db = jc2;
                            iArr3[(jc2 * 1194086319) - 1] = i4;
                        }
                    } else if (2 == jc2) {
                        iArr2 = client.dh;
                        i5 = client.dk - 612455167;
                        client.dk = i5;
                        iArr2[(i5 * 1886016257) - 1] = i4;
                        ftVar.db = client.af * -1904053401;
                        ftVar.aj(hnVar.jc(3, 2096825202), (byte) 2, (byte) -1);
                        ftVar.aj(hnVar.jc(3, 2090419971), (byte) 2, (byte) -1);
                        if (hnVar.jc(1, 1512841214) == 1) {
                            iArr3 = client.dl;
                            jc2 = client.db - 872650929;
                            client.db = jc2;
                            iArr3[(jc2 * 1194086319) - 1] = i4;
                        }
                    } else if (3 == jc2) {
                        iArr3 = client.hr;
                        jc2 = client.hy - 1952034691;
                        client.hy = jc2;
                        iArr3[(jc2 * -812537643) - 1] = i4;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ai.do(" + ')');
        }
    }

    public static final boolean dn(int i, int i2) {
        try {
            return ci.el.br(-2005147175 * lw.hn, i & 127, (i >> 7) & 127, i) >= 0;
        } catch (Throwable e) {
            throw ei.ac(e, "ai.dn(" + ')');
        }
    }
}
