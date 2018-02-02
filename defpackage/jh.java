package defpackage;

import java.util.Iterator;

public class jh implements Iterator {
    jt ac;
    jk aj;
    int an;
    jt aq = null;

    jh(jk jkVar) {
        this.aj = jkVar;
        at();
    }

    void ah() {
        this.ac = this.aj.ac[0].fr;
        this.an = 1;
        this.aq = null;
    }

    void ai() {
        this.ac = this.aj.ac[0].fr;
        this.an = 1;
        this.aq = null;
    }

    void at() {
        this.ac = this.aj.ac[0].fr;
        this.an = 1;
        this.aq = null;
    }

    void aw() {
        this.ac = this.aj.ac[0].fr;
        this.an = 1;
        this.aq = null;
    }

    public Object ac() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            jt jtVar = this.ac;
            this.ac = jtVar.fr;
            this.aq = jtVar;
            return jtVar;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            jtVar = jtVarArr[i].fr;
            if (jtVar != this.aj.ac[this.an - 1]) {
                this.ac = jtVar.fr;
                this.aq = jtVar;
                return jtVar;
            }
        }
        return null;
    }

    public Object aj() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            jt jtVar = this.ac;
            this.ac = jtVar.fr;
            this.aq = jtVar;
            return jtVar;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            jtVar = jtVarArr[i].fr;
            if (jtVar != this.aj.ac[this.an - 1]) {
                this.ac = jtVar.fr;
                this.aq = jtVar;
                return jtVar;
            }
        }
        return null;
    }

    public Object an() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            jt jtVar = this.ac;
            this.ac = jtVar.fr;
            this.aq = jtVar;
            return jtVar;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            jtVar = jtVarArr[i].fr;
            if (jtVar != this.aj.ac[this.an - 1]) {
                this.ac = jtVar.fr;
                this.aq = jtVar;
                return jtVar;
            }
        }
        return null;
    }

    public Object aq() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            jt jtVar = this.ac;
            this.ac = jtVar.fr;
            this.aq = jtVar;
            return jtVar;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            jtVar = jtVarArr[i].fr;
            if (jtVar != this.aj.ac[this.an - 1]) {
                this.ac = jtVar.fr;
                this.aq = jtVar;
                return jtVar;
            }
        }
        return null;
    }

    public Object next() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            jt jtVar = this.ac;
            this.ac = jtVar.fr;
            this.aq = jtVar;
            return jtVar;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            jtVar = jtVarArr[i].fr;
            if (jtVar != this.aj.ac[this.an - 1]) {
                this.ac = jtVar.fr;
                this.aq = jtVar;
                return jtVar;
            }
        }
        return null;
    }

    public boolean aa() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            return true;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            if (jtVarArr[i].fr != this.aj.ac[this.an - 1]) {
                this.ac = this.aj.ac[this.an - 1].fr;
                return true;
            }
            this.ac = this.aj.ac[this.an - 1];
        }
        return false;
    }

    public boolean ak() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            return true;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            if (jtVarArr[i].fr != this.aj.ac[this.an - 1]) {
                this.ac = this.aj.ac[this.an - 1].fr;
                return true;
            }
            this.ac = this.aj.ac[this.an - 1];
        }
        return false;
    }

    public boolean ao() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            return true;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            if (jtVarArr[i].fr != this.aj.ac[this.an - 1]) {
                this.ac = this.aj.ac[this.an - 1].fr;
                return true;
            }
            this.ac = this.aj.ac[this.an - 1];
        }
        return false;
    }

    public boolean hasNext() {
        if (this.ac != this.aj.ac[this.an - 1]) {
            return true;
        }
        while (this.an < this.aj.aj) {
            jt[] jtVarArr = this.aj.ac;
            int i = this.an;
            this.an = i + 1;
            if (jtVarArr[i].fr != this.aj.ac[this.an - 1]) {
                this.ac = this.aj.ac[this.an - 1].fr;
                return true;
            }
            this.ac = this.aj.ac[this.an - 1];
        }
        return false;
    }

    public void ap() {
        if (this.aq == null) {
            throw new IllegalStateException();
        }
        this.aq.kn();
        this.aq = null;
    }

    public void remove() {
        if (this.aq == null) {
            throw new IllegalStateException();
        }
        this.aq.kn();
        this.aq = null;
    }
}
