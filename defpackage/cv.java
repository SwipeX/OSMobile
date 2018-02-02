package defpackage;

public abstract class cv extends jt {
    static final int af = 20;
    static String ch;

    abstract void ac(es esVar, int i);

    abstract void ao(es esVar);

    abstract void aq(es esVar);

    cv() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "cv.<init>(" + ')');
        }
    }

    static final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7, es esVar) {
        int[] bf = cc.bf(i, i2, i3);
        int[] bf2 = cc.bf(i4, i5, i6);
        esVar.as(bf[0], bf[1], bf2[0], bf2[1], i7, (byte) 8);
    }

    static final int as(int i, int i2, int i3, int i4) {
        int i5 = 256 - i3;
        return ((((i5 * (i & 16711935)) + ((i2 & 16711935) * i3)) & -16711936) + ((((i2 & 65280) * i3) + ((65280 & i) * i5)) & 16711680)) >> 8;
    }

    static void eg(int i) {
        try {
            for (fr frVar = (fr) client.ic.aq(); frVar != null; frVar = (fr) client.ic.ao()) {
                int i2 = frVar.aj * -1696662607;
                if (ku.an(i2, 1671262481)) {
                    boolean z = true;
                    ab[] abVarArr = ab.aa[i2];
                    for (i2 = 0; i2 < abVarArr.length; i2++) {
                        if (abVarArr[i2] != null) {
                            z = abVarArr[i2].az;
                            break;
                        }
                    }
                    if (!z) {
                        ab aj = ac.aj((int) frVar.fy, 857820735);
                        if (aj != null) {
                            cf.ew(aj, (byte) -45);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cv.eg(" + ')');
        }
    }
}
