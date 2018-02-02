package defpackage;

public class dc {
    static int[] bm = null;
    static final int bp = 8;
    public static final int cv = 90;
    public bt ac;
    public int aj;
    public bt an;

    public dc(int i, bt btVar, bt btVar2) {
        try {
            this.aj = -1916325865 * i;
            this.ac = btVar;
            this.an = btVar2;
        } catch (Throwable e) {
            throw ei.ac(e, "dc.<init>(" + ')');
        }
    }

    static fs aj(int i, int i2) {
        try {
            fs fsVar = (fs) fs.aj.aj((long) i);
            if (fsVar != null) {
                return fsVar;
            }
            byte[] an = ld.cf.an(i, 0, -2146311326);
            if (an == null) {
                return null;
            }
            fsVar = gm.ac(an, (byte) 13);
            fs.aj.an(fsVar, (long) i);
            return fsVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dc.aj(" + ')');
        }
    }

    static final void aa(bl blVar, int i) {
        try {
            if (!cm.aa) {
                int i2 = cc.bp;
                int i3 = cc.bm;
                int i4 = cc.bh;
                int i5 = cc.bt;
                int i6 = (((cm.aq * -110972263) - (blVar.br * 266497203)) * 50) / (blVar.bt * 411538491);
                int i7 = (((cm.ao * 1815686859) - (blVar.bb * 1621686031)) * 50) / (blVar.bt * 411538491);
                int i8 = (((cm.aq * -110972263) - (blVar.br * 266497203)) * 3500) / (blVar.bt * 411538491);
                int i9 = (((cm.ao * 1815686859) - (blVar.bb * 1621686031)) * 3500) / (blVar.bt * 411538491);
                int be = gm.be(i7, 50, i3, i2, -476819872);
                int i10 = ((50 * i3) - (i7 * i2)) >> 16;
                i7 = gm.be(i9, 3500, i3, i2, -746880107);
                i2 = ((i3 * 3500) - (i2 * i9)) >> 16;
                i3 = bn.ba(i6, i10, i5, i4, (byte) -25);
                i10 = ((i10 * i5) + (i4 * i6)) >> 16;
                int ba = bn.ba(i8, i2, i5, i4, (byte) -81);
                i2 = gv.bv(i8, i2, i5, i4, 751305408);
                lb.ak = -1784081527 * ((i3 + ba) / 2);
                co.ap = ((i7 + be) / 2) * -1651369955;
                bp.at = ((i10 + i2) / 2) * 1203784499;
                ec.ah = ((ba - i3) / 2) * 411593257;
                cm.ai = -938802327 * ((i7 - be) / 2);
                bm.aw = ((i2 - i10) / 2) * -867745597;
                bb.am = Math.abs(ec.ah * 970510873) * 2095292341;
                ep.ae = Math.abs(-691946279 * cm.ai) * -1749012839;
                cm.as = Math.abs(bm.aw * 205615083) * -733900529;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dc.aa(" + ')');
        }
    }
}
