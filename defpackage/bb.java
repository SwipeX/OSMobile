package defpackage;

public class bb {
    static final int ab = 26;
    static int am = 0;
    public static int an = 0;
    public static final int cl = 72;

    bb() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "bb.<init>(" + ')');
        }
    }

    public static boolean aa(int i) {
        return (i & 1) != 0;
    }

    public static boolean ak(int i) {
        return (i & 1) != 0;
    }

    public static boolean ap(int i, int i2) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    public static int ah(int i) {
        return (i >> 11) & 63;
    }

    public static int ai(int i) {
        return (i >> 11) & 797333195;
    }

    public static int at(int i) {
        return (i >> 11) & 63;
    }

    public static boolean am(int i) {
        return ((i >> 21) & 1) != 0;
    }

    public static boolean aw(int i) {
        return ((i >> 21) & 1) != 0;
    }

    public static boolean ae(int i) {
        return ((i >> 30) & 1) != 0;
    }

    public static at ac(int i, int i2) {
        try {
            at atVar = (at) at.ac.aj((long) i);
            if (atVar == null) {
                byte[] an = at.aj.an(11, i, 130378479);
                atVar = new at();
                if (an != null) {
                    atVar.aq(new he(an), 1721267468);
                }
                atVar.an(-1496482992);
                at.ac.an(atVar, (long) i);
            }
            return atVar;
        } catch (Throwable e) {
            throw ei.ac(e, "bb.ac(" + ')');
        }
    }

    static void aj(int i) {
        try {
            for (fg fgVar = (fg) fg.aj.ak(); fgVar != null; fgVar = (fg) fg.aj.at()) {
                if (fgVar.at != null) {
                    dx.mh.ac(fgVar.at);
                    fgVar.at = null;
                }
                if (fgVar.ae != null) {
                    dx.mh.ac(fgVar.ae);
                    fgVar.ae = null;
                }
            }
            fg.aj.aj();
        } catch (Throwable e) {
            throw ei.ac(e, "bb.aj(" + ')');
        }
    }

    static final boolean ex(ab abVar, int i) {
        try {
            if (abVar.fj == null) {
                return false;
            }
            for (int i2 = 0; i2 < abVar.fj.length; i2++) {
                int ed = do.ed(abVar, i2, 1406635459);
                int i3 = abVar.fi[i2];
                if (2 == abVar.fj[i2]) {
                    if (ed >= i3) {
                        return false;
                    }
                } else if (3 == abVar.fj[i2]) {
                    if (ed <= i3) {
                        return false;
                    }
                } else if (abVar.fj[i2] == 4) {
                    if (ed == i3) {
                        return false;
                    }
                } else if (ed != i3) {
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "bb.ex(" + ')');
        }
    }

    static ab eo(ab abVar, byte b) {
        ab abVar2 = null;
        try {
            int ft = (at.ft(abVar, 1588397356) >> 17) & 7;
            if (ft != 0) {
                int i = 0;
                ab abVar3 = abVar;
                while (i < ft) {
                    ab aj = ac.aj(abVar3.bi * -1228023025, -713378241);
                    if (aj == null) {
                        break;
                    }
                    i++;
                    abVar3 = aj;
                }
                abVar2 = abVar3;
            }
            if (abVar2 == null) {
                return abVar.dq;
            }
            return abVar2;
        } catch (Throwable e) {
            throw ei.ac(e, "bb.eo(" + ')');
        }
    }
}
