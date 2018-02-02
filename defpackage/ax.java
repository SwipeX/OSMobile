package defpackage;

import java.util.Collection;

public class ax extends je {
    public static ju ac = null;
    public static ju aj = null;
    public static ju an = null;
    static js ao = new js(100, null);
    static js aq = new js(64, null);
    static jn cr = null;
    public static final int cs = 97;
    static le ob;
    public int[] aa;
    public int ae;
    public int af;
    public int ah;
    int[] ai;
    int[] ak;
    public int al;
    public int am;
    public int[] ap;
    public int as;
    public int[] at;
    public boolean aw;
    public int ax;
    public int az;

    ax() {
        try {
            this.ah = 536365391;
            this.aw = false;
            this.am = -2074174097;
            this.ae = 1699308705;
            this.as = 991013703;
            this.al = 611120719;
            this.az = 1357116313;
            this.ax = 404313005;
            this.af = -1193297698;
        } catch (Throwable e) {
            throw ei.ac(e, "ax.<init>(" + ')');
        }
    }

    public static ax ae(int i) {
        ax axVar = (ax) aq.aj((long) i);
        if (axVar == null) {
            byte[] an = aj.an(12, i, -2026707778);
            axVar = new ax();
            if (an != null) {
                axVar.ac(new he(an), (byte) -11);
            }
            axVar.aq(-863135857);
            aq.an(axVar, (long) i);
        }
        return axVar;
    }

    public static ax am(int i) {
        ax axVar = (ax) aq.aj((long) i);
        if (axVar == null) {
            byte[] an = aj.an(12, i, 324146828);
            axVar = new ax();
            if (an != null) {
                axVar.ac(new he(an), (byte) -24);
            }
            axVar.aq(-1353689166);
            aq.an(axVar, (long) i);
        }
        return axVar;
    }

    public static ax aw(int i) {
        ax axVar = (ax) aq.aj((long) i);
        if (axVar == null) {
            byte[] an = aj.an(12, i, -795342418);
            axVar = new ax();
            if (an != null) {
                axVar.ac(new he(an), (byte) -49);
            }
            axVar.aq(-1311528330);
            aq.an(axVar, (long) i);
        }
        return axVar;
    }

    void ac(he heVar, byte b) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    an(heVar, au, (byte) -97);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ax.ac(" + ')');
            }
        }
    }

    void al(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, (byte) 68);
            } else {
                return;
            }
        }
    }

    void as(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, (byte) -9);
            } else {
                return;
            }
        }
    }

    void az(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, (byte) 2);
            } else {
                return;
            }
        }
    }

    void af(he heVar, int i) {
        int i2 = 0;
        int ay;
        int i3;
        if (1 == i) {
            ay = heVar.ay((byte) 1);
            this.ap = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ap[i3] = heVar.ay((byte) 1);
            }
            this.aa = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.aa[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.aa[i2] = (heVar.ay((byte) 1) << 16) + this.aa[i2];
                i2++;
            }
        } else if (i == 2) {
            this.ah = heVar.ay((byte) 1) * -536365391;
        } else if (i == 3) {
            i3 = heVar.au(-310118664);
            this.ai = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ai[i2] = heVar.au(-310118664);
                i2++;
            }
            this.ai[i3] = 9999999;
        } else if (i == 4) {
            this.aw = true;
        } else if (i == 5) {
            this.am = heVar.au(-310118664) * 1303152099;
        } else if (i == 6) {
            this.ae = heVar.ay((byte) 1) * 468503595;
        } else if (i == 7) {
            this.as = heVar.ay((byte) 1) * -991013703;
        } else if (i == 8) {
            this.al = heVar.au(-310118664) * 2013138317;
        } else if (i == 9) {
            this.az = heVar.au(-310118664) * 1279191170;
        } else if (i == 10) {
            this.ax = heVar.au(-310118664) * -404313005;
        } else if (11 == i) {
            this.af = heVar.au(-310118664) * -259678865;
        } else if (i == 12) {
            ay = heVar.au(-310118664);
            this.ak = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ak[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.ak[i2] = (heVar.ay((byte) 1) << 16) + this.ak[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = heVar.au(-310118664);
            this.at = new int[i3];
            while (i2 < i3) {
                this.at[i2] = heVar.ar(597353088);
                i2++;
            }
        }
    }

    void an(he heVar, int i, byte b) {
        int i2 = 0;
        int ay;
        int i3;
        if (1 == i) {
            try {
                ay = heVar.ay((byte) 1);
                this.ap = new int[ay];
                for (i3 = 0; i3 < ay; i3++) {
                    this.ap[i3] = heVar.ay((byte) 1);
                }
                this.aa = new int[ay];
                for (i3 = 0; i3 < ay; i3++) {
                    this.aa[i3] = heVar.ay((byte) 1);
                }
                while (i2 < ay) {
                    this.aa[i2] = (heVar.ay((byte) 1) << 16) + this.aa[i2];
                    i2++;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ax.an(" + ')');
            }
        } else if (i == 2) {
            this.ah = heVar.ay((byte) 1) * -536365391;
        } else if (i == 3) {
            i3 = heVar.au(-310118664);
            this.ai = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ai[i2] = heVar.au(-310118664);
                i2++;
            }
            this.ai[i3] = 9999999;
        } else if (i == 4) {
            this.aw = true;
        } else if (i == 5) {
            this.am = heVar.au(-310118664) * 1303152099;
        } else if (i == 6) {
            this.ae = heVar.ay((byte) 1) * -1699308705;
        } else if (i == 7) {
            this.as = heVar.ay((byte) 1) * -991013703;
        } else if (i == 8) {
            this.al = heVar.au(-310118664) * 483391525;
        } else if (i == 9) {
            this.az = heVar.au(-310118664) * -1357116313;
        } else if (i == 10) {
            this.ax = heVar.au(-310118664) * -404313005;
        } else if (11 == i) {
            this.af = heVar.au(-310118664) * -596648849;
        } else if (i == 12) {
            ay = heVar.au(-310118664);
            this.ak = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ak[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.ak[i2] = (heVar.ay((byte) 1) << 16) + this.ak[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = heVar.au(-310118664);
            this.at = new int[i3];
            while (i2 < i3) {
                this.at[i2] = heVar.ar(597353088);
                i2++;
            }
        }
    }

    void au(he heVar, int i) {
        int i2 = 0;
        int ay;
        int i3;
        if (1 == i) {
            ay = heVar.ay((byte) 1);
            this.ap = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ap[i3] = heVar.ay((byte) 1);
            }
            this.aa = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.aa[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.aa[i2] = (heVar.ay((byte) 1) << 16) + this.aa[i2];
                i2++;
            }
        } else if (i == 2) {
            this.ah = heVar.ay((byte) 1) * -536365391;
        } else if (i == 3) {
            i3 = heVar.au(-310118664);
            this.ai = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ai[i2] = heVar.au(-310118664);
                i2++;
            }
            this.ai[i3] = 9999999;
        } else if (i == 4) {
            this.aw = true;
        } else if (i == 5) {
            this.am = heVar.au(-310118664) * 1303152099;
        } else if (i == 6) {
            this.ae = heVar.ay((byte) 1) * -1699308705;
        } else if (i == 7) {
            this.as = heVar.ay((byte) 1) * -991013703;
        } else if (i == 8) {
            this.al = heVar.au(-310118664) * 483391525;
        } else if (i == 9) {
            this.az = heVar.au(-310118664) * -1357116313;
        } else if (i == 10) {
            this.ax = heVar.au(-310118664) * -404313005;
        } else if (11 == i) {
            this.af = heVar.au(-310118664) * -596648849;
        } else if (i == 12) {
            ay = heVar.au(-310118664);
            this.ak = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ak[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.ak[i2] = (heVar.ay((byte) 1) << 16) + this.ak[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = heVar.au(-310118664);
            this.at = new int[i3];
            while (i2 < i3) {
                this.at[i2] = heVar.ar(597353088);
                i2++;
            }
        }
    }

    void ax(he heVar, int i) {
        int i2 = 0;
        int ay;
        int i3;
        if (1 == i) {
            ay = heVar.ay((byte) 1);
            this.ap = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ap[i3] = heVar.ay((byte) 1);
            }
            this.aa = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.aa[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.aa[i2] = (heVar.ay((byte) 1) << 16) + this.aa[i2];
                i2++;
            }
        } else if (i == 2) {
            this.ah = heVar.ay((byte) 1) * 1088084504;
        } else if (i == 3) {
            i3 = heVar.au(-310118664);
            this.ai = new int[(i3 + 1)];
            while (i2 < i3) {
                this.ai[i2] = heVar.au(-310118664);
                i2++;
            }
            this.ai[i3] = 9999999;
        } else if (i == 4) {
            this.aw = true;
        } else if (i == 5) {
            this.am = heVar.au(-310118664) * 1303152099;
        } else if (i == 6) {
            this.ae = heVar.ay((byte) 1) * -523144403;
        } else if (i == 7) {
            this.as = heVar.ay((byte) 1) * -991013703;
        } else if (i == 8) {
            this.al = heVar.au(-310118664) * 483391525;
        } else if (i == 9) {
            this.az = heVar.au(-310118664) * -2083118390;
        } else if (i == 10) {
            this.ax = heVar.au(-310118664) * -648623534;
        } else if (11 == i) {
            this.af = heVar.au(-310118664) * 356181285;
        } else if (i == 12) {
            ay = heVar.au(-310118664);
            this.ak = new int[ay];
            for (i3 = 0; i3 < ay; i3++) {
                this.ak[i3] = heVar.ay((byte) 1);
            }
            while (i2 < ay) {
                this.ak[i2] = (heVar.ay((byte) 1) << 16) + this.ak[i2];
                i2++;
            }
        } else if (i == 13) {
            i3 = heVar.au(-310118664);
            this.at = new int[i3];
            while (i2 < i3) {
                this.at[i2] = heVar.ar(597353088);
                i2++;
            }
        }
    }

    void aq(int i) {
        try {
            if (918310743 * this.az == -1) {
                if (this.ai != null) {
                    this.az = 1580734670;
                } else {
                    this.az = 0;
                }
            }
            if (-1 != this.ax * 472938459) {
                return;
            }
            if (this.ai != null) {
                this.ax = -808626010;
            } else {
                this.ax = 0;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ax.aq(" + ')');
        }
    }

    void av() {
        if (918310743 * this.az == -1) {
            if (this.ai != null) {
                this.az = 1580734670;
            } else {
                this.az = 0;
            }
        }
        if (-1 != this.ax * 472938459) {
            return;
        }
        if (this.ai != null) {
            this.ax = -808626010;
        } else {
            this.ax = 0;
        }
    }

    public ct ao(ct ctVar, int i, byte b) {
        boolean z = true;
        try {
            int i2 = this.aa[i];
            be ah = jd.ah(i2 >> 16, -1911710042);
            i2 &= 65535;
            if (ah == null) {
                return ctVar.ac(true);
            }
            if (ah.ac(i2, -1431282372)) {
                z = false;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i2);
            return ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ax.ao(" + ')');
        }
    }

    ct aa(ct ctVar, int i, int i2, int i3) {
        try {
            int i4 = this.aa[i];
            be ah = jd.ah(i4 >> 16, -1904165477);
            int i5 = 65535 & i4;
            if (ah == null) {
                return ctVar.ac(true);
            }
            ct ac = ctVar.ac(!ah.ac(i5, -1710112901));
            int i6 = i2 & 3;
            if (1 == i6) {
                ac.as();
            } else if (2 == i6) {
                ac.ae();
            } else if (3 == i6) {
                ac.am();
            }
            ac.ah(ah, i5);
            if (1 == i6) {
                ac.am();
                return ac;
            } else if (2 == i6) {
                ac.ae();
                return ac;
            } else if (3 != i6) {
                return ac;
            } else {
                ac.as();
                return ac;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ax.aa(" + ')');
        }
    }

    ct ay(ct ctVar, int i, int i2) {
        int i3 = this.aa[i];
        be ah = jd.ah(i3 >> 16, -1690963874);
        int i4 = -998085263 & i3;
        if (ah == null) {
            return ctVar.ac(true);
        }
        boolean z;
        if (ah.ac(i4, -1558258650)) {
            z = false;
        } else {
            z = true;
        }
        ct ac = ctVar.ac(z);
        int i5 = i2 & 3;
        if (1 == i5) {
            ac.as();
        } else if (2 == i5) {
            ac.ae();
        } else if (3 == i5) {
            ac.am();
        }
        ac.ah(ah, i4);
        if (1 == i5) {
            ac.am();
            return ac;
        } else if (2 == i5) {
            ac.ae();
            return ac;
        } else if (3 != i5) {
            return ac;
        } else {
            ac.as();
            return ac;
        }
    }

    ct ab(ct ctVar, int i) {
        boolean z = true;
        int i2 = this.aa[i];
        be ah = jd.ah(i2 >> 16, -2086394562);
        i2 &= 65535;
        if (ah == null) {
            return ctVar.an(true);
        }
        if (ah.ac(i2, -1907671793)) {
            z = false;
        }
        ct an = ctVar.an(z);
        an.ah(ah, i2);
        return an;
    }

    ct ad(ct ctVar, int i) {
        boolean z = true;
        int i2 = this.aa[i];
        be ah = jd.ah(i2 >> 16, -1905385433);
        i2 &= -1967565254;
        if (ah == null) {
            return ctVar.an(true);
        }
        if (ah.ac(i2, -1635542492)) {
            z = false;
        }
        ct an = ctVar.an(z);
        an.ah(ah, i2);
        return an;
    }

    ct ag(ct ctVar, int i) {
        boolean z = true;
        int i2 = this.aa[i];
        be ah = jd.ah(i2 >> 16, -2120243453);
        i2 &= 65535;
        if (ah == null) {
            return ctVar.an(true);
        }
        if (ah.ac(i2, -2099538922)) {
            z = false;
        }
        ct an = ctVar.an(z);
        an.ah(ah, i2);
        return an;
    }

    ct ak(ct ctVar, int i, int i2) {
        boolean z = true;
        try {
            int i3 = this.aa[i];
            be ah = jd.ah(i3 >> 16, -1674244361);
            i3 &= 65535;
            if (ah == null) {
                return ctVar.an(true);
            }
            if (ah.ac(i3, -2094443382)) {
                z = false;
            }
            ct an = ctVar.an(z);
            an.ah(ah, i3);
            return an;
        } catch (Throwable e) {
            throw ei.ac(e, "ax.ak(" + ')');
        }
    }

    ct ar(ct ctVar, int i) {
        boolean z = true;
        int i2 = this.aa[i];
        be ah = jd.ah(i2 >> 16, -1940531493);
        i2 &= 65535;
        if (ah == null) {
            return ctVar.an(true);
        }
        if (ah.ac(i2, -2144876693)) {
            z = false;
        }
        ct an = ctVar.an(z);
        an.ah(ah, i2);
        return an;
    }

    public ct ap(ct ctVar, int i, ax axVar, int i2, byte b) {
        int i3 = 1;
        try {
            int i4 = this.aa[i];
            be ah = jd.ah(i4 >> 16, -1877358611);
            i4 &= 65535;
            if (ah == null) {
                return axVar.ao(ctVar, i2, (byte) 8);
            }
            int i5 = axVar.aa[i2];
            be ah2 = jd.ah(i5 >> 16, -1949990537);
            i5 &= 65535;
            ct ac;
            if (ah2 == null) {
                boolean z;
                if (ah.ac(i4, -1920812943)) {
                    z = false;
                }
                ac = ctVar.ac(z);
                ac.ah(ah, i4);
                return ac;
            }
            int i6;
            if (ah.ac(i4, -1640764522)) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (ah2.ac(i5, -1454726621)) {
                i3 = 0;
            }
            ac = ctVar.ac(i3 & i6);
            ac.ai(ah, i4, ah2, i5, this.ai);
            return ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ax.ap(" + ')');
        }
    }

    public ct bh(ct ctVar, int i, ax axVar, int i2) {
        boolean z = false;
        int i3 = this.aa[i];
        be ah = jd.ah(i3 >> 16, -1794769805);
        int i4 = i3 & 65535;
        if (ah == null) {
            return axVar.ao(ctVar, i2, (byte) 8);
        }
        i3 = axVar.aa[i2];
        be ah2 = jd.ah(i3 >> 16, -1981863782);
        int i5 = i3 & 65535;
        if (ah2 == null) {
            if (!ah.ac(i4, -1551183305)) {
                z = true;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i4);
            return ac;
        }
        int i6;
        if (ah.ac(i4, -1989275797)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (!ah2.ac(i5, -2007925528)) {
            i6 = 1;
        }
        ac = ctVar.ac(i3 & i6);
        ac.ai(ah, i4, ah2, i5, this.ai);
        return ac;
    }

    public ct bm(ct ctVar, int i, ax axVar, int i2) {
        int i3 = 1;
        boolean z = false;
        int i4 = this.aa[i];
        be ah = jd.ah(i4 >> 16, -1908649858);
        int i5 = -392324299 & i4;
        if (ah == null) {
            return axVar.ao(ctVar, i2, (byte) 8);
        }
        i4 = axVar.aa[i2];
        be ah2 = jd.ah(i4 >> 16, -2010479703);
        int i6 = -1675747592 & i4;
        if (ah2 == null) {
            if (!ah.ac(i5, -1438674597)) {
                z = true;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i5);
            return ac;
        }
        if (ah.ac(i5, -1730969917)) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (ah2.ac(i6, -2047884824)) {
            i3 = 0;
        }
        ac = ctVar.ac(i4 & i3);
        ac.ai(ah, i5, ah2, i6, this.ai);
        return ac;
    }

    public ct bp(ct ctVar, int i, ax axVar, int i2) {
        boolean z = true;
        int i3 = 0;
        int i4 = this.aa[i];
        be ah = jd.ah(i4 >> 16, -1786348923);
        i4 &= 65535;
        if (ah == null) {
            return axVar.ao(ctVar, i2, (byte) 8);
        }
        int i5 = axVar.aa[i2];
        be ah2 = jd.ah(i5 >> 16, -1950670640);
        i5 &= 1834784094;
        if (ah2 == null) {
            if (ah.ac(i4, -1888422907)) {
                z = false;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i4);
            return ac;
        }
        int i6;
        if (ah.ac(i4, -1596423082)) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        if (!ah2.ac(i5, -1518927257)) {
            i3 = 1;
        }
        ac = ctVar.ac(i6 & i3);
        ac.ai(ah, i4, ah2, i5, this.ai);
        return ac;
    }

    public ct bt(ct ctVar, int i, ax axVar, int i2) {
        int i3 = 0;
        int i4 = this.aa[i];
        be ah = jd.ah(i4 >> 16, -1888404705);
        int i5 = 1593552415 & i4;
        if (ah == null) {
            return axVar.ao(ctVar, i2, (byte) 8);
        }
        i4 = axVar.aa[i2];
        be ah2 = jd.ah(i4 >> 16, -2104712644);
        int i6 = -1719121300 & i4;
        if (ah2 == null) {
            boolean z;
            if (!ah.ac(i5, -1661819683)) {
                z = true;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i5);
            return ac;
        }
        if (ah.ac(i5, -1415777041)) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (!ah2.ac(i6, -1462301852)) {
            i3 = 1;
        }
        ac = ctVar.ac(i4 & i3);
        ac.ai(ah, i5, ah2, i6, this.ai);
        return ac;
    }

    public ct at(ct ctVar, int i, int i2) {
        int i3 = true;
        try {
            int i4 = this.aa[i];
            be ah = jd.ah(i4 >> 16, -1670457949);
            int i5 = i4 & 65535;
            if (ah == null) {
                return ctVar.ac(true);
            }
            int i6;
            be beVar;
            if (this.ak == null || i >= this.ak.length) {
                i6 = 0;
                beVar = null;
            } else {
                i4 = this.ak[i];
                beVar = jd.ah(i4 >> 16, -2122010074);
                i6 = i4 & 65535;
            }
            ct ac;
            if (beVar == null || i6 == 65535) {
                boolean z;
                if (ah.ac(i5, -1562036012)) {
                    z = false;
                }
                ac = ctVar.ac(z);
                ac.ah(ah, i5);
                return ac;
            }
            if (ah.ac(i5, -1989202773)) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            if (beVar.ac(i6, -1500073802)) {
                i3 = 0;
            }
            ac = ctVar.ac(i3 & i4);
            ac.ah(ah, i5);
            ac.ah(beVar, i6);
            return ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ax.at(" + ')');
        }
    }

    public ct br(ct ctVar, int i) {
        int i2 = true;
        int i3 = this.aa[i];
        be ah = jd.ah(i3 >> 16, -2081131296);
        int i4 = i3 & 65535;
        if (ah == null) {
            return ctVar.ac(true);
        }
        int i5;
        be beVar;
        if (this.ak == null || i >= this.ak.length) {
            i5 = 0;
            beVar = null;
        } else {
            i3 = this.ak[i];
            beVar = jd.ah(i3 >> 16, -1962369360);
            i5 = i3 & 65535;
        }
        if (beVar == null || i5 == 65535) {
            boolean z;
            if (ah.ac(i4, -2094506478)) {
                z = false;
            }
            ct ac = ctVar.ac(z);
            ac.ah(ah, i4);
            return ac;
        }
        if (ah.ac(i4, -1755736743)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (beVar.ac(i5, -1481393897)) {
            i2 = 0;
        }
        ac = ctVar.ac(i3 & i2);
        ac.ah(ah, i4);
        ac.ah(beVar, i5);
        return ac;
    }

    static be bb(int i) {
        be beVar = (be) ao.aj((long) i);
        if (beVar == null) {
            beVar = di.aj(ac, an, i, false, -513886420);
            if (beVar != null) {
                ao.an(beVar, (long) i);
            }
        }
        return beVar;
    }

    static be bu(int i) {
        be beVar = (be) ao.aj((long) i);
        if (beVar == null) {
            beVar = di.aj(ac, an, i, false, -513886420);
            if (beVar != null) {
                ao.an(beVar, (long) i);
            }
        }
        return beVar;
    }

    public static void bd(Collection collection) {
        collection.add(aq);
        collection.add(ao);
    }
}
