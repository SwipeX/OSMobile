package defpackage;

public final class em extends je {
    public int aa;
    public int ac;
    public int[] aj;
    public int ak;
    public int an;
    int ao;
    public int aq;

    em() {
    }

    public em(int i, int i2) {
        this(new int[(i * i2)], i, i2);
    }

    public em(int[] iArr, int i, int i2) {
        this.aj = iArr;
        this.aa = i;
        this.ac = i;
        this.ak = i2;
        this.an = i2;
        this.ao = 0;
        this.aq = 0;
    }

    public em ah() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em ai() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em aj() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em am() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em at() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em aw() {
        em emVar = new em(this.ac, this.an);
        emVar.aa = this.aa;
        emVar.ak = this.ak;
        emVar.aq = (this.aa - this.ac) - this.aq;
        emVar.ao = this.ao;
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[(this.ac * i) + i2] = this.aj[(((this.ac * i) + this.ac) - 1) - i2];
            }
        }
        return emVar;
    }

    public em ac() {
        em emVar = new em(this.aa, this.ak);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
            }
        }
        return emVar;
    }

    public em ae() {
        em emVar = new em(this.aa, this.ak);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
            }
        }
        return emVar;
    }

    public em as() {
        em emVar = new em(this.aa, this.ak);
        for (int i = 0; i < this.an; i++) {
            for (int i2 = 0; i2 < this.ac; i2++) {
                emVar.aj[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
            }
        }
        return emVar;
    }

    public void af() {
        if (this.ac != this.aa || this.an != this.ak) {
            int[] iArr = new int[(this.aa * this.ak)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ac; i2++) {
                    iArr[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
                }
            }
            this.aj = iArr;
            this.ac = this.aa;
            this.an = this.ak;
            this.aq = 0;
            this.ao = 0;
        }
    }

    public void al() {
        if (this.ac != this.aa || this.an != this.ak) {
            int[] iArr = new int[(this.aa * this.ak)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ac; i2++) {
                    iArr[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
                }
            }
            this.aj = iArr;
            this.ac = this.aa;
            this.an = this.ak;
            this.aq = 0;
            this.ao = 0;
        }
    }

    public void an() {
        if (this.ac != this.aa || this.an != this.ak) {
            int[] iArr = new int[(this.aa * this.ak)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ac; i2++) {
                    iArr[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
                }
            }
            this.aj = iArr;
            this.ac = this.aa;
            this.an = this.ak;
            this.aq = 0;
            this.ao = 0;
        }
    }

    public void ax() {
        if (this.ac != this.aa || this.an != this.ak) {
            int[] iArr = new int[(this.aa * this.ak)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ac; i2++) {
                    iArr[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
                }
            }
            this.aj = iArr;
            this.ac = this.aa;
            this.an = this.ak;
            this.aq = 0;
            this.ao = 0;
        }
    }

    public void az() {
        if (this.ac != this.aa || this.an != this.ak) {
            int[] iArr = new int[(this.aa * this.ak)];
            for (int i = 0; i < this.an; i++) {
                for (int i2 = 0; i2 < this.ac; i2++) {
                    iArr[((this.ao + i) * this.aa) + (this.aq + i2)] = this.aj[(this.ac * i) + i2];
                }
            }
            this.aj = iArr;
            this.ac = this.aa;
            this.an = this.ak;
            this.aq = 0;
            this.ao = 0;
        }
    }

    public void aq(int i) {
        if (this.ac != this.aa || this.an != this.ak) {
            int i2;
            int i3;
            int i4;
            if (i > this.aq) {
                i2 = this.aq;
            } else {
                i2 = i;
            }
            if ((this.aq + i) + this.ac > this.aa) {
                i3 = (this.aa - this.aq) - this.ac;
            } else {
                i3 = i;
            }
            if (i > this.ao) {
                i4 = this.ao;
            } else {
                i4 = i;
            }
            if ((this.ao + i) + this.an > this.ak) {
                i = (this.ak - this.ao) - this.an;
            }
            int i5 = (this.ac + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ac; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.aj[(this.ac * i3) + i7];
                }
            }
            this.aj = iArr;
            this.ac = i5;
            this.an = i6;
            this.aq -= i2;
            this.ao -= i4;
        }
    }

    public void au(int i) {
        if (this.ac != this.aa || this.an != this.ak) {
            int i2;
            int i3;
            int i4;
            if (i > this.aq) {
                i2 = this.aq;
            } else {
                i2 = i;
            }
            if ((this.aq + i) + this.ac > this.aa) {
                i3 = (this.aa - this.aq) - this.ac;
            } else {
                i3 = i;
            }
            if (i > this.ao) {
                i4 = this.ao;
            } else {
                i4 = i;
            }
            if ((this.ao + i) + this.an > this.ak) {
                i = (this.ak - this.ao) - this.an;
            }
            int i5 = (this.ac + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ac; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.aj[(this.ac * i3) + i7];
                }
            }
            this.aj = iArr;
            this.ac = i5;
            this.an = i6;
            this.aq -= i2;
            this.ao -= i4;
        }
    }

    public void av(int i) {
        if (this.ac != this.aa || this.an != this.ak) {
            int i2;
            int i3;
            int i4;
            if (i > this.aq) {
                i2 = this.aq;
            } else {
                i2 = i;
            }
            if ((this.aq + i) + this.ac > this.aa) {
                i3 = (this.aa - this.aq) - this.ac;
            } else {
                i3 = i;
            }
            if (i > this.ao) {
                i4 = this.ao;
            } else {
                i4 = i;
            }
            if ((this.ao + i) + this.an > this.ak) {
                i = (this.ak - this.ao) - this.an;
            }
            int i5 = (this.ac + i2) + i3;
            int i6 = (this.an + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.an; i3++) {
                for (int i7 = 0; i7 < this.ac; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.aj[(this.ac * i3) + i7];
                }
            }
            this.aj = iArr;
            this.ac = i5;
            this.an = i6;
            this.aq -= i2;
            this.ao -= i4;
        }
    }

    public void ag() {
        int i = 0;
        int[] iArr = new int[(this.ac * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ac - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.aj[(this.ac * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.aj = iArr;
        this.aq = (this.aa - this.ac) - this.aq;
    }

    public void ao() {
        int i = 0;
        int[] iArr = new int[(this.ac * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ac - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.aj[(this.ac * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.aj = iArr;
        this.aq = (this.aa - this.ac) - this.aq;
    }

    public void ay() {
        int i = 0;
        int[] iArr = new int[(this.ac * this.an)];
        int i2 = 0;
        while (i < this.an) {
            int i3 = this.ac - 1;
            while (i3 >= 0) {
                int i4 = i2 + 1;
                iArr[i2] = this.aj[(this.ac * i) + i3];
                i3--;
                i2 = i4;
            }
            i++;
        }
        this.aj = iArr;
        this.aq = (this.aa - this.ac) - this.aq;
    }

    public void aa() {
        int[] iArr = new int[(this.ac * this.an)];
        int i = this.an - 1;
        int i2 = 0;
        while (i >= 0) {
            int i3 = i2;
            i2 = 0;
            while (i2 < this.ac) {
                int i4 = i3 + 1;
                iArr[i3] = this.aj[(this.ac * i) + i2];
                i2++;
                i3 = i4;
            }
            i--;
            i2 = i3;
        }
        this.aj = iArr;
        this.ao = (this.ak - this.an) - this.ao;
    }

    public void ab() {
        int[] iArr = new int[(this.ac * this.an)];
        int i = this.an - 1;
        int i2 = 0;
        while (i >= 0) {
            int i3 = i2;
            i2 = 0;
            while (i2 < this.ac) {
                int i4 = i3 + 1;
                iArr[i3] = this.aj[(this.ac * i) + i2];
                i2++;
                i3 = i4;
            }
            i--;
            i2 = i3;
        }
        this.aj = iArr;
        this.ao = (this.ak - this.an) - this.ao;
    }

    public void ad() {
        int[] iArr = new int[(this.ac * this.an)];
        int i = this.an - 1;
        int i2 = 0;
        while (i >= 0) {
            int i3 = i2;
            i2 = 0;
            while (i2 < this.ac) {
                int i4 = i3 + 1;
                iArr[i3] = this.aj[(this.ac * i) + i2];
                i2++;
                i3 = i4;
            }
            i--;
            i2 = i3;
        }
        this.aj = iArr;
        this.ao = (this.ak - this.an) - this.ao;
    }

    public void ar() {
        int[] iArr = new int[(this.ac * this.an)];
        int i = this.an - 1;
        int i2 = 0;
        while (i >= 0) {
            int i3 = i2;
            i2 = 0;
            while (i2 < this.ac) {
                int i4 = i3 + 1;
                iArr[i3] = this.aj[(this.ac * i) + i2];
                i2++;
                i3 = i4;
            }
            i--;
            i2 = i3;
        }
        this.aj = iArr;
        this.ao = (this.ak - this.an) - this.ao;
    }

    public void ak(int i) {
        int[] iArr = new int[(this.ac * this.an)];
        int i2 = 0;
        for (int i3 = 0; i3 < this.an; i3++) {
            int i4 = 0;
            while (i4 < this.ac) {
                int i5;
                int i6 = this.aj[i2];
                if (i6 == 0) {
                    if (i4 > 0 && this.aj[i2 - 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 > 0 && this.aj[i2 - this.ac] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i4 < this.ac - 1 && this.aj[i2 + 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 < this.an - 1 && this.aj[this.ac + i2] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    }
                }
                i5 = i6;
                i6 = i2 + 1;
                iArr[i2] = i5;
                i4++;
                i2 = i6;
            }
        }
        this.aj = iArr;
    }

    public void bp(int i) {
        int[] iArr = new int[(this.ac * this.an)];
        int i2 = 0;
        for (int i3 = 0; i3 < this.an; i3++) {
            int i4 = 0;
            while (i4 < this.ac) {
                int i5;
                int i6 = this.aj[i2];
                if (i6 == 0) {
                    if (i4 > 0 && this.aj[i2 - 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 > 0 && this.aj[i2 - this.ac] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i4 < this.ac - 1 && this.aj[i2 + 1] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    } else if (i3 < this.an - 1 && this.aj[this.ac + i2] != 0) {
                        i5 = i;
                        i6 = i2 + 1;
                        iArr[i2] = i5;
                        i4++;
                        i2 = i6;
                    }
                }
                i5 = i6;
                i6 = i2 + 1;
                iArr[i2] = i5;
                i4++;
                i2 = i6;
            }
        }
        this.aj = iArr;
    }

    public void ap(int i) {
        for (int i2 = this.an - 1; i2 > 0; i2--) {
            int i3 = i2 * this.ac;
            int i4 = this.ac - 1;
            while (i4 > 0) {
                if (this.aj[i4 + i3] == 0 && this.aj[((i4 + i3) - 1) - this.ac] != 0) {
                    this.aj[i4 + i3] = i;
                }
                i4--;
            }
        }
    }

    public void bh(int i) {
        for (int i2 = this.an - 1; i2 > 0; i2--) {
            int i3 = i2 * this.ac;
            int i4 = this.ac - 1;
            while (i4 > 0) {
                if (this.aj[i4 + i3] == 0 && this.aj[((i4 + i3) - 1) - this.ac] != 0) {
                    this.aj[i4 + i3] = i;
                }
                i4--;
            }
        }
    }

    public void bm(int i) {
        for (int i2 = this.an - 1; i2 > 0; i2--) {
            int i3 = i2 * this.ac;
            int i4 = this.ac - 1;
            while (i4 > 0) {
                if (this.aj[i4 + i3] == 0 && this.aj[((i4 + i3) - 1) - this.ac] != 0) {
                    this.aj[i4 + i3] = i;
                }
                i4--;
            }
        }
    }
}
