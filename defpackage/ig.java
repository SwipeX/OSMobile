package defpackage;

public class ig {
    int aa;
    int[] ac = new int[2];
    int ah;
    int ai;
    int aj = 2;
    int ak;
    int[] an = new int[2];
    int ao;
    int ap;
    int aq;
    int at;

    ig() {
        this.ac[0] = 0;
        this.ac[1] = 65535;
        this.an[0] = 0;
        this.an[1] = 65535;
    }

    final void aa(he heVar) {
        this.aa = heVar.au(-310118664);
        this.aq = heVar.ad((byte) -59);
        this.ao = heVar.ad((byte) -126);
        ac(heVar);
    }

    final void aj(he heVar) {
        this.aa = heVar.au(-310118664);
        this.aq = heVar.ad((byte) -80);
        this.ao = heVar.ad((byte) -111);
        ac(heVar);
    }

    final void ao(he heVar) {
        this.aa = heVar.au(-310118664);
        this.aq = heVar.ad(Byte.MIN_VALUE);
        this.ao = heVar.ad((byte) -46);
        ac(heVar);
    }

    final void ac(he heVar) {
        this.aj = heVar.au(-310118664);
        this.ac = new int[this.aj];
        this.an = new int[this.aj];
        for (int i = 0; i < this.aj; i++) {
            this.ac[i] = heVar.ay((byte) 1);
            this.an[i] = heVar.ay((byte) 1);
        }
    }

    final void ak(he heVar) {
        this.aj = heVar.au(-310118664);
        this.ac = new int[this.aj];
        this.an = new int[this.aj];
        for (int i = 0; i < this.aj; i++) {
            this.ac[i] = heVar.ay((byte) 1);
            this.an[i] = heVar.ay((byte) 1);
        }
    }

    final void ah() {
        this.ak = 0;
        this.ap = 0;
        this.at = 0;
        this.ah = 0;
        this.ai = 0;
    }

    final void an() {
        this.ak = 0;
        this.ap = 0;
        this.at = 0;
        this.ah = 0;
        this.ai = 0;
    }

    final void ap() {
        this.ak = 0;
        this.ap = 0;
        this.at = 0;
        this.ah = 0;
        this.ai = 0;
    }

    final void at() {
        this.ak = 0;
        this.ap = 0;
        this.at = 0;
        this.ah = 0;
        this.ai = 0;
    }

    final int ai(int i) {
        if (this.ai >= this.ak) {
            int[] iArr = this.an;
            int i2 = this.ap;
            this.ap = i2 + 1;
            this.ah = iArr[i2] << 15;
            if (this.ap >= this.aj) {
                this.ap = this.aj - 1;
            }
            this.ak = (int) ((((double) this.ac[this.ap]) / 65536.0d) * ((double) i));
            if (this.ak > this.ai) {
                this.at = ((this.an[this.ap] << 15) - this.ah) / (this.ak - this.ai);
            }
        }
        this.ah += this.at;
        this.ai++;
        return (this.ah - this.at) >> 15;
    }

    final int aq(int i) {
        if (this.ai >= this.ak) {
            int[] iArr = this.an;
            int i2 = this.ap;
            this.ap = i2 + 1;
            this.ah = iArr[i2] << 15;
            if (this.ap >= this.aj) {
                this.ap = this.aj - 1;
            }
            this.ak = (int) ((((double) this.ac[this.ap]) / 65536.0d) * ((double) i));
            if (this.ak > this.ai) {
                this.at = ((this.an[this.ap] << 15) - this.ah) / (this.ak - this.ai);
            }
        }
        this.ah += this.at;
        this.ai++;
        return (this.ah - this.at) >> 15;
    }
}
