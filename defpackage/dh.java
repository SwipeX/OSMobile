package defpackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class dh extends df {
    public static final int al = 32;
    static jn bg;
    static int mg;
    HashSet ac;
    HashSet aj;
    List an;

    dh() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "dh.<init>(" + ')');
        }
    }

    void aj(he heVar, he heVar2, he heVar3, int i, boolean z, byte b) {
        int i2;
        int i3 = 0;
        ap(heVar, i, 1845559781);
        int ay = heVar3.ay((byte) 1);
        this.aj = new HashSet(ay);
        for (i2 = 0; i2 < ay; i2++) {
            dv dvVar = new dv();
            try {
                dvVar.ar(heVar2, heVar3, (byte) 1);
                try {
                    this.aj.add(dvVar);
                } catch (Throwable e) {
                    throw ei.ac(e, "dh.aj(" + ')');
                }
            } catch (IllegalStateException e2) {
            }
        }
        i2 = heVar3.ay((byte) 1);
        this.ac = new HashSet(i2);
        while (i3 < i2) {
            da daVar = new da();
            try {
                daVar.ar(heVar2, heVar3, (byte) 3);
                this.ac.add(daVar);
            } catch (IllegalStateException e3) {
            }
            i3++;
        }
        ac(heVar2, z, 1102556338);
    }

    void an(he heVar, he heVar2, he heVar3, int i, boolean z) {
        int i2;
        int i3 = 0;
        ap(heVar, i, 1845559781);
        int ay = heVar3.ay((byte) 1);
        this.aj = new HashSet(ay);
        for (i2 = 0; i2 < ay; i2++) {
            dv dvVar = new dv();
            try {
                dvVar.ar(heVar2, heVar3, (byte) 1);
                this.aj.add(dvVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = heVar3.ay((byte) 1);
        this.ac = new HashSet(i2);
        while (i3 < i2) {
            da daVar = new da();
            try {
                daVar.ar(heVar2, heVar3, (byte) 3);
                this.ac.add(daVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        ac(heVar2, z, 1102556338);
    }

    void aq(he heVar, he heVar2, he heVar3, int i, boolean z) {
        int i2;
        int i3 = 0;
        ap(heVar, i, 1845559781);
        int ay = heVar3.ay((byte) 1);
        this.aj = new HashSet(ay);
        for (i2 = 0; i2 < ay; i2++) {
            dv dvVar = new dv();
            try {
                dvVar.ar(heVar2, heVar3, (byte) 1);
                this.aj.add(dvVar);
            } catch (IllegalStateException e) {
            }
        }
        i2 = heVar3.ay((byte) 1);
        this.ac = new HashSet(i2);
        while (i3 < i2) {
            da daVar = new da();
            try {
                daVar.ar(heVar2, heVar3, (byte) 3);
                this.ac.add(daVar);
            } catch (IllegalStateException e2) {
            }
            i3++;
        }
        ac(heVar2, z, 1102556338);
    }

    static final boolean an(byte b) {
        try {
            return cm.an;
        } catch (Throwable e) {
            throw ei.ac(e, "dh.an(" + ')');
        }
    }

    void aa(he heVar, boolean z) {
        this.an = new LinkedList();
        int ay = heVar.ay((byte) 1);
        for (int i = 0; i < ay; i++) {
            int by = heVar.by((byte) -62);
            bt btVar = new bt(heVar.ad((byte) -60));
            byte b;
            if (heVar.au(-310118664) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dt(by, btVar));
            }
        }
    }

    void ac(he heVar, boolean z, int i) {
        try {
            this.an = new LinkedList();
            int ay = heVar.ay((byte) 1);
            for (int i2 = 0; i2 < ay; i2++) {
                int by = heVar.by((byte) -121);
                bt btVar = new bt(heVar.ad((byte) -8));
                Object obj;
                if (heVar.au(-310118664) == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (z || r0 == null) {
                    this.an.add(new dt(by, btVar));
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dh.ac(" + ')');
        }
    }

    void ak(he heVar, boolean z) {
        this.an = new LinkedList();
        int ay = heVar.ay((byte) 1);
        for (int i = 0; i < ay; i++) {
            int by = heVar.by((byte) -37);
            bt btVar = new bt(heVar.ad((byte) -102));
            byte b;
            if (heVar.au(-310118664) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dt(by, btVar));
            }
        }
    }

    void ao(he heVar, boolean z) {
        this.an = new LinkedList();
        int ay = heVar.ay((byte) 1);
        for (int i = 0; i < ay; i++) {
            int by = heVar.by((byte) -13);
            bt btVar = new bt(heVar.ad((byte) -115));
            byte b;
            if (heVar.au(-310118664) == 1) {
                b = (byte) 1;
            } else {
                b = (byte) 0;
            }
            if (z || r0 == (byte) 0) {
                this.an.add(new dt(by, btVar));
            }
        }
    }

    static int av(byte b) {
        try {
            if (client.od == null || client.ox * -1116903485 >= client.od.size()) {
                return am.ap;
            }
            int i = 0;
            for (int i2 = 0; i2 <= client.ox * -1116903485; i2++) {
                i += ((gk) client.od.get(i2)).aq * -1395170625;
            }
            return (i * am.ap) / (-711691705 * client.oe);
        } catch (Throwable e) {
            throw ei.ac(e, "dh.av(" + ')');
        }
    }

    static final void bc(fx fxVar, int i) {
        try {
            ax aj;
            fxVar.an = false;
            if (-1 != 118674673 * fxVar.cp) {
                aj = bn.aj(118674673 * fxVar.cp, (byte) 0);
                if (aj == null || aj.aa == null) {
                    fxVar.cp = -432905233;
                } else {
                    fxVar.cm -= 1095453219;
                    if (fxVar.ct * -1099104265 < aj.aa.length && -364688779 * fxVar.cm > aj.ap[fxVar.ct * -1099104265]) {
                        fxVar.cm = -1095453219;
                        fxVar.ct -= 357600825;
                        bs.bd(aj, fxVar.ct * -1099104265, 1948391561 * fxVar.br, fxVar.bb * -1461980333, (byte) -78);
                    }
                    if (fxVar.ct * -1099104265 >= aj.aa.length) {
                        fxVar.cm = 0;
                        fxVar.ct = 0;
                        bs.bd(aj, fxVar.ct * -1099104265, 1948391561 * fxVar.br, fxVar.bb * -1461980333, (byte) -49);
                    }
                }
            }
            if (-1 != 250310271 * fxVar.cv && client.af * 901275591 >= fxVar.cs * 1048208339) {
                if (fxVar.cu * -1285639099 < 0) {
                    fxVar.cu = 0;
                }
                int i2 = aj.ac(fxVar.cv * 250310271, (byte) 26).ak * 1125072369;
                if (-1 != i2) {
                    aj = bn.aj(i2, (byte) 0);
                    if (aj == null || aj.aa == null) {
                        fxVar.cv = -566382975;
                    } else {
                        fxVar.cg -= 1003346191;
                        if (fxVar.cu * -1285639099 < aj.aa.length && -1316615663 * fxVar.cg > aj.ap[fxVar.cu * -1285639099]) {
                            fxVar.cg = -1003346191;
                            fxVar.cu += 1045839501;
                            bs.bd(aj, fxVar.cu * -1285639099, 1948391561 * fxVar.br, fxVar.bb * -1461980333, (byte) -97);
                        }
                        if (fxVar.cu * -1285639099 >= aj.aa.length && (fxVar.cu * -1285639099 < 0 || fxVar.cu * -1285639099 >= aj.aa.length)) {
                            fxVar.cv = -566382975;
                        }
                    }
                } else {
                    fxVar.cv = -566382975;
                }
            }
            if (fxVar.ck * 1976380739 == -1 || -517274049 * fxVar.ci > 1 || bn.aj(1976380739 * fxVar.ck, (byte) 0).az * 918310743 != 1 || -1650834013 * fxVar.dw <= 0 || fxVar.cj * -873959361 > 901275591 * client.af || -1643784769 * fxVar.dk >= 901275591 * client.af) {
                if (fxVar.ck * 1976380739 != -1 && -517274049 * fxVar.ci == 0) {
                    aj = bn.aj(1976380739 * fxVar.ck, (byte) 0);
                    if (aj == null || aj.aa == null) {
                        fxVar.ck = 2042247317;
                    } else {
                        fxVar.ch += 1827062877;
                        if (fxVar.ce * 465728677 < aj.aa.length && fxVar.ch * 736964597 > aj.ap[fxVar.ce * 465728677]) {
                            fxVar.ch = 1827062877;
                            fxVar.ce += 1459639085;
                            bs.bd(aj, fxVar.ce * 465728677, 1948391561 * fxVar.br, fxVar.bb * -1461980333, (byte) -122);
                        }
                        if (fxVar.ce * 465728677 >= aj.aa.length) {
                            fxVar.ce -= -524338371 * aj.ah;
                            fxVar.cq += 557607353;
                            if (-338899831 * fxVar.cq >= 80962477 * aj.al) {
                                fxVar.ck = 2042247317;
                            } else if (fxVar.ce * 465728677 < 0 || fxVar.ce * 465728677 >= aj.aa.length) {
                                fxVar.ck = 2042247317;
                            } else {
                                bs.bd(aj, fxVar.ce * 465728677, fxVar.br * 1948391561, fxVar.bb * -1461980333, (byte) -78);
                            }
                        }
                        fxVar.an = aj.aw;
                    }
                }
                if (fxVar.ci * -517274049 > 0) {
                    fxVar.ci -= 1611262399;
                    return;
                }
                return;
            }
            fxVar.ci = 1611262399;
        } catch (Throwable e) {
            throw ei.ac(e, "dh.bc(" + ')');
        }
    }

    static final void cj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            fo foVar = (fo) client.hl.ak();
            while (foVar != null) {
                if (-1170067687 * foVar.aj == i && foVar.an * -1376857645 == i2 && i3 == -972120605 * foVar.aq && i4 == foVar.ac * 578276603) {
                    break;
                }
                foVar = (fo) client.hl.at();
            }
            foVar = null;
            if (foVar == null) {
                foVar = new fo();
                foVar.aj = 1959378217 * i;
                foVar.ac = -600154573 * i4;
                foVar.an = -204820901 * i2;
                foVar.aq = 2090700747 * i3;
                bg.di(foVar, (byte) 3);
                client.hl.ac(foVar);
            }
            foVar.ap = 1392689215 * i5;
            foVar.ah = -1073856681 * i6;
            foVar.at = 1079995147 * i7;
            foVar.ai = -329553195 * i8;
            foVar.aw = 632964427 * i9;
        } catch (Throwable e) {
            throw ei.ac(e, "dh.cj(" + ')');
        }
    }
}
