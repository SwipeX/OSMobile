package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class fk {
    static final int ac = 10;
    static int aj = -989295086;
    public static final int ay = 24;
    static final int az = 1170;
    String aa;
    boolean ak;
    boolean an;
    int ao;
    LinkedHashMap ap;
    boolean aq;

    public static boolean aj(int i, int i2) {
        return (i & 1) != 0;
    }

    fk() {
        try {
            this.ao = 663652299;
            this.aa = null;
            this.ak = false;
            this.ap = new LinkedHashMap();
            aj(true, -446413314);
        } catch (Throwable e) {
            throw ei.ac(e, "fk.<init>(" + ')');
        }
    }

    fk(he heVar) {
        int i = 0;
        boolean z = true;
        try {
            this.ao = 663652299;
            this.aa = null;
            this.ak = false;
            this.ap = new LinkedHashMap();
            if (heVar == null || heVar.aj == null) {
                aj(true, -149653392);
                return;
            }
            int au = heVar.au(-310118664);
            if (au < 0 || au > aj * 1311663531) {
                aj(true, 1123235452);
                return;
            }
            if (heVar.au(-310118664) == 1) {
                this.an = true;
            }
            if (au > 1) {
                if (heVar.au(-310118664) != 1) {
                    z = false;
                }
                this.aq = z;
            }
            if (au > 3) {
                this.ao = heVar.au(-310118664) * 663652299;
            }
            if (au > 2) {
                int au2 = heVar.au(-310118664);
                while (i < au2) {
                    this.ap.put(Integer.valueOf(heVar.ad((byte) -68)), Integer.valueOf(heVar.ad((byte) -84)));
                    i++;
                }
            }
            if (au > 4) {
                this.aa = heVar.bm((byte) 5);
            }
            if (au > 5) {
                this.ak = heVar.bp((byte) 0);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fk.<init>(" + ')');
        }
    }

    void aj(boolean z, int i) {
    }

    void ao(boolean z) {
    }

    void aq(boolean z) {
    }

    he aa() {
        int i;
        int i2 = 1;
        he heVar = new he(-28743728);
        heVar.an(1311663531 * aj, (byte) -59);
        if (this.an) {
            i = 1;
        } else {
            i = 0;
        }
        heVar.an(i, (byte) -115);
        if (!this.aq) {
            i2 = 0;
        }
        heVar.an(i2, (byte) -61);
        heVar.an(this.ao * -523246109, (byte) -38);
        heVar.an(this.ap.size(), (byte) -28);
        for (Entry entry : this.ap.entrySet()) {
            heVar.aa(((Integer) entry.getKey()).intValue(), 1203369974);
            heVar.aa(((Integer) entry.getValue()).intValue(), -39201797);
        }
        heVar.ai(this.aa != null ? this.aa : "", -1136720200);
        heVar.at(this.ak, 382833727);
        return heVar;
    }

    he ac(int i) {
        int i2 = 1;
        try {
            int i3;
            String str;
            he heVar = new he(100);
            heVar.an(1311663531 * aj, (byte) -123);
            if (this.an) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            heVar.an(i3, (byte) -58);
            if (!this.aq) {
                i2 = 0;
            }
            heVar.an(i2, (byte) -27);
            heVar.an(this.ao * -523246109, (byte) -50);
            heVar.an(this.ap.size(), (byte) -68);
            for (Entry entry : this.ap.entrySet()) {
                heVar.aa(((Integer) entry.getKey()).intValue(), 1148127093);
                heVar.aa(((Integer) entry.getValue()).intValue(), -1901785821);
            }
            if (this.aa != null) {
                str = this.aa;
            } else {
                str = "";
            }
            heVar.ai(str, 1556697095);
            heVar.at(this.ak, 2053625704);
            return heVar;
        } catch (Throwable e) {
            throw ei.ac(e, "fk.ac(" + ')');
        }
    }

    static void ak() {
        md mdVar = null;
        try {
            mdVar = dl.ac("", gs.ak.ak, true, -1939601848);
            he ac = ae.nv.ac(75986324);
            mdVar.ac(ac.aj, 0, ac.ac * -1094224107, (short) -26806);
        } catch (Exception e) {
        }
        if (mdVar != null) {
            try {
                mdVar.aq(true, 1368241904);
            } catch (Exception e2) {
            }
        }
    }

    static void ap() {
        md mdVar = null;
        try {
            mdVar = dl.ac("", gs.ak.ak, true, -1330184139);
            he ac = ae.nv.ac(75986324);
            mdVar.ac(ac.aj, 0, ac.ac * 489625177, (short) -14072);
        } catch (Exception e) {
        }
        if (mdVar != null) {
            try {
                mdVar.aq(true, 1279102645);
            } catch (Exception e2) {
            }
        }
    }

    static void at() {
        md mdVar = null;
        try {
            mdVar = dl.ac("", gs.ak.ak, true, -1916644549);
            he ac = ae.nv.ac(75986324);
            mdVar.ac(ac.aj, 0, ac.ac * 489625177, (short) -25390);
        } catch (Exception e) {
        }
        if (mdVar != null) {
            try {
                mdVar.aq(true, 2067833535);
            } catch (Exception e2) {
            }
        }
    }

    static int aq(int i, int i2, int i3) {
        long j = (long) ((i << 16) + i2);
        try {
            if (le.ae == null || le.ae.fy != j) {
                return 0;
            }
            return ((jg.al.ac * 1228252267) / (jg.al.aj.length - le.ae.an)) + 1;
        } catch (Throwable e) {
            throw ei.ac(e, "fk.aq(" + ')');
        }
    }

    static final void et(ab[] abVarArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        while (i9 < abVarArr.length) {
            try {
                ab abVar = abVarArr[i9];
                if (abVar != null && ((!abVar.az || -1999477681 * abVar.au == 0 || abVar.dm || at.ft(abVar, 1588397356) != 0 || client.ip == abVar || mi.ac == abVar.ay * 263736151) && -1228023025 * abVar.bi == i && !(abVar.az && ex.fe(abVar, (byte) 0)))) {
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    int i16 = i6 + (abVar.br * 731088057);
                    int i17 = (-1821656375 * abVar.bb) + i7;
                    if (2 == abVar.au * -1999477681) {
                        i10 = i5;
                        i11 = i4;
                        i12 = i3;
                        i13 = i2;
                    } else if (9 == abVar.au * -1999477681) {
                        i14 = (abVar.bu * 1120250035) + i16;
                        i15 = (abVar.bd * -1781667913) + i17;
                        if (i14 < i16) {
                            i12 = i16;
                            i13 = i14;
                        } else {
                            i12 = i14;
                            i13 = i16;
                        }
                        if (i15 < i17) {
                            i14 = i15;
                            i15 = i17;
                        } else {
                            i14 = i17;
                        }
                        i12++;
                        i11 = i15 + 1;
                        if (i13 > i2) {
                            i15 = i13;
                        } else {
                            i15 = i2;
                        }
                        if (i14 <= i3) {
                            i14 = i3;
                        }
                        if (i12 < i4) {
                            i13 = i12;
                        } else {
                            i13 = i4;
                        }
                        if (i11 < i5) {
                            i12 = i11;
                        } else {
                            i12 = i5;
                        }
                        i10 = i12;
                        i11 = i13;
                        i12 = i14;
                        i13 = i15;
                    } else {
                        i11 = i16 + (abVar.bu * 1120250035);
                        i14 = i17 + (-1781667913 * abVar.bd);
                        if (i16 > i2) {
                            i15 = i16;
                        } else {
                            i15 = i2;
                        }
                        if (i17 > i3) {
                            i12 = i17;
                        } else {
                            i12 = i3;
                        }
                        if (i11 >= i4) {
                            i11 = i4;
                        }
                        if (i14 >= i5) {
                            i14 = i5;
                        }
                        i10 = i14;
                        i13 = i15;
                    }
                    if (client.ir == abVar) {
                        client.jo = true;
                        client.jd = 1888187205 * i16;
                        client.jg = 177358379 * i17;
                    }
                    if (!abVar.az || (i13 < i11 && i12 < i10)) {
                        int i18;
                        int i19;
                        i15 = bu.au.ap[0];
                        int i20 = bu.au.at[0];
                        if (du.br(-1059752743)) {
                            i20 = bu.au.ai * -684431169;
                            i18 = 1252050953 * bu.au.ah;
                        } else {
                            i18 = i15;
                        }
                        if (i18 < i13 || i20 < i12 || i18 >= i11 || i20 >= i10) {
                            i19 = 0;
                        } else {
                            i19 = 1;
                        }
                        if (abVar.ay * 263736151 == bh.aj) {
                            if (client.ax || !du.br(-1059752743) || i19 == 0) {
                                dj.hs.br = false;
                            } else {
                                dj.hs.bm(1252050953 * bu.au.ah, -684431169 * bu.au.ai, -451651851 * client.hh, -1798821497 * client.ho, 329946870);
                                if (bu.au.as) {
                                    bu.au.af(fz.at, (byte) 65);
                                }
                            }
                        } else if (mi.ac == abVar.ay * 263736151) {
                            en.bz(abVar, i16, i17, -7772797);
                        } else {
                            if (263736151 * abVar.ay == mx.aq) {
                                ew.ov.an(i18, i20, i19, i16, i17, 1120250035 * abVar.bu, -1781667913 * abVar.bd, -1609106165);
                            }
                            if (du.br(-1059752743) && i19 == true) {
                                if (263736151 * abVar.ay == mx.aq) {
                                    ew.ov.bf(i16, i17, 1120250035 * abVar.bu, -1781667913 * abVar.bd, i18, i20, (byte) 66);
                                    bu.au.af(fz.aa, (byte) 99);
                                } else {
                                    dj.hs.bd(abVar, bu.au.ap[0] - i16, bu.au.at[0] - i17, -2000983797);
                                }
                            }
                            if (abVar.au * -1999477681 == 0) {
                                if (abVar.az || !ex.fe(abVar, (byte) -78) || an.hg == abVar) {
                                    fk.et(abVarArr, abVar.ax * -1035840093, i13, i12, i11, i10, i16 - (abVar.bo * 976779915), i17 - (abVar.bz * 707497527), -17365565);
                                    if (abVar.ft != null) {
                                        fk.et(abVar.ft, -1035840093 * abVar.ax, i13, i12, i11, i10, i16 - (976779915 * abVar.bo), i17 - (707497527 * abVar.bz), -17365565);
                                    }
                                    fr frVar = (fr) client.ic.aj((long) (-1035840093 * abVar.ax));
                                    if (frVar != null) {
                                        if (frVar.ac * -422803739 == 0 && i18 >= i13 && i20 >= i12 && i18 < i11 && i20 < i10 && !dj.hs.bn(-756666643) && !client.iv) {
                                            for (gd gdVar = (gd) client.kl.ak(); gdVar != null; gdVar = (gd) client.kl.at()) {
                                                if (gdVar.ac) {
                                                    gdVar.kn();
                                                    gdVar.an.ff = false;
                                                }
                                            }
                                            if (ha.jn * 1917500447 == 0) {
                                                client.ir = null;
                                                client.ip = null;
                                            }
                                            if (du.br(-1059752743)) {
                                                dj.hs.ba(-1692714382);
                                            }
                                        }
                                        i15 = frVar.aj * -1696662607;
                                        if (ku.an(i15, 1671262481)) {
                                            fk.et(ab.aa[i15], -1, i13, i12, i11, i10, i16, i17, -17365565);
                                        }
                                    }
                                }
                            }
                            if (abVar.az) {
                                gd gdVar2;
                                if (abVar.fx) {
                                    if (i18 >= i13 && i20 >= i12 && i18 < i11 && i20 < i10) {
                                        for (gdVar2 = (gd) client.kl.ak(); gdVar2 != null; gdVar2 = (gd) client.kl.at()) {
                                            if (gdVar2.ac) {
                                                gdVar2.kn();
                                                gdVar2.an.ff = false;
                                            }
                                        }
                                        if (ha.jn * 1917500447 == 0) {
                                            client.ir = null;
                                            client.ip = null;
                                        }
                                        bu.au.ax((byte) 73);
                                        if (du.br(-1059752743)) {
                                            dj.hs.ba(1267514858);
                                        }
                                    }
                                } else if (abVar.fg && i18 >= i13 && i20 >= i12 && i18 < i11 && i20 < i10) {
                                    gdVar2 = (gd) client.kl.ak();
                                    while (gdVar2 != null) {
                                        if (gdVar2.ac && gdVar2.aj == gdVar2.an.ec) {
                                            gdVar2.kn();
                                        }
                                        gdVar2 = (gd) client.kl.at();
                                    }
                                }
                                if (i18 < i13 || i20 < i12 || i18 >= i11 || i20 >= i10) {
                                    i19 = 0;
                                } else {
                                    i19 = 1;
                                }
                                int i21 = (i19 == 0 || !bu.au.bp) ? 0 : 1;
                                i15 = (i19 == 0 || bu.au.aj != fz.ac) ? 0 : 1;
                                if (i19 != 0 && bu.au.aj == fz.ac) {
                                    bn.ee(abVar, i18 - i16, i20 - i17, (byte) 52);
                                }
                                if (mx.aq == abVar.ay * 263736151) {
                                    ew.ov.aq(i18, i20, i19 & i15, i19 & i21, -1587449928);
                                }
                                if (!(client.ir == null || abVar == client.ir || i19 == 0)) {
                                    if ((((at.ft(abVar, 1588397356) >> 20) & 1) != 0 ? 1 : null) != null) {
                                        client.ik = abVar;
                                    }
                                }
                                if (client.ip == abVar) {
                                    client.iq = true;
                                    client.jq = 1968029735 * i16;
                                    client.jj = -338877637 * i17;
                                }
                                if (abVar.dm) {
                                    jt gdVar3;
                                    jt gdVar4;
                                    int i22;
                                    if (!(client.ir == null && fy.gm == null && !dj.hs.bn(1620389679))) {
                                        i21 = 0;
                                        i15 = 0;
                                        i19 = 0;
                                    }
                                    if (!(abVar.fe || r17 == 0)) {
                                        abVar.fe = true;
                                        if (abVar.dn != null) {
                                            gdVar3 = new gd();
                                            gdVar3.ac = true;
                                            gdVar3.an = abVar;
                                            gdVar3.aq = 1903366425 * (i18 - i16);
                                            gdVar3.ao = (i20 - i17) * -97884983;
                                            gdVar3.aj = abVar.dn;
                                            client.kl.ac(gdVar3);
                                        }
                                    }
                                    if (!(!abVar.fe || i15 == 0 || abVar.dg == null)) {
                                        gdVar3 = new gd();
                                        gdVar3.ac = true;
                                        gdVar3.an = abVar;
                                        gdVar3.aq = (i18 - i16) * 1903366425;
                                        gdVar3.ao = (i20 - i17) * -97884983;
                                        gdVar3.aj = abVar.dg;
                                        client.kl.ac(gdVar3);
                                    }
                                    if (abVar.fe && i15 == 0) {
                                        abVar.fe = false;
                                        if (abVar.df != null) {
                                            gdVar3 = new gd();
                                            gdVar3.ac = true;
                                            gdVar3.an = abVar;
                                            gdVar3.aq = (i18 - i16) * 1903366425;
                                            gdVar3.ao = -97884983 * (i20 - i17);
                                            gdVar3.aj = abVar.df;
                                            client.kv.ac(gdVar3);
                                        }
                                    }
                                    if (!(i15 == 0 || abVar.dy == null)) {
                                        gdVar4 = new gd();
                                        gdVar4.ac = true;
                                        gdVar4.an = abVar;
                                        gdVar4.aq = (i18 - i16) * 1903366425;
                                        gdVar4.ao = (i20 - i17) * -97884983;
                                        gdVar4.aj = abVar.dy;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (!(abVar.ff || i19 == 0)) {
                                        abVar.ff = true;
                                        if (abVar.dc != null) {
                                            gdVar4 = new gd();
                                            gdVar4.ac = true;
                                            gdVar4.an = abVar;
                                            gdVar4.aq = (i18 - i16) * 1903366425;
                                            gdVar4.ao = -97884983 * (i20 - i17);
                                            gdVar4.aj = abVar.dc;
                                            client.kl.ac(gdVar4);
                                        }
                                    }
                                    if (!(!abVar.ff || i19 == 0 || abVar.ei == null)) {
                                        gdVar4 = new gd();
                                        gdVar4.ac = true;
                                        gdVar4.an = abVar;
                                        gdVar4.aq = 1903366425 * (i18 - i16);
                                        gdVar4.ao = (i20 - i17) * -97884983;
                                        gdVar4.aj = abVar.ei;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (abVar.ff && i19 == 0) {
                                        abVar.ff = false;
                                        if (abVar.eq != null) {
                                            gdVar4 = new gd();
                                            gdVar4.ac = true;
                                            gdVar4.an = abVar;
                                            gdVar4.aq = 1903366425 * (i18 - i16);
                                            gdVar4.ao = -97884983 * (i20 - i17);
                                            gdVar4.aj = abVar.eq;
                                            client.kv.ac(gdVar4);
                                        }
                                    }
                                    if (!(i19 == 0 || client.kg * -2043693923 == 0 || abVar.ec == null)) {
                                        gdVar4 = new gd();
                                        gdVar4.ac = true;
                                        gdVar4.an = abVar;
                                        gdVar4.ao = -238804155 * client.kg;
                                        gdVar4.aj = abVar.ec;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (abVar.ed != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ed;
                                        client.kh.ac(gdVar4);
                                    }
                                    if (abVar.ek != null && client.jt * -394642937 > 1754310907 * abVar.fm) {
                                        if (abVar.eb == null || (-394642937 * client.jt) - (1754310907 * abVar.fm) > 32) {
                                            gdVar4 = new gd();
                                            gdVar4.an = abVar;
                                            gdVar4.aj = abVar.ek;
                                            client.kl.ac(gdVar4);
                                        } else {
                                            for (i14 = abVar.fm * 1754310907; i14 < client.jt * -394642937; i14++) {
                                                i22 = client.ji[i14 & 31];
                                                for (int i23 : abVar.eb) {
                                                    if (i23 == i22) {
                                                        gdVar4 = new gd();
                                                        gdVar4.an = abVar;
                                                        gdVar4.aj = abVar.ek;
                                                        client.kl.ac(gdVar4);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        abVar.fm = client.jt * 1671396709;
                                    }
                                    if (abVar.ez != null && client.jl * 2006554325 > abVar.fb * -905237071) {
                                        if (abVar.el == null || (2006554325 * client.jl) - (abVar.fb * -905237071) > 32) {
                                            gdVar4 = new gd();
                                            gdVar4.an = abVar;
                                            gdVar4.aj = abVar.ez;
                                            client.kl.ac(gdVar4);
                                        } else {
                                            for (i14 = -905237071 * abVar.fb; i14 < client.jl * 2006554325; i14++) {
                                                i22 = client.jb[i14 & 31];
                                                for (int i232 : abVar.el) {
                                                    if (i22 == i232) {
                                                        gdVar4 = new gd();
                                                        gdVar4.an = abVar;
                                                        gdVar4.aj = abVar.ez;
                                                        client.kl.ac(gdVar4);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        abVar.fb = client.jl * 1569558629;
                                    }
                                    if (abVar.ey != null && client.jz * -518535855 > 522722485 * abVar.fc) {
                                        if (abVar.ex == null || (client.jz * -518535855) - (abVar.fc * 522722485) > 32) {
                                            gdVar4 = new gd();
                                            gdVar4.an = abVar;
                                            gdVar4.aj = abVar.ey;
                                            client.kl.ac(gdVar4);
                                        } else {
                                            for (i14 = 522722485 * abVar.fc; i14 < client.jz * -518535855; i14++) {
                                                i22 = client.jc[i14 & 31];
                                                for (int i2322 : abVar.ex) {
                                                    if (i2322 == i22) {
                                                        gdVar4 = new gd();
                                                        gdVar4.an = abVar;
                                                        gdVar4.aj = abVar.ey;
                                                        client.kl.ac(gdVar4);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        abVar.fc = 439698349 * client.jz;
                                    }
                                    if (1006621695 * client.ja > abVar.fu * -334463835 && abVar.ea != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ea;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (client.jw * -833947977 > -334463835 * abVar.fu && abVar.ee != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ee;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (1098243933 * client.jh > -334463835 * abVar.fu && abVar.em != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.em;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (client.je * -396520343 > abVar.fu * -334463835 && abVar.ev != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ev;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (client.jy * -340195929 > abVar.fu * -334463835 && abVar.ef != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ef;
                                        client.kl.ac(gdVar4);
                                    }
                                    if (client.js * 2075819221 > abVar.fu * -334463835 && abVar.ew != null) {
                                        gdVar4 = new gd();
                                        gdVar4.an = abVar;
                                        gdVar4.aj = abVar.ew;
                                        client.kl.ac(gdVar4);
                                    }
                                    abVar.fu = client.jf * -762342487;
                                    if (abVar.er != null) {
                                        for (i15 = 0; i15 < bu.au.bh * -1829911127; i15++) {
                                            gdVar3 = new gd();
                                            gdVar3.an = abVar;
                                            gdVar3.ap = 279560547 * bu.au.bt[i15];
                                            gdVar3.at = 506336805 * bu.au.br[i15];
                                            gdVar3.aj = abVar.er;
                                            client.kl.ac(gdVar3);
                                        }
                                    }
                                }
                            }
                            if (!abVar.az && client.ir == null && fy.gm == null) {
                                if (!dj.hs.bn(1189251563)) {
                                    if ((abVar.fn * -31720781 >= 0 || -1804345067 * abVar.be != 0) && i18 >= i13 && i20 >= i12 && i18 < i11 && i20 < i10) {
                                        if (abVar.fn * -31720781 >= 0) {
                                            an.hg = abVarArr[abVar.fn * -31720781];
                                        } else {
                                            an.hg = abVar;
                                        }
                                    }
                                    if (-1999477681 * abVar.au == 8 && i18 >= i13 && i20 >= i12 && i18 < i11 && i20 < i10) {
                                        au.ie = abVar;
                                    }
                                    if (abVar.bj * -248255019 > abVar.bd * -1781667913) {
                                        if (i19 != 0) {
                                            bu.au.af(fz.aa, (byte) 70);
                                        }
                                        dy.el(abVar, i16 + (1120250035 * abVar.bu), i17, abVar.bd * -1781667913, abVar.bj * -248255019, i18, i20, -1499158193);
                                    }
                                }
                            }
                        }
                    }
                }
                i9++;
            } catch (Throwable e) {
                throw ei.ac(e, "fk.et(" + ')');
            }
        }
    }
}
