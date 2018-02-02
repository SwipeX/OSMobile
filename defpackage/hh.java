package defpackage;

public class hh {
    static final hh ac = new hh("BUILDLIVE", 3);
    static final int ah = 5;
    static final hh aj = new hh("LIVE", 0);
    static final hh an = new hh("RC", 1);
    static final hh aq = new hh("WIP", 2);
    static final int at = 4;
    static jn bf;
    final int aa;
    public final String ao;

    hh(String str, int i) {
        try {
            this.ao = str;
            this.aa = -1668970547 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "hh.<init>(" + ')');
        }
    }

    public static hh ac(int i) {
        int i2 = 0;
        hh[] hhVarArr = new hh[]{aq, aj, ac, an};
        while (i2 < hhVarArr.length) {
            hh hhVar = hhVarArr[i2];
            if (-425018107 * hhVar.aa == i) {
                return hhVar;
            }
            i2++;
        }
        return null;
    }

    public static hh an(int i) {
        int i2 = 0;
        hh[] hhVarArr = new hh[]{aq, aj, ac, an};
        while (i2 < hhVarArr.length) {
            hh hhVar = hhVarArr[i2];
            if (-425018107 * hhVar.aa == i) {
                return hhVar;
            }
            i2++;
        }
        return null;
    }

    public static hh aq(int i) {
        int i2 = 0;
        hh[] hhVarArr = new hh[]{aq, aj, ac, an};
        while (i2 < hhVarArr.length) {
            hh hhVar = hhVarArr[i2];
            if (-425018107 * hhVar.aa == i) {
                return hhVar;
            }
            i2++;
        }
        return null;
    }

    public static final void aj(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            cs.ao.ac(new cg(i, i2, i3, i4, i5));
        } catch (Throwable e) {
            throw ei.ac(e, "hh.aj(" + ')');
        }
    }
}
