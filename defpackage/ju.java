package defpackage;

public abstract class ju {
    static hm am = new hm();
    static final int ax = 0;
    static int az = 0;
    int[] aa;
    int[] ac;
    public int ae;
    kl[] ah;
    Object[] ai;
    int aj;
    int[] ak;
    boolean al;
    int[] an;
    int[] ao;
    int[][] ap;
    kl aq;
    boolean as;
    int[][] at;
    Object[][] aw;

    ju(boolean z, boolean z2) {
        try {
            this.as = z;
            this.al = z2;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.<init>(" + ')');
        }
    }

    void aj(byte[] bArr, int i) {
        try {
            this.ae = ld.aj(bArr, 0, bArr.length, (byte) 60) * -2111392141;
            he heVar = new he(fv.bm(bArr, 1240227736));
            int au = heVar.au(-310118664);
            if (au < 5 || au > 7) {
                throw new RuntimeException("");
            }
            int i2;
            int i3;
            int i4;
            if (au >= 6) {
                heVar.ad((byte) -84);
            }
            int au2 = heVar.au(-310118664);
            if (au >= 7) {
                this.aj = heVar.bd(664319643) * 62707139;
            } else {
                this.aj = heVar.ay((byte) 1) * 62707139;
            }
            int i5 = 0;
            this.ac = new int[(this.aj * -1391541525)];
            if (au >= 7) {
                i2 = -1;
                for (i3 = 0; i3 < this.aj * -1391541525; i3++) {
                    i5 += heVar.bd(662168517);
                    this.ac[i3] = i5;
                    if (this.ac[i3] > i2) {
                        i2 = this.ac[i3];
                    }
                }
                i4 = i2;
            } else {
                i2 = -1;
                for (i3 = 0; i3 < this.aj * -1391541525; i3++) {
                    i5 += heVar.ay((byte) 1);
                    this.ac[i3] = i5;
                    if (this.ac[i3] > i2) {
                        i2 = this.ac[i3];
                    }
                }
                i4 = i2;
            }
            this.ao = new int[(i4 + 1)];
            this.aa = new int[(i4 + 1)];
            this.ak = new int[(i4 + 1)];
            this.ap = new int[(i4 + 1)][];
            this.ai = new Object[(i4 + 1)];
            this.aw = new Object[(i4 + 1)][];
            if (au2 != 0) {
                this.an = new int[(i4 + 1)];
                for (i2 = 0; i2 < this.aj * -1391541525; i2++) {
                    this.an[this.ac[i2]] = heVar.ad((byte) -108);
                }
                this.aq = new kl(this.an);
            }
            for (i2 = 0; i2 < this.aj * -1391541525; i2++) {
                this.ao[this.ac[i2]] = heVar.ad((byte) -106);
            }
            for (i2 = 0; i2 < this.aj * -1391541525; i2++) {
                this.aa[this.ac[i2]] = heVar.ad((byte) -47);
            }
            for (i2 = 0; i2 < this.aj * -1391541525; i2++) {
                this.ak[this.ac[i2]] = heVar.ay((byte) 1);
            }
            int i6;
            int i7;
            if (au >= 7) {
                for (au = 0; au < -1391541525 * this.aj; au++) {
                    i6 = this.ac[au];
                    i7 = this.ak[i6];
                    this.ap[i6] = new int[i7];
                    i2 = -1;
                    i3 = 0;
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += heVar.bd(90318836);
                        this.ap[i6][i5] = i3;
                        if (i3 > i2) {
                            i2 = i3;
                        }
                    }
                    this.aw[i6] = new Object[(i2 + 1)];
                }
            } else {
                for (au = 0; au < -1391541525 * this.aj; au++) {
                    i6 = this.ac[au];
                    i7 = this.ak[i6];
                    this.ap[i6] = new int[i7];
                    i2 = -1;
                    i3 = 0;
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += heVar.ay((byte) 1);
                        this.ap[i6][i5] = i3;
                        if (i3 > i2) {
                            i2 = i3;
                        }
                    }
                    this.aw[i6] = new Object[(i2 + 1)];
                }
            }
            if (au2 != 0) {
                this.at = new int[(i4 + 1)][];
                this.ah = new kl[(i4 + 1)];
                for (i3 = 0; i3 < -1391541525 * this.aj; i3++) {
                    i5 = this.ac[i3];
                    au = this.ak[i5];
                    this.at[i5] = new int[this.aw[i5].length];
                    for (i2 = 0; i2 < au; i2++) {
                        this.at[i5][this.ap[i5][i2]] = heVar.ad((byte) -115);
                    }
                    this.ah[i5] = new kl(this.at[i5]);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ju.aj(" + ')');
        }
    }

    void bh(byte[] bArr) {
        this.ae = ld.aj(bArr, 0, bArr.length, (byte) 53) * -2111392141;
        he heVar = new he(fv.bm(bArr, -841867334));
        int au = heVar.au(-310118664);
        if (au < 5 || au > 7) {
            throw new RuntimeException("");
        }
        int i;
        if (au >= 6) {
            heVar.ad((byte) -90);
        }
        int au2 = heVar.au(-310118664);
        if (au >= 7) {
            this.aj = heVar.bd(-11031208) * 62707139;
        } else {
            this.aj = heVar.ay((byte) 1) * 1420891424;
        }
        int i2 = 0;
        int i3 = -1;
        this.ac = new int[(this.aj * -1402534540)];
        if (au >= 7) {
            for (i = 0; i < this.aj * 2107727948; i++) {
                i2 += heVar.bd(-2031639506);
                this.ac[i] = i2;
                if (this.ac[i] > i3) {
                    i3 = this.ac[i];
                }
            }
        } else {
            for (i = 0; i < this.aj * -1391541525; i++) {
                i2 += heVar.ay((byte) 1);
                this.ac[i] = i2;
                if (this.ac[i] > i3) {
                    i3 = this.ac[i];
                }
            }
        }
        this.ao = new int[(i3 + 1)];
        this.aa = new int[(i3 + 1)];
        this.ak = new int[(i3 + 1)];
        this.ap = new int[(i3 + 1)][];
        this.ai = new Object[(i3 + 1)];
        this.aw = new Object[(i3 + 1)][];
        if (au2 != 0) {
            this.an = new int[(i3 + 1)];
            for (i = 0; i < this.aj * 573321779; i++) {
                this.an[this.ac[i]] = heVar.ad((byte) -37);
            }
            this.aq = new kl(this.an);
        }
        for (i = 0; i < this.aj * -1011795662; i++) {
            this.ao[this.ac[i]] = heVar.ad((byte) -88);
        }
        for (i = 0; i < this.aj * -1391541525; i++) {
            this.aa[this.ac[i]] = heVar.ad((byte) -83);
        }
        for (i = 0; i < this.aj * -1391541525; i++) {
            this.ak[this.ac[i]] = heVar.ay((byte) 1);
        }
        int i4;
        int i5;
        int i6;
        if (au >= 7) {
            for (i = 0; i < -389404820 * this.aj; i++) {
                i4 = this.ac[i];
                i5 = this.ak[i4];
                this.ap[i4] = new int[i5];
                i2 = -1;
                au = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    au += heVar.bd(-330971397);
                    this.ap[i4][i6] = au;
                    if (au > i2) {
                        i2 = au;
                    }
                }
                this.aw[i4] = new Object[(i2 + 1)];
            }
        } else {
            for (i = 0; i < 797417680 * this.aj; i++) {
                i4 = this.ac[i];
                i5 = this.ak[i4];
                this.ap[i4] = new int[i5];
                i2 = -1;
                au = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    au += heVar.ay((byte) 1);
                    this.ap[i4][i6] = au;
                    if (au > i2) {
                        i2 = au;
                    }
                }
                this.aw[i4] = new Object[(i2 + 1)];
            }
        }
        if (au2 != 0) {
            this.at = new int[(i3 + 1)][];
            this.ah = new kl[(i3 + 1)];
            for (i = 0; i < -1391541525 * this.aj; i++) {
                i2 = this.ac[i];
                au = this.ak[i2];
                this.at[i2] = new int[this.aw[i2].length];
                for (i3 = 0; i3 < au; i3++) {
                    this.at[i2][this.ap[i2][i3]] = heVar.ad((byte) -64);
                }
                this.ah[i2] = new kl(this.at[i2]);
            }
        }
    }

    void bt(byte[] bArr) {
        this.ae = ld.aj(bArr, 0, bArr.length, (byte) 110) * -2111392141;
        he heVar = new he(fv.bm(bArr, 1690404255));
        int au = heVar.au(-310118664);
        if (au < 5 || au > 7) {
            throw new RuntimeException("");
        }
        int i;
        if (au >= 6) {
            heVar.ad((byte) -51);
        }
        int au2 = heVar.au(-310118664);
        if (au >= 7) {
            this.aj = heVar.bd(1217944298) * 62707139;
        } else {
            this.aj = heVar.ay((byte) 1) * 62707139;
        }
        int i2 = 0;
        int i3 = -1;
        this.ac = new int[(this.aj * -1391541525)];
        if (au >= 7) {
            for (i = 0; i < this.aj * -1391541525; i++) {
                i2 += heVar.bd(-267970395);
                this.ac[i] = i2;
                if (this.ac[i] > i3) {
                    i3 = this.ac[i];
                }
            }
        } else {
            for (i = 0; i < this.aj * -1391541525; i++) {
                i2 += heVar.ay((byte) 1);
                this.ac[i] = i2;
                if (this.ac[i] > i3) {
                    i3 = this.ac[i];
                }
            }
        }
        this.ao = new int[(i3 + 1)];
        this.aa = new int[(i3 + 1)];
        this.ak = new int[(i3 + 1)];
        this.ap = new int[(i3 + 1)][];
        this.ai = new Object[(i3 + 1)];
        this.aw = new Object[(i3 + 1)][];
        if (au2 != 0) {
            this.an = new int[(i3 + 1)];
            for (i = 0; i < this.aj * -1391541525; i++) {
                this.an[this.ac[i]] = heVar.ad((byte) -2);
            }
            this.aq = new kl(this.an);
        }
        for (i = 0; i < this.aj * -1391541525; i++) {
            this.ao[this.ac[i]] = heVar.ad((byte) -31);
        }
        for (i = 0; i < this.aj * -1391541525; i++) {
            this.aa[this.ac[i]] = heVar.ad((byte) -5);
        }
        for (i = 0; i < this.aj * -1391541525; i++) {
            this.ak[this.ac[i]] = heVar.ay((byte) 1);
        }
        int i4;
        int i5;
        int i6;
        if (au >= 7) {
            for (i = 0; i < -1391541525 * this.aj; i++) {
                i4 = this.ac[i];
                i5 = this.ak[i4];
                this.ap[i4] = new int[i5];
                i2 = -1;
                au = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    au += heVar.bd(-821790196);
                    this.ap[i4][i6] = au;
                    if (au > i2) {
                        i2 = au;
                    }
                }
                this.aw[i4] = new Object[(i2 + 1)];
            }
        } else {
            for (i = 0; i < -1391541525 * this.aj; i++) {
                i4 = this.ac[i];
                i5 = this.ak[i4];
                this.ap[i4] = new int[i5];
                i2 = -1;
                au = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    au += heVar.ay((byte) 1);
                    this.ap[i4][i6] = au;
                    if (au > i2) {
                        i2 = au;
                    }
                }
                this.aw[i4] = new Object[(i2 + 1)];
            }
        }
        if (au2 != 0) {
            this.at = new int[(i3 + 1)][];
            this.ah = new kl[(i3 + 1)];
            for (i = 0; i < -1391541525 * this.aj; i++) {
                i2 = this.ac[i];
                au = this.ak[i2];
                this.at[i2] = new int[this.aw[i2].length];
                for (i3 = 0; i3 < au; i3++) {
                    this.at[i2][this.ap[i2][i3]] = heVar.ad((byte) -74);
                }
                this.ah[i2] = new kl(this.at[i2]);
            }
        }
    }

    void ac(int i, int i2) {
    }

    void bb(int i) {
    }

    void br(int i) {
    }

    public byte[] an(int i, int i2, int i3) {
        try {
            return aq(i, i2, null, (byte) -53);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.an(" + ')');
        }
    }

    public byte[] bd(int i, int i2) {
        return aq(i, i2, null, (byte) 73);
    }

    public byte[] bu(int i, int i2) {
        return aq(i, i2, null, (byte) 24);
    }

    public byte[] bx(int i, int i2) {
        return aq(i, i2, null, (byte) 41);
    }

    public byte[] by(int i, int i2) {
        return aq(i, i2, null, (byte) 65);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] aq(int r4, int r5, int[] r6, byte r7) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 < 0) goto L_0x0017;
    L_0x0003:
        r1 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0050 }
        if (r4 >= r1) goto L_0x0017;
    L_0x0008:
        r1 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0050 }
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        if (r5 < 0) goto L_0x0017;
    L_0x0010:
        r1 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1.length;	 Catch:{ RuntimeException -> 0x0050 }
        if (r5 < r1) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r1 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1[r5];	 Catch:{ RuntimeException -> 0x0050 }
        if (r1 != 0) goto L_0x0036;
    L_0x0020:
        r1 = 2109468410; // 0x7dbbeefa float:3.122581E37 double:1.0422158724E-314;
        r1 = r3.af(r4, r6, r1);	 Catch:{ RuntimeException -> 0x0050 }
        if (r1 != 0) goto L_0x0036;
    L_0x0029:
        r1 = -5;
        r3.am(r4, r1);	 Catch:{ RuntimeException -> 0x0050 }
        r1 = -898880192; // 0xffffffffca6c2d40 float:-3869520.0 double:NaN;
        r1 = r3.af(r4, r6, r1);	 Catch:{ RuntimeException -> 0x0050 }
        if (r1 == 0) goto L_0x0017;
    L_0x0036:
        r0 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r0 = r0[r4];	 Catch:{ RuntimeException -> 0x0050 }
        r0 = r0[r5];	 Catch:{ RuntimeException -> 0x0050 }
        r1 = 0;
        r2 = 1888105043; // 0x708a3253 float:3.4215816E29 double:9.328478375E-315;
        r0 = defpackage.ej.ac(r0, r1, r2);	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r3.al;	 Catch:{ RuntimeException -> 0x0050 }
        if (r1 == 0) goto L_0x0017;
    L_0x0048:
        r1 = r3.aw;	 Catch:{ RuntimeException -> 0x0050 }
        r1 = r1[r4];	 Catch:{ RuntimeException -> 0x0050 }
        r2 = 0;
        r1[r5] = r2;	 Catch:{ RuntimeException -> 0x0050 }
        goto L_0x0017;
    L_0x0050:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "ju.aq(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.aq(int, int, int[], byte):byte[]");
    }

    public byte[] bi(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, iArr, -364978066)) {
            am(i, (byte) -59);
            if (!af(i, iArr, -1612757605)) {
                return null;
            }
        }
        byte[] ac = ej.ac(this.aw[i][i2], false, 2138115869);
        if (this.al) {
            this.aw[i][i2] = null;
        }
        return ac;
    }

    public byte[] bo(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, iArr, 1430759537)) {
            am(i, (byte) -105);
            if (!af(i, iArr, -2105642120)) {
                return null;
            }
        }
        byte[] ac = ej.ac(this.aw[i][i2], false, 1535566245);
        if (this.al) {
            this.aw[i][i2] = null;
        }
        return ac;
    }

    public byte[] bs(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, iArr, -933584232)) {
            am(i, Byte.MIN_VALUE);
            if (!af(i, iArr, -54109501)) {
                return null;
            }
        }
        byte[] ac = ej.ac(this.aw[i][i2], false, 1937939635);
        if (!this.al) {
            return ac;
        }
        this.aw[i][i2] = null;
        return ac;
    }

    public byte[] bz(int i, int i2, int[] iArr) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, iArr, -542569390)) {
            am(i, (byte) -41);
            if (!af(i, iArr, 1124780359)) {
                return null;
            }
        }
        byte[] ac = ej.ac(this.aw[i][i2], false, 2118728597);
        if (this.al) {
            this.aw[i][i2] = null;
        }
        return ac;
    }

    public boolean ao(int i, int i2, int i3) {
        if (i >= 0) {
            try {
                if (i < this.aw.length && this.aw[i] != null && i2 >= 0 && i2 < this.aw[i].length) {
                    if (this.aw[i][i2] != null || this.ai[i] != null) {
                        return true;
                    }
                    am(i, (byte) -76);
                    if (this.ai[i] != null) {
                        return true;
                    }
                    return false;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ju.ao(" + ')');
            }
        }
        return false;
    }

    public boolean bq(int i, int i2) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return false;
        }
        if (this.aw[i][i2] != null || this.ai[i] != null) {
            return true;
        }
        am(i, (byte) -14);
        if (this.ai[i] != null) {
            return true;
        }
        return false;
    }

    public boolean aa(int i, int i2) {
        try {
            if (1 == this.aw.length) {
                return ao(0, i, 2121842069);
            }
            if (this.aw[i].length == 1) {
                return ao(i, 0, -389750221);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ei.ac(e, "ju.aa(" + ')');
        }
    }

    public boolean ba(int i) {
        if (1 == this.aw.length) {
            return ao(0, i, 885495888);
        }
        if (this.aw[i].length == 1) {
            return ao(i, 0, 606553830);
        }
        throw new RuntimeException();
    }

    public boolean bj(int i) {
        if (1 == this.aw.length) {
            return ao(0, i, 141413351);
        }
        if (this.aw[i].length == 1) {
            return ao(i, 0, -724056448);
        }
        throw new RuntimeException();
    }

    public boolean bv(int i) {
        if (1 == this.aw.length) {
            return ao(0, i, 953909816);
        }
        if (this.aw[i].length == 1) {
            return ao(i, 0, 1519302879);
        }
        throw new RuntimeException();
    }

    public boolean ak(int i, int i2) {
        try {
            if (this.ai[i] != null) {
                return true;
            }
            am(i, (byte) -61);
            if (this.ai[i] != null) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ak(" + ')');
        }
    }

    public boolean be(int i) {
        if (this.ai[i] != null) {
            return true;
        }
        am(i, (byte) -61);
        if (this.ai[i] != null) {
            return true;
        }
        return false;
    }

    public boolean bw(int i) {
        if (this.ai[i] != null) {
            return true;
        }
        am(i, (byte) -34);
        if (this.ai[i] == null) {
            return false;
        }
        return true;
    }

    public boolean ap(byte b) {
        boolean z = true;
        int i = 0;
        while (i < this.ac.length) {
            try {
                int i2 = this.ac[i];
                if (this.ai[i2] == null) {
                    am(i2, (byte) -87);
                    if (this.ai[i2] == null) {
                        z = false;
                    }
                }
                i++;
            } catch (Throwable e) {
                throw ei.ac(e, "ju.ap(" + ')');
            }
        }
        return z;
    }

    public boolean bc() {
        boolean z = true;
        for (int i : this.ac) {
            if (this.ai[i] == null) {
                am(i, (byte) -21);
                if (this.ai[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean bg() {
        boolean z = true;
        for (int i : this.ac) {
            if (this.ai[i] == null) {
                am(i, (byte) -15);
                if (this.ai[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean bn() {
        boolean z = true;
        for (int i : this.ac) {
            if (this.ai[i] == null) {
                am(i, (byte) -91);
                if (this.ai[i] == null) {
                    z = false;
                }
            }
        }
        return z;
    }

    int at(int i, byte b) {
        try {
            if (this.ai[i] != null) {
                return 100;
            }
            return 0;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.at(" + ')');
        }
    }

    int bk(int i) {
        return this.ai[i] != null ? -1708859277 : 0;
    }

    public byte[] ah(int i, int i2) {
        try {
            if (1 == this.aw.length) {
                return an(0, i, -1208084078);
            }
            if (this.aw[i].length == 1) {
                return an(i, 0, 452346308);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ah(" + ')');
        }
    }

    public byte[] bf(int i) {
        if (1 == this.aw.length) {
            return an(0, i, -1188639137);
        }
        if (this.aw[i].length == 1) {
            return an(i, 0, -2143359710);
        }
        throw new RuntimeException();
    }

    public byte[] bl(int i) {
        if (1 == this.aw.length) {
            return an(0, i, 134571151);
        }
        if (this.aw[i].length == 1) {
            return an(i, 0, -1161722542);
        }
        throw new RuntimeException();
    }

    public byte[] ai(int i, int i2, int i3) {
        if (i < 0) {
            return null;
        }
        try {
            if (i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
                return null;
            }
            if (this.aw[i][i2] == null && !af(i, null, -619073801)) {
                am(i, (byte) -112);
                if (!af(i, null, -211691529)) {
                    return null;
                }
            }
            return ej.ac(this.aw[i][i2], false, 1640539286);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ai(" + ')');
        }
    }

    public byte[] cb(int i, int i2) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, null, -1843999621)) {
            am(i, (byte) -103);
            if (!af(i, null, 1680288327)) {
                return null;
            }
        }
        return ej.ac(this.aw[i][i2], false, 1947161687);
    }

    public byte[] cy(int i, int i2) {
        if (i < 0 || i >= this.aw.length || this.aw[i] == null || i2 < 0 || i2 >= this.aw[i].length) {
            return null;
        }
        if (this.aw[i][i2] == null && !af(i, null, -1911848795)) {
            am(i, (byte) -101);
            if (!af(i, null, -908127946)) {
                return null;
            }
        }
        return ej.ac(this.aw[i][i2], false, 1980989203);
    }

    public byte[] aw(int i, byte b) {
        try {
            if (this.aw.length == 1) {
                return ai(0, i, 1056469529);
            }
            if (this.aw[i].length == 1) {
                return ai(i, 0, 1294670918);
            }
            throw new RuntimeException();
        } catch (Throwable e) {
            throw ei.ac(e, "ju.aw(" + ')');
        }
    }

    public byte[] cc(int i) {
        if (this.aw.length == 1) {
            return ai(0, i, 1954530014);
        }
        if (this.aw[i].length == 1) {
            return ai(i, 0, -591785906);
        }
        throw new RuntimeException();
    }

    public byte[] cl(int i) {
        if (this.aw.length == 1) {
            return ai(0, i, 918030252);
        }
        if (this.aw[i].length == 1) {
            return ai(i, 0, 2106677121);
        }
        throw new RuntimeException();
    }

    public byte[] co(int i) {
        if (this.aw.length == 1) {
            return ai(0, i, -44064489);
        }
        if (this.aw[i].length == 1) {
            return ai(i, 0, -655067750);
        }
        throw new RuntimeException();
    }

    void am(int i, byte b) {
    }

    void ca(int i) {
    }

    void cf(int i) {
    }

    void cr(int i) {
    }

    public int[] ae(int i, int i2) {
        try {
            return this.ap[i];
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ae(" + ')');
        }
    }

    public int as(int i, int i2) {
        try {
            return this.aw[i].length;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.as(" + ')');
        }
    }

    public int cp(int i) {
        return this.aw[i].length;
    }

    public int ct(int i) {
        return this.aw[i].length;
    }

    public int al(int i) {
        try {
            return this.aw.length;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.al(" + ')');
        }
    }

    public int ck() {
        return this.aw.length;
    }

    public int cm() {
        return this.aw.length;
    }

    public void az(int i, short s) {
        int i2 = 0;
        while (i2 < this.aw[i].length) {
            try {
                this.aw[i][i2] = null;
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ju.az(" + ')');
            }
        }
    }

    public void ce(int i) {
        for (int i2 = 0; i2 < this.aw[i].length; i2++) {
            this.aw[i][i2] = null;
        }
    }

    public void ax(int i) {
        int i2 = 0;
        while (i2 < this.aw.length) {
            try {
                if (this.aw[i2] != null) {
                    for (int i3 = 0; i3 < this.aw[i2].length; i3++) {
                        this.aw[i2][i3] = null;
                    }
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ju.ax(" + ')');
            }
        }
    }

    public void ch() {
        for (int i = 0; i < this.aw.length; i++) {
            if (this.aw[i] != null) {
                for (int i2 = 0; i2 < this.aw[i].length; i2++) {
                    this.aw[i][i2] = null;
                }
            }
        }
    }

    public void ci() {
        for (int i = 0; i < this.aw.length; i++) {
            if (this.aw[i] != null) {
                for (int i2 = 0; i2 < this.aw[i].length; i2++) {
                    this.aw[i][i2] = null;
                }
            }
        }
    }

    public void cq() {
        for (int i = 0; i < this.aw.length; i++) {
            if (this.aw[i] != null) {
                for (int i2 = 0; i2 < this.aw[i].length; i2++) {
                    this.aw[i][i2] = null;
                }
            }
        }
    }

    public void cv() {
        for (int i = 0; i < this.aw.length; i++) {
            if (this.aw[i] != null) {
                for (int i2 = 0; i2 < this.aw[i].length; i2++) {
                    this.aw[i][i2] = null;
                }
            }
        }
    }

    boolean af(int i, int[] iArr, int i2) {
        byte[] ac;
        try {
            if (this.ai[i] == null) {
                return false;
            }
            int i3;
            int i4 = this.ak[i];
            int[] iArr2 = this.ap[i];
            Object[] objArr = this.aw[i];
            Object obj = 1;
            for (i3 = 0; i3 < i4; i3++) {
                if (objArr[iArr2[i3]] == null) {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
            if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
                ac = ej.ac(this.ai[i], false, 2067454925);
            } else {
                byte[] ac2 = ej.ac(this.ai[i], true, 1932731792);
                he heVar = new he(ac2);
                heVar.bz(iArr, 5, heVar.aj.length, 131577842);
                ac = ac2;
            }
            byte[] bm = fv.bm(ac, -2044853854);
            if (this.as) {
                this.ai[i] = null;
            }
            if (i4 > 1) {
                int i5;
                int length = bm.length - 1;
                int i6 = bm[length] & 255;
                int i7 = length - ((i6 * i4) * 4);
                he heVar2 = new he(bm);
                int[] iArr3 = new int[i4];
                heVar2.ac = -984165911 * i7;
                for (i5 = 0; i5 < i6; i5++) {
                    i3 = 0;
                    for (length = 0; length < i4; length++) {
                        i3 += heVar2.ad((byte) -7);
                        iArr3[length] = iArr3[length] + i3;
                    }
                }
                byte[][] bArr = new byte[i4][];
                for (length = 0; length < i4; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                heVar2.ac = -984165911 * i7;
                i5 = 0;
                for (i7 = 0; i7 < i6; i7++) {
                    i3 = 0;
                    for (length = 0; length < i4; length++) {
                        i3 += heVar2.ad((byte) -68);
                        System.arraycopy(bm, i5, bArr[length], iArr3[length], i3);
                        iArr3[length] = iArr3[length] + i3;
                        i5 += i3;
                    }
                }
                for (length = 0; length < i4; length++) {
                    if (this.al) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = lq.aj(bArr[length], false, 421594927);
                    }
                }
            } else if (this.al) {
                objArr[iArr2[0]] = bm;
            } else {
                objArr[iArr2[0]] = lq.aj(bm, false, 474322585);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, (("" + (iArr != null) + "," + i + "," + ac.length + ",") + ld.aj(ac, 0, ac.length, (byte) 15) + ",") + ld.aj(ac, 0, ac.length - 2, (byte) 116) + "," + this.ao[i] + "," + (-1254367557 * this.ae));
        } catch (Throwable e2) {
            throw ei.ac(e2, "ju.af(" + ')');
        }
    }

    boolean cg(int i, int[] iArr) {
        if (this.ai[i] == null) {
            return false;
        }
        int i2;
        int i3 = this.ak[i];
        int[] iArr2 = this.ap[i];
        Object[] objArr = this.aw[i];
        Object obj = 1;
        for (i2 = 0; i2 < i3; i2++) {
            if (objArr[iArr2[i2]] == null) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        byte[] ac;
        if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
            ac = ej.ac(this.ai[i], false, 1960819778);
        } else {
            byte[] ac2 = ej.ac(this.ai[i], true, 1405373370);
            he heVar = new he(ac2);
            heVar.bz(iArr, 5, heVar.aj.length, -825704700);
            ac = ac2;
        }
        try {
            byte[] bm = fv.bm(ac, -208673951);
            if (this.as) {
                this.ai[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bm.length - 1;
                int i5 = bm[length] & 255;
                int i6 = length - ((i5 * i3) * 4);
                he heVar2 = new he(bm);
                int[] iArr3 = new int[i3];
                heVar2.ac = -984165911 * i6;
                for (i4 = 0; i4 < i5; i4++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -102);
                        iArr3[length] = iArr3[length] + i2;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                heVar2.ac = -984165911 * i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -120);
                        System.arraycopy(bm, i4, bArr[length], iArr3[length], i2);
                        iArr3[length] = iArr3[length] + i2;
                        i4 += i2;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.al) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = lq.aj(bArr[length], false, -337666837);
                    }
                }
            } else if (this.al) {
                objArr[iArr2[0]] = bm;
            } else {
                objArr[iArr2[0]] = lq.aj(bm, false, 1376332888);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, (("" + (iArr != null) + "," + i + "," + ac.length + ",") + ld.aj(ac, 0, ac.length, (byte) 116) + ",") + ld.aj(ac, 0, ac.length - 2, (byte) 104) + "," + this.ao[i] + "," + (-1254367557 * this.ae));
        }
    }

    boolean cs(int i, int[] iArr) {
        byte[] ac;
        if (this.ai[i] == null) {
            return false;
        }
        int i2;
        int i3 = this.ak[i];
        int[] iArr2 = this.ap[i];
        Object[] objArr = this.aw[i];
        Object obj = 1;
        for (i2 = 0; i2 < i3; i2++) {
            if (objArr[iArr2[i2]] == null) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
            ac = ej.ac(this.ai[i], false, 1743203867);
        } else {
            byte[] ac2 = ej.ac(this.ai[i], true, 1495807062);
            he heVar = new he(ac2);
            heVar.bz(iArr, 5, heVar.aj.length, -1290865020);
            ac = ac2;
        }
        try {
            byte[] bm = fv.bm(ac, -1338803885);
            if (this.as) {
                this.ai[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bm.length - 1;
                int i5 = bm[length] & -1454788096;
                int i6 = length - ((i5 * i3) * 4);
                he heVar2 = new he(bm);
                int[] iArr3 = new int[i3];
                heVar2.ac = -984165911 * i6;
                for (i4 = 0; i4 < i5; i4++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -93);
                        iArr3[length] = iArr3[length] + i2;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                heVar2.ac = -195329912 * i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -54);
                        System.arraycopy(bm, i4, bArr[length], iArr3[length], i2);
                        iArr3[length] = iArr3[length] + i2;
                        i4 += i2;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.al) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = lq.aj(bArr[length], false, 1529909355);
                    }
                }
            } else if (this.al) {
                objArr[iArr2[0]] = bm;
            } else {
                objArr[iArr2[0]] = lq.aj(bm, false, 899923705);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, (("" + (iArr != null) + "," + i + "," + ac.length + ",") + ld.aj(ac, 0, ac.length, (byte) 20) + ",") + ld.aj(ac, 0, ac.length - 2, (byte) 91) + "," + this.ao[i] + "," + (-549030632 * this.ae));
        }
    }

    boolean cu(int i, int[] iArr) {
        if (this.ai[i] == null) {
            return false;
        }
        int i2;
        int i3 = this.ak[i];
        int[] iArr2 = this.ap[i];
        Object[] objArr = this.aw[i];
        Object obj = 1;
        for (i2 = 0; i2 < i3; i2++) {
            if (objArr[iArr2[i2]] == null) {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        byte[] ac;
        if (iArr == null || (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
            ac = ej.ac(this.ai[i], false, 1658443589);
        } else {
            byte[] ac2 = ej.ac(this.ai[i], true, 1862607715);
            he heVar = new he(ac2);
            heVar.bz(iArr, 5, heVar.aj.length, -1612592621);
            ac = ac2;
        }
        try {
            byte[] bm = fv.bm(ac, 1491001008);
            if (this.as) {
                this.ai[i] = null;
            }
            if (i3 > 1) {
                int i4;
                int length = bm.length - 1;
                int i5 = bm[length] & 428957083;
                int i6 = length - ((i5 * i3) * 4);
                he heVar2 = new he(bm);
                int[] iArr3 = new int[i3];
                heVar2.ac = 922379867 * i6;
                for (i4 = 0; i4 < i5; i4++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -20);
                        iArr3[length] = iArr3[length] + i2;
                    }
                }
                byte[][] bArr = new byte[i3][];
                for (length = 0; length < i3; length++) {
                    bArr[length] = new byte[iArr3[length]];
                    iArr3[length] = 0;
                }
                heVar2.ac = -984165911 * i6;
                i4 = 0;
                for (i6 = 0; i6 < i5; i6++) {
                    i2 = 0;
                    for (length = 0; length < i3; length++) {
                        i2 += heVar2.ad((byte) -54);
                        System.arraycopy(bm, i4, bArr[length], iArr3[length], i2);
                        iArr3[length] = iArr3[length] + i2;
                        i4 += i2;
                    }
                }
                for (length = 0; length < i3; length++) {
                    if (this.al) {
                        objArr[iArr2[length]] = bArr[length];
                    } else {
                        objArr[iArr2[length]] = lq.aj(bArr[length], false, 252348244);
                    }
                }
            } else if (this.al) {
                objArr[iArr2[0]] = bm;
            } else {
                objArr[iArr2[0]] = lq.aj(bm, false, 1699863032);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, (("" + (iArr != null) + "," + i + "," + ac.length + ",") + ld.aj(ac, 0, ac.length, (byte) 100) + ",") + ld.aj(ac, 0, ac.length - 2, (byte) 111) + "," + this.ao[i] + "," + (891230406 * this.ae));
        }
    }

    public int au(String str, int i) {
        try {
            return this.aq.aj(ds.ao(str.toLowerCase(), 871155223));
        } catch (Throwable e) {
            throw ei.ac(e, "ju.au(" + ')');
        }
    }

    public int cx(String str) {
        return this.aq.aj(ds.ao(str.toLowerCase(), -328410340));
    }

    public int av(int i, String str, byte b) {
        try {
            return this.ah[i].aj(ds.ao(str.toLowerCase(), -1586063206));
        } catch (Throwable e) {
            throw ei.ac(e, "ju.av(" + ')');
        }
    }

    public int cd(int i, String str) {
        return this.ah[i].aj(ds.ao(str.toLowerCase(), 1133144868));
    }

    public int cn(int i, String str) {
        return this.ah[i].aj(ds.ao(str.toLowerCase(), -145939050));
    }

    public int cw(int i, String str) {
        return this.ah[i].aj(ds.ao(str.toLowerCase(), -1148385621));
    }

    public int cz(int i, String str) {
        return this.ah[i].aj(ds.ao(str.toLowerCase(), -309756008));
    }

    public boolean ay(String str, String str2, int i) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int aj = this.aq.aj(ds.ao(toLowerCase, 91687998));
            if (aj < 0) {
                return false;
            }
            if (this.ah[aj].aj(ds.ao(toLowerCase2, 668003989)) < 0) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ay(" + ')');
        }
    }

    public boolean cj(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -365905947));
        if (aj >= 0 && this.ah[aj].aj(ds.ao(toLowerCase2, -1053191016)) >= 0) {
            return true;
        }
        return false;
    }

    public boolean da(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, 239681571));
        if (aj >= 0 && this.ah[aj].aj(ds.ao(toLowerCase2, -101140511)) >= 0) {
            return true;
        }
        return false;
    }

    public boolean di(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -1488567225));
        if (aj < 0) {
            return false;
        }
        if (this.ah[aj].aj(ds.ao(toLowerCase2, -380844099)) < 0) {
            return false;
        }
        return true;
    }

    public boolean dw(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, 1241194890));
        if (aj >= 0 && this.ah[aj].aj(ds.ao(toLowerCase2, -1480894166)) >= 0) {
            return true;
        }
        return false;
    }

    public byte[] ag(String str, String str2, int i) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int aj = this.aq.aj(ds.ao(toLowerCase, -1924567012));
            return an(aj, this.ah[aj].aj(ds.ao(toLowerCase2, 339633031)), -485576555);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ag(" + ')');
        }
    }

    public byte[] dq(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, 25958239));
        return an(aj, this.ah[aj].aj(ds.ao(toLowerCase2, -1232601971)), -1505488723);
    }

    public byte[] dv(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -881939967));
        return an(aj, this.ah[aj].aj(ds.ao(toLowerCase2, 711463420)), 437955359);
    }

    public boolean ar(String str, String str2, byte b) {
        try {
            CharSequence toLowerCase = str.toLowerCase();
            CharSequence toLowerCase2 = str2.toLowerCase();
            int aj = this.aq.aj(ds.ao(toLowerCase, -952964939));
            return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, -2027006404)), -677562170);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ar(" + ')');
        }
    }

    public boolean dj(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -1673651515));
        return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, -766390072)), 1336495487);
    }

    public boolean dm(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, 764881028));
        return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, 252559265)), -1080040270);
    }

    public boolean do(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, 752356588));
        return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, -1542751012)), -929152666);
    }

    public boolean dt(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -2003131443));
        return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, -1645507330)), -680061642);
    }

    public boolean dz(String str, String str2) {
        CharSequence toLowerCase = str.toLowerCase();
        CharSequence toLowerCase2 = str2.toLowerCase();
        int aj = this.aq.aj(ds.ao(toLowerCase, -229207578));
        return ao(aj, this.ah[aj].aj(ds.ao(toLowerCase2, 622643854)), -486320167);
    }

    public boolean ad(String str, int i) {
        try {
            return ak(this.aq.aj(ds.ao(str.toLowerCase(), 233525071)), 29994956);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ad(" + ')');
        }
    }

    public boolean dn(String str) {
        return ak(this.aq.aj(ds.ao(str.toLowerCase(), -869907868)), -687903119);
    }

    public boolean du(String str) {
        return ak(this.aq.aj(ds.ao(str.toLowerCase(), 236541789)), 968344812);
    }

    public void ab(String str, int i) {
        try {
            int aj = this.aq.aj(ds.ao(str.toLowerCase(), -847790612));
            if (aj >= 0) {
                ac(aj, -710442945);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ju.ab(" + ')');
        }
    }

    public void df(String str) {
        int aj = this.aq.aj(ds.ao(str.toLowerCase(), 1270713709));
        if (aj >= 0) {
            ac(aj, -1310484833);
        }
    }

    public void dg(String str) {
        int aj = this.aq.aj(ds.ao(str.toLowerCase(), -877401018));
        if (aj >= 0) {
            ac(aj, -569852163);
        }
    }

    public int bp(String str, int i) {
        try {
            return at(this.aq.aj(ds.ao(str.toLowerCase(), 694330175)), (byte) -77);
        } catch (Throwable e) {
            throw ei.ac(e, "ju.bp(" + ')');
        }
    }

    public int dy(String str) {
        return at(this.aq.aj(ds.ao(str.toLowerCase(), 446922639)), (byte) -2);
    }

    static final byte[] dc(byte[] bArr) {
        he heVar = new he(bArr);
        int au = heVar.au(-310118664);
        int ad = heVar.ad((byte) -109);
        if (ad < 0 || (az * 1533164983 != 0 && ad > az * 1533164983)) {
            throw new RuntimeException();
        } else if (au == 0) {
            r0 = new byte[ad];
            heVar.br(r0, 0, ad, 1943992064);
            return r0;
        } else {
            int ad2 = heVar.ad((byte) -92);
            if (ad2 < 0 || (az * 1533164983 != 0 && ad2 > az * 1533164983)) {
                throw new RuntimeException();
            }
            r0 = new byte[ad2];
            if (1 == au) {
                hk.aj(r0, ad2, bArr, ad, 9);
                return r0;
            }
            am.aj(heVar, r0, 1227378317);
            return r0;
        }
    }

    static final byte[] ei(byte[] bArr) {
        he heVar = new he(bArr);
        int au = heVar.au(-310118664);
        int ad = heVar.ad((byte) -21);
        if (ad < 0 || (az * 1533164983 != 0 && ad > az * 1138088744)) {
            throw new RuntimeException();
        } else if (au == 0) {
            r0 = new byte[ad];
            heVar.br(r0, 0, ad, 129895462);
            return r0;
        } else {
            int ad2 = heVar.ad((byte) -1);
            if (ad2 < 0 || (-593514078 * az != 0 && ad2 > az * 1533164983)) {
                throw new RuntimeException();
            }
            r0 = new byte[ad2];
            if (1 == au) {
                hk.aj(r0, ad2, bArr, ad, 9);
                return r0;
            }
            am.aj(heVar, r0, 1196437004);
            return r0;
        }
    }

    static final byte[] eq(byte[] bArr) {
        he heVar = new he(bArr);
        int au = heVar.au(-310118664);
        int ad = heVar.ad((byte) -43);
        if (ad < 0 || (az * 1533164983 != 0 && ad > az * 1533164983)) {
            throw new RuntimeException();
        } else if (au == 0) {
            r0 = new byte[ad];
            heVar.br(r0, 0, ad, 47669078);
            return r0;
        } else {
            int ad2 = heVar.ad((byte) -3);
            if (ad2 < 0 || (az * 1533164983 != 0 && ad2 > az * 1533164983)) {
                throw new RuntimeException();
            }
            r0 = new byte[ad2];
            if (1 == au) {
                hk.aj(r0, ad2, bArr, ad, 9);
                return r0;
            }
            am.aj(heVar, r0, -251041358);
            return r0;
        }
    }

    static final byte[] eu(byte[] bArr) {
        he heVar = new he(bArr);
        int au = heVar.au(-310118664);
        int ad = heVar.ad((byte) -42);
        if (ad < 0 || (az * 1533164983 != 0 && ad > az * 1533164983)) {
            throw new RuntimeException();
        } else if (au == 0) {
            r0 = new byte[ad];
            heVar.br(r0, 0, ad, -1849471088);
            return r0;
        } else {
            int ad2 = heVar.ad((byte) -49);
            if (ad2 < 0 || (az * 1533164983 != 0 && ad2 > az * 1533164983)) {
                throw new RuntimeException();
            }
            r0 = new byte[ad2];
            if (1 == au) {
                hk.aj(r0, ad2, bArr, ad, 9);
                return r0;
            }
            am.aj(heVar, r0, -406272335);
            return r0;
        }
    }
}
