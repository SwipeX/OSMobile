package defpackage;

import java.util.Iterator;

public class ja implements Iterator {
    je ac;
    jw aj;
    je an = null;

    ja(jw jwVar) {
        this.aj = jwVar;
        this.ac = this.aj.aj.dv;
        this.an = null;
    }

    public Object ac() {
        je jeVar = null;
        je jeVar2 = this.ac;
        if (jeVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jeVar2.dv;
            jeVar = jeVar2;
        }
        this.an = jeVar;
        return jeVar;
    }

    public Object aj() {
        je jeVar = this.ac;
        if (jeVar == this.aj.aj) {
            this.ac = null;
            jeVar = null;
        } else {
            this.ac = jeVar.dv;
        }
        this.an = jeVar;
        return jeVar;
    }

    public Object an() {
        je jeVar = this.ac;
        if (jeVar == this.aj.aj) {
            this.ac = null;
            jeVar = null;
        } else {
            this.ac = jeVar.dv;
        }
        this.an = jeVar;
        return jeVar;
    }

    public Object aq() {
        je jeVar = null;
        je jeVar2 = this.ac;
        if (jeVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jeVar2.dv;
            jeVar = jeVar2;
        }
        this.an = jeVar;
        return jeVar;
    }

    public Object next() {
        je jeVar = null;
        je jeVar2 = this.ac;
        if (jeVar2 == this.aj.aj) {
            this.ac = null;
        } else {
            this.ac = jeVar2.dv;
            jeVar = jeVar2;
        }
        this.an = jeVar;
        return jeVar;
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
        this.an.da();
        this.an = null;
    }

    public void remove() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.da();
        this.an = null;
    }
}
