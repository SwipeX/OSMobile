package defpackage;

public class by extends jt {
    public static ca ae = null;
    static final int bi = 500;
    static ll dx;
    int[] aa;
    int ac;
    int aj;
    int[] an;
    int[] ao;
    int[][] aq;

    by(int i, byte[] bArr) {
        int i2 = 0;
        try {
            int i3;
            this.aj = -887120513 * i;
            he heVar = new he(bArr);
            this.ac = heVar.au(-310118664) * -77841117;
            this.an = new int[(this.ac * -1662395765)];
            this.aq = new int[(this.ac * -1662395765)][];
            this.ao = new int[(this.ac * -371553536)];
            this.aa = new int[(this.ac * -1662395765)];
            for (i3 = 0; i3 < this.ac * -1662395765; i3++) {
                this.an[i3] = heVar.au(-310118664);
            }
            for (i3 = 0; i3 < this.ac * -1662395765; i3++) {
                this.aq[i3] = new int[heVar.au(-310118664)];
            }
            for (int i4 = 0; i4 < this.ac * -1662395765; i4++) {
                for (i3 = 0; i3 < this.aq[i4].length; i3++) {
                    int[] iArr = this.ao;
                    int i5 = (i4 * bq.ah) + i3;
                    int[] iArr2 = this.aq[i4];
                    int au = heVar.au(-310118664);
                    iArr2[i3] = au;
                    iArr[i5] = au;
                }
            }
            while (i2 < this.ac * -1662395765) {
                this.aa[i2] = this.aq[i2].length;
                i2++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "by.<init>(" + ')');
        }
    }

    static void cr(ff ffVar, boolean z, int i) {
        if (ffVar != null) {
            try {
                if (ffVar.an(-1215167527) && !ffVar.ag) {
                    int i2 = (-1935492687 * ffVar.ad) << 14;
                    ffVar.av = false;
                    if (((client.ah && fu.aa * -2089377233 > 50) || fu.aa * -2089377233 > fr.ak) && z && ffVar.cp * 118674673 == -1962837115 * ffVar.by) {
                        ffVar.av = true;
                    }
                    int i3 = (ffVar.br * 1948391561) >> 7;
                    int i4 = (ffVar.bb * -1461980333) >> 7;
                    if (i3 >= 0 && i3 < ez.cz && i4 >= 0 && i4 < ez.cz) {
                        if (ffVar.al == null || 901275591 * client.af < ffVar.ai * 192303321 || client.af * 901275591 >= ffVar.aw * -1077761979) {
                            if (((ffVar.br * 1948391561) & 127) == 64 && 64 == ((ffVar.bb * -1461980333) & 127)) {
                                if (client.go[i3][i4] != client.gx * -2113422841) {
                                    client.go[i3][i4] = client.gx * -2113422841;
                                } else {
                                    return;
                                }
                            }
                            ffVar.ah = fb.cv(ffVar.br * 1948391561, ffVar.bb * -1461980333, lw.hn * -2005147175, 1846733763) * -1271734461;
                            ci.el.aw(lw.hn * -2005147175, ffVar.br * 1948391561, ffVar.bb * -1461980333, ffVar.ah * -1507318421, 60, ffVar, -603732529 * ffVar.bu, i2, ffVar.an);
                            return;
                        }
                        ffVar.av = false;
                        ffVar.ah = fb.cv(ffVar.br * 1948391561, ffVar.bb * -1461980333, lw.hn * -2005147175, 126662558) * -1271734461;
                        ci.el.am(lw.hn * -2005147175, ffVar.br * 1948391561, ffVar.bb * -1461980333, -1507318421 * ffVar.ah, 60, ffVar, ffVar.bu * -603732529, i2, 1602238977 * ffVar.az, -1682251803 * ffVar.ax, -1242905935 * ffVar.af, ffVar.au * -1448640223);
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "by.cr(" + ')');
            }
        }
    }

    static final void cx(int i, int i2, boolean z, int i3) {
        if (z) {
            try {
                if (i == do.dg * 1056312487 && i2 == 1366292211 * bu.df) {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "by.cx(" + ')');
            }
        }
        do.dg = 345955095 * i;
        bu.df = 605491771 * i2;
        gx.as(25, (short) 12027);
        client.ac.qc.ap(-700377944);
        gr.cc(ix.ai, true, -1710577469);
        int i4 = -357869149 * fz.du;
        int i5 = 1195683827 * fm.dn;
        fz.du = (i - 6) * 947195992;
        fm.dn = -1884026408 * (i2 - 6);
        int i6 = (fz.du * -357869149) - i4;
        int i7 = (fm.dn * 1195683827) - i5;
        i4 = fz.du * -357869149;
        i4 = 1195683827 * fm.dn;
        for (i5 = 0; i5 < 32768; i5++) {
            ft ftVar = client.cj[i5];
            if (ftVar != null) {
                for (i4 = 0; i4 < 10; i4++) {
                    int[] iArr = ftVar.dd;
                    iArr[i4] = iArr[i4] - i6;
                    iArr = ftVar.ds;
                    iArr[i4] = iArr[i4] - i7;
                }
                ftVar.br -= -1620124544 * i6;
                ftVar.bb -= -983274112 * i7;
            }
        }
        for (i5 = 0; i5 < bq.ai; i5++) {
            ff ffVar = client.hx[i5];
            if (ffVar != null) {
                for (i4 = 0; i4 < 10; i4++) {
                    iArr = ffVar.dd;
                    iArr[i4] = iArr[i4] - i6;
                    iArr = ffVar.ds;
                    iArr[i4] = iArr[i4] - i7;
                }
                ffVar.br -= -1620124544 * i6;
                ffVar.bb -= -983274112 * i7;
            }
        }
        int i8 = 0;
        i5 = ez.cz;
        i4 = 1;
        if (i6 < 0) {
            i8 = 103;
            i5 = -1;
            i4 = -1;
        }
        int i9 = 0;
        int i10 = ez.cz;
        int i11 = 1;
        if (i7 < 0) {
            i9 = 103;
            i10 = -1;
            i11 = -1;
        }
        for (int i12 = i8; i12 != i5; i12 += i4) {
            for (int i13 = i9; i13 != i10; i13 += i11) {
                int i14 = i6 + i12;
                int i15 = i7 + i13;
                for (i8 = 0; i8 < 4; i8++) {
                    if (i14 < 0 || i15 < 0 || i14 >= ez.cz || i15 >= ez.cz) {
                        client.hq[i8][i12][i13] = null;
                    } else {
                        client.hq[i8][i12][i13] = client.hq[i8][i14][i15];
                    }
                }
            }
        }
        fo foVar = (fo) client.hl.ak();
        while (foVar != null) {
            foVar.an -= -204820901 * i6;
            foVar.aq -= 2090700747 * i7;
            if (foVar.an * -1376857645 < 0 || foVar.aq * -972120605 < 0 || -1376857645 * foVar.an >= ez.cz || foVar.aq * -972120605 >= ez.cz) {
                foVar.kn();
            }
            foVar = (fo) client.hl.at();
        }
        if (client.li * -1221730691 != 0) {
            client.li -= 1288243925 * i6;
            client.lg -= -1232267703 * i7;
        }
        client.mv = 0;
        client.mf = false;
        client.le = 1793820143;
        client.hz.aj();
        client.hw.aj();
        for (i4 = 0; i4 < 4; i4++) {
            client.ey[i4].aj(-625484566);
        }
    }

    static ab ff(ab abVar, int i) {
        try {
            int ft = (at.ft(abVar, 1588397356) >> 17) & 7;
            if (ft == 0) {
                return null;
            }
            int i2 = 0;
            ab abVar2 = abVar;
            while (i2 < ft) {
                abVar = ac.aj(abVar2.bi * -1228023025, -1123177629);
                if (abVar == null) {
                    return null;
                }
                i2++;
                abVar2 = abVar;
            }
            return abVar2;
        } catch (Throwable e) {
            throw ei.ac(e, "by.ff(" + ')');
        }
    }
}
