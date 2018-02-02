package defpackage;

import java.util.Collection;

public class as extends je {
    static final int aa = 70;
    static ju ac;
    static ju aj;
    static js an = new js(64, null);
    static js aq = new js(64, null);
    static jn bn;
    int ae;
    public int ah;
    public int ai;
    public int al;
    int am;
    public int ao;
    public int ap;
    public int as;
    public int at;
    public int aw;

    as() {
        try {
            this.ap = -660918977;
            this.at = -146901967;
            this.ah = 1516226491;
            this.ai = -1896672047;
            this.aw = 1333999126;
            this.am = 2043292273;
            this.ae = 2071528801;
            this.as = 446080294;
            this.al = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "as.<init>(" + ')');
        }
    }

    public static void ap(ju juVar, ju juVar2) {
        aj = juVar;
        ac = juVar2;
    }

    public static as ah(int i) {
        as asVar = (as) an.aj((long) i);
        if (asVar == null) {
            byte[] an = aj.an(33, i, -1278070366);
            asVar = new as();
            if (an != null) {
                asVar.an(new he(an), 2088328840);
            }
            an.an(asVar, (long) i);
        }
        return asVar;
    }

    public static as ai(int i) {
        as asVar = (as) an.aj((long) i);
        if (asVar == null) {
            byte[] an = aj.an(33, i, -302887160);
            asVar = new as();
            if (an != null) {
                asVar.an(new he(an), 2033479694);
            }
            an.an(asVar, (long) i);
        }
        return asVar;
    }

    public static as at(int i) {
        as asVar = (as) an.aj((long) i);
        if (asVar == null) {
            byte[] an = aj.an(33, i, 67535225);
            asVar = new as();
            if (an != null) {
                asVar.an(new he(an), 2087837709);
            }
            an.an(asVar, (long) i);
        }
        return asVar;
    }

    public static int aq(int i, int i2) {
        int i3;
        int i4 = 0;
        if (i < 0 || i >= 65536) {
            i3 = i >>> 16;
            i4 = 16;
        } else {
            i3 = i;
        }
        if (i3 >= bq.ah) {
            i3 >>>= 8;
            i4 += 8;
        }
        if (i3 >= 16) {
            i3 >>>= 4;
            i4 += 4;
        }
        if (i3 >= 4) {
            i3 >>>= 2;
            i4 += 2;
        }
        if (i3 >= 1) {
            i3 >>>= 1;
            i4++;
        }
        return i4 + i3;
    }

    void ae(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -2029070058);
            } else {
                return;
            }
        }
    }

    void am(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -1972330469);
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
                    aq(heVar, au, -1934663673);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "as.an(" + ')');
            }
        }
    }

    void as(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -2002631873);
            } else {
                return;
            }
        }
    }

    void aw(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, -1977790746);
            } else {
                return;
            }
        }
    }

    void al(he heVar, int i) {
        if (i == 1) {
            heVar.ay((byte) 1);
        } else if (2 == i) {
            this.ap = heVar.au(-310118664) * 1540862217;
        } else if (3 == i) {
            this.at = heVar.au(-310118664) * 792694207;
        } else if (4 == i) {
            this.ah = 0;
        } else if (5 == i) {
            this.aw = heVar.ay((byte) 1) * -1882999815;
        } else if (6 == i) {
            heVar.au(-310118664);
        } else if (7 == i) {
            this.am = heVar.by((byte) -70) * -2043292273;
        } else if (8 == i) {
            this.ae = heVar.by((byte) -78) * -2071528801;
        } else if (i == 11) {
            this.ah = heVar.ay((byte) 1) * -738042885;
        } else if (i == 14) {
            this.as = heVar.au(-310118664) * 1589690685;
        } else if (i == 15) {
            this.al = heVar.au(-310118664) * -1408450182;
        }
    }

    void aq(he heVar, int i, int i2) {
        if (i == 1) {
            try {
                heVar.ay((byte) 1);
            } catch (Throwable e) {
                throw ei.ac(e, "as.aq(" + ')');
            }
        } else if (2 == i) {
            this.ap = heVar.au(-310118664) * 536384449;
        } else if (3 == i) {
            this.at = heVar.au(-310118664) * 622615247;
        } else if (4 == i) {
            this.ah = 0;
        } else if (5 == i) {
            this.aw = heVar.ay((byte) 1) * -1882999815;
        } else if (6 == i) {
            heVar.au(-310118664);
        } else if (7 == i) {
            this.am = heVar.by((byte) -52) * -2043292273;
        } else if (8 == i) {
            this.ae = heVar.by((byte) -77) * -2071528801;
        } else if (i == 11) {
            this.ah = heVar.ay((byte) 1) * -1516226491;
        } else if (i == 14) {
            this.as = heVar.au(-310118664) * 1589690685;
        } else if (i == 15) {
            this.al = heVar.au(-310118664) * 1254256553;
        }
    }

    public em ao(int i) {
        try {
            if (this.am * -66868881 < 0) {
                return null;
            }
            em emVar = (em) aq.aj((long) (this.am * -66868881));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.am * -66868881, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            aq.an(emVar, (long) (this.am * -66868881));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "as.ao(" + ')');
        }
    }

    public em az() {
        if (this.am * -66868881 < 0) {
            return null;
        }
        em emVar = (em) aq.aj((long) (this.am * -66868881));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.am * -66868881, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        aq.an(emVar, (long) (this.am * -66868881));
        return emVar;
    }

    public em aa(int i) {
        try {
            if (this.ae * -1730829985 < 0) {
                return null;
            }
            em emVar = (em) aq.aj((long) (this.ae * -1730829985));
            if (emVar != null) {
                return emVar;
            }
            emVar = aw.aq(ac, this.ae * -1730829985, 0, 1206476650);
            if (emVar == null) {
                return emVar;
            }
            aq.an(emVar, (long) (this.ae * -1730829985));
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "as.aa(" + ')');
        }
    }

    public em af() {
        if (this.ae * -1730829985 < 0) {
            return null;
        }
        em emVar = (em) aq.aj((long) (this.ae * -1730829985));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.ae * -1730829985, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        aq.an(emVar, (long) (this.ae * -1730829985));
        return emVar;
    }

    public em au() {
        if (this.ae * -1730829985 < 0) {
            return null;
        }
        em emVar = (em) aq.aj((long) (this.ae * -1730829985));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.ae * -1730829985, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        aq.an(emVar, (long) (this.ae * -1730829985));
        return emVar;
    }

    public em ax() {
        if (this.ae * -1730829985 < 0) {
            return null;
        }
        em emVar = (em) aq.aj((long) (this.ae * -1730829985));
        if (emVar != null) {
            return emVar;
        }
        emVar = aw.aq(ac, this.ae * -1730829985, 0, 1206476650);
        if (emVar == null) {
            return emVar;
        }
        aq.an(emVar, (long) (this.ae * -1730829985));
        return emVar;
    }

    public static void aj(ju juVar, ju juVar2, boolean z, kh khVar, int i) {
        try {
            av.ap = juVar;
            av.at = juVar2;
            av.ah = z;
            iz.ai = av.ap.as(10, 415667447) * -2051958535;
            af.as = khVar;
        } catch (Throwable e) {
            throw ei.ac(e, "as.aj(" + ')');
        }
    }

    static int ac(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 > 179) {
            try {
                i5 = i2 / 2;
            } catch (Throwable e) {
                throw ei.ac(e, "as.ac(" + ')');
            }
        }
        i5 = i2;
        if (i3 > 192) {
            i5 /= 2;
        }
        if (i3 > 217) {
            i5 /= 2;
        }
        if (i3 > 243) {
            i5 /= 2;
        }
        return (((i5 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    public static void av(Collection collection) {
        collection.add(an);
        collection.add(aq);
    }

    public static void ay(Collection collection) {
        collection.add(an);
        collection.add(aq);
    }
}
