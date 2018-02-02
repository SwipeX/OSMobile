package defpackage;

public class cf {
    static jn cy = null;
    static final int cz = 14;
    public static ab gl;
    int ac;
    int aj;
    int an;

    cf() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "cf.<init>(" + ')');
        }
    }

    public static final void aj(short s) {
        try {
            cm.an = false;
            cm.al = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "cf.aj(" + ')');
        }
    }

    public static int an(int i, int i2) {
        int i3 = i - 1;
        i3 |= i3 >>> 1;
        i3 |= i3 >>> 2;
        i3 |= i3 >>> 4;
        i3 |= i3 >>> 8;
        return (i3 | (i3 >>> 16)) + 1;
    }

    public static boolean aj(ju juVar, ju juVar2, int i) {
        int i2 = 0;
        try {
            aa.aj = juVar2;
            if (!juVar.ap((byte) 1)) {
                return false;
            }
            bh.an = juVar.as(35, 415667447) * 1488782747;
            aa.ac = new aa[(bh.an * -1117661037)];
            while (i2 < bh.an * -1117661037) {
                byte[] an = juVar.an(35, i2, -1735756755);
                if (an != null) {
                    aa.ac[i2] = new aa(i2);
                    aa.ac[i2].ac(new he(an), (byte) -5);
                    aa.ac[i2].aq((byte) 69);
                }
                i2++;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "cf.aj(" + ')');
        }
    }

    public static void ew(ab abVar, byte b) {
        try {
            if (client.ku * -85787703 == -1416137711 * abVar.fw) {
                client.ke[-1147874581 * abVar.fs] = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cf.ew(" + ')');
        }
    }
}
