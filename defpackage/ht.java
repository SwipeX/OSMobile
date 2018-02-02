package defpackage;

public class ht {
    public static final int aj = 8;
    static final int ay = 23;
    static final int bk = 51;
    protected static boolean qz;

    ht() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ht.<init>(" + ')');
        }
    }

    public static int ak(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (1 == i2) {
            return i3 * i;
        }
        return i3;
    }

    public static int ap(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        if (1 == i2) {
            return i3 * i;
        }
        return i3;
    }

    public static int at(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        return 1 == i2 ? i3 * i : i3;
    }

    public static int ah(int i, int i2) {
        if (i2 <= i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        while (i != 0) {
            i3 = i2 % i;
            i2 = i;
            i = i3;
        }
        return i2;
    }

    public static int ai(int i, int i2) {
        if (i2 <= i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        while (i != 0) {
            i3 = i2 % i;
            i2 = i;
            i = i3;
        }
        return i2;
    }

    public static int aw(int i, int i2) {
        if (i2 <= i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        while (i != 0) {
            i3 = i2 % i;
            i2 = i;
            i = i3;
        }
        return i2;
    }

    public static int ae(int i) {
        int i2 = i - 1;
        i2 |= i2 >>> 1;
        i2 |= i2 >>> 2;
        i2 |= i2 >>> 4;
        i2 |= i2 >>> 8;
        return (i2 | (i2 >>> 16)) + 1;
    }

    public static int am(int i) {
        int i2 = i - 1;
        i2 |= i2 >>> 1;
        i2 |= i2 >>> 2;
        i2 |= i2 >>> 4;
        i2 |= i2 >>> 8;
        return (i2 | (i2 >>> 16)) + 1;
    }

    public static int as(int i) {
        int i2;
        int i3 = 0;
        if (i < 0 || i >= 65536) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i2 = i;
        }
        if (i2 >= -557577517) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int al(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }

    public static int ax(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }

    public static int az(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }

    public static int af(int i, int i2) {
        int i3 = i >>> 31;
        return ((i3 + i) / i2) - i3;
    }

    public static void al(byte b) {
        int i = 0;
        while (i < fi.ap.length) {
            try {
                if (fi.ap[i] != 0) {
                    int[] iArr = fi.ap;
                    iArr[i] = iArr[i] | -16777216;
                }
                i++;
            } catch (Throwable e) {
                throw ei.ac(e, "ht.al(" + ')');
            }
        }
    }
}
