package defpackage;

public class dn {
    public static final dn ac = new dn("MEDIUM", 0, 1, 2);
    public static final dn aj = new dn("SMALL", 1, 0, 4);
    static final int al = 16;
    public static final dn an = new dn("LARGE", 2, 2, 0);
    static final int ap = 128;
    static final int at = 14;
    public static final int cq = 89;
    static em lf;
    final int aa;
    final int ak;
    final int ao;
    final String aq;

    dn(String str, int i, int i2, int i3) {
        try {
            this.aq = str;
            this.ao = -131089385 * i;
            this.aa = 1403230701 * i2;
            this.ak = -1055672523 * i3;
        } catch (Throwable e) {
            throw ei.ac(e, "dn.<init>(" + ')');
        }
    }

    boolean ac(float f) {
        return f >= ((float) (-1294458083 * this.ak));
    }

    boolean aj(float f, int i) {
        try {
            return f >= ((float) (-1294458083 * this.ak));
        } catch (Throwable e) {
            throw ei.ac(e, "dn.aj(" + ')');
        }
    }

    static void ak(byte b) {
        try {
            fu.aa = 0;
            for (int i = 0; i < bq.ai; i++) {
                fu.ao[i] = null;
                fu.aq[i] = (byte) 1;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dn.ak(" + ')');
        }
    }
}
