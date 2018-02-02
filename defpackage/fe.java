package defpackage;

public class fe implements fq {
    static final int ac = 4;
    static final int ad = 200;
    static final int au = 600;
    static int pq;
    public int[] aa;
    int ab;
    boolean ae;
    fz af;
    int ag;
    int ah;
    int ai;
    public fz aj;
    public int[] ak;
    boolean al;
    int am;
    int an;
    long ao;
    public int[] ap;
    int aq;
    boolean as;
    public int[] at;
    int aw;
    public boolean ax;
    boolean az;
    boolean[] bb;
    int bd;
    int bh;
    int[] bo;
    boolean bp;
    long[] bq;
    char[] br;
    int bs;
    int[] bt;
    int bu;
    long bx;
    boolean by;
    int[] bz;

    public static int an(char c, int i, byte b) {
        int i2 = c << 4;
        try {
            if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
                return (Character.toLowerCase(c) << 4) + 1;
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.an(" + ')');
        }
    }

    fe() {
        try {
            this.aj = fz.aj;
            this.an = 0;
            this.aq = 0;
            this.aa = new int[4];
            this.ak = new int[4];
            this.ap = new int[4];
            this.at = new int[4];
            this.ah = -901334585;
            this.ai = 553449665;
            this.aw = 1691900553;
            this.am = -182896371;
            this.ae = false;
            this.as = true;
            this.al = true;
            this.az = true;
            this.ax = false;
            this.af = null;
            this.bp = false;
            this.bh = 0;
            this.bt = new int[cj.ak];
            this.br = new char[cj.ak];
            this.bb = new boolean[cq.dk];
            this.bu = 1339070635;
            this.bd = 1931022511;
            this.bs = 0;
            this.bo = new int[500];
            this.bz = new int[500];
            this.bq = new long[500];
            aj(100, -1814247906);
            ar(352966250);
        } catch (Throwable e) {
            throw ei.ac(e, "fe.<init>(" + ')');
        }
    }

    void aj(int i, int i2) {
        try {
            this.ag = 1470097757 * i;
            al(-673238739);
        } catch (Throwable e) {
            throw ei.ac(e, "fe.aj(" + ')');
        }
    }

    void bp(int i) {
        this.ag = 1470097757 * i;
        al(-673238739);
    }

    void ac(byte b) {
        try {
            this.bd = 1931022511;
            this.bu = 1339070635;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ac(" + ')');
        }
    }

    void be() {
        this.bd = 1931022511;
        this.bu = 1339070635;
    }

    void bm() {
        this.bd = 1931022511;
        this.bu = 1339070635;
    }

    void bw() {
        this.bd = 1931022511;
        this.bu = 1339070635;
    }

    void an(int i, int i2, long j, boolean z, int i3) {
        try {
            this.bu = -1339070635 * i;
            this.bd = -1931022511 * i2;
            this.bx = 6071918361565487509L * j;
            this.by = z;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.an(" + ')');
        }
    }

    void bg(int i, int i2, long j, boolean z) {
        this.bu = -1339070635 * i;
        this.bd = -1931022511 * i2;
        this.bx = 6071918361565487509L * j;
        this.by = z;
    }

    void bn(int i, int i2, long j, boolean z) {
        this.bu = -1339070635 * i;
        this.bd = -1931022511 * i2;
        this.bx = 6071918361565487509L * j;
        this.by = z;
    }

    void aq(int i, int i2, long j) {
        try {
            int i3 = -1725087543 * this.bs;
            if (i3 > 0 && j / 50 == this.bq[i3 - 1] / 50) {
                i3--;
            } else if (i3 >= 500) {
                return;
            }
            this.bo[i3] = i;
            this.bz[i3] = i2;
            this.bq[i3] = j;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.aq(" + ')');
        }
    }

    void bc(int i, int i2, long j) {
        int i3 = -1725087543 * this.bs;
        if (i3 > 0 && j / 50 == this.bq[i3 - 1] / 50) {
            i3--;
        } else if (i3 >= -1264103885) {
            return;
        }
        this.bo[i3] = i;
        this.bz[i3] = i2;
        this.bq[i3] = j;
    }

    void bk(int i, int i2, long j) {
        int i3 = -1725087543 * this.bs;
        if (i3 > 0 && j / 50 == this.bq[i3 - 1] / 50) {
            i3--;
        } else if (i3 >= 500) {
            return;
        }
        this.bo[i3] = i;
        this.bz[i3] = i2;
        this.bq[i3] = j;
    }

    void ao(int i) {
        try {
            this.ai = 553449665;
            this.ah = -901334585;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ao(" + ')');
        }
    }

    void bf() {
        this.ai = -297790273;
        this.ah = -901334585;
    }

    void ae(int i, int i2, int i3) {
        try {
            this.ah = 901334585 * i;
            this.ai = -553449665 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ae(" + ')');
        }
    }

    void bl(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -553449665 * i2;
    }

    void cb(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -1469459637 * i2;
    }

    void cc(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -553449665 * i2;
    }

    void cl(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -1710465383 * i2;
    }

    void co(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -553449665 * i2;
    }

    void cy(int i, int i2) {
        this.ah = 901334585 * i;
        this.ai = -553449665 * i2;
    }

    void as(int i) {
        try {
            this.ah = this.ap[0] * 901334585;
            this.ai = this.at[0] * -553449665;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.as(" + ')');
        }
    }

    void ca() {
        this.ah = this.ap[0] * 638595509;
        this.ai = this.at[0] * 1770200458;
    }

    void cf() {
        this.ah = this.ap[0] * -475030041;
        this.ai = this.at[0] * -553449665;
    }

    void cr() {
        this.ah = this.ap[0] * 901334585;
        this.ai = this.at[0] * -553449665;
    }

    void al(int i) {
        try {
            this.ab = ((935885293 * this.ag) / 200) * 212690411;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.al(" + ')');
        }
    }

    void cp() {
        this.ab = ((-1921994842 * this.ag) / 200) * -956223842;
    }

    void ct() {
        this.ab = ((-2118896315 * this.ag) / 1160681993) * -1658800151;
    }

    void az(int i) {
        try {
            this.bh = 0;
            this.bp = false;
            ac((byte) 18);
            switch (929259841 * this.aj.aw) {
                case 8:
                    au(fz.ai, -878862386);
                    return;
                default:
                    return;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.az(" + ')');
        }
    }

    void ck() {
        this.bh = 0;
        this.bp = false;
        ac((byte) 13);
        switch (929259841 * this.aj.aw) {
            case 8:
                au(fz.ai, -1890094370);
                return;
            default:
                return;
        }
    }

    void cm() {
        this.bh = 0;
        this.bp = false;
        ac((byte) -88);
        switch (929259841 * this.aj.aw) {
            case 8:
                au(fz.ai, -1060149307);
                return;
            default:
                return;
        }
    }

    public void ax(byte b) {
        try {
            this.af = null;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ax(" + ')');
        }
    }

    public void ce() {
        this.af = null;
    }

    public void ch() {
        this.af = null;
    }

    public void ci() {
        this.af = null;
    }

    public void cq() {
        this.af = null;
    }

    void af(fz fzVar, byte b) {
        try {
            if (this.af == null) {
                this.af = fzVar;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.af(" + ')');
        }
    }

    void cg(fz fzVar) {
        if (this.af == null) {
            this.af = fzVar;
        }
    }

    void cu(fz fzVar) {
        if (this.af == null) {
            this.af = fzVar;
        }
    }

    void cv(fz fzVar) {
        if (this.af == null) {
            this.af = fzVar;
        }
    }

    public void au(fz fzVar, int i) {
        try {
            this.aj = fzVar;
            switch (this.aj.aw * 929259841) {
                case 0:
                    if (this.aw * 1774109767 != -1) {
                        ae(this.aw * 1774109767, this.am * -1731935685, 1725285878);
                        this.ap[0] = this.aw * 1774109767;
                        this.at[0] = this.am * -1731935685;
                    } else {
                        ao(1393757659);
                    }
                    ar(-1230365016);
                    return;
                case 10:
                    client.fw = this.ap[0] * 1798259797;
                    client.fx = -993116419 * this.at[0];
                    return;
                default:
                    return;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.au(" + ')');
        }
        throw ei.ac(e, "fe.au(" + ')');
    }

    public void cs(fz fzVar) {
        this.aj = fzVar;
        switch (this.aj.aw * 929259841) {
            case 0:
                if (this.aw * 1774109767 != -1) {
                    ae(this.aw * 1774109767, this.am * -1731935685, 1725285878);
                    this.ap[0] = this.aw * 1774109767;
                    this.at[0] = this.am * -1731935685;
                } else {
                    ao(1257992576);
                }
                ar(-453370843);
                return;
            case 10:
                client.fw = this.ap[0] * 1798259797;
                client.fx = -993116419 * this.at[0];
                return;
            default:
                return;
        }
    }

    public void cx(fz fzVar) {
        this.aj = fzVar;
        switch (this.aj.aw * -1369857483) {
            case 0:
                if (this.aw * 536380680 != -1) {
                    ae(this.aw * 1774109767, this.am * -1731935685, 1725285878);
                    this.ap[0] = this.aw * 1774109767;
                    this.at[0] = 446069395 * this.am;
                } else {
                    ao(2034172994);
                }
                ar(-544892622);
                return;
            case 10:
                client.fw = this.ap[0] * -613031890;
                client.fx = -1370781432 * this.at[0];
                return;
            default:
                return;
        }
    }

    public void av(byte b) {
        try {
            if (fz.ac == this.aj) {
                ao(766179846);
                if (this.ae || this.aq * 1368877215 == 0) {
                    au(fz.an, -1306511993);
                } else if (this.al && 1 == this.aq * 1368877215 && aw.aj((byte) 39) >= 600 + (-6716151842913401307L * this.ao)) {
                    au(fz.aq, -369774827);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.av(" + ')');
        }
    }

    public void cd() {
        if (fz.ac == this.aj) {
            ao(1933337106);
            if (this.ae || this.aq * 1368877215 == 0) {
                au(fz.an, -1136669472);
            } else if (this.al && 1 == this.aq * 1368877215 && aw.aj((byte) -9) >= 600 + (-6716151842913401307L * this.ao)) {
                au(fz.aq, -428836502);
            }
        }
    }

    public void cn() {
        if (fz.ac == this.aj) {
            ao(1443752335);
            if (this.ae || this.aq * 1368877215 == 0) {
                au(fz.an, -157120046);
            } else if (this.al && 1 == this.aq * 1368877215 && aw.aj((byte) -11) >= 600 + (-6716151842913401307L * this.ao)) {
                au(fz.aq, -17987046);
            }
        }
    }

    public void cw() {
        if (fz.ac == this.aj) {
            ao(570583029);
            if (this.ae || this.aq * 1368877215 == 0) {
                au(fz.an, -586468346);
            } else if (this.al && 1 == this.aq * 1368877215 && aw.aj((byte) -9) >= 600 + (-6716151842913401307L * this.ao)) {
                au(fz.aq, -1830609890);
            }
        }
    }

    public void cz() {
        if (fz.ac == this.aj) {
            ao(910348164);
            if (this.ae || this.aq * 1368877215 == 0) {
                au(fz.an, -930742516);
            } else if (this.al && 1 == this.aq * 1368877215 && aw.aj((byte) -63) >= 600 + (-6716151842913401307L * this.ao)) {
                au(fz.aq, -1894138722);
            }
        }
    }

    public void ay(byte b) {
        try {
            au(fz.aq, -867567887);
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ay(" + ')');
        }
    }

    public void cj() {
        au(fz.aq, -1380893273);
    }

    public void ag(short s) {
        try {
            if (fz.aq == this.aj) {
                au(fz.ai, -172316765);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ag(" + ')');
        }
    }

    public void da() {
        if (fz.aq == this.aj) {
            au(fz.ai, -168872714);
        }
    }

    public void di() {
        if (fz.aq == this.aj) {
            au(fz.ai, -422425002);
        }
    }

    void ar(int i) {
        try {
            if (1368877215 * this.aq == 0) {
                this.aj = fz.aj;
                this.af = null;
                this.an = 0;
                ad(889727047);
                if (-1 != this.aw * 1774109767) {
                    this.ap[0] = this.aw * 1774109767;
                    this.at[0] = -1731935685 * this.am;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ar(" + ')');
        }
    }

    void dv() {
        if (1368877215 * this.aq == 0) {
            this.aj = fz.aj;
            this.af = null;
            this.an = 0;
            ad(889727047);
            if (-1 != this.aw * 933408975) {
                this.ap[0] = -1100848973 * this.aw;
                this.at[0] = -1731935685 * this.am;
            }
        }
    }

    void dw() {
        if (1368877215 * this.aq == 0) {
            this.aj = fz.aj;
            this.af = null;
            this.an = 0;
            ad(889727047);
            if (-1 != this.aw * 1774109767) {
                this.ap[0] = this.aw * 1774109767;
                this.at[0] = -1731935685 * this.am;
            }
        }
    }

    void ad(int i) {
        int i2 = 0;
        while (i2 < 4) {
            try {
                int[] iArr = this.aa;
                this.ak[i2] = -1;
                iArr[i2] = -1;
                iArr = this.ap;
                this.at[i2] = -1;
                iArr[i2] = -1;
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "fe.ad(" + ')');
            }
        }
    }

    void dq() {
        for (int i = 0; i < 4; i++) {
            int[] iArr = this.aa;
            this.ak[i] = -1;
            iArr[i] = -1;
            iArr = this.ap;
            this.at[i] = -1;
            iArr[i] = -1;
        }
    }

    void dt() {
        for (int i = 0; i < 4; i++) {
            int[] iArr = this.aa;
            this.ak[i] = -1;
            iArr[i] = -1;
            iArr = this.ap;
            this.at[i] = -1;
            iArr[i] = -1;
        }
    }

    public boolean at(int i, int i2, int i3, int i4, long j) {
        if (i < 4) {
            if (i <= this.an * -525969021) {
                try {
                    if (i == this.an * -525969021) {
                        if (i == 0) {
                            this.ao = aw.aj((byte) 78) * -2487807437542201939L;
                        }
                        this.an -= 1356956373;
                        this.aa[i] = i3;
                        this.ak[i] = i4;
                    }
                    this.aq += 1337439071;
                    this.ap[i] = i3;
                    this.at[i] = i4;
                    if (i == 0) {
                        this.bp = true;
                        switch (929259841 * this.aj.aw) {
                            case 3:
                                if (i2 != 4 || !gd.bs) {
                                    boolean z;
                                    ae(i3, i4, 1725285878);
                                    if (2 == i2) {
                                        au(fz.aq, -1541820078);
                                    } else {
                                        au(fz.ac, -66861344);
                                    }
                                    if (2 == i2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    an(i3, i4, j, z, -2019889590);
                                    break;
                                }
                                au(fz.at, -357667422);
                                break;
                                break;
                            case 5:
                                if (this.ax) {
                                    au(fz.ao, -1211723736);
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    } else if (i == 1) {
                        au(fz.at, -1069295290);
                    }
                } catch (Throwable e) {
                    throw ei.ac(e, "fe.at(" + ')');
                }
            }
        }
        return true;
    }

    public boolean by(int i, int i2, int i3, int i4, long j) {
        if (i < 4) {
            if (i <= this.an * -525969021) {
                if (i == this.an * -525969021) {
                    if (i == 0) {
                        this.ao = aw.aj((byte) -12) * -2487807437542201939L;
                    }
                    this.an -= 1356956373;
                    this.aa[i] = i3;
                    this.ak[i] = i4;
                }
                this.aq += 1337439071;
                this.ap[i] = i3;
                this.at[i] = i4;
                if (i == 0) {
                    this.bp = true;
                    switch (929259841 * this.aj.aw) {
                        case 3:
                            if (i2 != 4 || !gd.bs) {
                                boolean z;
                                ae(i3, i4, 1725285878);
                                if (2 == i2) {
                                    au(fz.aq, -1276655195);
                                } else {
                                    au(fz.ac, -1984809238);
                                }
                                if (2 == i2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                an(i3, i4, j, z, -1799001172);
                                break;
                            }
                            au(fz.at, -2141359451);
                            break;
                        case 5:
                            if (this.ax) {
                                au(fz.ao, -879319172);
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                } else if (i == 1) {
                    au(fz.at, -1780084189);
                }
            }
        }
        return true;
    }

    public boolean ah(int i, int i2, int i3, int i4, long j) {
        if (i < 4) {
            if (this.aq * 1368877215 != 0) {
                this.aq -= 1337439071;
                if (this.aq * 1368877215 == 0) {
                    switch (929259841 * this.aj.aw) {
                        case 0:
                            ar(-454100450);
                            break;
                        case 1:
                            au(fz.ai, -1904210549);
                            break;
                        case 4:
                            au(fz.ak, -2018770441);
                            break;
                        case 5:
                            try {
                                if (this.az && this.ax) {
                                    au(fz.an, -263857255);
                                    break;
                                }
                            } catch (Throwable e) {
                                throw ei.ac(e, "fe.ah(" + ')');
                            }
                        case 6:
                            au(fz.an, -1028850513);
                            break;
                        case 9:
                            au(fz.an, -1826808937);
                            break;
                        case 10:
                            au(fz.ai, -961574125);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean bx(int i, int i2, int i3, int i4, long j) {
        if (i < 4) {
            if (this.aq * 1368877215 != 0) {
                this.aq -= 1337439071;
                if (this.aq * 1368877215 == 0) {
                    switch (929259841 * this.aj.aw) {
                        case 0:
                            ar(693629539);
                            break;
                        case 1:
                            au(fz.ai, -812215369);
                            break;
                        case 4:
                            au(fz.ak, -729201380);
                            break;
                        case 5:
                            if (this.az && this.ax) {
                                au(fz.an, -2042429332);
                                break;
                            }
                        case 6:
                            au(fz.an, -776590174);
                            break;
                        case 9:
                            au(fz.an, -715297886);
                            break;
                        case 10:
                            au(fz.ai, -293105510);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean ai(int i, int i2, int i3, long j) {
        if (i < 4) {
            long aj = aw.aj((byte) 11);
            int i4 = this.at[i];
            this.ap[i] = i2;
            this.at[i] = i3;
            if (i == 0) {
                aq(i2, i3, j);
                if (this.an * -525969021 == 1 && aj >= (this.ao * -6716151842913401307L) + 100) {
                    int i5 = this.aa[0];
                    int i6 = this.ak[0];
                    if (i2 < i5 - (this.ab * 1725209283) || i2 > i5 + (this.ab * 1725209283) || i3 < i6 - (this.ab * 1725209283) || i3 > (this.ab * 1725209283) + i6) {
                        switch (929259841 * this.aj.aw) {
                            case 1:
                                client.kg = (i3 - i4) * 872182197;
                                break;
                            case 6:
                                au(this.af != null ? this.af : fz.aa, -1236424427);
                                break;
                            case 9:
                                try {
                                    au(fz.ai, -589942052);
                                    break;
                                } catch (Throwable e) {
                                    throw ei.ac(e, "fe.ai(" + ')');
                                }
                            default:
                                break;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean bi(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        long aj = aw.aj((byte) -27);
        int i4 = this.at[i];
        this.ap[i] = i2;
        this.at[i] = i3;
        if (i == 0) {
            aq(i2, i3, j);
            if (this.an * -525969021 == 1 && aj >= (this.ao * -6716151842913401307L) + 100) {
                int i5 = this.aa[0];
                int i6 = this.ak[0];
                if (i2 < i5 - (this.ab * 1725209283) || i2 > i5 + (this.ab * 1725209283) || i3 < i6 - (1725209283 * this.ab) || i3 > (1725209283 * this.ab) + i6) {
                    switch (929259841 * this.aj.aw) {
                        case 1:
                            client.kg = (i3 - i4) * 872182197;
                            break;
                        case 6:
                            fz fzVar;
                            if (this.af != null) {
                                fzVar = this.af;
                            } else {
                                fzVar = fz.aa;
                            }
                            au(fzVar, -1857014071);
                            break;
                        case 9:
                            au(fz.ai, -2083216418);
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean bo(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        long aj = aw.aj((byte) 111);
        int i4 = this.at[i];
        this.ap[i] = i2;
        this.at[i] = i3;
        if (i == 0) {
            aq(i2, i3, j);
            if (this.an * -525969021 == 1 && aj >= (this.ao * -6716151842913401307L) + 100) {
                int i5 = this.aa[0];
                int i6 = this.ak[0];
                if (i2 < i5 - (this.ab * 1725209283) || i2 > i5 + (this.ab * 1725209283) || i3 < i6 - (1725209283 * this.ab) || i3 > (1725209283 * this.ab) + i6) {
                    switch (929259841 * this.aj.aw) {
                        case 1:
                            client.kg = (i3 - i4) * 872182197;
                            break;
                        case 6:
                            au(this.af != null ? this.af : fz.aa, -1178575780);
                            break;
                        case 9:
                            au(fz.ai, -56591811);
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean bs(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        long aj = aw.aj((byte) 68);
        int i4 = this.at[i];
        this.ap[i] = i2;
        this.at[i] = i3;
        if (i == 0) {
            aq(i2, i3, j);
            if (this.an * -525969021 == 1 && aj >= (this.ao * -6716151842913401307L) + 100) {
                int i5 = this.aa[0];
                int i6 = this.ak[0];
                if (i2 < i5 - (this.ab * 1725209283) || i2 > i5 + (this.ab * 1725209283) || i3 < i6 - (1725209283 * this.ab) || i3 > (1725209283 * this.ab) + i6) {
                    switch (929259841 * this.aj.aw) {
                        case 1:
                            client.kg = (i3 - i4) * 872182197;
                            break;
                        case 6:
                            fz fzVar;
                            if (this.af != null) {
                                fzVar = this.af;
                            } else {
                                fzVar = fz.aa;
                            }
                            au(fzVar, -2100336679);
                            break;
                        case 9:
                            au(fz.ai, -257056260);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean aw(int i, int i2, long j) {
        return true;
    }

    public boolean bq(int i, int i2, long j) {
        return true;
    }

    public boolean bz(int i, int i2, long j) {
        return true;
    }

    public boolean aa(int i, long j) {
        try {
            if (this.bh * -1829911127 < this.bt.length) {
                this.bt[this.bh * -1829911127] = i;
                this.br[this.bh * -1829911127] = '\u0000';
                this.bh += 1454157465;
            }
            this.bb[i] = true;
            if (240624837 * client.ia >= 2 && 66 == i && this.bb[82]) {
                cb.bb(1583776961);
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.aa(" + ')');
        }
    }

    public boolean bh(int i, long j) {
        if (this.bh * -1829911127 < this.bt.length) {
            this.bt[this.bh * -1829911127] = i;
            this.br[this.bh * -1829911127] = '\u0000';
            this.bh += 1454157465;
        }
        this.bb[i] = true;
        if (240624837 * client.ia >= 2 && 66 == i && this.bb[82]) {
            cb.bb(1603537221);
        }
        return true;
    }

    public boolean ak(int i, long j) {
        try {
            this.bb[i] = false;
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ak(" + ')');
        }
    }

    public boolean bb(int i, long j) {
        this.bb[i] = false;
        return true;
    }

    public boolean br(int i, long j) {
        this.bb[i] = false;
        return true;
    }

    public boolean bt(int i, long j) {
        this.bb[i] = false;
        return true;
    }

    public boolean bu(int i, long j) {
        this.bb[i] = false;
        return true;
    }

    public boolean ap(char c, long j) {
        try {
            if (this.bh * -1829911127 < this.bt.length) {
                this.bt[this.bh * -1829911127] = -1;
                this.br[this.bh * -1829911127] = c;
                this.bh += 1454157465;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ap(" + ')');
        }
    }

    public boolean bd(char c, long j) {
        if (-582904595 * this.bh < this.bt.length) {
            this.bt[-1829911127 * this.bh] = -1;
            this.br[1110665912 * this.bh] = c;
            this.bh += 1918841144;
        }
        return true;
    }

    public boolean am(int i, long j) {
        return true;
    }

    public boolean ba(int i, long j) {
        return true;
    }

    public boolean bj(int i, long j) {
        return true;
    }

    public boolean bv(int i, long j) {
        return true;
    }

    public boolean ab(int i, int i2) {
        try {
            return this.bb[i];
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ab(" + ')');
        }
    }

    public boolean do(int i) {
        return this.bb[i];
    }

    static final boolean ax(int i, int i2, byte b) {
        try {
            int i3;
            ah ac = ey.ac(i, -147389);
            if (i2 == 11) {
                i3 = 10;
            } else {
                i3 = i2;
            }
            if (i3 >= 5 && i3 <= 8) {
                i3 = 4;
            }
            return ac.aa(i3, (byte) -86);
        } catch (Throwable e) {
            throw ei.ac(e, "fe.ax(" + ')');
        }
    }

    static final void cp(boolean z, int i) {
        int i2 = 0;
        while (i2 < client.dk * 1886016257) {
            try {
                ci ciVar = client.cj[client.dh[i2]];
                int i3 = (client.dh[i2] << 14) + dd.ak;
                if (ciVar != null && ciVar.an(-1483612809) && ciVar.aj.ab == z && ciVar.aj.ap(1714114154)) {
                    int i4 = (ciVar.br * 1948391561) >> 7;
                    int i5 = (ciVar.bb * -1461980333) >> 7;
                    if (i4 >= 0 && i4 < ez.cz && i5 >= 0 && i5 < ez.cz) {
                        if (1 == ciVar.bd * -861657129 && 64 == ((ciVar.br * 1948391561) & 127) && 64 == ((ciVar.bb * -1461980333) & 127)) {
                            if (client.go[i4][i5] != -2113422841 * client.gx) {
                                client.go[i4][i5] = client.gx * -2113422841;
                            }
                        }
                        if (!ciVar.aj.bd) {
                            i3 -= Integer.MIN_VALUE;
                        }
                        ci.el.aw(-2005147175 * lw.hn, ciVar.br * 1948391561, ciVar.bb * -1461980333, fb.cv(((ciVar.bd * 688518592) - 64) + (1948391561 * ciVar.br), (-1461980333 * ciVar.bb) + ((688518592 * ciVar.bd) - 64), lw.hn * -2005147175, 447871079), ((ciVar.bd * 688518592) - 64) + 60, ciVar, -603732529 * ciVar.bu, i3, ciVar.an);
                    }
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "fe.cp(" + ')');
            }
        }
    }
}
