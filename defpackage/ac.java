package defpackage;

public class ac {
    static final int ak = 30;
    static fl aw;
    static jn co;
    static int fk;

    ac() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ac.<init>(" + ')');
        }
    }

    static final jk ao(he heVar, jk jkVar) {
        int au = heVar.au(-310118664);
        if (jkVar == null) {
            jkVar = new jk(cf.an(au, -1686743923));
        }
        for (int i = 0; i < au; i++) {
            Object obj;
            jt kgVar;
            if (heVar.au(-310118664) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            int ar = heVar.ar(597353088);
            if (obj != null) {
                kgVar = new kg(heVar.bh(-1674159922));
            } else {
                kgVar = new jp(heVar.ad((byte) -89));
            }
            jkVar.ac(kgVar, (long) ar);
        }
        return jkVar;
    }

    static final jk aq(he heVar, jk jkVar) {
        int au = heVar.au(-310118664);
        if (jkVar == null) {
            jkVar = new jk(cf.an(au, 1834017983));
        }
        for (int i = 0; i < au; i++) {
            Object obj;
            jt kgVar;
            if (heVar.au(-310118664) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            int ar = heVar.ar(597353088);
            if (obj != null) {
                kgVar = new kg(heVar.bh(645808974));
            } else {
                kgVar = new jp(heVar.ad((byte) -83));
            }
            jkVar.ac(kgVar, (long) ar);
        }
        return jkVar;
    }

    static int aa(jk jkVar, int i, int i2) {
        if (jkVar == null) {
            return i2;
        }
        jp jpVar = (jp) jkVar.aj((long) i);
        return jpVar != null ? jpVar.aj : i2;
    }

    static int ak(jk jkVar, int i, int i2) {
        if (jkVar == null) {
            return i2;
        }
        jp jpVar = (jp) jkVar.aj((long) i);
        return jpVar != null ? jpVar.aj : i2;
    }

    static String ap(jk jkVar, int i, String str) {
        if (jkVar == null) {
            return str;
        }
        kg kgVar = (kg) jkVar.aj((long) i);
        return kgVar != null ? (String) kgVar.aj : str;
    }

    static String at(jk jkVar, int i, String str) {
        if (jkVar == null) {
            return str;
        }
        kg kgVar = (kg) jkVar.aj((long) i);
        return kgVar != null ? (String) kgVar.aj : str;
    }

    public static ab aj(int i, int i2) {
        int i3 = i >> 16;
        int i4 = 65535 & i;
        try {
            if ((ab.aa[i3] == null || ab.aa[i3][i4] == null) && !ku.an(i3, 1671262481)) {
                return null;
            }
            return ab.aa[i3][i4];
        } catch (Throwable e) {
            throw ei.ac(e, "ac.aj(" + ')');
        }
    }

    public static void fs(int i, int i2, int i3, int i4) {
        try {
            mg ac = hd.ac(mr.ci, client.dp.ao, (byte) 92);
            ac.an.an(i3, (byte) -63);
            ac.an.cl(i, 377029823);
            ac.an.aq(i2, 900848636);
            client.dp.an(ac, 759549199);
        } catch (Throwable e) {
            throw ei.ac(e, "ac.fs(" + ')');
        }
    }
}
