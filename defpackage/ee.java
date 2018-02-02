package defpackage;

public class ee extends ey {
    static final int av = 100;
    static final int bv = 2;
    public static final int cg = 96;
    static int ec = 0;
    static final int jp = 31;
    static ab[] jv;
    boolean aa;
    public int an;
    boolean ao;
    public int aq;

    public static void aj(String[] strArr, short[] sArr, int i, int i2, byte b) {
        if (i < i2) {
            try {
                int i3 = (i2 + i) / 2;
                String str = strArr[i3];
                strArr[i3] = strArr[i2];
                strArr[i2] = str;
                short s = sArr[i3];
                sArr[i3] = sArr[i2];
                sArr[i2] = s;
                int i4 = i;
                i3 = i;
                while (i4 < i2) {
                    if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                        String str2 = strArr[i4];
                        strArr[i4] = strArr[i3];
                        strArr[i3] = str2;
                        short s2 = sArr[i4];
                        sArr[i4] = sArr[i3];
                        int i5 = i3 + 1;
                        sArr[i3] = s2;
                        i3 = i5;
                    }
                    i4++;
                }
                strArr[i2] = strArr[i3];
                strArr[i3] = str;
                sArr[i2] = sArr[i3];
                sArr[i3] = s;
                ee.aj(strArr, sArr, i, i3 - 1, (byte) 30);
                ee.aj(strArr, sArr, i3 + 1, i2, (byte) -23);
            } catch (Throwable e) {
                throw ei.ac(e, "ee.aj(" + ')');
            }
        }
    }

    ee() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ee.<init>(" + ')');
        }
    }

    int ab(ee eeVar) {
        if (this.an * 614420611 == client.an * 54729869 && client.an * 54729869 != eeVar.an * 614420611) {
            return -1;
        }
        if (eeVar.an * 614420611 == client.an * 54729869 && this.an * 614420611 != client.an * 54729869) {
            return 1;
        }
        if (this.an * 614420611 != 0 && eeVar.an * 614420611 == 0) {
            return -1;
        }
        if (eeVar.an * 614420611 != 0 && this.an * 614420611 == 0) {
            return 1;
        }
        if (this.ao && !eeVar.ao) {
            return -1;
        }
        if (!this.ao && eeVar.ao) {
            return 1;
        }
        if (this.aa && !eeVar.aa) {
            return -1;
        }
        if (this.aa || !eeVar.aa) {
            return super.ao(eeVar, 15175449);
        }
        return 1;
    }

    int ad(ee eeVar) {
        if (this.an * 614420611 == client.an * 54729869 && client.an * 54729869 != eeVar.an * 614420611) {
            return -1;
        }
        if (eeVar.an * 614420611 == client.an * 1343872694 && -903341336 * this.an != client.an * 267550370) {
            return 1;
        }
        if (346785594 * this.an != 0 && eeVar.an * -771559893 == 0) {
            return -1;
        }
        if (-1829669758 * eeVar.an != 0 && this.an * -933316497 == 0) {
            return 1;
        }
        if (this.ao && !eeVar.ao) {
            return -1;
        }
        if (!this.ao && eeVar.ao) {
            return 1;
        }
        if (this.aa && !eeVar.aa) {
            return -1;
        }
        if (this.aa || !eeVar.aa) {
            return super.ao(eeVar, -1812827522);
        }
        return 1;
    }

    int ag(ee eeVar, byte b) {
        try {
            if (this.an * 614420611 == client.an * 54729869 && client.an * 54729869 != eeVar.an * 614420611) {
                return -1;
            }
            if (eeVar.an * 614420611 == client.an * 54729869 && this.an * 614420611 != client.an * 54729869) {
                return 1;
            }
            if (this.an * 614420611 != 0 && eeVar.an * 614420611 == 0) {
                return -1;
            }
            if (eeVar.an * 614420611 != 0 && this.an * 614420611 == 0) {
                return 1;
            }
            if (this.ao && !eeVar.ao) {
                return -1;
            }
            if (!this.ao && eeVar.ao) {
                return 1;
            }
            if (this.aa && !eeVar.aa) {
                return -1;
            }
            if (this.aa || !eeVar.aa) {
                return super.ao(eeVar, -527379336);
            }
            return 1;
        } catch (Throwable e) {
            throw ei.ac(e, "ee.ag(" + ')');
        }
    }

    int ar(ee eeVar) {
        if (this.an * 614420611 == client.an * 54729869 && client.an * 54729869 != eeVar.an * 614420611) {
            return -1;
        }
        if (eeVar.an * 614420611 == client.an * 54729869 && this.an * 614420611 != client.an * 54729869) {
            return 1;
        }
        if (this.an * 614420611 != 0 && eeVar.an * 614420611 == 0) {
            return -1;
        }
        if (eeVar.an * 614420611 != 0 && this.an * 614420611 == 0) {
            return 1;
        }
        if (this.ao && !eeVar.ao) {
            return -1;
        }
        if (!this.ao && eeVar.ao) {
            return 1;
        }
        if (this.aa && !eeVar.aa) {
            return -1;
        }
        if (this.aa || !eeVar.aa) {
            return super.ao(eeVar, -177499477);
        }
        return 1;
    }

    int bp(ee eeVar) {
        if (this.an * 614420611 == client.an * 54729869 && client.an * 2057430614 != eeVar.an * 614420611) {
            return -1;
        }
        if (eeVar.an * 614420611 == client.an * 54729869 && this.an * 614420611 != client.an * 54825153) {
            return 1;
        }
        if (1862603760 * this.an != 0 && eeVar.an * -1964929955 == 0) {
            return -1;
        }
        if (eeVar.an * 614420611 != 0 && this.an * -133711068 == 0) {
            return 1;
        }
        if (this.ao && !eeVar.ao) {
            return -1;
        }
        if (!this.ao && eeVar.ao) {
            return 1;
        }
        if (this.aa && !eeVar.aa) {
            return -1;
        }
        if (this.aa || !eeVar.aa) {
            return super.ao(eeVar, -1615680024);
        }
        return 1;
    }

    int ao(ey eyVar, int i) {
        try {
            return ag((ee) eyVar, (byte) -36);
        } catch (Throwable e) {
            throw ei.ac(e, "ee.ao(" + ')');
        }
    }

    int av(ey eyVar) {
        return ag((ee) eyVar, (byte) -75);
    }

    int ay(ey eyVar) {
        return ag((ee) eyVar, (byte) -94);
    }

    public int ah(Object obj) {
        return ag((ee) obj, (byte) -107);
    }

    public int ai(Object obj) {
        return ag((ee) obj, (byte) -109);
    }

    public int am(Object obj) {
        return ag((ee) obj, (byte) -82);
    }

    public int aw(Object obj) {
        return ag((ee) obj, (byte) -89);
    }

    public int compareTo(Object obj) {
        try {
            return ag((ee) obj, (byte) -5);
        } catch (Throwable e) {
            throw ei.ac(e, "ee.compareTo(" + ')');
        }
    }

    public static em ap(ju juVar, String str, String str2, int i) {
        try {
            int au = juVar.au(str, -1199920171);
            return aw.aq(juVar, au, juVar.av(au, str2, (byte) -70), 1206476650);
        } catch (Throwable e) {
            throw ei.ac(e, "ee.ap(" + ')');
        }
    }

    static final String am(int i, int i2) {
        if (i >= 100000) {
            return i < 10000000 ? "<col=ffffff>" + (i / 1000) + ix.gd + "</col>" : "<col=00ff80>" + (i / 1000000) + ix.gu + "</col>";
        } else {
            try {
                return "<col=ffff00>" + i + "</col>";
            } catch (Throwable e) {
                throw ei.ac(e, "ee.am(" + ')');
            }
        }
    }
}
