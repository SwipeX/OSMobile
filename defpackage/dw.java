package defpackage;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class dw {
    static final int ac = -3355444;
    static final int aj = 5;
    static final int an = -3407872;
    static es ao = aq.aj((byte) -23);
    static en aq = new en();
    static final int au = 1;
    public static final int ax = 34;
    static final bt az = new bt();
    static int cg;
    int aa;
    List ae;
    int ah;
    int ai;
    int ak;
    final HashMap al;
    em am;
    dv ap;
    HashMap as;
    LinkedList at;
    int[][] aw;

    dw(int i, int i2, int i3, HashMap hashMap) {
        try {
            this.aa = 70645577 * i;
            this.ak = -449853537 * i2;
            this.at = new LinkedList();
            this.ae = new LinkedList();
            this.as = new HashMap();
            this.ah = -2070954651 * (-16777216 | i3);
            this.al = hashMap;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.<init>(" + ')');
        }
    }

    void aj(int i, int i2, int i3, es esVar, int i4) {
        try {
            if (this.am != null) {
                if (i3 == -1593855552 * this.ai) {
                    esVar.al(this.am, i, i2, -2139689735);
                    return;
                }
                esVar.bd(this.am, i, i2, i3, i3, -2071929394);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.aj(" + ')');
        }
    }

    void bj(int i, int i2, int i3, es esVar) {
        if (this.am != null) {
            if (i3 == -1593855552 * this.ai) {
                esVar.al(this.am, i, i2, -2113719138);
                return;
            }
            esVar.bd(this.am, i, i2, i3, i3, -1241217645);
        }
    }

    void bq(int i, int i2, int i3, es esVar) {
        if (this.am != null) {
            if (i3 == -1593855552 * this.ai) {
                esVar.al(this.am, i, i2, -2097376720);
                return;
            }
            esVar.bd(this.am, i, i2, i3, i3, -1419624047);
        }
    }

    void ac(dv dvVar, List list, int i) {
        try {
            this.as.clear();
            this.ap = dvVar;
            aq(0, 0, 64, 64, this.ap, 1758016469);
            ao(list, -1586138145);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ac(" + ')');
        }
    }

    void ba(dv dvVar, List list) {
        this.as.clear();
        this.ap = dvVar;
        aq(0, 0, -1812779363, 64, this.ap, 1746253779);
        ao(list, -1586138145);
    }

    void be(dv dvVar, List list) {
        this.as.clear();
        this.ap = dvVar;
        aq(0, 0, 64, 64, this.ap, 2010909698);
        ao(list, -1586138145);
    }

    void bv(dv dvVar, List list) {
        this.as.clear();
        this.ap = dvVar;
        aq(0, 0, 64, 64, this.ap, 2134795475);
        ao(list, -1586138145);
    }

    void an(HashSet hashSet, List list, byte b) {
        try {
            this.as.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                da daVar = (da) it.next();
                if (daVar.ao(956598269) == 1257024249 * this.aa && daVar.aa((byte) 113) == this.ak * -486304673) {
                    this.at.add(daVar);
                    aq(daVar.bm(2143941393) * 8, daVar.bh(1097489216) * 8, 8, 8, daVar, 2081749546);
                }
            }
            ao(list, -1586138145);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.an(" + ')');
        }
    }

    void bn(HashSet hashSet, List list) {
        this.as.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            if (daVar.ao(598851417) == 1257024249 * this.aa && daVar.aa((byte) 5) == this.ak * -486304673) {
                this.at.add(daVar);
                aq(daVar.bm(2143941393) * 8, daVar.bh(1097489216) * 8, 8, 8, daVar, 2046380528);
            }
        }
        ao(list, -1586138145);
    }

    void bw(HashSet hashSet, List list) {
        this.as.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            if (daVar.ao(588134196) == 2095886130 * this.aa && daVar.aa((byte) 82) == this.ak * -486304673) {
                this.at.add(daVar);
                aq(daVar.bm(2143941393) * 8, daVar.bh(1097489216) * 8, 8, 8, daVar, 1943793328);
            }
        }
        ao(list, -1586138145);
    }

    void aq(int i, int i2, int i3, int i4, db dbVar, int i5) {
        for (int i6 = i; i6 < i + i3; i6++) {
            int i7 = i2;
            while (i7 < i4 + i2) {
                try {
                    bt btVar = new bt(0, i6, i7);
                    for (int i8 = 0; i8 < dbVar.aa * 793351865; i8++) {
                        eq[] eqVarArr = dbVar.ai[i8][i6][i7];
                        if (!(eqVarArr == null || eqVarArr.length == 0)) {
                            int i9 = 0;
                            while (i9 < eqVarArr.length) {
                                aa bd = bd(eqVarArr[i9].aj * 644111461, -2079713131);
                                if (bd != null) {
                                    bt btVar2;
                                    bt btVar3 = new bt(i8, (-1154826688 * this.aa) + i6, (this.ak * -1058728000) + i7);
                                    if (this.ap != null) {
                                        btVar2 = new bt((-1153877303 * this.ap.ao) + i8, (-855023040 * this.ap.aj) + i6, (this.ap.ac * 1009638336) + i7);
                                    } else {
                                        da daVar = (da) dbVar;
                                        btVar2 = new bt(i8 + (-1153877303 * daVar.ao), ((daVar.aj * -855023040) + i6) + (daVar.ab((byte) 24) * 8), (daVar.bp(-2029687051) * 8) + ((1009638336 * daVar.ac) + i7));
                                    }
                                    this.as.put(btVar, new di(-1664471809 * bd.ao, btVar2, btVar3, bx(bd, 1683588247)));
                                    i7++;
                                } else {
                                    i9++;
                                }
                            }
                            continue;
                        }
                    }
                    i7++;
                } catch (Throwable e) {
                    throw ei.ac(e, "dw.aq(" + ')');
                }
            }
        }
    }

    void bc(int i, int i2, int i3, int i4, db dbVar) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                bt btVar = new bt(0, i5, i6);
                for (int i7 = 0; i7 < dbVar.aa * 793351865; i7++) {
                    eq[] eqVarArr = dbVar.ai[i7][i5][i6];
                    if (!(eqVarArr == null || eqVarArr.length == 0)) {
                        int i8 = 0;
                        while (i8 < eqVarArr.length) {
                            aa bd = bd(eqVarArr[i8].aj * 644111461, 2000395356);
                            if (bd == null) {
                                i8++;
                            } else {
                                bt btVar2;
                                bt btVar3 = new bt(i7, (-1154826688 * this.aa) + i5, (this.ak * -1058728000) + i6);
                                if (this.ap != null) {
                                    btVar2 = new bt(i7 + (-1153877303 * this.ap.ao), (-855023040 * this.ap.aj) + i5, (this.ap.ac * 1009638336) + i6);
                                } else {
                                    da daVar = (da) dbVar;
                                    btVar2 = new bt(i7 + (-1153877303 * daVar.ao), ((daVar.aj * -855023040) + i5) + (daVar.ab((byte) 92) * 8), (daVar.bp(-732819544) * 8) + ((1009638336 * daVar.ac) + i6));
                                }
                                this.as.put(btVar, new di(-1664471809 * bd.ao, btVar2, btVar3, bx(bd, 229830926)));
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void bg(int i, int i2, int i3, int i4, db dbVar) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                bt btVar = new bt(0, i5, i6);
                for (int i7 = 0; i7 < dbVar.aa * 1963356114; i7++) {
                    eq[] eqVarArr = dbVar.ai[i7][i5][i6];
                    if (!(eqVarArr == null || eqVarArr.length == 0)) {
                        int i8 = 0;
                        while (i8 < eqVarArr.length) {
                            aa bd = bd(eqVarArr[i8].aj * -150892725, 1122442213);
                            if (bd == null) {
                                i8++;
                            } else {
                                bt btVar2;
                                bt btVar3 = new bt(i7, (1891439956 * this.aa) + i5, (this.ak * -1058728000) + i6);
                                if (this.ap != null) {
                                    btVar2 = new bt(i7 + (424691220 * this.ap.ao), (1901681868 * this.ap.aj) + i5, (this.ap.ac * -310612845) + i6);
                                } else {
                                    da daVar = (da) dbVar;
                                    btVar2 = new bt(i7 + (1193343306 * daVar.ao), ((daVar.aj * -855023040) + i5) + (daVar.ab((byte) 104) * 8), (daVar.bp(-587566418) * 8) + ((1680951838 * daVar.ac) + i6));
                                }
                                this.as.put(btVar, new di(-1664471809 * bd.ao, btVar2, btVar3, bx(bd, 991290684)));
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void ao(List list, int i) {
        try {
            for (dt dtVar : list) {
                if (((-486841375 * dtVar.ac.ac) >> 6) == this.aa * 1257024249 && this.ak * -486304673 == ((-1974196523 * dtVar.ac.an) >> 6)) {
                    this.ae.add(new di(dtVar.aj * -705421725, dtVar.ac, dtVar.ac, by(dtVar.aj * -705421725, -22092319)));
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ao(" + ')');
        }
    }

    void bk(List list) {
        for (dt dtVar : list) {
            if (((-486841375 * dtVar.ac.ac) >> 6) == this.aa * 1257024249 && this.ak * -486304673 == ((-1974196523 * dtVar.ac.an) >> 6)) {
                this.ae.add(new di(dtVar.aj * -705421725, dtVar.ac, dtVar.ac, by(dtVar.aj * -705421725, -22092319)));
            }
        }
    }

    boolean aa(int i, eu euVar, dw[] dwVarArr, fl[] flVarArr, byte b) {
        try {
            if (!at(i, -1247814415)) {
                return false;
            }
            if (this.ap == null && this.at.isEmpty()) {
                return false;
            }
            as(dwVarArr, 164704273);
            aq.ab(this.am, 2112239305);
            if (this.ap != null) {
                ah(euVar, dwVarArr, flVarArr, 333772018);
            } else {
                ai(euVar, flVarArr, 1093470782);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.aa(" + ')');
        }
    }

    boolean bf(int i, eu euVar, dw[] dwVarArr, fl[] flVarArr) {
        if (!at(i, 584642865)) {
            return false;
        }
        if (this.ap == null && this.at.isEmpty()) {
            return false;
        }
        as(dwVarArr, 518322852);
        aq.ab(this.am, -1162905987);
        if (this.ap != null) {
            ah(euVar, dwVarArr, flVarArr, -905108561);
        } else {
            ai(euVar, flVarArr, 1724343297);
        }
        return true;
    }

    boolean bl(int i, eu euVar, dw[] dwVarArr, fl[] flVarArr) {
        if (!at(i, 1419295987)) {
            return false;
        }
        if (this.ap == null && this.at.isEmpty()) {
            return false;
        }
        as(dwVarArr, -1339188821);
        aq.ab(this.am, 1971407508);
        if (this.ap != null) {
            ah(euVar, dwVarArr, flVarArr, 1303551459);
        } else {
            ai(euVar, flVarArr, 1229019841);
        }
        return true;
    }

    void ak(int i, int i2, int i3, HashSet hashSet, es esVar, int i4) {
        HashSet hashSet2;
        if (hashSet == null) {
            try {
                hashSet2 = new HashSet();
            } catch (Throwable e) {
                throw ei.ac(e, "dw.ak(" + ')');
            }
        }
        hashSet2 = hashSet;
        ag(i, i2, hashSet2, i3, esVar, (byte) 75);
        bh(i, i2, hashSet2, i3, esVar, (byte) 16);
    }

    void cb(int i, int i2, int i3, HashSet hashSet, es esVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ag(i, i2, hashSet2, i3, esVar, (byte) 102);
        bh(i, i2, hashSet2, i3, esVar, (byte) 16);
    }

    void cl(int i, int i2, int i3, HashSet hashSet, es esVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ag(i, i2, hashSet2, i3, esVar, (byte) 105);
        bh(i, i2, hashSet2, i3, esVar, (byte) 16);
    }

    void cy(int i, int i2, int i3, HashSet hashSet, es esVar) {
        HashSet hashSet2;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        } else {
            hashSet2 = hashSet;
        }
        ag(i, i2, hashSet2, i3, esVar, (byte) 121);
        bh(i, i2, hashSet2, i3, esVar, (byte) 16);
    }

    void ap(HashSet hashSet, int i, int i2, es esVar, int i3) {
        try {
            for (di diVar : this.as.values()) {
                if (hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                    ad(aa.ac[diVar.aj * 963317847], diVar.ak * -1110019475, -583669913 * diVar.ap, i, i2, esVar, -1348662484);
                }
            }
            ar(hashSet, i, i2, esVar, -1887243806);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ap(" + ')');
        }
    }

    void cc(HashSet hashSet, int i, int i2, es esVar) {
        for (di diVar : this.as.values()) {
            if (hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                ad(aa.ac[diVar.aj * 963317847], diVar.ak * -1053306738, -583669913 * diVar.ap, i, i2, esVar, -2109796209);
            }
        }
        ar(hashSet, i, i2, esVar, -1863745024);
    }

    void co(HashSet hashSet, int i, int i2, es esVar) {
        for (di diVar : this.as.values()) {
            if (hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                ad(aa.ac[diVar.aj * 963317847], diVar.ak * -1110019475, -583669913 * diVar.ap, i, i2, esVar, -1229572903);
            }
        }
        ar(hashSet, i, i2, esVar, 1883455686);
    }

    boolean at(int i, int i2) {
        try {
            if (this.am != null && this.ai * -695992633 == i) {
                return false;
            }
            this.ai = -1090821385 * i;
            this.am = new em(this.ai * -1593855552, this.ai * -1593855552);
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.at(" + ')');
        }
    }

    boolean ca(int i) {
        if (this.am != null && this.ai * -695992633 == i) {
            return false;
        }
        this.ai = -1090821385 * i;
        this.am = new em(this.ai * -1593855552, this.ai * -1593855552);
        return true;
    }

    boolean cf(int i) {
        if (this.am != null && this.ai * -695992633 == i) {
            return false;
        }
        this.ai = -1470882418 * i;
        this.am = new em(this.ai * -1593855552, this.ai * -1593855552);
        return true;
    }

    void ah(eu euVar, dw[] dwVarArr, fl[] flVarArr, int i) {
        int i2;
        for (i2 = 0; i2 < 64; i2++) {
            int i3 = 0;
            while (i3 < 64) {
                try {
                    am(i2, i3, this.ap, euVar, (byte) 3);
                    ae(i2, i3, this.ap, euVar, 1366928737);
                    i3++;
                } catch (Throwable e) {
                    throw ei.ac(e, "dw.ah(" + ')');
                }
            }
        }
        for (i2 = 0; i2 < 64; i2++) {
            for (i3 = 0; i3 < 64; i3++) {
                aw(i2, i3, this.ap, euVar, flVarArr, -1861175482);
            }
        }
    }

    void cp(eu euVar, dw[] dwVarArr, fl[] flVarArr) {
        int i;
        for (i = 0; i < 64; i++) {
            int i2;
            for (i2 = 0; i2 < 64; i2++) {
                am(i, i2, this.ap, euVar, (byte) 3);
                ae(i, i2, this.ap, euVar, 2071307311);
            }
        }
        for (i = 0; i < 64; i++) {
            for (i2 = 0; i2 < 64; i2++) {
                aw(i, i2, this.ap, euVar, flVarArr, -1994264197);
            }
        }
    }

    void cr(eu euVar, dw[] dwVarArr, fl[] flVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < 453340172; i2++) {
            for (int i3 = 0; i3 < 1204723696; i3++) {
                am(i2, i3, this.ap, euVar, (byte) 3);
                ae(i2, i3, this.ap, euVar, 1158955414);
            }
        }
        while (i < 64) {
            i++;
        }
    }

    void ct(eu euVar, dw[] dwVarArr, fl[] flVarArr) {
        int i;
        for (i = 0; i < 64; i++) {
            int i2;
            for (i2 = 0; i2 < 64; i2++) {
                am(i, i2, this.ap, euVar, (byte) 3);
                ae(i, i2, this.ap, euVar, 1557509614);
            }
        }
        for (i = 0; i < 64; i++) {
            for (i2 = 0; i2 < 64; i2++) {
                aw(i, i2, this.ap, euVar, flVarArr, -1354071785);
            }
        }
    }

    void ai(eu euVar, fl[] flVarArr, int i) {
        try {
            da daVar;
            int bm;
            int bh;
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                daVar = (da) it.next();
                for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                    for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                        am(bm, bh, daVar, euVar, (byte) 3);
                        ae(bm, bh, daVar, euVar, 1828403811);
                    }
                }
            }
            Iterator it2 = this.at.iterator();
            while (it2.hasNext()) {
                daVar = (da) it2.next();
                for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                    for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                        aw(bm, bh, daVar, euVar, flVarArr, -1332014738);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ai(" + ')');
        }
    }

    void ce(eu euVar, fl[] flVarArr) {
        int bh;
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            int bm;
            da daVar = (da) it.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    am(bm, bh, daVar, euVar, (byte) 3);
                    ae(bm, bh, daVar, euVar, 2016617454);
                }
            }
        }
        Iterator it2 = this.at.iterator();
        while (it2.hasNext()) {
            daVar = (da) it2.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    aw(bm, bh, daVar, euVar, flVarArr, -1476582465);
                }
            }
        }
    }

    void ck(eu euVar, fl[] flVarArr) {
        int bm;
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                int bh;
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    am(bm, bh, daVar, euVar, (byte) 3);
                    ae(bm, bh, daVar, euVar, 1944894538);
                }
            }
        }
        Iterator it2 = this.at.iterator();
        while (it2.hasNext()) {
            daVar = (da) it2.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    aw(bm, bh, daVar, euVar, flVarArr, -920170113);
                }
            }
        }
    }

    void cm(eu euVar, fl[] flVarArr) {
        int bh;
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            int bm;
            da daVar = (da) it.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    am(bm, bh, daVar, euVar, (byte) 3);
                    ae(bm, bh, daVar, euVar, 1208539894);
                }
            }
        }
        Iterator it2 = this.at.iterator();
        while (it2.hasNext()) {
            daVar = (da) it2.next();
            for (bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    aw(bm, bh, daVar, euVar, flVarArr, -2072407675);
                }
            }
        }
    }

    static void an(jn jnVar, int i, int i2, int i3, byte b, boolean z, byte b2) {
        long j = (long) ((i << 16) + i2);
        try {
            if (((jx) jg.aq.aj(j)) == null) {
                if (((jx) jg.aa.aj(j)) == null) {
                    jx jxVar = (jx) jg.at.aj(j);
                    if (jxVar != null) {
                        if (z) {
                            jxVar.da();
                            jg.aq.ac(jxVar, j);
                            jg.ah -= -1210605691;
                            jg.ao -= 931020411;
                        }
                    } else if (z || ((jx) jg.ai.aj(j)) == null) {
                        jt jxVar2 = new jx();
                        jxVar2.aj = jnVar;
                        jxVar2.ac = 651207799 * i3;
                        jxVar2.an = b;
                        if (z) {
                            jg.aq.ac(jxVar2, j);
                            jg.ao -= 931020411;
                            return;
                        }
                        jg.ap.aj(jxVar2);
                        jg.at.ac(jxVar2, j);
                        jg.ah -= 1210605691;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.an(" + ')');
        }
    }

    void aw(int i, int i2, db dbVar, eu euVar, fl[] flVarArr, int i3) {
        try {
            ay(i, i2, dbVar, -1522495355);
            av(i, i2, dbVar, flVarArr, (byte) -16);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.aw(" + ')');
        }
    }

    void ch(int i, int i2, db dbVar, eu euVar, fl[] flVarArr) {
        ay(i, i2, dbVar, 457173137);
        av(i, i2, dbVar, flVarArr, (byte) -114);
    }

    void ci(int i, int i2, db dbVar, eu euVar, fl[] flVarArr) {
        ay(i, i2, dbVar, 1429002069);
        av(i, i2, dbVar, flVarArr, (byte) -5);
    }

    void cq(int i, int i2, db dbVar, eu euVar, fl[] flVarArr) {
        ay(i, i2, dbVar, 1063328246);
        av(i, i2, dbVar, flVarArr, (byte) -18);
    }

    void cv(int i, int i2, db dbVar, eu euVar, fl[] flVarArr) {
        ay(i, i2, dbVar, -1819638103);
        av(i, i2, dbVar, flVarArr, (byte) -124);
    }

    void am(int i, int i2, db dbVar, eu euVar, byte b) {
        try {
            int i3 = dbVar.ap[0][i][i2] - 1;
            if (-1 == dbVar.ak[0][i][i2] - 1 && -1 == i3) {
                ao.aq((-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), this.ai * -695992633, -695992633 * this.ai, this.ah * -1059902355, (byte) 64);
            }
            int i4 = 16711935;
            if (i3 != -1) {
                i4 = mk.aj(i3, -1059902355 * this.ah, (byte) 1);
            }
            if (i3 <= -1 || dbVar.at[0][i][i2] != (byte) 0) {
                int au = au(i, i2, dbVar, -1515414454);
                if (-1 == i3) {
                    ao.aq((this.ai * -695992633) * i, (this.ai * -695992633) * (63 - i2), this.ai * -695992633, -695992633 * this.ai, au, (byte) 102);
                    return;
                }
                euVar.aj((-695992633 * this.ai) * i, (-695992633 * this.ai) * (63 - i2), au, i4, -695992633 * this.ai, this.ai * -695992633, dbVar.at[0][i][i2], dbVar.ah[0][i][i2], ao, 1514575895);
                return;
            }
            ao.aq((this.ai * -695992633) * i, (63 - i2) * (-695992633 * this.ai), -695992633 * this.ai, this.ai * -695992633, i4, (byte) 94);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.am(" + ')');
        }
    }

    void cg(int i, int i2, db dbVar, eu euVar) {
        int i3 = dbVar.ap[0][i][i2] - 1;
        if (-1 == dbVar.ak[0][i][i2] - 1 && -1 == i3) {
            ao.aq((-695992633 * this.ai) * i, (-126220168 - i2) * (-1222816132 * this.ai), this.ai * 2046269683, 1490124347 * this.ai, this.ah * -1059902355, (byte) 85);
        }
        int i4 = 16711935;
        if (i3 != -1) {
            i4 = mk.aj(i3, -783449 * this.ah, (byte) -89);
        }
        if (i3 <= -1 || dbVar.at[0][i][i2] != (byte) 0) {
            int au = au(i, i2, dbVar, -1945804677);
            if (-1 == i3) {
                ao.aq((this.ai * -695992633) * i, (this.ai * 1686465506) * (63 - i2), this.ai * -1200458889, 671643913 * this.ai, au, (byte) 89);
                return;
            }
            euVar.aj((1996850877 * this.ai) * i, (-695992633 * this.ai) * (63 - i2), au, i4, 9136105 * this.ai, this.ai * 907644381, dbVar.at[0][i][i2], dbVar.ah[0][i][i2], ao, 1345702832);
            return;
        }
        ao.aq((this.ai * -695992633) * i, (63 - i2) * (-1837205141 * this.ai), -695992633 * this.ai, this.ai * -335881134, i4, (byte) 5);
    }

    void cu(int i, int i2, db dbVar, eu euVar) {
        int aj;
        int i3 = dbVar.ap[0][i][i2] - 1;
        if (-1 == dbVar.ak[0][i][i2] - 1 && -1 == i3) {
            ao.aq((-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), this.ai * -695992633, -695992633 * this.ai, this.ah * -1059902355, (byte) 31);
        }
        if (i3 != -1) {
            aj = mk.aj(i3, -1059902355 * this.ah, (byte) -18);
        } else {
            aj = 16711935;
        }
        if (i3 <= -1 || dbVar.at[0][i][i2] != (byte) 0) {
            int au = au(i, i2, dbVar, -673044650);
            if (-1 == i3) {
                ao.aq((this.ai * -695992633) * i, (this.ai * -695992633) * (63 - i2), this.ai * -695992633, -695992633 * this.ai, au, (byte) 112);
                return;
            }
            euVar.aj((-695992633 * this.ai) * i, (-695992633 * this.ai) * (63 - i2), au, aj, -695992633 * this.ai, this.ai * -695992633, dbVar.at[0][i][i2], dbVar.ah[0][i][i2], ao, 1274056798);
            return;
        }
        ao.aq((this.ai * -695992633) * i, (63 - i2) * (-695992633 * this.ai), -695992633 * this.ai, this.ai * -695992633, aj, (byte) 25);
    }

    void ae(int i, int i2, db dbVar, eu euVar, int i3) {
        int i4 = 1;
        while (i4 < dbVar.aa * 793351865) {
            try {
                int i5 = dbVar.ap[i4][i][i2] - 1;
                if (i5 > -1) {
                    int aj = mk.aj(i5, -1059902355 * this.ah, (byte) -66);
                    if (dbVar.at[i4][i][i2] == (byte) 0) {
                        ao.aq(i * (-695992633 * this.ai), (-695992633 * this.ai) * (63 - i2), -695992633 * this.ai, this.ai * -695992633, aj, (byte) 78);
                    } else {
                        eu euVar2 = euVar;
                        euVar2.aj(i * (-695992633 * this.ai), (63 - i2) * (this.ai * -695992633), 0, aj, this.ai * -695992633, this.ai * -695992633, dbVar.at[i4][i][i2], dbVar.ah[i4][i][i2], ao, 872357066);
                    }
                }
                i4++;
            } catch (Throwable e) {
                throw ei.ac(e, "dw.ae(" + ')');
            }
        }
    }

    void cs(int i, int i2, db dbVar, eu euVar) {
        for (int i3 = 1; i3 < dbVar.aa * 793351865; i3++) {
            int i4 = dbVar.ap[i3][i][i2] - 1;
            if (i4 > -1) {
                int aj = mk.aj(i4, 398520929 * this.ah, (byte) -20);
                if (dbVar.at[i3][i][i2] == (byte) 0) {
                    ao.aq(i * (-695992633 * this.ai), (1338809081 * this.ai) * (-1440811360 - i2), -695992633 * this.ai, this.ai * 1348418042, aj, (byte) 63);
                } else {
                    eu euVar2 = euVar;
                    euVar2.aj(i * (1792284537 * this.ai), (-2068741320 - i2) * (this.ai * 1722778224), 0, aj, this.ai * -695992633, this.ai * -695992633, dbVar.at[i3][i][i2], dbVar.ah[i3][i][i2], ao, 1434390736);
                }
            }
        }
    }

    boolean as(dw[] dwVarArr, int i) {
        try {
            if (this.aw != null) {
                return false;
            }
            de deVar = new de(64, 64);
            if (this.ap != null) {
                ax(0, 0, 64, 64, this.ap, deVar, -945351909);
            } else {
                Iterator it = this.at.iterator();
                while (it.hasNext()) {
                    da daVar = (da) it.next();
                    ax(daVar.bm(2143941393) * 8, daVar.bh(1097489216) * 8, 8, 8, daVar, deVar, -1592119942);
                }
            }
            az(dwVarArr, deVar, 2046621222);
            al(deVar, -1791754956);
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.as(" + ')');
        }
    }

    boolean cx(dw[] dwVarArr) {
        if (this.aw != null) {
            return false;
        }
        de deVar = new de(64, 64);
        if (this.ap != null) {
            ax(0, 0, 64, 64, this.ap, deVar, 349302264);
        } else {
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                da daVar = (da) it.next();
                ax(daVar.bm(2143941393) * 8, daVar.bh(1097489216) * 8, 8, 8, daVar, deVar, 897074723);
            }
        }
        az(dwVarArr, deVar, -1808212598);
        al(deVar, -541490617);
        return true;
    }

    void al(de deVar, int i) {
        try {
            this.aw = (int[][]) Array.newInstance(Integer.TYPE, new int[]{64, 64});
            for (int i2 = 0; i2 < 64; i2++) {
                for (int i3 = 0; i3 < 64; i3++) {
                    this.aw[i2][i3] = deVar.ac(i2, i3, (byte) -1) | -16777216;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.al(" + ')');
        }
    }

    void cd(de deVar) {
        this.aw = (int[][]) Array.newInstance(Integer.TYPE, new int[]{64, 64});
        for (int i = 0; i < 64; i++) {
            for (int i2 = 0; i2 < 64; i2++) {
                this.aw[i][i2] = deVar.ac(i, i2, (byte) -1) | -16777216;
            }
        }
    }

    void cn(de deVar) {
        this.aw = (int[][]) Array.newInstance(Integer.TYPE, new int[]{64, 64});
        for (int i = 0; i < 64; i++) {
            for (int i2 = 0; i2 < 64; i2++) {
                this.aw[i][i2] = deVar.ac(i, i2, (byte) -1) | -16777216;
            }
        }
    }

    void cw(de deVar) {
        this.aw = (int[][]) Array.newInstance(Integer.TYPE, new int[]{64, -297319512});
        for (int i = 0; i < 64; i++) {
            for (int i2 = 0; i2 < 1958332671; i2++) {
                this.aw[i][i2] = deVar.ac(i, i2, (byte) -1) | 724247123;
            }
        }
    }

    void az(dw[] dwVarArr, de deVar, int i) {
        try {
            ih[] aj = gy.aj((byte) 0);
            for (ih ihVar : aj) {
                if (dwVarArr[ihVar.ac((byte) -60)] != null) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 64;
                    int i5 = 64;
                    int i6 = 0;
                    int i7 = 0;
                    switch (1507704133 * ihVar.at) {
                        case 0:
                            i3 = 59;
                            i5 = 5;
                            break;
                        case 1:
                            i6 = 59;
                            i4 = 5;
                            break;
                        case 2:
                            i3 = 59;
                            i5 = 5;
                            i2 = 59;
                            i4 = 5;
                            break;
                        case 3:
                            i7 = 59;
                            i5 = 5;
                            i2 = 59;
                            i4 = 5;
                            break;
                        case 4:
                            i2 = 59;
                            i4 = 5;
                            break;
                        case 5:
                            i3 = 59;
                            i5 = 5;
                            i6 = 59;
                            i4 = 5;
                            break;
                        case 6:
                            i6 = 59;
                            i7 = 59;
                            i4 = 5;
                            i5 = 5;
                            break;
                        case 7:
                            i7 = 59;
                            i5 = 5;
                            break;
                        default:
                            break;
                    }
                    af(i6, i7, i2, i3, i4, i5, dwVarArr[ihVar.ac((byte) -88)], deVar, -865416604);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.az(" + ')');
        }
    }

    void cj(dw[] dwVarArr, de deVar) {
        ih[] aj = gy.aj((byte) 0);
        for (ih ihVar : aj) {
            if (dwVarArr[ihVar.ac((byte) -69)] != null) {
                int i = 0;
                int i2 = 0;
                int i3 = -78357769;
                int i4 = -1087947820;
                int i5 = 0;
                int i6 = 0;
                switch (1507704133 * ihVar.at) {
                    case 0:
                        i2 = 59;
                        i4 = 5;
                        break;
                    case 1:
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 2:
                        i2 = -1221264556;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 3:
                        i6 = 2135512834;
                        i4 = 5;
                        i = 1848641474;
                        i3 = 5;
                        break;
                    case 4:
                        i = 466382068;
                        i3 = 5;
                        break;
                    case 5:
                        i2 = 1937492056;
                        i4 = 5;
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 6:
                        i5 = 1806439037;
                        i6 = 1126705319;
                        i3 = 5;
                        i4 = 5;
                        break;
                    case 7:
                        i6 = 258395944;
                        i4 = 5;
                        break;
                }
                af(i5, i6, i, i2, i3, i4, dwVarArr[ihVar.ac((byte) -59)], deVar, -1209155157);
            }
        }
    }

    void cz(dw[] dwVarArr, de deVar) {
        ih[] aj = gy.aj((byte) 0);
        for (ih ihVar : aj) {
            if (dwVarArr[ihVar.ac((byte) -45)] != null) {
                int i = 0;
                int i2 = 0;
                int i3 = 64;
                int i4 = 64;
                int i5 = 0;
                int i6 = 0;
                switch (1507704133 * ihVar.at) {
                    case 0:
                        i2 = 59;
                        i4 = 5;
                        break;
                    case 1:
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 2:
                        i2 = 59;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 3:
                        i6 = 59;
                        i4 = 5;
                        i = 59;
                        i3 = 5;
                        break;
                    case 4:
                        i = 59;
                        i3 = 5;
                        break;
                    case 5:
                        i2 = 59;
                        i4 = 5;
                        i5 = 59;
                        i3 = 5;
                        break;
                    case 6:
                        i5 = 59;
                        i6 = 59;
                        i3 = 5;
                        i4 = 5;
                        break;
                    case 7:
                        i6 = 59;
                        i4 = 5;
                        break;
                    default:
                        break;
                }
                af(i5, i6, i, i2, i3, i4, dwVarArr[ihVar.ac((byte) -125)], deVar, 154694878);
            }
        }
    }

    void ax(int i, int i2, int i3, int i4, db dbVar, de deVar, int i5) {
        for (int i6 = i; i6 < i3 + i; i6++) {
            int i7 = i2;
            while (i7 < i4 + i2) {
                try {
                    int i8 = dbVar.ak[0][i6][i7] - 1;
                    if (i8 != -1) {
                        deVar.aj(i6, i7, 5, cm.aj(i8, 1608408206), -530124952);
                    }
                    i7++;
                } catch (Throwable e) {
                    throw ei.ac(e, "dw.ax(" + ')');
                }
            }
        }
    }

    void da(int i, int i2, int i3, int i4, db dbVar, de deVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                int i7 = dbVar.ak[0][i5][i6] - 1;
                if (i7 != -1) {
                    deVar.aj(i5, i6, 5, cm.aj(i7, 2018201382), -530124952);
                }
            }
        }
    }

    void di(int i, int i2, int i3, int i4, db dbVar, de deVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                int i7 = dbVar.ak[0][i5][i6] - 1;
                if (i7 != -1) {
                    deVar.aj(i5, i6, 5, cm.aj(i7, 1385318395), -530124952);
                }
            }
        }
    }

    void dw(int i, int i2, int i3, int i4, db dbVar, de deVar) {
        for (int i5 = i; i5 < i3 + i; i5++) {
            for (int i6 = i2; i6 < i4 + i2; i6++) {
                int i7 = dbVar.ak[0][i5][i6] - 1;
                if (i7 != -1) {
                    deVar.aj(i5, i6, 5, cm.aj(i7, 2110282736), -530124952);
                }
            }
        }
    }

    void af(int i, int i2, int i3, int i4, int i5, int i6, dw dwVar, de deVar, int i7) {
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = 0;
            while (i9 < i6) {
                try {
                    int bz = dwVar.bz(i8 + i, i2 + i9, (byte) 37);
                    if (-1 != bz) {
                        aw aj = cm.aj(bz, 2023481271);
                        deVar.aj(i8 + i3, i4 + i9, 5, aj, -530124952);
                    }
                    i9++;
                } catch (Throwable e) {
                    throw ei.ac(e, "dw.af(" + ')');
                }
            }
        }
    }

    void dq(int i, int i2, int i3, int i4, int i5, int i6, dw dwVar, de deVar) {
        for (int i7 = 0; i7 < i5; i7++) {
            for (int i8 = 0; i8 < i6; i8++) {
                int bz = dwVar.bz(i7 + i, i2 + i8, (byte) -3);
                if (-1 != bz) {
                    aw aj = cm.aj(bz, 1774729554);
                    deVar.aj(i7 + i3, i4 + i8, 5, aj, -530124952);
                }
            }
        }
    }

    void dv(int i, int i2, int i3, int i4, int i5, int i6, dw dwVar, de deVar) {
        for (int i7 = 0; i7 < i5; i7++) {
            for (int i8 = 0; i8 < i6; i8++) {
                int bz = dwVar.bz(i7 + i, i2 + i8, (byte) -81);
                if (-1 != bz) {
                    aw aj = cm.aj(bz, 1844896413);
                    deVar.aj(i7 + i3, i4 + i8, 5, aj, -530124952);
                }
            }
        }
    }

    int au(int i, int i2, db dbVar, int i3) {
        try {
            if (dbVar.ak[0][i][i2] == (short) 0) {
                return -1059902355 * this.ah;
            }
            return this.aw[i][i2];
        } catch (Throwable e) {
            throw ei.ac(e, "dw.au(" + ')');
        }
    }

    int dt(int i, int i2, db dbVar) {
        if (dbVar.ak[0][i][i2] == (short) 0) {
            return -1059902355 * this.ah;
        }
        return this.aw[i][i2];
    }

    void av(int i, int i2, db dbVar, fl[] flVarArr, byte b) {
        int i3 = 0;
        while (i3 < 793351865 * dbVar.aa) {
            try {
                eq[] eqVarArr = dbVar.ai[i3][i][i2];
                if (!(eqVarArr == null || eqVarArr.length == 0)) {
                    for (eq eqVar : eqVarArr) {
                        if (!ay.an(eqVar.ac * 537922759, (byte) 1)) {
                            if (!hz.ak(537922759 * eqVar.ac, 939375965)) {
                            }
                        }
                        ah ac = ey.ac(eqVar.aj * 644111461, -184826223);
                        if (-1 != ac.br * -241108131) {
                            if (46 == -241108131 * ac.br || -241108131 * ac.br == 52) {
                                ao.ay(flVarArr[ac.br * -241108131], (-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), (-1391985266 * this.ai) + 1, (this.ai * -1391985266) + 1, -401924967);
                            } else {
                                ao.ay(flVarArr[ac.br * -241108131], (-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), this.ai * -1391985266, this.ai * -1391985266, -401924967);
                            }
                        }
                    }
                }
                i3++;
            } catch (Throwable e) {
                throw ei.ac(e, "dw.av(" + ')');
            }
        }
    }

    void ay(int i, int i2, db dbVar, int i3) {
        int i4 = 0;
        while (i4 < dbVar.aa * 793351865) {
            try {
                eq[] eqVarArr = dbVar.ai[i4][i][i2];
                if (!(eqVarArr == null || eqVarArr.length == 0)) {
                    for (eq eqVar : eqVarArr) {
                        if (cs.aj(537922759 * eqVar.ac, (byte) 71)) {
                            int i5 = ey.ac(644111461 * eqVar.aj, -1208925648).av * 95815989 != 0 ? an : ac;
                            if (-1757901075 * if.aj.ar == eqVar.ac * 537922759) {
                                bo(i, i2, eqVar.an * 237959025, i5, 1961043524);
                            }
                            if (eqVar.ac * 537922759 == if.an.ar * -1757901075) {
                                bo(i, i2, eqVar.an * 237959025, ac, 1622760715);
                                bo(i, i2, (eqVar.an * 237959025) + 1, i5, 976262575);
                            }
                            if (537922759 * eqVar.ac == -1757901075 * if.aq.ar) {
                                if (eqVar.an * 237959025 == 0) {
                                    ao.ai((-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), 1, i5, -1323746101);
                                }
                                if (eqVar.an * 237959025 == 1) {
                                    ao.ai((((-695992633 * this.ai) * i) + (this.ai * -695992633)) - 1, (63 - i2) * (this.ai * -695992633), 1, i5, -1170780765);
                                }
                                if (eqVar.an * 237959025 == 2) {
                                    ao.ai((((this.ai * -695992633) * i) + (-695992633 * this.ai)) - 1, ((-695992633 * this.ai) + ((this.ai * -695992633) * (63 - i2))) - 1, 1, i5, -1681192209);
                                }
                                if (3 == eqVar.an * 237959025) {
                                    ao.ai((this.ai * -695992633) * i, (((this.ai * -695992633) * (63 - i2)) + (-695992633 * this.ai)) - 1, 1, i5, -1747403254);
                                }
                            }
                            if (eqVar.ac * 537922759 == if.ao.ar * -1757901075) {
                                int i6;
                                if ((eqVar.an * 237959025) % 2 == 0) {
                                    for (i6 = 0; i6 < -695992633 * this.ai; i6++) {
                                        ao.ai(((-695992633 * this.ai) * i) + i6, (((-695992633 * this.ai) * (64 - i2)) - 1) - i6, 1, i5, -2019614222);
                                    }
                                } else {
                                    for (i6 = 0; i6 < this.ai * -695992633; i6++) {
                                        ao.ai(((this.ai * -695992633) * i) + i6, ((63 - i2) * (-695992633 * this.ai)) + i6, 1, i5, -1306085294);
                                    }
                                }
                            }
                        }
                    }
                }
                i4++;
            } catch (Throwable e) {
                throw ei.ac(e, "dw.ay(" + ')');
            }
        }
    }

    void do(int i, int i2, db dbVar) {
        for (int i3 = 0; i3 < dbVar.aa * 793351865; i3++) {
            eq[] eqVarArr = dbVar.ai[i3][i][i2];
            if (!(eqVarArr == null || eqVarArr.length == 0)) {
                for (eq eqVar : eqVarArr) {
                    if (cs.aj(537922759 * eqVar.ac, (byte) 78)) {
                        int i4;
                        if (ey.ac(644111461 * eqVar.aj, -1007951542).av * 95815989 != 0) {
                            i4 = an;
                        } else {
                            i4 = ac;
                        }
                        if (-1757901075 * if.aj.ar == eqVar.ac * 537922759) {
                            bo(i, i2, eqVar.an * 237959025, i4, 2112791935);
                        }
                        if (eqVar.ac * 537922759 == if.an.ar * -1757901075) {
                            bo(i, i2, eqVar.an * 237959025, ac, 1054066289);
                            bo(i, i2, (eqVar.an * 237959025) + 1, i4, 1229559067);
                        }
                        if (537922759 * eqVar.ac == -1757901075 * if.aq.ar) {
                            if (eqVar.an * 237959025 == 0) {
                                ao.ai((-695992633 * this.ai) * i, (63 - i2) * (-695992633 * this.ai), 1, i4, -2053970767);
                            }
                            if (eqVar.an * 237959025 == 1) {
                                ao.ai((((-695992633 * this.ai) * i) + (this.ai * -695992633)) - 1, (63 - i2) * (this.ai * -695992633), 1, i4, -1859927297);
                            }
                            if (eqVar.an * 237959025 == 2) {
                                ao.ai((((this.ai * -695992633) * i) + (-695992633 * this.ai)) - 1, ((-695992633 * this.ai) + ((this.ai * -695992633) * (63 - i2))) - 1, 1, i4, -1671801358);
                            }
                            if (3 == eqVar.an * 237959025) {
                                ao.ai((this.ai * -695992633) * i, (((this.ai * -695992633) * (63 - i2)) + (-695992633 * this.ai)) - 1, 1, i4, -917643856);
                            }
                        }
                        if (eqVar.ac * 537922759 == if.ao.ar * -1757901075) {
                            int i5;
                            if ((eqVar.an * 237959025) % 2 == 0) {
                                for (i5 = 0; i5 < -695992633 * this.ai; i5++) {
                                    ao.ai(((-695992633 * this.ai) * i) + i5, (((-695992633 * this.ai) * (64 - i2)) - 1) - i5, 1, i4, -1129490483);
                                }
                            } else {
                                for (i5 = 0; i5 < this.ai * -695992633; i5++) {
                                    ao.ai(((this.ai * -695992633) * i) + i5, ((63 - i2) * (-695992633 * this.ai)) + i5, 1, i4, -1073411453);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void ag(int i, int i2, HashSet hashSet, int i3, es esVar, byte b) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        try {
            for (Entry entry : this.as.entrySet()) {
                bt btVar = (bt) entry.getKey();
                int i4 = (int) ((((float) i) + (((float) (-486841375 * btVar.ac)) * f)) - f2);
                int i5 = (int) ((((float) (i3 + i2)) - (((float) (btVar.an * -1974196523)) * f)) - f2);
                di diVar = (di) entry.getValue();
                if (diVar != null) {
                    diVar.ak = -1696110747 * i4;
                    diVar.ap = -2051980201 * i5;
                    if (!hashSet.contains(Integer.valueOf(aa.ac[963317847 * diVar.aj].ak((byte) -110)))) {
                        ab(diVar, i4, i5, f, esVar, -1775217650);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ag(" + ')');
        }
    }

    void dj(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        for (Entry entry : this.as.entrySet()) {
            bt btVar = (bt) entry.getKey();
            int i4 = (int) ((((float) i) + (((float) (-486841375 * btVar.ac)) * f)) - f2);
            int i5 = (int) ((((float) (i3 + i2)) - (((float) (btVar.an * -165005112)) * f)) - f2);
            di diVar = (di) entry.getValue();
            if (diVar != null) {
                diVar.ak = -1696110747 * i4;
                diVar.ap = -2051980201 * i5;
                if (!hashSet.contains(Integer.valueOf(aa.ac[-628202262 * diVar.aj].ak((byte) -2)))) {
                    ab(diVar, i4, i5, f, esVar, -1775217650);
                }
            }
        }
    }

    void dm(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        for (Entry entry : this.as.entrySet()) {
            bt btVar = (bt) entry.getKey();
            int i4 = (int) ((((float) i) + (((float) (-486841375 * btVar.ac)) * f)) - f2);
            int i5 = (int) ((((float) (i3 + i2)) - (((float) (btVar.an * -1974196523)) * f)) - f2);
            di diVar = (di) entry.getValue();
            if (diVar != null) {
                diVar.ak = -1696110747 * i4;
                diVar.ap = -2050856299 * i5;
                if (!hashSet.contains(Integer.valueOf(aa.ac[963317847 * diVar.aj].ak((byte) -38)))) {
                    ab(diVar, i4, i5, f, esVar, -1775217650);
                }
            }
        }
    }

    void dz(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        float f2 = f / 2.0f;
        for (Entry entry : this.as.entrySet()) {
            bt btVar = (bt) entry.getKey();
            int i4 = (int) ((((float) i) + (((float) (-486841375 * btVar.ac)) * f)) - f2);
            int i5 = (int) ((((float) (i3 + i2)) - (((float) (btVar.an * -1974196523)) * f)) - f2);
            di diVar = (di) entry.getValue();
            if (diVar != null) {
                diVar.ak = -1696110747 * i4;
                diVar.ap = -1887062440 * i5;
                if (!hashSet.contains(Integer.valueOf(aa.ac[963317847 * diVar.aj].ak((byte) -66)))) {
                    ab(diVar, i4, i5, f, esVar, -1775217650);
                }
            }
        }
    }

    void ar(HashSet hashSet, int i, int i2, es esVar, int i3) {
        try {
            for (di diVar : this.ae) {
                aa aaVar = aa.ac[diVar.aj * 963317847];
                if (aaVar != null && hashSet.contains(Integer.valueOf(aaVar.ak((byte) -43)))) {
                    ad(aaVar, diVar.ak * -1110019475, -583669913 * diVar.ap, i, i2, esVar, -2049213029);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ar(" + ')');
        }
    }

    void du(HashSet hashSet, int i, int i2, es esVar) {
        for (di diVar : this.ae) {
            aa aaVar = aa.ac[diVar.aj * 1197096439];
            if (aaVar != null && hashSet.contains(Integer.valueOf(aaVar.ak((byte) -77)))) {
                ad(aaVar, diVar.ak * 1547787794, -583669913 * diVar.ap, i, i2, esVar, -1422530243);
            }
        }
    }

    void ad(aa aaVar, int i, int i2, int i3, int i4, es esVar, int i5) {
        try {
            em ao = aaVar.ao(false, -379585054);
            if (ao != null) {
                esVar.ax(ao, i - (ao.ac / 2), i2 - (ao.an / 2), 1231133277);
                if (i3 % i4 >= i4 / 2) {
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ad(" + ')');
        }
    }

    void df(aa aaVar, int i, int i2, int i3, int i4, es esVar) {
        em ao = aaVar.ao(false, 1356379318);
        if (ao != null) {
            esVar.ax(ao, i - (ao.ac / 2), i2 - (ao.an / 2), 1231133277);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void dg(aa aaVar, int i, int i2, int i3, int i4, es esVar) {
        em ao = aaVar.ao(false, 684729779);
        if (ao != null) {
            esVar.ax(ao, i - (ao.ac / 2), i2 - (ao.an / 2), 1231133277);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void dn(aa aaVar, int i, int i2, int i3, int i4, es esVar) {
        em ao = aaVar.ao(false, -858848624);
        if (ao != null) {
            esVar.ax(ao, i - (ao.ac / 2), i2 - (ao.an / 2), 1231133277);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void dy(aa aaVar, int i, int i2, int i3, int i4, es esVar) {
        em ao = aaVar.ao(false, -1739866400);
        if (ao != null) {
            esVar.ax(ao, i - (ao.ac / 2), i2 - (ao.an / 2), 1231133277);
            if (i3 % i4 >= i4 / 2) {
            }
        }
    }

    void ab(di diVar, int i, int i2, float f, es esVar, int i3) {
        try {
            aa aaVar = aa.ac[diVar.aj * 963317847];
            bp(aaVar, i, i2, esVar, -826378289);
            bm(diVar, aaVar, i, i2, f, esVar, (byte) 120);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.ab(" + ')');
        }
    }

    void bp(aa aaVar, int i, int i2, es esVar, int i3) {
        try {
            em ao = aaVar.ao(false, 1980841820);
            if (ao != null) {
                esVar.ax(ao, bb(ao, aaVar.af, (byte) -76) + i, bu(ao, aaVar.au, (short) 23132) + i2, 1231133277);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bp(" + ')');
        }
    }

    void dc(aa aaVar, int i, int i2, es esVar) {
        em ao = aaVar.ao(false, 646189313);
        if (ao != null) {
            esVar.ax(ao, bb(ao, aaVar.af, (byte) -82) + i, bu(ao, aaVar.au, (short) 8673) + i2, 1231133277);
        }
    }

    void ei(aa aaVar, int i, int i2, es esVar) {
        em ao = aaVar.ao(false, -1649510319);
        if (ao != null) {
            esVar.ax(ao, bb(ao, aaVar.af, (byte) -81) + i, bu(ao, aaVar.au, (short) 6773) + i2, 1231133277);
        }
    }

    void ep(aa aaVar, int i, int i2, es esVar) {
        em ao = aaVar.ao(false, 1900443088);
        if (ao != null) {
            esVar.ax(ao, bb(ao, aaVar.af, (byte) -76) + i, bu(ao, aaVar.au, (short) 24363) + i2, 1231133277);
        }
    }

    void eq(aa aaVar, int i, int i2, es esVar) {
        em ao = aaVar.ao(false, -795074771);
        if (ao != null) {
            esVar.ax(ao, bb(ao, aaVar.af, (byte) -81) + i, bu(ao, aaVar.au, (short) 10567) + i2, 1231133277);
        }
    }

    void eu(aa aaVar, int i, int i2, es esVar) {
        em ao = aaVar.ao(false, 215599554);
        if (ao != null) {
            esVar.ax(ao, bb(ao, aaVar.af, (byte) -66) + i, bu(ao, aaVar.au, (short) -6964) + i2, 1231133277);
        }
    }

    void bm(di diVar, aa aaVar, int i, int i2, float f, es esVar, byte b) {
        try {
            if (diVar.aa != null && diVar.aa.aq.aj(f, -1229191444)) {
                kh khVar = (kh) this.al.get(diVar.aa.aq);
                khVar.am(diVar.aa.aj, i - ((-71814233 * diVar.aa.ac) / 2), i2, diVar.aa.ac * -71814233, diVar.aa.an * -1448750101, (-1423459611 * aaVar.at) | -16777216, 0, 1, 0, khVar.ak / 2, esVar);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bm(" + ')');
        }
    }

    void eb(di diVar, aa aaVar, int i, int i2, float f, es esVar) {
        if (diVar.aa != null && diVar.aa.aq.aj(f, 286752195)) {
            kh khVar = (kh) this.al.get(diVar.aa.aq);
            khVar.am(diVar.aa.aj, i - ((-71814233 * diVar.aa.ac) / 2), i2, diVar.aa.ac * -71814233, diVar.aa.an * -1448750101, (-1423459611 * aaVar.at) | -16777216, 0, 1, 0, khVar.ak / 2, esVar);
        }
    }

    void eh(di diVar, aa aaVar, int i, int i2, float f, es esVar) {
        if (diVar.aa != null) {
            if (diVar.aa.aq.aj(f, -943162215)) {
                kh khVar = (kh) this.al.get(diVar.aa.aq);
                khVar.am(diVar.aa.aj, i - ((-71814233 * diVar.aa.ac) / 2), i2, diVar.aa.ac * -71814233, diVar.aa.an * -1448750101, (-1129509961 * aaVar.at) | -16777216, 0, 1, 0, khVar.ak / 2, esVar);
            }
        }
    }

    void ej(di diVar, aa aaVar, int i, int i2, float f, es esVar) {
        if (diVar.aa != null) {
            if (diVar.aa.aq.aj(f, -1615838974)) {
                kh khVar = (kh) this.al.get(diVar.aa.aq);
                khVar.am(diVar.aa.aj, i - ((-1027362404 * diVar.aa.ac) / 2), i2, diVar.aa.ac * -71814233, diVar.aa.an * 122215195, (1281678425 * aaVar.at) | -16777216, 0, 1, 0, khVar.ak / 2, esVar);
            }
        }
    }

    void ek(di diVar, aa aaVar, int i, int i2, float f, es esVar) {
        if (diVar.aa != null && diVar.aa.aq.aj(f, -445436671)) {
            kh khVar = (kh) this.al.get(diVar.aa.aq);
            khVar.am(diVar.aa.aj, i - ((-71814233 * diVar.aa.ac) / 2), i2, diVar.aa.ac * -71814233, diVar.aa.an * -1448750101, (-1423459611 * aaVar.at) | -16777216, 0, 1, 0, khVar.ak / 2, esVar);
        }
    }

    void bh(int i, int i2, HashSet hashSet, int i3, es esVar, byte b) {
        float f = ((float) i3) / 64.0f;
        try {
            for (di diVar : this.ae) {
                int i4 = (diVar.ac.an * -1974196523) % 64;
                diVar.ak = ((int) ((((float) ((diVar.ac.ac * -486841375) % 64)) * f) + ((float) i))) * -1696110747;
                diVar.ap = -2051980201 * ((int) ((((float) (63 - i4)) * f) + ((float) i2)));
                if (!hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                    ab(diVar, -1110019475 * diVar.ak, -583669913 * diVar.ap, f, esVar, -1775217650);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bh(" + ')');
        }
    }

    void el(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        for (di diVar : this.ae) {
            int i4 = (diVar.ac.an * -1974196523) % 64;
            diVar.ak = ((int) ((((float) ((diVar.ac.ac * -486841375) % 64)) * f) + ((float) i))) * -1696110747;
            diVar.ap = -2051980201 * ((int) ((((float) (63 - i4)) * f) + ((float) i2)));
            if (!hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                ab(diVar, -1110019475 * diVar.ak, -583669913 * diVar.ap, f, esVar, -1775217650);
            }
        }
    }

    void ex(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        for (di diVar : this.ae) {
            int i4 = (diVar.ac.an * -1974196523) % 64;
            diVar.ak = ((int) ((((float) ((diVar.ac.ac * -486841375) % 64)) * f) + ((float) i))) * -1696110747;
            diVar.ap = -2051980201 * ((int) ((((float) (63 - i4)) * f) + ((float) i2)));
            if (!hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                ab(diVar, -1110019475 * diVar.ak, -583669913 * diVar.ap, f, esVar, -1775217650);
            }
        }
    }

    void ey(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        for (di diVar : this.ae) {
            int i4 = (diVar.ac.an * -1974196523) % 64;
            diVar.ak = ((int) ((((float) ((diVar.ac.ac * -486841375) % 64)) * f) + ((float) i))) * -1696110747;
            diVar.ap = -2051980201 * ((int) ((((float) (63 - i4)) * f) + ((float) i2)));
            if (!hashSet.contains(Integer.valueOf(diVar.aj * 963317847))) {
                ab(diVar, -1110019475 * diVar.ak, -583669913 * diVar.ap, f, esVar, -1775217650);
            }
        }
    }

    void ez(int i, int i2, HashSet hashSet, int i3, es esVar) {
        float f = ((float) i3) / 64.0f;
        for (di diVar : this.ae) {
            int i4 = (diVar.ac.an * -1974196523) % 64;
            diVar.ak = ((int) ((((float) ((diVar.ac.ac * 731943585) % 64)) * f) + ((float) i))) * -1000009599;
            diVar.ap = -2051980201 * ((int) ((((float) (63 - i4)) * f) + ((float) i2)));
            if (!hashSet.contains(Integer.valueOf(diVar.aj * 1975939543))) {
                ab(diVar, -1110019475 * diVar.ak, -583669913 * diVar.ap, f, esVar, -1775217650);
            }
        }
    }

    void bt(int i) {
        try {
            int i2;
            if (this.ap != null) {
                for (i2 = 0; i2 < 64; i2++) {
                    for (int i3 = 0; i3 < 64; i3++) {
                        br(i2, i3, this.ap, -1567505383);
                    }
                }
                return;
            }
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                da daVar = (da) it.next();
                for (i2 = daVar.bm(2143941393) * 8; i2 < (daVar.bm(2143941393) * 8) + 8; i2++) {
                    for (int bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                        br(i2, bh, daVar, -2007388136);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bt(" + ')');
        }
    }

    void ec() {
        int i;
        if (this.ap != null) {
            for (i = 0; i < 64; i++) {
                for (int i2 = 0; i2 < 64; i2++) {
                    br(i, i2, this.ap, -1517141763);
                }
            }
            return;
        }
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            for (int bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (i = daVar.bh(1097489216) * 8; i < (daVar.bh(1097489216) * 8) + 8; i++) {
                    br(bm, i, daVar, -1467048943);
                }
            }
        }
    }

    void ed() {
        int i;
        if (this.ap != null) {
            for (i = 0; i < 64; i++) {
                for (int i2 = 0; i2 < 1604454790; i2++) {
                    br(i, i2, this.ap, -1736851452);
                }
            }
            return;
        }
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            for (int bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (i = daVar.bh(1097489216) * 8; i < (daVar.bh(1097489216) * 8) + 8; i++) {
                    br(bm, i, daVar, -1546912309);
                }
            }
        }
    }

    void et() {
        if (this.ap != null) {
            for (int i = 0; i < 64; i++) {
            }
            return;
        }
        Iterator it = this.at.iterator();
        while (it.hasNext()) {
            da daVar = (da) it.next();
            for (int bm = daVar.bm(2143941393) * 8; bm < (daVar.bm(2143941393) * 8) + 8; bm++) {
                for (int bh = daVar.bh(1097489216) * 8; bh < (daVar.bh(1097489216) * 8) + 8; bh++) {
                    br(bm, bh, daVar, -1829467075);
                }
            }
        }
    }

    void br(int i, int i2, db dbVar, int i3) {
        try {
            az.aj(0, i, i2, -1845995408);
            for (int i4 = 0; i4 < dbVar.aa * 793351865; i4++) {
                eq[] eqVarArr = dbVar.ai[i4][i][i2];
                if (!(eqVarArr == null || eqVarArr.length == 0)) {
                    for (eq eqVar : eqVarArr) {
                        aa bd = bd(eqVar.aj * 644111461, 1343491777);
                        if (bd != null) {
                            di diVar = (di) this.as.get(az);
                            if (diVar != null) {
                                if (diVar.aj * 963317847 != -1664471809 * bd.ao) {
                                    di diVar2 = new di(-1664471809 * bd.ao, diVar.an, diVar.ac, bx(bd, 1922534582));
                                    this.as.put(new bt(az), diVar2);
                                    diVar = diVar2;
                                }
                                int i5 = (-201339469 * diVar.an.aj) - (diVar.ac.aj * -201339469);
                                diVar.ac.aj = 16755067 * i4;
                                diVar.an.aj = (i5 + i4) * 16755067;
                                return;
                            }
                            bt btVar;
                            bt btVar2 = new bt(i4, (-1154826688 * this.aa) + i, (this.ak * -1058728000) + i2);
                            if (this.ap != null) {
                                btVar = new bt((-1153877303 * this.ap.ao) + i4, (-855023040 * this.ap.aj) + i, (this.ap.ac * 1009638336) + i2);
                            } else {
                                Iterator it = this.at.iterator();
                                while (it.hasNext()) {
                                    da daVar = (da) it.next();
                                    if (daVar.ad(i, i2, -2005100015)) {
                                        btVar = new bt((-1153877303 * daVar.ao) + i4, ((-855023040 * daVar.aj) + i) + (daVar.ab((byte) 9) * 8), (daVar.bp(-911474579) * 8) + ((daVar.ac * 1009638336) + i2));
                                        break;
                                    }
                                }
                                btVar = null;
                            }
                            if (btVar != null) {
                                this.as.put(new bt(az), new di(-1664471809 * bd.ao, btVar, btVar2, bx(bd, -1455117975)));
                                return;
                            }
                        }
                    }
                    continue;
                }
            }
            this.as.remove(az);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.br(" + ')');
        }
    }

    int bb(em emVar, au auVar, byte b) {
        try {
            switch (1236484519 * auVar.aq) {
                case 0:
                    return (-emVar.ac) / 2;
                case 1:
                    return 0;
                default:
                    return -emVar.ac;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bb(" + ')');
        }
    }

    int ea(em emVar, au auVar) {
        switch (1236484519 * auVar.aq) {
            case 0:
                return (-emVar.ac) / 2;
            case 1:
                return 0;
            default:
                return -emVar.ac;
        }
    }

    int er(em emVar, au auVar) {
        switch (1236484519 * auVar.aq) {
            case 0:
                return (-emVar.ac) / 2;
            case 1:
                return 0;
            default:
                return -emVar.ac;
        }
    }

    int bu(em emVar, ak akVar, short s) {
        try {
            switch (-1863425315 * akVar.aq) {
                case 0:
                    return (-emVar.an) / 2;
                case 1:
                    return 0;
                default:
                    return -emVar.an;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bu(" + ')');
        }
    }

    int ee(em emVar, ak akVar) {
        switch (-1863425315 * akVar.aq) {
            case 0:
                return (-emVar.an) / 2;
            case 1:
                return 0;
            default:
                return -emVar.an;
        }
    }

    int em(em emVar, ak akVar) {
        switch (743374218 * akVar.aq) {
            case 0:
                return (-emVar.an) / 2;
            case 1:
                return 0;
            default:
                return -emVar.an;
        }
    }

    int ew(em emVar, ak akVar) {
        switch (1433466976 * akVar.aq) {
            case 0:
                return (-emVar.an) / 2;
            case 1:
                return 0;
            default:
                return -emVar.an;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    defpackage.aa bd(int r6, int r7) {
        /*
        r5 = this;
        r0 = 0;
        r4 = -1463646961; // 0xffffffffa8c2850f float:-2.1596032E-14 double:NaN;
        r1 = -278718564; // 0xffffffffef63179c float:-7.028164E28 double:NaN;
        r1 = defpackage.ey.ac(r6, r1);	 Catch:{ RuntimeException -> 0x0027 }
        r2 = r1.ba;	 Catch:{ RuntimeException -> 0x0027 }
        if (r2 == 0) goto L_0x0019;
    L_0x000f:
        r2 = 130270192; // 0x7c3c3f0 float:2.94555E-34 double:6.43620265E-316;
        r1 = r1.aw(r2);	 Catch:{ RuntimeException -> 0x0027 }
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        return r0;
    L_0x0019:
        r2 = -1;
        r3 = r1.bt;	 Catch:{ RuntimeException -> 0x0027 }
        r3 = r3 * r4;
        if (r2 == r3) goto L_0x0018;
    L_0x001f:
        r0 = defpackage.aa.ac;	 Catch:{ RuntimeException -> 0x0027 }
        r1 = r1.bt;	 Catch:{ RuntimeException -> 0x0027 }
        r1 = r1 * r4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0027 }
        goto L_0x0018;
    L_0x0027:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "dw.bd(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.bd(int, int):aa");
    }

    aa eg(int i) {
        ah ac = ey.ac(i, -475545095);
        if (ac.ba != null) {
            ac = ac.aw(2076614072);
            if (ac == null) {
                return null;
            }
        }
        return -1 != 1532587825 * ac.bt ? aa.ac[ac.bt * -1771486781] : null;
    }

    aa en(int i) {
        ah ac = ey.ac(i, -715746209);
        if (ac.ba != null) {
            ac = ac.aw(1156794573);
            if (ac == null) {
                return null;
            }
        }
        if (-1 != -1463646961 * ac.bt) {
            return aa.ac[ac.bt * -934456936];
        }
        return null;
    }

    aa eo(int i) {
        ah ac = ey.ac(i, -689651640);
        if (ac.ba != null) {
            ac = ac.aw(501389018);
            if (ac == null) {
                return null;
            }
        }
        if (-1 != ac.bt * -1463646961) {
            return aa.ac[ac.bt * -1463646961];
        }
        return null;
    }

    aa ev(int i) {
        ah ac = ey.ac(i, -1213919592);
        if (ac.ba != null) {
            ac = ac.aw(-18542338);
            if (ac == null) {
                return null;
            }
        }
        if (-1 != 673567694 * ac.bt) {
            return aa.ac[ac.bt * 168405085];
        }
        return null;
    }

    dy by(int i, int i2) {
        try {
            return bx(aa.ac[i], 534515858);
        } catch (Throwable e) {
            throw ei.ac(e, "dw.by(" + ')');
        }
    }

    dy ef(int i) {
        return bx(aa.ac[i], 476778538);
    }

    dy es(int i) {
        return bx(aa.ac[i], 1860495678);
    }

    dy bx(aa aaVar, int i) {
        int i2 = 0;
        dy dyVar = null;
        try {
            if (!(aaVar.ap == null || this.al == null || this.al.get(dn.aj) == null)) {
                dn dnVar;
                int i3 = aaVar.ah * -1070341955;
                dn[] dnVarArr = new dn[]{dn.aj, dn.an, dn.ac};
                for (dn dnVar2 : dnVarArr) {
                    if (dnVar2.aa * 1869523941 == i3) {
                        dnVar = dnVar2;
                        break;
                    }
                }
                dnVar = null;
                if (dnVar != null) {
                    kh khVar = (kh) this.al.get(dnVar);
                    if (khVar != null) {
                        String[] strArr = new String[khVar.ak(aaVar.ap, 1000000)];
                        khVar.ao(aaVar.ap, null, strArr);
                        int length = (khVar.ak * strArr.length) / 2;
                        i3 = 0;
                        while (i3 < strArr.length) {
                            int aq = khVar.aq(strArr[i3]);
                            if (aq <= i2) {
                                aq = i2;
                            }
                            i3++;
                            i2 = aq;
                        }
                        dyVar = new dy(aaVar.ap, i2, length, dnVar);
                    }
                }
            }
            return dyVar;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bx(" + ')');
        }
    }

    dy fi(aa aaVar) {
        int i = 0;
        if (aaVar.ap == null || this.al == null || this.al.get(dn.aj) == null) {
            return null;
        }
        int i2 = aaVar.ah * -1070341955;
        dn[] dnVarArr = new dn[]{dn.aj, dn.an, dn.ac};
        for (dn dnVar : dnVarArr) {
            if (dnVar.aa * 1869523941 == i2) {
                break;
            }
        }
        dn dnVar2 = null;
        if (dnVar2 == null) {
            return null;
        }
        kh khVar = (kh) this.al.get(dnVar2);
        if (khVar == null) {
            return null;
        }
        String[] strArr = new String[khVar.ak(aaVar.ap, 1000000)];
        khVar.ao(aaVar.ap, null, strArr);
        int length = (khVar.ak * strArr.length) / 2;
        int i3 = 0;
        while (i < strArr.length) {
            i2 = khVar.aq(strArr[i]);
            if (i2 > i3) {
                i3 = i2;
            }
            i++;
        }
        return new dy(aaVar.ap, i3, length, dnVar2);
    }

    dy fj(aa aaVar) {
        int i = 0;
        if (aaVar.ap == null || this.al == null || this.al.get(dn.aj) == null) {
            return null;
        }
        int i2 = aaVar.ah * -1070341955;
        dn[] dnVarArr = new dn[]{dn.aj, dn.an, dn.ac};
        for (dn dnVar : dnVarArr) {
            if (dnVar.aa * 1869523941 == i2) {
                break;
            }
        }
        dn dnVar2 = null;
        if (dnVar2 == null) {
            return null;
        }
        kh khVar = (kh) this.al.get(dnVar2);
        if (khVar == null) {
            return null;
        }
        String[] strArr = new String[khVar.ak(aaVar.ap, 1000000)];
        khVar.ao(aaVar.ap, null, strArr);
        int length = (khVar.ak * strArr.length) / 2;
        int i3 = 0;
        while (i < strArr.length) {
            i2 = khVar.aq(strArr[i]);
            if (i2 > i3) {
                i3 = i2;
            }
            i++;
        }
        return new dy(aaVar.ap, i3, length, dnVar2);
    }

    List bi(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            LinkedList linkedList = new LinkedList();
            if (i4 < i || i5 < i2) {
                return linkedList;
            }
            if (i4 >= i3 + i || i5 >= i3 + i2) {
                return linkedList;
            }
            for (di diVar : this.as.values()) {
                if (diVar.aj(i4, i5, 1852882821)) {
                    linkedList.add(diVar);
                }
            }
            for (di diVar2 : this.ae) {
                if (diVar2.aj(i4, i5, 1852882821)) {
                    linkedList.add(diVar2);
                }
            }
            return linkedList;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bi(" + ')');
        }
    }

    List fd(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (di diVar : this.as.values()) {
            if (diVar.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar);
            }
        }
        for (di diVar2 : this.ae) {
            if (diVar2.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar2);
            }
        }
        return linkedList;
    }

    List fl(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (di diVar : this.as.values()) {
            if (diVar.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar);
            }
        }
        for (di diVar2 : this.ae) {
            if (diVar2.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar2);
            }
        }
        return linkedList;
    }

    List fn(int i, int i2, int i3, int i4, int i5) {
        LinkedList linkedList = new LinkedList();
        if (i4 < i || i5 < i2) {
            return linkedList;
        }
        if (i4 >= i3 + i || i5 >= i3 + i2) {
            return linkedList;
        }
        for (di diVar : this.as.values()) {
            if (diVar.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar);
            }
        }
        for (di diVar2 : this.ae) {
            if (diVar2.aj(i4, i5, 1852882821)) {
                linkedList.add(diVar2);
            }
        }
        return linkedList;
    }

    List bs(short s) {
        try {
            List linkedList = new LinkedList();
            linkedList.addAll(this.ae);
            linkedList.addAll(this.as.values());
            return linkedList;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bs(" + ')');
        }
    }

    List fh() {
        List linkedList = new LinkedList();
        linkedList.addAll(this.ae);
        linkedList.addAll(this.as.values());
        return linkedList;
    }

    List fv() {
        List linkedList = new LinkedList();
        linkedList.addAll(this.ae);
        linkedList.addAll(this.as.values());
        return linkedList;
    }

    void bo(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6 = i3 % 4;
            if (i6 == 0) {
                ao.am((this.ai * -695992633) * i, (63 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -61);
            }
            if (1 == i6) {
                ao.ai((this.ai * -695992633) * i, (this.ai * -695992633) * (63 - i2), this.ai * -695992633, i4, -2093759579);
            }
            if (i6 == 2) {
                ao.am(((this.ai * -695992633) + ((this.ai * -695992633) * i)) - 1, (63 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -67);
            }
            if (3 == i6) {
                ao.ai((this.ai * -695992633) * i, (((63 - i2) * (this.ai * -695992633)) + (this.ai * -695992633)) - 1, this.ai * -695992633, i4, -1314572092);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bo(" + ')');
        }
    }

    void fo(int i, int i2, int i3, int i4) {
        int i5 = i3 % 4;
        if (i5 == 0) {
            ao.am((this.ai * -695992633) * i, (63 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -84);
        }
        if (1 == i5) {
            ao.ai((this.ai * -695992633) * i, (this.ai * -695992633) * (63 - i2), this.ai * -695992633, i4, -1171027422);
        }
        if (i5 == 2) {
            ao.am(((this.ai * -695992633) + ((this.ai * -695992633) * i)) - 1, (63 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -28);
        }
        if (3 == i5) {
            ao.ai((this.ai * -695992633) * i, (((63 - i2) * (this.ai * -695992633)) + (this.ai * -695992633)) - 1, this.ai * -695992633, i4, -2135234953);
        }
    }

    void fq(int i, int i2, int i3, int i4) {
        int i5 = i3 % 4;
        if (i5 == 0) {
            ao.am((-2028214073 * this.ai) * i, (-849984405 - i2) * (this.ai * -695992633), -1405401028 * this.ai, i4, (byte) -4);
        }
        if (1 == i5) {
            ao.ai((this.ai * -695992633) * i, (489338904 * this.ai) * (-2110098727 - i2), this.ai * -695992633, i4, -1743708266);
        }
        if (i5 == 2) {
            ao.am(((this.ai * -695992633) + ((this.ai * -695992633) * i)) - 1, (-1549089599 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -74);
        }
        if (3 == i5) {
            ao.ai((this.ai * -107341466) * i, (((63 - i2) * (this.ai * -695992633)) + (this.ai * -695992633)) - 1, this.ai * 2098555571, i4, -1869406805);
        }
    }

    void fz(int i, int i2, int i3, int i4) {
        int i5 = i3 % 4;
        if (i5 == 0) {
            ao.am((-175443457 * this.ai) * i, (759792216 - i2) * (this.ai * -695992633), -2096013579 * this.ai, i4, (byte) -44);
        }
        if (1 == i5) {
            ao.ai((this.ai * -1771727869) * i, (-1307571013 * this.ai) * (63 - i2), -2098721337 * this.ai, i4, -1769063728);
        }
        if (i5 == 2) {
            ao.am(((this.ai * -695992633) + ((1062393004 * this.ai) * i)) - 1, (63 - i2) * (this.ai * -695992633), this.ai * -695992633, i4, (byte) -118);
        }
        if (3 == i5) {
            ao.ai((this.ai * -695992633) * i, (((63 - i2) * (-622735321 * this.ai)) + (this.ai * 1218835793)) - 1, this.ai * 2139923152, i4, -1083306249);
        }
    }

    int bz(int i, int i2, byte b) {
        try {
            if (this.ap != null) {
                return this.ap.aq(i, i2, 1026095766);
            }
            if (!this.at.isEmpty()) {
                Iterator it = this.at.iterator();
                while (it.hasNext()) {
                    da daVar = (da) it.next();
                    if (daVar.ad(i, i2, -1764240029)) {
                        return daVar.aq(i, i2, -1627571808);
                    }
                }
            }
            return -1;
        } catch (Throwable e) {
            throw ei.ac(e, "dw.bz(" + ')');
        }
    }

    int fk(int i, int i2) {
        if (this.ap != null) {
            return this.ap.aq(i, i2, -1954011130);
        }
        if (!this.at.isEmpty()) {
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                da daVar = (da) it.next();
                if (daVar.ad(i, i2, -1499178580)) {
                    return daVar.aq(i, i2, -1243306184);
                }
            }
        }
        return -1;
    }

    int ft(int i, int i2) {
        if (this.ap != null) {
            return this.ap.aq(i, i2, -123458127);
        }
        if (!this.at.isEmpty()) {
            Iterator it = this.at.iterator();
            while (it.hasNext()) {
                da daVar = (da) it.next();
                if (daVar.ad(i, i2, -1940816947)) {
                    return daVar.aq(i, i2, 66843531);
                }
            }
        }
        return -1;
    }

    static int am(int i, fs fsVar, boolean z, int i2) {
        try {
            int[] iArr = gr.ak;
            int i3 = dy.ap - -401924967;
            dy.ap = i3;
            ab aj = ac.aj(iArr[i3 * -38307927], 1209979833);
            int[] iArr2;
            int i4;
            if (i == 2500) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.br * 731088057;
                return 1;
            } else if (2501 == i) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.bb * -1821656375;
                return 1;
            } else if (i == 2502) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.bu * 1120250035;
                return 1;
            } else if (2503 == i) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.bd * -1781667913;
                return 1;
            } else if (2504 == i) {
                int i5;
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                i4 = (i4 * -38307927) - 1;
                if (aj.bs) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                iArr2[i4] = i5;
                return 1;
            } else if (i != 2505) {
                return 2;
            } else {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.bi * -1228023025;
                return 1;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "dw.am(" + ')');
        }
    }
}
