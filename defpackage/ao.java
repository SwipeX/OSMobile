package defpackage;

public class ao extends je {
    public static js ac = new js(64, null);
    static ju aj = null;
    static final int ak = 256;
    static final String ap = "main_file_cache.idx255";
    static lr qh;
    public int an;
    public int ao;
    public int aq;

    public static boolean ac(int i, int i2, byte b) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    ao() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ao.<init>(" + ')');
        }
    }

    public static void aa(ju juVar) {
        aj = juVar;
    }

    public static void ao(ju juVar) {
        aj = juVar;
    }

    public static ao ak(int i) {
        ao aoVar = (ao) ac.aj((long) i);
        if (aoVar == null) {
            byte[] an = aj.an(14, i, -1299658572);
            aoVar = new ao();
            if (an != null) {
                aoVar.an(new he(an), -185044474);
            }
            ac.an(aoVar, (long) i);
        }
        return aoVar;
    }

    public static ao ap(int i) {
        ao aoVar = (ao) ac.aj((long) i);
        if (aoVar == null) {
            byte[] an = aj.an(14, i, -339694645);
            aoVar = new ao();
            if (an != null) {
                aoVar.an(new he(an), -1876302136);
            }
            ac.an(aoVar, (long) i);
        }
        return aoVar;
    }

    public static ao at(int i) {
        ao aoVar = (ao) ac.aj((long) i);
        if (aoVar == null) {
            byte[] an = aj.an(14, i, 429970905);
            aoVar = new ao();
            if (an != null) {
                aoVar.an(new he(an), -2029089928);
            }
            ac.an(aoVar, (long) i);
        }
        return aoVar;
    }

    void ah(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -1179669140);
            } else {
                return;
            }
        }
    }

    void ai(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, 1274136689);
            } else {
                return;
            }
        }
    }

    void am(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, 1620604741);
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
                    aq(heVar, au, 1540355066);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ao.an(" + ')');
            }
        }
    }

    void aw(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, 814481478);
            } else {
                return;
            }
        }
    }

    void ae(he heVar, int i) {
        if (1 == i) {
            this.an = heVar.ay((byte) 1) * 413077953;
            this.aq = heVar.au(-310118664) * 987050839;
            this.ao = heVar.au(-310118664) * 2086562021;
        }
    }

    void al(he heVar, int i) {
        if (1 == i) {
            this.an = heVar.ay((byte) 1) * -37343325;
            this.aq = heVar.au(-310118664) * -1340600174;
            this.ao = heVar.au(-310118664) * 1745665809;
        }
    }

    void aq(he heVar, int i, int i2) {
        if (1 == i) {
            try {
                this.an = heVar.ay((byte) 1) * 413077953;
                this.aq = heVar.au(-310118664) * 987050839;
                this.ao = heVar.au(-310118664) * 2086562021;
            } catch (Throwable e) {
                throw ei.ac(e, "ao.aq(" + ')');
            }
        }
    }

    void as(he heVar, int i) {
        if (1 == i) {
            this.an = heVar.ay((byte) 1) * 413077953;
            this.aq = heVar.au(-310118664) * 987050839;
            this.ao = heVar.au(-310118664) * 2086562021;
        }
    }
}
