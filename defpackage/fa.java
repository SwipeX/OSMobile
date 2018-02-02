package defpackage;

public class fa extends jt {
    static final int ag = 3;
    public static final int ak = 100;
    static final int be = 3;
    static final int bq = 42;
    int ac;
    int aj;
    int an;
    int aq;

    fa(int i, int i2, int i3, int i4) {
        try {
            this.aj = -295282783 * i;
            this.ac = 798974141 * i2;
            this.an = 1439400981 * i3;
            this.aq = -906956531 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "fa.<init>(" + ')');
        }
    }

    void ac(int i, int i2, int i3, int i4) {
        this.aj = -295282783 * i;
        this.ac = 798974141 * i2;
        this.an = 1439400981 * i3;
        this.aq = -906956531 * i4;
    }

    void aj(int i, int i2, int i3, int i4, byte b) {
        try {
            this.aj = -295282783 * i;
            this.ac = 798974141 * i2;
            this.an = 1439400981 * i3;
            this.aq = -906956531 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "fa.aj(" + ')');
        }
    }

    void an(int i, int i2, int i3, int i4) {
        this.aj = -248079155 * i;
        this.ac = 798974141 * i2;
        this.an = 1439400981 * i3;
        this.aq = -906956531 * i4;
    }

    public static void aj(ju juVar, short s) {
        try {
            ao.aj = juVar;
        } catch (Throwable e) {
            throw ei.ac(e, "fa.aj(" + ')');
        }
    }

    public static String aq(int i, boolean z, int i2) {
        if (!z || i < 0) {
            try {
                return Integer.toString(i);
            } catch (Throwable e) {
                throw ei.ac(e, "fa.aq(" + ')');
            }
        } else if (!z || i < 0) {
            return Integer.toString(i, 10);
        } else {
            int i3 = 2;
            int i4 = i / 10;
            while (i4 != 0) {
                i4 /= 10;
                i3++;
            }
            char[] cArr = new char[i3];
            cArr[0] = '+';
            i4 = i3 - 1;
            while (i4 > 0) {
                i3 = i / 10;
                int i5 = i - (i3 * 10);
                if (i5 >= 10) {
                    cArr[i4] = (char) (i5 + 87);
                } else {
                    cArr[i4] = (char) (i5 + 48);
                }
                i4--;
                i = i3;
            }
            return new String(cArr);
        }
    }

    static final void ec(int i, int i2, int i3) {
        try {
            if (ku.an(i, 1671262481)) {
                hv.ea(ab.aa[i], i2, 2111123898);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fa.ec(" + ')');
        }
    }
}
