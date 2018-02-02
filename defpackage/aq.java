package defpackage;

public class aq extends je {
    public static js aa = new js(20, null);
    static ju ac = null;
    static final int ah = 16777215;
    static final int ai = 70;
    static ju aj = null;
    static final int ak = 7;
    static ju an = null;
    public static js ao = new js(64, null);
    public static final int ap = 0;
    public static js aq = new js(64, null);
    public static final int at = 1;
    public static final int cn = 101;
    static fl cz;
    public static ab gc;
    static short[] of;
    int ab;
    public int[] ad;
    public int ae;
    public int af;
    public int ag;
    int al;
    public int am;
    public int ar;
    int as;
    public int au;
    public int av;
    int aw;
    int ax;
    String ay;
    int az;
    int bp;

    public static int ac(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (1 != (i6 & 1)) {
            int i8 = i5;
            i5 = i4;
            i4 = i8;
        }
        int i9 = i3 & 3;
        if (i9 == 0) {
            return i;
        }
        if (i9 == 1) {
            return i2;
        }
        if (i9 == 2) {
            return (7 - i) - (i5 - 1);
        }
        return (7 - i2) - (i4 - 1);
    }

    aq() {
        try {
            this.aw = 1798926691;
            this.am = -2118265799;
            this.ae = 1524449802;
            this.as = 566523963;
            this.al = -2142853065;
            this.az = 1324351343;
            this.ax = 1940638341;
            this.af = 0;
            this.au = 0;
            this.av = -812620385;
            this.ay = "";
            this.ag = 472350089;
            this.ar = 0;
            this.ab = 1712930945;
            this.bp = -596805041;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.<init>(" + ')');
        }
    }

    public static void aw(ju juVar, ju juVar2, ju juVar3) {
        aj = juVar;
        ac = juVar2;
        an = juVar3;
    }

    public static aq ae(int i) {
        aq aqVar = (aq) aq.aj((long) i);
        if (aqVar == null) {
            byte[] an = aj.an(32, i, -1281897134);
            aqVar = new aq();
            if (an != null) {
                aqVar.an(new he(an), -1707260552);
            }
            aq.an(aqVar, (long) i);
        }
        return aqVar;
    }

    public static aq am(int i) {
        aq aqVar = (aq) aq.aj((long) i);
        if (aqVar == null) {
            byte[] an = aj.an(32, i, -1038137491);
            aqVar = new aq();
            if (an != null) {
                aqVar.an(new he(an), -1352281388);
            }
            aq.an(aqVar, (long) i);
        }
        return aqVar;
    }

    public static aq as(int i) {
        aq aqVar = (aq) aq.aj((long) i);
        if (aqVar == null) {
            byte[] an = aj.an(814319737, i, -964643571);
            aqVar = new aq();
            if (an != null) {
                aqVar.an(new he(an), -243499980);
            }
            aq.an(aqVar, (long) i);
        }
        return aqVar;
    }

    void al(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -2011728913);
            } else {
                return;
            }
        }
    }

    void an(he heVar, int i) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    aq(heVar, au, -1998601804);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "aq.an(" + ')');
            }
        }
    }

    void az(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -2095946770);
            } else {
                return;
            }
        }
    }

    void af(he heVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.aw = heVar.by((byte) -84) * -1798926691;
        } else if (i == 2) {
            this.am = heVar.ar(597353088) * 1161964487;
        } else if (i == 3) {
            this.as = heVar.by((byte) -84) * -477628021;
        } else if (i == 4) {
            this.az = heVar.by((byte) -50) * -1324351343;
        } else if (i == 5) {
            this.al = heVar.by((byte) -76) * 2142853065;
        } else if (6 == i) {
            this.ax = heVar.by((byte) -30) * -1252772566;
        } else if (7 == i) {
            this.af = heVar.ag((byte) -1) * -1879520385;
        } else if (8 == i) {
            this.ay = heVar.bt(-1055361135);
        } else if (i == 9) {
            this.ae = heVar.ay((byte) 1) * -100935497;
        } else if (i == 10) {
            this.au = heVar.ag((byte) -1) * 304803927;
        } else if (i == 11) {
            this.av = 0;
        } else if (12 == i) {
            this.ag = heVar.au(-310118664) * -472350089;
        } else if (i == 13) {
            this.ar = heVar.ag((byte) -1) * 1159677425;
        } else if (14 == i) {
            this.av = heVar.ay((byte) 1) * 812620385;
        } else if (17 == i || 18 == i) {
            int ay;
            this.ab = heVar.ay((byte) 1) * -1712930945;
            if (this.ab * -1661403009 == -1735564767) {
                this.ab = -666486021;
            }
            this.bp = heVar.ay((byte) 1) * 596805041;
            if (-1847472177 == -426814892 * this.bp) {
                this.bp = -1238236567;
            }
            if (i == 18) {
                ay = heVar.ay((byte) 1);
                if (ay == -1164358594) {
                    ay = -1;
                }
            } else {
                ay = -1;
            }
            int au = heVar.au(-310118664);
            this.ad = new int[(au + 2)];
            while (i2 <= au) {
                this.ad[i2] = heVar.ay((byte) 1);
                if (65535 == this.ad[i2]) {
                    this.ad[i2] = -1;
                }
                i2++;
            }
            this.ad[au + 1] = ay;
        }
    }

    void aq(he heVar, int i, int i2) {
        int i3 = -1;
        if (1 == i) {
            try {
                this.aw = heVar.by((byte) -87) * -1798926691;
            } catch (Throwable e) {
                throw ei.ac(e, "aq.aq(" + ')');
            }
        } else if (i == 2) {
            this.am = heVar.ar(597353088) * 1161964487;
        } else if (i == 3) {
            this.as = heVar.by((byte) -78) * -566523963;
        } else if (i == 4) {
            this.az = heVar.by((byte) -2) * -1324351343;
        } else if (i == 5) {
            this.al = heVar.by((byte) -112) * 2142853065;
        } else if (6 == i) {
            this.ax = heVar.by((byte) -105) * -1940638341;
        } else if (7 == i) {
            this.af = heVar.ag((byte) -1) * 575785115;
        } else if (8 == i) {
            this.ay = heVar.bt(-1232607361);
        } else if (i == 9) {
            this.ae = heVar.ay((byte) 1) * -100935497;
        } else if (i == 10) {
            this.au = heVar.ag((byte) -1) * 304803927;
        } else if (i == 11) {
            this.av = 0;
        } else if (12 == i) {
            this.ag = heVar.au(-310118664) * -472350089;
        } else if (i == 13) {
            this.ar = heVar.ag((byte) -1) * 263364681;
        } else if (14 == i) {
            this.av = heVar.ay((byte) 1) * 812620385;
        } else if (17 == i || 18 == i) {
            int ay;
            this.ab = heVar.ay((byte) 1) * -1712930945;
            if (this.ab * -1661403009 == 65535) {
                this.ab = 1712930945;
            }
            this.bp = heVar.ay((byte) 1) * 596805041;
            if (65535 == -1731943599 * this.bp) {
                this.bp = -596805041;
            }
            if (i == 18) {
                ay = heVar.ay((byte) 1);
                if (ay != 65535) {
                    i3 = ay;
                }
            }
            ay = heVar.au(-310118664);
            this.ad = new int[(ay + 2)];
            for (int i4 = 0; i4 <= ay; i4++) {
                this.ad[i4] = heVar.ay((byte) 1);
                if (65535 == this.ad[i4]) {
                    this.ad[i4] = -1;
                }
            }
            this.ad[ay + 1] = i3;
        }
    }

    void au(he heVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.aw = heVar.by((byte) -118) * 1885332535;
        } else if (i == 2) {
            this.am = heVar.ar(597353088) * 1161964487;
        } else if (i == 3) {
            this.as = heVar.by((byte) -12) * -566523963;
        } else if (i == 4) {
            this.az = heVar.by((byte) -12) * -1324351343;
        } else if (i == 5) {
            this.al = heVar.by((byte) -93) * 303211365;
        } else if (6 == i) {
            this.ax = heVar.by((byte) 1) * -1940638341;
        } else if (7 == i) {
            this.af = heVar.ag((byte) -1) * -867584858;
        } else if (8 == i) {
            this.ay = heVar.bt(271524492);
        } else if (i == 9) {
            this.ae = heVar.ay((byte) 1) * -100935497;
        } else if (i == 10) {
            this.au = heVar.ag((byte) -1) * 929842178;
        } else if (i == 11) {
            this.av = 0;
        } else if (12 == i) {
            this.ag = heVar.au(-310118664) * 47186265;
        } else if (i == 13) {
            this.ar = heVar.ag((byte) -1) * 604640462;
        } else if (14 == i) {
            this.av = heVar.ay((byte) 1) * 1590800803;
        } else if (17 == i || 18 == i) {
            int ay;
            this.ab = heVar.ay((byte) 1) * 1917486275;
            if (this.ab * -1776656402 == -1142749154) {
                this.ab = -1504449453;
            }
            this.bp = heVar.ay((byte) 1) * 596805041;
            if (2002637271 == 1448890458 * this.bp) {
                this.bp = 1389233848;
            }
            if (i == 18) {
                ay = heVar.ay((byte) 1);
                if (ay == 89716190) {
                    ay = -1;
                }
            } else {
                ay = -1;
            }
            int au = heVar.au(-310118664);
            this.ad = new int[(au + 2)];
            while (i2 <= au) {
                this.ad[i2] = heVar.ay((byte) 1);
                if (65535 == this.ad[i2]) {
                    this.ad[i2] = -1;
                }
                i2++;
            }
            this.ad[au + 1] = ay;
        }
    }

    void ax(he heVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.aw = heVar.by((byte) -35) * -1798926691;
        } else if (i == 2) {
            this.am = heVar.ar(597353088) * 1161964487;
        } else if (i == 3) {
            this.as = heVar.by((byte) -95) * -566523963;
        } else if (i == 4) {
            this.az = heVar.by((byte) -124) * -1324351343;
        } else if (i == 5) {
            this.al = heVar.by((byte) -7) * 2142853065;
        } else if (6 == i) {
            this.ax = heVar.by((byte) -68) * -1940638341;
        } else if (7 == i) {
            this.af = heVar.ag((byte) -1) * 575785115;
        } else if (8 == i) {
            this.ay = heVar.bt(481588762);
        } else if (i == 9) {
            this.ae = heVar.ay((byte) 1) * -100935497;
        } else if (i == 10) {
            this.au = heVar.ag((byte) -1) * 304803927;
        } else if (i == 11) {
            this.av = 0;
        } else if (12 == i) {
            this.ag = heVar.au(-310118664) * -472350089;
        } else if (i == 13) {
            this.ar = heVar.ag((byte) -1) * 263364681;
        } else if (14 == i) {
            this.av = heVar.ay((byte) 1) * 812620385;
        } else if (17 == i || 18 == i) {
            int ay;
            this.ab = heVar.ay((byte) 1) * -1712930945;
            if (this.ab * -1661403009 == 65535) {
                this.ab = 1712930945;
            }
            this.bp = heVar.ay((byte) 1) * 596805041;
            if (65535 == -1731943599 * this.bp) {
                this.bp = -596805041;
            }
            if (i == 18) {
                ay = heVar.ay((byte) 1);
                if (ay == 65535) {
                    ay = -1;
                }
            } else {
                ay = -1;
            }
            int au = heVar.au(-310118664);
            this.ad = new int[(au + 2)];
            while (i2 <= au) {
                this.ad[i2] = heVar.ay((byte) 1);
                if (65535 == this.ad[i2]) {
                    this.ad[i2] = -1;
                }
                i2++;
            }
            this.ad[au + 1] = ay;
        }
    }

    public final aq ao(int i) {
        try {
            int aj;
            if (-1 != this.ab * -1661403009) {
                aj = fo.aj(this.ab * -1661403009, (short) -8192);
            } else if (this.bp * -1731943599 != -1) {
                aj = bp.an[this.bp * -1731943599];
            } else {
                aj = -1;
            }
            if (aj < 0 || aj >= this.ad.length - 1) {
                aj = this.ad[this.ad.length - 1];
            } else {
                aj = this.ad[aj];
            }
            if (aj != -1) {
                return gq.ac(aj, -930606776);
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.ao(" + ')');
        }
    }

    public final aq av() {
        int aj = -1 != 600177753 * this.ab ? fo.aj(-1661403009 * this.ab, (short) -8192) : this.bp * -1731943599 != -1 ? bp.an[this.bp * 2085095661] : -1;
        if (aj < 0 || aj >= this.ad.length - 1) {
            aj = this.ad[this.ad.length - 1];
        } else {
            aj = this.ad[aj];
        }
        if (aj != -1) {
            return gq.ac(aj, 389542685);
        }
        return null;
    }

    public String aa(int i, byte b) {
        try {
            String str = this.ay;
            while (true) {
                int indexOf = str.indexOf("%1");
                if (indexOf < 0) {
                    return str;
                }
                str = str.substring(0, indexOf) + fa.aq(i, false, -2093650831) + str.substring(indexOf + 2);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "aq.aa(" + ')');
        }
    }

    public String ag(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            str = str.substring(0, indexOf) + fa.aq(i, false, 1237601235) + str.substring(indexOf + 2);
        }
    }

    public String ar(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            str = str.substring(0, indexOf) + fa.aq(i, false, -697832323) + str.substring(indexOf + 2);
        }
    }

    public String ay(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            str = str.substring(0, indexOf) + fa.aq(i, false, 239950668) + str.substring(indexOf + 2);
        }
    }

    public em ab() {
        if (this.as * -2101846259 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.as * -2101846259));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.as * -2101846259, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.as * -2101846259));
        return emVar;
    }

    public em ad() {
        if (-528920830 * this.as < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (-800693142 * this.as));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, -1010938715 * this.as, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (-2101846259 * this.as));
        return emVar;
    }

    public em ak(int i) {
        try {
            if (this.as * -2101846259 < 0) {
                return null;
            }
            em emVar = (em) ao.aj((long) (this.as * -2101846259));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.as * -2101846259, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            ao.an(emVar, (long) (this.as * -2101846259));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.ak(" + ')');
        }
    }

    public em bm() {
        if (this.as * -2101846259 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.as * -2101846259));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.as * -2101846259, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.as * -2101846259));
        return emVar;
    }

    public em bp() {
        if (this.as * -2101846259 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.as * -2101846259));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, 1693528506 * this.as, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (1750212776 * this.as));
        return emVar;
    }

    public em ap(byte b) {
        try {
            if (this.al * 954102393 < 0) {
                return null;
            }
            em emVar = (em) ao.aj((long) (this.al * 954102393));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.al * 954102393, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            ao.an(emVar, (long) (this.al * 954102393));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.ap(" + ')');
        }
    }

    public em bb() {
        if (this.al * 954102393 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.al * 954102393));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.al * 664730789, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.al * 954102393));
        return emVar;
    }

    public em bh() {
        if (this.al * 954102393 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.al * -465335976));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.al * 954102393, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.al * -2089092910));
        return emVar;
    }

    public em br() {
        if (1221245734 * this.al < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.al * -518220013));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.al * -530146512, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.al * 954102393));
        return emVar;
    }

    public em bt() {
        if (-1826820746 * this.al < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.al * 2056347656));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.al * 954102393, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.al * 1588395380));
        return emVar;
    }

    public em at(byte b) {
        try {
            if (this.az * 1624490097 < 0) {
                return null;
            }
            em emVar = (em) ao.aj((long) (this.az * 1624490097));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.az * 1624490097, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            ao.an(emVar, (long) (this.az * 1624490097));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.at(" + ')');
        }
    }

    public em bu() {
        if (this.az * 1624490097 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.az * 1624490097));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.az * 1624490097, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.az * 1624490097));
        return emVar;
    }

    public em ah(int i) {
        try {
            if (this.ax * -64921165 < 0) {
                return null;
            }
            em emVar = (em) ao.aj((long) (this.ax * -64921165));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.ax * -64921165, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            ao.an(emVar, (long) (this.ax * -64921165));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.ah(" + ')');
        }
    }

    public em bd() {
        if (this.ax * -64921165 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.ax * -64921165));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.ax * -64921165, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.ax * -64921165));
        return emVar;
    }

    public em bx() {
        if (this.ax * -64921165 < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.ax * -64921165));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.ax * -64921165, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.ax * -64921165));
        return emVar;
    }

    public em by() {
        if (-513487221 * this.ax < 0) {
            return null;
        }
        em emVar = (em) ao.aj((long) (this.ax * 1753623776));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, -1254463093 * this.ax, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        ao.an(emVar, (long) (this.ax * -1849197842));
        return emVar;
    }

    public kh ai(byte b) {
        kh khVar = null;
        try {
            if (-1 == this.aw * 711747509) {
                return null;
            }
            kh khVar2 = (kh) aa.aj((long) (this.aw * 711747509));
            if (khVar2 != null) {
                return khVar2;
            }
            ju juVar = ac;
            ju juVar2 = an;
            int i = this.aw * 711747509;
            if (ei.aw(juVar, i, 0, -2006428015)) {
                byte[] an = juVar2.an(i, 0, -973311650);
                if (an == null) {
                    khVar2 = null;
                } else {
                    khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                    gn.as((byte) -5);
                }
                khVar = khVar2;
            }
            if (khVar == null) {
                return khVar;
            }
            aa.an(khVar, (long) (this.aw * 711747509));
            return khVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aq.ai(" + ')');
        }
    }

    public kh bi() {
        kh khVar = null;
        if (-1 == this.aw * 711747509) {
            return null;
        }
        kh khVar2 = (kh) aa.aj((long) (this.aw * 711747509));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = ac;
        ju juVar2 = an;
        int i = this.aw * 711747509;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, 51332337);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -87);
            }
            khVar = khVar2;
        }
        if (khVar == null) {
            return khVar;
        }
        aa.an(khVar, (long) (this.aw * 711747509));
        return khVar;
    }

    public kh bo() {
        kh khVar = null;
        if (-1 == -1327306297 * this.aw) {
            return null;
        }
        kh khVar2 = (kh) aa.aj((long) (this.aw * -826038036));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = ac;
        ju juVar2 = an;
        int i = this.aw * 711747509;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -2114134974);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -111);
            }
            khVar = khVar2;
        }
        if (khVar == null) {
            return khVar;
        }
        aa.an(khVar, (long) (this.aw * 711747509));
        return khVar;
    }

    public kh bs() {
        kh khVar = null;
        if (-1 == 56036705 * this.aw) {
            return null;
        }
        kh khVar2 = (kh) aa.aj((long) (this.aw * 711747509));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = ac;
        ju juVar2 = an;
        int i = this.aw * 198856774;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -572996370);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -61);
            }
            khVar = khVar2;
        }
        if (khVar == null) {
            return khVar;
        }
        aa.an(khVar, (long) (this.aw * 1324706459));
        return khVar;
    }

    public kh bz() {
        kh khVar = null;
        if (-1 == this.aw * 711747509) {
            return null;
        }
        kh khVar2 = (kh) aa.aj((long) (this.aw * 711747509));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = ac;
        ju juVar2 = an;
        int i = this.aw * 711747509;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -1226209486);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -41);
            }
            khVar = khVar2;
        }
        if (khVar == null) {
            return khVar;
        }
        aa.an(khVar, (long) (this.aw * 711747509));
        return khVar;
    }
}
