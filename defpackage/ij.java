package defpackage;

public class ij extends ic {
    public boolean aa;
    public int ac;
    public byte[] an;
    int ao;
    public int aq;

    ij(int i, byte[] bArr, int i2, int i3) {
        this.ac = i;
        this.an = bArr;
        this.aq = i2;
        this.ao = i3;
    }

    ij(int i, byte[] bArr, int i2, int i3, boolean z) {
        this.ac = i;
        this.an = bArr;
        this.aq = i2;
        this.ao = i3;
        this.aa = z;
    }

    public ij ac(ik ikVar) {
        this.an = ikVar.aj(this.an, -168907570);
        this.ac = ikVar.ac(this.ac, 314872992);
        if (this.aq == this.ao) {
            int an = ikVar.an(this.aq, 373802304);
            this.ao = an;
            this.aq = an;
        } else {
            this.aq = ikVar.an(this.aq, 373802304);
            this.ao = ikVar.an(this.ao, 373802304);
            if (this.aq == this.ao) {
                this.aq--;
            }
        }
        return this;
    }

    public ij aj(ik ikVar) {
        this.an = ikVar.aj(this.an, -1402966737);
        this.ac = ikVar.ac(this.ac, -317773868);
        if (this.aq == this.ao) {
            int an = ikVar.an(this.aq, 373802304);
            this.ao = an;
            this.aq = an;
        } else {
            this.aq = ikVar.an(this.aq, 373802304);
            this.ao = ikVar.an(this.ao, 373802304);
            if (this.aq == this.ao) {
                this.aq--;
            }
        }
        return this;
    }

    public ij an(ik ikVar) {
        this.an = ikVar.aj(this.an, -603039344);
        this.ac = ikVar.ac(this.ac, 696098887);
        if (this.aq == this.ao) {
            int an = ikVar.an(this.aq, 373802304);
            this.ao = an;
            this.aq = an;
        } else {
            this.aq = ikVar.an(this.aq, 373802304);
            this.ao = ikVar.an(this.ao, 373802304);
            if (this.aq == this.ao) {
                this.aq--;
            }
        }
        return this;
    }
}
