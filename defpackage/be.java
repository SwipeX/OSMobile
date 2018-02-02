package defpackage;

public class be extends je {
    static final int aa = 16777215;
    public static final int ai = 1;
    public static short[][] ap = null;
    static final int as = 15;
    public static final int at = 4;
    static kh do;
    static em ee;
    bv[] aj;

    public static be an(ju juVar, ju juVar2, int i, boolean z) {
        int[] ae = juVar.ae(i, -1514221442);
        int i2 = 1;
        for (int ai : ae) {
            int ai2;
            byte[] ai3 = juVar.ai(i, ai2, 538685838);
            if (ai3 == null) {
                i2 = 0;
            } else {
                ai2 = (ai3[1] & 255) | ((ai3[0] & 255) << 8);
                if (z) {
                    ai3 = juVar2.ai(0, ai2, 1356190130);
                } else {
                    ai3 = juVar2.ai(ai2, 0, -5255618);
                }
                if (ai3 == null) {
                    i2 = 0;
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new be(juVar, juVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    public static be aq(ju juVar, ju juVar2, int i, boolean z) {
        int[] ae = juVar.ae(i, -1954717171);
        int i2 = 1;
        for (int ai : ae) {
            int ai2;
            byte[] ai3 = juVar.ai(i, ai2, 1050124471);
            if (ai3 == null) {
                i2 = 0;
            } else {
                ai2 = (ai3[1] & 255) | ((ai3[0] & 255) << 8);
                if (z) {
                    ai3 = juVar2.ai(0, ai2, 335570342);
                } else {
                    ai3 = juVar2.ai(ai2, 0, -361598268);
                }
                if (ai3 == null) {
                    i2 = 0;
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        try {
            return new be(juVar, juVar2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    be(ju juVar, ju juVar2, int i, boolean z) {
        try {
            jm jmVar = new jm();
            this.aj = new bv[juVar.as(i, 415667447)];
            int[] ae = juVar.ae(i, -1973691321);
            for (int i2 = 0; i2 < ae.length; i2++) {
                byte[] an = juVar.an(i, ae[i2], -1767274002);
                int i3 = (an[1] & 255) | ((an[0] & 255) << 8);
                by byVar = (by) jmVar.ak();
                while (byVar != null) {
                    if (-1231412609 * byVar.aj == i3) {
                        break;
                    }
                    byVar = (by) jmVar.at();
                }
                byVar = null;
                if (byVar == null) {
                    byte[] ai;
                    if (z) {
                        ai = juVar2.ai(0, i3, 346846930);
                    } else {
                        ai = juVar2.ai(i3, 0, 1909070266);
                    }
                    byVar = new by(i3, ai);
                    jmVar.ac(byVar);
                }
                this.aj[ae[i2]] = new bv(an, byVar);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "be.<init>(" + ')');
        }
    }

    static final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, es esVar, int i8) {
        try {
            int[] bf = cc.bf(i, i2, i3);
            int[] bf2 = cc.bf(i4, i5, i6);
            esVar.as(bf[0], bf[1], bf2[0], bf2[1], i7, (byte) 8);
        } catch (Throwable e) {
            throw ei.ac(e, "be.aj(" + ')');
        }
    }

    public boolean aa(int i) {
        return this.aj[i].ai;
    }

    public boolean ac(int i, int i2) {
        try {
            return this.aj[i].ai;
        } catch (Throwable e) {
            throw ei.ac(e, "be.ac(" + ')');
        }
    }

    public boolean ak(int i) {
        return this.aj[i].ai;
    }

    public boolean ao(int i) {
        return this.aj[i].ai;
    }

    static void au(int i) {
        try {
            if (fy.aj((byte) -35)) {
                fw.cs = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "be.au(" + ')');
        }
    }

    static final void bh(byte b) {
        try {
            if (710071157 * client.dd > 0) {
                ab.bp(-1970893750);
                return;
            }
            client.di.ac(-224225549);
            gx.as(40, (short) -14051);
            ap.dr = client.dp.ak(-853353376);
            client.dp.aa((byte) 19);
        } catch (Throwable e) {
            throw ei.ac(e, "be.bh(" + ')');
        }
    }

    static final void fq(int i) {
        int i2 = 0;
        while (i2 < fu.aa * -2089377233) {
            try {
                client.hx[fu.ak[i2]].ak(-391476280);
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "be.fq(" + ')');
            }
        }
    }
}
