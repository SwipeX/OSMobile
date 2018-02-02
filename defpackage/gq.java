package defpackage;

public class gq implements gl {
    static final int ap = 8;
    static int jx;

    public float ac(float f) {
        return (f * f) * f;
    }

    public float aj(float f, int i) {
        return (f * f) * f;
    }

    public float an(float f) {
        return (f * f) * f;
    }

    public static aq ac(int i, int i2) {
        try {
            aq aqVar = (aq) aq.aq.aj((long) i);
            if (aqVar == null) {
                byte[] an = aq.aj.an(32, i, -19143150);
                aqVar = new aq();
                if (an != null) {
                    aqVar.an(new he(an), -1303836551);
                }
                aq.aq.an(aqVar, (long) i);
            }
            return aqVar;
        } catch (Throwable e) {
            throw ei.ac(e, "gq.ac(" + ')');
        }
    }

    static void ak(char c, int i) {
        Object obj = 1;
        Object obj2 = null;
        try {
            int i2;
            if (fw.bc * 2048922173 == 2) {
                for (i2 = 0; i2 < fw.cv.length(); i2++) {
                    if (c == fw.cv.charAt(i2)) {
                        obj2 = 1;
                        break;
                    }
                }
                if (obj2 == null) {
                    return;
                }
                if (fw.cq * -2064175101 == 0) {
                    if (fw.cy.length() < 320) {
                        fw.cy += c;
                    }
                } else if (fw.cq * -2064175101 == 1 && fw.cl.length() < 20) {
                    fw.cl += c;
                }
            } else if (fw.bc * 2048922173 == 4) {
                for (i2 = 0; i2 < fw.cu.length(); i2++) {
                    if (c == fw.cu.charAt(i2)) {
                        break;
                    }
                }
                obj = null;
                if (obj != null && cv.ch.length() < 6) {
                    cv.ch += c;
                }
            } else if (fw.bc * 2048922173 == 5) {
                for (i2 = 0; i2 < fw.cv.length(); i2++) {
                    if (c == fw.cv.charAt(i2)) {
                        break;
                    }
                }
                obj = null;
                if (obj != null && fw.cy.length() < 320) {
                    fw.cy += c;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gq.ak(" + ')');
        }
    }
}
