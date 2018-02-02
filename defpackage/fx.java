package defpackage;

public abstract class fx extends ci {
    static final int bc = 4;
    protected static ls oo;
    boolean an;
    String ba;
    public int bb;
    int bd;
    boolean be;
    int[] bf;
    int bg;
    int bi;
    int bj;
    byte bk;
    int bn;
    int bo;
    int bq;
    public int br;
    int bs;
    int bu;
    boolean bv;
    int bw;
    int bx;
    int by;
    int bz;
    boolean ca;
    int[] cb;
    jr cc;
    int cd;
    int ce;
    int cf;
    int cg;
    int ch;
    int ci;
    int cj;
    int ck;
    int[] cl;
    int cm;
    int cn;
    int[] co;
    int cp;
    int cq;
    int cr;
    int cs;
    int ct;
    int cu;
    int cv;
    int cw;
    int cx;
    int[] cy;
    int cz;
    byte[] da;
    int db;
    int[] dd;
    int de;
    int dh;
    int di;
    int dk;
    int dl;
    int dp;
    int dr;
    int[] ds;
    int dw;
    int dx;

    fx() {
        try {
            this.an = false;
            this.bd = -1767195673;
            this.by = 450411187;
            this.bx = -439294429;
            this.bi = 1707345543;
            this.bs = 1803072385;
            this.bo = -1924305217;
            this.bz = -45062693;
            this.bq = 606414967;
            this.bj = -871550483;
            this.ba = null;
            this.be = false;
            this.bw = 644737300;
            this.bn = 0;
            this.bg = 0;
            this.bk = (byte) 0;
            this.bf = new int[4];
            this.cb = new int[4];
            this.cy = new int[4];
            this.cl = new int[4];
            this.co = new int[4];
            this.cc = new jr();
            this.cf = -2130005305;
            this.ca = false;
            this.cr = -291359525;
            this.cp = -432905233;
            this.ct = 0;
            this.cm = 0;
            this.ck = 2042247317;
            this.ce = 0;
            this.ch = 0;
            this.ci = 0;
            this.cq = 0;
            this.cv = -566382975;
            this.cu = 0;
            this.cg = 0;
            this.db = 0;
            this.dl = -1369674088;
            this.dx = 0;
            this.dp = 454890208;
            this.dr = 0;
            this.dd = new int[10];
            this.ds = new int[10];
            this.da = new byte[10];
            this.di = 0;
            this.dw = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "fx.<init>(" + ')');
        }
    }

    final void bc() {
        this.dr = 0;
        this.dw = 0;
    }

    final void bg() {
        this.dr = 0;
        this.dw = 0;
    }

    final void bv(int i) {
        try {
            this.dr = 0;
            this.dw = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "fx.bv(" + ')');
        }
    }

    boolean ah() {
        return false;
    }

    boolean ai() {
        return false;
    }

    boolean am() {
        return false;
    }

    boolean an(int i) {
        return false;
    }

    boolean aw() {
        return false;
    }

    final void be(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        Object obj = 1;
        Object obj2 = 1;
        int i9 = 0;
        while (i9 < 4) {
            try {
                if (this.cy[i9] > i5) {
                    obj2 = null;
                } else {
                    obj = null;
                }
                i9++;
            } catch (Throwable e) {
                throw ei.ac(e, "fx.be(" + ')');
            }
        }
        int i10 = -1;
        int i11 = 0;
        if (i >= 0) {
            aq ac = gq.ac(i, -1353307285);
            i10 = -112855225 * ac.ag;
            i11 = ac.ae * -542472953;
        }
        int i12;
        if (obj == null) {
            if (obj2 != null) {
                this.bk = (byte) 0;
            }
            for (i12 = 0; i12 < 4; i12++) {
                i8 = this.bk;
                this.bk = (byte) ((this.bk + 1) % 4);
                if (this.cy[i8] <= i5) {
                    break;
                }
            }
            i8 = -1;
        } else if (-1 != i10) {
            i8 = 0;
            i12 = 0;
            if (i10 == 0) {
                i12 = this.cy[0];
            } else if (i10 == 1) {
                i12 = this.cb[0];
            }
            i9 = 1;
            while (i9 < 4) {
                if (i10 == 0) {
                    if (this.cy[i9] < i12) {
                        i12 = this.cy[i9];
                        i8 = i9;
                    }
                } else if (i10 == 1 && this.cb[i9] < i12) {
                    i12 = this.cb[i9];
                    i8 = i9;
                }
                i9++;
            }
            if (1 == i10 && i12 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i8 >= 0) {
            this.bf[i8] = i;
            this.cb[i8] = i2;
            this.cl[i8] = i3;
            this.co[i8] = i4;
            this.cy[i8] = (i11 + i5) + i6;
        }
    }

    final void bf(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cy[i7] > i5) {
                i11 = 0;
            } else {
                i10 = 0;
            }
        }
        if (i >= 0) {
            aq ac = gq.ac(i, 689113043);
            i8 = -112855225 * ac.ag;
            i7 = ac.ae * -542472953;
        } else {
            i7 = 0;
            i8 = -1;
        }
        if (i10 == 0) {
            if (i11 != 0) {
                this.bk = (byte) 0;
            }
            for (i10 = 0; i10 < 4; i10++) {
                i9 = this.bk;
                this.bk = (byte) ((this.bk + 1) % 4);
                if (this.cy[i9] <= i5) {
                    break;
                }
            }
            i9 = -1;
        } else if (-1 != i8) {
            if (i8 == 0) {
                i10 = this.cy[0];
            } else if (i8 == 1) {
                i10 = this.cb[0];
            } else {
                i10 = 0;
            }
            i11 = 1;
            while (i11 < 4) {
                if (i8 == 0) {
                    if (this.cy[i11] < i10) {
                        i10 = this.cy[i11];
                        i9 = i11;
                    }
                } else if (i8 == 1 && this.cb[i11] < i10) {
                    i10 = this.cb[i11];
                    i9 = i11;
                }
                i11++;
            }
            if (1 == i8 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.bf[i9] = i;
            this.cb[i9] = i2;
            this.cl[i9] = i3;
            this.co[i9] = i4;
            this.cy[i9] = (i7 + i5) + i6;
        }
    }

    final void bk(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = (byte) 0;
        byte b = (byte) 1;
        byte b2 = (byte) 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cy[i7] > i5) {
                b2 = (byte) 0;
            } else {
                b = (byte) 0;
            }
        }
        if (i >= 0) {
            aq ac = gq.ac(i, 781336976);
            i8 = -112855225 * ac.ag;
            i7 = ac.ae * -542472953;
        } else {
            i7 = 0;
            i8 = -1;
        }
        int i10;
        if (b == (byte) 0) {
            if (b2 != (byte) 0) {
                this.bk = (byte) 0;
            }
            for (i10 = 0; i10 < 4; i10++) {
                i9 = this.bk;
                this.bk = (byte) ((this.bk + 1) % 4);
                if (this.cy[i9] <= i5) {
                    break;
                }
            }
            i9 = -1;
        } else if (-1 != i8) {
            if (i8 == 0) {
                i10 = this.cy[0];
            } else if (i8 == 1) {
                i10 = this.cb[0];
            } else {
                b = (byte) 0;
            }
            b2 = (byte) 1;
            while (b2 < (byte) 4) {
                if (i8 == 0) {
                    if (this.cy[b2] < i10) {
                        i10 = this.cy[b2];
                        i9 = b2;
                    }
                } else if (i8 == 1 && this.cb[b2] < i10) {
                    i10 = this.cb[b2];
                    byte b3 = b2;
                }
                b2++;
            }
            if (1 == i8 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.bf[i9] = i;
            this.cb[i9] = i2;
            this.cl[i9] = i3;
            this.co[i9] = i4;
            this.cy[i9] = (i7 + i5) + i6;
        }
    }

    final void bl(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = (byte) 0;
        byte b = (byte) 1;
        byte b2 = (byte) 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cy[i7] > i5) {
                b2 = (byte) 0;
            } else {
                b = (byte) 0;
            }
        }
        if (i >= 0) {
            aq ac = gq.ac(i, 331910247);
            i8 = -112855225 * ac.ag;
            i7 = ac.ae * -542472953;
        } else {
            i7 = 0;
            i8 = -1;
        }
        int i10;
        if (b == (byte) 0) {
            if (b2 != (byte) 0) {
                this.bk = (byte) 0;
            }
            for (i10 = 0; i10 < 4; i10++) {
                i9 = this.bk;
                this.bk = (byte) ((this.bk + 1) % 4);
                if (this.cy[i9] <= i5) {
                    break;
                }
            }
            i9 = -1;
        } else if (-1 != i8) {
            if (i8 == 0) {
                i10 = this.cy[0];
            } else if (i8 == 1) {
                i10 = this.cb[0];
            } else {
                b = (byte) 0;
            }
            b2 = (byte) 1;
            while (b2 < (byte) 4) {
                if (i8 == 0) {
                    if (this.cy[b2] < i10) {
                        i10 = this.cy[b2];
                        i9 = b2;
                    }
                } else if (i8 == 1 && this.cb[b2] < i10) {
                    i10 = this.cb[b2];
                    byte b3 = b2;
                }
                b2++;
            }
            if (1 == i8 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.bf[i9] = i;
            this.cb[i9] = i2;
            this.cl[i9] = i3;
            this.co[i9] = i4;
            this.cy[i9] = (i7 + i5) + i6;
        }
    }

    final void bw(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            as ac = bz.ac(i, -753390834);
            jt jtVar = (gb) this.cc.aa();
            int i8 = 0;
            jt jtVar2 = null;
            int i9 = -574329809 * ac.at;
            jt jtVar3 = null;
            while (jtVar != null) {
                int i10 = i8 + 1;
                if (ac.ao * -1266947483 == -1266947483 * jtVar.an.ao) {
                    jtVar.aj(i2 + i4, i5, i6, i3, (byte) 0);
                    return;
                }
                jt jtVar4;
                if (1251048513 * jtVar.an.ap <= 1251048513 * ac.ap) {
                    jtVar3 = jtVar;
                }
                if (-574329809 * jtVar.an.at > i9) {
                    i9 = -574329809 * jtVar.an.at;
                    jtVar4 = jtVar;
                } else {
                    jtVar4 = jtVar2;
                }
                gb gbVar = (gb) this.cc.ap();
                i8 = i10;
                jtVar2 = jtVar4;
            }
            if (jtVar2 != null || i8 < 4) {
                jtVar = new gb(ac);
                if (jtVar3 == null) {
                    this.cc.an(jtVar);
                } else {
                    jr.aq(jtVar, jtVar3);
                }
                jtVar.aj(i4 + i2, i5, i6, i3, (byte) 0);
                if (i8 >= 4) {
                    jtVar2.kn();
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fx.bw(" + ')');
        }
    }

    final void cb(int i, int i2, int i3, int i4, int i5, int i6) {
        as ac = bz.ac(i, -753390834);
        gb gbVar = null;
        jt jtVar = (gb) this.cc.aa();
        int i7 = 0;
        int i8 = -574329809 * ac.at;
        jt jtVar2 = null;
        while (jtVar != null) {
            int i9 = i7 + 1;
            if (ac.ao * -1266947483 == -1266947483 * jtVar.an.ao) {
                jtVar.aj(i2 + i4, i5, i6, i3, (byte) 0);
                return;
            }
            jt jtVar3;
            gb gbVar2;
            if (1251048513 * jtVar.an.ap <= 1251048513 * ac.ap) {
                jtVar3 = jtVar;
            } else {
                jtVar3 = jtVar2;
            }
            if (-574329809 * jtVar.an.at > i8) {
                i8 = -574329809 * jtVar.an.at;
                gbVar2 = jtVar;
            } else {
                gbVar2 = gbVar;
            }
            gb gbVar3 = (gb) this.cc.ap();
            i7 = i9;
            gbVar = gbVar2;
            jtVar2 = jtVar3;
        }
        if (gbVar != null || i7 < 4) {
            jtVar = new gb(ac);
            if (jtVar2 == null) {
                this.cc.an(jtVar);
            } else {
                jr.aq(jtVar, jtVar2);
            }
            jtVar.aj(i4 + i2, i5, i6, i3, (byte) 0);
            if (i7 >= 4) {
                gbVar.kn();
            }
        }
    }

    final void bn(int i, int i2) {
        try {
            as ac = bz.ac(i, -753390834);
            gb gbVar = (gb) this.cc.aa();
            while (gbVar != null) {
                if (ac == gbVar.an) {
                    gbVar.kn();
                    return;
                }
                gbVar = (gb) this.cc.ap();
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fx.bn(" + ')');
        }
    }

    final void cy(int i) {
        as ac = bz.ac(i, -753390834);
        gb gbVar = (gb) this.cc.aa();
        while (gbVar != null) {
            if (ac == gbVar.an) {
                gbVar.kn();
                return;
            }
            gbVar = (gb) this.cc.ap();
        }
    }

    static String ei(String str, ab abVar, byte b) {
        try {
            if (str.indexOf("%") != -1) {
                for (int i = 1; i <= 5; i++) {
                    while (true) {
                        int indexOf = str.indexOf("%" + i);
                        if (indexOf == -1) {
                            break;
                        }
                        String num;
                        String substring = str.substring(0, indexOf);
                        int ed = do.ed(abVar, i - 1, 1933956928);
                        if (ed < 999999999) {
                            num = Integer.toString(ed);
                        } else {
                            num = "*";
                        }
                        str = substring + num + str.substring(indexOf + 2);
                    }
                }
            }
            return str;
        } catch (Throwable e) {
            throw ei.ac(e, "fx.ei(" + ')');
        }
    }
}
