package defpackage;

public final class fl extends je {
    public int aa;
    public int[] ac;
    public byte[] aj;
    public int ak;
    public int an;
    public int ao;
    public int ap;
    public int aq;

    public void aj() {
        if (this.an != this.ak || this.aq != this.ap) {
            byte[] bArr = new byte[(this.ak * this.ap)];
            int i = 0;
            for (int i2 = 0; i2 < this.aq; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.aa + i2) * this.ak) + (this.ao + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.aj[i];
                    i3++;
                    i = i5;
                }
            }
            this.aj = bArr;
            this.an = this.ak;
            this.aq = this.ap;
            this.ao = 0;
            this.aa = 0;
        }
    }

    public void an() {
        if (this.an != this.ak || this.aq != this.ap) {
            byte[] bArr = new byte[(this.ak * this.ap)];
            int i = 0;
            for (int i2 = 0; i2 < this.aq; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.aa + i2) * this.ak) + (this.ao + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.aj[i];
                    i3++;
                    i = i5;
                }
            }
            this.aj = bArr;
            this.an = this.ak;
            this.aq = this.ap;
            this.ao = 0;
            this.aa = 0;
        }
    }

    public void aq() {
        if (this.an != this.ak || this.aq != this.ap) {
            byte[] bArr = new byte[(this.ak * this.ap)];
            int i = 0;
            for (int i2 = 0; i2 < this.aq; i2++) {
                int i3 = 0;
                while (i3 < this.an) {
                    int i4 = ((this.aa + i2) * this.ak) + (this.ao + i3);
                    int i5 = i + 1;
                    bArr[i4] = this.aj[i];
                    i3++;
                    i = i5;
                }
            }
            this.aj = bArr;
            this.an = this.ak;
            this.aq = this.ap;
            this.ao = 0;
            this.aa = 0;
        }
    }

    public void ac(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ac.length; i4++) {
            int i5 = ((this.ac[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.ac[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.ac[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.ac[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void ao(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ac.length; i4++) {
            int i5 = ((this.ac[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.ac[i4] >> 8) & 123485943) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 1809579887;
            }
            int i7 = (this.ac[i4] & 629481395) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.ac[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }
}
