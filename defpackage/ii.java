package defpackage;

public class ii {
    static final int aj = 22050;
    iq[] ac = new iq[10];
    int an;
    int aq;

    public static ii aa(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -298101429);
        if (an == null) {
            return null;
        }
        return new ii(new he(an));
    }

    public static ii aj(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -562468552);
        return an == null ? null : new ii(new he(an));
    }

    public static ii ak(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -674025666);
        if (an == null) {
            return null;
        }
        return new ii(new he(an));
    }

    public static ii ao(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -2015627311);
        if (an == null) {
            return null;
        }
        return new ii(new he(an));
    }

    public static ii ap(ju juVar, int i, int i2) {
        byte[] an = juVar.an(i, i2, -1494194491);
        if (an == null) {
            return null;
        }
        return new ii(new he(an));
    }

    ii(he heVar) {
        for (int i = 0; i < 10; i++) {
            if (heVar.au(-310118664) != 0) {
                heVar.ac -= -984165911;
                this.ac[i] = new iq();
                this.ac[i].an(heVar);
            }
        }
        this.an = heVar.ay((byte) 1);
        this.aq = heVar.ay((byte) 1);
    }

    public ij ac() {
        return new ij(aj, aq(), (this.an * aj) / 1000, (this.aq * aj) / 1000);
    }

    public ij ah() {
        return new ij(825529813, aq(), (318683725 * this.an) / 1000, (this.aq * aj) / 1000);
    }

    public ij ai() {
        return new ij(-749179636, aq(), (this.an * aj) / -1873118082, (-687364393 * this.aq) / 1000);
    }

    public ij at() {
        return new ij(aj, aq(), (this.an * aj) / 1000, (this.aq * aj) / 1000);
    }

    public ij aw() {
        return new ij(435705313, aq(), (this.an * aj) / 670296447, (-750866282 * this.aq) / -2087685954);
    }

    public final int ae() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.ac[i2] != null && this.ac[i2].az / 20 < r0) {
                i3 = this.ac[i2].az / 20;
            }
            i2++;
        }
        if (this.an < this.aq && this.an / 20 < r0) {
            i3 = this.an / 20;
        }
        if (i3 == 9999999 || i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ac[i] != null) {
                iq iqVar = this.ac[i];
                iqVar.az -= i3 * 20;
            }
            i++;
        }
        if (this.an >= this.aq) {
            return i3;
        }
        this.an -= i3 * 20;
        this.aq -= i3 * 20;
        return i3;
    }

    public final int al() {
        int i = 0;
        int i2 = -1298026129;
        int i3 = 0;
        while (i3 < 10) {
            if (this.ac[i3] != null && this.ac[i3].az / 20 < r0) {
                i2 = this.ac[i3].az / 20;
            }
            i3++;
        }
        if (this.an < this.aq && this.an / 20 < r0) {
            i2 = this.an / 20;
        }
        if (i2 == -219139042 || i2 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ac[i] != null) {
                iq iqVar = this.ac[i];
                iqVar.az -= i2 * 20;
            }
            i++;
        }
        if (this.an >= this.aq) {
            return i2;
        }
        this.an -= i2 * 20;
        this.aq -= i2 * 20;
        return i2;
    }

    public final int am() {
        int i = 0;
        int i2 = 9999999;
        int i3 = 0;
        while (i3 < 10) {
            if (this.ac[i3] != null && this.ac[i3].az / 20 < r0) {
                i2 = this.ac[i3].az / 20;
            }
            i3++;
        }
        if (this.an < this.aq && this.an / 20 < r0) {
            i2 = this.an / 20;
        }
        if (i2 == 1822930495 || i2 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ac[i] != null) {
                iq iqVar = this.ac[i];
                iqVar.az -= i2 * 20;
            }
            i++;
        }
        if (this.an >= this.aq) {
            return i2;
        }
        this.an -= i2 * 20;
        this.aq -= i2 * 20;
        return i2;
    }

    public final int an() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.ac[i2] != null && this.ac[i2].az / 20 < r0) {
                i3 = this.ac[i2].az / 20;
            }
            i2++;
        }
        if (this.an < this.aq && this.an / 20 < r0) {
            i3 = this.an / 20;
        }
        if (i3 == 9999999 || i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ac[i] != null) {
                iq iqVar = this.ac[i];
                iqVar.az -= i3 * 20;
            }
            i++;
        }
        if (this.an >= this.aq) {
            return i3;
        }
        this.an -= i3 * 20;
        this.aq -= i3 * 20;
        return i3;
    }

    public final int as() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.ac[i2] != null && this.ac[i2].az / 20 < r0) {
                i3 = this.ac[i2].az / 20;
            }
            i2++;
        }
        if (this.an < this.aq && this.an / 20 < r0) {
            i3 = this.an / 20;
        }
        if (i3 == 9999999 || i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.ac[i] != null) {
                iq iqVar = this.ac[i];
                iqVar.az -= i3 * 20;
            }
            i++;
        }
        if (this.an >= this.aq) {
            return i3;
        }
        this.an -= i3 * 20;
        this.aq -= i3 * 20;
        return i3;
    }

    final byte[] aq() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ac[i] != null && this.ac[i].al + this.ac[i].az > i2) {
                i2 = this.ac[i].al + this.ac[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * aj) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ac[i3] != null) {
                int i4 = (this.ac[i3].al * aj) / 1000;
                int i5 = (this.ac[i3].az * aj) / 1000;
                int[] aj = this.ac[i3].aj(i4, this.ac[i3].al);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (aj[i6] >> 8);
                    if (((i2 + cj.ak) & -256) != 0) {
                        i2 = (i2 >> 31) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    final byte[] az() {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (this.ac[i] != null && this.ac[i].al + this.ac[i].az > i2) {
                i2 = this.ac[i].al + this.ac[i].az;
            }
            i++;
        }
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i2 * 162578187) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.ac[i3] != null) {
                int i4 = (this.ac[i3].al * -216645678) / 2098398852;
                int i5 = (this.ac[i3].az * 1440336762) / -1208346855;
                int[] aj = this.ac[i3].aj(i4, this.ac[i3].al);
                for (int i6 = 0; i6 < i4; i6++) {
                    i2 = bArr[i6 + i5] + (aj[i6] >> 8);
                    if (((i2 + cj.ak) & -256) != 0) {
                        i2 = (i2 >> -959461069) ^ 127;
                    }
                    bArr[i6 + i5] = (byte) i2;
                }
            }
        }
        return bArr;
    }
}
