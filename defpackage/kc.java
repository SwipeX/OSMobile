package defpackage;

public final class kc implements lx {
    int aj;

    kc() {
        try {
            this.aj = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "kc.<init>(" + ')');
        }
    }

    public synchronized int ac() {
        int i;
        i = this.aj * 929182685;
        this.aj = 0;
        return i;
    }

    public synchronized int aj(int i) {
        int i2;
        try {
            i2 = this.aj * 929182685;
            this.aj = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "kc.aj(" + ')');
        }
        return i2;
    }
}
