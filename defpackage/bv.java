package defpackage;

public class bv {
    static int[] ac = new int[500];
    static int[] aj = new int[500];
    static int[] an = new int[500];
    static int[] aq = new int[500];
    int aa = -1;
    int[] ah;
    boolean ai = false;
    int[] ak;
    by ao = null;
    int[] ap;
    int[] at;

    bv(byte[] bArr, by byVar) {
        int i = -1;
        this.ao = byVar;
        he heVar = new he(bArr);
        he heVar2 = new he(bArr);
        heVar.ac = -1968331822;
        int au = heVar.au(-310118664);
        heVar2.ac = ((heVar.ac * 489625177) + au) * -984165911;
        int i2 = 0;
        for (int i3 = 0; i3 < au; i3++) {
            int au2 = heVar.au(-310118664);
            if (au2 > 0) {
                boolean z;
                if (this.ao.an[i3] != 0) {
                    for (int i4 = i3 - 1; i4 > i; i4--) {
                        if (this.ao.an[i4] == 0) {
                            aj[i2] = i4;
                            ac[i2] = 0;
                            an[i2] = 0;
                            aq[i2] = 0;
                            i2++;
                            break;
                        }
                    }
                }
                aj[i2] = i3;
                if (this.ao.an[i3] == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((au2 & 1) != 0) {
                    ac[i2] = heVar2.bb(1314128743);
                } else {
                    ac[i2] = z;
                }
                if ((au2 & 2) != 0) {
                    an[i2] = heVar2.bb(1314128743);
                } else {
                    an[i2] = z;
                }
                if ((au2 & 4) != 0) {
                    aq[i2] = heVar2.bb(1314128743);
                } else {
                    aq[i2] = z;
                }
                i2++;
                if (this.ao.an[i3] == 5) {
                    this.ai = true;
                    i = i3;
                } else {
                    i = i3;
                }
            }
        }
        if (heVar2.ac * 489625177 != bArr.length) {
            throw new RuntimeException();
        }
        this.aa = i2;
        this.ak = new int[i2];
        this.ap = new int[i2];
        this.at = new int[i2];
        this.ah = new int[i2];
        for (i = 0; i < i2; i++) {
            this.ak[i] = aj[i];
            this.ap[i] = ac[i];
            this.at[i] = an[i];
            this.ah[i] = aq[i];
        }
    }
}
