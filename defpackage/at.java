package defpackage;

import java.util.Collection;

public class at extends je {
    static js ac = new js(64, null);
    static ju aj = null;
    public static final int az = 33;
    boolean aa;
    char an;
    public String ao;
    public int aq;

    at() {
        try {
            this.aa = true;
        } catch (Throwable e) {
            throw ei.ac(e, "at.<init>(" + ')');
        }
    }

    public static void ah(ju juVar) {
        aj = juVar;
    }

    public static void ap(ju juVar) {
        aj = juVar;
    }

    public static void at(ju juVar) {
        aj = juVar;
    }

    public static at ai(int i) {
        at atVar = (at) ac.aj((long) i);
        if (atVar == null) {
            byte[] an = aj.an(11, i, -1905754414);
            atVar = new at();
            if (an != null) {
                atVar.aq(new he(an), 1613671477);
            }
            atVar.an(-168570877);
            ac.an(atVar, (long) i);
        }
        return atVar;
    }

    public static at aw(int i) {
        at atVar = (at) ac.aj((long) i);
        if (atVar == null) {
            byte[] an = aj.an(11, i, 98485450);
            atVar = new at();
            if (an != null) {
                atVar.aq(new he(an), 2054483567);
            }
            atVar.an(1997397678);
            ac.an(atVar, (long) i);
        }
        return atVar;
    }

    void ae() {
    }

    void am() {
    }

    void an(int i) {
    }

    void as() {
    }

    void al(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                ao(heVar, au, -2093000904);
            } else {
                return;
            }
        }
    }

    void aq(he heVar, int i) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    ao(heVar, au, -2127488411);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "at.aq(" + ')');
            }
        }
    }

    void az(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                ao(heVar, au, 1082159736);
            } else {
                return;
            }
        }
    }

    void af(he heVar, int i) {
        if (1 == i) {
            int av = heVar.av(-1824493795) & 255;
            if (av == 0) {
                throw new IllegalArgumentException("");
            }
            if (av >= -1479281184 && av < 160) {
                av = lk.aj[av - 1819153463];
                if (av == 0) {
                    av = -1910958156;
                }
            }
            this.an = (char) av;
        } else if (2 == i) {
            this.aq = heVar.ad((byte) -72) * -1378544846;
        } else if (4 == i) {
            this.aa = false;
        } else if (i == 5) {
            this.ao = heVar.bh(-1639995974);
        }
    }

    void ao(he heVar, int i, int i2) {
        if (1 == i) {
            try {
                int av = heVar.av(-1613393304) & 255;
                if (av == 0) {
                    throw new IllegalArgumentException("");
                }
                if (av >= cj.ak && av < 160) {
                    av = lk.aj[av - 128];
                    if (av == 0) {
                        av = 63;
                    }
                }
                this.an = (char) av;
            } catch (Throwable e) {
                throw ei.ac(e, "at.ao(" + ')');
            }
        } else if (2 == i) {
            this.aq = heVar.ad((byte) -52) * -608097477;
        } else if (4 == i) {
            this.aa = false;
        } else if (i == 5) {
            this.ao = heVar.bh(373626122);
        }
    }

    void ax(he heVar, int i) {
        if (1 == i) {
            int av = heVar.av(-1308184817) & 255;
            if (av == 0) {
                throw new IllegalArgumentException("");
            }
            if (av >= cj.ak && av < 160) {
                av = lk.aj[av - 128];
                if (av == 0) {
                    av = 63;
                }
            }
            this.an = (char) av;
        } else if (2 == i) {
            this.aq = heVar.ad((byte) -115) * -608097477;
        } else if (4 == i) {
            this.aa = false;
        } else if (i == 5) {
            this.ao = heVar.bh(504596598);
        }
    }

    public boolean aa(int i) {
        try {
            return this.an == 's';
        } catch (Throwable e) {
            throw ei.ac(e, "at.aa(" + ')');
        }
    }

    public boolean au() {
        return this.an == 's';
    }

    public static void ag(Collection collection) {
        collection.add(ac);
    }

    public static void av(Collection collection) {
        collection.add(ac);
    }

    public static void ay(Collection collection) {
        collection.add(ac);
    }

    static final int as(int i, int i2, int i3) {
        int i4 = 2;
        if (-1 == i) {
            return 12345678;
        }
        try {
            int i5 = ((i & 127) * i2) / cj.ak;
            if (i5 >= 2) {
                if (i5 > 126) {
                    i4 = 126;
                } else {
                    i4 = i5;
                }
            }
            return i4 + (65408 & i);
        } catch (Throwable e) {
            throw ei.ac(e, "at.as(" + ')');
        }
    }

    static void af(gh ghVar, int i) {
        try {
            int i2;
            if (ghVar.ap(1914508244) != client.at) {
                client.at = ghVar.ap(2140804399);
                ff.ay(ghVar.ap(1597458526), 1987026345);
            }
            af.cv = ghVar.ae;
            client.an = ghVar.ai * -2071075287;
            client.aq = 1107141433 * ghVar.aw;
            if (client.aa * 1477204923 == 0) {
                i2 = 43594;
            } else {
                i2 = (ghVar.ai * 1057964181) + cw.aj;
            }
            de.cu = i2 * -1591359037;
            if (client.aa * 1477204923 == 0) {
                i2 = 443;
            } else {
                i2 = 50000 + (ghVar.ai * 1057964181);
            }
            dw.cg = i2 * 288844821;
            ay.cs = -1755801289 * de.cu;
        } catch (Throwable e) {
            throw ei.ac(e, "at.af(" + ')');
        }
    }

    static final void en(int i, byte b) {
        try {
            if (ku.an(i, 1671262481)) {
                ab[] abVarArr = ab.aa[i];
                for (ab abVar : abVarArr) {
                    if (abVar != null) {
                        abVar.fo = 0;
                        abVar.fk = 0;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "at.en(" + ')');
        }
    }

    public static int ft(ab abVar, int i) {
        try {
            jp jpVar = (jp) client.kt.aj((((long) (abVar.ax * -1035840093)) << 32) + ((long) (abVar.af * -303442303)));
            return jpVar != null ? jpVar.aj : -1649638967 * abVar.di;
        } catch (Throwable e) {
            throw ei.ac(e, "at.ft(" + ')');
        }
    }
}
