package defpackage;

public class ku implements hp {
    static final ku ac = new ku(0, 1, Long.class, new km());
    static final ku aj = new ku(1, 0, Integer.class, new kx());
    static final ku an = new ku(2, 2, String.class, new kz());
    public static final int bn = 64;
    final int ao;
    final int aq;

    ku(int i, int i2, Class cls, kw kwVar) {
        try {
            this.aq = 822106691 * i;
            this.ao = -1573855103 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "ku.<init>(" + ')');
        }
    }

    public int aa() {
        return this.ao * -1165009023;
    }

    public int ac(byte b) {
        try {
            return this.ao * -1165009023;
        } catch (Throwable e) {
            throw ei.ac(e, "ku.ac(" + ')');
        }
    }

    public int ao() {
        return this.ao * -1165009023;
    }

    public int aq() {
        return this.ao * 513795270;
    }

    public static boolean an(int i, int i2) {
        int i3 = 0;
        try {
            if (hc.ak[i]) {
                return true;
            }
            if (!ab.ap.ak(i, 450656775)) {
                return false;
            }
            int as = ab.ap.as(i, 415667447);
            if (as == 0) {
                hc.ak[i] = true;
                return true;
            }
            if (ab.aa[i] == null) {
                ab.aa[i] = new ab[as];
            }
            while (i3 < as) {
                if (ab.aa[i][i3] == null) {
                    byte[] an = ab.ap.an(i, i3, -131382438);
                    if (an != null) {
                        ab.aa[i][i3] = new ab();
                        ab.aa[i][i3].ax = -1349417461 * ((i << 16) + i3);
                        if (an[0] == (byte) -1) {
                            ab.aa[i][i3].ao(new he(an), -1356808897);
                        } else {
                            ab.aa[i][i3].aq(new he(an), 294022501);
                        }
                    }
                }
                i3++;
            }
            hc.ak[i] = true;
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "ku.an(" + ')');
        }
    }
}
