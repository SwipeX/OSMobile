package defpackage;

public class gj {
    static final int aj = 100;
    public static final int ak = 38;
    gu[] ac;
    int an;

    gj() {
        try {
            this.ac = new gu[100];
        } catch (Throwable e) {
            throw ei.ac(e, "gj.<init>(" + ')');
        }
    }

    gu aj(int i, String str, String str2, String str3, int i2) {
        try {
            gu guVar = this.ac[99];
            for (int i3 = this.an * -1732682227; i3 > 0; i3--) {
                if (100 != i3) {
                    this.ac[i3] = this.ac[i3 - 1];
                }
            }
            if (guVar == null) {
                guVar = new gu(i, str, str3, str2);
            } else {
                guVar.kn();
                guVar.da();
                guVar.aj(i, str, str3, str2, (byte) 23);
            }
            this.ac[0] = guVar;
            if (this.an * -1732682227 < 100) {
                this.an -= 692248379;
            }
            return guVar;
        } catch (Throwable e) {
            throw ei.ac(e, "gj.aj(" + ')');
        }
    }

    gu aq(int i, String str, String str2, String str3) {
        gu guVar = this.ac[99];
        for (int i2 = this.an * -39835518; i2 > 0; i2--) {
            if (100 != i2) {
                this.ac[i2] = this.ac[i2 - 1];
            }
        }
        if (guVar == null) {
            guVar = new gu(i, str, str3, str2);
        } else {
            guVar.kn();
            guVar.da();
            guVar.aj(i, str, str3, str2, (byte) 110);
        }
        this.ac[0] = guVar;
        if (-1732682227 * this.an < -1469779572) {
            this.an -= 393353502;
        }
        return guVar;
    }

    gu aa(int i) {
        if (i < 0 || i >= -1732682227 * this.an) {
            return null;
        }
        return this.ac[i];
    }

    gu ac(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < -1732682227 * this.an) {
                    return this.ac[i];
                }
            } catch (Throwable e) {
                throw ei.ac(e, "gj.ac(" + ')');
            }
        }
        return null;
    }

    gu ak(int i) {
        return (i < 0 || i >= -1732682227 * this.an) ? null : this.ac[i];
    }

    gu ao(int i) {
        return (i < 0 || i >= -1732682227 * this.an) ? null : this.ac[i];
    }

    int an(int i) {
        try {
            return this.an * -1732682227;
        } catch (Throwable e) {
            throw ei.ac(e, "gj.an(" + ')');
        }
    }

    int ap() {
        return this.an * -1732682227;
    }
}
