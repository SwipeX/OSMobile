package defpackage;

public final class cx extends cv {
    public static ff hb = null;
    public static int ix = 0;
    static final int ko = 2160;
    static int mj = 0;
    static final int ng = 5;
    final int aa;
    final int ac;
    final int aj;
    final int ak;
    final int an;
    final int ao;
    final int aq;

    public static boolean ac(String str, int i, String str2, byte b) {
        if (i == 0) {
            try {
                if (!ki.aj.startsWith("win")) {
                    throw new Exception();
                } else if (str.startsWith("http://") || str.startsWith("https://")) {
                    String str3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (str3.indexOf(str.charAt(i2)) == -1) {
                            throw new Exception();
                        }
                    }
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable th) {
                return false;
            }
        } else if (i == 1 || i == 2 || i == 3) {
            return true;
        } else {
            try {
                throw new IllegalArgumentException();
            } catch (Throwable e) {
                throw ei.ac(e, "cx.ac(" + ')');
            }
        }
    }

    public cx(ct ctVar, int i, int i2, int i3, int i4) {
        try {
            this.aj = 2051035349 * ((ctVar.bz + i) - ctVar.ba);
            this.ac = ((ctVar.bq + i2) - ctVar.bv) * 1087396311;
            this.an = 747571807 * ((ctVar.bj + i3) - ctVar.be);
            this.aq = -859301427 * (ctVar.ba + (ctVar.bz + i));
            this.ao = -737400535 * ((ctVar.bq + i2) + ctVar.bv);
            this.aa = 272087801 * ((ctVar.bj + i3) + ctVar.be);
            this.ak = 604599769 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "cx.<init>(" + ')');
        }
    }

    final void ac(es esVar, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((i2 & 1) == 0) {
                try {
                    int i3 = 666527869 * this.aj;
                } catch (Throwable e) {
                    throw ei.ac(e, "cx.ac(" + ')');
                }
            }
            i3 = -797279483 * this.aq;
            int i4 = (i2 & 2) == 0 ? -1764709913 * this.ac : -71269607 * this.ao;
            int i5 = (i2 & 4) == 0 ? this.an * 1139790239 : -2050103479 * this.aa;
            if ((i2 & 1) == 0) {
                be.aj(i3, i4, i5, -797279483 * this.aq, i4, i5, this.ak * -1843938711, esVar, -306687368);
            }
            if ((i2 & 2) == 0) {
                be.aj(i3, i4, i5, i3, this.ao * -71269607, i5, this.ak * -1843938711, esVar, -1811437140);
            }
            if ((i2 & 4) == 0) {
                be.aj(i3, i4, i5, i3, i4, -2050103479 * this.aa, -1843938711 * this.ak, esVar, -1803492804);
            }
        }
    }

    final void ao(es esVar) {
        for (int i = 0; i < 8; i++) {
            int i2;
            int i3;
            if ((i & 1) == 0) {
                i2 = 666527869 * this.aj;
            } else {
                i2 = 1247392575 * this.aq;
            }
            if ((i & 2) == 0) {
                i3 = 1329540499 * this.ac;
            } else {
                i3 = 774038831 * this.ao;
            }
            int i4 = (i & 4) == 0 ? this.an * 1139790239 : -2094856543 * this.aa;
            if ((i & 1) == 0) {
                be.aj(i2, i3, i4, 564356605 * this.aq, i3, i4, this.ak * 2083165091, esVar, 284302178);
            }
            if ((i & 2) == 0) {
                be.aj(i2, i3, i4, i2, this.ao * 584696013, i4, this.ak * -1070693165, esVar, -977689585);
            }
            if ((i & 4) == 0) {
                be.aj(i2, i3, i4, i2, i3, -1389431849 * this.aa, -1843938711 * this.ak, esVar, -1124856645);
            }
        }
    }

    final void aq(es esVar) {
        for (int i = 0; i < 8; i++) {
            int i2;
            int i3 = (i & 1) == 0 ? 666527869 * this.aj : this.aq * -797279483;
            if ((i & 2) == 0) {
                i2 = -1764709913 * this.ac;
            } else {
                i2 = this.ao * -71269607;
            }
            int i4 = (i & 4) == 0 ? this.an * 1139790239 : -2050103479 * this.aa;
            if ((i & 1) == 0) {
                be.aj(i3, i2, i4, this.aq * -797279483, i2, i4, this.ak * -503628566, esVar, 2082731455);
            }
            if ((i & 2) == 0) {
                be.aj(i3, i2, i4, i3, -71269607 * this.ao, i4, this.ak * -1843938711, esVar, -978852672);
            }
            if ((i & 4) == 0) {
                be.aj(i3, i2, i4, i3, i2, 1480457587 * this.aa, 369874072 * this.ak, esVar, 274652901);
            }
        }
    }

    public static int ah(String str, int i) {
        try {
            return str.length() + 1;
        } catch (Throwable e) {
            throw ei.ac(e, "cx.ah(" + ')');
        }
    }

    static final void eh(int i, int i2, int i3, boolean z, byte b) {
        try {
            if (ku.an(i, 1671262481)) {
                ce.ek(ab.aa[i], -1, i2, i3, z, 1308520842);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cx.eh(" + ')');
        }
    }
}
