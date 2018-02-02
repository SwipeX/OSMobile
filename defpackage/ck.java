package defpackage;

import java.util.Arrays;

public class ck implements ca {
    public static final int af = 35;
    static final int aw = 5;
    static byte[][] ez;
    int aa;
    jm ac;
    cp[] aj;
    ju ak;
    int an;
    double ao;
    int aq;

    public ck(ju juVar, ju juVar2, int i, double d, int i2) {
        try {
            this.ac = new jm();
            this.aq = 0;
            this.ao = 1.0d;
            this.aa = 798711936;
            this.ak = juVar2;
            this.an = -1447573199 * i;
            this.aq = -42446847 * this.an;
            this.ao = d;
            this.aa = -899729727 * i2;
            int[] ae = juVar.ae(0, -2021975485);
            int length = ae.length;
            this.aj = new cp[juVar.as(0, 415667447)];
            for (int i3 = 0; i3 < length; i3++) {
                this.aj[ae[i3]] = new cp(new he(juVar.an(0, ae[i3], -1448039390)));
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ck.<init>(" + ')');
        }
    }

    public int bd() {
        cp[] cpVarArr = this.aj;
        int i = 0;
        int i2 = 0;
        for (cp cpVar : cpVarArr) {
            if (!(cpVar == null || cpVar.ak == null)) {
                int length = cpVar.ak.length + i2;
                int[] iArr = cpVar.ak;
                i2 = i;
                for (int aa : iArr) {
                    if (this.ak.aa(aa, 1706340968)) {
                        i2++;
                    }
                }
                i = i2;
                i2 = length;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int bi() {
        cp[] cpVarArr = this.aj;
        int i = 0;
        int i2 = 0;
        for (cp cpVar : cpVarArr) {
            if (!(cpVar == null || cpVar.ak == null)) {
                i2 += cpVar.ak.length;
                int[] iArr = cpVar.ak;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.ak.aa(iArr[i3], 677908424)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int bs() {
        cp[] cpVarArr = this.aj;
        int i = 0;
        int i2 = 0;
        for (cp cpVar : cpVarArr) {
            if (!(cpVar == null || cpVar.ak == null)) {
                i2 += cpVar.ak.length;
                int[] iArr = cpVar.ak;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.ak.aa(iArr[i3], 1064343552)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int bt(int i) {
        try {
            cp[] cpVarArr = this.aj;
            int i2 = 0;
            int i3 = 0;
            for (cp cpVar : cpVarArr) {
                if (!(cpVar == null || cpVar.ak == null)) {
                    i3 += cpVar.ak.length;
                    int[] iArr = cpVar.ak;
                    for (int aa : iArr) {
                        if (this.ak.aa(aa, 2098457277)) {
                            i2++;
                        }
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            return (i2 * 100) / i3;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.bt(" + ')');
        }
    }

    public int bx() {
        cp[] cpVarArr = this.aj;
        int i = 0;
        int i2 = 0;
        for (cp cpVar : cpVarArr) {
            if (!(cpVar == null || cpVar.ak == null)) {
                i2 += cpVar.ak.length;
                int[] iArr = cpVar.ak;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.ak.aa(iArr[i3], 2045516879)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (i * 100) / i2;
    }

    public int by() {
        cp[] cpVarArr = this.aj;
        int i = 0;
        int i2 = 0;
        for (cp cpVar : cpVarArr) {
            if (!(cpVar == null || cpVar.ak == null)) {
                i2 += cpVar.ak.length;
                int[] iArr = cpVar.ak;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4;
                    if (this.ak.aa(iArr[i3], 1774020659)) {
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return (380169803 * i) / i2;
    }

    public void bo(double d) {
        this.ao = d;
        bb(1258567137);
    }

    public void bq(double d) {
        this.ao = d;
        bb(2080059420);
    }

    public void br(double d) {
        try {
            this.ao = d;
            bb(2014618777);
        } catch (Throwable e) {
            throw ei.ac(e, "ck.br(" + ')');
        }
    }

    public void bz(double d) {
        this.ao = d;
        bb(1788063057);
    }

    public cp ah(int i) {
        return this.aj[i];
    }

    public cp aj(int i, int i2) {
        try {
            return this.aj[i];
        } catch (Throwable e) {
            throw ei.ac(e, "ck.aj(" + ')');
        }
    }

    public cp ap(int i) {
        return this.aj[i];
    }

    public cp at(int i) {
        return this.aj[i];
    }

    public int[][] ac(int i) {
        try {
            int[][] iArr = new int[this.aj.length][];
            for (int i2 = 0; i2 < this.aj.length; i2++) {
                cp cpVar = this.aj[i2];
                if (cpVar != null) {
                    if (!cpVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                        return (int[][]) null;
                    }
                    iArr[i2] = Arrays.copyOf(cpVar.as, cpVar.as.length);
                }
            }
            return iArr;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.ac(" + ')');
        }
    }

    public int[][] ai() {
        int[][] iArr = new int[this.aj.length][];
        for (int i = 0; i < this.aj.length; i++) {
            cp cpVar = this.aj[i];
            if (cpVar != null) {
                if (!cpVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                    return (int[][]) null;
                }
                iArr[i] = Arrays.copyOf(cpVar.as, cpVar.as.length);
            }
        }
        return iArr;
    }

    public int[][] am() {
        int[][] iArr = new int[this.aj.length][];
        for (int i = 0; i < this.aj.length; i++) {
            cp cpVar = this.aj[i];
            if (cpVar != null) {
                if (!cpVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                    return (int[][]) null;
                }
                iArr[i] = Arrays.copyOf(cpVar.as, cpVar.as.length);
            }
        }
        return iArr;
    }

    public int[][] aw() {
        int[][] iArr = new int[this.aj.length][];
        for (int i = 0; i < this.aj.length; i++) {
            cp cpVar = this.aj[i];
            if (cpVar != null) {
                if (!cpVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                    return (int[][]) null;
                }
                iArr[i] = Arrays.copyOf(cpVar.as, cpVar.as.length);
            }
        }
        return iArr;
    }

    public int[] ae(int i) {
        jt jtVar = this.aj[i];
        if (jtVar != null) {
            if (jtVar.as != null) {
                this.ac.an(jtVar);
                jtVar.al = true;
                return jtVar.as;
            } else if (jtVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                if (this.aq * -1120428079 == 0) {
                    ((cp) this.ac.aa()).ac();
                } else {
                    this.aq -= -728819407;
                }
                this.ac.an(jtVar);
                jtVar.al = true;
                return jtVar.as;
            }
        }
        return null;
    }

    public int[] an(int i, byte b) {
        try {
            jt jtVar = this.aj[i];
            if (jtVar != null) {
                if (jtVar.as != null) {
                    this.ac.an(jtVar);
                    jtVar.al = true;
                    return jtVar.as;
                } else if (jtVar.aj(this.ao, -1337304767 * this.aa, this.ak)) {
                    if (this.aq * -1120428079 == 0) {
                        ((cp) this.ac.aa()).ac();
                    } else {
                        this.aq -= -728819407;
                    }
                    this.ac.an(jtVar);
                    jtVar.al = true;
                    return jtVar.as;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.an(" + ')');
        }
    }

    public int af(int i) {
        return this.aj[i] != null ? this.aj[i].ao : 0;
    }

    public int al(int i) {
        if (this.aj[i] != null) {
            return this.aj[i].ao;
        }
        return 0;
    }

    public int aq(int i, int i2) {
        try {
            return this.aj[i] != null ? this.aj[i].ao : 0;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.aq(" + ')');
        }
    }

    public int as(int i) {
        return this.aj[i] != null ? this.aj[i].ao : 0;
    }

    public int au(int i) {
        return this.aj[i] != null ? this.aj[i].ao : 0;
    }

    public int ax(int i) {
        if (this.aj[i] != null) {
            return this.aj[i].ao;
        }
        return 0;
    }

    public int az(int i) {
        return this.aj[i] != null ? this.aj[i].ao : 0;
    }

    public boolean ao(int i, int i2) {
        try {
            return this.aj[i].aa;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.ao(" + ')');
        }
    }

    public boolean av(int i) {
        return this.aj[i].aa;
    }

    public boolean ay(int i) {
        return this.aj[i].aa;
    }

    public boolean aa(int i, int i2) {
        try {
            return 64 == this.aa * -1337304767;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.aa(" + ')');
        }
    }

    public boolean ab(int i) {
        return 64 == this.aa * -1337304767;
    }

    public boolean ad(int i) {
        return 64 == this.aa * 42382192;
    }

    public boolean ag(int i) {
        return 64 == this.aa * -496612467;
    }

    public boolean ar(int i) {
        return 64 == this.aa * -2108538906;
    }

    public int ak(int i) {
        try {
            return this.aj.length;
        } catch (Throwable e) {
            throw ei.ac(e, "ck.ak(" + ')');
        }
    }

    public int bh() {
        return this.aj.length;
    }

    public int bm() {
        return this.aj.length;
    }

    public int bp() {
        return this.aj.length;
    }

    public void ba() {
        for (int i = 0; i < this.aj.length; i++) {
            if (this.aj[i] != null) {
                this.aj[i].ac();
            }
        }
        this.ac = new jm();
        this.aq = -42446847 * this.an;
    }

    public void bb(int i) {
        int i2 = 0;
        while (i2 < this.aj.length) {
            try {
                if (this.aj[i2] != null) {
                    this.aj[i2].ac();
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ck.bb(" + ')');
            }
        }
        this.ac = new jm();
        this.aq = -42446847 * this.an;
    }

    public void be() {
        for (int i = 0; i < this.aj.length; i++) {
            if (this.aj[i] != null) {
                this.aj[i].ac();
            }
        }
        this.ac = new jm();
        this.aq = -42446847 * this.an;
    }

    public void bj() {
        for (int i = 0; i < this.aj.length; i++) {
            if (this.aj[i] != null) {
                this.aj[i].ac();
            }
        }
        this.ac = new jm();
        this.aq = 1192238871 * this.an;
    }

    public void bv() {
        for (int i = 0; i < this.aj.length; i++) {
            if (this.aj[i] != null) {
                this.aj[i].ac();
            }
        }
        this.ac = new jm();
        this.aq = -42446847 * this.an;
    }

    public void bc(int i) {
        for (cp cpVar : this.aj) {
            if (!(cpVar == null || cpVar.ai == 0)) {
                cpVar.an(i);
            }
        }
    }

    public void bg(int i) {
        for (cp cpVar : this.aj) {
            if (!(cpVar == null || cpVar.ai == 0)) {
                cpVar.an(i);
            }
        }
    }

    public void bn(int i) {
        for (cp cpVar : this.aj) {
            if (!(cpVar == null || cpVar.ai == 0)) {
                cpVar.an(i);
            }
        }
    }

    public void bu(int i, byte b) {
        int i2 = 0;
        while (i2 < this.aj.length) {
            try {
                cp cpVar = this.aj[i2];
                if (!(cpVar == null || cpVar.ai == 0)) {
                    cpVar.an(i);
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ck.bu(" + ')');
            }
        }
    }

    public void bw(int i) {
        for (cp cpVar : this.aj) {
            if (!(cpVar == null || cpVar.ai == 0)) {
                cpVar.an(i);
            }
        }
    }

    static void aq(int i, boolean z, int i2, boolean z2, byte b) {
        try {
            if (gh.ao != null) {
                br.ao(0, gh.ao.length - 1, i, z, i2, z2, (byte) 32);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ck.aq(" + ')');
        }
    }

    static int ax(int i, fs fsVar, boolean z, int i2) {
        int i3;
        int i4;
        al ac;
        int i5;
        int i6;
        String[] strArr;
        if (i == 3400) {
            try {
                dy.ap -= -803849934;
                i3 = gr.ak[dy.ap * -38307927];
                i4 = gr.ak[(dy.ap * -38307927) + 1];
                ac = ay.ac(i3, 644273322);
                i5 = 's' != ac.aq ? 0 : 0;
                for (i5 = 0; i5 < 19415465 * ac.ak; i5++) {
                    if (ac.ap[i5] == i4) {
                        String[] strArr2 = gr.at;
                        i6 = di.ah + 436804489;
                        di.ah = i6;
                        strArr2[(i6 * 1894369977) - 1] = ac.ah[i5];
                        ac = null;
                        break;
                    }
                }
                if (ac == null) {
                    return 1;
                }
                strArr = gr.at;
                i4 = di.ah + 436804489;
                di.ah = i4;
                strArr[(i4 * 1894369977) - 1] = ac.ao;
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "ck.ax(" + ')');
            }
        } else if (3408 == i) {
            dy.ap -= -1607699868;
            char c = gr.ak[dy.ap * -38307927];
            char c2 = gr.ak[(dy.ap * -38307927) + 1];
            i3 = gr.ak[(dy.ap * -38307927) + 2];
            i6 = gr.ak[(dy.ap * -38307927) + 3];
            ac = ay.ac(i3, 825850168);
            if (c == ac.an && c2 == ac.aq) {
                for (i5 = 0; i5 < 19415465 * ac.ak; i5++) {
                    if (i6 == ac.ap[i5]) {
                        int i7;
                        if (c2 == 's') {
                            String[] strArr3 = gr.at;
                            i7 = di.ah + 436804489;
                            di.ah = i7;
                            strArr3[(i7 * 1894369977) - 1] = ac.ah[i5];
                        } else {
                            int[] iArr = gr.ak;
                            i7 = dy.ap - 401924967;
                            dy.ap = i7;
                            iArr[(i7 * -38307927) - 1] = ac.at[i5];
                        }
                        ac = null;
                        if (ac != null) {
                            return 1;
                        }
                        if ('s' != c2) {
                            strArr = gr.at;
                            i4 = di.ah + 436804489;
                            di.ah = i4;
                            strArr[(i4 * 1894369977) - 1] = ac.ao;
                            return 1;
                        }
                        r2 = gr.ak;
                        i4 = dy.ap - 401924967;
                        dy.ap = i4;
                        r2[(i4 * -38307927) - 1] = ac.aa * -1328241417;
                        return 1;
                    }
                }
                if (ac != null) {
                    return 1;
                }
                if ('s' != c2) {
                    r2 = gr.ak;
                    i4 = dy.ap - 401924967;
                    dy.ap = i4;
                    r2[(i4 * -38307927) - 1] = ac.aa * -1328241417;
                    return 1;
                }
                strArr = gr.at;
                i4 = di.ah + 436804489;
                di.ah = i4;
                strArr[(i4 * 1894369977) - 1] = ac.ao;
                return 1;
            } else if (c2 == 's') {
                String[] strArr4 = gr.at;
                i5 = di.ah + 436804489;
                di.ah = i5;
                strArr4[(i5 * 1894369977) - 1] = "null";
                return 1;
            } else {
                r1 = gr.ak;
                i5 = dy.ap - 401924967;
                dy.ap = i5;
                r1[(i5 * -38307927) - 1] = 0;
                return 1;
            }
        } else if (3411 != i) {
            return 2;
        } else {
            r1 = gr.ak;
            i5 = dy.ap - -401924967;
            dy.ap = i5;
            ac = ay.ac(r1[i5 * -38307927], -1536211306);
            r2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            r2[(i4 * -38307927) - 1] = ac.ao(1644910509);
            return 1;
        }
    }
}
