package defpackage;

public class iw extends iu {
    jm ac = new jm();
    jm aj = new jm();
    int an = 0;
    int aq = -1;

    public final synchronized void ae(iu iuVar) {
        this.aj.an(iuVar);
    }

    public final synchronized void aj(iu iuVar) {
        this.aj.an(iuVar);
    }

    public final synchronized void am(iu iuVar) {
        this.aj.an(iuVar);
    }

    public final synchronized void ac(iu iuVar) {
        iuVar.kn();
    }

    public final synchronized void al(iu iuVar) {
        iuVar.kn();
    }

    public final synchronized void as(iu iuVar) {
        iuVar.kn();
    }

    void an() {
        if (this.an > 0) {
            jj jjVar = (jj) this.ac.ak();
            while (jjVar != null) {
                jjVar.aj -= this.an;
                jjVar = (jj) this.ac.at();
            }
            this.aq -= this.an;
            this.an = 0;
        }
    }

    void ax() {
        if (this.an > 0) {
            jj jjVar = (jj) this.ac.ak();
            while (jjVar != null) {
                jjVar.aj -= this.an;
                jjVar = (jj) this.ac.at();
            }
            this.aq -= this.an;
            this.an = 0;
        }
    }

    void az() {
        if (this.an > 0) {
            jj jjVar = (jj) this.ac.ak();
            while (jjVar != null) {
                jjVar.aj -= this.an;
                jjVar = (jj) this.ac.at();
            }
            this.aq -= this.an;
            this.an = 0;
        }
    }

    void af(jt jtVar, jj jjVar) {
        jt jtVar2 = jtVar;
        while (jtVar2 != this.ac.aj && ((jj) jtVar2).aj <= jjVar.aj) {
            jtVar2 = jtVar2.fr;
        }
        jm.aq(jjVar, jtVar2);
        this.aq = ((jj) this.ac.aj.fr).aj;
    }

    void aq(jt jtVar, jj jjVar) {
        jt jtVar2 = jtVar;
        while (jtVar2 != this.ac.aj && ((jj) jtVar2).aj <= jjVar.aj) {
            jtVar2 = jtVar2.fr;
        }
        jm.aq(jjVar, jtVar2);
        this.aq = ((jj) this.ac.aj.fr).aj;
    }

    void au(jt jtVar, jj jjVar) {
        jt jtVar2 = jtVar;
        while (jtVar2 != this.ac.aj && ((jj) jtVar2).aj <= jjVar.aj) {
            jtVar2 = jtVar2.fr;
        }
        jm.aq(jjVar, jtVar2);
        this.aq = ((jj) this.ac.aj.fr).aj;
    }

    void ao(jj jjVar) {
        jjVar.kn();
        jjVar.aj();
        jt jtVar = this.ac.aj.fr;
        if (jtVar == this.ac.aj) {
            this.aq = -1;
        } else {
            this.aq = ((jj) jtVar).aj;
        }
    }

    void av(jj jjVar) {
        jjVar.kn();
        jjVar.aj();
        jt jtVar = this.ac.aj.fr;
        if (jtVar == this.ac.aj) {
            this.aq = -1;
        } else {
            this.aq = ((jj) jtVar).aj;
        }
    }

    protected iu aa() {
        return (iu) this.aj.ak();
    }

    protected iu bi() {
        return (iu) this.aj.ak();
    }

    protected iu bx() {
        return (iu) this.aj.ak();
    }

    protected iu ag() {
        return (iu) this.aj.at();
    }

    protected iu ak() {
        return (iu) this.aj.at();
    }

    protected iu ay() {
        return (iu) this.aj.at();
    }

    protected int ab() {
        return 0;
    }

    protected int ad() {
        return 0;
    }

    protected int ap() {
        return 0;
    }

    protected int ar() {
        return 0;
    }

    public final synchronized void at(int[] iArr, int i, int i2) {
        do {
            if (this.aq < 0) {
                ah(iArr, i, i2);
                break;
            } else if (this.an + i2 < this.aq) {
                this.an += i2;
                ah(iArr, i, i2);
                break;
            } else {
                int i3 = this.aq - this.an;
                ah(iArr, i, i3);
                i += i3;
                i2 -= i3;
                this.an = i3 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i2 != 0);
    }

    public final synchronized void bp(int[] iArr, int i, int i2) {
        do {
            if (this.aq < 0) {
                ah(iArr, i, i2);
                break;
            } else if (this.an + i2 < this.aq) {
                this.an += i2;
                ah(iArr, i, i2);
                break;
            } else {
                int i3 = this.aq - this.an;
                ah(iArr, i, i3);
                i += i3;
                i2 -= i3;
                this.an = i3 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i2 != 0);
    }

    void ah(int[] iArr, int i, int i2) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.gj(iArr, i, i2);
            iuVar = (iu) this.aj.at();
        }
    }

    void bh(int[] iArr, int i, int i2) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.gj(iArr, i, i2);
            iuVar = (iu) this.aj.at();
        }
    }

    void bm(int[] iArr, int i, int i2) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.gj(iArr, i, i2);
            iuVar = (iu) this.aj.at();
        }
    }

    void bt(int[] iArr, int i, int i2) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.gj(iArr, i, i2);
            iuVar = (iu) this.aj.at();
        }
    }

    public final synchronized void ai(int i) {
        do {
            if (this.aq < 0) {
                aw(i);
                break;
            } else if (this.an + i < this.aq) {
                this.an += i;
                aw(i);
                break;
            } else {
                int i2 = this.aq - this.an;
                aw(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void bb(int i) {
        do {
            if (this.aq < 0) {
                aw(i);
                break;
            } else if (this.an + i < this.aq) {
                this.an += i;
                aw(i);
                break;
            } else {
                int i2 = this.aq - this.an;
                aw(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void br(int i) {
        do {
            if (this.aq < 0) {
                aw(i);
                break;
            } else if (this.an + i < this.aq) {
                this.an += i;
                aw(i);
                break;
            } else {
                int i2 = this.aq - this.an;
                aw(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i != 0);
    }

    public final synchronized void bu(int i) {
        do {
            if (this.aq < 0) {
                aw(i);
                break;
            } else if (this.an + i < this.aq) {
                this.an += i;
                aw(i);
                break;
            } else {
                int i2 = this.aq - this.an;
                aw(i2);
                i -= i2;
                this.an = i2 + this.an;
                an();
                jj jjVar = (jj) this.ac.ak();
                synchronized (jjVar) {
                    int ac = jjVar.ac(this);
                    if (ac < 0) {
                        jjVar.aj = 0;
                        ao(jjVar);
                    } else {
                        jjVar.aj = ac;
                        aq(jjVar.fr, jjVar);
                    }
                }
            }
        } while (i != 0);
    }

    void aw(int i) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.ai(i);
            iuVar = (iu) this.aj.at();
        }
    }

    void bd(int i) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.ai(i);
            iuVar = (iu) this.aj.at();
        }
    }

    void by(int i) {
        iu iuVar = (iu) this.aj.ak();
        while (iuVar != null) {
            iuVar.ai(i);
            iuVar = (iu) this.aj.at();
        }
    }
}
