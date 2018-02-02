package defpackage;

public class jf {
    final Object[] ac;
    final Class aj;
    int an = 0;

    public jf(Class cls, int i) {
        this.aj = cls;
        this.ac = new Object[i];
    }

    Object aa() {
        try {
            return this.aj.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    Object aj() {
        try {
            return this.aj.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    Object ao() {
        try {
            return this.aj.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    Object ac() {
        Object[] objArr = this.ac;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    Object ak() {
        Object[] objArr = this.ac;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    Object ap() {
        Object[] objArr = this.ac;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    Object at() {
        Object[] objArr = this.ac;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    public synchronized Object ae() {
        Object aj;
        if (this.an == 0) {
            aj = aj();
        } else {
            aj = ac();
        }
        return aj;
    }

    public synchronized Object ah() {
        return this.an == 0 ? aj() : ac();
    }

    public synchronized Object ai() {
        Object aj;
        if (this.an == 0) {
            aj = aj();
        } else {
            aj = ac();
        }
        return aj;
    }

    public synchronized Object am() {
        return this.an == 0 ? aj() : ac();
    }

    public synchronized Object an() {
        return this.an == 0 ? aj() : ac();
    }

    public synchronized Object aw() {
        return this.an == 0 ? aj() : ac();
    }

    public synchronized void al(Object obj) {
        if (this.an < this.ac.length) {
            Object[] objArr = this.ac;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }

    public synchronized void aq(Object obj) {
        if (this.an < this.ac.length) {
            Object[] objArr = this.ac;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }

    public synchronized void as(Object obj) {
        if (this.an < this.ac.length) {
            Object[] objArr = this.ac;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }
}
