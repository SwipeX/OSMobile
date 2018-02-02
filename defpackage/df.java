package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class df {
    static final int dp = 3261415;
    String aa;
    boolean ae = false;
    int ah = 1870545777;
    int ai = 0;
    int ak = 1385085365;
    int am = 0;
    String ao;
    int ap = -2047479523;
    int aq = 1262990613;
    LinkedList as;
    bt at = null;
    int aw = -907787915;

    public void ap(he heVar, int i, int i2) {
        boolean z = true;
        int i3 = 0;
        try {
            this.aq = -1262990613 * i;
            this.ao = heVar.bh(-1828733639);
            this.aa = heVar.bh(-345084165);
            this.at = new bt(heVar.ad((byte) -79));
            this.ak = heVar.ad((byte) -100) * -1385085365;
            heVar.au(-310118664);
            if (heVar.au(-310118664) != 1) {
                z = false;
            }
            this.ae = z;
            this.ap = heVar.au(-310118664) * 2047479523;
            int au = heVar.au(-310118664);
            this.as = new LinkedList();
            while (i3 < au) {
                this.as.add(at(heVar, 450892233));
                i3++;
            }
            ae(-2124556772);
        } catch (Throwable e) {
            throw ei.ac(e, "df.ap(" + ')');
        }
    }

    public void bh(he heVar, int i) {
        boolean z = true;
        int i2 = 0;
        this.aq = -1262990613 * i;
        this.ao = heVar.bh(-2112069219);
        this.aa = heVar.bh(-1385502263);
        this.at = new bt(heVar.ad((byte) -85));
        this.ak = heVar.ad((byte) -70) * -1385085365;
        heVar.au(-310118664);
        if (heVar.au(-310118664) != 1) {
            z = false;
        }
        this.ae = z;
        this.ap = heVar.au(-310118664) * 2047479523;
        int au = heVar.au(-310118664);
        this.as = new LinkedList();
        while (i2 < au) {
            this.as.add(at(heVar, 1143983365));
            i2++;
        }
        ae(-2057653505);
    }

    public static final void ac(es esVar, byte b) {
        while (true) {
            try {
                cv cvVar = (cv) cs.ao.ao();
                if (cvVar != null) {
                    cvVar.ac(esVar, -1866844901);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "df.ac(" + ')');
            }
        }
    }

    dp at(he heVar, int i) {
        try {
            dp dlVar;
            switch (((dr) bp.aj(dr.aj((byte) -70), heVar.au(-310118664), -678613592)).ao * 1386530575) {
                case 0:
                    dlVar = new dl();
                    break;
                case 1:
                    dlVar = new du();
                    break;
                case 2:
                    dlVar = new dz();
                    break;
                case 3:
                    dlVar = new do();
                    break;
                default:
                    throw new IllegalStateException("");
            }
            dlVar.aa(heVar, (byte) 36);
            return dlVar;
        } catch (Throwable e) {
            throw ei.ac(e, "df.at(" + ')');
        }
    }

    dp bb(he heVar) {
        dp dlVar;
        switch (((dr) bp.aj(dr.aj((byte) 62), heVar.au(-310118664), -63087135)).ao * 1386530575) {
            case 0:
                dlVar = new dl();
                break;
            case 1:
                dlVar = new du();
                break;
            case 2:
                dlVar = new dz();
                break;
            case 3:
                dlVar = new do();
                break;
            default:
                throw new IllegalStateException("");
        }
        dlVar.aa(heVar, (byte) -26);
        return dlVar;
    }

    dp br(he heVar) {
        dp dlVar;
        switch (((dr) bp.aj(dr.aj((byte) -47), heVar.au(-310118664), 1145212855)).ao * 1386530575) {
            case 0:
                dlVar = new dl();
                break;
            case 1:
                dlVar = new du();
                break;
            case 2:
                dlVar = new dz();
                break;
            case 3:
                dlVar = new do();
                break;
            default:
                throw new IllegalStateException("");
        }
        dlVar.aa(heVar, (byte) 32);
        return dlVar;
    }

    dp bt(he heVar) {
        dp dlVar;
        switch (((dr) bp.aj(dr.aj((byte) -21), heVar.au(-310118664), 1914025999)).ao * 1386530575) {
            case 0:
                dlVar = new dl();
                break;
            case 1:
                dlVar = new du();
                break;
            case 2:
                dlVar = new dz();
                break;
            case 3:
                dlVar = new do();
                break;
            default:
                throw new IllegalStateException("");
        }
        dlVar.aa(heVar, (byte) 38);
        return dlVar;
    }

    public boolean ah(int i, int i2, int i3, int i4) {
        try {
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                if (((dp) it.next()).ac(i, i2, i3, 276383449)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ah(" + ')');
        }
    }

    public boolean bu(int i, int i2, int i3) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            if (((dp) it.next()).ac(i, i2, i3, 276383449)) {
                return true;
            }
        }
        return false;
    }

    public boolean ai(int i, int i2, short s) {
        try {
            int i3 = i / 64;
            int i4 = i2 / 64;
            if (i3 < this.ah * -760749457 || i3 > this.ai * -2083498737) {
                return false;
            }
            if (i4 < this.aw * -413648605 || i4 > 825832033 * this.am) {
                return false;
            }
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                if (((dp) it.next()).an(i, i2, (short) 256)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ai(" + ')');
        }
    }

    public boolean bd(int i, int i2) {
        int i3 = i / -250670354;
        int i4 = i2 / 64;
        if (i3 < this.ah * -760749457 || i3 > this.ai * 1268608850) {
            return false;
        }
        if (i4 < this.aw * -1315806243 || i4 > 825832033 * this.am) {
            return false;
        }
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            if (((dp) it.next()).an(i, i2, (short) 256)) {
                return true;
            }
        }
        return false;
    }

    public int[] aw(int i, int i2, int i3, int i4) {
        try {
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                dp dpVar = (dp) it.next();
                if (dpVar.ac(i, i2, i3, 276383449)) {
                    return dpVar.aq(i, i2, i3, 1756993046);
                }
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "df.aw(" + ')');
        }
    }

    public int[] bi(int i, int i2, int i3) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.ac(i, i2, i3, 276383449)) {
                return dpVar.aq(i, i2, i3, 1756993046);
            }
        }
        return null;
    }

    public int[] bx(int i, int i2, int i3) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.ac(i, i2, i3, 276383449)) {
                return dpVar.aq(i, i2, i3, 1756993046);
            }
        }
        return null;
    }

    public int[] by(int i, int i2, int i3) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.ac(i, i2, i3, 276383449)) {
                return dpVar.aq(i, i2, i3, 1756993046);
            }
        }
        return null;
    }

    public bt am(int i, int i2, int i3) {
        try {
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                dp dpVar = (dp) it.next();
                if (dpVar.an(i, i2, (short) 256)) {
                    return dpVar.ao(i, i2, (byte) -103);
                }
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "df.am(" + ')');
        }
    }

    public bt bo(int i, int i2) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.an(i, i2, (short) 256)) {
                return dpVar.ao(i, i2, (byte) -77);
            }
        }
        return null;
    }

    public bt bs(int i, int i2) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.an(i, i2, (short) 256)) {
                return dpVar.ao(i, i2, (byte) -21);
            }
        }
        return null;
    }

    public bt bz(int i, int i2) {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            dp dpVar = (dp) it.next();
            if (dpVar.an(i, i2, (short) 256)) {
                return dpVar.ao(i, i2, (byte) -67);
            }
        }
        return null;
    }

    void ae(int i) {
        try {
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                ((dp) it.next()).aj(this, -64921165);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "df.ae(" + ')');
        }
    }

    void bj() {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            ((dp) it.next()).aj(this, -64921165);
        }
    }

    void bq() {
        Iterator it = this.as.iterator();
        while (it.hasNext()) {
            ((dp) it.next()).aj(this, -64921165);
        }
    }

    public int as(int i) {
        try {
            return this.aq * 1832062403;
        } catch (Throwable e) {
            throw ei.ac(e, "df.as(" + ')');
        }
    }

    public int ba() {
        return this.aq * 1832062403;
    }

    public int be() {
        return this.aq * -1434387825;
    }

    public int bn() {
        return this.aq * 1832062403;
    }

    public int bv() {
        return this.aq * 1832062403;
    }

    public int bw() {
        return this.aq * 1832062403;
    }

    public boolean al(int i) {
        try {
            return this.ae;
        } catch (Throwable e) {
            throw ei.ac(e, "df.al(" + ')');
        }
    }

    public boolean bc() {
        return this.ae;
    }

    public boolean bg() {
        return this.ae;
    }

    public String az(int i) {
        try {
            return this.ao;
        } catch (Throwable e) {
            throw ei.ac(e, "df.az(" + ')');
        }
    }

    public String bf() {
        return this.ao;
    }

    public String bk() {
        return this.ao;
    }

    public String bl() {
        return this.ao;
    }

    public String ax(int i) {
        try {
            return this.aa;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ax(" + ')');
        }
    }

    public String cb() {
        return this.aa;
    }

    public String cl() {
        return this.aa;
    }

    public String co() {
        return this.aa;
    }

    public String cy() {
        return this.aa;
    }

    int af(int i) {
        try {
            return this.ak * 797365091;
        } catch (Throwable e) {
            throw ei.ac(e, "df.af(" + ')');
        }
    }

    int cc() {
        return this.ak * 608367698;
    }

    public int au(int i) {
        try {
            return -1588222261 * this.ap;
        } catch (Throwable e) {
            throw ei.ac(e, "df.au(" + ')');
        }
    }

    public int ca() {
        return -1588222261 * this.ap;
    }

    public int cf() {
        return -1588222261 * this.ap;
    }

    public int av(int i) {
        try {
            return this.ah * -760749457;
        } catch (Throwable e) {
            throw ei.ac(e, "df.av(" + ')');
        }
    }

    public int cp() {
        return this.ah * -760749457;
    }

    public int cr() {
        return this.ah * -760749457;
    }

    public int ay(byte b) {
        try {
            return -2083498737 * this.ai;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ay(" + ')');
        }
    }

    public int cm() {
        return -2083498737 * this.ai;
    }

    public int ct() {
        return -2083498737 * this.ai;
    }

    public int ag(byte b) {
        try {
            return -413648605 * this.aw;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ag(" + ')');
        }
    }

    public int ce() {
        return -413648605 * this.aw;
    }

    public int ch() {
        return -413648605 * this.aw;
    }

    public int ck() {
        return -413648605 * this.aw;
    }

    public int ar(int i) {
        try {
            return 825832033 * this.am;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ar(" + ')');
        }
    }

    public int ci() {
        return 1591695054 * this.am;
    }

    public int cq() {
        return 825832033 * this.am;
    }

    public int ad(int i) {
        try {
            return this.at.ac * -486841375;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ad(" + ')');
        }
    }

    public int cg() {
        return this.at.ac * -486841375;
    }

    public int cu() {
        return this.at.ac * -486841375;
    }

    public int cv() {
        return this.at.ac * -486841375;
    }

    public int ab(int i) {
        try {
            return -201339469 * this.at.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ab(" + ')');
        }
    }

    public int cd() {
        return -201339469 * this.at.aj;
    }

    public int cs() {
        return -201339469 * this.at.aj;
    }

    public int cx() {
        return -201339469 * this.at.aj;
    }

    public int bp(int i) {
        try {
            return -1974196523 * this.at.an;
        } catch (Throwable e) {
            throw ei.ac(e, "df.bp(" + ')');
        }
    }

    public int cw() {
        return -1974196523 * this.at.an;
    }

    public bt bm(int i) {
        try {
            return new bt(this.at);
        } catch (Throwable e) {
            throw ei.ac(e, "df.bm(" + ')');
        }
    }

    public bt cn() {
        return new bt(this.at);
    }

    static final boolean ac(int i, int i2, ej ejVar, eh ehVar, int i3) {
        int i4 = i - 64;
        int i5 = i2 - 64;
        try {
            ep.an[64][64] = 99;
            ep.aq[64][64] = 0;
            int i6 = 0;
            ep.ap[0] = i;
            int i7 = 1;
            ep.at[0] = i2;
            int[][] iArr = ehVar.bs;
            while (i7 != i6) {
                int i8 = ep.ap[i6];
                int i9 = ep.at[i6];
                int i10 = (i6 + 1) & 4095;
                int i11 = i8 - i4;
                int i12 = i9 - i5;
                int i13 = i8 - (-787596811 * ehVar.bd);
                int i14 = i9 - (1195916859 * ehVar.by);
                if (ejVar.aj(1, i8, i9, ehVar, 1974409182)) {
                    am.ao = -618860053 * i8;
                    jv.aa = -1688344321 * i9;
                    return true;
                }
                int i15 = ep.aq[i11][i12] + 1;
                if (i11 > 0 && ep.an[i11 - 1][i12] == 0 && (iArr[i13 - 1][i14] & 19136776) == 0) {
                    ep.ap[i7] = i8 - 1;
                    ep.at[i7] = i9;
                    i6 = (i7 + 1) & 4095;
                    ep.an[i11 - 1][i12] = 2;
                    ep.aq[i11 - 1][i12] = i15;
                } else {
                    i6 = i7;
                }
                if (i11 < 127 && ep.an[i11 + 1][i12] == 0 && (iArr[i13 + 1][i14] & 19136896) == 0) {
                    ep.ap[i6] = i8 + 1;
                    ep.at[i6] = i9;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11 + 1][i12] = 8;
                    ep.aq[i11 + 1][i12] = i15;
                }
                if (i12 > 0 && ep.an[i11][i12 - 1] == 0 && (iArr[i13][i14 - 1] & 19136770) == 0) {
                    ep.ap[i6] = i8;
                    ep.at[i6] = i9 - 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11][i12 - 1] = 1;
                    ep.aq[i11][i12 - 1] = i15;
                }
                if (i12 < 127 && ep.an[i11][i12 + 1] == 0 && (iArr[i13][i14 + 1] & 19136800) == 0) {
                    ep.ap[i6] = i8;
                    ep.at[i6] = i9 + 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11][i12 + 1] = 4;
                    ep.aq[i11][i12 + 1] = i15;
                }
                if (i11 > 0 && i12 > 0 && ep.an[i11 - 1][i12 - 1] == 0 && (iArr[i13 - 1][i14 - 1] & 19136782) == 0 && (iArr[i13 - 1][i14] & 19136776) == 0 && (iArr[i13][i14 - 1] & 19136770) == 0) {
                    ep.ap[i6] = i8 - 1;
                    ep.at[i6] = i9 - 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11 - 1][i12 - 1] = 3;
                    ep.aq[i11 - 1][i12 - 1] = i15;
                }
                if (i11 < 127 && i12 > 0 && ep.an[i11 + 1][i12 - 1] == 0 && (iArr[i13 + 1][i14 - 1] & 19136899) == 0 && (iArr[i13 + 1][i14] & 19136896) == 0 && (iArr[i13][i14 - 1] & 19136770) == 0) {
                    ep.ap[i6] = i8 + 1;
                    ep.at[i6] = i9 - 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11 + 1][i12 - 1] = 9;
                    ep.aq[i11 + 1][i12 - 1] = i15;
                }
                if (i11 > 0 && i12 < 127 && ep.an[i11 - 1][i12 + 1] == 0 && (iArr[i13 - 1][i14 + 1] & 19136824) == 0 && (iArr[i13 - 1][i14] & 19136776) == 0 && (iArr[i13][i14 + 1] & 19136800) == 0) {
                    ep.ap[i6] = i8 - 1;
                    ep.at[i6] = i9 + 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11 - 1][i12 + 1] = 6;
                    ep.aq[i11 - 1][i12 + 1] = i15;
                }
                if (i11 < 127 && i12 < 127 && ep.an[i11 + 1][i12 + 1] == 0 && (iArr[i13 + 1][i14 + 1] & 19136992) == 0 && (iArr[i13 + 1][i14] & 19136896) == 0 && (iArr[i13][i14 + 1] & 19136800) == 0) {
                    ep.ap[i6] = i8 + 1;
                    ep.at[i6] = i9 + 1;
                    i6 = (i6 + 1) & 4095;
                    ep.an[i11 + 1][i12 + 1] = 12;
                    ep.aq[i11 + 1][i12 + 1] = i15;
                }
                i7 = i6;
                i2 = i9;
                i = i8;
                i6 = i10;
            }
            am.ao = -618860053 * i;
            jv.aa = -1688344321 * i2;
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "df.ac(" + ')');
        }
    }

    static void az(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        int i7 = -i4;
        int i8 = i;
        int i9 = i2;
        while (i7 < 0) {
            int i10;
            int i11 = (i3 + i9) - 3;
            while (i9 < i11) {
                int i12 = i9 + 1;
                i10 = i8 + 1;
                try {
                    iArr[i9] = iArr2[i8];
                    i9 = i12 + 1;
                    i8 = i10 + 1;
                    iArr[i12] = iArr2[i10];
                    i12 = i9 + 1;
                    i10 = i8 + 1;
                    iArr[i9] = iArr2[i8];
                    i9 = i12 + 1;
                    i8 = i10 + 1;
                    iArr[i12] = iArr2[i10];
                } catch (Throwable e) {
                    throw ei.ac(e, "df.az(" + ')');
                }
            }
            i10 = i11 + 3;
            i11 = i8;
            while (i9 < i10) {
                i8 = i9 + 1;
                i12 = i11 + 1;
                iArr[i9] = iArr2[i11];
                i9 = i8;
                i11 = i12;
            }
            i8 = i11 + i6;
            i7++;
            i9 += i5;
        }
    }

    static void ar(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = -i4;
        int i10 = i2;
        int i11 = i;
        while (i9 < 0) {
            int i12 = i7;
            while (i12 < 0) {
                byte b2;
                int i13 = i11 + 1;
                try {
                    b2 = bArr[i11];
                    if (b2 != (byte) 0) {
                        i11 = i10 + 1;
                        iArr[i10] = iArr2[b2 & 255];
                        i10 = i11;
                    } else {
                        i10++;
                    }
                    int i14 = i13 + 1;
                    byte b3 = bArr[i13];
                    if (b3 != (byte) 0) {
                        i11 = i10 + 1;
                        iArr[i10] = iArr2[b3 & 255];
                        i10 = i11;
                    } else {
                        i10++;
                    }
                    int i15 = i14 + 1;
                    b3 = bArr[i14];
                    if (b3 != (byte) 0) {
                        i11 = i10 + 1;
                        iArr[i10] = iArr2[b3 & 255];
                        i10 = i11;
                    } else {
                        i10++;
                    }
                    i13 = i15 + 1;
                    b2 = bArr[i15];
                    if (b2 != (byte) 0) {
                        i11 = i10 + 1;
                        iArr[i10] = iArr2[b2 & 255];
                    } else {
                        i11 = i10 + 1;
                    }
                    i12++;
                    i10 = i11;
                    i11 = i13;
                } catch (Throwable e) {
                    throw ei.ac(e, "df.ar(" + ')');
                }
            }
            i12 = i10;
            i10 = i8;
            while (i10 < 0) {
                i13 = i11 + 1;
                b2 = bArr[i11];
                if (b2 != (byte) 0) {
                    i11 = i12 + 1;
                    iArr[i12] = iArr2[b2 & 255];
                } else {
                    i11 = i12 + 1;
                }
                i10++;
                i12 = i11;
                i11 = i13;
            }
            i10 = i12 + i5;
            i9++;
            i11 += i6;
        }
    }

    static final void bj(int i) {
        try {
            int i2 = (1755934080 * ff.md) + 64;
            int i3 = (ch.mo * 1385156224) + 64;
            int cv = fb.cv(i2, i3, -2005147175 * lw.hn, 1431851187) - (ep.mz * 1168969983);
            if (cz.fz * 1130591639 < i2) {
                cz.fz += ((((i2 - (cz.fz * 1130591639)) * (it.mn * -984627651)) / 1000) + (cx.mj * -1352860609)) * -1546757593;
                if (cz.fz * 1130591639 > i2) {
                    cz.fz = -1546757593 * i2;
                }
            }
            if (cz.fz * 1130591639 > i2) {
                cz.fz -= ((((it.mn * -984627651) * ((cz.fz * 1130591639) - i2)) / 1000) + (cx.mj * -1352860609)) * -1546757593;
                if (cz.fz * 1130591639 < i2) {
                    cz.fz = i2 * -1546757593;
                }
            }
            if (le.fo * 1712599549 < cv) {
                le.fo += ((cx.mj * -1352860609) + (((it.mn * -984627651) * (cv - (le.fo * 1712599549))) / 1000)) * 932066133;
                if (le.fo * 1712599549 > cv) {
                    le.fo = 932066133 * cv;
                }
            }
            if (le.fo * 1712599549 > cv) {
                le.fo -= 932066133 * ((cx.mj * -1352860609) + (((it.mn * -984627651) * ((le.fo * 1712599549) - cv)) / 1000));
                if (le.fo * 1712599549 < cv) {
                    le.fo = 932066133 * cv;
                }
            }
            if (ac.fk * -749631659 < i3) {
                ac.fk += ((cx.mj * -1352860609) + (((it.mn * -984627651) * (i3 - (ac.fk * -749631659))) / 1000)) * -227131907;
                if (ac.fk * -749631659 > i3) {
                    ac.fk = -227131907 * i3;
                }
            }
            if (ac.fk * -749631659 > i3) {
                ac.fk -= -227131907 * ((cx.mj * -1352860609) + (((it.mn * -984627651) * ((ac.fk * -749631659) - i3)) / 1000));
                if (ac.fk * -749631659 < i3) {
                    ac.fk = -227131907 * i3;
                }
            }
            i2 = (187768192 * ci.mr) + 64;
            i3 = (dh.mg * -1133865344) + 64;
            int i4 = i2 - (cz.fz * 1130591639);
            i3 -= ac.fk * -749631659;
            i2 = ((int) (Math.atan2((double) ((fb.cv(i2, i3, lw.hn * -2005147175, 1467729377) - (863303943 * dg.ms)) - (le.fo * 1712599549)), (double) ((int) Math.sqrt((double) ((i3 * i3) + (i4 * i4))))) * 325.949d)) & 2047;
            cv = ((int) (Math.atan2((double) i4, (double) i3) * -325.949d)) & 2047;
            if (i2 < cj.ak) {
                i2 = cj.ak;
            }
            if (i2 > 383) {
                i2 = 383;
            }
            if (934655837 * cz.ft < i2) {
                cz.ft += ((1028403027 * av.mx) + (((i2 - (934655837 * cz.ft)) * (ds.ml * -1772553449)) / 1000)) * 215045365;
                if (cz.ft * 934655837 > i2) {
                    cz.ft = 215045365 * i2;
                }
            }
            if (934655837 * cz.ft > i2) {
                cz.ft -= ((1028403027 * av.mx) + (((-1772553449 * ds.ml) * ((cz.ft * 934655837) - i2)) / 1000)) * 215045365;
                if (cz.ft * 934655837 < i2) {
                    cz.ft = i2 * 215045365;
                }
            }
            i2 = cv - (1224751421 * ew.ff);
            if (i2 > 1024) {
                i2 -= 2048;
            }
            if (i2 < -1024) {
                i3 = i2 + bq.ai;
            } else {
                i3 = i2;
            }
            if (i3 > 0) {
                ew.ff += ((((ds.ml * -1772553449) * i3) / 1000) + (1028403027 * av.mx)) * 1303471637;
                ew.ff = 1303471637 * ((1224751421 * ew.ff) & 2047);
            }
            if (i3 < 0) {
                ew.ff -= ((av.mx * 1028403027) + (((-1772553449 * ds.ml) * (-i3)) / 1000)) * 1303471637;
                ew.ff = 1303471637 * ((ew.ff * 1224751421) & 2047);
            }
            i2 = cv - (ew.ff * 1224751421);
            if (i2 > 1024) {
                i2 -= 2048;
            }
            if (i2 < -1024) {
                i2 += bq.ai;
            }
            if ((i2 < 0 && i3 > 0) || (i2 > 0 && i3 < 0)) {
                ew.ff = 1303471637 * cv;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "df.bj(" + ')');
        }
    }
}
