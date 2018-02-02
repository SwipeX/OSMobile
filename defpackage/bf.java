package defpackage;

public class bf extends ci {
    static int[] ba = new int[am.ap];
    static int be = 0;
    static final int[] bn = bl.ax;
    static int[] bv = new int[am.ap];
    static final int[] bw = bl.az;
    int[] aa;
    short[] ab;
    int[] ac;
    short[] ad;
    short[] ae;
    short[] af;
    short[] ag;
    byte[] ah;
    byte[] ai;
    int aj = 0;
    int[] ak;
    int al;
    short[] am;
    int[] an;
    int ao = 0;
    int[] ap;
    int[] aq;
    short[] ar;
    byte as = (byte) 0;
    byte[] at;
    short[] au;
    short[] av;
    byte[] aw;
    short[] ax;
    short[] ay;
    byte[] az;
    cf[] bb;
    co[] bd;
    int[] bh;
    boolean bi = false;
    int bj;
    int[] bm;
    int bo;
    byte[] bp;
    int bq;
    int[][] br;
    int bs;
    int[][] bt;
    co[] bu;
    public short bx;
    public short by;
    int bz;

    bf() {
    }

    public static bf ab(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -2076770584);
        if (an == null) {
            return null;
        }
        return new bf(an);
    }

    public static bf ad(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, 120048835);
        if (an == null) {
            return null;
        }
        return new bf(an);
    }

    public static bf aj(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, 319140751);
        if (an == null) {
            return null;
        }
        return new bf(an);
    }

    public static bf bm(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -619509665);
        if (an == null) {
            return null;
        }
        return new bf(an);
    }

    public static bf bp(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -520217874);
        if (an == null) {
            return null;
        }
        return new bf(an);
    }

    bf(byte[] bArr) {
        if (bArr[bArr.length - 1] == (byte) -1 && bArr[bArr.length - 2] == (byte) -1) {
            ac(bArr);
        } else {
            an(bArr);
        }
    }

    void ac(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 23) * -984165911;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int au7 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int ay7 = heVar.ay((byte) 1);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (au > 0) {
            this.az = new byte[au];
            heVar.ac = 0;
            for (i = 0; i < au; i++) {
                byte[] bArr2 = this.az;
                byte av = heVar.av(-1353644314);
                bArr2[i] = av;
                if (av == (byte) 0) {
                    i6++;
                }
                if (av >= (byte) 1 && av <= (byte) 3) {
                    i7++;
                }
                if (av == (byte) 2) {
                    i8++;
                }
            }
        }
        int i9 = au + ay;
        if (au2 == 1) {
            i = i9 + ay2;
        } else {
            i = i9;
        }
        int i10 = i + ay2;
        if (au3 == 255) {
            i2 = i10 + ay2;
        } else {
            i2 = i10;
        }
        if (au5 == 1) {
            i3 = i2 + ay2;
        } else {
            i3 = i2;
        }
        if (au7 == 1) {
            i4 = i3 + ay;
        } else {
            i4 = i3;
        }
        if (au4 == 1) {
            i5 = i4 + ay2;
        } else {
            i5 = i4;
        }
        int i11 = i5 + ay6;
        if (au6 == 1) {
            ay6 = (ay2 * 2) + i11;
        } else {
            ay6 = i11;
        }
        ay7 += ay6;
        int i12 = (ay2 * 2) + ay7;
        ay3 += i12;
        ay4 += ay3;
        int i13 = ay4 + ay5;
        int i14 = i13 + (i6 * 6);
        int i15 = i14 + (i7 * 6);
        int i16 = i15 + (i7 * 6);
        int i17 = i16 + (i7 * 2);
        int i18 = i17 + i7;
        int i19 = i18 + ((i7 * 2) + (i8 * 2));
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au7 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
        }
        if (au3 == 255) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        if (au6 == 1) {
            this.ae = new short[ay2];
        }
        if (au6 == 1 && au > 0) {
            this.aw = new byte[ay2];
        }
        this.am = new short[ay2];
        if (au > 0) {
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
            if (i7 > 0) {
                this.av = new short[i7];
                this.ay = new short[i7];
                this.ag = new short[i7];
                this.ar = new short[i7];
                this.bp = new byte[i7];
                this.ad = new short[i7];
            }
            if (i8 > 0) {
                this.ab = new short[i8];
            }
        }
        heVar.ac = -984165911 * au;
        heVar.ac = -984165911 * i12;
        heVar.ac = -984165911 * ay3;
        heVar.ac = -984165911 * ay4;
        heVar.ac = -984165911 * i3;
        ay3 = 0;
        ay4 = 0;
        ay5 = 0;
        i3 = 0;
        while (i3 < ay) {
            i12 = heVar.au(-310118664);
            i8 = 0;
            if ((i12 & 1) != 0) {
                i8 = heVar.bb(1314128743);
            }
            i7 = 0;
            if ((i12 & 2) != 0) {
                i7 = heVar.bb(1314128743);
            }
            i6 = 0;
            if ((i12 & 4) != 0) {
                i6 = heVar.bb(1314128743);
            }
            this.ac[i3] = i8 + ay5;
            this.an[i3] = i7 + ay4;
            this.aq[i3] = ay3 + i6;
            ay3 = this.ac[i3];
            i6 = this.an[i3];
            i7 = this.aq[i3];
            if (au7 == 1) {
                this.bm[i3] = heVar.au(-310118664);
            }
            i3++;
            ay4 = i6;
            ay5 = ay3;
            ay3 = i7;
        }
        heVar.ac = -984165911 * ay7;
        heVar.ac = -984165911 * i9;
        heVar.ac = -984165911 * i10;
        heVar.ac = -984165911 * i4;
        heVar.ac = -984165911 * i2;
        heVar.ac = -984165911 * i11;
        heVar.ac = -984165911 * ay6;
        i8 = 0;
        while (i8 < ay2) {
            this.am[i8] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                this.at[i8] = heVar.av(-2047354439);
            }
            if (au3 == 255) {
                this.ah[i8] = heVar.av(-1463506786);
            }
            if (au4 == 1) {
                this.ai[i8] = heVar.av(-648397779);
            }
            if (au5 == 1) {
                this.bh[i8] = heVar.au(-310118664);
            }
            if (au6 == 1) {
                this.ae[i8] = (short) (heVar.ay((byte) 1) - 1);
            }
            if (!(this.aw == null || this.ae[i8] == (short) -1)) {
                this.aw[i8] = (byte) (heVar.au(-310118664) - 1);
            }
            i8++;
        }
        heVar.ac = -984165911 * i5;
        heVar.ac = -984165911 * i;
        i = 0;
        i8 = 0;
        i7 = 0;
        i6 = 0;
        i9 = 0;
        while (i9 < ay2) {
            int i20;
            i2 = heVar.au(-310118664);
            if (i2 == 1) {
                i6 = heVar.bb(1314128743) + i8;
                i = heVar.bb(1314128743) + i6;
                i8 = heVar.bb(1314128743) + i;
                this.aa[i9] = i6;
                this.ak[i9] = i;
                this.ap[i9] = i8;
                i7 = i8;
            }
            if (i2 == 2) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i6;
                this.ak[i9] = i7;
                this.ap[i9] = i8;
                i = i7;
                i7 = i8;
            }
            if (i2 == 3) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i7;
                this.ak[i9] = i;
                this.ap[i9] = i8;
                i6 = i7;
                i7 = i8;
            }
            if (i2 == 4) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i;
                this.ak[i9] = i6;
                this.ap[i9] = i8;
                i7 = i8;
            } else {
                i20 = i;
                i = i6;
                i6 = i20;
            }
            i9++;
            i20 = i6;
            i6 = i;
            i = i20;
        }
        heVar.ac = -984165911 * i13;
        heVar.ac = -984165911 * i14;
        heVar.ac = -984165911 * i15;
        heVar.ac = -984165911 * i16;
        heVar.ac = -984165911 * i17;
        heVar.ac = -984165911 * i18;
        for (i8 = 0; i8 < au; i8++) {
            i7 = this.az[i8] & 255;
            if (i7 == 0) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 1) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-624907706);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 2) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1066172532);
                this.ad[i8] = (short) heVar.ay((byte) 1);
                this.ab[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 3) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1596018092);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
        }
        heVar.ac = -984165911 * i19;
        if (heVar.au(-310118664) != 0) {
            cy cyVar = new cy();
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ad((byte) -66);
        }
    }

    void bh(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 23) * -984165911;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int au7 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int ay7 = heVar.ay((byte) 1);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (au > 0) {
            this.az = new byte[au];
            heVar.ac = 0;
            for (i = 0; i < au; i++) {
                byte[] bArr2 = this.az;
                byte av = heVar.av(-1588953890);
                bArr2[i] = av;
                if (av == (byte) 0) {
                    i6++;
                }
                if (av >= (byte) 1 && av <= (byte) 3) {
                    i7++;
                }
                if (av == (byte) 2) {
                    i8++;
                }
            }
        }
        int i9 = au + ay;
        if (au2 == 1) {
            i = i9 + ay2;
        } else {
            i = i9;
        }
        int i10 = i + ay2;
        if (au3 == 255) {
            i2 = i10 + ay2;
        } else {
            i2 = i10;
        }
        if (au5 == 1) {
            i3 = i2 + ay2;
        } else {
            i3 = i2;
        }
        if (au7 == 1) {
            i4 = i3 + ay;
        } else {
            i4 = i3;
        }
        if (au4 == 1) {
            i5 = i4 + ay2;
        } else {
            i5 = i4;
        }
        int i11 = i5 + ay6;
        if (au6 == 1) {
            ay6 = (ay2 * 2) + i11;
        } else {
            ay6 = i11;
        }
        ay7 += ay6;
        int i12 = (ay2 * 2) + ay7;
        ay3 += i12;
        ay4 += ay3;
        int i13 = ay4 + ay5;
        int i14 = i13 + (i6 * 6);
        int i15 = i14 + (i7 * 6);
        int i16 = i15 + (i7 * 6);
        int i17 = i16 + (i7 * 2);
        int i18 = i17 + i7;
        int i19 = i18 + ((i7 * 2) + (i8 * 2));
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au7 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
        }
        if (au3 == 255) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        if (au6 == 1) {
            this.ae = new short[ay2];
        }
        if (au6 == 1 && au > 0) {
            this.aw = new byte[ay2];
        }
        this.am = new short[ay2];
        if (au > 0) {
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
            if (i7 > 0) {
                this.av = new short[i7];
                this.ay = new short[i7];
                this.ag = new short[i7];
                this.ar = new short[i7];
                this.bp = new byte[i7];
                this.ad = new short[i7];
            }
            if (i8 > 0) {
                this.ab = new short[i8];
            }
        }
        heVar.ac = -984165911 * au;
        heVar.ac = -984165911 * i12;
        heVar.ac = -984165911 * ay3;
        heVar.ac = -984165911 * ay4;
        heVar.ac = -984165911 * i3;
        ay3 = 0;
        ay4 = 0;
        ay5 = 0;
        i3 = 0;
        while (i3 < ay) {
            i12 = heVar.au(-310118664);
            if ((i12 & 1) != 0) {
                i6 = heVar.bb(1314128743);
            } else {
                i6 = 0;
            }
            if ((i12 & 2) != 0) {
                i7 = heVar.bb(1314128743);
            } else {
                i7 = 0;
            }
            i8 = 0;
            if ((i12 & 4) != 0) {
                i8 = heVar.bb(1314128743);
            }
            this.ac[i3] = i6 + ay5;
            this.an[i3] = i7 + ay4;
            this.aq[i3] = i8 + ay3;
            ay3 = this.ac[i3];
            i6 = this.an[i3];
            i7 = this.aq[i3];
            if (au7 == 1) {
                this.bm[i3] = heVar.au(-310118664);
            }
            i3++;
            ay4 = i6;
            ay5 = ay3;
            ay3 = i7;
        }
        heVar.ac = -984165911 * ay7;
        heVar.ac = -984165911 * i9;
        heVar.ac = -984165911 * i10;
        heVar.ac = -984165911 * i4;
        heVar.ac = -984165911 * i2;
        heVar.ac = -984165911 * i11;
        heVar.ac = -984165911 * ay6;
        i8 = 0;
        while (i8 < ay2) {
            this.am[i8] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                this.at[i8] = heVar.av(29374572);
            }
            if (au3 == 255) {
                this.ah[i8] = heVar.av(-157025611);
            }
            if (au4 == 1) {
                this.ai[i8] = heVar.av(-2084106096);
            }
            if (au5 == 1) {
                this.bh[i8] = heVar.au(-310118664);
            }
            if (au6 == 1) {
                this.ae[i8] = (short) (heVar.ay((byte) 1) - 1);
            }
            if (!(this.aw == null || this.ae[i8] == (short) -1)) {
                this.aw[i8] = (byte) (heVar.au(-310118664) - 1);
            }
            i8++;
        }
        heVar.ac = -984165911 * i5;
        heVar.ac = -984165911 * i;
        i = 0;
        i8 = 0;
        i7 = 0;
        i6 = 0;
        i9 = 0;
        while (i9 < ay2) {
            int i20;
            i2 = heVar.au(-310118664);
            if (i2 == 1) {
                i6 = heVar.bb(1314128743) + i8;
                i = heVar.bb(1314128743) + i6;
                i8 = heVar.bb(1314128743) + i;
                this.aa[i9] = i6;
                this.ak[i9] = i;
                this.ap[i9] = i8;
                i7 = i8;
            }
            if (i2 == 2) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i6;
                this.ak[i9] = i7;
                this.ap[i9] = i8;
                i = i7;
                i7 = i8;
            }
            if (i2 == 3) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i7;
                this.ak[i9] = i;
                this.ap[i9] = i8;
                i6 = i7;
                i7 = i8;
            }
            if (i2 == 4) {
                i8 += heVar.bb(1314128743);
                this.aa[i9] = i;
                this.ak[i9] = i6;
                this.ap[i9] = i8;
                i7 = i8;
            } else {
                i20 = i;
                i = i6;
                i6 = i20;
            }
            i9++;
            i20 = i6;
            i6 = i;
            i = i20;
        }
        heVar.ac = -984165911 * i13;
        heVar.ac = -984165911 * i14;
        heVar.ac = -984165911 * i15;
        heVar.ac = -984165911 * i16;
        heVar.ac = -984165911 * i17;
        heVar.ac = -984165911 * i18;
        for (i8 = 0; i8 < au; i8++) {
            i7 = this.az[i8] & 255;
            if (i7 == 0) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 1) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1720808716);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 2) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-833937388);
                this.ad[i8] = (short) heVar.ay((byte) 1);
                this.ab[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 3) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1176614349);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
        }
        heVar.ac = -984165911 * i19;
        if (heVar.au(-310118664) != 0) {
            cy cyVar = new cy();
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ad((byte) -27);
        }
    }

    void br(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 23) * -984165911;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int au7 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int ay7 = heVar.ay((byte) 1);
        if (au > 0) {
            this.az = new byte[au];
            heVar.ac = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < au; i4++) {
                byte[] bArr2 = this.az;
                byte av = heVar.av(-209063184);
                bArr2[i4] = av;
                if (av == (byte) 0) {
                    i3++;
                }
                if (av >= (byte) 1 && av <= (byte) 3) {
                    i2++;
                }
                if (av == (byte) 2) {
                    i++;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = i3;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        i2 = au + ay;
        if (au2 == 1) {
            i = i2 + ay2;
        } else {
            i = i2;
        }
        int i10 = i + ay2;
        if (au3 == 255) {
            i4 = i10 + ay2;
        } else {
            i4 = i10;
        }
        if (au5 == 1) {
            i3 = i4 + ay2;
        } else {
            i3 = i4;
        }
        if (au7 == 1) {
            i8 = i3 + ay;
        } else {
            i8 = i3;
        }
        if (au4 == 1) {
            i9 = i8 + ay2;
        } else {
            i9 = i8;
        }
        int i11 = i9 + ay6;
        if (au6 == 1) {
            ay6 = (ay2 * 2) + i11;
        } else {
            ay6 = i11;
        }
        ay7 += ay6;
        int i12 = (ay2 * 2) + ay7;
        ay3 += i12;
        ay4 += ay3;
        int i13 = ay4 + ay5;
        int i14 = i13 + (i7 * 6);
        int i15 = i14 + (i6 * 6);
        int i16 = i15 + (i6 * 6);
        int i17 = i16 + (i6 * 2);
        int i18 = i17 + i6;
        int i19 = i18 + ((i6 * 2) + (i5 * 2));
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au7 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
        }
        if (au3 == 255) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        if (au6 == 1) {
            this.ae = new short[ay2];
        }
        if (au6 == 1 && au > 0) {
            this.aw = new byte[ay2];
        }
        this.am = new short[ay2];
        if (au > 0) {
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
            if (i6 > 0) {
                this.av = new short[i6];
                this.ay = new short[i6];
                this.ag = new short[i6];
                this.ar = new short[i6];
                this.bp = new byte[i6];
                this.ad = new short[i6];
            }
            if (i5 > 0) {
                this.ab = new short[i5];
            }
        }
        heVar.ac = -984165911 * au;
        heVar.ac = -984165911 * i12;
        heVar.ac = -984165911 * ay3;
        heVar.ac = -984165911 * ay4;
        heVar.ac = i3 * -984165911;
        ay3 = 0;
        ay4 = 0;
        ay5 = 0;
        i7 = 0;
        while (i7 < ay) {
            i12 = heVar.au(-310118664);
            i3 = 0;
            if ((i12 & 1) != 0) {
                i3 = heVar.bb(1314128743);
            }
            if ((i12 & 2) != 0) {
                i6 = heVar.bb(1314128743);
            } else {
                i6 = 0;
            }
            i5 = 0;
            if ((i12 & 4) != 0) {
                i5 = heVar.bb(1314128743);
            }
            this.ac[i7] = i3 + ay5;
            this.an[i7] = i6 + ay4;
            this.aq[i7] = i5 + ay3;
            ay3 = this.ac[i7];
            i6 = this.an[i7];
            i5 = this.aq[i7];
            if (au7 == 1) {
                this.bm[i7] = heVar.au(-310118664);
            }
            i7++;
            ay4 = i6;
            ay5 = ay3;
            ay3 = i5;
        }
        heVar.ac = -984165911 * ay7;
        heVar.ac = i2 * -984165911;
        heVar.ac = -984165911 * i10;
        heVar.ac = -984165911 * i8;
        heVar.ac = -984165911 * i4;
        heVar.ac = -984165911 * i11;
        heVar.ac = -984165911 * ay6;
        i2 = 0;
        while (i2 < ay2) {
            this.am[i2] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                this.at[i2] = heVar.av(-2131853218);
            }
            if (au3 == 255) {
                this.ah[i2] = heVar.av(-1761741970);
            }
            if (au4 == 1) {
                this.ai[i2] = heVar.av(-1092298554);
            }
            if (au5 == 1) {
                this.bh[i2] = heVar.au(-310118664);
            }
            if (au6 == 1) {
                this.ae[i2] = (short) (heVar.ay((byte) 1) - 1);
            }
            if (!(this.aw == null || this.ae[i2] == (short) -1)) {
                this.aw[i2] = (byte) (heVar.au(-310118664) - 1);
            }
            i2++;
        }
        heVar.ac = -984165911 * i9;
        heVar.ac = i * -984165911;
        i4 = 0;
        i = 0;
        i2 = 0;
        i3 = 0;
        i9 = 0;
        while (i9 < ay2) {
            int i20;
            i8 = heVar.au(-310118664);
            if (i8 == 1) {
                i3 = heVar.bb(1314128743) + i;
                i4 = heVar.bb(1314128743) + i3;
                i = heVar.bb(1314128743) + i4;
                this.aa[i9] = i3;
                this.ak[i9] = i4;
                this.ap[i9] = i;
                i2 = i;
            }
            if (i8 == 2) {
                i += heVar.bb(1314128743);
                this.aa[i9] = i3;
                this.ak[i9] = i2;
                this.ap[i9] = i;
                i4 = i2;
                i2 = i;
            }
            if (i8 == 3) {
                i += heVar.bb(1314128743);
                this.aa[i9] = i2;
                this.ak[i9] = i4;
                this.ap[i9] = i;
                i3 = i2;
                i2 = i;
            }
            if (i8 == 4) {
                i += heVar.bb(1314128743);
                this.aa[i9] = i4;
                this.ak[i9] = i3;
                this.ap[i9] = i;
                i2 = i;
            } else {
                i20 = i4;
                i4 = i3;
                i3 = i20;
            }
            i9++;
            i20 = i3;
            i3 = i4;
            i4 = i20;
        }
        heVar.ac = -984165911 * i13;
        heVar.ac = -984165911 * i14;
        heVar.ac = -984165911 * i15;
        heVar.ac = -984165911 * i16;
        heVar.ac = -984165911 * i17;
        heVar.ac = -984165911 * i18;
        for (i = 0; i < au; i++) {
            i2 = this.az[i] & 255;
            if (i2 == 0) {
                this.ax[i] = (short) heVar.ay((byte) 1);
                this.af[i] = (short) heVar.ay((byte) 1);
                this.au[i] = (short) heVar.ay((byte) 1);
            }
            if (i2 == 1) {
                this.ax[i] = (short) heVar.ay((byte) 1);
                this.af[i] = (short) heVar.ay((byte) 1);
                this.au[i] = (short) heVar.ay((byte) 1);
                this.av[i] = (short) heVar.ay((byte) 1);
                this.ay[i] = (short) heVar.ay((byte) 1);
                this.ag[i] = (short) heVar.ay((byte) 1);
                this.ar[i] = (short) heVar.ay((byte) 1);
                this.bp[i] = heVar.av(-1618036045);
                this.ad[i] = (short) heVar.ay((byte) 1);
            }
            if (i2 == 2) {
                this.ax[i] = (short) heVar.ay((byte) 1);
                this.af[i] = (short) heVar.ay((byte) 1);
                this.au[i] = (short) heVar.ay((byte) 1);
                this.av[i] = (short) heVar.ay((byte) 1);
                this.ay[i] = (short) heVar.ay((byte) 1);
                this.ag[i] = (short) heVar.ay((byte) 1);
                this.ar[i] = (short) heVar.ay((byte) 1);
                this.bp[i] = heVar.av(-1723914025);
                this.ad[i] = (short) heVar.ay((byte) 1);
                this.ab[i] = (short) heVar.ay((byte) 1);
            }
            if (i2 == 3) {
                this.ax[i] = (short) heVar.ay((byte) 1);
                this.af[i] = (short) heVar.ay((byte) 1);
                this.au[i] = (short) heVar.ay((byte) 1);
                this.av[i] = (short) heVar.ay((byte) 1);
                this.ay[i] = (short) heVar.ay((byte) 1);
                this.ag[i] = (short) heVar.ay((byte) 1);
                this.ar[i] = (short) heVar.ay((byte) 1);
                this.bp[i] = heVar.av(-1394559208);
                this.ad[i] = (short) heVar.ay((byte) 1);
            }
        }
        heVar.ac = -984165911 * i19;
        if (heVar.au(-310118664) != 0) {
            cy cyVar = new cy();
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ad((byte) -51);
        }
    }

    void bt(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 23) * -984165911;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int au7 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int ay7 = heVar.ay((byte) 1);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (au > 0) {
            this.az = new byte[au];
            heVar.ac = 0;
            for (i = 0; i < au; i++) {
                byte[] bArr2 = this.az;
                byte av = heVar.av(-1061926195);
                bArr2[i] = av;
                if (av == (byte) 0) {
                    i6++;
                }
                if (av >= (byte) 1 && av <= (byte) 3) {
                    i7++;
                }
                if (av == (byte) 2) {
                    i8++;
                }
            }
        }
        int i9 = au + ay;
        if (au2 == 1) {
            i2 = i9 + ay2;
        } else {
            i2 = i9;
        }
        int i10 = i2 + ay2;
        if (au3 == 255) {
            i = i10 + ay2;
        } else {
            i = i10;
        }
        if (au5 == 1) {
            i3 = i + ay2;
        } else {
            i3 = i;
        }
        if (au7 == 1) {
            i4 = i3 + ay;
        } else {
            i4 = i3;
        }
        if (au4 == 1) {
            i5 = i4 + ay2;
        } else {
            i5 = i4;
        }
        int i11 = i5 + ay6;
        if (au6 == 1) {
            ay6 = (ay2 * 2) + i11;
        } else {
            ay6 = i11;
        }
        ay7 += ay6;
        int i12 = (ay2 * 2) + ay7;
        ay3 += i12;
        ay4 += ay3;
        int i13 = ay4 + ay5;
        int i14 = i13 + (i6 * 6);
        int i15 = i14 + (i7 * 6);
        int i16 = i15 + (i7 * 6);
        int i17 = i16 + (i7 * 2);
        int i18 = i17 + i7;
        int i19 = i18 + ((i7 * 2) + (i8 * 2));
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au7 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
        }
        if (au3 == 255) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        if (au6 == 1) {
            this.ae = new short[ay2];
        }
        if (au6 == 1 && au > 0) {
            this.aw = new byte[ay2];
        }
        this.am = new short[ay2];
        if (au > 0) {
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
            if (i7 > 0) {
                this.av = new short[i7];
                this.ay = new short[i7];
                this.ag = new short[i7];
                this.ar = new short[i7];
                this.bp = new byte[i7];
                this.ad = new short[i7];
            }
            if (i8 > 0) {
                this.ab = new short[i8];
            }
        }
        heVar.ac = -1851469824 * au;
        heVar.ac = -984165911 * i12;
        heVar.ac = -1596047325 * ay3;
        heVar.ac = -984165911 * ay4;
        heVar.ac = -984165911 * i3;
        ay3 = 0;
        ay4 = 0;
        ay5 = 0;
        i3 = 0;
        while (i3 < ay) {
            i12 = heVar.au(-310118664);
            i8 = 0;
            if ((i12 & 1) != 0) {
                i8 = heVar.bb(1314128743);
            }
            if ((i12 & 2) != 0) {
                i6 = heVar.bb(1314128743);
            } else {
                i6 = 0;
            }
            i7 = 0;
            if ((i12 & 4) != 0) {
                i7 = heVar.bb(1314128743);
            }
            this.ac[i3] = i8 + ay5;
            this.an[i3] = i6 + ay4;
            this.aq[i3] = i7 + ay3;
            ay3 = this.ac[i3];
            i6 = this.an[i3];
            i7 = this.aq[i3];
            if (au7 == 1) {
                this.bm[i3] = heVar.au(-310118664);
            }
            i3++;
            ay4 = i6;
            ay5 = ay3;
            ay3 = i7;
        }
        heVar.ac = -1851830265 * ay7;
        heVar.ac = -132543467 * i9;
        heVar.ac = -984165911 * i10;
        heVar.ac = 201373505 * i4;
        heVar.ac = 1638010676 * i;
        heVar.ac = -984165911 * i11;
        heVar.ac = -984165911 * ay6;
        i8 = 0;
        while (i8 < ay2) {
            this.am[i8] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                this.at[i8] = heVar.av(-649319401);
            }
            if (au3 == -559572962) {
                this.ah[i8] = heVar.av(-1687732352);
            }
            if (au4 == 1) {
                this.ai[i8] = heVar.av(-1230986568);
            }
            if (au5 == 1) {
                this.bh[i8] = heVar.au(-310118664);
            }
            if (au6 == 1) {
                this.ae[i8] = (short) (heVar.ay((byte) 1) - 1);
            }
            if (!(this.aw == null || this.ae[i8] == (short) -1)) {
                this.aw[i8] = (byte) (heVar.au(-310118664) - 1);
            }
            i8++;
        }
        heVar.ac = -2055576557 * i5;
        heVar.ac = -1264246187 * i2;
        i = 0;
        i8 = 0;
        i7 = 0;
        i6 = 0;
        i10 = 0;
        while (i10 < ay2) {
            int i20;
            i3 = heVar.au(-310118664);
            if (i3 == 1) {
                i6 = heVar.bb(1314128743) + i8;
                i = heVar.bb(1314128743) + i6;
                i8 = heVar.bb(1314128743) + i;
                this.aa[i10] = i6;
                this.ak[i10] = i;
                this.ap[i10] = i8;
                i7 = i8;
            }
            if (i3 == 2) {
                i8 += heVar.bb(1314128743);
                this.aa[i10] = i6;
                this.ak[i10] = i7;
                this.ap[i10] = i8;
                i = i7;
                i7 = i8;
            }
            if (i3 == 3) {
                i8 += heVar.bb(1314128743);
                this.aa[i10] = i7;
                this.ak[i10] = i;
                this.ap[i10] = i8;
                i6 = i7;
                i7 = i8;
            }
            if (i3 == 4) {
                i8 += heVar.bb(1314128743);
                this.aa[i10] = i;
                this.ak[i10] = i6;
                this.ap[i10] = i8;
                i7 = i8;
            } else {
                i20 = i;
                i = i6;
                i6 = i20;
            }
            i10++;
            i20 = i6;
            i6 = i;
            i = i20;
        }
        heVar.ac = 1979642610 * i13;
        heVar.ac = -984165911 * i14;
        heVar.ac = -1322010259 * i15;
        heVar.ac = 1159014901 * i16;
        heVar.ac = 663543206 * i17;
        heVar.ac = -984165911 * i18;
        for (i8 = 0; i8 < au; i8++) {
            i7 = this.az[i8] & -2091295148;
            if (i7 == 0) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 1) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1075728495);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 2) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-1803562919);
                this.ad[i8] = (short) heVar.ay((byte) 1);
                this.ab[i8] = (short) heVar.ay((byte) 1);
            }
            if (i7 == 3) {
                this.ax[i8] = (short) heVar.ay((byte) 1);
                this.af[i8] = (short) heVar.ay((byte) 1);
                this.au[i8] = (short) heVar.ay((byte) 1);
                this.av[i8] = (short) heVar.ay((byte) 1);
                this.ay[i8] = (short) heVar.ay((byte) 1);
                this.ag[i8] = (short) heVar.ay((byte) 1);
                this.ar[i8] = (short) heVar.ay((byte) 1);
                this.bp[i8] = heVar.av(-890220496);
                this.ad[i8] = (short) heVar.ay((byte) 1);
            }
        }
        heVar.ac = 1856150294 * i19;
        if (heVar.au(-310118664) != 0) {
            cy cyVar = new cy();
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ay((byte) 1);
            heVar.ad((byte) -122);
        }
    }

    void an(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 18) * -984165911;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int i6 = 0 + ay;
        int i7 = i6 + ay2;
        if (au3 == 255) {
            i = i7 + ay2;
        } else {
            i = i7;
        }
        if (au5 == 1) {
            i2 = i + ay2;
        } else {
            i2 = i;
        }
        if (au2 == 1) {
            i3 = i2 + ay2;
        } else {
            i3 = i2;
        }
        if (au6 == 1) {
            i4 = i3 + ay;
        } else {
            i4 = i3;
        }
        if (au4 == 1) {
            i5 = i4 + ay2;
        } else {
            i5 = i4;
        }
        int i8 = i5 + ay6;
        int i9 = i8 + (ay2 * 2);
        ay6 = (au * 6) + i9;
        ay3 += ay6;
        ay4 += ay3;
        ay5 += ay4;
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au > 0) {
            this.az = new byte[au];
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
        }
        if (au6 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
            this.aw = new byte[ay2];
            this.ae = new short[ay2];
        }
        if (au3 == 255) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        this.am = new short[ay2];
        heVar.ac = 0;
        heVar.ac = -984165911 * ay6;
        heVar.ac = ay3 * -984165911;
        heVar.ac = -984165911 * ay4;
        heVar.ac = i3 * -984165911;
        ay6 = 0;
        int i10 = 0;
        int i11 = 0;
        ay5 = 0;
        while (ay5 < ay) {
            int au7 = heVar.au(-310118664);
            i3 = 0;
            if ((au7 & 1) != 0) {
                i3 = heVar.bb(1314128743);
            }
            ay3 = 0;
            if ((au7 & 2) != 0) {
                ay3 = heVar.bb(1314128743);
            }
            ay4 = 0;
            if ((au7 & 4) != 0) {
                ay4 = heVar.bb(1314128743);
            }
            this.ac[ay5] = i3 + i11;
            this.an[ay5] = ay3 + i10;
            this.aq[ay5] = ay6 + ay4;
            ay6 = this.ac[ay5];
            ay4 = this.an[ay5];
            ay3 = this.aq[ay5];
            if (au6 == 1) {
                this.bm[ay5] = heVar.au(-310118664);
            }
            ay5++;
            i10 = ay4;
            i11 = ay6;
            ay6 = ay3;
        }
        heVar.ac = -984165911 * i8;
        heVar.ac = i2 * -984165911;
        heVar.ac = i7 * -984165911;
        heVar.ac = -984165911 * i4;
        heVar.ac = i * -984165911;
        i2 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i2 < ay2) {
            Object obj3;
            this.am[i2] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                i7 = heVar.au(-310118664);
                if ((i7 & 1) == 1) {
                    this.at[i2] = (byte) 1;
                    obj3 = 1;
                } else {
                    this.at[i2] = (byte) 0;
                    obj3 = obj2;
                }
                if ((i7 & 2) == 2) {
                    this.aw[i2] = (byte) (i7 >> 2);
                    this.ae[i2] = this.am[i2];
                    this.am[i2] = (short) 127;
                    if (this.ae[i2] != (short) -1) {
                        obj2 = obj3;
                        obj3 = 1;
                    }
                } else {
                    this.aw[i2] = (byte) -1;
                    this.ae[i2] = (short) -1;
                }
                obj2 = obj3;
                obj3 = obj;
            } else {
                obj3 = obj;
            }
            if (au3 == 255) {
                this.ah[i2] = heVar.av(-1365055324);
            }
            if (au4 == 1) {
                this.ai[i2] = heVar.av(-1759864199);
            }
            if (au5 == 1) {
                this.bh[i2] = heVar.au(-310118664);
            }
            i2++;
            obj = obj3;
        }
        heVar.ac = -984165911 * i5;
        heVar.ac = -984165911 * i6;
        i5 = 0;
        i = 0;
        i7 = 0;
        i2 = 0;
        ay3 = 0;
        while (ay3 < ay2) {
            int i12;
            ay4 = heVar.au(-310118664);
            if (ay4 == 1) {
                i2 = heVar.bb(1314128743) + i;
                i5 = heVar.bb(1314128743) + i2;
                i = heVar.bb(1314128743) + i5;
                this.aa[ay3] = i2;
                this.ak[ay3] = i5;
                this.ap[ay3] = i;
                i7 = i;
            }
            if (ay4 == 2) {
                i += heVar.bb(1314128743);
                this.aa[ay3] = i2;
                this.ak[ay3] = i7;
                this.ap[ay3] = i;
                i5 = i7;
                i7 = i;
            }
            if (ay4 == 3) {
                i += heVar.bb(1314128743);
                this.aa[ay3] = i7;
                this.ak[ay3] = i5;
                this.ap[ay3] = i;
                i2 = i7;
                i7 = i;
            }
            if (ay4 == 4) {
                i += heVar.bb(1314128743);
                this.aa[ay3] = i5;
                this.ak[ay3] = i2;
                this.ap[ay3] = i;
                i7 = i;
            } else {
                i12 = i5;
                i5 = i2;
                i2 = i12;
            }
            ay3++;
            i12 = i2;
            i2 = i5;
            i5 = i12;
        }
        heVar.ac = -984165911 * i9;
        for (i = 0; i < au; i++) {
            this.az[i] = (byte) 0;
            this.ax[i] = (short) heVar.ay((byte) 1);
            this.af[i] = (short) heVar.ay((byte) 1);
            this.au[i] = (short) heVar.ay((byte) 1);
        }
        if (this.aw != null) {
            obj3 = null;
            i7 = 0;
            while (i7 < ay2) {
                i2 = this.aw[i7] & 255;
                if (i2 != 255) {
                    if ((this.ax[i2] & 65535) == this.aa[i7] && (this.af[i2] & 65535) == this.ak[i7] && (this.au[i2] & 65535) == this.ap[i7]) {
                        this.aw[i7] = (byte) -1;
                    } else {
                        obj3 = 1;
                    }
                }
                i7++;
            }
            if (obj3 == null) {
                this.aw = null;
            }
        }
        if (obj == null) {
            this.ae = null;
        }
        if (obj2 == null) {
            this.at = null;
        }
    }

    void bb(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        he heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar = new he(bArr);
        heVar.ac = (bArr.length - 18) * -128137327;
        int ay = heVar.ay((byte) 1);
        int ay2 = heVar.ay((byte) 1);
        int au = heVar.au(-310118664);
        int au2 = heVar.au(-310118664);
        int au3 = heVar.au(-310118664);
        int au4 = heVar.au(-310118664);
        int au5 = heVar.au(-310118664);
        int au6 = heVar.au(-310118664);
        int ay3 = heVar.ay((byte) 1);
        int ay4 = heVar.ay((byte) 1);
        int ay5 = heVar.ay((byte) 1);
        int ay6 = heVar.ay((byte) 1);
        int i6 = 0 + ay;
        int i7 = i6 + ay2;
        if (au3 == -2112202123) {
            i = i7 + ay2;
        } else {
            i = i7;
        }
        if (au5 == 1) {
            i2 = i + ay2;
        } else {
            i2 = i;
        }
        if (au2 == 1) {
            i3 = i2 + ay2;
        } else {
            i3 = i2;
        }
        if (au6 == 1) {
            i4 = i3 + ay;
        } else {
            i4 = i3;
        }
        if (au4 == 1) {
            i5 = i4 + ay2;
        } else {
            i5 = i4;
        }
        int i8 = i5 + ay6;
        int i9 = i8 + (ay2 * 2);
        ay6 = (au * 6) + i9;
        ay3 += ay6;
        ay4 += ay3;
        ay5 += ay4;
        this.aj = ay;
        this.ao = ay2;
        this.al = au;
        this.ac = new int[ay];
        this.an = new int[ay];
        this.aq = new int[ay];
        this.aa = new int[ay2];
        this.ak = new int[ay2];
        this.ap = new int[ay2];
        if (au > 0) {
            this.az = new byte[au];
            this.ax = new short[au];
            this.af = new short[au];
            this.au = new short[au];
        }
        if (au6 == 1) {
            this.bm = new int[ay];
        }
        if (au2 == 1) {
            this.at = new byte[ay2];
            this.aw = new byte[ay2];
            this.ae = new short[ay2];
        }
        if (au3 == -1463677413) {
            this.ah = new byte[ay2];
        } else {
            this.as = (byte) au3;
        }
        if (au4 == 1) {
            this.ai = new byte[ay2];
        }
        if (au5 == 1) {
            this.bh = new int[ay2];
        }
        this.am = new short[ay2];
        heVar.ac = 0;
        heVar.ac = -951498914 * ay6;
        heVar.ac = ay3 * -687857818;
        heVar.ac = -984165911 * ay4;
        heVar.ac = i3 * -984165911;
        ay6 = 0;
        int i10 = 0;
        int i11 = 0;
        ay5 = 0;
        while (ay5 < ay) {
            int au7 = heVar.au(-310118664);
            i3 = 0;
            if ((au7 & 1) != 0) {
                i3 = heVar.bb(1314128743);
            }
            ay3 = 0;
            if ((au7 & 2) != 0) {
                ay3 = heVar.bb(1314128743);
            }
            ay4 = 0;
            if ((au7 & 4) != 0) {
                ay4 = heVar.bb(1314128743);
            }
            this.ac[ay5] = i3 + i11;
            this.an[ay5] = ay3 + i10;
            this.aq[ay5] = ay6 + ay4;
            ay6 = this.ac[ay5];
            ay4 = this.an[ay5];
            ay3 = this.aq[ay5];
            if (au6 == 1) {
                this.bm[ay5] = heVar.au(-310118664);
            }
            ay5++;
            i10 = ay4;
            i11 = ay6;
            ay6 = ay3;
        }
        heVar.ac = -54676556 * i8;
        heVar.ac = 275687759 * i2;
        heVar.ac = i7 * -984165911;
        heVar.ac = -984165911 * i4;
        heVar.ac = i * -984165911;
        i4 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i4 < ay2) {
            Object obj3;
            Object obj4;
            this.am[i4] = (short) heVar.ay((byte) 1);
            if (au2 == 1) {
                i = heVar.au(-310118664);
                if ((i & 1) == 1) {
                    this.at[i4] = (byte) 1;
                    obj3 = 1;
                } else {
                    this.at[i4] = (byte) 0;
                    obj3 = obj2;
                }
                if ((i & 2) == 2) {
                    this.aw[i4] = (byte) (i >> 2);
                    this.ae[i4] = this.am[i4];
                    this.am[i4] = (short) 26247;
                    if (this.ae[i4] != (short) -1) {
                        obj4 = 1;
                    }
                } else {
                    this.aw[i4] = (byte) -1;
                    this.ae[i4] = (short) -1;
                }
                obj4 = obj;
            } else {
                obj4 = obj;
                obj3 = obj2;
            }
            if (au3 == 255) {
                this.ah[i4] = heVar.av(-532729779);
            }
            if (au4 == 1) {
                this.ai[i4] = heVar.av(-870124686);
            }
            if (au5 == 1) {
                this.bh[i4] = heVar.au(-310118664);
            }
            i4++;
            obj = obj4;
            obj2 = obj3;
        }
        heVar.ac = -1971505224 * i5;
        heVar.ac = -1172952650 * i6;
        i3 = 0;
        i = 0;
        i7 = 0;
        i4 = 0;
        i5 = 0;
        while (i5 < ay2) {
            int i12;
            int au8 = heVar.au(-310118664);
            if (au8 == 1) {
                i4 = heVar.bb(1314128743) + i;
                i3 = heVar.bb(1314128743) + i4;
                i = heVar.bb(1314128743) + i3;
                this.aa[i5] = i4;
                this.ak[i5] = i3;
                this.ap[i5] = i;
                i7 = i;
            }
            if (au8 == 2) {
                i += heVar.bb(1314128743);
                this.aa[i5] = i4;
                this.ak[i5] = i7;
                this.ap[i5] = i;
                i3 = i7;
                i7 = i;
            }
            if (au8 == 3) {
                i += heVar.bb(1314128743);
                this.aa[i5] = i7;
                this.ak[i5] = i3;
                this.ap[i5] = i;
                i4 = i7;
                i7 = i;
            }
            if (au8 == 4) {
                i += heVar.bb(1314128743);
                this.aa[i5] = i3;
                this.ak[i5] = i4;
                this.ap[i5] = i;
                i7 = i;
            } else {
                i12 = i3;
                i3 = i4;
                i4 = i12;
            }
            i5++;
            i12 = i4;
            i4 = i3;
            i3 = i12;
        }
        heVar.ac = -1466064283 * i9;
        for (i = 0; i < au; i++) {
            this.az[i] = (byte) 0;
            this.ax[i] = (short) heVar.ay((byte) 1);
            this.af[i] = (short) heVar.ay((byte) 1);
            this.au[i] = (short) heVar.ay((byte) 1);
        }
        if (this.aw != null) {
            obj4 = null;
            i7 = 0;
            while (i7 < ay2) {
                i4 = this.aw[i7] & 255;
                if (i4 != 428326215) {
                    if ((this.ax[i4] & 1766334346) == this.aa[i7] && (this.af[i4] & -467201268) == this.ak[i7] && (this.au[i4] & 65535) == this.ap[i7]) {
                        this.aw[i7] = (byte) -1;
                    } else {
                        obj4 = 1;
                    }
                }
                i7++;
            }
            if (obj4 == null) {
                this.aw = null;
            }
        }
        if (obj == null) {
            this.ae = null;
        }
        if (obj2 == null) {
            this.at = null;
        }
    }

    public bf(bf[] bfVarArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        this.aj = 0;
        this.ao = 0;
        this.al = 0;
        this.as = (byte) -1;
        int i8 = 0;
        Object obj = null;
        while (i8 < i) {
            Object obj2;
            int i9;
            int i10;
            bf bfVar = bfVarArr[i8];
            if (bfVar != null) {
                this.aj += bfVar.aj;
                this.ao += bfVar.ao;
                this.al += bfVar.al;
                if (bfVar.ah != null) {
                    obj = 1;
                } else {
                    if (this.as == (byte) -1) {
                        this.as = bfVar.as;
                    }
                    if (this.as != bfVar.as) {
                        obj = 1;
                    }
                }
                if (bfVar.at != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i3 |= i2;
                if (bfVar.ai != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i4 |= i2;
                i5 |= bfVar.bh != null ? 1 : 0;
                if (bfVar.ae != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i6 |= i2;
                if (bfVar.aw != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i2 |= i7;
                i7 = i5;
                obj2 = obj;
                i9 = i2;
                i2 = i6;
                i6 = i4;
                i4 = i3;
            } else {
                i2 = i6;
                i6 = i4;
                i4 = i3;
                i10 = i7;
                i7 = i5;
                obj2 = obj;
                i9 = i10;
            }
            i8++;
            i3 = i4;
            i4 = i6;
            i6 = i2;
            i10 = i7;
            i7 = i9;
            obj = obj2;
            i5 = i10;
        }
        this.ac = new int[this.aj];
        this.an = new int[this.aj];
        this.aq = new int[this.aj];
        this.bm = new int[this.aj];
        this.aa = new int[this.ao];
        this.ak = new int[this.ao];
        this.ap = new int[this.ao];
        if (i3 != 0) {
            this.at = new byte[this.ao];
        }
        if (obj != null) {
            this.ah = new byte[this.ao];
        }
        if (i4 != 0) {
            this.ai = new byte[this.ao];
        }
        if (i5 != 0) {
            this.bh = new int[this.ao];
        }
        if (i6 != 0) {
            this.ae = new short[this.ao];
        }
        if (i7 != 0) {
            this.aw = new byte[this.ao];
        }
        this.am = new short[this.ao];
        if (this.al > 0) {
            this.az = new byte[this.al];
            this.ax = new short[this.al];
            this.af = new short[this.al];
            this.au = new short[this.al];
            this.av = new short[this.al];
            this.ay = new short[this.al];
            this.ag = new short[this.al];
            this.ar = new short[this.al];
            this.bp = new byte[this.al];
            this.ad = new short[this.al];
            this.ab = new short[this.al];
        }
        this.aj = 0;
        this.ao = 0;
        this.al = 0;
        for (i8 = 0; i8 < i; i8++) {
            bfVar = bfVarArr[i8];
            if (bfVar != null) {
                i2 = 0;
                while (i2 < bfVar.ao) {
                    if (!(i3 == 0 || bfVar.at == null)) {
                        this.at[this.ao] = bfVar.at[i2];
                    }
                    if (obj != null) {
                        if (bfVar.ah != null) {
                            this.ah[this.ao] = bfVar.ah[i2];
                        } else {
                            this.ah[this.ao] = bfVar.as;
                        }
                    }
                    if (!(i4 == 0 || bfVar.ai == null)) {
                        this.ai[this.ao] = bfVar.ai[i2];
                    }
                    if (!(i5 == 0 || bfVar.bh == null)) {
                        this.bh[this.ao] = bfVar.bh[i2];
                    }
                    if (i6 != 0) {
                        if (bfVar.ae != null) {
                            this.ae[this.ao] = bfVar.ae[i2];
                        } else {
                            this.ae[this.ao] = (short) -1;
                        }
                    }
                    if (i7 != 0) {
                        if (bfVar.aw == null || bfVar.aw[i2] == (byte) -1) {
                            this.aw[this.ao] = (byte) -1;
                        } else {
                            this.aw[this.ao] = (byte) (bfVar.aw[i2] + this.al);
                        }
                    }
                    this.am[this.ao] = bfVar.am[i2];
                    this.aa[this.ao] = aq(bfVar, bfVar.aa[i2]);
                    this.ak[this.ao] = aq(bfVar, bfVar.ak[i2]);
                    this.ap[this.ao] = aq(bfVar, bfVar.ap[i2]);
                    this.ao++;
                    i2++;
                }
                for (i2 = 0; i2 < bfVar.al; i2++) {
                    byte[] bArr = this.az;
                    int i11 = this.al;
                    byte b = bfVar.az[i2];
                    bArr[i11] = b;
                    if (b == (byte) 0) {
                        this.ax[this.al] = (short) aq(bfVar, bfVar.ax[i2]);
                        this.af[this.al] = (short) aq(bfVar, bfVar.af[i2]);
                        this.au[this.al] = (short) aq(bfVar, bfVar.au[i2]);
                    }
                    if (b >= (byte) 1 && b <= (byte) 3) {
                        this.ax[this.al] = bfVar.ax[i2];
                        this.af[this.al] = bfVar.af[i2];
                        this.au[this.al] = bfVar.au[i2];
                        this.av[this.al] = bfVar.av[i2];
                        this.ay[this.al] = bfVar.ay[i2];
                        this.ag[this.al] = bfVar.ag[i2];
                        this.ar[this.al] = bfVar.ar[i2];
                        this.bp[this.al] = bfVar.bp[i2];
                        this.ad[this.al] = bfVar.ad[i2];
                    }
                    if (b == (byte) 2) {
                        this.ab[this.al] = bfVar.ab[i2];
                    }
                    this.al++;
                }
            }
        }
    }

    final int aq(bf bfVar, int i) {
        int i2 = bfVar.ac[i];
        int i3 = bfVar.an[i];
        int i4 = bfVar.aq[i];
        int i5 = 0;
        while (i5 < this.aj) {
            if (i2 == this.ac[i5] && i3 == this.an[i5] && i4 == this.aq[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ac[this.aj] = i2;
        this.an[this.aj] = i3;
        this.aq[this.aj] = i4;
        if (bfVar.bm != null) {
            this.bm[this.aj] = bfVar.bm[i];
        }
        i5 = this.aj;
        this.aj = i5 + 1;
        return i5;
    }

    final int bd(bf bfVar, int i) {
        int i2 = bfVar.ac[i];
        int i3 = bfVar.an[i];
        int i4 = bfVar.aq[i];
        int i5 = 0;
        while (i5 < this.aj) {
            if (i2 == this.ac[i5] && i3 == this.an[i5] && i4 == this.aq[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ac[this.aj] = i2;
        this.an[this.aj] = i3;
        this.aq[this.aj] = i4;
        if (bfVar.bm != null) {
            this.bm[this.aj] = bfVar.bm[i];
        }
        i5 = this.aj;
        this.aj = i5 + 1;
        return i5;
    }

    final int bu(bf bfVar, int i) {
        int i2 = bfVar.ac[i];
        int i3 = bfVar.an[i];
        int i4 = bfVar.aq[i];
        int i5 = 0;
        while (i5 < this.aj) {
            if (i2 == this.ac[i5] && i3 == this.an[i5] && i4 == this.aq[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ac[this.aj] = i2;
        this.an[this.aj] = i3;
        this.aq[this.aj] = i4;
        if (bfVar.bm != null) {
            this.bm[this.aj] = bfVar.bm[i];
        }
        i5 = this.aj;
        this.aj = i5 + 1;
        return i5;
    }

    final int by(bf bfVar, int i) {
        int i2 = bfVar.ac[i];
        int i3 = bfVar.an[i];
        int i4 = bfVar.aq[i];
        int i5 = 0;
        while (i5 < this.aj) {
            if (i2 == this.ac[i5] && i3 == this.an[i5] && i4 == this.aq[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.ac[this.aj] = i2;
        this.an[this.aj] = i3;
        this.aq[this.aj] = i4;
        if (bfVar.bm != null) {
            this.bm[this.aj] = bfVar.bm[i];
        }
        i5 = this.aj;
        this.aj = i5 + 1;
        return i5;
    }

    public bf(bf bfVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2 = 0;
        this.aj = bfVar.aj;
        this.ao = bfVar.ao;
        this.al = bfVar.al;
        if (z) {
            this.ac = bfVar.ac;
            this.an = bfVar.an;
            this.aq = bfVar.aq;
        } else {
            this.ac = new int[this.aj];
            this.an = new int[this.aj];
            this.aq = new int[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.ac[i] = bfVar.ac[i];
                this.an[i] = bfVar.an[i];
                this.aq[i] = bfVar.aq[i];
            }
        }
        if (z2) {
            this.am = bfVar.am;
        } else {
            this.am = new short[this.ao];
            for (i = 0; i < this.ao; i++) {
                this.am[i] = bfVar.am[i];
            }
        }
        if (z3 || bfVar.ae == null) {
            this.ae = bfVar.ae;
        } else {
            this.ae = new short[this.ao];
            for (i = 0; i < this.ao; i++) {
                this.ae[i] = bfVar.ae[i];
            }
        }
        if (z4) {
            this.ai = bfVar.ai;
        } else {
            this.ai = new byte[this.ao];
            if (bfVar.ai == null) {
                for (i = 0; i < this.ao; i++) {
                    this.ai[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ao) {
                    this.ai[i2] = bfVar.ai[i2];
                    i2++;
                }
            }
        }
        this.aa = bfVar.aa;
        this.ak = bfVar.ak;
        this.ap = bfVar.ap;
        this.at = bfVar.at;
        this.ah = bfVar.ah;
        this.aw = bfVar.aw;
        this.as = bfVar.as;
        this.az = bfVar.az;
        this.ax = bfVar.ax;
        this.af = bfVar.af;
        this.au = bfVar.au;
        this.av = bfVar.av;
        this.ay = bfVar.ay;
        this.ag = bfVar.ag;
        this.ar = bfVar.ar;
        this.bp = bfVar.bp;
        this.ad = bfVar.ad;
        this.ab = bfVar.ab;
        this.bm = bfVar.bm;
        this.bh = bfVar.bh;
        this.bt = bfVar.bt;
        this.br = bfVar.br;
        this.bu = bfVar.bu;
        this.bb = bfVar.bb;
        this.bd = bfVar.bd;
        this.by = bfVar.by;
        this.bx = bfVar.bx;
    }

    public bf ao() {
        bf bfVar = new bf();
        if (this.at != null) {
            bfVar.at = new byte[this.ao];
            for (int i = 0; i < this.ao; i++) {
                bfVar.at[i] = this.at[i];
            }
        }
        bfVar.aj = this.aj;
        bfVar.ao = this.ao;
        bfVar.al = this.al;
        bfVar.ac = this.ac;
        bfVar.an = this.an;
        bfVar.aq = this.aq;
        bfVar.aa = this.aa;
        bfVar.ak = this.ak;
        bfVar.ap = this.ap;
        bfVar.ah = this.ah;
        bfVar.ai = this.ai;
        bfVar.aw = this.aw;
        bfVar.am = this.am;
        bfVar.ae = this.ae;
        bfVar.as = this.as;
        bfVar.az = this.az;
        bfVar.ax = this.ax;
        bfVar.af = this.af;
        bfVar.au = this.au;
        bfVar.av = this.av;
        bfVar.ay = this.ay;
        bfVar.ag = this.ag;
        bfVar.ar = this.ar;
        bfVar.bp = this.bp;
        bfVar.ad = this.ad;
        bfVar.ab = this.ab;
        bfVar.bm = this.bm;
        bfVar.bh = this.bh;
        bfVar.bt = this.bt;
        bfVar.br = this.br;
        bfVar.bu = this.bu;
        bfVar.bb = this.bb;
        bfVar.by = this.by;
        bfVar.bx = this.bx;
        return bfVar;
    }

    public bf bi() {
        bf bfVar = new bf();
        if (this.at != null) {
            bfVar.at = new byte[this.ao];
            for (int i = 0; i < this.ao; i++) {
                bfVar.at[i] = this.at[i];
            }
        }
        bfVar.aj = this.aj;
        bfVar.ao = this.ao;
        bfVar.al = this.al;
        bfVar.ac = this.ac;
        bfVar.an = this.an;
        bfVar.aq = this.aq;
        bfVar.aa = this.aa;
        bfVar.ak = this.ak;
        bfVar.ap = this.ap;
        bfVar.ah = this.ah;
        bfVar.ai = this.ai;
        bfVar.aw = this.aw;
        bfVar.am = this.am;
        bfVar.ae = this.ae;
        bfVar.as = this.as;
        bfVar.az = this.az;
        bfVar.ax = this.ax;
        bfVar.af = this.af;
        bfVar.au = this.au;
        bfVar.av = this.av;
        bfVar.ay = this.ay;
        bfVar.ag = this.ag;
        bfVar.ar = this.ar;
        bfVar.bp = this.bp;
        bfVar.ad = this.ad;
        bfVar.ab = this.ab;
        bfVar.bm = this.bm;
        bfVar.bh = this.bh;
        bfVar.bt = this.bt;
        bfVar.br = this.br;
        bfVar.bu = this.bu;
        bfVar.bb = this.bb;
        bfVar.by = this.by;
        bfVar.bx = this.bx;
        return bfVar;
    }

    public bf bx() {
        bf bfVar = new bf();
        if (this.at != null) {
            bfVar.at = new byte[this.ao];
            for (int i = 0; i < this.ao; i++) {
                bfVar.at[i] = this.at[i];
            }
        }
        bfVar.aj = this.aj;
        bfVar.ao = this.ao;
        bfVar.al = this.al;
        bfVar.ac = this.ac;
        bfVar.an = this.an;
        bfVar.aq = this.aq;
        bfVar.aa = this.aa;
        bfVar.ak = this.ak;
        bfVar.ap = this.ap;
        bfVar.ah = this.ah;
        bfVar.ai = this.ai;
        bfVar.aw = this.aw;
        bfVar.am = this.am;
        bfVar.ae = this.ae;
        bfVar.as = this.as;
        bfVar.az = this.az;
        bfVar.ax = this.ax;
        bfVar.af = this.af;
        bfVar.au = this.au;
        bfVar.av = this.av;
        bfVar.ay = this.ay;
        bfVar.ag = this.ag;
        bfVar.ar = this.ar;
        bfVar.bp = this.bp;
        bfVar.ad = this.ad;
        bfVar.ab = this.ab;
        bfVar.bm = this.bm;
        bfVar.bh = this.bh;
        bfVar.bt = this.bt;
        bfVar.br = this.br;
        bfVar.bu = this.bu;
        bfVar.bb = this.bb;
        bfVar.by = this.by;
        bfVar.bx = this.bx;
        return bfVar;
    }

    public bf aa(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        af();
        int i5 = this.bo + i;
        int i6 = this.bz + i;
        int i7 = this.bj + i3;
        int i8 = this.bq + i3;
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
        bf bfVar;
        if (z) {
            bfVar = new bf();
            bfVar.aj = this.aj;
            bfVar.ao = this.ao;
            bfVar.al = this.al;
            bfVar.ac = this.ac;
            bfVar.aq = this.aq;
            bfVar.aa = this.aa;
            bfVar.ak = this.ak;
            bfVar.ap = this.ap;
            bfVar.at = this.at;
            bfVar.ah = this.ah;
            bfVar.ai = this.ai;
            bfVar.aw = this.aw;
            bfVar.am = this.am;
            bfVar.ae = this.ae;
            bfVar.as = this.as;
            bfVar.az = this.az;
            bfVar.ax = this.ax;
            bfVar.af = this.af;
            bfVar.au = this.au;
            bfVar.av = this.av;
            bfVar.ay = this.ay;
            bfVar.ag = this.ag;
            bfVar.ar = this.ar;
            bfVar.bp = this.bp;
            bfVar.ad = this.ad;
            bfVar.ab = this.ab;
            bfVar.bm = this.bm;
            bfVar.bh = this.bh;
            bfVar.bt = this.bt;
            bfVar.br = this.br;
            bfVar.by = this.by;
            bfVar.bx = this.bx;
            bfVar.an = new int[bfVar.aj];
        } else {
            bfVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = this.ac[i5] + i;
                i8 = this.aq[i5] + i3;
                i9 = i7 & 127;
                i10 = i8 & 127;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                bfVar.an[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.an[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = ((-this.an[i5]) << 16) / (this.bl * -2098630381);
                if (i7 < i4) {
                    i8 = this.ac[i5] + i;
                    i9 = this.aq[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (128 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    bfVar.an[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.an[i5];
                }
            }
        }
        bfVar.ax();
        return bfVar;
    }

    public bf bo(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        af();
        int i5 = this.bo + i;
        int i6 = this.bz + i;
        int i7 = this.bj + i3;
        int i8 = this.bq + i3;
        if (i5 < 0 || ((-2045228835 + i6) >> 7) >= iArr.length || i7 < 0 || ((i8 + cj.ak) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 - 2055576932) >> 7;
        i7 >>= 7;
        i8 = (i8 - 1233013902) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bf bfVar;
        if (z) {
            bfVar = new bf();
            bfVar.aj = this.aj;
            bfVar.ao = this.ao;
            bfVar.al = this.al;
            bfVar.ac = this.ac;
            bfVar.aq = this.aq;
            bfVar.aa = this.aa;
            bfVar.ak = this.ak;
            bfVar.ap = this.ap;
            bfVar.at = this.at;
            bfVar.ah = this.ah;
            bfVar.ai = this.ai;
            bfVar.aw = this.aw;
            bfVar.am = this.am;
            bfVar.ae = this.ae;
            bfVar.as = this.as;
            bfVar.az = this.az;
            bfVar.ax = this.ax;
            bfVar.af = this.af;
            bfVar.au = this.au;
            bfVar.av = this.av;
            bfVar.ay = this.ay;
            bfVar.ag = this.ag;
            bfVar.ar = this.ar;
            bfVar.bp = this.bp;
            bfVar.ad = this.ad;
            bfVar.ab = this.ab;
            bfVar.bm = this.bm;
            bfVar.bh = this.bh;
            bfVar.bt = this.bt;
            bfVar.br = this.br;
            bfVar.by = this.by;
            bfVar.bx = this.bx;
            bfVar.an = new int[bfVar.aj];
        } else {
            bfVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = this.ac[i5] + i;
                i8 = this.aq[i5] + i3;
                i9 = -957207953 & i7;
                i10 = -655536061 & i8;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (585380934 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                bfVar.an[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (-1074052176 - i9))) >> 7) * i10) + ((-784895567 - i10) * i11)) >> 7) + this.an[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = ((-this.an[i5]) << 16) / (this.bl * -2098630381);
                if (i7 < i4) {
                    i8 = this.ac[i5] + i;
                    i9 = this.aq[i5] + i3;
                    i10 = 1224969307 & i8;
                    i11 = -1334524963 & i9;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (1865468541 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    bfVar.an[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (128 - i10))) >> 7) * i11) + ((1497367639 - i11) * i12)) >> 7) - i2)) / i4) + this.an[i5];
                }
            }
        }
        bfVar.ax();
        return bfVar;
    }

    public bf bs(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        af();
        int i5 = this.bo + i;
        int i6 = this.bz + i;
        int i7 = this.bj + i3;
        int i8 = this.bq + i3;
        if (i5 < 0 || ((1277402986 + i6) >> 7) >= iArr.length || i7 < 0 || ((i8 + cj.ak) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 - 1714314385) >> 7;
        i7 >>= 7;
        i8 = (i8 - 1984970391) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bf bfVar;
        if (z) {
            bfVar = new bf();
            bfVar.aj = this.aj;
            bfVar.ao = this.ao;
            bfVar.al = this.al;
            bfVar.ac = this.ac;
            bfVar.aq = this.aq;
            bfVar.aa = this.aa;
            bfVar.ak = this.ak;
            bfVar.ap = this.ap;
            bfVar.at = this.at;
            bfVar.ah = this.ah;
            bfVar.ai = this.ai;
            bfVar.aw = this.aw;
            bfVar.am = this.am;
            bfVar.ae = this.ae;
            bfVar.as = this.as;
            bfVar.az = this.az;
            bfVar.ax = this.ax;
            bfVar.af = this.af;
            bfVar.au = this.au;
            bfVar.av = this.av;
            bfVar.ay = this.ay;
            bfVar.ag = this.ag;
            bfVar.ar = this.ar;
            bfVar.bp = this.bp;
            bfVar.ad = this.ad;
            bfVar.ab = this.ab;
            bfVar.bm = this.bm;
            bfVar.bh = this.bh;
            bfVar.bt = this.bt;
            bfVar.br = this.br;
            bfVar.by = this.by;
            bfVar.bx = this.bx;
            bfVar.an = new int[bfVar.aj];
        } else {
            bfVar = this;
        }
        int i9;
        int i10;
        int i11;
        if (i4 == 0) {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = this.ac[i5] + i;
                i8 = this.aq[i5] + i3;
                i9 = i7 & 127;
                i10 = -611840633 & i8;
                i7 >>= 7;
                i8 >>= 7;
                i11 = ((iArr[i7][i8] * (128 - i9)) + (iArr[i7 + 1][i8] * i9)) >> 7;
                bfVar.an[i5] = (((((((iArr[i7 + 1][i8 + 1] * i9) + (iArr[i7][i8 + 1] * (128 - i9))) >> 7) * i10) + ((128 - i10) * i11)) >> 7) + this.an[i5]) - i2;
            }
        } else {
            for (i5 = 0; i5 < bfVar.aj; i5++) {
                i7 = ((-this.an[i5]) << 16) / (this.bl * -1699410295);
                if (i7 < i4) {
                    i8 = this.ac[i5] + i;
                    i9 = this.aq[i5] + i3;
                    i10 = i8 & 127;
                    i11 = i9 & 127;
                    i8 >>= 7;
                    i9 >>= 7;
                    int i12 = ((iArr[i8][i9] * (1577303391 - i10)) + (iArr[i8 + 1][i9] * i10)) >> 7;
                    i7 = i4 - i7;
                    bfVar.an[i5] = ((i7 * (((((((iArr[i8 + 1][i9 + 1] * i10) + (iArr[i8][i9 + 1] * (701100095 - i10))) >> 7) * i11) + ((128 - i11) * i12)) >> 7) - i2)) / i4) + this.an[i5];
                }
            }
        }
        bfVar.ax();
        return bfVar;
    }

    void ak() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.bm != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.bm[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.bt = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.bt[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.aj; i2++) {
                i = this.bm[i2];
                int[] iArr2 = this.bt[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.bh != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.ao; i2++) {
                i3 = this.bh[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.br = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.br[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ao) {
                i2 = this.bh[i4];
                int[] iArr3 = this.br[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void bq() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.bm != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.bm[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.bt = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.bt[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.aj; i2++) {
                i = this.bm[i2];
                int[] iArr2 = this.bt[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.bh != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.ao; i2++) {
                i3 = this.bh[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.br = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.br[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ao) {
                i2 = this.bh[i4];
                int[] iArr3 = this.br[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    void bz() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.bm != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.bm[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.bt = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.bt[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.aj; i2++) {
                i = this.bm[i2];
                int[] iArr2 = this.bt[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.bh != null) {
            iArr = new int[bq.ah];
            i = 0;
            for (i2 = 0; i2 < this.ao; i2++) {
                i3 = this.bh[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.br = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.br[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.ao) {
                i2 = this.bh[i4];
                int[] iArr3 = this.br[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    public void ap() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ac[i];
            this.ac[i] = this.aq[i];
            this.aq[i] = -i2;
        }
        ax();
    }

    public void ba() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ac[i];
            this.ac[i] = this.aq[i];
            this.aq[i] = -i2;
        }
        ax();
    }

    public void bj() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ac[i];
            this.ac[i] = this.aq[i];
            this.aq[i] = -i2;
        }
        ax();
    }

    public void at() {
        for (int i = 0; i < this.aj; i++) {
            this.ac[i] = -this.ac[i];
            this.aq[i] = -this.aq[i];
        }
        ax();
    }

    public void ah() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.ac[i];
            this.ac[i] = -i2;
        }
        ax();
    }

    public void be() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.ac[i];
            this.ac[i] = -i2;
        }
        ax();
    }

    public void bv() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.ac[i];
            this.ac[i] = -i2;
        }
        ax();
    }

    public void bw() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.ac[i];
            this.ac[i] = -i2;
        }
        ax();
    }

    public void ai(int i) {
        int i2 = bw[i];
        int i3 = bn[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = ((this.aq[i4] * i2) + (this.ac[i4] * i3)) >> 16;
            this.aq[i4] = ((this.aq[i4] * i3) - (this.ac[i4] * i2)) >> 16;
            this.ac[i4] = i5;
        }
        ax();
    }

    public void bc(int i) {
        int i2 = bw[i];
        int i3 = bn[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = ((this.aq[i4] * i2) + (this.ac[i4] * i3)) >> 16;
            this.aq[i4] = ((this.aq[i4] * i3) - (this.ac[i4] * i2)) >> 16;
            this.ac[i4] = i5;
        }
        ax();
    }

    public void bg(int i) {
        int i2 = bw[i];
        int i3 = bn[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = ((this.aq[i4] * i2) + (this.ac[i4] * i3)) >> 16;
            this.aq[i4] = ((this.aq[i4] * i3) - (this.ac[i4] * i2)) >> 16;
            this.ac[i4] = i5;
        }
        ax();
    }

    public void bn(int i) {
        int i2 = bw[i];
        int i3 = bn[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = ((this.aq[i4] * i2) + (this.ac[i4] * i3)) >> 16;
            this.aq[i4] = ((this.aq[i4] * i3) - (this.ac[i4] * i2)) >> 16;
            this.ac[i4] = i5;
        }
        ax();
    }

    public void aw(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ac;
            iArr[i4] = iArr[i4] + i;
            iArr = this.an;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.aq;
            iArr[i4] = iArr[i4] + i3;
        }
        ax();
    }

    public void am(short s, short s2) {
        for (int i = 0; i < this.ao; i++) {
            if (this.am[i] == s) {
                this.am[i] = s2;
            }
        }
    }

    public void bk(short s, short s2) {
        for (int i = 0; i < this.ao; i++) {
            if (this.am[i] == s) {
                this.am[i] = s2;
            }
        }
    }

    public void ae(short s, short s2) {
        if (this.ae != null) {
            for (int i = 0; i < this.ao; i++) {
                if (this.ae[i] == s) {
                    this.ae[i] = s2;
                }
            }
        }
    }

    public void bf(short s, short s2) {
        if (this.ae != null) {
            for (int i = 0; i < this.ao; i++) {
                if (this.ae[i] == s) {
                    this.ae[i] = s2;
                }
            }
        }
    }

    public void bl(short s, short s2) {
        if (this.ae != null) {
            for (int i = 0; i < this.ao; i++) {
                if (this.ae[i] == s) {
                    this.ae[i] = s2;
                }
            }
        }
    }

    public void cb(short s, short s2) {
        if (this.ae != null) {
            for (int i = 0; i < this.ao; i++) {
                if (this.ae[i] == s) {
                    this.ae[i] = s2;
                }
            }
        }
    }

    public void cy(short s, short s2) {
        if (this.ae != null) {
            for (int i = 0; i < this.ao; i++) {
                if (this.ae[i] == s) {
                    this.ae[i] = s2;
                }
            }
        }
    }

    public void as() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.aj; i++) {
            this.aq[i] = -this.aq[i];
        }
        while (i2 < this.ao) {
            i = this.aa[i2];
            this.aa[i2] = this.ap[i2];
            this.ap[i2] = i;
            i2++;
        }
        ax();
    }

    public void cl() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.aj; i++) {
            this.aq[i] = -this.aq[i];
        }
        while (i2 < this.ao) {
            i = this.aa[i2];
            this.aa[i2] = this.ap[i2];
            this.ap[i2] = i;
            i2++;
        }
        ax();
    }

    public void co() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.aj; i++) {
            this.aq[i] = -this.aq[i];
        }
        while (i2 < this.ao) {
            i = this.aa[i2];
            this.aa[i2] = this.ap[i2];
            this.ap[i2] = i;
            i2++;
        }
        ax();
    }

    public void al(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            this.ac[i4] = (this.ac[i4] * i) / cj.ak;
            this.an[i4] = (this.an[i4] * i2) / cj.ak;
            this.aq[i4] = (this.aq[i4] * i3) / cj.ak;
        }
        ax();
    }

    public void az() {
        if (this.bu == null) {
            int i;
            this.bu = new co[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.bu[i] = new co();
            }
            for (i = 0; i < this.ao; i++) {
                byte b;
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                int i5 = this.ac[i3] - this.ac[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aq[i3] - this.aq[i2];
                int i8 = this.ac[i4] - this.ac[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aq[i4] - this.aq[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 8192 && i7 <= 8192 && i6 >= -8192 && i11 >= -8192 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * bq.ah) / i5;
                i11 = (i11 * bq.ah) / i5;
                i7 = (i7 * bq.ah) / i5;
                if (this.at == null) {
                    b = (byte) 0;
                } else {
                    b = this.at[i];
                }
                if (b == (byte) 0) {
                    co coVar = this.bu[i2];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i3];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i4];
                    coVar.aj = (i6 * 688852983) + coVar.aj;
                    coVar.ac = (i11 * -66891799) + coVar.ac;
                    coVar.an = (i7 * 952164561) + coVar.an;
                    coVar.aq -= 1011640167;
                } else if (b == (byte) 1) {
                    if (this.bb == null) {
                        this.bb = new cf[this.ao];
                    }
                    cf[] cfVarArr = this.bb;
                    cf cfVar = new cf();
                    cfVarArr[i] = cfVar;
                    cfVar.aj = 2051713023 * i6;
                    cfVar.ac = 382016449 * i11;
                    cfVar.an = 1766807197 * i7;
                }
            }
        }
    }

    public void cc() {
        if (this.bu == null) {
            int i;
            this.bu = new co[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.bu[i] = new co();
            }
            for (i = 0; i < this.ao; i++) {
                byte b;
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                int i5 = this.ac[i3] - this.ac[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aq[i3] - this.aq[i2];
                int i8 = this.ac[i4] - this.ac[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aq[i4] - this.aq[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 8192 && i7 <= 8192 && i6 >= -8192 && i11 >= -8192 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * bq.ah) / i5;
                i11 = (i11 * bq.ah) / i5;
                i7 = (i7 * bq.ah) / i5;
                if (this.at == null) {
                    b = (byte) 0;
                } else {
                    b = this.at[i];
                }
                if (b == (byte) 0) {
                    co coVar = this.bu[i2];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i3];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i4];
                    coVar.aj = (i6 * 688852983) + coVar.aj;
                    coVar.ac = (i11 * -66891799) + coVar.ac;
                    coVar.an = (i7 * 952164561) + coVar.an;
                    coVar.aq -= 1011640167;
                } else if (b == (byte) 1) {
                    if (this.bb == null) {
                        this.bb = new cf[this.ao];
                    }
                    cf[] cfVarArr = this.bb;
                    cf cfVar = new cf();
                    cfVarArr[i] = cfVar;
                    cfVar.aj = 2051713023 * i6;
                    cfVar.ac = 382016449 * i11;
                    cfVar.an = 1766807197 * i7;
                }
            }
        }
    }

    public void cf() {
        if (this.bu == null) {
            int i;
            this.bu = new co[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.bu[i] = new co();
            }
            for (i = 0; i < this.ao; i++) {
                byte b;
                int i2 = this.aa[i];
                int i3 = this.ak[i];
                int i4 = this.ap[i];
                int i5 = this.ac[i3] - this.ac[i2];
                int i6 = this.an[i3] - this.an[i2];
                int i7 = this.aq[i3] - this.aq[i2];
                int i8 = this.ac[i4] - this.ac[i2];
                int i9 = this.an[i4] - this.an[i2];
                int i10 = this.aq[i4] - this.aq[i2];
                i5 = (i5 * i9) - (i6 * i8);
                i6 = (i6 * i10) - (i9 * i7);
                int i11 = (i7 * i8) - (i10 * i5);
                i7 = i5;
                while (true) {
                    if (i6 <= 8192 && i11 <= 8192 && i7 <= 8192 && i6 >= -8192 && i11 >= -8192 && i7 >= -8192) {
                        break;
                    }
                    i6 >>= 1;
                    i11 >>= 1;
                    i7 >>= 1;
                }
                i5 = (int) Math.sqrt((double) (((i6 * i6) + (i11 * i11)) + (i7 * i7)));
                if (i5 <= 0) {
                    i5 = 1;
                }
                i6 = (i6 * bq.ah) / i5;
                i11 = (i11 * bq.ah) / i5;
                i7 = (i7 * bq.ah) / i5;
                if (this.at == null) {
                    b = (byte) 0;
                } else {
                    b = this.at[i];
                }
                if (b == (byte) 0) {
                    co coVar = this.bu[i2];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i3];
                    coVar.aj += 688852983 * i6;
                    coVar.ac += -66891799 * i11;
                    coVar.an += 952164561 * i7;
                    coVar.aq -= 1011640167;
                    coVar = this.bu[i4];
                    coVar.aj = (i6 * 688852983) + coVar.aj;
                    coVar.ac = (i11 * -66891799) + coVar.ac;
                    coVar.an = (i7 * 952164561) + coVar.an;
                    coVar.aq -= 1011640167;
                } else if (b == (byte) 1) {
                    if (this.bb == null) {
                        this.bb = new cf[this.ao];
                    }
                    cf[] cfVarArr = this.bb;
                    cf cfVar = new cf();
                    cfVarArr[i] = cfVar;
                    cfVar.aj = 2051713023 * i6;
                    cfVar.ac = 382016449 * i11;
                    cfVar.an = 1766807197 * i7;
                }
            }
        }
    }

    void ax() {
        this.bu = null;
        this.bd = null;
        this.bb = null;
        this.bi = false;
    }

    void ca() {
        this.bu = null;
        this.bd = null;
        this.bb = null;
        this.bi = false;
    }

    void cp() {
        this.bu = null;
        this.bd = null;
        this.bb = null;
        this.bi = false;
    }

    void cr() {
        this.bu = null;
        this.bd = null;
        this.bb = null;
        this.bi = false;
    }

    void af() {
        int i = 0;
        if (!this.bi) {
            this.bl = 0;
            this.bs = 0;
            this.bo = 999999;
            this.bz = -999999;
            this.bq = -99999;
            this.bj = 99999;
            while (i < this.aj) {
                int i2 = this.ac[i];
                int i3 = this.an[i];
                int i4 = this.aq[i];
                if (i2 < this.bo) {
                    this.bo = i2;
                }
                if (i2 > this.bz) {
                    this.bz = i2;
                }
                if (i4 < this.bj) {
                    this.bj = i4;
                }
                if (i4 > this.bq) {
                    this.bq = i4;
                }
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bs) {
                    this.bs = i3;
                }
                i++;
            }
            this.bi = true;
        }
    }

    void ck() {
        int i = 0;
        if (!this.bi) {
            this.bl = 0;
            this.bs = 0;
            this.bo = 999999;
            this.bz = -999999;
            this.bq = -99999;
            this.bj = 99999;
            while (i < this.aj) {
                int i2 = this.ac[i];
                int i3 = this.an[i];
                int i4 = this.aq[i];
                if (i2 < this.bo) {
                    this.bo = i2;
                }
                if (i2 > this.bz) {
                    this.bz = i2;
                }
                if (i4 < this.bj) {
                    this.bj = i4;
                }
                if (i4 > this.bq) {
                    this.bq = i4;
                }
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bs) {
                    this.bs = i3;
                }
                i++;
            }
            this.bi = true;
        }
    }

    void cm() {
        int i = 0;
        if (!this.bi) {
            this.bl = 0;
            this.bs = 0;
            this.bo = 999999;
            this.bz = -999999;
            this.bq = -99999;
            this.bj = 99999;
            while (i < this.aj) {
                int i2 = this.ac[i];
                int i3 = this.an[i];
                int i4 = this.aq[i];
                if (i2 < this.bo) {
                    this.bo = i2;
                }
                if (i2 > this.bz) {
                    this.bz = i2;
                }
                if (i4 < this.bj) {
                    this.bj = i4;
                }
                if (i4 > this.bq) {
                    this.bq = i4;
                }
                if ((-i3) > this.bl * -2098630381) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bs) {
                    this.bs = i3;
                }
                i++;
            }
            this.bi = true;
        }
    }

    void ct() {
        int i = 0;
        if (!this.bi) {
            this.bl = 0;
            this.bs = 0;
            this.bo = 1538797360;
            this.bz = 767198040;
            this.bq = -99999;
            this.bj = -617198695;
            while (i < this.aj) {
                int i2 = this.ac[i];
                int i3 = this.an[i];
                int i4 = this.aq[i];
                if (i2 < this.bo) {
                    this.bo = i2;
                }
                if (i2 > this.bz) {
                    this.bz = i2;
                }
                if (i4 < this.bj) {
                    this.bj = i4;
                }
                if (i4 > this.bq) {
                    this.bq = i4;
                }
                if ((-i3) > this.bl * -1066983409) {
                    this.bl = (-i3) * -2041577189;
                }
                if (i3 > this.bs) {
                    this.bs = i3;
                }
                i++;
            }
            this.bi = true;
        }
    }

    static void au(bf bfVar, bf bfVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bfVar.af();
        bfVar.az();
        bfVar2.af();
        bfVar2.az();
        be++;
        int i5 = 0;
        int[] iArr = bfVar2.ac;
        int i6 = bfVar2.aj;
        for (i4 = 0; i4 < bfVar.aj; i4++) {
            co coVar = bfVar.bu[i4];
            if (coVar.aq * 244136873 != 0) {
                int i7 = bfVar.an[i4] - i2;
                if (i7 <= bfVar2.bs) {
                    int i8 = bfVar.ac[i4] - i;
                    if (i8 >= bfVar2.bo && i8 <= bfVar2.bz) {
                        int i9 = bfVar.aq[i4] - i3;
                        if (i9 >= bfVar2.bj) {
                            if (i9 <= bfVar2.bq) {
                                int i10 = 0;
                                int i11 = i5;
                                while (i10 < i6) {
                                    co coVar2 = bfVar2.bu[i10];
                                    if (i8 == iArr[i10] && i9 == bfVar2.aq[i10] && i7 == bfVar2.an[i10] && coVar2.aq * 244136873 != 0) {
                                        if (bfVar.bd == null) {
                                            bfVar.bd = new co[bfVar.aj];
                                        }
                                        if (bfVar2.bd == null) {
                                            bfVar2.bd = new co[i6];
                                        }
                                        co coVar3 = bfVar.bd[i4];
                                        if (coVar3 == null) {
                                            co[] coVarArr = bfVar.bd;
                                            coVar3 = new co(coVar);
                                            coVarArr[i4] = coVar3;
                                        }
                                        co coVar4 = bfVar2.bd[i10];
                                        if (coVar4 == null) {
                                            co[] coVarArr2 = bfVar2.bd;
                                            coVar4 = new co(coVar2);
                                            coVarArr2[i10] = coVar4;
                                        }
                                        coVar3.aj += coVar2.aj * 1;
                                        coVar3.ac += coVar2.ac * 1;
                                        coVar3.an += coVar2.an * 1;
                                        coVar3.aq = (coVar2.aq * 1) + coVar3.aq;
                                        r3.aj += coVar.aj * 1;
                                        r3.ac += coVar.ac * 1;
                                        r3.an += coVar.an * 1;
                                        r3.aq += coVar.aq * 1;
                                        i5 = i11 + 1;
                                        ba[i4] = be;
                                        bv[i10] = be;
                                    } else {
                                        i5 = i11;
                                    }
                                    i10++;
                                    i11 = i5;
                                }
                                i5 = i11;
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bfVar.ao) {
                if (ba[bfVar.aa[i4]] == be && ba[bfVar.ak[i4]] == be && ba[bfVar.ap[i4]] == be) {
                    if (bfVar.at == null) {
                        bfVar.at = new byte[bfVar.ao];
                    }
                    bfVar.at[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bfVar2.ao) {
                if (bv[bfVar2.aa[i4]] == be && bv[bfVar2.ak[i4]] == be && bv[bfVar2.ap[i4]] == be) {
                    if (bfVar2.at == null) {
                        bfVar2.at = new byte[bfVar2.ao];
                    }
                    bfVar2.at[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void ce(bf bfVar, bf bfVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bfVar.af();
        bfVar.az();
        bfVar2.af();
        bfVar2.az();
        be++;
        int i5 = 0;
        int[] iArr = bfVar2.ac;
        int i6 = bfVar2.aj;
        for (i4 = 0; i4 < bfVar.aj; i4++) {
            co coVar = bfVar.bu[i4];
            if (coVar.aq * 244136873 != 0) {
                int i7 = bfVar.an[i4] - i2;
                if (i7 <= bfVar2.bs) {
                    int i8 = bfVar.ac[i4] - i;
                    if (i8 >= bfVar2.bo && i8 <= bfVar2.bz) {
                        int i9 = bfVar.aq[i4] - i3;
                        if (i9 >= bfVar2.bj) {
                            if (i9 <= bfVar2.bq) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    co coVar2 = bfVar2.bu[i10];
                                    if (i8 == iArr[i10] && i9 == bfVar2.aq[i10] && i7 == bfVar2.an[i10] && coVar2.aq * 244136873 != 0) {
                                        if (bfVar.bd == null) {
                                            bfVar.bd = new co[bfVar.aj];
                                        }
                                        if (bfVar2.bd == null) {
                                            bfVar2.bd = new co[i6];
                                        }
                                        co coVar3 = bfVar.bd[i4];
                                        if (coVar3 == null) {
                                            co[] coVarArr = bfVar.bd;
                                            coVar3 = new co(coVar);
                                            coVarArr[i4] = coVar3;
                                        }
                                        co coVar4 = bfVar2.bd[i10];
                                        if (coVar4 == null) {
                                            co[] coVarArr2 = bfVar2.bd;
                                            coVar4 = new co(coVar2);
                                            coVarArr2[i10] = coVar4;
                                        }
                                        coVar3.aj += coVar2.aj * 1;
                                        coVar3.ac += coVar2.ac * 1;
                                        coVar3.an += coVar2.an * 1;
                                        coVar3.aq = (coVar2.aq * 1) + coVar3.aq;
                                        r3.aj += coVar.aj * 1;
                                        r3.ac += coVar.ac * 1;
                                        r3.an += coVar.an * 1;
                                        r3.aq += coVar.aq * 1;
                                        i5++;
                                        ba[i4] = be;
                                        bv[i10] = be;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bfVar.ao) {
                if (ba[bfVar.aa[i4]] == be && ba[bfVar.ak[i4]] == be && ba[bfVar.ap[i4]] == be) {
                    if (bfVar.at == null) {
                        bfVar.at = new byte[bfVar.ao];
                    }
                    bfVar.at[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bfVar2.ao) {
                if (bv[bfVar2.aa[i4]] == be && bv[bfVar2.ak[i4]] == be && bv[bfVar2.ap[i4]] == be) {
                    if (bfVar2.at == null) {
                        bfVar2.at = new byte[bfVar2.ao];
                    }
                    bfVar2.at[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void ch(bf bfVar, bf bfVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bfVar.af();
        bfVar.az();
        bfVar2.af();
        bfVar2.az();
        be++;
        int i5 = 0;
        int[] iArr = bfVar2.ac;
        int i6 = bfVar2.aj;
        for (i4 = 0; i4 < bfVar.aj; i4++) {
            co coVar = bfVar.bu[i4];
            if (coVar.aq * 244136873 != 0) {
                int i7 = bfVar.an[i4] - i2;
                if (i7 <= bfVar2.bs) {
                    int i8 = bfVar.ac[i4] - i;
                    if (i8 >= bfVar2.bo && i8 <= bfVar2.bz) {
                        int i9 = bfVar.aq[i4] - i3;
                        if (i9 >= bfVar2.bj) {
                            if (i9 <= bfVar2.bq) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    co coVar2 = bfVar2.bu[i10];
                                    if (i8 == iArr[i10] && i9 == bfVar2.aq[i10] && i7 == bfVar2.an[i10] && coVar2.aq * 244136873 != 0) {
                                        if (bfVar.bd == null) {
                                            bfVar.bd = new co[bfVar.aj];
                                        }
                                        if (bfVar2.bd == null) {
                                            bfVar2.bd = new co[i6];
                                        }
                                        co coVar3 = bfVar.bd[i4];
                                        if (coVar3 == null) {
                                            co[] coVarArr = bfVar.bd;
                                            coVar3 = new co(coVar);
                                            coVarArr[i4] = coVar3;
                                        }
                                        co coVar4 = bfVar2.bd[i10];
                                        if (coVar4 == null) {
                                            co[] coVarArr2 = bfVar2.bd;
                                            coVar4 = new co(coVar2);
                                            coVarArr2[i10] = coVar4;
                                        }
                                        coVar3.aj += coVar2.aj * 1;
                                        coVar3.ac += coVar2.ac * 1;
                                        coVar3.an += coVar2.an * 1;
                                        coVar3.aq = (coVar2.aq * 1) + coVar3.aq;
                                        r3.aj += coVar.aj * 1;
                                        r3.ac += coVar.ac * 1;
                                        r3.an += coVar.an * 1;
                                        r3.aq += coVar.aq * 1;
                                        i5++;
                                        ba[i4] = be;
                                        bv[i10] = be;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bfVar.ao) {
                if (ba[bfVar.aa[i4]] == be && ba[bfVar.ak[i4]] == be && ba[bfVar.ap[i4]] == be) {
                    if (bfVar.at == null) {
                        bfVar.at = new byte[bfVar.ao];
                    }
                    bfVar.at[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bfVar2.ao) {
                if (bv[bfVar2.aa[i4]] == be && bv[bfVar2.ak[i4]] == be && bv[bfVar2.ap[i4]] == be) {
                    if (bfVar2.at == null) {
                        bfVar2.at = new byte[bfVar2.ao];
                    }
                    bfVar2.at[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static void ci(bf bfVar, bf bfVar2, int i, int i2, int i3, boolean z) {
        int i4;
        bfVar.af();
        bfVar.az();
        bfVar2.af();
        bfVar2.az();
        be++;
        int i5 = 0;
        int[] iArr = bfVar2.ac;
        int i6 = bfVar2.aj;
        for (i4 = 0; i4 < bfVar.aj; i4++) {
            co coVar = bfVar.bu[i4];
            if (coVar.aq * 244136873 != 0) {
                int i7 = bfVar.an[i4] - i2;
                if (i7 <= bfVar2.bs) {
                    int i8 = bfVar.ac[i4] - i;
                    if (i8 >= bfVar2.bo && i8 <= bfVar2.bz) {
                        int i9 = bfVar.aq[i4] - i3;
                        if (i9 >= bfVar2.bj) {
                            if (i9 <= bfVar2.bq) {
                                int i10 = 0;
                                while (i10 < i6) {
                                    co coVar2 = bfVar2.bu[i10];
                                    if (i8 == iArr[i10] && i9 == bfVar2.aq[i10] && i7 == bfVar2.an[i10] && coVar2.aq * 244136873 != 0) {
                                        if (bfVar.bd == null) {
                                            bfVar.bd = new co[bfVar.aj];
                                        }
                                        if (bfVar2.bd == null) {
                                            bfVar2.bd = new co[i6];
                                        }
                                        co coVar3 = bfVar.bd[i4];
                                        if (coVar3 == null) {
                                            co[] coVarArr = bfVar.bd;
                                            coVar3 = new co(coVar);
                                            coVarArr[i4] = coVar3;
                                        }
                                        co coVar4 = bfVar2.bd[i10];
                                        if (coVar4 == null) {
                                            co[] coVarArr2 = bfVar2.bd;
                                            coVar4 = new co(coVar2);
                                            coVarArr2[i10] = coVar4;
                                        }
                                        coVar3.aj += coVar2.aj * 1;
                                        coVar3.ac += coVar2.ac * 1;
                                        coVar3.an += coVar2.an * 1;
                                        coVar3.aq = (coVar2.aq * 1) + coVar3.aq;
                                        r3.aj += coVar.aj * 1;
                                        r3.ac += coVar.ac * 1;
                                        r3.an += coVar.an * 1;
                                        r3.aq += coVar.aq * 1;
                                        i5++;
                                        ba[i4] = be;
                                        bv[i10] = be;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 >= 3 && z) {
            i4 = 0;
            while (i4 < bfVar.ao) {
                if (ba[bfVar.aa[i4]] == be && ba[bfVar.ak[i4]] == be && ba[bfVar.ap[i4]] == be) {
                    if (bfVar.at == null) {
                        bfVar.at = new byte[bfVar.ao];
                    }
                    bfVar.at[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < bfVar2.ao) {
                if (bv[bfVar2.aa[i4]] == be && bv[bfVar2.ak[i4]] == be && bv[bfVar2.ap[i4]] == be) {
                    if (bfVar2.at == null) {
                        bfVar2.at = new byte[bfVar2.ao];
                    }
                    bfVar2.at[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    public final ct av(int i, int i2, int i3, int i4, int i5) {
        int i6;
        az();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        ct ctVar = new ct();
        ctVar.am = new int[this.ao];
        ctVar.ae = new int[this.ao];
        ctVar.as = new int[this.ao];
        if (this.al > 0 && this.aw != null) {
            int i7;
            int[] iArr = new int[this.al];
            for (i6 = 0; i6 < this.ao; i6++) {
                if (this.aw[i6] != (byte) -1) {
                    i7 = this.aw[i6] & 255;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            ctVar.av = 0;
            i6 = 0;
            while (i6 < this.al) {
                if (iArr[i6] > 0 && this.az[i6] == (byte) 0) {
                    ctVar.av++;
                }
                i6++;
            }
            ctVar.ay = new int[ctVar.av];
            ctVar.ag = new int[ctVar.av];
            ctVar.ar = new int[ctVar.av];
            i7 = 0;
            i6 = 0;
            while (i6 < this.al) {
                if (iArr[i6] <= 0 || this.az[i6] != (byte) 0) {
                    iArr[i6] = -1;
                } else {
                    ctVar.ay[i7] = this.ax[i6] & 65535;
                    ctVar.ag[i7] = this.af[i6] & 65535;
                    ctVar.ar[i7] = this.au[i6] & 65535;
                    int i8 = i7 + 1;
                    iArr[i6] = i7;
                    i7 = i8;
                }
                i6++;
            }
            ctVar.ax = new byte[this.ao];
            for (i6 = 0; i6 < this.ao; i6++) {
                if (this.aw[i6] != (byte) -1) {
                    ctVar.ax[i6] = (byte) iArr[this.aw[i6] & 255];
                } else {
                    ctVar.ax[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.ao) {
            byte b;
            byte b2;
            short s;
            if (this.at == null) {
                b = (byte) 0;
            } else {
                b = this.at[i6];
            }
            if (this.ai == null) {
                b2 = (byte) 0;
            } else {
                b2 = this.ai[i6];
            }
            if (this.ae == null) {
                s = (short) -1;
            } else {
                s = this.ae[i6];
            }
            if (b2 == (byte) -2) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            co coVar;
            cf cfVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    i8 = 65535 & this.am[i6];
                    if (this.bd == null || this.bd[this.aa[i6]] == null) {
                        coVar = this.bu[this.aa[i6]];
                    } else {
                        coVar = this.bd[this.aa[i6]];
                    }
                    ctVar.am[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                    if (this.bd == null || this.bd[this.ak[i6]] == null) {
                        coVar = this.bu[this.ak[i6]];
                    } else {
                        coVar = this.bd[this.ak[i6]];
                    }
                    ctVar.ae[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                    if (this.bd == null || this.bd[this.ap[i6]] == null) {
                        coVar = this.bu[this.ap[i6]];
                    } else {
                        coVar = this.bd[this.ap[i6]];
                    }
                    ctVar.as[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    cfVar = this.bb[i6];
                    ctVar.am[i6] = bf.ay(this.am[i6] & 65535, ((((cfVar.an * 62513077) * i5) + (((cfVar.aj * -143304705) * i3) + ((cfVar.ac * -1182731199) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    ctVar.as[i6] = -1;
                } else if (b == (byte) 3) {
                    ctVar.am[i6] = cj.ak;
                    ctVar.as[i6] = -1;
                } else {
                    ctVar.as[i6] = -2;
                }
            } else if (b == (byte) 0) {
                if (this.bd == null || this.bd[this.aa[i6]] == null) {
                    coVar = this.bu[this.aa[i6]];
                } else {
                    coVar = this.bd[this.aa[i6]];
                }
                ctVar.am[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                if (this.bd == null || this.bd[this.ak[i6]] == null) {
                    coVar = this.bu[this.ak[i6]];
                } else {
                    coVar = this.bd[this.ak[i6]];
                }
                ctVar.ae[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                if (this.bd == null || this.bd[this.ap[i6]] == null) {
                    coVar = this.bu[this.ap[i6]];
                } else {
                    coVar = this.bd[this.ap[i6]];
                }
                ctVar.as[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
            } else if (b == (byte) 1) {
                cfVar = this.bb[i6];
                ctVar.am[i6] = bf.ag(((((cfVar.an * 62513077) * i5) + (((cfVar.aj * -143304705) * i3) + ((cfVar.ac * -1182731199) * i4))) / ((sqrt / 2) + sqrt)) + i);
                ctVar.as[i6] = -1;
            } else {
                ctVar.as[i6] = -2;
            }
            i6++;
        }
        ak();
        ctVar.ao = this.aj;
        ctVar.aa = this.ac;
        ctVar.ak = this.an;
        ctVar.ap = this.aq;
        ctVar.at = this.ao;
        ctVar.ah = this.aa;
        ctVar.ai = this.ak;
        ctVar.aw = this.ap;
        ctVar.al = this.ah;
        ctVar.az = this.ai;
        ctVar.au = this.as;
        ctVar.ad = this.bt;
        ctVar.ab = this.br;
        ctVar.bp = this.bm;
        ctVar.bm = this.bh;
        ctVar.af = this.ae;
        return ctVar;
    }

    public final ct cq(int i, int i2, int i3, int i4, int i5) {
        int i6;
        az();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        ct ctVar = new ct();
        ctVar.am = new int[this.ao];
        ctVar.ae = new int[this.ao];
        ctVar.as = new int[this.ao];
        if (this.al > 0 && this.aw != null) {
            int i7;
            int[] iArr = new int[this.al];
            for (i6 = 0; i6 < this.ao; i6++) {
                if (this.aw[i6] != (byte) -1) {
                    i7 = this.aw[i6] & 255;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            ctVar.av = 0;
            i6 = 0;
            while (i6 < this.al) {
                if (iArr[i6] > 0 && this.az[i6] == (byte) 0) {
                    ctVar.av++;
                }
                i6++;
            }
            ctVar.ay = new int[ctVar.av];
            ctVar.ag = new int[ctVar.av];
            ctVar.ar = new int[ctVar.av];
            i7 = 0;
            i6 = 0;
            while (i6 < this.al) {
                if (iArr[i6] <= 0 || this.az[i6] != (byte) 0) {
                    iArr[i6] = -1;
                } else {
                    ctVar.ay[i7] = this.ax[i6] & 65535;
                    ctVar.ag[i7] = this.af[i6] & 65535;
                    ctVar.ar[i7] = this.au[i6] & 65535;
                    int i8 = i7 + 1;
                    iArr[i6] = i7;
                    i7 = i8;
                }
                i6++;
            }
            ctVar.ax = new byte[this.ao];
            for (i6 = 0; i6 < this.ao; i6++) {
                if (this.aw[i6] != (byte) -1) {
                    ctVar.ax[i6] = (byte) iArr[this.aw[i6] & 255];
                } else {
                    ctVar.ax[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.ao) {
            byte b;
            byte b2;
            short s;
            if (this.at == null) {
                b = (byte) 0;
            } else {
                b = this.at[i6];
            }
            if (this.ai == null) {
                b2 = (byte) 0;
            } else {
                b2 = this.ai[i6];
            }
            if (this.ae == null) {
                s = (short) -1;
            } else {
                s = this.ae[i6];
            }
            if (b2 == (byte) -2) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            co coVar;
            cf cfVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    i8 = 65535 & this.am[i6];
                    if (this.bd == null || this.bd[this.aa[i6]] == null) {
                        coVar = this.bu[this.aa[i6]];
                    } else {
                        coVar = this.bd[this.aa[i6]];
                    }
                    ctVar.am[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                    if (this.bd == null || this.bd[this.ak[i6]] == null) {
                        coVar = this.bu[this.ak[i6]];
                    } else {
                        coVar = this.bd[this.ak[i6]];
                    }
                    ctVar.ae[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                    if (this.bd == null || this.bd[this.ap[i6]] == null) {
                        coVar = this.bu[this.ap[i6]];
                    } else {
                        coVar = this.bd[this.ap[i6]];
                    }
                    ctVar.as[i6] = bf.ay(i8, (((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    cfVar = this.bb[i6];
                    ctVar.am[i6] = bf.ay(this.am[i6] & 65535, ((((cfVar.an * 62513077) * i5) + (((cfVar.aj * -143304705) * i3) + ((cfVar.ac * -1182731199) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    ctVar.as[i6] = -1;
                } else if (b == (byte) 3) {
                    ctVar.am[i6] = cj.ak;
                    ctVar.as[i6] = -1;
                } else {
                    ctVar.as[i6] = -2;
                }
            } else if (b == (byte) 0) {
                if (this.bd == null || this.bd[this.aa[i6]] == null) {
                    coVar = this.bu[this.aa[i6]];
                } else {
                    coVar = this.bd[this.aa[i6]];
                }
                ctVar.am[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                if (this.bd == null || this.bd[this.ak[i6]] == null) {
                    coVar = this.bu[this.ak[i6]];
                } else {
                    coVar = this.bd[this.ak[i6]];
                }
                ctVar.ae[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
                if (this.bd == null || this.bd[this.ap[i6]] == null) {
                    coVar = this.bu[this.ap[i6]];
                } else {
                    coVar = this.bd[this.ap[i6]];
                }
                ctVar.as[i6] = bf.ag((((((coVar.aj * 1311924679) * i3) + ((coVar.ac * 264534105) * i4)) + ((coVar.an * 1933801521) * i5)) / ((coVar.aq * 244136873) * sqrt)) + i);
            } else if (b == (byte) 1) {
                cfVar = this.bb[i6];
                ctVar.am[i6] = bf.ag(((((cfVar.an * 62513077) * i5) + (((cfVar.aj * -143304705) * i3) + ((cfVar.ac * -1182731199) * i4))) / ((sqrt / 2) + sqrt)) + i);
                ctVar.as[i6] = -1;
            } else {
                ctVar.as[i6] = -2;
            }
            i6++;
        }
        ak();
        ctVar.ao = this.aj;
        ctVar.aa = this.ac;
        ctVar.ak = this.an;
        ctVar.ap = this.aq;
        ctVar.at = this.ao;
        ctVar.ah = this.aa;
        ctVar.ai = this.ak;
        ctVar.aw = this.ap;
        ctVar.al = this.ah;
        ctVar.az = this.ai;
        ctVar.au = this.as;
        ctVar.ad = this.bt;
        ctVar.ab = this.br;
        ctVar.bp = this.bm;
        ctVar.bm = this.bh;
        ctVar.af = this.ae;
        return ctVar;
    }

    static final int ay(int i, int i2) {
        int i3 = 126;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 < 2) {
            i3 = 2;
        } else if (i4 <= 126) {
            i3 = i4;
        }
        return i3 + (65408 & i);
    }

    static final int ag(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 126) {
            return 126;
        }
        return i;
    }

    static final int cu(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 1278910847) {
            return 584728937;
        }
        return i;
    }

    static final int cv(int i) {
        if (i < 2) {
            return 2;
        }
        if (i > 126) {
            return 126;
        }
        return i;
    }

    protected final ct ar() {
        return null;
    }

    protected final ct cg() {
        return null;
    }

    protected final ct cs() {
        return null;
    }
}
