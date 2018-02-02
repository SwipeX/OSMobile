package defpackage;

public class mw extends jt {
    public static final int al = 18;
    public static final int ar = 26;
    mv[] aa;
    ij[] ac;
    int aj;
    byte[] ak;
    short[] an;
    byte[] ao;
    int[] ap;
    byte[] aq;

    static mw ao(ju juVar, int i) {
        byte[] ah = juVar.ah(i, -1333884528);
        if (ah == null) {
            return null;
        }
        return new mw(ah);
    }

    static mw aq(ju juVar, int i) {
        byte[] ah = juVar.ah(i, -1333884528);
        if (ah == null) {
            return null;
        }
        return new mw(ah);
    }

    public static void aj(int i) {
        try {
            nu.aj = new jr();
        } catch (Throwable e) {
            throw ei.ac(e, "mw.aj(" + ')');
        }
    }

    mw(byte[] bArr) {
        try {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            mv mvVar;
            byte b;
            int i6;
            byte b2;
            mv mvVar2;
            byte b3;
            this.ac = new ij[cj.ak];
            this.an = new short[cj.ak];
            this.aq = new byte[cj.ak];
            this.ao = new byte[cj.ak];
            this.aa = new mv[cj.ak];
            this.ak = new byte[cj.ak];
            this.ap = new int[cj.ak];
            he heVar = new he(bArr);
            int i7 = 0;
            while (heVar.aj[(489625177 * heVar.ac) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr2 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr2[i] = heVar.av(-539922122);
            }
            heVar.ac -= 984165911;
            int i8 = 489625177 * heVar.ac;
            heVar.ac = ((i7 + 1) * -984165911) + heVar.ac;
            i7 = 0;
            while (heVar.aj[(489625177 * heVar.ac) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr3 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr3[i] = heVar.av(-1226857232);
            }
            heVar.ac -= 984165911;
            int i9 = 489625177 * heVar.ac;
            heVar.ac = ((i7 + 1) * -984165911) + heVar.ac;
            i7 = 0;
            while (heVar.aj[(489625177 * heVar.ac) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr4 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr4[i] = heVar.av(-2062436916);
            }
            heVar.ac -= 984165911;
            int i10 = i7 + 1;
            byte[] bArr5 = new byte[i10];
            if (i10 > 1) {
                bArr5[1] = (byte) 1;
                i2 = 1;
                i7 = 2;
                i3 = 2;
                while (i3 < i10) {
                    i = heVar.au(-310118664);
                    if (i == 0) {
                        i4 = i7;
                        i7++;
                        i = i4;
                    } else if (i <= i2) {
                        i--;
                    }
                    bArr5[i3] = (byte) i;
                    i3++;
                    i2 = i;
                }
                i5 = i7;
            } else {
                i5 = i10;
            }
            mv[] mvVarArr = new mv[i5];
            for (i = 0; i < mvVarArr.length; i++) {
                mvVar = new mv();
                mvVarArr[i] = mvVar;
                i10 = heVar.au(-310118664);
                if (i10 > 0) {
                    mvVar.aj = new byte[(i10 * 2)];
                }
                i10 = heVar.au(-310118664);
                if (i10 > 0) {
                    mvVar.ac = new byte[((i10 * 2) + 2)];
                    mvVar.ac[1] = (byte) 64;
                }
            }
            i = heVar.au(-310118664);
            byte[] bArr6 = i > 0 ? new byte[(i * 2)] : null;
            i = heVar.au(-310118664);
            byte[] bArr7 = i > 0 ? new byte[(i * 2)] : null;
            i10 = 0;
            while (heVar.aj[(489625177 * heVar.ac) + i10] != (byte) 0) {
                i10++;
            }
            byte[] bArr8 = new byte[i10];
            for (i7 = 0; i7 < i10; i7++) {
                bArr8[i7] = heVar.av(-1064231775);
            }
            heVar.ac -= 984165911;
            i7 = i10 + 1;
            i10 = 0;
            for (i7 = 0; i7 < cj.ak; i7++) {
                i10 += heVar.au(-310118664);
                this.an[i7] = (short) i10;
            }
            i10 = 0;
            for (i7 = 0; i7 < cj.ak; i7++) {
                i10 += heVar.au(-310118664);
                short[] sArr = this.an;
                sArr[i7] = (short) (sArr[i7] + (i10 << 8));
            }
            i10 = 0;
            i7 = 0;
            i3 = 0;
            i2 = 0;
            while (i2 < cj.ak) {
                if (i3 == 0) {
                    if (i7 < bArr8.length) {
                        i4 = i7 + 1;
                        b = bArr8[i7];
                        i7 = i4;
                    } else {
                        i10 = -1;
                    }
                    i3 = i10;
                    i10 = i7;
                    i7 = heVar.bx(-1482945915);
                } else {
                    i4 = i10;
                    i10 = i7;
                    i7 = i4;
                }
                short[] sArr2 = this.an;
                sArr2[i2] = (short) (sArr2[i2] + (((i7 - 1) & 2) << 14));
                this.ap[i2] = i7;
                i2++;
                i3--;
                i4 = i10;
                i10 = i7;
                i7 = i4;
            }
            i7 = 0;
            i10 = 0;
            i3 = 0;
            i2 = i8;
            for (i6 = 0; i6 < cj.ak; i6++) {
                if (this.ap[i6] != 0) {
                    if (i3 == 0) {
                        if (i10 < bArr2.length) {
                            i4 = i10 + 1;
                            b2 = bArr2[i10];
                            i10 = i4;
                        } else {
                            b2 = (byte) -1;
                        }
                        i2++;
                        byte b4 = b2;
                        i7 = heVar.aj[i2] - 1;
                        i3 = b4;
                    }
                    this.ak[i6] = (byte) i7;
                    i3--;
                }
            }
            i7 = 0;
            i10 = 0;
            i3 = 0;
            i2 = i9;
            for (i9 = 0; i9 < cj.ak; i9++) {
                if (this.ap[i9] != 0) {
                    if (i3 == 0) {
                        if (i10 < bArr3.length) {
                            i7 = i10 + 1;
                            i3 = bArr3[i10];
                            i10 = i7;
                        } else {
                            i3 = -1;
                        }
                        i7 = (heVar.aj[i2] + 16) << 2;
                        i2++;
                    }
                    this.ao[i9] = (byte) i7;
                    i3--;
                }
            }
            mvVar = null;
            i10 = 0;
            i3 = 0;
            for (i2 = 0; i2 < cj.ak; i2++) {
                if (this.ap[i2] != 0) {
                    if (i3 == 0) {
                        mvVar = mvVarArr[bArr5[i10]];
                        if (i10 < bArr4.length) {
                            i4 = i10 + 1;
                            i3 = bArr4[i10];
                            i10 = i4;
                        } else {
                            i3 = -1;
                        }
                    }
                    this.aa[i2] = mvVar;
                    i3--;
                }
            }
            i7 = 0;
            i10 = 0;
            i3 = 0;
            i2 = 0;
            while (i2 < cj.ak) {
                if (i3 == 0) {
                    if (i10 < bArr8.length) {
                        i4 = i10 + 1;
                        i3 = bArr8[i10];
                        i10 = i4;
                    } else {
                        i3 = -1;
                    }
                    if (this.ap[i2] > 0) {
                        i7 = heVar.au(-310118664) + 1;
                    }
                }
                this.aq[i2] = (byte) i7;
                i2++;
                i3--;
            }
            this.aj = (heVar.au(-310118664) + 1) * -976812235;
            for (i10 = 0; i10 < i5; i10++) {
                mv mvVar3 = mvVarArr[i10];
                if (mvVar3.aj != null) {
                    for (i7 = 1; i7 < mvVar3.aj.length; i7 += 2) {
                        mvVar3.aj[i7] = heVar.av(-16004368);
                    }
                }
                if (mvVar3.ac != null) {
                    for (i7 = 3; i7 < mvVar3.ac.length - 2; i7 += 2) {
                        mvVar3.ac[i7] = heVar.av(-1886737495);
                    }
                }
            }
            if (bArr6 != null) {
                for (i7 = 1; i7 < bArr6.length; i7 += 2) {
                    bArr6[i7] = heVar.av(-657519781);
                }
            }
            if (bArr7 != null) {
                for (i7 = 1; i7 < bArr7.length; i7 += 2) {
                    bArr7[i7] = heVar.av(-902582);
                }
            }
            for (i3 = 0; i3 < i5; i3++) {
                mvVar2 = mvVarArr[i3];
                if (mvVar2.ac != null) {
                    i10 = 0;
                    for (i7 = 2; i7 < mvVar2.ac.length; i7 += 2) {
                        i10 = (i10 + 1) + heVar.au(-310118664);
                        mvVar2.ac[i7] = (byte) i10;
                    }
                }
            }
            for (i3 = 0; i3 < i5; i3++) {
                mvVar2 = mvVarArr[i3];
                if (mvVar2.aj != null) {
                    i10 = 0;
                    for (i7 = 2; i7 < mvVar2.aj.length; i7 += 2) {
                        i10 = (i10 + 1) + heVar.au(-310118664);
                        mvVar2.aj[i7] = (byte) i10;
                    }
                }
            }
            if (bArr6 != null) {
                i10 = heVar.au(-310118664);
                bArr6[0] = (byte) i10;
                for (i7 = 2; i7 < bArr6.length; i7 += 2) {
                    i10 = (i10 + 1) + heVar.au(-310118664);
                    bArr6[i7] = (byte) i10;
                }
                b3 = bArr6[0];
                b = bArr6[1];
                for (b2 = (byte) 0; b2 < b3; b2++) {
                    this.aq[b2] = (byte) (((this.aq[b2] * b) + 32) >> 6);
                }
                i2 = 2;
                i8 = b;
                i10 = b3;
                while (i2 < bArr6.length) {
                    byte b5 = bArr6[i2];
                    byte b6 = bArr6[i2 + 1];
                    i3 = ((b5 - i10) / 2) + ((b5 - i10) * i8);
                    for (b2 = i10; b2 < b5; b2++) {
                        this.aq[b2] = (byte) (((dq.aa(i3, b5 - i10, 1945713386) * this.aq[b2]) + 32) >> 6);
                        i3 += b6 - i8;
                    }
                    i2 += 2;
                    byte b7 = b6;
                    b = b5;
                }
                while (i10 < cj.ak) {
                    this.aq[i10] = (byte) (((this.aq[i10] * i8) + 32) >> 6);
                    i10++;
                }
            }
            if (bArr7 != null) {
                i10 = heVar.au(-310118664);
                bArr7[0] = (byte) i10;
                for (i7 = 2; i7 < bArr7.length; i7 += 2) {
                    i10 = (i10 + 1) + heVar.au(-310118664);
                    bArr7[i7] = (byte) i10;
                }
                b3 = bArr7[0];
                i10 = bArr7[1] << 1;
                for (byte b8 = (byte) 0; b8 < b3; b8++) {
                    i7 = (this.ao[b8] & 255) + i10;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    if (i7 > cj.ak) {
                        i7 = cj.ak;
                    }
                    this.ao[b8] = (byte) i7;
                }
                i8 = 2;
                i9 = i10;
                i7 = b3;
                while (i8 < bArr7.length) {
                    byte b9 = bArr7[i8];
                    i6 = bArr7[i8 + 1] << 1;
                    i2 = ((b9 - i7) / 2) + ((b9 - i7) * i9);
                    for (b3 = i7; b3 < b9; b3++) {
                        i10 = dq.aa(i2, b9 - i7, 1661532315) + (this.ao[b3] & 255);
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        if (i10 > cj.ak) {
                            i10 = cj.ak;
                        }
                        this.ao[b3] = (byte) i10;
                        i2 += i6 - i9;
                    }
                    i8 += 2;
                    i9 = i6;
                    b2 = b9;
                }
                while (i7 < cj.ak) {
                    i = (this.ao[i7] & 255) + i9;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > cj.ak) {
                        i = cj.ak;
                    }
                    this.ao[i7] = (byte) i;
                    i7++;
                }
            }
            for (i = 0; i < i5; i++) {
                mvVarArr[i].an = heVar.au(-310118664) * -1279886217;
            }
            for (i = 0; i < i5; i++) {
                mvVar = mvVarArr[i];
                if (mvVar.aj != null) {
                    mvVar.aq = heVar.au(-310118664) * 1718599475;
                }
                if (mvVar.ac != null) {
                    mvVar.ao = heVar.au(-310118664) * 695343841;
                }
                if (-628744889 * mvVar.an > 0) {
                    mvVar.aa = heVar.au(-310118664) * 1406281077;
                }
            }
            for (i = 0; i < i5; i++) {
                mvVarArr[i].ap = heVar.au(-310118664) * 1317178057;
            }
            for (i = 0; i < i5; i++) {
                mvVar = mvVarArr[i];
                if (mvVar.ap * -1517965447 > 0) {
                    mvVar.ak = heVar.au(-310118664) * 516523763;
                }
            }
            for (i = 0; i < i5; i++) {
                mvVar = mvVarArr[i];
                if (mvVar.ak * 2038432315 > 0) {
                    mvVar.at = heVar.au(-310118664) * 122684553;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "mw.<init>(" + ')');
        }
    }

    boolean aa(iz izVar, byte[] bArr, int[] iArr) {
        return true;
    }

    boolean ac(iz izVar, byte[] bArr, int[] iArr, byte b) {
        boolean z = true;
        ij ijVar = null;
        int i = 0;
        for (int i2 = 0; i2 < cj.ak; i2++) {
            if (bArr != null) {
                if (bArr[i2] == (byte) 0) {
                    continue;
                }
            }
            int i3 = this.ap[i2];
            if (i3 != 0) {
                if (i != i3) {
                    int i4 = i3 - 1;
                    if ((i4 & 1) == 0) {
                        try {
                            ijVar = izVar.an(i4 >> 2, iArr, -984165911);
                        } catch (Throwable e) {
                            throw ei.ac(e, "mw.ac(" + ')');
                        }
                    }
                    ijVar = izVar.aq(i4 >> 2, iArr, 1933301610);
                    if (ijVar == null) {
                        i = i3;
                        z = false;
                    } else {
                        i = i3;
                    }
                }
                if (ijVar != null) {
                    this.ac[i2] = ijVar;
                    this.ap[i2] = 0;
                }
            } else {
                continue;
            }
        }
        return z;
    }

    void ah() {
        this.ap = null;
    }

    void ak() {
        this.ap = null;
    }

    void an(int i) {
        try {
            this.ap = null;
        } catch (Throwable e) {
            throw ei.ac(e, "mw.an(" + ')');
        }
    }

    void ap() {
        this.ap = null;
    }

    void at() {
        this.ap = null;
    }
}
