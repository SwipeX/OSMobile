package defpackage;

public abstract class ef {
    static ab am = null;
    static final int ap = 1;
    static final int bc = 50;
    static ll bq = null;
    static final int cb = 1001;
    public int[] an;
    int ao;
    int aq;

    ef() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ef.<init>(" + ')');
        }
    }

    static final void ac(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        } catch (Throwable e2) {
            throw ei.ac(e2, "ef.ac(" + ')');
        }
    }

    static String an(jk jkVar, int i, String str, int i2) {
        if (jkVar == null) {
            return str;
        }
        try {
            kg kgVar = (kg) jkVar.aj((long) i);
            return kgVar != null ? (String) kgVar.aj : str;
        } catch (Throwable e) {
            throw ei.ac(e, "ef.an(" + ')');
        }
    }

    static final void cq(int i, int i2, int i3, byte b) {
        if (i < cj.ak || i2 < cj.ak || i > 13056 || i2 > 13056) {
            try {
                client.gz = 271960645;
                client.gp = -995736643;
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "ef.cq(" + ')');
            }
        }
        int i4 = i - (cz.fz * 1130591639);
        int cv = (fb.cv(i, i2, -2005147175 * lw.hn, 43396355) - i3) - (1712599549 * le.fo);
        int i5 = i2 - (-749631659 * ac.fk);
        int i6 = bl.az[cz.ft * 934655837];
        int i7 = bl.ax[934655837 * cz.ft];
        int i8 = bl.az[ew.ff * 1224751421];
        int i9 = bl.ax[ew.ff * 1224751421];
        int i10 = ((i4 * i9) + (i8 * i5)) >> 16;
        i4 = ((i5 * i9) - (i4 * i8)) >> 16;
        i5 = ((cv * i7) - (i6 * i4)) >> 16;
        cv = ((cv * i6) + (i4 * i7)) >> 16;
        if (cv >= 50) {
            client.gz = -271960645 * (((1889242427 * client.ne) / 2) + (((client.nl * -91800499) * i10) / cv));
            client.gp = ((((client.nl * -91800499) * i5) / cv) + ((1949695293 * client.nn) / 2)) * 995736643;
            return;
        }
        client.gz = 271960645;
        client.gp = -995736643;
    }

    static final void dq(int i, int i2, int i3) {
        try {
            jm jmVar = client.hq[lw.hn * -2005147175][i][i2];
            if (jmVar == null) {
                ci.el.ay(lw.hn * -2005147175, i, i2);
                return;
            }
            jt jtVar = null;
            long j = -99999999;
            for (jt jtVar2 = (gp) jmVar.ak(); jtVar2 != null; jtVar2 = (gp) jmVar.at()) {
                long j2;
                av ac = al.ac(-273252807 * jtVar2.aj, (short) 5177);
                long j3 = (long) (ac.br * -296615951);
                if (1 == ac.bt * -559602733) {
                    j3 *= (long) ((jtVar2.ac * -1285895443) + 1);
                }
                if (j3 > j) {
                    jtVar = jtVar2;
                    j2 = j3;
                } else {
                    j2 = j;
                }
                j = j2;
            }
            if (jtVar == null) {
                ci.el.ay(lw.hn * -2005147175, i, i2);
                return;
            }
            jmVar.an(jtVar);
            ci ciVar = null;
            ci ciVar2 = null;
            for (ci ciVar3 = (gp) jmVar.ak(); ciVar3 != null; gp gpVar = (gp) jmVar.at()) {
                if (ciVar3.aj * -273252807 != jtVar.aj * -273252807) {
                    if (ciVar == null) {
                        ciVar = ciVar3;
                    }
                    if (ciVar3.aj * -273252807 != ciVar.aj * -273252807 && ciVar2 == null) {
                        ciVar2 = ciVar3;
                    }
                }
            }
            int i4 = 1610612736 + ((i2 << 7) + i);
            ci.el.ap(lw.hn * -2005147175, i, i2, fb.cv((i * cj.ak) + 64, (i2 * cj.ak) + 64, -2005147175 * lw.hn, 1315067131), jtVar, i4, ciVar, ciVar2);
        } catch (Throwable e) {
            throw ei.ac(e, "ef.dq(" + ')');
        }
    }

    static final void fz(String str, int i) {
        try {
            if (bt.lw != null) {
                mg ac = hd.ac(mr.bl, client.dp.ao, (byte) 58);
                ac.an.an(cx.ah(str, -192767833), (byte) -3);
                ac.an.ai(str, 243029417);
                client.dp.an(ac, 1257376800);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ef.fz(" + ')');
        }
    }
}
