package defpackage;

public class dy {
    static final int ae = 14;
    static int ap = 0;
    public static final int bu = 39;
    public static final int cf = 81;
    public static final int ks = 503;
    static long or;
    int ac;
    String aj;
    int an;
    dn aq;

    dy(String str, int i, int i2, dn dnVar) {
        try {
            this.aj = str;
            this.ac = 684540951 * i;
            this.an = 1282260163 * i2;
            this.aq = dnVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dy.<init>(" + ')');
        }
    }

    static em tu(byte[] bArr, int i) {
        try {
            return ao.qh.aa(bArr, (byte) 5);
        } catch (Throwable e) {
            throw ei.ac(e, "dy.tu(" + ')');
        }
    }

    static final short ap(float f, float f2, int i, int i2, int i3) {
        return (short) ((((int) ((f + 1.0f) * 64.0f)) + (i >> 1)) | ((((int) ((1.0f + f2) * 64.0f)) + (i2 >> 1)) << 8));
    }

    static int at(int i, fs fsVar, boolean z, int i2) {
        if (z) {
            try {
                ab abVar = client.ae;
            } catch (Throwable e) {
                throw ei.ac(e, "dy.at(" + ')');
            }
        }
        abVar = ef.am;
        int[] iArr;
        int i3;
        if (1500 == i) {
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            iArr[(i3 * -38307927) - 1] = abVar.br * 731088057;
            return 1;
        } else if (i == 1501) {
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            iArr[(i3 * -38307927) - 1] = abVar.bb * -1821656375;
            return 1;
        } else if (i == 1502) {
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            iArr[(i3 * -38307927) - 1] = abVar.bu * 1120250035;
            return 1;
        } else if (1503 == i) {
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            iArr[(i3 * -38307927) - 1] = abVar.bd * -1781667913;
            return 1;
        } else if (i == 1504) {
            int i4;
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            i3 = (i3 * -38307927) - 1;
            if (abVar.bs) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iArr[i3] = i4;
            return 1;
        } else if (1505 != i) {
            return 2;
        } else {
            iArr = gr.ak;
            i3 = ap - 401924967;
            ap = i3;
            iArr[(i3 * -38307927) - 1] = abVar.bi * -1228023025;
            return 1;
        }
    }

    static final void el(ab abVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 8;
        try {
            if (client.fh) {
                client.fq = -2009026784;
            } else {
                client.fq = 0;
            }
            client.fh = false;
            if (bu.au.aj == fz.aa) {
                if (i5 >= i && i5 < i + 16 && i6 >= i2 && i6 < i2 + 16) {
                    abVar.bz -= 1123950108;
                    cf.ew(abVar, (byte) -123);
                } else if (i5 >= i && i5 < i + 16 && i6 >= (i3 + i2) - 16 && i6 < i2 + i3) {
                    abVar.bz += 1123950108;
                    cf.ew(abVar, (byte) -102);
                } else if (i5 >= i - (client.fq * -1479650103) && i5 < (client.fq * -1479650103) + (i + 16) && i6 >= i2 + 16 && i6 < (i3 + i2) - 16) {
                    int i9 = ((i3 - 32) * i3) / i4;
                    if (i9 >= 8) {
                        i8 = i9;
                    }
                    i9 = ((i6 - i2) - 16) - (i8 / 2);
                    abVar.bz = ((i9 * (i4 - i3)) / ((i3 - 32) - i8)) * -792754297;
                    cf.ew(abVar, (byte) -77);
                    client.fh = true;
                }
            }
            if (client.kg * -2043693923 != 0 && i5 >= i - (abVar.bu * 1120250035) && i6 >= i2 && i5 < i + 16 && i6 <= i2 + i3) {
                abVar.bz += client.kg * -1539065681;
                cf.ew(abVar, (byte) -47);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dy.el(" + ')');
        }
    }
}
