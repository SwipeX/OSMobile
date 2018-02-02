package defpackage;

public class ak implements hp {
    static final ak ac = new ak(0, 1);
    static final ak aj = new ak(1, 0);
    static final ak an = new ak(2, 2);
    static byte[][][] ap = null;
    static final int ay = 1600;
    static final int cf = 1006;
    public static final int ct = 1010;
    static final int mm = 50;
    final int ao;
    public final int aq;

    static ak[] an() {
        return new ak[]{ac, aj, an};
    }

    ak(int i, int i2) {
        try {
            this.aq = 1030784373 * i;
            this.ao = 563150843 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "ak.<init>(" + ')');
        }
    }

    public int aa() {
        return this.ao * -1225116877;
    }

    public int ac(byte b) {
        try {
            return this.ao * -1225116877;
        } catch (Throwable e) {
            throw ei.ac(e, "ak.ac(" + ')');
        }
    }

    public int ao() {
        return this.ao * -1225116877;
    }

    public int aq() {
        return this.ao * -1225116877;
    }

    public static ae aj(int i, int i2) {
        try {
            ae aeVar = (ae) ae.aq.aj((long) i);
            if (aeVar == null) {
                byte[] an = ae.aj.an(3, i, -1369511576);
                aeVar = new ae();
                if (an != null) {
                    aeVar.ac(new he(an), (byte) 9);
                }
                ae.aq.an(aeVar, (long) i);
            }
            return aeVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ak.aj(" + ')');
        }
    }

    public static int an(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (1 != (i6 & 1)) {
            int i8 = i5;
            i5 = i4;
            i4 = i8;
        }
        int i9 = i3 & 3;
        if (i9 == 0) {
            return i2;
        }
        if (i9 == 1) {
            return (7 - i) - (i5 - 1);
        }
        if (2 == i9) {
            return (7 - i2) - (i4 - 1);
        }
        return i;
    }

    static int ao(int i, int i2) {
        try {
            gj gjVar = (gj) gt.aj.get(Integer.valueOf(i));
            if (gjVar == null) {
                return 0;
            }
            return gjVar.an(843595135);
        } catch (Throwable e) {
            throw ei.ac(e, "ak.ao(" + ')');
        }
    }
}
