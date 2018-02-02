package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ni {
    static final int aa = 50;
    static final int ac = -1;
    static final lq ah = lq.aa;
    static final int aj = -65536;
    static final int ao = 3;
    static final lq ap = lq.aq;
    static final float aq = 30.0f;
    static final lq at = lq.ao;
    int ab = -1383816695;
    float ad;
    HashMap ae;
    nf af;
    int ag = 170509129;
    kh ai;
    ju ak;
    df al;
    fl[] am;
    float ar;
    df as;
    int au;
    int av;
    HashMap aw;
    dx ax;
    int ay = -721054313;
    df az;
    int ba = 0;
    boolean bb = false;
    bt bc = null;
    int bd = -456458919;
    final int[] be = new int[]{gp.cr, cs.cp, ak.ct, hz.cm, bx.ck};
    HashSet bg = new HashSet();
    int bh = -1135353899;
    int bi = -1619882361;
    boolean bj = false;
    int bm = -480571367;
    Iterator bn;
    HashSet bo = new HashSet();
    int bp = -2079878493;
    HashSet bq = new HashSet();
    int br = -1983315730;
    HashSet bs = new HashSet();
    int bt = -1760425677;
    HashSet bu = null;
    List bw;
    int bx = -1553975393;
    int by = 585734087;
    HashSet bz = new HashSet();

    public void aj(ju juVar, kh khVar, HashMap hashMap, fl[] flVarArr, byte b) {
        try {
            this.am = flVarArr;
            this.ak = juVar;
            this.ai = khVar;
            this.aw = new HashMap();
            this.aw.put(dn.aj, hashMap.get(ap));
            this.aw.put(dn.ac, hashMap.get(at));
            this.aw.put(dn.an, hashMap.get(ah));
            this.af = new nf(juVar);
            int au = this.ak.au(dj.aj.aa, -1153961656);
            int[] ae = this.ak.ae(au, -1507699407);
            this.ae = new HashMap(ae.length);
            for (int i = 0; i < ae.length; i++) {
                he heVar = new he(this.ak.an(au, ae[i], 250957321));
                df dfVar = new df();
                dfVar.ap(heVar, ae[i], 1845559781);
                this.ae.put(dfVar.az(1331521266), dfVar);
                if (dfVar.al(1027541604)) {
                    this.as = dfVar;
                }
            }
            ae(this.as, 1933320084);
            this.az = null;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.aj(" + ')');
        }
    }

    public void co(ju juVar, kh khVar, HashMap hashMap, fl[] flVarArr) {
        this.am = flVarArr;
        this.ak = juVar;
        this.ai = khVar;
        this.aw = new HashMap();
        this.aw.put(dn.aj, hashMap.get(ap));
        this.aw.put(dn.ac, hashMap.get(at));
        this.aw.put(dn.an, hashMap.get(ah));
        this.af = new nf(juVar);
        int au = this.ak.au(dj.aj.aa, -1685424112);
        int[] ae = this.ak.ae(au, -1697151806);
        this.ae = new HashMap(ae.length);
        for (int i = 0; i < ae.length; i++) {
            he heVar = new he(this.ak.an(au, ae[i], 192141432));
            df dfVar = new df();
            dfVar.ap(heVar, ae[i], 1845559781);
            this.ae.put(dfVar.az(1331521266), dfVar);
            if (dfVar.al(1081795393)) {
                this.as = dfVar;
            }
        }
        ae(this.as, 1794798122);
        this.az = null;
    }

    public int ac(byte b) {
        try {
            if (this.ak.ar(this.as.az(1331521266), dj.aq.aa, (byte) 66)) {
                return 100;
            }
            return this.ak.bp(this.as.az(1331521266), -2116122605);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ac(" + ')');
        }
    }

    public int ca() {
        if (this.ak.ar(this.as.az(1331521266), dj.aq.aa, (byte) 81)) {
            return 100;
        }
        return this.ak.bp(this.as.az(1331521266), -1770961908);
    }

    public int cc() {
        if (this.ak.ar(this.as.az(1331521266), dj.aq.aa, (byte) 95)) {
            return 100;
        }
        return this.ak.bp(this.as.az(1331521266), -1806940255);
    }

    public int cf() {
        if (this.ak.ar(this.as.az(1331521266), dj.aq.aa, (byte) 114)) {
            return 100;
        }
        return this.ak.bp(this.as.az(1331521266), -1961686585);
    }

    public void an(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.af.an((short) 1024)) {
                aa(2051196715);
                ak((byte) 16);
                if (z) {
                    di diVar;
                    gd gdVar;
                    dc dcVar;
                    int ceil = (int) Math.ceil((double) (((float) i5) / this.ar));
                    int ceil2 = (int) Math.ceil((double) (((float) i6) / this.ar));
                    List<di> ak = this.ax.ak(((this.au * -1859700103) - (ceil / 2)) - 1, ((616192953 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.au * -1859700103)) + 1, ((ceil2 / 2) + (616192953 * this.av)) + 1, i3, i4, i5, i6, i, i2, -554523328);
                    HashSet hashSet = new HashSet();
                    for (di diVar2 : ak) {
                        hashSet.add(diVar2);
                        gdVar = new gd();
                        dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                        gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, -19223477);
                        if (this.bg.contains(diVar2)) {
                            gdVar.ac(ar.ap, -382246444);
                        } else {
                            gdVar.ac(ar.aa, -382246444);
                        }
                        dg.aj(gdVar, -1968793779);
                    }
                    Iterator it = this.bg.iterator();
                    while (it.hasNext()) {
                        diVar2 = (di) it.next();
                        if (!hashSet.contains(diVar2)) {
                            gdVar = new gd();
                            dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                            gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, 1836596176);
                            gdVar.ac(ar.ak, -382246444);
                            dg.aj(gdVar, -1147359703);
                        }
                    }
                    this.bg = hashSet;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.an(" + ')');
        }
    }

    public void cp(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            aa(1638349603);
            ak((byte) 16);
            if (z) {
                di diVar;
                gd gdVar;
                dc dcVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.ar));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.ar));
                List<di> ak = this.ax.ak(((this.au * -1859700103) - (ceil / 2)) - 1, ((1960487701 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.au * 1026643157)) + 1, ((ceil2 / 2) + (912457105 * this.av)) + 1, i3, i4, i5, i6, i, i2, -554523328);
                HashSet hashSet = new HashSet();
                for (di diVar2 : ak) {
                    hashSet.add(diVar2);
                    gdVar = new gd();
                    dcVar = new dc(-530784906 * diVar2.aj, diVar2.an, diVar2.ac);
                    gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, -311625544);
                    if (this.bg.contains(diVar2)) {
                        gdVar.ac(ar.ap, -382246444);
                    } else {
                        gdVar.ac(ar.aa, -382246444);
                    }
                    dg.aj(gdVar, 536850267);
                }
                Iterator it = this.bg.iterator();
                while (it.hasNext()) {
                    diVar2 = (di) it.next();
                    if (!hashSet.contains(diVar2)) {
                        gdVar = new gd();
                        dcVar = new dc(954352449 * diVar2.aj, diVar2.an, diVar2.ac);
                        gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, 1865580680);
                        gdVar.ac(ar.ak, -382246444);
                        dg.aj(gdVar, -479118338);
                    }
                }
                this.bg = hashSet;
            }
        }
    }

    public void cr(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            aa(1685368854);
            ak((byte) 16);
            if (z) {
                di diVar;
                gd gdVar;
                dc dcVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.ar));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.ar));
                List<di> ak = this.ax.ak(((this.au * -1859700103) - (ceil / 2)) - 1, ((616192953 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.au * -1859700103)) + 1, ((ceil2 / 2) + (616192953 * this.av)) + 1, i3, i4, i5, i6, i, i2, -554523328);
                HashSet hashSet = new HashSet();
                for (di diVar2 : ak) {
                    hashSet.add(diVar2);
                    gdVar = new gd();
                    dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                    gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, 1170105073);
                    if (this.bg.contains(diVar2)) {
                        gdVar.ac(ar.ap, -382246444);
                    } else {
                        gdVar.ac(ar.aa, -382246444);
                    }
                    dg.aj(gdVar, -1965034657);
                }
                Iterator it = this.bg.iterator();
                while (it.hasNext()) {
                    diVar2 = (di) it.next();
                    if (!hashSet.contains(diVar2)) {
                        gdVar = new gd();
                        dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                        gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, 857059373);
                        gdVar.ac(ar.ak, -382246444);
                        dg.aj(gdVar, -946423302);
                    }
                }
                this.bg = hashSet;
            }
        }
    }

    public void ct(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            aa(1594570246);
            ak((byte) 16);
            if (z) {
                di diVar;
                gd gdVar;
                dc dcVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.ar));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.ar));
                List<di> ak = this.ax.ak(((this.au * -1859700103) - (ceil / 2)) - 1, ((616192953 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.au * -1859700103)) + 1, ((ceil2 / 2) + (616192953 * this.av)) + 1, i3, i4, i5, i6, i, i2, -554523328);
                HashSet hashSet = new HashSet();
                for (di diVar2 : ak) {
                    hashSet.add(diVar2);
                    gdVar = new gd();
                    dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                    gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, -25000829);
                    if (this.bg.contains(diVar2)) {
                        gdVar.ac(ar.ap, -382246444);
                    } else {
                        gdVar.ac(ar.aa, -382246444);
                    }
                    dg.aj(gdVar, -545336976);
                }
                Iterator it = this.bg.iterator();
                while (it.hasNext()) {
                    diVar2 = (di) it.next();
                    if (!hashSet.contains(diVar2)) {
                        gdVar = new gd();
                        dcVar = new dc(963317847 * diVar2.aj, diVar2.an, diVar2.ac);
                        gdVar.aj(new Object[]{dcVar, Integer.valueOf(i), Integer.valueOf(i2)}, 1503323911);
                        gdVar.ac(ar.ak, -382246444);
                        dg.aj(gdVar, -371257132);
                    }
                }
                this.bg = hashSet;
            }
        }
    }

    public void aq(int i, int i2, boolean z, boolean z2, int i3) {
        try {
            ao(i, i2, z2, -2004784070);
            if (ap((byte) 4) || fz.aa != bu.au.aj) {
                this.bi = -1619882361;
                this.bx = -1553975393;
                return;
            }
            int i4 = bu.au.ap[0];
            i4 = bu.au.at[0];
            if (-1 == this.bx * 102292385) {
                this.bx = this.au * 1924313049;
                this.bi = this.av * -2089352335;
            }
            i4 = bu.au.ap[0] - bu.au.aa[0];
            int i5 = bu.au.at[0] - bu.au.ak[0];
            if (!ap((byte) 11)) {
                this.au = ((this.bx * 102292385) - ((int) (((float) i4) / this.ad))) * 141955017;
                this.av = ((-768661303 * this.bi) + ((int) (((float) i5) / this.ad))) * 736443017;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.aq(" + ')');
        }
    }

    public void ce(int i, int i2, boolean z, boolean z2) {
        ao(i, i2, z2, -2004784070);
        if (ap((byte) -30) || fz.aa != bu.au.aj) {
            this.bi = -1619882361;
            this.bx = -1553975393;
            return;
        }
        int i3 = bu.au.ap[0];
        i3 = bu.au.at[0];
        if (-1 == this.bx * 102292385) {
            this.bx = this.au * 1924313049;
            this.bi = this.av * -2089352335;
        }
        i3 = bu.au.ap[0] - bu.au.aa[0];
        int i4 = bu.au.at[0] - bu.au.ak[0];
        if (!ap((byte) -23)) {
            this.au = ((this.bx * 102292385) - ((int) (((float) i3) / this.ad))) * 141955017;
            this.av = ((-768661303 * this.bi) + ((int) (((float) i4) / this.ad))) * 736443017;
        }
    }

    public void ck(int i, int i2, boolean z, boolean z2) {
        ao(i, i2, z2, -2004784070);
        if (ap((byte) -26) || fz.aa != bu.au.aj) {
            this.bi = -1619882361;
            this.bx = -1553975393;
            return;
        }
        int i3 = bu.au.ap[0];
        i3 = bu.au.at[0];
        if (-1 == this.bx * 102292385) {
            this.bx = this.au * 1924313049;
            this.bi = this.av * -2089352335;
        }
        i3 = bu.au.ap[0] - bu.au.aa[0];
        int i4 = bu.au.at[0] - bu.au.ak[0];
        if (!ap((byte) 77)) {
            this.au = ((this.bx * 102292385) - ((int) (((float) i3) / this.ad))) * 141955017;
            this.av = ((-768661303 * this.bi) + ((int) (((float) i4) / this.ad))) * 736443017;
        }
    }

    public void cm(int i, int i2, boolean z, boolean z2) {
        ao(i, i2, z2, -2004784070);
        if (ap((byte) -19) || fz.aa != bu.au.aj) {
            this.bi = -1615561314;
            this.bx = -1553975393;
            return;
        }
        int i3 = bu.au.ap[0];
        i3 = bu.au.at[0];
        if (-1 == this.bx * 102292385) {
            this.bx = this.au * 1924313049;
            this.bi = this.av * -2089352335;
        }
        i3 = bu.au.ap[0] - bu.au.aa[0];
        int i4 = bu.au.at[0] - bu.au.ak[0];
        if (!ap((byte) -2)) {
            this.au = ((this.bx * 13757145) - ((int) (((float) i3) / this.ad))) * 141955017;
            this.av = ((-768661303 * this.bi) + ((int) (((float) i4) / this.ad))) * 736443017;
        }
    }

    void ao(int i, int i2, boolean z, int i3) {
        try {
            if (!dt.fw(1796787023)) {
                return;
            }
            if (this.al != null) {
                this.bc = this.al.am(((int) (((float) (this.au * -1859700103)) + ((((float) (i - (this.bm * -320556073))) - ((((float) bd(1991140871)) * this.ar) / 2.0f)) / this.ar))) + (this.al.av(943473789) * 64), ((int) (((float) (this.av * 616192953)) - ((((float) (i2 - (this.bh * 1874042499))) - ((((float) by(1187753896)) * this.ar) / 2.0f)) / this.ar))) + (this.al.ag((byte) -33) * 64), 1055588648);
                if (this.bc != null && z && bu.au.ab(82, -957446162) && bu.au.ab(81, -1664794145) && z) {
                    ac.fs(-486841375 * this.bc.ac, -1974196523 * this.bc.an, -201339469 * this.bc.aj, -1343407811);
                    return;
                }
                return;
            }
            this.bc = null;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ao(" + ')');
        }
    }

    void ch(int i, int i2, boolean z) {
        if (!dt.fw(1996273898)) {
            return;
        }
        if (this.al != null) {
            this.bc = this.al.am(((int) (((float) (this.au * -353290873)) + ((((float) (i - (this.bm * -510514434))) - ((((float) bd(-65390866)) * this.ar) / 2.0f)) / this.ar))) + (this.al.av(1302224602) * 64), ((int) (((float) (this.av * 616192953)) - ((((float) (i2 - (this.bh * -455271555))) - ((((float) by(1192951119)) * this.ar) / 2.0f)) / this.ar))) + (this.al.ag((byte) -104) * -636088396), 1308362567);
            if (this.bc != null && z && bu.au.ab(82, -1840364411) && bu.au.ab(81, -557070026) && z) {
                ac.fs(-486841375 * this.bc.ac, -1974196523 * this.bc.an, 1622914471 * this.bc.aj, 999615295);
                return;
            }
            return;
        }
        this.bc = null;
    }

    void ci(int i, int i2, boolean z) {
        if (!dt.fw(1255824025)) {
            return;
        }
        if (this.al != null) {
            this.bc = this.al.am(((int) (((float) (this.au * 505781236)) + ((((float) (i - (this.bm * 1180360220))) - ((((float) bd(490575304)) * this.ar) / 2.0f)) / this.ar))) + (this.al.av(2001241508) * 2049768913), ((int) (((float) (this.av * 1552674314)) - ((((float) (i2 - (this.bh * 1874042499))) - ((((float) by(1126318926)) * this.ar) / 2.0f)) / this.ar))) + (this.al.ag((byte) -69) * 64), 2139612986);
            if (this.bc != null && z && bu.au.ab(82, -1173099535) && bu.au.ab(-388680234, -1580720137) && z) {
                ac.fs(131062933 * this.bc.ac, 559767903 * this.bc.an, 330723222 * this.bc.aj, -451075351);
                return;
            }
            return;
        }
        this.bc = null;
    }

    void aa(int i) {
        try {
            if (this.ar < this.ad) {
                this.ar = Math.min(this.ad, this.ar + (this.ar / aq));
            }
            if (this.ar > this.ad) {
                this.ar = Math.max(this.ad, this.ar - (this.ar / aq));
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.aa(" + ')');
        }
    }

    void cq() {
        if (this.ar < this.ad) {
            this.ar = Math.min(this.ad, this.ar + (this.ar / aq));
        }
        if (this.ar > this.ad) {
            this.ar = Math.max(this.ad, this.ar - (this.ar / aq));
        }
    }

    void cv() {
        if (this.ar < this.ad) {
            this.ar = Math.min(this.ad, this.ar + (this.ar / aq));
        }
        if (this.ar > this.ad) {
            this.ar = Math.max(this.ad, this.ar - (this.ar / aq));
        }
    }

    void ak(byte b) {
        try {
            if (ap((byte) 64)) {
                int i = (this.ay * 166839769) - (this.au * -1859700103);
                int i2 = (this.ag * -101359353) - (this.av * 616192953);
                if (i != 0) {
                    i /= Math.min(8, Math.abs(i));
                }
                if (i2 != 0) {
                    i2 /= Math.min(8, Math.abs(i2));
                }
                this.au = (i * 141955017) + this.au;
                this.av = (i2 * 736443017) + this.av;
                if (this.ay * 166839769 == this.au * -1859700103 && this.av * 616192953 == this.ag * -101359353) {
                    this.ay = -721054313;
                    this.ag = 170509129;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ak(" + ')');
        }
    }

    void cu() {
        if (ap((byte) -61)) {
            int i = (this.ay * 166839769) - (this.au * -1859700103);
            int i2 = (this.ag * -101359353) - (this.av * 616192953);
            if (i != 0) {
                i /= Math.min(8, Math.abs(i));
            }
            if (i2 != 0) {
                i2 /= Math.min(8, Math.abs(i2));
            }
            this.au = (i * 141955017) + this.au;
            this.av = (i2 * 736443017) + this.av;
            if (this.ay * 166839769 == this.au * -1859700103 && this.av * 616192953 == this.ag * -101359353) {
                this.ay = -721054313;
                this.ag = 170509129;
            }
        }
    }

    boolean ap(byte b) {
        try {
            return (-1 == 166839769 * this.ay || -1 == -101359353 * this.ag) ? false : true;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ap(" + ')');
        }
    }

    boolean cg() {
        return (-1 == -616952013 * this.ay || -1 == -101359353 * this.ag) ? false : true;
    }

    boolean cs() {
        return (-1 == 1542301434 * this.ay || -1 == -1543378707 * this.ag) ? false : true;
    }

    public df at(int i, int i2, int i3, int i4) {
        try {
            for (df dfVar : this.ae.values()) {
                if (dfVar.ah(i, i2, i3, 1207600786)) {
                    return dfVar;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.at(" + ')');
        }
    }

    public df cd(int i, int i2, int i3) {
        for (df dfVar : this.ae.values()) {
            if (dfVar.ah(i, i2, i3, 1646913493)) {
                return dfVar;
            }
        }
        return null;
    }

    public df cw(int i, int i2, int i3) {
        for (df dfVar : this.ae.values()) {
            if (dfVar.ah(i, i2, i3, 495894510)) {
                return dfVar;
            }
        }
        return null;
    }

    public df cx(int i, int i2, int i3) {
        for (df dfVar : this.ae.values()) {
            if (dfVar.ah(i, i2, i3, -1001395463)) {
                return dfVar;
            }
        }
        return null;
    }

    public void ah(int i, int i2, int i3, boolean z, int i4) {
        try {
            df dfVar;
            df at = at(i, i2, i3, -486789888);
            if (at != null) {
                dfVar = at;
            } else if (z) {
                dfVar = this.as;
            } else {
                return;
            }
            Object obj = null;
            if (dfVar != this.az || z) {
                this.az = dfVar;
                ae(dfVar, 1972154797);
                obj = 1;
            }
            if (obj != null || z) {
                az(i, i2, i3, -1351781628);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ah(" + ')');
        }
    }

    public void cj(int i, int i2, int i3, boolean z) {
        Object obj;
        df at = at(i, i2, i3, -1581570826);
        if (at == null) {
            if (z) {
                at = this.as;
            } else {
                return;
            }
        }
        if (at != this.az || z) {
            this.az = at;
            ae(at, 1811141497);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null || z) {
            az(i, i2, i3, -1351781628);
        }
    }

    public void cn(int i, int i2, int i3, boolean z) {
        Object obj;
        df at = at(i, i2, i3, -154772569);
        if (at == null) {
            if (z) {
                at = this.as;
            } else {
                return;
            }
        }
        if (at != this.az || z) {
            this.az = at;
            ae(at, 1799506468);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null || z) {
            az(i, i2, i3, -1351781628);
        }
    }

    public void cz(int i, int i2, int i3, boolean z) {
        Object obj;
        df at = at(i, i2, i3, 234414352);
        if (at == null) {
            if (z) {
                at = this.as;
            } else {
                return;
            }
        }
        if (at != this.az || z) {
            this.az = at;
            ae(at, 1981204789);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null || z) {
            az(i, i2, i3, -1351781628);
        }
    }

    public void ai(int i, int i2) {
        try {
            df ab = ab(i, 86898411);
            if (ab != null) {
                ae(ab, 1950701803);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ai(" + ')');
        }
    }

    public void da(int i) {
        df ab = ab(i, 1033237144);
        if (ab != null) {
            ae(ab, 1836379982);
        }
    }

    public int aw(int i) {
        try {
            if (this.al == null) {
                return -1;
            }
            return this.al.as(994533941);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.aw(" + ')');
        }
    }

    public df am(int i) {
        try {
            return this.al;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.am(" + ')');
        }
    }

    void ae(df dfVar, int i) {
        try {
            if (this.al == null || this.al != dfVar) {
                as(dfVar, (byte) -6);
                az(-1, -1, -1, -1351781628);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ae(" + ')');
        }
    }

    void di(df dfVar) {
        if (this.al == null || this.al != dfVar) {
            as(dfVar, (byte) -26);
            az(-1, -1, -1, -1351781628);
        }
    }

    void dv(df dfVar) {
        if (this.al == null || this.al != dfVar) {
            as(dfVar, (byte) -5);
            az(-1, -1, -1, -1351781628);
        }
    }

    void dw(df dfVar) {
        if (this.al == null || this.al != dfVar) {
            as(dfVar, (byte) 0);
            az(-1, -1, -1, -1351781628);
        }
    }

    void as(df dfVar, byte b) {
        try {
            this.al = dfVar;
            this.ax = new dx(this.am, this.aw);
            this.af.aj(this.al.az(1331521266), (byte) 23);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.as(" + ')');
        }
    }

    void dq(df dfVar) {
        this.al = dfVar;
        this.ax = new dx(this.am, this.aw);
        this.af.aj(this.al.az(1331521266), (byte) 38);
    }

    public void al(df dfVar, bt btVar, bt btVar2, boolean z, int i) {
        if (dfVar != null) {
            try {
                if (this.al == null || this.al != dfVar) {
                    as(dfVar, (byte) -123);
                }
                if (z || !this.al.ah(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1696715100)) {
                    az(btVar2.aj * -201339469, btVar2.ac * -486841375, btVar2.an * -1974196523, -1351781628);
                } else {
                    az(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1351781628);
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ni.al(" + ')');
            }
        }
    }

    public void do(df dfVar, bt btVar, bt btVar2, boolean z) {
        if (dfVar != null) {
            if (this.al == null || this.al != dfVar) {
                as(dfVar, (byte) -25);
            }
            if (z || !this.al.ah(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1641035162)) {
                az(btVar2.aj * -201339469, btVar2.ac * -486841375, btVar2.an * -1974196523, -1351781628);
            } else {
                az(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1351781628);
            }
        }
    }

    public void dt(df dfVar, bt btVar, bt btVar2, boolean z) {
        if (dfVar != null) {
            if (this.al == null || this.al != dfVar) {
                as(dfVar, (byte) -64);
            }
            if (z || !this.al.ah(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, 1240251023)) {
                az(btVar2.aj * -201339469, btVar2.ac * -486841375, btVar2.an * -1974196523, -1351781628);
            } else {
                az(btVar.aj * -201339469, btVar.ac * -486841375, btVar.an * -1974196523, -1351781628);
            }
        }
    }

    void az(int i, int i2, int i3, int i4) {
        try {
            if (this.al != null) {
                int[] aw = this.al.aw(i, i2, i3, -2137494254);
                if (aw == null) {
                    aw = this.al.aw(this.al.ab(582100429), this.al.ad(1492288809), this.al.bp(-1147295448), 1373226364);
                }
                this.au = (aw[0] - (this.al.av(1272427104) * 64)) * 141955017;
                this.av = (aw[1] - (this.al.ag((byte) -65) * 64)) * 736443017;
                this.ay = -721054313;
                this.ag = 170509129;
                this.ar = ay(this.al.au(-566499809), (byte) 70);
                this.ad = this.ar;
                this.bw = null;
                this.bn = null;
                this.ax.ac((short) -17782);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.az(" + ')');
        }
    }

    void dj(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, 1425008265);
            if (aw == null) {
                aw = this.al.aw(this.al.ab(582100429), this.al.ad(1492288809), this.al.bp(-1894043147), -598235585);
            }
            this.au = (aw[0] - (this.al.av(968204819) * 64)) * 141955017;
            this.av = (aw[1] - (this.al.ag((byte) -89) * 64)) * 736443017;
            this.ay = -721054313;
            this.ag = 170509129;
            this.ar = ay(this.al.au(156280726), (byte) 109);
            this.ad = this.ar;
            this.bw = null;
            this.bn = null;
            this.ax.ac((short) -5325);
        }
    }

    void dz(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, 270703030);
            if (aw == null) {
                aw = this.al.aw(this.al.ab(582100429), this.al.ad(1492288809), this.al.bp(-1594286417), -1461736482);
            }
            this.au = (aw[0] - (this.al.av(1131781337) * 64)) * 1020064470;
            this.av = (aw[1] - (this.al.ag((byte) -88) * 64)) * 736443017;
            this.ay = -1506585598;
            this.ag = -384688760;
            this.ar = ay(this.al.au(113315202), (byte) 99);
            this.ad = this.ar;
            this.bw = null;
            this.bn = null;
            this.ax.ac((short) -12348);
        }
    }

    public void ax(int i, int i2, int i3, int i4, int i5, es esVar, int i6) {
        try {
            int[] iArr = new int[4];
            esVar.fn(iArr, 1205856611);
            esVar.fj(i, i2, i3 + i, i4 + i2, -2055987132);
            esVar.aq(i, i2, i3, i4, -16777216, (byte) 41);
            int aq = this.af.aq(1237461797);
            if (aq < 100) {
                av(i, i2, i3, i4, aq, esVar, 1632735818);
                return;
            }
            if (!this.ax.at(16820250)) {
                this.ax.aj(this.ak, this.al.az(1331521266), client.at, -1908898614);
                if (!this.ax.at(740364056)) {
                    return;
                }
            }
            if (this.bu != null) {
                this.by -= 585734087;
                if ((-269679095 * this.by) % (this.br * -727599121) == 0) {
                    this.by = 0;
                    this.bd += 456458919;
                }
                if (this.bd * -1530624745 >= this.bt * -776253967 && !this.bb) {
                    this.bu = null;
                }
            }
            int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
            this.ax.an((-1859700103 * this.au) - (ceil / 2), (this.av * 616192953) - (ceil2 / 2), (this.au * -1859700103) + (ceil / 2), (616192953 * this.av) + (ceil2 / 2), i, i2, i + i3, i4 + i2, esVar, (byte) -1);
            if (!this.bj) {
                boolean z = false;
                if (i5 - (490943317 * this.ba) > 100) {
                    this.ba = 1857499645 * i5;
                    z = true;
                }
                this.ax.aq((-1859700103 * this.au) - (ceil / 2), (this.av * 616192953) - (ceil2 / 2), (-1859700103 * this.au) + (ceil / 2), (ceil2 / 2) + (this.av * 616192953), i, i2, i + i3, i2 + i4, this.bq, this.bu, this.by * -269679095, -727599121 * this.br, z, esVar, -1190543273);
            }
            if (dt.fw(1725349984) && this.bc != null) {
                this.ai.at("Coord: " + this.bc, (889727047 * esVar.aa) + 10, (-1857728003 * esVar.aq) + 20, 16776960, -1, esVar);
            }
            this.ab = 1383816695 * ceil;
            this.bp = 2079878493 * ceil2;
            this.bm = 480571367 * i;
            this.bh = 1135353899 * i2;
            esVar.fl(iArr, -1033166256);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ax(" + ')');
        }
    }

    public void dm(int i, int i2, int i3, int i4, int i5, es esVar) {
        int[] iArr = new int[4];
        esVar.fn(iArr, 2019865537);
        esVar.fj(i, i2, i3 + i, i4 + i2, -1170917365);
        esVar.aq(i, i2, i3, i4, -16777216, (byte) 47);
        int aq = this.af.aq(-1560081402);
        if (aq < 100) {
            av(i, i2, i3, i4, aq, esVar, -817803382);
            return;
        }
        if (!this.ax.at(978659192)) {
            this.ax.aj(this.ak, this.al.az(1331521266), client.at, -1966687945);
            if (!this.ax.at(308859474)) {
                return;
            }
        }
        if (this.bu != null) {
            this.by -= 585734087;
            if ((-269679095 * this.by) % (this.br * -727599121) == 0) {
                this.by = 0;
                this.bd += 456458919;
            }
            if (this.bd * -1530624745 >= this.bt * -776253967 && !this.bb) {
                this.bu = null;
            }
        }
        int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
        int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
        this.ax.an((-1859700103 * this.au) - (ceil / 2), (this.av * 616192953) - (ceil2 / 2), (this.au * -1859700103) + (ceil / 2), (616192953 * this.av) + (ceil2 / 2), i, i2, i + i3, i4 + i2, esVar, (byte) -1);
        if (!this.bj) {
            boolean z = false;
            if (i5 - (490943317 * this.ba) > 100) {
                this.ba = 1857499645 * i5;
                z = true;
            }
            this.ax.aq((-1859700103 * this.au) - (ceil / 2), (this.av * 616192953) - (ceil2 / 2), (-1859700103 * this.au) + (ceil / 2), (ceil2 / 2) + (this.av * 616192953), i, i2, i + i3, i2 + i4, this.bq, this.bu, this.by * -269679095, -727599121 * this.br, z, esVar, -2092536003);
        }
        if (dt.fw(1031632479) && this.bc != null) {
            this.ai.at("Coord: " + this.bc, (889727047 * esVar.aa) + 10, (-1857728003 * esVar.aq) + 20, 16776960, -1, esVar);
        }
        this.ab = 1383816695 * ceil;
        this.bp = 2079878493 * ceil2;
        this.bm = 480571367 * i;
        this.bh = 1135353899 * i2;
        esVar.fl(iArr, -1835635988);
    }

    public void af(int i, int i2, int i3, int i4, es esVar, int i5) {
        try {
            if (this.af.an((short) 1024)) {
                if (!this.ax.at(1934968969)) {
                    this.ax.aj(this.ak, this.al.az(1331521266), client.at, -1669870367);
                    if (!this.ax.at(1411286581)) {
                        return;
                    }
                }
                this.ax.aa(i, i2, i3, i4, this.bu, -269679095 * this.by, this.br * -727599121, esVar, (short) 224);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.af(" + ')');
        }
    }

    public void dg(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.an((short) 1024)) {
            if (!this.ax.at(1023464895)) {
                this.ax.aj(this.ak, this.al.az(1331521266), client.at, -1827263388);
                if (!this.ax.at(1768787767)) {
                    return;
                }
            }
            this.ax.aa(i, i2, i3, i4, this.bu, -269679095 * this.by, this.br * -727599121, esVar, (short) 224);
        }
    }

    public void dn(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.an((short) 1024)) {
            if (!this.ax.at(1409236090)) {
                this.ax.aj(this.ak, this.al.az(1331521266), client.at, -1637814933);
                if (!this.ax.at(927868213)) {
                    return;
                }
            }
            this.ax.aa(i, i2, i3, i4, this.bu, 1718323042 * this.by, this.br * -727599121, esVar, (short) 224);
        }
    }

    public void du(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.an((short) 1024)) {
            if (!this.ax.at(1429842330)) {
                this.ax.aj(this.ak, this.al.az(1331521266), client.at, -2107011216);
                if (!this.ax.at(967644874)) {
                    return;
                }
            }
            this.ax.aa(i, i2, i3, i4, this.bu, -269679095 * this.by, this.br * -727599121, esVar, (short) 224);
        }
    }

    public void au(int i, int i2) {
        try {
            this.ad = ay(i, (byte) 111);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.au(" + ')');
        }
    }

    public void df(int i) {
        this.ad = ay(i, (byte) 45);
    }

    public void dy(int i) {
        this.ad = ay(i, (byte) 7);
    }

    void av(int i, int i2, int i3, int i4, int i5, es esVar, int i6) {
        try {
            int i7 = i + (i3 / 2);
            int i8 = (((i4 / 2) + i2) - 18) - 20;
            esVar.aq(i, i2, i3, i4, -16777216, (byte) 46);
            esVar.fd(i7 - 152, i8, 304, 34, aj, (short) -14240);
            esVar.aq(i7 - 150, i8 + 2, i5 * 3, 30, aj, (byte) 29);
            this.ai.aw(ix.kn, i7, 20 + i8, -1, -1, esVar);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.av(" + ')');
        }
    }

    void dc(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.aq(i, i2, i3, i4, -16777216, (byte) 70);
        esVar.fd(i6 - 152, i7, 304, 34, aj, (short) -298);
        esVar.aq(i6 - -514572137, i7 + 2, i5 * 3, 30, aj, (byte) 18);
        this.ai.aw(ix.kn, i6, 20 + i7, -1, -1, esVar);
    }

    void ei(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.aq(i, i2, i3, i4, -16777216, (byte) 20);
        esVar.fd(i6 - 152, i7, 304, 34, aj, (short) -23475);
        esVar.aq(i6 - 150, i7 + 2, i5 * 3, 30, aj, (byte) 77);
        this.ai.aw(ix.kn, i6, 20 + i7, -1, -1, esVar);
    }

    float ay(int i, byte b) {
        if (25 == i) {
            return 1.0f;
        }
        if (i == 37) {
            return 1.5f;
        }
        if (i == 50) {
            return 2.0f;
        }
        if (75 == i) {
            return 3.0f;
        }
        if (100 == i) {
            return 4.0f;
        }
        return 8.0f;
    }

    float ep(int i) {
        if (25 == i) {
            return 1.0f;
        }
        if (i == 1121071680) {
            return 1.5f;
        }
        if (i == 50) {
            return 2.0f;
        }
        if (75 == i) {
            return 3.0f;
        }
        if (562147374 == i) {
            return 4.0f;
        }
        return 8.0f;
    }

    float eq(int i) {
        if (25 == i) {
            return 1.0f;
        }
        if (i == 558009282) {
            return 1.5f;
        }
        if (i == 50) {
            return 2.0f;
        }
        if (-1043898674 == i) {
            return 3.0f;
        }
        if (100 == i) {
            return 4.0f;
        }
        return 8.0f;
    }

    float eu(int i) {
        if (25 == i) {
            return 1.0f;
        }
        if (i == -1526739371) {
            return 1.5f;
        }
        if (i == 50) {
            return 2.0f;
        }
        if (1965419814 == i) {
            return 3.0f;
        }
        return 414585392 == i ? 4.0f : 8.0f;
    }

    public int ag(int i) {
        try {
            if (((double) this.ad) == 1.0d) {
                return 25;
            }
            if (((double) this.ad) == 1.5d) {
                return 37;
            }
            if (((double) this.ad) == 2.0d) {
                return 50;
            }
            if (3.0d == ((double) this.ad)) {
                return 75;
            }
            if (((double) this.ad) == 4.0d) {
                return 100;
            }
            return fr.ak;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ag(" + ')');
        }
    }

    public int eh() {
        if (((double) this.ad) == 1.0d) {
            return 25;
        }
        if (((double) this.ad) == 1.5d) {
            return 37;
        }
        if (((double) this.ad) == 2.0d) {
            return 798808424;
        }
        if (3.0d == ((double) this.ad)) {
            return 269639332;
        }
        return ((double) this.ad) == 4.0d ? 34743899 : -1164842572;
    }

    public int ej() {
        if (((double) this.ad) == 1.0d) {
            return 25;
        }
        if (((double) this.ad) == 1.5d) {
            return 37;
        }
        if (((double) this.ad) == 2.0d) {
            return 50;
        }
        if (3.0d == ((double) this.ad)) {
            return 75;
        }
        if (((double) this.ad) == 4.0d) {
            return 100;
        }
        return fr.ak;
    }

    public void ar(int i) {
        try {
            this.af.ac(791193260);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ar(" + ')');
        }
    }

    public void eb() {
        this.af.ac(-1593325135);
    }

    public void ek() {
        this.af.ac(401109564);
    }

    public boolean ad(int i) {
        try {
            return this.af.an((short) 1024);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ad(" + ')');
        }
    }

    public boolean ez() {
        return this.af.an((short) 1024);
    }

    public df ab(int i, int i2) {
        try {
            for (df dfVar : this.ae.values()) {
                if (dfVar.as(2059412883) == i) {
                    return dfVar;
                }
            }
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ab(" + ')');
        }
    }

    public df el(int i) {
        for (df dfVar : this.ae.values()) {
            if (dfVar.as(519868345) == i) {
                return dfVar;
            }
        }
        return null;
    }

    public df ey(int i) {
        for (df dfVar : this.ae.values()) {
            if (dfVar.as(-74425517) == i) {
                return dfVar;
            }
        }
        return null;
    }

    public void bp(int i, int i2, int i3) {
        try {
            if (this.al != null && this.al.ai(i, i2, (short) -11371)) {
                this.ay = (i - (this.al.av(2004561426) * 64)) * 721054313;
                this.ag = (i2 - (this.al.ag((byte) -18) * 64)) * -170509129;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bp(" + ')');
        }
    }

    public void ec(int i, int i2) {
        if (this.al != null && this.al.ai(i, i2, (short) -4195)) {
            this.ay = (i - (this.al.av(2075586426) * 1716081076)) * 1562995512;
            this.ag = (i2 - (this.al.ag((byte) -92) * 64)) * 1765625387;
        }
    }

    public void ed(int i, int i2) {
        if (this.al != null && this.al.ai(i, i2, (short) -9683)) {
            this.ay = (i - (this.al.av(1168413527) * 64)) * 1634514008;
            this.ag = (i2 - (this.al.ag((byte) -39) * -1604594479)) * -170509129;
        }
    }

    public void et(int i, int i2) {
        if (this.al != null && this.al.ai(i, i2, (short) -13951)) {
            this.ay = (i - (this.al.av(826975305) * 64)) * 721054313;
            this.ag = (i2 - (this.al.ag((byte) -15) * 64)) * -170509129;
        }
    }

    public void ex(int i, int i2) {
        if (this.al != null && this.al.ai(i, i2, (short) -12127)) {
            this.ay = (i - (this.al.av(1448866605) * 64)) * 721054313;
            this.ag = (i2 - (this.al.ag((byte) -98) * 64)) * -170509129;
        }
    }

    public void bm(int i, int i2, byte b) {
        try {
            if (this.al != null) {
                this.au = (i - (this.al.av(904383183) * 64)) * 141955017;
                this.av = (i2 - (this.al.ag((byte) -53) * 64)) * 736443017;
                this.ay = -721054313;
                this.ag = 170509129;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bm(" + ')');
        }
    }

    public void ea(int i, int i2) {
        if (this.al != null) {
            this.au = (i - (this.al.av(926899995) * 64)) * 141955017;
            this.av = (i2 - (this.al.ag((byte) -34) * 64)) * 736443017;
            this.ay = -721054313;
            this.ag = 170509129;
        }
    }

    public void ee(int i, int i2) {
        if (this.al != null) {
            this.au = (i - (this.al.av(1781204646) * -284696225)) * 141955017;
            this.av = (i2 - (this.al.ag((byte) -63) * 64)) * 736443017;
            this.ay = -721054313;
            this.ag = 1321779580;
        }
    }

    public void er(int i, int i2) {
        if (this.al != null) {
            this.au = (i - (this.al.av(874585074) * 64)) * 141955017;
            this.av = (i2 - (this.al.ag((byte) -17) * 64)) * 736443017;
            this.ay = -721054313;
            this.ag = 170509129;
        }
    }

    public void bh(int i, int i2, int i3, int i4) {
        try {
            if (this.al != null) {
                int[] aw = this.al.aw(i, i2, i3, -314082786);
                if (aw != null) {
                    bp(aw[0], aw[1], -553422060);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bh(" + ')');
        }
    }

    public void eg(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -794301543);
            if (aw != null) {
                bp(aw[0], aw[1], -553422060);
            }
        }
    }

    public void em(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -498182411);
            if (aw != null) {
                bp(aw[0], aw[1], -553422060);
            }
        }
    }

    public void en(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -345166332);
            if (aw != null) {
                bp(aw[0], aw[1], -553422060);
            }
        }
    }

    public void eo(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -1374435195);
            if (aw != null) {
                bp(aw[0], aw[1], -553422060);
            }
        }
    }

    public void ew(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, 1295509726);
            if (aw != null) {
                bp(aw[0], aw[1], -553422060);
            }
        }
    }

    public void bt(int i, int i2, int i3, int i4) {
        try {
            if (this.al != null) {
                int[] aw = this.al.aw(i, i2, i3, 770347296);
                if (aw != null) {
                    bm(aw[0], aw[1], (byte) -64);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bt(" + ')');
        }
    }

    public void ef(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -826352198);
            if (aw != null) {
                bm(aw[0], aw[1], (byte) -36);
            }
        }
    }

    public void es(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, 57576799);
            if (aw != null) {
                bm(aw[0], aw[1], (byte) -4);
            }
        }
    }

    public void ev(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -342484968);
            if (aw != null) {
                bm(aw[0], aw[1], (byte) -34);
            }
        }
    }

    public void fj(int i, int i2, int i3) {
        if (this.al != null) {
            int[] aw = this.al.aw(i, i2, i3, -33655696);
            if (aw != null) {
                bm(aw[0], aw[1], (byte) 54);
            }
        }
    }

    public int br(int i) {
        try {
            if (this.al == null) {
                return -1;
            }
            return (this.au * -1859700103) + (this.al.av(1118306951) * 64);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.br(" + ')');
        }
    }

    public int fi() {
        if (this.al == null) {
            return -1;
        }
        return (this.au * 177838610) + (this.al.av(1678862304) * 64);
    }

    public int fl() {
        if (this.al == null) {
            return -1;
        }
        return (this.au * -1859700103) + (this.al.av(1739884444) * 64);
    }

    public int fn() {
        if (this.al == null) {
            return -1;
        }
        return (this.au * -1859700103) + (this.al.av(1334835443) * 64);
    }

    public int bb(int i) {
        try {
            if (this.al == null) {
                return -1;
            }
            return (616192953 * this.av) + (this.al.ag((byte) -127) * 64);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bb(" + ')');
        }
    }

    public int fd() {
        if (this.al == null) {
            return -1;
        }
        return (616192953 * this.av) + (this.al.ag((byte) -17) * 64);
    }

    public int fv() {
        if (this.al == null) {
            return -1;
        }
        return (-1702571871 * this.av) + (this.al.ag((byte) -54) * 64);
    }

    public bt bu(short s) {
        try {
            if (this.al == null) {
                return null;
            }
            return this.al.am(br(65535), bb(1383337614), 787240728);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bu(" + ')');
        }
    }

    public bt fh() {
        if (this.al == null) {
            return null;
        }
        return this.al.am(br(65535), bb(-990627002), 546399333);
    }

    public bt fq() {
        if (this.al == null) {
            return null;
        }
        return this.al.am(br(65535), bb(2039609077), 258541855);
    }

    public int bd(int i) {
        try {
            return -683904057 * this.ab;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bd(" + ')');
        }
    }

    public int ff() {
        return -683904057 * this.ab;
    }

    public int fk() {
        return -683904057 * this.ab;
    }

    public int fo() {
        return -683904057 * this.ab;
    }

    public int ft() {
        return -1058439079 * this.ab;
    }

    public int fz() {
        return 310466846 * this.ab;
    }

    public int by(int i) {
        try {
            return -707703051 * this.bp;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.by(" + ')');
        }
    }

    public int fe() {
        return -707703051 * this.bp;
    }

    public int fu() {
        return -707703051 * this.bp;
    }

    public void bx(int i, int i2) {
        if (i >= 1) {
            try {
                this.bt = -586808559 * i;
            } catch (Throwable e) {
                throw ei.ac(e, "ni.bx(" + ')');
            }
        }
    }

    public void fb(int i) {
        if (i >= 1) {
            this.bt = -1505305224 * i;
        }
    }

    public void fc(int i) {
        if (i >= 1) {
            this.bt = 1442048800 * i;
        }
    }

    public void fm(int i) {
        if (i >= 1) {
            this.bt = -167039111 * i;
        }
    }

    public void fs(int i) {
        if (i >= 1) {
            this.bt = 1072849231 * i;
        }
    }

    public void bi(byte b) {
        try {
            this.bt = -1760425677;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bi(" + ')');
        }
    }

    public void fw() {
        this.bt = -1760425677;
    }

    public void bs(int i, byte b) {
        if (i >= 1) {
            try {
                this.br = 389830415 * i;
            } catch (Throwable e) {
                throw ei.ac(e, "ni.bs(" + ')');
            }
        }
    }

    public void fg(int i) {
        if (i >= 1) {
            this.br = 389830415 * i;
        }
    }

    public void fx(int i) {
        if (i >= 1) {
            this.br = 1381477469 * i;
        }
    }

    public void bo(byte b) {
        try {
            this.br = -1983315730;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bo(" + ')');
        }
    }

    public void fp() {
        this.br = -1983315730;
    }

    public void fr() {
        this.br = -1983315730;
    }

    public void fy() {
        this.br = -1740071562;
    }

    public void bz(boolean z, int i) {
        try {
            this.bb = z;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bz(" + ')');
        }
    }

    public void fa(boolean z) {
        this.bb = z;
    }

    public void bq(int i, int i2) {
        try {
            this.bu = new HashSet();
            this.bu.add(Integer.valueOf(i));
            this.bd = 0;
            this.by = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bq(" + ')');
        }
    }

    public void gh(int i) {
        this.bu = new HashSet();
        this.bu.add(Integer.valueOf(i));
        this.bd = 0;
        this.by = 0;
    }

    public void gi(int i) {
        this.bu = new HashSet();
        this.bu.add(Integer.valueOf(i));
        this.bd = 0;
        this.by = 0;
    }

    public void bj(int i, int i2) {
        int i3 = 0;
        try {
            this.bu = new HashSet();
            this.bd = 0;
            this.by = 0;
            while (i3 < aa.ac.length) {
                if (aa.ac[i3] != null && i == 2012207713 * aa.ac[i3].ag) {
                    this.bu.add(Integer.valueOf(aa.ac[i3].ao * -1664471809));
                }
                i3++;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bj(" + ')');
        }
    }

    public void gr(int i) {
        int i2 = 0;
        this.bu = new HashSet();
        this.bd = 0;
        this.by = 0;
        while (i2 < aa.ac.length) {
            if (aa.ac[i2] != null && i == 2012207713 * aa.ac[i2].ag) {
                this.bu.add(Integer.valueOf(aa.ac[i2].ao * -1664471809));
            }
            i2++;
        }
    }

    public void ba(int i) {
        try {
            this.bu = null;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.ba(" + ')');
        }
    }

    public void ga() {
        this.bu = null;
    }

    public void gb() {
        this.bu = null;
    }

    public void bv(boolean z, int i) {
        try {
            this.bj = !z;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bv(" + ')');
        }
    }

    public void gd(boolean z) {
        this.bj = !z;
    }

    public void ge(boolean z) {
        this.bj = !z;
    }

    public void gk(boolean z) {
        boolean z2;
        if (z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.bj = z2;
    }

    public void gt(boolean z) {
        this.bj = !z;
    }

    public void gu(boolean z) {
        this.bj = !z;
    }

    public void be(int i, boolean z, byte b) {
        if (z) {
            this.bs.remove(Integer.valueOf(i));
        } else {
            try {
                this.bs.add(Integer.valueOf(i));
            } catch (Throwable e) {
                throw ei.ac(e, "ni.be(" + ')');
            }
        }
        bk(1270546139);
    }

    public void go(int i, boolean z) {
        if (z) {
            this.bs.remove(Integer.valueOf(i));
        } else {
            this.bs.add(Integer.valueOf(i));
        }
        bk(1270546139);
    }

    public void gw(int i, boolean z) {
        if (z) {
            this.bs.remove(Integer.valueOf(i));
        } else {
            this.bs.add(Integer.valueOf(i));
        }
        bk(1270546139);
    }

    public void gx(int i, boolean z) {
        if (z) {
            this.bs.remove(Integer.valueOf(i));
        } else {
            this.bs.add(Integer.valueOf(i));
        }
        bk(1270546139);
    }

    public void bw(int i, boolean z, int i2) {
        if (z) {
            this.bo.remove(Integer.valueOf(i));
        } else {
            try {
                this.bo.add(Integer.valueOf(i));
            } catch (Throwable e) {
                throw ei.ac(e, "ni.bw(" + ')');
            }
        }
        int i3 = 0;
        while (i3 < aa.ac.length) {
            if (aa.ac[i3] != null && i == aa.ac[i3].ag * 2012207713) {
                int i4 = aa.ac[i3].ao * -1664471809;
                if (z) {
                    this.bz.remove(Integer.valueOf(i4));
                } else {
                    this.bz.add(Integer.valueOf(i4));
                }
            }
            i3++;
        }
        bk(1270546139);
    }

    public void gp(int i, boolean z) {
        if (z) {
            this.bo.remove(Integer.valueOf(i));
        } else {
            this.bo.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < aa.ac.length) {
            if (aa.ac[i2] != null && i == aa.ac[i2].ag * 2012207713) {
                int i3 = aa.ac[i2].ao * -1664471809;
                if (z) {
                    this.bz.remove(Integer.valueOf(i3));
                } else {
                    this.bz.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        bk(1270546139);
    }

    public void gz(int i, boolean z) {
        if (z) {
            this.bo.remove(Integer.valueOf(i));
        } else {
            this.bo.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < aa.ac.length) {
            if (aa.ac[i2] != null && i == aa.ac[i2].ag * 2012207713) {
                int i3 = aa.ac[i2].ao * -1664471809;
                if (z) {
                    this.bz.remove(Integer.valueOf(i3));
                } else {
                    this.bz.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        bk(1270546139);
    }

    public boolean bn(int i) {
        try {
            return !this.bj;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bn(" + ')');
        }
    }

    public boolean gc() {
        return !this.bj;
    }

    public boolean gj() {
        return !this.bj;
    }

    public boolean gv() {
        return !this.bj;
    }

    public boolean bg(int i, int i2) {
        try {
            return !this.bs.contains(Integer.valueOf(i));
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bg(" + ')');
        }
    }

    public boolean gf(int i) {
        return !this.bs.contains(Integer.valueOf(i));
    }

    public boolean gl(int i) {
        return !this.bs.contains(Integer.valueOf(i));
    }

    public boolean gm(int i) {
        return !this.bs.contains(Integer.valueOf(i));
    }

    public boolean gn(int i) {
        return !this.bs.contains(Integer.valueOf(i));
    }

    public boolean gq(int i) {
        return !this.bs.contains(Integer.valueOf(i));
    }

    public boolean bc(int i, int i2) {
        try {
            return !this.bo.contains(Integer.valueOf(i));
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bc(" + ')');
        }
    }

    public boolean gy(int i) {
        return !this.bo.contains(Integer.valueOf(i));
    }

    void bk(int i) {
        try {
            this.bq.clear();
            this.bq.addAll(this.bs);
            this.bq.addAll(this.bz);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bk(" + ')');
        }
    }

    void gg() {
        this.bq.clear();
        this.bq.addAll(this.bs);
        this.bq.addAll(this.bz);
    }

    void gs() {
        this.bq.clear();
        this.bq.addAll(this.bs);
        this.bq.addAll(this.bz);
    }

    void ha() {
        this.bq.clear();
        this.bq.addAll(this.bs);
        this.bq.addAll(this.bz);
    }

    void hc() {
        this.bq.clear();
        this.bq.addAll(this.bs);
        this.bq.addAll(this.bz);
    }

    public void bf(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
            if (this.af.an((short) 1024)) {
                int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
                int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
                List<di> ak = this.ax.ak(((-1859700103 * this.au) - (ceil / 2)) - 1, ((616192953 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (-1859700103 * this.au)) + 1, ((ceil2 / 2) + (this.av * 616192953)) + 1, i, i2, i3, i4, i5, i6, -554523328);
                if (!ak.isEmpty()) {
                    for (di diVar : ak) {
                        aa aaVar = aa.ac[963317847 * diVar.aj];
                        Object obj = null;
                        for (int length = this.be.length - 1; length >= 0; length--) {
                            if (aaVar.aw[length] != null) {
                                dj.hs.bu(aaVar.aw[length], aaVar.am, this.be[length], 963317847 * diVar.aj, diVar.an.ac(-505094704), diVar.ac.ac(-1210507143), (byte) -11);
                                obj = 1;
                            }
                        }
                        if (obj != null) {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bf(" + ')');
        }
    }

    public void he(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
            List<di> ak = this.ax.ak(((-102984697 * this.au) - (ceil / 2)) - 1, ((-1603128341 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (-1859700103 * this.au)) + 1, ((ceil2 / 2) + (this.av * -47554786)) + 1, i, i2, i3, i4, i5, i6, -554523328);
            if (!ak.isEmpty()) {
                for (di diVar : ak) {
                    aa aaVar = aa.ac[963317847 * diVar.aj];
                    Object obj = null;
                    for (int length = this.be.length - 1; length >= 0; length--) {
                        if (aaVar.aw[length] != null) {
                            dj.hs.bu(aaVar.aw[length], aaVar.am, this.be[length], -1613813291 * diVar.aj, diVar.an.ac(-188469727), diVar.ac.ac(-57849082), (byte) 66);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public void hk(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
            List<di> ak = this.ax.ak(((-760688948 * this.au) - (ceil / 2)) - 1, ((-975541401 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (-192325864 * this.au)) + 1, ((ceil2 / 2) + (this.av * 1921447557)) + 1, i, i2, i3, i4, i5, i6, -554523328);
            if (!ak.isEmpty()) {
                for (di diVar : ak) {
                    aa aaVar = aa.ac[963317847 * diVar.aj];
                    Object obj = null;
                    for (int length = this.be.length - 1; length >= 0; length--) {
                        if (aaVar.aw[length] != null) {
                            dj.hs.bu(aaVar.aw[length], aaVar.am, this.be[length], -1720734284 * diVar.aj, diVar.an.ac(1085151167), diVar.ac.ac(-1813812688), (byte) -9);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public void ht(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.an((short) 1024)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.ar));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.ar));
            List<di> ak = this.ax.ak(((-1859700103 * this.au) - (ceil / 2)) - 1, ((616192953 * this.av) - (ceil2 / 2)) - 1, ((ceil / 2) + (-1859700103 * this.au)) + 1, ((ceil2 / 2) + (this.av * 616192953)) + 1, i, i2, i3, i4, i5, i6, -554523328);
            if (!ak.isEmpty()) {
                for (di diVar : ak) {
                    aa aaVar = aa.ac[963317847 * diVar.aj];
                    Object obj = null;
                    for (int length = this.be.length - 1; length >= 0; length--) {
                        if (aaVar.aw[length] != null) {
                            dj.hs.bu(aaVar.aw[length], aaVar.am, this.be[length], 963317847 * diVar.aj, diVar.an.ac(373476601), diVar.ac.ac(-455951682), (byte) -52);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public bt bl(int i, bt btVar, int i2) {
        try {
            if (!this.af.an((short) 1024)) {
                return null;
            }
            if (!this.ax.at(1923867812)) {
                return null;
            }
            if (!this.al.ai(btVar.ac * -486841375, btVar.an * -1974196523, (short) -31039)) {
                return null;
            }
            List<di> list = (List) this.ax.ah(-34761253).get(Integer.valueOf(i));
            if (list == null || list.isEmpty()) {
                return null;
            }
            di diVar = null;
            int i3 = -1;
            for (di diVar2 : list) {
                int i4 = (diVar2.ac.ac * -486841375) - (btVar.ac * -486841375);
                int i5 = (diVar2.ac.an * -1974196523) - (btVar.an * -1974196523);
                i4 = (i4 * i4) + (i5 * i5);
                if (i4 == 0) {
                    return diVar2.ac;
                }
                di diVar3;
                int i6;
                if (i4 < i3 || diVar == null) {
                    diVar3 = diVar2;
                    i6 = i4;
                } else {
                    i6 = i3;
                    diVar3 = diVar;
                }
                diVar = diVar3;
                i3 = i6;
            }
            return diVar.ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.bl(" + ')');
        }
    }

    public bt hm(int i, bt btVar) {
        di diVar = null;
        if (!this.af.an((short) 1024)) {
            return null;
        }
        if (!this.ax.at(6879741)) {
            return null;
        }
        if (!this.al.ai(btVar.ac * 504955615, -1974196523 * btVar.an, (short) -29555)) {
            return null;
        }
        List<di> list = (List) this.ax.ah(-2130817680).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = -1;
        for (di diVar2 : list) {
            int i3 = (diVar2.ac.ac * -486841375) - (btVar.ac * -486841375);
            int i4 = (diVar2.ac.an * 315199058) - (btVar.an * -217181664);
            i3 = (i3 * i3) + (i4 * i4);
            if (i3 == 0) {
                return diVar2.ac;
            }
            di diVar3;
            int i5;
            if (i3 < i2 || diVar == null) {
                int i6 = i3;
                diVar3 = diVar2;
                i5 = i6;
            } else {
                i5 = i2;
                diVar3 = diVar;
            }
            i2 = i5;
            diVar = diVar3;
        }
        return diVar.ac;
    }

    public bt hn(int i, bt btVar) {
        di diVar = null;
        if (!this.af.an((short) 1024) || !this.ax.at(45151417) || !this.al.ai(btVar.ac * 272494644, -1974196523 * btVar.an, (short) -20194)) {
            return null;
        }
        List<di> list = (List) this.ax.ah(61655991).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = -1;
        for (di diVar2 : list) {
            int i3 = (diVar2.ac.ac * 1322170989) - (btVar.ac * 1519164601);
            int i4 = (diVar2.ac.an * -1760545648) - (btVar.an * -1641789183);
            i3 = (i3 * i3) + (i4 * i4);
            if (i3 == 0) {
                return diVar2.ac;
            }
            di diVar3;
            int i5;
            if (i3 < i2 || diVar == null) {
                int i6 = i3;
                diVar3 = diVar2;
                i5 = i6;
            } else {
                i5 = i2;
                diVar3 = diVar;
            }
            i2 = i5;
            diVar = diVar3;
        }
        return diVar.ac;
    }

    public bt hv(int i, bt btVar) {
        di diVar = null;
        if (!this.af.an((short) 1024)) {
            return null;
        }
        if (!this.ax.at(208620639)) {
            return null;
        }
        if (!this.al.ai(btVar.ac * -486841375, btVar.an * -1974196523, (short) -20777)) {
            return null;
        }
        List<di> list = (List) this.ax.ah(-1021774577).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = -1;
        for (di diVar2 : list) {
            int i3 = (diVar2.ac.ac * -486841375) - (btVar.ac * -486841375);
            int i4 = (diVar2.ac.an * -1974196523) - (btVar.an * -1974196523);
            i3 = (i3 * i3) + (i4 * i4);
            if (i3 == 0) {
                return diVar2.ac;
            }
            di diVar3;
            int i5;
            if (i3 < i2 || diVar == null) {
                diVar3 = diVar2;
                i5 = i3;
            } else {
                i5 = i2;
                diVar3 = diVar;
            }
            diVar = diVar3;
            i2 = i5;
        }
        return diVar.ac;
    }

    public bt hx(int i, bt btVar) {
        di diVar = null;
        if (!this.af.an((short) 1024)) {
            return null;
        }
        if (!this.ax.at(663610752)) {
            return null;
        }
        if (!this.al.ai(btVar.ac * -486841375, 409869365 * btVar.an, (short) -1132)) {
            return null;
        }
        List<di> list = (List) this.ax.ah(-1366370275).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = -1;
        for (di diVar2 : list) {
            int i3 = (diVar2.ac.ac * 860109478) - (btVar.ac * -486841375);
            int i4 = (diVar2.ac.an * -1930988760) - (btVar.an * 2112368418);
            i3 = (i3 * i3) + (i4 * i4);
            if (i3 == 0) {
                return diVar2.ac;
            }
            di diVar3;
            int i5;
            if (i3 < i2 || diVar == null) {
                int i6 = i3;
                diVar3 = diVar2;
                i5 = i6;
            } else {
                i5 = i2;
                diVar3 = diVar;
            }
            i2 = i5;
            diVar = diVar3;
        }
        return diVar.ac;
    }

    public void cb(int i, int i2, bt btVar, bt btVar2, int i3) {
        try {
            gd gdVar = new gd();
            gdVar.aj(new Object[]{new dc(i2, btVar, btVar2)}, 1613869606);
            switch (i) {
                case gp.cr /*1008*/:
                    gdVar.ac(ar.aj, -382246444);
                    break;
                case cs.cp /*1009*/:
                    gdVar.ac(ar.ac, -382246444);
                    break;
                case ak.ct /*1010*/:
                    gdVar.ac(ar.an, -382246444);
                    break;
                case hz.cm /*1011*/:
                    gdVar.ac(ar.aq, -382246444);
                    break;
                case bx.ck /*1012*/:
                    gdVar.ac(ar.ao, -382246444);
                    break;
            }
            dg.aj(gdVar, -1118527480);
        } catch (Throwable e) {
            throw ei.ac(e, "ni.cb(" + ')');
        }
    }

    public void hb(int i, int i2, bt btVar, bt btVar2) {
        gd gdVar = new gd();
        gdVar.aj(new Object[]{new dc(i2, btVar, btVar2)}, -290440820);
        switch (i) {
            case gp.cr /*1008*/:
                gdVar.ac(ar.aj, -382246444);
                break;
            case cs.cp /*1009*/:
                gdVar.ac(ar.ac, -382246444);
                break;
            case ak.ct /*1010*/:
                gdVar.ac(ar.an, -382246444);
                break;
            case hz.cm /*1011*/:
                gdVar.ac(ar.aq, -382246444);
                break;
            case bx.ck /*1012*/:
                gdVar.ac(ar.ao, -382246444);
                break;
        }
        dg.aj(gdVar, 592918131);
    }

    public void hy(int i, int i2, bt btVar, bt btVar2) {
        gd gdVar = new gd();
        gdVar.aj(new Object[]{new dc(i2, btVar, btVar2)}, 2138798250);
        switch (i) {
            case gp.cr /*1008*/:
                gdVar.ac(ar.aj, -382246444);
                break;
            case cs.cp /*1009*/:
                gdVar.ac(ar.ac, -382246444);
                break;
            case ak.ct /*1010*/:
                gdVar.ac(ar.an, -382246444);
                break;
            case hz.cm /*1011*/:
                gdVar.ac(ar.aq, -382246444);
                break;
            case bx.ck /*1012*/:
                gdVar.ac(ar.ao, -382246444);
                break;
        }
        dg.aj(gdVar, -2028692946);
    }

    public di cy(int i) {
        di diVar = null;
        try {
            if (this.af.an((short) 1024) && this.ax.at(552740378)) {
                HashMap ah = this.ax.ah(-58488516);
                this.bw = new LinkedList();
                for (List addAll : ah.values()) {
                    this.bw.addAll(addAll);
                }
                this.bn = this.bw.iterator();
                diVar = cl(-1034767522);
            }
            return diVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.cy(" + ')');
        }
    }

    public di hr() {
        if (!this.af.an((short) 1024) || !this.ax.at(405716521)) {
            return null;
        }
        HashMap ah = this.ax.ah(1717797160);
        this.bw = new LinkedList();
        for (List addAll : ah.values()) {
            this.bw.addAll(addAll);
        }
        this.bn = this.bw.iterator();
        return cl(-1034767522);
    }

    public di cl(int i) {
        di diVar = null;
        try {
            if (this.bn != null && this.bn.hasNext()) {
                diVar = (di) this.bn.next();
            }
            return diVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ni.cl(" + ')');
        }
    }

    public di hd() {
        if (this.bn != null && this.bn.hasNext()) {
            return (di) this.bn.next();
        }
        return null;
    }

    public di hl() {
        if (this.bn == null) {
            return null;
        }
        if (this.bn.hasNext()) {
            return (di) this.bn.next();
        }
        return null;
    }

    public di hp() {
        if (this.bn != null && this.bn.hasNext()) {
            return (di) this.bn.next();
        }
        return null;
    }

    public di hq() {
        if (this.bn == null) {
            return null;
        }
        if (this.bn.hasNext()) {
            return (di) this.bn.next();
        }
        return null;
    }
}
