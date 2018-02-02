package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class dx {
    static int jk = 0;
    static iw mh = null;
    public static fc na = null;
    static final int pm = 50;
    dw[][] aa;
    boolean ac;
    int ah;
    int ai;
    boolean aj;
    HashMap ak;
    dh an;
    HashMap ao;
    fl[] ap;
    em aq;
    final HashMap at;

    public dx(fl[] flVarArr, HashMap hashMap) {
        try {
            this.aj = false;
            this.ac = false;
            this.ak = new HashMap();
            this.ap = flVarArr;
            this.at = hashMap;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.<init>(" + ')');
        }
    }

    public void ae(ju juVar, String str, boolean z) {
        if (!this.ac) {
            this.aj = false;
            this.ac = true;
            System.nanoTime();
            int av = juVar.av(juVar.au(dj.aj.aa, -1332887215), str, (byte) -124);
            he heVar = new he(juVar.ag(dj.aj.aa, str, -1913838945));
            he heVar2 = new he(juVar.ag(dj.ac.aa, str, -1838562392));
            he heVar3 = new he(juVar.ag(str, dj.aq.aa, -1007665182));
            System.nanoTime();
            System.nanoTime();
            this.an = new dh();
            try {
                this.an.aj(heVar, heVar3, heVar2, av, z, (byte) -99);
                this.an.ad(1492288809);
                this.an.ab(582100429);
                this.an.bp(-1473519887);
                this.ah = this.an.av(1200060841) * 187570054;
                this.ai = this.an.ag((byte) -56) * 1818104640;
                this.an.ay((byte) -79);
                this.an.av(1458264797);
                this.an.ar(2106937199);
                this.an.ag((byte) -5);
                int ay = (this.an.ay((byte) -8) - this.an.av(1087853809)) + 1;
                int ar = (this.an.ar(2105627963) - this.an.ag((byte) -88)) + 1;
                System.nanoTime();
                System.nanoTime();
                this.aa = (dw[][]) Array.newInstance(dw.class, new int[]{ay, ar});
                Iterator it = this.an.aj.iterator();
                while (it.hasNext()) {
                    dv dvVar = (dv) it.next();
                    av = -1825299063 * dvVar.aj;
                    int i = dvVar.ac * -118442129;
                    int av2 = av - this.an.av(1738903907);
                    int ag = i - this.an.ag((byte) -125);
                    this.aa[av2][ag] = new dw(av, i, this.an.af(-64256571), this.at);
                    this.aa[av2][ag].ac(dvVar, this.an.an, -253368469);
                }
                for (int i2 = 0; i2 < ay; i2++) {
                    for (int i3 = 0; i3 < ar; i3++) {
                        if (this.aa[i2][i3] == null) {
                            this.aa[i2][i3] = new dw(this.an.av(1325686513) + i2, this.an.ag((byte) -48) + i3, this.an.af(-1641827240), this.at);
                            this.aa[i2][i3].an(this.an.ac, this.an.an, (byte) 37);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (juVar.ay(dj.an.aa, str, -761567288)) {
                    this.aq = ej.aj(juVar.ag(dj.an.aa, str, -1957436260), -1913755933);
                }
                System.nanoTime();
                this.aj = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public void aj(ju juVar, String str, boolean z, int i) {
        try {
            if (!this.ac) {
                this.aj = false;
                this.ac = true;
                System.nanoTime();
                int av = juVar.av(juVar.au(dj.aj.aa, -1117933713), str, (byte) -61);
                he heVar = new he(juVar.ag(dj.aj.aa, str, -1677931916));
                he heVar2 = new he(juVar.ag(dj.ac.aa, str, -1992873409));
                he heVar3 = new he(juVar.ag(str, dj.aq.aa, -1318095034));
                System.nanoTime();
                System.nanoTime();
                this.an = new dh();
                try {
                    this.an.aj(heVar, heVar3, heVar2, av, z, (byte) -15);
                    this.an.ad(1492288809);
                    this.an.ab(582100429);
                    this.an.bp(-1364879303);
                    this.ah = this.an.av(1266677979) * 958680768;
                    this.ai = this.an.ag((byte) -107) * 1818104640;
                    this.an.ay((byte) 6);
                    this.an.av(1124285434);
                    this.an.ar(2133869594);
                    this.an.ag((byte) -2);
                    int ay = (this.an.ay((byte) -19) - this.an.av(1368468539)) + 1;
                    int ar = (this.an.ar(2140877514) - this.an.ag((byte) -71)) + 1;
                    System.nanoTime();
                    System.nanoTime();
                    this.aa = (dw[][]) Array.newInstance(dw.class, new int[]{ay, ar});
                    Iterator it = this.an.aj.iterator();
                    while (it.hasNext()) {
                        dv dvVar = (dv) it.next();
                        av = -1825299063 * dvVar.aj;
                        int i2 = dvVar.ac * -118442129;
                        int av2 = av - this.an.av(1390594065);
                        int ag = i2 - this.an.ag((byte) -90);
                        this.aa[av2][ag] = new dw(av, i2, this.an.af(-450406612), this.at);
                        this.aa[av2][ag].ac(dvVar, this.an.an, -148075378);
                    }
                    for (int i3 = 0; i3 < ay; i3++) {
                        for (int i4 = 0; i4 < ar; i4++) {
                            if (this.aa[i3][i4] == null) {
                                this.aa[i3][i4] = new dw(this.an.av(1551031977) + i3, this.an.ag((byte) -21) + i4, this.an.af(-494463721), this.at);
                                this.aa[i3][i4].an(this.an.ac, this.an.an, (byte) 40);
                            }
                        }
                    }
                    System.nanoTime();
                    System.nanoTime();
                    if (juVar.ay(dj.an.aa, str, 265641610)) {
                        this.aq = ej.aj(juVar.ag(dj.an.aa, str, -1473185760), -1457392923);
                    }
                    System.nanoTime();
                    this.aj = true;
                } catch (IllegalStateException e) {
                }
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "dx.aj(" + ')');
        }
    }

    public void am(ju juVar, String str, boolean z) {
        if (!this.ac) {
            this.aj = false;
            this.ac = true;
            System.nanoTime();
            int av = juVar.av(juVar.au(dj.aj.aa, -2000080646), str, (byte) -79);
            he heVar = new he(juVar.ag(dj.aj.aa, str, -1253074004));
            he heVar2 = new he(juVar.ag(dj.ac.aa, str, -1127429068));
            he heVar3 = new he(juVar.ag(str, dj.aq.aa, -1177033018));
            System.nanoTime();
            System.nanoTime();
            this.an = new dh();
            try {
                this.an.aj(heVar, heVar3, heVar2, av, z, (byte) 2);
                this.an.ad(1492288809);
                this.an.ab(582100429);
                this.an.bp(-906883013);
                this.ah = this.an.av(926550723) * 958680768;
                this.ai = this.an.ag((byte) -50) * 1818104640;
                this.an.ay((byte) -11);
                this.an.av(1813940781);
                this.an.ar(2102996850);
                this.an.ag((byte) -93);
                int ay = (this.an.ay((byte) 25) - this.an.av(1264369458)) + 1;
                int ar = (this.an.ar(2105681474) - this.an.ag((byte) -13)) + 1;
                System.nanoTime();
                System.nanoTime();
                this.aa = (dw[][]) Array.newInstance(dw.class, new int[]{ay, ar});
                Iterator it = this.an.aj.iterator();
                while (it.hasNext()) {
                    dv dvVar = (dv) it.next();
                    av = -1825299063 * dvVar.aj;
                    int i = dvVar.ac * -118442129;
                    int av2 = av - this.an.av(1072139410);
                    int ag = i - this.an.ag((byte) -112);
                    this.aa[av2][ag] = new dw(av, i, this.an.af(80373185), this.at);
                    this.aa[av2][ag].ac(dvVar, this.an.an, 76625251);
                }
                for (int i2 = 0; i2 < ay; i2++) {
                    for (int i3 = 0; i3 < ar; i3++) {
                        if (this.aa[i2][i3] == null) {
                            this.aa[i2][i3] = new dw(this.an.av(863230116) + i2, this.an.ag((byte) -73) + i3, this.an.af(-1399931378), this.at);
                            this.aa[i2][i3].an(this.an.ac, this.an.an, (byte) 41);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (juVar.ay(dj.an.aa, str, -1839826075)) {
                    this.aq = ej.aj(juVar.ag(dj.an.aa, str, -1118380984), -954521713);
                }
                System.nanoTime();
                this.aj = true;
            } catch (IllegalStateException e) {
            }
        }
    }

    public static boolean aj(byte b) {
        try {
            long aj = aw.aj((byte) -64);
            int i = (int) (aj - (jg.an * 8140526878616812117L));
            jg.an = aj * -7577179091387305219L;
            if (i > fr.ak) {
                i = fr.ak;
            }
            jg.ac = (i * 1257392079) + jg.ac;
            if (jg.aw * -1067087553 == 0 && jg.ak * -960407183 == 0 && jg.ah * 430408013 == 0 && 1287262029 * jg.ao == 0) {
                return true;
            }
            if (jg.aj == null) {
                return false;
            }
            if (jg.ac * 1441881903 > 30000) {
                throw new IOException();
            }
            jx jxVar;
            he heVar;
            while (-960407183 * jg.ak < fr.ak && jg.ao * 1287262029 > 0) {
                try {
                    jxVar = (jx) jg.aq.aq();
                    heVar = new he(4);
                    heVar.an(1, (byte) -28);
                    heVar.ao((int) jxVar.fy, 2141418585);
                    jg.aj.ak(heVar.aj, 0, 4, 1434439245);
                    jg.aa.ac(jxVar, jxVar.fy);
                    jg.ao -= -931020411;
                    jg.ak += 814630801;
                } catch (IOException e) {
                    try {
                        jg.aj.aj((short) -8588);
                    } catch (Exception e2) {
                    }
                    jg.ar += 1871409185;
                    jg.aj = null;
                    return false;
                }
            }
            while (-1067087553 * jg.aw < fr.ak && 430408013 * jg.ah > 0) {
                jxVar = (jx) jg.ap.aq();
                heVar = new he(4);
                heVar.an(0, (byte) -123);
                heVar.ao((int) jxVar.fy, 2029057786);
                jg.aj.ak(heVar.aj, 0, 4, 1927920244);
                jxVar.da();
                jg.ai.ac(jxVar, jxVar.fy);
                jg.ah -= -1210605691;
                jg.aw -= 1726945601;
            }
            int i2 = 0;
            while (i2 < 100) {
                i = jg.aj.an((byte) -23);
                if (i < 0) {
                    throw new IOException();
                } else if (i == 0) {
                    break;
                } else {
                    int i3;
                    jg.ac = 0;
                    if (le.ae == null) {
                        i3 = 8;
                    } else if (1943854469 * jg.az == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i4;
                    byte[] bArr;
                    int i5;
                    he heVar2;
                    if (i3 <= 0) {
                        i3 = jg.al.aj.length - le.ae.an;
                        i4 = 512 - (1943854469 * jg.az);
                        if (i4 > i3 - (jg.al.ac * 489625177)) {
                            i4 = i3 - (jg.al.ac * 489625177);
                        }
                        if (i4 > i) {
                            i4 = i;
                        }
                        jg.aj.ao(jg.al.aj, jg.al.ac * 489625177, i4, 192573220);
                        if (jg.ay != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = jg.al.aj;
                                i5 = (jg.al.ac * 489625177) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ jg.ay);
                            }
                        }
                        heVar2 = jg.al;
                        heVar2.ac += -984165911 * i4;
                        jg.az += i4 * 222729037;
                        if (i3 != jg.al.ac * 489625177) {
                            if (cj.at != jg.az * 1943854469) {
                                break;
                            }
                            jg.az = 0;
                        } else {
                            if (le.ae.fy == 16711935) {
                                ag.au = jg.al;
                                for (i = 0; i < bq.ah; i++) {
                                    jn jnVar = jg.av[i];
                                    if (jnVar != null) {
                                        ag.au.ac = (716607304 * i) - 625862259;
                                        jnVar.ej(ag.au.ad((byte) -119), ag.au.ad((byte) -75), (byte) 103);
                                    }
                                }
                            } else {
                                jg.af.reset();
                                jg.af.update(jg.al.aj, 0, i3);
                                if (((int) jg.af.getValue()) != -1127713465 * le.ae.ac) {
                                    try {
                                        jg.aj.aj((short) -2170);
                                    } catch (Exception e3) {
                                    }
                                    jg.ag += 400606417;
                                    jg.aj = null;
                                    jg.ay = (byte) ((int) ((Math.random() * 255.0d) + 1.0d));
                                    return false;
                                }
                                jg.ag = 0;
                                jg.ar = 0;
                                le.ae.aj.eh((int) (le.ae.fy & 65535), jg.al.aj, 16711680 == (le.ae.fy & 16711680), jg.am, 2049634724);
                            }
                            le.ae.kn();
                            if (jg.am) {
                                jg.ak -= 814630801;
                            } else {
                                jg.aw -= -1726945601;
                            }
                            jg.az = 0;
                            le.ae = null;
                            jg.al = null;
                        }
                    } else {
                        i4 = i3 - (jg.as.ac * 489625177);
                        if (i4 > i) {
                            i4 = i;
                        }
                        jg.aj.ao(jg.as.aj, jg.as.ac * 489625177, i4, -38664110);
                        if (jg.ay != (byte) 0) {
                            for (i = 0; i < i4; i++) {
                                bArr = jg.as.aj;
                                i5 = (jg.as.ac * 489625177) + i;
                                bArr[i5] = (byte) (bArr[i5] ^ jg.ay);
                            }
                        }
                        heVar2 = jg.as;
                        heVar2.ac = (i4 * -984165911) + heVar2.ac;
                        if (jg.as.ac * 489625177 < i3) {
                            break;
                        } else if (le.ae == null) {
                            jg.as.ac = 0;
                            i = jg.as.au(-310118664);
                            i4 = jg.as.ay((byte) 1);
                            i3 = jg.as.au(-310118664);
                            int ad = jg.as.ad((byte) -23);
                            long j = (long) ((i << 16) + i4);
                            jxVar = (jx) jg.aa.aj(j);
                            jg.am = true;
                            if (jxVar == null) {
                                jxVar = (jx) jg.ai.aj(j);
                                jg.am = false;
                            }
                            jx jxVar2 = jxVar;
                            if (jxVar2 == null) {
                                throw new IOException();
                            }
                            i = i3 == 0 ? 5 : 9;
                            le.ae = jxVar2;
                            jg.al = new he((i + ad) + le.ae.an);
                            jg.al.an(i3, (byte) -35);
                            jg.al.aa(ad, 1909968734);
                            jg.az = 1781832296;
                            jg.as.ac = 0;
                        } else if (jg.az * 1943854469 == 0) {
                            if (jg.as.aj[0] == (byte) -1) {
                                jg.az = 222729037;
                                jg.as.ac = 0;
                            } else {
                                le.ae = null;
                            }
                        }
                    }
                    i2++;
                }
            }
            return true;
        } catch (Throwable e4) {
            throw ei.ac(e4, "dx.aj(" + ')');
        }
    }

    public final void ac(short s) {
        try {
            this.ao = null;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ac(" + ')');
        }
    }

    public final void al() {
        this.ao = null;
    }

    public final void as() {
        this.ao = null;
    }

    public final void az() {
        this.ao = null;
    }

    public final void af(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar) {
        int i9;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        float aw = aw(i7 - i5, i3 - i, (short) -13066);
        int ceil = (int) Math.ceil((double) aw);
        if (!this.ak.containsKey(Integer.valueOf(ceil))) {
            eu euVar = new eu(ceil);
            euVar.aq(1680805687);
            this.ak.put(Integer.valueOf(ceil), euVar);
        }
        dw[] dwVarArr = new dw[8];
        for (i9 = -2007068591 * ap.an; i9 < (-1386667975 * ap.an) + (ap.aj * 341879123); i9++) {
            int i10;
            for (i10 = ap.aq * 943910533; i10 < (943910533 * ap.aq) + (-69023249 * ap.ac); i10++) {
                ao(i9, i10, dwVarArr, (byte) 67);
                this.aa[i9][i10].aa(ceil, (eu) this.ak.get(Integer.valueOf(ceil)), dwVarArr, this.ap, (byte) 8);
            }
        }
        int i11 = (int) (64.0f * aw);
        int i12 = i + (this.ah * -182706189);
        int i13 = i2 + (this.ai * -1595220708);
        for (i9 = ap.an * -1697361457; i9 < (-1386667975 * ap.an) + (ap.aj * 1242242975); i9++) {
            for (i10 = ap.aq * 1844896426; i10 < (-1725622131 * ap.ac) + (943910533 * ap.aq); i10++) {
                this.aa[i9][i10].aj(((((-1154826688 * this.aa[i9][i10].aa) - i12) * i11) / 805693599) + i5, i8 - (((((this.aa[i9][i10].ak * 931121179) - i13) + 188805048) * i11) / 474372812), i11, esVar, 1920151934);
            }
        }
    }

    public final void an(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar, byte b) {
        try {
            int i9;
            int i10;
            dg ap = ap(i, i2, i3, i4, -1247142525);
            float aw = aw(i7 - i5, i3 - i, (short) 8358);
            int ceil = (int) Math.ceil((double) aw);
            if (!this.ak.containsKey(Integer.valueOf(ceil))) {
                eu euVar = new eu(ceil);
                euVar.aq(936922870);
                this.ak.put(Integer.valueOf(ceil), euVar);
            }
            dw[] dwVarArr = new dw[8];
            for (i9 = -1386667975 * ap.an; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
                for (i10 = ap.aq * 943910533; i10 < (943910533 * ap.aq) + (-1725622131 * ap.ac); i10++) {
                    ao(i9, i10, dwVarArr, (byte) 120);
                    this.aa[i9][i10].aa(ceil, (eu) this.ak.get(Integer.valueOf(ceil)), dwVarArr, this.ap, (byte) 8);
                }
            }
            int i11 = (int) (64.0f * aw);
            int i12 = i + (this.ah * -182706189);
            int i13 = i2 + (this.ai * -1942060923);
            for (i9 = ap.an * -1386667975; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
                for (i10 = ap.aq * 943910533; i10 < (-1725622131 * ap.ac) + (943910533 * ap.aq); i10++) {
                    this.aa[i9][i10].aj(((((-1154826688 * this.aa[i9][i10].aa) - i12) * i11) / 64) + i5, i8 - (((((this.aa[i9][i10].ak * -1058728000) - i13) + 64) * i11) / 64), i11, esVar, -2007243540);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.an(" + ')');
        }
    }

    public final void au(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar) {
        int i9;
        int i10;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        float aw = aw(i7 - i5, i3 - i, (short) 7470);
        int ceil = (int) Math.ceil((double) aw);
        if (!this.ak.containsKey(Integer.valueOf(ceil))) {
            eu euVar = new eu(ceil);
            euVar.aq(-176782061);
            this.ak.put(Integer.valueOf(ceil), euVar);
        }
        dw[] dwVarArr = new dw[8];
        for (i9 = -1386667975 * ap.an; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
            for (i10 = ap.aq * 943910533; i10 < (943910533 * ap.aq) + (-1725622131 * ap.ac); i10++) {
                ao(i9, i10, dwVarArr, (byte) 92);
                this.aa[i9][i10].aa(ceil, (eu) this.ak.get(Integer.valueOf(ceil)), dwVarArr, this.ap, (byte) 8);
            }
        }
        int i11 = (int) (64.0f * aw);
        int i12 = i + (this.ah * -182706189);
        int i13 = i2 + (this.ai * -1942060923);
        for (i9 = ap.an * -1386667975; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
            for (i10 = ap.aq * 943910533; i10 < (-1725622131 * ap.ac) + (943910533 * ap.aq); i10++) {
                this.aa[i9][i10].aj(((((-1154826688 * this.aa[i9][i10].aa) - i12) * i11) / 64) + i5, i8 - (((((this.aa[i9][i10].ak * -1058728000) - i13) + 64) * i11) / 64), i11, esVar, 453652905);
            }
        }
    }

    public final void ax(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar) {
        int i9;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        float aw = aw(i7 - i5, i3 - i, (short) -13486);
        int ceil = (int) Math.ceil((double) aw);
        if (!this.ak.containsKey(Integer.valueOf(ceil))) {
            eu euVar = new eu(ceil);
            euVar.aq(-364937507);
            this.ak.put(Integer.valueOf(ceil), euVar);
        }
        dw[] dwVarArr = new dw[8];
        for (i9 = -1386667975 * ap.an; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
            int i10;
            for (i10 = ap.aq * 943910533; i10 < (943910533 * ap.aq) + (-1725622131 * ap.ac); i10++) {
                ao(i9, i10, dwVarArr, (byte) 100);
                this.aa[i9][i10].aa(ceil, (eu) this.ak.get(Integer.valueOf(ceil)), dwVarArr, this.ap, (byte) 8);
            }
        }
        int i11 = (int) (64.0f * aw);
        int i12 = i + (this.ah * -182706189);
        int i13 = i2 + (this.ai * -1942060923);
        for (i9 = ap.an * -1386667975; i9 < (-1386667975 * ap.an) + (ap.aj * -1150806225); i9++) {
            for (i10 = ap.aq * 943910533; i10 < (-1725622131 * ap.ac) + (943910533 * ap.aq); i10++) {
                this.aa[i9][i10].aj(((((-1154826688 * this.aa[i9][i10].aa) - i12) * i11) / 64) + i5, i8 - (((((this.aa[i9][i10].ak * -1058728000) - i13) + 64) * i11) / 64), i11, esVar, 517463314);
            }
        }
    }

    public final void ag(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7 - i5, i3 - i, (short) 7553) * 64.0f);
        int i12 = i + (this.ah * -182706189);
        int i13 = (-1942060923 * this.ai) + i2;
        for (i11 = -1386667975 * ap.an; i11 < (-1386667975 * ap.an) + (-1150806225 * ap.aj); i11++) {
            for (int i14 = 943910533 * ap.aq; i14 < (ap.aq * 943910533) + (-1725622131 * ap.ac); i14++) {
                if (z) {
                    this.aa[i11][i14].bt(1370989855);
                }
                this.aa[i11][i14].ak(((((-1154826688 * this.aa[i11][i14].aa) - i12) * aw) / 64) + i5, i8 - (((((-1058728000 * this.aa[i11][i14].ak) - i13) + 64) * aw) / 64), aw, hashSet, esVar, -2033984055);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -1386667975 * ap.an; i15 < (-1150806225 * ap.aj) + (-1386667975 * ap.an); i15++) {
                for (i11 = ap.aq * 943910533; i11 < (ap.ac * -1725622131) + (ap.aq * 943910533); i11++) {
                    this.aa[i15][i11].ap(hashSet2, i9, i10, esVar, 1237847345);
                }
            }
        }
    }

    public final void aq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar, int i11) {
        try {
            int i12;
            dg ap = ap(i, i2, i3, i4, -1247142525);
            int aw = (int) (aw(i7 - i5, i3 - i, (short) 14421) * 64.0f);
            int i13 = i + (this.ah * -182706189);
            int i14 = (-1942060923 * this.ai) + i2;
            for (int i15 = -1386667975 * ap.an; i15 < (-1386667975 * ap.an) + (-1150806225 * ap.aj); i15++) {
                for (i12 = 943910533 * ap.aq; i12 < (ap.aq * 943910533) + (-1725622131 * ap.ac); i12++) {
                    if (z) {
                        this.aa[i15][i12].bt(363276195);
                    }
                    this.aa[i15][i12].ak(((((-1154826688 * this.aa[i15][i12].aa) - i13) * aw) / 64) + i5, i8 - (((((-1058728000 * this.aa[i15][i12].ak) - i14) + 64) * aw) / 64), aw, hashSet, esVar, 471145008);
                }
            }
            if (hashSet2 != null && i9 > 0) {
                for (i12 = -1386667975 * ap.an; i12 < (-1150806225 * ap.aj) + (-1386667975 * ap.an); i12++) {
                    for (int i16 = ap.aq * 943910533; i16 < (ap.ac * -1725622131) + (ap.aq * 943910533); i16++) {
                        this.aa[i12][i16].ap(hashSet2, i9, i10, esVar, 1237847345);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.aq(" + ')');
        }
    }

    public final void ar(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7 - i5, i3 - i, (short) 20089) * 64.0f);
        int i12 = i + (this.ah * -182706189);
        int i13 = (-1942060923 * this.ai) + i2;
        for (i11 = -1386667975 * ap.an; i11 < (-1386667975 * ap.an) + (-1150806225 * ap.aj); i11++) {
            for (int i14 = 943910533 * ap.aq; i14 < (ap.aq * 943910533) + (-1725622131 * ap.ac); i14++) {
                if (z) {
                    this.aa[i11][i14].bt(508738268);
                }
                this.aa[i11][i14].ak(((((-1154826688 * this.aa[i11][i14].aa) - i12) * aw) / 64) + i5, i8 - (((((-1058728000 * this.aa[i11][i14].ak) - i13) + 64) * aw) / 64), aw, hashSet, esVar, -1301735562);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -1386667975 * ap.an; i15 < (-1150806225 * ap.aj) + (-1386667975 * ap.an); i15++) {
                for (i11 = ap.aq * 943910533; i11 < (ap.ac * -1725622131) + (ap.aq * 943910533); i11++) {
                    this.aa[i15][i11].ap(hashSet2, i9, i10, esVar, 1237847345);
                }
            }
        }
    }

    public final void av(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7 - i5, i3 - i, (short) -11817) * 64.0f);
        int i12 = i + (this.ah * -182706189);
        int i13 = (-1942060923 * this.ai) + i2;
        for (i11 = -1386667975 * ap.an; i11 < (-1386667975 * ap.an) + (-1150806225 * ap.aj); i11++) {
            for (int i14 = 943910533 * ap.aq; i14 < (ap.aq * 943910533) + (-1725622131 * ap.ac); i14++) {
                if (z) {
                    this.aa[i11][i14].bt(-880290941);
                }
                this.aa[i11][i14].ak(((((-1154826688 * this.aa[i11][i14].aa) - i12) * aw) / 64) + i5, i8 - (((((-1058728000 * this.aa[i11][i14].ak) - i13) + 64) * aw) / 64), aw, hashSet, esVar, 1868011996);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -1386667975 * ap.an; i15 < (-1150806225 * ap.aj) + (-1386667975 * ap.an); i15++) {
                for (i11 = ap.aq * 943910533; i11 < (ap.ac * -1725622131) + (ap.aq * 943910533); i11++) {
                    this.aa[i15][i11].ap(hashSet2, i9, i10, esVar, 1237847345);
                }
            }
        }
    }

    public final void ay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet hashSet, HashSet hashSet2, int i9, int i10, boolean z, es esVar) {
        int i11;
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7 - i5, i3 - i, (short) -9079) * 64.0f);
        int i12 = i + (this.ah * -182706189);
        int i13 = (-1942060923 * this.ai) + i2;
        for (i11 = -1386667975 * ap.an; i11 < (-1386667975 * ap.an) + (-1150806225 * ap.aj); i11++) {
            for (int i14 = 943910533 * ap.aq; i14 < (ap.aq * 943910533) + (-1725622131 * ap.ac); i14++) {
                if (z) {
                    this.aa[i11][i14].bt(1328630746);
                }
                this.aa[i11][i14].ak(((((-1154826688 * this.aa[i11][i14].aa) - i12) * aw) / 64) + i5, i8 - (((((-1058728000 * this.aa[i11][i14].ak) - i13) + 64) * aw) / 64), aw, hashSet, esVar, 1397133209);
            }
        }
        if (hashSet2 != null && i9 > 0) {
            for (int i15 = -1386667975 * ap.an; i15 < (-1150806225 * ap.aj) + (-1386667975 * ap.an); i15++) {
                for (i11 = ap.aq * 943910533; i11 < (ap.ac * -1725622131) + (ap.aq * 943910533); i11++) {
                    this.aa[i15][i11].ap(hashSet2, i9, i10, esVar, 1237847345);
                }
            }
        }
    }

    void ad(int i, int i2, dw[] dwVarArr) {
        int i3;
        int i4;
        int i5;
        dw dwVar;
        int i6 = 0;
        dw dwVar2 = null;
        if (i <= 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i >= this.aa.length - 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 <= 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (i2 >= this.aa[0].length - 1) {
            i6 = 1;
        }
        if (i6 != 0) {
            dwVarArr[ih.aj.ac((byte) -6)] = null;
        } else {
            dwVarArr[ih.aj.ac((byte) -35)] = this.aa[i][i2 + 1];
        }
        int ac = ih.ac.ac((byte) -73);
        if (i6 == 0 && i4 == 0) {
            dwVar = this.aa[i + 1][i2 + 1];
        } else {
            dwVar = null;
        }
        dwVarArr[ac] = dwVar;
        ac = ih.ap.ac((byte) -34);
        if (i6 == 0 && i3 == 0) {
            dwVar = this.aa[i - 1][i2 + 1];
        } else {
            dwVar = null;
        }
        dwVarArr[ac] = dwVar;
        dwVarArr[ih.an.ac((byte) -38)] = i4 != 0 ? null : this.aa[i + 1][i2];
        dwVarArr[ih.ak.ac((byte) -25)] = i3 != 0 ? null : this.aa[i - 1][i2];
        dwVarArr[ih.ao.ac((byte) -76)] = i5 != 0 ? null : this.aa[i][i2 - 1];
        i6 = ih.aq.ac((byte) -19);
        if (i5 == 0 && i4 == 0) {
            dwVar = this.aa[i + 1][i2 - 1];
        } else {
            dwVar = null;
        }
        dwVarArr[i6] = dwVar;
        int ac2 = ih.aa.ac((byte) -124);
        if (i5 == 0 && i3 == 0) {
            dwVar2 = this.aa[i - 1][i2 - 1];
        }
        dwVarArr[ac2] = dwVar2;
    }

    void ao(int i, int i2, dw[] dwVarArr, byte b) {
        Object obj;
        Object obj2 = null;
        if (i <= 0) {
            obj = 1;
        } else {
            obj = null;
        }
        try {
            Object obj3;
            Object obj4;
            dw dwVar;
            dw dwVar2;
            if (i >= this.aa.length - 1) {
                obj3 = 1;
            } else {
                obj3 = null;
            }
            if (i2 <= 0) {
                obj4 = 1;
            } else {
                obj4 = null;
            }
            if (i2 >= this.aa[0].length - 1) {
                obj2 = 1;
            }
            if (obj2 != null) {
                dwVarArr[ih.aj.ac((byte) -49)] = null;
            } else {
                dwVarArr[ih.aj.ac((byte) -68)] = this.aa[i][i2 + 1];
            }
            int ac = ih.ac.ac((byte) -17);
            if (obj2 == null && obj3 == null) {
                dwVar = this.aa[i + 1][i2 + 1];
            } else {
                dwVar = null;
            }
            dwVarArr[ac] = dwVar;
            ac = ih.ap.ac((byte) -125);
            dwVar = (obj2 == null && obj == null) ? this.aa[i - 1][i2 + 1] : null;
            dwVarArr[ac] = dwVar;
            int ac2 = ih.an.ac((byte) -78);
            if (obj3 != null) {
                dwVar = null;
            } else {
                dwVar = this.aa[i + 1][i2];
            }
            dwVarArr[ac2] = dwVar;
            ac2 = ih.ak.ac((byte) -13);
            if (obj != null) {
                dwVar = null;
            } else {
                dwVar = this.aa[i - 1][i2];
            }
            dwVarArr[ac2] = dwVar;
            ac2 = ih.ao.ac((byte) -113);
            if (obj4 != null) {
                dwVar = null;
            } else {
                dwVar = this.aa[i][i2 - 1];
            }
            dwVarArr[ac2] = dwVar;
            ac2 = ih.aq.ac((byte) -44);
            if (obj4 == null && obj3 == null) {
                dwVar = this.aa[i + 1][i2 - 1];
            } else {
                dwVar = null;
            }
            dwVarArr[ac2] = dwVar;
            int ac3 = ih.aa.ac((byte) -58);
            if (obj4 == null && obj == null) {
                dwVar2 = this.aa[i - 1][i2 - 1];
            } else {
                dwVar2 = null;
            }
            dwVarArr[ac3] = dwVar2;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ao(" + ')');
        }
    }

    public void aa(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar, short s) {
        try {
            if (this.aq != null) {
                esVar.av(this.aq, i, i2, i3, i4, -83700737);
                if (i5 > 0 && i5 % i6 < i6 / 2) {
                    if (this.ao == null) {
                        ai(-260659983);
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        List<di> list = (List) this.ao.get(Integer.valueOf(((Integer) it.next()).intValue()));
                        if (list != null) {
                            for (di diVar : list) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.aa(" + ')');
        }
    }

    public void ab(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.aq != null) {
            esVar.av(this.aq, i, i2, i3, i4, 481582119);
            if (i5 <= 0) {
                return;
            }
            if (i5 % i6 < i6 / 2) {
                if (this.ao == null) {
                    ai(-2126691609);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<di> list = (List) this.ao.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (di diVar : list) {
                        }
                    }
                }
            }
        }
    }

    public void bh(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.aq != null) {
            esVar.av(this.aq, i, i2, i3, i4, 1809419559);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.ao == null) {
                    ai(-922280297);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<di> list = (List) this.ao.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (di diVar : list) {
                        }
                    }
                }
            }
        }
    }

    public void bm(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.aq != null) {
            esVar.av(this.aq, i, i2, i3, i4, 639767258);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.ao == null) {
                    ai(-599938985);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<di> list = (List) this.ao.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (di diVar : list) {
                        }
                    }
                }
            }
        }
    }

    public void bp(int i, int i2, int i3, int i4, HashSet hashSet, int i5, int i6, es esVar) {
        if (this.aq != null) {
            esVar.av(this.aq, i, i2, i3, i4, -59359231);
            if (i5 > 0 && i5 % i6 < i6 / 2) {
                if (this.ao == null) {
                    ai(-1063859970);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    List<di> list = (List) this.ao.get(Integer.valueOf(((Integer) it.next()).intValue()));
                    if (list != null) {
                        for (di diVar : list) {
                        }
                    }
                }
            }
        }
    }

    public List ak(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            LinkedList linkedList = new LinkedList();
            if (!this.aj) {
                return linkedList;
            }
            dg ap = ap(i, i2, i3, i4, -1247142525);
            int aw = (int) (aw(i7, i3 - i, (short) -6619) * 64.0f);
            int i12 = (this.ah * -182706189) + i;
            int i13 = (this.ai * -1942060923) + i2;
            for (int i14 = ap.an * -1386667975; i14 < (-1150806225 * ap.aj) + (ap.an * -1386667975); i14++) {
                for (int i15 = 943910533 * ap.aq; i15 < (943910533 * ap.aq) + (ap.ac * -1725622131); i15++) {
                    Collection bi = this.aa[i14][i15].bi(((((-1154826688 * this.aa[i14][i15].aa) - i12) * aw) / 64) + i5, (i6 + i8) - (((((-1058728000 * this.aa[i14][i15].ak) - i13) + 64) * aw) / 64), aw, i9, i10, 1051406098);
                    if (!bi.isEmpty()) {
                        linkedList.addAll(bi);
                    }
                }
            }
            return linkedList;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ak(" + ')');
        }
    }

    public List bb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.aj) {
            return linkedList;
        }
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7, i3 - i, (short) -7582) * 64.0f);
        int i11 = (this.ah * -182706189) + i;
        int i12 = (this.ai * -354887437) + i2;
        for (int i13 = ap.an * -1386667975; i13 < (-1836487451 * ap.aj) + (ap.an * -1386667975); i13++) {
            for (int i14 = 1677652547 * ap.aq; i14 < (943910533 * ap.aq) + (ap.ac * -1725622131); i14++) {
                Collection bi = this.aa[i13][i14].bi(((((-1154826688 * this.aa[i13][i14].aa) - i11) * aw) / -2079926026) + i5, (i6 + i8) - (((((-1058728000 * this.aa[i13][i14].ak) - i12) + 64) * aw) / 64), aw, i9, i10, 1965795517);
                if (!bi.isEmpty()) {
                    linkedList.addAll(bi);
                }
            }
        }
        return linkedList;
    }

    public List br(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.aj) {
            return linkedList;
        }
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7, i3 - i, (short) 969) * 64.0f);
        int i11 = (this.ah * -1151708777) + i;
        int i12 = (this.ai * -1942060923) + i2;
        for (int i13 = ap.an * -1386667975; i13 < (-1150806225 * ap.aj) + (ap.an * 1927843384); i13++) {
            for (int i14 = -606809452 * ap.aq; i14 < (1681261361 * ap.aq) + (ap.ac * -1725622131); i14++) {
                Collection bi = this.aa[i13][i14].bi(((((-1154826688 * this.aa[i13][i14].aa) - i11) * aw) / -271624199) + i5, (i6 + i8) - (((((1985026579 * this.aa[i13][i14].ak) - i12) + 64) * aw) / 64), aw, i9, i10, 1751863861);
                if (!bi.isEmpty()) {
                    linkedList.addAll(bi);
                }
            }
        }
        return linkedList;
    }

    public List bt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        LinkedList linkedList = new LinkedList();
        if (!this.aj) {
            return linkedList;
        }
        dg ap = ap(i, i2, i3, i4, -1247142525);
        int aw = (int) (aw(i7, i3 - i, (short) -16808) * 64.0f);
        int i11 = (this.ah * -182706189) + i;
        int i12 = (this.ai * -1942060923) + i2;
        for (int i13 = ap.an * -1386667975; i13 < (1204992158 * ap.aj) + (ap.an * -2103011003); i13++) {
            for (int i14 = -1075399146 * ap.aq; i14 < (943910533 * ap.aq) + (ap.ac * -225862187); i14++) {
                Collection bi = this.aa[i13][i14].bi(((((-1154826688 * this.aa[i13][i14].aa) - i11) * aw) / 64) + i5, (i6 + i8) - (((((-1058728000 * this.aa[i13][i14].ak) - i12) + 64) * aw) / 64), aw, i9, i10, 1867733063);
                if (!bi.isEmpty()) {
                    linkedList.addAll(bi);
                }
            }
        }
        return linkedList;
    }

    dg ap(int i, int i2, int i3, int i4, int i5) {
        try {
            dg dgVar = new dg(this);
            int i6 = ((this.ah * -182706189) + i) / 64;
            int i7 = ((-1942060923 * this.ai) + i2) / 64;
            int i8 = ((this.ai * -1942060923) + i4) / 64;
            dgVar.aj = (((((this.ah * -182706189) + i3) / 64) - i6) + 1) * 1941868495;
            dgVar.ac = ((i8 - i7) + 1) * -1582405051;
            dgVar.an = (i6 - this.an.av(897322914)) * -814690807;
            dgVar.aq = (i7 - this.an.ag((byte) -58)) * -1743922611;
            if (dgVar.an * -1386667975 < 0) {
                dgVar.aj += dgVar.an * 2036262167;
                dgVar.an = 0;
            }
            if (dgVar.an * -1386667975 > this.aa.length - (dgVar.aj * -1150806225)) {
                dgVar.aj = (this.aa.length - (dgVar.an * -1386667975)) * 1941868495;
            }
            if (dgVar.aq * 943910533 < 0) {
                dgVar.ac += dgVar.aq * -1540138023;
                dgVar.aq = 0;
            }
            if (dgVar.aq * 943910533 > this.aa[0].length - (-1725622131 * dgVar.ac)) {
                dgVar.ac = (this.aa[0].length - (dgVar.aq * 943910533)) * -1582405051;
            }
            dgVar.aj = Math.min(dgVar.aj * -1150806225, this.aa.length) * 1941868495;
            dgVar.ac = Math.min(-1725622131 * dgVar.ac, this.aa[0].length) * -1582405051;
            return dgVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ap(" + ')');
        }
    }

    dg bd(int i, int i2, int i3, int i4) {
        dg dgVar = new dg(this);
        int i5 = ((this.ah * -182706189) + i) / 1863058232;
        int i6 = ((this.ai * -1942060923) + i2) / 64;
        int i7 = ((this.ai * -1942060923) + i4) / -1161561791;
        dgVar.aj = (((((this.ah * -182706189) + i3) / 64) - i5) + 1) * 198122892;
        dgVar.ac = ((i7 - i6) + 1) * -1582405051;
        dgVar.an = (i5 - this.an.av(1997514983)) * 1095049676;
        dgVar.aq = (i6 - this.an.ag((byte) -71)) * 590111525;
        if (dgVar.an * -80220520 < 0) {
            dgVar.aj += dgVar.an * -1715627947;
            dgVar.an = 0;
        }
        if (-1386667975 * dgVar.an > this.aa.length - (dgVar.aj * 214285058)) {
            dgVar.aj = (this.aa.length - (dgVar.an * -1111363320)) * 1941868495;
        }
        if (975977907 * dgVar.aq < 0) {
            dgVar.ac += dgVar.aq * 498387834;
            dgVar.aq = 0;
        }
        if (943910533 * dgVar.aq > this.aa[0].length - (dgVar.ac * -1725622131)) {
            dgVar.ac = -738931350 * (this.aa[0].length - (-552144436 * dgVar.aq));
        }
        dgVar.aj = Math.min(dgVar.aj * -1524827958, this.aa.length) * 1941868495;
        dgVar.ac = Math.min(dgVar.ac * -1725622131, this.aa[0].length) * 1969029341;
        return dgVar;
    }

    dg bu(int i, int i2, int i3, int i4) {
        dg dgVar = new dg(this);
        int i5 = ((this.ah * -182706189) + i) / -1884411753;
        int i6 = ((-1942060923 * this.ai) + i2) / 64;
        int i7 = ((this.ai * -493904541) + i4) / 64;
        dgVar.aj = (((((this.ah * -182706189) + i3) / 1373320752) - i5) + 1) * 1941868495;
        dgVar.ac = ((i7 - i6) + 1) * -2088001430;
        dgVar.an = (i5 - this.an.av(1445801262)) * -814690807;
        dgVar.aq = (i6 - this.an.ag((byte) -92)) * -1743922611;
        if (dgVar.an * -1096315580 < 0) {
            dgVar.aj += dgVar.an * 2036262167;
            dgVar.an = 0;
        }
        if (718653885 * dgVar.an > this.aa.length - (dgVar.aj * 37656002)) {
            dgVar.aj = (this.aa.length - (dgVar.an * -1386667975)) * 1941868495;
        }
        if (dgVar.aq * 943910533 < 0) {
            dgVar.ac += dgVar.aq * -1480898865;
            dgVar.aq = 0;
        }
        if (-1171295317 * dgVar.aq > this.aa[0].length - (dgVar.ac * -1725622131)) {
            dgVar.ac = -1582405051 * (this.aa[0].length - (dgVar.aq * 943910533));
        }
        dgVar.aj = Math.min(dgVar.aj * 707060589, this.aa.length) * 1941868495;
        dgVar.ac = Math.min(dgVar.ac * -1725622131, this.aa[0].length) * 1055685441;
        return dgVar;
    }

    dg bx(int i, int i2, int i3, int i4) {
        dg dgVar = new dg(this);
        int i5 = ((this.ah * 1191853822) + i) / 64;
        int i6 = ((-1942060923 * this.ai) + i2) / -1030326479;
        int i7 = ((this.ai * -699459189) + i4) / 64;
        dgVar.aj = (((((this.ah * 483188752) + i3) / 64) - i5) + 1) * 1941868495;
        dgVar.ac = ((i7 - i6) + 1) * -1582405051;
        dgVar.an = (i5 - this.an.av(2008011524)) * -814690807;
        dgVar.aq = (i6 - this.an.ag((byte) -74)) * -1743922611;
        if (dgVar.an * -1386667975 < 0) {
            dgVar.aj += dgVar.an * 1813311645;
            dgVar.an = 0;
        }
        if (dgVar.an * -1386667975 > this.aa.length - (dgVar.aj * -1150806225)) {
            dgVar.aj = (this.aa.length - (dgVar.an * -1386667975)) * 1090572624;
        }
        if (dgVar.aq * 943910533 < 0) {
            dgVar.ac += dgVar.aq * -1540138023;
            dgVar.aq = 0;
        }
        if (337966589 * dgVar.aq > this.aa[0].length - (1322853274 * dgVar.ac)) {
            dgVar.ac = -1873877806 * (this.aa[0].length - (dgVar.aq * 943910533));
        }
        dgVar.aj = Math.min(dgVar.aj * 513512653, this.aa.length) * 1935740872;
        dgVar.ac = Math.min(-1642290101 * dgVar.ac, this.aa[0].length) * -1582405051;
        return dgVar;
    }

    dg by(int i, int i2, int i3, int i4) {
        dg dgVar = new dg(this);
        int i5 = ((this.ah * -182706189) + i) / 2055697419;
        int i6 = ((-1942060923 * this.ai) + i2) / 1363956699;
        int i7 = ((this.ai * -762606930) + i4) / 64;
        dgVar.aj = (((((this.ah * -880110512) + i3) / 64) - i5) + 1) * 472428337;
        dgVar.ac = ((i7 - i6) + 1) * -1582405051;
        dgVar.an = (i5 - this.an.av(1311821037)) * -814690807;
        dgVar.aq = (i6 - this.an.ag((byte) -81)) * 755631584;
        if (dgVar.an * -1386667975 < 0) {
            dgVar.aj += dgVar.an * -1075758112;
            dgVar.an = 0;
        }
        if (1575654728 * dgVar.an > this.aa.length - (dgVar.aj * -1150806225)) {
            dgVar.aj = (this.aa.length - (dgVar.an * -1386667975)) * 1941868495;
        }
        if (318540586 * dgVar.aq < 0) {
            dgVar.ac += dgVar.aq * -1540138023;
            dgVar.aq = 0;
        }
        if (943910533 * dgVar.aq > this.aa[0].length - (-1725622131 * dgVar.ac)) {
            dgVar.ac = (this.aa[0].length - (2048825023 * dgVar.aq)) * -1582405051;
        }
        dgVar.aj = Math.min(dgVar.aj * -939169267, this.aa.length) * 1941868495;
        dgVar.ac = Math.min(1972084644 * dgVar.ac, this.aa[0].length) * -1582405051;
        return dgVar;
    }

    public boolean at(int i) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.at(" + ')');
        }
    }

    public boolean bi() {
        return this.aj;
    }

    public HashMap ah(int i) {
        try {
            ai(-953498107);
            return this.ao;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ah(" + ')');
        }
    }

    public HashMap bo() {
        ai(-1404149816);
        return this.ao;
    }

    public HashMap bs() {
        ai(-1232392621);
        return this.ao;
    }

    void ai(int i) {
        try {
            if (this.ao == null) {
                this.ao = new HashMap();
            }
            this.ao.clear();
            for (int i2 = 0; i2 < this.aa.length; i2++) {
                for (dw bs : this.aa[i2]) {
                    for (di diVar : bs.bs((short) 255)) {
                        if (this.ao.containsKey(Integer.valueOf(diVar.aj * 963317847))) {
                            ((List) this.ao.get(Integer.valueOf(diVar.aj * 963317847))).add(diVar);
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(diVar);
                            this.ao.put(Integer.valueOf(diVar.aj * 963317847), linkedList);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.ai(" + ')');
        }
    }

    void bq() {
        if (this.ao == null) {
            this.ao = new HashMap();
        }
        this.ao.clear();
        for (int i = 0; i < this.aa.length; i++) {
            for (dw bs : this.aa[i]) {
                for (di diVar : bs.bs((short) 255)) {
                    if (this.ao.containsKey(Integer.valueOf(diVar.aj * 963317847))) {
                        ((List) this.ao.get(Integer.valueOf(diVar.aj * 963317847))).add(diVar);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(diVar);
                        this.ao.put(Integer.valueOf(diVar.aj * 1938148076), linkedList);
                    }
                }
            }
        }
    }

    void bz() {
        if (this.ao == null) {
            this.ao = new HashMap();
        }
        this.ao.clear();
        for (int i = 0; i < this.aa.length; i++) {
            for (dw bs : this.aa[i]) {
                for (di diVar : bs.bs((short) 255)) {
                    if (this.ao.containsKey(Integer.valueOf(963317847 * diVar.aj))) {
                        ((List) this.ao.get(Integer.valueOf(-853624028 * diVar.aj))).add(diVar);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(diVar);
                        this.ao.put(Integer.valueOf(diVar.aj * -1587488061), linkedList);
                    }
                }
            }
        }
    }

    float aw(int i, int i2, short s) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        try {
            int round = Math.round(f);
            return Math.abs(((float) round) - f) < 0.05f ? (float) round : f;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.aw(" + ')');
        }
    }

    float ba(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        return Math.abs(((float) round) - f) < 0.05f ? (float) round : f;
    }

    float bj(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        if (Math.abs(((float) round) - f) < 0.05f) {
            return (float) round;
        }
        return f;
    }

    float bv(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        int round = Math.round(f);
        return Math.abs(((float) round) - f) < 0.05f ? (float) round : f;
    }

    static void az(kh khVar, kh khVar2, es esVar, int i) {
        try {
            int i2;
            int i3;
            int i4 = fw.dt.an * -124114311;
            int i5 = fw.dt.aq * 142688287;
            if (ev.cx == null) {
                ev.cx = cg.ak(cf.cy, "sl_back", "", (byte) 50);
            }
            if (cn.cd == null) {
                cn.cd = fc.ao(cf.cy, "sl_flags", "", (byte) -34);
            }
            if (fb.cw == null) {
                fb.cw = fc.ao(cf.cy, "sl_arrows", "", (byte) -89);
            }
            if (aa.cn == null) {
                aa.cn = fc.ao(cf.cy, "sl_stars", "", (byte) -38);
            }
            esVar.aq(fw.ac * -1775170451, 23, 765, 480, -16777216, (byte) 21);
            esVar.at(-1775170451 * fw.ac, 0, 125, 23, 12425273, 9135624, -1599714565);
            esVar.at((fw.ac * -1775170451) + 125, 0, 640, 23, 5197647, 2697513, 1140856626);
            khVar.aw(ix.kz, (fw.ac * -1775170451) + 62, 15, 0, -1, esVar);
            if (aa.cn != null) {
                esVar.au(aa.cn[1], (fw.ac * -1775170451) + 140, 1, 699188377);
                khVar2.at(ix.km, (-1775170451 * fw.ac) + 152, 10, 16777215, -1, esVar);
                esVar.au(aa.cn[0], (-1775170451 * fw.ac) + 140, 12, 829605182);
                khVar2.at(ix.kx, (fw.ac * -1775170451) + 152, 21, 16777215, -1, esVar);
            }
            if (fb.cw != null) {
                fl flVar;
                fl flVar2;
                if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                    flVar = fb.cw[2];
                } else {
                    flVar = fb.cw[0];
                }
                if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                    flVar2 = fb.cw[3];
                } else {
                    flVar2 = fb.cw[1];
                }
                i2 = (fw.ac * -1775170451) + 280;
                esVar.au(flVar, i2, 4, 422706369);
                esVar.au(flVar2, i2 + 15, 4, 379062137);
                i3 = i2 + 32;
                khVar.at(ix.ky, i3, 17, 16777215, -1, esVar);
                i2 = (fw.ac * -1775170451) + 390;
                esVar.au(flVar, i2, 4, 1202902506);
                esVar.au(flVar2, i2 + 15, 4, 75397881);
                i3 = i2 + 32;
                khVar.at(ix.kb, i3, 17, 16777215, -1, esVar);
                i2 = (-1775170451 * fw.ac) + 500;
                esVar.au(flVar, i2, 4, 702604403);
                esVar.au(flVar2, i2 + 15, 4, 1739906186);
                i3 = i2 + 32;
                khVar.at(ix.kr, i3, 17, 16777215, -1, esVar);
                i2 = (fw.ac * -1775170451) + 610;
                esVar.au(flVar, i2, 4, 1472031979);
                esVar.au(flVar2, i2 + 15, 4, 1082932678);
                i3 = i2 + 32;
                khVar.at(ix.kq, i3, 17, 16777215, -1, esVar);
            }
            esVar.aq((fw.ac * -1775170451) + 708, 4, 50, 16, -16777216, (byte) 39);
            khVar2.aw(ix.jg, ((-1775170451 * fw.ac) + 708) + 25, 16, 16777215, -1, esVar);
            fw.cj = -576720127;
            if (ev.cx != null) {
                int i6;
                int i7;
                int i8;
                int i9 = 8;
                i2 = 24;
                while (true) {
                    if ((i9 - 1) * i2 >= gh.aa * 518175009) {
                        i3 = i9 - 1;
                    } else {
                        i3 = i9;
                    }
                    if ((i2 - 1) * i3 >= 518175009 * gh.aa) {
                        i6 = i2 - 1;
                    } else {
                        i6 = i2;
                    }
                    if ((i6 - 1) * i3 >= 518175009 * gh.aa) {
                        i6--;
                    }
                    if (i6 == i2 && i3 == i9) {
                        break;
                    }
                    i2 = i6;
                    i9 = i3;
                }
                i2 = (765 - (88 * i3)) / (i3 + 1);
                if (i2 > 5) {
                    i7 = 5;
                } else {
                    i7 = i2;
                }
                i2 = (480 - (19 * i6)) / (i6 + 1);
                if (i2 > 5) {
                    i8 = 5;
                } else {
                    i8 = i2;
                }
                int i10 = ((480 - (19 * i6)) - ((i6 - 1) * i8)) / 2;
                int i11 = i10 + 23;
                i3 = (fw.ac * -1775170451) + (((765 - (i3 * 88)) - ((i3 - 1) * i7)) / 2);
                Object obj = null;
                int i12 = 0;
                int i13 = 0;
                while (i12 < 518175009 * gh.aa) {
                    String str;
                    Object obj2;
                    gh ghVar = gh.ao[i12];
                    String num = Integer.toString(ghVar.am * 794816761);
                    Object obj3;
                    if (-1 == ghVar.am * 794816761) {
                        str = ix.ki;
                        obj3 = null;
                    } else if (ghVar.am * 794816761 > 1980) {
                        str = ix.kc;
                        obj3 = null;
                    } else {
                        str = num;
                        i2 = 1;
                    }
                    int i14 = 0;
                    if (ghVar.am(2102291782)) {
                        if (ghVar.ap(1809826635)) {
                            i9 = 7;
                        } else {
                            i9 = 6;
                        }
                    } else if (ghVar.aw(858017230)) {
                        i14 = 16711680;
                        if (ghVar.ap(1742747601)) {
                            i9 = 5;
                        } else {
                            i9 = 4;
                        }
                    } else if (ghVar.ah(801210115)) {
                        if (ghVar.ap(1406923804)) {
                            i9 = 3;
                        } else {
                            i9 = 2;
                        }
                    } else if (ghVar.ap(1681658330)) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if (i4 < i3 || i5 < i11 || i4 >= i3 + 88 || i5 >= i11 + 19 || r1 == null) {
                        esVar.al(ev.cx[i9], i3, i11, -2125265139);
                        obj2 = obj;
                    } else {
                        fw.cj = 576720127 * i12;
                        esVar.ag(ev.cx[i9], i3, i11, cj.ak, 16777215, 2136548279);
                        obj2 = 1;
                    }
                    if (cn.cd != null) {
                        fl[] flVarArr = cn.cd;
                        if (ghVar.ap(1580778613)) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        esVar.au(flVarArr[i2 + (ghVar.al * 700245205)], i3 + 29, i11, 92796569);
                    }
                    khVar.aw(Integer.toString(ghVar.ai * 1057964181), i3 + 15, (i11 + 9) + 5, i14, -1, esVar);
                    khVar2.aw(str, i3 + 60, (i11 + 9) + 5, 268435455, -1, esVar);
                    i9 = i11 + (i8 + 19);
                    i2 = i13 + 1;
                    if (i2 >= i6) {
                        i9 = i10 + 23;
                        i3 += i7 + 88;
                        i2 = 0;
                    }
                    i12++;
                    obj = obj2;
                    i13 = i2;
                    i11 = i9;
                }
                if (obj != null) {
                    i11 = khVar2.aq(gh.ao[-2013859073 * fw.cj].as) + 6;
                    int i15 = khVar2.ak + 8;
                    esVar.aq(i4 - (i11 / 2), (i5 + 20) + 5, i11, i15, 16777120, (byte) 124);
                    esVar.fd(i4 - (i11 / 2), (i5 + 20) + 5, i11, i15, 0, (short) -5492);
                    khVar2.aw(gh.ao[-2013859073 * fw.cj].as, i4, (((i5 + 20) + 5) + khVar2.ak) + 4, 0, -1, esVar);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.az(" + ')');
        }
    }

    static final void dt(boolean z, hn hnVar, int i) {
        int i2 = 0;
        try {
            int jc;
            client.hy = 0;
            client.db = 0;
            ai.do(764838441);
            while (hnVar.ja(client.dp.ap * 272865957, 1338568416) >= 27) {
                int jc2 = hnVar.jc(15, 1908448708);
                if (jc2 == 32767) {
                    break;
                }
                int i3;
                if (client.cj[jc2] == null) {
                    client.cj[jc2] = new ft();
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                ft ftVar = client.cj[jc2];
                int[] iArr = client.dh;
                int i4 = client.dk - 612455167;
                client.dk = i4;
                iArr[(i4 * 1886016257) - 1] = jc2;
                ftVar.db = client.af * -1904053401;
                if (z) {
                    jc = hnVar.jc(8, 1769077500);
                    if (jc > 127) {
                        i4 = jc - 256;
                    }
                    i4 = jc;
                } else {
                    jc = hnVar.jc(5, 1745535436);
                    if (jc > 15) {
                        i4 = jc - 32;
                    }
                    i4 = jc;
                }
                jc = client.hp[hnVar.jc(3, 1832171557)];
                if (i3 != 0) {
                    jc *= 1459691823;
                    ftVar.bu = jc;
                    ftVar.de = jc * -1245599125;
                }
                ftVar.aj = ag.aj(hnVar.jc(14, 1655690001), (byte) 46);
                i3 = hnVar.jc(1, 1978048378);
                if (z) {
                    jc = hnVar.jc(8, 1695457589);
                    if (jc > 127) {
                        jc -= 256;
                    }
                } else {
                    jc = hnVar.jc(5, 1779424728);
                    if (jc > 15) {
                        jc -= 32;
                    }
                }
                if (hnVar.jc(1, 1550156648) == 1) {
                    int[] iArr2 = client.dl;
                    int i5 = client.db - 872650929;
                    client.db = i5;
                    iArr2[(i5 * 1194086319) - 1] = jc2;
                }
                ftVar.bd = ftVar.aj.ak * -1573231187;
                ftVar.dp = ftVar.aj.bt * 348102737;
                if (1497962279 * ftVar.dp == 0) {
                    ftVar.bu = 0;
                }
                ftVar.bs = ftVar.aj.am * 616642851;
                ftVar.bo = 1305572179 * ftVar.aj.ae;
                ftVar.bz = ftVar.aj.as * -296135971;
                ftVar.bq = ftVar.aj.al * 1378694421;
                ftVar.by = ftVar.aj.ah * -991597229;
                ftVar.bx = ftVar.aj.ai * 107589931;
                ftVar.bi = ftVar.aj.aw * 2012844555;
                ftVar.ac(i4 + cx.hb.dd[0], cx.hb.ds[0] + jc, i3 == 1, -980055498);
            }
            hnVar.jz((byte) 4);
            ga.dj(hnVar, (byte) 85);
            for (jc = 0; jc < -812537643 * client.hy; jc++) {
                int i6 = client.hr[jc];
                if (client.af * 901275591 != client.cj[i6].db * 1739609249) {
                    client.cj[i6].aj = null;
                    client.cj[i6] = null;
                }
            }
            if (client.dp.ap * 272865957 != 489625177 * hnVar.ac) {
                throw new RuntimeException((489625177 * hnVar.ac) + gw.ac + (client.dp.ap * 272865957));
            }
            while (i2 < client.dk * 1886016257) {
                if (client.cj[client.dh[i2]] == null) {
                    throw new RuntimeException(i2 + gw.ac + (client.dk * 1886016257));
                }
                i2++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dx.dt(" + ')');
        }
    }

    public static boolean er(byte b) {
        try {
            return 549859959 * client.hj == 1;
        } catch (Throwable e) {
            throw ei.ac(e, "dx.er(" + ')');
        }
    }
}
