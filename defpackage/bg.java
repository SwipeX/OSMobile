package defpackage;

public final class bg {
    public static final int aw = 4096;
    static int ct = 0;
    static kh dt = null;
    static final int lv = 100;
    public ci aa;
    int ac;
    int aj;
    public ci ak;
    int an;
    int ao;
    public int ap;
    int aq;
    int at;

    bg() {
        try {
            this.ap = 0;
            this.at = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "bg.<init>(" + ')');
        }
    }

    static final void di(fo foVar, byte b) {
        int i = 0;
        try {
            int bp;
            int i2;
            if (foVar.ac * 578276603 == 0) {
                bp = ci.el.bp(foVar.aj * -1170067687, foVar.an * -1376857645, foVar.aq * -972120605);
            } else {
                bp = 0;
            }
            if (foVar.ac * 578276603 == 1) {
                bp = ci.el.bm(foVar.aj * -1170067687, foVar.an * -1376857645, foVar.aq * -972120605);
            }
            if (2 == foVar.ac * 578276603) {
                bp = ci.el.bh(foVar.aj * -1170067687, foVar.an * -1376857645, foVar.aq * -972120605);
            }
            if (3 == foVar.ac * 578276603) {
                bp = ci.el.bt(foVar.aj * -1170067687, foVar.an * -1376857645, foVar.aq * -972120605);
            }
            if (bp != 0) {
                i = ci.el.br(foVar.aj * -1170067687, foVar.an * -1376857645, foVar.aq * -972120605, bp);
                bp = (bp >> 14) & 32767;
                i2 = i & 31;
                i = (i >> 6) & 3;
            } else {
                bp = -1;
                i2 = 0;
            }
            foVar.ao = bp * 198610029;
            foVar.ak = i2 * 1496679233;
            foVar.aa = i * -1862861971;
        } catch (Throwable e) {
            throw ei.ac(e, "bg.di(" + ')');
        }
    }
}
