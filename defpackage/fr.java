package defpackage;

public class fr extends jt {
    public static final int ak = 200;
    static String aw = null;
    public static final int bp = 33;
    public int ac;
    int aj;
    boolean an;

    fr() {
        try {
            this.an = false;
        } catch (Throwable e) {
            throw ei.ac(e, "fr.<init>(" + ')');
        }
    }

    static final void ak(byte[] bArr, int i, int i2, cc ccVar, eh[] ehVarArr, int i3) {
        try {
            he heVar = new he(bArr);
            int i4 = -1;
            while (true) {
                int bu = heVar.bu(427600315);
                if (bu != 0) {
                    i4 += bu;
                    bu = 0;
                    while (true) {
                        int bu2 = heVar.bu(1998046899);
                        if (bu2 == 0) {
                            break;
                        }
                        int i5 = bu + (bu2 - 1);
                        int i6 = i5 & 63;
                        bu2 = (i5 >> 6) & 63;
                        bu = i5 >> 12;
                        int au = heVar.au(-310118664);
                        int i7 = au >> 2;
                        au &= 3;
                        bu2 += i;
                        i6 += i2;
                        if (bu2 > 0 && i6 > 0 && bu2 < 103 && i6 < 103) {
                            int i8;
                            if ((fb.ac[1][bu2][i6] & 2) == 2) {
                                i8 = bu - 1;
                            } else {
                                i8 = bu;
                            }
                            eh ehVar = null;
                            if (i8 >= 0) {
                                ehVar = ehVarArr[i8];
                            }
                            bs.at(bu, bu2, i6, i4, au, i7, ccVar, ehVar, (byte) 30);
                        }
                        bu = i5;
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fr.ak(" + ')');
        }
    }

    static final void al(es esVar, int i) {
        try {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            if (-963729933 * fw.bt > 0) {
                for (i2 = 0; i2 < bq.ah; i2++) {
                    if (-963729933 * fw.bt > 768) {
                        lt.ab[i2] = cv.as(lm.bp[i2], dc.bm[i2], 1024 - (-963729933 * fw.bt), 990245024);
                    } else if (fw.bt * -963729933 > bq.ah) {
                        lt.ab[i2] = dc.bm[i2];
                    } else {
                        lt.ab[i2] = cv.as(dc.bm[i2], lm.bp[i2], 256 - (-963729933 * fw.bt), 457874393);
                    }
                }
            } else if (fw.br * -320021473 > 0) {
                for (i2 = 0; i2 < bq.ah; i2++) {
                    if (-320021473 * fw.br > 768) {
                        lt.ab[i2] = cv.as(lm.bp[i2], gs.bh[i2], 1024 - (fw.br * -320021473), 1701077022);
                    } else if (fw.br * -320021473 > bq.ah) {
                        lt.ab[i2] = gs.bh[i2];
                    } else {
                        lt.ab[i2] = cv.as(gs.bh[i2], lm.bp[i2], 256 - (-320021473 * fw.br), 1140058952);
                    }
                }
            } else {
                for (i2 = 0; i2 < bq.ah; i2++) {
                    lt.ab[i2] = lm.bp[i2];
                }
            }
            esVar.fn(fw.dm, 953013065);
            esVar.fi(fw.ac * -1775170451, 9, (fw.ac * -1775170451) + cj.ak, 263, (byte) 94);
            esVar.al(mi.ak, -1775170451 * fw.ac, 0, -2129442469);
            esVar.fl(fw.dm, -2141733741);
            int i9 = 0;
            int i10 = (-1775170451 * fw.ac) + (esVar.ac * 1086115735);
            int i11 = 1;
            while (i11 < 255) {
                i2 = (((bq.ah - i11) * fw.ad[i11]) / bq.ah) + 22;
                if (i2 < 0) {
                    i2 = 0;
                }
                i3 = i10;
                i10 = i9 + i2;
                i9 = i2;
                while (i9 < cj.ak) {
                    i4 = i10 + 1;
                    i5 = dm.bd[i10];
                    if (i5 != 0) {
                        i6 = 256 - i5;
                        i7 = lt.ab[i5];
                        i8 = esVar.aj[i3];
                        i10 = i3 + 1;
                        esVar.aj[i3] = (((((i5 * (i7 & 16711935)) + (i6 * (i8 & 16711935))) & -16711936) + ((((65280 & i7) * i5) + ((65280 & i8) * i6)) & 16711680)) >> 8) | -16777216;
                    } else {
                        i10 = i3 + 1;
                    }
                    i9++;
                    i3 = i10;
                    i10 = i4;
                }
                i11++;
                int i12 = i3 + ((i2 + (1075116703 * esVar.ac)) - 128);
                i9 = i10;
                i10 = i12;
            }
            esVar.fn(fw.dm, 547475888);
            esVar.fi(((-1775170451 * fw.ac) + 765) - 128, 9, (-1775170451 * fw.ac) + 765, 263, (byte) 34);
            esVar.al(fw.ap, (fw.ac * -1775170451) + 382, 0, -2110458075);
            esVar.fl(fw.dm, -1324780132);
            i9 = 0;
            i4 = 1;
            i2 = (fw.ac * -1775170451) + (((esVar.ac * 1086115735) + 24) + 637);
            while (i4 < 255) {
                i11 = (fw.ad[i4] * (bq.ah - i4)) / bq.ah;
                i5 = 103 - i11;
                i10 = i2 + i11;
                i2 = i9;
                i9 = i10;
                i10 = 0;
                while (i10 < i5) {
                    i3 = i2 + 1;
                    i6 = dm.bd[i2];
                    if (i6 != 0) {
                        i7 = 256 - i6;
                        i8 = lt.ab[i6];
                        int i13 = esVar.aj[i9];
                        i2 = i9 + 1;
                        esVar.aj[i9] = (((((i6 * (i8 & 65280)) + (i7 * (65280 & i13))) & 16711680) + ((((16711935 & i8) * i6) + ((16711935 & i13) * i7)) & -16711936)) >> 8) | -16777216;
                    } else {
                        i2 = i9 + 1;
                    }
                    i10++;
                    i9 = i2;
                    i2 = i3;
                }
                i10 = i9 + (((1075116703 * esVar.ac) - i5) - i11);
                i4++;
                i9 = i2 + (128 - i5);
                i2 = i10;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fr.al(" + ')');
        }
    }

    static int aw(int i, fs fsVar, boolean z, int i2) {
        ab aj;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = gr.ak;
                int i3 = dy.ap - -401924967;
                dy.ap = i3;
                aj = ac.aj(iArr[i3 * -38307927], -556756620);
            } catch (Throwable e) {
                throw ei.ac(e, "fr.aw(" + ')');
            }
        } else if (z) {
            aj = client.ae;
        } else {
            aj = ef.am;
        }
        if (1927 != i) {
            return 2;
        }
        if (gr.ax * -662214413 >= 10) {
            throw new RuntimeException();
        } else if (aj.en == null) {
            return 0;
        } else {
            jt gdVar = new gd();
            gdVar.an = aj;
            gdVar.aj = aj.en;
            gdVar.ai = -1127280365 + (1619127561 * gr.ax);
            client.kl.ac(gdVar);
            return 1;
        }
    }
}
