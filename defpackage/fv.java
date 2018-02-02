package defpackage;

import java.util.LinkedHashMap;

public class fv {
    static final fv aa = new fv(1);
    static final fv ac = new fv(2);
    static final fv aj = new fv(3);
    static final fv ak = new fv(0);
    static final fv an = new fv(7);
    static final fv ao = new fv(5);
    static final fv ap = new fv(6);
    static final fv aq = new fv(4);
    public static final int by = 41;
    static final int ca = 106;
    final int at;

    fv(int i) {
        try {
            this.at = -1066600925 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "fv.<init>(" + ')');
        }
    }

    static final byte[] bm(byte[] bArr, int i) {
        try {
            he heVar = new he(bArr);
            int au = heVar.au(-310118664);
            int ad = heVar.ad((byte) -77);
            if (ad < 0 || (ju.az * 1533164983 != 0 && ad > ju.az * 1533164983)) {
                throw new RuntimeException();
            } else if (au == 0) {
                r0 = new byte[ad];
                heVar.br(r0, 0, ad, 939754528);
                return r0;
            } else {
                int ad2 = heVar.ad((byte) -8);
                if (ad2 < 0 || (ju.az * 1533164983 != 0 && ad2 > ju.az * 1533164983)) {
                    throw new RuntimeException();
                }
                r0 = new byte[ad2];
                if (1 == au) {
                    hk.aj(r0, ad2, bArr, ad, 9);
                    return r0;
                }
                ju.am.aj(heVar, r0, -929628999);
                return r0;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fv.bm(" + ')');
        }
    }

    static final void bt(boolean z, int i) {
        int i2 = 0;
        if (z) {
            try {
                client.cq = fw.ci ? ky.ac : ky.aq;
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "fv.bt(" + ')');
            }
        }
        ky kyVar;
        LinkedHashMap linkedHashMap = ae.nv.ap;
        CharSequence charSequence = fw.cy;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            i3 = ((i3 << 5) - i3) + charSequence.charAt(i2);
            i2++;
        }
        if (linkedHashMap.containsKey(Integer.valueOf(i3))) {
            kyVar = ky.aj;
        } else {
            kyVar = ky.an;
        }
        client.cq = kyVar;
    }

    static final void ce(int i, int i2, int i3, int i4, byte b) {
        try {
            int i5;
            es aj = client.ac.qc.aj((byte) -74);
            client.gh = 0;
            Object obj = null;
            int i6 = -1;
            int i7 = -2089377233 * fu.aa;
            int[] iArr = fu.ak;
            int i8 = 0;
            while (i8 < (1886016257 * client.dk) + i7) {
                Object obj2;
                fx fxVar;
                if (i8 < i7) {
                    fxVar = client.hx[iArr[i8]];
                    if (iArr[i8] == client.hd * 1526241327) {
                        obj2 = 1;
                        i5 = i8;
                    }
                    ba.ck(fxVar, i8, i, i2, i3, i4, (byte) 0);
                    i5 = i6;
                    obj2 = obj;
                } else {
                    fxVar = client.cj[client.dh[i8 - i7]];
                    ba.ck(fxVar, i8, i, i2, i3, i4, (byte) 0);
                    i5 = i6;
                    obj2 = obj;
                }
                i8++;
                i6 = i5;
                obj = obj2;
            }
            if (obj != null) {
                ba.ck(client.hx[client.hd * 1526241327], i6, i, i2, i3, i4, (byte) 0);
            }
            for (int i9 = 0; i9 < client.gh * -175332337; i9++) {
                int i10 = client.gb[i9];
                int i11 = client.ga[i9];
                int i12 = client.gk[i9];
                int i13 = client.gu[i9];
                Object obj3 = 1;
                while (obj3 != null) {
                    obj3 = null;
                    i8 = i11;
                    i11 = 0;
                    while (i11 < i9) {
                        if (i8 + 2 > client.ga[i11] - client.gu[i11] && i8 - i13 < client.ga[i11] + 2 && i10 - i12 < client.gb[i11] + client.gk[i11] && i10 + i12 > client.gb[i11] - client.gk[i11] && client.ga[i11] - client.gu[i11] < i8) {
                            i8 = client.ga[i11] - client.gu[i11];
                            obj3 = 1;
                        }
                        i11++;
                    }
                    i11 = i8;
                }
                client.gz = client.gb[i9] * -271960645;
                client.ga[i9] = i11;
                client.gp = 995736643 * i11;
                String str = client.gw[i9];
                if (1804490401 * client.ib == 0) {
                    i12 = 16776960;
                    if (client.gd[i9] < 6) {
                        i12 = client.kj[client.gd[i9]];
                    }
                    if (client.gd[i9] == 6) {
                        if ((client.gx * -2113422841) % 20 < 10) {
                            i5 = 16711680;
                        } else {
                            i5 = 16776960;
                        }
                        i12 = i5;
                    }
                    if (client.gd[i9] == 7) {
                        if ((-2113422841 * client.gx) % 20 < 10) {
                            i5 = 255;
                        } else {
                            i5 = 65535;
                        }
                        i12 = i5;
                    }
                    if (client.gd[i9] == 8) {
                        if ((client.gx * -2113422841) % 20 < 10) {
                            i5 = 45056;
                        } else {
                            i5 = 8454016;
                        }
                        i12 = i5;
                    }
                    if (9 == client.gd[i9]) {
                        i5 = 150 - client.ge[i9];
                        if (i5 < 50) {
                            i12 = (i5 * 1280) + 16711680;
                        } else if (i5 < 100) {
                            i12 = 16776960 - ((i5 - 50) * 327680);
                        } else if (i5 < 150) {
                            i12 = ((i5 - 100) * 5) + 65280;
                        }
                    }
                    if (client.gd[i9] == 10) {
                        i5 = 150 - client.ge[i9];
                        if (i5 < 50) {
                            i12 = (i5 * 5) + 16711680;
                        } else if (i5 < 100) {
                            i12 = 16711935 - ((i5 - 50) * 327680);
                        } else if (i5 < 150) {
                            i12 = ((327680 * (i5 - 100)) + 255) - ((i5 - 100) * 5);
                        }
                    }
                    if (client.gd[i9] == 11) {
                        i5 = 150 - client.ge[i9];
                        if (i5 < 50) {
                            i12 = 16777215 - (i5 * 327685);
                        } else if (i5 < 100) {
                            i12 = ((i5 - 50) * 327685) + 65280;
                        } else if (i5 < 150) {
                            i12 = 16777215 - ((i5 - 100) * 327680);
                        }
                    }
                    if (client.gt[i9] == 0) {
                        be.do.aw(str, (-1676064909 * client.gz) + i, (1657499755 * client.gp) + i2, i12, 0, aj);
                    }
                    if (1 == client.gt[i9]) {
                        be.do.ae(str, (client.gz * -1676064909) + i, (client.gp * 1657499755) + i2, i12, 0, client.gx * -2113422841, aj);
                    }
                    if (client.gt[i9] == 2) {
                        be.do.as(str, (-1676064909 * client.gz) + i, (1657499755 * client.gp) + i2, i12, 0, -2113422841 * client.gx, aj);
                    }
                    if (3 == client.gt[i9]) {
                        be.do.al(str, (-1676064909 * client.gz) + i, (1657499755 * client.gp) + i2, i12, 0, -2113422841 * client.gx, 150 - client.ge[i9], aj);
                    }
                    if (4 == client.gt[i9]) {
                        i11 = ((150 - client.ge[i9]) * (be.do.aq(str) + 100)) / 150;
                        aj.fi(((client.gz * -1676064909) + i) - 50, i2, ((-1676064909 * client.gz) + i) + 50, i2 + i4, (byte) 1);
                        be.do.at(str, (((-1676064909 * client.gz) + i) + 50) - i11, (1657499755 * client.gp) + i2, i12, 0, aj);
                        aj.fj(i, i2, i3 + i, i4 + i2, -1893981454);
                    }
                    if (client.gt[i9] == 5) {
                        i11 = 150 - client.ge[i9];
                        if (i11 < 25) {
                            i10 = i11 - 25;
                        } else if (i11 > 125) {
                            i10 = i11 - 125;
                        } else {
                            i10 = 0;
                        }
                        aj.fi(i, (((client.gp * 1657499755) + i2) - be.do.ak) - 1, i + i3, ((client.gp * 1657499755) + i2) + 5, (byte) 95);
                        be.do.aw(str, (client.gz * -1676064909) + i, i10 + ((1657499755 * client.gp) + i2), i12, 0, aj);
                        aj.fj(i, i2, i3 + i, i4 + i2, -684522201);
                    }
                } else {
                    be.do.aw(str, (-1676064909 * client.gz) + i, (1657499755 * client.gp) + i2, 16776960, 0, aj);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fv.ce(" + ')');
        }
    }
}
