package defpackage;

public class gm extends jt {
    static jb aj = new jb(32);
    public static String as;
    int[] ac;
    int[] an;

    gm() {
        try {
            this.ac = new int[]{-1};
            this.an = new int[]{0};
        } catch (Throwable e) {
            throw ei.ac(e, "gm.<init>(" + ')');
        }
    }

    static void aj(int i, le leVar, jn jnVar, int i2) {
        try {
            jd jdVar = new jd();
            jdVar.aj = -1124246311;
            jdVar.fy = (long) i;
            jdVar.an = leVar;
            jdVar.aq = jnVar;
            jv.aj.ai(jdVar, 1842276969);
            jv.aj.ac(146590397);
        } catch (Throwable e) {
            throw ei.ac(e, "gm.aj(" + ')');
        }
    }

    static void an(int i, int i2, int i3, int i4) {
        gm gmVar = (gm) aj.aj((long) i);
        if (gmVar == null) {
            gmVar = new gm();
            aj.ac(gmVar, (long) i);
        }
        if (gmVar.ac.length <= i2) {
            int i5;
            int[] iArr = new int[(i2 + 1)];
            int[] iArr2 = new int[(i2 + 1)];
            for (i5 = 0; i5 < gmVar.ac.length; i5++) {
                iArr[i5] = gmVar.ac[i5];
                iArr2[i5] = gmVar.an[i5];
            }
            for (i5 = gmVar.ac.length; i5 < i2; i5++) {
                iArr[i5] = -1;
                iArr2[i5] = 0;
            }
            gmVar.ac = iArr;
            gmVar.an = iArr2;
        }
        gmVar.ac[i2] = i3;
        gmVar.an[i2] = i4;
    }

    static fs ac(byte[] bArr, byte b) {
        int i = 0;
        try {
            int ay;
            int i2;
            fs fsVar = new fs();
            he heVar = new he(bArr);
            heVar.ac = (heVar.aj.length - 2) * -984165911;
            int length = ((heVar.aj.length - 2) - heVar.ay((byte) 1)) - 12;
            heVar.ac = length * -984165911;
            int ad = heVar.ad((byte) -62);
            fsVar.ao = heVar.ay((byte) 1) * -1452960939;
            fsVar.aa = heVar.ay((byte) 1) * 1251607983;
            fsVar.ak = heVar.ay((byte) 1) * 310299533;
            fsVar.ap = heVar.ay((byte) 1) * 1255027197;
            int au = heVar.au(-310118664);
            if (au > 0) {
                fsVar.at = fsVar.an(au, 459540357);
                for (int i3 = 0; i3 < au; i3++) {
                    ay = heVar.ay((byte) 1);
                    jk jkVar = new jk(cf.an(ay, 579688084));
                    fsVar.at[i3] = jkVar;
                    while (true) {
                        i2 = ay - 1;
                        if (ay <= 0) {
                            break;
                        }
                        jkVar.ac(new jp(heVar.ad((byte) -34)), (long) heVar.ad((byte) -96));
                        ay = i2;
                    }
                }
            }
            heVar.ac = 0;
            heVar.bm((byte) 5);
            fsVar.ac = new int[ad];
            fsVar.an = new int[ad];
            fsVar.aq = new String[ad];
            while (heVar.ac * 489625177 < length) {
                i2 = heVar.ay((byte) 1);
                if (i2 == 3) {
                    fsVar.aq[i] = heVar.bh(-1070911362);
                } else if (i2 >= 100 || 21 == i2 || i2 == 38 || 39 == i2) {
                    fsVar.an[i] = heVar.au(-310118664);
                } else {
                    fsVar.an[i] = heVar.ad((byte) -53);
                }
                ay = i + 1;
                fsVar.ac[i] = i2;
                i = ay;
            }
            return fsVar;
        } catch (Throwable e) {
            throw ei.ac(e, "gm.ac(" + ')');
        }
    }

    static final int be(int i, int i2, int i3, int i4, int i5) {
        return ((i4 * i2) + (i3 * i)) >> 16;
    }
}
