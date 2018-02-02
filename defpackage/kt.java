package defpackage;

import java.net.URL;

public class kt {
    public static final int ax = 64;
    final ka ac;
    final URL aj;
    volatile boolean an;
    volatile byte[] aq;

    kt(URL url, ka kaVar) {
        try {
            this.aj = url;
            this.ac = kaVar;
        } catch (Throwable e) {
            throw ei.ac(e, "kt.<init>(" + ')');
        }
    }

    void aj(int i) {
        try {
            this.an = true;
            if (this.ac != null) {
                this.ac.aj(this, 818169677);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "kt.aj(" + ')');
        }
    }

    void ao() {
        this.an = true;
        if (this.ac != null) {
            this.ac.aj(this, -1314182164);
        }
    }

    void aq() {
        this.an = true;
        if (this.ac != null) {
            this.ac.aj(this, -1517371931);
        }
    }

    public boolean aa() {
        return this.an;
    }

    public boolean ac(int i) {
        try {
            return this.an;
        } catch (Throwable e) {
            throw ei.ac(e, "kt.ac(" + ')');
        }
    }

    public byte[] ak() {
        return this.aq;
    }

    public byte[] an(int i) {
        try {
            return this.aq;
        } catch (Throwable e) {
            throw ei.ac(e, "kt.an(" + ')');
        }
    }

    public byte[] ap() {
        return this.aq;
    }
}
