package defpackage;

import java.util.Collection;

public class ab extends jt {
    public static ab[][] aa = null;
    public static String ac = null;
    static js ae = new js(20, null);
    public static final int aj = 13;
    public static boolean al = false;
    static js am = new js(50, null);
    public static final int an = 1339;
    public static ju ap = null;
    public static final int aq = 8;
    static js as = new js(8, null);
    static js aw = new js(fr.ak, null);
    public int ab = 0;
    public int ad = 0;
    public int af = 63936127;
    public int ag = 0;
    public int ar = 0;
    public int au;
    public int av = 0;
    public int ax = 1349417461;
    public int ay = 0;
    public boolean az = false;
    public int ba = 0;
    public int bb = 0;
    public int bc = 0;
    public int bd = 0;
    public int be = 0;
    public int bf = -816123949;
    public fj bg = fj.aj;
    public int bh = 0;
    public int bi = -1141617647;
    public int bj = 0;
    public int bk = 0;
    public boolean bl = false;
    public int bm = 0;
    public boolean bn = false;
    public int bo = 0;
    public int bp = 0;
    public int bq = 0;
    public int br = 0;
    public boolean bs = false;
    public int bt = 0;
    public int bu = 0;
    public int bv = 0;
    public int bw = 0;
    public int bx = 1843547053;
    public int by = -252185443;
    public int bz = 0;
    public boolean ca;
    public int cb = 1636058231;
    public int cc = 0;
    public int cd = 0;
    public int ce = -1091775395;
    public int cf = 0;
    public int cg = 0;
    public int ch = 1167224901;
    public int ci = 0;
    public String cj = "";
    int ck = 1251920779;
    public int cl = 0;
    int cm = 1906967017;
    public int cn = -1327846898;
    public boolean co = false;
    public int cp = -70120369;
    public int cq = 0;
    public boolean cr;
    public int cs = 1387695412;
    public int ct = 1320879157;
    public int cu = 0;
    public int cv = 0;
    public boolean cw = false;
    public int cx = 0;
    public int cy = -197821145;
    public int cz = -1453901265;
    public String[] da;
    public int db = 0;
    public Object[] dc;
    public int[] dd;
    public boolean de = false;
    public Object[] df;
    public Object[] dg;
    public int dh = 0;
    public int di = 0;
    public boolean dj = false;
    public String dk = "";
    public int dl = 0;
    public boolean dm = false;
    public Object[] dn;
    public int do = 0;
    public int dp = 0;
    public ab dq = null;
    public int[] dr;
    public int[] ds;
    public int dt = 0;
    public Object[] du;
    public String[] dv;
    public String dw = "";
    public int dx = 0;
    public Object[] dy;
    public String dz = "";
    public Object[] ea;
    public int[] eb;
    public Object[] ec;
    public Object[] ed;
    public Object[] ee;
    public Object[] ef;
    public Object[] eg;
    public Object[] eh;
    public Object[] ei;
    public Object[] ej;
    public Object[] ek;
    public int[] el;
    public Object[] em;
    public Object[] en;
    public Object[] eo;
    public Object[] ep;
    public Object[] eq;
    public Object[] er;
    public int[][] es;
    public Object[] et;
    public Object[] eu;
    public Object[] ev;
    public Object[] ew;
    public int[] ex;
    public Object[] ey;
    public Object[] ez;
    public int fb = 0;
    public int fc = 0;
    public String fd = ix.ao;
    public boolean fe = false;
    public boolean ff = false;
    public boolean fg = false;
    public int[] fh;
    public int[] fi;
    public int[] fj;
    public int fk = 0;
    public String fl = "";
    public int fm = 0;
    public int fn = -900547707;
    public int fo = 0;
    public int fq = -651140467;
    public int fs = -199116227;
    public ab[] ft;
    public int fu = -93522733;
    public int[] fv;
    public int fw = 595854095;
    public boolean fx = false;
    public int fz = 0;

    public static ab al(int i) {
        int i2 = i >> 16;
        int i3 = 65535 & i;
        if ((aa[i2] == null || aa[i2][i3] == null) && !ku.an(i2, 1671262481)) {
            return null;
        }
        return aa[i2][i3];
    }

    public static ab ax(int i, int i2) {
        ab aj = ac.aj(i, 781837341);
        if (-1 == i2) {
            return aj;
        }
        if (aj == null || aj.ft == null || i2 >= aj.ft.length) {
            return null;
        }
        return aj.ft[i2];
    }

    public static ab az(int i, int i2) {
        ab aj = ac.aj(i, 1501662756);
        if (-1 == i2) {
            return aj;
        }
        if (aj == null || aj.ft == null || i2 >= aj.ft.length) {
            return null;
        }
        return aj.ft[i2];
    }

    public static boolean af(int i) {
        if (hc.ak[i]) {
            return true;
        }
        if (!ap.ak(i, 495240548)) {
            return false;
        }
        int as = ap.as(i, 415667447);
        if (as == 0) {
            hc.ak[i] = true;
            return true;
        }
        if (aa[i] == null) {
            aa[i] = new ab[as];
        }
        for (int i2 = 0; i2 < as; i2++) {
            if (aa[i][i2] == null) {
                byte[] an = ap.an(i, i2, -1775658838);
                if (an != null) {
                    aa[i][i2] = new ab();
                    aa[i][i2].ax = -1349417461 * ((i << 16) + i2);
                    if (an[0] == (byte) -1) {
                        aa[i][i2].ao(new he(an), -1722909765);
                    } else {
                        aa[i][i2].aq(new he(an), 1099076211);
                    }
                }
            }
        }
        hc.ak[i] = true;
        return true;
    }

    public static boolean au(int i) {
        if (hc.ak[i]) {
            return true;
        }
        if (!ap.ak(i, -1523244595)) {
            return false;
        }
        int as = ap.as(i, 415667447);
        if (as == 0) {
            hc.ak[i] = true;
            return true;
        }
        if (aa[i] == null) {
            aa[i] = new ab[as];
        }
        for (int i2 = 0; i2 < as; i2++) {
            if (aa[i][i2] == null) {
                byte[] an = ap.an(i, i2, -1489477975);
                if (an != null) {
                    aa[i][i2] = new ab();
                    aa[i][i2].ax = -1349417461 * ((i << 16) + i2);
                    if (an[0] == (byte) -1) {
                        aa[i][i2].ao(new he(an), -1583795033);
                    } else {
                        aa[i][i2].aq(new he(an), -203509029);
                    }
                }
            }
        }
        hc.ak[i] = true;
        return true;
    }

    void ag(he heVar) {
        int i;
        boolean z;
        int i2 = 0;
        this.az = false;
        this.au = heVar.au(-310118664) * 1336621041;
        this.av = heVar.au(-310118664) * 1897932349;
        this.ay = heVar.ay((byte) 1) * -627715993;
        this.bp = heVar.ag((byte) -1) * -1417920705;
        this.bm = heVar.ag((byte) -1) * -1853492355;
        this.bh = heVar.ay((byte) 1) * -2106482954;
        this.bt = heVar.ay((byte) 1) * -220449112;
        this.bc = heVar.au(-310118664) * 947459509;
        this.bi = heVar.ay((byte) 1) * 1554970081;
        if (this.bi * -464117830 == 65535) {
            this.bi = -1534018356;
        } else {
            this.bi = (((1967688113 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
        }
        this.fn = heVar.ay((byte) 1) * -86708080;
        if (-119539270 == this.fn * -31720781) {
            this.fn = -1412858039;
        }
        int au = heVar.au(-310118664);
        if (au > 0) {
            this.fj = new int[au];
            this.fi = new int[au];
            for (i = 0; i < au; i++) {
                this.fj[i] = heVar.au(-310118664);
                this.fi[i] = heVar.ay((byte) 1);
            }
        }
        int au2 = heVar.au(-310118664);
        if (au2 > 0) {
            this.es = new int[au2][];
            for (au = 0; au < au2; au++) {
                int ay = heVar.ay((byte) 1);
                this.es[au] = new int[ay];
                for (i = 0; i < ay; i++) {
                    this.es[au][i] = heVar.ay((byte) 1);
                    if (this.es[au][i] == 65535) {
                        this.es[au][i] = -1;
                    }
                }
            }
        }
        if (this.au * -1728011861 == 0) {
            this.bj = heVar.ay((byte) 1) * 2050876285;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bs = z;
        }
        if (this.au * -1999477681 == 1) {
            heVar.ay((byte) 1);
            heVar.au(-310118664);
        }
        if (this.au * -1999477681 == 2) {
            this.fv = new int[((863838433 * this.bh) * (this.bt * 1617666421))];
            this.fh = new int[((this.bh * 1744651829) * (this.bt * 1617666421))];
            if (1 == heVar.au(-310118664)) {
                this.di = 1700096121 * ((-882324270 * this.di) | -1002201908);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 177034794 * ((-1649638967 * this.di) | 1073741824);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 1700096121 * ((-466596089 * this.di) | Integer.MIN_VALUE);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = ((this.di * -1649638967) | -2108280220) * -1535230698;
            }
            this.dx = heVar.au(-310118664) * 352613278;
            this.dp = heVar.au(-310118664) * 862437533;
            this.dr = new int[20];
            this.dd = new int[20];
            this.ds = new int[20];
            for (i = 0; i < 20; i++) {
                if (heVar.au(-310118664) == 1) {
                    this.dr[i] = heVar.ag((byte) -1);
                    this.dd[i] = heVar.ag((byte) -1);
                    this.ds[i] = heVar.ad((byte) -30);
                } else {
                    this.ds[i] = -1;
                }
            }
            this.da = new String[5];
            for (i = 0; i < 5; i++) {
                String bh = heVar.bh(-1617069743);
                if (bh.length() > 0) {
                    this.da[i] = bh;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i + 23)));
                }
            }
        }
        if (3 == this.au * -50842961) {
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bn = z;
        }
        if (-1999477681 * this.au == 4 || -1999477681 * this.au == 1) {
            this.db = heVar.au(-310118664) * 428331108;
            this.dl = heVar.au(-310118664) * -1610227479;
            this.dh = heVar.au(-310118664) * -430353575;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (-1668173007 * this.cz == 65535) {
                this.cz = -868750998;
            }
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
        }
        if (this.au * -995132193 == 4) {
            this.cj = heVar.bh(-307392362);
            this.dk = heVar.bh(735676812);
        }
        if (this.au * -1194802963 == 1 || 3 == 45327288 * this.au || 4 == this.au * -1999477681) {
            this.ba = heVar.ad((byte) -51) * 1402931311;
        }
        if (1974706701 * this.au == 3 || 4 == this.au * -1298208213) {
            this.bv = heVar.ad((byte) -121) * -1887670743;
            this.be = heVar.ad((byte) -23) * 628257225;
            this.bw = heVar.ad((byte) -25) * -595451759;
        }
        if (this.au * 2015330091 == 5) {
            this.cb = heVar.ad((byte) -100) * -1636058231;
            this.cy = heVar.ad((byte) -2) * -1110398487;
        }
        if (1248958114 * this.au == 6) {
            this.cp = -1438902427;
            this.ct = heVar.ay((byte) 1) * -1320879157;
            if (2051854819 * this.ct == 159500053) {
                this.ct = -1145218935;
            }
            this.cm = 599679258;
            this.ck = heVar.ay((byte) 1) * -1251920779;
            if (1955732987 == 2010657678 * this.ck) {
                this.ck = 1251920779;
            }
            this.ce = heVar.ay((byte) 1) * 1091775395;
            if (this.ce * 1914019578 == 65535) {
                this.ce = -1600596583;
            }
            this.ch = heVar.ay((byte) 1) * -1167224901;
            if (-2049122957 * this.ch == -1679466289) {
                this.ch = -1173374272;
            }
            this.cs = heVar.ay((byte) 1) * 2145901364;
            this.cv = heVar.ay((byte) 1) * 1949819647;
            this.cu = heVar.ay((byte) 1) * 1148010996;
        }
        if (1552426597 * this.au == 7) {
            this.fv = new int[((this.bt * 1617666421) * (1281846812 * this.bh))];
            this.fh = new int[((this.bt * 1617666421) * (796060636 * this.bh))];
            this.db = heVar.au(-310118664) * 1405905143;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (this.cz * 1270142092 == 14847026) {
                this.cz = -1453901265;
            }
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
            this.ba = heVar.ad((byte) -117) * 1402931311;
            this.dx = heVar.ag((byte) -1) * -1298794137;
            this.dp = heVar.ag((byte) -1) * -1235564531;
            if (heVar.au(-310118664) == 1) {
                this.di = ((1515781579 * this.di) | 1073741824) * 1700096121;
            }
            this.da = new String[5];
            while (i2 < 5) {
                String bh2 = heVar.bh(151262336);
                if (bh2.length() > 0) {
                    this.da[i2] = bh2;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i2 + 23)));
                }
                i2++;
            }
        }
        if (8 == this.au * 90286947) {
            this.cj = heVar.bh(-495594956);
        }
        if (2 == 481818077 * this.av || -1999477681 * this.au == 2) {
            this.dz = heVar.bh(683941042);
            this.fl = heVar.bh(-1508775023);
            this.di = (((heVar.ay((byte) 1) & 128764804) << 11) | (-1649638967 * this.di)) * 358532671;
        }
        if (1729831189 * this.av == 1 || 4 == 380455876 * this.av || 5 == this.av * 1729831189 || 6 == -2019116683 * this.av) {
            this.fd = heVar.bh(525394401);
            if (this.fd.length() == 0) {
                if (1869374849 * this.av == 1) {
                    this.fd = ix.ao;
                }
                if (1729831189 * this.av == 4) {
                    this.fd = ix.aa;
                }
                if (5 == 1729831189 * this.av) {
                    this.fd = ix.aa;
                }
                if (6 == 1729831189 * this.av) {
                    this.fd = ix.ak;
                }
            }
        }
        if (1 == this.av * 1729831189 || this.av * 1729831189 == 4 || 5 == this.av * 1729831189) {
            this.di = -1669877285 * ((-848781045 * this.di) | -1617176317);
        }
        if (this.av * -420204930 == 6) {
            this.di = ((-1649638967 * this.di) | 1) * 1700096121;
        }
    }

    void aq(he heVar, int i) {
        int i2 = 0;
        try {
            int i3;
            boolean z;
            this.az = false;
            this.au = heVar.au(-310118664) * 1384788655;
            this.av = heVar.au(-310118664) * 1897932349;
            this.ay = heVar.ay((byte) 1) * -627715993;
            this.bp = heVar.ag((byte) -1) * 1673110939;
            this.bm = heVar.ag((byte) -1) * -1642095603;
            this.bh = heVar.ay((byte) 1) * 897710629;
            this.bt = heVar.ay((byte) 1) * -325228835;
            this.bc = heVar.au(-310118664) * 947459509;
            this.bi = heVar.ay((byte) 1) * 1141617647;
            if (this.bi * -1228023025 == 65535) {
                this.bi = -1141617647;
            } else {
                this.bi = (((-1035840093 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
            }
            this.fn = heVar.ay((byte) 1) * 900547707;
            if (65535 == this.fn * -31720781) {
                this.fn = -900547707;
            }
            int au = heVar.au(-310118664);
            if (au > 0) {
                this.fj = new int[au];
                this.fi = new int[au];
                for (i3 = 0; i3 < au; i3++) {
                    this.fj[i3] = heVar.au(-310118664);
                    this.fi[i3] = heVar.ay((byte) 1);
                }
            }
            int au2 = heVar.au(-310118664);
            if (au2 > 0) {
                this.es = new int[au2][];
                for (au = 0; au < au2; au++) {
                    int ay = heVar.ay((byte) 1);
                    this.es[au] = new int[ay];
                    for (i3 = 0; i3 < ay; i3++) {
                        this.es[au][i3] = heVar.ay((byte) 1);
                        if (this.es[au][i3] == 65535) {
                            this.es[au][i3] = -1;
                        }
                    }
                }
            }
            if (this.au * -1999477681 == 0) {
                this.bj = heVar.ay((byte) 1) * 2050876285;
                if (heVar.au(-310118664) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.bs = z;
            }
            if (this.au * -1999477681 == 1) {
                heVar.ay((byte) 1);
                heVar.au(-310118664);
            }
            if (this.au * -1999477681 == 2) {
                this.fv = new int[((-702574163 * this.bh) * (this.bt * 1617666421))];
                this.fh = new int[((this.bh * -702574163) * (this.bt * 1617666421))];
                if (1 == heVar.au(-310118664)) {
                    this.di = 1700096121 * ((-1649638967 * this.di) | 268435456);
                }
                if (heVar.au(-310118664) == 1) {
                    this.di = 1700096121 * ((-1649638967 * this.di) | 1073741824);
                }
                if (heVar.au(-310118664) == 1) {
                    this.di = 1700096121 * ((-1649638967 * this.di) | Integer.MIN_VALUE);
                }
                if (heVar.au(-310118664) == 1) {
                    this.di = ((this.di * -1649638967) | dd.ak) * 1700096121;
                }
                this.dx = heVar.au(-310118664) * -1696560003;
                this.dp = heVar.au(-310118664) * -1235564531;
                this.dr = new int[20];
                this.dd = new int[20];
                this.ds = new int[20];
                for (i3 = 0; i3 < 20; i3++) {
                    if (heVar.au(-310118664) == 1) {
                        this.dr[i3] = heVar.ag((byte) -1);
                        this.dd[i3] = heVar.ag((byte) -1);
                        this.ds[i3] = heVar.ad((byte) -19);
                    } else {
                        this.ds[i3] = -1;
                    }
                }
                this.da = new String[5];
                for (i3 = 0; i3 < 5; i3++) {
                    String bh = heVar.bh(333169901);
                    if (bh.length() > 0) {
                        this.da[i3] = bh;
                        this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i3 + 23)));
                    }
                }
            }
            if (3 == this.au * -1999477681) {
                if (heVar.au(-310118664) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.bn = z;
            }
            if (this.au * -1999477681 == 4 || this.au * -1999477681 == 1) {
                this.db = heVar.au(-310118664) * 1146478291;
                this.dl = heVar.au(-310118664) * -1610227479;
                this.dh = heVar.au(-310118664) * 636698837;
                this.cz = heVar.ay((byte) 1) * 1453901265;
                if (-1668173007 * this.cz == 65535) {
                    this.cz = -1453901265;
                }
                if (heVar.au(-310118664) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.de = z;
            }
            if (this.au * -1999477681 == 4) {
                this.cj = heVar.bh(30075106);
                this.dk = heVar.bh(246460841);
            }
            if (this.au * -1999477681 == 1 || 3 == this.au * -1999477681 || 4 == this.au * -1999477681) {
                this.ba = heVar.ad((byte) -26) * 1402931311;
            }
            if (this.au * -1999477681 == 3 || 4 == this.au * -1999477681) {
                this.bv = heVar.ad((byte) -48) * -1887670743;
                this.be = heVar.ad((byte) -58) * -316578243;
                this.bw = heVar.ad((byte) -53) * -595451759;
            }
            if (this.au * -1999477681 == 5) {
                this.cb = heVar.ad((byte) -46) * -1636058231;
                this.cy = heVar.ad((byte) -6) * 197821145;
            }
            if (this.au * -1999477681 == 6) {
                this.cp = -70120369;
                this.ct = heVar.ay((byte) 1) * -1320879157;
                if (2051854819 * this.ct == 65535) {
                    this.ct = 1320879157;
                }
                this.cm = 1906967017;
                this.ck = heVar.ay((byte) 1) * -1251920779;
                if (65535 == 2032925661 * this.ck) {
                    this.ck = 1251920779;
                }
                this.ce = heVar.ay((byte) 1) * 1091775395;
                if (this.ce * 703619083 == 65535) {
                    this.ce = -1091775395;
                }
                this.ch = heVar.ay((byte) 1) * -1167224901;
                if (-2049122957 * this.ch == 65535) {
                    this.ch = 1167224901;
                }
                this.cs = heVar.ay((byte) 1) * -2004757675;
                this.cv = heVar.ay((byte) 1) * -666819087;
                this.cu = heVar.ay((byte) 1) * 1231133277;
            }
            if (this.au * -1999477681 == 7) {
                this.fv = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
                this.fh = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
                this.db = heVar.au(-310118664) * 1146478291;
                this.cz = heVar.ay((byte) 1) * 1453901265;
                if (this.cz * -1668173007 == 65535) {
                    this.cz = -1453901265;
                }
                if (heVar.au(-310118664) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.de = z;
                this.ba = heVar.ad((byte) -79) * 1402931311;
                this.dx = heVar.ag((byte) -1) * -1696560003;
                this.dp = heVar.ag((byte) -1) * -1235564531;
                if (heVar.au(-310118664) == 1) {
                    this.di = ((-1649638967 * this.di) | 1073741824) * 1700096121;
                }
                this.da = new String[5];
                while (i2 < 5) {
                    String bh2 = heVar.bh(-1079984595);
                    if (bh2.length() > 0) {
                        this.da[i2] = bh2;
                        this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i2 + 23)));
                    }
                    i2++;
                }
            }
            if (8 == this.au * -1999477681) {
                this.cj = heVar.bh(-1073885281);
            }
            if (2 == this.av * 1729831189 || this.au * -1999477681 == 2) {
                this.dz = heVar.bh(-632692692);
                this.fl = heVar.bh(21992470);
                this.di = (((heVar.ay((byte) 1) & 63) << 11) | (-1649638967 * this.di)) * 1700096121;
            }
            if (this.av * 1729831189 == 1 || 4 == this.av * 1729831189 || 5 == this.av * 1729831189 || 6 == this.av * 1729831189) {
                this.fd = heVar.bh(-1183512690);
                if (this.fd.length() == 0) {
                    if (this.av * 1729831189 == 1) {
                        this.fd = ix.ao;
                    }
                    if (this.av * 1729831189 == 4) {
                        this.fd = ix.aa;
                    }
                    if (5 == this.av * 1729831189) {
                        this.fd = ix.aa;
                    }
                    if (6 == this.av * 1729831189) {
                        this.fd = ix.ak;
                    }
                }
            }
            if (1 == this.av * 1729831189 || this.av * 1729831189 == 4 || 5 == this.av * 1729831189) {
                this.di = 1700096121 * ((-1649638967 * this.di) | 4194304);
            }
            if (this.av * 1729831189 == 6) {
                this.di = ((-1649638967 * this.di) | 1) * 1700096121;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ab.aq(" + ')');
        }
    }

    void av(he heVar) {
        int i;
        boolean z;
        int i2 = 0;
        this.az = false;
        this.au = heVar.au(-310118664) * 1384788655;
        this.av = heVar.au(-310118664) * 1897932349;
        this.ay = heVar.ay((byte) 1) * -627715993;
        this.bp = heVar.ag((byte) -1) * 1673110939;
        this.bm = heVar.ag((byte) -1) * -1642095603;
        this.bh = heVar.ay((byte) 1) * 897710629;
        this.bt = heVar.ay((byte) 1) * -325228835;
        this.bc = heVar.au(-310118664) * 947459509;
        this.bi = heVar.ay((byte) 1) * 1141617647;
        if (this.bi * -1228023025 == 65535) {
            this.bi = -1141617647;
        } else {
            this.bi = (((-1035840093 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
        }
        this.fn = heVar.ay((byte) 1) * 900547707;
        if (65535 == this.fn * -31720781) {
            this.fn = -900547707;
        }
        int au = heVar.au(-310118664);
        if (au > 0) {
            this.fj = new int[au];
            this.fi = new int[au];
            for (i = 0; i < au; i++) {
                this.fj[i] = heVar.au(-310118664);
                this.fi[i] = heVar.ay((byte) 1);
            }
        }
        int au2 = heVar.au(-310118664);
        if (au2 > 0) {
            this.es = new int[au2][];
            for (au = 0; au < au2; au++) {
                int ay = heVar.ay((byte) 1);
                this.es[au] = new int[ay];
                for (i = 0; i < ay; i++) {
                    this.es[au][i] = heVar.ay((byte) 1);
                    if (this.es[au][i] == 65535) {
                        this.es[au][i] = -1;
                    }
                }
            }
        }
        if (this.au * -1999477681 == 0) {
            this.bj = heVar.ay((byte) 1) * 2050876285;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bs = z;
        }
        if (this.au * -1999477681 == 1) {
            heVar.ay((byte) 1);
            heVar.au(-310118664);
        }
        if (this.au * -1999477681 == 2) {
            this.fv = new int[((-702574163 * this.bh) * (this.bt * 1617666421))];
            this.fh = new int[((this.bh * -702574163) * (this.bt * 1617666421))];
            if (1 == heVar.au(-310118664)) {
                this.di = 1700096121 * ((-1649638967 * this.di) | 268435456);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 1700096121 * ((-1649638967 * this.di) | 1073741824);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 1700096121 * ((-1649638967 * this.di) | Integer.MIN_VALUE);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = ((this.di * -1649638967) | dd.ak) * 1700096121;
            }
            this.dx = heVar.au(-310118664) * -1696560003;
            this.dp = heVar.au(-310118664) * -1235564531;
            this.dr = new int[20];
            this.dd = new int[20];
            this.ds = new int[20];
            for (i = 0; i < 20; i++) {
                if (heVar.au(-310118664) == 1) {
                    this.dr[i] = heVar.ag((byte) -1);
                    this.dd[i] = heVar.ag((byte) -1);
                    this.ds[i] = heVar.ad((byte) -19);
                } else {
                    this.ds[i] = -1;
                }
            }
            this.da = new String[5];
            for (i = 0; i < 5; i++) {
                String bh = heVar.bh(83822599);
                if (bh.length() > 0) {
                    this.da[i] = bh;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i + 23)));
                }
            }
        }
        if (3 == this.au * -1999477681) {
            this.bn = heVar.au(-310118664) == 1;
        }
        if (this.au * -1999477681 == 4 || this.au * -1999477681 == 1) {
            this.db = heVar.au(-310118664) * 1146478291;
            this.dl = heVar.au(-310118664) * -1610227479;
            this.dh = heVar.au(-310118664) * 636698837;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (-1668173007 * this.cz == 65535) {
                this.cz = -1453901265;
            }
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
        }
        if (this.au * -1999477681 == 4) {
            this.cj = heVar.bh(-1912565225);
            this.dk = heVar.bh(-496450876);
        }
        if (this.au * -1999477681 == 1 || 3 == this.au * -1999477681 || 4 == this.au * -1999477681) {
            this.ba = heVar.ad((byte) -119) * 1402931311;
        }
        if (this.au * -1999477681 == 3 || 4 == this.au * -1999477681) {
            this.bv = heVar.ad((byte) -5) * -1887670743;
            this.be = heVar.ad((byte) -115) * -316578243;
            this.bw = heVar.ad((byte) -115) * -595451759;
        }
        if (this.au * -1999477681 == 5) {
            this.cb = heVar.ad((byte) -53) * -1636058231;
            this.cy = heVar.ad((byte) -109) * 197821145;
        }
        if (this.au * -1999477681 == 6) {
            this.cp = -70120369;
            this.ct = heVar.ay((byte) 1) * -1320879157;
            if (2051854819 * this.ct == 65535) {
                this.ct = 1320879157;
            }
            this.cm = 1906967017;
            this.ck = heVar.ay((byte) 1) * -1251920779;
            if (65535 == 2032925661 * this.ck) {
                this.ck = 1251920779;
            }
            this.ce = heVar.ay((byte) 1) * 1091775395;
            if (this.ce * 703619083 == 65535) {
                this.ce = -1091775395;
            }
            this.ch = heVar.ay((byte) 1) * -1167224901;
            if (-2049122957 * this.ch == 65535) {
                this.ch = 1167224901;
            }
            this.cs = heVar.ay((byte) 1) * -2004757675;
            this.cv = heVar.ay((byte) 1) * -666819087;
            this.cu = heVar.ay((byte) 1) * 1231133277;
        }
        if (this.au * -1999477681 == 7) {
            this.fv = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
            this.fh = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
            this.db = heVar.au(-310118664) * 1146478291;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (this.cz * -1668173007 == 65535) {
                this.cz = -1453901265;
            }
            this.de = heVar.au(-310118664) == 1;
            this.ba = heVar.ad((byte) -58) * 1402931311;
            this.dx = heVar.ag((byte) -1) * -1696560003;
            this.dp = heVar.ag((byte) -1) * -1235564531;
            if (heVar.au(-310118664) == 1) {
                this.di = ((-1649638967 * this.di) | 1073741824) * 1700096121;
            }
            this.da = new String[5];
            while (i2 < 5) {
                String bh2 = heVar.bh(-1606605121);
                if (bh2.length() > 0) {
                    this.da[i2] = bh2;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i2 + 23)));
                }
                i2++;
            }
        }
        if (8 == this.au * -1999477681) {
            this.cj = heVar.bh(-1247962277);
        }
        if (2 == this.av * 1729831189 || this.au * -1999477681 == 2) {
            this.dz = heVar.bh(-1568218064);
            this.fl = heVar.bh(-1792630138);
            this.di = (((heVar.ay((byte) 1) & 63) << 11) | (-1649638967 * this.di)) * 1700096121;
        }
        if (this.av * 1729831189 == 1 || 4 == this.av * 1729831189 || 5 == this.av * 1729831189 || 6 == this.av * 1729831189) {
            this.fd = heVar.bh(-83226554);
            if (this.fd.length() == 0) {
                if (this.av * 1729831189 == 1) {
                    this.fd = ix.ao;
                }
                if (this.av * 1729831189 == 4) {
                    this.fd = ix.aa;
                }
                if (5 == this.av * 1729831189) {
                    this.fd = ix.aa;
                }
                if (6 == this.av * 1729831189) {
                    this.fd = ix.ak;
                }
            }
        }
        if (1 == this.av * 1729831189 || this.av * 1729831189 == 4 || 5 == this.av * 1729831189) {
            this.di = 1700096121 * ((-1649638967 * this.di) | 4194304);
        }
        if (this.av * 1729831189 == 6) {
            this.di = ((-1649638967 * this.di) | 1) * 1700096121;
        }
    }

    void ay(he heVar) {
        int i;
        boolean z;
        int i2 = 0;
        this.az = false;
        this.au = heVar.au(-310118664) * 1384788655;
        this.av = heVar.au(-310118664) * 1897932349;
        this.ay = heVar.ay((byte) 1) * -627715993;
        this.bp = heVar.ag((byte) -1) * 1673110939;
        this.bm = heVar.ag((byte) -1) * -1642095603;
        this.bh = heVar.ay((byte) 1) * 897710629;
        this.bt = heVar.ay((byte) 1) * -325228835;
        this.bc = heVar.au(-310118664) * 947459509;
        this.bi = heVar.ay((byte) 1) * 1141617647;
        if (this.bi * -1228023025 == 65535) {
            this.bi = -1141617647;
        } else {
            this.bi = (((-1035840093 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
        }
        this.fn = heVar.ay((byte) 1) * 900547707;
        if (65535 == this.fn * -31720781) {
            this.fn = -900547707;
        }
        int au = heVar.au(-310118664);
        if (au > 0) {
            this.fj = new int[au];
            this.fi = new int[au];
            for (i = 0; i < au; i++) {
                this.fj[i] = heVar.au(-310118664);
                this.fi[i] = heVar.ay((byte) 1);
            }
        }
        int au2 = heVar.au(-310118664);
        if (au2 > 0) {
            this.es = new int[au2][];
            for (au = 0; au < au2; au++) {
                int ay = heVar.ay((byte) 1);
                this.es[au] = new int[ay];
                for (i = 0; i < ay; i++) {
                    this.es[au][i] = heVar.ay((byte) 1);
                    if (this.es[au][i] == 65535) {
                        this.es[au][i] = -1;
                    }
                }
            }
        }
        if (this.au * -1999477681 == 0) {
            this.bj = heVar.ay((byte) 1) * 2050876285;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bs = z;
        }
        if (this.au * -1999477681 == 1) {
            heVar.ay((byte) 1);
            heVar.au(-310118664);
        }
        if (this.au * -1999477681 == 2) {
            this.fv = new int[((-702574163 * this.bh) * (this.bt * 1617666421))];
            this.fh = new int[((this.bh * -702574163) * (this.bt * 1617666421))];
            if (1 == heVar.au(-310118664)) {
                this.di = 1700096121 * ((-1649638967 * this.di) | 268435456);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 1700096121 * ((-1649638967 * this.di) | 1073741824);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = 1700096121 * ((-1649638967 * this.di) | Integer.MIN_VALUE);
            }
            if (heVar.au(-310118664) == 1) {
                this.di = ((this.di * -1649638967) | dd.ak) * 1700096121;
            }
            this.dx = heVar.au(-310118664) * -1696560003;
            this.dp = heVar.au(-310118664) * -1235564531;
            this.dr = new int[20];
            this.dd = new int[20];
            this.ds = new int[20];
            for (i = 0; i < 20; i++) {
                if (heVar.au(-310118664) == 1) {
                    this.dr[i] = heVar.ag((byte) -1);
                    this.dd[i] = heVar.ag((byte) -1);
                    this.ds[i] = heVar.ad((byte) -70);
                } else {
                    this.ds[i] = -1;
                }
            }
            this.da = new String[5];
            for (i = 0; i < 5; i++) {
                String bh = heVar.bh(42397227);
                if (bh.length() > 0) {
                    this.da[i] = bh;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i + 23)));
                }
            }
        }
        if (3 == this.au * -1999477681) {
            this.bn = heVar.au(-310118664) == 1;
        }
        if (this.au * -1999477681 == 4 || this.au * -1999477681 == 1) {
            this.db = heVar.au(-310118664) * 1146478291;
            this.dl = heVar.au(-310118664) * -1610227479;
            this.dh = heVar.au(-310118664) * 636698837;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (-1668173007 * this.cz == 65535) {
                this.cz = -1453901265;
            }
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
        }
        if (this.au * -1999477681 == 4) {
            this.cj = heVar.bh(-1986863782);
            this.dk = heVar.bh(141819757);
        }
        if (this.au * -1999477681 == 1 || 3 == this.au * -1999477681 || 4 == this.au * -1999477681) {
            this.ba = heVar.ad((byte) -121) * 1402931311;
        }
        if (this.au * -1999477681 == 3 || 4 == this.au * -1999477681) {
            this.bv = heVar.ad((byte) -89) * -1887670743;
            this.be = heVar.ad((byte) -104) * -316578243;
            this.bw = heVar.ad((byte) -84) * -595451759;
        }
        if (this.au * -1999477681 == 5) {
            this.cb = heVar.ad((byte) -74) * -1636058231;
            this.cy = heVar.ad((byte) -61) * 197821145;
        }
        if (this.au * -1999477681 == 6) {
            this.cp = -70120369;
            this.ct = heVar.ay((byte) 1) * -1320879157;
            if (2051854819 * this.ct == 65535) {
                this.ct = 1320879157;
            }
            this.cm = 1906967017;
            this.ck = heVar.ay((byte) 1) * -1251920779;
            if (65535 == 2032925661 * this.ck) {
                this.ck = 1251920779;
            }
            this.ce = heVar.ay((byte) 1) * 1091775395;
            if (this.ce * 703619083 == 65535) {
                this.ce = -1091775395;
            }
            this.ch = heVar.ay((byte) 1) * -1167224901;
            if (-2049122957 * this.ch == 65535) {
                this.ch = 1167224901;
            }
            this.cs = heVar.ay((byte) 1) * -2004757675;
            this.cv = heVar.ay((byte) 1) * -666819087;
            this.cu = heVar.ay((byte) 1) * 1231133277;
        }
        if (this.au * -1999477681 == 7) {
            this.fv = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
            this.fh = new int[((this.bt * 1617666421) * (-702574163 * this.bh))];
            this.db = heVar.au(-310118664) * 1146478291;
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (this.cz * -1668173007 == 65535) {
                this.cz = -1453901265;
            }
            this.de = heVar.au(-310118664) == 1;
            this.ba = heVar.ad((byte) -114) * 1402931311;
            this.dx = heVar.ag((byte) -1) * -1696560003;
            this.dp = heVar.ag((byte) -1) * -1235564531;
            if (heVar.au(-310118664) == 1) {
                this.di = ((-1649638967 * this.di) | 1073741824) * 1700096121;
            }
            this.da = new String[5];
            while (i2 < 5) {
                String bh2 = heVar.bh(-583499393);
                if (bh2.length() > 0) {
                    this.da[i2] = bh2;
                    this.di = 1700096121 * ((-1649638967 * this.di) | (1 << (i2 + 23)));
                }
                i2++;
            }
        }
        if (8 == this.au * -1999477681) {
            this.cj = heVar.bh(-1627121650);
        }
        if (2 == this.av * 1729831189 || this.au * -1999477681 == 2) {
            this.dz = heVar.bh(-1688235554);
            this.fl = heVar.bh(-245277501);
            this.di = (((heVar.ay((byte) 1) & 63) << 11) | (-1649638967 * this.di)) * 1700096121;
        }
        if (this.av * 1729831189 == 1 || 4 == this.av * 1729831189 || 5 == this.av * 1729831189 || 6 == this.av * 1729831189) {
            this.fd = heVar.bh(-2089799947);
            if (this.fd.length() == 0) {
                if (this.av * 1729831189 == 1) {
                    this.fd = ix.ao;
                }
                if (this.av * 1729831189 == 4) {
                    this.fd = ix.aa;
                }
                if (5 == this.av * 1729831189) {
                    this.fd = ix.aa;
                }
                if (6 == this.av * 1729831189) {
                    this.fd = ix.ak;
                }
            }
        }
        if (1 == this.av * 1729831189 || this.av * 1729831189 == 4 || 5 == this.av * 1729831189) {
            this.di = 1700096121 * ((-1649638967 * this.di) | 4194304);
        }
        if (this.av * 1729831189 == 6) {
            this.di = ((-1649638967 * this.di) | 1) * 1700096121;
        }
    }

    static void aa(byte b) {
        try {
            if (!fw.co || fw.cy == null || fw.cy.length() <= 0) {
                fw.cq = 0;
            } else {
                fw.cq = -301925717;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ab.aa(" + ')');
        }
    }

    void ad(he heVar) {
        boolean z;
        boolean z2 = true;
        heVar.au(-310118664);
        this.az = true;
        this.au = heVar.au(-310118664) * -862705083;
        this.ay = heVar.ay((byte) 1) * -627715993;
        this.bp = heVar.ag((byte) -1) * -2008912187;
        this.bm = heVar.ag((byte) -1) * -1642095603;
        this.bh = heVar.ay((byte) 1) * 2113414432;
        if (9 == this.au * -1999477681) {
            this.bt = heVar.ag((byte) -1) * 754590222;
        } else {
            this.bt = heVar.ay((byte) 1) * -325228835;
        }
        this.ad = heVar.av(-1425676679) * -1925542455;
        this.ab = heVar.av(-210649518) * 412796549;
        this.ag = heVar.av(-136888255) * 1629387879;
        this.ar = heVar.av(-1474914782) * -587630247;
        this.bi = heVar.ay((byte) 1) * 772702008;
        if (633969620 * this.bi == 65535) {
            this.bi = -1141617647;
        } else {
            this.bi = (((489295391 * this.ax) & -65536) + (986664366 * this.bi)) * 1141617647;
        }
        if (heVar.au(-310118664) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.bs = z;
        if (this.au * -1999477681 == 0) {
            this.bq = heVar.ay((byte) 1) * -168294841;
            this.bj = heVar.ay((byte) 1) * -47131200;
            this.fx = heVar.au(-310118664) == 1;
        }
        if (this.au * -1999477681 == 5) {
            this.cb = heVar.ad((byte) -3) * -2041196395;
            this.cl = heVar.ay((byte) 1) * -938386137;
            this.co = heVar.au(-310118664) == 1;
            this.bc = heVar.au(-310118664) * -643761375;
            this.cc = heVar.au(-310118664) * 933402023;
            this.cf = heVar.ad((byte) -9) * -1434072191;
            this.ca = heVar.au(-310118664) == 1;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.cr = z;
        }
        if (6 == 174119085 * this.au) {
            this.cp = -1276760909;
            this.ct = heVar.ay((byte) 1) * -848684226;
            if (this.ct * 2051854819 == -177745079) {
                this.ct = 1320879157;
            }
            this.ci = heVar.ag((byte) -1) * -1430147816;
            this.cq = heVar.ag((byte) -1) * -1702536154;
            this.cv = heVar.ay((byte) 1) * -1578239307;
            this.cu = heVar.ay((byte) 1) * 1231133277;
            this.cg = heVar.ay((byte) 1) * 127086743;
            this.cs = heVar.ay((byte) 1) * -286822066;
            this.ce = heVar.ay((byte) 1) * 143339145;
            if (1668810289 * this.ce == 1906699071) {
                this.ce = -1091775395;
            }
            this.cw = heVar.au(-310118664) == 1;
            heVar.ay((byte) 1);
            if (-1360760304 * this.ad != 0) {
                this.cx = heVar.ay((byte) 1) * 269314667;
            }
            if (999188836 * this.ab != 0) {
                heVar.ay((byte) 1);
            }
        }
        if (this.au * -1999477681 == 4) {
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (this.cz * -1513161007 == -408587009) {
                this.cz = 2086049446;
            }
            this.cj = heVar.bh(-1534514897);
            this.dh = heVar.au(-310118664) * -1447544605;
            this.db = heVar.au(-310118664) * 2136516101;
            this.dl = heVar.au(-310118664) * -766781049;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
            this.ba = heVar.ad((byte) -29) * 1402931311;
        }
        if (3 == -2019259653 * this.au) {
            this.ba = heVar.ad((byte) -10) * -2001528914;
            this.bn = heVar.au(-310118664) == 1;
            this.bc = heVar.au(-310118664) * 947459509;
        }
        if (1939900675 * this.au == 9) {
            this.bf = heVar.au(-310118664) * 1059171396;
            this.ba = heVar.ad((byte) -86) * 1402931311;
            this.bl = heVar.au(-310118664) == 1;
        }
        this.di = heVar.ar(597353088) * 1700096121;
        this.dw = heVar.bh(659758988);
        int au = heVar.au(-310118664);
        if (au > 0) {
            this.dv = new String[au];
            for (int i = 0; i < au; i++) {
                this.dv[i] = heVar.bh(-800473975);
            }
        }
        this.dt = heVar.au(-310118664) * -933636600;
        this.do = heVar.au(-310118664) * 1342029921;
        if (heVar.au(-310118664) != 1) {
            z2 = false;
        }
        this.dj = z2;
        this.dz = heVar.bh(-1501668085);
        this.du = aa(heVar, -2102937477);
        this.dc = aa(heVar, -2019848806);
        this.eq = aa(heVar, -2051387189);
        this.eh = aa(heVar, -2094957914);
        this.ej = aa(heVar, -2000856644);
        this.ek = aa(heVar, -2057525688);
        this.ez = aa(heVar, -2007657304);
        this.ey = aa(heVar, -2130795951);
        this.ed = aa(heVar, -2129787681);
        this.et = aa(heVar, -2012767087);
        this.ei = aa(heVar, -2028623212);
        this.dn = aa(heVar, -2049222562);
        this.dg = aa(heVar, -2118237604);
        this.df = aa(heVar, -2057474091);
        this.dy = aa(heVar, -2008654569);
        this.eu = aa(heVar, -2088003241);
        this.ep = aa(heVar, -2086031710);
        this.ec = aa(heVar, -2130505453);
        this.eb = ak(heVar, (byte) 23);
        this.el = ak(heVar, (byte) -81);
        this.ex = ak(heVar, (byte) 29);
    }

    void ao(he heVar, int i) {
        boolean z = true;
        try {
            boolean z2;
            heVar.au(-310118664);
            this.az = true;
            this.au = heVar.au(-310118664) * 1384788655;
            this.ay = heVar.ay((byte) 1) * -627715993;
            this.bp = heVar.ag((byte) -1) * 1673110939;
            this.bm = heVar.ag((byte) -1) * -1642095603;
            this.bh = heVar.ay((byte) 1) * 897710629;
            if (9 == this.au * -1999477681) {
                this.bt = heVar.ag((byte) -1) * -325228835;
            } else {
                this.bt = heVar.ay((byte) 1) * -325228835;
            }
            this.ad = heVar.av(-147348212) * -1163506197;
            this.ab = heVar.av(50284522) * 412796549;
            this.ag = heVar.av(-2137294951) * -391569189;
            this.ar = heVar.av(115379708) * -1982277285;
            this.bi = heVar.ay((byte) 1) * 1141617647;
            if (-1228023025 * this.bi == 65535) {
                this.bi = -1141617647;
            } else {
                this.bi = (((-1035840093 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
            }
            this.bs = heVar.au(-310118664) == 1;
            if (this.au * -1999477681 == 0) {
                this.bq = heVar.ay((byte) 1) * -1077927289;
                this.bj = heVar.ay((byte) 1) * 2050876285;
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.fx = z2;
            }
            if (this.au * -1999477681 == 5) {
                this.cb = heVar.ad((byte) -125) * -1636058231;
                this.cl = heVar.ay((byte) 1) * -938386137;
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.co = z2;
                this.bc = heVar.au(-310118664) * 947459509;
                this.cc = heVar.au(-310118664) * 933402023;
                this.cf = heVar.ad((byte) -17) * 2021340221;
                this.ca = heVar.au(-310118664) == 1;
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.cr = z2;
            }
            if (6 == this.au * -1999477681) {
                this.cp = -70120369;
                this.ct = heVar.ay((byte) 1) * -1320879157;
                if (this.ct * 2051854819 == 65535) {
                    this.ct = 1320879157;
                }
                this.ci = heVar.ag((byte) -1) * -984753891;
                this.cq = heVar.ag((byte) -1) * -1426695571;
                this.cv = heVar.ay((byte) 1) * -666819087;
                this.cu = heVar.ay((byte) 1) * 1231133277;
                this.cg = heVar.ay((byte) 1) * 127086743;
                this.cs = heVar.ay((byte) 1) * -2004757675;
                this.ce = heVar.ay((byte) 1) * 1091775395;
                if (703619083 * this.ce == 65535) {
                    this.ce = -1091775395;
                }
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.cw = z2;
                heVar.ay((byte) 1);
                if (98595523 * this.ad != 0) {
                    this.cx = heVar.ay((byte) 1) * 269314667;
                }
                if (645153357 * this.ab != 0) {
                    heVar.ay((byte) 1);
                }
            }
            if (this.au * -1999477681 == 4) {
                this.cz = heVar.ay((byte) 1) * 1453901265;
                if (this.cz * -1668173007 == 65535) {
                    this.cz = -1453901265;
                }
                this.cj = heVar.bh(736586096);
                this.dh = heVar.au(-310118664) * 636698837;
                this.db = heVar.au(-310118664) * 1146478291;
                this.dl = heVar.au(-310118664) * -1610227479;
                this.de = heVar.au(-310118664) == 1;
                this.ba = heVar.ad((byte) -93) * 1402931311;
            }
            if (3 == this.au * -1999477681) {
                this.ba = heVar.ad((byte) -101) * 1402931311;
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.bn = z2;
                this.bc = heVar.au(-310118664) * 947459509;
            }
            if (this.au * -1999477681 == 9) {
                this.bf = heVar.au(-310118664) * -816123949;
                this.ba = heVar.ad((byte) -77) * 1402931311;
                if (heVar.au(-310118664) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.bl = z2;
            }
            this.di = heVar.ar(597353088) * 1700096121;
            this.dw = heVar.bh(304777932);
            int au = heVar.au(-310118664);
            if (au > 0) {
                this.dv = new String[au];
                for (int i2 = 0; i2 < au; i2++) {
                    this.dv[i2] = heVar.bh(-1023153105);
                }
            }
            this.dt = heVar.au(-310118664) * 998318869;
            this.do = heVar.au(-310118664) * 1342029921;
            if (heVar.au(-310118664) != 1) {
                z = false;
            }
            this.dj = z;
            this.dz = heVar.bh(-557087648);
            this.du = aa(heVar, -2080088290);
            this.dc = aa(heVar, -2078746091);
            this.eq = aa(heVar, -2024642992);
            this.eh = aa(heVar, -2095101194);
            this.ej = aa(heVar, -2119308754);
            this.ek = aa(heVar, -2120196901);
            this.ez = aa(heVar, -2071191663);
            this.ey = aa(heVar, -2047862902);
            this.ed = aa(heVar, -2146435127);
            this.et = aa(heVar, -2127310593);
            this.ei = aa(heVar, -1992079460);
            this.dn = aa(heVar, -2008542809);
            this.dg = aa(heVar, -2073682495);
            this.df = aa(heVar, -1985943984);
            this.dy = aa(heVar, -1991436809);
            this.eu = aa(heVar, -2052794322);
            this.ep = aa(heVar, -2010915095);
            this.ec = aa(heVar, -2047545913);
            this.eb = ak(heVar, (byte) 21);
            this.el = ak(heVar, (byte) -5);
            this.ex = ak(heVar, (byte) 39);
        } catch (Throwable e) {
            throw ei.ac(e, "ab.ao(" + ')');
        }
    }

    void ar(he heVar) {
        boolean z;
        boolean z2 = true;
        heVar.au(-310118664);
        this.az = true;
        this.au = heVar.au(-310118664) * 1384788655;
        this.ay = heVar.ay((byte) 1) * -627715993;
        this.bp = heVar.ag((byte) -1) * 1673110939;
        this.bm = heVar.ag((byte) -1) * -1642095603;
        this.bh = heVar.ay((byte) 1) * 897710629;
        if (9 == this.au * -1999477681) {
            this.bt = heVar.ag((byte) -1) * -325228835;
        } else {
            this.bt = heVar.ay((byte) 1) * -325228835;
        }
        this.ad = heVar.av(47366827) * -1163506197;
        this.ab = heVar.av(16751070) * 412796549;
        this.ag = heVar.av(-747976533) * -391569189;
        this.ar = heVar.av(-704720360) * -1982277285;
        this.bi = heVar.ay((byte) 1) * 1141617647;
        if (-1228023025 * this.bi == 65535) {
            this.bi = -1141617647;
        } else {
            this.bi = (((-1035840093 * this.ax) & -65536) + (-1228023025 * this.bi)) * 1141617647;
        }
        this.bs = heVar.au(-310118664) == 1;
        if (this.au * -1999477681 == 0) {
            this.bq = heVar.ay((byte) 1) * -1077927289;
            this.bj = heVar.ay((byte) 1) * 2050876285;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.fx = z;
        }
        if (this.au * -1999477681 == 5) {
            this.cb = heVar.ad((byte) -65) * -1636058231;
            this.cl = heVar.ay((byte) 1) * -938386137;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.co = z;
            this.bc = heVar.au(-310118664) * 947459509;
            this.cc = heVar.au(-310118664) * 933402023;
            this.cf = heVar.ad((byte) -62) * 2021340221;
            this.ca = heVar.au(-310118664) == 1;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.cr = z;
        }
        if (6 == this.au * -1999477681) {
            this.cp = -70120369;
            this.ct = heVar.ay((byte) 1) * -1320879157;
            if (this.ct * 2051854819 == 65535) {
                this.ct = 1320879157;
            }
            this.ci = heVar.ag((byte) -1) * -984753891;
            this.cq = heVar.ag((byte) -1) * -1426695571;
            this.cv = heVar.ay((byte) 1) * -666819087;
            this.cu = heVar.ay((byte) 1) * 1231133277;
            this.cg = heVar.ay((byte) 1) * 127086743;
            this.cs = heVar.ay((byte) 1) * -2004757675;
            this.ce = heVar.ay((byte) 1) * 1091775395;
            if (703619083 * this.ce == 65535) {
                this.ce = -1091775395;
            }
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.cw = z;
            heVar.ay((byte) 1);
            if (98595523 * this.ad != 0) {
                this.cx = heVar.ay((byte) 1) * 269314667;
            }
            if (645153357 * this.ab != 0) {
                heVar.ay((byte) 1);
            }
        }
        if (this.au * -1999477681 == 4) {
            this.cz = heVar.ay((byte) 1) * 1453901265;
            if (this.cz * -1668173007 == 65535) {
                this.cz = -1453901265;
            }
            this.cj = heVar.bh(70522615);
            this.dh = heVar.au(-310118664) * 636698837;
            this.db = heVar.au(-310118664) * 1146478291;
            this.dl = heVar.au(-310118664) * -1610227479;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.de = z;
            this.ba = heVar.ad((byte) -44) * 1402931311;
        }
        if (3 == this.au * -1999477681) {
            this.ba = heVar.ad((byte) -20) * 1402931311;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bn = z;
            this.bc = heVar.au(-310118664) * 947459509;
        }
        if (this.au * -1999477681 == 9) {
            this.bf = heVar.au(-310118664) * -816123949;
            this.ba = heVar.ad((byte) -35) * 1402931311;
            if (heVar.au(-310118664) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bl = z;
        }
        this.di = heVar.ar(597353088) * 1700096121;
        this.dw = heVar.bh(693781570);
        int au = heVar.au(-310118664);
        if (au > 0) {
            this.dv = new String[au];
            for (int i = 0; i < au; i++) {
                this.dv[i] = heVar.bh(-530245239);
            }
        }
        this.dt = heVar.au(-310118664) * 998318869;
        this.do = heVar.au(-310118664) * 1342029921;
        if (heVar.au(-310118664) != 1) {
            z2 = false;
        }
        this.dj = z2;
        this.dz = heVar.bh(-558448713);
        this.du = aa(heVar, -2077421345);
        this.dc = aa(heVar, -2010567156);
        this.eq = aa(heVar, -2005292239);
        this.eh = aa(heVar, -2142755206);
        this.ej = aa(heVar, -2023994709);
        this.ek = aa(heVar, -1984778090);
        this.ez = aa(heVar, -2022564515);
        this.ey = aa(heVar, -2101727585);
        this.ed = aa(heVar, -2109687468);
        this.et = aa(heVar, -1983089061);
        this.ei = aa(heVar, -2082030913);
        this.dn = aa(heVar, -2122145291);
        this.dg = aa(heVar, -2105337629);
        this.df = aa(heVar, -2016186421);
        this.dy = aa(heVar, -2016211875);
        this.eu = aa(heVar, -2140422293);
        this.ep = aa(heVar, -1989491089);
        this.ec = aa(heVar, -2116940574);
        this.eb = ak(heVar, (byte) 15);
        this.el = ak(heVar, (byte) -52);
        this.ex = ak(heVar, (byte) 4);
    }

    Object[] aa(he heVar, int i) {
        try {
            int au = heVar.au(-310118664);
            if (au == 0) {
                return null;
            }
            Object[] objArr = new Object[au];
            for (int i2 = 0; i2 < au; i2++) {
                int au2 = heVar.au(-310118664);
                if (au2 == 0) {
                    objArr[i2] = new Integer(heVar.ad((byte) -90));
                } else if (1 == au2) {
                    objArr[i2] = heVar.bh(-1877036595);
                }
            }
            this.dm = true;
            return objArr;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.aa(" + ')');
        }
    }

    Object[] ab(he heVar) {
        int au = heVar.au(-310118664);
        if (au == 0) {
            return null;
        }
        Object[] objArr = new Object[au];
        for (int i = 0; i < au; i++) {
            int au2 = heVar.au(-310118664);
            if (au2 == 0) {
                objArr[i] = new Integer(heVar.ad((byte) -42));
            } else if (1 == au2) {
                objArr[i] = heVar.bh(-1562919314);
            }
        }
        this.dm = true;
        return objArr;
    }

    int[] ak(he heVar, byte b) {
        try {
            int au = heVar.au(-310118664);
            if (au == 0) {
                return null;
            }
            int[] iArr = new int[au];
            for (int i = 0; i < au; i++) {
                iArr[i] = heVar.ad((byte) -74);
            }
            return iArr;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.ak(" + ')');
        }
    }

    int[] bh(he heVar) {
        int au = heVar.au(-310118664);
        if (au == 0) {
            return null;
        }
        int[] iArr = new int[au];
        for (int i = 0; i < au; i++) {
            iArr[i] = heVar.ad((byte) -125);
        }
        return iArr;
    }

    int[] bm(he heVar) {
        int au = heVar.au(-310118664);
        if (au == 0) {
            return null;
        }
        int[] iArr = new int[au];
        for (int i = 0; i < au; i++) {
            iArr[i] = heVar.ad((byte) -116);
        }
        return iArr;
    }

    int[] bp(he heVar) {
        int au = heVar.au(-310118664);
        if (au == 0) {
            return null;
        }
        int[] iArr = new int[au];
        for (int i = 0; i < au; i++) {
            iArr[i] = heVar.ad((byte) -65);
        }
        return iArr;
    }

    int[] bt(he heVar) {
        int au = heVar.au(-310118664);
        if (au == 0) {
            return null;
        }
        int[] iArr = new int[au];
        for (int i = 0; i < au; i++) {
            iArr[i] = heVar.ad((byte) -97);
        }
        return iArr;
    }

    public void ap(int i, int i2, byte b) {
        try {
            int i3 = this.fv[i2];
            this.fv[i2] = this.fv[i];
            this.fv[i] = i3;
            i3 = this.fh[i2];
            this.fh[i2] = this.fh[i];
            this.fh[i] = i3;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.ap(" + ')');
        }
    }

    public void bb(int i, int i2) {
        int i3 = this.fv[i2];
        this.fv[i2] = this.fv[i];
        this.fv[i] = i3;
        i3 = this.fh[i2];
        this.fh[i2] = this.fh[i];
        this.fh[i] = i3;
    }

    public void bd(int i, int i2) {
        int i3 = this.fv[i2];
        this.fv[i2] = this.fv[i];
        this.fv[i] = i3;
        i3 = this.fh[i2];
        this.fh[i2] = this.fh[i];
        this.fh[i] = i3;
    }

    public void br(int i, int i2) {
        int i3 = this.fv[i2];
        this.fv[i2] = this.fv[i];
        this.fv[i] = i3;
        i3 = this.fh[i2];
        this.fh[i2] = this.fh[i];
        this.fh[i] = i3;
    }

    public void bu(int i, int i2) {
        int i3 = this.fv[i2];
        this.fv[i2] = this.fv[i];
        this.fv[i] = i3;
        i3 = this.fh[i2];
        this.fh[i2] = this.fh[i];
        this.fh[i] = i3;
    }

    public void by(int i, int i2) {
        int i3 = this.fv[i2];
        this.fv[i2] = this.fv[i];
        this.fv[i] = i3;
        i3 = this.fh[i2];
        this.fh[i2] = this.fh[i];
        this.fh[i] = i3;
    }

    public em at(boolean z, byte b) {
        try {
            int i;
            al = false;
            if (z) {
                i = 1542708585 * this.cy;
            } else {
                i = this.cb * -200725831;
            }
            if (-1 == i) {
                return null;
            }
            long j;
            if (this.cr) {
                j = 1;
            } else {
                j = 0;
            }
            long j2 = j << 39;
            long j3 = (((long) (this.cc * 883212823)) << 36) + ((long) i);
            if (this.ca) {
                j = 1;
            } else {
                j = 0;
            }
            j = (((j << 38) + j3) + j2) + (((long) (this.cf * -102235371)) << 40);
            em emVar = (em) aw.aj(j);
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(mi.ah, i, 0, 1206476650);
            if (emVar == null) {
                al = true;
                return null;
            }
            if (this.ca) {
                emVar.aa();
            }
            if (this.cr) {
                emVar.ao();
            }
            if (this.cc * 883212823 > 0) {
                emVar.aq(this.cc * 883212823);
            }
            if (this.cc * 883212823 >= 1) {
                emVar.ak(1);
            }
            if (this.cc * 883212823 >= 2) {
                emVar.ak(16777215);
            }
            if (this.cf * -102235371 != 0) {
                emVar.ap(this.cf * -102235371);
            }
            aw.an(emVar, j);
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.at(" + ')');
        }
    }

    public em bi(boolean z) {
        int i;
        long j = 0;
        al = false;
        if (z) {
            i = 1542708585 * this.cy;
        } else {
            i = this.cb * 1289690152;
        }
        if (-1 == i) {
            return null;
        }
        long j2;
        if (this.cr) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        j2 <<= 39;
        long j3 = ((long) i) + (((long) (this.cc * 883212823)) << -1544383090);
        if (this.ca) {
            j = 1;
        }
        j = (((long) (this.cf * 631225629)) << 799050117) + (j2 + ((j << 38) + j3));
        em emVar = (em) aw.aj(j);
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(mi.ah, i, 0, 1206476650);
        if (emVar == null) {
            al = true;
            return null;
        }
        if (this.ca) {
            emVar.aa();
        }
        if (this.cr) {
            emVar.ao();
        }
        if (this.cc * 883212823 > 0) {
            emVar.aq(this.cc * -1878406319);
        }
        if (this.cc * -1408274757 >= 1) {
            emVar.ak(1);
        }
        if (1118501028 * this.cc >= 2) {
            emVar.ak(-1597179703);
        }
        if (-907221080 * this.cf != 0) {
            emVar.ap(-31151451 * this.cf);
        }
        aw.an(emVar, j);
        return emVar;
    }

    public em bs(boolean z) {
        int i;
        al = false;
        if (z) {
            i = -1070446985 * this.cy;
        } else {
            i = this.cb * 1977137050;
        }
        if (-1 == i) {
            return null;
        }
        long j;
        if (this.cr) {
            j = 1;
        } else {
            j = 0;
        }
        long j2 = (((long) (this.cf * -102235371)) << 40) + ((((this.ca ? 1 : 0) << 442686256) + ((((long) (this.cc * 883212823)) << 36) + ((long) i))) + (j << -1708579732));
        em emVar = (em) aw.aj(j2);
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(mi.ah, i, 0, 1206476650);
        if (emVar == null) {
            al = true;
            return null;
        }
        if (this.ca) {
            emVar.aa();
        }
        if (this.cr) {
            emVar.ao();
        }
        if (this.cc * 883212823 > 0) {
            emVar.aq(this.cc * 883212823);
        }
        if (this.cc * -709345831 >= 1) {
            emVar.ak(1);
        }
        if (105458661 * this.cc >= 2) {
            emVar.ak(16777215);
        }
        if (-1722223131 * this.cf != 0) {
            emVar.ap(this.cf * -102235371);
        }
        aw.an(emVar, j2);
        return emVar;
    }

    public em bx(boolean z) {
        al = false;
        int i = z ? 1542708585 * this.cy : this.cb * -200725831;
        if (-1 == i) {
            return null;
        }
        long j;
        long j2 = (this.cr ? 1 : 0) << 39;
        long j3 = (((long) (this.cc * 883212823)) << 36) + ((long) i);
        if (this.ca) {
            j = 1;
        } else {
            j = 0;
        }
        j2 = (((long) (this.cf * -102235371)) << 40) + (((j << 38) + j3) + j2);
        em emVar = (em) aw.aj(j2);
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(mi.ah, i, 0, 1206476650);
        if (emVar == null) {
            al = true;
            return null;
        }
        if (this.ca) {
            emVar.aa();
        }
        if (this.cr) {
            emVar.ao();
        }
        if (this.cc * 883212823 > 0) {
            emVar.aq(this.cc * 883212823);
        }
        if (this.cc * 883212823 >= 1) {
            emVar.ak(1);
        }
        if (this.cc * 883212823 >= 2) {
            emVar.ak(16777215);
        }
        if (this.cf * -102235371 != 0) {
            emVar.ap(this.cf * -102235371);
        }
        aw.an(emVar, j2);
        return emVar;
    }

    public kh ah(int i) {
        try {
            al = false;
            if (-1 == this.cz * -1668173007) {
                return null;
            }
            kh khVar = (kh) ae.aj((long) (this.cz * -1668173007));
            if (khVar != null) {
                return khVar;
            }
            ju juVar = mi.ah;
            ju juVar2 = gz.ai;
            int i2 = this.cz * -1668173007;
            if (ei.aw(juVar, i2, 0, -2006428015)) {
                byte[] an = juVar2.an(i2, 0, 87771134);
                if (an == null) {
                    khVar = null;
                } else {
                    khVar = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                    gn.as((byte) -19);
                }
            } else {
                khVar = null;
            }
            if (khVar != null) {
                ae.an(khVar, (long) (this.cz * -1668173007));
                return khVar;
            }
            al = true;
            return khVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.ah(" + ')');
        }
    }

    public kh ba() {
        kh khVar = null;
        al = false;
        if (-1 == this.cz * -1668173007) {
            return null;
        }
        kh khVar2 = (kh) ae.aj((long) (this.cz * -1668173007));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = mi.ah;
        ju juVar2 = gz.ai;
        int i = this.cz * -1668173007;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -5612711);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -36);
            }
            khVar = khVar2;
        }
        if (khVar != null) {
            ae.an(khVar, (long) (this.cz * -1668173007));
            return khVar;
        }
        al = true;
        return khVar;
    }

    public kh bj() {
        kh khVar = null;
        al = false;
        if (-1 == 1305976350 * this.cz) {
            return null;
        }
        kh khVar2 = (kh) ae.aj((long) (-1330953293 * this.cz));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = mi.ah;
        ju juVar2 = gz.ai;
        int i = this.cz * 363425015;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -592357333);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -37);
            }
            khVar = khVar2;
        }
        if (khVar != null) {
            ae.an(khVar, (long) (this.cz * 1740134436));
            return khVar;
        }
        al = true;
        return khVar;
    }

    public kh bo() {
        kh khVar = null;
        al = false;
        if (-1 == this.cz * -1668173007) {
            return null;
        }
        kh khVar2 = (kh) ae.aj((long) (this.cz * -1668173007));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = mi.ah;
        ju juVar2 = gz.ai;
        int i = this.cz * -1668173007;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -1062482927);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -59);
            }
            khVar = khVar2;
        }
        if (khVar != null) {
            ae.an(khVar, (long) (this.cz * -1668173007));
            return khVar;
        }
        al = true;
        return khVar;
    }

    public kh bq() {
        kh khVar = null;
        al = false;
        if (-1 == this.cz * -1668173007) {
            return null;
        }
        kh khVar2 = (kh) ae.aj((long) (this.cz * -1668173007));
        if (khVar2 != null) {
            return khVar2;
        }
        ju juVar = mi.ah;
        ju juVar2 = gz.ai;
        int i = this.cz * -1668173007;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, 196710381);
            if (an == null) {
                khVar2 = null;
            } else {
                khVar2 = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -66);
            }
            khVar = khVar2;
        }
        if (khVar != null) {
            ae.an(khVar, (long) (this.cz * -1668173007));
            return khVar;
        }
        al = true;
        return khVar;
    }

    public kh bz() {
        al = false;
        if (-1 == this.cz * -1668173007) {
            return null;
        }
        kh khVar = (kh) ae.aj((long) (this.cz * -1668173007));
        if (khVar != null) {
            return khVar;
        }
        ju juVar = mi.ah;
        ju juVar2 = gz.ai;
        int i = this.cz * -1668173007;
        if (ei.aw(juVar, i, 0, -2006428015)) {
            byte[] an = juVar2.an(i, 0, -886824079);
            if (an == null) {
                khVar = null;
            } else {
                khVar = new kh(an, fi.aq, fi.ao, fi.aa, fi.ak, fi.ap, fi.at);
                gn.as((byte) -17);
            }
        } else {
            khVar = null;
        }
        if (khVar != null) {
            ae.an(khVar, (long) (this.cz * -1668173007));
            return khVar;
        }
        al = true;
        return khVar;
    }

    public em ai(int i, int i2) {
        em emVar = null;
        try {
            al = false;
            if (i >= 0 && i < this.ds.length) {
                int i3 = this.ds[i];
                if (i3 != -1) {
                    emVar = (em) aw.aj((long) i3);
                    if (emVar == null) {
                        emVar = aw.aq(mi.ah, i3, 0, 1206476650);
                        if (emVar != null) {
                            aw.an(emVar, (long) i3);
                        } else {
                            al = true;
                        }
                    }
                }
            }
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.ai(" + ')');
        }
    }

    public em be(int i) {
        em emVar = null;
        al = false;
        if (i >= 0 && i < this.ds.length) {
            int i2 = this.ds[i];
            if (i2 != -1) {
                emVar = (em) aw.aj((long) i2);
                if (emVar == null) {
                    emVar = aw.aq(mi.ah, i2, 0, 1206476650);
                    if (emVar != null) {
                        aw.an(emVar, (long) i2);
                    } else {
                        al = true;
                    }
                }
            }
        }
        return emVar;
    }

    public em bv(int i) {
        em emVar = null;
        al = false;
        if (i >= 0 && i < this.ds.length) {
            int i2 = this.ds[i];
            if (i2 != -1) {
                emVar = (em) aw.aj((long) i2);
                if (emVar == null) {
                    emVar = aw.aq(mi.ah, i2, 0, 1206476650);
                    if (emVar != null) {
                        aw.an(emVar, (long) i2);
                    } else {
                        al = true;
                    }
                }
            }
        }
        return emVar;
    }

    public em bw(int i) {
        em emVar = null;
        al = false;
        if (i >= 0 && i < this.ds.length) {
            int i2 = this.ds[i];
            if (i2 != -1) {
                emVar = (em) aw.aj((long) i2);
                if (emVar == null) {
                    emVar = aw.aq(mi.ah, i2, 0, 1206476650);
                    if (emVar != null) {
                        aw.an(emVar, (long) i2);
                    } else {
                        al = true;
                    }
                }
            }
        }
        return emVar;
    }

    public ct aw(ax axVar, int i, boolean z, br brVar, byte b) {
        try {
            int i2;
            int i3;
            al = false;
            if (z) {
                i2 = this.ck * 2032925661;
                i3 = this.cm * 1912530521;
            } else {
                i2 = this.ct * 2051854819;
                i3 = this.cp * 772377263;
            }
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1 && i2 == -1) {
                return null;
            }
            ct ctVar = (ct) am.aj((long) ((i3 << 16) + i2));
            if (ctVar == null) {
                bf aj;
                if (i3 == 1) {
                    aj = bf.aj(eo.at, i2, 0);
                    if (aj == null) {
                        al = true;
                        return null;
                    }
                    ctVar = aj.av(64, 768, -50, -10, -50);
                }
                if (2 == i3) {
                    aj = ag.aj(i2, (byte) 46).aa((byte) -1);
                    if (aj == null) {
                        al = true;
                        return null;
                    }
                    ctVar = aj.av(64, 768, -50, -10, -50);
                }
                if (3 == i3) {
                    if (brVar == null) {
                        return null;
                    }
                    aj = brVar.ap(-576725164);
                    if (aj == null) {
                        al = true;
                        return null;
                    }
                    ctVar = aj.av(64, 768, -50, -10, -50);
                }
                if (i3 == 4) {
                    av ac = al.ac(i2, (short) 169);
                    aj = ac.at(10, (byte) 90);
                    if (aj == null) {
                        al = true;
                        return null;
                    }
                    ctVar = aj.av((1480275285 * ac.co) + 64, (ac.cc * -462374141) + 768, -50, -10, -50);
                }
                am.an(ctVar, (long) ((i3 << 16) + i2));
            }
            if (axVar != null) {
                return axVar.at(ctVar, i, -26816668);
            }
            return ctVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.aw(" + ')');
        }
    }

    public ct bc(ax axVar, int i, boolean z, br brVar) {
        int i2;
        int i3;
        al = false;
        if (z) {
            i2 = this.ck * 2032925661;
            i3 = this.cm * 1912530521;
        } else {
            i2 = this.ct * 2051854819;
            i3 = this.cp * 772377263;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        ct ctVar = (ct) am.aj((long) ((i3 << 16) + i2));
        if (ctVar == null) {
            bf aj;
            if (i3 == 1) {
                aj = bf.aj(eo.at, i2, 0);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, -50, -10, -50);
            }
            if (2 == i3) {
                aj = ag.aj(i2, (byte) 46).aa((byte) -1);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, -50, -10, -50);
            }
            if (3 == i3) {
                if (brVar == null) {
                    return null;
                }
                aj = brVar.ap(-576725164);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, -50, -10, -50);
            }
            if (i3 == 4) {
                av ac = al.ac(i2, (short) 749);
                aj = ac.at(10, (byte) 108);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av((1480275285 * ac.co) + 64, (ac.cc * -462374141) + 768, -50, -10, -50);
            }
            am.an(ctVar, (long) ((i3 << 16) + i2));
        }
        if (axVar != null) {
            return axVar.at(ctVar, i, -26816668);
        }
        return ctVar;
    }

    public ct bg(ax axVar, int i, boolean z, br brVar) {
        int i2;
        int i3;
        al = false;
        if (z) {
            i2 = this.ck * -836292065;
            i3 = this.cm * -1268998082;
        } else {
            i2 = this.ct * 305020147;
            i3 = this.cp * 1675857730;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        ct ctVar = (ct) am.aj((long) ((i3 << 16) + i2));
        if (ctVar == null) {
            bf aj;
            if (i3 == 1) {
                aj = bf.aj(eo.at, i2, 0);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, -50, 1068625979, -50);
            }
            if (2 == i3) {
                aj = ag.aj(i2, (byte) 46).aa((byte) -1);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, -816901215, 910525445, 1445362106);
            }
            if (3 == i3) {
                if (brVar == null) {
                    return null;
                }
                aj = brVar.ap(-576725164);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(1189207774, 768, -50, -10, -50);
            }
            if (i3 == 4) {
                av ac = al.ac(i2, (short) 11744);
                aj = ac.at(10, (byte) 43);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(338561861 + (-366542702 * ac.co), (ac.cc * -1561479492) + 768, 1185064427, 1094839085, -903791045);
            }
            am.an(ctVar, (long) ((i3 << 16) + i2));
        }
        if (axVar != null) {
            return axVar.at(ctVar, i, -26816668);
        }
        return ctVar;
    }

    public ct bk(ax axVar, int i, boolean z, br brVar) {
        int i2;
        int i3;
        al = false;
        if (z) {
            i2 = this.ck * 2032925661;
            i3 = this.cm * 1912530521;
        } else {
            i2 = this.ct * 2051854819;
            i3 = this.cp * 772377263;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        ct ctVar = (ct) am.aj((long) ((i3 << 16) + i2));
        if (ctVar == null) {
            bf aj;
            if (i3 == 1) {
                aj = bf.aj(eo.at, i2, 0);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, -1831469204, -987115294, -1032538948, -1048893786);
            }
            if (2 == i3) {
                aj = ag.aj(i2, (byte) 46).aa((byte) -1);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(64, 768, 1948620919, -10, -50);
            }
            if (3 == i3) {
                if (brVar == null) {
                    return null;
                }
                aj = brVar.ap(-576725164);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(214302326, 768, 329556054, 2130783114, -50);
            }
            if (i3 == 4) {
                av ac = al.ac(i2, (short) -11525);
                aj = ac.at(10, (byte) 30);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(89951007 + (1480275285 * ac.co), (ac.cc * -58902526) + 768, -50, -10, -50);
            }
            am.an(ctVar, (long) ((i3 << 16) + i2));
        }
        if (axVar != null) {
            return axVar.at(ctVar, i, -26816668);
        }
        return ctVar;
    }

    public ct bn(ax axVar, int i, boolean z, br brVar) {
        int i2;
        int i3;
        al = false;
        if (z) {
            i2 = this.ck * 2032925661;
            i3 = this.cm * -1737678773;
        } else {
            i2 = this.ct * 1396811608;
            i3 = this.cp * -1880535384;
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1 && i2 == -1) {
            return null;
        }
        ct ctVar = (ct) am.aj((long) ((i3 << 16) + i2));
        if (ctVar == null) {
            bf aj;
            if (i3 == 1) {
                aj = bf.aj(eo.at, i2, 0);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(1933996539, 768, -50, -10, -857803392);
            }
            if (2 == i3) {
                aj = ag.aj(i2, (byte) 46).aa((byte) -1);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(136593276, 768, -50, -10, -50);
            }
            if (3 == i3) {
                if (brVar == null) {
                    return null;
                }
                aj = brVar.ap(-576725164);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av(-1764623554, 768, -50, -10, 899073253);
            }
            if (i3 == 4) {
                av ac = al.ac(i2, (short) -4259);
                aj = ac.at(10, (byte) 73);
                if (aj == null) {
                    al = true;
                    return null;
                }
                ctVar = aj.av((1480275285 * ac.co) + 64, (ac.cc * -462374141) + 768, -50, -10, -50);
            }
            am.an(ctVar, (long) ((i3 << 16) + i2));
        }
        if (axVar != null) {
            return axVar.at(ctVar, i, -26816668);
        }
        return ctVar;
    }

    public bm am(boolean z, int i) {
        try {
            int i2;
            if (this.cy * 1542708585 == -1) {
                z = false;
            }
            if (z) {
                i2 = this.cy * 1542708585;
            } else {
                i2 = -200725831 * this.cb;
            }
            if (-1 == i2) {
                return null;
            }
            long j;
            long j2 = ((long) (-102235371 * this.cf)) << 40;
            if (this.cr) {
                j = 1;
            } else {
                j = 0;
            }
            long j3 = j << 39;
            long j4 = ((long) i2) + (((long) (883212823 * this.cc)) << 36);
            if (this.ca) {
                j = 1;
            } else {
                j = 0;
            }
            j4 = j2 + (((j << 38) + j4) + j3);
            bm bmVar = (bm) as.aj(j4);
            if (bmVar != null) {
                return bmVar;
            }
            em at = at(z, Byte.MIN_VALUE);
            if (at == null) {
                return null;
            }
            em ac = at.ac();
            int[] iArr = new int[ac.an];
            int[] iArr2 = new int[ac.an];
            for (int i3 = 0; i3 < ac.an; i3++) {
                int i4;
                int i5 = 0;
                int i6 = ac.ac;
                for (i4 = 0; i4 < ac.ac; i4++) {
                    if (ac.aj[(ac.ac * i3) + i4] == 0) {
                        i5 = i4;
                        break;
                    }
                }
                for (i4 = ac.ac - 1; i4 >= i5; i4--) {
                    if (ac.aj[(ac.ac * i3) + i4] == 0) {
                        i6 = i4 + 1;
                        break;
                    }
                }
                iArr[i3] = i5;
                iArr2[i3] = i6 - i5;
            }
            bmVar = new bm(ac.ac, ac.an, iArr2, iArr, i2);
            as.an(bmVar, j4);
            return bmVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.am(" + ')');
        }
    }

    public bm bf(boolean z) {
        int i;
        if (this.cy * -1731702939 == -1) {
            z = false;
        }
        if (z) {
            i = this.cy * -1052590310;
        } else {
            i = -200725831 * this.cb;
        }
        if (-1 == i) {
            return null;
        }
        long j;
        long j2 = ((long) (-102235371 * this.cf)) << 40;
        if (this.cr) {
            j = 1;
        } else {
            j = 0;
        }
        long j3 = j << 39;
        long j4 = ((long) i) + (((long) (-10402383 * this.cc)) << 1957826950);
        if (this.ca) {
            j = 1;
        } else {
            j = 0;
        }
        j4 = j2 + (((j << -949639435) + j4) + j3);
        bm bmVar = (bm) as.aj(j4);
        if (bmVar != null) {
            return bmVar;
        }
        em at = at(z, (byte) -48);
        if (at == null) {
            return null;
        }
        em ac = at.ac();
        int[] iArr = new int[ac.an];
        int[] iArr2 = new int[ac.an];
        for (int i2 = 0; i2 < ac.an; i2++) {
            int i3;
            int i4 = ac.ac;
            int i5 = 0;
            while (i5 < ac.ac) {
                if (ac.aj[(ac.ac * i2) + i5] == 0) {
                    break;
                }
                i5++;
            }
            i5 = 0;
            for (i3 = ac.ac - 1; i3 >= i5; i3--) {
                if (ac.aj[(ac.ac * i2) + i3] == 0) {
                    i3++;
                    break;
                }
            }
            i3 = i4;
            iArr[i2] = i5;
            iArr2[i2] = i3 - i5;
        }
        bmVar = new bm(ac.ac, ac.an, iArr2, iArr, i);
        as.an(bmVar, j4);
        return bmVar;
    }

    public bm bl(boolean z) {
        int i;
        long j = 0;
        if (this.cy * 1542708585 == -1) {
            z = false;
        }
        if (z) {
            i = this.cy * 1542708585;
        } else {
            i = 1436676147 * this.cb;
        }
        if (-1 == i) {
            return null;
        }
        long j2;
        long j3 = ((long) (-102235371 * this.cf)) << 40;
        if (this.cr) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        j2 <<= -974467724;
        long j4 = (((long) (1740111933 * this.cc)) << -136590214) + ((long) i);
        if (this.ca) {
            j = 1;
        }
        j3 += j2 + ((j << 38) + j4);
        bm bmVar = (bm) as.aj(j3);
        if (bmVar != null) {
            return bmVar;
        }
        em at = at(z, (byte) -74);
        if (at == null) {
            return null;
        }
        em ac = at.ac();
        int[] iArr = new int[ac.an];
        int[] iArr2 = new int[ac.an];
        for (int i2 = 0; i2 < ac.an; i2++) {
            int i3 = ac.ac;
            int i4 = 0;
            while (i4 < ac.ac) {
                if (ac.aj[(ac.ac * i2) + i4] == 0) {
                    break;
                }
                i4++;
            }
            i4 = 0;
            for (int i5 = ac.ac - 1; i5 >= i4; i5--) {
                if (ac.aj[(ac.ac * i2) + i5] == 0) {
                    i3 = i5 + 1;
                    break;
                }
            }
            iArr[i2] = i4;
            iArr2[i2] = i3 - i4;
        }
        bmVar = new bm(ac.ac, ac.an, iArr2, iArr, i);
        as.an(bmVar, j3);
        return bmVar;
    }

    public bm cb(boolean z) {
        if (this.cy * 1542708585 == -1) {
            z = false;
        }
        int i = z ? this.cy * 452104308 : -200725831 * this.cb;
        if (-1 == i) {
            return null;
        }
        long j;
        long j2 = ((long) (-1277774105 * this.cf)) << 40;
        if (this.cr) {
            j = 1;
        } else {
            j = 0;
        }
        long j3 = j2 + ((((this.ca ? 1 : 0) << -167091347) + (((long) i) + (((long) (-1615274940 * this.cc)) << 36))) + (j << 39));
        bm bmVar = (bm) as.aj(j3);
        if (bmVar != null) {
            return bmVar;
        }
        em at = at(z, (byte) -35);
        if (at == null) {
            return null;
        }
        em ac = at.ac();
        int[] iArr = new int[ac.an];
        int[] iArr2 = new int[ac.an];
        for (int i2 = 0; i2 < ac.an; i2++) {
            int i3;
            int i4 = ac.ac;
            int i5 = 0;
            while (i5 < ac.ac) {
                if (ac.aj[(ac.ac * i2) + i5] == 0) {
                    break;
                }
                i5++;
            }
            i5 = 0;
            for (i3 = ac.ac - 1; i3 >= i5; i3--) {
                if (ac.aj[(ac.ac * i2) + i3] == 0) {
                    i3++;
                    break;
                }
            }
            i3 = i4;
            iArr[i2] = i5;
            iArr2[i2] = i3 - i5;
        }
        bmVar = new bm(ac.ac, ac.an, iArr2, iArr, i);
        as.an(bmVar, j3);
        return bmVar;
    }

    public static void cc(Collection collection) {
        collection.add(aw);
        collection.add(am);
        collection.add(ae);
        collection.add(as);
    }

    public static void cl(Collection collection) {
        collection.add(aw);
        collection.add(am);
        collection.add(ae);
        collection.add(as);
    }

    public static void co(Collection collection) {
        collection.add(aw);
        collection.add(am);
        collection.add(ae);
        collection.add(as);
    }

    public static void cy(Collection collection) {
        collection.add(aw);
        collection.add(am);
        collection.add(ae);
        collection.add(as);
    }

    public void as(int i, String str, short s) {
        try {
            if (this.dv == null || this.dv.length <= i) {
                String[] strArr = new String[(i + 1)];
                if (this.dv != null) {
                    for (int i2 = 0; i2 < this.dv.length; i2++) {
                        strArr[i2] = this.dv[i2];
                    }
                }
                this.dv = strArr;
            }
            this.dv[i] = str;
        } catch (Throwable e) {
            throw ei.ac(e, "ab.as(" + ')');
        }
    }

    public void ca(int i, String str) {
        if (this.dv == null || this.dv.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dv != null) {
                for (int i2 = 0; i2 < this.dv.length; i2++) {
                    strArr[i2] = this.dv[i2];
                }
            }
            this.dv = strArr;
        }
        this.dv[i] = str;
    }

    public void cf(int i, String str) {
        if (this.dv == null || this.dv.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dv != null) {
                for (int i2 = 0; i2 < this.dv.length; i2++) {
                    strArr[i2] = this.dv[i2];
                }
            }
            this.dv = strArr;
        }
        this.dv[i] = str;
    }

    public void cr(int i, String str) {
        if (this.dv == null || this.dv.length <= i) {
            String[] strArr = new String[(i + 1)];
            if (this.dv != null) {
                for (int i2 = 0; i2 < this.dv.length; i2++) {
                    strArr[i2] = this.dv[i2];
                }
            }
            this.dv = strArr;
        }
        this.dv[i] = str;
    }

    static final void bp(int i) {
        try {
            client.dp.ao(-1284392780);
            ke.bm(153720553);
            ci.el.aj();
            for (int i2 = 0; i2 < 4; i2++) {
                client.ey[i2].aj(1338126924);
            }
            System.gc();
            cb.ap(2, 1975554682);
            client.lh = 950617697;
            client.mt = false;
            bb.aj(-835649416);
            gx.as(10, (short) -6807);
        } catch (Throwable e) {
            throw ei.ac(e, "ab.bp(" + ')');
        }
    }
}
