package defpackage;

import java.util.Iterator;

public class jz implements Iterator {
    jt ac;
    jr aj;
    jt an = null;

    jz(jr jrVar) {
        this.aj = jrVar;
        this.ac = this.aj.aj.fr;
        this.an = null;
    }

    public Object ac() {
        jt jtVar = null;
        jt jtVar2 = this.ac;
        if (jtVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jtVar2.fr;
            jtVar = jtVar2;
        }
        this.an = jtVar;
        return jtVar;
    }

    public Object aj() {
        jt jtVar = null;
        jt jtVar2 = this.ac;
        if (jtVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jtVar2.fr;
            jtVar = jtVar2;
        }
        this.an = jtVar;
        return jtVar;
    }

    public Object an() {
        jt jtVar = null;
        jt jtVar2 = this.ac;
        if (jtVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jtVar2.fr;
            jtVar = jtVar2;
        }
        this.an = jtVar;
        return jtVar;
    }

    public Object aq() {
        jt jtVar = null;
        jt jtVar2 = this.ac;
        if (jtVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jtVar2.fr;
            jtVar = jtVar2;
        }
        this.an = jtVar;
        return jtVar;
    }

    public Object next() {
        jt jtVar = null;
        jt jtVar2 = this.ac;
        if (jtVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jtVar2.fr;
            jtVar = jtVar2;
        }
        this.an = jtVar;
        return jtVar;
    }

    public boolean aa() {
        return this.ac != this.aj.aj;
    }

    public boolean ak() {
        return this.ac != this.aj.aj;
    }

    public boolean ao() {
        return this.ac != this.aj.aj;
    }

    public boolean hasNext() {
        return this.ac != this.aj.aj;
    }

    public void ap() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.kn();
        this.an = null;
    }

    public void remove() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.kn();
        this.an = null;
    }
}
