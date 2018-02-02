package defpackage;

public class kp {
    int ac = 0;
    final long[] aj;
    int an = 0;

    public kp(int i) {
        this.aj = new long[i];
    }

    public void ac(long j) {
        if (this.an < this.aj.length) {
            this.an++;
        }
        this.aj[this.ac] = j;
        this.ac = (this.ac + 1) % this.aj.length;
    }

    public void aj(long j) {
        if (this.an < this.aj.length) {
            this.an++;
        }
        this.aj[this.ac] = j;
        this.ac = (this.ac + 1) % this.aj.length;
    }

    public void an(long j) {
        if (this.an < this.aj.length) {
            this.an++;
        }
        this.aj[this.ac] = j;
        this.ac = (this.ac + 1) % this.aj.length;
    }

    public void aq(long j) {
        if (this.an < this.aj.length) {
            this.an++;
        }
        this.aj[this.ac] = j;
        this.ac = (this.ac + 1) % this.aj.length;
    }
}
