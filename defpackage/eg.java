package defpackage;

public abstract class eg extends ew {
    static String al = null;
    static final int bi = 38;
    static final int lz = 1536;
    protected ba ac;
    protected fn aj;
    protected eo an;
    protected cb aq;

    protected eg() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "eg.<init>(" + ')');
        }
    }

    public es ah() {
        return this.aj;
    }

    public es m2aj(byte b) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "eg.aj(" + ')');
        }
    }

    public es at() {
        return this.aj;
    }

    bl ac(byte b) {
        try {
            return this.ac;
        } catch (Throwable e) {
            throw ei.ac(e, "eg.ac(" + ')');
        }
    }

    bl ai() {
        return this.ac;
    }

    bl aw() {
        return this.ac;
    }

    public ce am() {
        return this.aq;
    }

    public ce an(byte b) {
        try {
            return this.aq;
        } catch (Throwable e) {
            throw ei.ac(e, "eg.an(" + ')');
        }
    }

    public static cd[] aj(byte b) {
        try {
            return new cd[]{cd.ae, cd.at, cd.ah, cd.aa, cd.ao, cd.as, cd.ap, cd.ak, cd.aj, cd.aw, cd.ac, cd.an, cd.ai, cd.aq, cd.al, cd.am};
        } catch (Throwable e) {
            throw ei.ac(e, "eg.aj(" + ')');
        }
    }

    public void ae(int i, int i2) {
        this.an.ae(i, i2, -1791986359);
        this.aj.ef(this.an.an, i, i2, -2118602412);
    }

    public void aq(int i, int i2, int i3) {
        try {
            this.an.ae(i, i2, -640881720);
            this.aj.ef(this.an.an, i, i2, -1975733922);
        } catch (Throwable e) {
            throw ei.ac(e, "eg.aq(" + ')');
        }
    }

    public void as(int i, int i2) {
        this.an.ae(i, i2, 725227809);
        this.aj.ef(this.an.an, i, i2, -1215122341);
    }

    public void aa(int i, int i2, int i3, int i4, int i5) {
        try {
            this.an.az(i, i2, i3, i4, -38307927);
        } catch (Throwable e) {
            throw ei.ac(e, "eg.aa(" + ')');
        }
    }

    public void af(int i, int i2, int i3, int i4) {
        this.an.az(i, i2, i3, i4, -38307927);
    }

    public void ak(int i, int i2, byte b) {
        try {
            this.an.al(i, i2, (byte) 37);
            this.aj.ef(this.an.an, this.an.ac(-214589799), this.an.an(-2045942174), 770862604);
        } catch (Throwable e) {
            throw ei.ac(e, "eg.ak(" + ')');
        }
    }

    public void au(int i, int i2) {
        this.an.al(i, i2, (byte) 51);
        this.aj.ef(this.an.an, this.an.ac(-2129144880), this.an.an(-1471317976), 262498364);
    }

    public void av(int i, int i2) {
        this.an.al(i, i2, (byte) 86);
        this.aj.ef(this.an.an, this.an.ac(-944165020), this.an.an(-2120935533), -2055337027);
    }

    public void ag() {
        this.an.aj(995208257).aa(-401924967);
    }

    public void ap(int i) {
        try {
            this.an.aj(995208257).aa(-401924967);
        } catch (Throwable e) {
            throw ei.ac(e, "eg.ap(" + ')');
        }
    }

    public void ar() {
        this.an.aj(995208257).aa(-401924967);
    }

    public void ay() {
        this.an.aj(995208257).aa(-401924967);
    }

    static void ab(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte b) {
        int i11 = -i7;
        int i12 = i4;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i10 * (i3 >> 16);
            int i15 = i13;
            i13 = i12;
            i12 = -i6;
            while (i12 < 0) {
                try {
                    int i16;
                    int i17 = iArr2[(i15 >> 16) + i14];
                    if (i17 != 0) {
                        i16 = i13 + 1;
                        iArr[i13] = i17;
                    } else {
                        i16 = i13 + 1;
                    }
                    i12++;
                    i15 += i8;
                    i13 = i16;
                } catch (Throwable e) {
                    throw ei.ac(e, "eg.ab(" + ')');
                }
            }
            i3 += i9;
            i12 = i13 + i5;
            i11++;
            i13 = i2;
        }
    }

    static int aa(int i, fs fsVar, boolean z, int i2) {
        ab aj;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = gr.ak;
                int i3 = dy.ap - -401924967;
                dy.ap = i3;
                aj = ac.aj(iArr[i3 * -38307927], 574616875);
            } catch (Throwable e) {
                throw ei.ac(e, "eg.aa(" + ')');
            }
        }
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        aj = abVar;
        cf.ew(aj, (byte) -92);
        if (1200 == i || 1205 == i || 1212 == i) {
            dy.ap -= -803849934;
            int i4 = gr.ak[dy.ap * -38307927];
            i3 = gr.ak[(dy.ap * -38307927) + 1];
            aj.fq = 651140467 * i4;
            aj.fz = i3 * -1904683731;
            av ac = al.ac(i4, (short) -2333);
            aj.cv = -71755161 * ac.ad;
            aj.cu = ac.ab * 596391345;
            aj.cg = ac.bp * -1596931321;
            aj.ci = ac.bm * 789014361;
            aj.cq = ac.bh * 950475855;
            aj.cs = ac.ar * -1423420911;
            if (1205 == i) {
                aj.cn = 0;
            } else {
                if (1212 == i) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (1 == ac.bt * -559602733) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if ((i4 | i3) != 0) {
                    aj.cn = 1483560199;
                } else {
                    aj.cn = -1327846898;
                }
            }
            if (1521283651 * aj.cx > 0) {
                aj.cs = ((544358304 * aj.cs) / (1521283651 * aj.cx)) * -2004757675;
            } else if (-702574163 * aj.bh > 0) {
                aj.cs = ((544358304 * aj.cs) / (aj.bh * -702574163)) * -2004757675;
            }
            return 1;
        } else if (1201 == i) {
            aj.cp = -140240738;
            iArr = gr.ak;
            int i5 = dy.ap - -401924967;
            dy.ap = i5;
            aj.ct = iArr[i5 * -38307927] * -1320879157;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            aj.cp = -210361107;
            aj.ct = cx.hb.ac.at(-1376689613) * -1320879157;
            return 1;
        }
    }
}
