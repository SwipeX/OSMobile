package defpackage;

import java.util.LinkedList;

public abstract class db {
    int aa;
    int ac;
    byte[][][] ah;
    eq[][][][] ai;
    int aj;
    short[][][] ak;
    int an;
    int ao;
    short[][][] ap;
    int aq;
    byte[][][] at;

    db() {
        try {
            LinkedList linkedList = new LinkedList();
        } catch (Throwable e) {
            throw ei.ac(e, "db.<init>(" + ')');
        }
    }

    void aj(int i, int i2, he heVar, byte b) {
        try {
            int au = heVar.au(-310118664);
            if (au != 0) {
                if ((au & 1) != 0) {
                    ac(i, i2, heVar, au, -1977451876);
                } else {
                    an(i, i2, heVar, au, (byte) 49);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "db.aj(" + ')');
        }
    }

    void ak(int i, int i2, he heVar) {
        int au = heVar.au(-310118664);
        if (au != 0) {
            if ((au & 1) != 0) {
                ac(i, i2, heVar, au, -1961219189);
            } else {
                an(i, i2, heVar, au, (byte) 11);
            }
        }
    }

    void ac(int i, int i2, he heVar, int i3, int i4) {
        Object obj = null;
        if ((i3 & 2) != 0) {
            obj = 1;
        }
        if (obj != null) {
            try {
                this.ap[0][i][i2] = (short) heVar.au(-310118664);
            } catch (Throwable e) {
                throw ei.ac(e, "db.ac(" + ')');
            }
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
    }

    void ah(int i, int i2, he heVar, int i3) {
        int i4;
        if ((i3 & 2) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            this.ap[0][i][i2] = (short) heVar.au(-310118664);
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
    }

    void ai(int i, int i2, he heVar, int i3) {
        if (((i3 & 2) != 0 ? 1 : 0) != 0) {
            this.ap[0][i][i2] = (short) heVar.au(-310118664);
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
    }

    void ap(int i, int i2, he heVar, int i3) {
        if (((i3 & 2) != 0 ? 1 : 0) != 0) {
            this.ap[0][i][i2] = (short) heVar.au(-310118664);
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
    }

    void at(int i, int i2, he heVar, int i3) {
        int i4;
        if ((i3 & 2) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            this.ap[0][i][i2] = (short) heVar.au(-310118664);
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
    }

    void am(int i, int i2, he heVar, int i3) {
        int au;
        int i4 = 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        int i6 = (i3 & 2) != 0 ? 1 : 0;
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
        if (i6 != 0) {
            au = heVar.au(-310118664);
            for (i6 = 0; i6 < au; i6++) {
                int au2 = heVar.au(-310118664);
                if (au2 != 0) {
                    this.ap[i6][i][i2] = (short) au2;
                    au2 = heVar.au(-310118664);
                    this.at[i6][i][i2] = (byte) (au2 >> 2);
                    this.ah[i6][i][i2] = (byte) (au2 & 3);
                }
            }
        }
        if (i4 != 0) {
            for (i4 = 0; i4 < i5; i4++) {
                au = heVar.au(-310118664);
                if (au != 0) {
                    eq[] eqVarArr = new eq[au];
                    this.ai[i4][i][i2] = eqVarArr;
                    for (i6 = 0; i6 < au; i6++) {
                        int by = heVar.by((byte) -86);
                        int au3 = heVar.au(-310118664);
                        eqVarArr[i6] = new eq(by, au3 >> 2, au3 & 3);
                    }
                }
            }
        }
    }

    void an(int i, int i2, he heVar, int i3, byte b) {
        Object obj;
        Object obj2 = 1;
        int i4 = ((i3 & 24) >> 3) + 1;
        if ((i3 & 2) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((i3 & 4) == 0) {
            obj2 = null;
        }
        try {
            int au;
            int i5;
            this.ak[0][i][i2] = (short) heVar.au(-310118664);
            if (obj != null) {
                au = heVar.au(-310118664);
                for (i5 = 0; i5 < au; i5++) {
                    int au2 = heVar.au(-310118664);
                    if (au2 != 0) {
                        this.ap[i5][i][i2] = (short) au2;
                        au2 = heVar.au(-310118664);
                        this.at[i5][i][i2] = (byte) (au2 >> 2);
                        this.ah[i5][i][i2] = (byte) (au2 & 3);
                    }
                }
            }
            if (obj2 != null) {
                for (i5 = 0; i5 < i4; i5++) {
                    au = heVar.au(-310118664);
                    if (au != 0) {
                        eq[] eqVarArr = new eq[au];
                        this.ai[i5][i][i2] = eqVarArr;
                        for (int i6 = 0; i6 < au; i6++) {
                            int by = heVar.by((byte) -22);
                            int au3 = heVar.au(-310118664);
                            eqVarArr[i6] = new eq(by, au3 >> 2, au3 & 3);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "db.an(" + ')');
        }
    }

    void aw(int i, int i2, he heVar, int i3) {
        int au;
        int i4 = 1;
        int i5 = ((i3 & 24) >> 3) + 1;
        int i6 = (i3 & 2) != 0 ? 1 : 0;
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        this.ak[0][i][i2] = (short) heVar.au(-310118664);
        if (i6 != 0) {
            au = heVar.au(-310118664);
            for (i6 = 0; i6 < au; i6++) {
                int au2 = heVar.au(-310118664);
                if (au2 != 0) {
                    this.ap[i6][i][i2] = (short) au2;
                    au2 = heVar.au(-310118664);
                    this.at[i6][i][i2] = (byte) (au2 >> 2);
                    this.ah[i6][i][i2] = (byte) (au2 & 3);
                }
            }
        }
        if (i4 != 0) {
            for (i6 = 0; i6 < i5; i6++) {
                au = heVar.au(-310118664);
                if (au != 0) {
                    eq[] eqVarArr = new eq[au];
                    this.ai[i6][i][i2] = eqVarArr;
                    for (i4 = 0; i4 < au; i4++) {
                        int by = heVar.by((byte) -38);
                        int au3 = heVar.au(-310118664);
                        eqVarArr[i4] = new eq(by, au3 >> 2, au3 & 3);
                    }
                }
            }
        }
    }

    int ae(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= 64) {
            return -1;
        }
        if (i2 >= 64) {
            return -1;
        }
        return this.ak[0][i][i2] - 1;
    }

    int aq(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i >= 64 || i2 >= 64) {
            return -1;
        }
        try {
            return this.ak[0][i][i2] - 1;
        } catch (Throwable e) {
            throw ei.ac(e, "db.aq(" + ')');
        }
    }

    int al() {
        return 498070187 * this.an;
    }

    int ao(int i) {
        try {
            return 498070187 * this.an;
        } catch (Throwable e) {
            throw ei.ac(e, "db.ao(" + ')');
        }
    }

    int as() {
        return 498070187 * this.an;
    }

    int az() {
        return 498070187 * this.an;
    }

    int aa(byte b) {
        try {
            return this.aq * 2081891153;
        } catch (Throwable e) {
            throw ei.ac(e, "db.aa(" + ')');
        }
    }

    int af() {
        return this.aq * 2081891153;
    }

    int ag() {
        return this.aq * 1031634637;
    }

    int au() {
        return this.aq * 2081891153;
    }

    int av() {
        return this.aq * 2081891153;
    }

    int ax() {
        return this.aq * 2081891153;
    }

    int ay() {
        return this.aq * -1674586458;
    }
}
