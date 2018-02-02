package defpackage;

public final class go extends ci {
    int aa;
    int ac;
    boolean ah;
    int aj;
    ax ak;
    int an;
    int ao;
    int ap;
    int aq;
    int at;

    go(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            this.ap = 0;
            this.at = 0;
            this.ah = false;
            this.aj = -2007839191 * i;
            this.an = -158399993 * i2;
            this.aq = 1283711969 * i3;
            this.ao = 505802015 * i4;
            this.aa = -390158613 * i5;
            this.ac = (i7 + i6) * 799914249;
            int i8 = aj.ac(this.aj * 1857728025, (byte) -7).ak * 1125072369;
            if (-1 != i8) {
                this.ah = false;
                this.ak = bn.aj(i8, (byte) 0);
                return;
            }
            this.ah = true;
        } catch (Throwable e) {
            throw ei.ac(e, "go.<init>(" + ')');
        }
    }

    static void ac(int i, int i2, int i3, int i4, int i5) {
        try {
            gm gmVar;
            gm gmVar2 = (gm) gm.aj.aj((long) i);
            if (gmVar2 == null) {
                jt gmVar3 = new gm();
                gm.aj.ac(gmVar3, (long) i);
                gmVar = gmVar3;
            } else {
                gmVar = gmVar2;
            }
            if (gmVar.ac.length <= i2) {
                int i6;
                int[] iArr = new int[(i2 + 1)];
                int[] iArr2 = new int[(i2 + 1)];
                for (i6 = 0; i6 < gmVar.ac.length; i6++) {
                    iArr[i6] = gmVar.ac[i6];
                    iArr2[i6] = gmVar.an[i6];
                }
                for (i6 = gmVar.ac.length; i6 < i2; i6++) {
                    iArr[i6] = -1;
                    iArr2[i6] = 0;
                }
                gmVar.ac = iArr;
                gmVar.an = iArr2;
            }
            gmVar.ac[i2] = i3;
            gmVar.an[i2] = i4;
        } catch (Throwable e) {
            throw ei.ac(e, "go.ac(" + ')');
        }
    }

    final void ac(int i) {
        if (!this.ah) {
            this.at += 642292874 * i;
            while (this.at * -335559583 > this.ak.ap[-1454138726 * this.ap]) {
                this.at -= this.ak.ap[1004443610 * this.ap] * -1145687673;
                this.ap += 1561794365;
                if (-161808356 * this.ap >= this.ak.aa.length) {
                    this.ah = true;
                    return;
                }
            }
        }
    }

    final void aj(int i, int i2) {
        try {
            if (!this.ah) {
                this.at += -1145687673 * i;
                while (this.at * -1634679753 > this.ak.ap[this.ap * 578353173]) {
                    this.at -= this.ak.ap[this.ap * 578353173] * -1145687673;
                    this.ap += 1561794365;
                    if (this.ap * 578353173 >= this.ak.aa.length) {
                        this.ah = true;
                        return;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "go.aj(" + ')');
        }
    }

    final void an(int i) {
        if (!this.ah) {
            this.at += -1145687673 * i;
            while (this.at * -1634679753 > this.ak.ap[578353173 * this.ap]) {
                this.at -= this.ak.ap[-1086013993 * this.ap] * 337967711;
                this.ap += 1561794365;
                if (509666689 * this.ap >= this.ak.aa.length) {
                    this.ah = true;
                    return;
                }
            }
        }
    }

    protected final ct ar() {
        try {
            az ac = aj.ac(this.aj * 1857728025, (byte) 34);
            ct ao = !this.ah ? ac.ao(this.ap * 578353173, 1535568402) : ac.ao(-1, 1566216729);
            if (ao == null) {
                return null;
            }
            return ao;
        } catch (Throwable e) {
            throw ei.ac(e, "go.ar(" + ')');
        }
    }

    protected final ct cg() {
        ct ao;
        az ac = aj.ac(this.aj * 1857728025, (byte) -54);
        if (this.ah) {
            ao = ac.ao(-1, -25150042);
        } else {
            ao = ac.ao(this.ap * 578353173, 2107835439);
        }
        if (ao == null) {
            return null;
        }
        return ao;
    }

    protected final ct cs() {
        ct ao;
        az ac = aj.ac(this.aj * 1857728025, (byte) 82);
        if (this.ah) {
            ao = ac.ao(-1, 50599271);
        } else {
            ao = ac.ao(this.ap * 578353173, 906441889);
        }
        if (ao == null) {
            return null;
        }
        return ao;
    }

    static int av(int i, fs fsVar, boolean z, int i2) {
        int i3 = 0;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        if (i == 4200) {
            try {
                iArr = gr.ak;
                i4 = dy.ap - -401924967;
                dy.ap = i4;
                i5 = iArr[i4 * -38307927];
                String[] strArr = gr.at;
                i6 = di.ah + 436804489;
                di.ah = i6;
                strArr[(i6 * 1894369977) - 1] = al.ac(i5, (short) -11933).af;
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "go.av(" + ')');
            }
        } else if (i == 4201) {
            dy.ap -= -803849934;
            i5 = gr.ak[dy.ap * -38307927];
            i4 = gr.ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i5, (short) -6923);
            if (i4 < 1 || i4 > 5 || r0.bu[i4 - 1] == null) {
                r0 = gr.at;
                i4 = di.ah + 436804489;
                di.ah = i4;
                r0[(i4 * 1894369977) - 1] = "";
            } else {
                r2 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r2[(i3 * 1894369977) - 1] = r0.bu[i4 - 1];
            }
            return 1;
        } else if (i == 4202) {
            dy.ap -= -803849934;
            i5 = gr.ak[dy.ap * -38307927];
            i4 = gr.ak[(dy.ap * -38307927) + 1];
            r0 = al.ac(i5, (short) -11441);
            if (i4 < 1 || i4 > 5 || r0.bd[i4 - 1] == null) {
                r0 = gr.at;
                i4 = di.ah + 436804489;
                di.ah = i4;
                r0[(i4 * 1894369977) - 1] = "";
            } else {
                r2 = gr.at;
                i3 = di.ah + 436804489;
                di.ah = i3;
                r2[(i3 * 1894369977) - 1] = r0.bd[i4 - 1];
            }
            return 1;
        } else if (i == 4203) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = gr.ak;
            i6 = dy.ap - 401924967;
            dy.ap = i6;
            r1[(i6 * -38307927) - 1] = al.ac(i5, (short) 2507).br * -296615951;
            return 1;
        } else if (i == 4204) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = gr.ak;
            i6 = dy.ap - 401924967;
            dy.ap = i6;
            i6 = (i6 * -38307927) - 1;
            if (al.ac(i5, (short) -9355).bt * -559602733 == 1) {
                i3 = 1;
            }
            r1[i6] = i3;
            return 1;
        } else if (4205 == i) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = al.ac(i5, (short) -4410);
            if (r1.bl * -1811867057 != -1 || r1.bf * -483035651 < 0) {
                r1 = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                r1[(i6 * -38307927) - 1] = i5;
            } else {
                iArr = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                iArr[(i6 * -38307927) - 1] = r1.bf * -483035651;
            }
            return 1;
        } else if (i == 4206) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = al.ac(i5, (short) -15705);
            if (r1.bl * -1811867057 < 0 || r1.bf * -483035651 < 0) {
                r1 = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                r1[(i6 * -38307927) - 1] = i5;
            } else {
                iArr = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                iArr[(i6 * -38307927) - 1] = r1.bf * -483035651;
            }
            return 1;
        } else if (4207 == i) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = gr.ak;
            i6 = dy.ap - 401924967;
            dy.ap = i6;
            i6 = (i6 * -38307927) - 1;
            if (al.ac(i5, (short) 12152).bb) {
                i3 = 1;
            }
            r1[i6] = i3;
            return 1;
        } else if (i == 4208) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = al.ac(i5, (short) 2576);
            if (-1223174873 * r1.ck != -1 || r1.cm * 2070465581 < 0) {
                r1 = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                r1[(i6 * -38307927) - 1] = i5;
            } else {
                iArr = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                iArr[(i6 * -38307927) - 1] = r1.cm * 2070465581;
            }
            return 1;
        } else if (4209 == i) {
            iArr = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i5 = iArr[i4 * -38307927];
            r1 = al.ac(i5, (short) 2927);
            if (r1.ck * -1223174873 < 0 || r1.cm * 2070465581 < 0) {
                r1 = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                r1[(i6 * -38307927) - 1] = i5;
            } else {
                iArr = gr.ak;
                i6 = dy.ap - 401924967;
                dy.ap = i6;
                iArr[(i6 * -38307927) - 1] = r1.cm * 2070465581;
            }
            return 1;
        } else if (i == 4210) {
            Object obj;
            r0 = gr.at;
            i4 = di.ah - 436804489;
            di.ah = i4;
            String str = r0[i4 * 1894369977];
            r1 = gr.ak;
            i6 = dy.ap - -401924967;
            dy.ap = i6;
            if (1 == r1[i6 * -38307927]) {
                obj = 1;
            } else {
                obj = null;
            }
            String toLowerCase = str.toLowerCase();
            short[] sArr = new short[16];
            i5 = 0;
            for (int i7 = 0; i7 < iz.ai * 68659529; i7++) {
                av ac = al.ac(i7, (short) -9159);
                if ((obj == null || ac.cr) && ac.bl * -1811867057 == -1) {
                    if (ac.af.toLowerCase().indexOf(toLowerCase) != -1) {
                        if (i5 >= 250) {
                            fs.oq = -584098643;
                            aq.of = null;
                            break;
                        }
                        if (i5 >= sArr.length) {
                            r2 = new short[(sArr.length * 2)];
                            for (int i8 = 0; i8 < i5; i8++) {
                                r2[i8] = sArr[i8];
                            }
                        } else {
                            r2 = sArr;
                        }
                        i4 = i5 + 1;
                        r2[i5] = (short) i7;
                        i5 = i4;
                        sArr = r2;
                    }
                }
            }
            aq.of = sArr;
            bj.ol = 0;
            fs.oq = i5 * 584098643;
            r2 = new String[(fs.oq * -1863739173)];
            for (i5 = 0; i5 < -1863739173 * fs.oq; i5++) {
                r2[i5] = al.ac(sArr[i5], (short) 683).af;
            }
            ee.aj(r2, aq.of, 0, r2.length - 1, (byte) -81);
            iArr = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr[(i4 * -38307927) - 1] = -1863739173 * fs.oq;
            return 1;
        } else if (i == 4211) {
            if (aq.of == null || bj.ol * -487968877 >= fs.oq * -1863739173) {
                iArr = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr[(i4 * -38307927) - 1] = -1;
            } else {
                iArr = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                i4 = (i4 * -38307927) - 1;
                r2 = aq.of;
                i3 = bj.ol + 299976347;
                bj.ol = i3;
                iArr[i4] = r2[(i3 * -487968877) - 1] & 65535;
            }
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            bj.ol = 0;
            return 1;
        }
    }
}
