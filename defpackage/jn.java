package defpackage;

import java.util.zip.CRC32;

public class jn extends ju {
    static CRC32 bm = new CRC32();
    static final int cf = 24;
    boolean ab;
    volatile boolean ad;
    le ag;
    int ar;
    le ay;
    int bh;
    volatile boolean[] bp;
    int br;
    int bt;

    public jn(le leVar, le leVar2, int i, boolean z, boolean z2, boolean z3) {
        try {
            super(z, z2);
            this.ad = false;
            this.ab = false;
            this.br = -1048856003;
            this.ay = leVar;
            this.ag = leVar2;
            this.ar = -6391267 * i;
            this.ab = z3;
            int i2 = this.ar * -1890183115;
            if (ag.au != null) {
                ag.au.ac = (716607304 * i2) - 625862259;
                ej(ag.au.ad((byte) -12), ag.au.ad((byte) -49), (byte) 45);
                return;
            }
            dw.an(null, 255, 255, 0, (byte) 0, true, (byte) -89);
            jg.av[i2] = this;
        } catch (Throwable e) {
            throw ei.ac(e, "jn.<init>(" + ')');
        }
    }

    public int ed() {
        if (this.ad) {
            return 100;
        }
        if (this.ai != null) {
            return 99;
        }
        int aq = fk.aq(255, this.ar * -1890183115, 1628924571);
        if (aq < 100) {
            return aq;
        }
        return 99;
    }

    public int ep(byte b) {
        try {
            if (this.ad) {
                return 100;
            }
            if (this.ai != null) {
                return 99;
            }
            int aq = fk.aq(255, this.ar * -1890183115, 1628924571);
            if (aq < 100) {
                return aq;
            }
            return 99;
        } catch (Throwable e) {
            throw ei.ac(e, "jn.ep(" + ')');
        }
    }

    public int ex() {
        if (this.ad) {
            return 100;
        }
        if (this.ai != null) {
            return 99;
        }
        int aq = fk.aq(255, this.ar * -1890183115, 1628924571);
        if (aq < 100) {
            return aq;
        }
        return 99;
    }

    void ac(int i, int i2) {
        try {
            jx jxVar = (jx) jg.at.aj((long) (((-1890183115 * this.ar) << 16) + i));
            if (jxVar != null) {
                jg.ap.ac(jxVar);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "jn.ac(" + ')');
        }
    }

    void bb(int i) {
        jx jxVar = (jx) jg.at.aj((long) (((-1890183115 * this.ar) << 16) + i));
        if (jxVar != null) {
            jg.ap.ac(jxVar);
        }
    }

    void br(int i) {
        jx jxVar = (jx) jg.at.aj((long) (((-1890183115 * this.ar) << 16) + i));
        if (jxVar != null) {
            jg.ap.ac(jxVar);
        }
    }

    void am(int i, byte b) {
        try {
            if (this.ay == null || this.bp == null || !this.bp[i]) {
                dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, true, (byte) -90);
                return;
            }
            bx.an(i, this.ay, this, -1250338167);
        } catch (Throwable e) {
            throw ei.ac(e, "jn.am(" + ')');
        }
    }

    void ca(int i) {
        if (this.ay == null || this.bp == null || !this.bp[i]) {
            dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, true, (byte) -31);
            return;
        }
        bx.an(i, this.ay, this, -1250338167);
    }

    void cf(int i) {
        if (this.ay == null || this.bp == null || !this.bp[i]) {
            dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, true, (byte) -111);
            return;
        }
        bx.an(i, this.ay, this, -1250338167);
    }

    void cr(int i) {
        if (this.ay == null || this.bp == null || !this.bp[i]) {
            dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, true, (byte) -4);
            return;
        }
        bx.an(i, this.ay, this, -1250338167);
    }

    void ea(int i, int i2) {
        this.bh = -957018625 * i;
        this.bt = 761401995 * i2;
        if (this.ag != null) {
            bx.an(this.ar * -1890183115, this.ag, this, -1250338167);
            return;
        }
        dw.an(this, 255, -1890183115 * this.ar, -1270418945 * this.bh, (byte) 0, true, (byte) -123);
    }

    void ec(int i, int i2) {
        this.bh = -957018625 * i;
        this.bt = 761401995 * i2;
        if (this.ag != null) {
            bx.an(this.ar * -1890183115, this.ag, this, -1250338167);
            return;
        }
        dw.an(this, 255, -1890183115 * this.ar, -1270418945 * this.bh, (byte) 0, true, (byte) -101);
    }

    void ej(int i, int i2, byte b) {
        try {
            this.bh = -957018625 * i;
            this.bt = 761401995 * i2;
            if (this.ag != null) {
                bx.an(this.ar * -1890183115, this.ag, this, -1250338167);
                return;
            }
            dw.an(this, 255, -1890183115 * this.ar, -1270418945 * this.bh, (byte) 0, true, (byte) -91);
        } catch (Throwable e) {
            throw ei.ac(e, "jn.ej(" + ')');
        }
    }

    void et(int i, int i2) {
        this.bh = -957018625 * i;
        this.bt = 761401995 * i2;
        if (this.ag != null) {
            bx.an(this.ar * -1890183115, this.ag, this, -1250338167);
            return;
        }
        dw.an(this, 255, -1890183115 * this.ar, -1270418945 * this.bh, (byte) 0, true, (byte) -56);
    }

    void ee(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.aa[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.aa[i];
            if (this.ay != null) {
                le leVar = this.ay;
                jd jdVar = new jd();
                jdVar.aj = 0;
                jdVar.fy = (long) i;
                jdVar.ac = bArr;
                jdVar.an = leVar;
                jv.aj.ai(jdVar, 2042505051);
                jv.aj.ac(1798062379);
                this.bp[i] = true;
            }
            if (z2) {
                this.ai[i] = lq.aj(bArr, false, 596407106);
            }
        } else if (this.ad) {
            throw new RuntimeException();
        } else {
            if (this.ag != null) {
                int i2 = this.ar * -1773111756;
                le leVar2 = this.ag;
                jd jdVar2 = new jd();
                jdVar2.aj = 0;
                jdVar2.fy = (long) i2;
                jdVar2.ac = bArr;
                jdVar2.an = leVar2;
                jv.aj.ai(jdVar2, 1816483003);
                jv.aj.ac(2107151217);
            }
            aj(bArr, 815591548);
            eb((byte) -107);
        }
    }

    void eh(int i, byte[] bArr, boolean z, boolean z2, int i2) {
        if (z) {
            try {
                if (this.ad) {
                    throw new RuntimeException();
                }
                if (this.ag != null) {
                    int i3 = this.ar * -1890183115;
                    le leVar = this.ag;
                    jd jdVar = new jd();
                    jdVar.aj = 0;
                    jdVar.fy = (long) i3;
                    jdVar.ac = bArr;
                    jdVar.an = leVar;
                    jv.aj.ai(jdVar, 1805416650);
                    jv.aj.ac(875157859);
                }
                aj(bArr, 966071628);
                eb((byte) -49);
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "jn.eh(" + ')');
            }
        }
        bArr[bArr.length - 2] = (byte) (this.aa[i] >> 8);
        bArr[bArr.length - 1] = (byte) this.aa[i];
        if (this.ay != null) {
            le leVar2 = this.ay;
            jd jdVar2 = new jd();
            jdVar2.aj = 0;
            jdVar2.fy = (long) i;
            jdVar2.ac = bArr;
            jdVar2.an = leVar2;
            jv.aj.ai(jdVar2, 2093846411);
            jv.aj.ac(1424552866);
            this.bp[i] = true;
        }
        if (z2) {
            this.ai[i] = lq.aj(bArr, false, 765570905);
        }
    }

    void em(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.aa[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.aa[i];
            if (this.ay != null) {
                le leVar = this.ay;
                jd jdVar = new jd();
                jdVar.aj = 0;
                jdVar.fy = (long) i;
                jdVar.ac = bArr;
                jdVar.an = leVar;
                jv.aj.ai(jdVar, 1911404794);
                jv.aj.ac(881148691);
                this.bp[i] = true;
            }
            if (z2) {
                this.ai[i] = lq.aj(bArr, false, 613713903);
            }
        } else if (this.ad) {
            throw new RuntimeException();
        } else {
            if (this.ag != null) {
                int i2 = this.ar * -1890183115;
                le leVar2 = this.ag;
                jd jdVar2 = new jd();
                jdVar2.aj = 0;
                jdVar2.fy = (long) i2;
                jdVar2.ac = bArr;
                jdVar2.an = leVar2;
                jv.aj.ai(jdVar2, 2097210455);
                jv.aj.ac(2102249670);
            }
            aj(bArr, 1660071505);
            eb((byte) -110);
        }
    }

    void er(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.aa[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.aa[i];
            if (this.ay != null) {
                le leVar = this.ay;
                jd jdVar = new jd();
                jdVar.aj = 0;
                jdVar.fy = (long) i;
                jdVar.ac = bArr;
                jdVar.an = leVar;
                jv.aj.ai(jdVar, 1818401505);
                jv.aj.ac(236093680);
                this.bp[i] = true;
            }
            if (z2) {
                this.ai[i] = lq.aj(bArr, false, 1123455509);
            }
        } else if (this.ad) {
            throw new RuntimeException();
        } else {
            if (this.ag != null) {
                int i2 = this.ar * -1890183115;
                le leVar2 = this.ag;
                jd jdVar2 = new jd();
                jdVar2.aj = 0;
                jdVar2.fy = (long) i2;
                jdVar2.ac = bArr;
                jdVar2.an = leVar2;
                jv.aj.ai(jdVar2, 1831418999);
                jv.aj.ac(1656151047);
            }
            aj(bArr, 1284500081);
            eb((byte) -21);
        }
    }

    void ek(le leVar, int i, byte[] bArr, boolean z, byte b) {
        int i2 = 0;
        try {
            if (leVar != this.ag) {
                if (!z && this.br * -274803989 == i) {
                    this.ad = true;
                }
                if (bArr == null || bArr.length <= 2) {
                    this.bp[i] = false;
                    if (this.ab || z) {
                        dw.an(this, this.ar * -1890183115, i, this.ao[i], (byte) 2, z, (byte) -18);
                        return;
                    }
                    return;
                }
                bm.reset();
                bm.update(bArr, 0, bArr.length - 2);
                int i3 = (bArr[bArr.length - 1] & 255) + ((bArr[bArr.length - 2] & 255) << 8);
                if (((int) bm.getValue()) == this.ao[i] && this.aa[i] == i3) {
                    this.bp[i] = true;
                    if (z) {
                        this.ai[i] = lq.aj(bArr, false, 476661164);
                        return;
                    }
                    return;
                }
                this.bp[i] = false;
                if (this.ab || z) {
                    dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, z, (byte) -125);
                }
            } else if (this.ad) {
                throw new RuntimeException();
            } else if (bArr == null) {
                dw.an(this, 255, this.ar * -1890183115, this.bh * -1270418945, (byte) 0, true, (byte) -111);
            } else {
                bm.reset();
                bm.update(bArr, 0, bArr.length);
                if (this.bh * -1270418945 != ((int) bm.getValue())) {
                    dw.an(this, 255, -1890183115 * this.ar, -1270418945 * this.bh, (byte) 0, true, (byte) -94);
                    return;
                }
                he heVar = new he(fv.bm(bArr, 489136961));
                int au = heVar.au(-310118664);
                if (5 == au || 6 == au) {
                    if (au >= 6) {
                        i2 = heVar.ad((byte) -118);
                    }
                    if (this.bt * -1597487837 != i2) {
                        dw.an(this, 255, -1890183115 * this.ar, this.bh * -1270418945, (byte) 0, true, (byte) -117);
                        return;
                    }
                    aj(bArr, 780817290);
                    eb((byte) -5);
                    return;
                }
                throw new RuntimeException(au + "," + (this.ar * -1890183115) + "," + i);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "jn.ek(" + ')');
        }
    }

    void ew(le leVar, int i, byte[] bArr, boolean z) {
        int i2;
        if (leVar != this.ag) {
            if (!z && this.br * -274803989 == i) {
                this.ad = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.bp[i] = false;
                if (this.ab || z) {
                    dw.an(this, this.ar * -1890183115, i, this.ao[i], (byte) 2, z, (byte) -40);
                    return;
                }
                return;
            }
            bm.reset();
            bm.update(bArr, 0, bArr.length - 2);
            i2 = (bArr[bArr.length - 1] & 255) + ((bArr[bArr.length - 2] & 255) << 8);
            if (((int) bm.getValue()) == this.ao[i] && this.aa[i] == i2) {
                this.bp[i] = true;
                if (z) {
                    this.ai[i] = lq.aj(bArr, false, 1422398631);
                    return;
                }
                return;
            }
            this.bp[i] = false;
            if (this.ab || z) {
                dw.an(this, -1890183115 * this.ar, i, this.ao[i], (byte) 2, z, (byte) -75);
            }
        } else if (this.ad) {
            throw new RuntimeException();
        } else if (bArr == null) {
            dw.an(this, 255, 652338654 * this.ar, 533076947 * this.bh, (byte) 0, true, (byte) -106);
        } else {
            bm.reset();
            bm.update(bArr, 0, bArr.length);
            if (1492233713 * this.bh != ((int) bm.getValue())) {
                dw.an(this, 1287908038, this.ar * -1111864949, -1270418945 * this.bh, (byte) 0, true, (byte) -6);
                return;
            }
            he heVar = new he(fv.bm(bArr, -973426341));
            i2 = heVar.au(-310118664);
            if (5 == i2 || 6 == i2) {
                int ad;
                if (i2 >= 6) {
                    ad = heVar.ad((byte) -22);
                } else {
                    ad = 0;
                }
                if (this.bt * -1597487837 != ad) {
                    dw.an(this, 255, -1890183115 * this.ar, this.bh * -1270418945, (byte) 0, true, (byte) -105);
                    return;
                }
                aj(bArr, 2057900141);
                eb((byte) -123);
                return;
            }
            throw new RuntimeException(i2 + "," + (1810778226 * this.ar) + "," + i);
        }
    }

    void eb(byte b) {
        int i = 0;
        try {
            this.bp = new boolean[this.ai.length];
            for (int i2 = 0; i2 < this.bp.length; i2++) {
                this.bp[i2] = false;
            }
            if (this.ay == null) {
                this.ad = true;
                return;
            }
            this.br = -1048856003;
            while (i < this.bp.length) {
                if (this.ak[i] > 0) {
                    gm.aj(i, this.ay, this, 1090201311);
                    this.br = 1048856003 * i;
                }
                i++;
            }
            if (-1 == this.br * -274803989) {
                this.ad = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "jn.eb(" + ')');
        }
    }

    void ef() {
        int i = 0;
        this.bp = new boolean[this.ai.length];
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            this.bp[i2] = false;
        }
        if (this.ay == null) {
            this.ad = true;
            return;
        }
        this.br = -1048856003;
        while (i < this.bp.length) {
            if (this.ak[i] > 0) {
                gm.aj(i, this.ay, this, 1090201311);
                this.br = 1048856003 * i;
            }
            i++;
        }
        if (-1 == this.br * -274803989) {
            this.ad = true;
        }
    }

    void eg() {
        int i = 0;
        this.bp = new boolean[this.ai.length];
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            this.bp[i2] = false;
        }
        if (this.ay == null) {
            this.ad = true;
            return;
        }
        this.br = -1048856003;
        while (i < this.bp.length) {
            if (this.ak[i] > 0) {
                gm.aj(i, this.ay, this, 1090201311);
                this.br = 1048856003 * i;
            }
            i++;
        }
        if (-1 == this.br * -274803989) {
            this.ad = true;
        }
    }

    void en() {
        int i = 0;
        this.bp = new boolean[this.ai.length];
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            this.bp[i2] = false;
        }
        if (this.ay == null) {
            this.ad = true;
            return;
        }
        this.br = 1605929020;
        while (i < this.bp.length) {
            if (this.ak[i] > 0) {
                gm.aj(i, this.ay, this, 1090201311);
                this.br = -335271138 * i;
            }
            i++;
        }
        if (-1 == this.br * 681402633) {
            this.ad = true;
        }
    }

    void eo() {
        int i = 0;
        this.bp = new boolean[this.ai.length];
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            this.bp[i2] = false;
        }
        if (this.ay == null) {
            this.ad = true;
            return;
        }
        this.br = -1048856003;
        while (i < this.bp.length) {
            if (this.ak[i] > 0) {
                gm.aj(i, this.ay, this, 1090201311);
                this.br = 1048856003 * i;
            }
            i++;
        }
        if (-1 == this.br * -274803989) {
            this.ad = true;
        }
    }

    void ev() {
        int i = 0;
        this.bp = new boolean[this.ai.length];
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            this.bp[i2] = false;
        }
        if (this.ay == null) {
            this.ad = true;
            return;
        }
        this.br = -1048856003;
        while (i < this.bp.length) {
            if (this.ak[i] > 0) {
                gm.aj(i, this.ay, this, 1090201311);
                this.br = 1048856003 * i;
            }
            i++;
        }
        if (-1 == this.br * -274803989) {
            this.ad = true;
        }
    }

    int at(int i, byte b) {
        int i2 = 100;
        try {
            if (this.ai[i] == null && !this.bp[i]) {
                i2 = fk.aq(-1890183115 * this.ar, i, 1628924571);
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "jn.at(" + ')');
        }
    }

    int bk(int i) {
        if (this.ai[i] == null && !this.bp[i]) {
            return fk.aq(-1890183115 * this.ar, i, 1628924571);
        }
        return 100;
    }

    public boolean es(int i) {
        return this.bp[i];
    }

    public boolean ez(int i, byte b) {
        try {
            return this.bp[i];
        } catch (Throwable e) {
            throw ei.ac(e, "jn.ez(" + ')');
        }
    }

    public boolean fi(int i) {
        return this.bp[i];
    }

    public boolean fj(int i) {
        return this.bp[i];
    }

    public boolean el(int i, int i2) {
        try {
            return ae(i, -1988059572) != null;
        } catch (Throwable e) {
            throw ei.ac(e, "jn.el(" + ')');
        }
    }

    public boolean fd(int i) {
        return ae(i, -1548282703) != null;
    }

    public boolean fl(int i) {
        return ae(i, -1804066318) != null;
    }

    public boolean fn(int i) {
        return ae(i, -1553037962) != null;
    }

    public int ey(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.ai.length) {
            try {
                if (this.ak[i3] > 0) {
                    i4 += 100;
                    i2 += at(i3, (byte) -5);
                }
                i3++;
            } catch (Throwable e) {
                throw ei.ac(e, "jn.ey(" + ')');
            }
        }
        if (i4 == 0) {
            return 100;
        }
        return (i2 * 100) / i4;
    }

    public int fh() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.ai.length) {
            if (this.ak[i] > 0) {
                i3 += 100;
                i2 += at(i, (byte) -59);
            }
            i++;
        }
        return i3 == 0 ? 100 : (i2 * 100) / i3;
    }

    public int fv() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.ai.length) {
            if (this.ak[i] > 0) {
                i3 += 100;
                i2 += at(i, (byte) -87);
            }
            i++;
        }
        if (i3 == 0) {
            return -668312201;
        }
        return (1594032535 * i2) / i3;
    }
}
