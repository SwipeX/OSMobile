package defpackage;

public class bt {
    public static final int ak = -1;
    static final int aq = 100;
    static final int au = 21;
    static em em;
    static ed lw;
    public int ac;
    public int aj;
    public int an;

    public bt() {
        try {
            this.aj = -16755067;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.<init>(" + ')');
        }
    }

    public bt(int i, int i2, int i3) {
        try {
            this.aj = 16755067 * i;
            this.ac = -191094751 * i2;
            this.an = -224533891 * i3;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.<init>(" + ')');
        }
    }

    public bt(bt btVar) {
        try {
            this.aj = btVar.aj * 1;
            this.ac = btVar.ac * 1;
            this.an = btVar.an * 1;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.<init>(" + ')');
        }
    }

    public bt(int i) {
        try {
            if (-1 == i) {
                this.aj = -16755067;
                return;
            }
            this.aj = 16755067 * ((i >> 28) & 3);
            this.ac = ((i >> 14) & 16383) * -191094751;
            this.an = -224533891 * (i & 16383);
        } catch (Throwable e) {
            throw ei.ac(e, "bt.<init>(" + ')');
        }
    }

    public void aa(int i, int i2, int i3) {
        this.aj = -2091369795 * i;
        this.ac = -191094751 * i2;
        this.an = 734919776 * i3;
    }

    public void aj(int i, int i2, int i3, int i4) {
        try {
            this.aj = 16755067 * i;
            this.ac = -191094751 * i2;
            this.an = -224533891 * i3;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.aj(" + ')');
        }
    }

    public void ak(int i, int i2, int i3) {
        this.aj = 16755067 * i;
        this.ac = -191094751 * i2;
        this.an = -224533891 * i3;
    }

    public void ao(int i, int i2, int i3) {
        this.aj = 16755067 * i;
        this.ac = -191094751 * i2;
        this.an = -224533891 * i3;
    }

    public void aq(int i, int i2, int i3) {
        this.aj = 16755067 * i;
        this.ac = -191094751 * i2;
        this.an = -224533891 * i3;
    }

    public int ac(int i) {
        try {
            return (((this.aj * -201339469) << 28) | ((-486841375 * this.ac) << 14)) | (this.an * -1974196523);
        } catch (Throwable e) {
            throw ei.ac(e, "bt.ac(" + ')');
        }
    }

    public int ah() {
        return (((this.aj * -201339469) << 28) | ((-486841375 * this.ac) << 14)) | (this.an * -1974196523);
    }

    public int ap() {
        return (((this.aj * -201339469) << 28) | ((-486841375 * this.ac) << 14)) | (this.an * -1974196523);
    }

    public int at() {
        return (((this.aj * -201339469) << 28) | ((-486841375 * this.ac) << 14)) | (this.an * -1974196523);
    }

    public boolean db(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bt) {
            return an((bt) obj, -1319370395);
        }
        return false;
    }

    public boolean dh(Object obj) {
        if (this == obj) {
            return true;
        }
        return !(obj instanceof bt) ? false : an((bt) obj, -1319370395);
    }

    public boolean dk(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bt) {
            return an((bt) obj, -1319370395);
        }
        return false;
    }

    public boolean dl(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bt) {
            return an((bt) obj, -1319370395);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof bt) {
                return an((bt) obj, -1319370395);
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.equals(" + ')');
        }
    }

    boolean ae(bt btVar) {
        if (btVar.aj * -201339469 != this.aj * -201339469) {
            return false;
        }
        if (this.ac * -486841375 != btVar.ac * -486841375) {
            return false;
        }
        if (this.an * -1974196523 == btVar.an * -1974196523) {
            return true;
        }
        return false;
    }

    boolean ai(bt btVar) {
        if (btVar.aj * -201339469 != this.aj * -201339469) {
            return false;
        }
        if (this.ac * -486841375 != btVar.ac * -486841375) {
            return false;
        }
        if (this.an * -1974196523 != btVar.an * -1974196523) {
            return false;
        }
        return true;
    }

    boolean am(bt btVar) {
        if (btVar.aj * -201339469 == this.aj * -201339469 && this.ac * -486841375 == btVar.ac * -486841375 && this.an * -1974196523 == btVar.an * -1974196523) {
            return true;
        }
        return false;
    }

    boolean an(bt btVar, int i) {
        try {
            if (btVar.aj * -201339469 == this.aj * -201339469 && this.ac * -486841375 == btVar.ac * -486841375 && this.an * -1974196523 == btVar.an * -1974196523) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "bt.an(" + ')');
        }
    }

    boolean aw(bt btVar) {
        if (-988811982 * btVar.aj != -1212377091 * this.aj || this.ac * -486841375 != btVar.ac * -486841375) {
            return false;
        }
        if (-187432429 * this.an != btVar.an * -1854578236) {
            return false;
        }
        return true;
    }

    public int de() {
        return ac(-388472700);
    }

    public int dx() {
        return ac(-1256359056);
    }

    public int hashCode() {
        try {
            return ac(194235196);
        } catch (Throwable e) {
            throw ei.ac(e, "bt.hashCode(" + ')');
        }
    }

    public String dd() {
        return (this.aj * -201339469) + "," + ((this.ac * -486841375) >> 6) + "," + ((this.an * -1974196523) >> 6) + "," + ((this.ac * -486841375) & 63) + "," + ((this.an * -1974196523) & 63);
    }

    public String dp() {
        return (this.aj * -201339469) + "," + ((this.ac * -486841375) >> 6) + "," + ((this.an * -1974196523) >> 6) + "," + ((this.ac * -486841375) & 63) + "," + ((this.an * -1974196523) & 63);
    }

    public String dr() {
        return (this.aj * -201339469) + "," + ((this.ac * -486841375) >> 6) + "," + ((this.an * -1974196523) >> 6) + "," + ((this.ac * -486841375) & 63) + "," + ((this.an * -1974196523) & 63);
    }

    public String ds() {
        return (this.aj * -201339469) + "," + ((this.ac * -486841375) >> 6) + "," + ((this.an * -1974196523) >> 6) + "," + ((this.ac * -486841375) & 63) + "," + ((this.an * -1974196523) & 63);
    }

    public String toString() {
        try {
            return (this.aj * -201339469) + "," + ((this.ac * -486841375) >> 6) + "," + ((this.an * -1974196523) >> 6) + "," + ((this.ac * -486841375) & 63) + "," + ((this.an * -1974196523) & 63);
        } catch (Throwable e) {
            throw ei.ac(e, "bt.toString(" + ')');
        }
    }

    static int az(int i, fs fsVar, boolean z, int i2) {
        boolean z2 = false;
        String[] strArr;
        int i3;
        if (3100 == i) {
            try {
                strArr = gr.at;
                i3 = di.ah - 436804489;
                di.ah = i3;
                cw.ac(0, "", strArr[i3 * 1894369977], -1951393810);
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "bt.az(" + ')');
            }
        } else if (i == 3101) {
            dy.ap -= -803849934;
            lp.bk(cx.hb, gr.ak[dy.ap * -38307927], gr.ak[(dy.ap * -38307927) + 1], 1246836931);
            return 1;
        } else if (3103 == i) {
            client.dp.an(hd.ac(mr.cu, client.dp.ao, (byte) 28), 53098331);
            fr frVar = (fr) client.ic.aq();
            while (frVar != null) {
                if (frVar.ac * -422803739 == 0 || frVar.ac * -422803739 == 3) {
                    cm.fi(frVar, true, (byte) -97);
                }
                frVar = (fr) client.ic.ao();
            }
            if (client.iz == null) {
                return 1;
            }
            cf.ew(client.iz, (byte) -82);
            client.iz = null;
            return 1;
        } else if (i == 3104) {
            int ac;
            strArr = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            Object obj = strArr[i3 * 1894369977];
            int length = obj.length();
            r0 = 0;
            i3 = 0;
            r3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = obj.charAt(i4);
                if (i4 == 0) {
                    if ('-' == charAt) {
                        r3 = 1;
                    } else if ('+' == charAt) {
                        continue;
                    }
                }
                if (charAt >= '0' && charAt <= '9') {
                    i3 = charAt - 48;
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    i3 = charAt - 55;
                } else if (charAt < 'a' || charAt > 'z') {
                    i3 = 0;
                    break;
                } else {
                    i3 = charAt - 87;
                }
                if (i3 >= 10) {
                    i3 = 0;
                    break;
                }
                if (r3 != 0) {
                    i3 = -i3;
                }
                i3 += r0 * 10;
                if (r0 != i3 / 10) {
                    i3 = 0;
                    break;
                }
                r0 = i3;
                i3 = 1;
            }
            if (i3 != 0) {
                ac = fm.ac(obj, -247311830);
            }
            mg ac2 = hd.ac(mr.cw, client.dp.ao, (byte) 93);
            ac2.an.aa(ac, -1939349094);
            client.dp.an(ac2, 2118129767);
            return 1;
        } else if (3105 == i) {
            strArr = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = strArr[i3 * 1894369977];
            r1 = hd.ac(mr.cx, client.dp.ao, (byte) 65);
            r1.an.an(r0.length() + 1, (byte) -71);
            r1.an.ai(r0, 1243293598);
            client.dp.an(r1, 89021298);
            return 1;
        } else if (3106 == i) {
            strArr = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r0 = strArr[i3 * 1894369977];
            r1 = hd.ac(mr.bk, client.dp.ao, (byte) -23);
            r1.an.an(r0.length() + 1, (byte) -14);
            r1.an.ai(r0, 1371670831);
            client.dp.an(r1, 1133904525);
            return 1;
        } else if (3107 == i) {
            r0 = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = r0[i3 * -38307927];
            String[] strArr2 = gr.at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            ag.dg(r0, strArr2[r3 * 1894369977], 1748126739);
            return 1;
        } else if (i == 3108) {
            dy.ap -= -1205774901;
            bn.ee(ac.aj(gr.ak[(dy.ap * -38307927) + 2], 2004487642), gr.ak[dy.ap * -38307927], gr.ak[(dy.ap * -38307927) + 1], (byte) 82);
            return 1;
        } else if (3109 == i) {
            dy.ap -= -803849934;
            bn.ee(z ? client.ae : ef.am, gr.ak[dy.ap * -38307927], gr.ak[(dy.ap * -38307927) + 1], (byte) 84);
            return 1;
        } else if (i == 3110) {
            r0 = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            if (r0[i3 * -38307927] == 1) {
                z2 = true;
            }
            gd.bs = z2;
            return 1;
        } else if (3111 == i) {
            r0 = gr.ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            if (ae.nv.an) {
                z2 = true;
            }
            r0[i3] = z2;
            return 1;
        } else if (3112 == i) {
            fk fkVar = ae.nv;
            r1 = gr.ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (r1[r3 * -38307927] == 1) {
                z2 = true;
            }
            fkVar.an = z2;
            et.an(-45025610);
            return 1;
        } else if (i == 3113) {
            strArr = gr.at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            r1 = strArr[i3 * 1894369977];
            r0 = gr.ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (r0[r3 * -38307927] == 1) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            if (r0 == 0) {
                jg.aj(r1, 3, 1957414084);
                return 1;
            } else if (ki.aj.startsWith("win")) {
                jg.aj(r1, 0, 2033722099);
                return 1;
            } else if (ki.aj.startsWith("mac")) {
                cx.ac(r1, 1, "openjs", (byte) 0);
                return 1;
            } else {
                jg.aj(r1, 2, 1999642971);
                return 1;
            }
        } else if (i == 3115) {
            r0 = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = r0[i3 * -38307927];
            r1 = hd.ac(mr.at, client.dp.ao, (byte) 29);
            r1.an.aq(r0, 1749411591);
            client.dp.an(r1, 1006481437);
            return 1;
        } else if (i == 3116) {
            r0 = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            r0 = r0[i3 * -38307927];
            di.ah -= 873608978;
            r1 = gr.at[di.ah * 1894369977];
            String str = gr.at[(di.ah * 1894369977) + 1];
            if (r1.length() > 500 || str.length() > 500) {
                return 1;
            }
            mg ac3 = hd.ac(mr.aj, client.dp.ao, (byte) 7);
            ac3.an.aq((cx.ah(r1, 1553993037) + 1) + cx.ah(str, 131916790), -1838851054);
            ac3.an.ai(r1, -1492584198);
            ac3.an.ai(str, 758835365);
            ac3.an.be(r0, (byte) 117);
            client.dp.an(ac3, 1148309414);
            return 1;
        } else if (i != 3117) {
            return 2;
        } else {
            hu huVar = dj.hs;
            r1 = gr.ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (r1[r3 * -38307927] == 1) {
                z2 = true;
            }
            huVar.cb(z2, 41891669);
            return 1;
        }
    }
}
