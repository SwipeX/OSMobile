package defpackage;

public class ct extends ci {
    static byte[] ac = new byte[1];
    static ct aj = new ct();
    static ct an = new ct();
    static byte[] aq = new byte[1];
    static int bc;
    static int bf;
    static final int[] bg = bl.ax;
    static int bk;
    static final int[] bn = bl.az;
    static int bt = 0;
    public static boolean bw = true;
    int[] aa;
    int[][] ab;
    int[][] ad;
    int[] ae;
    short[] af;
    int[] ag;
    int[] ah;
    int[] ai;
    int[] ak;
    byte[] al;
    int[] am;
    int ao = 0;
    int[] ap;
    int[] ar;
    int[] as;
    int at = 0;
    byte au = (byte) 0;
    int av = 0;
    int[] aw;
    byte[] ax;
    int[] ay;
    byte[] az;
    public int ba;
    boolean bb;
    boolean bd;
    public int be;
    public boolean bh = false;
    int bi;
    public int bj;
    int[] bm;
    int bo;
    int[] bp;
    public int bq;
    int br;
    int bs;
    int bu;
    public int bv;
    int bx;
    int by;
    public int bz;

    ct() {
        int i = bt;
        bt = i + 1;
        this.br = i;
        this.bb = true;
        this.bu = -1;
        this.bd = false;
        this.ba = -1;
        this.bv = -1;
        this.be = -1;
    }

    public ct(ct[] ctVarArr, int i) {
        int i2;
        int i3 = bt;
        bt = i3 + 1;
        this.br = i3;
        this.bb = true;
        this.bu = -1;
        this.bd = false;
        this.ba = -1;
        this.bv = -1;
        this.be = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        this.ao = 0;
        this.at = 0;
        this.av = 0;
        this.au = (byte) -1;
        int i7 = 0;
        Object obj = null;
        while (i7 < i) {
            Object obj2;
            ct ctVar = ctVarArr[i7];
            if (ctVar != null) {
                this.ao += ctVar.ao;
                this.at += ctVar.at;
                this.av += ctVar.av;
                if (ctVar.al != null) {
                    obj = 1;
                } else {
                    if (this.au == (byte) -1) {
                        this.au = ctVar.au;
                    }
                    if (this.au != ctVar.au) {
                        obj = 1;
                    }
                }
                if (ctVar.az != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i4 |= i2;
                if (ctVar.af != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i5 |= i2;
                i2 = (ctVar.ax != null ? 1 : 0) | i6;
                i6 = i4;
                int i8 = i5;
                obj2 = obj;
                i3 = i2;
                i2 = i8;
            } else {
                i2 = i5;
                obj2 = obj;
                i3 = i6;
                i6 = i4;
            }
            i7++;
            i4 = i6;
            i6 = i3;
            obj = obj2;
            i5 = i2;
        }
        this.aa = new int[this.ao];
        this.ak = new int[this.ao];
        this.ap = new int[this.ao];
        this.ah = new int[this.at];
        this.ai = new int[this.at];
        this.aw = new int[this.at];
        this.am = new int[this.at];
        this.ae = new int[this.at];
        this.as = new int[this.at];
        if (obj != null) {
            this.al = new byte[this.at];
        }
        if (i4 != 0) {
            this.az = new byte[this.at];
        }
        if (i5 != 0) {
            this.af = new short[this.at];
        }
        if (i6 != 0) {
            this.ax = new byte[this.at];
        }
        if (this.av > 0) {
            this.ay = new int[this.av];
            this.ag = new int[this.av];
            this.ar = new int[this.av];
        }
        this.ao = 0;
        this.at = 0;
        this.av = 0;
        for (i7 = 0; i7 < i; i7++) {
            ctVar = ctVarArr[i7];
            if (ctVar != null) {
                i2 = 0;
                while (i2 < ctVar.at) {
                    this.ah[this.at] = ctVar.ah[i2] + this.ao;
                    this.ai[this.at] = ctVar.ai[i2] + this.ao;
                    this.aw[this.at] = ctVar.aw[i2] + this.ao;
                    this.am[this.at] = ctVar.am[i2];
                    this.ae[this.at] = ctVar.ae[i2];
                    this.as[this.at] = ctVar.as[i2];
                    if (obj != null) {
                        if (ctVar.al != null) {
                            this.al[this.at] = ctVar.al[i2];
                        } else {
                            this.al[this.at] = ctVar.au;
                        }
                    }
                    if (!(i4 == 0 || ctVar.az == null)) {
                        this.az[this.at] = ctVar.az[i2];
                    }
                    if (i5 != 0) {
                        if (ctVar.af != null) {
                            this.af[this.at] = ctVar.af[i2];
                        } else {
                            this.af[this.at] = (short) -1;
                        }
                    }
                    if (i6 != 0) {
                        if (ctVar.ax == null || ctVar.ax[i2] == (byte) -1) {
                            this.ax[this.at] = (byte) -1;
                        } else {
                            this.ax[this.at] = (byte) (ctVar.ax[i2] + this.av);
                        }
                    }
                    this.at++;
                    i2++;
                }
                for (i2 = 0; i2 < ctVar.av; i2++) {
                    this.ay[this.av] = ctVar.ay[i2] + this.ao;
                    this.ag[this.av] = ctVar.ag[i2] + this.ao;
                    this.ar[this.av] = ctVar.ar[i2] + this.ao;
                    this.av++;
                }
                for (i2 = 0; i2 < ctVar.ao; i2++) {
                    this.aa[this.ao] = ctVar.aa[i2];
                    this.ak[this.ao] = ctVar.ak[i2];
                    this.ap[this.ao] = ctVar.ap[i2];
                    this.ao++;
                }
            }
        }
    }

    public ct af(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        aa();
        int i5 = i - this.bi;
        int i6 = this.bi + i;
        int i7 = i3 - this.bi;
        int i8 = this.bi + i3;
        if (i5 < 0 || ((-720369539 + i6) >> 7) >= iArr.length || i7 < 0 || ((i8 + cj.ak) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 1535707316) >> 7;
        i7 >>= 7;
        i8 = (i8 + 543811184) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        ct ctVar;
        if (z) {
            ctVar = new ct();
            ctVar.ao = this.ao;
            ctVar.at = this.at;
            ctVar.av = this.av;
            ctVar.aa = this.aa;
            ctVar.ap = this.ap;
            ctVar.ah = this.ah;
            ctVar.ai = this.ai;
            ctVar.aw = this.aw;
            ctVar.am = this.am;
            ctVar.ae = this.ae;
            ctVar.as = this.as;
            ctVar.al = this.al;
            ctVar.az = this.az;
            ctVar.ax = this.ax;
            ctVar.af = this.af;
            ctVar.au = this.au;
            ctVar.ay = this.ay;
            ctVar.ag = this.ag;
            ctVar.ar = this.ar;
            ctVar.ad = this.ad;
            ctVar.ab = this.ab;
            ctVar.bp = this.bp;
            ctVar.bm = this.bm;
            ctVar.bh = this.bh;
            ctVar.ak = new int[ctVar.ao];
        } else {
            ctVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = this.aa[i5] + i;
                i8 = this.ap[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (-1891721913 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                ctVar.ak[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.ak[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = ((-this.ak[i5]) << 16) / (this.bl * -952160377);
                if (i7 < i4) {
                    i8 = this.aa[i5] + i;
                    i9 = this.ap[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    ctVar.ak[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.ak[i5];
                }
            }
        }
        ctVar.at();
        return ctVar;
    }

    public ct aj(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        aa();
        int i5 = i - this.bi;
        int i6 = this.bi + i;
        int i7 = i3 - this.bi;
        int i8 = this.bi + i3;
        if (i5 < 0 || ((i6 + cj.ak) >> 7) >= iArr.length || i7 < 0 || ((i8 + cj.ak) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        ct ctVar;
        if (z) {
            ctVar = new ct();
            ctVar.ao = this.ao;
            ctVar.at = this.at;
            ctVar.av = this.av;
            ctVar.aa = this.aa;
            ctVar.ap = this.ap;
            ctVar.ah = this.ah;
            ctVar.ai = this.ai;
            ctVar.aw = this.aw;
            ctVar.am = this.am;
            ctVar.ae = this.ae;
            ctVar.as = this.as;
            ctVar.al = this.al;
            ctVar.az = this.az;
            ctVar.ax = this.ax;
            ctVar.af = this.af;
            ctVar.au = this.au;
            ctVar.ay = this.ay;
            ctVar.ag = this.ag;
            ctVar.ar = this.ar;
            ctVar.ad = this.ad;
            ctVar.ab = this.ab;
            ctVar.bp = this.bp;
            ctVar.bm = this.bm;
            ctVar.bh = this.bh;
            ctVar.ak = new int[ctVar.ao];
        } else {
            ctVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = this.aa[i5] + i;
                i8 = this.ap[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                ctVar.ak[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.ak[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = ((-this.ak[i5]) << 16) / (this.bl * -2098630381);
                if (i7 < i4) {
                    i8 = this.aa[i5] + i;
                    i9 = this.ap[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    ctVar.ak[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.ak[i5];
                }
            }
        }
        ctVar.at();
        return ctVar;
    }

    public ct au(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        aa();
        int i5 = i - this.bi;
        int i6 = this.bi + i;
        int i7 = i3 - this.bi;
        int i8 = this.bi + i3;
        if (i5 < 0 || ((i6 + cj.ak) >> 7) >= iArr.length || i7 < 0 || ((i8 + cj.ak) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        ct ctVar;
        if (z) {
            ctVar = new ct();
            ctVar.ao = this.ao;
            ctVar.at = this.at;
            ctVar.av = this.av;
            ctVar.aa = this.aa;
            ctVar.ap = this.ap;
            ctVar.ah = this.ah;
            ctVar.ai = this.ai;
            ctVar.aw = this.aw;
            ctVar.am = this.am;
            ctVar.ae = this.ae;
            ctVar.as = this.as;
            ctVar.al = this.al;
            ctVar.az = this.az;
            ctVar.ax = this.ax;
            ctVar.af = this.af;
            ctVar.au = this.au;
            ctVar.ay = this.ay;
            ctVar.ag = this.ag;
            ctVar.ar = this.ar;
            ctVar.ad = this.ad;
            ctVar.ab = this.ab;
            ctVar.bp = this.bp;
            ctVar.bm = this.bm;
            ctVar.bh = this.bh;
            ctVar.ak = new int[ctVar.ao];
        } else {
            ctVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = this.aa[i5] + i;
                i8 = this.ap[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                ctVar.ak[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.ak[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < ctVar.ao; i5++) {
                i7 = ((-this.ak[i5]) << 16) / (this.bl * -2098630381);
                if (i7 < i4) {
                    i8 = this.aa[i5] + i;
                    i9 = this.ap[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    ctVar.ak[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.ak[i5];
                }
            }
        }
        ctVar.at();
        return ctVar;
    }

    public ct ac(boolean z) {
        if (!z && ac.length < this.at) {
            ac = new byte[(this.at + 100)];
        }
        return aq(z, aj, ac);
    }

    public ct ag(boolean z) {
        if (!z && aq.length < this.at) {
            aq = new byte[(this.at + 100)];
        }
        return aq(z, an, aq);
    }

    public ct an(boolean z) {
        if (!z && aq.length < this.at) {
            aq = new byte[(this.at + 100)];
        }
        return aq(z, an, aq);
    }

    public ct av(boolean z) {
        if (!z && aq.length < this.at) {
            aq = new byte[(this.at + 100)];
        }
        return aq(z, an, aq);
    }

    public ct ay(boolean z) {
        if (!z && aq.length < this.at) {
            aq = new byte[(this.at + 100)];
        }
        return aq(z, an, aq);
    }

    ct ab(boolean z, ct ctVar, byte[] bArr) {
        int i;
        int i2 = 0;
        ctVar.ao = this.ao;
        ctVar.at = this.at;
        ctVar.av = this.av;
        if (ctVar.aa == null || ctVar.aa.length < this.ao) {
            ctVar.aa = new int[(this.ao + 846483827)];
            ctVar.ak = new int[(this.ao + 100)];
            ctVar.ap = new int[(this.ao + 100)];
        }
        for (i = 0; i < this.ao; i++) {
            ctVar.aa[i] = this.aa[i];
            ctVar.ak[i] = this.ak[i];
            ctVar.ap[i] = this.ap[i];
        }
        if (z) {
            ctVar.az = this.az;
        } else {
            ctVar.az = bArr;
            if (this.az == null) {
                for (i = 0; i < this.at; i++) {
                    ctVar.az[i] = (byte) 0;
                }
            } else {
                while (i2 < this.at) {
                    ctVar.az[i2] = this.az[i2];
                    i2++;
                }
            }
        }
        ctVar.ah = this.ah;
        ctVar.ai = this.ai;
        ctVar.aw = this.aw;
        ctVar.am = this.am;
        ctVar.ae = this.ae;
        ctVar.as = this.as;
        ctVar.al = this.al;
        ctVar.ax = this.ax;
        ctVar.af = this.af;
        ctVar.au = this.au;
        ctVar.ay = this.ay;
        ctVar.ag = this.ag;
        ctVar.ar = this.ar;
        ctVar.ad = this.ad;
        ctVar.ab = this.ab;
        ctVar.bp = this.bp;
        ctVar.bm = this.bm;
        ctVar.bh = this.bh;
        i = bt;
        bt = i + 1;
        ctVar.br = i;
        ctVar.bd = true;
        ctVar.at();
        return ctVar;
    }

    ct ad(boolean z, ct ctVar, byte[] bArr) {
        int i;
        int i2 = 0;
        ctVar.ao = this.ao;
        ctVar.at = this.at;
        ctVar.av = this.av;
        if (ctVar.aa == null || ctVar.aa.length < this.ao) {
            ctVar.aa = new int[(this.ao - 692361219)];
            ctVar.ak = new int[(this.ao - 796044659)];
            ctVar.ap = new int[(this.ao + 100)];
        }
        for (i = 0; i < this.ao; i++) {
            ctVar.aa[i] = this.aa[i];
            ctVar.ak[i] = this.ak[i];
            ctVar.ap[i] = this.ap[i];
        }
        if (z) {
            ctVar.az = this.az;
        } else {
            ctVar.az = bArr;
            if (this.az == null) {
                for (i = 0; i < this.at; i++) {
                    ctVar.az[i] = (byte) 0;
                }
            } else {
                while (i2 < this.at) {
                    ctVar.az[i2] = this.az[i2];
                    i2++;
                }
            }
        }
        ctVar.ah = this.ah;
        ctVar.ai = this.ai;
        ctVar.aw = this.aw;
        ctVar.am = this.am;
        ctVar.ae = this.ae;
        ctVar.as = this.as;
        ctVar.al = this.al;
        ctVar.ax = this.ax;
        ctVar.af = this.af;
        ctVar.au = this.au;
        ctVar.ay = this.ay;
        ctVar.ag = this.ag;
        ctVar.ar = this.ar;
        ctVar.ad = this.ad;
        ctVar.ab = this.ab;
        ctVar.bp = this.bp;
        ctVar.bm = this.bm;
        ctVar.bh = this.bh;
        i = bt;
        bt = i + 1;
        ctVar.br = i;
        ctVar.bd = true;
        ctVar.at();
        return ctVar;
    }

    ct aq(boolean z, ct ctVar, byte[] bArr) {
        int i;
        int i2 = 0;
        ctVar.ao = this.ao;
        ctVar.at = this.at;
        ctVar.av = this.av;
        if (ctVar.aa == null || ctVar.aa.length < this.ao) {
            ctVar.aa = new int[(this.ao + 100)];
            ctVar.ak = new int[(this.ao + 100)];
            ctVar.ap = new int[(this.ao + 100)];
        }
        for (i = 0; i < this.ao; i++) {
            ctVar.aa[i] = this.aa[i];
            ctVar.ak[i] = this.ak[i];
            ctVar.ap[i] = this.ap[i];
        }
        if (z) {
            ctVar.az = this.az;
        } else {
            ctVar.az = bArr;
            if (this.az == null) {
                for (i = 0; i < this.at; i++) {
                    ctVar.az[i] = (byte) 0;
                }
            } else {
                while (i2 < this.at) {
                    ctVar.az[i2] = this.az[i2];
                    i2++;
                }
            }
        }
        ctVar.ah = this.ah;
        ctVar.ai = this.ai;
        ctVar.aw = this.aw;
        ctVar.am = this.am;
        ctVar.ae = this.ae;
        ctVar.as = this.as;
        ctVar.al = this.al;
        ctVar.ax = this.ax;
        ctVar.af = this.af;
        ctVar.au = this.au;
        ctVar.ay = this.ay;
        ctVar.ag = this.ag;
        ctVar.ar = this.ar;
        ctVar.ad = this.ad;
        ctVar.ab = this.ab;
        ctVar.bp = this.bp;
        ctVar.bm = this.bm;
        ctVar.bh = this.bh;
        i = bt;
        bt = i + 1;
        ctVar.br = i;
        ctVar.bd = true;
        ctVar.at();
        return ctVar;
    }

    void ao(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = bg[i];
            int i4 = bn[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ao) {
                int bj = dt.bj(this.aa[i2], this.ap[i2], i3, i4, -1732790516);
                int i11 = this.ak[i2];
                int i12 = ((this.ap[i2] * i3) - (this.aa[i2] * i4)) >> 16;
                if (bj < i10) {
                    i10 = bj;
                }
                if (bj > i7) {
                    i7 = bj;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bz = (i7 + i10) / 2;
            this.bq = (i6 + i9) / 2;
            this.bj = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bv = ((i6 - i9) + 1) / 2;
            this.be = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.be < 32) {
                this.be = 32;
            }
            if (this.bh) {
                this.ba += 8;
                this.be += 8;
            }
        }
    }

    void bh(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = bg[i];
            int i4 = bn[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ao) {
                int bj = dt.bj(this.aa[i2], this.ap[i2], i3, i4, -1675397250);
                int i11 = this.ak[i2];
                int i12 = ((this.ap[i2] * i3) - (this.aa[i2] * i4)) >> 16;
                if (bj < i10) {
                    i10 = bj;
                }
                if (bj > i7) {
                    i7 = bj;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bz = (i7 + i10) / 2;
            this.bq = (i6 + i9) / 2;
            this.bj = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bv = ((i6 - i9) + 1) / 2;
            this.be = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.be < 32) {
                this.be = 32;
            }
            if (this.bh) {
                this.ba += 8;
                this.be += 8;
            }
        }
    }

    void bm(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = bg[i];
            int i4 = bn[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ao) {
                int bj = dt.bj(this.aa[i2], this.ap[i2], i3, i4, -1808519900);
                int i11 = this.ak[i2];
                int i12 = ((this.ap[i2] * i3) - (this.aa[i2] * i4)) >> 16;
                if (bj < i10) {
                    i10 = bj;
                }
                if (bj > i7) {
                    i7 = bj;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bz = (i7 + i10) / 2;
            this.bq = (i6 + i9) / 2;
            this.bj = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bv = ((i6 - i9) + 1) / 2;
            this.be = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.be < 32) {
                this.be = 32;
            }
            if (this.bh) {
                this.ba += 8;
                this.be += 8;
            }
        }
    }

    void bp(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = bg[i];
            int i4 = bn[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ao) {
                int bj = dt.bj(this.aa[i2], this.ap[i2], i3, i4, -1940881677);
                int i11 = this.ak[i2];
                int i12 = ((this.ap[i2] * i3) - (this.aa[i2] * i4)) >> 16;
                if (bj < i10) {
                    i10 = bj;
                }
                if (bj > i7) {
                    i7 = bj;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bz = (i7 + i10) / 2;
            this.bq = (i6 + i9) / 2;
            this.bj = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bv = ((i6 - i9) + 1) / 2;
            this.be = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.be < 32) {
                this.be = 32;
            }
            if (this.bh) {
                this.ba += 8;
                this.be += 8;
            }
        }
    }

    void bt(int i) {
        int i2 = 0;
        if (this.ba == -1) {
            int i3 = bg[i];
            int i4 = bn[i];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i2 < this.ao) {
                int bj = dt.bj(this.aa[i2], this.ap[i2], i3, i4, -1005609492);
                int i11 = this.ak[i2];
                int i12 = ((this.ap[i2] * i3) - (this.aa[i2] * i4)) >> 16;
                if (bj < i10) {
                    i10 = bj;
                }
                if (bj > i7) {
                    i7 = bj;
                }
                if (i11 < i9) {
                    i9 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (i12 < i8) {
                    i8 = i12;
                }
                if (i12 > i5) {
                    i5 = i12;
                }
                i2++;
            }
            this.bz = (i7 + i10) / 2;
            this.bq = (i6 + i9) / 2;
            this.bj = (i5 + i8) / 2;
            this.ba = ((i7 - i10) + 1) / 2;
            this.bv = ((i6 - i9) + 1) / 2;
            this.be = ((i5 - i8) + 1) / 2;
            if (this.ba < 32) {
                this.ba = 32;
            }
            if (this.be < 32) {
                this.be = 32;
            }
            if (this.bh) {
                this.ba += 8;
                this.be += 8;
            }
        }
    }

    public void aa() {
        int i = 0;
        if (this.by != 1) {
            this.by = 1;
            this.bl = 0;
            this.bx = 0;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bl * -2098630381) * (this.bl * -2098630381)))) + 0.99d);
            this.bs = this.bo + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bb() {
        int i = 0;
        if (this.by != 1) {
            this.by = 1;
            this.bl = 0;
            this.bx = 0;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bl * -2098630381) * (this.bl * -89775367)))) + 0.99d);
            this.bs = this.bo + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bd() {
        int i = 0;
        if (this.by != 1) {
            this.by = 1;
            this.bl = 0;
            this.bx = 0;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                if ((-i3) > this.bl * 457645264) {
                    this.bl = (-i3) * -1308172103;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bl * 1278155922) * (this.bl * -2098630381)))) + 0.99d);
            this.bs = this.bo + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void br() {
        int i = 0;
        if (this.by != 1) {
            this.by = 1;
            this.bl = 0;
            this.bx = 0;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bl * -2098630381) * (this.bl * -2098630381)))) + 0.99d);
            this.bs = this.bo + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bx * this.bx))) + 0.99d));
        }
    }

    public void bu() {
        int i = 0;
        if (this.by != 1) {
            this.by = 1;
            this.bl = 0;
            this.bx = 0;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bx) {
                    this.bx = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bl * -2098630381) * (this.bl * -2098630381)))) + 0.99d);
            this.bs = this.bo + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bx * this.bx))) + 0.99d));
        }
    }

    void ak() {
        int i = 0;
        if (this.by != 2) {
            this.by = 2;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = this.bi;
            this.bs = this.bi + this.bi;
        }
    }

    void bx() {
        int i = 0;
        if (this.by != 2) {
            this.by = 2;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = this.bi;
            this.bs = this.bi + this.bi;
        }
    }

    void by() {
        int i = 0;
        if (this.by != 2) {
            this.by = 2;
            this.bi = 0;
            while (i < this.ao) {
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bo = this.bi;
            this.bs = this.bi + this.bi;
        }
    }

    public int ap() {
        aa();
        return this.bi;
    }

    public int bi() {
        aa();
        return this.bi;
    }

    public int bs() {
        aa();
        return this.bi;
    }

    void at() {
        this.by = 0;
        this.ba = -1;
        this.bb = true;
    }

    void bo() {
        this.by = 0;
        this.ba = -1;
        this.bb = true;
    }

    void bq() {
        this.by = 0;
        this.ba = -1;
        this.bb = true;
    }

    void bz() {
        this.by = 0;
        this.ba = -1;
        this.bb = true;
    }

    public void ah(be beVar, int i) {
        if (this.ad != null) {
            if (i != -1) {
                bv bvVar = beVar.aj[i];
                by byVar = bvVar.ao;
                bc = 0;
                bk = 0;
                bf = 0;
                int i2 = 0;
                while (i2 < bvVar.aa && byVar.an[bvVar.ak[i2]] != 5) {
                    i2++;
                }
                for (int i3 = 0; i3 < bvVar.aa; i3++) {
                    i2 = bvVar.ak[i3];
                    aw(byVar.an[i2], byVar.aq[i2], bvVar.ap[i3], bvVar.at[i3], bvVar.ah[i3]);
                }
                at();
            }
        }
    }

    public void ba(be beVar, int i) {
        if (this.ad != null) {
            if (i != -1) {
                bv bvVar = beVar.aj[i];
                by byVar = bvVar.ao;
                bc = 0;
                bk = 0;
                bf = 0;
                int i2 = 0;
                while (i2 < bvVar.aa && byVar.an[bvVar.ak[i2]] != 5) {
                    i2++;
                }
                for (int i3 = 0; i3 < bvVar.aa; i3++) {
                    i2 = bvVar.ak[i3];
                    aw(byVar.an[i2], byVar.aq[i2], bvVar.ap[i3], bvVar.at[i3], bvVar.ah[i3]);
                }
                at();
            }
        }
    }

    public void bj(be beVar, int i) {
        if (this.ad != null) {
            if (i != -1) {
                bv bvVar = beVar.aj[i];
                by byVar = bvVar.ao;
                bc = 0;
                bk = 0;
                bf = 0;
                int i2 = 0;
                while (i2 < bvVar.aa && byVar.an[bvVar.ak[i2]] != 5) {
                    i2++;
                }
                for (int i3 = 0; i3 < bvVar.aa; i3++) {
                    i2 = bvVar.ak[i3];
                    aw(byVar.an[i2], byVar.aq[i2], bvVar.ap[i3], bvVar.at[i3], bvVar.ah[i3]);
                }
                at();
            }
        }
    }

    public void ai(be beVar, int i, be beVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                ah(beVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bv bvVar = beVar.aj[i];
            bv bvVar2 = beVar2.aj[i2];
            by byVar = bvVar.ao;
            bc = 0;
            bk = 0;
            bf = 0;
            int i6 = 0;
            int i7 = iArr[0];
            int i8 = 1;
            while (i6 < bvVar.aa) {
                i3 = bvVar.ak[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 != i4 || byVar.an[i3] == 0) {
                    aw(byVar.an[i3], byVar.aq[i3], bvVar.ap[i6], bvVar.at[i6], bvVar.ah[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            bc = 0;
            bk = 0;
            bf = 0;
            i6 = 0;
            i7 = iArr[0];
            i8 = 1;
            while (i6 < bvVar2.aa) {
                i3 = bvVar2.ak[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 == i4 || byVar.an[i3] == 0) {
                    aw(byVar.an[i3], byVar.aq[i3], bvVar2.ap[i6], bvVar2.at[i6], bvVar2.ah[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            at();
        }
    }

    public void bv(be beVar, int i, be beVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                ah(beVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bv bvVar = beVar.aj[i];
            bv bvVar2 = beVar2.aj[i2];
            by byVar = bvVar.ao;
            bc = 0;
            bk = 0;
            bf = 0;
            int i6 = 0;
            int i7 = iArr[0];
            int i8 = 1;
            while (i6 < bvVar.aa) {
                i3 = bvVar.ak[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 != i4 || byVar.an[i3] == 0) {
                    aw(byVar.an[i3], byVar.aq[i3], bvVar.ap[i6], bvVar.at[i6], bvVar.ah[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            bc = 0;
            bk = 0;
            bf = 0;
            i6 = 0;
            i7 = iArr[0];
            i8 = 1;
            while (i6 < bvVar2.aa) {
                i3 = bvVar2.ak[i6];
                i4 = i7;
                i5 = i8;
                while (i3 > i4) {
                    i8 = i5 + 1;
                    i4 = iArr[i5];
                    i5 = i8;
                }
                if (i3 == i4 || byVar.an[i3] == 0) {
                    aw(byVar.an[i3], byVar.aq[i3], bvVar2.ap[i6], bvVar2.at[i6], bvVar2.ah[i6]);
                }
                i6++;
                i8 = i5;
                i7 = i4;
            }
            at();
        }
    }

    void aw(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        if (i == 0) {
            i5 = 0;
            bc = 0;
            bk = 0;
            bf = 0;
            for (int i7 : iArr) {
                if (i7 < this.ad.length) {
                    iArr2 = this.ad[i7];
                    for (int i62 : iArr2) {
                        bc += this.aa[i62];
                        bk += this.ak[i62];
                        bf = this.ap[i62] + bf;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bc = (bc / i5) + i2;
                bk = (bk / i5) + i3;
                bf = (bf / i5) + i4;
                return;
            }
            bc = i2;
            bk = i3;
            bf = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.ad.length) {
                    r3 = this.ad[i72];
                    for (int i8 : r3) {
                        r6 = this.aa;
                        r6[i8] = r6[i8] + i2;
                        r6 = this.ak;
                        r6[i8] = r6[i8] + i3;
                        r6 = this.ap;
                        r6[i8] = r6[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.ad.length) {
                    r3 = this.ad[i722];
                    for (int i82 : r3) {
                        int i9;
                        r6 = this.aa;
                        r6[i82] = r6[i82] - bc;
                        r6 = this.ak;
                        r6[i82] = r6[i82] - bk;
                        r6 = this.ap;
                        r6[i82] = r6[i82] - bf;
                        i62 = (i2 & 255) * 8;
                        int i10 = (i3 & 255) * 8;
                        int i11 = (i4 & 255) * 8;
                        if (i11 != 0) {
                            i9 = bn[i11];
                            i11 = bg[i11];
                            int i12 = ((this.ak[i82] * i9) + (this.aa[i82] * i11)) >> 16;
                            this.ak[i82] = ((i11 * this.ak[i82]) - (i9 * this.aa[i82])) >> 16;
                            this.aa[i82] = i12;
                        }
                        if (i62 != 0) {
                            i11 = bn[i62];
                            i62 = bg[i62];
                            i9 = ((this.ak[i82] * i62) - (this.ap[i82] * i11)) >> 16;
                            this.ap[i82] = ((i62 * this.ap[i82]) + (i11 * this.ak[i82])) >> 16;
                            this.ak[i82] = i9;
                        }
                        if (i10 != 0) {
                            i62 = bn[i10];
                            i10 = bg[i10];
                            i11 = ((this.ap[i82] * i62) + (this.aa[i82] * i10)) >> 16;
                            this.ap[i82] = ((i10 * this.ap[i82]) - (i62 * this.aa[i82])) >> 16;
                            this.aa[i82] = i11;
                        }
                        r6 = this.aa;
                        r6[i82] = r6[i82] + bc;
                        r6 = this.ak;
                        r6[i82] = r6[i82] + bk;
                        r6 = this.ap;
                        r6[i82] = r6[i82] + bf;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.ad.length) {
                    r3 = this.ad[i7222];
                    for (int i822 : r3) {
                        r6 = this.aa;
                        r6[i822] = r6[i822] - bc;
                        r6 = this.ak;
                        r6[i822] = r6[i822] - bk;
                        r6 = this.ap;
                        r6[i822] = r6[i822] - bf;
                        this.aa[i822] = (this.aa[i822] * i2) / cj.ak;
                        this.ak[i822] = (this.ak[i822] * i3) / cj.ak;
                        this.ap[i822] = (this.ap[i822] * i4) / cj.ak;
                        r6 = this.aa;
                        r6[i822] = r6[i822] + bc;
                        r6 = this.ak;
                        r6[i822] = r6[i822] + bk;
                        r6 = this.ap;
                        r6[i822] = r6[i822] + bf;
                    }
                }
            }
        } else if (i == 5 && this.ab != null && this.az != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.ab.length) {
                    iArr2 = this.ab[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.az[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 255) {
                            i5 = 255;
                        }
                        this.az[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    void be(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        if (i == 0) {
            bc = 0;
            bk = 0;
            bf = 0;
            i5 = 0;
            for (int i62 : iArr) {
                if (i62 < this.ad.length) {
                    iArr2 = this.ad[i62];
                    i62 = 0;
                    while (i62 < iArr2.length) {
                        i7 = iArr2[i62];
                        bc += this.aa[i7];
                        bk += this.ak[i7];
                        bf = this.ap[i7] + bf;
                        i62++;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bc = (bc / i5) + i2;
                bk = (bk / i5) + i3;
                bf = (bf / i5) + i4;
                return;
            }
            bc = i2;
            bk = i3;
            bf = i4;
        } else if (i == 1) {
            for (int i52 : iArr) {
                if (i52 < this.ad.length) {
                    r3 = this.ad[i52];
                    for (int i8 : r3) {
                        iArr2 = this.aa;
                        iArr2[i8] = iArr2[i8] + i2;
                        iArr2 = this.ak;
                        iArr2[i8] = iArr2[i8] + i3;
                        iArr2 = this.ap;
                        iArr2[i8] = iArr2[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i522 : iArr) {
                if (i522 < this.ad.length) {
                    r3 = this.ad[i522];
                    for (int i82 : r3) {
                        int i9;
                        iArr2 = this.aa;
                        iArr2[i82] = iArr2[i82] - bc;
                        iArr2 = this.ak;
                        iArr2[i82] = iArr2[i82] - bk;
                        iArr2 = this.ap;
                        iArr2[i82] = iArr2[i82] - bf;
                        r6 = (i2 & 255) * 8;
                        int i10 = (i3 & 255) * 8;
                        int i11 = (i4 & 255) * 8;
                        if (i11 != 0) {
                            i9 = bn[i11];
                            i11 = bg[i11];
                            int i12 = ((this.ak[i82] * i9) + (this.aa[i82] * i11)) >> 16;
                            this.ak[i82] = ((i11 * this.ak[i82]) - (i9 * this.aa[i82])) >> 16;
                            this.aa[i82] = i12;
                        }
                        if (r6 != 0) {
                            i11 = bn[r6];
                            r6 = bg[r6];
                            i9 = ((this.ak[i82] * r6) - (this.ap[i82] * i11)) >> 16;
                            this.ap[i82] = ((r6 * this.ap[i82]) + (i11 * this.ak[i82])) >> 16;
                            this.ak[i82] = i9;
                        }
                        if (i10 != 0) {
                            r6 = bn[i10];
                            i10 = bg[i10];
                            i11 = ((this.ap[i82] * r6) + (this.aa[i82] * i10)) >> 16;
                            this.ap[i82] = ((i10 * this.ap[i82]) - (r6 * this.aa[i82])) >> 16;
                            this.aa[i82] = i11;
                        }
                        iArr2 = this.aa;
                        iArr2[i82] = iArr2[i82] + bc;
                        iArr2 = this.ak;
                        iArr2[i82] = iArr2[i82] + bk;
                        iArr2 = this.ap;
                        iArr2[i82] = iArr2[i82] + bf;
                    }
                }
            }
        } else if (i == 3) {
            for (int i5222 : iArr) {
                if (i5222 < this.ad.length) {
                    r3 = this.ad[i5222];
                    for (int i822 : r3) {
                        iArr2 = this.aa;
                        iArr2[i822] = iArr2[i822] - bc;
                        iArr2 = this.ak;
                        iArr2[i822] = iArr2[i822] - bk;
                        iArr2 = this.ap;
                        iArr2[i822] = iArr2[i822] - bf;
                        this.aa[i822] = (this.aa[i822] * i2) / cj.ak;
                        this.ak[i822] = (this.ak[i822] * i3) / cj.ak;
                        this.ap[i822] = (this.ap[i822] * i4) / cj.ak;
                        iArr2 = this.aa;
                        iArr2[i822] = iArr2[i822] + bc;
                        iArr2 = this.ak;
                        iArr2[i822] = iArr2[i822] + bk;
                        iArr2 = this.ap;
                        iArr2[i822] = iArr2[i822] + bf;
                    }
                }
            }
        } else if (i == 5 && this.ab != null && this.az != null) {
            for (int i52222 : iArr) {
                if (i52222 < this.ab.length) {
                    int[] iArr3 = this.ab[i52222];
                    for (int i13 : iArr3) {
                        i62 = (this.az[i13] & 255) + (i2 * 8);
                        if (i62 < 0) {
                            i62 = 0;
                        } else if (i62 > 255) {
                            i62 = 255;
                        }
                        this.az[i13] = (byte) i62;
                    }
                }
            }
        }
    }

    public void am() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ap[i];
            this.ap[i] = -i2;
        }
        at();
    }

    public void bw() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.aa[i];
            this.aa[i] = this.ap[i];
            this.ap[i] = -i2;
        }
        at();
    }

    public void ae() {
        for (int i = 0; i < this.ao; i++) {
            this.aa[i] = -this.aa[i];
            this.ap[i] = -this.ap[i];
        }
        at();
    }

    public void bg() {
        for (int i = 0; i < this.ao; i++) {
            this.aa[i] = -this.aa[i];
            this.ap[i] = -this.ap[i];
        }
        at();
    }

    public void bn() {
        for (int i = 0; i < this.ao; i++) {
            this.aa[i] = -this.aa[i];
            this.ap[i] = -this.ap[i];
        }
        at();
    }

    public void as() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.ap[i];
            this.ap[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        at();
    }

    public void bc() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.ap[i];
            this.ap[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        at();
    }

    public void bf() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.ap[i];
            this.ap[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        at();
    }

    public void bk() {
        for (int i = 0; i < this.ao; i++) {
            int i2 = this.ap[i];
            this.ap[i] = this.aa[i];
            this.aa[i] = -i2;
        }
        at();
    }

    public void al(int i) {
        int i2 = bn[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ao; i4++) {
            int i5 = ((this.ak[i4] * i3) - (this.ap[i4] * i2)) >> 16;
            this.ap[i4] = ((this.ak[i4] * i2) + (this.ap[i4] * i3)) >> 16;
            this.ak[i4] = i5;
        }
        at();
    }

    public void bl(int i) {
        int i2 = bn[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ao; i4++) {
            int i5 = ((this.ak[i4] * i3) - (this.ap[i4] * i2)) >> 16;
            this.ap[i4] = ((this.ak[i4] * i2) + (this.ap[i4] * i3)) >> 16;
            this.ak[i4] = i5;
        }
        at();
    }

    public void cb(int i) {
        int i2 = bn[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ao; i4++) {
            int i5 = ((this.ak[i4] * i3) - (this.ap[i4] * i2)) >> 16;
            this.ap[i4] = ((this.ak[i4] * i2) + (this.ap[i4] * i3)) >> 16;
            this.ak[i4] = i5;
        }
        at();
    }

    public void az(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            int[] iArr = this.aa;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ak;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ap;
            iArr[i4] = iArr[i4] + i3;
        }
        at();
    }

    public void cc(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            int[] iArr = this.aa;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ak;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ap;
            iArr[i4] = iArr[i4] + i3;
        }
        at();
    }

    public void cl(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            int[] iArr = this.aa;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ak;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ap;
            iArr[i4] = iArr[i4] + i3;
        }
        at();
    }

    public void co(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            int[] iArr = this.aa;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ak;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ap;
            iArr[i4] = iArr[i4] + i3;
        }
        at();
    }

    public void cy(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            int[] iArr = this.aa;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ak;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.ap;
            iArr[i4] = iArr[i4] + i3;
        }
        at();
    }

    public void ax(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            this.aa[i4] = (this.aa[i4] * i) / cj.ak;
            this.ak[i4] = (this.ak[i4] * i2) / cj.ak;
            this.ap[i4] = (this.ap[i4] * i3) / cj.ak;
        }
        at();
    }

    public void ca(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            this.aa[i4] = (this.aa[i4] * i) / cj.ak;
            this.ak[i4] = (this.ak[i4] * i2) / cj.ak;
            this.ap[i4] = (this.ap[i4] * i3) / cj.ak;
        }
        at();
    }

    public void cf(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            this.aa[i4] = (this.aa[i4] * i) / cj.ak;
            this.ak[i4] = (this.ak[i4] * i2) / 888168490;
            this.ap[i4] = (this.ap[i4] * i3) / -57125742;
        }
        at();
    }

    public void cp(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            this.aa[i4] = (this.aa[i4] * i) / -1310450575;
            this.ak[i4] = (this.ak[i4] * i2) / cj.ak;
            this.ap[i4] = (this.ap[i4] * i3) / cj.ak;
        }
        at();
    }

    public void cr(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ao; i4++) {
            this.aa[i4] = (this.aa[i4] * i) / cj.ak;
            this.ak[i4] = (this.ak[i4] * i2) / 1580044303;
            this.ap[i4] = (this.ap[i4] * i3) / -142111279;
        }
        at();
    }

    protected final ct ar() {
        return this;
    }

    protected final ct cg() {
        return this;
    }

    protected final ct cs() {
        return this;
    }
}
