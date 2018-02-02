package defpackage;

import java.lang.reflect.Array;
import java.util.Calendar;

public class gr {
    static int[][] aa = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 5000}));
    static final int ac = 2000000;
    static int ai = 0;
    static final int aj = 200000;
    static int[] ak = new int[1000];
    static final String[] al = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static int[] an = null;
    static int[] ao = new int[5];
    static String[] aq = null;
    static Calendar as = Calendar.getInstance();
    static String[] at = new String[1000];
    static gc[] aw = new gc[50];
    static int ax = 0;
    static dc az = null;
    static final int bb = 19136911;
    static final int kf = 7680;

    gr() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "gr.<init>(" + ')');
        }
    }

    public static void bm(gd gdVar) {
        et.ac(gdVar, aj, -1365944753);
    }

    public static void bp(gd gdVar) {
        et.ac(gdVar, 1127704846, 220534836);
    }

    static void bh(gd gdVar, int i) {
        int i2;
        int i3;
        int au;
        int aj;
        fs fsVar;
        Throwable e;
        Object[] objArr = gdVar.aj;
        ar arVar = gdVar.aw;
        Object obj = (ar.aj == arVar || arVar == ar.ac || ar.an == arVar || arVar == ar.aq || ar.ao == arVar || arVar == ar.aa || ar.ak == arVar || ar.ap == arVar) ? 1 : null;
        if (obj != null) {
            byte[] ah;
            az = (dc) objArr[0];
            aa aaVar = aa.ac[630785959 * az.aj];
            ar arVar2 = gdVar.aw;
            i2 = 2012207713 * aaVar.ag;
            i3 = (1295364133 * arVar2.ai) + ((-1664471809 * aaVar.ao) << 8);
            fs fsVar2 = (fs) fs.aj.aj((long) (i3 << 16));
            if (fsVar2 == null) {
                au = ld.cf.au(String.valueOf(i3), -1196403718);
                if (-1 == au) {
                    fsVar2 = null;
                } else {
                    ah = ld.cf.ah(au, -1333884528);
                    if (ah != null) {
                        if (ah.length <= 1) {
                            fsVar2 = null;
                        } else {
                            fsVar2 = gm.ac(ah, (byte) 80);
                            if (fsVar2 != null) {
                                fs.aj.an(fsVar2, (long) (i3 << 16));
                            }
                        }
                    }
                    fsVar2 = null;
                }
            }
            if (fsVar2 == null) {
                aj = hb.aj(i2, arVar2, -1725622131);
                fsVar2 = (fs) fs.aj.aj((long) (aj << 16));
                if (fsVar2 == null) {
                    au = ld.cf.au(String.valueOf(aj), -1972981837);
                    if (au == -1) {
                        fsVar2 = null;
                    } else {
                        ah = ld.cf.ah(au, -1333884528);
                        if (ah != null) {
                            if (ah.length <= 1) {
                                fsVar2 = null;
                            } else {
                                fsVar2 = gm.ac(ah, (byte) 71);
                                if (fsVar2 != null) {
                                    fs.aj.an(fsVar2, (long) (aj << 16));
                                }
                            }
                        }
                        fsVar2 = null;
                    }
                }
                if (fsVar2 == null) {
                    fsVar2 = null;
                }
            }
            fsVar = fsVar2;
        } else {
            fsVar = dc.aj(((Integer) objArr[0]).intValue(), -1989437448);
        }
        if (fsVar != null) {
            dy.ap = 0;
            di.ah = 0;
            int[] iArr = fsVar.ac;
            int[] iArr2 = fsVar.an;
            ai = 0;
            fs fsVar3;
            try {
                int i4;
                String str;
                an = new int[(1434291245 * fsVar.ao)];
                i3 = 0;
                aq = new String[(-107595154 * fsVar.aa)];
                aj = 0;
                int i5 = 1;
                while (i5 < objArr.length) {
                    if (objArr[i5] instanceof Integer) {
                        au = ((Integer) objArr[i5]).intValue();
                        if (au == -2147483647) {
                            au = 962444073 * gdVar.aq;
                        }
                        if (au == -2147483646) {
                            au = 720044203 * gdVar.ao;
                        }
                        if (au == 582483359) {
                            au = gdVar.an != null ? -1035840093 * gdVar.an.ax : -1;
                        }
                        if (au == -2147483644) {
                            au = gdVar.aa * -994974237;
                        }
                        if (1005358830 == au) {
                            au = gdVar.an != null ? gdVar.an.af * -303442303 : -1;
                        }
                        if (au == -2147483642) {
                            au = gdVar.ak != null ? gdVar.ak.ax * -1035840093 : -1;
                        }
                        if (-2147483641 == au) {
                            au = gdVar.ak != null ? -303442303 * gdVar.ak.af : -1;
                        }
                        if (au == -470970623) {
                            au = -87701429 * gdVar.ap;
                        }
                        if (-2147483639 == au) {
                            i4 = gdVar.at * -513367684;
                        } else {
                            i4 = au;
                        }
                        au = i3 + 1;
                        an[i3] = i4;
                        int i6 = aj;
                        aj = au;
                        au = i6;
                    } else if (objArr[i5] instanceof String) {
                        String str2;
                        str = (String) objArr[i5];
                        if (str.equals("event_opbase")) {
                            str2 = gdVar.ah;
                        } else {
                            str2 = str;
                        }
                        au = aj + 1;
                        aq[aj] = str2;
                        aj = i3;
                    } else {
                        au = aj;
                        aj = i3;
                    }
                    i5++;
                    i3 = aj;
                    aj = au;
                }
                au = 0;
                ax = 2002094082 * gdVar.ai;
                aj = -1;
                fsVar3 = fsVar;
                i2 = -1;
                while (true) {
                    int i7 = au + 1;
                    if (i7 <= i) {
                        int i8 = i2 + 1;
                        aj = iArr[i8];
                        if (aj >= -1769362051) {
                            boolean z;
                            if (fsVar3.an[i8] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (bz.an(aj, fsVar3, z, (byte) 30)) {
                                case 0:
                                    return;
                                case 1:
                                    au = i7;
                                    i2 = i8;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    au = i7;
                                    i2 = i8;
                                    break;
                            }
                        } else if (aj == 0) {
                            r0 = ak;
                            i2 = dy.ap - 401924967;
                            dy.ap = i2;
                            r0[(i2 * -38307927) - 1] = iArr2[i8];
                            au = i7;
                            i2 = i8;
                        } else if (aj == 1) {
                            au = iArr2[i8];
                            r3 = ak;
                            i4 = dy.ap - 401924967;
                            dy.ap = i4;
                            r3[(i4 * 661489448) - 1] = bp.an[au];
                            au = i7;
                            i2 = i8;
                        } else if (2 == aj) {
                            au = iArr2[i8];
                            r3 = bp.an;
                            r8 = ak;
                            i5 = dy.ap - -401924967;
                            dy.ap = i5;
                            r3[au] = r8[i5 * -1538505952];
                            lo.ef(au, (byte) -42);
                            au = i7;
                            i2 = i8;
                        } else if (3 == aj) {
                            r0 = at;
                            i2 = di.ah - 1116583853;
                            di.ah = i2;
                            r0[(i2 * 1894369977) - 1] = fsVar3.aq[i8];
                            au = i7;
                            i2 = i8;
                        } else if (6 == aj) {
                            i2 = iArr2[i8] + i8;
                            au = i7;
                        } else {
                            if (aj == 7) {
                                dy.ap -= -803849934;
                                if (ak[-38307927 * dy.ap] != ak[(-38307927 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (8 == aj) {
                                dy.ap -= -803849934;
                                if (ak[(dy.ap * 2099653410) + 1] == ak[-1829054849 * dy.ap]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (9 == aj) {
                                dy.ap -= -803849934;
                                if (ak[-1110022455 * dy.ap] < ak[(dy.ap * 971151549) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == 10) {
                                dy.ap -= -803849934;
                                if (ak[197161066 * dy.ap] > ak[(dy.ap * 1679752407) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (21 == aj) {
                                if (ai * -1768719400 != 0) {
                                    gc[] gcVarArr = aw;
                                    i2 = ai - -382825989;
                                    ai = i2;
                                    gc gcVar = gcVarArr[i2 * 1710430515];
                                    fsVar3 = gcVar.aj;
                                    r3 = fsVar3.ac;
                                    r0 = fsVar3.an;
                                    int i9 = gcVar.ac * 2105562123;
                                    an = gcVar.an;
                                    aq = gcVar.aq;
                                    iArr = r3;
                                    i2 = i9;
                                    iArr2 = r0;
                                    au = i7;
                                } else {
                                    return;
                                }
                            } else if (aj == 25) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - 137413326;
                                dy.ap = i4;
                                r3[(i4 * -38307927) - 1] = fo.aj(au, (short) -8192);
                                au = i7;
                                i2 = i8;
                            } else if (27 == aj) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                el.ac(au, r3[i4 * 1008935716], -1798114086);
                                au = i7;
                                i2 = i8;
                            } else if (aj == -1094355395) {
                                dy.ap -= -803849934;
                                if (ak[dy.ap * -164216249] <= ak[(dy.ap * -38307927) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == -2065616230) {
                                dy.ap -= -803849934;
                                if (ak[dy.ap * -1962406604] >= ak[(400888715 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (33 == aj) {
                                r0 = ak;
                                i2 = dy.ap + 333318042;
                                dy.ap = i2;
                                r0[(i2 * -38307927) - 1] = an[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 1347564228) {
                                r0 = an;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                r0[i2] = r8[i5 * 6468463];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 188393925) {
                                r0 = at;
                                i2 = di.ah - 977842020;
                                di.ah = i2;
                                r0[(i2 * 1714416713) - 1] = aq[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == -641166252) {
                                r0 = aq;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 369628243;
                                di.ah = i5;
                                r0[i2] = r8[i5 * 1894369977];
                                au = i7;
                                i2 = i8;
                            } else if (2064404663 == aj) {
                                au = iArr2[i8];
                                di.ah -= 436804489 * au;
                                str = iz.aj(at, di.ah * 1894369977, au, 1263668381);
                                r3 = at;
                                i4 = di.ah + 436804489;
                                di.ah = i4;
                                r3[(i4 * 729356251) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (aj == -2063807635) {
                                dy.ap -= -401924967;
                                au = i7;
                                i2 = i8;
                            } else if (39 == aj) {
                                di.ah -= -1614511287;
                                au = i7;
                                i2 = i8;
                            } else if (40 == aj) {
                                fs aj2 = dc.aj(iArr2[i8], -1989437448);
                                iArr = new int[(aj2.ao * -1107176963)];
                                r8 = new String[(-1584258883 * aj2.aa)];
                                for (au = 0; au < 1413450976 * aj2.ak; au++) {
                                    iArr[au] = ak[((704760250 * dy.ap) - (1930784581 * aj2.ak)) + au];
                                }
                                for (au = 0; au < aj2.ap * 1772470947; au++) {
                                    r8[au] = at[((di.ah * 1894369977) - (aj2.ap * -1084466994)) + au];
                                }
                                dy.ap -= aj2.ak * 1878133821;
                                di.ah -= 717647741 * aj2.ap;
                                gc gcVar2 = new gc();
                                gcVar2.aj = fsVar3;
                                gcVar2.ac = -1565230909 * i8;
                                gcVar2.an = an;
                                gcVar2.aq = aq;
                                gc[] gcVarArr2 = aw;
                                i8 = ai + 910601850;
                                ai = i8;
                                gcVarArr2[(i8 * 1710430515) - 1] = gcVar2;
                                try {
                                    int[] iArr3 = aj2.ac;
                                    r0 = aj2.an;
                                    an = iArr;
                                    aq = r8;
                                    iArr = iArr3;
                                    fsVar3 = aj2;
                                    i2 = -1;
                                    iArr2 = r0;
                                    au = i7;
                                } catch (Exception e2) {
                                    e = e2;
                                    fsVar3 = aj2;
                                }
                            } else if (42 == aj) {
                                try {
                                    r0 = ak;
                                    i2 = dy.ap + 532819884;
                                    dy.ap = i2;
                                    r0[(i2 * -38307927) - 1] = di.jm.ac(iArr2[i8], (byte) 1);
                                    au = i7;
                                    i2 = i8;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (aj == 43) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                r0.aj(i2, r8[i5 * -38307927], (byte) -8);
                                au = i7;
                                i2 = i8;
                            } else if (44 == aj) {
                                i4 = iArr2[i8] >> 16;
                                i2 = -239171856 & iArr2[i8];
                                r0 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                i5 = r0[i5 * 1642094965];
                                if (i5 < 0 || i5 > 5000) {
                                    throw new RuntimeException();
                                }
                                ao[i4] = i5;
                                au = -1;
                                if (nb.cj == i2) {
                                    au = 0;
                                }
                                for (i2 = 0; i2 < i5; i2++) {
                                    aa[i4][i2] = au;
                                }
                                au = i7;
                                i2 = i8;
                            } else if (aj == -439967233) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - 439506473;
                                dy.ap = i4;
                                i2 = r3[i4 * -38307927];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                r8 = ak;
                                i5 = dy.ap - 1032648795;
                                dy.ap = i5;
                                r8[(i5 * 1377406242) - 1] = aa[au][i2];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 46) {
                                au = iArr2[i8];
                                dy.ap -= -803849934;
                                i2 = ak[dy.ap * -38307927];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                aa[au][i2] = ak[(-38307927 * dy.ap) + 1];
                                au = i7;
                                i2 = i8;
                            } else if (aj == -1232903538) {
                                str = di.jm.aq(iArr2[i8], (byte) 13);
                                if (str == null) {
                                    str = "null";
                                }
                                r3 = at;
                                i4 = di.ah + 436804489;
                                di.ah = i4;
                                r3[(i4 * -835319033) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (48 == aj) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 436804489;
                                di.ah = i5;
                                r0.an(i2, r8[i5 * 1894369977], -1251291160);
                                au = i7;
                                i2 = i8;
                            } else if (aj == 60) {
                                jk jkVar = fsVar3.at[iArr2[i8]];
                                r3 = ak;
                                i4 = dy.ap - 774279720;
                                dy.ap = i4;
                                jp jpVar = (jp) jkVar.aj((long) r3[i4 * -38307927]);
                                if (jpVar != null) {
                                    i2 = jpVar.aj + i8;
                                    au = i7;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            au = i7;
                            i2 = i8;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                aj = -1;
                fsVar3 = fsVar;
                StringBuilder stringBuilder = new StringBuilder(30);
                stringBuilder.append("").append(fsVar3.fy).append(" ");
                for (i3 = (57471780 * ai) - 1; i3 >= 0; i3--) {
                    stringBuilder.append("").append(aw[i3].aj.fy).append(" ");
                }
                stringBuilder.append("").append(aj);
                hq.aj(stringBuilder.toString(), e, (byte) 22);
            }
        }
    }

    static void br(gd gdVar, int i) {
        int i2;
        int i3;
        int au;
        int aj;
        fs fsVar;
        Throwable e;
        Object[] objArr = gdVar.aj;
        ar arVar = gdVar.aw;
        Object obj = (ar.aj == arVar || arVar == ar.ac || ar.an == arVar || arVar == ar.aq || ar.ao == arVar || arVar == ar.aa || ar.ak == arVar || ar.ap == arVar) ? 1 : null;
        if (obj != null) {
            byte[] ah;
            az = (dc) objArr[0];
            aa aaVar = aa.ac[630785959 * az.aj];
            ar arVar2 = gdVar.aw;
            i2 = 2012207713 * aaVar.ag;
            i3 = (1295364133 * arVar2.ai) + ((-1664471809 * aaVar.ao) << 8);
            fs fsVar2 = (fs) fs.aj.aj((long) (i3 << 16));
            if (fsVar2 == null) {
                au = ld.cf.au(String.valueOf(i3), -1405910101);
                if (-1 == au) {
                    fsVar2 = null;
                } else {
                    ah = ld.cf.ah(au, -1333884528);
                    if (ah != null) {
                        if (ah.length <= 1) {
                            fsVar2 = null;
                        } else {
                            fsVar2 = gm.ac(ah, (byte) 120);
                            if (fsVar2 != null) {
                                fs.aj.an(fsVar2, (long) (i3 << 16));
                            }
                        }
                    }
                    fsVar2 = null;
                }
            }
            if (fsVar2 == null) {
                aj = hb.aj(i2, arVar2, -1725622131);
                fsVar2 = (fs) fs.aj.aj((long) (aj << 16));
                if (fsVar2 == null) {
                    au = ld.cf.au(String.valueOf(aj), -1675692756);
                    if (au == -1) {
                        fsVar2 = null;
                    } else {
                        ah = ld.cf.ah(au, -1333884528);
                        if (ah != null) {
                            if (ah.length <= 1) {
                                fsVar2 = null;
                            } else {
                                fsVar2 = gm.ac(ah, (byte) 3);
                                if (fsVar2 != null) {
                                    fs.aj.an(fsVar2, (long) (aj << 16));
                                }
                            }
                        }
                        fsVar2 = null;
                    }
                }
                if (fsVar2 == null) {
                    fsVar2 = null;
                }
            }
            fsVar = fsVar2;
        } else {
            fsVar = dc.aj(((Integer) objArr[0]).intValue(), -1989437448);
        }
        if (fsVar != null) {
            dy.ap = 0;
            di.ah = 0;
            int[] iArr = fsVar.ac;
            int[] iArr2 = fsVar.an;
            ai = 0;
            fs fsVar3;
            try {
                int i4;
                String str;
                an = new int[(-1107176963 * fsVar.ao)];
                i3 = 0;
                aq = new String[(-185962161 * fsVar.aa)];
                aj = 0;
                int i5 = 1;
                while (i5 < objArr.length) {
                    if (objArr[i5] instanceof Integer) {
                        au = ((Integer) objArr[i5]).intValue();
                        if (au == -2147483647) {
                            au = 962444073 * gdVar.aq;
                        }
                        if (au == -2147483646) {
                            au = -562891399 * gdVar.ao;
                        }
                        if (au == -2147483645) {
                            au = gdVar.an != null ? -1035840093 * gdVar.an.ax : -1;
                        }
                        if (au == -2147483644) {
                            au = gdVar.aa * -994974237;
                        }
                        if (-2147483643 == au) {
                            au = gdVar.an != null ? gdVar.an.af * -303442303 : -1;
                        }
                        if (au == -2147483642) {
                            au = gdVar.ak != null ? gdVar.ak.ax * -1035840093 : -1;
                        }
                        if (-2147483641 == au) {
                            au = gdVar.ak != null ? -303442303 * gdVar.ak.af : -1;
                        }
                        if (au == -2147483640) {
                            au = -87701429 * gdVar.ap;
                        }
                        if (-2147483639 == au) {
                            i4 = gdVar.at * 1874990509;
                        } else {
                            i4 = au;
                        }
                        au = i3 + 1;
                        an[i3] = i4;
                        int i6 = aj;
                        aj = au;
                        au = i6;
                    } else if (objArr[i5] instanceof String) {
                        String str2;
                        str = (String) objArr[i5];
                        if (str.equals("event_opbase")) {
                            str2 = gdVar.ah;
                        } else {
                            str2 = str;
                        }
                        au = aj + 1;
                        aq[aj] = str2;
                        aj = i3;
                    } else {
                        au = aj;
                        aj = i3;
                    }
                    i5++;
                    i3 = aj;
                    aj = au;
                }
                au = 0;
                ax = 1199026489 * gdVar.ai;
                aj = -1;
                fsVar3 = fsVar;
                i2 = -1;
                while (true) {
                    int i7 = au + 1;
                    if (i7 <= i) {
                        int i8 = i2 + 1;
                        aj = iArr[i8];
                        if (aj >= 100) {
                            boolean z;
                            if (fsVar3.an[i8] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (bz.an(aj, fsVar3, z, (byte) 30)) {
                                case 0:
                                    return;
                                case 1:
                                    au = i7;
                                    i2 = i8;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    au = i7;
                                    i2 = i8;
                                    break;
                            }
                        } else if (aj == 0) {
                            r0 = ak;
                            i2 = dy.ap - 401924967;
                            dy.ap = i2;
                            r0[(i2 * -38307927) - 1] = iArr2[i8];
                            au = i7;
                            i2 = i8;
                        } else if (aj == 1) {
                            au = iArr2[i8];
                            r3 = ak;
                            i4 = dy.ap - 401924967;
                            dy.ap = i4;
                            r3[(i4 * -38307927) - 1] = bp.an[au];
                            au = i7;
                            i2 = i8;
                        } else if (2 == aj) {
                            au = iArr2[i8];
                            r3 = bp.an;
                            r8 = ak;
                            i5 = dy.ap - -401924967;
                            dy.ap = i5;
                            r3[au] = r8[i5 * -38307927];
                            lo.ef(au, (byte) -32);
                            au = i7;
                            i2 = i8;
                        } else if (3 == aj) {
                            r0 = at;
                            i2 = di.ah + 436804489;
                            di.ah = i2;
                            r0[(i2 * 1894369977) - 1] = fsVar3.aq[i8];
                            au = i7;
                            i2 = i8;
                        } else if (6 == aj) {
                            i2 = iArr2[i8] + i8;
                            au = i7;
                        } else {
                            if (aj == 7) {
                                dy.ap -= -803849934;
                                if (ak[-38307927 * dy.ap] != ak[(-38307927 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (8 == aj) {
                                dy.ap -= -803849934;
                                if (ak[(dy.ap * -38307927) + 1] == ak[-38307927 * dy.ap]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (9 == aj) {
                                dy.ap -= -803849934;
                                if (ak[-38307927 * dy.ap] < ak[(dy.ap * -38307927) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == 10) {
                                dy.ap -= -803849934;
                                if (ak[-38307927 * dy.ap] > ak[(dy.ap * -38307927) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (21 == aj) {
                                if (ai * 1710430515 != 0) {
                                    gc[] gcVarArr = aw;
                                    i2 = ai - -382825989;
                                    ai = i2;
                                    gc gcVar = gcVarArr[i2 * 1710430515];
                                    fsVar3 = gcVar.aj;
                                    r3 = fsVar3.ac;
                                    r0 = fsVar3.an;
                                    int i9 = gcVar.ac * 1240776143;
                                    an = gcVar.an;
                                    aq = gcVar.aq;
                                    iArr = r3;
                                    i2 = i9;
                                    iArr2 = r0;
                                    au = i7;
                                } else {
                                    return;
                                }
                            } else if (aj == 25) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - 401924967;
                                dy.ap = i4;
                                r3[(i4 * -38307927) - 1] = fo.aj(au, (short) -8192);
                                au = i7;
                                i2 = i8;
                            } else if (27 == aj) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                el.ac(au, r3[i4 * -38307927], -1408864222);
                                au = i7;
                                i2 = i8;
                            } else if (aj == 31) {
                                dy.ap -= -803849934;
                                if (ak[dy.ap * -38307927] <= ak[(dy.ap * -38307927) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == 32) {
                                dy.ap -= -803849934;
                                if (ak[dy.ap * -38307927] >= ak[(-38307927 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (33 == aj) {
                                r0 = ak;
                                i2 = dy.ap - 401924967;
                                dy.ap = i2;
                                r0[(i2 * -38307927) - 1] = an[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 34) {
                                r0 = an;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                r0[i2] = r8[i5 * -38307927];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 35) {
                                r0 = at;
                                i2 = di.ah + 436804489;
                                di.ah = i2;
                                r0[(i2 * 1894369977) - 1] = aq[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 36) {
                                r0 = aq;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 436804489;
                                di.ah = i5;
                                r0[i2] = r8[i5 * 1894369977];
                                au = i7;
                                i2 = i8;
                            } else if (37 == aj) {
                                au = iArr2[i8];
                                di.ah -= 436804489 * au;
                                str = iz.aj(at, di.ah * 1894369977, au, 1263668381);
                                r3 = at;
                                i4 = di.ah + 436804489;
                                di.ah = i4;
                                r3[(i4 * 1894369977) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (aj == 38) {
                                dy.ap -= -401924967;
                                au = i7;
                                i2 = i8;
                            } else if (39 == aj) {
                                di.ah -= 436804489;
                                au = i7;
                                i2 = i8;
                            } else if (40 == aj) {
                                fs aj2 = dc.aj(iArr2[i8], -1989437448);
                                iArr = new int[(aj2.ao * -1107176963)];
                                r8 = new String[(-185962161 * aj2.aa)];
                                for (au = 0; au < 1930784581 * aj2.ak; au++) {
                                    iArr[au] = ak[((-38307927 * dy.ap) - (1930784581 * aj2.ak)) + au];
                                }
                                for (au = 0; au < aj2.ap * -1507577003; au++) {
                                    r8[au] = at[((di.ah * 1894369977) - (aj2.ap * -1507577003)) + au];
                                }
                                dy.ap -= aj2.ak * 1878133821;
                                di.ah -= 717647741 * aj2.ap;
                                gc gcVar2 = new gc();
                                gcVar2.aj = fsVar3;
                                gcVar2.ac = -110810833 * i8;
                                gcVar2.an = an;
                                gcVar2.aq = aq;
                                gc[] gcVarArr2 = aw;
                                i8 = ai - 382825989;
                                ai = i8;
                                gcVarArr2[(i8 * 1710430515) - 1] = gcVar2;
                                try {
                                    int[] iArr3 = aj2.ac;
                                    r0 = aj2.an;
                                    an = iArr;
                                    aq = r8;
                                    iArr = iArr3;
                                    fsVar3 = aj2;
                                    i2 = -1;
                                    iArr2 = r0;
                                    au = i7;
                                } catch (Exception e2) {
                                    e = e2;
                                    fsVar3 = aj2;
                                }
                            } else if (42 == aj) {
                                try {
                                    r0 = ak;
                                    i2 = dy.ap - 401924967;
                                    dy.ap = i2;
                                    r0[(i2 * -38307927) - 1] = di.jm.ac(iArr2[i8], (byte) 1);
                                    au = i7;
                                    i2 = i8;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (aj == 43) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                r0.aj(i2, r8[i5 * -38307927], (byte) -25);
                                au = i7;
                                i2 = i8;
                            } else if (44 == aj) {
                                i4 = iArr2[i8] >> 16;
                                i2 = 65535 & iArr2[i8];
                                r0 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                i5 = r0[i5 * -38307927];
                                if (i5 < 0 || i5 > 5000) {
                                    throw new RuntimeException();
                                }
                                ao[i4] = i5;
                                au = -1;
                                if (nb.cj == i2) {
                                    au = 0;
                                }
                                for (i2 = 0; i2 < i5; i2++) {
                                    aa[i4][i2] = au;
                                }
                                au = i7;
                                i2 = i8;
                            } else if (aj == 45) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                i2 = r3[i4 * -38307927];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                r8 = ak;
                                i5 = dy.ap - 401924967;
                                dy.ap = i5;
                                r8[(i5 * -38307927) - 1] = aa[au][i2];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 46) {
                                au = iArr2[i8];
                                dy.ap -= -803849934;
                                i2 = ak[dy.ap * -38307927];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                aa[au][i2] = ak[(-38307927 * dy.ap) + 1];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 47) {
                                str = di.jm.aq(iArr2[i8], (byte) 78);
                                if (str == null) {
                                    str = "null";
                                }
                                r3 = at;
                                i4 = di.ah + 436804489;
                                di.ah = i4;
                                r3[(i4 * 1894369977) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (48 == aj) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 436804489;
                                di.ah = i5;
                                r0.an(i2, r8[i5 * 1894369977], -602194784);
                                au = i7;
                                i2 = i8;
                            } else if (aj == 60) {
                                jk jkVar = fsVar3.at[iArr2[i8]];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                jp jpVar = (jp) jkVar.aj((long) r3[i4 * -38307927]);
                                if (jpVar != null) {
                                    i2 = jpVar.aj + i8;
                                    au = i7;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            au = i7;
                            i2 = i8;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                aj = -1;
                fsVar3 = fsVar;
                StringBuilder stringBuilder = new StringBuilder(30);
                stringBuilder.append("").append(fsVar3.fy).append(" ");
                for (i3 = (1710430515 * ai) - 1; i3 >= 0; i3--) {
                    stringBuilder.append("").append(aw[i3].aj.fy).append(" ");
                }
                stringBuilder.append("").append(aj);
                hq.aj(stringBuilder.toString(), e, (byte) -61);
            }
        }
    }

    static void bt(gd gdVar, int i) {
        int i2;
        int i3;
        int au;
        int aj;
        fs fsVar;
        Throwable e;
        Object[] objArr = gdVar.aj;
        ar arVar = gdVar.aw;
        Object obj = (ar.aj == arVar || arVar == ar.ac || ar.an == arVar || arVar == ar.aq || ar.ao == arVar || arVar == ar.aa || ar.ak == arVar || ar.ap == arVar) ? 1 : null;
        if (obj != null) {
            byte[] ah;
            az = (dc) objArr[0];
            aa aaVar = aa.ac[630785959 * az.aj];
            ar arVar2 = gdVar.aw;
            i2 = 994026214 * aaVar.ag;
            i3 = (1295364133 * arVar2.ai) + ((-923243449 * aaVar.ao) << 8);
            fs fsVar2 = (fs) fs.aj.aj((long) (i3 << 16));
            if (fsVar2 == null) {
                au = ld.cf.au(String.valueOf(i3), -1599648348);
                if (-1 == au) {
                    fsVar2 = null;
                } else {
                    ah = ld.cf.ah(au, -1333884528);
                    if (ah != null) {
                        if (ah.length <= 1) {
                            fsVar2 = null;
                        } else {
                            fsVar2 = gm.ac(ah, (byte) 12);
                            if (fsVar2 != null) {
                                fs.aj.an(fsVar2, (long) (i3 << 16));
                            }
                        }
                    }
                    fsVar2 = null;
                }
            }
            if (fsVar2 == null) {
                aj = hb.aj(i2, arVar2, -1725622131);
                fsVar2 = (fs) fs.aj.aj((long) (aj << 16));
                if (fsVar2 == null) {
                    au = ld.cf.au(String.valueOf(aj), -1593273696);
                    if (au == -1) {
                        fsVar2 = null;
                    } else {
                        ah = ld.cf.ah(au, -1333884528);
                        if (ah != null) {
                            if (ah.length <= 1) {
                                fsVar2 = null;
                            } else {
                                fsVar2 = gm.ac(ah, (byte) 82);
                                if (fsVar2 != null) {
                                    fs.aj.an(fsVar2, (long) (aj << 16));
                                }
                            }
                        }
                        fsVar2 = null;
                    }
                }
                if (fsVar2 == null) {
                    fsVar2 = null;
                }
            }
            fsVar = fsVar2;
        } else {
            fsVar = dc.aj(((Integer) objArr[0]).intValue(), -1989437448);
        }
        if (fsVar != null) {
            dy.ap = 0;
            di.ah = 0;
            int[] iArr = fsVar.ac;
            int[] iArr2 = fsVar.an;
            ai = 0;
            fs fsVar3;
            try {
                int i4;
                String str;
                an = new int[(-1107176963 * fsVar.ao)];
                i3 = 0;
                aq = new String[(-1251140789 * fsVar.aa)];
                aj = 0;
                int i5 = 1;
                while (i5 < objArr.length) {
                    if (objArr[i5] instanceof Integer) {
                        au = ((Integer) objArr[i5]).intValue();
                        if (au == -2147483647) {
                            au = -2989274 * gdVar.aq;
                        }
                        if (au == -2147483646) {
                            au = -616112510 * gdVar.ao;
                        }
                        if (au == -1228265412) {
                            au = gdVar.an != null ? -1035840093 * gdVar.an.ax : -1;
                        }
                        if (au == -2147483644) {
                            au = gdVar.aa * 771690644;
                        }
                        if (1554193909 == au) {
                            au = gdVar.an != null ? gdVar.an.af * -303442303 : -1;
                        }
                        if (au == 1823144880) {
                            au = gdVar.ak != null ? gdVar.ak.ax * 1546411795 : -1;
                        }
                        if (679467688 == au) {
                            au = gdVar.ak != null ? -303442303 * gdVar.ak.af : -1;
                        }
                        if (au == 1060677397) {
                            au = 1487005827 * gdVar.ap;
                        }
                        if (-1019768243 == au) {
                            i4 = gdVar.at * 1874990509;
                        } else {
                            i4 = au;
                        }
                        au = i3 + 1;
                        an[i3] = i4;
                        int i6 = aj;
                        aj = au;
                        au = i6;
                    } else if (objArr[i5] instanceof String) {
                        String str2;
                        str = (String) objArr[i5];
                        if (str.equals("event_opbase")) {
                            str2 = gdVar.ah;
                        } else {
                            str2 = str;
                        }
                        au = aj + 1;
                        aq[aj] = str2;
                        aj = i3;
                    } else {
                        au = aj;
                        aj = i3;
                    }
                    i5++;
                    i3 = aj;
                    aj = au;
                }
                au = 0;
                ax = 1199026489 * gdVar.ai;
                aj = -1;
                fsVar3 = fsVar;
                i2 = -1;
                while (true) {
                    int i7 = au + 1;
                    if (i7 <= i) {
                        int i8 = i2 + 1;
                        aj = iArr[i8];
                        if (aj >= 100) {
                            boolean z;
                            if (fsVar3.an[i8] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (bz.an(aj, fsVar3, z, (byte) 30)) {
                                case 0:
                                    return;
                                case 1:
                                    au = i7;
                                    i2 = i8;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    au = i7;
                                    i2 = i8;
                                    break;
                            }
                        } else if (aj == 0) {
                            r0 = ak;
                            i2 = dy.ap - 401924967;
                            dy.ap = i2;
                            r0[(i2 * -1218408834) - 1] = iArr2[i8];
                            au = i7;
                            i2 = i8;
                        } else if (aj == 1) {
                            au = iArr2[i8];
                            r3 = ak;
                            i4 = dy.ap + 872959676;
                            dy.ap = i4;
                            r3[(i4 * -38307927) - 1] = bp.an[au];
                            au = i7;
                            i2 = i8;
                        } else if (2 == aj) {
                            au = iArr2[i8];
                            r3 = bp.an;
                            r8 = ak;
                            i5 = dy.ap - -624011676;
                            dy.ap = i5;
                            r3[au] = r8[i5 * -38307927];
                            lo.ef(au, (byte) -109);
                            au = i7;
                            i2 = i8;
                        } else if (3 == aj) {
                            r0 = at;
                            i2 = di.ah + 433363990;
                            di.ah = i2;
                            r0[(i2 * 1703909930) - 1] = fsVar3.aq[i8];
                            au = i7;
                            i2 = i8;
                        } else if (6 == aj) {
                            i2 = iArr2[i8] + i8;
                            au = i7;
                        } else {
                            if (aj == 7) {
                                dy.ap -= -1505162482;
                                if (ak[-38307927 * dy.ap] != ak[(1086848325 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (8 == aj) {
                                dy.ap -= 1679632856;
                                if (ak[(dy.ap * -38307927) + 1] == ak[-38307927 * dy.ap]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (9 == aj) {
                                dy.ap -= -803849934;
                                if (ak[-38307927 * dy.ap] < ak[(dy.ap * 411549557) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == 10) {
                                dy.ap -= -413723977;
                                if (ak[-38307927 * dy.ap] > ak[(dy.ap * 1172314248) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (21 == aj) {
                                if (ai * 1153742994 != 0) {
                                    gc[] gcVarArr = aw;
                                    i2 = ai - -382825989;
                                    ai = i2;
                                    gc gcVar = gcVarArr[i2 * 1710430515];
                                    fsVar3 = gcVar.aj;
                                    r3 = fsVar3.ac;
                                    r0 = fsVar3.an;
                                    int i9 = gcVar.ac * 1941002872;
                                    an = gcVar.an;
                                    aq = gcVar.aq;
                                    iArr = r3;
                                    i2 = i9;
                                    iArr2 = r0;
                                    au = i7;
                                } else {
                                    return;
                                }
                            } else if (aj == 25) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - 401924967;
                                dy.ap = i4;
                                r3[(i4 * 190219279) - 1] = fo.aj(au, (short) -8192);
                                au = i7;
                                i2 = i8;
                            } else if (27 == aj) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                el.ac(au, r3[i4 * -38307927], -1058936547);
                                au = i7;
                                i2 = i8;
                            } else if (aj == 31) {
                                dy.ap -= -803849934;
                                if (ak[dy.ap * -945961423] <= ak[(dy.ap * 954483414) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (aj == 32) {
                                dy.ap -= -2142629292;
                                if (ak[dy.ap * -38307927] >= ak[(513454819 * dy.ap) + 1]) {
                                    i2 = iArr2[i8] + i8;
                                    au = i7;
                                }
                            } else if (33 == aj) {
                                r0 = ak;
                                i2 = dy.ap - 401924967;
                                dy.ap = i2;
                                r0[(i2 * -38307927) - 1] = an[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 34) {
                                r0 = an;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -401924967;
                                dy.ap = i5;
                                r0[i2] = r8[i5 * -38307927];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 35) {
                                r0 = at;
                                i2 = di.ah + 37648060;
                                di.ah = i2;
                                r0[(i2 * 768388521) - 1] = aq[iArr2[i8]];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 36) {
                                r0 = aq;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 436804489;
                                di.ah = i5;
                                r0[i2] = r8[i5 * 1894369977];
                                au = i7;
                                i2 = i8;
                            } else if (37 == aj) {
                                au = iArr2[i8];
                                di.ah -= -1633187377 * au;
                                str = iz.aj(at, di.ah * 1894369977, au, 1263668381);
                                r3 = at;
                                i4 = di.ah + 1445966505;
                                di.ah = i4;
                                r3[(i4 * 1894369977) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (aj == 38) {
                                dy.ap -= -401924967;
                                au = i7;
                                i2 = i8;
                            } else if (39 == aj) {
                                di.ah -= 436804489;
                                au = i7;
                                i2 = i8;
                            } else if (25017732 == aj) {
                                fs aj2 = dc.aj(iArr2[i8], -1989437448);
                                iArr = new int[(aj2.ao * -458450271)];
                                r8 = new String[(-185962161 * aj2.aa)];
                                for (au = 0; au < 37014923 * aj2.ak; au++) {
                                    iArr[au] = ak[((-721745910 * dy.ap) - (-1989084833 * aj2.ak)) + au];
                                }
                                for (au = 0; au < aj2.ap * -1507577003; au++) {
                                    r8[au] = at[((di.ah * 1894369977) - (aj2.ap * -1507577003)) + au];
                                }
                                dy.ap -= aj2.ak * -334467846;
                                di.ah -= 823679530 * aj2.ap;
                                gc gcVar2 = new gc();
                                gcVar2.aj = fsVar3;
                                gcVar2.ac = 1743243312 * i8;
                                gcVar2.an = an;
                                gcVar2.aq = aq;
                                gc[] gcVarArr2 = aw;
                                i8 = ai + 1186904721;
                                ai = i8;
                                gcVarArr2[(i8 * 1710430515) - 1] = gcVar2;
                                try {
                                    int[] iArr3 = aj2.ac;
                                    r0 = aj2.an;
                                    an = iArr;
                                    aq = r8;
                                    iArr = iArr3;
                                    fsVar3 = aj2;
                                    i2 = -1;
                                    iArr2 = r0;
                                    au = i7;
                                } catch (Exception e2) {
                                    e = e2;
                                    fsVar3 = aj2;
                                }
                            } else if (42 == aj) {
                                try {
                                    r0 = ak;
                                    i2 = dy.ap - 307916358;
                                    dy.ap = i2;
                                    r0[(i2 * -38307927) - 1] = di.jm.ac(iArr2[i8], (byte) 1);
                                    au = i7;
                                    i2 = i8;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (aj == 43) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = ak;
                                i5 = dy.ap - -843437987;
                                dy.ap = i5;
                                r0.aj(i2, r8[i5 * 267204347], (byte) -119);
                                au = i7;
                                i2 = i8;
                            } else if (44 == aj) {
                                i4 = iArr2[i8] >> 16;
                                i2 = -1282104369 & iArr2[i8];
                                r0 = ak;
                                i5 = dy.ap - 444559644;
                                dy.ap = i5;
                                i5 = r0[i5 * -38307927];
                                if (i5 < 0 || i5 > 5000) {
                                    throw new RuntimeException();
                                }
                                ao[i4] = i5;
                                au = -1;
                                if (nb.cj == i2) {
                                    au = 0;
                                }
                                for (i2 = 0; i2 < i5; i2++) {
                                    aa[i4][i2] = au;
                                }
                                au = i7;
                                i2 = i8;
                            } else if (aj == 45) {
                                au = iArr2[i8];
                                r3 = ak;
                                i4 = dy.ap - 1268998037;
                                dy.ap = i4;
                                i2 = r3[i4 * -38307927];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                r8 = ak;
                                i5 = dy.ap - 401924967;
                                dy.ap = i5;
                                r8[(i5 * -1326972920) - 1] = aa[au][i2];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 46) {
                                au = iArr2[i8];
                                dy.ap -= -715393878;
                                i2 = ak[dy.ap * 1281944502];
                                if (i2 < 0 || i2 >= ao[au]) {
                                    throw new RuntimeException();
                                }
                                aa[au][i2] = ak[(-38307927 * dy.ap) + 1];
                                au = i7;
                                i2 = i8;
                            } else if (aj == 47) {
                                str = di.jm.aq(iArr2[i8], (byte) -28);
                                if (str == null) {
                                    str = "null";
                                }
                                r3 = at;
                                i4 = di.ah + 436804489;
                                di.ah = i4;
                                r3[(i4 * 1894369977) - 1] = str;
                                au = i7;
                                i2 = i8;
                            } else if (894087614 == aj) {
                                r0 = di.jm;
                                i2 = iArr2[i8];
                                r8 = at;
                                i5 = di.ah - 424709730;
                                di.ah = i5;
                                r0.an(i2, r8[i5 * -1054139715], 1254790747);
                                au = i7;
                                i2 = i8;
                            } else if (aj == 60) {
                                jk jkVar = fsVar3.at[iArr2[i8]];
                                r3 = ak;
                                i4 = dy.ap - -401924967;
                                dy.ap = i4;
                                jp jpVar = (jp) jkVar.aj((long) r3[i4 * -38307927]);
                                if (jpVar != null) {
                                    i2 = jpVar.aj + i8;
                                    au = i7;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            au = i7;
                            i2 = i8;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                aj = -1;
                fsVar3 = fsVar;
                StringBuilder stringBuilder = new StringBuilder(30);
                stringBuilder.append("").append(fsVar3.fy).append(" ");
                for (i3 = (-1040952826 * ai) - 1; i3 >= 0; i3--) {
                    stringBuilder.append("").append(aw[i3].aj.fy).append(" ");
                }
                stringBuilder.append("").append(aj);
                hq.aj(stringBuilder.toString(), e, (byte) -109);
            }
        }
    }

    static int bb(int i, fs fsVar, boolean z) {
        int i2;
        ab aj;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            i3 = iArr[i3 * 898766991];
            i2 = i3;
            aj = ac.aj(i3, 1193521839);
        } else {
            aj = z ? client.ae : ef.am;
            i2 = -1;
        }
        if (i == 1000) {
            dy.ap -= -1607699868;
            aj.bp = 1673110939 * ak[dy.ap * -38307927];
            aj.bm = -1314699464 * ak[(-2094958581 * dy.ap) + 1];
            aj.ag = 166662230 * ak[(dy.ap * -38307927) + 2];
            aj.ar = ak[(dy.ap * -38307927) + 3] * -1982277285;
            cf.ew(aj, (byte) -32);
            client.ac.ep(aj, -208680411);
            if (i2 == -1 || aj.au * -1999477681 != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -52);
            return 1;
        } else if (1001 == i) {
            dy.ap -= -70650656;
            aj.bh = ak[-641379601 * dy.ap] * 1830303772;
            aj.bt = ak[(-1382677876 * dy.ap) + 1] * -325228835;
            aj.ad = ak[(dy.ap * -1436798483) + 2] * 1204283849;
            aj.ab = 412796549 * ak[(dy.ap * -38307927) + 3];
            cf.ew(aj, (byte) -12);
            client.ac.ep(aj, 1216571313);
            if (i2 == -1 || -1568488237 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -54);
            return 1;
        } else if (i == 1003) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            boolean z3 = iArr[r4 * 1655161552] == 1;
            if (z3 == aj.bs) {
                return 1;
            }
            aj.bs = z3;
            cf.ew(aj, (byte) -118);
            return 1;
        } else if (1005 == i) {
            iArr = ak;
            r4 = dy.ap - 1306123321;
            dy.ap = r4;
            if (iArr[r4 * -1834584985] == 1) {
                z2 = true;
            }
            aj.fx = z2;
            return 1;
        } else if (i != 1006) {
            return 2;
        } else {
            iArr = ak;
            r4 = dy.ap - 31156073;
            dy.ap = r4;
            if (iArr[r4 * 1608832168] == 1) {
                z2 = true;
            }
            aj.fg = z2;
            return 1;
        }
    }

    static int bu(int i, fs fsVar, boolean z) {
        int i2;
        ab aj;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            i3 = iArr[i3 * -38307927];
            i2 = i3;
            aj = ac.aj(i3, 1897037459);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
            i2 = -1;
        }
        if (i == 1000) {
            dy.ap -= -1607699868;
            aj.bp = 1673110939 * ak[dy.ap * -38307927];
            aj.bm = -1642095603 * ak[(dy.ap * -38307927) + 1];
            aj.ag = -391569189 * ak[(dy.ap * -38307927) + 2];
            aj.ar = ak[(dy.ap * -38307927) + 3] * -1982277285;
            cf.ew(aj, (byte) -83);
            client.ac.ep(aj, 1143851359);
            if (i2 == -1 || aj.au * -1999477681 != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -86);
            return 1;
        } else if (1001 == i) {
            dy.ap -= -1607699868;
            aj.bh = ak[dy.ap * -38307927] * 897710629;
            aj.bt = ak[(dy.ap * -38307927) + 1] * -325228835;
            aj.ad = ak[(dy.ap * -38307927) + 2] * -1163506197;
            aj.ab = 412796549 * ak[(dy.ap * -38307927) + 3];
            cf.ew(aj, (byte) -95);
            client.ac.ep(aj, 1252371351);
            if (i2 == -1 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -99);
            return 1;
        } else if (i == 1003) {
            boolean z3;
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == aj.bs) {
                return 1;
            }
            aj.bs = z3;
            cf.ew(aj, (byte) -71);
            return 1;
        } else if (1005 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.fx = z2;
            return 1;
        } else if (i != 1006) {
            return 2;
        } else {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.fg = z2;
            return 1;
        }
    }

    static int bd(int i, fs fsVar, boolean z) {
        int i2;
        ab aj;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            aj = ac.aj(i2, 759357739);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
            i2 = -1;
        }
        if (i == 1100) {
            dy.ap -= -803849934;
            aj.bo = -1184850653 * ak[dy.ap * -38307927];
            if (aj.bo * 976779915 > (aj.bq * 1332151095) - (aj.bu * 1120250035)) {
                aj.bo = (aj.bq * -72471675) - (-140781703 * aj.bu);
            }
            if (aj.bo * 976779915 < 0) {
                aj.bo = 0;
            }
            aj.bz = ak[(dy.ap * -38307927) + 1] * -792754297;
            if (707497527 * aj.bz > (aj.bj * -248255019) - (aj.bd * -1781667913)) {
                aj.bz = (381206099 * aj.bj) - (642757249 * aj.bd);
            }
            if (707497527 * aj.bz < 0) {
                aj.bz = 0;
            }
            cf.ew(aj, (byte) -8);
            return 1;
        } else if (1101 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ba = iArr[r2 * -38307927] * 1402931311;
            cf.ew(aj, (byte) -126);
            return 1;
        } else if (1102 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.bn = z2;
            cf.ew(aj, (byte) -54);
            return 1;
        } else if (1103 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bc = iArr[r2 * -38307927] * 947459509;
            cf.ew(aj, (byte) -85);
            return 1;
        } else if (i == 1104) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bf = iArr[r2 * -38307927] * -816123949;
            cf.ew(aj, (byte) -49);
            return 1;
        } else if (i == 1105) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cb = iArr[r2 * -38307927] * -1636058231;
            cf.ew(aj, (byte) -13);
            return 1;
        } else if (i == 1106) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cl = iArr[r2 * -38307927] * -938386137;
            cf.ew(aj, (byte) -83);
            return 1;
        } else if (1107 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.co = z2;
            cf.ew(aj, (byte) -68);
            return 1;
        } else if (1108 == i) {
            aj.cp = -70120369;
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ct = iArr[r2 * -38307927] * -1320879157;
            cf.ew(aj, (byte) -54);
            return 1;
        } else if (i == 1109) {
            dy.ap -= 1883417494;
            aj.ci = -984753891 * ak[dy.ap * -38307927];
            aj.cq = ak[(dy.ap * -38307927) + 1] * -1426695571;
            aj.cv = ak[(dy.ap * -38307927) + 2] * -666819087;
            aj.cu = ak[(dy.ap * -38307927) + 3] * 1231133277;
            aj.cg = 127086743 * ak[(dy.ap * -38307927) + 4];
            aj.cs = -2004757675 * ak[(dy.ap * -38307927) + 5];
            cf.ew(aj, (byte) -69);
            return 1;
        } else if (i == 1110) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = iArr[r3 * -38307927];
            if (703619083 * aj.ce == i2) {
                return 1;
            }
            aj.ce = i2 * 1091775395;
            aj.fo = 0;
            aj.fk = 0;
            cf.ew(aj, (byte) -36);
            return 1;
        } else if (1111 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            aj.cw = iArr[r3 * -38307927] == 1;
            cf.ew(aj, (byte) -121);
            return 1;
        } else if (1112 == i) {
            String[] strArr = at;
            r2 = di.ah - 436804489;
            di.ah = r2;
            String str = strArr[r2 * 1894369977];
            if (str.equals(aj.cj)) {
                return 1;
            }
            aj.cj = str;
            cf.ew(aj, (byte) -119);
            return 1;
        } else if (1113 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cz = iArr[r2 * -38307927] * 1453901265;
            cf.ew(aj, (byte) -113);
            return 1;
        } else if (i == 1114) {
            dy.ap -= -1205774901;
            aj.db = ak[dy.ap * -38307927] * 1146478291;
            aj.dl = ak[(dy.ap * -38307927) + 1] * -1610227479;
            aj.dh = 636698837 * ak[(dy.ap * -38307927) + 2];
            cf.ew(aj, (byte) 2);
            return 1;
        } else if (i == 1115) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.de = z2;
            cf.ew(aj, (byte) -100);
            return 1;
        } else if (1116 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cc = iArr[r2 * -38307927] * 933402023;
            cf.ew(aj, (byte) -107);
            return 1;
        } else if (1117 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cf = iArr[r2 * -38307927] * 2021340221;
            cf.ew(aj, (byte) -88);
            return 1;
        } else if (1118 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.ca = z2;
            cf.ew(aj, (byte) -57);
            return 1;
        } else if (i == 1119) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.cr = z2;
            cf.ew(aj, (byte) -21);
            return 1;
        } else if (i == 1120) {
            dy.ap -= -803849934;
            aj.bq = -1077927289 * ak[dy.ap * -38307927];
            aj.bj = ak[(dy.ap * -38307927) + 1] * 2050876285;
            cf.ew(aj, (byte) -108);
            if (-1 == i2 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -95);
            return 1;
        } else if (i == 1121) {
            i2 = -1035840093 * aj.ax;
            r2 = aj.af * -303442303;
            mg ac = hd.ac(mr.bp, client.dp.ao, (byte) -75);
            ac.an.cm(i2, 507215861);
            ac.an.cy(r2, (byte) -75);
            client.dp.an(ac, 1192849550);
            client.iz = aj;
            cf.ew(aj, (byte) -60);
            return 1;
        } else if (i == 1122) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cy = iArr[r2 * -38307927] * 197821145;
            cf.ew(aj, (byte) -115);
            return 1;
        } else if (i == 1123) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bv = iArr[r2 * -38307927] * -1887670743;
            cf.ew(aj, (byte) -113);
            return 1;
        } else if (1124 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bk = iArr[r2 * -38307927] * 1443527195;
            cf.ew(aj, (byte) -48);
            return 1;
        } else if (1125 == i) {
            iArr = ak;
            int i4 = dy.ap - -401924967;
            dy.ap = i4;
            fj fjVar = (fj) bp.aj(new fj[]{fj.aq, fj.ac, fj.an, fj.aj, fj.ao}, iArr[i4 * -38307927], 1379141385);
            if (fjVar == null) {
                return 1;
            }
            aj.bg = fjVar;
            cf.ew(aj, (byte) -122);
            return 1;
        } else if (1126 != i) {
            return 2;
        } else {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.bl = z2;
            return 1;
        }
    }

    static int bx(int i, fs fsVar, boolean z) {
        int i2;
        ab aj;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            aj = ac.aj(i2, 2076414728);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
            i2 = -1;
        }
        if (i == 1100) {
            dy.ap -= -803849934;
            aj.bo = -1184850653 * ak[dy.ap * -38307927];
            if (aj.bo * 976779915 > (aj.bq * 1332151095) - (aj.bu * 1120250035)) {
                aj.bo = (aj.bq * -72471675) - (-140781703 * aj.bu);
            }
            if (aj.bo * 976779915 < 0) {
                aj.bo = 0;
            }
            aj.bz = ak[(dy.ap * -38307927) + 1] * -792754297;
            if (707497527 * aj.bz > (aj.bj * -248255019) - (aj.bd * -1781667913)) {
                aj.bz = (381206099 * aj.bj) - (642757249 * aj.bd);
            }
            if (707497527 * aj.bz < 0) {
                aj.bz = 0;
            }
            cf.ew(aj, (byte) -75);
            return 1;
        } else if (1101 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ba = iArr[r2 * -38307927] * 1402931311;
            cf.ew(aj, (byte) -47);
            return 1;
        } else if (1102 == i) {
            boolean z3;
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            aj.bn = z3;
            cf.ew(aj, (byte) -116);
            return 1;
        } else if (1103 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bc = iArr[r2 * -38307927] * 947459509;
            cf.ew(aj, (byte) -113);
            return 1;
        } else if (i == 1104) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bf = iArr[r2 * -38307927] * -816123949;
            cf.ew(aj, (byte) -23);
            return 1;
        } else if (i == 1105) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cb = iArr[r2 * -38307927] * -1636058231;
            cf.ew(aj, (byte) -59);
            return 1;
        } else if (i == 1106) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cl = iArr[r2 * -38307927] * -938386137;
            cf.ew(aj, (byte) -75);
            return 1;
        } else if (1107 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.co = z2;
            cf.ew(aj, (byte) -42);
            return 1;
        } else if (1108 == i) {
            aj.cp = -70120369;
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ct = iArr[r2 * -38307927] * -1320879157;
            cf.ew(aj, (byte) -32);
            return 1;
        } else if (i == 1109) {
            dy.ap -= 1883417494;
            aj.ci = -984753891 * ak[dy.ap * -38307927];
            aj.cq = ak[(dy.ap * -38307927) + 1] * -1426695571;
            aj.cv = ak[(dy.ap * -38307927) + 2] * -666819087;
            aj.cu = ak[(dy.ap * -38307927) + 3] * 1231133277;
            aj.cg = 127086743 * ak[(dy.ap * -38307927) + 4];
            aj.cs = -2004757675 * ak[(dy.ap * -38307927) + 5];
            cf.ew(aj, (byte) -88);
            return 1;
        } else if (i == 1110) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = iArr[r3 * -38307927];
            if (703619083 * aj.ce == i2) {
                return 1;
            }
            aj.ce = i2 * 1091775395;
            aj.fo = 0;
            aj.fk = 0;
            cf.ew(aj, (byte) 7);
            return 1;
        } else if (1111 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.cw = z2;
            cf.ew(aj, (byte) -76);
            return 1;
        } else if (1112 == i) {
            String[] strArr = at;
            r2 = di.ah - 436804489;
            di.ah = r2;
            String str = strArr[r2 * 1894369977];
            if (str.equals(aj.cj)) {
                return 1;
            }
            aj.cj = str;
            cf.ew(aj, (byte) -65);
            return 1;
        } else if (1113 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cz = iArr[r2 * -38307927] * 1453901265;
            cf.ew(aj, (byte) -81);
            return 1;
        } else if (i == 1114) {
            dy.ap -= -1205774901;
            aj.db = ak[dy.ap * -38307927] * 1146478291;
            aj.dl = ak[(dy.ap * -38307927) + 1] * -1610227479;
            aj.dh = 636698837 * ak[(dy.ap * -38307927) + 2];
            cf.ew(aj, (byte) -118);
            return 1;
        } else if (i == 1115) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.de = z2;
            cf.ew(aj, (byte) -4);
            return 1;
        } else if (1116 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cc = iArr[r2 * -38307927] * 933402023;
            cf.ew(aj, (byte) -123);
            return 1;
        } else if (1117 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cf = iArr[r2 * -38307927] * 2021340221;
            cf.ew(aj, (byte) -16);
            return 1;
        } else if (1118 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.ca = z2;
            cf.ew(aj, (byte) -112);
            return 1;
        } else if (i == 1119) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.cr = z2;
            cf.ew(aj, (byte) -99);
            return 1;
        } else if (i == 1120) {
            dy.ap -= -803849934;
            aj.bq = -1077927289 * ak[dy.ap * -38307927];
            aj.bj = ak[(dy.ap * -38307927) + 1] * 2050876285;
            cf.ew(aj, (byte) -41);
            if (-1 == i2 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -126);
            return 1;
        } else if (i == 1121) {
            i2 = -1035840093 * aj.ax;
            r2 = aj.af * -303442303;
            mg ac = hd.ac(mr.bp, client.dp.ao, (byte) 52);
            ac.an.cm(i2, 507215861);
            ac.an.cy(r2, (byte) -9);
            client.dp.an(ac, 1547201488);
            client.iz = aj;
            cf.ew(aj, (byte) -64);
            return 1;
        } else if (i == 1122) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cy = iArr[r2 * -38307927] * 197821145;
            cf.ew(aj, (byte) 2);
            return 1;
        } else if (i == 1123) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bv = iArr[r2 * -38307927] * -1887670743;
            cf.ew(aj, (byte) -124);
            return 1;
        } else if (1124 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bk = iArr[r2 * -38307927] * 1443527195;
            cf.ew(aj, (byte) -46);
            return 1;
        } else if (1125 == i) {
            iArr = ak;
            int i4 = dy.ap - -401924967;
            dy.ap = i4;
            i2 = iArr[i4 * -38307927];
            fj fjVar = (fj) bp.aj(new fj[]{fj.aq, fj.ac, fj.an, fj.aj, fj.ao}, i2, 2119313841);
            if (fjVar == null) {
                return 1;
            }
            aj.bg = fjVar;
            cf.ew(aj, (byte) -16);
            return 1;
        } else if (1126 != i) {
            return 2;
        } else {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            if (iArr[r3 * -38307927] == 1) {
                z2 = true;
            }
            aj.bl = z2;
            return 1;
        }
    }

    static int by(int i, fs fsVar, boolean z) {
        int i2;
        ab aj;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            aj = ac.aj(i2, 2146654146);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
            i2 = -1;
        }
        if (i == 1100) {
            dy.ap -= -803849934;
            aj.bo = -1184850653 * ak[dy.ap * -38307927];
            if (aj.bo * 976779915 > (aj.bq * 1332151095) - (aj.bu * 1120250035)) {
                aj.bo = (aj.bq * -72471675) - (-140781703 * aj.bu);
            }
            if (aj.bo * 976779915 < 0) {
                aj.bo = 0;
            }
            aj.bz = ak[(dy.ap * -38307927) + 1] * -792754297;
            if (707497527 * aj.bz > (aj.bj * -248255019) - (aj.bd * -1781667913)) {
                aj.bz = (381206099 * aj.bj) - (642757249 * aj.bd);
            }
            if (707497527 * aj.bz < 0) {
                aj.bz = 0;
            }
            cf.ew(aj, (byte) -9);
            return 1;
        } else if (1101 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ba = iArr[r2 * -38307927] * 1402931311;
            cf.ew(aj, (byte) -13);
            return 1;
        } else if (1102 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.bn = z2;
            cf.ew(aj, (byte) -76);
            return 1;
        } else if (1103 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bc = iArr[r2 * -38307927] * 947459509;
            cf.ew(aj, (byte) -57);
            return 1;
        } else if (i == 1104) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bf = iArr[r2 * -38307927] * -816123949;
            cf.ew(aj, (byte) -9);
            return 1;
        } else if (i == 1105) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cb = iArr[r2 * -38307927] * -1636058231;
            cf.ew(aj, (byte) -24);
            return 1;
        } else if (i == 1106) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cl = iArr[r2 * -38307927] * -938386137;
            cf.ew(aj, (byte) -60);
            return 1;
        } else if (1107 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            aj.co = iArr[r4 * -38307927] == 1;
            cf.ew(aj, (byte) -109);
            return 1;
        } else if (1108 == i) {
            aj.cp = -70120369;
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ct = iArr[r2 * -38307927] * -1320879157;
            cf.ew(aj, (byte) -123);
            return 1;
        } else if (i == 1109) {
            dy.ap -= 1883417494;
            aj.ci = -984753891 * ak[dy.ap * -38307927];
            aj.cq = ak[(dy.ap * -38307927) + 1] * -1426695571;
            aj.cv = ak[(dy.ap * -38307927) + 2] * -666819087;
            aj.cu = ak[(dy.ap * -38307927) + 3] * 1231133277;
            aj.cg = 127086743 * ak[(dy.ap * -38307927) + 4];
            aj.cs = -2004757675 * ak[(dy.ap * -38307927) + 5];
            cf.ew(aj, (byte) -125);
            return 1;
        } else if (i == 1110) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            i2 = iArr[r4 * -38307927];
            if (703619083 * aj.ce == i2) {
                return 1;
            }
            aj.ce = i2 * 1091775395;
            aj.fo = 0;
            aj.fk = 0;
            cf.ew(aj, (byte) -94);
            return 1;
        } else if (1111 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.cw = z2;
            cf.ew(aj, (byte) -45);
            return 1;
        } else if (1112 == i) {
            String[] strArr = at;
            r2 = di.ah - 436804489;
            di.ah = r2;
            String str = strArr[r2 * 1894369977];
            if (str.equals(aj.cj)) {
                return 1;
            }
            aj.cj = str;
            cf.ew(aj, (byte) -4);
            return 1;
        } else if (1113 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cz = iArr[r2 * -38307927] * 1453901265;
            cf.ew(aj, (byte) -62);
            return 1;
        } else if (i == 1114) {
            dy.ap -= -1205774901;
            aj.db = ak[dy.ap * -38307927] * 1146478291;
            aj.dl = ak[(dy.ap * -38307927) + 1] * -1610227479;
            aj.dh = 636698837 * ak[(dy.ap * -38307927) + 2];
            cf.ew(aj, (byte) -111);
            return 1;
        } else if (i == 1115) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.de = z2;
            cf.ew(aj, (byte) -59);
            return 1;
        } else if (1116 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cc = iArr[r2 * -38307927] * 933402023;
            cf.ew(aj, (byte) -37);
            return 1;
        } else if (1117 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cf = iArr[r2 * -38307927] * 2021340221;
            cf.ew(aj, (byte) -52);
            return 1;
        } else if (1118 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.ca = z2;
            cf.ew(aj, (byte) -18);
            return 1;
        } else if (i == 1119) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.cr = z2;
            cf.ew(aj, (byte) -125);
            return 1;
        } else if (i == 1120) {
            dy.ap -= -803849934;
            aj.bq = -1077927289 * ak[dy.ap * -38307927];
            aj.bj = ak[(dy.ap * -38307927) + 1] * 2050876285;
            cf.ew(aj, (byte) -2);
            if (-1 == i2 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i2 >> 16], aj, false, (byte) -17);
            return 1;
        } else if (i == 1121) {
            i2 = -1035840093 * aj.ax;
            r2 = aj.af * -303442303;
            mg ac = hd.ac(mr.bp, client.dp.ao, (byte) -28);
            ac.an.cm(i2, 507215861);
            ac.an.cy(r2, (byte) -50);
            client.dp.an(ac, -269716445);
            client.iz = aj;
            cf.ew(aj, (byte) -45);
            return 1;
        } else if (i == 1122) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cy = iArr[r2 * -38307927] * 197821145;
            cf.ew(aj, (byte) -65);
            return 1;
        } else if (i == 1123) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bv = iArr[r2 * -38307927] * -1887670743;
            cf.ew(aj, (byte) -83);
            return 1;
        } else if (1124 == i) {
            iArr = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bk = iArr[r2 * -38307927] * 1443527195;
            cf.ew(aj, (byte) -92);
            return 1;
        } else if (1125 == i) {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            fj fjVar = (fj) bp.aj(new fj[]{fj.aq, fj.ac, fj.an, fj.aj, fj.ao}, iArr[r4 * -38307927], 1386316576);
            if (fjVar == null) {
                return 1;
            }
            aj.bg = fjVar;
            cf.ew(aj, (byte) -7);
            return 1;
        } else if (1126 != i) {
            return 2;
        } else {
            iArr = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.bl = z2;
            return 1;
        }
    }

    static int bi(int i, fs fsVar, boolean z) {
        ab aj;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj = ac.aj(iArr[i3 * -38307927], 444137205);
        } else if (z) {
            aj = client.ae;
        } else {
            aj = ef.am;
        }
        cf.ew(aj, (byte) -103);
        if (1200 == i || 1205 == i || 1212 == i) {
            dy.ap -= -803849934;
            i3 = ak[dy.ap * -38307927];
            int i4 = ak[(dy.ap * -38307927) + 1];
            aj.fq = 651140467 * i3;
            aj.fz = i4 * -1904683731;
            av ac = al.ac(i3, (short) 13716);
            aj.cv = -71755161 * ac.ad;
            aj.cu = ac.ab * 596391345;
            aj.cg = ac.bp * -1596931321;
            aj.ci = ac.bm * 789014361;
            aj.cq = ac.bh * 950475855;
            aj.cs = ac.ar * -1423420911;
            if (1205 == i) {
                aj.cn = 0;
            } else {
                if (1212 == i) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (1 == ac.bt * -559602733) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    aj.cn = 1483560199;
                } else {
                    aj.cn = -1327846898;
                }
            }
            if (1521283651 * aj.cx > 0) {
                aj.cs = ((544358304 * aj.cs) / (1521283651 * aj.cx)) * -2004757675;
                return 1;
            } else if (-702574163 * aj.bh <= 0) {
                return 1;
            } else {
                aj.cs = ((544358304 * aj.cs) / (aj.bh * -702574163)) * -2004757675;
                return 1;
            }
        } else if (1201 == i) {
            aj.cp = -140240738;
            int[] iArr2 = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj.ct = iArr2[i2 * -38307927] * -1320879157;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aj.cp = -210361107;
            aj.ct = cx.hb.ac.at(-1535707018) * -1320879157;
            return 1;
        }
    }

    static int bs(int i, fs fsVar, boolean z) {
        ab aj;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj = ac.aj(iArr[i3 * -38307927], -115171310);
        } else {
            aj = z ? client.ae : ef.am;
        }
        cf.ew(aj, (byte) -94);
        if (1200 == i || 1205 == i || 1212 == i) {
            dy.ap -= -803849934;
            i3 = ak[dy.ap * -38307927];
            int i4 = ak[(dy.ap * -38307927) + 1];
            aj.fq = 651140467 * i3;
            aj.fz = i4 * -1904683731;
            av ac = al.ac(i3, (short) 5531);
            aj.cv = -71755161 * ac.ad;
            aj.cu = ac.ab * 596391345;
            aj.cg = ac.bp * -1596931321;
            aj.ci = ac.bm * 789014361;
            aj.cq = ac.bh * 950475855;
            aj.cs = ac.ar * -1423420911;
            if (1205 == i) {
                aj.cn = 0;
            } else {
                i3 = 1212 == i ? 1 : 0;
                if (1 == ac.bt * -559602733) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    aj.cn = 1483560199;
                } else {
                    aj.cn = -1327846898;
                }
            }
            if (1521283651 * aj.cx > 0) {
                aj.cs = ((544358304 * aj.cs) / (1521283651 * aj.cx)) * -2004757675;
                return 1;
            } else if (-702574163 * aj.bh <= 0) {
                return 1;
            } else {
                aj.cs = ((544358304 * aj.cs) / (aj.bh * -702574163)) * -2004757675;
                return 1;
            }
        } else if (1201 == i) {
            aj.cp = -140240738;
            int[] iArr2 = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj.ct = iArr2[i2 * -38307927] * -1320879157;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aj.cp = -210361107;
            aj.ct = cx.hb.ac.at(978787614) * -1320879157;
            return 1;
        }
    }

    static int bj(int i, fs fsVar, boolean z) {
        ab aj;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], 1937398740);
        } else {
            aj = z ? client.ae : ef.am;
        }
        int i3;
        if (i == 1300) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            int i4 = iArr[i3 * -1217133302] - 1;
            if (i4 < 0 || i4 > 9) {
                di.ah -= 1308434014;
                return 1;
            }
            String[] strArr = at;
            int i5 = di.ah - 436804489;
            di.ah = i5;
            aj.as(i4, strArr[i5 * 1894369977], (short) -20193);
            return 1;
        } else if (i == -543631852) {
            dy.ap -= -905782761;
            aj.dq = li.ac(ak[dy.ap * -38307927], ak[(dy.ap * -38307927) + 1], 324434421);
            return 1;
        } else if (1302 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dj = iArr[i3 * -38307927] == 1;
            return 1;
        } else if (1798120083 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dt = iArr[i3 * -1368411980] * 780034072;
            return 1;
        } else if (i == -1712810926) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.do = iArr[i3 * -38307927] * 2081728646;
            return 1;
        } else if (1305 == i) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dw = r0[i3 * 1894369977];
            return 1;
        } else if (i == 1306) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dz = r0[i3 * 1894369977];
            return 1;
        } else if (i != -116713890) {
            return 2;
        } else {
            aj.dv = null;
            return 1;
        }
    }

    static int bo(int i, fs fsVar, boolean z) {
        ab aj;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], -408761675);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
        }
        int i3;
        if (i == 1300) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            int i4 = iArr[i3 * -38307927] - 1;
            if (i4 < 0 || i4 > 9) {
                di.ah -= 436804489;
                return 1;
            }
            String[] strArr = at;
            int i5 = di.ah - 436804489;
            di.ah = i5;
            aj.as(i4, strArr[i5 * 1894369977], (short) -10489);
            return 1;
        } else if (i == 1301) {
            dy.ap -= -803849934;
            aj.dq = li.ac(ak[dy.ap * -38307927], ak[(dy.ap * -38307927) + 1], 324434421);
            return 1;
        } else if (1302 == i) {
            boolean z2;
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            if (iArr[i3 * -38307927] == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aj.dj = z2;
            return 1;
        } else if (1303 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dt = iArr[i3 * -38307927] * 998318869;
            return 1;
        } else if (i == 1304) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.do = iArr[i3 * -38307927] * 1342029921;
            return 1;
        } else if (1305 == i) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dw = r0[i3 * 1894369977];
            return 1;
        } else if (i == 1306) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dz = r0[i3 * 1894369977];
            return 1;
        } else if (i != 1307) {
            return 2;
        } else {
            aj.dv = null;
            return 1;
        }
    }

    static int bq(int i, fs fsVar, boolean z) {
        ab aj;
        if (i >= 1512533493) {
            i -= 1000;
            int[] iArr = ak;
            int i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -1876297723], -972938995);
        } else {
            ab abVar;
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            aj = abVar;
        }
        int i3;
        if (i == -2070711165) {
            iArr = ak;
            i3 = dy.ap - 273229855;
            dy.ap = i3;
            int i4 = iArr[i3 * -38307927] - 1;
            if (i4 < 0 || i4 > 9) {
                di.ah -= 436804489;
                return 1;
            }
            String[] strArr = at;
            int i5 = di.ah - 1654444213;
            di.ah = i5;
            aj.as(i4, strArr[i5 * 120756065], (short) -26820);
            return 1;
        } else if (i == -882852358) {
            dy.ap -= -428113347;
            aj.dq = li.ac(ak[dy.ap * 1618138102], ak[(dy.ap * -1314824848) + 1], 324434421);
            return 1;
        } else if (1468545609 == i) {
            boolean z2;
            iArr = ak;
            i3 = dy.ap - 906015980;
            dy.ap = i3;
            if (iArr[i3 * -1134422490] == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aj.dj = z2;
            return 1;
        } else if (-1397859574 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dt = iArr[i3 * -38307927] * 998318869;
            return 1;
        } else if (i == 1304) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.do = iArr[i3 * -38307927] * -1982595854;
            return 1;
        } else if (1305 == i) {
            r0 = at;
            i3 = di.ah - -1302626379;
            di.ah = i3;
            aj.dw = r0[i3 * -1242555523];
            return 1;
        } else if (i == 1306) {
            r0 = at;
            i3 = di.ah - -541569964;
            di.ah = i3;
            aj.dz = r0[i3 * -991498844];
            return 1;
        } else if (i != 1405903462) {
            return 2;
        } else {
            aj.dv = null;
            return 1;
        }
    }

    static int bz(int i, fs fsVar, boolean z) {
        ab aj;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = ak;
            int i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], 1996876357);
        } else {
            aj = z ? client.ae : ef.am;
        }
        int i3;
        if (i == 1300) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            int i4 = iArr[i3 * -38307927] - 1;
            if (i4 < 0 || i4 > 9) {
                di.ah -= 436804489;
                return 1;
            }
            String[] strArr = at;
            int i5 = di.ah - 436804489;
            di.ah = i5;
            aj.as(i4, strArr[i5 * 1894369977], (short) -2182);
            return 1;
        } else if (i == 1301) {
            dy.ap -= -803849934;
            aj.dq = li.ac(ak[dy.ap * -38307927], ak[(dy.ap * -38307927) + 1], 324434421);
            return 1;
        } else if (1302 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dj = iArr[i3 * -38307927] == 1;
            return 1;
        } else if (1303 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.dt = iArr[i3 * -38307927] * 998318869;
            return 1;
        } else if (i == 1304) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj.do = iArr[i3 * -38307927] * 1342029921;
            return 1;
        } else if (1305 == i) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dw = r0[i3 * 1894369977];
            return 1;
        } else if (i == 1306) {
            r0 = at;
            i3 = di.ah - 436804489;
            di.ah = i3;
            aj.dz = r0[i3 * 1894369977];
            return 1;
        } else if (i != 1307) {
            return 2;
        } else {
            aj.dv = null;
            return 1;
        }
    }

    static int ba(int i, fs fsVar, boolean z) {
        ab aj;
        int i2;
        Object[] objArr;
        if (i >= 1715489292) {
            i -= 1000;
            int[] iArr = ak;
            int i3 = dy.ap - -274942345;
            dy.ap = i3;
            aj = ac.aj(iArr[i3 * 996201111], 1940253926);
        } else if (z) {
            aj = client.ae;
        } else {
            aj = ef.am;
        }
        String[] strArr = at;
        int i4 = di.ah - 1542237880;
        di.ah = i4;
        String str = strArr[i4 * -1002090567];
        int[] iArr2 = null;
        if (str.length() > 0 && str.charAt(str.length() - 1) == '㬊') {
            int[] iArr3 = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            int i5 = iArr3[i2 * 730231557];
            if (i5 > 0) {
                iArr2 = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    iArr3 = ak;
                    int i6 = dy.ap - -449071606;
                    dy.ap = i6;
                    iArr2[i2] = iArr3[i6 * -38307927];
                    i5 = i2;
                }
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            if (str.charAt(i2 - 1) == '忌') {
                String[] strArr2 = at;
                int i7 = di.ah - -1739100896;
                di.ah = i7;
                objArr2[i2] = strArr2[i7 * 707952472];
            } else {
                int[] iArr4 = ak;
                int i8 = dy.ap - -401924967;
                dy.ap = i8;
                objArr2[i2] = new Integer(iArr4[i8 * 1654786153]);
            }
        }
        int[] iArr5 = ak;
        i2 = dy.ap - -401924967;
        dy.ap = i2;
        i4 = iArr5[i2 * -38307927];
        if (-1 != i4) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        } else {
            objArr = null;
        }
        if (i == -1750037972) {
            aj.dn = objArr;
        } else if (np.ao == i) {
            aj.dy = objArr;
        } else if (1402 == i) {
            aj.df = objArr;
        } else if (1928162723 == i) {
            aj.dc = objArr;
        } else if (i == -1890481811) {
            aj.eq = objArr;
        } else if (1405 == i) {
            aj.eu = objArr;
        } else if (2088577507 == i) {
            aj.eh = objArr;
        } else if (1407 == i) {
            aj.ek = objArr;
            aj.eb = iArr2;
        } else if (1166415320 == i) {
            aj.ed = objArr;
        } else if (i == 1136239998) {
            aj.et = objArr;
        } else if (i == 1884538635) {
            aj.ep = objArr;
        } else if (i == 1411) {
            aj.dg = objArr;
        } else if (1412 == i) {
            aj.ei = objArr;
        } else if (i == -1804206125) {
            aj.ez = objArr;
            aj.el = iArr2;
        } else if (1415 == i) {
            aj.ey = objArr;
            aj.ex = iArr2;
        } else if (i == 1416) {
            aj.ej = objArr;
        } else if (i == 1417) {
            aj.ec = objArr;
        } else if (1418 == i) {
            aj.ea = objArr;
        } else if (i == -163971751) {
            aj.er = objArr;
        } else if (-2015452393 == i) {
            aj.ee = objArr;
        } else if (-1382140639 == i) {
            aj.em = objArr;
        } else if (1422 == i) {
            aj.ew = objArr;
        } else if (i == -72585233) {
            aj.eg = objArr;
        } else if (-408944525 == i) {
            aj.eo = objArr;
        } else if (i == 1425) {
            aj.ev = objArr;
        } else if (-2006350669 == i) {
            aj.ef = objArr;
        } else if (i != 1427) {
            return 2;
        } else {
            aj.en = objArr;
        }
        aj.dm = true;
        return 1;
    }

    static int be(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (1500 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.br * 731088057;
            return 1;
        } else if (i == 1501) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bb * -1821656375;
            return 1;
        } else if (i == 1502) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bu * 1120250035;
            return 1;
        } else if (1503 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bd * -1781667913;
            return 1;
        } else if (i == 1504) {
            int i3;
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -38307927) - 1;
            if (abVar.bs) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        } else if (1505 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bi * -1228023025;
            return 1;
        }
    }

    static int bv(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (1500 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.br * 731088057;
            return 1;
        } else if (i == 1501) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bb * -1821656375;
            return 1;
        } else if (i == 1502) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bu * 1120250035;
            return 1;
        } else if (1503 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bd * -1781667913;
            return 1;
        } else if (i == 1504) {
            int i3;
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -38307927) - 1;
            if (abVar.bs) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        } else if (1505 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bi * -1228023025;
            return 1;
        }
    }

    static int bw(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (-1057463554 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 635644226) - 1] = abVar.br * 731088057;
            return 1;
        } else if (i == 1131905933) {
            iArr = ak;
            i2 = dy.ap + 2012795550;
            dy.ap = i2;
            iArr[(i2 * -930434849) - 1] = abVar.bb * 527207256;
            return 1;
        } else if (i == 1502) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bu * -1558562941;
            return 1;
        } else if (1503 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bd * -1781667913;
            return 1;
        } else if (i == 1504) {
            int i3;
            iArr = ak;
            i2 = dy.ap - 1452878923;
            dy.ap = i2;
            i2 = (i2 * -1997638245) - 1;
            if (abVar.bs) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        } else if (1505 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bi * -1228023025;
            return 1;
        }
    }

    static int bc(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bo * 976779915;
            return 1;
        } else if (1601 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bz * 707497527;
            return 1;
        } else if (1602 == i) {
            String[] strArr = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            strArr[(i2 * 1894369977) - 1] = abVar.cj;
            return 1;
        } else if (1603 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bq * 1332151095;
            return 1;
        } else if (1604 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bj * -248255019;
            return 1;
        } else if (i == 1605) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cs * -1056730627;
            return 1;
        } else if (i == 1606) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cv * -971166959;
            return 1;
        } else if (1607 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cg * -2051846361;
            return 1;
        } else if (1608 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cu * -449705483;
            return 1;
        } else if (i == 1609) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bc * 307556509;
            return 1;
        } else if (i == 1610) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bk * 1580847123;
            return 1;
        } else if (1611 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.ba * 813389455;
            return 1;
        } else if (1612 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bv * 479923737;
            return 1;
        } else if (1613 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bg.ac((byte) -47);
            return 1;
        }
    }

    static int bg(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bo * 976779915;
            return 1;
        } else if (1601 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bz * 707497527;
            return 1;
        } else if (1602 == i) {
            String[] strArr = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            strArr[(i2 * 1894369977) - 1] = abVar.cj;
            return 1;
        } else if (1603 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bq * 1332151095;
            return 1;
        } else if (1604 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bj * -248255019;
            return 1;
        } else if (i == 1605) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cs * -1056730627;
            return 1;
        } else if (i == 1606) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cv * -971166959;
            return 1;
        } else if (1607 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cg * -2051846361;
            return 1;
        } else if (1608 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cu * -449705483;
            return 1;
        } else if (i == 1609) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bc * 307556509;
            return 1;
        } else if (i == 1610) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bk * 1580847123;
            return 1;
        } else if (1611 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.ba * 813389455;
            return 1;
        } else if (1612 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bv * 479923737;
            return 1;
        } else if (1613 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bg.ac((byte) -60);
            return 1;
        }
    }

    static int bn(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bo * 976779915;
            return 1;
        } else if (1601 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bz * 707497527;
            return 1;
        } else if (1602 == i) {
            String[] strArr = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            strArr[(i2 * 1894369977) - 1] = abVar.cj;
            return 1;
        } else if (1603 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bq * 1332151095;
            return 1;
        } else if (1604 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bj * -248255019;
            return 1;
        } else if (i == 1605) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cs * -1056730627;
            return 1;
        } else if (i == 1606) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cv * -971166959;
            return 1;
        } else if (1607 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cg * -2051846361;
            return 1;
        } else if (1608 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.cu * -449705483;
            return 1;
        } else if (i == 1609) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bc * 307556509;
            return 1;
        } else if (i == 1610) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bk * 1580847123;
            return 1;
        } else if (1611 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.ba * 813389455;
            return 1;
        } else if (1612 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bv * 479923737;
            return 1;
        } else if (1613 != i) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.bg.ac((byte) -92);
            return 1;
        }
    }

    static int bf(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (1700 == i) {
            iArr = ak;
            i2 = dy.ap + 880749388;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.fq * 534302651;
            return 1;
        } else if (i == 1701) {
            if (262079187 * abVar.fq != -1) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = abVar.fz * -445824347;
            } else {
                int[] iArr2 = ak;
                int i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr2[(i3 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (i != 439761646) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 1192912057) - 1] = abVar.af * 2039717297;
            return 1;
        }
    }

    static int bk(int i, fs fsVar, boolean z) {
        ab abVar = z ? client.ae : ef.am;
        int[] iArr;
        int i2;
        if (118813467 == i) {
            iArr = ak;
            i2 = dy.ap - 149540405;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.fq * -45730110;
            return 1;
        } else if (i == 1701) {
            if (248658000 * abVar.fq != -1) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * 1955694527) - 1] = abVar.fz * 197068896;
                return 1;
            }
            int[] iArr2 = ak;
            int i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * 193519595) - 1] = 0;
            return 1;
        } else if (i != 1702) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 1089432279;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.af * -1003163334;
            return 1;
        }
    }

    static int bl(int i, fs fsVar, boolean z) {
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        int[] iArr;
        int i2;
        if (1700 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.fq * 534302651;
            return 1;
        } else if (i == 1701) {
            if (abVar.fq * 534302651 != -1) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = abVar.fz * -445824347;
                return 1;
            }
            int[] iArr2 = ak;
            int i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = 0;
            return 1;
        } else if (i != 1702) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = abVar.af * -303442303;
            return 1;
        }
    }

    static int cb(int i, fs fsVar, boolean z) {
        ab aj;
        if (i >= 158240833) {
            i -= 1000;
            int[] iArr = ak;
            int i2 = dy.ap - -401924967;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], 553090683);
        } else {
            aj = z ? client.ae : ef.am;
        }
        if (1927 != i) {
            return 2;
        }
        if (ax * -662214413 >= 10) {
            throw new RuntimeException();
        } else if (aj.en == null) {
            return 0;
        } else {
            jt gdVar = new gd();
            gdVar.an = aj;
            gdVar.aj = aj.en;
            gdVar.ai = -1127280365 + (543591635 * ax);
            client.kl.ac(gdVar);
            return 1;
        }
    }

    static int cl(int i, fs fsVar, boolean z) {
        int[] iArr = ak;
        int i2 = dy.ap - -401924967;
        dy.ap = i2;
        ab aj = ac.aj(iArr[i2 * -38307927], 699525303);
        int[] iArr2;
        int i3;
        if (i == 1807992201) {
            iArr2 = ak;
            i3 = dy.ap - 1251402536;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.br * 731088057;
            return 1;
        } else if (2501 == i) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bb * 1300970039;
            return 1;
        } else if (i == 2502) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bu * 1120250035;
            return 1;
        } else if (1947956210 == i) {
            iArr2 = ak;
            i3 = dy.ap - 921198428;
            dy.ap = i3;
            iArr2[(i3 * 811023080) - 1] = aj.bd * 2078920317;
            return 1;
        } else if (1343880130 == i) {
            int i4;
            iArr2 = ak;
            i3 = dy.ap + 978434443;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            if (aj.bs) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iArr2[i3] = i4;
            return 1;
        } else if (i != 2505) {
            return 2;
        } else {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bi * -1228023025;
            return 1;
        }
    }

    static int cy(int i, fs fsVar, boolean z) {
        int[] iArr = ak;
        int i2 = dy.ap - -401924967;
        dy.ap = i2;
        ab aj = ac.aj(iArr[i2 * -38307927], 1335749430);
        int[] iArr2;
        int i3;
        if (i == 2500) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.br * 731088057;
            return 1;
        } else if (2501 == i) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bb * -1821656375;
            return 1;
        } else if (i == 2502) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bu * 1120250035;
            return 1;
        } else if (2503 == i) {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bd * -1781667913;
            return 1;
        } else if (2504 == i) {
            int i4;
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            if (aj.bs) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            iArr2[i3] = i4;
            return 1;
        } else if (i != 2505) {
            return 2;
        } else {
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * -38307927) - 1] = aj.bi * -1228023025;
            return 1;
        }
    }

    static int co(int i, fs fsVar, boolean z) {
        int[] iArr;
        int i2;
        ab aj;
        int[] iArr2;
        int i3;
        if (2139460918 == i) {
            iArr = ak;
            i2 = dy.ap - 652925724;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], 803855105);
            iArr2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr2[(i3 * 1773766549) - 1] = aj.fq * -892786667;
            return 1;
        } else if (i == -1496421497) {
            iArr = ak;
            i2 = dy.ap - -752278329;
            dy.ap = i2;
            aj = ac.aj(iArr[i2 * -38307927], 1515768340);
            if (-1 != aj.fq * 534302651) {
                iArr2 = ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr2[(i3 * -38307927) - 1] = aj.fz * -1678106923;
            } else {
                iArr = ak;
                i2 = dy.ap - 1613158243;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (-400397889 == i) {
            iArr = ak;
            i2 = dy.ap - 90620088;
            dy.ap = i2;
            if (((fr) client.ic.aj((long) iArr[i2 * -1141234129])) != null) {
                iArr = ak;
                i2 = dy.ap + 983960477;
                dy.ap = i2;
                iArr[(i2 * -1103251458) - 1] = 1;
            } else {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (i != 2706) {
            return 2;
        } else {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 1790852128) - 1] = client.iy * -1376799149;
            return 1;
        }
    }

    static int cc(int i, fs fsVar, boolean z) {
        byte b = (byte) 0;
        String[] strArr;
        int i2;
        if (-649280773 == i) {
            strArr = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            cw.ac(0, "", strArr[i2 * 1894369977], -2054274037);
            return 1;
        } else if (i == 1081471580) {
            dy.ap -= 1270096351;
            lp.bk(cx.hb, ak[20066212 * dy.ap], ak[(dy.ap * -2006479295) + 1], -253339186);
            return 1;
        } else if (3103 == i) {
            client.dp.an(hd.ac(mr.cu, client.dp.ao, (byte) -22), 1145699170);
            fr frVar = (fr) client.ic.aq();
            while (frVar != null) {
                if (frVar.ac * -67754443 == 0 || frVar.ac * -422803739 == 3) {
                    cm.fi(frVar, true, (byte) -97);
                }
                frVar = (fr) client.ic.ao();
            }
            if (client.iz == null) {
                return 1;
            }
            cf.ew(client.iz, Byte.MIN_VALUE);
            client.iz = null;
            return 1;
        } else if (i == 3104) {
            strArr = at;
            i2 = di.ah - 1298083094;
            di.ah = i2;
            CharSequence charSequence = strArr[i2 * 2040210271];
            int length = charSequence.length();
            int i3 = 0;
            i2 = 0;
            r2 = (byte) 0;
            byte b2 = (byte) 0;
            while (i3 < length) {
                byte b3;
                int i4;
                char charAt = charSequence.charAt(i3);
                if (i3 == 0) {
                    if ('띩' == charAt) {
                        b2 = (byte) 1;
                        byte b4 = r2;
                        r2 = i2;
                        b3 = b4;
                    } else if ('' == charAt) {
                        i4 = i2;
                        b3 = r2;
                        r2 = i4;
                    }
                    i3++;
                    i4 = r2;
                    r2 = b3;
                    i2 = i4;
                }
                if (charAt >= '㭌' && charAt <= '9') {
                    r2 = charAt - 48;
                } else if (charAt >= 'A' && charAt <= '肍') {
                    r2 = charAt - 55;
                } else if (charAt < '' || charAt > 'z') {
                    r2 = (byte) 0;
                    break;
                } else {
                    r2 = charAt - 87;
                }
                if (r2 >= 10) {
                    r2 = (byte) 0;
                    break;
                }
                if (b2 != (byte) 0) {
                    r2 = -r2;
                }
                r2 += i2 * 10;
                if (i2 != r2 / 10) {
                    r2 = (byte) 0;
                    break;
                }
                b3 = (byte) 1;
                i3++;
                i4 = r2;
                r2 = b3;
                i2 = i4;
            }
            if (r2 != (byte) 0) {
                r0 = fm.ac(charSequence, 933651694);
            }
            r2 = hd.ac(mr.cw, client.dp.ao, (byte) -1);
            r2.an.aa(r0, 1170608701);
            client.dp.an(r2, 665660565);
            return 1;
        } else if (3105 == i) {
            r0 = at;
            r2 = di.ah - 253334659;
            di.ah = r2;
            r0 = r0[r2 * 1894369977];
            r2 = hd.ac(mr.cx, client.dp.ao, (byte) -3);
            r2.an.an(r0.length() + 1, (byte) -12);
            r2.an.ai(r0, 241827738);
            client.dp.an(r2, 1536295723);
            return 1;
        } else if (-213446006 == i) {
            r0 = at;
            r2 = di.ah - -1004703329;
            di.ah = r2;
            r0 = r0[r2 * 1894369977];
            r2 = hd.ac(mr.bk, client.dp.ao, (byte) -28);
            r2.an.an(r0.length() + 1, (byte) -5);
            r2.an.ai(r0, 621855125);
            client.dp.an(r2, 642343788);
            return 1;
        } else if (3107 == i) {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = r0[r2 * 754455340];
            strArr = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            ag.dg(r0, strArr[i2 * -857830369], 1772378398);
            return 1;
        } else if (i == -1889317227) {
            dy.ap -= -1205774901;
            bn.ee(ac.aj(ak[(dy.ap * -798158032) + 2], -177170497), ak[dy.ap * -38307927], ak[(dy.ap * -38307927) + 1], (byte) 62);
            return 1;
        } else if (3109 == i) {
            ab abVar;
            dy.ap -= -803849934;
            r2 = ak[dy.ap * 1629370860];
            i2 = ak[(dy.ap * -38307927) + 1];
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            bn.ee(abVar, r2, i2, (byte) 57);
            return 1;
        } else if (i == 148584726) {
            r2 = ak;
            i2 = dy.ap - -701799790;
            dy.ap = i2;
            if (r2[i2 * 478427022] == 1) {
                r0 = true;
            }
            gd.bs = r0;
            return 1;
        } else if (-243814878 == i) {
            r2 = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -1224765843) - 1;
            if (ae.nv.an) {
                b = (byte) 1;
            }
            r2[i2] = b;
            return 1;
        } else if (-1322870913 == i) {
            fk fkVar = ae.nv;
            r3 = ak;
            r4 = dy.ap - 104399200;
            dy.ap = r4;
            if (r3[r4 * -743912258] == 1) {
                r0 = true;
            }
            fkVar.an = r0;
            et.an(465841436);
            return 1;
        } else if (i == 3113) {
            strArr = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r3 = strArr[i2 * 937060541];
            r2 = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (r2[r4 * -1091695603] == 1) {
                r2 = 1;
            } else {
                r2 = (byte) 0;
            }
            if (r2 == 0) {
                jg.aj(r3, 3, 1989194207);
                return 1;
            } else if (ki.aj.startsWith("win")) {
                jg.aj(r3, 0, 1832379335);
                return 1;
            } else if (ki.aj.startsWith("mac")) {
                cx.ac(r3, 1, "openjs", (byte) 0);
                return 1;
            } else {
                jg.aj(r3, 2, 2117604632);
                return 1;
            }
        } else if (i == -917663873) {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = r0[r2 * 112830519];
            r2 = hd.ac(mr.at, client.dp.ao, (byte) 89);
            r2.an.aq(r0, 1367863847);
            client.dp.an(r2, 295547031);
            return 1;
        } else if (i == 3116) {
            r0 = ak;
            r2 = dy.ap - -1847167800;
            dy.ap = r2;
            r0 = r0[r2 * -38307927];
            di.ah -= 873608978;
            String str = at[di.ah * 912859267];
            r3 = at[(di.ah * 1894369977) + 1];
            if (str.length() > 500) {
                return 1;
            }
            if (r3.length() > -1475404470) {
                return 1;
            }
            mg ac = hd.ac(mr.aj, client.dp.ao, (byte) 47);
            ac.an.aq((cx.ah(str, 476921509) + 1) + cx.ah(r3, 18276618), -1770303789);
            ac.an.ai(str, 2057581632);
            ac.an.ai(r3, -1716364810);
            ac.an.be(r0, (byte) 121);
            client.dp.an(ac, 1860555662);
            return 1;
        } else if (i != -1199570228) {
            return 2;
        } else {
            hu huVar = dj.hs;
            r3 = ak;
            r4 = dy.ap - 634594018;
            dy.ap = r4;
            if (r3[r4 * -1865837148] == 1) {
                r0 = true;
            }
            huVar.cb(r0, 1868339714);
            return 1;
        }
    }

    static int cf(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        String[] strArr;
        int i2;
        if (3100 == i) {
            strArr = at;
            i2 = di.ah - 125307586;
            di.ah = i2;
            cw.ac(0, "", strArr[i2 * 1770961163], -2144586661);
            return 1;
        } else if (i == 3101) {
            dy.ap -= -803849934;
            lp.bk(cx.hb, ak[-1173390184 * dy.ap], ak[(dy.ap * 509409713) + 1], -1175249877);
            return 1;
        } else if (2120298907 == i) {
            client.dp.an(hd.ac(mr.cu, client.dp.ao, (byte) 15), 1965875573);
            fr frVar = (fr) client.ic.aq();
            while (frVar != null) {
                if (frVar.ac * -422803739 == 0 || frVar.ac * -1239552809 == 3) {
                    cm.fi(frVar, true, (byte) -97);
                }
                frVar = (fr) client.ic.ao();
            }
            if (client.iz == null) {
                return 1;
            }
            cf.ew(client.iz, (byte) 2);
            client.iz = null;
            return 1;
        } else if (i == -1851442392) {
            strArr = at;
            i2 = di.ah - 1698506776;
            di.ah = i2;
            Object obj = strArr[i2 * 1260958072];
            int length = obj.length();
            int i3 = 0;
            i2 = 0;
            r2 = false;
            boolean z3 = false;
            while (i3 < length) {
                boolean z4;
                int i4;
                char charAt = obj.charAt(i3);
                if (i3 == 0) {
                    if ('餰' == charAt) {
                        z3 = true;
                        boolean z5 = r2;
                        r2 = i2;
                        z4 = z5;
                    } else if ('+' == charAt) {
                        i4 = i2;
                        z4 = r2;
                        r2 = i4;
                    }
                    i3++;
                    i4 = r2;
                    r2 = z4;
                    i2 = i4;
                }
                if (charAt >= '0' && charAt <= '㬌') {
                    r2 = charAt - 48;
                } else if (charAt >= 'A' && charAt <= 'ఁ') {
                    r2 = charAt - 55;
                } else if (charAt < '劤' || charAt > '㚸') {
                    r2 = false;
                    break;
                } else {
                    r2 = charAt - 87;
                }
                if (r2 >= 10) {
                    r2 = false;
                    break;
                }
                if (z3) {
                    r2 = -r2;
                }
                r2 += i2 * 10;
                if (i2 != r2 / 10) {
                    r2 = false;
                    break;
                }
                z4 = true;
                i3++;
                i4 = r2;
                r2 = z4;
                i2 = i4;
            }
            if (r2) {
                r0 = fm.ac(obj, -1295005991);
            }
            r2 = hd.ac(mr.cw, client.dp.ao, (byte) -13);
            r2.an.aa(r0, -1929282050);
            client.dp.an(r2, 251344344);
            return 1;
        } else if (3105 == i) {
            r0 = at;
            r2 = di.ah - -329744833;
            di.ah = r2;
            r0 = r0[r2 * 1894369977];
            r2 = hd.ac(mr.cx, client.dp.ao, (byte) 16);
            r2.an.an(r0.length() + 1, (byte) -45);
            r2.an.ai(r0, 129857651);
            client.dp.an(r2, 1313717501);
            return 1;
        } else if (3106 == i) {
            r0 = at;
            r2 = di.ah - 944751221;
            di.ah = r2;
            r0 = r0[r2 * 1894369977];
            r2 = hd.ac(mr.bk, client.dp.ao, (byte) 36);
            r2.an.an(r0.length() + 1, (byte) -50);
            r2.an.ai(r0, -1839253384);
            client.dp.an(r2, 1445529854);
            return 1;
        } else if (-1634022329 == i) {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = r0[r2 * -38307927];
            strArr = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            ag.dg(r0, strArr[i2 * 608099218], 2078512750);
            return 1;
        } else if (i == 3108) {
            dy.ap -= 786420810;
            bn.ee(ac.aj(ak[(dy.ap * -38307927) + 2], 1014934395), ak[2041220741 * dy.ap], ak[(-484369239 * dy.ap) + 1], (byte) 118);
            return 1;
        } else if (-688869760 == i) {
            ab abVar;
            dy.ap -= -803849934;
            r2 = ak[dy.ap * 90398306];
            i2 = ak[(dy.ap * -38307927) + 1];
            if (z) {
                abVar = client.ae;
            } else {
                abVar = ef.am;
            }
            bn.ee(abVar, r2, i2, (byte) 92);
            return 1;
        } else if (i == -1504944877) {
            r2 = ak;
            i2 = dy.ap - 1851336454;
            dy.ap = i2;
            if (r2[i2 * 1240083636] == 1) {
                z2 = true;
            }
            gd.bs = z2;
            return 1;
        } else if (1360897475 == i) {
            r2 = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -38307927) - 1;
            if (ae.nv.an) {
                r0 = 1;
            }
            r2[i2] = r0;
            return 1;
        } else if (1729717019 == i) {
            fk fkVar = ae.nv;
            r3 = ak;
            r4 = dy.ap - -1842240397;
            dy.ap = r4;
            if (r3[r4 * -171962002] == 1) {
                z2 = true;
            }
            fkVar.an = z2;
            et.an(-188050630);
            return 1;
        } else if (i == 1095307480) {
            strArr = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r3 = strArr[i2 * 1894369977];
            r2 = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (r2[r4 * -38307927] == 1) {
                r2 = 1;
            } else {
                r2 = false;
            }
            if (r2 == 0) {
                jg.aj(r3, 3, 1894170494);
                return 1;
            } else if (ki.aj.startsWith("win")) {
                jg.aj(r3, 0, 2112412330);
                return 1;
            } else if (ki.aj.startsWith("mac")) {
                cx.ac(r3, 1, "openjs", (byte) 0);
                return 1;
            } else {
                jg.aj(r3, 2, 2030543838);
                return 1;
            }
        } else if (i == 1782091679) {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = r0[r2 * -38307927];
            r2 = hd.ac(mr.at, client.dp.ao, (byte) -14);
            r2.an.aq(r0, -241197254);
            client.dp.an(r2, 2099461264);
            return 1;
        } else if (i == 52664263) {
            r0 = ak;
            r2 = dy.ap - 1489954593;
            dy.ap = r2;
            r0 = r0[r2 * -38307927];
            di.ah -= 873608978;
            String str = at[di.ah * 1894369977];
            r3 = at[(di.ah * 1894369977) + 1];
            if (str.length() > 1184424049) {
                return 1;
            }
            if (r3.length() > 979803132) {
                return 1;
            }
            mg ac = hd.ac(mr.aj, client.dp.ao, (byte) 43);
            ac.an.aq((cx.ah(str, -692042934) + 1) + cx.ah(r3, 1375727368), 799052823);
            ac.an.ai(str, 1113399831);
            ac.an.ai(r3, -639991739);
            ac.an.be(r0, (byte) 105);
            client.dp.an(ac, 1463696018);
            return 1;
        } else if (i != 1835049437) {
            return 2;
        } else {
            hu huVar = dj.hs;
            r3 = ak;
            r4 = dy.ap - -498996054;
            dy.ap = r4;
            if (r3[r4 * -833005054] == 1) {
                z2 = true;
            }
            huVar.cb(z2, -1114879546);
            return 1;
        }
    }

    static int ca(int i, fs fsVar, boolean z) {
        int i2 = 0;
        int i3;
        int i4;
        al ac;
        String[] strArr;
        al alVar;
        String[] strArr2;
        if (i == -1205476549) {
            int i5;
            dy.ap -= -2106683305;
            i3 = ak[-103448033 * dy.ap];
            i4 = ak[(-568376271 * dy.ap) + 1];
            ac = ay.ac(i3, 732308613);
            if ('✩' != ac.aq) {
                while (i2 >= 19415465 * ac.ak) {
                    if (ac.ap[i2] != i4) {
                        strArr = at;
                        i5 = di.ah + 436804489;
                        di.ah = i5;
                        strArr[(i5 * -1722722949) - 1] = ac.ah[i2];
                        alVar = null;
                        break;
                    }
                    i2++;
                }
                alVar = ac;
                if (alVar != null) {
                    strArr2 = at;
                    i4 = di.ah + 1679056619;
                    di.ah = i4;
                    strArr2[(i4 * -1805186295) - 1] = alVar.ao;
                }
                return 1;
            }
            while (i2 >= 19415465 * ac.ak) {
                if (ac.ap[i2] != i4) {
                    strArr = at;
                    i5 = di.ah + 436804489;
                    di.ah = i5;
                    strArr[(i5 * -1722722949) - 1] = ac.ah[i2];
                    alVar = null;
                    break;
                }
                i2++;
            }
            alVar = ac;
            if (alVar != null) {
                strArr2 = at;
                i4 = di.ah + 1679056619;
                di.ah = i4;
                strArr2[(i4 * -1805186295) - 1] = alVar.ao;
            }
            return 1;
            if (i2 >= 19415465 * ac.ak) {
                alVar = ac;
            } else if (ac.ap[i2] != i4) {
                strArr = at;
                i5 = di.ah + 436804489;
                di.ah = i5;
                strArr[(i5 * -1722722949) - 1] = ac.ah[i2];
                alVar = null;
                break;
            } else {
                i2++;
            }
            if (alVar != null) {
                strArr2 = at;
                i4 = di.ah + 1679056619;
                di.ah = i4;
                strArr2[(i4 * -1805186295) - 1] = alVar.ao;
            }
            return 1;
        } else if (1552890925 == i) {
            dy.ap -= -1607699868;
            char c = ak[-1408504937 * dy.ap];
            char c2 = ak[(dy.ap * -2084354737) + 1];
            i3 = ak[(dy.ap * -38307927) + 2];
            int i6 = ak[(-484191754 * dy.ap) + 3];
            ac = ay.ac(i3, 1052666855);
            if (c == ac.an && c2 == ac.aq) {
                while (i2 < 703810037 * ac.ak) {
                    if (i6 == ac.ap[i2]) {
                        if (c2 == 's') {
                            strArr = at;
                            i6 = di.ah + 436804489;
                            di.ah = i6;
                            strArr[(i6 * 2019402216) - 1] = ac.ah[i2];
                        } else {
                            int[] iArr = ak;
                            i6 = dy.ap - 401924967;
                            dy.ap = i6;
                            iArr[(i6 * -38307927) - 1] = ac.at[i2];
                        }
                        alVar = null;
                        if (alVar != null) {
                            if ('s' != c2) {
                                strArr2 = at;
                                i4 = di.ah + 1592736252;
                                di.ah = i4;
                                strArr2[(i4 * 1266718091) - 1] = alVar.ao;
                            } else {
                                r2 = ak;
                                i4 = dy.ap - 1612345326;
                                dy.ap = i4;
                                r2[(i4 * -38307927) - 1] = alVar.aa * -1328241417;
                            }
                        }
                        return 1;
                    }
                    i2++;
                }
                alVar = ac;
                if (alVar != null) {
                    if ('s' != c2) {
                        r2 = ak;
                        i4 = dy.ap - 1612345326;
                        dy.ap = i4;
                        r2[(i4 * -38307927) - 1] = alVar.aa * -1328241417;
                    } else {
                        strArr2 = at;
                        i4 = di.ah + 1592736252;
                        di.ah = i4;
                        strArr2[(i4 * 1266718091) - 1] = alVar.ao;
                    }
                }
                return 1;
            }
            if (c2 == '⇚') {
                String[] strArr3 = at;
                i3 = di.ah - 1241153480;
                di.ah = i3;
                strArr3[(i3 * 1894369977) - 1] = "null";
            } else {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * 1152591372) - 1] = 0;
            }
            return 1;
        } else if (1435050277 != i) {
            return 2;
        } else {
            int[] iArr2 = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            alVar = ay.ac(iArr2[i3 * -38307927], -155042240);
            r2 = ak;
            i4 = dy.ap - 757569560;
            dy.ap = i4;
            r2[(i4 * -38307927) - 1] = alVar.ao(-1211217364);
            return 1;
        }
    }

    static int cp(int i, fs fsVar, boolean z) {
        int i2;
        int i3;
        al ac;
        int i4;
        al alVar;
        String[] strArr;
        if (i == 3400) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            ac = ay.ac(i2, -1477256078);
            i2 = 's' != ac.aq ? 0 : 0;
            for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                if (ac.ap[i2] == i3) {
                    String[] strArr2 = at;
                    i4 = di.ah + 436804489;
                    di.ah = i4;
                    strArr2[(i4 * 1894369977) - 1] = ac.ah[i2];
                    alVar = null;
                    break;
                }
            }
            alVar = ac;
            if (alVar != null) {
                strArr = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                strArr[(i3 * 1894369977) - 1] = alVar.ao;
            }
            return 1;
        } else if (3408 == i) {
            dy.ap -= -1607699868;
            char c = ak[dy.ap * -38307927];
            char c2 = ak[(dy.ap * -38307927) + 1];
            r2 = ak[(dy.ap * -38307927) + 2];
            i4 = ak[(dy.ap * -38307927) + 3];
            ac = ay.ac(r2, -226085647);
            if (c == ac.an && c2 == ac.aq) {
                for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                    if (i4 == ac.ap[i2]) {
                        int i5;
                        if (c2 == 's') {
                            String[] strArr3 = at;
                            i5 = di.ah + 436804489;
                            di.ah = i5;
                            strArr3[(i5 * 1894369977) - 1] = ac.ah[i2];
                        } else {
                            int[] iArr = ak;
                            i5 = dy.ap - 401924967;
                            dy.ap = i5;
                            iArr[(i5 * -38307927) - 1] = ac.at[i2];
                        }
                        alVar = null;
                        if (alVar != null) {
                            if ('s' != c2) {
                                strArr = at;
                                i3 = di.ah + 436804489;
                                di.ah = i3;
                                strArr[(i3 * 1894369977) - 1] = alVar.ao;
                            } else {
                                r2 = ak;
                                i3 = dy.ap - 401924967;
                                dy.ap = i3;
                                r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                            }
                        }
                        return 1;
                    }
                }
                alVar = ac;
                if (alVar != null) {
                    if ('s' != c2) {
                        r2 = ak;
                        i3 = dy.ap - 401924967;
                        dy.ap = i3;
                        r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                    } else {
                        strArr = at;
                        i3 = di.ah + 436804489;
                        di.ah = i3;
                        strArr[(i3 * 1894369977) - 1] = alVar.ao;
                    }
                }
                return 1;
            }
            if (c2 == 's') {
                String[] strArr4 = at;
                r2 = di.ah + 436804489;
                di.ah = r2;
                strArr4[(r2 * 1894369977) - 1] = "null";
            } else {
                r0 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r0[(r2 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (3411 != i) {
            return 2;
        } else {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            alVar = ay.ac(r0[r2 * -38307927], 2055152736);
            r2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            r2[(i3 * -38307927) - 1] = alVar.ao(-904843904);
            return 1;
        }
    }

    static int cr(int i, fs fsVar, boolean z) {
        int i2;
        int i3;
        al ac;
        int i4;
        al alVar;
        String[] strArr;
        if (i == 3400) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            ac = ay.ac(i2, -245163242);
            i2 = 's' != ac.aq ? 0 : 0;
            for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                if (ac.ap[i2] == i3) {
                    String[] strArr2 = at;
                    i4 = di.ah + 436804489;
                    di.ah = i4;
                    strArr2[(i4 * 1894369977) - 1] = ac.ah[i2];
                    alVar = null;
                    break;
                }
            }
            alVar = ac;
            if (alVar != null) {
                strArr = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                strArr[(i3 * 1894369977) - 1] = alVar.ao;
            }
            return 1;
        } else if (3408 == i) {
            dy.ap -= -1607699868;
            char c = ak[dy.ap * -38307927];
            char c2 = ak[(dy.ap * -38307927) + 1];
            r2 = ak[(dy.ap * -38307927) + 2];
            i4 = ak[(dy.ap * -38307927) + 3];
            ac = ay.ac(r2, -637376901);
            if (c == ac.an && c2 == ac.aq) {
                for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                    if (i4 == ac.ap[i2]) {
                        int i5;
                        if (c2 == 's') {
                            String[] strArr3 = at;
                            i5 = di.ah + 436804489;
                            di.ah = i5;
                            strArr3[(i5 * 1894369977) - 1] = ac.ah[i2];
                        } else {
                            int[] iArr = ak;
                            i5 = dy.ap - 401924967;
                            dy.ap = i5;
                            iArr[(i5 * -38307927) - 1] = ac.at[i2];
                        }
                        alVar = null;
                        if (alVar != null) {
                            if ('s' != c2) {
                                strArr = at;
                                i3 = di.ah + 436804489;
                                di.ah = i3;
                                strArr[(i3 * 1894369977) - 1] = alVar.ao;
                            } else {
                                r2 = ak;
                                i3 = dy.ap - 401924967;
                                dy.ap = i3;
                                r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                            }
                        }
                        return 1;
                    }
                }
                alVar = ac;
                if (alVar != null) {
                    if ('s' != c2) {
                        r2 = ak;
                        i3 = dy.ap - 401924967;
                        dy.ap = i3;
                        r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                    } else {
                        strArr = at;
                        i3 = di.ah + 436804489;
                        di.ah = i3;
                        strArr[(i3 * 1894369977) - 1] = alVar.ao;
                    }
                }
                return 1;
            }
            if (c2 == 's') {
                String[] strArr4 = at;
                r2 = di.ah + 436804489;
                di.ah = r2;
                strArr4[(r2 * 1894369977) - 1] = "null";
            } else {
                r0 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r0[(r2 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (3411 != i) {
            return 2;
        } else {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            alVar = ay.ac(r0[r2 * -38307927], -1113483074);
            r2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            r2[(i3 * -38307927) - 1] = alVar.ao(-477029890);
            return 1;
        }
    }

    static int ct(int i, fs fsVar, boolean z) {
        int i2;
        int i3;
        al ac;
        int i4;
        al alVar;
        String[] strArr;
        if (i == 3400) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            ac = ay.ac(i2, -1597870717);
            i2 = 's' != ac.aq ? 0 : 0;
            for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                if (ac.ap[i2] == i3) {
                    String[] strArr2 = at;
                    i4 = di.ah + 436804489;
                    di.ah = i4;
                    strArr2[(i4 * 1894369977) - 1] = ac.ah[i2];
                    alVar = null;
                    break;
                }
            }
            alVar = ac;
            if (alVar != null) {
                strArr = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                strArr[(i3 * 1894369977) - 1] = alVar.ao;
            }
            return 1;
        } else if (3408 == i) {
            dy.ap -= -1607699868;
            char c = ak[dy.ap * -38307927];
            char c2 = ak[(dy.ap * -38307927) + 1];
            r2 = ak[(dy.ap * -38307927) + 2];
            i4 = ak[(dy.ap * -38307927) + 3];
            ac = ay.ac(r2, -100910517);
            if (c == ac.an && c2 == ac.aq) {
                for (i2 = 0; i2 < 19415465 * ac.ak; i2++) {
                    if (i4 == ac.ap[i2]) {
                        int i5;
                        if (c2 == 's') {
                            String[] strArr3 = at;
                            i5 = di.ah + 436804489;
                            di.ah = i5;
                            strArr3[(i5 * 1894369977) - 1] = ac.ah[i2];
                        } else {
                            int[] iArr = ak;
                            i5 = dy.ap - 401924967;
                            dy.ap = i5;
                            iArr[(i5 * -38307927) - 1] = ac.at[i2];
                        }
                        alVar = null;
                        if (alVar != null) {
                            if ('s' != c2) {
                                strArr = at;
                                i3 = di.ah + 436804489;
                                di.ah = i3;
                                strArr[(i3 * 1894369977) - 1] = alVar.ao;
                            } else {
                                r2 = ak;
                                i3 = dy.ap - 401924967;
                                dy.ap = i3;
                                r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                            }
                        }
                        return 1;
                    }
                }
                alVar = ac;
                if (alVar != null) {
                    if ('s' != c2) {
                        r2 = ak;
                        i3 = dy.ap - 401924967;
                        dy.ap = i3;
                        r2[(i3 * -38307927) - 1] = alVar.aa * -1328241417;
                    } else {
                        strArr = at;
                        i3 = di.ah + 436804489;
                        di.ah = i3;
                        strArr[(i3 * 1894369977) - 1] = alVar.ao;
                    }
                }
                return 1;
            }
            if (c2 == 's') {
                String[] strArr4 = at;
                r2 = di.ah + 436804489;
                di.ah = r2;
                strArr4[(r2 * 1894369977) - 1] = "null";
            } else {
                r0 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r0[(r2 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (3411 != i) {
            return 2;
        } else {
            r0 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            alVar = ay.ac(r0[r2 * -38307927], 1909974372);
            r2 = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            r2[(i3 * -38307927) - 1] = alVar.ao(548654115);
            return 1;
        }
    }

    static int ce(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (3600 == i) {
            if (-1188065354 * dx.na.ak == 0) {
                iArr = ak;
                i2 = dy.ap - 1046689368;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = -2;
                return 1;
            } else if (dx.na.ak * -2137861454 == 1) {
                iArr = ak;
                i2 = dy.ap - 1419371304;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = -1;
                return 1;
            } else {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = dx.na.ao.ac((byte) -1);
                return 1;
            }
        } else if (i == -246487736) {
            iArr = ak;
            i2 = dy.ap - -1799807144;
            dy.ap = i2;
            r0 = iArr[i2 * 32943698];
            if (!dx.na.aj((byte) 74) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            ee eeVar = (ee) dx.na.ao.aw(r0, 1557891937);
            r2 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r2[(r3 * 1894369977) - 1] = eeVar.ac((byte) -116);
            r2 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r2[(r3 * -776882273) - 1] = eeVar.an(30776324);
            return 1;
        } else if (i == 3602) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (!dx.na.aj((byte) 86) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 1539823464;
            dy.ap = r3;
            r2[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 1947224161)).an * 614420611;
            return 1;
        } else if (i == 3603) {
            iArr = ak;
            r3 = dy.ap - -906225917;
            dy.ap = r3;
            r0 = iArr[r3 * -1055357055];
            if (!dx.na.aj((byte) 55) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r2[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 1652158921)).aq * -1774542961;
            return 1;
        } else if (i == -1563460747) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r0 = r0[i2 * 1894369977];
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -446513586];
            mg ac = hd.ac(mr.au, client.dp.ao, (byte) -25);
            ac.an.an(cx.ah(r0, 1372798289) + 1, (byte) -74);
            ac.an.be(i2, (byte) 114);
            ac.an.ai(r0, -1715184939);
            client.dp.an(ac, 818662636);
            return 1;
        } else if (3605 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            dx.na.ap(r0[i2 * 1894369977], (byte) 16);
            return 1;
        } else if (3606 == i) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            dx.na.af(r0[r3 * 1894369977], (byte) 0);
            return 1;
        } else if (3607 == i) {
            r0 = at;
            i2 = di.ah - -391421013;
            di.ah = i2;
            dx.na.ae(r0[i2 * 1836343526], 210292549);
            return 1;
        } else if (1846856629 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            dx.na.au(r0[i2 * 24015685], (byte) 117);
            return 1;
        } else if (i == 429451092) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * -203392809], -1812025927);
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * 2117628181) - 1;
            if (dx.na.aa(new ez(r0, ce.ap), false, (byte) 0)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3611 == i) {
            if (bt.lw != null) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 503795012) - 1] = bt.lw.at;
                return 1;
            }
            r0 = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            r0[(i2 * 1894369977) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (bt.lw != null) {
                iArr = ak;
                i2 = dy.ap + 762623191;
                dy.ap = i2;
                iArr[(i2 * -1766926331) - 1] = bt.lw.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            r3 = dy.ap - 1922624427;
            dy.ap = r3;
            iArr[(r3 * -38307927) - 1] = 0;
            return 1;
        } else if (i == 391211216) {
            iArr = ak;
            i2 = dy.ap - -922511452;
            dy.ap = i2;
            r0 = iArr[i2 * -1023964332];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            r2 = at;
            r3 = di.ah + 1941527782;
            di.ah = r3;
            r2[(r3 * 1010773083) - 1] = bt.lw.aw(r0, 1781580732).aj(-1190179956).aj(-1434425671);
            return 1;
        } else if (i == 3614) {
            iArr = ak;
            r3 = dy.ap - 1806896841;
            dy.ap = r3;
            r0 = iArr[r3 * -1850891891];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap + 749201852;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap + 1451080462;
            dy.ap = r3;
            r2[(r3 * -1952836690) - 1] = ((et) bt.lw.aw(r0, 1567882332)).an * 1184115479;
            return 1;
        } else if (3615 == i) {
            iArr = ak;
            r3 = dy.ap - 1573284801;
            dy.ap = r3;
            r0 = iArr[r3 * 265225499];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 553899510;
                dy.ap = r3;
                iArr[(r3 * -1875275930) - 1] = 0;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 367140077;
            dy.ap = r3;
            r2[(r3 * -1077967169) - 1] = ((et) bt.lw.aw(r0, 1810249797)).aq;
            return 1;
        } else if (-1787280027 == i) {
            iArr = ak;
            r3 = dy.ap - 75098478;
            dy.ap = r3;
            r3 = (r3 * 98766231) - 1;
            if (bt.lw != null) {
                z2 = bt.lw.ai;
            }
            iArr[r3] = z2;
            return 1;
        } else if (i == 1432938703) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            ef.fz(r0[i2 * 1894369977], -1630071350);
            return 1;
        } else if (i == 3618) {
            iArr = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (bt.lw != null) {
                z2 = bt.lw.aw;
            }
            iArr[r3] = z2;
            return 1;
        } else if (557046485 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r0 = r0[i2 * -247100234];
            if (r0.equals("")) {
                return 1;
            }
            mg ac2 = hd.ac(mr.az, client.dp.ao, (byte) -32);
            ac2.an.an(cx.ah(r0, -466738600), (byte) -123);
            ac2.an.ai(r0, 355548907);
            client.dp.an(ac2, 1617663619);
            return 1;
        } else if (i == 3620) {
            kf.fo((byte) -51);
            return 1;
        } else if (i == 3621) {
            if (dx.na.aj((byte) 34)) {
                iArr = ak;
                i2 = dy.ap + 1713475796;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = dx.na.aa.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = -1;
            return 1;
        } else if (i == 325059247) {
            iArr = ak;
            i2 = dy.ap - -800539071;
            dy.ap = i2;
            r0 = iArr[i2 * -38307927];
            if (!dx.na.aj((byte) 60) || r0 < 0 || r0 >= dx.na.aa.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * -1202562105) - 1] = "";
                r0 = at;
                i2 = di.ah - 901167663;
                di.ah = i2;
                r0[(i2 * 1259720980) - 1] = "";
                return 1;
            }
            el elVar = (el) dx.na.aa.aw(r0, 1978750720);
            r2 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r2[(r3 * -1810760903) - 1] = elVar.ac((byte) -56);
            r2 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r2[(r3 * 1894369977) - 1] = elVar.an(30776324);
            return 1;
        } else if (3623 == i) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * 1894369977], -1704526215);
            r3 = ak;
            r4 = dy.ap - 1179864974;
            dy.ap = r4;
            r4 = (r4 * -621338724) - 1;
            if (dx.na.ak(new ez(r0, ce.ap), 1228934358)) {
                r0 = 1;
            } else {
                boolean z3 = false;
            }
            r3[r4] = r0;
            return 1;
        } else if (930784625 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -257295584];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !bt.lw.aw(r0, 1725127611).aj(-880087950).equals(cx.hb.aj)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap + 1243098415;
            dy.ap = i2;
            iArr[(i2 * 1861360795) - 1] = 1;
            return 1;
        } else if (i == -1125197309) {
            if (bt.lw == null || bt.lw.ah == null) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            r0 = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            r0[(i2 * 254003107) - 1] = bt.lw.ah;
            return 1;
        } else if (i == 1321825384) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 1575147015)).ar((short) 7092)) {
                iArr = ak;
                r3 = dy.ap + 1570045120;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -2073119483) - 1] = 1;
            return 1;
        } else if (i != -1116136056) {
            return 2;
        } else {
            iArr = ak;
            r3 = dy.ap - 714817789;
            dy.ap = r3;
            r0 = iArr[r3 * -364917910];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 2119834856)).bp((byte) 30)) {
                iArr = ak;
                r3 = dy.ap + 615018707;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 1918766214) - 1] = 1;
            return 1;
        }
    }

    static int ck(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (-1611740862 == i) {
            if (-608375691 * dx.na.ak == 0) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * 283756356) - 1] = -2;
                return 1;
            } else if (dx.na.ak * -608375691 == 1) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = -1;
                return 1;
            } else {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = dx.na.ao.ac((byte) -1);
                return 1;
            }
        } else if (i == -766927848) {
            iArr = ak;
            i2 = dy.ap - 2122375191;
            dy.ap = i2;
            r0 = iArr[i2 * -390813267];
            if (!dx.na.aj((byte) 31) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 224330944) - 1] = "";
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 2043594348) - 1] = "";
                return 1;
            }
            ee eeVar = (ee) dx.na.ao.aw(r0, 1445404950);
            r1 = at;
            r3 = di.ah - 70836800;
            di.ah = r3;
            r1[(r3 * 1894369977) - 1] = eeVar.ac((byte) -95);
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 1894369977) - 1] = eeVar.an(30776324);
            return 1;
        } else if (i == -248228587) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (!dx.na.aj((byte) 109) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 340174212;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 1499787796)).an * 614420611;
            return 1;
        } else if (i == 364070192) {
            iArr = ak;
            r3 = dy.ap - 1352183578;
            dy.ap = r3;
            r0 = iArr[r3 * -419787975];
            if (!dx.na.aj((byte) 126) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap + 1861545390;
                dy.ap = r3;
                iArr[(r3 * 667707640) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 2043255981)).aq * -1774542961;
            return 1;
        } else if (i == 3604) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r0 = r0[i2 * 1894369977];
            r1 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r1[r3 * -38307927];
            mg ac = hd.ac(mr.au, client.dp.ao, (byte) -16);
            ac.an.an(cx.ah(r0, 1365965807) + 1, (byte) -43);
            ac.an.be(i2, (byte) 126);
            ac.an.ai(r0, 333312074);
            client.dp.an(ac, 1317737384);
            return 1;
        } else if (3605 == i) {
            r0 = at;
            i2 = di.ah - -881185055;
            di.ah = i2;
            dx.na.ap(r0[i2 * 1894369977], (byte) 16);
            return 1;
        } else if (-1554255134 == i) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            dx.na.af(r0[r3 * 1894369977], (byte) 0);
            return 1;
        } else if (3607 == i) {
            r0 = at;
            i2 = di.ah - 402096408;
            di.ah = i2;
            dx.na.ae(r0[i2 * 1894369977], 1479149431);
            return 1;
        } else if (-1942540766 == i) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            dx.na.au(r0[r3 * -228547956], (byte) 0);
            return 1;
        } else if (i == 3609) {
            r0 = at;
            r3 = di.ah - 517015243;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * 1894369977], -207228408);
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * 1332456455) - 1;
            if (dx.na.aa(new ez(r0, ce.ap), false, (byte) 0)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3611 == i) {
            if (bt.lw != null) {
                r0 = at;
                i2 = di.ah + 1886534614;
                di.ah = i2;
                r0[(i2 * -52678658) - 1] = bt.lw.at;
                return 1;
            }
            r0 = at;
            i2 = di.ah + 2127180039;
            di.ah = i2;
            r0[(i2 * -227500688) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (bt.lw != null) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -1717576113) - 1] = bt.lw.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            r3 = dy.ap - 831317694;
            dy.ap = r3;
            iArr[(r3 * -38307927) - 1] = 0;
            return 1;
        } else if (i == 1604647130) {
            iArr = ak;
            i2 = dy.ap - -165409237;
            dy.ap = i2;
            r0 = iArr[i2 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 233023923) - 1] = bt.lw.aw(r0, 1775715249).aj(-929010095).aj(-335073629);
            return 1;
        } else if (i == 608352581) {
            iArr = ak;
            r3 = dy.ap - -1917012432;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 728053539;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 1604080281)).an * 1184115479;
            return 1;
        } else if (3615 == i) {
            iArr = ak;
            r3 = dy.ap - -801488838;
            dy.ap = r3;
            r0 = iArr[r3 * 285116389];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 1465919115;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 2031942277)).aq;
            return 1;
        } else if (-1233262924 == i) {
            byte b;
            r3 = ak;
            r0 = dy.ap - 401924967;
            dy.ap = r0;
            r4 = (r0 * 1231891989) - 1;
            if (bt.lw != null) {
                b = bt.lw.ai;
            } else {
                b = (byte) 0;
            }
            r3[r4] = b;
            return 1;
        } else if (i == -490731528) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            ef.fz(r0[i2 * 1411147219], -1630071350);
            return 1;
        } else if (i == 3618) {
            iArr = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (bt.lw != null) {
                z2 = bt.lw.aw;
            }
            iArr[r3] = z2;
            return 1;
        } else if (-515507004 == i) {
            r0 = at;
            i2 = di.ah - 175684209;
            di.ah = i2;
            r0 = r0[i2 * 1894369977];
            if (r0.equals("")) {
                return 1;
            }
            mg ac2 = hd.ac(mr.az, client.dp.ao, (byte) -12);
            ac2.an.an(cx.ah(r0, -876763536), (byte) -106);
            ac2.an.ai(r0, 1603975028);
            client.dp.an(ac2, 958367284);
            return 1;
        } else if (i == 3620) {
            kf.fo((byte) -120);
            return 1;
        } else if (i == 1749357860) {
            if (dx.na.aj((byte) 49)) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -2075454781) - 1] = dx.na.aa.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 217740332) - 1] = -1;
            return 1;
        } else if (i == 3622) {
            iArr = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = iArr[i2 * -1524200260];
            if (!dx.na.aj((byte) 82) || r0 < 0 || r0 >= dx.na.aa.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * -25664793) - 1] = "";
                return 1;
            }
            el elVar = (el) dx.na.aa.aw(r0, 2009293612);
            r1 = at;
            r3 = di.ah - 998309052;
            di.ah = r3;
            r1[(r3 * 1495293554) - 1] = elVar.ac((byte) 1);
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 1894369977) - 1] = elVar.an(30776324);
            return 1;
        } else if (-967652285 == i) {
            r0 = at;
            r3 = di.ah - -1289358061;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * 1894369977], -1412054061);
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * 2115669316) - 1;
            if (dx.na.ak(new ez(r0, ce.ap), 1228934358)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (1026043152 == i) {
            iArr = ak;
            r3 = dy.ap - -1730348084;
            dy.ap = r3;
            r0 = iArr[r3 * 1118553256];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !bt.lw.aw(r0, 2095924645).aj(-1481668297).equals(cx.hb.aj)) {
                iArr = ak;
                r3 = dy.ap + 1021281528;
                dy.ap = r3;
                iArr[(r3 * -765393802) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = 1;
            return 1;
        } else if (i == 658499467) {
            if (bt.lw == null || bt.lw.ah == null) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            r0 = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            r0[(i2 * 1894369977) - 1] = bt.lw.ah;
            return 1;
        } else if (i == 3626) {
            iArr = ak;
            r3 = dy.ap - -2016103538;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 1543309437)).ar((short) 22285)) {
                iArr = ak;
                r3 = dy.ap + 260741557;
                dy.ap = r3;
                iArr[(r3 * -814422648) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -795849011) - 1] = 1;
            return 1;
        } else if (i != 1047499489) {
            return 2;
        } else {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 1568848023)).bp((byte) 30)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap + 800380013;
            dy.ap = i2;
            iArr[(i2 * -1262297907) - 1] = 1;
            return 1;
        }
    }

    static int cm(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (3600 == i) {
            if (-1169152479 * dx.na.ak == 0) {
                iArr = ak;
                i2 = dy.ap - 232704778;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = -565593452;
                return 1;
            } else if (dx.na.ak * -1047384908 == 1) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = -1;
                return 1;
            } else {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = dx.na.ao.ac((byte) -1);
                return 1;
            }
        } else if (i == 1758584223) {
            iArr = ak;
            i2 = dy.ap - 1367685834;
            dy.ap = i2;
            r0 = iArr[i2 * -1934469445];
            if (!dx.na.aj((byte) 60) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah - 2039954121;
                di.ah = i2;
                r0[(i2 * -469305799) - 1] = "";
                r0 = at;
                i2 = di.ah - 1564363005;
                di.ah = i2;
                r0[(i2 * -664896450) - 1] = "";
                return 1;
            }
            ee eeVar = (ee) dx.na.ao.aw(r0, 2020350622);
            r1 = at;
            r3 = di.ah + 377932129;
            di.ah = r3;
            r1[(r3 * 1594979953) - 1] = eeVar.ac((byte) -41);
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 1894369977) - 1] = eeVar.an(30776324);
            return 1;
        } else if (i == 3602) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * 1555122377];
            if (!dx.na.aj((byte) 9) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap + 1294193149;
            dy.ap = r3;
            r1[(r3 * 29048653) - 1] = ((ee) dx.na.ao.aw(r0, 2106454460)).an * 614420611;
            return 1;
        } else if (i == -1129674449) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (!dx.na.aj((byte) 82) || r0 < 0 || r0 >= dx.na.ao.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap + 88781016;
                dy.ap = r3;
                iArr[(r3 * 1408567083) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap + 315919035;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((ee) dx.na.ao.aw(r0, 1824406959)).aq * -1169971234;
            return 1;
        } else if (i == 3604) {
            r0 = at;
            i2 = di.ah - 1940259020;
            di.ah = i2;
            r0 = r0[i2 * 1124329132];
            r1 = ak;
            r3 = dy.ap - -278453918;
            dy.ap = r3;
            i2 = r1[r3 * -649025585];
            mg ac = hd.ac(mr.au, client.dp.ao, (byte) 4);
            ac.an.an(cx.ah(r0, -2025943396) + 1, (byte) -19);
            ac.an.be(i2, (byte) 117);
            ac.an.ai(r0, 287459139);
            client.dp.an(ac, 1322474420);
            return 1;
        } else if (-109261114 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            dx.na.ap(r0[i2 * -1868185300], (byte) 16);
            return 1;
        } else if (-2036819407 == i) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            dx.na.af(r0[r3 * 1894369977], (byte) 0);
            return 1;
        } else if (-724682501 == i) {
            r0 = at;
            i2 = di.ah - -1653809061;
            di.ah = i2;
            dx.na.ae(r0[i2 * 2091538042], 1278194314);
            return 1;
        } else if (1209559872 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            dx.na.au(r0[i2 * 1894369977], (byte) 10);
            return 1;
        } else if (i == 1031091608) {
            r0 = at;
            r3 = di.ah - 436804489;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * -1761896874], -339433190);
            r3 = ak;
            r4 = dy.ap - 704617954;
            dy.ap = r4;
            r3[(r4 * -38307927) - 1] = dx.na.aa(new ez(r0, ce.ap), false, (byte) 0) ? (byte) 1 : (byte) 0;
            return 1;
        } else if (3611 == i) {
            if (bt.lw != null) {
                r0 = at;
                i2 = di.ah - 989543236;
                di.ah = i2;
                r0[(i2 * -786886458) - 1] = bt.lw.at;
                return 1;
            }
            r0 = at;
            i2 = di.ah + 436804489;
            di.ah = i2;
            r0[(i2 * 1894369977) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (bt.lw != null) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = bt.lw.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            iArr[(r3 * -38307927) - 1] = 0;
            return 1;
        } else if (i == 3613) {
            iArr = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = iArr[i2 * -24517999];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 1398477402) - 1] = "";
                return 1;
            }
            r1 = at;
            r3 = di.ah - 1902541741;
            di.ah = r3;
            r1[(r3 * 1894369977) - 1] = bt.lw.aw(r0, 1628504564).aj(-1257680647).aj(-1275071077);
            return 1;
        } else if (i == 3614) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -68158733];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap + 2103977913;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 1324004407;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 1455664025)).an * -1050698538;
            return 1;
        } else if (-1747875357 == i) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -1048564754];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            r1 = ak;
            r3 = dy.ap - 643722048;
            dy.ap = r3;
            r1[(r3 * -38307927) - 1] = ((et) bt.lw.aw(r0, 2093151867)).aq;
            return 1;
        } else if (-1449941729 == i) {
            iArr = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (bt.lw != null) {
                z2 = bt.lw.ai;
            }
            iArr[r3] = z2;
            return 1;
        } else if (i == 3617) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            ef.fz(r0[i2 * 219776248], -1630071350);
            return 1;
        } else if (i == 2121222447) {
            iArr = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -806284808) - 1;
            if (bt.lw != null) {
                z2 = bt.lw.aw;
            }
            iArr[r3] = z2;
            return 1;
        } else if (1007156060 == i) {
            r0 = at;
            i2 = di.ah - 436804489;
            di.ah = i2;
            r0 = r0[i2 * -1658063541];
            if (r0.equals("")) {
                return 1;
            }
            mg ac2 = hd.ac(mr.az, client.dp.ao, (byte) 23);
            ac2.an.an(cx.ah(r0, 1959860837), (byte) -19);
            ac2.an.ai(r0, 1432818335);
            client.dp.an(ac2, 562351828);
            return 1;
        } else if (i == 3620) {
            kf.fo((byte) -11);
            return 1;
        } else if (i == 3621) {
            if (dx.na.aj((byte) 40)) {
                iArr = ak;
                i2 = dy.ap - 401924967;
                dy.ap = i2;
                iArr[(i2 * -38307927) - 1] = dx.na.aa.ac((byte) -1);
                return 1;
            }
            iArr = ak;
            i2 = dy.ap + 1900382459;
            dy.ap = i2;
            iArr[(i2 * 420005296) - 1] = -1;
            return 1;
        } else if (i == 440931452) {
            iArr = ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = iArr[i2 * -38307927];
            if (!dx.na.aj((byte) 82) || r0 < 0 || r0 >= dx.na.aa.ac((byte) -1)) {
                r0 = at;
                i2 = di.ah - 87601093;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                r0 = at;
                i2 = di.ah - 435981062;
                di.ah = i2;
                r0[(i2 * 1894369977) - 1] = "";
                return 1;
            }
            el elVar = (el) dx.na.aa.aw(r0, 1558573057);
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 900811975) - 1] = elVar.ac((byte) -73);
            r1 = at;
            r3 = di.ah + 436804489;
            di.ah = r3;
            r1[(r3 * 1711432689) - 1] = elVar.an(30776324);
            return 1;
        } else if (-1527705535 == i) {
            r0 = at;
            r3 = di.ah - -971542233;
            di.ah = r3;
            r0 = dk.fx(r0[r3 * 351410205], -1140493191);
            r3 = ak;
            r4 = dy.ap + 1876741570;
            dy.ap = r4;
            r4 = (r4 * 581600876) - 1;
            if (dx.na.ak(new ez(r0, ce.ap), 1228934358)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (-1618204187 == i) {
            iArr = ak;
            r3 = dy.ap - 1287758564;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !bt.lw.aw(r0, 1687371455).aj(-2067260191).equals(cx.hb.aj)) {
                iArr = ak;
                r3 = dy.ap + 1132713376;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 2016347943) - 1] = 1;
            return 1;
        } else if (i == 3625) {
            if (bt.lw == null || bt.lw.ah == null) {
                r0 = at;
                i2 = di.ah + 436804489;
                di.ah = i2;
                r0[(i2 * 875762806) - 1] = "";
                return 1;
            }
            r0 = at;
            i2 = di.ah - 673005174;
            di.ah = i2;
            r0[(i2 * 1894369977) - 1] = bt.lw.ah;
            return 1;
        } else if (i == -343749847) {
            iArr = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            r0 = iArr[r3 * -38307927];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 2049789601)).ar((short) 12925)) {
                iArr = ak;
                r3 = dy.ap + 1628594678;
                dy.ap = r3;
                iArr[(r3 * -38307927) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap + 1894280735;
            dy.ap = i2;
            iArr[(i2 * -1055469860) - 1] = 1;
            return 1;
        } else if (i != 397118618) {
            return 2;
        } else {
            iArr = ak;
            r3 = dy.ap - 996289099;
            dy.ap = r3;
            r0 = iArr[r3 * -1552343676];
            if (bt.lw == null || r0 >= bt.lw.ac((byte) -1) || !((et) bt.lw.aw(r0, 2132089757)).bp((byte) 30)) {
                iArr = ak;
                r3 = dy.ap - 401924967;
                dy.ap = r3;
                iArr[(r3 * 568486756) - 1] = 0;
                return 1;
            }
            iArr = ak;
            i2 = dy.ap - 196823688;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = 1;
            return 1;
        }
    }

    static int ch(int i, fs fsVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        String[] strArr;
        int i4;
        if (i == 4200) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            strArr = at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            strArr[(i4 * 1894369977) - 1] = al.ac(i2, (short) -4163).af;
            return 1;
        } else if (i == 4201) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) 14130);
            if (i3 < 1 || i3 > 5 || r0.bu[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bu[i3 - 1];
            return 1;
        } else if (i == 4202) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) -13989);
            if (i3 < 1 || i3 > 5 || r0.bd[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bd[i3 - 1];
            return 1;
        } else if (i == 4203) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            r2[(i4 * -38307927) - 1] = al.ac(i2, (short) 4593).br * -296615951;
            return 1;
        } else if (i == 4204) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) -10841).bt * -559602733 == 1) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (4205 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) -4832);
            if (r2.bl * -1811867057 != -1 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (i == 4206) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) -14956);
            if (r2.bl * -1811867057 < 0 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (4207 == i) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) 4724).bb) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (i == 4208) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 20116);
            if (-1223174873 * r2.ck != -1 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (4209 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 11065);
            if (r2.ck * -1223174873 < 0 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (i == 4210) {
            int i5;
            strArr = at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            String str = strArr[i4 * 1894369977];
            r3 = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (1 == r3[r4 * -38307927]) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            String toLowerCase = str.toLowerCase();
            i4 = 0;
            short[] sArr = new short[16];
            for (i3 = 0; i3 < iz.ai * 68659529; i3++) {
                av ac = al.ac(i3, (short) -2499);
                if (i5 == 0 || ac.cr) {
                    if (ac.bl * -1811867057 == -1) {
                        if (ac.af.toLowerCase().indexOf(toLowerCase) != -1) {
                            if (i4 >= 250) {
                                fs.oq = -584098643;
                                aq.of = null;
                                break;
                            }
                            if (i4 >= sArr.length) {
                                short[] sArr2 = new short[(sArr.length * 2)];
                                for (int i6 = 0; i6 < i4; i6++) {
                                    sArr2[i6] = sArr[i6];
                                }
                                sArr = sArr2;
                            }
                            int i7 = i4 + 1;
                            sArr[i4] = (short) i3;
                            i4 = i7;
                        }
                    }
                }
            }
            aq.of = sArr;
            bj.ol = 0;
            fs.oq = 584098643 * i4;
            r3 = new String[(fs.oq * -1863739173)];
            for (i3 = 0; i3 < -1863739173 * fs.oq; i3++) {
                r3[i3] = al.ac(sArr[i3], (short) 5044).af;
            }
            ee.aj(r3, aq.of, 0, r3.length - 1, (byte) 49);
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr[(i3 * -38307927) - 1] = -1863739173 * fs.oq;
            return 1;
        } else if (i == 4211) {
            if (aq.of == null || bj.ol * -487968877 >= fs.oq * -1863739173) {
                iArr = ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = -1;
                return 1;
            }
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            short[] sArr3 = aq.of;
            r4 = bj.ol + 299976347;
            bj.ol = r4;
            iArr[i3] = sArr3[(r4 * -487968877) - 1] & 65535;
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            bj.ol = 0;
            return 1;
        }
    }

    static int ci(int i, fs fsVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        String[] strArr;
        int i4;
        if (i == 4200) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            strArr = at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            strArr[(i4 * 1894369977) - 1] = al.ac(i2, (short) -3776).af;
            return 1;
        } else if (i == 4201) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) -9963);
            if (i3 < 1 || i3 > 5 || r0.bu[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bu[i3 - 1];
            return 1;
        } else if (i == 4202) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) 5949);
            if (i3 < 1 || i3 > 5 || r0.bd[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bd[i3 - 1];
            return 1;
        } else if (i == 4203) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            r2[(i4 * -38307927) - 1] = al.ac(i2, (short) 1660).br * -296615951;
            return 1;
        } else if (i == 4204) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) -571).bt * -559602733 == 1) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (4205 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 28099);
            if (r2.bl * -1811867057 != -1 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (i == 4206) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 17250);
            if (r2.bl * -1811867057 < 0 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (4207 == i) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) -6761).bb) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (i == 4208) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) -7598);
            if (-1223174873 * r2.ck != -1 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (4209 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 1361);
            if (r2.ck * -1223174873 < 0 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (i == 4210) {
            strArr = at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            String str = strArr[i4 * 1894369977];
            r2 = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (1 == r2[r4 * -38307927]) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            String toLowerCase = str.toLowerCase();
            r4 = 0;
            short[] sArr = new short[16];
            for (i4 = 0; i4 < iz.ai * 68659529; i4++) {
                av ac = al.ac(i4, (short) 20578);
                if (i3 == 0 || ac.cr) {
                    if (ac.bl * -1811867057 == -1) {
                        if (ac.af.toLowerCase().indexOf(toLowerCase) == -1) {
                            continue;
                        } else if (r4 >= 250) {
                            fs.oq = -584098643;
                            aq.of = null;
                            break;
                        } else {
                            if (r4 >= sArr.length) {
                                short[] sArr2 = new short[(sArr.length * 2)];
                                for (int i5 = 0; i5 < r4; i5++) {
                                    sArr2[i5] = sArr[i5];
                                }
                                sArr = sArr2;
                            }
                            int i6 = r4 + 1;
                            sArr[r4] = (short) i4;
                            r4 = i6;
                        }
                    }
                }
            }
            aq.of = sArr;
            bj.ol = 0;
            fs.oq = 584098643 * r4;
            r3 = new String[(fs.oq * -1863739173)];
            for (i3 = 0; i3 < -1863739173 * fs.oq; i3++) {
                r3[i3] = al.ac(sArr[i3], (short) 1115).af;
            }
            ee.aj(r3, aq.of, 0, r3.length - 1, (byte) -68);
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr[(i3 * -38307927) - 1] = -1863739173 * fs.oq;
            return 1;
        } else if (i == 4211) {
            if (aq.of == null || bj.ol * -487968877 >= fs.oq * -1863739173) {
                iArr = ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = -1;
                return 1;
            }
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            short[] sArr3 = aq.of;
            r4 = bj.ol + 299976347;
            bj.ol = r4;
            iArr[i3] = sArr3[(r4 * -487968877) - 1] & 65535;
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            bj.ol = 0;
            return 1;
        }
    }

    static int cq(int i, fs fsVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        String[] strArr;
        int i4;
        if (i == 4200) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            strArr = at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            strArr[(i4 * 1894369977) - 1] = al.ac(i2, (short) -11782).af;
            return 1;
        } else if (i == 4201) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) -21413);
            if (i3 < 1 || i3 > 5 || r0.bu[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bu[i3 - 1];
            return 1;
        } else if (i == 4202) {
            dy.ap -= -803849934;
            i2 = ak[dy.ap * -38307927];
            i3 = ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i2, (short) 8088);
            if (i3 < 1 || i3 > 5 || r0.bd[i3 - 1] == null) {
                r0 = at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r0[(i3 * 1894369977) - 1] = "";
                return 1;
            }
            r3 = at;
            r4 = di.ah + 436804489;
            di.ah = r4;
            r3[(r4 * 1894369977) - 1] = r0.bd[i3 - 1];
            return 1;
        } else if (i == 4203) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            r2[(i4 * -38307927) - 1] = al.ac(i2, (short) 12211).br * -296615951;
            return 1;
        } else if (i == 4204) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) 958).bt * -559602733 == 1) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (4205 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) -4703);
            if (r2.bl * -1811867057 != -1 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (i == 4206) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) -4221);
            if (r2.bl * -1811867057 < 0 || r2.bf * -483035651 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.bf * -483035651;
            return 1;
        } else if (4207 == i) {
            r2 = ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i3 = r2[i4 * -38307927];
            r3 = ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (al.ac(i3, (short) 18482).bb) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (i == 4208) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 1173);
            if (-1223174873 * r2.ck != -1 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (4209 == i) {
            iArr = ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            i2 = iArr[i3 * -38307927];
            r2 = al.ac(i2, (short) 2818);
            if (r2.ck * -1223174873 < 0 || r2.cm * 2070465581 < 0) {
                r2 = ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                r2[(i4 * -38307927) - 1] = i2;
                return 1;
            }
            iArr = ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = r2.cm * 2070465581;
            return 1;
        } else if (i == 4210) {
            strArr = at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            String str = strArr[i4 * 1894369977];
            r2 = ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            i3 = 1 == r2[r4 * -38307927] ? 1 : 0;
            String toLowerCase = str.toLowerCase();
            r4 = 0;
            short[] sArr = new short[16];
            for (i4 = 0; i4 < iz.ai * 68659529; i4++) {
                av ac = al.ac(i4, (short) 24512);
                if (i3 == 0 || ac.cr) {
                    if (ac.bl * -1811867057 != -1) {
                        continue;
                    } else if (ac.af.toLowerCase().indexOf(toLowerCase) != -1) {
                        if (r4 >= 250) {
                            fs.oq = -584098643;
                            aq.of = null;
                            break;
                        }
                        short[] sArr2;
                        if (r4 >= sArr.length) {
                            sArr2 = new short[(sArr.length * 2)];
                            for (int i5 = 0; i5 < r4; i5++) {
                                sArr2[i5] = sArr[i5];
                            }
                        } else {
                            sArr2 = sArr;
                        }
                        int i6 = r4 + 1;
                        sArr2[r4] = (short) i4;
                        r4 = i6;
                        sArr = sArr2;
                    }
                }
            }
            aq.of = sArr;
            bj.ol = 0;
            fs.oq = 584098643 * r4;
            r3 = new String[(fs.oq * -1863739173)];
            for (i3 = 0; i3 < -1863739173 * fs.oq; i3++) {
                r3[i3] = al.ac(sArr[i3], (short) 10464).af;
            }
            ee.aj(r3, aq.of, 0, r3.length - 1, (byte) 32);
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr[(i3 * -38307927) - 1] = -1863739173 * fs.oq;
            return 1;
        } else if (i == 4211) {
            if (aq.of == null || bj.ol * -487968877 >= fs.oq * -1863739173) {
                iArr = ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = -1;
                return 1;
            }
            iArr = ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            i3 = (i3 * -38307927) - 1;
            short[] sArr3 = aq.of;
            r4 = bj.ol + 299976347;
            bj.ol = r4;
            iArr[i3] = sArr3[(r4 * -487968877) - 1] & 65535;
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            bj.ol = 0;
            return 1;
        }
    }

    static int cg(int i, fs fsVar, boolean z) {
        int[] iArr;
        int i2;
        if (5306 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -389038759) - 1] = fu.bf((byte) -10);
            return 1;
        } else if (5307 == i) {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            client.ac.bl(i2, -1452984572);
            return 1;
        } else if (i == -938100414) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * 2106797266) - 1] = ae.nv.ao * 912458112;
            return 1;
        } else if (i != 1087063848) {
            return 2;
        } else {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            ae.nv.ao = i2 * 663652299;
            et.an(-1101042428);
            return 1;
        }
    }

    static int cu(int i, fs fsVar, boolean z) {
        int[] iArr;
        int i2;
        if (5306 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = fu.bf((byte) -3);
            return 1;
        } else if (5307 == i) {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            client.ac.bl(i2, -1248711599);
            return 1;
        } else if (i == 5308) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = ae.nv.ao * -523246109;
            return 1;
        } else if (i != 5309) {
            return 2;
        } else {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            ae.nv.ao = i2 * 663652299;
            et.an(-1192708605);
            return 1;
        }
    }

    static int cv(int i, fs fsVar, boolean z) {
        int[] iArr;
        int i2;
        if (5306 == i) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = fu.bf((byte) -1);
            return 1;
        } else if (5307 == i) {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            client.ac.bl(i2, -1993255674);
            return 1;
        } else if (i == 5308) {
            iArr = ak;
            i2 = dy.ap - 401924967;
            dy.ap = i2;
            iArr[(i2 * -38307927) - 1] = ae.nv.ao * -523246109;
            return 1;
        } else if (i != 5309) {
            return 2;
        } else {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            i2 = r2[r3 * -38307927];
            if (i2 != 1 && i2 != 2) {
                return 1;
            }
            ae.nv.ao = i2 * 663652299;
            et.an(-22964755);
            return 1;
        }
    }

    static int cd(int i, fs fsVar, boolean z) {
        if (i == 6200) {
            dy.ap -= -803849934;
            client.nk = (short) ak[dy.ap * -38307927];
            if (client.nk <= (short) 0) {
                client.nk = (short) 256;
            }
            client.nb = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nb <= (short) 0) {
                client.nb = (short) 205;
            }
            return 1;
        } else if (6201 == i) {
            dy.ap -= -803849934;
            client.np = (short) ak[dy.ap * -38307927];
            if (client.np <= (short) 0) {
                client.np = (short) 256;
            }
            client.nr = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nr <= (short) 0) {
                client.nr = (short) 320;
            }
            return 1;
        } else if (6202 == i) {
            dy.ap -= -1607699868;
            client.nh = (short) ak[dy.ap * -38307927];
            if (client.nh <= (short) 0) {
                client.nh = (short) 1;
            }
            client.nf = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nf <= (short) 0) {
                client.nf = Short.MAX_VALUE;
            } else if (client.nf < client.nh) {
                client.nf = client.nh;
            }
            client.ni = (short) ak[(dy.ap * -38307927) + 2];
            if (client.ni <= (short) 0) {
                client.ni = (short) 1;
            }
            client.ny = (short) ak[(dy.ap * -38307927) + 3];
            if (client.ny <= (short) 0) {
                client.ny = Short.MAX_VALUE;
            } else if (client.ny < client.ni) {
                client.ny = client.ni;
            }
            return 1;
        } else if (6203 == i) {
            if (client.is != null) {
                fs.ca(0, 0, 1120250035 * client.is.bu, client.is.bd * -1781667913, false, -152865601);
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = client.ne * 1889242427;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = 1949695293 * client.nn;
            } else {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
            }
            return 1;
        } else if (i == 6204) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.np;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nr;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nk;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nb;
            return 1;
        }
    }

    static int cs(int i, fs fsVar, boolean z) {
        if (i == 6200) {
            dy.ap -= -803849934;
            client.nk = (short) ak[dy.ap * -38307927];
            if (client.nk <= (short) 0) {
                client.nk = (short) 256;
            }
            client.nb = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nb <= (short) 0) {
                client.nb = (short) 205;
            }
            return 1;
        } else if (6201 == i) {
            dy.ap -= -803849934;
            client.np = (short) ak[dy.ap * -38307927];
            if (client.np <= (short) 0) {
                client.np = (short) 256;
            }
            client.nr = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nr <= (short) 0) {
                client.nr = (short) 320;
            }
            return 1;
        } else if (6202 == i) {
            dy.ap -= -1607699868;
            client.nh = (short) ak[dy.ap * -38307927];
            if (client.nh <= (short) 0) {
                client.nh = (short) 1;
            }
            client.nf = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nf <= (short) 0) {
                client.nf = Short.MAX_VALUE;
            } else if (client.nf < client.nh) {
                client.nf = client.nh;
            }
            client.ni = (short) ak[(dy.ap * -38307927) + 2];
            if (client.ni <= (short) 0) {
                client.ni = (short) 1;
            }
            client.ny = (short) ak[(dy.ap * -38307927) + 3];
            if (client.ny <= (short) 0) {
                client.ny = Short.MAX_VALUE;
            } else if (client.ny < client.ni) {
                client.ny = client.ni;
            }
            return 1;
        } else if (6203 == i) {
            if (client.is != null) {
                fs.ca(0, 0, 1120250035 * client.is.bu, client.is.bd * -1781667913, false, 1640986378);
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = client.ne * 1889242427;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = 1949695293 * client.nn;
            } else {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
            }
            return 1;
        } else if (i == 6204) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.np;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nr;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nk;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nb;
            return 1;
        }
    }

    static int cx(int i, fs fsVar, boolean z) {
        if (i == 6200) {
            dy.ap -= -803849934;
            client.nk = (short) ak[dy.ap * -38307927];
            if (client.nk <= (short) 0) {
                client.nk = (short) 256;
            }
            client.nb = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nb <= (short) 0) {
                client.nb = (short) 205;
            }
            return 1;
        } else if (6201 == i) {
            dy.ap -= -803849934;
            client.np = (short) ak[dy.ap * -38307927];
            if (client.np <= (short) 0) {
                client.np = (short) 256;
            }
            client.nr = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nr <= (short) 0) {
                client.nr = (short) 320;
            }
            return 1;
        } else if (6202 == i) {
            dy.ap -= -1607699868;
            client.nh = (short) ak[dy.ap * -38307927];
            if (client.nh <= (short) 0) {
                client.nh = (short) 1;
            }
            client.nf = (short) ak[(dy.ap * -38307927) + 1];
            if (client.nf <= (short) 0) {
                client.nf = Short.MAX_VALUE;
            } else if (client.nf < client.nh) {
                client.nf = client.nh;
            }
            client.ni = (short) ak[(dy.ap * -38307927) + 2];
            if (client.ni <= (short) 0) {
                client.ni = (short) 1;
            }
            client.ny = (short) ak[(dy.ap * -38307927) + 3];
            if (client.ny <= (short) 0) {
                client.ny = Short.MAX_VALUE;
            } else if (client.ny < client.ni) {
                client.ny = client.ni;
            }
            return 1;
        } else if (6203 == i) {
            if (client.is != null) {
                fs.ca(0, 0, 1120250035 * client.is.bu, client.is.bd * -1781667913, false, 325987531);
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = client.ne * 1889242427;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = 1949695293 * client.nn;
            } else {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
            }
            return 1;
        } else if (i == 6204) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.np;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nr;
            return 1;
        } else if (i != 6205) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nk;
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = client.nb;
            return 1;
        }
    }

    static int cn(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        if (i == 6600) {
            av.aq(-661536233).ah(-45883118 * lw.hn, ((-751196378 * cx.hb.br) >> 7) + (-357869149 * fz.du), ((cx.hb.bb * -1461980333) >> 7) + (fm.dn * 1195683827), true, 1099585037);
            return 1;
        } else if (6601 == i) {
            r0 = ak;
            r1 = dy.ap - -303313446;
            dy.ap = r1;
            r1 = r0[r1 * 497571205];
            String str = "";
            r1 = av.aq(-1649126386).ab(r1, -1318298472);
            if (r1 != null) {
                str = r1.ax(-2002039527);
            }
            r1 = at;
            r2 = di.ah + 436804489;
            di.ah = r2;
            r1[(r2 * 1894369977) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = ak;
            r1 = dy.ap - -88202403;
            dy.ap = r1;
            av.aq(-1651784237).ai(r0[r1 * -38307927], -1739817389);
            return 1;
        } else if (i == -721100700) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(1905273101).ag(-2031536721);
            return 1;
        } else if (-1721518365 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(1698887647).au(r0[r1 * -38307927], -1874009693);
            return 1;
        } else if (i == 6605) {
            r1 = ak;
            r2 = dy.ap + 1876526033;
            dy.ap = r2;
            r2 = (r2 * 838867676) - 1;
            if (av.aq(1422686711).ad(751360911)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (-610666992 == i) {
            r1 = ak;
            r2 = dy.ap - 127055828;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(1735171805).bp(-486841375 * r0.ac, r0.an * -319106125, -553422060);
            return 1;
        } else if (1435332128 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * 277294508]);
            av.aq(-4482787).bm(r0.ac * -486841375, r0.an * 927342747, (byte) -110);
            return 1;
        } else if (i == 6608) {
            r1 = ak;
            r2 = dy.ap - -813019859;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(-2127986936).bh(r0.aj * 866257447, r0.ac * 836702509, r0.an * -1974196523, -1027016613);
            return 1;
        } else if (i == 6609) {
            r1 = ak;
            r2 = dy.ap - 1655657119;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(-468822389).bt(r0.aj * 1978178253, r0.ac * -291415815, r0.an * -2072262000, 1886631711);
            return 1;
        } else if (1321697882 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(614824646).br(65535);
            r0 = ak;
            r1 = dy.ap - 1663160225;
            dy.ap = r1;
            r0[(r1 * 1470154131) - 1] = av.aq(663911199).bb(1511466706);
            return 1;
        } else if (i == 6611) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(134655029).ab(r1[r2 * -38307927], -43012580);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * 122379945) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.bm(165221643).ac(-1613534330);
            return 1;
        } else if (6612 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(-1857821542).ab(r1[r2 * -927937251], 601402590);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap + 1883174999;
            dy.ap = r2;
            r0[(r2 * -193037838) - 1] = ((r1.ay((byte) -10) - r1.av(1505399302)) + 1) * -555229614;
            r0 = ak;
            r2 = dy.ap + 2005704320;
            dy.ap = r2;
            r0[(r2 * 205188233) - 1] = ((r1.ar(2107928824) - r1.ag((byte) -20)) + 1) * 64;
            return 1;
        } else if (-750560725 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(-762673223).ab(r1[r2 * -1417829443], 1323015707);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 662762328;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * 434158711) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * 1473766981) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.av(838190679) * 690474440;
            r0 = ak;
            r2 = dy.ap + 444736155;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.ag((byte) -20) * 138376372;
            r0 = ak;
            r2 = dy.ap - 2001187435;
            dy.ap = r2;
            r0[(r2 * 512586731) - 1] = ((r1.ay((byte) 6) * 342590091) + 64) - 1;
            r0 = ak;
            r2 = dy.ap - 1421045002;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ar(2103175786) * -2118170295) + 432652144) - 1;
            return 1;
        } else if (77802699 == i) {
            r0 = ak;
            r1 = dy.ap - -968596368;
            dy.ap = r1;
            r0 = av.aq(-476491091).ab(r0[r1 * -38307927], -186250772);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 413395779;
                dy.ap = r1;
                r0[(r1 * -747637321) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 211843316;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.au(895678538);
            return 1;
        } else if (i == -256006544) {
            r0 = av.aq(1275631508).bu((short) 128);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 1060045913;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -2098439203) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = -1598802195 * r0.ac;
            r1 = ak;
            r2 = dy.ap - 109687412;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.an * -1974196523;
            return 1;
        } else if (i == -1222292667) {
            r0 = ak;
            r1 = dy.ap - 296483680;
            dy.ap = r1;
            r0[(r1 * -81515515) - 1] = av.aq(175568139).aw(-170881445);
            return 1;
        } else if (i == 6617) {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            bt btVar = new bt(r2[r3 * 1262711298]);
            df am = av.aq(888889453).am(1402931311);
            if (am == null) {
                r0 = ak;
                r1 = dy.ap + 992599321;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 423415247;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = am.aw(btVar.aj * 1113576410, btVar.ac * 1904055406, btVar.an * -435242125, -871938327);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 221247726;
                dy.ap = r1;
                r0[(r1 * 859945457) - 1] = -1;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 275076363;
            dy.ap = r3;
            r2[(r3 * -38307927) - 1] = r1[0];
            r0 = ak;
            r2 = dy.ap + 1135350325;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1[1];
            return 1;
        } else if (i == 6618) {
            r1 = ak;
            r2 = dy.ap - -1864834352;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -1060877826]);
            r1 = av.aq(96586358).am(1402931311);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -753683374) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 1100060755;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r0 = r1.am(1685877026 * r0.ac, r0.an * -1974196523, 942719539);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 45867104;
                dy.ap = r1;
                r0[(r1 * 1693751817) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac(956646438);
            return 1;
        } else if (2447523 == i) {
            dy.ap -= 1268426019;
            ft.ab(ak[dy.ap * -38307927], new bt(ak[(dy.ap * -38307927) + 1]), false, 1121370233);
            return 1;
        } else if (i == 1974326060) {
            dy.ap -= -803849934;
            ft.ab(ak[dy.ap * 1123854629], new bt(ak[(1970476452 * dy.ap) + 1]), true, 1540675963);
            return 1;
        } else if (i == 6621) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * -38307927];
            bt btVar2 = new bt(ak[(dy.ap * -38307927) + 1]);
            r1 = av.aq(615055079).ab(r1, 1636599070);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -846985306) - 1] = 0;
                return 1;
            }
            int[] iArr = ak;
            int i2 = dy.ap - 846858193;
            dy.ap = i2;
            i2 = (i2 * 957960781) - 1;
            if (r1.ah(btVar2.aj * -975504352, btVar2.ac * 1410806474, btVar2.an * -1974196523, -682807834)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6622) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 1362955516) - 1] = av.aq(-198188846).bd(289962672);
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 745905772) - 1] = av.aq(1628311084).by(178699799);
            return 1;
        } else if (6623 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            r0 = av.aq(-2052946378).at(r0.aj * -201339469, -1779101055 * r0.ac, r0.an * 837495270, 1764778780);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * 558169281) - 1] = r0.as(1563373009);
            return 1;
        } else if (i == 6624) {
            r0 = av.aq(-238655618);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bx(r1[r2 * 1552796566], -1548499237);
            return 1;
        } else if (i == 6625) {
            av.aq(-367494411).bi((byte) 9);
            return 1;
        } else if (i == 6626) {
            r0 = av.aq(492325581);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bs(r1[r2 * -1740706891], (byte) 91);
            return 1;
        } else if (6627 == i) {
            av.aq(-1692977992).bo((byte) -14);
            return 1;
        } else if (-717443814 == i) {
            r1 = ak;
            r2 = dy.ap - -1694356590;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(-2013298629).bz(z2, -881187083);
            return 1;
        } else if (i == -1999576346) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(-1035255161).bq(r0[r1 * -38307927], -1447088882);
            return 1;
        } else if (6630 == i) {
            r0 = ak;
            r1 = dy.ap - -1569536530;
            dy.ap = r1;
            av.aq(1432289976).bj(r0[r1 * -38307927], -1932346340);
            return 1;
        } else if (1701832473 == i) {
            av.aq(839967194).ba(2120989199);
            return 1;
        } else if (i == 974038686) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(-1806122101).bv(z2, 572463345);
            return 1;
        } else if (6633 == i) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * 1173382942];
            if (1 == ak[(dy.ap * -38307927) + 1]) {
                z2 = true;
            }
            av.aq(-1533619027).be(r1, z2, (byte) 2);
            return 1;
        } else if (-303037778 == i) {
            dy.ap -= 2071515702;
            r1 = ak[170977226 * dy.ap];
            if (ak[(-541023384 * dy.ap) + 1] == 1) {
                z2 = true;
            }
            av.aq(112465638).bw(r1, z2, -2093158831);
            return 1;
        } else if (-595097458 == i) {
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r2 = (r2 * -38307927) - 1;
            if (av.aq(358516873).bn(1974280996)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 1151632538) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (av.aq(-1103865486).bg(r1, -1759382864)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (i == 6637) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap - 183946316;
            dy.ap = r3;
            r3 = (r3 * -1101570447) - 1;
            if (av.aq(1744674458).bc(r1, 1809443374)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (2014024094 == i) {
            dy.ap -= -803849934;
            r0 = av.aq(1464491745).bl(ak[dy.ap * 1401525238], new bt(ak[(dy.ap * 2010028648) + 1]), 676759402);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -2123591276) - 1] = r0.ac(534139508);
            return 1;
        } else if (i == 6639) {
            r0 = av.aq(523625663).cy(1108817682);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1710889859) - 1] = -1;
                r0 = ak;
                r1 = dy.ap + 61402097;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = -333429936 * r0.aj;
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac.ac(-1873669399);
            return 1;
        } else if (i == -998094054) {
            r0 = av.aq(-1482409602).cl(-1034767522);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap + 1560208776;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = -1770680877 * r0.aj;
            r1 = ak;
            r2 = dy.ap - 1869886941;
            dy.ap = r2;
            r1[(r2 * -694426647) - 1] = r0.ac.ac(183518744);
            return 1;
        } else if (i == -1715586952) {
            r0 = ak;
            r1 = dy.ap - -820996917;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * 340902649]];
            if (r0.ap == null) {
                String[] strArr = at;
                r1 = di.ah - 1160173021;
                di.ah = r1;
                strArr[(r1 * 1894369977) - 1] = "";
                return 1;
            }
            r1 = at;
            r2 = di.ah - 1956387558;
            di.ah = r2;
            r1[(r2 * 1894369977) - 1] = r0.ap;
            return 1;
        } else if (i == 6694) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * 734089237]];
            r1 = ak;
            r2 = dy.ap + 537590217;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ah * -1804201465;
            return 1;
        } else if (6695 == i) {
            r0 = ak;
            r1 = dy.ap - -1776740156;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -38307927]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 855070654;
                dy.ap = r1;
                r0[(r1 * -1707785328) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ag * 301505376;
            return 1;
        } else if (6696 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -686043273]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 770832519;
                dy.ap = r1;
                r0[(r1 * -608455324) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.aa * -1929435046;
            return 1;
        } else if (-1521846857 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = -556808192 * az.aj;
            return 1;
        } else if (1197613777 == i) {
            r0 = ak;
            r1 = dy.ap + 2139623517;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = az.ac.ac(971086406);
            return 1;
        } else if (6699 != i) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = az.an.ac(269510964);
            return 1;
        }
    }

    static int cw(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        if (i == 6600) {
            av.aq(372115252).ah(-2005147175 * lw.hn, ((1948391561 * cx.hb.br) >> 7) + (-357869149 * fz.du), ((cx.hb.bb * 234621574) >> 7) + (fm.dn * -788050510), true, 66651199);
            return 1;
        } else if (-106617154 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r1 = r0[r1 * -38307927];
            String str = "";
            r1 = av.aq(1108179364).ab(r1, -85616295);
            if (r1 != null) {
                str = r1.ax(-1849877656);
            }
            r1 = at;
            r2 = di.ah + 436804489;
            di.ah = r2;
            r1[(r2 * 68616427) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = ak;
            r1 = dy.ap - -1302654670;
            dy.ap = r1;
            av.aq(-2003066046).ai(r0[r1 * -968881221], -80070758);
            return 1;
        } else if (i == 6603) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(131076364).ag(-2028466722);
            return 1;
        } else if (1684888777 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(433143394).au(r0[r1 * -1150010897], -1843299343);
            return 1;
        } else if (i == 6605) {
            r1 = ak;
            r2 = dy.ap - 1263462583;
            dy.ap = r2;
            r2 = (r2 * -38307927) - 1;
            if (av.aq(1578849873).ad(-2123863258)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (6606 == i) {
            r1 = ak;
            r2 = dy.ap - -653225059;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(174209659).bp(-486841375 * r0.ac, r0.an * -1974196523, -553422060);
            return 1;
        } else if (6607 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * 744527105]);
            av.aq(1702593093).bm(r0.ac * -486841375, r0.an * -887089319, (byte) -20);
            return 1;
        } else if (i == 6608) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(-1195379225).bh(r0.aj * -201339469, r0.ac * 1438894006, r0.an * 1108735390, -1126548856);
            return 1;
        } else if (i == 1670976451) {
            r1 = ak;
            r2 = dy.ap - 1037581761;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -285410657]);
            av.aq(1220919820).bt(r0.aj * -201339469, r0.ac * 462522154, r0.an * -1974196523, 1886631711);
            return 1;
        } else if (6610 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 1999821410) - 1] = av.aq(-902594175).br(65535);
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 1767579037) - 1] = av.aq(1386251193).bb(231697620);
            return 1;
        } else if (i == -703934745) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(1220716465).ab(r1[r2 * -38307927], -2066649405);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 729759215;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.bm(462431010).ac(832153701);
            return 1;
        } else if (138369956 == i) {
            r1 = ak;
            r2 = dy.ap - 1834606400;
            dy.ap = r2;
            r1 = av.aq(146406356).ab(r1[r2 * 984301888], -1786873482);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap + 68818237;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ay((byte) 62) - r1.av(944535824)) + 1) * 64;
            r0 = ak;
            r2 = dy.ap + 1606163005;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ar(2118601970) - r1.ag((byte) -65)) + 1) * 851549297;
            return 1;
        } else if (6613 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(1136940166).ab(r1[r2 * -1601591709], 848441682);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * 88825210) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 461474683;
                dy.ap = r2;
                r1[(r2 * 82162628) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 1486335810;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -1976001494) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.av(1483477744) * -10931415;
            r0 = ak;
            r2 = dy.ap - 999197188;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.ag((byte) -106) * 64;
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -1283347581) - 1] = ((r1.ay((byte) 30) * -708185204) - 496640976) - 1;
            r0 = ak;
            r2 = dy.ap - 2117011092;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ar(2121169539) * 518360437) - 38116969) - 1;
            return 1;
        } else if (-256539126 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = av.aq(448230386).ab(r0[r1 * 1084075460], -520211720);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1952159649) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -1364237277) - 1] = r0.au(701513880);
            return 1;
        } else if (i == -2118991298) {
            r0 = av.aq(-551981380).bu((short) 128);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 1747540231;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap + 2046897811;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = -51498162 * r0.ac;
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * 274666805) - 1] = r0.an * -292711863;
            return 1;
        } else if (i == 6616) {
            r0 = ak;
            r1 = dy.ap - 593472438;
            dy.ap = r1;
            r0[(r1 * 249773673) - 1] = av.aq(2130768443).aw(-922940918);
            return 1;
        } else if (i == 6617) {
            r2 = ak;
            r3 = dy.ap - -2107463547;
            dy.ap = r3;
            bt btVar = new bt(r2[r3 * -38307927]);
            df am = av.aq(759181777).am(1402931311);
            if (am == null) {
                r0 = ak;
                r1 = dy.ap - 213122643;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 122891317) - 1] = -1;
                return 1;
            }
            r1 = am.aw(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -251199133);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1530219285) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 1663904269;
            dy.ap = r3;
            r2[(r3 * 1243368582) - 1] = r1[0];
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1[1];
            return 1;
        } else if (i == 1064888687) {
            r1 = ak;
            r2 = dy.ap - -1859972471;
            dy.ap = r2;
            r0 = new bt(r1[r2 * 1877842603]);
            r1 = av.aq(-1405761018).am(1402931311);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r0 = r1.am(-1237966190 * r0.ac, r0.an * 1436972473, 706042837);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 694932632) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 1196559517;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac(1145707026);
            return 1;
        } else if (-2071812020 == i) {
            dy.ap -= -803849934;
            ft.ab(ak[dy.ap * -38307927], new bt(ak[(412040312 * dy.ap) + 1]), false, 956990471);
            return 1;
        } else if (i == 6620) {
            dy.ap -= -803849934;
            ft.ab(ak[dy.ap * -38307927], new bt(ak[(dy.ap * -38307927) + 1]), true, -1173804407);
            return 1;
        } else if (i == 1816504356) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * 654224208];
            bt btVar2 = new bt(ak[(dy.ap * -547815960) + 1]);
            r1 = av.aq(-1010231021).ab(r1, 902621778);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 478474076;
                dy.ap = r2;
                r1[(r2 * 2146420071) - 1] = 0;
                return 1;
            }
            int[] iArr = ak;
            int i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -945314689) - 1;
            if (r1.ah(btVar2.aj * -201339469, btVar2.ac * -486841375, btVar2.an * -1974196523, -733682415)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == -728396900) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 93063556) - 1] = av.aq(1951376736).bd(1247460438);
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * 1263964218) - 1] = av.aq(-787125324).by(248893372);
            return 1;
        } else if (-196050480 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            r0 = av.aq(658675615).at(r0.aj * -477256349, -486841375 * r0.ac, r0.an * -2146818587, 1766233981);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1916998485) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap + 1016588145;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.as(1965096801);
            return 1;
        } else if (i == 6624) {
            r0 = av.aq(-960988716);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bx(r1[r2 * -38307927], 1157635093);
            return 1;
        } else if (i == 6625) {
            av.aq(1732364533).bi((byte) 69);
            return 1;
        } else if (i == 6626) {
            r0 = av.aq(-1370121579);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bs(r1[r2 * 1928367812], (byte) 67);
            return 1;
        } else if (1261729089 == i) {
            av.aq(700009207).bo((byte) -113);
            return 1;
        } else if (-2001230625 == i) {
            r1 = ak;
            r2 = dy.ap - -61286828;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(1214642987).bz(z2, -1894343280);
            return 1;
        } else if (i == 6629) {
            r0 = ak;
            r1 = dy.ap - -1967480398;
            dy.ap = r1;
            av.aq(-158947783).bq(r0[r1 * 1582628796], -1350440252);
            return 1;
        } else if (6630 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(-2047717655).bj(r0[r1 * 254281396], -2056547972);
            return 1;
        } else if (6631 == i) {
            av.aq(1543680212).ba(1514882821);
            return 1;
        } else if (i == 6632) {
            r1 = ak;
            r2 = dy.ap - 1587684579;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(956133460).bv(z2, 572463345);
            return 1;
        } else if (826401230 == i) {
            dy.ap -= -355168834;
            r1 = ak[dy.ap * -2054202139];
            if (1 == ak[(dy.ap * -966350465) + 1]) {
                z2 = true;
            }
            av.aq(453524989).be(r1, z2, (byte) 2);
            return 1;
        } else if (6634 == i) {
            dy.ap -= 600207787;
            r1 = ak[dy.ap * -38307927];
            if (ak[(dy.ap * -38307927) + 1] == 1) {
                z2 = true;
            }
            av.aq(2082341684).bw(r1, z2, -893795933);
            return 1;
        } else if (6635 == i) {
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r2 = (r2 * -38307927) - 1;
            if (av.aq(-1421068656).bn(1570622287)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 6636) {
            r1 = ak;
            r2 = dy.ap - -1055164275;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * 142909589) - 1;
            if (av.aq(-510253155).bg(r1, -2072655793)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (i == -357658779) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap + 2110916899;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (av.aq(-552293726).bc(r1, 1815309516)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (6638 == i) {
            dy.ap -= 686544366;
            r0 = av.aq(-1776726519).bl(ak[dy.ap * 619752448], new bt(ak[(dy.ap * 1886050066) + 1]), -1080305618);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1644775372) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap + 1746588202;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac(-1245707915);
            return 1;
        } else if (i == 6639) {
            r0 = av.aq(-1499108335).cy(1108817682);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * 1441394005) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 1368102300;
            dy.ap = r2;
            r1[(r2 * 243908138) - 1] = 963317847 * r0.aj;
            r1 = ak;
            r2 = dy.ap + 458395869;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac.ac(1000150129);
            return 1;
        } else if (i == 692141618) {
            r0 = av.aq(-60736416).cl(-1034767522);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -1975973273) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 1481183884;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = 1508240954 * r0.aj;
            r1 = ak;
            r2 = dy.ap - 1382909539;
            dy.ap = r2;
            r1[(r2 * 1114139566) - 1] = r0.ac.ac(-59370970);
            return 1;
        } else if (i == 6693) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -812315746]];
            if (r0.ap == null) {
                String[] strArr = at;
                r1 = di.ah + 436804489;
                di.ah = r1;
                strArr[(r1 * 1894369977) - 1] = "";
                return 1;
            }
            r1 = at;
            r2 = di.ah + 436804489;
            di.ah = r2;
            r1[(r2 * 2019087983) - 1] = r0.ap;
            return 1;
        } else if (i == 6694) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * 486449485]];
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ah * -1070341955;
            return 1;
        } else if (6695 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -1559530673]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap + 348953495;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -1616601929) - 1] = r0.ag * 2013240660;
            return 1;
        } else if (-2080398730 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * 1814477206]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap + 671012996;
            dy.ap = r2;
            r1[(r2 * 90092894) - 1] = r0.aa * 494426499;
            return 1;
        } else if (1685234063 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = 630785959 * az.aj;
            return 1;
        } else if (6698 == i) {
            r0 = ak;
            r1 = dy.ap + 978598870;
            dy.ap = r1;
            r0[(r1 * 2011946677) - 1] = az.ac.ac(45186358);
            return 1;
        } else if (6699 != i) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap + 1356039121;
            dy.ap = r1;
            r0[(r1 * 1354361950) - 1] = az.an.ac(-180286159);
            return 1;
        }
    }

    static int cz(int i, fs fsVar, boolean z) {
        boolean z2 = false;
        if (i == 6600) {
            av.aq(-1447440491).ah(-2005147175 * lw.hn, ((1948391561 * cx.hb.br) >> 7) + (-357869149 * fz.du), ((cx.hb.bb * -1461980333) >> 7) + (fm.dn * 1195683827), true, -977150457);
            return 1;
        } else if (6601 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r1 = r0[r1 * -38307927];
            String str = "";
            r1 = av.aq(-309859648).ab(r1, 1118094932);
            if (r1 != null) {
                str = r1.ax(-1492555391);
            }
            r1 = at;
            r2 = di.ah + 436804489;
            di.ah = r2;
            r1[(r2 * 1894369977) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(-817592949).ai(r0[r1 * -38307927], 2106010255);
            return 1;
        } else if (i == 6603) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(-450982702).ag(-1961531938);
            return 1;
        } else if (6604 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(839748337).au(r0[r1 * -38307927], -1719616138);
            return 1;
        } else if (i == 6605) {
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r2 = (r2 * -38307927) - 1;
            if (av.aq(731809068).ad(-1513278140)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (6606 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(-686743800).bp(-486841375 * r0.ac, r0.an * -1974196523, -553422060);
            return 1;
        } else if (6607 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(513560605).bm(r0.ac * -486841375, r0.an * -1974196523, (byte) 15);
            return 1;
        } else if (i == 6608) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(2082953746).bh(r0.aj * -201339469, r0.ac * -486841375, r0.an * -1974196523, -673222803);
            return 1;
        } else if (i == 6609) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            av.aq(-1733135011).bt(r0.aj * -201339469, r0.ac * -486841375, r0.an * -1974196523, 1886631711);
            return 1;
        } else if (6610 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(2121604195).br(65535);
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(-987089505).bb(-1946830413);
            return 1;
        } else if (i == 6611) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(-1755128210).ab(r1[r2 * -38307927], -168040277);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.bm(1209147766).ac(-1979609614);
            return 1;
        } else if (6612 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(-1957199587).ab(r1[r2 * -38307927], -1939744029);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ay((byte) -12) - r1.av(2039527447)) + 1) * 64;
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ar(2139578811) - r1.ag((byte) -88)) + 1) * 64;
            return 1;
        } else if (6613 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = av.aq(855011801).ab(r1[r2 * -38307927], 1205985100);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.av(1003801683) * 64;
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1.ag((byte) -30) * 64;
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ay((byte) -17) * 64) + 64) - 1;
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = ((r1.ar(2131239910) * 64) + 64) - 1;
            return 1;
        } else if (6614 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = av.aq(552847145).ab(r0[r1 * -38307927], 899542389);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.au(-402155121);
            return 1;
        } else if (i == 6615) {
            r0 = av.aq(422429576).bu((short) 128);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = -486841375 * r0.ac;
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.an * -1974196523;
            return 1;
        } else if (i == 6616) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(300691138).aw(-2009297716);
            return 1;
        } else if (i == 6617) {
            r2 = ak;
            r3 = dy.ap - -401924967;
            dy.ap = r3;
            bt btVar = new bt(r2[r3 * -38307927]);
            df am = av.aq(633974453).am(1402931311);
            if (am == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = am.aw(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1031413613);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r2[(r3 * -38307927) - 1] = r1[0];
            r0 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r0[(r2 * -38307927) - 1] = r1[1];
            return 1;
        } else if (i == 6618) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            r1 = av.aq(-187643876).am(1402931311);
            if (r1 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r0 = r1.am(-486841375 * r0.ac, r0.an * -1974196523, 839046076);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac(824956553);
            return 1;
        } else if (6619 == i) {
            dy.ap -= -803849934;
            ft.ab(ak[dy.ap * -38307927], new bt(ak[(dy.ap * -38307927) + 1]), false, 879367622);
            return 1;
        } else if (i == 6620) {
            dy.ap -= -803849934;
            ft.ab(ak[dy.ap * -38307927], new bt(ak[(dy.ap * -38307927) + 1]), true, 649801212);
            return 1;
        } else if (i == 6621) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * -38307927];
            bt btVar2 = new bt(ak[(dy.ap * -38307927) + 1]);
            r1 = av.aq(2010706166).ab(r1, 969604065);
            if (r1 == null) {
                r1 = ak;
                r2 = dy.ap - 401924967;
                dy.ap = r2;
                r1[(r2 * -38307927) - 1] = 0;
                return 1;
            }
            int[] iArr = ak;
            int i2 = dy.ap - 401924967;
            dy.ap = i2;
            i2 = (i2 * -38307927) - 1;
            if (r1.ah(btVar2.aj * -201339469, btVar2.ac * -486841375, btVar2.an * -1974196523, 1541469642)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6622) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(509298487).bd(961402344);
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = av.aq(-1924903082).by(178573129);
            return 1;
        } else if (6623 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0 = new bt(r1[r2 * -38307927]);
            r0 = av.aq(-1923295384).at(r0.aj * -201339469, -486841375 * r0.ac, r0.an * -1974196523, -601839336);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.as(451097543);
            return 1;
        } else if (i == 6624) {
            r0 = av.aq(-409076644);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bx(r1[r2 * -38307927], -1866587492);
            return 1;
        } else if (i == 6625) {
            av.aq(600545266).bi((byte) 40);
            return 1;
        } else if (i == 6626) {
            r0 = av.aq(-276345051);
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r0.bs(r1[r2 * -38307927], (byte) 75);
            return 1;
        } else if (6627 == i) {
            av.aq(-895397490).bo((byte) -94);
            return 1;
        } else if (6628 == i) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(-1272915090).bz(z2, -752286549);
            return 1;
        } else if (i == 6629) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(-1647971074).bq(r0[r1 * -38307927], -1236020699);
            return 1;
        } else if (6630 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            av.aq(-852886877).bj(r0[r1 * -38307927], -1661660684);
            return 1;
        } else if (6631 == i) {
            av.aq(-1940295010).ba(1471272827);
            return 1;
        } else if (i == 6632) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            if (r1[r2 * -38307927] == 1) {
                z2 = true;
            }
            av.aq(297129456).bv(z2, 572463345);
            return 1;
        } else if (6633 == i) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * -38307927];
            if (1 == ak[(dy.ap * -38307927) + 1]) {
                z2 = true;
            }
            av.aq(1633254130).be(r1, z2, (byte) 2);
            return 1;
        } else if (6634 == i) {
            dy.ap -= -803849934;
            r1 = ak[dy.ap * -38307927];
            if (ak[(dy.ap * -38307927) + 1] == 1) {
                z2 = true;
            }
            av.aq(330105176).bw(r1, z2, -1537046034);
            return 1;
        } else if (6635 == i) {
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r2 = (r2 * -38307927) - 1;
            if (av.aq(-505890760).bn(117712248)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 6636) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (av.aq(-2102151239).bg(r1, -1423686803)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (i == 6637) {
            r1 = ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            r1 = r1[r2 * -38307927];
            r2 = ak;
            r3 = dy.ap - 401924967;
            dy.ap = r3;
            r3 = (r3 * -38307927) - 1;
            if (av.aq(566628599).bc(r1, 1850903822)) {
                z2 = true;
            }
            r2[r3] = z2;
            return 1;
        } else if (6638 == i) {
            dy.ap -= -803849934;
            r0 = av.aq(-260192285).bl(ak[dy.ap * -38307927], new bt(ak[(dy.ap * -38307927) + 1]), 1874970494);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac(885064778);
            return 1;
        } else if (i == 6639) {
            r0 = av.aq(2006680463).cy(1108817682);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = 963317847 * r0.aj;
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac.ac(-435796380);
            return 1;
        } else if (i == 6640) {
            r0 = av.aq(773472938).cl(-1034767522);
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = 963317847 * r0.aj;
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ac.ac(1115115830);
            return 1;
        } else if (i == 6693) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -38307927]];
            if (r0.ap == null) {
                String[] strArr = at;
                r1 = di.ah + 436804489;
                di.ah = r1;
                strArr[(r1 * 1894369977) - 1] = "";
                return 1;
            }
            r1 = at;
            r2 = di.ah + 436804489;
            di.ah = r2;
            r1[(r2 * 1894369977) - 1] = r0.ap;
            return 1;
        } else if (i == 6694) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -38307927]];
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ah * -1070341955;
            return 1;
        } else if (6695 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -38307927]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.ag * 2012207713;
            return 1;
        } else if (6696 == i) {
            r0 = ak;
            r1 = dy.ap - -401924967;
            dy.ap = r1;
            r0 = aa.ac[r0[r1 * -38307927]];
            if (r0 == null) {
                r0 = ak;
                r1 = dy.ap - 401924967;
                dy.ap = r1;
                r0[(r1 * -38307927) - 1] = -1;
                return 1;
            }
            r1 = ak;
            r2 = dy.ap - 401924967;
            dy.ap = r2;
            r1[(r2 * -38307927) - 1] = r0.aa * -776985215;
            return 1;
        } else if (6697 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = 630785959 * az.aj;
            return 1;
        } else if (6698 == i) {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = az.ac.ac(231876002);
            return 1;
        } else if (6699 != i) {
            return 2;
        } else {
            r0 = ak;
            r1 = dy.ap - 401924967;
            dy.ap = r1;
            r0[(r1 * -38307927) - 1] = az.an.ac(772551662);
            return 1;
        }
    }

    static final void cc(String str, boolean z, int i) {
        try {
            int aa = bg.dt.aa(str, 250);
            int ak = bg.dt.ak(str, 250) * 13;
            es aj = client.ac.qc.aj((byte) -111);
            aj.aq(6, 6, (4 + aa) + 4, (ak + 4) + 4, -16777216, (byte) 82);
            aj.fd(6, 6, (4 + aa) + 4, (ak + 4) + 4, -1, (short) -20943);
            bg.dt.am(str, 10, 10, aa, ak, 16777215, -1, 1, 1, 0, aj);
            int i2 = (4 + aa) + 4;
            int i3 = 4 + (ak + 4);
            int i4 = 0;
            while (i4 < -22092319 * client.kd) {
                if (client.kz[i4] + client.kx[i4] > 6 && client.kz[i4] < i2 + 6 && client.km[i4] + client.ky[i4] > 6 && client.km[i4] < i3 + 6) {
                    client.ke[i4] = true;
                }
                i4++;
            }
            if (z) {
                client.ac.qc.ak(0, 0, (byte) 1);
                return;
            }
            i4 = 0;
            while (i4 < client.kd * -22092319) {
                if (client.kz[i4] + client.kx[i4] > 10 && client.kz[i4] < aa + 10 && client.ky[i4] + client.km[i4] > 10 && client.km[i4] < ak + 10) {
                    client.kk[i4] = true;
                }
                i4++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gr.cc(" + ')');
        }
    }

    static void cj(int i) {
        if (-1 != i) {
            if (ku.an(i, 1671262481)) {
                ab[] abVarArr = ab.aa[i];
                for (ab abVar : abVarArr) {
                    if (abVar.du != null) {
                        gd gdVar = new gd();
                        gdVar.an = abVar;
                        gdVar.aj = abVar.du;
                        et.ac(gdVar, ac, -883984442);
                    }
                }
            }
        }
    }

    static void da(int i, bt btVar, boolean z) {
        av.aq(-296617488).al(av.aq(993340102).ab(i, -1078201151), new bt(48755525 * cx.hb.ar, (fz.du * -357869149) + ((1948391561 * cx.hb.br) >> 7), (fm.dn * 1195683827) + ((cx.hb.bb * -1461980333) >> 7)), btVar, z, -1461980333);
    }

    static void di(int i, bt btVar, boolean z) {
        av.aq(-439033670).al(av.aq(-175506592).ab(i, 2116001261), new bt(-1110091604 * cx.hb.ar, (fz.du * 35491101) + ((1948391561 * cx.hb.br) >> 7), (fm.dn * 1195683827) + ((287037177 * cx.hb.bb) >> 7)), btVar, z, -1461980333);
    }

    static void dw(int i, bt btVar, boolean z) {
        av.aq(-1214030788).al(av.aq(-1626813786).ab(i, 1160005932), new bt(48755525 * cx.hb.ar, (fz.du * -357869149) + ((1948391561 * cx.hb.br) >> 7), (fm.dn * 1195683827) + ((cx.hb.bb * -1461980333) >> 7)), btVar, z, -1461980333);
    }
}
