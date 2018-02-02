package defpackage;

public class cp extends jt {
    static final int ac = 1;
    static final int aj = 0;
    static final int an = 2;
    static final int aq = 3;
    static int[] az;
    boolean aa;
    int ae;
    int[] ah;
    int ai;
    int[] ak;
    boolean al = false;
    int am;
    int ao;
    int[] ap;
    int[] as;
    int[] at;
    int aw;

    cp(he heVar) {
        boolean z;
        int i = 0;
        this.ao = heVar.ay((byte) 1);
        if (heVar.au(-310118664) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.aa = z;
        int au = heVar.au(-310118664);
        if (au < 1 || au > 4) {
            throw new RuntimeException();
        }
        int i2;
        this.ak = new int[au];
        for (i2 = 0; i2 < au; i2++) {
            this.ak[i2] = heVar.ay((byte) 1);
        }
        if (au > 1) {
            this.ap = new int[(au - 1)];
            for (i2 = 0; i2 < au - 1; i2++) {
                this.ap[i2] = heVar.au(-310118664);
            }
        }
        if (au > 1) {
            this.at = new int[(au - 1)];
            for (i2 = 0; i2 < au - 1; i2++) {
                this.at[i2] = heVar.au(-310118664);
            }
        }
        this.ah = new int[au];
        while (i < au) {
            this.ah[i] = heVar.ad((byte) -93);
            i++;
        }
        this.ai = heVar.au(-310118664);
        this.aw = heVar.au(-310118664);
        this.as = null;
    }

    boolean aa(double d, int i, ju juVar) {
        int i2;
        for (int i22 : this.ak) {
            if (juVar.aw(i22, (byte) 60) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.as = new int[i3];
        int i4 = 0;
        while (i4 < this.ak.length) {
            fl flVar;
            int i5;
            int i6;
            int i7;
            if (fd.am(juVar, this.ak[i4], -2137153330)) {
                flVar = new fl();
                ht.al((byte) 33);
                flVar.ak = fi.ac * 1408914190;
                flVar.ap = 2034683127 * fi.an;
                flVar.ao = fi.aq[0];
                flVar.aa = fi.ao[0];
                flVar.an = fi.aa[0];
                flVar.aq = fi.ak[0];
                flVar.ac = fi.ap;
                flVar.aj = fi.at[0];
                gn.as((byte) -77);
            } else {
                flVar = null;
            }
            flVar.aj();
            byte[] bArr = flVar.aj;
            int[] iArr = flVar.ac;
            int i8 = this.ah[i4];
            if ((-16777216 & i8) == -1565824885) {
            }
            if ((-16777216 & i8) == mu.aa) {
            }
            if ((-16777216 & i8) == 50331648) {
                i5 = 16711935 & i8;
                i6 = -1285508728 & (i8 >> 8);
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (-2000559902 & i7) == ((i7 >> 8) & 65535)) {
                        i7 &= 2011653866;
                        iArr[i8] = ((i7 * i6) & 65280) | (-1985260743 | (((i5 * i7) >> 8) & -1878836372));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                i5 = iArr[i8];
                iArr[i8] = (i5 & 445453383) | (((((int) (Math.pow(((double) ((i5 >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(((double) ((i5 >> 8) & -572599793)) / 256.0d, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (i5 & 255)) / 256.0d, d))));
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ap[i4 - 1];
            }
            if (i7 == 0) {
                if (flVar.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.as[i22] = iArr[bArr[i22] & 708590721];
                    }
                } else if (flVar.an == 1389256994 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & -1257514828];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (flVar.an == -490708325 && i == 1659886097) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean aj(double d, int i, ju juVar) {
        int i2;
        for (int i22 : this.ak) {
            if (juVar.aw(i22, (byte) 121) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.as = new int[i3];
        int i4 = 0;
        while (i4 < this.ak.length) {
            fl flVar;
            int i5;
            int i6;
            int i7;
            if (fd.am(juVar, this.ak[i4], -2054890222)) {
                flVar = new fl();
                ht.al((byte) 39);
                flVar.ak = fi.ac * 328517235;
                flVar.ap = 2031617253 * fi.an;
                flVar.ao = fi.aq[0];
                flVar.aa = fi.ao[0];
                flVar.an = fi.aa[0];
                flVar.aq = fi.ak[0];
                flVar.ac = fi.ap;
                flVar.aj = fi.at[0];
                gn.as((byte) -110);
            } else {
                flVar = null;
            }
            flVar.aj();
            byte[] bArr = flVar.aj;
            int[] iArr = flVar.ac;
            int i8 = this.ah[i4];
            if ((-16777216 & i8) == ag.av) {
            }
            if ((-16777216 & i8) == mu.aa) {
            }
            if ((-16777216 & i8) == 50331648) {
                i5 = 16711935 & i8;
                i6 = (i8 >> 8) & 255;
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 65535)) {
                        i7 &= 255;
                        iArr[i8] = ((i7 * i6) & 65280) | (-16777216 | (((i5 * i7) >> 8) & 16711935));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                i5 = iArr[i8];
                iArr[i8] = (i5 & -16777216) | (((((int) (Math.pow(((double) ((i5 >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(((double) ((i5 >> 8) & 255)) / 256.0d, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (i5 & 255)) / 256.0d, d))));
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ap[i4 - 1];
            }
            if (i7 == 0) {
                if (flVar.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.as[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (flVar.an == 64 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (flVar.an == cj.ak && i == 64) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean ak(double d, int i, ju juVar) {
        int i2;
        for (int i22 : this.ak) {
            if (juVar.aw(i22, (byte) 121) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.as = new int[i3];
        int i4 = 0;
        while (i4 < this.ak.length) {
            fl flVar;
            int i5;
            int i6;
            int i7;
            if (fd.am(juVar, this.ak[i4], -1815274264)) {
                flVar = new fl();
                ht.al((byte) 38);
                flVar.ak = fi.ac * 328517235;
                flVar.ap = 2031617253 * fi.an;
                flVar.ao = fi.aq[0];
                flVar.aa = fi.ao[0];
                flVar.an = fi.aa[0];
                flVar.aq = fi.ak[0];
                flVar.ac = fi.ap;
                flVar.aj = fi.at[0];
                gn.as((byte) -77);
            } else {
                flVar = null;
            }
            flVar.aj();
            byte[] bArr = flVar.aj;
            int[] iArr = flVar.ac;
            int i8 = this.ah[i4];
            if ((-16777216 & i8) == ag.av) {
            }
            if ((-16777216 & i8) == mu.aa) {
            }
            if ((-16777216 & i8) == 50331648) {
                i5 = 16711935 & i8;
                i6 = (i8 >> 8) & 255;
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 65535)) {
                        i7 &= 255;
                        iArr[i8] = ((i7 * i6) & 65280) | (-16777216 | (((i5 * i7) >> 8) & 16711935));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                i5 = iArr[i8];
                iArr[i8] = (i5 & -16777216) | (((((int) (Math.pow(((double) ((i5 >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(((double) ((i5 >> 8) & 255)) / 256.0d, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (i5 & 255)) / 256.0d, d))));
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ap[i4 - 1];
            }
            if (i7 == 0) {
                if (flVar.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.as[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (flVar.an == 64 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (flVar.an == cj.ak && i == 64) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean ao(double d, int i, ju juVar) {
        int i2;
        for (int i22 : this.ak) {
            if (juVar.aw(i22, (byte) 18) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.as = new int[i3];
        int i4 = 0;
        while (i4 < this.ak.length) {
            fl flVar;
            int i5;
            int i6;
            int i7;
            if (fd.am(juVar, this.ak[i4], -2046096979)) {
                flVar = new fl();
                ht.al((byte) -60);
                flVar.ak = fi.ac * 818642076;
                flVar.ap = 2031617253 * fi.an;
                flVar.ao = fi.aq[0];
                flVar.aa = fi.ao[0];
                flVar.an = fi.aa[0];
                flVar.aq = fi.ak[0];
                flVar.ac = fi.ap;
                flVar.aj = fi.at[0];
                gn.as((byte) -83);
            } else {
                flVar = null;
            }
            flVar.aj();
            byte[] bArr = flVar.aj;
            int[] iArr = flVar.ac;
            int i8 = this.ah[i4];
            if ((-2002819280 & i8) == ag.av) {
            }
            if ((-16777216 & i8) == -485796831) {
            }
            if ((-16777216 & i8) == -494148680) {
                i5 = 16711935 & i8;
                i6 = (i8 >> 8) & 255;
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 977848481)) {
                        i7 &= 255;
                        iArr[i8] = ((i7 * i6) & 65280) | (-16777216 | (((i5 * i7) >> 8) & 96560112));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                i5 = iArr[i8];
                iArr[i8] = (i5 & -16777216) | (((((int) (Math.pow(((double) ((i5 >> 16) & 1708011642)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(((double) ((i5 >> 8) & 255)) / 256.0d, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (61315016 & i5)) / 256.0d, d))));
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ap[i4 - 1];
            }
            if (i7 == 0) {
                if (flVar.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.as[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (flVar.an == -856917461 && i == -1482468694) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & -1720184946];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (flVar.an == 1091628727 && i == 64) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & 255];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    boolean aq(double d, int i, ju juVar) {
        int i2;
        for (int i22 : this.ak) {
            if (juVar.aw(i22, (byte) 66) == null) {
                return false;
            }
        }
        int i3 = i * i;
        this.as = new int[i3];
        int i4 = 0;
        while (i4 < this.ak.length) {
            fl flVar;
            int i5;
            int i6;
            int i7;
            if (fd.am(juVar, this.ak[i4], -1813199957)) {
                flVar = new fl();
                ht.al((byte) 13);
                flVar.ak = fi.ac * 411807947;
                flVar.ap = 2031617253 * fi.an;
                flVar.ao = fi.aq[0];
                flVar.aa = fi.ao[0];
                flVar.an = fi.aa[0];
                flVar.aq = fi.ak[0];
                flVar.ac = fi.ap;
                flVar.aj = fi.at[0];
                gn.as((byte) -69);
            } else {
                flVar = null;
            }
            flVar.aj();
            byte[] bArr = flVar.aj;
            int[] iArr = flVar.ac;
            int i8 = this.ah[i4];
            if ((-1456593725 & i8) == ag.av) {
            }
            if ((-16777216 & i8) == 92328085) {
            }
            if ((1072972490 & i8) == 50331648) {
                i5 = -1793948196 & i8;
                i6 = -577085522 & (i8 >> 8);
                for (i8 = 0; i8 < iArr.length; i8++) {
                    i7 = iArr[i8];
                    if (i7 != 0 && (65535 & i7) == ((i7 >> 8) & 65535)) {
                        i7 &= 255;
                        iArr[i8] = ((i7 * i6) & 65280) | (-228049279 | (((i5 * i7) >> 8) & -1236797571));
                    }
                }
            }
            for (i8 = 0; i8 < iArr.length; i8++) {
                i5 = iArr[i8];
                iArr[i8] = (i5 & -16777216) | (((((int) (Math.pow(((double) ((i5 >> 16) & -1947248715)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(((double) ((i5 >> 8) & -822950339)) / 256.0d, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (i5 & 255)) / 256.0d, d))));
            }
            if (i4 == 0) {
                i7 = 0;
            } else {
                i7 = this.ap[i4 - 1];
            }
            if (i7 == 0) {
                if (flVar.an == i) {
                    for (i22 = 0; i22 < i3; i22++) {
                        this.as[i22] = iArr[bArr[i22] & 255];
                    }
                } else if (flVar.an == 64 && i == 128) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 >> 1) + ((i6 >> 1) << 6)] & -246005855];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else if (flVar.an == -238656113 && i == -1531001905) {
                    i8 = 0;
                    for (i6 = 0; i6 < i; i6++) {
                        i22 = 0;
                        while (i22 < i) {
                            i5 = i8 + 1;
                            this.as[i8] = iArr[bArr[(i22 << 1) + ((i6 << 1) << 7)] & -885572625];
                            i22++;
                            i8 = i5;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (i7 == 1) {
            }
            if (i7 == 2) {
            }
            i4 = i7 == 3 ? i4 + 1 : i4 + 1;
        }
        return true;
    }

    void ac() {
        this.as = null;
    }

    void ap() {
        this.as = null;
    }

    void at() {
        this.as = null;
    }

    void ah(int i) {
        int i2;
        int i3;
        if (this.ai == 1 || this.ai == 3) {
            i2 = this.aw * i;
            if (this.ai == 1) {
                i2 = -i2;
            }
            i3 = cj.ak * i2;
            this.ae = (i2 + this.ae) & 127;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (i2 = 0; i2 < 16384; i2++) {
                    az[i2] = this.as[(i2 + i3) & 16383];
                }
                int[] iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
        if (this.ai == 2 || this.ai == 4) {
            i2 = this.aw * i;
            if (this.ai == 2) {
                i2 = -i2;
            }
            this.am = (this.am + i2) & 127;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (int i4 = 0; i4 < 16384; i4 += cj.ak) {
                    for (i3 = 0; i3 < cj.ak; i3++) {
                        az[i4 + i3] = this.as[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
    }

    void ai(int i) {
        int i2;
        if (this.ai == 1 || this.ai == 3) {
            i2 = this.aw * i;
            if (this.ai == 1) {
                i2 = -i2;
            }
            int i3 = 434033307 * i2;
            this.ae = (i2 + this.ae) & 238261002;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (i2 = 0; i2 < 941009369; i2++) {
                    az[i2] = this.as[(i2 + i3) & 941009368];
                }
                int[] iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
        if (this.ai == 2 || this.ai == 4) {
            i2 = this.aw * i;
            if (this.ai == 2) {
                i2 = -i2;
            }
            this.am = (i2 + this.am) & 127;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (i2 = 0; i2 < 1075956161; i2 -= 1986314977) {
                }
                iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
    }

    void an(int i) {
        int i2;
        int i3;
        if (this.ai == 1 || this.ai == 3) {
            i2 = this.aw * i;
            if (this.ai == 1) {
                i2 = -i2;
            }
            i3 = cj.ak * i2;
            this.ae = (i2 + this.ae) & 127;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (i2 = 0; i2 < 16384; i2++) {
                    az[i2] = this.as[(i2 + i3) & 16383];
                }
                int[] iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
        if (this.ai == 2 || this.ai == 4) {
            i2 = this.aw * i;
            if (this.ai == 2) {
                i2 = -i2;
            }
            this.am = (this.am + i2) & 127;
            if (this.al && this.as != null) {
                if (az == null || az.length < this.as.length) {
                    az = new int[this.as.length];
                }
                for (int i4 = 0; i4 < 16384; i4 += cj.ak) {
                    for (i3 = 0; i3 < cj.ak; i3++) {
                        az[i4 + i3] = this.as[((i3 + i2) & 16383) + i4];
                    }
                }
                iArr = this.as;
                this.as = az;
                az = iArr;
                this.al = false;
            }
        }
    }
}
