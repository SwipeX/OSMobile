package defpackage;

import java.lang.reflect.Array;

public class io {
    int[] aa;
    int ac = iv.aq(24);
    int aj = iv.aq(16);
    int[] an = new int[this.ac];
    float[][] ao;
    int[] aq;

    static int aa(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cn.aj(pow, i2, 457663460) > i) {
            pow--;
        }
        return pow;
    }

    static int aj(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cn.aj(pow, i2, 457663460) > i) {
            pow--;
        }
        return pow;
    }

    static int ak(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cn.aj(pow, i2, 457663460) > i) {
            pow--;
        }
        return pow;
    }

    static int ao(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cn.aj(pow, i2, 457663460) > i) {
            pow--;
        }
        return pow;
    }

    static int ap(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cn.aj(pow, i2, 457663460) > i) {
            pow--;
        }
        return pow;
    }

    io() {
        int aq;
        int i;
        int i2;
        iv.aq(24);
        if ((iv.an() != 0 ? 1 : null) != null) {
            aq = iv.aq(5) + 1;
            i = 0;
            while (i < this.ac) {
                int aq2 = iv.aq(as.aq(this.ac - i, -2051548844));
                i2 = 0;
                while (i2 < aq2) {
                    int i3 = i + 1;
                    this.an[i] = aq;
                    i2++;
                    i = i3;
                }
                aq++;
            }
        } else {
            Object obj;
            if (iv.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            for (i = 0; i < this.ac; i++) {
                if (obj == null || iv.an() != 0) {
                    this.an[i] = iv.aq(5) + 1;
                } else {
                    this.an[i] = 0;
                }
            }
        }
        ac();
        i2 = iv.aq(4);
        if (i2 > 0) {
            Object obj2;
            float aj = iv.aj(iv.aq(32));
            float aj2 = iv.aj(iv.aq(32));
            i3 = iv.aq(4) + 1;
            if (iv.an() != 0) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (i2 == 1) {
                i = io.aj(this.ac, this.aj);
            } else {
                i = this.ac * this.aj;
            }
            this.aq = new int[i];
            for (aq = 0; aq < i; aq++) {
                this.aq[aq] = iv.aq(i3);
            }
            this.ao = (float[][]) Array.newInstance(Float.TYPE, new int[]{this.ac, this.aj});
            if (i2 == 1) {
                for (aq = 0; aq < this.ac; aq++) {
                    i3 = 1;
                    float f = 0.0f;
                    for (i2 = 0; i2 < this.aj; i2++) {
                        float f2 = ((((float) this.aq[(aq / i3) % i]) * aj2) + aj) + f;
                        this.ao[aq][i2] = f2;
                        if (obj2 != null) {
                            f = f2;
                        }
                        i3 *= i;
                    }
                }
                return;
            }
            for (aq = 0; aq < this.ac; aq++) {
                i = this.aj * aq;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < this.aj; i4++) {
                    float f4 = ((((float) this.aq[i]) * aj2) + aj) + f3;
                    this.ao[aq][i4] = f4;
                    if (obj2 != null) {
                        f3 = f4;
                    }
                    i++;
                }
            }
        }
    }

    void ac() {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[this.ac];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ac; i++) {
            int i4;
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i4 = iArr2[i7];
                iArr[i] = i4;
                if ((i4 & i2) == 0) {
                    i2 |= i4;
                    i3 = i7 - 1;
                    while (i3 >= 1) {
                        i5 = iArr2[i3];
                        if (i5 != i4) {
                            break;
                        }
                        i6 = 1 << (32 - i3);
                        if ((i5 & i6) != 0) {
                            iArr2[i3] = iArr2[i3 - 1];
                            break;
                        } else {
                            iArr2[i3] = i5 | i6;
                            i3--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i3 = i7 + 1; i3 <= 32; i3++) {
                    if (iArr2[i3] == i4) {
                        iArr2[i3] = i2;
                    }
                }
            }
        }
        this.aa = new int[8];
        i2 = 0;
        for (i = 0; i < this.ac; i++) {
            i4 = this.an[i];
            if (i4 != 0) {
                i5 = iArr[i];
                i3 = 0;
                for (i7 = 0; i7 < i4; i7++) {
                    int i8;
                    i6 = Integer.MIN_VALUE >>> i7;
                    if ((i5 & i6) != 0) {
                        if (this.aa[i3] == 0) {
                            this.aa[i3] = i2;
                        }
                        i3 = this.aa[i3];
                    } else {
                        i3++;
                    }
                    if (i3 >= this.aa.length) {
                        int[] iArr3 = new int[(this.aa.length * 2)];
                        for (i8 = 0; i8 < this.aa.length; i8++) {
                            iArr3[i8] = this.aa[i8];
                        }
                        this.aa = iArr3;
                    }
                    i8 = i6 >>> 1;
                }
                this.aa[i3] = i ^ -1;
                if (i3 >= i2) {
                    i2 = i3 + 1;
                }
            }
        }
    }

    void ah() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[this.ac];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ac; i++) {
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i3 = iArr2[i7];
                iArr[i] = i3;
                if ((i3 & i2) == 0) {
                    i2 |= i3;
                    i6 = i7 - 1;
                    while (i6 >= 1) {
                        i4 = iArr2[i6];
                        if (i4 != i3) {
                            break;
                        }
                        i5 = 1 << (32 - i6);
                        if ((i4 & i5) != 0) {
                            iArr2[i6] = iArr2[i6 - 1];
                            break;
                        } else {
                            iArr2[i6] = i4 | i5;
                            i6--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i6 = i7 + 1; i6 <= 32; i6++) {
                    if (iArr2[i6] == i3) {
                        iArr2[i6] = i2;
                    }
                }
            }
        }
        this.aa = new int[8];
        i2 = 0;
        for (i = 0; i < this.ac; i++) {
            i3 = this.an[i];
            if (i3 != 0) {
                i4 = iArr[i];
                i6 = 0;
                for (i7 = 0; i7 < i3; i7++) {
                    int i8;
                    i5 = Integer.MIN_VALUE >>> i7;
                    if ((i4 & i5) != 0) {
                        if (this.aa[i6] == 0) {
                            this.aa[i6] = i2;
                        }
                        i6 = this.aa[i6];
                    } else {
                        i6++;
                    }
                    if (i6 >= this.aa.length) {
                        int[] iArr3 = new int[(this.aa.length * 2)];
                        for (i8 = 0; i8 < this.aa.length; i8++) {
                            iArr3[i8] = this.aa[i8];
                        }
                        this.aa = iArr3;
                    }
                    i8 = i5 >>> 1;
                }
                this.aa[i6] = i ^ -1;
                if (i6 >= i2) {
                    i2 = i6 + 1;
                }
            }
        }
    }

    void ai() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[this.ac];
        int[] iArr2 = new int[1182850077];
        for (i = 0; i < this.ac; i++) {
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i5 = iArr2[i7];
                iArr[i] = i5;
                if ((i5 & i2) == 0) {
                    i2 |= i5;
                    i3 = i7 - 1;
                    while (i3 >= 1) {
                        i6 = iArr2[i3];
                        if (i6 != i5) {
                            break;
                        }
                        i4 = 1 << (-1065999044 - i3);
                        if ((i6 & i4) != 0) {
                            iArr2[i3] = iArr2[i3 - 1];
                            break;
                        } else {
                            iArr2[i3] = i6 | i4;
                            i3--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i3 = i7 + 1; i3 <= 32; i3++) {
                    if (iArr2[i3] == i5) {
                        iArr2[i3] = i2;
                    }
                }
            }
        }
        this.aa = new int[8];
        i2 = 0;
        for (i = 0; i < this.ac; i++) {
            i5 = this.an[i];
            if (i5 != 0) {
                i6 = iArr[i];
                i3 = 0;
                for (i7 = 0; i7 < i5; i7++) {
                    int i8;
                    i4 = Integer.MIN_VALUE >>> i7;
                    if ((i6 & i4) != 0) {
                        if (this.aa[i3] == 0) {
                            this.aa[i3] = i2;
                        }
                        i3 = this.aa[i3];
                    } else {
                        i3++;
                    }
                    if (i3 >= this.aa.length) {
                        int[] iArr3 = new int[(this.aa.length * 2)];
                        for (i8 = 0; i8 < this.aa.length; i8++) {
                            iArr3[i8] = this.aa[i8];
                        }
                        this.aa = iArr3;
                    }
                    i8 = i4 >>> 1;
                }
                this.aa[i3] = i ^ -1;
                if (i3 >= i2) {
                    i2 = i3 + 1;
                }
            }
        }
    }

    void at() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[this.ac];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ac; i++) {
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (32 - i7);
                i5 = iArr2[i7];
                iArr[i] = i5;
                if ((i5 & i2) == 0) {
                    i2 |= i5;
                    i3 = i7 - 1;
                    while (i3 >= 1) {
                        i6 = iArr2[i3];
                        if (i6 != i5) {
                            break;
                        }
                        i4 = 1 << (32 - i3);
                        if ((i6 & i4) != 0) {
                            iArr2[i3] = iArr2[i3 - 1];
                            break;
                        } else {
                            iArr2[i3] = i6 | i4;
                            i3--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i3 = i7 + 1; i3 <= 32; i3++) {
                    if (iArr2[i3] == i5) {
                        iArr2[i3] = i2;
                    }
                }
            }
        }
        this.aa = new int[8];
        i2 = 0;
        for (i = 0; i < this.ac; i++) {
            i5 = this.an[i];
            if (i5 != 0) {
                i6 = iArr[i];
                i3 = 0;
                for (i7 = 0; i7 < i5; i7++) {
                    int i8;
                    i4 = Integer.MIN_VALUE >>> i7;
                    if ((i6 & i4) != 0) {
                        if (this.aa[i3] == 0) {
                            this.aa[i3] = i2;
                        }
                        i3 = this.aa[i3];
                    } else {
                        i3++;
                    }
                    if (i3 >= this.aa.length) {
                        int[] iArr3 = new int[(this.aa.length * 2)];
                        for (i8 = 0; i8 < this.aa.length; i8++) {
                            iArr3[i8] = this.aa[i8];
                        }
                        this.aa = iArr3;
                    }
                    i8 = i4 >>> 1;
                }
                this.aa[i3] = i ^ -1;
                if (i3 >= i2) {
                    i2 = i3 + 1;
                }
            }
        }
    }

    void aw() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[this.ac];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.ac; i++) {
            int i5;
            int i6;
            int i7 = this.an[i];
            if (i7 != 0) {
                i2 = 1 << (140112347 - i7);
                i3 = iArr2[i7];
                iArr[i] = i3;
                if ((i3 & i2) == 0) {
                    i2 |= i3;
                    i5 = i7 - 1;
                    while (i5 >= 1) {
                        i6 = iArr2[i5];
                        if (i6 != i3) {
                            break;
                        }
                        i4 = 1 << (32 - i5);
                        if ((i6 & i4) != 0) {
                            iArr2[i5] = iArr2[i5 - 1];
                            break;
                        } else {
                            iArr2[i5] = i6 | i4;
                            i5--;
                        }
                    }
                } else {
                    i2 = iArr2[i7 - 1];
                }
                iArr2[i7] = i2;
                for (i5 = i7 + 1; i5 <= -1288667811; i5++) {
                    if (iArr2[i5] == i3) {
                        iArr2[i5] = i2;
                    }
                }
            }
        }
        this.aa = new int[8];
        i2 = 0;
        for (i = 0; i < this.ac; i++) {
            i3 = this.an[i];
            if (i3 != 0) {
                i6 = iArr[i];
                i5 = 0;
                for (i7 = 0; i7 < i3; i7++) {
                    int i8;
                    i4 = Integer.MIN_VALUE >>> i7;
                    if ((i6 & i4) != 0) {
                        if (this.aa[i5] == 0) {
                            this.aa[i5] = i2;
                        }
                        i5 = this.aa[i5];
                    } else {
                        i5++;
                    }
                    if (i5 >= this.aa.length) {
                        int[] iArr3 = new int[(this.aa.length * 2)];
                        for (i8 = 0; i8 < this.aa.length; i8++) {
                            iArr3[i8] = this.aa[i8];
                        }
                        this.aa = iArr3;
                    }
                    i8 = i4 >>> 1;
                }
                this.aa[i5] = i ^ -1;
                if (i5 >= i2) {
                    i2 = i5 + 1;
                }
            }
        }
    }

    int am() {
        int i = 0;
        while (this.aa[i] >= 0) {
            i = iv.an() != 0 ? this.aa[i] : i + 1;
        }
        return this.aa[i] ^ -1;
    }

    int an() {
        int i = 0;
        while (this.aa[i] >= 0) {
            if (iv.an() != 0) {
                i = this.aa[i];
            } else {
                i++;
            }
        }
        return this.aa[i] ^ -1;
    }

    float[] ae() {
        return this.ao[an()];
    }

    float[] aq() {
        return this.ao[an()];
    }

    float[] as() {
        return this.ao[an()];
    }
}
