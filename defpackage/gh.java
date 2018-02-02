package defpackage;

import java.net.URL;

public class gh {
    static int aa = 0;
    static final int ac = 2;
    static kt ah = null;
    static final int aj = 3;
    static int ak = 0;
    static final int an = 1;
    static gh[] ao;
    static int[] ap = new int[]{1, 1, 1, 1};
    static byte[][][] aq;
    static int[] at = new int[]{0, 1, 2, 3};
    String ae;
    int ai;
    int al;
    int am;
    String as;
    int aw;
    int az;

    gh() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "gh.<init>(" + ')');
        }
    }

    static boolean ae() {
        try {
            if (ah == null) {
                ah = bi.dw.aj(new URL(fr.aw), -1257912290);
            } else if (ah.ac(-1598530766)) {
                he heVar = new he(ah.an(417523339));
                heVar.ad((byte) -111);
                aa = heVar.ay((byte) 1) * -1887434015;
                ao = new gh[(aa * 518175009)];
                for (int i = 0; i < aa * 518175009; i++) {
                    gh[] ghVarArr = ao;
                    gh ghVar = new gh();
                    ghVarArr[i] = ghVar;
                    ghVar.ai = heVar.ay((byte) 1) * -923170115;
                    ghVar.aw = heVar.ad((byte) -60) * 1805388187;
                    ghVar.ae = heVar.bh(266816245);
                    ghVar.as = heVar.bh(740708651);
                    ghVar.al = heVar.au(-310118664) * 933573757;
                    ghVar.am = heVar.ag((byte) -1) * 745656649;
                    ghVar.az = 322962713 * i;
                }
                bc.an(ao, 0, ao.length - 1, at, ap, -1882309612);
                ah = null;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ah = null;
        }
        return false;
    }

    static boolean al() {
        try {
            if (ah == null) {
                ah = bi.dw.aj(new URL(fr.aw), -1235299176);
            } else if (ah.ac(1030573312)) {
                he heVar = new he(ah.an(417523339));
                heVar.ad((byte) -46);
                aa = heVar.ay((byte) 1) * -1887434015;
                ao = new gh[(aa * 518175009)];
                for (int i = 0; i < aa * 518175009; i++) {
                    gh[] ghVarArr = ao;
                    gh ghVar = new gh();
                    ghVarArr[i] = ghVar;
                    ghVar.ai = heVar.ay((byte) 1) * 1689083656;
                    ghVar.aw = heVar.ad((byte) -99) * -241787894;
                    ghVar.ae = heVar.bh(-271147671);
                    ghVar.as = heVar.bh(-1879125792);
                    ghVar.al = heVar.au(-310118664) * 933573757;
                    ghVar.am = heVar.ag((byte) -1) * 1220104397;
                    ghVar.az = 322962713 * i;
                }
                bc.an(ao, 0, ao.length - 1, at, ap, -1945086702);
                ah = null;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ah = null;
        }
        return false;
    }

    static boolean as() {
        try {
            if (ah == null) {
                ah = bi.dw.aj(new URL(fr.aw), 1012633336);
            } else if (ah.ac(30485746)) {
                he heVar = new he(ah.an(417523339));
                heVar.ad((byte) -10);
                aa = heVar.ay((byte) 1) * -1887434015;
                ao = new gh[(aa * 518175009)];
                for (int i = 0; i < aa * 518175009; i++) {
                    gh[] ghVarArr = ao;
                    gh ghVar = new gh();
                    ghVarArr[i] = ghVar;
                    ghVar.ai = heVar.ay((byte) 1) * -923170115;
                    ghVar.aw = heVar.ad((byte) -28) * 1805388187;
                    ghVar.ae = heVar.bh(-1293530576);
                    ghVar.as = heVar.bh(-983769660);
                    ghVar.al = heVar.au(-310118664) * 933573757;
                    ghVar.am = heVar.ag((byte) -1) * 745656649;
                    ghVar.az = 322962713 * i;
                }
                bc.an(ao, 0, ao.length - 1, at, ap, -1630421685);
                ah = null;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ah = null;
        }
        return false;
    }

    static void ax(int i, int i2) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        iArr[0] = i;
        iArr2[0] = i2;
        int i3 = 1;
        for (int i4 = 0; i4 < 4; i4++) {
            if (at[i4] != i) {
                iArr[i3] = at[i4];
                iArr2[i3] = ap[i4];
                i3++;
            }
        }
        at = iArr;
        ap = iArr2;
        bc.an(ao, 0, ao.length - 1, at, ap, -2095691099);
    }

    static void az(int i, int i2) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        iArr[0] = i;
        iArr2[0] = i2;
        int i3 = 1;
        for (int i4 = 0; i4 < 4; i4++) {
            if (at[i4] != i) {
                iArr[i3] = at[i4];
                iArr2[i3] = ap[i4];
                i3++;
            }
        }
        at = iArr;
        ap = iArr2;
        bc.an(ao, 0, ao.length - 1, at, ap, -1558206139);
    }

    static void af(gh[] ghVarArr, int i, int i2, int[] iArr, int[] iArr2) {
        if (i < i2) {
            int i3 = i - 1;
            int i4 = i2 + 1;
            int i5 = (i2 + i) / 2;
            gh ghVar = ghVarArr[i5];
            ghVarArr[i5] = ghVarArr[i];
            ghVarArr[i] = ghVar;
            while (i3 < i4) {
                int i6;
                int i7;
                Object obj = 1;
                do {
                    i4--;
                    i6 = 0;
                    while (i6 < 4) {
                        int i8;
                        if (2 == iArr[i6]) {
                            i8 = 309226031 * ghVarArr[i4].az;
                            i7 = 1399293737 * ghVar.az;
                        } else if (iArr[i6] == 1) {
                            i7 = -450911786 * ghVarArr[i4].am;
                            i8 = 1480006434 * ghVar.am;
                            if (i7 == -1 && iArr2[i6] == 1) {
                                i7 = -1055306112;
                            }
                            if (i8 == -1 && 1 == iArr2[i6]) {
                                i8 = i7;
                                i7 = 2001;
                            } else {
                                int i9 = i8;
                                i8 = i7;
                                i7 = i9;
                            }
                        } else if (iArr[i6] == 3) {
                            if (ghVarArr[i4].ap(2009858946)) {
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                            if (ghVar.ap(1296065544)) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                        } else {
                            i8 = 1057964181 * ghVarArr[i4].ai;
                            i7 = 1057964181 * ghVar.ai;
                        }
                        if (i8 == i7) {
                            if (i6 == 3) {
                                obj = null;
                            }
                            i6++;
                        } else if ((1 != iArr2[i6] || i8 <= i7) && (iArr2[i6] != 0 || i8 >= i7)) {
                            obj = null;
                            continue;
                        }
                    }
                } while (obj != null);
                obj = 1;
                do {
                    i3++;
                    i6 = 0;
                    Object obj2 = obj;
                    while (i6 < 4) {
                        if (2 == iArr[i6]) {
                            i5 = ghVarArr[i3].az * 148118882;
                            i7 = ghVar.az * 1399293737;
                        } else if (1 == iArr[i6]) {
                            i5 = ghVarArr[i3].am * -885484852;
                            i7 = ghVar.am * 1065471515;
                            if (i5 == -1 && 1 == iArr2[i6]) {
                                i5 = 849824353;
                            }
                            if (-1 == i7 && 1 == iArr2[i6]) {
                                i7 = -180740788;
                            }
                        } else if (iArr[i6] == 3) {
                            i5 = ghVarArr[i3].ap(1536170994) ? 1 : 0;
                            i7 = ghVar.ap(1731365146) ? 1 : 0;
                        } else {
                            i5 = -140868265 * ghVarArr[i3].ai;
                            i7 = -1013666221 * ghVar.ai;
                        }
                        if (i7 == i5) {
                            if (3 == i6) {
                                obj = null;
                            } else {
                                obj = obj2;
                            }
                            i6++;
                            obj2 = obj;
                        } else if (iArr2[i6] == 1 && i5 < i7) {
                            obj = obj2;
                            continue;
                        } else if (iArr2[i6] != 0 || i5 <= i7) {
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
                if (i3 < i4) {
                    gh ghVar2 = ghVarArr[i3];
                    ghVarArr[i3] = ghVarArr[i4];
                    ghVarArr[i4] = ghVar2;
                }
            }
            bc.an(ghVarArr, i, i4, iArr, iArr2, -1174854986);
            bc.an(ghVarArr, i4 + 1, i2, iArr, iArr2, -1600355233);
        }
    }

    static void au(gh[] ghVarArr, int i, int i2, int[] iArr, int[] iArr2) {
        if (i < i2) {
            int i3 = i - 1;
            int i4 = i2 + 1;
            int i5 = (i2 + i) / 2;
            gh ghVar = ghVarArr[i5];
            ghVarArr[i5] = ghVarArr[i];
            ghVarArr[i] = ghVar;
            while (i3 < i4) {
                int i6;
                int i7;
                int i8;
                Object obj = 1;
                do {
                    i4--;
                    i6 = 0;
                    while (i6 < 4) {
                        if (2 == iArr[i6]) {
                            i7 = ghVarArr[i4].az * 1399293737;
                            i8 = 1399293737 * ghVar.az;
                        } else if (iArr[i6] == 1) {
                            i7 = 794816761 * ghVarArr[i4].am;
                            i8 = 794816761 * ghVar.am;
                            if (i7 == -1 && iArr2[i6] == 1) {
                                i7 = 2001;
                            }
                            if (i8 == -1 && 1 == iArr2[i6]) {
                                i8 = 2001;
                            }
                        } else if (iArr[i6] == 3) {
                            if (ghVarArr[i4].ap(1576422822)) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            i8 = ghVar.ap(1305994280) ? 1 : 0;
                        } else {
                            i7 = ghVarArr[i4].ai * 1057964181;
                            i8 = 1057964181 * ghVar.ai;
                        }
                        if (i7 == i8) {
                            if (i6 == 3) {
                                obj = null;
                            }
                            i6++;
                        } else if ((1 != iArr2[i6] || i7 <= i8) && (iArr2[i6] != 0 || i7 >= i8)) {
                            obj = null;
                            continue;
                        }
                    }
                } while (obj != null);
                obj = 1;
                i7 = i3;
                do {
                    i7++;
                    i6 = 0;
                    Object obj2 = obj;
                    while (i6 < 4) {
                        if (2 == iArr[i6]) {
                            i5 = ghVarArr[i7].az * 1399293737;
                            i8 = ghVar.az * 1399293737;
                        } else if (1 == iArr[i6]) {
                            i5 = ghVarArr[i7].am * 794816761;
                            i8 = ghVar.am * 794816761;
                            if (i5 == -1 && 1 == iArr2[i6]) {
                                i5 = 2001;
                            }
                            if (-1 == i8 && 1 == iArr2[i6]) {
                                i8 = 2001;
                            }
                        } else if (iArr[i6] == 3) {
                            if (ghVarArr[i7].ap(1485509929)) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            i8 = ghVar.ap(1744519530) ? 1 : 0;
                        } else {
                            i5 = 1057964181 * ghVarArr[i7].ai;
                            i8 = 1057964181 * ghVar.ai;
                        }
                        if (i8 == i5) {
                            if (3 == i6) {
                                obj = null;
                            } else {
                                obj = obj2;
                            }
                            i6++;
                            obj2 = obj;
                        } else if (iArr2[i6] == 1 && i5 < i8) {
                            obj = obj2;
                            continue;
                        } else if (iArr2[i6] != 0 || i5 <= i8) {
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
                if (i7 < i4) {
                    gh ghVar2 = ghVarArr[i7];
                    ghVarArr[i7] = ghVarArr[i4];
                    ghVarArr[i4] = ghVar2;
                }
                i3 = i7;
            }
            bc.an(ghVarArr, i, i4, iArr, iArr2, -1619477654);
            bc.an(ghVarArr, i4 + 1, i2, iArr, iArr2, -1950005327);
        }
    }

    static void av(int i, boolean z, int i2, boolean z2) {
        if (ao != null) {
            br.ao(0, ao.length - 1, i, z, i2, z2, (byte) 93);
        }
    }

    static void ay(int i, boolean z, int i2, boolean z2) {
        if (ao != null) {
            br.ao(0, ao.length - 1, i, z, i2, z2, (byte) 86);
        }
    }

    static void ad(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int i5 = (i + i2) / 2;
            gh ghVar = ao[i5];
            ao[i5] = ao[i2];
            ao[i2] = ghVar;
            int i6 = i;
            int i7 = i;
            while (i6 < i2) {
                gh ghVar2 = ao[i6];
                i5 = cl.aa(ghVar2, ghVar, i3, z, (byte) -26);
                if (i5 != 0) {
                    if (z) {
                        i5 = -i5;
                    }
                } else if (i4 == -1) {
                    i5 = 0;
                } else {
                    i5 = cl.aa(ghVar2, ghVar, i4, z2, (byte) 96);
                    if (z2) {
                        i5 = -i5;
                    }
                }
                if (i5 <= 0) {
                    ghVar2 = ao[i6];
                    ao[i6] = ao[i7];
                    i5 = i7 + 1;
                    ao[i7] = ghVar2;
                } else {
                    i5 = i7;
                }
                i6++;
                i7 = i5;
            }
            ao[i2] = ao[i7];
            ao[i7] = ghVar;
            br.ao(i, i7 - 1, i3, z, i4, z2, (byte) 14);
            br.ao(i7 + 1, i2, i3, z, i4, z2, (byte) 91);
        }
    }

    static void ag(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int i5 = (i + i2) / 2;
            gh ghVar = ao[i5];
            ao[i5] = ao[i2];
            ao[i2] = ghVar;
            int i6 = i;
            int i7 = i;
            while (i6 < i2) {
                gh ghVar2 = ao[i6];
                i5 = cl.aa(ghVar2, ghVar, i3, z, (byte) 11);
                if (i5 != 0) {
                    if (z) {
                        i5 = -i5;
                    }
                } else if (i4 == -1) {
                    i5 = 0;
                } else {
                    i5 = cl.aa(ghVar2, ghVar, i4, z2, (byte) 63);
                    if (z2) {
                        i5 = -i5;
                    }
                }
                if (i5 <= 0) {
                    ghVar2 = ao[i6];
                    ao[i6] = ao[i7];
                    i5 = i7 + 1;
                    ao[i7] = ghVar2;
                } else {
                    i5 = i7;
                }
                i6++;
                i7 = i5;
            }
            ao[i2] = ao[i7];
            ao[i7] = ghVar;
            br.ao(i, i7 - 1, i3, z, i4, z2, (byte) 28);
            br.ao(i7 + 1, i2, i3, z, i4, z2, (byte) 67);
        }
    }

    static void ar(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int i5 = (i + i2) / 2;
            gh ghVar = ao[i5];
            ao[i5] = ao[i2];
            ao[i2] = ghVar;
            int i6 = i;
            int i7 = i;
            while (i6 < i2) {
                gh ghVar2 = ao[i6];
                i5 = cl.aa(ghVar2, ghVar, i3, z, (byte) 61);
                if (i5 != 0) {
                    if (z) {
                        i5 = -i5;
                    }
                } else if (i4 == -1) {
                    i5 = 0;
                } else {
                    i5 = cl.aa(ghVar2, ghVar, i4, z2, (byte) 17);
                    if (z2) {
                        i5 = -i5;
                    }
                }
                if (i5 <= 0) {
                    ghVar2 = ao[i6];
                    ao[i6] = ao[i7];
                    i5 = i7 + 1;
                    ao[i7] = ghVar2;
                } else {
                    i5 = i7;
                }
                i6++;
                i7 = i5;
            }
            ao[i2] = ao[i7];
            ao[i7] = ghVar;
            br.ao(i, i7 - 1, i3, z, i4, z2, (byte) 109);
            br.ao(i7 + 1, i2, i3, z, i4, z2, (byte) 90);
        }
    }

    static int ab(gh ghVar, gh ghVar2, int i, boolean z) {
        int i2 = 1;
        int i3 = -1;
        if (1 == i) {
            int i4 = ghVar.am * -1500596056;
            i2 = ghVar2.am * 435381893;
            if (!z) {
                if (i4 == -1) {
                    i4 = 315807825;
                }
                if (i2 == -1) {
                    i3 = -914013365;
                    i2 = i4;
                    return i2 - i3;
                }
            }
            i3 = i2;
            i2 = i4;
            return i2 - i3;
        } else if (i == 2) {
            return (ghVar.al * 700245205) - (ghVar2.al * 1992984552);
        } else {
            if (3 == i) {
                if (ghVar.as.equals("-")) {
                    if (ghVar2.as.equals("-")) {
                        return 0;
                    }
                    if (!z) {
                        i3 = 1;
                    }
                    return i3;
                } else if (!ghVar2.as.equals("-")) {
                    return ghVar.as.compareTo(ghVar2.as);
                } else {
                    if (z) {
                        i3 = 1;
                    }
                    return i3;
                }
            } else if (4 == i) {
                if (!ghVar.ai(-1349737151)) {
                    i2 = ghVar2.ai(-1632447431) ? -1 : 0;
                } else if (ghVar2.ai(-1521192181)) {
                    i2 = 0;
                }
                return i2;
            } else if (5 == i) {
                if (ghVar.at((byte) 109)) {
                    if (ghVar2.at((byte) 59)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.at((byte) 17)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (6 == i) {
                if (ghVar.ah(-251402932)) {
                    if (ghVar2.ah(-152754928)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.ah(360170267)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (7 != i) {
                return (ghVar.ai * 1057964181) - (-277820218 * ghVar2.ai);
            } else {
                if (ghVar.ap(1512910318)) {
                    if (ghVar2.ap(1585592353)) {
                        return 0;
                    }
                    return 1;
                } else if (ghVar2.ap(1770509405)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    static gh bp() {
        ak = 0;
        if (ak * 1963634435 >= aa * 518175009) {
            return null;
        }
        gh[] ghVarArr = ao;
        int i = ak - 517295189;
        ak = i;
        return ghVarArr[(i * 1963634435) - 1];
    }

    boolean ap(int i) {
        try {
            return ((this.aw * -687262573) & 1) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.ap(" + ')');
        }
    }

    boolean bh() {
        return ((this.aw * -687262573) & 1) != 0;
    }

    boolean bm() {
        return ((this.aw * -687262573) & 1) != 0;
    }

    boolean bt() {
        return ((this.aw * -687262573) & 1) != 0;
    }

    boolean at(byte b) {
        try {
            return ((-687262573 * this.aw) & 2) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.at(" + ')');
        }
    }

    boolean br() {
        return ((-687262573 * this.aw) & 2) != 0;
    }

    boolean ah(int i) {
        try {
            return ((-687262573 * this.aw) & 4) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.ah(" + ')');
        }
    }

    boolean bb() {
        return ((-687262573 * this.aw) & 4) != 0;
    }

    boolean ai(int i) {
        try {
            return ((-687262573 * this.aw) & 8) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.ai(" + ')');
        }
    }

    boolean bd() {
        return ((989698007 * this.aw) & 8) != 0;
    }

    boolean bu() {
        return ((-687262573 * this.aw) & 8) != 0;
    }

    boolean by() {
        return ((-687262573 * this.aw) & 8) != 0;
    }

    boolean aw(int i) {
        try {
            return (dd.ak & (this.aw * -687262573)) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.aw(" + ')');
        }
    }

    boolean bi() {
        return (dd.ak & (this.aw * -687262573)) != 0;
    }

    boolean bs() {
        return (dd.ak & (this.aw * -687262573)) != 0;
    }

    boolean bx() {
        return (dd.ak & (this.aw * -687262573)) != 0;
    }

    boolean am(int i) {
        try {
            return (mu.aa & (this.aw * -687262573)) != 0;
        } catch (Throwable e) {
            throw ei.ac(e, "gh.am(" + ')');
        }
    }

    boolean bo() {
        return (-1327967839 & (this.aw * -1971742103)) != 0;
    }

    boolean bq() {
        return (mu.aa & (this.aw * -687262573)) != 0;
    }

    boolean bz() {
        return (mu.aa & (this.aw * -687262573)) != 0;
    }

    static int aq(int i, fs fsVar, boolean z, int i2) {
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = gr.ak;
                int i3 = dy.ap - -401924967;
                dy.ap = i3;
                i3 = iArr[i3 * -38307927];
                int i4 = i3;
                ab aj = ac.aj(i3, 322702642);
            } catch (Throwable e) {
                throw ei.ac(e, "gh.aq(" + ')');
            }
        }
        aj = z ? client.ae : ef.am;
        i4 = -1;
        if (i == 1000) {
            dy.ap -= -1607699868;
            aj.bp = 1673110939 * gr.ak[dy.ap * -38307927];
            aj.bm = -1642095603 * gr.ak[(dy.ap * -38307927) + 1];
            aj.ag = -391569189 * gr.ak[(dy.ap * -38307927) + 2];
            aj.ar = gr.ak[(dy.ap * -38307927) + 3] * -1982277285;
            cf.ew(aj, (byte) -16);
            client.ac.ep(aj, -40199228);
            if (i4 == -1 || aj.au * -1999477681 != 0) {
                return 1;
            }
            cu.ej(ab.aa[i4 >> 16], aj, false, (byte) -119);
            return 1;
        } else if (1001 == i) {
            dy.ap -= -1607699868;
            aj.bh = gr.ak[dy.ap * -38307927] * 897710629;
            aj.bt = gr.ak[(dy.ap * -38307927) + 1] * -325228835;
            aj.ad = gr.ak[(dy.ap * -38307927) + 2] * -1163506197;
            aj.ab = 412796549 * gr.ak[(dy.ap * -38307927) + 3];
            cf.ew(aj, (byte) -108);
            client.ac.ep(aj, 274478890);
            if (i4 == -1 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i4 >> 16], aj, false, (byte) -117);
            return 1;
        } else if (i == 1003) {
            boolean z3;
            iArr = gr.ak;
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
            cf.ew(aj, (byte) -21);
            return 1;
        } else if (1005 == i) {
            iArr = gr.ak;
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
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.fg = z2;
            return 1;
        }
    }

    static int al(int i, fs fsVar, boolean z, int i2) {
        try {
            int[] iArr = gr.ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            ab aj = ac.aj(iArr[i3 * -38307927], -302751477);
            int[] iArr2;
            int i4;
            if (i == 2800) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = fj.an(at.ft(aj, 1588397356), 1801828522);
                return 1;
            } else if (2801 == i) {
                iArr2 = gr.ak;
                i4 = dy.ap - -401924967;
                dy.ap = i4;
                i3 = iArr2[i4 * -38307927] - 1;
                if (aj.dv == null || i3 >= aj.dv.length || aj.dv[i3] == null) {
                    r1 = gr.at;
                    i3 = di.ah + 436804489;
                    di.ah = i3;
                    r1[(i3 * 1894369977) - 1] = "";
                    return 1;
                }
                String[] strArr = gr.at;
                int i5 = di.ah + 436804489;
                di.ah = i5;
                strArr[(i5 * 1894369977) - 1] = aj.dv[i3];
                return 1;
            } else if (i != 2802) {
                return 2;
            } else {
                if (aj.dw == null) {
                    r1 = gr.at;
                    i3 = di.ah + 436804489;
                    di.ah = i3;
                    r1[(i3 * 1894369977) - 1] = "";
                    return 1;
                }
                String[] strArr2 = gr.at;
                i4 = di.ah + 436804489;
                di.ah = i4;
                strArr2[(i4 * 1894369977) - 1] = aj.dw;
                return 1;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gh.al(" + ')');
        }
    }
}
