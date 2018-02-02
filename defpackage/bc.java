package defpackage;

public final class bc {
    static final int ax = 171;
    int aa;
    int ac;
    public int ah;
    int ai;
    int aj;
    int ak;
    int an;
    int ao;
    public ci ap;
    int aq;
    public ci at;

    bc() {
        try {
            this.ah = 0;
            this.ai = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "bc.<init>(" + ')');
        }
    }

    static void aq(int i, int i2, int i3, int i4, int i5) {
        try {
            fg fgVar = (fg) fg.aj.ak();
            while (fgVar != null) {
                if (fgVar.ap * 261044907 != -1 || fgVar.aw != null) {
                    int i6;
                    if (i2 > 1819036473 * fgVar.ao) {
                        i6 = (i2 - (1819036473 * fgVar.ao)) + 0;
                    } else if (i2 < fgVar.an * -1655448401) {
                        i6 = ((fgVar.an * -1655448401) - i2) + 0;
                    } else {
                        i6 = 0;
                    }
                    if (i3 > fgVar.aa * -674418639) {
                        i6 += i3 - (fgVar.aa * -674418639);
                    } else if (i3 < 1387745745 * fgVar.aq) {
                        i6 += (fgVar.aq * 1387745745) - i3;
                    }
                    if (i6 - 64 > fgVar.ak * -650975889 || client.mp * 617007039 == 0 || fgVar.ac * 1415674861 != i) {
                        if (fgVar.at != null) {
                            dx.mh.ac(fgVar.at);
                            fgVar.at = null;
                        }
                        if (fgVar.ae != null) {
                            dx.mh.ac(fgVar.ae);
                            fgVar.ae = null;
                        }
                    } else {
                        ii aj;
                        i6 -= 64;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        i6 = (((fgVar.ak * -650975889) - i6) * (client.mp * 617007039)) / (fgVar.ak * -650975889);
                        if (fgVar.at != null) {
                            fgVar.at.aw(i6);
                        } else if (fgVar.ap * 261044907 >= 0) {
                            aj = ii.aj(client.bk, fgVar.ap * 261044907, 0);
                            if (aj != null) {
                                iu an = ia.an(aj.ac().aj(av.ma), 100, i6);
                                an.ah(-1);
                                dx.mh.aj(an);
                                fgVar.at = an;
                            }
                        }
                        if (fgVar.ae != null) {
                            fgVar.ae.aw(i6);
                            if (!fgVar.ae.ks()) {
                                fgVar.ae = null;
                            }
                        } else if (fgVar.aw != null) {
                            int i7 = fgVar.am - (2065258517 * i4);
                            fgVar.am = i7;
                            if (i7 * -507267267 <= 0) {
                                aj = ii.aj(client.bk, fgVar.aw[(int) (Math.random() * ((double) fgVar.aw.length))], 0);
                                if (aj != null) {
                                    iu an2 = ia.an(aj.ac().aj(av.ma), 100, i6);
                                    an2.ah(0);
                                    dx.mh.aj(an2);
                                    fgVar.ae = an2;
                                    fgVar.am = ((fgVar.ah * -422600261) + ((int) (Math.random() * ((double) ((fgVar.ai * 1938559033) - (fgVar.ah * -422600261)))))) * 2065258517;
                                }
                            }
                        }
                    }
                }
                fgVar = (fg) fg.aj.at();
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bc.aq(" + ')');
        }
    }

    static void an(gh[] ghVarArr, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (i < i2) {
            int i4 = i - 1;
            int i5 = i2 + 1;
            try {
                int i6 = (i2 + i) / 2;
                gh ghVar = ghVarArr[i6];
                ghVarArr[i6] = ghVarArr[i];
                ghVarArr[i] = ghVar;
                while (i4 < i5) {
                    int i7;
                    int i8;
                    int i9;
                    Object obj = 1;
                    do {
                        i5--;
                        i7 = 0;
                        while (i7 < 4) {
                            if (2 == iArr[i7]) {
                                i8 = ghVarArr[i5].az * 1399293737;
                                i9 = 1399293737 * ghVar.az;
                            } else if (iArr[i7] == 1) {
                                i8 = 794816761 * ghVarArr[i5].am;
                                i9 = 794816761 * ghVar.am;
                                if (i8 == -1 && iArr2[i7] == 1) {
                                    i8 = 2001;
                                }
                                if (i9 == -1 && 1 == iArr2[i7]) {
                                    i9 = 2001;
                                }
                            } else if (iArr[i7] == 3) {
                                i8 = ghVarArr[i5].ap(1266499800) ? 1 : 0;
                                i9 = ghVar.ap(1614216622) ? 1 : 0;
                            } else {
                                i8 = ghVarArr[i5].ai * 1057964181;
                                i9 = 1057964181 * ghVar.ai;
                            }
                            if (i8 == i9) {
                                if (i7 == 3) {
                                    obj = null;
                                }
                                i7++;
                            } else if (1 != iArr2[i7] || i8 <= i9) {
                                if (iArr2[i7] != 0 || i8 >= i9) {
                                    obj = null;
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        }
                    } while (obj != null);
                    obj = 1;
                    i8 = i4;
                    do {
                        i8++;
                        i7 = 0;
                        Object obj2 = obj;
                        while (i7 < 4) {
                            if (2 == iArr[i7]) {
                                i6 = ghVarArr[i8].az * 1399293737;
                                i9 = ghVar.az * 1399293737;
                            } else if (1 == iArr[i7]) {
                                i6 = ghVarArr[i8].am * 794816761;
                                i9 = ghVar.am * 794816761;
                                if (i6 == -1 && 1 == iArr2[i7]) {
                                    i6 = 2001;
                                }
                                if (-1 == i9 && 1 == iArr2[i7]) {
                                    i9 = 2001;
                                }
                            } else if (iArr[i7] == 3) {
                                if (ghVarArr[i8].ap(1701375265)) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                i9 = ghVar.ap(1911987776) ? 1 : 0;
                            } else {
                                i6 = 1057964181 * ghVarArr[i8].ai;
                                i9 = 1057964181 * ghVar.ai;
                            }
                            if (i9 == i6) {
                                if (3 == i7) {
                                    obj = null;
                                } else {
                                    obj = obj2;
                                }
                                i7++;
                                obj2 = obj;
                            } else if (iArr2[i7] == 1 && i6 < i9) {
                                obj = obj2;
                                continue;
                            } else if (iArr2[i7] != 0 || i6 <= i9) {
                                obj = null;
                                continue;
                            } else {
                                obj = obj2;
                                continue;
                            }
                        }
                        obj = obj2;
                        continue;
                    } while (obj != null);
                    if (i8 < i5) {
                        gh ghVar2 = ghVarArr[i8];
                        ghVarArr[i8] = ghVarArr[i5];
                        ghVarArr[i5] = ghVar2;
                    }
                    i4 = i8;
                }
                bc.an(ghVarArr, i, i5, iArr, iArr2, -2016255947);
                bc.an(ghVarArr, i5 + 1, i2, iArr, iArr2, -1713088254);
            } catch (Throwable e) {
                throw ei.ac(e, "bc.an(" + ')');
            }
        }
    }

    static final void dv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 >= 1 && i4 >= 1 && i3 <= 102 && i4 <= 102) {
            try {
                if (!client.ah || lw.hn * -2005147175 == i) {
                    int br;
                    int i9;
                    int i10;
                    ah ac;
                    int i11 = 0;
                    if (i2 == 0) {
                        i11 = ci.el.bp(i, i3, i4);
                    }
                    if (i2 == 1) {
                        i11 = ci.el.bm(i, i3, i4);
                    }
                    if (i2 == 2) {
                        i11 = ci.el.bh(i, i3, i4);
                    }
                    if (3 == i2) {
                        i11 = ci.el.bt(i, i3, i4);
                    }
                    if (i11 != 0) {
                        br = ci.el.br(i, i3, i4, i11);
                        int i12 = (i11 >> 14) & 32767;
                        i9 = br & 31;
                        i10 = (br >> 6) & 3;
                        if (i2 == 0) {
                            ci.el.ax(i, i3, i4);
                            ac = ey.ac(i12, -1614944355);
                            if (159196279 * ac.af != 0) {
                                client.ey[i].ak(i3, i4, i9, i10, ac.au, -1535640736);
                            }
                        }
                        if (i2 == 1) {
                            ci.el.af(i, i3, i4);
                        }
                        if (i2 == 2) {
                            ci.el.au(i, i3, i4);
                            ah ac2 = ey.ac(i12, -532016415);
                            if ((ac2.az * 1768348157) + i3 <= 103 && (ac2.az * 1768348157) + i4 <= 103 && (1882098523 * ac2.ax) + i3 <= 103 && (ac2.ax * 1882098523) + i4 <= 103) {
                                if (ac2.af * 159196279 != 0) {
                                    client.ey[i].ap(i3, i4, 1768348157 * ac2.az, ac2.ax * 1882098523, i10, ac2.au, (byte) 25);
                                }
                            } else {
                                return;
                            }
                        }
                        if (3 == i2) {
                            ci.el.av(i, i3, i4);
                            if (1 == ey.ac(i12, -730139266).af * 159196279) {
                                client.ey[i].ah(i3, i4, 1927343642);
                            }
                        }
                    }
                    if (i5 >= 0) {
                        int i13;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        int i18;
                        if (i >= 3 || 2 != (fb.ac[1][i3][i4] & 2)) {
                            i13 = i;
                        } else {
                            i13 = i + 1;
                        }
                        cc ccVar = ci.el;
                        eh ehVar = client.ey[i];
                        ac = ey.ac(i5, -1984991368);
                        if (i6 == 1 || i6 == 3) {
                            i14 = ac.az * 1768348157;
                            i15 = 1882098523 * ac.ax;
                        } else {
                            i14 = ac.ax * 1882098523;
                            i15 = ac.az * 1768348157;
                        }
                        if (i3 + i15 <= ez.cz) {
                            i9 = ((i15 + 1) >> 1) + i3;
                            i10 = i3 + (i15 >> 1);
                        } else {
                            i9 = i3 + 1;
                            i10 = i3;
                        }
                        if (i4 + i14 <= ez.cz) {
                            i16 = i4 + (i14 >> 1);
                            br = ((i14 + 1) >> 1) + i4;
                        } else {
                            br = i4 + 1;
                            i16 = i4;
                        }
                        int[][] iArr = fb.aj[i13];
                        i10 = (iArr[i9][br] + ((iArr[i9][i16] + iArr[i10][i16]) + iArr[i10][br])) >> 2;
                        i9 = (i3 << 7) + (i15 << 6);
                        int i19 = (i14 << 6) + (i4 << 7);
                        br = (((i4 << 7) + i3) + (i5 << 14)) + 1073741824;
                        if (ac.av * 95815989 == 0) {
                            i17 = br - Integer.MIN_VALUE;
                        } else {
                            i17 = br;
                        }
                        br = (i6 << 6) + i7;
                        if (ac.bj * 539317059 == 1) {
                            i18 = br + bq.ah;
                        } else {
                            i18 = br;
                        }
                        ci at;
                        if (i7 == 22) {
                            if (ac.ad * -295357285 == -1 && ac.ba == null) {
                                at = ac.at(22, i6, iArr, i9, i10, i19, -802844807);
                            } else {
                                at = new gi(i5, 22, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ak(i, i3, i4, i10, at, i17, i18);
                            if (1 == ac.af * 159196279) {
                                ehVar.ao(i3, i4, (byte) -5);
                            }
                        } else if (i7 == 10 || i7 == 11) {
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                r12 = ac.at(10, i6, iArr, i9, i10, i19, 1087025894);
                            } else {
                                r12 = new gi(i5, 10, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            if (r12 != null) {
                                ccVar.ai(i, i3, i4, i10, i15, i14, r12, 11 == i7 ? bq.ah : 0, i17, i18);
                            }
                            if (ac.af * 159196279 != 0) {
                                ehVar.an(i3, i4, i15, i14, ac.au, (byte) -50);
                            }
                        } else if (i7 >= 12) {
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                r12 = ac.at(i7, i6, iArr, i9, i10, i19, -1510521129);
                            } else {
                                r12 = new gi(i5, i7, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ai(i, i3, i4, i10, 1, 1, r12, 0, i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.an(i3, i4, i15, i14, ac.au, (byte) -43);
                            }
                        } else if (i7 == 0) {
                            if (ac.ad * -295357285 == -1 && ac.ba == null) {
                                at = ac.at(0, i6, iArr, i9, i10, i19, -1957039248);
                            } else {
                                at = new gi(i5, 0, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.at(i, i3, i4, i10, at, null, fb.af[i6], 0, i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.ac(i3, i4, i7, i6, ac.au, 1799251928);
                            }
                        } else if (i7 == 1) {
                            if (ac.ad * -295357285 == -1 && ac.ba == null) {
                                at = ac.at(1, i6, iArr, i9, i10, i19, -556155683);
                            } else {
                                at = new gi(i5, 1, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.at(i, i3, i4, i10, at, null, fb.au[i6], 0, i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.ac(i3, i4, i7, i6, ac.au, 1861788965);
                            }
                        } else if (i7 == 2) {
                            int i20 = (i6 + 1) & 3;
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                r12 = ac.at(2, i6 + 4, iArr, i9, i10, i19, -818819422);
                                r11 = ac.at(2, i20, iArr, i9, i10, i19, 133760168);
                                at = r12;
                            } else {
                                at = new gi(i5, 2, i6 + 4, i13, i3, i4, ac.ad * -295357285, true, null);
                                r11 = new gi(i5, 2, i20, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.at(i, i3, i4, i10, at, r11, fb.af[i6], fb.af[i20], i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.ac(i3, i4, i7, i6, ac.au, 1846354186);
                            }
                        } else if (3 == i7) {
                            if (-1 == -295357285 * ac.ad && ac.ba == null) {
                                at = ac.at(3, i6, iArr, i9, i10, i19, 667110154);
                            } else {
                                at = new gi(i5, 3, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.at(i, i3, i4, i10, at, null, fb.au[i6], 0, i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.ac(i3, i4, i7, i6, ac.au, 1892527210);
                            }
                        } else if (9 == i7) {
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                r12 = ac.at(i7, i6, iArr, i9, i10, i19, -1396677909);
                            } else {
                                r12 = new gi(i5, i7, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ai(i, i3, i4, i10, 1, 1, r12, 0, i17, i18);
                            if (ac.af * 159196279 != 0) {
                                ehVar.an(i3, i4, i15, i14, ac.au, (byte) -91);
                            }
                        } else if (4 == i7) {
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                at = ac.at(4, i6, iArr, i9, i10, i19, -868575406);
                            } else {
                                at = new gi(i5, 4, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ah(i, i3, i4, i10, at, null, fb.af[i6], 0, 0, 0, i17, i18);
                        } else if (i7 == 5) {
                            i16 = ccVar.bp(i, i3, i4);
                            if (i16 != 0) {
                                i14 = ey.ac((i16 >> 14) & 32767, -1351563339).ab * -1355184749;
                            } else {
                                i14 = 16;
                            }
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                at = ac.at(4, i6, iArr, i9, i10, i19, 1993323071);
                            } else {
                                at = new gi(i5, 4, i6, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ah(i, i3, i4, i10, at, null, fb.af[i6], 0, i14 * fb.av[i6], i14 * fb.ay[i6], i17, i18);
                        } else if (i7 == 6) {
                            i16 = ccVar.bp(i, i3, i4);
                            if (i16 != 0) {
                                i14 = (ey.ac((i16 >> 14) & 32767, -1794414078).ab * -1355184749) / 2;
                            } else {
                                i14 = 8;
                            }
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                at = ac.at(4, i6 + 4, iArr, i9, i10, i19, -1626321131);
                            } else {
                                at = new gi(i5, 4, i6 + 4, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ah(i, i3, i4, i10, at, null, bq.ah, i6, i14 * fb.ag[i6], i14 * fb.ar[i6], i17, i18);
                        } else if (7 == i7) {
                            i14 = (i6 + 2) & 3;
                            if (-295357285 * ac.ad == -1 && ac.ba == null) {
                                at = ac.at(4, i14 + 4, iArr, i9, i10, i19, -884949901);
                            } else {
                                at = new gi(i5, 4, i14 + 4, i13, i3, i4, ac.ad * -295357285, true, null);
                            }
                            ccVar.ah(i, i3, i4, i10, at, null, bq.ah, i14, 0, 0, i17, i18);
                        } else if (8 == i7) {
                            int i21;
                            i16 = ccVar.bp(i, i3, i4);
                            if (i16 != 0) {
                                i21 = (ey.ac((i16 >> 14) & 32767, -407292768).ab * -1355184749) / 2;
                            } else {
                                i21 = 8;
                            }
                            i14 = (i6 + 2) & 3;
                            if (-1 == ac.ad * -295357285 && ac.ba == null) {
                                r12 = ac.at(4, i6 + 4, iArr, i9, i10, i19, 586693800);
                                r11 = ac.at(4, i14 + 4, iArr, i9, i10, i19, -2111383337);
                                at = r12;
                            } else {
                                at = new gi(i5, 4, i6 + 4, i13, i3, i4, -295357285 * ac.ad, true, null);
                                r11 = new gi(i5, 4, i14 + 4, i13, i3, i4, -295357285 * ac.ad, true, null);
                            }
                            ccVar.ah(i, i3, i4, i10, at, r11, bq.ah, i6, i21 * fb.ag[i6], i21 * fb.ar[i6], i17, i18);
                        }
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "bc.dv(" + ')');
            }
        }
    }
}
