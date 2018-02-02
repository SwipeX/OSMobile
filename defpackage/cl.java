package defpackage;

import java.util.Date;

public final class cl extends jt {
    public static final int bm = 34;
    static fl[] fi;
    bw aa;
    int ac;
    int ae;
    int af;
    cl ag;
    bz ah;
    int ai;
    int aj;
    bg ak;
    boolean al;
    int[] am;
    int an;
    bq ao;
    bc ap;
    int aq;
    int as;
    bs at;
    int au;
    int av;
    ch[] aw;
    boolean ax;
    int ay;
    boolean az;

    public static String aj(long j) {
        try {
            hl.an.setTime(new Date(j));
            int i = hl.an.get(7);
            int i2 = hl.an.get(5);
            int i3 = hl.an.get(2);
            int i4 = hl.an.get(1);
            int i5 = hl.an.get(11);
            int i6 = hl.an.get(12);
            int i7 = hl.an.get(13);
            return hl.ac[i - 1] + ", " + (i2 / 10) + (i2 % 10) + "-" + hl.aj[0][i3] + "-" + i4 + " " + (i5 / 10) + (i5 % 10) + ":" + (i6 / 10) + (i6 % 10) + ":" + (i7 / 10) + (i7 % 10) + " GMT";
        } catch (Throwable e) {
            throw ei.ac(e, "cl.aj(" + ')');
        }
    }

    cl(int i, int i2, int i3) {
        try {
            this.aw = new ch[5];
            this.am = new int[5];
            this.ae = 0;
            int i4 = 1945736169 * i;
            this.aj = i4;
            this.aq = i4 * -1948595325;
            this.ac = 1071281563 * i2;
            this.an = 2071424211 * i3;
        } catch (Throwable e) {
            throw ei.ac(e, "cl.<init>(" + ')');
        }
    }

    static final void at(int i) {
        try {
            ix ixVar = (ix) null;
            cw.ac(30, "", ix.ge, -2064666122);
        } catch (Throwable e) {
            throw ei.ac(e, "cl.at(" + ')');
        }
    }

    static int aa(gh ghVar, gh ghVar2, int i, boolean z, byte b) {
        int i2 = 1;
        int i3 = -1;
        if (1 == i) {
            try {
                int i4 = ghVar.am * 794816761;
                i2 = ghVar2.am * 794816761;
                if (!z) {
                    if (i4 == -1) {
                        i4 = 2001;
                    }
                    if (i2 == -1) {
                        i2 = 2001;
                        i3 = i4;
                        return i3 - i2;
                    }
                }
                i3 = i4;
                return i3 - i2;
            } catch (Throwable e) {
                throw ei.ac(e, "cl.aa(" + ')');
            }
        } else if (i == 2) {
            return (ghVar.al * 700245205) - (ghVar2.al * 700245205);
        } else {
            if (3 == i) {
                if (ghVar.as.equals("-")) {
                    if (ghVar2.as.equals("-")) {
                        return 0;
                    }
                    if (!z) {
                        i3 = 1;
                    }
                    return i3;
                } else if (!ghVar2.as.equals("-")) {
                    return ghVar.as.compareTo(ghVar2.as);
                } else {
                    if (!z) {
                        i2 = -1;
                    }
                    return i2;
                }
            } else if (4 == i) {
                if (ghVar.ai(-1611279092)) {
                    if (ghVar2.ai(-1529053571)) {
                        i2 = 0;
                    }
                } else if (ghVar2.ai(-1611336427)) {
                    i2 = -1;
                } else {
                    i2 = 0;
                }
                return i2;
            } else if (5 == i) {
                if (ghVar.at((byte) 115)) {
                    if (ghVar2.at((byte) 56)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.at((byte) 119)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (6 == i) {
                if (ghVar.ah(306520669)) {
                    if (ghVar2.ah(189704599)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.ah(605067414)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (7 != i) {
                return (ghVar.ai * 1057964181) - (1057964181 * ghVar2.ai);
            } else {
                if (ghVar.ap(1695317387)) {
                    if (ghVar2.ap(1378578778)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.ap(1250494977)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
