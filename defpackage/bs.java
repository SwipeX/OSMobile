package defpackage;

public final class bs {
    static final int ad = 26;
    static final int ah = 10;
    public static mb aw = null;
    static final int ca = 1007;
    int aa;
    int ac;
    int aj;
    int an;
    public int ao;
    public ci aq;

    bs() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "bs.<init>(" + ')');
        }
    }

    static final void at(int i, int i2, int i3, int i4, int i5, int i6, cc ccVar, eh ehVar, byte b) {
        try {
            if (!client.ah || (fb.ac[0][i2][i3] & 2) != 0 || (fb.ac[i][i2][i3] & 16) == 0) {
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                if (i < -829368855 * fb.an) {
                    fb.an = 813257305 * i;
                }
                ah ac = ey.ac(i4, -1300583884);
                if (1 == i5 || i5 == 3) {
                    i7 = 1768348157 * ac.az;
                    i8 = 1882098523 * ac.ax;
                } else {
                    i7 = 1882098523 * ac.ax;
                    i8 = 1768348157 * ac.az;
                }
                if (i8 + i2 <= ez.cz) {
                    i9 = ((i8 + 1) >> 1) + i2;
                    i10 = i2 + (i8 >> 1);
                } else {
                    i9 = i2 + 1;
                    i10 = i2;
                }
                if (i7 + i3 <= ez.cz) {
                    i11 = (i7 >> 1) + i3;
                    i12 = ((i7 + 1) >> 1) + i3;
                } else {
                    i12 = i3 + 1;
                    i11 = i3;
                }
                int[][] iArr = fb.aj[i];
                i10 = ((iArr[i10][i12] + (iArr[i9][i11] + iArr[i10][i11])) + iArr[i9][i12]) >> 2;
                i9 = (i8 << 6) + (i2 << 7);
                int i15 = (i3 << 7) + (i7 << 6);
                i12 = 1073741824 + ((i4 << 14) + ((i3 << 7) + i2));
                if (ac.av * 95815989 == 0) {
                    i13 = i12 - Integer.MIN_VALUE;
                } else {
                    i13 = i12;
                }
                i12 = (i5 << 6) + i6;
                if (1 == ac.bj * 539317059) {
                    i14 = i12 + bq.ah;
                } else {
                    i14 = i12;
                }
                if (ac.as(353137383)) {
                    jt fgVar = new fg();
                    fgVar.ac = 473569765 * i;
                    fgVar.an = -1837291648 * i2;
                    fgVar.aq = 894670976 * i3;
                    i11 = 1768348157 * ac.az;
                    i12 = 1882098523 * ac.ax;
                    if (1 == i5 || 3 == i5) {
                        i11 = ac.ax * 1882098523;
                        i12 = 1768348157 * ac.az;
                    }
                    fgVar.ao = (i11 + i2) * -291928960;
                    fgVar.aa = (i12 + i3) * 437545088;
                    fgVar.ap = ac.bw * 1251564591;
                    fgVar.ak = -334756480 * ac.bn;
                    fgVar.ah = ac.bg * -620300713;
                    fgVar.ai = 1196077317 * ac.bc;
                    fgVar.aw = ac.bk;
                    if (ac.ba != null) {
                        fgVar.as = ac;
                        fgVar.an((byte) -49);
                    }
                    fg.aj.ac(fgVar);
                    if (fgVar.aw != null) {
                        fgVar.am = ((fgVar.ah * -422600261) + ((int) (Math.random() * ((double) ((fgVar.ai * 1938559033) - (fgVar.ah * -422600261)))))) * 2065258517;
                    }
                }
                ci ap;
                if (i6 == 22) {
                    if (!client.ah || 95815989 * ac.av != 0 || ac.af * 159196279 == 1 || ac.bz) {
                        if (-1 == ac.ad * -295357285 && ac.ba == null) {
                            ap = ac.ap(22, i5, iArr, i9, i10, i15, 248584361);
                        } else {
                            ap = new gi(i4, 22, i5, i, i2, i3, -295357285 * ac.ad, true, null);
                        }
                        ccVar.ak(i, i2, i3, i10, ap, i13, i14);
                        if (ac.af * 159196279 == 1 && ehVar != null) {
                            ehVar.ao(i2, i3, (byte) 27);
                        }
                    }
                } else if (10 == i6 || i6 == 11) {
                    if (ac.ad * -295357285 == -1 && ac.ba == null) {
                        r12 = ac.ap(10, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        r12 = new gi(i4, 10, i5, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    if (r12 != null) {
                        int i16;
                        if (11 == i6) {
                            i16 = bq.ah;
                        } else {
                            i16 = 0;
                        }
                        if (ccVar.ai(i, i2, i3, i10, i8, i7, r12, i16, i13, i14) && ac.bu) {
                            byte b2 = (byte) 15;
                            if (r12 instanceof ct) {
                                b2 = ((ct) r12).ap() / 4;
                                if (b2 > (byte) 30) {
                                    b2 = (byte) 30;
                                }
                            }
                            for (int i17 = 0; i17 <= i8; i17++) {
                                for (i11 = 0; i11 <= i7; i11++) {
                                    if (b2 > ak.ap[i][i2 + i17][i3 + i11]) {
                                        ak.ap[i][i2 + i17][i3 + i11] = (byte) b2;
                                    }
                                }
                            }
                        }
                    }
                    if (ac.af * 159196279 != 0 && ehVar != null) {
                        ehVar.an(i2, i3, i8, i7, ac.au, (byte) -4);
                    }
                } else if (i6 >= 12) {
                    if (-295357285 * ac.ad == -1 && ac.ba == null) {
                        r12 = ac.ap(i6, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        r12 = new gi(i4, i6, i5, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.ai(i, i2, i3, i10, 1, 1, r12, 0, i13, i14);
                    if (i6 >= 12 && i6 <= 17 && 13 != i6 && i > 0) {
                        r5 = fb.as[i][i2];
                        r5[i3] = r5[i3] | 2340;
                    }
                    if (ac.af * 159196279 != 0 && ehVar != null) {
                        ehVar.an(i2, i3, i8, i7, ac.au, (byte) -88);
                    }
                } else if (i6 == 0) {
                    if (ac.ad * -295357285 == -1 && ac.ba == null) {
                        ap = ac.ap(0, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 0, i5, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    ccVar.at(i, i2, i3, i10, ap, null, fb.af[i5], 0, i13, i14);
                    if (i5 == 0) {
                        if (ac.bu) {
                            ak.ap[i][i2][i3] = (byte) 50;
                            ak.ap[i][i2][i3 + 1] = (byte) 50;
                        }
                        if (ac.ar) {
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 585;
                        }
                    } else if (1 == i5) {
                        if (ac.bu) {
                            ak.ap[i][i2][i3 + 1] = (byte) 50;
                            ak.ap[i][i2 + 1][i3 + 1] = (byte) 50;
                        }
                        if (ac.ar) {
                            r5 = fb.as[i][i2];
                            i11 = i3 + 1;
                            r5[i11] = r5[i11] | 1170;
                        }
                    } else if (i5 == 2) {
                        if (ac.bu) {
                            ak.ap[i][i2 + 1][i3] = (byte) 50;
                            ak.ap[i][i2 + 1][i3 + 1] = (byte) 50;
                        }
                        if (ac.ar) {
                            r5 = fb.as[i][i2 + 1];
                            r5[i3] = r5[i3] | 585;
                        }
                    } else if (3 == i5) {
                        if (ac.bu) {
                            ak.ap[i][i2][i3] = (byte) 50;
                            ak.ap[i][i2 + 1][i3] = (byte) 50;
                        }
                        if (ac.ar) {
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 1170;
                        }
                    }
                    if (!(159196279 * ac.af == 0 || ehVar == null)) {
                        ehVar.ac(i2, i3, i6, i5, ac.au, 1897204322);
                    }
                    if (-1355184749 * ac.ab != 16) {
                        ccVar.az(i, i2, i3, ac.ab * -1355184749);
                    }
                } else if (i6 == 1) {
                    if (-1 == ac.ad * -295357285 && ac.ba == null) {
                        ap = ac.ap(1, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 1, i5, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.at(i, i2, i3, i10, ap, null, fb.au[i5], 0, i13, i14);
                    if (ac.bu) {
                        if (i5 == 0) {
                            ak.ap[i][i2][i3 + 1] = (byte) 50;
                        } else if (1 == i5) {
                            ak.ap[i][i2 + 1][i3 + 1] = (byte) 50;
                        } else if (2 == i5) {
                            ak.ap[i][i2 + 1][i3] = (byte) 50;
                        } else if (i5 == 3) {
                            ak.ap[i][i2][i3] = (byte) 50;
                        }
                    }
                    if (ac.af * 159196279 != 0 && ehVar != null) {
                        ehVar.ac(i2, i3, i6, i5, ac.au, 1971795478);
                    }
                } else if (2 == i6) {
                    i8 = (i5 + 1) & 3;
                    if (-1 == -295357285 * ac.ad && ac.ba == null) {
                        r12 = ac.ap(2, i5 + 4, iArr, i9, i10, i15, 248584361);
                        r11 = ac.ap(2, i8, iArr, i9, i10, i15, 248584361);
                        ap = r12;
                    } else {
                        ap = new gi(i4, 2, i5 + 4, i, i2, i3, ac.ad * -295357285, true, null);
                        r11 = new gi(i4, 2, i8, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    ccVar.at(i, i2, i3, i10, ap, r11, fb.af[i5], fb.af[i8], i13, i14);
                    if (ac.ar) {
                        if (i5 == 0) {
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 585;
                            r5 = fb.as[i][i2];
                            i11 = i3 + 1;
                            r5[i11] = r5[i11] | 1170;
                        } else if (i5 == 1) {
                            r5 = fb.as[i][i2];
                            i11 = i3 + 1;
                            r5[i11] = r5[i11] | 1170;
                            r5 = fb.as[i][i2 + 1];
                            r5[i3] = r5[i3] | 585;
                        } else if (2 == i5) {
                            r5 = fb.as[i][i2 + 1];
                            r5[i3] = r5[i3] | 585;
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 1170;
                        } else if (i5 == 3) {
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 1170;
                            r5 = fb.as[i][i2];
                            r5[i3] = r5[i3] | 585;
                        }
                    }
                    if (!(ac.af * 159196279 == 0 || ehVar == null)) {
                        ehVar.ac(i2, i3, i6, i5, ac.au, 1968523483);
                    }
                    if (16 != -1355184749 * ac.ab) {
                        ccVar.az(i, i2, i3, ac.ab * -1355184749);
                    }
                } else if (3 == i6) {
                    if (-1 == ac.ad * -295357285 && ac.ba == null) {
                        ap = ac.ap(3, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 3, i5, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    ccVar.at(i, i2, i3, i10, ap, null, fb.au[i5], 0, i13, i14);
                    if (ac.bu) {
                        if (i5 == 0) {
                            ak.ap[i][i2][i3 + 1] = (byte) 50;
                        } else if (i5 == 1) {
                            ak.ap[i][i2 + 1][i3 + 1] = (byte) 50;
                        } else if (i5 == 2) {
                            ak.ap[i][i2 + 1][i3] = (byte) 50;
                        } else if (i5 == 3) {
                            ak.ap[i][i2][i3] = (byte) 50;
                        }
                    }
                    if (ac.af * 159196279 != 0 && ehVar != null) {
                        ehVar.ac(i2, i3, i6, i5, ac.au, 2068939069);
                    }
                } else if (9 == i6) {
                    if (-1 == -295357285 * ac.ad && ac.ba == null) {
                        r12 = ac.ap(i6, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        r12 = new gi(i4, i6, i5, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.ai(i, i2, i3, i10, 1, 1, r12, 0, i13, i14);
                    if (!(159196279 * ac.af == 0 || ehVar == null)) {
                        ehVar.an(i2, i3, i8, i7, ac.au, (byte) -52);
                    }
                    if (16 != ac.ab * -1355184749) {
                        ccVar.az(i, i2, i3, ac.ab * -1355184749);
                    }
                } else if (i6 == 4) {
                    if (ac.ad * -295357285 == -1 && ac.ba == null) {
                        ap = ac.ap(4, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 4, i5, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.ah(i, i2, i3, i10, ap, null, fb.af[i5], 0, 0, 0, i13, i14);
                } else if (i6 == 5) {
                    i11 = ccVar.bp(i, i2, i3);
                    if (i11 != 0) {
                        i7 = ey.ac((i11 >> 14) & 32767, -1080641367).ab * -1355184749;
                    } else {
                        i7 = 16;
                    }
                    if (ac.ad * -295357285 == -1 && ac.ba == null) {
                        ap = ac.ap(4, i5, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 4, i5, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.ah(i, i2, i3, i10, ap, null, fb.af[i5], 0, fb.av[i5] * i7, fb.ay[i5] * i7, i13, i14);
                } else if (i6 == 6) {
                    i11 = ccVar.bp(i, i2, i3);
                    if (i11 != 0) {
                        i7 = (ey.ac((i11 >> 14) & 32767, -1731528236).ab * -1355184749) / 2;
                    } else {
                        i7 = 8;
                    }
                    if (ac.ad * -295357285 == -1 && ac.ba == null) {
                        ap = ac.ap(4, i5 + 4, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 4, i5 + 4, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    ccVar.ah(i, i2, i3, i10, ap, null, bq.ah, i5, fb.ag[i5] * i7, i7 * fb.ar[i5], i13, i14);
                } else if (7 == i6) {
                    i7 = (i5 + 2) & 3;
                    if (-295357285 * ac.ad == -1 && ac.ba == null) {
                        ap = ac.ap(4, i7 + 4, iArr, i9, i10, i15, 248584361);
                    } else {
                        ap = new gi(i4, 4, i7 + 4, i, i2, i3, -295357285 * ac.ad, true, null);
                    }
                    ccVar.ah(i, i2, i3, i10, ap, null, bq.ah, i7, 0, 0, i13, i14);
                } else if (8 == i6) {
                    i11 = ccVar.bp(i, i2, i3);
                    if (i11 != 0) {
                        i8 = (ey.ac((i11 >> 14) & 32767, -606738086).ab * -1355184749) / 2;
                    } else {
                        i8 = 8;
                    }
                    i7 = (i5 + 2) & 3;
                    if (-1 == ac.ad * -295357285 && ac.ba == null) {
                        r12 = ac.ap(4, i5 + 4, iArr, i9, i10, i15, 248584361);
                        r11 = ac.ap(4, i7 + 4, iArr, i9, i10, i15, 248584361);
                        ap = r12;
                    } else {
                        ap = new gi(i4, 4, i5 + 4, i, i2, i3, -295357285 * ac.ad, true, null);
                        r11 = new gi(i4, 4, i7 + 4, i, i2, i3, ac.ad * -295357285, true, null);
                    }
                    ccVar.ah(i, i2, i3, i10, ap, r11, bq.ah, i5, i8 * fb.ag[i5], fb.ar[i5] * i8, i13, i14);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bs.at(" + ')');
        }
    }

    static void bd(ax axVar, int i, int i2, int i3, byte b) {
        try {
            if (client.mv * -1215889073 < 50 && 617007039 * client.mp != 0) {
                if (axVar.at != null && i < axVar.at.length) {
                    int i4 = axVar.at[i];
                    if (i4 != 0) {
                        int i5 = i4 >> 8;
                        int i6 = (i4 >> 4) & 7;
                        i4 &= 15;
                        client.my[client.mv * -1215889073] = i5;
                        client.mb[client.mv * -1215889073] = i6;
                        client.mw[client.mv * -1215889073] = 0;
                        client.mu[client.mv * -1215889073] = null;
                        i5 = ((i2 - 64) / cj.ak) << 16;
                        client.mc[client.mv * -1215889073] = i4 + (i5 + (((i3 - 64) / cj.ak) << 8));
                        client.mv += 1305703855;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bs.bd(" + ')');
        }
    }

    static void fm(String str, int i) {
        try {
            client.am = str;
            try {
                String up = client.ac.up(cd.am.az, 1266514777);
                up = up + "settings=" + str + "; version=1; path=/; domain=" + client.ac.up(cd.ae.az, -817583253);
                if (str.length() == 0) {
                    up = up + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    up = up + "; Expires=" + cl.aj(aw.aj((byte) -59) + 94608000000L) + "; Max-Age=" + nr.aj;
                }
                kq.aj(client.ac, "document.cookie=\"" + up + "\"", (byte) -3);
            } catch (Throwable th) {
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bs.fm(" + ')');
        }
    }
}
