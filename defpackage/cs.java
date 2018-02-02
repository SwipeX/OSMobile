package defpackage;

import java.lang.reflect.Array;

public class cs {
    static final byte aa = (byte) 0;
    public static boolean ac = false;
    public static boolean aj = false;
    public static boolean an = false;
    public static jr ao = new jr();
    public static cu aq = cu.aj;
    public static final int cp = 1009;
    static int px;

    cs() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "cs.<init>(" + ')');
        }
    }

    public static final void an(int i, int i2, int i3, int i4, int i5) {
        ao.ac(new cg(i, i2, i3, i4, i5));
    }

    public static final void aq(int i, int i2, int i3, int i4, int i5) {
        ao.ac(new cg(i, i2, i3, i4, i5));
    }

    public static final void aa(es esVar) {
        while (true) {
            cv cvVar = (cv) ao.ao();
            if (cvVar != null) {
                cvVar.ac(esVar, 340014760);
            } else {
                return;
            }
        }
    }

    public static final void ao(es esVar) {
        while (true) {
            cv cvVar = (cv) ao.ao();
            if (cvVar != null) {
                cvVar.ac(esVar, 417373929);
            } else {
                return;
            }
        }
    }

    public static boolean aj(int i, byte b) {
        try {
            return (i >= if.aj.ar * -1757901075 && i <= if.aq.ar * -1757901075) || if.ao.ar * -1757901075 == i;
        } catch (Throwable e) {
            throw ei.ac(e, "cs.aj(" + ')');
        }
    }

    static final void bw(fx fxVar, byte b) {
        try {
            if (client.af * 901275591 == fxVar.dk * -1643784769 || -1 == 1976380739 * fxVar.ck || -517274049 * fxVar.ci != 0 || (736964597 * fxVar.ch) + 1 > bn.aj(fxVar.ck * 1976380739, aa).ap[fxVar.ce * 465728677]) {
                int i = (fxVar.dk * -1643784769) - (fxVar.cj * -873959361);
                int i2 = (client.af * 901275591) - (fxVar.cj * -873959361);
                int i3 = (fxVar.cn * -1240347264) + (fxVar.bd * 688518592);
                int i4 = (1516380800 * fxVar.cz) + (fxVar.bd * 688518592);
                fxVar.br = (((((-1486504832 * fxVar.cd) + (fxVar.bd * 688518592)) * (i - i2)) + (((fxVar.bd * 688518592) + (fxVar.cw * -1467035776)) * i2)) / i) * 1530846649;
                fxVar.bb = (((i2 * i4) + (i3 * (i - i2))) / i) * -376780581;
            }
            fxVar.di = 0;
            fxVar.de = 1457340519 * fxVar.dh;
            fxVar.bu = -906579389 * fxVar.de;
        } catch (Throwable e) {
            throw ei.ac(e, "cs.bw(" + ')');
        }
    }

    static final void cg(boolean z, hn hnVar, byte b) {
        try {
            client.ex = z;
            int ay;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            if (client.ex) {
                int co = hnVar.co((byte) -96);
                Object obj = hnVar.bg(-2143635548) == 1 ? 1 : null;
                int cf = hnVar.cf((byte) 18);
                ay = hnVar.ay((byte) 1);
                hnVar.jl(-466055063);
                for (i = 0; i < 4; i++) {
                    for (i2 = 0; i2 < 13; i2++) {
                        for (i3 = 0; i3 < 13; i3++) {
                            if (1 == hnVar.jc(1, 1991534306)) {
                                client.ed[i][i2][i3] = hnVar.jc(26, 1646684843);
                            } else {
                                client.ed[i][i2][i3] = -1;
                            }
                        }
                    }
                }
                hnVar.jz((byte) 4);
                al.ek = (int[][]) Array.newInstance(Integer.TYPE, new int[]{ay, 4});
                for (i2 = 0; i2 < ay; i2++) {
                    for (i3 = 0; i3 < 4; i3++) {
                        al.ek[i2][i3] = hnVar.ad((byte) -54);
                    }
                }
                eo.ep = new int[ay];
                dg.ej = new int[ay];
                bl.eh = new int[ay];
                fm.eb = new byte[ay][];
                ck.ez = new byte[ay][];
                i2 = 0;
                for (i4 = 0; i4 < 4; i4++) {
                    i5 = 0;
                    while (i5 < 13) {
                        i3 = i2;
                        for (ay = 0; ay < 13; ay++) {
                            i2 = client.ed[i4][i5][ay];
                            if (i2 != -1) {
                                i2 = (((i2 >> 3) & 2047) / 8) + ((((i2 >> 14) & 1023) / 8) << 8);
                                for (i = 0; i < i3; i++) {
                                    if (i2 == eo.ep[i]) {
                                        i2 = -1;
                                        break;
                                    }
                                }
                                if (i2 != -1) {
                                    eo.ep[i3] = i2;
                                    i = (i2 >> 8) & 255;
                                    i2 &= 255;
                                    dg.ej[i3] = hh.bf.au("m" + i + "_" + i2, -1450462111);
                                    bl.eh[i3] = hh.bf.au("l" + i + "_" + i2, -1255631869);
                                    i3++;
                                }
                            }
                        }
                        i5++;
                        i2 = i3;
                    }
                }
                by.cx(co, cf, obj == null, 511735919);
                return;
            }
            int i6;
            ay = hnVar.co((byte) -112);
            i5 = hnVar.cf((byte) 35);
            i2 = hnVar.ay((byte) 1);
            al.ek = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, 4});
            for (i6 = 0; i6 < i2; i6++) {
                for (i3 = 0; i3 < 4; i3++) {
                    al.ek[i6][i3] = hnVar.ad((byte) -82);
                }
            }
            eo.ep = new int[i2];
            dg.ej = new int[i2];
            bl.eh = new int[i2];
            fm.eb = new byte[i2][];
            ck.ez = new byte[i2][];
            Object obj2 = null;
            if ((48 == i5 / 8 || 49 == i5 / 8) && 48 == ay / 8) {
                obj2 = 1;
            }
            if (i5 / 8 == 48 && ay / 8 == 148) {
                obj2 = 1;
            }
            i2 = 0;
            i = (i5 - 6) / 8;
            while (i <= (i5 + 6) / 8) {
                i6 = i2;
                i2 = (ay - 6) / 8;
                while (i2 <= (ay + 6) / 8) {
                    i4 = (i << 8) + i2;
                    if (obj2 == null || !(49 == i2 || 149 == i2 || i2 == 147 || 50 == i || (49 == i && i2 == 47))) {
                        eo.ep[i6] = i4;
                        dg.ej[i6] = hh.bf.au("m" + i + "_" + i2, -1273715932);
                        bl.eh[i6] = hh.bf.au("l" + i + "_" + i2, -1498352760);
                        i6++;
                    }
                    i2++;
                }
                i++;
                i2 = i6;
            }
            by.cx(i5, ay, true, 955636262);
        } catch (Throwable e) {
            throw ei.ac(e, "cs.cg(" + ')');
        }
    }

    static final void cw(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            int br;
            int i7;
            ah ac;
            fl flVar;
            int bp = ci.el.bp(i, i2, i3);
            if (bp != 0) {
                br = ci.el.br(i, i2, i3, bp);
                i7 = (br >> 6) & 3;
                br &= 31;
                if (bp <= 0) {
                    i5 = i4;
                }
                int[] iArr = dn.lf.aj;
                int i8 = ((103 - i3) * bq.ai) + ((i2 * 4) + 24624);
                ac = ey.ac((bp >> 14) & 32767, -968225183);
                if (-1 != ac.br * -241108131) {
                    flVar = co.ew[ac.br * -241108131];
                    if (flVar != null) {
                        lq.lb.au(flVar, (((ac.az * -1516541964) - flVar.an) / 2) + ((i2 * 4) + 48), ((((104 - i3) - (ac.ax * 1882098523)) * 4) + 48) + (((-1061540500 * ac.ax) - flVar.aq) / 2), 1632833248);
                    }
                } else {
                    if (br == 0 || 2 == br) {
                        if (i7 == 0) {
                            iArr[i8] = i5;
                            iArr[i8 + cj.at] = i5;
                            iArr[i8 + 1024] = i5;
                            iArr[i8 + 1536] = i5;
                        } else if (i7 == 1) {
                            iArr[i8] = i5;
                            iArr[i8 + 1] = i5;
                            iArr[i8 + 2] = i5;
                            iArr[i8 + 3] = i5;
                        } else if (i7 == 2) {
                            iArr[i8 + 3] = i5;
                            iArr[(i8 + 3) + cj.at] = i5;
                            iArr[(i8 + 3) + 1024] = i5;
                            iArr[(i8 + 3) + 1536] = i5;
                        } else if (3 == i7) {
                            iArr[i8 + 1536] = i5;
                            iArr[(i8 + 1536) + 1] = i5;
                            iArr[(i8 + 1536) + 2] = i5;
                            iArr[(i8 + 1536) + 3] = i5;
                        }
                    }
                    if (3 == br) {
                        if (i7 == 0) {
                            iArr[i8] = i5;
                        } else if (1 == i7) {
                            iArr[i8 + 3] = i5;
                        } else if (i7 == 2) {
                            iArr[(i8 + 3) + 1536] = i5;
                        } else if (3 == i7) {
                            iArr[i8 + 1536] = i5;
                        }
                    }
                    if (2 == br) {
                        if (3 == i7) {
                            iArr[i8] = i5;
                            iArr[i8 + cj.at] = i5;
                            iArr[i8 + 1024] = i5;
                            iArr[i8 + 1536] = i5;
                        } else if (i7 == 0) {
                            iArr[i8] = i5;
                            iArr[i8 + 1] = i5;
                            iArr[i8 + 2] = i5;
                            iArr[i8 + 3] = i5;
                        } else if (i7 == 1) {
                            iArr[i8 + 3] = i5;
                            iArr[(i8 + 3) + cj.at] = i5;
                            iArr[(i8 + 3) + 1024] = i5;
                            iArr[(i8 + 3) + 1536] = i5;
                        } else if (2 == i7) {
                            iArr[i8 + 1536] = i5;
                            iArr[(i8 + 1536) + 1] = i5;
                            iArr[(i8 + 1536) + 2] = i5;
                            iArr[(i8 + 1536) + 3] = i5;
                        }
                    }
                }
            }
            br = ci.el.bh(i, i2, i3);
            if (br != 0) {
                bp = ci.el.br(i, i2, i3, br);
                i7 = (bp >> 6) & 3;
                bp &= 31;
                ah ac2 = ey.ac((br >> 14) & 32767, -669580648);
                if (ac2.br * -241108131 != -1) {
                    fl flVar2 = co.ew[ac2.br * -241108131];
                    if (flVar2 != null) {
                        lq.lb.au(flVar2, (((-1516541964 * ac2.az) - flVar2.an) / 2) + ((i2 * 4) + 48), (((ac2.ax * -1061540500) - flVar2.aq) / 2) + ((((104 - i3) - (ac2.ax * 1882098523)) * 4) + 48), 229259037);
                    }
                } else if (bp == 9) {
                    bp = 15658734;
                    if (br > 0) {
                        bp = 15597568;
                    }
                    int[] iArr2 = dn.lf.aj;
                    int i9 = ((i2 * 4) + 24624) + ((103 - i3) * bq.ai);
                    if (i7 == 0 || 2 == i7) {
                        iArr2[i9 + 1536] = bp;
                        iArr2[(i9 + 1024) + 1] = bp;
                        iArr2[(i9 + cj.at) + 2] = bp;
                        iArr2[i9 + 3] = bp;
                    } else {
                        iArr2[i9] = bp;
                        iArr2[(i9 + cj.at) + 1] = bp;
                        iArr2[(i9 + 1024) + 2] = bp;
                        iArr2[(i9 + 1536) + 3] = bp;
                    }
                }
            }
            bp = ci.el.bt(i, i2, i3);
            if (bp != 0) {
                ac = ey.ac((bp >> 14) & 32767, -284161548);
                if (-1 != -241108131 * ac.br) {
                    flVar = co.ew[ac.br * -241108131];
                    if (flVar != null) {
                        lq.lb.au(flVar, (((-1516541964 * ac.az) - flVar.an) / 2) + ((i2 * 4) + 48), ((((104 - i3) - (ac.ax * 1882098523)) * 4) + 48) + (((ac.ax * -1061540500) - flVar.aq) / 2), 1968502469);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "cs.cw(" + ')');
        }
    }
}
