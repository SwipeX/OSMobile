package defpackage;

public final class jb {
    jt[] ac;
    int aj;
    jt an;
    int ao = 0;
    jt aq;

    public jb(int i) {
        int i2 = 0;
        this.aj = i;
        this.ac = new jt[i];
        while (i2 < i) {
            jt[] jtVarArr = this.ac;
            jt jtVar = new jt();
            jtVarArr[i2] = jtVar;
            jtVar.fr = jtVar;
            jtVar.fp = jtVar;
            i2++;
        }
    }

    public jt aa(long j) {
        jt jtVar = this.ac[(int) (((long) (this.aj - 1)) & j)];
        this.an = jtVar.fr;
        while (this.an != jtVar) {
            if (this.an.fy == j) {
                jt jtVar2 = this.an;
                this.an = this.an.fr;
                return jtVar2;
            }
            this.an = this.an.fr;
        }
        this.an = null;
        return null;
    }

    public jt aj(long j) {
        jt jtVar = this.ac[(int) (((long) (this.aj - 1)) & j)];
        this.an = jtVar.fr;
        while (this.an != jtVar) {
            if (this.an.fy == j) {
                jt jtVar2 = this.an;
                this.an = this.an.fr;
                return jtVar2;
            }
            this.an = this.an.fr;
        }
        this.an = null;
        return null;
    }

    public jt ak(long j) {
        jt jtVar = this.ac[(int) (((long) (this.aj - 1)) & j)];
        this.an = jtVar.fr;
        while (this.an != jtVar) {
            if (this.an.fy == j) {
                jt jtVar2 = this.an;
                this.an = this.an.fr;
                return jtVar2;
            }
            this.an = this.an.fr;
        }
        this.an = null;
        return null;
    }

    public jt ap(long j) {
        jt jtVar = this.ac[(int) (((long) (this.aj - 1)) & j)];
        this.an = jtVar.fr;
        while (this.an != jtVar) {
            if (this.an.fy == j) {
                jt jtVar2 = this.an;
                this.an = this.an.fr;
                return jtVar2;
            }
            this.an = this.an.fr;
        }
        this.an = null;
        return null;
    }

    public void ac(jt jtVar, long j) {
        if (jtVar.fp != null) {
            jtVar.kn();
        }
        jt jtVar2 = this.ac[(int) (((long) (this.aj - 1)) & j)];
        jtVar.fp = jtVar2.fp;
        jtVar.fr = jtVar2;
        jtVar.fp.fr = jtVar;
        jtVar.fr.fp = jtVar;
        jtVar.fy = j;
    }

    public void at(jt jtVar, long j) {
        if (jtVar.fp != null) {
            jtVar.kn();
        }
        jt jtVar2 = this.ac[(int) (((long) (this.aj - 1)) & j)];
        jtVar.fp = jtVar2.fp;
        jtVar.fr = jtVar2;
        jtVar.fp.fr = jtVar;
        jtVar.fr.fp = jtVar;
        jtVar.fy = j;
    }

    void ah() {
        for (int i = 0; i < this.aj; i++) {
            jt jtVar = this.ac[i];
            while (true) {
                jt jtVar2 = jtVar.fr;
                if (jtVar2 == jtVar) {
                    break;
                }
                jtVar2.kn();
            }
        }
        this.an = null;
        this.aq = null;
    }

    void an() {
        for (int i = 0; i < this.aj; i++) {
            jt jtVar = this.ac[i];
            while (true) {
                jt jtVar2 = jtVar.fr;
                if (jtVar2 == jtVar) {
                    break;
                }
                jtVar2.kn();
            }
        }
        this.an = null;
        this.aq = null;
    }

    public jt ai() {
        this.ao = 0;
        return ao();
    }

    public jt aq() {
        this.ao = 0;
        return ao();
    }

    public jt ae() {
        jt jtVar;
        if (this.ao <= 0 || this.aq == this.ac[this.ao - 1]) {
            while (this.ao < this.aj) {
                jt[] jtVarArr = this.ac;
                int i = this.ao;
                this.ao = i + 1;
                jtVar = jtVarArr[i].fr;
                if (jtVar != this.ac[this.ao - 1]) {
                    this.aq = jtVar.fr;
                    return jtVar;
                }
            }
            return null;
        }
        jtVar = this.aq;
        this.aq = jtVar.fr;
        return jtVar;
    }

    public jt am() {
        jt jtVar;
        if (this.ao <= 0 || this.aq == this.ac[this.ao - 1]) {
            while (this.ao < this.aj) {
                jt[] jtVarArr = this.ac;
                int i = this.ao;
                this.ao = i + 1;
                jtVar = jtVarArr[i].fr;
                if (jtVar != this.ac[this.ao - 1]) {
                    this.aq = jtVar.fr;
                    return jtVar;
                }
            }
            return null;
        }
        jtVar = this.aq;
        this.aq = jtVar.fr;
        return jtVar;
    }

    public jt ao() {
        jt jtVar;
        if (this.ao <= 0 || this.aq == this.ac[this.ao - 1]) {
            while (this.ao < this.aj) {
                jt[] jtVarArr = this.ac;
                int i = this.ao;
                this.ao = i + 1;
                jtVar = jtVarArr[i].fr;
                if (jtVar != this.ac[this.ao - 1]) {
                    this.aq = jtVar.fr;
                    return jtVar;
                }
            }
            return null;
        }
        jtVar = this.aq;
        this.aq = jtVar.fr;
        return jtVar;
    }

    public jt aw() {
        jt jtVar;
        if (this.ao <= 0 || this.aq == this.ac[this.ao - 1]) {
            while (this.ao < this.aj) {
                jt[] jtVarArr = this.ac;
                int i = this.ao;
                this.ao = i + 1;
                jtVar = jtVarArr[i].fr;
                if (jtVar != this.ac[this.ao - 1]) {
                    this.aq = jtVar.fr;
                    return jtVar;
                }
            }
            return null;
        }
        jtVar = this.aq;
        this.aq = jtVar.fr;
        return jtVar;
    }
}
