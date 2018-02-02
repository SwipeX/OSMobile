package defpackage;

import java.util.Collection;

public class ap extends je {
    static js ac = new js(64, null);
    static long ad = 0;
    static final int ag = 24;
    public static ju aj;
    static lo dr;
    public int an;

    ap() {
        try {
            this.an = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "ap.<init>(" + ')');
        }
    }

    public static ap aa(int i) {
        ap apVar = (ap) ac.aj((long) i);
        if (apVar == null) {
            byte[] an = aj.an(5, i, -841648410);
            apVar = new ap();
            if (an != null) {
                apVar.ac(new he(an), (byte) -14);
            }
            ac.an(apVar, (long) i);
        }
        return apVar;
    }

    public static ap ao(int i) {
        ap apVar = (ap) ac.aj((long) i);
        if (apVar == null) {
            byte[] an = aj.an(5, i, -966329244);
            apVar = new ap();
            if (an != null) {
                apVar.ac(new he(an), (byte) 6);
            }
            ac.an(apVar, (long) i);
        }
        return apVar;
    }

    void ac(he heVar, byte b) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    an(heVar, au, 946024861);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ap.ac(" + ')');
            }
        }
    }

    void ak(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, -566555838);
            } else {
                return;
            }
        }
    }

    void ap(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, 1626034548);
            } else {
                return;
            }
        }
    }

    void at(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                an(heVar, au, -1938855924);
            } else {
                return;
            }
        }
    }

    void ah(he heVar, int i) {
        if (2 == i) {
            this.an = heVar.ay((byte) 1) * -1982832913;
        }
    }

    void ai(he heVar, int i) {
        if (2 == i) {
            this.an = heVar.ay((byte) 1) * -1982832913;
        }
    }

    void am(he heVar, int i) {
        if (2 == i) {
            this.an = heVar.ay((byte) 1) * -1982832913;
        }
    }

    void an(he heVar, int i, int i2) {
        if (2 == i) {
            try {
                this.an = heVar.ay((byte) 1) * -1982832913;
            } catch (Throwable e) {
                throw ei.ac(e, "ap.an(" + ')');
            }
        }
    }

    void aw(he heVar, int i) {
        if (2 == i) {
            this.an = heVar.ay((byte) 1) * -1982832913;
        }
    }

    public static void ae(Collection collection) {
        collection.add(ac);
    }

    public static void al(Collection collection) {
        collection.add(ac);
    }

    public static void as(Collection collection) {
        collection.add(ac);
    }

    public static void az(Collection collection) {
        collection.add(ac);
    }

    static final int ae(int i, int i2, int i3) {
        int i4 = (i2 * 57) + i;
        i4 ^= i4 << 13;
        return ((((i4 * (789221 + ((i4 * i4) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }
}
