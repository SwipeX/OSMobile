package defpackage;

import java.util.Random;

public class iq {
    static int[] ab = new int[5];
    static int[] ad = new int[5];
    static int[] af = new int[32768];
    static int[] ag = new int[5];
    static int[] ar = new int[5];
    static int[] au = new int[32768];
    static final double av = 1.0057929410678534d;
    static int[] ax = new int[220500];
    static int[] ay = new int[5];
    ig aa;
    ig ac;
    ip ae;
    int[] ah = new int[]{0, 0, 0, 0, 0};
    int[] ai = new int[]{0, 0, 0, 0, 0};
    ig aj;
    ig ak;
    int al = 500;
    int am = 100;
    ig an;
    ig ao;
    ig ap;
    ig aq;
    ig as;
    int[] at = new int[]{0, 0, 0, 0, 0};
    int aw = 0;
    int az = 0;

    static {
        int i = 0;
        Random random = new Random(0);
        for (int i2 = 0; i2 < 32768; i2++) {
            af[i2] = (random.nextInt() & 2) - 1;
        }
        while (i < 32768) {
            au[i] = (int) (Math.sin(((double) i) / 5215.1903d) * 16384.0d);
            i++;
        }
    }

    iq() {
    }

    final int[] aj(int i, int i2) {
        gg.ah(ax, 0, i);
        if (i2 < 10) {
            return ax;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.aj.an();
        this.ac.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aq.an();
            i4 = (int) ((((double) (this.an.ao - this.an.aq)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aq) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ao != null) {
            this.ao.an();
            this.aa.an();
            i7 = (int) ((((double) (this.ao.ao - this.ao.aq)) * 32.768d) / d);
            i8 = (int) ((((double) this.ao.aq) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.at[i3] != 0) {
                ay[i3] = 0;
                ag[i3] = (int) (((double) this.ai[i3]) * d);
                ar[i3] = (this.at[i3] << 14) / 100;
                ad[i3] = (int) (((((double) (this.aj.ao - this.aj.aq)) * 32.768d) * Math.pow(av, (double) this.ah[i3])) / d);
                ab[i3] = (int) ((((double) this.aj.aq) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.aj.aq(i);
            int aq = this.ac.aq(i);
            if (this.an != null) {
                i3 += ac(i6, this.aq.aq(i), this.an.aa) >> 1;
                i6 += ((this.an.aq(i) * i4) >> 16) + i5;
            }
            if (this.ao != null) {
                aq = (aq * ((ac(i9, this.aa.aq(i), this.ao.aa) >> 1) + 32768)) >> 15;
                i9 += ((this.ao.aq(i) * i7) >> 16) + i8;
            }
            for (int i11 = 0; i11 < 5; i11++) {
                if (this.at[i11] != 0) {
                    int i12 = ag[i11] + i10;
                    if (i12 < i) {
                        int[] iArr = ax;
                        iArr[i12] = iArr[i12] + ac(ay[i11], (ar[i11] * aq) >> 15, this.aj.aa);
                        int[] iArr2 = ay;
                        iArr2[i11] = iArr2[i11] + (((ad[i11] * i3) >> 16) + ab[i11]);
                    }
                }
            }
        }
        if (this.ak != null) {
            this.ak.an();
            this.ap.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.ak.aq(i);
                i8 = this.ap.aq(i);
                if (obj != null) {
                    i8 = ((i4 * (this.ak.ao - this.ak.aq)) >> 8) + this.ak.aq;
                } else {
                    i8 = this.ak.aq + ((i8 * (this.ak.ao - this.ak.aq)) >> 8);
                }
                i4 = i3 + bq.ah;
                if (i4 >= i8) {
                    i4 = 0;
                    obj = obj == null ? 1 : null;
                }
                if (obj != null) {
                    ax[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.aw > 0 && this.am > 0) {
            i4 = (int) (((double) this.aw) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ax;
                iArr3[i5] = iArr3[i5] + ((ax[i5 - i4] * this.am) / 100);
            }
        }
        if (this.ae.aj[0] > 0 || this.ae.aj[1] > 0) {
            this.as.an();
            i3 = this.as.aq(i + 1);
            i7 = this.ae.aq(0, ((float) i3) / 65536.0f);
            i8 = this.ae.aq(1, ((float) i3) / 65536.0f);
            if (i >= i7 + i8) {
                i4 = 0;
                if (i8 > i - i7) {
                    i6 = i - i7;
                } else {
                    i6 = i8;
                }
                while (i4 < i6) {
                    i3 = (int) ((((long) ax[i4 + i7]) * ((long) ip.at)) >> 16);
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += (int) ((((long) ax[((i4 + i7) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i4; i5++) {
                        i3 -= (int) ((((long) ax[(i4 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i4] = i3;
                    i3 = this.as.aq(i + 1);
                    i4++;
                }
                i5 = cj.ak;
                i6 = i7;
                int i13 = i8;
                i8 = i3;
                i3 = i13;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                        i4 = i8;
                    } else {
                        i7 = i5;
                        i5 = i4;
                        i4 = i8;
                    }
                    while (i5 < i7) {
                        i8 = (int) ((((long) ax[i5 + i6]) * ((long) ip.at)) >> 16);
                        for (i4 = 0; i4 < i6; i4++) {
                            i8 += (int) ((((long) ax[((i5 + i6) - 1) - i4]) * ((long) ip.ak[0][i4])) >> 16);
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            i8 -= (int) ((((long) ax[(i5 - 1) - i4]) * ((long) ip.ak[1][i4])) >> 16);
                        }
                        ax[i5] = i8;
                        i4 = this.as.aq(i + 1);
                        i5++;
                    }
                    if (i5 >= i - i6) {
                        break;
                    }
                    i6 = this.ae.aq(0, ((float) i4) / 65536.0f);
                    i3 = this.ae.aq(1, ((float) i4) / 65536.0f);
                    i8 = i4;
                    i4 = i5;
                    i5 = i7 + cj.ak;
                }
                for (i8 = i5; i8 < i; i8++) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ax[((i8 + i6) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ax[(i8 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i8] = i4;
                    this.as.aq(i + 1);
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ax[i5] < -32768) {
                ax[i5] = -32768;
            }
            if (ax[i5] > 32767) {
                ax[i5] = 32767;
            }
        }
        return ax;
    }

    final int[] ao(int i, int i2) {
        gg.ah(ax, 0, i);
        if (i2 < 10) {
            return ax;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.aj.an();
        this.ac.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aq.an();
            i4 = (int) ((((double) (this.an.ao - this.an.aq)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aq) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ao != null) {
            this.ao.an();
            this.aa.an();
            i7 = (int) ((((double) (this.ao.ao - this.ao.aq)) * 32.768d) / d);
            i8 = (int) ((((double) this.ao.aq) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.at[i3] != 0) {
                ay[i3] = 0;
                ag[i3] = (int) (((double) this.ai[i3]) * d);
                ar[i3] = (this.at[i3] << 14) / 100;
                ad[i3] = (int) (((((double) (this.aj.ao - this.aj.aq)) * 32.768d) * Math.pow(av, (double) this.ah[i3])) / d);
                ab[i3] = (int) ((((double) this.aj.aq) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.aj.aq(i);
            int aq = this.ac.aq(i);
            if (this.an != null) {
                int aq2 = this.an.aq(i);
                i3 += ac(i6, this.aq.aq(i), this.an.aa) >> 1;
                i6 += ((aq2 * i4) >> 16) + i5;
            }
            if (this.ao != null) {
                aq2 = this.ao.aq(i);
                aq = (aq * ((ac(i9, this.aa.aq(i), this.ao.aa) >> 1) + 32768)) >> 15;
                i9 += ((aq2 * i7) >> 16) + i8;
            }
            for (aq2 = 0; aq2 < 5; aq2++) {
                if (this.at[aq2] != 0) {
                    int i11 = ag[aq2] + i10;
                    if (i11 < i) {
                        int[] iArr = ax;
                        iArr[i11] = iArr[i11] + ac(ay[aq2], (ar[aq2] * aq) >> 15, this.aj.aa);
                        int[] iArr2 = ay;
                        iArr2[aq2] = iArr2[aq2] + (((ad[aq2] * i3) >> 16) + ab[aq2]);
                    }
                }
            }
        }
        if (this.ak != null) {
            this.ak.an();
            this.ap.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.ak.aq(i);
                i8 = this.ap.aq(i);
                if (obj != null) {
                    i8 = ((i4 * (this.ak.ao - this.ak.aq)) >> 8) + this.ak.aq;
                } else {
                    i8 = this.ak.aq + ((i8 * (this.ak.ao - this.ak.aq)) >> 8);
                }
                i4 = i3 + bq.ah;
                if (i4 >= i8) {
                    i4 = 0;
                    if (obj == null) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                }
                if (obj != null) {
                    ax[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.aw > 0 && this.am > 0) {
            i4 = (int) (((double) this.aw) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ax;
                iArr3[i5] = iArr3[i5] + ((ax[i5 - i4] * this.am) / 100);
            }
        }
        if (this.ae.aj[0] > 0 || this.ae.aj[1] > 0) {
            this.as.an();
            i4 = this.as.aq(i + 1);
            i3 = this.ae.aq(0, ((float) i4) / 65536.0f);
            i7 = this.ae.aq(1, ((float) i4) / 65536.0f);
            if (i >= i3 + i7) {
                i8 = 0;
                if (i7 > i - i3) {
                    i6 = i - i3;
                } else {
                    i6 = i7;
                }
                while (i8 < i6) {
                    i4 = (int) ((((long) ax[i8 + i3]) * ((long) ip.at)) >> 16);
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 += (int) ((((long) ax[((i8 + i3) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i8; i5++) {
                        i4 -= (int) ((((long) ax[(i8 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i8] = i4;
                    i4 = this.as.aq(i + 1);
                    i8++;
                }
                i5 = cj.ak;
                i6 = i3;
                i3 = i7;
                int i12 = i8;
                i8 = i4;
                i4 = i12;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                        i4 = i8;
                    } else {
                        i7 = i5;
                        i5 = i4;
                        i4 = i8;
                    }
                    while (i5 < i7) {
                        i8 = (int) ((((long) ax[i5 + i6]) * ((long) ip.at)) >> 16);
                        for (i4 = 0; i4 < i6; i4++) {
                            i8 += (int) ((((long) ax[((i5 + i6) - 1) - i4]) * ((long) ip.ak[0][i4])) >> 16);
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            i8 -= (int) ((((long) ax[(i5 - 1) - i4]) * ((long) ip.ak[1][i4])) >> 16);
                        }
                        ax[i5] = i8;
                        i4 = this.as.aq(i + 1);
                        i5++;
                    }
                    if (i5 >= i - i6) {
                        break;
                    }
                    i6 = this.ae.aq(0, ((float) i4) / 65536.0f);
                    i3 = this.ae.aq(1, ((float) i4) / 65536.0f);
                    i8 = i4;
                    i4 = i5;
                    i5 = i7 + cj.ak;
                }
                for (i8 = i5; i8 < i; i8++) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ax[((i8 + i6) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ax[(i8 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i8] = i4;
                    this.as.aq(i + 1);
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ax[i5] < -32768) {
                ax[i5] = -32768;
            }
            if (ax[i5] > 32767) {
                ax[i5] = 32767;
            }
        }
        return ax;
    }

    final int[] aq(int i, int i2) {
        gg.ah(ax, 0, i);
        if (i2 < 10) {
            return ax;
        }
        int i3;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.aj.an();
        this.ac.an();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.an != null) {
            this.an.an();
            this.aq.an();
            i4 = (int) ((((double) (this.an.ao - this.an.aq)) * 32.768d) / d);
            i5 = (int) ((((double) this.an.aq) * 32.768d) / d);
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        if (this.ao != null) {
            this.ao.an();
            this.aa.an();
            i7 = (int) ((((double) (this.ao.ao - this.ao.aq)) * 32.768d) / d);
            i8 = (int) ((((double) this.ao.aq) * 32.768d) / d);
        }
        for (i3 = 0; i3 < 5; i3++) {
            if (this.at[i3] != 0) {
                ay[i3] = 0;
                ag[i3] = (int) (((double) this.ai[i3]) * d);
                ar[i3] = (this.at[i3] << 14) / 100;
                ad[i3] = (int) (((((double) (this.aj.ao - this.aj.aq)) * 32.768d) * Math.pow(av, (double) this.ah[i3])) / d);
                ab[i3] = (int) ((((double) this.aj.aq) * 32.768d) / d);
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            i3 = this.aj.aq(i);
            int aq = this.ac.aq(i);
            if (this.an != null) {
                i3 += ac(i6, this.aq.aq(i), this.an.aa) >> 1;
                i6 += ((this.an.aq(i) * i4) >> 16) + i5;
            }
            if (this.ao != null) {
                aq = (aq * ((ac(i9, this.aa.aq(i), this.ao.aa) >> 1) + 32768)) >> 15;
                i9 += ((this.ao.aq(i) * i7) >> 16) + i8;
            }
            for (int i11 = 0; i11 < 5; i11++) {
                if (this.at[i11] != 0) {
                    int i12 = ag[i11] + i10;
                    if (i12 < i) {
                        int[] iArr = ax;
                        iArr[i12] = iArr[i12] + ac(ay[i11], (ar[i11] * aq) >> 15, this.aj.aa);
                        int[] iArr2 = ay;
                        iArr2[i11] = iArr2[i11] + (((ad[i11] * i3) >> 16) + ab[i11]);
                    }
                }
            }
        }
        if (this.ak != null) {
            this.ak.an();
            this.ap.an();
            i7 = 0;
            i3 = 0;
            Object obj = 1;
            while (i7 < i) {
                i4 = this.ak.aq(i);
                i8 = this.ap.aq(i);
                if (obj != null) {
                    i8 = ((i4 * (this.ak.ao - this.ak.aq)) >> 8) + this.ak.aq;
                } else {
                    i8 = this.ak.aq + ((i8 * (this.ak.ao - this.ak.aq)) >> 8);
                }
                i4 = i3 + bq.ah;
                if (i4 >= i8) {
                    i4 = 0;
                    obj = obj == null ? 1 : null;
                }
                if (obj != null) {
                    ax[i7] = 0;
                }
                i7++;
                i3 = i4;
            }
        }
        if (this.aw > 0 && this.am > 0) {
            i4 = (int) (((double) this.aw) * d);
            for (i5 = i4; i5 < i; i5++) {
                int[] iArr3 = ax;
                iArr3[i5] = iArr3[i5] + ((ax[i5 - i4] * this.am) / 100);
            }
        }
        if (this.ae.aj[0] > 0 || this.ae.aj[1] > 0) {
            this.as.an();
            i3 = this.as.aq(i + 1);
            i7 = this.ae.aq(0, ((float) i3) / 65536.0f);
            i8 = this.ae.aq(1, ((float) i3) / 65536.0f);
            if (i >= i7 + i8) {
                i4 = 0;
                if (i8 > i - i7) {
                    i6 = i - i7;
                } else {
                    i6 = i8;
                }
                while (i4 < i6) {
                    i3 = (int) ((((long) ax[i4 + i7]) * ((long) ip.at)) >> 16);
                    for (i5 = 0; i5 < i7; i5++) {
                        i3 += (int) ((((long) ax[((i4 + i7) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i4; i5++) {
                        i3 -= (int) ((((long) ax[(i4 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i4] = i3;
                    i3 = this.as.aq(i + 1);
                    i4++;
                }
                i5 = cj.ak;
                i6 = i7;
                int i13 = i8;
                i8 = i3;
                i3 = i13;
                while (true) {
                    if (i5 > i - i6) {
                        i7 = i - i6;
                        i5 = i4;
                        i4 = i8;
                    } else {
                        i7 = i5;
                        i5 = i4;
                        i4 = i8;
                    }
                    while (i5 < i7) {
                        i8 = (int) ((((long) ax[i5 + i6]) * ((long) ip.at)) >> 16);
                        for (i4 = 0; i4 < i6; i4++) {
                            i8 += (int) ((((long) ax[((i5 + i6) - 1) - i4]) * ((long) ip.ak[0][i4])) >> 16);
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            i8 -= (int) ((((long) ax[(i5 - 1) - i4]) * ((long) ip.ak[1][i4])) >> 16);
                        }
                        ax[i5] = i8;
                        i4 = this.as.aq(i + 1);
                        i5++;
                    }
                    if (i5 >= i - i6) {
                        break;
                    }
                    i6 = this.ae.aq(0, ((float) i4) / 65536.0f);
                    i3 = this.ae.aq(1, ((float) i4) / 65536.0f);
                    i8 = i4;
                    i4 = i5;
                    i5 = i7 + cj.ak;
                }
                for (i8 = i5; i8 < i; i8++) {
                    i4 = 0;
                    for (i5 = (i8 + i6) - i; i5 < i6; i5++) {
                        i4 += (int) ((((long) ax[((i8 + i6) - 1) - i5]) * ((long) ip.ak[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 -= (int) ((((long) ax[(i8 - 1) - i5]) * ((long) ip.ak[1][i5])) >> 16);
                    }
                    ax[i8] = i4;
                    this.as.aq(i + 1);
                }
            }
        }
        for (i5 = 0; i5 < i; i5++) {
            if (ax[i5] < -32768) {
                ax[i5] = -32768;
            }
            if (ax[i5] > 32767) {
                ax[i5] = 32767;
            }
        }
        return ax;
    }

    final int aa(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < 16384) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (au[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * af[(i / 2607) & 32767];
            }
            return 0;
        }
    }

    final int ac(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < 16384) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (au[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            return i3 == 4 ? i2 * af[(i / 2607) & 32767] : 0;
        }
    }

    final int ak(int i, int i2, int i3) {
        if (i3 == 1) {
            if ((i & 32767) < 16384) {
                return i2;
            }
            return -i2;
        } else if (i3 == 2) {
            return (au[i & 32767] * i2) >> 14;
        } else {
            if (i3 == 3) {
                return (((i & 32767) * i2) >> 14) - i2;
            }
            if (i3 == 4) {
                return i2 * af[(i / 2607) & 32767];
            }
            return 0;
        }
    }

    final void an(he heVar) {
        this.aj = new ig();
        this.aj.aj(heVar);
        this.ac = new ig();
        this.ac.aj(heVar);
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.an = new ig();
            this.an.aj(heVar);
            this.aq = new ig();
            this.aq.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.ao = new ig();
            this.ao.aj(heVar);
            this.aa = new ig();
            this.aa.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.ak = new ig();
            this.ak.aj(heVar);
            this.ap = new ig();
            this.ap.aj(heVar);
        }
        for (int i = 0; i < 10; i++) {
            int bu = heVar.bu(1479338407);
            if (bu == 0) {
                break;
            }
            this.at[i] = bu;
            this.ah[i] = heVar.bb(1314128743);
            this.ai[i] = heVar.bu(927126000);
        }
        this.aw = heVar.bu(1021597289);
        this.am = heVar.bu(1246817294);
        this.al = heVar.ay((byte) 1);
        this.az = heVar.ay((byte) 1);
        this.ae = new ip();
        this.as = new ig();
        this.ae.ao(heVar, this.as);
    }

    final void ap(he heVar) {
        this.aj = new ig();
        this.aj.aj(heVar);
        this.ac = new ig();
        this.ac.aj(heVar);
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.an = new ig();
            this.an.aj(heVar);
            this.aq = new ig();
            this.aq.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.ao = new ig();
            this.ao.aj(heVar);
            this.aa = new ig();
            this.aa.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= 1729578790;
            this.ak = new ig();
            this.ak.aj(heVar);
            this.ap = new ig();
            this.ap.aj(heVar);
        }
        for (int i = 0; i < 10; i++) {
            int bu = heVar.bu(1388085140);
            if (bu == 0) {
                break;
            }
            this.at[i] = bu;
            this.ah[i] = heVar.bb(1314128743);
            this.ai[i] = heVar.bu(1512394573);
        }
        this.aw = heVar.bu(1116919614);
        this.am = heVar.bu(1732367996);
        this.al = heVar.ay((byte) 1);
        this.az = heVar.ay((byte) 1);
        this.ae = new ip();
        this.as = new ig();
        this.ae.ao(heVar, this.as);
    }

    final void at(he heVar) {
        this.aj = new ig();
        this.aj.aj(heVar);
        this.ac = new ig();
        this.ac.aj(heVar);
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -984165911;
            this.an = new ig();
            this.an.aj(heVar);
            this.aq = new ig();
            this.aq.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= -325219588;
            this.ao = new ig();
            this.ao.aj(heVar);
            this.aa = new ig();
            this.aa.aj(heVar);
        }
        if (heVar.au(-310118664) != 0) {
            heVar.ac -= 431415083;
            this.ak = new ig();
            this.ak.aj(heVar);
            this.ap = new ig();
            this.ap.aj(heVar);
        }
        for (int i = 0; i < 10; i++) {
            int bu = heVar.bu(1876380612);
            if (bu == 0) {
                break;
            }
            this.at[i] = bu;
            this.ah[i] = heVar.bb(1314128743);
            this.ai[i] = heVar.bu(1099946537);
        }
        this.aw = heVar.bu(1835741736);
        this.am = heVar.bu(1894203927);
        this.al = heVar.ay((byte) 1);
        this.az = heVar.ay((byte) 1);
        this.ae = new ip();
        this.as = new ig();
        this.ae.ao(heVar, this.as);
    }
}
