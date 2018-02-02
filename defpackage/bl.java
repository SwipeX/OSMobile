package defpackage;

public abstract class bl {
    static final int ai = 390;
    static final int[] al = new int[bq.ai];
    public static final int[] am = new int[65536];
    static final int[] as = new int[cj.at];
    public static final int[] ax = new int[bq.ai];
    public static final int[] az = new int[bq.ai];
    static final int bn = 48;
    static int[] eh;
    boolean ab;
    boolean ad;
    int af;
    int ag;
    int ar;
    int au;
    int av;
    int ay;
    int bb;
    int bd;
    int bh;
    int bi;
    boolean bm;
    int[] bo;
    boolean bp;
    int br;
    int bs;
    int bt;
    int bu;
    int bx;
    int by;

    public abstract void ah();

    public abstract void ai();

    public abstract void aj(byte b);

    bl() {
        int i = 1;
        try {
            this.av = 0;
            this.ay = 0;
            this.ag = 0;
            this.ar = 0;
            this.ad = false;
            this.ab = false;
            this.bp = false;
            this.bm = true;
            this.bh = 0;
            this.bt = 71951872;
            this.bo = new int[1024];
            for (int i2 = 1; i2 < cj.at; i2++) {
                as[i2] = 32768 / i2;
            }
            while (i < bq.ai) {
                al[i] = 65536 / i;
                i++;
            }
            for (int i3 = 0; i3 < bq.ai; i3++) {
                az[i3] = (int) (Math.sin(((double) i3) * 0.0030679615d) * 65536.0d);
                ax[i3] = (int) (Math.cos(((double) i3) * 0.0030679615d) * 65536.0d);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bl.<init>(" + ')');
        }
    }

    public static final void bc(double d, int i, int i2) {
        double random = d + ((Math.random() * 0.03d) - 0.015d);
        int i3 = i * cj.ak;
        while (i < i2) {
            double d2 = 0.0078125d + (((double) (i >> 3)) / 64.0d);
            double d3 = 0.0625d + (((double) (i & 7)) / 8.0d);
            int i4 = 0;
            int i5 = i3;
            while (i4 < cj.ak) {
                double d4;
                double d5;
                double d6 = ((double) i4) / 128.0d;
                if (0.0d != d3) {
                    double d7;
                    if (d6 < 0.5d) {
                        d4 = (1.0d + d3) * d6;
                    } else {
                        d4 = (d3 + d6) - (d6 * d3);
                    }
                    d6 = (d6 * 2.0d) - d4;
                    d5 = 0.3333333333333333d + d2;
                    if (d5 > 1.0d) {
                        d5 -= 1.0d;
                    }
                    double d8 = d2 - 0.3333333333333333d;
                    if (d8 < 0.0d) {
                        d7 = d8 + 1.0d;
                    } else {
                        d7 = d8;
                    }
                    if (6.0d * d5 < 1.0d) {
                        d8 = (d5 * (6.0d * (d4 - d6))) + d6;
                    } else if (2.0d * d5 < 1.0d) {
                        d8 = d4;
                    } else if (3.0d * d5 < 2.0d) {
                        d8 = (((0.6666666666666666d - d5) * (d4 - d6)) * 6.0d) + d6;
                    } else {
                        d8 = d6;
                    }
                    d5 = 6.0d * d2 < 1.0d ? ((6.0d * (d4 - d6)) * d2) + d6 : 2.0d * d2 < 1.0d ? d4 : 3.0d * d2 < 2.0d ? (((d4 - d6) * (0.6666666666666666d - d2)) * 6.0d) + d6 : d6;
                    if (6.0d * d7 < 1.0d) {
                        d6 += ((d4 - d6) * 6.0d) * d7;
                        d4 = d5;
                        d5 = d8;
                    } else if (2.0d * d7 < 1.0d) {
                        d6 = d4;
                        d4 = d5;
                        d5 = d8;
                    } else if (3.0d * d7 < 2.0d) {
                        d6 += ((d4 - d6) * (0.6666666666666666d - d7)) * 6.0d;
                        d4 = d5;
                        d5 = d8;
                    } else {
                        d4 = d5;
                        d5 = d8;
                    }
                } else {
                    d4 = d6;
                    d5 = d6;
                }
                int i6 = ((int) (d6 * 256.0d)) + ((((int) (d4 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16));
                i6 = (i6 & -16777216) | (((((int) (Math.pow(((double) ((i6 >> 16) & 255)) / 256.0d, random) * 256.0d)) << 16) + (((int) (256.0d * Math.pow(((double) ((i6 >> 8) & 255)) / 256.0d, random))) << 8)) + ((int) (256.0d * Math.pow(((double) (i6 & 255)) / 256.0d, random))));
                if (i6 == 0) {
                    i6 = 1;
                }
                i3 = i5 + 1;
                am[i5] = i6;
                i4++;
                i5 = i3;
            }
            i++;
            i3 = i5;
        }
    }

    public static final void bg(double d, int i, int i2) {
        double random = d + ((Math.random() * 0.03d) - 0.015d);
        int i3 = i * cj.ak;
        while (i < i2) {
            double d2 = 0.0078125d + (((double) (i >> 3)) / 64.0d);
            double d3 = 0.0625d + (((double) (i & 7)) / 8.0d);
            int i4 = 0;
            int i5 = i3;
            while (i4 < cj.ak) {
                double d4;
                double d5;
                double d6;
                double d7 = ((double) i4) / 128.0d;
                if (0.0d != d3) {
                    double d8;
                    double d9;
                    if (d7 < 0.5d) {
                        d4 = (1.0d + d3) * d7;
                    } else {
                        d4 = (d3 + d7) - (d7 * d3);
                    }
                    d5 = (d7 * 2.0d) - d4;
                    d7 = 0.3333333333333333d + d2;
                    if (d7 > 1.0d) {
                        d7 -= 1.0d;
                    }
                    d6 = d2 - 0.3333333333333333d;
                    if (d6 < 0.0d) {
                        d8 = d6 + 1.0d;
                    } else {
                        d8 = d6;
                    }
                    if (6.0d * d7 < 1.0d) {
                        d9 = (d7 * (6.0d * (d4 - d5))) + d5;
                    } else if (2.0d * d7 < 1.0d) {
                        d9 = d4;
                    } else if (3.0d * d7 < 2.0d) {
                        d9 = (((0.6666666666666666d - d7) * (d4 - d5)) * 6.0d) + d5;
                    } else {
                        d9 = d5;
                    }
                    if (6.0d * d2 < 1.0d) {
                        d6 = ((6.0d * (d4 - d5)) * d2) + d5;
                    } else if (2.0d * d2 < 1.0d) {
                        d6 = d4;
                    } else if (3.0d * d2 < 2.0d) {
                        d6 = d5 + (((d4 - d5) * (0.6666666666666666d - d2)) * 6.0d);
                    } else {
                        d6 = d5;
                    }
                    if (6.0d * d8 < 1.0d) {
                        d7 = (((d4 - d5) * 6.0d) * d8) + d5;
                        d4 = d6;
                        d5 = d9;
                    } else if (2.0d * d8 < 1.0d) {
                        d7 = d4;
                        d5 = d9;
                        d4 = d6;
                    } else if (3.0d * d8 < 2.0d) {
                        d7 = (((d4 - d5) * (0.6666666666666666d - d8)) * 6.0d) + d5;
                        d4 = d6;
                        d5 = d9;
                    } else {
                        d7 = d5;
                        d4 = d6;
                        d5 = d9;
                    }
                } else {
                    d4 = d7;
                    d5 = d7;
                }
                int i6 = ((int) (d7 * 256.0d)) + ((((int) (d4 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16));
                d5 = ((double) ((i6 >> 8) & 255)) / 256.0d;
                d6 = ((double) (i6 & 255)) / 256.0d;
                d4 = Math.pow(((double) ((i6 >> 16) & 255)) / 256.0d, random);
                i3 = (int) (d4 * 256.0d);
                i6 = (i6 & -16777216) | (((i3 << 16) + (((int) (256.0d * Math.pow(d5, random))) << 8)) + ((int) (256.0d * Math.pow(d6, random))));
                if (i6 == 0) {
                    i6 = 1;
                }
                i3 = i5 + 1;
                am[i5] = i6;
                i4++;
                i5 = i3;
            }
            i++;
            i3 = i5;
        }
    }

    public static final void bn(double d, int i, int i2) {
        double random = d + ((Math.random() * 0.03d) - 0.015d);
        int i3 = i * cj.ak;
        while (i < i2) {
            double d2 = 0.0078125d + (((double) (i >> 3)) / 64.0d);
            double d3 = 0.0625d + (((double) (i & 7)) / 8.0d);
            int i4 = 0;
            int i5 = i3;
            while (i4 < cj.ak) {
                double d4;
                double d5;
                double d6 = ((double) i4) / 128.0d;
                if (0.0d != d3) {
                    double d7;
                    if (d6 < 0.5d) {
                        d4 = (1.0d + d3) * d6;
                    } else {
                        d4 = (d3 + d6) - (d6 * d3);
                    }
                    d6 = (d6 * 2.0d) - d4;
                    d5 = 0.3333333333333333d + d2;
                    if (d5 > 1.0d) {
                        d5 -= 1.0d;
                    }
                    double d8 = d2 - 0.3333333333333333d;
                    if (d8 < 0.0d) {
                        d7 = d8 + 1.0d;
                    } else {
                        d7 = d8;
                    }
                    if (6.0d * d5 < 1.0d) {
                        d8 = (d5 * (6.0d * (d4 - d6))) + d6;
                    } else if (2.0d * d5 < 1.0d) {
                        d8 = d4;
                    } else if (3.0d * d5 < 2.0d) {
                        d8 = (((0.6666666666666666d - d5) * (d4 - d6)) * 6.0d) + d6;
                    } else {
                        d8 = d6;
                    }
                    d5 = 6.0d * d2 < 1.0d ? ((6.0d * (d4 - d6)) * d2) + d6 : 2.0d * d2 < 1.0d ? d4 : 3.0d * d2 < 2.0d ? (((d4 - d6) * (0.6666666666666666d - d2)) * 6.0d) + d6 : d6;
                    if (6.0d * d7 < 1.0d) {
                        d4 = (((d4 - d6) * 6.0d) * d7) + d6;
                        d6 = d5;
                        d5 = d8;
                    } else if (2.0d * d7 < 1.0d) {
                        d6 = d5;
                        d5 = d8;
                    } else if (3.0d * d7 < 2.0d) {
                        d4 = (((d4 - d6) * (0.6666666666666666d - d7)) * 6.0d) + d6;
                        d6 = d5;
                        d5 = d8;
                    } else {
                        d4 = d6;
                        d6 = d5;
                        d5 = d8;
                    }
                } else {
                    d4 = d6;
                    d5 = d6;
                }
                int i6 = ((int) (d4 * 256.0d)) + ((((int) (d6 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16));
                i6 = (i6 & -16777216) | (((((int) (Math.pow(((double) ((i6 >> 16) & 255)) / 256.0d, random) * 256.0d)) << 16) + (((int) (256.0d * Math.pow(((double) ((i6 >> 8) & 255)) / 256.0d, random))) << 8)) + ((int) (256.0d * Math.pow(((double) (i6 & 255)) / 256.0d, random))));
                if (i6 == 0) {
                    i6 = 1;
                }
                i3 = i5 + 1;
                am[i5] = i6;
                i4++;
                i5 = i3;
            }
            i++;
            i3 = i5;
        }
    }

    public static final void bw(double d, int i, int i2) {
        double random = d + ((Math.random() * 0.03d) - 0.015d);
        int i3 = i * cj.ak;
        while (i < i2) {
            double d2 = 0.0078125d + (((double) (i >> 3)) / 64.0d);
            double d3 = 0.0625d + (((double) (i & 7)) / 8.0d);
            int i4 = 0;
            int i5 = i3;
            while (i4 < cj.ak) {
                double d4;
                double d5;
                double d6;
                double d7 = ((double) i4) / 128.0d;
                if (0.0d != d3) {
                    double d8;
                    if (d7 < 0.5d) {
                        d4 = (1.0d + d3) * d7;
                    } else {
                        d4 = (d3 + d7) - (d7 * d3);
                    }
                    d7 = (d7 * 2.0d) - d4;
                    d5 = 0.3333333333333333d + d2;
                    if (d5 > 1.0d) {
                        d6 = d5 - 1.0d;
                    } else {
                        d6 = d5;
                    }
                    d5 = d2 - 0.3333333333333333d;
                    if (d5 < 0.0d) {
                        d8 = d5 + 1.0d;
                    } else {
                        d8 = d5;
                    }
                    if (6.0d * d6 < 1.0d) {
                        d6 = ((6.0d * (d4 - d7)) * d6) + d7;
                    } else if (2.0d * d6 < 1.0d) {
                        d6 = d4;
                    } else if (3.0d * d6 < 2.0d) {
                        d6 = (((d4 - d7) * (0.6666666666666666d - d6)) * 6.0d) + d7;
                    } else {
                        d6 = d7;
                    }
                    if (6.0d * d2 < 1.0d) {
                        d5 = ((6.0d * (d4 - d7)) * d2) + d7;
                    } else if (2.0d * d2 < 1.0d) {
                        d5 = d4;
                    } else if (3.0d * d2 < 2.0d) {
                        d5 = (((d4 - d7) * (0.6666666666666666d - d2)) * 6.0d) + d7;
                    } else {
                        d5 = d7;
                    }
                    if (6.0d * d8 < 1.0d) {
                        d4 = (((d4 - d7) * 6.0d) * d8) + d7;
                        d7 = d5;
                        d5 = d6;
                    } else if (2.0d * d8 < 1.0d) {
                        d7 = d5;
                        d5 = d6;
                    } else if (3.0d * d8 < 2.0d) {
                        d4 = (((d4 - d7) * (0.6666666666666666d - d8)) * 6.0d) + d7;
                        d7 = d5;
                        d5 = d6;
                    } else {
                        d4 = d7;
                        d7 = d5;
                        d5 = d6;
                    }
                } else {
                    d4 = d7;
                    d5 = d7;
                }
                int i6 = ((int) (d4 * 256.0d)) + ((((int) (d7 * 256.0d)) << 8) + (((int) (d5 * 256.0d)) << 16));
                d5 = ((double) ((i6 >> 8) & 255)) / 256.0d;
                d6 = ((double) (i6 & 255)) / 256.0d;
                d7 = Math.pow(((double) ((i6 >> 16) & 255)) / 256.0d, random);
                i3 = (int) (d7 * 256.0d);
                i6 = (i6 & -16777216) | (((i3 << 16) + (((int) (256.0d * Math.pow(d5, random))) << 8)) + ((int) (256.0d * Math.pow(d6, random))));
                if (i6 == 0) {
                    i6 = 1;
                }
                i3 = i5 + 1;
                am[i5] = i6;
                i4++;
                i5 = i3;
            }
            i++;
            i3 = i5;
        }
    }

    public final void bf(int i) {
        this.bt = -1711135501 * i;
    }

    public final void bk(int i) {
        this.bt = -1711135501 * i;
    }

    public final void bu(int i, int i2) {
        try {
            this.bt = -1711135501 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bu(" + ')');
        }
    }

    public void al(int i) {
        bu(i, 202962563);
    }

    public void an(int i, int i2) {
        try {
            bu(i, -2012819946);
        } catch (Throwable e) {
            throw ei.ac(e, "bl.an(" + ')');
        }
    }

    public void as(int i) {
        bu(i, 1880990067);
    }

    public void az(int i) {
        bu(i, 899417644);
    }

    public final int bd(int i) {
        try {
            return this.bt * 411538491;
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bd(" + ')');
        }
    }

    public final int bl() {
        return this.bt * 411538491;
    }

    public final int cb() {
        return this.bt * 411538491;
    }

    public final int cy() {
        return this.bt * 411538491;
    }

    public final void by(boolean z, byte b) {
        try {
            this.bm = z;
        } catch (Throwable e) {
            throw ei.ac(e, "bl.by(" + ')');
        }
    }

    public final void cl(boolean z) {
        this.bm = z;
    }

    public final void co(boolean z) {
        this.bm = z;
    }

    public final void bx(int i, int i2, int i3, int i4, int i5) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            if (i3 > this.af * -1842132067) {
                i3 = this.af * -1842132067;
            }
            if (i4 > this.au * 1015169625) {
                i4 = 1015169625 * this.au;
            }
            this.ag = 429047685 * i;
            this.av = -324233879 * i2;
            this.ar = -598395011 * i3;
            this.ay = -488484919 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bx(" + ')');
        }
    }

    public final void cc(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.af * -316868322) {
            i3 = this.af * 931931417;
        }
        if (i4 > this.au * 1369358320) {
            i4 = 1015169625 * this.au;
        }
        this.ag = 1812396896 * i;
        this.av = -324233879 * i2;
        this.ar = 1712649935 * i3;
        this.ay = -488484919 * i4;
    }

    public final void cf(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.af * -1842132067) {
            i3 = this.af * 1913026681;
        }
        if (i4 > this.au * 1015169625) {
            i4 = 1015169625 * this.au;
        }
        this.ag = 429047685 * i;
        this.av = -324233879 * i2;
        this.ar = -2002916450 * i3;
        this.ay = -488484919 * i4;
    }

    public final void bi(int i) {
        try {
            ac(this.ag * -1517330099, -1329771815 * this.av, this.ar * -619300395, -1825637767 * this.ay, 1266150622);
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bi(" + ')');
        }
    }

    public final void ca() {
        ac(this.ag * -1517330099, -1329771815 * this.av, this.ar * -619300395, -1825637767 * this.ay, -1535364631);
    }

    public final void cr() {
        ac(this.ag * -1517330099, -412912144 * this.av, this.ar * -619300395, -2117590047 * this.ay, 1945383329);
    }

    void ac(int i, int i2, int i3, int i4, int i5) {
        try {
            this.bu = (i3 - i) * -2004943983;
            this.bd = (i4 - i2) * 822618141;
            bs(-483276388);
            if (this.bo.length < this.bd * 286513717) {
                this.bo = new int[cf.an(this.bd * 286513717, 1270922785)];
            }
            int i6 = i + ((this.af * -1842132067) * i2);
            for (int i7 = 0; i7 < this.bd * 286513717; i7++) {
                this.bo[i7] = i6;
                i6 += this.af * -1842132067;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bl.ac(" + ')');
        }
    }

    void ae(int i, int i2, int i3, int i4) {
        this.bu = (i3 - i) * -2004943983;
        this.bd = (i4 - i2) * 822618141;
        bs(1016265452);
        if (this.bo.length < this.bd * 286513717) {
            this.bo = new int[cf.an(this.bd * 286513717, 1672635536)];
        }
        int i5 = i + ((this.af * -1842132067) * i2);
        for (int i6 = 0; i6 < this.bd * 286513717; i6++) {
            this.bo[i6] = i5;
            i5 += this.af * -1842132067;
        }
    }

    void am(int i, int i2, int i3, int i4) {
        this.bu = (i3 - i) * 921647804;
        this.bd = (i4 - i2) * -788830128;
        bs(1825090814);
        if (this.bo.length < this.bd * 286513717) {
            this.bo = new int[cf.an(-1086845787 * this.bd, -925768078)];
        }
        int i5 = i + ((this.af * -874441414) * i2);
        for (int i6 = 0; i6 < this.bd * 286513717; i6++) {
            this.bo[i6] = i5;
            i5 += this.af * -1586138145;
        }
    }

    void m0aw(int i, int i2, int i3, int i4) {
        this.bu = (i3 - i) * -2004943983;
        this.bd = (i4 - i2) * 822618141;
        bs(-1593365036);
        if (this.bo.length < this.bd * -299459792) {
            this.bo = new int[cf.an(this.bd * 286513717, 2126084875)];
        }
        int i5 = i + ((this.af * -28326597) * i2);
        for (int i6 = 0; i6 < this.bd * 286513717; i6++) {
            this.bo[i6] = i5;
            i5 += this.af * 1269841567;
        }
    }

    public final void bs(int i) {
        try {
            this.br = -1272831365 * ((-1431886479 * this.bu) / 2);
            this.bb = ((this.bd * 286513717) / 2) * -1828644881;
            this.by = -(-1781228861 * this.br);
            this.bx = (2062385783 * this.bu) - (this.br * 909169157);
            this.bi = -(this.bb * -1702976817);
            this.bs = (this.bd * 1479978439) - (-1640313307 * this.bb);
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bs(" + ')');
        }
    }

    public final void cp() {
        this.br = -1272831365 * ((-1431886479 * this.bu) / 2);
        this.bb = ((this.bd * 286513717) / 2) * -1828644881;
        this.by = -(-1781228861 * this.br);
        this.bx = (2062385783 * this.bu) - (this.br * 909169157);
        this.bi = -(this.bb * -1702976817);
        this.bs = (this.bd * 1479978439) - (-1640313307 * this.bb);
    }

    public final void ct() {
        this.br = -130987384 * ((-1431886479 * this.bu) / 2);
        this.bb = ((this.bd * 1258535820) / 2) * -1828644881;
        this.by = -(-1781228861 * this.br);
        this.bx = (2062385783 * this.bu) - (this.br * -319790683);
        this.bi = -(this.bb * -1500584609);
        this.bs = (this.bd * -1366229813) - (-1640313307 * this.bb);
    }

    public final void bo(int i, int i2, byte b) {
        try {
            int i3 = this.bo[0];
            int i4 = i3 / (this.af * -1842132067);
            this.br = (i - (i3 - ((this.af * -1842132067) * i4))) * -1272831365;
            this.bb = -1828644881 * (i2 - i4);
            this.by = -(this.br * -1781228861);
            this.bx = (2062385783 * this.bu) - (909169157 * this.br);
            this.bi = -(-1702976817 * this.bb);
            this.bs = (1479978439 * this.bd) - (this.bb * -1640313307);
        } catch (Throwable e) {
            throw ei.ac(e, "bl.bo(" + ')');
        }
    }

    public final void ce(int i, int i2) {
        int i3 = this.bo[0];
        int i4 = i3 / (this.af * -1842132067);
        this.br = (i - (i3 - ((this.af * -1842132067) * i4))) * -1272831365;
        this.bb = -1828644881 * (i2 - i4);
        this.by = -(this.br * -1781228861);
        this.bx = (2062385783 * this.bu) - (909169157 * this.br);
        this.bi = -(-1702976817 * this.bb);
        this.bs = (1479978439 * this.bd) - (this.bb * -1640313307);
    }

    public final void ch(int i, int i2) {
        int i3 = this.bo[0];
        int i4 = i3 / (this.af * -2109068642);
        this.br = (i - (i3 - ((-1842132067 * this.af) * i4))) * 1207115444;
        this.bb = 466818817 * (i2 - i4);
        this.by = -(this.br * -1210116560);
        this.bx = (-966949154 * this.bu) - (909169157 * this.br);
        this.bi = -(-651716794 * this.bb);
        this.bs = (-1460350115 * this.bd) - (this.bb * 1198229594);
    }

    public final void ck(int i, int i2) {
        int i3 = this.bo[0];
        int i4 = i3 / (this.af * 726328152);
        this.br = (i - (i3 - ((-1842132067 * this.af) * i4))) * -90337517;
        this.bb = 1188819343 * (i2 - i4);
        this.by = -(this.br * -1781228861);
        this.bx = (2062385783 * this.bu) - (909169157 * this.br);
        this.bi = -(-50789549 * this.bb);
        this.bs = (1479978439 * this.bd) - (this.bb * -1640313307);
    }

    public final void cm(int i, int i2) {
        int i3 = this.bo[0];
        int i4 = i3 / (this.af * -1842132067);
        this.br = (i - (i3 - ((this.af * -1842132067) * i4))) * -1272831365;
        this.bb = -1828644881 * (i2 - i4);
        this.by = -(this.br * -1781228861);
        this.bx = (2062385783 * this.bu) - (909169157 * this.br);
        this.bi = -(-1702976817 * this.bb);
        this.bs = (1479978439 * this.bd) - (this.bb * -1640313307);
    }

    public void bz(int i, int i2, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            try {
                if (i <= this.bu * -1431886479 && i2 >= 0 && i2 <= this.bu * -1431886479 && i3 >= 0 && i3 <= this.bu * -1431886479) {
                    z = false;
                    this.ad = z;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "bl.bz(" + ')');
            }
        }
        z = true;
        this.ad = z;
    }

    public void ci(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bu * -1431886479 || i2 < 0 || i2 > this.bu * -1431886479 || i3 < 0 || i3 > this.bu * -1431886479;
        this.ad = z;
    }

    public void cq(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bu * -1431886479 || i2 < 0 || i2 > this.bu * -1431886479 || i3 < 0 || i3 > this.bu * -1431886479;
        this.ad = z;
    }

    public void cv(int i, int i2, int i3) {
        boolean z = i < 0 || i > -373527464 * this.bu || i2 < 0 || i2 > this.bu * -1431886479 || i3 < 0 || i3 > this.bu * -1431886479;
        this.ad = z;
    }

    static final int cg(int i, int i2) {
        int i3 = 2;
        int i4 = ((596077344 & i) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 652517288 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int cu(int i, int i2) {
        int i3 = 2;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 126 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int cs(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int cd(int i, int i2, int i3, int i4) {
        return ((i3 * i) - (i2 * i4)) >> 16;
    }

    static final int cn(int i, int i2, int i3, int i4) {
        return ((i3 * i) - (i2 * i4)) >> 16;
    }

    static final int cw(int i, int i2, int i3, int i4) {
        return ((i3 * i) - (i2 * i4)) >> 16;
    }

    static final int cx(int i, int i2, int i3, int i4) {
        return ((i3 * i) - (i2 * i4)) >> 16;
    }

    static final int cj(int i, int i2, int i3, int i4) {
        return ((i3 * i2) + (i * i4)) >> 16;
    }

    static final int cz(int i, int i2, int i3, int i4) {
        return ((i3 * i2) + (i * i4)) >> 16;
    }

    static final int da(int i, int i2, int i3, int i4) {
        return ((i3 * i2) + (i * i4)) >> 16;
    }

    static final int di(int i, int i2, int i3, int i4) {
        return ((i4 * i2) + (i3 * i)) >> 16;
    }

    static final int dv(int i, int i2, int i3, int i4) {
        return ((i4 * i2) + (i3 * i)) >> 16;
    }

    static final int dw(int i, int i2, int i3, int i4) {
        return ((i4 * i2) + (i3 * i)) >> 16;
    }

    static final int aw(int i, int i2, int i3, int i4) {
        try {
            int i5 = i / i3;
            int i6 = (i3 - 1) & i;
            int i7 = i2 / i3;
            int i8 = (i3 - 1) & i2;
            int am = gc.am(i5, i7, 1724302750);
            int am2 = gc.am(i5 + 1, i7, 894732763);
            int am3 = gc.am(i5, i7 + 1, 1669546764);
            i5 = gc.am(i5 + 1, i7 + 1, 1512728527);
            i7 = (65536 - ax[(i6 * 1024) / i3]) >> 1;
            i6 = (65536 - ax[(i6 * 1024) / i3]) >> 1;
            i5 = ((i5 * i6) >> 16) + (((65536 - i6) * am3) >> 16);
            i6 = (65536 - ax[(i8 * 1024) / i3]) >> 1;
            return ((i5 * i6) >> 16) + (((65536 - i6) * ((((65536 - i7) * am) >> 16) + ((am2 * i7) >> 16))) >> 16);
        } catch (Throwable e) {
            throw ei.ac(e, "bl.aw(" + ')');
        }
    }

    static int ap(int i, fs fsVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        ab aj;
        int[] iArr2;
        String str;
        int i4;
        if (i >= 2000) {
            i -= 1000;
            try {
                iArr = gr.ak;
                i3 = dy.ap - -401924967;
                dy.ap = i3;
                aj = ac.aj(iArr[i3 * -38307927], 1679869506);
            } catch (Throwable e) {
                throw ei.ac(e, "bl.ap(" + ')');
            }
        }
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        aj = abVar;
        String[] strArr = gr.at;
        i3 = di.ah - 436804489;
        di.ah = i3;
        String str2 = strArr[i3 * 1894369977];
        iArr = null;
        if (str2.length() <= 0 || str2.charAt(str2.length() - 1) != 'Y') {
            iArr2 = null;
            str = str2;
        } else {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            int i5 = iArr2[i4 * -38307927];
            if (i5 > 0) {
                iArr = new int[i5];
                while (true) {
                    i4 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    iArr2 = gr.ak;
                    int i6 = dy.ap - -401924967;
                    dy.ap = i6;
                    iArr[i4] = iArr2[i6 * -38307927];
                    i5 = i4;
                }
            }
            iArr2 = iArr;
            str = str2.substring(0, str2.length() - 1);
        }
        Object[] objArr = new Object[(str.length() + 1)];
        for (i3 = objArr.length - 1; i3 >= 1; i3--) {
            if (str.charAt(i3 - 1) == 's') {
                String[] strArr2 = gr.at;
                int i7 = di.ah - 436804489;
                di.ah = i7;
                objArr[i3] = strArr2[i7 * 1894369977];
            } else {
                int[] iArr3 = gr.ak;
                int i8 = dy.ap - -401924967;
                dy.ap = i8;
                objArr[i3] = new Integer(iArr3[i8 * -38307927]);
            }
        }
        int[] iArr4 = gr.ak;
        i4 = dy.ap - -401924967;
        dy.ap = i4;
        i3 = iArr4[i4 * -38307927];
        if (-1 != i3) {
            objArr[0] = new Integer(i3);
        } else {
            objArr = null;
        }
        if (i == mx.aq) {
            aj.dn = objArr;
        } else if (np.ao == i) {
            aj.dy = objArr;
        } else if (1402 == i) {
            aj.df = objArr;
        } else if (1403 == i) {
            aj.dc = objArr;
        } else if (i == 1404) {
            aj.eq = objArr;
        } else if (1405 == i) {
            aj.eu = objArr;
        } else if (1406 == i) {
            aj.eh = objArr;
        } else if (1407 == i) {
            aj.ek = objArr;
            aj.eb = iArr2;
        } else if (1408 == i) {
            aj.ed = objArr;
        } else if (i == 1409) {
            aj.et = objArr;
        } else if (i == 1410) {
            aj.ep = objArr;
        } else if (i == 1411) {
            aj.dg = objArr;
        } else if (1412 == i) {
            aj.ei = objArr;
        } else if (i == 1414) {
            aj.ez = objArr;
            aj.el = iArr2;
        } else if (1415 == i) {
            aj.ey = objArr;
            aj.ex = iArr2;
        } else if (i == 1416) {
            aj.ej = objArr;
        } else if (i == 1417) {
            aj.ec = objArr;
        } else if (1418 == i) {
            aj.ea = objArr;
        } else if (i == 1419) {
            aj.er = objArr;
        } else if (1420 == i) {
            aj.ee = objArr;
        } else if (1421 == i) {
            aj.em = objArr;
        } else if (1422 == i) {
            aj.ew = objArr;
        } else if (i == 1423) {
            aj.eg = objArr;
        } else if (1424 == i) {
            aj.eo = objArr;
        } else if (i == 1425) {
            aj.ev = objArr;
        } else if (1426 == i) {
            aj.ef = objArr;
        } else if (i != 1427) {
            return 2;
        } else {
            aj.en = objArr;
        }
        aj.dm = true;
        return 1;
    }
}
