package defpackage;

public class bx extends cr {
    static final int ac = 96;
    static int aj = 0;
    static final int bv = 45;
    static jn ca = null;
    public static final int ck = 1012;
    static final int di = 5000;

    bx(cq cqVar) {
        try {
            super(cqVar);
        } catch (Throwable e) {
            throw ei.ac(e, "bx.<init>(" + ')');
        }
    }

    public static int aj(int i, int i2, int i3, short s) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public final void ah(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * -670387406;
        int i9 = this.bu.bb * -1144792287;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i7 * i17) + (i16 * i6)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i14 * i22) + (i21 * i15)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i20 * i13) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((-1635687023 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((this.bu.bt * -1383968788) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 64);
        } catch (Exception e) {
        }
    }

    public final void aj(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            this.ag[0] = -1;
            if (!(ctVar.by == 2 || ctVar.by == 1)) {
                ctVar.ak();
            }
            int i8 = this.bu.br * 266497203;
            int i9 = this.bu.bb * 1621686031;
            int i10 = ak[i];
            int i11 = ap[i];
            int i12 = ak[i2];
            int i13 = ap[i2];
            int i14 = ak[i3];
            int i15 = ap[i3];
            int i16 = ak[i4];
            int i17 = ap[i4];
            int i18 = ((i7 * i17) + (i16 * i6)) >> 16;
            for (int i19 = 0; i19 < ctVar.ao; i19++) {
                int i20;
                int i21 = ctVar.aa[i19];
                int i22 = ctVar.ak[i19];
                int i23 = ctVar.ap[i19];
                if (i3 != 0) {
                    i20 = ((i14 * i22) + (i21 * i15)) >> 16;
                    i22 = ((i22 * i15) - (i21 * i14)) >> 16;
                } else {
                    i20 = i21;
                }
                if (i != 0) {
                    i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                    i22 = ((i11 * i22) - (i23 * i10)) >> 16;
                }
                if (i2 != 0) {
                    i21 = ((i20 * i13) + (i23 * i12)) >> 16;
                    i23 = ((i23 * i13) - (i20 * i12)) >> 16;
                } else {
                    i21 = i20;
                }
                i21 += i5;
                i20 = i22 + i6;
                i23 += i7;
                i22 = ((i17 * i20) - (i16 * i23)) >> 16;
                i23 = ((i23 * i17) + (i20 * i16)) >> 16;
                this.ax[i19] = i23 - i18;
                this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
                this.az[i19] = (((this.bu.bt * 411538491) * i22) / i23) + i9;
                if (ctVar.av > 0) {
                    this.af[i19] = i21;
                    this.au[i19] = i22;
                    this.av[i19] = i23;
                }
            }
            try {
                aq(ctVar, false, false, 0, (byte) 34);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "bx.aj(" + ')');
        }
    }

    public final void ak(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i7 * i17) + (i16 * i6)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i14 * i22) + (i21 * i15)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i20 * i13) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((this.bu.bt * 411538491) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 15);
        } catch (Exception e) {
        }
    }

    public final void ap(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 1973652871;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i7 * i17) + (i16 * i6)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i14 * i22) + (i21 * i15)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i20 * i13) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((-276313491 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((this.bu.bt * -1936632619) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 81);
        } catch (Exception e) {
        }
    }

    public final void at(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i7 * i17) + (i16 * i6)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i14 * i22) + (i21 * i15)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i20 * i13) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i17 * i20) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((this.bu.bt * 796626964) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 104);
        } catch (Exception e) {
        }
    }

    public static int ac(int i, int i2, int i3) {
        if (i2 <= i) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        while (i != 0) {
            try {
                i4 = i2 % i;
                i2 = i;
                i = i4;
            } catch (Throwable e) {
                throw ei.ac(e, "bx.ac(" + ')');
            }
        }
        return i2;
    }

    static void an(int i, le leVar, jn jnVar, int i2) {
        try {
            byte[] aq = jv.aj.aq(i, leVar, 177506789);
            if (aq != null) {
                jnVar.ek(leVar, i, aq, true, (byte) -39);
                return;
            }
            jnVar.ek(leVar, i, leVar.aj(i, 1656629178), true, (byte) -62);
        } catch (Throwable e) {
            throw ei.ac(e, "bx.an(" + ')');
        }
    }

    public final void ac(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        try {
            this.ag[0] = -1;
            if (!(ctVar.by == 2 || ctVar.by == 1)) {
                ctVar.ak();
            }
            int i9 = 266497203 * this.bu.br;
            int i10 = 1621686031 * this.bu.bb;
            int i11 = ak[i];
            int i12 = ap[i];
            int i13 = ak[i2];
            int i14 = ap[i2];
            int i15 = ak[i3];
            int i16 = ap[i3];
            int i17 = ak[i4];
            int i18 = ap[i4];
            int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
            for (int i20 = 0; i20 < ctVar.ao; i20++) {
                int i21;
                int i22 = ctVar.aa[i20];
                int i23 = ctVar.ak[i20];
                int i24 = ctVar.ap[i20];
                if (i3 != 0) {
                    i21 = ((i15 * i23) + (i22 * i16)) >> 16;
                    i23 = ((i23 * i16) - (i22 * i15)) >> 16;
                } else {
                    i21 = i22;
                }
                if (i != 0) {
                    i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                    i23 = ((i12 * i23) - (i11 * i24)) >> 16;
                }
                if (i2 != 0) {
                    i22 = ((i14 * i21) + (i24 * i13)) >> 16;
                    i24 = ((i24 * i14) - (i21 * i13)) >> 16;
                } else {
                    i22 = i21;
                }
                i22 += i5;
                i21 = i23 + i6;
                i24 += i7;
                i23 = ((i18 * i21) - (i24 * i17)) >> 16;
                i24 = ((i24 * i18) + (i21 * i17)) >> 16;
                this.ax[i20] = i24 - i19;
                this.al[i20] = (((this.bu.bt * 411538491) * i22) / i8) + i9;
                this.az[i20] = (((this.bu.bt * 411538491) * i23) / i8) + i10;
                if (ctVar.av > 0) {
                    this.af[i20] = i22;
                    this.au[i20] = i23;
                    this.av[i20] = i24;
                }
            }
            try {
                aq(ctVar, false, false, 0, (byte) 122);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "bx.ac(" + ')');
        }
    }

    public final void ai(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = 266497203 * this.bu.br;
        int i10 = 1621686031 * this.bu.bb;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i15 * i23) + (i22 * i16)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i24 * i13)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((this.bu.bt * 411538491) * i22) / i8) + i9;
            this.az[i20] = (((this.bu.bt * 411538491) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            aq(ctVar, false, false, 0, Byte.MAX_VALUE);
        } catch (Exception e) {
        }
    }

    public final void am(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = 266497203 * this.bu.br;
        int i10 = 1621686031 * this.bu.bb;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i15 * i23) + (i22 * i16)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i24 * i13)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((this.bu.bt * 411538491) * i22) / i8) + i9;
            this.az[i20] = (((this.bu.bt * 411538491) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 85);
        } catch (Exception e) {
        }
    }

    public final void aw(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(ctVar.by == 2 || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = 381490277 * this.bu.br;
        int i10 = 2135736507 * this.bu.bb;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i15 * i23) + (i22 * i16)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i24 * i13)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((this.bu.bt * 411538491) * i22) / i8) + i9;
            this.az[i20] = (((this.bu.bt * 1580345717) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            aq(ctVar, false, false, 0, (byte) 11);
        } catch (Exception e) {
        }
    }

    void ae(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ct ar = ciVar.ar();
        if (ar != null) {
            this.ag[0] = -1;
            if (1 != ar.by) {
                ar.aa();
            }
            ar.ao(i);
            int i10 = ((i5 * i8) - (i6 * i4)) >> 16;
            int i11 = ((i2 * i7) + (i10 * i3)) >> 16;
            int i12 = (ar.bi * i3) >> 16;
            int i13 = i11 + i12;
            if (i13 > 50 && i11 < 3500) {
                int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                int i15 = (i14 - ar.bi) * (411538491 * this.bu.bt);
                if (i15 / i13 < this.bu.bx * -460528073) {
                    int i16 = (ar.bi + i14) * (-862391875 * this.bu.bt);
                    if (i16 / i13 > 1386896509 * this.bu.by) {
                        int i17 = ((i7 * i3) - (i10 * i2)) >> 16;
                        i10 = (ar.bi * i2) >> 16;
                        int i18 = (i17 + i10) * (this.bu.bt * 1358168812);
                        if (i18 / i13 > this.bu.bi * -1764426420) {
                            int i19 = (i17 - (i10 + (((-2098630381 * ar.bl) * i3) >> 16))) * (this.bu.bt * 169369311);
                            if (i19 / i13 < -1936509988 * this.bu.bs) {
                                Object obj;
                                int i20;
                                int i21;
                                int i22;
                                int i23;
                                boolean z;
                                boolean z2;
                                int i24;
                                boolean z3;
                                Object obj2 = null;
                                if (i11 - (i12 + (((ar.bl * -1223469746) * i2) >> 16)) <= 717954170) {
                                    obj2 = 1;
                                }
                                if (obj2 != null || ar.av > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                int aq = gx.aq(-154479449);
                                int i25 = 1815686859 * cm.ao;
                                boolean an = dh.an((byte) 8);
                                if (cs.aj && i9 > 0) {
                                    if (ft.ak(ar, i6, i7, i8, this, (byte) -17)) {
                                        cs.ao.ac(new cx(ar, i6, i7, i8, -2076938832));
                                    } else if (cs.aq == cu.ac) {
                                        cs.ao.ac(new cx(ar, i6, i7, i8, -2024688491));
                                    }
                                }
                                if (cs.ac && i9 > 0) {
                                    int i26;
                                    i10 = i11 - i12;
                                    if (i10 <= -606864079) {
                                        i20 = 50;
                                    } else {
                                        i20 = i10;
                                    }
                                    if (i14 > 0) {
                                        i26 = i16 / i20;
                                        i21 = i15 / i13;
                                    } else {
                                        i26 = i16 / i13;
                                        i21 = i15 / i20;
                                    }
                                    if (i17 > 0) {
                                        i22 = i19 / i13;
                                        i20 = i18 / i20;
                                    } else {
                                        i22 = i19 / i20;
                                        i20 = i18 / i13;
                                    }
                                    i23 = -67091520;
                                    i10 = aq - (-145546734 * this.bu.br);
                                    int i27 = i25 - (-2034661179 * this.bu.bb);
                                    if (i10 > i21 && i10 < i26 && i27 > i22 && i27 < i20) {
                                        i23 = -256;
                                    }
                                    hh.aj((this.bu.br * 266497203) + i21, i22 + (this.bu.bb * -870452433), i26 + (this.bu.br * -1919041483), i20 + (1621686031 * this.bu.bb), i23, -684868107);
                                }
                                if (i9 > 0 && an) {
                                    boolean ak;
                                    if (cm.aj) {
                                        ak = ft.ak(ar, i6, i7, i8, this, (byte) -1);
                                    } else {
                                        i10 = i11 - i12;
                                        if (i10 <= 1368398898) {
                                            i12 = 547473370;
                                        } else {
                                            i12 = i10;
                                        }
                                        if (i14 > 0) {
                                            i20 = i16 / i12;
                                            i23 = i15 / i13;
                                        } else {
                                            i20 = i16 / i13;
                                            i23 = i15 / i12;
                                        }
                                        if (i17 > 0) {
                                            i10 = i19 / i13;
                                            i22 = i18 / i12;
                                        } else {
                                            i22 = i18 / i13;
                                            i10 = i19 / i12;
                                        }
                                        i12 = aq - (this.bu.br * -673919179);
                                        i13 = i25 - (1662784288 * this.bu.bb);
                                        if (i12 <= i23 || i12 >= r5 || i13 <= r2 || i13 >= r3) {
                                            ak = false;
                                        } else {
                                            ak = true;
                                        }
                                    }
                                    if (ak) {
                                        if (ar.bh) {
                                            ae.ac(i9, (byte) 121);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i13 = this.bu.br * 266497203;
                                        i14 = 1621686031 * this.bu.bb;
                                        i22 = 0;
                                        i10 = 0;
                                        if (i != 0) {
                                            i22 = ak[i];
                                            i10 = ap[i];
                                        }
                                        i23 = 0;
                                        z2 = false;
                                        while (i23 < ar.ao) {
                                            i12 = ar.aa[i23];
                                            i15 = ar.ak[i23];
                                            i21 = ar.ap[i23];
                                            if (i == 0) {
                                                i24 = ((i22 * i21) + (i10 * i12)) >> 16;
                                                i21 = ((i21 * i10) - (i12 * i22)) >> 16;
                                            } else {
                                                i24 = i12;
                                            }
                                            i24 += i6;
                                            i12 = i15 + i7;
                                            i21 += i8;
                                            i15 = ((i4 * i21) + (i24 * i5)) >> 16;
                                            i21 = ((i21 * i5) - (i24 * i4)) >> 16;
                                            i24 = ((i12 * i3) - (i21 * i2)) >> 16;
                                            i12 = ((i21 * i3) + (i12 * i2)) >> 16;
                                            this.ax[i23] = i12 - i11;
                                            if (i12 < 50) {
                                                this.al[i23] = (((this.bu.bt * 411538491) * i15) / i12) + i13;
                                                this.az[i23] = (((this.bu.bt * 1079850269) * i24) / i12) + i14;
                                                z3 = z2;
                                            } else {
                                                this.al[i23] = -1024325074;
                                                z3 = true;
                                            }
                                            if (obj != null) {
                                                this.af[i23] = i15;
                                                this.au[i23] = i24;
                                                this.av[i23] = i12;
                                            }
                                            i23++;
                                            z2 = z3;
                                        }
                                        aq(ar, z2, z, i9, (byte) 51);
                                    }
                                }
                                z = false;
                                i13 = this.bu.br * 266497203;
                                i14 = 1621686031 * this.bu.bb;
                                i22 = 0;
                                i10 = 0;
                                if (i != 0) {
                                    i22 = ak[i];
                                    i10 = ap[i];
                                }
                                i23 = 0;
                                z2 = false;
                                while (i23 < ar.ao) {
                                    i12 = ar.aa[i23];
                                    i15 = ar.ak[i23];
                                    i21 = ar.ap[i23];
                                    if (i == 0) {
                                        i24 = i12;
                                    } else {
                                        i24 = ((i22 * i21) + (i10 * i12)) >> 16;
                                        i21 = ((i21 * i10) - (i12 * i22)) >> 16;
                                    }
                                    i24 += i6;
                                    i12 = i15 + i7;
                                    i21 += i8;
                                    i15 = ((i4 * i21) + (i24 * i5)) >> 16;
                                    i21 = ((i21 * i5) - (i24 * i4)) >> 16;
                                    i24 = ((i12 * i3) - (i21 * i2)) >> 16;
                                    i12 = ((i21 * i3) + (i12 * i2)) >> 16;
                                    this.ax[i23] = i12 - i11;
                                    if (i12 < 50) {
                                        this.al[i23] = -1024325074;
                                        z3 = true;
                                    } else {
                                        this.al[i23] = (((this.bu.bt * 411538491) * i15) / i12) + i13;
                                        this.az[i23] = (((this.bu.bt * 1079850269) * i24) / i12) + i14;
                                        z3 = z2;
                                    }
                                    if (obj != null) {
                                        this.af[i23] = i15;
                                        this.au[i23] = i24;
                                        this.av[i23] = i12;
                                    }
                                    i23++;
                                    z2 = z3;
                                }
                                try {
                                    aq(ar, z2, z, i9, (byte) 51);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void an(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            ct ar = ciVar.ar();
            if (ar != null) {
                this.ag[0] = -1;
                if (1 != ar.by) {
                    ar.aa();
                }
                ar.ao(i);
                int i11 = ((i5 * i8) - (i6 * i4)) >> 16;
                int i12 = ((i2 * i7) + (i11 * i3)) >> 16;
                int i13 = (ar.bi * i3) >> 16;
                int i14 = i12 + i13;
                if (i14 > 50 && i12 < 3500) {
                    int i15 = ((i5 * i6) + (i8 * i4)) >> 16;
                    int i16 = (i15 - ar.bi) * (411538491 * this.bu.bt);
                    if (i16 / i14 < this.bu.bx * -667195049) {
                        int i17 = (ar.bi + i15) * (411538491 * this.bu.bt);
                        if (i17 / i14 > 229861201 * this.bu.by) {
                            int i18 = ((i7 * i3) - (i11 * i2)) >> 16;
                            i11 = (ar.bi * i2) >> 16;
                            int i19 = (i18 + i11) * (this.bu.bt * 411538491);
                            if (i19 / i14 > this.bu.bi * 115242945) {
                                int i20 = (i18 - (i11 + (((-2098630381 * ar.bl) * i3) >> 16))) * (this.bu.bt * 411538491);
                                if (i20 / i14 < -1577768925 * this.bu.bs) {
                                    Object obj;
                                    int i21;
                                    int i22;
                                    int i23;
                                    int i24;
                                    int i25;
                                    boolean z;
                                    boolean z2;
                                    int i26;
                                    Object obj2 = null;
                                    if (i12 - (i13 + (((ar.bl * -2098630381) * i2) >> 16)) <= 50) {
                                        obj2 = 1;
                                    }
                                    if (obj2 != null || ar.av > 0) {
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    int aq = gx.aq(1507555154);
                                    int i27 = 1815686859 * cm.ao;
                                    boolean an = dh.an((byte) 8);
                                    if (cs.aj && i9 > 0) {
                                        if (ft.ak(ar, i6, i7, i8, this, (byte) -105)) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -65281));
                                        } else if (cs.aq == cu.ac) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -16776961));
                                        }
                                    }
                                    if (cs.ac && i9 > 0) {
                                        i11 = i12 - i13;
                                        if (i11 <= 50) {
                                            i21 = 50;
                                        } else {
                                            i21 = i11;
                                        }
                                        if (i15 > 0) {
                                            i22 = i17 / i21;
                                            i23 = i16 / i14;
                                        } else {
                                            i22 = i17 / i14;
                                            i23 = i16 / i21;
                                        }
                                        if (i18 > 0) {
                                            i24 = i20 / i14;
                                            i21 = i19 / i21;
                                        } else {
                                            i24 = i20 / i21;
                                            i21 = i19 / i14;
                                        }
                                        i25 = -8355840;
                                        i11 = aq - (266497203 * this.bu.br);
                                        int i28 = i27 - (1621686031 * this.bu.bb);
                                        if (i11 > i23 && i11 < i22 && i28 > i24 && i28 < i21) {
                                            i25 = -256;
                                        }
                                        hh.aj((this.bu.br * 266497203) + i23, i24 + (this.bu.bb * 1621686031), i22 + (this.bu.br * 266497203), i21 + (1621686031 * this.bu.bb), i25, 223850117);
                                    }
                                    if (i9 > 0 && an) {
                                        boolean z3 = false;
                                        if (cm.aj) {
                                            z3 = ft.ak(ar, i6, i7, i8, this, (byte) -35);
                                        } else {
                                            i24 = i12 - i13;
                                            if (i24 <= 50) {
                                                i13 = 50;
                                            } else {
                                                i13 = i24;
                                            }
                                            if (i15 > 0) {
                                                i21 = i17 / i13;
                                                i25 = i16 / i14;
                                            } else {
                                                i21 = i17 / i14;
                                                i25 = i16 / i13;
                                            }
                                            if (i18 > 0) {
                                                i24 = i20 / i14;
                                                i22 = i19 / i13;
                                            } else {
                                                i22 = i19 / i14;
                                                i24 = i20 / i13;
                                            }
                                            i13 = aq - (this.bu.br * 266497203);
                                            i14 = i27 - (1621686031 * this.bu.bb);
                                            if (i13 > i25 && i13 < r5 && i14 > r3 && i14 < r4) {
                                                z3 = true;
                                            }
                                        }
                                        if (z3) {
                                            if (ar.bh) {
                                                ae.ac(i9, (byte) 120);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            i14 = this.bu.br * 266497203;
                                            i15 = 1621686031 * this.bu.bb;
                                            i24 = 0;
                                            i11 = 0;
                                            if (i != 0) {
                                                i24 = ak[i];
                                                i11 = ap[i];
                                            }
                                            z2 = false;
                                            for (i13 = 0; i13 < ar.ao; i13++) {
                                                i26 = ar.aa[i13];
                                                i16 = ar.ak[i13];
                                                i25 = ar.ap[i13];
                                                if (i == 0) {
                                                    i23 = ((i24 * i25) + (i11 * i26)) >> 16;
                                                    i25 = ((i25 * i11) - (i26 * i24)) >> 16;
                                                } else {
                                                    i23 = i26;
                                                }
                                                i23 += i6;
                                                i26 = i16 + i7;
                                                i25 += i8;
                                                i16 = ((i4 * i25) + (i23 * i5)) >> 16;
                                                i25 = ((i25 * i5) - (i23 * i4)) >> 16;
                                                i23 = ((i26 * i3) - (i25 * i2)) >> 16;
                                                i25 = ((i25 * i3) + (i26 * i2)) >> 16;
                                                this.ax[i13] = i25 - i12;
                                                if (i25 < 50) {
                                                    this.al[i13] = (((this.bu.bt * 411538491) * i16) / i25) + i14;
                                                    this.az[i13] = (((this.bu.bt * 411538491) * i23) / i25) + i15;
                                                } else {
                                                    this.al[i13] = -5000;
                                                    z2 = true;
                                                }
                                                if (obj != null) {
                                                    this.af[i13] = i16;
                                                    this.au[i13] = i23;
                                                    this.av[i13] = i25;
                                                }
                                            }
                                            aq(ar, z2, z, i9, (byte) 105);
                                        }
                                    }
                                    z = false;
                                    i14 = this.bu.br * 266497203;
                                    i15 = 1621686031 * this.bu.bb;
                                    i24 = 0;
                                    i11 = 0;
                                    if (i != 0) {
                                        i24 = ak[i];
                                        i11 = ap[i];
                                    }
                                    z2 = false;
                                    for (i13 = 0; i13 < ar.ao; i13++) {
                                        i26 = ar.aa[i13];
                                        i16 = ar.ak[i13];
                                        i25 = ar.ap[i13];
                                        if (i == 0) {
                                            i23 = i26;
                                        } else {
                                            i23 = ((i24 * i25) + (i11 * i26)) >> 16;
                                            i25 = ((i25 * i11) - (i26 * i24)) >> 16;
                                        }
                                        i23 += i6;
                                        i26 = i16 + i7;
                                        i25 += i8;
                                        i16 = ((i4 * i25) + (i23 * i5)) >> 16;
                                        i25 = ((i25 * i5) - (i23 * i4)) >> 16;
                                        i23 = ((i26 * i3) - (i25 * i2)) >> 16;
                                        i25 = ((i25 * i3) + (i26 * i2)) >> 16;
                                        this.ax[i13] = i25 - i12;
                                        if (i25 < 50) {
                                            this.al[i13] = -5000;
                                            z2 = true;
                                        } else {
                                            this.al[i13] = (((this.bu.bt * 411538491) * i16) / i25) + i14;
                                            this.az[i13] = (((this.bu.bt * 411538491) * i23) / i25) + i15;
                                        }
                                        if (obj != null) {
                                            this.af[i13] = i16;
                                            this.au[i13] = i23;
                                            this.av[i13] = i25;
                                        }
                                    }
                                    try {
                                        aq(ar, z2, z, i9, (byte) 105);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "bx.an(" + ')');
        }
    }

    void as(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ct ar = ciVar.ar();
        if (ar != null) {
            this.ag[0] = -1;
            if (1 != ar.by) {
                ar.aa();
            }
            ar.ao(i);
            int i10 = ((i5 * i8) - (i6 * i4)) >> 16;
            int i11 = ((i2 * i7) + (i10 * i3)) >> 16;
            int i12 = (ar.bi * i3) >> 16;
            int i13 = i11 + i12;
            if (i13 > 50 && i11 < 3500) {
                int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                int i15 = (i14 - ar.bi) * (411538491 * this.bu.bt);
                if (i15 / i13 < this.bu.bx * -667195049) {
                    int i16 = (ar.bi + i14) * (411538491 * this.bu.bt);
                    if (i16 / i13 > 229861201 * this.bu.by) {
                        int i17 = ((i7 * i3) - (i10 * i2)) >> 16;
                        i10 = (ar.bi * i2) >> 16;
                        int i18 = (i17 + i10) * (this.bu.bt * 411538491);
                        if (i18 / i13 > this.bu.bi * 115242945) {
                            int i19 = (i17 - (i10 + (((-2098630381 * ar.bl) * i3) >> 16))) * (this.bu.bt * 411538491);
                            if (i19 / i13 < -1577768925 * this.bu.bs) {
                                Object obj;
                                int i20;
                                int i21;
                                int i22;
                                int i23;
                                boolean z;
                                boolean z2;
                                int i24;
                                boolean z3;
                                Object obj2 = null;
                                if (i11 - (i12 + (((ar.bl * -2098630381) * i2) >> 16)) <= 50) {
                                    obj2 = 1;
                                }
                                if (obj2 != null || ar.av > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                int aq = gx.aq(1932601009);
                                int i25 = 1815686859 * cm.ao;
                                boolean an = dh.an((byte) 8);
                                if (cs.aj && i9 > 0) {
                                    if (ft.ak(ar, i6, i7, i8, this, (byte) 2)) {
                                        cs.ao.ac(new cx(ar, i6, i7, i8, -65281));
                                    } else if (cs.aq == cu.ac) {
                                        cs.ao.ac(new cx(ar, i6, i7, i8, -16776961));
                                    }
                                }
                                if (cs.ac && i9 > 0) {
                                    int i26;
                                    i10 = i11 - i12;
                                    if (i10 <= 50) {
                                        i20 = 50;
                                    } else {
                                        i20 = i10;
                                    }
                                    if (i14 > 0) {
                                        i26 = i16 / i20;
                                        i21 = i15 / i13;
                                    } else {
                                        i26 = i16 / i13;
                                        i21 = i15 / i20;
                                    }
                                    if (i17 > 0) {
                                        i22 = i19 / i13;
                                        i20 = i18 / i20;
                                    } else {
                                        i22 = i19 / i20;
                                        i20 = i18 / i13;
                                    }
                                    i23 = -8355840;
                                    i10 = aq - (266497203 * this.bu.br);
                                    int i27 = i25 - (1621686031 * this.bu.bb);
                                    if (i10 > i21 && i10 < i26 && i27 > i22 && i27 < i20) {
                                        i23 = -256;
                                    }
                                    hh.aj((this.bu.br * 266497203) + i21, i22 + (this.bu.bb * 1621686031), i26 + (this.bu.br * 266497203), i20 + (1621686031 * this.bu.bb), i23, 1016249342);
                                }
                                if (i9 > 0 && an) {
                                    boolean ak;
                                    if (cm.aj) {
                                        ak = ft.ak(ar, i6, i7, i8, this, (byte) -16);
                                    } else {
                                        i10 = i11 - i12;
                                        if (i10 <= 50) {
                                            i12 = 50;
                                        } else {
                                            i12 = i10;
                                        }
                                        if (i14 > 0) {
                                            i20 = i16 / i12;
                                            i23 = i15 / i13;
                                        } else {
                                            i20 = i16 / i13;
                                            i23 = i15 / i12;
                                        }
                                        if (i17 > 0) {
                                            i10 = i19 / i13;
                                            i22 = i18 / i12;
                                        } else {
                                            i22 = i18 / i13;
                                            i10 = i19 / i12;
                                        }
                                        i12 = aq - (this.bu.br * 266497203);
                                        i13 = i25 - (1621686031 * this.bu.bb);
                                        if (i12 <= i23 || i12 >= r5 || i13 <= r2 || i13 >= r3) {
                                            ak = false;
                                        } else {
                                            ak = true;
                                        }
                                    }
                                    if (ak) {
                                        if (ar.bh) {
                                            ae.ac(i9, (byte) 109);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i13 = this.bu.br * 266497203;
                                        i14 = 1621686031 * this.bu.bb;
                                        i22 = 0;
                                        i10 = 0;
                                        if (i != 0) {
                                            i22 = ak[i];
                                            i10 = ap[i];
                                        }
                                        i23 = 0;
                                        z2 = false;
                                        while (i23 < ar.ao) {
                                            i12 = ar.aa[i23];
                                            i15 = ar.ak[i23];
                                            i21 = ar.ap[i23];
                                            if (i == 0) {
                                                i24 = ((i22 * i21) + (i10 * i12)) >> 16;
                                                i21 = ((i21 * i10) - (i12 * i22)) >> 16;
                                            } else {
                                                i24 = i12;
                                            }
                                            i24 += i6;
                                            i12 = i15 + i7;
                                            i21 += i8;
                                            i15 = ((i4 * i21) + (i24 * i5)) >> 16;
                                            i21 = ((i21 * i5) - (i24 * i4)) >> 16;
                                            i24 = ((i12 * i3) - (i21 * i2)) >> 16;
                                            i12 = ((i21 * i3) + (i12 * i2)) >> 16;
                                            this.ax[i23] = i12 - i11;
                                            if (i12 < 50) {
                                                this.al[i23] = (((this.bu.bt * 411538491) * i15) / i12) + i13;
                                                this.az[i23] = (((this.bu.bt * 411538491) * i24) / i12) + i14;
                                                z3 = z2;
                                            } else {
                                                this.al[i23] = -5000;
                                                z3 = true;
                                            }
                                            if (obj != null) {
                                                this.af[i23] = i15;
                                                this.au[i23] = i24;
                                                this.av[i23] = i12;
                                            }
                                            i23++;
                                            z2 = z3;
                                        }
                                        aq(ar, z2, z, i9, (byte) 111);
                                    }
                                }
                                z = false;
                                i13 = this.bu.br * 266497203;
                                i14 = 1621686031 * this.bu.bb;
                                i22 = 0;
                                i10 = 0;
                                if (i != 0) {
                                    i22 = ak[i];
                                    i10 = ap[i];
                                }
                                i23 = 0;
                                z2 = false;
                                while (i23 < ar.ao) {
                                    i12 = ar.aa[i23];
                                    i15 = ar.ak[i23];
                                    i21 = ar.ap[i23];
                                    if (i == 0) {
                                        i24 = i12;
                                    } else {
                                        i24 = ((i22 * i21) + (i10 * i12)) >> 16;
                                        i21 = ((i21 * i10) - (i12 * i22)) >> 16;
                                    }
                                    i24 += i6;
                                    i12 = i15 + i7;
                                    i21 += i8;
                                    i15 = ((i4 * i21) + (i24 * i5)) >> 16;
                                    i21 = ((i21 * i5) - (i24 * i4)) >> 16;
                                    i24 = ((i12 * i3) - (i21 * i2)) >> 16;
                                    i12 = ((i21 * i3) + (i12 * i2)) >> 16;
                                    this.ax[i23] = i12 - i11;
                                    if (i12 < 50) {
                                        this.al[i23] = -5000;
                                        z3 = true;
                                    } else {
                                        this.al[i23] = (((this.bu.bt * 411538491) * i15) / i12) + i13;
                                        this.az[i23] = (((this.bu.bt * 411538491) * i24) / i12) + i14;
                                        z3 = z2;
                                    }
                                    if (obj != null) {
                                        this.af[i23] = i15;
                                        this.au[i23] = i24;
                                        this.av[i23] = i12;
                                    }
                                    i23++;
                                    z2 = z3;
                                }
                                try {
                                    aq(ar, z2, z, i9, (byte) 111);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void al(ct ctVar, boolean z, boolean z2, int i) {
        if (ctVar.bs < 1600) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int[] iArr;
            int[] iArr2;
            if (cs.an && z2) {
                int[] iArr3 = this.al;
                int[] iArr4 = this.az;
                for (i2 = 0; i2 < ctVar.at; i2++) {
                    if (ctVar.as[i2] != -2) {
                        i3 = ctVar.ah[i2];
                        i4 = ctVar.ai[i2];
                        i5 = ctVar.aw[i2];
                        i6 = iArr3[i3];
                        i7 = iArr3[i4];
                        i8 = iArr3[i5];
                        i9 = iArr4[i3];
                        i10 = iArr4[i4];
                        i11 = iArr4[i5];
                        hh.aj(Math.min(i6, Math.min(i7, i8)) - 5, Math.min(i9, Math.min(i10, i11)) - 5, Math.max(i6, Math.max(i7, i8)) + 5, Math.max(i9, Math.max(i10, i11)) + 5, -49088, -741977802);
                    }
                }
            }
            for (i3 = 0; i3 < ctVar.bs; i3++) {
                this.ag[i3] = 0;
            }
            for (i12 = 0; i12 < ctVar.at; i12++) {
                if (-2 != ctVar.as[i12]) {
                    i9 = ctVar.ah[i12];
                    i10 = ctVar.ai[i12];
                    i11 = ctVar.aw[i12];
                    i6 = this.al[i9];
                    i7 = this.al[i10];
                    i8 = this.al[i11];
                    int[] iArr5;
                    if (z && (i6 == -5000 || i7 == -5000 || i8 == -5000)) {
                        i3 = this.af[i9];
                        i4 = this.af[i10];
                        i5 = this.af[i11];
                        i6 = this.au[i9];
                        i7 = this.au[i10];
                        i8 = this.au[i11];
                        i2 = this.av[i9];
                        i13 = this.av[i10];
                        i3 -= i4;
                        i5 -= i4;
                        i6 -= i7;
                        i8 -= i7;
                        i2 -= i13;
                        int i14 = this.av[i11] - i13;
                        if ((((i3 * i8) - (i5 * i6)) * i13) + ((i4 * ((i6 * i14) - (i8 * i2))) + (((i2 * i5) - (i14 * i3)) * i7)) > 0) {
                            this.as[i12] = true;
                            i3 = ctVar.bo + (((this.ax[i10] + this.ax[i9]) + this.ax[i11]) / 3);
                            iArr = this.ar[i3];
                            iArr5 = this.ag;
                            i6 = iArr5[i3];
                            iArr5[i3] = i6 + 1;
                            iArr[i6] = i12;
                        }
                    } else {
                        if (z2 && mc.ap(this.az[i9], this.az[i10], this.az[i11], i6, i7, i8, 5, -1885562416)) {
                            iArr2 = cm.az;
                            i4 = cm.al - 1341273315;
                            cm.al = i4;
                            iArr2[(i4 * 1487097653) - 1] = i;
                            z2 = false;
                        }
                        if (((i6 - i7) * (this.az[i11] - this.az[i10])) - ((this.az[i9] - this.az[i10]) * (i8 - i7)) > 0) {
                            this.as[i12] = false;
                            if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > -1431886479 * this.bu.bu || i7 > this.bu.bu * -1431886479 || i8 > this.bu.bu * -1431886479) {
                                this.ae[i12] = true;
                            } else {
                                this.ae[i12] = false;
                            }
                            i3 = ctVar.bo + (((this.ax[i9] + this.ax[i10]) + this.ax[i11]) / 3);
                            iArr = this.ar[i3];
                            iArr5 = this.ag;
                            i6 = iArr5[i3];
                            iArr5[i3] = i6 + 1;
                            iArr[i6] = i12;
                        }
                    }
                }
            }
            int[] iArr6;
            if (ctVar.al == null) {
                for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                    i5 = this.ag[i4];
                    if (i5 > 0) {
                        iArr6 = this.ar[i4];
                        for (i3 = 0; i3 < i5; i3++) {
                            ao(ctVar, iArr6[i3], (byte) -46);
                        }
                    }
                }
                return;
            }
            int[] iArr7;
            int[] iArr8;
            for (i3 = 0; i3 < 12; i3++) {
                this.ad[i3] = 0;
                this.bh[i3] = 0;
            }
            for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                i5 = this.ag[i4];
                if (i5 > 0) {
                    iArr6 = this.ar[i4];
                    for (i3 = 0; i3 < i5; i3++) {
                        i7 = iArr6[i3];
                        byte b = ctVar.al[i7];
                        iArr7 = this.ad;
                        i13 = iArr7[b];
                        iArr7[b] = i13 + 1;
                        this.ab[b][i13] = i7;
                        if (b < (byte) 10) {
                            iArr8 = this.bh;
                            iArr8[b] = iArr8[b] + i4;
                        } else if (b == (byte) 10) {
                            this.bp[i13] = i4;
                        } else {
                            this.bm[i13] = i4;
                        }
                    }
                }
            }
            i3 = 0;
            if (this.ad[1] > 0 || this.ad[2] > 0) {
                i3 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
            }
            i4 = 0;
            if (this.ad[3] > 0 || this.ad[4] > 0) {
                i4 = (this.bh[4] + this.bh[3]) / (this.ad[4] + this.ad[3]);
            }
            i5 = 0;
            if (this.ad[6] > 0 || this.ad[8] > 0) {
                i5 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
            }
            i12 = 0;
            i13 = this.ad[10];
            iArr7 = this.ab[10];
            int[] iArr9 = this.bp;
            if (0 == i13) {
                i12 = 0;
                i13 = this.ad[11];
                iArr7 = this.ab[11];
                iArr9 = this.bm;
            }
            if (i13 > 0) {
                i6 = iArr9[i12];
            } else {
                i6 = -1000;
            }
            i9 = 0;
            iArr8 = iArr7;
            i2 = i12;
            int i15 = i13;
            i13 = i6;
            iArr6 = iArr9;
            i8 = i15;
            while (i9 < 10) {
                while (i9 == 0 && r9 > r2) {
                    i13 = i2 + 1;
                    ao(ctVar, iArr8[i2], (byte) -21);
                    if (i13 != i8 || iArr8 == this.ab[11]) {
                        i2 = i13;
                    } else {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i13 = iArr6[i2];
                    } else {
                        i13 = -1000;
                    }
                }
                while (3 == i9 && i13 > r3) {
                    i13 = i2 + 1;
                    ao(ctVar, iArr8[i2], (byte) -114);
                    if (i8 != i13 || iArr8 == this.ab[11]) {
                        i2 = i13;
                    } else {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i13 = iArr6[i2];
                    } else {
                        i13 = -1000;
                    }
                }
                i12 = i13;
                i13 = i2;
                i2 = i8;
                iArr9 = iArr8;
                iArr8 = iArr6;
                while (5 == i9 && i12 > r4) {
                    i6 = i13 + 1;
                    ao(ctVar, iArr9[i13], (byte) -119);
                    if (i6 != i2 || this.ab[11] == iArr9) {
                        int[] iArr10 = iArr8;
                        iArr8 = iArr9;
                        i8 = i2;
                        i2 = i6;
                        iArr6 = iArr10;
                    } else {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i12 = iArr6[i2];
                        i13 = i2;
                        i2 = i8;
                        iArr9 = iArr8;
                        iArr8 = iArr6;
                    } else {
                        i12 = -1000;
                        i13 = i2;
                        i2 = i8;
                        iArr9 = iArr8;
                        iArr8 = iArr6;
                    }
                }
                i10 = this.ad[i9];
                int[] iArr11 = this.ab[i9];
                for (i6 = 0; i6 < i10; i6++) {
                    ao(ctVar, iArr11[i6], (byte) -85);
                }
                i9++;
                iArr6 = iArr8;
                iArr8 = iArr9;
                i8 = i2;
                i2 = i13;
                i13 = i12;
            }
            iArr2 = iArr6;
            iArr = iArr8;
            i5 = i8;
            while (i13 != -1000) {
                i6 = i2 + 1;
                ao(ctVar, iArr[i2], (byte) -5);
                if (i6 == i5 && this.ab[11] != iArr) {
                    i6 = 0;
                    iArr = this.ab[11];
                    i5 = this.ad[11];
                    iArr2 = this.bm;
                }
                if (i6 < i5) {
                    i13 = iArr2[i6];
                    i2 = i6;
                } else {
                    i13 = -1000;
                    i2 = i6;
                }
            }
        }
    }

    final void aq(ct ctVar, boolean z, boolean z2, int i, byte b) {
        try {
            if (ctVar.bs < 1600) {
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                int[] iArr4;
                if (cs.an && z2) {
                    int[] iArr5 = this.al;
                    int[] iArr6 = this.az;
                    for (i2 = 0; i2 < ctVar.at; i2++) {
                        if (ctVar.as[i2] != -2) {
                            i3 = ctVar.ah[i2];
                            i4 = ctVar.ai[i2];
                            i5 = ctVar.aw[i2];
                            i6 = iArr5[i3];
                            i7 = iArr5[i4];
                            i8 = iArr5[i5];
                            i9 = iArr6[i3];
                            i10 = iArr6[i4];
                            i11 = iArr6[i5];
                            hh.aj(Math.min(i6, Math.min(i7, i8)) - 5, Math.min(i9, Math.min(i10, i11)) - 5, Math.max(i6, Math.max(i7, i8)) + 5, Math.max(i9, Math.max(i10, i11)) + 5, -49088, -589802242);
                        }
                    }
                }
                for (i3 = 0; i3 < ctVar.bs; i3++) {
                    this.ag[i3] = 0;
                }
                i9 = 0;
                boolean z3 = z2;
                while (i9 < ctVar.at) {
                    boolean z4;
                    if (-2 == ctVar.as[i9]) {
                        z4 = z3;
                    } else {
                        i10 = ctVar.ah[i9];
                        i11 = ctVar.ai[i9];
                        int i13 = ctVar.aw[i9];
                        i6 = this.al[i10];
                        i7 = this.al[i11];
                        i8 = this.al[i13];
                        if (z && (i6 == -5000 || i7 == -5000 || i8 == -5000)) {
                            i3 = this.af[i10];
                            i4 = this.af[i11];
                            i5 = this.af[i13];
                            i6 = this.au[i10];
                            i7 = this.au[i11];
                            i8 = this.au[i13];
                            i2 = this.av[i10];
                            i12 = this.av[i11];
                            i3 -= i4;
                            i5 -= i4;
                            i6 -= i7;
                            i8 -= i7;
                            i2 -= i12;
                            int i14 = this.av[i13] - i12;
                            if ((((i3 * i8) - (i5 * i6)) * i12) + ((i4 * ((i6 * i14) - (i8 * i2))) + (((i2 * i5) - (i14 * i3)) * i7)) > 0) {
                                this.as[i9] = true;
                                i3 = ctVar.bo + (((this.ax[i11] + this.ax[i10]) + this.ax[i13]) / 3);
                                iArr = this.ar[i3];
                                iArr2 = this.ag;
                                i6 = iArr2[i3];
                                iArr2[i3] = i6 + 1;
                                iArr[i6] = i9;
                            }
                            z4 = z3;
                        } else {
                            if (z3 && mc.ap(this.az[i10], this.az[i11], this.az[i13], i6, i7, i8, 5, 794430549)) {
                                iArr3 = cm.az;
                                i4 = cm.al - 1341273315;
                                cm.al = i4;
                                iArr3[(i4 * 1487097653) - 1] = i;
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((i6 - i7) * (this.az[i13] - this.az[i11])) - ((this.az[i10] - this.az[i11]) * (i8 - i7)) > 0) {
                                this.as[i9] = false;
                                if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > -1431886479 * this.bu.bu || i7 > this.bu.bu * -1431886479 || i8 > this.bu.bu * -1431886479) {
                                    this.ae[i9] = true;
                                } else {
                                    this.ae[i9] = false;
                                }
                                i4 = ctVar.bo + (((this.ax[i10] + this.ax[i11]) + this.ax[i13]) / 3);
                                iArr2 = this.ar[i4];
                                iArr4 = this.ag;
                                i7 = iArr4[i4];
                                iArr4[i4] = i7 + 1;
                                iArr2[i7] = i9;
                            }
                        }
                    }
                    i9++;
                    z3 = z4;
                }
                if (ctVar.al == null) {
                    for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                        i5 = this.ag[i4];
                        if (i5 > 0) {
                            iArr4 = this.ar[i4];
                            for (i3 = 0; i3 < i5; i3++) {
                                ao(ctVar, iArr4[i3], (byte) -32);
                            }
                        }
                    }
                    return;
                }
                int[] iArr7;
                for (i3 = 0; i3 < 12; i3++) {
                    this.ad[i3] = 0;
                    this.bh[i3] = 0;
                }
                for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                    i5 = this.ag[i4];
                    if (i5 > 0) {
                        iArr4 = this.ar[i4];
                        for (i3 = 0; i3 < i5; i3++) {
                            i7 = iArr4[i3];
                            byte b2 = ctVar.al[i7];
                            int[] iArr8 = this.ad;
                            i12 = iArr8[b2];
                            iArr8[b2] = i12 + 1;
                            this.ab[b2][i12] = i7;
                            if (b2 < (byte) 10) {
                                iArr7 = this.bh;
                                iArr7[b2] = iArr7[b2] + i4;
                            } else if (b2 == (byte) 10) {
                                this.bp[i12] = i4;
                            } else {
                                this.bm[i12] = i4;
                            }
                        }
                    }
                }
                if (this.ad[1] > 0 || this.ad[2] > 0) {
                    i9 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
                } else {
                    i9 = 0;
                }
                i3 = 0;
                if (this.ad[3] > 0 || this.ad[4] > 0) {
                    i3 = (this.bh[4] + this.bh[3]) / (this.ad[4] + this.ad[3]);
                }
                i4 = 0;
                if (this.ad[6] > 0 || this.ad[8] > 0) {
                    i4 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
                }
                i12 = 0;
                i2 = this.ad[10];
                int[] iArr9 = this.ab[10];
                iArr7 = this.bp;
                if (0 == i2) {
                    i12 = 0;
                    i2 = this.ad[11];
                    iArr9 = this.ab[11];
                    iArr7 = this.bm;
                }
                if (i2 > 0) {
                    i5 = iArr7[i12];
                } else {
                    i5 = -1000;
                }
                int i15 = 0;
                iArr4 = iArr9;
                i8 = i12;
                int i16 = i2;
                i2 = i5;
                iArr2 = iArr7;
                i7 = i16;
                while (i15 < 10) {
                    while (i15 == 0 && r8 > r11) {
                        i2 = i8 + 1;
                        ao(ctVar, iArr4[i8], (byte) -94);
                        if (i2 != i7 || iArr4 == this.ab[11]) {
                            i8 = i2;
                        } else {
                            i8 = 0;
                            i7 = this.ad[11];
                            iArr4 = this.ab[11];
                            iArr2 = this.bm;
                        }
                        if (i8 < i7) {
                            i2 = iArr2[i8];
                        } else {
                            i2 = -1000;
                        }
                    }
                    while (3 == i15 && i2 > r2) {
                        i2 = i8 + 1;
                        ao(ctVar, iArr4[i8], (byte) -117);
                        if (i7 != i2 || iArr4 == this.ab[11]) {
                            i8 = i2;
                        } else {
                            i8 = 0;
                            i7 = this.ad[11];
                            iArr4 = this.ab[11];
                            iArr2 = this.bm;
                        }
                        if (i8 < i7) {
                            i2 = iArr2[i8];
                        } else {
                            i2 = -1000;
                        }
                    }
                    i12 = i2;
                    i2 = i8;
                    i8 = i7;
                    iArr7 = iArr4;
                    iArr4 = iArr2;
                    while (5 == i15 && i12 > r3) {
                        i5 = i2 + 1;
                        ao(ctVar, iArr7[i2], (byte) -78);
                        if (i5 != i8 || this.ab[11] == iArr7) {
                            int[] iArr10 = iArr4;
                            iArr4 = iArr7;
                            i7 = i8;
                            i8 = i5;
                            iArr2 = iArr10;
                        } else {
                            i8 = 0;
                            i7 = this.ad[11];
                            iArr4 = this.ab[11];
                            iArr2 = this.bm;
                        }
                        if (i8 >= i7) {
                            i12 = -1000;
                            i2 = i8;
                            i8 = i7;
                            iArr7 = iArr4;
                            iArr4 = iArr2;
                        } else {
                            i12 = iArr2[i8];
                            i2 = i8;
                            i8 = i7;
                            iArr7 = iArr4;
                            iArr4 = iArr2;
                        }
                    }
                    i10 = this.ad[i15];
                    int[] iArr11 = this.ab[i15];
                    for (i5 = 0; i5 < i10; i5++) {
                        ao(ctVar, iArr11[i5], (byte) -92);
                    }
                    i15++;
                    iArr2 = iArr4;
                    iArr4 = iArr7;
                    i7 = i8;
                    i8 = i2;
                    i2 = i12;
                }
                iArr3 = iArr2;
                iArr = iArr4;
                i5 = i7;
                i6 = i2;
                i7 = i8;
                while (i6 != -1000) {
                    i6 = i7 + 1;
                    ao(ctVar, iArr[i7], (byte) -78);
                    if (i6 == i5 && this.ab[11] != iArr) {
                        i6 = 0;
                        iArr = this.ab[11];
                        i5 = this.ad[11];
                        iArr3 = this.bm;
                    }
                    if (i6 < i5) {
                        i16 = i6;
                        i6 = iArr3[i6];
                        i7 = i16;
                    } else {
                        i16 = i6;
                        i6 = -1000;
                        i7 = i16;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bx.aq(" + ')');
        }
    }

    final void az(ct ctVar, boolean z, boolean z2, int i) {
        if (ctVar.bs < -604591741) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int[] iArr;
            int[] iArr2;
            if (cs.an && z2) {
                int[] iArr3 = this.al;
                int[] iArr4 = this.az;
                for (i2 = 0; i2 < ctVar.at; i2++) {
                    if (ctVar.as[i2] != 1149900506) {
                        i3 = ctVar.ah[i2];
                        i4 = ctVar.ai[i2];
                        i5 = ctVar.aw[i2];
                        i6 = iArr3[i3];
                        i7 = iArr3[i4];
                        i8 = iArr3[i5];
                        i9 = iArr4[i3];
                        i10 = iArr4[i4];
                        i11 = iArr4[i5];
                        hh.aj(Math.min(i6, Math.min(i7, i8)) - 5, Math.min(i9, Math.min(i10, i11)) - 5, Math.max(i6, Math.max(i7, i8)) + 5, Math.max(i9, Math.max(i10, i11)) + 5, -1091523481, -1576519749);
                    }
                }
            }
            for (i3 = 0; i3 < ctVar.bs; i3++) {
                this.ag[i3] = 0;
            }
            for (i12 = 0; i12 < ctVar.at; i12++) {
                if (-2 != ctVar.as[i12]) {
                    i9 = ctVar.ah[i12];
                    i10 = ctVar.ai[i12];
                    i11 = ctVar.aw[i12];
                    i6 = this.al[i9];
                    i7 = this.al[i10];
                    i8 = this.al[i11];
                    int[] iArr5;
                    if (z && (i6 == -5000 || i7 == 1127250428 || i8 == -1849453745)) {
                        i3 = this.af[i9];
                        i4 = this.af[i10];
                        i5 = this.af[i11];
                        i6 = this.au[i9];
                        i7 = this.au[i10];
                        i8 = this.au[i11];
                        i2 = this.av[i9];
                        i13 = this.av[i10];
                        i3 -= i4;
                        i5 -= i4;
                        i6 -= i7;
                        i8 -= i7;
                        i2 -= i13;
                        int i14 = this.av[i11] - i13;
                        if ((((i3 * i8) - (i5 * i6)) * i13) + ((i4 * ((i6 * i14) - (i8 * i2))) + (((i2 * i5) - (i14 * i3)) * i7)) > 0) {
                            this.as[i12] = true;
                            i3 = ctVar.bo + (((this.ax[i10] + this.ax[i9]) + this.ax[i11]) / 3);
                            iArr = this.ar[i3];
                            iArr5 = this.ag;
                            i6 = iArr5[i3];
                            iArr5[i3] = i6 + 1;
                            iArr[i6] = i12;
                        }
                    } else {
                        if (z2 && mc.ap(this.az[i9], this.az[i10], this.az[i11], i6, i7, i8, 5, -413361392)) {
                            iArr2 = cm.az;
                            i4 = cm.al - 1341273315;
                            cm.al = i4;
                            iArr2[(i4 * 1487097653) - 1] = i;
                            z2 = false;
                        }
                        if (((i6 - i7) * (this.az[i11] - this.az[i10])) - ((this.az[i9] - this.az[i10]) * (i8 - i7)) > 0) {
                            this.as[i12] = false;
                            if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > -1431886479 * this.bu.bu || i7 > this.bu.bu * -1431886479 || i8 > this.bu.bu * -1431886479) {
                                this.ae[i12] = true;
                            } else {
                                this.ae[i12] = false;
                            }
                            i3 = ctVar.bo + (((this.ax[i9] + this.ax[i10]) + this.ax[i11]) / 3);
                            iArr = this.ar[i3];
                            iArr5 = this.ag;
                            i6 = iArr5[i3];
                            iArr5[i3] = i6 + 1;
                            iArr[i6] = i12;
                        }
                    }
                }
            }
            int[] iArr6;
            if (ctVar.al == null) {
                for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                    i5 = this.ag[i4];
                    if (i5 > 0) {
                        iArr6 = this.ar[i4];
                        for (i3 = 0; i3 < i5; i3++) {
                            ao(ctVar, iArr6[i3], (byte) -117);
                        }
                    }
                }
                return;
            }
            int[] iArr7;
            int[] iArr8;
            for (i3 = 0; i3 < 12; i3++) {
                this.ad[i3] = 0;
                this.bh[i3] = 0;
            }
            for (i4 = ctVar.bs - 1; i4 >= 0; i4--) {
                i5 = this.ag[i4];
                if (i5 > 0) {
                    iArr6 = this.ar[i4];
                    for (i3 = 0; i3 < i5; i3++) {
                        i7 = iArr6[i3];
                        byte b = ctVar.al[i7];
                        iArr7 = this.ad;
                        i13 = iArr7[b];
                        iArr7[b] = i13 + 1;
                        this.ab[b][i13] = i7;
                        if (b < (byte) 10) {
                            iArr8 = this.bh;
                            iArr8[b] = iArr8[b] + i4;
                        } else if (b == (byte) 10) {
                            this.bp[i13] = i4;
                        } else {
                            this.bm[i13] = i4;
                        }
                    }
                }
            }
            i3 = 0;
            if (this.ad[1] > 0 || this.ad[2] > 0) {
                i3 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
            }
            i4 = 0;
            if (this.ad[3] > 0 || this.ad[4] > 0) {
                i4 = (this.bh[4] + this.bh[3]) / (this.ad[4] + this.ad[3]);
            }
            i5 = 0;
            if (this.ad[6] > 0 || this.ad[8] > 0) {
                i5 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
            }
            i12 = 0;
            i13 = this.ad[10];
            iArr7 = this.ab[10];
            int[] iArr9 = this.bp;
            if (0 == i13) {
                i12 = 0;
                i13 = this.ad[11];
                iArr7 = this.ab[11];
                iArr9 = this.bm;
            }
            if (i13 > 0) {
                i6 = iArr9[i12];
            } else {
                i6 = -1000;
            }
            i9 = 0;
            iArr8 = iArr7;
            i2 = i12;
            int i15 = i13;
            i13 = i6;
            iArr6 = iArr9;
            i8 = i15;
            while (i9 < 10) {
                while (i9 == 0 && i13 > r2) {
                    i13 = i2 + 1;
                    ao(ctVar, iArr8[i2], (byte) -15);
                    if (i13 != i8 || iArr8 == this.ab[11]) {
                        i2 = i13;
                    } else {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i13 = iArr6[i2];
                    } else {
                        i13 = -1000;
                    }
                }
                i15 = i2;
                i2 = i13;
                i13 = i15;
                while (3 == i9 && i2 > r3) {
                    i2 = i13 + 1;
                    ao(ctVar, iArr8[i13], (byte) -35);
                    if (i8 == i2 && iArr8 != this.ab[11]) {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i15 = i2;
                        i2 = iArr6[i2];
                        i13 = i15;
                    } else {
                        i15 = i2;
                        i2 = -1000;
                        i13 = i15;
                    }
                }
                i12 = i2;
                i2 = i8;
                iArr9 = iArr8;
                iArr8 = iArr6;
                while (5 == i9 && i12 > r4) {
                    i6 = i13 + 1;
                    ao(ctVar, iArr9[i13], (byte) -41);
                    if (i6 != i2 || this.ab[11] == iArr9) {
                        int[] iArr10 = iArr8;
                        iArr8 = iArr9;
                        i8 = i2;
                        i2 = i6;
                        iArr6 = iArr10;
                    } else {
                        i2 = 0;
                        i8 = this.ad[11];
                        iArr8 = this.ab[11];
                        iArr6 = this.bm;
                    }
                    if (i2 < i8) {
                        i12 = iArr6[i2];
                        i13 = i2;
                        i2 = i8;
                        iArr9 = iArr8;
                        iArr8 = iArr6;
                    } else {
                        i12 = 1404316235;
                        i13 = i2;
                        i2 = i8;
                        iArr9 = iArr8;
                        iArr8 = iArr6;
                    }
                }
                i10 = this.ad[i9];
                int[] iArr11 = this.ab[i9];
                for (i6 = 0; i6 < i10; i6++) {
                    ao(ctVar, iArr11[i6], (byte) -103);
                }
                i9++;
                iArr6 = iArr8;
                iArr8 = iArr9;
                i8 = i2;
                i2 = i13;
                i13 = i12;
            }
            iArr2 = iArr6;
            iArr = iArr8;
            i5 = i8;
            i7 = i2;
            i6 = i13;
            while (i6 != -1676524234) {
                i6 = i7 + 1;
                ao(ctVar, iArr[i7], (byte) -10);
                if (i6 == i5 && this.ab[11] != iArr) {
                    i6 = 0;
                    iArr = this.ab[11];
                    i5 = this.ad[11];
                    iArr2 = this.bm;
                }
                if (i6 < i5) {
                    i15 = i6;
                    i6 = iArr2[i6];
                    i7 = i15;
                } else {
                    i15 = i6;
                    i6 = -1000;
                    i7 = i15;
                }
            }
        }
    }

    final void af(ct ctVar, int i) {
        if (this.as[i]) {
            aa(ctVar, i, (short) 27080);
            return;
        }
        int i2 = ctVar.ah[i];
        int i3 = ctVar.ai[i];
        int i4 = ctVar.aw[i];
        this.bu.ad = this.ae[i];
        if (ctVar.az == null) {
            this.bu.bh = 0;
        } else {
            this.bu.bh = (ctVar.az[i] & 255) * -621822549;
        }
        if (ctVar.af != null && ctVar.af[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = ctVar.ax[i] & 255;
                int i9 = ctVar.ay[i8];
                int i10 = ctVar.ag[i8];
                i5 = ctVar.ar[i8];
                i6 = i10;
                i7 = i9;
            }
            if (-1 == ctVar.as[i]) {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            } else {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            }
        } else if (ctVar.as[i] == -1) {
            ((cq) this.bu).ak(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) 71);
        } else {
            ((cq) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], -200302438);
        }
    }

    final void ao(ct ctVar, int i, byte b) {
        try {
            if (this.as[i]) {
                aa(ctVar, i, (short) -13123);
                return;
            }
            int i2 = ctVar.ah[i];
            int i3 = ctVar.ai[i];
            int i4 = ctVar.aw[i];
            this.bu.ad = this.ae[i];
            if (ctVar.az == null) {
                this.bu.bh = 0;
            } else {
                this.bu.bh = (ctVar.az[i] & 255) * -621822549;
            }
            if (ctVar.af != null && ctVar.af[i] != (short) -1) {
                int i5;
                int i6;
                int i7;
                if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                    i5 = i4;
                    i6 = i3;
                    i7 = i2;
                } else {
                    int i8 = ctVar.ax[i] & 255;
                    int i9 = ctVar.ay[i8];
                    int i10 = ctVar.ag[i8];
                    i5 = ctVar.ar[i8];
                    i6 = i10;
                    i7 = i9;
                }
                if (-1 == ctVar.as[i]) {
                    ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
                } else {
                    ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
                }
            } else if (ctVar.as[i] == -1) {
                ((cq) this.bu).ak(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) 36);
            } else {
                ((cq) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], 921159956);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bx.ao(" + ')');
        }
    }

    final void au(ct ctVar, int i) {
        if (this.as[i]) {
            aa(ctVar, i, (short) -5580);
            return;
        }
        int i2 = ctVar.ah[i];
        int i3 = ctVar.ai[i];
        int i4 = ctVar.aw[i];
        this.bu.ad = this.ae[i];
        if (ctVar.az == null) {
            this.bu.bh = 0;
        } else {
            this.bu.bh = (ctVar.az[i] & -733773304) * -1107830923;
        }
        if (ctVar.af != null && ctVar.af[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = ctVar.ax[i] & 1336935857;
                int i9 = ctVar.ay[i8];
                int i10 = ctVar.ag[i8];
                i5 = ctVar.ar[i8];
                i6 = i10;
                i7 = i9;
            }
            if (-1 == ctVar.as[i]) {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            } else {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            }
        } else if (ctVar.as[i] == -1) {
            ((cq) this.bu).ak(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) 98);
        } else {
            ((cq) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], 898992149);
        }
    }

    final void ax(ct ctVar, int i) {
        if (this.as[i]) {
            aa(ctVar, i, (short) 15436);
            return;
        }
        int i2 = ctVar.ah[i];
        int i3 = ctVar.ai[i];
        int i4 = ctVar.aw[i];
        this.bu.ad = this.ae[i];
        if (ctVar.az == null) {
            this.bu.bh = 0;
        } else {
            this.bu.bh = (ctVar.az[i] & 255) * -621822549;
        }
        if (ctVar.af != null && ctVar.af[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                int i8 = ctVar.ax[i] & 255;
                int i9 = ctVar.ay[i8];
                int i10 = ctVar.ag[i8];
                i5 = ctVar.ar[i8];
                i6 = i10;
                i7 = i9;
            }
            if (-1 == ctVar.as[i]) {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            } else {
                ((cq) this.bu).at(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], this.af[i7], this.af[i6], this.af[i5], this.au[i7], this.au[i6], this.au[i5], this.av[i7], this.av[i6], this.av[i5], ctVar.af[i], 2100201084);
            }
        } else if (ctVar.as[i] == -1) {
            ((cq) this.bu).ak(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) 7);
        } else {
            ((cq) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], -131871952);
        }
    }

    final void aa(ct ctVar, int i, short s) {
        try {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 266497203 * this.bu.br;
            int i10 = this.bu.bb * 1621686031;
            int i11 = ctVar.ah[i];
            int i12 = ctVar.ai[i];
            int i13 = ctVar.aw[i];
            int i14 = this.av[i11];
            int i15 = this.av[i12];
            int i16 = this.av[i13];
            if (ctVar.az == null) {
                this.bu.bh = 0;
            } else {
                this.bu.bh = (ctVar.az[i] & 255) * -621822549;
            }
            if (i14 >= 50) {
                this.bt[0] = this.al[i11];
                this.br[0] = this.az[i11];
                this.bb[0] = ctVar.am[i];
                i2 = 1;
            } else {
                i3 = this.af[i11];
                i4 = this.au[i11];
                i5 = ctVar.am[i];
                if (i16 >= 50) {
                    i6 = ah[i16 - i14] * (50 - i14);
                    this.bt[0] = ((((((this.af[i13] - i3) * i6) >> 16) + i3) * (this.bu.bt * 411538491)) / 50) + i9;
                    this.br[0] = ((((((this.au[i13] - i4) * i6) >> 16) + i4) * (this.bu.bt * 411538491)) / 50) + i10;
                    i2 = 1;
                    this.bb[0] = ((i6 * (ctVar.as[i] - i5)) >> 16) + i5;
                } else {
                    i2 = 0;
                }
                if (i15 >= 50) {
                    i7 = (50 - i14) * ah[i15 - i14];
                    this.bt[i2] = (((i3 + (((this.af[i12] - i3) * i7) >> 16)) * (this.bu.bt * 411538491)) / 50) + i9;
                    this.br[i2] = (((i4 + (((this.au[i12] - i4) * i7) >> 16)) * (411538491 * this.bu.bt)) / 50) + i10;
                    i3 = i2 + 1;
                    this.bb[i2] = ((i7 * (ctVar.ae[i] - i5)) >> 16) + i5;
                    i2 = i3;
                }
            }
            if (i15 >= 50) {
                this.bt[i2] = this.al[i12];
                this.br[i2] = this.az[i12];
                i3 = i2 + 1;
                this.bb[i2] = ctVar.ae[i];
                i2 = i3;
            } else {
                i7 = this.af[i12];
                i4 = this.au[i12];
                i5 = ctVar.ae[i];
                if (i14 >= 50) {
                    i6 = (50 - i15) * ah[i14 - i15];
                    this.bt[i2] = ((((((this.af[i11] - i7) * i6) >> 16) + i7) * (this.bu.bt * 411538491)) / 50) + i9;
                    this.br[i2] = (((this.bu.bt * 411538491) * ((((this.au[i11] - i4) * i6) >> 16) + i4)) / 50) + i10;
                    i3 = i2 + 1;
                    this.bb[i2] = ((i6 * (ctVar.am[i] - i5)) >> 16) + i5;
                    i2 = i3;
                }
                if (i16 >= 50) {
                    i6 = (50 - i15) * ah[i16 - i15];
                    this.bt[i2] = (((i7 + (((this.af[i13] - i7) * i6) >> 16)) * (411538491 * this.bu.bt)) / 50) + i9;
                    this.br[i2] = ((((((this.au[i13] - i4) * i6) >> 16) + i4) * (this.bu.bt * 411538491)) / 50) + i10;
                    i3 = i2 + 1;
                    this.bb[i2] = (((ctVar.as[i] - i5) * i6) >> 16) + i5;
                    i2 = i3;
                }
            }
            if (i16 >= 50) {
                this.bt[i2] = this.al[i13];
                this.br[i2] = this.az[i13];
                i3 = i2 + 1;
                this.bb[i2] = ctVar.as[i];
                i8 = i3;
            } else {
                i7 = this.af[i13];
                i4 = this.au[i13];
                i5 = ctVar.as[i];
                if (i15 >= 50) {
                    i15 = (50 - i16) * ah[i15 - i16];
                    this.bt[i2] = (((this.bu.bt * 411538491) * ((((this.af[i12] - i7) * i15) >> 16) + i7)) / 50) + i9;
                    this.br[i2] = (((411538491 * this.bu.bt) * ((((this.au[i12] - i4) * i15) >> 16) + i4)) / 50) + i10;
                    i3 = i2 + 1;
                    this.bb[i2] = ((i15 * (ctVar.ae[i] - i5)) >> 16) + i5;
                    i2 = i3;
                }
                if (i14 >= 50) {
                    i14 = ah[i14 - i16] * (50 - i16);
                    this.bt[i2] = (((i7 + (((this.af[i11] - i7) * i14) >> 16)) * (411538491 * this.bu.bt)) / 50) + i9;
                    this.br[i2] = (((411538491 * this.bu.bt) * ((((this.au[i11] - i4) * i14) >> 16) + i4)) / 50) + i10;
                    i3 = i2 + 1;
                    this.bb[i2] = (((ctVar.am[i] - i5) * i14) >> 16) + i5;
                    i8 = i3;
                } else {
                    i8 = i2;
                }
            }
            i10 = this.bt[0];
            i14 = this.bt[1];
            i15 = this.bt[2];
            i2 = this.br[0];
            i7 = this.br[1];
            i9 = this.br[2];
            this.bu.ad = false;
            if (i8 == 3) {
                if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > -1431886479 * this.bu.bu || i14 > this.bu.bu * -1431886479 || i15 > this.bu.bu * -1431886479) {
                    this.bu.ad = true;
                }
                if (ctVar.af != null && (short) -1 != ctVar.af[i]) {
                    int i17;
                    int i18;
                    int i19;
                    if (ctVar.ax == null || ctVar.ax[i] == (byte) -1) {
                        i17 = i13;
                        i18 = i12;
                        i19 = i11;
                    } else {
                        i3 = ctVar.ax[i] & 255;
                        i4 = ctVar.ay[i3];
                        i16 = ctVar.ag[i3];
                        i17 = ctVar.ar[i3];
                        i18 = i16;
                        i19 = i4;
                    }
                    if (-1 == ctVar.as[i]) {
                        ((cq) this.bu).at(i2, i7, i9, i10, i14, i15, ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i19], this.af[i18], this.af[i17], this.au[i19], this.au[i18], this.au[i17], this.av[i19], this.av[i18], this.av[i17], ctVar.af[i], 2100201084);
                    } else {
                        ((cq) this.bu).at(i2, i7, i9, i10, i14, i15, this.bb[0], this.bb[1], this.bb[2], this.af[i19], this.af[i18], this.af[i17], this.au[i19], this.au[i18], this.au[i17], this.av[i19], this.av[i18], this.av[i17], ctVar.af[i], 2100201084);
                    }
                } else if (ctVar.as[i] == -1) {
                    ((cq) this.bu).ak(i2, i7, i9, i10, i14, i15, at[ctVar.am[i]], (byte) 68);
                } else {
                    ((cq) this.bu).ao(i2, i7, i9, i10, i14, i15, this.bb[0], this.bb[1], this.bb[2], 583242391);
                }
            }
            if (i8 == 4) {
                if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > this.bu.bu * -1431886479 || i14 > -1431886479 * this.bu.bu || i15 > -1431886479 * this.bu.bu || this.bt[3] < 0 || this.bt[3] > -1431886479 * this.bu.bu) {
                    this.bu.ad = true;
                }
                if (ctVar.af != null && (short) -1 != ctVar.af[i]) {
                    if (ctVar.ax == null || ctVar.ax[i] == (byte) -1) {
                        i8 = i11;
                    } else {
                        i3 = ctVar.ax[i] & 255;
                        i4 = ctVar.ay[i3];
                        i16 = ctVar.ag[i3];
                        i13 = ctVar.ar[i3];
                        i12 = i16;
                        i8 = i4;
                    }
                    short s2 = ctVar.af[i];
                    if (-1 == ctVar.as[i]) {
                        ((cq) this.bu).at(i2, i7, i9, i10, i14, i15, ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i8], this.af[i12], this.af[i13], this.au[i8], this.au[i12], this.au[i13], this.av[i8], this.av[i12], this.av[i13], s2, 2100201084);
                        ((cq) this.bu).at(i2, i9, this.br[3], i10, i15, this.bt[3], ctVar.am[i], ctVar.am[i], ctVar.am[i], this.af[i8], this.af[i12], this.af[i13], this.au[i8], this.au[i12], this.au[i13], this.av[i8], this.av[i12], this.av[i13], s2, 2100201084);
                        return;
                    }
                    ((cq) this.bu).at(i2, i7, i9, i10, i14, i15, this.bb[0], this.bb[1], this.bb[2], this.af[i8], this.af[i12], this.af[i13], this.au[i8], this.au[i12], this.au[i13], this.av[i8], this.av[i12], this.av[i13], s2, 2100201084);
                    ((cq) this.bu).at(i2, i9, this.br[3], i10, i15, this.bt[3], this.bb[0], this.bb[2], this.bb[3], this.af[i8], this.af[i12], this.af[i13], this.au[i8], this.au[i12], this.au[i13], this.av[i8], this.av[i12], this.av[i13], s2, 2100201084);
                } else if (ctVar.as[i] == -1) {
                    i16 = at[ctVar.am[i]];
                    ((cq) this.bu).ak(i2, i7, i9, i10, i14, i15, i16, (byte) 11);
                    ((cq) this.bu).ak(i2, i9, this.br[3], i10, i15, this.bt[3], i16, (byte) 41);
                } else {
                    ((cq) this.bu).ao(i2, i7, i9, i10, i14, i15, this.bb[0], this.bb[1], this.bb[2], 305182796);
                    ((cq) this.bu).ao(i2, i9, this.br[3], i10, i15, this.bt[3], this.bb[0], this.bb[2], this.bb[3], 1676885489);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bx.aa(" + ')');
        }
    }
}
