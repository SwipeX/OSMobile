package defpackage;

public class bh {
    static fl[] ah = null;
    public static final int aj = 1337;
    static int an;

    bh() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "bh.<init>(" + ')');
        }
    }

    public static int aa(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ak(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ao(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ap(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        return i4 == 2 ? 7 - i : 7 - i2;
    }

    public static int aq(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ah(int i, int i2, int i3, int i4, int i5, int i6) {
        if (1 != (i6 & 1)) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i;
        }
        if (i8 == 1) {
            return i2;
        }
        if (i8 == 2) {
            return (7 - i) - (i5 - 1);
        }
        return (7 - i2) - (i4 - 1);
    }

    public static int at(int i, int i2, int i3, int i4, int i5, int i6) {
        if (1 != (i6 & 1)) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i;
        }
        if (i8 == 1) {
            return i2;
        }
        if (i8 == 2) {
            return (7 - i) - (i5 - 1);
        }
        return (7 - i2) - (i4 - 1);
    }

    public static int ai(int i, int i2, int i3, int i4, int i5, int i6) {
        if (1 != (i6 & 1)) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i2;
        }
        if (i8 == 1) {
            return (7 - i) - (i5 - 1);
        }
        return 2 == i8 ? (7 - i2) - (i4 - 1) : i;
    }

    public static int am(int i, int i2, int i3, int i4, int i5, int i6) {
        if (1 != (i6 & 1)) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i2;
        }
        if (i8 == 1) {
            return (7 - i) - (i5 - 1);
        }
        if (2 == i8) {
            return (7 - i2) - (i4 - 1);
        }
        return i;
    }

    public static int aw(int i, int i2, int i3, int i4, int i5, int i6) {
        if (1 != (i6 & 1)) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i2;
        }
        if (i8 == 1) {
            return (7 - i) - (i5 - 1);
        }
        return 2 == i8 ? (7 - i2) - (i4 - 1) : i;
    }

    static synchronized void an(byte[] bArr, int i) {
        synchronized (bh.class) {
            try {
                byte[][] bArr2;
                int i2;
                if (bArr.length == 100 && hv.aj * -1639924327 < 1000) {
                    bArr2 = hv.aq;
                    i2 = hv.aj - 744274263;
                    hv.aj = i2;
                    bArr2[(i2 * -1639924327) - 1] = bArr;
                } else if (5000 == bArr.length && hv.ac * -218206939 < 250) {
                    bArr2 = hv.ao;
                    i2 = hv.ac + 179168941;
                    hv.ac = i2;
                    bArr2[(i2 * -218206939) - 1] = bArr;
                } else if (30000 == bArr.length && hv.an * 1109823217 < 50) {
                    bArr2 = hv.aa;
                    i2 = hv.an - 54746607;
                    hv.an = i2;
                    bArr2[(i2 * 1109823217) - 1] = bArr;
                } else if (gf.at != null) {
                    int i3 = 0;
                    while (i3 < hv.ak.length) {
                        if (hv.ak[i3] == bArr.length && hv.ap[i3] < gf.at[i3].length) {
                            byte[][] bArr3 = gf.at[i3];
                            int[] iArr = hv.ap;
                            int i4 = iArr[i3];
                            iArr[i3] = i4 + 1;
                            bArr3[i4] = bArr;
                            break;
                        }
                        i3++;
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "bh.an(" + ')');
            }
        }
    }

    static final void ai(iu iuVar, int i) {
        try {
            iuVar.af = false;
            if (iuVar.ax != null) {
                iuVar.ax.aj = 0;
            }
            iu aa = iuVar.aa();
            while (aa != null) {
                bh.ai(aa, 1130578365);
                aa = iuVar.ak();
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bh.ai(" + ')');
        }
    }
}
