package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;

public class jg {
    public static jb aa = new jb(32);
    public static int ac = 0;
    static CRC32 af = new CRC32();
    public static int ag = 0;
    public static int ah = 0;
    public static jb ai = new jb(bg.aw);
    public static lo aj = null;
    public static int ak = 0;
    public static he al = null;
    static boolean am = false;
    public static long an = 0;
    public static int ao = 0;
    public static jy ap = new jy();
    public static jb aq = new jb(bg.aw);
    public static int ar = 0;
    public static he as = new he(8);
    public static jb at = new jb(bg.aw);
    static jn[] av = new jn[bq.ah];
    public static int aw = 0;
    static final int ax = 512;
    public static byte ay = (byte) 0;
    public static int az = 0;

    public static boolean aj(String str, int i, int i2) {
        try {
            return cx.ac(str, i, "openjs", (byte) 0);
        } catch (Throwable e) {
            throw ei.ac(e, "jg.aj(" + ')');
        }
    }

    static int aj(int i) {
        try {
            int i2 = gt.aq - 358573791;
            gt.aq = i2;
            return (i2 * -1233507615) - 1;
        } catch (Throwable e) {
            throw ei.ac(e, "jg.aj(" + ')');
        }
    }

    jg() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "jg.<init>(" + ')');
        }
    }

    public static boolean ak() {
        long aj = aw.aj((byte) -22);
        int i = (int) (aj - (an * 8140526878616812117L));
        an = aj * -7577179091387305219L;
        if (i > -138758858) {
            i = 1572710208;
        }
        ac = (i * 2001837403) + ac;
        if (aw * -1067087553 == 0 && ak * -1726800331 == 0 && ah * 2042254669 == 0 && 2117876588 * ao == 0) {
            return true;
        }
        if (aj == null) {
            return false;
        }
        if (ac * 1012639534 > 30000) {
            throw new IOException();
        }
        while (-960407183 * ak < fr.ak && ao * 1287262029 > 0) {
            try {
                jx jxVar = (jx) aq.aq();
                he heVar = new he(4);
                heVar.an(1, (byte) -86);
                heVar.ao((int) jxVar.fy, 1213666745);
                aj.ak(heVar.aj, 0, 4, -772798516);
                aa.ac(jxVar, jxVar.fy);
                ao -= -931020411;
                ak += 814630801;
            } catch (IOException e) {
                try {
                    aj.aj((short) -23009);
                } catch (Exception e2) {
                }
                ar += 1871409185;
                aj = null;
                return false;
            }
        }
        while (-1067087553 * aw < 1450881475 && 430408013 * ah > 0) {
            jxVar = (jx) ap.aq();
            heVar = new he(4);
            heVar.an(0, (byte) -117);
            heVar.ao((int) jxVar.fy, 252196832);
            aj.ak(heVar.aj, 0, 4, 56282254);
            jxVar.da();
            ai.ac(jxVar, jxVar.fy);
            ah -= 829496922;
            aw -= 1726945601;
        }
        int i2 = 0;
        while (i2 < 100) {
            i = aj.an((byte) -29);
            if (i < 0) {
                throw new IOException();
            } else if (i == 0) {
                break;
            } else {
                int i3;
                ac = 0;
                if (le.ae == null) {
                    i3 = 8;
                } else if (1943854469 * az == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i4;
                byte[] bArr;
                int i5;
                he heVar2;
                if (i3 <= 0) {
                    i3 = al.aj.length - le.ae.an;
                    i4 = 820904619 - (1943854469 * az);
                    if (i4 > i3 - (al.ac * 489625177)) {
                        i4 = i3 - (al.ac * 132677359);
                    }
                    if (i4 > i) {
                        i4 = i;
                    }
                    aj.ao(al.aj, al.ac * 489625177, i4, 272417839);
                    if (ay != (byte) 0) {
                        for (i = 0; i < i4; i++) {
                            bArr = al.aj;
                            i5 = (al.ac * 489625177) + i;
                            bArr[i5] = (byte) (bArr[i5] ^ ay);
                        }
                    }
                    heVar2 = al;
                    heVar2.ac += -984165911 * i4;
                    az += i4 * 222729037;
                    if (i3 != al.ac * 489625177) {
                        if (512 != az * -1655410017) {
                            break;
                        }
                        az = 0;
                    } else {
                        if (le.ae.fy == 16711935) {
                            ag.au = al;
                            for (i = 0; i < bq.ah; i++) {
                                jn jnVar = av[i];
                                if (jnVar != null) {
                                    ag.au.ac = (716607304 * i) + 720121067;
                                    jnVar.ej(ag.au.ad((byte) -102), ag.au.ad((byte) -86), (byte) 93);
                                }
                            }
                        } else {
                            af.reset();
                            af.update(al.aj, 0, i3);
                            if (((int) af.getValue()) != -1127713465 * le.ae.ac) {
                                try {
                                    aj.aj((short) -16869);
                                } catch (Exception e3) {
                                }
                                ag -= 724491775;
                                aj = null;
                                ay = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                return false;
                            }
                            ag = 0;
                            ar = 0;
                            le.ae.aj.eh((int) (le.ae.fy & 65535), al.aj, 16711680 == (le.ae.fy & 16711680), am, 1808081809);
                        }
                        le.ae.kn();
                        if (am) {
                            ak -= 814630801;
                        } else {
                            aw -= -1726945601;
                        }
                        az = 0;
                        le.ae = null;
                        al = null;
                    }
                } else {
                    i4 = i3 - (as.ac * 489625177);
                    if (i4 > i) {
                        i4 = i;
                    }
                    aj.ao(as.aj, 996630734 * as.ac, i4, -413610539);
                    if (ay != (byte) 0) {
                        for (i = 0; i < i4; i++) {
                            bArr = as.aj;
                            i5 = (as.ac * 489625177) + i;
                            bArr[i5] = (byte) (bArr[i5] ^ ay);
                        }
                    }
                    heVar2 = as;
                    heVar2.ac = (i4 * -984165911) + heVar2.ac;
                    if (as.ac * 164621638 < i3) {
                        break;
                    } else if (le.ae == null) {
                        as.ac = 0;
                        i = as.au(-310118664);
                        i4 = as.ay((byte) 1);
                        i3 = as.au(-310118664);
                        int ad = as.ad((byte) -101);
                        long j = (long) ((i << 16) + i4);
                        jxVar = (jx) aa.aj(j);
                        am = true;
                        if (jxVar == null) {
                            jxVar = (jx) ai.aj(j);
                            am = false;
                        }
                        jx jxVar2 = jxVar;
                        if (jxVar2 == null) {
                            throw new IOException();
                        }
                        i = i3 == 0 ? 5 : 9;
                        le.ae = jxVar2;
                        al = new he((i + ad) + le.ae.an);
                        al.an(i3, (byte) -17);
                        al.aa(ad, -2105466467);
                        az = -1142473115;
                        as.ac = 0;
                    } else if (az * 127007158 == 0) {
                        if (as.aj[0] == (byte) -1) {
                            az = 222729037;
                            as.ac = 0;
                        } else {
                            le.ae = null;
                        }
                    }
                }
                i2++;
            }
        }
        return true;
    }

    public static boolean ap() {
        long aj = aw.aj((byte) 29);
        int i = (int) (aj - (an * 8140526878616812117L));
        an = aj * -7577179091387305219L;
        if (i > fr.ak) {
            i = fr.ak;
        }
        ac = (i * 1257392079) + ac;
        if (aw * -1067087553 == 0 && ak * -960407183 == 0 && ah * 430408013 == 0 && 1287262029 * ao == 0) {
            return true;
        }
        if (aj == null) {
            return false;
        }
        if (ac * 1441881903 > 30000) {
            throw new IOException();
        }
        while (-960407183 * ak < fr.ak && ao * 1287262029 > 0) {
            try {
                jx jxVar = (jx) aq.aq();
                he heVar = new he(4);
                heVar.an(1, (byte) -69);
                heVar.ao((int) jxVar.fy, 708901702);
                aj.ak(heVar.aj, 0, 4, -30832619);
                aa.ac(jxVar, jxVar.fy);
                ao -= -931020411;
                ak += 814630801;
            } catch (IOException e) {
                try {
                    aj.aj((short) -570);
                } catch (Exception e2) {
                }
                ar += 1871409185;
                aj = null;
                return false;
            }
        }
        while (-1067087553 * aw < fr.ak && 430408013 * ah > 0) {
            jxVar = (jx) ap.aq();
            heVar = new he(4);
            heVar.an(0, Byte.MIN_VALUE);
            heVar.ao((int) jxVar.fy, 600544960);
            aj.ak(heVar.aj, 0, 4, 426304276);
            jxVar.da();
            ai.ac(jxVar, jxVar.fy);
            ah -= -1210605691;
            aw -= 1726945601;
        }
        int i2 = 0;
        while (i2 < 100) {
            i = aj.an((byte) 97);
            if (i < 0) {
                throw new IOException();
            } else if (i == 0) {
                break;
            } else {
                int i3;
                ac = 0;
                if (le.ae == null) {
                    i3 = 8;
                } else if (1943854469 * az == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i4;
                byte[] bArr;
                int i5;
                he heVar2;
                if (i3 <= 0) {
                    i3 = al.aj.length - le.ae.an;
                    i4 = 512 - (1943854469 * az);
                    if (i4 > i3 - (al.ac * 489625177)) {
                        i4 = i3 - (al.ac * 489625177);
                    }
                    if (i4 > i) {
                        i4 = i;
                    }
                    aj.ao(al.aj, al.ac * 489625177, i4, -1958536047);
                    if (ay != (byte) 0) {
                        for (i = 0; i < i4; i++) {
                            bArr = al.aj;
                            i5 = (al.ac * 489625177) + i;
                            bArr[i5] = (byte) (bArr[i5] ^ ay);
                        }
                    }
                    heVar2 = al;
                    heVar2.ac += -984165911 * i4;
                    az += i4 * 222729037;
                    if (i3 != al.ac * 489625177) {
                        if (512 != az * 1943854469) {
                            break;
                        }
                        az = 0;
                    } else {
                        if (le.ae.fy == 16711935) {
                            ag.au = al;
                            for (i = 0; i < bq.ah; i++) {
                                jn jnVar = av[i];
                                if (jnVar != null) {
                                    ag.au.ac = (716607304 * i) - 625862259;
                                    jnVar.ej(ag.au.ad((byte) -74), ag.au.ad((byte) -10), (byte) 87);
                                }
                            }
                        } else {
                            af.reset();
                            af.update(al.aj, 0, i3);
                            if (((int) af.getValue()) != -1127713465 * le.ae.ac) {
                                try {
                                    aj.aj((short) -12364);
                                } catch (Exception e3) {
                                }
                                ag += 400606417;
                                aj = null;
                                ay = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                return false;
                            }
                            ag = 0;
                            ar = 0;
                            le.ae.aj.eh((int) (le.ae.fy & 65535), al.aj, 16711680 == (le.ae.fy & 16711680), am, 982511916);
                        }
                        le.ae.kn();
                        if (am) {
                            ak -= 814630801;
                        } else {
                            aw -= -1726945601;
                        }
                        az = 0;
                        le.ae = null;
                        al = null;
                    }
                } else {
                    i4 = i3 - (as.ac * 489625177);
                    if (i4 > i) {
                        i4 = i;
                    }
                    aj.ao(as.aj, as.ac * 489625177, i4, -1076341896);
                    if (ay != (byte) 0) {
                        for (i = 0; i < i4; i++) {
                            bArr = as.aj;
                            i5 = (as.ac * 489625177) + i;
                            bArr[i5] = (byte) (bArr[i5] ^ ay);
                        }
                    }
                    heVar2 = as;
                    heVar2.ac = (i4 * -984165911) + heVar2.ac;
                    if (as.ac * 489625177 < i3) {
                        break;
                    } else if (le.ae == null) {
                        as.ac = 0;
                        i = as.au(-310118664);
                        i4 = as.ay((byte) 1);
                        i3 = as.au(-310118664);
                        int ad = as.ad((byte) -6);
                        long j = (long) ((i << 16) + i4);
                        jxVar = (jx) aa.aj(j);
                        am = true;
                        if (jxVar == null) {
                            jxVar = (jx) ai.aj(j);
                            am = false;
                        }
                        jx jxVar2 = jxVar;
                        if (jxVar2 == null) {
                            throw new IOException();
                        }
                        i = i3 == 0 ? 5 : 9;
                        le.ae = jxVar2;
                        al = new he((i + ad) + le.ae.an);
                        al.an(i3, (byte) -102);
                        al.aa(ad, 1734478357);
                        az = 1781832296;
                        as.ac = 0;
                    } else if (az * 1943854469 == 0) {
                        if (as.aj[0] == (byte) -1) {
                            az = 222729037;
                            as.ac = 0;
                        } else {
                            le.ae = null;
                        }
                    }
                }
                i2++;
            }
        }
        return true;
    }

    public static void at(boolean z) {
        if (aj != null) {
            try {
                he heVar = new he(4);
                heVar.an(z ? 2 : 3, (byte) -45);
                heVar.ao(0, 1244216248);
                aj.ak(heVar.aj, 0, 4, 171691774);
            } catch (IOException e) {
                try {
                    aj.aj((short) -9992);
                } catch (Exception e2) {
                }
                ar += 1871409185;
                aj = null;
            }
        }
    }

    static void ah(jn jnVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((jx) aq.aj(j)) == null) {
            if (((jx) aa.aj(j)) == null) {
                jx jxVar = (jx) at.aj(j);
                if (jxVar != null) {
                    if (z) {
                        jxVar.da();
                        aq.ac(jxVar, j);
                        ah -= -1210605691;
                        ao -= 931020411;
                    }
                } else if (z || ((jx) ai.aj(j)) == null) {
                    jt jxVar2 = new jx();
                    jxVar2.aj = jnVar;
                    jxVar2.ac = 651207799 * i3;
                    jxVar2.an = b;
                    if (z) {
                        aq.ac(jxVar2, j);
                        ao -= 931020411;
                        return;
                    }
                    ap.aj(jxVar2);
                    at.ac(jxVar2, j);
                    ah -= 1210605691;
                }
            }
        }
    }

    static void ai(jn jnVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((jx) aq.aj(j)) == null) {
            if (((jx) aa.aj(j)) == null) {
                jx jxVar = (jx) at.aj(j);
                if (jxVar != null) {
                    if (z) {
                        jxVar.da();
                        aq.ac(jxVar, j);
                        ah -= -1210605691;
                        ao -= 931020411;
                    }
                } else if (z || ((jx) ai.aj(j)) == null) {
                    jt jxVar2 = new jx();
                    jxVar2.aj = jnVar;
                    jxVar2.ac = -2060834993 * i3;
                    jxVar2.an = b;
                    if (z) {
                        aq.ac(jxVar2, j);
                        ao += 672748597;
                        return;
                    }
                    ap.aj(jxVar2);
                    at.ac(jxVar2, j);
                    ah -= 1210605691;
                }
            }
        }
    }

    static void aw(jn jnVar, int i, int i2, int i3, byte b, boolean z) {
        long j = (long) ((i << 16) + i2);
        if (((jx) aq.aj(j)) == null && ((jx) aa.aj(j)) == null) {
            jx jxVar = (jx) at.aj(j);
            if (jxVar != null) {
                if (z) {
                    jxVar.da();
                    aq.ac(jxVar, j);
                    ah -= -1210605691;
                    ao -= 931020411;
                }
            } else if (z || ((jx) ai.aj(j)) == null) {
                jt jxVar2 = new jx();
                jxVar2.aj = jnVar;
                jxVar2.ac = 651207799 * i3;
                jxVar2.an = b;
                if (z) {
                    aq.ac(jxVar2, j);
                    ao -= 931020411;
                    return;
                }
                ap.aj(jxVar2);
                at.ac(jxVar2, j);
                ah -= 1210605691;
            }
        }
    }

    static int ae(int i, int i2) {
        return (le.ae == null || le.ae.fy != ((long) ((i << 16) + i2))) ? 0 : ((al.ac * 1228252267) / (al.aj.length - le.ae.an)) + 1;
    }

    static int al(int i, int i2) {
        long j = (long) ((i << 16) + i2);
        if (le.ae == null || le.ae.fy != j) {
            return 0;
        }
        return ((al.ac * 1228252267) / (al.aj.length - le.ae.an)) + 1;
    }

    static int am(int i, int i2) {
        return (le.ae == null || le.ae.fy != ((long) ((i << 16) + i2))) ? 0 : ((al.ac * 1228252267) / (al.aj.length - le.ae.an)) + 1;
    }

    static int as(int i, int i2) {
        long j = (long) ((i << 16) + i2);
        if (le.ae == null || le.ae.fy != j) {
            return 0;
        }
        return ((al.ac * 1228252267) / (al.aj.length - le.ae.an)) + 1;
    }

    public static int ax(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + ((ao * 1287262029) + (-960407183 * ak));
        }
        if (z2) {
            return i + ((-1067087553 * aw) + (430408013 * ah));
        }
        return i;
    }

    public static int az(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            i = 0 + ((ao * 468071425) + (-960407183 * ak));
        }
        if (z2) {
            return i + ((838444692 * aw) + (430408013 * ah));
        }
        return i;
    }
}
