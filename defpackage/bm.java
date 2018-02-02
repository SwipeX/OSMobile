package defpackage;

public class bm extends je {
    static final int au = 2097152;
    static int aw = 0;
    static final int bl = 58;
    public final int ac;
    public final int aj;
    public final int[] an;
    public final int[] aq;

    bm(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        try {
            this.aj = -1574753479 * i;
            this.ac = -1270117999 * i2;
            this.an = iArr;
            this.aq = iArr2;
        } catch (Throwable e) {
            throw ei.ac(e, "bm.<init>(" + ')');
        }
    }

    public boolean ac(int i, int i2) {
        if (i2 >= 0 && i2 < this.aq.length) {
            int i3 = this.aq[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }

    public boolean aj(int i, int i2, byte b) {
        if (i2 >= 0) {
            try {
                if (i2 < this.aq.length) {
                    int i3 = this.aq[i2];
                    if (i >= i3 && i <= i3 + this.an[i2]) {
                        return true;
                    }
                }
            } catch (Throwable e) {
                throw ei.ac(e, "bm.aj(" + ')');
            }
        }
        return false;
    }

    public boolean an(int i, int i2) {
        if (i2 >= 0 && i2 < this.aq.length) {
            int i3 = this.aq[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }

    public boolean ao(int i, int i2) {
        if (i2 >= 0 && i2 < this.aq.length) {
            int i3 = this.aq[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }

    public boolean aq(int i, int i2) {
        if (i2 >= 0 && i2 < this.aq.length) {
            int i3 = this.aq[i2];
            if (i >= i3 && i <= i3 + this.an[i2]) {
                return true;
            }
        }
        return false;
    }
}
