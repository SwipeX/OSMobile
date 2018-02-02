package defpackage;

import com.jagex.oldscape.osrenderer.aj;
import com.jagex.oldscape.osrenderer.zv;

public class ba extends bl {
    static final int ac = 128;
    static final int aj = 2048;
    static final int an = 16;
    static in me;
    boolean aa;
    bo ao;
    final bk aq;

    public ba(bk bkVar) {
        try {
            this.aa = true;
            this.aq = bkVar;
            this.af = bkVar.ac(-390190233) * 1179423413;
            this.au = bkVar.an(-2081919110) * 903407081;
        } catch (Throwable e) {
            throw ei.ac(e, "ba.<init>(" + ')');
        }
    }

    public void ah() {
        if (!aj.ao((byte) 8)) {
            this.aa = true;
        }
        if (this.aa && zv.se()) {
            if (bn.aj == null) {
                bn.aj = new bn();
            }
            if (bn.aj.aq(by.ae, 639303975)) {
                this.aa = false;
                if (bn.aj == null) {
                    bn.aj = new bn();
                }
                bn.aj.aj(981692627);
            }
        }
        if (bn.aj == null) {
            bn.aj = new bn();
        }
        bn.aj.ao(by.ae, 1974783144);
        this.ao = this.aq.aj(995208257);
        this.af = this.aq.ac(-1826076907) * 1179423413;
        this.au = this.aq.an(-1648093824) * 903407081;
        zv.nc();
        if (bn.aj == null) {
            bn.aj = new bn();
        }
        bn.aj.ao = zv.fg() * 1183441174506982763L;
    }

    public void ai() {
        if (!aj.ao((byte) 8)) {
            this.aa = true;
        }
        if (this.aa && zv.se()) {
            if (bn.aj == null) {
                bn.aj = new bn();
            }
            if (bn.aj.aq(by.ae, -195536952)) {
                this.aa = false;
                if (bn.aj == null) {
                    bn.aj = new bn();
                }
                bn.aj.aj(981692627);
            }
        }
        if (bn.aj == null) {
            bn.aj = new bn();
        }
        bn.aj.ao(by.ae, -1586813799);
        this.ao = this.aq.aj(995208257);
        this.af = this.aq.ac(121505691) * 1179423413;
        this.au = this.aq.an(-1682526498) * 903407081;
        zv.nc();
        if (bn.aj == null) {
            bn.aj = new bn();
        }
        bn.aj.ao = zv.fg() * 1183441174506982763L;
    }

    public void aj(byte b) {
        try {
            if (!aj.ao((byte) 8)) {
                this.aa = true;
            }
            if (this.aa && zv.se()) {
                if (bn.aj == null) {
                    bn.aj = new bn();
                }
                if (bn.aj.aq(by.ae, -782284555)) {
                    this.aa = false;
                    if (bn.aj == null) {
                        bn.aj = new bn();
                    }
                    bn.aj.aj(981692627);
                }
            }
            if (bn.aj == null) {
                bn.aj = new bn();
            }
            bn.aj.ao(by.ae, -47685771);
            this.ao = this.aq.aj(995208257);
            this.af = this.aq.ac(-704423045) * 1179423413;
            this.au = this.aq.an(-2136951958) * 903407081;
            zv.nc();
            if (bn.aj == null) {
                bn.aj = new bn();
            }
            bn.aj.ao = zv.fg() * 1183441174506982763L;
        } catch (Throwable e) {
            throw ei.ac(e, "ba.aj(" + ')');
        }
    }

    void ac(int i, int i2, int i3, int i4, int i5) {
        try {
            super.ac(i, i2, i3, i4, 80091199);
            this.ao.aj(i, i2, i3 - i, i4 - i2, -2003013936);
        } catch (Throwable e) {
            throw ei.ac(e, "ba.ac(" + ')');
        }
    }

    void ae(int i, int i2, int i3, int i4) {
        super.ac(i, i2, i3, i4, 1910474271);
        this.ao.aj(i, i2, i3 - i, i4 - i2, -1729936987);
    }

    void am(int i, int i2, int i3, int i4) {
        super.ac(i, i2, i3, i4, -934314895);
        this.ao.aj(i, i2, i3 - i, i4 - i2, -2113820077);
    }

    void aw(int i, int i2, int i3, int i4) {
        super.ac(i, i2, i3, i4, -1499853489);
        this.ao.aj(i, i2, i3 - i, i4 - i2, -1970779376);
    }

    public void al(int i) {
        super.an(i, -808845899);
        zv.pe(i);
    }

    public void an(int i, int i2) {
        try {
            super.an(i, -669251384);
            zv.pe(i);
        } catch (Throwable e) {
            throw ei.ac(e, "ba.an(" + ')');
        }
    }

    public void as(int i) {
        super.an(i, -680746906);
        zv.pe(i);
    }

    public void az(int i) {
        super.an(i, -835415082);
        zv.pe(i);
    }

    final void aq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        try {
            int i15;
            if (-1029352189 * this.bh == 0) {
                i15 = 255;
            } else {
                i15 = this.bh * -1029352189;
            }
            short s = (short) ((i15 << 8) | 255);
            zv.ro((short) i4, (short) i, (short) i7, (short) i13, (short) i10, s, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, s, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, s, (short) 0, (short) 0);
        } catch (Throwable e) {
            throw ei.ac(e, "ba.aq(" + ')');
        }
    }

    final void ax(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        if (-1029352189 * this.bh == 0) {
            i14 = 255;
        } else {
            i14 = this.bh * -1029352189;
        }
        short s = (short) ((i14 << 8) | 255);
        zv.ro((short) i4, (short) i, (short) i7, (short) i13, (short) i10, s, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, s, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, s, (short) 0, (short) 0);
    }

    final void af(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, -678641674);
    }

    final void ao(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
        try {
            aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, 726956997);
        } catch (Throwable e) {
            throw ei.ac(e, "ba.ao(" + ')');
        }
    }

    final void au(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, -1534986621);
    }

    final void aa(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, -431509700);
        } catch (Throwable e) {
            throw ei.ac(e, "ba.aa(" + ')');
        }
    }

    final void av(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, 530841149);
    }

    final void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        aq(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, -1445256381);
    }

    static final short ab(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short ad(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short ag(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short ar(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short bh(float f, float f2, int i, int i2) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    static final short bm(float f, float f2, int i, int i2) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    static final short bp(float f, float f2, int i, int i2) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    final void at(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13, byte b) {
        try {
            if (by.ae.an(i13, (byte) 16) == null) {
                int aq = by.ae.aq(i13, -2111984576);
                ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i10, -2042334491), lq.bq(aq, i11, -2057331733), lq.bq(aq, i12, -1946788141), (byte) 60);
                return;
            }
            short s = (short) (((this.bh * -1029352189 == 0 ? 255 : this.bh * -1029352189) << 8) | 255);
            int min = Math.min(Math.max(i10, 2), 126) + 1024;
            int min2 = Math.min(Math.max(i11, 2), 126) + 1024;
            int min3 = Math.min(Math.max(i12, 2), 126) + 1024;
            int i14 = i7 == 1 ? 1 : 411538491 * this.bt;
            short ak = gv.ak(i13, 1337060429);
            int i15 = ((ck) by.ae).aj(i13, -552947870).am / 2;
            int i16 = ((ck) by.ae).aj(i13, -552947870).ae / 2;
            zv.ro((short) i4, (short) i, (short) i7, (short) i14, (short) min, s, ak, dy.ap(f, f4, i15, i16, -1716851372), (short) i5, (short) i2, (short) i8, (short) i14, (short) min2, s, ak, dy.ap(f2, f5, i15, i16, 1070414793), (short) i6, (short) i3, (short) i9, (short) i14, (short) min3, s, ak, dy.ap(f3, f6, i15, i16, -1331769979));
        } catch (Throwable e) {
            throw ei.ac(e, "ba.at(" + ')');
        }
    }

    final void br(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13) {
        if (by.ae.an(i13, (byte) 16) == null) {
            int aq = by.ae.aq(i13, -715782115);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i10, -1935049514), lq.bq(aq, i11, -1946594155), lq.bq(aq, i12, -1992932993), (byte) 23);
            return;
        }
        int i14;
        if (this.bh * -645115369 == 0) {
            aq = -86711696;
        } else {
            aq = this.bh * -1029352189;
        }
        short s = (short) ((aq << 8) | 255);
        int min = Math.min(Math.max(i10, 2), 126) + 1024;
        int min2 = Math.min(Math.max(i11, 2), 126) + 1024;
        int min3 = -596924298 + Math.min(Math.max(i12, 2), 126);
        if (i7 == 1) {
            i14 = 1;
        } else {
            i14 = 1455574539 * this.bt;
        }
        short ak = gv.ak(i13, 1749355635);
        int i15 = ((ck) by.ae).aj(i13, -552947870).am / 2;
        int i16 = ((ck) by.ae).aj(i13, -552947870).ae / 2;
        zv.ro((short) i4, (short) i, (short) i7, (short) i14, (short) min, s, ak, dy.ap(f, f4, i15, i16, 2018476210), (short) i5, (short) i2, (short) i8, (short) i14, (short) min2, s, ak, dy.ap(f2, f5, i15, i16, -1736433751), (short) i6, (short) i3, (short) i9, (short) i14, (short) min3, s, ak, dy.ap(f3, f6, i15, i16, 638309986));
    }

    final void bt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, float f2, float f3, float f4, float f5, float f6, int i13) {
        if (by.ae.an(i13, (byte) 16) == null) {
            int aq = by.ae.aq(i13, 68619921);
            ao(i, i2, i3, i4, i5, i6, lq.bq(aq, i10, -1943940688), lq.bq(aq, i11, -2145464746), lq.bq(aq, i12, -1908622378), (byte) -76);
            return;
        }
        int i14;
        if (this.bh * -1946844255 == 0) {
            aq = -1842972488;
        } else {
            aq = this.bh * -572640951;
        }
        short s = (short) ((aq << 8) | -1030711932);
        int min = Math.min(Math.max(i10, 2), -1447114426) + 1024;
        int min2 = -2117471970 + Math.min(Math.max(i11, 2), 126);
        int min3 = Math.min(Math.max(i12, 2), -724538002) + 1024;
        if (i7 == 1) {
            i14 = 1;
        } else {
            i14 = 311215832 * this.bt;
        }
        short ak = gv.ak(i13, 1626329279);
        int i15 = ((ck) by.ae).aj(i13, -552947870).am / 2;
        int i16 = ((ck) by.ae).aj(i13, -552947870).ae / 2;
        zv.ro((short) i4, (short) i, (short) i7, (short) i14, (short) min, s, ak, dy.ap(f, f4, i15, i16, -555474374), (short) i5, (short) i2, (short) i8, (short) i14, (short) min2, s, ak, dy.ap(f2, f5, i15, i16, -1600950314), (short) i6, (short) i3, (short) i9, (short) i14, (short) min3, s, ak, dy.ap(f3, f6, i15, i16, -890057504));
    }

    static final void ck(fx fxVar, int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            es aj = client.ac.qc.aj((byte) -35);
            if (fxVar != null && fxVar.an(-1658453089)) {
                ay ayVar;
                em aa;
                em ao;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                if (fxVar instanceof ft) {
                    ayVar = ((ft) fxVar).aj;
                    if (ayVar.br != null) {
                        ayVar = ayVar.ak((byte) 81);
                    }
                    if (ayVar == null) {
                        return;
                    }
                }
                int i15 = -2089377233 * fu.aa;
                int[] iArr = fu.ak;
                int i16 = 3;
                if (!fxVar.cc.at()) {
                    ch.ci(fxVar, (-1647506717 * fxVar.dl) + 15, 612946667);
                    gb gbVar = (gb) fxVar.cc.aa();
                    while (gbVar != null) {
                        fa ac = gbVar.ac(client.af * 901275591, 1723303565);
                        if (ac != null) {
                            as asVar = gbVar.an;
                            aa = asVar.aa(1878343546);
                            ao = asVar.ao(297700412);
                            i6 = 0;
                            if (aa == null || ao == null) {
                                i7 = 0;
                                i8 = -1268310507 * asVar.as;
                            } else {
                                if (asVar.al * 202852658 < ao.ac) {
                                    i6 = 101426329 * asVar.al;
                                }
                                i7 = i6;
                                i8 = ao.ac - (i6 * 2);
                            }
                            i9 = 255;
                            i6 = (client.af * 901275591) - (ac.aj * 2031438945);
                            i10 = ((2089429821 * ac.an) * i8) / (-1268310507 * asVar.as);
                            if (ac.aq * 1469466053 > i6) {
                                if (asVar.ai * -717634511 == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = (i6 / (asVar.ai * -717634511)) * (-717634511 * asVar.ai);
                                }
                                i11 = ((ac.ac * 744987285) * i8) / (asVar.as * -1268310507);
                                i6 = ((i6 * (i10 - i11)) / (ac.aq * 1469466053)) + i11;
                            } else {
                                i6 = ((asVar.aw * -2071028151) + (ac.aq * 1469466053)) - i6;
                                if (377625229 * asVar.ah >= 0) {
                                    i9 = (i6 << 8) / ((asVar.aw * -2071028151) - (asVar.ah * 377625229));
                                    i6 = i10;
                                } else {
                                    i6 = i10;
                                }
                            }
                            if (ac.an * 2089429821 <= 0 || i6 >= 1) {
                                i12 = i6;
                            } else {
                                i12 = 1;
                            }
                            i6 = ((client.gz * -1676064909) + i2) - (i8 >> 1);
                            i10 = ((client.gp * 1657499755) + i3) - i16;
                            if (aa == null || ao == null) {
                                if (client.gz * -1676064909 > -1) {
                                    aj.aq(i6, i10, i12, 5, 65280, (byte) 61);
                                    aj.aq(i6 + i12, i10, i8 - i12, 5, 16711680, (byte) 38);
                                }
                                i13 = i16 + 7;
                            } else {
                                i6 -= i7;
                                if (i12 == i8) {
                                    i14 = (i7 * 2) + i12;
                                } else {
                                    i14 = i7 + i12;
                                }
                                i11 = aa.an;
                                int i17 = i16 + i11;
                                if (i9 < 0 || i9 >= 255) {
                                    aj.ax(aa, i6, i10, 1231133277);
                                    aj.fi(i6, i10, i14 + i6, i10 + i11, (byte) 31);
                                    aj.ax(ao, i6, i10, 1231133277);
                                } else {
                                    aj.ad(aa, i6, i10, i9, -237391815);
                                    aj.fi(i6, i10, i6 + i14, i11 + i10, (byte) 72);
                                    aj.ad(ao, i6, i10, i9, -1751687231);
                                }
                                aj.fj(i2, i3, i2 + i4, i5 + i3, -1597560613);
                                i13 = i17 + 2;
                            }
                            i6 = i13;
                        } else {
                            if (gbVar.an(-2092282049)) {
                                gbVar.kn();
                            }
                            i6 = i16;
                        }
                        gbVar = (gb) fxVar.cc.ap();
                        i16 = i6;
                    }
                }
                i6 = i16;
                if (i6 < 30) {
                    i6 = 30;
                }
                if (i < i15) {
                    ff ffVar = (ff) fxVar;
                    if (!ffVar.ag) {
                        if (!(-1 == 1714751015 * ffVar.aq && -1 == ffVar.ao * -414334269)) {
                            ch.ci(fxVar, (fxVar.dl * -1647506717) + 15, -2081987299);
                            if (-1676064909 * client.gz > -1) {
                                if (ffVar.aq * 1714751015 != -1) {
                                    aj.ax(hm.eg[1714751015 * ffVar.aq], ((-1676064909 * client.gz) + i2) - 12, ((client.gp * 1657499755) + i3) - i6, 1231133277);
                                    i6 += 25;
                                }
                                if (-1 != -414334269 * ffVar.ao) {
                                    aj.ax(ec.eo[ffVar.ao * -414334269], ((-1676064909 * client.gz) + i2) - 12, ((1657499755 * client.gp) + i3) - i6, 1231133277);
                                    i6 += 25;
                                }
                            }
                        }
                        if (i >= 0 && 10 == client.bt * -398330237 && iArr[i] == client.bb * 378871433) {
                            ch.ci(fxVar, (-1647506717 * fxVar.dl) + 15, -317722614);
                            if (-1676064909 * client.gz > -1) {
                                aj.ax(cb.en[1], ((client.gz * -1676064909) + i2) - 12, ((1657499755 * client.gp) + i3) - i6, 1231133277);
                            }
                        }
                    } else {
                        return;
                    }
                }
                ayVar = ((ft) fxVar).aj;
                if (ayVar.br != null) {
                    ayVar = ayVar.ak((byte) 76);
                }
                if (ayVar.bh * -250879023 >= 0 && ayVar.bh * -250879023 < ec.eo.length) {
                    ch.ci(fxVar, (fxVar.dl * -1647506717) + 15, 1616102715);
                    if (-1676064909 * client.gz > -1) {
                        aj.ax(ec.eo[ayVar.bh * -250879023], ((-1676064909 * client.gz) + i2) - 12, ((1657499755 * client.gp) + i3) - 30, 1231133277);
                    }
                }
                if (1 == -398330237 * client.bt && client.dh[i - i15] == client.br * -2134333969 && (901275591 * client.af) % 20 < 10) {
                    ch.ci(fxVar, (fxVar.dl * -1647506717) + 15, -1221499176);
                    if (client.gz * -1676064909 > -1) {
                        aj.ax(cb.en[0], ((client.gz * -1676064909) + i2) - 12, ((1657499755 * client.gp) + i3) - 28, 1231133277);
                    }
                }
                if (fxVar.ba != null && (i >= i15 || (!fxVar.be && (client.lq * 509205101 == 4 || (!fxVar.bv && (client.lq * 509205101 == 0 || client.lq * 509205101 == 3 || (509205101 * client.lq == 1 && ((ff) fxVar).ac(-1517415408)))))))) {
                    ch.ci(fxVar, -1647506717 * fxVar.dl, -1518036085);
                    if (-1676064909 * client.gz > -1 && client.gh * -175332337 < client.gr * 1690906917) {
                        client.gk[-175332337 * client.gh] = be.do.aq(fxVar.ba) / 2;
                        client.gu[-175332337 * client.gh] = be.do.ak;
                        client.gb[-175332337 * client.gh] = client.gz * -1676064909;
                        client.ga[client.gh * -175332337] = client.gp * 1657499755;
                        client.gd[-175332337 * client.gh] = fxVar.bn * -1705698065;
                        client.gt[-175332337 * client.gh] = -380507443 * fxVar.bg;
                        client.ge[client.gh * -175332337] = fxVar.bw * 2044351941;
                        client.gw[-175332337 * client.gh] = fxVar.ba;
                        client.gh -= 1462646033;
                    }
                }
                for (int i18 = 0; i18 < 4; i18++) {
                    i10 = fxVar.cy[i18];
                    aq aqVar;
                    aq ac2;
                    aq ao2;
                    int i19;
                    int i20;
                    em ap;
                    int i21;
                    int i22;
                    int i23;
                    em at;
                    int i24;
                    int i25;
                    em ah;
                    int i26;
                    int i27;
                    em ak;
                    em ap2;
                    em ah2;
                    int i28;
                    int i29;
                    int i30;
                    int i31;
                    int i32;
                    int i33;
                    int i34;
                    int i35;
                    em emVar;
                    em emVar2;
                    em emVar3;
                    em emVar4;
                    kh ai;
                    kh khVar;
                    kh khVar2;
                    String aa2;
                    String aa3;
                    String str;
                    int i36;
                    int i37;
                    int i38;
                    int i39;
                    int i40;
                    if (fxVar.bf[i18] >= 0) {
                        if (i10 > 901275591 * client.af) {
                            aq ac3 = gq.ac(fxVar.bf[i18], 1390184516);
                            i13 = -542472953 * ac3.ae;
                            if (!(ac3 == null || ac3.ad == null)) {
                                ac3 = ac3.ao(314704163);
                                if (ac3 == null) {
                                    fxVar.cy[i18] = -1;
                                }
                            }
                            aqVar = ac3;
                            i6 = i13;
                            i9 = fxVar.cl[i18];
                            if (i9 < 0) {
                                ac2 = gq.ac(i9, 1342077725);
                                ao2 = (ac2 != null || ac2.ad == null) ? ac2 : ac2.ao(-1185517104);
                            } else {
                                ao2 = null;
                            }
                            if (i10 - i6 > 901275591 * client.af) {
                                if (aqVar != null) {
                                    fxVar.cy[i18] = -1;
                                } else {
                                    ch.ci(fxVar, (fxVar.dl * -1647506717) / 2, -1816842005);
                                    if (client.gz * -1676064909 <= -1) {
                                        if (i18 == 1) {
                                            client.gp -= -1560103620;
                                        }
                                        if (2 == i18) {
                                            client.gz -= 215557621;
                                            client.gp -= 1367431838;
                                        }
                                        if (i18 == 3) {
                                            client.gz += 215557621;
                                            client.gp -= 1367431838;
                                        }
                                        i19 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        i12 = 0;
                                        i11 = 0;
                                        i14 = 0;
                                        i7 = 0;
                                        i10 = 0;
                                        aa = aqVar.ak(-824208126);
                                        if (aa == null) {
                                            i19 = aa.ac;
                                            i6 = aa.an;
                                            if (i6 <= 0) {
                                                i6 = 0;
                                            }
                                            i20 = aa.aq;
                                            i10 = i6;
                                        } else {
                                            i20 = 0;
                                        }
                                        ap = aqVar.ap((byte) 46);
                                        if (ap == null) {
                                            i21 = ap.ac;
                                            i6 = ap.an;
                                            if (i6 <= i10) {
                                                i6 = i10;
                                            }
                                            i22 = ap.aq;
                                            i23 = i21;
                                            i10 = i6;
                                        } else {
                                            i22 = 0;
                                            i23 = 0;
                                        }
                                        at = aqVar.at((byte) 38);
                                        if (at == null) {
                                            i24 = at.ac;
                                            i6 = at.an;
                                            if (i6 > i10) {
                                                i10 = i6;
                                            }
                                            i25 = at.aq;
                                            i21 = i24;
                                        } else {
                                            i25 = 0;
                                            i21 = 0;
                                        }
                                        ah = aqVar.ah(-2142871260);
                                        if (ah == null) {
                                            i26 = ah.ac;
                                            i6 = ah.an;
                                            if (i6 > i10) {
                                                i10 = i6;
                                            }
                                            i27 = ah.aq;
                                        } else {
                                            i27 = 0;
                                            i26 = 0;
                                        }
                                        if (ao2 == null) {
                                            ak = ao2.ak(-1782555916);
                                            if (ak != null) {
                                                i15 = ak.ac;
                                                i6 = ak.an;
                                                if (i6 <= i10) {
                                                    i6 = i10;
                                                }
                                                i11 = ak.aq;
                                                i10 = i6;
                                            }
                                            ap2 = ao2.ap((byte) 55);
                                            if (ap2 != null) {
                                                i16 = ap2.ac;
                                                i6 = ap2.an;
                                                if (i6 <= i10) {
                                                    i6 = i10;
                                                }
                                                i14 = ap2.aq;
                                                i10 = i6;
                                            }
                                            ao = ao2.at((byte) 26);
                                            if (ao != null) {
                                                i12 = ao.ac;
                                                i6 = ao.an;
                                                if (i6 > i10) {
                                                    i10 = i6;
                                                }
                                                i7 = ao.aq;
                                            }
                                            ah2 = ao2.ah(-2142871260);
                                            if (ah2 == null) {
                                                i9 = ah2.ac;
                                                i6 = ah2.an;
                                                if (i6 <= i10) {
                                                    i6 = i10;
                                                }
                                                i28 = i6;
                                                i29 = ah2.aq;
                                                i30 = i7;
                                                i31 = i14;
                                                i32 = i11;
                                                i33 = i9;
                                                i24 = i12;
                                                i34 = i16;
                                                i35 = i15;
                                                emVar = ah2;
                                                emVar2 = ao;
                                                emVar3 = ap2;
                                                emVar4 = ak;
                                            } else {
                                                i28 = i10;
                                                i29 = 0;
                                                i30 = i7;
                                                i31 = i14;
                                                i32 = i11;
                                                i33 = 0;
                                                i24 = i12;
                                                i34 = i16;
                                                i35 = i15;
                                                emVar = ah2;
                                                emVar2 = ao;
                                                emVar3 = ap2;
                                                emVar4 = ak;
                                            }
                                        } else {
                                            i28 = i10;
                                            i29 = 0;
                                            i30 = 0;
                                            i31 = 0;
                                            i32 = 0;
                                            i33 = 0;
                                            i24 = 0;
                                            i34 = 0;
                                            i35 = 0;
                                            emVar = null;
                                            emVar2 = null;
                                            emVar3 = null;
                                            emVar4 = null;
                                        }
                                        ai = aqVar.ai((byte) 49);
                                        if (ai != null) {
                                            khVar = br.dq;
                                        } else {
                                            khVar = ai;
                                        }
                                        if (ao2 == null) {
                                            ai = ao2.ai((byte) 93);
                                            if (ai != null) {
                                                khVar2 = br.dq;
                                            } else {
                                                khVar2 = ai;
                                            }
                                        } else {
                                            khVar2 = br.dq;
                                        }
                                        i6 = 0;
                                        aa2 = aqVar.aa(fxVar.cb[i18], (byte) 0);
                                        i8 = khVar.aq(aa2);
                                        if (ao2 == null) {
                                            aa3 = ao2.aa(fxVar.co[i18], (byte) 0);
                                            i6 = khVar2.aq(aa3);
                                            str = aa3;
                                        } else {
                                            str = null;
                                        }
                                        if (i23 > 0) {
                                            i36 = 0;
                                        } else if (at == null || ah != null) {
                                            i36 = (i8 / i23) + 1;
                                        } else {
                                            i36 = 1;
                                        }
                                        if (ao2 != null || i34 <= 0) {
                                            i37 = 0;
                                        } else if (emVar2 == null && emVar == null) {
                                            i37 = 1;
                                        } else {
                                            i37 = (i6 / i34) + 1;
                                        }
                                        if (i19 <= 0) {
                                            i10 = 0 + i19;
                                        } else {
                                            i10 = 0;
                                        }
                                        i19 = i10 + 2;
                                        if (i21 <= 0) {
                                            i16 = i19 + i21;
                                        } else {
                                            i16 = i19;
                                        }
                                        if (i23 <= 0) {
                                            i10 = i36 * i23;
                                            i11 = i16 + i10;
                                            i12 = ((i10 - i8) / 2) + i16;
                                        } else {
                                            i11 = i16 + i8;
                                            i12 = i16;
                                        }
                                        if (i26 <= 0) {
                                            i10 = i11 + i26;
                                        } else {
                                            i10 = i11;
                                        }
                                        if (ao2 == null) {
                                            i15 = i10 + 2;
                                            if (i35 <= 0) {
                                                i10 = i15 + i35;
                                            } else {
                                                i10 = i15;
                                            }
                                            i9 = i10 + 2;
                                            if (i24 <= 0) {
                                                i10 = i9 + i24;
                                            } else {
                                                i10 = i9;
                                            }
                                            if (i34 <= 0) {
                                                i38 = i37 * i34;
                                                i8 = i10 + i38;
                                                i6 = ((i38 - i6) / 2) + i10;
                                            } else {
                                                i8 = i10 + i6;
                                                i6 = i10;
                                            }
                                            if (i33 <= 0) {
                                                i38 = i8 + i33;
                                                i33 = i6;
                                                i24 = i8;
                                                i35 = i10;
                                                i21 = i9;
                                                i39 = i15;
                                                i8 = i38;
                                            } else {
                                                i33 = i6;
                                                i24 = i8;
                                                i35 = i10;
                                                i21 = i9;
                                                i39 = i15;
                                            }
                                        } else {
                                            i33 = 0;
                                            i24 = 0;
                                            i35 = 0;
                                            i21 = 0;
                                            i39 = 0;
                                            i8 = i10;
                                        }
                                        i38 = fxVar.cy[i18] - (901275591 * client.af);
                                        i40 = (((-1676064909 * client.gz) + i2) - (i8 >> 1)) + ((aqVar.af * 2052382099) - (((2052382099 * aqVar.af) * i38) / (-542472953 * aqVar.ae)));
                                        i10 = ((((aqVar.au * 1695349607) * i38) / (aqVar.ae * -542472953)) + (-(aqVar.au * 1695349607))) + (((1657499755 * client.gp) + i3) - 12);
                                        i9 = i28 + i10;
                                        i8 = (137581049 * aqVar.ar) + (i10 + 15);
                                        i15 = i8 - khVar.ap;
                                        i6 = khVar.at + i8;
                                        if (i15 >= i10) {
                                            i15 = i10;
                                        }
                                        if (i6 <= i9) {
                                            i6 = i9;
                                        }
                                        i9 = 0;
                                        if (ao2 != null) {
                                            i9 = (137581049 * ao2.ar) + (i10 + 15);
                                            i28 = khVar2.at + i9;
                                            if (i9 - khVar2.ap >= i15) {
                                            }
                                            if (i28 > i6) {
                                                i26 = i9;
                                                i9 = 255;
                                                if (-1317893727 * aqVar.av >= 0) {
                                                    i9 = (i38 << 8) / ((aqVar.ae * -542472953) - (aqVar.av * -1317893727));
                                                }
                                                if (i9 >= 0 || i9 >= 255) {
                                                    if (aa != null) {
                                                        aj.ax(aa, (0 + i40) - i20, i10, 1231133277);
                                                    }
                                                    if (at != null) {
                                                        aj.ax(at, (i19 + i40) - i25, i10, 1231133277);
                                                    }
                                                    if (ap != null) {
                                                        for (i13 = 0; i13 < i36; i13++) {
                                                            aj.ax(ap, ((i40 + i16) - i22) + (i13 * i23), i10, 1231133277);
                                                        }
                                                    }
                                                    if (ah != null) {
                                                        aj.ax(ah, (i11 + i40) - i27, i10, 1231133277);
                                                    }
                                                    khVar.at(aa2, i40 + i12, i8, (aqVar.am * -192141833) | -16777216, 0, aj);
                                                    if (ao2 == null) {
                                                        if (emVar4 != null) {
                                                            aj.ax(emVar4, (i40 + i39) - i32, i10, 1231133277);
                                                        }
                                                        if (emVar2 != null) {
                                                            aj.ax(emVar2, (i21 + i40) - i30, i10, 1231133277);
                                                        }
                                                        if (emVar3 != null) {
                                                            for (i13 = 0; i13 < i37; i13++) {
                                                                aj.ax(emVar3, ((i40 + i35) - i31) + (i13 * i34), i10, 1231133277);
                                                            }
                                                        }
                                                        if (emVar != null) {
                                                            aj.ax(emVar, (i40 + i24) - i29, i10, 1231133277);
                                                        }
                                                        khVar2.at(str, i40 + i33, i26, (-192141833 * ao2.am) | -16777216, 0, aj);
                                                    }
                                                } else {
                                                    if (aa != null) {
                                                        aj.ad(aa, (0 + i40) - i20, i10, i9, -1534222776);
                                                    }
                                                    if (at != null) {
                                                        aj.ad(at, (i19 + i40) - i25, i10, i9, -104709385);
                                                    }
                                                    if (ap != null) {
                                                        for (i15 = 0; i15 < i36; i15++) {
                                                            aj.ad(ap, ((i40 + i16) - i22) + (i15 * i23), i10, i9, -724083463);
                                                        }
                                                    }
                                                    if (ah != null) {
                                                        aj.ad(ah, (i40 + i11) - i27, i10, i9, -459782260);
                                                    }
                                                    khVar.ah(aa2, i40 + i12, i8, aqVar.am * -192141833, 0, i9, aj);
                                                    if (ao2 != null) {
                                                        if (emVar4 != null) {
                                                            aj.ad(emVar4, (i39 + i40) - i32, i10, i9, -1799440454);
                                                        }
                                                        if (emVar2 != null) {
                                                            aj.ad(emVar2, (i21 + i40) - i30, i10, i9, -1841767524);
                                                        }
                                                        if (emVar3 != null) {
                                                            for (i14 = 0; i14 < i37; i14++) {
                                                                aj.ad(emVar3, (i34 * i14) + ((i35 + i40) - i31), i10, i9, -1599174809);
                                                            }
                                                        }
                                                        if (emVar != null) {
                                                            aj.ad(emVar, (i24 + i40) - i29, i10, i9, -2027023682);
                                                        }
                                                        khVar2.ah(str, i33 + i40, i26, -192141833 * ao2.am, 0, i9, aj);
                                                    }
                                                }
                                            }
                                        }
                                        i26 = i9;
                                        i9 = 255;
                                        if (-1317893727 * aqVar.av >= 0) {
                                            i9 = (i38 << 8) / ((aqVar.ae * -542472953) - (aqVar.av * -1317893727));
                                        }
                                        if (i9 >= 0) {
                                        }
                                        if (aa != null) {
                                            aj.ax(aa, (0 + i40) - i20, i10, 1231133277);
                                        }
                                        if (at != null) {
                                            aj.ax(at, (i19 + i40) - i25, i10, 1231133277);
                                        }
                                        if (ap != null) {
                                            for (i13 = 0; i13 < i36; i13++) {
                                                aj.ax(ap, ((i40 + i16) - i22) + (i13 * i23), i10, 1231133277);
                                            }
                                        }
                                        if (ah != null) {
                                            aj.ax(ah, (i11 + i40) - i27, i10, 1231133277);
                                        }
                                        khVar.at(aa2, i40 + i12, i8, (aqVar.am * -192141833) | -16777216, 0, aj);
                                        if (ao2 == null) {
                                            if (emVar4 != null) {
                                                aj.ax(emVar4, (i40 + i39) - i32, i10, 1231133277);
                                            }
                                            if (emVar2 != null) {
                                                aj.ax(emVar2, (i21 + i40) - i30, i10, 1231133277);
                                            }
                                            if (emVar3 != null) {
                                                for (i13 = 0; i13 < i37; i13++) {
                                                    aj.ax(emVar3, ((i40 + i35) - i31) + (i13 * i34), i10, 1231133277);
                                                }
                                            }
                                            if (emVar != null) {
                                                aj.ax(emVar, (i40 + i24) - i29, i10, 1231133277);
                                            }
                                            khVar2.at(str, i40 + i33, i26, (-192141833 * ao2.am) | -16777216, 0, aj);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 >= 0) {
                        aqVar = null;
                        i6 = 0;
                        i9 = fxVar.cl[i18];
                        if (i9 < 0) {
                            ao2 = null;
                        } else {
                            ac2 = gq.ac(i9, 1342077725);
                            if (ac2 != null) {
                            }
                        }
                        if (i10 - i6 > 901275591 * client.af) {
                            if (aqVar != null) {
                                ch.ci(fxVar, (fxVar.dl * -1647506717) / 2, -1816842005);
                                if (client.gz * -1676064909 <= -1) {
                                    if (i18 == 1) {
                                        client.gp -= -1560103620;
                                    }
                                    if (2 == i18) {
                                        client.gz -= 215557621;
                                        client.gp -= 1367431838;
                                    }
                                    if (i18 == 3) {
                                        client.gz += 215557621;
                                        client.gp -= 1367431838;
                                    }
                                    i19 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    i12 = 0;
                                    i11 = 0;
                                    i14 = 0;
                                    i7 = 0;
                                    i10 = 0;
                                    aa = aqVar.ak(-824208126);
                                    if (aa == null) {
                                        i20 = 0;
                                    } else {
                                        i19 = aa.ac;
                                        i6 = aa.an;
                                        if (i6 <= 0) {
                                            i6 = 0;
                                        }
                                        i20 = aa.aq;
                                        i10 = i6;
                                    }
                                    ap = aqVar.ap((byte) 46);
                                    if (ap == null) {
                                        i22 = 0;
                                        i23 = 0;
                                    } else {
                                        i21 = ap.ac;
                                        i6 = ap.an;
                                        if (i6 <= i10) {
                                            i6 = i10;
                                        }
                                        i22 = ap.aq;
                                        i23 = i21;
                                        i10 = i6;
                                    }
                                    at = aqVar.at((byte) 38);
                                    if (at == null) {
                                        i25 = 0;
                                        i21 = 0;
                                    } else {
                                        i24 = at.ac;
                                        i6 = at.an;
                                        if (i6 > i10) {
                                            i10 = i6;
                                        }
                                        i25 = at.aq;
                                        i21 = i24;
                                    }
                                    ah = aqVar.ah(-2142871260);
                                    if (ah == null) {
                                        i27 = 0;
                                        i26 = 0;
                                    } else {
                                        i26 = ah.ac;
                                        i6 = ah.an;
                                        if (i6 > i10) {
                                            i10 = i6;
                                        }
                                        i27 = ah.aq;
                                    }
                                    if (ao2 == null) {
                                        i28 = i10;
                                        i29 = 0;
                                        i30 = 0;
                                        i31 = 0;
                                        i32 = 0;
                                        i33 = 0;
                                        i24 = 0;
                                        i34 = 0;
                                        i35 = 0;
                                        emVar = null;
                                        emVar2 = null;
                                        emVar3 = null;
                                        emVar4 = null;
                                    } else {
                                        ak = ao2.ak(-1782555916);
                                        if (ak != null) {
                                            i15 = ak.ac;
                                            i6 = ak.an;
                                            if (i6 <= i10) {
                                                i6 = i10;
                                            }
                                            i11 = ak.aq;
                                            i10 = i6;
                                        }
                                        ap2 = ao2.ap((byte) 55);
                                        if (ap2 != null) {
                                            i16 = ap2.ac;
                                            i6 = ap2.an;
                                            if (i6 <= i10) {
                                                i6 = i10;
                                            }
                                            i14 = ap2.aq;
                                            i10 = i6;
                                        }
                                        ao = ao2.at((byte) 26);
                                        if (ao != null) {
                                            i12 = ao.ac;
                                            i6 = ao.an;
                                            if (i6 > i10) {
                                                i10 = i6;
                                            }
                                            i7 = ao.aq;
                                        }
                                        ah2 = ao2.ah(-2142871260);
                                        if (ah2 == null) {
                                            i28 = i10;
                                            i29 = 0;
                                            i30 = i7;
                                            i31 = i14;
                                            i32 = i11;
                                            i33 = 0;
                                            i24 = i12;
                                            i34 = i16;
                                            i35 = i15;
                                            emVar = ah2;
                                            emVar2 = ao;
                                            emVar3 = ap2;
                                            emVar4 = ak;
                                        } else {
                                            i9 = ah2.ac;
                                            i6 = ah2.an;
                                            if (i6 <= i10) {
                                                i6 = i10;
                                            }
                                            i28 = i6;
                                            i29 = ah2.aq;
                                            i30 = i7;
                                            i31 = i14;
                                            i32 = i11;
                                            i33 = i9;
                                            i24 = i12;
                                            i34 = i16;
                                            i35 = i15;
                                            emVar = ah2;
                                            emVar2 = ao;
                                            emVar3 = ap2;
                                            emVar4 = ak;
                                        }
                                    }
                                    ai = aqVar.ai((byte) 49);
                                    if (ai != null) {
                                        khVar = ai;
                                    } else {
                                        khVar = br.dq;
                                    }
                                    if (ao2 == null) {
                                        khVar2 = br.dq;
                                    } else {
                                        ai = ao2.ai((byte) 93);
                                        if (ai != null) {
                                            khVar2 = ai;
                                        } else {
                                            khVar2 = br.dq;
                                        }
                                    }
                                    i6 = 0;
                                    aa2 = aqVar.aa(fxVar.cb[i18], (byte) 0);
                                    i8 = khVar.aq(aa2);
                                    if (ao2 == null) {
                                        str = null;
                                    } else {
                                        aa3 = ao2.aa(fxVar.co[i18], (byte) 0);
                                        i6 = khVar2.aq(aa3);
                                        str = aa3;
                                    }
                                    if (i23 > 0) {
                                        i36 = 0;
                                    } else {
                                        if (at == null) {
                                        }
                                        i36 = (i8 / i23) + 1;
                                    }
                                    if (ao2 != null) {
                                    }
                                    i37 = 0;
                                    if (i19 <= 0) {
                                        i10 = 0;
                                    } else {
                                        i10 = 0 + i19;
                                    }
                                    i19 = i10 + 2;
                                    if (i21 <= 0) {
                                        i16 = i19;
                                    } else {
                                        i16 = i19 + i21;
                                    }
                                    if (i23 <= 0) {
                                        i11 = i16 + i8;
                                        i12 = i16;
                                    } else {
                                        i10 = i36 * i23;
                                        i11 = i16 + i10;
                                        i12 = ((i10 - i8) / 2) + i16;
                                    }
                                    if (i26 <= 0) {
                                        i10 = i11;
                                    } else {
                                        i10 = i11 + i26;
                                    }
                                    if (ao2 == null) {
                                        i33 = 0;
                                        i24 = 0;
                                        i35 = 0;
                                        i21 = 0;
                                        i39 = 0;
                                        i8 = i10;
                                    } else {
                                        i15 = i10 + 2;
                                        if (i35 <= 0) {
                                            i10 = i15;
                                        } else {
                                            i10 = i15 + i35;
                                        }
                                        i9 = i10 + 2;
                                        if (i24 <= 0) {
                                            i10 = i9;
                                        } else {
                                            i10 = i9 + i24;
                                        }
                                        if (i34 <= 0) {
                                            i8 = i10 + i6;
                                            i6 = i10;
                                        } else {
                                            i38 = i37 * i34;
                                            i8 = i10 + i38;
                                            i6 = ((i38 - i6) / 2) + i10;
                                        }
                                        if (i33 <= 0) {
                                            i33 = i6;
                                            i24 = i8;
                                            i35 = i10;
                                            i21 = i9;
                                            i39 = i15;
                                        } else {
                                            i38 = i8 + i33;
                                            i33 = i6;
                                            i24 = i8;
                                            i35 = i10;
                                            i21 = i9;
                                            i39 = i15;
                                            i8 = i38;
                                        }
                                    }
                                    i38 = fxVar.cy[i18] - (901275591 * client.af);
                                    i40 = (((-1676064909 * client.gz) + i2) - (i8 >> 1)) + ((aqVar.af * 2052382099) - (((2052382099 * aqVar.af) * i38) / (-542472953 * aqVar.ae)));
                                    i10 = ((((aqVar.au * 1695349607) * i38) / (aqVar.ae * -542472953)) + (-(aqVar.au * 1695349607))) + (((1657499755 * client.gp) + i3) - 12);
                                    i9 = i28 + i10;
                                    i8 = (137581049 * aqVar.ar) + (i10 + 15);
                                    i15 = i8 - khVar.ap;
                                    i6 = khVar.at + i8;
                                    if (i15 >= i10) {
                                        i15 = i10;
                                    }
                                    if (i6 <= i9) {
                                        i6 = i9;
                                    }
                                    i9 = 0;
                                    if (ao2 != null) {
                                        i9 = (137581049 * ao2.ar) + (i10 + 15);
                                        i28 = khVar2.at + i9;
                                        if (i9 - khVar2.ap >= i15) {
                                        }
                                        if (i28 > i6) {
                                            i26 = i9;
                                            i9 = 255;
                                            if (-1317893727 * aqVar.av >= 0) {
                                                i9 = (i38 << 8) / ((aqVar.ae * -542472953) - (aqVar.av * -1317893727));
                                            }
                                            if (i9 >= 0) {
                                            }
                                            if (aa != null) {
                                                aj.ax(aa, (0 + i40) - i20, i10, 1231133277);
                                            }
                                            if (at != null) {
                                                aj.ax(at, (i19 + i40) - i25, i10, 1231133277);
                                            }
                                            if (ap != null) {
                                                for (i13 = 0; i13 < i36; i13++) {
                                                    aj.ax(ap, ((i40 + i16) - i22) + (i13 * i23), i10, 1231133277);
                                                }
                                            }
                                            if (ah != null) {
                                                aj.ax(ah, (i11 + i40) - i27, i10, 1231133277);
                                            }
                                            khVar.at(aa2, i40 + i12, i8, (aqVar.am * -192141833) | -16777216, 0, aj);
                                            if (ao2 == null) {
                                                if (emVar4 != null) {
                                                    aj.ax(emVar4, (i40 + i39) - i32, i10, 1231133277);
                                                }
                                                if (emVar2 != null) {
                                                    aj.ax(emVar2, (i21 + i40) - i30, i10, 1231133277);
                                                }
                                                if (emVar3 != null) {
                                                    for (i13 = 0; i13 < i37; i13++) {
                                                        aj.ax(emVar3, ((i40 + i35) - i31) + (i13 * i34), i10, 1231133277);
                                                    }
                                                }
                                                if (emVar != null) {
                                                    aj.ax(emVar, (i40 + i24) - i29, i10, 1231133277);
                                                }
                                                khVar2.at(str, i40 + i33, i26, (-192141833 * ao2.am) | -16777216, 0, aj);
                                            }
                                        }
                                    }
                                    i26 = i9;
                                    i9 = 255;
                                    if (-1317893727 * aqVar.av >= 0) {
                                        i9 = (i38 << 8) / ((aqVar.ae * -542472953) - (aqVar.av * -1317893727));
                                    }
                                    if (i9 >= 0) {
                                    }
                                    if (aa != null) {
                                        aj.ax(aa, (0 + i40) - i20, i10, 1231133277);
                                    }
                                    if (at != null) {
                                        aj.ax(at, (i19 + i40) - i25, i10, 1231133277);
                                    }
                                    if (ap != null) {
                                        for (i13 = 0; i13 < i36; i13++) {
                                            aj.ax(ap, ((i40 + i16) - i22) + (i13 * i23), i10, 1231133277);
                                        }
                                    }
                                    if (ah != null) {
                                        aj.ax(ah, (i11 + i40) - i27, i10, 1231133277);
                                    }
                                    khVar.at(aa2, i40 + i12, i8, (aqVar.am * -192141833) | -16777216, 0, aj);
                                    if (ao2 == null) {
                                        if (emVar4 != null) {
                                            aj.ax(emVar4, (i40 + i39) - i32, i10, 1231133277);
                                        }
                                        if (emVar2 != null) {
                                            aj.ax(emVar2, (i21 + i40) - i30, i10, 1231133277);
                                        }
                                        if (emVar3 != null) {
                                            for (i13 = 0; i13 < i37; i13++) {
                                                aj.ax(emVar3, ((i40 + i35) - i31) + (i13 * i34), i10, 1231133277);
                                            }
                                        }
                                        if (emVar != null) {
                                            aj.ax(emVar, (i40 + i24) - i29, i10, 1231133277);
                                        }
                                        khVar2.at(str, i40 + i33, i26, (-192141833 * ao2.am) | -16777216, 0, aj);
                                    }
                                }
                            } else {
                                fxVar.cy[i18] = -1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ba.ck(" + ')');
        }
    }
}
