package defpackage;

public class ia extends iu {
    int aa;
    int ac;
    int ae;
    int ah;
    boolean ai;
    int aj;
    int ak;
    int am;
    int an;
    int ao;
    int ap;
    int aq;
    int as;
    int at;
    int aw;

    static int aj(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    static int ca(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    static int cf(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    static int cr(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    static int ac(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int cm(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int cp(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int ct(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    int bs() {
        int i = (this.ao * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ap == 0 ? i2 - ((i2 * this.aj) / (((ij) this.ax).an.length << 8)) : this.ap >= 0 ? i2 - ((i2 * this.at) / ((ij) this.ax).an.length) : i2;
        return i > 255 ? 255 : i;
    }

    int ce() {
        int i = (this.ao * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.ap == 0 ? i2 - ((i2 * this.aj) / (((ij) this.ax).an.length << 8)) : this.ap >= 0 ? i2 - ((i2 * this.at) / ((ij) this.ax).an.length) : i2;
        if (i > -1897179885) {
            return 255;
        }
        return i;
    }

    int ck() {
        int i = (this.ao * 3) >> 6;
        int i2 = ((i >> -152164299) ^ i) + (i >>> -308197725);
        i = this.ap == 0 ? i2 - ((i2 * this.aj) / (((ij) this.ax).an.length << 8)) : this.ap >= 0 ? i2 - ((i2 * this.at) / ((ij) this.ax).an.length) : i2;
        return i > -1385462730 ? 255 : i;
    }

    ia(ij ijVar, int i, int i2) {
        this.ax = ijVar;
        this.at = ijVar.aq;
        this.ah = ijVar.ao;
        this.ai = ijVar.aa;
        this.ac = i;
        this.an = i2;
        this.aq = 8192;
        this.aj = 0;
        ao();
    }

    ia(ij ijVar, int i, int i2, int i3) {
        this.ax = ijVar;
        this.at = ijVar.aq;
        this.ah = ijVar.ao;
        this.ai = ijVar.aa;
        this.ac = i;
        this.an = i2;
        this.aq = i3;
        this.aj = 0;
        ao();
    }

    public static ia an(ij ijVar, int i, int i2) {
        return (ijVar.an == null || ijVar.an.length == 0) ? null : new ia(ijVar, (int) (((((long) ijVar.ac) * 256) * ((long) i)) / ((long) (in.aj * 1513227020))), i2 << 6);
    }

    public static ia ch(ij ijVar, int i, int i2) {
        if (ijVar.an == null || ijVar.an.length == 0) {
            return null;
        }
        return new ia(ijVar, (int) (((((long) ijVar.ac) * 256) * ((long) i)) / ((long) (in.aj * 1513227020))), i2 << 6);
    }

    public static ia aq(ij ijVar, int i, int i2, int i3) {
        if (ijVar.an == null || ijVar.an.length == 0) {
            return null;
        }
        return new ia(ijVar, i, i2, i3);
    }

    public static ia ci(ij ijVar, int i, int i2, int i3) {
        return (ijVar.an == null || ijVar.an.length == 0) ? null : new ia(ijVar, i, i2, i3);
    }

    public static ia cq(ij ijVar, int i, int i2, int i3) {
        if (ijVar.an == null || ijVar.an.length == 0) {
            return null;
        }
        return new ia(ijVar, i, i2, i3);
    }

    public static ia cu(ij ijVar, int i, int i2, int i3) {
        return (ijVar.an == null || ijVar.an.length == 0) ? null : new ia(ijVar, i, i2, i3);
    }

    public static ia cv(ij ijVar, int i, int i2, int i3) {
        if (ijVar.an == null || ijVar.an.length == 0) {
            return null;
        }
        return new ia(ijVar, i, i2, i3);
    }

    void ao() {
        this.ao = this.an;
        this.aa = ia.aj(this.an, this.aq);
        this.ak = ia.ac(this.an, this.aq);
    }

    void cg() {
        this.ao = this.an;
        this.aa = ia.aj(this.an, this.aq);
        this.ak = ia.ac(this.an, this.aq);
    }

    void cs() {
        this.ao = this.an;
        this.aa = ia.aj(this.an, this.aq);
        this.ak = ia.ac(this.an, this.aq);
    }

    void cx() {
        this.ao = this.an;
        this.aa = ia.aj(this.an, this.aq);
        this.ak = ia.ac(this.an, this.aq);
    }

    public synchronized void ah(int i) {
        this.ap = i;
    }

    public synchronized void cd(int i) {
        this.ap = i;
    }

    public synchronized void aw(int i) {
        ae(i << 6, al());
    }

    public synchronized void cw(int i) {
        ae(i << 6, al());
    }

    synchronized void am(int i) {
        ae(i, al());
    }

    synchronized void cn(int i) {
        ae(i, al());
    }

    synchronized void ae(int i, int i2) {
        this.an = i;
        this.aq = i2;
        this.aw = 0;
        ao();
    }

    synchronized void cj(int i, int i2) {
        this.an = i;
        this.aq = i2;
        this.aw = 0;
        ao();
    }

    synchronized void cz(int i, int i2) {
        this.an = i;
        this.aq = i2;
        this.aw = 0;
        ao();
    }

    synchronized void da(int i, int i2) {
        this.an = i;
        this.aq = i2;
        this.aw = 0;
        ao();
    }

    synchronized void di(int i, int i2) {
        this.an = i;
        this.aq = i2;
        this.aw = 0;
        ao();
    }

    public synchronized int as() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int dq() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int dt() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int dv() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int dw() {
        return this.an == Integer.MIN_VALUE ? 0 : this.an;
    }

    public synchronized int al() {
        return this.aq < 0 ? -1 : this.aq;
    }

    public synchronized int dj() {
        return this.aq < 0 ? -1 : this.aq;
    }

    public synchronized int do() {
        return this.aq < 0 ? -1 : this.aq;
    }

    public synchronized int dz() {
        return this.aq < 0 ? -1 : this.aq;
    }

    public synchronized void az(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ij) this.ax).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.aj = length;
        }
    }

    public synchronized void dg(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ij) this.ax).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.aj = length;
        }
    }

    public synchronized void dm(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ij) this.ax).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.aj = length;
        }
    }

    public synchronized void dn(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ij) this.ax).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.aj = length;
        }
    }

    public synchronized void du(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ij) this.ax).an.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.aj = length;
        }
    }

    public synchronized void ax(boolean z) {
        this.ac = (this.ac ^ (this.ac >> 31)) + (this.ac >>> 31);
        if (z) {
            this.ac = -this.ac;
        }
    }

    public synchronized void df(boolean z) {
        this.ac = (this.ac ^ (this.ac >> 31)) + (this.ac >>> 31);
        if (z) {
            this.ac = -this.ac;
        }
    }

    void af() {
        if (this.aw != 0) {
            if (this.an == Integer.MIN_VALUE) {
                this.an = 0;
            }
            this.aw = 0;
            ao();
        }
    }

    void dc() {
        if (this.aw != 0) {
            if (this.an == 1118819520) {
                this.an = 0;
            }
            this.aw = 0;
            ao();
        }
    }

    void dy() {
        if (this.aw != 0) {
            if (this.an == Integer.MIN_VALUE) {
                this.an = 0;
            }
            this.aw = 0;
            ao();
        }
    }

    public synchronized void au(int i, int i2) {
        av(i, i2, al());
    }

    public synchronized void ei(int i, int i2) {
        av(i, i2, al());
    }

    public synchronized void av(int i, int i2, int i3) {
        if (i == 0) {
            ae(i2, i3);
        } else {
            int aj = ia.aj(i2, i3);
            int ac = ia.ac(i2, i3);
            if (this.aa == aj && this.ak == ac) {
                this.aw = 0;
            } else {
                int i4 = i2 - this.ao;
                if (this.ao - i2 > i4) {
                    i4 = this.ao - i2;
                }
                if (aj - this.aa > i4) {
                    i4 = aj - this.aa;
                }
                if (this.aa - aj > i4) {
                    i4 = this.aa - aj;
                }
                if (ac - this.ak > i4) {
                    i4 = ac - this.ak;
                }
                if (this.ak - ac > i4) {
                    i4 = this.ak - ac;
                }
                if (i > i4) {
                    i = i4;
                }
                this.aw = i;
                this.an = i2;
                this.aq = i3;
                this.am = (i2 - this.ao) / i;
                this.ae = (aj - this.aa) / i;
                this.as = (ac - this.ak) / i;
            }
        }
    }

    public synchronized void eq(int i, int i2, int i3) {
        if (i == 0) {
            ae(i2, i3);
        } else {
            int aj = ia.aj(i2, i3);
            int ac = ia.ac(i2, i3);
            if (this.aa == aj && this.ak == ac) {
                this.aw = 0;
            } else {
                int i4 = i2 - this.ao;
                if (this.ao - i2 > i4) {
                    i4 = this.ao - i2;
                }
                if (aj - this.aa > i4) {
                    i4 = aj - this.aa;
                }
                if (this.aa - aj > i4) {
                    i4 = this.aa - aj;
                }
                if (ac - this.ak > i4) {
                    i4 = ac - this.ak;
                }
                if (this.ak - ac > i4) {
                    i4 = this.ak - ac;
                }
                if (i > i4) {
                    i = i4;
                }
                this.aw = i;
                this.an = i2;
                this.aq = i3;
                this.am = (i2 - this.ao) / i;
                this.ae = (aj - this.aa) / i;
                this.as = (ac - this.ak) / i;
            }
        }
    }

    public synchronized void eu(int i, int i2, int i3) {
        if (i == 0) {
            ae(i2, i3);
        } else {
            int aj = ia.aj(i2, i3);
            int ac = ia.ac(i2, i3);
            if (this.aa == aj && this.ak == ac) {
                this.aw = 0;
            } else {
                int i4 = i2 - this.ao;
                if (this.ao - i2 > i4) {
                    i4 = this.ao - i2;
                }
                if (aj - this.aa > i4) {
                    i4 = aj - this.aa;
                }
                if (this.aa - aj > i4) {
                    i4 = this.aa - aj;
                }
                if (ac - this.ak > i4) {
                    i4 = ac - this.ak;
                }
                if (this.ak - ac > i4) {
                    i4 = this.ak - ac;
                }
                if (i > i4) {
                    i = i4;
                }
                this.aw = i;
                this.an = i2;
                this.aq = i3;
                this.am = (i2 - this.ao) / i;
                this.ae = (aj - this.aa) / i;
                this.as = (ac - this.ak) / i;
            }
        }
    }

    public synchronized void bm(int i) {
        if (i == 0) {
            am(0);
            kn();
        } else if (this.aa == 0 && this.ak == 0) {
            this.aw = 0;
            this.an = 0;
            this.ao = 0;
            kn();
        } else {
            int i2 = -this.ao;
            if (this.ao > i2) {
                i2 = this.ao;
            }
            if ((-this.aa) > i2) {
                i2 = -this.aa;
            }
            if (this.aa > i2) {
                i2 = this.aa;
            }
            if ((-this.ak) > i2) {
                i2 = -this.ak;
            }
            if (this.ak > i2) {
                i2 = this.ak;
            }
            if (i > i2) {
                i = i2;
            }
            this.aw = i;
            this.an = Integer.MIN_VALUE;
            this.am = (-this.ao) / i;
            this.ae = (-this.aa) / i;
            this.as = (-this.ak) / i;
        }
    }

    public synchronized void ep(int i) {
        if (i == 0) {
            am(0);
            kn();
        } else if (this.aa == 0 && this.ak == 0) {
            this.aw = 0;
            this.an = 0;
            this.ao = 0;
            kn();
        } else {
            int i2 = -this.ao;
            if (this.ao > i2) {
                i2 = this.ao;
            }
            if ((-this.aa) > i2) {
                i2 = -this.aa;
            }
            if (this.aa > i2) {
                i2 = this.aa;
            }
            if ((-this.ak) > i2) {
                i2 = -this.ak;
            }
            if (this.ak > i2) {
                i2 = this.ak;
            }
            if (i > i2) {
                i = i2;
            }
            this.aw = i;
            this.an = Integer.MIN_VALUE;
            this.am = (-this.ao) / i;
            this.ae = (-this.aa) / i;
            this.as = (-this.ak) / i;
        }
    }

    public synchronized void bh(int i) {
        if (this.ac < 0) {
            this.ac = -i;
        } else {
            this.ac = i;
        }
    }

    public synchronized void ej(int i) {
        if (this.ac < 0) {
            this.ac = -i;
        } else {
            this.ac = i;
        }
    }

    public synchronized int bt() {
        return this.ac < 0 ? -this.ac : this.ac;
    }

    public synchronized int eb() {
        return this.ac < 0 ? -this.ac : this.ac;
    }

    public synchronized int eh() {
        return this.ac < 0 ? -this.ac : this.ac;
    }

    public synchronized int ek() {
        return this.ac < 0 ? -this.ac : this.ac;
    }

    public boolean bd() {
        return this.aj < 0 || this.aj >= (((ij) this.ax).an.length << 8);
    }

    public boolean el() {
        return this.aj < 0 || this.aj >= (((ij) this.ax).an.length << 8);
    }

    public boolean ey() {
        return this.aj < 0 || this.aj >= (((ij) this.ax).an.length << 8);
    }

    public boolean ez() {
        return this.aj < 0 || this.aj >= (((ij) this.ax).an.length << 8);
    }

    public boolean by() {
        return this.aw != 0;
    }

    public boolean ed() {
        return this.aw != 0;
    }

    public boolean ex() {
        return this.aw != 0;
    }

    protected iu aa() {
        return null;
    }

    protected iu bi() {
        return null;
    }

    protected iu bx() {
        return null;
    }

    protected iu ag() {
        return null;
    }

    protected iu ak() {
        return null;
    }

    protected iu ay() {
        return null;
    }

    protected int ab() {
        if (this.an == 0 && this.aw == 0) {
            return 0;
        }
        return 1;
    }

    protected int ad() {
        if (this.an == 0 && this.aw == 0) {
            return 0;
        }
        return 1;
    }

    protected int ap() {
        if (this.an == 0 && this.aw == 0) {
            return 0;
        }
        return 1;
    }

    protected int ar() {
        return (this.an == 0 && this.aw == 0) ? 0 : 1;
    }

    public synchronized void at(int[] r16, int r17, int r18) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r15 = this;
        monitor-enter(r15);
        r1 = r15.an;	 Catch:{ all -> 0x00cc }
        if (r1 != 0) goto L_0x002a;	 Catch:{ all -> 0x00cc }
    L_0x0005:
        r1 = r15.aw;	 Catch:{ all -> 0x00cc }
        if (r1 != 0) goto L_0x002a;	 Catch:{ all -> 0x00cc }
    L_0x0009:
        r0 = r18;	 Catch:{ all -> 0x00cc }
        r15.ai(r0);	 Catch:{ all -> 0x00cc }
    L_0x000e:
        monitor-exit(r15);
        return;
    L_0x0010:
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 % r14;	 Catch:{ all -> 0x00cc }
        r1 = r1 + r4;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
    L_0x0017:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r11 = r1[r2];	 Catch:{ all -> 0x00cc }
        r6 = r15;	 Catch:{ all -> 0x00cc }
        r7 = r16;	 Catch:{ all -> 0x00cc }
        r10 = r5;	 Catch:{ all -> 0x00cc }
        r8 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r9) goto L_0x0010;	 Catch:{ all -> 0x00cc }
    L_0x0029:
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x002a:
        r1 = r15.ax;	 Catch:{ all -> 0x00cc }
        r0 = r1;	 Catch:{ all -> 0x00cc }
        r0 = (defpackage.ij) r0;	 Catch:{ all -> 0x00cc }
        r12 = r0;	 Catch:{ all -> 0x00cc }
        r1 = r15.at;	 Catch:{ all -> 0x00cc }
        r4 = r1 << 8;	 Catch:{ all -> 0x00cc }
        r1 = r15.ah;	 Catch:{ all -> 0x00cc }
        r9 = r1 << 8;	 Catch:{ all -> 0x00cc }
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r1 = r1.length;	 Catch:{ all -> 0x00cc }
        r13 = r1 << 8;	 Catch:{ all -> 0x00cc }
        r14 = r9 - r4;	 Catch:{ all -> 0x00cc }
        if (r14 > 0) goto L_0x0044;	 Catch:{ all -> 0x00cc }
    L_0x0041:
        r1 = 0;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
    L_0x0044:
        r5 = r18 + r17;	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x0051;	 Catch:{ all -> 0x00cc }
    L_0x004a:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 <= 0) goto L_0x0186;	 Catch:{ all -> 0x00cc }
    L_0x004e:
        r1 = 0;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
    L_0x0051:
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 < r13) goto L_0x005d;	 Catch:{ all -> 0x00cc }
    L_0x0055:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x01a5;	 Catch:{ all -> 0x00cc }
    L_0x0059:
        r1 = r13 + -1;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
    L_0x005d:
        r1 = r15.ap;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x00fd;	 Catch:{ all -> 0x00cc }
    L_0x0061:
        r1 = r15.ai;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x01ad;	 Catch:{ all -> 0x00cc }
    L_0x0065:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x0233;	 Catch:{ all -> 0x00cc }
    L_0x0069:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r3 = r17;	 Catch:{ all -> 0x00cc }
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r4) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x007c:
        r1 = r4 + r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
    L_0x008a:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.ah;	 Catch:{ all -> 0x00cc }
        r2 = r2 + -1;	 Catch:{ all -> 0x00cc }
        r11 = r1[r2];	 Catch:{ all -> 0x00cc }
        r6 = r15;	 Catch:{ all -> 0x00cc }
        r7 = r16;	 Catch:{ all -> 0x00cc }
        r10 = r5;	 Catch:{ all -> 0x00cc }
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 < r9) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x009e:
        r1 = r9 + r9;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r4) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x00bd:
        r1 = r4 + r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
        goto L_0x008a;
    L_0x00cc:
        r1 = move-exception;
        monitor-exit(r15);
        throw r1;
    L_0x00cf:
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 / r14;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        if (r1 < r2) goto L_0x0211;	 Catch:{ all -> 0x00cc }
    L_0x00d7:
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        r2 = r2 * r14;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = 0;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
    L_0x00e2:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x01fb;	 Catch:{ all -> 0x00cc }
    L_0x00e6:
        r4 = 0;	 Catch:{ all -> 0x00cc }
        r6 = 0;	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x00f2:
        r1 = -1;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r15.af();	 Catch:{ all -> 0x00cc }
        r15.kn();	 Catch:{ all -> 0x00cc }
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x00fd:
        r1 = r15.ap;	 Catch:{ all -> 0x00cc }
        if (r1 <= 0) goto L_0x0242;	 Catch:{ all -> 0x00cc }
    L_0x0101:
        r1 = r15.ai;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x01f4;	 Catch:{ all -> 0x00cc }
    L_0x0105:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x023e;	 Catch:{ all -> 0x00cc }
    L_0x0109:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r3 = r17;	 Catch:{ all -> 0x00cc }
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r4) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x011c:
        r1 = r4 + r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ap;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x00e2;	 Catch:{ all -> 0x00cc }
    L_0x0132:
        r8 = r3;	 Catch:{ all -> 0x00cc }
    L_0x0133:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.ah;	 Catch:{ all -> 0x00cc }
        r2 = r2 + -1;	 Catch:{ all -> 0x00cc }
        r11 = r1[r2];	 Catch:{ all -> 0x00cc }
        r6 = r15;	 Catch:{ all -> 0x00cc }
        r7 = r16;	 Catch:{ all -> 0x00cc }
        r10 = r5;	 Catch:{ all -> 0x00cc }
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 < r9) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x0147:
        r1 = r9 + r9;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ap;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
        if (r1 == 0) goto L_0x00e2;	 Catch:{ all -> 0x00cc }
    L_0x015d:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r4) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x016e:
        r1 = r4 + r4;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        r1 = -r1;	 Catch:{ all -> 0x00cc }
        r15.ac = r1;	 Catch:{ all -> 0x00cc }
        r1 = r15.ap;	 Catch:{ all -> 0x00cc }
        r1 = r1 + -1;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
        if (r1 != 0) goto L_0x0132;	 Catch:{ all -> 0x00cc }
    L_0x0184:
        goto L_0x00e2;	 Catch:{ all -> 0x00cc }
    L_0x0186:
        r15.af();	 Catch:{ all -> 0x00cc }
        r15.kn();	 Catch:{ all -> 0x00cc }
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x018e:
        r1 = r9 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r1 = r1 / r14;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        if (r1 < r2) goto L_0x01d2;	 Catch:{ all -> 0x00cc }
    L_0x0198:
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        r2 = r2 * r14;	 Catch:{ all -> 0x00cc }
        r1 = r1 + r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        r1 = 0;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
        goto L_0x00e2;	 Catch:{ all -> 0x00cc }
    L_0x01a5:
        r15.af();	 Catch:{ all -> 0x00cc }
        r15.kn();	 Catch:{ all -> 0x00cc }
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x01ad:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x0237;	 Catch:{ all -> 0x00cc }
    L_0x01b1:
        r3 = r17;	 Catch:{ all -> 0x00cc }
    L_0x01b3:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.ah;	 Catch:{ all -> 0x00cc }
        r2 = r2 + -1;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r4) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x01c6:
        r1 = r9 + -1;	 Catch:{ all -> 0x00cc }
        r2 = r9 + -1;	 Catch:{ all -> 0x00cc }
        r6 = r15.aj;	 Catch:{ all -> 0x00cc }
        r2 = r2 - r6;	 Catch:{ all -> 0x00cc }
        r2 = r2 % r14;	 Catch:{ all -> 0x00cc }
        r1 = r1 - r2;	 Catch:{ all -> 0x00cc }
        r15.aj = r1;	 Catch:{ all -> 0x00cc }
        goto L_0x01b3;	 Catch:{ all -> 0x00cc }
    L_0x01d2:
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r6 = r14 * r1;	 Catch:{ all -> 0x00cc }
        r2 = r2 + r6;	 Catch:{ all -> 0x00cc }
        r15.aj = r2;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        r1 = r2 - r1;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
    L_0x01df:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.ah;	 Catch:{ all -> 0x00cc }
        r2 = r2 + -1;	 Catch:{ all -> 0x00cc }
        r6 = r1[r2];	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 < r4) goto L_0x018e;	 Catch:{ all -> 0x00cc }
    L_0x01f2:
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x01f4:
        r1 = r15.ac;	 Catch:{ all -> 0x00cc }
        if (r1 >= 0) goto L_0x023b;	 Catch:{ all -> 0x00cc }
    L_0x01f8:
        r3 = r17;	 Catch:{ all -> 0x00cc }
        goto L_0x01df;	 Catch:{ all -> 0x00cc }
    L_0x01fb:
        r6 = 0;	 Catch:{ all -> 0x00cc }
        r1 = r15;	 Catch:{ all -> 0x00cc }
        r2 = r16;	 Catch:{ all -> 0x00cc }
        r4 = r13;	 Catch:{ all -> 0x00cc }
        r1.bo(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 < r13) goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x0207:
        r15.aj = r13;	 Catch:{ all -> 0x00cc }
        r15.af();	 Catch:{ all -> 0x00cc }
        r15.kn();	 Catch:{ all -> 0x00cc }
        goto L_0x000e;	 Catch:{ all -> 0x00cc }
    L_0x0211:
        r2 = r15.aj;	 Catch:{ all -> 0x00cc }
        r6 = r14 * r1;	 Catch:{ all -> 0x00cc }
        r2 = r2 - r6;	 Catch:{ all -> 0x00cc }
        r15.aj = r2;	 Catch:{ all -> 0x00cc }
        r2 = r15.ap;	 Catch:{ all -> 0x00cc }
        r1 = r2 - r1;	 Catch:{ all -> 0x00cc }
        r15.ap = r1;	 Catch:{ all -> 0x00cc }
        r8 = r3;	 Catch:{ all -> 0x00cc }
    L_0x021f:
        r1 = r12.an;	 Catch:{ all -> 0x00cc }
        r2 = r15.at;	 Catch:{ all -> 0x00cc }
        r11 = r1[r2];	 Catch:{ all -> 0x00cc }
        r6 = r15;	 Catch:{ all -> 0x00cc }
        r7 = r16;	 Catch:{ all -> 0x00cc }
        r10 = r5;	 Catch:{ all -> 0x00cc }
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x00cc }
        r1 = r15.aj;	 Catch:{ all -> 0x00cc }
        if (r1 >= r9) goto L_0x00cf;
    L_0x0231:
        goto L_0x000e;
    L_0x0233:
        r8 = r17;
        goto L_0x008a;
    L_0x0237:
        r8 = r17;
        goto L_0x0017;
    L_0x023b:
        r8 = r17;
        goto L_0x021f;
    L_0x023e:
        r8 = r17;
        goto L_0x0133;
    L_0x0242:
        r3 = r17;
        goto L_0x00e2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.at(int[], int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void bp(int[] r16, int r17, int r18) {
        /*
        r15 = this;
        monitor-enter(r15);
        r1 = r15.an;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0043;
    L_0x0005:
        r1 = r15.aw;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0043;
    L_0x0009:
        r0 = r18;
        r15.ai(r0);	 Catch:{ all -> 0x0040 }
    L_0x000e:
        monitor-exit(r15);
        return;
    L_0x0010:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ap;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0204;
    L_0x0026:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0160;
    L_0x002a:
        r4 = 0;
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x000e;
    L_0x0036:
        r1 = -1;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r15.af();	 Catch:{ all -> 0x0040 }
        r15.kn();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x0040:
        r1 = move-exception;
        monitor-exit(r15);
        throw r1;
    L_0x0043:
        r1 = r15.ax;	 Catch:{ all -> 0x0040 }
        r0 = r1;
        r0 = (defpackage.ij) r0;	 Catch:{ all -> 0x0040 }
        r12 = r0;
        r1 = r15.at;	 Catch:{ all -> 0x0040 }
        r4 = r1 << 8;
        r1 = r15.ah;	 Catch:{ all -> 0x0040 }
        r9 = r1 << 8;
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r1 = r1.length;	 Catch:{ all -> 0x0040 }
        r13 = r1 << 8;
        r14 = r9 - r4;
        if (r14 > 0) goto L_0x005d;
    L_0x005a:
        r1 = 0;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
    L_0x005d:
        r5 = r18 + r17;
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x006a;
    L_0x0063:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 <= 0) goto L_0x0122;
    L_0x0067:
        r1 = 0;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
    L_0x006a:
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r13) goto L_0x0076;
    L_0x006e:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x013f;
    L_0x0072:
        r1 = r13 + -1;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
    L_0x0076:
        r1 = r15.ap;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0176;
    L_0x007a:
        r1 = r15.ai;	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x00e5;
    L_0x007e:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0248;
    L_0x0082:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x0095:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
    L_0x00a3:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ah;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r9) goto L_0x000e;
    L_0x00b7:
        r1 = r9 + r9;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x00d6:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x00a3;
    L_0x00e5:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x024c;
    L_0x00e9:
        r3 = r17;
    L_0x00eb:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ah;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r4) goto L_0x000e;
    L_0x00fe:
        r1 = r9 + -1;
        r2 = r9 + -1;
        r6 = r15.aj;	 Catch:{ all -> 0x0040 }
        r2 = r2 - r6;
        r2 = r2 % r14;
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x00eb;
    L_0x010a:
        r8 = r17;
    L_0x010c:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ah;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r9) goto L_0x0010;
    L_0x0120:
        goto L_0x000e;
    L_0x0122:
        r15.af();	 Catch:{ all -> 0x0040 }
        r15.kn();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x012a:
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r4;
        r1 = r1 / r14;
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        if (r1 < r2) goto L_0x01b2;
    L_0x0132:
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        r2 = r2 * r14;
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = 0;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x0026;
    L_0x013f:
        r15.af();	 Catch:{ all -> 0x0040 }
        r15.kn();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x0147:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ap;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x010c;
    L_0x015d:
        r3 = r8;
        goto L_0x0026;
    L_0x0160:
        r6 = 0;
        r1 = r15;
        r2 = r16;
        r4 = r13;
        r1.bo(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r13) goto L_0x000e;
    L_0x016c:
        r15.aj = r13;	 Catch:{ all -> 0x0040 }
        r15.af();	 Catch:{ all -> 0x0040 }
        r15.kn();	 Catch:{ all -> 0x0040 }
        goto L_0x000e;
    L_0x0176:
        r1 = r15.ap;	 Catch:{ all -> 0x0040 }
        if (r1 <= 0) goto L_0x0244;
    L_0x017a:
        r1 = r15.ai;	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x0217;
    L_0x017e:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x010a;
    L_0x0182:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r17;
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r4) goto L_0x0147;
    L_0x0195:
        goto L_0x000e;
    L_0x0197:
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r4;
        r1 = r1 % r14;
        r1 = r1 + r4;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
    L_0x019e:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r8 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r9) goto L_0x0197;
    L_0x01b0:
        goto L_0x000e;
    L_0x01b2:
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r14 * r1;
        r2 = r2 - r6;
        r15.aj = r2;	 Catch:{ all -> 0x0040 }
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        r1 = r2 - r1;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        r8 = r3;
    L_0x01c0:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r11 = r1[r2];	 Catch:{ all -> 0x0040 }
        r6 = r15;
        r7 = r16;
        r10 = r5;
        r3 = r6.bo(r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 >= r9) goto L_0x012a;
    L_0x01d2:
        goto L_0x000e;
    L_0x01d4:
        r1 = r4 + r4;
        r1 = r1 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        r1 = -r1;
        r15.ac = r1;	 Catch:{ all -> 0x0040 }
        r1 = r15.ap;	 Catch:{ all -> 0x0040 }
        r1 = r1 + -1;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x010c;
    L_0x01ea:
        r3 = r8;
        goto L_0x0026;
    L_0x01ed:
        r1 = r9 + -1;
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r1 = r1 - r2;
        r1 = r1 / r14;
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        if (r1 < r2) goto L_0x0232;
    L_0x01f7:
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        r2 = r2 * r14;
        r1 = r1 + r2;
        r15.aj = r1;	 Catch:{ all -> 0x0040 }
        r1 = 0;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x0026;
    L_0x0204:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.at;	 Catch:{ all -> 0x0040 }
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r8 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r4) goto L_0x01d4;
    L_0x0215:
        goto L_0x000e;
    L_0x0217:
        r1 = r15.ac;	 Catch:{ all -> 0x0040 }
        if (r1 >= 0) goto L_0x0240;
    L_0x021b:
        r3 = r17;
    L_0x021d:
        r1 = r12.an;	 Catch:{ all -> 0x0040 }
        r2 = r15.ah;	 Catch:{ all -> 0x0040 }
        r2 = r2 + -1;
        r6 = r1[r2];	 Catch:{ all -> 0x0040 }
        r1 = r15;
        r2 = r16;
        r3 = r1.bz(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0040 }
        r1 = r15.aj;	 Catch:{ all -> 0x0040 }
        if (r1 < r4) goto L_0x01ed;
    L_0x0230:
        goto L_0x000e;
    L_0x0232:
        r2 = r15.aj;	 Catch:{ all -> 0x0040 }
        r6 = r14 * r1;
        r2 = r2 + r6;
        r15.aj = r2;	 Catch:{ all -> 0x0040 }
        r2 = r15.ap;	 Catch:{ all -> 0x0040 }
        r1 = r2 - r1;
        r15.ap = r1;	 Catch:{ all -> 0x0040 }
        goto L_0x021d;
    L_0x0240:
        r8 = r17;
        goto L_0x01c0;
    L_0x0244:
        r3 = r17;
        goto L_0x0026;
    L_0x0248:
        r8 = r17;
        goto L_0x00a3;
    L_0x024c:
        r8 = r17;
        goto L_0x019e;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.bp(int[], int, int):void");
    }

    public synchronized void ai(int i) {
        if (this.aw > 0) {
            if (i >= this.aw) {
                if (this.an == Integer.MIN_VALUE) {
                    this.an = 0;
                    this.ak = 0;
                    this.aa = 0;
                    this.ao = 0;
                    kn();
                    i = this.aw;
                }
                this.aw = 0;
                ao();
            } else {
                this.ao += this.am * i;
                this.aa += this.ae * i;
                this.ak += this.as * i;
                this.aw -= i;
            }
        }
        int i2 = this.at << 8;
        int i3 = this.ah << 8;
        int length = ((ij) this.ax).an.length << 8;
        int i4 = i3 - i2;
        if (i4 <= 0) {
            this.ap = 0;
        }
        if (this.aj < 0) {
            if (this.ac > 0) {
                this.aj = 0;
            } else {
                af();
                kn();
            }
        }
        if (this.aj >= length) {
            if (this.ac < 0) {
                this.aj = length - 1;
            } else {
                af();
                kn();
            }
        }
        this.aj += this.ac * i;
        if (this.ap >= 0) {
            if (this.ap > 0) {
                if (this.ai) {
                    if (this.ac < 0) {
                        if (this.aj < i2) {
                            this.aj = ((i2 + i2) - 1) - this.aj;
                            this.ac = -this.ac;
                            i4 = this.ap - 1;
                            this.ap = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                    while (this.aj >= i3) {
                        this.aj = ((i3 + i3) - 1) - this.aj;
                        this.ac = -this.ac;
                        i4 = this.ap - 1;
                        this.ap = i4;
                        if (i4 != 0) {
                            if (this.aj >= i2) {
                                break;
                            }
                            this.aj = ((i2 + i2) - 1) - this.aj;
                            this.ac = -this.ac;
                            i4 = this.ap - 1;
                            this.ap = i4;
                            if (i4 == 0) {
                            }
                        }
                    }
                } else if (this.ac < 0) {
                    if (this.aj < i2) {
                        i2 = ((i3 - 1) - this.aj) / i4;
                        if (i2 >= this.ap) {
                            this.aj += this.ap * i4;
                            this.ap = 0;
                        } else {
                            this.aj += i4 * i2;
                            this.ap -= i2;
                        }
                    }
                } else if (this.aj >= i3) {
                    i2 = (this.aj - i2) / i4;
                    if (i2 >= this.ap) {
                        this.aj -= this.ap * i4;
                        this.ap = 0;
                    } else {
                        this.aj -= i4 * i2;
                        this.ap -= i2;
                    }
                }
            }
            if (this.ac < 0) {
                if (this.aj < 0) {
                    this.aj = -1;
                    af();
                    kn();
                }
            } else if (this.aj >= length) {
                this.aj = length;
                af();
                kn();
            }
        } else if (this.ai) {
            if (this.ac < 0) {
                if (this.aj < i2) {
                    this.aj = ((i2 + i2) - 1) - this.aj;
                    this.ac = -this.ac;
                }
            }
            while (this.aj >= i3) {
                this.aj = ((i3 + i3) - 1) - this.aj;
                this.ac = -this.ac;
                if (this.aj >= i2) {
                    break;
                }
                this.aj = ((i2 + i2) - 1) - this.aj;
                this.ac = -this.ac;
            }
        } else if (this.ac < 0) {
            if (this.aj < i2) {
                this.aj = (i3 - 1) - (((i3 - 1) - this.aj) % i4);
            }
        } else if (this.aj >= i3) {
            this.aj = ((this.aj - i2) % i4) + i2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void bb(int r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aw;	 Catch:{ all -> 0x0098 }
        if (r0 <= 0) goto L_0x0027;
    L_0x0005:
        r0 = r6.aw;	 Catch:{ all -> 0x0098 }
        if (r7 < r0) goto L_0x00b6;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0098 }
        r1 = -1311620390; // 0xffffffffb1d242da float:-6.1194045E-9 double:NaN;
        if (r0 != r1) goto L_0x0021;
    L_0x0010:
        r0 = 0;
        r6.an = r0;	 Catch:{ all -> 0x0098 }
        r0 = 0;
        r6.ak = r0;	 Catch:{ all -> 0x0098 }
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x0098 }
        r0 = 0;
        r6.ao = r0;	 Catch:{ all -> 0x0098 }
        r6.kn();	 Catch:{ all -> 0x0098 }
        r7 = r6.aw;	 Catch:{ all -> 0x0098 }
    L_0x0021:
        r0 = 0;
        r6.aw = r0;	 Catch:{ all -> 0x0098 }
        r6.ao();	 Catch:{ all -> 0x0098 }
    L_0x0027:
        r0 = r6.ax;	 Catch:{ all -> 0x0098 }
        r0 = (defpackage.ij) r0;	 Catch:{ all -> 0x0098 }
        r1 = r6.at;	 Catch:{ all -> 0x0098 }
        r1 = r1 << 8;
        r2 = r6.ah;	 Catch:{ all -> 0x0098 }
        r2 = r2 << 8;
        r0 = r0.an;	 Catch:{ all -> 0x0098 }
        r0 = r0.length;	 Catch:{ all -> 0x0098 }
        r0 = r0 << 8;
        r3 = r2 - r1;
        if (r3 > 0) goto L_0x003f;
    L_0x003c:
        r4 = 0;
        r6.ap = r4;	 Catch:{ all -> 0x0098 }
    L_0x003f:
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r4 >= 0) goto L_0x004a;
    L_0x0043:
        r4 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r4 <= 0) goto L_0x00ea;
    L_0x0047:
        r4 = 0;
        r6.aj = r4;	 Catch:{ all -> 0x0098 }
    L_0x004a:
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r4 < r0) goto L_0x0056;
    L_0x004e:
        r4 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r4 >= 0) goto L_0x00f2;
    L_0x0052:
        r4 = r0 + -1;
        r6.aj = r4;	 Catch:{ all -> 0x0098 }
    L_0x0056:
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        r5 = r6.ac;	 Catch:{ all -> 0x0098 }
        r5 = r5 * r7;
        r4 = r4 + r5;
        r6.aj = r4;	 Catch:{ all -> 0x0098 }
        r4 = r6.ap;	 Catch:{ all -> 0x0098 }
        if (r4 >= 0) goto L_0x0182;
    L_0x0062:
        r0 = r6.ai;	 Catch:{ all -> 0x0098 }
        if (r0 == 0) goto L_0x0160;
    L_0x0066:
        r0 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r0 >= 0) goto L_0x013b;
    L_0x006a:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 < r1) goto L_0x012d;
    L_0x006e:
        monitor-exit(r6);
        return;
    L_0x0070:
        r3 = r2 + r2;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ac;	 Catch:{ all -> 0x0098 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ap;	 Catch:{ all -> 0x0098 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0098 }
        if (r3 != 0) goto L_0x00fa;
    L_0x0086:
        r1 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r1 >= 0) goto L_0x01c0;
    L_0x008a:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 >= 0) goto L_0x006e;
    L_0x008e:
        r0 = -1;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r6.af();	 Catch:{ all -> 0x0098 }
        r6.kn();	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x0098:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x009b:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ac;	 Catch:{ all -> 0x0098 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ap;	 Catch:{ all -> 0x0098 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0098 }
        if (r3 == 0) goto L_0x0086;
    L_0x00b1:
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r3 >= r2) goto L_0x0070;
    L_0x00b5:
        goto L_0x006e;
    L_0x00b6:
        r0 = r6.ao;	 Catch:{ all -> 0x0098 }
        r1 = r6.am;	 Catch:{ all -> 0x0098 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ao = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.aa;	 Catch:{ all -> 0x0098 }
        r1 = r6.ae;	 Catch:{ all -> 0x0098 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.aa = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ak;	 Catch:{ all -> 0x0098 }
        r1 = r6.as;	 Catch:{ all -> 0x0098 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ak = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.aw;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r7;
        r6.aw = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x0027;
    L_0x00d5:
        r2 = r6.aj;	 Catch:{ all -> 0x0098 }
        r1 = r2 - r1;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x0098 }
        if (r1 < r2) goto L_0x01b2;
    L_0x00de:
        r1 = r6.aj;	 Catch:{ all -> 0x0098 }
        r2 = r6.ap;	 Catch:{ all -> 0x0098 }
        r2 = r2 * r3;
        r1 = r1 - r2;
        r6.aj = r1;	 Catch:{ all -> 0x0098 }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x0098 }
        goto L_0x0086;
    L_0x00ea:
        r6.af();	 Catch:{ all -> 0x0098 }
        r6.kn();	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x00f2:
        r6.af();	 Catch:{ all -> 0x0098 }
        r6.kn();	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x00fa:
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r3 >= r1) goto L_0x006e;
    L_0x00fe:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ac;	 Catch:{ all -> 0x0098 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0098 }
        r3 = r6.ap;	 Catch:{ all -> 0x0098 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0098 }
        if (r3 != 0) goto L_0x00b1;
    L_0x0114:
        goto L_0x0086;
    L_0x0116:
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x0098 }
        r1 = r1 - r2;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x0098 }
        if (r1 < r2) goto L_0x019e;
    L_0x0120:
        r1 = r6.aj;	 Catch:{ all -> 0x0098 }
        r2 = r6.ap;	 Catch:{ all -> 0x0098 }
        r2 = r2 * r3;
        r1 = r1 + r2;
        r6.aj = r1;	 Catch:{ all -> 0x0098 }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x0098 }
        goto L_0x0086;
    L_0x012d:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ac;	 Catch:{ all -> 0x0098 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0098 }
    L_0x013b:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 < r2) goto L_0x006e;
    L_0x013f:
        r0 = r2 + r2;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ac;	 Catch:{ all -> 0x0098 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 >= r1) goto L_0x006e;
    L_0x0151:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ac;	 Catch:{ all -> 0x0098 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x013b;
    L_0x0160:
        r0 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r0 >= 0) goto L_0x0175;
    L_0x0164:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 >= r1) goto L_0x006e;
    L_0x0168:
        r0 = r2 + -1;
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x0098 }
        r1 = r1 - r2;
        r1 = r1 % r3;
        r0 = r0 - r1;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x0175:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r0 < r2) goto L_0x006e;
    L_0x0179:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r1;
        r0 = r0 % r3;
        r0 = r0 + r1;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x0182:
        r4 = r6.ap;	 Catch:{ all -> 0x0098 }
        if (r4 <= 0) goto L_0x0086;
    L_0x0186:
        r4 = r6.ai;	 Catch:{ all -> 0x0098 }
        if (r4 == 0) goto L_0x0194;
    L_0x018a:
        r3 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r3 >= 0) goto L_0x00b1;
    L_0x018e:
        r3 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r3 < r1) goto L_0x009b;
    L_0x0192:
        goto L_0x006e;
    L_0x0194:
        r4 = r6.ac;	 Catch:{ all -> 0x0098 }
        if (r4 >= 0) goto L_0x01ac;
    L_0x0198:
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r4 < r1) goto L_0x0116;
    L_0x019c:
        goto L_0x006e;
    L_0x019e:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        r2 = r3 * r1;
        r0 = r0 + r2;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ap;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x01ac:
        r4 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r4 >= r2) goto L_0x00d5;
    L_0x01b0:
        goto L_0x006e;
    L_0x01b2:
        r0 = r6.aj;	 Catch:{ all -> 0x0098 }
        r2 = r3 * r1;
        r0 = r0 - r2;
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r0 = r6.ap;	 Catch:{ all -> 0x0098 }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
    L_0x01c0:
        r1 = r6.aj;	 Catch:{ all -> 0x0098 }
        if (r1 < r0) goto L_0x006e;
    L_0x01c4:
        r6.aj = r0;	 Catch:{ all -> 0x0098 }
        r6.af();	 Catch:{ all -> 0x0098 }
        r6.kn();	 Catch:{ all -> 0x0098 }
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.bb(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void br(int r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aw;	 Catch:{ all -> 0x0097 }
        if (r0 <= 0) goto L_0x0026;
    L_0x0005:
        r0 = r6.aw;	 Catch:{ all -> 0x0097 }
        if (r7 < r0) goto L_0x009a;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0097 }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0020;
    L_0x000f:
        r0 = 0;
        r6.an = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.ak = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x0097 }
        r0 = 0;
        r6.ao = r0;	 Catch:{ all -> 0x0097 }
        r6.kn();	 Catch:{ all -> 0x0097 }
        r7 = r6.aw;	 Catch:{ all -> 0x0097 }
    L_0x0020:
        r0 = 0;
        r6.aw = r0;	 Catch:{ all -> 0x0097 }
        r6.ao();	 Catch:{ all -> 0x0097 }
    L_0x0026:
        r0 = r6.ax;	 Catch:{ all -> 0x0097 }
        r0 = (defpackage.ij) r0;	 Catch:{ all -> 0x0097 }
        r1 = r6.at;	 Catch:{ all -> 0x0097 }
        r1 = r1 << 8;
        r2 = r6.ah;	 Catch:{ all -> 0x0097 }
        r2 = r2 << 8;
        r0 = r0.an;	 Catch:{ all -> 0x0097 }
        r0 = r0.length;	 Catch:{ all -> 0x0097 }
        r0 = r0 << 8;
        r3 = r2 - r1;
        if (r3 > 0) goto L_0x003e;
    L_0x003b:
        r4 = 0;
        r6.ap = r4;	 Catch:{ all -> 0x0097 }
    L_0x003e:
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x0049;
    L_0x0042:
        r4 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r4 <= 0) goto L_0x0138;
    L_0x0046:
        r4 = 0;
        r6.aj = r4;	 Catch:{ all -> 0x0097 }
    L_0x0049:
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r4 < r0) goto L_0x0055;
    L_0x004d:
        r4 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x00c6;
    L_0x0051:
        r4 = r0 + -1;
        r6.aj = r4;	 Catch:{ all -> 0x0097 }
    L_0x0055:
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        r5 = r6.ac;	 Catch:{ all -> 0x0097 }
        r5 = r5 * r7;
        r4 = r4 + r5;
        r6.aj = r4;	 Catch:{ all -> 0x0097 }
        r4 = r6.ap;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x00d9;
    L_0x0061:
        r0 = r6.ai;	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x0140;
    L_0x0065:
        r0 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x0113;
    L_0x0069:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 < r1) goto L_0x0105;
    L_0x006d:
        monitor-exit(r6);
        return;
    L_0x006f:
        r3 = r2 + r2;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ac;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ap;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x017b;
    L_0x0085:
        r1 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r1 >= 0) goto L_0x00b9;
    L_0x0089:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x006d;
    L_0x008d:
        r0 = -1;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r6.af();	 Catch:{ all -> 0x0097 }
        r6.kn();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x009a:
        r0 = r6.ao;	 Catch:{ all -> 0x0097 }
        r1 = r6.am;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ao = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.aa;	 Catch:{ all -> 0x0097 }
        r1 = r6.ae;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.aa = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ak;	 Catch:{ all -> 0x0097 }
        r1 = r6.as;	 Catch:{ all -> 0x0097 }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ak = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.aw;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r7;
        r6.aw = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x0026;
    L_0x00b9:
        r1 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r1 < r0) goto L_0x006d;
    L_0x00bd:
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r6.af();	 Catch:{ all -> 0x0097 }
        r6.kn();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00c6:
        r6.af();	 Catch:{ all -> 0x0097 }
        r6.kn();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00cd:
        r0 = r2 + -1;
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x0097 }
        r1 = r1 - r2;
        r1 = r1 % r3;
        r0 = r0 - r1;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x00d9:
        r4 = r6.ap;	 Catch:{ all -> 0x0097 }
        if (r4 <= 0) goto L_0x0085;
    L_0x00dd:
        r4 = r6.ai;	 Catch:{ all -> 0x0097 }
        if (r4 == 0) goto L_0x0197;
    L_0x00e1:
        r3 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r3 >= 0) goto L_0x00ff;
    L_0x00e5:
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r3 >= r1) goto L_0x006d;
    L_0x00e9:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ac;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ap;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0085;
    L_0x00ff:
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r3 >= r2) goto L_0x006f;
    L_0x0103:
        goto L_0x006d;
    L_0x0105:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ac;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0097 }
    L_0x0113:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 < r2) goto L_0x006d;
    L_0x0117:
        r0 = r2 + r2;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ac;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 >= r1) goto L_0x006d;
    L_0x0129:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ac;	 Catch:{ all -> 0x0097 }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x0113;
    L_0x0138:
        r6.af();	 Catch:{ all -> 0x0097 }
        r6.kn();	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0140:
        r0 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r0 >= 0) goto L_0x014a;
    L_0x0144:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 < r1) goto L_0x00cd;
    L_0x0148:
        goto L_0x006d;
    L_0x014a:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r0 < r2) goto L_0x006d;
    L_0x014e:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r0 = r0 % r3;
        r0 = r0 + r1;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x0157:
        r2 = r6.aj;	 Catch:{ all -> 0x0097 }
        r1 = r2 - r1;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x0097 }
        if (r1 < r2) goto L_0x01bc;
    L_0x0160:
        r1 = r6.aj;	 Catch:{ all -> 0x0097 }
        r2 = r6.ap;	 Catch:{ all -> 0x0097 }
        r2 = r2 * r3;
        r1 = r1 - r2;
        r6.aj = r1;	 Catch:{ all -> 0x0097 }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x0097 }
        goto L_0x0085;
    L_0x016d:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        r2 = r3 * r1;
        r0 = r0 + r2;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ap;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
    L_0x017b:
        r3 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r3 >= r1) goto L_0x006d;
    L_0x017f:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ac;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x0097 }
        r3 = r6.ap;	 Catch:{ all -> 0x0097 }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x00ff;
    L_0x0195:
        goto L_0x0085;
    L_0x0197:
        r4 = r6.ac;	 Catch:{ all -> 0x0097 }
        if (r4 >= 0) goto L_0x01b6;
    L_0x019b:
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r4 >= r1) goto L_0x006d;
    L_0x019f:
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x0097 }
        r1 = r1 - r2;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x0097 }
        if (r1 < r2) goto L_0x016d;
    L_0x01a9:
        r1 = r6.aj;	 Catch:{ all -> 0x0097 }
        r2 = r6.ap;	 Catch:{ all -> 0x0097 }
        r2 = r2 * r3;
        r1 = r1 + r2;
        r6.aj = r1;	 Catch:{ all -> 0x0097 }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x0097 }
        goto L_0x0085;
    L_0x01b6:
        r4 = r6.aj;	 Catch:{ all -> 0x0097 }
        if (r4 >= r2) goto L_0x0157;
    L_0x01ba:
        goto L_0x006d;
    L_0x01bc:
        r0 = r6.aj;	 Catch:{ all -> 0x0097 }
        r2 = r3 * r1;
        r0 = r0 - r2;
        r6.aj = r0;	 Catch:{ all -> 0x0097 }
        r0 = r6.ap;	 Catch:{ all -> 0x0097 }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x0097 }
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.br(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void bu(int r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aw;	 Catch:{ all -> 0x00bb }
        if (r0 <= 0) goto L_0x0026;
    L_0x0005:
        r0 = r6.aw;	 Catch:{ all -> 0x00bb }
        if (r7 < r0) goto L_0x00cb;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x00bb }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0020;
    L_0x000f:
        r0 = 0;
        r6.an = r0;	 Catch:{ all -> 0x00bb }
        r0 = 0;
        r6.ak = r0;	 Catch:{ all -> 0x00bb }
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x00bb }
        r0 = 0;
        r6.ao = r0;	 Catch:{ all -> 0x00bb }
        r6.kn();	 Catch:{ all -> 0x00bb }
        r7 = r6.aw;	 Catch:{ all -> 0x00bb }
    L_0x0020:
        r0 = 0;
        r6.aw = r0;	 Catch:{ all -> 0x00bb }
        r6.ao();	 Catch:{ all -> 0x00bb }
    L_0x0026:
        r0 = r6.ax;	 Catch:{ all -> 0x00bb }
        r0 = (defpackage.ij) r0;	 Catch:{ all -> 0x00bb }
        r1 = r6.at;	 Catch:{ all -> 0x00bb }
        r1 = r1 << 8;
        r2 = r6.ah;	 Catch:{ all -> 0x00bb }
        r2 = r2 << 8;
        r0 = r0.an;	 Catch:{ all -> 0x00bb }
        r0 = r0.length;	 Catch:{ all -> 0x00bb }
        r0 = r0 << 8;
        r3 = r2 - r1;
        if (r3 > 0) goto L_0x003e;
    L_0x003b:
        r4 = 0;
        r6.ap = r4;	 Catch:{ all -> 0x00bb }
    L_0x003e:
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r4 >= 0) goto L_0x0049;
    L_0x0042:
        r4 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r4 <= 0) goto L_0x00ea;
    L_0x0046:
        r4 = 0;
        r6.aj = r4;	 Catch:{ all -> 0x00bb }
    L_0x0049:
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r4 < r0) goto L_0x0055;
    L_0x004d:
        r4 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r4 >= 0) goto L_0x0154;
    L_0x0051:
        r4 = r0 + -1;
        r6.aj = r4;	 Catch:{ all -> 0x00bb }
    L_0x0055:
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        r5 = r6.ac;	 Catch:{ all -> 0x00bb }
        r5 = r5 * r7;
        r4 = r4 + r5;
        r6.aj = r4;	 Catch:{ all -> 0x00bb }
        r4 = r6.ap;	 Catch:{ all -> 0x00bb }
        if (r4 >= 0) goto L_0x01aa;
    L_0x0061:
        r0 = r6.ai;	 Catch:{ all -> 0x00bb }
        if (r0 == 0) goto L_0x0188;
    L_0x0065:
        r0 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r0 >= 0) goto L_0x008f;
    L_0x0069:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 < r1) goto L_0x0178;
    L_0x006d:
        monitor-exit(r6);
        return;
    L_0x006f:
        r0 = r2 + r2;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ac;	 Catch:{ all -> 0x00bb }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 >= r1) goto L_0x006d;
    L_0x0081:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ac;	 Catch:{ all -> 0x00bb }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x00bb }
    L_0x008f:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 >= r2) goto L_0x006f;
    L_0x0093:
        goto L_0x006d;
    L_0x0094:
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x00bb }
        r1 = r1 - r2;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x00bb }
        if (r1 < r2) goto L_0x016a;
    L_0x009e:
        r1 = r6.aj;	 Catch:{ all -> 0x00bb }
        r2 = r6.ap;	 Catch:{ all -> 0x00bb }
        r2 = r2 * r3;
        r1 = r1 + r2;
        r6.aj = r1;	 Catch:{ all -> 0x00bb }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x00bb }
    L_0x00a9:
        r1 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r1 >= 0) goto L_0x00be;
    L_0x00ad:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 >= 0) goto L_0x006d;
    L_0x00b1:
        r0 = -1;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r6.af();	 Catch:{ all -> 0x00bb }
        r6.kn();	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x00bb:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x00be:
        r1 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r1 < r0) goto L_0x006d;
    L_0x00c2:
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r6.af();	 Catch:{ all -> 0x00bb }
        r6.kn();	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x00cb:
        r0 = r6.ao;	 Catch:{ all -> 0x00bb }
        r1 = r6.am;	 Catch:{ all -> 0x00bb }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ao = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.aa;	 Catch:{ all -> 0x00bb }
        r1 = r6.ae;	 Catch:{ all -> 0x00bb }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.aa = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ak;	 Catch:{ all -> 0x00bb }
        r1 = r6.as;	 Catch:{ all -> 0x00bb }
        r1 = r1 * r7;
        r0 = r0 + r1;
        r6.ak = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.aw;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r7;
        r6.aw = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x0026;
    L_0x00ea:
        r6.af();	 Catch:{ all -> 0x00bb }
        r6.kn();	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x00f2:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ac;	 Catch:{ all -> 0x00bb }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ap;	 Catch:{ all -> 0x00bb }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x00bb }
        if (r3 == 0) goto L_0x00a9;
    L_0x0108:
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r3 < r2) goto L_0x006d;
    L_0x010c:
        r3 = r2 + r2;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ac;	 Catch:{ all -> 0x00bb }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ap;	 Catch:{ all -> 0x00bb }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x00bb }
        if (r3 == 0) goto L_0x00a9;
    L_0x0122:
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r3 >= r1) goto L_0x006d;
    L_0x0126:
        r3 = r1 + r1;
        r3 = r3 + -1;
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        r3 = r3 - r4;
        r6.aj = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ac;	 Catch:{ all -> 0x00bb }
        r3 = -r3;
        r6.ac = r3;	 Catch:{ all -> 0x00bb }
        r3 = r6.ap;	 Catch:{ all -> 0x00bb }
        r3 = r3 + -1;
        r6.ap = r3;	 Catch:{ all -> 0x00bb }
        if (r3 != 0) goto L_0x0108;
    L_0x013c:
        goto L_0x00a9;
    L_0x013e:
        r2 = r6.aj;	 Catch:{ all -> 0x00bb }
        r1 = r2 - r1;
        r1 = r1 / r3;
        r2 = r6.ap;	 Catch:{ all -> 0x00bb }
        if (r1 < r2) goto L_0x015c;
    L_0x0147:
        r1 = r6.aj;	 Catch:{ all -> 0x00bb }
        r2 = r6.ap;	 Catch:{ all -> 0x00bb }
        r2 = r2 * r3;
        r1 = r1 - r2;
        r6.aj = r1;	 Catch:{ all -> 0x00bb }
        r1 = 0;
        r6.ap = r1;	 Catch:{ all -> 0x00bb }
        goto L_0x00a9;
    L_0x0154:
        r6.af();	 Catch:{ all -> 0x00bb }
        r6.kn();	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x015c:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        r2 = r3 * r1;
        r0 = r0 - r2;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ap;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x016a:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        r2 = r3 * r1;
        r0 = r0 + r2;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ap;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r1;
        r6.ap = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x0178:
        r0 = r1 + r1;
        r0 = r0 + -1;
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r3;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        r0 = r6.ac;	 Catch:{ all -> 0x00bb }
        r0 = -r0;
        r6.ac = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x008f;
    L_0x0188:
        r0 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r0 >= 0) goto L_0x019d;
    L_0x018c:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 >= r1) goto L_0x006d;
    L_0x0190:
        r0 = r2 + -1;
        r1 = r2 + -1;
        r2 = r6.aj;	 Catch:{ all -> 0x00bb }
        r1 = r1 - r2;
        r1 = r1 % r3;
        r0 = r0 - r1;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x019d:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r0 < r2) goto L_0x006d;
    L_0x01a1:
        r0 = r6.aj;	 Catch:{ all -> 0x00bb }
        r0 = r0 - r1;
        r0 = r0 % r3;
        r0 = r0 + r1;
        r6.aj = r0;	 Catch:{ all -> 0x00bb }
        goto L_0x006d;
    L_0x01aa:
        r4 = r6.ap;	 Catch:{ all -> 0x00bb }
        if (r4 <= 0) goto L_0x00a9;
    L_0x01ae:
        r4 = r6.ai;	 Catch:{ all -> 0x00bb }
        if (r4 == 0) goto L_0x01bc;
    L_0x01b2:
        r3 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r3 >= 0) goto L_0x0108;
    L_0x01b6:
        r3 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r3 < r1) goto L_0x00f2;
    L_0x01ba:
        goto L_0x006d;
    L_0x01bc:
        r4 = r6.ac;	 Catch:{ all -> 0x00bb }
        if (r4 >= 0) goto L_0x01c6;
    L_0x01c0:
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r4 < r1) goto L_0x0094;
    L_0x01c4:
        goto L_0x006d;
    L_0x01c6:
        r4 = r6.aj;	 Catch:{ all -> 0x00bb }
        if (r4 >= r2) goto L_0x013e;
    L_0x01ca:
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.bu(int):void");
    }

    int bo(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == bq.ah && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.bf(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bk(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cl(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.cy(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == bq.ah && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.ba(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bj(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bn(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bw(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int ea(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == bq.ah && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.bf(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bk(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cl(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.cy(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == bq.ah && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.ba(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bj(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bn(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bw(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int ec(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == bq.ah && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.bf(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bk(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cl(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.cy(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == bq.ah && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.ba(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bj(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bn(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bw(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int er(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == bq.ah && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.bf(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bk(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cl(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.cy(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == bq.ah && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.ba(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bj(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bn(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bw(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int et(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == -2005532865 && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.bf(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bk(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cl(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.cy(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == bq.ah && (this.aj & -2036389990) == 0) {
            if (in.ac) {
                return ia.ba(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bj(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bn(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bw(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int bz(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == -256 && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.cb(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bl(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.co(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == -256 && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.be(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bv(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bg(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int ee(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == -256 && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.cb(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bl(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.co(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == -256 && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.be(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bv(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bg(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int em(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == -256 && (this.aj & 255) == 0) {
                if (in.ac) {
                    i5 = ia.cb(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bl(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.co(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == 1706011943 && (this.aj & 255) == 0) {
            if (in.ac) {
                return ia.be(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bv(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bg(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    int ew(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        while (this.aw > 0) {
            int i6 = i5 + this.aw;
            if (i6 > i3) {
                i6 = i3;
            }
            this.aw += i5;
            if (this.ac == -256 && (this.aj & -1251748765) == 0) {
                if (in.ac) {
                    i5 = ia.cb(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this);
                } else {
                    i5 = ia.bl(((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this);
                }
            } else if (in.ac) {
                i5 = ia.cc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, this.ae, this.as, 0, i6, i2, this, this.ac, i4);
            } else {
                i5 = ia.co(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, this.am, 0, i6, i2, this, this.ac, i4);
            }
            this.aw -= i5;
            if (this.aw != 0) {
                return i5;
            }
            if (bq()) {
                return i3;
            }
        }
        if (this.ac == -325500832 && (this.aj & -98795265) == 0) {
            if (in.ac) {
                return ia.be(0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this);
            }
            return ia.bv(((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this);
        } else if (in.ac) {
            return ia.bc(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.aa, this.ak, 0, i3, i2, this, this.ac, i4);
        } else {
            return ia.bg(0, 0, ((ij) this.ax).an, iArr, this.aj, i5, this.ao, 0, i3, i2, this, this.ac, i4);
        }
    }

    boolean bq() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = ia.aj(i3, this.aq);
            i = ia.ac(i3, this.aq);
        }
        if (this.ao != i3 || this.aa != i2 || this.ak != i) {
            if (this.ao < i3) {
                this.am = 1;
                this.aw = i3 - this.ao;
            } else if (this.ao > i3) {
                this.am = -1;
                this.aw = this.ao - i3;
            } else {
                this.am = 0;
            }
            if (this.aa < i2) {
                this.ae = 1;
                if (this.aw == 0 || this.aw > i2 - this.aa) {
                    this.aw = i2 - this.aa;
                }
            } else if (this.aa > i2) {
                this.ae = -1;
                if (this.aw == 0 || this.aw > this.aa - i2) {
                    this.aw = this.aa - i2;
                }
            } else {
                this.ae = 0;
            }
            if (this.ak < i) {
                this.as = 1;
                if (this.aw != 0 && this.aw <= i - this.ak) {
                    return false;
                }
                this.aw = i - this.ak;
                return false;
            } else if (this.ak > i) {
                this.as = -1;
                if (this.aw != 0 && this.aw <= this.ak - i) {
                    return false;
                }
                this.aw = this.ak - i;
                return false;
            } else {
                this.as = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.ak = 0;
            this.aa = 0;
            this.ao = 0;
            kn();
            return true;
        } else {
            ao();
            return false;
        }
    }

    boolean eg() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = ia.aj(i3, this.aq);
            i = ia.ac(i3, this.aq);
        }
        if (this.ao != i3 || this.aa != i2 || this.ak != i) {
            if (this.ao < i3) {
                this.am = 1;
                this.aw = i3 - this.ao;
            } else if (this.ao > i3) {
                this.am = -1;
                this.aw = this.ao - i3;
            } else {
                this.am = 0;
            }
            if (this.aa < i2) {
                this.ae = 1;
                if (this.aw == 0 || this.aw > i2 - this.aa) {
                    this.aw = i2 - this.aa;
                }
            } else if (this.aa > i2) {
                this.ae = -1;
                if (this.aw == 0 || this.aw > this.aa - i2) {
                    this.aw = this.aa - i2;
                }
            } else {
                this.ae = 0;
            }
            if (this.ak < i) {
                this.as = 1;
                if (this.aw != 0 && this.aw <= i - this.ak) {
                    return false;
                }
                this.aw = i - this.ak;
                return false;
            } else if (this.ak > i) {
                this.as = -1;
                if (this.aw != 0 && this.aw <= this.ak - i) {
                    return false;
                }
                this.aw = this.ak - i;
                return false;
            } else {
                this.as = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.ak = 0;
            this.aa = 0;
            this.ao = 0;
            kn();
            return true;
        } else {
            ao();
            return false;
        }
    }

    boolean en() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = ia.aj(i3, this.aq);
            i = ia.ac(i3, this.aq);
        }
        if (this.ao != i3 || this.aa != i2 || this.ak != i) {
            if (this.ao < i3) {
                this.am = 1;
                this.aw = i3 - this.ao;
            } else if (this.ao > i3) {
                this.am = -1;
                this.aw = this.ao - i3;
            } else {
                this.am = 0;
            }
            if (this.aa < i2) {
                this.ae = 1;
                if (this.aw == 0 || this.aw > i2 - this.aa) {
                    this.aw = i2 - this.aa;
                }
            } else if (this.aa > i2) {
                this.ae = -1;
                if (this.aw == 0 || this.aw > this.aa - i2) {
                    this.aw = this.aa - i2;
                }
            } else {
                this.ae = 0;
            }
            if (this.ak < i) {
                this.as = 1;
                if (this.aw != 0 && this.aw <= i - this.ak) {
                    return false;
                }
                this.aw = i - this.ak;
                return false;
            } else if (this.ak > i) {
                this.as = -1;
                if (this.aw != 0 && this.aw <= this.ak - i) {
                    return false;
                }
                this.aw = this.ak - i;
                return false;
            } else {
                this.as = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.ak = 0;
            this.aa = 0;
            this.ao = 0;
            kn();
            return true;
        } else {
            ao();
            return false;
        }
    }

    boolean eo() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = ia.aj(i3, this.aq);
            i = ia.ac(i3, this.aq);
        }
        if (this.ao != i3 || this.aa != i2 || this.ak != i) {
            if (this.ao < i3) {
                this.am = 1;
                this.aw = i3 - this.ao;
            } else if (this.ao > i3) {
                this.am = -1;
                this.aw = this.ao - i3;
            } else {
                this.am = 0;
            }
            if (this.aa < i2) {
                this.ae = 1;
                if (this.aw == 0 || this.aw > i2 - this.aa) {
                    this.aw = i2 - this.aa;
                }
            } else if (this.aa > i2) {
                this.ae = -1;
                if (this.aw == 0 || this.aw > this.aa - i2) {
                    this.aw = this.aa - i2;
                }
            } else {
                this.ae = 0;
            }
            if (this.ak < i) {
                this.as = 1;
                if (this.aw != 0 && this.aw <= i - this.ak) {
                    return false;
                }
                this.aw = i - this.ak;
                return false;
            } else if (this.ak > i) {
                this.as = -1;
                if (this.aw != 0 && this.aw <= this.ak - i) {
                    return false;
                }
                this.aw = this.ak - i;
                return false;
            } else {
                this.as = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.ak = 0;
            this.aa = 0;
            this.ao = 0;
            kn();
            return true;
        } else {
            ao();
            return false;
        }
    }

    boolean ev() {
        int i;
        int i2;
        int i3 = this.an;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = ia.aj(i3, this.aq);
            i = ia.ac(i3, this.aq);
        }
        if (this.ao != i3 || this.aa != i2 || this.ak != i) {
            if (this.ao < i3) {
                this.am = 1;
                this.aw = i3 - this.ao;
            } else if (this.ao > i3) {
                this.am = -1;
                this.aw = this.ao - i3;
            } else {
                this.am = 0;
            }
            if (this.aa < i2) {
                this.ae = 1;
                if (this.aw == 0 || this.aw > i2 - this.aa) {
                    this.aw = i2 - this.aa;
                }
            } else if (this.aa > i2) {
                this.ae = -1;
                if (this.aw == 0 || this.aw > this.aa - i2) {
                    this.aw = this.aa - i2;
                }
            } else {
                this.ae = 0;
            }
            if (this.ak < i) {
                this.as = 1;
                if (this.aw != 0 && this.aw <= i - this.ak) {
                    return false;
                }
                this.aw = i - this.ak;
                return false;
            } else if (this.ak > i) {
                this.as = -1;
                if (this.aw != 0 && this.aw <= this.ak - i) {
                    return false;
                }
                this.aw = this.ak - i;
                return false;
            } else {
                this.as = 0;
                return false;
            }
        } else if (this.an == Integer.MIN_VALUE) {
            this.an = 0;
            this.ak = 0;
            this.aa = 0;
            this.ao = 0;
            kn();
            return true;
        } else {
            ao();
            return false;
        }
    }

    static int bj(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, ia iaVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        iaVar.aj = i11 << 8;
        return i10;
    }

    static int ef(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, ia iaVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        iaVar.aj = i11 << 8;
        return i10;
    }

    static int es(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, ia iaVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = ((i6 >> 8) + i2) - i8;
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 + 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 + 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 + 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 + 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        iaVar.aj = i11 << 8;
        return i10;
    }

    static int ba(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int fi(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int fj(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 + 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 + 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 + 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int bv(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, ia iaVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = (i2 + i8) - ((i6 >> 8) - 1);
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 - 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 - 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 - 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        iaVar.aj = i11 << 8;
        return i10;
    }

    static int fn(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, ia iaVar) {
        int i7;
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = (i2 + i8) - ((i6 >> 8) - 1);
        if (i10 <= i5) {
            i5 = i10;
        }
        int i11 = i5 - 3;
        i10 = i2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = i8 - 1;
            iArr[i10] = (bArr[i8] * i9) + iArr[i10];
            i10 = i12 + 1;
            i7 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
            i12 = i10 + 1;
            i13 = i7 - 1;
            iArr[i10] = iArr[i10] + (bArr[i7] * i9);
            i10 = i12 + 1;
            i8 = i13 - 1;
            iArr[i12] = iArr[i12] + (bArr[i13] * i9);
        }
        i7 = i11 + 3;
        i11 = i8;
        while (i10 < i7) {
            i8 = i10 + 1;
            i12 = i11 - 1;
            iArr[i10] = (bArr[i11] * i9) + iArr[i10];
            i10 = i8;
            i11 = i12;
        }
        iaVar.aj = i11 << 8;
        return i10;
    }

    static int be(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int fd(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int fl(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar) {
        int i9;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        i13 = i3 << 1;
        int i14 = (i7 << 1) - 6;
        while (i13 < i14) {
            i9 = i10 - 1;
            byte b = bArr[i10];
            int i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            byte b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
            i9 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i9 - 1;
            b2 = bArr[i9];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i11);
            i13 = i15 + 1;
            iArr[i15] = (b2 * i12) + iArr[i15];
        }
        i9 = i14 + 6;
        while (i13 < i9) {
            i14 = i10 - 1;
            b = bArr[i10];
            i15 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i11);
            i13 = i15 + 1;
            iArr[i15] = (b * i12) + iArr[i15];
            i10 = i14;
        }
        iaVar.aj = i10 << 8;
        return i13 >> 1;
    }

    static int bw(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fh(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - -247747024) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (939560353 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (939560353 & i13)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fq(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (1249709587 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (1858169364 & i13)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (1249709587 & i13)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (1858169364 & i13)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fv(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fz(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    i12 = i11 + 1;
                    iArr[i11] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i11];
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b3 = bArr[i142];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142 + 1] - b3) * (i13 & 255)) + (b3 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            byte b22 = bArr[i13 >> 8];
            i12 = i11 + 1;
            iArr[i11] = (((((i10 - b22) * (i13 & 255)) + (b22 << 8)) * i5) >> 6) + iArr[i11];
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bn(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x000f;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r1 = r1 + -257;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0011;
    L_0x000f:
        r1 = r17;
    L_0x0011:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0016:
        if (r2 >= r1) goto L_0x003f;
    L_0x0018:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0016;
    L_0x003f:
        if (r20 == 0) goto L_0x0050;
    L_0x0041:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0050:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0054:
        if (r1 >= r4) goto L_0x007a;
    L_0x0056:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0054;
    L_0x007a:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.bn(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fk(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x000f;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r1 = r1 + -257;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0011;
    L_0x000f:
        r1 = r17;
    L_0x0011:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0016:
        if (r2 >= r1) goto L_0x0046;
    L_0x0018:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0016;
    L_0x003f:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0046:
        if (r20 == 0) goto L_0x0057;
    L_0x0048:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0057:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x005b:
        if (r1 >= r4) goto L_0x003f;
    L_0x005d:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x005b;
    L_0x0081:
        r17 = r1;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fk(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fo(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x000f;
    L_0x0002:
        r1 = r18 - r12;
        r1 = r1 + r20;
        r1 = r1 + -257;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0011;
    L_0x000f:
        r1 = r17;
    L_0x0011:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0016:
        if (r2 >= r1) goto L_0x003f;
    L_0x0018:
        r4 = r3 >> 8;
        r5 = r10[r4];
        r6 = r5 << 8;
        r4 = r4 + 1;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0016;
    L_0x003f:
        if (r20 == 0) goto L_0x0050;
    L_0x0041:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 + -1;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0050:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0054:
        if (r1 >= r4) goto L_0x007a;
    L_0x0056:
        r3 = r2 >> 8;
        r3 = r10[r3];
        r5 = r3 << 8;
        r3 = r21 - r3;
        r6 = r2 & 255;
        r3 = r3 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0054;
    L_0x007a:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fo(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    static int bg(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + bq.ah) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fe(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + bq.ah) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int ff(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + bq.ah) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (-877210836 & i13))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (-877210836 & i13))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int ft(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((1817542700 + i8) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (-1458745158 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (-1179177600 & i13))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (-1458745158 & i13)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (-1179177600 & i13))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    static int fu(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, ia iaVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + bq.ah) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    i4 = i12 + 1;
                    iArr[i12] = (((((bArr[i14] - b) * (-313260649 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12 = i4;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                i11 = i12;
                while (i11 < i7) {
                    i12 = i11 + 1;
                    iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i11 = i12;
                }
                iaVar.aj = i13;
                return i11;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
            int i142 = i13 >> 8;
            byte b2 = bArr[i142 - 1];
            i4 = i12 + 1;
            iArr[i12] = (((((bArr[i142] - b2) * (-313260649 & i13)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
            i12 = i4;
            i13 += i9;
        }
        if (i9 != 0) {
            i11 = (((i8 - i13) + i9) / i9) + i12;
            if (i11 <= i7) {
                i7 = i11;
            }
        }
        i11 = i12;
        while (i11 < i7) {
            i12 = i11 + 1;
            iArr[i11] = iArr[i11] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
            i13 += i9;
            i11 = i12;
        }
        iaVar.aj = i13;
        return i11;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bc(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x006d;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        r2 = r2 + r20;
    L_0x0042:
        if (r1 >= r4) goto L_0x0066;
    L_0x0044:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        goto L_0x0040;
    L_0x0066:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x006d:
        if (r20 == 0) goto L_0x007c;
    L_0x006f:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x007c:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0042;
    L_0x0081:
        r17 = r1;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.bc(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fb(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0040;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        if (r20 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0080;
    L_0x004f:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0053:
        if (r1 >= r4) goto L_0x0079;
    L_0x0055:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0053;
    L_0x0079:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0080:
        r17 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fb(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fc(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0040;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        if (r20 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0080;
    L_0x004f:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0053:
        if (r1 >= r4) goto L_0x0079;
    L_0x0055:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0053;
    L_0x0079:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0080:
        r17 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fc(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fm(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0040;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        if (r20 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0082;
    L_0x004f:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0053:
        if (r1 >= r4) goto L_0x007b;
    L_0x0055:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = 1372444181; // 0x51cdd615 float:1.105075E11 double:6.780775207E-315;
        r6 = r6 & r2;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0053;
    L_0x007b:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0082:
        r17 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fm(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fs(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0010;
    L_0x0002:
        r0 = r18;
        r1 = r0 + 256;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0012;
    L_0x0010:
        r1 = r17;
    L_0x0012:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0017:
        if (r2 >= r1) goto L_0x0040;
    L_0x0019:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0017;
    L_0x0040:
        if (r20 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0080;
    L_0x004f:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0053:
        if (r1 >= r4) goto L_0x0079;
    L_0x0055:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0053;
    L_0x0079:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0080:
        r17 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fs(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fw(int r8, int r9, byte[] r10, int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, ia r19, int r20, int r21) {
        /*
        if (r20 == 0) goto L_0x0011;
    L_0x0002:
        r1 = 1044170766; // 0x3e3cc80e float:0.1843569 double:5.15888904E-315;
        r1 = r1 + r18;
        r1 = r1 - r12;
        r1 = r1 + r20;
        r1 = r1 / r20;
        r1 = r1 + r13;
        r0 = r17;
        if (r1 <= r0) goto L_0x0013;
    L_0x0011:
        r1 = r17;
    L_0x0013:
        r2 = r13 << 1;
        r1 = r1 << 1;
        r3 = r12;
    L_0x0018:
        if (r2 >= r1) goto L_0x0041;
    L_0x001a:
        r4 = r3 >> 8;
        r5 = r4 + -1;
        r5 = r10[r5];
        r6 = r5 << 8;
        r4 = r10[r4];
        r4 = r4 - r5;
        r5 = r3 & 255;
        r4 = r4 * r5;
        r4 = r4 + r6;
        r5 = r2 + 1;
        r6 = r11[r2];
        r7 = r4 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r2] = r6;
        r2 = r5 + 1;
        r6 = r11[r5];
        r4 = r4 * r15;
        r4 = r4 >> 6;
        r4 = r4 + r6;
        r11[r5] = r4;
        r3 = r3 + r20;
        goto L_0x0018;
    L_0x0041:
        if (r20 == 0) goto L_0x0050;
    L_0x0043:
        r1 = r2 >> 1;
        r4 = r18 - r3;
        r4 = r4 + r20;
        r4 = r4 / r20;
        r1 = r1 + r4;
        r0 = r17;
        if (r1 <= r0) goto L_0x0081;
    L_0x0050:
        r4 = r17 << 1;
        r1 = r2;
        r2 = r3;
    L_0x0054:
        if (r1 >= r4) goto L_0x007a;
    L_0x0056:
        r3 = r21 << 8;
        r5 = r2 >> 8;
        r5 = r10[r5];
        r5 = r5 - r21;
        r6 = r2 & 255;
        r5 = r5 * r6;
        r3 = r3 + r5;
        r5 = r1 + 1;
        r6 = r11[r1];
        r7 = r3 * r14;
        r7 = r7 >> 6;
        r6 = r6 + r7;
        r11[r1] = r6;
        r1 = r5 + 1;
        r6 = r11[r5];
        r3 = r3 * r15;
        r3 = r3 >> 6;
        r3 = r3 + r6;
        r11[r5] = r3;
        r2 = r2 + r20;
        goto L_0x0054;
    L_0x007a:
        r0 = r19;
        r0.aj = r2;
        r1 = r1 >> 1;
        return r1;
    L_0x0081:
        r17 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.fw(int, int, byte[], int[], int, int, int, int, int, int, int, ia, int, int):int");
    }

    static int bk(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int fg(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int fx(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = ((i7 >> 8) + i2) - i9;
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 + 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 + 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 + 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 + 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int bf(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 + 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int fy(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 + 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 + 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 + 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int bl(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int fa(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int fp(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int fr(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, ia iaVar) {
        int i8;
        int i9 = i >> 8;
        int i10 = i3 << 2;
        int i11 = i4 << 2;
        int i12 = (i2 + i9) - ((i7 >> 8) - 1);
        if (i12 <= i6) {
            i6 = i12;
        }
        iaVar.aa += iaVar.ae * (i6 - i2);
        iaVar.ak += iaVar.as * (i6 - i2);
        int i13 = i6 - 3;
        i12 = i10;
        i10 = i2;
        while (i10 < i13) {
            int i14 = i10 + 1;
            int i15 = i9 - 1;
            iArr[i10] = (bArr[i9] * i12) + iArr[i10];
            i12 += i11;
            i10 = i14 + 1;
            i8 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
            i14 = i10 + 1;
            i15 = i8 - 1;
            iArr[i10] = iArr[i10] + (bArr[i8] * i12);
            i12 += i11;
            i10 = i14 + 1;
            i9 = i15 - 1;
            iArr[i14] = iArr[i14] + (bArr[i15] * i12);
            i12 += i11;
        }
        i8 = i13 + 3;
        i13 = i9;
        while (i10 < i8) {
            i9 = i10 + 1;
            i14 = i13 - 1;
            iArr[i10] = (bArr[i13] * i12) + iArr[i10];
            i12 += i11;
            i10 = i9;
            i13 = i14;
        }
        iaVar.ao = i12 >> 2;
        iaVar.aj = i13 << 8;
        return i10;
    }

    static int cb(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int gh(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int gi(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int gr(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ia iaVar) {
        int i11;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        iaVar.ao += iaVar.am * (i9 - i3);
        int i18 = (i9 << 1) - 6;
        int i19 = i14;
        i14 = i13;
        i13 = i3 << 1;
        i17 = i19;
        while (i13 < i18) {
            i11 = i12 - 1;
            byte b = bArr[i12];
            int i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            byte b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
            i11 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i11 - 1;
            b2 = bArr[i11];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b2 * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b2 * i17) + iArr[i20];
            i17 += i16;
        }
        i11 = i18 + 6;
        while (i13 < i11) {
            i18 = i12 - 1;
            b = bArr[i12];
            i20 = i13 + 1;
            iArr[i13] = iArr[i13] + (b * i14);
            i14 += i15;
            i13 = i20 + 1;
            iArr[i20] = (b * i17) + iArr[i20];
            i17 += i16;
            i12 = i18;
        }
        iaVar.aa = i14 >> 2;
        iaVar.ak = i17 >> 2;
        iaVar.aj = i12 << 8;
        return i13 >> 1;
    }

    static int cy(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ia iaVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        iaVar.aa -= iaVar.ae * i4;
        iaVar.ak -= iaVar.as * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                iaVar.aa += iaVar.ae * i13;
                iaVar.ak += iaVar.as * i13;
                iaVar.ao = i12;
                iaVar.aj = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        iaVar.aa += iaVar.ae * i13;
        iaVar.ak += iaVar.as * i13;
        iaVar.ao = i12;
        iaVar.aj = i15;
        return i13;
    }

    static int ga(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ia iaVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        iaVar.aa -= iaVar.ae * i4;
        iaVar.ak -= iaVar.as * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                iaVar.aa += iaVar.ae * i13;
                iaVar.ak += iaVar.as * i13;
                iaVar.ao = i12;
                iaVar.aj = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        iaVar.aa += iaVar.ae * i13;
        iaVar.ak += iaVar.as * i13;
        iaVar.ao = i12;
        iaVar.aj = i15;
        return i13;
    }

    static int gb(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ia iaVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        iaVar.aa -= iaVar.ae * i4;
        iaVar.ak -= iaVar.as * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - -620049839) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (i15 & 255)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                iaVar.aa += iaVar.ae * i13;
                iaVar.ak += iaVar.as * i13;
                iaVar.ao = i12;
                iaVar.aj = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (i15 & 255)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (i15 & 255)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        iaVar.aa += iaVar.ae * i13;
        iaVar.ak += iaVar.as * i13;
        iaVar.ao = i12;
        iaVar.aj = i15;
        return i13;
    }

    static int gu(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ia iaVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        iaVar.aa -= iaVar.ae * i4;
        iaVar.ak -= iaVar.as * i4;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - -1019725193) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16 + 1] - b) * (1480894295 & i15)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    byte b2 = bArr[i15 >> 8];
                    i14 = i13 + 1;
                    iArr[i13] = (((((i11 - b2) * (-899049411 & i15)) + (b2 << 8)) * i12) >> 6) + iArr[i13];
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                iaVar.aa += iaVar.ae * i13;
                iaVar.ak += iaVar.as * i13;
                iaVar.ao = i12;
                iaVar.aj = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b3 = bArr[i162];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162 + 1] - b3) * (1480894295 & i15)) + (b3 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = ((((i9 - i15) + i10) - 1) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            byte b22 = bArr[i15 >> 8];
            i14 = i13 + 1;
            iArr[i13] = (((((i11 - b22) * (-899049411 & i15)) + (b22 << 8)) * i12) >> 6) + iArr[i13];
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        iaVar.aa += iaVar.ae * i13;
        iaVar.ak += iaVar.as * i13;
        iaVar.ao = i12;
        iaVar.aj = i15;
        return i13;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cl(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.cl(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gd(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gd(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ge(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0083;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = 1540895028; // 0x5bd83134 float:1.21705389E17 double:7.61303297E-315;
        r7 = r7 & r5;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0057:
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
    L_0x0072:
        if (r3 >= r6) goto L_0x009b;
    L_0x0074:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = 1952324532; // 0x745e1bb4 float:7.0388903E31 double:9.64576481E-315;
        r8 = r8 & r4;
        r5 = r5 * r8;
        r5 = r5 + r7;
        goto L_0x0057;
    L_0x0083:
        if (r24 == 0) goto L_0x0094;
    L_0x0085:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b8;
    L_0x0094:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x0072;
    L_0x009b:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b8:
        r21 = r1;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.ge(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gk(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gk(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int go(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0055;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        if (r24 == 0) goto L_0x0066;
    L_0x0057:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0066:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006c:
        if (r3 >= r6) goto L_0x0096;
    L_0x006e:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006c;
    L_0x0096:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b3:
        r21 = r1;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.go(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gt(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001d;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r1 = r1 + -257;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x001f;
    L_0x001d:
        r1 = r21;
    L_0x001f:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0028:
        if (r4 >= r1) goto L_0x0072;
    L_0x002a:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0028;
    L_0x0055:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x0072:
        if (r24 == 0) goto L_0x0083;
    L_0x0074:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b3;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0055;
    L_0x008b:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = r4 & 255;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b3:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gt(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gw(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001f;
    L_0x0010:
        r1 = r22 - r14;
        r1 = r1 + r24;
        r2 = -403687707; // 0xffffffffe7f036e5 float:-2.2687612E24 double:NaN;
        r1 = r1 - r2;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0021;
    L_0x001f:
        r1 = r21;
    L_0x0021:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x002a:
        if (r4 >= r1) goto L_0x0057;
    L_0x002c:
        r6 = r5 >> 8;
        r7 = r12[r6];
        r8 = r7 << 8;
        r6 = r6 + 1;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x002a;
    L_0x0057:
        if (r24 == 0) goto L_0x0068;
    L_0x0059:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 + -1;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b7;
    L_0x0068:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006e:
        if (r3 >= r6) goto L_0x009a;
    L_0x0070:
        r5 = r4 >> 8;
        r5 = r12[r5];
        r7 = r5 << 8;
        r5 = r25 - r5;
        r8 = -1614721287; // 0xffffffff9fc14ef9 float:-8.186933E-20 double:NaN;
        r8 = r8 & r4;
        r5 = r5 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006e;
    L_0x009a:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b7:
        r21 = r1;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gw(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    static int co(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ia iaVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        iaVar.aa -= iaVar.ae * i4;
        iaVar.ak -= iaVar.as * i4;
        if (i10 != 0) {
            i12 = ((((i9 + bq.ah) - i3) + i10) / i10) + i4;
            if (i12 <= i8) {
                i13 = i5;
                i14 = i4;
                i15 = i3;
                while (i14 < i12) {
                    int i16 = i15 >> 8;
                    byte b = bArr[i16 - 1];
                    i4 = i14 + 1;
                    iArr[i14] = (((((bArr[i16] - b) * (i15 & 255)) + (b << 8)) * i13) >> 6) + iArr[i14];
                    i13 += i6;
                    i14 = i4;
                    i15 += i10;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i15) + i10) / i10) + i14;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                i12 = i13;
                i13 = i14;
                while (i13 < i8) {
                    i14 = i13 + 1;
                    iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
                    i12 += i6;
                    i15 += i10;
                    i13 = i14;
                }
                iaVar.aa += iaVar.ae * i13;
                iaVar.ak += iaVar.as * i13;
                iaVar.ao = i12;
                iaVar.aj = i15;
                return i13;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i4;
        i15 = i3;
        while (i14 < i12) {
            int i162 = i15 >> 8;
            byte b2 = bArr[i162 - 1];
            i4 = i14 + 1;
            iArr[i14] = (((((bArr[i162] - b2) * (i15 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i14];
            i13 += i6;
            i14 = i4;
            i15 += i10;
        }
        if (i10 != 0) {
            i12 = (((i9 - i15) + i10) / i10) + i14;
            if (i12 <= i8) {
                i8 = i12;
            }
        }
        i12 = i13;
        i13 = i14;
        while (i13 < i8) {
            i14 = i13 + 1;
            iArr[i13] = iArr[i13] + ((((i11 << 8) + ((bArr[i15 >> 8] - i11) * (i15 & 255))) * i12) >> 6);
            i12 += i6;
            i15 += i10;
            i13 = i14;
        }
        iaVar.aa += iaVar.ae * i13;
        iaVar.ak += iaVar.as * i13;
        iaVar.ao = i12;
        iaVar.aj = i15;
        return i13;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cc(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0056;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        if (r24 == 0) goto L_0x0065;
    L_0x0058:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b2;
    L_0x0065:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006b:
        if (r3 >= r6) goto L_0x0095;
    L_0x006d:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006b;
    L_0x0095:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b2:
        r21 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.cc(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gc(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0056;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        if (r24 == 0) goto L_0x0065;
    L_0x0058:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b2;
    L_0x0065:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006b:
        if (r3 >= r6) goto L_0x0095;
    L_0x006d:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006b;
    L_0x0095:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b2:
        r21 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gc(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gp(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0056;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        if (r24 == 0) goto L_0x0065;
    L_0x0058:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b2;
    L_0x0065:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006b:
        if (r3 >= r6) goto L_0x0095;
    L_0x006d:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006b;
    L_0x0095:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b2:
        r21 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gp(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gx(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r22;
        r1 = r0 + 256;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0020;
    L_0x001e:
        r1 = r21;
    L_0x0020:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x0029:
        if (r4 >= r1) goto L_0x0056;
    L_0x002b:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x0029;
    L_0x0056:
        if (r24 == 0) goto L_0x0065;
    L_0x0058:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b2;
    L_0x0065:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x006b:
        if (r3 >= r6) goto L_0x0095;
    L_0x006d:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = r4 & 255;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x006b;
    L_0x0095:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x00b2:
        r21 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gx(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gz(int r10, int r11, byte[] r12, int[] r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, ia r23, int r24, int r25) {
        /*
        r0 = r23;
        r1 = r0.ao;
        r0 = r23;
        r2 = r0.am;
        r2 = r2 * r15;
        r1 = r1 - r2;
        r0 = r23;
        r0.ao = r1;
        if (r24 == 0) goto L_0x001f;
    L_0x0010:
        r1 = -1759730652; // 0xffffffff971ca424 float:-5.0613493E-25 double:NaN;
        r1 = r1 + r22;
        r1 = r1 - r14;
        r1 = r1 + r24;
        r1 = r1 / r24;
        r1 = r1 + r15;
        r0 = r21;
        if (r1 <= r0) goto L_0x0021;
    L_0x001f:
        r1 = r21;
    L_0x0021:
        r4 = r15 << 1;
        r1 = r1 << 1;
        r2 = r17;
        r3 = r16;
        r5 = r14;
    L_0x002a:
        if (r4 >= r1) goto L_0x0074;
    L_0x002c:
        r6 = r5 >> 8;
        r7 = r6 + -1;
        r7 = r12[r7];
        r8 = r7 << 8;
        r6 = r12[r6];
        r6 = r6 - r7;
        r7 = r5 & 255;
        r6 = r6 * r7;
        r6 = r6 + r8;
        r7 = r4 + 1;
        r8 = r13[r4];
        r9 = r6 * r3;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r4] = r8;
        r3 = r3 + r18;
        r4 = r7 + 1;
        r8 = r13[r7];
        r6 = r6 * r2;
        r6 = r6 >> 6;
        r6 = r6 + r8;
        r13[r7] = r6;
        r2 = r2 + r19;
        r5 = r5 + r24;
        goto L_0x002a;
    L_0x0057:
        r3 = r3 >> 1;
        r0 = r23;
        r5 = r0.ao;
        r0 = r23;
        r6 = r0.am;
        r6 = r6 * r3;
        r5 = r5 + r6;
        r0 = r23;
        r0.ao = r5;
        r0 = r23;
        r0.aa = r2;
        r0 = r23;
        r0.ak = r1;
        r0 = r23;
        r0.aj = r4;
        return r3;
    L_0x0074:
        if (r24 == 0) goto L_0x0083;
    L_0x0076:
        r1 = r4 >> 1;
        r6 = r22 - r5;
        r6 = r6 + r24;
        r6 = r6 / r24;
        r1 = r1 + r6;
        r0 = r21;
        if (r1 <= r0) goto L_0x00b5;
    L_0x0083:
        r6 = r21 << 1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
    L_0x0089:
        if (r3 >= r6) goto L_0x0057;
    L_0x008b:
        r5 = r25 << 8;
        r7 = r4 >> 8;
        r7 = r12[r7];
        r7 = r7 - r25;
        r8 = 1904618601; // 0x71862c69 float:1.3287898E30 double:9.41006619E-315;
        r8 = r8 & r4;
        r7 = r7 * r8;
        r5 = r5 + r7;
        r7 = r3 + 1;
        r8 = r13[r3];
        r9 = r5 * r2;
        r9 = r9 >> 6;
        r8 = r8 + r9;
        r13[r3] = r8;
        r2 = r2 + r18;
        r3 = r7 + 1;
        r8 = r13[r7];
        r5 = r5 * r1;
        r5 = r5 >> 6;
        r5 = r5 + r8;
        r13[r7] = r5;
        r1 = r1 + r19;
        r4 = r4 + r24;
        goto L_0x0089;
    L_0x00b5:
        r21 = r1;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.gz(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, ia, int, int):int");
    }
}
