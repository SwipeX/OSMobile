package defpackage;

public final class hb {
    static final int ac = 256;
    static final int aj = 8;
    static final int an = 1020;
    int[] aa;
    int ak;
    int[] ao;
    int ap;
    int aq;
    int at;

    public hb(int[] iArr) {
        try {
            this.aa = new int[256];
            this.ao = new int[256];
            for (int i = 0; i < iArr.length; i++) {
                this.ao[i] = iArr[i];
            }
            aq(-2029863113);
        } catch (Throwable e) {
            throw ei.ac(e, "hb.<init>(" + ')');
        }
    }

    public static int aj(int i, ar arVar, int i2) {
        try {
            return (arVar.ai * 1295364133) + ((cw.aj + i) << 8);
        } catch (Throwable e) {
            throw ei.ac(e, "hb.aj(" + ')');
        }
    }

    final int aj(byte b) {
        try {
            int i = this.aq - 1107479721;
            this.aq = i;
            if ((i * 1044158361) + 1 == 0) {
                an((byte) 72);
                this.aq = -1060512681;
            }
            return this.ao[this.aq * 1044158361];
        } catch (Throwable e) {
            throw ei.ac(e, "hb.aj(" + ')');
        }
    }

    final int ao() {
        int i = this.aq - 1686409635;
        this.aq = i;
        if ((i * 1937028811) + 1 == 0) {
            an((byte) 24);
            this.aq = -1060512681;
        }
        return this.ao[this.aq * -133208703];
    }

    final int aa() {
        if (this.aq * 1044158361 == 0) {
            an((byte) 115);
            this.aq = -928209941;
        }
        return this.ao[(this.aq * 1044158361) - 1];
    }

    final int ac(byte b) {
        try {
            if (this.aq * 1044158361 == 0) {
                an((byte) 4);
                this.aq = 46967040;
            }
            return this.ao[(this.aq * 1044158361) - 1];
        } catch (Throwable e) {
            throw ei.ac(e, "hb.ac(" + ')');
        }
    }

    final int ak() {
        if (this.aq * 1044158361 == 0) {
            an((byte) 30);
            this.aq = 927902011;
        }
        return this.ao[(this.aq * 1916889398) - 1];
    }

    final void an(byte b) {
        try {
            int i = this.ap;
            int i2 = this.at + 1742479729;
            this.at = i2;
            this.ap = i + (i2 * 1116538209);
            for (i = 0; i < 256; i++) {
                i2 = this.aa[i];
                if ((i & 2) == 0) {
                    if ((i & 1) == 0) {
                        this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) << 13)) * 411815137;
                    } else {
                        this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) >>> 6)) * 411815137;
                    }
                } else if ((i & 1) == 0) {
                    this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) << 2)) * 411815137;
                } else {
                    this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) >>> 16)) * 411815137;
                }
                this.ak += this.aa[(i + cj.ak) & 255] * 411815137;
                int i3 = ((this.ak * 1669232417) + this.aa[(i2 & an) >> 2]) + (this.ap * -147359695);
                this.aa[i] = i3;
                int[] iArr = this.ao;
                i2 = (i2 + this.aa[((i3 >> 8) & an) >> 2]) * 877453521;
                this.ap = i2;
                iArr[i] = i2 * -147359695;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "hb.an(" + ')');
        }
    }

    final void ap() {
        int i = this.ap;
        int i2 = this.at - 1356696059;
        this.at = i2;
        this.ap = i + (i2 * 1116538209);
    }

    final void at() {
        int i = this.ap;
        int i2 = this.at + 1742479729;
        this.at = i2;
        this.ap = i + (i2 * 1116538209);
        for (i = 0; i < 256; i++) {
            i2 = this.aa[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) << 13)) * 411815137;
                } else {
                    this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) >>> 6)) * 411815137;
                }
            } else if ((i & 1) == 0) {
                this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) << 2)) * 411815137;
            } else {
                this.ak = ((this.ak * 1669232417) ^ ((this.ak * 1669232417) >>> 16)) * 411815137;
            }
            this.ak += this.aa[(i + cj.ak) & 255] * 411815137;
            int i3 = ((this.ak * 1669232417) + this.aa[(i2 & an) >> 2]) + (this.ap * -147359695);
            this.aa[i] = i3;
            int[] iArr = this.ao;
            i2 = (i2 + this.aa[((i3 >> 8) & an) >> 2]) * 877453521;
            this.ap = i2;
            iArr[i] = i2 * -147359695;
        }
    }

    final void ah() {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i9 << 11;
            i7 += i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 += i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 += i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 += i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 += i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
        }
        for (i = 0; i < 256; i += 8) {
            i9 += this.ao[i + 1];
            i8 += this.ao[i + 2];
            i10 = (i10 + this.ao[i]) ^ (i9 << 11);
            i7 = (i7 + this.ao[i + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.ao[i + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.ao[i + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ao[i + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ao[i + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.aa[i] = i10;
            this.aa[i + 1] = i9;
            this.aa[i + 2] = i8;
            this.aa[i + 3] = i7;
            this.aa[i + 4] = i6;
            this.aa[i + 5] = i5;
            this.aa[i + 6] = i4;
            this.aa[i + 7] = i3;
        }
        while (i2 < 256) {
            i9 += this.aa[i2 + 1];
            i8 += this.aa[i2 + 2];
            i10 = (i10 + this.aa[i2]) ^ (i9 << 11);
            i7 = (i7 + this.aa[i2 + 3]) + i10;
            i9 = (i9 + i8) ^ (i8 >>> 2);
            i6 = (i6 + this.aa[i2 + 4]) + i9;
            i8 = (i8 + i7) ^ (i7 << 8);
            i5 = (i5 + this.aa[i2 + 5]) + i8;
            i7 = (i7 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.aa[i2 + 6]) + i7;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.aa[i2 + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i10 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i9 += i4;
            i3 = (i3 + i10) ^ (i10 >>> 9);
            i8 += i3;
            i10 += i9;
            this.aa[i2] = i10;
            this.aa[i2 + 1] = i9;
            this.aa[i2 + 2] = i8;
            this.aa[i2 + 3] = i7;
            this.aa[i2 + 4] = i6;
            this.aa[i2 + 5] = i5;
            this.aa[i2 + 6] = i4;
            this.aa[i2 + 7] = i3;
            i2 += 8;
        }
        an((byte) 75);
        this.aq = 46967040;
    }

    final void ai() {
        int i = -1640531527;
        int i2 = -1640531527;
        int i3 = 1233732126;
        int i4 = -1646940640;
        int i5 = -776929537;
        int i6 = 1135865010;
        int i7 = -182135123;
        int i8 = -1640531527;
        for (int i9 = 0; i9 < 4; i9++) {
            i2 ^= i3 << 11;
            i5 += i2;
            i3 = (i3 + i4) ^ (i4 >>> 2);
            i6 += i3;
            i4 = (i4 + i5) ^ (i5 << 8);
            i7 += i4;
            i5 = (i5 + i6) ^ (i6 >>> 16);
            i8 += i5;
            i6 = (i6 + i7) ^ (i7 << 10);
            i += i6;
            i7 = (i7 + i8) ^ (i8 >>> 4);
            i2 += i7;
            i8 = (i8 + i) ^ (i << 8);
            i3 += i8;
            i = (i + i2) ^ (i2 >>> 9);
            i4 += i;
            i2 += i3;
        }
        an((byte) 3);
        this.aq = 603555609;
    }

    final void aq(int i) {
        int i2;
        int i3 = 0;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        int i10 = -1640531527;
        int i11 = -1640531527;
        for (i2 = 0; i2 < 4; i2++) {
            i11 ^= i10 << 11;
            i8 += i11;
            i10 = (i10 + i9) ^ (i9 >>> 2);
            i7 += i10;
            i9 = (i9 + i8) ^ (i8 << 8);
            i6 += i9;
            i8 = (i8 + i7) ^ (i7 >>> 16);
            i5 += i8;
            i7 = (i7 + i6) ^ (i6 << 10);
            i4 += i7;
            i6 = (i6 + i5) ^ (i5 >>> 4);
            i11 += i6;
            i5 = (i5 + i4) ^ (i4 << 8);
            i10 += i5;
            i4 = (i4 + i11) ^ (i11 >>> 9);
            i9 += i4;
            i11 += i10;
        }
        i2 = 0;
        while (i2 < 256) {
            i10 += this.ao[i2 + 1];
            i9 += this.ao[i2 + 2];
            i11 = (i11 + this.ao[i2]) ^ (i10 << 11);
            i8 = (i8 + this.ao[i2 + 3]) + i11;
            i10 = (i10 + i9) ^ (i9 >>> 2);
            i7 = (i7 + this.ao[i2 + 4]) + i10;
            i9 = (i9 + i8) ^ (i8 << 8);
            i6 = (i6 + this.ao[i2 + 5]) + i9;
            i8 = (i8 + i7) ^ (i7 >>> 16);
            i5 = (i5 + this.ao[i2 + 6]) + i8;
            i7 = (i7 + i6) ^ (i6 << 10);
            i4 = (i4 + this.ao[i2 + 7]) + i7;
            i6 = (i6 + i5) ^ (i5 >>> 4);
            i11 += i6;
            i5 = (i5 + i4) ^ (i4 << 8);
            i10 += i5;
            i4 = (i4 + i11) ^ (i11 >>> 9);
            i9 += i4;
            i11 += i10;
            try {
                this.aa[i2] = i11;
                this.aa[i2 + 1] = i10;
                this.aa[i2 + 2] = i9;
                this.aa[i2 + 3] = i8;
                this.aa[i2 + 4] = i7;
                this.aa[i2 + 5] = i6;
                this.aa[i2 + 6] = i5;
                this.aa[i2 + 7] = i4;
                i2 += 8;
            } catch (Throwable e) {
                throw ei.ac(e, "hb.aq(" + ')');
            }
        }
        while (i3 < 256) {
            i10 += this.aa[i3 + 1];
            i9 += this.aa[i3 + 2];
            i11 = (i11 + this.aa[i3]) ^ (i10 << 11);
            i8 = (i8 + this.aa[i3 + 3]) + i11;
            i10 = (i10 + i9) ^ (i9 >>> 2);
            i7 = (i7 + this.aa[i3 + 4]) + i10;
            i9 = (i9 + i8) ^ (i8 << 8);
            i6 = (i6 + this.aa[i3 + 5]) + i9;
            i8 = (i8 + i7) ^ (i7 >>> 16);
            i5 = (i5 + this.aa[i3 + 6]) + i8;
            i7 = (i7 + i6) ^ (i6 << 10);
            i4 = (i4 + this.aa[i3 + 7]) + i7;
            i6 = (i6 + i5) ^ (i5 >>> 4);
            i11 += i6;
            i5 = (i5 + i4) ^ (i4 << 8);
            i10 += i5;
            i4 = (i4 + i11) ^ (i11 >>> 9);
            i9 += i4;
            i11 += i10;
            this.aa[i3] = i11;
            this.aa[i3 + 1] = i10;
            this.aa[i3 + 2] = i9;
            this.aa[i3 + 3] = i8;
            this.aa[i3 + 4] = i7;
            this.aa[i3 + 5] = i6;
            this.aa[i3 + 6] = i5;
            this.aa[i3 + 7] = i4;
            i3 += 8;
        }
        an((byte) 89);
        this.aq = 46967040;
    }

    final void aw() {
        int i;
        int i2 = 0;
        int i3 = -1640531527;
        int i4 = -714686274;
        int i5 = -1790754261;
        int i6 = -832479818;
        int i7 = -308395707;
        int i8 = 1008852516;
        int i9 = -1640531527;
        int i10 = -1640531527;
        for (i = 0; i < 4; i++) {
            i8 ^= i10 << 11;
            i9 += i8;
            i10 = (i10 + i7) ^ (i7 >>> 2);
            i6 += i10;
            i7 = (i7 + i9) ^ (i9 << 8);
            i5 += i7;
            i9 = (i9 + i6) ^ (i6 >>> 16);
            i4 += i9;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 += i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i8 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i10 += i4;
            i3 = (i3 + i8) ^ (i8 >>> 9);
            i7 += i3;
            i8 += i10;
        }
        for (i = 0; i < 256; i += 8) {
            i10 += this.ao[i + 1];
            i7 += this.ao[i + 2];
            i8 = (i8 + this.ao[i]) ^ (i10 << 11);
            i9 = (i9 + this.ao[i + 3]) + i8;
            i10 = (i10 + i7) ^ (i7 >>> 2);
            i6 = (i6 + this.ao[i + 4]) + i10;
            i7 = (i7 + i9) ^ (i9 << 8);
            i5 = (i5 + this.ao[i + 5]) + i7;
            i9 = (i9 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.ao[i + 6]) + i9;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.ao[i + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i8 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i10 += i4;
            i3 = (i3 + i8) ^ (i8 >>> 9);
            i7 += i3;
            i8 += i10;
            this.aa[i] = i8;
            this.aa[i + 1] = i10;
            this.aa[i + 2] = i7;
            this.aa[i + 3] = i9;
            this.aa[i + 4] = i6;
            this.aa[i + 5] = i5;
            this.aa[i + 6] = i4;
            this.aa[i + 7] = i3;
        }
        while (i2 < 1679698561) {
            i10 += this.aa[i2 + 1];
            i7 += this.aa[i2 + 2];
            i8 = (i8 + this.aa[i2]) ^ (i10 << 11);
            i9 = (i9 + this.aa[i2 + 3]) + i8;
            i10 = (i10 + i7) ^ (i7 >>> 2);
            i6 = (i6 + this.aa[i2 + 4]) + i10;
            i7 = (i7 + i9) ^ (i9 << 8);
            i5 = (i5 + this.aa[i2 + 5]) + i7;
            i9 = (i9 + i6) ^ (i6 >>> 16);
            i4 = (i4 + this.aa[i2 + 6]) + i9;
            i6 = (i6 + i5) ^ (i5 << 10);
            i3 = (i3 + this.aa[i2 + 7]) + i6;
            i5 = (i5 + i4) ^ (i4 >>> 4);
            i8 += i5;
            i4 = (i4 + i3) ^ (i3 << 8);
            i10 += i4;
            i3 = (i3 + i8) ^ (i8 >>> 9);
            i7 += i3;
            i8 += i10;
            this.aa[i2] = i8;
            this.aa[i2 + 1] = i10;
            this.aa[i2 + 2] = i7;
            this.aa[i2 + 3] = i9;
            this.aa[i2 + 4] = i6;
            this.aa[i2 + 5] = i5;
            this.aa[i2 + 6] = i4;
            this.aa[i2 + 7] = i3;
            i2 += 8;
        }
        an((byte) 116);
        this.aq = 46967040;
    }
}
