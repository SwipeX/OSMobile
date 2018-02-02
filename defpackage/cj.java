package defpackage;

public class cj {
    public static final int aa = 4;
    public static short[][] ah = null;
    public static final int aj = 2;
    public static final int ak = 128;
    public static final int al = 2;
    public static final int am = 1024;
    public static final int an = 1;
    public static final int ap = 16;
    public static final int at = 512;
    public static final int az = 32;
    static ck ht;

    public static ap aj(int i, int i2) {
        try {
            ap apVar = (ap) ap.ac.aj((long) i);
            if (apVar == null) {
                byte[] an = ap.aj.an(5, i, -1740598670);
                apVar = new ap();
                if (an != null) {
                    apVar.ac(new he(an), (byte) 26);
                }
                ap.ac.an(apVar, (long) i);
            }
            return apVar;
        } catch (Throwable e) {
            throw ei.ac(e, "cj.aj(" + ')');
        }
    }

    cj() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "cj.<init>(" + ')');
        }
    }

    static int ak(int i, fs fsVar, boolean z, int i2) {
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = gr.ak;
                int i3 = dy.ap - -401924967;
                dy.ap = i3;
                ab aj = ac.aj(iArr[i3 * -38307927], 96452996);
            } catch (Throwable e) {
                throw ei.ac(e, "cj.ak(" + ')');
            }
        }
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        aj = abVar;
        int i4;
        if (i == 1300) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            int i5 = iArr[i4 * -38307927] - 1;
            if (i5 < 0 || i5 > 9) {
                di.ah -= 436804489;
                return 1;
            }
            String[] strArr = gr.at;
            int i6 = di.ah - 436804489;
            di.ah = i6;
            aj.as(i5, strArr[i6 * 1894369977], (short) -20688);
            return 1;
        } else if (i == 1301) {
            dy.ap -= -803849934;
            aj.dq = li.ac(gr.ak[dy.ap * -38307927], gr.ak[(dy.ap * -38307927) + 1], 324434421);
            return 1;
        } else if (1302 == i) {
            boolean z2;
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            if (iArr[i4 * -38307927] == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aj.dj = z2;
            return 1;
        } else if (1303 == i) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            aj.dt = iArr[i4 * -38307927] * 998318869;
            return 1;
        } else if (i == 1304) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            aj.do = iArr[i4 * -38307927] * 1342029921;
            return 1;
        } else if (1305 == i) {
            r0 = gr.at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            aj.dw = r0[i4 * 1894369977];
            return 1;
        } else if (i == 1306) {
            r0 = gr.at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            aj.dz = r0[i4 * 1894369977];
            return 1;
        } else if (i != 1307) {
            return 2;
        } else {
            aj.dv = null;
            return 1;
        }
    }
}
