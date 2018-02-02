package defpackage;

import com.jagex.oldscape.osrenderer.aj;
import com.jagex.oldscape.osrenderer.zv;

public class bo {
    int aa;
    final int ac;
    long ah;
    final int aj;
    int[] ak;
    int an;
    int ao;
    int ap;
    int aq;
    boolean at;

    bo(int i, int i2) {
        try {
            this.at = false;
            this.aj = 2121281949 * i;
            this.ac = -547918575 * i2;
            this.ak = new int[(i * i2)];
        } catch (Throwable e) {
            throw ei.ac(e, "bo.<init>(" + ')');
        }
    }

    void aj(int i, int i2, int i3, int i4, int i5) {
        try {
            this.an = 883547537 * i;
            this.aq = -1742084931 * i2;
            this.ao = 123566131 * i3;
            this.aa = -370570319 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "bo.aj(" + ')');
        }
    }

    void ak(int i, int i2, int i3, int i4) {
        this.an = 883547537 * i;
        this.aq = -1742084931 * i2;
        this.ao = 123566131 * i3;
        this.aa = 968289251 * i4;
    }

    void ap(int i, int i2, int i3, int i4) {
        this.an = 883547537 * i;
        this.aq = -1744219702 * i2;
        this.ao = 123566131 * i3;
        this.aa = -877283974 * i4;
    }

    void at(int i, int i2, int i3, int i4) {
        this.an = 883547537 * i;
        this.aq = -1742084931 * i2;
        this.ao = 123566131 * i3;
        this.aa = -370570319 * i4;
    }

    public int[] ac(int i) {
        try {
            return this.ak;
        } catch (Throwable e) {
            throw ei.ac(e, "bo.ac(" + ')');
        }
    }

    public int[] ah() {
        return this.ak;
    }

    final void ai() {
        if (!this.at) {
            aj.as(16776960);
        }
    }

    final void am() {
        if (!this.at) {
            aj.as(16776960);
        }
    }

    final void an(int i) {
        try {
            if (!this.at) {
                aj.as(16776960);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bo.an(" + ')');
        }
    }

    final void aw() {
        if (!this.at) {
            aj.as(16776960);
        }
    }

    final void ae(boolean z) {
        long nanoTime = System.nanoTime();
        if (z && zv.se()) {
            zv.cu(this.aj * -1894589259, this.ac * 1647911921);
            zv.cc(this.aj * -1894589259, this.ac * 1647911921);
            zv.ex(-932936847 * this.an, this.aq * 397817493, 841630459 * this.ao, 1332993361 * this.aa);
            if (this.at) {
                zv.fo();
            } else {
                zv.bp();
            }
            aj.aa(this.ak, 1547730494);
            if (!this.at) {
                aj.ap(289891751);
            }
            aj.at(-1689053119);
            this.ap = aj.aw(-576949556) * -16618669;
        } else {
            this.ap = 0;
        }
        this.at = false;
        aj.an(true, (byte) -96);
        this.ah = (System.nanoTime() - nanoTime) * 317681041100924529L;
        zv.hb();
    }

    final void aq(boolean z, int i) {
        try {
            long nanoTime = System.nanoTime();
            if (z && zv.se()) {
                zv.cu(this.aj * -1894589259, this.ac * 1647911921);
                zv.cc(this.aj * -1894589259, this.ac * 1647911921);
                zv.ex(-932936847 * this.an, this.aq * 397817493, 841630459 * this.ao, 1332993361 * this.aa);
                if (this.at) {
                    zv.fo();
                } else {
                    zv.bp();
                }
                aj.aa(this.ak, 1885447572);
                if (!this.at) {
                    aj.ap(1139609630);
                }
                aj.at(-1689053119);
                this.ap = aj.aw(-444974716) * -16618669;
            } else {
                this.ap = 0;
            }
            this.at = false;
            aj.an(true, (byte) -105);
            this.ah = (System.nanoTime() - nanoTime) * 317681041100924529L;
            zv.hb();
        } catch (Throwable e) {
            throw ei.ac(e, "bo.aq(" + ')');
        }
    }

    final void as(boolean z) {
        long nanoTime = System.nanoTime();
        if (z && zv.se()) {
            zv.cu(this.aj * -1894589259, this.ac * 1647911921);
            zv.cc(this.aj * -1894589259, this.ac * 1647911921);
            zv.ex(-932936847 * this.an, this.aq * 397817493, 841630459 * this.ao, 1332993361 * this.aa);
            if (this.at) {
                zv.fo();
            } else {
                zv.bp();
            }
            aj.aa(this.ak, 1607655768);
            if (!this.at) {
                aj.ap(-342554064);
            }
            aj.at(-1689053119);
            this.ap = aj.aw(-1895880680) * -16618669;
        } else {
            this.ap = 0;
        }
        this.at = false;
        aj.an(true, (byte) -121);
        this.ah = (System.nanoTime() - nanoTime) * 317681041100924529L;
        zv.hb();
    }

    int al() {
        return 113447131 * this.ap;
    }

    int ao(int i) {
        try {
            return 113447131 * this.ap;
        } catch (Throwable e) {
            throw ei.ac(e, "bo.ao(" + ')');
        }
    }

    public void aa(int i) {
        try {
            this.at = true;
        } catch (Throwable e) {
            throw ei.ac(e, "bo.aa(" + ')');
        }
    }

    public void ax() {
        this.at = true;
    }

    public void az() {
        this.at = true;
    }
}
